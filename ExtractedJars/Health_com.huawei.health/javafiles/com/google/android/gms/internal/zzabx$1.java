// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.*;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//			zzabx, zzaaf

class zzabx$1
	implements Runnable
{

	public void run()
	{
		zzaaf.zzaAg.set(((Object) (Boolean.valueOf(true))));
	//    0    0:getstatic       #35  <Field ThreadLocal zzaaf.zzaAg>
	//    1    3:iconst_1        
	//    2    4:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
	//    3    7:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
		com.google.android.gms.common.api.PendingResult pendingresult = zzabx.zzc(zzaDt).onSuccess(zzaDs);
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field zzabx zzaDt>
	//    6   14:invokestatic    #51  <Method ResultTransform zzabx.zzc(zzabx)>
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field Result zzaDs>
	//    9   21:invokevirtual   #57  <Method com.google.android.gms.common.api.PendingResult ResultTransform.onSuccess(Result)>
	//   10   24:astore_1        
		zzabx.zzd(zzaDt).sendMessage(zzabx.zzd(zzaDt).obtainMessage(0, ((Object) (pendingresult))));
	//   11   25:aload_0         
	//   12   26:getfield        #19  <Field zzabx zzaDt>
	//   13   29:invokestatic    #61  <Method zzabx$zza zzabx.zzd(zzabx)>
	//   14   32:aload_0         
	//   15   33:getfield        #19  <Field zzabx zzaDt>
	//   16   36:invokestatic    #61  <Method zzabx$zza zzabx.zzd(zzabx)>
	//   17   39:iconst_0        
	//   18   40:aload_1         
	//   19   41:invokevirtual   #67  <Method android.os.Message zzabx$zza.obtainMessage(int, Object)>
	//   20   44:invokevirtual   #71  <Method boolean zzabx$zza.sendMessage(android.os.Message)>
	//   21   47:pop             
		zzaaf.zzaAg.set(((Object) (Boolean.valueOf(false))));
	//   22   48:getstatic       #35  <Field ThreadLocal zzaaf.zzaAg>
	//   23   51:iconst_0        
	//   24   52:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
	//   25   55:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
		zzabx.zza(zzaDt, zzaDs);
	//   26   58:aload_0         
	//   27   59:getfield        #19  <Field zzabx zzaDt>
	//   28   62:aload_0         
	//   29   63:getfield        #21  <Field Result zzaDs>
	//   30   66:invokestatic    #74  <Method void zzabx.zza(zzabx, Result)>
		GoogleApiClient googleapiclient = (GoogleApiClient)zzabx.zze(zzaDt).get();
	//   31   69:aload_0         
	//   32   70:getfield        #19  <Field zzabx zzaDt>
	//   33   73:invokestatic    #78  <Method WeakReference zzabx.zze(zzabx)>
	//   34   76:invokevirtual   #84  <Method Object WeakReference.get()>
	//   35   79:checkcast       #86  <Class GoogleApiClient>
	//   36   82:astore_1        
		if(googleapiclient != null)
	//*  37   83:aload_1         
	//*  38   84:ifnull          95
			googleapiclient.zzb(zzaDt);
	//   39   87:aload_1         
	//   40   88:aload_0         
	//   41   89:getfield        #19  <Field zzabx zzaDt>
	//   42   92:invokevirtual   #90  <Method void GoogleApiClient.zzb(zzabx)>
		return;
	//   43   95:return          
		Object obj;
		obj;
	//   44   96:astore_1        
		zzabx.zzd(zzaDt).sendMessage(zzabx.zzd(zzaDt).obtainMessage(1, obj));
	//   45   97:aload_0         
	//   46   98:getfield        #19  <Field zzabx zzaDt>
	//   47  101:invokestatic    #61  <Method zzabx$zza zzabx.zzd(zzabx)>
	//   48  104:aload_0         
	//   49  105:getfield        #19  <Field zzabx zzaDt>
	//   50  108:invokestatic    #61  <Method zzabx$zza zzabx.zzd(zzabx)>
	//   51  111:iconst_1        
	//   52  112:aload_1         
	//   53  113:invokevirtual   #67  <Method android.os.Message zzabx$zza.obtainMessage(int, Object)>
	//   54  116:invokevirtual   #71  <Method boolean zzabx$zza.sendMessage(android.os.Message)>
	//   55  119:pop             
		zzaaf.zzaAg.set(((Object) (Boolean.valueOf(false))));
	//   56  120:getstatic       #35  <Field ThreadLocal zzaaf.zzaAg>
	//   57  123:iconst_0        
	//   58  124:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
	//   59  127:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
		zzabx.zza(zzaDt, zzaDs);
	//   60  130:aload_0         
	//   61  131:getfield        #19  <Field zzabx zzaDt>
	//   62  134:aload_0         
	//   63  135:getfield        #21  <Field Result zzaDs>
	//   64  138:invokestatic    #74  <Method void zzabx.zza(zzabx, Result)>
		GoogleApiClient googleapiclient1 = (GoogleApiClient)zzabx.zze(zzaDt).get();
	//   65  141:aload_0         
	//   66  142:getfield        #19  <Field zzabx zzaDt>
	//   67  145:invokestatic    #78  <Method WeakReference zzabx.zze(zzabx)>
	//   68  148:invokevirtual   #84  <Method Object WeakReference.get()>
	//   69  151:checkcast       #86  <Class GoogleApiClient>
	//   70  154:astore_1        
		if(googleapiclient1 != null)
	//*  71  155:aload_1         
	//*  72  156:ifnull          167
			googleapiclient1.zzb(zzaDt);
	//   73  159:aload_1         
	//   74  160:aload_0         
	//   75  161:getfield        #19  <Field zzabx zzaDt>
	//   76  164:invokevirtual   #90  <Method void GoogleApiClient.zzb(zzabx)>
		return;
	//   77  167:return          
		googleapiclient1;
	//   78  168:astore_1        
		zzaaf.zzaAg.set(((Object) (Boolean.valueOf(false))));
	//   79  169:getstatic       #35  <Field ThreadLocal zzaaf.zzaAg>
	//   80  172:iconst_0        
	//   81  173:invokestatic    #41  <Method Boolean Boolean.valueOf(boolean)>
	//   82  176:invokevirtual   #47  <Method void ThreadLocal.set(Object)>
		zzabx.zza(zzaDt, zzaDs);
	//   83  179:aload_0         
	//   84  180:getfield        #19  <Field zzabx zzaDt>
	//   85  183:aload_0         
	//   86  184:getfield        #21  <Field Result zzaDs>
	//   87  187:invokestatic    #74  <Method void zzabx.zza(zzabx, Result)>
		GoogleApiClient googleapiclient2 = (GoogleApiClient)zzabx.zze(zzaDt).get();
	//   88  190:aload_0         
	//   89  191:getfield        #19  <Field zzabx zzaDt>
	//   90  194:invokestatic    #78  <Method WeakReference zzabx.zze(zzabx)>
	//   91  197:invokevirtual   #84  <Method Object WeakReference.get()>
	//   92  200:checkcast       #86  <Class GoogleApiClient>
	//   93  203:astore_2        
		if(googleapiclient2 != null)
	//*  94  204:aload_2         
	//*  95  205:ifnull          216
			googleapiclient2.zzb(zzaDt);
	//   96  208:aload_2         
	//   97  209:aload_0         
	//   98  210:getfield        #19  <Field zzabx zzaDt>
	//   99  213:invokevirtual   #90  <Method void GoogleApiClient.zzb(zzabx)>
		throw googleapiclient1;
	//  100  216:aload_1         
	//  101  217:athrow          
	}

	final Result zzaDs;
	final zzabx zzaDt;

	zzabx$1(zzabx zzabx1, Result result)
	{
		zzaDt = zzabx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzabx zzaDt>
		zzaDs = result;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Result zzaDs>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
