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
	//    1    1:invokespecial   #110 <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #112 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #113 <Method void ArrayList()>
	//    6   12:putfield        #115 <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #117 <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #112 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #113 <Method void ArrayList()>
	//   14   28:putfield        #119 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #121 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #123 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #125 <Field boolean mNowShowing>
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
	//   28   52:invokespecial   #128 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #130 <Field ViewPropertyAnimatorListener mHideListener>
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
	//   34   64:invokespecial   #131 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #133 <Field ViewPropertyAnimatorListener mShowListener>
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
	//   40   76:invokespecial   #134 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #136 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		mActivity = activity;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #138 <Field Activity mActivity>
		activity = ((Activity) (activity.getWindow().getDecorView()));
	//   45   87:aload_1         
	//   46   88:invokevirtual   #144 <Method Window Activity.getWindow()>
	//   47   91:invokevirtual   #150 <Method View Window.getDecorView()>
	//   48   94:astore_1        
		init(((View) (activity)));
	//   49   95:aload_0         
	//   50   96:aload_1         
	//   51   97:invokespecial   #154 <Method void init(View)>
		if(!flag)
	//*  52  100:iload_2         
	//*  53  101:ifne            114
			mContentView = ((View) (activity)).findViewById(0x1020002);
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:ldc1            #155 <Int 0x1020002>
	//   57  108:invokevirtual   #161 <Method View View.findViewById(int)>
	//   58  111:putfield        #163 <Field View mContentView>
	//   59  114:return          
	}

	public WindowDecorActionBar(Dialog dialog)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #112 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #113 <Method void ArrayList()>
	//    6   12:putfield        #115 <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #117 <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #112 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #113 <Method void ArrayList()>
	//   14   28:putfield        #119 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #121 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #123 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #125 <Field boolean mNowShowing>
		mHideListener = ((ViewPropertyAnimatorListener) (new _cls1()));
	//   24   46:aload_0         
	//   25   47:new             #8   <Class WindowDecorActionBar$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #128 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #130 <Field ViewPropertyAnimatorListener mHideListener>
		mShowListener = ((ViewPropertyAnimatorListener) (new _cls2()));
	//   30   58:aload_0         
	//   31   59:new             #10  <Class WindowDecorActionBar$2>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:invokespecial   #131 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #133 <Field ViewPropertyAnimatorListener mShowListener>
		mUpdateListener = new _cls3();
	//   36   70:aload_0         
	//   37   71:new             #12  <Class WindowDecorActionBar$3>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:invokespecial   #134 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #136 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		mDialog = dialog;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #166 <Field Dialog mDialog>
		init(dialog.getWindow().getDecorView());
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:invokevirtual   #169 <Method Window Dialog.getWindow()>
	//   48   92:invokevirtual   #150 <Method View Window.getDecorView()>
	//   49   95:invokespecial   #154 <Method void init(View)>
	//   50   98:return          
	}

	public WindowDecorActionBar(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #110 <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #112 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #113 <Method void ArrayList()>
	//    6   12:putfield        #115 <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #117 <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #112 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #113 <Method void ArrayList()>
	//   14   28:putfield        #119 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #121 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #123 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #125 <Field boolean mNowShowing>
		mHideListener = ((ViewPropertyAnimatorListener) (new _cls1()));
	//   24   46:aload_0         
	//   25   47:new             #8   <Class WindowDecorActionBar$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #128 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #130 <Field ViewPropertyAnimatorListener mHideListener>
		mShowListener = ((ViewPropertyAnimatorListener) (new _cls2()));
	//   30   58:aload_0         
	//   31   59:new             #10  <Class WindowDecorActionBar$2>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:invokespecial   #131 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #133 <Field ViewPropertyAnimatorListener mShowListener>
		mUpdateListener = new _cls3();
	//   36   70:aload_0         
	//   37   71:new             #12  <Class WindowDecorActionBar$3>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:invokespecial   #134 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #136 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		init(view);
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:invokespecial   #154 <Method void init(View)>
	//   45   87:return          
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
	//    5    7:ifne            19
	//    6   10:iload_1         
	//    7   11:ifeq            17
	//    8   14:goto            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	private void cleanupTabs()
	{
		if(mSelectedTab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*   2    4:ifnull          12
			selectTab(((ActionBar.Tab) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #179 <Method void selectTab(ActionBar$Tab)>
		mTabs.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #115 <Field ArrayList mTabs>
	//    8   16:invokevirtual   #182 <Method void ArrayList.clear()>
		if(mTabScrollView != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//*  11   23:ifnull          33
			mTabScrollView.removeAllTabs();
	//   12   26:aload_0         
	//   13   27:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   14   30:invokevirtual   #189 <Method void ScrollingTabContainerView.removeAllTabs()>
		mSavedTabPosition = -1;
	//   15   33:aload_0         
	//   16   34:iconst_m1       
	//   17   35:putfield        #117 <Field int mSavedTabPosition>
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
	//*   4    6:invokevirtual   #195 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//*   5    9:ifnonnull       22
			throw new IllegalStateException("Action Bar Tab must have a Callback");
	//    6   12:new             #197 <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #199 <String "Action Bar Tab must have a Callback">
	//    9   18:invokespecial   #202 <Method void IllegalStateException(String)>
	//   10   21:athrow          
		((TabImpl) (tab)).setPosition(i);
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokevirtual   #206 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
		mTabs.add(i, ((Object) (tab)));
	//   14   27:aload_0         
	//   15   28:getfield        #115 <Field ArrayList mTabs>
	//   16   31:iload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #210 <Method void ArrayList.add(int, Object)>
		int j = mTabs.size();
	//   19   36:aload_0         
	//   20   37:getfield        #115 <Field ArrayList mTabs>
	//   21   40:invokevirtual   #214 <Method int ArrayList.size()>
	//   22   43:istore_3        
		do
		{
			i++;
	//   23   44:iload_2         
	//   24   45:iconst_1        
	//   25   46:iadd            
	//   26   47:istore_2        
			if(i < j)
	//*  27   48:iload_2         
	//*  28   49:iload_3         
	//*  29   50:icmpge          71
				((TabImpl)mTabs.get(i)).setPosition(i);
	//   30   53:aload_0         
	//   31   54:getfield        #115 <Field ArrayList mTabs>
	//   32   57:iload_2         
	//   33   58:invokevirtual   #218 <Method Object ArrayList.get(int)>
	//   34   61:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   35   64:iload_2         
	//   36   65:invokevirtual   #206 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
			else
	//*  37   68:goto            44
				return;
	//   38   71:return          
		} while(true);
	}

	private void ensureTabsExist()
	{
		if(mTabScrollView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		ScrollingTabContainerView scrollingtabcontainerview = new ScrollingTabContainerView(mContext);
	//    4    8:new             #186 <Class ScrollingTabContainerView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #221 <Field Context mContext>
	//    8   16:invokespecial   #224 <Method void ScrollingTabContainerView(Context)>
	//    9   19:astore_1        
		if(mHasEmbeddedTabs)
	//*  10   20:aload_0         
	//*  11   21:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  12   24:ifeq            45
		{
			scrollingtabcontainerview.setVisibility(0);
	//   13   27:aload_1         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
			mDecorToolbar.setEmbeddedTabView(scrollingtabcontainerview);
	//   16   32:aload_0         
	//   17   33:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   18   36:aload_1         
	//   19   37:invokeinterface #237 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
		} else
	//*  20   42:goto            89
		{
			if(getNavigationMode() == 2)
	//*  21   45:aload_0         
	//*  22   46:invokevirtual   #240 <Method int getNavigationMode()>
	//*  23   49:iconst_2        
	//*  24   50:icmpne          75
			{
				scrollingtabcontainerview.setVisibility(0);
	//   25   53:aload_1         
	//   26   54:iconst_0        
	//   27   55:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
				if(mOverlayLayout != null)
	//*  28   58:aload_0         
	//*  29   59:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  30   62:ifnull          81
					ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//   31   65:aload_0         
	//   32   66:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   33   69:invokestatic    #247 <Method void ViewCompat.requestApplyInsets(View)>
			} else
	//*  34   72:goto            81
			{
				scrollingtabcontainerview.setVisibility(8);
	//   35   75:aload_1         
	//   36   76:bipush          8
	//   37   78:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
			}
			mContainerView.setTabContainer(scrollingtabcontainerview);
	//   38   81:aload_0         
	//   39   82:getfield        #249 <Field ActionBarContainer mContainerView>
	//   40   85:aload_1         
	//   41   86:invokevirtual   #254 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
		}
		mTabScrollView = scrollingtabcontainerview;
	//   42   89:aload_0         
	//   43   90:aload_1         
	//   44   91:putfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   45   94:return          
	}

	private DecorToolbar getDecorToolbar(View view)
	{
		if(view instanceof DecorToolbar)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #233 <Class DecorToolbar>
	//*   2    4:ifeq            12
			return (DecorToolbar)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #233 <Class DecorToolbar>
	//    5   11:areturn         
		if(view instanceof Toolbar)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #258 <Class Toolbar>
	//*   8   16:ifeq            27
			return ((Toolbar)view).getWrapper();
	//    9   19:aload_1         
	//   10   20:checkcast       #258 <Class Toolbar>
	//   11   23:invokevirtual   #262 <Method DecorToolbar Toolbar.getWrapper()>
	//   12   26:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #264 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #265 <Method void StringBuilder()>
	//   16   34:astore_2        
		stringbuilder.append("Can't make a decor toolbar out of ");
	//   17   35:aload_2         
	//   18   36:ldc2            #267 <String "Can't make a decor toolbar out of ">
	//   19   39:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   20   42:pop             
		stringbuilder.append(((Object) (view)));
	//   21   43:aload_2         
	//   22   44:aload_1         
	//   23   45:invokevirtual   #274 <Method StringBuilder StringBuilder.append(Object)>
	//   24   48:pop             
		if(stringbuilder.toString() != null)
	//*  25   49:aload_2         
	//*  26   50:invokevirtual   #278 <Method String StringBuilder.toString()>
	//*  27   53:ifnull          67
			view = ((View) (((Object) (view)).getClass().getSimpleName()));
	//   28   56:aload_1         
	//   29   57:invokevirtual   #284 <Method Class Object.getClass()>
	//   30   60:invokevirtual   #289 <Method String Class.getSimpleName()>
	//   31   63:astore_1        
		else
	//*  32   64:goto            71
			view = "null";
	//   33   67:ldc2            #291 <String "null">
	//   34   70:astore_1        
		throw new IllegalStateException(((String) (view)));
	//   35   71:new             #197 <Class IllegalStateException>
	//   36   74:dup             
	//   37   75:aload_1         
	//   38   76:invokespecial   #202 <Method void IllegalStateException(String)>
	//   39   79:athrow          
	}

	private void hideForActionMode()
	{
		if(mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #294 <Field boolean mShowingForMode>
	//*   2    4:ifeq            32
		{
			mShowingForMode = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #294 <Field boolean mShowingForMode>
			if(mOverlayLayout != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   8   16:ifnull          27
				mOverlayLayout.setShowingForActionMode(false);
	//    9   19:aload_0         
	//   10   20:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #300 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokespecial   #303 <Method void updateVisibility(boolean)>
		}
	//   16   32:return          
	}

	private void init(View view)
	{
		mOverlayLayout = (ActionBarOverlayLayout)view.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #308 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//    3    5:invokevirtual   #161 <Method View View.findViewById(int)>
	//    4    8:checkcast       #296 <Class ActionBarOverlayLayout>
	//    5   11:putfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
		if(mOverlayLayout != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   8   18:ifnull          29
			mOverlayLayout.setActionBarVisibilityCallback(((android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback) (this)));
	//    9   21:aload_0         
	//   10   22:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #312 <Method void ActionBarOverlayLayout.setActionBarVisibilityCallback(android.support.v7.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback)>
		mDecorToolbar = getDecorToolbar(view.findViewById(android.support.v7.appcompat.R.id.action_bar));
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:getstatic       #315 <Field int android.support.v7.appcompat.R$id.action_bar>
	//   17   35:invokevirtual   #161 <Method View View.findViewById(int)>
	//   18   38:invokespecial   #317 <Method DecorToolbar getDecorToolbar(View)>
	//   19   41:putfield        #231 <Field DecorToolbar mDecorToolbar>
		mContextView = (ActionBarContextView)view.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:getstatic       #320 <Field int android.support.v7.appcompat.R$id.action_context_bar>
	//   23   49:invokevirtual   #161 <Method View View.findViewById(int)>
	//   24   52:checkcast       #322 <Class ActionBarContextView>
	//   25   55:putfield        #324 <Field ActionBarContextView mContextView>
		mContainerView = (ActionBarContainer)view.findViewById(android.support.v7.appcompat.R.id.action_bar_container);
	//   26   58:aload_0         
	//   27   59:aload_1         
	//   28   60:getstatic       #327 <Field int android.support.v7.appcompat.R$id.action_bar_container>
	//   29   63:invokevirtual   #161 <Method View View.findViewById(int)>
	//   30   66:checkcast       #251 <Class ActionBarContainer>
	//   31   69:putfield        #249 <Field ActionBarContainer mContainerView>
		if(mDecorToolbar != null && mContextView != null && mContainerView != null)
	//*  32   72:aload_0         
	//*  33   73:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*  34   76:ifnull          237
	//*  35   79:aload_0         
	//*  36   80:getfield        #324 <Field ActionBarContextView mContextView>
	//*  37   83:ifnull          237
	//*  38   86:aload_0         
	//*  39   87:getfield        #249 <Field ActionBarContainer mContainerView>
	//*  40   90:ifnonnull       96
	//*  41   93:goto            237
		{
			mContext = mDecorToolbar.getContext();
	//   42   96:aload_0         
	//   43   97:aload_0         
	//   44   98:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   45  101:invokeinterface #331 <Method Context DecorToolbar.getContext()>
	//   46  106:putfield        #221 <Field Context mContext>
			boolean flag;
			if((mDecorToolbar.getDisplayOptions() & 4) != 0)
	//*  47  109:aload_0         
	//*  48  110:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*  49  113:invokeinterface #334 <Method int DecorToolbar.getDisplayOptions()>
	//*  50  118:iconst_4        
	//*  51  119:iand            
	//*  52  120:ifeq            128
				flag = true;
	//   53  123:iconst_1        
	//   54  124:istore_2        
			else
	//*  55  125:goto            130
				flag = false;
	//   56  128:iconst_0        
	//   57  129:istore_2        
			if(flag)
	//*  58  130:iload_2         
	//*  59  131:ifeq            139
				mDisplayHomeAsUpSet = true;
	//   60  134:aload_0         
	//   61  135:iconst_1        
	//   62  136:putfield        #336 <Field boolean mDisplayHomeAsUpSet>
			view = ((View) (ActionBarPolicy.get(mContext)));
	//   63  139:aload_0         
	//   64  140:getfield        #221 <Field Context mContext>
	//   65  143:invokestatic    #341 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//   66  146:astore_1        
			boolean flag1;
			if(!((ActionBarPolicy) (view)).enableHomeButtonByDefault() && !flag)
	//*  67  147:aload_1         
	//*  68  148:invokevirtual   #345 <Method boolean ActionBarPolicy.enableHomeButtonByDefault()>
	//*  69  151:ifne            166
	//*  70  154:iload_2         
	//*  71  155:ifeq            161
	//*  72  158:goto            166
				flag1 = false;
	//   73  161:iconst_0        
	//   74  162:istore_3        
			else
	//*  75  163:goto            168
				flag1 = true;
	//   76  166:iconst_1        
	//   77  167:istore_3        
			setHomeButtonEnabled(flag1);
	//   78  168:aload_0         
	//   79  169:iload_3         
	//   80  170:invokevirtual   #348 <Method void setHomeButtonEnabled(boolean)>
			setHasEmbeddedTabs(((ActionBarPolicy) (view)).hasEmbeddedTabs());
	//   81  173:aload_0         
	//   82  174:aload_1         
	//   83  175:invokevirtual   #351 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//   84  178:invokespecial   #354 <Method void setHasEmbeddedTabs(boolean)>
			view = ((View) (mContext.obtainStyledAttributes(((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0)));
	//   85  181:aload_0         
	//   86  182:getfield        #221 <Field Context mContext>
	//   87  185:aconst_null     
	//   88  186:getstatic       #360 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//   89  189:getstatic       #365 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//   90  192:iconst_0        
	//   91  193:invokevirtual   #371 <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   92  196:astore_1        
			if(((TypedArray) (view)).getBoolean(android.support.v7.appcompat.R.styleable.ActionBar_hideOnContentScroll, false))
	//*  93  197:aload_1         
	//*  94  198:getstatic       #374 <Field int android.support.v7.appcompat.R$styleable.ActionBar_hideOnContentScroll>
	//*  95  201:iconst_0        
	//*  96  202:invokevirtual   #380 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  97  205:ifeq            213
				setHideOnContentScrollEnabled(true);
	//   98  208:aload_0         
	//   99  209:iconst_1        
	//  100  210:invokevirtual   #383 <Method void setHideOnContentScrollEnabled(boolean)>
			int i = ((TypedArray) (view)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_elevation, 0);
	//  101  213:aload_1         
	//  102  214:getstatic       #386 <Field int android.support.v7.appcompat.R$styleable.ActionBar_elevation>
	//  103  217:iconst_0        
	//  104  218:invokevirtual   #390 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  105  221:istore_2        
			if(i != 0)
	//* 106  222:iload_2         
	//* 107  223:ifeq            232
				setElevation(i);
	//  108  226:aload_0         
	//  109  227:iload_2         
	//  110  228:i2f             
	//  111  229:invokevirtual   #394 <Method void setElevation(float)>
			((TypedArray) (view)).recycle();
	//  112  232:aload_1         
	//  113  233:invokevirtual   #397 <Method void TypedArray.recycle()>
			return;
	//  114  236:return          
		} else
		{
			view = ((View) (new StringBuilder()));
	//  115  237:new             #264 <Class StringBuilder>
	//  116  240:dup             
	//  117  241:invokespecial   #265 <Method void StringBuilder()>
	//  118  244:astore_1        
			((StringBuilder) (view)).append(((Object)this).getClass().getSimpleName());
	//  119  245:aload_1         
	//  120  246:aload_0         
	//  121  247:invokevirtual   #284 <Method Class Object.getClass()>
	//  122  250:invokevirtual   #289 <Method String Class.getSimpleName()>
	//  123  253:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  124  256:pop             
			((StringBuilder) (view)).append(" can only be used ");
	//  125  257:aload_1         
	//  126  258:ldc2            #399 <String " can only be used ">
	//  127  261:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  128  264:pop             
			((StringBuilder) (view)).append("with a compatible window decor layout");
	//  129  265:aload_1         
	//  130  266:ldc2            #401 <String "with a compatible window decor layout">
	//  131  269:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  132  272:pop             
			throw new IllegalStateException(((StringBuilder) (view)).toString());
	//  133  273:new             #197 <Class IllegalStateException>
	//  134  276:dup             
	//  135  277:aload_1         
	//  136  278:invokevirtual   #278 <Method String StringBuilder.toString()>
	//  137  281:invokespecial   #202 <Method void IllegalStateException(String)>
	//  138  284:athrow          
		}
	}

	private void setHasEmbeddedTabs(boolean flag)
	{
		mHasEmbeddedTabs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #226 <Field boolean mHasEmbeddedTabs>
		if(!mHasEmbeddedTabs)
	//*   3    5:aload_0         
	//*   4    6:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*   5    9:ifne            36
		{
			mDecorToolbar.setEmbeddedTabView(((ScrollingTabContainerView) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    8   16:aconst_null     
	//    9   17:invokeinterface #237 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
			mContainerView.setTabContainer(mTabScrollView);
	//   10   22:aload_0         
	//   11   23:getfield        #249 <Field ActionBarContainer mContainerView>
	//   12   26:aload_0         
	//   13   27:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   14   30:invokevirtual   #254 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
		} else
	//*  15   33:goto            57
		{
			mContainerView.setTabContainer(((ScrollingTabContainerView) (null)));
	//   16   36:aload_0         
	//   17   37:getfield        #249 <Field ActionBarContainer mContainerView>
	//   18   40:aconst_null     
	//   19   41:invokevirtual   #254 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
			mDecorToolbar.setEmbeddedTabView(mTabScrollView);
	//   20   44:aload_0         
	//   21   45:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   22   48:aload_0         
	//   23   49:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   24   52:invokeinterface #237 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
		}
		int i = getNavigationMode();
	//   25   57:aload_0         
	//   26   58:invokevirtual   #240 <Method int getNavigationMode()>
	//   27   61:istore_2        
		boolean flag2 = true;
	//   28   62:iconst_1        
	//   29   63:istore_3        
		boolean flag1;
		if(i == 2)
	//*  30   64:iload_2         
	//*  31   65:iconst_2        
	//*  32   66:icmpne          74
			flag1 = true;
	//   33   69:iconst_1        
	//   34   70:istore_2        
		else
	//*  35   71:goto            76
			flag1 = false;
	//   36   74:iconst_0        
	//   37   75:istore_2        
		if(mTabScrollView != null)
	//*  38   76:aload_0         
	//*  39   77:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//*  40   80:ifnull          121
			if(flag1)
	//*  41   83:iload_2         
	//*  42   84:ifeq            112
			{
				mTabScrollView.setVisibility(0);
	//   43   87:aload_0         
	//   44   88:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   45   91:iconst_0        
	//   46   92:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
				if(mOverlayLayout != null)
	//*  47   95:aload_0         
	//*  48   96:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  49   99:ifnull          121
					ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//   50  102:aload_0         
	//   51  103:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   52  106:invokestatic    #247 <Method void ViewCompat.requestApplyInsets(View)>
			} else
	//*  53  109:goto            121
			{
				mTabScrollView.setVisibility(8);
	//   54  112:aload_0         
	//   55  113:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   56  116:bipush          8
	//   57  118:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
			}
		Object obj = ((Object) (mDecorToolbar));
	//   58  121:aload_0         
	//   59  122:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   60  125:astore          4
		if(!mHasEmbeddedTabs && flag1)
	//*  61  127:aload_0         
	//*  62  128:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  63  131:ifne            143
	//*  64  134:iload_2         
	//*  65  135:ifeq            143
			flag = true;
	//   66  138:iconst_1        
	//   67  139:istore_1        
		else
	//*  68  140:goto            145
			flag = false;
	//   69  143:iconst_0        
	//   70  144:istore_1        
		((DecorToolbar) (obj)).setCollapsible(flag);
	//   71  145:aload           4
	//   72  147:iload_1         
	//   73  148:invokeinterface #404 <Method void DecorToolbar.setCollapsible(boolean)>
		obj = ((Object) (mOverlayLayout));
	//   74  153:aload_0         
	//   75  154:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   76  157:astore          4
		if(!mHasEmbeddedTabs && flag1)
	//*  77  159:aload_0         
	//*  78  160:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  79  163:ifne            175
	//*  80  166:iload_2         
	//*  81  167:ifeq            175
			flag = flag2;
	//   82  170:iload_3         
	//   83  171:istore_1        
		else
	//*  84  172:goto            177
			flag = false;
	//   85  175:iconst_0        
	//   86  176:istore_1        
		((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
	//   87  177:aload           4
	//   88  179:iload_1         
	//   89  180:invokevirtual   #407 <Method void ActionBarOverlayLayout.setHasNonEmbeddedTabs(boolean)>
	//   90  183:return          
	}

	private boolean shouldAnimateContextView()
	{
		return ViewCompat.isLaidOut(((View) (mContainerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:invokestatic    #412 <Method boolean ViewCompat.isLaidOut(View)>
	//    3    7:ireturn         
	}

	private void showForActionMode()
	{
		if(!mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #294 <Field boolean mShowingForMode>
	//*   2    4:ifne            32
		{
			mShowingForMode = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #294 <Field boolean mShowingForMode>
			if(mOverlayLayout != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   8   16:ifnull          27
				mOverlayLayout.setShowingForActionMode(true);
	//    9   19:aload_0         
	//   10   20:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #300 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokespecial   #303 <Method void updateVisibility(boolean)>
		}
	//   16   32:return          
	}

	private void updateVisibility(boolean flag)
	{
		if(checkShowingFlags(mHiddenByApp, mHiddenBySystem, mShowingForMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #415 <Field boolean mHiddenByApp>
	//*   2    4:aload_0         
	//*   3    5:getfield        #417 <Field boolean mHiddenBySystem>
	//*   4    8:aload_0         
	//*   5    9:getfield        #294 <Field boolean mShowingForMode>
	//*   6   12:invokestatic    #419 <Method boolean checkShowingFlags(boolean, boolean, boolean)>
	//*   7   15:ifeq            36
		{
			if(!mNowShowing)
	//*   8   18:aload_0         
	//*   9   19:getfield        #125 <Field boolean mNowShowing>
	//*  10   22:ifne            53
			{
				mNowShowing = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #125 <Field boolean mNowShowing>
				doShow(flag);
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:invokevirtual   #422 <Method void doShow(boolean)>
				return;
	//   17   35:return          
			}
		} else
		if(mNowShowing)
	//*  18   36:aload_0         
	//*  19   37:getfield        #125 <Field boolean mNowShowing>
	//*  20   40:ifeq            53
		{
			mNowShowing = false;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #125 <Field boolean mNowShowing>
			doHide(flag);
	//   24   48:aload_0         
	//   25   49:iload_1         
	//   26   50:invokevirtual   #425 <Method void doHide(boolean)>
		}
	//   27   53:return          
	}

	public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.add(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #430 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addTab(ActionBar.Tab tab)
	{
		addTab(tab, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #115 <Field ArrayList mTabs>
	//    4    6:invokevirtual   #434 <Method boolean ArrayList.isEmpty()>
	//    5    9:invokevirtual   #437 <Method void addTab(ActionBar$Tab, boolean)>
	//    6   12:return          
	}

	public void addTab(ActionBar.Tab tab, int i)
	{
		addTab(tab, i, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #115 <Field ArrayList mTabs>
	//    5    7:invokevirtual   #434 <Method boolean ArrayList.isEmpty()>
	//    6   10:invokevirtual   #440 <Method void addTab(ActionBar$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addTab(ActionBar.Tab tab, int i, boolean flag)
	{
		ensureTabsExist();
	//    0    0:aload_0         
	//    1    1:invokespecial   #442 <Method void ensureTabsExist()>
		mTabScrollView.addTab(tab, i, flag);
	//    2    4:aload_0         
	//    3    5:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #443 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, int, boolean)>
		configureTab(tab, i);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #445 <Method void configureTab(ActionBar$Tab, int)>
		if(flag)
	//*  12   20:iload_3         
	//*  13   21:ifeq            29
			selectTab(tab);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #179 <Method void selectTab(ActionBar$Tab)>
	//   17   29:return          
	}

	public void addTab(ActionBar.Tab tab, boolean flag)
	{
		ensureTabsExist();
	//    0    0:aload_0         
	//    1    1:invokespecial   #442 <Method void ensureTabsExist()>
		mTabScrollView.addTab(tab, flag);
	//    2    4:aload_0         
	//    3    5:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #446 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, boolean)>
		configureTab(tab, mTabs.size());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #115 <Field ArrayList mTabs>
	//   11   19:invokevirtual   #214 <Method int ArrayList.size()>
	//   12   22:invokespecial   #445 <Method void configureTab(ActionBar$Tab, int)>
		if(flag)
	//*  13   25:iload_2         
	//*  14   26:ifeq            34
			selectTab(tab);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #179 <Method void selectTab(ActionBar$Tab)>
	//   18   34:return          
	}

	public void animateToMode(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			showForActionMode();
	//    2    4:aload_0         
	//    3    5:invokespecial   #449 <Method void showForActionMode()>
		else
	//*   4    8:goto            15
			hideForActionMode();
	//    5   11:aload_0         
	//    6   12:invokespecial   #451 <Method void hideForActionMode()>
		if(shouldAnimateContextView())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #453 <Method boolean shouldAnimateContextView()>
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
	//   13   27:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   14   30:iconst_4        
	//   15   31:ldc2w           #31  <Long 100L>
	//   16   34:invokeinterface #457 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//   17   39:astore_3        
				viewpropertyanimatorcompat = mContextView.setupAnimatorToVisibility(0, 200L);
	//   18   40:aload_0         
	//   19   41:getfield        #324 <Field ActionBarContextView mContextView>
	//   20   44:iconst_0        
	//   21   45:ldc2w           #28  <Long 200L>
	//   22   48:invokevirtual   #458 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//   23   51:astore_2        
			} else
	//*  24   52:goto            82
			{
				viewpropertyanimatorcompat = mDecorToolbar.setupAnimatorToVisibility(0, 200L);
	//   25   55:aload_0         
	//   26   56:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   27   59:iconst_0        
	//   28   60:ldc2w           #28  <Long 200L>
	//   29   63:invokeinterface #457 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//   30   68:astore_2        
				viewpropertyanimatorcompat1 = mContextView.setupAnimatorToVisibility(8, 100L);
	//   31   69:aload_0         
	//   32   70:getfield        #324 <Field ActionBarContextView mContextView>
	//   33   73:bipush          8
	//   34   75:ldc2w           #31  <Long 100L>
	//   35   78:invokevirtual   #458 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//   36   81:astore_3        
			}
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   37   82:new             #460 <Class ViewPropertyAnimatorCompatSet>
	//   38   85:dup             
	//   39   86:invokespecial   #461 <Method void ViewPropertyAnimatorCompatSet()>
	//   40   89:astore          4
			viewpropertyanimatorcompatset.playSequentially(viewpropertyanimatorcompat1, viewpropertyanimatorcompat);
	//   41   91:aload           4
	//   42   93:aload_3         
	//   43   94:aload_2         
	//   44   95:invokevirtual   #465 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.playSequentially(ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompat)>
	//   45   98:pop             
			viewpropertyanimatorcompatset.start();
	//   46   99:aload           4
	//   47  101:invokevirtual   #468 <Method void ViewPropertyAnimatorCompatSet.start()>
			return;
	//   48  104:return          
		}
		if(flag)
	//*  49  105:iload_1         
	//*  50  106:ifeq            128
		{
			mDecorToolbar.setVisibility(4);
	//   51  109:aload_0         
	//   52  110:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   53  113:iconst_4        
	//   54  114:invokeinterface #469 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(0);
	//   55  119:aload_0         
	//   56  120:getfield        #324 <Field ActionBarContextView mContextView>
	//   57  123:iconst_0        
	//   58  124:invokevirtual   #470 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   59  127:return          
		} else
		{
			mDecorToolbar.setVisibility(0);
	//   60  128:aload_0         
	//   61  129:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   62  132:iconst_0        
	//   63  133:invokeinterface #469 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(8);
	//   64  138:aload_0         
	//   65  139:getfield        #324 <Field ActionBarContextView mContextView>
	//   66  142:bipush          8
	//   67  144:invokevirtual   #470 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   68  147:return          
		}
	}

	public boolean collapseActionView()
	{
		if(mDecorToolbar != null && mDecorToolbar.hasExpandedActionView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*   5   11:invokeinterface #474 <Method boolean DecorToolbar.hasExpandedActionView()>
	//*   6   16:ifeq            30
		{
			mDecorToolbar.collapseActionView();
	//    7   19:aload_0         
	//    8   20:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    9   23:invokeinterface #476 <Method void DecorToolbar.collapseActionView()>
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
	//*   1    1:getfield        #479 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
	//*   2    4:ifnull          30
		{
			mDeferredModeDestroyCallback.onDestroyActionMode(mDeferredDestroyActionMode);
	//    3    7:aload_0         
	//    4    8:getfield        #479 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
	//    5   11:aload_0         
	//    6   12:getfield        #481 <Field ActionMode mDeferredDestroyActionMode>
	//    7   15:invokeinterface #487 <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
			mDeferredDestroyActionMode = null;
	//    8   20:aload_0         
	//    9   21:aconst_null     
	//   10   22:putfield        #481 <Field ActionMode mDeferredDestroyActionMode>
			mDeferredModeDestroyCallback = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #479 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
		}
	//   14   30:return          
	}

	public void dispatchMenuVisibilityChanged(boolean flag)
	{
		if(flag == mLastMenuVisibility)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #490 <Field boolean mLastMenuVisibility>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mLastMenuVisibility = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #490 <Field boolean mLastMenuVisibility>
		int j = mMenuVisibilityListeners.size();
	//    8   14:aload_0         
	//    9   15:getfield        #119 <Field ArrayList mMenuVisibilityListeners>
	//   10   18:invokevirtual   #214 <Method int ArrayList.size()>
	//   11   21:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:iload_2         
	//*  15   25:iload_3         
	//*  16   26:icmpge          53
			((ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
	//   17   29:aload_0         
	//   18   30:getfield        #119 <Field ArrayList mMenuVisibilityListeners>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #218 <Method Object ArrayList.get(int)>
	//   21   37:checkcast       #492 <Class ActionBar$OnMenuVisibilityListener>
	//   22   40:iload_1         
	//   23   41:invokeinterface #495 <Method void ActionBar$OnMenuVisibilityListener.onMenuVisibilityChanged(boolean)>

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
	//*   1    1:getfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   2    4:ifnull          14
			mCurrentShowAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    5   11:invokevirtual   #500 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		if(mCurWindowVisibility == 0 && (mShowHideAnimationEnabled || flag))
	//*   6   14:aload_0         
	//*   7   15:getfield        #121 <Field int mCurWindowVisibility>
	//*   8   18:ifne            208
	//*   9   21:aload_0         
	//*  10   22:getfield        #502 <Field boolean mShowHideAnimationEnabled>
	//*  11   25:ifne            32
	//*  12   28:iload_1         
	//*  13   29:ifeq            208
		{
			mContainerView.setAlpha(1.0F);
	//   14   32:aload_0         
	//   15   33:getfield        #249 <Field ActionBarContainer mContainerView>
	//   16   36:fconst_1        
	//   17   37:invokevirtual   #505 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTransitioning(true);
	//   18   40:aload_0         
	//   19   41:getfield        #249 <Field ActionBarContainer mContainerView>
	//   20   44:iconst_1        
	//   21   45:invokevirtual   #508 <Method void ActionBarContainer.setTransitioning(boolean)>
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   22   48:new             #460 <Class ViewPropertyAnimatorCompatSet>
	//   23   51:dup             
	//   24   52:invokespecial   #461 <Method void ViewPropertyAnimatorCompatSet()>
	//   25   55:astore          4
			float f1 = -mContainerView.getHeight();
	//   26   57:aload_0         
	//   27   58:getfield        #249 <Field ActionBarContainer mContainerView>
	//   28   61:invokevirtual   #511 <Method int ActionBarContainer.getHeight()>
	//   29   64:ineg            
	//   30   65:i2f             
	//   31   66:fstore_3        
			float f = f1;
	//   32   67:fload_3         
	//   33   68:fstore_2        
			if(flag)
	//*  34   69:iload_1         
	//*  35   70:ifeq            106
			{
				int ai[] = new int[2];
	//   36   73:iconst_2        
	//   37   74:newarray        int[]
	//   38   76:astore          5
				int[] _tmp = ai;
	//   39   78:aload           5
	//   40   80:dup             
	//   41   81:iconst_0        
	//   42   82:iconst_0        
	//   43   83:iastore         
	//   44   84:dup             
	//   45   85:iconst_1        
	//   46   86:iconst_0        
	//   47   87:iastore         
	//   48   88:pop             
				ai[0] = 0;
				ai[1] = 0;
				mContainerView.getLocationInWindow(ai);
	//   49   89:aload_0         
	//   50   90:getfield        #249 <Field ActionBarContainer mContainerView>
	//   51   93:aload           5
	//   52   95:invokevirtual   #515 <Method void ActionBarContainer.getLocationInWindow(int[])>
				f = f1 - (float)ai[1];
	//   53   98:fload_3         
	//   54   99:aload           5
	//   55  101:iconst_1        
	//   56  102:iaload          
	//   57  103:i2f             
	//   58  104:fsub            
	//   59  105:fstore_2        
			}
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mContainerView))).translationY(f);
	//   60  106:aload_0         
	//   61  107:getfield        #249 <Field ActionBarContainer mContainerView>
	//   62  110:invokestatic    #519 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   63  113:fload_2         
	//   64  114:invokevirtual   #525 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   65  117:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   66  119:aload           5
	//   67  121:aload_0         
	//   68  122:getfield        #136 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   69  125:invokevirtual   #529 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   70  128:pop             
			viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat);
	//   71  129:aload           4
	//   72  131:aload           5
	//   73  133:invokevirtual   #533 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   74  136:pop             
			if(mContentAnimations && mContentView != null)
	//*  75  137:aload_0         
	//*  76  138:getfield        #123 <Field boolean mContentAnimations>
	//*  77  141:ifeq            168
	//*  78  144:aload_0         
	//*  79  145:getfield        #163 <Field View mContentView>
	//*  80  148:ifnull          168
				viewpropertyanimatorcompatset.play(ViewCompat.animate(mContentView).translationY(f));
	//   81  151:aload           4
	//   82  153:aload_0         
	//   83  154:getfield        #163 <Field View mContentView>
	//   84  157:invokestatic    #519 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   85  160:fload_2         
	//   86  161:invokevirtual   #525 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   87  164:invokevirtual   #533 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   88  167:pop             
			viewpropertyanimatorcompatset.setInterpolator(sHideInterpolator);
	//   89  168:aload           4
	//   90  170:getstatic       #102 <Field Interpolator sHideInterpolator>
	//   91  173:invokevirtual   #537 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//   92  176:pop             
			viewpropertyanimatorcompatset.setDuration(250L);
	//   93  177:aload           4
	//   94  179:ldc2w           #538 <Long 250L>
	//   95  182:invokevirtual   #543 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//   96  185:pop             
			viewpropertyanimatorcompatset.setListener(mHideListener);
	//   97  186:aload           4
	//   98  188:aload_0         
	//   99  189:getfield        #130 <Field ViewPropertyAnimatorListener mHideListener>
	//  100  192:invokevirtual   #547 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  101  195:pop             
			mCurrentShowAnim = viewpropertyanimatorcompatset;
	//  102  196:aload_0         
	//  103  197:aload           4
	//  104  199:putfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			viewpropertyanimatorcompatset.start();
	//  105  202:aload           4
	//  106  204:invokevirtual   #468 <Method void ViewPropertyAnimatorCompatSet.start()>
			return;
	//  107  207:return          
		} else
		{
			mHideListener.onAnimationEnd(((View) (null)));
	//  108  208:aload_0         
	//  109  209:getfield        #130 <Field ViewPropertyAnimatorListener mHideListener>
	//  110  212:aconst_null     
	//  111  213:invokeinterface #552 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
			return;
	//  112  218:return          
		}
	}

	public void doShow(boolean flag)
	{
		if(mCurrentShowAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   2    4:ifnull          14
			mCurrentShowAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    5   11:invokevirtual   #500 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		mContainerView.setVisibility(0);
	//    6   14:aload_0         
	//    7   15:getfield        #249 <Field ActionBarContainer mContainerView>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #553 <Method void ActionBarContainer.setVisibility(int)>
		if(mCurWindowVisibility == 0 && (mShowHideAnimationEnabled || flag))
	//*  10   22:aload_0         
	//*  11   23:getfield        #121 <Field int mCurWindowVisibility>
	//*  12   26:ifne            226
	//*  13   29:aload_0         
	//*  14   30:getfield        #502 <Field boolean mShowHideAnimationEnabled>
	//*  15   33:ifne            40
	//*  16   36:iload_1         
	//*  17   37:ifeq            226
		{
			mContainerView.setTranslationY(0.0F);
	//   18   40:aload_0         
	//   19   41:getfield        #249 <Field ActionBarContainer mContainerView>
	//   20   44:fconst_0        
	//   21   45:invokevirtual   #556 <Method void ActionBarContainer.setTranslationY(float)>
			float f1 = -mContainerView.getHeight();
	//   22   48:aload_0         
	//   23   49:getfield        #249 <Field ActionBarContainer mContainerView>
	//   24   52:invokevirtual   #511 <Method int ActionBarContainer.getHeight()>
	//   25   55:ineg            
	//   26   56:i2f             
	//   27   57:fstore_3        
			float f = f1;
	//   28   58:fload_3         
	//   29   59:fstore_2        
			if(flag)
	//*  30   60:iload_1         
	//*  31   61:ifeq            97
			{
				int ai[] = new int[2];
	//   32   64:iconst_2        
	//   33   65:newarray        int[]
	//   34   67:astore          4
				int[] _tmp = ai;
	//   35   69:aload           4
	//   36   71:dup             
	//   37   72:iconst_0        
	//   38   73:iconst_0        
	//   39   74:iastore         
	//   40   75:dup             
	//   41   76:iconst_1        
	//   42   77:iconst_0        
	//   43   78:iastore         
	//   44   79:pop             
				ai[0] = 0;
				ai[1] = 0;
				mContainerView.getLocationInWindow(ai);
	//   45   80:aload_0         
	//   46   81:getfield        #249 <Field ActionBarContainer mContainerView>
	//   47   84:aload           4
	//   48   86:invokevirtual   #515 <Method void ActionBarContainer.getLocationInWindow(int[])>
				f = f1 - (float)ai[1];
	//   49   89:fload_3         
	//   50   90:aload           4
	//   51   92:iconst_1        
	//   52   93:iaload          
	//   53   94:i2f             
	//   54   95:fsub            
	//   55   96:fstore_2        
			}
			mContainerView.setTranslationY(f);
	//   56   97:aload_0         
	//   57   98:getfield        #249 <Field ActionBarContainer mContainerView>
	//   58  101:fload_2         
	//   59  102:invokevirtual   #556 <Method void ActionBarContainer.setTranslationY(float)>
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   60  105:new             #460 <Class ViewPropertyAnimatorCompatSet>
	//   61  108:dup             
	//   62  109:invokespecial   #461 <Method void ViewPropertyAnimatorCompatSet()>
	//   63  112:astore          4
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mContainerView))).translationY(0.0F);
	//   64  114:aload_0         
	//   65  115:getfield        #249 <Field ActionBarContainer mContainerView>
	//   66  118:invokestatic    #519 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   67  121:fconst_0        
	//   68  122:invokevirtual   #525 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   69  125:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   70  127:aload           5
	//   71  129:aload_0         
	//   72  130:getfield        #136 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   73  133:invokevirtual   #529 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   74  136:pop             
			viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat);
	//   75  137:aload           4
	//   76  139:aload           5
	//   77  141:invokevirtual   #533 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   78  144:pop             
			if(mContentAnimations && mContentView != null)
	//*  79  145:aload_0         
	//*  80  146:getfield        #123 <Field boolean mContentAnimations>
	//*  81  149:ifeq            184
	//*  82  152:aload_0         
	//*  83  153:getfield        #163 <Field View mContentView>
	//*  84  156:ifnull          184
			{
				mContentView.setTranslationY(f);
	//   85  159:aload_0         
	//   86  160:getfield        #163 <Field View mContentView>
	//   87  163:fload_2         
	//   88  164:invokevirtual   #557 <Method void View.setTranslationY(float)>
				viewpropertyanimatorcompatset.play(ViewCompat.animate(mContentView).translationY(0.0F));
	//   89  167:aload           4
	//   90  169:aload_0         
	//   91  170:getfield        #163 <Field View mContentView>
	//   92  173:invokestatic    #519 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   93  176:fconst_0        
	//   94  177:invokevirtual   #525 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   95  180:invokevirtual   #533 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   96  183:pop             
			}
			viewpropertyanimatorcompatset.setInterpolator(sShowInterpolator);
	//   97  184:aload           4
	//   98  186:getstatic       #107 <Field Interpolator sShowInterpolator>
	//   99  189:invokevirtual   #537 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//  100  192:pop             
			viewpropertyanimatorcompatset.setDuration(250L);
	//  101  193:aload           4
	//  102  195:ldc2w           #538 <Long 250L>
	//  103  198:invokevirtual   #543 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//  104  201:pop             
			viewpropertyanimatorcompatset.setListener(mShowListener);
	//  105  202:aload           4
	//  106  204:aload_0         
	//  107  205:getfield        #133 <Field ViewPropertyAnimatorListener mShowListener>
	//  108  208:invokevirtual   #547 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  109  211:pop             
			mCurrentShowAnim = viewpropertyanimatorcompatset;
	//  110  212:aload_0         
	//  111  213:aload           4
	//  112  215:putfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			viewpropertyanimatorcompatset.start();
	//  113  218:aload           4
	//  114  220:invokevirtual   #468 <Method void ViewPropertyAnimatorCompatSet.start()>
		} else
	//* 115  223:goto            274
		{
			mContainerView.setAlpha(1.0F);
	//  116  226:aload_0         
	//  117  227:getfield        #249 <Field ActionBarContainer mContainerView>
	//  118  230:fconst_1        
	//  119  231:invokevirtual   #505 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTranslationY(0.0F);
	//  120  234:aload_0         
	//  121  235:getfield        #249 <Field ActionBarContainer mContainerView>
	//  122  238:fconst_0        
	//  123  239:invokevirtual   #556 <Method void ActionBarContainer.setTranslationY(float)>
			if(mContentAnimations && mContentView != null)
	//* 124  242:aload_0         
	//* 125  243:getfield        #123 <Field boolean mContentAnimations>
	//* 126  246:ifeq            264
	//* 127  249:aload_0         
	//* 128  250:getfield        #163 <Field View mContentView>
	//* 129  253:ifnull          264
				mContentView.setTranslationY(0.0F);
	//  130  256:aload_0         
	//  131  257:getfield        #163 <Field View mContentView>
	//  132  260:fconst_0        
	//  133  261:invokevirtual   #557 <Method void View.setTranslationY(float)>
			mShowListener.onAnimationEnd(((View) (null)));
	//  134  264:aload_0         
	//  135  265:getfield        #133 <Field ViewPropertyAnimatorListener mShowListener>
	//  136  268:aconst_null     
	//  137  269:invokeinterface #552 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
		}
		if(mOverlayLayout != null)
	//* 138  274:aload_0         
	//* 139  275:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//* 140  278:ifnull          288
			ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//  141  281:aload_0         
	//  142  282:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//  143  285:invokestatic    #247 <Method void ViewCompat.requestApplyInsets(View)>
	//  144  288:return          
	}

	public void enableContentAnimations(boolean flag)
	{
		mContentAnimations = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #123 <Field boolean mContentAnimations>
	//    3    5:return          
	}

	public View getCustomView()
	{
		return mDecorToolbar.getCustomView();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #561 <Method View DecorToolbar.getCustomView()>
	//    3    9:areturn         
	}

	public int getDisplayOptions()
	{
		return mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #334 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:ireturn         
	}

	public float getElevation()
	{
		return ViewCompat.getElevation(((View) (mContainerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:invokestatic    #566 <Method float ViewCompat.getElevation(View)>
	//    3    7:freturn         
	}

	public int getHeight()
	{
		return mContainerView.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:invokevirtual   #511 <Method int ActionBarContainer.getHeight()>
	//    3    7:ireturn         
	}

	public int getHideOffset()
	{
		return mOverlayLayout.getActionBarHideOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//    2    4:invokevirtual   #570 <Method int ActionBarOverlayLayout.getActionBarHideOffset()>
	//    3    7:ireturn         
	}

	public int getNavigationItemCount()
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #572 <Method int DecorToolbar.getNavigationMode()>
		{
	//*   3    9:tableswitch     1 2: default 32
	//	               1 42
	//	               2 34
		default:
			return 0;
	//    4   32:iconst_0        
	//    5   33:ireturn         

		case 2: // '\002'
			return mTabs.size();
	//    6   34:aload_0         
	//    7   35:getfield        #115 <Field ArrayList mTabs>
	//    8   38:invokevirtual   #214 <Method int ArrayList.size()>
	//    9   41:ireturn         

		case 1: // '\001'
			return mDecorToolbar.getDropdownItemCount();
	//   10   42:aload_0         
	//   11   43:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   12   46:invokeinterface #575 <Method int DecorToolbar.getDropdownItemCount()>
	//   13   51:ireturn         
		}
	}

	public int getNavigationMode()
	{
		return mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #572 <Method int DecorToolbar.getNavigationMode()>
	//    3    9:ireturn         
	}

	public int getSelectedNavigationIndex()
	{
		int j = mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #572 <Method int DecorToolbar.getNavigationMode()>
	//    3    9:istore_2        
		int i = -1;
	//    4   10:iconst_m1       
	//    5   11:istore_1        
		switch(j)
	//*   6   12:iload_2         
		{
	//*   7   13:tableswitch     1 2: default 36
	//	               1 55
	//	               2 38
		default:
			return -1;
	//    8   36:iconst_m1       
	//    9   37:ireturn         

		case 2: // '\002'
			if(mSelectedTab != null)
	//*  10   38:aload_0         
	//*  11   39:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  12   42:ifnull          53
				i = mSelectedTab.getPosition();
	//   13   45:aload_0         
	//   14   46:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   15   49:invokevirtual   #579 <Method int WindowDecorActionBar$TabImpl.getPosition()>
	//   16   52:istore_1        
			return i;
	//   17   53:iload_1         
	//   18   54:ireturn         

		case 1: // '\001'
			return mDecorToolbar.getDropdownSelectedPosition();
	//   19   55:aload_0         
	//   20   56:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   21   59:invokeinterface #582 <Method int DecorToolbar.getDropdownSelectedPosition()>
	//   22   64:ireturn         
		}
	}

	public ActionBar.Tab getSelectedTab()
	{
		return ((ActionBar.Tab) (mSelectedTab));
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//    2    4:areturn         
	}

	public CharSequence getSubtitle()
	{
		return mDecorToolbar.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #588 <Method CharSequence DecorToolbar.getSubtitle()>
	//    3    9:areturn         
	}

	public ActionBar.Tab getTabAt(int i)
	{
		return (ActionBar.Tab)mTabs.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ArrayList mTabs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #218 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #592 <Class ActionBar$Tab>
	//    5   11:areturn         
	}

	public int getTabCount()
	{
		return mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ArrayList mTabs>
	//    2    4:invokevirtual   #214 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public Context getThemedContext()
	{
		if(mThemedContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #596 <Field Context mThemedContext>
	//*   2    4:ifnonnull       67
		{
			TypedValue typedvalue = new TypedValue();
	//    3    7:new             #598 <Class TypedValue>
	//    4   10:dup             
	//    5   11:invokespecial   #599 <Method void TypedValue()>
	//    6   14:astore_2        
			mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//    7   15:aload_0         
	//    8   16:getfield        #221 <Field Context mContext>
	//    9   19:invokevirtual   #603 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   22:getstatic       #606 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   11   25:aload_2         
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #612 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   30:pop             
			int i = typedvalue.resourceId;
	//   15   31:aload_2         
	//   16   32:getfield        #615 <Field int TypedValue.resourceId>
	//   17   35:istore_1        
			if(i != 0)
	//*  18   36:iload_1         
	//*  19   37:ifeq            59
				mThemedContext = ((Context) (new ContextThemeWrapper(mContext, i)));
	//   20   40:aload_0         
	//   21   41:new             #617 <Class ContextThemeWrapper>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #221 <Field Context mContext>
	//   25   49:iload_1         
	//   26   50:invokespecial   #620 <Method void ContextThemeWrapper(Context, int)>
	//   27   53:putfield        #596 <Field Context mThemedContext>
			else
	//*  28   56:goto            67
				mThemedContext = mContext;
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #221 <Field Context mContext>
	//   32   64:putfield        #596 <Field Context mThemedContext>
		}
		return mThemedContext;
	//   33   67:aload_0         
	//   34   68:getfield        #596 <Field Context mThemedContext>
	//   35   71:areturn         
	}

	public CharSequence getTitle()
	{
		return mDecorToolbar.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #623 <Method CharSequence DecorToolbar.getTitle()>
	//    3    9:areturn         
	}

	public boolean hasIcon()
	{
		return mDecorToolbar.hasIcon();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #626 <Method boolean DecorToolbar.hasIcon()>
	//    3    9:ireturn         
	}

	public boolean hasLogo()
	{
		return mDecorToolbar.hasLogo();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #629 <Method boolean DecorToolbar.hasLogo()>
	//    3    9:ireturn         
	}

	public void hide()
	{
		if(!mHiddenByApp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #415 <Field boolean mHiddenByApp>
	//*   2    4:ifne            17
		{
			mHiddenByApp = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #415 <Field boolean mHiddenByApp>
			updateVisibility(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokespecial   #303 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public void hideForSystem()
	{
		if(!mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #417 <Field boolean mHiddenBySystem>
	//*   2    4:ifne            17
		{
			mHiddenBySystem = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #417 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #303 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public boolean isHideOnContentScrollEnabled()
	{
		return mOverlayLayout.isHideOnContentScrollEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//    2    4:invokevirtual   #634 <Method boolean ActionBarOverlayLayout.isHideOnContentScrollEnabled()>
	//    3    7:ireturn         
	}

	public boolean isShowing()
	{
		int i = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #636 <Method int getHeight()>
	//    2    4:istore_1        
		return mNowShowing && (i == 0 || getHideOffset() < i);
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field boolean mNowShowing>
	//    5    9:ifeq            26
	//    6   12:iload_1         
	//    7   13:ifeq            24
	//    8   16:aload_0         
	//    9   17:invokevirtual   #638 <Method int getHideOffset()>
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
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    5   11:invokeinterface #641 <Method boolean DecorToolbar.isTitleTruncated()>
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
	//    3    5:invokespecial   #643 <Method void WindowDecorActionBar$TabImpl(WindowDecorActionBar)>
	//    4    8:areturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #221 <Field Context mContext>
	//    3    5:invokestatic    #341 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    4    8:invokevirtual   #351 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//    5   11:invokespecial   #354 <Method void setHasEmbeddedTabs(boolean)>
	//    6   14:return          
	}

	public void onContentScrollStarted()
	{
		if(mCurrentShowAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   2    4:ifnull          19
		{
			mCurrentShowAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    5   11:invokevirtual   #500 <Method void ViewPropertyAnimatorCompatSet.cancel()>
			mCurrentShowAnim = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
		}
	//    9   19:return          
	}

	public void onContentScrollStopped()
	{
	//    0    0:return          
	}

	public boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		if(mActionMode == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #651 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		Menu menu = mActionMode.getMenu();
	//    5    9:aload_0         
	//    6   10:getfield        #651 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//    7   13:invokevirtual   #655 <Method Menu WindowDecorActionBar$ActionModeImpl.getMenu()>
	//    8   16:astore          5
		if(menu != null)
	//*   9   18:aload           5
	//*  10   20:ifnull          79
		{
			int j;
			if(keyevent != null)
	//*  11   23:aload_2         
	//*  12   24:ifnull          35
				j = keyevent.getDeviceId();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #660 <Method int KeyEvent.getDeviceId()>
	//   15   31:istore_3        
			else
	//*  16   32:goto            37
				j = -1;
	//   17   35:iconst_m1       
	//   18   36:istore_3        
			j = KeyCharacterMap.load(j).getKeyboardType();
	//   19   37:iload_3         
	//   20   38:invokestatic    #666 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//   21   41:invokevirtual   #669 <Method int KeyCharacterMap.getKeyboardType()>
	//   22   44:istore_3        
			boolean flag = true;
	//   23   45:iconst_1        
	//   24   46:istore          4
			if(j == 1)
	//*  25   48:iload_3         
	//*  26   49:iconst_1        
	//*  27   50:icmpeq          56
	//*  28   53:goto            59
				flag = false;
	//   29   56:iconst_0        
	//   30   57:istore          4
			menu.setQwertyMode(flag);
	//   31   59:aload           5
	//   32   61:iload           4
	//   33   63:invokeinterface #674 <Method void Menu.setQwertyMode(boolean)>
			return menu.performShortcut(i, keyevent, 0);
	//   34   68:aload           5
	//   35   70:iload_1         
	//   36   71:aload_2         
	//   37   72:iconst_0        
	//   38   73:invokeinterface #678 <Method boolean Menu.performShortcut(int, KeyEvent, int)>
	//   39   78:ireturn         
		} else
		{
			return false;
	//   40   79:iconst_0        
	//   41   80:ireturn         
		}
	}

	public void onWindowVisibilityChanged(int i)
	{
		mCurWindowVisibility = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #121 <Field int mCurWindowVisibility>
	//    3    5:return          
	}

	public void removeAllTabs()
	{
		cleanupTabs();
	//    0    0:aload_0         
	//    1    1:invokespecial   #681 <Method void cleanupTabs()>
	//    2    4:return          
	}

	public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.remove(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #685 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTab(ActionBar.Tab tab)
	{
		removeTabAt(tab.getPosition());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #687 <Method int ActionBar$Tab.getPosition()>
	//    3    5:invokevirtual   #690 <Method void removeTabAt(int)>
	//    4    8:return          
	}

	public void removeTabAt(int i)
	{
		if(mTabScrollView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		int j;
		if(mSelectedTab != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*   6   12:ifnull          26
			j = mSelectedTab.getPosition();
	//    7   15:aload_0         
	//    8   16:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//    9   19:invokevirtual   #579 <Method int WindowDecorActionBar$TabImpl.getPosition()>
	//   10   22:istore_2        
		else
	//*  11   23:goto            31
			j = mSavedTabPosition;
	//   12   26:aload_0         
	//   13   27:getfield        #117 <Field int mSavedTabPosition>
	//   14   30:istore_2        
		mTabScrollView.removeTabAt(i);
	//   15   31:aload_0         
	//   16   32:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   17   35:iload_1         
	//   18   36:invokevirtual   #691 <Method void ScrollingTabContainerView.removeTabAt(int)>
		TabImpl tabimpl = (TabImpl)mTabs.remove(i);
	//   19   39:aload_0         
	//   20   40:getfield        #115 <Field ArrayList mTabs>
	//   21   43:iload_1         
	//   22   44:invokevirtual   #693 <Method Object ArrayList.remove(int)>
	//   23   47:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   24   50:astore          5
		if(tabimpl != null)
	//*  25   52:aload           5
	//*  26   54:ifnull          63
			tabimpl.setPosition(-1);
	//   27   57:aload           5
	//   28   59:iconst_m1       
	//   29   60:invokevirtual   #206 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
		int l = mTabs.size();
	//   30   63:aload_0         
	//   31   64:getfield        #115 <Field ArrayList mTabs>
	//   32   67:invokevirtual   #214 <Method int ArrayList.size()>
	//   33   70:istore          4
		for(int k = i; k < l; k++)
	//*  34   72:iload_1         
	//*  35   73:istore_3        
	//*  36   74:iload_3         
	//*  37   75:iload           4
	//*  38   77:icmpge          102
			((TabImpl)mTabs.get(k)).setPosition(k);
	//   39   80:aload_0         
	//   40   81:getfield        #115 <Field ArrayList mTabs>
	//   41   84:iload_3         
	//   42   85:invokevirtual   #218 <Method Object ArrayList.get(int)>
	//   43   88:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   44   91:iload_3         
	//   45   92:invokevirtual   #206 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>

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
	//*  55  108:getfield        #115 <Field ArrayList mTabs>
	//*  56  111:invokevirtual   #434 <Method boolean ArrayList.isEmpty()>
	//*  57  114:ifeq            123
				tabimpl1 = null;
	//   58  117:aconst_null     
	//   59  118:astore          5
			else
	//*  60  120:goto            142
				tabimpl1 = (TabImpl)mTabs.get(Math.max(0, i - 1));
	//   61  123:aload_0         
	//   62  124:getfield        #115 <Field ArrayList mTabs>
	//   63  127:iconst_0        
	//   64  128:iload_1         
	//   65  129:iconst_1        
	//   66  130:isub            
	//   67  131:invokestatic    #698 <Method int Math.max(int, int)>
	//   68  134:invokevirtual   #218 <Method Object ArrayList.get(int)>
	//   69  137:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   70  140:astore          5
			selectTab(((ActionBar.Tab) (tabimpl1)));
	//   71  142:aload_0         
	//   72  143:aload           5
	//   73  145:invokevirtual   #179 <Method void selectTab(ActionBar$Tab)>
		}
	//   74  148:return          
	}

	public boolean requestFocus()
	{
		ViewGroup viewgroup = mDecorToolbar.getViewGroup();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #703 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:astore_1        
		if(viewgroup != null && !viewgroup.hasFocus())
	//*   4   10:aload_1         
	//*   5   11:ifnull          28
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #708 <Method boolean ViewGroup.hasFocus()>
	//*   8   18:ifne            28
		{
			viewgroup.requestFocus();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #710 <Method boolean ViewGroup.requestFocus()>
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
		int j = getNavigationMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #240 <Method int getNavigationMode()>
	//    2    4:istore_3        
		int i = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_2        
		if(j != 2)
	//*   5    7:iload_3         
	//*   6    8:iconst_2        
	//*   7    9:icmpeq          27
		{
			if(tab != null)
	//*   8   12:aload_1         
	//*   9   13:ifnull          21
				i = tab.getPosition();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #687 <Method int ActionBar$Tab.getPosition()>
	//   12   20:istore_2        
			mSavedTabPosition = i;
	//   13   21:aload_0         
	//   14   22:iload_2         
	//   15   23:putfield        #117 <Field int mSavedTabPosition>
			return;
	//   16   26:return          
		}
		FragmentTransaction fragmenttransaction;
		if((mActivity instanceof FragmentActivity) && !mDecorToolbar.getViewGroup().isInEditMode())
	//*  17   27:aload_0         
	//*  18   28:getfield        #138 <Field Activity mActivity>
	//*  19   31:instanceof      #712 <Class FragmentActivity>
	//*  20   34:ifeq            73
	//*  21   37:aload_0         
	//*  22   38:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*  23   41:invokeinterface #703 <Method ViewGroup DecorToolbar.getViewGroup()>
	//*  24   46:invokevirtual   #715 <Method boolean ViewGroup.isInEditMode()>
	//*  25   49:ifne            73
			fragmenttransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
	//   26   52:aload_0         
	//   27   53:getfield        #138 <Field Activity mActivity>
	//   28   56:checkcast       #712 <Class FragmentActivity>
	//   29   59:invokevirtual   #719 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   30   62:invokevirtual   #725 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   31   65:invokevirtual   #730 <Method FragmentTransaction FragmentTransaction.disallowAddToBackStack()>
	//   32   68:astore          4
		else
	//*  33   70:goto            76
			fragmenttransaction = null;
	//   34   73:aconst_null     
	//   35   74:astore          4
		if(mSelectedTab == tab)
	//*  36   76:aload_0         
	//*  37   77:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  38   80:aload_1         
	//*  39   81:if_acmpne       123
		{
			if(mSelectedTab != null)
	//*  40   84:aload_0         
	//*  41   85:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  42   88:ifnull          202
			{
				mSelectedTab.getCallback().onTabReselected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   43   91:aload_0         
	//   44   92:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   45   95:invokevirtual   #195 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   46   98:aload_0         
	//   47   99:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   48  102:aload           4
	//   49  104:invokeinterface #736 <Method void ActionBar$TabListener.onTabReselected(ActionBar$Tab, FragmentTransaction)>
				mTabScrollView.animateToTab(tab.getPosition());
	//   50  109:aload_0         
	//   51  110:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   52  113:aload_1         
	//   53  114:invokevirtual   #687 <Method int ActionBar$Tab.getPosition()>
	//   54  117:invokevirtual   #739 <Method void ScrollingTabContainerView.animateToTab(int)>
			}
		} else
	//*  55  120:goto            202
		{
			ScrollingTabContainerView scrollingtabcontainerview = mTabScrollView;
	//   56  123:aload_0         
	//   57  124:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   58  127:astore          5
			if(tab != null)
	//*  59  129:aload_1         
	//*  60  130:ifnull          138
				i = tab.getPosition();
	//   61  133:aload_1         
	//   62  134:invokevirtual   #687 <Method int ActionBar$Tab.getPosition()>
	//   63  137:istore_2        
			scrollingtabcontainerview.setTabSelected(i);
	//   64  138:aload           5
	//   65  140:iload_2         
	//   66  141:invokevirtual   #742 <Method void ScrollingTabContainerView.setTabSelected(int)>
			if(mSelectedTab != null)
	//*  67  144:aload_0         
	//*  68  145:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  69  148:ifnull          169
				mSelectedTab.getCallback().onTabUnselected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   70  151:aload_0         
	//   71  152:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   72  155:invokevirtual   #195 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   73  158:aload_0         
	//   74  159:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   75  162:aload           4
	//   76  164:invokeinterface #745 <Method void ActionBar$TabListener.onTabUnselected(ActionBar$Tab, FragmentTransaction)>
			mSelectedTab = (TabImpl)tab;
	//   77  169:aload_0         
	//   78  170:aload_1         
	//   79  171:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   80  174:putfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
			if(mSelectedTab != null)
	//*  81  177:aload_0         
	//*  82  178:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  83  181:ifnull          202
				mSelectedTab.getCallback().onTabSelected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   84  184:aload_0         
	//   85  185:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   86  188:invokevirtual   #195 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   87  191:aload_0         
	//   88  192:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   89  195:aload           4
	//   90  197:invokeinterface #748 <Method void ActionBar$TabListener.onTabSelected(ActionBar$Tab, FragmentTransaction)>
		}
		if(fragmenttransaction != null && !fragmenttransaction.isEmpty())
	//*  91  202:aload           4
	//*  92  204:ifnull          221
	//*  93  207:aload           4
	//*  94  209:invokevirtual   #749 <Method boolean FragmentTransaction.isEmpty()>
	//*  95  212:ifne            221
			fragmenttransaction.commit();
	//   96  215:aload           4
	//   97  217:invokevirtual   #752 <Method int FragmentTransaction.commit()>
	//   98  220:pop             
	//   99  221:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		mContainerView.setPrimaryBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #757 <Method void ActionBarContainer.setPrimaryBackground(Drawable)>
	//    4    8:return          
	}

	public void setCustomView(int i)
	{
		setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, mDecorToolbar.getViewGroup(), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #760 <Method Context getThemedContext()>
	//    3    5:invokestatic    #766 <Method LayoutInflater LayoutInflater.from(Context)>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    7   13:invokeinterface #703 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #770 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   22:invokevirtual   #772 <Method void setCustomView(View)>
	//   11   25:return          
	}

	public void setCustomView(View view)
	{
		mDecorToolbar.setCustomView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #773 <Method void DecorToolbar.setCustomView(View)>
	//    4   10:return          
	}

	public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
	{
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #778 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mDecorToolbar.setCustomView(view);
	//    3    5:aload_0         
	//    4    6:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    5    9:aload_1         
	//    6   10:invokeinterface #773 <Method void DecorToolbar.setCustomView(View)>
	//    7   15:return          
	}

	public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
	{
		if(!mDisplayHomeAsUpSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #336 <Field boolean mDisplayHomeAsUpSet>
	//*   2    4:ifne            12
			setDisplayHomeAsUpEnabled(flag);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #782 <Method void setDisplayHomeAsUpEnabled(boolean)>
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
	//   10   14:invokevirtual   #786 <Method void setDisplayOptions(int, int)>
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
	//    6    8:putfield        #336 <Field boolean mDisplayHomeAsUpSet>
		mDecorToolbar.setDisplayOptions(i);
	//    7   11:aload_0         
	//    8   12:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    9   15:iload_1         
	//   10   16:invokeinterface #788 <Method void DecorToolbar.setDisplayOptions(int)>
	//   11   21:return          
	}

	public void setDisplayOptions(int i, int j)
	{
		int k = mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #334 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:istore_3        
		if((j & 4) != 0)
	//*   4   10:iload_2         
	//*   5   11:iconst_4        
	//*   6   12:iand            
	//*   7   13:ifeq            21
			mDisplayHomeAsUpSet = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #336 <Field boolean mDisplayHomeAsUpSet>
		mDecorToolbar.setDisplayOptions(i & j | ~j & k);
	//   11   21:aload_0         
	//   12   22:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:iand            
	//   16   28:iload_2         
	//   17   29:iconst_m1       
	//   18   30:ixor            
	//   19   31:iload_3         
	//   20   32:iand            
	//   21   33:ior             
	//   22   34:invokeinterface #788 <Method void DecorToolbar.setDisplayOptions(int)>
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
	//   10   16:invokevirtual   #786 <Method void setDisplayOptions(int, int)>
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
	//   10   14:invokevirtual   #786 <Method void setDisplayOptions(int, int)>
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
	//   10   16:invokevirtual   #786 <Method void setDisplayOptions(int, int)>
	//   11   19:return          
	}

	public void setDisplayUseLogoEnabled(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #794 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #796 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #799 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void setElevation(float f)
	{
		ViewCompat.setElevation(((View) (mContainerView)), f);
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:fload_1         
	//    3    5:invokestatic    #802 <Method void ViewCompat.setElevation(View, float)>
	//    4    8:return          
	}

	public void setHideOffset(int i)
	{
		if(i != 0 && !mOverlayLayout.isInOverlayMode())
	//*   0    0:iload_1         
	//*   1    1:ifeq            25
	//*   2    4:aload_0         
	//*   3    5:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   4    8:invokevirtual   #806 <Method boolean ActionBarOverlayLayout.isInOverlayMode()>
	//*   5   11:ifne            25
		{
			throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
	//    6   14:new             #197 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #808 <String "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset">
	//    9   21:invokespecial   #202 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			mOverlayLayout.setActionBarHideOffset(i);
	//   11   25:aload_0         
	//   12   26:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   13   29:iload_1         
	//   14   30:invokevirtual   #811 <Method void ActionBarOverlayLayout.setActionBarHideOffset(int)>
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
	//*   3    5:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   4    8:invokevirtual   #806 <Method boolean ActionBarOverlayLayout.isInOverlayMode()>
	//*   5   11:ifne            25
		{
			throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
	//    6   14:new             #197 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #813 <String "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll">
	//    9   21:invokespecial   #202 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			mHideOnContentScroll = flag;
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:putfield        #815 <Field boolean mHideOnContentScroll>
			mOverlayLayout.setHideOnContentScrollEnabled(flag);
	//   14   30:aload_0         
	//   15   31:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   16   34:iload_1         
	//   17   35:invokevirtual   #816 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
			return;
	//   18   38:return          
		}
	}

	public void setHomeActionContentDescription(int i)
	{
		mDecorToolbar.setNavigationContentDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #820 <Method void DecorToolbar.setNavigationContentDescription(int)>
	//    4   10:return          
	}

	public void setHomeActionContentDescription(CharSequence charsequence)
	{
		mDecorToolbar.setNavigationContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #823 <Method void DecorToolbar.setNavigationContentDescription(CharSequence)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
		mDecorToolbar.setNavigationIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #827 <Method void DecorToolbar.setNavigationIcon(int)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
		mDecorToolbar.setNavigationIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #829 <Method void DecorToolbar.setNavigationIcon(Drawable)>
	//    4   10:return          
	}

	public void setHomeButtonEnabled(boolean flag)
	{
		mDecorToolbar.setHomeButtonEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #830 <Method void DecorToolbar.setHomeButtonEnabled(boolean)>
	//    4   10:return          
	}

	public void setIcon(int i)
	{
		mDecorToolbar.setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #833 <Method void DecorToolbar.setIcon(int)>
	//    4   10:return          
	}

	public void setIcon(Drawable drawable)
	{
		mDecorToolbar.setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #835 <Method void DecorToolbar.setIcon(Drawable)>
	//    4   10:return          
	}

	public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
	{
		mDecorToolbar.setDropdownParams(spinneradapter, ((android.widget.AdapterView.OnItemSelectedListener) (new NavItemSelectedListener(onnavigationlistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:new             #839 <Class NavItemSelectedListener>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #842 <Method void NavItemSelectedListener(ActionBar$OnNavigationListener)>
	//    7   13:invokeinterface #846 <Method void DecorToolbar.setDropdownParams(SpinnerAdapter, android.widget.AdapterView$OnItemSelectedListener)>
	//    8   18:return          
	}

	public void setLogo(int i)
	{
		mDecorToolbar.setLogo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #849 <Method void DecorToolbar.setLogo(int)>
	//    4   10:return          
	}

	public void setLogo(Drawable drawable)
	{
		mDecorToolbar.setLogo(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #851 <Method void DecorToolbar.setLogo(Drawable)>
	//    4   10:return          
	}

	public void setNavigationMode(int i)
	{
		int j = mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #572 <Method int DecorToolbar.getNavigationMode()>
	//    3    9:istore_2        
		if(j == 2)
	//*   4   10:iload_2         
	//*   5   11:iconst_2        
	//*   6   12:icmpeq          18
	//*   7   15:goto            40
		{
			mSavedTabPosition = getSelectedNavigationIndex();
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:invokevirtual   #854 <Method int getSelectedNavigationIndex()>
	//   11   23:putfield        #117 <Field int mSavedTabPosition>
			selectTab(((ActionBar.Tab) (null)));
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:invokevirtual   #179 <Method void selectTab(ActionBar$Tab)>
			mTabScrollView.setVisibility(8);
	//   15   31:aload_0         
	//   16   32:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   17   35:bipush          8
	//   18   37:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
		}
		if(j != i && !mHasEmbeddedTabs && mOverlayLayout != null)
	//*  19   40:iload_2         
	//*  20   41:iload_1         
	//*  21   42:icmpeq          66
	//*  22   45:aload_0         
	//*  23   46:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  24   49:ifne            66
	//*  25   52:aload_0         
	//*  26   53:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  27   56:ifnull          66
			ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//   28   59:aload_0         
	//   29   60:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   30   63:invokestatic    #247 <Method void ViewCompat.requestApplyInsets(View)>
		mDecorToolbar.setNavigationMode(i);
	//   31   66:aload_0         
	//   32   67:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   33   70:iload_1         
	//   34   71:invokeinterface #856 <Method void DecorToolbar.setNavigationMode(int)>
		boolean flag1 = false;
	//   35   76:iconst_0        
	//   36   77:istore          4
		if(i == 2)
	//*  37   79:iload_1         
	//*  38   80:iconst_2        
	//*  39   81:icmpeq          87
	//*  40   84:goto            120
		{
			ensureTabsExist();
	//   41   87:aload_0         
	//   42   88:invokespecial   #442 <Method void ensureTabsExist()>
			mTabScrollView.setVisibility(0);
	//   43   91:aload_0         
	//   44   92:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   45   95:iconst_0        
	//   46   96:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
			if(mSavedTabPosition != -1)
	//*  47   99:aload_0         
	//*  48  100:getfield        #117 <Field int mSavedTabPosition>
	//*  49  103:iconst_m1       
	//*  50  104:icmpeq          120
			{
				setSelectedNavigationItem(mSavedTabPosition);
	//   51  107:aload_0         
	//   52  108:aload_0         
	//   53  109:getfield        #117 <Field int mSavedTabPosition>
	//   54  112:invokevirtual   #859 <Method void setSelectedNavigationItem(int)>
				mSavedTabPosition = -1;
	//   55  115:aload_0         
	//   56  116:iconst_m1       
	//   57  117:putfield        #117 <Field int mSavedTabPosition>
			}
		}
		Object obj = ((Object) (mDecorToolbar));
	//   58  120:aload_0         
	//   59  121:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   60  124:astore          5
		boolean flag;
		if(i == 2 && !mHasEmbeddedTabs)
	//*  61  126:iload_1         
	//*  62  127:iconst_2        
	//*  63  128:icmpne          143
	//*  64  131:aload_0         
	//*  65  132:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  66  135:ifne            143
			flag = true;
	//   67  138:iconst_1        
	//   68  139:istore_3        
		else
	//*  69  140:goto            145
			flag = false;
	//   70  143:iconst_0        
	//   71  144:istore_3        
		((DecorToolbar) (obj)).setCollapsible(flag);
	//   72  145:aload           5
	//   73  147:iload_3         
	//   74  148:invokeinterface #404 <Method void DecorToolbar.setCollapsible(boolean)>
		obj = ((Object) (mOverlayLayout));
	//   75  153:aload_0         
	//   76  154:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   77  157:astore          5
		flag = flag1;
	//   78  159:iload           4
	//   79  161:istore_3        
		if(i == 2)
	//*  80  162:iload_1         
	//*  81  163:iconst_2        
	//*  82  164:icmpne          179
		{
			flag = flag1;
	//   83  167:iload           4
	//   84  169:istore_3        
			if(!mHasEmbeddedTabs)
	//*  85  170:aload_0         
	//*  86  171:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  87  174:ifne            179
				flag = true;
	//   88  177:iconst_1        
	//   89  178:istore_3        
		}
		((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
	//   90  179:aload           5
	//   91  181:iload_3         
	//   92  182:invokevirtual   #407 <Method void ActionBarOverlayLayout.setHasNonEmbeddedTabs(boolean)>
	//   93  185:return          
	}

	public void setSelectedNavigationItem(int i)
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #572 <Method int DecorToolbar.getNavigationMode()>
		{
	//*   3    9:tableswitch     1 2: default 32
	//	               1 59
	//	               2 43
		default:
			throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
	//    4   32:new             #197 <Class IllegalStateException>
	//    5   35:dup             
	//    6   36:ldc2            #861 <String "setSelectedNavigationIndex not valid for current navigation mode">
	//    7   39:invokespecial   #202 <Method void IllegalStateException(String)>
	//    8   42:athrow          

		case 2: // '\002'
			selectTab((ActionBar.Tab)mTabs.get(i));
	//    9   43:aload_0         
	//   10   44:aload_0         
	//   11   45:getfield        #115 <Field ArrayList mTabs>
	//   12   48:iload_1         
	//   13   49:invokevirtual   #218 <Method Object ArrayList.get(int)>
	//   14   52:checkcast       #592 <Class ActionBar$Tab>
	//   15   55:invokevirtual   #179 <Method void selectTab(ActionBar$Tab)>
			return;
	//   16   58:return          

		case 1: // '\001'
			mDecorToolbar.setDropdownSelectedPosition(i);
	//   17   59:aload_0         
	//   18   60:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   19   63:iload_1         
	//   20   64:invokeinterface #864 <Method void DecorToolbar.setDropdownSelectedPosition(int)>
			return;
	//   21   69:return          
		}
	}

	public void setShowHideAnimationEnabled(boolean flag)
	{
		mShowHideAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #502 <Field boolean mShowHideAnimationEnabled>
		if(!flag && mCurrentShowAnim != null)
	//*   3    5:iload_1         
	//*   4    6:ifne            23
	//*   5    9:aload_0         
	//*   6   10:getfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   7   13:ifnull          23
			mCurrentShowAnim.cancel();
	//    8   16:aload_0         
	//    9   17:getfield        #497 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//   10   20:invokevirtual   #500 <Method void ViewPropertyAnimatorCompatSet.cancel()>
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
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #870 <Method void ActionBarContainer.setStackedBackground(Drawable)>
	//    4    8:return          
	}

	public void setSubtitle(int i)
	{
		setSubtitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #221 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #875 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #877 <Method void setSubtitle(CharSequence)>
	//    6   12:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mDecorToolbar.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #878 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//    4   10:return          
	}

	public void setTitle(int i)
	{
		setTitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #221 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #875 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #881 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mDecorToolbar.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #882 <Method void DecorToolbar.setTitle(CharSequence)>
	//    4   10:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		mDecorToolbar.setWindowTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #885 <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//    4   10:return          
	}

	public void show()
	{
		if(mHiddenByApp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #415 <Field boolean mHiddenByApp>
	//*   2    4:ifeq            17
		{
			mHiddenByApp = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #415 <Field boolean mHiddenByApp>
			updateVisibility(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokespecial   #303 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public void showForSystem()
	{
		if(mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #417 <Field boolean mHiddenBySystem>
	//*   2    4:ifeq            17
		{
			mHiddenBySystem = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #417 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #303 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		if(mActionMode != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #651 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//*   2    4:ifnull          14
			mActionMode.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #651 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//    5   11:invokevirtual   #892 <Method void WindowDecorActionBar$ActionModeImpl.finish()>
		mOverlayLayout.setHideOnContentScrollEnabled(false);
	//    6   14:aload_0         
	//    7   15:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #816 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
		mContextView.killMode();
	//   10   22:aload_0         
	//   11   23:getfield        #324 <Field ActionBarContextView mContextView>
	//   12   26:invokevirtual   #895 <Method void ActionBarContextView.killMode()>
		callback = ((android.support.v7.view.ActionMode.Callback) (new ActionModeImpl(mContextView.getContext(), callback)));
	//   13   29:new             #14  <Class WindowDecorActionBar$ActionModeImpl>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #324 <Field ActionBarContextView mContextView>
	//   18   38:invokevirtual   #896 <Method Context ActionBarContextView.getContext()>
	//   19   41:aload_1         
	//   20   42:invokespecial   #899 <Method void WindowDecorActionBar$ActionModeImpl(WindowDecorActionBar, Context, android.support.v7.view.ActionMode$Callback)>
	//   21   45:astore_1        
		if(((ActionModeImpl) (callback)).dispatchOnCreate())
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #902 <Method boolean WindowDecorActionBar$ActionModeImpl.dispatchOnCreate()>
	//*  24   50:ifeq            86
		{
			mActionMode = ((ActionModeImpl) (callback));
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:putfield        #651 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
			((ActionModeImpl) (callback)).invalidate();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #905 <Method void WindowDecorActionBar$ActionModeImpl.invalidate()>
			mContextView.initForMode(((ActionMode) (callback)));
	//   30   62:aload_0         
	//   31   63:getfield        #324 <Field ActionBarContextView mContextView>
	//   32   66:aload_1         
	//   33   67:invokevirtual   #908 <Method void ActionBarContextView.initForMode(ActionMode)>
			animateToMode(true);
	//   34   70:aload_0         
	//   35   71:iconst_1        
	//   36   72:invokevirtual   #910 <Method void animateToMode(boolean)>
			mContextView.sendAccessibilityEvent(32);
	//   37   75:aload_0         
	//   38   76:getfield        #324 <Field ActionBarContextView mContextView>
	//   39   79:bipush          32
	//   40   81:invokevirtual   #913 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
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

	static final boolean $assertionsDisabled = false;
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
	//    0    0:new             #97  <Class AccelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void AccelerateInterpolator()>
	//    3    7:putstatic       #102 <Field Interpolator sHideInterpolator>
	//    4   10:new             #104 <Class DecelerateInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #105 <Method void DecelerateInterpolator()>
	//    7   17:putstatic       #107 <Field Interpolator sShowInterpolator>
	//*   8   20:return          
	}
}
