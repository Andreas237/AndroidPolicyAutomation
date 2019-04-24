// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			BaseImplementation

public static interface BaseImplementation$ResultHolder
{

	public abstract void setFailedResult(Status status);

	public abstract void setResult(Object obj);
}
