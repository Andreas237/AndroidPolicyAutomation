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
		//*  14   30:ifne            118
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
		//*  24   52:aload_0         
		//*  25   53:aconst_null     
		//*  26   54:putfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//*  27   57:aload_0         
		//*  28   58:getfield        #28  <Field WindowDecorActionBar this$0>
		//*  29   61:iconst_0        
		//*  30   62:invokevirtual   #92  <Method void WindowDecorActionBar.animateToMode(boolean)>
		//*  31   65:aload_0         
		//*  32   66:getfield        #28  <Field WindowDecorActionBar this$0>
		//*  33   69:getfield        #96  <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//*  34   72:invokevirtual   #101 <Method void ActionBarContextView.closeMode()>
		//*  35   75:aload_0         
		//*  36   76:getfield        #28  <Field WindowDecorActionBar this$0>
		//*  37   79:getfield        #105 <Field DecorToolbar WindowDecorActionBar.mDecorToolbar>
		//*  38   82:invokeinterface #111 <Method ViewGroup DecorToolbar.getViewGroup()>
		//*  39   87:bipush          32
		//*  40   89:invokevirtual   #117 <Method void ViewGroup.sendAccessibilityEvent(int)>
		//*  41   92:aload_0         
		//*  42   93:getfield        #28  <Field WindowDecorActionBar this$0>
		//*  43   96:getfield        #121 <Field ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
		//*  44   99:aload_0         
		//*  45  100:getfield        #28  <Field WindowDecorActionBar this$0>
		//*  46  103:getfield        #124 <Field boolean WindowDecorActionBar.mHideOnContentScroll>
		//*  47  106:invokevirtual   #129 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
		//*  48  109:aload_0         
		//*  49  110:getfield        #28  <Field WindowDecorActionBar this$0>
		//*  50  113:aconst_null     
		//*  51  114:putfield        #70  <Field WindowDecorActionBar$ActionModeImpl WindowDecorActionBar.mActionMode>
		//*  52  117:return          
			{
				mCallback.onDestroyActionMode(((ActionMode) (this)));
		//   53  118:aload_0         
		//   54  119:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//   55  122:aload_0         
		//   56  123:invokeinterface #133 <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
			}
			mCallback = null;
			animateToMode(false);
			mContextView.closeMode();
			mDecorToolbar.getViewGroup().sendAccessibilityEvent(32);
			mOverlayLayout.setHideOnContentScrollEnabled(mHideOnContentScroll);
			mActionMode = null;
		//*  57  128:goto            52
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
		//    2    4:getfield        #96  <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:invokevirtual   #156 <Method CharSequence ActionBarContextView.getSubtitle()>
		//    4   10:areturn         
		}

		public CharSequence getTitle()
		{
			return mContextView.getTitle();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #96  <Field ActionBarContextView WindowDecorActionBar.mContextView>
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
		//    2    4:getfield        #96  <Field ActionBarContextView WindowDecorActionBar.mContextView>
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
		//    8   16:getfield        #96  <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    9   19:invokevirtual   #183 <Method boolean ActionBarContextView.showOverflowMenu()>
		//   10   22:pop             
				return;
		//   11   23:return          
			}
		}

		public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
		{
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			if(mCallback == null)
		//*   2    2:aload_0         
		//*   3    3:getfield        #35  <Field android.support.v7.view.ActionMode$Callback mCallback>
		//*   4    6:ifnonnull       13
				flag = false;
		//    5    9:iconst_0        
		//    6   10:istore_2        
			else
		//*   7   11:iload_2         
		//*   8   12:ireturn         
			if(submenubuilder.hasVisibleItems())
		//*   9   13:aload_1         
		//*  10   14:invokevirtual   #190 <Method boolean SubMenuBuilder.hasVisibleItems()>
		//*  11   17:ifeq            11
			{
				(new MenuPopupHelper(getThemedContext(), ((MenuBuilder) (submenubuilder)))).show();
		//   12   20:new             #192 <Class MenuPopupHelper>
		//   13   23:dup             
		//   14   24:aload_0         
		//   15   25:getfield        #28  <Field WindowDecorActionBar this$0>
		//   16   28:invokevirtual   #196 <Method Context WindowDecorActionBar.getThemedContext()>
		//   17   31:aload_1         
		//   18   32:invokespecial   #199 <Method void MenuPopupHelper(Context, MenuBuilder)>
		//   19   35:invokevirtual   #202 <Method void MenuPopupHelper.show()>
				return true;
		//   20   38:iconst_1        
		//   21   39:ireturn         
			}
			return flag;
		}

		public void setCustomView(View view)
		{
			mContextView.setCustomView(view);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #96  <Field ActionBarContextView WindowDecorActionBar.mContextView>
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
		//    2    4:getfield        #96  <Field ActionBarContextView WindowDecorActionBar.mContextView>
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
		//    2    4:getfield        #96  <Field ActionBarContextView WindowDecorActionBar.mContextView>
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
		//    5    9:getfield        #96  <Field ActionBarContextView WindowDecorActionBar.mContextView>
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
	//    1    1:invokespecial   #117 <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #119 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #120 <Method void ArrayList()>
	//    6   12:putfield        #122 <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #124 <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #119 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #120 <Method void ArrayList()>
	//   14   28:putfield        #126 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #128 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #130 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #132 <Field boolean mNowShowing>
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
	//   28   52:invokespecial   #135 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #137 <Field ViewPropertyAnimatorListener mHideListener>
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
	//   34   64:invokespecial   #138 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #140 <Field ViewPropertyAnimatorListener mShowListener>
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
	//   40   76:invokespecial   #141 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #143 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		mActivity = activity;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #145 <Field Activity mActivity>
		activity = ((Activity) (activity.getWindow().getDecorView()));
	//   45   87:aload_1         
	//   46   88:invokevirtual   #151 <Method Window Activity.getWindow()>
	//   47   91:invokevirtual   #157 <Method View Window.getDecorView()>
	//   48   94:astore_1        
		init(((View) (activity)));
	//   49   95:aload_0         
	//   50   96:aload_1         
	//   51   97:invokespecial   #161 <Method void init(View)>
		if(!flag)
	//*  52  100:iload_2         
	//*  53  101:ifne            114
			mContentView = ((View) (activity)).findViewById(0x1020002);
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:ldc1            #162 <Int 0x1020002>
	//   57  108:invokevirtual   #168 <Method View View.findViewById(int)>
	//   58  111:putfield        #170 <Field View mContentView>
	//   59  114:return          
	}

	public WindowDecorActionBar(Dialog dialog)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #119 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #120 <Method void ArrayList()>
	//    6   12:putfield        #122 <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #124 <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #119 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #120 <Method void ArrayList()>
	//   14   28:putfield        #126 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #128 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #130 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #132 <Field boolean mNowShowing>
		mHideListener = ((ViewPropertyAnimatorListener) (new _cls1()));
	//   24   46:aload_0         
	//   25   47:new             #8   <Class WindowDecorActionBar$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #135 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #137 <Field ViewPropertyAnimatorListener mHideListener>
		mShowListener = ((ViewPropertyAnimatorListener) (new _cls2()));
	//   30   58:aload_0         
	//   31   59:new             #10  <Class WindowDecorActionBar$2>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:invokespecial   #138 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #140 <Field ViewPropertyAnimatorListener mShowListener>
		mUpdateListener = new _cls3();
	//   36   70:aload_0         
	//   37   71:new             #12  <Class WindowDecorActionBar$3>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:invokespecial   #141 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #143 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		mDialog = dialog;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #173 <Field Dialog mDialog>
		init(dialog.getWindow().getDecorView());
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:invokevirtual   #176 <Method Window Dialog.getWindow()>
	//   48   92:invokevirtual   #157 <Method View Window.getDecorView()>
	//   49   95:invokespecial   #161 <Method void init(View)>
	//   50   98:return          
	}

	public WindowDecorActionBar(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #119 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #120 <Method void ArrayList()>
	//    6   12:putfield        #122 <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #124 <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #119 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #120 <Method void ArrayList()>
	//   14   28:putfield        #126 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #128 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #130 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #132 <Field boolean mNowShowing>
		mHideListener = ((ViewPropertyAnimatorListener) (new _cls1()));
	//   24   46:aload_0         
	//   25   47:new             #8   <Class WindowDecorActionBar$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #135 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #137 <Field ViewPropertyAnimatorListener mHideListener>
		mShowListener = ((ViewPropertyAnimatorListener) (new _cls2()));
	//   30   58:aload_0         
	//   31   59:new             #10  <Class WindowDecorActionBar$2>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:invokespecial   #138 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #140 <Field ViewPropertyAnimatorListener mShowListener>
		mUpdateListener = new _cls3();
	//   36   70:aload_0         
	//   37   71:new             #12  <Class WindowDecorActionBar$3>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:invokespecial   #141 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #143 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		if(!$assertionsDisabled && !view.isInEditMode())
	//*  42   82:getstatic       #102 <Field boolean $assertionsDisabled>
	//*  43   85:ifne            103
	//*  44   88:aload_1         
	//*  45   89:invokevirtual   #179 <Method boolean View.isInEditMode()>
	//*  46   92:ifne            103
		{
			throw new AssertionError();
	//   47   95:new             #181 <Class AssertionError>
	//   48   98:dup             
	//   49   99:invokespecial   #182 <Method void AssertionError()>
	//   50  102:athrow          
		} else
		{
			init(view);
	//   51  103:aload_0         
	//   52  104:aload_1         
	//   53  105:invokespecial   #161 <Method void init(View)>
			return;
	//   54  108:return          
		}
	}

	static boolean checkShowingFlags(boolean flag, boolean flag1, boolean flag2)
	{
		while(flag2 || !flag && !flag1) 
	//*   0    0:iload_2         
	//*   1    1:ifeq            6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
	//    4    6:iload_0         
	//    5    7:ifne            14
	//    6   10:iload_1         
	//    7   11:ifeq            4
		return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private void cleanupTabs()
	{
		if(mSelectedTab != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*   2    4:ifnull          12
			selectTab(((ActionBar.Tab) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokevirtual   #192 <Method void selectTab(ActionBar$Tab)>
		mTabs.clear();
	//    6   12:aload_0         
	//    7   13:getfield        #122 <Field ArrayList mTabs>
	//    8   16:invokevirtual   #195 <Method void ArrayList.clear()>
		if(mTabScrollView != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*  11   23:ifnull          33
			mTabScrollView.removeAllTabs();
	//   12   26:aload_0         
	//   13   27:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//   14   30:invokevirtual   #202 <Method void ScrollingTabContainerView.removeAllTabs()>
		mSavedTabPosition = -1;
	//   15   33:aload_0         
	//   16   34:iconst_m1       
	//   17   35:putfield        #124 <Field int mSavedTabPosition>
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
	//*   4    6:invokevirtual   #208 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//*   5    9:ifnonnull       22
			throw new IllegalStateException("Action Bar Tab must have a Callback");
	//    6   12:new             #210 <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #212 <String "Action Bar Tab must have a Callback">
	//    9   18:invokespecial   #215 <Method void IllegalStateException(String)>
	//   10   21:athrow          
		((TabImpl) (tab)).setPosition(i);
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokevirtual   #219 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
		mTabs.add(i, ((Object) (tab)));
	//   14   27:aload_0         
	//   15   28:getfield        #122 <Field ArrayList mTabs>
	//   16   31:iload_2         
	//   17   32:aload_1         
	//   18   33:invokevirtual   #223 <Method void ArrayList.add(int, Object)>
		int j = mTabs.size();
	//   19   36:aload_0         
	//   20   37:getfield        #122 <Field ArrayList mTabs>
	//   21   40:invokevirtual   #227 <Method int ArrayList.size()>
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
	//   31   54:getfield        #122 <Field ArrayList mTabs>
	//   32   57:iload_2         
	//   33   58:invokevirtual   #231 <Method Object ArrayList.get(int)>
	//   34   61:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   35   64:iload_2         
	//   36   65:invokevirtual   #219 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>

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
	//*   1    1:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		ScrollingTabContainerView scrollingtabcontainerview = new ScrollingTabContainerView(mContext);
	//    4    8:new             #199 <Class ScrollingTabContainerView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #234 <Field Context mContext>
	//    8   16:invokespecial   #237 <Method void ScrollingTabContainerView(Context)>
	//    9   19:astore_1        
		if(mHasEmbeddedTabs)
	//*  10   20:aload_0         
	//*  11   21:getfield        #239 <Field boolean mHasEmbeddedTabs>
	//*  12   24:ifeq            48
		{
			scrollingtabcontainerview.setVisibility(0);
	//   13   27:aload_1         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #242 <Method void ScrollingTabContainerView.setVisibility(int)>
			mDecorToolbar.setEmbeddedTabView(scrollingtabcontainerview);
	//   16   32:aload_0         
	//   17   33:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   18   36:aload_1         
	//   19   37:invokeinterface #250 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
		} else
	//*  20   42:aload_0         
	//*  21   43:aload_1         
	//*  22   44:putfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*  23   47:return          
		{
			if(getNavigationMode() == 2)
	//*  24   48:aload_0         
	//*  25   49:invokevirtual   #253 <Method int getNavigationMode()>
	//*  26   52:iconst_2        
	//*  27   53:icmpne          86
			{
				scrollingtabcontainerview.setVisibility(0);
	//   28   56:aload_1         
	//   29   57:iconst_0        
	//   30   58:invokevirtual   #242 <Method void ScrollingTabContainerView.setVisibility(int)>
				if(mOverlayLayout != null)
	//*  31   61:aload_0         
	//*  32   62:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  33   65:ifnull          75
					ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//   34   68:aload_0         
	//   35   69:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//   36   72:invokestatic    #260 <Method void ViewCompat.requestApplyInsets(View)>
			} else
	//*  37   75:aload_0         
	//*  38   76:getfield        #262 <Field ActionBarContainer mContainerView>
	//*  39   79:aload_1         
	//*  40   80:invokevirtual   #267 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
	//*  41   83:goto            42
			{
				scrollingtabcontainerview.setVisibility(8);
	//   42   86:aload_1         
	//   43   87:bipush          8
	//   44   89:invokevirtual   #242 <Method void ScrollingTabContainerView.setVisibility(int)>
			}
			mContainerView.setTabContainer(scrollingtabcontainerview);
		}
		mTabScrollView = scrollingtabcontainerview;
	//*  45   92:goto            75
	}

	private DecorToolbar getDecorToolbar(View view)
	{
		if(view instanceof DecorToolbar)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #246 <Class DecorToolbar>
	//*   2    4:ifeq            12
			return (DecorToolbar)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #246 <Class DecorToolbar>
	//    5   11:areturn         
		if(view instanceof Toolbar)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #271 <Class Toolbar>
	//*   8   16:ifeq            27
			return ((Toolbar)view).getWrapper();
	//    9   19:aload_1         
	//   10   20:checkcast       #271 <Class Toolbar>
	//   11   23:invokevirtual   #275 <Method DecorToolbar Toolbar.getWrapper()>
	//   12   26:areturn         
		if((new StringBuilder()).append("Can't make a decor toolbar out of ").append(((Object) (view))).toString() != null)
	//*  13   27:new             #277 <Class StringBuilder>
	//*  14   30:dup             
	//*  15   31:invokespecial   #278 <Method void StringBuilder()>
	//*  16   34:ldc2            #280 <String "Can't make a decor toolbar out of ">
	//*  17   37:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//*  18   40:aload_1         
	//*  19   41:invokevirtual   #287 <Method StringBuilder StringBuilder.append(Object)>
	//*  20   44:invokevirtual   #291 <Method String StringBuilder.toString()>
	//*  21   47:ifnull          67
			view = ((View) (((Object) (view)).getClass().getSimpleName()));
	//   22   50:aload_1         
	//   23   51:invokevirtual   #297 <Method Class Object.getClass()>
	//   24   54:invokevirtual   #300 <Method String Class.getSimpleName()>
	//   25   57:astore_1        
		else
	//*  26   58:new             #210 <Class IllegalStateException>
	//*  27   61:dup             
	//*  28   62:aload_1         
	//*  29   63:invokespecial   #215 <Method void IllegalStateException(String)>
	//*  30   66:athrow          
			view = "null";
	//   31   67:ldc2            #302 <String "null">
	//   32   70:astore_1        
		throw new IllegalStateException(((String) (view)));
	//*  33   71:goto            58
	}

	private void hideForActionMode()
	{
		if(mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #305 <Field boolean mShowingForMode>
	//*   2    4:ifeq            32
		{
			mShowingForMode = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #305 <Field boolean mShowingForMode>
			if(mOverlayLayout != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   8   16:ifnull          27
				mOverlayLayout.setShowingForActionMode(false);
	//    9   19:aload_0         
	//   10   20:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #311 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokespecial   #314 <Method void updateVisibility(boolean)>
		}
	//   16   32:return          
	}

	private void init(View view)
	{
		mOverlayLayout = (ActionBarOverlayLayout)view.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #319 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//    3    5:invokevirtual   #168 <Method View View.findViewById(int)>
	//    4    8:checkcast       #307 <Class ActionBarOverlayLayout>
	//    5   11:putfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
		if(mOverlayLayout != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   8   18:ifnull          29
			mOverlayLayout.setActionBarVisibilityCallback(((android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback) (this)));
	//    9   21:aload_0         
	//   10   22:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #323 <Method void ActionBarOverlayLayout.setActionBarVisibilityCallback(android.support.v7.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback)>
		mDecorToolbar = getDecorToolbar(view.findViewById(android.support.v7.appcompat.R.id.action_bar));
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:getstatic       #326 <Field int android.support.v7.appcompat.R$id.action_bar>
	//   17   35:invokevirtual   #168 <Method View View.findViewById(int)>
	//   18   38:invokespecial   #328 <Method DecorToolbar getDecorToolbar(View)>
	//   19   41:putfield        #244 <Field DecorToolbar mDecorToolbar>
		mContextView = (ActionBarContextView)view.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:getstatic       #331 <Field int android.support.v7.appcompat.R$id.action_context_bar>
	//   23   49:invokevirtual   #168 <Method View View.findViewById(int)>
	//   24   52:checkcast       #333 <Class ActionBarContextView>
	//   25   55:putfield        #335 <Field ActionBarContextView mContextView>
		mContainerView = (ActionBarContainer)view.findViewById(android.support.v7.appcompat.R.id.action_bar_container);
	//   26   58:aload_0         
	//   27   59:aload_1         
	//   28   60:getstatic       #338 <Field int android.support.v7.appcompat.R$id.action_bar_container>
	//   29   63:invokevirtual   #168 <Method View View.findViewById(int)>
	//   30   66:checkcast       #264 <Class ActionBarContainer>
	//   31   69:putfield        #262 <Field ActionBarContainer mContainerView>
		if(mDecorToolbar == null || mContextView == null || mContainerView == null)
	//*  32   72:aload_0         
	//*  33   73:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//*  34   76:ifnull          93
	//*  35   79:aload_0         
	//*  36   80:getfield        #335 <Field ActionBarContextView mContextView>
	//*  37   83:ifnull          93
	//*  38   86:aload_0         
	//*  39   87:getfield        #262 <Field ActionBarContainer mContainerView>
	//*  40   90:ifnonnull       133
			throw new IllegalStateException((new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(" can only be used ").append("with a compatible window decor layout").toString());
	//   41   93:new             #210 <Class IllegalStateException>
	//   42   96:dup             
	//   43   97:new             #277 <Class StringBuilder>
	//   44  100:dup             
	//   45  101:invokespecial   #278 <Method void StringBuilder()>
	//   46  104:aload_0         
	//   47  105:invokevirtual   #297 <Method Class Object.getClass()>
	//   48  108:invokevirtual   #300 <Method String Class.getSimpleName()>
	//   49  111:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   50  114:ldc2            #340 <String " can only be used ">
	//   51  117:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   52  120:ldc2            #342 <String "with a compatible window decor layout">
	//   53  123:invokevirtual   #284 <Method StringBuilder StringBuilder.append(String)>
	//   54  126:invokevirtual   #291 <Method String StringBuilder.toString()>
	//   55  129:invokespecial   #215 <Method void IllegalStateException(String)>
	//   56  132:athrow          
		mContext = mDecorToolbar.getContext();
	//   57  133:aload_0         
	//   58  134:aload_0         
	//   59  135:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   60  138:invokeinterface #346 <Method Context DecorToolbar.getContext()>
	//   61  143:putfield        #234 <Field Context mContext>
		int i;
		boolean flag;
		if((mDecorToolbar.getDisplayOptions() & 4) != 0)
	//*  62  146:aload_0         
	//*  63  147:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//*  64  150:invokeinterface #349 <Method int DecorToolbar.getDisplayOptions()>
	//*  65  155:iconst_4        
	//*  66  156:iand            
	//*  67  157:ifeq            261
			i = 1;
	//   68  160:iconst_1        
	//   69  161:istore_2        
		else
	//*  70  162:iload_2         
	//*  71  163:ifeq            171
	//*  72  166:aload_0         
	//*  73  167:iconst_1        
	//*  74  168:putfield        #351 <Field boolean mDisplayHomeAsUpSet>
	//*  75  171:aload_0         
	//*  76  172:getfield        #234 <Field Context mContext>
	//*  77  175:invokestatic    #356 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//*  78  178:astore_1        
	//*  79  179:aload_1         
	//*  80  180:invokevirtual   #359 <Method boolean ActionBarPolicy.enableHomeButtonByDefault()>
	//*  81  183:ifne            190
	//*  82  186:iload_2         
	//*  83  187:ifeq            266
	//*  84  190:iconst_1        
	//*  85  191:istore_3        
	//*  86  192:aload_0         
	//*  87  193:iload_3         
	//*  88  194:invokevirtual   #362 <Method void setHomeButtonEnabled(boolean)>
	//*  89  197:aload_0         
	//*  90  198:aload_1         
	//*  91  199:invokevirtual   #365 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//*  92  202:invokespecial   #368 <Method void setHasEmbeddedTabs(boolean)>
	//*  93  205:aload_0         
	//*  94  206:getfield        #234 <Field Context mContext>
	//*  95  209:aconst_null     
	//*  96  210:getstatic       #374 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//*  97  213:getstatic       #379 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//*  98  216:iconst_0        
	//*  99  217:invokevirtual   #385 <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//* 100  220:astore_1        
	//* 101  221:aload_1         
	//* 102  222:getstatic       #388 <Field int android.support.v7.appcompat.R$styleable.ActionBar_hideOnContentScroll>
	//* 103  225:iconst_0        
	//* 104  226:invokevirtual   #394 <Method boolean TypedArray.getBoolean(int, boolean)>
	//* 105  229:ifeq            237
	//* 106  232:aload_0         
	//* 107  233:iconst_1        
	//* 108  234:invokevirtual   #397 <Method void setHideOnContentScrollEnabled(boolean)>
	//* 109  237:aload_1         
	//* 110  238:getstatic       #400 <Field int android.support.v7.appcompat.R$styleable.ActionBar_elevation>
	//* 111  241:iconst_0        
	//* 112  242:invokevirtual   #404 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 113  245:istore_2        
	//* 114  246:iload_2         
	//* 115  247:ifeq            256
	//* 116  250:aload_0         
	//* 117  251:iload_2         
	//* 118  252:i2f             
	//* 119  253:invokevirtual   #408 <Method void setElevation(float)>
	//* 120  256:aload_1         
	//* 121  257:invokevirtual   #411 <Method void TypedArray.recycle()>
	//* 122  260:return          
			i = 0;
	//  123  261:iconst_0        
	//  124  262:istore_2        
		if(i != 0)
			mDisplayHomeAsUpSet = true;
		view = ((View) (ActionBarPolicy.get(mContext)));
		if(((ActionBarPolicy) (view)).enableHomeButtonByDefault() || i != 0)
			flag = true;
		else
	//* 125  263:goto            162
			flag = false;
	//  126  266:iconst_0        
	//  127  267:istore_3        
		setHomeButtonEnabled(flag);
		setHasEmbeddedTabs(((ActionBarPolicy) (view)).hasEmbeddedTabs());
		view = ((View) (mContext.obtainStyledAttributes(((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0)));
		if(((TypedArray) (view)).getBoolean(android.support.v7.appcompat.R.styleable.ActionBar_hideOnContentScroll, false))
			setHideOnContentScrollEnabled(true);
		i = ((TypedArray) (view)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_elevation, 0);
		if(i != 0)
			setElevation(i);
		((TypedArray) (view)).recycle();
	//* 128  268:goto            192
	}

	private void setHasEmbeddedTabs(boolean flag)
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		mHasEmbeddedTabs = flag;
	//    2    2:aload_0         
	//    3    3:iload_1         
	//    4    4:putfield        #239 <Field boolean mHasEmbeddedTabs>
		boolean flag1;
		Object obj;
		if(!mHasEmbeddedTabs)
	//*   5    7:aload_0         
	//*   6    8:getfield        #239 <Field boolean mHasEmbeddedTabs>
	//*   7   11:ifne            131
		{
			mDecorToolbar.setEmbeddedTabView(((ScrollingTabContainerView) (null)));
	//    8   14:aload_0         
	//    9   15:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   10   18:aconst_null     
	//   11   19:invokeinterface #250 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
			mContainerView.setTabContainer(mTabScrollView);
	//   12   24:aload_0         
	//   13   25:getfield        #262 <Field ActionBarContainer mContainerView>
	//   14   28:aload_0         
	//   15   29:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//   16   32:invokevirtual   #267 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
		} else
	//*  17   35:aload_0         
	//*  18   36:invokevirtual   #253 <Method int getNavigationMode()>
	//*  19   39:iconst_2        
	//*  20   40:icmpne          155
	//*  21   43:iconst_1        
	//*  22   44:istore_2        
	//*  23   45:aload_0         
	//*  24   46:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*  25   49:ifnull          78
	//*  26   52:iload_2         
	//*  27   53:ifeq            160
	//*  28   56:aload_0         
	//*  29   57:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*  30   60:iconst_0        
	//*  31   61:invokevirtual   #242 <Method void ScrollingTabContainerView.setVisibility(int)>
	//*  32   64:aload_0         
	//*  33   65:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  34   68:ifnull          78
	//*  35   71:aload_0         
	//*  36   72:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  37   75:invokestatic    #260 <Method void ViewCompat.requestApplyInsets(View)>
	//*  38   78:aload_0         
	//*  39   79:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//*  40   82:astore          4
	//*  41   84:aload_0         
	//*  42   85:getfield        #239 <Field boolean mHasEmbeddedTabs>
	//*  43   88:ifne            172
	//*  44   91:iload_2         
	//*  45   92:ifeq            172
	//*  46   95:iconst_1        
	//*  47   96:istore_1        
	//*  48   97:aload           4
	//*  49   99:iload_1         
	//*  50  100:invokeinterface #414 <Method void DecorToolbar.setCollapsible(boolean)>
	//*  51  105:aload_0         
	//*  52  106:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  53  109:astore          4
	//*  54  111:aload_0         
	//*  55  112:getfield        #239 <Field boolean mHasEmbeddedTabs>
	//*  56  115:ifne            177
	//*  57  118:iload_2         
	//*  58  119:ifeq            177
	//*  59  122:iload_3         
	//*  60  123:istore_1        
	//*  61  124:aload           4
	//*  62  126:iload_1         
	//*  63  127:invokevirtual   #417 <Method void ActionBarOverlayLayout.setHasNonEmbeddedTabs(boolean)>
	//*  64  130:return          
		{
			mContainerView.setTabContainer(((ScrollingTabContainerView) (null)));
	//   65  131:aload_0         
	//   66  132:getfield        #262 <Field ActionBarContainer mContainerView>
	//   67  135:aconst_null     
	//   68  136:invokevirtual   #267 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
			mDecorToolbar.setEmbeddedTabView(mTabScrollView);
	//   69  139:aload_0         
	//   70  140:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   71  143:aload_0         
	//   72  144:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//   73  147:invokeinterface #250 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
		}
		if(getNavigationMode() == 2)
			flag1 = true;
		else
	//*  74  152:goto            35
			flag1 = false;
	//   75  155:iconst_0        
	//   76  156:istore_2        
		if(mTabScrollView != null)
			if(flag1)
			{
				mTabScrollView.setVisibility(0);
				if(mOverlayLayout != null)
					ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
			} else
	//*  77  157:goto            45
			{
				mTabScrollView.setVisibility(8);
	//   78  160:aload_0         
	//   79  161:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//   80  164:bipush          8
	//   81  166:invokevirtual   #242 <Method void ScrollingTabContainerView.setVisibility(int)>
			}
		obj = ((Object) (mDecorToolbar));
		if(!mHasEmbeddedTabs && flag1)
			flag = true;
		else
	//*  82  169:goto            78
			flag = false;
	//   83  172:iconst_0        
	//   84  173:istore_1        
		((DecorToolbar) (obj)).setCollapsible(flag);
		obj = ((Object) (mOverlayLayout));
		if(!mHasEmbeddedTabs && flag1)
			flag = flag2;
		else
	//*  85  174:goto            97
			flag = false;
	//   86  177:iconst_0        
	//   87  178:istore_1        
		((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
	//*  88  179:goto            124
	}

	private boolean shouldAnimateContextView()
	{
		return ViewCompat.isLaidOut(((View) (mContainerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field ActionBarContainer mContainerView>
	//    2    4:invokestatic    #422 <Method boolean ViewCompat.isLaidOut(View)>
	//    3    7:ireturn         
	}

	private void showForActionMode()
	{
		if(!mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #305 <Field boolean mShowingForMode>
	//*   2    4:ifne            32
		{
			mShowingForMode = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #305 <Field boolean mShowingForMode>
			if(mOverlayLayout != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   8   16:ifnull          27
				mOverlayLayout.setShowingForActionMode(true);
	//    9   19:aload_0         
	//   10   20:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #311 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokespecial   #314 <Method void updateVisibility(boolean)>
		}
	//   16   32:return          
	}

	private void updateVisibility(boolean flag)
	{
		if(checkShowingFlags(mHiddenByApp, mHiddenBySystem, mShowingForMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field boolean mHiddenByApp>
	//*   2    4:aload_0         
	//*   3    5:getfield        #427 <Field boolean mHiddenBySystem>
	//*   4    8:aload_0         
	//*   5    9:getfield        #305 <Field boolean mShowingForMode>
	//*   6   12:invokestatic    #429 <Method boolean checkShowingFlags(boolean, boolean, boolean)>
	//*   7   15:ifeq            36
		{
			if(!mNowShowing)
	//*   8   18:aload_0         
	//*   9   19:getfield        #132 <Field boolean mNowShowing>
	//*  10   22:ifne            35
			{
				mNowShowing = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #132 <Field boolean mNowShowing>
				doShow(flag);
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:invokevirtual   #432 <Method void doShow(boolean)>
			}
		} else
	//*  17   35:return          
		if(mNowShowing)
	//*  18   36:aload_0         
	//*  19   37:getfield        #132 <Field boolean mNowShowing>
	//*  20   40:ifeq            35
		{
			mNowShowing = false;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #132 <Field boolean mNowShowing>
			doHide(flag);
	//   24   48:aload_0         
	//   25   49:iload_1         
	//   26   50:invokevirtual   #435 <Method void doHide(boolean)>
			return;
	//   27   53:return          
		}
	}

	public void addOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.add(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #440 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addTab(ActionBar.Tab tab)
	{
		addTab(tab, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #122 <Field ArrayList mTabs>
	//    4    6:invokevirtual   #444 <Method boolean ArrayList.isEmpty()>
	//    5    9:invokevirtual   #447 <Method void addTab(ActionBar$Tab, boolean)>
	//    6   12:return          
	}

	public void addTab(ActionBar.Tab tab, int i)
	{
		addTab(tab, i, mTabs.isEmpty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #122 <Field ArrayList mTabs>
	//    5    7:invokevirtual   #444 <Method boolean ArrayList.isEmpty()>
	//    6   10:invokevirtual   #450 <Method void addTab(ActionBar$Tab, int, boolean)>
	//    7   13:return          
	}

	public void addTab(ActionBar.Tab tab, int i, boolean flag)
	{
		ensureTabsExist();
	//    0    0:aload_0         
	//    1    1:invokespecial   #452 <Method void ensureTabsExist()>
		mTabScrollView.addTab(tab, i, flag);
	//    2    4:aload_0         
	//    3    5:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokevirtual   #453 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, int, boolean)>
		configureTab(tab, i);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokespecial   #455 <Method void configureTab(ActionBar$Tab, int)>
		if(flag)
	//*  12   20:iload_3         
	//*  13   21:ifeq            29
			selectTab(tab);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokevirtual   #192 <Method void selectTab(ActionBar$Tab)>
	//   17   29:return          
	}

	public void addTab(ActionBar.Tab tab, boolean flag)
	{
		ensureTabsExist();
	//    0    0:aload_0         
	//    1    1:invokespecial   #452 <Method void ensureTabsExist()>
		mTabScrollView.addTab(tab, flag);
	//    2    4:aload_0         
	//    3    5:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #456 <Method void ScrollingTabContainerView.addTab(ActionBar$Tab, boolean)>
		configureTab(tab, mTabs.size());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #122 <Field ArrayList mTabs>
	//   11   19:invokevirtual   #227 <Method int ArrayList.size()>
	//   12   22:invokespecial   #455 <Method void configureTab(ActionBar$Tab, int)>
		if(flag)
	//*  13   25:iload_2         
	//*  14   26:ifeq            34
			selectTab(tab);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #192 <Method void selectTab(ActionBar$Tab)>
	//   18   34:return          
	}

	public void animateToMode(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            68
			showForActionMode();
	//    2    4:aload_0         
	//    3    5:invokespecial   #459 <Method void showForActionMode()>
		else
	//*   4    8:aload_0         
	//*   5    9:invokespecial   #461 <Method boolean shouldAnimateContextView()>
	//*   6   12:ifeq            105
	//*   7   15:iload_1         
	//*   8   16:ifeq            75
	//*   9   19:aload_0         
	//*  10   20:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//*  11   23:iconst_4        
	//*  12   24:ldc2w           #30  <Long 100L>
	//*  13   27:invokeinterface #465 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//*  14   32:astore_2        
	//*  15   33:aload_0         
	//*  16   34:getfield        #335 <Field ActionBarContextView mContextView>
	//*  17   37:iconst_0        
	//*  18   38:ldc2w           #27  <Long 200L>
	//*  19   41:invokevirtual   #466 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//*  20   44:astore_3        
	//*  21   45:new             #468 <Class ViewPropertyAnimatorCompatSet>
	//*  22   48:dup             
	//*  23   49:invokespecial   #469 <Method void ViewPropertyAnimatorCompatSet()>
	//*  24   52:astore          4
	//*  25   54:aload           4
	//*  26   56:aload_2         
	//*  27   57:aload_3         
	//*  28   58:invokevirtual   #473 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.playSequentially(ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompat)>
	//*  29   61:pop             
	//*  30   62:aload           4
	//*  31   64:invokevirtual   #476 <Method void ViewPropertyAnimatorCompatSet.start()>
	//*  32   67:return          
			hideForActionMode();
	//   33   68:aload_0         
	//   34   69:invokespecial   #478 <Method void hideForActionMode()>
		if(shouldAnimateContextView())
		{
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat;
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat1;
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset;
			if(flag)
			{
				viewpropertyanimatorcompat = mDecorToolbar.setupAnimatorToVisibility(4, 100L);
				viewpropertyanimatorcompat1 = mContextView.setupAnimatorToVisibility(0, 200L);
			} else
	//*  35   72:goto            8
			{
				viewpropertyanimatorcompat1 = mDecorToolbar.setupAnimatorToVisibility(0, 200L);
	//   36   75:aload_0         
	//   37   76:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   38   79:iconst_0        
	//   39   80:ldc2w           #27  <Long 200L>
	//   40   83:invokeinterface #465 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//   41   88:astore_3        
				viewpropertyanimatorcompat = mContextView.setupAnimatorToVisibility(8, 100L);
	//   42   89:aload_0         
	//   43   90:getfield        #335 <Field ActionBarContextView mContextView>
	//   44   93:bipush          8
	//   45   95:ldc2w           #30  <Long 100L>
	//   46   98:invokevirtual   #466 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//   47  101:astore_2        
			}
			viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
			viewpropertyanimatorcompatset.playSequentially(viewpropertyanimatorcompat, viewpropertyanimatorcompat1);
			viewpropertyanimatorcompatset.start();
			return;
		}
	//*  48  102:goto            45
		if(flag)
	//*  49  105:iload_1         
	//*  50  106:ifeq            128
		{
			mDecorToolbar.setVisibility(4);
	//   51  109:aload_0         
	//   52  110:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   53  113:iconst_4        
	//   54  114:invokeinterface #479 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(0);
	//   55  119:aload_0         
	//   56  120:getfield        #335 <Field ActionBarContextView mContextView>
	//   57  123:iconst_0        
	//   58  124:invokevirtual   #480 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   59  127:return          
		} else
		{
			mDecorToolbar.setVisibility(0);
	//   60  128:aload_0         
	//   61  129:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   62  132:iconst_0        
	//   63  133:invokeinterface #479 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(8);
	//   64  138:aload_0         
	//   65  139:getfield        #335 <Field ActionBarContextView mContextView>
	//   66  142:bipush          8
	//   67  144:invokevirtual   #480 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   68  147:return          
		}
	}

	public boolean collapseActionView()
	{
		if(mDecorToolbar != null && mDecorToolbar.hasExpandedActionView())
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//*   2    4:ifnull          30
	//*   3    7:aload_0         
	//*   4    8:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//*   5   11:invokeinterface #484 <Method boolean DecorToolbar.hasExpandedActionView()>
	//*   6   16:ifeq            30
		{
			mDecorToolbar.collapseActionView();
	//    7   19:aload_0         
	//    8   20:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    9   23:invokeinterface #486 <Method void DecorToolbar.collapseActionView()>
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
	//*   1    1:getfield        #489 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
	//*   2    4:ifnull          30
		{
			mDeferredModeDestroyCallback.onDestroyActionMode(mDeferredDestroyActionMode);
	//    3    7:aload_0         
	//    4    8:getfield        #489 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
	//    5   11:aload_0         
	//    6   12:getfield        #491 <Field ActionMode mDeferredDestroyActionMode>
	//    7   15:invokeinterface #497 <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
			mDeferredDestroyActionMode = null;
	//    8   20:aload_0         
	//    9   21:aconst_null     
	//   10   22:putfield        #491 <Field ActionMode mDeferredDestroyActionMode>
			mDeferredModeDestroyCallback = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #489 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
		}
	//   14   30:return          
	}

	public void dispatchMenuVisibilityChanged(boolean flag)
	{
		if(flag != mLastMenuVisibility)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #500 <Field boolean mLastMenuVisibility>
	//*   3    5:icmpne          9
	//*   4    8:return          
		{
			mLastMenuVisibility = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #500 <Field boolean mLastMenuVisibility>
			int j = mMenuVisibilityListeners.size();
	//    8   14:aload_0         
	//    9   15:getfield        #126 <Field ArrayList mMenuVisibilityListeners>
	//   10   18:invokevirtual   #227 <Method int ArrayList.size()>
	//   11   21:istore_3        
			int i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_2        
			while(i < j) 
	//*  14   24:iload_2         
	//*  15   25:iload_3         
	//*  16   26:icmpge          8
			{
				((ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
	//   17   29:aload_0         
	//   18   30:getfield        #126 <Field ArrayList mMenuVisibilityListeners>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #231 <Method Object ArrayList.get(int)>
	//   21   37:checkcast       #502 <Class ActionBar$OnMenuVisibilityListener>
	//   22   40:iload_1         
	//   23   41:invokeinterface #505 <Method void ActionBar$OnMenuVisibilityListener.onMenuVisibilityChanged(boolean)>
				i++;
	//   24   46:iload_2         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_2        
			}
		}
	//*  28   50:goto            24
	}

	public void doHide(boolean flag)
	{
		if(mCurrentShowAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   2    4:ifnull          14
			mCurrentShowAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    5   11:invokevirtual   #510 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		if(mCurWindowVisibility == 0 && (mShowHideAnimationEnabled || flag))
	//*   6   14:aload_0         
	//*   7   15:getfield        #128 <Field int mCurWindowVisibility>
	//*   8   18:ifne            208
	//*   9   21:aload_0         
	//*  10   22:getfield        #512 <Field boolean mShowHideAnimationEnabled>
	//*  11   25:ifne            32
	//*  12   28:iload_1         
	//*  13   29:ifeq            208
		{
			mContainerView.setAlpha(1.0F);
	//   14   32:aload_0         
	//   15   33:getfield        #262 <Field ActionBarContainer mContainerView>
	//   16   36:fconst_1        
	//   17   37:invokevirtual   #515 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTransitioning(true);
	//   18   40:aload_0         
	//   19   41:getfield        #262 <Field ActionBarContainer mContainerView>
	//   20   44:iconst_1        
	//   21   45:invokevirtual   #518 <Method void ActionBarContainer.setTransitioning(boolean)>
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   22   48:new             #468 <Class ViewPropertyAnimatorCompatSet>
	//   23   51:dup             
	//   24   52:invokespecial   #469 <Method void ViewPropertyAnimatorCompatSet()>
	//   25   55:astore          4
			float f1 = -mContainerView.getHeight();
	//   26   57:aload_0         
	//   27   58:getfield        #262 <Field ActionBarContainer mContainerView>
	//   28   61:invokevirtual   #521 <Method int ActionBarContainer.getHeight()>
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
	//   50   90:getfield        #262 <Field ActionBarContainer mContainerView>
	//   51   93:aload           5
	//   52   95:invokevirtual   #525 <Method void ActionBarContainer.getLocationInWindow(int[])>
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
	//   61  107:getfield        #262 <Field ActionBarContainer mContainerView>
	//   62  110:invokestatic    #529 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   63  113:fload_2         
	//   64  114:invokevirtual   #535 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   65  117:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   66  119:aload           5
	//   67  121:aload_0         
	//   68  122:getfield        #143 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   69  125:invokevirtual   #539 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   70  128:pop             
			viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat);
	//   71  129:aload           4
	//   72  131:aload           5
	//   73  133:invokevirtual   #543 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   74  136:pop             
			if(mContentAnimations && mContentView != null)
	//*  75  137:aload_0         
	//*  76  138:getfield        #130 <Field boolean mContentAnimations>
	//*  77  141:ifeq            168
	//*  78  144:aload_0         
	//*  79  145:getfield        #170 <Field View mContentView>
	//*  80  148:ifnull          168
				viewpropertyanimatorcompatset.play(ViewCompat.animate(mContentView).translationY(f));
	//   81  151:aload           4
	//   82  153:aload_0         
	//   83  154:getfield        #170 <Field View mContentView>
	//   84  157:invokestatic    #529 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   85  160:fload_2         
	//   86  161:invokevirtual   #535 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   87  164:invokevirtual   #543 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   88  167:pop             
			viewpropertyanimatorcompatset.setInterpolator(sHideInterpolator);
	//   89  168:aload           4
	//   90  170:getstatic       #109 <Field Interpolator sHideInterpolator>
	//   91  173:invokevirtual   #547 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//   92  176:pop             
			viewpropertyanimatorcompatset.setDuration(250L);
	//   93  177:aload           4
	//   94  179:ldc2w           #548 <Long 250L>
	//   95  182:invokevirtual   #553 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//   96  185:pop             
			viewpropertyanimatorcompatset.setListener(mHideListener);
	//   97  186:aload           4
	//   98  188:aload_0         
	//   99  189:getfield        #137 <Field ViewPropertyAnimatorListener mHideListener>
	//  100  192:invokevirtual   #557 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  101  195:pop             
			mCurrentShowAnim = viewpropertyanimatorcompatset;
	//  102  196:aload_0         
	//  103  197:aload           4
	//  104  199:putfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			viewpropertyanimatorcompatset.start();
	//  105  202:aload           4
	//  106  204:invokevirtual   #476 <Method void ViewPropertyAnimatorCompatSet.start()>
			return;
	//  107  207:return          
		} else
		{
			mHideListener.onAnimationEnd(((View) (null)));
	//  108  208:aload_0         
	//  109  209:getfield        #137 <Field ViewPropertyAnimatorListener mHideListener>
	//  110  212:aconst_null     
	//  111  213:invokeinterface #562 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
			return;
	//  112  218:return          
		}
	}

	public void doShow(boolean flag)
	{
		if(mCurrentShowAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   2    4:ifnull          14
			mCurrentShowAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    5   11:invokevirtual   #510 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		mContainerView.setVisibility(0);
	//    6   14:aload_0         
	//    7   15:getfield        #262 <Field ActionBarContainer mContainerView>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #563 <Method void ActionBarContainer.setVisibility(int)>
		if(mCurWindowVisibility == 0 && (mShowHideAnimationEnabled || flag))
	//*  10   22:aload_0         
	//*  11   23:getfield        #128 <Field int mCurWindowVisibility>
	//*  12   26:ifne            238
	//*  13   29:aload_0         
	//*  14   30:getfield        #512 <Field boolean mShowHideAnimationEnabled>
	//*  15   33:ifne            40
	//*  16   36:iload_1         
	//*  17   37:ifeq            238
		{
			mContainerView.setTranslationY(0.0F);
	//   18   40:aload_0         
	//   19   41:getfield        #262 <Field ActionBarContainer mContainerView>
	//   20   44:fconst_0        
	//   21   45:invokevirtual   #566 <Method void ActionBarContainer.setTranslationY(float)>
			float f1 = -mContainerView.getHeight();
	//   22   48:aload_0         
	//   23   49:getfield        #262 <Field ActionBarContainer mContainerView>
	//   24   52:invokevirtual   #521 <Method int ActionBarContainer.getHeight()>
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
	//   46   81:getfield        #262 <Field ActionBarContainer mContainerView>
	//   47   84:aload           4
	//   48   86:invokevirtual   #525 <Method void ActionBarContainer.getLocationInWindow(int[])>
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
	//   57   98:getfield        #262 <Field ActionBarContainer mContainerView>
	//   58  101:fload_2         
	//   59  102:invokevirtual   #566 <Method void ActionBarContainer.setTranslationY(float)>
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   60  105:new             #468 <Class ViewPropertyAnimatorCompatSet>
	//   61  108:dup             
	//   62  109:invokespecial   #469 <Method void ViewPropertyAnimatorCompatSet()>
	//   63  112:astore          4
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mContainerView))).translationY(0.0F);
	//   64  114:aload_0         
	//   65  115:getfield        #262 <Field ActionBarContainer mContainerView>
	//   66  118:invokestatic    #529 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   67  121:fconst_0        
	//   68  122:invokevirtual   #535 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   69  125:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   70  127:aload           5
	//   71  129:aload_0         
	//   72  130:getfield        #143 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   73  133:invokevirtual   #539 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   74  136:pop             
			viewpropertyanimatorcompatset.play(viewpropertyanimatorcompat);
	//   75  137:aload           4
	//   76  139:aload           5
	//   77  141:invokevirtual   #543 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   78  144:pop             
			if(mContentAnimations && mContentView != null)
	//*  79  145:aload_0         
	//*  80  146:getfield        #130 <Field boolean mContentAnimations>
	//*  81  149:ifeq            184
	//*  82  152:aload_0         
	//*  83  153:getfield        #170 <Field View mContentView>
	//*  84  156:ifnull          184
			{
				mContentView.setTranslationY(f);
	//   85  159:aload_0         
	//   86  160:getfield        #170 <Field View mContentView>
	//   87  163:fload_2         
	//   88  164:invokevirtual   #567 <Method void View.setTranslationY(float)>
				viewpropertyanimatorcompatset.play(ViewCompat.animate(mContentView).translationY(0.0F));
	//   89  167:aload           4
	//   90  169:aload_0         
	//   91  170:getfield        #170 <Field View mContentView>
	//   92  173:invokestatic    #529 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   93  176:fconst_0        
	//   94  177:invokevirtual   #535 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   95  180:invokevirtual   #543 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   96  183:pop             
			}
			viewpropertyanimatorcompatset.setInterpolator(sShowInterpolator);
	//   97  184:aload           4
	//   98  186:getstatic       #114 <Field Interpolator sShowInterpolator>
	//   99  189:invokevirtual   #547 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//  100  192:pop             
			viewpropertyanimatorcompatset.setDuration(250L);
	//  101  193:aload           4
	//  102  195:ldc2w           #548 <Long 250L>
	//  103  198:invokevirtual   #553 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//  104  201:pop             
			viewpropertyanimatorcompatset.setListener(mShowListener);
	//  105  202:aload           4
	//  106  204:aload_0         
	//  107  205:getfield        #140 <Field ViewPropertyAnimatorListener mShowListener>
	//  108  208:invokevirtual   #557 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  109  211:pop             
			mCurrentShowAnim = viewpropertyanimatorcompatset;
	//  110  212:aload_0         
	//  111  213:aload           4
	//  112  215:putfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			viewpropertyanimatorcompatset.start();
	//  113  218:aload           4
	//  114  220:invokevirtual   #476 <Method void ViewPropertyAnimatorCompatSet.start()>
		} else
	//* 115  223:aload_0         
	//* 116  224:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//* 117  227:ifnull          237
	//* 118  230:aload_0         
	//* 119  231:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//* 120  234:invokestatic    #260 <Method void ViewCompat.requestApplyInsets(View)>
	//* 121  237:return          
		{
			mContainerView.setAlpha(1.0F);
	//  122  238:aload_0         
	//  123  239:getfield        #262 <Field ActionBarContainer mContainerView>
	//  124  242:fconst_1        
	//  125  243:invokevirtual   #515 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTranslationY(0.0F);
	//  126  246:aload_0         
	//  127  247:getfield        #262 <Field ActionBarContainer mContainerView>
	//  128  250:fconst_0        
	//  129  251:invokevirtual   #566 <Method void ActionBarContainer.setTranslationY(float)>
			if(mContentAnimations && mContentView != null)
	//* 130  254:aload_0         
	//* 131  255:getfield        #130 <Field boolean mContentAnimations>
	//* 132  258:ifeq            276
	//* 133  261:aload_0         
	//* 134  262:getfield        #170 <Field View mContentView>
	//* 135  265:ifnull          276
				mContentView.setTranslationY(0.0F);
	//  136  268:aload_0         
	//  137  269:getfield        #170 <Field View mContentView>
	//  138  272:fconst_0        
	//  139  273:invokevirtual   #567 <Method void View.setTranslationY(float)>
			mShowListener.onAnimationEnd(((View) (null)));
	//  140  276:aload_0         
	//  141  277:getfield        #140 <Field ViewPropertyAnimatorListener mShowListener>
	//  142  280:aconst_null     
	//  143  281:invokeinterface #562 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
		}
		if(mOverlayLayout != null)
			ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//* 144  286:goto            223
	}

	public void enableContentAnimations(boolean flag)
	{
		mContentAnimations = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #130 <Field boolean mContentAnimations>
	//    3    5:return          
	}

	public View getCustomView()
	{
		return mDecorToolbar.getCustomView();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #571 <Method View DecorToolbar.getCustomView()>
	//    3    9:areturn         
	}

	public int getDisplayOptions()
	{
		return mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #349 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:ireturn         
	}

	public float getElevation()
	{
		return ViewCompat.getElevation(((View) (mContainerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field ActionBarContainer mContainerView>
	//    2    4:invokestatic    #576 <Method float ViewCompat.getElevation(View)>
	//    3    7:freturn         
	}

	public int getHeight()
	{
		return mContainerView.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field ActionBarContainer mContainerView>
	//    2    4:invokevirtual   #521 <Method int ActionBarContainer.getHeight()>
	//    3    7:ireturn         
	}

	public int getHideOffset()
	{
		return mOverlayLayout.getActionBarHideOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//    2    4:invokevirtual   #580 <Method int ActionBarOverlayLayout.getActionBarHideOffset()>
	//    3    7:ireturn         
	}

	public int getNavigationItemCount()
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #582 <Method int DecorToolbar.getNavigationMode()>
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
	//    7   35:getfield        #122 <Field ArrayList mTabs>
	//    8   38:invokevirtual   #227 <Method int ArrayList.size()>
	//    9   41:ireturn         

		case 1: // '\001'
			return mDecorToolbar.getDropdownItemCount();
	//   10   42:aload_0         
	//   11   43:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   12   46:invokeinterface #585 <Method int DecorToolbar.getDropdownItemCount()>
	//   13   51:ireturn         
		}
	}

	public int getNavigationMode()
	{
		return mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #582 <Method int DecorToolbar.getNavigationMode()>
	//    3    9:ireturn         
	}

	public int getSelectedNavigationIndex()
	{
		mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #582 <Method int DecorToolbar.getNavigationMode()>
		JVM INSTR tableswitch 1 2: default 32
	//	               1 49
	//	               2 34;
	//    3    9:tableswitch     1 2: default 32
	//	               1 49
	//	               2 34
		   goto _L1 _L2 _L3
_L1:
		return -1;
	//    4   32:iconst_m1       
	//    5   33:ireturn         
_L3:
		if(mSelectedTab != null)
	//*   6   34:aload_0         
	//*   7   35:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*   8   38:ifnull          32
			return mSelectedTab.getPosition();
	//    9   41:aload_0         
	//   10   42:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   11   45:invokevirtual   #589 <Method int WindowDecorActionBar$TabImpl.getPosition()>
	//   12   48:ireturn         
		  goto _L1
_L2:
		return mDecorToolbar.getDropdownSelectedPosition();
	//   13   49:aload_0         
	//   14   50:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   15   53:invokeinterface #592 <Method int DecorToolbar.getDropdownSelectedPosition()>
	//   16   58:ireturn         
	}

	public ActionBar.Tab getSelectedTab()
	{
		return ((ActionBar.Tab) (mSelectedTab));
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//    2    4:areturn         
	}

	public CharSequence getSubtitle()
	{
		return mDecorToolbar.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #598 <Method CharSequence DecorToolbar.getSubtitle()>
	//    3    9:areturn         
	}

	public ActionBar.Tab getTabAt(int i)
	{
		return (ActionBar.Tab)mTabs.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ArrayList mTabs>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #231 <Method Object ArrayList.get(int)>
	//    4    8:checkcast       #602 <Class ActionBar$Tab>
	//    5   11:areturn         
	}

	public int getTabCount()
	{
		return mTabs.size();
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ArrayList mTabs>
	//    2    4:invokevirtual   #227 <Method int ArrayList.size()>
	//    3    7:ireturn         
	}

	public Context getThemedContext()
	{
		if(mThemedContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #606 <Field Context mThemedContext>
	//*   2    4:ifnonnull       56
		{
			TypedValue typedvalue = new TypedValue();
	//    3    7:new             #608 <Class TypedValue>
	//    4   10:dup             
	//    5   11:invokespecial   #609 <Method void TypedValue()>
	//    6   14:astore_2        
			mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//    7   15:aload_0         
	//    8   16:getfield        #234 <Field Context mContext>
	//    9   19:invokevirtual   #613 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   22:getstatic       #616 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   11   25:aload_2         
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #622 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   30:pop             
			int i = typedvalue.resourceId;
	//   15   31:aload_2         
	//   16   32:getfield        #625 <Field int TypedValue.resourceId>
	//   17   35:istore_1        
			if(i != 0)
	//*  18   36:iload_1         
	//*  19   37:ifeq            61
				mThemedContext = ((Context) (new ContextThemeWrapper(mContext, i)));
	//   20   40:aload_0         
	//   21   41:new             #627 <Class ContextThemeWrapper>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #234 <Field Context mContext>
	//   25   49:iload_1         
	//   26   50:invokespecial   #630 <Method void ContextThemeWrapper(Context, int)>
	//   27   53:putfield        #606 <Field Context mThemedContext>
			else
	//*  28   56:aload_0         
	//*  29   57:getfield        #606 <Field Context mThemedContext>
	//*  30   60:areturn         
				mThemedContext = mContext;
	//   31   61:aload_0         
	//   32   62:aload_0         
	//   33   63:getfield        #234 <Field Context mContext>
	//   34   66:putfield        #606 <Field Context mThemedContext>
		}
		return mThemedContext;
	//*  35   69:goto            56
	}

	public CharSequence getTitle()
	{
		return mDecorToolbar.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #633 <Method CharSequence DecorToolbar.getTitle()>
	//    3    9:areturn         
	}

	public boolean hasIcon()
	{
		return mDecorToolbar.hasIcon();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #636 <Method boolean DecorToolbar.hasIcon()>
	//    3    9:ireturn         
	}

	public boolean hasLogo()
	{
		return mDecorToolbar.hasLogo();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #639 <Method boolean DecorToolbar.hasLogo()>
	//    3    9:ireturn         
	}

	public void hide()
	{
		if(!mHiddenByApp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field boolean mHiddenByApp>
	//*   2    4:ifne            17
		{
			mHiddenByApp = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #425 <Field boolean mHiddenByApp>
			updateVisibility(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokespecial   #314 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public void hideForSystem()
	{
		if(!mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #427 <Field boolean mHiddenBySystem>
	//*   2    4:ifne            17
		{
			mHiddenBySystem = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #427 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #314 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public boolean isHideOnContentScrollEnabled()
	{
		return mOverlayLayout.isHideOnContentScrollEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//    2    4:invokevirtual   #644 <Method boolean ActionBarOverlayLayout.isHideOnContentScrollEnabled()>
	//    3    7:ireturn         
	}

	public boolean isShowing()
	{
		int i = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #646 <Method int getHeight()>
	//    2    4:istore_1        
		return mNowShowing && (i == 0 || getHideOffset() < i);
	//    3    5:aload_0         
	//    4    6:getfield        #132 <Field boolean mNowShowing>
	//    5    9:ifeq            26
	//    6   12:iload_1         
	//    7   13:ifeq            24
	//    8   16:aload_0         
	//    9   17:invokevirtual   #648 <Method int getHideOffset()>
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
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:ifnull          21
	//    3    7:aload_0         
	//    4    8:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    5   11:invokeinterface #651 <Method boolean DecorToolbar.isTitleTruncated()>
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
	//    3    5:invokespecial   #653 <Method void WindowDecorActionBar$TabImpl(WindowDecorActionBar)>
	//    4    8:areturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #234 <Field Context mContext>
	//    3    5:invokestatic    #356 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    4    8:invokevirtual   #365 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//    5   11:invokespecial   #368 <Method void setHasEmbeddedTabs(boolean)>
	//    6   14:return          
	}

	public void onContentScrollStarted()
	{
		if(mCurrentShowAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   2    4:ifnull          19
		{
			mCurrentShowAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    5   11:invokevirtual   #510 <Method void ViewPropertyAnimatorCompatSet.cancel()>
			mCurrentShowAnim = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
		}
	//    9   19:return          
	}

	public void onContentScrollStopped()
	{
	//    0    0:return          
	}

	public boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		Menu menu;
		if(mActionMode != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #661 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//*   2    4:ifnonnull       9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_0         
	//*   6   10:getfield        #661 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//*   7   13:invokevirtual   #665 <Method Menu WindowDecorActionBar$ActionModeImpl.getMenu()>
	//*   8   16:astore          5
			if((menu = mActionMode.getMenu()) != null)
	//*   9   18:aload           5
	//*  10   20:ifnull          7
			{
				int j;
				boolean flag;
				if(keyevent != null)
	//*  11   23:aload_2         
	//*  12   24:ifnull          66
					j = keyevent.getDeviceId();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #670 <Method int KeyEvent.getDeviceId()>
	//   15   31:istore_3        
				else
	//*  16   32:iload_3         
	//*  17   33:invokestatic    #676 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//*  18   36:invokevirtual   #679 <Method int KeyCharacterMap.getKeyboardType()>
	//*  19   39:iconst_1        
	//*  20   40:icmpeq          71
	//*  21   43:iconst_1        
	//*  22   44:istore          4
	//*  23   46:aload           5
	//*  24   48:iload           4
	//*  25   50:invokeinterface #684 <Method void Menu.setQwertyMode(boolean)>
	//*  26   55:aload           5
	//*  27   57:iload_1         
	//*  28   58:aload_2         
	//*  29   59:iconst_0        
	//*  30   60:invokeinterface #688 <Method boolean Menu.performShortcut(int, KeyEvent, int)>
	//*  31   65:ireturn         
					j = -1;
	//   32   66:iconst_m1       
	//   33   67:istore_3        
				if(KeyCharacterMap.load(j).getKeyboardType() != 1)
					flag = true;
				else
	//*  34   68:goto            32
					flag = false;
	//   35   71:iconst_0        
	//   36   72:istore          4
				menu.setQwertyMode(flag);
				return menu.performShortcut(i, keyevent, 0);
			}
		return false;
	//*  37   74:goto            46
	}

	public void onWindowVisibilityChanged(int i)
	{
		mCurWindowVisibility = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #128 <Field int mCurWindowVisibility>
	//    3    5:return          
	}

	public void removeAllTabs()
	{
		cleanupTabs();
	//    0    0:aload_0         
	//    1    1:invokespecial   #691 <Method void cleanupTabs()>
	//    2    4:return          
	}

	public void removeOnMenuVisibilityListener(ActionBar.OnMenuVisibilityListener onmenuvisibilitylistener)
	{
		mMenuVisibilityListeners.remove(((Object) (onmenuvisibilitylistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field ArrayList mMenuVisibilityListeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #695 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeTab(ActionBar.Tab tab)
	{
		removeTabAt(tab.getPosition());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #697 <Method int ActionBar$Tab.getPosition()>
	//    3    5:invokevirtual   #700 <Method void removeTabAt(int)>
	//    4    8:return          
	}

	public void removeTabAt(int i)
	{
		if(mTabScrollView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
		{
			int j;
			int l;
			TabImpl tabimpl;
			if(mSelectedTab != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*   6   12:ifnull          94
				j = mSelectedTab.getPosition();
	//    7   15:aload_0         
	//    8   16:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//    9   19:invokevirtual   #589 <Method int WindowDecorActionBar$TabImpl.getPosition()>
	//   10   22:istore_2        
			else
	//*  11   23:aload_0         
	//*  12   24:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*  13   27:iload_1         
	//*  14   28:invokevirtual   #701 <Method void ScrollingTabContainerView.removeTabAt(int)>
	//*  15   31:aload_0         
	//*  16   32:getfield        #122 <Field ArrayList mTabs>
	//*  17   35:iload_1         
	//*  18   36:invokevirtual   #703 <Method Object ArrayList.remove(int)>
	//*  19   39:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//*  20   42:astore          5
	//*  21   44:aload           5
	//*  22   46:ifnull          55
	//*  23   49:aload           5
	//*  24   51:iconst_m1       
	//*  25   52:invokevirtual   #219 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
	//*  26   55:aload_0         
	//*  27   56:getfield        #122 <Field ArrayList mTabs>
	//*  28   59:invokevirtual   #227 <Method int ArrayList.size()>
	//*  29   62:istore          4
	//*  30   64:iload_1         
	//*  31   65:istore_3        
	//*  32   66:iload_3         
	//*  33   67:iload           4
	//*  34   69:icmpge          102
	//*  35   72:aload_0         
	//*  36   73:getfield        #122 <Field ArrayList mTabs>
	//*  37   76:iload_3         
	//*  38   77:invokevirtual   #231 <Method Object ArrayList.get(int)>
	//*  39   80:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//*  40   83:iload_3         
	//*  41   84:invokevirtual   #219 <Method void WindowDecorActionBar$TabImpl.setPosition(int)>
	//*  42   87:iload_3         
	//*  43   88:iconst_1        
	//*  44   89:iadd            
	//*  45   90:istore_3        
	//*  46   91:goto            66
				j = mSavedTabPosition;
	//   47   94:aload_0         
	//   48   95:getfield        #124 <Field int mSavedTabPosition>
	//   49   98:istore_2        
			mTabScrollView.removeTabAt(i);
			tabimpl = (TabImpl)mTabs.remove(i);
			if(tabimpl != null)
				tabimpl.setPosition(-1);
			l = mTabs.size();
			for(int k = i; k < l; k++)
				((TabImpl)mTabs.get(k)).setPosition(k);

	//*  50   99:goto            23
			if(j == i)
	//*  51  102:iload_2         
	//*  52  103:iload_1         
	//*  53  104:icmpne          7
			{
				Object obj;
				if(mTabs.isEmpty())
	//*  54  107:aload_0         
	//*  55  108:getfield        #122 <Field ArrayList mTabs>
	//*  56  111:invokevirtual   #444 <Method boolean ArrayList.isEmpty()>
	//*  57  114:ifeq            127
					obj = null;
	//   58  117:aconst_null     
	//   59  118:astore          5
				else
	//*  60  120:aload_0         
	//*  61  121:aload           5
	//*  62  123:invokevirtual   #192 <Method void selectTab(ActionBar$Tab)>
	//*  63  126:return          
					obj = ((Object) ((TabImpl)mTabs.get(Math.max(0, i - 1))));
	//   64  127:aload_0         
	//   65  128:getfield        #122 <Field ArrayList mTabs>
	//   66  131:iconst_0        
	//   67  132:iload_1         
	//   68  133:iconst_1        
	//   69  134:isub            
	//   70  135:invokestatic    #708 <Method int Math.max(int, int)>
	//   71  138:invokevirtual   #231 <Method Object ArrayList.get(int)>
	//   72  141:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   73  144:astore          5
				selectTab(((ActionBar.Tab) (obj)));
				return;
			}
		}
	//*  74  146:goto            120
	}

	public boolean requestFocus()
	{
		ViewGroup viewgroup = mDecorToolbar.getViewGroup();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #713 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    3    9:astore_1        
		if(viewgroup != null && !viewgroup.hasFocus())
	//*   4   10:aload_1         
	//*   5   11:ifnull          28
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #718 <Method boolean ViewGroup.hasFocus()>
	//*   8   18:ifne            28
		{
			viewgroup.requestFocus();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #720 <Method boolean ViewGroup.requestFocus()>
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
		int i = -1;
	//    0    0:iconst_m1       
	//    1    1:istore_2        
		if(getNavigationMode() == 2) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:invokevirtual   #253 <Method int getNavigationMode()>
	//    4    6:iconst_2        
	//    5    7:icmpeq          30
_L1:
		if(tab != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          25
			i = tab.getPosition();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #697 <Method int ActionBar$Tab.getPosition()>
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:putfield        #124 <Field int mSavedTabPosition>
	//*  14   24:return          
			i = -1;
	//   15   25:iconst_m1       
	//   16   26:istore_2        
		mSavedTabPosition = i;
_L4:
		return;
	//*  17   27:goto            19
_L2:
		FragmentTransaction fragmenttransaction;
		if((mActivity instanceof FragmentActivity) && !mDecorToolbar.getViewGroup().isInEditMode())
	//*  18   30:aload_0         
	//*  19   31:getfield        #145 <Field Activity mActivity>
	//*  20   34:instanceof      #722 <Class FragmentActivity>
	//*  21   37:ifeq            132
	//*  22   40:aload_0         
	//*  23   41:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//*  24   44:invokeinterface #713 <Method ViewGroup DecorToolbar.getViewGroup()>
	//*  25   49:invokevirtual   #723 <Method boolean ViewGroup.isInEditMode()>
	//*  26   52:ifne            132
			fragmenttransaction = ((FragmentActivity)mActivity).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
	//   27   55:aload_0         
	//   28   56:getfield        #145 <Field Activity mActivity>
	//   29   59:checkcast       #722 <Class FragmentActivity>
	//   30   62:invokevirtual   #727 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   31   65:invokevirtual   #733 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   32   68:invokevirtual   #738 <Method FragmentTransaction FragmentTransaction.disallowAddToBackStack()>
	//   33   71:astore_3        
		else
	//*  34   72:aload_0         
	//*  35   73:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  36   76:aload_1         
	//*  37   77:if_acmpne       137
	//*  38   80:aload_0         
	//*  39   81:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  40   84:ifnull          115
	//*  41   87:aload_0         
	//*  42   88:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  43   91:invokevirtual   #208 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//*  44   94:aload_0         
	//*  45   95:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  46   98:aload_3         
	//*  47   99:invokeinterface #744 <Method void ActionBar$TabListener.onTabReselected(ActionBar$Tab, FragmentTransaction)>
	//*  48  104:aload_0         
	//*  49  105:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*  50  108:aload_1         
	//*  51  109:invokevirtual   #697 <Method int ActionBar$Tab.getPosition()>
	//*  52  112:invokevirtual   #747 <Method void ScrollingTabContainerView.animateToTab(int)>
	//*  53  115:aload_3         
	//*  54  116:ifnull          24
	//*  55  119:aload_3         
	//*  56  120:invokevirtual   #748 <Method boolean FragmentTransaction.isEmpty()>
	//*  57  123:ifne            24
	//*  58  126:aload_3         
	//*  59  127:invokevirtual   #751 <Method int FragmentTransaction.commit()>
	//*  60  130:pop             
	//*  61  131:return          
			fragmenttransaction = null;
	//   62  132:aconst_null     
	//   63  133:astore_3        
		if(mSelectedTab != tab)
			break; /* Loop/switch isn't completed */
		if(mSelectedTab != null)
		{
			mSelectedTab.getCallback().onTabReselected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
			mTabScrollView.animateToTab(tab.getPosition());
		}
_L5:
		if(fragmenttransaction != null && !fragmenttransaction.isEmpty())
		{
			fragmenttransaction.commit();
			return;
		}
		if(true) goto _L4; else goto _L3
	//*  64  134:goto            72
_L3:
		ScrollingTabContainerView scrollingtabcontainerview = mTabScrollView;
	//   65  137:aload_0         
	//   66  138:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//   67  141:astore          4
		if(tab != null)
	//*  68  143:aload_1         
	//*  69  144:ifnull          152
			i = tab.getPosition();
	//   70  147:aload_1         
	//   71  148:invokevirtual   #697 <Method int ActionBar$Tab.getPosition()>
	//   72  151:istore_2        
		scrollingtabcontainerview.setTabSelected(i);
	//   73  152:aload           4
	//   74  154:iload_2         
	//   75  155:invokevirtual   #754 <Method void ScrollingTabContainerView.setTabSelected(int)>
		if(mSelectedTab != null)
	//*  76  158:aload_0         
	//*  77  159:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  78  162:ifnull          182
			mSelectedTab.getCallback().onTabUnselected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   79  165:aload_0         
	//   80  166:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   81  169:invokevirtual   #208 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   82  172:aload_0         
	//   83  173:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   84  176:aload_3         
	//   85  177:invokeinterface #757 <Method void ActionBar$TabListener.onTabUnselected(ActionBar$Tab, FragmentTransaction)>
		mSelectedTab = (TabImpl)tab;
	//   86  182:aload_0         
	//   87  183:aload_1         
	//   88  184:checkcast       #17  <Class WindowDecorActionBar$TabImpl>
	//   89  187:putfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
		if(mSelectedTab != null)
	//*  90  190:aload_0         
	//*  91  191:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//*  92  194:ifnull          115
			mSelectedTab.getCallback().onTabSelected(((ActionBar.Tab) (mSelectedTab)), fragmenttransaction);
	//   93  197:aload_0         
	//   94  198:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   95  201:invokevirtual   #208 <Method ActionBar$TabListener WindowDecorActionBar$TabImpl.getCallback()>
	//   96  204:aload_0         
	//   97  205:getfield        #188 <Field WindowDecorActionBar$TabImpl mSelectedTab>
	//   98  208:aload_3         
	//   99  209:invokeinterface #760 <Method void ActionBar$TabListener.onTabSelected(ActionBar$Tab, FragmentTransaction)>
		  goto _L5
		if(true) goto _L4; else goto _L6
_L6:
	//* 100  214:goto            115
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		mContainerView.setPrimaryBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field ActionBarContainer mContainerView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #765 <Method void ActionBarContainer.setPrimaryBackground(Drawable)>
	//    4    8:return          
	}

	public void setCustomView(int i)
	{
		setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, mDecorToolbar.getViewGroup(), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #768 <Method Context getThemedContext()>
	//    3    5:invokestatic    #774 <Method LayoutInflater LayoutInflater.from(Context)>
	//    4    8:iload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    7   13:invokeinterface #713 <Method ViewGroup DecorToolbar.getViewGroup()>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #778 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   10   22:invokevirtual   #780 <Method void setCustomView(View)>
	//   11   25:return          
	}

	public void setCustomView(View view)
	{
		mDecorToolbar.setCustomView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #781 <Method void DecorToolbar.setCustomView(View)>
	//    4   10:return          
	}

	public void setCustomView(View view, ActionBar.LayoutParams layoutparams)
	{
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #786 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mDecorToolbar.setCustomView(view);
	//    3    5:aload_0         
	//    4    6:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    5    9:aload_1         
	//    6   10:invokeinterface #781 <Method void DecorToolbar.setCustomView(View)>
	//    7   15:return          
	}

	public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
	{
		if(!mDisplayHomeAsUpSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #351 <Field boolean mDisplayHomeAsUpSet>
	//*   2    4:ifne            12
			setDisplayHomeAsUpEnabled(flag);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #790 <Method void setDisplayHomeAsUpEnabled(boolean)>
	//    6   12:return          
	}

	public void setDisplayHomeAsUpEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			byte0 = 4;
	//    2    4:iconst_4        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:iconst_4        
	//*   7    9:invokevirtual   #794 <Method void setDisplayOptions(int, int)>
	//*   8   12:return          
			byte0 = 0;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		setDisplayOptions(((int) (byte0)), 4);
	//*  11   15:goto            6
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
	//    6    8:putfield        #351 <Field boolean mDisplayHomeAsUpSet>
		mDecorToolbar.setDisplayOptions(i);
	//    7   11:aload_0         
	//    8   12:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    9   15:iload_1         
	//   10   16:invokeinterface #796 <Method void DecorToolbar.setDisplayOptions(int)>
	//   11   21:return          
	}

	public void setDisplayOptions(int i, int j)
	{
		int k = mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #349 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:istore_3        
		if((j & 4) != 0)
	//*   4   10:iload_2         
	//*   5   11:iconst_4        
	//*   6   12:iand            
	//*   7   13:ifeq            21
			mDisplayHomeAsUpSet = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #351 <Field boolean mDisplayHomeAsUpSet>
		mDecorToolbar.setDisplayOptions(k & ~j | i & j);
	//   11   21:aload_0         
	//   12   22:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   13   25:iload_3         
	//   14   26:iload_2         
	//   15   27:iconst_m1       
	//   16   28:ixor            
	//   17   29:iand            
	//   18   30:iload_1         
	//   19   31:iload_2         
	//   20   32:iand            
	//   21   33:ior             
	//   22   34:invokeinterface #796 <Method void DecorToolbar.setDisplayOptions(int)>
	//   23   39:return          
	}

	public void setDisplayShowCustomEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
			byte0 = 16;
	//    2    4:bipush          16
	//    3    6:istore_2        
		else
	//*   4    7:aload_0         
	//*   5    8:iload_2         
	//*   6    9:bipush          16
	//*   7   11:invokevirtual   #794 <Method void setDisplayOptions(int, int)>
	//*   8   14:return          
			byte0 = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		setDisplayOptions(((int) (byte0)), 16);
	//*  11   17:goto            7
	}

	public void setDisplayShowHomeEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			byte0 = 2;
	//    2    4:iconst_2        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:iconst_2        
	//*   7    9:invokevirtual   #794 <Method void setDisplayOptions(int, int)>
	//*   8   12:return          
			byte0 = 0;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		setDisplayOptions(((int) (byte0)), 2);
	//*  11   15:goto            6
	}

	public void setDisplayShowTitleEnabled(boolean flag)
	{
		byte byte0;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
			byte0 = 8;
	//    2    4:bipush          8
	//    3    6:istore_2        
		else
	//*   4    7:aload_0         
	//*   5    8:iload_2         
	//*   6    9:bipush          8
	//*   7   11:invokevirtual   #794 <Method void setDisplayOptions(int, int)>
	//*   8   14:return          
			byte0 = 0;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		setDisplayOptions(((int) (byte0)), 8);
	//*  11   17:goto            7
	}

	public void setDisplayUseLogoEnabled(boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            13
			i = 1;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:iload_2         
	//*   6    8:iconst_1        
	//*   7    9:invokevirtual   #794 <Method void setDisplayOptions(int, int)>
	//*   8   12:return          
			i = 0;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		setDisplayOptions(i, 1);
	//*  11   15:goto            6
	}

	public void setElevation(float f)
	{
		ViewCompat.setElevation(((View) (mContainerView)), f);
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field ActionBarContainer mContainerView>
	//    2    4:fload_1         
	//    3    5:invokestatic    #803 <Method void ViewCompat.setElevation(View, float)>
	//    4    8:return          
	}

	public void setHideOffset(int i)
	{
		if(i != 0 && !mOverlayLayout.isInOverlayMode())
	//*   0    0:iload_1         
	//*   1    1:ifeq            25
	//*   2    4:aload_0         
	//*   3    5:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   4    8:invokevirtual   #807 <Method boolean ActionBarOverlayLayout.isInOverlayMode()>
	//*   5   11:ifne            25
		{
			throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
	//    6   14:new             #210 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #809 <String "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset">
	//    9   21:invokespecial   #215 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			mOverlayLayout.setActionBarHideOffset(i);
	//   11   25:aload_0         
	//   12   26:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//   13   29:iload_1         
	//   14   30:invokevirtual   #812 <Method void ActionBarOverlayLayout.setActionBarHideOffset(int)>
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
	//*   3    5:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   4    8:invokevirtual   #807 <Method boolean ActionBarOverlayLayout.isInOverlayMode()>
	//*   5   11:ifne            25
		{
			throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
	//    6   14:new             #210 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #814 <String "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll">
	//    9   21:invokespecial   #215 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			mHideOnContentScroll = flag;
	//   11   25:aload_0         
	//   12   26:iload_1         
	//   13   27:putfield        #816 <Field boolean mHideOnContentScroll>
			mOverlayLayout.setHideOnContentScrollEnabled(flag);
	//   14   30:aload_0         
	//   15   31:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//   16   34:iload_1         
	//   17   35:invokevirtual   #817 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
			return;
	//   18   38:return          
		}
	}

	public void setHomeActionContentDescription(int i)
	{
		mDecorToolbar.setNavigationContentDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #821 <Method void DecorToolbar.setNavigationContentDescription(int)>
	//    4   10:return          
	}

	public void setHomeActionContentDescription(CharSequence charsequence)
	{
		mDecorToolbar.setNavigationContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #824 <Method void DecorToolbar.setNavigationContentDescription(CharSequence)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
		mDecorToolbar.setNavigationIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #828 <Method void DecorToolbar.setNavigationIcon(int)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
		mDecorToolbar.setNavigationIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #830 <Method void DecorToolbar.setNavigationIcon(Drawable)>
	//    4   10:return          
	}

	public void setHomeButtonEnabled(boolean flag)
	{
		mDecorToolbar.setHomeButtonEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #831 <Method void DecorToolbar.setHomeButtonEnabled(boolean)>
	//    4   10:return          
	}

	public void setIcon(int i)
	{
		mDecorToolbar.setIcon(i);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #834 <Method void DecorToolbar.setIcon(int)>
	//    4   10:return          
	}

	public void setIcon(Drawable drawable)
	{
		mDecorToolbar.setIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #836 <Method void DecorToolbar.setIcon(Drawable)>
	//    4   10:return          
	}

	public void setListNavigationCallbacks(SpinnerAdapter spinneradapter, ActionBar.OnNavigationListener onnavigationlistener)
	{
		mDecorToolbar.setDropdownParams(spinneradapter, ((android.widget.AdapterView.OnItemSelectedListener) (new NavItemSelectedListener(onnavigationlistener))));
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:new             #840 <Class NavItemSelectedListener>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #843 <Method void NavItemSelectedListener(ActionBar$OnNavigationListener)>
	//    7   13:invokeinterface #847 <Method void DecorToolbar.setDropdownParams(SpinnerAdapter, android.widget.AdapterView$OnItemSelectedListener)>
	//    8   18:return          
	}

	public void setLogo(int i)
	{
		mDecorToolbar.setLogo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #850 <Method void DecorToolbar.setLogo(int)>
	//    4   10:return          
	}

	public void setLogo(Drawable drawable)
	{
		mDecorToolbar.setLogo(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #852 <Method void DecorToolbar.setLogo(Drawable)>
	//    4   10:return          
	}

	public void setNavigationMode(int i)
	{
		int j;
		boolean flag1;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		j = mDecorToolbar.getNavigationMode();
	//    2    3:aload_0         
	//    3    4:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    4    7:invokeinterface #582 <Method int DecorToolbar.getNavigationMode()>
	//    5   12:istore_2        
		j;
	//    6   13:iload_2         
		JVM INSTR tableswitch 2 2: default 32
	//	               2 144;
	//    7   14:tableswitch     2 2: default 32
	//	               2 144
		   goto _L1 _L2
_L1:
		if(j != i && !mHasEmbeddedTabs && mOverlayLayout != null)
	//*   8   32:iload_2         
	//*   9   33:iload_1         
	//*  10   34:icmpeq          58
	//*  11   37:aload_0         
	//*  12   38:getfield        #239 <Field boolean mHasEmbeddedTabs>
	//*  13   41:ifne            58
	//*  14   44:aload_0         
	//*  15   45:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  16   48:ifnull          58
			ViewCompat.requestApplyInsets(((View) (mOverlayLayout)));
	//   17   51:aload_0         
	//   18   52:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//   19   55:invokestatic    #260 <Method void ViewCompat.requestApplyInsets(View)>
		mDecorToolbar.setNavigationMode(i);
	//   20   58:aload_0         
	//   21   59:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   22   62:iload_1         
	//   23   63:invokeinterface #855 <Method void DecorToolbar.setNavigationMode(int)>
		i;
	//   24   68:iload_1         
		JVM INSTR tableswitch 2 2: default 88
	//	               2 169;
	//   25   69:tableswitch     2 2: default 88
	//	               2 169
		   goto _L3 _L4
_L3:
		Object obj = ((Object) (mDecorToolbar));
	//   26   88:aload_0         
	//   27   89:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   28   92:astore          5
		boolean flag;
		if(i == 2 && !mHasEmbeddedTabs)
	//*  29   94:iload_1         
	//*  30   95:iconst_2        
	//*  31   96:icmpne          205
	//*  32   99:aload_0         
	//*  33  100:getfield        #239 <Field boolean mHasEmbeddedTabs>
	//*  34  103:ifne            205
			flag = true;
	//   35  106:iconst_1        
	//   36  107:istore_3        
		else
	//*  37  108:aload           5
	//*  38  110:iload_3         
	//*  39  111:invokeinterface #414 <Method void DecorToolbar.setCollapsible(boolean)>
	//*  40  116:aload_0         
	//*  41  117:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//*  42  120:astore          5
	//*  43  122:iload_1         
	//*  44  123:iconst_2        
	//*  45  124:icmpne          210
	//*  46  127:aload_0         
	//*  47  128:getfield        #239 <Field boolean mHasEmbeddedTabs>
	//*  48  131:ifne            210
	//*  49  134:iload           4
	//*  50  136:istore_3        
	//*  51  137:aload           5
	//*  52  139:iload_3         
	//*  53  140:invokevirtual   #417 <Method void ActionBarOverlayLayout.setHasNonEmbeddedTabs(boolean)>
	//*  54  143:return          
	//*  55  144:aload_0         
	//*  56  145:aload_0         
	//*  57  146:invokevirtual   #857 <Method int getSelectedNavigationIndex()>
	//*  58  149:putfield        #124 <Field int mSavedTabPosition>
	//*  59  152:aload_0         
	//*  60  153:aconst_null     
	//*  61  154:invokevirtual   #192 <Method void selectTab(ActionBar$Tab)>
	//*  62  157:aload_0         
	//*  63  158:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*  64  161:bipush          8
	//*  65  163:invokevirtual   #242 <Method void ScrollingTabContainerView.setVisibility(int)>
	//*  66  166:goto            32
	//*  67  169:aload_0         
	//*  68  170:invokespecial   #452 <Method void ensureTabsExist()>
	//*  69  173:aload_0         
	//*  70  174:getfield        #197 <Field ScrollingTabContainerView mTabScrollView>
	//*  71  177:iconst_0        
	//*  72  178:invokevirtual   #242 <Method void ScrollingTabContainerView.setVisibility(int)>
	//*  73  181:aload_0         
	//*  74  182:getfield        #124 <Field int mSavedTabPosition>
	//*  75  185:iconst_m1       
	//*  76  186:icmpeq          88
	//*  77  189:aload_0         
	//*  78  190:aload_0         
	//*  79  191:getfield        #124 <Field int mSavedTabPosition>
	//*  80  194:invokevirtual   #860 <Method void setSelectedNavigationItem(int)>
	//*  81  197:aload_0         
	//*  82  198:iconst_m1       
	//*  83  199:putfield        #124 <Field int mSavedTabPosition>
	//*  84  202:goto            88
			flag = false;
	//   85  205:iconst_0        
	//   86  206:istore_3        
		((DecorToolbar) (obj)).setCollapsible(flag);
		obj = ((Object) (mOverlayLayout));
		if(i == 2 && !mHasEmbeddedTabs)
			flag = flag1;
		else
	//*  87  207:goto            108
			flag = false;
	//   88  210:iconst_0        
	//   89  211:istore_3        
		((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
		return;
_L2:
		mSavedTabPosition = getSelectedNavigationIndex();
		selectTab(((ActionBar.Tab) (null)));
		mTabScrollView.setVisibility(8);
		  goto _L1
_L4:
		ensureTabsExist();
		mTabScrollView.setVisibility(0);
		if(mSavedTabPosition != -1)
		{
			setSelectedNavigationItem(mSavedTabPosition);
			mSavedTabPosition = -1;
		}
		  goto _L3
	//*  90  212:goto            137
	}

	public void setSelectedNavigationItem(int i)
	{
		switch(mDecorToolbar.getNavigationMode())
	//*   0    0:aload_0         
	//*   1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//*   2    4:invokeinterface #582 <Method int DecorToolbar.getNavigationMode()>
		{
	//*   3    9:tableswitch     1 2: default 32
	//	               1 59
	//	               2 43
		default:
			throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
	//    4   32:new             #210 <Class IllegalStateException>
	//    5   35:dup             
	//    6   36:ldc2            #862 <String "setSelectedNavigationIndex not valid for current navigation mode">
	//    7   39:invokespecial   #215 <Method void IllegalStateException(String)>
	//    8   42:athrow          

		case 2: // '\002'
			selectTab((ActionBar.Tab)mTabs.get(i));
	//    9   43:aload_0         
	//   10   44:aload_0         
	//   11   45:getfield        #122 <Field ArrayList mTabs>
	//   12   48:iload_1         
	//   13   49:invokevirtual   #231 <Method Object ArrayList.get(int)>
	//   14   52:checkcast       #602 <Class ActionBar$Tab>
	//   15   55:invokevirtual   #192 <Method void selectTab(ActionBar$Tab)>
			return;
	//   16   58:return          

		case 1: // '\001'
			mDecorToolbar.setDropdownSelectedPosition(i);
	//   17   59:aload_0         
	//   18   60:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//   19   63:iload_1         
	//   20   64:invokeinterface #865 <Method void DecorToolbar.setDropdownSelectedPosition(int)>
			return;
	//   21   69:return          
		}
	}

	public void setShowHideAnimationEnabled(boolean flag)
	{
		mShowHideAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #512 <Field boolean mShowHideAnimationEnabled>
		if(!flag && mCurrentShowAnim != null)
	//*   3    5:iload_1         
	//*   4    6:ifne            23
	//*   5    9:aload_0         
	//*   6   10:getfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//*   7   13:ifnull          23
			mCurrentShowAnim.cancel();
	//    8   16:aload_0         
	//    9   17:getfield        #507 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//   10   20:invokevirtual   #510 <Method void ViewPropertyAnimatorCompatSet.cancel()>
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
	//    1    1:getfield        #262 <Field ActionBarContainer mContainerView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #871 <Method void ActionBarContainer.setStackedBackground(Drawable)>
	//    4    8:return          
	}

	public void setSubtitle(int i)
	{
		setSubtitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #234 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #876 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #878 <Method void setSubtitle(CharSequence)>
	//    6   12:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mDecorToolbar.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #879 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//    4   10:return          
	}

	public void setTitle(int i)
	{
		setTitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #234 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #876 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #882 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mDecorToolbar.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #883 <Method void DecorToolbar.setTitle(CharSequence)>
	//    4   10:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		mDecorToolbar.setWindowTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #244 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #886 <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//    4   10:return          
	}

	public void show()
	{
		if(mHiddenByApp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #425 <Field boolean mHiddenByApp>
	//*   2    4:ifeq            17
		{
			mHiddenByApp = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #425 <Field boolean mHiddenByApp>
			updateVisibility(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokespecial   #314 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public void showForSystem()
	{
		if(mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #427 <Field boolean mHiddenBySystem>
	//*   2    4:ifeq            17
		{
			mHiddenBySystem = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #427 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #314 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		if(mActionMode != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #661 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//*   2    4:ifnull          14
			mActionMode.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #661 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//    5   11:invokevirtual   #893 <Method void WindowDecorActionBar$ActionModeImpl.finish()>
		mOverlayLayout.setHideOnContentScrollEnabled(false);
	//    6   14:aload_0         
	//    7   15:getfield        #255 <Field ActionBarOverlayLayout mOverlayLayout>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #817 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
		mContextView.killMode();
	//   10   22:aload_0         
	//   11   23:getfield        #335 <Field ActionBarContextView mContextView>
	//   12   26:invokevirtual   #896 <Method void ActionBarContextView.killMode()>
		callback = ((android.support.v7.view.ActionMode.Callback) (new ActionModeImpl(mContextView.getContext(), callback)));
	//   13   29:new             #14  <Class WindowDecorActionBar$ActionModeImpl>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #335 <Field ActionBarContextView mContextView>
	//   18   38:invokevirtual   #897 <Method Context ActionBarContextView.getContext()>
	//   19   41:aload_1         
	//   20   42:invokespecial   #900 <Method void WindowDecorActionBar$ActionModeImpl(WindowDecorActionBar, Context, android.support.v7.view.ActionMode$Callback)>
	//   21   45:astore_1        
		if(((ActionModeImpl) (callback)).dispatchOnCreate())
	//*  22   46:aload_1         
	//*  23   47:invokevirtual   #903 <Method boolean WindowDecorActionBar$ActionModeImpl.dispatchOnCreate()>
	//*  24   50:ifeq            86
		{
			mActionMode = ((ActionModeImpl) (callback));
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:putfield        #661 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
			((ActionModeImpl) (callback)).invalidate();
	//   28   58:aload_1         
	//   29   59:invokevirtual   #906 <Method void WindowDecorActionBar$ActionModeImpl.invalidate()>
			mContextView.initForMode(((ActionMode) (callback)));
	//   30   62:aload_0         
	//   31   63:getfield        #335 <Field ActionBarContextView mContextView>
	//   32   66:aload_1         
	//   33   67:invokevirtual   #909 <Method void ActionBarContextView.initForMode(ActionMode)>
			animateToMode(true);
	//   34   70:aload_0         
	//   35   71:iconst_1        
	//   36   72:invokevirtual   #911 <Method void animateToMode(boolean)>
			mContextView.sendAccessibilityEvent(32);
	//   37   75:aload_0         
	//   38   76:getfield        #335 <Field ActionBarContextView mContextView>
	//   39   79:bipush          32
	//   40   81:invokevirtual   #914 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
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
	//*   1    2:invokevirtual   #100 <Method boolean Class.desiredAssertionStatus()>
	//*   2    5:ifne            35
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #102 <Field boolean $assertionsDisabled>
	//*   7   14:new             #104 <Class AccelerateInterpolator>
	//*   8   17:dup             
	//*   9   18:invokespecial   #107 <Method void AccelerateInterpolator()>
	//*  10   21:putstatic       #109 <Field Interpolator sHideInterpolator>
	//*  11   24:new             #111 <Class DecelerateInterpolator>
	//*  12   27:dup             
	//*  13   28:invokespecial   #112 <Method void DecelerateInterpolator()>
	//*  14   31:putstatic       #114 <Field Interpolator sShowInterpolator>
	//*  15   34:return          
			flag = false;
	//   16   35:iconst_0        
	//   17   36:istore_0        
		$assertionsDisabled = flag;
	//*  18   37:goto            10
	}
}
