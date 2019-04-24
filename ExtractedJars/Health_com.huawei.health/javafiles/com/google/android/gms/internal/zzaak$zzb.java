// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.zzb;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaak, zzabq, zzaaj

class zzaak$zzb
	implements OnCompleteListener
{

	void cancel()
	{
		zzaBb.zzrq();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field zzabq zzaBb>
	//    2    4:invokeinterface #30  <Method void zzabq.zzrq()>
	//    3    9:return          
	}

	public void onComplete(Task task)
	{
		zzaak.zza(zzaBa).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field zzaak zzaBa>
	//    2    4:invokestatic    #37  <Method Lock zzaak.zza(zzaak)>
	//    3    7:invokeinterface #42  <Method void Lock.lock()>
		if(com.google.android.gms.internal.zzaak.zzb(zzaBa))
			break MISSING_BLOCK_LABEL_44;
	//    4   12:aload_0         
	//    5   13:getfield        #18  <Field zzaak zzaBa>
	//    6   16:invokestatic    #45  <Method boolean com.google.android.gms.internal.zzaak.zzb(zzaak)>
	//    7   19:ifne            44
		zzaBb.zzrq();
	//    8   22:aload_0         
	//    9   23:getfield        #23  <Field zzabq zzaBb>
	//   10   26:invokeinterface #30  <Method void zzabq.zzrq()>
		zzaak.zza(zzaBa).unlock();
	//   11   31:aload_0         
	//   12   32:getfield        #18  <Field zzaak zzaBa>
	//   13   35:invokestatic    #37  <Method Lock zzaak.zza(zzaak)>
	//   14   38:invokeinterface #48  <Method void Lock.unlock()>
		return;
	//   15   43:return          
		if(task.isSuccessful())
	//*  16   44:aload_1         
	//*  17   45:invokevirtual   #54  <Method boolean Task.isSuccessful()>
	//*  18   48:ifeq            138
		{
			com.google.android.gms.internal.zzaak.zzb(zzaBa, ((Map) (new ArrayMap(zzaak.zzm(zzaBa).size()))));
	//   19   51:aload_0         
	//   20   52:getfield        #18  <Field zzaak zzaBa>
	//   21   55:new             #56  <Class ArrayMap>
	//   22   58:dup             
	//   23   59:aload_0         
	//   24   60:getfield        #18  <Field zzaak zzaBa>
	//   25   63:invokestatic    #60  <Method Map zzaak.zzm(zzaak)>
	//   26   66:invokeinterface #66  <Method int Map.size()>
	//   27   71:invokespecial   #69  <Method void ArrayMap(int)>
	//   28   74:invokestatic    #72  <Method Map com.google.android.gms.internal.zzaak.zzb(zzaak, Map)>
	//   29   77:pop             
			zzaaj zzaaj1;
			for(task = ((Task) (zzaak.zzm(zzaBa).values().iterator())); ((Iterator) (task)).hasNext(); zzaak.zzg(zzaBa).put(((Object) (zzaaj1.getApiKey())), ((Object) (ConnectionResult.zzayj))))
	//*  30   78:aload_0         
	//*  31   79:getfield        #18  <Field zzaak zzaBa>
	//*  32   82:invokestatic    #60  <Method Map zzaak.zzm(zzaak)>
	//*  33   85:invokeinterface #76  <Method Collection Map.values()>
	//*  34   90:invokeinterface #82  <Method Iterator Collection.iterator()>
	//*  35   95:astore_1        
	//*  36   96:aload_1         
	//*  37   97:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//*  38  102:ifeq            443
				zzaaj1 = (zzaaj)((Iterator) (task)).next();
	//   39  105:aload_1         
	//   40  106:invokeinterface #91  <Method Object Iterator.next()>
	//   41  111:checkcast       #93  <Class zzaaj>
	//   42  114:astore_2        

	//   43  115:aload_0         
	//   44  116:getfield        #18  <Field zzaak zzaBa>
	//   45  119:invokestatic    #96  <Method Map zzaak.zzg(zzaak)>
	//   46  122:aload_2         
	//   47  123:invokevirtual   #100 <Method zzzz zzaaj.getApiKey()>
	//   48  126:getstatic       #106 <Field ConnectionResult ConnectionResult.zzayj>
	//   49  129:invokeinterface #110 <Method Object Map.put(Object, Object)>
	//   50  134:pop             
			break MISSING_BLOCK_LABEL_341;
	//   51  135:goto            96
		}
		Iterator iterator;
		if(!(task.getException() instanceof zzb))
			break MISSING_BLOCK_LABEL_318;
	//   52  138:aload_1         
	//   53  139:invokevirtual   #114 <Method Exception Task.getException()>
	//   54  142:instanceof      #116 <Class zzb>
	//   55  145:ifeq            318
		task = ((Task) ((zzb)task.getException()));
	//   56  148:aload_1         
	//   57  149:invokevirtual   #114 <Method Exception Task.getException()>
	//   58  152:checkcast       #116 <Class zzb>
	//   59  155:astore_1        
		if(!zzaak.zze(zzaBa))
			break MISSING_BLOCK_LABEL_303;
	//   60  156:aload_0         
	//   61  157:getfield        #18  <Field zzaak zzaBa>
	//   62  160:invokestatic    #119 <Method boolean zzaak.zze(zzaak)>
	//   63  163:ifeq            303
		com.google.android.gms.internal.zzaak.zzb(zzaBa, ((Map) (new ArrayMap(zzaak.zzm(zzaBa).size()))));
	//   64  166:aload_0         
	//   65  167:getfield        #18  <Field zzaak zzaBa>
	//   66  170:new             #56  <Class ArrayMap>
	//   67  173:dup             
	//   68  174:aload_0         
	//   69  175:getfield        #18  <Field zzaak zzaBa>
	//   70  178:invokestatic    #60  <Method Map zzaak.zzm(zzaak)>
	//   71  181:invokeinterface #66  <Method int Map.size()>
	//   72  186:invokespecial   #69  <Method void ArrayMap(int)>
	//   73  189:invokestatic    #72  <Method Map com.google.android.gms.internal.zzaak.zzb(zzaak, Map)>
	//   74  192:pop             
		iterator = zzaak.zzm(zzaBa).values().iterator();
	//   75  193:aload_0         
	//   76  194:getfield        #18  <Field zzaak zzaBa>
	//   77  197:invokestatic    #60  <Method Map zzaak.zzm(zzaak)>
	//   78  200:invokeinterface #76  <Method Collection Map.values()>
	//   79  205:invokeinterface #82  <Method Iterator Collection.iterator()>
	//   80  210:astore_2        
_L2:
		zzzz zzzz;
		ConnectionResult connectionresult;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_341;
	//   81  211:aload_2         
	//   82  212:invokeinterface #87  <Method boolean Iterator.hasNext()>
	//   83  217:ifeq            449
			zzaaj zzaaj2 = (zzaaj)iterator.next();
	//   84  220:aload_2         
	//   85  221:invokeinterface #91  <Method Object Iterator.next()>
	//   86  226:checkcast       #93  <Class zzaaj>
	//   87  229:astore_3        
			zzzz = zzaaj2.getApiKey();
	//   88  230:aload_3         
	//   89  231:invokevirtual   #100 <Method zzzz zzaaj.getApiKey()>
	//   90  234:astore          4
			connectionresult = ((zzb) (task)).zza(((com.google.android.gms.common.api.zzc) (zzaaj2)));
	//   91  236:aload_1         
	//   92  237:aload_3         
	//   93  238:invokevirtual   #122 <Method ConnectionResult zzb.zza(com.google.android.gms.common.api.zzc)>
	//   94  241:astore          5
			if(!zzaak.zza(zzaBa, zzaaj2, connectionresult))
				break MISSING_BLOCK_LABEL_283;
	//   95  243:aload_0         
	//   96  244:getfield        #18  <Field zzaak zzaBa>
	//   97  247:aload_3         
	//   98  248:aload           5
	//   99  250:invokestatic    #125 <Method boolean zzaak.zza(zzaak, zzaaj, ConnectionResult)>
	//  100  253:ifeq            283
			zzaak.zzg(zzaBa).put(((Object) (zzzz)), ((Object) (new ConnectionResult(16))));
	//  101  256:aload_0         
	//  102  257:getfield        #18  <Field zzaak zzaBa>
	//  103  260:invokestatic    #96  <Method Map zzaak.zzg(zzaak)>
	//  104  263:aload           4
	//  105  265:new             #102 <Class ConnectionResult>
	//  106  268:dup             
	//  107  269:bipush          16
	//  108  271:invokespecial   #126 <Method void ConnectionResult(int)>
	//  109  274:invokeinterface #110 <Method Object Map.put(Object, Object)>
	//  110  279:pop             
		} while(true);
	//  111  280:goto            446
		zzaak.zzg(zzaBa).put(((Object) (zzzz)), ((Object) (connectionresult)));
	//  112  283:aload_0         
	//  113  284:getfield        #18  <Field zzaak zzaBa>
	//  114  287:invokestatic    #96  <Method Map zzaak.zzg(zzaak)>
	//  115  290:aload           4
	//  116  292:aload           5
	//  117  294:invokeinterface #110 <Method Object Map.put(Object, Object)>
	//  118  299:pop             
		if(true) goto _L2; else goto _L1
	//  119  300:goto            446
_L1:
		com.google.android.gms.internal.zzaak.zzb(zzaBa, ((Map) (((zzb) (task)).zzvj())));
	//  120  303:aload_0         
	//  121  304:getfield        #18  <Field zzaak zzaBa>
	//  122  307:aload_1         
	//  123  308:invokevirtual   #130 <Method ArrayMap zzb.zzvj()>
	//  124  311:invokestatic    #72  <Method Map com.google.android.gms.internal.zzaak.zzb(zzaak, Map)>
	//  125  314:pop             
		break MISSING_BLOCK_LABEL_341;
	//  126  315:goto            449
		Log.e("ConnectionlessGAC", "Unexpected availability exception", ((Throwable) (task.getException())));
	//  127  318:ldc1            #132 <String "ConnectionlessGAC">
	//  128  320:ldc1            #134 <String "Unexpected availability exception">
	//  129  322:aload_1         
	//  130  323:invokevirtual   #114 <Method Exception Task.getException()>
	//  131  326:invokestatic    #140 <Method int Log.e(String, String, Throwable)>
	//  132  329:pop             
		com.google.android.gms.internal.zzaak.zzb(zzaBa, Collections.emptyMap());
	//  133  330:aload_0         
	//  134  331:getfield        #18  <Field zzaak zzaBa>
	//  135  334:invokestatic    #146 <Method Map Collections.emptyMap()>
	//  136  337:invokestatic    #72  <Method Map com.google.android.gms.internal.zzaak.zzb(zzaak, Map)>
	//  137  340:pop             
		if(zzaBa.isConnected())
	//* 138  341:aload_0         
	//* 139  342:getfield        #18  <Field zzaak zzaBa>
	//* 140  345:invokevirtual   #149 <Method boolean zzaak.isConnected()>
	//* 141  348:ifeq            406
		{
			zzaak.zzd(zzaBa).putAll(zzaak.zzg(zzaBa));
	//  142  351:aload_0         
	//  143  352:getfield        #18  <Field zzaak zzaBa>
	//  144  355:invokestatic    #152 <Method Map zzaak.zzd(zzaak)>
	//  145  358:aload_0         
	//  146  359:getfield        #18  <Field zzaak zzaBa>
	//  147  362:invokestatic    #96  <Method Map zzaak.zzg(zzaak)>
	//  148  365:invokeinterface #156 <Method void Map.putAll(Map)>
			if(zzaak.zzf(zzaBa) == null)
	//* 149  370:aload_0         
	//* 150  371:getfield        #18  <Field zzaak zzaBa>
	//* 151  374:invokestatic    #160 <Method ConnectionResult zzaak.zzf(zzaak)>
	//* 152  377:ifnonnull       406
			{
				zzaak.zzi(zzaBa);
	//  153  380:aload_0         
	//  154  381:getfield        #18  <Field zzaak zzaBa>
	//  155  384:invokestatic    #164 <Method void zzaak.zzi(zzaak)>
				zzaak.zzj(zzaBa);
	//  156  387:aload_0         
	//  157  388:getfield        #18  <Field zzaak zzaBa>
	//  158  391:invokestatic    #167 <Method void zzaak.zzj(zzaak)>
				zzaak.zzl(zzaBa).signalAll();
	//  159  394:aload_0         
	//  160  395:getfield        #18  <Field zzaak zzaBa>
	//  161  398:invokestatic    #171 <Method Condition zzaak.zzl(zzaak)>
	//  162  401:invokeinterface #176 <Method void Condition.signalAll()>
			}
		}
		zzaBb.zzrq();
	//  163  406:aload_0         
	//  164  407:getfield        #23  <Field zzabq zzaBb>
	//  165  410:invokeinterface #30  <Method void zzabq.zzrq()>
		zzaak.zza(zzaBa).unlock();
	//  166  415:aload_0         
	//  167  416:getfield        #18  <Field zzaak zzaBa>
	//  168  419:invokestatic    #37  <Method Lock zzaak.zza(zzaak)>
	//  169  422:invokeinterface #48  <Method void Lock.unlock()>
		return;
	//  170  427:return          
		task;
	//  171  428:astore_1        
		zzaak.zza(zzaBa).unlock();
	//  172  429:aload_0         
	//  173  430:getfield        #18  <Field zzaak zzaBa>
	//  174  433:invokestatic    #37  <Method Lock zzaak.zza(zzaak)>
	//  175  436:invokeinterface #48  <Method void Lock.unlock()>
		throw task;
	//  176  441:aload_1         
	//  177  442:athrow          
	//* 178  443:goto            341
	//* 179  446:goto            211
	//* 180  449:goto            341
	}

	final zzaak zzaBa;
	private zzabq zzaBb;

	zzaak$zzb(zzaak zzaak1, zzabq zzabq1)
	{
		zzaBa = zzaak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field zzaak zzaBa>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		zzaBb = zzabq1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field zzabq zzaBb>
	//    8   14:return          
	}
}
