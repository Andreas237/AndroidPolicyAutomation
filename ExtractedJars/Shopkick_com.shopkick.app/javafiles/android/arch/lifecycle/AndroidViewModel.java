// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.app.Application;

// Referenced classes of package android.arch.lifecycle:
//			ViewModel

public class AndroidViewModel extends ViewModel
{

	public AndroidViewModel(Application application)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ViewModel()>
		mApplication = application;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Application mApplication>
	//    5    9:return          
	}

	public Application getApplication()
	{
		return mApplication;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Application mApplication>
	//    2    4:areturn         
	}

	private Application mApplication;
}
