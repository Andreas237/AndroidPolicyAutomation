// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hwCloudJs.service.jsapi.network;

import com.huawei.hwCloudJs.service.jsmsg.NativeMsg;

public class NetworkChangeMsg extends NativeMsg
{

	public NetworkChangeMsg()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void NativeMsg()>
	//    2    4:return          
	}

	public String getNetworkType()
	{
		return networkType;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field String networkType>
	//    2    4:areturn         
	}

	public void setNetworkType(String s)
	{
		networkType = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field String networkType>
	//    3    5:return          
	}

	private String networkType;
}
