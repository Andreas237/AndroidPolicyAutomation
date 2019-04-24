// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
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
						if(mActionModePopup == null) goto _L2; else goto _L1
					//    6   15:aload_0         
					//    7   16:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//    8   19:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//    9   22:getfield        #42  <Field PopupWindow AppCompatDelegateImplV9.mActionModePopup>
					//   10   25:ifnull          81
_L1:
						mActionModePopup.dismiss();
					//   11   28:aload_0         
					//   12   29:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   13   32:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   14   35:getfield        #42  <Field PopupWindow AppCompatDelegateImplV9.mActionModePopup>
					//   15   38:invokevirtual   #47  <Method void PopupWindow.dismiss()>
_L4:
						mActionModeView.removeAllViews();
					//   16   41:aload_0         
					//   17   42:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   18   45:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   19   48:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
					//   20   51:invokevirtual   #50  <Method void ActionBarContextView.removeAllViews()>
						mFadeAnim.setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (null)));
					//   21   54:aload_0         
					//   22   55:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   23   58:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   24   61:getfield        #54  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
					//   25   64:aconst_null     
					//   26   65:invokevirtual   #60  <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
					//   27   68:pop             
						mFadeAnim = null;
					//   28   69:aload_0         
					//   29   70:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   30   73:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   31   76:aconst_null     
					//   32   77:putfield        #54  <Field ViewPropertyAnimatorCompat AppCompatDelegateImplV9.mFadeAnim>
						return;
					//   33   80:return          
_L2:
						if(mActionModeView.getParent() instanceof View)
					//*  34   81:aload_0         
					//*  35   82:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//*  36   85:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//*  37   88:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
					//*  38   91:invokevirtual   #64  <Method ViewParent ActionBarContextView.getParent()>
					//*  39   94:instanceof      #66  <Class View>
					//*  40   97:ifeq            41
							ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
					//   41  100:aload_0         
					//   42  101:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
					//   43  104:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
					//   44  107:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
					//   45  110:invokevirtual   #64  <Method ViewParent ActionBarContextView.getParent()>
					//   46  113:checkcast       #66  <Class View>
					//   47  116:invokestatic    #71  <Method void ViewCompat.requestApplyInsets(View)>
						if(true) goto _L4; else goto _L3
					//   48  119:goto            41
_L3:
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
		//    2    3:icmplt          32
		//    3    6:iload_2         
		//    4    7:bipush          -5
		//    5    9:icmplt          32
		//    6   12:iload_1         
		//    7   13:aload_0         
		//    8   14:invokevirtual   #23  <Method int getWidth()>
		//    9   17:iconst_5        
		//   10   18:iadd            
		//   11   19:icmpgt          32
		//   12   22:iload_2         
		//   13   23:aload_0         
		//   14   24:invokevirtual   #26  <Method int getHeight()>
		//   15   27:iconst_5        
		//   16   28:iadd            
		//   17   29:icmple          34
		//   18   32:iconst_1        
		//   19   33:ireturn         
		//   20   34:iconst_0        
		//   21   35:ireturn         
		}

		public boolean dispatchKeyEvent(KeyEvent keyevent)
		{
			return AppCompatDelegateImplV9.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field AppCompatDelegateImplV9 this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #30  <Method boolean AppCompatDelegateImplV9.dispatchKeyEvent(KeyEvent)>
		//    4    8:ifne            19
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #31  <Method boolean ContentFrameLayout.dispatchKeyEvent(KeyEvent)>
		//    8   16:ifeq            21
		//    9   19:iconst_1        
		//   10   20:ireturn         
		//   11   21:iconst_0        
		//   12   22:ireturn         
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
			boolean flag1 = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			boolean flag;
			if(shownPanelView == null)
		//*   2    2:aload_0         
		//*   3    3:getfield        #100 <Field View shownPanelView>
		//*   4    6:ifnonnull       13
			{
				flag = false;
		//    5    9:iconst_0        
		//    6   10:istore_1        
			} else
		//*   7   11:iload_1         
		//*   8   12:ireturn         
			{
				flag = flag1;
		//    9   13:iload_2         
		//   10   14:istore_1        
				if(createdPanelView == null)
		//*  11   15:aload_0         
		//*  12   16:getfield        #102 <Field View createdPanelView>
		//*  13   19:ifnonnull       11
				{
					flag = flag1;
		//   14   22:iload_2         
		//   15   23:istore_1        
					if(listMenuPresenter.getAdapter().getCount() <= 0)
		//*  16   24:aload_0         
		//*  17   25:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//*  18   28:invokevirtual   #106 <Method ListAdapter ListMenuPresenter.getAdapter()>
		//*  19   31:invokeinterface #112 <Method int ListAdapter.getCount()>
		//*  20   36:ifgt            11
						return false;
		//   21   39:iconst_0        
		//   22   40:ireturn         
				}
			}
			return flag;
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
			if(menubuilder != menu)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #54  <Field MenuBuilder menu>
		//*   3    5:if_acmpne       9
		//*   4    8:return          
			{
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
		//*  17   33:ifnull          8
		//*  18   36:aload_0         
		//*  19   37:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//*  20   40:ifnull          8
				{
					menubuilder.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (listMenuPresenter)));
		//   21   43:aload_1         
		//   22   44:aload_0         
		//   23   45:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   24   48:invokevirtual   #90  <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
					return;
		//   25   51:return          
				}
			}
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
		//*  34   64:ifeq            136
				theme.applyStyle(typedvalue.resourceId, true);
		//   35   67:aload_2         
		//   36   68:aload_3         
		//   37   69:getfield        #172 <Field int TypedValue.resourceId>
		//   38   72:iconst_1        
		//   39   73:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			else
		//*  40   76:new             #181 <Class ContextThemeWrapper>
		//*  41   79:dup             
		//*  42   80:aload_1         
		//*  43   81:iconst_0        
		//*  44   82:invokespecial   #182 <Method void ContextThemeWrapper(Context, int)>
		//*  45   85:astore_1        
		//*  46   86:aload_1         
		//*  47   87:invokevirtual   #154 <Method android.content.res.Resources$Theme Context.getTheme()>
		//*  48   90:aload_2         
		//*  49   91:invokevirtual   #160 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
		//*  50   94:aload_0         
		//*  51   95:aload_1         
		//*  52   96:putfield        #75  <Field Context listPresenterContext>
		//*  53   99:aload_1         
		//*  54  100:getstatic       #188 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTheme>
		//*  55  103:invokevirtual   #192 <Method TypedArray Context.obtainStyledAttributes(int[])>
		//*  56  106:astore_1        
		//*  57  107:aload_0         
		//*  58  108:aload_1         
		//*  59  109:getstatic       #195 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_panelBackground>
		//*  60  112:iconst_0        
		//*  61  113:invokevirtual   #201 <Method int TypedArray.getResourceId(int, int)>
		//*  62  116:putfield        #203 <Field int background>
		//*  63  119:aload_0         
		//*  64  120:aload_1         
		//*  65  121:getstatic       #206 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_android_windowAnimationStyle>
		//*  66  124:iconst_0        
		//*  67  125:invokevirtual   #201 <Method int TypedArray.getResourceId(int, int)>
		//*  68  128:putfield        #208 <Field int windowAnimations>
		//*  69  131:aload_1         
		//*  70  132:invokevirtual   #211 <Method void TypedArray.recycle()>
		//*  71  135:return          
				theme.applyStyle(android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu, true);
		//   72  136:aload_2         
		//   73  137:getstatic       #216 <Field int android.support.v7.appcompat.R$style.Theme_AppCompat_CompactMenu>
		//   74  140:iconst_1        
		//   75  141:invokevirtual   #176 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			context = ((Context) (new ContextThemeWrapper(context, 0)));
			context.getTheme().setTo(theme);
			listPresenterContext = context;
			context = ((Context) (context.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme)));
			background = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_panelBackground, 0);
			windowAnimations = ((TypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
			((TypedArray) (context)).recycle();
		//*  76  144:goto            76
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
			boolean flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			PanelFeatureState.SavedState savedstate = new PanelFeatureState.SavedState();
		//    2    2:new             #2   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
		//    3    5:dup             
		//    4    6:invokespecial   #35  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
		//    5    9:astore_3        
			savedstate.featureId = parcel.readInt();
		//    6   10:aload_3         
		//    7   11:aload_0         
		//    8   12:invokevirtual   #41  <Method int Parcel.readInt()>
		//    9   15:putfield        #43  <Field int featureId>
			if(parcel.readInt() != 1)
		//*  10   18:aload_0         
		//*  11   19:invokevirtual   #41  <Method int Parcel.readInt()>
		//*  12   22:iconst_1        
		//*  13   23:icmpne          49
		//*  14   26:aload_3         
		//*  15   27:iload_2         
		//*  16   28:putfield        #45  <Field boolean isOpen>
		//*  17   31:aload_3         
		//*  18   32:getfield        #45  <Field boolean isOpen>
		//*  19   35:ifeq            47
		//*  20   38:aload_3         
		//*  21   39:aload_0         
		//*  22   40:aload_1         
		//*  23   41:invokevirtual   #49  <Method Bundle Parcel.readBundle(ClassLoader)>
		//*  24   44:putfield        #51  <Field Bundle menuState>
		//*  25   47:aload_3         
		//*  26   48:areturn         
				flag = false;
		//   27   49:iconst_0        
		//   28   50:istore_2        
			savedstate.isOpen = flag;
			if(savedstate.isOpen)
				savedstate.menuState = parcel.readBundle(classloader);
			return savedstate;
		//*  29   51:goto            26
		}

		public int describeContents()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			parcel.writeInt(featureId);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #43  <Field int featureId>
		//    3    5:invokevirtual   #58  <Method void Parcel.writeInt(int)>
			if(isOpen)
		//*   4    8:aload_0         
		//*   5    9:getfield        #45  <Field boolean isOpen>
		//*   6   12:ifeq            38
				i = 1;
		//    7   15:iconst_1        
		//    8   16:istore_2        
			else
		//*   9   17:aload_1         
		//*  10   18:iload_2         
		//*  11   19:invokevirtual   #58  <Method void Parcel.writeInt(int)>
		//*  12   22:aload_0         
		//*  13   23:getfield        #45  <Field boolean isOpen>
		//*  14   26:ifeq            37
		//*  15   29:aload_1         
		//*  16   30:aload_0         
		//*  17   31:getfield        #51  <Field Bundle menuState>
		//*  18   34:invokevirtual   #62  <Method void Parcel.writeBundle(Bundle)>
		//*  19   37:return          
				i = 0;
		//   20   38:iconst_0        
		//   21   39:istore_2        
			parcel.writeInt(i);
			if(isOpen)
				parcel.writeBundle(menuState);
		//*  22   40:goto            17
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
label0:
			{
				MenuBuilder menubuilder1 = menubuilder.getRootMenu();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method MenuBuilder MenuBuilder.getRootMenu()>
		//    2    4:astore          4
				boolean flag1;
				AppCompatDelegateImplV9 appcompatdelegateimplv9;
				if(menubuilder1 != menubuilder)
		//*   3    6:aload           4
		//*   4    8:aload_1         
		//*   5    9:if_acmpeq       66
					flag1 = true;
		//    6   12:iconst_1        
		//    7   13:istore_3        
				else
		//*   8   14:aload_0         
		//*   9   15:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//*  10   18:astore          5
		//*  11   20:iload_3         
		//*  12   21:ifeq            27
		//*  13   24:aload           4
		//*  14   26:astore_1        
		//*  15   27:aload           5
		//*  16   29:aload_1         
		//*  17   30:invokevirtual   #31  <Method AppCompatDelegateImplV9$PanelFeatureState AppCompatDelegateImplV9.findMenuPanel(Menu)>
		//*  18   33:astore_1        
		//*  19   34:aload_1         
		//*  20   35:ifnull          65
		//*  21   38:iload_3         
		//*  22   39:ifeq            71
		//*  23   42:aload_0         
		//*  24   43:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//*  25   46:aload_1         
		//*  26   47:getfield        #37  <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
		//*  27   50:aload_1         
		//*  28   51:aload           4
		//*  29   53:invokevirtual   #41  <Method void AppCompatDelegateImplV9.callOnPanelClosed(int, AppCompatDelegateImplV9$PanelFeatureState, Menu)>
		//*  30   56:aload_0         
		//*  31   57:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//*  32   60:aload_1         
		//*  33   61:iconst_1        
		//*  34   62:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		//*  35   65:return          
					flag1 = false;
		//   36   66:iconst_0        
		//   37   67:istore_3        
				appcompatdelegateimplv9 = AppCompatDelegateImplV9.this;
				if(flag1)
					menubuilder = menubuilder1;
				menubuilder = ((MenuBuilder) (appcompatdelegateimplv9.findMenuPanel(((Menu) (menubuilder)))));
				if(menubuilder != null)
				{
					if(!flag1)
						break label0;
					callOnPanelClosed(((PanelFeatureState) (menubuilder)).featureId, ((PanelFeatureState) (menubuilder)), ((Menu) (menubuilder1)));
					closePanel(((PanelFeatureState) (menubuilder)), true);
				}
				return;
			}
		//*  38   68:goto            14
			closePanel(((PanelFeatureState) (menubuilder)), flag);
		//   39   71:aload_0         
		//   40   72:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//   41   75:aload_1         
		//   42   76:iload_2         
		//   43   77:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
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
	//*  20   43:ifeq            249
			requestWindowFeature(1);
	//   21   46:aload_0         
	//   22   47:iconst_1        
	//   23   48:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//   24   51:pop             
		else
	//*  25   52:aload_1         
	//*  26   53:getstatic       #246 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBarOverlay>
	//*  27   56:iconst_0        
	//*  28   57:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  29   60:ifeq            70
	//*  30   63:aload_0         
	//*  31   64:bipush          109
	//*  32   66:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//*  33   69:pop             
	//*  34   70:aload_1         
	//*  35   71:getstatic       #249 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionModeOverlay>
	//*  36   74:iconst_0        
	//*  37   75:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  38   78:ifeq            88
	//*  39   81:aload_0         
	//*  40   82:bipush          10
	//*  41   84:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//*  42   87:pop             
	//*  43   88:aload_0         
	//*  44   89:aload_1         
	//*  45   90:getstatic       #252 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_android_windowIsFloating>
	//*  46   93:iconst_0        
	//*  47   94:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  48   97:putfield        #255 <Field boolean mIsFloating>
	//*  49  100:aload_1         
	//*  50  101:invokevirtual   #218 <Method void TypedArray.recycle()>
	//*  51  104:aload_0         
	//*  52  105:getfield        #127 <Field Window mWindow>
	//*  53  108:invokevirtual   #133 <Method View Window.getDecorView()>
	//*  54  111:pop             
	//*  55  112:aload_0         
	//*  56  113:getfield        #156 <Field Context mContext>
	//*  57  116:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//*  58  119:astore_1        
	//*  59  120:aload_0         
	//*  60  121:getfield        #264 <Field boolean mWindowNoTitle>
	//*  61  124:ifne            429
	//*  62  127:aload_0         
	//*  63  128:getfield        #255 <Field boolean mIsFloating>
	//*  64  131:ifeq            270
	//*  65  134:aload_1         
	//*  66  135:getstatic       #269 <Field int android.support.v7.appcompat.R$layout.abc_dialog_title_material>
	//*  67  138:aconst_null     
	//*  68  139:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//*  69  142:checkcast       #117 <Class ViewGroup>
	//*  70  145:astore_1        
	//*  71  146:aload_0         
	//*  72  147:iconst_0        
	//*  73  148:putfield        #276 <Field boolean mOverlayActionBar>
	//*  74  151:aload_0         
	//*  75  152:iconst_0        
	//*  76  153:putfield        #279 <Field boolean mHasActionBar>
	//*  77  156:aload_1         
	//*  78  157:ifnonnull       506
	//*  79  160:new             #281 <Class IllegalArgumentException>
	//*  80  163:dup             
	//*  81  164:new             #283 <Class StringBuilder>
	//*  82  167:dup             
	//*  83  168:invokespecial   #285 <Method void StringBuilder()>
	//*  84  171:ldc2            #287 <String "AppCompat does not support the current theme features: { windowActionBar: ">
	//*  85  174:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//*  86  177:aload_0         
	//*  87  178:getfield        #279 <Field boolean mHasActionBar>
	//*  88  181:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//*  89  184:ldc2            #296 <String ", windowActionBarOverlay: ">
	//*  90  187:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//*  91  190:aload_0         
	//*  92  191:getfield        #276 <Field boolean mOverlayActionBar>
	//*  93  194:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//*  94  197:ldc2            #298 <String ", android:windowIsFloating: ">
	//*  95  200:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//*  96  203:aload_0         
	//*  97  204:getfield        #255 <Field boolean mIsFloating>
	//*  98  207:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//*  99  210:ldc2            #300 <String ", windowActionModeOverlay: ">
	//* 100  213:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//* 101  216:aload_0         
	//* 102  217:getfield        #303 <Field boolean mOverlayActionMode>
	//* 103  220:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//* 104  223:ldc2            #305 <String ", windowNoTitle: ">
	//* 105  226:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//* 106  229:aload_0         
	//* 107  230:getfield        #264 <Field boolean mWindowNoTitle>
	//* 108  233:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//* 109  236:ldc2            #307 <String " }">
	//* 110  239:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//* 111  242:invokevirtual   #311 <Method String StringBuilder.toString()>
	//* 112  245:invokespecial   #312 <Method void IllegalArgumentException(String)>
	//* 113  248:athrow          
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar, false))
	//* 114  249:aload_1         
	//* 115  250:getstatic       #226 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBar>
	//* 116  253:iconst_0        
	//* 117  254:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//* 118  257:ifeq            52
			requestWindowFeature(108);
	//  119  260:aload_0         
	//  120  261:bipush          108
	//  121  263:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//  122  266:pop             
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false))
			requestWindowFeature(109);
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false))
			requestWindowFeature(10);
		mIsFloating = ((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
		((TypedArray) (obj)).recycle();
		mWindow.getDecorView();
		obj = ((Object) (LayoutInflater.from(mContext)));
		ContentFrameLayout contentframelayout;
		ViewGroup viewgroup;
		if(!mWindowNoTitle)
		{
			if(mIsFloating)
			{
				obj = ((Object) ((ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_dialog_title_material, ((ViewGroup) (null)))));
				mOverlayActionBar = false;
				mHasActionBar = false;
			} else
	//* 123  267:goto            52
			if(mHasActionBar)
	//* 124  270:aload_0         
	//* 125  271:getfield        #279 <Field boolean mHasActionBar>
	//* 126  274:ifeq            635
			{
				obj = ((Object) (new TypedValue()));
	//  127  277:new             #314 <Class TypedValue>
	//  128  280:dup             
	//  129  281:invokespecial   #315 <Method void TypedValue()>
	//  130  284:astore_1        
				mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, ((TypedValue) (obj)), true);
	//  131  285:aload_0         
	//  132  286:getfield        #156 <Field Context mContext>
	//  133  289:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//  134  292:getstatic       #324 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//  135  295:aload_1         
	//  136  296:iconst_1        
	//  137  297:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//  138  300:pop             
				if(((TypedValue) (obj)).resourceId != 0)
	//* 139  301:aload_1         
	//* 140  302:getfield        #333 <Field int TypedValue.resourceId>
	//* 141  305:ifeq            421
					obj = ((Object) (new ContextThemeWrapper(mContext, ((TypedValue) (obj)).resourceId)));
	//  142  308:new             #335 <Class ContextThemeWrapper>
	//  143  311:dup             
	//  144  312:aload_0         
	//  145  313:getfield        #156 <Field Context mContext>
	//  146  316:aload_1         
	//  147  317:getfield        #333 <Field int TypedValue.resourceId>
	//  148  320:invokespecial   #338 <Method void ContextThemeWrapper(Context, int)>
	//  149  323:astore_1        
				else
	//* 150  324:aload_1         
	//* 151  325:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//* 152  328:getstatic       #341 <Field int android.support.v7.appcompat.R$layout.abc_screen_toolbar>
	//* 153  331:aconst_null     
	//* 154  332:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//* 155  335:checkcast       #117 <Class ViewGroup>
	//* 156  338:astore_1        
	//* 157  339:aload_0         
	//* 158  340:aload_1         
	//* 159  341:getstatic       #346 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//* 160  344:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//* 161  347:checkcast       #348 <Class DecorContentParent>
	//* 162  350:putfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 163  353:aload_0         
	//* 164  354:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 165  357:aload_0         
	//* 166  358:invokevirtual   #354 <Method android.view.Window$Callback getWindowCallback()>
	//* 167  361:invokeinterface #358 <Method void DecorContentParent.setWindowCallback(android.view.Window$Callback)>
	//* 168  366:aload_0         
	//* 169  367:getfield        #276 <Field boolean mOverlayActionBar>
	//* 170  370:ifeq            384
	//* 171  373:aload_0         
	//* 172  374:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 173  377:bipush          109
	//* 174  379:invokeinterface #362 <Method void DecorContentParent.initFeature(int)>
	//* 175  384:aload_0         
	//* 176  385:getfield        #364 <Field boolean mFeatureProgress>
	//* 177  388:ifeq            401
	//* 178  391:aload_0         
	//* 179  392:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 180  395:iconst_2        
	//* 181  396:invokeinterface #362 <Method void DecorContentParent.initFeature(int)>
	//* 182  401:aload_0         
	//* 183  402:getfield        #366 <Field boolean mFeatureIndeterminateProgress>
	//* 184  405:ifeq            418
	//* 185  408:aload_0         
	//* 186  409:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 187  412:iconst_5        
	//* 188  413:invokeinterface #362 <Method void DecorContentParent.initFeature(int)>
	//* 189  418:goto            156
					obj = ((Object) (mContext));
	//  190  421:aload_0         
	//  191  422:getfield        #156 <Field Context mContext>
	//  192  425:astore_1        
				obj = ((Object) ((ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.appcompat.R.layout.abc_screen_toolbar, ((ViewGroup) (null)))));
				mDecorContentParent = (DecorContentParent)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
				mDecorContentParent.setWindowCallback(getWindowCallback());
				if(mOverlayActionBar)
					mDecorContentParent.initFeature(109);
				if(mFeatureProgress)
					mDecorContentParent.initFeature(2);
				if(mFeatureIndeterminateProgress)
					mDecorContentParent.initFeature(5);
			} else
	//* 193  426:goto            324
	//* 194  429:aload_0         
	//* 195  430:getfield        #303 <Field boolean mOverlayActionMode>
	//* 196  433:ifeq            471
	//* 197  436:aload_1         
	//* 198  437:getstatic       #369 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple_overlay_action_mode>
	//* 199  440:aconst_null     
	//* 200  441:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//* 201  444:checkcast       #117 <Class ViewGroup>
	//* 202  447:astore_1        
	//* 203  448:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//* 204  451:bipush          21
	//* 205  453:icmplt          486
	//* 206  456:aload_1         
	//* 207  457:new             #12  <Class AppCompatDelegateImplV9$2>
	//* 208  460:dup             
	//* 209  461:aload_0         
	//* 210  462:invokespecial   #370 <Method void AppCompatDelegateImplV9$2(AppCompatDelegateImplV9)>
	//* 211  465:invokestatic    #376 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//* 212  468:goto            156
	//* 213  471:aload_1         
	//* 214  472:getstatic       #379 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple>
	//* 215  475:aconst_null     
	//* 216  476:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//* 217  479:checkcast       #117 <Class ViewGroup>
	//* 218  482:astore_1        
	//* 219  483:goto            448
	//* 220  486:aload_1         
	//* 221  487:checkcast       #381 <Class FitWindowsViewGroup>
	//* 222  490:new             #14  <Class AppCompatDelegateImplV9$3>
	//* 223  493:dup             
	//* 224  494:aload_0         
	//* 225  495:invokespecial   #382 <Method void AppCompatDelegateImplV9$3(AppCompatDelegateImplV9)>
	//* 226  498:invokeinterface #386 <Method void FitWindowsViewGroup.setOnFitSystemWindowsListener(android.support.v7.widget.FitWindowsViewGroup$OnFitSystemWindowsListener)>
	//* 227  503:goto            156
	//* 228  506:aload_0         
	//* 229  507:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 230  510:ifnonnull       527
	//* 231  513:aload_0         
	//* 232  514:aload_1         
	//* 233  515:getstatic       #389 <Field int android.support.v7.appcompat.R$id.title>
	//* 234  518:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//* 235  521:checkcast       #391 <Class TextView>
	//* 236  524:putfield        #393 <Field TextView mTitleView>
	//* 237  527:aload_1         
	//* 238  528:invokestatic    #399 <Method void ViewUtils.makeOptionalFitsSystemWindows(View)>
	//* 239  531:aload_1         
	//* 240  532:getstatic       #402 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
	//* 241  535:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//* 242  538:checkcast       #123 <Class ContentFrameLayout>
	//* 243  541:astore_2        
	//* 244  542:aload_0         
	//* 245  543:getfield        #127 <Field Window mWindow>
	//* 246  546:ldc1            #115 <Int 0x1020002>
	//* 247  548:invokevirtual   #403 <Method View Window.findViewById(int)>
	//* 248  551:checkcast       #117 <Class ViewGroup>
	//* 249  554:astore_3        
	//* 250  555:aload_3         
	//* 251  556:ifnull          613
	//* 252  559:aload_3         
	//* 253  560:invokevirtual   #406 <Method int ViewGroup.getChildCount()>
	//* 254  563:ifle            587
	//* 255  566:aload_3         
	//* 256  567:iconst_0        
	//* 257  568:invokevirtual   #409 <Method View ViewGroup.getChildAt(int)>
	//* 258  571:astore          4
	//* 259  573:aload_3         
	//* 260  574:iconst_0        
	//* 261  575:invokevirtual   #412 <Method void ViewGroup.removeViewAt(int)>
	//* 262  578:aload_2         
	//* 263  579:aload           4
	//* 264  581:invokevirtual   #415 <Method void ContentFrameLayout.addView(View)>
	//* 265  584:goto            559
	//* 266  587:aload_3         
	//* 267  588:iconst_m1       
	//* 268  589:invokevirtual   #418 <Method void ViewGroup.setId(int)>
	//* 269  592:aload_2         
	//* 270  593:ldc1            #115 <Int 0x1020002>
	//* 271  595:invokevirtual   #419 <Method void ContentFrameLayout.setId(int)>
	//* 272  598:aload_3         
	//* 273  599:instanceof      #421 <Class FrameLayout>
	//* 274  602:ifeq            613
	//* 275  605:aload_3         
	//* 276  606:checkcast       #421 <Class FrameLayout>
	//* 277  609:aconst_null     
	//* 278  610:invokevirtual   #425 <Method void FrameLayout.setForeground(android.graphics.drawable.Drawable)>
	//* 279  613:aload_0         
	//* 280  614:getfield        #127 <Field Window mWindow>
	//* 281  617:aload_1         
	//* 282  618:invokevirtual   #428 <Method void Window.setContentView(View)>
	//* 283  621:aload_2         
	//* 284  622:new             #16  <Class AppCompatDelegateImplV9$4>
	//* 285  625:dup             
	//* 286  626:aload_0         
	//* 287  627:invokespecial   #429 <Method void AppCompatDelegateImplV9$4(AppCompatDelegateImplV9)>
	//* 288  630:invokevirtual   #433 <Method void ContentFrameLayout.setAttachListener(android.support.v7.widget.ContentFrameLayout$OnAttachListener)>
	//* 289  633:aload_1         
	//* 290  634:areturn         
			{
				obj = null;
	//  291  635:aconst_null     
	//  292  636:astore_1        
			}
		} else
		{
			if(mOverlayActionMode)
				obj = ((Object) ((ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode, ((ViewGroup) (null)))));
			else
				obj = ((Object) ((ViewGroup)((LayoutInflater) (obj)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple, ((ViewGroup) (null)))));
			if(android.os.Build.VERSION.SDK_INT >= 21)
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
			else
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
		}
		if(obj == null)
			throw new IllegalArgumentException((new StringBuilder()).append("AppCompat does not support the current theme features: { windowActionBar: ").append(mHasActionBar).append(", windowActionBarOverlay: ").append(mOverlayActionBar).append(", android:windowIsFloating: ").append(mIsFloating).append(", windowActionModeOverlay: ").append(mOverlayActionMode).append(", windowNoTitle: ").append(mWindowNoTitle).append(" }").toString());
		if(mDecorContentParent == null)
			mTitleView = (TextView)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.title);
		ViewUtils.makeOptionalFitsSystemWindows(((View) (obj)));
		contentframelayout = (ContentFrameLayout)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content);
		viewgroup = (ViewGroup)mWindow.findViewById(0x1020002);
		if(viewgroup != null)
		{
			View view;
			for(; viewgroup.getChildCount() > 0; contentframelayout.addView(view))
			{
				view = viewgroup.getChildAt(0);
				viewgroup.removeViewAt(0);
			}

			viewgroup.setId(-1);
			contentframelayout.setId(0x1020002);
			if(viewgroup instanceof FrameLayout)
				((FrameLayout)viewgroup).setForeground(((android.graphics.drawable.Drawable) (null)));
		}
		mWindow.setContentView(((View) (obj)));
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
		return ((ViewGroup) (obj));
	//* 293  637:goto            156
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
		boolean flag;
		if(panelfeaturestate.shownPanelView != null)
	//*  30   60:aload_1         
	//*  31   61:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//*  32   64:ifnull          71
			flag = true;
	//   33   67:iconst_1        
	//   34   68:istore_2        
		else
	//*  35   69:iload_2         
	//*  36   70:ireturn         
			flag = false;
	//   37   71:iconst_0        
	//   38   72:istore_2        
		return flag;
	//*  39   73:goto            69
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
		Context context = mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Context mContext>
	//    2    4:astore          4
		if(panelfeaturestate.featureId != 0 && panelfeaturestate.featureId != 108 || mDecorContentParent == null) goto _L2; else goto _L1
	//    3    6:aload_1         
	//    4    7:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//    5   10:ifeq            22
	//    6   13:aload_1         
	//    7   14:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//    8   17:bipush          108
	//    9   19:icmpne          203
	//   10   22:aload_0         
	//   11   23:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   12   26:ifnull          203
