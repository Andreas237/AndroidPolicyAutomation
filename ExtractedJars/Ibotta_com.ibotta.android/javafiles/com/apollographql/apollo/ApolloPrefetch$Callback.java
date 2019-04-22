// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import okhttp3.Response;

// Referenced classes of package com.apollographql.apollo:
//			ApolloPrefetch

public static abstract class ApolloPrefetch$Callback
{

	public abstract void onFailure(ApolloException apolloexception);

	public void onHttpError(ApolloHttpException apollohttpexception)
	{
		onFailure(((ApolloException) (apollohttpexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method void onFailure(ApolloException)>
		apollohttpexception = ((ApolloHttpException) (apollohttpexception.rawResponse()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #25  <Method Response ApolloHttpException.rawResponse()>
	//    5    9:astore_1        
		if(apollohttpexception != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          18
			((Response) (apollohttpexception)).close();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #30  <Method void Response.close()>
	//   10   18:return          
	}

	public void onNetworkError(ApolloNetworkException apollonetworkexception)
	{
		onFailure(((ApolloException) (apollonetworkexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method void onFailure(ApolloException)>
	//    3    5:return          
	}

	public abstract void onSuccess();

	public ApolloPrefetch$Callback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
