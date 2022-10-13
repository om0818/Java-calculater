package com.example.demo.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class CalcService {

	public String calculateAdd(String NumA,String NumB)

	{
		String AdResult = null;
		BigDecimal AdA = null;
		BigDecimal AdB = null;
		try {
			AdA = new BigDecimal(NumA);
			AdB = new BigDecimal(NumB);
			BigDecimal AdR = AdA.add(AdB);
			AdResult = AdR.toString();
			//数字以外が入った時がキャッチ
		} catch (Exception e) {

			AdResult = "数字を入力してください";
		}
		//トライ、キャッチのどっちかで抜けたとき
		return AdResult;


	}
	/**
	 * 引き算
	 */
	public String subtract(String NumC,String NumD)
	{
		String AdResult =null;
		BigDecimal AdA = null; 
		BigDecimal AdB = null;
		try {
			AdA = new BigDecimal(NumC);
			AdB = new BigDecimal(NumD);
			BigDecimal AdR = AdA.subtract(AdB);
			AdResult = AdR.toString();

			//数字以外が入った時がキャッチ
		} catch (Exception e) {

			AdResult = "数字を入力してください";

		}
		//トライ、キャッチのどっちかで抜けたとき
		return AdResult;
	}
	/*
	 * 掛け算
	 */
	public String multiply (String NumE,String NumF)
	{
		String AdResult = null;
		BigDecimal AdA = null;
		BigDecimal AdB = null;
		try {
			AdA = new BigDecimal(NumE);
			AdB = new BigDecimal(NumF);
			BigDecimal AdR = AdA.multiply(AdB);
			AdResult = AdR.toString();

		} catch (Exception e) {

			AdResult = "数字を入力してください";

		}

		return AdResult;
	}
	/**
	 * 割り算
	 */
	public String divide (String NumG,String NumH)
	{
		String AdResult = null;
		BigDecimal AdA = null;
		BigDecimal AdB = null;
		try {
		AdA = new BigDecimal(NumG);
		AdB = new BigDecimal(NumH);
		
			BigDecimal AdR = AdA.divide(AdB);
			AdResult = AdR.toString();


		} catch (Exception e) {
			AdResult = "数字を入力してください";
		}

		return AdResult;

		//return "無限小数の答えになりました";
	}








	//		割り算に関しては特殊なので注意
	//		
	//		ヒントとしてtry、catch構文も記載はしておきます。
	//		
	//		後は調べてね！

	//		try {
	//			BigDecimal AdR = 〇〇.〇〇(AdB);
	//			return AdR.toString();
	//		} catch (Exception e) {
	//			return "無限小数の答えになりました";
	//		}

	/*このコメントアウトは消さない方がいい
	 * これは無限少数の桁を設定する際に必要
	BigDecimal AdR = AdA.divide(AdB,7,RoundingMode.HALF_UP); //BigDecimal 〇〇= 〇〇.add(〇〇); これは足し算を書くとき
	String AdResult = AdR.toString();//toStringはクラスで定義されている文字列表現を返すメソッド
	return AdResult;
	 */

}

