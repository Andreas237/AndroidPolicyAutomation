// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class zzrp
{

	public zzrp(Context context)
	{
		this(context, Executors.newSingleThreadExecutor());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #32  <Method ExecutorService Executors.newSingleThreadExecutor()>
	//    3    5:invokespecial   #35  <Method void zzrp(Context, ExecutorService)>
	//    4    8:return          
	}

	private zzrp(Context context, ExecutorService executorservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		zzri = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Context zzri>
		zzadl = executorservice;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field ExecutorService zzadl>
	//    8   14:return          
	}

	private static final Integer zzbqn = Integer.valueOf(0);
	private static final Integer zzbqo = Integer.valueOf(1);
	private final ExecutorService zzadl;
	private final Context zzri;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:invokestatic    #19  <Method Integer Integer.valueOf(int)>
	//    2    4:putstatic       #21  <Field Integer zzbqn>
	//    3    7:iconst_1        
	//    4    8:invokestatic    #19  <Method Integer Integer.valueOf(int)>
	//    5   11:putstatic       #23  <Field Integer zzbqo>
	//*   6   14:return          
	}
}
