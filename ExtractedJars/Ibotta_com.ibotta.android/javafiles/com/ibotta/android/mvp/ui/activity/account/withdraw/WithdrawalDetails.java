// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;


public class WithdrawalDetails
{

	public WithdrawalDetails()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public float getAmount()
	{
		return amount;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float amount>
	//    2    4:freturn         
	}

	public String getMethod()
	{
		return method;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String method>
	//    2    4:areturn         
	}

	public String getMethodImg()
	{
		return methodImg;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field String methodImg>
	//    2    4:areturn         
	}

	public void setAmount(float f)
	{
		amount = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #19  <Field float amount>
	//    3    5:return          
	}

	public void setMethod(String s)
	{
		method = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field String method>
	//    3    5:return          
	}

	public void setMethodImg(String s)
	{
		methodImg = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field String methodImg>
	//    3    5:return          
	}

	float amount;
	String method;
	String methodImg;
}
