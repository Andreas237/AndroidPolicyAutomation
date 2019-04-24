// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.util;

import java.util.*;
import org.slf4j.spi.MDCAdapter;

public final class LogbackMDCAdapter
	implements MDCAdapter
{

	public LogbackMDCAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class InheritableThreadLocal>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void InheritableThreadLocal()>
	//    6   12:putfield        #26  <Field InheritableThreadLocal copyOnInheritThreadLocal>
	//    7   15:aload_0         
	//    8   16:new             #28  <Class ThreadLocal>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void ThreadLocal()>
	//   11   23:putfield        #31  <Field ThreadLocal lastOperation>
	//   12   26:return          
	}

	private Map duplicateAndInsertNewMap(Map map)
	{
		Object obj;
		obj = ((Object) (Collections.synchronizedMap(((Map) (new HashMap())))));
	//    0    0:new             #36  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void HashMap()>
	//    3    7:invokestatic    #42  <Method Map Collections.synchronizedMap(Map)>
	//    4   10:astore_2        
		if(map == null)
			break MISSING_BLOCK_LABEL_34;
	//    5   11:aload_1         
	//    6   12:ifnull          34
		map;
	//    7   15:aload_1         
		JVM INSTR monitorenter ;
	//    8   16:monitorenter    
		((Map) (obj)).putAll(map);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokeinterface #48  <Method void Map.putAll(Map)>
		map;
	//   12   24:aload_1         
		JVM INSTR monitorexit ;
	//   13   25:monitorexit     
		break MISSING_BLOCK_LABEL_34;
	//   14   26:goto            34
		obj;
	//   15   29:astore_2        
		map;
	//   16   30:aload_1         
		JVM INSTR monitorexit ;
	//   17   31:monitorexit     
		throw obj;
	//   18   32:aload_2         
	//   19   33:athrow          
		copyOnInheritThreadLocal.set(obj);
	//   20   34:aload_0         
	//   21   35:getfield        #26  <Field InheritableThreadLocal copyOnInheritThreadLocal>
	//   22   38:aload_2         
	//   23   39:invokevirtual   #52  <Method void InheritableThreadLocal.set(Object)>
		return ((Map) (obj));
	//   24   42:aload_2         
	//   25   43:areturn         
	}

	private Integer getAndSetLastOperation(int i)
	{
		Integer integer = (Integer)lastOperation.get();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ThreadLocal lastOperation>
	//    2    4:invokevirtual   #60  <Method Object ThreadLocal.get()>
	//    3    7:checkcast       #62  <Class Integer>
	//    4   10:astore_2        
		lastOperation.set(((Object) (Integer.valueOf(i))));
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field ThreadLocal lastOperation>
	//    7   15:iload_1         
	//    8   16:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//    9   19:invokevirtual   #66  <Method void ThreadLocal.set(Object)>
		return integer;
	//   10   22:aload_2         
	//   11   23:areturn         
	}

	private boolean wasLastOpReadOrNull(Integer integer)
	{
		return integer == null || integer.intValue() == 2;
	//    0    0:aload_1         
	//    1    1:ifnull          17
	//    2    4:aload_1         
	//    3    5:invokevirtual   #72  <Method int Integer.intValue()>
	//    4    8:iconst_2        
	//    5    9:icmpne          15
	//    6   12:goto            17
	//    7   15:iconst_0        
	//    8   16:ireturn         
	//    9   17:iconst_1        
	//   10   18:ireturn         
	}

	public void clear()
	{
		lastOperation.set(((Object) (Integer.valueOf(1))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ThreadLocal lastOperation>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #66  <Method void ThreadLocal.set(Object)>
		copyOnInheritThreadLocal.remove();
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field InheritableThreadLocal copyOnInheritThreadLocal>
	//    7   15:invokevirtual   #76  <Method void InheritableThreadLocal.remove()>
	//    8   18:return          
	}

	public String get(String s)
	{
		Map map = getPropertyMap();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method Map getPropertyMap()>
	//    2    4:astore_2        
		if(map != null && s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:ifnull          24
			return (String)map.get(((Object) (s)));
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokeinterface #84  <Method Object Map.get(Object)>
	//   10   20:checkcast       #86  <Class String>
	//   11   23:areturn         
		else
			return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
	}

	public Map getCopyOfContextMap()
	{
		lastOperation.set(((Object) (Integer.valueOf(2))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ThreadLocal lastOperation>
	//    2    4:iconst_2        
	//    3    5:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #66  <Method void ThreadLocal.set(Object)>
		Map map = (Map)copyOnInheritThreadLocal.get();
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field InheritableThreadLocal copyOnInheritThreadLocal>
	//    7   15:invokevirtual   #88  <Method Object InheritableThreadLocal.get()>
	//    8   18:checkcast       #44  <Class Map>
	//    9   21:astore_1        
		if(map == null)
	//*  10   22:aload_1         
	//*  11   23:ifnonnull       28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		else
			return ((Map) (new HashMap(map)));
	//   14   28:new             #36  <Class HashMap>
	//   15   31:dup             
	//   16   32:aload_1         
	//   17   33:invokespecial   #90  <Method void HashMap(Map)>
	//   18   36:areturn         
	}

	public Set getKeys()
	{
		Map map = getPropertyMap();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method Map getPropertyMap()>
	//    2    4:astore_1        
		if(map != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return map.keySet();
	//    5    9:aload_1         
	//    6   10:invokeinterface #95  <Method Set Map.keySet()>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	public Map getPropertyMap()
	{
		lastOperation.set(((Object) (Integer.valueOf(2))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ThreadLocal lastOperation>
	//    2    4:iconst_2        
	//    3    5:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #66  <Method void ThreadLocal.set(Object)>
		return (Map)copyOnInheritThreadLocal.get();
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field InheritableThreadLocal copyOnInheritThreadLocal>
	//    7   15:invokevirtual   #88  <Method Object InheritableThreadLocal.get()>
	//    8   18:checkcast       #44  <Class Map>
	//    9   21:areturn         
	}

	public void put(String s, String s1)
	{
		Map map;
label0:
		{
			if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
				throw new IllegalArgumentException("key cannot be null");
	//    2    4:new             #101 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #103 <String "key cannot be null">
	//    5   10:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
			Map map1 = (Map)copyOnInheritThreadLocal.get();
	//    7   14:aload_0         
	//    8   15:getfield        #26  <Field InheritableThreadLocal copyOnInheritThreadLocal>
	//    9   18:invokevirtual   #88  <Method Object InheritableThreadLocal.get()>
	//   10   21:checkcast       #44  <Class Map>
	//   11   24:astore          4
			if(!wasLastOpReadOrNull(getAndSetLastOperation(1)))
	//*  12   26:aload_0         
	//*  13   27:aload_0         
	//*  14   28:iconst_1        
	//*  15   29:invokespecial   #108 <Method Integer getAndSetLastOperation(int)>
	//*  16   32:invokespecial   #110 <Method boolean wasLastOpReadOrNull(Integer)>
	//*  17   35:ifne            46
			{
				map = map1;
	//   18   38:aload           4
	//   19   40:astore_3        
				if(map1 != null)
					break label0;
	//   20   41:aload           4
	//   21   43:ifnonnull       53
			}
			map = duplicateAndInsertNewMap(map1);
	//   22   46:aload_0         
	//   23   47:aload           4
	//   24   49:invokespecial   #112 <Method Map duplicateAndInsertNewMap(Map)>
	//   25   52:astore_3        
		}
		map.put(((Object) (s)), ((Object) (s1)));
	//   26   53:aload_3         
	//   27   54:aload_1         
	//   28   55:aload_2         
	//   29   56:invokeinterface #115 <Method Object Map.put(Object, Object)>
	//   30   61:pop             
	//   31   62:return          
	}

	public void remove(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Map map1 = (Map)copyOnInheritThreadLocal.get();
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field InheritableThreadLocal copyOnInheritThreadLocal>
	//    5    9:invokevirtual   #88  <Method Object InheritableThreadLocal.get()>
	//    6   12:checkcast       #44  <Class Map>
	//    7   15:astore_3        
		if(map1 == null)
	//*   8   16:aload_3         
	//*   9   17:ifnonnull       21
			return;
	//   10   20:return          
		Map map = map1;
	//   11   21:aload_3         
	//   12   22:astore_2        
		if(wasLastOpReadOrNull(getAndSetLastOperation(1)))
	//*  13   23:aload_0         
	//*  14   24:aload_0         
	//*  15   25:iconst_1        
	//*  16   26:invokespecial   #108 <Method Integer getAndSetLastOperation(int)>
	//*  17   29:invokespecial   #110 <Method boolean wasLastOpReadOrNull(Integer)>
	//*  18   32:ifeq            41
			map = duplicateAndInsertNewMap(map1);
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:invokespecial   #112 <Method Map duplicateAndInsertNewMap(Map)>
	//   22   40:astore_2        
		map.remove(((Object) (s)));
	//   23   41:aload_2         
	//   24   42:aload_1         
	//   25   43:invokeinterface #117 <Method Object Map.remove(Object)>
	//   26   48:pop             
	//   27   49:return          
	}

	public void setContextMap(Map map)
	{
		lastOperation.set(((Object) (Integer.valueOf(1))));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field ThreadLocal lastOperation>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #66  <Method void ThreadLocal.set(Object)>
		Map map1 = Collections.synchronizedMap(((Map) (new HashMap())));
	//    5   11:new             #36  <Class HashMap>
	//    6   14:dup             
	//    7   15:invokespecial   #37  <Method void HashMap()>
	//    8   18:invokestatic    #42  <Method Map Collections.synchronizedMap(Map)>
	//    9   21:astore_2        
		map1.putAll(map);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokeinterface #48  <Method void Map.putAll(Map)>
		copyOnInheritThreadLocal.set(((Object) (map1)));
	//   13   29:aload_0         
	//   14   30:getfield        #26  <Field InheritableThreadLocal copyOnInheritThreadLocal>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #52  <Method void InheritableThreadLocal.set(Object)>
	//   17   37:return          
	}

	private static final int READ_OPERATION = 2;
	private static final int WRITE_OPERATION = 1;
	final InheritableThreadLocal copyOnInheritThreadLocal = new InheritableThreadLocal();
	final ThreadLocal lastOperation = new ThreadLocal();
}
