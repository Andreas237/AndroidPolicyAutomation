// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.utils.WakeLocks;
import java.util.List;

// Referenced classes of package androidx.work.impl.background.systemalarm:
//			SystemAlarmDispatcher, CommandHandler

class SystemAlarmDispatcher$1
	implements Runnable
{

	public void run()
	{
		int i;
		Object obj1;
		synchronized(mIntents)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//*   2    4:getfield        #27  <Field List SystemAlarmDispatcher.mIntents>
	//*   3    7:astore_2        
	//*   4    8:aload_2         
	//*   5    9:monitorenter    
		{
			mCurrentIntent = (Intent)mIntents.get(0);
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//    8   14:aload_0         
	//    9   15:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   10   18:getfield        #27  <Field List SystemAlarmDispatcher.mIntents>
	//   11   21:iconst_0        
	//   12   22:invokeinterface #33  <Method Object List.get(int)>
	//   13   27:checkcast       #35  <Class Intent>
	//   14   30:putfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
		}
	//   15   33:aload_2         
	//   16   34:monitorexit     
		if(mCurrentIntent == null)
			break MISSING_BLOCK_LABEL_382;
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   19   39:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
	//   20   42:ifnull          382
		obj = ((Object) (mCurrentIntent.getAction()));
	//   21   45:aload_0         
	//   22   46:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   23   49:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
	//   24   52:invokevirtual   #43  <Method String Intent.getAction()>
	//   25   55:astore_2        
		i = mCurrentIntent.getIntExtra("KEY_START_ID", 0);
	//   26   56:aload_0         
	//   27   57:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   28   60:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
	//   29   63:ldc1            #45  <String "KEY_START_ID">
	//   30   65:iconst_0        
	//   31   66:invokevirtual   #49  <Method int Intent.getIntExtra(String, int)>
	//   32   69:istore_1        
		Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Processing command %s, %s", new Object[] {
			mCurrentIntent, Integer.valueOf(i)
		}), new Throwable[0]);
	//   33   70:invokestatic    #54  <Method Logger Logger.get()>
	//   34   73:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
	//   35   76:ldc1            #60  <String "Processing command %s, %s">
	//   36   78:iconst_2        
	//   37   79:anewarray       Object[]
	//   38   82:dup             
	//   39   83:iconst_0        
	//   40   84:aload_0         
	//   41   85:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   42   88:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
	//   43   91:aastore         
	//   44   92:dup             
	//   45   93:iconst_1        
	//   46   94:iload_1         
	//   47   95:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   48   98:aastore         
	//   49   99:invokestatic    #72  <Method String String.format(String, Object[])>
	//   50  102:iconst_0        
	//   51  103:anewarray       Throwable[]
	//   52  106:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
		obj1 = ((Object) (WakeLocks.newWakeLock(mContext, String.format("%s (%s)", new Object[] {
			obj, Integer.valueOf(i)
		}))));
	//   53  109:aload_0         
	//   54  110:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   55  113:getfield        #80  <Field android.content.Context SystemAlarmDispatcher.mContext>
	//   56  116:ldc1            #82  <String "%s (%s)">
	//   57  118:iconst_2        
	//   58  119:anewarray       Object[]
	//   59  122:dup             
	//   60  123:iconst_0        
	//   61  124:aload_2         
	//   62  125:aastore         
	//   63  126:dup             
	//   64  127:iconst_1        
	//   65  128:iload_1         
	//   66  129:invokestatic    #66  <Method Integer Integer.valueOf(int)>
	//   67  132:aastore         
	//   68  133:invokestatic    #72  <Method String String.format(String, Object[])>
	//   69  136:invokestatic    #88  <Method android.os.PowerManager$WakeLock WakeLocks.newWakeLock(android.content.Context, String)>
	//   70  139:astore_3        
		Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Acquiring operation wake lock (%s) %s", new Object[] {
			obj, obj1
		}), new Throwable[0]);
	//   71  140:invokestatic    #54  <Method Logger Logger.get()>
	//   72  143:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
	//   73  146:ldc1            #90  <String "Acquiring operation wake lock (%s) %s">
	//   74  148:iconst_2        
	//   75  149:anewarray       Object[]
	//   76  152:dup             
	//   77  153:iconst_0        
	//   78  154:aload_2         
	//   79  155:aastore         
	//   80  156:dup             
	//   81  157:iconst_1        
	//   82  158:aload_3         
	//   83  159:aastore         
	//   84  160:invokestatic    #72  <Method String String.format(String, Object[])>
	//   85  163:iconst_0        
	//   86  164:anewarray       Throwable[]
	//   87  167:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
		((android.os.PowerManager.WakeLock) (obj1)).acquire();
	//   88  170:aload_3         
	//   89  171:invokevirtual   #95  <Method void android.os.PowerManager$WakeLock.acquire()>
		mCommandHandler.onHandleIntent(mCurrentIntent, i, SystemAlarmDispatcher.this);
	//   90  174:aload_0         
	//   91  175:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   92  178:getfield        #99  <Field CommandHandler SystemAlarmDispatcher.mCommandHandler>
	//   93  181:aload_0         
	//   94  182:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   95  185:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
	//   96  188:iload_1         
	//   97  189:aload_0         
	//   98  190:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   99  193:invokevirtual   #105 <Method void CommandHandler.onHandleIntent(Intent, int, SystemAlarmDispatcher)>
		Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", new Object[] {
			obj, obj1
		}), new Throwable[0]);
	//  100  196:invokestatic    #54  <Method Logger Logger.get()>
	//  101  199:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
	//  102  202:ldc1            #107 <String "Releasing operation wake lock (%s) %s">
	//  103  204:iconst_2        
	//  104  205:anewarray       Object[]
	//  105  208:dup             
	//  106  209:iconst_0        
	//  107  210:aload_2         
	//  108  211:aastore         
	//  109  212:dup             
	//  110  213:iconst_1        
	//  111  214:aload_3         
	//  112  215:aastore         
	//  113  216:invokestatic    #72  <Method String String.format(String, Object[])>
	//  114  219:iconst_0        
	//  115  220:anewarray       Throwable[]
	//  116  223:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
		((android.os.PowerManager.WakeLock) (obj1)).release();
	//  117  226:aload_3         
	//  118  227:invokevirtual   #110 <Method void android.os.PowerManager$WakeLock.release()>
		obj = ((Object) (SystemAlarmDispatcher.this));
	//  119  230:aload_0         
	//  120  231:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//  121  234:astore_2        
		obj1 = ((Object) (new queueAndCheckForCompletion(((SystemAlarmDispatcher) (obj)))));
	//  122  235:new             #112 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
	//  123  238:dup             
	//  124  239:aload_2         
	//  125  240:invokespecial   #114 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
	//  126  243:astore_3        
		break MISSING_BLOCK_LABEL_322;
	//  127  244:goto            322
		Object obj2;
		obj2;
	//  128  247:astore          4
		break MISSING_BLOCK_LABEL_328;
	//  129  249:goto            328
		obj2;
	//  130  252:astore          4
		Logger.get().error(SystemAlarmDispatcher.TAG, "Unexpected error in onHandleIntent", new Throwable[] {
			obj2
		});
	//  131  254:invokestatic    #54  <Method Logger Logger.get()>
	//  132  257:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
	//  133  260:ldc1            #116 <String "Unexpected error in onHandleIntent">
	//  134  262:iconst_1        
	//  135  263:anewarray       Throwable[]
	//  136  266:dup             
	//  137  267:iconst_0        
	//  138  268:aload           4
	//  139  270:aastore         
	//  140  271:invokevirtual   #119 <Method void Logger.error(String, String, Throwable[])>
		Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", new Object[] {
			obj, obj1
		}), new Throwable[0]);
	//  141  274:invokestatic    #54  <Method Logger Logger.get()>
	//  142  277:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
	//  143  280:ldc1            #107 <String "Releasing operation wake lock (%s) %s">
	//  144  282:iconst_2        
	//  145  283:anewarray       Object[]
	//  146  286:dup             
	//  147  287:iconst_0        
	//  148  288:aload_2         
	//  149  289:aastore         
	//  150  290:dup             
	//  151  291:iconst_1        
	//  152  292:aload_3         
	//  153  293:aastore         
	//  154  294:invokestatic    #72  <Method String String.format(String, Object[])>
	//  155  297:iconst_0        
	//  156  298:anewarray       Throwable[]
	//  157  301:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
		((android.os.PowerManager.WakeLock) (obj1)).release();
	//  158  304:aload_3         
	//  159  305:invokevirtual   #110 <Method void android.os.PowerManager$WakeLock.release()>
		obj = ((Object) (SystemAlarmDispatcher.this));
	//  160  308:aload_0         
	//  161  309:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//  162  312:astore_2        
		obj1 = ((Object) (new queueAndCheckForCompletion(((SystemAlarmDispatcher) (obj)))));
	//  163  313:new             #112 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
	//  164  316:dup             
	//  165  317:aload_2         
	//  166  318:invokespecial   #114 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
	//  167  321:astore_3        
		((SystemAlarmDispatcher) (obj)).postOnMainThread(((Runnable) (obj1)));
	//  168  322:aload_2         
	//  169  323:aload_3         
	//  170  324:invokevirtual   #123 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		return;
	//  171  327:return          
		Logger.get().debug(SystemAlarmDispatcher.TAG, String.format("Releasing operation wake lock (%s) %s", new Object[] {
			obj, obj1
		}), new Throwable[0]);
	//  172  328:invokestatic    #54  <Method Logger Logger.get()>
	//  173  331:getstatic       #58  <Field String SystemAlarmDispatcher.TAG>
	//  174  334:ldc1            #107 <String "Releasing operation wake lock (%s) %s">
	//  175  336:iconst_2        
	//  176  337:anewarray       Object[]
	//  177  340:dup             
	//  178  341:iconst_0        
	//  179  342:aload_2         
	//  180  343:aastore         
	//  181  344:dup             
	//  182  345:iconst_1        
	//  183  346:aload_3         
	//  184  347:aastore         
	//  185  348:invokestatic    #72  <Method String String.format(String, Object[])>
	//  186  351:iconst_0        
	//  187  352:anewarray       Throwable[]
	//  188  355:invokevirtual   #76  <Method void Logger.debug(String, String, Throwable[])>
		((android.os.PowerManager.WakeLock) (obj1)).release();
	//  189  358:aload_3         
	//  190  359:invokevirtual   #110 <Method void android.os.PowerManager$WakeLock.release()>
		obj = ((Object) (SystemAlarmDispatcher.this));
	//  191  362:aload_0         
	//  192  363:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//  193  366:astore_2        
		((SystemAlarmDispatcher) (obj)).postOnMainThread(((Runnable) (new queueAndCheckForCompletion(((SystemAlarmDispatcher) (obj))))));
	//  194  367:aload_2         
	//  195  368:new             #112 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
	//  196  371:dup             
	//  197  372:aload_2         
	//  198  373:invokespecial   #114 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
	//  199  376:invokevirtual   #123 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		throw obj2;
	//  200  379:aload           4
	//  201  381:athrow          
		return;
	//  202  382:return          
		exception;
	//  203  383:astore_3        
		obj;
	//  204  384:aload_2         
		JVM INSTR monitorexit ;
	//  205  385:monitorexit     
		throw exception;
	//  206  386:aload_3         
	//  207  387:athrow          
	}

	final SystemAlarmDispatcher this$0;

	SystemAlarmDispatcher$1()
	{
		this$0 = SystemAlarmDispatcher.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SystemAlarmDispatcher this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
