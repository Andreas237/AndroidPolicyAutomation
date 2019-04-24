// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.*;
import android.graphics.drawable.Drawable;
import android.support.v4.app.*;
import android.support.v4.view.*;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.*;
import android.support.v7.view.menu.*;
import android.support.v7.widget.*;
import android.util.TypedValue;
import android.view.*;
import android.view.animation.*;
import android.widget.SpinnerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//			ActionBar, NavItemSelectedListener

public class WindowDecorActionBar extends ActionBar
	implements android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
{
	public class ActionModeImpl extends ActionMode
		implements android.support.v7.view.menu.MenuBuilder.Callback
	{

		public boolean dispatchOnCreate()
		{
			mMenu.stopDispatchingItemsChanged();
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field MenuBuilder mMenu>
		//    2    4:invokevirtual   #56  <Method void MenuBuilder.stopDispatchingItemsChanged()>
			boolean flag = mCallback.onCreateActionMode(((ActionMode) (this)), ((Menu) (mMenu)));
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//    5   11:aload_0         
		//    6   12:aload_0         
		//    7   13:getfield        #46  <Field MenuBuilder mMenu>
		//    8   16:invokeinterface #62  <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
		//    9   21:istore_1        
			mMenu.startDispatchingItemsChanged();
		//   10   22:aload_0         
		//   11   23:getfield        #46  <Field MenuBuilder mMenu>
		//   12   26:invokevirtual   #65  <Method void MenuBuilder.startDispatchingItemsChanged()>
			return flag;
		//   13   29:iload_1         
		//   14   30:ireturn         
			Exception exception;
			exception;
		//   15   31:astore_2        
			mMenu.startDispatchingItemsChanged();
		//   16   32:aload_0         
		//   17   33:getfield        #46  <Field MenuBuilder mMenu>
		//   18   36:invokevirtual   #65  <Method void MenuBuilder.startDispatchingItemsChanged()>
			throw exception;
		//   19   39:aload_2         
		//   20   40:athrow          
		}

		public void finish()
		{
			if(mActionMode != this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//*   2    4:getfield        #70  <Field WindowDecorActionBar$ActionModeImpl WindowDecorActionBar.mActionMode>
		//*   3    7:aload_0         
		//*   4    8:if_acmpeq       12
				return;
		//    5   11:return          
			if(!WindowDecorActionBar.checkShowingFlags(mHiddenByApp, mHiddenBySystem, false))
		//*   6   12:aload_0         
		//*   7   13:getfield        #28  <Field WindowDecorActionBar this$0>
		//*   8   16:getfield        #74  <Field boolean WindowDecorActionBar.mHiddenByApp>
		//*   9   19:aload_0         
		//*  10   20:getfield        #28  <Field WindowDecorActionBar this$0>
		//*  11   23:getfield        #77  <Field boolean WindowDecorActionBar.mHiddenBySystem>
		//*  12   26:iconst_0        
		//*  13   27:invokestatic    #81  <Method boolean WindowDecorActionBar.checkShowingFlags(boolean, boolean, boolean)>
		//*  14   30:ifne            55
			{
				mDeferredDestroyActionMode = ((ActionMode) (this));
		//   15   33:aload_0         
		//   16   34:getfield        #28  <Field WindowDecorActionBar this$0>
		//   17   37:aload_0         
		//   18   38:putfield        #85  <Field ActionMode WindowDecorActionBar.mDeferredDestroyActionMode>
				mDeferredModeDestroyCallback = mCallback;
		//   19   41:aload_0         
		//   20   42:getfield        #28  <Field WindowDecorActionBar this$0>
		//   21   45:aload_0         
		//   22   46:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//   23   49:putfield        #88  <Field android.support.v7.view.ActionMode$Callback WindowDecorActionBar.mDeferredModeDestroyCallback>
			} else
		//*  24   52:goto            65
			{
				mCallback.onDestroyActionMode(((ActionMode) (this)));
		//   25   55:aload_0         
		//   26   56:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//   27   59:aload_0         
		//   28   60:invokeinterface #92  <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
			}
			mCallback = null;
		//   29   65:aload_0         
		//   30   66:aconst_null     
		//   31   67:putfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
			animateToMode(false);
		//   32   70:aload_0         
		//   33   71:getfield        #28  <Field WindowDecorActionBar this$0>
		//   34   74:iconst_0        
		//   35   75:invokevirtual   #96  <Method void WindowDecorActionBar.animateToMode(boolean)>
			mContextView.closeMode();
		//   36   78:aload_0         
		//   37   79:getfield        #28  <Field WindowDecorActionBar this$0>
		//   38   82:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//   39   85:invokevirtual   #105 <Method void ActionBarContextView.closeMode()>
			mDecorToolbar.getViewGroup().sendAccessibilityEvent(32);
		//   40   88:aload_0         
		//   41   89:getfield        #28  <Field WindowDecorActionBar this$0>
		//   42   92:getfield        #109 <Field DecorToolbar WindowDecorActionBar.mDecorToolbar>
		//   43   95:invokeinterface #115 <Method ViewGroup DecorToolbar.getViewGroup()>
		//   44  100:bipush          32
		//   45  102:invokevirtual   #121 <Method void ViewGroup.sendAccessibilityEvent(int)>
			mOverlayLayout.setHideOnContentScrollEnabled(mHideOnContentScroll);
		//   46  105:aload_0         
		//   47  106:getfield        #28  <Field WindowDecorActionBar this$0>
		//   48  109:getfield        #125 <Field ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
		//   49  112:aload_0         
		//   50  113:getfield        #28  <Field WindowDecorActionBar this$0>
		//   51  116:getfield        #128 <Field boolean WindowDecorActionBar.mHideOnContentScroll>
		//   52  119:invokevirtual   #133 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
			mActionMode = null;
		//   53  122:aload_0         
		//   54  123:getfield        #28  <Field WindowDecorActionBar this$0>
		//   55  126:aconst_null     
		//   56  127:putfield        #70  <Field WindowDecorActionBar$ActionModeImpl WindowDecorActionBar.mActionMode>
		//   57  130:return          
		}

		public View getCustomView()
		{
			if(mCustomView != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #137 <Field WeakReference mCustomView>
		//*   2    4:ifnull          18
				return (View)mCustomView.get();
		//    3    7:aload_0         
		//    4    8:getfield        #137 <Field WeakReference mCustomView>
		//    5   11:invokevirtual   #143 <Method Object WeakReference.get()>
		//    6   14:checkcast       #145 <Class View>
		//    7   17:areturn         
			else
				return null;
		//    8   18:aconst_null     
		//    9   19:areturn         
		}

		public Menu getMenu()
		{
			return ((Menu) (mMenu));
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field MenuBuilder mMenu>
		//    2    4:areturn         
		}

		public MenuInflater getMenuInflater()
		{
			return ((MenuInflater) (new SupportMenuInflater(mActionModeContext)));
		//    0    0:new             #151 <Class SupportMenuInflater>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #33  <Field Context mActionModeContext>
		//    4    8:invokespecial   #152 <Method void SupportMenuInflater(Context)>
		//    5   11:areturn         
		}

		public CharSequence getSubtitle()
		{
			return mContextView.getSubtitle();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:invokevirtual   #156 <Method CharSequence ActionBarContextView.getSubtitle()>
		//    4   10:areturn         
		}

		public CharSequence getTitle()
		{
			return mContextView.getTitle();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:invokevirtual   #159 <Method CharSequence ActionBarContextView.getTitle()>
		//    4   10:areturn         
		}

		public void invalidate()
		{
			if(mActionMode != this)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//*   2    4:getfield        #70  <Field WindowDecorActionBar$ActionModeImpl WindowDecorActionBar.mActionMode>
		//*   3    7:aload_0         
		//*   4    8:if_acmpeq       12
				return;
		//    5   11:return          
			mMenu.stopDispatchingItemsChanged();
		//    6   12:aload_0         
		//    7   13:getfield        #46  <Field MenuBuilder mMenu>
		//    8   16:invokevirtual   #56  <Method void MenuBuilder.stopDispatchingItemsChanged()>
			mCallback.onPrepareActionMode(((ActionMode) (this)), ((Menu) (mMenu)));
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//   11   23:aload_0         
		//   12   24:aload_0         
		//   13   25:getfield        #46  <Field MenuBuilder mMenu>
		//   14   28:invokeinterface #163 <Method boolean android.support.v7.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
		//   15   33:pop             
			mMenu.startDispatchingItemsChanged();
		//   16   34:aload_0         
		//   17   35:getfield        #46  <Field MenuBuilder mMenu>
		//   18   38:invokevirtual   #65  <Method void MenuBuilder.startDispatchingItemsChanged()>
			return;
		//   19   41:return          
			Exception exception;
			exception;
		//   20   42:astore_1        
			mMenu.startDispatchingItemsChanged();
		//   21   43:aload_0         
		//   22   44:getfield        #46  <Field MenuBuilder mMenu>
		//   23   47:invokevirtual   #65  <Method void MenuBuilder.startDispatchingItemsChanged()>
			throw exception;
		//   24   50:aload_1         
		//   25   51:athrow          
		}

		public boolean isTitleOptional()
		{
			return mContextView.isTitleOptional();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:invokevirtual   #166 <Method boolean ActionBarContextView.isTitleOptional()>
		//    4   10:ireturn         
		}

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
		//    0    0:return          
		}

		public void onCloseSubMenu(SubMenuBuilder submenubuilder)
		{
		//    0    0:return          
		}

		public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
		{
			if(mCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//*   2    4:ifnull          19
				return mCallback.onActionItemClicked(((ActionMode) (this)), menuitem);
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//    5   11:aload_0         
		//    6   12:aload_2         
		//    7   13:invokeinterface #176 <Method boolean android.support.v7.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
		//    8   18:ireturn         
			else
				return false;
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		public void onMenuModeChange(MenuBuilder menubuilder)
		{
			if(mCallback == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//*   2    4:ifnonnull       8
			{
				return;
		//    3    7:return          
			} else
			{
				invalidate();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #180 <Method void invalidate()>
				mContextView.showOverflowMenu();
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field WindowDecorActionBar this$0>
		//    8   16:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    9   19:invokevirtual   #183 <Method boolean ActionBarContextView.showOverflowMenu()>
		//   10   22:pop             
				return;
		//   11   23:return          
			}
		}

		public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
		{
			if(mCallback == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//*   2    4:ifnonnull       9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			if(!submenubuilder.hasVisibleItems())
		//*   5    9:aload_1         
		//*   6   10:invokevirtual   #190 <Method boolean SubMenuBuilder.hasVisibleItems()>
		//*   7   13:ifne            18
			{
				return true;
		//    8   16:iconst_1        
		//    9   17:ireturn         
			} else
			{
				(new MenuPopupHelper(getThemedContext(), ((MenuBuilder) (submenubuilder)))).show();
		//   10   18:new             #192 <Class MenuPopupHelper>
		//   11   21:dup             
		//   12   22:aload_0         
		//   13   23:getfield        #28  <Field WindowDecorActionBar this$0>
		//   14   26:invokevirtual   #196 <Method Context WindowDecorActionBar.getThemedContext()>
		//   15   29:aload_1         
		//   16   30:invokespecial   #199 <Method void MenuPopupHelper(Context, MenuBuilder)>
		//   17   33:invokevirtual   #202 <Method void MenuPopupHelper.show()>
				return true;
		//   18   36:iconst_1        
		//   19   37:ireturn         
			}
		}

		public void setCustomView(View view)
		{
			mContextView.setCustomView(view);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #206 <Method void ActionBarContextView.setCustomView(View)>
			mCustomView = new WeakReference(((Object) (view)));
		//    5   11:aload_0         
		//    6   12:new             #139 <Class WeakReference>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #209 <Method void WeakReference(Object)>
		//   10   20:putfield        #137 <Field WeakReference mCustomView>
		//   11   23:return          
		}

		public void setSubtitle(int i)
		{
			setSubtitle(((CharSequence) (mContext.getResources().getString(i))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #28  <Field WindowDecorActionBar this$0>
		//    3    5:getfield        #213 <Field Context WindowDecorActionBar.mContext>
		//    4    8:invokevirtual   #219 <Method Resources Context.getResources()>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #225 <Method String Resources.getString(int)>
		//    7   15:invokevirtual   #228 <Method void setSubtitle(CharSequence)>
		//    8   18:return          
		}

		public void setSubtitle(CharSequence charsequence)
		{
			mContextView.setSubtitle(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #229 <Method void ActionBarContextView.setSubtitle(CharSequence)>
		//    5   11:return          
		}

		public void setTitle(int i)
		{
			setTitle(((CharSequence) (mContext.getResources().getString(i))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #28  <Field WindowDecorActionBar this$0>
		//    3    5:getfield        #213 <Field Context WindowDecorActionBar.mContext>
		//    4    8:invokevirtual   #219 <Method Resources Context.getResources()>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #225 <Method String Resources.getString(int)>
		//    7   15:invokevirtual   #232 <Method void setTitle(CharSequence)>
		//    8   18:return          
		}

		public void setTitle(CharSequence charsequence)
		{
			mContextView.setTitle(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #233 <Method void ActionBarContextView.setTitle(CharSequence)>
		//    5   11:return          
		}

		public void setTitleOptionalHint(boolean flag)
		{
			super.setTitleOptionalHint(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #236 <Method void ActionMode.setTitleOptionalHint(boolean)>
			mContextView.setTitleOptional(flag);
		//    3    5:aload_0         
		//    4    6:getfield        #28  <Field WindowDecorActionBar this$0>
		//    5    9:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    6   12:iload_1         
		//    7   13:invokevirtual   #239 <Method void ActionBarContextView.setTitleOptional(boolean)>
		//    8   16:return          
		}

		private final Context mActionModeContext;
		private android.support.v7.view.ActionMode.Callback mCallback;
		private WeakReference mCustomView;
		private final MenuBuilder mMenu;
		final WindowDecorActionBar this$0;

		public ActionModeImpl(Context context, android.support.v7.view.ActionMode.Callback callback)
		{
			this$0 = WindowDecorActionBar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field WindowDecorActionBar this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #31  <Method void ActionMode()>
			mActionModeContext = context;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #33  <Field Context mActionModeContext>
			mCallback = callback;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
			mMenu = (new MenuBuilder(context)).setDefaultShowAsAction(1);
		//   11   19:aload_0         
		//   12   20:new             #37  <Class MenuBuilder>
		//   13   23:dup             
		//   14   24:aload_2         
		//   15   25:invokespecial   #40  <Method void MenuBuilder(Context)>
		//   16   28:iconst_1        
		//   17   29:invokevirtual   #44  <Method MenuBuilder MenuBuilder.setDefaultShowAsAction(int)>
		//   18   32:putfield        #46  <Field MenuBuilder mMenu>
			mMenu.setCallback(((android.support.v7.view.menu.MenuBuilder.Callback) (this)));
		//   19   35:aload_0         
		//   20   36:getfield        #46  <Field MenuBuilder mMenu>
		//   21   39:aload_0         
		//   22   40:invokevirtual   #50  <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
		//   23   43:return          
		}
	}

	public class TabImpl extends ActionBar.Tab
	{

		public ActionBar.TabListener getCallback()
		{
			return mCallback;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field ActionBar$TabListener mCallback>
		//    2    4:areturn         
		}

		public CharSequence getContentDescription()
		{
			return mContentDesc;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field CharSequence mContentDesc>
		//    2    4:areturn         
		}

		public View getCustomView()
		{
			return mCustomView;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field View mCustomView>
		//    2    4:areturn         
		}

		public Drawable getIcon()
		{
			return mIcon;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field Drawable mIcon>
		//    2    4:areturn         
		}

		public int getPosition()
		{
			return mPosition;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int mPosition>
		//    2    4:ireturn         
		}

		public Object getTag()
		{
			return mTag;
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field Object mTag>
		//    2    4:areturn         
		}

		public CharSequence getText()
		{
			return mText;
		//    0    0:aload_0         
		//    1    1:getfield        #61  <Field CharSequence mText>
		//    2    4:areturn         
		}

		public void select()
		{
			selectTab(((ActionBar.Tab) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field WindowDecorActionBar this$0>
		//    2    4:aload_0         
		//    3    5:invokevirtual   #66  <Method void WindowDecorActionBar.selectTab(ActionBar$Tab)>
		//    4    8:return          
		}

		public ActionBar.Tab setContentDescription(int i)
		{
			return setContentDescription(mContext.getResources().getText(i));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field WindowDecorActionBar this$0>
		//    3    5:getfield        #72  <Field Context WindowDecorActionBar.mContext>
		//    4    8:invokevirtual   #78  <Method Resources Context.getResources()>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #83  <Method CharSequence Resources.getText(int)>
		//    7   15:invokevirtual   #86  <Method ActionBar$Tab setContentDescription(CharSequence)>
		//    8   18:areturn         
		}

		public ActionBar.Tab setContentDescription(CharSequence charsequence)
		{
			mContentDesc = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field CharSequence mContentDesc>
			if(mPosition >= 0)
		//*   3    5:aload_0         
		//*   4    6:getfield        #35  <Field int mPosition>
		//*   5    9:iflt            26
				mTabScrollView.updateTab(mPosition);
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field WindowDecorActionBar this$0>
		//    8   16:getfield        #90  <Field ScrollingTabContainerView WindowDecorActionBar.mTabScrollView>
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field int mPosition>
		//   11   23:invokevirtual   #96  <Method void ScrollingTabContainerView.updateTab(int)>
			return ((ActionBar.Tab) (this));
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public ActionBar.Tab setCustomView(int i)
		{
			return setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, ((ViewGroup) (null))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field WindowDecorActionBar this$0>
		//    3    5:invokevirtual   #101 <Method Context WindowDecorActionBar.getThemedContext()>
		//    4    8:invokestatic    #107 <Method LayoutInflater LayoutInflater.from(Context)>
		//    5   11:iload_1         
		//    6   12:aconst_null     
		//    7   13:invokevirtual   #111 <Method View LayoutInflater.inflate(int, ViewGroup)>
		//    8   16:invokevirtual   #114 <Method ActionBar$Tab setCustomView(View)>
		//    9   19:areturn         
		}

		public ActionBar.Tab setCustomView(View view)
		{
			mCustomView = view;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #48  <Field View mCustomView>
			if(mPosition >= 0)
		//*   3    5:aload_0         
		//*   4    6:getfield        #35  <Field int mPosition>
		//*   5    9:iflt            26
				mTabScrollView.updateTab(mPosition);
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field WindowDecorActionBar this$0>
		//    8   16:getfield        #90  <Field ScrollingTabContainerView WindowDecorActionBar.mTabScrollView>
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field int mPosition>
		//   11   23:invokevirtual   #96  <Method void ScrollingTabContainerView.updateTab(int)>
			return ((ActionBar.Tab) (this));
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public ActionBar.Tab setIcon(int i)
		{
			return setIcon(AppCompatResources.getDrawable(mContext, i));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field WindowDecorActionBar this$0>
		//    3    5:getfield        #72  <Field Context WindowDecorActionBar.mContext>
		//    4    8:iload_1         
		//    5    9:invokestatic    #121 <Method Drawable AppCompatResources.getDrawable(Context, int)>
		//    6   12:invokevirtual   #124 <Method ActionBar$Tab setIcon(Drawable)>
		//    7   15:areturn         
		}

		public ActionBar.Tab setIcon(Drawable drawable)
		{
			mIcon = drawable;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field Drawable mIcon>
			if(mPosition >= 0)
		//*   3    5:aload_0         
		//*   4    6:getfield        #35  <Field int mPosition>
		//*   5    9:iflt            26
				mTabScrollView.updateTab(mPosition);
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field WindowDecorActionBar this$0>
		//    8   16:getfield        #90  <Field ScrollingTabContainerView WindowDecorActionBar.mTabScrollView>
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field int mPosition>
		//   11   23:invokevirtual   #96  <Method void ScrollingTabContainerView.updateTab(int)>
			return ((ActionBar.Tab) (this));
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		public void setPosition(int i)
		{
			mPosition = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #35  <Field int mPosition>
		//    3    5:return          
		}

		public ActionBar.Tab setTabListener(ActionBar.TabListener tablistener)
		{
			mCallback = tablistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field ActionBar$TabListener mCallback>
			return ((ActionBar.Tab) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ActionBar.Tab setTag(Object obj)
		{
			mTag = obj;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #58  <Field Object mTag>
			return ((ActionBar.Tab) (this));
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public ActionBar.Tab setText(int i)
		{
			return setText(mContext.getResources().getText(i));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field WindowDecorActionBar this$0>
		//    3    5:getfield        #72  <Field Context WindowDecorActionBar.mContext>
		//    4    8:invokevirtual   #78  <Method Resources Context.getResources()>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #83  <Method CharSequence Resources.getText(int)>
		//    7   15:invokevirtual   #132 <Method ActionBar$Tab setText(CharSequence)>
		//    8   18:areturn         
		}

		public ActionBar.Tab setText(CharSequence charsequence)
		{
			mText = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #61  <Field CharSequence mText>
			if(mPosition >= 0)
		//*   3    5:aload_0         
		//*   4    6:getfield        #35  <Field int mPosition>
		//*   5    9:iflt            26
				mTabScrollView.updateTab(mPosition);
		//    6   12:aload_0         
		//    7   13:getfield        #30  <Field WindowDecorActionBar this$0>
		//    8   16:getfield        #90  <Field ScrollingTabContainerView WindowDecorActionBar.mTabScrollView>
		//    9   19:aload_0         
		//   10   20:getfield        #35  <Field int mPosition>
		//   11   23:invokevirtual   #96  <Method void ScrollingTabContainerView.updateTab(int)>
			return ((ActionBar.Tab) (this));
		//   12   26:aload_0         
		//   13   27:areturn         
		}

		private ActionBar.TabListener mCallback;
		private CharSequence mContentDesc;
		private View mCustomView;
		private Drawable mIcon;
		private int mPosition;
		private Object mTag;
		private CharSequence mText;
		final WindowDecorActionBar this$0;

		public TabImpl()
		{
			this$0 = WindowDecorActionBar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field WindowDecorActionBar this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #33  <Method void ActionBar$Tab()>
			mPosition = -1;
		//    5    9:aload_0         
		//    6   10:iconst_m1       
		//    7   11:putfield        #35  <Field int mPosition>
		//    8   14:return          
		}
	}


	public WindowDecorActionBar(Activity activity, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #127 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #128 <Method void ArrayList()>
	//    6   12:putfield        #130 <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #132 <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #127 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #128 <Method void ArrayList()>
	//   14   28:putfield        #134 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #136 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #138 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #140 <Field boolean mNowShowing>
		mHideListener = ((ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

			public void onAnimationEnd(View view)
			{
				if(mContentAnimations && mContentView != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field WindowDecorActionBar this$0>
			//*   2    4:getfield        #22  <Field boolean WindowDecorActionBar.mContentAnimations>
			//*   3    7:ifeq            42
			//*   4   10:aload_0         
			//*   5   11:getfield        #12  <Field WindowDecorActionBar this$0>
			//*   6   14:getfield        #26  <Field View WindowDecorActionBar.mContentView>
			//*   7   17:ifnull          42
				{
					mContentView.setTranslationY(0.0F);
			//    8   20:aload_0         
			//    9   21:getfield        #12  <Field WindowDecorActionBar this$0>
			//   10   24:getfield        #26  <Field View WindowDecorActionBar.mContentView>
			//   11   27:fconst_0        
			//   12   28:invokevirtual   #32  <Method void View.setTranslationY(float)>
					mContainerView.setTranslationY(0.0F);
			//   13   31:aload_0         
			//   14   32:getfield        #12  <Field WindowDecorActionBar this$0>
			//   15   35:getfield        #36  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
			//   16   38:fconst_0        
			//   17   39:invokevirtual   #39  <Method void ActionBarContainer.setTranslationY(float)>
				}
				mContainerView.setVisibility(8);
			//   18   42:aload_0         
			//   19   43:getfield        #12  <Field WindowDecorActionBar this$0>
			//   20   46:getfield        #36  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
			//   21   49:bipush          8
			//   22   51:invokevirtual   #43  <Method void ActionBarContainer.setVisibility(int)>
				mContainerView.setTransitioning(false);
			//   23   54:aload_0         
			//   24   55:getfield        #12  <Field WindowDecorActionBar this$0>
			//   25   58:getfield        #36  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
			//   26   61:iconst_0        
			//   27   62:invokevirtual   #47  <Method void ActionBarContainer.setTransitioning(boolean)>
				mCurrentShowAnim = null;
			//   28   65:aload_0         
			//   29   66:getfield        #12  <Field WindowDecorActionBar this$0>
			//   30   69:aconst_null     
			//   31   70:putfield        #51  <Field ViewPropertyAnimatorCompatSet WindowDecorActionBar.mCurrentShowAnim>
				completeDeferredDestroyActionMode();
			//   32   73:aload_0         
			//   33   74:getfield        #12  <Field WindowDecorActionBar this$0>
			//   34   77:invokevirtual   #54  <Method void WindowDecorActionBar.completeDeferredDestroyActionMode()>
				if(mOverlayLayout != null)
			//*  35   80:aload_0         
			//*  36   81:getfield        #12  <Field WindowDecorActionBar this$0>
			//*  37   84:getfield        #58  <Field ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
			//*  38   87:ifnull          100
					ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
			//   39   90:aload_0         
			//   40   91:getfield        #12  <Field WindowDecorActionBar this$0>
			//   41   94:getfield        #58  <Field ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
			//   42   97:invokestatic    #63  <Method void ViewCompat.requestApplyInsets(View)>
			//   43  100:return          
			}

			final WindowDecorActionBar this$0;

			
			{
				this$0 = WindowDecorActionBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field WindowDecorActionBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
));
	//   24   46:aload_0         
	//   25   47:new             #8   <Class WindowDecorActionBar$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #143 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #145 <Field ViewPropertyAnimatorListener mHideListener>
		mShowListener = ((ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

			public void onAnimationEnd(View view)
			{
				mCurrentShowAnim = null;
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field WindowDecorActionBar this$0>
			//    2    4:aconst_null     
			//    3    5:putfield        #22  <Field ViewPropertyAnimatorCompatSet WindowDecorActionBar.mCurrentShowAnim>
				mContainerView.requestLayout();
			//    4    8:aload_0         
			//    5    9:getfield        #12  <Field WindowDecorActionBar this$0>
			//    6   12:getfield        #26  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
			//    7   15:invokevirtual   #31  <Method void ActionBarContainer.requestLayout()>
			//    8   18:return          
			}

			final WindowDecorActionBar this$0;

			
			{
				this$0 = WindowDecorActionBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field WindowDecorActionBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
));
	//   30   58:aload_0         
	//   31   59:new             #10  <Class WindowDecorActionBar$2>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:invokespecial   #146 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #148 <Field ViewPropertyAnimatorListener mShowListener>
		mUpdateListener = new ViewPropertyAnimatorUpdateListener() {

			public void onAnimationUpdate(View view)
			{
				((View)mContainerView.getParent()).invalidate();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field WindowDecorActionBar this$0>
			//    2    4:getfield        #24  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
			//    3    7:invokevirtual   #30  <Method android.view.ViewParent ActionBarContainer.getParent()>
			//    4   10:checkcast       #32  <Class View>
			//    5   13:invokevirtual   #35  <Method void View.invalidate()>
			//    6   16:return          
			}

			final WindowDecorActionBar this$0;

			
			{
				this$0 = WindowDecorActionBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field WindowDecorActionBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   36   70:aload_0         
	//   37   71:new             #12  <Class WindowDecorActionBar$3>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:invokespecial   #149 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #151 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		mActivity = activity;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #153 <Field Activity mActivity>
		activity = ((Activity) (activity.getWindow().getDecorView()));
	//   45   87:aload_1         
	//   46   88:invokevirtual   #159 <Method Window Activity.getWindow()>
	//   47   91:invokevirtual   #165 <Method View Window.getDecorView()>
	//   48   94:astore_1        
		init(((View) (activity)));
	//   49   95:aload_0         
	//   50   96:aload_1         
	//   51   97:invokespecial   #169 <Method void init(View)>
		if(!flag)
	//*  52  100:iload_2         
	//*  53  101:ifne            114
			mContentView = ((View) (activity)).findViewById(0x1020002);
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:ldc1            #170 <Int 0x1020002>
	//   57  108:invokevirtual   #176 <Method View View.findViewById(int)>
	//   58  111:putfield        #178 <Field View mContentView>
	//   59  114:return          
	}

	public WindowDecorActionBar(Dialog dialog)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #127 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #128 <Method void ArrayList()>
	//    6   12:putfield        #130 <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #132 <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #127 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #128 <Method void ArrayList()>
	//   14   28:putfield        #134 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #136 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #138 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #140 <Field boolean mNowShowing>
		mHideListener = ((ViewPropertyAnimatorListener) (new _cls1()));
	//   24   46:aload_0         
	//   25   47:new             #8   <Class WindowDecorActionBar$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #143 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #145 <Field ViewPropertyAnimatorListener mHideListener>
		mShowListener = ((ViewPropertyAnimatorListener) (new _cls2()));
	//   30   58:aload_0         
	//   31   59:new             #10  <Class WindowDecorActionBar$2>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:invokespecial   #146 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #148 <Field ViewPropertyAnimatorListener mShowListener>
		mUpdateListener = new _cls3();
	//   36   70:aload_0         
	//   37   71:new             #12  <Class WindowDecorActionBar$3>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:invokespecial   #149 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #151 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		mDialog = dialog;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #181 <Field Dialog mDialog>
		init(dialog.getWindow().getDecorView());
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:invokevirtual   #184 <Method Window Dialog.getWindow()>
	//   48   92:invokevirtual   #165 <Method View Window.getDecorView()>
	//   49   95:invokespecial   #169 <Method void init(View)>
	//   50   98:return          
	}

	public WindowDecorActionBar(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #127 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #128 <Method void ArrayList()>
	//    6   12:putfield        #130 <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #132 <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #127 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #128 <Method void ArrayList()>
	//   14   28:putfield        #134 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #136 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #138 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #140 <Field boolean mNowShowing>
		mHideListener = ((ViewPropertyAnimatorListener) (new _cls1()));
	//   24   46:aload_0         
	//   25   47:new             #8   <Class WindowDecorActionBar$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #143 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #145 <Field ViewPropertyAnimatorListener mHideListener>
		mShowListener = ((ViewPropertyAnimatorListener) (new _cls2()));
	//   30   58:aload_0         
	//   31   59:new             #10  <Class WindowDecorActionBar$2>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:invokespecial   #146 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #148 <Field ViewPropertyAnimatorListener mShowListener>
		mUpdateListener = new _cls3();
	//   36   70:aload_0         
	//   37   71:new             #12  <Class WindowDecorActionBar$3>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:invokespecial   #149 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #151 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		if(!$assertionsDisabled && !view.isInEditMode())
	//*  42   82:getstatic       #103 <Field boolean $assertionsDisabled>
	//*  43   85:ifne            103
	//*  44   88:aload_1         
	//*  45   89:invokevirtual   #187 <Method boolean View.isInEditMode()>
	//*  46   92:ifne            103
		{
			throw new AssertionError();
	//   47   95:new             #189 <Class AssertionError>
	//   48   98:dup             
	//   49   99:invokespecial   #190 <Method void AssertionError()>
	//   50  102:athrow          
		} else
		{
			init(view);
	//   51  103:aload_0         
	//   52  104:aload_1         
	//   53  105:invokespecial   #169 <Method void init(View)>
			return;
	//   54  108:return          
		}
	}

	static boolean checkShowingFlags(boolean flag, boolean flag1, boolean flag2)
	{
		if(flag2)
	//*   0    0:iload_2         
	//*   1    1:ifeq            6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		return !flag && !flag1;
	//    4    6:iload_0         
	//    5    7:ifne            14
	//    6   10:iload_1         
	//    7   11:ifeq            16
	//    8   14:iconst_0        
	//    9   15:ireturn         
	//   10   16:iconst_1        
	//   11   17:ireturn         
	}

	private void cleanupTabs()
	{
		if(mSelectedTab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*   2    4:ifnull          12
			selectTab(((ActionBar.Tab) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #200 <Method void selectTab(ActionBar$Tab)>
		mTabs.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #130 <Field ArrayList mTabs>
	//    8   16:invokevirtual   #203 <Method void ArrayList.clear()>
		if(mTabScrollView != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//*  11   23:ifnull          33
			mTabScrollView.removeAllTabs();
	//   12   26:aload_0         
	//   13   27:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   14   30:invokevirtual   #210 <Method void ScrollingTabContainerView.removeAllTabs()>
		mSavedTabPosition = -1;
	//   15   33:aload_0         
	//   16   34:iconst_m1       
	//   17   35:putfield        #132 <Field int mSavedTabPosition>
	//   18   38:return          
	}

	private void configureTab(ActionBar.Tab tab, int i)
	{
		tab = ((ActionBar.Tab) ((TabImpl)tab));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//    2    4:astore_1        
		if(((TabImpl) (tab)).getCallback() == null)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #216 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//*   5    9:ifnonnull       22
			throw new IllegalStateException("Action Bar Tab must have a Callback");
	//    6   12:new             #218 <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #220 <String "Action Bar Tab must have a Callback">
	//    9   18:invokespecial   #223 <Method void IllegalStateException(String)>
	//   10   21:athrow          
		((TabImpl) (tab)).setPosition(i);
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokevirtual   #227 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
		mTabs.add(i, ((Object) (tab)));
	//   14   27:aload_0         
	//   15   28:getfield        #130 <Field ArrayList mTabs>
	//   16   31:iload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #231 <Method void ArrayList.add(int, Object)>
		int j = mTabs.size();
	//   19   36:aload_0         
	//   20   37:getfield        #130 <Field ArrayList mTabs>
	//   21   40:invokevirtual   #235 <Method int ArrayList.size()>
	//   22   43:istore_3        
		for(i++; i < j; i++)
	//*  23   44:iload_2         
	//*  24   45:iconst_1        
	//*  25   46:iadd            
	//*  26   47:istore_2        
	//*  27   48:iload_2         
	//*  28   49:iload_3         
	//*  29   50:icmpge          75
			((TabImpl)mTabs.get(i)).setPosition(i);
	//   30   53:aload_0         
	//   31   54:getfield        #130 <Field ArrayList mTabs>
	//   32   57:iload_2         
	//   33   58:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//   34   61:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   35   64:iload_2         
	//   36   65:invokevirtual   #227 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>

	//   37   68:iload_2         
	//   38   69:iconst_1        
	//   39   70:iadd            
	//   40   71:istore_2        
	//*  41   72:goto            48
	//   42   75:return          
	}

	private void ensureTabsExist()
	{
		if(mTabScrollView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		ScrollingTabContainerView scrollingtabcontainerview = new ScrollingTabContainerView(mContext);
	//    4    8:new             #207 <Class ScrollingTabContainerView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #242 <Field Context mContext>
	//    8   16:invokespecial   #245 <Method void ScrollingTabContainerView(Context)>
	//    9   19:astore_1        
		if(mHasEmbeddedTabs)
	//*  10   20:aload_0         
	//*  11   21:getfield        #247 <Field boolean mHasEmbeddedTabs>
	//*  12   24:ifeq            45
		{
			scrollingtabcontainerview.setVisibility(0);
	//   13   27:aload_1         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #250 <Method void ScrollingTabContainerView.setVisibility(int)>
			mDecorToolbar.setEmbeddedTabView(scrollingtabcontainerview);
	//   16   32:aload_0         
	//   17   33:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   18   36:aload_1         
	//   19   37:invokeinterface #258 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
		} else
	//*  20   42:goto            89
		{
			if(getNavigationMode() == 2)
	//*  21   45:aload_0         
	//*  22   46:invokevirtual   #261 <Method int getNavigationMode()>
	//*  23   49:iconst_2        
	//*  24   50:icmpne          75
			{
				scrollingtabcontainerview.setVisibility(0);
	//   25   53:aload_1         
	//   26   54:iconst_0        
	//   27   55:invokevirtual   #250 <Method void ScrollingTabContainerView.setVisibility(int)>
				if(mOverlayLayout != null)
	//*  28   58:aload_0         
	//*  29   59:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  30   62:ifnull          81
					ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//   31   65:aload_0         
	//   32   66:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   33   69:invokestatic    #268 <Method void ViewCompat.requestApplyInsets(View)>
			} else
	//*  34   72:goto            81
			{
				scrollingtabcontainerview.setVisibility(8);
	//   35   75:aload_1         
	//   36   76:bipush          8
	//   37   78:invokevirtual   #250 <Method void ScrollingTabContainerView.setVisibility(int)>
			}
			mContainerView.setTabContainer(scrollingtabcontainerview);
	//   38   81:aload_0         
	//   39   82:getfield        #270 <Field ActionBarContainer mContainerView>
	//   40   85:aload_1         
	//   41   86:invokevirtual   #275 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
		}
		mTabScrollView = scrollingtabcontainerview;
	//   42   89:aload_0         
	//   43   90:aload_1         
	//   44   91:putfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   45   94:return          
	}

	private DecorToolbar getDecorToolbar(View view)
	{
		if(view instanceof DecorToolbar)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #254 <Class DecorToolbar>
	//*   2    4:ifeq            12
			return (DecorToolbar)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #254 <Class DecorToolbar>
	//    5   11:areturn         
		if(view instanceof Toolbar)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #279 <Class Toolbar>
	//*   8   16:ifeq            27
			return ((Toolbar)view).getWrapper();
	//    9   19:aload_1         
	//   10   20:checkcast       #279 <Class Toolbar>
	//   11   23:invokevirtual   #283 <Method DecorToolbar Toolbar.getWrapper()>
	//   12   26:areturn         
		if((new StringBuilder()).append("Can't make a decor toolbar out of ").append(((Object) (view))).toString() != null)
	//*  13   27:new             #285 <Class StringBuilder>
	//*  14   30:dup             
	//*  15   31:invokespecial   #286 <Method void StringBuilder()>
	//*  16   34:ldc2            #288 <String "Can't make a decor toolbar out of ">
	//*  17   37:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #295 <Method StringBuilder StringBuilder.append(Object)>
	//*  20   44:invokevirtual   #299 <Method String StringBuilder.toString()>
	//*  21   47:ifnull          61
			view = ((View) (((Object) (view)).getClass().getSimpleName()));
	//   22   50:aload_1         
	//   23   51:invokevirtual   #305 <Method Class Object.getClass()>
	//   24   54:invokevirtual   #308 <Method String Class.getSimpleName()>
	//   25   57:astore_1        
		else
	//*  26   58:goto            65
			view = "null";
	//   27   61:ldc2            #310 <String "null">
	//   28   64:astore_1        
		throw new IllegalStateException(((String) (view)));
	//   29   65:new             #218 <Class IllegalStateException>
	//   30   68:dup             
	//   31   69:aload_1         
	//   32   70:invokespecial   #223 <Method void IllegalStateException(String)>
	//   33   73:athrow          
	}

	private void hideForActionMode()
	{
		if(mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean mShowingForMode>
	//*   2    4:ifeq            32
		{
			mShowingForMode = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #313 <Field boolean mShowingForMode>
			if(mOverlayLayout != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   8   16:ifnull          27
				mOverlayLayout.setShowingForActionMode(false);
	//    9   19:aload_0         
	//   10   20:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #319 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokespecial   #322 <Method void updateVisibility(boolean)>
		}
	//   16   32:return          
	}

	private void init(View view)
	{
		mOverlayLayout = (ActionBarOverlayLayout)view.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #327 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//    3    5:invokevirtual   #176 <Method View View.findViewById(int)>
	//    4    8:checkcast       #315 <Class ActionBarOverlayLayout>
	//    5   11:putfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
		if(mOverlayLayout != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   8   18:ifnull          29
			mOverlayLayout.setActionBarVisibilityCallback(((android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback) (this)));
	//    9   21:aload_0         
	//   10   22:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #331 <Method void ActionBarOverlayLayout.setActionBarVisibilityCallback(android.support.v7.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback)>
		mDecorToolbar = getDecorToolbar(view.findViewById(android.support.v7.appcompat.R.id.action_bar));
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:getstatic       #334 <Field int android.support.v7.appcompat.R$id.action_bar>
	//   17   35:invokevirtual   #176 <Method View View.findViewById(int)>
	//   18   38:invokespecial   #336 <Method DecorToolbar getDecorToolbar(View)>
	//   19   41:putfield        #252 <Field DecorToolbar mDecorToolbar>
		mContextView = (ActionBarContextView)view.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:getstatic       #339 <Field int android.support.v7.appcompat.R$id.action_context_bar>
	//   23   49:invokevirtual   #176 <Method View View.findViewById(int)>
	//   24   52:checkcast       #341 <Class ActionBarContextView>
	//   25   55:putfield        #343 <Field ActionBarContextView mContextView>
		mContainerView = (ActionBarContainer)view.findViewById(android.support.v7.appcompat.R.id.action_bar_container);
	//   26   58:aload_0         
	//   27   59:aload_1         
	//   28   60:getstatic       #346 <Field int android.support.v7.appcompat.R$id.action_bar_container>
	//   29   63:invokevirtual   #176 <Method View View.findViewById(int)>
	//   30   66:checkcast       #272 <Class ActionBarContainer>
	//   31   69:putfield        #270 <Field ActionBarContainer mContainerView>
		if(mDecorToolbar == null || mContextView == null || mContainerView == null)
	//*  32   72:aload_0         
	//*  33   73:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//*  34   76:ifnull          93
	//*  35   79:aload_0         
	//*  36   80:getfield        #343 <Field ActionBarContextView mContextView>
	//*  37   83:ifnull          93
	//*  38   86:aload_0         
	//*  39   87:getfield        #270 <Field ActionBarContainer mContainerView>
	//*  40   90:ifnonnull       133
			throw new IllegalStateException((new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(" can only be used ").append("with a compatible window decor layout").toString());
	//   41   93:new             #218 <Class IllegalStateException>
	//   42   96:dup             
	//   43   97:new             #285 <Class StringBuilder>
	//   44  100:dup             
	//   45  101:invokespecial   #286 <Method void StringBuilder()>
	//   46  104:aload_0         
	//   47  105:invokevirtual   #305 <Method Class Object.getClass()>
	//   48  108:invokevirtual   #308 <Method String Class.getSimpleName()>
	//   49  111:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   50  114:ldc2            #348 <String " can only be used ">
	//   51  117:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   52  120:ldc2            #350 <String "with a compatible window decor layout">
	//   53  123:invokevirtual   #292 <Method StringBuilder StringBuilder.append(String)>
	//   54  126:invokevirtual   #299 <Method String StringBuilder.toString()>
	//   55  129:invokespecial   #223 <Method void IllegalStateException(String)>
	//   56  132:athrow          
		mContext = mDecorToolbar.getContext();
	//   57  133:aload_0         
	//   58  134:aload_0         
	//   59  135:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   60  138:invokeinterface #354 <Method Context DecorToolbar.getContext()>
	//   61  143:putfield        #242 <Field Context mContext>
		boolean flag;
		if((mDecorToolbar.getDisplayOptions() & 4) != 0)
	//*  62  146:aload_0         
	//*  63  147:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//*  64  150:invokeinterface #357 <Method int DecorToolbar.getDisplayOptions()>
	//*  65  155:iconst_4        
	//*  66  156:iand            
	//*  67  157:ifeq            165
			flag = true;
	//   68  160:iconst_1        
	//   69  161:istore_2        
		else
	//*  70  162:goto            167
			flag = false;
	//   71  165:iconst_0        
	//   72  166:istore_2        
		if(flag)
	//*  73  167:iload_2         
	//*  74  168:ifeq            176
			mDisplayHomeAsUpSet = true;
	//   75  171:aload_0         
	//   76  172:iconst_1        
	//   77  173:putfield        #359 <Field boolean mDisplayHomeAsUpSet>
		view = ((View) (ActionBarPolicy.get(mContext)));
	//   78  176:aload_0         
	//   79  177:getfield        #242 <Field Context mContext>
	//   80  180:invokestatic    #364 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//   81  183:astore_1        
		boolean flag1;
		if(((ActionBarPolicy) (view)).enableHomeButtonByDefault() || flag)
	//*  82  184:aload_1         
	//*  83  185:invokevirtual   #367 <Method boolean ActionBarPolicy.enableHomeButtonByDefault()>
	//*  84  188:ifne            195
	//*  85  191:iload_2         
	//*  86  192:ifeq            200
			flag1 = true;
	//   87  195:iconst_1        
	//   88  196:istore_3        
		else
	//*  89  197:goto            202
			flag1 = false;
	//   90  200:iconst_0        
	//   91  201:istore_3        
		setHomeButtonEnabled(flag1);
	//   92  202:aload_0         
	//   93  203:iload_3         
	//   94  204:invokevirtual   #370 <Method void setHomeButtonEnabled(boolean)>
		setHasEmbeddedTabs(((ActionBarPolicy) (view)).hasEmbeddedTabs());
	//   95  207:aload_0         
	//   96  208:aload_1         
	//   97  209:invokevirtual   #373 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//   98  212:invokespecial   #376 <Method void setHasEmbeddedTabs(boolean)>
		view = ((View) (mContext.obtainStyledAttributes(((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0)));
	//   99  215:aload_0         
	//  100  216:getfield        #242 <Field Context mContext>
	//  101  219:aconst_null     
	//  102  220:getstatic       #382 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//  103  223:getstatic       #387 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//  104  226:iconst_0        
	//  105  227:invokevirtual   #393 <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//  106  230:astore_1        
		if(((TypedArray) (view)).getBoolean(android.support.v7.appcompat.R.styleable.ActionBar_hideOnContentScroll, false))
	//* 107  231:aload_1         
	//* 108  232:getstatic       #396 <Field int android.support.v7.appcompat.R$styleable.ActionBar_hideOnContentScroll>
	//* 109  235:iconst_0        
	//* 110  236:invokevirtual   #402 <Method boolean TypedArray.getBoolean(int, boolean)>
	//* 111  239:ifeq            247
			setHideOnContentScrollEnabled(true);
	//  112  242:aload_0         
	//  113  243:iconst_1        
	//  114  244:invokevirtual   #405 <Method void setHideOnContentScrollEnabled(boolean)>
		int i = ((TypedArray) (view)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_elevation, 0);
	//  115  247:aload_1         
	//  116  248:getstatic       #408 <Field int android.support.v7.appcompat.R$styleable.ActionBar_elevation>
	//  117  251:iconst_0        
	//  118  252:invokevirtual   #412 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  119  255:istore_2        
		if(i != 0)
	//* 120  256:iload_2         
	//* 121  257:ifeq            266
			setElevation(i);
	//  122  260:aload_0         
	//  123  261:iload_2         
	//  124  262:i2f             
	//  125  263:invokevirtual   #416 <Method void setElevation(float)>
		((TypedArray) (view)).recycle();
	//  126  266:aload_1         
	//  127  267:invokevirtual   #419 <Method void TypedArray.recycle()>
	//  128  270:return          
	}

	private void setHasEmbeddedTabs(boolean flag)
	{
		mHasEmbeddedTabs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #247 <Field boolean mHasEmbeddedTabs>
		if(!mHasEmbeddedTabs)
	//*   3    5:aload_0         
	//*   4    6:getfield        #247 <Field boolean mHasEmbeddedTabs>
	//*   5    9:ifne            36
		{
			mDecorToolbar.setEmbeddedTabView(((ScrollingTabContainerView) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    8   16:aconst_null     
	//    9   17:invokeinterface #258 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
			mContainerView.setTabContainer(mTabScrollView);
	//   10   22:aload_0         
	//   11   23:getfield        #270 <Field ActionBarContainer mContainerView>
	//   12   26:aload_0         
	//   13   27:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   14   30:invokevirtual   #275 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
		} else
	//*  15   33:goto            57
		{
			mContainerView.setTabContainer(((ScrollingTabContainerView) (null)));
	//   16   36:aload_0         
	//   17   37:getfield        #270 <Field ActionBarContainer mContainerView>
	//   18   40:aconst_null     
	//   19   41:invokevirtual   #275 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
			mDecorToolbar.setEmbeddedTabView(mTabScrollView);
	//   20   44:aload_0         
	//   21   45:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   22   48:aload_0         
	//   23   49:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   24   52:invokeinterface #258 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
		}
		boolean flag1;
		if(getNavigationMode() == 2)
	//*  25   57:aload_0         
	//*  26   58:invokevirtual   #261 <Method int getNavigationMode()>
	//*  27   61:iconst_2        
	//*  28   62:icmpne          70
			flag1 = true;
	//   29   65:iconst_1        
	//   30   66:istore_2        
		else
	//*  31   67:goto            72
			flag1 = false;
	//   32   70:iconst_0        
	//   33   71:istore_2        
		if(mTabScrollView != null)
	//*  34   72:aload_0         
	//*  35   73:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//*  36   76:ifnull          117
			if(flag1)
	//*  37   79:iload_2         
	//*  38   80:ifeq            108
			{
				mTabScrollView.setVisibility(0);
	//   39   83:aload_0         
	//   40   84:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   41   87:iconst_0        
	//   42   88:invokevirtual   #250 <Method void ScrollingTabContainerView.setVisibility(int)>
				if(mOverlayLayout != null)
	//*  43   91:aload_0         
	//*  44   92:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  45   95:ifnull          117
					ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//   46   98:aload_0         
	//   47   99:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   48  102:invokestatic    #268 <Method void ViewCompat.requestApplyInsets(View)>
			} else
	//*  49  105:goto            117
			{
				mTabScrollView.setVisibility(8);
	//   50  108:aload_0         
	//   51  109:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   52  112:bipush          8
	//   53  114:invokevirtual   #250 <Method void ScrollingTabContainerView.setVisibility(int)>
			}
		Object obj = ((Object) (mDecorToolbar));
	//   54  117:aload_0         
	//   55  118:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   56  121:astore_3        
		if(!mHasEmbeddedTabs && flag1)
	//*  57  122:aload_0         
	//*  58  123:getfield        #247 <Field boolean mHasEmbeddedTabs>
	//*  59  126:ifne            138
	//*  60  129:iload_2         
	//*  61  130:ifeq            138
			flag = true;
	//   62  133:iconst_1        
	//   63  134:istore_1        
		else
	//*  64  135:goto            140
			flag = false;
	//   65  138:iconst_0        
	//   66  139:istore_1        
		((DecorToolbar) (obj)).setCollapsible(flag);
	//   67  140:aload_3         
	//   68  141:iload_1         
	//   69  142:invokeinterface #422 <Method void DecorToolbar.setCollapsible(boolean)>
		obj = ((Object) (mOverlayLayout));
	//   70  147:aload_0         
	//   71  148:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   72  151:astore_3        
		if(!mHasEmbeddedTabs && flag1)
	//*  73  152:aload_0         
	//*  74  153:getfield        #247 <Field boolean mHasEmbeddedTabs>
	//*  75  156:ifne            168
	//*  76  159:iload_2         
	//*  77  160:ifeq            168
			flag = true;
	//   78  163:iconst_1        
	//   79  164:istore_1        
		else
	//*  80  165:goto            170
			flag = false;
	//   81  168:iconst_0        
	//   82  169:istore_1        
		((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
	//   83  170:aload_3         
	//   84  171:iload_1         
	//   85  172:invokevirtual   #425 <Method void ActionBarOverlayLayout.setHasNonEmbeddedTabs(boolean)>
	//   86  175:return          
	}

	private boolean shouldAnimateContextView()
	{
		return ViewCompat.isLaidOut(((View) (mContainerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field ActionBarContainer mContainerView>
	//    2    4:invokestatic    #430 <Method boolean ViewCompat.isLaidOut(View)>
	//    3    7:ireturn         
	}

	private void showForActionMode()
	{
		if(!mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #313 <Field boolean mShowingForMode>
	//*   2    4:ifne            32
		{
			mShowingForMode = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #313 <Field boolean mShowingForMode>
			if(mOverlayLayout != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   8   16:ifnull          27
				mOverlayLayout.setShowingForActionMode(true);
	//    9   19:aload_0         
	//   10   20:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #319 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokespecial   #322 <Method void updateVisibility(boolean)>
		}
	//   16   32:return          
	}

	private void updateVisibility(boolean flag)
	{
		if(checkShowingFlags(mHiddenByApp, mHiddenBySystem, mShowingForMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #433 <Field boolean mHiddenByApp>
	//*   2    4:aload_0         
	//*   3    5:getfield        #435 <Field boolean mHiddenBySystem>
	//*   4    8:aload_0         
	//*   5    9:getfield        #313 <Field boolean mShowingForMode>
	//*   6   12:invokestatic    #437 <Method boolean checkShowingFlags(boolean, boolean, boolean)>
	//*   7   15:ifeq            36
		{
			if(!mNowShowing)
	//*   8   18:aload_0         
	//*   9   19:getfield        #140 <Field boolean mNowShowing>
	//*  10   22:ifne            53
			{
				mNowShowing = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #140 <Field boolean mNowShowing>
				doShow(flag);
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:invokevirtual   #440 <Method void doShow(boolean)>
				return;
	//   17   35:return          
			}
		} else
		if(mNowShowing)
	//*  18   36:aload_0         
	//*  19   37:getfield        #140 <Field boolean mNowShowing>
	//*  20   40:ifeq            53
		{
			mNowShowing = false;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #140 <Field boolean mNowShowing>
			doHide(flag);
	//   24   48:aload_0         
	//   25   49:iload_1         
	//   26   50:invokevirtual   #443 <Method void doHide(boolean)>
		}
	//   27   53:return          
	}

	public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.add(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #448 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addTab(ActionBar.Tab tab)
	{
		addTab(tab, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #130 <Field ArrayList mTabs>
	//    4    6:invokevirtual   #452 <Method boolean ArrayList.isEmpty()>
	//    5    9:invokevirtual   #455 <Method void addTab(ActionBar$Tab, boolean)>
	//    6   12:return          
	}

	public void addTab(ActionBar.Tab tab, int i)
	{
		addTab(tab, i, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #130 <Field ArrayList mTabs>
	//    5    7:invokevirtual   #452 <Method boolean ArrayList.isEmpty()>
	//    6   10:invokevirtual   #458 <Method void addTab(ActionBar$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addTab(ActionBar.Tab tab, int i, boolean flag)
	{
		ensureTabsExist();
	//    0    0:aload_0         
	//    1    1:invokespecial   #460 <Method void ensureTabsExist()>
		mTabScrollView.addTab(tab, i, flag);
	//    2    4:aload_0         
	//    3    5:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #461 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, int, boolean)>
		configureTab(tab, i);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #463 <Method void configureTab(ActionBar$Tab, int)>
		if(flag)
	//*  12   20:iload_3         
	//*  13   21:ifeq            29
			selectTab(tab);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #200 <Method void selectTab(ActionBar$Tab)>
	//   17   29:return          
	}

	public void addTab(ActionBar.Tab tab, boolean flag)
	{
		ensureTabsExist();
	//    0    0:aload_0         
	//    1    1:invokespecial   #460 <Method void ensureTabsExist()>
		mTabScrollView.addTab(tab, flag);
	//    2    4:aload_0         
	//    3    5:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #464 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, boolean)>
		configureTab(tab, mTabs.size());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #130 <Field ArrayList mTabs>
	//   11   19:invokevirtual   #235 <Method int ArrayList.size()>
	//   12   22:invokespecial   #463 <Method void configureTab(ActionBar$Tab, int)>
		if(flag)
	//*  13   25:iload_2         
	//*  14   26:ifeq            34
			selectTab(tab);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #200 <Method void selectTab(ActionBar$Tab)>
	//   18   34:return          
	}

	public void animateToMode(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			showForActionMode();
	//    2    4:aload_0         
	//    3    5:invokespecial   #467 <Method void showForActionMode()>
		else
	//*   4    8:goto            15
			hideForActionMode();
	//    5   11:aload_0         
	//    6   12:invokespecial   #469 <Method void hideForActionMode()>
		if(shouldAnimateContextView())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #471 <Method boolean shouldAnimateContextView()>
	//*   9   19:ifeq            105
		{
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat;
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat1;
			if(flag)
	//*  10   22:iload_1         
	//*  11   23:ifeq            55
			{
				viewpropertyanimatorcompat1 = mDecorToolbar.setupAnimatorToVisibility(4, 100L);
	//   12   26:aload_0         
	//   13   27:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   14   30:iconst_4        
	//   15   31:ldc2w           #31  <Long 100L>
	//   16   34:invokeinterface #475 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//   17   39:astore_3        
				viewpropertyanimatorcompat = mContextView.setupAnimatorToVisibility(0, 200L);
	//   18   40:aload_0         
	//   19   41:getfield        #343 <Field ActionBarContextView mContextView>
	//   20   44:iconst_0        
	//   21   45:ldc2w           #28  <Long 200L>
	//   22   48:invokevirtual   #476 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//   23   51:astore_2        
			} else
	//*  24   52:goto            82
			{
				viewpropertyanimatorcompat = mDecorToolbar.setupAnimatorToVisibility(0, 200L);
	//   25   55:aload_0         
	//   26   56:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   27   59:iconst_0        
	//   28   60:ldc2w           #28  <Long 200L>
	//   29   63:invokeinterface #475 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//   30   68:astore_2        
				viewpropertyanimatorcompat1 = mContextView.setupAnimatorToVisibility(8, 100L);
	//   31   69:aload_0         
	//   32   70:getfield        #343 <Field ActionBarContextView mContextView>
	//   33   73:bipush          8
	//   34   75:ldc2w           #31  <Long 100L>
	//   35   78:invokevirtual   #476 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//   36   81:astore_3        
			}
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   37   82:new             #478 <Class ViewPropertyAnimatorCompatSet>
	//   38   85:dup             
	//   39   86:invokespecial   #479 <Method void ViewPropertyAnimatorCompatSet()>
	//   40   89:astore          4
			viewpropertyanimatorcompatset.playSequentially(viewpropertyanimatorcompat1, viewpropertyanimatorcompat);
	//   41   91:aload           4
	//   42   93:aload_3         
	//   43   94:aload_2         
	//   44   95:invokevirtual   #483 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.playSequentially(ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompat)>
	//   45   98:pop             
			viewpropertyanimatorcompatset.start();
	//   46   99:aload           4
	//   47  101:invokevirtual   #486 <Method void ViewPropertyAnimatorCompatSet.start()>
			return;
	//   48  104:return          
		}
		if(flag)
	//*  49  105:iload_1         
	//*  50  106:ifeq            128
		{
			mDecorToolbar.setVisibility(4);
	//   51  109:aload_0         
	//   52  110:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   53  113:iconst_4        
	//   54  114:invokeinterface #487 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(0);
	//   55  119:aload_0         
	//   56  120:getfield        #343 <Field ActionBarContextView mContextView>
	//   57  123:iconst_0        
	//   58  124:invokevirtual   #488 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   59  127:return          
		} else
		{
			mDecorToolbar.setVisibility(0);
	//   60  128:aload_0         
	//   61  129:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   62  132:iconst_0        
	//   63  133:invokeinterface #487 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(8);
	//   64  138:aload_0         
	//   65  139:getfield        #343 <Field ActionBarContextView mContextView>
	//   66  142:bipush          8
	//   67  144:invokevirtual   #488 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   68  147:return          
		}
	}

	public boolean collapseActionView()
	{
		if(mDecorToolbar != null && mDecorToolbar.hasExpandedActionView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//*   5   11:invokeinterface #492 <Method boolean DecorToolbar.hasExpandedActionView()>
	//*   6   16:ifeq            30
		{
			mDecorToolbar.collapseActionView();
	//    7   19:aload_0         
	//    8   20:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    9   23:invokeinterface #494 <Method void DecorToolbar.collapseActionView()>
			return true;
	//   10   28:iconst_1        
	//   11   29:ireturn         
		} else
		{
			return false;
	//   12   30:iconst_0        
	//   13   31:ireturn         
		}
	}

	void completeDeferredDestroyActionMode()
	{
		if(mDeferredModeDestroyCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #497 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
	//*   2    4:ifnull          30
		{
			mDeferredModeDestroyCallback.onDestroyActionMode(mDeferredDestroyActionMode);
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
	//    5   11:aload_0         
	//    6   12:getfield        #499 <Field ActionMode mDeferredDestroyActionMode>
	//    7   15:invokeinterface #505 <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
			mDeferredDestroyActionMode = null;
	//    8   20:aload_0         
	//    9   21:aconst_null     
	//   10   22:putfield        #499 <Field ActionMode mDeferredDestroyActionMode>
			mDeferredModeDestroyCallback = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #497 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
		}
	//   14   30:return          
	}

	public void dispatchMenuVisibilityChanged(boolean flag)
	{
		if(flag == mLastMenuVisibility)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #508 <Field boolean mLastMenuVisibility>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mLastMenuVisibility = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #508 <Field boolean mLastMenuVisibility>
		int j = mMenuVisibilityListeners.size();
	//    8   14:aload_0         
	//    9   15:getfield        #134 <Field ArrayList mMenuVisibilityListeners>
	//   10   18:invokevirtual   #235 <Method int ArrayList.size()>
	//   11   21:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:iload_2         
	//*  15   25:iload_3         
	//*  16   26:icmpge          53
			((ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
	//   17   29:aload_0         
	//   18   30:getfield        #134 <Field ArrayList mMenuVisibilityListeners>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//   21   37:checkcast       #510 <Class ActionBar$OnMenuVisibilityListener>
	//   22   40:iload_1         
	//   23   41:invokeinterface #513 <Method void ActionBar$OnMenuVisibilityListener.onMenuVisibilityChanged(boolean)>

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
	//*  28   50:goto            24
	//   29   53:return          
	}

	public void doHide(boolean flag)
	{
		if(mCurrentShowAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   2    4:ifnull          14
			mCurrentShowAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    5   11:invokevirtual   #518 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		if(mCurWindowVisibility == 0 && ALLOW_SHOW_HIDE_ANIMATIONS && (mShowHideAnimationEnabled || flag))
	//*   6   14:aload_0         
	//*   7   15:getfield        #136 <Field int mCurWindowVisibility>
	//*   8   18:ifne            214
	//*   9   21:getstatic       #122 <Field boolean ALLOW_SHOW_HIDE_ANIMATIONS>
	//*  10   24:ifeq            214
	//*  11   27:aload_0         
	//*  12   28:getfield        #520 <Field boolean mShowHideAnimationEnabled>
	//*  13   31:ifne            38
	//*  14   34:iload_1         
	//*  15   35:ifeq            214
		{
			mContainerView.setAlpha(1.0F);
	//   16   38:aload_0         
	//   17   39:getfield        #270 <Field ActionBarContainer mContainerView>
	//   18   42:fconst_1        
	//   19   43:invokevirtual   #523 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTransitioning(true);
	//   20   46:aload_0         
	//   21   47:getfield        #270 <Field ActionBarContainer mContainerView>
	//   22   50:iconst_1        
	//   23   51:invokevirtual   #526 <Method void ActionBarContainer.setTransitioning(boolean)>
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   24   54:new             #478 <Class ViewPropertyAnimatorCompatSet>
	//   25   57:dup             
	//   26   58:invokespecial   #479 <Method void ViewPropertyAnimatorCompatSet()>
	//   27   61:astore          4
			float f1 = -mContainerView.getHeight();
	//   28   63:aload_0         
	//   29   64:getfield        #270 <Field ActionBarContainer mContainerView>
	//   30   67:invokevirtual   #529 <Method int ActionBarContainer.getHeight()>
	//   31   70:ineg            
	//   32   71:i2f             
	//   33   72:fstore_3        
			float f = f1;
	//   34   73:fload_3         
	//   35   74:fstore_2        
			if(flag)
	//*  36   75:iload_1         
	//*  37   76:ifeq            112
			{
				int ai[] = new int[2];
	//   38   79:iconst_2        
	//   39   80:newarray        int[]
	//   40   82:astore          5
				int[] _tmp = ai;
	//   41   84:aload           5
	//   42   86:dup             
	//   43   87:iconst_0        
	//   44   88:iconst_0        
	//   45   89:iastore         
	//   46   90:dup             
	//   47   91:iconst_1        
	//   48   92:iconst_0        
	//   49   93:iastore         
	//   50   94:pop             
				ai[0] = 0;
				ai[1] = 0;
				mContainerView.getLocationInWindow(ai);
	//   51   95:aload_0         
	//   52   96:getfield        #270 <Field ActionBarContainer mContainerView>
	//   53   99:aload           5
	//   54  101:invokevirtual   #533 <Method void ActionBarContainer.getLocationInWindow(int[])>
				f = f1 - (float)ai[1];
	//   55  104:fload_3         
	//   56  105:aload           5
	//   57  107:iconst_1        
	//   58  108:iaload          
	//   59  109:i2f             
	//   60  110:fsub            
	//   61  111:fstore_2        
			}
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mContainerView))).translationY(f);
	//   62  112:aload_0         
	//   63  113:getfield        #270 <Field ActionBarContainer mContainerView>
	//   64  116:invokestatic    #537 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   65  119:fload_2         
	//   66  120:invokevirtual   #543 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   67  123:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   68  125:aload           5
	//   69  127:aload_0         
	//   70  128:getfield        #151 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   71  131:invokevirtual   #547 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   72  134:pop             
			viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat);
	//   73  135:aload           4
	//   74  137:aload           5
	//   75  139:invokevirtual   #551 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   76  142:pop             
			if(mContentAnimations && mContentView != null)
	//*  77  143:aload_0         
	//*  78  144:getfield        #138 <Field boolean mContentAnimations>
	//*  79  147:ifeq            174
	//*  80  150:aload_0         
	//*  81  151:getfield        #178 <Field View mContentView>
	//*  82  154:ifnull          174
				viewpropertyanimatorcompatset.play(ViewCompat.animate(mContentView).translationY(f));
	//   83  157:aload           4
	//   84  159:aload_0         
	//   85  160:getfield        #178 <Field View mContentView>
	//   86  163:invokestatic    #537 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   87  166:fload_2         
	//   88  167:invokevirtual   #543 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   89  170:invokevirtual   #551 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   90  173:pop             
			viewpropertyanimatorcompatset.setInterpolator(sHideInterpolator);
	//   91  174:aload           4
	//   92  176:getstatic       #110 <Field Interpolator sHideInterpolator>
	//   93  179:invokevirtual   #555 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//   94  182:pop             
			viewpropertyanimatorcompatset.setDuration(250L);
	//   95  183:aload           4
	//   96  185:ldc2w           #556 <Long 250L>
	//   97  188:invokevirtual   #561 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//   98  191:pop             
			viewpropertyanimatorcompatset.setListener(mHideListener);
	//   99  192:aload           4
	//  100  194:aload_0         
	//  101  195:getfield        #145 <Field ViewPropertyAnimatorListener mHideListener>
	//  102  198:invokevirtual   #565 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  103  201:pop             
			mCurrentShowAnim = viewpropertyanimatorcompatset;
	//  104  202:aload_0         
	//  105  203:aload           4
	//  106  205:putfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			viewpropertyanimatorcompatset.start();
	//  107  208:aload           4
	//  108  210:invokevirtual   #486 <Method void ViewPropertyAnimatorCompatSet.start()>
			return;
	//  109  213:return          
		} else
		{
			mHideListener.onAnimationEnd(((View) (null)));
	//  110  214:aload_0         
	//  111  215:getfield        #145 <Field ViewPropertyAnimatorListener mHideListener>
	//  112  218:aconst_null     
	//  113  219:invokeinterface #570 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
			return;
	//  114  224:return          
		}
	}

	public void doShow(boolean flag)
	{
		if(mCurrentShowAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   2    4:ifnull          14
			mCurrentShowAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    5   11:invokevirtual   #518 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		mContainerView.setVisibility(0);
	//    6   14:aload_0         
	//    7   15:getfield        #270 <Field ActionBarContainer mContainerView>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #571 <Method void ActionBarContainer.setVisibility(int)>
		if(mCurWindowVisibility == 0 && ALLOW_SHOW_HIDE_ANIMATIONS && (mShowHideAnimationEnabled || flag))
	//*  10   22:aload_0         
	//*  11   23:getfield        #136 <Field int mCurWindowVisibility>
	//*  12   26:ifne            232
	//*  13   29:getstatic       #122 <Field boolean ALLOW_SHOW_HIDE_ANIMATIONS>
	//*  14   32:ifeq            232
	//*  15   35:aload_0         
	//*  16   36:getfield        #520 <Field boolean mShowHideAnimationEnabled>
	//*  17   39:ifne            46
	//*  18   42:iload_1         
	//*  19   43:ifeq            232
		{
			mContainerView.setTranslationY(0.0F);
	//   20   46:aload_0         
	//   21   47:getfield        #270 <Field ActionBarContainer mContainerView>
	//   22   50:fconst_0        
	//   23   51:invokevirtual   #574 <Method void ActionBarContainer.setTranslationY(float)>
			float f1 = -mContainerView.getHeight();
	//   24   54:aload_0         
	//   25   55:getfield        #270 <Field ActionBarContainer mContainerView>
	//   26   58:invokevirtual   #529 <Method int ActionBarContainer.getHeight()>
	//   27   61:ineg            
	//   28   62:i2f             
	//   29   63:fstore_3        
			float f = f1;
	//   30   64:fload_3         
	//   31   65:fstore_2        
			if(flag)
	//*  32   66:iload_1         
	//*  33   67:ifeq            103
			{
				int ai[] = new int[2];
	//   34   70:iconst_2        
	//   35   71:newarray        int[]
	//   36   73:astore          4
				int[] _tmp = ai;
	//   37   75:aload           4
	//   38   77:dup             
	//   39   78:iconst_0        
	//   40   79:iconst_0        
	//   41   80:iastore         
	//   42   81:dup             
	//   43   82:iconst_1        
	//   44   83:iconst_0        
	//   45   84:iastore         
	//   46   85:pop             
				ai[0] = 0;
				ai[1] = 0;
				mContainerView.getLocationInWindow(ai);
	//   47   86:aload_0         
	//   48   87:getfield        #270 <Field ActionBarContainer mContainerView>
	//   49   90:aload           4
	//   50   92:invokevirtual   #533 <Method void ActionBarContainer.getLocationInWindow(int[])>
				f = f1 - (float)ai[1];
	//   51   95:fload_3         
	//   52   96:aload           4
	//   53   98:iconst_1        
	//   54   99:iaload          
	//   55  100:i2f             
	//   56  101:fsub            
	//   57  102:fstore_2        
			}
			mContainerView.setTranslationY(f);
	//   58  103:aload_0         
	//   59  104:getfield        #270 <Field ActionBarContainer mContainerView>
	//   60  107:fload_2         
	//   61  108:invokevirtual   #574 <Method void ActionBarContainer.setTranslationY(float)>
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   62  111:new             #478 <Class ViewPropertyAnimatorCompatSet>
	//   63  114:dup             
	//   64  115:invokespecial   #479 <Method void ViewPropertyAnimatorCompatSet()>
	//   65  118:astore          4
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mContainerView))).translationY(0.0F);
	//   66  120:aload_0         
	//   67  121:getfield        #270 <Field ActionBarContainer mContainerView>
	//   68  124:invokestatic    #537 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   69  127:fconst_0        
	//   70  128:invokevirtual   #543 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   71  131:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   72  133:aload           5
	//   73  135:aload_0         
	//   74  136:getfield        #151 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   75  139:invokevirtual   #547 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   76  142:pop             
			viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat);
	//   77  143:aload           4
	//   78  145:aload           5
	//   79  147:invokevirtual   #551 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   80  150:pop             
			if(mContentAnimations && mContentView != null)
	//*  81  151:aload_0         
	//*  82  152:getfield        #138 <Field boolean mContentAnimations>
	//*  83  155:ifeq            190
	//*  84  158:aload_0         
	//*  85  159:getfield        #178 <Field View mContentView>
	//*  86  162:ifnull          190
			{
				mContentView.setTranslationY(f);
	//   87  165:aload_0         
	//   88  166:getfield        #178 <Field View mContentView>
	//   89  169:fload_2         
	//   90  170:invokevirtual   #575 <Method void View.setTranslationY(float)>
				viewpropertyanimatorcompatset.play(ViewCompat.animate(mContentView).translationY(0.0F));
	//   91  173:aload           4
	//   92  175:aload_0         
	//   93  176:getfield        #178 <Field View mContentView>
	//   94  179:invokestatic    #537 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   95  182:fconst_0        
	//   96  183:invokevirtual   #543 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   97  186:invokevirtual   #551 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   98  189:pop             
			}
			viewpropertyanimatorcompatset.setInterpolator(sShowInterpolator);
	//   99  190:aload           4
	//  100  192:getstatic       #115 <Field Interpolator sShowInterpolator>
	//  101  195:invokevirtual   #555 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//  102  198:pop             
			viewpropertyanimatorcompatset.setDuration(250L);
	//  103  199:aload           4
	//  104  201:ldc2w           #556 <Long 250L>
	//  105  204:invokevirtual   #561 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//  106  207:pop             
			viewpropertyanimatorcompatset.setListener(mShowListener);
	//  107  208:aload           4
	//  108  210:aload_0         
	//  109  211:getfield        #148 <Field ViewPropertyAnimatorListener mShowListener>
	//  110  214:invokevirtual   #565 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  111  217:pop             
			mCurrentShowAnim = viewpropertyanimatorcompatset;
	//  112  218:aload_0         
	//  113  219:aload           4
	//  114  221:putfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			viewpropertyanimatorcompatset.start();
	//  115  224:aload           4
	//  116  226:invokevirtual   #486 <Method void ViewPropertyAnimatorCompatSet.start()>
		} else
	//* 117  229:goto            280
		{
			mContainerView.setAlpha(1.0F);
	//  118  232:aload_0         
	//  119  233:getfield        #270 <Field ActionBarContainer mContainerView>
	//  120  236:fconst_1        
	//  121  237:invokevirtual   #523 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTranslationY(0.0F);
	//  122  240:aload_0         
	//  123  241:getfield        #270 <Field ActionBarContainer mContainerView>
	//  124  244:fconst_0        
	//  125  245:invokevirtual   #574 <Method void ActionBarContainer.setTranslationY(float)>
			if(mContentAnimations && mContentView != null)
	//* 126  248:aload_0         
	//* 127  249:getfield        #138 <Field boolean mContentAnimations>
	//* 128  252:ifeq            270
	//* 129  255:aload_0         
	//* 130  256:getfield        #178 <Field View mContentView>
	//* 131  259:ifnull          270
				mContentView.setTranslationY(0.0F);
	//  132  262:aload_0         
	//  133  263:getfield        #178 <Field View mContentView>
	//  134  266:fconst_0        
	//  135  267:invokevirtual   #575 <Method void View.setTranslationY(float)>
			mShowListener.onAnimationEnd(((View) (null)));
	//  136  270:aload_0         
	//  137  271:getfield        #148 <Field ViewPropertyAnimatorListener mShowListener>
	//  138  274:aconst_null     
	//  139  275:invokeinterface #570 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
		}
		if(mOverlayLayout != null)
	//* 140  280:aload_0         
	//* 141  281:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//* 142  284:ifnull          294
			ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//  143  287:aload_0         
	//  144  288:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//  145  291:invokestatic    #268 <Method void ViewCompat.requestApplyInsets(View)>
	//  146  294:return          
	}

	public void enableContentAnimations(boolean flag)
	{
		mContentAnimations = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #138 <Field boolean mContentAnimations>
	//    3    5:return          
	}

	public View getCustomView()
	{
		return mDecorToolbar.getCustomView();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #579 <Method View DecorToolbar.getCustomView()>
	//    3    9:areturn         
	}

	public int getDisplayOptions()
	{
		return mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #357 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:ireturn         
	}

	public float getElevation()
	{
		return ViewCompat.getElevation(((View) (mContainerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field ActionBarContainer mContainerView>
	//    2    4:invokestatic    #584 <Method float ViewCompat.getElevation(View)>
	//    3    7:freturn         
	}

	public int getHeight()
	{
		return mContainerView.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field ActionBarContainer mContainerView>
	//    2    4:invokevirtual   #529 <Method int ActionBarContainer.getHeight()>
	//    3    7:ireturn         
	}

	public int getHideOffset()
	{
		return mOverlayLayout.getActionBarHideOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//    2    4:invokevirtual   #588 <Method int ActionBarOverlayLayout.getActionBarHideOffset()>
	//    3    7:ireturn         
	}

	public int getNavigationItemCount()
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #590 <Method int DecorToolbar.getNavigationMode()>
		{
	//*   3    9:lookupswitch    2: default 36
	//	               1: 47
	//	               2: 39
	//*   4   36:goto            57
		case 2: // '\002'
			return mTabs.size();
	//    5   39:aload_0         
	//    6   40:getfield        #130 <Field ArrayList mTabs>
	//    7   43:invokevirtual   #235 <Method int ArrayList.size()>
	//    8   46:ireturn         

		case 1: // '\001'
			return mDecorToolbar.getDropdownItemCount();
	//    9   47:aload_0         
	//   10   48:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   11   51:invokeinterface #593 <Method int DecorToolbar.getDropdownItemCount()>
	//   12   56:ireturn         
		}
		return 0;
	//   13   57:iconst_0        
	//   14   58:ireturn         
	}

	public int getNavigationMode()
	{
		return mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #590 <Method int DecorToolbar.getNavigationMode()>
	//    3    9:ireturn         
	}

	public int getSelectedNavigationIndex()
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #590 <Method int DecorToolbar.getNavigationMode()>
		{
	//*   3    9:lookupswitch    2: default 36
	//	               1: 56
	//	               2: 39
	//*   4   36:goto            66
		case 2: // '\002'
			if(mSelectedTab != null)
	//*   5   39:aload_0         
	//*   6   40:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*   7   43:ifnull          54
				return mSelectedTab.getPosition();
	//    8   46:aload_0         
	//    9   47:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   10   50:invokevirtual   #597 <Method int WindowDecorActionBar$TabImpl.getPosition()>
	//   11   53:ireturn         
			else
				return -1;
	//   12   54:iconst_m1       
	//   13   55:ireturn         

		case 1: // '\001'
			return mDecorToolbar.getDropdownSelectedPosition();
	//   14   56:aload_0         
	//   15   57:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   16   60:invokeinterface #600 <Method int DecorToolbar.getDropdownSelectedPosition()>
	//   17   65:ireturn         
		}
		return -1;
	//   18   66:iconst_m1       
	//   19   67:ireturn         
	}

	public ActionBar.Tab getSelectedTab()
	{
		return ((ActionBar.Tab) (mSelectedTab));
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//    2    4:areturn         
	}

	public CharSequence getSubtitle()
	{
		return mDecorToolbar.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #606 <Method CharSequence DecorToolbar.getSubtitle()>
	//    3    9:areturn         
	}

	public ActionBar.Tab getTabAt(int i)
	{
		return (ActionBar.Tab)mTabs.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field ArrayList mTabs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #610 <Class ActionBar$Tab>
	//    5   11:areturn         
	}

	public int getTabCount()
	{
		return mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field ArrayList mTabs>
	//    2    4:invokevirtual   #235 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public Context getThemedContext()
	{
		if(mThemedContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #614 <Field Context mThemedContext>
	//*   2    4:ifnonnull       67
		{
			TypedValue typedvalue = new TypedValue();
	//    3    7:new             #616 <Class TypedValue>
	//    4   10:dup             
	//    5   11:invokespecial   #617 <Method void TypedValue()>
	//    6   14:astore_2        
			mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//    7   15:aload_0         
	//    8   16:getfield        #242 <Field Context mContext>
	//    9   19:invokevirtual   #621 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   22:getstatic       #624 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   11   25:aload_2         
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #630 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   30:pop             
			int i = typedvalue.resourceId;
	//   15   31:aload_2         
	//   16   32:getfield        #633 <Field int TypedValue.resourceId>
	//   17   35:istore_1        
			if(i != 0)
	//*  18   36:iload_1         
	//*  19   37:ifeq            59
				mThemedContext = ((Context) (new ContextThemeWrapper(mContext, i)));
	//   20   40:aload_0         
	//   21   41:new             #635 <Class ContextThemeWrapper>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #242 <Field Context mContext>
	//   25   49:iload_1         
	//   26   50:invokespecial   #638 <Method void ContextThemeWrapper(Context, int)>
	//   27   53:putfield        #614 <Field Context mThemedContext>
			else
	//*  28   56:goto            67
				mThemedContext = mContext;
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #242 <Field Context mContext>
	//   32   64:putfield        #614 <Field Context mThemedContext>
		}
		return mThemedContext;
	//   33   67:aload_0         
	//   34   68:getfield        #614 <Field Context mThemedContext>
	//   35   71:areturn         
	}

	public CharSequence getTitle()
	{
		return mDecorToolbar.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #641 <Method CharSequence DecorToolbar.getTitle()>
	//    3    9:areturn         
	}

	public boolean hasIcon()
	{
		return mDecorToolbar.hasIcon();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #644 <Method boolean DecorToolbar.hasIcon()>
	//    3    9:ireturn         
	}

	public boolean hasLogo()
	{
		return mDecorToolbar.hasLogo();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #647 <Method boolean DecorToolbar.hasLogo()>
	//    3    9:ireturn         
	}

	public void hide()
	{
		if(!mHiddenByApp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #433 <Field boolean mHiddenByApp>
	//*   2    4:ifne            17
		{
			mHiddenByApp = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #433 <Field boolean mHiddenByApp>
			updateVisibility(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokespecial   #322 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public void hideForSystem()
	{
		if(!mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #435 <Field boolean mHiddenBySystem>
	//*   2    4:ifne            17
		{
			mHiddenBySystem = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #435 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #322 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public boolean isHideOnContentScrollEnabled()
	{
		return mOverlayLayout.isHideOnContentScrollEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//    2    4:invokevirtual   #652 <Method boolean ActionBarOverlayLayout.isHideOnContentScrollEnabled()>
	//    3    7:ireturn         
	}

	public boolean isShowing()
	{
		int i = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #654 <Method int getHeight()>
	//    2    4:istore_1        
		return mNowShowing && (i == 0 || getHideOffset() < i);
	//    3    5:aload_0         
	//    4    6:getfield        #140 <Field boolean mNowShowing>
	//    5    9:ifeq            26
	//    6   12:iload_1         
	//    7   13:ifeq            24
	//    8   16:aload_0         
	//    9   17:invokevirtual   #656 <Method int getHideOffset()>
	//   10   20:iload_1         
	//   11   21:icmpge          26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public boolean isTitleTruncated()
	{
		return mDecorToolbar != null && mDecorToolbar.isTitleTruncated();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    5   11:invokeinterface #659 <Method boolean DecorToolbar.isTitleTruncated()>
	//    6   16:ifeq            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public ActionBar.Tab newTab()
	{
		return ((ActionBar.Tab) (new TabImpl()));
	//    0    0:new             #17  <Class WindowDecorActionBar$TabImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #661 <Method void WindowDecorActionBar$TabImpl(WindowDecorActionBar)>
	//    4    8:areturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #242 <Field Context mContext>
	//    3    5:invokestatic    #364 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    4    8:invokevirtual   #373 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//    5   11:invokespecial   #376 <Method void setHasEmbeddedTabs(boolean)>
	//    6   14:return          
	}

	public void onContentScrollStarted()
	{
		if(mCurrentShowAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   2    4:ifnull          19
		{
			mCurrentShowAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    5   11:invokevirtual   #518 <Method void ViewPropertyAnimatorCompatSet.cancel()>
			mCurrentShowAnim = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
		}
	//    9   19:return          
	}

	public void onContentScrollStopped()
	{
	//    0    0:return          
	}

	public void onWindowVisibilityChanged(int i)
	{
		mCurWindowVisibility = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #136 <Field int mCurWindowVisibility>
	//    3    5:return          
	}

	public void removeAllTabs()
	{
		cleanupTabs();
	//    0    0:aload_0         
	//    1    1:invokespecial   #668 <Method void cleanupTabs()>
	//    2    4:return          
	}

	public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.remove(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #672 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTab(ActionBar.Tab tab)
	{
		removeTabAt(tab.getPosition());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #674 <Method int ActionBar$Tab.getPosition()>
	//    3    5:invokevirtual   #677 <Method void removeTabAt(int)>
	//    4    8:return          
	}

	public void removeTabAt(int i)
	{
		if(mTabScrollView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		int j;
		if(mSelectedTab != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*   6   12:ifnull          26
			j = mSelectedTab.getPosition();
	//    7   15:aload_0         
	//    8   16:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//    9   19:invokevirtual   #597 <Method int WindowDecorActionBar$TabImpl.getPosition()>
	//   10   22:istore_2        
		else
	//*  11   23:goto            31
			j = mSavedTabPosition;
	//   12   26:aload_0         
	//   13   27:getfield        #132 <Field int mSavedTabPosition>
	//   14   30:istore_2        
		mTabScrollView.removeTabAt(i);
	//   15   31:aload_0         
	//   16   32:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   17   35:iload_1         
	//   18   36:invokevirtual   #678 <Method void ScrollingTabContainerView.removeTabAt(int)>
		TabImpl tabimpl = (TabImpl)mTabs.remove(i);
	//   19   39:aload_0         
	//   20   40:getfield        #130 <Field ArrayList mTabs>
	//   21   43:iload_1         
	//   22   44:invokevirtual   #680 <Method Object ArrayList.remove(int)>
	//   23   47:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   24   50:astore          5
		if(tabimpl != null)
	//*  25   52:aload           5
	//*  26   54:ifnull          63
			tabimpl.setPosition(-1);
	//   27   57:aload           5
	//   28   59:iconst_m1       
	//   29   60:invokevirtual   #227 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
		int l = mTabs.size();
	//   30   63:aload_0         
	//   31   64:getfield        #130 <Field ArrayList mTabs>
	//   32   67:invokevirtual   #235 <Method int ArrayList.size()>
	//   33   70:istore          4
		for(int k = i; k < l; k++)
	//*  34   72:iload_1         
	//*  35   73:istore_3        
	//*  36   74:iload_3         
	//*  37   75:iload           4
	//*  38   77:icmpge          102
			((TabImpl)mTabs.get(k)).setPosition(k);
	//   39   80:aload_0         
	//   40   81:getfield        #130 <Field ArrayList mTabs>
	//   41   84:iload_3         
	//   42   85:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//   43   88:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   44   91:iload_3         
	//   45   92:invokevirtual   #227 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>

	//   46   95:iload_3         
	//   47   96:iconst_1        
	//   48   97:iadd            
	//   49   98:istore_3        
	//*  50   99:goto            74
		if(j == i)
	//*  51  102:iload_2         
	//*  52  103:iload_1         
	//*  53  104:icmpne          148
		{
			TabImpl tabimpl1;
			if(mTabs.isEmpty())
	//*  54  107:aload_0         
	//*  55  108:getfield        #130 <Field ArrayList mTabs>
	//*  56  111:invokevirtual   #452 <Method boolean ArrayList.isEmpty()>
	//*  57  114:ifeq            123
				tabimpl1 = null;
	//   58  117:aconst_null     
	//   59  118:astore          5
			else
	//*  60  120:goto            142
				tabimpl1 = (TabImpl)mTabs.get(Math.max(0, i - 1));
	//   61  123:aload_0         
	//   62  124:getfield        #130 <Field ArrayList mTabs>
	//   63  127:iconst_0        
	//   64  128:iload_1         
	//   65  129:iconst_1        
	//   66  130:isub            
	//   67  131:invokestatic    #685 <Method int Math.max(int, int)>
	//   68  134:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//   69  137:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   70  140:astore          5
			selectTab(((ActionBar.Tab) (tabimpl1)));
	//   71  142:aload_0         
	//   72  143:aload           5
	//   73  145:invokevirtual   #200 <Method void selectTab(ActionBar$Tab)>
		}
	//   74  148:return          
	}

	public boolean requestFocus()
	{
		ViewGroup viewgroup = mDecorToolbar.getViewGroup();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #690 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:astore_1        
		if(viewgroup != null && !viewgroup.hasFocus())
	//*   4   10:aload_1         
	//*   5   11:ifnull          28
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #695 <Method boolean ViewGroup.hasFocus()>
	//*   8   18:ifne            28
		{
			viewgroup.requestFocus();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #697 <Method boolean ViewGroup.requestFocus()>
	//   11   25:pop             
			return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		} else
		{
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		}
	}

	public void selectTab(ActionBar.Tab tab)
	{
		if(getNavigationMode() != 2)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #261 <Method int getNavigationMode()>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          28
		{
			int i;
			if(tab != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          20
				i = tab.getPosition();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #674 <Method int ActionBar$Tab.getPosition()>
	//    8   16:istore_2        
			else
	//*   9   17:goto            22
				i = -1;
	//   10   20:iconst_m1       
	//   11   21:istore_2        
			mSavedTabPosition = i;
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:putfield        #132 <Field int mSavedTabPosition>
			return;
	//   15   27:return          
		}
		FragmentTransaction fragmenttransaction;
		if((mActivity instanceof FragmentActivity) && !mDecorToolbar.getViewGroup().isInEditMode())
	//*  16   28:aload_0         
	//*  17   29:getfield        #153 <Field Activity mActivity>
	//*  18   32:instanceof      #699 <Class FragmentActivity>
	//*  19   35:ifeq            73
	//*  20   38:aload_0         
	//*  21   39:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//*  22   42:invokeinterface #690 <Method ViewGroup DecorToolbar.getViewGroup()>
	//*  23   47:invokevirtual   #700 <Method boolean ViewGroup.isInEditMode()>
	//*  24   50:ifne            73
			fragmenttransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
	//   25   53:aload_0         
	//   26   54:getfield        #153 <Field Activity mActivity>
	//   27   57:checkcast       #699 <Class FragmentActivity>
	//   28   60:invokevirtual   #704 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   29   63:invokevirtual   #710 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   30   66:invokevirtual   #715 <Method FragmentTransaction FragmentTransaction.disallowAddToBackStack()>
	//   31   69:astore_3        
		else
	//*  32   70:goto            75
			fragmenttransaction = null;
	//   33   73:aconst_null     
	//   34   74:astore_3        
		if(mSelectedTab == tab)
	//*  35   75:aload_0         
	//*  36   76:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  37   79:aload_1         
	//*  38   80:if_acmpne       121
		{
			if(mSelectedTab != null)
	//*  39   83:aload_0         
	//*  40   84:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  41   87:ifnull          203
			{
				mSelectedTab.getCallback().onTabReselected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   42   90:aload_0         
	//   43   91:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   44   94:invokevirtual   #216 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   45   97:aload_0         
	//   46   98:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   47  101:aload_3         
	//   48  102:invokeinterface #721 <Method void ActionBar$TabListener.onTabReselected(ActionBar$Tab, FragmentTransaction)>
				mTabScrollView.animateToTab(tab.getPosition());
	//   49  107:aload_0         
	//   50  108:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   51  111:aload_1         
	//   52  112:invokevirtual   #674 <Method int ActionBar$Tab.getPosition()>
	//   53  115:invokevirtual   #724 <Method void ScrollingTabContainerView.animateToTab(int)>
			}
		} else
	//*  54  118:goto            203
		{
			ScrollingTabContainerView scrollingtabcontainerview = mTabScrollView;
	//   55  121:aload_0         
	//   56  122:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   57  125:astore          4
			int j;
			if(tab != null)
	//*  58  127:aload_1         
	//*  59  128:ifnull          139
				j = tab.getPosition();
	//   60  131:aload_1         
	//   61  132:invokevirtual   #674 <Method int ActionBar$Tab.getPosition()>
	//   62  135:istore_2        
			else
	//*  63  136:goto            141
				j = -1;
	//   64  139:iconst_m1       
	//   65  140:istore_2        
			scrollingtabcontainerview.setTabSelected(j);
	//   66  141:aload           4
	//   67  143:iload_2         
	//   68  144:invokevirtual   #727 <Method void ScrollingTabContainerView.setTabSelected(int)>
			if(mSelectedTab != null)
	//*  69  147:aload_0         
	//*  70  148:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  71  151:ifnull          171
				mSelectedTab.getCallback().onTabUnselected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   72  154:aload_0         
	//   73  155:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   74  158:invokevirtual   #216 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   75  161:aload_0         
	//   76  162:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   77  165:aload_3         
	//   78  166:invokeinterface #730 <Method void ActionBar$TabListener.onTabUnselected(ActionBar$Tab, FragmentTransaction)>
			mSelectedTab = (TabImpl)tab;
	//   79  171:aload_0         
	//   80  172:aload_1         
	//   81  173:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   82  176:putfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
			if(mSelectedTab != null)
	//*  83  179:aload_0         
	//*  84  180:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  85  183:ifnull          203
				mSelectedTab.getCallback().onTabSelected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   86  186:aload_0         
	//   87  187:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   88  190:invokevirtual   #216 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   89  193:aload_0         
	//   90  194:getfield        #196 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   91  197:aload_3         
	//   92  198:invokeinterface #733 <Method void ActionBar$TabListener.onTabSelected(ActionBar$Tab, FragmentTransaction)>
		}
		if(fragmenttransaction != null && !fragmenttransaction.isEmpty())
	//*  93  203:aload_3         
	//*  94  204:ifnull          219
	//*  95  207:aload_3         
	//*  96  208:invokevirtual   #734 <Method boolean FragmentTransaction.isEmpty()>
	//*  97  211:ifne            219
			fragmenttransaction.commit();
	//   98  214:aload_3         
	//   99  215:invokevirtual   #737 <Method int FragmentTransaction.commit()>
	//  100  218:pop             
	//  101  219:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		mContainerView.setPrimaryBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field ActionBarContainer mContainerView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #742 <Method void ActionBarContainer.setPrimaryBackground(Drawable)>
	//    4    8:return          
	}

	public void setCustomView(int i)
	{
		setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, mDecorToolbar.getViewGroup(), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #745 <Method Context getThemedContext()>
	//    3    5:invokestatic    #751 <Method LayoutInflater LayoutInflater.from(Context)>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    7   13:invokeinterface #690 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #755 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   22:invokevirtual   #757 <Method void setCustomView(View)>
	//   11   25:return          
	}

	public void setCustomView(View view)
	{
		mDecorToolbar.setCustomView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #758 <Method void DecorToolbar.setCustomView(View)>
	//    4   10:return          
	}

	public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
	{
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #763 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mDecorToolbar.setCustomView(view);
	//    3    5:aload_0         
	//    4    6:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    5    9:aload_1         
	//    6   10:invokeinterface #758 <Method void DecorToolbar.setCustomView(View)>
	//    7   15:return          
	}

	public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
	{
		if(!mDisplayHomeAsUpSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #359 <Field boolean mDisplayHomeAsUpSet>
	//*   2    4:ifne            12
			setDisplayHomeAsUpEnabled(flag);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #767 <Method void setDisplayHomeAsUpEnabled(boolean)>
	//    6   12:return          
	}

	public void setDisplayHomeAsUpEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			byte0 = 4;
	//    2    4:iconst_4        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		setDisplayOptions(((int) (byte0)), 4);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:iconst_4        
	//   10   14:invokevirtual   #771 <Method void setDisplayOptions(int, int)>
	//   11   17:return          
	}

	public void setDisplayOptions(int i)
	{
		if((i & 4) != 0)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:iand            
	//*   3    3:ifeq            11
			mDisplayHomeAsUpSet = true;
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:putfield        #359 <Field boolean mDisplayHomeAsUpSet>
		mDecorToolbar.setDisplayOptions(i);
	//    7   11:aload_0         
	//    8   12:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    9   15:iload_1         
	//   10   16:invokeinterface #773 <Method void DecorToolbar.setDisplayOptions(int)>
	//   11   21:return          
	}

	public void setDisplayOptions(int i, int j)
	{
		int k = mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #357 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:istore_3        
		if((j & 4) != 0)
	//*   4   10:iload_2         
	//*   5   11:iconst_4        
	//*   6   12:iand            
	//*   7   13:ifeq            21
			mDisplayHomeAsUpSet = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #359 <Field boolean mDisplayHomeAsUpSet>
		mDecorToolbar.setDisplayOptions(i & j | ~j & k);
	//   11   21:aload_0         
	//   12   22:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:iand            
	//   16   28:iload_2         
	//   17   29:iconst_m1       
	//   18   30:ixor            
	//   19   31:iload_3         
	//   20   32:iand            
	//   21   33:ior             
	//   22   34:invokeinterface #773 <Method void DecorToolbar.setDisplayOptions(int)>
	//   23   39:return          
	}

	public void setDisplayShowCustomEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			byte0 = 16;
	//    2    4:bipush          16
	//    3    6:istore_2        
		else
	//*   4    7:goto            12
			byte0 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		setDisplayOptions(((int) (byte0)), 16);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:bipush          16
	//   10   16:invokevirtual   #771 <Method void setDisplayOptions(int, int)>
	//   11   19:return          
	}

	public void setDisplayShowHomeEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			byte0 = 2;
	//    2    4:iconst_2        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			byte0 = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		setDisplayOptions(((int) (byte0)), 2);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:iconst_2        
	//   10   14:invokevirtual   #771 <Method void setDisplayOptions(int, int)>
	//   11   17:return          
	}

	public void setDisplayShowTitleEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
			byte0 = 8;
	//    2    4:bipush          8
	//    3    6:istore_2        
		else
	//*   4    7:goto            12
			byte0 = 0;
	//    5   10:iconst_0        
	//    6   11:istore_2        
		setDisplayOptions(((int) (byte0)), 8);
	//    7   12:aload_0         
	//    8   13:iload_2         
	//    9   14:bipush          8
	//   10   16:invokevirtual   #771 <Method void setDisplayOptions(int, int)>
	//   11   19:return          
	}

	public void setDisplayUseLogoEnabled(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		setDisplayOptions(i, 1);
	//    7   11:aload_0         
	//    8   12:iload_2         
	//    9   13:iconst_1        
	//   10   14:invokevirtual   #771 <Method void setDisplayOptions(int, int)>
	//   11   17:return          
	}

	public void setElevation(float f)
	{
		ViewCompat.setElevation(((View) (mContainerView)), f);
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field ActionBarContainer mContainerView>
	//    2    4:fload_1         
	//    3    5:invokestatic    #780 <Method void ViewCompat.setElevation(View, float)>
	//    4    8:return          
	}

	public void setHideOffset(int i)
	{
		if(i != 0 && !mOverlayLayout.isInOverlayMode())
	//*   0    0:iload_1         
	//*   1    1:ifeq            25
	//*   2    4:aload_0         
	//*   3    5:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   4    8:invokevirtual   #784 <Method boolean ActionBarOverlayLayout.isInOverlayMode()>
	//*   5   11:ifne            25
		{
			throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
	//    6   14:new             #218 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #786 <String "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset">
	//    9   21:invokespecial   #223 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			mOverlayLayout.setActionBarHideOffset(i);
	//   11   25:aload_0         
	//   12   26:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   13   29:iload_1         
	//   14   30:invokevirtual   #789 <Method void ActionBarOverlayLayout.setActionBarHideOffset(int)>
			return;
	//   15   33:return          
		}
	}

	public void setHideOnContentScrollEnabled(boolean flag)
	{
		if(flag && !mOverlayLayout.isInOverlayMode())
	//*   0    0:iload_1         
	//*   1    1:ifeq            25
	//*   2    4:aload_0         
	//*   3    5:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   4    8:invokevirtual   #784 <Method boolean ActionBarOverlayLayout.isInOverlayMode()>
	//*   5   11:ifne            25
		{
			throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
	//    6   14:new             #218 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #791 <String "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll">
	//    9   21:invokespecial   #223 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			mHideOnContentScroll = flag;
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:putfield        #793 <Field boolean mHideOnContentScroll>
			mOverlayLayout.setHideOnContentScrollEnabled(flag);
	//   14   30:aload_0         
	//   15   31:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   16   34:iload_1         
	//   17   35:invokevirtual   #794 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
			return;
	//   18   38:return          
		}
	}

	public void setHomeActionContentDescription(int i)
	{
		mDecorToolbar.setNavigationContentDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #798 <Method void DecorToolbar.setNavigationContentDescription(int)>
	//    4   10:return          
	}

	public void setHomeActionContentDescription(CharSequence charsequence)
	{
		mDecorToolbar.setNavigationContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #801 <Method void DecorToolbar.setNavigationContentDescription(CharSequence)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
		mDecorToolbar.setNavigationIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #805 <Method void DecorToolbar.setNavigationIcon(int)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
		mDecorToolbar.setNavigationIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #807 <Method void DecorToolbar.setNavigationIcon(Drawable)>
	//    4   10:return          
	}

	public void setHomeButtonEnabled(boolean flag)
	{
		mDecorToolbar.setHomeButtonEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #808 <Method void DecorToolbar.setHomeButtonEnabled(boolean)>
	//    4   10:return          
	}

	public void setIcon(int i)
	{
		mDecorToolbar.setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #811 <Method void DecorToolbar.setIcon(int)>
	//    4   10:return          
	}

	public void setIcon(Drawable drawable)
	{
		mDecorToolbar.setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #813 <Method void DecorToolbar.setIcon(Drawable)>
	//    4   10:return          
	}

	public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
	{
		mDecorToolbar.setDropdownParams(spinneradapter, ((android.widget.AdapterView.OnItemSelectedListener) (new NavItemSelectedListener(onnavigationlistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:new             #817 <Class NavItemSelectedListener>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #820 <Method void NavItemSelectedListener(ActionBar$OnNavigationListener)>
	//    7   13:invokeinterface #824 <Method void DecorToolbar.setDropdownParams(SpinnerAdapter, android.widget.AdapterView$OnItemSelectedListener)>
	//    8   18:return          
	}

	public void setLogo(int i)
	{
		mDecorToolbar.setLogo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #827 <Method void DecorToolbar.setLogo(int)>
	//    4   10:return          
	}

	public void setLogo(Drawable drawable)
	{
		mDecorToolbar.setLogo(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #829 <Method void DecorToolbar.setLogo(Drawable)>
	//    4   10:return          
	}

	public void setNavigationMode(int i)
	{
		int j = mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #590 <Method int DecorToolbar.getNavigationMode()>
	//    3    9:istore_2        
		switch(j)
	//*   4   10:iload_2         
		{
	//*   5   11:lookupswitch    1: default 28
	//	               2: 31
	//*   6   28:goto            53
		case 2: // '\002'
			mSavedTabPosition = getSelectedNavigationIndex();
	//    7   31:aload_0         
	//    8   32:aload_0         
	//    9   33:invokevirtual   #832 <Method int getSelectedNavigationIndex()>
	//   10   36:putfield        #132 <Field int mSavedTabPosition>
			selectTab(((ActionBar.Tab) (null)));
	//   11   39:aload_0         
	//   12   40:aconst_null     
	//   13   41:invokevirtual   #200 <Method void selectTab(ActionBar$Tab)>
			mTabScrollView.setVisibility(8);
	//   14   44:aload_0         
	//   15   45:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   16   48:bipush          8
	//   17   50:invokevirtual   #250 <Method void ScrollingTabContainerView.setVisibility(int)>
			break;
		}
		if(j != i && !mHasEmbeddedTabs && mOverlayLayout != null)
	//*  18   53:iload_2         
	//*  19   54:iload_1         
	//*  20   55:icmpeq          79
	//*  21   58:aload_0         
	//*  22   59:getfield        #247 <Field boolean mHasEmbeddedTabs>
	//*  23   62:ifne            79
	//*  24   65:aload_0         
	//*  25   66:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  26   69:ifnull          79
			ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//   27   72:aload_0         
	//   28   73:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   29   76:invokestatic    #268 <Method void ViewCompat.requestApplyInsets(View)>
		mDecorToolbar.setNavigationMode(i);
	//   30   79:aload_0         
	//   31   80:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   32   83:iload_1         
	//   33   84:invokeinterface #834 <Method void DecorToolbar.setNavigationMode(int)>
		switch(i)
	//*  34   89:iload_1         
		{
	//*  35   90:lookupswitch    1: default 108
	//	               2: 111
	//*  36  108:goto            144
		case 2: // '\002'
			ensureTabsExist();
	//   37  111:aload_0         
	//   38  112:invokespecial   #460 <Method void ensureTabsExist()>
			mTabScrollView.setVisibility(0);
	//   39  115:aload_0         
	//   40  116:getfield        #205 <Field ScrollingTabContainerView mTabScrollView>
	//   41  119:iconst_0        
	//   42  120:invokevirtual   #250 <Method void ScrollingTabContainerView.setVisibility(int)>
			if(mSavedTabPosition != -1)
	//*  43  123:aload_0         
	//*  44  124:getfield        #132 <Field int mSavedTabPosition>
	//*  45  127:iconst_m1       
	//*  46  128:icmpeq          144
			{
				setSelectedNavigationItem(mSavedTabPosition);
	//   47  131:aload_0         
	//   48  132:aload_0         
	//   49  133:getfield        #132 <Field int mSavedTabPosition>
	//   50  136:invokevirtual   #837 <Method void setSelectedNavigationItem(int)>
				mSavedTabPosition = -1;
	//   51  139:aload_0         
	//   52  140:iconst_m1       
	//   53  141:putfield        #132 <Field int mSavedTabPosition>
			}
			break;
		}
		Object obj = ((Object) (mDecorToolbar));
	//   54  144:aload_0         
	//   55  145:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   56  148:astore          4
		boolean flag;
		if(i == 2 && !mHasEmbeddedTabs)
	//*  57  150:iload_1         
	//*  58  151:iconst_2        
	//*  59  152:icmpne          167
	//*  60  155:aload_0         
	//*  61  156:getfield        #247 <Field boolean mHasEmbeddedTabs>
	//*  62  159:ifne            167
			flag = true;
	//   63  162:iconst_1        
	//   64  163:istore_3        
		else
	//*  65  164:goto            169
			flag = false;
	//   66  167:iconst_0        
	//   67  168:istore_3        
		((DecorToolbar) (obj)).setCollapsible(flag);
	//   68  169:aload           4
	//   69  171:iload_3         
	//   70  172:invokeinterface #422 <Method void DecorToolbar.setCollapsible(boolean)>
		obj = ((Object) (mOverlayLayout));
	//   71  177:aload_0         
	//   72  178:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//   73  181:astore          4
		if(i == 2 && !mHasEmbeddedTabs)
	//*  74  183:iload_1         
	//*  75  184:iconst_2        
	//*  76  185:icmpne          200
	//*  77  188:aload_0         
	//*  78  189:getfield        #247 <Field boolean mHasEmbeddedTabs>
	//*  79  192:ifne            200
			flag = true;
	//   80  195:iconst_1        
	//   81  196:istore_3        
		else
	//*  82  197:goto            202
			flag = false;
	//   83  200:iconst_0        
	//   84  201:istore_3        
		((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
	//   85  202:aload           4
	//   86  204:iload_3         
	//   87  205:invokevirtual   #425 <Method void ActionBarOverlayLayout.setHasNonEmbeddedTabs(boolean)>
	//   88  208:return          
	}

	public void setSelectedNavigationItem(int i)
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #590 <Method int DecorToolbar.getNavigationMode()>
		{
	//*   3    9:lookupswitch    2: default 36
	//	               1: 55
	//	               2: 39
	//*   4   36:goto            66
		case 2: // '\002'
			selectTab((ActionBar.Tab)mTabs.get(i));
	//    5   39:aload_0         
	//    6   40:aload_0         
	//    7   41:getfield        #130 <Field ArrayList mTabs>
	//    8   44:iload_1         
	//    9   45:invokevirtual   #239 <Method Object ArrayList.get(int)>
	//   10   48:checkcast       #610 <Class ActionBar$Tab>
	//   11   51:invokevirtual   #200 <Method void selectTab(ActionBar$Tab)>
			return;
	//   12   54:return          

		case 1: // '\001'
			mDecorToolbar.setDropdownSelectedPosition(i);
	//   13   55:aload_0         
	//   14   56:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//   15   59:iload_1         
	//   16   60:invokeinterface #840 <Method void DecorToolbar.setDropdownSelectedPosition(int)>
			return;
	//   17   65:return          
		}
		throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
	//   18   66:new             #218 <Class IllegalStateException>
	//   19   69:dup             
	//   20   70:ldc2            #842 <String "setSelectedNavigationIndex not valid for current navigation mode">
	//   21   73:invokespecial   #223 <Method void IllegalStateException(String)>
	//   22   76:athrow          
	}

	public void setShowHideAnimationEnabled(boolean flag)
	{
		mShowHideAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #520 <Field boolean mShowHideAnimationEnabled>
		if(!flag && mCurrentShowAnim != null)
	//*   3    5:iload_1         
	//*   4    6:ifne            23
	//*   5    9:aload_0         
	//*   6   10:getfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   7   13:ifnull          23
			mCurrentShowAnim.cancel();
	//    8   16:aload_0         
	//    9   17:getfield        #515 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//   10   20:invokevirtual   #518 <Method void ViewPropertyAnimatorCompatSet.cancel()>
	//   11   23:return          
	}

	public void setSplitBackgroundDrawable(Drawable drawable)
	{
	//    0    0:return          
	}

	public void setStackedBackgroundDrawable(Drawable drawable)
	{
		mContainerView.setStackedBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field ActionBarContainer mContainerView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #848 <Method void ActionBarContainer.setStackedBackground(Drawable)>
	//    4    8:return          
	}

	public void setSubtitle(int i)
	{
		setSubtitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #242 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #853 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #855 <Method void setSubtitle(CharSequence)>
	//    6   12:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mDecorToolbar.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #856 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//    4   10:return          
	}

	public void setTitle(int i)
	{
		setTitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #242 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #853 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #859 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mDecorToolbar.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #860 <Method void DecorToolbar.setTitle(CharSequence)>
	//    4   10:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		mDecorToolbar.setWindowTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #252 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #863 <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//    4   10:return          
	}

	public void show()
	{
		if(mHiddenByApp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #433 <Field boolean mHiddenByApp>
	//*   2    4:ifeq            17
		{
			mHiddenByApp = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #433 <Field boolean mHiddenByApp>
			updateVisibility(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokespecial   #322 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public void showForSystem()
	{
		if(mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #435 <Field boolean mHiddenBySystem>
	//*   2    4:ifeq            17
		{
			mHiddenBySystem = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #435 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #322 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		if(mActionMode != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #869 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//*   2    4:ifnull          14
			mActionMode.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #869 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//    5   11:invokevirtual   #872 <Method void WindowDecorActionBar$ActionModeImpl.finish()>
		mOverlayLayout.setHideOnContentScrollEnabled(false);
	//    6   14:aload_0         
	//    7   15:getfield        #263 <Field ActionBarOverlayLayout mOverlayLayout>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #794 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
		mContextView.killMode();
	//   10   22:aload_0         
	//   11   23:getfield        #343 <Field ActionBarContextView mContextView>
	//   12   26:invokevirtual   #875 <Method void ActionBarContextView.killMode()>
		callback = ((android.support.v7.view.ActionMode.Callback) (new ActionModeImpl(mContextView.getContext(), callback)));
	//   13   29:new             #14  <Class WindowDecorActionBar$ActionModeImpl>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #343 <Field ActionBarContextView mContextView>
	//   18   38:invokevirtual   #876 <Method Context ActionBarContextView.getContext()>
	//   19   41:aload_1         
	//   20   42:invokespecial   #879 <Method void WindowDecorActionBar$ActionModeImpl(WindowDecorActionBar, Context, android.support.v7.view.ActionMode$Callback)>
	//   21   45:astore_1        
		if(((ActionModeImpl) (callback)).dispatchOnCreate())
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #882 <Method boolean WindowDecorActionBar$ActionModeImpl.dispatchOnCreate()>
	//*  24   50:ifeq            86
		{
			mActionMode = ((ActionModeImpl) (callback));
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:putfield        #869 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
			((ActionModeImpl) (callback)).invalidate();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #885 <Method void WindowDecorActionBar$ActionModeImpl.invalidate()>
			mContextView.initForMode(((ActionMode) (callback)));
	//   30   62:aload_0         
	//   31   63:getfield        #343 <Field ActionBarContextView mContextView>
	//   32   66:aload_1         
	//   33   67:invokevirtual   #888 <Method void ActionBarContextView.initForMode(ActionMode)>
			animateToMode(true);
	//   34   70:aload_0         
	//   35   71:iconst_1        
	//   36   72:invokevirtual   #890 <Method void animateToMode(boolean)>
			mContextView.sendAccessibilityEvent(32);
	//   37   75:aload_0         
	//   38   76:getfield        #343 <Field ActionBarContextView mContextView>
	//   39   79:bipush          32
	//   40   81:invokevirtual   #893 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
			return ((ActionMode) (callback));
	//   41   84:aload_1         
	//   42   85:areturn         
		} else
		{
			return null;
	//   43   86:aconst_null     
	//   44   87:areturn         
		}
	}

	static final boolean $assertionsDisabled;
	private static final boolean ALLOW_SHOW_HIDE_ANIMATIONS;
	private static final long FADE_IN_DURATION_MS = 200L;
	private static final long FADE_OUT_DURATION_MS = 100L;
	private static final int INVALID_POSITION = -1;
	private static final String TAG = "WindowDecorActionBar";
	private static final Interpolator sHideInterpolator = new AccelerateInterpolator();
	private static final Interpolator sShowInterpolator = new DecelerateInterpolator();
	ActionModeImpl mActionMode;
	private Activity mActivity;
	ActionBarContainer mContainerView;
	boolean mContentAnimations;
	View mContentView;
	Context mContext;
	ActionBarContextView mContextView;
	private int mCurWindowVisibility;
	ViewPropertyAnimatorCompatSet mCurrentShowAnim;
	DecorToolbar mDecorToolbar;
	ActionMode mDeferredDestroyActionMode;
	android.support.v7.view.ActionMode.Callback mDeferredModeDestroyCallback;
	private Dialog mDialog;
	private boolean mDisplayHomeAsUpSet;
	private boolean mHasEmbeddedTabs;
	boolean mHiddenByApp;
	boolean mHiddenBySystem;
	final ViewPropertyAnimatorListener mHideListener;
	boolean mHideOnContentScroll;
	private boolean mLastMenuVisibility;
	private ArrayList mMenuVisibilityListeners;
	private boolean mNowShowing;
	ActionBarOverlayLayout mOverlayLayout;
	private int mSavedTabPosition;
	private TabImpl mSelectedTab;
	private boolean mShowHideAnimationEnabled;
	final ViewPropertyAnimatorListener mShowListener;
	private boolean mShowingForMode;
	ScrollingTabContainerView mTabScrollView;
	private ArrayList mTabs;
	private Context mThemedContext;
	final ViewPropertyAnimatorUpdateListener mUpdateListener;

	static 
	{
		boolean flag;
		if(!((Class) (android/support/v7/app/WindowDecorActionBar)).desiredAssertionStatus())
	//*   0    0:ldc1            #2   <Class WindowDecorActionBar>
	//*   1    2:invokevirtual   #101 <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		$assertionsDisabled = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #103 <Field boolean $assertionsDisabled>
	//   10   19:new             #105 <Class AccelerateInterpolator>
	//   11   22:dup             
	//   12   23:invokespecial   #108 <Method void AccelerateInterpolator()>
	//   13   26:putstatic       #110 <Field Interpolator sHideInterpolator>
	//   14   29:new             #112 <Class DecelerateInterpolator>
	//   15   32:dup             
	//   16   33:invokespecial   #113 <Method void DecelerateInterpolator()>
	//   17   36:putstatic       #115 <Field Interpolator sShowInterpolator>
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  18   39:getstatic       #120 <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   42:bipush          14
	//*  20   44:icmplt          52
			flag = true;
	//   21   47:iconst_1        
	//   22   48:istore_0        
		else
	//*  23   49:goto            54
			flag = false;
	//   24   52:iconst_0        
	//   25   53:istore_0        
		ALLOW_SHOW_HIDE_ANIMATIONS = flag;
	//   26   54:iload_0         
	//   27   55:putstatic       #122 <Field boolean ALLOW_SHOW_HIDE_ANIMATIONS>
	//*  28   58:return          
	}
}
