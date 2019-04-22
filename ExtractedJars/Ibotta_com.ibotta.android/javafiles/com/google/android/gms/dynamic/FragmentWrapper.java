// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

// Referenced classes of package com.google.android.gms.dynamic:
//			ObjectWrapper, IObjectWrapper, IFragmentWrapper

public final class FragmentWrapper extends IFragmentWrapper.Stub
{

	private FragmentWrapper(Fragment fragment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void IFragmentWrapper$Stub()>
		zzabm = fragment;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Fragment zzabm>
	//    5    9:return          
	}

	public static FragmentWrapper wrap(Fragment fragment)
	{
		if(fragment != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			return new FragmentWrapper(fragment);
	//    2    4:new             #2   <Class FragmentWrapper>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #21  <Method void FragmentWrapper(Fragment)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public final IObjectWrapper getActivity()
	{
		return ObjectWrapper.wrap(((Object) (zzabm.getActivity())));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #28  <Method android.app.Activity Fragment.getActivity()>
	//    3    7:invokestatic    #33  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final Bundle getArguments()
	{
		return zzabm.getArguments();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #37  <Method Bundle Fragment.getArguments()>
	//    3    7:areturn         
	}

	public final int getId()
	{
		return zzabm.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #41  <Method int Fragment.getId()>
	//    3    7:ireturn         
	}

	public final IFragmentWrapper getParentFragment()
	{
		return ((IFragmentWrapper) (wrap(zzabm.getParentFragment())));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #46  <Method Fragment Fragment.getParentFragment()>
	//    3    7:invokestatic    #48  <Method FragmentWrapper wrap(Fragment)>
	//    4   10:areturn         
	}

	public final IObjectWrapper getResources()
	{
		return ObjectWrapper.wrap(((Object) (zzabm.getResources())));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #52  <Method android.content.res.Resources Fragment.getResources()>
	//    3    7:invokestatic    #33  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final boolean getRetainInstance()
	{
		return zzabm.getRetainInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #56  <Method boolean Fragment.getRetainInstance()>
	//    3    7:ireturn         
	}

	public final String getTag()
	{
		return zzabm.getTag();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #60  <Method String Fragment.getTag()>
	//    3    7:areturn         
	}

	public final IFragmentWrapper getTargetFragment()
	{
		return ((IFragmentWrapper) (wrap(zzabm.getTargetFragment())));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #63  <Method Fragment Fragment.getTargetFragment()>
	//    3    7:invokestatic    #48  <Method FragmentWrapper wrap(Fragment)>
	//    4   10:areturn         
	}

	public final int getTargetRequestCode()
	{
		return zzabm.getTargetRequestCode();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #66  <Method int Fragment.getTargetRequestCode()>
	//    3    7:ireturn         
	}

	public final boolean getUserVisibleHint()
	{
		return zzabm.getUserVisibleHint();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #69  <Method boolean Fragment.getUserVisibleHint()>
	//    3    7:ireturn         
	}

	public final IObjectWrapper getView()
	{
		return ObjectWrapper.wrap(((Object) (zzabm.getView())));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #73  <Method View Fragment.getView()>
	//    3    7:invokestatic    #33  <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final boolean isAdded()
	{
		return zzabm.isAdded();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #76  <Method boolean Fragment.isAdded()>
	//    3    7:ireturn         
	}

	public final boolean isDetached()
	{
		return zzabm.isDetached();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #79  <Method boolean Fragment.isDetached()>
	//    3    7:ireturn         
	}

	public final boolean isHidden()
	{
		return zzabm.isHidden();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #82  <Method boolean Fragment.isHidden()>
	//    3    7:ireturn         
	}

	public final boolean isInLayout()
	{
		return zzabm.isInLayout();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #85  <Method boolean Fragment.isInLayout()>
	//    3    7:ireturn         
	}

	public final boolean isRemoving()
	{
		return zzabm.isRemoving();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #88  <Method boolean Fragment.isRemoving()>
	//    3    7:ireturn         
	}

	public final boolean isResumed()
	{
		return zzabm.isResumed();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #91  <Method boolean Fragment.isResumed()>
	//    3    7:ireturn         
	}

	public final boolean isVisible()
	{
		return zzabm.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:invokevirtual   #94  <Method boolean Fragment.isVisible()>
	//    3    7:ireturn         
	}

	public final void registerForContextMenu(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((View)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #100 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #102 <Class View>
	//    3    7:astore_1        
		zzabm.registerForContextMenu(((View) (iobjectwrapper)));
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field Fragment zzabm>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #105 <Method void Fragment.registerForContextMenu(View)>
	//    8   16:return          
	}

	public final void setHasOptionsMenu(boolean flag)
	{
		zzabm.setHasOptionsMenu(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #109 <Method void Fragment.setHasOptionsMenu(boolean)>
	//    4    8:return          
	}

	public final void setMenuVisibility(boolean flag)
	{
		zzabm.setMenuVisibility(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #112 <Method void Fragment.setMenuVisibility(boolean)>
	//    4    8:return          
	}

	public final void setRetainInstance(boolean flag)
	{
		zzabm.setRetainInstance(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #115 <Method void Fragment.setRetainInstance(boolean)>
	//    4    8:return          
	}

	public final void setUserVisibleHint(boolean flag)
	{
		zzabm.setUserVisibleHint(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #118 <Method void Fragment.setUserVisibleHint(boolean)>
	//    4    8:return          
	}

	public final void startActivity(Intent intent)
	{
		zzabm.startActivity(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #122 <Method void Fragment.startActivity(Intent)>
	//    4    8:return          
	}

	public final void startActivityForResult(Intent intent, int i)
	{
		zzabm.startActivityForResult(intent, i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Fragment zzabm>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #126 <Method void Fragment.startActivityForResult(Intent, int)>
	//    5    9:return          
	}

	public final void unregisterForContextMenu(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((View)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #100 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #102 <Class View>
	//    3    7:astore_1        
		zzabm.unregisterForContextMenu(((View) (iobjectwrapper)));
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field Fragment zzabm>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #129 <Method void Fragment.unregisterForContextMenu(View)>
	//    8   16:return          
	}

	private Fragment zzabm;
}
