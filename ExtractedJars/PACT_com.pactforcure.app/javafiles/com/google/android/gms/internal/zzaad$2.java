// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.tasks.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//			zzaad

class zzaad$2
	implements OnCompleteListener
{

	public void onComplete(Task task)
	{
		zzaad.zzb(zzazF).remove(((Object) (zzazG)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzaad zzazF>
	//    2    4:invokestatic    #33  <Method Map zzaad.zzb(zzaad)>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field TaskCompletionSource zzazG>
	//    5   11:invokeinterface #39  <Method Object Map.remove(Object)>
	//    6   16:pop             
	//    7   17:return          
	}

	final zzaad zzazF;
	final TaskCompletionSource zzazG;

	zzaad$2(zzaad zzaad1, TaskCompletionSource taskcompletionsource)
	{
		zzazF = zzaad1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field zzaad zzazF>
		zzazG = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field TaskCompletionSource zzazG>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
