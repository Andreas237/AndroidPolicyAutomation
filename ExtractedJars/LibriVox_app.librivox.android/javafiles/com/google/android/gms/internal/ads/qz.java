// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class qz
{

	static boolean a(Context context, boolean flag)
	{
		return b(context, flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #10  <Method boolean b(Context, boolean)>
	//    3    5:ireturn         
	}

	private static boolean b(Context context, boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		int i = DynamiteModule.b(context, "com.google.android.gms.ads.dynamite");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.ads.dynamite">
	//    6    9:invokestatic    #18  <Method int DynamiteModule.b(Context, String)>
	//    7   12:istore_2        
		if(i == 0)
	//*   8   13:iload_2         
	//*   9   14:ifne            19
			return false;
	//   10   17:iconst_0        
	//   11   18:ireturn         
		return i <= DynamiteModule.a(context, "com.google.android.gms.ads.dynamite");
	//   12   19:iload_2         
	//   13   20:aload_0         
	//   14   21:ldc1            #13  <String "com.google.android.gms.ads.dynamite">
	//   15   23:invokestatic    #20  <Method int DynamiteModule.a(Context, String)>
	//   16   26:icmpgt          31
	//   17   29:iconst_1        
	//   18   30:ireturn         
	//   19   31:iconst_0        
	//   20   32:ireturn         
	}
}
