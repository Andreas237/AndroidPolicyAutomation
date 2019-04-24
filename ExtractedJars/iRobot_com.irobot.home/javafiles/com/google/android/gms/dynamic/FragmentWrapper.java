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
	//    1    1:invokespecial   #15  <Method void IFragmentWrapper$Stub()>
		zzhy = fragment;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Fragment zzhy>
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
	//    5    9:invokespecial   #22  <Method void FragmentWrapper(Fragment)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public final Bundle getArguments()
	{
		return zzhy.getArguments();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #29  <Method Bundle Fragment.getArguments()>
	//    3    7:areturn         
	}

	public final int getId()
	{
		return zzhy.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #33  <Method int Fragment.getId()>
	//    3    7:ireturn         
	}

	public final boolean getRetainInstance()
	{
		return zzhy.getRetainInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #37  <Method boolean Fragment.getRetainInstance()>
	//    3    7:ireturn         
	}

	public final String getTag()
	{
		return zzhy.getTag();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #41  <Method String Fragment.getTag()>
	//    3    7:areturn         
	}

	public final int getTargetRequestCode()
	{
		return zzhy.getTargetRequestCode();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #44  <Method int Fragment.getTargetRequestCode()>
	//    3    7:ireturn         
	}

	public final boolean getUserVisibleHint()
	{
		return zzhy.getUserVisibleHint();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #47  <Method boolean Fragment.getUserVisibleHint()>
	//    3    7:ireturn         
	}

	public final boolean isAdded()
	{
		return zzhy.isAdded();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #50  <Method boolean Fragment.isAdded()>
	//    3    7:ireturn         
	}

	public final boolean isDetached()
	{
		return zzhy.isDetached();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #53  <Method boolean Fragment.isDetached()>
	//    3    7:ireturn         
	}

	public final boolean isHidden()
	{
		return zzhy.isHidden();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #56  <Method boolean Fragment.isHidden()>
	//    3    7:ireturn         
	}

	public final boolean isInLayout()
	{
		return zzhy.isInLayout();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #59  <Method boolean Fragment.isInLayout()>
	//    3    7:ireturn         
	}

	public final boolean isRemoving()
	{
		return zzhy.isRemoving();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #62  <Method boolean Fragment.isRemoving()>
	//    3    7:ireturn         
	}

	public final boolean isResumed()
	{
		return zzhy.isResumed();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #65  <Method boolean Fragment.isResumed()>
	//    3    7:ireturn         
	}

	public final boolean isVisible()
	{
		return zzhy.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #68  <Method boolean Fragment.isVisible()>
	//    3    7:ireturn         
	}

	public final void setHasOptionsMenu(boolean flag)
	{
		zzhy.setHasOptionsMenu(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #72  <Method void Fragment.setHasOptionsMenu(boolean)>
	//    4    8:return          
	}

	public final void setMenuVisibility(boolean flag)
	{
		zzhy.setMenuVisibility(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method void Fragment.setMenuVisibility(boolean)>
	//    4    8:return          
	}

	public final void setRetainInstance(boolean flag)
	{
		zzhy.setRetainInstance(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #78  <Method void Fragment.setRetainInstance(boolean)>
	//    4    8:return          
	}

	public final void setUserVisibleHint(boolean flag)
	{
		zzhy.setUserVisibleHint(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #81  <Method void Fragment.setUserVisibleHint(boolean)>
	//    4    8:return          
	}

	public final void startActivity(Intent intent)
	{
		zzhy.startActivity(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #85  <Method void Fragment.startActivity(Intent)>
	//    4    8:return          
	}

	public final void startActivityForResult(Intent intent, int i)
	{
		zzhy.startActivityForResult(intent, i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #89  <Method void Fragment.startActivityForResult(Intent, int)>
	//    5    9:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((View)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #97  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #99  <Class View>
	//    3    7:astore_1        
		zzhy.registerForContextMenu(((View) (iobjectwrapper)));
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field Fragment zzhy>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #103 <Method void Fragment.registerForContextMenu(View)>
	//    8   16:return          
	}

	public final IObjectWrapper zzad()
	{
		return ObjectWrapper.wrap(((Object) (zzhy.getActivity())));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #109 <Method android.app.Activity Fragment.getActivity()>
	//    3    7:invokestatic    #112 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final IFragmentWrapper zzae()
	{
		return ((IFragmentWrapper) (wrap(zzhy.getParentFragment())));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #118 <Method Fragment Fragment.getParentFragment()>
	//    3    7:invokestatic    #120 <Method FragmentWrapper wrap(Fragment)>
	//    4   10:areturn         
	}

	public final IObjectWrapper zzaf()
	{
		return ObjectWrapper.wrap(((Object) (zzhy.getResources())));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #125 <Method android.content.res.Resources Fragment.getResources()>
	//    3    7:invokestatic    #112 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final IFragmentWrapper zzag()
	{
		return ((IFragmentWrapper) (wrap(zzhy.getTargetFragment())));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #129 <Method Fragment Fragment.getTargetFragment()>
	//    3    7:invokestatic    #120 <Method FragmentWrapper wrap(Fragment)>
	//    4   10:areturn         
	}

	public final IObjectWrapper zzah()
	{
		return ObjectWrapper.wrap(((Object) (zzhy.getView())));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Fragment zzhy>
	//    2    4:invokevirtual   #134 <Method View Fragment.getView()>
	//    3    7:invokestatic    #112 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final void zzb(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((View)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #97  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #99  <Class View>
	//    3    7:astore_1        
		zzhy.unregisterForContextMenu(((View) (iobjectwrapper)));
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field Fragment zzhy>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #138 <Method void Fragment.unregisterForContextMenu(View)>
	//    8   16:return          
	}

	private Fragment zzhy;
}
