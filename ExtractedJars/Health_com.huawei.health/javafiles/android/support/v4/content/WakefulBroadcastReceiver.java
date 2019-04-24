// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.*;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

public abstract class WakefulBroadcastReceiver extends BroadcastReceiver
{

	public WakefulBroadcastReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	public static boolean completeWakefulIntent(Intent intent)
	{
		int i;
		i = intent.getIntExtra("android.support.content.wakelockid", 0);
	//    0    0:aload_0         
	//    1    1:ldc1            #8   <String "android.support.content.wakelockid">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #35  <Method int Intent.getIntExtra(String, int)>
	//    4    7:istore_1        
		if(i == 0)
	//*   5    8:iload_1         
	//*   6    9:ifne            14
			return false;
	//    7   12:iconst_0        
	//    8   13:ireturn         
		intent = ((Intent) (mActiveWakeLocks));
	//    9   14:getstatic       #23  <Field SparseArray mActiveWakeLocks>
	//   10   17:astore_0        
		intent;
	//   11   18:aload_0         
		JVM INSTR monitorenter ;
	//   12   19:monitorenter    
		android.os.PowerManager.WakeLock wakelock = (android.os.PowerManager.WakeLock)mActiveWakeLocks.get(i);
	//   13   20:getstatic       #23  <Field SparseArray mActiveWakeLocks>
	//   14   23:iload_1         
	//   15   24:invokevirtual   #39  <Method Object SparseArray.get(int)>
	//   16   27:checkcast       #41  <Class android.os.PowerManager$WakeLock>
	//   17   30:astore_2        
		if(wakelock == null)
			break MISSING_BLOCK_LABEL_50;
	//   18   31:aload_2         
	//   19   32:ifnull          50
		wakelock.release();
	//   20   35:aload_2         
	//   21   36:invokevirtual   #44  <Method void android.os.PowerManager$WakeLock.release()>
		mActiveWakeLocks.remove(i);
	//   22   39:getstatic       #23  <Field SparseArray mActiveWakeLocks>
	//   23   42:iload_1         
	//   24   43:invokevirtual   #48  <Method void SparseArray.remove(int)>
		intent;
	//   25   46:aload_0         
		JVM INSTR monitorexit ;
	//   26   47:monitorexit     
		return true;
	//   27   48:iconst_1        
	//   28   49:ireturn         
		Log.w("WakefulBroadcastReceiver", (new StringBuilder()).append("No active wake lock id #").append(i).toString());
	//   29   50:ldc1            #50  <String "WakefulBroadcastReceiver">
	//   30   52:new             #52  <Class StringBuilder>
	//   31   55:dup             
	//   32   56:invokespecial   #53  <Method void StringBuilder()>
	//   33   59:ldc1            #55  <String "No active wake lock id #">
	//   34   61:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:iload_1         
	//   36   65:invokevirtual   #62  <Method StringBuilder StringBuilder.append(int)>
	//   37   68:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   38   71:invokestatic    #72  <Method int Log.w(String, String)>
	//   39   74:pop             
		intent;
	//   40   75:aload_0         
		JVM INSTR monitorexit ;
	//   41   76:monitorexit     
		return true;
	//   42   77:iconst_1        
	//   43   78:ireturn         
		Exception exception;
		exception;
	//   44   79:astore_2        
	//*  45   80:aload_0         
		throw exception;
	//   46   81:monitorexit     
	//   47   82:aload_2         
	//   48   83:athrow          
	}

