// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzadb, zzane

final class zzadd
	implements Thread.UncaughtExceptionHandler
{

	zzadd(zzadb zzadb1, Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
	{
		zzccb = zzadb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzadb zzccb>
		zzccc = uncaughtexceptionhandler;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Thread$UncaughtExceptionHandler zzccc>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void uncaughtException(Thread thread, Throwable throwable)
	{
		zzccb.zza(thread, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzadb zzccb>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #29  <Method void zzadb.zza(Thread, Throwable)>
		if(zzccc == null) goto _L2; else goto _L1
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field Thread$UncaughtExceptionHandler zzccc>
	//    7   13:ifnull          47
_L1:
		zzccc.uncaughtException(thread, throwable);
	//    8   16:aload_0         
	//    9   17:getfield        #16  <Field Thread$UncaughtExceptionHandler zzccc>
	//   10   20:aload_1         
	//   11   21:aload_2         
	//   12   22:invokeinterface #31  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		return;
	//   13   27:return          
		Object obj;
		obj;
	//   14   28:astore_3        
		  goto _L3
	//*  15   29:goto            48
_L4:
		zzane.e("AdMob exception reporter failed reporting the exception.");
	//   16   32:ldc1            #33  <String "AdMob exception reporter failed reporting the exception.">
	//   17   34:invokestatic    #39  <Method void zzane.e(String)>
		if(zzccc == null) goto _L2; else goto _L1
	//   18   37:aload_0         
	//   19   38:getfield        #16  <Field Thread$UncaughtExceptionHandler zzccc>
	//   20   41:ifnull          47
	//*  21   44:goto            16
_L2:
		return;
	//   22   47:return          
_L3:
		if(zzccc != null)
	//*  23   48:aload_0         
	//*  24   49:getfield        #16  <Field Thread$UncaughtExceptionHandler zzccc>
	//*  25   52:ifnull          66
			zzccc.uncaughtException(thread, throwable);
	//   26   55:aload_0         
	//   27   56:getfield        #16  <Field Thread$UncaughtExceptionHandler zzccc>
	//   28   59:aload_1         
	//   29   60:aload_2         
	//   30   61:invokeinterface #31  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		throw obj;
	//   31   66:aload_3         
	//   32   67:athrow          
		obj;
	//   33   68:astore_3        
		  goto _L4
	//*  34   69:goto            32
	}

	private final zzadb zzccb;
	private final Thread.UncaughtExceptionHandler zzccc;
}
