// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zai

final class zaaf
{

	public zaaf(zai zai)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class TaskCompletionSource>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void TaskCompletionSource()>
	//    6   12:putfield        #20  <Field TaskCompletionSource zafq>
		zafp = zai;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #22  <Field zai zafp>
	//   10   20:return          
	}

	public final TaskCompletionSource zaal()
	{
		return zafq;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field TaskCompletionSource zafq>
	//    2    4:areturn         
	}

	public final zai zak()
	{
		return zafp;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field zai zafp>
	//    2    4:areturn         
	}

	private final zai zafp;
	private final TaskCompletionSource zafq = new TaskCompletionSource();
}
