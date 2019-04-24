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
//			zzaak, zzaaj, zzaat

class zzaak$zza
	implements OnCompleteListener
{

	public void onComplete(Task task)
	{
		zzaak.zza(zzaBa).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzaak zzaBa>
	//    2    4:invokestatic    #29  <Method Lock zzaak.zza(zzaak)>
	//    3    7:invokeinterface #34  <Method void Lock.lock()>
		boolean flag = com.google.android.gms.internal.zzaak.zzb(zzaBa);
	//    4   12:aload_0         
	//    5   13:getfield        #16  <Field zzaak zzaBa>
	//    6   16:invokestatic    #38  <Method boolean com.google.android.gms.internal.zzaak.zzb(zzaak)>
	//    7   19:istore_2        
		if(!flag)
	//*   8   20:iload_2         
	//*   9   21:ifne            37
		{
			zzaak.zza(zzaBa).unlock();
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field zzaak zzaBa>
	//   12   28:invokestatic    #29  <Method Lock zzaak.zza(zzaak)>
	//   13   31:invokeinterface #41  <Method void Lock.unlock()>
			return;
	//   14   36:return          
		}
		if(task.isSuccessful())
	//*  15   37:aload_1         
	//*  16   38:invokevirtual   #47  <Method boolean Task.isSuccessful()>
	//*  17   41:ifeq            131
		{
			zzaak.zza(zzaBa, ((Map) (new ArrayMap(zzaak.zzc(zzaBa).size()))));
	//   18   44:aload_0         
	//   19   45:getfield        #16  <Field zzaak zzaBa>
	//   20   48:new             #49  <Class ArrayMap>
	//   21   51:dup             
	//   22   52:aload_0         
	//   23   53:getfield        #16  <Field zzaak zzaBa>
	//   24   56:invokestatic    #53  <Method Map zzaak.zzc(zzaak)>
	//   25   59:invokeinterface #59  <Method int Map.size()>
	//   26   64:invokespecial   #62  <Method void ArrayMap(int)>
	//   27   67:invokestatic    #65  <Method Map zzaak.zza(zzaak, Map)>
	//   28   70:pop             
			zzaaj zzaaj1;
			for(task = ((Task) (zzaak.zzc(zzaBa).values().iterator())); ((Iterator) (task)).hasNext(); zzaak.zzd(zzaBa).put(((Object) (zzaaj1.getApiKey())), ((Object) (ConnectionResult.zzayj))))
	//*  29   71:aload_0         
	//*  30   72:getfield        #16  <Field zzaak zzaBa>
	//*  31   75:invokestatic    #53  <Method Map zzaak.zzc(zzaak)>
	//*  32   78:invokeinterface #69  <Method Collection Map.values()>
	//*  33   83:invokeinterface #75  <Method Iterator Collection.iterator()>
	//*  34   88:astore_1        
	//*  35   89:aload_1         
	//*  36   90:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  37   95:ifeq            507
				zzaaj1 = (zzaaj)((Iterator) (task)).next();
	//   38   98:aload_1         
	//   39   99:invokeinterface #84  <Method Object Iterator.next()>
	//   40  104:checkcast       #86  <Class zzaaj>
	//   41  107:astore_3        

	//   42  108:aload_0         
	//   43  109:getfield        #16  <Field zzaak zzaBa>
	//   44  112:invokestatic    #89  <Method Map zzaak.zzd(zzaak)>
	//   45  115:aload_3         
	//   46  116:invokevirtual   #93  <Method zzzz zzaaj.getApiKey()>
	//   47  119:getstatic       #99  <Field ConnectionResult ConnectionResult.zzayj>
	//   48  122:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//   49  127:pop             
			break MISSING_BLOCK_LABEL_370;
	//   50  128:goto            89
		}
		Iterator iterator;
		if(!(task.getException() instanceof zzb))
			break MISSING_BLOCK_LABEL_330;
	//   51  131:aload_1         
	//   52  132:invokevirtual   #107 <Method Exception Task.getException()>
	//   53  135:instanceof      #109 <Class zzb>
	//   54  138:ifeq            330
		task = ((Task) ((zzb)task.getException()));
	//   55  141:aload_1         
	//   56  142:invokevirtual   #107 <Method Exception Task.getException()>
	//   57  145:checkcast       #109 <Class zzb>
	//   58  148:astore_1        
		if(!zzaak.zze(zzaBa))
			break MISSING_BLOCK_LABEL_300;
	//   59  149:aload_0         
	//   60  150:getfield        #16  <Field zzaak zzaBa>
	//   61  153:invokestatic    #112 <Method boolean zzaak.zze(zzaak)>
	//   62  156:ifeq            300
		zzaak.zza(zzaBa, ((Map) (new ArrayMap(zzaak.zzc(zzaBa).size()))));
	//   63  159:aload_0         
	//   64  160:getfield        #16  <Field zzaak zzaBa>
	//   65  163:new             #49  <Class ArrayMap>
	//   66  166:dup             
	//   67  167:aload_0         
	//   68  168:getfield        #16  <Field zzaak zzaBa>
	//   69  171:invokestatic    #53  <Method Map zzaak.zzc(zzaak)>
	//   70  174:invokeinterface #59  <Method int Map.size()>
	//   71  179:invokespecial   #62  <Method void ArrayMap(int)>
	//   72  182:invokestatic    #65  <Method Map zzaak.zza(zzaak, Map)>
	//   73  185:pop             
		iterator = zzaak.zzc(zzaBa).values().iterator();
	//   74  186:aload_0         
	//   75  187:getfield        #16  <Field zzaak zzaBa>
	//   76  190:invokestatic    #53  <Method Map zzaak.zzc(zzaak)>
	//   77  193:invokeinterface #69  <Method Collection Map.values()>
	//   78  198:invokeinterface #75  <Method Iterator Collection.iterator()>
	//   79  203:astore_3        
_L1:
		zzzz zzzz;
		ConnectionResult connectionresult;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_312;
	//   80  204:aload_3         
	//   81  205:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//   82  210:ifeq            513
			zzaaj zzaaj2 = (zzaaj)iterator.next();
	//   83  213:aload_3         
	//   84  214:invokeinterface #84  <Method Object Iterator.next()>
	//   85  219:checkcast       #86  <Class zzaaj>
	//   86  222:astore          4
			zzzz = zzaaj2.getApiKey();
	//   87  224:aload           4
	//   88  226:invokevirtual   #93  <Method zzzz zzaaj.getApiKey()>
	//   89  229:astore          5
			connectionresult = ((zzb) (task)).zza(((com.google.android.gms.common.api.zzc) (zzaaj2)));
	//   90  231:aload_1         
	//   91  232:aload           4
	//   92  234:invokevirtual   #115 <Method ConnectionResult zzb.zza(com.google.android.gms.common.api.zzc)>
	//   93  237:astore          6
			if(!zzaak.zza(zzaBa, zzaaj2, connectionresult))
				break MISSING_BLOCK_LABEL_280;
	//   94  239:aload_0         
	//   95  240:getfield        #16  <Field zzaak zzaBa>
	//   96  243:aload           4
	//   97  245:aload           6
	//   98  247:invokestatic    #118 <Method boolean zzaak.zza(zzaak, zzaaj, ConnectionResult)>
	//   99  250:ifeq            280
			zzaak.zzd(zzaBa).put(((Object) (zzzz)), ((Object) (new ConnectionResult(16))));
	//  100  253:aload_0         
	//  101  254:getfield        #16  <Field zzaak zzaBa>
	//  102  257:invokestatic    #89  <Method Map zzaak.zzd(zzaak)>
	//  103  260:aload           5
	//  104  262:new             #95  <Class ConnectionResult>
	//  105  265:dup             
	//  106  266:bipush          16
	//  107  268:invokespecial   #119 <Method void ConnectionResult(int)>
	//  108  271:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//  109  276:pop             
		} while(true);
	//  110  277:goto            510
		zzaak.zzd(zzaBa).put(((Object) (zzzz)), ((Object) (connectionresult)));
	//  111  280:aload_0         
	//  112  281:getfield        #16  <Field zzaak zzaBa>
	//  113  284:invokestatic    #89  <Method Map zzaak.zzd(zzaak)>
	//  114  287:aload           5
	//  115  289:aload           6
	//  116  291:invokeinterface #103 <Method Object Map.put(Object, Object)>
	//  117  296:pop             
		  goto _L1
	//* 118  297:goto            510
		zzaak.zza(zzaBa, ((Map) (((zzb) (task)).zzvj())));
	//  119  300:aload_0         
	//  120  301:getfield        #16  <Field zzaak zzaBa>
	//  121  304:aload_1         
	//  122  305:invokevirtual   #123 <Method ArrayMap zzb.zzvj()>
	//  123  308:invokestatic    #65  <Method Map zzaak.zza(zzaak, Map)>
	//  124  311:pop             
		zzaak.zza(zzaBa, zzaak.zzf(zzaBa));
	//  125  312:aload_0         
	//  126  313:getfield        #16  <Field zzaak zzaBa>
	//  127  316:aload_0         
	//  128  317:getfield        #16  <Field zzaak zzaBa>
	//  129  320:invokestatic    #127 <Method ConnectionResult zzaak.zzf(zzaak)>
	//  130  323:invokestatic    #130 <Method ConnectionResult zzaak.zza(zzaak, ConnectionResult)>
	//  131  326:pop             
		break MISSING_BLOCK_LABEL_370;
	//  132  327:goto            370
		Log.e("ConnectionlessGAC", "Unexpected availability exception", ((Throwable) (task.getException())));
	//  133  330:ldc1            #132 <String "ConnectionlessGAC">
	//  134  332:ldc1            #134 <String "Unexpected availability exception">
	//  135  334:aload_1         
	//  136  335:invokevirtual   #107 <Method Exception Task.getException()>
	//  137  338:invokestatic    #140 <Method int Log.e(String, String, Throwable)>
	//  138  341:pop             
		zzaak.zza(zzaBa, Collections.emptyMap());
	//  139  342:aload_0         
	//  140  343:getfield        #16  <Field zzaak zzaBa>
	//  141  346:invokestatic    #146 <Method Map Collections.emptyMap()>
	//  142  349:invokestatic    #65  <Method Map zzaak.zza(zzaak, Map)>
	//  143  352:pop             
		zzaak.zza(zzaBa, new ConnectionResult(8));
	//  144  353:aload_0         
	//  145  354:getfield        #16  <Field zzaak zzaBa>
	//  146  357:new             #95  <Class ConnectionResult>
	//  147  360:dup             
	//  148  361:bipush          8
	//  149  363:invokespecial   #119 <Method void ConnectionResult(int)>
	//  150  366:invokestatic    #130 <Method ConnectionResult zzaak.zza(zzaak, ConnectionResult)>
	//  151  369:pop             
		if(zzaak.zzg(zzaBa) != null)
	//* 152  370:aload_0         
	//* 153  371:getfield        #16  <Field zzaak zzaBa>
	//* 154  374:invokestatic    #149 <Method Map zzaak.zzg(zzaak)>
	//* 155  377:ifnull          414
		{
			zzaak.zzd(zzaBa).putAll(zzaak.zzg(zzaBa));
	//  156  380:aload_0         
	//  157  381:getfield        #16  <Field zzaak zzaBa>
	//  158  384:invokestatic    #89  <Method Map zzaak.zzd(zzaak)>
	//  159  387:aload_0         
	//  160  388:getfield        #16  <Field zzaak zzaBa>
	//  161  391:invokestatic    #149 <Method Map zzaak.zzg(zzaak)>
	//  162  394:invokeinterface #153 <Method void Map.putAll(Map)>
			zzaak.zza(zzaBa, zzaak.zzf(zzaBa));
	//  163  399:aload_0         
	//  164  400:getfield        #16  <Field zzaak zzaBa>
	//  165  403:aload_0         
	//  166  404:getfield        #16  <Field zzaak zzaBa>
	//  167  407:invokestatic    #127 <Method ConnectionResult zzaak.zzf(zzaak)>
	//  168  410:invokestatic    #130 <Method ConnectionResult zzaak.zza(zzaak, ConnectionResult)>
	//  169  413:pop             
		}
		if(zzaak.zzh(zzaBa) == null)
	//* 170  414:aload_0         
	//* 171  415:getfield        #16  <Field zzaak zzaBa>
	//* 172  418:invokestatic    #156 <Method ConnectionResult zzaak.zzh(zzaak)>
	//* 173  421:ifnonnull       441
		{
			zzaak.zzi(zzaBa);
	//  174  424:aload_0         
	//  175  425:getfield        #16  <Field zzaak zzaBa>
	//  176  428:invokestatic    #159 <Method void zzaak.zzi(zzaak)>
			zzaak.zzj(zzaBa);
	//  177  431:aload_0         
	//  178  432:getfield        #16  <Field zzaak zzaBa>
	//  179  435:invokestatic    #162 <Method void zzaak.zzj(zzaak)>
			break MISSING_BLOCK_LABEL_467;
	//  180  438:goto            467
		}
		zzaak.zza(zzaBa, false);
	//  181  441:aload_0         
	//  182  442:getfield        #16  <Field zzaak zzaBa>
	//  183  445:iconst_0        
	//  184  446:invokestatic    #165 <Method boolean zzaak.zza(zzaak, boolean)>
	//  185  449:pop             
		zzaak.zzk(zzaBa).zzc(zzaak.zzh(zzaBa));
	//  186  450:aload_0         
	//  187  451:getfield        #16  <Field zzaak zzaBa>
	//  188  454:invokestatic    #169 <Method zzaat zzaak.zzk(zzaak)>
	//  189  457:aload_0         
	//  190  458:getfield        #16  <Field zzaak zzaBa>
	//  191  461:invokestatic    #156 <Method ConnectionResult zzaak.zzh(zzaak)>
	//  192  464:invokevirtual   #174 <Method void zzaat.zzc(ConnectionResult)>
		zzaak.zzl(zzaBa).signalAll();
	//  193  467:aload_0         
	//  194  468:getfield        #16  <Field zzaak zzaBa>
	//  195  471:invokestatic    #178 <Method Condition zzaak.zzl(zzaak)>
	//  196  474:invokeinterface #183 <Method void Condition.signalAll()>
		zzaak.zza(zzaBa).unlock();
	//  197  479:aload_0         
	//  198  480:getfield        #16  <Field zzaak zzaBa>
	//  199  483:invokestatic    #29  <Method Lock zzaak.zza(zzaak)>
	//  200  486:invokeinterface #41  <Method void Lock.unlock()>
		return;
	//  201  491:return          
		task;
	//  202  492:astore_1        
		zzaak.zza(zzaBa).unlock();
	//  203  493:aload_0         
	//  204  494:getfield        #16  <Field zzaak zzaBa>
	//  205  497:invokestatic    #29  <Method Lock zzaak.zza(zzaak)>
	//  206  500:invokeinterface #41  <Method void Lock.unlock()>
		throw task;
	//  207  505:aload_1         
	//  208  506:athrow          
	//* 209  507:goto            370
	//* 210  510:goto            204
	//* 211  513:goto            312
	}

	final zzaak zzaBa;

	private zzaak$zza(zzaak zzaak1)
	{
		zzaBa = zzaak1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzaak zzaBa>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	zzaak$zza(zzaak zzaak1, zzaak._cls1 _pcls1)
	{
		this(zzaak1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void zzaak$zza(zzaak)>
	//    3    5:return          
	}
}
