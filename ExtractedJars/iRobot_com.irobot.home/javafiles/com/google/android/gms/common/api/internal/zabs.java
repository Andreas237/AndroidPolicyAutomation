// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			SignInConnectionListener

public interface zabs
{

	public abstract ConnectionResult blockingConnect();

	public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

	public abstract void connect();

	public abstract void disconnect();

	public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

	public abstract BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl);

	public abstract BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl);

	public abstract ConnectionResult getConnectionResult(Api api);

	public abstract boolean isConnected();

	public abstract boolean isConnecting();

	public abstract boolean maybeSignIn(SignInConnectionListener signinconnectionlistener);

	public abstract void maybeSignOut();

	public abstract void zaw();
}
