// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//			zzadc

public abstract class zzaaw
{

	public static ExecutorService zzwv()
	{
		return zzaCm;
	//    0    0:getstatic       #24  <Field ExecutorService zzaCm>
	//    1    3:areturn         
	}

	private static final ExecutorService zzaCm = Executors.newFixedThreadPool(2, ((java.util.concurrent.ThreadFactory) (new zzadc("GAC_Executor"))));

	static 
	{
	//    0    0:iconst_2        
	//    1    1:new             #10  <Class zzadc>
	//    2    4:dup             
	//    3    5:ldc1            #12  <String "GAC_Executor">
	//    4    7:invokespecial   #16  <Method void zzadc(String)>
	//    5   10:invokestatic    #22  <Method ExecutorService Executors.newFixedThreadPool(int, java.util.concurrent.ThreadFactory)>
	//    6   13:putstatic       #24  <Field ExecutorService zzaCm>
	//*   7   16:return          
	}
}
