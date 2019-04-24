// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.exception.ApolloCanceledException;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloHttpException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloParseException;
import com.apollographql.apollo.internal.util.Cancelable;
import okhttp3.Response;

public interface ApolloCall
	extends Cancelable
{
	public static abstract class Callback
	{

		public void onCanceledError(ApolloCanceledException apollocanceledexception)
		{
			onFailure(((ApolloException) (apollocanceledexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method void onFailure(ApolloException)>
		//    3    5:return          
		}

		public abstract void onFailure(ApolloException apolloexception);

		public void onHttpError(ApolloHttpException apollohttpexception)
		{
			onFailure(((ApolloException) (apollohttpexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method void onFailure(ApolloException)>
			apollohttpexception = ((ApolloHttpException) (apollohttpexception.rawResponse()));
		//    3    5:aload_1         
		//    4    6:invokevirtual   #29  <Method Response ApolloHttpException.rawResponse()>
		//    5    9:astore_1        
			if(apollohttpexception != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          18
				((Response) (apollohttpexception)).close();
		//    8   14:aload_1         
		//    9   15:invokevirtual   #34  <Method void Response.close()>
		//   10   18:return          
		}

		public void onNetworkError(ApolloNetworkException apollonetworkexception)
		{
			onFailure(((ApolloException) (apollonetworkexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method void onFailure(ApolloException)>
		//    3    5:return          
		}

		public void onParseError(ApolloParseException apolloparseexception)
		{
			onFailure(((ApolloException) (apolloparseexception)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #20  <Method void onFailure(ApolloException)>
		//    3    5:return          
		}

		public abstract void onResponse(com.apollographql.apollo.api.Response response);

		public void onStatusEvent(StatusEvent statusevent)
		{
		//    0    0:return          
		}

		public Callback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	public static final class StatusEvent extends Enum
	{

		public static StatusEvent valueOf(String s)
		{
			return (StatusEvent)Enum.valueOf(com/apollographql/apollo/ApolloCall$StatusEvent, s);
		//    0    0:ldc1            #2   <Class ApolloCall$StatusEvent>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ApolloCall$StatusEvent>
		//    4    9:areturn         
		}

		public static StatusEvent[] values()
		{
			return (StatusEvent[])((StatusEvent []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field ApolloCall$StatusEvent[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.apollographql.apollo.ApolloCall$StatusEvent_3B_.clone()>
		//    2    6:checkcast       #46  <Class ApolloCall$StatusEvent[]>
		//    3    9:areturn         
		}

		private static final StatusEvent $VALUES[];
		public static final StatusEvent COMPLETED;
		public static final StatusEvent FETCH_CACHE;
		public static final StatusEvent FETCH_NETWORK;
		public static final StatusEvent SCHEDULED;

		static 
		{
			SCHEDULED = new StatusEvent("SCHEDULED", 0);
		//    0    0:new             #2   <Class ApolloCall$StatusEvent>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "SCHEDULED">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void ApolloCall$StatusEvent(String, int)>
		//    5   10:putstatic       #24  <Field ApolloCall$StatusEvent SCHEDULED>
			FETCH_CACHE = new StatusEvent("FETCH_CACHE", 1);
		//    6   13:new             #2   <Class ApolloCall$StatusEvent>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "FETCH_CACHE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void ApolloCall$StatusEvent(String, int)>
		//   11   23:putstatic       #27  <Field ApolloCall$StatusEvent FETCH_CACHE>
			FETCH_NETWORK = new StatusEvent("FETCH_NETWORK", 2);
		//   12   26:new             #2   <Class ApolloCall$StatusEvent>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "FETCH_NETWORK">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void ApolloCall$StatusEvent(String, int)>
		//   17   36:putstatic       #30  <Field ApolloCall$StatusEvent FETCH_NETWORK>
			COMPLETED = new StatusEvent("COMPLETED", 3);
		//   18   39:new             #2   <Class ApolloCall$StatusEvent>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "COMPLETED">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void ApolloCall$StatusEvent(String, int)>
		//   23   49:putstatic       #33  <Field ApolloCall$StatusEvent COMPLETED>
			$VALUES = (new StatusEvent[] {
				SCHEDULED, FETCH_CACHE, FETCH_NETWORK, COMPLETED
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       StatusEvent[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field ApolloCall$StatusEvent SCHEDULED>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field ApolloCall$StatusEvent FETCH_CACHE>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field ApolloCall$StatusEvent FETCH_NETWORK>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field ApolloCall$StatusEvent COMPLETED>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field ApolloCall$StatusEvent[] $VALUES>
		//*  43   83:return          
		}

		private StatusEvent(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public abstract ApolloCall cacheHeaders(CacheHeaders cacheheaders);

	public abstract void cancel();

	public abstract ApolloCall clone();

	public abstract void enqueue(Callback callback);

	public abstract Operation operation();
}