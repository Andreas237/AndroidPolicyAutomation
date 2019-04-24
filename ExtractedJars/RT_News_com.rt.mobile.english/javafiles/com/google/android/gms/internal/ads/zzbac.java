// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


final class zzbac
{

	static boolean zzabb()
	{
		return zzdpj != null && !zzdpk;
	//    0    0:getstatic       #19  <Field Class zzdpj>
	//    1    3:ifnull          14
	//    2    6:getstatic       #23  <Field boolean zzdpk>
	//    3    9:ifne            14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	static Class zzabc()
	{
		return zzdpj;
	//    0    0:getstatic       #19  <Field Class zzdpj>
	//    1    3:areturn         
	}

	private static Class zzel(String s)
	{
		try
		{
			s = ((String) (Class.forName(s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #37  <Method Class Class.forName(String)>
	//    2    4:astore_0        
		}
	//*   3    5:aload_0         
	//*   4    6:areturn         
	//*   5    7:aconst_null     
	//*   6    8:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			return null;
		}
		return ((Class) (s));
	//*   7    9:astore_0        
	//*   8   10:goto            7
	}

	private static final Class zzdpj = zzel("libcore.io.Memory");
	private static final boolean zzdpk;

	static 
	{
	//    0    0:ldc1            #13  <String "libcore.io.Memory">
	//    1    2:invokestatic    #17  <Method Class zzel(String)>
	//    2    5:putstatic       #19  <Field Class zzdpj>
		boolean flag;
		if(zzel("org.robolectric.Robolectric") != null)
	//*   3    8:ldc1            #21  <String "org.robolectric.Robolectric">
	//*   4   10:invokestatic    #17  <Method Class zzel(String)>
	//*   5   13:ifnull          21
			flag = true;
	//    6   16:iconst_1        
	//    7   17:istore_0        
		else
	//*   8   18:goto            23
			flag = false;
	//    9   21:iconst_0        
	//   10   22:istore_0        
		zzdpk = flag;
	//   11   23:iload_0         
	//   12   24:putstatic       #23  <Field boolean zzdpk>
	//*  13   27:return          
	}
}
