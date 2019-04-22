// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

public interface MediationAdRequest
{

	public abstract Date getBirthday();

	public abstract int getGender();

	public abstract Set getKeywords();

	public abstract Location getLocation();

	public abstract boolean isDesignedForFamilies();

	public abstract boolean isTesting();

	public abstract int taggedForChildDirectedTreatment();

	public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
	public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
	public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
}
