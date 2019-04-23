// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//			Api

public static interface Api$Client
	extends nt
{

	public abstract void connect(com.google.android.gms.common.internal.nt.ConnectionProgressReportCallbacks connectionprogressreportcallbacks);

	public abstract void disconnect();

	public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

	public abstract Feature[] getAvailableFeatures();

	public abstract String getEndpointPackageName();

	public abstract int getMinApkVersion();

	public abstract void getRemoteService(IAccountAccessor iaccountaccessor, Set set);

	public abstract Feature[] getRequiredFeatures();

	public abstract IBinder getServiceBrokerBinder();

	public abstract Intent getSignInIntent();

	public abstract boolean isConnected();

	public abstract boolean isConnecting();

	public abstract void onUserSignOut(com.google.android.gms.common.internal.nt.SignOutCallbacks signoutcallbacks);

	public abstract boolean providesSignIn();

	public abstract boolean requiresAccount();

	public abstract boolean requiresGooglePlayServices();

	public abstract boolean requiresSignIn();
}
