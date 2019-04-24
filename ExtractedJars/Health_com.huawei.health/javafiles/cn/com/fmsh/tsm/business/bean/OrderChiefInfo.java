// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.tsm.business.enums.EnumBusinessOrderType;
import cn.com.fmsh.tsm.business.enums.EnumOrderStatus;

public class OrderChiefInfo
{

	public OrderChiefInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public int getAmount()
	{
		return amount;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int amount>
	//    2    4:ireturn         
	}

	public byte[] getOrder()
	{
		return order;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field byte[] order>
	//    2    4:areturn         
	}

	public EnumOrderStatus getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field EnumOrderStatus state>
	//    2    4:areturn         
	}

	public EnumBusinessOrderType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field EnumBusinessOrderType type>
	//    2    4:areturn         
	}

	public void setAmount(int i)
	{
		amount = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int amount>
	//    3    5:return          
	}

	public void setOrder(byte abyte0[])
	{
		order = abyte0;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field byte[] order>
	//    3    5:return          
	}

	public void setState(EnumOrderStatus enumorderstatus)
	{
		state = enumorderstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field EnumOrderStatus state>
	//    3    5:return          
	}

	public void setType(EnumBusinessOrderType enumbusinessordertype)
	{
		type = enumbusinessordertype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field EnumBusinessOrderType type>
	//    3    5:return          
	}

	private int amount;
	private byte order[];
	private EnumOrderStatus state;
	private EnumBusinessOrderType type;
}
