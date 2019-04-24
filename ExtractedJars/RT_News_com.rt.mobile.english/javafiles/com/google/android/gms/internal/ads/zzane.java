// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;

public class zzane
{

	public static void e(String s)
	{
		if(isLoggable(6))
	//*   0    0:bipush          6
	//*   1    2:invokestatic    #11  <Method boolean isLoggable(int)>
	//*   2    5:ifeq            15
			Log.e("Ads", s);
	//    3    8:ldc1            #13  <String "Ads">
	//    4   10:aload_0         
	//    5   11:invokestatic    #18  <Method int Log.e(String, String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public static boolean isLoggable(int i)
	{
		return i >= 5 || Log.isLoggable("Ads", i);
	//    0    0:iload_0         
	//    1    1:iconst_5        
	//    2    2:icmpge          19
	//    3    5:ldc1            #13  <String "Ads">
	//    4    7:iload_0         
	//    5    8:invokestatic    #22  <Method boolean Log.isLoggable(String, int)>
	//    6   11:ifeq            17
	//    7   14:goto            19
	//    8   17:iconst_0        
	//    9   18:ireturn         
	//   10   19:iconst_1        
	//   11   20:ireturn         
	}

	public static void zza(String s, Throwable throwable)
	{
		if(isLoggable(3))
	//*   0    0:iconst_3        
	//*   1    1:invokestatic    #11  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            15
			Log.d("Ads", s, throwable);
	//    3    7:ldc1            #13  <String "Ads">
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokestatic    #28  <Method int Log.d(String, String, Throwable)>
	//    7   14:pop             
	//    8   15:return          
	}

	public static void zzb(String s, Throwable throwable)
	{
		if(isLoggable(6))
	//*   0    0:bipush          6
	//*   1    2:invokestatic    #11  <Method boolean isLoggable(int)>
	//*   2    5:ifeq            16
			Log.e("Ads", s, throwable);
	//    3    8:ldc1            #13  <String "Ads">
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokestatic    #31  <Method int Log.e(String, String, Throwable)>
	//    7   15:pop             
	//    8   16:return          
	}

	public static void zzc(String s, Throwable throwable)
	{
		if(isLoggable(5))
	//*   0    0:iconst_5        
	//*   1    1:invokestatic    #11  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            15
			Log.w("Ads", s, throwable);
	//    3    7:ldc1            #13  <String "Ads">
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokestatic    #35  <Method int Log.w(String, String, Throwable)>
	//    7   14:pop             
	//    8   15:return          
	}

	public static void zzck(String s)
	{
		if(isLoggable(3))
	//*   0    0:iconst_3        
	//*   1    1:invokestatic    #11  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            14
			Log.d("Ads", s);
	//    3    7:ldc1            #13  <String "Ads">
	//    4    9:aload_0         
	//    5   10:invokestatic    #38  <Method int Log.d(String, String)>
	//    6   13:pop             
	//    7   14:return          
	}

	public static void zzd(String s, Throwable throwable)
	{
		if(isLoggable(5))
	//*   0    0:iconst_5        
	//*   1    1:invokestatic    #11  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            27
		{
			if(throwable != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          20
			{
				zzc(zzdl(s), throwable);
	//    5   11:aload_0         
	//    6   12:invokestatic    #44  <Method String zzdl(String)>
	//    7   15:aload_1         
	//    8   16:invokestatic    #46  <Method void zzc(String, Throwable)>
				return;
	//    9   19:return          
			}
			zzdk(zzdl(s));
	//   10   20:aload_0         
	//   11   21:invokestatic    #44  <Method String zzdl(String)>
	//   12   24:invokestatic    #49  <Method void zzdk(String)>
		}
	//   13   27:return          
	}

	public static void zzdj(String s)
	{
		if(isLoggable(4))
	//*   0    0:iconst_4        
	//*   1    1:invokestatic    #11  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            14
			Log.i("Ads", s);
	//    3    7:ldc1            #13  <String "Ads">
	//    4    9:aload_0         
	//    5   10:invokestatic    #54  <Method int Log.i(String, String)>
	//    6   13:pop             
	//    7   14:return          
	}

	public static void zzdk(String s)
	{
		if(isLoggable(5))
	//*   0    0:iconst_5        
	//*   1    1:invokestatic    #11  <Method boolean isLoggable(int)>
	//*   2    4:ifeq            14
			Log.w("Ads", s);
	//    3    7:ldc1            #13  <String "Ads">
	//    4    9:aload_0         
	//    5   10:invokestatic    #56  <Method int Log.w(String, String)>
	//    6   13:pop             
	//    7   14:return          
	}

	private static String zzdl(String s)
	{
		StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
	//    0    0:invokestatic    #63  <Method Thread Thread.currentThread()>
	//    1    3:invokevirtual   #67  <Method StackTraceElement[] Thread.getStackTrace()>
	//    2    6:astore_3        
		Object obj = ((Object) (s));
	//    3    7:aload_0         
	//    4    8:astore_2        
		if(astacktraceelement.length >= 4)
	//*   5    9:aload_3         
	//*   6   10:arraylength     
	//*   7   11:iconst_4        
	//*   8   12:icmplt          64
		{
			int i = astacktraceelement[3].getLineNumber();
	//    9   15:aload_3         
	//   10   16:iconst_3        
	//   11   17:aaload          
	//   12   18:invokevirtual   #73  <Method int StackTraceElement.getLineNumber()>
	//   13   21:istore_1        
			obj = ((Object) (new StringBuilder(13 + String.valueOf(((Object) (s))).length())));
	//   14   22:new             #75  <Class StringBuilder>
	//   15   25:dup             
	//   16   26:bipush          13
	//   17   28:aload_0         
	//   18   29:invokestatic    #81  <Method String String.valueOf(Object)>
	//   19   32:invokevirtual   #84  <Method int String.length()>
	//   20   35:iadd            
	//   21   36:invokespecial   #88  <Method void StringBuilder(int)>
	//   22   39:astore_2        
			((StringBuilder) (obj)).append(s);
	//   23   40:aload_2         
	//   24   41:aload_0         
	//   25   42:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   26   45:pop             
			((StringBuilder) (obj)).append(" @");
	//   27   46:aload_2         
	//   28   47:ldc1            #94  <String " @">
	//   29   49:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   30   52:pop             
			((StringBuilder) (obj)).append(i);
	//   31   53:aload_2         
	//   32   54:iload_1         
	//   33   55:invokevirtual   #97  <Method StringBuilder StringBuilder.append(int)>
	//   34   58:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   35   59:aload_2         
	//   36   60:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   37   63:astore_2        
		}
		return ((String) (obj));
	//   38   64:aload_2         
	//   39   65:areturn         
	}

	public static void zzdm(String s)
	{
		zzd(s, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #105 <Method void zzd(String, Throwable)>
	//    3    5:return          
	}
}
