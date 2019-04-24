// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.Freezable;

// Referenced classes of package com.google.android.gms.wearable:
//			DataItem

public interface DataEvent
	extends Freezable
{

	public abstract DataItem getDataItem();

	public abstract int getType();

	public static final int TYPE_CHANGED = 1;
	public static final int TYPE_DELETED = 2;
}
