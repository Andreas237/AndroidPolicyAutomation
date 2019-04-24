// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.view.ActionMode;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.*;
import android.support.v7.widget.*;
import android.view.*;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.app:
//			WindowDecorActionBar

public class WindowDecorActionBar$ActionModeImpl extends ActionMode
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

	public WindowDecorActionBar$ActionModeImpl(Context context, android.support.v7.view.ActionMode.Callback callback)
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
