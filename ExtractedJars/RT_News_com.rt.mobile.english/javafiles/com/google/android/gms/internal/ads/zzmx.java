// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

final class zzmx
	implements Callable
{

	zzmx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final Object call()
		throws Exception
	{
		return ((Object) (Boolean.valueOf("mounted".equals(((Object) (Environment.getExternalStorageState()))))));
	//    0    0:ldc1            #18  <String "mounted">
	//    1    2:invokestatic    #24  <Method String Environment.getExternalStorageState()>
	//    2    5:invokevirtual   #30  <Method boolean String.equals(Object)>
	//    3    8:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//    4   11:areturn         
	}
}
