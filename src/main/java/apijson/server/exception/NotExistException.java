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

package apijson.server.exception;

/**不存在，可接受，内部吃掉
 * @author Lemon
 */
public class NotExistException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NotExistException(String msg) {
		super(msg);
	}
	public NotExistException(Throwable t) {
		super(t);
	}
	public NotExistException(String msg, Throwable t) {
		super(msg, t);
	}

}

