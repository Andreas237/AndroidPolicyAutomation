// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.beans.base.RspBean;

public class ParamFromServer extends RspBean
{

	public ParamFromServer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void RspBean()>
	//    2    4:return          
	}

	public String getA__()
	{
		return a__;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String a__>
	//    2    4:areturn         
	}

	public String getSig__()
	{
		return sig__;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String sig__>
	//    2    4:areturn         
	}

	public String getT__()
	{
		return t__;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String t__>
	//    2    4:areturn         
	}

	public void setA__(String s)
	{
		a__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String a__>
	//    3    5:return          
	}

	public void setSig__(String s)
	{
		sig__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String sig__>
	//    3    5:return          
	}

	public void setT__(String s)
	{
		t__ = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String t__>
	//    3    5:return          
	}

	private String a__;
	private String sig__;
	private String t__;
}
