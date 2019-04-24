// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

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
	//*   6    8:ifge            63
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #46  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #47  <Method void StringBuilder()>
	//   10   18:astore          4
			stringbuilder.append("Negative size: ");
	//   11   20:aload           4
	//   12   22:ldc1            #49  <String "Negative size: ">
	//   13   24:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			stringbuilder.append(obj);
	//   15   28:aload           4
	//   16   30:aload_1         
	//   17   31:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//   18   34:pop             
			stringbuilder.append("=");
	//   19   35:aload           4
	//   20   37:ldc1            #58  <String "=">
	//   21   39:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append(obj1);
	//   23   43:aload           4
	//   24   45:aload_2         
	//   25   46:invokevirtual   #56  <Method StringBuilder StringBuilder.append(Object)>
	//   26   49:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   27   50:new             #60  <Class IllegalStateException>
	//   28   53:dup             
	//   29   54:aload           4
	//   30   56:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   31   59:invokespecial   #65  <Method void IllegalStateException(String)>
	//   32   62:athrow          
		} else
		{
			return i;
	//   33   63:iload_3         
	//   34   64:ireturn         
		}
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
	//*  39   62:ifnonnull       67
			return ((Object) (null));
	//   40   65:aconst_null     
	//   41   66:areturn         
		this;
	//   42   67:aload_0         
		JVM INSTR monitorenter ;
	//   43   68:monitorenter    
		Object obj2;
		createCount = createCount + 1;
	//   44   69:aload_0         
	//   45   70:aload_0         
	//   46   71:getfield        #73  <Field int createCount>
	//   47   74:iconst_1        
	//   48   75:iadd            
	//   49   76:putfield        #73  <Field int createCount>
		obj2 = map.put(obj, obj1);
	//   50   79:aload_0         
	//   51   80:getfield        #38  <Field LinkedHashMap map>
	//   52   83:aload_1         
	//   53   84:aload_2         
	//   54   85:invokevirtual   #100 <Method Object LinkedHashMap.put(Object, Object)>
	//   55   88:astore_3        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_106;
	//   56   89:aload_3         
	//   57   90:ifnull          106
		map.put(obj, obj2);
	//   58   93:aload_0         
	//   59   94:getfield        #38  <Field LinkedHashMap map>
	//   60   97:aload_1         
	//   61   98:aload_3         
	//   62   99:invokevirtual   #100 <Method Object LinkedHashMap.put(Object, Object)>
	//   63  102:pop             
		break MISSING_BLOCK_LABEL_121;
	//   64  103:goto            121
		size = size + safeSizeOf(obj, obj1);
	//   65  106:aload_0         
	//   66  107:aload_0         
	//   67  108:getfield        #102 <Field int size>
	//   68  111:aload_0         
	//   69  112:aload_1         
	//   70  113:aload_2         
	//   71  114:invokespecial   #104 <Method int safeSizeOf(Object, Object)>
	//   72  117:iadd            
	//   73  118:putfield        #102 <Field int size>
		this;
	//   74  121:aload_0         
		JVM INSTR monitorexit ;
	//   75  122:monitorexit     
		if(obj2 != null)
	//*  76  123:aload_3         
	//*  77  124:ifnull          137
		{
			entryRemoved(false, obj, obj1, obj2);
	//   78  127:aload_0         
	//   79  128:iconst_0        
	//   80  129:aload_1         
	//   81  130:aload_2         
	//   82  131:aload_3         
	//   83  132:invokevirtual   #106 <Method void entryRemoved(boolean, Object, Object, Object)>
			return obj2;
	//   84  135:aload_3         
	//   85  136:areturn         
		} else
		{
			trimToSize(maxSize);
	//   86  137:aload_0         
	//   87  138:aload_0         
	//   88  139:getfield        #30  <Field int maxSize>
	//   89  142:invokevirtual   #80  <Method void trimToSize(int)>
			return obj1;
	//   90  145:aload_2         
	//   91  146:areturn         
		}
		obj;
	//   92  147:astore_1        
		this;
	//   93  148:aload_0         
		JVM INSTR monitorexit ;
	//   94  149:monitorexit     
		throw obj;
	//   95  150:aload_1         
	//   96  151:athrow          
		obj;
	//   97  152:astore_1        
		this;
	//   98  153:aload_0         
		JVM INSTR monitorexit ;
	//   99  154:monitorexit     
		throw obj;
	//  100  155:aload_1         
	//  101  156:athrow          
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
	//*   1    1:ifnull          96
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       11
			break MISSING_BLOCK_LABEL_96;
	//    4    8:goto            96
		this;
	//    5   11:aload_0         
		JVM INSTR monitorenter ;
	//    6   12:monitorenter    
		Object obj2;
		putCount = putCount + 1;
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #108 <Field int putCount>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:putfield        #108 <Field int putCount>
		size = size + safeSizeOf(obj, obj1);
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #102 <Field int size>
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:invokespecial   #104 <Method int safeSizeOf(Object, Object)>
	//   20   34:iadd            
	//   21   35:putfield        #102 <Field int size>
		obj2 = map.put(obj, obj1);
	//   22   38:aload_0         
	//   23   39:getfield        #38  <Field LinkedHashMap map>
	//   24   42:aload_1         
	//   25   43:aload_2         
	//   26   44:invokevirtual   #100 <Method Object LinkedHashMap.put(Object, Object)>
	//   27   47:astore_3        
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_67;
	//   28   48:aload_3         
	//   29   49:ifnull          67
		size = size - safeSizeOf(obj, obj2);
	//   30   52:aload_0         
	//   31   53:aload_0         
	//   32   54:getfield        #102 <Field int size>
	//   33   57:aload_0         
	//   34   58:aload_1         
	//   35   59:aload_3         
	//   36   60:invokespecial   #104 <Method int safeSizeOf(Object, Object)>
	//   37   63:isub            
	//   38   64:putfield        #102 <Field int size>
		this;
	//   39   67:aload_0         
		JVM INSTR monitorexit ;
	//   40   68:monitorexit     
		if(obj2 != null)
	//*  41   69:aload_3         
	//*  42   70:ifnull          81
			entryRemoved(false, obj, obj2, obj1);
	//   43   73:aload_0         
	//   44   74:iconst_0        
	//   45   75:aload_1         
	//   46   76:aload_3         
	//   47   77:aload_2         
	//   48   78:invokevirtual   #106 <Method void entryRemoved(boolean, Object, Object, Object)>
		trimToSize(maxSize);
	//   49   81:aload_0         
	//   50   82:aload_0         
	//   51   83:getfield        #30  <Field int maxSize>
	//   52   86:invokevirtual   #80  <Method void trimToSize(int)>
		return obj2;
	//   53   89:aload_3         
	//   54   90:areturn         
		obj;
	//   55   91:astore_1        
		this;
	//   56   92:aload_0         
		JVM INSTR monitorexit ;
	//   57   93:monitorexit     
		throw obj;
	//   58   94:aload_1         
	//   59   95:athrow          
		throw new NullPointerException("key == null || value == null");
	//   60   96:new             #85  <Class NullPointerException>
	//   61   99:dup             
	//   62  100:ldc1            #110 <String "key == null || value == null">
	//   63  102:invokespecial   #88  <Method void NullPointerException(String)>
	//   64  105:athrow          
	}

	public final int putCount()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = putCount;
	//    2    2:aload_0         
	//    3    3:getfield        #108 <Field int putCount>
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
	//   18   31:getfield        #102 <Field int size>
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:aload_2         
	//   22   37:invokespecial   #104 <Method int safeSizeOf(Object, Object)>
	//   23   40:isub            
	//   24   41:putfield        #102 <Field int size>
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
	//   34   55:invokevirtual   #106 <Method void entryRemoved(boolean, Object, Object, Object)>
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
	//    3    3:getfield        #102 <Field int size>
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
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = hitCount + missCount;
	//    2    2:aload_0         
	//    3    3:getfield        #92  <Field int hitCount>
	//    4    6:aload_0         
	//    5    7:getfield        #94  <Field int missCount>
	//    6   10:iadd            
	//    7   11:istore_1        
		if(i == 0) goto _L2; else goto _L1
	//    8   12:iload_1         
	//    9   13:ifeq            88
