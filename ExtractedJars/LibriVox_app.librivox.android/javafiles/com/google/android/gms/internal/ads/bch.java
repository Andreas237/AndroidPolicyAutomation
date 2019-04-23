// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class bch
{

	public bch()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void HashMap()>
	//    6   12:putfield        #15  <Field Map a>
	//    7   15:return          
	}

	public final AtomicReference a(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!a.containsKey(((Object) (s))))
	//*   2    2:aload_0         
	//*   3    3:getfield        #15  <Field Map a>
	//*   4    6:aload_1         
	//*   5    7:invokeinterface #23  <Method boolean Map.containsKey(Object)>
	//*   6   12:ifne            35
		{
			AtomicReference atomicreference = new AtomicReference();
	//    7   15:new             #25  <Class AtomicReference>
	//    8   18:dup             
	//    9   19:invokespecial   #26  <Method void AtomicReference()>
	//   10   22:astore_2        
			a.put(((Object) (s)), ((Object) (atomicreference)));
	//   11   23:aload_0         
	//   12   24:getfield        #15  <Field Map a>
	//   13   27:aload_1         
	//   14   28:aload_2         
	//   15   29:invokeinterface #30  <Method Object Map.put(Object, Object)>
	//   16   34:pop             
		}
		this;
	//   17   35:aload_0         
		JVM INSTR monitorexit ;
	//   18   36:monitorexit     
		return (AtomicReference)a.get(((Object) (s)));
	//   19   37:aload_0         
	//   20   38:getfield        #15  <Field Map a>
	//   21   41:aload_1         
	//   22   42:invokeinterface #34  <Method Object Map.get(Object)>
	//   23   47:checkcast       #25  <Class AtomicReference>
	//   24   50:areturn         
		s;
	//   25   51:astore_1        
		this;
	//   26   52:aload_0         
		JVM INSTR monitorexit ;
	//   27   53:monitorexit     
		throw s;
	//   28   54:aload_1         
	//   29   55:athrow          
	}

	private final Map a = new HashMap();
}
