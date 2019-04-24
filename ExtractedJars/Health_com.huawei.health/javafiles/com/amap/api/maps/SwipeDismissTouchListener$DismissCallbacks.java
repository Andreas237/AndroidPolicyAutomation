// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.view.View;

// Referenced classes of package com.amap.api.maps:
//			SwipeDismissTouchListener

public static interface SwipeDismissTouchListener$DismissCallbacks
{

	public abstract boolean canDismiss(Object obj);

	public abstract void onDismiss(View view, Object obj);

	public abstract void onNotifySwipe();
}
