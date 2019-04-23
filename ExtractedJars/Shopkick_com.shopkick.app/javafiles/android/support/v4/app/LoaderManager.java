// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelStoreOwner;
import android.os.Bundle;
import android.support.v4.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			LoaderManagerImpl

public abstract class LoaderManager
{
	public static interface LoaderCallbacks
	{

		public abstract Loader onCreateLoader(int i, Bundle bundle);

		public abstract void onLoadFinished(Loader loader, Object obj);

		public abstract void onLoaderReset(Loader loader);
	}


	public LoaderManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void enableDebugLogging(boolean flag)
	{
		LoaderManagerImpl.DEBUG = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #20  <Field boolean LoaderManagerImpl.DEBUG>
	//    2    4:return          
	}

	public static LoaderManager getInstance(LifecycleOwner lifecycleowner)
	{
		return ((LoaderManager) (new LoaderManagerImpl(lifecycleowner, ((ViewModelStoreOwner)lifecycleowner).getViewModelStore())));
	//    0    0:new             #16  <Class LoaderManagerImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:checkcast       #25  <Class ViewModelStoreOwner>
	//    5    9:invokeinterface #29  <Method android.arch.lifecycle.ViewModelStore ViewModelStoreOwner.getViewModelStore()>
	//    6   14:invokespecial   #32  <Method void LoaderManagerImpl(LifecycleOwner, android.arch.lifecycle.ViewModelStore)>
	//    7   17:areturn         
	}

	public abstract void destroyLoader(int i);

	public abstract void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[]);

	public abstract Loader getLoader(int i);

	public boolean hasRunningLoaders()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract Loader initLoader(int i, Bundle bundle, LoaderCallbacks loadercallbacks);

	public abstract void markForRedelivery();

	public abstract Loader restartLoader(int i, Bundle bundle, LoaderCallbacks loadercallbacks);
}
