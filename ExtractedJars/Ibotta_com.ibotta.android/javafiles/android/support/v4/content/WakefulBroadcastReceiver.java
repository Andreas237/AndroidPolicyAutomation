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
	//    1    1:ldc1            #9   <String "android.support.content.wakelockid">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #35  <Method int Intent.getIntExtra(String, int)>
	//    4    7:istore_1        
		if(i == 0)
	//*   5    8:iload_1         
	//*   6    9:ifne            14
			return false;
	//    7   12:iconst_0        
	//    8   13:ireturn         
		intent = ((Intent) (sActiveWakeLocks));
	//    9   14:getstatic       #23  <Field SparseArray sActiveWakeLocks>
	//   10   17:astore_0        
		intent;
	//   11   18:aload_0         
		JVM INSTR monitorenter ;
	//   12   19:monitorenter    
		android.os.PowerManager.WakeLock wakelock = (android.os.PowerManager.WakeLock)sActiveWakeLocks.get(i);
	//   13   20:getstatic       #23  <Field SparseArray sActiveWakeLocks>
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
		sActiveWakeLocks.remove(i);
	//   22   39:getstatic       #23  <Field SparseArray sActiveWakeLocks>
	//   23   42:iload_1         
	//   24   43:invokevirtual   #48  <Method void SparseArray.remove(int)>
		intent;
	//   25   46:aload_0         
		JVM INSTR monitorexit ;
	//   26   47:monitorexit     
		return true;
	//   27   48:iconst_1        
	//   28   49:ireturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   29   50:new             #50  <Class StringBuilder>
	//   30   53:dup             
	//   31   54:invokespecial   #51  <Method void StringBuilder()>
	//   32   57:astore_2        
		stringbuilder.append("No active wake lock id #");
	//   33   58:aload_2         
	//   34   59:ldc1            #53  <String "No active wake lock id #">
	//   35   61:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   36   64:pop             
		stringbuilder.append(i);
	//   37   65:aload_2         
	//   38   66:iload_1         
	//   39   67:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   40   70:pop             
		Log.w("WakefulBroadcastReceiv.", stringbuilder.toString());
	//   41   71:ldc1            #62  <String "WakefulBroadcastReceiv.">
	//   42   73:aload_2         
	//   43   74:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   44   77:invokestatic    #72  <Method int Log.w(String, String)>
	//   45   80:pop             
		intent;
	//   46   81:aload_0         
		JVM INSTR monitorexit ;
	//   47   82:monitorexit     
		return true;
	//   48   83:iconst_1        
	//   49   84:ireturn         
		Exception exception;
		exception;
	//   50   85:astore_2        
		intent;
	//   51   86:aload_0         
		JVM INSTR monitorexit ;
	//   52   87:monitorexit     
		throw exception;
	//   53   88:aload_2         
	//   54   89:athrow          
	}

	public static ComponentName startWakefulService(Context context, Intent intent)
	{
		SparseArray sparsearray = sActiveWakeLocks;
	//    0    0:getstatic       #23  <Field SparseArray sActiveWakeLocks>
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
	//   15   29:ldc1            #9   <String "android.support.content.wakelockid">
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
		context = ((Context) ((PowerManager)context.getSystemService("power")));
	//   29   50:aload_0         
	//   30   51:ldc1            #86  <String "power">
	//   31   53:invokevirtual   #90  <Method Object Context.getSystemService(String)>
	//   32   56:checkcast       #92  <Class PowerManager>
	//   33   59:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//   34   60:new             #50  <Class StringBuilder>
	//   35   63:dup             
	//   36   64:invokespecial   #51  <Method void StringBuilder()>
	//   37   67:astore          4
		stringbuilder.append("androidx.core:wake:");
	//   38   69:aload           4
	//   39   71:ldc1            #94  <String "androidx.core:wake:">
	//   40   73:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   41   76:pop             
		stringbuilder.append(((ComponentName) (intent)).flattenToShortString());
	//   42   77:aload           4
	//   43   79:aload_1         
	//   44   80:invokevirtual   #99  <Method String ComponentName.flattenToShortString()>
	//   45   83:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   46   86:pop             
		context = ((Context) (((PowerManager) (context)).newWakeLock(1, stringbuilder.toString())));
	//   47   87:aload_0         
	//   48   88:iconst_1        
	//   49   89:aload           4
	//   50   91:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   51   94:invokevirtual   #103 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   52   97:astore_0        
		((android.os.PowerManager.WakeLock) (context)).setReferenceCounted(false);
	//   53   98:aload_0         
	//   54   99:iconst_0        
	//   55  100:invokevirtual   #107 <Method void android.os.PowerManager$WakeLock.setReferenceCounted(boolean)>
		((android.os.PowerManager.WakeLock) (context)).acquire(60000L);
	//   56  103:aload_0         
	//   57  104:ldc2w           #108 <Long 60000L>
	//   58  107:invokevirtual   #113 <Method void android.os.PowerManager$WakeLock.acquire(long)>
		sActiveWakeLocks.put(i, ((Object) (context)));
	//   59  110:getstatic       #23  <Field SparseArray sActiveWakeLocks>
	//   60  113:iload_2         
	//   61  114:aload_0         
	//   62  115:invokevirtual   #117 <Method void SparseArray.put(int, Object)>
		sparsearray;
	//   63  118:aload_3         
		JVM INSTR monitorexit ;
	//   64  119:monitorexit     
		return ((ComponentName) (intent));
	//   65  120:aload_1         
	//   66  121:areturn         
		context;
	//   67  122:astore_0        
		sparsearray;
	//   68  123:aload_3         
		JVM INSTR monitorexit ;
	//   69  124:monitorexit     
		throw context;
	//   70  125:aload_0         
	//   71  126:athrow          
	}

	private static final String EXTRA_WAKE_LOCK_ID = "android.support.content.wakelockid";
	private static int mNextId = 1;
	private static final SparseArray sActiveWakeLocks = new SparseArray();

	static 
	{
	//    0    0:new             #18  <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void SparseArray()>
	//    3    7:putstatic       #23  <Field SparseArray sActiveWakeLocks>
	//    4   10:iconst_1        
	//    5   11:putstatic       #25  <Field int mNextId>
	//*   6   14:return          
	}
}
