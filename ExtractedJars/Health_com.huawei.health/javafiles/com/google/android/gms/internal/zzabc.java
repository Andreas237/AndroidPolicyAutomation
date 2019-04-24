// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//			zzabq

public interface zzabc
{
	public static interface zza
	{

		public abstract void zzc(int i, boolean flag);

		public abstract void zzc(ConnectionResult connectionresult);

		public abstract void zzo(Bundle bundle);
	}


	public abstract ConnectionResult blockingConnect();

	public abstract ConnectionResult blockingConnect(long l, TimeUnit timeunit);

	public abstract void connect();

	public abstract void disconnect();

	public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

	public abstract ConnectionResult getConnectionResult(Api api);

	public abstract boolean isConnected();

	public abstract boolean isConnecting();

	public abstract zzaad.zza zza(zzaad.zza zza1);

	public abstract boolean zza(zzabq zzabq);

	public abstract zzaad.zza zzb(zzaad.zza zza1);

	public abstract void zzvM();

	public abstract void zzvn();
}
