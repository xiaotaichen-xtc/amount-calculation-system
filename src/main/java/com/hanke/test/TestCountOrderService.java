package com.hanke.test;

import com.hanke.common.Constant;
import com.hanke.pojo.vo.request.OrderVO;
import com.hanke.service.CountOrderService;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/** 测试服务类
 * Author: XiaoTaiChen
 * Date: 2023/3/22 15:44
 */
public class TestCountOrderService {
	public static void main(String[] args) {
		//1状态表示减价
		int reduceMoney = Constant.ONE_VALUE;

		List<OrderVO> orderList = getPackageList();
		if(CollectionUtils.isEmpty(orderList)){
			throw new RuntimeException(Constant.PARAMETER_VERIFICATION_ERROR);
		}

		System.out.println(Constant.DESCRIBE + CountOrderService.add(orderList,reduceMoney));
	}


	/**
	 * 请求参数封装
	 * @return List<OrderVO> 返回参数
	 */
	private static List<OrderVO> getPackageList(){
		List<OrderVO> orderList = new ArrayList();
		OrderVO orderOneVO = new OrderVO();
		orderOneVO.setConsumerUserName(Constant.USER_NAME_A);
		orderOneVO.setFruitName(Constant.FRUIT_APPLE);
		orderOneVO.setJin(Constant.ONE_VALUE);
		orderOneVO.setPrice(Constant.PRICE_EIGHT);
		orderOneVO.setDisCount(Constant.NOT_DISCOUNT_VALUE);
		orderList.add(orderOneVO);

		OrderVO orderTwoVO = new OrderVO();
		orderTwoVO.setConsumerUserName(Constant.USER_NAME_A);
		orderTwoVO.setFruitName(Constant.FRUIT_STRAWBERRY);
		orderTwoVO.setJin(Constant.ONE_VALUE);
		orderTwoVO.setPrice(Constant.PRICE_THIRTEEN);
		orderTwoVO.setDisCount(Constant.NOT_DISCOUNT_VALUE);
		orderList.add(orderTwoVO);

		//加芒果
		OrderVO orderThreeVO = new OrderVO();
		orderThreeVO.setConsumerUserName(Constant.USER_NAME_A);
		orderThreeVO.setFruitName(Constant.FRUIT_MANGO);
		orderThreeVO.setPrice(Constant.PRICE_TWENTY);
		orderThreeVO.setJin(Constant.TEN_VALUE);
		orderList.add(orderThreeVO);
		orderThreeVO.setDisCount(Constant.NOT_DISCOUNT_VALUE);
		return orderList;
	}
}
