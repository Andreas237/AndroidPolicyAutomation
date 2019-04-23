// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps;


// Referenced classes of package com.google.android.gms.maps:
//			GoogleMap

public static interface GoogleMap$OnCameraMoveStartedListener
{

	public abstract void onCameraMoveStarted(int i);

	public static final int REASON_API_ANIMATION = 2;
	public static final int REASON_DEVELOPER_ANIMATION = 3;
	public static final int REASON_GESTURE = 1;
}
