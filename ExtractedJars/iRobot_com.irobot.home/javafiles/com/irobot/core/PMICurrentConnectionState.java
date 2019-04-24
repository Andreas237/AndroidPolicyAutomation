// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public abstract class PMICurrentConnectionState
{

	public PMICurrentConnectionState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:return          
	}

	public static final String CONNECTED_LOCALLY = "connectedlocal";
	public static final String CONNECTED_REMOTELY = "connectedremote";
	public static final String CONNECTING = "connecting";
	public static final String CONNECTION_STATE = "state";
	public static final String CURRENT_CONNECTION_ID = "currentConnectionState";
	public static final String DISCONNECTED = "disconnected";
	public static final String ERROR = "error";
	public static final String REMOTE_MISSING = "remotemissing";
}
