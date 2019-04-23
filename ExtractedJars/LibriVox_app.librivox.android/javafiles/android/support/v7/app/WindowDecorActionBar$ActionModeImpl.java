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
		mMenu.h();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field MenuBuilder mMenu>
	//    2    4:invokevirtual   #47  <Method void MenuBuilder.h()>
		boolean flag = mCallback.onCreateActionMode(((ActionMode) (this)), ((Menu) (mMenu)));
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field android.support.v7.view.ActionMode$Callback mCallback>
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field MenuBuilder mMenu>
	//    8   16:invokeinterface #53  <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
	//    9   21:istore_1        
		mMenu.i();
	//   10   22:aload_0         
	//   11   23:getfield        #38  <Field MenuBuilder mMenu>
	//   12   26:invokevirtual   #56  <Method void MenuBuilder.i()>
		return flag;
	//   13   29:iload_1         
	//   14   30:ireturn         
		Exception exception;
		exception;
	//   15   31:astore_2        
		mMenu.i();
	//   16   32:aload_0         
	//   17   33:getfield        #38  <Field MenuBuilder mMenu>
	//   18   36:invokevirtual   #56  <Method void MenuBuilder.i()>
		throw exception;
	//   19   39:aload_2         
	//   20   40:athrow          
	}

	public void finish()
	{
		if(mActionMode != this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field WindowDecorActionBar this$0>
	//*   2    4:getfield        #63  <Field WindowDecorActionBar$ActionModeImpl WindowDecorActionBar.mActionMode>
	//*   3    7:aload_0         
	//*   4    8:if_acmpeq       12
			return;
	//    5   11:return          
		if(!WindowDecorActionBar.checkShowingFlags(mHiddenByApp, mHiddenBySystem, false))
	//*   6   12:aload_0         
	//*   7   13:getfield        #20  <Field WindowDecorActionBar this$0>
	//*   8   16:getfield        #67  <Field boolean WindowDecorActionBar.mHiddenByApp>
	//*   9   19:aload_0         
	//*  10   20:getfield        #20  <Field WindowDecorActionBar this$0>
	//*  11   23:getfield        #70  <Field boolean WindowDecorActionBar.mHiddenBySystem>
	//*  12   26:iconst_0        
	//*  13   27:invokestatic    #74  <Method boolean WindowDecorActionBar.checkShowingFlags(boolean, boolean, boolean)>
	//*  14   30:ifne            54
		{
			WindowDecorActionBar windowdecoractionbar = WindowDecorActionBar.this;
	//   15   33:aload_0         
	//   16   34:getfield        #20  <Field WindowDecorActionBar this$0>
	//   17   37:astore_1        
			windowdecoractionbar.mDeferredDestroyActionMode = ((ActionMode) (this));
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:putfield        #78  <Field ActionMode WindowDecorActionBar.mDeferredDestroyActionMode>
			windowdecoractionbar.mDeferredModeDestroyCallback = mCallback;
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #27  <Field android.support.v7.view.ActionMode$Callback mCallback>
	//   24   48:putfield        #81  <Field android.support.v7.view.ActionMode$Callback WindowDecorActionBar.mDeferredModeDestroyCallback>
		} else
	//*  25   51:goto            64
		{
			mCallback.onDestroyActionMode(((ActionMode) (this)));
	//   26   54:aload_0         
	//   27   55:getfield        #27  <Field android.support.v7.view.ActionMode$Callback mCallback>
	//   28   58:aload_0         
	//   29   59:invokeinterface #85  <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
		}
		mCallback = null;
	//   30   64:aload_0         
	//   31   65:aconst_null     
	//   32   66:putfield        #27  <Field android.support.v7.view.ActionMode$Callback mCallback>
		animateToMode(false);
	//   33   69:aload_0         
	//   34   70:getfield        #20  <Field WindowDecorActionBar this$0>
	//   35   73:iconst_0        
	//   36   74:invokevirtual   #89  <Method void WindowDecorActionBar.animateToMode(boolean)>
		mContextView.closeMode();
	//   37   77:aload_0         
	//   38   78:getfield        #20  <Field WindowDecorActionBar this$0>
	//   39   81:getfield        #93  <Field ActionBarContextView WindowDecorActionBar.mContextView>
	//   40   84:invokevirtual   #98  <Method void ActionBarContextView.closeMode()>
		mDecorToolbar.getViewGroup().sendAccessibilityEvent(32);
	//   41   87:aload_0         
	//   42   88:getfield        #20  <Field WindowDecorActionBar this$0>
	//   43   91:getfield        #102 <Field DecorToolbar WindowDecorActionBar.mDecorToolbar>
	//   44   94:invokeinterface #108 <Method ViewGroup DecorToolbar.getViewGroup()>
	//   45   99:bipush          32
	//   46  101:invokevirtual   #114 <Method void ViewGroup.sendAccessibilityEvent(int)>
		mOverlayLayout.setHideOnContentScrollEnabled(mHideOnContentScroll);
	//   47  104:aload_0         
	//   48  105:getfield        #20  <Field WindowDecorActionBar this$0>
	//   49  108:getfield        #118 <Field ActionBarOverlayLayout WindowDecorActionBar.mOverlayLayout>
	//   50  111:aload_0         
	//   51  112:getfield        #20  <Field WindowDecorActionBar this$0>
	//   52  115:getfield        #121 <Field boolean WindowDecorActionBar.mHideOnContentScroll>
	//   53  118:invokevirtual   #126 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
		mActionMode = null;
	//   54  121:aload_0         
	//   55  122:getfield        #20  <Field WindowDecorActionBar this$0>
	//   56  125:aconst_null     
	//   57  126:putfield        #63  <Field WindowDecorActionBar$ActionModeImpl WindowDecorActionBar.mActionMode>
	//   58  129:return          
	}

	public View getCustomView()
	{
		WeakReference weakreference = mCustomView;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field WeakReference mCustomView>
	//    2    4:astore_1        
		if(weakreference != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			return (View)weakreference.get();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #136 <Method Object WeakReference.get()>
	//    7   13:checkcast       #138 <Class View>
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
	//    1    1:getfield        #38  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		return ((MenuInflater) (new SupportMenuInflater(mActionModeContext)));
	//    0    0:new             #144 <Class SupportMenuInflater>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field Context mActionModeContext>
	//    4    8:invokespecial   #145 <Method void SupportMenuInflater(Context)>
	//    5   11:areturn         
	}

	public CharSequence getSubtitle()
	{
		return mContextView.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WindowDecorActionBar this$0>
	//    2    4:getfield        #93  <Field ActionBarContextView WindowDecorActionBar.mContextView>
	//    3    7:invokevirtual   #149 <Method CharSequence ActionBarContextView.getSubtitle()>
	//    4   10:areturn         
	}

	public CharSequence getTitle()
	{
		return mContextView.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WindowDecorActionBar this$0>
	//    2    4:getfield        #93  <Field ActionBarContextView WindowDecorActionBar.mContextView>
	//    3    7:invokevirtual   #152 <Method CharSequence ActionBarContextView.getTitle()>
	//    4   10:areturn         
	}

	public void invalidate()
	{
		if(mActionMode != this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field WindowDecorActionBar this$0>
	//*   2    4:getfield        #63  <Field WindowDecorActionBar$ActionModeImpl WindowDecorActionBar.mActionMode>
	//*   3    7:aload_0         
	//*   4    8:if_acmpeq       12
			return;
	//    5   11:return          
		mMenu.h();
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field MenuBuilder mMenu>
	//    8   16:invokevirtual   #47  <Method void MenuBuilder.h()>
		mCallback.onPrepareActionMode(((ActionMode) (this)), ((Menu) (mMenu)));
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field android.support.v7.view.ActionMode$Callback mCallback>
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #38  <Field MenuBuilder mMenu>
	//   14   28:invokeinterface #156 <Method boolean android.support.v7.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
	//   15   33:pop             
		mMenu.i();
	//   16   34:aload_0         
	//   17   35:getfield        #38  <Field MenuBuilder mMenu>
	//   18   38:invokevirtual   #56  <Method void MenuBuilder.i()>
		return;
	//   19   41:return          
		Exception exception;
		exception;
	//   20   42:astore_1        
		mMenu.i();
	//   21   43:aload_0         
	//   22   44:getfield        #38  <Field MenuBuilder mMenu>
	//   23   47:invokevirtual   #56  <Method void MenuBuilder.i()>
		throw exception;
	//   24   50:aload_1         
	//   25   51:athrow          
	}

	public boolean isTitleOptional()
	{
		return mContextView.isTitleOptional();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WindowDecorActionBar this$0>
	//    2    4:getfield        #93  <Field ActionBarContextView WindowDecorActionBar.mContextView>
	//    3    7:invokevirtual   #159 <Method boolean ActionBarContextView.isTitleOptional()>
	//    4   10:ireturn         
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
	//    0    0:return          
	}

	public void onCloseSubMenu(a a1)
	{
	//    0    0:return          
	}

	public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		menubuilder = ((MenuBuilder) (mCallback));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field android.support.v7.view.ActionMode$Callback mCallback>
	//    2    4:astore_1        
		if(menubuilder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
			return ((android.support.v7.view.ActionMode.Callback) (menubuilder)).onActionItemClicked(((ActionMode) (this)), menuitem);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokeinterface #169 <Method boolean android.support.v7.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
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
	//*   1    1:getfield        #27  <Field android.support.v7.view.ActionMode$Callback mCallback>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			invalidate();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #173 <Method void invalidate()>
			mContextView.showOverflowMenu();
	//    6   12:aload_0         
	//    7   13:getfield        #20  <Field WindowDecorActionBar this$0>
	//    8   16:getfield        #93  <Field ActionBarContextView WindowDecorActionBar.mContextView>
	//    9   19:invokevirtual   #176 <Method boolean ActionBarContextView.showOverflowMenu()>
	//   10   22:pop             
			return;
	//   11   23:return          
		}
	}

	public boolean onSubMenuSelected(a a1)
	{
		if(mCallback == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field android.support.v7.view.ActionMode$Callback mCallback>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(!a1.hasVisibleItems())
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #183 <Method boolean a.hasVisibleItems()>
	//*   7   13:ifne            18
		{
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			(new MenuPopupHelper(getThemedContext(), ((MenuBuilder) (a1)))).show();
	//   10   18:new             #185 <Class MenuPopupHelper>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #20  <Field WindowDecorActionBar this$0>
	//   14   26:invokevirtual   #189 <Method Context WindowDecorActionBar.getThemedContext()>
	//   15   29:aload_1         
	//   16   30:invokespecial   #192 <Method void MenuPopupHelper(Context, MenuBuilder)>
	//   17   33:invokevirtual   #195 <Method void MenuPopupHelper.show()>
			return true;
	//   18   36:iconst_1        
	//   19   37:ireturn         
		}
	}

	public void setCustomView(View view)
	{
		mContextView.setCustomView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WindowDecorActionBar this$0>
	//    2    4:getfield        #93  <Field ActionBarContextView WindowDecorActionBar.mContextView>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #199 <Method void ActionBarContextView.setCustomView(View)>
		mCustomView = new WeakReference(((Object) (view)));
	//    5   11:aload_0         
	//    6   12:new             #132 <Class WeakReference>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #202 <Method void WeakReference(Object)>
	//   10   20:putfield        #130 <Field WeakReference mCustomView>
	//   11   23:return          
	}

	public void setSubtitle(int i)
	{
		setSubtitle(((CharSequence) (mContext.getResources().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field WindowDecorActionBar this$0>
	//    3    5:getfield        #206 <Field Context WindowDecorActionBar.mContext>
	//    4    8:invokevirtual   #212 <Method Resources Context.getResources()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #218 <Method String Resources.getString(int)>
	//    7   15:invokevirtual   #221 <Method void setSubtitle(CharSequence)>
	//    8   18:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mContextView.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WindowDecorActionBar this$0>
	//    2    4:getfield        #93  <Field ActionBarContextView WindowDecorActionBar.mContextView>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #222 <Method void ActionBarContextView.setSubtitle(CharSequence)>
	//    5   11:return          
	}

	public void setTitle(int i)
	{
		setTitle(((CharSequence) (mContext.getResources().getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field WindowDecorActionBar this$0>
	//    3    5:getfield        #206 <Field Context WindowDecorActionBar.mContext>
	//    4    8:invokevirtual   #212 <Method Resources Context.getResources()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #218 <Method String Resources.getString(int)>
	//    7   15:invokevirtual   #225 <Method void setTitle(CharSequence)>
	//    8   18:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mContextView.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field WindowDecorActionBar this$0>
	//    2    4:getfield        #93  <Field ActionBarContextView WindowDecorActionBar.mContextView>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #226 <Method void ActionBarContextView.setTitle(CharSequence)>
	//    5   11:return          
	}

	public void setTitleOptionalHint(boolean flag)
	{
		super.setTitleOptionalHint(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #229 <Method void ActionMode.setTitleOptionalHint(boolean)>
		mContextView.setTitleOptional(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field WindowDecorActionBar this$0>
	//    5    9:getfield        #93  <Field ActionBarContextView WindowDecorActionBar.mContextView>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #232 <Method void ActionBarContextView.setTitleOptional(boolean)>
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
	//    2    2:putfield        #20  <Field WindowDecorActionBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void ActionMode()>
		mActionModeContext = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field Context mActionModeContext>
		mCallback = callback;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field android.support.v7.view.ActionMode$Callback mCallback>
		mMenu = (new MenuBuilder(context)).a(1);
	//   11   19:aload_0         
	//   12   20:new             #29  <Class MenuBuilder>
	//   13   23:dup             
	//   14   24:aload_2         
	//   15   25:invokespecial   #32  <Method void MenuBuilder(Context)>
	//   16   28:iconst_1        
	//   17   29:invokevirtual   #36  <Method MenuBuilder MenuBuilder.a(int)>
	//   18   32:putfield        #38  <Field MenuBuilder mMenu>
		mMenu.a(((android.support.v7.view.menu.MenuBuilder.Callback) (this)));
	//   19   35:aload_0         
	//   20   36:getfield        #38  <Field MenuBuilder mMenu>
	//   21   39:aload_0         
	//   22   40:invokevirtual   #41  <Method void MenuBuilder.a(android.support.v7.view.menu.MenuBuilder$Callback)>
	//   23   43:return          
	}
}
