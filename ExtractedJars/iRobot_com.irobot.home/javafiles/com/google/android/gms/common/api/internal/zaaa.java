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
	//    2    4:invokestatic    #34  <Method Lock zax.zaa(zax)>
	//    3    7:invokeinterface #39  <Method void Lock.lock()>
		if(zax.zab(zafh)) goto _L2; else goto _L1
	//    4   12:aload_0         
	//    5   13:getfield        #15  <Field zax zafh>
	//    6   16:invokestatic    #43  <Method boolean zax.zab(zax)>
	//    7   19:ifne            46
_L1:
		task = ((Task) (zafi));
	//    8   22:aload_0         
	//    9   23:getfield        #20  <Field SignInConnectionListener zafi>
	//   10   26:astore_1        
_L6:
		((SignInConnectionListener) (task)).onComplete();
	//   11   27:aload_1         
	//   12   28:invokeinterface #27  <Method void SignInConnectionListener.onComplete()>
		zax.zaa(zafh).unlock();
	//   13   33:aload_0         
	//   14   34:getfield        #15  <Field zax zafh>
	//   15   37:invokestatic    #34  <Method Lock zax.zaa(zax)>
	//   16   40:invokeinterface #46  <Method void Lock.unlock()>
		return;
	//   17   45:return          
_L2:
		if(task.isSuccessful())
	//*  18   46:aload_1         
	//*  19   47:invokevirtual   #52  <Method boolean Task.isSuccessful()>
	//*  20   50:ifeq            140
		{
			zax.zab(zafh, ((Map) (new a(zax.zam(zafh).size()))));
	//   21   53:aload_0         
	//   22   54:getfield        #15  <Field zax zafh>
	//   23   57:new             #54  <Class a>
	//   24   60:dup             
	//   25   61:aload_0         
	//   26   62:getfield        #15  <Field zax zafh>
	//   27   65:invokestatic    #58  <Method Map zax.zam(zax)>
	//   28   68:invokeinterface #64  <Method int Map.size()>
	//   29   73:invokespecial   #67  <Method void a(int)>
	//   30   76:invokestatic    #70  <Method Map zax.zab(zax, Map)>
	//   31   79:pop             
			zaw zaw1;
			for(task = ((Task) (zax.zam(zafh).values().iterator())); ((Iterator) (task)).hasNext(); zax.zag(zafh).put(((Object) (((GoogleApi) (zaw1)).zak())), ((Object) (ConnectionResult.RESULT_SUCCESS))))
	//*  32   80:aload_0         
	//*  33   81:getfield        #15  <Field zax zafh>
	//*  34   84:invokestatic    #58  <Method Map zax.zam(zax)>
	//*  35   87:invokeinterface #74  <Method Collection Map.values()>
	//*  36   92:invokeinterface #80  <Method Iterator Collection.iterator()>
	//*  37   97:astore_1        
	//*  38   98:aload_1         
	//*  39   99:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//*  40  104:ifeq            339
				zaw1 = (zaw)((Iterator) (task)).next();
	//   41  107:aload_1         
	//   42  108:invokeinterface #89  <Method Object Iterator.next()>
	//   43  113:checkcast       #91  <Class zaw>
	//   44  116:astore_2        

	//   45  117:aload_0         
	//   46  118:getfield        #15  <Field zax zafh>
	//   47  121:invokestatic    #94  <Method Map zax.zag(zax)>
	//   48  124:aload_2         
	//   49  125:invokevirtual   #100 <Method zai GoogleApi.zak()>
	//   50  128:getstatic       #106 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   51  131:invokeinterface #110 <Method Object Map.put(Object, Object)>
	//   52  136:pop             
			break MISSING_BLOCK_LABEL_339;
	//   53  137:goto            98
		}
		AvailabilityException availabilityexception;
		Iterator iterator;
		if(!(task.getException() instanceof AvailabilityException))
			break MISSING_BLOCK_LABEL_316;
	//   54  140:aload_1         
	//   55  141:invokevirtual   #114 <Method Exception Task.getException()>
	//   56  144:instanceof      #116 <Class AvailabilityException>
	//   57  147:ifeq            316
		availabilityexception = (AvailabilityException)task.getException();
	//   58  150:aload_1         
	//   59  151:invokevirtual   #114 <Method Exception Task.getException()>
	//   60  154:checkcast       #116 <Class AvailabilityException>
	//   61  157:astore_3        
		if(!zax.zae(zafh))
			break MISSING_BLOCK_LABEL_301;
	//   62  158:aload_0         
	//   63  159:getfield        #15  <Field zax zafh>
	//   64  162:invokestatic    #119 <Method boolean zax.zae(zax)>
	//   65  165:ifeq            301
		zax.zab(zafh, ((Map) (new a(zax.zam(zafh).size()))));
	//   66  168:aload_0         
	//   67  169:getfield        #15  <Field zax zafh>
	//   68  172:new             #54  <Class a>
	//   69  175:dup             
	//   70  176:aload_0         
	//   71  177:getfield        #15  <Field zax zafh>
	//   72  180:invokestatic    #58  <Method Map zax.zam(zax)>
	//   73  183:invokeinterface #64  <Method int Map.size()>
	//   74  188:invokespecial   #67  <Method void a(int)>
	//   75  191:invokestatic    #70  <Method Map zax.zab(zax, Map)>
	//   76  194:pop             
		iterator = zax.zam(zafh).values().iterator();
	//   77  195:aload_0         
	//   78  196:getfield        #15  <Field zax zafh>
	//   79  199:invokestatic    #58  <Method Map zax.zam(zax)>
	//   80  202:invokeinterface #74  <Method Collection Map.values()>
	//   81  207:invokeinterface #80  <Method Iterator Collection.iterator()>
	//   82  212:astore          4
