// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuItemWrapperICS

class MenuItemWrapperJB extends MenuItemWrapperICS
{
	class ActionProviderWrapperJB extends MenuItemWrapperICS.ActionProviderWrapper
		implements android.view.ActionProvider.VisibilityListener
	{

		public boolean isVisible()
		{
			return mInner.isVisible();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ActionProvider mInner>
		//    2    4:invokevirtual   #31  <Method boolean ActionProvider.isVisible()>
		//    3    7:ireturn         
		}

		public void onActionProviderVisibilityChanged(boolean flag)
		{
			android.support.v4.view.ActionProvider.VisibilityListener visibilitylistener = mListener;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field android.support.v4.view.ActionProvider$VisibilityListener mListener>
		//    2    4:astore_2        
			if(visibilitylistener != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          16
				visibilitylistener.onActionProviderVisibilityChanged(flag);
		//    5    9:aload_2         
		//    6   10:iload_1         
		//    7   11:invokeinterface #39  <Method void android.support.v4.view.ActionProvider$VisibilityListener.onActionProviderVisibilityChanged(boolean)>
		//    8   16:return          
		}

		public View onCreateActionView(MenuItem menuitem)
		{
			return mInner.onCreateActionView(menuitem);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ActionProvider mInner>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #43  <Method View ActionProvider.onCreateActionView(MenuItem)>
		//    4    8:areturn         
		}

		public boolean overridesItemVisibility()
		{
			return mInner.overridesItemVisibility();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ActionProvider mInner>
		//    2    4:invokevirtual   #46  <Method boolean ActionProvider.overridesItemVisibility()>
		//    3    7:ireturn         
		}

		public void refreshVisibility()
		{
			mInner.refreshVisibility();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field ActionProvider mInner>
		//    2    4:invokevirtual   #50  <Method void ActionProvider.refreshVisibility()>
		//    3    7:return          
		}

		public void setVisibilityListener(android.support.v4.view.ActionProvider.VisibilityListener visibilitylistener)
		{
			mListener = visibilitylistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field android.support.v4.view.ActionProvider$VisibilityListener mListener>
			ActionProvider actionprovider = mInner;
		//    3    5:aload_0         
		//    4    6:getfield        #27  <Field ActionProvider mInner>
		//    5    9:astore_2        
			if(visibilitylistener != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          19
				visibilitylistener = ((android.support.v4.view.ActionProvider.VisibilityListener) (this));
		//    8   14:aload_0         
		//    9   15:astore_1        
			else
		//*  10   16:goto            21
				visibilitylistener = null;
		//   11   19:aconst_null     
		//   12   20:astore_1        
			actionprovider.setVisibilityListener(((android.view.ActionProvider.VisibilityListener) (visibilitylistener)));
		//   13   21:aload_2         
		//   14   22:aload_1         
		//   15   23:invokevirtual   #55  <Method void ActionProvider.setVisibilityListener(android.view.ActionProvider$VisibilityListener)>
		//   16   26:return          
		}

		android.support.v4.view.ActionProvider.VisibilityListener mListener;
		final MenuItemWrapperJB this$0;

		public ActionProviderWrapperJB(Context context, ActionProvider actionprovider)
		{
			this$0 = MenuItemWrapperJB.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field MenuItemWrapperJB this$0>
			super(((MenuItemWrapperICS) (MenuItemWrapperJB.this)), context, actionprovider);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokespecial   #20  <Method void MenuItemWrapperICS$ActionProviderWrapper(MenuItemWrapperICS, Context, ActionProvider)>
		//    8   12:return          
		}
	}


	MenuItemWrapperJB(Context context, SupportMenuItem supportmenuitem)
	{
		super(context, supportmenuitem);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void MenuItemWrapperICS(Context, SupportMenuItem)>
	//    4    6:return          
	}

	MenuItemWrapperICS.ActionProviderWrapper createActionProviderWrapper(ActionProvider actionprovider)
	{
		return ((MenuItemWrapperICS.ActionProviderWrapper) (new ActionProviderWrapperJB(mContext, actionprovider)));
	//    0    0:new             #6   <Class MenuItemWrapperJB$ActionProviderWrapperJB>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #24  <Field Context mContext>
	//    5    9:aload_1         
	//    6   10:invokespecial   #27  <Method void MenuItemWrapperJB$ActionProviderWrapperJB(MenuItemWrapperJB, Context, ActionProvider)>
	//    7   13:areturn         
	}
}
