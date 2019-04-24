// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.zzr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.api:
//			Api

public static interface Api$zze
	extends Api$zzb
{

	public abstract void disconnect();

	public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

	public abstract boolean isConnected();

	public abstract boolean isConnecting();

	public abstract void zza(com.google.android.gms.common.internal.zzf$zzf zzf$zzf);

	public abstract void zza(zzr zzr, Set set);

	public abstract boolean zzrd();

	public abstract boolean zzrr();

	public abstract Intent zzrs();

	public abstract boolean zzvh();

	public abstract IBinder zzvi();
}
