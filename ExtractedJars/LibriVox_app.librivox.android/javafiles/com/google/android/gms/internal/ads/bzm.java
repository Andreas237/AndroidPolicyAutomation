// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Environment;
import java.util.concurrent.Callable;

final class bzm
	implements Callable
{

	bzm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public final Object call()
	{
		return ((Object) (Boolean.valueOf("mounted".equals(((Object) (Environment.getExternalStorageState()))))));
	//    0    0:ldc1            #15  <String "mounted">
	//    1    2:invokestatic    #21  <Method String Environment.getExternalStorageState()>
	//    2    5:invokevirtual   #27  <Method boolean String.equals(Object)>
	//    3    8:invokestatic    #33  <Method Boolean Boolean.valueOf(boolean)>
	//    4   11:areturn         
	}
}
