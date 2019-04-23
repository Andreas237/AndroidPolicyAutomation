// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zax, zaw, zaaw, zay

final class zaz
	implements OnCompleteListener
{

	private zaz(zax zax1)
	{
		zafh = zax1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zax zafh>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	zaz(zax zax1, zay zay)
	{
		this(zax1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void zaz(zax)>
	//    3    5:return          
	}

	public final void onComplete(Task task)
	{
		zax.zaa(zafh).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field zax zafh>
	//    2    4:invokestatic    #29  <Method Lock zax.zaa(zax)>
	//    3    7:invokeinterface #34  <Method void Lock.lock()>
		boolean flag = zax.zab(zafh);
	//    4   12:aload_0         
	//    5   13:getfield        #13  <Field zax zafh>
	//    6   16:invokestatic    #38  <Method boolean zax.zab(zax)>
	//    7   19:istore_2        
		if(!flag)
	//*   8   20:iload_2         
	//*   9   21:ifne            37
		{
			zax.zaa(zafh).unlock();
	//   10   24:aload_0         
	//   11   25:getfield        #13  <Field zax zafh>
	//   12   28:invokestatic    #29  <Method Lock zax.zaa(zax)>
	//   13   31:invokeinterface #41  <Method void Lock.unlock()>
			return;
	//   14   36:return          
		}
		if(task.isSuccessful())
	//*  15   37:aload_1         
	//*  16   38:invokevirtual   #47  <Method boolean Task.isSuccessful()>
	//*  17   41:ifeq            131
		{
			zax.zaa(zafh, ((Map) (new ArrayMap(zax.zac(zafh).size()))));
	//   18   44:aload_0         
	//   19   45:getfield        #13  <Field zax zafh>
	//   20   48:new             #49  <Class ArrayMap>
	//   21   51:dup             
	//   22   52:aload_0         
	//   23   53:getfield        #13  <Field zax zafh>
	//   24   56:invokestatic    #53  <Method Map zax.zac(zax)>
	//   25   59:invokeinterface #59  <Method int Map.size()>
	//   26   64:invokespecial   #62  <Method void ArrayMap(int)>
	//   27   67:invokestatic    #65  <Method Map zax.zaa(zax, Map)>
	//   28   70:pop             
			zaw zaw1;
			for(task = ((Task) (zax.zac(zafh).values().iterator())); ((Iterator) (task)).hasNext(); zax.zad(zafh).put(((Object) (((GoogleApi) (zaw1)).zak())), ((Object) (ConnectionResult.RESULT_SUCCESS))))
	//*  29   71:aload_0         
	//*  30   72:getfield        #13  <Field zax zafh>
	//*  31   75:invokestatic    #53  <Method Map zax.zac(zax)>
	//*  32   78:invokeinterface #69  <Method Collection Map.values()>
	//*  33   83:invokeinterface #75  <Method Iterator Collection.iterator()>
	//*  34   88:astore_1        
	//*  35   89:aload_1         
	//*  36   90:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  37   95:ifeq            370
				zaw1 = (zaw)((Iterator) (task)).next();
	//   38   98:aload_1         
	//   39   99:invokeinterface #84  <Method Object Iterator.next()>
	//   40  104:checkcast       #86  <Class zaw>
	//   41  107:astore_3        

	//   42  108:aload_0         
	//   43  109:getfield        #13  <Field zax zafh>
	//   44  112:invokestatic    #89  <Method Map zax.zad(zax)>
	//   45  115:aload_3         
	//   46  116:invokevirtual   #95  <Method zai GoogleApi.zak()>
	//   47  119:getstatic       #101 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   48  122:invokeinterface #105 <Method Object Map.put(Object, Object)>
	//   49  127:pop             
			break MISSING_BLOCK_LABEL_370;
	//   50  128:goto            89
		}
		Iterator iterator;
		if(!(task.getException() instanceof AvailabilityException))
			break MISSING_BLOCK_LABEL_330;
	//   51  131:aload_1         
	//   52  132:invokevirtual   #109 <Method Exception Task.getException()>
	//   53  135:instanceof      #111 <Class AvailabilityException>
	//   54  138:ifeq            330
		task = ((Task) ((AvailabilityException)task.getException()));
	//   55  141:aload_1         
	//   56  142:invokevirtual   #109 <Method Exception Task.getException()>
	//   57  145:checkcast       #111 <Class AvailabilityException>
	//   58  148:astore_1        
		if(!zax.zae(zafh))
			break MISSING_BLOCK_LABEL_300;
	//   59  149:aload_0         
	//   60  150:getfield        #13  <Field zax zafh>
	//   61  153:invokestatic    #114 <Method boolean zax.zae(zax)>
	//   62  156:ifeq            300
		zax.zaa(zafh, ((Map) (new ArrayMap(zax.zac(zafh).size()))));
	//   63  159:aload_0         
	//   64  160:getfield        #13  <Field zax zafh>
	//   65  163:new             #49  <Class ArrayMap>
	//   66  166:dup             
	//   67  167:aload_0         
	//   68  168:getfield        #13  <Field zax zafh>
	//   69  171:invokestatic    #53  <Method Map zax.zac(zax)>
	//   70  174:invokeinterface #59  <Method int Map.size()>
	//   71  179:invokespecial   #62  <Method void ArrayMap(int)>
	//   72  182:invokestatic    #65  <Method Map zax.zaa(zax, Map)>
	//   73  185:pop             
		iterator = zax.zac(zafh).values().iterator();
	//   74  186:aload_0         
	//   75  187:getfield        #13  <Field zax zafh>
	//   76  190:invokestatic    #53  <Method Map zax.zac(zax)>
	//   77  193:invokeinterface #69  <Method Collection Map.values()>
	//   78  198:invokeinterface #75  <Method Iterator Collection.iterator()>
	//   79  203:astore_3        
_L1:
		zai zai;
		ConnectionResult connectionresult;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_312;
	//   80  204:aload_3         
	//   81  205:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//   82  210:ifeq            312
			zaw zaw2 = (zaw)iterator.next();
	//   83  213:aload_3         
	//   84  214:invokeinterface #84  <Method Object Iterator.next()>
	//   85  219:checkcast       #86  <Class zaw>
	//   86  222:astore          4
			zai = ((GoogleApi) (zaw2)).zak();
	//   87  224:aload           4
	//   88  226:invokevirtual   #95  <Method zai GoogleApi.zak()>
	//   89  229:astore          5
			connectionresult = ((AvailabilityException) (task)).getConnectionResult(((GoogleApi) (zaw2)));
	//   90  231:aload_1         
	//   91  232:aload           4
	//   92  234:invokevirtual   #118 <Method ConnectionResult AvailabilityException.getConnectionResult(GoogleApi)>
	//   93  237:astore          6
			if(!zax.zaa(zafh, zaw2, connectionresult))
				break MISSING_BLOCK_LABEL_280;
	//   94  239:aload_0         
	//   95  240:getfield        #13  <Field zax zafh>
	//   96  243:aload           4
	//   97  245:aload           6
	//   98  247:invokestatic    #121 <Method boolean zax.zaa(zax, zaw, ConnectionResult)>
	//   99  250:ifeq            280
			zax.zad(zafh).put(((Object) (zai)), ((Object) (new ConnectionResult(16))));
	//  100  253:aload_0         
	//  101  254:getfield        #13  <Field zax zafh>
	//  102  257:invokestatic    #89  <Method Map zax.zad(zax)>
	//  103  260:aload           5
	//  104  262:new             #97  <Class ConnectionResult>
	//  105  265:dup             
	//  106  266:bipush          16
	//  107  268:invokespecial   #122 <Method void ConnectionResult(int)>
	//  108  271:invokeinterface #105 <Method Object Map.put(Object, Object)>
	//  109  276:pop             
		} while(true);
	//  110  277:goto            204
		zax.zad(zafh).put(((Object) (zai)), ((Object) (connectionresult)));
	//  111  280:aload_0         
	//  112  281:getfield        #13  <Field zax zafh>
	//  113  284:invokestatic    #89  <Method Map zax.zad(zax)>
	//  114  287:aload           5
	//  115  289:aload           6
	//  116  291:invokeinterface #105 <Method Object Map.put(Object, Object)>
	//  117  296:pop             
		  goto _L1
	//* 118  297:goto            204
		zax.zaa(zafh, ((Map) (((AvailabilityException) (task)).zaj())));
	//  119  300:aload_0         
	//  120  301:getfield        #13  <Field zax zafh>
	//  121  304:aload_1         
	//  122  305:invokevirtual   #126 <Method ArrayMap AvailabilityException.zaj()>
	//  123  308:invokestatic    #65  <Method Map zax.zaa(zax, Map)>
	//  124  311:pop             
		zax.zaa(zafh, zax.zaf(zafh));
	//  125  312:aload_0         
	//  126  313:getfield        #13  <Field zax zafh>
	//  127  316:aload_0         
	//  128  317:getfield        #13  <Field zax zafh>
	//  129  320:invokestatic    #130 <Method ConnectionResult zax.zaf(zax)>
	//  130  323:invokestatic    #133 <Method ConnectionResult zax.zaa(zax, ConnectionResult)>
	//  131  326:pop             
		break MISSING_BLOCK_LABEL_370;
	//  132  327:goto            370
		Log.e("ConnectionlessGAC", "Unexpected availability exception", ((Throwable) (task.getException())));
	//  133  330:ldc1            #135 <String "ConnectionlessGAC">
	//  134  332:ldc1            #137 <String "Unexpected availability exception">
	//  135  334:aload_1         
	//  136  335:invokevirtual   #109 <Method Exception Task.getException()>
	//  137  338:invokestatic    #143 <Method int Log.e(String, String, Throwable)>
	//  138  341:pop             
		zax.zaa(zafh, Collections.emptyMap());
	//  139  342:aload_0         
	//  140  343:getfield        #13  <Field zax zafh>
	//  141  346:invokestatic    #149 <Method Map Collections.emptyMap()>
	//  142  349:invokestatic    #65  <Method Map zax.zaa(zax, Map)>
	//  143  352:pop             
		zax.zaa(zafh, new ConnectionResult(8));
	//  144  353:aload_0         
	//  145  354:getfield        #13  <Field zax zafh>
	//  146  357:new             #97  <Class ConnectionResult>
	//  147  360:dup             
	//  148  361:bipush          8
	//  149  363:invokespecial   #122 <Method void ConnectionResult(int)>
	//  150  366:invokestatic    #133 <Method ConnectionResult zax.zaa(zax, ConnectionResult)>
	//  151  369:pop             
		if(zax.zag(zafh) != null)
	//* 152  370:aload_0         
	//* 153  371:getfield        #13  <Field zax zafh>
	//* 154  374:invokestatic    #152 <Method Map zax.zag(zax)>
	//* 155  377:ifnull          414
		{
			zax.zad(zafh).putAll(zax.zag(zafh));
	//  156  380:aload_0         
	//  157  381:getfield        #13  <Field zax zafh>
	//  158  384:invokestatic    #89  <Method Map zax.zad(zax)>
	//  159  387:aload_0         
	//  160  388:getfield        #13  <Field zax zafh>
	//  161  391:invokestatic    #152 <Method Map zax.zag(zax)>
	//  162  394:invokeinterface #156 <Method void Map.putAll(Map)>
			zax.zaa(zafh, zax.zaf(zafh));
	//  163  399:aload_0         
	//  164  400:getfield        #13  <Field zax zafh>
	//  165  403:aload_0         
	//  166  404:getfield        #13  <Field zax zafh>
	//  167  407:invokestatic    #130 <Method ConnectionResult zax.zaf(zax)>
	//  168  410:invokestatic    #133 <Method ConnectionResult zax.zaa(zax, ConnectionResult)>
	//  169  413:pop             
		}
		if(zax.zah(zafh) == null)
	//* 170  414:aload_0         
	//* 171  415:getfield        #13  <Field zax zafh>
	//* 172  418:invokestatic    #159 <Method ConnectionResult zax.zah(zax)>
	//* 173  421:ifnonnull       441
		{
			zax.zai(zafh);
	//  174  424:aload_0         
	//  175  425:getfield        #13  <Field zax zafh>
	//  176  428:invokestatic    #162 <Method void zax.zai(zax)>
			zax.zaj(zafh);
	//  177  431:aload_0         
	//  178  432:getfield        #13  <Field zax zafh>
	//  179  435:invokestatic    #164 <Method void zax.zaj(zax)>
			break MISSING_BLOCK_LABEL_467;
	//  180  438:goto            467
		}
		zax.zaa(zafh, false);
	//  181  441:aload_0         
	//  182  442:getfield        #13  <Field zax zafh>
	//  183  445:iconst_0        
	//  184  446:invokestatic    #167 <Method boolean zax.zaa(zax, boolean)>
	//  185  449:pop             
		zax.zak(zafh).zac(zax.zah(zafh));
	//  186  450:aload_0         
	//  187  451:getfield        #13  <Field zax zafh>
	//  188  454:invokestatic    #170 <Method zaaw zax.zak(zax)>
	//  189  457:aload_0         
	//  190  458:getfield        #13  <Field zax zafh>
	//  191  461:invokestatic    #159 <Method ConnectionResult zax.zah(zax)>
	//  192  464:invokevirtual   #175 <Method void zaaw.zac(ConnectionResult)>
		zax.zal(zafh).signalAll();
	//  193  467:aload_0         
	//  194  468:getfield        #13  <Field zax zafh>
	//  195  471:invokestatic    #179 <Method Condition zax.zal(zax)>
	//  196  474:invokeinterface #184 <Method void Condition.signalAll()>
		zax.zaa(zafh).unlock();
	//  197  479:aload_0         
	//  198  480:getfield        #13  <Field zax zafh>
	//  199  483:invokestatic    #29  <Method Lock zax.zaa(zax)>
	//  200  486:invokeinterface #41  <Method void Lock.unlock()>
		return;
	//  201  491:return          
		task;
	//  202  492:astore_1        
		zax.zaa(zafh).unlock();
	//  203  493:aload_0         
	//  204  494:getfield        #13  <Field zax zafh>
	//  205  497:invokestatic    #29  <Method Lock zax.zaa(zax)>
	//  206  500:invokeinterface #41  <Method void Lock.unlock()>
		throw task;
	//  207  505:aload_1         
	//  208  506:athrow          
	}

	private final zax zafh;
}
