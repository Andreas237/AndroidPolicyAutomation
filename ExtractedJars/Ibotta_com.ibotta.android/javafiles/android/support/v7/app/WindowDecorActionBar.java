// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.*;
import android.graphics.drawable.Drawable;
import android.support.v4.view.*;
import android.support.v7.view.*;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.*;
import android.util.TypedValue;
import android.view.*;
import android.view.animation.*;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.app:
//			ActionBar

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
		//    8   12:invokeinterface #172 <Method boolean android.support.v7.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
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
		//    5    9:invokevirtual   #176 <Method void invalidate()>
				mContextView.showOverflowMenu();
		//    6   12:aload_0         
		//    7   13:getfield        #28  <Field WindowDecorActionBar this$0>
		//    8   16:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    9   19:invokevirtual   #179 <Method boolean ActionBarContextView.showOverflowMenu()>
		//   10   22:pop             
				return;
		//   11   23:return          
			}
		}

		public void setCustomView(View view)
		{
			mContextView.setCustomView(view);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #183 <Method void ActionBarContextView.setCustomView(View)>
			mCustomView = new WeakReference(((Object) (view)));
		//    5   11:aload_0         
		//    6   12:new             #139 <Class WeakReference>
		//    7   15:dup             
		//    8   16:aload_1         
		//    9   17:invokespecial   #186 <Method void WeakReference(Object)>
		//   10   20:putfield        #137 <Field WeakReference mCustomView>
		//   11   23:return          
		}

		public void setSubtitle(int i)
		{
			setSubtitle(((CharSequence) (mContext.getResources().getString(i))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #28  <Field WindowDecorActionBar this$0>
		//    3    5:getfield        #190 <Field Context WindowDecorActionBar.mContext>
		//    4    8:invokevirtual   #196 <Method Resources Context.getResources()>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #202 <Method String Resources.getString(int)>
		//    7   15:invokevirtual   #205 <Method void setSubtitle(CharSequence)>
		//    8   18:return          
		}

		public void setSubtitle(CharSequence charsequence)
		{
			mContextView.setSubtitle(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #206 <Method void ActionBarContextView.setSubtitle(CharSequence)>
		//    5   11:return          
		}

		public void setTitle(int i)
		{
			setTitle(((CharSequence) (mContext.getResources().getString(i))));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #28  <Field WindowDecorActionBar this$0>
		//    3    5:getfield        #190 <Field Context WindowDecorActionBar.mContext>
		//    4    8:invokevirtual   #196 <Method Resources Context.getResources()>
		//    5   11:iload_1         
		//    6   12:invokevirtual   #202 <Method String Resources.getString(int)>
		//    7   15:invokevirtual   #209 <Method void setTitle(CharSequence)>
		//    8   18:return          
		}

		public void setTitle(CharSequence charsequence)
		{
			mContextView.setTitle(charsequence);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WindowDecorActionBar this$0>
		//    2    4:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    3    7:aload_1         
		//    4    8:invokevirtual   #210 <Method void ActionBarContextView.setTitle(CharSequence)>
		//    5   11:return          
		}

		public void setTitleOptionalHint(boolean flag)
		{
			super.setTitleOptionalHint(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #213 <Method void ActionMode.setTitleOptionalHint(boolean)>
			mContextView.setTitleOptional(flag);
		//    3    5:aload_0         
		//    4    6:getfield        #28  <Field WindowDecorActionBar this$0>
		//    5    9:getfield        #100 <Field ActionBarContextView WindowDecorActionBar.mContextView>
		//    6   12:iload_1         
		//    7   13:invokevirtual   #216 <Method void ActionBarContextView.setTitleOptional(boolean)>
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


	public WindowDecorActionBar(Activity activity, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #94  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #95  <Method void ArrayList()>
	//    6   12:putfield        #97  <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #99  <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #94  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #95  <Method void ArrayList()>
	//   14   28:putfield        #101 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #103 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #105 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #107 <Field boolean mNowShowing>
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
	//   28   52:invokespecial   #110 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #112 <Field ViewPropertyAnimatorListener mHideListener>
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
	//   34   64:invokespecial   #113 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #115 <Field ViewPropertyAnimatorListener mShowListener>
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
	//   40   76:invokespecial   #116 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #118 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		mActivity = activity;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #120 <Field Activity mActivity>
		activity = ((Activity) (activity.getWindow().getDecorView()));
	//   45   87:aload_1         
	//   46   88:invokevirtual   #126 <Method Window Activity.getWindow()>
	//   47   91:invokevirtual   #132 <Method View Window.getDecorView()>
	//   48   94:astore_1        
		init(((View) (activity)));
	//   49   95:aload_0         
	//   50   96:aload_1         
	//   51   97:invokespecial   #136 <Method void init(View)>
		if(!flag)
	//*  52  100:iload_2         
	//*  53  101:ifne            114
			mContentView = ((View) (activity)).findViewById(0x1020002);
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:ldc1            #137 <Int 0x1020002>
	//   57  108:invokevirtual   #143 <Method View View.findViewById(int)>
	//   58  111:putfield        #145 <Field View mContentView>
	//   59  114:return          
	}

	public WindowDecorActionBar(Dialog dialog)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void ActionBar()>
		mTabs = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #94  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #95  <Method void ArrayList()>
	//    6   12:putfield        #97  <Field ArrayList mTabs>
		mSavedTabPosition = -1;
	//    7   15:aload_0         
	//    8   16:iconst_m1       
	//    9   17:putfield        #99  <Field int mSavedTabPosition>
		mMenuVisibilityListeners = new ArrayList();
	//   10   20:aload_0         
	//   11   21:new             #94  <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #95  <Method void ArrayList()>
	//   14   28:putfield        #101 <Field ArrayList mMenuVisibilityListeners>
		mCurWindowVisibility = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #103 <Field int mCurWindowVisibility>
		mContentAnimations = true;
	//   18   36:aload_0         
	//   19   37:iconst_1        
	//   20   38:putfield        #105 <Field boolean mContentAnimations>
		mNowShowing = true;
	//   21   41:aload_0         
	//   22   42:iconst_1        
	//   23   43:putfield        #107 <Field boolean mNowShowing>
		mHideListener = ((ViewPropertyAnimatorListener) (new _cls1()));
	//   24   46:aload_0         
	//   25   47:new             #8   <Class WindowDecorActionBar$1>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #110 <Method void WindowDecorActionBar$1(WindowDecorActionBar)>
	//   29   55:putfield        #112 <Field ViewPropertyAnimatorListener mHideListener>
		mShowListener = ((ViewPropertyAnimatorListener) (new _cls2()));
	//   30   58:aload_0         
	//   31   59:new             #10  <Class WindowDecorActionBar$2>
	//   32   62:dup             
	//   33   63:aload_0         
	//   34   64:invokespecial   #113 <Method void WindowDecorActionBar$2(WindowDecorActionBar)>
	//   35   67:putfield        #115 <Field ViewPropertyAnimatorListener mShowListener>
		mUpdateListener = new _cls3();
	//   36   70:aload_0         
	//   37   71:new             #12  <Class WindowDecorActionBar$3>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:invokespecial   #116 <Method void WindowDecorActionBar$3(WindowDecorActionBar)>
	//   41   79:putfield        #118 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
		mDialog = dialog;
	//   42   82:aload_0         
	//   43   83:aload_1         
	//   44   84:putfield        #148 <Field Dialog mDialog>
		init(dialog.getWindow().getDecorView());
	//   45   87:aload_0         
	//   46   88:aload_1         
	//   47   89:invokevirtual   #151 <Method Window Dialog.getWindow()>
	//   48   92:invokevirtual   #132 <Method View Window.getDecorView()>
	//   49   95:invokespecial   #136 <Method void init(View)>
	//   50   98:return          
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

	private DecorToolbar getDecorToolbar(View view)
	{
		if(view instanceof DecorToolbar)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #157 <Class DecorToolbar>
	//*   2    4:ifeq            12
			return (DecorToolbar)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #157 <Class DecorToolbar>
	//    5   11:areturn         
		if(view instanceof Toolbar)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #159 <Class Toolbar>
	//*   8   16:ifeq            27
			return ((Toolbar)view).getWrapper();
	//    9   19:aload_1         
	//   10   20:checkcast       #159 <Class Toolbar>
	//   11   23:invokevirtual   #163 <Method DecorToolbar Toolbar.getWrapper()>
	//   12   26:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #165 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #166 <Method void StringBuilder()>
	//   16   34:astore_2        
		stringbuilder.append("Can't make a decor toolbar out of ");
	//   17   35:aload_2         
	//   18   36:ldc1            #168 <String "Can't make a decor toolbar out of ">
	//   19   38:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		if(view != null)
	//*  21   42:aload_1         
	//*  22   43:ifnull          57
			view = ((View) (((Object) (view)).getClass().getSimpleName()));
	//   23   46:aload_1         
	//   24   47:invokevirtual   #178 <Method Class Object.getClass()>
	//   25   50:invokevirtual   #184 <Method String Class.getSimpleName()>
	//   26   53:astore_1        
		else
	//*  27   54:goto            60
			view = "null";
	//   28   57:ldc1            #186 <String "null">
	//   29   59:astore_1        
		stringbuilder.append(((String) (view)));
	//   30   60:aload_2         
	//   31   61:aload_1         
	//   32   62:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//   33   65:pop             
		throw new IllegalStateException(stringbuilder.toString());
	//   34   66:new             #188 <Class IllegalStateException>
	//   35   69:dup             
	//   36   70:aload_2         
	//   37   71:invokevirtual   #191 <Method String StringBuilder.toString()>
	//   38   74:invokespecial   #194 <Method void IllegalStateException(String)>
	//   39   77:athrow          
	}

	private void hideForActionMode()
	{
		if(mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #197 <Field boolean mShowingForMode>
	//*   2    4:ifeq            31
		{
			mShowingForMode = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #197 <Field boolean mShowingForMode>
			ActionBarOverlayLayout actionbaroverlaylayout = mOverlayLayout;
	//    6   12:aload_0         
	//    7   13:getfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
	//    8   16:astore_1        
			if(actionbaroverlaylayout != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          26
				actionbaroverlaylayout.setShowingForActionMode(false);
	//   11   21:aload_1         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #205 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:invokespecial   #208 <Method void updateVisibility(boolean)>
		}
	//   17   31:return          
	}

	private void init(View view)
	{
		mOverlayLayout = (ActionBarOverlayLayout)view.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #213 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//    3    5:invokevirtual   #143 <Method View View.findViewById(int)>
	//    4    8:checkcast       #201 <Class ActionBarOverlayLayout>
	//    5   11:putfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
		ActionBarOverlayLayout actionbaroverlaylayout = mOverlayLayout;
	//    6   14:aload_0         
	//    7   15:getfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
	//    8   18:astore          4
		if(actionbaroverlaylayout != null)
	//*   9   20:aload           4
	//*  10   22:ifnull          31
			actionbaroverlaylayout.setActionBarVisibilityCallback(((android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback) (this)));
	//   11   25:aload           4
	//   12   27:aload_0         
	//   13   28:invokevirtual   #217 <Method void ActionBarOverlayLayout.setActionBarVisibilityCallback(android.support.v7.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback)>
		mDecorToolbar = getDecorToolbar(view.findViewById(android.support.v7.appcompat.R.id.action_bar));
	//   14   31:aload_0         
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:getstatic       #220 <Field int android.support.v7.appcompat.R$id.action_bar>
	//   18   37:invokevirtual   #143 <Method View View.findViewById(int)>
	//   19   40:invokespecial   #222 <Method DecorToolbar getDecorToolbar(View)>
	//   20   43:putfield        #224 <Field DecorToolbar mDecorToolbar>
		mContextView = (ActionBarContextView)view.findViewById(android.support.v7.appcompat.R.id.action_context_bar);
	//   21   46:aload_0         
	//   22   47:aload_1         
	//   23   48:getstatic       #227 <Field int android.support.v7.appcompat.R$id.action_context_bar>
	//   24   51:invokevirtual   #143 <Method View View.findViewById(int)>
	//   25   54:checkcast       #229 <Class ActionBarContextView>
	//   26   57:putfield        #231 <Field ActionBarContextView mContextView>
		mContainerView = (ActionBarContainer)view.findViewById(android.support.v7.appcompat.R.id.action_bar_container);
	//   27   60:aload_0         
	//   28   61:aload_1         
	//   29   62:getstatic       #234 <Field int android.support.v7.appcompat.R$id.action_bar_container>
	//   30   65:invokevirtual   #143 <Method View View.findViewById(int)>
	//   31   68:checkcast       #236 <Class ActionBarContainer>
	//   32   71:putfield        #238 <Field ActionBarContainer mContainerView>
		view = ((View) (mDecorToolbar));
	//   33   74:aload_0         
	//   34   75:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//   35   78:astore_1        
		if(view != null && mContextView != null && mContainerView != null)
	//*  36   79:aload_1         
	//*  37   80:ifnull          235
	//*  38   83:aload_0         
	//*  39   84:getfield        #231 <Field ActionBarContextView mContextView>
	//*  40   87:ifnull          235
	//*  41   90:aload_0         
	//*  42   91:getfield        #238 <Field ActionBarContainer mContainerView>
	//*  43   94:ifnull          235
		{
			mContext = ((DecorToolbar) (view)).getContext();
	//   44   97:aload_0         
	//   45   98:aload_1         
	//   46   99:invokeinterface #242 <Method Context DecorToolbar.getContext()>
	//   47  104:putfield        #244 <Field Context mContext>
			boolean flag;
			if((mDecorToolbar.getDisplayOptions() & 4) != 0)
	//*  48  107:aload_0         
	//*  49  108:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//*  50  111:invokeinterface #248 <Method int DecorToolbar.getDisplayOptions()>
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
	//   63  134:putfield        #250 <Field boolean mDisplayHomeAsUpSet>
			view = ((View) (ActionBarPolicy.get(mContext)));
	//   64  137:aload_0         
	//   65  138:getfield        #244 <Field Context mContext>
	//   66  141:invokestatic    #256 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//   67  144:astore_1        
			boolean flag1;
			if(!((ActionBarPolicy) (view)).enableHomeButtonByDefault() && !flag)
	//*  68  145:aload_1         
	//*  69  146:invokevirtual   #260 <Method boolean ActionBarPolicy.enableHomeButtonByDefault()>
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
	//   81  168:invokevirtual   #263 <Method void setHomeButtonEnabled(boolean)>
			setHasEmbeddedTabs(((ActionBarPolicy) (view)).hasEmbeddedTabs());
	//   82  171:aload_0         
	//   83  172:aload_1         
	//   84  173:invokevirtual   #266 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//   85  176:invokespecial   #269 <Method void setHasEmbeddedTabs(boolean)>
			view = ((View) (mContext.obtainStyledAttributes(((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0)));
	//   86  179:aload_0         
	//   87  180:getfield        #244 <Field Context mContext>
	//   88  183:aconst_null     
	//   89  184:getstatic       #275 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//   90  187:getstatic       #280 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//   91  190:iconst_0        
	//   92  191:invokevirtual   #286 <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   93  194:astore_1        
			if(((TypedArray) (view)).getBoolean(android.support.v7.appcompat.R.styleable.ActionBar_hideOnContentScroll, false))
	//*  94  195:aload_1         
	//*  95  196:getstatic       #289 <Field int android.support.v7.appcompat.R$styleable.ActionBar_hideOnContentScroll>
	//*  96  199:iconst_0        
	//*  97  200:invokevirtual   #295 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  98  203:ifeq            211
				setHideOnContentScrollEnabled(true);
	//   99  206:aload_0         
	//  100  207:iconst_1        
	//  101  208:invokevirtual   #298 <Method void setHideOnContentScrollEnabled(boolean)>
			int i = ((TypedArray) (view)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_elevation, 0);
	//  102  211:aload_1         
	//  103  212:getstatic       #301 <Field int android.support.v7.appcompat.R$styleable.ActionBar_elevation>
	//  104  215:iconst_0        
	//  105  216:invokevirtual   #305 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  106  219:istore_2        
			if(i != 0)
	//* 107  220:iload_2         
	//* 108  221:ifeq            230
				setElevation(i);
	//  109  224:aload_0         
	//  110  225:iload_2         
	//  111  226:i2f             
	//  112  227:invokevirtual   #309 <Method void setElevation(float)>
			((TypedArray) (view)).recycle();
	//  113  230:aload_1         
	//  114  231:invokevirtual   #312 <Method void TypedArray.recycle()>
			return;
	//  115  234:return          
		} else
		{
			view = ((View) (new StringBuilder()));
	//  116  235:new             #165 <Class StringBuilder>
	//  117  238:dup             
	//  118  239:invokespecial   #166 <Method void StringBuilder()>
	//  119  242:astore_1        
			((StringBuilder) (view)).append(((Object)this).getClass().getSimpleName());
	//  120  243:aload_1         
	//  121  244:aload_0         
	//  122  245:invokevirtual   #178 <Method Class Object.getClass()>
	//  123  248:invokevirtual   #184 <Method String Class.getSimpleName()>
	//  124  251:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//  125  254:pop             
			((StringBuilder) (view)).append(" can only be used ");
	//  126  255:aload_1         
	//  127  256:ldc2            #314 <String " can only be used ">
	//  128  259:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//  129  262:pop             
			((StringBuilder) (view)).append("with a compatible window decor layout");
	//  130  263:aload_1         
	//  131  264:ldc2            #316 <String "with a compatible window decor layout">
	//  132  267:invokevirtual   #172 <Method StringBuilder StringBuilder.append(String)>
	//  133  270:pop             
			throw new IllegalStateException(((StringBuilder) (view)).toString());
	//  134  271:new             #188 <Class IllegalStateException>
	//  135  274:dup             
	//  136  275:aload_1         
	//  137  276:invokevirtual   #191 <Method String StringBuilder.toString()>
	//  138  279:invokespecial   #194 <Method void IllegalStateException(String)>
	//  139  282:athrow          
		}
	}

	private void setHasEmbeddedTabs(boolean flag)
	{
		mHasEmbeddedTabs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #318 <Field boolean mHasEmbeddedTabs>
		if(!mHasEmbeddedTabs)
	//*   3    5:aload_0         
	//*   4    6:getfield        #318 <Field boolean mHasEmbeddedTabs>
	//*   5    9:ifne            36
		{
			mDecorToolbar.setEmbeddedTabView(((ScrollingTabContainerView) (null)));
	//    6   12:aload_0         
	//    7   13:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    8   16:aconst_null     
	//    9   17:invokeinterface #322 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
			mContainerView.setTabContainer(mTabScrollView);
	//   10   22:aload_0         
	//   11   23:getfield        #238 <Field ActionBarContainer mContainerView>
	//   12   26:aload_0         
	//   13   27:getfield        #324 <Field ScrollingTabContainerView mTabScrollView>
	//   14   30:invokevirtual   #327 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
		} else
	//*  15   33:goto            57
		{
			mContainerView.setTabContainer(((ScrollingTabContainerView) (null)));
	//   16   36:aload_0         
	//   17   37:getfield        #238 <Field ActionBarContainer mContainerView>
	//   18   40:aconst_null     
	//   19   41:invokevirtual   #327 <Method void ActionBarContainer.setTabContainer(ScrollingTabContainerView)>
			mDecorToolbar.setEmbeddedTabView(mTabScrollView);
	//   20   44:aload_0         
	//   21   45:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//   22   48:aload_0         
	//   23   49:getfield        #324 <Field ScrollingTabContainerView mTabScrollView>
	//   24   52:invokeinterface #322 <Method void DecorToolbar.setEmbeddedTabView(ScrollingTabContainerView)>
		}
		int i = getNavigationMode();
	//   25   57:aload_0         
	//   26   58:invokevirtual   #330 <Method int getNavigationMode()>
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
	//   39   77:getfield        #324 <Field ScrollingTabContainerView mTabScrollView>
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
	//   47   94:invokevirtual   #336 <Method void ScrollingTabContainerView.setVisibility(int)>
				obj = ((Object) (mOverlayLayout));
	//   48   97:aload_0         
	//   49   98:getfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
	//   50  101:astore          4
				if(obj != null)
	//*  51  103:aload           4
	//*  52  105:ifnull          123
					ViewCompat.requestApplyInsets(((View) (obj)));
	//   53  108:aload           4
	//   54  110:invokestatic    #341 <Method void ViewCompat.requestApplyInsets(View)>
			} else
	//*  55  113:goto            123
			{
				((ScrollingTabContainerView) (obj)).setVisibility(8);
	//   56  116:aload           4
	//   57  118:bipush          8
	//   58  120:invokevirtual   #336 <Method void ScrollingTabContainerView.setVisibility(int)>
			}
		obj = ((Object) (mDecorToolbar));
	//   59  123:aload_0         
	//   60  124:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//   61  127:astore          4
		if(!mHasEmbeddedTabs && flag1)
	//*  62  129:aload_0         
	//*  63  130:getfield        #318 <Field boolean mHasEmbeddedTabs>
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
	//   74  150:invokeinterface #344 <Method void DecorToolbar.setCollapsible(boolean)>
		obj = ((Object) (mOverlayLayout));
	//   75  155:aload_0         
	//   76  156:getfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
	//   77  159:astore          4
		if(!mHasEmbeddedTabs && flag1)
	//*  78  161:aload_0         
	//*  79  162:getfield        #318 <Field boolean mHasEmbeddedTabs>
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
	//   90  182:invokevirtual   #347 <Method void ActionBarOverlayLayout.setHasNonEmbeddedTabs(boolean)>
	//   91  185:return          
	}

	private boolean shouldAnimateContextView()
	{
		return ViewCompat.isLaidOut(((View) (mContainerView)));
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field ActionBarContainer mContainerView>
	//    2    4:invokestatic    #352 <Method boolean ViewCompat.isLaidOut(View)>
	//    3    7:ireturn         
	}

	private void showForActionMode()
	{
		if(!mShowingForMode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #197 <Field boolean mShowingForMode>
	//*   2    4:ifne            31
		{
			mShowingForMode = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #197 <Field boolean mShowingForMode>
			ActionBarOverlayLayout actionbaroverlaylayout = mOverlayLayout;
	//    6   12:aload_0         
	//    7   13:getfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
	//    8   16:astore_1        
			if(actionbaroverlaylayout != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          26
				actionbaroverlaylayout.setShowingForActionMode(true);
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #205 <Method void ActionBarOverlayLayout.setShowingForActionMode(boolean)>
			updateVisibility(false);
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:invokespecial   #208 <Method void updateVisibility(boolean)>
		}
	//   17   31:return          
	}

	private void updateVisibility(boolean flag)
	{
		if(checkShowingFlags(mHiddenByApp, mHiddenBySystem, mShowingForMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #355 <Field boolean mHiddenByApp>
	//*   2    4:aload_0         
	//*   3    5:getfield        #357 <Field boolean mHiddenBySystem>
	//*   4    8:aload_0         
	//*   5    9:getfield        #197 <Field boolean mShowingForMode>
	//*   6   12:invokestatic    #359 <Method boolean checkShowingFlags(boolean, boolean, boolean)>
	//*   7   15:ifeq            36
		{
			if(!mNowShowing)
	//*   8   18:aload_0         
	//*   9   19:getfield        #107 <Field boolean mNowShowing>
	//*  10   22:ifne            53
			{
				mNowShowing = true;
	//   11   25:aload_0         
	//   12   26:iconst_1        
	//   13   27:putfield        #107 <Field boolean mNowShowing>
				doShow(flag);
	//   14   30:aload_0         
	//   15   31:iload_1         
	//   16   32:invokevirtual   #362 <Method void doShow(boolean)>
				return;
	//   17   35:return          
			}
		} else
		if(mNowShowing)
	//*  18   36:aload_0         
	//*  19   37:getfield        #107 <Field boolean mNowShowing>
	//*  20   40:ifeq            53
		{
			mNowShowing = false;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #107 <Field boolean mNowShowing>
			doHide(flag);
	//   24   48:aload_0         
	//   25   49:iload_1         
	//   26   50:invokevirtual   #365 <Method void doHide(boolean)>
		}
	//   27   53:return          
	}

	public void animateToMode(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			showForActionMode();
	//    2    4:aload_0         
	//    3    5:invokespecial   #368 <Method void showForActionMode()>
		else
	//*   4    8:goto            15
			hideForActionMode();
	//    5   11:aload_0         
	//    6   12:invokespecial   #370 <Method void hideForActionMode()>
		if(shouldAnimateContextView())
	//*   7   15:aload_0         
	//*   8   16:invokespecial   #372 <Method boolean shouldAnimateContextView()>
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
	//   13   27:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//   14   30:iconst_4        
	//   15   31:ldc2w           #373 <Long 100L>
	//   16   34:invokeinterface #378 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//   17   39:astore_3        
				viewpropertyanimatorcompat = mContextView.setupAnimatorToVisibility(0, 200L);
	//   18   40:aload_0         
	//   19   41:getfield        #231 <Field ActionBarContextView mContextView>
	//   20   44:iconst_0        
	//   21   45:ldc2w           #379 <Long 200L>
	//   22   48:invokevirtual   #381 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//   23   51:astore_2        
			} else
	//*  24   52:goto            82
			{
				viewpropertyanimatorcompat = mDecorToolbar.setupAnimatorToVisibility(0, 200L);
	//   25   55:aload_0         
	//   26   56:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//   27   59:iconst_0        
	//   28   60:ldc2w           #379 <Long 200L>
	//   29   63:invokeinterface #378 <Method ViewPropertyAnimatorCompat DecorToolbar.setupAnimatorToVisibility(int, long)>
	//   30   68:astore_2        
				viewpropertyanimatorcompat1 = mContextView.setupAnimatorToVisibility(8, 100L);
	//   31   69:aload_0         
	//   32   70:getfield        #231 <Field ActionBarContextView mContextView>
	//   33   73:bipush          8
	//   34   75:ldc2w           #373 <Long 100L>
	//   35   78:invokevirtual   #381 <Method ViewPropertyAnimatorCompat ActionBarContextView.setupAnimatorToVisibility(int, long)>
	//   36   81:astore_3        
			}
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = new ViewPropertyAnimatorCompatSet();
	//   37   82:new             #383 <Class ViewPropertyAnimatorCompatSet>
	//   38   85:dup             
	//   39   86:invokespecial   #384 <Method void ViewPropertyAnimatorCompatSet()>
	//   40   89:astore          4
			viewpropertyanimatorcompatset.playSequentially(viewpropertyanimatorcompat1, viewpropertyanimatorcompat);
	//   41   91:aload           4
	//   42   93:aload_3         
	//   43   94:aload_2         
	//   44   95:invokevirtual   #388 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.playSequentially(ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompat)>
	//   45   98:pop             
			viewpropertyanimatorcompatset.start();
	//   46   99:aload           4
	//   47  101:invokevirtual   #391 <Method void ViewPropertyAnimatorCompatSet.start()>
			return;
	//   48  104:return          
		}
		if(flag)
	//*  49  105:iload_1         
	//*  50  106:ifeq            128
		{
			mDecorToolbar.setVisibility(4);
	//   51  109:aload_0         
	//   52  110:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//   53  113:iconst_4        
	//   54  114:invokeinterface #392 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(0);
	//   55  119:aload_0         
	//   56  120:getfield        #231 <Field ActionBarContextView mContextView>
	//   57  123:iconst_0        
	//   58  124:invokevirtual   #393 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   59  127:return          
		} else
		{
			mDecorToolbar.setVisibility(0);
	//   60  128:aload_0         
	//   61  129:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//   62  132:iconst_0        
	//   63  133:invokeinterface #392 <Method void DecorToolbar.setVisibility(int)>
			mContextView.setVisibility(8);
	//   64  138:aload_0         
	//   65  139:getfield        #231 <Field ActionBarContextView mContextView>
	//   66  142:bipush          8
	//   67  144:invokevirtual   #393 <Method void ActionBarContextView.setVisibility(int)>
			return;
	//   68  147:return          
		}
	}

	public boolean collapseActionView()
	{
		DecorToolbar decortoolbar = mDecorToolbar;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:astore_1        
		if(decortoolbar != null && decortoolbar.hasExpandedActionView())
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #397 <Method boolean DecorToolbar.hasExpandedActionView()>
	//*   7   15:ifeq            29
		{
			mDecorToolbar.collapseActionView();
	//    8   18:aload_0         
	//    9   19:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//   10   22:invokeinterface #399 <Method void DecorToolbar.collapseActionView()>
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
	//    1    1:getfield        #402 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
	//    2    4:astore_1        
		if(callback != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
		{
			callback.onDestroyActionMode(mDeferredDestroyActionMode);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #404 <Field ActionMode mDeferredDestroyActionMode>
	//    8   14:invokeinterface #410 <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
			mDeferredDestroyActionMode = null;
	//    9   19:aload_0         
	//   10   20:aconst_null     
	//   11   21:putfield        #404 <Field ActionMode mDeferredDestroyActionMode>
			mDeferredModeDestroyCallback = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #402 <Field android.support.v7.view.ActionMode$Callback mDeferredModeDestroyCallback>
		}
	//   15   29:return          
	}

	public void dispatchMenuVisibilityChanged(boolean flag)
	{
		if(flag == mLastMenuVisibility)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #413 <Field boolean mLastMenuVisibility>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mLastMenuVisibility = flag;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #413 <Field boolean mLastMenuVisibility>
		int j = mMenuVisibilityListeners.size();
	//    8   14:aload_0         
	//    9   15:getfield        #101 <Field ArrayList mMenuVisibilityListeners>
	//   10   18:invokevirtual   #416 <Method int ArrayList.size()>
	//   11   21:istore_3        
		for(int i = 0; i < j; i++)
	//*  12   22:iconst_0        
	//*  13   23:istore_2        
	//*  14   24:iload_2         
	//*  15   25:iload_3         
	//*  16   26:icmpge          53
			((ActionBar.OnMenuVisibilityListener)mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(flag);
	//   17   29:aload_0         
	//   18   30:getfield        #101 <Field ArrayList mMenuVisibilityListeners>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #419 <Method Object ArrayList.get(int)>
	//   21   37:checkcast       #421 <Class ActionBar$OnMenuVisibilityListener>
	//   22   40:iload_1         
	//   23   41:invokeinterface #424 <Method void ActionBar$OnMenuVisibilityListener.onMenuVisibilityChanged(boolean)>

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
	//    1    1:getfield        #426 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    2    4:astore          4
		if(viewpropertyanimatorcompatset != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          16
			viewpropertyanimatorcompatset.cancel();
	//    5   11:aload           4
	//    6   13:invokevirtual   #429 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		if(mCurWindowVisibility == 0 && (mShowHideAnimationEnabled || flag))
	//*   7   16:aload_0         
	//*   8   17:getfield        #103 <Field int mCurWindowVisibility>
	//*   9   20:ifne            212
	//*  10   23:aload_0         
	//*  11   24:getfield        #431 <Field boolean mShowHideAnimationEnabled>
	//*  12   27:ifne            34
	//*  13   30:iload_1         
	//*  14   31:ifeq            212
		{
			mContainerView.setAlpha(1.0F);
	//   15   34:aload_0         
	//   16   35:getfield        #238 <Field ActionBarContainer mContainerView>
	//   17   38:fconst_1        
	//   18   39:invokevirtual   #434 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTransitioning(true);
	//   19   42:aload_0         
	//   20   43:getfield        #238 <Field ActionBarContainer mContainerView>
	//   21   46:iconst_1        
	//   22   47:invokevirtual   #437 <Method void ActionBarContainer.setTransitioning(boolean)>
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset1 = new ViewPropertyAnimatorCompatSet();
	//   23   50:new             #383 <Class ViewPropertyAnimatorCompatSet>
	//   24   53:dup             
	//   25   54:invokespecial   #384 <Method void ViewPropertyAnimatorCompatSet()>
	//   26   57:astore          4
			float f1 = -mContainerView.getHeight();
	//   27   59:aload_0         
	//   28   60:getfield        #238 <Field ActionBarContainer mContainerView>
	//   29   63:invokevirtual   #440 <Method int ActionBarContainer.getHeight()>
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
	//   51   92:getfield        #238 <Field ActionBarContainer mContainerView>
	//   52   95:aload           5
	//   53   97:invokevirtual   #444 <Method void ActionBarContainer.getLocationInWindow(int[])>
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
	//   62  109:getfield        #238 <Field ActionBarContainer mContainerView>
	//   63  112:invokestatic    #448 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   64  115:fload_2         
	//   65  116:invokevirtual   #454 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   66  119:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   67  121:aload           5
	//   68  123:aload_0         
	//   69  124:getfield        #118 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   70  127:invokevirtual   #458 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   71  130:pop             
			viewpropertyanimatorcompatset1.play(viewpropertyanimatorcompat);
	//   72  131:aload           4
	//   73  133:aload           5
	//   74  135:invokevirtual   #462 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   75  138:pop             
			if(mContentAnimations)
	//*  76  139:aload_0         
	//*  77  140:getfield        #105 <Field boolean mContentAnimations>
	//*  78  143:ifeq            172
			{
				View view = mContentView;
	//   79  146:aload_0         
	//   80  147:getfield        #145 <Field View mContentView>
	//   81  150:astore          5
				if(view != null)
	//*  82  152:aload           5
	//*  83  154:ifnull          172
					viewpropertyanimatorcompatset1.play(ViewCompat.animate(view).translationY(f));
	//   84  157:aload           4
	//   85  159:aload           5
	//   86  161:invokestatic    #448 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   87  164:fload_2         
	//   88  165:invokevirtual   #454 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   89  168:invokevirtual   #462 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   90  171:pop             
			}
			viewpropertyanimatorcompatset1.setInterpolator(sHideInterpolator);
	//   91  172:aload           4
	//   92  174:getstatic       #84  <Field Interpolator sHideInterpolator>
	//   93  177:invokevirtual   #466 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//   94  180:pop             
			viewpropertyanimatorcompatset1.setDuration(250L);
	//   95  181:aload           4
	//   96  183:ldc2w           #467 <Long 250L>
	//   97  186:invokevirtual   #472 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//   98  189:pop             
			viewpropertyanimatorcompatset1.setListener(mHideListener);
	//   99  190:aload           4
	//  100  192:aload_0         
	//  101  193:getfield        #112 <Field ViewPropertyAnimatorListener mHideListener>
	//  102  196:invokevirtual   #476 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  103  199:pop             
			mCurrentShowAnim = viewpropertyanimatorcompatset1;
	//  104  200:aload_0         
	//  105  201:aload           4
	//  106  203:putfield        #426 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			viewpropertyanimatorcompatset1.start();
	//  107  206:aload           4
	//  108  208:invokevirtual   #391 <Method void ViewPropertyAnimatorCompatSet.start()>
			return;
	//  109  211:return          
		} else
		{
			mHideListener.onAnimationEnd(((View) (null)));
	//  110  212:aload_0         
	//  111  213:getfield        #112 <Field ViewPropertyAnimatorListener mHideListener>
	//  112  216:aconst_null     
	//  113  217:invokeinterface #481 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
			return;
	//  114  222:return          
		}
	}

	public void doShow(boolean flag)
	{
		Object obj = ((Object) (mCurrentShowAnim));
	//    0    0:aload_0         
	//    1    1:getfield        #426 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    2    4:astore          4
		if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          16
			((ViewPropertyAnimatorCompatSet) (obj)).cancel();
	//    5   11:aload           4
	//    6   13:invokevirtual   #429 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		mContainerView.setVisibility(0);
	//    7   16:aload_0         
	//    8   17:getfield        #238 <Field ActionBarContainer mContainerView>
	//    9   20:iconst_0        
	//   10   21:invokevirtual   #482 <Method void ActionBarContainer.setVisibility(int)>
		if(mCurWindowVisibility == 0 && (mShowHideAnimationEnabled || flag))
	//*  11   24:aload_0         
	//*  12   25:getfield        #103 <Field int mCurWindowVisibility>
	//*  13   28:ifne            230
	//*  14   31:aload_0         
	//*  15   32:getfield        #431 <Field boolean mShowHideAnimationEnabled>
	//*  16   35:ifne            42
	//*  17   38:iload_1         
	//*  18   39:ifeq            230
		{
			mContainerView.setTranslationY(0.0F);
	//   19   42:aload_0         
	//   20   43:getfield        #238 <Field ActionBarContainer mContainerView>
	//   21   46:fconst_0        
	//   22   47:invokevirtual   #485 <Method void ActionBarContainer.setTranslationY(float)>
			float f1 = -mContainerView.getHeight();
	//   23   50:aload_0         
	//   24   51:getfield        #238 <Field ActionBarContainer mContainerView>
	//   25   54:invokevirtual   #440 <Method int ActionBarContainer.getHeight()>
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
	//   47   83:getfield        #238 <Field ActionBarContainer mContainerView>
	//   48   86:aload           4
	//   49   88:invokevirtual   #444 <Method void ActionBarContainer.getLocationInWindow(int[])>
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
	//   58  100:getfield        #238 <Field ActionBarContainer mContainerView>
	//   59  103:fload_2         
	//   60  104:invokevirtual   #485 <Method void ActionBarContainer.setTranslationY(float)>
			ai = ((int []) (new ViewPropertyAnimatorCompatSet()));
	//   61  107:new             #383 <Class ViewPropertyAnimatorCompatSet>
	//   62  110:dup             
	//   63  111:invokespecial   #384 <Method void ViewPropertyAnimatorCompatSet()>
	//   64  114:astore          4
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mContainerView))).translationY(0.0F);
	//   65  116:aload_0         
	//   66  117:getfield        #238 <Field ActionBarContainer mContainerView>
	//   67  120:invokestatic    #448 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   68  123:fconst_0        
	//   69  124:invokevirtual   #454 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   70  127:astore          5
			viewpropertyanimatorcompat.setUpdateListener(mUpdateListener);
	//   71  129:aload           5
	//   72  131:aload_0         
	//   73  132:getfield        #118 <Field ViewPropertyAnimatorUpdateListener mUpdateListener>
	//   74  135:invokevirtual   #458 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setUpdateListener(ViewPropertyAnimatorUpdateListener)>
	//   75  138:pop             
			((ViewPropertyAnimatorCompatSet) (ai)).play(viewpropertyanimatorcompat);
	//   76  139:aload           4
	//   77  141:aload           5
	//   78  143:invokevirtual   #462 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   79  146:pop             
			if(mContentAnimations)
	//*  80  147:aload_0         
	//*  81  148:getfield        #105 <Field boolean mContentAnimations>
	//*  82  151:ifeq            188
			{
				View view = mContentView;
	//   83  154:aload_0         
	//   84  155:getfield        #145 <Field View mContentView>
	//   85  158:astore          5
				if(view != null)
	//*  86  160:aload           5
	//*  87  162:ifnull          188
				{
					view.setTranslationY(f);
	//   88  165:aload           5
	//   89  167:fload_2         
	//   90  168:invokevirtual   #486 <Method void View.setTranslationY(float)>
					((ViewPropertyAnimatorCompatSet) (ai)).play(ViewCompat.animate(mContentView).translationY(0.0F));
	//   91  171:aload           4
	//   92  173:aload_0         
	//   93  174:getfield        #145 <Field View mContentView>
	//   94  177:invokestatic    #448 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   95  180:fconst_0        
	//   96  181:invokevirtual   #454 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.translationY(float)>
	//   97  184:invokevirtual   #462 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.play(ViewPropertyAnimatorCompat)>
	//   98  187:pop             
				}
			}
			((ViewPropertyAnimatorCompatSet) (ai)).setInterpolator(sShowInterpolator);
	//   99  188:aload           4
	//  100  190:getstatic       #89  <Field Interpolator sShowInterpolator>
	//  101  193:invokevirtual   #466 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setInterpolator(Interpolator)>
	//  102  196:pop             
			((ViewPropertyAnimatorCompatSet) (ai)).setDuration(250L);
	//  103  197:aload           4
	//  104  199:ldc2w           #467 <Long 250L>
	//  105  202:invokevirtual   #472 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setDuration(long)>
	//  106  205:pop             
			((ViewPropertyAnimatorCompatSet) (ai)).setListener(mShowListener);
	//  107  206:aload           4
	//  108  208:aload_0         
	//  109  209:getfield        #115 <Field ViewPropertyAnimatorListener mShowListener>
	//  110  212:invokevirtual   #476 <Method ViewPropertyAnimatorCompatSet ViewPropertyAnimatorCompatSet.setListener(ViewPropertyAnimatorListener)>
	//  111  215:pop             
			mCurrentShowAnim = ((ViewPropertyAnimatorCompatSet) (ai));
	//  112  216:aload_0         
	//  113  217:aload           4
	//  114  219:putfield        #426 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
			((ViewPropertyAnimatorCompatSet) (ai)).start();
	//  115  222:aload           4
	//  116  224:invokevirtual   #391 <Method void ViewPropertyAnimatorCompatSet.start()>
		} else
	//* 117  227:goto            280
		{
			mContainerView.setAlpha(1.0F);
	//  118  230:aload_0         
	//  119  231:getfield        #238 <Field ActionBarContainer mContainerView>
	//  120  234:fconst_1        
	//  121  235:invokevirtual   #434 <Method void ActionBarContainer.setAlpha(float)>
			mContainerView.setTranslationY(0.0F);
	//  122  238:aload_0         
	//  123  239:getfield        #238 <Field ActionBarContainer mContainerView>
	//  124  242:fconst_0        
	//  125  243:invokevirtual   #485 <Method void ActionBarContainer.setTranslationY(float)>
			if(mContentAnimations)
	//* 126  246:aload_0         
	//* 127  247:getfield        #105 <Field boolean mContentAnimations>
	//* 128  250:ifeq            270
			{
				ai = ((int []) (mContentView));
	//  129  253:aload_0         
	//  130  254:getfield        #145 <Field View mContentView>
	//  131  257:astore          4
				if(ai != null)
	//* 132  259:aload           4
	//* 133  261:ifnull          270
					((View) (ai)).setTranslationY(0.0F);
	//  134  264:aload           4
	//  135  266:fconst_0        
	//  136  267:invokevirtual   #486 <Method void View.setTranslationY(float)>
			}
			mShowListener.onAnimationEnd(((View) (null)));
	//  137  270:aload_0         
	//  138  271:getfield        #115 <Field ViewPropertyAnimatorListener mShowListener>
	//  139  274:aconst_null     
	//  140  275:invokeinterface #481 <Method void ViewPropertyAnimatorListener.onAnimationEnd(View)>
		}
		ai = ((int []) (mOverlayLayout));
	//  141  280:aload_0         
	//  142  281:getfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
	//  143  284:astore          4
		if(ai != null)
	//* 144  286:aload           4
	//* 145  288:ifnull          296
			ViewCompat.requestApplyInsets(((View) (ai)));
	//  146  291:aload           4
	//  147  293:invokestatic    #341 <Method void ViewCompat.requestApplyInsets(View)>
	//  148  296:return          
	}

	public void enableContentAnimations(boolean flag)
	{
		mContentAnimations = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #105 <Field boolean mContentAnimations>
	//    3    5:return          
	}

	public int getDisplayOptions()
	{
		return mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #248 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:ireturn         
	}

	public int getNavigationMode()
	{
		return mDecorToolbar.getNavigationMode();
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #488 <Method int DecorToolbar.getNavigationMode()>
	//    3    9:ireturn         
	}

	public Context getThemedContext()
	{
		if(mThemedContext == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #491 <Field Context mThemedContext>
	//*   2    4:ifnonnull       67
		{
			TypedValue typedvalue = new TypedValue();
	//    3    7:new             #493 <Class TypedValue>
	//    4   10:dup             
	//    5   11:invokespecial   #494 <Method void TypedValue()>
	//    6   14:astore_2        
			mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//    7   15:aload_0         
	//    8   16:getfield        #244 <Field Context mContext>
	//    9   19:invokevirtual   #498 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   22:getstatic       #501 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   11   25:aload_2         
	//   12   26:iconst_1        
	//   13   27:invokevirtual   #507 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   30:pop             
			int i = typedvalue.resourceId;
	//   15   31:aload_2         
	//   16   32:getfield        #510 <Field int TypedValue.resourceId>
	//   17   35:istore_1        
			if(i != 0)
	//*  18   36:iload_1         
	//*  19   37:ifeq            59
				mThemedContext = ((Context) (new ContextThemeWrapper(mContext, i)));
	//   20   40:aload_0         
	//   21   41:new             #512 <Class ContextThemeWrapper>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #244 <Field Context mContext>
	//   25   49:iload_1         
	//   26   50:invokespecial   #515 <Method void ContextThemeWrapper(Context, int)>
	//   27   53:putfield        #491 <Field Context mThemedContext>
			else
	//*  28   56:goto            67
				mThemedContext = mContext;
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #244 <Field Context mContext>
	//   32   64:putfield        #491 <Field Context mThemedContext>
		}
		return mThemedContext;
	//   33   67:aload_0         
	//   34   68:getfield        #491 <Field Context mThemedContext>
	//   35   71:areturn         
	}

	public void hideForSystem()
	{
		if(!mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #357 <Field boolean mHiddenBySystem>
	//*   2    4:ifne            17
		{
			mHiddenBySystem = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #357 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #208 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		setHasEmbeddedTabs(ActionBarPolicy.get(mContext).hasEmbeddedTabs());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #244 <Field Context mContext>
	//    3    5:invokestatic    #256 <Method ActionBarPolicy ActionBarPolicy.get(Context)>
	//    4    8:invokevirtual   #266 <Method boolean ActionBarPolicy.hasEmbeddedTabs()>
	//    5   11:invokespecial   #269 <Method void setHasEmbeddedTabs(boolean)>
	//    6   14:return          
	}

	public void onContentScrollStarted()
	{
		ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = mCurrentShowAnim;
	//    0    0:aload_0         
	//    1    1:getfield        #426 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    2    4:astore_1        
		if(viewpropertyanimatorcompatset != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			viewpropertyanimatorcompatset.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #429 <Method void ViewPropertyAnimatorCompatSet.cancel()>
			mCurrentShowAnim = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #426 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
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
	//    1    1:getfield        #524 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//    2    4:astore          5
		if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		obj = ((Object) (((ActionModeImpl) (obj)).getMenu()));
	//    7   13:aload           5
	//    8   15:invokevirtual   #528 <Method Menu WindowDecorActionBar$ActionModeImpl.getMenu()>
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
	//   15   30:invokevirtual   #533 <Method int KeyEvent.getDeviceId()>
	//   16   33:istore_3        
			else
	//*  17   34:goto            39
				j = -1;
	//   18   37:iconst_m1       
	//   19   38:istore_3        
			j = KeyCharacterMap.load(j).getKeyboardType();
	//   20   39:iload_3         
	//   21   40:invokestatic    #539 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//   22   43:invokevirtual   #542 <Method int KeyCharacterMap.getKeyboardType()>
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
	//   34   65:invokeinterface #547 <Method void Menu.setQwertyMode(boolean)>
			return ((Menu) (obj)).performShortcut(i, keyevent, 0);
	//   35   70:aload           5
	//   36   72:iload_1         
	//   37   73:aload_2         
	//   38   74:iconst_0        
	//   39   75:invokeinterface #551 <Method boolean Menu.performShortcut(int, KeyEvent, int)>
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
	//    2    2:putfield        #103 <Field int mCurWindowVisibility>
	//    3    5:return          
	}

	public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
	{
		if(!mDisplayHomeAsUpSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #250 <Field boolean mDisplayHomeAsUpSet>
	//*   2    4:ifne            12
			setDisplayHomeAsUpEnabled(flag);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:invokevirtual   #556 <Method void setDisplayHomeAsUpEnabled(boolean)>
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
	//   10   14:invokevirtual   #560 <Method void setDisplayOptions(int, int)>
	//   11   17:return          
	}

	public void setDisplayOptions(int i, int j)
	{
		int k = mDecorToolbar.getDisplayOptions();
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:invokeinterface #248 <Method int DecorToolbar.getDisplayOptions()>
	//    3    9:istore_3        
		if((j & 4) != 0)
	//*   4   10:iload_2         
	//*   5   11:iconst_4        
	//*   6   12:iand            
	//*   7   13:ifeq            21
			mDisplayHomeAsUpSet = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #250 <Field boolean mDisplayHomeAsUpSet>
		mDecorToolbar.setDisplayOptions(i & j | j & k);
	//   11   21:aload_0         
	//   12   22:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:iand            
	//   16   28:iload_2         
	//   17   29:iload_3         
	//   18   30:iand            
	//   19   31:ior             
	//   20   32:invokeinterface #562 <Method void DecorToolbar.setDisplayOptions(int)>
	//   21   37:return          
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
	//   10   14:invokevirtual   #560 <Method void setDisplayOptions(int, int)>
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
	//   10   16:invokevirtual   #560 <Method void setDisplayOptions(int, int)>
	//   11   19:return          
	}

	public void setDisplayUseLogoEnabled(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #567 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #569 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #572 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void setElevation(float f)
	{
		ViewCompat.setElevation(((View) (mContainerView)), f);
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field ActionBarContainer mContainerView>
	//    2    4:fload_1         
	//    3    5:invokestatic    #575 <Method void ViewCompat.setElevation(View, float)>
	//    4    8:return          
	}

	public void setHideOnContentScrollEnabled(boolean flag)
	{
		if(flag && !mOverlayLayout.isInOverlayMode())
	//*   0    0:iload_1         
	//*   1    1:ifeq            28
	//*   2    4:aload_0         
	//*   3    5:getfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
	//*   4    8:invokevirtual   #578 <Method boolean ActionBarOverlayLayout.isInOverlayMode()>
	//*   5   11:ifeq            17
	//*   6   14:goto            28
		{
			throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
	//    7   17:new             #188 <Class IllegalStateException>
	//    8   20:dup             
	//    9   21:ldc2            #580 <String "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll">
	//   10   24:invokespecial   #194 <Method void IllegalStateException(String)>
	//   11   27:athrow          
		} else
		{
			mHideOnContentScroll = flag;
	//   12   28:aload_0         
	//   13   29:iload_1         
	//   14   30:putfield        #582 <Field boolean mHideOnContentScroll>
			mOverlayLayout.setHideOnContentScrollEnabled(flag);
	//   15   33:aload_0         
	//   16   34:getfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
	//   17   37:iload_1         
	//   18   38:invokevirtual   #583 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
			return;
	//   19   41:return          
		}
	}

	public void setHomeActionContentDescription(int i)
	{
		mDecorToolbar.setNavigationContentDescription(i);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #587 <Method void DecorToolbar.setNavigationContentDescription(int)>
	//    4   10:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
		mDecorToolbar.setNavigationIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #592 <Method void DecorToolbar.setNavigationIcon(Drawable)>
	//    4   10:return          
	}

	public void setHomeButtonEnabled(boolean flag)
	{
		mDecorToolbar.setHomeButtonEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #593 <Method void DecorToolbar.setHomeButtonEnabled(boolean)>
	//    4   10:return          
	}

	public void setLogo(int i)
	{
		mDecorToolbar.setLogo(i);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:iload_1         
	//    3    5:invokeinterface #596 <Method void DecorToolbar.setLogo(int)>
	//    4   10:return          
	}

	public void setLogo(Drawable drawable)
	{
		mDecorToolbar.setLogo(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #598 <Method void DecorToolbar.setLogo(Drawable)>
	//    4   10:return          
	}

	public void setShowHideAnimationEnabled(boolean flag)
	{
		mShowHideAnimationEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #431 <Field boolean mShowHideAnimationEnabled>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            22
		{
			ViewPropertyAnimatorCompatSet viewpropertyanimatorcompatset = mCurrentShowAnim;
	//    5    9:aload_0         
	//    6   10:getfield        #426 <Field ViewPropertyAnimatorCompatSet mCurrentShowAnim>
	//    7   13:astore_2        
			if(viewpropertyanimatorcompatset != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          22
				viewpropertyanimatorcompatset.cancel();
	//   10   18:aload_2         
	//   11   19:invokevirtual   #429 <Method void ViewPropertyAnimatorCompatSet.cancel()>
		}
	//   12   22:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mDecorToolbar.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #603 <Method void DecorToolbar.setSubtitle(CharSequence)>
	//    4   10:return          
	}

	public void setTitle(int i)
	{
		setTitle(((CharSequence) (mContext.getString(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #244 <Field Context mContext>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #608 <Method String Context.getString(int)>
	//    5    9:invokevirtual   #610 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mDecorToolbar.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #611 <Method void DecorToolbar.setTitle(CharSequence)>
	//    4   10:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		mDecorToolbar.setWindowTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field DecorToolbar mDecorToolbar>
	//    2    4:aload_1         
	//    3    5:invokeinterface #614 <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//    4   10:return          
	}

	public void showForSystem()
	{
		if(mHiddenBySystem)
	//*   0    0:aload_0         
	//*   1    1:getfield        #357 <Field boolean mHiddenBySystem>
	//*   2    4:ifeq            17
		{
			mHiddenBySystem = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #357 <Field boolean mHiddenBySystem>
			updateVisibility(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #208 <Method void updateVisibility(boolean)>
		}
	//    9   17:return          
	}

	public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		ActionModeImpl actionmodeimpl = mActionMode;
	//    0    0:aload_0         
	//    1    1:getfield        #524 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
	//    2    4:astore_2        
		if(actionmodeimpl != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          13
			actionmodeimpl.finish();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #620 <Method void WindowDecorActionBar$ActionModeImpl.finish()>
		mOverlayLayout.setHideOnContentScrollEnabled(false);
	//    7   13:aload_0         
	//    8   14:getfield        #199 <Field ActionBarOverlayLayout mOverlayLayout>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #583 <Method void ActionBarOverlayLayout.setHideOnContentScrollEnabled(boolean)>
		mContextView.killMode();
	//   11   21:aload_0         
	//   12   22:getfield        #231 <Field ActionBarContextView mContextView>
	//   13   25:invokevirtual   #623 <Method void ActionBarContextView.killMode()>
		callback = ((android.support.v7.view.ActionMode.Callback) (new ActionModeImpl(mContextView.getContext(), callback)));
	//   14   28:new             #14  <Class WindowDecorActionBar$ActionModeImpl>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #231 <Field ActionBarContextView mContextView>
	//   19   37:invokevirtual   #624 <Method Context ActionBarContextView.getContext()>
	//   20   40:aload_1         
	//   21   41:invokespecial   #627 <Method void WindowDecorActionBar$ActionModeImpl(WindowDecorActionBar, Context, android.support.v7.view.ActionMode$Callback)>
	//   22   44:astore_1        
		if(((ActionModeImpl) (callback)).dispatchOnCreate())
	//*  23   45:aload_1         
	//*  24   46:invokevirtual   #630 <Method boolean WindowDecorActionBar$ActionModeImpl.dispatchOnCreate()>
	//*  25   49:ifeq            85
		{
			mActionMode = ((ActionModeImpl) (callback));
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #524 <Field WindowDecorActionBar$ActionModeImpl mActionMode>
			((ActionModeImpl) (callback)).invalidate();
	//   29   57:aload_1         
	//   30   58:invokevirtual   #633 <Method void WindowDecorActionBar$ActionModeImpl.invalidate()>
			mContextView.initForMode(((ActionMode) (callback)));
	//   31   61:aload_0         
	//   32   62:getfield        #231 <Field ActionBarContextView mContextView>
	//   33   65:aload_1         
	//   34   66:invokevirtual   #636 <Method void ActionBarContextView.initForMode(ActionMode)>
			animateToMode(true);
	//   35   69:aload_0         
	//   36   70:iconst_1        
	//   37   71:invokevirtual   #638 <Method void animateToMode(boolean)>
			mContextView.sendAccessibilityEvent(32);
	//   38   74:aload_0         
	//   39   75:getfield        #231 <Field ActionBarContextView mContextView>
	//   40   78:bipush          32
	//   41   80:invokevirtual   #641 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
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
	private boolean mShowHideAnimationEnabled;
	final ViewPropertyAnimatorListener mShowListener;
	private boolean mShowingForMode;
	ScrollingTabContainerView mTabScrollView;
	private ArrayList mTabs;
	private Context mThemedContext;
	final ViewPropertyAnimatorUpdateListener mUpdateListener;

	static 
	{
	//    0    0:new             #79  <Class AccelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #82  <Method void AccelerateInterpolator()>
	//    3    7:putstatic       #84  <Field Interpolator sHideInterpolator>
	//    4   10:new             #86  <Class DecelerateInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #87  <Method void DecelerateInterpolator()>
	//    7   17:putstatic       #89  <Field Interpolator sShowInterpolator>
	//*   8   20:return          
	}
}
