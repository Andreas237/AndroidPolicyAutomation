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
//			SignInConnectionListener, zax, zaw

final class zaaa
	implements OnCompleteListener
{

	zaaa(zax zax1, SignInConnectionListener signinconnectionlistener)
	{
		zafh = zax1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zax zafh>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
		zafi = signinconnectionlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field SignInConnectionListener zafi>
	//    8   14:return          
	}

	final void cancel()
	{
		zafi.onComplete();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SignInConnectionListener zafi>
	//    2    4:invokeinterface #27  <Method void SignInConnectionListener.onComplete()>
	//    3    9:return          
	}

	public final void onComplete(Task task)
	{
		zax.zaa(zafh).lock();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zax zafh>
	//    2    4:invokestatic    #35  <Method Lock zax.zaa(zax)>
	//    3    7:invokeinterface #40  <Method void Lock.lock()>
		if(zax.zab(zafh))
			break MISSING_BLOCK_LABEL_44;
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zax zafh>
	//    6   16:invokestatic    #44  <Method boolean zax.zab(zax)>
	//    7   19:ifne            44
		zafi.onComplete();
	//    8   22:aload_0         
	//    9   23:getfield        #20  <Field SignInConnectionListener zafi>
	//   10   26:invokeinterface #27  <Method void SignInConnectionListener.onComplete()>
		zax.zaa(zafh).unlock();
	//   11   31:aload_0         
	//   12   32:getfield        #15  <Field zax zafh>
	//   13   35:invokestatic    #35  <Method Lock zax.zaa(zax)>
	//   14   38:invokeinterface #47  <Method void Lock.unlock()>
		return;
	//   15   43:return          
		if(task.isSuccessful())
	//*  16   44:aload_1         
	//*  17   45:invokevirtual   #53  <Method boolean Task.isSuccessful()>
	//*  18   48:ifeq            138
		{
			zax.zab(zafh, ((Map) (new ArrayMap(zax.zam(zafh).size()))));
	//   19   51:aload_0         
	//   20   52:getfield        #15  <Field zax zafh>
	//   21   55:new             #55  <Class ArrayMap>
	//   22   58:dup             
	//   23   59:aload_0         
	//   24   60:getfield        #15  <Field zax zafh>
	//   25   63:invokestatic    #59  <Method Map zax.zam(zax)>
	//   26   66:invokeinterface #65  <Method int Map.size()>
	//   27   71:invokespecial   #68  <Method void ArrayMap(int)>
	//   28   74:invokestatic    #71  <Method Map zax.zab(zax, Map)>
	//   29   77:pop             
			zaw zaw1;
			for(task = ((Task) (zax.zam(zafh).values().iterator())); ((Iterator) (task)).hasNext(); zax.zag(zafh).put(((Object) (((GoogleApi) (zaw1)).zak())), ((Object) (ConnectionResult.RESULT_SUCCESS))))
	//*  30   78:aload_0         
	//*  31   79:getfield        #15  <Field zax zafh>
	//*  32   82:invokestatic    #59  <Method Map zax.zam(zax)>
	//*  33   85:invokeinterface #75  <Method Collection Map.values()>
	//*  34   90:invokeinterface #81  <Method Iterator Collection.iterator()>
	//*  35   95:astore_1        
	//*  36   96:aload_1         
	//*  37   97:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//*  38  102:ifeq            341
				zaw1 = (zaw)((Iterator) (task)).next();
	//   39  105:aload_1         
	//   40  106:invokeinterface #90  <Method Object Iterator.next()>
	//   41  111:checkcast       #92  <Class zaw>
	//   42  114:astore_2        

	//   43  115:aload_0         
	//   44  116:getfield        #15  <Field zax zafh>
	//   45  119:invokestatic    #95  <Method Map zax.zag(zax)>
	//   46  122:aload_2         
	//   47  123:invokevirtual   #101 <Method zai GoogleApi.zak()>
	//   48  126:getstatic       #107 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   49  129:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//   50  134:pop             
			break MISSING_BLOCK_LABEL_341;
	//   51  135:goto            96
		}
		Iterator iterator;
		if(!(task.getException() instanceof AvailabilityException))
			break MISSING_BLOCK_LABEL_318;
	//   52  138:aload_1         
	//   53  139:invokevirtual   #115 <Method Exception Task.getException()>
	//   54  142:instanceof      #117 <Class AvailabilityException>
	//   55  145:ifeq            318
		task = ((Task) ((AvailabilityException)task.getException()));
	//   56  148:aload_1         
	//   57  149:invokevirtual   #115 <Method Exception Task.getException()>
	//   58  152:checkcast       #117 <Class AvailabilityException>
	//   59  155:astore_1        
		if(!zax.zae(zafh))
			break MISSING_BLOCK_LABEL_303;
	//   60  156:aload_0         
	//   61  157:getfield        #15  <Field zax zafh>
	//   62  160:invokestatic    #120 <Method boolean zax.zae(zax)>
	//   63  163:ifeq            303
		zax.zab(zafh, ((Map) (new ArrayMap(zax.zam(zafh).size()))));
	//   64  166:aload_0         
	//   65  167:getfield        #15  <Field zax zafh>
	//   66  170:new             #55  <Class ArrayMap>
	//   67  173:dup             
	//   68  174:aload_0         
	//   69  175:getfield        #15  <Field zax zafh>
	//   70  178:invokestatic    #59  <Method Map zax.zam(zax)>
	//   71  181:invokeinterface #65  <Method int Map.size()>
	//   72  186:invokespecial   #68  <Method void ArrayMap(int)>
	//   73  189:invokestatic    #71  <Method Map zax.zab(zax, Map)>
	//   74  192:pop             
		iterator = zax.zam(zafh).values().iterator();
	//   75  193:aload_0         
	//   76  194:getfield        #15  <Field zax zafh>
	//   77  197:invokestatic    #59  <Method Map zax.zam(zax)>
	//   78  200:invokeinterface #75  <Method Collection Map.values()>
	//   79  205:invokeinterface #81  <Method Iterator Collection.iterator()>
	//   80  210:astore_2        
_L2:
		zai zai;
		ConnectionResult connectionresult;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_341;
	//   81  211:aload_2         
	//   82  212:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   83  217:ifeq            341
			zaw zaw2 = (zaw)iterator.next();
	//   84  220:aload_2         
	//   85  221:invokeinterface #90  <Method Object Iterator.next()>
	//   86  226:checkcast       #92  <Class zaw>
	//   87  229:astore_3        
			zai = ((GoogleApi) (zaw2)).zak();
	//   88  230:aload_3         
	//   89  231:invokevirtual   #101 <Method zai GoogleApi.zak()>
	//   90  234:astore          4
			connectionresult = ((AvailabilityException) (task)).getConnectionResult(((GoogleApi) (zaw2)));
	//   91  236:aload_1         
	//   92  237:aload_3         
	//   93  238:invokevirtual   #124 <Method ConnectionResult AvailabilityException.getConnectionResult(GoogleApi)>
	//   94  241:astore          5
			if(!zax.zaa(zafh, zaw2, connectionresult))
				break MISSING_BLOCK_LABEL_283;
	//   95  243:aload_0         
	//   96  244:getfield        #15  <Field zax zafh>
	//   97  247:aload_3         
	//   98  248:aload           5
	//   99  250:invokestatic    #127 <Method boolean zax.zaa(zax, zaw, ConnectionResult)>
	//  100  253:ifeq            283
			zax.zag(zafh).put(((Object) (zai)), ((Object) (new ConnectionResult(16))));
	//  101  256:aload_0         
	//  102  257:getfield        #15  <Field zax zafh>
	//  103  260:invokestatic    #95  <Method Map zax.zag(zax)>
	//  104  263:aload           4
	//  105  265:new             #103 <Class ConnectionResult>
	//  106  268:dup             
	//  107  269:bipush          16
	//  108  271:invokespecial   #128 <Method void ConnectionResult(int)>
	//  109  274:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//  110  279:pop             
		} while(true);
	//  111  280:goto            211
		zax.zag(zafh).put(((Object) (zai)), ((Object) (connectionresult)));
	//  112  283:aload_0         
	//  113  284:getfield        #15  <Field zax zafh>
	//  114  287:invokestatic    #95  <Method Map zax.zag(zax)>
	//  115  290:aload           4
	//  116  292:aload           5
	//  117  294:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//  118  299:pop             
		if(true) goto _L2; else goto _L1
	//  119  300:goto            211
_L1:
		zax.zab(zafh, ((Map) (((AvailabilityException) (task)).zaj())));
	//  120  303:aload_0         
	//  121  304:getfield        #15  <Field zax zafh>
	//  122  307:aload_1         
	//  123  308:invokevirtual   #132 <Method ArrayMap AvailabilityException.zaj()>
	//  124  311:invokestatic    #71  <Method Map zax.zab(zax, Map)>
	//  125  314:pop             
		break MISSING_BLOCK_LABEL_341;
	//  126  315:goto            341
		Log.e("ConnectionlessGAC", "Unexpected availability exception", ((Throwable) (task.getException())));
	//  127  318:ldc1            #134 <String "ConnectionlessGAC">
	//  128  320:ldc1            #136 <String "Unexpected availability exception">
	//  129  322:aload_1         
	//  130  323:invokevirtual   #115 <Method Exception Task.getException()>
	//  131  326:invokestatic    #142 <Method int Log.e(String, String, Throwable)>
	//  132  329:pop             
		zax.zab(zafh, Collections.emptyMap());
	//  133  330:aload_0         
	//  134  331:getfield        #15  <Field zax zafh>
	//  135  334:invokestatic    #148 <Method Map Collections.emptyMap()>
	//  136  337:invokestatic    #71  <Method Map zax.zab(zax, Map)>
	//  137  340:pop             
		if(zafh.isConnected())
	//* 138  341:aload_0         
	//* 139  342:getfield        #15  <Field zax zafh>
	//* 140  345:invokevirtual   #151 <Method boolean zax.isConnected()>
	//* 141  348:ifeq            406
		{
			zax.zad(zafh).putAll(zax.zag(zafh));
	//  142  351:aload_0         
	//  143  352:getfield        #15  <Field zax zafh>
	//  144  355:invokestatic    #154 <Method Map zax.zad(zax)>
	//  145  358:aload_0         
	//  146  359:getfield        #15  <Field zax zafh>
	//  147  362:invokestatic    #95  <Method Map zax.zag(zax)>
	//  148  365:invokeinterface #158 <Method void Map.putAll(Map)>
			if(zax.zaf(zafh) == null)
	//* 149  370:aload_0         
	//* 150  371:getfield        #15  <Field zax zafh>
	//* 151  374:invokestatic    #162 <Method ConnectionResult zax.zaf(zax)>
	//* 152  377:ifnonnull       406
			{
				zax.zai(zafh);
	//  153  380:aload_0         
	//  154  381:getfield        #15  <Field zax zafh>
	//  155  384:invokestatic    #166 <Method void zax.zai(zax)>
				zax.zaj(zafh);
	//  156  387:aload_0         
	//  157  388:getfield        #15  <Field zax zafh>
	//  158  391:invokestatic    #168 <Method void zax.zaj(zax)>
				zax.zal(zafh).signalAll();
	//  159  394:aload_0         
	//  160  395:getfield        #15  <Field zax zafh>
	//  161  398:invokestatic    #172 <Method Condition zax.zal(zax)>
	//  162  401:invokeinterface #177 <Method void Condition.signalAll()>
			}
		}
		zafi.onComplete();
	//  163  406:aload_0         
	//  164  407:getfield        #20  <Field SignInConnectionListener zafi>
	//  165  410:invokeinterface #27  <Method void SignInConnectionListener.onComplete()>
		zax.zaa(zafh).unlock();
	//  166  415:aload_0         
	//  167  416:getfield        #15  <Field zax zafh>
	//  168  419:invokestatic    #35  <Method Lock zax.zaa(zax)>
	//  169  422:invokeinterface #47  <Method void Lock.unlock()>
		return;
	//  170  427:return          
		task;
	//  171  428:astore_1        
		zax.zaa(zafh).unlock();
	//  172  429:aload_0         
	//  173  430:getfield        #15  <Field zax zafh>
	//  174  433:invokestatic    #35  <Method Lock zax.zaa(zax)>
	//  175  436:invokeinterface #47  <Method void Lock.unlock()>
		throw task;
	//  176  441:aload_1         
	//  177  442:athrow          
	}

	private final zax zafh;
	private SignInConnectionListener zafi;
}
