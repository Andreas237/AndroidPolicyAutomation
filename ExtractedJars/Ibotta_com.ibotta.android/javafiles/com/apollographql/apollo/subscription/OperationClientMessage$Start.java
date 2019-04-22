// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.subscription;

import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.Utils;
import com.apollographql.apollo.response.ScalarTypeAdapters;

// Referenced classes of package com.apollographql.apollo.subscription:
//			OperationClientMessage

public static final class OperationClientMessage$Start extends OperationClientMessage
{

	private final ScalarTypeAdapters scalarTypeAdapters;
	public final Subscription subscription;
	public final String subscriptionId;

	public OperationClientMessage$Start(String s, Subscription subscription1, ScalarTypeAdapters scalartypeadapters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void OperationClientMessage()>
		subscriptionId = (String)Utils.checkNotNull(((Object) (s)), "subscriptionId == null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #20  <String "subscriptionId == null">
	//    5    8:invokestatic    #26  <Method Object Utils.checkNotNull(Object, Object)>
	//    6   11:checkcast       #28  <Class String>
	//    7   14:putfield        #30  <Field String subscriptionId>
		subscription = (Subscription)Utils.checkNotNull(((Object) (subscription1)), "subscription == null");
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:ldc1            #32  <String "subscription == null">
	//   11   21:invokestatic    #26  <Method Object Utils.checkNotNull(Object, Object)>
	//   12   24:checkcast       #34  <Class Subscription>
	//   13   27:putfield        #36  <Field Subscription subscription>
		scalarTypeAdapters = (ScalarTypeAdapters)Utils.checkNotNull(((Object) (scalartypeadapters)), "scalarTypeAdapters == null");
	//   14   30:aload_0         
	//   15   31:aload_3         
	//   16   32:ldc1            #38  <String "scalarTypeAdapters == null">
	//   17   34:invokestatic    #26  <Method Object Utils.checkNotNull(Object, Object)>
	//   18   37:checkcast       #40  <Class ScalarTypeAdapters>
	//   19   40:putfield        #42  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   20   43:return          
	}
}
