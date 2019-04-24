// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.*;
import android.os.PowerManager;

// Referenced classes of package android.support.v4.app:
//			JobIntentService

static final class JobIntentService$CompatWorkEnqueuer extends JobIntentService.WorkEnqueuer
{

	void enqueueWork(Intent intent)
	{
		intent = new Intent(intent);
	//    0    0:new             #76  <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #78  <Method void Intent(Intent)>
	//    4    8:astore_1        
		intent.setComponent(mComponentName);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #82  <Field ComponentName mComponentName>
	//    8   14:invokevirtual   #86  <Method Intent Intent.setComponent(ComponentName)>
	//    9   17:pop             
		if(mContext.startService(intent) == null)
			break MISSING_BLOCK_LABEL_68;
	//   10   18:aload_0         
	//   11   19:getfield        #27  <Field Context mContext>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #90  <Method ComponentName Context.startService(Intent)>
	//   14   26:ifnull          68
		this;
	//   15   29:aload_0         
		JVM INSTR monitorenter ;
	//   16   30:monitorenter    
		if(!mLaunchingService)
	//*  17   31:aload_0         
	//*  18   32:getfield        #92  <Field boolean mLaunchingService>
	//*  19   35:ifne            60
		{
			mLaunchingService = true;
	//   20   38:aload_0         
	//   21   39:iconst_1        
	//   22   40:putfield        #92  <Field boolean mLaunchingService>
			if(!mServiceProcessing)
	//*  23   43:aload_0         
	//*  24   44:getfield        #94  <Field boolean mServiceProcessing>
	//*  25   47:ifne            60
				mLaunchWakeLock.acquire(60000L);
	//   26   50:aload_0         
	//   27   51:getfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
	//   28   54:ldc2w           #95  <Long 60000L>
	//   29   57:invokevirtual   #100 <Method void android.os.PowerManager$WakeLock.acquire(long)>
		}
		this;
	//   30   60:aload_0         
		JVM INSTR monitorexit ;
	//   31   61:monitorexit     
		return;
	//   32   62:return          
		intent;
	//   33   63:astore_1        
		this;
	//   34   64:aload_0         
		JVM INSTR monitorexit ;
	//   35   65:monitorexit     
		throw intent;
	//   36   66:aload_1         
	//   37   67:athrow          
	//   38   68:return          
	}

