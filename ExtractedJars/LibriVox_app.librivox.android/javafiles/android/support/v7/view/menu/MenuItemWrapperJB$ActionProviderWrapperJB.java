// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.f;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuItemWrapperJB

class MenuItemWrapperJB$ActionProviderWrapperJB extends MenuItemWrapperICS.ActionProviderWrapper
	implements android.view.ActionProvider.VisibilityListener
{

	public boolean isVisible()
	{
		return mInner.isVisible();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActionProvider mInner>
	//    2    4:invokevirtual   #28  <Method boolean ActionProvider.isVisible()>
	//    3    7:ireturn         
	}

	public void onActionProviderVisibilityChanged(boolean flag)
	{
		f f1 = mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field f mListener>
	//    2    4:astore_2        
		if(f1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			f1.onActionProviderVisibilityChanged(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokeinterface #36  <Method void f.onActionProviderVisibilityChanged(boolean)>
	//    8   16:return          
	}

	public View onCreateActionView(MenuItem menuitem)
	{
		return mInner.onCreateActionView(menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActionProvider mInner>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method View ActionProvider.onCreateActionView(MenuItem)>
	//    4    8:areturn         
	}

	public boolean overridesItemVisibility()
	{
		return mInner.overridesItemVisibility();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActionProvider mInner>
	//    2    4:invokevirtual   #43  <Method boolean ActionProvider.overridesItemVisibility()>
	//    3    7:ireturn         
	}

	public void refreshVisibility()
	{
		mInner.refreshVisibility();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ActionProvider mInner>
	//    2    4:invokevirtual   #47  <Method void ActionProvider.refreshVisibility()>
	//    3    7:return          
	}

	public void setVisibilityListener(f f1)
	{
		mListener = f1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field f mListener>
		ActionProvider actionprovider = mInner;
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field ActionProvider mInner>
	//    5    9:astore_2        
		if(f1 != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          19
			f1 = ((f) (this));
	//    8   14:aload_0         
	//    9   15:astore_1        
		else
	//*  10   16:goto            21
			f1 = null;
	//   11   19:aconst_null     
	//   12   20:astore_1        
		actionprovider.setVisibilityListener(((android.view.ActionProvider.VisibilityListener) (f1)));
	//   13   21:aload_2         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #52  <Method void ActionProvider.setVisibilityListener(android.view.ActionProvider$VisibilityListener)>
	//   16   26:return          
	}

	f mListener;
	final MenuItemWrapperJB this$0;

	public MenuItemWrapperJB$ActionProviderWrapperJB(Context context, ActionProvider actionprovider)
	{
		this$0 = MenuItemWrapperJB.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field MenuItemWrapperJB this$0>
		super(((MenuItemWrapperICS) (MenuItemWrapperJB.this)), context, actionprovider);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #17  <Method void MenuItemWrapperICS$ActionProviderWrapper(MenuItemWrapperICS, Context, ActionProvider)>
	//    8   12:return          
	}
}
