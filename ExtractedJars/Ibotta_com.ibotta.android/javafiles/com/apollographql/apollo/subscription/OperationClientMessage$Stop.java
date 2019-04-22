// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.subscription;

import com.apollographql.apollo.api.internal.Utils;

// Referenced classes of package com.apollographql.apollo.subscription:
//			OperationClientMessage

public static final class OperationClientMessage$Stop extends OperationClientMessage
{

	public final String subscriptionId;

	public OperationClientMessage$Stop(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void OperationClientMessage()>
		subscriptionId = (String)Utils.checkNotNull(((Object) (s)), "subscriptionId == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #15  <String "subscriptionId == null">
	//    5    8:invokestatic    #21  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #23  <Class String>
	//    7   14:putfield        #25  <Field String subscriptionId>
	//    8   17:return          
	}
}