_L4:
		ConnectionResult connectionresult;
		zai zai;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_339;
	//   83  214:aload           4
	//   84  216:invokeinterface #85  <Method boolean Iterator.hasNext()>
	//   85  221:ifeq            339
		task = ((Task) ((zaw)iterator.next()));
	//   86  224:aload           4
	//   87  226:invokeinterface #89  <Method Object Iterator.next()>
	//   88  231:checkcast       #91  <Class zaw>
	//   89  234:astore_1        
		zai = ((GoogleApi) (task)).zak();
	//   90  235:aload_1         
	//   91  236:invokevirtual   #100 <Method zai GoogleApi.zak()>
	//   92  239:astore          5
		connectionresult = availabilityexception.getConnectionResult(((GoogleApi) (task)));
	//   93  241:aload_3         
	//   94  242:aload_1         
	//   95  243:invokevirtual   #123 <Method ConnectionResult AvailabilityException.getConnectionResult(GoogleApi)>
	//   96  246:astore_2        
		if(!zax.zaa(zafh, ((zaw) (task)), connectionresult))
			break; /* Loop/switch isn't completed */
	//   97  247:aload_0         
	//   98  248:getfield        #15  <Field zax zafh>
	//   99  251:aload_1         
	//  100  252:aload_2         
	//  101  253:invokestatic    #126 <Method boolean zax.zaa(zax, zaw, ConnectionResult)>
	//  102  256:ifeq            290
		task = ((Task) (zax.zag(zafh)));
	//  103  259:aload_0         
	//  104  260:getfield        #15  <Field zax zafh>
	//  105  263:invokestatic    #94  <Method Map zax.zag(zax)>
	//  106  266:astore_1        
		connectionresult = new ConnectionResult(16);
	//  107  267:new             #102 <Class ConnectionResult>
	//  108  270:dup             
	//  109  271:bipush          16
	//  110  273:invokespecial   #127 <Method void ConnectionResult(int)>
	//  111  276:astore_2        
_L5:
		((Map) (task)).put(((Object) (zai)), ((Object) (connectionresult)));
	//  112  277:aload_1         
	//  113  278:aload           5
	//  114  280:aload_2         
	//  115  281:invokeinterface #110 <Method Object Map.put(Object, Object)>
	//  116  286:pop             
		if(true) goto _L4; else goto _L3
	//  117  287:goto            214
