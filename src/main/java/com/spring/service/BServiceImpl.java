package com.spring.service;

// 使用cglib
public class BServiceImpl implements BService{

	@Override
	public void barB(String _msg, int _type) {
		System.out.println("BServiceImpl.barB(msg:" + _msg + " type:" + _type + ")");
		if (_type == 1)
			throw new IllegalArgumentException("测试异常");
	}

	@Override
	public void fooB() {
		System.out.println("BServiceImpl.fooB()");
	}

}