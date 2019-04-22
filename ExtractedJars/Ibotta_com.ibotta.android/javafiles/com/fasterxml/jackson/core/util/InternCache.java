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
	//    2    4:ldc1            #22  <Float 0.8F>
	//    3    6:iconst_4        
	//    4    7:invokespecial   #25  <Method void ConcurrentHashMap(int, float, int)>
	//    5   10:aload_0         
	//    6   11:new             #27  <Class Object>
	//    7   14:dup             
	//    8   15:invokespecial   #28  <Method void Object()>
	//    9   18:putfield        #30  <Field Object lock>
	//   10   21:return          
	}

	public String intern(String s)
	{
		String s1 = (String)get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method Object get(Object)>
	//    3    5:checkcast       #38  <Class String>
	//    4    8:astore_2        
		if(s1 != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          15
			return s1;
	//    7   13:aload_2         
	//    8   14:areturn         
		if(size() >= 180)
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #42  <Method int size()>
	//*  11   19:sipush          180
	//*  12   22:icmplt          56
			synchronized(lock)
	//*  13   25:aload_0         
	//*  14   26:getfield        #30  <Field Object lock>
	//*  15   29:astore_2        
	//*  16   30:aload_2         
	//*  17   31:monitorenter    
			{
				if(size() >= 180)
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #42  <Method int size()>
	//*  20   36:sipush          180
	//*  21   39:icmplt          46
					clear();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #45  <Method void clear()>
			}
	//   24   46:aload_2         
	//   25   47:monitorexit     
		break MISSING_BLOCK_LABEL_56;
	//   26   48:goto            56
		s;
	//   27   51:astore_1        
		obj;
	//   28   52:aload_2         
		JVM INSTR monitorexit ;
	//   29   53:monitorexit     
		throw s;
	//   30   54:aload_1         
	//   31   55:athrow          
		s = s.intern();
	//   32   56:aload_1         
	//   33   57:invokevirtual   #48  <Method String String.intern()>
	//   34   60:astore_1        
		put(((Object) (s)), ((Object) (s)));
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:aload_1         
	//   38   64:invokevirtual   #52  <Method Object put(Object, Object)>
	//   39   67:pop             
		return s;
	//   40   68:aload_1         
	//   41   69:areturn         
	}

	public static final InternCache instance = new InternCache();
	private static final long serialVersionUID = 1L;
	private final Object lock = new Object();

	static 
	{
	//    0    0:new             #2   <Class InternCache>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void InternCache()>
	//    3    7:putstatic       #20  <Field InternCache instance>
	//*   4   10:return          
	}
}
