package com.test.cn.test;

/**
 * Created by victory_x on 2016/7/8.
 */
public class AgeTooLargeException extends RuntimeException{

		private static final long serialVersionUID = 1L;

		public AgeTooLargeException() {
			// TODO Auto-generated constructor stub
		}

		public AgeTooLargeException(String msg) {
			super(msg);
		}

}
