// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.zze;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzabc, zzaag, zzaaj, zzaax, 
//			zzaat, zzadb, zzaby, zzabq

public class zzaak
	implements zzabc
{
	class zza
		implements OnCompleteListener
	{

		public void onComplete(Task task)
		{
			zzaak.zza(zzaBa).lock();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field zzaak zzaBa>
		//    2    4:invokestatic    #29  <Method Lock zzaak.zza(zzaak)>
		//    3    7:invokeinterface #34  <Method void Lock.lock()>
			boolean flag = zzaak.zzb(zzaBa);
		//    4   12:aload_0         
		//    5   13:getfield        #16  <Field zzaak zzaBa>
		//    6   16:invokestatic    #38  <Method boolean zzaak.zzb(zzaak)>
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
			if(!(task.getException() instanceof com.google.android.gms.common.api.zzb))
				break MISSING_BLOCK_LABEL_330;
		//   51  131:aload_1         
		//   52  132:invokevirtual   #107 <Method Exception Task.getException()>
		//   53  135:instanceof      #109 <Class com.google.android.gms.common.api.zzb>
		//   54  138:ifeq            330
			task = ((Task) ((com.google.android.gms.common.api.zzb)task.getException()));
		//   55  141:aload_1         
		//   56  142:invokevirtual   #107 <Method Exception Task.getException()>
		//   57  145:checkcast       #109 <Class com.google.android.gms.common.api.zzb>
		//   58  148:astore_1        
			if(!com.google.android.gms.internal.zzaak.zze(zzaBa))
				break MISSING_BLOCK_LABEL_300;
		//   59  149:aload_0         
		//   60  150:getfield        #16  <Field zzaak zzaBa>
		//   61  153:invokestatic    #112 <Method boolean com.google.android.gms.internal.zzaak.zze(zzaak)>
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
				connectionresult = ((com.google.android.gms.common.api.zzb) (task)).zza(((com.google.android.gms.common.api.zzc) (zzaaj2)));
		//   90  231:aload_1         
		//   91  232:aload           4
		//   92  234:invokevirtual   #115 <Method ConnectionResult com.google.android.gms.common.api.zzb.zza(com.google.android.gms.common.api.zzc)>
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
			zzaak.zza(zzaBa, ((Map) (((com.google.android.gms.common.api.zzb) (task)).zzvj())));
		//  119  300:aload_0         
		//  120  301:getfield        #16  <Field zzaak zzaBa>
		//  121  304:aload_1         
		//  122  305:invokevirtual   #123 <Method ArrayMap com.google.android.gms.common.api.zzb.zzvj()>
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
			if(com.google.android.gms.internal.zzaak.zzg(zzaBa) != null)
		//* 152  370:aload_0         
		//* 153  371:getfield        #16  <Field zzaak zzaBa>
		//* 154  374:invokestatic    #149 <Method Map com.google.android.gms.internal.zzaak.zzg(zzaak)>
		//* 155  377:ifnull          414
			{
				zzaak.zzd(zzaBa).putAll(com.google.android.gms.internal.zzaak.zzg(zzaBa));
		//  156  380:aload_0         
		//  157  381:getfield        #16  <Field zzaak zzaBa>
		//  158  384:invokestatic    #89  <Method Map zzaak.zzd(zzaak)>
		//  159  387:aload_0         
		//  160  388:getfield        #16  <Field zzaak zzaBa>
		//  161  391:invokestatic    #149 <Method Map com.google.android.gms.internal.zzaak.zzg(zzaak)>
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

		private zza()
		{
			zzaBa = zzaak.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field zzaak zzaBa>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}

	}

	class zzb
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
			if(zzaak.zzb(zzaBa))
				break MISSING_BLOCK_LABEL_44;
		//    4   12:aload_0         
		//    5   13:getfield        #18  <Field zzaak zzaBa>
		//    6   16:invokestatic    #45  <Method boolean zzaak.zzb(zzaak)>
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
				zzaak.zzb(zzaBa, ((Map) (new ArrayMap(zzaak.zzm(zzaBa).size()))));
		//   19   51:aload_0         
		//   20   52:getfield        #18  <Field zzaak zzaBa>
		//   21   55:new             #56  <Class ArrayMap>
		//   22   58:dup             
		//   23   59:aload_0         
		//   24   60:getfield        #18  <Field zzaak zzaBa>
		//   25   63:invokestatic    #60  <Method Map zzaak.zzm(zzaak)>
		//   26   66:invokeinterface #66  <Method int Map.size()>
		//   27   71:invokespecial   #69  <Method void ArrayMap(int)>
		//   28   74:invokestatic    #72  <Method Map zzaak.zzb(zzaak, Map)>
		//   29   77:pop             
				zzaaj zzaaj1;
				for(task = ((Task) (zzaak.zzm(zzaBa).values().iterator())); ((Iterator) (task)).hasNext(); com.google.android.gms.internal.zzaak.zzg(zzaBa).put(((Object) (zzaaj1.getApiKey())), ((Object) (ConnectionResult.zzayj))))
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
		//   45  119:invokestatic    #96  <Method Map com.google.android.gms.internal.zzaak.zzg(zzaak)>
		//   46  122:aload_2         
		//   47  123:invokevirtual   #100 <Method zzzz zzaaj.getApiKey()>
		//   48  126:getstatic       #106 <Field ConnectionResult ConnectionResult.zzayj>
		//   49  129:invokeinterface #110 <Method Object Map.put(Object, Object)>
		//   50  134:pop             
				break MISSING_BLOCK_LABEL_341;
		//   51  135:goto            96
			}
			Iterator iterator;
			if(!(task.getException() instanceof com.google.android.gms.common.api.zzb))
				break MISSING_BLOCK_LABEL_318;
		//   52  138:aload_1         
		//   53  139:invokevirtual   #114 <Method Exception Task.getException()>
		//   54  142:instanceof      #116 <Class com.google.android.gms.common.api.zzb>
		//   55  145:ifeq            318
			task = ((Task) ((com.google.android.gms.common.api.zzb)task.getException()));
		//   56  148:aload_1         
		//   57  149:invokevirtual   #114 <Method Exception Task.getException()>
		//   58  152:checkcast       #116 <Class com.google.android.gms.common.api.zzb>
		//   59  155:astore_1        
			if(!com.google.android.gms.internal.zzaak.zze(zzaBa))
				break MISSING_BLOCK_LABEL_303;
		//   60  156:aload_0         
		//   61  157:getfield        #18  <Field zzaak zzaBa>
		//   62  160:invokestatic    #119 <Method boolean com.google.android.gms.internal.zzaak.zze(zzaak)>
		//   63  163:ifeq            303
			zzaak.zzb(zzaBa, ((Map) (new ArrayMap(zzaak.zzm(zzaBa).size()))));
		//   64  166:aload_0         
		//   65  167:getfield        #18  <Field zzaak zzaBa>
		//   66  170:new             #56  <Class ArrayMap>
		//   67  173:dup             
		//   68  174:aload_0         
		//   69  175:getfield        #18  <Field zzaak zzaBa>
		//   70  178:invokestatic    #60  <Method Map zzaak.zzm(zzaak)>
		//   71  181:invokeinterface #66  <Method int Map.size()>
		//   72  186:invokespecial   #69  <Method void ArrayMap(int)>
		//   73  189:invokestatic    #72  <Method Map zzaak.zzb(zzaak, Map)>
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
				connectionresult = ((com.google.android.gms.common.api.zzb) (task)).zza(((com.google.android.gms.common.api.zzc) (zzaaj2)));
		//   91  236:aload_1         
		//   92  237:aload_3         
		//   93  238:invokevirtual   #122 <Method ConnectionResult com.google.android.gms.common.api.zzb.zza(com.google.android.gms.common.api.zzc)>
		//   94  241:astore          5
				if(!zzaak.zza(zzaBa, zzaaj2, connectionresult))
					break MISSING_BLOCK_LABEL_283;
		//   95  243:aload_0         
		//   96  244:getfield        #18  <Field zzaak zzaBa>
		//   97  247:aload_3         
		//   98  248:aload           5
		//   99  250:invokestatic    #125 <Method boolean zzaak.zza(zzaak, zzaaj, ConnectionResult)>
		//  100  253:ifeq            283
				com.google.android.gms.internal.zzaak.zzg(zzaBa).put(((Object) (zzzz)), ((Object) (new ConnectionResult(16))));
		//  101  256:aload_0         
		//  102  257:getfield        #18  <Field zzaak zzaBa>
		//  103  260:invokestatic    #96  <Method Map com.google.android.gms.internal.zzaak.zzg(zzaak)>
		//  104  263:aload           4
		//  105  265:new             #102 <Class ConnectionResult>
		//  106  268:dup             
		//  107  269:bipush          16
		//  108  271:invokespecial   #126 <Method void ConnectionResult(int)>
		//  109  274:invokeinterface #110 <Method Object Map.put(Object, Object)>
		//  110  279:pop             
			} while(true);
		//  111  280:goto            446
			com.google.android.gms.internal.zzaak.zzg(zzaBa).put(((Object) (zzzz)), ((Object) (connectionresult)));
		//  112  283:aload_0         
		//  113  284:getfield        #18  <Field zzaak zzaBa>
		//  114  287:invokestatic    #96  <Method Map com.google.android.gms.internal.zzaak.zzg(zzaak)>
		//  115  290:aload           4
		//  116  292:aload           5
		//  117  294:invokeinterface #110 <Method Object Map.put(Object, Object)>
		//  118  299:pop             
			if(true) goto _L2; else goto _L1
		//  119  300:goto            446
_L1:
			zzaak.zzb(zzaBa, ((Map) (((com.google.android.gms.common.api.zzb) (task)).zzvj())));
		//  120  303:aload_0         
		//  121  304:getfield        #18  <Field zzaak zzaBa>
		//  122  307:aload_1         
		//  123  308:invokevirtual   #130 <Method ArrayMap com.google.android.gms.common.api.zzb.zzvj()>
		//  124  311:invokestatic    #72  <Method Map zzaak.zzb(zzaak, Map)>
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
			zzaak.zzb(zzaBa, Collections.emptyMap());
		//  133  330:aload_0         
		//  134  331:getfield        #18  <Field zzaak zzaBa>
		//  135  334:invokestatic    #146 <Method Map Collections.emptyMap()>
		//  136  337:invokestatic    #72  <Method Map zzaak.zzb(zzaak, Map)>
		//  137  340:pop             
			if(zzaBa.isConnected())
		//* 138  341:aload_0         
		//* 139  342:getfield        #18  <Field zzaak zzaBa>
		//* 140  345:invokevirtual   #149 <Method boolean zzaak.isConnected()>
		//* 141  348:ifeq            406
			{
				zzaak.zzd(zzaBa).putAll(com.google.android.gms.internal.zzaak.zzg(zzaBa));
		//  142  351:aload_0         
		//  143  352:getfield        #18  <Field zzaak zzaBa>
		//  144  355:invokestatic    #152 <Method Map zzaak.zzd(zzaak)>
		//  145  358:aload_0         
		//  146  359:getfield        #18  <Field zzaak zzaBa>
		//  147  362:invokestatic    #96  <Method Map com.google.android.gms.internal.zzaak.zzg(zzaak)>
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

		zzb(zzabq zzabq1)
		{
			zzaBa = zzaak.this;
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


	public zzaak(Context context, Lock lock, Looper looper, zze zze1, Map map, zzg zzg1, Map map1, 
			com.google.android.gms.common.api.Api.zza zza1, ArrayList arraylist, zzaat zzaat1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #55  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #56  <Method void HashMap()>
	//    6   12:putfield        #58  <Field Map zzaAM>
	//    7   15:aload_0         
	//    8   16:new             #55  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #56  <Method void HashMap()>
	//   11   23:putfield        #60  <Field Map zzaAN>
	//   12   26:aload_0         
	//   13   27:new             #62  <Class LinkedList>
	//   14   30:dup             
	//   15   31:invokespecial   #63  <Method void LinkedList()>
	//   16   34:putfield        #65  <Field Queue zzaAU>
		zzaAG = lock;
	//   17   37:aload_0         
	//   18   38:aload_2         
	//   19   39:putfield        #67  <Field Lock zzaAG>
		zzrs = looper;
	//   20   42:aload_0         
	//   21   43:aload_3         
	//   22   44:putfield        #69  <Field Looper zzrs>
		zzaAR = lock.newCondition();
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:invokeinterface #75  <Method Condition Lock.newCondition()>
	//   26   54:putfield        #77  <Field Condition zzaAR>
		zzaAQ = zze1;
	//   27   57:aload_0         
	//   28   58:aload           4
	//   29   60:putfield        #79  <Field zze zzaAQ>
		zzaAP = zzaat1;
	//   30   63:aload_0         
	//   31   64:aload           10
	//   32   66:putfield        #81  <Field zzaat zzaAP>
		zzaAO = map1;
	//   33   69:aload_0         
	//   34   70:aload           7
	//   35   72:putfield        #83  <Field Map zzaAO>
		zzaAL = zzg1;
	//   36   75:aload_0         
	//   37   76:aload           6
	//   38   78:putfield        #85  <Field zzg zzaAL>
		zzaAS = flag;
	//   39   81:aload_0         
	//   40   82:iload           11
	//   41   84:putfield        #87  <Field boolean zzaAS>
		lock = ((Lock) (new HashMap()));
	//   42   87:new             #55  <Class HashMap>
	//   43   90:dup             
	//   44   91:invokespecial   #56  <Method void HashMap()>
	//   45   94:astore_2        
		for(zze1 = ((zze) (map1.keySet().iterator())); ((Iterator) (zze1)).hasNext(); ((Map) (lock)).put(((Object) (((Api) (map1)).zzvg())), ((Object) (map1))))
	//*  46   95:aload           7
	//*  47   97:invokeinterface #93  <Method Set Map.keySet()>
	//*  48  102:invokeinterface #99  <Method Iterator Set.iterator()>
	//*  49  107:astore          4
	//*  50  109:aload           4
	//*  51  111:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//*  52  116:ifeq            148
			map1 = ((Map) ((Api)((Iterator) (zze1)).next()));
	//   53  119:aload           4
	//   54  121:invokeinterface #109 <Method Object Iterator.next()>
	//   55  126:checkcast       #111 <Class Api>
	//   56  129:astore          7

	//   57  131:aload_2         
	//   58  132:aload           7
	//   59  134:invokevirtual   #115 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//   60  137:aload           7
	//   61  139:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//   62  144:pop             
	//*  63  145:goto            109
		zze1 = ((zze) (new HashMap()));
	//   64  148:new             #55  <Class HashMap>
	//   65  151:dup             
	//   66  152:invokespecial   #56  <Method void HashMap()>
	//   67  155:astore          4
		for(map1 = ((Map) (arraylist.iterator())); ((Iterator) (map1)).hasNext(); ((Map) (zze1)).put(((Object) (((zzaag) (arraylist)).zzaxf)), ((Object) (arraylist))))
	//*  68  157:aload           9
	//*  69  159:invokevirtual   #122 <Method Iterator ArrayList.iterator()>
	//*  70  162:astore          7
	//*  71  164:aload           7
	//*  72  166:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//*  73  171:ifeq            204
			arraylist = ((ArrayList) ((zzaag)((Iterator) (map1)).next()));
	//   74  174:aload           7
	//   75  176:invokeinterface #109 <Method Object Iterator.next()>
	//   76  181:checkcast       #124 <Class zzaag>
	//   77  184:astore          9

	//   78  186:aload           4
	//   79  188:aload           9
	//   80  190:getfield        #128 <Field Api zzaag.zzaxf>
	//   81  193:aload           9
	//   82  195:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//   83  200:pop             
	//*  84  201:goto            164
		boolean flag2 = false;
	//   85  204:iconst_0        
	//   86  205:istore          13
		boolean flag1 = true;
	//   87  207:iconst_1        
	//   88  208:istore          12
		boolean flag3 = false;
	//   89  210:iconst_0        
	//   90  211:istore          14
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*  91  213:aload           5
	//*  92  215:invokeinterface #131 <Method Set Map.entrySet()>
	//*  93  220:invokeinterface #99  <Method Iterator Set.iterator()>
	//*  94  225:astore          5
	//*  95  227:aload           5
	//*  96  229:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//*  97  234:ifeq            429
		{
			map1 = ((Map) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//   98  237:aload           5
	//   99  239:invokeinterface #109 <Method Object Iterator.next()>
	//  100  244:checkcast       #133 <Class java.util.Map$Entry>
	//  101  247:astore          7
			zzaat1 = ((zzaat) ((Api)((Map) (lock)).get(((java.util.Map.Entry) (map1)).getKey())));
	//  102  249:aload_2         
	//  103  250:aload           7
	//  104  252:invokeinterface #136 <Method Object java.util.Map$Entry.getKey()>
	//  105  257:invokeinterface #140 <Method Object Map.get(Object)>
	//  106  262:checkcast       #111 <Class Api>
	//  107  265:astore          10
			arraylist = ((ArrayList) ((com.google.android.gms.common.api.Api.zze)((java.util.Map.Entry) (map1)).getValue()));
	//  108  267:aload           7
	//  109  269:invokeinterface #143 <Method Object java.util.Map$Entry.getValue()>
	//  110  274:checkcast       #145 <Class com.google.android.gms.common.api.Api$zze>
	//  111  277:astore          9
			boolean flag4;
			if(((com.google.android.gms.common.api.Api.zze) (arraylist)).zzvh())
	//* 112  279:aload           9
	//* 113  281:invokeinterface #148 <Method boolean com.google.android.gms.common.api.Api$zze.zzvh()>
	//* 114  286:ifeq            334
			{
				boolean flag5 = true;
	//  115  289:iconst_1        
	//  116  290:istore          16
				flag4 = flag1;
	//  117  292:iload           12
	//  118  294:istore          15
				flag3 = flag5;
	//  119  296:iload           16
	//  120  298:istore          14
				if(!((Boolean)zzaAO.get(((Object) (zzaat1)))).booleanValue())
	//* 121  300:aload_0         
	//* 122  301:getfield        #83  <Field Map zzaAO>
	//* 123  304:aload           10
	//* 124  306:invokeinterface #140 <Method Object Map.get(Object)>
	//* 125  311:checkcast       #150 <Class Boolean>
	//* 126  314:invokevirtual   #153 <Method boolean Boolean.booleanValue()>
	//* 127  317:ifne            337
				{
					flag2 = true;
	//  128  320:iconst_1        
	//  129  321:istore          13
					flag4 = flag1;
	//  130  323:iload           12
	//  131  325:istore          15
					flag3 = flag5;
	//  132  327:iload           16
	//  133  329:istore          14
				}
			} else
	//* 134  331:goto            337
			{
				flag4 = false;
	//  135  334:iconst_0        
	//  136  335:istore          15
			}
			zzaat1 = ((zzaat) (new zzaaj(context, ((Api) (zzaat1)), looper, ((com.google.android.gms.common.api.Api.zze) (arraylist)), (zzaag)((Map) (zze1)).get(((Object) (zzaat1))), zzg1, zza1)));
	//  137  337:new             #155 <Class zzaaj>
	//  138  340:dup             
	//  139  341:aload_1         
	//  140  342:aload           10
	//  141  344:aload_3         
	//  142  345:aload           9
	//  143  347:aload           4
	//  144  349:aload           10
	//  145  351:invokeinterface #140 <Method Object Map.get(Object)>
	//  146  356:checkcast       #124 <Class zzaag>
	//  147  359:aload           6
	//  148  361:aload           8
	//  149  363:invokespecial   #158 <Method void zzaaj(Context, Api, Looper, com.google.android.gms.common.api.Api$zze, zzaag, zzg, com.google.android.gms.common.api.Api$zza)>
	//  150  366:astore          10
			zzaAM.put(((Object) ((com.google.android.gms.common.api.Api.zzc)((java.util.Map.Entry) (map1)).getKey())), ((Object) (zzaat1)));
	//  151  368:aload_0         
	//  152  369:getfield        #58  <Field Map zzaAM>
	//  153  372:aload           7
	//  154  374:invokeinterface #136 <Method Object java.util.Map$Entry.getKey()>
	//  155  379:checkcast       #160 <Class com.google.android.gms.common.api.Api$zzc>
	//  156  382:aload           10
	//  157  384:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  158  389:pop             
			if(((com.google.android.gms.common.api.Api.zze) (arraylist)).zzrd())
	//* 159  390:aload           9
	//* 160  392:invokeinterface #163 <Method boolean com.google.android.gms.common.api.Api$zze.zzrd()>
	//* 161  397:ifeq            422
				zzaAN.put(((Object) ((com.google.android.gms.common.api.Api.zzc)((java.util.Map.Entry) (map1)).getKey())), ((Object) (zzaat1)));
	//  162  400:aload_0         
	//  163  401:getfield        #60  <Field Map zzaAN>
	//  164  404:aload           7
	//  165  406:invokeinterface #136 <Method Object java.util.Map$Entry.getKey()>
	//  166  411:checkcast       #160 <Class com.google.android.gms.common.api.Api$zzc>
	//  167  414:aload           10
	//  168  416:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//  169  421:pop             
			flag1 = flag4;
	//  170  422:iload           15
	//  171  424:istore          12
		}

	//* 172  426:goto            227
		if(flag3 && !flag1 && !flag2)
	//* 173  429:iload           14
	//* 174  431:ifeq            450
	//* 175  434:iload           12
	//* 176  436:ifne            450
	//* 177  439:iload           13
	//* 178  441:ifne            450
			flag = true;
	//  179  444:iconst_1        
	//  180  445:istore          11
		else
	//* 181  447:goto            453
			flag = false;
	//  182  450:iconst_0        
	//  183  451:istore          11
		zzaAT = flag;
	//  184  453:aload_0         
	//  185  454:iload           11
	//  186  456:putfield        #165 <Field boolean zzaAT>
	//  187  459:aload_0         
	//  188  460:invokestatic    #171 <Method zzaax zzaax.zzww()>
	//  189  463:putfield        #173 <Field zzaax zzayX>
	//  190  466:return          
	}

	static ConnectionResult zza(zzaak zzaak1, ConnectionResult connectionresult)
	{
		zzaak1.zzaAZ = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field ConnectionResult zzaAZ>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Map zza(zzaak zzaak1, Map map)
	{
		zzaak1.zzaAW = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #182 <Field Map zzaAW>
		return map;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Lock zza(zzaak zzaak1)
	{
		return zzaak1.zzaAG;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zzaAG>
	//    2    4:areturn         
	}

	private boolean zza(zzaaj zzaaj1, ConnectionResult connectionresult)
	{
		return !connectionresult.isSuccess() && !connectionresult.hasResolution() && ((Boolean)zzaAO.get(((Object) (zzaaj1.getApi())))).booleanValue() && zzaaj1.zzvU().zzvh() && zzaAQ.isUserResolvableError(connectionresult.getErrorCode());
	//    0    0:aload_2         
	//    1    1:invokevirtual   #189 <Method boolean ConnectionResult.isSuccess()>
	//    2    4:ifne            64
	//    3    7:aload_2         
	//    4    8:invokevirtual   #192 <Method boolean ConnectionResult.hasResolution()>
	//    5   11:ifne            64
	//    6   14:aload_0         
	//    7   15:getfield        #83  <Field Map zzaAO>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #196 <Method Api zzaaj.getApi()>
	//   10   22:invokeinterface #140 <Method Object Map.get(Object)>
	//   11   27:checkcast       #150 <Class Boolean>
	//   12   30:invokevirtual   #153 <Method boolean Boolean.booleanValue()>
	//   13   33:ifeq            64
	//   14   36:aload_1         
	//   15   37:invokevirtual   #200 <Method com.google.android.gms.common.api.Api$zze zzaaj.zzvU()>
	//   16   40:invokeinterface #148 <Method boolean com.google.android.gms.common.api.Api$zze.zzvh()>
	//   17   45:ifeq            64
	//   18   48:aload_0         
	//   19   49:getfield        #79  <Field zze zzaAQ>
	//   20   52:aload_2         
	//   21   53:invokevirtual   #204 <Method int ConnectionResult.getErrorCode()>
	//   22   56:invokevirtual   #210 <Method boolean zze.isUserResolvableError(int)>
	//   23   59:ifeq            64
	//   24   62:iconst_1        
	//   25   63:ireturn         
	//   26   64:iconst_0        
	//   27   65:ireturn         
	}

	static boolean zza(zzaak zzaak1, zzaaj zzaaj1, ConnectionResult connectionresult)
	{
		return zzaak1.zza(zzaaj1, connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #214 <Method boolean zza(zzaaj, ConnectionResult)>
	//    4    6:ireturn         
	}

	static boolean zza(zzaak zzaak1, boolean flag)
	{
		zzaak1.zzaAV = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #217 <Field boolean zzaAV>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private ConnectionResult zzb(com.google.android.gms.common.api.Api.zzc zzc1)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zzaAG>
	//    2    4:invokeinterface #223 <Method void Lock.lock()>
		zzc1 = ((com.google.android.gms.common.api.Api.zzc) ((zzaaj)zzaAM.get(((Object) (zzc1)))));
	//    3    9:aload_0         
	//    4   10:getfield        #58  <Field Map zzaAM>
	//    5   13:aload_1         
	//    6   14:invokeinterface #140 <Method Object Map.get(Object)>
	//    7   19:checkcast       #155 <Class zzaaj>
	//    8   22:astore_1        
		if(zzaAW == null || zzc1 == null)
			break MISSING_BLOCK_LABEL_62;
	//    9   23:aload_0         
	//   10   24:getfield        #182 <Field Map zzaAW>
	//   11   27:ifnull          62
	//   12   30:aload_1         
	//   13   31:ifnull          62
		zzc1 = ((com.google.android.gms.common.api.Api.zzc) ((ConnectionResult)zzaAW.get(((Object) (((zzaaj) (zzc1)).getApiKey())))));
	//   14   34:aload_0         
	//   15   35:getfield        #182 <Field Map zzaAW>
	//   16   38:aload_1         
	//   17   39:invokevirtual   #227 <Method zzzz zzaaj.getApiKey()>
	//   18   42:invokeinterface #140 <Method Object Map.get(Object)>
	//   19   47:checkcast       #186 <Class ConnectionResult>
	//   20   50:astore_1        
		zzaAG.unlock();
	//   21   51:aload_0         
	//   22   52:getfield        #67  <Field Lock zzaAG>
	//   23   55:invokeinterface #230 <Method void Lock.unlock()>
		return ((ConnectionResult) (zzc1));
	//   24   60:aload_1         
	//   25   61:areturn         
		zzaAG.unlock();
	//   26   62:aload_0         
	//   27   63:getfield        #67  <Field Lock zzaAG>
	//   28   66:invokeinterface #230 <Method void Lock.unlock()>
		return null;
	//   29   71:aconst_null     
	//   30   72:areturn         
		zzc1;
	//   31   73:astore_1        
		zzaAG.unlock();
	//   32   74:aload_0         
	//   33   75:getfield        #67  <Field Lock zzaAG>
	//   34   78:invokeinterface #230 <Method void Lock.unlock()>
		throw zzc1;
	//   35   83:aload_1         
	//   36   84:athrow          
	}

	static Map zzb(zzaak zzaak1, Map map)
	{
		zzaak1.zzaAX = map;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #235 <Field Map zzaAX>
		return map;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static boolean zzb(zzaak zzaak1)
	{
		return zzaak1.zzaAV;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field boolean zzaAV>
	//    2    4:ireturn         
	}

	static Map zzc(zzaak zzaak1)
	{
		return zzaak1.zzaAM;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Map zzaAM>
	//    2    4:areturn         
	}

	static Map zzd(zzaak zzaak1)
	{
		return zzaak1.zzaAW;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field Map zzaAW>
	//    2    4:areturn         
	}

	private boolean zzd(zzaad.zza zza1)
	{
		com.google.android.gms.common.api.Api.zzc zzc1 = zza1.zzvg();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #243 <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//    2    4:astore_2        
		ConnectionResult connectionresult = zzb(zzc1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #245 <Method ConnectionResult zzb(com.google.android.gms.common.api.Api$zzc)>
	//    6   10:astore_3        
		if(connectionresult != null && connectionresult.getErrorCode() == 4)
	//*   7   11:aload_3         
	//*   8   12:ifnull          68
	//*   9   15:aload_3         
	//*  10   16:invokevirtual   #204 <Method int ConnectionResult.getErrorCode()>
	//*  11   19:iconst_4        
	//*  12   20:icmpne          68
		{
			zza1.zzB(new Status(4, ((String) (null)), zzayX.zza(((zzaaj)zzaAM.get(((Object) (zzc1)))).getApiKey(), zzaAP.getSessionId())));
	//   13   23:aload_1         
	//   14   24:new             #247 <Class Status>
	//   15   27:dup             
	//   16   28:iconst_4        
	//   17   29:aconst_null     
	//   18   30:aload_0         
	//   19   31:getfield        #173 <Field zzaax zzayX>
	//   20   34:aload_0         
	//   21   35:getfield        #58  <Field Map zzaAM>
	//   22   38:aload_2         
	//   23   39:invokeinterface #140 <Method Object Map.get(Object)>
	//   24   44:checkcast       #155 <Class zzaaj>
	//   25   47:invokevirtual   #227 <Method zzzz zzaaj.getApiKey()>
	//   26   50:aload_0         
	//   27   51:getfield        #81  <Field zzaat zzaAP>
	//   28   54:invokevirtual   #252 <Method int zzaat.getSessionId()>
	//   29   57:invokevirtual   #255 <Method android.app.PendingIntent zzaax.zza(zzzz, int)>
	//   30   60:invokespecial   #258 <Method void Status(int, String, android.app.PendingIntent)>
	//   31   63:invokevirtual   #262 <Method void zzaad$zza.zzB(Status)>
			return true;
	//   32   66:iconst_1        
	//   33   67:ireturn         
		} else
		{
			return false;
	//   34   68:iconst_0        
	//   35   69:ireturn         
		}
	}

	static boolean zze(zzaak zzaak1)
	{
		return zzaak1.zzaAT;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field boolean zzaAT>
	//    2    4:ireturn         
	}

	static ConnectionResult zzf(zzaak zzaak1)
	{
		return zzaak1.zzvX();
	//    0    0:aload_0         
	//    1    1:invokespecial   #270 <Method ConnectionResult zzvX()>
	//    2    4:areturn         
	}

	static Map zzg(zzaak zzaak1)
	{
		return zzaak1.zzaAX;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field Map zzaAX>
	//    2    4:areturn         
	}

	static ConnectionResult zzh(zzaak zzaak1)
	{
		return zzaak1.zzaAZ;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field ConnectionResult zzaAZ>
	//    2    4:areturn         
	}

	static void zzi(zzaak zzaak1)
	{
		zzaak1.zzvV();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method void zzvV()>
	//    2    4:return          
	}

	static void zzj(zzaak zzaak1)
	{
		zzaak1.zzvW();
	//    0    0:aload_0         
	//    1    1:invokespecial   #281 <Method void zzvW()>
	//    2    4:return          
	}

	static zzaat zzk(zzaak zzaak1)
	{
		return zzaak1.zzaAP;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field zzaat zzaAP>
	//    2    4:areturn         
	}

	static Condition zzl(zzaak zzaak1)
	{
		return zzaak1.zzaAR;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Condition zzaAR>
	//    2    4:areturn         
	}

	static Map zzm(zzaak zzaak1)
	{
		return zzaak1.zzaAN;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field Map zzaAN>
	//    2    4:areturn         
	}

	private void zzvV()
	{
		if(zzaAL == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field zzg zzaAL>
	//*   2    4:ifnonnull       18
		{
			zzaAP.zzaBR = Collections.emptySet();
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field zzaat zzaAP>
	//    5   11:invokestatic    #291 <Method Set Collections.emptySet()>
	//    6   14:putfield        #295 <Field Set zzaat.zzaBR>
			return;
	//    7   17:return          
		}
		HashSet hashset = new HashSet(((Collection) (zzaAL.zzxL())));
	//    8   18:new             #297 <Class HashSet>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:getfield        #85  <Field zzg zzaAL>
	//   12   26:invokevirtual   #302 <Method Set zzg.zzxL()>
	//   13   29:invokespecial   #305 <Method void HashSet(Collection)>
	//   14   32:astore_1        
		Map map = zzaAL.zzxN();
	//   15   33:aload_0         
	//   16   34:getfield        #85  <Field zzg zzaAL>
	//   17   37:invokevirtual   #309 <Method Map zzg.zzxN()>
	//   18   40:astore_2        
		Iterator iterator = map.keySet().iterator();
	//   19   41:aload_2         
	//   20   42:invokeinterface #93  <Method Set Map.keySet()>
	//   21   47:invokeinterface #99  <Method Iterator Set.iterator()>
	//   22   52:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   23   53:aload_3         
	//   24   54:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   25   59:ifeq            118
			Api api = (Api)iterator.next();
	//   26   62:aload_3         
	//   27   63:invokeinterface #109 <Method Object Iterator.next()>
	//   28   68:checkcast       #111 <Class Api>
	//   29   71:astore          4
			ConnectionResult connectionresult = getConnectionResult(api);
	//   30   73:aload_0         
	//   31   74:aload           4
	//   32   76:invokevirtual   #313 <Method ConnectionResult getConnectionResult(Api)>
	//   33   79:astore          5
			if(connectionresult != null && connectionresult.isSuccess())
	//*  34   81:aload           5
	//*  35   83:ifnull          115
	//*  36   86:aload           5
	//*  37   88:invokevirtual   #189 <Method boolean ConnectionResult.isSuccess()>
	//*  38   91:ifeq            115
				((Set) (hashset)).addAll(((Collection) (((com.google.android.gms.common.internal.zzg.zza)map.get(((Object) (api)))).zzakq)));
	//   39   94:aload_1         
	//   40   95:aload_2         
	//   41   96:aload           4
	//   42   98:invokeinterface #140 <Method Object Map.get(Object)>
	//   43  103:checkcast       #315 <Class com.google.android.gms.common.internal.zzg$zza>
	//   44  106:getfield        #318 <Field Set com.google.android.gms.common.internal.zzg$zza.zzakq>
	//   45  109:invokeinterface #322 <Method boolean Set.addAll(Collection)>
	//   46  114:pop             
		} while(true);
	//   47  115:goto            53
		zzaAP.zzaBR = ((Set) (hashset));
	//   48  118:aload_0         
	//   49  119:getfield        #81  <Field zzaat zzaAP>
	//   50  122:aload_1         
	//   51  123:putfield        #295 <Field Set zzaat.zzaBR>
	//   52  126:return          
	}

	private void zzvW()
	{
		for(; !zzaAU.isEmpty(); zzb((zzaad.zza)zzaAU.remove()));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field Queue zzaAU>
	//    2    4:invokeinterface #327 <Method boolean Queue.isEmpty()>
	//    3    9:ifne            32
	//    4   12:aload_0         
	//    5   13:aload_0         
	//    6   14:getfield        #65  <Field Queue zzaAU>
	//    7   17:invokeinterface #330 <Method Object Queue.remove()>
	//    8   22:checkcast       #242 <Class zzaad$zza>
	//    9   25:invokevirtual   #333 <Method zzaad$zza zzb(zzaad$zza)>
	//   10   28:pop             
	//*  11   29:goto            0
		zzaAP.zzo(((android.os.Bundle) (null)));
	//   12   32:aload_0         
	//   13   33:getfield        #81  <Field zzaat zzaAP>
	//   14   36:aconst_null     
	//   15   37:invokevirtual   #337 <Method void zzaat.zzo(android.os.Bundle)>
	//   16   40:return          
	}

	private ConnectionResult zzvX()
	{
		ConnectionResult connectionresult1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		int j = 0;
	//    2    3:iconst_0        
	//    3    4:istore_2        
		ConnectionResult connectionresult = null;
	//    4    5:aconst_null     
	//    5    6:astore          5
		int i = 0;
	//    6    8:iconst_0        
	//    7    9:istore_1        
		Iterator iterator = zzaAM.values().iterator();
	//    8   10:aload_0         
	//    9   11:getfield        #58  <Field Map zzaAM>
	//   10   14:invokeinterface #341 <Method Collection Map.values()>
	//   11   19:invokeinterface #344 <Method Iterator Collection.iterator()>
	//   12   24:astore          8
label0:
		do
		{
			int l;
label1:
			{
				if(!iterator.hasNext())
					break label0;
	//   13   26:aload           8
	//   14   28:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   15   33:ifeq            214
				Object obj = ((Object) ((zzaaj)iterator.next()));
	//   16   36:aload           8
	//   17   38:invokeinterface #109 <Method Object Iterator.next()>
	//   18   43:checkcast       #155 <Class zzaaj>
	//   19   46:astore          7
				Api api = ((zzaaj) (obj)).getApi();
	//   20   48:aload           7
	//   21   50:invokevirtual   #196 <Method Api zzaaj.getApi()>
	//   22   53:astore          9
				obj = ((Object) (((zzaaj) (obj)).getApiKey()));
	//   23   55:aload           7
	//   24   57:invokevirtual   #227 <Method zzzz zzaaj.getApiKey()>
	//   25   60:astore          7
				obj = ((Object) ((ConnectionResult)zzaAW.get(obj)));
	//   26   62:aload_0         
	//   27   63:getfield        #182 <Field Map zzaAW>
	//   28   66:aload           7
	//   29   68:invokeinterface #140 <Method Object Map.get(Object)>
	//   30   73:checkcast       #186 <Class ConnectionResult>
	//   31   76:astore          7
				if(((ConnectionResult) (obj)).isSuccess() || ((Boolean)zzaAO.get(((Object) (api)))).booleanValue() && !((ConnectionResult) (obj)).hasResolution() && !zzaAQ.isUserResolvableError(((ConnectionResult) (obj)).getErrorCode()))
	//*  32   78:aload           7
	//*  33   80:invokevirtual   #189 <Method boolean ConnectionResult.isSuccess()>
	//*  34   83:ifeq            89
	//*  35   86:goto            26
	//*  36   89:aload_0         
	//*  37   90:getfield        #83  <Field Map zzaAO>
	//*  38   93:aload           9
	//*  39   95:invokeinterface #140 <Method Object Map.get(Object)>
	//*  40  100:checkcast       #150 <Class Boolean>
	//*  41  103:invokevirtual   #153 <Method boolean Boolean.booleanValue()>
	//*  42  106:ifeq            135
	//*  43  109:aload           7
	//*  44  111:invokevirtual   #192 <Method boolean ConnectionResult.hasResolution()>
	//*  45  114:ifne            135
	//*  46  117:aload_0         
	//*  47  118:getfield        #79  <Field zze zzaAQ>
	//*  48  121:aload           7
	//*  49  123:invokevirtual   #204 <Method int ConnectionResult.getErrorCode()>
	//*  50  126:invokevirtual   #210 <Method boolean zze.isUserResolvableError(int)>
	//*  51  129:ifne            135
					continue;
	//   52  132:goto            26
				if(((ConnectionResult) (obj)).getErrorCode() == 4 && zzaAS)
	//*  53  135:aload           7
	//*  54  137:invokevirtual   #204 <Method int ConnectionResult.getErrorCode()>
	//*  55  140:iconst_4        
	//*  56  141:icmpne          179
	//*  57  144:aload_0         
	//*  58  145:getfield        #87  <Field boolean zzaAS>
	//*  59  148:ifeq            179
				{
					int k = api.zzve().getPriority();
	//   60  151:aload           9
	//   61  153:invokevirtual   #348 <Method com.google.android.gms.common.api.Api$zzd Api.zzve()>
	//   62  156:invokevirtual   #353 <Method int com.google.android.gms.common.api.Api$zzd.getPriority()>
	//   63  159:istore_3        
					if(connectionresult == null || i > k)
	//*  64  160:aload           5
	//*  65  162:ifnull          170
	//*  66  165:iload_1         
	//*  67  166:iload_3         
	//*  68  167:icmple          26
					{
						connectionresult = ((ConnectionResult) (obj));
	//   69  170:aload           7
	//   70  172:astore          5
						i = k;
	//   71  174:iload_3         
	//   72  175:istore_1        
					}
					continue;
	//   73  176:goto            26
				}
				int i1 = api.zzve().getPriority();
	//   74  179:aload           9
	//   75  181:invokevirtual   #348 <Method com.google.android.gms.common.api.Api$zzd Api.zzve()>
	//   76  184:invokevirtual   #353 <Method int com.google.android.gms.common.api.Api$zzd.getPriority()>
	//   77  187:istore          4
				if(connectionresult1 != null)
	//*  78  189:aload           6
	//*  79  191:ifnull          202
				{
					l = j;
	//   80  194:iload_2         
	//   81  195:istore_3        
					if(j <= i1)
						break label1;
	//   82  196:iload_2         
	//   83  197:iload           4
	//   84  199:icmple          209
				}
				connectionresult1 = ((ConnectionResult) (obj));
	//   85  202:aload           7
	//   86  204:astore          6
				l = i1;
	//   87  206:iload           4
	//   88  208:istore_3        
			}
			j = l;
	//   89  209:iload_3         
	//   90  210:istore_2        
		} while(true);
	//   91  211:goto            26
		if(connectionresult1 != null && connectionresult != null && j > i)
	//*  92  214:aload           6
	//*  93  216:ifnull          232
	//*  94  219:aload           5
	//*  95  221:ifnull          232
	//*  96  224:iload_2         
	//*  97  225:iload_1         
	//*  98  226:icmple          232
			return connectionresult;
	//   99  229:aload           5
	//  100  231:areturn         
		else
			return connectionresult1;
	//  101  232:aload           6
	//  102  234:areturn         
	}

	public ConnectionResult blockingConnect()
	{
		InterruptedException interruptedexception;
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #359 <Method void connect()>
		do
		{
			if(!isConnecting())
				break;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #362 <Method boolean isConnecting()>
	//    4    8:ifeq            40
			try
			{
				zzaAR.await();
	//    5   11:aload_0         
	//    6   12:getfield        #77  <Field Condition zzaAR>
	//    7   15:invokeinterface #367 <Method void Condition.await()>
			}
	//*   8   20:goto            4
	//*   9   23:invokestatic    #373 <Method Thread Thread.currentThread()>
	//*  10   26:invokevirtual   #376 <Method void Thread.interrupt()>
	//*  11   29:new             #186 <Class ConnectionResult>
	//*  12   32:dup             
	//*  13   33:bipush          15
	//*  14   35:aconst_null     
	//*  15   36:invokespecial   #379 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  16   39:areturn         
	//*  17   40:aload_0         
	//*  18   41:invokevirtual   #382 <Method boolean isConnected()>
	//*  19   44:ifeq            51
	//*  20   47:getstatic       #385 <Field ConnectionResult ConnectionResult.zzayj>
	//*  21   50:areturn         
	//*  22   51:aload_0         
	//*  23   52:getfield        #179 <Field ConnectionResult zzaAZ>
	//*  24   55:ifnull          63
	//*  25   58:aload_0         
	//*  26   59:getfield        #179 <Field ConnectionResult zzaAZ>
	//*  27   62:areturn         
	//*  28   63:new             #186 <Class ConnectionResult>
	//*  29   66:dup             
	//*  30   67:bipush          13
	//*  31   69:aconst_null     
	//*  32   70:invokespecial   #379 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  33   73:areturn         
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
				return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
			}
		} while(true);
		if(isConnected())
			return ConnectionResult.zzayj;
		if(zzaAZ != null)
			return zzaAZ;
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//*  34   74:astore_1        
	//*  35   75:goto            23
	}

	public ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #359 <Method void connect()>
		l = timeunit.toNanos(l);
	//    2    4:aload_3         
	//    3    5:lload_1         
	//    4    6:invokevirtual   #392 <Method long TimeUnit.toNanos(long)>
	//    5    9:lstore_1        
_L2:
		if(!isConnecting())
			break; /* Loop/switch isn't completed */
	//    6   10:aload_0         
	//    7   11:invokevirtual   #362 <Method boolean isConnecting()>
	//    8   14:ifeq            71
		if(l <= 0L)
	//*   9   17:lload_1         
	//*  10   18:lconst_0        
	//*  11   19:lcmp            
	//*  12   20:ifgt            40
		{
			try
			{
				disconnect();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #395 <Method void disconnect()>
				timeunit = ((TimeUnit) (new ConnectionResult(14, ((android.app.PendingIntent) (null)))));
	//   15   27:new             #186 <Class ConnectionResult>
	//   16   30:dup             
	//   17   31:bipush          14
	//   18   33:aconst_null     
	//   19   34:invokespecial   #379 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   20   37:astore_3        
			}
	//*  21   38:aload_3         
	//*  22   39:areturn         
	//*  23   40:aload_0         
	//*  24   41:getfield        #77  <Field Condition zzaAR>
	//*  25   44:lload_1         
	//*  26   45:invokeinterface #398 <Method long Condition.awaitNanos(long)>
	//*  27   50:lstore_1        
	//*  28   51:goto            10
	//*  29   54:invokestatic    #373 <Method Thread Thread.currentThread()>
	//*  30   57:invokevirtual   #376 <Method void Thread.interrupt()>
	//*  31   60:new             #186 <Class ConnectionResult>
	//*  32   63:dup             
	//*  33   64:bipush          15
	//*  34   66:aconst_null     
	//*  35   67:invokespecial   #379 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  36   70:areturn         
	//*  37   71:aload_0         
	//*  38   72:invokevirtual   #382 <Method boolean isConnected()>
	//*  39   75:ifeq            82
	//*  40   78:getstatic       #385 <Field ConnectionResult ConnectionResult.zzayj>
	//*  41   81:areturn         
	//*  42   82:aload_0         
	//*  43   83:getfield        #179 <Field ConnectionResult zzaAZ>
	//*  44   86:ifnull          94
	//*  45   89:aload_0         
	//*  46   90:getfield        #179 <Field ConnectionResult zzaAZ>
	//*  47   93:areturn         
	//*  48   94:new             #186 <Class ConnectionResult>
	//*  49   97:dup             
	//*  50   98:bipush          13
	//*  51  100:aconst_null     
	//*  52  101:invokespecial   #379 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  53  104:areturn         
			// Misplaced declaration of an exception variable
			catch(TimeUnit timeunit)
			{
				Thread.currentThread().interrupt();
				return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
			}
			return ((ConnectionResult) (timeunit));
		}
		l = zzaAR.awaitNanos(l);
		if(true) goto _L2; else goto _L1
_L1:
		if(isConnected())
			return ConnectionResult.zzayj;
		if(zzaAZ != null)
			return zzaAZ;
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//*  54  105:astore_3        
	//*  55  106:goto            54
	}

	public void connect()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zzaAG>
	//    2    4:invokeinterface #223 <Method void Lock.lock()>
		boolean flag = zzaAV;
	//    3    9:aload_0         
	//    4   10:getfield        #217 <Field boolean zzaAV>
	//    5   13:istore_1        
		if(flag)
	//*   6   14:iload_1         
	//*   7   15:ifeq            28
		{
			zzaAG.unlock();
	//    8   18:aload_0         
	//    9   19:getfield        #67  <Field Lock zzaAG>
	//   10   22:invokeinterface #230 <Method void Lock.unlock()>
			return;
	//   11   27:return          
		}
		zzaAV = true;
	//   12   28:aload_0         
	//   13   29:iconst_1        
	//   14   30:putfield        #217 <Field boolean zzaAV>
		zzaAW = null;
	//   15   33:aload_0         
	//   16   34:aconst_null     
	//   17   35:putfield        #182 <Field Map zzaAW>
		zzaAX = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #235 <Field Map zzaAX>
		zzaAY = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #400 <Field zzaak$zzb zzaAY>
		zzaAZ = null;
	//   24   48:aload_0         
	//   25   49:aconst_null     
	//   26   50:putfield        #179 <Field ConnectionResult zzaAZ>
		zzayX.zzvx();
	//   27   53:aload_0         
	//   28   54:getfield        #173 <Field zzaax zzayX>
	//   29   57:invokevirtual   #403 <Method void zzaax.zzvx()>
		zzayX.zza(((Iterable) (zzaAM.values()))).addOnCompleteListener(((java.util.concurrent.Executor) (new zzadb(zzrs))), ((OnCompleteListener) (new zza())));
	//   30   60:aload_0         
	//   31   61:getfield        #173 <Field zzaax zzayX>
	//   32   64:aload_0         
	//   33   65:getfield        #58  <Field Map zzaAM>
	//   34   68:invokeinterface #341 <Method Collection Map.values()>
	//   35   73:invokevirtual   #406 <Method Task zzaax.zza(Iterable)>
	//   36   76:new             #408 <Class zzadb>
	//   37   79:dup             
	//   38   80:aload_0         
	//   39   81:getfield        #69  <Field Looper zzrs>
	//   40   84:invokespecial   #411 <Method void zzadb(Looper)>
	//   41   87:new             #10  <Class zzaak$zza>
	//   42   90:dup             
	//   43   91:aload_0         
	//   44   92:aconst_null     
	//   45   93:invokespecial   #414 <Method void zzaak$zza(zzaak, zzaak$1)>
	//   46   96:invokevirtual   #420 <Method Task Task.addOnCompleteListener(java.util.concurrent.Executor, OnCompleteListener)>
	//   47   99:pop             
		zzaAG.unlock();
	//   48  100:aload_0         
	//   49  101:getfield        #67  <Field Lock zzaAG>
	//   50  104:invokeinterface #230 <Method void Lock.unlock()>
		return;
	//   51  109:return          
		Exception exception;
		exception;
	//   52  110:astore_2        
		zzaAG.unlock();
	//   53  111:aload_0         
	//   54  112:getfield        #67  <Field Lock zzaAG>
	//   55  115:invokeinterface #230 <Method void Lock.unlock()>
		throw exception;
	//   56  120:aload_2         
	//   57  121:athrow          
	}

	public void disconnect()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zzaAG>
	//    2    4:invokeinterface #223 <Method void Lock.lock()>
		zzaAV = false;
	//    3    9:aload_0         
	//    4   10:iconst_0        
	//    5   11:putfield        #217 <Field boolean zzaAV>
		zzaAW = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #182 <Field Map zzaAW>
		zzaAX = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #235 <Field Map zzaAX>
		if(zzaAY != null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #400 <Field zzaak$zzb zzaAY>
	//*  14   28:ifnull          43
		{
			zzaAY.cancel();
	//   15   31:aload_0         
	//   16   32:getfield        #400 <Field zzaak$zzb zzaAY>
	//   17   35:invokevirtual   #423 <Method void zzaak$zzb.cancel()>
			zzaAY = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #400 <Field zzaak$zzb zzaAY>
		}
		zzaAZ = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #179 <Field ConnectionResult zzaAZ>
		zzaad.zza zza1;
		for(; !zzaAU.isEmpty(); zza1.cancel())
	//*  24   48:aload_0         
	//*  25   49:getfield        #65  <Field Queue zzaAU>
	//*  26   52:invokeinterface #327 <Method boolean Queue.isEmpty()>
	//*  27   57:ifne            85
		{
			zza1 = (zzaad.zza)zzaAU.remove();
	//   28   60:aload_0         
	//   29   61:getfield        #65  <Field Queue zzaAU>
	//   30   64:invokeinterface #330 <Method Object Queue.remove()>
	//   31   69:checkcast       #242 <Class zzaad$zza>
	//   32   72:astore_1        
			zza1.zza(((zzaby.zzb) (null)));
	//   33   73:aload_1         
	//   34   74:aconst_null     
	//   35   75:invokevirtual   #426 <Method void zzaad$zza.zza(zzaby$zzb)>
		}

	//   36   78:aload_1         
	//   37   79:invokevirtual   #427 <Method void zzaad$zza.cancel()>
	//*  38   82:goto            48
		zzaAR.signalAll();
	//   39   85:aload_0         
	//   40   86:getfield        #77  <Field Condition zzaAR>
	//   41   89:invokeinterface #430 <Method void Condition.signalAll()>
		zzaAG.unlock();
	//   42   94:aload_0         
	//   43   95:getfield        #67  <Field Lock zzaAG>
	//   44   98:invokeinterface #230 <Method void Lock.unlock()>
		return;
	//   45  103:return          
		Exception exception;
		exception;
	//   46  104:astore_1        
		zzaAG.unlock();
	//   47  105:aload_0         
	//   48  106:getfield        #67  <Field Lock zzaAG>
	//   49  109:invokeinterface #230 <Method void Lock.unlock()>
		throw exception;
	//   50  114:aload_1         
	//   51  115:athrow          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
	//    0    0:return          
	}

	public ConnectionResult getConnectionResult(Api api)
	{
		return zzb(api.zzvg());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #115 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//    3    5:invokespecial   #245 <Method ConnectionResult zzb(com.google.android.gms.common.api.Api$zzc)>
	//    4    8:areturn         
	}

	public boolean isConnected()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zzaAG>
	//    2    4:invokeinterface #223 <Method void Lock.lock()>
		ConnectionResult connectionresult;
		if(zzaAW == null)
			break MISSING_BLOCK_LABEL_30;
	//    3    9:aload_0         
	//    4   10:getfield        #182 <Field Map zzaAW>
	//    5   13:ifnull          30
		connectionresult = zzaAZ;
	//    6   16:aload_0         
	//    7   17:getfield        #179 <Field ConnectionResult zzaAZ>
	//    8   20:astore_2        
		boolean flag;
		if(connectionresult == null)
	//*   9   21:aload_2         
	//*  10   22:ifnonnull       30
		{
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
			break MISSING_BLOCK_LABEL_32;
	//   13   27:goto            32
		}
		flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		zzaAG.unlock();
	//   16   32:aload_0         
	//   17   33:getfield        #67  <Field Lock zzaAG>
	//   18   36:invokeinterface #230 <Method void Lock.unlock()>
		return flag;
	//   19   41:iload_1         
	//   20   42:ireturn         
		Exception exception;
		exception;
	//   21   43:astore_2        
		zzaAG.unlock();
	//   22   44:aload_0         
	//   23   45:getfield        #67  <Field Lock zzaAG>
	//   24   48:invokeinterface #230 <Method void Lock.unlock()>
		throw exception;
	//   25   53:aload_2         
	//   26   54:athrow          
	}

	public boolean isConnecting()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zzaAG>
	//    2    4:invokeinterface #223 <Method void Lock.lock()>
		boolean flag;
		if(zzaAW != null)
			break MISSING_BLOCK_LABEL_30;
	//    3    9:aload_0         
	//    4   10:getfield        #182 <Field Map zzaAW>
	//    5   13:ifnonnull       30
		flag = zzaAV;
	//    6   16:aload_0         
	//    7   17:getfield        #217 <Field boolean zzaAV>
	//    8   20:istore_1        
		if(flag)
	//*   9   21:iload_1         
	//*  10   22:ifeq            30
		{
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_1        
			break MISSING_BLOCK_LABEL_32;
	//   13   27:goto            32
		}
		flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		zzaAG.unlock();
	//   16   32:aload_0         
	//   17   33:getfield        #67  <Field Lock zzaAG>
	//   18   36:invokeinterface #230 <Method void Lock.unlock()>
		return flag;
	//   19   41:iload_1         
	//   20   42:ireturn         
		Exception exception;
		exception;
	//   21   43:astore_2        
		zzaAG.unlock();
	//   22   44:aload_0         
	//   23   45:getfield        #67  <Field Lock zzaAG>
	//   24   48:invokeinterface #230 <Method void Lock.unlock()>
		throw exception;
	//   25   53:aload_2         
	//   26   54:athrow          
	}

	public zzaad.zza zza(zzaad.zza zza1)
	{
		if(zzaAS && zzd(zza1))
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field boolean zzaAS>
	//*   2    4:ifeq            17
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokespecial   #435 <Method boolean zzd(zzaad$zza)>
	//*   6   12:ifeq            17
			return zza1;
	//    7   15:aload_1         
	//    8   16:areturn         
		if(!isConnected())
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #382 <Method boolean isConnected()>
	//*  11   21:ifne            37
		{
			zzaAU.add(((Object) (zza1)));
	//   12   24:aload_0         
	//   13   25:getfield        #65  <Field Queue zzaAU>
	//   14   28:aload_1         
	//   15   29:invokeinterface #439 <Method boolean Queue.add(Object)>
	//   16   34:pop             
			return zza1;
	//   17   35:aload_1         
	//   18   36:areturn         
		} else
		{
			zzaAP.zzaBW.zzb(((zzaaf) (zza1)));
	//   19   37:aload_0         
	//   20   38:getfield        #81  <Field zzaat zzaAP>
	//   21   41:getfield        #443 <Field zzaby zzaat.zzaBW>
	//   22   44:aload_1         
	//   23   45:invokevirtual   #448 <Method void zzaby.zzb(zzaaf)>
			return ((zzaaj)zzaAM.get(((Object) (zza1.zzvg())))).doRead(zza1);
	//   24   48:aload_0         
	//   25   49:getfield        #58  <Field Map zzaAM>
	//   26   52:aload_1         
	//   27   53:invokevirtual   #243 <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//   28   56:invokeinterface #140 <Method Object Map.get(Object)>
	//   29   61:checkcast       #155 <Class zzaaj>
	//   30   64:aload_1         
	//   31   65:invokevirtual   #451 <Method zzaad$zza zzaaj.doRead(zzaad$zza)>
	//   32   68:areturn         
		}
	}

	public boolean zza(zzabq zzabq)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zzaAG>
	//    2    4:invokeinterface #223 <Method void Lock.lock()>
		if(!zzaAV || zzvN())
			break MISSING_BLOCK_LABEL_89;
	//    3    9:aload_0         
	//    4   10:getfield        #217 <Field boolean zzaAV>
	//    5   13:ifeq            89
	//    6   16:aload_0         
	//    7   17:invokevirtual   #456 <Method boolean zzvN()>
	//    8   20:ifne            89
		zzayX.zzvx();
	//    9   23:aload_0         
	//   10   24:getfield        #173 <Field zzaax zzayX>
	//   11   27:invokevirtual   #403 <Method void zzaax.zzvx()>
		zzaAY = new zzb(zzabq);
	//   12   30:aload_0         
	//   13   31:new             #13  <Class zzaak$zzb>
	//   14   34:dup             
	//   15   35:aload_0         
	//   16   36:aload_1         
	//   17   37:invokespecial   #459 <Method void zzaak$zzb(zzaak, zzabq)>
	//   18   40:putfield        #400 <Field zzaak$zzb zzaAY>
		zzayX.zza(((Iterable) (zzaAN.values()))).addOnCompleteListener(((java.util.concurrent.Executor) (new zzadb(zzrs))), ((OnCompleteListener) (zzaAY)));
	//   19   43:aload_0         
	//   20   44:getfield        #173 <Field zzaax zzayX>
	//   21   47:aload_0         
	//   22   48:getfield        #60  <Field Map zzaAN>
	//   23   51:invokeinterface #341 <Method Collection Map.values()>
	//   24   56:invokevirtual   #406 <Method Task zzaax.zza(Iterable)>
	//   25   59:new             #408 <Class zzadb>
	//   26   62:dup             
	//   27   63:aload_0         
	//   28   64:getfield        #69  <Field Looper zzrs>
	//   29   67:invokespecial   #411 <Method void zzadb(Looper)>
	//   30   70:aload_0         
	//   31   71:getfield        #400 <Field zzaak$zzb zzaAY>
	//   32   74:invokevirtual   #420 <Method Task Task.addOnCompleteListener(java.util.concurrent.Executor, OnCompleteListener)>
	//   33   77:pop             
		zzaAG.unlock();
	//   34   78:aload_0         
	//   35   79:getfield        #67  <Field Lock zzaAG>
	//   36   82:invokeinterface #230 <Method void Lock.unlock()>
		return true;
	//   37   87:iconst_1        
	//   38   88:ireturn         
		zzaAG.unlock();
	//   39   89:aload_0         
	//   40   90:getfield        #67  <Field Lock zzaAG>
	//   41   93:invokeinterface #230 <Method void Lock.unlock()>
		return false;
	//   42   98:iconst_0        
	//   43   99:ireturn         
		zzabq;
	//   44  100:astore_1        
		zzaAG.unlock();
	//   45  101:aload_0         
	//   46  102:getfield        #67  <Field Lock zzaAG>
	//   47  105:invokeinterface #230 <Method void Lock.unlock()>
		throw zzabq;
	//   48  110:aload_1         
	//   49  111:athrow          
	}

	public zzaad.zza zzb(zzaad.zza zza1)
	{
		com.google.android.gms.common.api.Api.zzc zzc1 = zza1.zzvg();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #243 <Method com.google.android.gms.common.api.Api$zzc zzaad$zza.zzvg()>
	//    2    4:astore_2        
		if(zzaAS && zzd(zza1))
	//*   3    5:aload_0         
	//*   4    6:getfield        #87  <Field boolean zzaAS>
	//*   5    9:ifeq            22
	//*   6   12:aload_0         
	//*   7   13:aload_1         
	//*   8   14:invokespecial   #435 <Method boolean zzd(zzaad$zza)>
	//*   9   17:ifeq            22
		{
			return zza1;
	//   10   20:aload_1         
	//   11   21:areturn         
		} else
		{
			zzaAP.zzaBW.zzb(((zzaaf) (zza1)));
	//   12   22:aload_0         
	//   13   23:getfield        #81  <Field zzaat zzaAP>
	//   14   26:getfield        #443 <Field zzaby zzaat.zzaBW>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #448 <Method void zzaby.zzb(zzaaf)>
			return ((zzaaj)zzaAM.get(((Object) (zzc1)))).doWrite(zza1);
	//   17   33:aload_0         
	//   18   34:getfield        #58  <Field Map zzaAM>
	//   19   37:aload_2         
	//   20   38:invokeinterface #140 <Method Object Map.get(Object)>
	//   21   43:checkcast       #155 <Class zzaaj>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #462 <Method zzaad$zza zzaaj.doWrite(zzaad$zza)>
	//   24   50:areturn         
		}
	}

	public void zzvM()
	{
	//    0    0:return          
	}

	public boolean zzvN()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zzaAG>
	//    2    4:invokeinterface #223 <Method void Lock.lock()>
		boolean flag;
		if(!zzaAV)
			break MISSING_BLOCK_LABEL_25;
	//    3    9:aload_0         
	//    4   10:getfield        #217 <Field boolean zzaAV>
	//    5   13:ifeq            25
		flag = zzaAS;
	//    6   16:aload_0         
	//    7   17:getfield        #87  <Field boolean zzaAS>
	//    8   20:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_36;
	//    9   21:iload_1         
	//   10   22:ifne            36
		zzaAG.unlock();
	//   11   25:aload_0         
	//   12   26:getfield        #67  <Field Lock zzaAG>
	//   13   29:invokeinterface #230 <Method void Lock.unlock()>
		return false;
	//   14   34:iconst_0        
	//   15   35:ireturn         
		Iterator iterator = zzaAN.keySet().iterator();
	//   16   36:aload_0         
	//   17   37:getfield        #60  <Field Map zzaAN>
	//   18   40:invokeinterface #93  <Method Set Map.keySet()>
	//   19   45:invokeinterface #99  <Method Iterator Set.iterator()>
	//   20   50:astore_2        
_L2:
		ConnectionResult connectionresult;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_101;
	//   21   51:aload_2         
	//   22   52:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//   23   57:ifeq            101
		connectionresult = zzb((com.google.android.gms.common.api.Api.zzc)iterator.next());
	//   24   60:aload_0         
	//   25   61:aload_2         
	//   26   62:invokeinterface #109 <Method Object Iterator.next()>
	//   27   67:checkcast       #160 <Class com.google.android.gms.common.api.Api$zzc>
	//   28   70:invokespecial   #245 <Method ConnectionResult zzb(com.google.android.gms.common.api.Api$zzc)>
	//   29   73:astore_3        
		if(connectionresult == null)
			break; /* Loop/switch isn't completed */
	//   30   74:aload_3         
	//   31   75:ifnull          87
		flag = connectionresult.isSuccess();
	//   32   78:aload_3         
	//   33   79:invokevirtual   #189 <Method boolean ConnectionResult.isSuccess()>
	//   34   82:istore_1        
		if(flag) goto _L2; else goto _L1
	//   35   83:iload_1         
	//   36   84:ifne            98
_L1:
		zzaAG.unlock();
	//   37   87:aload_0         
	//   38   88:getfield        #67  <Field Lock zzaAG>
	//   39   91:invokeinterface #230 <Method void Lock.unlock()>
		return false;
	//   40   96:iconst_0        
	//   41   97:ireturn         
	//*  42   98:goto            51
		zzaAG.unlock();
	//   43  101:aload_0         
	//   44  102:getfield        #67  <Field Lock zzaAG>
	//   45  105:invokeinterface #230 <Method void Lock.unlock()>
		return true;
	//   46  110:iconst_1        
	//   47  111:ireturn         
		Exception exception;
		exception;
	//   48  112:astore_2        
		zzaAG.unlock();
	//   49  113:aload_0         
	//   50  114:getfield        #67  <Field Lock zzaAG>
	//   51  117:invokeinterface #230 <Method void Lock.unlock()>
		throw exception;
	//   52  122:aload_2         
	//   53  123:athrow          
	}

	public void zzvn()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Lock zzaAG>
	//    2    4:invokeinterface #223 <Method void Lock.lock()>
		zzayX.zzvn();
	//    3    9:aload_0         
	//    4   10:getfield        #173 <Field zzaax zzayX>
	//    5   13:invokevirtual   #467 <Method void zzaax.zzvn()>
		if(zzaAY != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #400 <Field zzaak$zzb zzaAY>
	//*   8   20:ifnull          35
		{
			zzaAY.cancel();
	//    9   23:aload_0         
	//   10   24:getfield        #400 <Field zzaak$zzb zzaAY>
	//   11   27:invokevirtual   #423 <Method void zzaak$zzb.cancel()>
			zzaAY = null;
	//   12   30:aload_0         
	//   13   31:aconst_null     
	//   14   32:putfield        #400 <Field zzaak$zzb zzaAY>
		}
		if(zzaAX == null)
	//*  15   35:aload_0         
	//*  16   36:getfield        #235 <Field Map zzaAX>
	//*  17   39:ifnonnull       62
			zzaAX = ((Map) (new ArrayMap(zzaAN.size())));
	//   18   42:aload_0         
	//   19   43:new             #469 <Class ArrayMap>
	//   20   46:dup             
	//   21   47:aload_0         
	//   22   48:getfield        #60  <Field Map zzaAN>
	//   23   51:invokeinterface #472 <Method int Map.size()>
	//   24   56:invokespecial   #475 <Method void ArrayMap(int)>
	//   25   59:putfield        #235 <Field Map zzaAX>
		ConnectionResult connectionresult = new ConnectionResult(4);
	//   26   62:new             #186 <Class ConnectionResult>
	//   27   65:dup             
	//   28   66:iconst_4        
	//   29   67:invokespecial   #476 <Method void ConnectionResult(int)>
	//   30   70:astore_1        
		zzaaj zzaaj1;
		for(Iterator iterator = zzaAN.values().iterator(); iterator.hasNext(); zzaAX.put(((Object) (zzaaj1.getApiKey())), ((Object) (connectionresult))))
	//*  31   71:aload_0         
	//*  32   72:getfield        #60  <Field Map zzaAN>
	//*  33   75:invokeinterface #341 <Method Collection Map.values()>
	//*  34   80:invokeinterface #344 <Method Iterator Collection.iterator()>
	//*  35   85:astore_2        
	//*  36   86:aload_2         
	//*  37   87:invokeinterface #105 <Method boolean Iterator.hasNext()>
	//*  38   92:ifeq            123
			zzaaj1 = (zzaaj)iterator.next();
	//   39   95:aload_2         
	//   40   96:invokeinterface #109 <Method Object Iterator.next()>
	//   41  101:checkcast       #155 <Class zzaaj>
	//   42  104:astore_3        

	//   43  105:aload_0         
	//   44  106:getfield        #235 <Field Map zzaAX>
	//   45  109:aload_3         
	//   46  110:invokevirtual   #227 <Method zzzz zzaaj.getApiKey()>
	//   47  113:aload_1         
	//   48  114:invokeinterface #119 <Method Object Map.put(Object, Object)>
	//   49  119:pop             
	//*  50  120:goto            86
		if(zzaAW != null)
	//*  51  123:aload_0         
	//*  52  124:getfield        #182 <Field Map zzaAW>
	//*  53  127:ifnull          143
			zzaAW.putAll(zzaAX);
	//   54  130:aload_0         
	//   55  131:getfield        #182 <Field Map zzaAW>
	//   56  134:aload_0         
	//   57  135:getfield        #235 <Field Map zzaAX>
	//   58  138:invokeinterface #480 <Method void Map.putAll(Map)>
		zzaAG.unlock();
	//   59  143:aload_0         
	//   60  144:getfield        #67  <Field Lock zzaAG>
	//   61  147:invokeinterface #230 <Method void Lock.unlock()>
		return;
	//   62  152:return          
		Exception exception;
		exception;
	//   63  153:astore_1        
		zzaAG.unlock();
	//   64  154:aload_0         
	//   65  155:getfield        #67  <Field Lock zzaAG>
	//   66  158:invokeinterface #230 <Method void Lock.unlock()>
		throw exception;
	//   67  163:aload_1         
	//   68  164:athrow          
	}

	private final Lock zzaAG;
	private final zzg zzaAL;
	private final Map zzaAM = new HashMap();
	private final Map zzaAN = new HashMap();
	private final Map zzaAO;
	private final zzaat zzaAP;
	private final zze zzaAQ;
	private final Condition zzaAR;
	private final boolean zzaAS;
	private final boolean zzaAT;
	private final Queue zzaAU = new LinkedList();
	private boolean zzaAV;
	private Map zzaAW;
	private Map zzaAX;
	private zzb zzaAY;
	private ConnectionResult zzaAZ;
	private final zzaax zzayX = zzaax.zzww();
	private final Looper zzrs;
}
