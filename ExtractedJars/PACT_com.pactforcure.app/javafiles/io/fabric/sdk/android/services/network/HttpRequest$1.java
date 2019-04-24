// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import java.security.PrivilegedAction;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequest

static final class HttpRequest$1
	implements PrivilegedAction
{

	public volatile Object run()
	{
		return ((Object) (run()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method String run()>
	//    2    4:areturn         
	}

	public String run()
	{
		return System.setProperty(val$name, val$value);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String val$name>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field String val$value>
	//    4    8:invokestatic    #33  <Method String System.setProperty(String, String)>
	//    5   11:areturn         
	}

	final String val$name;
	final String val$value;

	HttpRequest$1(String s, String s1)
	{
		val$name = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field String val$name>
		val$value = s1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$value>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
