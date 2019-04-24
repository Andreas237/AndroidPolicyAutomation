// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android.a;

import android.content.Context;
import android.support.v7.ae;
import com.startapp.common.a.c;

public final class h
{

	public static final boolean a(Context context, String s)
	{
		ae.b(((Object) (context)), "$receiver");
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <String "$receiver">
	//    2    3:invokestatic    #15  <Method void ae.b(Object, String)>
		ae.b(((Object) (s)), "permission");
	//    3    6:aload_1         
	//    4    7:ldc1            #17  <String "permission">
	//    5    9:invokestatic    #15  <Method void ae.b(Object, String)>
		return c.a(context, s);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #21  <Method boolean c.a(Context, String)>
	//    9   17:ireturn         
	}
}
