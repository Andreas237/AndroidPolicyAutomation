// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.ndk;

import android.content.res.AssetManager;

// Referenced classes of package com.crashlytics.android.ndk:
//			NativeApi

class JniNativeApi
	implements NativeApi
{

	JniNativeApi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	private native boolean nativeInit(String s, Object obj);

	public boolean initialize(String s, AssetManager assetmanager)
	{
		return nativeInit(s, ((Object) (assetmanager)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method boolean nativeInit(String, Object)>
	//    4    6:ireturn         
	}

	static 
	{
		System.loadLibrary("crashlytics");
	//    0    0:ldc1            #10  <String "crashlytics">
	//    1    2:invokestatic    #16  <Method void System.loadLibrary(String)>
	//*   2    5:return          
	}
}