_L3:
		task = ((Task) (zax.zag(zafh)));
	//  118  290:aload_0         
	//  119  291:getfield        #15  <Field zax zafh>
	//  120  294:invokestatic    #94  <Method Map zax.zag(zax)>
	//  121  297:astore_1        
		  goto _L5
	//* 122  298:goto            277
		zax.zab(zafh, ((Map) (availabilityexception.zaj())));
	//  123  301:aload_0         
	//  124  302:getfield        #15  <Field zax zafh>
	//  125  305:aload_3         
	//  126  306:invokevirtual   #131 <Method a AvailabilityException.zaj()>
	//  127  309:invokestatic    #70  <Method Map zax.zab(zax, Map)>
	//  128  312:pop             
		break MISSING_BLOCK_LABEL_339;
	//  129  313:goto            339
		Log.e("ConnectionlessGAC", "Unexpected availability exception", ((Throwable) (task.getException())));
	//  130  316:ldc1            #133 <String "ConnectionlessGAC">
	//  131  318:ldc1            #135 <String "Unexpected availability exception">
	//  132  320:aload_1         
	//  133  321:invokevirtual   #114 <Method Exception Task.getException()>
	//  134  324:invokestatic    #141 <Method int Log.e(String, String, Throwable)>
	//  135  327:pop             
		zax.zab(zafh, Collections.emptyMap());
	//  136  328:aload_0         
	//  137  329:getfield        #15  <Field zax zafh>
	//  138  332:invokestatic    #147 <Method Map Collections.emptyMap()>
	//  139  335:invokestatic    #70  <Method Map zax.zab(zax, Map)>
	//  140  338:pop             
		if(zafh.isConnected())
	//* 141  339:aload_0         
	//* 142  340:getfield        #15  <Field zax zafh>
	//* 143  343:invokevirtual   #150 <Method boolean zax.isConnected()>
	//* 144  346:ifeq            404
		{
			zax.zad(zafh).putAll(zax.zag(zafh));
	//  145  349:aload_0         
	//  146  350:getfield        #15  <Field zax zafh>
	//  147  353:invokestatic    #153 <Method Map zax.zad(zax)>
	//  148  356:aload_0         
	//  149  357:getfield        #15  <Field zax zafh>
	//  150  360:invokestatic    #94  <Method Map zax.zag(zax)>
	//  151  363:invokeinterface #157 <Method void Map.putAll(Map)>
			if(zax.zaf(zafh) == null)
	//* 152  368:aload_0         
	//* 153  369:getfield        #15  <Field zax zafh>
	//* 154  372:invokestatic    #161 <Method ConnectionResult zax.zaf(zax)>
	//* 155  375:ifnonnull       404
			{
				zax.zai(zafh);
	//  156  378:aload_0         
	//  157  379:getfield        #15  <Field zax zafh>
	//  158  382:invokestatic    #165 <Method void zax.zai(zax)>
				zax.zaj(zafh);
	//  159  385:aload_0         
	//  160  386:getfield        #15  <Field zax zafh>
	//  161  389:invokestatic    #167 <Method void zax.zaj(zax)>
				zax.zal(zafh).signalAll();
	//  162  392:aload_0         
	//  163  393:getfield        #15  <Field zax zafh>
	//  164  396:invokestatic    #171 <Method Condition zax.zal(zax)>
	//  165  399:invokeinterface #176 <Method void Condition.signalAll()>
			}
		}
		task = ((Task) (zafi));
	//  166  404:aload_0         
	//  167  405:getfield        #20  <Field SignInConnectionListener zafi>
	//  168  408:astore_1        
		  goto _L6
	//* 169  409:goto            27
		task;
	//  170  412:astore_1        
		zax.zaa(zafh).unlock();
	//  171  413:aload_0         
	//  172  414:getfield        #15  <Field zax zafh>
	//  173  417:invokestatic    #34  <Method Lock zax.zaa(zax)>
	//  174  420:invokeinterface #46  <Method void Lock.unlock()>
		throw task;
	//  175  425:aload_1         
	//  176  426:athrow          
	}

	private final zax zafh;
	private SignInConnectionListener zafi;
}
