// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.tsm.business.enums.EnumOrderStatus;

public class OrderInfo
{

	public OrderInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public byte[] getOrder()
	{
		return order;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field byte[] order>
	//    2    4:areturn         
	}

	public EnumOrderStatus getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field EnumOrderStatus state>
	//    2    4:areturn         
	}

	public String getTn()
	{
		return tn;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String tn>
	//    2    4:areturn         
	}

	public void setOrder(byte abyte0[])
	{
		order = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field byte[] order>
	//    3    5:return          
	}

	public void setState(EnumOrderStatus enumorderstatus)
	{
		state = enumorderstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field EnumOrderStatus state>
	//    3    5:return          
	}

	public void setTn(String s)
	{
		tn = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String tn>
	//    3    5:return          
	}

	private byte order[];
	private EnumOrderStatus state;
	private String tn;
}
