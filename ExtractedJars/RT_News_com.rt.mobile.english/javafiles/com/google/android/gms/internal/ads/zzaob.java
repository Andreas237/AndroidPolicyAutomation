// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class zzaob
	implements Runnable
{

	zzaob(Executor executor, Runnable runnable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzcvx = executor;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Executor zzcvx>
		zzxi = runnable;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Runnable zzxi>
	//    8   14:return          
	}

	public final void run()
	{
		zzcvx.execute(zzxi);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Executor zzcvx>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Runnable zzxi>
	//    4    8:invokeinterface #27  <Method void Executor.execute(Runnable)>
	//    5   13:return          
	}

	private final Executor zzcvx;
	private final Runnable zzxi;
}
