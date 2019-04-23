// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.a;
import android.support.v7.widget.ActionBarContextView;
import android.view.*;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.view:
//			ActionMode, SupportMenuInflater

public class StandaloneActionMode extends ActionMode
	implements android.support.v7.view.menu.MenuBuilder.Callback
{

	public StandaloneActionMode(Context context, ActionBarContextView actionbarcontextview, ActionMode.Callback callback, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void ActionMode()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field Context mContext>
		mContextView = actionbarcontextview;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field ActionBarContextView mContextView>
		mCallback = callback;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field ActionMode$Callback mCallback>
		mMenu = (new MenuBuilder(actionbarcontextview.getContext())).a(1);
	//   11   19:aload_0         
	//   12   20:new             #32  <Class MenuBuilder>
	//   13   23:dup             
	//   14   24:aload_2         
	//   15   25:invokevirtual   #38  <Method Context ActionBarContextView.getContext()>
	//   16   28:invokespecial   #41  <Method void MenuBuilder(Context)>
	//   17   31:iconst_1        
	//   18   32:invokevirtual   #45  <Method MenuBuilder MenuBuilder.a(int)>
	//   19   35:putfield        #47  <Field MenuBuilder mMenu>
		mMenu.a(((android.support.v7.view.menu.MenuBuilder.Callback) (this)));
	//   20   38:aload_0         
	//   21   39:getfield        #47  <Field MenuBuilder mMenu>
	//   22   42:aload_0         
	//   23   43:invokevirtual   #50  <Method void MenuBuilder.a(android.support.v7.view.menu.MenuBuilder$Callback)>
		mFocusable = flag;
	//   24   46:aload_0         
	//   25   47:iload           4
	//   26   49:putfield        #52  <Field boolean mFocusable>
	//   27   52:return          
	}

	public void finish()
	{
		if(mFinished)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field boolean mFinished>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			mFinished = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #56  <Field boolean mFinished>
			mContextView.sendAccessibilityEvent(32);
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field ActionBarContextView mContextView>
	//    9   17:bipush          32
	//   10   19:invokevirtual   #60  <Method void ActionBarContextView.sendAccessibilityEvent(int)>
			mCallback.onDestroyActionMode(((ActionMode) (this)));
	//   11   22:aload_0         
	//   12   23:getfield        #30  <Field ActionMode$Callback mCallback>
	//   13   26:aload_0         
	//   14   27:invokeinterface #66  <Method void ActionMode$Callback.onDestroyActionMode(ActionMode)>
			return;
	//   15   32:return          
		}
	}

	public View getCustomView()
	{
		WeakReference weakreference = mCustomView;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field WeakReference mCustomView>
	//    2    4:astore_1        
		if(weakreference != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			return (View)weakreference.get();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #76  <Method Object WeakReference.get()>
	//    7   13:checkcast       #78  <Class View>
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
	//    1    1:getfield        #47  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		return ((MenuInflater) (new SupportMenuInflater(mContextView.getContext())));
	//    0    0:new             #84  <Class SupportMenuInflater>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field ActionBarContextView mContextView>
	//    4    8:invokevirtual   #38  <Method Context ActionBarContextView.getContext()>
	//    5   11:invokespecial   #85  <Method void SupportMenuInflater(Context)>
	//    6   14:areturn         
	}

	public CharSequence getSubtitle()
	{
		return mContextView.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ActionBarContextView mContextView>
	//    2    4:invokevirtual   #89  <Method CharSequence ActionBarContextView.getSubtitle()>
	//    3    7:areturn         
	}

	public CharSequence getTitle()
	{
		return mContextView.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ActionBarContextView mContextView>
	//    2    4:invokevirtual   #92  <Method CharSequence ActionBarContextView.getTitle()>
	//    3    7:areturn         
	}

	public void invalidate()
	{
		mCallback.onPrepareActionMode(((ActionMode) (this)), ((Menu) (mMenu)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ActionMode$Callback mCallback>
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field MenuBuilder mMenu>
	//    5    9:invokeinterface #97  <Method boolean ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
	//    6   14:pop             
	//    7   15:return          
	}

	public boolean isTitleOptional()
	{
		return mContextView.isTitleOptional();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ActionBarContextView mContextView>
	//    2    4:invokevirtual   #101 <Method boolean ActionBarContextView.isTitleOptional()>
	//    3    7:ireturn         
	}

	public boolean isUiFocusable()
	{
		return mFocusable;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field boolean mFocusable>
	//    2    4:ireturn         
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
		return mCallback.onActionItemClicked(((ActionMode) (this)), menuitem);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ActionMode$Callback mCallback>
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokeinterface #112 <Method boolean ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
	//    5   11:ireturn         
	}

	public void onMenuModeChange(MenuBuilder menubuilder)
	{
		invalidate();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #116 <Method void invalidate()>
		mContextView.showOverflowMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field ActionBarContextView mContextView>
	//    4    8:invokevirtual   #119 <Method boolean ActionBarContextView.showOverflowMenu()>
	//    5   11:pop             
	//    6   12:return          
	}

	public boolean onSubMenuSelected(a a1)
	{
		if(!a1.hasVisibleItems())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #126 <Method boolean a.hasVisibleItems()>
	//*   2    4:ifne            9
		{
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		} else
		{
			(new MenuPopupHelper(mContextView.getContext(), ((MenuBuilder) (a1)))).show();
	//    5    9:new             #128 <Class MenuPopupHelper>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field ActionBarContextView mContextView>
	//    9   17:invokevirtual   #38  <Method Context ActionBarContextView.getContext()>
	//   10   20:aload_1         
	//   11   21:invokespecial   #131 <Method void MenuPopupHelper(Context, MenuBuilder)>
	//   12   24:invokevirtual   #134 <Method void MenuPopupHelper.show()>
			return true;
	//   13   27:iconst_1        
	//   14   28:ireturn         
		}
	}

	public void setCustomView(View view)
	{
		mContextView.setCustomView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ActionBarContextView mContextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #138 <Method void ActionBarContextView.setCustomView(View)>
		if(view != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          24
			view = ((View) (new WeakReference(((Object) (view)))));
	//    6   12:new             #72  <Class WeakReference>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #141 <Method void WeakReference(Object)>
	//   10   20:astore_1        
		else
	//*  11   21:goto            26
			view = null;
	//   12   24:aconst_null     
	//   13   25:astore_1        
		mCustomView = ((WeakReference) (view));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #70  <Field WeakReference mCustomView>
	//   17   31:return          
	}

	public void setSubtitle(int i)
	{
		setSubtitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #148 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #151 <Method void setSubtitle(CharSequence)>
	//    6   12:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mContextView.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ActionBarContextView mContextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #152 <Method void ActionBarContextView.setSubtitle(CharSequence)>
	//    4    8:return          
	}

	public void setTitle(int i)
	{
		setTitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #26  <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #148 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #155 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mContextView.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ActionBarContextView mContextView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method void ActionBarContextView.setTitle(CharSequence)>
	//    4    8:return          
	}

	public void setTitleOptionalHint(boolean flag)
	{
		super.setTitleOptionalHint(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #160 <Method void ActionMode.setTitleOptionalHint(boolean)>
		mContextView.setTitleOptional(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field ActionBarContextView mContextView>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #163 <Method void ActionBarContextView.setTitleOptional(boolean)>
	//    7   13:return          
	}

	private ActionMode.Callback mCallback;
	private Context mContext;
	private ActionBarContextView mContextView;
	private WeakReference mCustomView;
	private boolean mFinished;
	private boolean mFocusable;
	private MenuBuilder mMenu;
}
