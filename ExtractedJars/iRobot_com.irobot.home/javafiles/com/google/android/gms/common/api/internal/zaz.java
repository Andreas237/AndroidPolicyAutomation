// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.support.v4.f.a;
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
	//    2    4:invokestatic    #28  <Method Lock zax.zaa(zax)>
	//    3    7:invokeinterface #33  <Method void Lock.lock()>
		boolean flag = zax.zab(zafh);
	//    4   12:aload_0         
	//    5   13:getfield        #13  <Field zax zafh>
	//    6   16:invokestatic    #37  <Method boolean zax.zab(zax)>
	//    7   19:istore_2        
		if(flag) goto _L2; else goto _L1
	//    8   20:iload_2         
	//    9   21:ifne            37
_L1:
		zax.zaa(zafh).unlock();
	//   10   24:aload_0         
	//   11   25:getfield        #13  <Field zax zafh>
	//   12   28:invokestatic    #28  <Method Lock zax.zaa(zax)>
	//   13   31:invokeinterface #40  <Method void Lock.unlock()>
		return;
	//   14   36:return          
_L2:
		if(task.isSuccessful())
	//*  15   37:aload_1         
	//*  16   38:invokevirtual   #46  <Method boolean Task.isSuccessful()>
	//*  17   41:ifeq            131
		{
			zax.zaa(zafh, ((Map) (new a(zax.zac(zafh).size()))));
	//   18   44:aload_0         
	//   19   45:getfield        #13  <Field zax zafh>
	//   20   48:new             #48  <Class a>
	//   21   51:dup             
	//   22   52:aload_0         
	//   23   53:getfield        #13  <Field zax zafh>
	//   24   56:invokestatic    #52  <Method Map zax.zac(zax)>
	//   25   59:invokeinterface #58  <Method int Map.size()>
	//   26   64:invokespecial   #61  <Method void a(int)>
	//   27   67:invokestatic    #64  <Method Map zax.zaa(zax, Map)>
	//   28   70:pop             
			zaw zaw1;
			for(task = ((Task) (zax.zac(zafh).values().iterator())); ((Iterator) (task)).hasNext(); zax.zad(zafh).put(((Object) (((GoogleApi) (zaw1)).zak())), ((Object) (ConnectionResult.RESULT_SUCCESS))))
	//*  29   71:aload_0         
	//*  30   72:getfield        #13  <Field zax zafh>
	//*  31   75:invokestatic    #52  <Method Map zax.zac(zax)>
	//*  32   78:invokeinterface #68  <Method Collection Map.values()>
	//*  33   83:invokeinterface #74  <Method Iterator Collection.iterator()>
	//*  34   88:astore_1        
	//*  35   89:aload_1         
	//*  36   90:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//*  37   95:ifeq            370
				zaw1 = (zaw)((Iterator) (task)).next();
	//   38   98:aload_1         
	//   39   99:invokeinterface #83  <Method Object Iterator.next()>
	//   40  104:checkcast       #85  <Class zaw>
	//   41  107:astore_3        

	//   42  108:aload_0         
	//   43  109:getfield        #13  <Field zax zafh>
	//   44  112:invokestatic    #88  <Method Map zax.zad(zax)>
	//   45  115:aload_3         
	//   46  116:invokevirtual   #94  <Method zai GoogleApi.zak()>
	//   47  119:getstatic       #100 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   48  122:invokeinterface #104 <Method Object Map.put(Object, Object)>
	//   49  127:pop             
			break MISSING_BLOCK_LABEL_370;
	//   50  128:goto            89
		}
		if(!(task.getException() instanceof AvailabilityException)) goto _L4; else goto _L3
	//   51  131:aload_1         
	//   52  132:invokevirtual   #108 <Method Exception Task.getException()>
	//   53  135:instanceof      #110 <Class AvailabilityException>
	//   54  138:ifeq            329
_L3:
		AvailabilityException availabilityexception;
		Iterator iterator;
		availabilityexception = (AvailabilityException)task.getException();
	//   55  141:aload_1         
	//   56  142:invokevirtual   #108 <Method Exception Task.getException()>
	//   57  145:checkcast       #110 <Class AvailabilityException>
	//   58  148:astore          4
		if(!zax.zae(zafh))
			break MISSING_BLOCK_LABEL_294;
	//   59  150:aload_0         
	//   60  151:getfield        #13  <Field zax zafh>
	//   61  154:invokestatic    #113 <Method boolean zax.zae(zax)>
	//   62  157:ifeq            294
		zax.zaa(zafh, ((Map) (new a(zax.zac(zafh).size()))));
	//   63  160:aload_0         
	//   64  161:getfield        #13  <Field zax zafh>
	//   65  164:new             #48  <Class a>
	//   66  167:dup             
	//   67  168:aload_0         
	//   68  169:getfield        #13  <Field zax zafh>
	//   69  172:invokestatic    #52  <Method Map zax.zac(zax)>
	//   70  175:invokeinterface #58  <Method int Map.size()>
	//   71  180:invokespecial   #61  <Method void a(int)>
	//   72  183:invokestatic    #64  <Method Map zax.zaa(zax, Map)>
	//   73  186:pop             
		iterator = zax.zac(zafh).values().iterator();
	//   74  187:aload_0         
	//   75  188:getfield        #13  <Field zax zafh>
	//   76  191:invokestatic    #52  <Method Map zax.zac(zax)>
	//   77  194:invokeinterface #68  <Method Collection Map.values()>
	//   78  199:invokeinterface #74  <Method Iterator Collection.iterator()>
	//   79  204:astore          5
