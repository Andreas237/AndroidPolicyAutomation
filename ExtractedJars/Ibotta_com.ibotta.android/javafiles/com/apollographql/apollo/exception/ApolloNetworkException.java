// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.exception;


// Referenced classes of package com.apollographql.apollo.exception:
//			ApolloException

public final class ApolloNetworkException extends ApolloException
{

	public ApolloNetworkException(String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void ApolloException(String)>
	//    3    5:return          
	}

	public ApolloNetworkException(String s, Throwable throwable)
	{
		super(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void ApolloException(String, Throwable)>
	//    4    6:return          
	}
}
