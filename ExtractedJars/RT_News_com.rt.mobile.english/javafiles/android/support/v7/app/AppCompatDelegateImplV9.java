// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.*;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.*;
import android.support.v4.app.NavUtils;
import android.support.v4.view.*;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.*;
import android.support.v7.view.menu.*;
import android.support.v7.widget.*;
import android.text.TextUtils;
import android.util.*;
import android.view.*;
import android.widget.*;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplBase, ToolbarActionBar, AppCompatViewInflater, WindowDecorActionBar, 
//			ActionBar, AppCompatCallback

class AppCompatDelegateImplV9 extends AppCompatDelegateImplBase
	implements android.support.v7.view.menu.MenuBuilder.Callback, android.view.LayoutInflater.Factory2
{
	private final class ActionMenuPresenterCallback
		implements android.support.v7.view.menu.MenuPresenter.Callback
	{

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
			checkCloseActionMenu(menubuilder);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #25  <Method void AppCompatDelegateImplV9.checkCloseActionMenu(MenuBuilder)>
		//    4    8:return          
		}

		public boolean onOpenSubMenu(MenuBuilder menubuilder)
		{
			android.view.Window.Callback callback = getWindowCallback();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//    2    4:invokevirtual   #31  <Method android.view.Window$Callback AppCompatDelegateImplV9.getWindowCallback()>
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

		final AppCompatDelegateImplV9 this$0;

		ActionMenuPresenterCallback()
		{
			this$0 = AppCompatDelegateImplV9.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field AppCompatDelegateImplV9 this$0>
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
		//*   5   11:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//*   6   14:getfield        #41  <Field PopupWindow AppCompatDelegateImplV9.mActionModePopup>
		//*   7   17:ifnull          41
				mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
		//    8   20:aload_0         
		//    9   21:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//   10   24:getfield        #45  <Field Window AppCompatDelegateImplV9.mWindow>
		//   11   27:invokevirtual   #51  <Method View Window.getDecorView()>
		//   12   30:aload_0         
		//   13   31:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//   14   34:getfield        #55  <Field Runnable AppCompatDelegateImplV9.mShowActionModePopup>
		//   15   37:invokevirtual   #61  <Method boolean View.removeCallbacks(Runnable)>
		//   16   40:pop             
			if(mActionModeView != null)
		//*  17   41:aload_0         
		//*  18   42:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//*  19   45:getfield        #65  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
		//*  20   48:ifnull          98
			{
				endOnGoingFadeAnimation();
		//   21   51:aload_0         
		//   22   52:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//   23   55:invokevirtual   #68  <Method void AppCompatDelegateImplV9.endOnGoingFadeAnimation()>
				mFadeAnim = ViewCompat.animate(((View) (mActionModeView))).alpha(0.0F);
		//   24   58:aload_0         
		//   25   59:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//   26   62:aload_0         
		//   27   63:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//   28   66:getfield        #65  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
		//   29   69:invokestatic    #74  <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
		//   30   72:fconst_0        
		//   31   73:invokevirtual   #80  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
		//   32   76:putfield        #84  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
				mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

					public void onAnimationEnd(View view)
					{
						mActionModeView.setVisibility(8);
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//    2    4:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//    3    7:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
					//    4   10:bipush          8
					//    5   12:invokevirtual   #38  <Method void ActionBarContextView.setVisibility(int)>
						if(mActionModePopup != null)
					//*   6   15:aload_0         
					//*   7   16:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//*   8   19:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//*   9   22:getfield        #42  <Field PopupWindow AppCompatDelegateImplV9.mActionModePopup>
					//*  10   25:ifnull          44
							mActionModePopup.dismiss();
					//   11   28:aload_0         
					//   12   29:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   13   32:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   14   35:getfield        #42  <Field PopupWindow AppCompatDelegateImplV9.mActionModePopup>
					//   15   38:invokevirtual   #47  <Method void PopupWindow.dismiss()>
						else
					//*  16   41:goto            82
						if(mActionModeView.getParent() instanceof View)
					//*  17   44:aload_0         
					//*  18   45:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//*  19   48:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//*  20   51:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
					//*  21   54:invokevirtual   #51  <Method ViewParent ActionBarContextView.getParent()>
					//*  22   57:instanceof      #53  <Class View>
					//*  23   60:ifeq            82
							ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
					//   24   63:aload_0         
					//   25   64:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   26   67:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   27   70:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
					//   28   73:invokevirtual   #51  <Method ViewParent ActionBarContextView.getParent()>
					//   29   76:checkcast       #53  <Class View>
					//   30   79:invokestatic    #58  <Method void ViewCompat.requestApplyInsets(View)>
						mActionModeView.removeAllViews();
					//   31   82:aload_0         
					//   32   83:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   33   86:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   34   89:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
					//   35   92:invokevirtual   #61  <Method void ActionBarContextView.removeAllViews()>
						mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
					//   36   95:aload_0         
					//   37   96:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   38   99:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   39  102:getfield        #65  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
					//   40  105:aconst_null     
					//   41  106:invokevirtual   #71  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
					//   42  109:pop             
						mFadeAnim = null;
					//   43  110:aload_0         
					//   44  111:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   45  114:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   46  117:aconst_null     
					//   47  118:putfield        #65  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
					//   48  121:return          
					}

					final ActionModeCallbackWrapperV9 this$1;

			
			{
				this$1 = ActionModeCallbackWrapperV9.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
				}
)));
		//   33   79:aload_0         
		//   34   80:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//   35   83:getfield        #84  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
		//   36   86:new             #11  <Class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1>
		//   37   89:dup             
		//   38   90:aload_0         
		//   39   91:invokespecial   #87  <Method void AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1(AppCompatDelegateImplV9$ActionModeCallbackWrapperV9)>
		//   40   94:invokevirtual   #91  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
		//   41   97:pop             
			}
			if(mAppCompatCallback != null)
		//*  42   98:aload_0         
		//*  43   99:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//*  44  102:getfield        #95  <Field AppCompatCallback AppCompatDelegateImplV9.mAppCompatCallback>
		//*  45  105:ifnull          127
				mAppCompatCallback.onSupportActionModeFinished(mActionMode);
		//   46  108:aload_0         
		//   47  109:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//   48  112:getfield        #95  <Field AppCompatCallback AppCompatDelegateImplV9.mAppCompatCallback>
		//   49  115:aload_0         
		//   50  116:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//   51  119:getfield        #99  <Field ActionMode AppCompatDelegateImplV9.mActionMode>
		//   52  122:invokeinterface #104 <Method void AppCompatCallback.onSupportActionModeFinished(ActionMode)>
			mActionMode = null;
		//   53  127:aload_0         
		//   54  128:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
		//   55  131:aconst_null     
		//   56  132:putfield        #99  <Field ActionMode AppCompatDelegateImplV9.mActionMode>
		//   57  135:return          
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
		final AppCompatDelegateImplV9 this$0;

		public ActionModeCallbackWrapperV9(android.support.v7.view.ActionMode.Callback callback)
		{
			this$0 = AppCompatDelegateImplV9.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field AppCompatDelegateImplV9 this$0>
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
			return AppCompatDelegateImplV9.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field AppCompatDelegateImplV9 this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #30  <Method boolean AppCompatDelegateImplV9.dispatchKeyEvent(KeyEvent)>
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
		//   13   25:getfield        #13  <Field AppCompatDelegateImplV9 this$0>
		//   14   28:iconst_0        
		//   15   29:invokevirtual   #51  <Method void AppCompatDelegateImplV9.closePanel(int)>
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
		//    4    6:invokestatic    #64  <Method android.graphics.drawable.Drawable AppCompatResources.getDrawable(Context, int)>
		//    5    9:invokevirtual   #68  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		//    6   12:return          
		}

		final AppCompatDelegateImplV9 this$0;

		public ListMenuDecorView(Context context)
		{
			this$0 = AppCompatDelegateImplV9.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppCompatDelegateImplV9 this$0>
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
			if(menu != null && frozenMenuState != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #54  <Field MenuBuilder menu>
		//*   2    4:ifnull          30
		//*   3    7:aload_0         
		//*   4    8:getfield        #56  <Field Bundle frozenMenuState>
		//*   5   11:ifnull          30
			{
				menu.restorePresenterStates(frozenMenuState);
		//    6   14:aload_0         
		//    7   15:getfield        #54  <Field MenuBuilder menu>
		//    8   18:aload_0         
		//    9   19:getfield        #56  <Field Bundle frozenMenuState>
		//   10   22:invokevirtual   #62  <Method void MenuBuilder.restorePresenterStates(Bundle)>
				frozenMenuState = null;
		//   11   25:aload_0         
		//   12   26:aconst_null     
		//   13   27:putfield        #56  <Field Bundle frozenMenuState>
			}
		//   14   30:return          
		}

		public void clearMenuPresenters()
		{
			if(menu != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #54  <Field MenuBuilder menu>
		//*   2    4:ifnull          18
				menu.removeMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
		//    3    7:aload_0         
		//    4    8:getfield        #54  <Field MenuBuilder menu>
		//    5   11:aload_0         
		//    6   12:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//    7   15:invokevirtual   #69  <Method void MenuBuilder.removeMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
			listMenuPresenter = null;
		//    8   18:aload_0         
		//    9   19:aconst_null     
		//   10   20:putfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   11   23:return          
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
		//    1    1:checkcast       #9   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
		//    2    4:astore_1        
			featureId = ((SavedState) (parcelable)).featureId;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:getfield        #115 <Field int AppCompatDelegateImplV9$PanelFeatureState$SavedState.featureId>
		//    6   10:putfield        #48  <Field int featureId>
			wasLastOpen = ((SavedState) (parcelable)).isOpen;
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:getfield        #117 <Field boolean AppCompatDelegateImplV9$PanelFeatureState$SavedState.isOpen>
		//   10   18:putfield        #119 <Field boolean wasLastOpen>
			frozenMenuState = ((SavedState) (parcelable)).menuState;
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:getfield        #122 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState$SavedState.menuState>
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
		//    0    0:new             #9   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
		//    1    3:dup             
		//    2    4:invokespecial   #125 <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
		//    3    7:astore_1        
			savedstate.featureId = featureId;
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #48  <Field int featureId>
		//    7   13:putfield        #115 <Field int AppCompatDelegateImplV9$PanelFeatureState$SavedState.featureId>
			savedstate.isOpen = isOpen;
		//    8   16:aload_1         
		//    9   17:aload_0         
		//   10   18:getfield        #126 <Field boolean isOpen>
		//   11   21:putfield        #117 <Field boolean AppCompatDelegateImplV9$PanelFeatureState$SavedState.isOpen>
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
		//   19   39:putfield        #122 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState$SavedState.menuState>
				menu.savePresenterStates(savedstate.menuState);
		//   20   42:aload_0         
		//   21   43:getfield        #54  <Field MenuBuilder menu>
		//   22   46:aload_1         
		//   23   47:getfield        #122 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState$SavedState.menuState>
		//   24   50:invokevirtual   #132 <Method void MenuBuilder.savePresenterStates(Bundle)>
			}
			return ((Parcelable) (savedstate));
		//   25   53:aload_1         
		//   26   54:areturn         
		}

		void setMenu(MenuBuilder menubuilder)
		{
			if(menubuilder == menu)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #54  <Field MenuBuilder menu>
		//*   3    5:if_acmpne       9
				return;
		//    4    8:return          
			if(menu != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #54  <Field MenuBuilder menu>
		//*   7   13:ifnull          27
				menu.removeMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
		//    8   16:aload_0         
		//    9   17:getfield        #54  <Field MenuBuilder menu>
		//   10   20:aload_0         
		//   11   21:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   12   24:invokevirtual   #69  <Method void MenuBuilder.removeMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
			menu = menubuilder;
		//   13   27:aload_0         
		//   14   28:aload_1         
		//   15   29:putfield        #54  <Field MenuBuilder menu>
			if(menubuilder != null && listMenuPresenter != null)
		//*  16   32:aload_1         
		//*  17   33:ifnull          51
		//*  18   36:aload_0         
		//*  19   37:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//*  20   40:ifnull          51
				menubuilder.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
		//   21   43:aload_1         
		//   22   44:aload_0         
		//   23   45:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   24   48:invokevirtual   #90  <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		//   25   51:return          
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
		//    0    0:new             #2   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
		//    1    3:dup             
		//    2    4:invokespecial   #35  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
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
			//    2    2:invokestatic    #26  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return PanelFeatureState.SavedState.readFromParcel(parcel, classloader);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokestatic    #26  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #29  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #32  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #37  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int featureId;
		boolean isOpen;
		Bundle menuState;

		static 
		{
		//    0    0:new             #14  <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState$1()>
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
			AppCompatDelegateImplV9 appcompatdelegateimplv9 = AppCompatDelegateImplV9.this;
		//   11   19:aload_0         
		//   12   20:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//   13   23:astore          5
			if(flag1)
		//*  14   25:iload_3         
		//*  15   26:ifeq            32
				menubuilder = menubuilder1;
		//   16   29:aload           4
		//   17   31:astore_1        
			menubuilder = ((MenuBuilder) (appcompatdelegateimplv9.findMenuPanel(((Menu) (menubuilder)))));
		//   18   32:aload           5
		//   19   34:aload_1         
		//   20   35:invokevirtual   #31  <Method AppCompatDelegateImplV9$PanelFeatureState AppCompatDelegateImplV9.findMenuPanel(Menu)>
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
		//   27   48:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//   28   51:aload_1         
		//   29   52:getfield        #37  <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
		//   30   55:aload_1         
		//   31   56:aload           4
		//   32   58:invokevirtual   #41  <Method void AppCompatDelegateImplV9.callOnPanelClosed(int, AppCompatDelegateImplV9$PanelFeatureState, Menu)>
					closePanel(((PanelFeatureState) (menubuilder)), true);
		//   33   61:aload_0         
		//   34   62:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//   35   65:aload_1         
		//   36   66:iconst_1        
		//   37   67:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
					return;
		//   38   70:return          
				}
				closePanel(((PanelFeatureState) (menubuilder)), flag);
		//   39   71:aload_0         
		//   40   72:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//   41   75:aload_1         
		//   42   76:iload_2         
		//   43   77:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
			}
		//   44   80:return          
		}

		public boolean onOpenSubMenu(MenuBuilder menubuilder)
		{
			if(menubuilder == null && mHasActionBar)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       46
		//*   2    4:aload_0         
		//*   3    5:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//*   4    8:getfield        #51  <Field boolean AppCompatDelegateImplV9.mHasActionBar>
		//*   5   11:ifeq            46
			{
				android.view.Window.Callback callback = getWindowCallback();
		//    6   14:aload_0         
		//    7   15:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//    8   18:invokevirtual   #55  <Method android.view.Window$Callback AppCompatDelegateImplV9.getWindowCallback()>
		//    9   21:astore_2        
				if(callback != null && !isDestroyed())
		//*  10   22:aload_2         
		//*  11   23:ifnull          46
		//*  12   26:aload_0         
		//*  13   27:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//*  14   30:invokevirtual   #59  <Method boolean AppCompatDelegateImplV9.isDestroyed()>
		//*  15   33:ifne            46
					callback.onMenuOpened(108, ((Menu) (menubuilder)));
		//   16   36:aload_2         
		//   17   37:bipush          108
		//   18   39:aload_1         
		//   19   40:invokeinterface #65  <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
		//   20   45:pop             
			}
			return true;
		//   21   46:iconst_1        
		//   22   47:ireturn         
		}

		final AppCompatDelegateImplV9 this$0;

		PanelMenuPresenterCallback()
		{
			this$0 = AppCompatDelegateImplV9.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field AppCompatDelegateImplV9 this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	AppCompatDelegateImplV9(Context context, Window window, AppCompatCallback appcompatcallback)
	{
		super(context, window, appcompatcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #104 <Method void AppCompatDelegateImplBase(Context, Window, AppCompatCallback)>
		mFadeAnim = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//    8   12:aload_0         
	//    9   13:new             #10  <Class AppCompatDelegateImplV9$1>
	//   10   16:dup             
	//   11   17:aload_0         
	//   12   18:invokespecial   #109 <Method void AppCompatDelegateImplV9$1(AppCompatDelegateImplV9)>
	//   13   21:putfield        #111 <Field Runnable mInvalidatePanelMenuRunnable>
	//   14   24:return          
	}

	private void applyFixedSizeWindow()
	{
		ContentFrameLayout contentframelayout = (ContentFrameLayout)mSubDecor.findViewById(0x1020002);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field ViewGroup mSubDecor>
	//    2    4:ldc1            #115 <Int 0x1020002>
	//    3    6:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    4    9:checkcast       #123 <Class ContentFrameLayout>
	//    5   12:astore_1        
		Object obj = ((Object) (mWindow.getDecorView()));
	//    6   13:aload_0         
	//    7   14:getfield        #127 <Field Window mWindow>
	//    8   17:invokevirtual   #133 <Method View Window.getDecorView()>
	//    9   20:astore_2        
		contentframelayout.setDecorPadding(((View) (obj)).getPaddingLeft(), ((View) (obj)).getPaddingTop(), ((View) (obj)).getPaddingRight(), ((View) (obj)).getPaddingBottom());
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:invokevirtual   #139 <Method int View.getPaddingLeft()>
	//   13   26:aload_2         
	//   14   27:invokevirtual   #142 <Method int View.getPaddingTop()>
	//   15   30:aload_2         
	//   16   31:invokevirtual   #145 <Method int View.getPaddingRight()>
	//   17   34:aload_2         
	//   18   35:invokevirtual   #148 <Method int View.getPaddingBottom()>
	//   19   38:invokevirtual   #152 <Method void ContentFrameLayout.setDecorPadding(int, int, int, int)>
		obj = ((Object) (mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme)));
	//   20   41:aload_0         
	//   21   42:getfield        #156 <Field Context mContext>
	//   22   45:getstatic       #162 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
	//   23   48:invokevirtual   #168 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   24   51:astore_2        
		((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor, contentframelayout.getMinWidthMajor());
	//   25   52:aload_2         
	//   26   53:getstatic       #171 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowMinWidthMajor>
	//   27   56:aload_1         
	//   28   57:invokevirtual   #175 <Method TypedValue ContentFrameLayout.getMinWidthMajor()>
	//   29   60:invokevirtual   #181 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   30   63:pop             
		((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor, contentframelayout.getMinWidthMinor());
	//   31   64:aload_2         
	//   32   65:getstatic       #184 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowMinWidthMinor>
	//   33   68:aload_1         
	//   34   69:invokevirtual   #187 <Method TypedValue ContentFrameLayout.getMinWidthMinor()>
	//   35   72:invokevirtual   #181 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   36   75:pop             
		if(((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor))
	//*  37   76:aload_2         
	//*  38   77:getstatic       #190 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedWidthMajor>
	//*  39   80:invokevirtual   #194 <Method boolean TypedArray.hasValue(int)>
	//*  40   83:ifeq            98
			((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor, contentframelayout.getFixedWidthMajor());
	//   41   86:aload_2         
	//   42   87:getstatic       #190 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedWidthMajor>
	//   43   90:aload_1         
	//   44   91:invokevirtual   #197 <Method TypedValue ContentFrameLayout.getFixedWidthMajor()>
	//   45   94:invokevirtual   #181 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   46   97:pop             
		if(((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor))
	//*  47   98:aload_2         
	//*  48   99:getstatic       #200 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedWidthMinor>
	//*  49  102:invokevirtual   #194 <Method boolean TypedArray.hasValue(int)>
	//*  50  105:ifeq            120
			((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor, contentframelayout.getFixedWidthMinor());
	//   51  108:aload_2         
	//   52  109:getstatic       #200 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedWidthMinor>
	//   53  112:aload_1         
	//   54  113:invokevirtual   #203 <Method TypedValue ContentFrameLayout.getFixedWidthMinor()>
	//   55  116:invokevirtual   #181 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   56  119:pop             
		if(((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor))
	//*  57  120:aload_2         
	//*  58  121:getstatic       #206 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedHeightMajor>
	//*  59  124:invokevirtual   #194 <Method boolean TypedArray.hasValue(int)>
	//*  60  127:ifeq            142
			((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor, contentframelayout.getFixedHeightMajor());
	//   61  130:aload_2         
	//   62  131:getstatic       #206 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedHeightMajor>
	//   63  134:aload_1         
	//   64  135:invokevirtual   #209 <Method TypedValue ContentFrameLayout.getFixedHeightMajor()>
	//   65  138:invokevirtual   #181 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   66  141:pop             
		if(((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor))
	//*  67  142:aload_2         
	//*  68  143:getstatic       #212 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedHeightMinor>
	//*  69  146:invokevirtual   #194 <Method boolean TypedArray.hasValue(int)>
	//*  70  149:ifeq            164
			((TypedArray) (obj)).getValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor, contentframelayout.getFixedHeightMinor());
	//   71  152:aload_2         
	//   72  153:getstatic       #212 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowFixedHeightMinor>
	//   73  156:aload_1         
	//   74  157:invokevirtual   #215 <Method TypedValue ContentFrameLayout.getFixedHeightMinor()>
	//   75  160:invokevirtual   #181 <Method boolean TypedArray.getValue(int, TypedValue)>
	//   76  163:pop             
		((TypedArray) (obj)).recycle();
	//   77  164:aload_2         
	//   78  165:invokevirtual   #218 <Method void TypedArray.recycle()>
		contentframelayout.requestLayout();
	//   79  168:aload_1         
	//   80  169:invokevirtual   #221 <Method void ContentFrameLayout.requestLayout()>
	//   81  172:return          
	}

	private ViewGroup createSubDecor()
	{
		Object obj = ((Object) (mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme)));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Context mContext>
	//    2    4:getstatic       #162 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
	//    3    7:invokevirtual   #168 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//    4   10:astore_1        
		if(!((TypedArray) (obj)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar))
	//*   5   11:aload_1         
	//*   6   12:getstatic       #226 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBar>
	//*   7   15:invokevirtual   #194 <Method boolean TypedArray.hasValue(int)>
	//*   8   18:ifne            35
		{
			((TypedArray) (obj)).recycle();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #218 <Method void TypedArray.recycle()>
			throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
	//   11   25:new             #228 <Class IllegalStateException>
	//   12   28:dup             
	//   13   29:ldc1            #230 <String "You need to use a Theme.AppCompat theme (or descendant) with this activity.">
	//   14   31:invokespecial   #233 <Method void IllegalStateException(String)>
	//   15   34:athrow          
		}
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false))
	//*  16   35:aload_1         
	//*  17   36:getstatic       #236 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowNoTitle>
	//*  18   39:iconst_0        
	//*  19   40:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  20   43:ifeq            55
			requestWindowFeature(1);
	//   21   46:aload_0         
	//   22   47:iconst_1        
	//   23   48:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//   24   51:pop             
		else
	//*  25   52:goto            73
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar, false))
	//*  26   55:aload_1         
	//*  27   56:getstatic       #226 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBar>
	//*  28   59:iconst_0        
	//*  29   60:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  30   63:ifeq            73
			requestWindowFeature(108);
	//   31   66:aload_0         
	//   32   67:bipush          108
	//   33   69:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//   34   72:pop             
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false))
	//*  35   73:aload_1         
	//*  36   74:getstatic       #246 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBarOverlay>
	//*  37   77:iconst_0        
	//*  38   78:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  39   81:ifeq            91
			requestWindowFeature(109);
	//   40   84:aload_0         
	//   41   85:bipush          109
	//   42   87:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//   43   90:pop             
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false))
	//*  44   91:aload_1         
	//*  45   92:getstatic       #249 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionModeOverlay>
	//*  46   95:iconst_0        
	//*  47   96:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  48   99:ifeq            109
			requestWindowFeature(10);
	//   49  102:aload_0         
	//   50  103:bipush          10
	//   51  105:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//   52  108:pop             
		mIsFloating = ((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
	//   53  109:aload_0         
	//   54  110:aload_1         
	//   55  111:getstatic       #252 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_android_windowIsFloating>
	//   56  114:iconst_0        
	//   57  115:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   58  118:putfield        #255 <Field boolean mIsFloating>
		((TypedArray) (obj)).recycle();
	//   59  121:aload_1         
	//   60  122:invokevirtual   #218 <Method void TypedArray.recycle()>
		mWindow.getDecorView();
	//   61  125:aload_0         
	//   62  126:getfield        #127 <Field Window mWindow>
	//   63  129:invokevirtual   #133 <Method View Window.getDecorView()>
	//   64  132:pop             
		obj = ((Object) (LayoutInflater.from(mContext)));
	//   65  133:aload_0         
	//   66  134:getfield        #156 <Field Context mContext>
	//   67  137:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//   68  140:astore_1        
		if(!mWindowNoTitle)
	//*  69  141:aload_0         
	//*  70  142:getfield        #264 <Field boolean mWindowNoTitle>
	//*  71  145:ifne            348
		{
			if(mIsFloating)
	//*  72  148:aload_0         
	//*  73  149:getfield        #255 <Field boolean mIsFloating>
	//*  74  152:ifeq            180
			{
				obj = ((Object) ((ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_dialog_title_material, ((ViewGroup) (null)))));
	//   75  155:aload_1         
	//   76  156:getstatic       #269 <Field int android.support.v7.appcompat.R$layout.abc_dialog_title_material>
	//   77  159:aconst_null     
	//   78  160:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   79  163:checkcast       #117 <Class ViewGroup>
	//   80  166:astore_1        
				mOverlayActionBar = false;
	//   81  167:aload_0         
	//   82  168:iconst_0        
	//   83  169:putfield        #276 <Field boolean mOverlayActionBar>
				mHasActionBar = false;
	//   84  172:aload_0         
	//   85  173:iconst_0        
	//   86  174:putfield        #279 <Field boolean mHasActionBar>
			} else
	//*  87  177:goto            422
			if(mHasActionBar)
	//*  88  180:aload_0         
	//*  89  181:getfield        #279 <Field boolean mHasActionBar>
	//*  90  184:ifeq            343
			{
				obj = ((Object) (new TypedValue()));
	//   91  187:new             #281 <Class TypedValue>
	//   92  190:dup             
	//   93  191:invokespecial   #283 <Method void TypedValue()>
	//   94  194:astore_1        
				mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, ((TypedValue) (obj)), true);
	//   95  195:aload_0         
	//   96  196:getfield        #156 <Field Context mContext>
	//   97  199:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   98  202:getstatic       #292 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//   99  205:aload_1         
	//  100  206:iconst_1        
	//  101  207:invokevirtual   #298 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//  102  210:pop             
				if(((TypedValue) (obj)).resourceId != 0)
	//* 103  211:aload_1         
	//* 104  212:getfield        #301 <Field int TypedValue.resourceId>
	//* 105  215:ifeq            237
					obj = ((Object) (new ContextThemeWrapper(mContext, ((TypedValue) (obj)).resourceId)));
	//  106  218:new             #303 <Class ContextThemeWrapper>
	//  107  221:dup             
	//  108  222:aload_0         
	//  109  223:getfield        #156 <Field Context mContext>
	//  110  226:aload_1         
	//  111  227:getfield        #301 <Field int TypedValue.resourceId>
	//  112  230:invokespecial   #306 <Method void ContextThemeWrapper(Context, int)>
	//  113  233:astore_1        
				else
	//* 114  234:goto            242
					obj = ((Object) (mContext));
	//  115  237:aload_0         
	//  116  238:getfield        #156 <Field Context mContext>
	//  117  241:astore_1        
				ViewGroup viewgroup = (ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.appcompat.R.layout.abc_screen_toolbar, ((ViewGroup) (null)));
	//  118  242:aload_1         
	//  119  243:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//  120  246:getstatic       #309 <Field int android.support.v7.appcompat.R$layout.abc_screen_toolbar>
	//  121  249:aconst_null     
	//  122  250:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  123  253:checkcast       #117 <Class ViewGroup>
	//  124  256:astore_2        
				mDecorContentParent = (DecorContentParent)viewgroup.findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
	//  125  257:aload_0         
	//  126  258:aload_2         
	//  127  259:getstatic       #314 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//  128  262:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  129  265:checkcast       #316 <Class DecorContentParent>
	//  130  268:putfield        #318 <Field DecorContentParent mDecorContentParent>
				mDecorContentParent.setWindowCallback(getWindowCallback());
	//  131  271:aload_0         
	//  132  272:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  133  275:aload_0         
	//  134  276:invokevirtual   #322 <Method android.view.Window$Callback getWindowCallback()>
	//  135  279:invokeinterface #326 <Method void DecorContentParent.setWindowCallback(android.view.Window$Callback)>
				if(mOverlayActionBar)
	//* 136  284:aload_0         
	//* 137  285:getfield        #276 <Field boolean mOverlayActionBar>
	//* 138  288:ifeq            302
					mDecorContentParent.initFeature(109);
	//  139  291:aload_0         
	//  140  292:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  141  295:bipush          109
	//  142  297:invokeinterface #330 <Method void DecorContentParent.initFeature(int)>
				if(mFeatureProgress)
	//* 143  302:aload_0         
	//* 144  303:getfield        #332 <Field boolean mFeatureProgress>
	//* 145  306:ifeq            319
					mDecorContentParent.initFeature(2);
	//  146  309:aload_0         
	//  147  310:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  148  313:iconst_2        
	//  149  314:invokeinterface #330 <Method void DecorContentParent.initFeature(int)>
				obj = ((Object) (viewgroup));
	//  150  319:aload_2         
	//  151  320:astore_1        
				if(mFeatureIndeterminateProgress)
	//* 152  321:aload_0         
	//* 153  322:getfield        #334 <Field boolean mFeatureIndeterminateProgress>
	//* 154  325:ifeq            422
				{
					mDecorContentParent.initFeature(5);
	//  155  328:aload_0         
	//  156  329:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  157  332:iconst_5        
	//  158  333:invokeinterface #330 <Method void DecorContentParent.initFeature(int)>
					obj = ((Object) (viewgroup));
	//  159  338:aload_2         
	//  160  339:astore_1        
				}
			} else
	//* 161  340:goto            422
			{
				obj = null;
	//  162  343:aconst_null     
	//  163  344:astore_1        
			}
		} else
	//* 164  345:goto            422
		{
			if(mOverlayActionMode)
	//* 165  348:aload_0         
	//* 166  349:getfield        #337 <Field boolean mOverlayActionMode>
	//* 167  352:ifeq            370
				obj = ((Object) ((ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode, ((ViewGroup) (null)))));
	//  168  355:aload_1         
	//  169  356:getstatic       #340 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple_overlay_action_mode>
	//  170  359:aconst_null     
	//  171  360:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  172  363:checkcast       #117 <Class ViewGroup>
	//  173  366:astore_1        
			else
	//* 174  367:goto            382
				obj = ((Object) ((ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple, ((ViewGroup) (null)))));
	//  175  370:aload_1         
	//  176  371:getstatic       #343 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple>
	//  177  374:aconst_null     
	//  178  375:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  179  378:checkcast       #117 <Class ViewGroup>
	//  180  381:astore_1        
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 181  382:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//* 182  385:bipush          21
	//* 183  387:icmplt          405
				ViewCompat.setOnApplyWindowInsetsListener(((View) (obj)), new OnApplyWindowInsetsListener() {

					public WindowInsetsCompat onApplyWindowInsets(View view1, WindowInsetsCompat windowinsetscompat)
					{
						int i = windowinsetscompat.getSystemWindowInsetTop();
					//    0    0:aload_2         
					//    1    1:invokevirtual   #29  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
					//    2    4:istore_3        
						int j = updateStatusGuard(i);
					//    3    5:aload_0         
					//    4    6:getfield        #17  <Field AppCompatDelegateImplV9 this$0>
					//    5    9:iload_3         
					//    6   10:invokevirtual   #33  <Method int AppCompatDelegateImplV9.updateStatusGuard(int)>
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

					final AppCompatDelegateImplV9 this$0;

			
			{
				this$0 = AppCompatDelegateImplV9.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppCompatDelegateImplV9 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//  184  390:aload_1         
	//  185  391:new             #12  <Class AppCompatDelegateImplV9$2>
	//  186  394:dup             
	//  187  395:aload_0         
	//  188  396:invokespecial   #344 <Method void AppCompatDelegateImplV9$2(AppCompatDelegateImplV9)>
	//  189  399:invokestatic    #350 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			else
	//* 190  402:goto            422
				((FitWindowsViewGroup)obj).setOnFitSystemWindowsListener(new android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener() {

					public void onFitSystemWindows(Rect rect)
					{
						rect.top = updateStatusGuard(rect.top);
					//    0    0:aload_1         
					//    1    1:aload_0         
					//    2    2:getfield        #17  <Field AppCompatDelegateImplV9 this$0>
					//    3    5:aload_1         
					//    4    6:getfield        #29  <Field int Rect.top>
					//    5    9:invokevirtual   #33  <Method int AppCompatDelegateImplV9.updateStatusGuard(int)>
					//    6   12:putfield        #29  <Field int Rect.top>
					//    7   15:return          
					}

					final AppCompatDelegateImplV9 this$0;

			
			{
				this$0 = AppCompatDelegateImplV9.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppCompatDelegateImplV9 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//  191  405:aload_1         
	//  192  406:checkcast       #352 <Class FitWindowsViewGroup>
	//  193  409:new             #14  <Class AppCompatDelegateImplV9$3>
	//  194  412:dup             
	//  195  413:aload_0         
	//  196  414:invokespecial   #353 <Method void AppCompatDelegateImplV9$3(AppCompatDelegateImplV9)>
	//  197  417:invokeinterface #357 <Method void FitWindowsViewGroup.setOnFitSystemWindowsListener(android.support.v7.widget.FitWindowsViewGroup$OnFitSystemWindowsListener)>
		}
		if(obj == null)
	//* 198  422:aload_1         
	//* 199  423:ifnonnull       539
		{
			obj = ((Object) (new StringBuilder()));
	//  200  426:new             #359 <Class StringBuilder>
	//  201  429:dup             
	//  202  430:invokespecial   #360 <Method void StringBuilder()>
	//  203  433:astore_1        
			((StringBuilder) (obj)).append("AppCompat does not support the current theme features: { windowActionBar: ");
	//  204  434:aload_1         
	//  205  435:ldc2            #362 <String "AppCompat does not support the current theme features: { windowActionBar: ">
	//  206  438:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  207  441:pop             
			((StringBuilder) (obj)).append(mHasActionBar);
	//  208  442:aload_1         
	//  209  443:aload_0         
	//  210  444:getfield        #279 <Field boolean mHasActionBar>
	//  211  447:invokevirtual   #369 <Method StringBuilder StringBuilder.append(boolean)>
	//  212  450:pop             
			((StringBuilder) (obj)).append(", windowActionBarOverlay: ");
	//  213  451:aload_1         
	//  214  452:ldc2            #371 <String ", windowActionBarOverlay: ">
	//  215  455:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  216  458:pop             
			((StringBuilder) (obj)).append(mOverlayActionBar);
	//  217  459:aload_1         
	//  218  460:aload_0         
	//  219  461:getfield        #276 <Field boolean mOverlayActionBar>
	//  220  464:invokevirtual   #369 <Method StringBuilder StringBuilder.append(boolean)>
	//  221  467:pop             
			((StringBuilder) (obj)).append(", android:windowIsFloating: ");
	//  222  468:aload_1         
	//  223  469:ldc2            #373 <String ", android:windowIsFloating: ">
	//  224  472:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  225  475:pop             
			((StringBuilder) (obj)).append(mIsFloating);
	//  226  476:aload_1         
	//  227  477:aload_0         
	//  228  478:getfield        #255 <Field boolean mIsFloating>
	//  229  481:invokevirtual   #369 <Method StringBuilder StringBuilder.append(boolean)>
	//  230  484:pop             
			((StringBuilder) (obj)).append(", windowActionModeOverlay: ");
	//  231  485:aload_1         
	//  232  486:ldc2            #375 <String ", windowActionModeOverlay: ">
	//  233  489:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  234  492:pop             
			((StringBuilder) (obj)).append(mOverlayActionMode);
	//  235  493:aload_1         
	//  236  494:aload_0         
	//  237  495:getfield        #337 <Field boolean mOverlayActionMode>
	//  238  498:invokevirtual   #369 <Method StringBuilder StringBuilder.append(boolean)>
	//  239  501:pop             
			((StringBuilder) (obj)).append(", windowNoTitle: ");
	//  240  502:aload_1         
	//  241  503:ldc2            #377 <String ", windowNoTitle: ">
	//  242  506:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  243  509:pop             
			((StringBuilder) (obj)).append(mWindowNoTitle);
	//  244  510:aload_1         
	//  245  511:aload_0         
	//  246  512:getfield        #264 <Field boolean mWindowNoTitle>
	//  247  515:invokevirtual   #369 <Method StringBuilder StringBuilder.append(boolean)>
	//  248  518:pop             
			((StringBuilder) (obj)).append(" }");
	//  249  519:aload_1         
	//  250  520:ldc2            #379 <String " }">
	//  251  523:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//  252  526:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//  253  527:new             #381 <Class IllegalArgumentException>
	//  254  530:dup             
	//  255  531:aload_1         
	//  256  532:invokevirtual   #385 <Method String StringBuilder.toString()>
	//  257  535:invokespecial   #386 <Method void IllegalArgumentException(String)>
	//  258  538:athrow          
		}
		if(mDecorContentParent == null)
	//* 259  539:aload_0         
	//* 260  540:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//* 261  543:ifnonnull       560
			mTitleView = (TextView)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.title);
	//  262  546:aload_0         
	//  263  547:aload_1         
	//  264  548:getstatic       #389 <Field int android.support.v7.appcompat.R$id.title>
	//  265  551:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  266  554:checkcast       #391 <Class TextView>
	//  267  557:putfield        #393 <Field TextView mTitleView>
		ViewUtils.makeOptionalFitsSystemWindows(((View) (obj)));
	//  268  560:aload_1         
	//  269  561:invokestatic    #399 <Method void ViewUtils.makeOptionalFitsSystemWindows(View)>
		ContentFrameLayout contentframelayout = (ContentFrameLayout)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content);
	//  270  564:aload_1         
	//  271  565:getstatic       #402 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
	//  272  568:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  273  571:checkcast       #123 <Class ContentFrameLayout>
	//  274  574:astore_2        
		ViewGroup viewgroup1 = (ViewGroup)mWindow.findViewById(0x1020002);
	//  275  575:aload_0         
	//  276  576:getfield        #127 <Field Window mWindow>
	//  277  579:ldc1            #115 <Int 0x1020002>
	//  278  581:invokevirtual   #403 <Method View Window.findViewById(int)>
	//  279  584:checkcast       #117 <Class ViewGroup>
	//  280  587:astore_3        
		if(viewgroup1 != null)
	//* 281  588:aload_3         
	//* 282  589:ifnull          646
		{
			View view;
			for(; viewgroup1.getChildCount() > 0; contentframelayout.addView(view))
	//* 283  592:aload_3         
	//* 284  593:invokevirtual   #406 <Method int ViewGroup.getChildCount()>
	//* 285  596:ifle            620
			{
				view = viewgroup1.getChildAt(0);
	//  286  599:aload_3         
	//  287  600:iconst_0        
	//  288  601:invokevirtual   #409 <Method View ViewGroup.getChildAt(int)>
	//  289  604:astore          4
				viewgroup1.removeViewAt(0);
	//  290  606:aload_3         
	//  291  607:iconst_0        
	//  292  608:invokevirtual   #412 <Method void ViewGroup.removeViewAt(int)>
			}

	//  293  611:aload_2         
	//  294  612:aload           4
	//  295  614:invokevirtual   #415 <Method void ContentFrameLayout.addView(View)>
	//* 296  617:goto            592
			viewgroup1.setId(-1);
	//  297  620:aload_3         
	//  298  621:iconst_m1       
	//  299  622:invokevirtual   #418 <Method void ViewGroup.setId(int)>
			contentframelayout.setId(0x1020002);
	//  300  625:aload_2         
	//  301  626:ldc1            #115 <Int 0x1020002>
	//  302  628:invokevirtual   #419 <Method void ContentFrameLayout.setId(int)>
			if(viewgroup1 instanceof FrameLayout)
	//* 303  631:aload_3         
	//* 304  632:instanceof      #421 <Class FrameLayout>
	//* 305  635:ifeq            646
				((FrameLayout)viewgroup1).setForeground(((android.graphics.drawable.Drawable) (null)));
	//  306  638:aload_3         
	//  307  639:checkcast       #421 <Class FrameLayout>
	//  308  642:aconst_null     
	//  309  643:invokevirtual   #425 <Method void FrameLayout.setForeground(android.graphics.drawable.Drawable)>
		}
		mWindow.setContentView(((View) (obj)));
	//  310  646:aload_0         
	//  311  647:getfield        #127 <Field Window mWindow>
	//  312  650:aload_1         
	//  313  651:invokevirtual   #428 <Method void Window.setContentView(View)>
		contentframelayout.setAttachListener(new android.support.v7.widget.ContentFrameLayout.OnAttachListener() {

			public void onAttachedFromWindow()
			{
			//    0    0:return          
			}

			public void onDetachedFromWindow()
			{
				dismissPopups();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppCompatDelegateImplV9 this$0>
			//    2    4:invokevirtual   #26  <Method void AppCompatDelegateImplV9.dismissPopups()>
			//    3    7:return          
			}

			final AppCompatDelegateImplV9 this$0;

			
			{
				this$0 = AppCompatDelegateImplV9.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppCompatDelegateImplV9 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  314  654:aload_2         
	//  315  655:new             #16  <Class AppCompatDelegateImplV9$4>
	//  316  658:dup             
	//  317  659:aload_0         
	//  318  660:invokespecial   #429 <Method void AppCompatDelegateImplV9$4(AppCompatDelegateImplV9)>
	//  319  663:invokevirtual   #433 <Method void ContentFrameLayout.setAttachListener(android.support.v7.widget.ContentFrameLayout$OnAttachListener)>
		return ((ViewGroup) (obj));
	//  320  666:aload_1         
	//  321  667:areturn         
	}

	private void ensureSubDecor()
	{
		if(!mSubDecorInstalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #436 <Field boolean mSubDecorInstalled>
	//*   2    4:ifne            80
		{
			mSubDecor = createSubDecor();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #438 <Method ViewGroup createSubDecor()>
	//    6   12:putfield        #114 <Field ViewGroup mSubDecor>
			Object obj = ((Object) (getTitle()));
	//    7   15:aload_0         
	//    8   16:invokevirtual   #442 <Method CharSequence getTitle()>
	//    9   19:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  10   20:aload_1         
	//*  11   21:invokestatic    #448 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   24:ifne            32
				onTitleChanged(((CharSequence) (obj)));
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #452 <Method void onTitleChanged(CharSequence)>
			applyFixedSizeWindow();
	//   16   32:aload_0         
	//   17   33:invokespecial   #454 <Method void applyFixedSizeWindow()>
			onSubDecorInstalled(mSubDecor);
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #114 <Field ViewGroup mSubDecor>
	//   21   41:invokevirtual   #458 <Method void onSubDecorInstalled(ViewGroup)>
			mSubDecorInstalled = true;
	//   22   44:aload_0         
	//   23   45:iconst_1        
	//   24   46:putfield        #436 <Field boolean mSubDecorInstalled>
			obj = ((Object) (getPanelState(0, false)));
	//   25   49:aload_0         
	//   26   50:iconst_0        
	//   27   51:iconst_0        
	//   28   52:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   29   55:astore_1        
			if(!isDestroyed() && (obj == null || ((PanelFeatureState) (obj)).menu == null))
	//*  30   56:aload_0         
	//*  31   57:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  32   60:ifne            80
	//*  33   63:aload_1         
	//*  34   64:ifnull          74
	//*  35   67:aload_1         
	//*  36   68:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  37   71:ifnonnull       80
				invalidatePanelMenu(108);
	//   38   74:aload_0         
	//   39   75:bipush          108
	//   40   77:invokespecial   #473 <Method void invalidatePanelMenu(int)>
		}
	//   41   80:return          
	}

	private boolean initializePanelContent(PanelFeatureState panelfeaturestate)
	{
		if(panelfeaturestate.createdPanelView != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//*   2    4:ifnull          17
		{
			panelfeaturestate.shownPanelView = panelfeaturestate.createdPanelView;
	//    3    7:aload_1         
	//    4    8:aload_1         
	//    5    9:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//    6   12:putfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
			return true;
	//    7   15:iconst_1        
	//    8   16:ireturn         
		}
		if(panelfeaturestate.menu == null)
	//*   9   17:aload_1         
	//*  10   18:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  11   21:ifnonnull       26
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		if(mPanelMenuPresenterCallback == null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #483 <Field AppCompatDelegateImplV9$PanelMenuPresenterCallback mPanelMenuPresenterCallback>
	//*  16   30:ifnonnull       45
			mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
	//   17   33:aload_0         
	//   18   34:new             #43  <Class AppCompatDelegateImplV9$PanelMenuPresenterCallback>
	//   19   37:dup             
	//   20   38:aload_0         
	//   21   39:invokespecial   #484 <Method void AppCompatDelegateImplV9$PanelMenuPresenterCallback(AppCompatDelegateImplV9)>
	//   22   42:putfield        #483 <Field AppCompatDelegateImplV9$PanelMenuPresenterCallback mPanelMenuPresenterCallback>
		panelfeaturestate.shownPanelView = (View)panelfeaturestate.getListMenuView(((android.support.v7.view.menu.MenuPresenter.Callback) (mPanelMenuPresenterCallback)));
	//   23   45:aload_1         
	//   24   46:aload_1         
	//   25   47:aload_0         
	//   26   48:getfield        #483 <Field AppCompatDelegateImplV9$PanelMenuPresenterCallback mPanelMenuPresenterCallback>
	//   27   51:invokevirtual   #488 <Method MenuView AppCompatDelegateImplV9$PanelFeatureState.getListMenuView(android.support.v7.view.menu.MenuPresenter$Callback)>
	//   28   54:checkcast       #135 <Class View>
	//   29   57:putfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
		return panelfeaturestate.shownPanelView != null;
	//   30   60:aload_1         
	//   31   61:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
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
	//    2    2:invokevirtual   #493 <Method Context getActionBarThemedContext()>
	//    3    5:invokevirtual   #497 <Method void AppCompatDelegateImplV9$PanelFeatureState.setStyle(Context)>
		panelfeaturestate.decorView = ((ViewGroup) (new ListMenuDecorView(panelfeaturestate.listPresenterContext)));
	//    4    8:aload_1         
	//    5    9:new             #32  <Class AppCompatDelegateImplV9$ListMenuDecorView>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #500 <Field Context AppCompatDelegateImplV9$PanelFeatureState.listPresenterContext>
	//   10   18:invokespecial   #503 <Method void AppCompatDelegateImplV9$ListMenuDecorView(AppCompatDelegateImplV9, Context)>
	//   11   21:putfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
		panelfeaturestate.gravity = 81;
	//   12   24:aload_1         
	//   13   25:bipush          81
	//   14   27:putfield        #509 <Field int AppCompatDelegateImplV9$PanelFeatureState.gravity>
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
	//    1    1:getfield        #156 <Field Context mContext>
	//    2    4:astore          4
			if(panelfeaturestate.featureId != 0)
	//*   3    6:aload_1         
	//*   4    7:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*   5   10:ifeq            25
			{
				obj = ((Object) (context));
	//    6   13:aload           4
	//    7   15:astore_2        
				if(panelfeaturestate.featureId != 108)
					break label0;
	//    8   16:aload_1         
	//    9   17:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   10   20:bipush          108
	//   11   22:icmpne          191
			}
			obj = ((Object) (context));
	//   12   25:aload           4
	//   13   27:astore_2        
			if(mDecorContentParent != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  16   32:ifnull          191
			{
				TypedValue typedvalue = new TypedValue();
	//   17   35:new             #281 <Class TypedValue>
	//   18   38:dup             
	//   19   39:invokespecial   #283 <Method void TypedValue()>
	//   20   42:astore          5
				android.content.res.Resources.Theme theme = context.getTheme();
	//   21   44:aload           4
	//   22   46:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   23   49:astore          6
				theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedvalue, true);
	//   24   51:aload           6
	//   25   53:getstatic       #292 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//   26   56:aload           5
	//   27   58:iconst_1        
	//   28   59:invokevirtual   #298 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   29   62:pop             
				obj = null;
	//   30   63:aconst_null     
	//   31   64:astore_2        
				if(typedvalue.resourceId != 0)
	//*  32   65:aload           5
	//*  33   67:getfield        #301 <Field int TypedValue.resourceId>
	//*  34   70:ifeq            112
				{
					obj = ((Object) (context.getResources().newTheme()));
	//   35   73:aload           4
	//   36   75:invokevirtual   #517 <Method Resources Context.getResources()>
	//   37   78:invokevirtual   #522 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   38   81:astore_2        
					((android.content.res.Resources.Theme) (obj)).setTo(theme);
	//   39   82:aload_2         
	//   40   83:aload           6
	//   41   85:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
					((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
	//   42   88:aload_2         
	//   43   89:aload           5
	//   44   91:getfield        #301 <Field int TypedValue.resourceId>
	//   45   94:iconst_1        
	//   46   95:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
					((android.content.res.Resources.Theme) (obj)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//   47   98:aload_2         
	//   48   99:getstatic       #533 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   49  102:aload           5
	//   50  104:iconst_1        
	//   51  105:invokevirtual   #298 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   52  108:pop             
				} else
	//*  53  109:goto            124
				{
					theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//   54  112:aload           6
	//   55  114:getstatic       #533 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   56  117:aload           5
	//   57  119:iconst_1        
	//   58  120:invokevirtual   #298 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   59  123:pop             
				}
				Object obj1 = obj;
	//   60  124:aload_2         
	//   61  125:astore_3        
				if(typedvalue.resourceId != 0)
	//*  62  126:aload           5
	//*  63  128:getfield        #301 <Field int TypedValue.resourceId>
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
	//   70  142:invokevirtual   #517 <Method Resources Context.getResources()>
	//   71  145:invokevirtual   #522 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   72  148:astore_3        
						((android.content.res.Resources.Theme) (obj1)).setTo(theme);
	//   73  149:aload_3         
	//   74  150:aload           6
	//   75  152:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
					}
					((android.content.res.Resources.Theme) (obj1)).applyStyle(typedvalue.resourceId, true);
	//   76  155:aload_3         
	//   77  156:aload           5
	//   78  158:getfield        #301 <Field int TypedValue.resourceId>
	//   79  161:iconst_1        
	//   80  162:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
				}
				obj = ((Object) (context));
	//   81  165:aload           4
	//   82  167:astore_2        
				if(obj1 != null)
	//*  83  168:aload_3         
	//*  84  169:ifnull          191
				{
					obj = ((Object) (new ContextThemeWrapper(context, 0)));
	//   85  172:new             #303 <Class ContextThemeWrapper>
	//   86  175:dup             
	//   87  176:aload           4
	//   88  178:iconst_0        
	//   89  179:invokespecial   #306 <Method void ContextThemeWrapper(Context, int)>
	//   90  182:astore_2        
					((Context) (obj)).getTheme().setTo(((android.content.res.Resources.Theme) (obj1)));
	//   91  183:aload_2         
	//   92  184:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   93  187:aload_3         
	//   94  188:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
				}
			}
		}
		obj = ((Object) (new MenuBuilder(((Context) (obj)))));
	//   95  191:new             #535 <Class MenuBuilder>
	//   96  194:dup             
	//   97  195:aload_2         
	//   98  196:invokespecial   #537 <Method void MenuBuilder(Context)>
	//   99  199:astore_2        
		((MenuBuilder) (obj)).setCallback(((android.support.v7.view.menu.MenuBuilder.Callback) (this)));
	//  100  200:aload_2         
	//  101  201:aload_0         
	//  102  202:invokevirtual   #541 <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
		panelfeaturestate.setMenu(((MenuBuilder) (obj)));
	//  103  205:aload_1         
	//  104  206:aload_2         
	//  105  207:invokevirtual   #545 <Method void AppCompatDelegateImplV9$PanelFeatureState.setMenu(MenuBuilder)>
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
	//    5    5:getfield        #547 <Field int mInvalidatePanelMenuFeatures>
	//    6    8:ior             
	//    7    9:putfield        #547 <Field int mInvalidatePanelMenuFeatures>
		if(!mInvalidatePanelMenuPosted)
	//*   8   12:aload_0         
	//*   9   13:getfield        #549 <Field boolean mInvalidatePanelMenuPosted>
	//*  10   16:ifne            38
		{
			ViewCompat.postOnAnimation(mWindow.getDecorView(), mInvalidatePanelMenuRunnable);
	//   11   19:aload_0         
	//   12   20:getfield        #127 <Field Window mWindow>
	//   13   23:invokevirtual   #133 <Method View Window.getDecorView()>
	//   14   26:aload_0         
	//   15   27:getfield        #111 <Field Runnable mInvalidatePanelMenuRunnable>
	//   16   30:invokestatic    #553 <Method void ViewCompat.postOnAnimation(View, Runnable)>
			mInvalidatePanelMenuPosted = true;
	//   17   33:aload_0         
	//   18   34:iconst_1        
	//   19   35:putfield        #549 <Field boolean mInvalidatePanelMenuPosted>
		}
	//   20   38:return          
	}

	private boolean onKeyDownPanel(int i, KeyEvent keyevent)
	{
		if(keyevent.getRepeatCount() == 0)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #560 <Method int KeyEvent.getRepeatCount()>
	//*   2    4:ifne            28
		{
			PanelFeatureState panelfeaturestate = getPanelState(i, true);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iconst_1        
	//    6   10:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//    7   13:astore_3        
			if(!panelfeaturestate.isOpen)
	//*   8   14:aload_3         
	//*   9   15:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  10   18:ifne            28
				return preparePanel(panelfeaturestate, keyevent);
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:aload_2         
	//   14   24:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
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
				if(mActionMode != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #570 <Field ActionMode mActionMode>
	//*   2    4:ifnull          9
					return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
				panelfeaturestate = getPanelState(i, true);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//    9   15:astore          4
				if(i == 0 && mDecorContentParent != null && mDecorContentParent.canShowOverflowMenu() && !ViewConfiguration.get(mContext).hasPermanentMenuKey())
	//*  10   17:iload_1         
	//*  11   18:ifne            108
	//*  12   21:aload_0         
	//*  13   22:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  14   25:ifnull          108
	//*  15   28:aload_0         
	//*  16   29:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  17   32:invokeinterface #573 <Method boolean DecorContentParent.canShowOverflowMenu()>
	//*  18   37:ifeq            108
	//*  19   40:aload_0         
	//*  20   41:getfield        #156 <Field Context mContext>
	//*  21   44:invokestatic    #579 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//*  22   47:invokevirtual   #582 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//*  23   50:ifne            108
				{
					if(!mDecorContentParent.isOverflowMenuShowing())
	//*  24   53:aload_0         
	//*  25   54:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  26   57:invokeinterface #585 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  27   62:ifne            95
					{
						if(!isDestroyed() && preparePanel(panelfeaturestate, keyevent))
	//*  28   65:aload_0         
	//*  29   66:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  30   69:ifne            178
	//*  31   72:aload_0         
	//*  32   73:aload           4
	//*  33   75:aload_2         
	//*  34   76:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//*  35   79:ifeq            178
						{
							flag = mDecorContentParent.showOverflowMenu();
	//   36   82:aload_0         
	//   37   83:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   38   86:invokeinterface #588 <Method boolean DecorContentParent.showOverflowMenu()>
	//   39   91:istore_3        
							break label0;
	//   40   92:goto            196
						}
					} else
					{
						flag = mDecorContentParent.hideOverflowMenu();
	//   41   95:aload_0         
	//   42   96:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   43   99:invokeinterface #591 <Method boolean DecorContentParent.hideOverflowMenu()>
	//   44  104:istore_3        
						break label0;
	//   45  105:goto            196
					}
				} else
				{
					if(panelfeaturestate.isOpen || panelfeaturestate.isHandled)
	//*  46  108:aload           4
	//*  47  110:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  48  113:ifne            183
	//*  49  116:aload           4
	//*  50  118:getfield        #594 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
	//*  51  121:ifeq            127
						break label1;
	//   52  124:goto            183
					if(panelfeaturestate.isPrepared)
	//*  53  127:aload           4
	//*  54  129:getfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*  55  132:ifeq            178
					{
						if(panelfeaturestate.refreshMenuContent)
	//*  56  135:aload           4
	//*  57  137:getfield        #600 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  58  140:ifeq            160
						{
							panelfeaturestate.isPrepared = false;
	//   59  143:aload           4
	//   60  145:iconst_0        
	//   61  146:putfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
							flag = preparePanel(panelfeaturestate, keyevent);
	//   62  149:aload_0         
	//   63  150:aload           4
	//   64  152:aload_2         
	//   65  153:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   66  156:istore_3        
						} else
	//*  67  157:goto            162
						{
							flag = true;
	//   68  160:iconst_1        
	//   69  161:istore_3        
						}
						if(flag)
	//*  70  162:iload_3         
	//*  71  163:ifeq            178
						{
							openPanel(panelfeaturestate, keyevent);
	//   72  166:aload_0         
	//   73  167:aload           4
	//   74  169:aload_2         
	//   75  170:invokespecial   #604 <Method void openPanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
							flag = true;
	//   76  173:iconst_1        
	//   77  174:istore_3        
							break label0;
	//   78  175:goto            196
						}
					}
				}
				flag = false;
	//   79  178:iconst_0        
	//   80  179:istore_3        
				break label0;
	//   81  180:goto            196
			}
			flag = panelfeaturestate.isOpen;
	//   82  183:aload           4
	//   83  185:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//   84  188:istore_3        
			closePanel(panelfeaturestate, true);
	//   85  189:aload_0         
	//   86  190:aload           4
	//   87  192:iconst_1        
	//   88  193:invokevirtual   #608 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		}
		if(flag)
	//*  89  196:iload_3         
	//*  90  197:ifeq            235
		{
			keyevent = ((KeyEvent) ((AudioManager)mContext.getSystemService("audio")));
	//   91  200:aload_0         
	//   92  201:getfield        #156 <Field Context mContext>
	//   93  204:ldc2            #610 <String "audio">
	//   94  207:invokevirtual   #614 <Method Object Context.getSystemService(String)>
	//   95  210:checkcast       #616 <Class AudioManager>
	//   96  213:astore_2        
			if(keyevent != null)
	//*  97  214:aload_2         
	//*  98  215:ifnull          225
			{
				((AudioManager) (keyevent)).playSoundEffect(0);
	//   99  218:aload_2         
	//  100  219:iconst_0        
	//  101  220:invokevirtual   #619 <Method void AudioManager.playSoundEffect(int)>
				return flag;
	//  102  223:iload_3         
	//  103  224:ireturn         
			}
			Log.w("AppCompatDelegate", "Couldn't get audio manager");
	//  104  225:ldc2            #621 <String "AppCompatDelegate">
	//  105  228:ldc2            #623 <String "Couldn't get audio manager">
	//  106  231:invokestatic    #629 <Method int Log.w(String, String)>
	//  107  234:pop             
		}
		return flag;
	//  108  235:iload_3         
	//  109  236:ireturn         
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
	//    1    1:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//    2    4:ifne            409
					if(isDestroyed())
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #466 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
						return;
	//    6   14:return          
					if(panelfeaturestate.featureId == 0)
	//*   7   15:aload_1         
	//*   8   16:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*   9   19:ifne            54
					{
						boolean flag;
						if((mContext.getResources().getConfiguration().screenLayout & 0xf) == 4)
	//*  10   22:aload_0         
	//*  11   23:getfield        #156 <Field Context mContext>
	//*  12   26:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  13   29:invokevirtual   #633 <Method Configuration Resources.getConfiguration()>
	//*  14   32:getfield        #638 <Field int Configuration.screenLayout>
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
	//   28   55:invokevirtual   #322 <Method android.view.Window$Callback getWindowCallback()>
	//   29   58:astore          4
					if(callback != null && !callback.onMenuOpened(panelfeaturestate.featureId, ((Menu) (panelfeaturestate.menu))))
	//*  30   60:aload           4
	//*  31   62:ifnull          90
	//*  32   65:aload           4
	//*  33   67:aload_1         
	//*  34   68:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  35   71:aload_1         
	//*  36   72:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  37   75:invokeinterface #644 <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//*  38   80:ifne            90
					{
						closePanel(panelfeaturestate, true);
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:iconst_1        
	//   42   86:invokevirtual   #608 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
						return;
	//   43   89:return          
					}
					windowmanager = (WindowManager)mContext.getSystemService("window");
	//   44   90:aload_0         
	//   45   91:getfield        #156 <Field Context mContext>
	//   46   94:ldc2            #646 <String "window">
	//   47   97:invokevirtual   #614 <Method Object Context.getSystemService(String)>
	//   48  100:checkcast       #648 <Class WindowManager>
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
	//*  56  114:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//*  57  117:ifne            121
						return;
	//   58  120:return          
					if(panelfeaturestate.decorView != null && !panelfeaturestate.refreshDecorView)
	//*  59  121:aload_1         
	//*  60  122:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//*  61  125:ifnull          170
	//*  62  128:aload_1         
	//*  63  129:getfield        #651 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
	//*  64  132:ifeq            138
	//*  65  135:goto            170
					{
						if(panelfeaturestate.createdPanelView != null)
	//*  66  138:aload_1         
	//*  67  139:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//*  68  142:ifnull          339
						{
							keyevent = ((KeyEvent) (panelfeaturestate.createdPanelView.getLayoutParams()));
	//   69  145:aload_1         
	//   70  146:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//   71  149:invokevirtual   #655 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  152:astore_2        
							if(keyevent != null && ((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1)
	//*  73  153:aload_2         
	//*  74  154:ifnull          339
	//*  75  157:aload_2         
	//*  76  158:getfield        #660 <Field int android.view.ViewGroup$LayoutParams.width>
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
	//*  83  171:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//*  84  174:ifnonnull       193
						{
							if(!initializePanelDecor(panelfeaturestate) || panelfeaturestate.decorView == null)
	//*  85  177:aload_0         
	//*  86  178:aload_1         
	//*  87  179:invokespecial   #662 <Method boolean initializePanelDecor(AppCompatDelegateImplV9$PanelFeatureState)>
	//*  88  182:ifeq            192
	//*  89  185:aload_1         
	//*  90  186:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//*  91  189:ifnonnull       217
								return;
	//   92  192:return          
						} else
						if(panelfeaturestate.refreshDecorView && panelfeaturestate.decorView.getChildCount() > 0)
	//*  93  193:aload_1         
	//*  94  194:getfield        #651 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
	//*  95  197:ifeq            217
	//*  96  200:aload_1         
	//*  97  201:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//*  98  204:invokevirtual   #406 <Method int ViewGroup.getChildCount()>
	//*  99  207:ifle            217
							panelfeaturestate.decorView.removeAllViews();
	//  100  210:aload_1         
	//  101  211:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  102  214:invokevirtual   #665 <Method void ViewGroup.removeAllViews()>
						if(!initializePanelContent(panelfeaturestate))
							break label1;
	//  103  217:aload_0         
	//  104  218:aload_1         
	//  105  219:invokespecial   #667 <Method boolean initializePanelContent(AppCompatDelegateImplV9$PanelFeatureState)>
	//  106  222:ifeq            408
						if(!panelfeaturestate.hasPanelItems())
	//* 107  225:aload_1         
	//* 108  226:invokevirtual   #670 <Method boolean AppCompatDelegateImplV9$PanelFeatureState.hasPanelItems()>
	//* 109  229:ifne            233
							return;
	//  110  232:return          
						Object obj = ((Object) (panelfeaturestate.shownPanelView.getLayoutParams()));
	//  111  233:aload_1         
	//  112  234:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  113  237:invokevirtual   #655 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  114  240:astore          4
						keyevent = ((KeyEvent) (obj));
	//  115  242:aload           4
	//  116  244:astore_2        
						if(obj == null)
	//* 117  245:aload           4
	//* 118  247:ifnonnull       262
							keyevent = ((KeyEvent) (new android.view.ViewGroup.LayoutParams(-2, -2)));
	//  119  250:new             #657 <Class android.view.ViewGroup$LayoutParams>
	//  120  253:dup             
	//  121  254:bipush          -2
	//  122  256:bipush          -2
	//  123  258:invokespecial   #673 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  124  261:astore_2        
						i = panelfeaturestate.background;
	//  125  262:aload_1         
	//  126  263:getfield        #676 <Field int AppCompatDelegateImplV9$PanelFeatureState.background>
	//  127  266:istore_3        
						panelfeaturestate.decorView.setBackgroundResource(i);
	//  128  267:aload_1         
	//  129  268:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  130  271:iload_3         
	//  131  272:invokevirtual   #679 <Method void ViewGroup.setBackgroundResource(int)>
						obj = ((Object) (panelfeaturestate.shownPanelView.getParent()));
	//  132  275:aload_1         
	//  133  276:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  134  279:invokevirtual   #683 <Method ViewParent View.getParent()>
	//  135  282:astore          4
						if(obj != null && (obj instanceof ViewGroup))
	//* 136  284:aload           4
	//* 137  286:ifnull          309
	//* 138  289:aload           4
	//* 139  291:instanceof      #117 <Class ViewGroup>
	//* 140  294:ifeq            309
							((ViewGroup)obj).removeView(panelfeaturestate.shownPanelView);
	//  141  297:aload           4
	//  142  299:checkcast       #117 <Class ViewGroup>
	//  143  302:aload_1         
	//  144  303:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  145  306:invokevirtual   #686 <Method void ViewGroup.removeView(View)>
						panelfeaturestate.decorView.addView(panelfeaturestate.shownPanelView, ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  146  309:aload_1         
	//  147  310:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  148  313:aload_1         
	//  149  314:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  150  317:aload_2         
	//  151  318:invokevirtual   #689 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
						if(!panelfeaturestate.shownPanelView.hasFocus())
	//* 152  321:aload_1         
	//* 153  322:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//* 154  325:invokevirtual   #692 <Method boolean View.hasFocus()>
	//* 155  328:ifne            339
							panelfeaturestate.shownPanelView.requestFocus();
	//  156  331:aload_1         
	//  157  332:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  158  335:invokevirtual   #695 <Method boolean View.requestFocus()>
	//  159  338:pop             
					}
					i = -2;
	//  160  339:bipush          -2
	//  161  341:istore_3        
				}
				panelfeaturestate.isHandled = false;
	//  162  342:aload_1         
	//  163  343:iconst_0        
	//  164  344:putfield        #594 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
				keyevent = ((KeyEvent) (new android.view.WindowManager.LayoutParams(i, -2, panelfeaturestate.x, panelfeaturestate.y, 1002, 0x820000, -3)));
	//  165  347:new             #697 <Class android.view.WindowManager$LayoutParams>
	//  166  350:dup             
	//  167  351:iload_3         
	//  168  352:bipush          -2
	//  169  354:aload_1         
	//  170  355:getfield        #700 <Field int AppCompatDelegateImplV9$PanelFeatureState.x>
	//  171  358:aload_1         
	//  172  359:getfield        #703 <Field int AppCompatDelegateImplV9$PanelFeatureState.y>
	//  173  362:sipush          1002
	//  174  365:ldc2            #704 <Int 0x820000>
	//  175  368:bipush          -3
	//  176  370:invokespecial   #707 <Method void android.view.WindowManager$LayoutParams(int, int, int, int, int, int, int)>
	//  177  373:astore_2        
				keyevent.gravity = panelfeaturestate.gravity;
	//  178  374:aload_2         
	//  179  375:aload_1         
	//  180  376:getfield        #509 <Field int AppCompatDelegateImplV9$PanelFeatureState.gravity>
	//  181  379:putfield        #708 <Field int android.view.WindowManager$LayoutParams.gravity>
				keyevent.windowAnimations = panelfeaturestate.windowAnimations;
	//  182  382:aload_2         
	//  183  383:aload_1         
	//  184  384:getfield        #711 <Field int AppCompatDelegateImplV9$PanelFeatureState.windowAnimations>
	//  185  387:putfield        #712 <Field int android.view.WindowManager$LayoutParams.windowAnimations>
				windowmanager.addView(((View) (panelfeaturestate.decorView)), ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  186  390:aload           5
	//  187  392:aload_1         
	//  188  393:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  189  396:aload_2         
	//  190  397:invokeinterface #713 <Method void WindowManager.addView(View, android.view.ViewGroup$LayoutParams)>
				panelfeaturestate.isOpen = true;
	//  191  402:aload_1         
	//  192  403:iconst_1        
	//  193  404:putfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
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
	//    1    1:invokevirtual   #718 <Method boolean KeyEvent.isSystem()>
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
	//*  10   17:getfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
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
	//   17   30:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   18   33:ifeq            60
			}
			flag = flag1;
	//   19   36:iload           6
	//   20   38:istore          5
			if(panelfeaturestate.menu != null)
	//*  21   40:aload_1         
	//*  22   41:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  23   44:ifnull          60
				flag = panelfeaturestate.menu.performShortcut(i, keyevent, j);
	//   24   47:aload_1         
	//   25   48:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   26   51:iload_2         
	//   27   52:aload_3         
	//   28   53:iload           4
	//   29   55:invokevirtual   #722 <Method boolean MenuBuilder.performShortcut(int, KeyEvent, int)>
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
	//*  38   73:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  39   76:ifnonnull       85
			closePanel(panelfeaturestate, true);
	//   40   79:aload_0         
	//   41   80:aload_1         
	//   42   81:iconst_1        
	//   43   82:invokevirtual   #608 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		return flag;
	//   44   85:iload           5
	//   45   87:ireturn         
	}

	private boolean preparePanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
	{
		if(isDestroyed())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #466 <Method boolean isDestroyed()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(panelfeaturestate.isPrepared)
	//*   5    9:aload_1         
	//*   6   10:getfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*   7   13:ifeq            18
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(mPreparedPanel != null && mPreparedPanel != panelfeaturestate)
	//*  10   18:aload_0         
	//*  11   19:getfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  12   22:ifnull          42
	//*  13   25:aload_0         
	//*  14   26:getfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  15   29:aload_1         
	//*  16   30:if_acmpeq       42
			closePanel(mPreparedPanel, false);
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #608 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		android.view.Window.Callback callback = getWindowCallback();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #322 <Method android.view.Window$Callback getWindowCallback()>
	//   24   46:astore          5
		if(callback != null)
	//*  25   48:aload           5
	//*  26   50:ifnull          68
			panelfeaturestate.createdPanelView = callback.onCreatePanelView(panelfeaturestate.featureId);
	//   27   53:aload_1         
	//   28   54:aload           5
	//   29   56:aload_1         
	//   30   57:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   31   60:invokeinterface #727 <Method View android.view.Window$Callback.onCreatePanelView(int)>
	//   32   65:putfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
		int i;
		if(panelfeaturestate.featureId != 0 && panelfeaturestate.featureId != 108)
	//*  33   68:aload_1         
	//*  34   69:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  35   72:ifeq            92
	//*  36   75:aload_1         
	//*  37   76:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  38   79:bipush          108
	//*  39   81:icmpne          87
	//*  40   84:goto            92
			i = 0;
	//   41   87:iconst_0        
	//   42   88:istore_3        
		else
	//*  43   89:goto            94
			i = 1;
	//   44   92:iconst_1        
	//   45   93:istore_3        
		if(i && mDecorContentParent != null)
	//*  46   94:iload_3         
	//*  47   95:ifeq            114
	//*  48   98:aload_0         
	//*  49   99:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  50  102:ifnull          114
			mDecorContentParent.setMenuPrepared();
	//   51  105:aload_0         
	//   52  106:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   53  109:invokeinterface #730 <Method void DecorContentParent.setMenuPrepared()>
		if(panelfeaturestate.createdPanelView == null && (!i || !(peekSupportActionBar() instanceof ToolbarActionBar)))
	//*  54  114:aload_1         
	//*  55  115:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//*  56  118:ifnonnull       423
	//*  57  121:iload_3         
	//*  58  122:ifeq            135
	//*  59  125:aload_0         
	//*  60  126:invokevirtual   #734 <Method ActionBar peekSupportActionBar()>
	//*  61  129:instanceof      #736 <Class ToolbarActionBar>
	//*  62  132:ifne            423
		{
			if(panelfeaturestate.menu == null || panelfeaturestate.refreshMenuContent)
	//*  63  135:aload_1         
	//*  64  136:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  65  139:ifnull          149
	//*  66  142:aload_1         
	//*  67  143:getfield        #600 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  68  146:ifeq            282
			{
				if(panelfeaturestate.menu == null && (!initializePanelMenu(panelfeaturestate) || panelfeaturestate.menu == null))
	//*  69  149:aload_1         
	//*  70  150:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  71  153:ifnonnull       173
	//*  72  156:aload_0         
	//*  73  157:aload_1         
	//*  74  158:invokespecial   #738 <Method boolean initializePanelMenu(AppCompatDelegateImplV9$PanelFeatureState)>
	//*  75  161:ifeq            171
	//*  76  164:aload_1         
	//*  77  165:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  78  168:ifnonnull       173
					return false;
	//   79  171:iconst_0        
	//   80  172:ireturn         
				if(i && mDecorContentParent != null)
	//*  81  173:iload_3         
	//*  82  174:ifeq            220
	//*  83  177:aload_0         
	//*  84  178:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  85  181:ifnull          220
				{
					if(mActionMenuPresenterCallback == null)
	//*  86  184:aload_0         
	//*  87  185:getfield        #740 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//*  88  188:ifnonnull       203
						mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
	//   89  191:aload_0         
	//   90  192:new             #24  <Class AppCompatDelegateImplV9$ActionMenuPresenterCallback>
	//   91  195:dup             
	//   92  196:aload_0         
	//   93  197:invokespecial   #741 <Method void AppCompatDelegateImplV9$ActionMenuPresenterCallback(AppCompatDelegateImplV9)>
	//   94  200:putfield        #740 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
					mDecorContentParent.setMenu(((Menu) (panelfeaturestate.menu)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//   95  203:aload_0         
	//   96  204:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   97  207:aload_1         
	//   98  208:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   99  211:aload_0         
	//  100  212:getfield        #740 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  101  215:invokeinterface #744 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
				}
				panelfeaturestate.menu.stopDispatchingItemsChanged();
	//  102  220:aload_1         
	//  103  221:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  104  224:invokevirtual   #747 <Method void MenuBuilder.stopDispatchingItemsChanged()>
				if(!callback.onCreatePanelMenu(panelfeaturestate.featureId, ((Menu) (panelfeaturestate.menu))))
	//* 105  227:aload           5
	//* 106  229:aload_1         
	//* 107  230:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//* 108  233:aload_1         
	//* 109  234:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//* 110  237:invokeinterface #750 <Method boolean android.view.Window$Callback.onCreatePanelMenu(int, Menu)>
	//* 111  242:ifne            277
				{
					panelfeaturestate.setMenu(((MenuBuilder) (null)));
	//  112  245:aload_1         
	//  113  246:aconst_null     
	//  114  247:invokevirtual   #545 <Method void AppCompatDelegateImplV9$PanelFeatureState.setMenu(MenuBuilder)>
					if(i && mDecorContentParent != null)
	//* 115  250:iload_3         
	//* 116  251:ifeq            275
	//* 117  254:aload_0         
	//* 118  255:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//* 119  258:ifnull          275
						mDecorContentParent.setMenu(((Menu) (null)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//  120  261:aload_0         
	//  121  262:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  122  265:aconst_null     
	//  123  266:aload_0         
	//  124  267:getfield        #740 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  125  270:invokeinterface #744 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
					return false;
	//  126  275:iconst_0        
	//  127  276:ireturn         
				}
				panelfeaturestate.refreshMenuContent = false;
	//  128  277:aload_1         
	//  129  278:iconst_0        
	//  130  279:putfield        #600 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
			}
			panelfeaturestate.menu.stopDispatchingItemsChanged();
	//  131  282:aload_1         
	//  132  283:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  133  286:invokevirtual   #747 <Method void MenuBuilder.stopDispatchingItemsChanged()>
			if(panelfeaturestate.frozenActionViewState != null)
	//* 134  289:aload_1         
	//* 135  290:getfield        #754 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
	//* 136  293:ifnull          312
			{
				panelfeaturestate.menu.restoreActionViewStates(panelfeaturestate.frozenActionViewState);
	//  137  296:aload_1         
	//  138  297:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  139  300:aload_1         
	//  140  301:getfield        #754 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
	//  141  304:invokevirtual   #758 <Method void MenuBuilder.restoreActionViewStates(Bundle)>
				panelfeaturestate.frozenActionViewState = null;
	//  142  307:aload_1         
	//  143  308:aconst_null     
	//  144  309:putfield        #754 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
			}
			if(!callback.onPreparePanel(0, panelfeaturestate.createdPanelView, ((Menu) (panelfeaturestate.menu))))
	//* 145  312:aload           5
	//* 146  314:iconst_0        
	//* 147  315:aload_1         
	//* 148  316:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//* 149  319:aload_1         
	//* 150  320:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//* 151  323:invokeinterface #762 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//* 152  328:ifne            365
			{
				if(i && mDecorContentParent != null)
	//* 153  331:iload_3         
	//* 154  332:ifeq            356
	//* 155  335:aload_0         
	//* 156  336:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//* 157  339:ifnull          356
					mDecorContentParent.setMenu(((Menu) (null)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//  158  342:aload_0         
	//  159  343:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  160  346:aconst_null     
	//  161  347:aload_0         
	//  162  348:getfield        #740 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  163  351:invokeinterface #744 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
				panelfeaturestate.menu.startDispatchingItemsChanged();
	//  164  356:aload_1         
	//  165  357:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  166  360:invokevirtual   #765 <Method void MenuBuilder.startDispatchingItemsChanged()>
				return false;
	//  167  363:iconst_0        
	//  168  364:ireturn         
			}
			if(keyevent != null)
	//* 169  365:aload_2         
	//* 170  366:ifnull          377
				i = keyevent.getDeviceId();
	//  171  369:aload_2         
	//  172  370:invokevirtual   #768 <Method int KeyEvent.getDeviceId()>
	//  173  373:istore_3        
			else
	//* 174  374:goto            379
				i = -1;
	//  175  377:iconst_m1       
	//  176  378:istore_3        
			boolean flag;
			if(KeyCharacterMap.load(i).getKeyboardType() != 1)
	//* 177  379:iload_3         
	//* 178  380:invokestatic    #774 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//* 179  383:invokevirtual   #777 <Method int KeyCharacterMap.getKeyboardType()>
	//* 180  386:iconst_1        
	//* 181  387:icmpeq          396
				flag = true;
	//  182  390:iconst_1        
	//  183  391:istore          4
			else
	//* 184  393:goto            399
				flag = false;
	//  185  396:iconst_0        
	//  186  397:istore          4
			panelfeaturestate.qwertyMode = flag;
	//  187  399:aload_1         
	//  188  400:iload           4
	//  189  402:putfield        #780 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.qwertyMode>
			panelfeaturestate.menu.setQwertyMode(panelfeaturestate.qwertyMode);
	//  190  405:aload_1         
	//  191  406:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  192  409:aload_1         
	//  193  410:getfield        #780 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.qwertyMode>
	//  194  413:invokevirtual   #784 <Method void MenuBuilder.setQwertyMode(boolean)>
			panelfeaturestate.menu.startDispatchingItemsChanged();
	//  195  416:aload_1         
	//  196  417:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  197  420:invokevirtual   #765 <Method void MenuBuilder.startDispatchingItemsChanged()>
		}
		panelfeaturestate.isPrepared = true;
	//  198  423:aload_1         
	//  199  424:iconst_1        
	//  200  425:putfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
		panelfeaturestate.isHandled = false;
	//  201  428:aload_1         
	//  202  429:iconst_0        
	//  203  430:putfield        #594 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
		mPreparedPanel = panelfeaturestate;
	//  204  433:aload_0         
	//  205  434:aload_1         
	//  206  435:putfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
		return true;
	//  207  438:iconst_1        
	//  208  439:ireturn         
	}

	private void reopenMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(mDecorContentParent != null && mDecorContentParent.canShowOverflowMenu() && (!ViewConfiguration.get(mContext).hasPermanentMenuKey() || mDecorContentParent.isOverflowMenuShowPending()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*   2    4:ifnull          217
	//*   3    7:aload_0         
	//*   4    8:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*   5   11:invokeinterface #573 <Method boolean DecorContentParent.canShowOverflowMenu()>
	//*   6   16:ifeq            217
	//*   7   19:aload_0         
	//*   8   20:getfield        #156 <Field Context mContext>
	//*   9   23:invokestatic    #579 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//*  10   26:invokevirtual   #582 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//*  11   29:ifeq            44
	//*  12   32:aload_0         
	//*  13   33:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  14   36:invokeinterface #789 <Method boolean DecorContentParent.isOverflowMenuShowPending()>
	//*  15   41:ifeq            217
		{
			menubuilder = ((MenuBuilder) (getWindowCallback()));
	//   16   44:aload_0         
	//   17   45:invokevirtual   #322 <Method android.view.Window$Callback getWindowCallback()>
	//   18   48:astore_1        
			if(mDecorContentParent.isOverflowMenuShowing() && flag)
	//*  19   49:aload_0         
	//*  20   50:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  21   53:invokeinterface #585 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  22   58:ifeq            103
	//*  23   61:iload_2         
	//*  24   62:ifne            68
	//*  25   65:goto            103
			{
				mDecorContentParent.hideOverflowMenu();
	//   26   68:aload_0         
	//   27   69:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   28   72:invokeinterface #591 <Method boolean DecorContentParent.hideOverflowMenu()>
	//   29   77:pop             
				if(!isDestroyed())
	//*  30   78:aload_0         
	//*  31   79:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  32   82:ifne            216
				{
					((android.view.Window.Callback) (menubuilder)).onPanelClosed(108, ((Menu) (getPanelState(0, true).menu)));
	//   33   85:aload_1         
	//   34   86:bipush          108
	//   35   88:aload_0         
	//   36   89:iconst_0        
	//   37   90:iconst_1        
	//   38   91:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   39   94:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   40   97:invokeinterface #793 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
					return;
	//   41  102:return          
				}
			} else
			if(menubuilder != null && !isDestroyed())
	//*  42  103:aload_1         
	//*  43  104:ifnull          216
	//*  44  107:aload_0         
	//*  45  108:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  46  111:ifne            216
			{
				if(mInvalidatePanelMenuPosted && (mInvalidatePanelMenuFeatures & 1) != 0)
	//*  47  114:aload_0         
	//*  48  115:getfield        #549 <Field boolean mInvalidatePanelMenuPosted>
	//*  49  118:ifeq            154
	//*  50  121:aload_0         
	//*  51  122:getfield        #547 <Field int mInvalidatePanelMenuFeatures>
	//*  52  125:iconst_1        
	//*  53  126:iand            
	//*  54  127:ifeq            154
				{
					mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
	//   55  130:aload_0         
	//   56  131:getfield        #127 <Field Window mWindow>
	//   57  134:invokevirtual   #133 <Method View Window.getDecorView()>
	//   58  137:aload_0         
	//   59  138:getfield        #111 <Field Runnable mInvalidatePanelMenuRunnable>
	//   60  141:invokevirtual   #797 <Method boolean View.removeCallbacks(Runnable)>
	//   61  144:pop             
					mInvalidatePanelMenuRunnable.run();
	//   62  145:aload_0         
	//   63  146:getfield        #111 <Field Runnable mInvalidatePanelMenuRunnable>
	//   64  149:invokeinterface #802 <Method void Runnable.run()>
				}
				PanelFeatureState panelfeaturestate = getPanelState(0, true);
	//   65  154:aload_0         
	//   66  155:iconst_0        
	//   67  156:iconst_1        
	//   68  157:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   69  160:astore_3        
				if(panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent && ((android.view.Window.Callback) (menubuilder)).onPreparePanel(0, panelfeaturestate.createdPanelView, ((Menu) (panelfeaturestate.menu))))
	//*  70  161:aload_3         
	//*  71  162:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  72  165:ifnull          216
	//*  73  168:aload_3         
	//*  74  169:getfield        #600 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  75  172:ifne            216
	//*  76  175:aload_1         
	//*  77  176:iconst_0        
	//*  78  177:aload_3         
	//*  79  178:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//*  80  181:aload_3         
	//*  81  182:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  82  185:invokeinterface #762 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//*  83  190:ifeq            216
				{
					((android.view.Window.Callback) (menubuilder)).onMenuOpened(108, ((Menu) (panelfeaturestate.menu)));
	//   84  193:aload_1         
	//   85  194:bipush          108
	//   86  196:aload_3         
	//   87  197:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   88  200:invokeinterface #644 <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//   89  205:pop             
					mDecorContentParent.showOverflowMenu();
	//   90  206:aload_0         
	//   91  207:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   92  210:invokeinterface #588 <Method boolean DecorContentParent.showOverflowMenu()>
	//   93  215:pop             
				}
			}
			return;
	//   94  216:return          
		} else
		{
			menubuilder = ((MenuBuilder) (getPanelState(0, true)));
	//   95  217:aload_0         
	//   96  218:iconst_0        
	//   97  219:iconst_1        
	//   98  220:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   99  223:astore_1        
			menubuilder.refreshDecorView = true;
	//  100  224:aload_1         
	//  101  225:iconst_1        
	//  102  226:putfield        #651 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
			closePanel(((PanelFeatureState) (menubuilder)), false);
	//  103  229:aload_0         
	//  104  230:aload_1         
	//  105  231:iconst_0        
	//  106  232:invokevirtual   #608 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
			openPanel(((PanelFeatureState) (menubuilder)), ((KeyEvent) (null)));
	//  107  235:aload_0         
	//  108  236:aload_1         
	//  109  237:aconst_null     
	//  110  238:invokespecial   #604 <Method void openPanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
			return;
	//  111  241:return          
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
	//    3    6:ldc2            #621 <String "AppCompatDelegate">
	//    4    9:ldc2            #806 <String "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.">
	//    5   12:invokestatic    #809 <Method int Log.i(String, String)>
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
	//   12   25:ldc2            #621 <String "AppCompatDelegate">
	//   13   28:ldc2            #811 <String "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.">
	//   14   31:invokestatic    #809 <Method int Log.i(String, String)>
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
	//    5    7:getfield        #127 <Field Window mWindow>
	//    6   10:invokevirtual   #133 <Method View Window.getDecorView()>
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
	//*  16   26:instanceof      #135 <Class View>
	//*  17   29:ifeq            54
			{
				if(ViewCompat.isAttachedToWindow((View)viewparent))
	//*  18   32:aload_1         
	//*  19   33:checkcast       #135 <Class View>
	//*  20   36:invokestatic    #817 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  21   39:ifeq            44
					return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
				viewparent = viewparent.getParent();
	//   24   44:aload_1         
	//   25   45:invokeinterface #820 <Method ViewParent ViewParent.getParent()>
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

	private void throwFeatureRequestIfSubDecorInstalled()
	{
		if(mSubDecorInstalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #436 <Field boolean mSubDecorInstalled>
	//*   2    4:ifeq            18
			throw new AndroidRuntimeException("Window feature must be requested before adding content");
	//    3    7:new             #823 <Class AndroidRuntimeException>
	//    4   10:dup             
	//    5   11:ldc2            #825 <String "Window feature must be requested before adding content">
	//    6   14:invokespecial   #826 <Method void AndroidRuntimeException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #829 <Method void ensureSubDecor()>
		((ViewGroup)mSubDecor.findViewById(0x1020002)).addView(view, layoutparams);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:invokevirtual   #689 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		mOriginalWindowCallback.onContentChanged();
	//   10   21:aload_0         
	//   11   22:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   12   25:invokeinterface #836 <Method void android.view.Window$Callback.onContentChanged()>
	//   13   30:return          
	}

	View callActivityOnCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		if(mOriginalWindowCallback instanceof android.view.LayoutInflater.Factory)
	//*   0    0:aload_0         
	//*   1    1:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #840 <Class android.view.LayoutInflater$Factory>
	//*   3    7:ifeq            33
		{
			view = ((android.view.LayoutInflater.Factory)mOriginalWindowCallback).onCreateView(s, context, attributeset);
	//    4   10:aload_0         
	//    5   11:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//    6   14:checkcast       #840 <Class android.view.LayoutInflater$Factory>
	//    7   17:aload_2         
	//    8   18:aload_3         
	//    9   19:aload           4
	//   10   21:invokeinterface #844 <Method View android.view.LayoutInflater$Factory.onCreateView(String, Context, AttributeSet)>
	//   11   26:astore_1        
			if(view != null)
	//*  12   27:aload_1         
	//*  13   28:ifnull          33
				return view;
	//   14   31:aload_1         
	//   15   32:areturn         
		}
		return null;
	//   16   33:aconst_null     
	//   17   34:areturn         
	}

	void callOnPanelClosed(int i, PanelFeatureState panelfeaturestate, Menu menu)
	{
		PanelFeatureState panelfeaturestate2 = panelfeaturestate;
	//    0    0:aload_2         
	//    1    1:astore          5
		Object obj = ((Object) (menu));
	//    2    3:aload_3         
	//    3    4:astore          6
		if(menu == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       67
		{
			PanelFeatureState panelfeaturestate1 = panelfeaturestate;
	//    6   10:aload_2         
	//    7   11:astore          4
			if(panelfeaturestate == null)
	//*   8   13:aload_2         
	//*   9   14:ifnonnull       44
			{
				panelfeaturestate1 = panelfeaturestate;
	//   10   17:aload_2         
	//   11   18:astore          4
				if(i >= 0)
	//*  12   20:iload_1         
	//*  13   21:iflt            44
				{
					panelfeaturestate1 = panelfeaturestate;
	//   14   24:aload_2         
	//   15   25:astore          4
					if(i < mPanels.length)
	//*  16   27:iload_1         
	//*  17   28:aload_0         
	//*  18   29:getfield        #848 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
	//*  19   32:arraylength     
	//*  20   33:icmpge          44
						panelfeaturestate1 = mPanels[i];
	//   21   36:aload_0         
	//   22   37:getfield        #848 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
	//   23   40:iload_1         
	//   24   41:aaload          
	//   25   42:astore          4
				}
			}
			panelfeaturestate2 = panelfeaturestate1;
	//   26   44:aload           4
	//   27   46:astore          5
			obj = ((Object) (menu));
	//   28   48:aload_3         
	//   29   49:astore          6
			if(panelfeaturestate1 != null)
	//*  30   51:aload           4
	//*  31   53:ifnull          67
			{
				obj = ((Object) (panelfeaturestate1.menu));
	//   32   56:aload           4
	//   33   58:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   34   61:astore          6
				panelfeaturestate2 = panelfeaturestate1;
	//   35   63:aload           4
	//   36   65:astore          5
			}
		}
		if(panelfeaturestate2 != null && !panelfeaturestate2.isOpen)
	//*  37   67:aload           5
	//*  38   69:ifnull          81
	//*  39   72:aload           5
	//*  40   74:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  41   77:ifne            81
			return;
	//   42   80:return          
		if(!isDestroyed())
	//*  43   81:aload_0         
	//*  44   82:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  45   85:ifne            100
			mOriginalWindowCallback.onPanelClosed(i, ((Menu) (obj)));
	//   46   88:aload_0         
	//   47   89:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   48   92:iload_1         
	//   49   93:aload           6
	//   50   95:invokeinterface #793 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
	//   51  100:return          
	}

	void checkCloseActionMenu(MenuBuilder menubuilder)
	{
		if(mClosingActionMenu)
	//*   0    0:aload_0         
	//*   1    1:getfield        #851 <Field boolean mClosingActionMenu>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mClosingActionMenu = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #851 <Field boolean mClosingActionMenu>
		mDecorContentParent.dismissPopups();
	//    7   13:aload_0         
	//    8   14:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//    9   17:invokeinterface #854 <Method void DecorContentParent.dismissPopups()>
		android.view.Window.Callback callback = getWindowCallback();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #322 <Method android.view.Window$Callback getWindowCallback()>
	//   12   26:astore_2        
		if(callback != null && !isDestroyed())
	//*  13   27:aload_2         
	//*  14   28:ifnull          47
	//*  15   31:aload_0         
	//*  16   32:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  17   35:ifne            47
			callback.onPanelClosed(108, ((Menu) (menubuilder)));
	//   18   38:aload_2         
	//   19   39:bipush          108
	//   20   41:aload_1         
	//   21   42:invokeinterface #793 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
		mClosingActionMenu = false;
	//   22   47:aload_0         
	//   23   48:iconst_0        
	//   24   49:putfield        #851 <Field boolean mClosingActionMenu>
	//   25   52:return          
	}

	void closePanel(int i)
	{
		closePanel(getPanelState(i, true), true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:iconst_1        
	//    4    4:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #608 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
	//    7   11:return          
	}

	void closePanel(PanelFeatureState panelfeaturestate, boolean flag)
	{
		if(flag && panelfeaturestate.featureId == 0 && mDecorContentParent != null && mDecorContentParent.isOverflowMenuShowing())
	//*   0    0:iload_2         
	//*   1    1:ifeq            39
	//*   2    4:aload_1         
	//*   3    5:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*   4    8:ifne            39
	//*   5   11:aload_0         
	//*   6   12:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*   7   15:ifnull          39
	//*   8   18:aload_0         
	//*   9   19:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  10   22:invokeinterface #585 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  11   27:ifeq            39
		{
			checkCloseActionMenu(panelfeaturestate.menu);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   15   35:invokevirtual   #856 <Method void checkCloseActionMenu(MenuBuilder)>
			return;
	//   16   38:return          
		}
		WindowManager windowmanager = (WindowManager)mContext.getSystemService("window");
	//   17   39:aload_0         
	//   18   40:getfield        #156 <Field Context mContext>
	//   19   43:ldc2            #646 <String "window">
	//   20   46:invokevirtual   #614 <Method Object Context.getSystemService(String)>
	//   21   49:checkcast       #648 <Class WindowManager>
	//   22   52:astore_3        
		if(windowmanager != null && panelfeaturestate.isOpen && panelfeaturestate.decorView != null)
	//*  23   53:aload_3         
	//*  24   54:ifnull          95
	//*  25   57:aload_1         
	//*  26   58:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  27   61:ifeq            95
	//*  28   64:aload_1         
	//*  29   65:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//*  30   68:ifnull          95
		{
			windowmanager.removeView(((View) (panelfeaturestate.decorView)));
	//   31   71:aload_3         
	//   32   72:aload_1         
	//   33   73:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//   34   76:invokeinterface #857 <Method void WindowManager.removeView(View)>
			if(flag)
	//*  35   81:iload_2         
	//*  36   82:ifeq            95
				callOnPanelClosed(panelfeaturestate.featureId, panelfeaturestate, ((Menu) (null)));
	//   37   85:aload_0         
	//   38   86:aload_1         
	//   39   87:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   40   90:aload_1         
	//   41   91:aconst_null     
	//   42   92:invokevirtual   #859 <Method void callOnPanelClosed(int, AppCompatDelegateImplV9$PanelFeatureState, Menu)>
		}
		panelfeaturestate.isPrepared = false;
	//   43   95:aload_1         
	//   44   96:iconst_0        
	//   45   97:putfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
		panelfeaturestate.isHandled = false;
	//   46  100:aload_1         
	//   47  101:iconst_0        
	//   48  102:putfield        #594 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
		panelfeaturestate.isOpen = false;
	//   49  105:aload_1         
	//   50  106:iconst_0        
	//   51  107:putfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
		panelfeaturestate.shownPanelView = null;
	//   52  110:aload_1         
	//   53  111:aconst_null     
	//   54  112:putfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
		panelfeaturestate.refreshDecorView = true;
	//   55  115:aload_1         
	//   56  116:iconst_1        
	//   57  117:putfield        #651 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
		if(mPreparedPanel == panelfeaturestate)
	//*  58  120:aload_0         
	//*  59  121:getfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  60  124:aload_1         
	//*  61  125:if_acmpne       133
			mPreparedPanel = null;
	//   62  128:aload_0         
	//   63  129:aconst_null     
	//   64  130:putfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   65  133:return          
	}

	public View createView(View view, String s, Context context, AttributeSet attributeset)
	{
		AppCompatViewInflater appcompatviewinflater = mAppCompatViewInflater;
	//    0    0:aload_0         
	//    1    1:getfield        #865 <Field AppCompatViewInflater mAppCompatViewInflater>
	//    2    4:astore          7
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          6
		if(appcompatviewinflater == null)
	//*   5    9:aload           7
	//*   6   11:ifnonnull       159
		{
			String s1 = mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme).getString(android.support.v7.appcompat.R.styleable.AppCompatTheme_viewInflaterClass);
	//    7   14:aload_0         
	//    8   15:getfield        #156 <Field Context mContext>
	//    9   18:getstatic       #162 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
	//   10   21:invokevirtual   #168 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//   11   24:getstatic       #868 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_viewInflaterClass>
	//   12   27:invokevirtual   #872 <Method String TypedArray.getString(int)>
	//   13   30:astore          7
			if(s1 != null && !((Class) (android/support/v7/app/AppCompatViewInflater)).getName().equals(((Object) (s1))))
	//*  14   32:aload           7
	//*  15   34:ifnull          148
	//*  16   37:ldc2            #874 <Class AppCompatViewInflater>
	//*  17   40:invokevirtual   #879 <Method String Class.getName()>
	//*  18   43:aload           7
	//*  19   45:invokevirtual   #885 <Method boolean String.equals(Object)>
	//*  20   48:ifeq            54
	//*  21   51:goto            148
				try
				{
					mAppCompatViewInflater = (AppCompatViewInflater)Class.forName(s1).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
	//   22   54:aload_0         
	//   23   55:aload           7
	//   24   57:invokestatic    #889 <Method Class Class.forName(String)>
	//   25   60:iconst_0        
	//   26   61:anewarray       Class[]
	//   27   64:invokevirtual   #893 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   28   67:iconst_0        
	//   29   68:anewarray       Object[]
	//   30   71:invokevirtual   #901 <Method Object Constructor.newInstance(Object[])>
	//   31   74:checkcast       #874 <Class AppCompatViewInflater>
	//   32   77:putfield        #865 <Field AppCompatViewInflater mAppCompatViewInflater>
				}
	//*  33   80:goto            159
				catch(Throwable throwable)
	//*  34   83:astore          8
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   35   85:new             #359 <Class StringBuilder>
	//   36   88:dup             
	//   37   89:invokespecial   #360 <Method void StringBuilder()>
	//   38   92:astore          9
					stringbuilder.append("Failed to instantiate custom view inflater ");
	//   39   94:aload           9
	//   40   96:ldc2            #903 <String "Failed to instantiate custom view inflater ">
	//   41   99:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   42  102:pop             
					stringbuilder.append(s1);
	//   43  103:aload           9
	//   44  105:aload           7
	//   45  107:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   46  110:pop             
					stringbuilder.append(". Falling back to default.");
	//   47  111:aload           9
	//   48  113:ldc2            #905 <String ". Falling back to default.">
	//   49  116:invokevirtual   #366 <Method StringBuilder StringBuilder.append(String)>
	//   50  119:pop             
					Log.i("AppCompatDelegate", stringbuilder.toString(), throwable);
	//   51  120:ldc2            #621 <String "AppCompatDelegate">
	//   52  123:aload           9
	//   53  125:invokevirtual   #385 <Method String StringBuilder.toString()>
	//   54  128:aload           8
	//   55  130:invokestatic    #908 <Method int Log.i(String, String, Throwable)>
	//   56  133:pop             
					mAppCompatViewInflater = new AppCompatViewInflater();
	//   57  134:aload_0         
	//   58  135:new             #874 <Class AppCompatViewInflater>
	//   59  138:dup             
	//   60  139:invokespecial   #909 <Method void AppCompatViewInflater()>
	//   61  142:putfield        #865 <Field AppCompatViewInflater mAppCompatViewInflater>
				}
			else
	//*  62  145:goto            159
				mAppCompatViewInflater = new AppCompatViewInflater();
	//   63  148:aload_0         
	//   64  149:new             #874 <Class AppCompatViewInflater>
	//   65  152:dup             
	//   66  153:invokespecial   #909 <Method void AppCompatViewInflater()>
	//   67  156:putfield        #865 <Field AppCompatViewInflater mAppCompatViewInflater>
		}
		boolean flag = flag1;
	//   68  159:iload           6
	//   69  161:istore          5
		if(IS_PRE_LOLLIPOP)
	//*  70  163:getstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//*  71  166:ifeq            211
			if(attributeset instanceof XmlPullParser)
	//*  72  169:aload           4
	//*  73  171:instanceof      #911 <Class XmlPullParser>
	//*  74  174:ifeq            201
			{
				flag = flag1;
	//   75  177:iload           6
	//   76  179:istore          5
				if(((XmlPullParser)attributeset).getDepth() > 1)
	//*  77  181:aload           4
	//*  78  183:checkcast       #911 <Class XmlPullParser>
	//*  79  186:invokeinterface #914 <Method int XmlPullParser.getDepth()>
	//*  80  191:iconst_1        
	//*  81  192:icmple          211
					flag = true;
	//   82  195:iconst_1        
	//   83  196:istore          5
			} else
	//*  84  198:goto            211
			{
				flag = shouldInheritContext((ViewParent)view);
	//   85  201:aload_0         
	//   86  202:aload_1         
	//   87  203:checkcast       #819 <Class ViewParent>
	//   88  206:invokespecial   #916 <Method boolean shouldInheritContext(ViewParent)>
	//   89  209:istore          5
			}
		return mAppCompatViewInflater.createView(view, s, context, attributeset, flag, IS_PRE_LOLLIPOP, true, VectorEnabledTintResources.shouldBeUsed());
	//   90  211:aload_0         
	//   91  212:getfield        #865 <Field AppCompatViewInflater mAppCompatViewInflater>
	//   92  215:aload_1         
	//   93  216:aload_2         
	//   94  217:aload_3         
	//   95  218:aload           4
	//   96  220:iload           5
	//   97  222:getstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//   98  225:iconst_1        
	//   99  226:invokestatic    #921 <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//  100  229:invokevirtual   #924 <Method View AppCompatViewInflater.createView(View, String, Context, AttributeSet, boolean, boolean, boolean, boolean)>
	//  101  232:areturn         
	}

	void dismissPopups()
	{
		if(mDecorContentParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*   2    4:ifnull          16
			mDecorContentParent.dismissPopups();
	//    3    7:aload_0         
	//    4    8:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//    5   11:invokeinterface #854 <Method void DecorContentParent.dismissPopups()>
		if(mActionModePopup != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #927 <Field PopupWindow mActionModePopup>
	//*   8   20:ifnull          60
		{
			mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
	//    9   23:aload_0         
	//   10   24:getfield        #127 <Field Window mWindow>
	//   11   27:invokevirtual   #133 <Method View Window.getDecorView()>
	//   12   30:aload_0         
	//   13   31:getfield        #929 <Field Runnable mShowActionModePopup>
	//   14   34:invokevirtual   #797 <Method boolean View.removeCallbacks(Runnable)>
	//   15   37:pop             
			PanelFeatureState panelfeaturestate;
			if(mActionModePopup.isShowing())
	//*  16   38:aload_0         
	//*  17   39:getfield        #927 <Field PopupWindow mActionModePopup>
	//*  18   42:invokevirtual   #934 <Method boolean PopupWindow.isShowing()>
	//*  19   45:ifeq            55
				try
				{
					mActionModePopup.dismiss();
	//   20   48:aload_0         
	//   21   49:getfield        #927 <Field PopupWindow mActionModePopup>
	//   22   52:invokevirtual   #937 <Method void PopupWindow.dismiss()>
				}
	//*  23   55:aload_0         
	//*  24   56:aconst_null     
	//*  25   57:putfield        #927 <Field PopupWindow mActionModePopup>
	//*  26   60:aload_0         
	//*  27   61:invokevirtual   #940 <Method void endOnGoingFadeAnimation()>
	//*  28   64:aload_0         
	//*  29   65:iconst_0        
	//*  30   66:iconst_0        
	//*  31   67:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//*  32   70:astore_1        
	//*  33   71:aload_1         
	//*  34   72:ifnull          89
	//*  35   75:aload_1         
	//*  36   76:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  37   79:ifnull          89
	//*  38   82:aload_1         
	//*  39   83:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  40   86:invokevirtual   #943 <Method void MenuBuilder.close()>
	//*  41   89:return          
				catch(IllegalArgumentException illegalargumentexception) { }
	//   42   90:astore_1        
			mActionModePopup = null;
		}
		endOnGoingFadeAnimation();
		panelfeaturestate = getPanelState(0, false);
		if(panelfeaturestate != null && panelfeaturestate.menu != null)
			panelfeaturestate.menu.close();
	//*  43   91:goto            55
	}

	boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		int i = keyevent.getKeyCode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #948 <Method int KeyEvent.getKeyCode()>
	//    2    4:istore_3        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i == 82 && mOriginalWindowCallback.dispatchKeyEvent(keyevent))
	//*   5    7:iload_3         
	//*   6    8:bipush          82
	//*   7   10:icmpne          28
	//*   8   13:aload_0         
	//*   9   14:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*  10   17:aload_1         
	//*  11   18:invokeinterface #950 <Method boolean android.view.Window$Callback.dispatchKeyEvent(KeyEvent)>
	//*  12   23:ifeq            28
			return true;
	//   13   26:iconst_1        
	//   14   27:ireturn         
		i = keyevent.getKeyCode();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #948 <Method int KeyEvent.getKeyCode()>
	//   17   32:istore_3        
		if(keyevent.getAction() != 0)
	//*  18   33:aload_1         
	//*  19   34:invokevirtual   #953 <Method int KeyEvent.getAction()>
	//*  20   37:ifne            43
	//*  21   40:goto            45
			flag = false;
	//   22   43:iconst_0        
	//   23   44:istore_2        
		if(flag)
	//*  24   45:iload_2         
	//*  25   46:ifeq            56
			return onKeyDown(i, keyevent);
	//   26   49:aload_0         
	//   27   50:iload_3         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #956 <Method boolean onKeyDown(int, KeyEvent)>
	//   30   55:ireturn         
		else
			return onKeyUp(i, keyevent);
	//   31   56:aload_0         
	//   32   57:iload_3         
	//   33   58:aload_1         
	//   34   59:invokevirtual   #959 <Method boolean onKeyUp(int, KeyEvent)>
	//   35   62:ireturn         
	}

	void doInvalidatePanelMenu(int i)
	{
		PanelFeatureState panelfeaturestate = getPanelState(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//    4    6:astore_2        
		if(panelfeaturestate.menu != null)
	//*   5    7:aload_2         
	//*   6    8:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*   7   11:ifnull          56
		{
			Bundle bundle = new Bundle();
	//    8   14:new             #962 <Class Bundle>
	//    9   17:dup             
	//   10   18:invokespecial   #963 <Method void Bundle()>
	//   11   21:astore_3        
			panelfeaturestate.menu.saveActionViewStates(bundle);
	//   12   22:aload_2         
	//   13   23:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   14   26:aload_3         
	//   15   27:invokevirtual   #966 <Method void MenuBuilder.saveActionViewStates(Bundle)>
			if(bundle.size() > 0)
	//*  16   30:aload_3         
	//*  17   31:invokevirtual   #969 <Method int Bundle.size()>
	//*  18   34:ifle            42
				panelfeaturestate.frozenActionViewState = bundle;
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:putfield        #754 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
			panelfeaturestate.menu.stopDispatchingItemsChanged();
	//   22   42:aload_2         
	//   23   43:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   24   46:invokevirtual   #747 <Method void MenuBuilder.stopDispatchingItemsChanged()>
			panelfeaturestate.menu.clear();
	//   25   49:aload_2         
	//   26   50:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   27   53:invokevirtual   #972 <Method void MenuBuilder.clear()>
		}
		panelfeaturestate.refreshMenuContent = true;
	//   28   56:aload_2         
	//   29   57:iconst_1        
	//   30   58:putfield        #600 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
		panelfeaturestate.refreshDecorView = true;
	//   31   61:aload_2         
	//   32   62:iconst_1        
	//   33   63:putfield        #651 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
		if((i == 108 || i == 0) && mDecorContentParent != null)
	//*  34   66:iload_1         
	//*  35   67:bipush          108
	//*  36   69:icmpeq          76
	//*  37   72:iload_1         
	//*  38   73:ifne            106
	//*  39   76:aload_0         
	//*  40   77:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  41   80:ifnull          106
		{
			PanelFeatureState panelfeaturestate1 = getPanelState(0, false);
	//   42   83:aload_0         
	//   43   84:iconst_0        
	//   44   85:iconst_0        
	//   45   86:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   46   89:astore_2        
			if(panelfeaturestate1 != null)
	//*  47   90:aload_2         
	//*  48   91:ifnull          106
			{
				panelfeaturestate1.isPrepared = false;
	//   49   94:aload_2         
	//   50   95:iconst_0        
	//   51   96:putfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
				preparePanel(panelfeaturestate1, ((KeyEvent) (null)));
	//   52   99:aload_0         
	//   53  100:aload_2         
	//   54  101:aconst_null     
	//   55  102:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   56  105:pop             
			}
		}
	//   57  106:return          
	}

	void endOnGoingFadeAnimation()
	{
		if(mFadeAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//*   2    4:ifnull          14
			mFadeAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//    5   11:invokevirtual   #977 <Method void ViewPropertyAnimatorCompat.cancel()>
	//    6   14:return          
	}

	PanelFeatureState findMenuPanel(Menu menu)
	{
		PanelFeatureState apanelfeaturestate[] = mPanels;
	//    0    0:aload_0         
	//    1    1:getfield        #848 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
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
	//*  23   40:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
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
	//    1    1:invokespecial   #829 <Method void ensureSubDecor()>
		return mWindow.findViewById(i);
	//    2    4:aload_0         
	//    3    5:getfield        #127 <Field Window mWindow>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #403 <Method View Window.findViewById(int)>
	//    6   12:areturn         
	}

	protected PanelFeatureState getPanelState(int i, boolean flag)
	{
		PanelFeatureState apanelfeaturestate[];
label0:
		{
			PanelFeatureState apanelfeaturestate1[] = mPanels;
	//    0    0:aload_0         
	//    1    1:getfield        #848 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
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
	//   24   41:invokestatic    #990 <Method void System.arraycopy(Object, int, Object, int, int)>
			mPanels = apanelfeaturestate;
	//   25   44:aload_0         
	//   26   45:aload_3         
	//   27   46:putfield        #848 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
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
	//   36   63:new             #35  <Class AppCompatDelegateImplV9$PanelFeatureState>
	//   37   66:dup             
	//   38   67:iload_1         
	//   39   68:invokespecial   #992 <Method void AppCompatDelegateImplV9$PanelFeatureState(int)>
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
	//    1    1:getfield        #114 <Field ViewGroup mSubDecor>
	//    2    4:areturn         
	}

	public boolean hasWindowFeature(int i)
	{
		switch(sanitizeWindowFeatureId(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #996 <Method int sanitizeWindowFeatureId(int)>
		{
	//*   3    5:lookupswitch    6: default 64
	//	               1: 91
	//	               2: 86
	//	               5: 81
	//	               10: 76
	//	               108: 71
	//	               109: 66
		default:
			return false;
	//    4   64:iconst_0        
	//    5   65:ireturn         

		case 109: // 'm'
			return mOverlayActionBar;
	//    6   66:aload_0         
	//    7   67:getfield        #276 <Field boolean mOverlayActionBar>
	//    8   70:ireturn         

		case 108: // 'l'
			return mHasActionBar;
	//    9   71:aload_0         
	//   10   72:getfield        #279 <Field boolean mHasActionBar>
	//   11   75:ireturn         

		case 10: // '\n'
			return mOverlayActionMode;
	//   12   76:aload_0         
	//   13   77:getfield        #337 <Field boolean mOverlayActionMode>
	//   14   80:ireturn         

		case 5: // '\005'
			return mFeatureIndeterminateProgress;
	//   15   81:aload_0         
	//   16   82:getfield        #334 <Field boolean mFeatureIndeterminateProgress>
	//   17   85:ireturn         

		case 2: // '\002'
			return mFeatureProgress;
	//   18   86:aload_0         
	//   19   87:getfield        #332 <Field boolean mFeatureProgress>
	//   20   90:ireturn         

		case 1: // '\001'
			return mWindowNoTitle;
	//   21   91:aload_0         
	//   22   92:getfield        #264 <Field boolean mWindowNoTitle>
	//   23   95:ireturn         
		}
	}

	public void initWindowDecorActionBar()
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #829 <Method void ensureSubDecor()>
		if(mHasActionBar)
	//*   2    4:aload_0         
	//*   3    5:getfield        #279 <Field boolean mHasActionBar>
	//*   4    8:ifeq            101
		{
			if(mActionBar != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #1001 <Field ActionBar mActionBar>
	//*   7   15:ifnull          19
				return;
	//    8   18:return          
			if(mOriginalWindowCallback instanceof Activity)
	//*   9   19:aload_0         
	//*  10   20:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*  11   23:instanceof      #1003 <Class Activity>
	//*  12   26:ifeq            54
				mActionBar = ((ActionBar) (new WindowDecorActionBar((Activity)mOriginalWindowCallback, mOverlayActionBar)));
	//   13   29:aload_0         
	//   14   30:new             #1005 <Class WindowDecorActionBar>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   18   38:checkcast       #1003 <Class Activity>
	//   19   41:aload_0         
	//   20   42:getfield        #276 <Field boolean mOverlayActionBar>
	//   21   45:invokespecial   #1008 <Method void WindowDecorActionBar(Activity, boolean)>
	//   22   48:putfield        #1001 <Field ActionBar mActionBar>
			else
	//*  23   51:goto            82
			if(mOriginalWindowCallback instanceof Dialog)
	//*  24   54:aload_0         
	//*  25   55:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*  26   58:instanceof      #1010 <Class Dialog>
	//*  27   61:ifeq            82
				mActionBar = ((ActionBar) (new WindowDecorActionBar((Dialog)mOriginalWindowCallback)));
	//   28   64:aload_0         
	//   29   65:new             #1005 <Class WindowDecorActionBar>
	//   30   68:dup             
	//   31   69:aload_0         
	//   32   70:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   33   73:checkcast       #1010 <Class Dialog>
	//   34   76:invokespecial   #1013 <Method void WindowDecorActionBar(Dialog)>
	//   35   79:putfield        #1001 <Field ActionBar mActionBar>
			if(mActionBar != null)
	//*  36   82:aload_0         
	//*  37   83:getfield        #1001 <Field ActionBar mActionBar>
	//*  38   86:ifnull          100
				mActionBar.setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
	//   39   89:aload_0         
	//   40   90:getfield        #1001 <Field ActionBar mActionBar>
	//   41   93:aload_0         
	//   42   94:getfield        #1015 <Field boolean mEnableDefaultActionBarUp>
	//   43   97:invokevirtual   #1020 <Method void ActionBar.setDefaultDisplayHomeAsUpEnabled(boolean)>
			return;
	//   44  100:return          
		} else
		{
			return;
	//   45  101:return          
		}
	}

	public void installViewFactory()
	{
		LayoutInflater layoutinflater = LayoutInflater.from(mContext);
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Context mContext>
	//    2    4:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//    3    7:astore_1        
		if(layoutinflater.getFactory() == null)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #1025 <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//*   6   12:ifnonnull       21
		{
			LayoutInflaterCompat.setFactory2(layoutinflater, ((android.view.LayoutInflater.Factory2) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokestatic    #1031 <Method void LayoutInflaterCompat.setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return;
	//   10   20:return          
		}
		if(!(layoutinflater.getFactory2() instanceof AppCompatDelegateImplV9))
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #1035 <Method android.view.LayoutInflater$Factory2 LayoutInflater.getFactory2()>
	//*  13   25:instanceof      #2   <Class AppCompatDelegateImplV9>
	//*  14   28:ifne            41
			Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
	//   15   31:ldc2            #621 <String "AppCompatDelegate">
	//   16   34:ldc2            #1037 <String "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's">
	//   17   37:invokestatic    #809 <Method int Log.i(String, String)>
	//   18   40:pop             
	//   19   41:return          
	}

	public void invalidateOptionsMenu()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null && actionbar.invalidateOptionsMenu())
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #1043 <Method boolean ActionBar.invalidateOptionsMenu()>
	//*   7   13:ifeq            17
		{
			return;
	//    8   16:return          
		} else
		{
			invalidatePanelMenu(0);
	//    9   17:aload_0         
	//   10   18:iconst_0        
	//   11   19:invokespecial   #473 <Method void invalidatePanelMenu(int)>
			return;
	//   12   22:return          
		}
	}

	boolean onBackPressed()
	{
		if(mActionMode != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #570 <Field ActionMode mActionMode>
	//*   2    4:ifnull          16
		{
			mActionMode.finish();
	//    3    7:aload_0         
	//    4    8:getfield        #570 <Field ActionMode mActionMode>
	//    5   11:invokevirtual   #1049 <Method void ActionMode.finish()>
			return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		}
		ActionBar actionbar = getSupportActionBar();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//   10   20:astore_1        
		return actionbar != null && actionbar.collapseActionView();
	//   11   21:aload_1         
	//   12   22:ifnull          34
	//   13   25:aload_1         
	//   14   26:invokevirtual   #1052 <Method boolean ActionBar.collapseActionView()>
	//   15   29:ifeq            34
	//   16   32:iconst_1        
	//   17   33:ireturn         
	//   18   34:iconst_0        
	//   19   35:ireturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		if(mHasActionBar && mSubDecorInstalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #279 <Field boolean mHasActionBar>
	//*   2    4:ifeq            28
	//*   3    7:aload_0         
	//*   4    8:getfield        #436 <Field boolean mSubDecorInstalled>
	//*   5   11:ifeq            28
		{
			ActionBar actionbar = getSupportActionBar();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//    8   18:astore_2        
			if(actionbar != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          28
				actionbar.onConfigurationChanged(configuration);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #1056 <Method void ActionBar.onConfigurationChanged(Configuration)>
		}
		AppCompatDrawableManager.get().onConfigurationChanged(mContext);
	//   14   28:invokestatic    #1061 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//   15   31:aload_0         
	//   16   32:getfield        #156 <Field Context mContext>
	//   17   35:invokevirtual   #1063 <Method void AppCompatDrawableManager.onConfigurationChanged(Context)>
		applyDayNight();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #1066 <Method boolean applyDayNight()>
	//   20   42:pop             
	//   21   43:return          
	}

	public void onCreate(Bundle bundle)
	{
		if((mOriginalWindowCallback instanceof Activity) && NavUtils.getParentActivityName((Activity)mOriginalWindowCallback) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #1003 <Class Activity>
	//*   3    7:ifeq            43
	//*   4   10:aload_0         
	//*   5   11:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   6   14:checkcast       #1003 <Class Activity>
	//*   7   17:invokestatic    #1073 <Method String NavUtils.getParentActivityName(Activity)>
	//*   8   20:ifnull          43
		{
			bundle = ((Bundle) (peekSupportActionBar()));
	//    9   23:aload_0         
	//   10   24:invokevirtual   #734 <Method ActionBar peekSupportActionBar()>
	//   11   27:astore_1        
			if(bundle == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       38
			{
				mEnableDefaultActionBarUp = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #1015 <Field boolean mEnableDefaultActionBarUp>
				return;
	//   17   37:return          
			}
			((ActionBar) (bundle)).setDefaultDisplayHomeAsUpEnabled(true);
	//   18   38:aload_1         
	//   19   39:iconst_1        
	//   20   40:invokevirtual   #1020 <Method void ActionBar.setDefaultDisplayHomeAsUpEnabled(boolean)>
		}
	//   21   43:return          
	}

	public final View onCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		View view1 = callActivityOnCreateView(view, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #1075 <Method View callActivityOnCreateView(View, String, Context, AttributeSet)>
	//    6    9:astore          5
		if(view1 != null)
	//*   7   11:aload           5
	//*   8   13:ifnull          19
			return view1;
	//    9   16:aload           5
	//   10   18:areturn         
		else
			return createView(view, s, context, attributeset);
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:aload_3         
	//   15   23:aload           4
	//   16   25:invokevirtual   #1077 <Method View createView(View, String, Context, AttributeSet)>
	//   17   28:areturn         
	}

	public View onCreateView(String s, Context context, AttributeSet attributeset)
	{
		return onCreateView(((View) (null)), s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokevirtual   #1079 <Method View onCreateView(View, String, Context, AttributeSet)>
	//    6    8:areturn         
	}

	public void onDestroy()
	{
		if(mInvalidatePanelMenuPosted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #549 <Field boolean mInvalidatePanelMenuPosted>
	//*   2    4:ifeq            22
			mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
	//    3    7:aload_0         
	//    4    8:getfield        #127 <Field Window mWindow>
	//    5   11:invokevirtual   #133 <Method View Window.getDecorView()>
	//    6   14:aload_0         
	//    7   15:getfield        #111 <Field Runnable mInvalidatePanelMenuRunnable>
	//    8   18:invokevirtual   #797 <Method boolean View.removeCallbacks(Runnable)>
	//    9   21:pop             
		super.onDestroy();
	//   10   22:aload_0         
	//   11   23:invokespecial   #1082 <Method void AppCompatDelegateImplBase.onDestroy()>
		if(mActionBar != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #1001 <Field ActionBar mActionBar>
	//*  14   30:ifnull          40
			mActionBar.onDestroy();
	//   15   33:aload_0         
	//   16   34:getfield        #1001 <Field ActionBar mActionBar>
	//   17   37:invokevirtual   #1083 <Method void ActionBar.onDestroy()>
	//   18   40:return          
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
	//   13   18:invokespecial   #1085 <Method boolean onKeyDownPanel(int, KeyEvent)>
	//   14   21:pop             
				return true;
	//   15   22:iconst_1        
	//   16   23:ireturn         
			}
		if((keyevent.getFlags() & 0x80) == 0)
	//*  17   24:aload_2         
	//*  18   25:invokevirtual   #1088 <Method int KeyEvent.getFlags()>
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
	//   27   42:putfield        #1090 <Field boolean mLongPressBackDown>
		return false;
	//   28   45:iconst_0        
	//   29   46:ireturn         
	}

	boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//    2    4:astore          4
		if(actionbar != null && actionbar.onKeyShortcut(i, keyevent))
	//*   3    6:aload           4
	//*   4    8:ifnull          23
	//*   5   11:aload           4
	//*   6   13:iload_1         
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #1093 <Method boolean ActionBar.onKeyShortcut(int, KeyEvent)>
	//*   9   18:ifeq            23
			return true;
	//   10   21:iconst_1        
	//   11   22:ireturn         
		if(mPreparedPanel != null && performPanelShortcut(mPreparedPanel, keyevent.getKeyCode(), keyevent, 1))
	//*  12   23:aload_0         
	//*  13   24:getfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  14   27:ifnull          64
	//*  15   30:aload_0         
	//*  16   31:aload_0         
	//*  17   32:getfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  18   35:aload_2         
	//*  19   36:invokevirtual   #948 <Method int KeyEvent.getKeyCode()>
	//*  20   39:aload_2         
	//*  21   40:iconst_1        
	//*  22   41:invokespecial   #1095 <Method boolean performPanelShortcut(AppCompatDelegateImplV9$PanelFeatureState, int, KeyEvent, int)>
	//*  23   44:ifeq            64
		{
			if(mPreparedPanel != null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  26   51:ifnull          62
				mPreparedPanel.isHandled = true;
	//   27   54:aload_0         
	//   28   55:getfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   29   58:iconst_1        
	//   30   59:putfield        #594 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
			return true;
	//   31   62:iconst_1        
	//   32   63:ireturn         
		}
		if(mPreparedPanel == null)
	//*  33   64:aload_0         
	//*  34   65:getfield        #724 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  35   68:ifnonnull       112
		{
			PanelFeatureState panelfeaturestate = getPanelState(0, true);
	//   36   71:aload_0         
	//   37   72:iconst_0        
	//   38   73:iconst_1        
	//   39   74:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   40   77:astore          4
			preparePanel(panelfeaturestate, keyevent);
	//   41   79:aload_0         
	//   42   80:aload           4
	//   43   82:aload_2         
	//   44   83:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   45   86:pop             
			boolean flag = performPanelShortcut(panelfeaturestate, keyevent.getKeyCode(), keyevent, 1);
	//   46   87:aload_0         
	//   47   88:aload           4
	//   48   90:aload_2         
	//   49   91:invokevirtual   #948 <Method int KeyEvent.getKeyCode()>
	//   50   94:aload_2         
	//   51   95:iconst_1        
	//   52   96:invokespecial   #1095 <Method boolean performPanelShortcut(AppCompatDelegateImplV9$PanelFeatureState, int, KeyEvent, int)>
	//   53   99:istore_3        
			panelfeaturestate.isPrepared = false;
	//   54  100:aload           4
	//   55  102:iconst_0        
	//   56  103:putfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
			if(flag)
	//*  57  106:iload_3         
	//*  58  107:ifeq            112
				return true;
	//   59  110:iconst_1        
	//   60  111:ireturn         
		}
		return false;
	//   61  112:iconst_0        
	//   62  113:ireturn         
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
	//   11   16:invokespecial   #1097 <Method boolean onKeyUpPanel(int, KeyEvent)>
	//   12   19:pop             
				return true;
	//   13   20:iconst_1        
	//   14   21:ireturn         
			}
		boolean flag = mLongPressBackDown;
	//   15   22:aload_0         
	//   16   23:getfield        #1090 <Field boolean mLongPressBackDown>
	//   17   26:istore_3        
		mLongPressBackDown = false;
	//   18   27:aload_0         
	//   19   28:iconst_0        
	//   20   29:putfield        #1090 <Field boolean mLongPressBackDown>
		keyevent = ((KeyEvent) (getPanelState(0, false)));
	//   21   32:aload_0         
	//   22   33:iconst_0        
	//   23   34:iconst_0        
	//   24   35:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   25   38:astore_2        
		if(keyevent != null && ((PanelFeatureState) (keyevent)).isOpen)
	//*  26   39:aload_2         
	//*  27   40:ifnull          62
	//*  28   43:aload_2         
	//*  29   44:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  30   47:ifeq            62
		{
			if(!flag)
	//*  31   50:iload_3         
	//*  32   51:ifne            60
				closePanel(((PanelFeatureState) (keyevent)), true);
	//   33   54:aload_0         
	//   34   55:aload_2         
	//   35   56:iconst_1        
	//   36   57:invokevirtual   #608 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
			return true;
	//   37   60:iconst_1        
	//   38   61:ireturn         
		}
		return onBackPressed();
	//   39   62:aload_0         
	//   40   63:invokevirtual   #1099 <Method boolean onBackPressed()>
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
	//    1    1:invokevirtual   #322 <Method android.view.Window$Callback getWindowCallback()>
	//    2    4:astore_3        
		if(callback != null && !isDestroyed())
	//*   3    5:aload_3         
	//*   4    6:ifnull          41
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #466 <Method boolean isDestroyed()>
	//*   7   13:ifne            41
		{
			menubuilder = ((MenuBuilder) (findMenuPanel(((Menu) (menubuilder.getRootMenu())))));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1105 <Method MenuBuilder MenuBuilder.getRootMenu()>
	//   11   21:invokevirtual   #1107 <Method AppCompatDelegateImplV9$PanelFeatureState findMenuPanel(Menu)>
	//   12   24:astore_1        
			if(menubuilder != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          41
				return callback.onMenuItemSelected(((PanelFeatureState) (menubuilder)).featureId, menuitem);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   18   34:aload_2         
	//   19   35:invokeinterface #1110 <Method boolean android.view.Window$Callback.onMenuItemSelected(int, MenuItem)>
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
	//    3    3:invokespecial   #1113 <Method void reopenMenu(MenuBuilder, boolean)>
	//    4    6:return          
	}

	boolean onMenuOpened(int i, Menu menu)
	{
		if(i == 108)
	//*   0    0:iload_1         
	//*   1    1:bipush          108
	//*   2    3:icmpne          22
		{
			menu = ((Menu) (getSupportActionBar()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//    5   10:astore_2        
			if(menu != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          20
				((ActionBar) (menu)).dispatchMenuVisibilityChanged(true);
	//    8   15:aload_2         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #1116 <Method void ActionBar.dispatchMenuVisibilityChanged(boolean)>
			return true;
	//   11   20:iconst_1        
	//   12   21:ireturn         
		} else
		{
			return false;
	//   13   22:iconst_0        
	//   14   23:ireturn         
		}
	}

	void onPanelClosed(int i, Menu menu)
	{
		if(i == 108)
	//*   0    0:iload_1         
	//*   1    1:bipush          108
	//*   2    3:icmpne          21
		{
			menu = ((Menu) (getSupportActionBar()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//    5   10:astore_2        
			if(menu != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          45
			{
				((ActionBar) (menu)).dispatchMenuVisibilityChanged(false);
	//    8   15:aload_2         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #1116 <Method void ActionBar.dispatchMenuVisibilityChanged(boolean)>
				return;
	//   11   20:return          
			}
		} else
		if(i == 0)
	//*  12   21:iload_1         
	//*  13   22:ifne            45
		{
			menu = ((Menu) (getPanelState(i, true)));
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:iconst_1        
	//   17   28:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   18   31:astore_2        
			if(((PanelFeatureState) (menu)).isOpen)
	//*  19   32:aload_2         
	//*  20   33:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  21   36:ifeq            45
				closePanel(((PanelFeatureState) (menu)), false);
	//   22   39:aload_0         
	//   23   40:aload_2         
	//   24   41:iconst_0        
	//   25   42:invokevirtual   #608 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		}
	//   26   45:return          
	}

	public void onPostCreate(Bundle bundle)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #829 <Method void ensureSubDecor()>
	//    2    4:return          
	}

	public void onPostResume()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionbar.setShowHideAnimationEnabled(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #1121 <Method void ActionBar.setShowHideAnimationEnabled(boolean)>
	//    8   14:return          
	}

	public void onStop()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionbar.setShowHideAnimationEnabled(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #1121 <Method void ActionBar.setShowHideAnimationEnabled(boolean)>
	//    8   14:return          
	}

	void onSubDecorInstalled(ViewGroup viewgroup)
	{
	//    0    0:return          
	}

	void onTitleChanged(CharSequence charsequence)
	{
		if(mDecorContentParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*   2    4:ifnull          18
		{
			mDecorContentParent.setWindowTitle(charsequence);
	//    3    7:aload_0         
	//    4    8:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1125 <Method void DecorContentParent.setWindowTitle(CharSequence)>
			return;
	//    7   17:return          
		}
		if(peekSupportActionBar() != null)
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #734 <Method ActionBar peekSupportActionBar()>
	//*  10   22:ifnull          34
		{
			peekSupportActionBar().setWindowTitle(charsequence);
	//   11   25:aload_0         
	//   12   26:invokevirtual   #734 <Method ActionBar peekSupportActionBar()>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #1126 <Method void ActionBar.setWindowTitle(CharSequence)>
			return;
	//   15   33:return          
		}
		if(mTitleView != null)
	//*  16   34:aload_0         
	//*  17   35:getfield        #393 <Field TextView mTitleView>
	//*  18   38:ifnull          49
			mTitleView.setText(charsequence);
	//   19   41:aload_0         
	//   20   42:getfield        #393 <Field TextView mTitleView>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #1129 <Method void TextView.setText(CharSequence)>
	//   23   49:return          
	}

	public boolean requestWindowFeature(int i)
	{
		i = sanitizeWindowFeatureId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #996 <Method int sanitizeWindowFeatureId(int)>
	//    3    5:istore_1        
		if(mWindowNoTitle && i == 108)
	//*   4    6:aload_0         
	//*   5    7:getfield        #264 <Field boolean mWindowNoTitle>
	//*   6   10:ifeq            21
	//*   7   13:iload_1         
	//*   8   14:bipush          108
	//*   9   16:icmpne          21
			return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
		if(mHasActionBar && i == 1)
	//*  12   21:aload_0         
	//*  13   22:getfield        #279 <Field boolean mHasActionBar>
	//*  14   25:ifeq            38
	//*  15   28:iload_1         
	//*  16   29:iconst_1        
	//*  17   30:icmpne          38
			mHasActionBar = false;
	//   18   33:aload_0         
	//   19   34:iconst_0        
	//   20   35:putfield        #279 <Field boolean mHasActionBar>
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
	//   24   97:getfield        #127 <Field Window mWindow>
	//   25  100:iload_1         
	//   26  101:invokevirtual   #1132 <Method boolean Window.requestFeature(int)>
	//   27  104:ireturn         

		case 109: // 'm'
			throwFeatureRequestIfSubDecorInstalled();
	//   28  105:aload_0         
	//   29  106:invokespecial   #1134 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mOverlayActionBar = true;
	//   30  109:aload_0         
	//   31  110:iconst_1        
	//   32  111:putfield        #276 <Field boolean mOverlayActionBar>
			return true;
	//   33  114:iconst_1        
	//   34  115:ireturn         

		case 108: // 'l'
			throwFeatureRequestIfSubDecorInstalled();
	//   35  116:aload_0         
	//   36  117:invokespecial   #1134 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mHasActionBar = true;
	//   37  120:aload_0         
	//   38  121:iconst_1        
	//   39  122:putfield        #279 <Field boolean mHasActionBar>
			return true;
	//   40  125:iconst_1        
	//   41  126:ireturn         

		case 10: // '\n'
			throwFeatureRequestIfSubDecorInstalled();
	//   42  127:aload_0         
	//   43  128:invokespecial   #1134 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mOverlayActionMode = true;
	//   44  131:aload_0         
	//   45  132:iconst_1        
	//   46  133:putfield        #337 <Field boolean mOverlayActionMode>
			return true;
	//   47  136:iconst_1        
	//   48  137:ireturn         

		case 5: // '\005'
			throwFeatureRequestIfSubDecorInstalled();
	//   49  138:aload_0         
	//   50  139:invokespecial   #1134 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mFeatureIndeterminateProgress = true;
	//   51  142:aload_0         
	//   52  143:iconst_1        
	//   53  144:putfield        #334 <Field boolean mFeatureIndeterminateProgress>
			return true;
	//   54  147:iconst_1        
	//   55  148:ireturn         

		case 2: // '\002'
			throwFeatureRequestIfSubDecorInstalled();
	//   56  149:aload_0         
	//   57  150:invokespecial   #1134 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mFeatureProgress = true;
	//   58  153:aload_0         
	//   59  154:iconst_1        
	//   60  155:putfield        #332 <Field boolean mFeatureProgress>
			return true;
	//   61  158:iconst_1        
	//   62  159:ireturn         

		case 1: // '\001'
			throwFeatureRequestIfSubDecorInstalled();
	//   63  160:aload_0         
	//   64  161:invokespecial   #1134 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mWindowNoTitle = true;
	//   65  164:aload_0         
	//   66  165:iconst_1        
	//   67  166:putfield        #264 <Field boolean mWindowNoTitle>
			return true;
	//   68  169:iconst_1        
	//   69  170:ireturn         
		}
	}

	public void setContentView(int i)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #829 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:astore_2        
		viewgroup.removeAllViews();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #665 <Method void ViewGroup.removeAllViews()>
		LayoutInflater.from(mContext).inflate(i, viewgroup);
	//   10   21:aload_0         
	//   11   22:getfield        #156 <Field Context mContext>
	//   12   25:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//   13   28:iload_1         
	//   14   29:aload_2         
	//   15   30:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   16   33:pop             
		mOriginalWindowCallback.onContentChanged();
	//   17   34:aload_0         
	//   18   35:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   19   38:invokeinterface #836 <Method void android.view.Window$Callback.onContentChanged()>
	//   20   43:return          
	}

	public void setContentView(View view)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #829 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:astore_2        
		viewgroup.removeAllViews();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #665 <Method void ViewGroup.removeAllViews()>
		viewgroup.addView(view);
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #1135 <Method void ViewGroup.addView(View)>
		mOriginalWindowCallback.onContentChanged();
	//   13   26:aload_0         
	//   14   27:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   15   30:invokeinterface #836 <Method void android.view.Window$Callback.onContentChanged()>
	//   16   35:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #829 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:astore_3        
		viewgroup.removeAllViews();
	//    8   17:aload_3         
	//    9   18:invokevirtual   #665 <Method void ViewGroup.removeAllViews()>
		viewgroup.addView(view, layoutparams);
	//   10   21:aload_3         
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #689 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		mOriginalWindowCallback.onContentChanged();
	//   14   27:aload_0         
	//   15   28:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   16   31:invokeinterface #836 <Method void android.view.Window$Callback.onContentChanged()>
	//   17   36:return          
	}

	public void setSupportActionBar(Toolbar toolbar)
	{
		if(!(mOriginalWindowCallback instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #1003 <Class Activity>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		ActionBar actionbar = getSupportActionBar();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//    7   15:astore_2        
		if(actionbar instanceof WindowDecorActionBar)
	//*   8   16:aload_2         
	//*   9   17:instanceof      #1005 <Class WindowDecorActionBar>
	//*  10   20:ifeq            34
			throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
	//   11   23:new             #228 <Class IllegalStateException>
	//   12   26:dup             
	//   13   27:ldc2            #1139 <String "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.">
	//   14   30:invokespecial   #233 <Method void IllegalStateException(String)>
	//   15   33:athrow          
		mMenuInflater = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #1143 <Field android.view.MenuInflater mMenuInflater>
		if(actionbar != null)
	//*  19   39:aload_2         
	//*  20   40:ifnull          47
			actionbar.onDestroy();
	//   21   43:aload_2         
	//   22   44:invokevirtual   #1083 <Method void ActionBar.onDestroy()>
		if(toolbar != null)
	//*  23   47:aload_1         
	//*  24   48:ifnull          93
		{
			toolbar = ((Toolbar) (new ToolbarActionBar(toolbar, ((Activity)mOriginalWindowCallback).getTitle(), mAppCompatWindowCallback)));
	//   25   51:new             #736 <Class ToolbarActionBar>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #833 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   30   60:checkcast       #1003 <Class Activity>
	//   31   63:invokevirtual   #1144 <Method CharSequence Activity.getTitle()>
	//   32   66:aload_0         
	//   33   67:getfield        #1147 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   34   70:invokespecial   #1150 <Method void ToolbarActionBar(Toolbar, CharSequence, android.view.Window$Callback)>
	//   35   73:astore_1        
			mActionBar = ((ActionBar) (toolbar));
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:putfield        #1001 <Field ActionBar mActionBar>
			mWindow.setCallback(((ToolbarActionBar) (toolbar)).getWrappedWindowCallback());
	//   39   79:aload_0         
	//   40   80:getfield        #127 <Field Window mWindow>
	//   41   83:aload_1         
	//   42   84:invokevirtual   #1153 <Method android.view.Window$Callback ToolbarActionBar.getWrappedWindowCallback()>
	//   43   87:invokevirtual   #1155 <Method void Window.setCallback(android.view.Window$Callback)>
		} else
	//*  44   90:goto            109
		{
			mActionBar = null;
	//   45   93:aload_0         
	//   46   94:aconst_null     
	//   47   95:putfield        #1001 <Field ActionBar mActionBar>
			mWindow.setCallback(mAppCompatWindowCallback);
	//   48   98:aload_0         
	//   49   99:getfield        #127 <Field Window mWindow>
	//   50  102:aload_0         
	//   51  103:getfield        #1147 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   52  106:invokevirtual   #1155 <Method void Window.setCallback(android.view.Window$Callback)>
		}
		invalidateOptionsMenu();
	//   53  109:aload_0         
	//   54  110:invokevirtual   #1157 <Method void invalidateOptionsMenu()>
	//   55  113:return          
	}

	final boolean shouldAnimateActionModeView()
	{
		return mSubDecorInstalled && mSubDecor != null && ViewCompat.isLaidOut(((View) (mSubDecor)));
	//    0    0:aload_0         
	//    1    1:getfield        #436 <Field boolean mSubDecorInstalled>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:getfield        #114 <Field ViewGroup mSubDecor>
	//    5   11:ifnull          26
	//    6   14:aload_0         
	//    7   15:getfield        #114 <Field ViewGroup mSubDecor>
	//    8   18:invokestatic    #1161 <Method boolean ViewCompat.isLaidOut(View)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		if(callback == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new IllegalArgumentException("ActionMode callback can not be null.");
	//    2    4:new             #381 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #1165 <String "ActionMode callback can not be null.">
	//    5   11:invokespecial   #386 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(mActionMode != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #570 <Field ActionMode mActionMode>
	//*   9   19:ifnull          29
			mActionMode.finish();
	//   10   22:aload_0         
	//   11   23:getfield        #570 <Field ActionMode mActionMode>
	//   12   26:invokevirtual   #1049 <Method void ActionMode.finish()>
		callback = ((android.support.v7.view.ActionMode.Callback) (new ActionModeCallbackWrapperV9(callback)));
	//   13   29:new             #27  <Class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #1168 <Method void AppCompatDelegateImplV9$ActionModeCallbackWrapperV9(AppCompatDelegateImplV9, android.support.v7.view.ActionMode$Callback)>
	//   18   38:astore_1        
		ActionBar actionbar = getSupportActionBar();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #1041 <Method ActionBar getSupportActionBar()>
	//   21   43:astore_2        
		if(actionbar != null)
	//*  22   44:aload_2         
	//*  23   45:ifnull          84
		{
			mActionMode = actionbar.startActionMode(callback);
	//   24   48:aload_0         
	//   25   49:aload_2         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #1171 <Method ActionMode ActionBar.startActionMode(android.support.v7.view.ActionMode$Callback)>
	//   28   54:putfield        #570 <Field ActionMode mActionMode>
			if(mActionMode != null && mAppCompatCallback != null)
	//*  29   57:aload_0         
	//*  30   58:getfield        #570 <Field ActionMode mActionMode>
	//*  31   61:ifnull          84
	//*  32   64:aload_0         
	//*  33   65:getfield        #1175 <Field AppCompatCallback mAppCompatCallback>
	//*  34   68:ifnull          84
				mAppCompatCallback.onSupportActionModeStarted(mActionMode);
	//   35   71:aload_0         
	//   36   72:getfield        #1175 <Field AppCompatCallback mAppCompatCallback>
	//   37   75:aload_0         
	//   38   76:getfield        #570 <Field ActionMode mActionMode>
	//   39   79:invokeinterface #1181 <Method void AppCompatCallback.onSupportActionModeStarted(ActionMode)>
		}
		if(mActionMode == null)
	//*  40   84:aload_0         
	//*  41   85:getfield        #570 <Field ActionMode mActionMode>
	//*  42   88:ifnonnull       100
			mActionMode = startSupportActionModeFromWindow(callback);
	//   43   91:aload_0         
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:invokevirtual   #1184 <Method ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode$Callback)>
	//   47   97:putfield        #570 <Field ActionMode mActionMode>
		return mActionMode;
	//   48  100:aload_0         
	//   49  101:getfield        #570 <Field ActionMode mActionMode>
	//   50  104:areturn         
	}

	ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode.Callback callback)
	{
		Object obj;
		endOnGoingFadeAnimation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #940 <Method void endOnGoingFadeAnimation()>
		if(mActionMode != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #570 <Field ActionMode mActionMode>
	//*   4    8:ifnull          18
			mActionMode.finish();
	//    5   11:aload_0         
	//    6   12:getfield        #570 <Field ActionMode mActionMode>
	//    7   15:invokevirtual   #1049 <Method void ActionMode.finish()>
		obj = ((Object) (callback));
	//    8   18:aload_1         
	//    9   19:astore          4
		if(!(callback instanceof ActionModeCallbackWrapperV9))
	//*  10   21:aload_1         
	//*  11   22:instanceof      #27  <Class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9>
	//*  12   25:ifne            39
			obj = ((Object) (new ActionModeCallbackWrapperV9(callback)));
	//   13   28:new             #27  <Class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:aload_1         
	//   17   34:invokespecial   #1168 <Method void AppCompatDelegateImplV9$ActionModeCallbackWrapperV9(AppCompatDelegateImplV9, android.support.v7.view.ActionMode$Callback)>
	//   18   37:astore          4
		if(mAppCompatCallback == null || isDestroyed()) goto _L2; else goto _L1
	//   19   39:aload_0         
	//   20   40:getfield        #1175 <Field AppCompatCallback mAppCompatCallback>
	//   21   43:ifnull          68
	//   22   46:aload_0         
	//   23   47:invokevirtual   #466 <Method boolean isDestroyed()>
	//   24   50:ifne            68
_L1:
		callback = ((android.support.v7.view.ActionMode.Callback) (mAppCompatCallback.onWindowStartingSupportActionMode(((android.support.v7.view.ActionMode.Callback) (obj)))));
	//   25   53:aload_0         
	//   26   54:getfield        #1175 <Field AppCompatCallback mAppCompatCallback>
	//   27   57:aload           4
	//   28   59:invokeinterface #1189 <Method ActionMode AppCompatCallback.onWindowStartingSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//   29   64:astore_1        
		  goto _L3
	//*  30   65:goto            70
_L2:
		callback = null;
	//   31   68:aconst_null     
	//   32   69:astore_1        
_L3:
		if(callback != null)
	//*  33   70:aload_1         
	//*  34   71:ifnull          82
		{
			mActionMode = ((ActionMode) (callback));
	//   35   74:aload_0         
	//   36   75:aload_1         
	//   37   76:putfield        #570 <Field ActionMode mActionMode>
		} else
	//*  38   79:goto            572
		{
			callback = ((android.support.v7.view.ActionMode.Callback) (mActionModeView));
	//   39   82:aload_0         
	//   40   83:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//   41   86:astore_1        
			boolean flag = true;
	//   42   87:iconst_1        
	//   43   88:istore_3        
			if(callback == null)
	//*  44   89:aload_1         
	//*  45   90:ifnonnull       352
				if(mIsFloating)
	//*  46   93:aload_0         
	//*  47   94:getfield        #255 <Field boolean mIsFloating>
	//*  48   97:ifeq            312
				{
					TypedValue typedvalue = new TypedValue();
	//   49  100:new             #281 <Class TypedValue>
	//   50  103:dup             
	//   51  104:invokespecial   #283 <Method void TypedValue()>
	//   52  107:astore          5
					callback = ((android.support.v7.view.ActionMode.Callback) (mContext.getTheme()));
	//   53  109:aload_0         
	//   54  110:getfield        #156 <Field Context mContext>
	//   55  113:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   56  116:astore_1        
					((android.content.res.Resources.Theme) (callback)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedvalue, true);
	//   57  117:aload_1         
	//   58  118:getstatic       #292 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//   59  121:aload           5
	//   60  123:iconst_1        
	//   61  124:invokevirtual   #298 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   62  127:pop             
					if(typedvalue.resourceId != 0)
	//*  63  128:aload           5
	//*  64  130:getfield        #301 <Field int TypedValue.resourceId>
	//*  65  133:ifeq            190
					{
						android.content.res.Resources.Theme theme = mContext.getResources().newTheme();
	//   66  136:aload_0         
	//   67  137:getfield        #156 <Field Context mContext>
	//   68  140:invokevirtual   #517 <Method Resources Context.getResources()>
	//   69  143:invokevirtual   #522 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   70  146:astore          6
						theme.setTo(((android.content.res.Resources.Theme) (callback)));
	//   71  148:aload           6
	//   72  150:aload_1         
	//   73  151:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
						theme.applyStyle(typedvalue.resourceId, true);
	//   74  154:aload           6
	//   75  156:aload           5
	//   76  158:getfield        #301 <Field int TypedValue.resourceId>
	//   77  161:iconst_1        
	//   78  162:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
						callback = ((android.support.v7.view.ActionMode.Callback) (new ContextThemeWrapper(mContext, 0)));
	//   79  165:new             #303 <Class ContextThemeWrapper>
	//   80  168:dup             
	//   81  169:aload_0         
	//   82  170:getfield        #156 <Field Context mContext>
	//   83  173:iconst_0        
	//   84  174:invokespecial   #306 <Method void ContextThemeWrapper(Context, int)>
	//   85  177:astore_1        
						((Context) (callback)).getTheme().setTo(theme);
	//   86  178:aload_1         
	//   87  179:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   88  182:aload           6
	//   89  184:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
					} else
	//*  90  187:goto            195
					{
						callback = ((android.support.v7.view.ActionMode.Callback) (mContext));
	//   91  190:aload_0         
	//   92  191:getfield        #156 <Field Context mContext>
	//   93  194:astore_1        
					}
					mActionModeView = new ActionBarContextView(((Context) (callback)));
	//   94  195:aload_0         
	//   95  196:new             #1193 <Class ActionBarContextView>
	//   96  199:dup             
	//   97  200:aload_1         
	//   98  201:invokespecial   #1194 <Method void ActionBarContextView(Context)>
	//   99  204:putfield        #1191 <Field ActionBarContextView mActionModeView>
					mActionModePopup = new PopupWindow(((Context) (callback)), ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionModePopupWindowStyle);
	//  100  207:aload_0         
	//  101  208:new             #931 <Class PopupWindow>
	//  102  211:dup             
	//  103  212:aload_1         
	//  104  213:aconst_null     
	//  105  214:getstatic       #1197 <Field int android.support.v7.appcompat.R$attr.actionModePopupWindowStyle>
	//  106  217:invokespecial   #1200 <Method void PopupWindow(Context, AttributeSet, int)>
	//  107  220:putfield        #927 <Field PopupWindow mActionModePopup>
					PopupWindowCompat.setWindowLayoutType(mActionModePopup, 2);
	//  108  223:aload_0         
	//  109  224:getfield        #927 <Field PopupWindow mActionModePopup>
	//  110  227:iconst_2        
	//  111  228:invokestatic    #1206 <Method void PopupWindowCompat.setWindowLayoutType(PopupWindow, int)>
					mActionModePopup.setContentView(((View) (mActionModeView)));
	//  112  231:aload_0         
	//  113  232:getfield        #927 <Field PopupWindow mActionModePopup>
	//  114  235:aload_0         
	//  115  236:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  116  239:invokevirtual   #1207 <Method void PopupWindow.setContentView(View)>
					mActionModePopup.setWidth(-1);
	//  117  242:aload_0         
	//  118  243:getfield        #927 <Field PopupWindow mActionModePopup>
	//  119  246:iconst_m1       
	//  120  247:invokevirtual   #1210 <Method void PopupWindow.setWidth(int)>
					((Context) (callback)).getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarSize, typedvalue, true);
	//  121  250:aload_1         
	//  122  251:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//  123  254:getstatic       #1213 <Field int android.support.v7.appcompat.R$attr.actionBarSize>
	//  124  257:aload           5
	//  125  259:iconst_1        
	//  126  260:invokevirtual   #298 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//  127  263:pop             
					int i = TypedValue.complexToDimensionPixelSize(typedvalue.data, ((Context) (callback)).getResources().getDisplayMetrics());
	//  128  264:aload           5
	//  129  266:getfield        #1216 <Field int TypedValue.data>
	//  130  269:aload_1         
	//  131  270:invokevirtual   #517 <Method Resources Context.getResources()>
	//  132  273:invokevirtual   #1220 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//  133  276:invokestatic    #1224 <Method int TypedValue.complexToDimensionPixelSize(int, android.util.DisplayMetrics)>
	//  134  279:istore_2        
					mActionModeView.setContentHeight(i);
	//  135  280:aload_0         
	//  136  281:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  137  284:iload_2         
	//  138  285:invokevirtual   #1227 <Method void ActionBarContextView.setContentHeight(int)>
					mActionModePopup.setHeight(-2);
	//  139  288:aload_0         
	//  140  289:getfield        #927 <Field PopupWindow mActionModePopup>
	//  141  292:bipush          -2
	//  142  294:invokevirtual   #1230 <Method void PopupWindow.setHeight(int)>
					mShowActionModePopup = new Runnable() {

						public void run()
						{
							mActionModePopup.showAtLocation(((View) (mActionModeView)), 55, 0, 0);
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//    2    4:getfield        #28  <Field PopupWindow AppCompatDelegateImplV9.mActionModePopup>
						//    3    7:aload_0         
						//    4    8:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//    5   11:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
						//    6   14:bipush          55
						//    7   16:iconst_0        
						//    8   17:iconst_0        
						//    9   18:invokevirtual   #38  <Method void PopupWindow.showAtLocation(View, int, int, int)>
							endOnGoingFadeAnimation();
						//   10   21:aload_0         
						//   11   22:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//   12   25:invokevirtual   #41  <Method void AppCompatDelegateImplV9.endOnGoingFadeAnimation()>
							if(shouldAnimateActionModeView())
						//*  13   28:aload_0         
						//*  14   29:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//*  15   32:invokevirtual   #45  <Method boolean AppCompatDelegateImplV9.shouldAnimateActionModeView()>
						//*  16   35:ifeq            90
							{
								mActionModeView.setAlpha(0.0F);
						//   17   38:aload_0         
						//   18   39:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//   19   42:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
						//   20   45:fconst_0        
						//   21   46:invokevirtual   #51  <Method void ActionBarContextView.setAlpha(float)>
								mFadeAnim = ViewCompat.animate(((View) (mActionModeView))).alpha(1.0F);
						//   22   49:aload_0         
						//   23   50:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//   24   53:aload_0         
						//   25   54:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//   26   57:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
						//   27   60:invokestatic    #57  <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
						//   28   63:fconst_1        
						//   29   64:invokevirtual   #63  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
						//   30   67:putfield        #67  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
								mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

									public void onAnimationEnd(View view)
									{
										mActionModeView.setAlpha(1.0F);
									//    0    0:aload_0         
									//    1    1:getfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
									//    2    4:getfield        #24  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.this$0>
									//    3    7:getfield        #30  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
									//    4   10:fconst_1        
									//    5   11:invokevirtual   #36  <Method void ActionBarContextView.setAlpha(float)>
										mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
									//    6   14:aload_0         
									//    7   15:getfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
									//    8   18:getfield        #24  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.this$0>
									//    9   21:getfield        #40  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
									//   10   24:aconst_null     
									//   11   25:invokevirtual   #46  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
									//   12   28:pop             
										mFadeAnim = null;
									//   13   29:aload_0         
									//   14   30:getfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
									//   15   33:getfield        #24  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.this$0>
									//   16   36:aconst_null     
									//   17   37:putfield        #40  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
									//   18   40:return          
									}

									public void onAnimationStart(View view)
									{
										mActionModeView.setVisibility(0);
									//    0    0:aload_0         
									//    1    1:getfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
									//    2    4:getfield        #24  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$5.this$0>
									//    3    7:getfield        #30  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
									//    4   10:iconst_0        
									//    5   11:invokevirtual   #51  <Method void ActionBarContextView.setVisibility(int)>
									//    6   14:return          
									}

									final _cls5 this$1;

			
			{
				this$1 = _cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppCompatDelegateImplV9$5 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
								}
)));
						//   31   70:aload_0         
						//   32   71:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//   33   74:getfield        #67  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
						//   34   77:new             #13  <Class AppCompatDelegateImplV9$5$1>
						//   35   80:dup             
						//   36   81:aload_0         
						//   37   82:invokespecial   #70  <Method void AppCompatDelegateImplV9$5$1(AppCompatDelegateImplV9$5)>
						//   38   85:invokevirtual   #74  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
						//   39   88:pop             
								return;
						//   40   89:return          
							} else
							{
								mActionModeView.setAlpha(1.0F);
						//   41   90:aload_0         
						//   42   91:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//   43   94:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
						//   44   97:fconst_1        
						//   45   98:invokevirtual   #51  <Method void ActionBarContextView.setAlpha(float)>
								mActionModeView.setVisibility(0);
						//   46  101:aload_0         
						//   47  102:getfield        #19  <Field AppCompatDelegateImplV9 this$0>
						//   48  105:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
						//   49  108:iconst_0        
						//   50  109:invokevirtual   #78  <Method void ActionBarContextView.setVisibility(int)>
								return;
						//   51  112:return          
							}
						}

						final AppCompatDelegateImplV9 this$0;

			
			{
				this$0 = AppCompatDelegateImplV9.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AppCompatDelegateImplV9 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
					}
;
	//  143  297:aload_0         
	//  144  298:new             #18  <Class AppCompatDelegateImplV9$5>
	//  145  301:dup             
	//  146  302:aload_0         
	//  147  303:invokespecial   #1231 <Method void AppCompatDelegateImplV9$5(AppCompatDelegateImplV9)>
	//  148  306:putfield        #929 <Field Runnable mShowActionModePopup>
				} else
	//* 149  309:goto            352
				{
					callback = ((android.support.v7.view.ActionMode.Callback) ((ViewStubCompat)mSubDecor.findViewById(android.support.v7.appcompat.R.id.action_mode_bar_stub)));
	//  150  312:aload_0         
	//  151  313:getfield        #114 <Field ViewGroup mSubDecor>
	//  152  316:getstatic       #1234 <Field int android.support.v7.appcompat.R$id.action_mode_bar_stub>
	//  153  319:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  154  322:checkcast       #1236 <Class ViewStubCompat>
	//  155  325:astore_1        
					if(callback != null)
	//* 156  326:aload_1         
	//* 157  327:ifnull          352
					{
						((ViewStubCompat) (callback)).setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
	//  158  330:aload_1         
	//  159  331:aload_0         
	//  160  332:invokevirtual   #493 <Method Context getActionBarThemedContext()>
	//  161  335:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//  162  338:invokevirtual   #1240 <Method void ViewStubCompat.setLayoutInflater(LayoutInflater)>
						mActionModeView = (ActionBarContextView)((ViewStubCompat) (callback)).inflate();
	//  163  341:aload_0         
	//  164  342:aload_1         
	//  165  343:invokevirtual   #1242 <Method View ViewStubCompat.inflate()>
	//  166  346:checkcast       #1193 <Class ActionBarContextView>
	//  167  349:putfield        #1191 <Field ActionBarContextView mActionModeView>
					}
				}
			if(mActionModeView != null)
	//* 168  352:aload_0         
	//* 169  353:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//* 170  356:ifnull          572
			{
				endOnGoingFadeAnimation();
	//  171  359:aload_0         
	//  172  360:invokevirtual   #940 <Method void endOnGoingFadeAnimation()>
				mActionModeView.killMode();
	//  173  363:aload_0         
	//  174  364:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  175  367:invokevirtual   #1245 <Method void ActionBarContextView.killMode()>
				callback = ((android.support.v7.view.ActionMode.Callback) (mActionModeView.getContext()));
	//  176  370:aload_0         
	//  177  371:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  178  374:invokevirtual   #1248 <Method Context ActionBarContextView.getContext()>
	//  179  377:astore_1        
				ActionBarContextView actionbarcontextview = mActionModeView;
	//  180  378:aload_0         
	//  181  379:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  182  382:astore          5
				if(mActionModePopup != null)
	//* 183  384:aload_0         
	//* 184  385:getfield        #927 <Field PopupWindow mActionModePopup>
	//* 185  388:ifnonnull       394
	//* 186  391:goto            396
					flag = false;
	//  187  394:iconst_0        
	//  188  395:istore_3        
				callback = ((android.support.v7.view.ActionMode.Callback) (new StandaloneActionMode(((Context) (callback)), actionbarcontextview, ((android.support.v7.view.ActionMode.Callback) (obj)), flag)));
	//  189  396:new             #1250 <Class StandaloneActionMode>
	//  190  399:dup             
	//  191  400:aload_1         
	//  192  401:aload           5
	//  193  403:aload           4
	//  194  405:iload_3         
	//  195  406:invokespecial   #1253 <Method void StandaloneActionMode(Context, ActionBarContextView, android.support.v7.view.ActionMode$Callback, boolean)>
	//  196  409:astore_1        
				if(((android.support.v7.view.ActionMode.Callback) (obj)).onCreateActionMode(((ActionMode) (callback)), ((ActionMode) (callback)).getMenu()))
	//* 197  410:aload           4
	//* 198  412:aload_1         
	//* 199  413:aload_1         
	//* 200  414:invokevirtual   #1257 <Method Menu ActionMode.getMenu()>
	//* 201  417:invokeinterface #1263 <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
	//* 202  422:ifeq            567
				{
					((ActionMode) (callback)).invalidate();
	//  203  425:aload_1         
	//  204  426:invokevirtual   #1266 <Method void ActionMode.invalidate()>
					mActionModeView.initForMode(((ActionMode) (callback)));
	//  205  429:aload_0         
	//  206  430:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  207  433:aload_1         
	//  208  434:invokevirtual   #1269 <Method void ActionBarContextView.initForMode(ActionMode)>
					mActionMode = ((ActionMode) (callback));
	//  209  437:aload_0         
	//  210  438:aload_1         
	//  211  439:putfield        #570 <Field ActionMode mActionMode>
					if(shouldAnimateActionModeView())
	//* 212  442:aload_0         
	//* 213  443:invokevirtual   #1271 <Method boolean shouldAnimateActionModeView()>
	//* 214  446:ifeq            491
					{
						mActionModeView.setAlpha(0.0F);
	//  215  449:aload_0         
	//  216  450:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  217  453:fconst_0        
	//  218  454:invokevirtual   #1275 <Method void ActionBarContextView.setAlpha(float)>
						mFadeAnim = ViewCompat.animate(((View) (mActionModeView))).alpha(1.0F);
	//  219  457:aload_0         
	//  220  458:aload_0         
	//  221  459:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  222  462:invokestatic    #1279 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//  223  465:fconst_1        
	//  224  466:invokevirtual   #1283 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//  225  469:putfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
						mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

							public void onAnimationEnd(View view)
							{
								mActionModeView.setAlpha(1.0F);
							//    0    0:aload_0         
							//    1    1:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
							//    2    4:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
							//    3    7:fconst_1        
							//    4    8:invokevirtual   #31  <Method void ActionBarContextView.setAlpha(float)>
								mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
							//    5   11:aload_0         
							//    6   12:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
							//    7   15:getfield        #35  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
							//    8   18:aconst_null     
							//    9   19:invokevirtual   #41  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
							//   10   22:pop             
								mFadeAnim = null;
							//   11   23:aload_0         
							//   12   24:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
							//   13   27:aconst_null     
							//   14   28:putfield        #35  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
							//   15   31:return          
							}

							public void onAnimationStart(View view)
							{
								mActionModeView.setVisibility(0);
							//    0    0:aload_0         
							//    1    1:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
							//    2    4:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
							//    3    7:iconst_0        
							//    4    8:invokevirtual   #46  <Method void ActionBarContextView.setVisibility(int)>
								mActionModeView.sendAccessibilityEvent(32);
							//    5   11:aload_0         
							//    6   12:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
							//    7   15:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
							//    8   18:bipush          32
							//    9   20:invokevirtual   #49  <Method void ActionBarContextView.sendAccessibilityEvent(int)>
								if(mActionModeView.getParent() instanceof View)
							//*  10   23:aload_0         
							//*  11   24:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
							//*  12   27:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
							//*  13   30:invokevirtual   #53  <Method ViewParent ActionBarContextView.getParent()>
							//*  14   33:instanceof      #55  <Class View>
							//*  15   36:ifeq            55
									ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
							//   16   39:aload_0         
							//   17   40:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
							//   18   43:getfield        #25  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
							//   19   46:invokevirtual   #53  <Method ViewParent ActionBarContextView.getParent()>
							//   20   49:checkcast       #55  <Class View>
							//   21   52:invokestatic    #60  <Method void ViewCompat.requestApplyInsets(View)>
							//   22   55:return          
							}

							final AppCompatDelegateImplV9 this$0;

			
			{
				this$0 = AppCompatDelegateImplV9.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppCompatDelegateImplV9 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void ViewPropertyAnimatorListenerAdapter()>
			//    5    9:return          
			}
						}
)));
	//  226  472:aload_0         
	//  227  473:getfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//  228  476:new             #22  <Class AppCompatDelegateImplV9$6>
	//  229  479:dup             
	//  230  480:aload_0         
	//  231  481:invokespecial   #1284 <Method void AppCompatDelegateImplV9$6(AppCompatDelegateImplV9)>
	//  232  484:invokevirtual   #1288 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//  233  487:pop             
					} else
	//* 234  488:goto            542
					{
						mActionModeView.setAlpha(1.0F);
	//  235  491:aload_0         
	//  236  492:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  237  495:fconst_1        
	//  238  496:invokevirtual   #1275 <Method void ActionBarContextView.setAlpha(float)>
						mActionModeView.setVisibility(0);
	//  239  499:aload_0         
	//  240  500:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  241  503:iconst_0        
	//  242  504:invokevirtual   #1291 <Method void ActionBarContextView.setVisibility(int)>
						mActionModeView.sendAccessibilityEvent(32);
	//  243  507:aload_0         
	//  244  508:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  245  511:bipush          32
	//  246  513:invokevirtual   #1294 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
						if(mActionModeView.getParent() instanceof View)
	//* 247  516:aload_0         
	//* 248  517:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//* 249  520:invokevirtual   #1295 <Method ViewParent ActionBarContextView.getParent()>
	//* 250  523:instanceof      #135 <Class View>
	//* 251  526:ifeq            542
							ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
	//  252  529:aload_0         
	//  253  530:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  254  533:invokevirtual   #1295 <Method ViewParent ActionBarContextView.getParent()>
	//  255  536:checkcast       #135 <Class View>
	//  256  539:invokestatic    #1298 <Method void ViewCompat.requestApplyInsets(View)>
					}
					if(mActionModePopup != null)
	//* 257  542:aload_0         
	//* 258  543:getfield        #927 <Field PopupWindow mActionModePopup>
	//* 259  546:ifnull          572
						mWindow.getDecorView().post(mShowActionModePopup);
	//  260  549:aload_0         
	//  261  550:getfield        #127 <Field Window mWindow>
	//  262  553:invokevirtual   #133 <Method View Window.getDecorView()>
	//  263  556:aload_0         
	//  264  557:getfield        #929 <Field Runnable mShowActionModePopup>
	//  265  560:invokevirtual   #1301 <Method boolean View.post(Runnable)>
	//  266  563:pop             
				} else
	//* 267  564:goto            572
				{
					mActionMode = null;
	//  268  567:aload_0         
	//  269  568:aconst_null     
	//  270  569:putfield        #570 <Field ActionMode mActionMode>
				}
			}
		}
		if(mActionMode != null && mAppCompatCallback != null)
	//* 271  572:aload_0         
	//* 272  573:getfield        #570 <Field ActionMode mActionMode>
	//* 273  576:ifnull          599
	//* 274  579:aload_0         
	//* 275  580:getfield        #1175 <Field AppCompatCallback mAppCompatCallback>
	//* 276  583:ifnull          599
			mAppCompatCallback.onSupportActionModeStarted(mActionMode);
	//  277  586:aload_0         
	//  278  587:getfield        #1175 <Field AppCompatCallback mAppCompatCallback>
	//  279  590:aload_0         
	//  280  591:getfield        #570 <Field ActionMode mActionMode>
	//  281  594:invokeinterface #1181 <Method void AppCompatCallback.onSupportActionModeStarted(ActionMode)>
		return mActionMode;
	//  282  599:aload_0         
	//  283  600:getfield        #570 <Field ActionMode mActionMode>
	//  284  603:areturn         
		callback;
	//  285  604:astore_1        
		if(true) goto _L2; else goto _L4
_L4:
	//* 286  605:goto            68
	}

	int updateStatusGuard(int i)
	{
		ActionBarContextView actionbarcontextview = mActionModeView;
	//    0    0:aload_0         
	//    1    1:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//    2    4:astore          9
		boolean flag4 = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		boolean flag2;
		if(actionbarcontextview != null && (mActionModeView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
	//*   5    9:aload           9
	//*   6   11:ifnull          369
	//*   7   14:aload_0         
	//*   8   15:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//*   9   18:invokevirtual   #1303 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//*  10   21:instanceof      #1305 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   24:ifeq            369
		{
			android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams();
	//   12   27:aload_0         
	//   13   28:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//   14   31:invokevirtual   #1303 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//   15   34:checkcast       #1305 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   37:astore          9
			boolean flag5 = mActionModeView.isShown();
	//   17   39:aload_0         
	//   18   40:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//   19   43:invokevirtual   #1308 <Method boolean ActionBarContextView.isShown()>
	//   20   46:istore          8
			boolean flag3 = true;
	//   21   48:iconst_1        
	//   22   49:istore          6
			int j;
			boolean flag;
			int k;
			if(flag5)
	//*  23   51:iload           8
	//*  24   53:ifeq            310
			{
				if(mTempRect1 == null)
	//*  25   56:aload_0         
	//*  26   57:getfield        #1310 <Field Rect mTempRect1>
	//*  27   60:ifnonnull       85
				{
					mTempRect1 = new Rect();
	//   28   63:aload_0         
	//   29   64:new             #1312 <Class Rect>
	//   30   67:dup             
	//   31   68:invokespecial   #1313 <Method void Rect()>
	//   32   71:putfield        #1310 <Field Rect mTempRect1>
					mTempRect2 = new Rect();
	//   33   74:aload_0         
	//   34   75:new             #1312 <Class Rect>
	//   35   78:dup             
	//   36   79:invokespecial   #1313 <Method void Rect()>
	//   37   82:putfield        #1315 <Field Rect mTempRect2>
				}
				Rect rect = mTempRect1;
	//   38   85:aload_0         
	//   39   86:getfield        #1310 <Field Rect mTempRect1>
	//   40   89:astore          10
				Rect rect1 = mTempRect2;
	//   41   91:aload_0         
	//   42   92:getfield        #1315 <Field Rect mTempRect2>
	//   43   95:astore          11
				rect.set(0, i, 0, 0);
	//   44   97:aload           10
	//   45   99:iconst_0        
	//   46  100:iload_1         
	//   47  101:iconst_0        
	//   48  102:iconst_0        
	//   49  103:invokevirtual   #1318 <Method void Rect.set(int, int, int, int)>
				ViewUtils.computeFitSystemWindows(((View) (mSubDecor)), rect, rect1);
	//   50  106:aload_0         
	//   51  107:getfield        #114 <Field ViewGroup mSubDecor>
	//   52  110:aload           10
	//   53  112:aload           11
	//   54  114:invokestatic    #1322 <Method void ViewUtils.computeFitSystemWindows(View, Rect, Rect)>
				if(rect1.top == 0)
	//*  55  117:aload           11
	//*  56  119:getfield        #1325 <Field int Rect.top>
	//*  57  122:ifne            130
					j = i;
	//   58  125:iload_1         
	//   59  126:istore_2        
				else
	//*  60  127:goto            132
					j = 0;
	//   61  130:iconst_0        
	//   62  131:istore_2        
				boolean flag1;
				if(marginlayoutparams.topMargin != j)
	//*  63  132:aload           9
	//*  64  134:getfield        #1328 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//*  65  137:iload_2         
	//*  66  138:icmpeq          252
				{
					marginlayoutparams.topMargin = i;
	//   67  141:aload           9
	//   68  143:iload_1         
	//   69  144:putfield        #1328 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
					if(mStatusGuard == null)
	//*  70  147:aload_0         
	//*  71  148:getfield        #1330 <Field View mStatusGuard>
	//*  72  151:ifnonnull       213
					{
						mStatusGuard = new View(mContext);
	//   73  154:aload_0         
	//   74  155:new             #135 <Class View>
	//   75  158:dup             
	//   76  159:aload_0         
	//   77  160:getfield        #156 <Field Context mContext>
	//   78  163:invokespecial   #1331 <Method void View(Context)>
	//   79  166:putfield        #1330 <Field View mStatusGuard>
						mStatusGuard.setBackgroundColor(mContext.getResources().getColor(android.support.v7.appcompat.R.color.abc_input_method_navigation_guard));
	//   80  169:aload_0         
	//   81  170:getfield        #1330 <Field View mStatusGuard>
	//   82  173:aload_0         
	//   83  174:getfield        #156 <Field Context mContext>
	//   84  177:invokevirtual   #517 <Method Resources Context.getResources()>
	//   85  180:getstatic       #1336 <Field int android.support.v7.appcompat.R$color.abc_input_method_navigation_guard>
	//   86  183:invokevirtual   #1339 <Method int Resources.getColor(int)>
	//   87  186:invokevirtual   #1342 <Method void View.setBackgroundColor(int)>
						mSubDecor.addView(mStatusGuard, -1, new android.view.ViewGroup.LayoutParams(-1, i));
	//   88  189:aload_0         
	//   89  190:getfield        #114 <Field ViewGroup mSubDecor>
	//   90  193:aload_0         
	//   91  194:getfield        #1330 <Field View mStatusGuard>
	//   92  197:iconst_m1       
	//   93  198:new             #657 <Class android.view.ViewGroup$LayoutParams>
	//   94  201:dup             
	//   95  202:iconst_m1       
	//   96  203:iload_1         
	//   97  204:invokespecial   #673 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   98  207:invokevirtual   #1345 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
					} else
	//*  99  210:goto            246
					{
						android.view.ViewGroup.LayoutParams layoutparams = mStatusGuard.getLayoutParams();
	//  100  213:aload_0         
	//  101  214:getfield        #1330 <Field View mStatusGuard>
	//  102  217:invokevirtual   #655 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  103  220:astore          10
						if(layoutparams.height != i)
	//* 104  222:aload           10
	//* 105  224:getfield        #1348 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 106  227:iload_1         
	//* 107  228:icmpeq          246
						{
							layoutparams.height = i;
	//  108  231:aload           10
	//  109  233:iload_1         
	//  110  234:putfield        #1348 <Field int android.view.ViewGroup$LayoutParams.height>
							mStatusGuard.setLayoutParams(layoutparams);
	//  111  237:aload_0         
	//  112  238:getfield        #1330 <Field View mStatusGuard>
	//  113  241:aload           10
	//  114  243:invokevirtual   #1352 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//* 121  256:getfield        #1330 <Field View mStatusGuard>
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
	//* 133  278:getfield        #337 <Field boolean mOverlayActionMode>
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
			if(marginlayoutparams.topMargin != 0)
	//* 150  310:aload           9
	//* 151  312:getfield        #1328 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//* 152  315:ifeq            334
			{
				marginlayoutparams.topMargin = 0;
	//  153  318:aload           9
	//  154  320:iconst_0        
	//  155  321:putfield        #1328 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
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
				mActionModeView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (marginlayoutparams)));
	//  175  351:aload_0         
	//  176  352:getfield        #1191 <Field ActionBarContextView mActionModeView>
	//  177  355:aload           9
	//  178  357:invokevirtual   #1353 <Method void ActionBarContextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
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
		if(mStatusGuard != null)
	//* 186  372:aload_0         
	//* 187  373:getfield        #1330 <Field View mStatusGuard>
	//* 188  376:ifnull          405
		{
			View view = mStatusGuard;
	//  189  379:aload_0         
	//  190  380:getfield        #1330 <Field View mStatusGuard>
	//  191  383:astore          9
			byte byte0;
			if(flag2)
	//* 192  385:iload           5
	//* 193  387:ifeq            396
				byte0 = ((byte) (flag4));
	//  194  390:iload           7
	//  195  392:istore_2        
			else
	//* 196  393:goto            399
				byte0 = 8;
	//  197  396:bipush          8
	//  198  398:istore_2        
			view.setVisibility(((int) (byte0)));
	//  199  399:aload           9
	//  200  401:iload_2         
	//  201  402:invokevirtual   #1354 <Method void View.setVisibility(int)>
		}
		return i;
	//  202  405:iload_1         
	//  203  406:ireturn         
	}

	private static final boolean IS_PRE_LOLLIPOP;
	private ActionMenuPresenterCallback mActionMenuPresenterCallback;
	ActionMode mActionMode;
	PopupWindow mActionModePopup;
	ActionBarContextView mActionModeView;
	private AppCompatViewInflater mAppCompatViewInflater;
	private boolean mClosingActionMenu;
	private DecorContentParent mDecorContentParent;
	private boolean mEnableDefaultActionBarUp;
	ViewPropertyAnimatorCompat mFadeAnim;
	private boolean mFeatureIndeterminateProgress;
	private boolean mFeatureProgress;
	int mInvalidatePanelMenuFeatures;
	boolean mInvalidatePanelMenuPosted;
	private final Runnable mInvalidatePanelMenuRunnable = new Runnable() {

		public void run()
		{
			if((mInvalidatePanelMenuFeatures & 1) != 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
		//*   2    4:getfield        #23  <Field int AppCompatDelegateImplV9.mInvalidatePanelMenuFeatures>
		//*   3    7:iconst_1        
		//*   4    8:iand            
		//*   5    9:ifeq            20
				doInvalidatePanelMenu(0);
		//    6   12:aload_0         
		//    7   13:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
		//    8   16:iconst_0        
		//    9   17:invokevirtual   #27  <Method void AppCompatDelegateImplV9.doInvalidatePanelMenu(int)>
			if((mInvalidatePanelMenuFeatures & 0x1000) != 0)
		//*  10   20:aload_0         
		//*  11   21:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
		//*  12   24:getfield        #23  <Field int AppCompatDelegateImplV9.mInvalidatePanelMenuFeatures>
		//*  13   27:sipush          4096
		//*  14   30:iand            
		//*  15   31:ifeq            43
				doInvalidatePanelMenu(108);
		//   16   34:aload_0         
		//   17   35:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
		//   18   38:bipush          108
		//   19   40:invokevirtual   #27  <Method void AppCompatDelegateImplV9.doInvalidatePanelMenu(int)>
			mInvalidatePanelMenuPosted = false;
		//   20   43:aload_0         
		//   21   44:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
		//   22   47:iconst_0        
		//   23   48:putfield        #31  <Field boolean AppCompatDelegateImplV9.mInvalidatePanelMenuPosted>
			mInvalidatePanelMenuFeatures = 0;
		//   24   51:aload_0         
		//   25   52:getfield        #14  <Field AppCompatDelegateImplV9 this$0>
		//   26   55:iconst_0        
		//   27   56:putfield        #23  <Field int AppCompatDelegateImplV9.mInvalidatePanelMenuFeatures>
		//   28   59:return          
		}

		final AppCompatDelegateImplV9 this$0;

			
			{
				this$0 = AppCompatDelegateImplV9.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AppCompatDelegateImplV9 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private boolean mLongPressBackDown;
	private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
	private PanelFeatureState mPanels[];
	private PanelFeatureState mPreparedPanel;
	Runnable mShowActionModePopup;
	private View mStatusGuard;
	private ViewGroup mSubDecor;
	private boolean mSubDecorInstalled;
	private Rect mTempRect1;
	private Rect mTempRect2;
	private TextView mTitleView;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
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
	//    9   16:putstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//*  10   19:return          
	}
}
