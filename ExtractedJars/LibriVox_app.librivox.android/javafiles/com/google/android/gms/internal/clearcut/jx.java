// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import android.os.IInterface;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface jx
	extends IInterface
{

	public abstract void a(Status status);

	public abstract void a(Status status, long l);

	public abstract void a(Status status, zzc zzc);

	public abstract void a(Status status, zze azze[]);

	public abstract void a(DataHolder dataholder);

	public abstract void b(Status status);

	public abstract void b(Status status, long l);

	public abstract void b(Status status, zzc zzc);

	public abstract void c(Status status);
}