_L1:
		i = (100 * hitCount) / i;
	//   10   16:bipush          100
	//   11   18:aload_0         
	//   12   19:getfield        #92  <Field int hitCount>
	//   13   22:imul            
	//   14   23:iload_1         
	//   15   24:idiv            
	//   16   25:istore_1        
	//*  17   26:goto            29
_L4:
		String s = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] {
			Integer.valueOf(maxSize), Integer.valueOf(hitCount), Integer.valueOf(missCount), Integer.valueOf(i)
		});
	//   18   29:getstatic       #127 <Field Locale Locale.US>
	//   19   32:ldc1            #129 <String "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]">
	//   20   34:iconst_4        
	//   21   35:anewarray       Object[]
	//   22   38:dup             
	//   23   39:iconst_0        
	//   24   40:aload_0         
	//   25   41:getfield        #30  <Field int maxSize>
	//   26   44:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   27   47:aastore         
	//   28   48:dup             
	//   29   49:iconst_1        
	//   30   50:aload_0         
	//   31   51:getfield        #92  <Field int hitCount>
	//   32   54:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   33   57:aastore         
	//   34   58:dup             
	//   35   59:iconst_2        
	//   36   60:aload_0         
	//   37   61:getfield        #94  <Field int missCount>
	//   38   64:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   39   67:aastore         
	//   40   68:dup             
	//   41   69:iconst_3        
	//   42   70:iload_1         
	//   43   71:invokestatic    #135 <Method Integer Integer.valueOf(int)>
	//   44   74:aastore         
	//   45   75:invokestatic    #141 <Method String String.format(Locale, String, Object[])>
	//   46   78:astore_2        
		this;
	//   47   79:aload_0         
		JVM INSTR monitorexit ;
	//   48   80:monitorexit     
		return s;
	//   49   81:aload_2         
	//   50   82:areturn         
		Exception exception;
		exception;
	//   51   83:astore_2        
	//*  52   84:aload_0         
		throw exception;
	//   53   85:monitorexit     
	//   54   86:aload_2         
	//   55   87:athrow          
