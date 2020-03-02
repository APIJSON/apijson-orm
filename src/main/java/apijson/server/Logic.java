/*Copyright ©2016 TommyLemon(https://github.com/TommyLemon/APIJSON)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package apijson.server;

import apijson.StringUtil;

/**& | !逻辑
 * @author Lemon
 */
public class Logic {

	public static final int TYPE_OR = 0;
	public static final int TYPE_AND = 1;
	public static final int TYPE_NOT = 2;
	public static final int[] TYPES = {TYPE_OR, TYPE_AND, TYPE_NOT};

	public static final String CHAR_OR = "|";
	public static final String CHAR_AND = "&";
	public static final String CHAR_NOT = "!";
	public static final String[] CHARS = {CHAR_OR, CHAR_AND, CHAR_NOT};

	public static final String NAME_OR = "OR";
	public static final String NAME_AND = "AND";
	public static final String NAME_NOT = "NOT";
	public static final String[] NAMES = {NAME_OR, NAME_AND, NAME_NOT};


	private int type;
	private String key;

	public Logic() {
		super();
	}

	public Logic(int type) {
		this();
		this.type = type;
	}
	public Logic(String key) {
		key = StringUtil.getString(key);

		int type = getType(key.isEmpty() ? "" : key.substring(key.length() - 1));

		if (type >= 0 && type <= 2) {
			key = key.substring(0, key.length() - 1);
		}
		if (type < 0) {
			type = 0;
		}


		setType(type);
		setKey(key);
	}


	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}


	public boolean isOr() {
		return isOr(type);
	}
	public static boolean isOr(int type) {
		return type == TYPE_OR;
	}
	public boolean isAnd() {
		return isAnd(type);
	}
	public static boolean isAnd(int type) {
		return type == TYPE_AND;
	}
	public boolean isNot() {
		return isNot(type);
	}
	public static boolean isNot(int type) {
		return type == TYPE_NOT;
	}
	
	public boolean isCorrect() {
		return isContain(getType());
	}
	public static boolean isContain(String s) {
		return isContain(getType(s));
	}
	public static boolean isContain(int type) {
		return type >= TYPE_OR && type <= TYPE_NOT;
	}

	public static int getType(char logicChar) {
		return getType(String.valueOf(logicChar));
	}
	public static int getType(String logicChar) {
		int type = -1;
		if (logicChar != null && logicChar.length() == 1) {
			if ("|".equals(logicChar)) {
				type = 0;
			} else if ("&".equals(logicChar)) {
				type = 1;
			} else if ("!".equals(logicChar)) {
				type = 2;
			}
		}
		return type;
	}

	public String getChar() {
		return getChar(type);
	}
	public static String getChar(int type) {
		return type < 0 || type >= CHARS.length ? "" : CHARS[type];
	}

	public String getName() {
		return getName(type);
	}
	public static String getName(int type) {
		return type < 0 || type >= NAMES.length ? "" : NAMES[type];
	}

}
