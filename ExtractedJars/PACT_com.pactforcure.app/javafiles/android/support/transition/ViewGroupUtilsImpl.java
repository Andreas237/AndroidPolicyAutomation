// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			ViewGroupOverlayImpl

interface ViewGroupUtilsImpl
{

	public abstract ViewGroupOverlayImpl getOverlay(ViewGroup viewgroup);

	public abstract void suppressLayout(ViewGroup viewgroup, boolean flag);
}
