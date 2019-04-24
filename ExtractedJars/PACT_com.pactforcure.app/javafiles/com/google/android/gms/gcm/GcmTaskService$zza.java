// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.os.*;
import android.util.Log;

// Referenced classes of package com.google.android.gms.gcm:
//			GcmTaskService, TaskParams, zzb

private class GcmTaskService$zza
	implements Runnable
{

	public void run()
	{
		int i = zzbfV.onRunTask(new TaskParams(mTag, mExtras));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GcmTaskService zzbfV>
	//    2    4:new             #42  <Class TaskParams>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field String mTag>
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field Bundle mExtras>
	//    8   16:invokespecial   #45  <Method void TaskParams(String, Bundle)>
	//    9   19:invokevirtual   #49  <Method int GcmTaskService.onRunTask(TaskParams)>
	//   10   22:istore_1        
		zzbfU.zzjt(i);
	//   11   23:aload_0         
	//   12   24:getfield        #34  <Field zzb zzbfU>
	//   13   27:iload_1         
	//   14   28:invokeinterface #55  <Method void zzb.zzjt(int)>
		GcmTaskService.zza(zzbfV, mTag);
	//   15   33:aload_0         
	//   16   34:getfield        #21  <Field GcmTaskService zzbfV>
	//   17   37:aload_0         
	//   18   38:getfield        #26  <Field String mTag>
	//   19   41:invokestatic    #58  <Method void GcmTaskService.zza(GcmTaskService, String)>
		return;
	//   20   44:return          
		Object obj;
		obj;
	//   21   45:astore_2        
		String s;
		s = String.valueOf(((Object) (mTag)));
	//   22   46:aload_0         
	//   23   47:getfield        #26  <Field String mTag>
	//   24   50:invokestatic    #64  <Method String String.valueOf(Object)>
	//   25   53:astore_2        
		if(s.length() == 0)
			break MISSING_BLOCK_LABEL_87;
	//   26   54:aload_2         
	//   27   55:invokevirtual   #68  <Method int String.length()>
	//   28   58:ifeq            87
		s = "Error reporting result of operation to scheduler for ".concat(s);
	//   29   61:ldc1            #70  <String "Error reporting result of operation to scheduler for ">
	//   30   63:aload_2         
	//   31   64:invokevirtual   #74  <Method String String.concat(String)>
	//   32   67:astore_2        
_L1:
		Log.e("GcmTaskService", s);
	//   33   68:ldc1            #76  <String "GcmTaskService">
	//   34   70:aload_2         
	//   35   71:invokestatic    #82  <Method int Log.e(String, String)>
	//   36   74:pop             
		GcmTaskService.zza(zzbfV, mTag);
	//   37   75:aload_0         
	//   38   76:getfield        #21  <Field GcmTaskService zzbfV>
	//   39   79:aload_0         
	//   40   80:getfield        #26  <Field String mTag>
	//   41   83:invokestatic    #58  <Method void GcmTaskService.zza(GcmTaskService, String)>
		return;
	//   42   86:return          
		s = new String("Error reporting result of operation to scheduler for ");
	//   43   87:new             #60  <Class String>
	//   44   90:dup             
	//   45   91:ldc1            #70  <String "Error reporting result of operation to scheduler for ">
	//   46   93:invokespecial   #85  <Method void String(String)>
	//   47   96:astore_2        
		  goto _L1
	//*  48   97:goto            68
		s;
	//   49  100:astore_2        
		GcmTaskService.zza(zzbfV, mTag);
	//   50  101:aload_0         
	//   51  102:getfield        #21  <Field GcmTaskService zzbfV>
	//   52  105:aload_0         
	//   53  106:getfield        #26  <Field String mTag>
	//   54  109:invokestatic    #58  <Method void GcmTaskService.zza(GcmTaskService, String)>
		throw s;
	//   55  112:aload_2         
	//   56  113:athrow          
	}

	private final Bundle mExtras;
	private final String mTag;
	private final zzb zzbfU;
	final GcmTaskService zzbfV;

	GcmTaskService$zza(GcmTaskService gcmtaskservice, String s, IBinder ibinder, Bundle bundle)
	{
		zzbfV = gcmtaskservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field GcmTaskService zzbfV>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		mTag = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String mTag>
		zzbfU = zzb.zza.zzcV(ibinder);
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:invokestatic    #32  <Method zzb zzb$zza.zzcV(IBinder)>
	//   11   19:putfield        #34  <Field zzb zzbfU>
		mExtras = bundle;
	//   12   22:aload_0         
	//   13   23:aload           4
	//   14   25:putfield        #36  <Field Bundle mExtras>
	//   15   28:return          
	}
}