	public void serviceProcessingFinished()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(mServiceProcessing)
	//*   2    2:aload_0         
	//*   3    3:getfield        #94  <Field boolean mServiceProcessing>
	//*   4    6:ifeq            38
		{
			if(mLaunchingService)
	//*   5    9:aload_0         
	//*   6   10:getfield        #92  <Field boolean mLaunchingService>
	//*   7   13:ifeq            26
				mLaunchWakeLock.acquire(60000L);
	//    8   16:aload_0         
	//    9   17:getfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
	//   10   20:ldc2w           #95  <Long 60000L>
	//   11   23:invokevirtual   #100 <Method void android.os.PowerManager$WakeLock.acquire(long)>
			mServiceProcessing = false;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #94  <Field boolean mServiceProcessing>
			mRunWakeLock.release();
	//   15   31:aload_0         
	//   16   32:getfield        #71  <Field android.os.PowerManager$WakeLock mRunWakeLock>
	//   17   35:invokevirtual   #104 <Method void android.os.PowerManager$WakeLock.release()>
		}
		this;
	//   18   38:aload_0         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		return;
	//   20   40:return          
		Exception exception;
		exception;
	//   21   41:astore_1        
		this;
	//   22   42:aload_0         
		JVM INSTR monitorexit ;
	//   23   43:monitorexit     
		throw exception;
	//   24   44:aload_1         
	//   25   45:athrow          
	}

	public void serviceProcessingStarted()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!mServiceProcessing)
	//*   2    2:aload_0         
	//*   3    3:getfield        #94  <Field boolean mServiceProcessing>
	//*   4    6:ifne            31
		{
			mServiceProcessing = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #94  <Field boolean mServiceProcessing>
			mRunWakeLock.acquire(0x927c0L);
	//    8   14:aload_0         
	//    9   15:getfield        #71  <Field android.os.PowerManager$WakeLock mRunWakeLock>
	//   10   18:ldc2w           #106 <Long 0x927c0L>
	//   11   21:invokevirtual   #100 <Method void android.os.PowerManager$WakeLock.acquire(long)>
			mLaunchWakeLock.release();
	//   12   24:aload_0         
	//   13   25:getfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
	//   14   28:invokevirtual   #104 <Method void android.os.PowerManager$WakeLock.release()>
		}
		this;
	//   15   31:aload_0         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		return;
	//   17   33:return          
		Exception exception;
		exception;
	//   18   34:astore_1        
		this;
	//   19   35:aload_0         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		throw exception;
	//   21   37:aload_1         
	//   22   38:athrow          
	}

	public void serviceStartReceived()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		mLaunchingService = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #92  <Field boolean mLaunchingService>
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return;
	//    7    9:return          
		Exception exception;
		exception;
	//    8   10:astore_1        
		this;
	//    9   11:aload_0         
		JVM INSTR monitorexit ;
	//   10   12:monitorexit     
		throw exception;
	//   11   13:aload_1         
	//   12   14:athrow          
	}

	private final Context mContext;
	private final android.os.PowerManager.WakeLock mLaunchWakeLock;
	boolean mLaunchingService;
	private final android.os.PowerManager.WakeLock mRunWakeLock;
	boolean mServiceProcessing;

	JobIntentService$CompatWorkEnqueuer(Context context, ComponentName componentname)
	{
		super(context, componentname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void JobIntentService$WorkEnqueuer(Context, ComponentName)>
		mContext = context.getApplicationContext();
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #25  <Method Context Context.getApplicationContext()>
	//    7   11:putfield        #27  <Field Context mContext>
		context = ((Context) ((PowerManager)context.getSystemService("power")));
	//    8   14:aload_1         
	//    9   15:ldc1            #29  <String "power">
	//   10   17:invokevirtual   #33  <Method Object Context.getSystemService(String)>
	//   11   20:checkcast       #35  <Class PowerManager>
	//   12   23:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   13   24:new             #37  <Class StringBuilder>
	//   14   27:dup             
	//   15   28:invokespecial   #40  <Method void StringBuilder()>
	//   16   31:astore_3        
		stringbuilder.append(componentname.getClassName());
	//   17   32:aload_3         
	//   18   33:aload_2         
	//   19   34:invokevirtual   #46  <Method String ComponentName.getClassName()>
	//   20   37:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(":launch");
	//   22   41:aload_3         
	//   23   42:ldc1            #52  <String ":launch">
	//   24   44:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
		mLaunchWakeLock = ((PowerManager) (context)).newWakeLock(1, stringbuilder.toString());
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:iconst_1        
	//   29   51:aload_3         
	//   30   52:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   31   55:invokevirtual   #59  <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   32   58:putfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
		mLaunchWakeLock.setReferenceCounted(false);
	//   33   61:aload_0         
	//   34   62:getfield        #61  <Field android.os.PowerManager$WakeLock mLaunchWakeLock>
	//   35   65:iconst_0        
	//   36   66:invokevirtual   #67  <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
		stringbuilder = new StringBuilder();
	//   37   69:new             #37  <Class StringBuilder>
	//   38   72:dup             
	//   39   73:invokespecial   #40  <Method void StringBuilder()>
	//   40   76:astore_3        
		stringbuilder.append(componentname.getClassName());
	//   41   77:aload_3         
	//   42   78:aload_2         
	//   43   79:invokevirtual   #46  <Method String ComponentName.getClassName()>
	//   44   82:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   45   85:pop             
		stringbuilder.append(":run");
	//   46   86:aload_3         
	//   47   87:ldc1            #69  <String ":run">
	//   48   89:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   49   92:pop             
		mRunWakeLock = ((PowerManager) (context)).newWakeLock(1, stringbuilder.toString());
	//   50   93:aload_0         
	//   51   94:aload_1         
	//   52   95:iconst_1        
	//   53   96:aload_3         
	//   54   97:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   55  100:invokevirtual   #59  <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   56  103:putfield        #71  <Field android.os.PowerManager$WakeLock mRunWakeLock>
		mRunWakeLock.setReferenceCounted(false);
	//   57  106:aload_0         
	//   58  107:getfield        #71  <Field android.os.PowerManager$WakeLock mRunWakeLock>
	//   59  110:iconst_0        
	//   60  111:invokevirtual   #67  <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
	//   61  114:return          
	}
}