_L6:
		Object obj;
		zai zai;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_307;
	//   80  206:aload           5
	//   81  208:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   82  213:ifeq            307
		task = ((Task) ((zaw)iterator.next()));
	//   83  216:aload           5
	//   84  218:invokeinterface #83  <Method Object Iterator.next()>
	//   85  223:checkcast       #85  <Class zaw>
	//   86  226:astore_1        
		zai = ((GoogleApi) (task)).zak();
	//   87  227:aload_1         
	//   88  228:invokevirtual   #94  <Method zai GoogleApi.zak()>
	//   89  231:astore          6
		obj = ((Object) (availabilityexception.getConnectionResult(((GoogleApi) (task)))));
	//   90  233:aload           4
	//   91  235:aload_1         
	//   92  236:invokevirtual   #117 <Method ConnectionResult AvailabilityException.getConnectionResult(GoogleApi)>
	//   93  239:astore_3        
		if(!zax.zaa(zafh, ((zaw) (task)), ((ConnectionResult) (obj))))
			break; /* Loop/switch isn't completed */
	//   94  240:aload_0         
	//   95  241:getfield        #13  <Field zax zafh>
	//   96  244:aload_1         
	//   97  245:aload_3         
	//   98  246:invokestatic    #120 <Method boolean zax.zaa(zax, zaw, ConnectionResult)>
	//   99  249:ifeq            283
		task = ((Task) (zax.zad(zafh)));
	//  100  252:aload_0         
	//  101  253:getfield        #13  <Field zax zafh>
	//  102  256:invokestatic    #88  <Method Map zax.zad(zax)>
	//  103  259:astore_1        
		obj = ((Object) (new ConnectionResult(16)));
	//  104  260:new             #96  <Class ConnectionResult>
	//  105  263:dup             
	//  106  264:bipush          16
	//  107  266:invokespecial   #121 <Method void ConnectionResult(int)>
	//  108  269:astore_3        
_L7:
		((Map) (task)).put(((Object) (zai)), obj);
	//  109  270:aload_1         
	//  110  271:aload           6
	//  111  273:aload_3         
	//  112  274:invokeinterface #104 <Method Object Map.put(Object, Object)>
	//  113  279:pop             
		if(true) goto _L6; else goto _L5
	//  114  280:goto            206
_L5:
		task = ((Task) (zax.zad(zafh)));
	//  115  283:aload_0         
	//  116  284:getfield        #13  <Field zax zafh>
	//  117  287:invokestatic    #88  <Method Map zax.zad(zax)>
	//  118  290:astore_1        
		  goto _L7
	//* 119  291:goto            270
		zax.zaa(zafh, ((Map) (availabilityexception.zaj())));
	//  120  294:aload_0         
	//  121  295:getfield        #13  <Field zax zafh>
	//  122  298:aload           4
	//  123  300:invokevirtual   #125 <Method a AvailabilityException.zaj()>
	//  124  303:invokestatic    #64  <Method Map zax.zaa(zax, Map)>
	//  125  306:pop             
		obj = ((Object) (zafh));
	//  126  307:aload_0         
	//  127  308:getfield        #13  <Field zax zafh>
	//  128  311:astore_3        
		task = ((Task) (zax.zaf(zafh)));
	//  129  312:aload_0         
	//  130  313:getfield        #13  <Field zax zafh>
	//  131  316:invokestatic    #129 <Method ConnectionResult zax.zaf(zax)>
	//  132  319:astore_1        
_L9:
		zax.zaa(((zax) (obj)), ((ConnectionResult) (task)));
	//  133  320:aload_3         
	//  134  321:aload_1         
	//  135  322:invokestatic    #132 <Method ConnectionResult zax.zaa(zax, ConnectionResult)>
	//  136  325:pop             
		break MISSING_BLOCK_LABEL_370;
	//  137  326:goto            370
