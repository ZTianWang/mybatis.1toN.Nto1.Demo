package com.wnwn.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wnwn.mapper.OrderInfoMapper;
import com.wnwn.mapper.UserInfoMapper;
import com.wnwn.po.OrderInfo;
import com.wnwn.po.UserInfo;
import com.wnwn.utils.DBFactory;

public class SelectTest {

	SqlSession sqlSession = null;
	UserInfoMapper userMapper = null;
	OrderInfoMapper orderMapper = null;
	
	@Before
	public void testBefore() {
		sqlSession = DBFactory.getSqlSession();
		userMapper = sqlSession.getMapper(UserInfoMapper.class);
		orderMapper = sqlSession.getMapper(OrderInfoMapper.class);
	}
	
	@After
	public void testAfter() {
		sqlSession.close();
	}
	
	@Test
	public void selsctOrder() {
		List<OrderInfo> list = orderMapper.selectOrder();
		for (OrderInfo order : list) {
			System.out.println(order);
		}
	}
	
	@Test
	public void selsctUser() {
		UserInfo userInfo = userMapper.selectUser(2);
		System.out.println(userInfo);
		List<OrderInfo> orderlist = userInfo.getOrderList();
		for (OrderInfo orderInfo : orderlist) {
			System.out.println(orderInfo);
		}
	}
	
}
