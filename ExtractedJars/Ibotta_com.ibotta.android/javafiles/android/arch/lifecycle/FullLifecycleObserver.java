// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;


// Referenced classes of package android.arch.lifecycle:
//			LifecycleObserver, LifecycleOwner

interface FullLifecycleObserver
	extends LifecycleObserver
{

	public abstract void onCreate(LifecycleOwner lifecycleowner);

	public abstract void onDestroy(LifecycleOwner lifecycleowner);

	public abstract void onPause(LifecycleOwner lifecycleowner);

	public abstract void onResume(LifecycleOwner lifecycleowner);

	public abstract void onStart(LifecycleOwner lifecycleowner);

	public abstract void onStop(LifecycleOwner lifecycleowner);
}
