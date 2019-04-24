// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.support.v4.util.LruCache;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions, zze

public class ExpirableLruCache
{

	public ExpirableLruCache(int i, long l, long l1, TimeUnit timeunit)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void Object()>
	//    6   12:putfield        #29  <Field Object mLock>
		zzso = TimeUnit.NANOSECONDS.convert(l, timeunit);
	//    7   15:aload_0         
	//    8   16:getstatic       #35  <Field TimeUnit TimeUnit.NANOSECONDS>
	//    9   19:lload_2         
	//   10   20:aload           6
	//   11   22:invokevirtual   #39  <Method long TimeUnit.convert(long, TimeUnit)>
	//   12   25:putfield        #41  <Field long zzso>
		zzsp = TimeUnit.NANOSECONDS.convert(l1, timeunit);
	//   13   28:aload_0         
	//   14   29:getstatic       #35  <Field TimeUnit TimeUnit.NANOSECONDS>
	//   15   32:lload           4
	//   16   34:aload           6
	//   17   36:invokevirtual   #39  <Method long TimeUnit.convert(long, TimeUnit)>
	//   18   39:putfield        #43  <Field long zzsp>
		boolean flag;
		if(!zzct() && !zzcu())
	//*  19   42:aload_0         
	//*  20   43:invokespecial   #47  <Method boolean zzct()>
	//*  21   46:ifne            65
	//*  22   49:aload_0         
	//*  23   50:invokespecial   #50  <Method boolean zzcu()>
	//*  24   53:ifeq            59
	//*  25   56:goto            65
			flag = false;
	//   26   59:iconst_0        
	//   27   60:istore          7
		else
	//*  28   62:goto            68
			flag = true;
	//   29   65:iconst_1        
	//   30   66:istore          7
		Preconditions.checkArgument(flag, "ExpirableLruCache has both access and write expiration negative");
	//   31   68:iload           7
	//   32   70:ldc1            #52  <String "ExpirableLruCache has both access and write expiration negative">
	//   33   72:invokestatic    #58  <Method void Preconditions.checkArgument(boolean, Object)>
		zzsn = ((LruCache) (new zze(this, i)));
	//   34   75:aload_0         
	//   35   76:new             #60  <Class zze>
	//   36   79:dup             
	//   37   80:aload_0         
	//   38   81:iload_1         
	//   39   82:invokespecial   #63  <Method void zze(ExpirableLruCache, int)>
	//   40   85:putfield        #65  <Field LruCache zzsn>
		if(zzct())
	//*  41   88:aload_0         
	//*  42   89:invokespecial   #47  <Method boolean zzct()>
	//*  43   92:ifeq            106
			zzsq = new HashMap();
	//   44   95:aload_0         
	//   45   96:new             #67  <Class HashMap>
	//   46   99:dup             
	//   47  100:invokespecial   #68  <Method void HashMap()>
	//   48  103:putfield        #70  <Field HashMap zzsq>
		if(zzcu())
	//*  49  106:aload_0         
	//*  50  107:invokespecial   #50  <Method boolean zzcu()>
	//*  51  110:ifeq            124
			zzsr = new HashMap();
	//   52  113:aload_0         
	//   53  114:new             #67  <Class HashMap>
	//   54  117:dup             
	//   55  118:invokespecial   #68  <Method void HashMap()>
	//   56  121:putfield        #72  <Field HashMap zzsr>
	//   57  124:return          
	}

	static Object zza(ExpirableLruCache expirablelrucache)
	{
		return expirablelrucache.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mLock>
	//    2    4:areturn         
	}

	private final boolean zza(Object obj)
	{
		long l = System.nanoTime();
	//    0    0:invokestatic    #81  <Method long System.nanoTime()>
	//    1    3:lstore_2        
		if(zzct() && zzsq.containsKey(obj) && l - ((Long)zzsq.get(obj)).longValue() > zzso)
	//*   2    4:aload_0         
	//*   3    5:invokespecial   #47  <Method boolean zzct()>
	//*   4    8:ifeq            48
	//*   5   11:aload_0         
	//*   6   12:getfield        #70  <Field HashMap zzsq>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #84  <Method boolean HashMap.containsKey(Object)>
	//*   9   19:ifeq            48
	//*  10   22:lload_2         
	//*  11   23:aload_0         
	//*  12   24:getfield        #70  <Field HashMap zzsq>
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #88  <Method Object HashMap.get(Object)>
	//*  15   31:checkcast       #90  <Class Long>
	//*  16   34:invokevirtual   #93  <Method long Long.longValue()>
	//*  17   37:lsub            
	//*  18   38:aload_0         
	//*  19   39:getfield        #41  <Field long zzso>
	//*  20   42:lcmp            
	//*  21   43:ifle            48
			return true;
	//   22   46:iconst_1        
	//   23   47:ireturn         
		return zzcu() && zzsr.containsKey(obj) && l - ((Long)zzsr.get(obj)).longValue() > zzsp;
	//   24   48:aload_0         
	//   25   49:invokespecial   #50  <Method boolean zzcu()>
	//   26   52:ifeq            92
	//   27   55:aload_0         
	//   28   56:getfield        #72  <Field HashMap zzsr>
	//   29   59:aload_1         
	//   30   60:invokevirtual   #84  <Method boolean HashMap.containsKey(Object)>
	//   31   63:ifeq            92
	//   32   66:lload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #72  <Field HashMap zzsr>
	//   35   71:aload_1         
	//   36   72:invokevirtual   #88  <Method Object HashMap.get(Object)>
	//   37   75:checkcast       #90  <Class Long>
	//   38   78:invokevirtual   #93  <Method long Long.longValue()>
	//   39   81:lsub            
	//   40   82:aload_0         
	//   41   83:getfield        #43  <Field long zzsp>
	//   42   86:lcmp            
	//   43   87:ifle            92
	//   44   90:iconst_1        
	//   45   91:ireturn         
	//   46   92:iconst_0        
	//   47   93:ireturn         
	}

	static boolean zzb(ExpirableLruCache expirablelrucache)
	{
		return expirablelrucache.zzct();
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method boolean zzct()>
	//    2    4:ireturn         
	}

	static HashMap zzc(ExpirableLruCache expirablelrucache)
	{
		return expirablelrucache.zzsq;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field HashMap zzsq>
	//    2    4:areturn         
	}

	private final boolean zzct()
	{
		return zzso >= 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field long zzso>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:iflt            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	private final boolean zzcu()
	{
		return zzsp >= 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long zzsp>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:iflt            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	static boolean zzd(ExpirableLruCache expirablelrucache)
	{
		return expirablelrucache.zzcu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method boolean zzcu()>
	//    2    4:ireturn         
	}

	static HashMap zze(ExpirableLruCache expirablelrucache)
	{
		return expirablelrucache.zzsr;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field HashMap zzsr>
	//    2    4:areturn         
	}

	protected Object create(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
	{
	//    0    0:return          
	}

	public void evictAll()
	{
		zzsn.evictAll();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LruCache zzsn>
	//    2    4:invokevirtual   #111 <Method void LruCache.evictAll()>
	//    3    7:return          
	}

	public Object get(Object obj)
	{
		Object obj1 = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object mLock>
	//    2    4:astore          4
		obj1;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Object obj2;
		if(zza(obj))
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokespecial   #113 <Method boolean zza(Object)>
	//*   8   14:ifeq            26
			zzsn.remove(obj);
	//    9   17:aload_0         
	//   10   18:getfield        #65  <Field LruCache zzsn>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #116 <Method Object LruCache.remove(Object)>
	//   13   25:pop             
		obj2 = zzsn.get(obj);
	//   14   26:aload_0         
	//   15   27:getfield        #65  <Field LruCache zzsn>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #117 <Method Object LruCache.get(Object)>
	//   18   34:astore          5
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_67;
	//   19   36:aload           5
	//   20   38:ifnull          67
		if(zzso > 0L)
	//*  21   41:aload_0         
	//*  22   42:getfield        #41  <Field long zzso>
	//*  23   45:lconst_0        
	//*  24   46:lcmp            
	//*  25   47:ifle            67
		{
			long l = System.nanoTime();
	//   26   50:invokestatic    #81  <Method long System.nanoTime()>
	//   27   53:lstore_2        
			zzsq.put(obj, ((Object) (Long.valueOf(l))));
	//   28   54:aload_0         
	//   29   55:getfield        #70  <Field HashMap zzsq>
	//   30   58:aload_1         
	//   31   59:lload_2         
	//   32   60:invokestatic    #121 <Method Long Long.valueOf(long)>
	//   33   63:invokevirtual   #125 <Method Object HashMap.put(Object, Object)>
	//   34   66:pop             
		}
		obj1;
	//   35   67:aload           4
		JVM INSTR monitorexit ;
	//   36   69:monitorexit     
		return obj2;
	//   37   70:aload           5
	//   38   72:areturn         
		obj;
	//   39   73:astore_1        
		obj1;
	//   40   74:aload           4
		JVM INSTR monitorexit ;
	//   41   76:monitorexit     
		throw obj;
	//   42   77:aload_1         
	//   43   78:athrow          
	}

	public Object put(Object obj, Object obj1)
	{
		if(zzcu())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #50  <Method boolean zzcu()>
	//*   2    4:ifeq            45
		{
			long l = System.nanoTime();
	//    3    7:invokestatic    #81  <Method long System.nanoTime()>
	//    4   10:lstore_3        
			synchronized(mLock)
	//*   5   11:aload_0         
	//*   6   12:getfield        #29  <Field Object mLock>
	//*   7   15:astore          5
	//*   8   17:aload           5
	//*   9   19:monitorenter    
			{
				zzsr.put(obj, ((Object) (Long.valueOf(l))));
	//   10   20:aload_0         
	//   11   21:getfield        #72  <Field HashMap zzsr>
	//   12   24:aload_1         
	//   13   25:lload_3         
	//   14   26:invokestatic    #121 <Method Long Long.valueOf(long)>
	//   15   29:invokevirtual   #125 <Method Object HashMap.put(Object, Object)>
	//   16   32:pop             
			}
	//   17   33:aload           5
	//   18   35:monitorexit     
		}
		break MISSING_BLOCK_LABEL_45;
	//   19   36:goto            45
		obj;
	//   20   39:astore_1        
		obj2;
	//   21   40:aload           5
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		throw obj;
	//   23   43:aload_1         
	//   24   44:athrow          
		return zzsn.put(obj, obj1);
	//   25   45:aload_0         
	//   26   46:getfield        #65  <Field LruCache zzsn>
	//   27   49:aload_1         
	//   28   50:aload_2         
	//   29   51:invokevirtual   #126 <Method Object LruCache.put(Object, Object)>
	//   30   54:areturn         
	}

	public Object remove(Object obj)
	{
		return zzsn.remove(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field LruCache zzsn>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #116 <Method Object LruCache.remove(Object)>
	//    4    8:areturn         
	}

	public void removeExpired()
	{
		for(Iterator iterator = zzsn.snapshot().keySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field LruCache zzsn>
	//*   2    4:invokevirtual   #132 <Method Map LruCache.snapshot()>
	//*   3    7:invokeinterface #138 <Method Set Map.keySet()>
	//*   4   12:invokeinterface #144 <Method Iterator Set.iterator()>
	//*   5   17:astore_2        
	//*   6   18:aload_2         
	//*   7   19:invokeinterface #149 <Method boolean Iterator.hasNext()>
	//*   8   24:ifeq            68
		{
			Object obj1 = iterator.next();
	//    9   27:aload_2         
	//   10   28:invokeinterface #153 <Method Object Iterator.next()>
	//   11   33:astore_3        
			synchronized(mLock)
	//*  12   34:aload_0         
	//*  13   35:getfield        #29  <Field Object mLock>
	//*  14   38:astore_1        
	//*  15   39:aload_1         
	//*  16   40:monitorenter    
			{
				if(zza(obj1))
	//*  17   41:aload_0         
	//*  18   42:aload_3         
	//*  19   43:invokespecial   #113 <Method boolean zza(Object)>
	//*  20   46:ifeq            58
					zzsn.remove(obj1);
	//   21   49:aload_0         
	//   22   50:getfield        #65  <Field LruCache zzsn>
	//   23   53:aload_3         
	//   24   54:invokevirtual   #116 <Method Object LruCache.remove(Object)>
	//   25   57:pop             
			}
	//   26   58:aload_1         
	//   27   59:monitorexit     
		}

		break MISSING_BLOCK_LABEL_68;
	//   28   60:goto            18
		exception;
	//   29   63:astore_2        
		obj;
	//   30   64:aload_1         
		JVM INSTR monitorexit ;
	//   31   65:monitorexit     
		throw exception;
	//   32   66:aload_2         
	//   33   67:athrow          
	//   34   68:return          
	}

	protected int sizeOf(Object obj, Object obj1)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Map snapshot()
	{
		removeExpired();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #158 <Method void removeExpired()>
		return zzsn.snapshot();
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field LruCache zzsn>
	//    4    8:invokevirtual   #132 <Method Map LruCache.snapshot()>
	//    5   11:areturn         
	}

	public static int TIME_UNSET = -1;
	private final Object mLock = new Object();
	private final LruCache zzsn;
	private final long zzso;
	private final long zzsp;
	private HashMap zzsq;
	private HashMap zzsr;

	static 
	{
	//    0    0:return          
	}
}
