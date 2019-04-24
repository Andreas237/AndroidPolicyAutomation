// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.cache;


// Referenced classes of package com.raizlabs.android.dbflow.structure.cache:
//			ModelCache, LruCache

public class ModelLruCache extends ModelCache
{

	protected ModelLruCache(int i)
	{
		super(((Object) (new LruCache(i))));
	//    0    0:aload_0         
	//    1    1:new             #9   <Class LruCache>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #11  <Method void LruCache(int)>
	//    5    9:invokespecial   #14  <Method void ModelCache(Object)>
	//    6   12:return          
	}

	public static ModelLruCache newInstance(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i <= 0)
	//*   2    2:iload_0         
	//*   3    3:ifgt            9
			j = 25;
	//    4    6:bipush          25
	//    5    8:istore_1        
		return new ModelLruCache(j);
	//    6    9:new             #2   <Class ModelLruCache>
	//    7   12:dup             
	//    8   13:iload_1         
	//    9   14:invokespecial   #18  <Method void ModelLruCache(int)>
	//   10   17:areturn         
	}

	public void addModel(Object obj, Object obj1)
	{
		if(obj instanceof Number)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #24  <Class Number>
	//*   2    4:ifeq            49
		{
			synchronized((LruCache)getCache())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #28  <Method Object getCache()>
	//*   5   11:checkcast       #9   <Class LruCache>
	//*   6   14:astore_3        
	//*   7   15:aload_3         
	//*   8   16:monitorenter    
			{
				obj = ((Object) ((Number)obj));
	//    9   17:aload_1         
	//   10   18:checkcast       #24  <Class Number>
	//   11   21:astore_1        
				((LruCache)getCache()).put(((Object) (Long.valueOf(((Number) (obj)).longValue()))), obj1);
	//   12   22:aload_0         
	//   13   23:invokevirtual   #28  <Method Object getCache()>
	//   14   26:checkcast       #9   <Class LruCache>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #32  <Method long Number.longValue()>
	//   17   33:invokestatic    #38  <Method Long Long.valueOf(long)>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #42  <Method Object LruCache.put(Object, Object)>
	//   20   40:pop             
			}
	//   21   41:aload_3         
	//   22   42:monitorexit     
			return;
	//   23   43:return          
		} else
	//*  24   44:astore_1        
	//*  25   45:aload_3         
	//*  26   46:monitorexit     
	//*  27   47:aload_1         
	//*  28   48:athrow          
		{
			throw new IllegalArgumentException("A ModelLruCache must use an id that can cast toa Number to convert it into a long");
	//   29   49:new             #44  <Class IllegalArgumentException>
	//   30   52:dup             
	//   31   53:ldc1            #46  <String "A ModelLruCache must use an id that can cast toa Number to convert it into a long">
	//   32   55:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//   33   58:athrow          
		}
		obj;
		lrucache;
		JVM INSTR monitorexit ;
		throw obj;
	}

	public void clear()
	{
		synchronized((LruCache)getCache())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #28  <Method Object getCache()>
	//*   2    4:checkcast       #9   <Class LruCache>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			((LruCache)getCache()).evictAll();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #28  <Method Object getCache()>
	//    8   14:checkcast       #9   <Class LruCache>
	//    9   17:invokevirtual   #55  <Method void LruCache.evictAll()>
		}
	//   10   20:aload_1         
	//   11   21:monitorexit     
		return;
	//   12   22:return          
		exception;
	//   13   23:astore_2        
		lrucache;
	//   14   24:aload_1         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		throw exception;
	//   16   26:aload_2         
	//   17   27:athrow          
	}

	public Object get(Object obj)
	{
		if(obj instanceof Number)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #24  <Class Number>
	//*   2    4:ifeq            28
			return ((LruCache)getCache()).get(((Object) (Long.valueOf(((Number)obj).longValue()))));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #28  <Method Object getCache()>
	//    5   11:checkcast       #9   <Class LruCache>
	//    6   14:aload_1         
	//    7   15:checkcast       #24  <Class Number>
	//    8   18:invokevirtual   #32  <Method long Number.longValue()>
	//    9   21:invokestatic    #38  <Method Long Long.valueOf(long)>
	//   10   24:invokevirtual   #59  <Method Object LruCache.get(Object)>
	//   11   27:areturn         
		else
			throw new IllegalArgumentException("A ModelLruCache must use an id that can cast toa Number to convert it into a long");
	//   12   28:new             #44  <Class IllegalArgumentException>
	//   13   31:dup             
	//   14   32:ldc1            #46  <String "A ModelLruCache must use an id that can cast toa Number to convert it into a long">
	//   15   34:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//   16   37:athrow          
	}

	public Object removeModel(Object obj)
	{
		if(obj instanceof Number)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #24  <Class Number>
	//*   2    4:ifeq            47
		{
			synchronized((LruCache)getCache())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #28  <Method Object getCache()>
	//*   5   11:checkcast       #9   <Class LruCache>
	//*   6   14:astore_2        
	//*   7   15:aload_2         
	//*   8   16:monitorenter    
			{
				obj = ((LruCache)getCache()).remove(((Object) (Long.valueOf(((Number)obj).longValue()))));
	//    9   17:aload_0         
	//   10   18:invokevirtual   #28  <Method Object getCache()>
	//   11   21:checkcast       #9   <Class LruCache>
	//   12   24:aload_1         
	//   13   25:checkcast       #24  <Class Number>
	//   14   28:invokevirtual   #32  <Method long Number.longValue()>
	//   15   31:invokestatic    #38  <Method Long Long.valueOf(long)>
	//   16   34:invokevirtual   #64  <Method Object LruCache.remove(Object)>
	//   17   37:astore_1        
			}
	//   18   38:aload_2         
	//   19   39:monitorexit     
			return obj;
	//   20   40:aload_1         
	//   21   41:areturn         
		} else
	//*  22   42:astore_1        
	//*  23   43:aload_2         
	//*  24   44:monitorexit     
	//*  25   45:aload_1         
	//*  26   46:athrow          
		{
			throw new IllegalArgumentException("A ModelLruCache uses an id that can cast toa Number to convert it into a long");
	//   27   47:new             #44  <Class IllegalArgumentException>
	//   28   50:dup             
	//   29   51:ldc1            #66  <String "A ModelLruCache uses an id that can cast toa Number to convert it into a long">
	//   30   53:invokespecial   #49  <Method void IllegalArgumentException(String)>
	//   31   56:athrow          
		}
		obj;
		lrucache;
		JVM INSTR monitorexit ;
		throw obj;
	}

	public void setCacheSize(int i)
	{
		((LruCache)getCache()).resize(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #28  <Method Object getCache()>
	//    2    4:checkcast       #9   <Class LruCache>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #70  <Method void LruCache.resize(int)>
	//    5   11:return          
	}
}
