// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			NativeProtocol

private static class NativeProtocol$MessengerAppInfo extends NativeProtocol.NativeAppInfo
{

	protected String getPackage()
	{
		return "com.facebook.orca";
	//    0    0:ldc1            #11  <String "com.facebook.orca">
	//    1    2:areturn         
	}

	static final String MESSENGER_PACKAGE = "com.facebook.orca";

	private NativeProtocol$MessengerAppInfo()
	{
		super(((NativeProtocol._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #16  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
	//    3    5:return          
	}

	NativeProtocol$MessengerAppInfo(NativeProtocol._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void NativeProtocol$MessengerAppInfo()>
	//    2    4:return          
	}
}
