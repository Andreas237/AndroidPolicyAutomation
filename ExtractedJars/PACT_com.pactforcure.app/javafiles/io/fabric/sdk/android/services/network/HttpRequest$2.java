// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.security.PrivilegedAction;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

static final class HttpRequest$2
	implements PrivilegedAction
{

	public volatile Object run()
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method String run()>
	//    2    4:areturn         
	}

	public String run()
	{
		return System.clearProperty(val$name);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String val$name>
	//    2    4:invokestatic    #33  <Method String System.clearProperty(String)>
	//    3    7:areturn         
	}

	final String val$name;

	HttpRequest$2(String s)
	{
		val$name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field String val$name>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
