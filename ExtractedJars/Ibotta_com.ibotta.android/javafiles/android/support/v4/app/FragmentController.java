// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.*;

// Referenced classes of package android.support.v4.app:
//			FragmentHostCallback, FragmentManagerImpl, Fragment, FragmentManager, 
//			FragmentManagerNonConfig

public class FragmentController
{

	private FragmentController(FragmentHostCallback fragmenthostcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		mHost = fragmenthostcallback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field FragmentHostCallback mHost>
	//    5    9:return          
	}

	public static FragmentController createController(FragmentHostCallback fragmenthostcallback)
	{
		return new FragmentController(fragmenthostcallback);
	//    0    0:new             #2   <Class FragmentController>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #21  <Method void FragmentController(FragmentHostCallback)>
	//    4    8:areturn         
	}

	public void attachHost(Fragment fragment)
	{
		FragmentManagerImpl fragmentmanagerimpl = mHost.mFragmentManager;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:astore_2        
		FragmentHostCallback fragmenthostcallback = mHost;
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field FragmentHostCallback mHost>
	//    6   12:astore_3        
		fragmentmanagerimpl.attachController(fragmenthostcallback, ((FragmentContainer) (fragmenthostcallback)), fragment);
	//    7   13:aload_2         
	//    8   14:aload_3         
	//    9   15:aload_3         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #36  <Method void FragmentManagerImpl.attachController(FragmentHostCallback, FragmentContainer, Fragment)>
	//   12   20:return          
	}

	public void dispatchActivityCreated()
	{
		mHost.mFragmentManager.dispatchActivityCreated();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #39  <Method void FragmentManagerImpl.dispatchActivityCreated()>
	//    4   10:return          
	}

	public void dispatchConfigurationChanged(Configuration configuration)
	{
		mHost.mFragmentManager.dispatchConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #43  <Method void FragmentManagerImpl.dispatchConfigurationChanged(Configuration)>
	//    5   11:return          
	}

	public boolean dispatchContextItemSelected(MenuItem menuitem)
	{
		return mHost.mFragmentManager.dispatchContextItemSelected(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #47  <Method boolean FragmentManagerImpl.dispatchContextItemSelected(MenuItem)>
	//    5   11:ireturn         
	}

	public void dispatchCreate()
	{
		mHost.mFragmentManager.dispatchCreate();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #50  <Method void FragmentManagerImpl.dispatchCreate()>
	//    4   10:return          
	}

	public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
	{
		return mHost.mFragmentManager.dispatchCreateOptionsMenu(menu, menuinflater);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #54  <Method boolean FragmentManagerImpl.dispatchCreateOptionsMenu(Menu, MenuInflater)>
	//    6   12:ireturn         
	}

	public void dispatchDestroy()
	{
		mHost.mFragmentManager.dispatchDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #57  <Method void FragmentManagerImpl.dispatchDestroy()>
	//    4   10:return          
	}

	public void dispatchLowMemory()
	{
		mHost.mFragmentManager.dispatchLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #60  <Method void FragmentManagerImpl.dispatchLowMemory()>
	//    4   10:return          
	}

	public void dispatchMultiWindowModeChanged(boolean flag)
	{
		mHost.mFragmentManager.dispatchMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #64  <Method void FragmentManagerImpl.dispatchMultiWindowModeChanged(boolean)>
	//    5   11:return          
	}

	public boolean dispatchOptionsItemSelected(MenuItem menuitem)
	{
		return mHost.mFragmentManager.dispatchOptionsItemSelected(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #67  <Method boolean FragmentManagerImpl.dispatchOptionsItemSelected(MenuItem)>
	//    5   11:ireturn         
	}

	public void dispatchOptionsMenuClosed(Menu menu)
	{
		mHost.mFragmentManager.dispatchOptionsMenuClosed(menu);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #71  <Method void FragmentManagerImpl.dispatchOptionsMenuClosed(Menu)>
	//    5   11:return          
	}

	public void dispatchPause()
	{
		mHost.mFragmentManager.dispatchPause();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #74  <Method void FragmentManagerImpl.dispatchPause()>
	//    4   10:return          
	}

	public void dispatchPictureInPictureModeChanged(boolean flag)
	{
		mHost.mFragmentManager.dispatchPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #77  <Method void FragmentManagerImpl.dispatchPictureInPictureModeChanged(boolean)>
	//    5   11:return          
	}

	public boolean dispatchPrepareOptionsMenu(Menu menu)
	{
		return mHost.mFragmentManager.dispatchPrepareOptionsMenu(menu);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #81  <Method boolean FragmentManagerImpl.dispatchPrepareOptionsMenu(Menu)>
	//    5   11:ireturn         
	}

	public void dispatchResume()
	{
		mHost.mFragmentManager.dispatchResume();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #84  <Method void FragmentManagerImpl.dispatchResume()>
	//    4   10:return          
	}

	public void dispatchStart()
	{
		mHost.mFragmentManager.dispatchStart();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #87  <Method void FragmentManagerImpl.dispatchStart()>
	//    4   10:return          
	}

	public void dispatchStop()
	{
		mHost.mFragmentManager.dispatchStop();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #90  <Method void FragmentManagerImpl.dispatchStop()>
	//    4   10:return          
	}

	public boolean execPendingActions()
	{
		return mHost.mFragmentManager.execPendingActions();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #94  <Method boolean FragmentManagerImpl.execPendingActions()>
	//    4   10:ireturn         
	}

	public Fragment findFragmentByWho(String s)
	{
		return mHost.mFragmentManager.findFragmentByWho(s);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #99  <Method Fragment FragmentManagerImpl.findFragmentByWho(String)>
	//    5   11:areturn         
	}

	public FragmentManager getSupportFragmentManager()
	{
		return ((FragmentManager) (mHost.getFragmentManagerImpl()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:invokevirtual   #106 <Method FragmentManagerImpl FragmentHostCallback.getFragmentManagerImpl()>
	//    3    7:areturn         
	}

	public void noteStateNotSaved()
	{
		mHost.mFragmentManager.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #109 <Method void FragmentManagerImpl.noteStateNotSaved()>
	//    4   10:return          
	}

	public View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		return mHost.mFragmentManager.onCreateView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokevirtual   #113 <Method View FragmentManagerImpl.onCreateView(View, String, Context, AttributeSet)>
	//    8   15:areturn         
	}

	public void restoreAllState(Parcelable parcelable, FragmentManagerNonConfig fragmentmanagernonconfig)
	{
		mHost.mFragmentManager.restoreAllState(parcelable, fragmentmanagernonconfig);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #117 <Method void FragmentManagerImpl.restoreAllState(Parcelable, FragmentManagerNonConfig)>
	//    6   12:return          
	}

	public FragmentManagerNonConfig retainNestedNonConfig()
	{
		return mHost.mFragmentManager.retainNonConfig();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #122 <Method FragmentManagerNonConfig FragmentManagerImpl.retainNonConfig()>
	//    4   10:areturn         
	}

	public Parcelable saveAllState()
	{
		return mHost.mFragmentManager.saveAllState();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #126 <Method Parcelable FragmentManagerImpl.saveAllState()>
	//    4   10:areturn         
	}

	private final FragmentHostCallback mHost;
}