_L4:
		Log.e("ConnectionlessGAC", "Unexpected availability exception", ((Throwable) (task.getException())));
	//  138  329:ldc1            #134 <String "ConnectionlessGAC">
	//  139  331:ldc1            #136 <String "Unexpected availability exception">
	//  140  333:aload_1         
	//  141  334:invokevirtual   #108 <Method Exception Task.getException()>
	//  142  337:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//  143  340:pop             
		zax.zaa(zafh, Collections.emptyMap());
	//  144  341:aload_0         
	//  145  342:getfield        #13  <Field zax zafh>
	//  146  345:invokestatic    #148 <Method Map Collections.emptyMap()>
	//  147  348:invokestatic    #64  <Method Map zax.zaa(zax, Map)>
	//  148  351:pop             
		obj = ((Object) (zafh));
	//  149  352:aload_0         
	//  150  353:getfield        #13  <Field zax zafh>
	//  151  356:astore_3        
		task = ((Task) (new ConnectionResult(8)));
	//  152  357:new             #96  <Class ConnectionResult>
	//  153  360:dup             
	//  154  361:bipush          8
	//  155  363:invokespecial   #121 <Method void ConnectionResult(int)>
	//  156  366:astore_1        
		if(true) goto _L9; else goto _L8
	//  157  367:goto            320
_L8:
		if(zax.zag(zafh) != null)
	//* 158  370:aload_0         
	//* 159  371:getfield        #13  <Field zax zafh>
	//* 160  374:invokestatic    #151 <Method Map zax.zag(zax)>
	//* 161  377:ifnull          414
		{
			zax.zad(zafh).putAll(zax.zag(zafh));
	//  162  380:aload_0         
	//  163  381:getfield        #13  <Field zax zafh>
	//  164  384:invokestatic    #88  <Method Map zax.zad(zax)>
	//  165  387:aload_0         
	//  166  388:getfield        #13  <Field zax zafh>
	//  167  391:invokestatic    #151 <Method Map zax.zag(zax)>
	//  168  394:invokeinterface #155 <Method void Map.putAll(Map)>
			zax.zaa(zafh, zax.zaf(zafh));
	//  169  399:aload_0         
	//  170  400:getfield        #13  <Field zax zafh>
	//  171  403:aload_0         
	//  172  404:getfield        #13  <Field zax zafh>
	//  173  407:invokestatic    #129 <Method ConnectionResult zax.zaf(zax)>
	//  174  410:invokestatic    #132 <Method ConnectionResult zax.zaa(zax, ConnectionResult)>
	//  175  413:pop             
		}
		if(zax.zah(zafh) == null)
	//* 176  414:aload_0         
	//* 177  415:getfield        #13  <Field zax zafh>
	//* 178  418:invokestatic    #158 <Method ConnectionResult zax.zah(zax)>
	//* 179  421:ifnonnull       441
		{
			zax.zai(zafh);
	//  180  424:aload_0         
	//  181  425:getfield        #13  <Field zax zafh>
	//  182  428:invokestatic    #161 <Method void zax.zai(zax)>
			zax.zaj(zafh);
	//  183  431:aload_0         
	//  184  432:getfield        #13  <Field zax zafh>
	//  185  435:invokestatic    #163 <Method void zax.zaj(zax)>
			break MISSING_BLOCK_LABEL_467;
	//  186  438:goto            467
		}
		zax.zaa(zafh, false);
	//  187  441:aload_0         
	//  188  442:getfield        #13  <Field zax zafh>
	//  189  445:iconst_0        
	//  190  446:invokestatic    #166 <Method boolean zax.zaa(zax, boolean)>
	//  191  449:pop             
		zax.zak(zafh).zac(zax.zah(zafh));
	//  192  450:aload_0         
	//  193  451:getfield        #13  <Field zax zafh>
	//  194  454:invokestatic    #169 <Method zaaw zax.zak(zax)>
	//  195  457:aload_0         
	//  196  458:getfield        #13  <Field zax zafh>
	//  197  461:invokestatic    #158 <Method ConnectionResult zax.zah(zax)>
	//  198  464:invokevirtual   #174 <Method void zaaw.zac(ConnectionResult)>
		zax.zal(zafh).signalAll();
	//  199  467:aload_0         
	//  200  468:getfield        #13  <Field zax zafh>
	//  201  471:invokestatic    #178 <Method Condition zax.zal(zax)>
	//  202  474:invokeinterface #183 <Method void Condition.signalAll()>
		if(true) goto _L1; else goto _L10
	//  203  479:goto            24
_L10:
		task;
	//  204  482:astore_1        
		zax.zaa(zafh).unlock();
	//  205  483:aload_0         
	//  206  484:getfield        #13  <Field zax zafh>
	//  207  487:invokestatic    #28  <Method Lock zax.zaa(zax)>
	//  208  490:invokeinterface #40  <Method void Lock.unlock()>
		throw task;
	//  209  495:aload_1         
	//  210  496:athrow          
	}

	private final zax zafh;
}
