// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.*;
import java.lang.annotation.Annotation;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable:
//			CapabilityInfo

public interface CapabilityApi
{
	public static interface AddLocalCapabilityResult
		extends Result
	{
	}

	public static interface CapabilityFilterType
		extends Annotation
	{
	}

	public static interface CapabilityListener
	{

		public abstract void onCapabilityChanged(CapabilityInfo capabilityinfo);
	}

	public static interface GetAllCapabilitiesResult
		extends Result
	{

		public abstract Map getAllCapabilities();
	}

	public static interface GetCapabilityResult
		extends Result
	{

		public abstract CapabilityInfo getCapability();
	}

	public static interface NodeFilterType
		extends Annotation
	{
	}

	public static interface RemoveLocalCapabilityResult
		extends Result
	{
	}


	public abstract PendingResult addCapabilityListener(GoogleApiClient googleapiclient, CapabilityListener capabilitylistener, String s);

	public abstract PendingResult addListener(GoogleApiClient googleapiclient, CapabilityListener capabilitylistener, Uri uri, int i);

	public abstract PendingResult addLocalCapability(GoogleApiClient googleapiclient, String s);

	public abstract PendingResult getAllCapabilities(GoogleApiClient googleapiclient, int i);

	public abstract PendingResult getCapability(GoogleApiClient googleapiclient, String s, int i);

	public abstract PendingResult removeCapabilityListener(GoogleApiClient googleapiclient, CapabilityListener capabilitylistener, String s);

	public abstract PendingResult removeListener(GoogleApiClient googleapiclient, CapabilityListener capabilitylistener);

	public abstract PendingResult removeLocalCapability(GoogleApiClient googleapiclient, String s);

	public static final String ACTION_CAPABILITY_CHANGED = "com.google.android.gms.wearable.CAPABILITY_CHANGED";
	public static final int FILTER_ALL = 0;
	public static final int FILTER_LITERAL = 0;
	public static final int FILTER_PREFIX = 1;
	public static final int FILTER_REACHABLE = 1;
}
