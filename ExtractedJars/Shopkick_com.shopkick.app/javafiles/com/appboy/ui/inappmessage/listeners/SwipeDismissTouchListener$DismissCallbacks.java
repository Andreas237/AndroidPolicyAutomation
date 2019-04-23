// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.listeners;

import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//			SwipeDismissTouchListener

public static interface SwipeDismissTouchListener$DismissCallbacks
{

	public abstract boolean canDismiss(Object obj);

	public abstract void onDismiss(View view, Object obj);
}
