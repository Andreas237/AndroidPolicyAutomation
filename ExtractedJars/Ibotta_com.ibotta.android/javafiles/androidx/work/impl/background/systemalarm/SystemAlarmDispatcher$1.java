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
			break MISSING_BLOCK_LABEL_358;
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   19   39:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
	//   20   42:ifnull          358
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
		Logger.debug("SystemAlarmDispatcher", String.format("Processing command %s, %s", new Object[] {
			mCurrentIntent, Integer.valueOf(i)
		}), new Throwable[0]);
	//   33   70:ldc1            #51  <String "SystemAlarmDispatcher">
	//   34   72:ldc1            #53  <String "Processing command %s, %s">
	//   35   74:iconst_2        
	//   36   75:anewarray       Object[]
	//   37   78:dup             
	//   38   79:iconst_0        
	//   39   80:aload_0         
	//   40   81:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   41   84:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
	//   42   87:aastore         
	//   43   88:dup             
	//   44   89:iconst_1        
	//   45   90:iload_1         
	//   46   91:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   47   94:aastore         
	//   48   95:invokestatic    #65  <Method String String.format(String, Object[])>
	//   49   98:iconst_0        
	//   50   99:anewarray       Throwable[]
	//   51  102:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
		obj1 = ((Object) (WakeLocks.newWakeLock(mContext, String.format("%s (%s)", new Object[] {
			obj, Integer.valueOf(i)
		}))));
	//   52  105:aload_0         
	//   53  106:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   54  109:getfield        #75  <Field android.content.Context SystemAlarmDispatcher.mContext>
	//   55  112:ldc1            #77  <String "%s (%s)">
	//   56  114:iconst_2        
	//   57  115:anewarray       Object[]
	//   58  118:dup             
	//   59  119:iconst_0        
	//   60  120:aload_2         
	//   61  121:aastore         
	//   62  122:dup             
	//   63  123:iconst_1        
	//   64  124:iload_1         
	//   65  125:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   66  128:aastore         
	//   67  129:invokestatic    #65  <Method String String.format(String, Object[])>
	//   68  132:invokestatic    #83  <Method android.os.PowerManager$WakeLock WakeLocks.newWakeLock(android.content.Context, String)>
	//   69  135:astore_3        
		Logger.debug("SystemAlarmDispatcher", String.format("Acquiring operation wake lock (%s) %s", new Object[] {
			obj, obj1
		}), new Throwable[0]);
	//   70  136:ldc1            #51  <String "SystemAlarmDispatcher">
	//   71  138:ldc1            #85  <String "Acquiring operation wake lock (%s) %s">
	//   72  140:iconst_2        
	//   73  141:anewarray       Object[]
	//   74  144:dup             
	//   75  145:iconst_0        
	//   76  146:aload_2         
	//   77  147:aastore         
	//   78  148:dup             
	//   79  149:iconst_1        
	//   80  150:aload_3         
	//   81  151:aastore         
	//   82  152:invokestatic    #65  <Method String String.format(String, Object[])>
	//   83  155:iconst_0        
	//   84  156:anewarray       Throwable[]
	//   85  159:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
		((android.os.PowerManager.WakeLock) (obj1)).acquire();
	//   86  162:aload_3         
	//   87  163:invokevirtual   #90  <Method void android.os.PowerManager$WakeLock.acquire()>
		mCommandHandler.onHandleIntent(mCurrentIntent, i, SystemAlarmDispatcher.this);
	//   88  166:aload_0         
	//   89  167:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   90  170:getfield        #94  <Field CommandHandler SystemAlarmDispatcher.mCommandHandler>
	//   91  173:aload_0         
	//   92  174:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   93  177:getfield        #39  <Field Intent SystemAlarmDispatcher.mCurrentIntent>
	//   94  180:iload_1         
	//   95  181:aload_0         
	//   96  182:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//   97  185:invokevirtual   #100 <Method void CommandHandler.onHandleIntent(Intent, int, SystemAlarmDispatcher)>
		Logger.debug("SystemAlarmDispatcher", String.format("Releasing operation wake lock (%s) %s", new Object[] {
			obj, obj1
		}), new Throwable[0]);
	//   98  188:ldc1            #51  <String "SystemAlarmDispatcher">
	//   99  190:ldc1            #102 <String "Releasing operation wake lock (%s) %s">
	//  100  192:iconst_2        
	//  101  193:anewarray       Object[]
	//  102  196:dup             
	//  103  197:iconst_0        
	//  104  198:aload_2         
	//  105  199:aastore         
	//  106  200:dup             
	//  107  201:iconst_1        
	//  108  202:aload_3         
	//  109  203:aastore         
	//  110  204:invokestatic    #65  <Method String String.format(String, Object[])>
	//  111  207:iconst_0        
	//  112  208:anewarray       Throwable[]
	//  113  211:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
		((android.os.PowerManager.WakeLock) (obj1)).release();
	//  114  214:aload_3         
	//  115  215:invokevirtual   #105 <Method void android.os.PowerManager$WakeLock.release()>
		obj = ((Object) (SystemAlarmDispatcher.this));
	//  116  218:aload_0         
	//  117  219:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//  118  222:astore_2        
		obj1 = ((Object) (new queueAndCheckForCompletion(((SystemAlarmDispatcher) (obj)))));
	//  119  223:new             #107 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
	//  120  226:dup             
	//  121  227:aload_2         
	//  122  228:invokespecial   #109 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
	//  123  231:astore_3        
		break MISSING_BLOCK_LABEL_302;
	//  124  232:goto            302
		Object obj2;
		obj2;
	//  125  235:astore          4
		break MISSING_BLOCK_LABEL_308;
	//  126  237:goto            308
		obj2;
	//  127  240:astore          4
		Logger.error("SystemAlarmDispatcher", "Unexpected error in onHandleIntent", new Throwable[] {
			obj2
		});
	//  128  242:ldc1            #51  <String "SystemAlarmDispatcher">
	//  129  244:ldc1            #111 <String "Unexpected error in onHandleIntent">
	//  130  246:iconst_1        
	//  131  247:anewarray       Throwable[]
	//  132  250:dup             
	//  133  251:iconst_0        
	//  134  252:aload           4
	//  135  254:aastore         
	//  136  255:invokestatic    #114 <Method void Logger.error(String, String, Throwable[])>
		Logger.debug("SystemAlarmDispatcher", String.format("Releasing operation wake lock (%s) %s", new Object[] {
			obj, obj1
		}), new Throwable[0]);
	//  137  258:ldc1            #51  <String "SystemAlarmDispatcher">
	//  138  260:ldc1            #102 <String "Releasing operation wake lock (%s) %s">
	//  139  262:iconst_2        
	//  140  263:anewarray       Object[]
	//  141  266:dup             
	//  142  267:iconst_0        
	//  143  268:aload_2         
	//  144  269:aastore         
	//  145  270:dup             
	//  146  271:iconst_1        
	//  147  272:aload_3         
	//  148  273:aastore         
	//  149  274:invokestatic    #65  <Method String String.format(String, Object[])>
	//  150  277:iconst_0        
	//  151  278:anewarray       Throwable[]
	//  152  281:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
		((android.os.PowerManager.WakeLock) (obj1)).release();
	//  153  284:aload_3         
	//  154  285:invokevirtual   #105 <Method void android.os.PowerManager$WakeLock.release()>
		obj = ((Object) (SystemAlarmDispatcher.this));
	//  155  288:aload_0         
	//  156  289:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//  157  292:astore_2        
		obj1 = ((Object) (new queueAndCheckForCompletion(((SystemAlarmDispatcher) (obj)))));
	//  158  293:new             #107 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
	//  159  296:dup             
	//  160  297:aload_2         
	//  161  298:invokespecial   #109 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
	//  162  301:astore_3        
		((SystemAlarmDispatcher) (obj)).postOnMainThread(((Runnable) (obj1)));
	//  163  302:aload_2         
	//  164  303:aload_3         
	//  165  304:invokevirtual   #118 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		return;
	//  166  307:return          
		Logger.debug("SystemAlarmDispatcher", String.format("Releasing operation wake lock (%s) %s", new Object[] {
			obj, obj1
		}), new Throwable[0]);
	//  167  308:ldc1            #51  <String "SystemAlarmDispatcher">
	//  168  310:ldc1            #102 <String "Releasing operation wake lock (%s) %s">
	//  169  312:iconst_2        
	//  170  313:anewarray       Object[]
	//  171  316:dup             
	//  172  317:iconst_0        
	//  173  318:aload_2         
	//  174  319:aastore         
	//  175  320:dup             
	//  176  321:iconst_1        
	//  177  322:aload_3         
	//  178  323:aastore         
	//  179  324:invokestatic    #65  <Method String String.format(String, Object[])>
	//  180  327:iconst_0        
	//  181  328:anewarray       Throwable[]
	//  182  331:invokestatic    #71  <Method void Logger.debug(String, String, Throwable[])>
		((android.os.PowerManager.WakeLock) (obj1)).release();
	//  183  334:aload_3         
	//  184  335:invokevirtual   #105 <Method void android.os.PowerManager$WakeLock.release()>
		obj = ((Object) (SystemAlarmDispatcher.this));
	//  185  338:aload_0         
	//  186  339:getfield        #17  <Field SystemAlarmDispatcher this$0>
	//  187  342:astore_2        
		((SystemAlarmDispatcher) (obj)).postOnMainThread(((Runnable) (new queueAndCheckForCompletion(((SystemAlarmDispatcher) (obj))))));
	//  188  343:aload_2         
	//  189  344:new             #107 <Class SystemAlarmDispatcher$DequeueAndCheckForCompletion>
	//  190  347:dup             
	//  191  348:aload_2         
	//  192  349:invokespecial   #109 <Method void SystemAlarmDispatcher$DequeueAndCheckForCompletion(SystemAlarmDispatcher)>
	//  193  352:invokevirtual   #118 <Method void SystemAlarmDispatcher.postOnMainThread(Runnable)>
		throw obj2;
	//  194  355:aload           4
	//  195  357:athrow          
		return;
	//  196  358:return          
		exception;
	//  197  359:astore_3        
		obj;
	//  198  360:aload_2         
		JVM INSTR monitorexit ;
	//  199  361:monitorexit     
		throw exception;
	//  200  362:aload_3         
	//  201  363:athrow          
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
