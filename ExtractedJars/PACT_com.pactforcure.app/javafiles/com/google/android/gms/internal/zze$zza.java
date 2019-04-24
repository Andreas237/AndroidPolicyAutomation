// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zze, zzm, zzk

private class zze$zza
	implements Runnable
{

	public void run()
	{
		if(zzu.isSuccess())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field zzm zzu>
	//*   2    4:invokevirtual   #34  <Method boolean zzm.isSuccess()>
	//*   3    7:ifeq            60
			zzt.zza(zzu.result);
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field zzk zzt>
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field zzm zzu>
	//    8   18:getfield        #38  <Field Object zzm.result>
	//    9   21:invokevirtual   #43  <Method void zzk.zza(Object)>
		else
	//*  10   24:aload_0         
	//*  11   25:getfield        #24  <Field zzm zzu>
	//*  12   28:getfield        #47  <Field boolean zzm.zzag>
	//*  13   31:ifeq            77
	//*  14   34:aload_0         
	//*  15   35:getfield        #22  <Field zzk zzt>
	//*  16   38:ldc1            #49  <String "intermediate-response">
	//*  17   40:invokevirtual   #53  <Method void zzk.zzc(String)>
	//*  18   43:aload_0         
	//*  19   44:getfield        #26  <Field Runnable zzv>
	//*  20   47:ifnull          59
	//*  21   50:aload_0         
	//*  22   51:getfield        #26  <Field Runnable zzv>
	//*  23   54:invokeinterface #55  <Method void Runnable.run()>
	//*  24   59:return          
			zzt.zzc(zzu.zzaf);
	//   25   60:aload_0         
	//   26   61:getfield        #22  <Field zzk zzt>
	//   27   64:aload_0         
	//   28   65:getfield        #24  <Field zzm zzu>
	//   29   68:getfield        #59  <Field zzr zzm.zzaf>
	//   30   71:invokevirtual   #62  <Method void zzk.zzc(zzr)>
		if(zzu.zzag)
			zzt.zzc("intermediate-response");
		else
	//*  31   74:goto            24
			zzt.zzd("done");
	//   32   77:aload_0         
	//   33   78:getfield        #22  <Field zzk zzt>
	//   34   81:ldc1            #64  <String "done">
	//   35   83:invokevirtual   #67  <Method void zzk.zzd(String)>
		if(zzv != null)
			zzv.run();
	//*  36   86:goto            43
	}

	private final zzk zzt;
	private final zzm zzu;
	private final Runnable zzv;

	public zze$zza(zze zze1, zzk zzk1, zzm zzm1, Runnable runnable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzt = zzk1;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #22  <Field zzk zzt>
		zzu = zzm1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #24  <Field zzm zzu>
		zzv = runnable;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #26  <Field Runnable zzv>
	//   11   20:return          
	}
}
