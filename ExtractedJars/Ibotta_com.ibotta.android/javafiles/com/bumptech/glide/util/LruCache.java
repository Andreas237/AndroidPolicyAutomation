// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util;

import java.util.*;

public class LruCache
{

	public LruCache(long l)
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
	//    9   17:putfield        #25  <Field Map cache>
		initialMaxSize = l;
	//   10   20:aload_0         
	//   11   21:lload_1         
	//   12   22:putfield        #27  <Field long initialMaxSize>
		maxSize = l;
	//   13   25:aload_0         
	//   14   26:lload_1         
	//   15   27:putfield        #29  <Field long maxSize>
	//   16   30:return          
	}

	private void evict()
	{
		trimToSize(maxSize);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field long maxSize>
	//    3    5:invokevirtual   #34  <Method void trimToSize(long)>
	//    4    8:return          
	}

	public void clearMemory()
	{
		trimToSize(0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokevirtual   #34  <Method void trimToSize(long)>
	//    3    5:return          
	}

	public Object get(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		obj = cache.get(obj);
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field Map cache>
	//    4    6:aload_1         
	//    5    7:invokeinterface #43  <Method Object Map.get(Object)>
	//    6   12:astore_1        
		this;
	//    7   13:aload_0         
		JVM INSTR monitorexit ;
	//    8   14:monitorexit     
		return obj;
	//    9   15:aload_1         
	//   10   16:areturn         
		obj;
	//   11   17:astore_1        
	//*  12   18:aload_0         
		throw obj;
	//   13   19:monitorexit     
	//   14   20:aload_1         
	//   15   21:athrow          
	}

	public long getCurrentSize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = currentSize;
	//    2    2:aload_0         
	//    3    3:getfield        #51  <Field long currentSize>
	//    4    6:lstore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return l;
	//    7    9:lload_1         
	//    8   10:lreturn         
		Exception exception;
		exception;
	//    9   11:astore_3        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_3         
	//   13   15:athrow          
	}

	public long getMaxSize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = maxSize;
	//    2    2:aload_0         
	//    3    3:getfield        #29  <Field long maxSize>
	//    4    6:lstore_1        
		this;
	//    5    7:aload_0         
		JVM INSTR monitorexit ;
	//    6    8:monitorexit     
		return l;
	//    7    9:lload_1         
	//    8   10:lreturn         
		Exception exception;
		exception;
	//    9   11:astore_3        
	//*  10   12:aload_0         
		throw exception;
	//   11   13:monitorexit     
	//   12   14:aload_3         
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
		long l;
		l = getSize(obj1);
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #62  <Method int getSize(Object)>
	//    5    7:i2l             
	//    6    8:lstore_3        
		if(l < maxSize)
			break MISSING_BLOCK_LABEL_28;
	//    7    9:lload_3         
	//    8   10:aload_0         
	//    9   11:getfield        #29  <Field long maxSize>
	//   10   14:lcmp            
	//   11   15:iflt            28
		onItemEvicted(obj, obj1);
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:aload_2         
	//   15   21:invokevirtual   #64  <Method void onItemEvicted(Object, Object)>
		this;
	//   16   24:aload_0         
		JVM INSTR monitorexit ;
	//   17   25:monitorexit     
		return ((Object) (null));
	//   18   26:aconst_null     
	//   19   27:areturn         
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_42;
	//   20   28:aload_2         
	//   21   29:ifnull          42
		currentSize = currentSize + l;
	//   22   32:aload_0         
	//   23   33:aload_0         
	//   24   34:getfield        #51  <Field long currentSize>
	//   25   37:lload_3         
	//   26   38:ladd            
	//   27   39:putfield        #51  <Field long currentSize>
		Object obj2 = cache.put(obj, obj1);
	//   28   42:aload_0         
	//   29   43:getfield        #25  <Field Map cache>
	//   30   46:aload_1         
	//   31   47:aload_2         
	//   32   48:invokeinterface #66  <Method Object Map.put(Object, Object)>
	//   33   53:astore          5
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_92;
	//   34   55:aload           5
	//   35   57:ifnull          92
		currentSize = currentSize - (long)getSize(obj2);
	//   36   60:aload_0         
	//   37   61:aload_0         
	//   38   62:getfield        #51  <Field long currentSize>
	//   39   65:aload_0         
	//   40   66:aload           5
	//   41   68:invokevirtual   #62  <Method int getSize(Object)>
	//   42   71:i2l             
	//   43   72:lsub            
	//   44   73:putfield        #51  <Field long currentSize>
		if(!obj2.equals(obj1))
	//*  45   76:aload           5
	//*  46   78:aload_2         
	//*  47   79:invokevirtual   #70  <Method boolean Object.equals(Object)>
	//*  48   82:ifne            92
			onItemEvicted(obj, obj2);
	//   49   85:aload_0         
	//   50   86:aload_1         
	//   51   87:aload           5
	//   52   89:invokevirtual   #64  <Method void onItemEvicted(Object, Object)>
		evict();
	//   53   92:aload_0         
	//   54   93:invokespecial   #72  <Method void evict()>
		this;
	//   55   96:aload_0         
		JVM INSTR monitorexit ;
	//   56   97:monitorexit     
		return obj2;
	//   57   98:aload           5
	//   58  100:areturn         
		obj;
	//   59  101:astore_1        
	//*  60  102:aload_0         
		throw obj;
	//   61  103:monitorexit     
	//   62  104:aload_1         
	//   63  105:athrow          
	}

	public Object remove(Object obj)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		obj = cache.remove(obj);
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field Map cache>
	//    4    6:aload_1         
	//    5    7:invokeinterface #76  <Method Object Map.remove(Object)>
	//    6   12:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_32;
	//    7   13:aload_1         
	//    8   14:ifnull          32
		currentSize = currentSize - (long)getSize(obj);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field long currentSize>
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #62  <Method int getSize(Object)>
	//   15   27:i2l             
	//   16   28:lsub            
	//   17   29:putfield        #51  <Field long currentSize>
		this;
	//   18   32:aload_0         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		return obj;
	//   20   34:aload_1         
	//   21   35:areturn         
		obj;
	//   22   36:astore_1        
	//*  23   37:aload_0         
		throw obj;
	//   24   38:monitorexit     
	//   25   39:aload_1         
	//   26   40:athrow          
	}

	public void setSizeMultiplier(float f)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(f < 0.0F)
			break MISSING_BLOCK_LABEL_34;
	//    2    2:fload_1         
	//    3    3:fconst_0        
	//    4    4:fcmpg           
	//    5    5:iflt            34
		maxSize = Math.round((float)initialMaxSize * f);
	//    6    8:aload_0         
	//    7    9:aload_0         
	//    8   10:getfield        #27  <Field long initialMaxSize>
	//    9   13:l2f             
	//   10   14:fload_1         
	//   11   15:fmul            
	//   12   16:invokestatic    #84  <Method int Math.round(float)>
	//   13   19:i2l             
	//   14   20:putfield        #29  <Field long maxSize>
		evict();
	//   15   23:aload_0         
	//   16   24:invokespecial   #72  <Method void evict()>
		this;
	//   17   27:aload_0         
		JVM INSTR monitorexit ;
	//   18   28:monitorexit     
		return;
	//   19   29:return          
		Exception exception;
		exception;
	//   20   30:astore_2        
		break MISSING_BLOCK_LABEL_45;
	//   21   31:goto            44
		throw new IllegalArgumentException("Multiplier must be >= 0");
	//   22   34:new             #86  <Class IllegalArgumentException>
	//   23   37:dup             
	//   24   38:ldc1            #88  <String "Multiplier must be >= 0">
	//   25   40:invokespecial   #91  <Method void IllegalArgumentException(String)>
	//   26   43:athrow          
	//*  27   44:aload_0         
		throw exception;
	//   28   45:monitorexit     
	//   29   46:aload_2         
	//   30   47:athrow          
	}

	protected void trimToSize(long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		while(currentSize > l) 
	//*   2    2:aload_0         
	//*   3    3:getfield        #51  <Field long currentSize>
	//*   4    6:lload_1         
	//*   5    7:lcmp            
	//*   6    8:ifle            88
		{
			Iterator iterator = cache.entrySet().iterator();
	//    7   11:aload_0         
	//    8   12:getfield        #25  <Field Map cache>
	//    9   15:invokeinterface #95  <Method Set Map.entrySet()>
	//   10   20:invokeinterface #101 <Method Iterator Set.iterator()>
	//   11   25:astore_3        
			Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   12   26:aload_3         
	//   13   27:invokeinterface #107 <Method Object Iterator.next()>
	//   14   32:checkcast       #109 <Class java.util.Map$Entry>
	//   15   35:astore          5
			Object obj = ((java.util.Map.Entry) (obj1)).getValue();
	//   16   37:aload           5
	//   17   39:invokeinterface #112 <Method Object java.util.Map$Entry.getValue()>
	//   18   44:astore          4
			currentSize = currentSize - (long)getSize(obj);
	//   19   46:aload_0         
	//   20   47:aload_0         
	//   21   48:getfield        #51  <Field long currentSize>
	//   22   51:aload_0         
	//   23   52:aload           4
	//   24   54:invokevirtual   #62  <Method int getSize(Object)>
	//   25   57:i2l             
	//   26   58:lsub            
	//   27   59:putfield        #51  <Field long currentSize>
			obj1 = ((java.util.Map.Entry) (obj1)).getKey();
	//   28   62:aload           5
	//   29   64:invokeinterface #115 <Method Object java.util.Map$Entry.getKey()>
	//   30   69:astore          5
			iterator.remove();
	//   31   71:aload_3         
	//   32   72:invokeinterface #117 <Method void Iterator.remove()>
			onItemEvicted(obj1, obj);
	//   33   77:aload_0         
	//   34   78:aload           5
	//   35   80:aload           4
	//   36   82:invokevirtual   #64  <Method void onItemEvicted(Object, Object)>
		}
	//*  37   85:goto            2
		this;
	//   38   88:aload_0         
		JVM INSTR monitorexit ;
	//   39   89:monitorexit     
		return;
	//   40   90:return          
		Exception exception;
		exception;
	//   41   91:astore_3        
	//*  42   92:aload_0         
		throw exception;
	//   43   93:monitorexit     
	//   44   94:aload_3         
	//   45   95:athrow          
	}

	private final Map cache = new LinkedHashMap(100, 0.75F, true);
	private long currentSize;
	private final long initialMaxSize;
	private long maxSize;
}
