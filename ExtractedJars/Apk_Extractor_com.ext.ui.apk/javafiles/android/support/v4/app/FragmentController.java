// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.support.v4.util.SimpleArrayMap;
import android.util.AttributeSet;
import android.view.*;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

// Referenced classes of package android.support.v4.app:
//			FragmentHostCallback, FragmentManagerImpl, FragmentManagerNonConfig, Fragment, 
//			FragmentManager, LoaderManager

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

	public static final FragmentController createController(FragmentHostCallback fragmenthostcallback)
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
		mHost.mFragmentManager.attachController(mHost, ((FragmentContainer) (mHost)), fragment);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field FragmentHostCallback mHost>
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field FragmentHostCallback mHost>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #36  <Method void FragmentManagerImpl.attachController(FragmentHostCallback, FragmentContainer, Fragment)>
	//    9   19:return          
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

	public void dispatchDestroyView()
	{
		mHost.mFragmentManager.dispatchDestroyView();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #60  <Method void FragmentManagerImpl.dispatchDestroyView()>
	//    4   10:return          
	}

	public void dispatchLowMemory()
	{
		mHost.mFragmentManager.dispatchLowMemory();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #63  <Method void FragmentManagerImpl.dispatchLowMemory()>
	//    4   10:return          
	}

	public void dispatchMultiWindowModeChanged(boolean flag)
	{
		mHost.mFragmentManager.dispatchMultiWindowModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #67  <Method void FragmentManagerImpl.dispatchMultiWindowModeChanged(boolean)>
	//    5   11:return          
	}

	public boolean dispatchOptionsItemSelected(MenuItem menuitem)
	{
		return mHost.mFragmentManager.dispatchOptionsItemSelected(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #70  <Method boolean FragmentManagerImpl.dispatchOptionsItemSelected(MenuItem)>
	//    5   11:ireturn         
	}

	public void dispatchOptionsMenuClosed(Menu menu)
	{
		mHost.mFragmentManager.dispatchOptionsMenuClosed(menu);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #74  <Method void FragmentManagerImpl.dispatchOptionsMenuClosed(Menu)>
	//    5   11:return          
	}

	public void dispatchPause()
	{
		mHost.mFragmentManager.dispatchPause();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #77  <Method void FragmentManagerImpl.dispatchPause()>
	//    4   10:return          
	}

	public void dispatchPictureInPictureModeChanged(boolean flag)
	{
		mHost.mFragmentManager.dispatchPictureInPictureModeChanged(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #80  <Method void FragmentManagerImpl.dispatchPictureInPictureModeChanged(boolean)>
	//    5   11:return          
	}

	public boolean dispatchPrepareOptionsMenu(Menu menu)
	{
		return mHost.mFragmentManager.dispatchPrepareOptionsMenu(menu);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #84  <Method boolean FragmentManagerImpl.dispatchPrepareOptionsMenu(Menu)>
	//    5   11:ireturn         
	}

	public void dispatchReallyStop()
	{
		mHost.mFragmentManager.dispatchReallyStop();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #87  <Method void FragmentManagerImpl.dispatchReallyStop()>
	//    4   10:return          
	}

	public void dispatchResume()
	{
		mHost.mFragmentManager.dispatchResume();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #90  <Method void FragmentManagerImpl.dispatchResume()>
	//    4   10:return          
	}

	public void dispatchStart()
	{
		mHost.mFragmentManager.dispatchStart();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #93  <Method void FragmentManagerImpl.dispatchStart()>
	//    4   10:return          
	}

	public void dispatchStop()
	{
		mHost.mFragmentManager.dispatchStop();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #96  <Method void FragmentManagerImpl.dispatchStop()>
	//    4   10:return          
	}

	public void doLoaderDestroy()
	{
		mHost.doLoaderDestroy();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:invokevirtual   #99  <Method void FragmentHostCallback.doLoaderDestroy()>
	//    3    7:return          
	}

	public void doLoaderRetain()
	{
		mHost.doLoaderRetain();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:invokevirtual   #102 <Method void FragmentHostCallback.doLoaderRetain()>
	//    3    7:return          
	}

	public void doLoaderStart()
	{
		mHost.doLoaderStart();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:invokevirtual   #105 <Method void FragmentHostCallback.doLoaderStart()>
	//    3    7:return          
	}

	public void doLoaderStop(boolean flag)
	{
		mHost.doLoaderStop(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #108 <Method void FragmentHostCallback.doLoaderStop(boolean)>
	//    4    8:return          
	}

	public void dumpLoaders(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		mHost.dumpLoaders(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #112 <Method void FragmentHostCallback.dumpLoaders(String, FileDescriptor, PrintWriter, String[])>
	//    7   12:return          
	}

	public boolean execPendingActions()
	{
		return mHost.mFragmentManager.execPendingActions();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #116 <Method boolean FragmentManagerImpl.execPendingActions()>
	//    4   10:ireturn         
	}

	public Fragment findFragmentByWho(String s)
	{
		return mHost.mFragmentManager.findFragmentByWho(s);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #121 <Method Fragment FragmentManagerImpl.findFragmentByWho(String)>
	//    5   11:areturn         
	}

	public List getActiveFragments(List list)
	{
		return mHost.mFragmentManager.getActiveFragments();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #127 <Method List FragmentManagerImpl.getActiveFragments()>
	//    4   10:areturn         
	}

	public int getActiveFragmentsCount()
	{
		return mHost.mFragmentManager.getActiveFragmentCount();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #133 <Method int FragmentManagerImpl.getActiveFragmentCount()>
	//    4   10:ireturn         
	}

	public FragmentManager getSupportFragmentManager()
	{
		return ((FragmentManager) (mHost.getFragmentManagerImpl()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:invokevirtual   #139 <Method FragmentManagerImpl FragmentHostCallback.getFragmentManagerImpl()>
	//    3    7:areturn         
	}

	public LoaderManager getSupportLoaderManager()
	{
		return ((LoaderManager) (mHost.getLoaderManagerImpl()));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:invokevirtual   #145 <Method LoaderManagerImpl FragmentHostCallback.getLoaderManagerImpl()>
	//    3    7:areturn         
	}

	public void noteStateNotSaved()
	{
		mHost.mFragmentManager.noteStateNotSaved();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #148 <Method void FragmentManagerImpl.noteStateNotSaved()>
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
	//    7   12:invokevirtual   #152 <Method View FragmentManagerImpl.onCreateView(View, String, Context, AttributeSet)>
	//    8   15:areturn         
	}

	public void reportLoaderStart()
	{
		mHost.reportLoaderStart();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:invokevirtual   #155 <Method void FragmentHostCallback.reportLoaderStart()>
	//    3    7:return          
	}

	public void restoreAllState(Parcelable parcelable, FragmentManagerNonConfig fragmentmanagernonconfig)
	{
		mHost.mFragmentManager.restoreAllState(parcelable, fragmentmanagernonconfig);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #159 <Method void FragmentManagerImpl.restoreAllState(Parcelable, FragmentManagerNonConfig)>
	//    6   12:return          
	}

	public void restoreAllState(Parcelable parcelable, List list)
	{
		mHost.mFragmentManager.restoreAllState(parcelable, new FragmentManagerNonConfig(list, ((List) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:aload_1         
	//    4    8:new             #163 <Class FragmentManagerNonConfig>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:aconst_null     
	//    8   14:invokespecial   #166 <Method void FragmentManagerNonConfig(List, List)>
	//    9   17:invokevirtual   #159 <Method void FragmentManagerImpl.restoreAllState(Parcelable, FragmentManagerNonConfig)>
	//   10   20:return          
	}

	public void restoreLoaderNonConfig(SimpleArrayMap simplearraymap)
	{
		mHost.restoreLoaderNonConfig(simplearraymap);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #172 <Method void FragmentHostCallback.restoreLoaderNonConfig(SimpleArrayMap)>
	//    4    8:return          
	}

	public SimpleArrayMap retainLoaderNonConfig()
	{
		return mHost.retainLoaderNonConfig();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:invokevirtual   #177 <Method SimpleArrayMap FragmentHostCallback.retainLoaderNonConfig()>
	//    3    7:areturn         
	}

	public FragmentManagerNonConfig retainNestedNonConfig()
	{
		return mHost.mFragmentManager.retainNonConfig();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #183 <Method FragmentManagerNonConfig FragmentManagerImpl.retainNonConfig()>
	//    4   10:areturn         
	}

	public List retainNonConfig()
	{
		FragmentManagerNonConfig fragmentmanagernonconfig = mHost.mFragmentManager.retainNonConfig();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #183 <Method FragmentManagerNonConfig FragmentManagerImpl.retainNonConfig()>
	//    4   10:astore_1        
		if(fragmentmanagernonconfig != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          20
			return fragmentmanagernonconfig.getFragments();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #186 <Method List FragmentManagerNonConfig.getFragments()>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public Parcelable saveAllState()
	{
		return mHost.mFragmentManager.saveAllState();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field FragmentHostCallback mHost>
	//    2    4:getfield        #30  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//    3    7:invokevirtual   #191 <Method Parcelable FragmentManagerImpl.saveAllState()>
	//    4   10:areturn         
	}

	private final FragmentHostCallback mHost;
}
