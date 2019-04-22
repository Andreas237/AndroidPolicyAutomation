// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.subscription;

import java.util.Map;

public abstract class OperationServerMessage
{
	public static final class Complete extends OperationServerMessage
	{

		public final String id;
	}

	public static final class ConnectionAcknowledge extends OperationServerMessage
	{

		public ConnectionAcknowledge()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #9   <Method void OperationServerMessage()>
		//    2    4:return          
		}
	}

	public static final class ConnectionError extends OperationServerMessage
	{
	}

	public static final class Data extends OperationServerMessage
	{

		public final String id;
		public final Map payload;
	}

	public static final class Error extends OperationServerMessage
	{

		public final String id;
		public final Map payload;
	}


	OperationServerMessage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}
}
