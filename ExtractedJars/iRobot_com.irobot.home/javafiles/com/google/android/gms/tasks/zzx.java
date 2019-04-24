// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.*;

// Referenced classes of package com.google.android.gms.tasks:
//			Continuation, Tasks, Task

final class zzx
	implements Continuation
{

	zzx(Collection collection)
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
		task = ((Task) (new ArrayList()));
	//    0    0:new             #21  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void ArrayList()>
	//    3    7:astore_1        
		((List) (task)).addAll(zzae);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field Collection zzae>
	//    7   13:invokeinterface #28  <Method boolean List.addAll(Collection)>
	//    8   18:pop             
		return ((Object) (Tasks.forResult(((Object) (task)))));
	//    9   19:aload_1         
	//   10   20:invokestatic    #34  <Method Task Tasks.forResult(Object)>
	//   11   23:areturn         
	}

	private final Collection zzae;
}
