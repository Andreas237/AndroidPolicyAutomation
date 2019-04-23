// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.NavUtils;
import android.support.v4.view.KeyEventDispatcher;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.view.StandaloneActionMode;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup;
import android.support.v7.widget.TintTypedArray;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.support.v7.widget.ViewStubCompat;
import android.support.v7.widget.ViewUtils;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegate, TwilightManager, ActionBar, WindowDecorActionBar, 
//			ToolbarActionBar, ResourcesFlusher, AppCompatViewInflater, AppCompatDialog, 
//			AppCompatCallback

class AppCompatDelegateImpl extends AppCompatDelegate
	implements android.support.v7.view.menu.MenuBuilder.Callback, android.view.LayoutInflater.Factory2
{
	private class ActionBarDrawableToggleImpl
		implements ActionBarDrawerToggle.Delegate
	{

		public Context getActionBarThemedContext()
		{
			return AppCompatDelegateImpl.this.getActionBarThemedContext();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//    2    4:invokevirtual   #23  <Method Context AppCompatDelegateImpl.getActionBarThemedContext()>
		//    3    7:areturn         
		}

		public Drawable getThemeUpIndicator()
		{
			TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), ((AttributeSet) (null)), new int[] {
				android.support.v7.appcompat.R.attr.homeAsUpIndicator
			});
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Context getActionBarThemedContext()>
		//    2    4:aconst_null     
		//    3    5:iconst_1        
		//    4    6:newarray        int[]
		//    5    8:dup             
		//    6    9:iconst_0        
		//    7   10:getstatic       #32  <Field int android.support.v7.appcompat.R$attr.homeAsUpIndicator>
		//    8   13:iastore         
		//    9   14:invokestatic    #38  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[])>
		//   10   17:astore_1        
			Drawable drawable = tinttypedarray.getDrawable(0);
		//   11   18:aload_1         
		//   12   19:iconst_0        
		//   13   20:invokevirtual   #42  <Method Drawable TintTypedArray.getDrawable(int)>
		//   14   23:astore_2        
			tinttypedarray.recycle();
		//   15   24:aload_1         
		//   16   25:invokevirtual   #45  <Method void TintTypedArray.recycle()>
			return drawable;
		//   17   28:aload_2         
		//   18   29:areturn         
		}

		public boolean isNavigationVisible()
		{
			ActionBar actionbar = getSupportActionBar();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//    2    4:invokevirtual   #51  <Method ActionBar AppCompatDelegateImpl.getSupportActionBar()>
		//    3    7:astore_1        
			return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
		//    4    8:aload_1         
		//    5    9:ifnull          23
		//    6   12:aload_1         
		//    7   13:invokevirtual   #57  <Method int ActionBar.getDisplayOptions()>
		//    8   16:iconst_4        
		//    9   17:iand            
		//   10   18:ifeq            23
		//   11   21:iconst_1        
		//   12   22:ireturn         
		//   13   23:iconst_0        
		//   14   24:ireturn         
		}

		public void setActionBarDescription(int i)
		{
			ActionBar actionbar = getSupportActionBar();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//    2    4:invokevirtual   #51  <Method ActionBar AppCompatDelegateImpl.getSupportActionBar()>
		//    3    7:astore_2        
			if(actionbar != null)
		//*   4    8:aload_2         
		//*   5    9:ifnull          17
				actionbar.setHomeActionContentDescription(i);
		//    6   12:aload_2         
		//    7   13:iload_1         
		//    8   14:invokevirtual   #62  <Method void ActionBar.setHomeActionContentDescription(int)>
		//    9   17:return          
		}

		public void setActionBarUpIndicator(Drawable drawable, int i)
		{
			ActionBar actionbar = getSupportActionBar();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//    2    4:invokevirtual   #51  <Method ActionBar AppCompatDelegateImpl.getSupportActionBar()>
		//    3    7:astore_3        
			if(actionbar != null)
		//*   4    8:aload_3         
		//*   5    9:ifnull          22
			{
				actionbar.setHomeAsUpIndicator(drawable);
		//    6   12:aload_3         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #68  <Method void ActionBar.setHomeAsUpIndicator(Drawable)>
				actionbar.setHomeActionContentDescription(i);
		//    9   17:aload_3         
		//   10   18:iload_2         
		//   11   19:invokevirtual   #62  <Method void ActionBar.setHomeActionContentDescription(int)>
			}
		//   12   22:return          
		}

		final AppCompatDelegateImpl this$0;

		ActionBarDrawableToggleImpl()
		{
			this$0 = AppCompatDelegateImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field AppCompatDelegateImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	private final class ActionMenuPresenterCallback
		implements android.support.v7.view.menu.MenuPresenter.Callback
	{

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
			checkCloseActionMenu(menubuilder);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #25  <Method void AppCompatDelegateImpl.checkCloseActionMenu(MenuBuilder)>
		//    4    8:return          
		}

		public boolean onOpenSubMenu(MenuBuilder menubuilder)
		{
			android.view.Window.Callback callback = getWindowCallback();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//    2    4:invokevirtual   #31  <Method android.view.Window$Callback AppCompatDelegateImpl.getWindowCallback()>
		//    3    7:astore_2        
			if(callback != null)
		//*   4    8:aload_2         
		//*   5    9:ifnull          22
				callback.onMenuOpened(108, ((Menu) (menubuilder)));
		//    6   12:aload_2         
		//    7   13:bipush          108
		//    8   15:aload_1         
		//    9   16:invokeinterface #37  <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
		//   10   21:pop             
			return true;
		//   11   22:iconst_1        
		//   12   23:ireturn         
		}

		final AppCompatDelegateImpl this$0;

		ActionMenuPresenterCallback()
		{
			this$0 = AppCompatDelegateImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field AppCompatDelegateImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	class ActionModeCallbackWrapperV9
		implements android.support.v7.view.ActionMode.Callback
	{

		public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
		{
			return mWrapped.onActionItemClicked(actionmode, menuitem);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mWrapped>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #29  <Method boolean android.support.v7.view.ActionMode$Callback.onActionItemClicked(ActionMode, MenuItem)>
		//    5   11:ireturn         
		}

		public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
		{
			return mWrapped.onCreateActionMode(actionmode, menu);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mWrapped>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #33  <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
		//    5   11:ireturn         
		}

		public void onDestroyActionMode(ActionMode actionmode)
		{
			mWrapped.onDestroyActionMode(actionmode);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mWrapped>
		//    2    4:aload_1         
		//    3    5:invokeinterface #37  <Method void android.support.v7.view.ActionMode$Callback.onDestroyActionMode(ActionMode)>
			if(mActionModePopup != null)
		//*   4   10:aload_0         
		//*   5   11:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//*   6   14:getfield        #41  <Field PopupWindow AppCompatDelegateImpl.mActionModePopup>
		//*   7   17:ifnull          41
				mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
		//    8   20:aload_0         
		//    9   21:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//   10   24:getfield        #45  <Field Window AppCompatDelegateImpl.mWindow>
		//   11   27:invokevirtual   #51  <Method View Window.getDecorView()>
		//   12   30:aload_0         
		//   13   31:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//   14   34:getfield        #55  <Field Runnable AppCompatDelegateImpl.mShowActionModePopup>
		//   15   37:invokevirtual   #61  <Method boolean View.removeCallbacks(Runnable)>
		//   16   40:pop             
			if(mActionModeView != null)
		//*  17   41:aload_0         
		//*  18   42:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//*  19   45:getfield        #65  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
		//*  20   48:ifnull          97
			{
				endOnGoingFadeAnimation();
		//   21   51:aload_0         
		//   22   52:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//   23   55:invokevirtual   #68  <Method void AppCompatDelegateImpl.endOnGoingFadeAnimation()>
				actionmode = ((ActionMode) (AppCompatDelegateImpl.this));
		//   24   58:aload_0         
		//   25   59:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//   26   62:astore_1        
				actionmode.mFadeAnim = ViewCompat.animate(((View) (((AppCompatDelegateImpl) (actionmode)).mActionModeView))).alpha(0.0F);
		//   27   63:aload_1         
		//   28   64:aload_1         
		//   29   65:getfield        #65  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
		//   30   68:invokestatic    #74  <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
		//   31   71:fconst_0        
		//   32   72:invokevirtual   #80  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
		//   33   75:putfield        #84  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
				mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

					public void onAnimationEnd(View view)
					{
						mActionModeView.setVisibility(8);
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
					//    2    4:getfield        #28  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
					//    3    7:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
					//    4   10:bipush          8
					//    5   12:invokevirtual   #38  <Method void ActionBarContextView.setVisibility(int)>
						if(mActionModePopup != null)
					//*   6   15:aload_0         
					//*   7   16:getfield        #18  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
					//*   8   19:getfield        #28  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
					//*   9   22:getfield        #42  <Field PopupWindow AppCompatDelegateImpl.mActionModePopup>
					//*  10   25:ifnull          44
							mActionModePopup.dismiss();
					//   11   28:aload_0         
					//   12   29:getfield        #18  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
					//   13   32:getfield        #28  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
					//   14   35:getfield        #42  <Field PopupWindow AppCompatDelegateImpl.mActionModePopup>
					//   15   38:invokevirtual   #47  <Method void PopupWindow.dismiss()>
						else
					//*  16   41:goto            82
						if(mActionModeView.getParent() instanceof View)
					//*  17   44:aload_0         
					//*  18   45:getfield        #18  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
					//*  19   48:getfield        #28  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
					//*  20   51:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
					//*  21   54:invokevirtual   #51  <Method ViewParent ActionBarContextView.getParent()>
					//*  22   57:instanceof      #53  <Class View>
					//*  23   60:ifeq            82
							ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
					//   24   63:aload_0         
					//   25   64:getfield        #18  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
					//   26   67:getfield        #28  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
					//   27   70:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
					//   28   73:invokevirtual   #51  <Method ViewParent ActionBarContextView.getParent()>
					//   29   76:checkcast       #53  <Class View>
					//   30   79:invokestatic    #58  <Method void ViewCompat.requestApplyInsets(View)>
						mActionModeView.removeAllViews();
					//   31   82:aload_0         
					//   32   83:getfield        #18  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
					//   33   86:getfield        #28  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
					//   34   89:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
					//   35   92:invokevirtual   #61  <Method void ActionBarContextView.removeAllViews()>
						mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
					//   36   95:aload_0         
					//   37   96:getfield        #18  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
					//   38   99:getfield        #28  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
					//   39  102:getfield        #65  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
					//   40  105:aconst_null     
					//   41  106:invokevirtual   #71  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
					//   42  109:pop             
						mFadeAnim = null;
					//   43  110:aload_0         
					//   44  111:getfield        #18  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
					//   45  114:getfield        #28  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
					//   46  117:aconst_null     
					//   47  118:putfield        #65  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
					//   48  121:return          
					}

					final ActionModeCallbackWrapperV9 this$1;

			
			{
				this$1 = ActionModeCallbackWrapperV9.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
				}
)));
		//   34   78:aload_0         
		//   35   79:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//   36   82:getfield        #84  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
		//   37   85:new             #11  <Class AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1>
		//   38   88:dup             
		//   39   89:aload_0         
		//   40   90:invokespecial   #87  <Method void AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1(AppCompatDelegateImpl$ActionModeCallbackWrapperV9)>
		//   41   93:invokevirtual   #91  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
		//   42   96:pop             
			}
			if(mAppCompatCallback != null)
		//*  43   97:aload_0         
		//*  44   98:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//*  45  101:getfield        #95  <Field AppCompatCallback AppCompatDelegateImpl.mAppCompatCallback>
		//*  46  104:ifnull          126
				mAppCompatCallback.onSupportActionModeFinished(mActionMode);
		//   47  107:aload_0         
		//   48  108:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//   49  111:getfield        #95  <Field AppCompatCallback AppCompatDelegateImpl.mAppCompatCallback>
		//   50  114:aload_0         
		//   51  115:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//   52  118:getfield        #99  <Field ActionMode AppCompatDelegateImpl.mActionMode>
		//   53  121:invokeinterface #104 <Method void AppCompatCallback.onSupportActionModeFinished(ActionMode)>
			mActionMode = null;
		//   54  126:aload_0         
		//   55  127:getfield        #19  <Field AppCompatDelegateImpl this$0>
		//   56  130:aconst_null     
		//   57  131:putfield        #99  <Field ActionMode AppCompatDelegateImpl.mActionMode>
		//   58  134:return          
		}

		public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
		{
			return mWrapped.onPrepareActionMode(actionmode, menu);
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field android.support.v7.view.ActionMode$Callback mWrapped>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokeinterface #107 <Method boolean android.support.v7.view.ActionMode$Callback.onPrepareActionMode(ActionMode, Menu)>
		//    5   11:ireturn         
		}

		private android.support.v7.view.ActionMode.Callback mWrapped;
		final AppCompatDelegateImpl this$0;

		public ActionModeCallbackWrapperV9(android.support.v7.view.ActionMode.Callback callback)
		{
			this$0 = AppCompatDelegateImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field AppCompatDelegateImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mWrapped = callback;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field android.support.v7.view.ActionMode$Callback mWrapped>
		//    8   14:return          
		}
	}

	class AppCompatWindowCallback extends WindowCallbackWrapper
	{

		public boolean dispatchKeyEvent(KeyEvent keyevent)
		{
			return AppCompatDelegateImpl.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #21  <Method boolean AppCompatDelegateImpl.dispatchKeyEvent(KeyEvent)>
		//    4    8:ifne            24
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #22  <Method boolean WindowCallbackWrapper.dispatchKeyEvent(KeyEvent)>
		//    8   16:ifeq            22
		//    9   19:goto            24
		//   10   22:iconst_0        
		//   11   23:ireturn         
		//   12   24:iconst_1        
		//   13   25:ireturn         
		}

		public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
		{
			return super.dispatchKeyShortcutEvent(keyevent) || onKeyShortcut(keyevent.getKeyCode(), keyevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method boolean WindowCallbackWrapper.dispatchKeyShortcutEvent(KeyEvent)>
		//    3    5:ifne            28
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #31  <Method int KeyEvent.getKeyCode()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #35  <Method boolean AppCompatDelegateImpl.onKeyShortcut(int, KeyEvent)>
		//   10   20:ifeq            26
		//   11   23:goto            28
		//   12   26:iconst_0        
		//   13   27:ireturn         
		//   14   28:iconst_1        
		//   15   29:ireturn         
		}

		public void onContentChanged()
		{
		//    0    0:return          
		}

		public boolean onCreatePanelMenu(int i, Menu menu)
		{
			if(i == 0 && !(menu instanceof MenuBuilder))
		//*   0    0:iload_1         
		//*   1    1:ifne            13
		//*   2    4:aload_2         
		//*   3    5:instanceof      #41  <Class MenuBuilder>
		//*   4    8:ifne            13
				return false;
		//    5   11:iconst_0        
		//    6   12:ireturn         
			else
				return super.onCreatePanelMenu(i, menu);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:aload_2         
		//   10   16:invokespecial   #43  <Method boolean WindowCallbackWrapper.onCreatePanelMenu(int, Menu)>
		//   11   19:ireturn         
		}

		public boolean onMenuOpened(int i, Menu menu)
		{
			super.onMenuOpened(i, menu);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #46  <Method boolean WindowCallbackWrapper.onMenuOpened(int, Menu)>
		//    4    6:pop             
			AppCompatDelegateImpl.this.onMenuOpened(i);
		//    5    7:aload_0         
		//    6    8:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//    7   11:iload_1         
		//    8   12:invokevirtual   #49  <Method void AppCompatDelegateImpl.onMenuOpened(int)>
			return true;
		//    9   15:iconst_1        
		//   10   16:ireturn         
		}

		public void onPanelClosed(int i, Menu menu)
		{
			super.onPanelClosed(i, menu);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #53  <Method void WindowCallbackWrapper.onPanelClosed(int, Menu)>
			AppCompatDelegateImpl.this.onPanelClosed(i);
		//    4    6:aload_0         
		//    5    7:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//    6   10:iload_1         
		//    7   11:invokevirtual   #55  <Method void AppCompatDelegateImpl.onPanelClosed(int)>
		//    8   14:return          
		}

		public boolean onPreparePanel(int i, View view, Menu menu)
		{
			MenuBuilder menubuilder;
			if(menu instanceof MenuBuilder)
		//*   0    0:aload_3         
		//*   1    1:instanceof      #41  <Class MenuBuilder>
		//*   2    4:ifeq            16
				menubuilder = (MenuBuilder)menu;
		//    3    7:aload_3         
		//    4    8:checkcast       #41  <Class MenuBuilder>
		//    5   11:astore          5
			else
		//*   6   13:goto            19
				menubuilder = null;
		//    7   16:aconst_null     
		//    8   17:astore          5
			if(i == 0 && menubuilder == null)
		//*   9   19:iload_1         
		//*  10   20:ifne            30
		//*  11   23:aload           5
		//*  12   25:ifnonnull       30
				return false;
		//   13   28:iconst_0        
		//   14   29:ireturn         
			if(menubuilder != null)
		//*  15   30:aload           5
		//*  16   32:ifnull          41
				menubuilder.setOverrideVisibleItems(true);
		//   17   35:aload           5
		//   18   37:iconst_1        
		//   19   38:invokevirtual   #61  <Method void MenuBuilder.setOverrideVisibleItems(boolean)>
			boolean flag = super.onPreparePanel(i, view, menu);
		//   20   41:aload_0         
		//   21   42:iload_1         
		//   22   43:aload_2         
		//   23   44:aload_3         
		//   24   45:invokespecial   #63  <Method boolean WindowCallbackWrapper.onPreparePanel(int, View, Menu)>
		//   25   48:istore          4
			if(menubuilder != null)
		//*  26   50:aload           5
		//*  27   52:ifnull          61
				menubuilder.setOverrideVisibleItems(false);
		//   28   55:aload           5
		//   29   57:iconst_0        
		//   30   58:invokevirtual   #61  <Method void MenuBuilder.setOverrideVisibleItems(boolean)>
			return flag;
		//   31   61:iload           4
		//   32   63:ireturn         
		}

		public void onProvideKeyboardShortcuts(List list, Menu menu, int i)
		{
			PanelFeatureState panelfeaturestate = getPanelState(0, true);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//    2    4:iconst_0        
		//    3    5:iconst_1        
		//    4    6:invokevirtual   #72  <Method AppCompatDelegateImpl$PanelFeatureState AppCompatDelegateImpl.getPanelState(int, boolean)>
		//    5    9:astore          4
			if(panelfeaturestate != null && panelfeaturestate.menu != null)
		//*   6   11:aload           4
		//*   7   13:ifnull          36
		//*   8   16:aload           4
		//*   9   18:getfield        #78  <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
		//*  10   21:ifnull          36
			{
				super.onProvideKeyboardShortcuts(list, ((Menu) (panelfeaturestate.menu)), i);
		//   11   24:aload_0         
		//   12   25:aload_1         
		//   13   26:aload           4
		//   14   28:getfield        #78  <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
		//   15   31:iload_3         
		//   16   32:invokespecial   #80  <Method void WindowCallbackWrapper.onProvideKeyboardShortcuts(List, Menu, int)>
				return;
		//   17   35:return          
			} else
			{
				super.onProvideKeyboardShortcuts(list, menu, i);
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:aload_2         
		//   21   39:iload_3         
		//   22   40:invokespecial   #80  <Method void WindowCallbackWrapper.onProvideKeyboardShortcuts(List, Menu, int)>
				return;
		//   23   43:return          
			}
		}

		public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback)
		{
			if(android.os.Build.VERSION.SDK_INT >= 23)
		//*   0    0:getstatic       #91  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          23
		//*   2    5:icmplt          10
				return null;
		//    3    8:aconst_null     
		//    4    9:areturn         
			if(isHandleNativeActionModesEnabled())
		//*   5   10:aload_0         
		//*   6   11:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//*   7   14:invokevirtual   #95  <Method boolean AppCompatDelegateImpl.isHandleNativeActionModesEnabled()>
		//*   8   17:ifeq            26
				return startAsSupportActionMode(callback);
		//    9   20:aload_0         
		//   10   21:aload_1         
		//   11   22:invokevirtual   #98  <Method android.view.ActionMode startAsSupportActionMode(android.view.ActionMode$Callback)>
		//   12   25:areturn         
			else
				return super.onWindowStartingActionMode(callback);
		//   13   26:aload_0         
		//   14   27:aload_1         
		//   15   28:invokespecial   #100 <Method android.view.ActionMode WindowCallbackWrapper.onWindowStartingActionMode(android.view.ActionMode$Callback)>
		//   16   31:areturn         
		}

		public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i)
		{
			if(isHandleNativeActionModesEnabled() && i == 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//*   2    4:invokevirtual   #95  <Method boolean AppCompatDelegateImpl.isHandleNativeActionModesEnabled()>
		//*   3    7:ifeq            23
		//*   4   10:iload_2         
		//*   5   11:ifeq            17
		//*   6   14:goto            23
				return startAsSupportActionMode(callback);
		//    7   17:aload_0         
		//    8   18:aload_1         
		//    9   19:invokevirtual   #98  <Method android.view.ActionMode startAsSupportActionMode(android.view.ActionMode$Callback)>
		//   10   22:areturn         
			else
				return super.onWindowStartingActionMode(callback, i);
		//   11   23:aload_0         
		//   12   24:aload_1         
		//   13   25:iload_2         
		//   14   26:invokespecial   #104 <Method android.view.ActionMode WindowCallbackWrapper.onWindowStartingActionMode(android.view.ActionMode$Callback, int)>
		//   15   29:areturn         
		}

		final android.view.ActionMode startAsSupportActionMode(android.view.ActionMode.Callback callback)
		{
			callback = ((android.view.ActionMode.Callback) (new android.support.v7.view.SupportActionModeWrapper.CallbackWrapper(mContext, callback)));
		//    0    0:new             #106 <Class android.support.v7.view.SupportActionModeWrapper$CallbackWrapper>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//    4    8:getfield        #110 <Field Context AppCompatDelegateImpl.mContext>
		//    5   11:aload_1         
		//    6   12:invokespecial   #113 <Method void android.support.v7.view.SupportActionModeWrapper$CallbackWrapper(Context, android.view.ActionMode$Callback)>
		//    7   15:astore_1        
			ActionMode actionmode = startSupportActionMode(((android.support.v7.view.ActionMode.Callback) (callback)));
		//    8   16:aload_0         
		//    9   17:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #117 <Method ActionMode AppCompatDelegateImpl.startSupportActionMode(android.support.v7.view.ActionMode$Callback)>
		//   12   24:astore_2        
			if(actionmode != null)
		//*  13   25:aload_2         
		//*  14   26:ifnull          35
				return ((android.support.v7.view.SupportActionModeWrapper.CallbackWrapper) (callback)).getActionModeWrapper(actionmode);
		//   15   29:aload_1         
		//   16   30:aload_2         
		//   17   31:invokevirtual   #121 <Method android.view.ActionMode android.support.v7.view.SupportActionModeWrapper$CallbackWrapper.getActionModeWrapper(ActionMode)>
		//   18   34:areturn         
			else
				return null;
		//   19   35:aconst_null     
		//   20   36:areturn         
		}

		final AppCompatDelegateImpl this$0;

		AppCompatWindowCallback(android.view.Window.Callback callback)
		{
			this$0 = AppCompatDelegateImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppCompatDelegateImpl this$0>
			super(callback);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void WindowCallbackWrapper(android.view.Window$Callback)>
		//    6   10:return          
		}
	}

	final class AutoNightModeManager
	{

		void cleanup()
		{
			if(mAutoTimeChangeReceiver != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		//*   2    4:ifnull          26
			{
				mContext.unregisterReceiver(mAutoTimeChangeReceiver);
		//    3    7:aload_0         
		//    4    8:getfield        #25  <Field AppCompatDelegateImpl this$0>
		//    5   11:getfield        #47  <Field Context AppCompatDelegateImpl.mContext>
		//    6   14:aload_0         
		//    7   15:getfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		//    8   18:invokevirtual   #53  <Method void Context.unregisterReceiver(BroadcastReceiver)>
				mAutoTimeChangeReceiver = null;
		//    9   21:aload_0         
		//   10   22:aconst_null     
		//   11   23:putfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
			}
		//   12   26:return          
		}

		void dispatchTimeChanged()
		{
			boolean flag = mTwilightManager.isNight();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field TwilightManager mTwilightManager>
		//    2    4:invokevirtual   #36  <Method boolean TwilightManager.isNight()>
		//    3    7:istore_1        
			if(flag != mIsNight)
		//*   4    8:iload_1         
		//*   5    9:aload_0         
		//*   6   10:getfield        #38  <Field boolean mIsNight>
		//*   7   13:icmpeq          29
			{
				mIsNight = flag;
		//    8   16:aload_0         
		//    9   17:iload_1         
		//   10   18:putfield        #38  <Field boolean mIsNight>
				applyDayNight();
		//   11   21:aload_0         
		//   12   22:getfield        #25  <Field AppCompatDelegateImpl this$0>
		//   13   25:invokevirtual   #57  <Method boolean AppCompatDelegateImpl.applyDayNight()>
		//   14   28:pop             
			}
		//   15   29:return          
		}

		int getApplyableNightMode()
		{
			mIsNight = mTwilightManager.isNight();
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:getfield        #30  <Field TwilightManager mTwilightManager>
		//    3    5:invokevirtual   #36  <Method boolean TwilightManager.isNight()>
		//    4    8:putfield        #38  <Field boolean mIsNight>
			return !mIsNight ? 1 : 2;
		//    5   11:aload_0         
		//    6   12:getfield        #38  <Field boolean mIsNight>
		//    7   15:ifeq            20
		//    8   18:iconst_2        
		//    9   19:ireturn         
		//   10   20:iconst_1        
		//   11   21:ireturn         
		}

		void setup()
		{
			cleanup();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #62  <Method void cleanup()>
			if(mAutoTimeChangeReceiver == null)
		//*   2    4:aload_0         
		//*   3    5:getfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		//*   4    8:ifnonnull       23
				mAutoTimeChangeReceiver = ((BroadcastReceiver) (new BroadcastReceiver() {

					public void onReceive(Context context, Intent intent)
					{
						dispatchTimeChanged();
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field AppCompatDelegateImpl$AutoNightModeManager this$1>
					//    2    4:invokevirtual   #26  <Method void AppCompatDelegateImpl$AutoNightModeManager.dispatchTimeChanged()>
					//    3    7:return          
					}

					final AutoNightModeManager this$1;

			
			{
				this$1 = AutoNightModeManager.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AppCompatDelegateImpl$AutoNightModeManager this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
				}
));
		//    5   11:aload_0         
		//    6   12:new             #9   <Class AppCompatDelegateImpl$AutoNightModeManager$1>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:invokespecial   #65  <Method void AppCompatDelegateImpl$AutoNightModeManager$1(AppCompatDelegateImpl$AutoNightModeManager)>
		//   10   20:putfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
			if(mAutoTimeChangeReceiverFilter == null)
		//*  11   23:aload_0         
		//*  12   24:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//*  13   27:ifnonnull       68
			{
				mAutoTimeChangeReceiverFilter = new IntentFilter();
		//   14   30:aload_0         
		//   15   31:new             #69  <Class IntentFilter>
		//   16   34:dup             
		//   17   35:invokespecial   #70  <Method void IntentFilter()>
		//   18   38:putfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
				mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIME_SET");
		//   19   41:aload_0         
		//   20   42:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//   21   45:ldc1            #72  <String "android.intent.action.TIME_SET">
		//   22   47:invokevirtual   #76  <Method void IntentFilter.addAction(String)>
				mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
		//   23   50:aload_0         
		//   24   51:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//   25   54:ldc1            #78  <String "android.intent.action.TIMEZONE_CHANGED">
		//   26   56:invokevirtual   #76  <Method void IntentFilter.addAction(String)>
				mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIME_TICK");
		//   27   59:aload_0         
		//   28   60:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//   29   63:ldc1            #80  <String "android.intent.action.TIME_TICK">
		//   30   65:invokevirtual   #76  <Method void IntentFilter.addAction(String)>
			}
			mContext.registerReceiver(mAutoTimeChangeReceiver, mAutoTimeChangeReceiverFilter);
		//   31   68:aload_0         
		//   32   69:getfield        #25  <Field AppCompatDelegateImpl this$0>
		//   33   72:getfield        #47  <Field Context AppCompatDelegateImpl.mContext>
		//   34   75:aload_0         
		//   35   76:getfield        #43  <Field BroadcastReceiver mAutoTimeChangeReceiver>
		//   36   79:aload_0         
		//   37   80:getfield        #67  <Field IntentFilter mAutoTimeChangeReceiverFilter>
		//   38   83:invokevirtual   #84  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
		//   39   86:pop             
		//   40   87:return          
		}

		private BroadcastReceiver mAutoTimeChangeReceiver;
		private IntentFilter mAutoTimeChangeReceiverFilter;
		private boolean mIsNight;
		private TwilightManager mTwilightManager;
		final AppCompatDelegateImpl this$0;

		AutoNightModeManager(TwilightManager twilightmanager)
		{
			this$0 = AppCompatDelegateImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field AppCompatDelegateImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #28  <Method void Object()>
			mTwilightManager = twilightmanager;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #30  <Field TwilightManager mTwilightManager>
			mIsNight = twilightmanager.isNight();
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #36  <Method boolean TwilightManager.isNight()>
		//   11   19:putfield        #38  <Field boolean mIsNight>
		//   12   22:return          
		}
	}

	private class ListMenuDecorView extends ContentFrameLayout
	{

		private boolean isOutOfBounds(int i, int j)
		{
			return i < -5 || j < -5 || i > getWidth() + 5 || j > getHeight() + 5;
		//    0    0:iload_1         
		//    1    1:bipush          -5
		//    2    3:icmplt          37
		//    3    6:iload_2         
		//    4    7:bipush          -5
		//    5    9:icmplt          37
		//    6   12:iload_1         
		//    7   13:aload_0         
		//    8   14:invokevirtual   #23  <Method int getWidth()>
		//    9   17:iconst_5        
		//   10   18:iadd            
		//   11   19:icmpgt          37
		//   12   22:iload_2         
		//   13   23:aload_0         
		//   14   24:invokevirtual   #26  <Method int getHeight()>
		//   15   27:iconst_5        
		//   16   28:iadd            
		//   17   29:icmple          35
		//   18   32:goto            37
		//   19   35:iconst_0        
		//   20   36:ireturn         
		//   21   37:iconst_1        
		//   22   38:ireturn         
		}

		public boolean dispatchKeyEvent(KeyEvent keyevent)
		{
			return AppCompatDelegateImpl.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #30  <Method boolean AppCompatDelegateImpl.dispatchKeyEvent(KeyEvent)>
		//    4    8:ifne            24
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #31  <Method boolean ContentFrameLayout.dispatchKeyEvent(KeyEvent)>
		//    8   16:ifeq            22
		//    9   19:goto            24
		//   10   22:iconst_0        
		//   11   23:ireturn         
		//   12   24:iconst_1        
		//   13   25:ireturn         
		}

		public boolean onInterceptTouchEvent(MotionEvent motionevent)
		{
			if(motionevent.getAction() == 0 && isOutOfBounds((int)motionevent.getX(), (int)motionevent.getY()))
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #38  <Method int MotionEvent.getAction()>
		//*   2    4:ifne            34
		//*   3    7:aload_0         
		//*   4    8:aload_1         
		//*   5    9:invokevirtual   #42  <Method float MotionEvent.getX()>
		//*   6   12:f2i             
		//*   7   13:aload_1         
		//*   8   14:invokevirtual   #45  <Method float MotionEvent.getY()>
		//*   9   17:f2i             
		//*  10   18:invokespecial   #47  <Method boolean isOutOfBounds(int, int)>
		//*  11   21:ifeq            34
			{
				closePanel(0);
		//   12   24:aload_0         
		//   13   25:getfield        #13  <Field AppCompatDelegateImpl this$0>
		//   14   28:iconst_0        
		//   15   29:invokevirtual   #51  <Method void AppCompatDelegateImpl.closePanel(int)>
				return true;
		//   16   32:iconst_1        
		//   17   33:ireturn         
			} else
			{
				return super.onInterceptTouchEvent(motionevent);
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:invokespecial   #53  <Method boolean ContentFrameLayout.onInterceptTouchEvent(MotionEvent)>
		//   21   39:ireturn         
			}
		}

		public void setBackgroundResource(int i)
		{
			setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i));
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #58  <Method Context getContext()>
		//    3    5:iload_1         
		//    4    6:invokestatic    #64  <Method Drawable AppCompatResources.getDrawable(Context, int)>
		//    5    9:invokevirtual   #68  <Method void setBackgroundDrawable(Drawable)>
		//    6   12:return          
		}

		final AppCompatDelegateImpl this$0;

		public ListMenuDecorView(Context context)
		{
			this$0 = AppCompatDelegateImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppCompatDelegateImpl this$0>
			super(context);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void ContentFrameLayout(Context)>
		//    6   10:return          
		}
	}

	protected static final class PanelFeatureState
	{

		void applyFrozenState()
		{
			MenuBuilder menubuilder = menu;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field MenuBuilder menu>
		//    2    4:astore_1        
			if(menubuilder != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          28
			{
				Bundle bundle = frozenMenuState;
		//    5    9:aload_0         
		//    6   10:getfield        #56  <Field Bundle frozenMenuState>
		//    7   13:astore_2        
				if(bundle != null)
		//*   8   14:aload_2         
		//*   9   15:ifnull          28
				{
					menubuilder.restorePresenterStates(bundle);
		//   10   18:aload_1         
		//   11   19:aload_2         
		//   12   20:invokevirtual   #62  <Method void MenuBuilder.restorePresenterStates(Bundle)>
					frozenMenuState = null;
		//   13   23:aload_0         
		//   14   24:aconst_null     
		//   15   25:putfield        #56  <Field Bundle frozenMenuState>
				}
			}
		//   16   28:return          
		}

		public void clearMenuPresenters()
		{
			MenuBuilder menubuilder = menu;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field MenuBuilder menu>
		//    2    4:astore_1        
			if(menubuilder != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          17
				menubuilder.removeMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//    8   14:invokevirtual   #69  <Method void MenuBuilder.removeMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
			listMenuPresenter = null;
		//    9   17:aload_0         
		//   10   18:aconst_null     
		//   11   19:putfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   12   22:return          
		}

		MenuView getListMenuView(android.support.v7.view.menu.MenuPresenter.Callback callback)
		{
			if(menu == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #54  <Field MenuBuilder menu>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			if(listMenuPresenter == null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//*   7   13:ifnonnull       53
			{
				listMenuPresenter = new ListMenuPresenter(listPresenterContext, android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
		//    8   16:aload_0         
		//    9   17:new             #73  <Class ListMenuPresenter>
		//   10   20:dup             
		//   11   21:aload_0         
		//   12   22:getfield        #75  <Field Context listPresenterContext>
		//   13   25:getstatic       #80  <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_layout>
		//   14   28:invokespecial   #83  <Method void ListMenuPresenter(Context, int)>
		//   15   31:putfield        #65  <Field ListMenuPresenter listMenuPresenter>
				listMenuPresenter.setCallback(callback);
		//   16   34:aload_0         
		//   17   35:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   18   38:aload_1         
		//   19   39:invokevirtual   #87  <Method void ListMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
				menu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
		//   20   42:aload_0         
		//   21   43:getfield        #54  <Field MenuBuilder menu>
		//   22   46:aload_0         
		//   23   47:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   24   50:invokevirtual   #90  <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
			}
			return listMenuPresenter.getMenuView(decorView);
		//   25   53:aload_0         
		//   26   54:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   27   57:aload_0         
		//   28   58:getfield        #92  <Field ViewGroup decorView>
		//   29   61:invokevirtual   #96  <Method MenuView ListMenuPresenter.getMenuView(ViewGroup)>
		//   30   64:areturn         
		}

		public boolean hasPanelItems()
		{
			View view = shownPanelView;
		//    0    0:aload_0         
		//    1    1:getfield        #100 <Field View shownPanelView>
		//    2    4:astore_2        
			boolean flag = false;
		//    3    5:iconst_0        
		//    4    6:istore_1        
			if(view == null)
		//*   5    7:aload_2         
		//*   6    8:ifnonnull       13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			if(createdPanelView != null)
		//*   9   13:aload_0         
		//*  10   14:getfield        #102 <Field View createdPanelView>
		//*  11   17:ifnull          22
				return true;
		//   12   20:iconst_1        
		//   13   21:ireturn         
			if(listMenuPresenter.getAdapter().getCount() > 0)
		//*  14   22:aload_0         
		//*  15   23:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//*  16   26:invokevirtual   #106 <Method ListAdapter ListMenuPresenter.getAdapter()>
		//*  17   29:invokeinterface #112 <Method int ListAdapter.getCount()>
		//*  18   34:ifle            39
				flag = true;
		//   19   37:iconst_1        
		//   20   38:istore_1        
			return flag;
		//   21   39:iload_1         
		//   22   40:ireturn         
		}

		void onRestoreInstanceState(Parcelable parcelable)
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
		//    0    0:aload_1         
		//    1    1:checkcast       #9   <Class AppCompatDelegateImpl$PanelFeatureState$SavedState>
		//    2    4:astore_1        
			featureId = ((SavedState) (parcelable)).featureId;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:getfield        #115 <Field int AppCompatDelegateImpl$PanelFeatureState$SavedState.featureId>
		//    6   10:putfield        #48  <Field int featureId>
			wasLastOpen = ((SavedState) (parcelable)).isOpen;
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:getfield        #117 <Field boolean AppCompatDelegateImpl$PanelFeatureState$SavedState.isOpen>
		//   10   18:putfield        #119 <Field boolean wasLastOpen>
			frozenMenuState = ((SavedState) (parcelable)).menuState;
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:getfield        #122 <Field Bundle AppCompatDelegateImpl$PanelFeatureState$SavedState.menuState>
		//   14   26:putfield        #56  <Field Bundle frozenMenuState>
			shownPanelView = null;
		//   15   29:aload_0         
		//   16   30:aconst_null     
		//   17   31:putfield        #100 <Field View shownPanelView>
			decorView = null;
		//   18   34:aload_0         
		//   19   35:aconst_null     
		//   20   36:putfield        #92  <Field ViewGroup decorView>
		//   21   39:return          
		}

		Parcelable onSaveInstanceState()
		{
			SavedState savedstate = new SavedState();
		//    0    0:new             #9   <Class AppCompatDelegateImpl$PanelFeatureState$SavedState>
		//    1    3:dup             
		//    2    4:invokespecial   #125 <Method void AppCompatDelegateImpl$PanelFeatureState$SavedState()>
		//    3    7:astore_1        
			savedstate.featureId = featureId;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #48  <Field int featureId>
		//    7   13:putfield        #115 <Field int AppCompatDelegateImpl$PanelFeatureState$SavedState.featureId>
			savedstate.isOpen = isOpen;
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #126 <Field boolean isOpen>
		//   11   21:putfield        #117 <Field boolean AppCompatDelegateImpl$PanelFeatureState$SavedState.isOpen>
			if(menu != null)
		//*  12   24:aload_0         
		//*  13   25:getfield        #54  <Field MenuBuilder menu>
		//*  14   28:ifnull          53
			{
				savedstate.menuState = new Bundle();
		//   15   31:aload_1         
		//   16   32:new             #128 <Class Bundle>
		//   17   35:dup             
		//   18   36:invokespecial   #129 <Method void Bundle()>
		//   19   39:putfield        #122 <Field Bundle AppCompatDelegateImpl$PanelFeatureState$SavedState.menuState>
				menu.savePresenterStates(savedstate.menuState);
		//   20   42:aload_0         
		//   21   43:getfield        #54  <Field MenuBuilder menu>
		//   22   46:aload_1         
		//   23   47:getfield        #122 <Field Bundle AppCompatDelegateImpl$PanelFeatureState$SavedState.menuState>
		//   24   50:invokevirtual   #132 <Method void MenuBuilder.savePresenterStates(Bundle)>
			}
			return ((Parcelable) (savedstate));
		//   25   53:aload_1         
		//   26   54:areturn         
		}

		void setMenu(MenuBuilder menubuilder)
		{
			MenuBuilder menubuilder1 = menu;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field MenuBuilder menu>
		//    2    4:astore_2        
			if(menubuilder == menubuilder1)
		//*   3    5:aload_1         
		//*   4    6:aload_2         
		//*   5    7:if_acmpne       11
				return;
		//    6   10:return          
			if(menubuilder1 != null)
		//*   7   11:aload_2         
		//*   8   12:ifnull          23
				menubuilder1.removeMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
		//    9   15:aload_2         
		//   10   16:aload_0         
		//   11   17:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   12   20:invokevirtual   #69  <Method void MenuBuilder.removeMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
			menu = menubuilder;
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:putfield        #54  <Field MenuBuilder menu>
			if(menubuilder != null)
		//*  16   28:aload_1         
		//*  17   29:ifnull          46
			{
				ListMenuPresenter listmenupresenter = listMenuPresenter;
		//   18   32:aload_0         
		//   19   33:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   20   36:astore_2        
				if(listmenupresenter != null)
		//*  21   37:aload_2         
		//*  22   38:ifnull          46
					menubuilder.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listmenupresenter)));
		//   23   41:aload_1         
		//   24   42:aload_2         
		//   25   43:invokevirtual   #90  <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
			}
		//   26   46:return          
		}

		void setStyle(Context context)
		{
			TypedValue typedvalue = new TypedValue();
		//    0    0:new             #138 <Class TypedValue>
		//    1    3:dup             
		//    2    4:invokespecial   #139 <Method void TypedValue()>
		//    3    7:astore_3        
			android.content.res.Resources.Theme theme = context.getResources().newTheme();
		//    4    8:aload_1         
		//    5    9:invokevirtual   #145 <Method Resources Context.getResources()>
		//    6   12:invokevirtual   #151 <Method android.content.res.Resources$Theme Resources.newTheme()>
		//    7   15:astore_2        
			theme.setTo(context.getTheme());
		//    8   16:aload_2         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #154 <Method android.content.res.Resources$Theme Context.getTheme()>
		//   11   21:invokevirtual   #160 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
			theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, typedvalue, true);
		//   12   24:aload_2         
		//   13   25:getstatic       #165 <Field int android.support.v7.appcompat.R$attr.actionBarPopupTheme>
		//   14   28:aload_3         
		//   15   29:iconst_1        
		//   16   30:invokevirtual   #169 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
		//   17   33:pop             
			if(typedvalue.resourceId != 0)
		//*  18   34:aload_3         
		//*  19   35:getfield        #172 <Field int TypedValue.resourceId>
		//*  20   38:ifeq            50
				theme.applyStyle(typedvalue.resourceId, true);
		//   21   41:aload_2         
		//   22   42:aload_3         
		//   23   43:getfield        #172 <Field int TypedValue.resourceId>
		//   24   46:iconst_1        
		//   25   47:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			theme.resolveAttribute(android.support.v7.appcompat.R.attr.panelMenuListTheme, typedvalue, true);
		//   26   50:aload_2         
		//   27   51:getstatic       #179 <Field int android.support.v7.appcompat.R$attr.panelMenuListTheme>
		//   28   54:aload_3         
		//   29   55:iconst_1        
		//   30   56:invokevirtual   #169 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
		//   31   59:pop             
			if(typedvalue.resourceId != 0)
		//*  32   60:aload_3         
		//*  33   61:getfield        #172 <Field int TypedValue.resourceId>
		//*  34   64:ifeq            79
				theme.applyStyle(typedvalue.resourceId, true);
		//   35   67:aload_2         
		//   36   68:aload_3         
		//   37   69:getfield        #172 <Field int TypedValue.resourceId>
		//   38   72:iconst_1        
		//   39   73:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			else
		//*  40   76:goto            87
				theme.applyStyle(android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
		//   41   79:aload_2         
		//   42   80:getstatic       #184 <Field int android.support.v7.appcompat.R$style.Theme_AppCompat_CompactMenu>
		//   43   83:iconst_1        
		//   44   84:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			context = ((Context) (new ContextThemeWrapper(context, 0)));
		//   45   87:new             #186 <Class ContextThemeWrapper>
		//   46   90:dup             
		//   47   91:aload_1         
		//   48   92:iconst_0        
		//   49   93:invokespecial   #187 <Method void ContextThemeWrapper(Context, int)>
		//   50   96:astore_1        
			context.getTheme().setTo(theme);
		//   51   97:aload_1         
		//   52   98:invokevirtual   #154 <Method android.content.res.Resources$Theme Context.getTheme()>
		//   53  101:aload_2         
		//   54  102:invokevirtual   #160 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
			listPresenterContext = context;
		//   55  105:aload_0         
		//   56  106:aload_1         
		//   57  107:putfield        #75  <Field Context listPresenterContext>
			context = ((Context) (context.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme)));
		//   58  110:aload_1         
		//   59  111:getstatic       #193 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
		//   60  114:invokevirtual   #197 <Method TypedArray Context.obtainStyledAttributes(int[])>
		//   61  117:astore_1        
			background = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
		//   62  118:aload_0         
		//   63  119:aload_1         
		//   64  120:getstatic       #200 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_panelBackground>
		//   65  123:iconst_0        
		//   66  124:invokevirtual   #206 <Method int TypedArray.getResourceId(int, int)>
		//   67  127:putfield        #208 <Field int background>
			windowAnimations = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
		//   68  130:aload_0         
		//   69  131:aload_1         
		//   70  132:getstatic       #211 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_android_windowAnimationStyle>
		//   71  135:iconst_0        
		//   72  136:invokevirtual   #206 <Method int TypedArray.getResourceId(int, int)>
		//   73  139:putfield        #213 <Field int windowAnimations>
			((TypedArray) (context)).recycle();
		//   74  142:aload_1         
		//   75  143:invokevirtual   #216 <Method void TypedArray.recycle()>
		//   76  146:return          
		}

		int background;
		View createdPanelView;
		ViewGroup decorView;
		int featureId;
		Bundle frozenActionViewState;
		Bundle frozenMenuState;
		int gravity;
		boolean isHandled;
		boolean isOpen;
		boolean isPrepared;
		ListMenuPresenter listMenuPresenter;
		Context listPresenterContext;
		MenuBuilder menu;
		public boolean qwertyMode;
		boolean refreshDecorView;
		boolean refreshMenuContent;
		View shownPanelView;
		boolean wasLastOpen;
		int windowAnimations;
		int x;
		int y;

		PanelFeatureState(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #46  <Method void Object()>
			featureId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #48  <Field int featureId>
			refreshDecorView = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #50  <Field boolean refreshDecorView>
		//    8   14:return          
		}
	}

	private static class PanelFeatureState.SavedState
		implements Parcelable
	{

		static PanelFeatureState.SavedState readFromParcel(Parcel parcel, ClassLoader classloader)
		{
			PanelFeatureState.SavedState savedstate = new PanelFeatureState.SavedState();
		//    0    0:new             #2   <Class AppCompatDelegateImpl$PanelFeatureState$SavedState>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void AppCompatDelegateImpl$PanelFeatureState$SavedState()>
		//    3    7:astore          4
			savedstate.featureId = parcel.readInt();
		//    4    9:aload           4
		//    5   11:aload_0         
		//    6   12:invokevirtual   #41  <Method int Parcel.readInt()>
		//    7   15:putfield        #43  <Field int featureId>
			int i = parcel.readInt();
		//    8   18:aload_0         
		//    9   19:invokevirtual   #41  <Method int Parcel.readInt()>
		//   10   22:istore_2        
			boolean flag = true;
		//   11   23:iconst_1        
		//   12   24:istore_3        
			if(i != 1)
		//*  13   25:iload_2         
		//*  14   26:iconst_1        
		//*  15   27:icmpne          33
		//*  16   30:goto            35
				flag = false;
		//   17   33:iconst_0        
		//   18   34:istore_3        
			savedstate.isOpen = flag;
		//   19   35:aload           4
		//   20   37:iload_3         
		//   21   38:putfield        #45  <Field boolean isOpen>
			if(savedstate.isOpen)
		//*  22   41:aload           4
		//*  23   43:getfield        #45  <Field boolean isOpen>
		//*  24   46:ifeq            59
				savedstate.menuState = parcel.readBundle(classloader);
		//   25   49:aload           4
		//   26   51:aload_0         
		//   27   52:aload_1         
		//   28   53:invokevirtual   #49  <Method Bundle Parcel.readBundle(ClassLoader)>
		//   29   56:putfield        #51  <Field Bundle menuState>
			return savedstate;
		//   30   59:aload           4
		//   31   61:areturn         
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #56  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #58  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #63  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public PanelFeatureState.SavedState createFromParcel(Parcel parcel)
			{
				return PanelFeatureState.SavedState.readFromParcel(parcel, ((ClassLoader) (null)));
			//    0    0:aload_1         
			//    1    1:aconst_null     
			//    2    2:invokestatic    #26  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return PanelFeatureState.SavedState.readFromParcel(parcel, classloader);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokestatic    #26  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState AppCompatDelegateImpl$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #29  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #32  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public PanelFeatureState.SavedState[] newArray(int i)
			{
				return new PanelFeatureState.SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       PanelFeatureState.SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #37  <Method AppCompatDelegateImpl$PanelFeatureState$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int featureId;
		boolean isOpen;
		Bundle menuState;

		static 
		{
		//    0    0:new             #14  <Class AppCompatDelegateImpl$PanelFeatureState$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void AppCompatDelegateImpl$PanelFeatureState$SavedState$1()>
		//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		PanelFeatureState.SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
		//    2    4:return          
		}
	}

	private final class PanelMenuPresenterCallback
		implements android.support.v7.view.menu.MenuPresenter.Callback
	{

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
			MenuBuilder menubuilder1 = menubuilder.getRootMenu();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method MenuBuilder MenuBuilder.getRootMenu()>
		//    2    4:astore          4
			boolean flag1;
			if(menubuilder1 != menubuilder)
		//*   3    6:aload           4
		//*   4    8:aload_1         
		//*   5    9:if_acmpeq       17
				flag1 = true;
		//    6   12:iconst_1        
		//    7   13:istore_3        
			else
		//*   8   14:goto            19
				flag1 = false;
		//    9   17:iconst_0        
		//   10   18:istore_3        
			AppCompatDelegateImpl appcompatdelegateimpl = AppCompatDelegateImpl.this;
		//   11   19:aload_0         
		//   12   20:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//   13   23:astore          5
			if(flag1)
		//*  14   25:iload_3         
		//*  15   26:ifeq            32
				menubuilder = menubuilder1;
		//   16   29:aload           4
		//   17   31:astore_1        
			menubuilder = ((MenuBuilder) (appcompatdelegateimpl.findMenuPanel(((Menu) (menubuilder)))));
		//   18   32:aload           5
		//   19   34:aload_1         
		//   20   35:invokevirtual   #31  <Method AppCompatDelegateImpl$PanelFeatureState AppCompatDelegateImpl.findMenuPanel(Menu)>
		//   21   38:astore_1        
			if(menubuilder != null)
		//*  22   39:aload_1         
		//*  23   40:ifnull          80
			{
				if(flag1)
		//*  24   43:iload_3         
		//*  25   44:ifeq            71
				{
					callOnPanelClosed(((PanelFeatureState) (menubuilder)).featureId, ((PanelFeatureState) (menubuilder)), ((Menu) (menubuilder1)));
		//   26   47:aload_0         
		//   27   48:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//   28   51:aload_1         
		//   29   52:getfield        #37  <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
		//   30   55:aload_1         
		//   31   56:aload           4
		//   32   58:invokevirtual   #41  <Method void AppCompatDelegateImpl.callOnPanelClosed(int, AppCompatDelegateImpl$PanelFeatureState, Menu)>
					closePanel(((PanelFeatureState) (menubuilder)), true);
		//   33   61:aload_0         
		//   34   62:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//   35   65:aload_1         
		//   36   66:iconst_1        
		//   37   67:invokevirtual   #45  <Method void AppCompatDelegateImpl.closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
					return;
		//   38   70:return          
				}
				closePanel(((PanelFeatureState) (menubuilder)), flag);
		//   39   71:aload_0         
		//   40   72:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//   41   75:aload_1         
		//   42   76:iload_2         
		//   43   77:invokevirtual   #45  <Method void AppCompatDelegateImpl.closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
			}
		//   44   80:return          
		}

		public boolean onOpenSubMenu(MenuBuilder menubuilder)
		{
			if(menubuilder == null && mHasActionBar)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       46
		//*   2    4:aload_0         
		//*   3    5:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//*   4    8:getfield        #51  <Field boolean AppCompatDelegateImpl.mHasActionBar>
		//*   5   11:ifeq            46
			{
				android.view.Window.Callback callback = getWindowCallback();
		//    6   14:aload_0         
		//    7   15:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//    8   18:invokevirtual   #55  <Method android.view.Window$Callback AppCompatDelegateImpl.getWindowCallback()>
		//    9   21:astore_2        
				if(callback != null && !mIsDestroyed)
		//*  10   22:aload_2         
		//*  11   23:ifnull          46
		//*  12   26:aload_0         
		//*  13   27:getfield        #15  <Field AppCompatDelegateImpl this$0>
		//*  14   30:getfield        #58  <Field boolean AppCompatDelegateImpl.mIsDestroyed>
		//*  15   33:ifne            46
					callback.onMenuOpened(108, ((Menu) (menubuilder)));
		//   16   36:aload_2         
		//   17   37:bipush          108
		//   18   39:aload_1         
		//   19   40:invokeinterface #64  <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
		//   20   45:pop             
			}
			return true;
		//   21   46:iconst_1        
		//   22   47:ireturn         
		}

		final AppCompatDelegateImpl this$0;

		PanelMenuPresenterCallback()
		{
			this$0 = AppCompatDelegateImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field AppCompatDelegateImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appcompatcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #169 <Method void AppCompatDelegate()>
		mFadeAnim = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #171 <Field ViewPropertyAnimatorCompat mFadeAnim>
		mHandleNativeActionModes = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #173 <Field boolean mHandleNativeActionModes>
		mLocalNightMode = -100;
	//    8   14:aload_0         
	//    9   15:bipush          -100
	//   10   17:putfield        #175 <Field int mLocalNightMode>
	//   11   20:aload_0         
	//   12   21:new             #12  <Class AppCompatDelegateImpl$2>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:invokespecial   #178 <Method void AppCompatDelegateImpl$2(AppCompatDelegateImpl)>
	//   16   29:putfield        #180 <Field Runnable mInvalidatePanelMenuRunnable>
		mContext = context;
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:putfield        #182 <Field Context mContext>
		mWindow = window;
	//   20   37:aload_0         
	//   21   38:aload_2         
	//   22   39:putfield        #184 <Field Window mWindow>
		mAppCompatCallback = appcompatcallback;
	//   23   42:aload_0         
	//   24   43:aload_3         
	//   25   44:putfield        #186 <Field AppCompatCallback mAppCompatCallback>
		mOriginalWindowCallback = mWindow.getCallback();
	//   26   47:aload_0         
	//   27   48:aload_0         
	//   28   49:getfield        #184 <Field Window mWindow>
	//   29   52:invokevirtual   #192 <Method android.view.Window$Callback Window.getCallback()>
	//   30   55:putfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
		window = ((Window) (mOriginalWindowCallback));
	//   31   58:aload_0         
	//   32   59:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   33   62:astore_2        
		if(!(window instanceof AppCompatWindowCallback))
	//*  34   63:aload_2         
	//*  35   64:instanceof      #37  <Class AppCompatDelegateImpl$AppCompatWindowCallback>
	//*  36   67:ifne            126
		{
			mAppCompatWindowCallback = ((android.view.Window.Callback) (new AppCompatWindowCallback(((android.view.Window.Callback) (window)))));
	//   37   70:aload_0         
	//   38   71:new             #37  <Class AppCompatDelegateImpl$AppCompatWindowCallback>
	//   39   74:dup             
	//   40   75:aload_0         
	//   41   76:aload_2         
	//   42   77:invokespecial   #197 <Method void AppCompatDelegateImpl$AppCompatWindowCallback(AppCompatDelegateImpl, android.view.Window$Callback)>
	//   43   80:putfield        #199 <Field android.view.Window$Callback mAppCompatWindowCallback>
			mWindow.setCallback(mAppCompatWindowCallback);
	//   44   83:aload_0         
	//   45   84:getfield        #184 <Field Window mWindow>
	//   46   87:aload_0         
	//   47   88:getfield        #199 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   48   91:invokevirtual   #203 <Method void Window.setCallback(android.view.Window$Callback)>
			context = ((Context) (TintTypedArray.obtainStyledAttributes(context, ((AttributeSet) (null)), sWindowBackgroundStyleable)));
	//   49   94:aload_1         
	//   50   95:aconst_null     
	//   51   96:getstatic       #150 <Field int[] sWindowBackgroundStyleable>
	//   52   99:invokestatic    #209 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[])>
	//   53  102:astore_1        
			window = ((Window) (((TintTypedArray) (context)).getDrawableIfKnown(0)));
	//   54  103:aload_1         
	//   55  104:iconst_0        
	//   56  105:invokevirtual   #213 <Method Drawable TintTypedArray.getDrawableIfKnown(int)>
	//   57  108:astore_2        
			if(window != null)
	//*  58  109:aload_2         
	//*  59  110:ifnull          121
				mWindow.setBackgroundDrawable(((Drawable) (window)));
	//   60  113:aload_0         
	//   61  114:getfield        #184 <Field Window mWindow>
	//   62  117:aload_2         
	//   63  118:invokevirtual   #217 <Method void Window.setBackgroundDrawable(Drawable)>
			((TintTypedArray) (context)).recycle();
	//   64  121:aload_1         
	//   65  122:invokevirtual   #220 <Method void TintTypedArray.recycle()>
			return;
	//   66  125:return          
		} else
		{
			throw new IllegalStateException("AppCompat has already installed itself into the Window");
	//   67  126:new             #222 <Class IllegalStateException>
	//   68  129:dup             
	//   69  130:ldc1            #224 <String "AppCompat has already installed itself into the Window">
	//   70  132:invokespecial   #227 <Method void IllegalStateException(String)>
	//   71  135:athrow          
		}
	}

	private void applyFixedSizeWindow()
	{
		ContentFrameLayout contentframelayout = (ContentFrameLayout)mSubDecor.findViewById(0x1020002);
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field ViewGroup mSubDecor>
	//    2    4:ldc1            #231 <Int 0x1020002>
	//    3    6:invokevirtual   #237 <Method View ViewGroup.findViewById(int)>
	//    4    9:checkcast       #239 <Class ContentFrameLayout>
	//    5   12:astore_1        
		Object obj = ((Object) (mWindow.getDecorView()));
	//    6   13:aload_0         
	//    7   14:getfield        #184 <Field Window mWindow>
	//    8   17:invokevirtual   #243 <Method View Window.getDecorView()>
	//    9   20:astore_2        
		contentframelayout.setDecorPadding(((View) (obj)).getPaddingLeft(), ((View) (obj)).getPaddingTop(), ((View) (obj)).getPaddingRight(), ((View) (obj)).getPaddingBottom());
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:invokevirtual   #249 <Method int View.getPaddingLeft()>
	//   13   26:aload_2         
	//   14   27:invokevirtual   #252 <Method int View.getPaddingTop()>
	//   15   30:aload_2         
	//   16   31:invokevirtual   #255 <Method int View.getPaddingRight()>
	//   17   34:aload_2         
	//   18   35:invokevirtual   #258 <Method int View.getPaddingBottom()>
	//   19   38:invokevirtual   #262 <Method void ContentFrameLayout.setDecorPadding(int, int, int, int)>
		obj = ((Object) (mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme)));
	//   20   41:aload_0         
	//   21   42:getfield        #182 <Field Context mContext>
	//   22   45:getstatic       #267 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
	//   23   48:invokevirtual   #272 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   24   51:astore_2        
		((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentframelayout.getMinWidthMajor());
	//   25   52:aload_2         
	//   26   53:getstatic       #275 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowMinWidthMajor>
	//   27   56:aload_1         
	//   28   57:invokevirtual   #279 <Method TypedValue ContentFrameLayout.getMinWidthMajor()>
	//   29   60:invokevirtual   #285 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   30   63:pop             
		((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentframelayout.getMinWidthMinor());
	//   31   64:aload_2         
	//   32   65:getstatic       #288 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowMinWidthMinor>
	//   33   68:aload_1         
	//   34   69:invokevirtual   #291 <Method TypedValue ContentFrameLayout.getMinWidthMinor()>
	//   35   72:invokevirtual   #285 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   36   75:pop             
		if(((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor))
	//*  37   76:aload_2         
	//*  38   77:getstatic       #294 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedWidthMajor>
	//*  39   80:invokevirtual   #298 <Method boolean TypedArray.hasValue(int)>
	//*  40   83:ifeq            98
			((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentframelayout.getFixedWidthMajor());
	//   41   86:aload_2         
	//   42   87:getstatic       #294 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedWidthMajor>
	//   43   90:aload_1         
	//   44   91:invokevirtual   #301 <Method TypedValue ContentFrameLayout.getFixedWidthMajor()>
	//   45   94:invokevirtual   #285 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   46   97:pop             
		if(((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor))
	//*  47   98:aload_2         
	//*  48   99:getstatic       #304 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedWidthMinor>
	//*  49  102:invokevirtual   #298 <Method boolean TypedArray.hasValue(int)>
	//*  50  105:ifeq            120
			((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentframelayout.getFixedWidthMinor());
	//   51  108:aload_2         
	//   52  109:getstatic       #304 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedWidthMinor>
	//   53  112:aload_1         
	//   54  113:invokevirtual   #307 <Method TypedValue ContentFrameLayout.getFixedWidthMinor()>
	//   55  116:invokevirtual   #285 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   56  119:pop             
		if(((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor))
	//*  57  120:aload_2         
	//*  58  121:getstatic       #310 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedHeightMajor>
	//*  59  124:invokevirtual   #298 <Method boolean TypedArray.hasValue(int)>
	//*  60  127:ifeq            142
			((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentframelayout.getFixedHeightMajor());
	//   61  130:aload_2         
	//   62  131:getstatic       #310 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedHeightMajor>
	//   63  134:aload_1         
	//   64  135:invokevirtual   #313 <Method TypedValue ContentFrameLayout.getFixedHeightMajor()>
	//   65  138:invokevirtual   #285 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   66  141:pop             
		if(((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor))
	//*  67  142:aload_2         
	//*  68  143:getstatic       #316 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedHeightMinor>
	//*  69  146:invokevirtual   #298 <Method boolean TypedArray.hasValue(int)>
	//*  70  149:ifeq            164
			((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentframelayout.getFixedHeightMinor());
	//   71  152:aload_2         
	//   72  153:getstatic       #316 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedHeightMinor>
	//   73  156:aload_1         
	//   74  157:invokevirtual   #319 <Method TypedValue ContentFrameLayout.getFixedHeightMinor()>
	//   75  160:invokevirtual   #285 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   76  163:pop             
		((TypedArray) (obj)).recycle();
	//   77  164:aload_2         
	//   78  165:invokevirtual   #320 <Method void TypedArray.recycle()>
		contentframelayout.requestLayout();
	//   79  168:aload_1         
	//   80  169:invokevirtual   #323 <Method void ContentFrameLayout.requestLayout()>
	//   81  172:return          
	}

	private ViewGroup createSubDecor()
	{
		Object obj = ((Object) (mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme)));
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field Context mContext>
	//    2    4:getstatic       #267 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
	//    3    7:invokevirtual   #272 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//    4   10:astore_1        
		if(((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar))
	//*   5   11:aload_1         
	//*   6   12:getstatic       #328 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBar>
	//*   7   15:invokevirtual   #298 <Method boolean TypedArray.hasValue(int)>
	//*   8   18:ifeq            654
		{
			if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false))
	//*   9   21:aload_1         
	//*  10   22:getstatic       #331 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowNoTitle>
	//*  11   25:iconst_0        
	//*  12   26:invokevirtual   #335 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  13   29:ifeq            41
				requestWindowFeature(1);
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #338 <Method boolean requestWindowFeature(int)>
	//   17   37:pop             
			else
	//*  18   38:goto            59
			if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar, false))
	//*  19   41:aload_1         
	//*  20   42:getstatic       #328 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBar>
	//*  21   45:iconst_0        
	//*  22   46:invokevirtual   #335 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  23   49:ifeq            59
				requestWindowFeature(108);
	//   24   52:aload_0         
	//   25   53:bipush          108
	//   26   55:invokevirtual   #338 <Method boolean requestWindowFeature(int)>
	//   27   58:pop             
			if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false))
	//*  28   59:aload_1         
	//*  29   60:getstatic       #341 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBarOverlay>
	//*  30   63:iconst_0        
	//*  31   64:invokevirtual   #335 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  32   67:ifeq            77
				requestWindowFeature(109);
	//   33   70:aload_0         
	//   34   71:bipush          109
	//   35   73:invokevirtual   #338 <Method boolean requestWindowFeature(int)>
	//   36   76:pop             
			if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false))
	//*  37   77:aload_1         
	//*  38   78:getstatic       #344 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionModeOverlay>
	//*  39   81:iconst_0        
	//*  40   82:invokevirtual   #335 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  41   85:ifeq            95
				requestWindowFeature(10);
	//   42   88:aload_0         
	//   43   89:bipush          10
	//   44   91:invokevirtual   #338 <Method boolean requestWindowFeature(int)>
	//   45   94:pop             
			mIsFloating = ((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
	//   46   95:aload_0         
	//   47   96:aload_1         
	//   48   97:getstatic       #347 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_android_windowIsFloating>
	//   49  100:iconst_0        
	//   50  101:invokevirtual   #335 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   51  104:putfield        #349 <Field boolean mIsFloating>
			((TypedArray) (obj)).recycle();
	//   52  107:aload_1         
	//   53  108:invokevirtual   #320 <Method void TypedArray.recycle()>
			mWindow.getDecorView();
	//   54  111:aload_0         
	//   55  112:getfield        #184 <Field Window mWindow>
	//   56  115:invokevirtual   #243 <Method View Window.getDecorView()>
	//   57  118:pop             
			obj = ((Object) (LayoutInflater.from(mContext)));
	//   58  119:aload_0         
	//   59  120:getfield        #182 <Field Context mContext>
	//   60  123:invokestatic    #355 <Method LayoutInflater LayoutInflater.from(Context)>
	//   61  126:astore_1        
			if(!mWindowNoTitle)
	//*  62  127:aload_0         
	//*  63  128:getfield        #357 <Field boolean mWindowNoTitle>
	//*  64  131:ifne            334
			{
				if(mIsFloating)
	//*  65  134:aload_0         
	//*  66  135:getfield        #349 <Field boolean mIsFloating>
	//*  67  138:ifeq            166
				{
					obj = ((Object) ((ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_dialog_title_material, ((ViewGroup) (null)))));
	//   68  141:aload_1         
	//   69  142:getstatic       #362 <Field int android.support.v7.appcompat.R$layout.abc_dialog_title_material>
	//   70  145:aconst_null     
	//   71  146:invokevirtual   #366 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   72  149:checkcast       #233 <Class ViewGroup>
	//   73  152:astore_1        
					mOverlayActionBar = false;
	//   74  153:aload_0         
	//   75  154:iconst_0        
	//   76  155:putfield        #368 <Field boolean mOverlayActionBar>
					mHasActionBar = false;
	//   77  158:aload_0         
	//   78  159:iconst_0        
	//   79  160:putfield        #370 <Field boolean mHasActionBar>
				} else
	//*  80  163:goto            408
				if(mHasActionBar)
	//*  81  166:aload_0         
	//*  82  167:getfield        #370 <Field boolean mHasActionBar>
	//*  83  170:ifeq            329
				{
					obj = ((Object) (new TypedValue()));
	//   84  173:new             #372 <Class TypedValue>
	//   85  176:dup             
	//   86  177:invokespecial   #373 <Method void TypedValue()>
	//   87  180:astore_1        
					mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, ((TypedValue) (obj)), true);
	//   88  181:aload_0         
	//   89  182:getfield        #182 <Field Context mContext>
	//   90  185:invokevirtual   #377 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   91  188:getstatic       #382 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//   92  191:aload_1         
	//   93  192:iconst_1        
	//   94  193:invokevirtual   #388 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   95  196:pop             
					if(((TypedValue) (obj)).resourceId != 0)
	//*  96  197:aload_1         
	//*  97  198:getfield        #391 <Field int TypedValue.resourceId>
	//*  98  201:ifeq            223
						obj = ((Object) (new ContextThemeWrapper(mContext, ((TypedValue) (obj)).resourceId)));
	//   99  204:new             #393 <Class ContextThemeWrapper>
	//  100  207:dup             
	//  101  208:aload_0         
	//  102  209:getfield        #182 <Field Context mContext>
	//  103  212:aload_1         
	//  104  213:getfield        #391 <Field int TypedValue.resourceId>
	//  105  216:invokespecial   #396 <Method void ContextThemeWrapper(Context, int)>
	//  106  219:astore_1        
					else
	//* 107  220:goto            228
						obj = ((Object) (mContext));
	//  108  223:aload_0         
	//  109  224:getfield        #182 <Field Context mContext>
	//  110  227:astore_1        
					ViewGroup viewgroup = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.appcompat.R.layout.abc_screen_toolbar, ((ViewGroup) (null)));
	//  111  228:aload_1         
	//  112  229:invokestatic    #355 <Method LayoutInflater LayoutInflater.from(Context)>
	//  113  232:getstatic       #399 <Field int android.support.v7.appcompat.R$layout.abc_screen_toolbar>
	//  114  235:aconst_null     
	//  115  236:invokevirtual   #366 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  116  239:checkcast       #233 <Class ViewGroup>
	//  117  242:astore_2        
					mDecorContentParent = (DecorContentParent)viewgroup.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
	//  118  243:aload_0         
	//  119  244:aload_2         
	//  120  245:getstatic       #404 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//  121  248:invokevirtual   #237 <Method View ViewGroup.findViewById(int)>
	//  122  251:checkcast       #406 <Class DecorContentParent>
	//  123  254:putfield        #408 <Field DecorContentParent mDecorContentParent>
					mDecorContentParent.setWindowCallback(getWindowCallback());
	//  124  257:aload_0         
	//  125  258:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//  126  261:aload_0         
	//  127  262:invokevirtual   #411 <Method android.view.Window$Callback getWindowCallback()>
	//  128  265:invokeinterface #414 <Method void DecorContentParent.setWindowCallback(android.view.Window$Callback)>
					if(mOverlayActionBar)
	//* 129  270:aload_0         
	//* 130  271:getfield        #368 <Field boolean mOverlayActionBar>
	//* 131  274:ifeq            288
						mDecorContentParent.initFeature(109);
	//  132  277:aload_0         
	//  133  278:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//  134  281:bipush          109
	//  135  283:invokeinterface #418 <Method void DecorContentParent.initFeature(int)>
					if(mFeatureProgress)
	//* 136  288:aload_0         
	//* 137  289:getfield        #420 <Field boolean mFeatureProgress>
	//* 138  292:ifeq            305
						mDecorContentParent.initFeature(2);
	//  139  295:aload_0         
	//  140  296:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//  141  299:iconst_2        
	//  142  300:invokeinterface #418 <Method void DecorContentParent.initFeature(int)>
					obj = ((Object) (viewgroup));
	//  143  305:aload_2         
	//  144  306:astore_1        
					if(mFeatureIndeterminateProgress)
	//* 145  307:aload_0         
	//* 146  308:getfield        #422 <Field boolean mFeatureIndeterminateProgress>
	//* 147  311:ifeq            408
					{
						mDecorContentParent.initFeature(5);
	//  148  314:aload_0         
	//  149  315:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//  150  318:iconst_5        
	//  151  319:invokeinterface #418 <Method void DecorContentParent.initFeature(int)>
						obj = ((Object) (viewgroup));
	//  152  324:aload_2         
	//  153  325:astore_1        
					}
				} else
	//* 154  326:goto            408
				{
					obj = null;
	//  155  329:aconst_null     
	//  156  330:astore_1        
				}
			} else
	//* 157  331:goto            408
			{
				if(mOverlayActionMode)
	//* 158  334:aload_0         
	//* 159  335:getfield        #424 <Field boolean mOverlayActionMode>
	//* 160  338:ifeq            356
					obj = ((Object) ((ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode, ((ViewGroup) (null)))));
	//  161  341:aload_1         
	//  162  342:getstatic       #427 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple_overlay_action_mode>
	//  163  345:aconst_null     
	//  164  346:invokevirtual   #366 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  165  349:checkcast       #233 <Class ViewGroup>
	//  166  352:astore_1        
				else
	//* 167  353:goto            368
					obj = ((Object) ((ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple, ((ViewGroup) (null)))));
	//  168  356:aload_1         
	//  169  357:getstatic       #430 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple>
	//  170  360:aconst_null     
	//  171  361:invokevirtual   #366 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  172  364:checkcast       #233 <Class ViewGroup>
	//  173  367:astore_1        
				if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 174  368:getstatic       #145 <Field int android.os.Build$VERSION.SDK_INT>
	//* 175  371:bipush          21
	//* 176  373:icmplt          391
					ViewCompat.setOnApplyWindowInsetsListener(((View) (obj)), new OnApplyWindowInsetsListener() {

						public WindowInsetsCompat onApplyWindowInsets(View view1, WindowInsetsCompat windowinsetscompat)
						{
							int i = windowinsetscompat.getSystemWindowInsetTop();
						//    0    0:aload_2         
						//    1    1:invokevirtual   #29  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
						//    2    4:istore_3        
							int j = updateStatusGuard(i);
						//    3    5:aload_0         
						//    4    6:getfield        #17  <Field AppCompatDelegateImpl this$0>
						//    5    9:iload_3         
						//    6   10:invokevirtual   #33  <Method int AppCompatDelegateImpl.updateStatusGuard(int)>
						//    7   13:istore          4
							WindowInsetsCompat windowinsetscompat1 = windowinsetscompat;
						//    8   15:aload_2         
						//    9   16:astore          5
							if(i != j)
						//*  10   18:iload_3         
						//*  11   19:iload           4
						//*  12   21:icmpeq          44
								windowinsetscompat1 = windowinsetscompat.replaceSystemWindowInsets(windowinsetscompat.getSystemWindowInsetLeft(), j, windowinsetscompat.getSystemWindowInsetRight(), windowinsetscompat.getSystemWindowInsetBottom());
						//   13   24:aload_2         
						//   14   25:aload_2         
						//   15   26:invokevirtual   #36  <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
						//   16   29:iload           4
						//   17   31:aload_2         
						//   18   32:invokevirtual   #39  <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
						//   19   35:aload_2         
						//   20   36:invokevirtual   #42  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
						//   21   39:invokevirtual   #46  <Method WindowInsetsCompat WindowInsetsCompat.replaceSystemWindowInsets(int, int, int, int)>
						//   22   42:astore          5
							return ViewCompat.onApplyWindowInsets(view1, windowinsetscompat1);
						//   23   44:aload_1         
						//   24   45:aload           5
						//   25   47:invokestatic    #50  <Method WindowInsetsCompat ViewCompat.onApplyWindowInsets(View, WindowInsetsCompat)>
						//   26   50:areturn         
						}

						final AppCompatDelegateImpl this$0;

			
			{
				this$0 = AppCompatDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppCompatDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
	//  177  376:aload_1         
	//  178  377:new             #14  <Class AppCompatDelegateImpl$3>
	//  179  380:dup             
	//  180  381:aload_0         
	//  181  382:invokespecial   #431 <Method void AppCompatDelegateImpl$3(AppCompatDelegateImpl)>
	//  182  385:invokestatic    #437 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
				else
	//* 183  388:goto            408
					((FitWindowsViewGroup)obj).setOnFitSystemWindowsListener(new android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener() {

						public void onFitSystemWindows(Rect rect)
						{
							rect.top = updateStatusGuard(rect.top);
						//    0    0:aload_1         
						//    1    1:aload_0         
						//    2    2:getfield        #17  <Field AppCompatDelegateImpl this$0>
						//    3    5:aload_1         
						//    4    6:getfield        #29  <Field int Rect.top>
						//    5    9:invokevirtual   #33  <Method int AppCompatDelegateImpl.updateStatusGuard(int)>
						//    6   12:putfield        #29  <Field int Rect.top>
						//    7   15:return          
						}

						final AppCompatDelegateImpl this$0;

			
			{
				this$0 = AppCompatDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppCompatDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
	//  184  391:aload_1         
	//  185  392:checkcast       #439 <Class FitWindowsViewGroup>
	//  186  395:new             #16  <Class AppCompatDelegateImpl$4>
	//  187  398:dup             
	//  188  399:aload_0         
	//  189  400:invokespecial   #440 <Method void AppCompatDelegateImpl$4(AppCompatDelegateImpl)>
	//  190  403:invokeinterface #444 <Method void FitWindowsViewGroup.setOnFitSystemWindowsListener(android.support.v7.widget.FitWindowsViewGroup$OnFitSystemWindowsListener)>
			}
			if(obj != null)
	//* 191  408:aload_1         
	//* 192  409:ifnull          541
			{
				if(mDecorContentParent == null)
	//* 193  412:aload_0         
	//* 194  413:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//* 195  416:ifnonnull       433
					mTitleView = (TextView)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.title);
	//  196  419:aload_0         
	//  197  420:aload_1         
	//  198  421:getstatic       #447 <Field int android.support.v7.appcompat.R$id.title>
	//  199  424:invokevirtual   #237 <Method View ViewGroup.findViewById(int)>
	//  200  427:checkcast       #449 <Class TextView>
	//  201  430:putfield        #451 <Field TextView mTitleView>
				ViewUtils.makeOptionalFitsSystemWindows(((View) (obj)));
	//  202  433:aload_1         
	//  203  434:invokestatic    #457 <Method void ViewUtils.makeOptionalFitsSystemWindows(View)>
				ContentFrameLayout contentframelayout = (ContentFrameLayout)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content);
	//  204  437:aload_1         
	//  205  438:getstatic       #460 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
	//  206  441:invokevirtual   #237 <Method View ViewGroup.findViewById(int)>
	//  207  444:checkcast       #239 <Class ContentFrameLayout>
	//  208  447:astore_2        
				ViewGroup viewgroup1 = (ViewGroup)mWindow.findViewById(0x1020002);
	//  209  448:aload_0         
	//  210  449:getfield        #184 <Field Window mWindow>
	//  211  452:ldc1            #231 <Int 0x1020002>
	//  212  454:invokevirtual   #461 <Method View Window.findViewById(int)>
	//  213  457:checkcast       #233 <Class ViewGroup>
	//  214  460:astore_3        
				if(viewgroup1 != null)
	//* 215  461:aload_3         
	//* 216  462:ifnull          519
				{
					View view;
					for(; viewgroup1.getChildCount() > 0; contentframelayout.addView(view))
	//* 217  465:aload_3         
	//* 218  466:invokevirtual   #464 <Method int ViewGroup.getChildCount()>
	//* 219  469:ifle            493
					{
						view = viewgroup1.getChildAt(0);
	//  220  472:aload_3         
	//  221  473:iconst_0        
	//  222  474:invokevirtual   #467 <Method View ViewGroup.getChildAt(int)>
	//  223  477:astore          4
						viewgroup1.removeViewAt(0);
	//  224  479:aload_3         
	//  225  480:iconst_0        
	//  226  481:invokevirtual   #470 <Method void ViewGroup.removeViewAt(int)>
					}

	//  227  484:aload_2         
	//  228  485:aload           4
	//  229  487:invokevirtual   #473 <Method void ContentFrameLayout.addView(View)>
	//* 230  490:goto            465
					viewgroup1.setId(-1);
	//  231  493:aload_3         
	//  232  494:iconst_m1       
	//  233  495:invokevirtual   #476 <Method void ViewGroup.setId(int)>
					contentframelayout.setId(0x1020002);
	//  234  498:aload_2         
	//  235  499:ldc1            #231 <Int 0x1020002>
	//  236  501:invokevirtual   #477 <Method void ContentFrameLayout.setId(int)>
					if(viewgroup1 instanceof FrameLayout)
	//* 237  504:aload_3         
	//* 238  505:instanceof      #479 <Class FrameLayout>
	//* 239  508:ifeq            519
						((FrameLayout)viewgroup1).setForeground(((Drawable) (null)));
	//  240  511:aload_3         
	//  241  512:checkcast       #479 <Class FrameLayout>
	//  242  515:aconst_null     
	//  243  516:invokevirtual   #482 <Method void FrameLayout.setForeground(Drawable)>
				}
				mWindow.setContentView(((View) (obj)));
	//  244  519:aload_0         
	//  245  520:getfield        #184 <Field Window mWindow>
	//  246  523:aload_1         
	//  247  524:invokevirtual   #485 <Method void Window.setContentView(View)>
				contentframelayout.setAttachListener(new android.support.v7.widget.ContentFrameLayout.OnAttachListener() {

					public void onAttachedFromWindow()
					{
					//    0    0:return          
					}

					public void onDetachedFromWindow()
					{
						dismissPopups();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field AppCompatDelegateImpl this$0>
					//    2    4:invokevirtual   #26  <Method void AppCompatDelegateImpl.dismissPopups()>
					//    3    7:return          
					}

					final AppCompatDelegateImpl this$0;

			
			{
				this$0 = AppCompatDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppCompatDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//  248  527:aload_2         
	//  249  528:new             #18  <Class AppCompatDelegateImpl$5>
	//  250  531:dup             
	//  251  532:aload_0         
	//  252  533:invokespecial   #486 <Method void AppCompatDelegateImpl$5(AppCompatDelegateImpl)>
	//  253  536:invokevirtual   #490 <Method void ContentFrameLayout.setAttachListener(android.support.v7.widget.ContentFrameLayout$OnAttachListener)>
				return ((ViewGroup) (obj));
	//  254  539:aload_1         
	//  255  540:areturn         
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//  256  541:new             #492 <Class StringBuilder>
	//  257  544:dup             
	//  258  545:invokespecial   #493 <Method void StringBuilder()>
	//  259  548:astore_1        
				((StringBuilder) (obj)).append("AppCompat does not support the current theme features: { windowActionBar: ");
	//  260  549:aload_1         
	//  261  550:ldc2            #495 <String "AppCompat does not support the current theme features: { windowActionBar: ">
	//  262  553:invokevirtual   #499 <Method StringBuilder StringBuilder.append(String)>
	//  263  556:pop             
				((StringBuilder) (obj)).append(mHasActionBar);
	//  264  557:aload_1         
	//  265  558:aload_0         
	//  266  559:getfield        #370 <Field boolean mHasActionBar>
	//  267  562:invokevirtual   #502 <Method StringBuilder StringBuilder.append(boolean)>
	//  268  565:pop             
				((StringBuilder) (obj)).append(", windowActionBarOverlay: ");
	//  269  566:aload_1         
	//  270  567:ldc2            #504 <String ", windowActionBarOverlay: ">
	//  271  570:invokevirtual   #499 <Method StringBuilder StringBuilder.append(String)>
	//  272  573:pop             
				((StringBuilder) (obj)).append(mOverlayActionBar);
	//  273  574:aload_1         
	//  274  575:aload_0         
	//  275  576:getfield        #368 <Field boolean mOverlayActionBar>
	//  276  579:invokevirtual   #502 <Method StringBuilder StringBuilder.append(boolean)>
	//  277  582:pop             
				((StringBuilder) (obj)).append(", android:windowIsFloating: ");
	//  278  583:aload_1         
	//  279  584:ldc2            #506 <String ", android:windowIsFloating: ">
	//  280  587:invokevirtual   #499 <Method StringBuilder StringBuilder.append(String)>
	//  281  590:pop             
				((StringBuilder) (obj)).append(mIsFloating);
	//  282  591:aload_1         
	//  283  592:aload_0         
	//  284  593:getfield        #349 <Field boolean mIsFloating>
	//  285  596:invokevirtual   #502 <Method StringBuilder StringBuilder.append(boolean)>
	//  286  599:pop             
				((StringBuilder) (obj)).append(", windowActionModeOverlay: ");
	//  287  600:aload_1         
	//  288  601:ldc2            #508 <String ", windowActionModeOverlay: ">
	//  289  604:invokevirtual   #499 <Method StringBuilder StringBuilder.append(String)>
	//  290  607:pop             
				((StringBuilder) (obj)).append(mOverlayActionMode);
	//  291  608:aload_1         
	//  292  609:aload_0         
	//  293  610:getfield        #424 <Field boolean mOverlayActionMode>
	//  294  613:invokevirtual   #502 <Method StringBuilder StringBuilder.append(boolean)>
	//  295  616:pop             
				((StringBuilder) (obj)).append(", windowNoTitle: ");
	//  296  617:aload_1         
	//  297  618:ldc2            #510 <String ", windowNoTitle: ">
	//  298  621:invokevirtual   #499 <Method StringBuilder StringBuilder.append(String)>
	//  299  624:pop             
				((StringBuilder) (obj)).append(mWindowNoTitle);
	//  300  625:aload_1         
	//  301  626:aload_0         
	//  302  627:getfield        #357 <Field boolean mWindowNoTitle>
	//  303  630:invokevirtual   #502 <Method StringBuilder StringBuilder.append(boolean)>
	//  304  633:pop             
				((StringBuilder) (obj)).append(" }");
	//  305  634:aload_1         
	//  306  635:ldc2            #512 <String " }">
	//  307  638:invokevirtual   #499 <Method StringBuilder StringBuilder.append(String)>
	//  308  641:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  309  642:new             #514 <Class IllegalArgumentException>
	//  310  645:dup             
	//  311  646:aload_1         
	//  312  647:invokevirtual   #518 <Method String StringBuilder.toString()>
	//  313  650:invokespecial   #519 <Method void IllegalArgumentException(String)>
	//  314  653:athrow          
			}
		} else
		{
			((TypedArray) (obj)).recycle();
	//  315  654:aload_1         
	//  316  655:invokevirtual   #320 <Method void TypedArray.recycle()>
			throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
	//  317  658:new             #222 <Class IllegalStateException>
	//  318  661:dup             
	//  319  662:ldc2            #521 <String "You need to use a Theme.AppCompat theme (or descendant) with this activity.">
	//  320  665:invokespecial   #227 <Method void IllegalStateException(String)>
	//  321  668:athrow          
		}
	}

	private void ensureAutoNightModeManager()
	{
		if(mAutoNightModeManager == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #524 <Field AppCompatDelegateImpl$AutoNightModeManager mAutoNightModeManager>
	//*   2    4:ifnonnull       26
			mAutoNightModeManager = new AutoNightModeManager(TwilightManager.getInstance(mContext));
	//    3    7:aload_0         
	//    4    8:new             #40  <Class AppCompatDelegateImpl$AutoNightModeManager>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #182 <Field Context mContext>
	//    9   17:invokestatic    #530 <Method TwilightManager TwilightManager.getInstance(Context)>
	//   10   20:invokespecial   #533 <Method void AppCompatDelegateImpl$AutoNightModeManager(AppCompatDelegateImpl, TwilightManager)>
	//   11   23:putfield        #524 <Field AppCompatDelegateImpl$AutoNightModeManager mAutoNightModeManager>
	//   12   26:return          
	}

	private void ensureSubDecor()
	{
		if(!mSubDecorInstalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #536 <Field boolean mSubDecorInstalled>
	//*   2    4:ifne            126
		{
			mSubDecor = createSubDecor();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #538 <Method ViewGroup createSubDecor()>
	//    6   12:putfield        #230 <Field ViewGroup mSubDecor>
			Object obj = ((Object) (getTitle()));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #542 <Method CharSequence getTitle()>
	//    9   19:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  10   20:aload_1         
	//*  11   21:invokestatic    #548 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   24:ifne            78
			{
				DecorContentParent decorcontentparent = mDecorContentParent;
	//   13   27:aload_0         
	//   14   28:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//   15   31:astore_2        
				if(decorcontentparent != null)
	//*  16   32:aload_2         
	//*  17   33:ifnull          46
					decorcontentparent.setWindowTitle(((CharSequence) (obj)));
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokeinterface #552 <Method void DecorContentParent.setWindowTitle(CharSequence)>
				else
	//*  21   43:goto            78
				if(peekSupportActionBar() != null)
	//*  22   46:aload_0         
	//*  23   47:invokevirtual   #556 <Method ActionBar peekSupportActionBar()>
	//*  24   50:ifnull          64
				{
					peekSupportActionBar().setWindowTitle(((CharSequence) (obj)));
	//   25   53:aload_0         
	//   26   54:invokevirtual   #556 <Method ActionBar peekSupportActionBar()>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #559 <Method void ActionBar.setWindowTitle(CharSequence)>
				} else
	//*  29   61:goto            78
				{
					TextView textview = mTitleView;
	//   30   64:aload_0         
	//   31   65:getfield        #451 <Field TextView mTitleView>
	//   32   68:astore_2        
					if(textview != null)
	//*  33   69:aload_2         
	//*  34   70:ifnull          78
						textview.setText(((CharSequence) (obj)));
	//   35   73:aload_2         
	//   36   74:aload_1         
	//   37   75:invokevirtual   #562 <Method void TextView.setText(CharSequence)>
				}
			}
			applyFixedSizeWindow();
	//   38   78:aload_0         
	//   39   79:invokespecial   #564 <Method void applyFixedSizeWindow()>
			onSubDecorInstalled(mSubDecor);
	//   40   82:aload_0         
	//   41   83:aload_0         
	//   42   84:getfield        #230 <Field ViewGroup mSubDecor>
	//   43   87:invokevirtual   #568 <Method void onSubDecorInstalled(ViewGroup)>
			mSubDecorInstalled = true;
	//   44   90:aload_0         
	//   45   91:iconst_1        
	//   46   92:putfield        #536 <Field boolean mSubDecorInstalled>
			obj = ((Object) (getPanelState(0, false)));
	//   47   95:aload_0         
	//   48   96:iconst_0        
	//   49   97:iconst_0        
	//   50   98:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//   51  101:astore_1        
			if(!mIsDestroyed && (obj == null || ((PanelFeatureState) (obj)).menu == null))
	//*  52  102:aload_0         
	//*  53  103:getfield        #574 <Field boolean mIsDestroyed>
	//*  54  106:ifne            126
	//*  55  109:aload_1         
	//*  56  110:ifnull          120
	//*  57  113:aload_1         
	//*  58  114:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  59  117:ifnonnull       126
				invalidatePanelMenu(108);
	//   60  120:aload_0         
	//   61  121:bipush          108
	//   62  123:invokespecial   #581 <Method void invalidatePanelMenu(int)>
		}
	//   63  126:return          
	}

	private int getNightMode()
	{
		int i = mLocalNightMode;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field int mLocalNightMode>
	//    2    4:istore_1        
		if(i != -100)
	//*   3    5:iload_1         
	//*   4    6:bipush          -100
	//*   5    8:icmpeq          13
			return i;
	//    6   11:iload_1         
	//    7   12:ireturn         
		else
			return getDefaultNightMode();
	//    8   13:invokestatic    #585 <Method int getDefaultNightMode()>
	//    9   16:ireturn         
	}

	private void initWindowDecorActionBar()
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #588 <Method void ensureSubDecor()>
		if(mHasActionBar)
	//*   2    4:aload_0         
	//*   3    5:getfield        #370 <Field boolean mHasActionBar>
	//*   4    8:ifeq            93
		{
			if(mActionBar != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #590 <Field ActionBar mActionBar>
	//*   7   15:ifnull          19
				return;
	//    8   18:return          
			Object obj = ((Object) (mOriginalWindowCallback));
	//    9   19:aload_0         
	//   10   20:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   11   23:astore_1        
			if(obj instanceof Activity)
	//*  12   24:aload_1         
	//*  13   25:instanceof      #592 <Class Activity>
	//*  14   28:ifeq            53
				mActionBar = ((ActionBar) (new WindowDecorActionBar((Activity)obj, mOverlayActionBar)));
	//   15   31:aload_0         
	//   16   32:new             #594 <Class WindowDecorActionBar>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:checkcast       #592 <Class Activity>
	//   20   40:aload_0         
	//   21   41:getfield        #368 <Field boolean mOverlayActionBar>
	//   22   44:invokespecial   #597 <Method void WindowDecorActionBar(Activity, boolean)>
	//   23   47:putfield        #590 <Field ActionBar mActionBar>
			else
	//*  24   50:goto            75
			if(obj instanceof Dialog)
	//*  25   53:aload_1         
	//*  26   54:instanceof      #599 <Class Dialog>
	//*  27   57:ifeq            75
				mActionBar = ((ActionBar) (new WindowDecorActionBar((Dialog)obj)));
	//   28   60:aload_0         
	//   29   61:new             #594 <Class WindowDecorActionBar>
	//   30   64:dup             
	//   31   65:aload_1         
	//   32   66:checkcast       #599 <Class Dialog>
	//   33   69:invokespecial   #602 <Method void WindowDecorActionBar(Dialog)>
	//   34   72:putfield        #590 <Field ActionBar mActionBar>
			obj = ((Object) (mActionBar));
	//   35   75:aload_0         
	//   36   76:getfield        #590 <Field ActionBar mActionBar>
	//   37   79:astore_1        
			if(obj != null)
	//*  38   80:aload_1         
	//*  39   81:ifnull          92
				((ActionBar) (obj)).setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
	//   40   84:aload_1         
	//   41   85:aload_0         
	//   42   86:getfield        #604 <Field boolean mEnableDefaultActionBarUp>
	//   43   89:invokevirtual   #608 <Method void ActionBar.setDefaultDisplayHomeAsUpEnabled(boolean)>
			return;
	//   44   92:return          
		} else
		{
			return;
	//   45   93:return          
		}
	}

	private boolean initializePanelContent(PanelFeatureState panelfeaturestate)
	{
		if(panelfeaturestate.createdPanelView != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #613 <Field View AppCompatDelegateImpl$PanelFeatureState.createdPanelView>
	//*   2    4:ifnull          17
		{
			panelfeaturestate.shownPanelView = panelfeaturestate.createdPanelView;
	//    3    7:aload_1         
	//    4    8:aload_1         
	//    5    9:getfield        #613 <Field View AppCompatDelegateImpl$PanelFeatureState.createdPanelView>
	//    6   12:putfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
			return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
		}
		if(panelfeaturestate.menu == null)
	//*   9   17:aload_1         
	//*  10   18:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  11   21:ifnonnull       26
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		if(mPanelMenuPresenterCallback == null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #618 <Field AppCompatDelegateImpl$PanelMenuPresenterCallback mPanelMenuPresenterCallback>
	//*  16   30:ifnonnull       45
			mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
	//   17   33:aload_0         
	//   18   34:new             #56  <Class AppCompatDelegateImpl$PanelMenuPresenterCallback>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:invokespecial   #619 <Method void AppCompatDelegateImpl$PanelMenuPresenterCallback(AppCompatDelegateImpl)>
	//   22   42:putfield        #618 <Field AppCompatDelegateImpl$PanelMenuPresenterCallback mPanelMenuPresenterCallback>
		panelfeaturestate.shownPanelView = (View)panelfeaturestate.getListMenuView(((android.support.v7.view.menu.MenuPresenter.Callback) (mPanelMenuPresenterCallback)));
	//   23   45:aload_1         
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #618 <Field AppCompatDelegateImpl$PanelMenuPresenterCallback mPanelMenuPresenterCallback>
	//   27   51:invokevirtual   #623 <Method MenuView AppCompatDelegateImpl$PanelFeatureState.getListMenuView(android.support.v7.view.menu.MenuPresenter$Callback)>
	//   28   54:checkcast       #245 <Class View>
	//   29   57:putfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
		return panelfeaturestate.shownPanelView != null;
	//   30   60:aload_1         
	//   31   61:getfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
	//   32   64:ifnull          69
	//   33   67:iconst_1        
	//   34   68:ireturn         
	//   35   69:iconst_0        
	//   36   70:ireturn         
	}

	private boolean initializePanelDecor(PanelFeatureState panelfeaturestate)
	{
		panelfeaturestate.setStyle(getActionBarThemedContext());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #628 <Method Context getActionBarThemedContext()>
	//    3    5:invokevirtual   #632 <Method void AppCompatDelegateImpl$PanelFeatureState.setStyle(Context)>
		panelfeaturestate.decorView = ((ViewGroup) (new ListMenuDecorView(panelfeaturestate.listPresenterContext)));
	//    4    8:aload_1         
	//    5    9:new             #45  <Class AppCompatDelegateImpl$ListMenuDecorView>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #635 <Field Context AppCompatDelegateImpl$PanelFeatureState.listPresenterContext>
	//   10   18:invokespecial   #638 <Method void AppCompatDelegateImpl$ListMenuDecorView(AppCompatDelegateImpl, Context)>
	//   11   21:putfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
		panelfeaturestate.gravity = 81;
	//   12   24:aload_1         
	//   13   25:bipush          81
	//   14   27:putfield        #644 <Field int AppCompatDelegateImpl$PanelFeatureState.gravity>
		return true;
	//   15   30:iconst_1        
	//   16   31:ireturn         
	}

	private boolean initializePanelMenu(PanelFeatureState panelfeaturestate)
	{
		Object obj;
label0:
		{
			Context context = mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field Context mContext>
	//    2    4:astore          4
			if(panelfeaturestate.featureId != 0)
	//*   3    6:aload_1         
	//*   4    7:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//*   5   10:ifeq            25
			{
				obj = ((Object) (context));
	//    6   13:aload           4
	//    7   15:astore_2        
				if(panelfeaturestate.featureId != 108)
					break label0;
	//    8   16:aload_1         
	//    9   17:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//   10   20:bipush          108
	//   11   22:icmpne          191
			}
			obj = ((Object) (context));
	//   12   25:aload           4
	//   13   27:astore_2        
			if(mDecorContentParent != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//*  16   32:ifnull          191
			{
				TypedValue typedvalue = new TypedValue();
	//   17   35:new             #372 <Class TypedValue>
	//   18   38:dup             
	//   19   39:invokespecial   #373 <Method void TypedValue()>
	//   20   42:astore          5
				android.content.res.Resources.Theme theme = context.getTheme();
	//   21   44:aload           4
	//   22   46:invokevirtual   #377 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   23   49:astore          6
				theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedvalue, true);
	//   24   51:aload           6
	//   25   53:getstatic       #382 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//   26   56:aload           5
	//   27   58:iconst_1        
	//   28   59:invokevirtual   #388 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   29   62:pop             
				obj = null;
	//   30   63:aconst_null     
	//   31   64:astore_2        
				if(typedvalue.resourceId != 0)
	//*  32   65:aload           5
	//*  33   67:getfield        #391 <Field int TypedValue.resourceId>
	//*  34   70:ifeq            112
				{
					obj = ((Object) (context.getResources().newTheme()));
	//   35   73:aload           4
	//   36   75:invokevirtual   #652 <Method Resources Context.getResources()>
	//   37   78:invokevirtual   #657 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   38   81:astore_2        
					((android.content.res.Resources.Theme) (obj)).setTo(theme);
	//   39   82:aload_2         
	//   40   83:aload           6
	//   41   85:invokevirtual   #661 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
					((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
	//   42   88:aload_2         
	//   43   89:aload           5
	//   44   91:getfield        #391 <Field int TypedValue.resourceId>
	//   45   94:iconst_1        
	//   46   95:invokevirtual   #665 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
					((android.content.res.Resources.Theme) (obj)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//   47   98:aload_2         
	//   48   99:getstatic       #668 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   49  102:aload           5
	//   50  104:iconst_1        
	//   51  105:invokevirtual   #388 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   52  108:pop             
				} else
	//*  53  109:goto            124
				{
					theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//   54  112:aload           6
	//   55  114:getstatic       #668 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   56  117:aload           5
	//   57  119:iconst_1        
	//   58  120:invokevirtual   #388 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   59  123:pop             
				}
				Object obj1 = obj;
	//   60  124:aload_2         
	//   61  125:astore_3        
				if(typedvalue.resourceId != 0)
	//*  62  126:aload           5
	//*  63  128:getfield        #391 <Field int TypedValue.resourceId>
	//*  64  131:ifeq            165
				{
					obj1 = obj;
	//   65  134:aload_2         
	//   66  135:astore_3        
					if(obj == null)
	//*  67  136:aload_2         
	//*  68  137:ifnonnull       155
					{
						obj1 = ((Object) (context.getResources().newTheme()));
	//   69  140:aload           4
	//   70  142:invokevirtual   #652 <Method Resources Context.getResources()>
	//   71  145:invokevirtual   #657 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   72  148:astore_3        
						((android.content.res.Resources.Theme) (obj1)).setTo(theme);
	//   73  149:aload_3         
	//   74  150:aload           6
	//   75  152:invokevirtual   #661 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
					}
					((android.content.res.Resources.Theme) (obj1)).applyStyle(typedvalue.resourceId, true);
	//   76  155:aload_3         
	//   77  156:aload           5
	//   78  158:getfield        #391 <Field int TypedValue.resourceId>
	//   79  161:iconst_1        
	//   80  162:invokevirtual   #665 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
				}
				obj = ((Object) (context));
	//   81  165:aload           4
	//   82  167:astore_2        
				if(obj1 != null)
	//*  83  168:aload_3         
	//*  84  169:ifnull          191
				{
					obj = ((Object) (new ContextThemeWrapper(context, 0)));
	//   85  172:new             #393 <Class ContextThemeWrapper>
	//   86  175:dup             
	//   87  176:aload           4
	//   88  178:iconst_0        
	//   89  179:invokespecial   #396 <Method void ContextThemeWrapper(Context, int)>
	//   90  182:astore_2        
					((Context) (obj)).getTheme().setTo(((android.content.res.Resources.Theme) (obj1)));
	//   91  183:aload_2         
	//   92  184:invokevirtual   #377 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   93  187:aload_3         
	//   94  188:invokevirtual   #661 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
				}
			}
		}
		obj = ((Object) (new MenuBuilder(((Context) (obj)))));
	//   95  191:new             #670 <Class MenuBuilder>
	//   96  194:dup             
	//   97  195:aload_2         
	//   98  196:invokespecial   #672 <Method void MenuBuilder(Context)>
	//   99  199:astore_2        
		((MenuBuilder) (obj)).setCallback(((android.support.v7.view.menu.MenuBuilder.Callback) (this)));
	//  100  200:aload_2         
	//  101  201:aload_0         
	//  102  202:invokevirtual   #675 <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
		panelfeaturestate.setMenu(((MenuBuilder) (obj)));
	//  103  205:aload_1         
	//  104  206:aload_2         
	//  105  207:invokevirtual   #679 <Method void AppCompatDelegateImpl$PanelFeatureState.setMenu(MenuBuilder)>
		return true;
	//  106  210:iconst_1        
	//  107  211:ireturn         
	}

	private void invalidatePanelMenu(int i)
	{
		mInvalidatePanelMenuFeatures = 1 << i | mInvalidatePanelMenuFeatures;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iload_1         
	//    3    3:ishl            
	//    4    4:aload_0         
	//    5    5:getfield        #681 <Field int mInvalidatePanelMenuFeatures>
	//    6    8:ior             
	//    7    9:putfield        #681 <Field int mInvalidatePanelMenuFeatures>
		if(!mInvalidatePanelMenuPosted)
	//*   8   12:aload_0         
	//*   9   13:getfield        #683 <Field boolean mInvalidatePanelMenuPosted>
	//*  10   16:ifne            38
		{
			ViewCompat.postOnAnimation(mWindow.getDecorView(), mInvalidatePanelMenuRunnable);
	//   11   19:aload_0         
	//   12   20:getfield        #184 <Field Window mWindow>
	//   13   23:invokevirtual   #243 <Method View Window.getDecorView()>
	//   14   26:aload_0         
	//   15   27:getfield        #180 <Field Runnable mInvalidatePanelMenuRunnable>
	//   16   30:invokestatic    #687 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			mInvalidatePanelMenuPosted = true;
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:putfield        #683 <Field boolean mInvalidatePanelMenuPosted>
		}
	//   20   38:return          
	}

	private boolean onKeyDownPanel(int i, KeyEvent keyevent)
	{
		if(keyevent.getRepeatCount() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #694 <Method int KeyEvent.getRepeatCount()>
	//*   2    4:ifne            28
		{
			PanelFeatureState panelfeaturestate = getPanelState(i, true);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//    7   13:astore_3        
			if(!panelfeaturestate.isOpen)
	//*   8   14:aload_3         
	//*   9   15:getfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
	//*  10   18:ifne            28
				return preparePanel(panelfeaturestate, keyevent);
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokespecial   #701 <Method boolean preparePanel(AppCompatDelegateImpl$PanelFeatureState, KeyEvent)>
	//   15   27:ireturn         
		}
		return false;
	//   16   28:iconst_0        
	//   17   29:ireturn         
	}

	private boolean onKeyUpPanel(int i, KeyEvent keyevent)
	{
		boolean flag;
label0:
		{
			PanelFeatureState panelfeaturestate;
label1:
			{
label2:
				{
					if(mActionMode != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #704 <Field ActionMode mActionMode>
	//*   2    4:ifnull          9
						return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
					panelfeaturestate = getPanelState(i, true);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//    9   15:astore          4
					if(i == 0)
	//*  10   17:iload_1         
	//*  11   18:ifne            110
					{
						DecorContentParent decorcontentparent = mDecorContentParent;
	//   12   21:aload_0         
	//   13   22:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//   14   25:astore          5
						if(decorcontentparent != null && decorcontentparent.canShowOverflowMenu() && !ViewConfiguration.get(mContext).hasPermanentMenuKey())
	//*  15   27:aload           5
	//*  16   29:ifnull          110
	//*  17   32:aload           5
	//*  18   34:invokeinterface #708 <Method boolean DecorContentParent.canShowOverflowMenu()>
	//*  19   39:ifeq            110
	//*  20   42:aload_0         
	//*  21   43:getfield        #182 <Field Context mContext>
	//*  22   46:invokestatic    #714 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//*  23   49:invokevirtual   #717 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//*  24   52:ifne            110
						{
							if(!mDecorContentParent.isOverflowMenuShowing())
	//*  25   55:aload_0         
	//*  26   56:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//*  27   59:invokeinterface #720 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  28   64:ifne            97
							{
								if(!mIsDestroyed && preparePanel(panelfeaturestate, keyevent))
	//*  29   67:aload_0         
	//*  30   68:getfield        #574 <Field boolean mIsDestroyed>
	//*  31   71:ifne            180
	//*  32   74:aload_0         
	//*  33   75:aload           4
	//*  34   77:aload_2         
	//*  35   78:invokespecial   #701 <Method boolean preparePanel(AppCompatDelegateImpl$PanelFeatureState, KeyEvent)>
	//*  36   81:ifeq            180
								{
									flag = mDecorContentParent.showOverflowMenu();
	//   37   84:aload_0         
	//   38   85:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//   39   88:invokeinterface #723 <Method boolean DecorContentParent.showOverflowMenu()>
	//   40   93:istore_3        
									break label0;
	//   41   94:goto            198
								}
							} else
							{
								flag = mDecorContentParent.hideOverflowMenu();
	//   42   97:aload_0         
	//   43   98:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//   44  101:invokeinterface #726 <Method boolean DecorContentParent.hideOverflowMenu()>
	//   45  106:istore_3        
								break label0;
	//   46  107:goto            198
							}
							break label2;
						}
					}
					if(panelfeaturestate.isOpen || panelfeaturestate.isHandled)
	//*  47  110:aload           4
	//*  48  112:getfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
	//*  49  115:ifne            185
	//*  50  118:aload           4
	//*  51  120:getfield        #729 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isHandled>
	//*  52  123:ifeq            129
						break label1;
	//   53  126:goto            185
					if(panelfeaturestate.isPrepared)
	//*  54  129:aload           4
	//*  55  131:getfield        #732 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isPrepared>
	//*  56  134:ifeq            180
					{
						if(panelfeaturestate.refreshMenuContent)
	//*  57  137:aload           4
	//*  58  139:getfield        #735 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshMenuContent>
	//*  59  142:ifeq            162
						{
							panelfeaturestate.isPrepared = false;
	//   60  145:aload           4
	//   61  147:iconst_0        
	//   62  148:putfield        #732 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isPrepared>
							flag = preparePanel(panelfeaturestate, keyevent);
	//   63  151:aload_0         
	//   64  152:aload           4
	//   65  154:aload_2         
	//   66  155:invokespecial   #701 <Method boolean preparePanel(AppCompatDelegateImpl$PanelFeatureState, KeyEvent)>
	//   67  158:istore_3        
						} else
	//*  68  159:goto            164
						{
							flag = true;
	//   69  162:iconst_1        
	//   70  163:istore_3        
						}
						if(flag)
	//*  71  164:iload_3         
	//*  72  165:ifeq            180
						{
							openPanel(panelfeaturestate, keyevent);
	//   73  168:aload_0         
	//   74  169:aload           4
	//   75  171:aload_2         
	//   76  172:invokespecial   #739 <Method void openPanel(AppCompatDelegateImpl$PanelFeatureState, KeyEvent)>
							flag = true;
	//   77  175:iconst_1        
	//   78  176:istore_3        
							break label0;
	//   79  177:goto            198
						}
					}
				}
				flag = false;
	//   80  180:iconst_0        
	//   81  181:istore_3        
				break label0;
	//   82  182:goto            198
			}
			flag = panelfeaturestate.isOpen;
	//   83  185:aload           4
	//   84  187:getfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
	//   85  190:istore_3        
			closePanel(panelfeaturestate, true);
	//   86  191:aload_0         
	//   87  192:aload           4
	//   88  194:iconst_1        
	//   89  195:invokevirtual   #743 <Method void closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
		}
		if(flag)
	//*  90  198:iload_3         
	//*  91  199:ifeq            237
		{
			keyevent = ((KeyEvent) ((AudioManager)mContext.getSystemService("audio")));
	//   92  202:aload_0         
	//   93  203:getfield        #182 <Field Context mContext>
	//   94  206:ldc2            #745 <String "audio">
	//   95  209:invokevirtual   #749 <Method Object Context.getSystemService(String)>
	//   96  212:checkcast       #751 <Class AudioManager>
	//   97  215:astore_2        
			if(keyevent != null)
	//*  98  216:aload_2         
	//*  99  217:ifnull          227
			{
				((AudioManager) (keyevent)).playSoundEffect(0);
	//  100  220:aload_2         
	//  101  221:iconst_0        
	//  102  222:invokevirtual   #754 <Method void AudioManager.playSoundEffect(int)>
				return flag;
	//  103  225:iload_3         
	//  104  226:ireturn         
			}
			Log.w("AppCompatDelegate", "Couldn't get audio manager");
	//  105  227:ldc2            #756 <String "AppCompatDelegate">
	//  106  230:ldc2            #758 <String "Couldn't get audio manager">
	//  107  233:invokestatic    #764 <Method int Log.w(String, String)>
	//  108  236:pop             
		}
		return flag;
	//  109  237:iload_3         
	//  110  238:ireturn         
	}

	private void openPanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
	{
label0:
		{
label1:
			{
				int i;
				WindowManager windowmanager;
label2:
				{
					if(panelfeaturestate.isOpen)
						break label0;
	//    0    0:aload_1         
	//    1    1:getfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
	//    2    4:ifne            409
					if(mIsDestroyed)
	//*   3    7:aload_0         
	//*   4    8:getfield        #574 <Field boolean mIsDestroyed>
	//*   5   11:ifeq            15
						return;
	//    6   14:return          
					if(panelfeaturestate.featureId == 0)
	//*   7   15:aload_1         
	//*   8   16:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//*   9   19:ifne            54
					{
						boolean flag;
						if((mContext.getResources().getConfiguration().screenLayout & 0xf) == 4)
	//*  10   22:aload_0         
	//*  11   23:getfield        #182 <Field Context mContext>
	//*  12   26:invokevirtual   #652 <Method Resources Context.getResources()>
	//*  13   29:invokevirtual   #768 <Method Configuration Resources.getConfiguration()>
	//*  14   32:getfield        #773 <Field int Configuration.screenLayout>
	//*  15   35:bipush          15
	//*  16   37:iand            
	//*  17   38:iconst_4        
	//*  18   39:icmpne          47
							flag = true;
	//   19   42:iconst_1        
	//   20   43:istore_3        
						else
	//*  21   44:goto            49
							flag = false;
	//   22   47:iconst_0        
	//   23   48:istore_3        
						if(flag)
	//*  24   49:iload_3         
	//*  25   50:ifeq            54
							return;
	//   26   53:return          
					}
					android.view.Window.Callback callback = getWindowCallback();
	//   27   54:aload_0         
	//   28   55:invokevirtual   #411 <Method android.view.Window$Callback getWindowCallback()>
	//   29   58:astore          4
					if(callback != null && !callback.onMenuOpened(panelfeaturestate.featureId, ((Menu) (panelfeaturestate.menu))))
	//*  30   60:aload           4
	//*  31   62:ifnull          90
	//*  32   65:aload           4
	//*  33   67:aload_1         
	//*  34   68:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//*  35   71:aload_1         
	//*  36   72:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  37   75:invokeinterface #779 <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//*  38   80:ifne            90
					{
						closePanel(panelfeaturestate, true);
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:iconst_1        
	//   42   86:invokevirtual   #743 <Method void closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
						return;
	//   43   89:return          
					}
					windowmanager = (WindowManager)mContext.getSystemService("window");
	//   44   90:aload_0         
	//   45   91:getfield        #182 <Field Context mContext>
	//   46   94:ldc2            #781 <String "window">
	//   47   97:invokevirtual   #749 <Method Object Context.getSystemService(String)>
	//   48  100:checkcast       #783 <Class WindowManager>
	//   49  103:astore          5
					if(windowmanager == null)
	//*  50  105:aload           5
	//*  51  107:ifnonnull       111
						return;
	//   52  110:return          
					if(!preparePanel(panelfeaturestate, keyevent))
	//*  53  111:aload_0         
	//*  54  112:aload_1         
	//*  55  113:aload_2         
	//*  56  114:invokespecial   #701 <Method boolean preparePanel(AppCompatDelegateImpl$PanelFeatureState, KeyEvent)>
	//*  57  117:ifne            121
						return;
	//   58  120:return          
					if(panelfeaturestate.decorView != null && !panelfeaturestate.refreshDecorView)
	//*  59  121:aload_1         
	//*  60  122:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//*  61  125:ifnull          170
	//*  62  128:aload_1         
	//*  63  129:getfield        #786 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshDecorView>
	//*  64  132:ifeq            138
	//*  65  135:goto            170
					{
						if(panelfeaturestate.createdPanelView != null)
	//*  66  138:aload_1         
	//*  67  139:getfield        #613 <Field View AppCompatDelegateImpl$PanelFeatureState.createdPanelView>
	//*  68  142:ifnull          339
						{
							keyevent = ((KeyEvent) (panelfeaturestate.createdPanelView.getLayoutParams()));
	//   69  145:aload_1         
	//   70  146:getfield        #613 <Field View AppCompatDelegateImpl$PanelFeatureState.createdPanelView>
	//   71  149:invokevirtual   #790 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  152:astore_2        
							if(keyevent != null && ((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1)
	//*  73  153:aload_2         
	//*  74  154:ifnull          339
	//*  75  157:aload_2         
	//*  76  158:getfield        #795 <Field int android.view.ViewGroup$LayoutParams.width>
	//*  77  161:iconst_m1       
	//*  78  162:icmpne          339
							{
								i = -1;
	//   79  165:iconst_m1       
	//   80  166:istore_3        
								break label2;
	//   81  167:goto            342
							}
						}
					} else
					{
						if(panelfeaturestate.decorView == null)
	//*  82  170:aload_1         
	//*  83  171:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//*  84  174:ifnonnull       193
						{
							if(!initializePanelDecor(panelfeaturestate) || panelfeaturestate.decorView == null)
	//*  85  177:aload_0         
	//*  86  178:aload_1         
	//*  87  179:invokespecial   #797 <Method boolean initializePanelDecor(AppCompatDelegateImpl$PanelFeatureState)>
	//*  88  182:ifeq            192
	//*  89  185:aload_1         
	//*  90  186:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//*  91  189:ifnonnull       217
								return;
	//   92  192:return          
						} else
						if(panelfeaturestate.refreshDecorView && panelfeaturestate.decorView.getChildCount() > 0)
	//*  93  193:aload_1         
	//*  94  194:getfield        #786 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshDecorView>
	//*  95  197:ifeq            217
	//*  96  200:aload_1         
	//*  97  201:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//*  98  204:invokevirtual   #464 <Method int ViewGroup.getChildCount()>
	//*  99  207:ifle            217
							panelfeaturestate.decorView.removeAllViews();
	//  100  210:aload_1         
	//  101  211:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//  102  214:invokevirtual   #800 <Method void ViewGroup.removeAllViews()>
						if(!initializePanelContent(panelfeaturestate))
							break label1;
	//  103  217:aload_0         
	//  104  218:aload_1         
	//  105  219:invokespecial   #802 <Method boolean initializePanelContent(AppCompatDelegateImpl$PanelFeatureState)>
	//  106  222:ifeq            408
						if(!panelfeaturestate.hasPanelItems())
	//* 107  225:aload_1         
	//* 108  226:invokevirtual   #805 <Method boolean AppCompatDelegateImpl$PanelFeatureState.hasPanelItems()>
	//* 109  229:ifne            233
							return;
	//  110  232:return          
						Object obj = ((Object) (panelfeaturestate.shownPanelView.getLayoutParams()));
	//  111  233:aload_1         
	//  112  234:getfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
	//  113  237:invokevirtual   #790 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  114  240:astore          4
						keyevent = ((KeyEvent) (obj));
	//  115  242:aload           4
	//  116  244:astore_2        
						if(obj == null)
	//* 117  245:aload           4
	//* 118  247:ifnonnull       262
							keyevent = ((KeyEvent) (new android.view.ViewGroup.LayoutParams(-2, -2)));
	//  119  250:new             #792 <Class android.view.ViewGroup$LayoutParams>
	//  120  253:dup             
	//  121  254:bipush          -2
	//  122  256:bipush          -2
	//  123  258:invokespecial   #808 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  124  261:astore_2        
						i = panelfeaturestate.background;
	//  125  262:aload_1         
	//  126  263:getfield        #811 <Field int AppCompatDelegateImpl$PanelFeatureState.background>
	//  127  266:istore_3        
						panelfeaturestate.decorView.setBackgroundResource(i);
	//  128  267:aload_1         
	//  129  268:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//  130  271:iload_3         
	//  131  272:invokevirtual   #814 <Method void ViewGroup.setBackgroundResource(int)>
						obj = ((Object) (panelfeaturestate.shownPanelView.getParent()));
	//  132  275:aload_1         
	//  133  276:getfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
	//  134  279:invokevirtual   #818 <Method ViewParent View.getParent()>
	//  135  282:astore          4
						if(obj != null && (obj instanceof ViewGroup))
	//* 136  284:aload           4
	//* 137  286:ifnull          309
	//* 138  289:aload           4
	//* 139  291:instanceof      #233 <Class ViewGroup>
	//* 140  294:ifeq            309
							((ViewGroup)obj).removeView(panelfeaturestate.shownPanelView);
	//  141  297:aload           4
	//  142  299:checkcast       #233 <Class ViewGroup>
	//  143  302:aload_1         
	//  144  303:getfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
	//  145  306:invokevirtual   #821 <Method void ViewGroup.removeView(View)>
						panelfeaturestate.decorView.addView(panelfeaturestate.shownPanelView, ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  146  309:aload_1         
	//  147  310:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//  148  313:aload_1         
	//  149  314:getfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
	//  150  317:aload_2         
	//  151  318:invokevirtual   #824 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
						if(!panelfeaturestate.shownPanelView.hasFocus())
	//* 152  321:aload_1         
	//* 153  322:getfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
	//* 154  325:invokevirtual   #827 <Method boolean View.hasFocus()>
	//* 155  328:ifne            339
							panelfeaturestate.shownPanelView.requestFocus();
	//  156  331:aload_1         
	//  157  332:getfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
	//  158  335:invokevirtual   #830 <Method boolean View.requestFocus()>
	//  159  338:pop             
					}
					i = -2;
	//  160  339:bipush          -2
	//  161  341:istore_3        
				}
				panelfeaturestate.isHandled = false;
	//  162  342:aload_1         
	//  163  343:iconst_0        
	//  164  344:putfield        #729 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isHandled>
				keyevent = ((KeyEvent) (new android.view.WindowManager.LayoutParams(i, -2, panelfeaturestate.x, panelfeaturestate.y, 1002, 0x820000, -3)));
	//  165  347:new             #832 <Class android.view.WindowManager$LayoutParams>
	//  166  350:dup             
	//  167  351:iload_3         
	//  168  352:bipush          -2
	//  169  354:aload_1         
	//  170  355:getfield        #835 <Field int AppCompatDelegateImpl$PanelFeatureState.x>
	//  171  358:aload_1         
	//  172  359:getfield        #838 <Field int AppCompatDelegateImpl$PanelFeatureState.y>
	//  173  362:sipush          1002
	//  174  365:ldc2            #839 <Int 0x820000>
	//  175  368:bipush          -3
	//  176  370:invokespecial   #842 <Method void android.view.WindowManager$LayoutParams(int, int, int, int, int, int, int)>
	//  177  373:astore_2        
				keyevent.gravity = panelfeaturestate.gravity;
	//  178  374:aload_2         
	//  179  375:aload_1         
	//  180  376:getfield        #644 <Field int AppCompatDelegateImpl$PanelFeatureState.gravity>
	//  181  379:putfield        #843 <Field int android.view.WindowManager$LayoutParams.gravity>
				keyevent.windowAnimations = panelfeaturestate.windowAnimations;
	//  182  382:aload_2         
	//  183  383:aload_1         
	//  184  384:getfield        #846 <Field int AppCompatDelegateImpl$PanelFeatureState.windowAnimations>
	//  185  387:putfield        #847 <Field int android.view.WindowManager$LayoutParams.windowAnimations>
				windowmanager.addView(((View) (panelfeaturestate.decorView)), ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  186  390:aload           5
	//  187  392:aload_1         
	//  188  393:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//  189  396:aload_2         
	//  190  397:invokeinterface #848 <Method void WindowManager.addView(View, android.view.ViewGroup$LayoutParams)>
				panelfeaturestate.isOpen = true;
	//  191  402:aload_1         
	//  192  403:iconst_1        
	//  193  404:putfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
				return;
	//  194  407:return          
			}
			return;
	//  195  408:return          
		}
	//  196  409:return          
	}

	private boolean performPanelShortcut(PanelFeatureState panelfeaturestate, int i, KeyEvent keyevent, int j)
	{
		boolean flag;
label0:
		{
			flag = keyevent.isSystem();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #853 <Method boolean KeyEvent.isSystem()>
	//    2    4:istore          5
			boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          6
			if(flag)
	//*   5    9:iload           5
	//*   6   11:ifeq            16
				return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
			if(!panelfeaturestate.isPrepared)
	//*   9   16:aload_1         
	//*  10   17:getfield        #732 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isPrepared>
	//*  11   20:ifne            36
			{
				flag = flag1;
	//   12   23:iload           6
	//   13   25:istore          5
				if(!preparePanel(panelfeaturestate, keyevent))
					break label0;
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:aload_3         
	//   17   30:invokespecial   #701 <Method boolean preparePanel(AppCompatDelegateImpl$PanelFeatureState, KeyEvent)>
	//   18   33:ifeq            60
			}
			flag = flag1;
	//   19   36:iload           6
	//   20   38:istore          5
			if(panelfeaturestate.menu != null)
	//*  21   40:aload_1         
	//*  22   41:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  23   44:ifnull          60
				flag = panelfeaturestate.menu.performShortcut(i, keyevent, j);
	//   24   47:aload_1         
	//   25   48:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//   26   51:iload_2         
	//   27   52:aload_3         
	//   28   53:iload           4
	//   29   55:invokevirtual   #857 <Method boolean MenuBuilder.performShortcut(int, KeyEvent, int)>
	//   30   58:istore          5
		}
		if(flag && (j & 1) == 0 && mDecorContentParent == null)
	//*  31   60:iload           5
	//*  32   62:ifeq            85
	//*  33   65:iload           4
	//*  34   67:iconst_1        
	//*  35   68:iand            
	//*  36   69:ifne            85
	//*  37   72:aload_0         
	//*  38   73:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//*  39   76:ifnonnull       85
			closePanel(panelfeaturestate, true);
	//   40   79:aload_0         
	//   41   80:aload_1         
	//   42   81:iconst_1        
	//   43   82:invokevirtual   #743 <Method void closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
		return flag;
	//   44   85:iload           5
	//   45   87:ireturn         
	}

	private boolean preparePanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
	{
		if(mIsDestroyed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #574 <Field boolean mIsDestroyed>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(panelfeaturestate.isPrepared)
	//*   5    9:aload_1         
	//*   6   10:getfield        #732 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isPrepared>
	//*   7   13:ifeq            18
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		Object obj = ((Object) (mPreparedPanel));
	//   10   18:aload_0         
	//   11   19:getfield        #859 <Field AppCompatDelegateImpl$PanelFeatureState mPreparedPanel>
	//   12   22:astore          5
		if(obj != null && obj != panelfeaturestate)
	//*  13   24:aload           5
	//*  14   26:ifnull          42
	//*  15   29:aload           5
	//*  16   31:aload_1         
	//*  17   32:if_acmpeq       42
			closePanel(((PanelFeatureState) (obj)), false);
	//   18   35:aload_0         
	//   19   36:aload           5
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #743 <Method void closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
		obj = ((Object) (getWindowCallback()));
	//   22   42:aload_0         
	//   23   43:invokevirtual   #411 <Method android.view.Window$Callback getWindowCallback()>
	//   24   46:astore          5
		if(obj != null)
	//*  25   48:aload           5
	//*  26   50:ifnull          68
			panelfeaturestate.createdPanelView = ((android.view.Window.Callback) (obj)).onCreatePanelView(panelfeaturestate.featureId);
	//   27   53:aload_1         
	//   28   54:aload           5
	//   29   56:aload_1         
	//   30   57:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//   31   60:invokeinterface #862 <Method View android.view.Window$Callback.onCreatePanelView(int)>
	//   32   65:putfield        #613 <Field View AppCompatDelegateImpl$PanelFeatureState.createdPanelView>
		boolean flag;
		if(panelfeaturestate.featureId != 0 && panelfeaturestate.featureId != 108)
	//*  33   68:aload_1         
	//*  34   69:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//*  35   72:ifeq            92
	//*  36   75:aload_1         
	//*  37   76:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//*  38   79:bipush          108
	//*  39   81:icmpne          87
	//*  40   84:goto            92
			flag = false;
	//   41   87:iconst_0        
	//   42   88:istore_3        
		else
	//*  43   89:goto            94
			flag = true;
	//   44   92:iconst_1        
	//   45   93:istore_3        
		if(flag)
	//*  46   94:iload_3         
	//*  47   95:ifeq            116
		{
			DecorContentParent decorcontentparent = mDecorContentParent;
	//   48   98:aload_0         
	//   49   99:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//   50  102:astore          6
			if(decorcontentparent != null)
	//*  51  104:aload           6
	//*  52  106:ifnull          116
				decorcontentparent.setMenuPrepared();
	//   53  109:aload           6
	//   54  111:invokeinterface #865 <Method void DecorContentParent.setMenuPrepared()>
		}
		if(panelfeaturestate.createdPanelView == null && (!flag || !(peekSupportActionBar() instanceof ToolbarActionBar)))
	//*  55  116:aload_1         
	//*  56  117:getfield        #613 <Field View AppCompatDelegateImpl$PanelFeatureState.createdPanelView>
	//*  57  120:ifnonnull       423
	//*  58  123:iload_3         
	//*  59  124:ifeq            137
	//*  60  127:aload_0         
	//*  61  128:invokevirtual   #556 <Method ActionBar peekSupportActionBar()>
	//*  62  131:instanceof      #867 <Class ToolbarActionBar>
	//*  63  134:ifne            423
		{
			if(panelfeaturestate.menu == null || panelfeaturestate.refreshMenuContent)
	//*  64  137:aload_1         
	//*  65  138:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  66  141:ifnull          151
	//*  67  144:aload_1         
	//*  68  145:getfield        #735 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshMenuContent>
	//*  69  148:ifeq            283
			{
				if(panelfeaturestate.menu == null && (!initializePanelMenu(panelfeaturestate) || panelfeaturestate.menu == null))
	//*  70  151:aload_1         
	//*  71  152:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  72  155:ifnonnull       175
	//*  73  158:aload_0         
	//*  74  159:aload_1         
	//*  75  160:invokespecial   #869 <Method boolean initializePanelMenu(AppCompatDelegateImpl$PanelFeatureState)>
	//*  76  163:ifeq            173
	//*  77  166:aload_1         
	//*  78  167:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  79  170:ifnonnull       175
					return false;
	//   80  173:iconst_0        
	//   81  174:ireturn         
				if(flag && mDecorContentParent != null)
	//*  82  175:iload_3         
	//*  83  176:ifeq            222
	//*  84  179:aload_0         
	//*  85  180:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//*  86  183:ifnull          222
				{
					if(mActionMenuPresenterCallback == null)
	//*  87  186:aload_0         
	//*  88  187:getfield        #871 <Field AppCompatDelegateImpl$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//*  89  190:ifnonnull       205
						mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
	//   90  193:aload_0         
	//   91  194:new             #29  <Class AppCompatDelegateImpl$ActionMenuPresenterCallback>
	//   92  197:dup             
	//   93  198:aload_0         
	//   94  199:invokespecial   #872 <Method void AppCompatDelegateImpl$ActionMenuPresenterCallback(AppCompatDelegateImpl)>
	//   95  202:putfield        #871 <Field AppCompatDelegateImpl$ActionMenuPresenterCallback mActionMenuPresenterCallback>
					mDecorContentParent.setMenu(((Menu) (panelfeaturestate.menu)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//   96  205:aload_0         
	//   97  206:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//   98  209:aload_1         
	//   99  210:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//  100  213:aload_0         
	//  101  214:getfield        #871 <Field AppCompatDelegateImpl$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  102  217:invokeinterface #875 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
				}
				panelfeaturestate.menu.stopDispatchingItemsChanged();
	//  103  222:aload_1         
	//  104  223:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//  105  226:invokevirtual   #878 <Method void MenuBuilder.stopDispatchingItemsChanged()>
				if(!((android.view.Window.Callback) (obj)).onCreatePanelMenu(panelfeaturestate.featureId, ((Menu) (panelfeaturestate.menu))))
	//* 106  229:aload           5
	//* 107  231:aload_1         
	//* 108  232:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//* 109  235:aload_1         
	//* 110  236:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//* 111  239:invokeinterface #881 <Method boolean android.view.Window$Callback.onCreatePanelMenu(int, Menu)>
	//* 112  244:ifne            278
				{
					panelfeaturestate.setMenu(((MenuBuilder) (null)));
	//  113  247:aload_1         
	//  114  248:aconst_null     
	//  115  249:invokevirtual   #679 <Method void AppCompatDelegateImpl$PanelFeatureState.setMenu(MenuBuilder)>
					if(flag)
	//* 116  252:iload_3         
	//* 117  253:ifeq            276
					{
						panelfeaturestate = ((PanelFeatureState) (mDecorContentParent));
	//  118  256:aload_0         
	//  119  257:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//  120  260:astore_1        
						if(panelfeaturestate != null)
	//* 121  261:aload_1         
	//* 122  262:ifnull          276
							((DecorContentParent) (panelfeaturestate)).setMenu(((Menu) (null)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//  123  265:aload_1         
	//  124  266:aconst_null     
	//  125  267:aload_0         
	//  126  268:getfield        #871 <Field AppCompatDelegateImpl$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  127  271:invokeinterface #875 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
					}
					return false;
	//  128  276:iconst_0        
	//  129  277:ireturn         
				}
				panelfeaturestate.refreshMenuContent = false;
	//  130  278:aload_1         
	//  131  279:iconst_0        
	//  132  280:putfield        #735 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshMenuContent>
			}
			panelfeaturestate.menu.stopDispatchingItemsChanged();
	//  133  283:aload_1         
	//  134  284:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//  135  287:invokevirtual   #878 <Method void MenuBuilder.stopDispatchingItemsChanged()>
			if(panelfeaturestate.frozenActionViewState != null)
	//* 136  290:aload_1         
	//* 137  291:getfield        #885 <Field Bundle AppCompatDelegateImpl$PanelFeatureState.frozenActionViewState>
	//* 138  294:ifnull          313
			{
				panelfeaturestate.menu.restoreActionViewStates(panelfeaturestate.frozenActionViewState);
	//  139  297:aload_1         
	//  140  298:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//  141  301:aload_1         
	//  142  302:getfield        #885 <Field Bundle AppCompatDelegateImpl$PanelFeatureState.frozenActionViewState>
	//  143  305:invokevirtual   #889 <Method void MenuBuilder.restoreActionViewStates(Bundle)>
				panelfeaturestate.frozenActionViewState = null;
	//  144  308:aload_1         
	//  145  309:aconst_null     
	//  146  310:putfield        #885 <Field Bundle AppCompatDelegateImpl$PanelFeatureState.frozenActionViewState>
			}
			if(!((android.view.Window.Callback) (obj)).onPreparePanel(0, panelfeaturestate.createdPanelView, ((Menu) (panelfeaturestate.menu))))
	//* 147  313:aload           5
	//* 148  315:iconst_0        
	//* 149  316:aload_1         
	//* 150  317:getfield        #613 <Field View AppCompatDelegateImpl$PanelFeatureState.createdPanelView>
	//* 151  320:aload_1         
	//* 152  321:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//* 153  324:invokeinterface #893 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//* 154  329:ifne            365
			{
				if(flag)
	//* 155  332:iload_3         
	//* 156  333:ifeq            356
				{
					keyevent = ((KeyEvent) (mDecorContentParent));
	//  157  336:aload_0         
	//  158  337:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//  159  340:astore_2        
					if(keyevent != null)
	//* 160  341:aload_2         
	//* 161  342:ifnull          356
						((DecorContentParent) (keyevent)).setMenu(((Menu) (null)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//  162  345:aload_2         
	//  163  346:aconst_null     
	//  164  347:aload_0         
	//  165  348:getfield        #871 <Field AppCompatDelegateImpl$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  166  351:invokeinterface #875 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
				}
				panelfeaturestate.menu.startDispatchingItemsChanged();
	//  167  356:aload_1         
	//  168  357:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//  169  360:invokevirtual   #896 <Method void MenuBuilder.startDispatchingItemsChanged()>
				return false;
	//  170  363:iconst_0        
	//  171  364:ireturn         
			}
			int i;
			if(keyevent != null)
	//* 172  365:aload_2         
	//* 173  366:ifnull          377
				i = keyevent.getDeviceId();
	//  174  369:aload_2         
	//  175  370:invokevirtual   #899 <Method int KeyEvent.getDeviceId()>
	//  176  373:istore_3        
			else
	//* 177  374:goto            379
				i = -1;
	//  178  377:iconst_m1       
	//  179  378:istore_3        
			boolean flag1;
			if(KeyCharacterMap.load(i).getKeyboardType() != 1)
	//* 180  379:iload_3         
	//* 181  380:invokestatic    #905 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//* 182  383:invokevirtual   #908 <Method int KeyCharacterMap.getKeyboardType()>
	//* 183  386:iconst_1        
	//* 184  387:icmpeq          396
				flag1 = true;
	//  185  390:iconst_1        
	//  186  391:istore          4
			else
	//* 187  393:goto            399
				flag1 = false;
	//  188  396:iconst_0        
	//  189  397:istore          4
			panelfeaturestate.qwertyMode = flag1;
	//  190  399:aload_1         
	//  191  400:iload           4
	//  192  402:putfield        #911 <Field boolean AppCompatDelegateImpl$PanelFeatureState.qwertyMode>
			panelfeaturestate.menu.setQwertyMode(panelfeaturestate.qwertyMode);
	//  193  405:aload_1         
	//  194  406:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//  195  409:aload_1         
	//  196  410:getfield        #911 <Field boolean AppCompatDelegateImpl$PanelFeatureState.qwertyMode>
	//  197  413:invokevirtual   #914 <Method void MenuBuilder.setQwertyMode(boolean)>
			panelfeaturestate.menu.startDispatchingItemsChanged();
	//  198  416:aload_1         
	//  199  417:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//  200  420:invokevirtual   #896 <Method void MenuBuilder.startDispatchingItemsChanged()>
		}
		panelfeaturestate.isPrepared = true;
	//  201  423:aload_1         
	//  202  424:iconst_1        
	//  203  425:putfield        #732 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isPrepared>
		panelfeaturestate.isHandled = false;
	//  204  428:aload_1         
	//  205  429:iconst_0        
	//  206  430:putfield        #729 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isHandled>
		mPreparedPanel = panelfeaturestate;
	//  207  433:aload_0         
	//  208  434:aload_1         
	//  209  435:putfield        #859 <Field AppCompatDelegateImpl$PanelFeatureState mPreparedPanel>
		return true;
	//  210  438:iconst_1        
	//  211  439:ireturn         
	}

	private void reopenMenu(MenuBuilder menubuilder, boolean flag)
	{
		menubuilder = ((MenuBuilder) (mDecorContentParent));
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//    2    4:astore_1        
		if(menubuilder != null && ((DecorContentParent) (menubuilder)).canShowOverflowMenu() && (!ViewConfiguration.get(mContext).hasPermanentMenuKey() || mDecorContentParent.isOverflowMenuShowPending()))
	//*   3    5:aload_1         
	//*   4    6:ifnull          216
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #708 <Method boolean DecorContentParent.canShowOverflowMenu()>
	//*   7   15:ifeq            216
	//*   8   18:aload_0         
	//*   9   19:getfield        #182 <Field Context mContext>
	//*  10   22:invokestatic    #714 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//*  11   25:invokevirtual   #717 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//*  12   28:ifeq            43
	//*  13   31:aload_0         
	//*  14   32:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//*  15   35:invokeinterface #919 <Method boolean DecorContentParent.isOverflowMenuShowPending()>
	//*  16   40:ifeq            216
		{
			menubuilder = ((MenuBuilder) (getWindowCallback()));
	//   17   43:aload_0         
	//   18   44:invokevirtual   #411 <Method android.view.Window$Callback getWindowCallback()>
	//   19   47:astore_1        
			if(mDecorContentParent.isOverflowMenuShowing() && flag)
	//*  20   48:aload_0         
	//*  21   49:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//*  22   52:invokeinterface #720 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  23   57:ifeq            102
	//*  24   60:iload_2         
	//*  25   61:ifne            67
	//*  26   64:goto            102
			{
				mDecorContentParent.hideOverflowMenu();
	//   27   67:aload_0         
	//   28   68:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//   29   71:invokeinterface #726 <Method boolean DecorContentParent.hideOverflowMenu()>
	//   30   76:pop             
				if(!mIsDestroyed)
	//*  31   77:aload_0         
	//*  32   78:getfield        #574 <Field boolean mIsDestroyed>
	//*  33   81:ifne            215
				{
					((android.view.Window.Callback) (menubuilder)).onPanelClosed(108, ((Menu) (getPanelState(0, true).menu)));
	//   34   84:aload_1         
	//   35   85:bipush          108
	//   36   87:aload_0         
	//   37   88:iconst_0        
	//   38   89:iconst_1        
	//   39   90:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//   40   93:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//   41   96:invokeinterface #923 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
					return;
	//   42  101:return          
				}
			} else
			if(menubuilder != null && !mIsDestroyed)
	//*  43  102:aload_1         
	//*  44  103:ifnull          215
	//*  45  106:aload_0         
	//*  46  107:getfield        #574 <Field boolean mIsDestroyed>
	//*  47  110:ifne            215
			{
				if(mInvalidatePanelMenuPosted && (mInvalidatePanelMenuFeatures & 1) != 0)
	//*  48  113:aload_0         
	//*  49  114:getfield        #683 <Field boolean mInvalidatePanelMenuPosted>
	//*  50  117:ifeq            153
	//*  51  120:aload_0         
	//*  52  121:getfield        #681 <Field int mInvalidatePanelMenuFeatures>
	//*  53  124:iconst_1        
	//*  54  125:iand            
	//*  55  126:ifeq            153
				{
					mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
	//   56  129:aload_0         
	//   57  130:getfield        #184 <Field Window mWindow>
	//   58  133:invokevirtual   #243 <Method View Window.getDecorView()>
	//   59  136:aload_0         
	//   60  137:getfield        #180 <Field Runnable mInvalidatePanelMenuRunnable>
	//   61  140:invokevirtual   #927 <Method boolean View.removeCallbacks(Runnable)>
	//   62  143:pop             
					mInvalidatePanelMenuRunnable.run();
	//   63  144:aload_0         
	//   64  145:getfield        #180 <Field Runnable mInvalidatePanelMenuRunnable>
	//   65  148:invokeinterface #932 <Method void Runnable.run()>
				}
				PanelFeatureState panelfeaturestate = getPanelState(0, true);
	//   66  153:aload_0         
	//   67  154:iconst_0        
	//   68  155:iconst_1        
	//   69  156:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//   70  159:astore_3        
				if(panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent && ((android.view.Window.Callback) (menubuilder)).onPreparePanel(0, panelfeaturestate.createdPanelView, ((Menu) (panelfeaturestate.menu))))
	//*  71  160:aload_3         
	//*  72  161:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  73  164:ifnull          215
	//*  74  167:aload_3         
	//*  75  168:getfield        #735 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshMenuContent>
	//*  76  171:ifne            215
	//*  77  174:aload_1         
	//*  78  175:iconst_0        
	//*  79  176:aload_3         
	//*  80  177:getfield        #613 <Field View AppCompatDelegateImpl$PanelFeatureState.createdPanelView>
	//*  81  180:aload_3         
	//*  82  181:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  83  184:invokeinterface #893 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//*  84  189:ifeq            215
				{
					((android.view.Window.Callback) (menubuilder)).onMenuOpened(108, ((Menu) (panelfeaturestate.menu)));
	//   85  192:aload_1         
	//   86  193:bipush          108
	//   87  195:aload_3         
	//   88  196:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//   89  199:invokeinterface #779 <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//   90  204:pop             
					mDecorContentParent.showOverflowMenu();
	//   91  205:aload_0         
	//   92  206:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//   93  209:invokeinterface #723 <Method boolean DecorContentParent.showOverflowMenu()>
	//   94  214:pop             
				}
			}
			return;
	//   95  215:return          
		} else
		{
			menubuilder = ((MenuBuilder) (getPanelState(0, true)));
	//   96  216:aload_0         
	//   97  217:iconst_0        
	//   98  218:iconst_1        
	//   99  219:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//  100  222:astore_1        
			menubuilder.refreshDecorView = true;
	//  101  223:aload_1         
	//  102  224:iconst_1        
	//  103  225:putfield        #786 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshDecorView>
			closePanel(((PanelFeatureState) (menubuilder)), false);
	//  104  228:aload_0         
	//  105  229:aload_1         
	//  106  230:iconst_0        
	//  107  231:invokevirtual   #743 <Method void closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
			openPanel(((PanelFeatureState) (menubuilder)), ((KeyEvent) (null)));
	//  108  234:aload_0         
	//  109  235:aload_1         
	//  110  236:aconst_null     
	//  111  237:invokespecial   #739 <Method void openPanel(AppCompatDelegateImpl$PanelFeatureState, KeyEvent)>
			return;
	//  112  240:return          
		}
	}

	private int sanitizeWindowFeatureId(int i)
	{
		if(i == 8)
	//*   0    0:iload_1         
	//*   1    1:bipush          8
	//*   2    3:icmpne          19
		{
			Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
	//    3    6:ldc2            #756 <String "AppCompatDelegate">
	//    4    9:ldc2            #936 <String "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.">
	//    5   12:invokestatic    #939 <Method int Log.i(String, String)>
	//    6   15:pop             
			return 108;
	//    7   16:bipush          108
	//    8   18:ireturn         
		}
		if(i == 9)
	//*   9   19:iload_1         
	//*  10   20:bipush          9
	//*  11   22:icmpne          38
		{
			Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
	//   12   25:ldc2            #756 <String "AppCompatDelegate">
	//   13   28:ldc2            #941 <String "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.">
	//   14   31:invokestatic    #939 <Method int Log.i(String, String)>
	//   15   34:pop             
			return 109;
	//   16   35:bipush          109
	//   17   37:ireturn         
		} else
		{
			return i;
	//   18   38:iload_1         
	//   19   39:ireturn         
		}
	}

	private boolean shouldInheritContext(ViewParent viewparent)
	{
		if(viewparent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		View view = mWindow.getDecorView();
	//    4    6:aload_0         
	//    5    7:getfield        #184 <Field Window mWindow>
	//    6   10:invokevirtual   #243 <Method View Window.getDecorView()>
	//    7   13:astore_2        
		do
		{
			if(viewparent == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
				return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
			if(viewparent != view && (viewparent instanceof View))
	//*  12   20:aload_1         
	//*  13   21:aload_2         
	//*  14   22:if_acmpeq       54
	//*  15   25:aload_1         
	//*  16   26:instanceof      #245 <Class View>
	//*  17   29:ifeq            54
			{
				if(ViewCompat.isAttachedToWindow((View)viewparent))
	//*  18   32:aload_1         
	//*  19   33:checkcast       #245 <Class View>
	//*  20   36:invokestatic    #947 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  21   39:ifeq            44
					return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
				viewparent = viewparent.getParent();
	//   24   44:aload_1         
	//   25   45:invokeinterface #950 <Method ViewParent ViewParent.getParent()>
	//   26   50:astore_1        
			} else
	//*  27   51:goto            14
			{
				return false;
	//   28   54:iconst_0        
	//   29   55:ireturn         
			}
		} while(true);
	}

	private boolean shouldRecreateOnNightModeChange()
	{
		boolean flag1 = mApplyDayNightCalled;
	//    0    0:aload_0         
	//    1    1:getfield        #955 <Field boolean mApplyDayNightCalled>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(flag1)
	//*   5    7:iload_3         
	//*   6    8:ifeq            88
		{
			Object obj = ((Object) (mContext));
	//    7   11:aload_0         
	//    8   12:getfield        #182 <Field Context mContext>
	//    9   15:astore          4
			if(obj instanceof Activity)
	//*  10   17:aload           4
	//*  11   19:instanceof      #592 <Class Activity>
	//*  12   22:ifeq            88
			{
				obj = ((Object) (((Context) (obj)).getPackageManager()));
	//   13   25:aload           4
	//   14   27:invokevirtual   #959 <Method PackageManager Context.getPackageManager()>
	//   15   30:astore          4
				int i;
				try
				{
					i = ((PackageManager) (obj)).getActivityInfo(new ComponentName(mContext, ((Object) (mContext)).getClass()), 0).configChanges;
	//   16   32:aload           4
	//   17   34:new             #961 <Class ComponentName>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:getfield        #182 <Field Context mContext>
	//   21   42:aload_0         
	//   22   43:getfield        #182 <Field Context mContext>
	//   23   46:invokevirtual   #967 <Method Class Object.getClass()>
	//   24   49:invokespecial   #970 <Method void ComponentName(Context, Class)>
	//   25   52:iconst_0        
	//   26   53:invokevirtual   #976 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//   27   56:getfield        #981 <Field int ActivityInfo.configChanges>
	//   28   59:istore_1        
				}
	//*  29   60:iload_1         
	//*  30   61:sipush          512
	//*  31   64:iand            
	//*  32   65:ifne            70
	//*  33   68:iconst_1        
	//*  34   69:istore_2        
	//*  35   70:iload_2         
	//*  36   71:ireturn         
				catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  37   72:astore          4
				{
					Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", ((Throwable) (namenotfoundexception)));
	//   38   74:ldc2            #756 <String "AppCompatDelegate">
	//   39   77:ldc2            #983 <String "Exception while getting ActivityInfo">
	//   40   80:aload           4
	//   41   82:invokestatic    #987 <Method int Log.d(String, String, Throwable)>
	//   42   85:pop             
					return true;
	//   43   86:iconst_1        
	//   44   87:ireturn         
				}
				if((i & 0x200) == 0)
					flag = true;
				return flag;
			}
		}
		return false;
	//   45   88:iconst_0        
	//   46   89:ireturn         
	}

	private void throwFeatureRequestIfSubDecorInstalled()
	{
		if(!mSubDecorInstalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #536 <Field boolean mSubDecorInstalled>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		else
			throw new AndroidRuntimeException("Window feature must be requested before adding content");
	//    4    8:new             #990 <Class AndroidRuntimeException>
	//    5   11:dup             
	//    6   12:ldc2            #992 <String "Window feature must be requested before adding content">
	//    7   15:invokespecial   #993 <Method void AndroidRuntimeException(String)>
	//    8   18:athrow          
	}

	private boolean updateForNightMode(int i)
	{
		Resources resources = mContext.getResources();
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field Context mContext>
	//    2    4:invokevirtual   #652 <Method Resources Context.getResources()>
	//    3    7:astore_3        
		Configuration configuration = resources.getConfiguration();
	//    4    8:aload_3         
	//    5    9:invokevirtual   #768 <Method Configuration Resources.getConfiguration()>
	//    6   12:astore          4
		int j = configuration.uiMode;
	//    7   14:aload           4
	//    8   16:getfield        #997 <Field int Configuration.uiMode>
	//    9   19:istore_2        
		if(i == 2)
	//*  10   20:iload_1         
	//*  11   21:iconst_2        
	//*  12   22:icmpne          31
			i = 32;
	//   13   25:bipush          32
	//   14   27:istore_1        
		else
	//*  15   28:goto            34
			i = 16;
	//   16   31:bipush          16
	//   17   33:istore_1        
		if((j & 0x30) != i)
	//*  18   34:iload_2         
	//*  19   35:bipush          48
	//*  20   37:iand            
	//*  21   38:iload_1         
	//*  22   39:icmpeq          116
		{
			if(shouldRecreateOnNightModeChange())
	//*  23   42:aload_0         
	//*  24   43:invokespecial   #999 <Method boolean shouldRecreateOnNightModeChange()>
	//*  25   46:ifeq            62
			{
				((Activity)mContext).recreate();
	//   26   49:aload_0         
	//   27   50:getfield        #182 <Field Context mContext>
	//   28   53:checkcast       #592 <Class Activity>
	//   29   56:invokevirtual   #1002 <Method void Activity.recreate()>
			} else
	//*  30   59:goto            114
			{
				configuration = new Configuration(configuration);
	//   31   62:new             #770 <Class Configuration>
	//   32   65:dup             
	//   33   66:aload           4
	//   34   68:invokespecial   #1005 <Method void Configuration(Configuration)>
	//   35   71:astore          4
				android.util.DisplayMetrics displaymetrics = resources.getDisplayMetrics();
	//   36   73:aload_3         
	//   37   74:invokevirtual   #1009 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   38   77:astore          5
				configuration.uiMode = i | configuration.uiMode & 0xffffffcf;
	//   39   79:aload           4
	//   40   81:iload_1         
	//   41   82:aload           4
	//   42   84:getfield        #997 <Field int Configuration.uiMode>
	//   43   87:bipush          -49
	//   44   89:iand            
	//   45   90:ior             
	//   46   91:putfield        #997 <Field int Configuration.uiMode>
				resources.updateConfiguration(configuration, displaymetrics);
	//   47   94:aload_3         
	//   48   95:aload           4
	//   49   97:aload           5
	//   50   99:invokevirtual   #1013 <Method void Resources.updateConfiguration(Configuration, android.util.DisplayMetrics)>
				if(android.os.Build.VERSION.SDK_INT < 26)
	//*  51  102:getstatic       #145 <Field int android.os.Build$VERSION.SDK_INT>
	//*  52  105:bipush          26
	//*  53  107:icmpge          114
					ResourcesFlusher.flush(resources);
	//   54  110:aload_3         
	//   55  111:invokestatic    #1019 <Method void ResourcesFlusher.flush(Resources)>
			}
			return true;
	//   56  114:iconst_1        
	//   57  115:ireturn         
		} else
		{
			return false;
	//   58  116:iconst_0        
	//   59  117:ireturn         
		}
	}

	public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #588 <Method void ensureSubDecor()>
		((ViewGroup)mSubDecor.findViewById(0x1020002)).addView(view, layoutparams);
	//    2    4:aload_0         
	//    3    5:getfield        #230 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #231 <Int 0x1020002>
	//    5   10:invokevirtual   #237 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #233 <Class ViewGroup>
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:invokevirtual   #824 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		mOriginalWindowCallback.onContentChanged();
	//   10   21:aload_0         
	//   11   22:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   12   25:invokeinterface #1023 <Method void android.view.Window$Callback.onContentChanged()>
	//   13   30:return          
	}

	public boolean applyDayNight()
	{
		int i = getNightMode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1026 <Method int getNightMode()>
	//    2    4:istore_1        
		int j = mapNightMode(i);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #1029 <Method int mapNightMode(int)>
	//    6   10:istore_2        
		boolean flag;
		if(j != -1)
	//*   7   11:iload_2         
	//*   8   12:iconst_m1       
	//*   9   13:icmpeq          25
			flag = updateForNightMode(j);
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:invokespecial   #1031 <Method boolean updateForNightMode(int)>
	//   13   21:istore_3        
		else
	//*  14   22:goto            27
			flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_3        
		if(i == 0)
	//*  17   27:iload_1         
	//*  18   28:ifne            42
		{
			ensureAutoNightModeManager();
	//   19   31:aload_0         
	//   20   32:invokespecial   #1033 <Method void ensureAutoNightModeManager()>
			mAutoNightModeManager.setup();
	//   21   35:aload_0         
	//   22   36:getfield        #524 <Field AppCompatDelegateImpl$AutoNightModeManager mAutoNightModeManager>
	//   23   39:invokevirtual   #1036 <Method void AppCompatDelegateImpl$AutoNightModeManager.setup()>
		}
		mApplyDayNightCalled = true;
	//   24   42:aload_0         
	//   25   43:iconst_1        
	//   26   44:putfield        #955 <Field boolean mApplyDayNightCalled>
		return flag;
	//   27   47:iload_3         
	//   28   48:ireturn         
	}

	void callOnPanelClosed(int i, PanelFeatureState panelfeaturestate, Menu menu)
	{
		Object obj = ((Object) (panelfeaturestate));
	//    0    0:aload_2         
	//    1    1:astore          5
		Object obj1 = ((Object) (menu));
	//    2    3:aload_3         
	//    3    4:astore          6
		if(menu == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       69
		{
			PanelFeatureState panelfeaturestate1 = panelfeaturestate;
	//    6   10:aload_2         
	//    7   11:astore          4
			if(panelfeaturestate == null)
	//*   8   13:aload_2         
	//*   9   14:ifnonnull       46
			{
				panelfeaturestate1 = panelfeaturestate;
	//   10   17:aload_2         
	//   11   18:astore          4
				if(i >= 0)
	//*  12   20:iload_1         
	//*  13   21:iflt            46
				{
					obj = ((Object) (mPanels));
	//   14   24:aload_0         
	//   15   25:getfield        #1040 <Field AppCompatDelegateImpl$PanelFeatureState[] mPanels>
	//   16   28:astore          5
					panelfeaturestate1 = panelfeaturestate;
	//   17   30:aload_2         
	//   18   31:astore          4
					if(i < obj.length)
	//*  19   33:iload_1         
	//*  20   34:aload           5
	//*  21   36:arraylength     
	//*  22   37:icmpge          46
						panelfeaturestate1 = ((PanelFeatureState) (obj[i]));
	//   23   40:aload           5
	//   24   42:iload_1         
	//   25   43:aaload          
	//   26   44:astore          4
				}
			}
			obj = ((Object) (panelfeaturestate1));
	//   27   46:aload           4
	//   28   48:astore          5
			obj1 = ((Object) (menu));
	//   29   50:aload_3         
	//   30   51:astore          6
			if(panelfeaturestate1 != null)
	//*  31   53:aload           4
	//*  32   55:ifnull          69
			{
				obj1 = ((Object) (panelfeaturestate1.menu));
	//   33   58:aload           4
	//   34   60:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//   35   63:astore          6
				obj = ((Object) (panelfeaturestate1));
	//   36   65:aload           4
	//   37   67:astore          5
			}
		}
		if(obj != null && !((PanelFeatureState) (obj)).isOpen)
	//*  38   69:aload           5
	//*  39   71:ifnull          83
	//*  40   74:aload           5
	//*  41   76:getfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
	//*  42   79:ifne            83
			return;
	//   43   82:return          
		if(!mIsDestroyed)
	//*  44   83:aload_0         
	//*  45   84:getfield        #574 <Field boolean mIsDestroyed>
	//*  46   87:ifne            102
			mOriginalWindowCallback.onPanelClosed(i, ((Menu) (obj1)));
	//   47   90:aload_0         
	//   48   91:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   49   94:iload_1         
	//   50   95:aload           6
	//   51   97:invokeinterface #923 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
	//   52  102:return          
	}

	void checkCloseActionMenu(MenuBuilder menubuilder)
	{
		if(mClosingActionMenu)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1043 <Field boolean mClosingActionMenu>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mClosingActionMenu = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #1043 <Field boolean mClosingActionMenu>
		mDecorContentParent.dismissPopups();
	//    7   13:aload_0         
	//    8   14:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//    9   17:invokeinterface #1046 <Method void DecorContentParent.dismissPopups()>
		android.view.Window.Callback callback = getWindowCallback();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #411 <Method android.view.Window$Callback getWindowCallback()>
	//   12   26:astore_2        
		if(callback != null && !mIsDestroyed)
	//*  13   27:aload_2         
	//*  14   28:ifnull          47
	//*  15   31:aload_0         
	//*  16   32:getfield        #574 <Field boolean mIsDestroyed>
	//*  17   35:ifne            47
			callback.onPanelClosed(108, ((Menu) (menubuilder)));
	//   18   38:aload_2         
	//   19   39:bipush          108
	//   20   41:aload_1         
	//   21   42:invokeinterface #923 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
		mClosingActionMenu = false;
	//   22   47:aload_0         
	//   23   48:iconst_0        
	//   24   49:putfield        #1043 <Field boolean mClosingActionMenu>
	//   25   52:return          
	}

	void closePanel(int i)
	{
		closePanel(getPanelState(i, true), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #743 <Method void closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
	//    7   11:return          
	}

	void closePanel(PanelFeatureState panelfeaturestate, boolean flag)
	{
		if(flag && panelfeaturestate.featureId == 0)
	//*   0    0:iload_2         
	//*   1    1:ifeq            38
	//*   2    4:aload_1         
	//*   3    5:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//*   4    8:ifne            38
		{
			DecorContentParent decorcontentparent = mDecorContentParent;
	//    5   11:aload_0         
	//    6   12:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//    7   15:astore_3        
			if(decorcontentparent != null && decorcontentparent.isOverflowMenuShowing())
	//*   8   16:aload_3         
	//*   9   17:ifnull          38
	//*  10   20:aload_3         
	//*  11   21:invokeinterface #720 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  12   26:ifeq            38
			{
				checkCloseActionMenu(panelfeaturestate.menu);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//   16   34:invokevirtual   #1048 <Method void checkCloseActionMenu(MenuBuilder)>
				return;
	//   17   37:return          
			}
		}
		WindowManager windowmanager = (WindowManager)mContext.getSystemService("window");
	//   18   38:aload_0         
	//   19   39:getfield        #182 <Field Context mContext>
	//   20   42:ldc2            #781 <String "window">
	//   21   45:invokevirtual   #749 <Method Object Context.getSystemService(String)>
	//   22   48:checkcast       #783 <Class WindowManager>
	//   23   51:astore_3        
		if(windowmanager != null && panelfeaturestate.isOpen && panelfeaturestate.decorView != null)
	//*  24   52:aload_3         
	//*  25   53:ifnull          94
	//*  26   56:aload_1         
	//*  27   57:getfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
	//*  28   60:ifeq            94
	//*  29   63:aload_1         
	//*  30   64:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//*  31   67:ifnull          94
		{
			windowmanager.removeView(((View) (panelfeaturestate.decorView)));
	//   32   70:aload_3         
	//   33   71:aload_1         
	//   34   72:getfield        #641 <Field ViewGroup AppCompatDelegateImpl$PanelFeatureState.decorView>
	//   35   75:invokeinterface #1049 <Method void WindowManager.removeView(View)>
			if(flag)
	//*  36   80:iload_2         
	//*  37   81:ifeq            94
				callOnPanelClosed(panelfeaturestate.featureId, panelfeaturestate, ((Menu) (null)));
	//   38   84:aload_0         
	//   39   85:aload_1         
	//   40   86:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//   41   89:aload_1         
	//   42   90:aconst_null     
	//   43   91:invokevirtual   #1051 <Method void callOnPanelClosed(int, AppCompatDelegateImpl$PanelFeatureState, Menu)>
		}
		panelfeaturestate.isPrepared = false;
	//   44   94:aload_1         
	//   45   95:iconst_0        
	//   46   96:putfield        #732 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isPrepared>
		panelfeaturestate.isHandled = false;
	//   47   99:aload_1         
	//   48  100:iconst_0        
	//   49  101:putfield        #729 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isHandled>
		panelfeaturestate.isOpen = false;
	//   50  104:aload_1         
	//   51  105:iconst_0        
	//   52  106:putfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
		panelfeaturestate.shownPanelView = null;
	//   53  109:aload_1         
	//   54  110:aconst_null     
	//   55  111:putfield        #616 <Field View AppCompatDelegateImpl$PanelFeatureState.shownPanelView>
		panelfeaturestate.refreshDecorView = true;
	//   56  114:aload_1         
	//   57  115:iconst_1        
	//   58  116:putfield        #786 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshDecorView>
		if(mPreparedPanel == panelfeaturestate)
	//*  59  119:aload_0         
	//*  60  120:getfield        #859 <Field AppCompatDelegateImpl$PanelFeatureState mPreparedPanel>
	//*  61  123:aload_1         
	//*  62  124:if_acmpne       132
			mPreparedPanel = null;
	//   63  127:aload_0         
	//   64  128:aconst_null     
	//   65  129:putfield        #859 <Field AppCompatDelegateImpl$PanelFeatureState mPreparedPanel>
	//   66  132:return          
	}

	public View createView(View view, String s, Context context, AttributeSet attributeset)
	{
		AppCompatViewInflater appcompatviewinflater = mAppCompatViewInflater;
	//    0    0:aload_0         
	//    1    1:getfield        #1058 <Field AppCompatViewInflater mAppCompatViewInflater>
	//    2    4:astore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		if(appcompatviewinflater == null)
	//*   5    9:aload           6
	//*   6   11:ifnonnull       159
		{
			String s1 = mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme).getString(android.support.v7.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
	//    7   14:aload_0         
	//    8   15:getfield        #182 <Field Context mContext>
	//    9   18:getstatic       #267 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
	//   10   21:invokevirtual   #272 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   11   24:getstatic       #1061 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_viewInflaterClass>
	//   12   27:invokevirtual   #1065 <Method String TypedArray.getString(int)>
	//   13   30:astore          6
			if(s1 != null && !((Class) (android/support/v7/app/AppCompatViewInflater)).getName().equals(((Object) (s1))))
	//*  14   32:aload           6
	//*  15   34:ifnull          148
	//*  16   37:ldc2            #1067 <Class AppCompatViewInflater>
	//*  17   40:invokevirtual   #1072 <Method String Class.getName()>
	//*  18   43:aload           6
	//*  19   45:invokevirtual   #1078 <Method boolean String.equals(Object)>
	//*  20   48:ifeq            54
	//*  21   51:goto            148
				try
				{
					mAppCompatViewInflater = (AppCompatViewInflater)Class.forName(s1).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//   22   54:aload_0         
	//   23   55:aload           6
	//   24   57:invokestatic    #1082 <Method Class Class.forName(String)>
	//   25   60:iconst_0        
	//   26   61:anewarray       Class[]
	//   27   64:invokevirtual   #1086 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   28   67:iconst_0        
	//   29   68:anewarray       Object[]
	//   30   71:invokevirtual   #1092 <Method Object Constructor.newInstance(Object[])>
	//   31   74:checkcast       #1067 <Class AppCompatViewInflater>
	//   32   77:putfield        #1058 <Field AppCompatViewInflater mAppCompatViewInflater>
				}
	//*  33   80:goto            159
				catch(Throwable throwable)
	//*  34   83:astore          7
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   35   85:new             #492 <Class StringBuilder>
	//   36   88:dup             
	//   37   89:invokespecial   #493 <Method void StringBuilder()>
	//   38   92:astore          8
					stringbuilder.append("Failed to instantiate custom view inflater ");
	//   39   94:aload           8
	//   40   96:ldc2            #1094 <String "Failed to instantiate custom view inflater ">
	//   41   99:invokevirtual   #499 <Method StringBuilder StringBuilder.append(String)>
	//   42  102:pop             
					stringbuilder.append(s1);
	//   43  103:aload           8
	//   44  105:aload           6
	//   45  107:invokevirtual   #499 <Method StringBuilder StringBuilder.append(String)>
	//   46  110:pop             
					stringbuilder.append(". Falling back to default.");
	//   47  111:aload           8
	//   48  113:ldc2            #1096 <String ". Falling back to default.">
	//   49  116:invokevirtual   #499 <Method StringBuilder StringBuilder.append(String)>
	//   50  119:pop             
					Log.i("AppCompatDelegate", stringbuilder.toString(), throwable);
	//   51  120:ldc2            #756 <String "AppCompatDelegate">
	//   52  123:aload           8
	//   53  125:invokevirtual   #518 <Method String StringBuilder.toString()>
	//   54  128:aload           7
	//   55  130:invokestatic    #1098 <Method int Log.i(String, String, Throwable)>
	//   56  133:pop             
					mAppCompatViewInflater = new AppCompatViewInflater();
	//   57  134:aload_0         
	//   58  135:new             #1067 <Class AppCompatViewInflater>
	//   59  138:dup             
	//   60  139:invokespecial   #1099 <Method void AppCompatViewInflater()>
	//   61  142:putfield        #1058 <Field AppCompatViewInflater mAppCompatViewInflater>
				}
			else
	//*  62  145:goto            159
				mAppCompatViewInflater = new AppCompatViewInflater();
	//   63  148:aload_0         
	//   64  149:new             #1067 <Class AppCompatViewInflater>
	//   65  152:dup             
	//   66  153:invokespecial   #1099 <Method void AppCompatViewInflater()>
	//   67  156:putfield        #1058 <Field AppCompatViewInflater mAppCompatViewInflater>
		}
		if(IS_PRE_LOLLIPOP)
	//*  68  159:getstatic       #147 <Field boolean IS_PRE_LOLLIPOP>
	//*  69  162:ifeq            206
		{
			if(attributeset instanceof XmlPullParser)
	//*  70  165:aload           4
	//*  71  167:instanceof      #1101 <Class XmlPullParser>
	//*  72  170:ifeq            193
			{
				if(((XmlPullParser)attributeset).getDepth() > 1)
	//*  73  173:aload           4
	//*  74  175:checkcast       #1101 <Class XmlPullParser>
	//*  75  178:invokeinterface #1104 <Method int XmlPullParser.getDepth()>
	//*  76  183:iconst_1        
	//*  77  184:icmple          203
					flag = true;
	//   78  187:iconst_1        
	//   79  188:istore          5
			} else
	//*  80  190:goto            203
			{
				flag = shouldInheritContext((ViewParent)view);
	//   81  193:aload_0         
	//   82  194:aload_1         
	//   83  195:checkcast       #949 <Class ViewParent>
	//   84  198:invokespecial   #1106 <Method boolean shouldInheritContext(ViewParent)>
	//   85  201:istore          5
			}
		} else
	//*  86  203:goto            209
		{
			flag = false;
	//   87  206:iconst_0        
	//   88  207:istore          5
		}
		return mAppCompatViewInflater.createView(view, s, context, attributeset, flag, IS_PRE_LOLLIPOP, true, VectorEnabledTintResources.shouldBeUsed());
	//   89  209:aload_0         
	//   90  210:getfield        #1058 <Field AppCompatViewInflater mAppCompatViewInflater>
	//   91  213:aload_1         
	//   92  214:aload_2         
	//   93  215:aload_3         
	//   94  216:aload           4
	//   95  218:iload           5
	//   96  220:getstatic       #147 <Field boolean IS_PRE_LOLLIPOP>
	//   97  223:iconst_1        
	//   98  224:invokestatic    #1111 <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//   99  227:invokevirtual   #1114 <Method View AppCompatViewInflater.createView(View, String, Context, AttributeSet, boolean, boolean, boolean, boolean)>
	//  100  230:areturn         
	}

	void dismissPopups()
	{
		DecorContentParent decorcontentparent = mDecorContentParent;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//    2    4:astore_1        
		if(decorcontentparent != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			decorcontentparent.dismissPopups();
	//    5    9:aload_1         
	//    6   10:invokeinterface #1046 <Method void DecorContentParent.dismissPopups()>
		if(mActionModePopup != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #1117 <Field PopupWindow mActionModePopup>
	//*   9   19:ifnull          59
		{
			mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
	//   10   22:aload_0         
	//   11   23:getfield        #184 <Field Window mWindow>
	//   12   26:invokevirtual   #243 <Method View Window.getDecorView()>
	//   13   29:aload_0         
	//   14   30:getfield        #1119 <Field Runnable mShowActionModePopup>
	//   15   33:invokevirtual   #927 <Method boolean View.removeCallbacks(Runnable)>
	//   16   36:pop             
			PanelFeatureState panelfeaturestate;
			if(mActionModePopup.isShowing())
	//*  17   37:aload_0         
	//*  18   38:getfield        #1117 <Field PopupWindow mActionModePopup>
	//*  19   41:invokevirtual   #1124 <Method boolean PopupWindow.isShowing()>
	//*  20   44:ifeq            54
				try
				{
					mActionModePopup.dismiss();
	//   21   47:aload_0         
	//   22   48:getfield        #1117 <Field PopupWindow mActionModePopup>
	//   23   51:invokevirtual   #1127 <Method void PopupWindow.dismiss()>
				}
	//*  24   54:aload_0         
	//*  25   55:aconst_null     
	//*  26   56:putfield        #1117 <Field PopupWindow mActionModePopup>
	//*  27   59:aload_0         
	//*  28   60:invokevirtual   #1130 <Method void endOnGoingFadeAnimation()>
	//*  29   63:aload_0         
	//*  30   64:iconst_0        
	//*  31   65:iconst_0        
	//*  32   66:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//*  33   69:astore_1        
	//*  34   70:aload_1         
	//*  35   71:ifnull          88
	//*  36   74:aload_1         
	//*  37   75:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  38   78:ifnull          88
	//*  39   81:aload_1         
	//*  40   82:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  41   85:invokevirtual   #1133 <Method void MenuBuilder.close()>
	//*  42   88:return          
				catch(IllegalArgumentException illegalargumentexception) { }
	//   43   89:astore_1        
			mActionModePopup = null;
		}
		endOnGoingFadeAnimation();
		panelfeaturestate = getPanelState(0, false);
		if(panelfeaturestate != null && panelfeaturestate.menu != null)
			panelfeaturestate.menu.close();
	//*  44   90:goto            54
	}

	boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		android.view.Window.Callback callback = mOriginalWindowCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//    2    4:astore          5
		boolean flag1 = callback instanceof android.support.v4.view.KeyEventDispatcher.Component;
	//    3    6:aload           5
	//    4    8:instanceof      #1137 <Class android.support.v4.view.KeyEventDispatcher$Component>
	//    5   11:istore          4
		boolean flag = true;
	//    6   13:iconst_1        
	//    7   14:istore_2        
		if(flag1 || (callback instanceof AppCompatDialog))
	//*   8   15:iload           4
	//*   9   17:ifne            28
	//*  10   20:aload           5
	//*  11   22:instanceof      #1139 <Class AppCompatDialog>
	//*  12   25:ifeq            53
		{
			View view = mWindow.getDecorView();
	//   13   28:aload_0         
	//   14   29:getfield        #184 <Field Window mWindow>
	//   15   32:invokevirtual   #243 <Method View Window.getDecorView()>
	//   16   35:astore          5
			if(view != null && KeyEventDispatcher.dispatchBeforeHierarchy(view, keyevent))
	//*  17   37:aload           5
	//*  18   39:ifnull          53
	//*  19   42:aload           5
	//*  20   44:aload_1         
	//*  21   45:invokestatic    #1145 <Method boolean KeyEventDispatcher.dispatchBeforeHierarchy(View, KeyEvent)>
	//*  22   48:ifeq            53
				return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
		}
		if(keyevent.getKeyCode() == 82 && mOriginalWindowCallback.dispatchKeyEvent(keyevent))
	//*  25   53:aload_1         
	//*  26   54:invokevirtual   #1148 <Method int KeyEvent.getKeyCode()>
	//*  27   57:bipush          82
	//*  28   59:icmpne          77
	//*  29   62:aload_0         
	//*  30   63:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*  31   66:aload_1         
	//*  32   67:invokeinterface #1150 <Method boolean android.view.Window$Callback.dispatchKeyEvent(KeyEvent)>
	//*  33   72:ifeq            77
			return true;
	//   34   75:iconst_1        
	//   35   76:ireturn         
		int i = keyevent.getKeyCode();
	//   36   77:aload_1         
	//   37   78:invokevirtual   #1148 <Method int KeyEvent.getKeyCode()>
	//   38   81:istore_3        
		if(keyevent.getAction() != 0)
	//*  39   82:aload_1         
	//*  40   83:invokevirtual   #1153 <Method int KeyEvent.getAction()>
	//*  41   86:ifne            92
	//*  42   89:goto            94
			flag = false;
	//   43   92:iconst_0        
	//   44   93:istore_2        
		if(flag)
	//*  45   94:iload_2         
	//*  46   95:ifeq            105
			return onKeyDown(i, keyevent);
	//   47   98:aload_0         
	//   48   99:iload_3         
	//   49  100:aload_1         
	//   50  101:invokevirtual   #1156 <Method boolean onKeyDown(int, KeyEvent)>
	//   51  104:ireturn         
		else
			return onKeyUp(i, keyevent);
	//   52  105:aload_0         
	//   53  106:iload_3         
	//   54  107:aload_1         
	//   55  108:invokevirtual   #1159 <Method boolean onKeyUp(int, KeyEvent)>
	//   56  111:ireturn         
	}

	void doInvalidatePanelMenu(int i)
	{
		PanelFeatureState panelfeaturestate = getPanelState(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//    4    6:astore_2        
		if(panelfeaturestate.menu != null)
	//*   5    7:aload_2         
	//*   6    8:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*   7   11:ifnull          56
		{
			Bundle bundle = new Bundle();
	//    8   14:new             #1162 <Class Bundle>
	//    9   17:dup             
	//   10   18:invokespecial   #1163 <Method void Bundle()>
	//   11   21:astore_3        
			panelfeaturestate.menu.saveActionViewStates(bundle);
	//   12   22:aload_2         
	//   13   23:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//   14   26:aload_3         
	//   15   27:invokevirtual   #1166 <Method void MenuBuilder.saveActionViewStates(Bundle)>
			if(bundle.size() > 0)
	//*  16   30:aload_3         
	//*  17   31:invokevirtual   #1169 <Method int Bundle.size()>
	//*  18   34:ifle            42
				panelfeaturestate.frozenActionViewState = bundle;
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:putfield        #885 <Field Bundle AppCompatDelegateImpl$PanelFeatureState.frozenActionViewState>
			panelfeaturestate.menu.stopDispatchingItemsChanged();
	//   22   42:aload_2         
	//   23   43:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//   24   46:invokevirtual   #878 <Method void MenuBuilder.stopDispatchingItemsChanged()>
			panelfeaturestate.menu.clear();
	//   25   49:aload_2         
	//   26   50:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//   27   53:invokevirtual   #1172 <Method void MenuBuilder.clear()>
		}
		panelfeaturestate.refreshMenuContent = true;
	//   28   56:aload_2         
	//   29   57:iconst_1        
	//   30   58:putfield        #735 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshMenuContent>
		panelfeaturestate.refreshDecorView = true;
	//   31   61:aload_2         
	//   32   62:iconst_1        
	//   33   63:putfield        #786 <Field boolean AppCompatDelegateImpl$PanelFeatureState.refreshDecorView>
		if((i == 108 || i == 0) && mDecorContentParent != null)
	//*  34   66:iload_1         
	//*  35   67:bipush          108
	//*  36   69:icmpeq          76
	//*  37   72:iload_1         
	//*  38   73:ifne            106
	//*  39   76:aload_0         
	//*  40   77:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//*  41   80:ifnull          106
		{
			PanelFeatureState panelfeaturestate1 = getPanelState(0, false);
	//   42   83:aload_0         
	//   43   84:iconst_0        
	//   44   85:iconst_0        
	//   45   86:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//   46   89:astore_2        
			if(panelfeaturestate1 != null)
	//*  47   90:aload_2         
	//*  48   91:ifnull          106
			{
				panelfeaturestate1.isPrepared = false;
	//   49   94:aload_2         
	//   50   95:iconst_0        
	//   51   96:putfield        #732 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isPrepared>
				preparePanel(panelfeaturestate1, ((KeyEvent) (null)));
	//   52   99:aload_0         
	//   53  100:aload_2         
	//   54  101:aconst_null     
	//   55  102:invokespecial   #701 <Method boolean preparePanel(AppCompatDelegateImpl$PanelFeatureState, KeyEvent)>
	//   56  105:pop             
			}
		}
	//   57  106:return          
	}

	void endOnGoingFadeAnimation()
	{
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat = mFadeAnim;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//    2    4:astore_1        
		if(viewpropertyanimatorcompat != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			viewpropertyanimatorcompat.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1177 <Method void ViewPropertyAnimatorCompat.cancel()>
	//    7   13:return          
	}

	PanelFeatureState findMenuPanel(Menu menu)
	{
		PanelFeatureState apanelfeaturestate[] = mPanels;
	//    0    0:aload_0         
	//    1    1:getfield        #1040 <Field AppCompatDelegateImpl$PanelFeatureState[] mPanels>
	//    2    4:astore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		if(apanelfeaturestate != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          20
			i = apanelfeaturestate.length;
	//    7   13:aload           4
	//    8   15:arraylength     
	//    9   16:istore_2        
		else
	//*  10   17:goto            22
			i = 0;
	//   11   20:iconst_0        
	//   12   21:istore_2        
		for(; j < i; j++)
	//*  13   22:iload_3         
	//*  14   23:iload_2         
	//*  15   24:icmpge          57
		{
			PanelFeatureState panelfeaturestate = apanelfeaturestate[j];
	//   16   27:aload           4
	//   17   29:iload_3         
	//   18   30:aaload          
	//   19   31:astore          5
			if(panelfeaturestate != null && panelfeaturestate.menu == menu)
	//*  20   33:aload           5
	//*  21   35:ifnull          50
	//*  22   38:aload           5
	//*  23   40:getfield        #578 <Field MenuBuilder AppCompatDelegateImpl$PanelFeatureState.menu>
	//*  24   43:aload_1         
	//*  25   44:if_acmpne       50
				return panelfeaturestate;
	//   26   47:aload           5
	//   27   49:areturn         
		}

	//   28   50:iload_3         
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:istore_3        
	//*  32   54:goto            22
		return null;
	//   33   57:aconst_null     
	//   34   58:areturn         
	}

	public View findViewById(int i)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #588 <Method void ensureSubDecor()>
		return mWindow.findViewById(i);
	//    2    4:aload_0         
	//    3    5:getfield        #184 <Field Window mWindow>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #461 <Method View Window.findViewById(int)>
	//    6   12:areturn         
	}

	final Context getActionBarThemedContext()
	{
		Object obj = ((Object) (getSupportActionBar()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			obj = ((Object) (((ActionBar) (obj)).getThemedContext()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1190 <Method Context ActionBar.getThemedContext()>
	//    7   13:astore_1        
		else
	//*   8   14:goto            19
			obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		Context context = ((Context) (obj));
	//   11   19:aload_1         
	//   12   20:astore_2        
		if(obj == null)
	//*  13   21:aload_1         
	//*  14   22:ifnonnull       30
			context = mContext;
	//   15   25:aload_0         
	//   16   26:getfield        #182 <Field Context mContext>
	//   17   29:astore_2        
		return context;
	//   18   30:aload_2         
	//   19   31:areturn         
	}

	final AutoNightModeManager getAutoNightModeManager()
	{
		ensureAutoNightModeManager();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1033 <Method void ensureAutoNightModeManager()>
		return mAutoNightModeManager;
	//    2    4:aload_0         
	//    3    5:getfield        #524 <Field AppCompatDelegateImpl$AutoNightModeManager mAutoNightModeManager>
	//    4    8:areturn         
	}

	public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
	{
		return ((ActionBarDrawerToggle.Delegate) (new ActionBarDrawableToggleImpl()));
	//    0    0:new             #26  <Class AppCompatDelegateImpl$ActionBarDrawableToggleImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1196 <Method void AppCompatDelegateImpl$ActionBarDrawableToggleImpl(AppCompatDelegateImpl)>
	//    4    8:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		if(mMenuInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #1200 <Field MenuInflater mMenuInflater>
	//*   2    4:ifnonnull       45
		{
			initWindowDecorActionBar();
	//    3    7:aload_0         
	//    4    8:invokespecial   #1202 <Method void initWindowDecorActionBar()>
			Object obj = ((Object) (mActionBar));
	//    5   11:aload_0         
	//    6   12:getfield        #590 <Field ActionBar mActionBar>
	//    7   15:astore_1        
			if(obj != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          28
				obj = ((Object) (((ActionBar) (obj)).getThemedContext()));
	//   10   20:aload_1         
	//   11   21:invokevirtual   #1190 <Method Context ActionBar.getThemedContext()>
	//   12   24:astore_1        
			else
	//*  13   25:goto            33
				obj = ((Object) (mContext));
	//   14   28:aload_0         
	//   15   29:getfield        #182 <Field Context mContext>
	//   16   32:astore_1        
			mMenuInflater = ((MenuInflater) (new SupportMenuInflater(((Context) (obj)))));
	//   17   33:aload_0         
	//   18   34:new             #1204 <Class SupportMenuInflater>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokespecial   #1205 <Method void SupportMenuInflater(Context)>
	//   22   42:putfield        #1200 <Field MenuInflater mMenuInflater>
		}
		return mMenuInflater;
	//   23   45:aload_0         
	//   24   46:getfield        #1200 <Field MenuInflater mMenuInflater>
	//   25   49:areturn         
	}

	protected PanelFeatureState getPanelState(int i, boolean flag)
	{
		PanelFeatureState apanelfeaturestate[];
label0:
		{
			PanelFeatureState apanelfeaturestate1[] = mPanels;
	//    0    0:aload_0         
	//    1    1:getfield        #1040 <Field AppCompatDelegateImpl$PanelFeatureState[] mPanels>
	//    2    4:astore          4
			if(apanelfeaturestate1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			{
				apanelfeaturestate = apanelfeaturestate1;
	//    5   11:aload           4
	//    6   13:astore_3        
				if(apanelfeaturestate1.length > i)
					break label0;
	//    7   14:aload           4
	//    8   16:arraylength     
	//    9   17:iload_1         
	//   10   18:icmpgt          49
			}
			apanelfeaturestate = new PanelFeatureState[i + 1];
	//   11   21:iload_1         
	//   12   22:iconst_1        
	//   13   23:iadd            
	//   14   24:anewarray       PanelFeatureState[]
	//   15   27:astore_3        
			if(apanelfeaturestate1 != null)
	//*  16   28:aload           4
	//*  17   30:ifnull          44
				System.arraycopy(((Object) (apanelfeaturestate1)), 0, ((Object) (apanelfeaturestate)), 0, apanelfeaturestate1.length);
	//   18   33:aload           4
	//   19   35:iconst_0        
	//   20   36:aload_3         
	//   21   37:iconst_0        
	//   22   38:aload           4
	//   23   40:arraylength     
	//   24   41:invokestatic    #1211 <Method void System.arraycopy(Object, int, Object, int, int)>
			mPanels = apanelfeaturestate;
	//   25   44:aload_0         
	//   26   45:aload_3         
	//   27   46:putfield        #1040 <Field AppCompatDelegateImpl$PanelFeatureState[] mPanels>
		}
		PanelFeatureState panelfeaturestate1 = apanelfeaturestate[i];
	//   28   49:aload_3         
	//   29   50:iload_1         
	//   30   51:aaload          
	//   31   52:astore          5
		PanelFeatureState panelfeaturestate = panelfeaturestate1;
	//   32   54:aload           5
	//   33   56:astore          4
		if(panelfeaturestate1 == null)
	//*  34   58:aload           5
	//*  35   60:ifnonnull       78
		{
			panelfeaturestate = new PanelFeatureState(i);
	//   36   63:new             #48  <Class AppCompatDelegateImpl$PanelFeatureState>
	//   37   66:dup             
	//   38   67:iload_1         
	//   39   68:invokespecial   #1213 <Method void AppCompatDelegateImpl$PanelFeatureState(int)>
	//   40   71:astore          4
			apanelfeaturestate[i] = panelfeaturestate;
	//   41   73:aload_3         
	//   42   74:iload_1         
	//   43   75:aload           4
	//   44   77:aastore         
		}
		return panelfeaturestate;
	//   45   78:aload           4
	//   46   80:areturn         
	}

	ViewGroup getSubDecor()
	{
		return mSubDecor;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field ViewGroup mSubDecor>
	//    2    4:areturn         
	}

	public ActionBar getSupportActionBar()
	{
		initWindowDecorActionBar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1202 <Method void initWindowDecorActionBar()>
		return mActionBar;
	//    2    4:aload_0         
	//    3    5:getfield        #590 <Field ActionBar mActionBar>
	//    4    8:areturn         
	}

	final CharSequence getTitle()
	{
		android.view.Window.Callback callback = mOriginalWindowCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//    2    4:astore_1        
		if(callback instanceof Activity)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #592 <Class Activity>
	//*   5    9:ifeq            20
			return ((Activity)callback).getTitle();
	//    6   12:aload_1         
	//    7   13:checkcast       #592 <Class Activity>
	//    8   16:invokevirtual   #1215 <Method CharSequence Activity.getTitle()>
	//    9   19:areturn         
		else
			return mTitle;
	//   10   20:aload_0         
	//   11   21:getfield        #1217 <Field CharSequence mTitle>
	//   12   24:areturn         
	}

	final android.view.Window.Callback getWindowCallback()
	{
		return mWindow.getCallback();
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Window mWindow>
	//    2    4:invokevirtual   #192 <Method android.view.Window$Callback Window.getCallback()>
	//    3    7:areturn         
	}

	public boolean hasWindowFeature(int i)
	{
		boolean flag;
label0:
		{
			int j = sanitizeWindowFeatureId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1220 <Method int sanitizeWindowFeatureId(int)>
	//    3    5:istore_2        
			boolean flag1 = false;
	//    4    6:iconst_0        
	//    5    7:istore          4
			switch(j)
	//*   6    9:iload_2         
			{
	//*   7   10:lookupswitch    6: default 68
	//	               1: 113
	//	               2: 105
	//	               5: 97
	//	               10: 89
	//	               108: 81
	//	               109: 73
			default:
				flag = false;
	//    8   68:iconst_0        
	//    9   69:istore_3        
				break;

	//*  10   70:goto            118
			case 109: // 'm'
				flag = mOverlayActionBar;
	//   11   73:aload_0         
	//   12   74:getfield        #368 <Field boolean mOverlayActionBar>
	//   13   77:istore_3        
				break;

	//*  14   78:goto            118
			case 108: // 'l'
				flag = mHasActionBar;
	//   15   81:aload_0         
	//   16   82:getfield        #370 <Field boolean mHasActionBar>
	//   17   85:istore_3        
				break;

	//*  18   86:goto            118
			case 10: // '\n'
				flag = mOverlayActionMode;
	//   19   89:aload_0         
	//   20   90:getfield        #424 <Field boolean mOverlayActionMode>
	//   21   93:istore_3        
				break;

	//*  22   94:goto            118
			case 5: // '\005'
				flag = mFeatureIndeterminateProgress;
	//   23   97:aload_0         
	//   24   98:getfield        #422 <Field boolean mFeatureIndeterminateProgress>
	//   25  101:istore_3        
				break;

	//*  26  102:goto            118
			case 2: // '\002'
				flag = mFeatureProgress;
	//   27  105:aload_0         
	//   28  106:getfield        #420 <Field boolean mFeatureProgress>
	//   29  109:istore_3        
				break;

	//*  30  110:goto            118
			case 1: // '\001'
				flag = mWindowNoTitle;
	//   31  113:aload_0         
	//   32  114:getfield        #357 <Field boolean mWindowNoTitle>
	//   33  117:istore_3        
				break;
			}
			if(!flag)
	//*  34  118:iload_3         
	//*  35  119:ifne            136
			{
				flag = flag1;
	//   36  122:iload           4
	//   37  124:istore_3        
				if(!mWindow.hasFeature(i))
					break label0;
	//   38  125:aload_0         
	//   39  126:getfield        #184 <Field Window mWindow>
	//   40  129:iload_1         
	//   41  130:invokevirtual   #1223 <Method boolean Window.hasFeature(int)>
	//   42  133:ifeq            138
			}
			flag = true;
	//   43  136:iconst_1        
	//   44  137:istore_3        
		}
		return flag;
	//   45  138:iload_3         
	//   46  139:ireturn         
	}

	public void installViewFactory()
	{
		LayoutInflater layoutinflater = LayoutInflater.from(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field Context mContext>
	//    2    4:invokestatic    #355 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:astore_1        
		if(layoutinflater.getFactory() == null)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #1228 <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//*   6   12:ifnonnull       21
		{
			LayoutInflaterCompat.setFactory2(layoutinflater, ((android.view.LayoutInflater.Factory2) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokestatic    #1234 <Method void LayoutInflaterCompat.setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return;
	//   10   20:return          
		}
		if(!(layoutinflater.getFactory2() instanceof AppCompatDelegateImpl))
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #1238 <Method android.view.LayoutInflater$Factory2 LayoutInflater.getFactory2()>
	//*  13   25:instanceof      #2   <Class AppCompatDelegateImpl>
	//*  14   28:ifne            41
			Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
	//   15   31:ldc2            #756 <String "AppCompatDelegate">
	//   16   34:ldc2            #1240 <String "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's">
	//   17   37:invokestatic    #939 <Method int Log.i(String, String)>
	//   18   40:pop             
	//   19   41:return          
	}

	public void invalidateOptionsMenu()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null && actionbar.invalidateOptionsMenu())
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #1243 <Method boolean ActionBar.invalidateOptionsMenu()>
	//*   7   13:ifeq            17
		{
			return;
	//    8   16:return          
		} else
		{
			invalidatePanelMenu(0);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokespecial   #581 <Method void invalidatePanelMenu(int)>
			return;
	//   12   22:return          
		}
	}

	public boolean isHandleNativeActionModesEnabled()
	{
		return mHandleNativeActionModes;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field boolean mHandleNativeActionModes>
	//    2    4:ireturn         
	}

	int mapNightMode(int i)
	{
		if(i != -100)
	//*   0    0:iload_1         
	//*   1    1:bipush          -100
	//*   2    3:icmpeq          53
		{
			if(i != 0)
	//*   3    6:iload_1         
	//*   4    7:ifeq            12
				return i;
	//    5   10:iload_1         
	//    6   11:ireturn         
			if(android.os.Build.VERSION.SDK_INT >= 23 && ((UiModeManager)mContext.getSystemService(android/app/UiModeManager)).getNightMode() == 0)
	//*   7   12:getstatic       #145 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   15:bipush          23
	//*   9   17:icmplt          41
	//*  10   20:aload_0         
	//*  11   21:getfield        #182 <Field Context mContext>
	//*  12   24:ldc2            #1246 <Class UiModeManager>
	//*  13   27:invokevirtual   #1249 <Method Object Context.getSystemService(Class)>
	//*  14   30:checkcast       #1246 <Class UiModeManager>
	//*  15   33:invokevirtual   #1250 <Method int UiModeManager.getNightMode()>
	//*  16   36:ifne            41
			{
				return -1;
	//   17   39:iconst_m1       
	//   18   40:ireturn         
			} else
			{
				ensureAutoNightModeManager();
	//   19   41:aload_0         
	//   20   42:invokespecial   #1033 <Method void ensureAutoNightModeManager()>
				return mAutoNightModeManager.getApplyableNightMode();
	//   21   45:aload_0         
	//   22   46:getfield        #524 <Field AppCompatDelegateImpl$AutoNightModeManager mAutoNightModeManager>
	//   23   49:invokevirtual   #1253 <Method int AppCompatDelegateImpl$AutoNightModeManager.getApplyableNightMode()>
	//   24   52:ireturn         
			}
		} else
		{
			return -1;
	//   25   53:iconst_m1       
	//   26   54:ireturn         
		}
	}

	boolean onBackPressed()
	{
		Object obj = ((Object) (mActionMode));
	//    0    0:aload_0         
	//    1    1:getfield        #704 <Field ActionMode mActionMode>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
		{
			((ActionMode) (obj)).finish();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1259 <Method void ActionMode.finish()>
			return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
		}
		obj = ((Object) (getSupportActionBar()));
	//    9   15:aload_0         
	//   10   16:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//   11   19:astore_1        
		return obj != null && ((ActionBar) (obj)).collapseActionView();
	//   12   20:aload_1         
	//   13   21:ifnull          33
	//   14   24:aload_1         
	//   15   25:invokevirtual   #1262 <Method boolean ActionBar.collapseActionView()>
	//   16   28:ifeq            33
	//   17   31:iconst_1        
	//   18   32:ireturn         
	//   19   33:iconst_0        
	//   20   34:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		if(mHasActionBar && mSubDecorInstalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #370 <Field boolean mHasActionBar>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #536 <Field boolean mSubDecorInstalled>
	//*   5   11:ifeq            28
		{
			ActionBar actionbar = getSupportActionBar();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//    8   18:astore_2        
			if(actionbar != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          28
				actionbar.onConfigurationChanged(configuration);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #1265 <Method void ActionBar.onConfigurationChanged(Configuration)>
		}
		AppCompatDrawableManager.get().onConfigurationChanged(mContext);
	//   14   28:invokestatic    #1270 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//   15   31:aload_0         
	//   16   32:getfield        #182 <Field Context mContext>
	//   17   35:invokevirtual   #1272 <Method void AppCompatDrawableManager.onConfigurationChanged(Context)>
		applyDayNight();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #1274 <Method boolean applyDayNight()>
	//   20   42:pop             
	//   21   43:return          
	}

	public void onCreate(Bundle bundle)
	{
		Object obj = ((Object) (mOriginalWindowCallback));
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//    2    4:astore_3        
		if(!(obj instanceof Activity)) goto _L2; else goto _L1
	//    3    5:aload_3         
	//    4    6:instanceof      #592 <Class Activity>
	//    5    9:ifeq            50
_L1:
		String s = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		obj = ((Object) (NavUtils.getParentActivityName((Activity)obj)));
	//    8   14:aload_3         
	//    9   15:checkcast       #592 <Class Activity>
	//   10   18:invokestatic    #1281 <Method String NavUtils.getParentActivityName(Activity)>
	//   11   21:astore_3        
		s = ((String) (obj));
	//   12   22:aload_3         
	//   13   23:astore_2        
_L4:
		if(s != null)
	//*  14   24:aload_2         
	//*  15   25:ifnull          50
		{
			ActionBar actionbar = peekSupportActionBar();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #556 <Method ActionBar peekSupportActionBar()>
	//   18   32:astore_2        
			if(actionbar == null)
	//*  19   33:aload_2         
	//*  20   34:ifnonnull       45
				mEnableDefaultActionBarUp = true;
	//   21   37:aload_0         
	//   22   38:iconst_1        
	//   23   39:putfield        #604 <Field boolean mEnableDefaultActionBarUp>
			else
	//*  24   42:goto            50
				actionbar.setDefaultDisplayHomeAsUpEnabled(true);
	//   25   45:aload_2         
	//   26   46:iconst_1        
	//   27   47:invokevirtual   #608 <Method void ActionBar.setDefaultDisplayHomeAsUpEnabled(boolean)>
		}
_L2:
		if(bundle != null && mLocalNightMode == -100)
	//*  28   50:aload_1         
	//*  29   51:ifnull          75
	//*  30   54:aload_0         
	//*  31   55:getfield        #175 <Field int mLocalNightMode>
	//*  32   58:bipush          -100
	//*  33   60:icmpne          75
			mLocalNightMode = bundle.getInt("appcompat:local_night_mode", -100);
	//   34   63:aload_0         
	//   35   64:aload_1         
	//   36   65:ldc1            #68  <String "appcompat:local_night_mode">
	//   37   67:bipush          -100
	//   38   69:invokevirtual   #1285 <Method int Bundle.getInt(String, int)>
	//   39   72:putfield        #175 <Field int mLocalNightMode>
		return;
	//   40   75:return          
		IllegalArgumentException illegalargumentexception;
		illegalargumentexception;
	//   41   76:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  42   77:goto            24
	}

	public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		return createView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #1288 <Method View createView(View, String, Context, AttributeSet)>
	//    6    9:areturn         
	}

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return onCreateView(((View) (null)), s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #1291 <Method View onCreateView(View, String, Context, AttributeSet)>
	//    6    8:areturn         
	}

	public void onDestroy()
	{
		if(mInvalidatePanelMenuPosted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #683 <Field boolean mInvalidatePanelMenuPosted>
	//*   2    4:ifeq            22
			mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
	//    3    7:aload_0         
	//    4    8:getfield        #184 <Field Window mWindow>
	//    5   11:invokevirtual   #243 <Method View Window.getDecorView()>
	//    6   14:aload_0         
	//    7   15:getfield        #180 <Field Runnable mInvalidatePanelMenuRunnable>
	//    8   18:invokevirtual   #927 <Method boolean View.removeCallbacks(Runnable)>
	//    9   21:pop             
		mIsDestroyed = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #574 <Field boolean mIsDestroyed>
		Object obj = ((Object) (mActionBar));
	//   13   27:aload_0         
	//   14   28:getfield        #590 <Field ActionBar mActionBar>
	//   15   31:astore_1        
		if(obj != null)
	//*  16   32:aload_1         
	//*  17   33:ifnull          40
			((ActionBar) (obj)).onDestroy();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #1294 <Method void ActionBar.onDestroy()>
		obj = ((Object) (mAutoNightModeManager));
	//   20   40:aload_0         
	//   21   41:getfield        #524 <Field AppCompatDelegateImpl$AutoNightModeManager mAutoNightModeManager>
	//   22   44:astore_1        
		if(obj != null)
	//*  23   45:aload_1         
	//*  24   46:ifnull          53
			((AutoNightModeManager) (obj)).cleanup();
	//   25   49:aload_1         
	//   26   50:invokevirtual   #1297 <Method void AppCompatDelegateImpl$AutoNightModeManager.cleanup()>
	//   27   53:return          
	}

	boolean onKeyDown(int i, KeyEvent keyevent)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(i != 4)
	//*   2    2:iload_1         
	//*   3    3:iconst_4        
	//*   4    4:icmpeq          24
			if(i != 82)
	//*   5    7:iload_1         
	//*   6    8:bipush          82
	//*   7   10:icmpeq          15
			{
				return false;
	//    8   13:iconst_0        
	//    9   14:ireturn         
			} else
			{
				onKeyDownPanel(0, keyevent);
	//   10   15:aload_0         
	//   11   16:iconst_0        
	//   12   17:aload_2         
	//   13   18:invokespecial   #1299 <Method boolean onKeyDownPanel(int, KeyEvent)>
	//   14   21:pop             
				return true;
	//   15   22:iconst_1        
	//   16   23:ireturn         
			}
		if((keyevent.getFlags() & 0x80) == 0)
	//*  17   24:aload_2         
	//*  18   25:invokevirtual   #1302 <Method int KeyEvent.getFlags()>
	//*  19   28:sipush          128
	//*  20   31:iand            
	//*  21   32:ifeq            38
	//*  22   35:goto            40
			flag = false;
	//   23   38:iconst_0        
	//   24   39:istore_3        
		mLongPressBackDown = flag;
	//   25   40:aload_0         
	//   26   41:iload_3         
	//   27   42:putfield        #1304 <Field boolean mLongPressBackDown>
		return false;
	//   28   45:iconst_0        
	//   29   46:ireturn         
	}

	boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		Object obj = ((Object) (getSupportActionBar()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//    2    4:astore          4
		if(obj != null && ((ActionBar) (obj)).onKeyShortcut(i, keyevent))
	//*   3    6:aload           4
	//*   4    8:ifnull          23
	//*   5   11:aload           4
	//*   6   13:iload_1         
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #1307 <Method boolean ActionBar.onKeyShortcut(int, KeyEvent)>
	//*   9   18:ifeq            23
			return true;
	//   10   21:iconst_1        
	//   11   22:ireturn         
		obj = ((Object) (mPreparedPanel));
	//   12   23:aload_0         
	//   13   24:getfield        #859 <Field AppCompatDelegateImpl$PanelFeatureState mPreparedPanel>
	//   14   27:astore          4
		if(obj != null && performPanelShortcut(((PanelFeatureState) (obj)), keyevent.getKeyCode(), keyevent, 1))
	//*  15   29:aload           4
	//*  16   31:ifnull          65
	//*  17   34:aload_0         
	//*  18   35:aload           4
	//*  19   37:aload_2         
	//*  20   38:invokevirtual   #1148 <Method int KeyEvent.getKeyCode()>
	//*  21   41:aload_2         
	//*  22   42:iconst_1        
	//*  23   43:invokespecial   #1309 <Method boolean performPanelShortcut(AppCompatDelegateImpl$PanelFeatureState, int, KeyEvent, int)>
	//*  24   46:ifeq            65
		{
			keyevent = ((KeyEvent) (mPreparedPanel));
	//   25   49:aload_0         
	//   26   50:getfield        #859 <Field AppCompatDelegateImpl$PanelFeatureState mPreparedPanel>
	//   27   53:astore_2        
			if(keyevent != null)
	//*  28   54:aload_2         
	//*  29   55:ifnull          63
				keyevent.isHandled = true;
	//   30   58:aload_2         
	//   31   59:iconst_1        
	//   32   60:putfield        #729 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isHandled>
			return true;
	//   33   63:iconst_1        
	//   34   64:ireturn         
		}
		if(mPreparedPanel == null)
	//*  35   65:aload_0         
	//*  36   66:getfield        #859 <Field AppCompatDelegateImpl$PanelFeatureState mPreparedPanel>
	//*  37   69:ifnonnull       113
		{
			PanelFeatureState panelfeaturestate = getPanelState(0, true);
	//   38   72:aload_0         
	//   39   73:iconst_0        
	//   40   74:iconst_1        
	//   41   75:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//   42   78:astore          4
			preparePanel(panelfeaturestate, keyevent);
	//   43   80:aload_0         
	//   44   81:aload           4
	//   45   83:aload_2         
	//   46   84:invokespecial   #701 <Method boolean preparePanel(AppCompatDelegateImpl$PanelFeatureState, KeyEvent)>
	//   47   87:pop             
			boolean flag = performPanelShortcut(panelfeaturestate, keyevent.getKeyCode(), keyevent, 1);
	//   48   88:aload_0         
	//   49   89:aload           4
	//   50   91:aload_2         
	//   51   92:invokevirtual   #1148 <Method int KeyEvent.getKeyCode()>
	//   52   95:aload_2         
	//   53   96:iconst_1        
	//   54   97:invokespecial   #1309 <Method boolean performPanelShortcut(AppCompatDelegateImpl$PanelFeatureState, int, KeyEvent, int)>
	//   55  100:istore_3        
			panelfeaturestate.isPrepared = false;
	//   56  101:aload           4
	//   57  103:iconst_0        
	//   58  104:putfield        #732 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isPrepared>
			if(flag)
	//*  59  107:iload_3         
	//*  60  108:ifeq            113
				return true;
	//   61  111:iconst_1        
	//   62  112:ireturn         
		}
		return false;
	//   63  113:iconst_0        
	//   64  114:ireturn         
	}

	boolean onKeyUp(int i, KeyEvent keyevent)
	{
		if(i != 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpeq          22
			if(i != 82)
	//*   3    5:iload_1         
	//*   4    6:bipush          82
	//*   5    8:icmpeq          13
			{
				return false;
	//    6   11:iconst_0        
	//    7   12:ireturn         
			} else
			{
				onKeyUpPanel(0, keyevent);
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:aload_2         
	//   11   16:invokespecial   #1311 <Method boolean onKeyUpPanel(int, KeyEvent)>
	//   12   19:pop             
				return true;
	//   13   20:iconst_1        
	//   14   21:ireturn         
			}
		boolean flag = mLongPressBackDown;
	//   15   22:aload_0         
	//   16   23:getfield        #1304 <Field boolean mLongPressBackDown>
	//   17   26:istore_3        
		mLongPressBackDown = false;
	//   18   27:aload_0         
	//   19   28:iconst_0        
	//   20   29:putfield        #1304 <Field boolean mLongPressBackDown>
		keyevent = ((KeyEvent) (getPanelState(0, false)));
	//   21   32:aload_0         
	//   22   33:iconst_0        
	//   23   34:iconst_0        
	//   24   35:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//   25   38:astore_2        
		if(keyevent != null && ((PanelFeatureState) (keyevent)).isOpen)
	//*  26   39:aload_2         
	//*  27   40:ifnull          62
	//*  28   43:aload_2         
	//*  29   44:getfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
	//*  30   47:ifeq            62
		{
			if(!flag)
	//*  31   50:iload_3         
	//*  32   51:ifne            60
				closePanel(((PanelFeatureState) (keyevent)), true);
	//   33   54:aload_0         
	//   34   55:aload_2         
	//   35   56:iconst_1        
	//   36   57:invokevirtual   #743 <Method void closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
			return true;
	//   37   60:iconst_1        
	//   38   61:ireturn         
		}
		return onBackPressed();
	//   39   62:aload_0         
	//   40   63:invokevirtual   #1313 <Method boolean onBackPressed()>
	//   41   66:ifeq            71
	//   42   69:iconst_1        
	//   43   70:ireturn         
	//   44   71:iconst_0        
	//   45   72:ireturn         
	}

	public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		android.view.Window.Callback callback = getWindowCallback();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #411 <Method android.view.Window$Callback getWindowCallback()>
	//    2    4:astore_3        
		if(callback != null && !mIsDestroyed)
	//*   3    5:aload_3         
	//*   4    6:ifnull          41
	//*   5    9:aload_0         
	//*   6   10:getfield        #574 <Field boolean mIsDestroyed>
	//*   7   13:ifne            41
		{
			menubuilder = ((MenuBuilder) (findMenuPanel(((Menu) (menubuilder.getRootMenu())))));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1319 <Method MenuBuilder MenuBuilder.getRootMenu()>
	//   11   21:invokevirtual   #1321 <Method AppCompatDelegateImpl$PanelFeatureState findMenuPanel(Menu)>
	//   12   24:astore_1        
			if(menubuilder != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          41
				return callback.onMenuItemSelected(((PanelFeatureState) (menubuilder)).featureId, menuitem);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:getfield        #648 <Field int AppCompatDelegateImpl$PanelFeatureState.featureId>
	//   18   34:aload_2         
	//   19   35:invokeinterface #1324 <Method boolean android.view.Window$Callback.onMenuItemSelected(int, MenuItem)>
	//   20   40:ireturn         
		}
		return false;
	//   21   41:iconst_0        
	//   22   42:ireturn         
	}

	public void onMenuModeChange(MenuBuilder menubuilder)
	{
		reopenMenu(menubuilder, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #1327 <Method void reopenMenu(MenuBuilder, boolean)>
	//    4    6:return          
	}

	void onMenuOpened(int i)
	{
		if(i == 108)
	//*   0    0:iload_1         
	//*   1    1:bipush          108
	//*   2    3:icmpne          20
		{
			ActionBar actionbar = getSupportActionBar();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//    5   10:astore_2        
			if(actionbar != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          20
				actionbar.dispatchMenuVisibilityChanged(true);
	//    8   15:aload_2         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #1330 <Method void ActionBar.dispatchMenuVisibilityChanged(boolean)>
		}
	//   11   20:return          
	}

	void onPanelClosed(int i)
	{
		if(i == 108)
	//*   0    0:iload_1         
	//*   1    1:bipush          108
	//*   2    3:icmpne          21
		{
			ActionBar actionbar = getSupportActionBar();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//    5   10:astore_2        
			if(actionbar != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          45
			{
				actionbar.dispatchMenuVisibilityChanged(false);
	//    8   15:aload_2         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #1330 <Method void ActionBar.dispatchMenuVisibilityChanged(boolean)>
				return;
	//   11   20:return          
			}
		} else
		if(i == 0)
	//*  12   21:iload_1         
	//*  13   22:ifne            45
		{
			PanelFeatureState panelfeaturestate = getPanelState(i, true);
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:iconst_1        
	//   17   28:invokevirtual   #572 <Method AppCompatDelegateImpl$PanelFeatureState getPanelState(int, boolean)>
	//   18   31:astore_2        
			if(panelfeaturestate.isOpen)
	//*  19   32:aload_2         
	//*  20   33:getfield        #697 <Field boolean AppCompatDelegateImpl$PanelFeatureState.isOpen>
	//*  21   36:ifeq            45
				closePanel(panelfeaturestate, false);
	//   22   39:aload_0         
	//   23   40:aload_2         
	//   24   41:iconst_0        
	//   25   42:invokevirtual   #743 <Method void closePanel(AppCompatDelegateImpl$PanelFeatureState, boolean)>
		}
	//   26   45:return          
	}

	public void onPostCreate(Bundle bundle)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #588 <Method void ensureSubDecor()>
	//    2    4:return          
	}

	public void onPostResume()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionbar.setShowHideAnimationEnabled(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #1335 <Method void ActionBar.setShowHideAnimationEnabled(boolean)>
	//    8   14:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		int i = mLocalNightMode;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field int mLocalNightMode>
	//    2    4:istore_2        
		if(i != -100)
	//*   3    5:iload_2         
	//*   4    6:bipush          -100
	//*   5    8:icmpeq          18
			bundle.putInt("appcompat:local_night_mode", i);
	//    6   11:aload_1         
	//    7   12:ldc1            #68  <String "appcompat:local_night_mode">
	//    8   14:iload_2         
	//    9   15:invokevirtual   #1340 <Method void Bundle.putInt(String, int)>
	//   10   18:return          
	}

	public void onStart()
	{
		applyDayNight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1274 <Method boolean applyDayNight()>
	//    2    4:pop             
	//    3    5:return          
	}

	public void onStop()
	{
		Object obj = ((Object) (getSupportActionBar()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			((ActionBar) (obj)).setShowHideAnimationEnabled(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #1335 <Method void ActionBar.setShowHideAnimationEnabled(boolean)>
		obj = ((Object) (mAutoNightModeManager));
	//    8   14:aload_0         
	//    9   15:getfield        #524 <Field AppCompatDelegateImpl$AutoNightModeManager mAutoNightModeManager>
	//   10   18:astore_1        
		if(obj != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          27
			((AutoNightModeManager) (obj)).cleanup();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #1297 <Method void AppCompatDelegateImpl$AutoNightModeManager.cleanup()>
	//   15   27:return          
	}

	void onSubDecorInstalled(ViewGroup viewgroup)
	{
	//    0    0:return          
	}

	final ActionBar peekSupportActionBar()
	{
		return mActionBar;
	//    0    0:aload_0         
	//    1    1:getfield        #590 <Field ActionBar mActionBar>
	//    2    4:areturn         
	}

	public boolean requestWindowFeature(int i)
	{
		i = sanitizeWindowFeatureId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1220 <Method int sanitizeWindowFeatureId(int)>
	//    3    5:istore_1        
		if(mWindowNoTitle && i == 108)
	//*   4    6:aload_0         
	//*   5    7:getfield        #357 <Field boolean mWindowNoTitle>
	//*   6   10:ifeq            21
	//*   7   13:iload_1         
	//*   8   14:bipush          108
	//*   9   16:icmpne          21
			return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
		if(mHasActionBar && i == 1)
	//*  12   21:aload_0         
	//*  13   22:getfield        #370 <Field boolean mHasActionBar>
	//*  14   25:ifeq            38
	//*  15   28:iload_1         
	//*  16   29:iconst_1        
	//*  17   30:icmpne          38
			mHasActionBar = false;
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:putfield        #370 <Field boolean mHasActionBar>
		switch(i)
	//*  21   38:iload_1         
		{
	//*  22   39:lookupswitch    6: default 96
	//	               1: 160
	//	               2: 149
	//	               5: 138
	//	               10: 127
	//	               108: 116
	//	               109: 105
		default:
			return mWindow.requestFeature(i);
	//   23   96:aload_0         
	//   24   97:getfield        #184 <Field Window mWindow>
	//   25  100:iload_1         
	//   26  101:invokevirtual   #1345 <Method boolean Window.requestFeature(int)>
	//   27  104:ireturn         

		case 109: // 'm'
			throwFeatureRequestIfSubDecorInstalled();
	//   28  105:aload_0         
	//   29  106:invokespecial   #1347 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mOverlayActionBar = true;
	//   30  109:aload_0         
	//   31  110:iconst_1        
	//   32  111:putfield        #368 <Field boolean mOverlayActionBar>
			return true;
	//   33  114:iconst_1        
	//   34  115:ireturn         

		case 108: // 'l'
			throwFeatureRequestIfSubDecorInstalled();
	//   35  116:aload_0         
	//   36  117:invokespecial   #1347 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mHasActionBar = true;
	//   37  120:aload_0         
	//   38  121:iconst_1        
	//   39  122:putfield        #370 <Field boolean mHasActionBar>
			return true;
	//   40  125:iconst_1        
	//   41  126:ireturn         

		case 10: // '\n'
			throwFeatureRequestIfSubDecorInstalled();
	//   42  127:aload_0         
	//   43  128:invokespecial   #1347 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mOverlayActionMode = true;
	//   44  131:aload_0         
	//   45  132:iconst_1        
	//   46  133:putfield        #424 <Field boolean mOverlayActionMode>
			return true;
	//   47  136:iconst_1        
	//   48  137:ireturn         

		case 5: // '\005'
			throwFeatureRequestIfSubDecorInstalled();
	//   49  138:aload_0         
	//   50  139:invokespecial   #1347 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mFeatureIndeterminateProgress = true;
	//   51  142:aload_0         
	//   52  143:iconst_1        
	//   53  144:putfield        #422 <Field boolean mFeatureIndeterminateProgress>
			return true;
	//   54  147:iconst_1        
	//   55  148:ireturn         

		case 2: // '\002'
			throwFeatureRequestIfSubDecorInstalled();
	//   56  149:aload_0         
	//   57  150:invokespecial   #1347 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mFeatureProgress = true;
	//   58  153:aload_0         
	//   59  154:iconst_1        
	//   60  155:putfield        #420 <Field boolean mFeatureProgress>
			return true;
	//   61  158:iconst_1        
	//   62  159:ireturn         

		case 1: // '\001'
			throwFeatureRequestIfSubDecorInstalled();
	//   63  160:aload_0         
	//   64  161:invokespecial   #1347 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mWindowNoTitle = true;
	//   65  164:aload_0         
	//   66  165:iconst_1        
	//   67  166:putfield        #357 <Field boolean mWindowNoTitle>
			return true;
	//   68  169:iconst_1        
	//   69  170:ireturn         
		}
	}

	public void setContentView(int i)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #588 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #230 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #231 <Int 0x1020002>
	//    5   10:invokevirtual   #237 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #233 <Class ViewGroup>
	//    7   16:astore_2        
		viewgroup.removeAllViews();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #800 <Method void ViewGroup.removeAllViews()>
		LayoutInflater.from(mContext).inflate(i, viewgroup);
	//   10   21:aload_0         
	//   11   22:getfield        #182 <Field Context mContext>
	//   12   25:invokestatic    #355 <Method LayoutInflater LayoutInflater.from(Context)>
	//   13   28:iload_1         
	//   14   29:aload_2         
	//   15   30:invokevirtual   #366 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   16   33:pop             
		mOriginalWindowCallback.onContentChanged();
	//   17   34:aload_0         
	//   18   35:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   19   38:invokeinterface #1023 <Method void android.view.Window$Callback.onContentChanged()>
	//   20   43:return          
	}

	public void setContentView(View view)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #588 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #230 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #231 <Int 0x1020002>
	//    5   10:invokevirtual   #237 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #233 <Class ViewGroup>
	//    7   16:astore_2        
		viewgroup.removeAllViews();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #800 <Method void ViewGroup.removeAllViews()>
		viewgroup.addView(view);
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #1348 <Method void ViewGroup.addView(View)>
		mOriginalWindowCallback.onContentChanged();
	//   13   26:aload_0         
	//   14   27:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   15   30:invokeinterface #1023 <Method void android.view.Window$Callback.onContentChanged()>
	//   16   35:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #588 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #230 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #231 <Int 0x1020002>
	//    5   10:invokevirtual   #237 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #233 <Class ViewGroup>
	//    7   16:astore_3        
		viewgroup.removeAllViews();
	//    8   17:aload_3         
	//    9   18:invokevirtual   #800 <Method void ViewGroup.removeAllViews()>
		viewgroup.addView(view, layoutparams);
	//   10   21:aload_3         
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #824 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		mOriginalWindowCallback.onContentChanged();
	//   14   27:aload_0         
	//   15   28:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   16   31:invokeinterface #1023 <Method void android.view.Window$Callback.onContentChanged()>
	//   17   36:return          
	}

	public void setHandleNativeActionModesEnabled(boolean flag)
	{
		mHandleNativeActionModes = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #173 <Field boolean mHandleNativeActionModes>
	//    3    5:return          
	}

	public void setLocalNightMode(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     -1 2: default 32
	//	               -1 43
	//	               0 43
	//	               1 43
	//	               2 43
		default:
			Log.i("AppCompatDelegate", "setLocalNightMode() called with an unknown mode");
	//    2   32:ldc2            #756 <String "AppCompatDelegate">
	//    3   35:ldc2            #1352 <String "setLocalNightMode() called with an unknown mode">
	//    4   38:invokestatic    #939 <Method int Log.i(String, String)>
	//    5   41:pop             
			return;
	//    6   42:return          

		case -1: 
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			break;
		}
		if(mLocalNightMode != i)
	//*   7   43:aload_0         
	//*   8   44:getfield        #175 <Field int mLocalNightMode>
	//*   9   47:iload_1         
	//*  10   48:icmpeq          68
		{
			mLocalNightMode = i;
	//   11   51:aload_0         
	//   12   52:iload_1         
	//   13   53:putfield        #175 <Field int mLocalNightMode>
			if(mApplyDayNightCalled)
	//*  14   56:aload_0         
	//*  15   57:getfield        #955 <Field boolean mApplyDayNightCalled>
	//*  16   60:ifeq            68
				applyDayNight();
	//   17   63:aload_0         
	//   18   64:invokevirtual   #1274 <Method boolean applyDayNight()>
	//   19   67:pop             
		}
	//   20   68:return          
	}

	public void setSupportActionBar(Toolbar toolbar)
	{
		if(!(mOriginalWindowCallback instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #592 <Class Activity>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		ActionBar actionbar = getSupportActionBar();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//    7   15:astore_2        
		if(!(actionbar instanceof WindowDecorActionBar))
	//*   8   16:aload_2         
	//*   9   17:instanceof      #594 <Class WindowDecorActionBar>
	//*  10   20:ifne            103
		{
			mMenuInflater = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #1200 <Field MenuInflater mMenuInflater>
			if(actionbar != null)
	//*  14   28:aload_2         
	//*  15   29:ifnull          36
				actionbar.onDestroy();
	//   16   32:aload_2         
	//   17   33:invokevirtual   #1294 <Method void ActionBar.onDestroy()>
			if(toolbar != null)
	//*  18   36:aload_1         
	//*  19   37:ifnull          82
			{
				toolbar = ((Toolbar) (new ToolbarActionBar(toolbar, ((Activity)mOriginalWindowCallback).getTitle(), mAppCompatWindowCallback)));
	//   20   40:new             #867 <Class ToolbarActionBar>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #194 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   25   49:checkcast       #592 <Class Activity>
	//   26   52:invokevirtual   #1215 <Method CharSequence Activity.getTitle()>
	//   27   55:aload_0         
	//   28   56:getfield        #199 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   29   59:invokespecial   #1357 <Method void ToolbarActionBar(Toolbar, CharSequence, android.view.Window$Callback)>
	//   30   62:astore_1        
				mActionBar = ((ActionBar) (toolbar));
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:putfield        #590 <Field ActionBar mActionBar>
				mWindow.setCallback(((ToolbarActionBar) (toolbar)).getWrappedWindowCallback());
	//   34   68:aload_0         
	//   35   69:getfield        #184 <Field Window mWindow>
	//   36   72:aload_1         
	//   37   73:invokevirtual   #1360 <Method android.view.Window$Callback ToolbarActionBar.getWrappedWindowCallback()>
	//   38   76:invokevirtual   #203 <Method void Window.setCallback(android.view.Window$Callback)>
			} else
	//*  39   79:goto            98
			{
				mActionBar = null;
	//   40   82:aload_0         
	//   41   83:aconst_null     
	//   42   84:putfield        #590 <Field ActionBar mActionBar>
				mWindow.setCallback(mAppCompatWindowCallback);
	//   43   87:aload_0         
	//   44   88:getfield        #184 <Field Window mWindow>
	//   45   91:aload_0         
	//   46   92:getfield        #199 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   47   95:invokevirtual   #203 <Method void Window.setCallback(android.view.Window$Callback)>
			}
			invalidateOptionsMenu();
	//   48   98:aload_0         
	//   49   99:invokevirtual   #1362 <Method void invalidateOptionsMenu()>
			return;
	//   50  102:return          
		} else
		{
			throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
	//   51  103:new             #222 <Class IllegalStateException>
	//   52  106:dup             
	//   53  107:ldc2            #1364 <String "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.">
	//   54  110:invokespecial   #227 <Method void IllegalStateException(String)>
	//   55  113:athrow          
		}
	}

	public final void setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1217 <Field CharSequence mTitle>
		Object obj = ((Object) (mDecorContentParent));
	//    3    5:aload_0         
	//    4    6:getfield        #408 <Field DecorContentParent mDecorContentParent>
	//    5    9:astore_2        
		if(obj != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          22
		{
			((DecorContentParent) (obj)).setWindowTitle(charsequence);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokeinterface #552 <Method void DecorContentParent.setWindowTitle(CharSequence)>
			return;
	//   11   21:return          
		}
		if(peekSupportActionBar() != null)
	//*  12   22:aload_0         
	//*  13   23:invokevirtual   #556 <Method ActionBar peekSupportActionBar()>
	//*  14   26:ifnull          38
		{
			peekSupportActionBar().setWindowTitle(charsequence);
	//   15   29:aload_0         
	//   16   30:invokevirtual   #556 <Method ActionBar peekSupportActionBar()>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #559 <Method void ActionBar.setWindowTitle(CharSequence)>
			return;
	//   19   37:return          
		}
		obj = ((Object) (mTitleView));
	//   20   38:aload_0         
	//   21   39:getfield        #451 <Field TextView mTitleView>
	//   22   42:astore_2        
		if(obj != null)
	//*  23   43:aload_2         
	//*  24   44:ifnull          52
			((TextView) (obj)).setText(charsequence);
	//   25   47:aload_2         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #562 <Method void TextView.setText(CharSequence)>
	//   28   52:return          
	}

	final boolean shouldAnimateActionModeView()
	{
		if(mSubDecorInstalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #536 <Field boolean mSubDecorInstalled>
	//*   2    4:ifeq            25
		{
			ViewGroup viewgroup = mSubDecor;
	//    3    7:aload_0         
	//    4    8:getfield        #230 <Field ViewGroup mSubDecor>
	//    5   11:astore_1        
			if(viewgroup != null && ViewCompat.isLaidOut(((View) (viewgroup))))
	//*   6   12:aload_1         
	//*   7   13:ifnull          25
	//*   8   16:aload_1         
	//*   9   17:invokestatic    #1369 <Method boolean ViewCompat.isLaidOut(View)>
	//*  10   20:ifeq            25
				return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		}
		return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		if(callback != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          91
		{
			Object obj = ((Object) (mActionMode));
	//    2    4:aload_0         
	//    3    5:getfield        #704 <Field ActionMode mActionMode>
	//    4    8:astore_2        
			if(obj != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          17
				((ActionMode) (obj)).finish();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #1259 <Method void ActionMode.finish()>
			callback = ((android.support.v7.view.ActionMode.Callback) (new ActionModeCallbackWrapperV9(callback)));
	//    9   17:new             #32  <Class AppCompatDelegateImpl$ActionModeCallbackWrapperV9>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #1374 <Method void AppCompatDelegateImpl$ActionModeCallbackWrapperV9(AppCompatDelegateImpl, android.support.v7.view.ActionMode$Callback)>
	//   14   26:astore_1        
			obj = ((Object) (getSupportActionBar()));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #1187 <Method ActionBar getSupportActionBar()>
	//   17   31:astore_2        
			if(obj != null)
	//*  18   32:aload_2         
	//*  19   33:ifnull          70
			{
				mActionMode = ((ActionBar) (obj)).startActionMode(callback);
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:aload_1         
	//   23   39:invokevirtual   #1377 <Method ActionMode ActionBar.startActionMode(android.support.v7.view.ActionMode$Callback)>
	//   24   42:putfield        #704 <Field ActionMode mActionMode>
				obj = ((Object) (mActionMode));
	//   25   45:aload_0         
	//   26   46:getfield        #704 <Field ActionMode mActionMode>
	//   27   49:astore_2        
				if(obj != null)
	//*  28   50:aload_2         
	//*  29   51:ifnull          70
				{
					AppCompatCallback appcompatcallback = mAppCompatCallback;
	//   30   54:aload_0         
	//   31   55:getfield        #186 <Field AppCompatCallback mAppCompatCallback>
	//   32   58:astore_3        
					if(appcompatcallback != null)
	//*  33   59:aload_3         
	//*  34   60:ifnull          70
						appcompatcallback.onSupportActionModeStarted(((ActionMode) (obj)));
	//   35   63:aload_3         
	//   36   64:aload_2         
	//   37   65:invokeinterface #1383 <Method void AppCompatCallback.onSupportActionModeStarted(ActionMode)>
				}
			}
			if(mActionMode == null)
	//*  38   70:aload_0         
	//*  39   71:getfield        #704 <Field ActionMode mActionMode>
	//*  40   74:ifnonnull       86
				mActionMode = startSupportActionModeFromWindow(callback);
	//   41   77:aload_0         
	//   42   78:aload_0         
	//   43   79:aload_1         
	//   44   80:invokevirtual   #1386 <Method ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode$Callback)>
	//   45   83:putfield        #704 <Field ActionMode mActionMode>
			return mActionMode;
	//   46   86:aload_0         
	//   47   87:getfield        #704 <Field ActionMode mActionMode>
	//   48   90:areturn         
		} else
		{
			throw new IllegalArgumentException("ActionMode callback can not be null.");
	//   49   91:new             #514 <Class IllegalArgumentException>
	//   50   94:dup             
	//   51   95:ldc2            #1388 <String "ActionMode callback can not be null.">
	//   52   98:invokespecial   #519 <Method void IllegalArgumentException(String)>
	//   53  101:athrow          
		}
	}

	ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode.Callback callback)
	{
		Object obj;
		endOnGoingFadeAnimation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1130 <Method void endOnGoingFadeAnimation()>
		obj = ((Object) (mActionMode));
	//    2    4:aload_0         
	//    3    5:getfield        #704 <Field ActionMode mActionMode>
	//    4    8:astore          4
		if(obj != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          20
			((ActionMode) (obj)).finish();
	//    7   15:aload           4
	//    8   17:invokevirtual   #1259 <Method void ActionMode.finish()>
		obj = ((Object) (callback));
	//    9   20:aload_1         
	//   10   21:astore          4
		if(!(callback instanceof ActionModeCallbackWrapperV9))
	//*  11   23:aload_1         
	//*  12   24:instanceof      #32  <Class AppCompatDelegateImpl$ActionModeCallbackWrapperV9>
	//*  13   27:ifne            41
			obj = ((Object) (new ActionModeCallbackWrapperV9(callback)));
	//   14   30:new             #32  <Class AppCompatDelegateImpl$ActionModeCallbackWrapperV9>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokespecial   #1374 <Method void AppCompatDelegateImpl$ActionModeCallbackWrapperV9(AppCompatDelegateImpl, android.support.v7.view.ActionMode$Callback)>
	//   19   39:astore          4
		callback = ((android.support.v7.view.ActionMode.Callback) (mAppCompatCallback));
	//   20   41:aload_0         
	//   21   42:getfield        #186 <Field AppCompatCallback mAppCompatCallback>
	//   22   45:astore_1        
		if(callback == null || mIsDestroyed) goto _L2; else goto _L1
	//   23   46:aload_1         
	//   24   47:ifnull          69
	//   25   50:aload_0         
	//   26   51:getfield        #574 <Field boolean mIsDestroyed>
	//   27   54:ifne            69
_L1:
		callback = ((android.support.v7.view.ActionMode.Callback) (((AppCompatCallback) (callback)).onWindowStartingSupportActionMode(((android.support.v7.view.ActionMode.Callback) (obj)))));
	//   28   57:aload_1         
	//   29   58:aload           4
	//   30   60:invokeinterface #1393 <Method ActionMode AppCompatCallback.onWindowStartingSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//   31   65:astore_1        
		  goto _L3
	//*  32   66:goto            71
_L2:
		callback = null;
	//   33   69:aconst_null     
	//   34   70:astore_1        
_L3:
		if(callback != null)
	//*  35   71:aload_1         
	//*  36   72:ifnull          83
		{
			mActionMode = ((ActionMode) (callback));
	//   37   75:aload_0         
	//   38   76:aload_1         
	//   39   77:putfield        #704 <Field ActionMode mActionMode>
		} else
	//*  40   80:goto            573
		{
			callback = ((android.support.v7.view.ActionMode.Callback) (mActionModeView));
	//   41   83:aload_0         
	//   42   84:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//   43   87:astore_1        
			boolean flag = true;
	//   44   88:iconst_1        
	//   45   89:istore_3        
			if(callback == null)
	//*  46   90:aload_1         
	//*  47   91:ifnonnull       353
				if(mIsFloating)
	//*  48   94:aload_0         
	//*  49   95:getfield        #349 <Field boolean mIsFloating>
	//*  50   98:ifeq            313
				{
					TypedValue typedvalue = new TypedValue();
	//   51  101:new             #372 <Class TypedValue>
	//   52  104:dup             
	//   53  105:invokespecial   #373 <Method void TypedValue()>
	//   54  108:astore          5
					callback = ((android.support.v7.view.ActionMode.Callback) (mContext.getTheme()));
	//   55  110:aload_0         
	//   56  111:getfield        #182 <Field Context mContext>
	//   57  114:invokevirtual   #377 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   58  117:astore_1        
					((android.content.res.Resources.Theme) (callback)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedvalue, true);
	//   59  118:aload_1         
	//   60  119:getstatic       #382 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//   61  122:aload           5
	//   62  124:iconst_1        
	//   63  125:invokevirtual   #388 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   64  128:pop             
					if(typedvalue.resourceId != 0)
	//*  65  129:aload           5
	//*  66  131:getfield        #391 <Field int TypedValue.resourceId>
	//*  67  134:ifeq            191
					{
						android.content.res.Resources.Theme theme = mContext.getResources().newTheme();
	//   68  137:aload_0         
	//   69  138:getfield        #182 <Field Context mContext>
	//   70  141:invokevirtual   #652 <Method Resources Context.getResources()>
	//   71  144:invokevirtual   #657 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   72  147:astore          6
						theme.setTo(((android.content.res.Resources.Theme) (callback)));
	//   73  149:aload           6
	//   74  151:aload_1         
	//   75  152:invokevirtual   #661 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
						theme.applyStyle(typedvalue.resourceId, true);
	//   76  155:aload           6
	//   77  157:aload           5
	//   78  159:getfield        #391 <Field int TypedValue.resourceId>
	//   79  162:iconst_1        
	//   80  163:invokevirtual   #665 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
						callback = ((android.support.v7.view.ActionMode.Callback) (new ContextThemeWrapper(mContext, 0)));
	//   81  166:new             #393 <Class ContextThemeWrapper>
	//   82  169:dup             
	//   83  170:aload_0         
	//   84  171:getfield        #182 <Field Context mContext>
	//   85  174:iconst_0        
	//   86  175:invokespecial   #396 <Method void ContextThemeWrapper(Context, int)>
	//   87  178:astore_1        
						((Context) (callback)).getTheme().setTo(theme);
	//   88  179:aload_1         
	//   89  180:invokevirtual   #377 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   90  183:aload           6
	//   91  185:invokevirtual   #661 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
					} else
	//*  92  188:goto            196
					{
						callback = ((android.support.v7.view.ActionMode.Callback) (mContext));
	//   93  191:aload_0         
	//   94  192:getfield        #182 <Field Context mContext>
	//   95  195:astore_1        
					}
					mActionModeView = new ActionBarContextView(((Context) (callback)));
	//   96  196:aload_0         
	//   97  197:new             #1397 <Class ActionBarContextView>
	//   98  200:dup             
	//   99  201:aload_1         
	//  100  202:invokespecial   #1398 <Method void ActionBarContextView(Context)>
	//  101  205:putfield        #1395 <Field ActionBarContextView mActionModeView>
					mActionModePopup = new PopupWindow(((Context) (callback)), ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionModePopupWindowStyle);
	//  102  208:aload_0         
	//  103  209:new             #1121 <Class PopupWindow>
	//  104  212:dup             
	//  105  213:aload_1         
	//  106  214:aconst_null     
	//  107  215:getstatic       #1401 <Field int android.support.v7.appcompat.R$attr.actionModePopupWindowStyle>
	//  108  218:invokespecial   #1404 <Method void PopupWindow(Context, AttributeSet, int)>
	//  109  221:putfield        #1117 <Field PopupWindow mActionModePopup>
					PopupWindowCompat.setWindowLayoutType(mActionModePopup, 2);
	//  110  224:aload_0         
	//  111  225:getfield        #1117 <Field PopupWindow mActionModePopup>
	//  112  228:iconst_2        
	//  113  229:invokestatic    #1410 <Method void PopupWindowCompat.setWindowLayoutType(PopupWindow, int)>
					mActionModePopup.setContentView(((View) (mActionModeView)));
	//  114  232:aload_0         
	//  115  233:getfield        #1117 <Field PopupWindow mActionModePopup>
	//  116  236:aload_0         
	//  117  237:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  118  240:invokevirtual   #1411 <Method void PopupWindow.setContentView(View)>
					mActionModePopup.setWidth(-1);
	//  119  243:aload_0         
	//  120  244:getfield        #1117 <Field PopupWindow mActionModePopup>
	//  121  247:iconst_m1       
	//  122  248:invokevirtual   #1414 <Method void PopupWindow.setWidth(int)>
					((Context) (callback)).getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarSize, typedvalue, true);
	//  123  251:aload_1         
	//  124  252:invokevirtual   #377 <Method android.content.res.Resources$Theme Context.getTheme()>
	//  125  255:getstatic       #1417 <Field int android.support.v7.appcompat.R$attr.actionBarSize>
	//  126  258:aload           5
	//  127  260:iconst_1        
	//  128  261:invokevirtual   #388 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//  129  264:pop             
					int i = TypedValue.complexToDimensionPixelSize(typedvalue.data, ((Context) (callback)).getResources().getDisplayMetrics());
	//  130  265:aload           5
	//  131  267:getfield        #1420 <Field int TypedValue.data>
	//  132  270:aload_1         
	//  133  271:invokevirtual   #652 <Method Resources Context.getResources()>
	//  134  274:invokevirtual   #1009 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//  135  277:invokestatic    #1424 <Method int TypedValue.complexToDimensionPixelSize(int, android.util.DisplayMetrics)>
	//  136  280:istore_2        
					mActionModeView.setContentHeight(i);
	//  137  281:aload_0         
	//  138  282:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  139  285:iload_2         
	//  140  286:invokevirtual   #1427 <Method void ActionBarContextView.setContentHeight(int)>
					mActionModePopup.setHeight(-2);
	//  141  289:aload_0         
	//  142  290:getfield        #1117 <Field PopupWindow mActionModePopup>
	//  143  293:bipush          -2
	//  144  295:invokevirtual   #1430 <Method void PopupWindow.setHeight(int)>
					mShowActionModePopup = new Runnable() {

						public void run()
						{
							mActionModePopup.showAtLocation(((View) (mActionModeView)), 55, 0, 0);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field AppCompatDelegateImpl this$0>
						//    2    4:getfield        #28  <Field PopupWindow AppCompatDelegateImpl.mActionModePopup>
						//    3    7:aload_0         
						//    4    8:getfield        #19  <Field AppCompatDelegateImpl this$0>
						//    5   11:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
						//    6   14:bipush          55
						//    7   16:iconst_0        
						//    8   17:iconst_0        
						//    9   18:invokevirtual   #38  <Method void PopupWindow.showAtLocation(View, int, int, int)>
							endOnGoingFadeAnimation();
						//   10   21:aload_0         
						//   11   22:getfield        #19  <Field AppCompatDelegateImpl this$0>
						//   12   25:invokevirtual   #41  <Method void AppCompatDelegateImpl.endOnGoingFadeAnimation()>
							if(shouldAnimateActionModeView())
						//*  13   28:aload_0         
						//*  14   29:getfield        #19  <Field AppCompatDelegateImpl this$0>
						//*  15   32:invokevirtual   #45  <Method boolean AppCompatDelegateImpl.shouldAnimateActionModeView()>
						//*  16   35:ifeq            89
							{
								mActionModeView.setAlpha(0.0F);
						//   17   38:aload_0         
						//   18   39:getfield        #19  <Field AppCompatDelegateImpl this$0>
						//   19   42:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
						//   20   45:fconst_0        
						//   21   46:invokevirtual   #51  <Method void ActionBarContextView.setAlpha(float)>
								AppCompatDelegateImpl appcompatdelegateimpl = AppCompatDelegateImpl.this;
						//   22   49:aload_0         
						//   23   50:getfield        #19  <Field AppCompatDelegateImpl this$0>
						//   24   53:astore_1        
								appcompatdelegateimpl.mFadeAnim = ViewCompat.animate(((View) (appcompatdelegateimpl.mActionModeView))).alpha(1.0F);
						//   25   54:aload_1         
						//   26   55:aload_1         
						//   27   56:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
						//   28   59:invokestatic    #57  <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
						//   29   62:fconst_1        
						//   30   63:invokevirtual   #63  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
						//   31   66:putfield        #67  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
								mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

									public void onAnimationEnd(View view)
									{
										mActionModeView.setAlpha(1.0F);
									//    0    0:aload_0         
									//    1    1:getfield        #15  <Field AppCompatDelegateImpl$6 this$1>
									//    2    4:getfield        #24  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
									//    3    7:getfield        #30  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
									//    4   10:fconst_1        
									//    5   11:invokevirtual   #36  <Method void ActionBarContextView.setAlpha(float)>
										mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
									//    6   14:aload_0         
									//    7   15:getfield        #15  <Field AppCompatDelegateImpl$6 this$1>
									//    8   18:getfield        #24  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
									//    9   21:getfield        #40  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
									//   10   24:aconst_null     
									//   11   25:invokevirtual   #46  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
									//   12   28:pop             
										mFadeAnim = null;
									//   13   29:aload_0         
									//   14   30:getfield        #15  <Field AppCompatDelegateImpl$6 this$1>
									//   15   33:getfield        #24  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
									//   16   36:aconst_null     
									//   17   37:putfield        #40  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
									//   18   40:return          
									}

									public void onAnimationStart(View view)
									{
										mActionModeView.setVisibility(0);
									//    0    0:aload_0         
									//    1    1:getfield        #15  <Field AppCompatDelegateImpl$6 this$1>
									//    2    4:getfield        #24  <Field AppCompatDelegateImpl AppCompatDelegateImpl$6.this$0>
									//    3    7:getfield        #30  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
									//    4   10:iconst_0        
									//    5   11:invokevirtual   #51  <Method void ActionBarContextView.setVisibility(int)>
									//    6   14:return          
									}

									final _cls6 this$1;

			
			{
				this$1 = _cls6.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppCompatDelegateImpl$6 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
								}
)));
						//   32   69:aload_0         
						//   33   70:getfield        #19  <Field AppCompatDelegateImpl this$0>
						//   34   73:getfield        #67  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
						//   35   76:new             #13  <Class AppCompatDelegateImpl$6$1>
						//   36   79:dup             
						//   37   80:aload_0         
						//   38   81:invokespecial   #70  <Method void AppCompatDelegateImpl$6$1(AppCompatDelegateImpl$6)>
						//   39   84:invokevirtual   #74  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
						//   40   87:pop             
								return;
						//   41   88:return          
							} else
							{
								mActionModeView.setAlpha(1.0F);
						//   42   89:aload_0         
						//   43   90:getfield        #19  <Field AppCompatDelegateImpl this$0>
						//   44   93:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
						//   45   96:fconst_1        
						//   46   97:invokevirtual   #51  <Method void ActionBarContextView.setAlpha(float)>
								mActionModeView.setVisibility(0);
						//   47  100:aload_0         
						//   48  101:getfield        #19  <Field AppCompatDelegateImpl this$0>
						//   49  104:getfield        #32  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
						//   50  107:iconst_0        
						//   51  108:invokevirtual   #78  <Method void ActionBarContextView.setVisibility(int)>
								return;
						//   52  111:return          
							}
						}

						final AppCompatDelegateImpl this$0;

			
			{
				this$0 = AppCompatDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppCompatDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
					}
;
	//  145  298:aload_0         
	//  146  299:new             #20  <Class AppCompatDelegateImpl$6>
	//  147  302:dup             
	//  148  303:aload_0         
	//  149  304:invokespecial   #1431 <Method void AppCompatDelegateImpl$6(AppCompatDelegateImpl)>
	//  150  307:putfield        #1119 <Field Runnable mShowActionModePopup>
				} else
	//* 151  310:goto            353
				{
					callback = ((android.support.v7.view.ActionMode.Callback) ((ViewStubCompat)mSubDecor.findViewById(android.support.v7.appcompat.R.id.action_mode_bar_stub)));
	//  152  313:aload_0         
	//  153  314:getfield        #230 <Field ViewGroup mSubDecor>
	//  154  317:getstatic       #1434 <Field int android.support.v7.appcompat.R$id.action_mode_bar_stub>
	//  155  320:invokevirtual   #237 <Method View ViewGroup.findViewById(int)>
	//  156  323:checkcast       #1436 <Class ViewStubCompat>
	//  157  326:astore_1        
					if(callback != null)
	//* 158  327:aload_1         
	//* 159  328:ifnull          353
					{
						((ViewStubCompat) (callback)).setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
	//  160  331:aload_1         
	//  161  332:aload_0         
	//  162  333:invokevirtual   #628 <Method Context getActionBarThemedContext()>
	//  163  336:invokestatic    #355 <Method LayoutInflater LayoutInflater.from(Context)>
	//  164  339:invokevirtual   #1440 <Method void ViewStubCompat.setLayoutInflater(LayoutInflater)>
						mActionModeView = (ActionBarContextView)((ViewStubCompat) (callback)).inflate();
	//  165  342:aload_0         
	//  166  343:aload_1         
	//  167  344:invokevirtual   #1442 <Method View ViewStubCompat.inflate()>
	//  168  347:checkcast       #1397 <Class ActionBarContextView>
	//  169  350:putfield        #1395 <Field ActionBarContextView mActionModeView>
					}
				}
			if(mActionModeView != null)
	//* 170  353:aload_0         
	//* 171  354:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//* 172  357:ifnull          573
			{
				endOnGoingFadeAnimation();
	//  173  360:aload_0         
	//  174  361:invokevirtual   #1130 <Method void endOnGoingFadeAnimation()>
				mActionModeView.killMode();
	//  175  364:aload_0         
	//  176  365:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  177  368:invokevirtual   #1445 <Method void ActionBarContextView.killMode()>
				callback = ((android.support.v7.view.ActionMode.Callback) (mActionModeView.getContext()));
	//  178  371:aload_0         
	//  179  372:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  180  375:invokevirtual   #1448 <Method Context ActionBarContextView.getContext()>
	//  181  378:astore_1        
				ActionBarContextView actionbarcontextview = mActionModeView;
	//  182  379:aload_0         
	//  183  380:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  184  383:astore          5
				if(mActionModePopup != null)
	//* 185  385:aload_0         
	//* 186  386:getfield        #1117 <Field PopupWindow mActionModePopup>
	//* 187  389:ifnonnull       395
	//* 188  392:goto            397
					flag = false;
	//  189  395:iconst_0        
	//  190  396:istore_3        
				callback = ((android.support.v7.view.ActionMode.Callback) (new StandaloneActionMode(((Context) (callback)), actionbarcontextview, ((android.support.v7.view.ActionMode.Callback) (obj)), flag)));
	//  191  397:new             #1450 <Class StandaloneActionMode>
	//  192  400:dup             
	//  193  401:aload_1         
	//  194  402:aload           5
	//  195  404:aload           4
	//  196  406:iload_3         
	//  197  407:invokespecial   #1453 <Method void StandaloneActionMode(Context, ActionBarContextView, android.support.v7.view.ActionMode$Callback, boolean)>
	//  198  410:astore_1        
				if(((android.support.v7.view.ActionMode.Callback) (obj)).onCreateActionMode(((ActionMode) (callback)), ((ActionMode) (callback)).getMenu()))
	//* 199  411:aload           4
	//* 200  413:aload_1         
	//* 201  414:aload_1         
	//* 202  415:invokevirtual   #1457 <Method Menu ActionMode.getMenu()>
	//* 203  418:invokeinterface #1463 <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
	//* 204  423:ifeq            568
				{
					((ActionMode) (callback)).invalidate();
	//  205  426:aload_1         
	//  206  427:invokevirtual   #1466 <Method void ActionMode.invalidate()>
					mActionModeView.initForMode(((ActionMode) (callback)));
	//  207  430:aload_0         
	//  208  431:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  209  434:aload_1         
	//  210  435:invokevirtual   #1469 <Method void ActionBarContextView.initForMode(ActionMode)>
					mActionMode = ((ActionMode) (callback));
	//  211  438:aload_0         
	//  212  439:aload_1         
	//  213  440:putfield        #704 <Field ActionMode mActionMode>
					if(shouldAnimateActionModeView())
	//* 214  443:aload_0         
	//* 215  444:invokevirtual   #1471 <Method boolean shouldAnimateActionModeView()>
	//* 216  447:ifeq            492
					{
						mActionModeView.setAlpha(0.0F);
	//  217  450:aload_0         
	//  218  451:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  219  454:fconst_0        
	//  220  455:invokevirtual   #1475 <Method void ActionBarContextView.setAlpha(float)>
						mFadeAnim = ViewCompat.animate(((View) (mActionModeView))).alpha(1.0F);
	//  221  458:aload_0         
	//  222  459:aload_0         
	//  223  460:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  224  463:invokestatic    #1479 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//  225  466:fconst_1        
	//  226  467:invokevirtual   #1483 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//  227  470:putfield        #171 <Field ViewPropertyAnimatorCompat mFadeAnim>
						mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

							public void onAnimationEnd(View view)
							{
								mActionModeView.setAlpha(1.0F);
							//    0    0:aload_0         
							//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
							//    2    4:getfield        #25  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
							//    3    7:fconst_1        
							//    4    8:invokevirtual   #31  <Method void ActionBarContextView.setAlpha(float)>
								mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
							//    5   11:aload_0         
							//    6   12:getfield        #15  <Field AppCompatDelegateImpl this$0>
							//    7   15:getfield        #35  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
							//    8   18:aconst_null     
							//    9   19:invokevirtual   #41  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
							//   10   22:pop             
								mFadeAnim = null;
							//   11   23:aload_0         
							//   12   24:getfield        #15  <Field AppCompatDelegateImpl this$0>
							//   13   27:aconst_null     
							//   14   28:putfield        #35  <Field ViewPropertyAnimatorCompat AppCompatDelegateImpl.mFadeAnim>
							//   15   31:return          
							}

							public void onAnimationStart(View view)
							{
								mActionModeView.setVisibility(0);
							//    0    0:aload_0         
							//    1    1:getfield        #15  <Field AppCompatDelegateImpl this$0>
							//    2    4:getfield        #25  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
							//    3    7:iconst_0        
							//    4    8:invokevirtual   #46  <Method void ActionBarContextView.setVisibility(int)>
								mActionModeView.sendAccessibilityEvent(32);
							//    5   11:aload_0         
							//    6   12:getfield        #15  <Field AppCompatDelegateImpl this$0>
							//    7   15:getfield        #25  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
							//    8   18:bipush          32
							//    9   20:invokevirtual   #49  <Method void ActionBarContextView.sendAccessibilityEvent(int)>
								if(mActionModeView.getParent() instanceof View)
							//*  10   23:aload_0         
							//*  11   24:getfield        #15  <Field AppCompatDelegateImpl this$0>
							//*  12   27:getfield        #25  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
							//*  13   30:invokevirtual   #53  <Method ViewParent ActionBarContextView.getParent()>
							//*  14   33:instanceof      #55  <Class View>
							//*  15   36:ifeq            55
									ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
							//   16   39:aload_0         
							//   17   40:getfield        #15  <Field AppCompatDelegateImpl this$0>
							//   18   43:getfield        #25  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
							//   19   46:invokevirtual   #53  <Method ViewParent ActionBarContextView.getParent()>
							//   20   49:checkcast       #55  <Class View>
							//   21   52:invokestatic    #60  <Method void ViewCompat.requestApplyInsets(View)>
							//   22   55:return          
							}

							final AppCompatDelegateImpl this$0;

			
			{
				this$0 = AppCompatDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppCompatDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
						}
)));
	//  228  473:aload_0         
	//  229  474:getfield        #171 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//  230  477:new             #24  <Class AppCompatDelegateImpl$7>
	//  231  480:dup             
	//  232  481:aload_0         
	//  233  482:invokespecial   #1484 <Method void AppCompatDelegateImpl$7(AppCompatDelegateImpl)>
	//  234  485:invokevirtual   #1488 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//  235  488:pop             
					} else
	//* 236  489:goto            543
					{
						mActionModeView.setAlpha(1.0F);
	//  237  492:aload_0         
	//  238  493:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  239  496:fconst_1        
	//  240  497:invokevirtual   #1475 <Method void ActionBarContextView.setAlpha(float)>
						mActionModeView.setVisibility(0);
	//  241  500:aload_0         
	//  242  501:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  243  504:iconst_0        
	//  244  505:invokevirtual   #1491 <Method void ActionBarContextView.setVisibility(int)>
						mActionModeView.sendAccessibilityEvent(32);
	//  245  508:aload_0         
	//  246  509:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  247  512:bipush          32
	//  248  514:invokevirtual   #1494 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
						if(mActionModeView.getParent() instanceof View)
	//* 249  517:aload_0         
	//* 250  518:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//* 251  521:invokevirtual   #1495 <Method ViewParent ActionBarContextView.getParent()>
	//* 252  524:instanceof      #245 <Class View>
	//* 253  527:ifeq            543
							ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
	//  254  530:aload_0         
	//  255  531:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  256  534:invokevirtual   #1495 <Method ViewParent ActionBarContextView.getParent()>
	//  257  537:checkcast       #245 <Class View>
	//  258  540:invokestatic    #1498 <Method void ViewCompat.requestApplyInsets(View)>
					}
					if(mActionModePopup != null)
	//* 259  543:aload_0         
	//* 260  544:getfield        #1117 <Field PopupWindow mActionModePopup>
	//* 261  547:ifnull          573
						mWindow.getDecorView().post(mShowActionModePopup);
	//  262  550:aload_0         
	//  263  551:getfield        #184 <Field Window mWindow>
	//  264  554:invokevirtual   #243 <Method View Window.getDecorView()>
	//  265  557:aload_0         
	//  266  558:getfield        #1119 <Field Runnable mShowActionModePopup>
	//  267  561:invokevirtual   #1501 <Method boolean View.post(Runnable)>
	//  268  564:pop             
				} else
	//* 269  565:goto            573
				{
					mActionMode = null;
	//  270  568:aload_0         
	//  271  569:aconst_null     
	//  272  570:putfield        #704 <Field ActionMode mActionMode>
				}
			}
		}
		callback = ((android.support.v7.view.ActionMode.Callback) (mActionMode));
	//  273  573:aload_0         
	//  274  574:getfield        #704 <Field ActionMode mActionMode>
	//  275  577:astore_1        
		if(callback != null)
	//* 276  578:aload_1         
	//* 277  579:ifnull          601
		{
			AppCompatCallback appcompatcallback = mAppCompatCallback;
	//  278  582:aload_0         
	//  279  583:getfield        #186 <Field AppCompatCallback mAppCompatCallback>
	//  280  586:astore          4
			if(appcompatcallback != null)
	//* 281  588:aload           4
	//* 282  590:ifnull          601
				appcompatcallback.onSupportActionModeStarted(((ActionMode) (callback)));
	//  283  593:aload           4
	//  284  595:aload_1         
	//  285  596:invokeinterface #1383 <Method void AppCompatCallback.onSupportActionModeStarted(ActionMode)>
		}
		return mActionMode;
	//  286  601:aload_0         
	//  287  602:getfield        #704 <Field ActionMode mActionMode>
	//  288  605:areturn         
		callback;
	//  289  606:astore_1        
		if(true) goto _L2; else goto _L4
_L4:
	//* 290  607:goto            69
	}

	int updateStatusGuard(int i)
	{
		Object obj = ((Object) (mActionModeView));
	//    0    0:aload_0         
	//    1    1:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//    2    4:astore          9
		boolean flag4 = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		boolean flag2;
		if(obj != null && (((ActionBarContextView) (obj)).getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
	//*   5    9:aload           9
	//*   6   11:ifnull          369
	//*   7   14:aload           9
	//*   8   16:invokevirtual   #1503 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//*   9   19:instanceof      #1505 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  10   22:ifeq            369
		{
			obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams()));
	//   11   25:aload_0         
	//   12   26:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//   13   29:invokevirtual   #1503 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//   14   32:checkcast       #1505 <Class android.view.ViewGroup$MarginLayoutParams>
	//   15   35:astore          9
			boolean flag5 = mActionModeView.isShown();
	//   16   37:aload_0         
	//   17   38:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//   18   41:invokevirtual   #1508 <Method boolean ActionBarContextView.isShown()>
	//   19   44:istore          8
			boolean flag3 = true;
	//   20   46:iconst_1        
	//   21   47:istore          6
			int j;
			boolean flag;
			int k;
			if(flag5)
	//*  22   49:iload           8
	//*  23   51:ifeq            310
			{
				if(mTempRect1 == null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #1510 <Field Rect mTempRect1>
	//*  26   58:ifnonnull       83
				{
					mTempRect1 = new Rect();
	//   27   61:aload_0         
	//   28   62:new             #1512 <Class Rect>
	//   29   65:dup             
	//   30   66:invokespecial   #1513 <Method void Rect()>
	//   31   69:putfield        #1510 <Field Rect mTempRect1>
					mTempRect2 = new Rect();
	//   32   72:aload_0         
	//   33   73:new             #1512 <Class Rect>
	//   34   76:dup             
	//   35   77:invokespecial   #1513 <Method void Rect()>
	//   36   80:putfield        #1515 <Field Rect mTempRect2>
				}
				Rect rect = mTempRect1;
	//   37   83:aload_0         
	//   38   84:getfield        #1510 <Field Rect mTempRect1>
	//   39   87:astore          10
				Rect rect1 = mTempRect2;
	//   40   89:aload_0         
	//   41   90:getfield        #1515 <Field Rect mTempRect2>
	//   42   93:astore          11
				rect.set(0, i, 0, 0);
	//   43   95:aload           10
	//   44   97:iconst_0        
	//   45   98:iload_1         
	//   46   99:iconst_0        
	//   47  100:iconst_0        
	//   48  101:invokevirtual   #1518 <Method void Rect.set(int, int, int, int)>
				ViewUtils.computeFitSystemWindows(((View) (mSubDecor)), rect, rect1);
	//   49  104:aload_0         
	//   50  105:getfield        #230 <Field ViewGroup mSubDecor>
	//   51  108:aload           10
	//   52  110:aload           11
	//   53  112:invokestatic    #1522 <Method void ViewUtils.computeFitSystemWindows(View, Rect, Rect)>
				if(rect1.top == 0)
	//*  54  115:aload           11
	//*  55  117:getfield        #1525 <Field int Rect.top>
	//*  56  120:ifne            128
					j = i;
	//   57  123:iload_1         
	//   58  124:istore_2        
				else
	//*  59  125:goto            130
					j = 0;
	//   60  128:iconst_0        
	//   61  129:istore_2        
				boolean flag1;
				if(((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != j)
	//*  62  130:aload           9
	//*  63  132:getfield        #1528 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//*  64  135:iload_2         
	//*  65  136:icmpeq          252
				{
					obj.topMargin = i;
	//   66  139:aload           9
	//   67  141:iload_1         
	//   68  142:putfield        #1528 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
					Object obj1 = ((Object) (mStatusGuard));
	//   69  145:aload_0         
	//   70  146:getfield        #1530 <Field View mStatusGuard>
	//   71  149:astore          10
					if(obj1 == null)
	//*  72  151:aload           10
	//*  73  153:ifnonnull       215
					{
						mStatusGuard = new View(mContext);
	//   74  156:aload_0         
	//   75  157:new             #245 <Class View>
	//   76  160:dup             
	//   77  161:aload_0         
	//   78  162:getfield        #182 <Field Context mContext>
	//   79  165:invokespecial   #1531 <Method void View(Context)>
	//   80  168:putfield        #1530 <Field View mStatusGuard>
						mStatusGuard.setBackgroundColor(mContext.getResources().getColor(android.support.v7.appcompat.R.color.abc_input_method_navigation_guard));
	//   81  171:aload_0         
	//   82  172:getfield        #1530 <Field View mStatusGuard>
	//   83  175:aload_0         
	//   84  176:getfield        #182 <Field Context mContext>
	//   85  179:invokevirtual   #652 <Method Resources Context.getResources()>
	//   86  182:getstatic       #1536 <Field int android.support.v7.appcompat.R$color.abc_input_method_navigation_guard>
	//   87  185:invokevirtual   #1539 <Method int Resources.getColor(int)>
	//   88  188:invokevirtual   #1542 <Method void View.setBackgroundColor(int)>
						mSubDecor.addView(mStatusGuard, -1, new android.view.ViewGroup.LayoutParams(-1, i));
	//   89  191:aload_0         
	//   90  192:getfield        #230 <Field ViewGroup mSubDecor>
	//   91  195:aload_0         
	//   92  196:getfield        #1530 <Field View mStatusGuard>
	//   93  199:iconst_m1       
	//   94  200:new             #792 <Class android.view.ViewGroup$LayoutParams>
	//   95  203:dup             
	//   96  204:iconst_m1       
	//   97  205:iload_1         
	//   98  206:invokespecial   #808 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   99  209:invokevirtual   #1545 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
					} else
	//* 100  212:goto            246
					{
						obj1 = ((Object) (((View) (obj1)).getLayoutParams()));
	//  101  215:aload           10
	//  102  217:invokevirtual   #790 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  103  220:astore          10
						if(((android.view.ViewGroup.LayoutParams) (obj1)).height != i)
	//* 104  222:aload           10
	//* 105  224:getfield        #1548 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 106  227:iload_1         
	//* 107  228:icmpeq          246
						{
							obj1.height = i;
	//  108  231:aload           10
	//  109  233:iload_1         
	//  110  234:putfield        #1548 <Field int android.view.ViewGroup$LayoutParams.height>
							mStatusGuard.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
	//  111  237:aload_0         
	//  112  238:getfield        #1530 <Field View mStatusGuard>
	//  113  241:aload           10
	//  114  243:invokevirtual   #1552 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
						}
					}
					flag1 = true;
	//  115  246:iconst_1        
	//  116  247:istore          5
				} else
	//* 117  249:goto            255
				{
					flag1 = false;
	//  118  252:iconst_0        
	//  119  253:istore          5
				}
				if(mStatusGuard == null)
	//* 120  255:aload_0         
	//* 121  256:getfield        #1530 <Field View mStatusGuard>
	//* 122  259:ifnull          265
	//* 123  262:goto            268
					flag3 = false;
	//  124  265:iconst_0        
	//  125  266:istore          6
				flag = flag1;
	//  126  268:iload           5
	//  127  270:istore_3        
				j = ((int) (flag3));
	//  128  271:iload           6
	//  129  273:istore_2        
				k = i;
	//  130  274:iload_1         
	//  131  275:istore          4
				if(!mOverlayActionMode)
	//* 132  277:aload_0         
	//* 133  278:getfield        #424 <Field boolean mOverlayActionMode>
	//* 134  281:ifne            341
				{
					flag = flag1;
	//  135  284:iload           5
	//  136  286:istore_3        
					j = ((int) (flag3));
	//  137  287:iload           6
	//  138  289:istore_2        
					k = i;
	//  139  290:iload_1         
	//  140  291:istore          4
					if(flag3)
	//* 141  293:iload           6
	//* 142  295:ifeq            341
					{
						k = 0;
	//  143  298:iconst_0        
	//  144  299:istore          4
						flag = flag1;
	//  145  301:iload           5
	//  146  303:istore_3        
						j = ((int) (flag3));
	//  147  304:iload           6
	//  148  306:istore_2        
					}
				}
			} else
	//* 149  307:goto            341
			if(((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != 0)
	//* 150  310:aload           9
	//* 151  312:getfield        #1528 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//* 152  315:ifeq            334
			{
				obj.topMargin = 0;
	//  153  318:aload           9
	//  154  320:iconst_0        
	//  155  321:putfield        #1528 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
				flag = true;
	//  156  324:iconst_1        
	//  157  325:istore_3        
				j = 0;
	//  158  326:iconst_0        
	//  159  327:istore_2        
				k = i;
	//  160  328:iload_1         
	//  161  329:istore          4
			} else
	//* 162  331:goto            341
			{
				flag = false;
	//  163  334:iconst_0        
	//  164  335:istore_3        
				j = ((int) (flag));
	//  165  336:iload_3         
	//  166  337:istore_2        
				k = i;
	//  167  338:iload_1         
	//  168  339:istore          4
			}
			flag2 = ((boolean) (j));
	//  169  341:iload_2         
	//  170  342:istore          5
			i = k;
	//  171  344:iload           4
	//  172  346:istore_1        
			if(flag)
	//* 173  347:iload_3         
	//* 174  348:ifeq            372
			{
				mActionModeView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//  175  351:aload_0         
	//  176  352:getfield        #1395 <Field ActionBarContextView mActionModeView>
	//  177  355:aload           9
	//  178  357:invokevirtual   #1553 <Method void ActionBarContextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				flag2 = ((boolean) (j));
	//  179  360:iload_2         
	//  180  361:istore          5
				i = k;
	//  181  363:iload           4
	//  182  365:istore_1        
			}
		} else
	//* 183  366:goto            372
		{
			flag2 = false;
	//  184  369:iconst_0        
	//  185  370:istore          5
		}
		obj = ((Object) (mStatusGuard));
	//  186  372:aload_0         
	//  187  373:getfield        #1530 <Field View mStatusGuard>
	//  188  376:astore          9
		if(obj != null)
	//* 189  378:aload           9
	//* 190  380:ifnull          403
		{
			byte byte0;
			if(flag2)
	//* 191  383:iload           5
	//* 192  385:ifeq            394
				byte0 = ((byte) (flag4));
	//  193  388:iload           7
	//  194  390:istore_2        
			else
	//* 195  391:goto            397
				byte0 = 8;
	//  196  394:bipush          8
	//  197  396:istore_2        
			((View) (obj)).setVisibility(((int) (byte0)));
	//  198  397:aload           9
	//  199  399:iload_2         
	//  200  400:invokevirtual   #1554 <Method void View.setVisibility(int)>
		}
		return i;
	//  201  403:iload_1         
	//  202  404:ireturn         
	}

	private static final boolean DEBUG = false;
	static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
	private static final boolean IS_PRE_LOLLIPOP;
	private static final String KEY_LOCAL_NIGHT_MODE = "appcompat:local_night_mode";
	private static boolean sInstalledExceptionHandler;
	private static final int sWindowBackgroundStyleable[] = {
		0x1010054
	};
	ActionBar mActionBar;
	private ActionMenuPresenterCallback mActionMenuPresenterCallback;
	ActionMode mActionMode;
	PopupWindow mActionModePopup;
	ActionBarContextView mActionModeView;
	final AppCompatCallback mAppCompatCallback;
	private AppCompatViewInflater mAppCompatViewInflater;
	final android.view.Window.Callback mAppCompatWindowCallback;
	private boolean mApplyDayNightCalled;
	private AutoNightModeManager mAutoNightModeManager;
	private boolean mClosingActionMenu;
	final Context mContext;
	private DecorContentParent mDecorContentParent;
	private boolean mEnableDefaultActionBarUp;
	ViewPropertyAnimatorCompat mFadeAnim;
	private boolean mFeatureIndeterminateProgress;
	private boolean mFeatureProgress;
	private boolean mHandleNativeActionModes;
	boolean mHasActionBar;
	int mInvalidatePanelMenuFeatures;
	boolean mInvalidatePanelMenuPosted;
	private final Runnable mInvalidatePanelMenuRunnable = new Runnable() {

		public void run()
		{
			if((mInvalidatePanelMenuFeatures & 1) != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field AppCompatDelegateImpl this$0>
		//*   2    4:getfield        #23  <Field int AppCompatDelegateImpl.mInvalidatePanelMenuFeatures>
		//*   3    7:iconst_1        
		//*   4    8:iand            
		//*   5    9:ifeq            20
				doInvalidatePanelMenu(0);
		//    6   12:aload_0         
		//    7   13:getfield        #14  <Field AppCompatDelegateImpl this$0>
		//    8   16:iconst_0        
		//    9   17:invokevirtual   #27  <Method void AppCompatDelegateImpl.doInvalidatePanelMenu(int)>
			if((mInvalidatePanelMenuFeatures & 0x1000) != 0)
		//*  10   20:aload_0         
		//*  11   21:getfield        #14  <Field AppCompatDelegateImpl this$0>
		//*  12   24:getfield        #23  <Field int AppCompatDelegateImpl.mInvalidatePanelMenuFeatures>
		//*  13   27:sipush          4096
		//*  14   30:iand            
		//*  15   31:ifeq            43
				doInvalidatePanelMenu(108);
		//   16   34:aload_0         
		//   17   35:getfield        #14  <Field AppCompatDelegateImpl this$0>
		//   18   38:bipush          108
		//   19   40:invokevirtual   #27  <Method void AppCompatDelegateImpl.doInvalidatePanelMenu(int)>
			AppCompatDelegateImpl appcompatdelegateimpl = AppCompatDelegateImpl.this;
		//   20   43:aload_0         
		//   21   44:getfield        #14  <Field AppCompatDelegateImpl this$0>
		//   22   47:astore_1        
			appcompatdelegateimpl.mInvalidatePanelMenuPosted = false;
		//   23   48:aload_1         
		//   24   49:iconst_0        
		//   25   50:putfield        #31  <Field boolean AppCompatDelegateImpl.mInvalidatePanelMenuPosted>
			appcompatdelegateimpl.mInvalidatePanelMenuFeatures = 0;
		//   26   53:aload_1         
		//   27   54:iconst_0        
		//   28   55:putfield        #23  <Field int AppCompatDelegateImpl.mInvalidatePanelMenuFeatures>
		//   29   58:return          
		}

		final AppCompatDelegateImpl this$0;

			
			{
				this$0 = AppCompatDelegateImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AppCompatDelegateImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	boolean mIsDestroyed;
	boolean mIsFloating;
	private int mLocalNightMode;
	private boolean mLongPressBackDown;
	MenuInflater mMenuInflater;
	final android.view.Window.Callback mOriginalWindowCallback;
	boolean mOverlayActionBar;
	boolean mOverlayActionMode;
	private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
	private PanelFeatureState mPanels[];
	private PanelFeatureState mPreparedPanel;
	Runnable mShowActionModePopup;
	private View mStatusGuard;
	private ViewGroup mSubDecor;
	private boolean mSubDecorInstalled;
	private Rect mTempRect1;
	private Rect mTempRect2;
	private CharSequence mTitle;
	private TextView mTitleView;
	final Window mWindow;
	boolean mWindowNoTitle;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #145 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          13
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:goto            15
			flag = false;
	//    6   13:iconst_0        
	//    7   14:istore_0        
		IS_PRE_LOLLIPOP = flag;
	//    8   15:iload_0         
	//    9   16:putstatic       #147 <Field boolean IS_PRE_LOLLIPOP>
	//   10   19:iconst_1        
	//   11   20:newarray        int[]
	//   12   22:dup             
	//   13   23:iconst_0        
	//   14   24:ldc1            #148 <Int 0x1010054>
	//   15   26:iastore         
	//   16   27:putstatic       #150 <Field int[] sWindowBackgroundStyleable>
		if(IS_PRE_LOLLIPOP && !sInstalledExceptionHandler)
	//*  17   30:getstatic       #147 <Field boolean IS_PRE_LOLLIPOP>
	//*  18   33:ifeq            59
	//*  19   36:getstatic       #152 <Field boolean sInstalledExceptionHandler>
	//*  20   39:ifne            59
		{
			Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler()) {

				private boolean shouldWrapException(Throwable throwable)
				{
label0:
					{
						boolean flag1;
label1:
						{
							flag1 = throwable instanceof android.content.res.Resources.NotFoundException;
				//    0    0:aload_1         
				//    1    1:instanceof      #22  <Class android.content.res.Resources$NotFoundException>
				//    2    4:istore_2        
							boolean flag2 = false;
				//    3    5:iconst_0        
				//    4    6:istore_3        
							if(!flag1)
								break label0;
				//    5    7:iload_2         
				//    6    8:ifeq            46
							throwable = ((Throwable) (throwable.getMessage()));
				//    7   11:aload_1         
				//    8   12:invokevirtual   #28  <Method String Throwable.getMessage()>
				//    9   15:astore_1        
							flag1 = flag2;
				//   10   16:iload_3         
				//   11   17:istore_2        
							if(throwable == null)
								break label1;
				//   12   18:aload_1         
				//   13   19:ifnull          44
							if(!((String) (throwable)).contains("drawable"))
				//*  14   22:aload_1         
				//*  15   23:ldc1            #30  <String "drawable">
				//*  16   25:invokevirtual   #36  <Method boolean String.contains(CharSequence)>
				//*  17   28:ifne            42
							{
								flag1 = flag2;
				//   18   31:iload_3         
				//   19   32:istore_2        
								if(!((String) (throwable)).contains("Drawable"))
									break label1;
				//   20   33:aload_1         
				//   21   34:ldc1            #38  <String "Drawable">
				//   22   36:invokevirtual   #36  <Method boolean String.contains(CharSequence)>
				//   23   39:ifeq            44
							}
							flag1 = true;
				//   24   42:iconst_1        
				//   25   43:istore_2        
						}
						return flag1;
				//   26   44:iload_2         
				//   27   45:ireturn         
					}
					return false;
				//   28   46:iconst_0        
				//   29   47:ireturn         
				}

				public void uncaughtException(Thread thread, Throwable throwable)
				{
					if(shouldWrapException(throwable))
				//*   0    0:aload_0         
				//*   1    1:aload_2         
				//*   2    2:invokespecial   #42  <Method boolean shouldWrapException(Throwable)>
				//*   3    5:ifeq            73
					{
						Object obj = ((Object) (new StringBuilder()));
				//    4    8:new             #44  <Class StringBuilder>
				//    5   11:dup             
				//    6   12:invokespecial   #45  <Method void StringBuilder()>
				//    7   15:astore_3        
						((StringBuilder) (obj)).append(throwable.getMessage());
				//    8   16:aload_3         
				//    9   17:aload_2         
				//   10   18:invokevirtual   #28  <Method String Throwable.getMessage()>
				//   11   21:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
				//   12   24:pop             
						((StringBuilder) (obj)).append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
				//   13   25:aload_3         
				//   14   26:ldc1            #51  <String ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.">
				//   15   28:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
				//   16   31:pop             
						obj = ((Object) (new android.content.res.Resources.NotFoundException(((StringBuilder) (obj)).toString())));
				//   17   32:new             #22  <Class android.content.res.Resources$NotFoundException>
				//   18   35:dup             
				//   19   36:aload_3         
				//   20   37:invokevirtual   #54  <Method String StringBuilder.toString()>
				//   21   40:invokespecial   #57  <Method void android.content.res.Resources$NotFoundException(String)>
				//   22   43:astore_3        
						((Throwable) (obj)).initCause(throwable.getCause());
				//   23   44:aload_3         
				//   24   45:aload_2         
				//   25   46:invokevirtual   #61  <Method Throwable Throwable.getCause()>
				//   26   49:invokevirtual   #65  <Method Throwable Throwable.initCause(Throwable)>
				//   27   52:pop             
						((Throwable) (obj)).setStackTrace(throwable.getStackTrace());
				//   28   53:aload_3         
				//   29   54:aload_2         
				//   30   55:invokevirtual   #69  <Method StackTraceElement[] Throwable.getStackTrace()>
				//   31   58:invokevirtual   #73  <Method void Throwable.setStackTrace(StackTraceElement[])>
						defHandler.uncaughtException(thread, ((Throwable) (obj)));
				//   32   61:aload_0         
				//   33   62:getfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
				//   34   65:aload_1         
				//   35   66:aload_3         
				//   36   67:invokeinterface #75  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
						return;
				//   37   72:return          
					} else
					{
						defHandler.uncaughtException(thread, throwable);
				//   38   73:aload_0         
				//   39   74:getfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
				//   40   77:aload_1         
				//   41   78:aload_2         
				//   42   79:invokeinterface #75  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
						return;
				//   43   84:return          
					}
				}

				final Thread.UncaughtExceptionHandler val$defHandler;

			
			{
				defHandler = uncaughtexceptionhandler;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   21   42:new             #10  <Class AppCompatDelegateImpl$1>
	//   22   45:dup             
	//   23   46:invokestatic    #158 <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//   24   49:invokespecial   #162 <Method void AppCompatDelegateImpl$1(Thread$UncaughtExceptionHandler)>
	//   25   52:invokestatic    #165 <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
			sInstalledExceptionHandler = true;
	//   26   55:iconst_1        
	//   27   56:putstatic       #152 <Field boolean sInstalledExceptionHandler>
		}
	//*  28   59:return          
	}
}
