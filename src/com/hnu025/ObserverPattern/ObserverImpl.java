package com.hnu025.ObserverPattern;

public class ObserverImpl implements Observer{

	@Override
	public void watch(Thing t) {
		System.out.println("��Ʒ���ͱ仯~~"+"�۸�"+t.getPrice()+"���֣�"+t.getName());
	}

}
