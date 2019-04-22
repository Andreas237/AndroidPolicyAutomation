// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.api.internal.Utils;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.apollographql.apollo.internal.subscription:
//			ApolloSubscriptionException

public class ApolloSubscriptionServerException extends ApolloSubscriptionException
{

	public ApolloSubscriptionServerException(Map map)
	{
		super("Subscription failed");
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "Subscription failed">
	//    2    3:invokespecial   #15  <Method void ApolloSubscriptionException(String)>
		errorPayload = Collections.unmodifiableMap((Map)Utils.checkNotNull(((Object) (map)), "errorPayload == null"));
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:ldc1            #17  <String "errorPayload == null">
	//    6   10:invokestatic    #23  <Method Object Utils.checkNotNull(Object, Object)>
	//    7   13:checkcast       #25  <Class Map>
	//    8   16:invokestatic    #31  <Method Map Collections.unmodifiableMap(Map)>
	//    9   19:putfield        #33  <Field Map errorPayload>
	//   10   22:return          
	}

	public final Map errorPayload;
}
