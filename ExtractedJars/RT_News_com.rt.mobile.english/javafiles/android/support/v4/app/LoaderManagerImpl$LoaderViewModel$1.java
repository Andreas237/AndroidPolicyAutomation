// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.ViewModel;

// Referenced classes of package android.support.v4.app:
//			LoaderManagerImpl

static final class LoaderManagerImpl$LoaderViewModel$1
	implements android.arch.lifecycle.ViewModelProvider.Factory
{

	public ViewModel create(Class class1)
	{
		return ((ViewModel) (new LoaderManagerImpl.LoaderViewModel()));
	//    0    0:new             #8   <Class LoaderManagerImpl$LoaderViewModel>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void LoaderManagerImpl$LoaderViewModel()>
	//    3    7:areturn         
	}

	LoaderManagerImpl$LoaderViewModel$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
