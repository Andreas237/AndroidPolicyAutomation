// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.structure.cache;

import java.util.*;

public class LruCache
{

	public LruCache(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		if(i <= 0)
	//*   2    4:iload_1         
	//*   3    5:ifgt            18
		{
			throw new IllegalArgumentException("maxSize <= 0");
	//    4    8:new             #23  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #25  <String "maxSize <= 0">
	//    7   14:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		} else
		{
			maxSize = i;
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:putfield        #30  <Field int maxSize>
			map = new LinkedHashMap(0, 0.75F, true);
	//   12   23:aload_0         
	//   13   24:new             #32  <Class LinkedHashMap>
	//   14   27:dup             
	//   15   28:iconst_0        
	//   16   29:ldc1            #33  <Float 0.75F>
	//   17   31:iconst_1        
	//   18   32:invokespecial   #36  <Method void LinkedHashMap(int, float, boolean)>
	//   19   35:putfield        #38  <Field LinkedHashMap map>
			return;
	//   20   38:return          
		}
	}

	private int safeSizeOf(Object obj, Object obj1)
	{
		int i = sizeOf(obj, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #44  <Method int sizeOf(Object, Object)>
	//    4    6:istore_3        
		if(i < 0)
	//*   5    7:iload_3         
	//*   6    8:ifge            47
			throw new IllegalStateException((new StringBuilder()).append("Negative size: ").append(obj).append("=").append(obj1).toString());
	//    7   11:new             #46  <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:new             #48  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #49  <Method void StringBuilder()>
	//   12   22:ldc1            #51  <String "Negative size: ">
	//   13   24:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:aload_1         
	//   15   28:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   16   31:ldc1            #60  <String "=">
	//   17   33:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:aload_2         
	//   19   37:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   20   40:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   21   43:invokespecial   #65  <Method void IllegalStateException(String)>
	//   22   46:athrow          
		else
			return i;
	//   23   47:iload_3         
	//   24   48:ireturn         
	}

	protected Object create(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final int createCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = createCount;
	//    2    2:aload_0         
	//    3    3:getfield        #73  <Field int createCount>
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

	protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
	{
	//    0    0:return          
	}

	public final void evictAll()
	{
		trimToSize(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #80  <Method void trimToSize(int)>
	//    3    5:return          
	}

	public final int evictionCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = evictionCount;
	//    2    2:aload_0         
	//    3    3:getfield        #82  <Field int evictionCount>
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

	public final Object get(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("key == null");
	//    2    4:new             #85  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #87  <String "key == null">
	//    5   10:invokespecial   #88  <Method void NullPointerException(String)>
	//    6   13:athrow          
		this;
	//    7   14:aload_0         
		JVM INSTR monitorenter ;
	//    8   15:monitorenter    
		Object obj1 = map.get(obj);
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field LinkedHashMap map>
	//   11   20:aload_1         
	//   12   21:invokevirtual   #90  <Method Object LinkedHashMap.get(Object)>
	//   13   24:astore_2        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_43;
	//   14   25:aload_2         
	//   15   26:ifnull          43
		hitCount = hitCount + 1;
	//   16   29:aload_0         
	//   17   30:aload_0         
	//   18   31:getfield        #92  <Field int hitCount>
	//   19   34:iconst_1        
	//   20   35:iadd            
	//   21   36:putfield        #92  <Field int hitCount>
		this;
	//   22   39:aload_0         
		JVM INSTR monitorexit ;
	//   23   40:monitorexit     
		return obj1;
	//   24   41:aload_2         
	//   25   42:areturn         
		missCount = missCount + 1;
	//   26   43:aload_0         
	//   27   44:aload_0         
	//   28   45:getfield        #94  <Field int missCount>
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:putfield        #94  <Field int missCount>
		this;
	//   32   53:aload_0         
		JVM INSTR monitorexit ;
	//   33   54:monitorexit     
		obj1 = create(obj);
	//   34   55:aload_0         
	//   35   56:aload_1         
	//   36   57:invokevirtual   #96  <Method Object create(Object)>
	//   37   60:astore_2        
		if(obj1 == null)
	//*  38   61:aload_2         
	//*  39   62:ifnonnull       72
			return ((Object) (null));
	//   40   65:aconst_null     
	//   41   66:areturn         
		break MISSING_BLOCK_LABEL_72;
		obj;
	//   42   67:astore_1        
		this;
	//   43   68:aload_0         
		JVM INSTR monitorexit ;
	//   44   69:monitorexit     
		throw obj;
	//   45   70:aload_1         
	//   46   71:athrow          
		this;
	//   47   72:aload_0         
		JVM INSTR monitorenter ;
	//   48   73:monitorenter    
		Object obj2;
		createCount = createCount + 1;
	//   49   74:aload_0         
	//   50   75:aload_0         
	//   51   76:getfield        #73  <Field int createCount>
	//   52   79:iconst_1        
	//   53   80:iadd            
	//   54   81:putfield        #73  <Field int createCount>
		obj2 = map.put(obj, obj1);
	//   55   84:aload_0         
	//   56   85:getfield        #38  <Field LinkedHashMap map>
	//   57   88:aload_1         
	//   58   89:aload_2         
	//   59   90:invokevirtual   #100 <Method Object LinkedHashMap.put(Object, Object)>
	//   60   93:astore_3        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_124;
	//   61   94:aload_3         
	//   62   95:ifnull          124
		map.put(obj, obj2);
	//   63   98:aload_0         
	//   64   99:getfield        #38  <Field LinkedHashMap map>
	//   65  102:aload_1         
	//   66  103:aload_3         
	//   67  104:invokevirtual   #100 <Method Object LinkedHashMap.put(Object, Object)>
	//   68  107:pop             
_L1:
		this;
	//   69  108:aload_0         
		JVM INSTR monitorexit ;
	//   70  109:monitorexit     
		if(obj2 != null)
	//*  71  110:aload_3         
	//*  72  111:ifnull          147
		{
			entryRemoved(false, obj, obj1, obj2);
	//   73  114:aload_0         
	//   74  115:iconst_0        
	//   75  116:aload_1         
	//   76  117:aload_2         
	//   77  118:aload_3         
	//   78  119:invokevirtual   #102 <Method void entryRemoved(boolean, Object, Object, Object)>
			return obj2;
	//   79  122:aload_3         
	//   80  123:areturn         
		} else
	//*  81  124:aload_0         
	//*  82  125:aload_0         
	//*  83  126:getfield        #104 <Field int size>
	//*  84  129:aload_0         
	//*  85  130:aload_1         
	//*  86  131:aload_2         
	//*  87  132:invokespecial   #106 <Method int safeSizeOf(Object, Object)>
	//*  88  135:iadd            
	//*  89  136:putfield        #104 <Field int size>
	//*  90  139:goto            108
	//*  91  142:astore_1        
	//*  92  143:aload_0         
	//*  93  144:monitorexit     
	//*  94  145:aload_1         
	//*  95  146:athrow          
		{
			trimToSize(maxSize);
	//   96  147:aload_0         
	//   97  148:aload_0         
	//   98  149:getfield        #30  <Field int maxSize>
	//   99  152:invokevirtual   #80  <Method void trimToSize(int)>
			return obj1;
	//  100  155:aload_2         
	//  101  156:areturn         
		}
		size = size + safeSizeOf(obj, obj1);
		  goto _L1
		obj;
		this;
		JVM INSTR monitorexit ;
		throw obj;
	}

	public final int hitCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = hitCount;
	//    2    2:aload_0         
	//    3    3:getfield        #92  <Field int hitCount>
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

	public final int maxSize()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = maxSize;
	//    2    2:aload_0         
	//    3    3:getfield        #30  <Field int maxSize>
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

	public final int missCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = missCount;
	//    2    2:aload_0         
	//    3    3:getfield        #94  <Field int missCount>
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

	public final Object put(Object obj, Object obj1)
	{
		if(obj == null || obj1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       18
			throw new NullPointerException("key == null || value == null");
	//    4    8:new             #85  <Class NullPointerException>
	//    5   11:dup             
	//    6   12:ldc1            #108 <String "key == null || value == null">
	//    7   14:invokespecial   #88  <Method void NullPointerException(String)>
	//    8   17:athrow          
		this;
	//    9   18:aload_0         
		JVM INSTR monitorenter ;
	//   10   19:monitorenter    
		Object obj2;
		putCount = putCount + 1;
	//   11   20:aload_0         
	//   12   21:aload_0         
	//   13   22:getfield        #110 <Field int putCount>
	//   14   25:iconst_1        
	//   15   26:iadd            
	//   16   27:putfield        #110 <Field int putCount>
		size = size + safeSizeOf(obj, obj1);
	//   17   30:aload_0         
	//   18   31:aload_0         
	//   19   32:getfield        #104 <Field int size>
	//   20   35:aload_0         
	//   21   36:aload_1         
	//   22   37:aload_2         
	//   23   38:invokespecial   #106 <Method int safeSizeOf(Object, Object)>
	//   24   41:iadd            
	//   25   42:putfield        #104 <Field int size>
		obj2 = map.put(obj, obj1);
	//   26   45:aload_0         
	//   27   46:getfield        #38  <Field LinkedHashMap map>
	//   28   49:aload_1         
	//   29   50:aload_2         
	//   30   51:invokevirtual   #100 <Method Object LinkedHashMap.put(Object, Object)>
	//   31   54:astore_3        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_74;
	//   32   55:aload_3         
	//   33   56:ifnull          74
		size = size - safeSizeOf(obj, obj2);
	//   34   59:aload_0         
	//   35   60:aload_0         
	//   36   61:getfield        #104 <Field int size>
	//   37   64:aload_0         
	//   38   65:aload_1         
	//   39   66:aload_3         
	//   40   67:invokespecial   #106 <Method int safeSizeOf(Object, Object)>
	//   41   70:isub            
	//   42   71:putfield        #104 <Field int size>
		this;
	//   43   74:aload_0         
		JVM INSTR monitorexit ;
	//   44   75:monitorexit     
		if(obj2 != null)
	//*  45   76:aload_3         
	//*  46   77:ifnull          88
			entryRemoved(false, obj, obj2, obj1);
	//   47   80:aload_0         
	//   48   81:iconst_0        
	//   49   82:aload_1         
	//   50   83:aload_3         
	//   51   84:aload_2         
	//   52   85:invokevirtual   #102 <Method void entryRemoved(boolean, Object, Object, Object)>
		trimToSize(maxSize);
	//   53   88:aload_0         
	//   54   89:aload_0         
	//   55   90:getfield        #30  <Field int maxSize>
	//   56   93:invokevirtual   #80  <Method void trimToSize(int)>
		return obj2;
	//   57   96:aload_3         
	//   58   97:areturn         
		obj;
	//   59   98:astore_1        
		this;
	//   60   99:aload_0         
		JVM INSTR monitorexit ;
	//   61  100:monitorexit     
		throw obj;
	//   62  101:aload_1         
	//   63  102:athrow          
	}

	public final int putCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = putCount;
	//    2    2:aload_0         
	//    3    3:getfield        #110 <Field int putCount>
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

	public final Object remove(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("key == null");
	//    2    4:new             #85  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #87  <String "key == null">
	//    5   10:invokespecial   #88  <Method void NullPointerException(String)>
	//    6   13:athrow          
		this;
	//    7   14:aload_0         
		JVM INSTR monitorenter ;
	//    8   15:monitorenter    
		Object obj1 = map.remove(obj);
	//    9   16:aload_0         
	//   10   17:getfield        #38  <Field LinkedHashMap map>
	//   11   20:aload_1         
	//   12   21:invokevirtual   #114 <Method Object LinkedHashMap.remove(Object)>
	//   13   24:astore_2        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_44;
	//   14   25:aload_2         
	//   15   26:ifnull          44
		size = size - safeSizeOf(obj, obj1);
	//   16   29:aload_0         
	//   17   30:aload_0         
	//   18   31:getfield        #104 <Field int size>
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:aload_2         
	//   22   37:invokespecial   #106 <Method int safeSizeOf(Object, Object)>
	//   23   40:isub            
	//   24   41:putfield        #104 <Field int size>
		this;
	//   25   44:aload_0         
		JVM INSTR monitorexit ;
	//   26   45:monitorexit     
		if(obj1 != null)
	//*  27   46:aload_2         
	//*  28   47:ifnull          58
			entryRemoved(false, obj, obj1, ((Object) (null)));
	//   29   50:aload_0         
	//   30   51:iconst_0        
	//   31   52:aload_1         
	//   32   53:aload_2         
	//   33   54:aconst_null     
	//   34   55:invokevirtual   #102 <Method void entryRemoved(boolean, Object, Object, Object)>
		return obj1;
	//   35   58:aload_2         
	//   36   59:areturn         
		obj;
	//   37   60:astore_1        
		this;
	//   38   61:aload_0         
		JVM INSTR monitorexit ;
	//   39   62:monitorexit     
		throw obj;
	//   40   63:aload_1         
	//   41   64:athrow          
	}

	public void resize(int i)
	{
		if(i <= 0)
	//*   0    0:iload_1         
	//*   1    1:ifgt            14
			throw new IllegalArgumentException("maxSize <= 0");
	//    2    4:new             #23  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #25  <String "maxSize <= 0">
	//    5   10:invokespecial   #28  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		this;
	//    7   14:aload_0         
		JVM INSTR monitorenter ;
	//    8   15:monitorenter    
		maxSize = i;
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:putfield        #30  <Field int maxSize>
		this;
	//   12   21:aload_0         
		JVM INSTR monitorexit ;
	//   13   22:monitorexit     
		trimToSize(i);
	//   14   23:aload_0         
	//   15   24:iload_1         
	//   16   25:invokevirtual   #80  <Method void trimToSize(int)>
		return;
	//   17   28:return          
		Exception exception;
		exception;
	//   18   29:astore_2        
		this;
	//   19   30:aload_0         
		JVM INSTR monitorexit ;
	//   20   31:monitorexit     
		throw exception;
	//   21   32:aload_2         
	//   22   33:athrow          
	}

	public final int size()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = size;
	//    2    2:aload_0         
	//    3    3:getfield        #104 <Field int size>
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

	protected int sizeOf(Object obj, Object obj1)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final Map snapshot()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		LinkedHashMap linkedhashmap = new LinkedHashMap(((Map) (map)));
	//    2    2:new             #32  <Class LinkedHashMap>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field LinkedHashMap map>
	//    6   10:invokespecial   #120 <Method void LinkedHashMap(Map)>
	//    7   13:astore_1        
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return ((Map) (linkedhashmap));
	//   10   16:aload_1         
	//   11   17:areturn         
		Exception exception;
		exception;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw exception;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final String toString()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		this;
	//    2    2:aload_0         
		JVM INSTR monitorenter ;
	//    3    3:monitorenter    
		int j = hitCount + missCount;
	//    4    4:aload_0         
	//    5    5:getfield        #92  <Field int hitCount>
	//    6    8:aload_0         
	//    7    9:getfield        #94  <Field int missCount>
	//    8   12:iadd            
	//    9   13:istore_2        
		if(j == 0)
			break MISSING_BLOCK_LABEL_28;
	//   10   14:iload_2         
	//   11   15:ifeq            28
		i = (hitCount * 100) / j;
	//   12   18:aload_0         
	//   13   19:getfield        #92  <Field int hitCount>
	//   14   22:bipush          100
	//   15   24:imul            
	//   16   25:iload_2         
	//   17   26:idiv            
	//   18   27:istore_1        
		String s = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] {
			Integer.valueOf(maxSize), Integer.valueOf(hitCount), Integer.valueOf(missCount), Integer.valueOf(i)
		});
	//   19   28:ldc1            #123 <String "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]">
	//   20   30:iconst_4        
	//   21   31:anewarray       Object[]
	//   22   34:dup             
	//   23   35:iconst_0        
	//   24   36:aload_0         
	//   25   37:getfield        #30  <Field int maxSize>
	//   26   40:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//   27   43:aastore         
	//   28   44:dup             
	//   29   45:iconst_1        
	//   30   46:aload_0         
	//   31   47:getfield        #92  <Field int hitCount>
	//   32   50:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//   33   53:aastore         
	//   34   54:dup             
	//   35   55:iconst_2        
	//   36   56:aload_0         
	//   37   57:getfield        #94  <Field int missCount>
	//   38   60:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//   39   63:aastore         
	//   40   64:dup             
	//   41   65:iconst_3        
	//   42   66:iload_1         
	//   43   67:invokestatic    #129 <Method Integer Integer.valueOf(int)>
	//   44   70:aastore         
	//   45   71:invokestatic    #135 <Method String String.format(String, Object[])>
	//   46   74:astore_3        
		this;
	//   47   75:aload_0         
		JVM INSTR monitorexit ;
	//   48   76:monitorexit     
		return s;
	//   49   77:aload_3         
	//   50   78:areturn         
		Exception exception;
		exception;
	//   51   79:astore_3        
	//*  52   80:aload_0         
		throw exception;
	//   53   81:monitorexit     
	//   54   82:aload_3         
	//   55   83:athrow          
	}

	public void trimToSize(int i)
	{
_L2:
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(size < 0 || map.isEmpty() && size != 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #104 <Field int size>
	//*   4    6:iflt            26
	//*   5    9:aload_0         
	//*   6   10:getfield        #38  <Field LinkedHashMap map>
	//*   7   13:invokevirtual   #139 <Method boolean LinkedHashMap.isEmpty()>
	//*   8   16:ifeq            64
	//*   9   19:aload_0         
	//*  10   20:getfield        #104 <Field int size>
	//*  11   23:ifeq            64
			throw new IllegalStateException((new StringBuilder()).append(((Object)this).getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
	//   12   26:new             #46  <Class IllegalStateException>
	//   13   29:dup             
	//   14   30:new             #48  <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #49  <Method void StringBuilder()>
	//   17   37:aload_0         
	//   18   38:invokevirtual   #143 <Method Class Object.getClass()>
	//   19   41:invokevirtual   #148 <Method String Class.getName()>
	//   20   44:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   21   47:ldc1            #150 <String ".sizeOf() is reporting inconsistent results!">
	//   22   49:invokevirtual   #55  <Method StringBuilder StringBuilder.append(String)>
	//   23   52:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   24   55:invokespecial   #65  <Method void IllegalStateException(String)>
	//   25   58:athrow          
		break MISSING_BLOCK_LABEL_64;
		Exception exception;
		exception;
	//   26   59:astore_2        
		this;
	//   27   60:aload_0         
		JVM INSTR monitorexit ;
	//   28   61:monitorexit     
		throw exception;
	//   29   62:aload_2         
	//   30   63:athrow          
		if(size > i && !map.isEmpty())
			break MISSING_BLOCK_LABEL_85;
	//   31   64:aload_0         
	//   32   65:getfield        #104 <Field int size>
	//   33   68:iload_1         
	//   34   69:icmple          82
	//   35   72:aload_0         
	//   36   73:getfield        #38  <Field LinkedHashMap map>
	//   37   76:invokevirtual   #139 <Method boolean LinkedHashMap.isEmpty()>
	//   38   79:ifeq            85
		this;
	//   39   82:aload_0         
		JVM INSTR monitorexit ;
	//   40   83:monitorexit     
		return;
	//   41   84:return          
		Object obj;
		Object obj1;
		obj1 = ((Object) ((java.util.Map.Entry)map.entrySet().iterator().next()));
	//   42   85:aload_0         
	//   43   86:getfield        #38  <Field LinkedHashMap map>
	//   44   89:invokevirtual   #154 <Method Set LinkedHashMap.entrySet()>
	//   45   92:invokeinterface #160 <Method Iterator Set.iterator()>
	//   46   97:invokeinterface #166 <Method Object Iterator.next()>
	//   47  102:checkcast       #168 <Class java.util.Map$Entry>
	//   48  105:astore_3        
		obj = ((java.util.Map.Entry) (obj1)).getKey();
	//   49  106:aload_3         
	//   50  107:invokeinterface #171 <Method Object java.util.Map$Entry.getKey()>
	//   51  112:astore_2        
		obj1 = ((java.util.Map.Entry) (obj1)).getValue();
	//   52  113:aload_3         
	//   53  114:invokeinterface #174 <Method Object java.util.Map$Entry.getValue()>
	//   54  119:astore_3        
		map.remove(obj);
	//   55  120:aload_0         
	//   56  121:getfield        #38  <Field LinkedHashMap map>
	//   57  124:aload_2         
	//   58  125:invokevirtual   #114 <Method Object LinkedHashMap.remove(Object)>
	//   59  128:pop             
		size = size - safeSizeOf(obj, obj1);
	//   60  129:aload_0         
	//   61  130:aload_0         
	//   62  131:getfield        #104 <Field int size>
	//   63  134:aload_0         
	//   64  135:aload_2         
	//   65  136:aload_3         
	//   66  137:invokespecial   #106 <Method int safeSizeOf(Object, Object)>
	//   67  140:isub            
	//   68  141:putfield        #104 <Field int size>
		evictionCount = evictionCount + 1;
	//   69  144:aload_0         
	//   70  145:aload_0         
	//   71  146:getfield        #82  <Field int evictionCount>
	//   72  149:iconst_1        
	//   73  150:iadd            
	//   74  151:putfield        #82  <Field int evictionCount>
		this;
	//   75  154:aload_0         
		JVM INSTR monitorexit ;
	//   76  155:monitorexit     
		entryRemoved(true, obj, obj1, ((Object) (null)));
	//   77  156:aload_0         
	//   78  157:iconst_1        
	//   79  158:aload_2         
	//   80  159:aload_3         
	//   81  160:aconst_null     
	//   82  161:invokevirtual   #102 <Method void entryRemoved(boolean, Object, Object, Object)>
		if(true) goto _L2; else goto _L1
	//   83  164:goto            0
_L1:
	}

	private int createCount;
	private int evictionCount;
	private int hitCount;
	private final LinkedHashMap map;
	private int maxSize;
	private int missCount;
	private int putCount;
	private int size;
}
