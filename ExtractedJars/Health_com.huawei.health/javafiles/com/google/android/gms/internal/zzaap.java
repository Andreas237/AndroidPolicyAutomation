// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class zzaap extends GoogleApiClient
{

	public zzaap(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void GoogleApiClient()>
		zzaBj = new UnsupportedOperationException(s);
	//    2    4:aload_0         
	//    3    5:new             #13  <Class UnsupportedOperationException>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #15  <Method void UnsupportedOperationException(String)>
	//    7   13:putfield        #17  <Field UnsupportedOperationException zzaBj>
	//    8   16:return          
	}

	public ConnectionResult blockingConnect()
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public PendingResult clearDefaultAccountAndReconnect()
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public void connect()
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public void disconnect()
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public ConnectionResult getConnectionResult(Api api)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public boolean hasConnectedApi(Api api)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public boolean isConnected()
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public boolean isConnecting()
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public void reconnect()
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public void stopAutoManage(FragmentActivity fragmentactivity)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	public void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		throw zzaBj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field UnsupportedOperationException zzaBj>
	//    2    4:athrow          
	}

	private final UnsupportedOperationException zzaBj;
}
