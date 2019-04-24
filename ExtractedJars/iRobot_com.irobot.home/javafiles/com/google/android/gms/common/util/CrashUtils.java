// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;

public final class CrashUtils
{

	public CrashUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	public static boolean addDynamiteErrorToDropBox(Context context, Throwable throwable)
	{
		return zza(context, throwable, 0x20000000);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #43  <Int 0x20000000>
	//    3    4:invokestatic    #47  <Method boolean zza(Context, Throwable, int)>
	//    4    7:ireturn         
	}

	private static boolean zza(Context context, Throwable throwable, int i)
	{
		try
		{
			Preconditions.checkNotNull(((Object) (context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #56  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
			Preconditions.checkNotNull(((Object) (throwable)));
	//    3    5:aload_1         
	//    4    6:invokestatic    #56  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:pop             
		}
	//*   6   10:iconst_0        
	//*   7   11:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   8   12:astore_0        
		{
			Log.e("CrashUtils", "Error adding exception to DropBox!", ((Throwable) (context)));
	//    9   13:ldc1            #58  <String "CrashUtils">
	//   10   15:ldc1            #60  <String "Error adding exception to DropBox!">
	//   11   17:aload_0         
	//   12   18:invokestatic    #66  <Method int Log.e(String, String, Throwable)>
	//   13   21:pop             
			return false;
	//   14   22:iconst_0        
	//   15   23:ireturn         
		}
		return false;
	}

	private static final String zzge[] = {
		"android.", "com.android.", "dalvik.", "java.", "javax."
	};
	private static DropBoxManager zzgf;
	private static boolean zzgg = false;
	private static int zzgh = -1;
	private static int zzgi;
	private static int zzgj;

	static 
	{
	//    0    0:iconst_5        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #26  <String "android.">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #28  <String "com.android.">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #30  <String "dalvik.">
	//   13   18:aastore         
	//   14   19:dup             
	//   15   20:iconst_3        
	//   16   21:ldc1            #32  <String "java.">
	//   17   23:aastore         
	//   18   24:dup             
	//   19   25:iconst_4        
	//   20   26:ldc1            #34  <String "javax.">
	//   21   28:aastore         
	//   22   29:putstatic       #36  <Field String[] zzge>
	//*  23   32:return          
	}
}
