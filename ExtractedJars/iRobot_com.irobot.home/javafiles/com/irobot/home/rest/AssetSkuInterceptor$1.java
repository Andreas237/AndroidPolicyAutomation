// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.rest;

import java.net.URI;
import org.c.c.*;

// Referenced classes of package com.irobot.home.rest:
//			AssetSkuInterceptor

class AssetSkuInterceptor$1
	implements h
{

	public c getHeaders()
	{
		return AssetSkuInterceptor.access$000(AssetSkuInterceptor.this);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AssetSkuInterceptor this$0>
	//    2    4:invokestatic    #31  <Method c AssetSkuInterceptor.access$000(AssetSkuInterceptor)>
	//    3    7:areturn         
	}

	public f getMethod()
	{
		return f.GET;
	//    0    0:getstatic       #39  <Field f f.GET>
	//    1    3:areturn         
	}

	public URI getURI()
	{
		return val$uri;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field URI val$uri>
	//    2    4:areturn         
	}

	final AssetSkuInterceptor this$0;
	final URI val$uri;

	AssetSkuInterceptor$1()
	{
		this$0 = final_assetskuinterceptor;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AssetSkuInterceptor this$0>
		val$uri = URI.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field URI val$uri>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
