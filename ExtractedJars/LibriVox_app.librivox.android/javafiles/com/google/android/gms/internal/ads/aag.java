// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;

public class aag
{

	private static String a(String s)
	{
		StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
	//    0    0:invokestatic    #13  <Method Thread Thread.currentThread()>
	//    1    3:invokevirtual   #17  <Method StackTraceElement[] Thread.getStackTrace()>
	//    2    6:astore_2        
		if(astacktraceelement.length >= 4)
	//*   3    7:aload_2         
	//*   4    8:arraylength     
	//*   5    9:iconst_4        
	//*   6   10:icmplt          62
		{
			int i = astacktraceelement[3].getLineNumber();
	//    7   13:aload_2         
	//    8   14:iconst_3        
	//    9   15:aaload          
	//   10   16:invokevirtual   #23  <Method int StackTraceElement.getLineNumber()>
	//   11   19:istore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 13);
	//   12   20:new             #25  <Class StringBuilder>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokestatic    #31  <Method String String.valueOf(Object)>
	//   16   28:invokevirtual   #34  <Method int String.length()>
	//   17   31:bipush          13
	//   18   33:iadd            
	//   19   34:invokespecial   #38  <Method void StringBuilder(int)>
	//   20   37:astore_2        
			stringbuilder.append(s);
	//   21   38:aload_2         
	//   22   39:aload_0         
	//   23   40:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
			stringbuilder.append(" @");
	//   25   44:aload_2         
	//   26   45:ldc1            #44  <String " @">
	//   27   47:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   28   50:pop             
			stringbuilder.append(i);
	//   29   51:aload_2         
	//   30   52:iload_1         
	//   31   53:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//   32   56:pop             
			return stringbuilder.toString();
	//   33   57:aload_2         
	//   34   58:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   35   61:areturn         
		} else
		{
			return s;
	//   36   62:aload_0         
	//   37   63:areturn         
		}
	}

	public static void a(String s, Throwable throwable)
	{
		if(a(3))
	//*   0    0:iconst_3        
	//*   1    1:invokestatic    #56  <Method boolean a(int)>
	//*   2    4:ifeq            15
			Log.d("Ads", s, throwable);
	//    3    7:ldc1            #58  <String "Ads">
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokestatic    #64  <Method int Log.d(String, String, Throwable)>
	//    7   14:pop             
	//    8   15:return          
	}

	public static boolean a(int i)
	{
		return i >= 5 || Log.isLoggable("Ads", i);
	//    0    0:iload_0         
	//    1    1:iconst_5        
	//    2    2:icmpge          19
	//    3    5:ldc1            #58  <String "Ads">
	//    4    7:iload_0         
	//    5    8:invokestatic    #68  <Method boolean Log.isLoggable(String, int)>
	//    6   11:ifeq            17
	//    7   14:goto            19
	//    8   17:iconst_0        
	//    9   18:ireturn         
	//   10   19:iconst_1        
	//   11   20:ireturn         
	}

	public static void b(String s)
	{
		if(a(3))
	//*   0    0:iconst_3        
	//*   1    1:invokestatic    #56  <Method boolean a(int)>
	//*   2    4:ifeq            14
			Log.d("Ads", s);
	//    3    7:ldc1            #58  <String "Ads">
	//    4    9:aload_0         
	//    5   10:invokestatic    #73  <Method int Log.d(String, String)>
	//    6   13:pop             
	//    7   14:return          
	}

	public static void b(String s, Throwable throwable)
	{
		if(a(6))
	//*   0    0:bipush          6
	//*   1    2:invokestatic    #56  <Method boolean a(int)>
	//*   2    5:ifeq            16
			Log.e("Ads", s, throwable);
	//    3    8:ldc1            #58  <String "Ads">
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokestatic    #76  <Method int Log.e(String, String, Throwable)>
	//    7   15:pop             
	//    8   16:return          
	}

	public static void c(String s)
	{
		if(a(6))
	//*   0    0:bipush          6
	//*   1    2:invokestatic    #56  <Method boolean a(int)>
	//*   2    5:ifeq            15
			Log.e("Ads", s);
	//    3    8:ldc1            #58  <String "Ads">
	//    4   10:aload_0         
	//    5   11:invokestatic    #79  <Method int Log.e(String, String)>
	//    6   14:pop             
	//    7   15:return          
	}

	public static void c(String s, Throwable throwable)
	{
		if(a(5))
	//*   0    0:iconst_5        
	//*   1    1:invokestatic    #56  <Method boolean a(int)>
	//*   2    4:ifeq            15
			Log.w("Ads", s, throwable);
	//    3    7:ldc1            #58  <String "Ads">
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokestatic    #82  <Method int Log.w(String, String, Throwable)>
	//    7   14:pop             
	//    8   15:return          
	}

	public static void d(String s)
	{
		if(a(4))
	//*   0    0:iconst_4        
	//*   1    1:invokestatic    #56  <Method boolean a(int)>
	//*   2    4:ifeq            14
			Log.i("Ads", s);
	//    3    7:ldc1            #58  <String "Ads">
	//    4    9:aload_0         
	//    5   10:invokestatic    #85  <Method int Log.i(String, String)>
	//    6   13:pop             
	//    7   14:return          
	}

	public static void d(String s, Throwable throwable)
	{
		if(a(5))
	//*   0    0:iconst_5        
	//*   1    1:invokestatic    #56  <Method boolean a(int)>
	//*   2    4:ifeq            27
		{
			if(throwable != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          20
			{
				c(a(s), throwable);
	//    5   11:aload_0         
	//    6   12:invokestatic    #87  <Method String a(String)>
	//    7   15:aload_1         
	//    8   16:invokestatic    #89  <Method void c(String, Throwable)>
				return;
	//    9   19:return          
			}
			e(a(s));
	//   10   20:aload_0         
	//   11   21:invokestatic    #87  <Method String a(String)>
	//   12   24:invokestatic    #91  <Method void e(String)>
		}
	//   13   27:return          
	}

	public static void e(String s)
	{
		if(a(5))
	//*   0    0:iconst_5        
	//*   1    1:invokestatic    #56  <Method boolean a(int)>
	//*   2    4:ifeq            14
			Log.w("Ads", s);
	//    3    7:ldc1            #58  <String "Ads">
	//    4    9:aload_0         
	//    5   10:invokestatic    #93  <Method int Log.w(String, String)>
	//    6   13:pop             
	//    7   14:return          
	}

	public static void f(String s)
	{
		d(s, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #96  <Method void d(String, Throwable)>
	//    3    5:return          
	}
}
