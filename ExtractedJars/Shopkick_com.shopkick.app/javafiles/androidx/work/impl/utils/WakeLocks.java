// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.Logger;
import java.util.*;

public class WakeLocks
{

	private WakeLocks()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public static void checkWakeLocks()
	{
		WeakHashMap weakhashmap = sWakeLocks;
	//    0    0:getstatic       #32  <Field WeakHashMap sWakeLocks>
	//    1    3:astore_0        
		weakhashmap;
	//    2    4:aload_0         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		Iterator iterator = sWakeLocks.keySet().iterator();
	//    4    6:getstatic       #32  <Field WeakHashMap sWakeLocks>
	//    5    9:invokevirtual   #39  <Method Set WeakHashMap.keySet()>
	//    6   12:invokeinterface #45  <Method Iterator Set.iterator()>
	//    7   17:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_1         
	//    9   19:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            81
			Object obj = ((Object) ((android.os.PowerManager.WakeLock)iterator.next()));
	//   11   27:aload_1         
	//   12   28:invokeinterface #55  <Method Object Iterator.next()>
	//   13   33:checkcast       #57  <Class android.os.PowerManager$WakeLock>
	//   14   36:astore_2        
			if(((android.os.PowerManager.WakeLock) (obj)).isHeld())
	//*  15   37:aload_2         
	//*  16   38:invokevirtual   #60  <Method boolean android.os.PowerManager$WakeLock.isHeld()>
	//*  17   41:ifeq            18
			{
				obj = ((Object) (String.format("WakeLock held for %s", new Object[] {
					sWakeLocks.get(obj)
				})));
	//   18   44:ldc1            #62  <String "WakeLock held for %s">
	//   19   46:iconst_1        
	//   20   47:anewarray       Object[]
	//   21   50:dup             
	//   22   51:iconst_0        
	//   23   52:getstatic       #32  <Field WeakHashMap sWakeLocks>
	//   24   55:aload_2         
	//   25   56:invokevirtual   #66  <Method Object WeakHashMap.get(Object)>
	//   26   59:aastore         
	//   27   60:invokestatic    #72  <Method String String.format(String, Object[])>
	//   28   63:astore_2        
				Logger.get().warning(TAG, ((String) (obj)), new Throwable[0]);
	//   29   64:invokestatic    #75  <Method Logger Logger.get()>
	//   30   67:getstatic       #25  <Field String TAG>
	//   31   70:aload_2         
	//   32   71:iconst_0        
	//   33   72:anewarray       Throwable[]
	//   34   75:invokevirtual   #81  <Method void Logger.warning(String, String, Throwable[])>
			}
		} while(true);
	//   35   78:goto            18
		weakhashmap;
	//   36   81:aload_0         
		JVM INSTR monitorexit ;
	//   37   82:monitorexit     
		return;
	//   38   83:return          
		Exception exception;
		exception;
	//   39   84:astore_1        
		weakhashmap;
	//   40   85:aload_0         
		JVM INSTR monitorexit ;
	//   41   86:monitorexit     
		throw exception;
	//   42   87:aload_1         
	//   43   88:athrow          
	}

	public static android.os.PowerManager.WakeLock newWakeLock(Context context, String s)
	{
		context = ((Context) ((PowerManager)context.getApplicationContext().getSystemService("power")));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method Context Context.getApplicationContext()>
	//    2    4:ldc1            #92  <String "power">
	//    3    6:invokevirtual   #96  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #98  <Class PowerManager>
	//    5   12:astore_0        
		Object obj = ((Object) (new StringBuilder()));
	//    6   13:new             #100 <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #101 <Method void StringBuilder()>
	//    9   20:astore_2        
		((StringBuilder) (obj)).append("WorkManager: ");
	//   10   21:aload_2         
	//   11   22:ldc1            #103 <String "WorkManager: ">
	//   12   24:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		((StringBuilder) (obj)).append(s);
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #107 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		s = ((StringBuilder) (obj)).toString();
	//   18   34:aload_2         
	//   19   35:invokevirtual   #111 <Method String StringBuilder.toString()>
	//   20   38:astore_1        
		obj = ((Object) (((PowerManager) (context)).newWakeLock(1, s)));
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:aload_1         
	//   24   42:invokevirtual   #114 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   25   45:astore_2        
		synchronized(sWakeLocks)
	//*  26   46:getstatic       #32  <Field WeakHashMap sWakeLocks>
	//*  27   49:astore_0        
	//*  28   50:aload_0         
	//*  29   51:monitorenter    
		{
			sWakeLocks.put(obj, ((Object) (s)));
	//   30   52:getstatic       #32  <Field WeakHashMap sWakeLocks>
	//   31   55:aload_2         
	//   32   56:aload_1         
	//   33   57:invokevirtual   #118 <Method Object WeakHashMap.put(Object, Object)>
	//   34   60:pop             
		}
	//   35   61:aload_0         
	//   36   62:monitorexit     
		return ((android.os.PowerManager.WakeLock) (obj));
	//   37   63:aload_2         
	//   38   64:areturn         
		s;
	//   39   65:astore_1        
		context;
	//   40   66:aload_0         
		JVM INSTR monitorexit ;
	//   41   67:monitorexit     
		throw s;
	//   42   68:aload_1         
	//   43   69:athrow          
	}

	private static final String TAG = Logger.tagWithPrefix("WakeLocks");
	private static final WeakHashMap sWakeLocks = new WeakHashMap();

	static 
	{
	//    0    0:ldc1            #17  <String "WakeLocks">
	//    1    2:invokestatic    #23  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #25  <Field String TAG>
	//    3    8:new             #27  <Class WeakHashMap>
	//    4   11:dup             
	//    5   12:invokespecial   #30  <Method void WeakHashMap()>
	//    6   15:putstatic       #32  <Field WeakHashMap sWakeLocks>
	//*   7   18:return          
	}
}
