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
		//*  14   30:ifne            54
			{
				WindowDecorActionBar windowdecoractionbar = WindowDecorActionBar.this;
		//   15   33:aload_0         
		//   16   34:getfield        #28  <Field WindowDecorActionBar this$0>
		//   17   37:astore_1        
				windowdecoractionbar.mDeferredDestroyActionMode = ((ActionMode) (this));
		//   18   38:aload_1         
		//   19   39:aload_0         
		//   20   40:putfield        #85  <Field ActionMode WindowDecorActionBar.mDeferredDestroyActionMode>
				windowdecoractionbar.mDeferredModeDestroyCallback = mCallback;
		//   21   43:aload_1         
		//   22   44:aload_0         
		//   23   45:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//   24   48:putfield        #88  <Field android.support.v7.view.ActionMode$Callback WindowDecorActionBar.mDeferredModeDestroyCallback>
			} else
		//*  25   51:goto            64
			{
				mCallback.onDestroyActionMode(((ActionMode) (this)));
		//   26   54:aload_0         
		//   27   55:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//   28   58:aload_0         
		//   29   59:invokeinterface #92  <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
			}
			mCallback = null;
		//   30   64:aload_0         
		//   31   65:aconst_null     
		//   32   66:putfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
			animateToMode(false);
		//   33   69:aload_0         
		//   34   70:getfield        #28  <Field WindowDecorActionBar this$0>
		//   35   73:iconst_0        
		//   36   74:invokevirtual   #96  <Method void WindowDecorActionBar.animateToMode(boolean)>
			mContextView.closeMode();
		//   37   77:aload_0         
		//   38   78:getfield        #28  <Field WindowDecorActionBar this$0>
		//   39   81:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//   40   84:invokevirtual   #105 <Method void ActionBarContextView.closeMode()>
			mDecorToolbar.getViewGroup().sendAccessibilityEvent(32);
		//   41   87:aload_0         
		//   42   88:getfield        #28  <Field WindowDecorActionBar this$0>
		//   43   91:getfield        #109 <Field DecorToolbar WindowDecorActionBar.mDecorToolbar>
		//   44   94:invokeinterface #115 <Method ViewGroup DecorToolbar.getViewGroup()>
		//   45   99:bipush          32
		//   46  101:invokevirtual   #121 <Method void ViewGroup.sendAccessibilityEvent(int)>
			mOverlayLayout.setHideOnContentScrollEnabled(mHideOnContentScroll);
		//   47  104:aload_0         
		//   48  105:getfield        #28  <Field WindowDecorActionBar this$0>
		//   49  108:getfield        #125 <Field ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
		//   50  111:aload_0         
		//   51  112:getfield        #28  <Field WindowDecorActionBar this$0>
		//   52  115:getfield        #128 <Field boolean WindowDecorActionBar.mHideOnContentScroll>
		//   53  118:invokevirtual   #133 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
			mActionMode = null;
		//   54  121:aload_0         
		//   55  122:getfield        #28  <Field WindowDecorActionBar this$0>
		//   56  125:aconst_null     
		//   57  126:putfield        #70  <Field WindowDecorActionBar$ActionModeImpl WindowDecorActionBar.mActionMode>
		//   58  129:return          
		}

		public View getCustomView()
		{
			WeakReference weakreference = mCustomView;
		//    0    0:aload_0         
		//    1    1:getfield        #137 <Field WeakReference mCustomView>
		//    2    4:astore_1        
			if(weakreference != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          17
				return (View)weakreference.get();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #143 <Method Object WeakReference.get()>
		//    7   13:checkcast       #145 <Class View>
		//    8   16:areturn         
			else
				return null;
		//    9   17:aconst_null     
		//   10   18:areturn         
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
			menubuilder = ((MenuBuilder) (mCallback));
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//    2    4:astore_1        
			if(menubuilder != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          18
				return ((android.support.v7.view.ActionMode.Callback) (menubuilder)).onActionItemClicked(((ActionMode) (this)), menuitem);
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:invokeinterface #176 <Method boolean android.support.v7.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
		//    9   17:ireturn         
			else
				return false;
		//   10   18:iconst_0        
		//   11   19:ireturn         
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
				view = ((View) (WindowDecorActionBar.this));
			//   28   65:aload_0         
			//   29   66:getfield        #12  <Field WindowDecorActionBar this$0>
			//   30   69:astore_1        
				view.mCurrentShowAnim = null;
			//   31   70:aload_1         
			//   32   71:aconst_null     
			//   33   72:putfield        #51  <Field ViewPropertyAnimatorCompatSet WindowDecorActionBar.mCurrentShowAnim>
				((WindowDecorActionBar) (view)).completeDeferredDestroyActionMode();
			//   34   75:aload_1         
			//   35   76:invokevirtual   #54  <Method void WindowDecorActionBar.completeDeferredDestroyActionMode()>
				if(mOverlayLayout != null)
			//*  36   79:aload_0         
			//*  37   80:getfield        #12  <Field WindowDecorActionBar this$0>
			//*  38   83:getfield        #58  <Field ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
			//*  39   86:ifnull          99
					ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
			//   40   89:aload_0         
			//   41   90:getfield        #12  <Field WindowDecorActionBar this$0>
			//   42   93:getfield        #58  <Field ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
			//   43   96:invokestatic    #63  <Method void ViewCompat.requestApplyInsets(View)>
			//   44   99:return          
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
				view = ((View) (WindowDecorActionBar.this));
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field WindowDecorActionBar this$0>
			//    2    4:astore_1        
				view.mCurrentShowAnim = null;
			//    3    5:aload_1         
			//    4    6:aconst_null     
			//    5    7:putfield        #22  <Field ViewPropertyAnimatorCompatSet WindowDecorActionBar.mCurrentShowAnim>
				((WindowDecorActionBar) (view)).mContainerView.requestLayout();
			//    6   10:aload_1         
			//    7   11:getfield        #26  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
			//    8   14:invokevirtual   #31  <Method void ActionBarContainer.requestLayout()>
			//    9   17:return          
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
		ScrollingTabContainerView scrollingtabcontainerview = mTabScrollView;
	//    9   19:aload_0         
	//   10   20:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   11   23:astore_1        
		if(scrollingtabcontainerview != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          32
			scrollingtabcontainerview.removeAllTabs();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #189 <Method void ScrollingTabContainerView.removeAllTabs()>
		mSavedTabPosition = -1;
	//   16   32:aload_0         
	//   17   33:iconst_m1       
	//   18   34:putfield        #117 <Field int mSavedTabPosition>
	//   19   37:return          
	}

	private void configureTab(ActionBar.Tab tab, int i)
	{
		tab = ((ActionBar.Tab) ((TabImpl)tab));
	//    0    0:aload_1         
	//    1    1:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//    2    4:astore_1        
		if(((TabImpl) (tab)).getCallback() != null)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #195 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//*   5    9:ifnull          62
		{
			((TabImpl) (tab)).setPosition(i);
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:invokevirtual   #199 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
			mTabs.add(i, ((Object) (tab)));
	//    9   17:aload_0         
	//   10   18:getfield        #115 <Field ArrayList mTabs>
	//   11   21:iload_2         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #203 <Method void ArrayList.add(int, Object)>
			int j = mTabs.size();
	//   14   26:aload_0         
	//   15   27:getfield        #115 <Field ArrayList mTabs>
	//   16   30:invokevirtual   #207 <Method int ArrayList.size()>
	//   17   33:istore_3        
			do
			{
				i++;
	//   18   34:iload_2         
	//   19   35:iconst_1        
	//   20   36:iadd            
	//   21   37:istore_2        
				if(i < j)
	//*  22   38:iload_2         
	//*  23   39:iload_3         
	//*  24   40:icmpge          61
					((TabImpl)mTabs.get(i)).setPosition(i);
	//   25   43:aload_0         
	//   26   44:getfield        #115 <Field ArrayList mTabs>
	//   27   47:iload_2         
	//   28   48:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   29   51:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   30   54:iload_2         
	//   31   55:invokevirtual   #199 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
				else
	//*  32   58:goto            34
					return;
	//   33   61:return          
			} while(true);
		} else
		{
			throw new IllegalStateException("Action Bar Tab must have a Callback");
	//   34   62:new             #213 <Class IllegalStateException>
	//   35   65:dup             
	//   36   66:ldc1            #215 <String "Action Bar Tab must have a Callback">
	//   37   68:invokespecial   #218 <Method void IllegalStateException(String)>
	//   38   71:athrow          
		}
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
	//*  20   42:goto            88
		{
			if(getNavigationMode() == 2)
	//*  21   45:aload_0         
	//*  22   46:invokevirtual   #240 <Method int getNavigationMode()>
	//*  23   49:iconst_2        
	//*  24   50:icmpne          74
			{
				scrollingtabcontainerview.setVisibility(0);
	//   25   53:aload_1         
	//   26   54:iconst_0        
	//   27   55:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
				ActionBarOverlayLayout actionbaroverlaylayout = mOverlayLayout;
	//   28   58:aload_0         
	//   29   59:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   30   62:astore_2        
				if(actionbaroverlaylayout != null)
	//*  31   63:aload_2         
	//*  32   64:ifnull          80
					ViewCompat.requestApplyInsets(((View) (actionbaroverlaylayout)));
	//   33   67:aload_2         
	//   34   68:invokestatic    #247 <Method void ViewCompat.requestApplyInsets(View)>
			} else
	//*  35   71:goto            80
			{
				scrollingtabcontainerview.setVisibility(8);
	//   36   74:aload_1         
	//   37   75:bipush          8
	//   38   77:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
			}
			mContainerView.setTabContainer(scrollingtabcontainerview);
	//   39   80:aload_0         
	//   40   81:getfield        #249 <Field ActionBarContainer mContainerView>
	//   41   84:aload_1         
	//   42   85:invokevirtual   #254 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
		}
		mTabScrollView = scrollingtabcontainerview;
	//   43   88:aload_0         
	//   44   89:aload_1         
	//   45   90:putfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   46   93:return          
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
		if(view != null)
	//*  21   43:aload_1         
	//*  22   44:ifnull          58
			view = ((View) (((Object) (view)).getClass().getSimpleName()));
	//   23   47:aload_1         
	//   24   48:invokevirtual   #277 <Method Class Object.getClass()>
	//   25   51:invokevirtual   #283 <Method String Class.getSimpleName()>
	//   26   54:astore_1        
		else
	//*  27   55:goto            62
			view = "null";
	//   28   58:ldc2            #285 <String "null">
	//   29   61:astore_1        
		stringbuilder.append(((String) (view)));
	//   30   62:aload_2         
	//   31   63:aload_1         
	//   32   64:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   34   68:new             #213 <Class IllegalStateException>
	//   35   71:dup             
	//   36   72:aload_2         
	//   37   73:invokevirtual   #288 <Method String StringBuilder.toString()>
	//   38   76:invokespecial   #218 <Method void IllegalStateException(String)>
	//   39   79:athrow          
	}

	private void hideForActionMode()
	{
		if(mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #291 <Field boolean mShowingForMode>
	//*   2    4:ifeq            31
		{
			mShowingForMode = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #291 <Field boolean mShowingForMode>
			ActionBarOverlayLayout actionbaroverlaylayout = mOverlayLayout;
	//    6   12:aload_0         
	//    7   13:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//    8   16:astore_1        
			if(actionbaroverlaylayout != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          26
				actionbaroverlaylayout.setShowingForActionMode(false);
	//   11   21:aload_1         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #297 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:invokespecial   #300 <Method void updateVisibility(boolean)>
		}
	//   17   31:return          
	}

	private void init(View view)
	{
		mOverlayLayout = (ActionBarOverlayLayout)view.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #305 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//    3    5:invokevirtual   #161 <Method View View.findViewById(int)>
	//    4    8:checkcast       #293 <Class ActionBarOverlayLayout>
	//    5   11:putfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
		ActionBarOverlayLayout actionbaroverlaylayout = mOverlayLayout;
	//    6   14:aload_0         
	//    7   15:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//    8   18:astore          4
		if(actionbaroverlaylayout != null)
	//*   9   20:aload           4
	//*  10   22:ifnull          31
			actionbaroverlaylayout.setActionBarVisibilityCallback(((android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback) (this)));
	//   11   25:aload           4
	//   12   27:aload_0         
	//   13   28:invokevirtual   #309 <Method void ActionBarOverlayLayout.setActionBarVisibilityCallback(android.support.v7.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback)>
		mDecorToolbar = getDecorToolbar(view.findViewById(android.support.v7.appcompat.R.id.action_bar));
	//   14   31:aload_0         
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:getstatic       #312 <Field int android.support.v7.appcompat.R$id.action_bar>
	//   18   37:invokevirtual   #161 <Method View View.findViewById(int)>
	//   19   40:invokespecial   #314 <Method DecorToolbar getDecorToolbar(View)>
	//   20   43:putfield        #231 <Field DecorToolbar mDecorToolbar>
		mContextView = (ActionBarContextView)view.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
	//   21   46:aload_0         
	//   22   47:aload_1         
	//   23   48:getstatic       #317 <Field int android.support.v7.appcompat.R$id.action_context_bar>
	//   24   51:invokevirtual   #161 <Method View View.findViewById(int)>
	//   25   54:checkcast       #319 <Class ActionBarContextView>
	//   26   57:putfield        #321 <Field ActionBarContextView mContextView>
		mContainerView = (ActionBarContainer)view.findViewById(android.support.v7.appcompat.R.id.action_bar_container);
	//   27   60:aload_0         
	//   28   61:aload_1         
	//   29   62:getstatic       #324 <Field int android.support.v7.appcompat.R$id.action_bar_container>
	//   30   65:invokevirtual   #161 <Method View View.findViewById(int)>
	//   31   68:checkcast       #251 <Class ActionBarContainer>
	//   32   71:putfield        #249 <Field ActionBarContainer mContainerView>
		view = ((View) (mDecorToolbar));
	//   33   74:aload_0         
	//   34   75:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   35   78:astore_1        
		if(view != null && mContextView != null && mContainerView != null)
	//*  36   79:aload_1         
	//*  37   80:ifnull          235
	//*  38   83:aload_0         
	//*  39   84:getfield        #321 <Field ActionBarContextView mContextView>
	//*  40   87:ifnull          235
	//*  41   90:aload_0         
	//*  42   91:getfield        #249 <Field ActionBarContainer mContainerView>
	//*  43   94:ifnull          235
		{
			mContext = ((DecorToolbar) (view)).getContext();
	//   44   97:aload_0         
	//   45   98:aload_1         
	//   46   99:invokeinterface #328 <Method Context DecorToolbar.getContext()>
	//   47  104:putfield        #221 <Field Context mContext>
			boolean flag;
			if((mDecorToolbar.getDisplayOptions() & 4) != 0)
	//*  48  107:aload_0         
	//*  49  108:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*  50  111:invokeinterface #331 <Method int DecorToolbar.getDisplayOptions()>
	//*  51  116:iconst_4        
	//*  52  117:iand            
	//*  53  118:ifeq            126
				flag = true;
	//   54  121:iconst_1        
	//   55  122:istore_2        
			else
	//*  56  123:goto            128
				flag = false;
	//   57  126:iconst_0        
	//   58  127:istore_2        
			if(flag)
	//*  59  128:iload_2         
	//*  60  129:ifeq            137
				mDisplayHomeAsUpSet = true;
	//   61  132:aload_0         
	//   62  133:iconst_1        
	//   63  134:putfield        #333 <Field boolean mDisplayHomeAsUpSet>
			view = ((View) (ActionBarPolicy.get(mContext)));
	//   64  137:aload_0         
	//   65  138:getfield        #221 <Field Context mContext>
	//   66  141:invokestatic    #338 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//   67  144:astore_1        
			boolean flag1;
			if(!((ActionBarPolicy) (view)).enableHomeButtonByDefault() && !flag)
	//*  68  145:aload_1         
	//*  69  146:invokevirtual   #342 <Method boolean ActionBarPolicy.enableHomeButtonByDefault()>
	//*  70  149:ifne            164
	//*  71  152:iload_2         
	//*  72  153:ifeq            159
	//*  73  156:goto            164
				flag1 = false;
	//   74  159:iconst_0        
	//   75  160:istore_3        
			else
	//*  76  161:goto            166
				flag1 = true;
	//   77  164:iconst_1        
	//   78  165:istore_3        
			setHomeButtonEnabled(flag1);
	//   79  166:aload_0         
	//   80  167:iload_3         
	//   81  168:invokevirtual   #345 <Method void setHomeButtonEnabled(boolean)>
			setHasEmbeddedTabs(((ActionBarPolicy) (view)).hasEmbeddedTabs());
	//   82  171:aload_0         
	//   83  172:aload_1         
	//   84  173:invokevirtual   #348 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//   85  176:invokespecial   #351 <Method void setHasEmbeddedTabs(boolean)>
			view = ((View) (mContext.obtainStyledAttributes(((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0)));
	//   86  179:aload_0         
	//   87  180:getfield        #221 <Field Context mContext>
	//   88  183:aconst_null     
	//   89  184:getstatic       #357 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//   90  187:getstatic       #362 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//   91  190:iconst_0        
	//   92  191:invokevirtual   #368 <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   93  194:astore_1        
			if(((TypedArray) (view)).getBoolean(android.support.v7.appcompat.R.styleable.ActionBar_hideOnContentScroll, false))
	//*  94  195:aload_1         
	//*  95  196:getstatic       #371 <Field int android.support.v7.appcompat.R$styleable.ActionBar_hideOnContentScroll>
	//*  96  199:iconst_0        
	//*  97  200:invokevirtual   #377 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  98  203:ifeq            211
				setHideOnContentScrollEnabled(true);
	//   99  206:aload_0         
	//  100  207:iconst_1        
	//  101  208:invokevirtual   #380 <Method void setHideOnContentScrollEnabled(boolean)>
			int i = ((TypedArray) (view)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_elevation, 0);
	//  102  211:aload_1         
	//  103  212:getstatic       #383 <Field int android.support.v7.appcompat.R$styleable.ActionBar_elevation>
	//  104  215:iconst_0        
	//  105  216:invokevirtual   #387 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  106  219:istore_2        
			if(i != 0)
	//* 107  220:iload_2         
	//* 108  221:ifeq            230
				setElevation(i);
	//  109  224:aload_0         
	//  110  225:iload_2         
	//  111  226:i2f             
	//  112  227:invokevirtual   #391 <Method void setElevation(float)>
			((TypedArray) (view)).recycle();
	//  113  230:aload_1         
	//  114  231:invokevirtual   #394 <Method void TypedArray.recycle()>
			return;
	//  115  234:return          
		} else
		{
			view = ((View) (new StringBuilder()));
	//  116  235:new             #264 <Class StringBuilder>
	//  117  238:dup             
	//  118  239:invokespecial   #265 <Method void StringBuilder()>
	//  119  242:astore_1        
			((StringBuilder) (view)).append(((Object)this).getClass().getSimpleName());
	//  120  243:aload_1         
	//  121  244:aload_0         
	//  122  245:invokevirtual   #277 <Method Class Object.getClass()>
	//  123  248:invokevirtual   #283 <Method String Class.getSimpleName()>
	//  124  251:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  125  254:pop             
			((StringBuilder) (view)).append(" can only be used ");
	//  126  255:aload_1         
	//  127  256:ldc2            #396 <String " can only be used ">
	//  128  259:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  129  262:pop             
			((StringBuilder) (view)).append("with a compatible window decor layout");
	//  130  263:aload_1         
	//  131  264:ldc2            #398 <String "with a compatible window decor layout">
	//  132  267:invokevirtual   #271 <Method StringBuilder StringBuilder.append(String)>
	//  133  270:pop             
			throw new IllegalStateException(((StringBuilder) (view)).toString());
	//  134  271:new             #213 <Class IllegalStateException>
	//  135  274:dup             
	//  136  275:aload_1         
	//  137  276:invokevirtual   #288 <Method String StringBuilder.toString()>
	//  138  279:invokespecial   #218 <Method void IllegalStateException(String)>
	//  139  282:athrow          
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
		Object obj = ((Object) (mTabScrollView));
	//   38   76:aload_0         
	//   39   77:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   40   80:astore          4
		if(obj != null)
	//*  41   82:aload           4
	//*  42   84:ifnull          123
			if(flag1)
	//*  43   87:iload_2         
	//*  44   88:ifeq            116
			{
				((ScrollingTabContainerView) (obj)).setVisibility(0);
	//   45   91:aload           4
	//   46   93:iconst_0        
	//   47   94:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
				obj = ((Object) (mOverlayLayout));
	//   48   97:aload_0         
	//   49   98:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   50  101:astore          4
				if(obj != null)
	//*  51  103:aload           4
	//*  52  105:ifnull          123
					ViewCompat.requestApplyInsets(((View) (obj)));
	//   53  108:aload           4
	//   54  110:invokestatic    #247 <Method void ViewCompat.requestApplyInsets(View)>
			} else
	//*  55  113:goto            123
			{
				((ScrollingTabContainerView) (obj)).setVisibility(8);
	//   56  116:aload           4
	//   57  118:bipush          8
	//   58  120:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
			}
		obj = ((Object) (mDecorToolbar));
	//   59  123:aload_0         
	//   60  124:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   61  127:astore          4
		if(!mHasEmbeddedTabs && flag1)
	//*  62  129:aload_0         
	//*  63  130:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  64  133:ifne            145
	//*  65  136:iload_2         
	//*  66  137:ifeq            145
			flag = true;
	//   67  140:iconst_1        
	//   68  141:istore_1        
		else
	//*  69  142:goto            147
			flag = false;
	//   70  145:iconst_0        
	//   71  146:istore_1        
		((DecorToolbar) (obj)).setCollapsible(flag);
	//   72  147:aload           4
	//   73  149:iload_1         
	//   74  150:invokeinterface #401 <Method void DecorToolbar.setCollapsible(boolean)>
		obj = ((Object) (mOverlayLayout));
	//   75  155:aload_0         
	//   76  156:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   77  159:astore          4
		if(!mHasEmbeddedTabs && flag1)
	//*  78  161:aload_0         
	//*  79  162:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  80  165:ifne            177
	//*  81  168:iload_2         
	//*  82  169:ifeq            177
			flag = flag2;
	//   83  172:iload_3         
	//   84  173:istore_1        
		else
	//*  85  174:goto            179
			flag = false;
	//   86  177:iconst_0        
	//   87  178:istore_1        
		((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
	//   88  179:aload           4
	//   89  181:iload_1         
	//   90  182:invokevirtual   #404 <Method void ActionBarOverlayLayout.setHasNonEmbeddedTabs(boolean)>
	//   91  185:return          
	}

	private boolean shouldAnimateContextView()
	{
		return ViewCompat.isLaidOut(((View) (mContainerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:invokestatic    #409 <Method boolean ViewCompat.isLaidOut(View)>
	//    3    7:ireturn         
	}

	private void showForActionMode()
	{
		if(!mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #291 <Field boolean mShowingForMode>
	//*   2    4:ifne            31
		{
			mShowingForMode = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #291 <Field boolean mShowingForMode>
			ActionBarOverlayLayout actionbaroverlaylayout = mOverlayLayout;
	//    6   12:aload_0         
	//    7   13:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//    8   16:astore_1        
			if(actionbaroverlaylayout != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          26
				actionbaroverlaylayout.setShowingForActionMode(true);
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #297 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:invokespecial   #300 <Method void updateVisibility(boolean)>
		}
	//   17   31:return          
	}

	private void updateVisibility(boolean flag)
	{
		if(checkShowingFlags(mHiddenByApp, mHiddenBySystem, mShowingForMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #412 <Field boolean mHiddenByApp>
	//*   2    4:aload_0         
	//*   3    5:getfield        #414 <Field boolean mHiddenBySystem>
	//*   4    8:aload_0         
	//*   5    9:getfield        #291 <Field boolean mShowingForMode>
	//*   6   12:invokestatic    #416 <Method boolean checkShowingFlags(boolean, boolean, boolean)>
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
	//   16   32:invokevirtual   #419 <Method void doShow(boolean)>
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
	//   26   50:invokevirtual   #422 <Method void doHide(boolean)>
		}
	//   27   53:return          
	}

	public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.add(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #427 <Method boolean ArrayList.add(Object)>
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
	//    4    6:invokevirtual   #431 <Method boolean ArrayList.isEmpty()>
	//    5    9:invokevirtual   #434 <Method void addTab(ActionBar$Tab, boolean)>
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
	//    5    7:invokevirtual   #431 <Method boolean ArrayList.isEmpty()>
	//    6   10:invokevirtual   #437 <Method void addTab(ActionBar$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addTab(ActionBar.Tab tab, int i, boolean flag)
	{
		ensureTabsExist();
	//    0    0:aload_0         
	//    1    1:invokespecial   #439 <Method void ensureTabsExist()>
		mTabScrollView.addTab(tab, i, flag);
	//    2    4:aload_0         
	//    3    5:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #440 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, int, boolean)>
		configureTab(tab, i);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #442 <Method void configureTab(ActionBar$Tab, int)>
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
	//    1    1:invokespecial   #439 <Method void ensureTabsExist()>
		mTabScrollView.addTab(tab, flag);
	//    2    4:aload_0         
	//    3    5:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #443 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, boolean)>
		configureTab(tab, mTabs.size());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #115 <Field ArrayList mTabs>
	//   11   19:invokevirtual   #207 <Method int ArrayList.size()>
	//   12   22:invokespecial   #442 <Method void configureTab(ActionBar$Tab, int)>
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
	//    3    5:invokespecial   #446 <Method void showForActionMode()>
		else
	//*   4    8:goto            15
			hideForActionMode();
	//    5   11:aload_0         
	//    6   12:invokespecial   #448 <Method void hideForActionMode()>
		if(shouldAnimateContextView())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #450 <Method boolean shouldAnimateContextView()>
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
	//   16   34:invokeinterface #454 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//   17   39:astore_3        
				viewpropertyanimatorcompat = mContextView.setupAnimatorToVisibility(0, 200L);
	//   18   40:aload_0         
	//   19   41:getfield        #321 <Field ActionBarContextView mContextView>
	//   20   44:iconst_0        
	//   21   45:ldc2w           #28  <Long 200L>
	//   22   48:invokevirtual   #455 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//   23   51:astore_2        
			} else
	//*  24   52:goto            82
			{
				viewpropertyanimatorcompat = mDecorToolbar.setupAnimatorToVisibility(0, 200L);
	//   25   55:aload_0         
	//   26   56:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   27   59:iconst_0        
	//   28   60:ldc2w           #28  <Long 200L>
	//   29   63:invokeinterface #454 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//   30   68:astore_2        
				viewpropertyanimatorcompat1 = mContextView.setupAnimatorToVisibility(8, 100L);
	//   31   69:aload_0         
	//   32   70:getfield        #321 <Field ActionBarContextView mContextView>
	//   33   73:bipush          8
	//   34   75:ldc2w           #31  <Long 100L>
	//   35   78:invokevirtual   #455 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//   36   81:astore_3        
			}
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   37   82:new             #457 <Class ViewPropertyAnimatorCompatSet>
	//   38   85:dup             
	//   39   86:invokespecial   #458 <Method void ViewPropertyAnimatorCompatSet()>
	//   40   89:astore          4
			viewpropertyanimatorcompatset.playSequentially(viewpropertyanimatorcompat1, viewpropertyanimatorcompat);
	//   41   91:aload           4
	//   42   93:aload_3         
	//   43   94:aload_2         
	//   44   95:invokevirtual   #462 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.playSequentially(ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompat)>
	//   45   98:pop             
			viewpropertyanimatorcompatset.start();
	//   46   99:aload           4
	//   47  101:invokevirtual   #465 <Method void ViewPropertyAnimatorCompatSet.start()>
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
	//   54  114:invokeinterface #466 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(0);
	//   55  119:aload_0         
	//   56  120:getfield        #321 <Field ActionBarContextView mContextView>
	//   57  123:iconst_0        
	//   58  124:invokevirtual   #467 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   59  127:return          
		} else
		{
			mDecorToolbar.setVisibility(0);
	//   60  128:aload_0         
	//   61  129:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   62  132:iconst_0        
	//   63  133:invokeinterface #466 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(8);
	//   64  138:aload_0         
	//   65  139:getfield        #321 <Field ActionBarContextView mContextView>
	//   66  142:bipush          8
	//   67  144:invokevirtual   #467 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   68  147:return          
		}
	}

	public boolean collapseActionView()
	{
		DecorToolbar decortoolbar = mDecorToolbar;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:astore_1        
		if(decortoolbar != null && decortoolbar.hasExpandedActionView())
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #471 <Method boolean DecorToolbar.hasExpandedActionView()>
	//*   7   15:ifeq            29
		{
			mDecorToolbar.collapseActionView();
	//    8   18:aload_0         
	//    9   19:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   10   22:invokeinterface #473 <Method void DecorToolbar.collapseActionView()>
			return true;
	//   11   27:iconst_1        
	//   12   28:ireturn         
		} else
		{
			return false;
	//   13   29:iconst_0        
	//   14   30:ireturn         
		}
	}

	void completeDeferredDestroyActionMode()
	{
		android.support.v7.view.ActionMode.Callback callback = mDeferredModeDestroyCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #476 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
	//    2    4:astore_1        
		if(callback != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
		{
			callback.onDestroyActionMode(mDeferredDestroyActionMode);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #478 <Field ActionMode mDeferredDestroyActionMode>
	//    8   14:invokeinterface #484 <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
			mDeferredDestroyActionMode = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #478 <Field ActionMode mDeferredDestroyActionMode>
			mDeferredModeDestroyCallback = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #476 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
		}
	//   15   29:return          
	}

	public void dispatchMenuVisibilityChanged(boolean flag)
	{
		if(flag == mLastMenuVisibility)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #487 <Field boolean mLastMenuVisibility>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mLastMenuVisibility = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #487 <Field boolean mLastMenuVisibility>
		int j = mMenuVisibilityListeners.size();
	//    8   14:aload_0         
	//    9   15:getfield        #119 <Field ArrayList mMenuVisibilityListeners>
	//   10   18:invokevirtual   #207 <Method int ArrayList.size()>
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
	//   20   34:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   21   37:checkcast       #489 <Class ActionBar$OnMenuVisibilityListener>
	//   22   40:iload_1         
	//   23   41:invokeinterface #492 <Method void ActionBar$OnMenuVisibilityListener.onMenuVisibilityChanged(boolean)>

	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
	//*  28   50:goto            24
	//   29   53:return          
	}

	public void doHide(boolean flag)
	{
		ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = mCurrentShowAnim;
	//    0    0:aload_0         
	//    1    1:getfield        #494 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    2    4:astore          4
		if(viewpropertyanimatorcompatset != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          16
			viewpropertyanimatorcompatset.cancel();
	//    5   11:aload           4
	//    6   13:invokevirtual   #497 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		if(mCurWindowVisibility == 0 && (mShowHideAnimationEnabled || flag))
	//*   7   16:aload_0         
	//*   8   17:getfield        #121 <Field int mCurWindowVisibility>
	//*   9   20:ifne            212
	//*  10   23:aload_0         
	//*  11   24:getfield        #499 <Field boolean mShowHideAnimationEnabled>
	//*  12   27:ifne            34
	//*  13   30:iload_1         
	//*  14   31:ifeq            212
		{
			mContainerView.setAlpha(1.0F);
	//   15   34:aload_0         
	//   16   35:getfield        #249 <Field ActionBarContainer mContainerView>
	//   17   38:fconst_1        
	//   18   39:invokevirtual   #502 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTransitioning(true);
	//   19   42:aload_0         
	//   20   43:getfield        #249 <Field ActionBarContainer mContainerView>
	//   21   46:iconst_1        
	//   22   47:invokevirtual   #505 <Method void ActionBarContainer.setTransitioning(boolean)>
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset1 = new ViewPropertyAnimatorCompatSet();
	//   23   50:new             #457 <Class ViewPropertyAnimatorCompatSet>
	//   24   53:dup             
	//   25   54:invokespecial   #458 <Method void ViewPropertyAnimatorCompatSet()>
	//   26   57:astore          4
			float f1 = -mContainerView.getHeight();
	//   27   59:aload_0         
	//   28   60:getfield        #249 <Field ActionBarContainer mContainerView>
	//   29   63:invokevirtual   #508 <Method int ActionBarContainer.getHeight()>
	//   30   66:ineg            
	//   31   67:i2f             
	//   32   68:fstore_3        
			float f = f1;
	//   33   69:fload_3         
	//   34   70:fstore_2        
			if(flag)
	//*  35   71:iload_1         
	//*  36   72:ifeq            108
			{
				int ai[] = new int[2];
	//   37   75:iconst_2        
	//   38   76:newarray        int[]
	//   39   78:astore          5
				int[] _tmp = ai;
	//   40   80:aload           5
	//   41   82:dup             
	//   42   83:iconst_0        
	//   43   84:iconst_0        
	//   44   85:iastore         
	//   45   86:dup             
	//   46   87:iconst_1        
	//   47   88:iconst_0        
	//   48   89:iastore         
	//   49   90:pop             
				ai[0] = 0;
				ai[1] = 0;
				mContainerView.getLocationInWindow(ai);
	//   50   91:aload_0         
	//   51   92:getfield        #249 <Field ActionBarContainer mContainerView>
	//   52   95:aload           5
	//   53   97:invokevirtual   #512 <Method void ActionBarContainer.getLocationInWindow(int[])>
				f = f1 - (float)ai[1];
	//   54  100:fload_3         
	//   55  101:aload           5
	//   56  103:iconst_1        
	//   57  104:iaload          
	//   58  105:i2f             
	//   59  106:fsub            
	//   60  107:fstore_2        
			}
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mContainerView))).translationY(f);
	//   61  108:aload_0         
	//   62  109:getfield        #249 <Field ActionBarContainer mContainerView>
	//   63  112:invokestatic    #516 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   64  115:fload_2         
	//   65  116:invokevirtual   #522 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   66  119:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   67  121:aload           5
	//   68  123:aload_0         
	//   69  124:getfield        #136 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   70  127:invokevirtual   #526 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   71  130:pop             
			viewpropertyanimatorcompatset1.play(viewpropertyanimatorcompat);
	//   72  131:aload           4
	//   73  133:aload           5
	//   74  135:invokevirtual   #530 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   75  138:pop             
			if(mContentAnimations)
	//*  76  139:aload_0         
	//*  77  140:getfield        #123 <Field boolean mContentAnimations>
	//*  78  143:ifeq            172
			{
				View view = mContentView;
	//   79  146:aload_0         
	//   80  147:getfield        #163 <Field View mContentView>
	//   81  150:astore          5
				if(view != null)
	//*  82  152:aload           5
	//*  83  154:ifnull          172
					viewpropertyanimatorcompatset1.play(ViewCompat.animate(view).translationY(f));
	//   84  157:aload           4
	//   85  159:aload           5
	//   86  161:invokestatic    #516 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   87  164:fload_2         
	//   88  165:invokevirtual   #522 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   89  168:invokevirtual   #530 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   90  171:pop             
			}
			viewpropertyanimatorcompatset1.setInterpolator(sHideInterpolator);
	//   91  172:aload           4
	//   92  174:getstatic       #102 <Field Interpolator sHideInterpolator>
	//   93  177:invokevirtual   #534 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//   94  180:pop             
			viewpropertyanimatorcompatset1.setDuration(250L);
	//   95  181:aload           4
	//   96  183:ldc2w           #535 <Long 250L>
	//   97  186:invokevirtual   #540 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//   98  189:pop             
			viewpropertyanimatorcompatset1.setListener(mHideListener);
	//   99  190:aload           4
	//  100  192:aload_0         
	//  101  193:getfield        #130 <Field ViewPropertyAnimatorListener mHideListener>
	//  102  196:invokevirtual   #544 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  103  199:pop             
			mCurrentShowAnim = viewpropertyanimatorcompatset1;
	//  104  200:aload_0         
	//  105  201:aload           4
	//  106  203:putfield        #494 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			viewpropertyanimatorcompatset1.start();
	//  107  206:aload           4
	//  108  208:invokevirtual   #465 <Method void ViewPropertyAnimatorCompatSet.start()>
			return;
	//  109  211:return          
		} else
		{
			mHideListener.onAnimationEnd(((View) (null)));
	//  110  212:aload_0         
	//  111  213:getfield        #130 <Field ViewPropertyAnimatorListener mHideListener>
	//  112  216:aconst_null     
	//  113  217:invokeinterface #549 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
			return;
	//  114  222:return          
		}
	}

	public void doShow(boolean flag)
	{
		Object obj = ((Object) (mCurrentShowAnim));
	//    0    0:aload_0         
	//    1    1:getfield        #494 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          16
			((ViewPropertyAnimatorCompatSet) (obj)).cancel();
	//    5   11:aload           4
	//    6   13:invokevirtual   #497 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		mContainerView.setVisibility(0);
	//    7   16:aload_0         
	//    8   17:getfield        #249 <Field ActionBarContainer mContainerView>
	//    9   20:iconst_0        
	//   10   21:invokevirtual   #550 <Method void ActionBarContainer.setVisibility(int)>
		if(mCurWindowVisibility == 0 && (mShowHideAnimationEnabled || flag))
	//*  11   24:aload_0         
	//*  12   25:getfield        #121 <Field int mCurWindowVisibility>
	//*  13   28:ifne            230
	//*  14   31:aload_0         
	//*  15   32:getfield        #499 <Field boolean mShowHideAnimationEnabled>
	//*  16   35:ifne            42
	//*  17   38:iload_1         
	//*  18   39:ifeq            230
		{
			mContainerView.setTranslationY(0.0F);
	//   19   42:aload_0         
	//   20   43:getfield        #249 <Field ActionBarContainer mContainerView>
	//   21   46:fconst_0        
	//   22   47:invokevirtual   #553 <Method void ActionBarContainer.setTranslationY(float)>
			float f1 = -mContainerView.getHeight();
	//   23   50:aload_0         
	//   24   51:getfield        #249 <Field ActionBarContainer mContainerView>
	//   25   54:invokevirtual   #508 <Method int ActionBarContainer.getHeight()>
	//   26   57:ineg            
	//   27   58:i2f             
	//   28   59:fstore_3        
			float f = f1;
	//   29   60:fload_3         
	//   30   61:fstore_2        
			if(flag)
	//*  31   62:iload_1         
	//*  32   63:ifeq            99
			{
				int ai[] = new int[2];
	//   33   66:iconst_2        
	//   34   67:newarray        int[]
	//   35   69:astore          4
				int[] _tmp = ai;
	//   36   71:aload           4
	//   37   73:dup             
	//   38   74:iconst_0        
	//   39   75:iconst_0        
	//   40   76:iastore         
	//   41   77:dup             
	//   42   78:iconst_1        
	//   43   79:iconst_0        
	//   44   80:iastore         
	//   45   81:pop             
				ai[0] = 0;
				ai[1] = 0;
				mContainerView.getLocationInWindow(ai);
	//   46   82:aload_0         
	//   47   83:getfield        #249 <Field ActionBarContainer mContainerView>
	//   48   86:aload           4
	//   49   88:invokevirtual   #512 <Method void ActionBarContainer.getLocationInWindow(int[])>
				f = f1 - (float)ai[1];
	//   50   91:fload_3         
	//   51   92:aload           4
	//   52   94:iconst_1        
	//   53   95:iaload          
	//   54   96:i2f             
	//   55   97:fsub            
	//   56   98:fstore_2        
			}
			mContainerView.setTranslationY(f);
	//   57   99:aload_0         
	//   58  100:getfield        #249 <Field ActionBarContainer mContainerView>
	//   59  103:fload_2         
	//   60  104:invokevirtual   #553 <Method void ActionBarContainer.setTranslationY(float)>
			ai = ((int []) (new ViewPropertyAnimatorCompatSet()));
	//   61  107:new             #457 <Class ViewPropertyAnimatorCompatSet>
	//   62  110:dup             
	//   63  111:invokespecial   #458 <Method void ViewPropertyAnimatorCompatSet()>
	//   64  114:astore          4
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mContainerView))).translationY(0.0F);
	//   65  116:aload_0         
	//   66  117:getfield        #249 <Field ActionBarContainer mContainerView>
	//   67  120:invokestatic    #516 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   68  123:fconst_0        
	//   69  124:invokevirtual   #522 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   70  127:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   71  129:aload           5
	//   72  131:aload_0         
	//   73  132:getfield        #136 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   74  135:invokevirtual   #526 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   75  138:pop             
			((ViewPropertyAnimatorCompatSet) (ai)).play(viewpropertyanimatorcompat);
	//   76  139:aload           4
	//   77  141:aload           5
	//   78  143:invokevirtual   #530 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   79  146:pop             
			if(mContentAnimations)
	//*  80  147:aload_0         
	//*  81  148:getfield        #123 <Field boolean mContentAnimations>
	//*  82  151:ifeq            188
			{
				View view = mContentView;
	//   83  154:aload_0         
	//   84  155:getfield        #163 <Field View mContentView>
	//   85  158:astore          5
				if(view != null)
	//*  86  160:aload           5
	//*  87  162:ifnull          188
				{
					view.setTranslationY(f);
	//   88  165:aload           5
	//   89  167:fload_2         
	//   90  168:invokevirtual   #554 <Method void View.setTranslationY(float)>
					((ViewPropertyAnimatorCompatSet) (ai)).play(ViewCompat.animate(mContentView).translationY(0.0F));
	//   91  171:aload           4
	//   92  173:aload_0         
	//   93  174:getfield        #163 <Field View mContentView>
	//   94  177:invokestatic    #516 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   95  180:fconst_0        
	//   96  181:invokevirtual   #522 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   97  184:invokevirtual   #530 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   98  187:pop             
				}
			}
			((ViewPropertyAnimatorCompatSet) (ai)).setInterpolator(sShowInterpolator);
	//   99  188:aload           4
	//  100  190:getstatic       #107 <Field Interpolator sShowInterpolator>
	//  101  193:invokevirtual   #534 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//  102  196:pop             
			((ViewPropertyAnimatorCompatSet) (ai)).setDuration(250L);
	//  103  197:aload           4
	//  104  199:ldc2w           #535 <Long 250L>
	//  105  202:invokevirtual   #540 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//  106  205:pop             
			((ViewPropertyAnimatorCompatSet) (ai)).setListener(mShowListener);
	//  107  206:aload           4
	//  108  208:aload_0         
	//  109  209:getfield        #133 <Field ViewPropertyAnimatorListener mShowListener>
	//  110  212:invokevirtual   #544 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  111  215:pop             
			mCurrentShowAnim = ((ViewPropertyAnimatorCompatSet) (ai));
	//  112  216:aload_0         
	//  113  217:aload           4
	//  114  219:putfield        #494 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			((ViewPropertyAnimatorCompatSet) (ai)).start();
	//  115  222:aload           4
	//  116  224:invokevirtual   #465 <Method void ViewPropertyAnimatorCompatSet.start()>
		} else
	//* 117  227:goto            280
		{
			mContainerView.setAlpha(1.0F);
	//  118  230:aload_0         
	//  119  231:getfield        #249 <Field ActionBarContainer mContainerView>
	//  120  234:fconst_1        
	//  121  235:invokevirtual   #502 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTranslationY(0.0F);
	//  122  238:aload_0         
	//  123  239:getfield        #249 <Field ActionBarContainer mContainerView>
	//  124  242:fconst_0        
	//  125  243:invokevirtual   #553 <Method void ActionBarContainer.setTranslationY(float)>
			if(mContentAnimations)
	//* 126  246:aload_0         
	//* 127  247:getfield        #123 <Field boolean mContentAnimations>
	//* 128  250:ifeq            270
			{
				ai = ((int []) (mContentView));
	//  129  253:aload_0         
	//  130  254:getfield        #163 <Field View mContentView>
	//  131  257:astore          4
				if(ai != null)
	//* 132  259:aload           4
	//* 133  261:ifnull          270
					((View) (ai)).setTranslationY(0.0F);
	//  134  264:aload           4
	//  135  266:fconst_0        
	//  136  267:invokevirtual   #554 <Method void View.setTranslationY(float)>
			}
			mShowListener.onAnimationEnd(((View) (null)));
	//  137  270:aload_0         
	//  138  271:getfield        #133 <Field ViewPropertyAnimatorListener mShowListener>
	//  139  274:aconst_null     
	//  140  275:invokeinterface #549 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
		}
		ai = ((int []) (mOverlayLayout));
	//  141  280:aload_0         
	//  142  281:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//  143  284:astore          4
		if(ai != null)
	//* 144  286:aload           4
	//* 145  288:ifnull          296
			ViewCompat.requestApplyInsets(((View) (ai)));
	//  146  291:aload           4
	//  147  293:invokestatic    #247 <Method void ViewCompat.requestApplyInsets(View)>
	//  148  296:return          
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
	//    2    4:invokeinterface #558 <Method View DecorToolbar.getCustomView()>
	//    3    9:areturn         
	}

	public int getDisplayOptions()
	{
		return mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #331 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:ireturn         
	}

	public float getElevation()
	{
		return ViewCompat.getElevation(((View) (mContainerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:invokestatic    #563 <Method float ViewCompat.getElevation(View)>
	//    3    7:freturn         
	}

	public int getHeight()
	{
		return mContainerView.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:invokevirtual   #508 <Method int ActionBarContainer.getHeight()>
	//    3    7:ireturn         
	}

	public int getHideOffset()
	{
		return mOverlayLayout.getActionBarHideOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//    2    4:invokevirtual   #567 <Method int ActionBarOverlayLayout.getActionBarHideOffset()>
	//    3    7:ireturn         
	}

	public int getNavigationItemCount()
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #569 <Method int DecorToolbar.getNavigationMode()>
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
	//    8   38:invokevirtual   #207 <Method int ArrayList.size()>
	//    9   41:ireturn         

		case 1: // '\001'
			return mDecorToolbar.getDropdownItemCount();
	//   10   42:aload_0         
	//   11   43:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   12   46:invokeinterface #572 <Method int DecorToolbar.getDropdownItemCount()>
	//   13   51:ireturn         
		}
	}

	public int getNavigationMode()
	{
		return mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #569 <Method int DecorToolbar.getNavigationMode()>
	//    3    9:ireturn         
	}

	public int getSelectedNavigationIndex()
	{
		int j = mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #569 <Method int DecorToolbar.getNavigationMode()>
	//    3    9:istore_2        
		int i = -1;
	//    4   10:iconst_m1       
	//    5   11:istore_1        
		switch(j)
	//*   6   12:iload_2         
		{
	//*   7   13:tableswitch     1 2: default 36
	//	               1 54
	//	               2 38
		default:
			return -1;
	//    8   36:iconst_m1       
	//    9   37:ireturn         

		case 2: // '\002'
			TabImpl tabimpl = mSelectedTab;
	//   10   38:aload_0         
	//   11   39:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   12   42:astore_3        
			if(tabimpl != null)
	//*  13   43:aload_3         
	//*  14   44:ifnull          52
				i = tabimpl.getPosition();
	//   15   47:aload_3         
	//   16   48:invokevirtual   #576 <Method int WindowDecorActionBar$TabImpl.getPosition()>
	//   17   51:istore_1        
			return i;
	//   18   52:iload_1         
	//   19   53:ireturn         

		case 1: // '\001'
			return mDecorToolbar.getDropdownSelectedPosition();
	//   20   54:aload_0         
	//   21   55:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   22   58:invokeinterface #579 <Method int DecorToolbar.getDropdownSelectedPosition()>
	//   23   63:ireturn         
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
	//    2    4:invokeinterface #585 <Method CharSequence DecorToolbar.getSubtitle()>
	//    3    9:areturn         
	}

	public ActionBar.Tab getTabAt(int i)
	{
		return (ActionBar.Tab)mTabs.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ArrayList mTabs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #589 <Class ActionBar$Tab>
	//    5   11:areturn         
	}

	public int getTabCount()
	{
		return mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field ArrayList mTabs>
	//    2    4:invokevirtual   #207 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public Context getThemedContext()
	{
		if(mThemedContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #593 <Field Context mThemedContext>
	//*   2    4:ifnonnull       67
		{
			TypedValue typedvalue = new TypedValue();
	//    3    7:new             #595 <Class TypedValue>
	//    4   10:dup             
	//    5   11:invokespecial   #596 <Method void TypedValue()>
	//    6   14:astore_2        
			mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//    7   15:aload_0         
	//    8   16:getfield        #221 <Field Context mContext>
	//    9   19:invokevirtual   #600 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   22:getstatic       #603 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   11   25:aload_2         
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #609 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   30:pop             
			int i = typedvalue.resourceId;
	//   15   31:aload_2         
	//   16   32:getfield        #612 <Field int TypedValue.resourceId>
	//   17   35:istore_1        
			if(i != 0)
	//*  18   36:iload_1         
	//*  19   37:ifeq            59
				mThemedContext = ((Context) (new ContextThemeWrapper(mContext, i)));
	//   20   40:aload_0         
	//   21   41:new             #614 <Class ContextThemeWrapper>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #221 <Field Context mContext>
	//   25   49:iload_1         
	//   26   50:invokespecial   #617 <Method void ContextThemeWrapper(Context, int)>
	//   27   53:putfield        #593 <Field Context mThemedContext>
			else
	//*  28   56:goto            67
				mThemedContext = mContext;
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #221 <Field Context mContext>
	//   32   64:putfield        #593 <Field Context mThemedContext>
		}
		return mThemedContext;
	//   33   67:aload_0         
	//   34   68:getfield        #593 <Field Context mThemedContext>
	//   35   71:areturn         
	}

	public CharSequence getTitle()
	{
		return mDecorToolbar.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #620 <Method CharSequence DecorToolbar.getTitle()>
	//    3    9:areturn         
	}

	public boolean hasIcon()
	{
		return mDecorToolbar.hasIcon();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #623 <Method boolean DecorToolbar.hasIcon()>
	//    3    9:ireturn         
	}

	public boolean hasLogo()
	{
		return mDecorToolbar.hasLogo();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #626 <Method boolean DecorToolbar.hasLogo()>
	//    3    9:ireturn         
	}

	public void hide()
	{
		if(!mHiddenByApp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #412 <Field boolean mHiddenByApp>
	//*   2    4:ifne            17
		{
			mHiddenByApp = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #412 <Field boolean mHiddenByApp>
			updateVisibility(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokespecial   #300 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public void hideForSystem()
	{
		if(!mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #414 <Field boolean mHiddenBySystem>
	//*   2    4:ifne            17
		{
			mHiddenBySystem = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #414 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #300 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public boolean isHideOnContentScrollEnabled()
	{
		return mOverlayLayout.isHideOnContentScrollEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//    2    4:invokevirtual   #631 <Method boolean ActionBarOverlayLayout.isHideOnContentScrollEnabled()>
	//    3    7:ireturn         
	}

	public boolean isShowing()
	{
		int i = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #633 <Method int getHeight()>
	//    2    4:istore_1        
		return mNowShowing && (i == 0 || getHideOffset() < i);
	//    3    5:aload_0         
	//    4    6:getfield        #125 <Field boolean mNowShowing>
	//    5    9:ifeq            26
	//    6   12:iload_1         
	//    7   13:ifeq            24
	//    8   16:aload_0         
	//    9   17:invokevirtual   #635 <Method int getHideOffset()>
	//   10   20:iload_1         
	//   11   21:icmpge          26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public boolean isTitleTruncated()
	{
		DecorToolbar decortoolbar = mDecorToolbar;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:astore_1        
		return decortoolbar != null && decortoolbar.isTitleTruncated();
	//    3    5:aload_1         
	//    4    6:ifnull          20
	//    5    9:aload_1         
	//    6   10:invokeinterface #638 <Method boolean DecorToolbar.isTitleTruncated()>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public ActionBar.Tab newTab()
	{
		return ((ActionBar.Tab) (new TabImpl()));
	//    0    0:new             #17  <Class WindowDecorActionBar$TabImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #640 <Method void WindowDecorActionBar$TabImpl(WindowDecorActionBar)>
	//    4    8:areturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #221 <Field Context mContext>
	//    3    5:invokestatic    #338 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    4    8:invokevirtual   #348 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//    5   11:invokespecial   #351 <Method void setHasEmbeddedTabs(boolean)>
	//    6   14:return          
	}

	public void onContentScrollStarted()
	{
		ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = mCurrentShowAnim;
	//    0    0:aload_0         
	//    1    1:getfield        #494 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    2    4:astore_1        
		if(viewpropertyanimatorcompatset != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			viewpropertyanimatorcompatset.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #497 <Method void ViewPropertyAnimatorCompatSet.cancel()>
			mCurrentShowAnim = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #494 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
		}
	//   10   18:return          
	}

	public void onContentScrollStopped()
	{
	//    0    0:return          
	}

	public boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		Object obj = ((Object) (mActionMode));
	//    0    0:aload_0         
	//    1    1:getfield        #648 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//    2    4:astore          5
		if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		obj = ((Object) (((ActionModeImpl) (obj)).getMenu()));
	//    7   13:aload           5
	//    8   15:invokevirtual   #652 <Method Menu WindowDecorActionBar$ActionModeImpl.getMenu()>
	//    9   18:astore          5
		if(obj != null)
	//*  10   20:aload           5
	//*  11   22:ifnull          81
		{
			int j;
			if(keyevent != null)
	//*  12   25:aload_2         
	//*  13   26:ifnull          37
				j = keyevent.getDeviceId();
	//   14   29:aload_2         
	//   15   30:invokevirtual   #657 <Method int KeyEvent.getDeviceId()>
	//   16   33:istore_3        
			else
	//*  17   34:goto            39
				j = -1;
	//   18   37:iconst_m1       
	//   19   38:istore_3        
			j = KeyCharacterMap.load(j).getKeyboardType();
	//   20   39:iload_3         
	//   21   40:invokestatic    #663 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//   22   43:invokevirtual   #666 <Method int KeyCharacterMap.getKeyboardType()>
	//   23   46:istore_3        
			boolean flag = true;
	//   24   47:iconst_1        
	//   25   48:istore          4
			if(j == 1)
	//*  26   50:iload_3         
	//*  27   51:iconst_1        
	//*  28   52:icmpeq          58
	//*  29   55:goto            61
				flag = false;
	//   30   58:iconst_0        
	//   31   59:istore          4
			((Menu) (obj)).setQwertyMode(flag);
	//   32   61:aload           5
	//   33   63:iload           4
	//   34   65:invokeinterface #671 <Method void Menu.setQwertyMode(boolean)>
			return ((Menu) (obj)).performShortcut(i, keyevent, 0);
	//   35   70:aload           5
	//   36   72:iload_1         
	//   37   73:aload_2         
	//   38   74:iconst_0        
	//   39   75:invokeinterface #675 <Method boolean Menu.performShortcut(int, KeyEvent, int)>
	//   40   80:ireturn         
		} else
		{
			return false;
	//   41   81:iconst_0        
	//   42   82:ireturn         
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
	//    1    1:invokespecial   #678 <Method void cleanupTabs()>
	//    2    4:return          
	}

	public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.remove(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #682 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTab(ActionBar.Tab tab)
	{
		removeTabAt(tab.getPosition());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #684 <Method int ActionBar$Tab.getPosition()>
	//    3    5:invokevirtual   #687 <Method void removeTabAt(int)>
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
		TabImpl tabimpl = mSelectedTab;
	//    4    8:aload_0         
	//    5    9:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//    6   12:astore          5
		int j;
		if(tabimpl != null)
	//*   7   14:aload           5
	//*   8   16:ifnull          28
			j = tabimpl.getPosition();
	//    9   19:aload           5
	//   10   21:invokevirtual   #576 <Method int WindowDecorActionBar$TabImpl.getPosition()>
	//   11   24:istore_2        
		else
	//*  12   25:goto            33
			j = mSavedTabPosition;
	//   13   28:aload_0         
	//   14   29:getfield        #117 <Field int mSavedTabPosition>
	//   15   32:istore_2        
		mTabScrollView.removeTabAt(i);
	//   16   33:aload_0         
	//   17   34:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   18   37:iload_1         
	//   19   38:invokevirtual   #688 <Method void ScrollingTabContainerView.removeTabAt(int)>
		tabimpl = (TabImpl)mTabs.remove(i);
	//   20   41:aload_0         
	//   21   42:getfield        #115 <Field ArrayList mTabs>
	//   22   45:iload_1         
	//   23   46:invokevirtual   #690 <Method Object ArrayList.remove(int)>
	//   24   49:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   25   52:astore          5
		if(tabimpl != null)
	//*  26   54:aload           5
	//*  27   56:ifnull          65
			tabimpl.setPosition(-1);
	//   28   59:aload           5
	//   29   61:iconst_m1       
	//   30   62:invokevirtual   #199 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
		int l = mTabs.size();
	//   31   65:aload_0         
	//   32   66:getfield        #115 <Field ArrayList mTabs>
	//   33   69:invokevirtual   #207 <Method int ArrayList.size()>
	//   34   72:istore          4
		for(int k = i; k < l; k++)
	//*  35   74:iload_1         
	//*  36   75:istore_3        
	//*  37   76:iload_3         
	//*  38   77:iload           4
	//*  39   79:icmpge          104
			((TabImpl)mTabs.get(k)).setPosition(k);
	//   40   82:aload_0         
	//   41   83:getfield        #115 <Field ArrayList mTabs>
	//   42   86:iload_3         
	//   43   87:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   44   90:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   45   93:iload_3         
	//   46   94:invokevirtual   #199 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>

	//   47   97:iload_3         
	//   48   98:iconst_1        
	//   49   99:iadd            
	//   50  100:istore_3        
	//*  51  101:goto            76
		if(j == i)
	//*  52  104:iload_2         
	//*  53  105:iload_1         
	//*  54  106:icmpne          150
		{
			TabImpl tabimpl1;
			if(mTabs.isEmpty())
	//*  55  109:aload_0         
	//*  56  110:getfield        #115 <Field ArrayList mTabs>
	//*  57  113:invokevirtual   #431 <Method boolean ArrayList.isEmpty()>
	//*  58  116:ifeq            125
				tabimpl1 = null;
	//   59  119:aconst_null     
	//   60  120:astore          5
			else
	//*  61  122:goto            144
				tabimpl1 = (TabImpl)mTabs.get(Math.max(0, i - 1));
	//   62  125:aload_0         
	//   63  126:getfield        #115 <Field ArrayList mTabs>
	//   64  129:iconst_0        
	//   65  130:iload_1         
	//   66  131:iconst_1        
	//   67  132:isub            
	//   68  133:invokestatic    #695 <Method int Math.max(int, int)>
	//   69  136:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   70  139:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   71  142:astore          5
			selectTab(((ActionBar.Tab) (tabimpl1)));
	//   72  144:aload_0         
	//   73  145:aload           5
	//   74  147:invokevirtual   #179 <Method void selectTab(ActionBar$Tab)>
		}
	//   75  150:return          
	}

	public boolean requestFocus()
	{
		ViewGroup viewgroup = mDecorToolbar.getViewGroup();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #700 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:astore_1        
		if(viewgroup != null && !viewgroup.hasFocus())
	//*   4   10:aload_1         
	//*   5   11:ifnull          28
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #705 <Method boolean ViewGroup.hasFocus()>
	//*   8   18:ifne            28
		{
			viewgroup.requestFocus();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #707 <Method boolean ViewGroup.requestFocus()>
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
	//   11   17:invokevirtual   #684 <Method int ActionBar$Tab.getPosition()>
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
	//*  19   31:instanceof      #709 <Class FragmentActivity>
	//*  20   34:ifeq            73
	//*  21   37:aload_0         
	//*  22   38:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*  23   41:invokeinterface #700 <Method ViewGroup DecorToolbar.getViewGroup()>
	//*  24   46:invokevirtual   #712 <Method boolean ViewGroup.isInEditMode()>
	//*  25   49:ifne            73
			fragmenttransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
	//   26   52:aload_0         
	//   27   53:getfield        #138 <Field Activity mActivity>
	//   28   56:checkcast       #709 <Class FragmentActivity>
	//   29   59:invokevirtual   #716 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   30   62:invokevirtual   #722 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   31   65:invokevirtual   #727 <Method FragmentTransaction FragmentTransaction.disallowAddToBackStack()>
	//   32   68:astore          4
		else
	//*  33   70:goto            76
			fragmenttransaction = null;
	//   34   73:aconst_null     
	//   35   74:astore          4
		TabImpl tabimpl = mSelectedTab;
	//   36   76:aload_0         
	//   37   77:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   38   80:astore          5
		if(tabimpl == tab)
	//*  39   82:aload           5
	//*  40   84:aload_1         
	//*  41   85:if_acmpne       123
		{
			if(tabimpl != null)
	//*  42   88:aload           5
	//*  43   90:ifnull          203
			{
				tabimpl.getCallback().onTabReselected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   44   93:aload           5
	//   45   95:invokevirtual   #195 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   46   98:aload_0         
	//   47   99:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   48  102:aload           4
	//   49  104:invokeinterface #733 <Method void ActionBar$TabListener.onTabReselected(ActionBar$Tab, FragmentTransaction)>
				mTabScrollView.animateToTab(tab.getPosition());
	//   50  109:aload_0         
	//   51  110:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   52  113:aload_1         
	//   53  114:invokevirtual   #684 <Method int ActionBar$Tab.getPosition()>
	//   54  117:invokevirtual   #736 <Method void ScrollingTabContainerView.animateToTab(int)>
			}
		} else
	//*  55  120:goto            203
		{
			Object obj = ((Object) (mTabScrollView));
	//   56  123:aload_0         
	//   57  124:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   58  127:astore          5
			if(tab != null)
	//*  59  129:aload_1         
	//*  60  130:ifnull          138
				i = tab.getPosition();
	//   61  133:aload_1         
	//   62  134:invokevirtual   #684 <Method int ActionBar$Tab.getPosition()>
	//   63  137:istore_2        
			((ScrollingTabContainerView) (obj)).setTabSelected(i);
	//   64  138:aload           5
	//   65  140:iload_2         
	//   66  141:invokevirtual   #739 <Method void ScrollingTabContainerView.setTabSelected(int)>
			obj = ((Object) (mSelectedTab));
	//   67  144:aload_0         
	//   68  145:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   69  148:astore          5
			if(obj != null)
	//*  70  150:aload           5
	//*  71  152:ifnull          171
				((TabImpl) (obj)).getCallback().onTabUnselected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   72  155:aload           5
	//   73  157:invokevirtual   #195 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   74  160:aload_0         
	//   75  161:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   76  164:aload           4
	//   77  166:invokeinterface #742 <Method void ActionBar$TabListener.onTabUnselected(ActionBar$Tab, FragmentTransaction)>
			mSelectedTab = (TabImpl)tab;
	//   78  171:aload_0         
	//   79  172:aload_1         
	//   80  173:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   81  176:putfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
			tab = ((ActionBar.Tab) (mSelectedTab));
	//   82  179:aload_0         
	//   83  180:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   84  183:astore_1        
			if(tab != null)
	//*  85  184:aload_1         
	//*  86  185:ifnull          203
				((TabImpl) (tab)).getCallback().onTabSelected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   87  188:aload_1         
	//   88  189:invokevirtual   #195 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   89  192:aload_0         
	//   90  193:getfield        #175 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   91  196:aload           4
	//   92  198:invokeinterface #745 <Method void ActionBar$TabListener.onTabSelected(ActionBar$Tab, FragmentTransaction)>
		}
		if(fragmenttransaction != null && !fragmenttransaction.isEmpty())
	//*  93  203:aload           4
	//*  94  205:ifnull          222
	//*  95  208:aload           4
	//*  96  210:invokevirtual   #746 <Method boolean FragmentTransaction.isEmpty()>
	//*  97  213:ifne            222
			fragmenttransaction.commit();
	//   98  216:aload           4
	//   99  218:invokevirtual   #749 <Method int FragmentTransaction.commit()>
	//  100  221:pop             
	//  101  222:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		mContainerView.setPrimaryBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #754 <Method void ActionBarContainer.setPrimaryBackground(Drawable)>
	//    4    8:return          
	}

	public void setCustomView(int i)
	{
		setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, mDecorToolbar.getViewGroup(), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #757 <Method Context getThemedContext()>
	//    3    5:invokestatic    #763 <Method LayoutInflater LayoutInflater.from(Context)>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    7   13:invokeinterface #700 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #767 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   22:invokevirtual   #769 <Method void setCustomView(View)>
	//   11   25:return          
	}

	public void setCustomView(View view)
	{
		mDecorToolbar.setCustomView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #770 <Method void DecorToolbar.setCustomView(View)>
	//    4   10:return          
	}

	public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
	{
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #775 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mDecorToolbar.setCustomView(view);
	//    3    5:aload_0         
	//    4    6:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    5    9:aload_1         
	//    6   10:invokeinterface #770 <Method void DecorToolbar.setCustomView(View)>
	//    7   15:return          
	}

	public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
	{
		if(!mDisplayHomeAsUpSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #333 <Field boolean mDisplayHomeAsUpSet>
	//*   2    4:ifne            12
			setDisplayHomeAsUpEnabled(flag);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #779 <Method void setDisplayHomeAsUpEnabled(boolean)>
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
	//   10   14:invokevirtual   #783 <Method void setDisplayOptions(int, int)>
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
	//    6    8:putfield        #333 <Field boolean mDisplayHomeAsUpSet>
		mDecorToolbar.setDisplayOptions(i);
	//    7   11:aload_0         
	//    8   12:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    9   15:iload_1         
	//   10   16:invokeinterface #785 <Method void DecorToolbar.setDisplayOptions(int)>
	//   11   21:return          
	}

	public void setDisplayOptions(int i, int j)
	{
		int k = mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #331 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:istore_3        
		if((j & 4) != 0)
	//*   4   10:iload_2         
	//*   5   11:iconst_4        
	//*   6   12:iand            
	//*   7   13:ifeq            21
			mDisplayHomeAsUpSet = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #333 <Field boolean mDisplayHomeAsUpSet>
		mDecorToolbar.setDisplayOptions(i & j | j & k);
	//   11   21:aload_0         
	//   12   22:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:iand            
	//   16   28:iload_2         
	//   17   29:iload_3         
	//   18   30:iand            
	//   19   31:ior             
	//   20   32:invokeinterface #785 <Method void DecorToolbar.setDisplayOptions(int)>
	//   21   37:return          
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
	//   10   16:invokevirtual   #783 <Method void setDisplayOptions(int, int)>
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
	//   10   14:invokevirtual   #783 <Method void setDisplayOptions(int, int)>
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
	//   10   16:invokevirtual   #783 <Method void setDisplayOptions(int, int)>
	//   11   19:return          
	}

	public void setDisplayUseLogoEnabled(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #791 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #793 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #796 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void setElevation(float f)
	{
		ViewCompat.setElevation(((View) (mContainerView)), f);
	//    0    0:aload_0         
	//    1    1:getfield        #249 <Field ActionBarContainer mContainerView>
	//    2    4:fload_1         
	//    3    5:invokestatic    #799 <Method void ViewCompat.setElevation(View, float)>
	//    4    8:return          
	}

	public void setHideOffset(int i)
	{
		if(i != 0 && !mOverlayLayout.isInOverlayMode())
	//*   0    0:iload_1         
	//*   1    1:ifeq            28
	//*   2    4:aload_0         
	//*   3    5:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   4    8:invokevirtual   #803 <Method boolean ActionBarOverlayLayout.isInOverlayMode()>
	//*   5   11:ifeq            17
	//*   6   14:goto            28
		{
			throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
	//    7   17:new             #213 <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc2            #805 <String "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset">
	//   10   24:invokespecial   #218 <Method void IllegalStateException(String)>
	//   11   27:athrow          
		} else
		{
			mOverlayLayout.setActionBarHideOffset(i);
	//   12   28:aload_0         
	//   13   29:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   14   32:iload_1         
	//   15   33:invokevirtual   #808 <Method void ActionBarOverlayLayout.setActionBarHideOffset(int)>
			return;
	//   16   36:return          
		}
	}

	public void setHideOnContentScrollEnabled(boolean flag)
	{
		if(flag && !mOverlayLayout.isInOverlayMode())
	//*   0    0:iload_1         
	//*   1    1:ifeq            28
	//*   2    4:aload_0         
	//*   3    5:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   4    8:invokevirtual   #803 <Method boolean ActionBarOverlayLayout.isInOverlayMode()>
	//*   5   11:ifeq            17
	//*   6   14:goto            28
		{
			throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
	//    7   17:new             #213 <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc2            #810 <String "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll">
	//   10   24:invokespecial   #218 <Method void IllegalStateException(String)>
	//   11   27:athrow          
		} else
		{
			mHideOnContentScroll = flag;
	//   12   28:aload_0         
	//   13   29:iload_1         
	//   14   30:putfield        #812 <Field boolean mHideOnContentScroll>
			mOverlayLayout.setHideOnContentScrollEnabled(flag);
	//   15   33:aload_0         
	//   16   34:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #813 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
			return;
	//   19   41:return          
		}
	}

	public void setHomeActionContentDescription(int i)
	{
		mDecorToolbar.setNavigationContentDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #817 <Method void DecorToolbar.setNavigationContentDescription(int)>
	//    4   10:return          
	}

	public void setHomeActionContentDescription(CharSequence charsequence)
	{
		mDecorToolbar.setNavigationContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #820 <Method void DecorToolbar.setNavigationContentDescription(CharSequence)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
		mDecorToolbar.setNavigationIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #824 <Method void DecorToolbar.setNavigationIcon(int)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
		mDecorToolbar.setNavigationIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #826 <Method void DecorToolbar.setNavigationIcon(Drawable)>
	//    4   10:return          
	}

	public void setHomeButtonEnabled(boolean flag)
	{
		mDecorToolbar.setHomeButtonEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #827 <Method void DecorToolbar.setHomeButtonEnabled(boolean)>
	//    4   10:return          
	}

	public void setIcon(int i)
	{
		mDecorToolbar.setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #830 <Method void DecorToolbar.setIcon(int)>
	//    4   10:return          
	}

	public void setIcon(Drawable drawable)
	{
		mDecorToolbar.setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #832 <Method void DecorToolbar.setIcon(Drawable)>
	//    4   10:return          
	}

	public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
	{
		mDecorToolbar.setDropdownParams(spinneradapter, ((android.widget.AdapterView.OnItemSelectedListener) (new NavItemSelectedListener(onnavigationlistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:new             #836 <Class NavItemSelectedListener>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #839 <Method void NavItemSelectedListener(ActionBar$OnNavigationListener)>
	//    7   13:invokeinterface #843 <Method void DecorToolbar.setDropdownParams(SpinnerAdapter, android.widget.AdapterView$OnItemSelectedListener)>
	//    8   18:return          
	}

	public void setLogo(int i)
	{
		mDecorToolbar.setLogo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #846 <Method void DecorToolbar.setLogo(int)>
	//    4   10:return          
	}

	public void setLogo(Drawable drawable)
	{
		mDecorToolbar.setLogo(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #848 <Method void DecorToolbar.setLogo(Drawable)>
	//    4   10:return          
	}

	public void setNavigationMode(int i)
	{
		int j = mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #569 <Method int DecorToolbar.getNavigationMode()>
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
	//   10   20:invokevirtual   #851 <Method int getSelectedNavigationIndex()>
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
		if(j != i && !mHasEmbeddedTabs)
	//*  19   40:iload_2         
	//*  20   41:iload_1         
	//*  21   42:icmpeq          68
	//*  22   45:aload_0         
	//*  23   46:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  24   49:ifne            68
		{
			ActionBarOverlayLayout actionbaroverlaylayout = mOverlayLayout;
	//   25   52:aload_0         
	//   26   53:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   27   56:astore          5
			if(actionbaroverlaylayout != null)
	//*  28   58:aload           5
	//*  29   60:ifnull          68
				ViewCompat.requestApplyInsets(((View) (actionbaroverlaylayout)));
	//   30   63:aload           5
	//   31   65:invokestatic    #247 <Method void ViewCompat.requestApplyInsets(View)>
		}
		mDecorToolbar.setNavigationMode(i);
	//   32   68:aload_0         
	//   33   69:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   34   72:iload_1         
	//   35   73:invokeinterface #853 <Method void DecorToolbar.setNavigationMode(int)>
		boolean flag1 = false;
	//   36   78:iconst_0        
	//   37   79:istore          4
		if(i == 2)
	//*  38   81:iload_1         
	//*  39   82:iconst_2        
	//*  40   83:icmpeq          89
	//*  41   86:goto            121
		{
			ensureTabsExist();
	//   42   89:aload_0         
	//   43   90:invokespecial   #439 <Method void ensureTabsExist()>
			mTabScrollView.setVisibility(0);
	//   44   93:aload_0         
	//   45   94:getfield        #184 <Field ScrollingTabContainerView mTabScrollView>
	//   46   97:iconst_0        
	//   47   98:invokevirtual   #229 <Method void ScrollingTabContainerView.setVisibility(int)>
			int k = mSavedTabPosition;
	//   48  101:aload_0         
	//   49  102:getfield        #117 <Field int mSavedTabPosition>
	//   50  105:istore_2        
			if(k != -1)
	//*  51  106:iload_2         
	//*  52  107:iconst_m1       
	//*  53  108:icmpeq          121
			{
				setSelectedNavigationItem(k);
	//   54  111:aload_0         
	//   55  112:iload_2         
	//   56  113:invokevirtual   #856 <Method void setSelectedNavigationItem(int)>
				mSavedTabPosition = -1;
	//   57  116:aload_0         
	//   58  117:iconst_m1       
	//   59  118:putfield        #117 <Field int mSavedTabPosition>
			}
		}
		Object obj = ((Object) (mDecorToolbar));
	//   60  121:aload_0         
	//   61  122:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   62  125:astore          5
		boolean flag;
		if(i == 2 && !mHasEmbeddedTabs)
	//*  63  127:iload_1         
	//*  64  128:iconst_2        
	//*  65  129:icmpne          144
	//*  66  132:aload_0         
	//*  67  133:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  68  136:ifne            144
			flag = true;
	//   69  139:iconst_1        
	//   70  140:istore_3        
		else
	//*  71  141:goto            146
			flag = false;
	//   72  144:iconst_0        
	//   73  145:istore_3        
		((DecorToolbar) (obj)).setCollapsible(flag);
	//   74  146:aload           5
	//   75  148:iload_3         
	//   76  149:invokeinterface #401 <Method void DecorToolbar.setCollapsible(boolean)>
		obj = ((Object) (mOverlayLayout));
	//   77  154:aload_0         
	//   78  155:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//   79  158:astore          5
		flag = flag1;
	//   80  160:iload           4
	//   81  162:istore_3        
		if(i == 2)
	//*  82  163:iload_1         
	//*  83  164:iconst_2        
	//*  84  165:icmpne          180
		{
			flag = flag1;
	//   85  168:iload           4
	//   86  170:istore_3        
			if(!mHasEmbeddedTabs)
	//*  87  171:aload_0         
	//*  88  172:getfield        #226 <Field boolean mHasEmbeddedTabs>
	//*  89  175:ifne            180
				flag = true;
	//   90  178:iconst_1        
	//   91  179:istore_3        
		}
		((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
	//   92  180:aload           5
	//   93  182:iload_3         
	//   94  183:invokevirtual   #404 <Method void ActionBarOverlayLayout.setHasNonEmbeddedTabs(boolean)>
	//   95  186:return          
	}

	public void setSelectedNavigationItem(int i)
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #569 <Method int DecorToolbar.getNavigationMode()>
		{
	//*   3    9:tableswitch     1 2: default 32
	//	               1 59
	//	               2 43
		default:
			throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
	//    4   32:new             #213 <Class IllegalStateException>
	//    5   35:dup             
	//    6   36:ldc2            #858 <String "setSelectedNavigationIndex not valid for current navigation mode">
	//    7   39:invokespecial   #218 <Method void IllegalStateException(String)>
	//    8   42:athrow          

		case 2: // '\002'
			selectTab((ActionBar.Tab)mTabs.get(i));
	//    9   43:aload_0         
	//   10   44:aload_0         
	//   11   45:getfield        #115 <Field ArrayList mTabs>
	//   12   48:iload_1         
	//   13   49:invokevirtual   #211 <Method Object ArrayList.get(int)>
	//   14   52:checkcast       #589 <Class ActionBar$Tab>
	//   15   55:invokevirtual   #179 <Method void selectTab(ActionBar$Tab)>
			return;
	//   16   58:return          

		case 1: // '\001'
			mDecorToolbar.setDropdownSelectedPosition(i);
	//   17   59:aload_0         
	//   18   60:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//   19   63:iload_1         
	//   20   64:invokeinterface #861 <Method void DecorToolbar.setDropdownSelectedPosition(int)>
			return;
	//   21   69:return          
		}
	}

	public void setShowHideAnimationEnabled(boolean flag)
	{
		mShowHideAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #499 <Field boolean mShowHideAnimationEnabled>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            22
		{
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = mCurrentShowAnim;
	//    5    9:aload_0         
	//    6   10:getfield        #494 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    7   13:astore_2        
			if(viewpropertyanimatorcompatset != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          22
				viewpropertyanimatorcompatset.cancel();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #497 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		}
	//   12   22:return          
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
	//    3    5:invokevirtual   #867 <Method void ActionBarContainer.setStackedBackground(Drawable)>
	//    4    8:return          
	}

	public void setSubtitle(int i)
	{
		setSubtitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #221 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #872 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #874 <Method void setSubtitle(CharSequence)>
	//    6   12:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mDecorToolbar.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #875 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//    4   10:return          
	}

	public void setTitle(int i)
	{
		setTitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #221 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #872 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #878 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mDecorToolbar.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #879 <Method void DecorToolbar.setTitle(CharSequence)>
	//    4   10:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		mDecorToolbar.setWindowTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #882 <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//    4   10:return          
	}

	public void show()
	{
		if(mHiddenByApp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #412 <Field boolean mHiddenByApp>
	//*   2    4:ifeq            17
		{
			mHiddenByApp = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #412 <Field boolean mHiddenByApp>
			updateVisibility(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokespecial   #300 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public void showForSystem()
	{
		if(mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #414 <Field boolean mHiddenBySystem>
	//*   2    4:ifeq            17
		{
			mHiddenBySystem = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #414 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #300 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		ActionModeImpl actionmodeimpl = mActionMode;
	//    0    0:aload_0         
	//    1    1:getfield        #648 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//    2    4:astore_2        
		if(actionmodeimpl != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			actionmodeimpl.finish();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #889 <Method void WindowDecorActionBar$ActionModeImpl.finish()>
		mOverlayLayout.setHideOnContentScrollEnabled(false);
	//    7   13:aload_0         
	//    8   14:getfield        #242 <Field ActionBarOverlayLayout mOverlayLayout>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #813 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
		mContextView.killMode();
	//   11   21:aload_0         
	//   12   22:getfield        #321 <Field ActionBarContextView mContextView>
	//   13   25:invokevirtual   #892 <Method void ActionBarContextView.killMode()>
		callback = ((android.support.v7.view.ActionMode.Callback) (new ActionModeImpl(mContextView.getContext(), callback)));
	//   14   28:new             #14  <Class WindowDecorActionBar$ActionModeImpl>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #321 <Field ActionBarContextView mContextView>
	//   19   37:invokevirtual   #893 <Method Context ActionBarContextView.getContext()>
	//   20   40:aload_1         
	//   21   41:invokespecial   #896 <Method void WindowDecorActionBar$ActionModeImpl(WindowDecorActionBar, Context, android.support.v7.view.ActionMode$Callback)>
	//   22   44:astore_1        
		if(((ActionModeImpl) (callback)).dispatchOnCreate())
	//*  23   45:aload_1         
	//*  24   46:invokevirtual   #899 <Method boolean WindowDecorActionBar$ActionModeImpl.dispatchOnCreate()>
	//*  25   49:ifeq            85
		{
			mActionMode = ((ActionModeImpl) (callback));
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #648 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
			((ActionModeImpl) (callback)).invalidate();
	//   29   57:aload_1         
	//   30   58:invokevirtual   #902 <Method void WindowDecorActionBar$ActionModeImpl.invalidate()>
			mContextView.initForMode(((ActionMode) (callback)));
	//   31   61:aload_0         
	//   32   62:getfield        #321 <Field ActionBarContextView mContextView>
	//   33   65:aload_1         
	//   34   66:invokevirtual   #905 <Method void ActionBarContextView.initForMode(ActionMode)>
			animateToMode(true);
	//   35   69:aload_0         
	//   36   70:iconst_1        
	//   37   71:invokevirtual   #907 <Method void animateToMode(boolean)>
			mContextView.sendAccessibilityEvent(32);
	//   38   74:aload_0         
	//   39   75:getfield        #321 <Field ActionBarContextView mContextView>
	//   40   78:bipush          32
	//   41   80:invokevirtual   #910 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
			return ((ActionMode) (callback));
	//   42   83:aload_1         
	//   43   84:areturn         
		} else
		{
			return null;
	//   44   85:aconst_null     
	//   45   86:areturn         
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
