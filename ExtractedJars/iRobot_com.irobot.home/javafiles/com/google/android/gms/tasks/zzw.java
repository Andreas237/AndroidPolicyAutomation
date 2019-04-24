// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.*;

// Referenced classes of package com.google.android.gms.tasks:
//			Continuation, Task

final class zzw
	implements Continuation
{

	zzw(Collection collection)
	{
		zzae = collection;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field Collection zzae>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final Object then(Task task)
	{
		if(zzae.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Collection zzae>
	//*   2    4:invokeinterface #25  <Method int Collection.size()>
	//*   3    9:ifne            16
			return ((Object) (Collections.emptyList()));
	//    4   12:invokestatic    #31  <Method List Collections.emptyList()>
	//    5   15:areturn         
		task = ((Task) (new ArrayList()));
	//    6   16:new             #33  <Class ArrayList>
	//    7   19:dup             
	//    8   20:invokespecial   #34  <Method void ArrayList()>
	//    9   23:astore_1        
		for(Iterator iterator = zzae.iterator(); iterator.hasNext(); ((List) (task)).add(((Task)iterator.next()).getResult()));
	//   10   24:aload_0         
	//   11   25:getfield        #13  <Field Collection zzae>
	//   12   28:invokeinterface #38  <Method Iterator Collection.iterator()>
	//   13   33:astore_2        
	//   14   34:aload_2         
	//   15   35:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//   16   40:ifeq            65
	//   17   43:aload_1         
	//   18   44:aload_2         
	//   19   45:invokeinterface #48  <Method Object Iterator.next()>
	//   20   50:checkcast       #50  <Class Task>
	//   21   53:invokevirtual   #53  <Method Object Task.getResult()>
	//   22   56:invokeinterface #59  <Method boolean List.add(Object)>
	//   23   61:pop             
	//*  24   62:goto            34
		return ((Object) (task));
	//   25   65:aload_1         
	//   26   66:areturn         
	}

	private final Collection zzae;
}
