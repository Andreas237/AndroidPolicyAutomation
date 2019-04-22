// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.*;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			BasePendingResult, zzch, zzcj

final class zzci
	implements Runnable
{

	zzci(zzch zzch1, Result result)
	{
		zzml = zzch1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzch zzml>
		zzmk = result;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Result zzmk>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		BasePendingResult.zzez.set(((Object) (Boolean.valueOf(true))));
	//    0    0:getstatic       #30  <Field ThreadLocal BasePendingResult.zzez>
	//    1    3:iconst_1        
	//    2    4:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//    3    7:invokevirtual   #42  <Method void ThreadLocal.set(Object)>
		com.google.android.gms.common.api.PendingResult pendingresult = zzch.zzc(zzml).onSuccess(zzmk);
	//    4   10:aload_0         
	//    5   11:getfield        #14  <Field zzch zzml>
	//    6   14:invokestatic    #48  <Method ResultTransform zzch.zzc(zzch)>
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field Result zzmk>
	//    9   21:invokevirtual   #54  <Method com.google.android.gms.common.api.PendingResult ResultTransform.onSuccess(Result)>
	//   10   24:astore_1        
		zzch.zzd(zzml).sendMessage(zzch.zzd(zzml).obtainMessage(0, ((Object) (pendingresult))));
	//   11   25:aload_0         
	//   12   26:getfield        #14  <Field zzch zzml>
	//   13   29:invokestatic    #58  <Method zzcj zzch.zzd(zzch)>
	//   14   32:aload_0         
	//   15   33:getfield        #14  <Field zzch zzml>
	//   16   36:invokestatic    #58  <Method zzcj zzch.zzd(zzch)>
	//   17   39:iconst_0        
	//   18   40:aload_1         
	//   19   41:invokevirtual   #64  <Method android.os.Message zzcj.obtainMessage(int, Object)>
	//   20   44:invokevirtual   #68  <Method boolean zzcj.sendMessage(android.os.Message)>
	//   21   47:pop             
		BasePendingResult.zzez.set(((Object) (Boolean.valueOf(false))));
	//   22   48:getstatic       #30  <Field ThreadLocal BasePendingResult.zzez>
	//   23   51:iconst_0        
	//   24   52:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   25   55:invokevirtual   #42  <Method void ThreadLocal.set(Object)>
		zzch.zza(zzml, zzmk);
	//   26   58:aload_0         
	//   27   59:getfield        #14  <Field zzch zzml>
	//   28   62:aload_0         
	//   29   63:getfield        #16  <Field Result zzmk>
	//   30   66:invokestatic    #71  <Method void zzch.zza(zzch, Result)>
		GoogleApiClient googleapiclient = (GoogleApiClient)zzch.zze(zzml).get();
	//   31   69:aload_0         
	//   32   70:getfield        #14  <Field zzch zzml>
	//   33   73:invokestatic    #75  <Method WeakReference zzch.zze(zzch)>
	//   34   76:invokevirtual   #81  <Method Object WeakReference.get()>
	//   35   79:checkcast       #83  <Class GoogleApiClient>
	//   36   82:astore_1        
		if(googleapiclient != null)
	//*  37   83:aload_1         
	//*  38   84:ifnull          95
			googleapiclient.zzb(zzml);
	//   39   87:aload_1         
	//   40   88:aload_0         
	//   41   89:getfield        #14  <Field zzch zzml>
	//   42   92:invokevirtual   #87  <Method void GoogleApiClient.zzb(zzch)>
		return;
	//   43   95:return          
		Object obj;
		obj;
	//   44   96:astore_1        
		break MISSING_BLOCK_LABEL_172;
	//   45   97:goto            172
		obj;
	//   46  100:astore_1        
		zzch.zzd(zzml).sendMessage(zzch.zzd(zzml).obtainMessage(1, obj));
	//   47  101:aload_0         
	//   48  102:getfield        #14  <Field zzch zzml>
	//   49  105:invokestatic    #58  <Method zzcj zzch.zzd(zzch)>
	//   50  108:aload_0         
	//   51  109:getfield        #14  <Field zzch zzml>
	//   52  112:invokestatic    #58  <Method zzcj zzch.zzd(zzch)>
	//   53  115:iconst_1        
	//   54  116:aload_1         
	//   55  117:invokevirtual   #64  <Method android.os.Message zzcj.obtainMessage(int, Object)>
	//   56  120:invokevirtual   #68  <Method boolean zzcj.sendMessage(android.os.Message)>
	//   57  123:pop             
		BasePendingResult.zzez.set(((Object) (Boolean.valueOf(false))));
	//   58  124:getstatic       #30  <Field ThreadLocal BasePendingResult.zzez>
	//   59  127:iconst_0        
	//   60  128:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   61  131:invokevirtual   #42  <Method void ThreadLocal.set(Object)>
		zzch.zza(zzml, zzmk);
	//   62  134:aload_0         
	//   63  135:getfield        #14  <Field zzch zzml>
	//   64  138:aload_0         
	//   65  139:getfield        #16  <Field Result zzmk>
	//   66  142:invokestatic    #71  <Method void zzch.zza(zzch, Result)>
		GoogleApiClient googleapiclient1 = (GoogleApiClient)zzch.zze(zzml).get();
	//   67  145:aload_0         
	//   68  146:getfield        #14  <Field zzch zzml>
	//   69  149:invokestatic    #75  <Method WeakReference zzch.zze(zzch)>
	//   70  152:invokevirtual   #81  <Method Object WeakReference.get()>
	//   71  155:checkcast       #83  <Class GoogleApiClient>
	//   72  158:astore_1        
		if(googleapiclient1 != null)
	//*  73  159:aload_1         
	//*  74  160:ifnull          171
			googleapiclient1.zzb(zzml);
	//   75  163:aload_1         
	//   76  164:aload_0         
	//   77  165:getfield        #14  <Field zzch zzml>
	//   78  168:invokevirtual   #87  <Method void GoogleApiClient.zzb(zzch)>
		return;
	//   79  171:return          
		BasePendingResult.zzez.set(((Object) (Boolean.valueOf(false))));
	//   80  172:getstatic       #30  <Field ThreadLocal BasePendingResult.zzez>
	//   81  175:iconst_0        
	//   82  176:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   83  179:invokevirtual   #42  <Method void ThreadLocal.set(Object)>
		zzch.zza(zzml, zzmk);
	//   84  182:aload_0         
	//   85  183:getfield        #14  <Field zzch zzml>
	//   86  186:aload_0         
	//   87  187:getfield        #16  <Field Result zzmk>
	//   88  190:invokestatic    #71  <Method void zzch.zza(zzch, Result)>
		GoogleApiClient googleapiclient2 = (GoogleApiClient)zzch.zze(zzml).get();
	//   89  193:aload_0         
	//   90  194:getfield        #14  <Field zzch zzml>
	//   91  197:invokestatic    #75  <Method WeakReference zzch.zze(zzch)>
	//   92  200:invokevirtual   #81  <Method Object WeakReference.get()>
	//   93  203:checkcast       #83  <Class GoogleApiClient>
	//   94  206:astore_2        
		if(googleapiclient2 != null)
	//*  95  207:aload_2         
	//*  96  208:ifnull          219
			googleapiclient2.zzb(zzml);
	//   97  211:aload_2         
	//   98  212:aload_0         
	//   99  213:getfield        #14  <Field zzch zzml>
	//  100  216:invokevirtual   #87  <Method void GoogleApiClient.zzb(zzch)>
		throw googleapiclient1;
	//  101  219:aload_1         
	//  102  220:athrow          
	}

	private final Result zzmk;
	private final zzch zzml;
}
