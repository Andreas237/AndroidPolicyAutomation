// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package cn.com.fmsh.tsm.business.bean;

import cn.com.fmsh.tsm.business.enums.EnumAppActivationStatus;
import cn.com.fmsh.tsm.business.enums.EnumBusinessOrderStatus;

public class CardBusinessStatus
{

	public CardBusinessStatus()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public EnumAppActivationStatus getActivationStatus()
	{
		return activationStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field EnumAppActivationStatus activationStatus>
	//    2    4:areturn         
	}

	public EnumBusinessOrderStatus getBusinessOrderStatus()
	{
		return businessOrderStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field EnumBusinessOrderStatus businessOrderStatus>
	//    2    4:areturn         
	}

	public void setActivationStatus(EnumAppActivationStatus enumappactivationstatus)
	{
		activationStatus = enumappactivationstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field EnumAppActivationStatus activationStatus>
	//    3    5:return          
	}

	public void setBusinessOrderStatus(EnumBusinessOrderStatus enumbusinessorderstatus)
	{
		businessOrderStatus = enumbusinessorderstatus;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field EnumBusinessOrderStatus businessOrderStatus>
	//    3    5:return          
	}

	private EnumAppActivationStatus activationStatus;
	private EnumBusinessOrderStatus businessOrderStatus;
}