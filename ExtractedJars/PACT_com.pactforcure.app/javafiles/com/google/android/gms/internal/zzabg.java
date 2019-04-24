// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzacu

public abstract class zzabg
{

	public static ExecutorService zzvR()
	{
		return zzaAN;
	//    0    0:getstatic       #35  <Field ExecutorService zzaAN>
	//    1    3:areturn         
	}

	private static final ExecutorService zzaAN;

	static 
	{
		zzaAN = ((ExecutorService) (new ThreadPoolExecutor(0, 4, 60L, TimeUnit.SECONDS, ((java.util.concurrent.BlockingQueue) (new LinkedBlockingQueue())), ((java.util.concurrent.ThreadFactory) (new zzacu("GAC_Transform"))))));
	//    0    0:new             #10  <Class ThreadPoolExecutor>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:iconst_4        
	//    4    6:ldc2w           #11  <Long 60L>
	//    5    9:getstatic       #18  <Field TimeUnit TimeUnit.SECONDS>
	//    6   12:new             #20  <Class LinkedBlockingQueue>
	//    7   15:dup             
	//    8   16:invokespecial   #23  <Method void LinkedBlockingQueue()>
	//    9   19:new             #25  <Class zzacu>
	//   10   22:dup             
	//   11   23:ldc1            #27  <String "GAC_Transform">
	//   12   25:invokespecial   #30  <Method void zzacu(String)>
	//   13   28:invokespecial   #33  <Method void ThreadPoolExecutor(int, int, long, TimeUnit, java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory)>
	//   14   31:putstatic       #35  <Field ExecutorService zzaAN>
	//*  15   34:return          
	}
}
