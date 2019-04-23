// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.*;

public final class bmv
{

	public bmv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void HashMap()>
	//    6   12:putfield        #16  <Field Map a>
	//    7   15:return          
	}

	public final Map a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Map map;
		if(b == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #20  <Field Map b>
	//*   4    6:ifnonnull       27
			b = Collections.unmodifiableMap(((Map) (new HashMap(a))));
	//    5    9:aload_0         
	//    6   10:new             #13  <Class HashMap>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #16  <Field Map a>
	//   10   18:invokespecial   #23  <Method void HashMap(Map)>
	//   11   21:invokestatic    #29  <Method Map Collections.unmodifiableMap(Map)>
	//   12   24:putfield        #20  <Field Map b>
		map = b;
	//   13   27:aload_0         
	//   14   28:getfield        #20  <Field Map b>
	//   15   31:astore_1        
		this;
	//   16   32:aload_0         
		JVM INSTR monitorexit ;
	//   17   33:monitorexit     
		return map;
	//   18   34:aload_1         
	//   19   35:areturn         
		Exception exception;
		exception;
	//   20   36:astore_1        
	//*  21   37:aload_0         
		throw exception;
	//   22   38:monitorexit     
	//   23   39:aload_1         
	//   24   40:athrow          
	}

	private final Map a = new HashMap();
	private Map b;
}