_L2:
		i = 0;
	//   56   88:iconst_0        
	//   57   89:istore_1        
		if(true) goto _L4; else goto _L3
	//   58   90:goto            29
_L3:
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
	//*   3    3:getfield        #102 <Field int size>
	//*   4    6:iflt            135
	//*   5    9:aload_0         
	//*   6   10:getfield        #38  <Field LinkedHashMap map>
	//*   7   13:invokevirtual   #145 <Method boolean LinkedHashMap.isEmpty()>
	//*   8   16:ifeq            29
	//*   9   19:aload_0         
	//*  10   20:getfield        #102 <Field int size>
	//*  11   23:ifeq            29
			break MISSING_BLOCK_LABEL_135;
	//   12   26:goto            135
		if(size <= i || map.isEmpty())
	//*  13   29:aload_0         
	//*  14   30:getfield        #102 <Field int size>
	//*  15   33:iload_1         
	//*  16   34:icmple          132
	//*  17   37:aload_0         
	//*  18   38:getfield        #38  <Field LinkedHashMap map>
	//*  19   41:invokevirtual   #145 <Method boolean LinkedHashMap.isEmpty()>
	//*  20   44:ifeq            50
			break; /* Loop/switch isn't completed */
	//   21   47:goto            132
		Object obj;
		Object obj1;
		obj1 = ((Object) ((java.util.Map.Entry)map.entrySet().iterator().next()));
	//   22   50:aload_0         
	//   23   51:getfield        #38  <Field LinkedHashMap map>
	//   24   54:invokevirtual   #149 <Method Set LinkedHashMap.entrySet()>
	//   25   57:invokeinterface #155 <Method Iterator Set.iterator()>
	//   26   62:invokeinterface #161 <Method Object Iterator.next()>
	//   27   67:checkcast       #163 <Class java.util.Map$Entry>
	//   28   70:astore_3        
		obj = ((java.util.Map.Entry) (obj1)).getKey();
	//   29   71:aload_3         
	//   30   72:invokeinterface #166 <Method Object java.util.Map$Entry.getKey()>
	//   31   77:astore_2        
		obj1 = ((java.util.Map.Entry) (obj1)).getValue();
	//   32   78:aload_3         
	//   33   79:invokeinterface #169 <Method Object java.util.Map$Entry.getValue()>
	//   34   84:astore_3        
		map.remove(obj);
	//   35   85:aload_0         
	//   36   86:getfield        #38  <Field LinkedHashMap map>
	//   37   89:aload_2         
	//   38   90:invokevirtual   #114 <Method Object LinkedHashMap.remove(Object)>
	//   39   93:pop             
		size = size - safeSizeOf(obj, obj1);
	//   40   94:aload_0         
	//   41   95:aload_0         
	//   42   96:getfield        #102 <Field int size>
	//   43   99:aload_0         
	//   44  100:aload_2         
	//   45  101:aload_3         
	//   46  102:invokespecial   #104 <Method int safeSizeOf(Object, Object)>
	//   47  105:isub            
	//   48  106:putfield        #102 <Field int size>
		evictionCount = evictionCount + 1;
	//   49  109:aload_0         
	//   50  110:aload_0         
	//   51  111:getfield        #82  <Field int evictionCount>
	//   52  114:iconst_1        
	//   53  115:iadd            
	//   54  116:putfield        #82  <Field int evictionCount>
		this;
	//   55  119:aload_0         
		JVM INSTR monitorexit ;
	//   56  120:monitorexit     
		entryRemoved(true, obj, obj1, ((Object) (null)));
	//   57  121:aload_0         
	//   58  122:iconst_1        
	//   59  123:aload_2         
	//   60  124:aload_3         
	//   61  125:aconst_null     
	//   62  126:invokevirtual   #106 <Method void entryRemoved(boolean, Object, Object, Object)>
		if(true) goto _L2; else goto _L1
	//   63  129:goto            0
