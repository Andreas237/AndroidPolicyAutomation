// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hwCloudJs.service.jsapi;

import com.huawei.hwCloudJs.service.jsmsg.NativeMsg;

// Referenced classes of package com.huawei.hwCloudJs.service.jsapi:
//			JsCoreApi

public static final class JsCoreApi$ChannelMessageReq extends NativeMsg
{

	public String getChannelName()
	{
		return channelName;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String channelName>
	//    2    4:areturn         
	}

	public String getData()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String data>
	//    2    4:areturn         
	}

	public String getOrigin()
	{
		return origin;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String origin>
	//    2    4:areturn         
	}

	public String getSource()
	{
		return source;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String source>
	//    2    4:areturn         
	}

	public void setChannelName(String s)
	{
		channelName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String channelName>
	//    3    5:return          
	}

	public void setData(String s)
	{
		data = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field String data>
	//    3    5:return          
	}

	public void setOrigin(String s)
	{
		origin = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field String origin>
	//    3    5:return          
	}

	public void setSource(String s)
	{
		source = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String source>
	//    3    5:return          
	}

	private String channelName;
	private String data;
	private String origin;
	private String source;

	public JsCoreApi$ChannelMessageReq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void NativeMsg()>
	//    2    4:return          
	}
}
