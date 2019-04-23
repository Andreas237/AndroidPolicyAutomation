// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.arch.lifecycle.LifecycleOwner;

// Referenced classes of package android.databinding:
//			ViewDataBinding

private static interface ViewDataBinding$ObservableReference
{

	public abstract void addListener(Object obj);

	public abstract ViewDataBinding.WeakListener getListener();

	public abstract void removeListener(Object obj);

	public abstract void setLifecycleOwner(LifecycleOwner lifecycleowner);
}
