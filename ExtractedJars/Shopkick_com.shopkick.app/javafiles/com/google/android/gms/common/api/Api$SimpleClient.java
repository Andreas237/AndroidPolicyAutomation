// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

// Referenced classes of package com.google.android.gms.common.api:
//			Api

public static interface Api$SimpleClient
	extends Api.AnyClient
{

	public abstract IInterface createServiceInterface(IBinder ibinder);

	public abstract Context getContext();

	public abstract String getServiceDescriptor();

	public abstract String getStartServiceAction();

	public abstract void setState(int i, IInterface iinterface);
}
