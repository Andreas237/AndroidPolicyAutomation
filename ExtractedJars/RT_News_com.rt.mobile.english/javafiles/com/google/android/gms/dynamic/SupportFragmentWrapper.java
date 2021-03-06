// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

// Referenced classes of package com.google.android.gms.dynamic:
//			ObjectWrapper, IObjectWrapper, IFragmentWrapper

public final class SupportFragmentWrapper extends IFragmentWrapper.Stub
{

	private SupportFragmentWrapper(Fragment fragment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void IFragmentWrapper$Stub()>
		zzabq = fragment;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Fragment zzabq>
	//    5    9:return          
	}

	public static SupportFragmentWrapper wrap(Fragment fragment)
	{
		if(fragment != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			return new SupportFragmentWrapper(fragment);
	//    2    4:new             #2   <Class SupportFragmentWrapper>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #18  <Method void SupportFragmentWrapper(Fragment)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public final IObjectWrapper getActivity()
	{
		return ObjectWrapper.wrap(((Object) (zzabq.getActivity())));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #25  <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
	//    3    7:invokestatic    #30  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final Bundle getArguments()
	{
		return zzabq.getArguments();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #34  <Method Bundle Fragment.getArguments()>
	//    3    7:areturn         
	}

	public final int getId()
	{
		return zzabq.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #38  <Method int Fragment.getId()>
	//    3    7:ireturn         
	}

	public final IFragmentWrapper getParentFragment()
	{
		return ((IFragmentWrapper) (wrap(zzabq.getParentFragment())));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #43  <Method Fragment Fragment.getParentFragment()>
	//    3    7:invokestatic    #45  <Method SupportFragmentWrapper wrap(Fragment)>
	//    4   10:areturn         
	}

	public final IObjectWrapper getResources()
	{
		return ObjectWrapper.wrap(((Object) (zzabq.getResources())));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #49  <Method android.content.res.Resources Fragment.getResources()>
	//    3    7:invokestatic    #30  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final boolean getRetainInstance()
	{
		return zzabq.getRetainInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #53  <Method boolean Fragment.getRetainInstance()>
	//    3    7:ireturn         
	}

	public final String getTag()
	{
		return zzabq.getTag();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #57  <Method String Fragment.getTag()>
	//    3    7:areturn         
	}

	public final IFragmentWrapper getTargetFragment()
	{
		return ((IFragmentWrapper) (wrap(zzabq.getTargetFragment())));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #60  <Method Fragment Fragment.getTargetFragment()>
	//    3    7:invokestatic    #45  <Method SupportFragmentWrapper wrap(Fragment)>
	//    4   10:areturn         
	}

	public final int getTargetRequestCode()
	{
		return zzabq.getTargetRequestCode();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #63  <Method int Fragment.getTargetRequestCode()>
	//    3    7:ireturn         
	}

	public final boolean getUserVisibleHint()
	{
		return zzabq.getUserVisibleHint();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #66  <Method boolean Fragment.getUserVisibleHint()>
	//    3    7:ireturn         
	}

	public final IObjectWrapper getView()
	{
		return ObjectWrapper.wrap(((Object) (zzabq.getView())));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #70  <Method View Fragment.getView()>
	//    3    7:invokestatic    #30  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final boolean isAdded()
	{
		return zzabq.isAdded();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #73  <Method boolean Fragment.isAdded()>
	//    3    7:ireturn         
	}

	public final boolean isDetached()
	{
		return zzabq.isDetached();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #76  <Method boolean Fragment.isDetached()>
	//    3    7:ireturn         
	}

	public final boolean isHidden()
	{
		return zzabq.isHidden();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #79  <Method boolean Fragment.isHidden()>
	//    3    7:ireturn         
	}

	public final boolean isInLayout()
	{
		return zzabq.isInLayout();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #82  <Method boolean Fragment.isInLayout()>
	//    3    7:ireturn         
	}

	public final boolean isRemoving()
	{
		return zzabq.isRemoving();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #85  <Method boolean Fragment.isRemoving()>
	//    3    7:ireturn         
	}

	public final boolean isResumed()
	{
		return zzabq.isResumed();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #88  <Method boolean Fragment.isResumed()>
	//    3    7:ireturn         
	}

	public final boolean isVisible()
	{
		return zzabq.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:invokevirtual   #91  <Method boolean Fragment.isVisible()>
	//    3    7:ireturn         
	}

	public final void registerForContextMenu(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((View)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #97  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #99  <Class View>
	//    3    7:astore_1        
		zzabq.registerForContextMenu(((View) (iobjectwrapper)));
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field Fragment zzabq>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #102 <Method void Fragment.registerForContextMenu(View)>
	//    8   16:return          
	}

	public final void setHasOptionsMenu(boolean flag)
	{
		zzabq.setHasOptionsMenu(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #106 <Method void Fragment.setHasOptionsMenu(boolean)>
	//    4    8:return          
	}

	public final void setMenuVisibility(boolean flag)
	{
		zzabq.setMenuVisibility(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #109 <Method void Fragment.setMenuVisibility(boolean)>
	//    4    8:return          
	}

	public final void setRetainInstance(boolean flag)
	{
		zzabq.setRetainInstance(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void Fragment.setRetainInstance(boolean)>
	//    4    8:return          
	}

	public final void setUserVisibleHint(boolean flag)
	{
		zzabq.setUserVisibleHint(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #115 <Method void Fragment.setUserVisibleHint(boolean)>
	//    4    8:return          
	}

	public final void startActivity(Intent intent)
	{
		zzabq.startActivity(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #119 <Method void Fragment.startActivity(Intent)>
	//    4    8:return          
	}

	public final void startActivityForResult(Intent intent, int i)
	{
		zzabq.startActivityForResult(intent, i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Fragment zzabq>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #123 <Method void Fragment.startActivityForResult(Intent, int)>
	//    5    9:return          
	}

	public final void unregisterForContextMenu(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((View)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #97  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #99  <Class View>
	//    3    7:astore_1        
		zzabq.unregisterForContextMenu(((View) (iobjectwrapper)));
	//    4    8:aload_0         
	//    5    9:getfield        #13  <Field Fragment zzabq>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #126 <Method void Fragment.unregisterForContextMenu(View)>
	//    8   16:return          
	}

	private Fragment zzabq;
}