	public static ComponentName startWakefulService(Context context, Intent intent)
	{
		SparseArray sparsearray = mActiveWakeLocks;
	//    0    0:getstatic       #23  <Field SparseArray mActiveWakeLocks>
	//    1    3:astore_3        
		sparsearray;
	//    2    4:aload_3         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		int i;
		i = mNextId;
	//    4    6:getstatic       #25  <Field int mNextId>
	//    5    9:istore_2        
		mNextId++;
	//    6   10:getstatic       #25  <Field int mNextId>
	//    7   13:iconst_1        
	//    8   14:iadd            
	//    9   15:putstatic       #25  <Field int mNextId>
		if(mNextId <= 0)
	//*  10   18:getstatic       #25  <Field int mNextId>
	//*  11   21:ifgt            28
			mNextId = 1;
	//   12   24:iconst_1        
	//   13   25:putstatic       #25  <Field int mNextId>
		intent.putExtra("android.support.content.wakelockid", i);
	//   14   28:aload_1         
	//   15   29:ldc1            #8   <String "android.support.content.wakelockid">
	//   16   31:iload_2         
	//   17   32:invokevirtual   #78  <Method Intent Intent.putExtra(String, int)>
	//   18   35:pop             
		intent = ((Intent) (context.startService(intent)));
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:invokevirtual   #84  <Method ComponentName Context.startService(Intent)>
	//   22   41:astore_1        
		if(intent != null)
			break MISSING_BLOCK_LABEL_50;
	//   23   42:aload_1         
	//   24   43:ifnonnull       50
		sparsearray;
	//   25   46:aload_3         
		JVM INSTR monitorexit ;
	//   26   47:monitorexit     
		return null;
	//   27   48:aconst_null     
	//   28   49:areturn         
		context = ((Context) (((PowerManager)context.getSystemService("power")).newWakeLock(1, (new StringBuilder()).append("wake:").append(((ComponentName) (intent)).flattenToShortString()).toString())));
	//   29   50:aload_0         
	//   30   51:ldc1            #86  <String "power">
	//   31   53:invokevirtual   #90  <Method Object Context.getSystemService(String)>
	//   32   56:checkcast       #92  <Class PowerManager>
	//   33   59:iconst_1        
	//   34   60:new             #52  <Class StringBuilder>
	//   35   63:dup             
	//   36   64:invokespecial   #53  <Method void StringBuilder()>
	//   37   67:ldc1            #94  <String "wake:">
	//   38   69:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   39   72:aload_1         
	//   40   73:invokevirtual   #99  <Method String ComponentName.flattenToShortString()>
	//   41   76:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   42   79:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   43   82:invokevirtual   #103 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   44   85:astore_0        
		((android.os.PowerManager.WakeLock) (context)).setReferenceCounted(false);
	//   45   86:aload_0         
	//   46   87:iconst_0        
	//   47   88:invokevirtual   #107 <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
		((android.os.PowerManager.WakeLock) (context)).acquire(60000L);
	//   48   91:aload_0         
	//   49   92:ldc2w           #108 <Long 60000L>
	//   50   95:invokevirtual   #113 <Method void android.os.PowerManager$WakeLock.acquire(long)>
		mActiveWakeLocks.put(i, ((Object) (context)));
	//   51   98:getstatic       #23  <Field SparseArray mActiveWakeLocks>
	//   52  101:iload_2         
	//   53  102:aload_0         
	//   54  103:invokevirtual   #117 <Method void SparseArray.put(int, Object)>
		sparsearray;
	//   55  106:aload_3         
		JVM INSTR monitorexit ;
	//   56  107:monitorexit     
		return ((ComponentName) (intent));
	//   57  108:aload_1         
	//   58  109:areturn         
		context;
	//   59  110:astore_0        
	//*  60  111:aload_3         
		throw context;
	//   61  112:monitorexit     
	//   62  113:aload_0         
	//   63  114:athrow          
	}

	private static final String EXTRA_WAKE_LOCK_ID = "android.support.content.wakelockid";
	private static final SparseArray mActiveWakeLocks = new SparseArray();
	private static int mNextId = 0;

	static 
	{
	//    0    0:new             #18  <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void SparseArray()>
	//    3    7:putstatic       #23  <Field SparseArray mActiveWakeLocks>
		mNextId = 1;
	//    4   10:iconst_1        
	//    5   11:putstatic       #25  <Field int mNextId>
	//*   6   14:return          
	}
}
