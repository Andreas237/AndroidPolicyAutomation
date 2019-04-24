// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.common.internal:
//			PendingResultUtil

public static interface PendingResultUtil$StatusConverter
{

	public abstract ApiException convert(Status status);
}
