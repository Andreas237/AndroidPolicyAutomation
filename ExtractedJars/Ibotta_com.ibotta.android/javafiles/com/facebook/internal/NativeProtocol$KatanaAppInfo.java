// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			NativeProtocol

private static class NativeProtocol$KatanaAppInfo extends NativeProtocol$NativeAppInfo
{

	protected String getLoginActivity()
	{
		return "com.facebook.katana.ProxyAuth";
	//    0    0:ldc1            #19  <String "com.facebook.katana.ProxyAuth">
	//    1    2:areturn         
	}

	protected String getPackage()
	{
		return "com.facebook.katana";
	//    0    0:ldc1            #22  <String "com.facebook.katana">
	//    1    2:areturn         
	}

	private NativeProtocol$KatanaAppInfo()
	{
		super(((NativeProtocol._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #12  <Method void NativeProtocol$NativeAppInfo(NativeProtocol$1)>
	//    3    5:return          
	}

	NativeProtocol$KatanaAppInfo(NativeProtocol._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void NativeProtocol$KatanaAppInfo()>
	//    2    4:return          
	}
}
