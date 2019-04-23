// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

public static interface BaseGmsClient$BaseConnectionCallbacks
{

	public abstract void onConnected(Bundle bundle);

	public abstract void onConnectionSuspended(int i);
}
