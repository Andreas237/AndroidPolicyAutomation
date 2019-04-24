// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.cast:
//			Cast, ApplicationMetadata

public static interface Cast$ApplicationConnectionResult
	extends Result
{

	public abstract ApplicationMetadata getApplicationMetadata();

	public abstract String getApplicationStatus();

	public abstract String getSessionId();

	public abstract boolean getWasLaunched();
}
