// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			LifecycleObserver, LifecycleOwner

public interface GenericLifecycleObserver
	extends LifecycleObserver
{

	public abstract void onStateChanged(LifecycleOwner lifecycleowner, Lifecycle.Event event);
}
