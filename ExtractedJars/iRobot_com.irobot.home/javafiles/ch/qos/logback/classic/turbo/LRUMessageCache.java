// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.turbo;

import java.util.LinkedHashMap;

class LRUMessageCache extends LinkedHashMap
{

	LRUMessageCache(int i)
	{
		super((int)((float)i * 1.333333F), 0.75F, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:ldc1            #14  <Float 1.333333F>
	//    4    5:fmul            
	//    5    6:f2i             
	//    6    7:ldc1            #15  <Float 0.75F>
	//    7    9:iconst_1        
	//    8   10:invokespecial   #18  <Method void LinkedHashMap(int, float, boolean)>
		if(i < 1)
	//*   9   13:iload_1         
	//*  10   14:iconst_1        
	//*  11   15:icmpge          28
		{
			throw new IllegalArgumentException("Cache size cannot be smaller than 1");
	//   12   18:new             #20  <Class IllegalArgumentException>
	//   13   21:dup             
	//   14   22:ldc1            #22  <String "Cache size cannot be smaller than 1">
	//   15   24:invokespecial   #25  <Method void IllegalArgumentException(String)>
	//   16   27:athrow          
		} else
		{
			cacheSize = i;
	//   17   28:aload_0         
	//   18   29:iload_1         
	//   19   30:putfield        #27  <Field int cacheSize>
			return;
	//   20   33:return          
		}
	}

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.clear();
	//    2    2:aload_0         
	//    3    3:invokespecial   #32  <Method void LinkedHashMap.clear()>
		this;
	//    4    6:aload_0         
		JVM INSTR monitorexit ;
	//    5    7:monitorexit     
		return;
	//    6    8:return          
		Exception exception;
		exception;
	//    7    9:astore_1        
	//*   8   10:aload_0         
		throw exception;
	//    9   11:monitorexit     
	//   10   12:aload_1         
	//   11   13:athrow          
	}

	int getMessageCountAndThenIncrement(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		this;
	//    4    6:aload_0         
		JVM INSTR monitorenter ;
	//    5    7:monitorenter    
		Integer integer = (Integer)super.get(((Object) (s)));
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:invokespecial   #38  <Method Object LinkedHashMap.get(Object)>
	//    9   13:checkcast       #40  <Class Integer>
	//   10   16:astore_2        
		if(integer != null)
			break MISSING_BLOCK_LABEL_29;
	//   11   17:aload_2         
	//   12   18:ifnonnull       29
		integer = Integer.valueOf(0);
	//   13   21:iconst_0        
	//   14   22:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   15   25:astore_2        
		break MISSING_BLOCK_LABEL_39;
	//   16   26:goto            39
		integer = Integer.valueOf(integer.intValue() + 1);
	//   17   29:aload_2         
	//   18   30:invokevirtual   #48  <Method int Integer.intValue()>
	//   19   33:iconst_1        
	//   20   34:iadd            
	//   21   35:invokestatic    #44  <Method Integer Integer.valueOf(int)>
	//   22   38:astore_2        
		super.put(((Object) (s)), ((Object) (integer)));
	//   23   39:aload_0         
	//   24   40:aload_1         
	//   25   41:aload_2         
	//   26   42:invokespecial   #52  <Method Object LinkedHashMap.put(Object, Object)>
	//   27   45:pop             
		this;
	//   28   46:aload_0         
		JVM INSTR monitorexit ;
	//   29   47:monitorexit     
		return integer.intValue();
	//   30   48:aload_2         
	//   31   49:invokevirtual   #48  <Method int Integer.intValue()>
	//   32   52:ireturn         
		s;
	//   33   53:astore_1        
		this;
	//   34   54:aload_0         
		JVM INSTR monitorexit ;
	//   35   55:monitorexit     
		throw s;
	//   36   56:aload_1         
	//   37   57:athrow          
	}

	protected boolean removeEldestEntry(java.util.Map.Entry entry)
	{
		return size() > cacheSize;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #57  <Method int size()>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field int cacheSize>
	//    4    8:icmple          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private static final long serialVersionUID = 1L;
	final int cacheSize;
}
