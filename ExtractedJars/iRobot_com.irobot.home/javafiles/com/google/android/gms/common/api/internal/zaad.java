// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.*;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaab

final class zaad
	implements OnCompleteListener
{

	zaad(zaab zaab1, TaskCompletionSource taskcompletionsource)
	{
		zafm = zaab1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zaab zafm>
		zafn = taskcompletionsource;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field TaskCompletionSource zafn>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void onComplete(Task task)
	{
		zaab.zab(zafm).remove(((Object) (zafn)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zaab zafm>
	//    2    4:invokestatic    #29  <Method Map zaab.zab(zaab)>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field TaskCompletionSource zafn>
	//    5   11:invokeinterface #35  <Method Object Map.remove(Object)>
	//    6   16:pop             
	//    7   17:return          
	}

	private final zaab zafm;
	private final TaskCompletionSource zafn;
}
