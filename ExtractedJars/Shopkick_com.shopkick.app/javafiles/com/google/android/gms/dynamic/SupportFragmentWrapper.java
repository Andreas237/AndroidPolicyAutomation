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
	//    1    1:invokespecial   #12  <Method void IFragmentWrapper$Stub()>
		zzid = fragment;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field Fragment zzid>
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
	//    5    9:invokespecial   #19  <Method void SupportFragmentWrapper(Fragment)>
	//    6   12:areturn         
		else
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
	}

	public final Bundle getArguments()
	{
		return zzid.getArguments();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #26  <Method Bundle Fragment.getArguments()>
	//    3    7:areturn         
	}

	public final int getId()
	{
		return zzid.getId();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #30  <Method int Fragment.getId()>
	//    3    7:ireturn         
	}

	public final boolean getRetainInstance()
	{
		return zzid.getRetainInstance();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #34  <Method boolean Fragment.getRetainInstance()>
	//    3    7:ireturn         
	}

	public final String getTag()
	{
		return zzid.getTag();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #38  <Method String Fragment.getTag()>
	//    3    7:areturn         
	}

	public final int getTargetRequestCode()
	{
		return zzid.getTargetRequestCode();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #41  <Method int Fragment.getTargetRequestCode()>
	//    3    7:ireturn         
	}

	public final boolean getUserVisibleHint()
	{
		return zzid.getUserVisibleHint();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #44  <Method boolean Fragment.getUserVisibleHint()>
	//    3    7:ireturn         
	}

	public final boolean isAdded()
	{
		return zzid.isAdded();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #47  <Method boolean Fragment.isAdded()>
	//    3    7:ireturn         
	}

	public final boolean isDetached()
	{
		return zzid.isDetached();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #50  <Method boolean Fragment.isDetached()>
	//    3    7:ireturn         
	}

	public final boolean isHidden()
	{
		return zzid.isHidden();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #53  <Method boolean Fragment.isHidden()>
	//    3    7:ireturn         
	}

	public final boolean isInLayout()
	{
		return zzid.isInLayout();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #56  <Method boolean Fragment.isInLayout()>
	//    3    7:ireturn         
	}

	public final boolean isRemoving()
	{
		return zzid.isRemoving();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #59  <Method boolean Fragment.isRemoving()>
	//    3    7:ireturn         
	}

	public final boolean isResumed()
	{
		return zzid.isResumed();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #62  <Method boolean Fragment.isResumed()>
	//    3    7:ireturn         
	}

	public final boolean isVisible()
	{
		return zzid.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #65  <Method boolean Fragment.isVisible()>
	//    3    7:ireturn         
	}

	public final void setHasOptionsMenu(boolean flag)
	{
		zzid.setHasOptionsMenu(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #69  <Method void Fragment.setHasOptionsMenu(boolean)>
	//    4    8:return          
	}

	public final void setMenuVisibility(boolean flag)
	{
		zzid.setMenuVisibility(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #72  <Method void Fragment.setMenuVisibility(boolean)>
	//    4    8:return          
	}

	public final void setRetainInstance(boolean flag)
	{
		zzid.setRetainInstance(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method void Fragment.setRetainInstance(boolean)>
	//    4    8:return          
	}

	public final void setUserVisibleHint(boolean flag)
	{
		zzid.setUserVisibleHint(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #78  <Method void Fragment.setUserVisibleHint(boolean)>
	//    4    8:return          
	}

	public final void startActivity(Intent intent)
	{
		zzid.startActivity(intent);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #82  <Method void Fragment.startActivity(Intent)>
	//    4    8:return          
	}

	public final void startActivityForResult(Intent intent, int i)
	{
		zzid.startActivityForResult(intent, i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #86  <Method void Fragment.startActivityForResult(Intent, int)>
	//    5    9:return          
	}

	public final void zza(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((View)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #94  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #96  <Class View>
	//    3    7:astore_1        
		zzid.registerForContextMenu(((View) (iobjectwrapper)));
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field Fragment zzid>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #100 <Method void Fragment.registerForContextMenu(View)>
	//    8   16:return          
	}

	public final IObjectWrapper zzae()
	{
		return ObjectWrapper.wrap(((Object) (zzid.getActivity())));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #106 <Method android.support.v4.app.FragmentActivity Fragment.getActivity()>
	//    3    7:invokestatic    #109 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final IFragmentWrapper zzaf()
	{
		return ((IFragmentWrapper) (wrap(zzid.getParentFragment())));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #115 <Method Fragment Fragment.getParentFragment()>
	//    3    7:invokestatic    #117 <Method SupportFragmentWrapper wrap(Fragment)>
	//    4   10:areturn         
	}

	public final IObjectWrapper zzag()
	{
		return ObjectWrapper.wrap(((Object) (zzid.getResources())));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #122 <Method android.content.res.Resources Fragment.getResources()>
	//    3    7:invokestatic    #109 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final IFragmentWrapper zzah()
	{
		return ((IFragmentWrapper) (wrap(zzid.getTargetFragment())));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #126 <Method Fragment Fragment.getTargetFragment()>
	//    3    7:invokestatic    #117 <Method SupportFragmentWrapper wrap(Fragment)>
	//    4   10:areturn         
	}

	public final IObjectWrapper zzai()
	{
		return ObjectWrapper.wrap(((Object) (zzid.getView())));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Fragment zzid>
	//    2    4:invokevirtual   #131 <Method View Fragment.getView()>
	//    3    7:invokestatic    #109 <Method IObjectWrapper ObjectWrapper.wrap(Object)>
	//    4   10:areturn         
	}

	public final void zzb(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((View)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #94  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #96  <Class View>
	//    3    7:astore_1        
		zzid.unregisterForContextMenu(((View) (iobjectwrapper)));
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field Fragment zzid>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #135 <Method void Fragment.unregisterForContextMenu(View)>
	//    8   16:return          
	}

	private Fragment zzid;
}
