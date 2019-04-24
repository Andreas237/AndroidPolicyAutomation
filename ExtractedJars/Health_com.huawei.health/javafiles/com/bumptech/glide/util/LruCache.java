// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import java.util.*;

public class LruCache
{

	public LruCache(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:bipush          100
	//    6   11:ldc1            #20  <Float 0.75F>
	//    7   13:iconst_1        
	//    8   14:invokespecial   #23  <Method void LinkedHashMap(int, float, boolean)>
	//    9   17:putfield        #25  <Field LinkedHashMap cache>
		currentSize = 0;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #27  <Field int currentSize>
		initialMaxSize = i;
	//   13   25:aload_0         
	//   14   26:iload_1         
	//   15   27:putfield        #29  <Field int initialMaxSize>
		maxSize = i;
	//   16   30:aload_0         
	//   17   31:iload_1         
	//   18   32:putfield        #31  <Field int maxSize>
	//   19   35:return          
	}

	private void evict()
	{
		trimToSize(maxSize);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field int maxSize>
	//    3    5:invokevirtual   #36  <Method void trimToSize(int)>
	//    4    8:return          
	}

	public void clearMemory()
	{
		trimToSize(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #36  <Method void trimToSize(int)>
	//    3    5:return          
	}

	public boolean contains(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag = cache.containsKey(obj);
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field LinkedHashMap cache>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #42  <Method boolean LinkedHashMap.containsKey(Object)>
	//    6   10:istore_2        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return flag;
	//    9   13:iload_2         
	//   10   14:ireturn         
		obj;
	//   11   15:astore_1        
	//*  12   16:aload_0         
		throw obj;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public Object get(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		obj = cache.get(obj);
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field LinkedHashMap cache>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #49  <Method Object LinkedHashMap.get(Object)>
	//    6   10:astore_1        
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return obj;
	//    9   13:aload_1         
	//   10   14:areturn         
		obj;
	//   11   15:astore_1        
	//*  12   16:aload_0         
		throw obj;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	protected int getCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = cache.size();
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field LinkedHashMap cache>
	//    4    6:invokevirtual   #56  <Method int LinkedHashMap.size()>
	//    5    9:istore_1        
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
		Exception exception;
		exception;
	//   10   14:astore_2        
	//*  11   15:aload_0         
		throw exception;
	//   12   16:monitorexit     
	//   13   17:aload_2         
	//   14   18:athrow          
	}

	public int getCurrentSize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = currentSize;
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field int currentSize>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return i;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	public int getMaxSize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = maxSize;
	//    2    2:aload_0         
	//    3    3:getfield        #31  <Field int maxSize>
	//    4    6:istore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return i;
	//    7    9:iload_1         
	//    8   10:ireturn         
		Exception exception;
		exception;
	//    9   11:astore_2        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_2         
	//   13   15:athrow          
	}

	protected int getSize(Object obj)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected void onItemEvicted(Object obj, Object obj1)
	{
	//    0    0:return          
	}

	public Object put(Object obj, Object obj1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(getSize(obj1) < maxSize)
			break MISSING_BLOCK_LABEL_24;
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #68  <Method int getSize(Object)>
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field int maxSize>
	//    7   11:icmplt          24
		onItemEvicted(obj, obj1);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #70  <Method void onItemEvicted(Object, Object)>
		this;
	//   12   20:aload_0         
		JVM INSTR monitorexit ;
	//   13   21:monitorexit     
		return ((Object) (null));
	//   14   22:aconst_null     
	//   15   23:areturn         
		obj = cache.put(obj, obj1);
	//   16   24:aload_0         
	//   17   25:getfield        #25  <Field LinkedHashMap cache>
	//   18   28:aload_1         
	//   19   29:aload_2         
	//   20   30:invokevirtual   #72  <Method Object LinkedHashMap.put(Object, Object)>
	//   21   33:astore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_52;
	//   22   34:aload_2         
	//   23   35:ifnull          52
		currentSize = currentSize + getSize(obj1);
	//   24   38:aload_0         
	//   25   39:aload_0         
	//   26   40:getfield        #27  <Field int currentSize>
	//   27   43:aload_0         
	//   28   44:aload_2         
	//   29   45:invokevirtual   #68  <Method int getSize(Object)>
	//   30   48:iadd            
	//   31   49:putfield        #27  <Field int currentSize>
		if(obj == null)
			break MISSING_BLOCK_LABEL_70;
	//   32   52:aload_1         
	//   33   53:ifnull          70
		currentSize = currentSize - getSize(obj);
	//   34   56:aload_0         
	//   35   57:aload_0         
	//   36   58:getfield        #27  <Field int currentSize>
	//   37   61:aload_0         
	//   38   62:aload_1         
	//   39   63:invokevirtual   #68  <Method int getSize(Object)>
	//   40   66:isub            
	//   41   67:putfield        #27  <Field int currentSize>
		evict();
	//   42   70:aload_0         
	//   43   71:invokespecial   #74  <Method void evict()>
		this;
	//   44   74:aload_0         
		JVM INSTR monitorexit ;
	//   45   75:monitorexit     
		return obj;
	//   46   76:aload_1         
	//   47   77:areturn         
		obj;
	//   48   78:astore_1        
	//*  49   79:aload_0         
		throw obj;
	//   50   80:monitorexit     
	//   51   81:aload_1         
	//   52   82:athrow          
	}

	public Object remove(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		obj = cache.remove(obj);
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field LinkedHashMap cache>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #78  <Method Object LinkedHashMap.remove(Object)>
	//    6   10:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_29;
	//    7   11:aload_1         
	//    8   12:ifnull          29
		currentSize = currentSize - getSize(obj);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #27  <Field int currentSize>
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #68  <Method int getSize(Object)>
	//   15   25:isub            
	//   16   26:putfield        #27  <Field int currentSize>
		this;
	//   17   29:aload_0         
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return obj;
	//   19   31:aload_1         
	//   20   32:areturn         
		obj;
	//   21   33:astore_1        
	//*  22   34:aload_0         
		throw obj;
	//   23   35:monitorexit     
	//   24   36:aload_1         
	//   25   37:athrow          
	}

	public void setSizeMultiplier(float f)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(f >= 0.0F)
			break MISSING_BLOCK_LABEL_18;
	//    2    2:fload_1         
	//    3    3:fconst_0        
	//    4    4:fcmpg           
	//    5    5:ifge            18
		throw new IllegalArgumentException("Multiplier must be >= 0");
	//    6    8:new             #82  <Class IllegalArgumentException>
	//    7   11:dup             
	//    8   12:ldc1            #84  <String "Multiplier must be >= 0">
	//    9   14:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//   10   17:athrow          
		maxSize = Math.round((float)initialMaxSize * f);
	//   11   18:aload_0         
	//   12   19:aload_0         
	//   13   20:getfield        #29  <Field int initialMaxSize>
	//   14   23:i2f             
	//   15   24:fload_1         
	//   16   25:fmul            
	//   17   26:invokestatic    #93  <Method int Math.round(float)>
	//   18   29:putfield        #31  <Field int maxSize>
		evict();
	//   19   32:aload_0         
	//   20   33:invokespecial   #74  <Method void evict()>
		this;
	//   21   36:aload_0         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		return;
	//   23   38:return          
		Exception exception;
		exception;
	//   24   39:astore_2        
	//*  25   40:aload_0         
		throw exception;
	//   26   41:monitorexit     
	//   27   42:aload_2         
	//   28   43:athrow          
	}

