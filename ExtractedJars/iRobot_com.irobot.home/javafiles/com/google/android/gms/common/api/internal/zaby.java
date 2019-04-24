// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			RemoteCall

final class zaby
	implements RemoteCall
{

	zaby(BiConsumer biconsumer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zake = biconsumer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field BiConsumer zake>
	//    5    9:return          
	}

	public final void accept(Object obj, Object obj1)
	{
		zake.accept(((Object) ((com.google.android.gms.common.api.Api.AnyClient)obj)), ((Object) ((TaskCompletionSource)obj1)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field BiConsumer zake>
	//    2    4:aload_1         
	//    3    5:checkcast       #20  <Class com.google.android.gms.common.api.Api$AnyClient>
	//    4    8:aload_2         
	//    5    9:checkcast       #22  <Class TaskCompletionSource>
	//    6   12:invokeinterface #26  <Method void BiConsumer.accept(Object, Object)>
	//    7   17:return          
	}

	private final BiConsumer zake;
}
