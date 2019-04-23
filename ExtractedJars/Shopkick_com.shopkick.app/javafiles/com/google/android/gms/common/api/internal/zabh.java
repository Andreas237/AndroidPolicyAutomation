// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class zabh
{

	public static ExecutorService zabb()
	{
		return zahv;
	//    0    0:getstatic       #24  <Field ExecutorService zahv>
	//    1    3:areturn         
	}

	private static final ExecutorService zahv = Executors.newFixedThreadPool(2, ((java.util.concurrent.ThreadFactory) (new NumberedThreadFactory("GAC_Executor"))));

	static 
	{
	//    0    0:iconst_2        
	//    1    1:new             #10  <Class NumberedThreadFactory>
	//    2    4:dup             
	//    3    5:ldc1            #12  <String "GAC_Executor">
	//    4    7:invokespecial   #16  <Method void NumberedThreadFactory(String)>
	//    5   10:invokestatic    #22  <Method ExecutorService Executors.newFixedThreadPool(int, java.util.concurrent.ThreadFactory)>
	//    6   13:putstatic       #24  <Field ExecutorService zahv>
	//*   7   16:return          
	}
}