_L1:
		Object obj;
		TypedValue typedvalue = new TypedValue();
	//   13   29:new             #314 <Class TypedValue>
	//   14   32:dup             
	//   15   33:invokespecial   #315 <Method void TypedValue()>
	//   16   36:astore          5
		android.content.res.Resources.Theme theme1 = context.getTheme();
	//   17   38:aload           4
	//   18   40:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   19   43:astore          6
		theme1.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedvalue, true);
	//   20   45:aload           6
	//   21   47:getstatic       #324 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//   22   50:aload           5
	//   23   52:iconst_1        
	//   24   53:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   25   56:pop             
		obj = null;
	//   26   57:aconst_null     
	//   27   58:astore_2        
		android.content.res.Resources.Theme theme;
		if(typedvalue.resourceId != 0)
	//*  28   59:aload           5
	//*  29   61:getfield        #333 <Field int TypedValue.resourceId>
	//*  30   64:ifeq            188
		{
			obj = ((Object) (context.getResources().newTheme()));
	//   31   67:aload           4
	//   32   69:invokevirtual   #517 <Method Resources Context.getResources()>
	//   33   72:invokevirtual   #522 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   34   75:astore_2        
			((android.content.res.Resources.Theme) (obj)).setTo(theme1);
	//   35   76:aload_2         
	//   36   77:aload           6
	//   37   79:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
			((android.content.res.Resources.Theme) (obj)).applyStyle(typedvalue.resourceId, true);
	//   38   82:aload_2         
	//   39   83:aload           5
	//   40   85:getfield        #333 <Field int TypedValue.resourceId>
	//   41   88:iconst_1        
	//   42   89:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
			((android.content.res.Resources.Theme) (obj)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//   43   92:aload_2         
	//   44   93:getstatic       #533 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   45   96:aload           5
	//   46   98:iconst_1        
	//   47   99:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   48  102:pop             
		} else
	//*  49  103:aload_2         
	//*  50  104:astore_3        
	//*  51  105:aload           5
	//*  52  107:getfield        #333 <Field int TypedValue.resourceId>
	//*  53  110:ifeq            144
	//*  54  113:aload_2         
	//*  55  114:astore_3        
	//*  56  115:aload_2         
	//*  57  116:ifnonnull       134
	//*  58  119:aload           4
	//*  59  121:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  60  124:invokevirtual   #522 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//*  61  127:astore_3        
	//*  62  128:aload_3         
	//*  63  129:aload           6
	//*  64  131:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//*  65  134:aload_3         
	//*  66  135:aload           5
	//*  67  137:getfield        #333 <Field int TypedValue.resourceId>
	//*  68  140:iconst_1        
	//*  69  141:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
	//*  70  144:aload_3         
	//*  71  145:ifnull          203
	//*  72  148:new             #335 <Class ContextThemeWrapper>
	//*  73  151:dup             
	//*  74  152:aload           4
	//*  75  154:iconst_0        
	//*  76  155:invokespecial   #338 <Method void ContextThemeWrapper(Context, int)>
	//*  77  158:astore_2        
	//*  78  159:aload_2         
	//*  79  160:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  80  163:aload_3         
	//*  81  164:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//*  82  167:new             #535 <Class MenuBuilder>
	//*  83  170:dup             
	//*  84  171:aload_2         
	//*  85  172:invokespecial   #537 <Method void MenuBuilder(Context)>
	//*  86  175:astore_2        
	//*  87  176:aload_2         
	//*  88  177:aload_0         
	//*  89  178:invokevirtual   #541 <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
	//*  90  181:aload_1         
	//*  91  182:aload_2         
	//*  92  183:invokevirtual   #545 <Method void AppCompatDelegateImplV9$PanelFeatureState.setMenu(MenuBuilder)>
	//*  93  186:iconst_1        
	//*  94  187:ireturn         
		{
			theme1.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//   95  188:aload           6
	//   96  190:getstatic       #533 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   97  193:aload           5
	//   98  195:iconst_1        
	//   99  196:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//  100  199:pop             
		}
		theme = ((android.content.res.Resources.Theme) (obj));
		if(typedvalue.resourceId != 0)
		{
			theme = ((android.content.res.Resources.Theme) (obj));
			if(obj == null)
			{
				theme = context.getResources().newTheme();
				theme.setTo(theme1);
			}
			theme.applyStyle(typedvalue.resourceId, true);
		}
		if(theme == null) goto _L2; else goto _L3
_L3:
		obj = ((Object) (new ContextThemeWrapper(context, 0)));
		((Context) (obj)).getTheme().setTo(theme);
_L5:
		obj = ((Object) (new MenuBuilder(((Context) (obj)))));
		((MenuBuilder) (obj)).setCallback(((android.support.v7.view.menu.MenuBuilder.Callback) (this)));
		panelfeaturestate.setMenu(((MenuBuilder) (obj)));
		return true;
	//* 101  200:goto            103
_L2:
		obj = ((Object) (context));
	//  102  203:aload           4
	//  103  205:astore_2        
		if(true) goto _L5; else goto _L4
	//  104  206:goto            167
_L4:
	}

	private void invalidatePanelMenu(int i)
	{
		mInvalidatePanelMenuFeatures = mInvalidatePanelMenuFeatures | 1 << i;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #547 <Field int mInvalidatePanelMenuFeatures>
	//    3    5:iconst_1        
	//    4    6:iload_1         
	//    5    7:ishl            
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
		boolean flag1;
		PanelFeatureState panelfeaturestate;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		if(mActionMode != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #570 <Field ActionMode mActionMode>
	//*   4    7:ifnull          12
			return false;
	//    5   10:iconst_0        
	//    6   11:ireturn         
		panelfeaturestate = getPanelState(i, true);
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:iconst_1        
	//   10   15:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   11   18:astore          5
		if(i != 0 || mDecorContentParent == null || !mDecorContentParent.canShowOverflowMenu() || ViewConfiguration.get(mContext).hasPermanentMenuKey()) goto _L2; else goto _L1
	//   12   20:iload_1         
	//   13   21:ifne            137
	//   14   24:aload_0         
	//   15   25:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   16   28:ifnull          137
	//   17   31:aload_0         
	//   18   32:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   19   35:invokeinterface #573 <Method boolean DecorContentParent.canShowOverflowMenu()>
	//   20   40:ifeq            137
	//   21   43:aload_0         
	//   22   44:getfield        #156 <Field Context mContext>
	//   23   47:invokestatic    #579 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   24   50:invokevirtual   #582 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//   25   53:ifne            137
_L1:
		if(mDecorContentParent.isOverflowMenuShowing()) goto _L4; else goto _L3
	//   26   56:aload_0         
	//   27   57:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   28   60:invokeinterface #585 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//   29   65:ifne            124
_L3:
		if(isDestroyed() || !preparePanel(panelfeaturestate, keyevent)) goto _L6; else goto _L5
	//   30   68:aload_0         
	//   31   69:invokevirtual   #466 <Method boolean isDestroyed()>
	//   32   72:ifne            229
	//   33   75:aload_0         
	//   34   76:aload           5
	//   35   78:aload_2         
	//   36   79:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   37   82:ifeq            229
_L5:
		boolean flag = mDecorContentParent.showOverflowMenu();
	//   38   85:aload_0         
	//   39   86:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   40   89:invokeinterface #588 <Method boolean DecorContentParent.showOverflowMenu()>
	//   41   94:istore_3        
_L8:
		if(flag)
	//*  42   95:iload_3         
	//*  43   96:ifeq            122
		{
			keyevent = ((KeyEvent) ((AudioManager)mContext.getSystemService("audio")));
	//   44   99:aload_0         
	//   45  100:getfield        #156 <Field Context mContext>
	//   46  103:ldc2            #590 <String "audio">
	//   47  106:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//   48  109:checkcast       #596 <Class AudioManager>
	//   49  112:astore_2        
			if(keyevent != null)
	//*  50  113:aload_2         
	//*  51  114:ifnull          216
				((AudioManager) (keyevent)).playSoundEffect(0);
	//   52  117:aload_2         
	//   53  118:iconst_0        
	//   54  119:invokevirtual   #599 <Method void AudioManager.playSoundEffect(int)>
			else
	//*  55  122:iload_3         
	//*  56  123:ireturn         
	//*  57  124:aload_0         
	//*  58  125:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  59  128:invokeinterface #602 <Method boolean DecorContentParent.hideOverflowMenu()>
	//*  60  133:istore_3        
	//*  61  134:goto            95
	//*  62  137:aload           5
	//*  63  139:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  64  142:ifne            153
	//*  65  145:aload           5
	//*  66  147:getfield        #605 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
	//*  67  150:ifeq            169
	//*  68  153:aload           5
	//*  69  155:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  70  158:istore_3        
	//*  71  159:aload_0         
	//*  72  160:aload           5
	//*  73  162:iconst_1        
	//*  74  163:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
	//*  75  166:goto            95
	//*  76  169:aload           5
	//*  77  171:getfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*  78  174:ifeq            229
	//*  79  177:aload           5
	//*  80  179:getfield        #615 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  81  182:ifeq            234
	//*  82  185:aload           5
	//*  83  187:iconst_0        
	//*  84  188:putfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*  85  191:aload_0         
	//*  86  192:aload           5
	//*  87  194:aload_2         
	//*  88  195:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//*  89  198:istore_3        
	//*  90  199:iload_3         
	//*  91  200:ifeq            229
	//*  92  203:aload_0         
	//*  93  204:aload           5
	//*  94  206:aload_2         
	//*  95  207:invokespecial   #619 <Method void openPanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//*  96  210:iload           4
	//*  97  212:istore_3        
	//*  98  213:goto            95
				Log.w("AppCompatDelegate", "Couldn't get audio manager");
	//   99  216:ldc2            #621 <String "AppCompatDelegate">
	//  100  219:ldc2            #623 <String "Couldn't get audio manager">
	//  101  222:invokestatic    #629 <Method int Log.w(String, String)>
	//  102  225:pop             
		}
		return flag;
_L4:
		flag = mDecorContentParent.hideOverflowMenu();
		continue; /* Loop/switch isn't completed */
_L2:
		if(panelfeaturestate.isOpen || panelfeaturestate.isHandled)
		{
			flag = panelfeaturestate.isOpen;
			closePanel(panelfeaturestate, true);
			continue; /* Loop/switch isn't completed */
		}
		if(panelfeaturestate.isPrepared)
		{
			if(panelfeaturestate.refreshMenuContent)
			{
				panelfeaturestate.isPrepared = false;
				flag = preparePanel(panelfeaturestate, keyevent);
			} else
	//* 103  226:goto            122
	//* 104  229:iconst_0        
	//* 105  230:istore_3        
	//* 106  231:goto            95
			{
				flag = true;
	//  107  234:iconst_1        
	//  108  235:istore_3        
			}
			if(flag)
			{
				openPanel(panelfeaturestate, keyevent);
				flag = flag1;
				continue; /* Loop/switch isn't completed */
			}
		}
_L6:
		flag = false;
		if(true) goto _L8; else goto _L7
_L7:
	//* 109  236:goto            199
	}

	private void openPanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
	{
		byte byte0 = -1;
	//    0    0:iconst_m1       
	//    1    1:istore          5
		if(!panelfeaturestate.isOpen && !isDestroyed()) goto _L2; else goto _L1
	//    2    3:aload_1         
	//    3    4:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//    4    7:ifne            17
	//    5   10:aload_0         
	//    6   11:invokevirtual   #466 <Method boolean isDestroyed()>
	//    7   14:ifeq            18
_L1:
		return;
	//    8   17:return          
_L2:
		if(panelfeaturestate.featureId != 0)
			break; /* Loop/switch isn't completed */
	//    9   18:aload_1         
	//   10   19:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   11   22:ifne            76
		Object obj = ((Object) (mContext));
	//   12   25:aload_0         
	//   13   26:getfield        #156 <Field Context mContext>
	//   14   29:astore          6
		boolean flag;
		boolean flag1;
		if((((Context) (obj)).getResources().getConfiguration().screenLayout & 0xf) == 4)
	//*  15   31:aload           6
	//*  16   33:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  17   36:invokevirtual   #633 <Method Configuration Resources.getConfiguration()>
	//*  18   39:getfield        #638 <Field int Configuration.screenLayout>
	//*  19   42:bipush          15
	//*  20   44:iand            
	//*  21   45:iconst_4        
	//*  22   46:icmpne          112
			flag = true;
	//   23   49:iconst_1        
	//   24   50:istore_3        
		else
	//*  25   51:aload           6
	//*  26   53:invokevirtual   #642 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  27   56:getfield        #647 <Field int ApplicationInfo.targetSdkVersion>
	//*  28   59:bipush          11
	//*  29   61:icmplt          117
	//*  30   64:iconst_1        
	//*  31   65:istore          4
	//*  32   67:iload_3         
	//*  33   68:ifeq            76
	//*  34   71:iload           4
	//*  35   73:ifne            17
	//*  36   76:aload_0         
	//*  37   77:invokevirtual   #354 <Method android.view.Window$Callback getWindowCallback()>
	//*  38   80:astore          6
	//*  39   82:aload           6
	//*  40   84:ifnull          123
	//*  41   87:aload           6
	//*  42   89:aload_1         
	//*  43   90:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  44   93:aload_1         
	//*  45   94:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  46   97:invokeinterface #653 <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//*  47  102:ifne            123
	//*  48  105:aload_0         
	//*  49  106:aload_1         
	//*  50  107:iconst_1        
	//*  51  108:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
	//*  52  111:return          
			flag = false;
	//   53  112:iconst_0        
	//   54  113:istore_3        
		if(((Context) (obj)).getApplicationInfo().targetSdkVersion >= 11)
			flag1 = true;
		else
	//*  55  114:goto            51
			flag1 = false;
	//   56  117:iconst_0        
	//   57  118:istore          4
		if(flag && flag1) goto _L1; else goto _L3
_L3:
		WindowManager windowmanager;
		obj = ((Object) (getWindowCallback()));
		if(obj != null && !((android.view.Window.Callback) (obj)).onMenuOpened(panelfeaturestate.featureId, ((Menu) (panelfeaturestate.menu))))
		{
			closePanel(panelfeaturestate, true);
			return;
		}
	//*  58  120:goto            67
		windowmanager = (WindowManager)mContext.getSystemService("window");
	//   59  123:aload_0         
	//   60  124:getfield        #156 <Field Context mContext>
	//   61  127:ldc2            #655 <String "window">
	//   62  130:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//   63  133:checkcast       #657 <Class WindowManager>
	//   64  136:astore          6
		if(windowmanager == null || !preparePanel(panelfeaturestate, keyevent)) goto _L1; else goto _L4
	//   65  138:aload           6
	//   66  140:ifnull          17
	//   67  143:aload_0         
	//   68  144:aload_1         
	//   69  145:aload_2         
	//   70  146:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   71  149:ifeq            17
_L4:
		if(panelfeaturestate.decorView != null && !panelfeaturestate.refreshDecorView) goto _L6; else goto _L5
	//   72  152:aload_1         
	//   73  153:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//   74  156:ifnull          166
	//   75  159:aload_1         
	//   76  160:getfield        #660 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
	//   77  163:ifeq            400
_L5:
		if(panelfeaturestate.decorView != null) goto _L8; else goto _L7
	//   78  166:aload_1         
	//   79  167:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//   80  170:ifnonnull       373
_L7:
		if(!initializePanelDecor(panelfeaturestate) || panelfeaturestate.decorView == null) goto _L1; else goto _L9
	//   81  173:aload_0         
	//   82  174:aload_1         
	//   83  175:invokespecial   #662 <Method boolean initializePanelDecor(AppCompatDelegateImplV9$PanelFeatureState)>
	//   84  178:ifeq            17
	//   85  181:aload_1         
	//   86  182:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//   87  185:ifnull          17
_L9:
		if(!initializePanelContent(panelfeaturestate) || !panelfeaturestate.hasPanelItems()) goto _L1; else goto _L10
	//   88  188:aload_0         
	//   89  189:aload_1         
	//   90  190:invokespecial   #664 <Method boolean initializePanelContent(AppCompatDelegateImplV9$PanelFeatureState)>
	//   91  193:ifeq            17
	//   92  196:aload_1         
	//   93  197:invokevirtual   #667 <Method boolean AppCompatDelegateImplV9$PanelFeatureState.hasPanelItems()>
	//   94  200:ifeq            17
_L10:
		int i;
		keyevent = ((KeyEvent) (panelfeaturestate.shownPanelView.getLayoutParams()));
	//   95  203:aload_1         
	//   96  204:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//   97  207:invokevirtual   #671 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   98  210:astore_2        
		if(keyevent == null)
	//*  99  211:aload_2         
	//* 100  212:ifnonnull       436
			keyevent = ((KeyEvent) (new android.view.ViewGroup.LayoutParams(-2, -2)));
	//  101  215:new             #673 <Class android.view.ViewGroup$LayoutParams>
	//  102  218:dup             
	//  103  219:bipush          -2
	//  104  221:bipush          -2
	//  105  223:invokespecial   #676 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  106  226:astore_2        
		i = panelfeaturestate.background;
	//  107  227:aload_1         
	//  108  228:getfield        #679 <Field int AppCompatDelegateImplV9$PanelFeatureState.background>
	//  109  231:istore_3        
		panelfeaturestate.decorView.setBackgroundResource(i);
	//  110  232:aload_1         
	//  111  233:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  112  236:iload_3         
	//  113  237:invokevirtual   #682 <Method void ViewGroup.setBackgroundResource(int)>
		ViewParent viewparent = panelfeaturestate.shownPanelView.getParent();
	//  114  240:aload_1         
	//  115  241:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  116  244:invokevirtual   #686 <Method ViewParent View.getParent()>
	//  117  247:astore          7
		if(viewparent != null && (viewparent instanceof ViewGroup))
	//* 118  249:aload           7
	//* 119  251:ifnull          274
	//* 120  254:aload           7
	//* 121  256:instanceof      #117 <Class ViewGroup>
	//* 122  259:ifeq            274
			((ViewGroup)viewparent).removeView(panelfeaturestate.shownPanelView);
	//  123  262:aload           7
	//  124  264:checkcast       #117 <Class ViewGroup>
	//  125  267:aload_1         
	//  126  268:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  127  271:invokevirtual   #689 <Method void ViewGroup.removeView(View)>
		panelfeaturestate.decorView.addView(panelfeaturestate.shownPanelView, ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  128  274:aload_1         
	//  129  275:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  130  278:aload_1         
	//  131  279:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  132  282:aload_2         
	//  133  283:invokevirtual   #692 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		if(!panelfeaturestate.shownPanelView.hasFocus())
	//* 134  286:aload_1         
	//* 135  287:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//* 136  290:invokevirtual   #695 <Method boolean View.hasFocus()>
	//* 137  293:ifne            304
			panelfeaturestate.shownPanelView.requestFocus();
	//  138  296:aload_1         
	//  139  297:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  140  300:invokevirtual   #698 <Method boolean View.requestFocus()>
	//  141  303:pop             
		i = -2;
	//  142  304:bipush          -2
	//  143  306:istore_3        
_L14:
		panelfeaturestate.isHandled = false;
	//  144  307:aload_1         
	//  145  308:iconst_0        
	//  146  309:putfield        #605 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
		keyevent = ((KeyEvent) (new android.view.WindowManager.LayoutParams(i, -2, panelfeaturestate.x, panelfeaturestate.y, 1002, 0x820000, -3)));
	//  147  312:new             #700 <Class android.view.WindowManager$LayoutParams>
	//  148  315:dup             
	//  149  316:iload_3         
	//  150  317:bipush          -2
	//  151  319:aload_1         
	//  152  320:getfield        #703 <Field int AppCompatDelegateImplV9$PanelFeatureState.x>
	//  153  323:aload_1         
	//  154  324:getfield        #706 <Field int AppCompatDelegateImplV9$PanelFeatureState.y>
	//  155  327:sipush          1002
	//  156  330:ldc2            #707 <Int 0x820000>
	//  157  333:bipush          -3
	//  158  335:invokespecial   #710 <Method void android.view.WindowManager$LayoutParams(int, int, int, int, int, int, int)>
	//  159  338:astore_2        
		keyevent.gravity = panelfeaturestate.gravity;
	//  160  339:aload_2         
	//  161  340:aload_1         
	//  162  341:getfield        #509 <Field int AppCompatDelegateImplV9$PanelFeatureState.gravity>
	//  163  344:putfield        #711 <Field int android.view.WindowManager$LayoutParams.gravity>
		keyevent.windowAnimations = panelfeaturestate.windowAnimations;
	//  164  347:aload_2         
	//  165  348:aload_1         
	//  166  349:getfield        #714 <Field int AppCompatDelegateImplV9$PanelFeatureState.windowAnimations>
	//  167  352:putfield        #715 <Field int android.view.WindowManager$LayoutParams.windowAnimations>
		windowmanager.addView(((View) (panelfeaturestate.decorView)), ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  168  355:aload           6
	//  169  357:aload_1         
	//  170  358:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  171  361:aload_2         
	//  172  362:invokeinterface #716 <Method void WindowManager.addView(View, android.view.ViewGroup$LayoutParams)>
		panelfeaturestate.isOpen = true;
	//  173  367:aload_1         
	//  174  368:iconst_1        
	//  175  369:putfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
		return;
	//  176  372:return          
_L8:
		if(panelfeaturestate.refreshDecorView && panelfeaturestate.decorView.getChildCount() > 0)
	//* 177  373:aload_1         
	//* 178  374:getfield        #660 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
	//* 179  377:ifeq            188
	//* 180  380:aload_1         
	//* 181  381:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//* 182  384:invokevirtual   #406 <Method int ViewGroup.getChildCount()>
	//* 183  387:ifle            188
			panelfeaturestate.decorView.removeAllViews();
	//  184  390:aload_1         
	//  185  391:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  186  394:invokevirtual   #719 <Method void ViewGroup.removeAllViews()>
		  goto _L9
	//* 187  397:goto            188
_L6:
		if(panelfeaturestate.createdPanelView == null) goto _L12; else goto _L11
	//  188  400:aload_1         
	//  189  401:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//  190  404:ifnull          430
_L11:
		keyevent = ((KeyEvent) (panelfeaturestate.createdPanelView.getLayoutParams()));
	//  191  407:aload_1         
	//  192  408:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//  193  411:invokevirtual   #671 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  194  414:astore_2        
		if(keyevent == null) goto _L12; else goto _L13
	//  195  415:aload_2         
	//  196  416:ifnull          430
_L13:
		i = ((int) (byte0));
	//  197  419:iload           5
	//  198  421:istore_3        
		if(((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1) goto _L14; else goto _L12
	//  199  422:aload_2         
	//  200  423:getfield        #722 <Field int android.view.ViewGroup$LayoutParams.width>
	//  201  426:iconst_m1       
	//  202  427:icmpeq          307
_L12:
		i = -2;
	//  203  430:bipush          -2
	//  204  432:istore_3        
		  goto _L14
	//* 205  433:goto            307
	//* 206  436:goto            227
	}

	private boolean performPanelShortcut(PanelFeatureState panelfeaturestate, int i, KeyEvent keyevent, int j)
	{
		boolean flag;
		boolean flag2;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		flag = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		if(!keyevent.isSystem()) goto _L2; else goto _L1
	//    4    6:aload_3         
	//    5    7:invokevirtual   #727 <Method boolean KeyEvent.isSystem()>
	//    6   10:ifeq            20
_L1:
		flag2 = flag;
	//    7   13:iload           5
	//    8   15:istore          6
_L4:
		return flag2;
	//    9   17:iload           6
	//   10   19:ireturn         
_L2:
		boolean flag1;
label0:
		{
			if(!panelfeaturestate.isPrepared)
	//*  11   20:aload_1         
	//*  12   21:getfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*  13   24:ifne            40
			{
				flag1 = flag2;
	//   14   27:iload           6
	//   15   29:istore          5
				if(!preparePanel(panelfeaturestate, keyevent))
					break label0;
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:aload_3         
	//   19   34:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   20   37:ifeq            64
			}
			flag1 = flag2;
	//   21   40:iload           6
	//   22   42:istore          5
			if(panelfeaturestate.menu != null)
	//*  23   44:aload_1         
	//*  24   45:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  25   48:ifnull          64
				flag1 = panelfeaturestate.menu.performShortcut(i, keyevent, j);
	//   26   51:aload_1         
	//   27   52:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   28   55:iload_2         
	//   29   56:aload_3         
	//   30   57:iload           4
	//   31   59:invokevirtual   #731 <Method boolean MenuBuilder.performShortcut(int, KeyEvent, int)>
	//   32   62:istore          5
		}
		flag2 = flag1;
	//   33   64:iload           5
	//   34   66:istore          6
		if(flag1)
	//*  35   68:iload           5
	//*  36   70:ifeq            17
		{
			flag2 = flag1;
	//   37   73:iload           5
	//   38   75:istore          6
			if((j & 1) == 0)
	//*  39   77:iload           4
	//*  40   79:iconst_1        
	//*  41   80:iand            
	//*  42   81:ifne            17
			{
				flag2 = flag1;
	//   43   84:iload           5
	//   44   86:istore          6
				if(mDecorContentParent == null)
	//*  45   88:aload_0         
	//*  46   89:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  47   92:ifnonnull       17
				{
					closePanel(panelfeaturestate, true);
	//   48   95:aload_0         
	//   49   96:aload_1         
	//   50   97:iconst_1        
	//   51   98:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
					return flag1;
	//   52  101:iload           5
	//   53  103:ireturn         
				}
			}
		}
		if(true) goto _L4; else goto _L3
_L3:
	}

	private boolean preparePanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
	{
		if(!isDestroyed()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #466 <Method boolean isDestroyed()>
	//    2    4:ifeq            9
_L1:
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
_L2:
		int i;
		android.view.Window.Callback callback;
		if(panelfeaturestate.isPrepared)
	//*   5    9:aload_1         
	//*   6   10:getfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*   7   13:ifeq            18
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(mPreparedPanel != null && mPreparedPanel != panelfeaturestate)
	//*  10   18:aload_0         
	//*  11   19:getfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  12   22:ifnull          42
	//*  13   25:aload_0         
	//*  14   26:getfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  15   29:aload_1         
	//*  16   30:if_acmpeq       42
			closePanel(mPreparedPanel, false);
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		callback = getWindowCallback();
	//   22   42:aload_0         
	//   23   43:invokevirtual   #354 <Method android.view.Window$Callback getWindowCallback()>
	//   24   46:astore          5
		if(callback != null)
	//*  25   48:aload           5
	//*  26   50:ifnull          68
			panelfeaturestate.createdPanelView = callback.onCreatePanelView(panelfeaturestate.featureId);
	//   27   53:aload_1         
	//   28   54:aload           5
	//   29   56:aload_1         
	//   30   57:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   31   60:invokeinterface #736 <Method View android.view.Window$Callback.onCreatePanelView(int)>
	//   32   65:putfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
		if(panelfeaturestate.featureId == 0 || panelfeaturestate.featureId == 108)
	//*  33   68:aload_1         
	//*  34   69:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  35   72:ifeq            84
	//*  36   75:aload_1         
	//*  37   76:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  38   79:bipush          108
	//*  39   81:icmpne          267
			i = 1;
	//   40   84:iconst_1        
	//   41   85:istore_3        
		else
	//*  42   86:iload_3         
	//*  43   87:ifeq            106
	//*  44   90:aload_0         
	//*  45   91:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  46   94:ifnull          106
	//*  47   97:aload_0         
	//*  48   98:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  49  101:invokeinterface #739 <Method void DecorContentParent.setMenuPrepared()>
	//*  50  106:aload_1         
	//*  51  107:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//*  52  110:ifnonnull       407
	//*  53  113:iload_3         
	//*  54  114:ifeq            127
	//*  55  117:aload_0         
	//*  56  118:invokevirtual   #743 <Method ActionBar peekSupportActionBar()>
	//*  57  121:instanceof      #745 <Class ToolbarActionBar>
	//*  58  124:ifne            407
	//*  59  127:aload_1         
	//*  60  128:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  61  131:ifnull          141
	//*  62  134:aload_1         
	//*  63  135:getfield        #615 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  64  138:ifeq            277
	//*  65  141:aload_1         
	//*  66  142:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  67  145:ifnonnull       163
	//*  68  148:aload_0         
	//*  69  149:aload_1         
	//*  70  150:invokespecial   #747 <Method boolean initializePanelMenu(AppCompatDelegateImplV9$PanelFeatureState)>
	//*  71  153:ifeq            7
	//*  72  156:aload_1         
	//*  73  157:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  74  160:ifnull          7
	//*  75  163:iload_3         
	//*  76  164:ifeq            210
	//*  77  167:aload_0         
	//*  78  168:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  79  171:ifnull          210
	//*  80  174:aload_0         
	//*  81  175:getfield        #749 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//*  82  178:ifnonnull       193
	//*  83  181:aload_0         
	//*  84  182:new             #24  <Class AppCompatDelegateImplV9$ActionMenuPresenterCallback>
	//*  85  185:dup             
	//*  86  186:aload_0         
	//*  87  187:invokespecial   #750 <Method void AppCompatDelegateImplV9$ActionMenuPresenterCallback(AppCompatDelegateImplV9)>
	//*  88  190:putfield        #749 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//*  89  193:aload_0         
	//*  90  194:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  91  197:aload_1         
	//*  92  198:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  93  201:aload_0         
	//*  94  202:getfield        #749 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//*  95  205:invokeinterface #753 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
	//*  96  210:aload_1         
	//*  97  211:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  98  214:invokevirtual   #756 <Method void MenuBuilder.stopDispatchingItemsChanged()>
	//*  99  217:aload           5
	//* 100  219:aload_1         
	//* 101  220:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//* 102  223:aload_1         
	//* 103  224:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//* 104  227:invokeinterface #759 <Method boolean android.view.Window$Callback.onCreatePanelMenu(int, Menu)>
	//* 105  232:ifne            272
	//* 106  235:aload_1         
	//* 107  236:aconst_null     
	//* 108  237:invokevirtual   #545 <Method void AppCompatDelegateImplV9$PanelFeatureState.setMenu(MenuBuilder)>
	//* 109  240:iload_3         
	//* 110  241:ifeq            7
	//* 111  244:aload_0         
	//* 112  245:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 113  248:ifnull          7
	//* 114  251:aload_0         
	//* 115  252:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 116  255:aconst_null     
	//* 117  256:aload_0         
	//* 118  257:getfield        #749 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//* 119  260:invokeinterface #753 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
	//* 120  265:iconst_0        
	//* 121  266:ireturn         
			i = 0;
	//  122  267:iconst_0        
	//  123  268:istore_3        
		if(i && mDecorContentParent != null)
			mDecorContentParent.setMenuPrepared();
		if(panelfeaturestate.createdPanelView != null || i && (peekSupportActionBar() instanceof ToolbarActionBar))
			break MISSING_BLOCK_LABEL_407;
		if(panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent)
			break MISSING_BLOCK_LABEL_277;
		if(panelfeaturestate.menu == null && (!initializePanelMenu(panelfeaturestate) || panelfeaturestate.menu == null))
			continue; /* Loop/switch isn't completed */
		if(i && mDecorContentParent != null)
		{
			if(mActionMenuPresenterCallback == null)
				mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
			mDecorContentParent.setMenu(((Menu) (panelfeaturestate.menu)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
		}
		panelfeaturestate.menu.stopDispatchingItemsChanged();
		if(callback.onCreatePanelMenu(panelfeaturestate.featureId, ((Menu) (panelfeaturestate.menu))))
			break; /* Loop/switch isn't completed */
		panelfeaturestate.setMenu(((MenuBuilder) (null)));
		if(i && mDecorContentParent != null)
		{
			mDecorContentParent.setMenu(((Menu) (null)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
			return false;
		}
		if(true) goto _L1; else goto _L3
	//* 124  269:goto            86
_L3:
		panelfeaturestate.refreshMenuContent = false;
	//  125  272:aload_1         
	//  126  273:iconst_0        
	//  127  274:putfield        #615 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
		panelfeaturestate.menu.stopDispatchingItemsChanged();
	//  128  277:aload_1         
	//  129  278:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  130  281:invokevirtual   #756 <Method void MenuBuilder.stopDispatchingItemsChanged()>
		if(panelfeaturestate.frozenActionViewState != null)
	//* 131  284:aload_1         
	//* 132  285:getfield        #763 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
	//* 133  288:ifnull          307
		{
			panelfeaturestate.menu.restoreActionViewStates(panelfeaturestate.frozenActionViewState);
	//  134  291:aload_1         
	//  135  292:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  136  295:aload_1         
	//  137  296:getfield        #763 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
	//  138  299:invokevirtual   #767 <Method void MenuBuilder.restoreActionViewStates(Bundle)>
			panelfeaturestate.frozenActionViewState = null;
	//  139  302:aload_1         
	//  140  303:aconst_null     
	//  141  304:putfield        #763 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
		}
		if(!callback.onPreparePanel(0, panelfeaturestate.createdPanelView, ((Menu) (panelfeaturestate.menu))))
	//* 142  307:aload           5
	//* 143  309:iconst_0        
	//* 144  310:aload_1         
	//* 145  311:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//* 146  314:aload_1         
	//* 147  315:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//* 148  318:invokeinterface #771 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//* 149  323:ifne            360
		{
			if(i && mDecorContentParent != null)
	//* 150  326:iload_3         
	//* 151  327:ifeq            351
	//* 152  330:aload_0         
	//* 153  331:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 154  334:ifnull          351
				mDecorContentParent.setMenu(((Menu) (null)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//  155  337:aload_0         
	//  156  338:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//  157  341:aconst_null     
	//  158  342:aload_0         
	//  159  343:getfield        #749 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  160  346:invokeinterface #753 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
			panelfeaturestate.menu.startDispatchingItemsChanged();
	//  161  351:aload_1         
	//  162  352:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  163  355:invokevirtual   #774 <Method void MenuBuilder.startDispatchingItemsChanged()>
			return false;
	//  164  358:iconst_0        
	//  165  359:ireturn         
		}
		boolean flag;
		if(keyevent != null)
	//* 166  360:aload_2         
	//* 167  361:ifnull          424
			i = keyevent.getDeviceId();
	//  168  364:aload_2         
	//  169  365:invokevirtual   #777 <Method int KeyEvent.getDeviceId()>
	//  170  368:istore_3        
		else
	//* 171  369:iload_3         
	//* 172  370:invokestatic    #783 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//* 173  373:invokevirtual   #786 <Method int KeyCharacterMap.getKeyboardType()>
	//* 174  376:iconst_1        
	//* 175  377:icmpeq          429
	//* 176  380:iconst_1        
	//* 177  381:istore          4
	//* 178  383:aload_1         
	//* 179  384:iload           4
	//* 180  386:putfield        #789 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.qwertyMode>
	//* 181  389:aload_1         
	//* 182  390:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//* 183  393:aload_1         
	//* 184  394:getfield        #789 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.qwertyMode>
	//* 185  397:invokevirtual   #793 <Method void MenuBuilder.setQwertyMode(boolean)>
	//* 186  400:aload_1         
	//* 187  401:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//* 188  404:invokevirtual   #774 <Method void MenuBuilder.startDispatchingItemsChanged()>
	//* 189  407:aload_1         
	//* 190  408:iconst_1        
	//* 191  409:putfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//* 192  412:aload_1         
	//* 193  413:iconst_0        
	//* 194  414:putfield        #605 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
	//* 195  417:aload_0         
	//* 196  418:aload_1         
	//* 197  419:putfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//* 198  422:iconst_1        
	//* 199  423:ireturn         
			i = -1;
	//  200  424:iconst_m1       
	//  201  425:istore_3        
		if(KeyCharacterMap.load(i).getKeyboardType() != 1)
			flag = true;
		else
	//* 202  426:goto            369
			flag = false;
	//  203  429:iconst_0        
	//  204  430:istore          4
		panelfeaturestate.qwertyMode = flag;
		panelfeaturestate.menu.setQwertyMode(panelfeaturestate.qwertyMode);
		panelfeaturestate.menu.startDispatchingItemsChanged();
		panelfeaturestate.isPrepared = true;
		panelfeaturestate.isHandled = false;
		mPreparedPanel = panelfeaturestate;
		return true;
	//* 205  432:goto            383
	}

	private void reopenMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(mDecorContentParent == null || !mDecorContentParent.canShowOverflowMenu() || ViewConfiguration.get(mContext).hasPermanentMenuKey() && !mDecorContentParent.isOverflowMenuShowPending())
			break MISSING_BLOCK_LABEL_214;
	//    0    0:aload_0         
	//    1    1:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//    2    4:ifnull          214
	//    3    7:aload_0         
	//    4    8:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//    5   11:invokeinterface #573 <Method boolean DecorContentParent.canShowOverflowMenu()>
	//    6   16:ifeq            214
	//    7   19:aload_0         
	//    8   20:getfield        #156 <Field Context mContext>
	//    9   23:invokestatic    #579 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   10   26:invokevirtual   #582 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//   11   29:ifeq            44
	//   12   32:aload_0         
	//   13   33:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   14   36:invokeinterface #798 <Method boolean DecorContentParent.isOverflowMenuShowPending()>
	//   15   41:ifeq            214
		menubuilder = ((MenuBuilder) (getWindowCallback()));
	//   16   44:aload_0         
	//   17   45:invokevirtual   #354 <Method android.view.Window$Callback getWindowCallback()>
	//   18   48:astore_1        
		if(mDecorContentParent.isOverflowMenuShowing() && flag) goto _L2; else goto _L1
	//   19   49:aload_0         
	//   20   50:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   21   53:invokeinterface #585 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//   22   58:ifeq            65
	//   23   61:iload_2         
	//   24   62:ifne            179
_L1:
		if(menubuilder != null && !isDestroyed())
	//*  25   65:aload_1         
	//*  26   66:ifnull          178
	//*  27   69:aload_0         
	//*  28   70:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  29   73:ifne            178
		{
			if(mInvalidatePanelMenuPosted && (mInvalidatePanelMenuFeatures & 1) != 0)
	//*  30   76:aload_0         
	//*  31   77:getfield        #549 <Field boolean mInvalidatePanelMenuPosted>
	//*  32   80:ifeq            116
	//*  33   83:aload_0         
	//*  34   84:getfield        #547 <Field int mInvalidatePanelMenuFeatures>
	//*  35   87:iconst_1        
	//*  36   88:iand            
	//*  37   89:ifeq            116
			{
				mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
	//   38   92:aload_0         
	//   39   93:getfield        #127 <Field Window mWindow>
	//   40   96:invokevirtual   #133 <Method View Window.getDecorView()>
	//   41   99:aload_0         
	//   42  100:getfield        #111 <Field Runnable mInvalidatePanelMenuRunnable>
	//   43  103:invokevirtual   #802 <Method boolean View.removeCallbacks(Runnable)>
	//   44  106:pop             
				mInvalidatePanelMenuRunnable.run();
	//   45  107:aload_0         
	//   46  108:getfield        #111 <Field Runnable mInvalidatePanelMenuRunnable>
	//   47  111:invokeinterface #807 <Method void Runnable.run()>
			}
			PanelFeatureState panelfeaturestate = getPanelState(0, true);
	//   48  116:aload_0         
	//   49  117:iconst_0        
	//   50  118:iconst_1        
	//   51  119:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   52  122:astore_3        
			if(panelfeaturestate.menu != null && !panelfeaturestate.refreshMenuContent && ((android.view.Window.Callback) (menubuilder)).onPreparePanel(0, panelfeaturestate.createdPanelView, ((Menu) (panelfeaturestate.menu))))
	//*  53  123:aload_3         
	//*  54  124:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  55  127:ifnull          178
	//*  56  130:aload_3         
	//*  57  131:getfield        #615 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  58  134:ifne            178
	//*  59  137:aload_1         
	//*  60  138:iconst_0        
	//*  61  139:aload_3         
	//*  62  140:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//*  63  143:aload_3         
	//*  64  144:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  65  147:invokeinterface #771 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//*  66  152:ifeq            178
			{
				((android.view.Window.Callback) (menubuilder)).onMenuOpened(108, ((Menu) (panelfeaturestate.menu)));
	//   67  155:aload_1         
	//   68  156:bipush          108
	//   69  158:aload_3         
	//   70  159:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   71  162:invokeinterface #653 <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//   72  167:pop             
				mDecorContentParent.showOverflowMenu();
	//   73  168:aload_0         
	//   74  169:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   75  172:invokeinterface #588 <Method boolean DecorContentParent.showOverflowMenu()>
	//   76  177:pop             
			}
		}
_L4:
		return;
	//   77  178:return          
_L2:
		mDecorContentParent.hideOverflowMenu();
	//   78  179:aload_0         
	//   79  180:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   80  183:invokeinterface #602 <Method boolean DecorContentParent.hideOverflowMenu()>
	//   81  188:pop             
		if(isDestroyed()) goto _L4; else goto _L3
	//   82  189:aload_0         
	//   83  190:invokevirtual   #466 <Method boolean isDestroyed()>
	//   84  193:ifne            178
_L3:
		((android.view.Window.Callback) (menubuilder)).onPanelClosed(108, ((Menu) (getPanelState(0, true).menu)));
	//   85  196:aload_1         
	//   86  197:bipush          108
	//   87  199:aload_0         
	//   88  200:iconst_0        
	//   89  201:iconst_1        
	//   90  202:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   91  205:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   92  208:invokeinterface #811 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
		return;
	//   93  213:return          
		menubuilder = ((MenuBuilder) (getPanelState(0, true)));
	//   94  214:aload_0         
	//   95  215:iconst_0        
	//   96  216:iconst_1        
	//   97  217:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   98  220:astore_1        
		menubuilder.refreshDecorView = true;
	//   99  221:aload_1         
	//  100  222:iconst_1        
	//  101  223:putfield        #660 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
		closePanel(((PanelFeatureState) (menubuilder)), false);
	//  102  226:aload_0         
	//  103  227:aload_1         
	//  104  228:iconst_0        
	//  105  229:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		openPanel(((PanelFeatureState) (menubuilder)), ((KeyEvent) (null)));
	//  106  232:aload_0         
	//  107  233:aload_1         
	//  108  234:aconst_null     
	//  109  235:invokespecial   #619 <Method void openPanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
		return;
	//  110  238:return          
	}

	private int sanitizeWindowFeatureId(int i)
	{
		int j;
		if(i == 8)
	//*   0    0:iload_1         
	//*   1    1:bipush          8
	//*   2    3:icmpne          21
		{
			Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
	//    3    6:ldc2            #621 <String "AppCompatDelegate">
	//    4    9:ldc2            #815 <String "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.">
	//    5   12:invokestatic    #818 <Method int Log.i(String, String)>
	//    6   15:pop             
			j = 108;
	//    7   16:bipush          108
	//    8   18:istore_2        
		} else
	//*   9   19:iload_2         
	//*  10   20:ireturn         
		{
			j = i;
	//   11   21:iload_1         
	//   12   22:istore_2        
			if(i == 9)
	//*  13   23:iload_1         
	//*  14   24:bipush          9
	//*  15   26:icmpne          19
			{
				Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
	//   16   29:ldc2            #621 <String "AppCompatDelegate">
	//   17   32:ldc2            #820 <String "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.">
	//   18   35:invokestatic    #818 <Method int Log.i(String, String)>
	//   19   38:pop             
				return 109;
	//   20   39:bipush          109
	//   21   41:ireturn         
			}
		}
		return j;
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
			if(viewparent == view || !(viewparent instanceof View) || ViewCompat.isAttachedToWindow((View)viewparent))
	//*  12   20:aload_1         
	//*  13   21:aload_2         
	//*  14   22:if_acmpeq       42
	//*  15   25:aload_1         
	//*  16   26:instanceof      #135 <Class View>
	//*  17   29:ifeq            42
	//*  18   32:aload_1         
	//*  19   33:checkcast       #135 <Class View>
	//*  20   36:invokestatic    #826 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  21   39:ifeq            44
				return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
			viewparent = viewparent.getParent();
	//   24   44:aload_1         
	//   25   45:invokeinterface #829 <Method ViewParent ViewParent.getParent()>
	//   26   50:astore_1        
		} while(true);
	//   27   51:goto            14
	}

	private void throwFeatureRequestIfSubDecorInstalled()
	{
		if(mSubDecorInstalled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #436 <Field boolean mSubDecorInstalled>
	//*   2    4:ifeq            18
			throw new AndroidRuntimeException("Window feature must be requested before adding content");
	//    3    7:new             #832 <Class AndroidRuntimeException>
	//    4   10:dup             
	//    5   11:ldc2            #834 <String "Window feature must be requested before adding content">
	//    6   14:invokespecial   #835 <Method void AndroidRuntimeException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #838 <Method void ensureSubDecor()>
		((ViewGroup)mSubDecor.findViewById(0x1020002)).addView(view, layoutparams);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:invokevirtual   #692 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		mOriginalWindowCallback.onContentChanged();
	//   10   21:aload_0         
	//   11   22:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   12   25:invokeinterface #845 <Method void android.view.Window$Callback.onContentChanged()>
	//   13   30:return          
	}

	View callActivityOnCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		if(mOriginalWindowCallback instanceof android.view.LayoutInflater.Factory)
	//*   0    0:aload_0         
	//*   1    1:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #849 <Class android.view.LayoutInflater$Factory>
	//*   3    7:ifeq            33
		{
			view = ((android.view.LayoutInflater.Factory)mOriginalWindowCallback).onCreateView(s, context, attributeset);
	//    4   10:aload_0         
	//    5   11:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//    6   14:checkcast       #849 <Class android.view.LayoutInflater$Factory>
	//    7   17:aload_2         
	//    8   18:aload_3         
	//    9   19:aload           4
	//   10   21:invokeinterface #853 <Method View android.view.LayoutInflater$Factory.onCreateView(String, Context, AttributeSet)>
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
	//*  18   29:getfield        #857 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
	//*  19   32:arraylength     
	//*  20   33:icmpge          44
						panelfeaturestate1 = mPanels[i];
	//   21   36:aload_0         
	//   22   37:getfield        #857 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
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
		while(panelfeaturestate2 != null && !panelfeaturestate2.isOpen || isDestroyed()) 
	//*  37   67:aload           5
	//*  38   69:ifnull          81
	//*  39   72:aload           5
	//*  40   74:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  41   77:ifne            81
			return;
	//   42   80:return          
	//   43   81:aload_0         
	//   44   82:invokevirtual   #466 <Method boolean isDestroyed()>
	//   45   85:ifne            80
		mOriginalWindowCallback.onPanelClosed(i, ((Menu) (obj)));
	//   46   88:aload_0         
	//   47   89:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   48   92:iload_1         
	//   49   93:aload           6
	//   50   95:invokeinterface #811 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
	//   51  100:return          
	}

	void checkCloseActionMenu(MenuBuilder menubuilder)
	{
		if(mClosingActionMenu)
	//*   0    0:aload_0         
	//*   1    1:getfield        #860 <Field boolean mClosingActionMenu>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mClosingActionMenu = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #860 <Field boolean mClosingActionMenu>
		mDecorContentParent.dismissPopups();
	//    7   13:aload_0         
	//    8   14:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//    9   17:invokeinterface #863 <Method void DecorContentParent.dismissPopups()>
		android.view.Window.Callback callback = getWindowCallback();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #354 <Method android.view.Window$Callback getWindowCallback()>
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
	//   21   42:invokeinterface #811 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
		mClosingActionMenu = false;
	//   22   47:aload_0         
	//   23   48:iconst_0        
	//   24   49:putfield        #860 <Field boolean mClosingActionMenu>
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
	//    6    8:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
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
	//*   6   12:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*   7   15:ifnull          39
	//*   8   18:aload_0         
	//*   9   19:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  10   22:invokeinterface #585 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  11   27:ifeq            39
		{
			checkCloseActionMenu(panelfeaturestate.menu);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   15   35:invokevirtual   #865 <Method void checkCloseActionMenu(MenuBuilder)>
		} else
	//*  16   38:return          
		{
			WindowManager windowmanager = (WindowManager)mContext.getSystemService("window");
	//   17   39:aload_0         
	//   18   40:getfield        #156 <Field Context mContext>
	//   19   43:ldc2            #655 <String "window">
	//   20   46:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//   21   49:checkcast       #657 <Class WindowManager>
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
	//   34   76:invokeinterface #866 <Method void WindowManager.removeView(View)>
				if(flag)
	//*  35   81:iload_2         
	//*  36   82:ifeq            95
					callOnPanelClosed(panelfeaturestate.featureId, panelfeaturestate, ((Menu) (null)));
	//   37   85:aload_0         
	//   38   86:aload_1         
	//   39   87:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   40   90:aload_1         
	//   41   91:aconst_null     
	//   42   92:invokevirtual   #868 <Method void callOnPanelClosed(int, AppCompatDelegateImplV9$PanelFeatureState, Menu)>
			}
			panelfeaturestate.isPrepared = false;
	//   43   95:aload_1         
	//   44   96:iconst_0        
	//   45   97:putfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
			panelfeaturestate.isHandled = false;
	//   46  100:aload_1         
	//   47  101:iconst_0        
	//   48  102:putfield        #605 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
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
	//   57  117:putfield        #660 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
			if(mPreparedPanel == panelfeaturestate)
	//*  58  120:aload_0         
	//*  59  121:getfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  60  124:aload_1         
	//*  61  125:if_acmpne       38
			{
				mPreparedPanel = null;
	//   62  128:aload_0         
	//   63  129:aconst_null     
	//   64  130:putfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
				return;
	//   65  133:return          
			}
		}
	}

	public View createView(View view, String s, Context context, AttributeSet attributeset)
	{
		if(mAppCompatViewInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #872 <Field AppCompatViewInflater mAppCompatViewInflater>
	//*   2    4:ifnonnull       18
			mAppCompatViewInflater = new AppCompatViewInflater();
	//    3    7:aload_0         
	//    4    8:new             #874 <Class AppCompatViewInflater>
	//    5   11:dup             
	//    6   12:invokespecial   #875 <Method void AppCompatViewInflater()>
	//    7   15:putfield        #872 <Field AppCompatViewInflater mAppCompatViewInflater>
		boolean flag;
		if(IS_PRE_LOLLIPOP)
	//*   8   18:getstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//*   9   21:ifeq            90
		{
			if(attributeset instanceof XmlPullParser)
	//*  10   24:aload           4
	//*  11   26:instanceof      #877 <Class XmlPullParser>
	//*  12   29:ifeq            77
			{
				if(((XmlPullParser)attributeset).getDepth() > 1)
	//*  13   32:aload           4
	//*  14   34:checkcast       #877 <Class XmlPullParser>
	//*  15   37:invokeinterface #880 <Method int XmlPullParser.getDepth()>
	//*  16   42:iconst_1        
	//*  17   43:icmple          71
					flag = true;
	//   18   46:iconst_1        
	//   19   47:istore          5
				else
	//*  20   49:aload_0         
	//*  21   50:getfield        #872 <Field AppCompatViewInflater mAppCompatViewInflater>
	//*  22   53:aload_1         
	//*  23   54:aload_2         
	//*  24   55:aload_3         
	//*  25   56:aload           4
	//*  26   58:iload           5
	//*  27   60:getstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//*  28   63:iconst_1        
	//*  29   64:invokestatic    #885 <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//*  30   67:invokevirtual   #888 <Method View AppCompatViewInflater.createView(View, String, Context, AttributeSet, boolean, boolean, boolean, boolean)>
	//*  31   70:areturn         
					flag = false;
	//   32   71:iconst_0        
	//   33   72:istore          5
			} else
	//*  34   74:goto            49
			{
				flag = shouldInheritContext((ViewParent)view);
	//   35   77:aload_0         
	//   36   78:aload_1         
	//   37   79:checkcast       #828 <Class ViewParent>
	//   38   82:invokespecial   #890 <Method boolean shouldInheritContext(ViewParent)>
	//   39   85:istore          5
			}
		} else
	//*  40   87:goto            49
		{
			flag = false;
	//   41   90:iconst_0        
	//   42   91:istore          5
		}
		return mAppCompatViewInflater.createView(view, s, context, attributeset, flag, IS_PRE_LOLLIPOP, true, VectorEnabledTintResources.shouldBeUsed());
	//*  43   93:goto            49
	}

	void dismissPopups()
	{
		if(mDecorContentParent != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*   2    4:ifnull          16
			mDecorContentParent.dismissPopups();
	//    3    7:aload_0         
	//    4    8:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//    5   11:invokeinterface #863 <Method void DecorContentParent.dismissPopups()>
		if(mActionModePopup != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #893 <Field PopupWindow mActionModePopup>
	//*   8   20:ifnull          60
		{
			mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
	//    9   23:aload_0         
	//   10   24:getfield        #127 <Field Window mWindow>
	//   11   27:invokevirtual   #133 <Method View Window.getDecorView()>
	//   12   30:aload_0         
	//   13   31:getfield        #895 <Field Runnable mShowActionModePopup>
	//   14   34:invokevirtual   #802 <Method boolean View.removeCallbacks(Runnable)>
	//   15   37:pop             
			PanelFeatureState panelfeaturestate;
			if(mActionModePopup.isShowing())
	//*  16   38:aload_0         
	//*  17   39:getfield        #893 <Field PopupWindow mActionModePopup>
	//*  18   42:invokevirtual   #900 <Method boolean PopupWindow.isShowing()>
	//*  19   45:ifeq            55
				try
				{
					mActionModePopup.dismiss();
	//   20   48:aload_0         
	//   21   49:getfield        #893 <Field PopupWindow mActionModePopup>
	//   22   52:invokevirtual   #903 <Method void PopupWindow.dismiss()>
				}
	//*  23   55:aload_0         
	//*  24   56:aconst_null     
	//*  25   57:putfield        #893 <Field PopupWindow mActionModePopup>
	//*  26   60:aload_0         
	//*  27   61:invokevirtual   #906 <Method void endOnGoingFadeAnimation()>
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
	//*  40   86:invokevirtual   #909 <Method void MenuBuilder.close()>
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
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(keyevent.getKeyCode() == 82 && mOriginalWindowCallback.dispatchKeyEvent(keyevent))
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #914 <Method int KeyEvent.getKeyCode()>
	//*   4    6:bipush          82
	//*   5    8:icmpne          26
	//*   6   11:aload_0         
	//*   7   12:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   8   15:aload_1         
	//*   9   16:invokeinterface #916 <Method boolean android.view.Window$Callback.dispatchKeyEvent(KeyEvent)>
	//*  10   21:ifeq            26
			return true;
	//   11   24:iconst_1        
	//   12   25:ireturn         
		int i = keyevent.getKeyCode();
	//   13   26:aload_1         
	//   14   27:invokevirtual   #914 <Method int KeyEvent.getKeyCode()>
	//   15   30:istore_3        
		if(keyevent.getAction() != 0)
	//*  16   31:aload_1         
	//*  17   32:invokevirtual   #919 <Method int KeyEvent.getAction()>
	//*  18   35:ifne            49
	//*  19   38:iload_2         
	//*  20   39:ifeq            54
	//*  21   42:aload_0         
	//*  22   43:iload_3         
	//*  23   44:aload_1         
	//*  24   45:invokevirtual   #922 <Method boolean onKeyDown(int, KeyEvent)>
	//*  25   48:ireturn         
			flag = false;
	//   26   49:iconst_0        
	//   27   50:istore_2        
		if(flag)
			return onKeyDown(i, keyevent);
		else
	//*  28   51:goto            38
			return onKeyUp(i, keyevent);
	//   29   54:aload_0         
	//   30   55:iload_3         
	//   31   56:aload_1         
	//   32   57:invokevirtual   #925 <Method boolean onKeyUp(int, KeyEvent)>
	//   33   60:ireturn         
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
	//    8   14:new             #928 <Class Bundle>
	//    9   17:dup             
	//   10   18:invokespecial   #929 <Method void Bundle()>
	//   11   21:astore_3        
			panelfeaturestate.menu.saveActionViewStates(bundle);
	//   12   22:aload_2         
	//   13   23:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   14   26:aload_3         
	//   15   27:invokevirtual   #932 <Method void MenuBuilder.saveActionViewStates(Bundle)>
			if(bundle.size() > 0)
	//*  16   30:aload_3         
	//*  17   31:invokevirtual   #935 <Method int Bundle.size()>
	//*  18   34:ifle            42
				panelfeaturestate.frozenActionViewState = bundle;
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:putfield        #763 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
			panelfeaturestate.menu.stopDispatchingItemsChanged();
	//   22   42:aload_2         
	//   23   43:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   24   46:invokevirtual   #756 <Method void MenuBuilder.stopDispatchingItemsChanged()>
			panelfeaturestate.menu.clear();
	//   25   49:aload_2         
	//   26   50:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   27   53:invokevirtual   #938 <Method void MenuBuilder.clear()>
		}
		panelfeaturestate.refreshMenuContent = true;
	//   28   56:aload_2         
	//   29   57:iconst_1        
	//   30   58:putfield        #615 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
		panelfeaturestate.refreshDecorView = true;
	//   31   61:aload_2         
	//   32   62:iconst_1        
	//   33   63:putfield        #660 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
		if((i == 108 || i == 0) && mDecorContentParent != null)
	//*  34   66:iload_1         
	//*  35   67:bipush          108
	//*  36   69:icmpeq          76
	//*  37   72:iload_1         
	//*  38   73:ifne            106
	//*  39   76:aload_0         
	//*  40   77:getfield        #350 <Field DecorContentParent mDecorContentParent>
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
	//   51   96:putfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
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
	//    5   11:invokevirtual   #943 <Method void ViewPropertyAnimatorCompat.cancel()>
	//    6   14:return          
	}

	PanelFeatureState findMenuPanel(Menu menu)
	{
		PanelFeatureState apanelfeaturestate[] = mPanels;
	//    0    0:aload_0         
	//    1    1:getfield        #857 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
	//    2    4:astore          4
		int i;
		int j;
		if(apanelfeaturestate != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          45
			i = apanelfeaturestate.length;
	//    5   11:aload           4
	//    6   13:arraylength     
	//    7   14:istore_2        
		else
	//*   8   15:iconst_0        
	//*   9   16:istore_3        
	//*  10   17:iload_3         
	//*  11   18:iload_2         
	//*  12   19:icmpge          57
	//*  13   22:aload           4
	//*  14   24:iload_3         
	//*  15   25:aaload          
	//*  16   26:astore          5
	//*  17   28:aload           5
	//*  18   30:ifnull          50
	//*  19   33:aload           5
	//*  20   35:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  21   38:aload_1         
	//*  22   39:if_acmpne       50
	//*  23   42:aload           5
	//*  24   44:areturn         
			i = 0;
	//   25   45:iconst_0        
	//   26   46:istore_2        
		for(j = 0; j < i; j++)
		{
			PanelFeatureState panelfeaturestate = apanelfeaturestate[j];
			if(panelfeaturestate != null && panelfeaturestate.menu == menu)
				return panelfeaturestate;
		}

	//   27   47:goto            15
	//   28   50:iload_3         
	//   29   51:iconst_1        
	//   30   52:iadd            
	//   31   53:istore_3        
	//*  32   54:goto            17
		return null;
	//   33   57:aconst_null     
	//   34   58:areturn         
	}

	public View findViewById(int i)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #838 <Method void ensureSubDecor()>
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
	//    1    1:getfield        #857 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
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
	//   24   41:invokestatic    #956 <Method void System.arraycopy(Object, int, Object, int, int)>
			mPanels = apanelfeaturestate;
	//   25   44:aload_0         
	//   26   45:aload_3         
	//   27   46:putfield        #857 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
		}
		PanelFeatureState panelfeaturestate = apanelfeaturestate[i];
	//   28   49:aload_3         
	//   29   50:iload_1         
	//   30   51:aaload          
	//   31   52:astore          4
		if(panelfeaturestate == null)
	//*  32   54:aload           4
	//*  33   56:ifnonnull       77
		{
			panelfeaturestate = new PanelFeatureState(i);
	//   34   59:new             #35  <Class AppCompatDelegateImplV9$PanelFeatureState>
	//   35   62:dup             
	//   36   63:iload_1         
	//   37   64:invokespecial   #958 <Method void AppCompatDelegateImplV9$PanelFeatureState(int)>
	//   38   67:astore          4
			apanelfeaturestate[i] = panelfeaturestate;
	//   39   69:aload_3         
	//   40   70:iload_1         
	//   41   71:aload           4
	//   42   73:aastore         
			return panelfeaturestate;
	//   43   74:aload           4
	//   44   76:areturn         
		} else
		{
			return panelfeaturestate;
	//   45   77:aload           4
	//   46   79:areturn         
		}
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
	//*   2    2:invokespecial   #962 <Method int sanitizeWindowFeatureId(int)>
		{
	//*   3    5:lookupswitch    6: default 64
	//	               1: 91
	//	               2: 81
	//	               5: 86
	//	               10: 76
	//	               108: 66
	//	               109: 71
		default:
			return false;
	//    4   64:iconst_0        
	//    5   65:ireturn         

		case 108: // 'l'
			return mHasActionBar;
	//    6   66:aload_0         
	//    7   67:getfield        #279 <Field boolean mHasActionBar>
	//    8   70:ireturn         

		case 109: // 'm'
			return mOverlayActionBar;
	//    9   71:aload_0         
	//   10   72:getfield        #276 <Field boolean mOverlayActionBar>
	//   11   75:ireturn         

		case 10: // '\n'
			return mOverlayActionMode;
	//   12   76:aload_0         
	//   13   77:getfield        #303 <Field boolean mOverlayActionMode>
	//   14   80:ireturn         

		case 2: // '\002'
			return mFeatureProgress;
	//   15   81:aload_0         
	//   16   82:getfield        #364 <Field boolean mFeatureProgress>
	//   17   85:ireturn         

		case 5: // '\005'
			return mFeatureIndeterminateProgress;
	//   18   86:aload_0         
	//   19   87:getfield        #366 <Field boolean mFeatureIndeterminateProgress>
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
	//    1    1:invokespecial   #838 <Method void ensureSubDecor()>
		if(mHasActionBar && mActionBar == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #279 <Field boolean mHasActionBar>
	//*   4    8:ifeq            18
	//*   5   11:aload_0         
	//*   6   12:getfield        #967 <Field ActionBar mActionBar>
	//*   7   15:ifnull          19
	//*   8   18:return          
		{
			if(mOriginalWindowCallback instanceof Activity)
	//*   9   19:aload_0         
	//*  10   20:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*  11   23:instanceof      #969 <Class Activity>
	//*  12   26:ifeq            70
				mActionBar = ((ActionBar) (new WindowDecorActionBar((Activity)mOriginalWindowCallback, mOverlayActionBar)));
	//   13   29:aload_0         
	//   14   30:new             #971 <Class WindowDecorActionBar>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   18   38:checkcast       #969 <Class Activity>
	//   19   41:aload_0         
	//   20   42:getfield        #276 <Field boolean mOverlayActionBar>
	//   21   45:invokespecial   #974 <Method void WindowDecorActionBar(Activity, boolean)>
	//   22   48:putfield        #967 <Field ActionBar mActionBar>
			else
	//*  23   51:aload_0         
	//*  24   52:getfield        #967 <Field ActionBar mActionBar>
	//*  25   55:ifnull          18
	//*  26   58:aload_0         
	//*  27   59:getfield        #967 <Field ActionBar mActionBar>
	//*  28   62:aload_0         
	//*  29   63:getfield        #976 <Field boolean mEnableDefaultActionBarUp>
	//*  30   66:invokevirtual   #981 <Method void ActionBar.setDefaultDisplayHomeAsUpEnabled(boolean)>
	//*  31   69:return          
			if(mOriginalWindowCallback instanceof Dialog)
	//*  32   70:aload_0         
	//*  33   71:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*  34   74:instanceof      #983 <Class Dialog>
	//*  35   77:ifeq            51
				mActionBar = ((ActionBar) (new WindowDecorActionBar((Dialog)mOriginalWindowCallback)));
	//   36   80:aload_0         
	//   37   81:new             #971 <Class WindowDecorActionBar>
	//   38   84:dup             
	//   39   85:aload_0         
	//   40   86:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   41   89:checkcast       #983 <Class Dialog>
	//   42   92:invokespecial   #986 <Method void WindowDecorActionBar(Dialog)>
	//   43   95:putfield        #967 <Field ActionBar mActionBar>
			if(mActionBar != null)
			{
				mActionBar.setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
				return;
			}
		}
	//*  44   98:goto            51
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
	//*   5    9:invokevirtual   #991 <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//*   6   12:ifnonnull       21
			LayoutInflaterCompat.setFactory2(layoutinflater, ((android.view.LayoutInflater.Factory2) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokestatic    #997 <Method void LayoutInflaterCompat.setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
		else
	//*  10   20:return          
		if(!(layoutinflater.getFactory2() instanceof AppCompatDelegateImplV9))
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #1001 <Method android.view.LayoutInflater$Factory2 LayoutInflater.getFactory2()>
	//*  13   25:instanceof      #2   <Class AppCompatDelegateImplV9>
	//*  14   28:ifne            20
		{
			Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
	//   15   31:ldc2            #621 <String "AppCompatDelegate">
	//   16   34:ldc2            #1003 <String "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's">
	//   17   37:invokestatic    #818 <Method int Log.i(String, String)>
	//   18   40:pop             
			return;
	//   19   41:return          
		}
	}

	public void invalidateOptionsMenu()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null && actionbar.invalidateOptionsMenu())
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #1009 <Method boolean ActionBar.invalidateOptionsMenu()>
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
	//    5   11:invokevirtual   #1015 <Method void ActionMode.finish()>
		} else
	//*   6   14:iconst_1        
	//*   7   15:ireturn         
		{
			ActionBar actionbar = getSupportActionBar();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//   10   20:astore_1        
			if(actionbar == null || !actionbar.collapseActionView())
	//*  11   21:aload_1         
	//*  12   22:ifnull          32
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #1018 <Method boolean ActionBar.collapseActionView()>
	//*  15   29:ifne            14
				return false;
	//   16   32:iconst_0        
	//   17   33:ireturn         
		}
		return true;
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
	//    7   15:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//    8   18:astore_2        
			if(actionbar != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          28
				actionbar.onConfigurationChanged(configuration);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #1022 <Method void ActionBar.onConfigurationChanged(Configuration)>
		}
		AppCompatDrawableManager.get().onConfigurationChanged(mContext);
	//   14   28:invokestatic    #1027 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//   15   31:aload_0         
	//   16   32:getfield        #156 <Field Context mContext>
	//   17   35:invokevirtual   #1029 <Method void AppCompatDrawableManager.onConfigurationChanged(Context)>
		applyDayNight();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #1032 <Method boolean applyDayNight()>
	//   20   42:pop             
	//   21   43:return          
	}

	public void onCreate(Bundle bundle)
	{
label0:
		{
			if((mOriginalWindowCallback instanceof Activity) && NavUtils.getParentActivityName((Activity)mOriginalWindowCallback) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #969 <Class Activity>
	//*   3    7:ifeq            37
	//*   4   10:aload_0         
	//*   5   11:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   6   14:checkcast       #969 <Class Activity>
	//*   7   17:invokestatic    #1039 <Method String NavUtils.getParentActivityName(Activity)>
	//*   8   20:ifnull          37
			{
				bundle = ((Bundle) (peekSupportActionBar()));
	//    9   23:aload_0         
	//   10   24:invokevirtual   #743 <Method ActionBar peekSupportActionBar()>
	//   11   27:astore_1        
				if(bundle != null)
					break label0;
	//   12   28:aload_1         
	//   13   29:ifnonnull       38
				mEnableDefaultActionBarUp = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #976 <Field boolean mEnableDefaultActionBarUp>
			}
			return;
	//   17   37:return          
		}
		((ActionBar) (bundle)).setDefaultDisplayHomeAsUpEnabled(true);
	//   18   38:aload_1         
	//   19   39:iconst_1        
	//   20   40:invokevirtual   #981 <Method void ActionBar.setDefaultDisplayHomeAsUpEnabled(boolean)>
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
	//    5    6:invokevirtual   #1041 <Method View callActivityOnCreateView(View, String, Context, AttributeSet)>
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
	//   16   25:invokevirtual   #1043 <Method View createView(View, String, Context, AttributeSet)>
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
	//    5    5:invokevirtual   #1045 <Method View onCreateView(View, String, Context, AttributeSet)>
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
	//    8   18:invokevirtual   #802 <Method boolean View.removeCallbacks(Runnable)>
	//    9   21:pop             
		super.onDestroy();
	//   10   22:aload_0         
	//   11   23:invokespecial   #1048 <Method void AppCompatDelegateImplBase.onDestroy()>
		if(mActionBar != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #967 <Field ActionBar mActionBar>
	//*  14   30:ifnull          40
			mActionBar.onDestroy();
	//   15   33:aload_0         
	//   16   34:getfield        #967 <Field ActionBar mActionBar>
	//   17   37:invokevirtual   #1049 <Method void ActionBar.onDestroy()>
	//   18   40:return          
	}

	boolean onKeyDown(int i, KeyEvent keyevent)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		i;
	//    2    2:iload_1         
		JVM INSTR lookupswitch 2: default 28
	//	               4: 54
	//	               82: 45;
	//    3    3:lookupswitch    2: default 28
	//	               4: 54
	//	               82: 45
		   goto _L1 _L2 _L3
_L1:
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   4   28:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   31:bipush          11
	//*   6   33:icmpge          43
			onKeyShortcut(i, keyevent);
	//    7   36:aload_0         
	//    8   37:iload_1         
	//    9   38:aload_2         
	//   10   39:invokevirtual   #1052 <Method boolean onKeyShortcut(int, KeyEvent)>
	//   11   42:pop             
		return false;
	//   12   43:iconst_0        
	//   13   44:ireturn         
_L3:
		onKeyDownPanel(0, keyevent);
	//   14   45:aload_0         
	//   15   46:iconst_0        
	//   16   47:aload_2         
	//   17   48:invokespecial   #1054 <Method boolean onKeyDownPanel(int, KeyEvent)>
	//   18   51:pop             
		return true;
	//   19   52:iconst_1        
	//   20   53:ireturn         
_L2:
		if((keyevent.getFlags() & 0x80) == 0)
	//*  21   54:aload_2         
	//*  22   55:invokevirtual   #1057 <Method int KeyEvent.getFlags()>
	//*  23   58:sipush          128
	//*  24   61:iand            
	//*  25   62:ifeq            73
	//*  26   65:aload_0         
	//*  27   66:iload_3         
	//*  28   67:putfield        #1059 <Field boolean mLongPressBackDown>
	//*  29   70:goto            28
			flag = false;
	//   30   73:iconst_0        
	//   31   74:istore_3        
		mLongPressBackDown = flag;
		if(true) goto _L1; else goto _L4
	//   32   75:goto            65
_L4:
	}

	boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//    2    4:astore          4
		if(actionbar == null || !actionbar.onKeyShortcut(i, keyevent)) goto _L2; else goto _L1
	//    3    6:aload           4
	//    4    8:ifnull          23
	//    5   11:aload           4
	//    6   13:iload_1         
	//    7   14:aload_2         
	//    8   15:invokevirtual   #1060 <Method boolean ActionBar.onKeyShortcut(int, KeyEvent)>
	//    9   18:ifeq            23
_L1:
		return true;
	//   10   21:iconst_1        
	//   11   22:ireturn         
_L2:
		if(mPreparedPanel == null || !performPanelShortcut(mPreparedPanel, keyevent.getKeyCode(), keyevent, 1))
			break; /* Loop/switch isn't completed */
	//   12   23:aload_0         
	//   13   24:getfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   14   27:ifnull          64
	//   15   30:aload_0         
	//   16   31:aload_0         
	//   17   32:getfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   18   35:aload_2         
	//   19   36:invokevirtual   #914 <Method int KeyEvent.getKeyCode()>
	//   20   39:aload_2         
	//   21   40:iconst_1        
	//   22   41:invokespecial   #1062 <Method boolean performPanelShortcut(AppCompatDelegateImplV9$PanelFeatureState, int, KeyEvent, int)>
	//   23   44:ifeq            64
		if(mPreparedPanel != null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  26   51:ifnull          21
		{
			mPreparedPanel.isHandled = true;
	//   27   54:aload_0         
	//   28   55:getfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   29   58:iconst_1        
	//   30   59:putfield        #605 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
			return true;
	//   31   62:iconst_1        
	//   32   63:ireturn         
		}
		if(true) goto _L1; else goto _L3
_L3:
		boolean flag;
		if(mPreparedPanel != null)
			break; /* Loop/switch isn't completed */
	//   33   64:aload_0         
	//   34   65:getfield        #733 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   35   68:ifnonnull       110
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
		flag = performPanelShortcut(panelfeaturestate, keyevent.getKeyCode(), keyevent, 1);
	//   46   87:aload_0         
	//   47   88:aload           4
	//   48   90:aload_2         
	//   49   91:invokevirtual   #914 <Method int KeyEvent.getKeyCode()>
	//   50   94:aload_2         
	//   51   95:iconst_1        
	//   52   96:invokespecial   #1062 <Method boolean performPanelShortcut(AppCompatDelegateImplV9$PanelFeatureState, int, KeyEvent, int)>
	//   53   99:istore_3        
		panelfeaturestate.isPrepared = false;
	//   54  100:aload           4
	//   55  102:iconst_0        
	//   56  103:putfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
		if(flag) goto _L1; else goto _L4
	//   57  106:iload_3         
	//   58  107:ifne            21
_L4:
		return false;
	//   59  110:iconst_0        
	//   60  111:ireturn         
	}

	boolean onKeyUp(int i, KeyEvent keyevent)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		i;
	//    2    2:iload_1         
		JVM INSTR lookupswitch 2: default 28
	//	               4: 41
	//	               82: 32;
	//    3    3:lookupswitch    2: default 28
	//	               4: 41
	//	               82: 32
		   goto _L1 _L2 _L3
_L1:
		flag = false;
	//    4   28:iconst_0        
	//    5   29:istore_3        
_L5:
		return flag;
	//    6   30:iload_3         
	//    7   31:ireturn         
_L3:
		onKeyUpPanel(0, keyevent);
	//    8   32:aload_0         
	//    9   33:iconst_0        
	//   10   34:aload_2         
	//   11   35:invokespecial   #1064 <Method boolean onKeyUpPanel(int, KeyEvent)>
	//   12   38:pop             
		return true;
	//   13   39:iconst_1        
	//   14   40:ireturn         
_L2:
		boolean flag1;
		flag1 = mLongPressBackDown;
	//   15   41:aload_0         
	//   16   42:getfield        #1059 <Field boolean mLongPressBackDown>
	//   17   45:istore          4
		mLongPressBackDown = false;
	//   18   47:aload_0         
	//   19   48:iconst_0        
	//   20   49:putfield        #1059 <Field boolean mLongPressBackDown>
		keyevent = ((KeyEvent) (getPanelState(0, false)));
	//   21   52:aload_0         
	//   22   53:iconst_0        
	//   23   54:iconst_0        
	//   24   55:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   25   58:astore_2        
		if(keyevent == null || !((PanelFeatureState) (keyevent)).isOpen)
			continue; /* Loop/switch isn't completed */
	//   26   59:aload_2         
	//   27   60:ifnull          83
	//   28   63:aload_2         
	//   29   64:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//   30   67:ifeq            83
		if(flag1) goto _L5; else goto _L4
	//   31   70:iload           4
	//   32   72:ifne            30
_L4:
		closePanel(((PanelFeatureState) (keyevent)), true);
	//   33   75:aload_0         
	//   34   76:aload_2         
	//   35   77:iconst_1        
	//   36   78:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		return true;
	//   37   81:iconst_1        
	//   38   82:ireturn         
		if(!onBackPressed()) goto _L1; else goto _L6
	//   39   83:aload_0         
	//   40   84:invokevirtual   #1066 <Method boolean onBackPressed()>
	//   41   87:ifeq            28
_L6:
		return true;
	//   42   90:iconst_1        
	//   43   91:ireturn         
	}

	public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
	{
		android.view.Window.Callback callback = getWindowCallback();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #354 <Method android.view.Window$Callback getWindowCallback()>
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
	//   10   18:invokevirtual   #1072 <Method MenuBuilder MenuBuilder.getRootMenu()>
	//   11   21:invokevirtual   #1074 <Method AppCompatDelegateImplV9$PanelFeatureState findMenuPanel(Menu)>
	//   12   24:astore_1        
			if(menubuilder != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          41
				return callback.onMenuItemSelected(((PanelFeatureState) (menubuilder)).featureId, menuitem);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   18   34:aload_2         
	//   19   35:invokeinterface #1077 <Method boolean android.view.Window$Callback.onMenuItemSelected(int, MenuItem)>
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
	//    3    3:invokespecial   #1080 <Method void reopenMenu(MenuBuilder, boolean)>
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
	//    4    7:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//    5   10:astore_2        
			if(menu != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          20
				((ActionBar) (menu)).dispatchMenuVisibilityChanged(true);
	//    8   15:aload_2         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #1083 <Method void ActionBar.dispatchMenuVisibilityChanged(boolean)>
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
	//    4    7:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//    5   10:astore_2        
			if(menu != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          20
				((ActionBar) (menu)).dispatchMenuVisibilityChanged(false);
	//    8   15:aload_2         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #1083 <Method void ActionBar.dispatchMenuVisibilityChanged(boolean)>
		} else
	//*  11   20:return          
		if(i == 0)
	//*  12   21:iload_1         
	//*  13   22:ifne            20
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
	//*  21   36:ifeq            20
			{
				closePanel(((PanelFeatureState) (menu)), false);
	//   22   39:aload_0         
	//   23   40:aload_2         
	//   24   41:iconst_0        
	//   25   42:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
				return;
	//   26   45:return          
			}
		}
	}

	public void onPostCreate(Bundle bundle)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #838 <Method void ensureSubDecor()>
	//    2    4:return          
	}

	public void onPostResume()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionbar.setShowHideAnimationEnabled(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #1088 <Method void ActionBar.setShowHideAnimationEnabled(boolean)>
	//    8   14:return          
	}

	public void onStop()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionbar.setShowHideAnimationEnabled(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #1088 <Method void ActionBar.setShowHideAnimationEnabled(boolean)>
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
	//*   1    1:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*   2    4:ifnull          18
		{
			mDecorContentParent.setWindowTitle(charsequence);
	//    3    7:aload_0         
	//    4    8:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//    5   11:aload_1         
	//    6   12:invokeinterface #1092 <Method void DecorContentParent.setWindowTitle(CharSequence)>
		} else
	//*   7   17:return          
		{
			if(peekSupportActionBar() != null)
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #743 <Method ActionBar peekSupportActionBar()>
	//*  10   22:ifnull          34
			{
				peekSupportActionBar().setWindowTitle(charsequence);
	//   11   25:aload_0         
	//   12   26:invokevirtual   #743 <Method ActionBar peekSupportActionBar()>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #1093 <Method void ActionBar.setWindowTitle(CharSequence)>
				return;
	//   15   33:return          
			}
			if(mTitleView != null)
	//*  16   34:aload_0         
	//*  17   35:getfield        #393 <Field TextView mTitleView>
	//*  18   38:ifnull          17
			{
				mTitleView.setText(charsequence);
	//   19   41:aload_0         
	//   20   42:getfield        #393 <Field TextView mTitleView>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #1096 <Method void TextView.setText(CharSequence)>
				return;
	//   23   49:return          
			}
		}
	}

	public boolean requestWindowFeature(int i)
	{
		i = sanitizeWindowFeatureId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #962 <Method int sanitizeWindowFeatureId(int)>
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
	//	               2: 138
	//	               5: 149
	//	               10: 127
	//	               108: 105
	//	               109: 116
		default:
			return mWindow.requestFeature(i);
	//   23   96:aload_0         
	//   24   97:getfield        #127 <Field Window mWindow>
	//   25  100:iload_1         
	//   26  101:invokevirtual   #1099 <Method boolean Window.requestFeature(int)>
	//   27  104:ireturn         

		case 108: // 'l'
			throwFeatureRequestIfSubDecorInstalled();
	//   28  105:aload_0         
	//   29  106:invokespecial   #1101 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mHasActionBar = true;
	//   30  109:aload_0         
	//   31  110:iconst_1        
	//   32  111:putfield        #279 <Field boolean mHasActionBar>
			return true;
	//   33  114:iconst_1        
	//   34  115:ireturn         

		case 109: // 'm'
			throwFeatureRequestIfSubDecorInstalled();
	//   35  116:aload_0         
	//   36  117:invokespecial   #1101 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mOverlayActionBar = true;
	//   37  120:aload_0         
	//   38  121:iconst_1        
	//   39  122:putfield        #276 <Field boolean mOverlayActionBar>
			return true;
	//   40  125:iconst_1        
	//   41  126:ireturn         

		case 10: // '\n'
			throwFeatureRequestIfSubDecorInstalled();
	//   42  127:aload_0         
	//   43  128:invokespecial   #1101 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mOverlayActionMode = true;
	//   44  131:aload_0         
	//   45  132:iconst_1        
	//   46  133:putfield        #303 <Field boolean mOverlayActionMode>
			return true;
	//   47  136:iconst_1        
	//   48  137:ireturn         

		case 2: // '\002'
			throwFeatureRequestIfSubDecorInstalled();
	//   49  138:aload_0         
	//   50  139:invokespecial   #1101 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mFeatureProgress = true;
	//   51  142:aload_0         
	//   52  143:iconst_1        
	//   53  144:putfield        #364 <Field boolean mFeatureProgress>
			return true;
	//   54  147:iconst_1        
	//   55  148:ireturn         

		case 5: // '\005'
			throwFeatureRequestIfSubDecorInstalled();
	//   56  149:aload_0         
	//   57  150:invokespecial   #1101 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mFeatureIndeterminateProgress = true;
	//   58  153:aload_0         
	//   59  154:iconst_1        
	//   60  155:putfield        #366 <Field boolean mFeatureIndeterminateProgress>
			return true;
	//   61  158:iconst_1        
	//   62  159:ireturn         

		case 1: // '\001'
			throwFeatureRequestIfSubDecorInstalled();
	//   63  160:aload_0         
	//   64  161:invokespecial   #1101 <Method void throwFeatureRequestIfSubDecorInstalled()>
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
	//    1    1:invokespecial   #838 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:astore_2        
		viewgroup.removeAllViews();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #719 <Method void ViewGroup.removeAllViews()>
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
	//   18   35:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   19   38:invokeinterface #845 <Method void android.view.Window$Callback.onContentChanged()>
	//   20   43:return          
	}

	public void setContentView(View view)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #838 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:astore_2        
		viewgroup.removeAllViews();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #719 <Method void ViewGroup.removeAllViews()>
		viewgroup.addView(view);
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #1102 <Method void ViewGroup.addView(View)>
		mOriginalWindowCallback.onContentChanged();
	//   13   26:aload_0         
	//   14   27:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   15   30:invokeinterface #845 <Method void android.view.Window$Callback.onContentChanged()>
	//   16   35:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #838 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:astore_3        
		viewgroup.removeAllViews();
	//    8   17:aload_3         
	//    9   18:invokevirtual   #719 <Method void ViewGroup.removeAllViews()>
		viewgroup.addView(view, layoutparams);
	//   10   21:aload_3         
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #692 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		mOriginalWindowCallback.onContentChanged();
	//   14   27:aload_0         
	//   15   28:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   16   31:invokeinterface #845 <Method void android.view.Window$Callback.onContentChanged()>
	//   17   36:return          
	}

	public void setSupportActionBar(Toolbar toolbar)
	{
		if(!(mOriginalWindowCallback instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #969 <Class Activity>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		ActionBar actionbar = getSupportActionBar();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//    7   15:astore_2        
		if(actionbar instanceof WindowDecorActionBar)
	//*   8   16:aload_2         
	//*   9   17:instanceof      #971 <Class WindowDecorActionBar>
	//*  10   20:ifeq            34
			throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
	//   11   23:new             #228 <Class IllegalStateException>
	//   12   26:dup             
	//   13   27:ldc2            #1106 <String "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.">
	//   14   30:invokespecial   #233 <Method void IllegalStateException(String)>
	//   15   33:athrow          
		mMenuInflater = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #1110 <Field android.view.MenuInflater mMenuInflater>
		if(actionbar != null)
	//*  19   39:aload_2         
	//*  20   40:ifnull          47
			actionbar.onDestroy();
	//   21   43:aload_2         
	//   22   44:invokevirtual   #1049 <Method void ActionBar.onDestroy()>
		if(toolbar != null)
	//*  23   47:aload_1         
	//*  24   48:ifnull          95
		{
			toolbar = ((Toolbar) (new ToolbarActionBar(toolbar, ((Activity)mOriginalWindowCallback).getTitle(), mAppCompatWindowCallback)));
	//   25   51:new             #745 <Class ToolbarActionBar>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   30   60:checkcast       #969 <Class Activity>
	//   31   63:invokevirtual   #1111 <Method CharSequence Activity.getTitle()>
	//   32   66:aload_0         
	//   33   67:getfield        #1114 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   34   70:invokespecial   #1117 <Method void ToolbarActionBar(Toolbar, CharSequence, android.view.Window$Callback)>
	//   35   73:astore_1        
			mActionBar = ((ActionBar) (toolbar));
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:putfield        #967 <Field ActionBar mActionBar>
			mWindow.setCallback(((ToolbarActionBar) (toolbar)).getWrappedWindowCallback());
	//   39   79:aload_0         
	//   40   80:getfield        #127 <Field Window mWindow>
	//   41   83:aload_1         
	//   42   84:invokevirtual   #1120 <Method android.view.Window$Callback ToolbarActionBar.getWrappedWindowCallback()>
	//   43   87:invokevirtual   #1122 <Method void Window.setCallback(android.view.Window$Callback)>
		} else
	//*  44   90:aload_0         
	//*  45   91:invokevirtual   #1124 <Method void invalidateOptionsMenu()>
	//*  46   94:return          
		{
			mActionBar = null;
	//   47   95:aload_0         
	//   48   96:aconst_null     
	//   49   97:putfield        #967 <Field ActionBar mActionBar>
			mWindow.setCallback(mAppCompatWindowCallback);
	//   50  100:aload_0         
	//   51  101:getfield        #127 <Field Window mWindow>
	//   52  104:aload_0         
	//   53  105:getfield        #1114 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   54  108:invokevirtual   #1122 <Method void Window.setCallback(android.view.Window$Callback)>
		}
		invalidateOptionsMenu();
	//*  55  111:goto            90
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
	//    8   18:invokestatic    #1128 <Method boolean ViewCompat.isLaidOut(View)>
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
	//    2    4:new             #281 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #1132 <String "ActionMode callback can not be null.">
	//    5   11:invokespecial   #312 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(mActionMode != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #570 <Field ActionMode mActionMode>
	//*   9   19:ifnull          29
			mActionMode.finish();
	//   10   22:aload_0         
	//   11   23:getfield        #570 <Field ActionMode mActionMode>
	//   12   26:invokevirtual   #1015 <Method void ActionMode.finish()>
		callback = ((android.support.v7.view.ActionMode.Callback) (new ActionModeCallbackWrapperV9(callback)));
	//   13   29:new             #27  <Class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #1135 <Method void AppCompatDelegateImplV9$ActionModeCallbackWrapperV9(AppCompatDelegateImplV9, android.support.v7.view.ActionMode$Callback)>
	//   18   38:astore_1        
		ActionBar actionbar = getSupportActionBar();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #1007 <Method ActionBar getSupportActionBar()>
	//   21   43:astore_2        
		if(actionbar != null)
	//*  22   44:aload_2         
	//*  23   45:ifnull          84
		{
			mActionMode = actionbar.startActionMode(callback);
	//   24   48:aload_0         
	//   25   49:aload_2         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #1138 <Method ActionMode ActionBar.startActionMode(android.support.v7.view.ActionMode$Callback)>
	//   28   54:putfield        #570 <Field ActionMode mActionMode>
			if(mActionMode != null && mAppCompatCallback != null)
	//*  29   57:aload_0         
	//*  30   58:getfield        #570 <Field ActionMode mActionMode>
	//*  31   61:ifnull          84
	//*  32   64:aload_0         
	//*  33   65:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//*  34   68:ifnull          84
				mAppCompatCallback.onSupportActionModeStarted(mActionMode);
	//   35   71:aload_0         
	//   36   72:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//   37   75:aload_0         
	//   38   76:getfield        #570 <Field ActionMode mActionMode>
	//   39   79:invokeinterface #1148 <Method void AppCompatCallback.onSupportActionModeStarted(ActionMode)>
		}
		if(mActionMode == null)
	//*  40   84:aload_0         
	//*  41   85:getfield        #570 <Field ActionMode mActionMode>
	//*  42   88:ifnonnull       100
			mActionMode = startSupportActionModeFromWindow(callback);
	//   43   91:aload_0         
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:invokevirtual   #1151 <Method ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode$Callback)>
	//   47   97:putfield        #570 <Field ActionMode mActionMode>
		return mActionMode;
	//   48  100:aload_0         
	//   49  101:getfield        #570 <Field ActionMode mActionMode>
	//   50  104:areturn         
	}

	ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode.Callback callback)
	{
		endOnGoingFadeAnimation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #906 <Method void endOnGoingFadeAnimation()>
		if(mActionMode != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #570 <Field ActionMode mActionMode>
	//*   4    8:ifnull          18
			mActionMode.finish();
	//    5   11:aload_0         
	//    6   12:getfield        #570 <Field ActionMode mActionMode>
	//    7   15:invokevirtual   #1015 <Method void ActionMode.finish()>
		Object obj = ((Object) (callback));
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
	//   17   34:invokespecial   #1135 <Method void AppCompatDelegateImplV9$ActionModeCallbackWrapperV9(AppCompatDelegateImplV9, android.support.v7.view.ActionMode$Callback)>
	//   18   37:astore          4
		int i;
		boolean flag;
		Object obj1;
		android.content.res.Resources.Theme theme;
		if(mAppCompatCallback != null && !isDestroyed())
	//*  19   39:aload_0         
	//*  20   40:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//*  21   43:ifnull          603
	//*  22   46:aload_0         
	//*  23   47:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  24   50:ifne            603
			try
			{
				callback = ((android.support.v7.view.ActionMode.Callback) (mAppCompatCallback.onWindowStartingSupportActionMode(((android.support.v7.view.ActionMode.Callback) (obj)))));
	//   25   53:aload_0         
	//   26   54:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//   27   57:aload           4
	//   28   59:invokeinterface #1156 <Method ActionMode AppCompatCallback.onWindowStartingSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//   29   64:astore_1        
			}
	//*  30   65:aload_1         
	//*  31   66:ifnull          112
	//*  32   69:aload_0         
	//*  33   70:aload_1         
	//*  34   71:putfield        #570 <Field ActionMode mActionMode>
	//*  35   74:aload_0         
	//*  36   75:getfield        #570 <Field ActionMode mActionMode>
	//*  37   78:ifnull          101
	//*  38   81:aload_0         
	//*  39   82:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//*  40   85:ifnull          101
	//*  41   88:aload_0         
	//*  42   89:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//*  43   92:aload_0         
	//*  44   93:getfield        #570 <Field ActionMode mActionMode>
	//*  45   96:invokeinterface #1148 <Method void AppCompatCallback.onSupportActionModeStarted(ActionMode)>
	//*  46  101:aload_0         
	//*  47  102:getfield        #570 <Field ActionMode mActionMode>
	//*  48  105:areturn         
			// Misplaced declaration of an exception variable
			catch(android.support.v7.view.ActionMode.Callback callback)
	//*  49  106:astore_1        
			{
				callback = null;
	//   50  107:aconst_null     
	//   51  108:astore_1        
			}
		else
	//*  52  109:goto            65
	//*  53  112:aload_0         
	//*  54  113:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//*  55  116:ifnonnull       327
	//*  56  119:aload_0         
	//*  57  120:getfield        #255 <Field boolean mIsFloating>
	//*  58  123:ifeq            493
	//*  59  126:new             #314 <Class TypedValue>
	//*  60  129:dup             
	//*  61  130:invokespecial   #315 <Method void TypedValue()>
	//*  62  133:astore          5
	//*  63  135:aload_0         
	//*  64  136:getfield        #156 <Field Context mContext>
	//*  65  139:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  66  142:astore_1        
	//*  67  143:aload_1         
	//*  68  144:getstatic       #324 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//*  69  147:aload           5
	//*  70  149:iconst_1        
	//*  71  150:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  72  153:pop             
	//*  73  154:aload           5
	//*  74  156:getfield        #333 <Field int TypedValue.resourceId>
	//*  75  159:ifeq            485
	//*  76  162:aload_0         
	//*  77  163:getfield        #156 <Field Context mContext>
	//*  78  166:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  79  169:invokevirtual   #522 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//*  80  172:astore          6
	//*  81  174:aload           6
	//*  82  176:aload_1         
	//*  83  177:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//*  84  180:aload           6
	//*  85  182:aload           5
	//*  86  184:getfield        #333 <Field int TypedValue.resourceId>
	//*  87  187:iconst_1        
	//*  88  188:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
	//*  89  191:new             #335 <Class ContextThemeWrapper>
	//*  90  194:dup             
	//*  91  195:aload_0         
	//*  92  196:getfield        #156 <Field Context mContext>
	//*  93  199:iconst_0        
	//*  94  200:invokespecial   #338 <Method void ContextThemeWrapper(Context, int)>
	//*  95  203:astore_1        
	//*  96  204:aload_1         
	//*  97  205:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  98  208:aload           6
	//*  99  210:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//* 100  213:aload_0         
	//* 101  214:new             #1160 <Class ActionBarContextView>
	//* 102  217:dup             
	//* 103  218:aload_1         
	//* 104  219:invokespecial   #1161 <Method void ActionBarContextView(Context)>
	//* 105  222:putfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 106  225:aload_0         
	//* 107  226:new             #897 <Class PopupWindow>
	//* 108  229:dup             
	//* 109  230:aload_1         
	//* 110  231:aconst_null     
	//* 111  232:getstatic       #1164 <Field int android.support.v7.appcompat.R$attr.actionModePopupWindowStyle>
	//* 112  235:invokespecial   #1167 <Method void PopupWindow(Context, AttributeSet, int)>
	//* 113  238:putfield        #893 <Field PopupWindow mActionModePopup>
	//* 114  241:aload_0         
	//* 115  242:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 116  245:iconst_2        
	//* 117  246:invokestatic    #1173 <Method void PopupWindowCompat.setWindowLayoutType(PopupWindow, int)>
	//* 118  249:aload_0         
	//* 119  250:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 120  253:aload_0         
	//* 121  254:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 122  257:invokevirtual   #1174 <Method void PopupWindow.setContentView(View)>
	//* 123  260:aload_0         
	//* 124  261:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 125  264:iconst_m1       
	//* 126  265:invokevirtual   #1177 <Method void PopupWindow.setWidth(int)>
	//* 127  268:aload_1         
	//* 128  269:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//* 129  272:getstatic       #1180 <Field int android.support.v7.appcompat.R$attr.actionBarSize>
	//* 130  275:aload           5
	//* 131  277:iconst_1        
	//* 132  278:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//* 133  281:pop             
	//* 134  282:aload           5
	//* 135  284:getfield        #1183 <Field int TypedValue.data>
	//* 136  287:aload_1         
	//* 137  288:invokevirtual   #517 <Method Resources Context.getResources()>
	//* 138  291:invokevirtual   #1187 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//* 139  294:invokestatic    #1191 <Method int TypedValue.complexToDimensionPixelSize(int, android.util.DisplayMetrics)>
	//* 140  297:istore_2        
	//* 141  298:aload_0         
	//* 142  299:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 143  302:iload_2         
	//* 144  303:invokevirtual   #1194 <Method void ActionBarContextView.setContentHeight(int)>
	//* 145  306:aload_0         
	//* 146  307:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 147  310:bipush          -2
	//* 148  312:invokevirtual   #1197 <Method void PopupWindow.setHeight(int)>
	//* 149  315:aload_0         
	//* 150  316:new             #18  <Class AppCompatDelegateImplV9$5>
	//* 151  319:dup             
	//* 152  320:aload_0         
	//* 153  321:invokespecial   #1198 <Method void AppCompatDelegateImplV9$5(AppCompatDelegateImplV9)>
	//* 154  324:putfield        #895 <Field Runnable mShowActionModePopup>
	//* 155  327:aload_0         
	//* 156  328:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 157  331:ifnull          74
	//* 158  334:aload_0         
	//* 159  335:invokevirtual   #906 <Method void endOnGoingFadeAnimation()>
	//* 160  338:aload_0         
	//* 161  339:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 162  342:invokevirtual   #1201 <Method void ActionBarContextView.killMode()>
	//* 163  345:aload_0         
	//* 164  346:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 165  349:invokevirtual   #1204 <Method Context ActionBarContextView.getContext()>
	//* 166  352:astore_1        
	//* 167  353:aload_0         
	//* 168  354:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 169  357:astore          5
	//* 170  359:aload_0         
	//* 171  360:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 172  363:ifnonnull       536
	//* 173  366:iconst_1        
	//* 174  367:istore_3        
	//* 175  368:new             #1206 <Class StandaloneActionMode>
	//* 176  371:dup             
	//* 177  372:aload_1         
	//* 178  373:aload           5
	//* 179  375:aload           4
	//* 180  377:iload_3         
	//* 181  378:invokespecial   #1209 <Method void StandaloneActionMode(Context, ActionBarContextView, android.support.v7.view.ActionMode$Callback, boolean)>
	//* 182  381:astore_1        
	//* 183  382:aload           4
	//* 184  384:aload_1         
	//* 185  385:aload_1         
	//* 186  386:invokevirtual   #1213 <Method Menu ActionMode.getMenu()>
	//* 187  389:invokeinterface #1219 <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
	//* 188  394:ifeq            595
	//* 189  397:aload_1         
	//* 190  398:invokevirtual   #1222 <Method void ActionMode.invalidate()>
	//* 191  401:aload_0         
	//* 192  402:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 193  405:aload_1         
	//* 194  406:invokevirtual   #1225 <Method void ActionBarContextView.initForMode(ActionMode)>
	//* 195  409:aload_0         
	//* 196  410:aload_1         
	//* 197  411:putfield        #570 <Field ActionMode mActionMode>
	//* 198  414:aload_0         
	//* 199  415:invokevirtual   #1227 <Method boolean shouldAnimateActionModeView()>
	//* 200  418:ifeq            541
	//* 201  421:aload_0         
	//* 202  422:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 203  425:fconst_0        
	//* 204  426:invokevirtual   #1231 <Method void ActionBarContextView.setAlpha(float)>
	//* 205  429:aload_0         
	//* 206  430:aload_0         
	//* 207  431:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 208  434:invokestatic    #1235 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//* 209  437:fconst_1        
	//* 210  438:invokevirtual   #1239 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//* 211  441:putfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//* 212  444:aload_0         
	//* 213  445:getfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//* 214  448:new             #22  <Class AppCompatDelegateImplV9$6>
	//* 215  451:dup             
	//* 216  452:aload_0         
	//* 217  453:invokespecial   #1240 <Method void AppCompatDelegateImplV9$6(AppCompatDelegateImplV9)>
	//* 218  456:invokevirtual   #1244 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//* 219  459:pop             
	//* 220  460:aload_0         
	//* 221  461:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 222  464:ifnull          74
	//* 223  467:aload_0         
	//* 224  468:getfield        #127 <Field Window mWindow>
	//* 225  471:invokevirtual   #133 <Method View Window.getDecorView()>
	//* 226  474:aload_0         
	//* 227  475:getfield        #895 <Field Runnable mShowActionModePopup>
	//* 228  478:invokevirtual   #1247 <Method boolean View.post(Runnable)>
	//* 229  481:pop             
	//* 230  482:goto            74
	//* 231  485:aload_0         
	//* 232  486:getfield        #156 <Field Context mContext>
	//* 233  489:astore_1        
	//* 234  490:goto            213
	//* 235  493:aload_0         
	//* 236  494:getfield        #114 <Field ViewGroup mSubDecor>
	//* 237  497:getstatic       #1250 <Field int android.support.v7.appcompat.R$id.action_mode_bar_stub>
	//* 238  500:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//* 239  503:checkcast       #1252 <Class ViewStubCompat>
	//* 240  506:astore_1        
	//* 241  507:aload_1         
	//* 242  508:ifnull          327
	//* 243  511:aload_1         
	//* 244  512:aload_0         
	//* 245  513:invokevirtual   #493 <Method Context getActionBarThemedContext()>
	//* 246  516:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//* 247  519:invokevirtual   #1256 <Method void ViewStubCompat.setLayoutInflater(LayoutInflater)>
	//* 248  522:aload_0         
	//* 249  523:aload_1         
	//* 250  524:invokevirtual   #1258 <Method View ViewStubCompat.inflate()>
	//* 251  527:checkcast       #1160 <Class ActionBarContextView>
	//* 252  530:putfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 253  533:goto            327
	//* 254  536:iconst_0        
	//* 255  537:istore_3        
	//* 256  538:goto            368
	//* 257  541:aload_0         
	//* 258  542:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 259  545:fconst_1        
	//* 260  546:invokevirtual   #1231 <Method void ActionBarContextView.setAlpha(float)>
	//* 261  549:aload_0         
	//* 262  550:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 263  553:iconst_0        
	//* 264  554:invokevirtual   #1261 <Method void ActionBarContextView.setVisibility(int)>
	//* 265  557:aload_0         
	//* 266  558:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 267  561:bipush          32
	//* 268  563:invokevirtual   #1264 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
	//* 269  566:aload_0         
	//* 270  567:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 271  570:invokevirtual   #1265 <Method ViewParent ActionBarContextView.getParent()>
	//* 272  573:instanceof      #135 <Class View>
	//* 273  576:ifeq            460
	//* 274  579:aload_0         
	//* 275  580:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 276  583:invokevirtual   #1265 <Method ViewParent ActionBarContextView.getParent()>
	//* 277  586:checkcast       #135 <Class View>
	//* 278  589:invokestatic    #1268 <Method void ViewCompat.requestApplyInsets(View)>
	//* 279  592:goto            460
	//* 280  595:aload_0         
	//* 281  596:aconst_null     
	//* 282  597:putfield        #570 <Field ActionMode mActionMode>
	//* 283  600:goto            74
			callback = null;
	//  284  603:aconst_null     
	//  285  604:astore_1        
		if(callback == null) goto _L2; else goto _L1
_L1:
		mActionMode = ((ActionMode) (callback));
_L4:
		if(mActionMode != null && mAppCompatCallback != null)
			mAppCompatCallback.onSupportActionModeStarted(mActionMode);
		return mActionMode;
_L2:
		if(mActionModeView == null)
			if(mIsFloating)
			{
				obj1 = ((Object) (new TypedValue()));
				callback = ((android.support.v7.view.ActionMode.Callback) (mContext.getTheme()));
				((android.content.res.Resources.Theme) (callback)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, ((TypedValue) (obj1)), true);
				if(((TypedValue) (obj1)).resourceId != 0)
				{
					theme = mContext.getResources().newTheme();
					theme.setTo(((android.content.res.Resources.Theme) (callback)));
					theme.applyStyle(((TypedValue) (obj1)).resourceId, true);
					callback = ((android.support.v7.view.ActionMode.Callback) (new ContextThemeWrapper(mContext, 0)));
					((Context) (callback)).getTheme().setTo(theme);
				} else
				{
					callback = ((android.support.v7.view.ActionMode.Callback) (mContext));
				}
				mActionModeView = new ActionBarContextView(((Context) (callback)));
				mActionModePopup = new PopupWindow(((Context) (callback)), ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionModePopupWindowStyle);
				PopupWindowCompat.setWindowLayoutType(mActionModePopup, 2);
				mActionModePopup.setContentView(((View) (mActionModeView)));
				mActionModePopup.setWidth(-1);
				((Context) (callback)).getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarSize, ((TypedValue) (obj1)), true);
				i = TypedValue.complexToDimensionPixelSize(((TypedValue) (obj1)).data, ((Context) (callback)).getResources().getDisplayMetrics());
				mActionModeView.setContentHeight(i);
				mActionModePopup.setHeight(-2);
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
			} else
			{
				callback = ((android.support.v7.view.ActionMode.Callback) ((ViewStubCompat)mSubDecor.findViewById(android.support.v7.appcompat.R.id.action_mode_bar_stub)));
				if(callback != null)
				{
					((ViewStubCompat) (callback)).setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
					mActionModeView = (ActionBarContextView)((ViewStubCompat) (callback)).inflate();
				}
			}
		if(mActionModeView == null)
			continue; /* Loop/switch isn't completed */
		endOnGoingFadeAnimation();
		mActionModeView.killMode();
		callback = ((android.support.v7.view.ActionMode.Callback) (mActionModeView.getContext()));
		obj1 = ((Object) (mActionModeView));
		if(mActionModePopup == null)
			flag = true;
		else
			flag = false;
		callback = ((android.support.v7.view.ActionMode.Callback) (new StandaloneActionMode(((Context) (callback)), ((ActionBarContextView) (obj1)), ((android.support.v7.view.ActionMode.Callback) (obj)), flag)));
		if(((android.support.v7.view.ActionMode.Callback) (obj)).onCreateActionMode(((ActionMode) (callback)), ((ActionMode) (callback)).getMenu()))
		{
			((ActionMode) (callback)).invalidate();
			mActionModeView.initForMode(((ActionMode) (callback)));
			mActionMode = ((ActionMode) (callback));
			if(shouldAnimateActionModeView())
			{
				mActionModeView.setAlpha(0.0F);
				mFadeAnim = ViewCompat.animate(((View) (mActionModeView))).alpha(1.0F);
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
			} else
			{
				mActionModeView.setAlpha(1.0F);
				mActionModeView.setVisibility(0);
				mActionModeView.sendAccessibilityEvent(32);
				if(mActionModeView.getParent() instanceof View)
					ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
			}
			if(mActionModePopup != null)
				mWindow.getDecorView().post(mShowActionModePopup);
			continue; /* Loop/switch isn't completed */
		}
		mActionMode = null;
		if(true) goto _L4; else goto _L3
_L3:
	//* 286  605:goto            65
	}

	int updateStatusGuard(int i)
	{
		int k = 1;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		boolean flag = true;
	//    2    2:iconst_1        
	//    3    3:istore          4
		boolean flag1 = false;
	//    4    5:iconst_0        
	//    5    6:istore          5
		int j;
		if(mActionModeView != null && (mActionModeView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
	//*   6    8:aload_0         
	//*   7    9:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//*   8   12:ifnull          360
	//*   9   15:aload_0         
	//*  10   16:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//*  11   19:invokevirtual   #1270 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//*  12   22:instanceof      #1272 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  13   25:ifeq            360
		{
			Object obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams()));
	//   14   28:aload_0         
	//   15   29:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//   16   32:invokevirtual   #1270 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//   17   35:checkcast       #1272 <Class android.view.ViewGroup$MarginLayoutParams>
	//   18   38:astore          6
			if(mActionModeView.isShown())
	//*  19   40:aload_0         
	//*  20   41:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//*  21   44:invokevirtual   #1275 <Method boolean ActionBarContextView.isShown()>
	//*  22   47:ifeq            323
			{
				if(mTempRect1 == null)
	//*  23   50:aload_0         
	//*  24   51:getfield        #1277 <Field Rect mTempRect1>
	//*  25   54:ifnonnull       79
				{
					mTempRect1 = new Rect();
	//   26   57:aload_0         
	//   27   58:new             #1279 <Class Rect>
	//   28   61:dup             
	//   29   62:invokespecial   #1280 <Method void Rect()>
	//   30   65:putfield        #1277 <Field Rect mTempRect1>
					mTempRect2 = new Rect();
	//   31   68:aload_0         
	//   32   69:new             #1279 <Class Rect>
	//   33   72:dup             
	//   34   73:invokespecial   #1280 <Method void Rect()>
	//   35   76:putfield        #1282 <Field Rect mTempRect2>
				}
				Rect rect = mTempRect1;
	//   36   79:aload_0         
	//   37   80:getfield        #1277 <Field Rect mTempRect1>
	//   38   83:astore          7
				Rect rect1 = mTempRect2;
	//   39   85:aload_0         
	//   40   86:getfield        #1282 <Field Rect mTempRect2>
	//   41   89:astore          8
				rect.set(0, i, 0, 0);
	//   42   91:aload           7
	//   43   93:iconst_0        
	//   44   94:iload_1         
	//   45   95:iconst_0        
	//   46   96:iconst_0        
	//   47   97:invokevirtual   #1285 <Method void Rect.set(int, int, int, int)>
				ViewUtils.computeFitSystemWindows(((View) (mSubDecor)), rect, rect1);
	//   48  100:aload_0         
	//   49  101:getfield        #114 <Field ViewGroup mSubDecor>
	//   50  104:aload           7
	//   51  106:aload           8
	//   52  108:invokestatic    #1289 <Method void ViewUtils.computeFitSystemWindows(View, Rect, Rect)>
				if(rect1.top == 0)
	//*  53  111:aload           8
	//*  54  113:getfield        #1292 <Field int Rect.top>
	//*  55  116:ifne            274
					j = i;
	//   56  119:iload_1         
	//   57  120:istore_2        
				else
	//*  58  121:aload           6
	//*  59  123:getfield        #1295 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//*  60  126:iload_2         
	//*  61  127:icmpeq          355
	//*  62  130:aload           6
	//*  63  132:iload_1         
	//*  64  133:putfield        #1295 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//*  65  136:aload_0         
	//*  66  137:getfield        #1297 <Field View mStatusGuard>
	//*  67  140:ifnonnull       279
	//*  68  143:aload_0         
	//*  69  144:new             #135 <Class View>
	//*  70  147:dup             
	//*  71  148:aload_0         
	//*  72  149:getfield        #156 <Field Context mContext>
	//*  73  152:invokespecial   #1298 <Method void View(Context)>
	//*  74  155:putfield        #1297 <Field View mStatusGuard>
	//*  75  158:aload_0         
	//*  76  159:getfield        #1297 <Field View mStatusGuard>
	//*  77  162:aload_0         
	//*  78  163:getfield        #156 <Field Context mContext>
	//*  79  166:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  80  169:getstatic       #1303 <Field int android.support.v7.appcompat.R$color.abc_input_method_navigation_guard>
	//*  81  172:invokevirtual   #1306 <Method int Resources.getColor(int)>
	//*  82  175:invokevirtual   #1309 <Method void View.setBackgroundColor(int)>
	//*  83  178:aload_0         
	//*  84  179:getfield        #114 <Field ViewGroup mSubDecor>
	//*  85  182:aload_0         
	//*  86  183:getfield        #1297 <Field View mStatusGuard>
	//*  87  186:iconst_m1       
	//*  88  187:new             #673 <Class android.view.ViewGroup$LayoutParams>
	//*  89  190:dup             
	//*  90  191:iconst_m1       
	//*  91  192:iload_1         
	//*  92  193:invokespecial   #676 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//*  93  196:invokevirtual   #1312 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
	//*  94  199:iconst_1        
	//*  95  200:istore_2        
	//*  96  201:aload_0         
	//*  97  202:getfield        #1297 <Field View mStatusGuard>
	//*  98  205:ifnull          317
	//*  99  208:iload_1         
	//* 100  209:istore_3        
	//* 101  210:aload_0         
	//* 102  211:getfield        #303 <Field boolean mOverlayActionMode>
	//* 103  214:ifne            226
	//* 104  217:iload_1         
	//* 105  218:istore_3        
	//* 106  219:iload           4
	//* 107  221:ifeq            226
	//* 108  224:iconst_0        
	//* 109  225:istore_3        
	//* 110  226:iload_3         
	//* 111  227:istore_1        
	//* 112  228:iload_2         
	//* 113  229:istore_3        
	//* 114  230:iload           4
	//* 115  232:istore_2        
	//* 116  233:iload_3         
	//* 117  234:ifeq            246
	//* 118  237:aload_0         
	//* 119  238:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 120  241:aload           6
	//* 121  243:invokevirtual   #1316 <Method void ActionBarContextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 122  246:aload_0         
	//* 123  247:getfield        #1297 <Field View mStatusGuard>
	//* 124  250:ifnull          272
	//* 125  253:aload_0         
	//* 126  254:getfield        #1297 <Field View mStatusGuard>
	//* 127  257:astore          6
	//* 128  259:iload_2         
	//* 129  260:ifeq            342
	//* 130  263:iload           5
	//* 131  265:istore_2        
	//* 132  266:aload           6
	//* 133  268:iload_2         
	//* 134  269:invokevirtual   #1317 <Method void View.setVisibility(int)>
	//* 135  272:iload_1         
	//* 136  273:ireturn         
					j = 0;
	//  137  274:iconst_0        
	//  138  275:istore_2        
				if(((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != j)
				{
					obj.topMargin = i;
					if(mStatusGuard == null)
					{
						mStatusGuard = new View(mContext);
						mStatusGuard.setBackgroundColor(mContext.getResources().getColor(android.support.v7.appcompat.R.color.abc_input_method_navigation_guard));
						mSubDecor.addView(mStatusGuard, -1, new android.view.ViewGroup.LayoutParams(-1, i));
						j = 1;
					} else
	//* 139  276:goto            121
					{
						android.view.ViewGroup.LayoutParams layoutparams = mStatusGuard.getLayoutParams();
	//  140  279:aload_0         
	//  141  280:getfield        #1297 <Field View mStatusGuard>
	//  142  283:invokevirtual   #671 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  143  286:astore          7
						if(layoutparams.height != i)
	//* 144  288:aload           7
	//* 145  290:getfield        #1320 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 146  293:iload_1         
	//* 147  294:icmpeq          312
						{
							layoutparams.height = i;
	//  148  297:aload           7
	//  149  299:iload_1         
	//  150  300:putfield        #1320 <Field int android.view.ViewGroup$LayoutParams.height>
							mStatusGuard.setLayoutParams(layoutparams);
	//  151  303:aload_0         
	//  152  304:getfield        #1297 <Field View mStatusGuard>
	//  153  307:aload           7
	//  154  309:invokevirtual   #1321 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
						}
						j = 1;
	//  155  312:iconst_1        
	//  156  313:istore_2        
					}
				} else
	//* 157  314:goto            201
	//* 158  317:iconst_0        
	//* 159  318:istore          4
	//* 160  320:goto            208
	//* 161  323:aload           6
	//* 162  325:getfield        #1295 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//* 163  328:ifeq            348
	//* 164  331:aload           6
	//* 165  333:iconst_0        
	//* 166  334:putfield        #1295 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//* 167  337:iconst_0        
	//* 168  338:istore_2        
	//* 169  339:goto            233
	//* 170  342:bipush          8
	//* 171  344:istore_2        
	//* 172  345:goto            266
	//* 173  348:iconst_0        
	//* 174  349:istore_3        
	//* 175  350:iconst_0        
	//* 176  351:istore_2        
	//* 177  352:goto            233
				{
					j = 0;
	//  178  355:iconst_0        
	//  179  356:istore_2        
				}
				if(mStatusGuard == null)
					flag = false;
				k = i;
				if(!mOverlayActionMode)
				{
					k = i;
					if(flag)
						k = 0;
				}
				i = k;
				k = j;
				j = ((int) (flag));
			} else
			if(((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != 0)
			{
				obj.topMargin = 0;
				j = 0;
			} else
			{
				k = 0;
				j = 0;
			}
			if(k != 0)
				mActionModeView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
		} else
	//* 180  357:goto            201
		{
			j = 0;
	//  181  360:iconst_0        
	//  182  361:istore_2        
		}
		if(mStatusGuard != null)
		{
			obj = ((Object) (mStatusGuard));
			if(j != 0)
				j = ((int) (flag1));
			else
				j = 8;
			((View) (obj)).setVisibility(j);
		}
		return i;
	//* 183  362:goto            246
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
	//*   2    5:icmpge          15
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//*   7   14:return          
			flag = false;
	//    8   15:iconst_0        
	//    9   16:istore_0        
		IS_PRE_LOLLIPOP = flag;
	//*  10   17:goto            10
	}
}