_L1:
		this;
	//   64  132:aload_0         
		JVM INSTR monitorexit ;
	//   65  133:monitorexit     
		return;
	//   66  134:return          
		StringBuilder stringbuilder = new StringBuilder();
	//   67  135:new             #46  <Class StringBuilder>
	//   68  138:dup             
	//   69  139:invokespecial   #47  <Method void StringBuilder()>
	//   70  142:astore_2        
		stringbuilder.append(((Object)this).getClass().getName());
	//   71  143:aload_2         
	//   72  144:aload_0         
	//   73  145:invokevirtual   #173 <Method Class Object.getClass()>
	//   74  148:invokevirtual   #178 <Method String Class.getName()>
	//   75  151:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   76  154:pop             
		stringbuilder.append(".sizeOf() is reporting inconsistent results!");
	//   77  155:aload_2         
	//   78  156:ldc1            #180 <String ".sizeOf() is reporting inconsistent results!">
	//   79  158:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   80  161:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   81  162:new             #60  <Class IllegalStateException>
	//   82  165:dup             
	//   83  166:aload_2         
	//   84  167:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   85  170:invokespecial   #65  <Method void IllegalStateException(String)>
	//   86  173:athrow          
		Exception exception;
		exception;
	//   87  174:astore_2        
		this;
	//   88  175:aload_0         
		JVM INSTR monitorexit ;
	//   89  176:monitorexit     
		throw exception;
	//   90  177:aload_2         
	//   91  178:athrow          
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