	protected void trimToSize(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		while(currentSize > i) 
	//*   2    2:aload_0         
	//*   3    3:getfield        #27  <Field int currentSize>
	//*   4    6:iload_1         
	//*   5    7:icmple          77
		{
			Object obj1 = ((Object) ((java.util.Map.Entry)cache.entrySet().iterator().next()));
	//    6   10:aload_0         
	//    7   11:getfield        #25  <Field LinkedHashMap cache>
	//    8   14:invokevirtual   #97  <Method Set LinkedHashMap.entrySet()>
	//    9   17:invokeinterface #103 <Method Iterator Set.iterator()>
	//   10   22:invokeinterface #109 <Method Object Iterator.next()>
	//   11   27:checkcast       #111 <Class java.util.Map$Entry>
	//   12   30:astore_3        
			Object obj = ((java.util.Map.Entry) (obj1)).getValue();
	//   13   31:aload_3         
	//   14   32:invokeinterface #114 <Method Object java.util.Map$Entry.getValue()>
	//   15   37:astore_2        
			currentSize = currentSize - getSize(obj);
	//   16   38:aload_0         
	//   17   39:aload_0         
	//   18   40:getfield        #27  <Field int currentSize>
	//   19   43:aload_0         
	//   20   44:aload_2         
	//   21   45:invokevirtual   #68  <Method int getSize(Object)>
	//   22   48:isub            
	//   23   49:putfield        #27  <Field int currentSize>
			obj1 = ((java.util.Map.Entry) (obj1)).getKey();
	//   24   52:aload_3         
	//   25   53:invokeinterface #117 <Method Object java.util.Map$Entry.getKey()>
	//   26   58:astore_3        
			cache.remove(obj1);
	//   27   59:aload_0         
	//   28   60:getfield        #25  <Field LinkedHashMap cache>
	//   29   63:aload_3         
	//   30   64:invokevirtual   #78  <Method Object LinkedHashMap.remove(Object)>
	//   31   67:pop             
			onItemEvicted(obj1, obj);
	//   32   68:aload_0         
	//   33   69:aload_3         
	//   34   70:aload_2         
	//   35   71:invokevirtual   #70  <Method void onItemEvicted(Object, Object)>
		}
	//*  36   74:goto            2
		this;
	//   37   77:aload_0         
		JVM INSTR monitorexit ;
	//   38   78:monitorexit     
		return;
	//   39   79:return          
		Exception exception;
		exception;
	//   40   80:astore_2        
	//*  41   81:aload_0         
		throw exception;
	//   42   82:monitorexit     
	//   43   83:aload_2         
	//   44   84:athrow          
	}

	private final LinkedHashMap cache = new LinkedHashMap(100, 0.75F, true);
	private int currentSize;
	private final int initialMaxSize;
	private int maxSize;
}
