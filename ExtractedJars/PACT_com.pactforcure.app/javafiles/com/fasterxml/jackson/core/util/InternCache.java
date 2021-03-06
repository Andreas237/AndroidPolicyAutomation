// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

public final class InternCache extends ConcurrentHashMap
{

	private InternCache()
	{
		super(180, 0.8F, 4);
	//    0    0:aload_0         
	//    1    1:sipush          180
	//    2    4:ldc1            #21  <Float 0.8F>
	//    3    6:iconst_4        
	//    4    7:invokespecial   #24  <Method void ConcurrentHashMap(int, float, int)>
	//    5   10:aload_0         
	//    6   11:new             #26  <Class Object>
	//    7   14:dup             
	//    8   15:invokespecial   #27  <Method void Object()>
	//    9   18:putfield        #29  <Field Object lock>
	//   10   21:return          
	}

	public String intern(String s)
	{
		String s1 = (String)get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method Object get(Object)>
	//    3    5:checkcast       #37  <Class String>
	//    4    8:astore_2        
		if(s1 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          15
			return s1;
	//    7   13:aload_2         
	//    8   14:areturn         
		if(size() >= 180)
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #41  <Method int size()>
	//*  11   19:sipush          180
	//*  12   22:icmplt          48
			synchronized(lock)
	//*  13   25:aload_0         
	//*  14   26:getfield        #29  <Field Object lock>
	//*  15   29:astore_2        
	//*  16   30:aload_2         
	//*  17   31:monitorenter    
			{
				if(size() >= 180)
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #41  <Method int size()>
	//*  20   36:sipush          180
	//*  21   39:icmplt          46
					clear();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #44  <Method void clear()>
			}
	//   24   46:aload_2         
	//   25   47:monitorexit     
		s = s.intern();
	//   26   48:aload_1         
	//   27   49:invokevirtual   #47  <Method String String.intern()>
	//   28   52:astore_1        
		put(((Object) (s)), ((Object) (s)));
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:aload_1         
	//   32   56:invokevirtual   #51  <Method Object put(Object, Object)>
	//   33   59:pop             
		return s;
	//   34   60:aload_1         
	//   35   61:areturn         
		s;
	//   36   62:astore_1        
		obj;
	//   37   63:aload_2         
		JVM INSTR monitorexit ;
	//   38   64:monitorexit     
		throw s;
	//   39   65:aload_1         
	//   40   66:athrow          
	}

	private static final int MAX_ENTRIES = 180;
	public static final InternCache instance = new InternCache();
	private final Object lock = new Object();

	static 
	{
	//    0    0:new             #2   <Class InternCache>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void InternCache()>
	//    3    7:putstatic       #19  <Field InternCache instance>
	//*   4   10:return          
	}
}
