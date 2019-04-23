// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.ca;

public interface AppMeasurement$OnEventListener
	extends ca
{

	public abstract void onEvent(String s, String s1, Bundle bundle, long l);
}
