package com.hanke.service;


import com.hanke.common.Constant;
import com.hanke.pojo.vo.request.OrderVO;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/** 计算总金额服务类
 * Author: XiaoTaiChen
 * Date: 2023/3/22 15:38
 */
public class CountOrderService {


	/**
	 * 计算普通情况下金额
	 *
	 * @param orderListVO 请求参数
	 * @return double 返回参数
	 */
	public static double add(List<OrderVO> orderListVO) {
		if (CollectionUtils.isEmpty(orderListVO)) {
			throw new RuntimeException(Constant.PARAMETER_VERIFICATION_ERROR);
		}


		return getcommon(orderListVO);
	}

	/**
	 * 计算购物满 100 减 10 块金额
	 *
	 * @param orderListVO 请求参数
	 * @param reduceMoney 是否减价
	 * @return double 返回参数
	 */
	public static double add(List<OrderVO> orderListVO, int reduceMoney) {
		if (CollectionUtils.isEmpty(orderListVO) && reduceMoney != Constant.ONE_VALUE) {
			throw new RuntimeException(Constant.PARAMETER_VERIFICATION_ERROR);
		}

		double count = getcommon(orderListVO);
		int countOneHundred = (int) count / Constant.ONE_HUNDRED_VALUE;
		count -= (countOneHundred * Constant.TEN_VALUE);

		return count;
	}

	/**
	 * 计算金额的公共方法
	 * @param orderListVO 请求参数
	 * @return double 返回参数
	 */
	public static double getcommon(List<OrderVO> orderListVO) {

		//计数器
		double count = Constant.INITIALIZATION_VALUE;

		for (OrderVO order : orderListVO) {
			count += order.getJin() * order.getPrice() * order.getDisCount();
		}
		return count;
	}


}
