// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzcy;

// Referenced classes of package com.google.android.gms.measurement:
//			AppMeasurement

public static interface AppMeasurement$OnEventListener
	extends zzcy
{

	public abstract void onEvent(String s, String s1, Bundle bundle, long l);
}
