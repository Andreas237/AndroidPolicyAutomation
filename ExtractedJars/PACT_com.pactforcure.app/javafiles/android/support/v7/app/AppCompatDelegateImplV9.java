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
		Object obj;
		obj = ((Object) (mContext.obtainStyledAttributes(android.support.v7.appcompat.R.styleable.AppCompatTheme)));
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
		if(!((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowNoTitle, false)) goto _L2; else goto _L1
	//   16   35:aload_1         
	//   17   36:getstatic       #236 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowNoTitle>
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   20   43:ifeq            251
_L1:
		requestWindowFeature(1);
	//   21   46:aload_0         
	//   22   47:iconst_1        
	//   23   48:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//   24   51:pop             
_L10:
		Object obj1;
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, false))
	//*  25   52:aload_1         
	//*  26   53:getstatic       #246 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBarOverlay>
	//*  27   56:iconst_0        
	//*  28   57:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  29   60:ifeq            70
			requestWindowFeature(109);
	//   30   63:aload_0         
	//   31   64:bipush          109
	//   32   66:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//   33   69:pop             
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay, false))
	//*  34   70:aload_1         
	//*  35   71:getstatic       #249 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionModeOverlay>
	//*  36   74:iconst_0        
	//*  37   75:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//*  38   78:ifeq            88
			requestWindowFeature(10);
	//   39   81:aload_0         
	//   40   82:bipush          10
	//   41   84:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//   42   87:pop             
		mIsFloating = ((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating, false);
	//   43   88:aload_0         
	//   44   89:aload_1         
	//   45   90:getstatic       #252 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_android_windowIsFloating>
	//   46   93:iconst_0        
	//   47   94:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   48   97:putfield        #255 <Field boolean mIsFloating>
		((TypedArray) (obj)).recycle();
	//   49  100:aload_1         
	//   50  101:invokevirtual   #218 <Method void TypedArray.recycle()>
		mWindow.getDecorView();
	//   51  104:aload_0         
	//   52  105:getfield        #127 <Field Window mWindow>
	//   53  108:invokevirtual   #133 <Method View Window.getDecorView()>
	//   54  111:pop             
		obj1 = ((Object) (LayoutInflater.from(mContext)));
	//   55  112:aload_0         
	//   56  113:getfield        #156 <Field Context mContext>
	//   57  116:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//   58  119:astore_2        
		obj = null;
	//   59  120:aconst_null     
	//   60  121:astore_1        
		if(mWindowNoTitle) goto _L4; else goto _L3
	//   61  122:aload_0         
	//   62  123:getfield        #264 <Field boolean mWindowNoTitle>
	//   63  126:ifne            435
_L3:
		if(!mIsFloating) goto _L6; else goto _L5
	//   64  129:aload_0         
	//   65  130:getfield        #255 <Field boolean mIsFloating>
	//   66  133:ifeq            272
_L5:
		obj = ((Object) ((ViewGroup)((LayoutInflater) (obj1)).inflate(android.support.v7.appcompat.R.layout.abc_dialog_title_material, ((ViewGroup) (null)))));
	//   67  136:aload_2         
	//   68  137:getstatic       #269 <Field int android.support.v7.appcompat.R$layout.abc_dialog_title_material>
	//   69  140:aconst_null     
	//   70  141:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   71  144:checkcast       #117 <Class ViewGroup>
	//   72  147:astore_1        
		mOverlayActionBar = false;
	//   73  148:aload_0         
	//   74  149:iconst_0        
	//   75  150:putfield        #276 <Field boolean mOverlayActionBar>
		mHasActionBar = false;
	//   76  153:aload_0         
	//   77  154:iconst_0        
	//   78  155:putfield        #279 <Field boolean mHasActionBar>
_L8:
		if(obj == null)
	//*  79  158:aload_1         
	//*  80  159:ifnonnull       512
			throw new IllegalArgumentException((new StringBuilder()).append("AppCompat does not support the current theme features: { windowActionBar: ").append(mHasActionBar).append(", windowActionBarOverlay: ").append(mOverlayActionBar).append(", android:windowIsFloating: ").append(mIsFloating).append(", windowActionModeOverlay: ").append(mOverlayActionMode).append(", windowNoTitle: ").append(mWindowNoTitle).append(" }").toString());
	//   81  162:new             #281 <Class IllegalArgumentException>
	//   82  165:dup             
	//   83  166:new             #283 <Class StringBuilder>
	//   84  169:dup             
	//   85  170:invokespecial   #285 <Method void StringBuilder()>
	//   86  173:ldc2            #287 <String "AppCompat does not support the current theme features: { windowActionBar: ">
	//   87  176:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//   88  179:aload_0         
	//   89  180:getfield        #279 <Field boolean mHasActionBar>
	//   90  183:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//   91  186:ldc2            #296 <String ", windowActionBarOverlay: ">
	//   92  189:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//   93  192:aload_0         
	//   94  193:getfield        #276 <Field boolean mOverlayActionBar>
	//   95  196:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//   96  199:ldc2            #298 <String ", android:windowIsFloating: ">
	//   97  202:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//   98  205:aload_0         
	//   99  206:getfield        #255 <Field boolean mIsFloating>
	//  100  209:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//  101  212:ldc2            #300 <String ", windowActionModeOverlay: ">
	//  102  215:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//  103  218:aload_0         
	//  104  219:getfield        #303 <Field boolean mOverlayActionMode>
	//  105  222:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//  106  225:ldc2            #305 <String ", windowNoTitle: ">
	//  107  228:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//  108  231:aload_0         
	//  109  232:getfield        #264 <Field boolean mWindowNoTitle>
	//  110  235:invokevirtual   #294 <Method StringBuilder StringBuilder.append(boolean)>
	//  111  238:ldc2            #307 <String " }">
	//  112  241:invokevirtual   #291 <Method StringBuilder StringBuilder.append(String)>
	//  113  244:invokevirtual   #311 <Method String StringBuilder.toString()>
	//  114  247:invokespecial   #312 <Method void IllegalArgumentException(String)>
	//  115  250:athrow          
		break; /* Loop/switch isn't completed */
_L2:
		if(((TypedArray) (obj)).getBoolean(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBar, false))
	//* 116  251:aload_1         
	//* 117  252:getstatic       #226 <Field int android.support.v7.appcompat.R$styleable.AppCompatTheme_windowActionBar>
	//* 118  255:iconst_0        
	//* 119  256:invokevirtual   #240 <Method boolean TypedArray.getBoolean(int, boolean)>
	//* 120  259:ifeq            52
			requestWindowFeature(108);
	//  121  262:aload_0         
	//  122  263:bipush          108
	//  123  265:invokevirtual   #243 <Method boolean requestWindowFeature(int)>
	//  124  268:pop             
		continue; /* Loop/switch isn't completed */
	//  125  269:goto            52
_L6:
		if(mHasActionBar)
	//* 126  272:aload_0         
	//* 127  273:getfield        #279 <Field boolean mHasActionBar>
	//* 128  276:ifeq            158
		{
			obj = ((Object) (new TypedValue()));
	//  129  279:new             #314 <Class TypedValue>
	//  130  282:dup             
	//  131  283:invokespecial   #315 <Method void TypedValue()>
	//  132  286:astore_1        
			mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, ((TypedValue) (obj)), true);
	//  133  287:aload_0         
	//  134  288:getfield        #156 <Field Context mContext>
	//  135  291:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//  136  294:getstatic       #324 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//  137  297:aload_1         
	//  138  298:iconst_1        
	//  139  299:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//  140  302:pop             
			if(((TypedValue) (obj)).resourceId != 0)
	//* 141  303:aload_1         
	//* 142  304:getfield        #333 <Field int TypedValue.resourceId>
	//* 143  307:ifeq            427
				obj = ((Object) (new ContextThemeWrapper(mContext, ((TypedValue) (obj)).resourceId)));
	//  144  310:new             #335 <Class ContextThemeWrapper>
	//  145  313:dup             
	//  146  314:aload_0         
	//  147  315:getfield        #156 <Field Context mContext>
	//  148  318:aload_1         
	//  149  319:getfield        #333 <Field int TypedValue.resourceId>
	//  150  322:invokespecial   #338 <Method void ContextThemeWrapper(Context, int)>
	//  151  325:astore_1        
			else
	//* 152  326:aload_1         
	//* 153  327:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//* 154  330:getstatic       #341 <Field int android.support.v7.appcompat.R$layout.abc_screen_toolbar>
	//* 155  333:aconst_null     
	//* 156  334:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//* 157  337:checkcast       #117 <Class ViewGroup>
	//* 158  340:astore_2        
	//* 159  341:aload_0         
	//* 160  342:aload_2         
	//* 161  343:getstatic       #346 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//* 162  346:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//* 163  349:checkcast       #348 <Class DecorContentParent>
	//* 164  352:putfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 165  355:aload_0         
	//* 166  356:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 167  359:aload_0         
	//* 168  360:invokevirtual   #354 <Method android.view.Window$Callback getWindowCallback()>
	//* 169  363:invokeinterface #358 <Method void DecorContentParent.setWindowCallback(android.view.Window$Callback)>
	//* 170  368:aload_0         
	//* 171  369:getfield        #276 <Field boolean mOverlayActionBar>
	//* 172  372:ifeq            386
	//* 173  375:aload_0         
	//* 174  376:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 175  379:bipush          109
	//* 176  381:invokeinterface #362 <Method void DecorContentParent.initFeature(int)>
	//* 177  386:aload_0         
	//* 178  387:getfield        #364 <Field boolean mFeatureProgress>
	//* 179  390:ifeq            403
	//* 180  393:aload_0         
	//* 181  394:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 182  397:iconst_2        
	//* 183  398:invokeinterface #362 <Method void DecorContentParent.initFeature(int)>
	//* 184  403:aload_2         
	//* 185  404:astore_1        
	//* 186  405:aload_0         
	//* 187  406:getfield        #366 <Field boolean mFeatureIndeterminateProgress>
	//* 188  409:ifeq            158
	//* 189  412:aload_0         
	//* 190  413:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 191  416:iconst_5        
	//* 192  417:invokeinterface #362 <Method void DecorContentParent.initFeature(int)>
	//* 193  422:aload_2         
	//* 194  423:astore_1        
	//* 195  424:goto            158
				obj = ((Object) (mContext));
	//  196  427:aload_0         
	//  197  428:getfield        #156 <Field Context mContext>
	//  198  431:astore_1        
			obj1 = ((Object) ((ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.appcompat.R.layout.abc_screen_toolbar, ((ViewGroup) (null)))));
			mDecorContentParent = (DecorContentParent)((ViewGroup) (obj1)).findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
			mDecorContentParent.setWindowCallback(getWindowCallback());
			if(mOverlayActionBar)
				mDecorContentParent.initFeature(109);
			if(mFeatureProgress)
				mDecorContentParent.initFeature(2);
			obj = obj1;
			if(mFeatureIndeterminateProgress)
			{
				mDecorContentParent.initFeature(5);
				obj = obj1;
			}
		}
		continue; /* Loop/switch isn't completed */
	//  199  432:goto            326
_L4:
		if(mOverlayActionMode)
	//* 200  435:aload_0         
	//* 201  436:getfield        #303 <Field boolean mOverlayActionMode>
	//* 202  439:ifeq            477
			obj = ((Object) ((ViewGroup)((LayoutInflater) (obj1)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode, ((ViewGroup) (null)))));
	//  203  442:aload_2         
	//  204  443:getstatic       #369 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple_overlay_action_mode>
	//  205  446:aconst_null     
	//  206  447:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  207  450:checkcast       #117 <Class ViewGroup>
	//  208  453:astore_1        
		else
	//* 209  454:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//* 210  457:bipush          21
	//* 211  459:icmplt          492
	//* 212  462:aload_1         
	//* 213  463:new             #12  <Class AppCompatDelegateImplV9$2>
	//* 214  466:dup             
	//* 215  467:aload_0         
	//* 216  468:invokespecial   #370 <Method void AppCompatDelegateImplV9$2(AppCompatDelegateImplV9)>
	//* 217  471:invokestatic    #376 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//* 218  474:goto            158
			obj = ((Object) ((ViewGroup)((LayoutInflater) (obj1)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple, ((ViewGroup) (null)))));
	//  219  477:aload_2         
	//  220  478:getstatic       #379 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple>
	//  221  481:aconst_null     
	//  222  482:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  223  485:checkcast       #117 <Class ViewGroup>
	//  224  488:astore_1        
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
	//* 225  489:goto            454
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
	//  226  492:aload_1         
	//  227  493:checkcast       #381 <Class FitWindowsViewGroup>
	//  228  496:new             #14  <Class AppCompatDelegateImplV9$3>
	//  229  499:dup             
	//  230  500:aload_0         
	//  231  501:invokespecial   #382 <Method void AppCompatDelegateImplV9$3(AppCompatDelegateImplV9)>
	//  232  504:invokeinterface #386 <Method void FitWindowsViewGroup.setOnFitSystemWindowsListener(android.support.v7.widget.FitWindowsViewGroup$OnFitSystemWindowsListener)>
		if(true) goto _L8; else goto _L7
	//  233  509:goto            158
_L7:
		if(mDecorContentParent == null)
	//* 234  512:aload_0         
	//* 235  513:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//* 236  516:ifnonnull       533
			mTitleView = (TextView)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.title);
	//  237  519:aload_0         
	//  238  520:aload_1         
	//  239  521:getstatic       #389 <Field int android.support.v7.appcompat.R$id.title>
	//  240  524:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  241  527:checkcast       #391 <Class TextView>
	//  242  530:putfield        #393 <Field TextView mTitleView>
		ViewUtils.makeOptionalFitsSystemWindows(((View) (obj)));
	//  243  533:aload_1         
	//  244  534:invokestatic    #399 <Method void ViewUtils.makeOptionalFitsSystemWindows(View)>
		ContentFrameLayout contentframelayout = (ContentFrameLayout)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content);
	//  245  537:aload_1         
	//  246  538:getstatic       #402 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
	//  247  541:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  248  544:checkcast       #123 <Class ContentFrameLayout>
	//  249  547:astore_2        
		ViewGroup viewgroup = (ViewGroup)mWindow.findViewById(0x1020002);
	//  250  548:aload_0         
	//  251  549:getfield        #127 <Field Window mWindow>
	//  252  552:ldc1            #115 <Int 0x1020002>
	//  253  554:invokevirtual   #403 <Method View Window.findViewById(int)>
	//  254  557:checkcast       #117 <Class ViewGroup>
	//  255  560:astore_3        
		if(viewgroup != null)
	//* 256  561:aload_3         
	//* 257  562:ifnull          619
		{
			View view;
			for(; viewgroup.getChildCount() > 0; contentframelayout.addView(view))
	//* 258  565:aload_3         
	//* 259  566:invokevirtual   #406 <Method int ViewGroup.getChildCount()>
	//* 260  569:ifle            593
			{
				view = viewgroup.getChildAt(0);
	//  261  572:aload_3         
	//  262  573:iconst_0        
	//  263  574:invokevirtual   #409 <Method View ViewGroup.getChildAt(int)>
	//  264  577:astore          4
				viewgroup.removeViewAt(0);
	//  265  579:aload_3         
	//  266  580:iconst_0        
	//  267  581:invokevirtual   #412 <Method void ViewGroup.removeViewAt(int)>
			}

	//  268  584:aload_2         
	//  269  585:aload           4
	//  270  587:invokevirtual   #415 <Method void ContentFrameLayout.addView(View)>
	//* 271  590:goto            565
			viewgroup.setId(-1);
	//  272  593:aload_3         
	//  273  594:iconst_m1       
	//  274  595:invokevirtual   #418 <Method void ViewGroup.setId(int)>
			contentframelayout.setId(0x1020002);
	//  275  598:aload_2         
	//  276  599:ldc1            #115 <Int 0x1020002>
	//  277  601:invokevirtual   #419 <Method void ContentFrameLayout.setId(int)>
			if(viewgroup instanceof FrameLayout)
	//* 278  604:aload_3         
	//* 279  605:instanceof      #421 <Class FrameLayout>
	//* 280  608:ifeq            619
				((FrameLayout)viewgroup).setForeground(((android.graphics.drawable.Drawable) (null)));
	//  281  611:aload_3         
	//  282  612:checkcast       #421 <Class FrameLayout>
	//  283  615:aconst_null     
	//  284  616:invokevirtual   #425 <Method void FrameLayout.setForeground(android.graphics.drawable.Drawable)>
		}
		mWindow.setContentView(((View) (obj)));
	//  285  619:aload_0         
	//  286  620:getfield        #127 <Field Window mWindow>
	//  287  623:aload_1         
	//  288  624:invokevirtual   #428 <Method void Window.setContentView(View)>
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
	//  289  627:aload_2         
	//  290  628:new             #16  <Class AppCompatDelegateImplV9$4>
	//  291  631:dup             
	//  292  632:aload_0         
	//  293  633:invokespecial   #429 <Method void AppCompatDelegateImplV9$4(AppCompatDelegateImplV9)>
	//  294  636:invokevirtual   #433 <Method void ContentFrameLayout.setAttachListener(android.support.v7.widget.ContentFrameLayout$OnAttachListener)>
		return ((ViewGroup) (obj));
	//  295  639:aload_1         
	//  296  640:areturn         
		if(true) goto _L10; else goto _L9
_L9:
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
		} else
	//*   7   15:iconst_1        
	//*   8   16:ireturn         
		{
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
			if(panelfeaturestate.shownPanelView == null)
	//*  30   60:aload_1         
	//*  31   61:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//*  32   64:ifnonnull       15
				return false;
	//   33   67:iconst_0        
	//   34   68:ireturn         
		}
		return true;
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
label0:
		{
			Context context = mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field Context mContext>
	//    2    4:astore          4
			Object obj;
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
	//   11   22:icmpne          176
			}
			obj = ((Object) (context));
	//   12   25:aload           4
	//   13   27:astore_2        
			if(mDecorContentParent != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  16   32:ifnull          176
			{
				TypedValue typedvalue = new TypedValue();
	//   17   35:new             #314 <Class TypedValue>
	//   18   38:dup             
	//   19   39:invokespecial   #315 <Method void TypedValue()>
	//   20   42:astore          5
				android.content.res.Resources.Theme theme = context.getTheme();
	//   21   44:aload           4
	//   22   46:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   23   49:astore          6
				theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedvalue, true);
	//   24   51:aload           6
	//   25   53:getstatic       #324 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//   26   56:aload           5
	//   27   58:iconst_1        
	//   28   59:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   29   62:pop             
				obj = null;
	//   30   63:aconst_null     
	//   31   64:astore_2        
				Object obj1;
				if(typedvalue.resourceId != 0)
	//*  32   65:aload           5
	//*  33   67:getfield        #333 <Field int TypedValue.resourceId>
	//*  34   70:ifeq            197
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
	//   44   91:getfield        #333 <Field int TypedValue.resourceId>
	//   45   94:iconst_1        
	//   46   95:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
					((android.content.res.Resources.Theme) (obj)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//   47   98:aload_2         
	//   48   99:getstatic       #533 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//   49  102:aload           5
	//   50  104:iconst_1        
	//   51  105:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   52  108:pop             
				} else
	//*  53  109:aload_2         
	//*  54  110:astore_3        
	//*  55  111:aload           5
	//*  56  113:getfield        #333 <Field int TypedValue.resourceId>
	//*  57  116:ifeq            150
	//*  58  119:aload_2         
	//*  59  120:astore_3        
	//*  60  121:aload_2         
	//*  61  122:ifnonnull       140
	//*  62  125:aload           4
	//*  63  127:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  64  130:invokevirtual   #522 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//*  65  133:astore_3        
	//*  66  134:aload_3         
	//*  67  135:aload           6
	//*  68  137:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//*  69  140:aload_3         
	//*  70  141:aload           5
	//*  71  143:getfield        #333 <Field int TypedValue.resourceId>
	//*  72  146:iconst_1        
	//*  73  147:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
	//*  74  150:aload           4
	//*  75  152:astore_2        
	//*  76  153:aload_3         
	//*  77  154:ifnull          176
	//*  78  157:new             #335 <Class ContextThemeWrapper>
	//*  79  160:dup             
	//*  80  161:aload           4
	//*  81  163:iconst_0        
	//*  82  164:invokespecial   #338 <Method void ContextThemeWrapper(Context, int)>
	//*  83  167:astore_2        
	//*  84  168:aload_2         
	//*  85  169:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  86  172:aload_3         
	//*  87  173:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//*  88  176:new             #535 <Class MenuBuilder>
	//*  89  179:dup             
	//*  90  180:aload_2         
	//*  91  181:invokespecial   #537 <Method void MenuBuilder(Context)>
	//*  92  184:astore_2        
	//*  93  185:aload_2         
	//*  94  186:aload_0         
	//*  95  187:invokevirtual   #541 <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
	//*  96  190:aload_1         
	//*  97  191:aload_2         
	//*  98  192:invokevirtual   #545 <Method void AppCompatDelegateImplV9$PanelFeatureState.setMenu(MenuBuilder)>
	//*  99  195:iconst_1        
	//* 100  196:ireturn         
				{
					theme.resolveAttribute(android.support.v7.appcompat.R.attr.actionBarWidgetTheme, typedvalue, true);
	//  101  197:aload           6
	//  102  199:getstatic       #533 <Field int android.support.v7.appcompat.R$attr.actionBarWidgetTheme>
	//  103  202:aload           5
	//  104  204:iconst_1        
	//  105  205:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//  106  208:pop             
				}
				obj1 = obj;
				if(typedvalue.resourceId != 0)
				{
					obj1 = obj;
					if(obj == null)
					{
						obj1 = ((Object) (context.getResources().newTheme()));
						((android.content.res.Resources.Theme) (obj1)).setTo(theme);
					}
					((android.content.res.Resources.Theme) (obj1)).applyStyle(typedvalue.resourceId, true);
				}
				obj = ((Object) (context));
				if(obj1 != null)
				{
					obj = ((Object) (new ContextThemeWrapper(context, 0)));
					((Context) (obj)).getTheme().setTo(((android.content.res.Resources.Theme) (obj1)));
				}
			}
		}
		obj = ((Object) (new MenuBuilder(((Context) (obj)))));
		((MenuBuilder) (obj)).setCallback(((android.support.v7.view.menu.MenuBuilder.Callback) (this)));
		panelfeaturestate.setMenu(((MenuBuilder) (obj)));
		return true;
	//* 107  209:goto            109
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
		if(mActionMode == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #570 <Field ActionMode mActionMode>
	//    2    4:ifnull          13
_L1:
		boolean flag1 = false;
	//    3    7:iconst_0        
	//    4    8:istore          4
_L5:
		return flag1;
	//    5   10:iload           4
	//    6   12:ireturn         
_L2:
		boolean flag3;
		PanelFeatureState panelfeaturestate;
		flag3 = false;
	//    7   13:iconst_0        
	//    8   14:istore          5
		panelfeaturestate = getPanelState(i, true);
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:iconst_1        
	//   12   19:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   13   22:astore          6
		if(i != 0 || mDecorContentParent == null || !mDecorContentParent.canShowOverflowMenu() || ViewConfiguration.get(mContext).hasPermanentMenuKey()) goto _L4; else goto _L3
	//   14   24:iload_1         
	//   15   25:ifne            150
	//   16   28:aload_0         
	//   17   29:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   18   32:ifnull          150
	//   19   35:aload_0         
	//   20   36:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   21   39:invokeinterface #573 <Method boolean DecorContentParent.canShowOverflowMenu()>
	//   22   44:ifeq            150
	//   23   47:aload_0         
	//   24   48:getfield        #156 <Field Context mContext>
	//   25   51:invokestatic    #579 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   26   54:invokevirtual   #582 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//   27   57:ifne            150
_L3:
		boolean flag;
		if(!mDecorContentParent.isOverflowMenuShowing())
	//*  28   60:aload_0         
	//*  29   61:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  30   64:invokeinterface #585 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  31   69:ifne            137
		{
			flag = flag3;
	//   32   72:iload           5
	//   33   74:istore_3        
			if(!isDestroyed())
	//*  34   75:aload_0         
	//*  35   76:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  36   79:ifne            105
			{
				flag = flag3;
	//   37   82:iload           5
	//   38   84:istore_3        
				if(preparePanel(panelfeaturestate, keyevent))
	//*  39   85:aload_0         
	//*  40   86:aload           6
	//*  41   88:aload_2         
	//*  42   89:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//*  43   92:ifeq            105
					flag = mDecorContentParent.showOverflowMenu();
	//   44   95:aload_0         
	//   45   96:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   46   99:invokeinterface #588 <Method boolean DecorContentParent.showOverflowMenu()>
	//   47  104:istore_3        
			}
		} else
	//*  48  105:iload_3         
	//*  49  106:istore          4
	//*  50  108:iload_3         
	//*  51  109:ifeq            10
	//*  52  112:aload_0         
	//*  53  113:getfield        #156 <Field Context mContext>
	//*  54  116:ldc2            #590 <String "audio">
	//*  55  119:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//*  56  122:checkcast       #596 <Class AudioManager>
	//*  57  125:astore_2        
	//*  58  126:aload_2         
	//*  59  127:ifnull          239
	//*  60  130:aload_2         
	//*  61  131:iconst_0        
	//*  62  132:invokevirtual   #599 <Method void AudioManager.playSoundEffect(int)>
	//*  63  135:iload_3         
	//*  64  136:ireturn         
		{
			flag = mDecorContentParent.hideOverflowMenu();
	//   65  137:aload_0         
	//   66  138:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//   67  141:invokeinterface #602 <Method boolean DecorContentParent.hideOverflowMenu()>
	//   68  146:istore_3        
		}
_L6:
		flag1 = flag;
		if(flag)
		{
			keyevent = ((KeyEvent) ((AudioManager)mContext.getSystemService("audio")));
			boolean flag2;
			if(keyevent != null)
			{
				((AudioManager) (keyevent)).playSoundEffect(0);
				return flag;
			} else
	//*  69  147:goto            105
	//*  70  150:aload           6
	//*  71  152:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  72  155:ifne            166
	//*  73  158:aload           6
	//*  74  160:getfield        #605 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
	//*  75  163:ifeq            182
	//*  76  166:aload           6
	//*  77  168:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  78  171:istore_3        
	//*  79  172:aload_0         
	//*  80  173:aload           6
	//*  81  175:iconst_1        
	//*  82  176:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
	//*  83  179:goto            105
	//*  84  182:iload           5
	//*  85  184:istore_3        
	//*  86  185:aload           6
	//*  87  187:getfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*  88  190:ifeq            105
	//*  89  193:iconst_1        
	//*  90  194:istore          4
	//*  91  196:aload           6
	//*  92  198:getfield        #615 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  93  201:ifeq            219
	//*  94  204:aload           6
	//*  95  206:iconst_0        
	//*  96  207:putfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*  97  210:aload_0         
	//*  98  211:aload           6
	//*  99  213:aload_2         
	//* 100  214:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//* 101  217:istore          4
	//* 102  219:iload           5
	//* 103  221:istore_3        
	//* 104  222:iload           4
	//* 105  224:ifeq            105
	//* 106  227:aload_0         
	//* 107  228:aload           6
	//* 108  230:aload_2         
	//* 109  231:invokespecial   #619 <Method void openPanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//* 110  234:iconst_1        
	//* 111  235:istore_3        
	//* 112  236:goto            105
			{
				Log.w("AppCompatDelegate", "Couldn't get audio manager");
	//  113  239:ldc2            #621 <String "AppCompatDelegate">
	//  114  242:ldc2            #623 <String "Couldn't get audio manager">
	//  115  245:invokestatic    #629 <Method int Log.w(String, String)>
	//  116  248:pop             
				return flag;
	//  117  249:iload_3         
	//  118  250:ireturn         
			}
		}
		if(true) goto _L5; else goto _L4
_L4:
		if(panelfeaturestate.isOpen || panelfeaturestate.isHandled)
		{
			flag = panelfeaturestate.isOpen;
			closePanel(panelfeaturestate, true);
		} else
		{
			flag = flag3;
			if(panelfeaturestate.isPrepared)
			{
				flag2 = true;
				if(panelfeaturestate.refreshMenuContent)
				{
					panelfeaturestate.isPrepared = false;
					flag2 = preparePanel(panelfeaturestate, keyevent);
				}
				flag = flag3;
				if(flag2)
				{
					openPanel(panelfeaturestate, keyevent);
					flag = true;
				}
			}
		}
		  goto _L6
	}

	private void openPanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
	{
		if(!panelfeaturestate.isOpen && !isDestroyed()) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:invokevirtual   #466 <Method boolean isDestroyed()>
	//    5   11:ifeq            15
_L1:
		return;
	//    6   14:return          
_L2:
		if(panelfeaturestate.featureId != 0)
			break; /* Loop/switch isn't completed */
	//    7   15:aload_1         
	//    8   16:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//    9   19:ifne            73
		Object obj = ((Object) (mContext));
	//   10   22:aload_0         
	//   11   23:getfield        #156 <Field Context mContext>
	//   12   26:astore          5
		boolean flag;
		boolean flag1;
		if((((Context) (obj)).getResources().getConfiguration().screenLayout & 0xf) == 4)
	//*  13   28:aload           5
	//*  14   30:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  15   33:invokevirtual   #633 <Method Configuration Resources.getConfiguration()>
	//*  16   36:getfield        #638 <Field int Configuration.screenLayout>
	//*  17   39:bipush          15
	//*  18   41:iand            
	//*  19   42:iconst_4        
	//*  20   43:icmpne          109
			flag = true;
	//   21   46:iconst_1        
	//   22   47:istore_3        
		else
	//*  23   48:aload           5
	//*  24   50:invokevirtual   #642 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  25   53:getfield        #647 <Field int ApplicationInfo.targetSdkVersion>
	//*  26   56:bipush          11
	//*  27   58:icmplt          114
	//*  28   61:iconst_1        
	//*  29   62:istore          4
	//*  30   64:iload_3         
	//*  31   65:ifeq            73
	//*  32   68:iload           4
	//*  33   70:ifne            14
	//*  34   73:aload_0         
	//*  35   74:invokevirtual   #354 <Method android.view.Window$Callback getWindowCallback()>
	//*  36   77:astore          5
	//*  37   79:aload           5
	//*  38   81:ifnull          120
	//*  39   84:aload           5
	//*  40   86:aload_1         
	//*  41   87:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  42   90:aload_1         
	//*  43   91:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  44   94:invokeinterface #653 <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//*  45   99:ifne            120
	//*  46  102:aload_0         
	//*  47  103:aload_1         
	//*  48  104:iconst_1        
	//*  49  105:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
	//*  50  108:return          
			flag = false;
	//   51  109:iconst_0        
	//   52  110:istore_3        
		if(((Context) (obj)).getApplicationInfo().targetSdkVersion >= 11)
			flag1 = true;
		else
	//*  53  111:goto            48
			flag1 = false;
	//   54  114:iconst_0        
	//   55  115:istore          4
		if(flag && flag1) goto _L1; else goto _L3
_L3:
		WindowManager windowmanager;
		obj = ((Object) (getWindowCallback()));
		if(obj != null && !((android.view.Window.Callback) (obj)).onMenuOpened(panelfeaturestate.featureId, ((Menu) (panelfeaturestate.menu))))
		{
			closePanel(panelfeaturestate, true);
			return;
		}
	//*  56  117:goto            64
		windowmanager = (WindowManager)mContext.getSystemService("window");
	//   57  120:aload_0         
	//   58  121:getfield        #156 <Field Context mContext>
	//   59  124:ldc2            #655 <String "window">
	//   60  127:invokevirtual   #594 <Method Object Context.getSystemService(String)>
	//   61  130:checkcast       #657 <Class WindowManager>
	//   62  133:astore          6
		if(windowmanager == null || !preparePanel(panelfeaturestate, keyevent)) goto _L1; else goto _L4
	//   63  135:aload           6
	//   64  137:ifnull          14
	//   65  140:aload_0         
	//   66  141:aload_1         
	//   67  142:aload_2         
	//   68  143:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   69  146:ifeq            14
_L4:
		byte byte0;
		byte0 = -2;
	//   70  149:bipush          -2
	//   71  151:istore          4
		if(panelfeaturestate.decorView != null && !panelfeaturestate.refreshDecorView)
			break MISSING_BLOCK_LABEL_409;
	//   72  153:aload_1         
	//   73  154:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//   74  157:ifnull          167
	//   75  160:aload_1         
	//   76  161:getfield        #660 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
	//   77  164:ifeq            409
		if(panelfeaturestate.decorView != null) goto _L6; else goto _L5
	//   78  167:aload_1         
	//   79  168:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//   80  171:ifnonnull       382
_L5:
		if(!initializePanelDecor(panelfeaturestate) || panelfeaturestate.decorView == null) goto _L1; else goto _L7
	//   81  174:aload_0         
	//   82  175:aload_1         
	//   83  176:invokespecial   #662 <Method boolean initializePanelDecor(AppCompatDelegateImplV9$PanelFeatureState)>
	//   84  179:ifeq            14
	//   85  182:aload_1         
	//   86  183:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//   87  186:ifnull          14
_L7:
		if(!initializePanelContent(panelfeaturestate) || !panelfeaturestate.hasPanelItems()) goto _L1; else goto _L8
	//   88  189:aload_0         
	//   89  190:aload_1         
	//   90  191:invokespecial   #664 <Method boolean initializePanelContent(AppCompatDelegateImplV9$PanelFeatureState)>
	//   91  194:ifeq            14
	//   92  197:aload_1         
	//   93  198:invokevirtual   #667 <Method boolean AppCompatDelegateImplV9$PanelFeatureState.hasPanelItems()>
	//   94  201:ifeq            14
_L8:
		int i;
		Object obj1 = ((Object) (panelfeaturestate.shownPanelView.getLayoutParams()));
	//   95  204:aload_1         
	//   96  205:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//   97  208:invokevirtual   #671 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   98  211:astore          5
		keyevent = ((KeyEvent) (obj1));
	//   99  213:aload           5
	//  100  215:astore_2        
		if(obj1 == null)
	//* 101  216:aload           5
	//* 102  218:ifnonnull       233
			keyevent = ((KeyEvent) (new android.view.ViewGroup.LayoutParams(-2, -2)));
	//  103  221:new             #673 <Class android.view.ViewGroup$LayoutParams>
	//  104  224:dup             
	//  105  225:bipush          -2
	//  106  227:bipush          -2
	//  107  229:invokespecial   #676 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  108  232:astore_2        
		i = panelfeaturestate.background;
	//  109  233:aload_1         
	//  110  234:getfield        #679 <Field int AppCompatDelegateImplV9$PanelFeatureState.background>
	//  111  237:istore_3        
		panelfeaturestate.decorView.setBackgroundResource(i);
	//  112  238:aload_1         
	//  113  239:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  114  242:iload_3         
	//  115  243:invokevirtual   #682 <Method void ViewGroup.setBackgroundResource(int)>
		obj1 = ((Object) (panelfeaturestate.shownPanelView.getParent()));
	//  116  246:aload_1         
	//  117  247:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  118  250:invokevirtual   #686 <Method ViewParent View.getParent()>
	//  119  253:astore          5
		if(obj1 != null && (obj1 instanceof ViewGroup))
	//* 120  255:aload           5
	//* 121  257:ifnull          280
	//* 122  260:aload           5
	//* 123  262:instanceof      #117 <Class ViewGroup>
	//* 124  265:ifeq            280
			((ViewGroup)obj1).removeView(panelfeaturestate.shownPanelView);
	//  125  268:aload           5
	//  126  270:checkcast       #117 <Class ViewGroup>
	//  127  273:aload_1         
	//  128  274:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  129  277:invokevirtual   #689 <Method void ViewGroup.removeView(View)>
		panelfeaturestate.decorView.addView(panelfeaturestate.shownPanelView, ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  130  280:aload_1         
	//  131  281:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  132  284:aload_1         
	//  133  285:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  134  288:aload_2         
	//  135  289:invokevirtual   #692 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		i = ((int) (byte0));
	//  136  292:iload           4
	//  137  294:istore_3        
		if(!panelfeaturestate.shownPanelView.hasFocus())
	//* 138  295:aload_1         
	//* 139  296:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//* 140  299:invokevirtual   #695 <Method boolean View.hasFocus()>
	//* 141  302:ifne            316
		{
			panelfeaturestate.shownPanelView.requestFocus();
	//  142  305:aload_1         
	//  143  306:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  144  309:invokevirtual   #698 <Method boolean View.requestFocus()>
	//  145  312:pop             
			i = ((int) (byte0));
	//  146  313:iload           4
	//  147  315:istore_3        
		}
_L9:
		panelfeaturestate.isHandled = false;
	//  148  316:aload_1         
	//  149  317:iconst_0        
	//  150  318:putfield        #605 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
		keyevent = ((KeyEvent) (new android.view.WindowManager.LayoutParams(i, -2, panelfeaturestate.x, panelfeaturestate.y, 1002, 0x820000, -3)));
	//  151  321:new             #700 <Class android.view.WindowManager$LayoutParams>
	//  152  324:dup             
	//  153  325:iload_3         
	//  154  326:bipush          -2
	//  155  328:aload_1         
	//  156  329:getfield        #703 <Field int AppCompatDelegateImplV9$PanelFeatureState.x>
	//  157  332:aload_1         
	//  158  333:getfield        #706 <Field int AppCompatDelegateImplV9$PanelFeatureState.y>
	//  159  336:sipush          1002
	//  160  339:ldc2            #707 <Int 0x820000>
	//  161  342:bipush          -3
	//  162  344:invokespecial   #710 <Method void android.view.WindowManager$LayoutParams(int, int, int, int, int, int, int)>
	//  163  347:astore_2        
		keyevent.gravity = panelfeaturestate.gravity;
	//  164  348:aload_2         
	//  165  349:aload_1         
	//  166  350:getfield        #509 <Field int AppCompatDelegateImplV9$PanelFeatureState.gravity>
	//  167  353:putfield        #711 <Field int android.view.WindowManager$LayoutParams.gravity>
		keyevent.windowAnimations = panelfeaturestate.windowAnimations;
	//  168  356:aload_2         
	//  169  357:aload_1         
	//  170  358:getfield        #714 <Field int AppCompatDelegateImplV9$PanelFeatureState.windowAnimations>
	//  171  361:putfield        #715 <Field int android.view.WindowManager$LayoutParams.windowAnimations>
		windowmanager.addView(((View) (panelfeaturestate.decorView)), ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  172  364:aload           6
	//  173  366:aload_1         
	//  174  367:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  175  370:aload_2         
	//  176  371:invokeinterface #716 <Method void WindowManager.addView(View, android.view.ViewGroup$LayoutParams)>
		panelfeaturestate.isOpen = true;
	//  177  376:aload_1         
	//  178  377:iconst_1        
	//  179  378:putfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
		return;
	//  180  381:return          
_L6:
		if(panelfeaturestate.refreshDecorView && panelfeaturestate.decorView.getChildCount() > 0)
	//* 181  382:aload_1         
	//* 182  383:getfield        #660 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
	//* 183  386:ifeq            189
	//* 184  389:aload_1         
	//* 185  390:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//* 186  393:invokevirtual   #406 <Method int ViewGroup.getChildCount()>
	//* 187  396:ifle            189
			panelfeaturestate.decorView.removeAllViews();
	//  188  399:aload_1         
	//  189  400:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  190  403:invokevirtual   #719 <Method void ViewGroup.removeAllViews()>
		  goto _L7
	//* 191  406:goto            189
		i = ((int) (byte0));
	//  192  409:iload           4
	//  193  411:istore_3        
		if(panelfeaturestate.createdPanelView != null)
	//* 194  412:aload_1         
	//* 195  413:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//* 196  416:ifnull          316
		{
			keyevent = ((KeyEvent) (panelfeaturestate.createdPanelView.getLayoutParams()));
	//  197  419:aload_1         
	//  198  420:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//  199  423:invokevirtual   #671 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  200  426:astore_2        
			i = ((int) (byte0));
	//  201  427:iload           4
	//  202  429:istore_3        
			if(keyevent != null)
	//* 203  430:aload_2         
	//* 204  431:ifnull          316
			{
				i = ((int) (byte0));
	//  205  434:iload           4
	//  206  436:istore_3        
				if(((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1)
	//* 207  437:aload_2         
	//* 208  438:getfield        #722 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 209  441:iconst_m1       
	//* 210  442:icmpne          316
					i = -1;
	//  211  445:iconst_m1       
	//  212  446:istore_3        
			}
		}
		  goto _L9
	//* 213  447:goto            316
	}

	private boolean performPanelShortcut(PanelFeatureState panelfeaturestate, int i, KeyEvent keyevent, int j)
	{
		if(!keyevent.isSystem()) goto _L2; else goto _L1
	//    0    0:aload_3         
	//    1    1:invokevirtual   #727 <Method boolean KeyEvent.isSystem()>
	//    2    4:ifeq            13
_L1:
		boolean flag1 = false;
	//    3    7:iconst_0        
	//    4    8:istore          6
_L4:
		return flag1;
	//    5   10:iload           6
	//    6   12:ireturn         
_L2:
		boolean flag;
label0:
		{
			flag1 = false;
	//    7   13:iconst_0        
	//    8   14:istore          6
			if(!panelfeaturestate.isPrepared)
	//*   9   16:aload_1         
	//*  10   17:getfield        #612 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
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
	//   29   55:invokevirtual   #731 <Method boolean MenuBuilder.performShortcut(int, KeyEvent, int)>
	//   30   58:istore          5
		}
		flag1 = flag;
	//   31   60:iload           5
	//   32   62:istore          6
		if(flag)
	//*  33   64:iload           5
	//*  34   66:ifeq            10
		{
			flag1 = flag;
	//   35   69:iload           5
	//   36   71:istore          6
			if((j & 1) == 0)
	//*  37   73:iload           4
	//*  38   75:iconst_1        
	//*  39   76:iand            
	//*  40   77:ifne            10
			{
				flag1 = flag;
	//   41   80:iload           5
	//   42   82:istore          6
				if(mDecorContentParent == null)
	//*  43   84:aload_0         
	//*  44   85:getfield        #350 <Field DecorContentParent mDecorContentParent>
	//*  45   88:ifnonnull       10
				{
					closePanel(panelfeaturestate, true);
	//   46   91:aload_0         
	//   47   92:aload_1         
	//   48   93:iconst_1        
	//   49   94:invokevirtual   #609 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
					return flag;
	//   50   97:iload           5
	//   51   99:ireturn         
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
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          5
		if(IS_PRE_LOLLIPOP)
	//*  10   21:getstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//*  11   24:ifeq            52
			if(attributeset instanceof XmlPullParser)
	//*  12   27:aload           4
	//*  13   29:instanceof      #877 <Class XmlPullParser>
	//*  14   32:ifeq            80
			{
				if(((XmlPullParser)attributeset).getDepth() > 1)
	//*  15   35:aload           4
	//*  16   37:checkcast       #877 <Class XmlPullParser>
	//*  17   40:invokeinterface #880 <Method int XmlPullParser.getDepth()>
	//*  18   45:iconst_1        
	//*  19   46:icmple          74
					flag = true;
	//   20   49:iconst_1        
	//   21   50:istore          5
				else
	//*  22   52:aload_0         
	//*  23   53:getfield        #872 <Field AppCompatViewInflater mAppCompatViewInflater>
	//*  24   56:aload_1         
	//*  25   57:aload_2         
	//*  26   58:aload_3         
	//*  27   59:aload           4
	//*  28   61:iload           5
	//*  29   63:getstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//*  30   66:iconst_1        
	//*  31   67:invokestatic    #885 <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//*  32   70:invokevirtual   #888 <Method View AppCompatViewInflater.createView(View, String, Context, AttributeSet, boolean, boolean, boolean, boolean)>
	//*  33   73:areturn         
					flag = false;
	//   34   74:iconst_0        
	//   35   75:istore          5
			} else
	//*  36   77:goto            52
			{
				flag = shouldInheritContext((ViewParent)view);
	//   37   80:aload_0         
	//   38   81:aload_1         
	//   39   82:checkcast       #828 <Class ViewParent>
	//   40   85:invokespecial   #890 <Method boolean shouldInheritContext(ViewParent)>
	//   41   88:istore          5
			}
		return mAppCompatViewInflater.createView(view, s, context, attributeset, flag, IS_PRE_LOLLIPOP, true, VectorEnabledTintResources.shouldBeUsed());
	//*  42   90:goto            52
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
		if(keyevent.getKeyCode() == 82 && mOriginalWindowCallback.dispatchKeyEvent(keyevent))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #914 <Method int KeyEvent.getKeyCode()>
	//*   2    4:bipush          82
	//*   3    6:icmpne          24
	//*   4    9:aload_0         
	//*   5   10:getfield        #842 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   6   13:aload_1         
	//*   7   14:invokeinterface #916 <Method boolean android.view.Window$Callback.dispatchKeyEvent(KeyEvent)>
	//*   8   19:ifeq            24
			return true;
	//    9   22:iconst_1        
	//   10   23:ireturn         
		int i = keyevent.getKeyCode();
	//   11   24:aload_1         
	//   12   25:invokevirtual   #914 <Method int KeyEvent.getKeyCode()>
	//   13   28:istore_3        
		boolean flag;
		if(keyevent.getAction() == 0)
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #919 <Method int KeyEvent.getAction()>
	//*  16   33:ifne            49
			flag = true;
	//   17   36:iconst_1        
	//   18   37:istore_2        
		else
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
	//   10   18:icmpgt          55
			}
			PanelFeatureState apanelfeaturestate2[] = new PanelFeatureState[i + 1];
	//   11   21:iload_1         
	//   12   22:iconst_1        
	//   13   23:iadd            
	//   14   24:anewarray       PanelFeatureState[]
	//   15   27:astore          5
			if(apanelfeaturestate1 != null)
	//*  16   29:aload           4
	//*  17   31:ifnull          46
				System.arraycopy(((Object) (apanelfeaturestate1)), 0, ((Object) (apanelfeaturestate2)), 0, apanelfeaturestate1.length);
	//   18   34:aload           4
	//   19   36:iconst_0        
	//   20   37:aload           5
	//   21   39:iconst_0        
	//   22   40:aload           4
	//   23   42:arraylength     
	//   24   43:invokestatic    #956 <Method void System.arraycopy(Object, int, Object, int, int)>
			apanelfeaturestate = apanelfeaturestate2;
	//   25   46:aload           5
	//   26   48:astore_3        
			mPanels = apanelfeaturestate2;
	//   27   49:aload_0         
	//   28   50:aload           5
	//   29   52:putfield        #857 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
		}
		PanelFeatureState panelfeaturestate1 = apanelfeaturestate[i];
	//   30   55:aload_3         
	//   31   56:iload_1         
	//   32   57:aaload          
	//   33   58:astore          5
		PanelFeatureState panelfeaturestate = panelfeaturestate1;
	//   34   60:aload           5
	//   35   62:astore          4
		if(panelfeaturestate1 == null)
	//*  36   64:aload           5
	//*  37   66:ifnonnull       84
		{
			panelfeaturestate = new PanelFeatureState(i);
	//   38   69:new             #35  <Class AppCompatDelegateImplV9$PanelFeatureState>
	//   39   72:dup             
	//   40   73:iload_1         
	//   41   74:invokespecial   #958 <Method void AppCompatDelegateImplV9$PanelFeatureState(int)>
	//   42   77:astore          4
			apanelfeaturestate[i] = panelfeaturestate;
	//   43   79:aload_3         
	//   44   80:iload_1         
	//   45   81:aload           4
	//   46   83:aastore         
		}
		return panelfeaturestate;
	//   47   84:aload           4
	//   48   86:areturn         
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
		Object obj1 = null;
	//   19   39:aconst_null     
	//   20   40:astore          5
		callback = ((android.support.v7.view.ActionMode.Callback) (obj1));
	//   21   42:aload           5
	//   22   44:astore_1        
		if(mAppCompatCallback != null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//*  25   49:ifnull          74
		{
			callback = ((android.support.v7.view.ActionMode.Callback) (obj1));
	//   26   52:aload           5
	//   27   54:astore_1        
			int i;
			boolean flag;
			android.content.res.Resources.Theme theme;
			if(!isDestroyed())
	//*  28   55:aload_0         
	//*  29   56:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  30   59:ifne            74
				try
				{
					callback = ((android.support.v7.view.ActionMode.Callback) (mAppCompatCallback.onWindowStartingSupportActionMode(((android.support.v7.view.ActionMode.Callback) (obj)))));
	//   31   62:aload_0         
	//   32   63:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//   33   66:aload           4
	//   34   68:invokeinterface #1156 <Method ActionMode AppCompatCallback.onWindowStartingSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//   35   73:astore_1        
				}
	//*  36   74:aload_1         
	//*  37   75:ifnull          115
	//*  38   78:aload_0         
	//*  39   79:aload_1         
	//*  40   80:putfield        #570 <Field ActionMode mActionMode>
	//*  41   83:aload_0         
	//*  42   84:getfield        #570 <Field ActionMode mActionMode>
	//*  43   87:ifnull          110
	//*  44   90:aload_0         
	//*  45   91:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//*  46   94:ifnull          110
	//*  47   97:aload_0         
	//*  48   98:getfield        #1142 <Field AppCompatCallback mAppCompatCallback>
	//*  49  101:aload_0         
	//*  50  102:getfield        #570 <Field ActionMode mActionMode>
	//*  51  105:invokeinterface #1148 <Method void AppCompatCallback.onSupportActionModeStarted(ActionMode)>
	//*  52  110:aload_0         
	//*  53  111:getfield        #570 <Field ActionMode mActionMode>
	//*  54  114:areturn         
	//*  55  115:aload_0         
	//*  56  116:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//*  57  119:ifnonnull       330
	//*  58  122:aload_0         
	//*  59  123:getfield        #255 <Field boolean mIsFloating>
	//*  60  126:ifeq            496
	//*  61  129:new             #314 <Class TypedValue>
	//*  62  132:dup             
	//*  63  133:invokespecial   #315 <Method void TypedValue()>
	//*  64  136:astore          5
	//*  65  138:aload_0         
	//*  66  139:getfield        #156 <Field Context mContext>
	//*  67  142:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  68  145:astore_1        
	//*  69  146:aload_1         
	//*  70  147:getstatic       #324 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//*  71  150:aload           5
	//*  72  152:iconst_1        
	//*  73  153:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  74  156:pop             
	//*  75  157:aload           5
	//*  76  159:getfield        #333 <Field int TypedValue.resourceId>
	//*  77  162:ifeq            488
	//*  78  165:aload_0         
	//*  79  166:getfield        #156 <Field Context mContext>
	//*  80  169:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  81  172:invokevirtual   #522 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//*  82  175:astore          6
	//*  83  177:aload           6
	//*  84  179:aload_1         
	//*  85  180:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//*  86  183:aload           6
	//*  87  185:aload           5
	//*  88  187:getfield        #333 <Field int TypedValue.resourceId>
	//*  89  190:iconst_1        
	//*  90  191:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
	//*  91  194:new             #335 <Class ContextThemeWrapper>
	//*  92  197:dup             
	//*  93  198:aload_0         
	//*  94  199:getfield        #156 <Field Context mContext>
	//*  95  202:iconst_0        
	//*  96  203:invokespecial   #338 <Method void ContextThemeWrapper(Context, int)>
	//*  97  206:astore_1        
	//*  98  207:aload_1         
	//*  99  208:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//* 100  211:aload           6
	//* 101  213:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//* 102  216:aload_0         
	//* 103  217:new             #1160 <Class ActionBarContextView>
	//* 104  220:dup             
	//* 105  221:aload_1         
	//* 106  222:invokespecial   #1161 <Method void ActionBarContextView(Context)>
	//* 107  225:putfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 108  228:aload_0         
	//* 109  229:new             #897 <Class PopupWindow>
	//* 110  232:dup             
	//* 111  233:aload_1         
	//* 112  234:aconst_null     
	//* 113  235:getstatic       #1164 <Field int android.support.v7.appcompat.R$attr.actionModePopupWindowStyle>
	//* 114  238:invokespecial   #1167 <Method void PopupWindow(Context, AttributeSet, int)>
	//* 115  241:putfield        #893 <Field PopupWindow mActionModePopup>
	//* 116  244:aload_0         
	//* 117  245:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 118  248:iconst_2        
	//* 119  249:invokestatic    #1173 <Method void PopupWindowCompat.setWindowLayoutType(PopupWindow, int)>
	//* 120  252:aload_0         
	//* 121  253:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 122  256:aload_0         
	//* 123  257:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 124  260:invokevirtual   #1174 <Method void PopupWindow.setContentView(View)>
	//* 125  263:aload_0         
	//* 126  264:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 127  267:iconst_m1       
	//* 128  268:invokevirtual   #1177 <Method void PopupWindow.setWidth(int)>
	//* 129  271:aload_1         
	//* 130  272:invokevirtual   #319 <Method android.content.res.Resources$Theme Context.getTheme()>
	//* 131  275:getstatic       #1180 <Field int android.support.v7.appcompat.R$attr.actionBarSize>
	//* 132  278:aload           5
	//* 133  280:iconst_1        
	//* 134  281:invokevirtual   #330 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//* 135  284:pop             
	//* 136  285:aload           5
	//* 137  287:getfield        #1183 <Field int TypedValue.data>
	//* 138  290:aload_1         
	//* 139  291:invokevirtual   #517 <Method Resources Context.getResources()>
	//* 140  294:invokevirtual   #1187 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//* 141  297:invokestatic    #1191 <Method int TypedValue.complexToDimensionPixelSize(int, android.util.DisplayMetrics)>
	//* 142  300:istore_2        
	//* 143  301:aload_0         
	//* 144  302:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 145  305:iload_2         
	//* 146  306:invokevirtual   #1194 <Method void ActionBarContextView.setContentHeight(int)>
	//* 147  309:aload_0         
	//* 148  310:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 149  313:bipush          -2
	//* 150  315:invokevirtual   #1197 <Method void PopupWindow.setHeight(int)>
	//* 151  318:aload_0         
	//* 152  319:new             #18  <Class AppCompatDelegateImplV9$5>
	//* 153  322:dup             
	//* 154  323:aload_0         
	//* 155  324:invokespecial   #1198 <Method void AppCompatDelegateImplV9$5(AppCompatDelegateImplV9)>
	//* 156  327:putfield        #895 <Field Runnable mShowActionModePopup>
	//* 157  330:aload_0         
	//* 158  331:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 159  334:ifnull          83
	//* 160  337:aload_0         
	//* 161  338:invokevirtual   #906 <Method void endOnGoingFadeAnimation()>
	//* 162  341:aload_0         
	//* 163  342:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 164  345:invokevirtual   #1201 <Method void ActionBarContextView.killMode()>
	//* 165  348:aload_0         
	//* 166  349:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 167  352:invokevirtual   #1204 <Method Context ActionBarContextView.getContext()>
	//* 168  355:astore_1        
	//* 169  356:aload_0         
	//* 170  357:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 171  360:astore          5
	//* 172  362:aload_0         
	//* 173  363:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 174  366:ifnonnull       539
	//* 175  369:iconst_1        
	//* 176  370:istore_3        
	//* 177  371:new             #1206 <Class StandaloneActionMode>
	//* 178  374:dup             
	//* 179  375:aload_1         
	//* 180  376:aload           5
	//* 181  378:aload           4
	//* 182  380:iload_3         
	//* 183  381:invokespecial   #1209 <Method void StandaloneActionMode(Context, ActionBarContextView, android.support.v7.view.ActionMode$Callback, boolean)>
	//* 184  384:astore_1        
	//* 185  385:aload           4
	//* 186  387:aload_1         
	//* 187  388:aload_1         
	//* 188  389:invokevirtual   #1213 <Method Menu ActionMode.getMenu()>
	//* 189  392:invokeinterface #1219 <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
	//* 190  397:ifeq            598
	//* 191  400:aload_1         
	//* 192  401:invokevirtual   #1222 <Method void ActionMode.invalidate()>
	//* 193  404:aload_0         
	//* 194  405:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 195  408:aload_1         
	//* 196  409:invokevirtual   #1225 <Method void ActionBarContextView.initForMode(ActionMode)>
	//* 197  412:aload_0         
	//* 198  413:aload_1         
	//* 199  414:putfield        #570 <Field ActionMode mActionMode>
	//* 200  417:aload_0         
	//* 201  418:invokevirtual   #1227 <Method boolean shouldAnimateActionModeView()>
	//* 202  421:ifeq            544
	//* 203  424:aload_0         
	//* 204  425:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 205  428:fconst_0        
	//* 206  429:invokevirtual   #1231 <Method void ActionBarContextView.setAlpha(float)>
	//* 207  432:aload_0         
	//* 208  433:aload_0         
	//* 209  434:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 210  437:invokestatic    #1235 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//* 211  440:fconst_1        
	//* 212  441:invokevirtual   #1239 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//* 213  444:putfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//* 214  447:aload_0         
	//* 215  448:getfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//* 216  451:new             #22  <Class AppCompatDelegateImplV9$6>
	//* 217  454:dup             
	//* 218  455:aload_0         
	//* 219  456:invokespecial   #1240 <Method void AppCompatDelegateImplV9$6(AppCompatDelegateImplV9)>
	//* 220  459:invokevirtual   #1244 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//* 221  462:pop             
	//* 222  463:aload_0         
	//* 223  464:getfield        #893 <Field PopupWindow mActionModePopup>
	//* 224  467:ifnull          83
	//* 225  470:aload_0         
	//* 226  471:getfield        #127 <Field Window mWindow>
	//* 227  474:invokevirtual   #133 <Method View Window.getDecorView()>
	//* 228  477:aload_0         
	//* 229  478:getfield        #895 <Field Runnable mShowActionModePopup>
	//* 230  481:invokevirtual   #1247 <Method boolean View.post(Runnable)>
	//* 231  484:pop             
	//* 232  485:goto            83
	//* 233  488:aload_0         
	//* 234  489:getfield        #156 <Field Context mContext>
	//* 235  492:astore_1        
	//* 236  493:goto            216
	//* 237  496:aload_0         
	//* 238  497:getfield        #114 <Field ViewGroup mSubDecor>
	//* 239  500:getstatic       #1250 <Field int android.support.v7.appcompat.R$id.action_mode_bar_stub>
	//* 240  503:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//* 241  506:checkcast       #1252 <Class ViewStubCompat>
	//* 242  509:astore_1        
	//* 243  510:aload_1         
	//* 244  511:ifnull          330
	//* 245  514:aload_1         
	//* 246  515:aload_0         
	//* 247  516:invokevirtual   #493 <Method Context getActionBarThemedContext()>
	//* 248  519:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//* 249  522:invokevirtual   #1256 <Method void ViewStubCompat.setLayoutInflater(LayoutInflater)>
	//* 250  525:aload_0         
	//* 251  526:aload_1         
	//* 252  527:invokevirtual   #1258 <Method View ViewStubCompat.inflate()>
	//* 253  530:checkcast       #1160 <Class ActionBarContextView>
	//* 254  533:putfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 255  536:goto            330
	//* 256  539:iconst_0        
	//* 257  540:istore_3        
	//* 258  541:goto            371
	//* 259  544:aload_0         
	//* 260  545:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 261  548:fconst_1        
	//* 262  549:invokevirtual   #1231 <Method void ActionBarContextView.setAlpha(float)>
	//* 263  552:aload_0         
	//* 264  553:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 265  556:iconst_0        
	//* 266  557:invokevirtual   #1261 <Method void ActionBarContextView.setVisibility(int)>
	//* 267  560:aload_0         
	//* 268  561:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 269  564:bipush          32
	//* 270  566:invokevirtual   #1264 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
	//* 271  569:aload_0         
	//* 272  570:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 273  573:invokevirtual   #1265 <Method ViewParent ActionBarContextView.getParent()>
	//* 274  576:instanceof      #135 <Class View>
	//* 275  579:ifeq            463
	//* 276  582:aload_0         
	//* 277  583:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 278  586:invokevirtual   #1265 <Method ViewParent ActionBarContextView.getParent()>
	//* 279  589:checkcast       #135 <Class View>
	//* 280  592:invokestatic    #1268 <Method void ViewCompat.requestApplyInsets(View)>
	//* 281  595:goto            463
	//* 282  598:aload_0         
	//* 283  599:aconst_null     
	//* 284  600:putfield        #570 <Field ActionMode mActionMode>
	//* 285  603:goto            83
				// Misplaced declaration of an exception variable
				catch(android.support.v7.view.ActionMode.Callback callback)
	//* 286  606:astore_1        
				{
					callback = ((android.support.v7.view.ActionMode.Callback) (obj1));
	//  287  607:aload           5
	//  288  609:astore_1        
				}
		}
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
	//* 289  610:goto            74
	}

	int updateStatusGuard(int i)
	{
		boolean flag3 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		boolean flag4 = false;
	//    4    5:iconst_0        
	//    5    6:istore          8
		boolean flag2 = flag;
	//    6    8:iload_3         
	//    7    9:istore          6
		int j = i;
	//    8   11:iload_1         
	//    9   12:istore_2        
		if(mActionModeView != null)
	//*  10   13:aload_0         
	//*  11   14:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//*  12   17:ifnull          293
		{
			flag2 = flag;
	//   13   20:iload_3         
	//   14   21:istore          6
			j = i;
	//   15   23:iload_1         
	//   16   24:istore_2        
			if(mActionModeView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  17   25:aload_0         
	//*  18   26:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//*  19   29:invokevirtual   #1270 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//*  20   32:instanceof      #1272 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  21   35:ifeq            293
			{
				Object obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams()));
	//   22   38:aload_0         
	//   23   39:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//   24   42:invokevirtual   #1270 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//   25   45:checkcast       #1272 <Class android.view.ViewGroup$MarginLayoutParams>
	//   26   48:astore          9
				int k = 0;
	//   27   50:iconst_0        
	//   28   51:istore_3        
				j = 0;
	//   29   52:iconst_0        
	//   30   53:istore_2        
				boolean flag1;
				int l;
				if(mActionModeView.isShown())
	//*  31   54:aload_0         
	//*  32   55:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//*  33   58:invokevirtual   #1275 <Method boolean ActionBarContextView.isShown()>
	//*  34   61:ifeq            373
				{
					if(mTempRect1 == null)
	//*  35   64:aload_0         
	//*  36   65:getfield        #1277 <Field Rect mTempRect1>
	//*  37   68:ifnonnull       93
					{
						mTempRect1 = new Rect();
	//   38   71:aload_0         
	//   39   72:new             #1279 <Class Rect>
	//   40   75:dup             
	//   41   76:invokespecial   #1280 <Method void Rect()>
	//   42   79:putfield        #1277 <Field Rect mTempRect1>
						mTempRect2 = new Rect();
	//   43   82:aload_0         
	//   44   83:new             #1279 <Class Rect>
	//   45   86:dup             
	//   46   87:invokespecial   #1280 <Method void Rect()>
	//   47   90:putfield        #1282 <Field Rect mTempRect2>
					}
					Rect rect = mTempRect1;
	//   48   93:aload_0         
	//   49   94:getfield        #1277 <Field Rect mTempRect1>
	//   50   97:astore          10
					Rect rect1 = mTempRect2;
	//   51   99:aload_0         
	//   52  100:getfield        #1282 <Field Rect mTempRect2>
	//   53  103:astore          11
					rect.set(0, i, 0, 0);
	//   54  105:aload           10
	//   55  107:iconst_0        
	//   56  108:iload_1         
	//   57  109:iconst_0        
	//   58  110:iconst_0        
	//   59  111:invokevirtual   #1285 <Method void Rect.set(int, int, int, int)>
					ViewUtils.computeFitSystemWindows(((View) (mSubDecor)), rect, rect1);
	//   60  114:aload_0         
	//   61  115:getfield        #114 <Field ViewGroup mSubDecor>
	//   62  118:aload           10
	//   63  120:aload           11
	//   64  122:invokestatic    #1289 <Method void ViewUtils.computeFitSystemWindows(View, Rect, Rect)>
					if(rect1.top == 0)
	//*  65  125:aload           11
	//*  66  127:getfield        #1292 <Field int Rect.top>
	//*  67  130:ifne            322
						k = i;
	//   68  133:iload_1         
	//   69  134:istore_3        
					else
	//*  70  135:aload           9
	//*  71  137:getfield        #1295 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//*  72  140:iload_3         
	//*  73  141:icmpeq          217
	//*  74  144:iconst_1        
	//*  75  145:istore_3        
	//*  76  146:aload           9
	//*  77  148:iload_1         
	//*  78  149:putfield        #1295 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//*  79  152:aload_0         
	//*  80  153:getfield        #1297 <Field View mStatusGuard>
	//*  81  156:ifnonnull       327
	//*  82  159:aload_0         
	//*  83  160:new             #135 <Class View>
	//*  84  163:dup             
	//*  85  164:aload_0         
	//*  86  165:getfield        #156 <Field Context mContext>
	//*  87  168:invokespecial   #1298 <Method void View(Context)>
	//*  88  171:putfield        #1297 <Field View mStatusGuard>
	//*  89  174:aload_0         
	//*  90  175:getfield        #1297 <Field View mStatusGuard>
	//*  91  178:aload_0         
	//*  92  179:getfield        #156 <Field Context mContext>
	//*  93  182:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  94  185:getstatic       #1303 <Field int android.support.v7.appcompat.R$color.abc_input_method_navigation_guard>
	//*  95  188:invokevirtual   #1306 <Method int Resources.getColor(int)>
	//*  96  191:invokevirtual   #1309 <Method void View.setBackgroundColor(int)>
	//*  97  194:aload_0         
	//*  98  195:getfield        #114 <Field ViewGroup mSubDecor>
	//*  99  198:aload_0         
	//* 100  199:getfield        #1297 <Field View mStatusGuard>
	//* 101  202:iconst_m1       
	//* 102  203:new             #673 <Class android.view.ViewGroup$LayoutParams>
	//* 103  206:dup             
	//* 104  207:iconst_m1       
	//* 105  208:iload_1         
	//* 106  209:invokespecial   #676 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//* 107  212:invokevirtual   #1312 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
	//* 108  215:iload_3         
	//* 109  216:istore_2        
	//* 110  217:aload_0         
	//* 111  218:getfield        #1297 <Field View mStatusGuard>
	//* 112  221:ifnull          367
	//* 113  224:iconst_1        
	//* 114  225:istore          6
	//* 115  227:iload_2         
	//* 116  228:istore_3        
	//* 117  229:iload           6
	//* 118  231:istore          4
	//* 119  233:iload_1         
	//* 120  234:istore          5
	//* 121  236:aload_0         
	//* 122  237:getfield        #303 <Field boolean mOverlayActionMode>
	//* 123  240:ifne            266
	//* 124  243:iload_2         
	//* 125  244:istore_3        
	//* 126  245:iload           6
	//* 127  247:istore          4
	//* 128  249:iload_1         
	//* 129  250:istore          5
	//* 130  252:iload           6
	//* 131  254:ifeq            266
	//* 132  257:iconst_0        
	//* 133  258:istore          5
	//* 134  260:iload           6
	//* 135  262:istore          4
	//* 136  264:iload_2         
	//* 137  265:istore_3        
	//* 138  266:iload           4
	//* 139  268:istore          6
	//* 140  270:iload           5
	//* 141  272:istore_2        
	//* 142  273:iload_3         
	//* 143  274:ifeq            293
	//* 144  277:aload_0         
	//* 145  278:getfield        #1158 <Field ActionBarContextView mActionModeView>
	//* 146  281:aload           9
	//* 147  283:invokevirtual   #1316 <Method void ActionBarContextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 148  286:iload           5
	//* 149  288:istore_2        
	//* 150  289:iload           4
	//* 151  291:istore          6
	//* 152  293:aload_0         
	//* 153  294:getfield        #1297 <Field View mStatusGuard>
	//* 154  297:ifnull          320
	//* 155  300:aload_0         
	//* 156  301:getfield        #1297 <Field View mStatusGuard>
	//* 157  304:astore          9
	//* 158  306:iload           6
	//* 159  308:ifeq            406
	//* 160  311:iload           7
	//* 161  313:istore_1        
	//* 162  314:aload           9
	//* 163  316:iload_1         
	//* 164  317:invokevirtual   #1317 <Method void View.setVisibility(int)>
	//* 165  320:iload_2         
	//* 166  321:ireturn         
						k = 0;
	//  167  322:iconst_0        
	//  168  323:istore_3        
					if(((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != k)
					{
						k = 1;
						obj.topMargin = i;
						if(mStatusGuard == null)
						{
							mStatusGuard = new View(mContext);
							mStatusGuard.setBackgroundColor(mContext.getResources().getColor(android.support.v7.appcompat.R.color.abc_input_method_navigation_guard));
							mSubDecor.addView(mStatusGuard, -1, new android.view.ViewGroup.LayoutParams(-1, i));
							j = k;
						} else
	//* 169  324:goto            135
						{
							android.view.ViewGroup.LayoutParams layoutparams = mStatusGuard.getLayoutParams();
	//  170  327:aload_0         
	//  171  328:getfield        #1297 <Field View mStatusGuard>
	//  172  331:invokevirtual   #671 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  173  334:astore          10
							j = k;
	//  174  336:iload_3         
	//  175  337:istore_2        
							if(layoutparams.height != i)
	//* 176  338:aload           10
	//* 177  340:getfield        #1320 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 178  343:iload_1         
	//* 179  344:icmpeq          217
							{
								layoutparams.height = i;
	//  180  347:aload           10
	//  181  349:iload_1         
	//  182  350:putfield        #1320 <Field int android.view.ViewGroup$LayoutParams.height>
								mStatusGuard.setLayoutParams(layoutparams);
	//  183  353:aload_0         
	//  184  354:getfield        #1297 <Field View mStatusGuard>
	//  185  357:aload           10
	//  186  359:invokevirtual   #1321 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
								j = k;
	//  187  362:iload_3         
	//  188  363:istore_2        
							}
						}
					}
					if(mStatusGuard != null)
						flag2 = true;
					else
	//* 189  364:goto            217
						flag2 = false;
	//  190  367:iconst_0        
	//  191  368:istore          6
					k = j;
					flag1 = flag2;
					l = i;
					if(!mOverlayActionMode)
					{
						k = j;
						flag1 = flag2;
						l = i;
						if(flag2)
						{
							l = 0;
							flag1 = flag2;
							k = j;
						}
					}
				} else
	//* 192  370:goto            227
				{
					flag1 = flag4;
	//  193  373:iload           8
	//  194  375:istore          4
					l = i;
	//  195  377:iload_1         
	//  196  378:istore          5
					if(((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin != 0)
	//* 197  380:aload           9
	//* 198  382:getfield        #1295 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//* 199  385:ifeq            266
					{
						k = 1;
	//  200  388:iconst_1        
	//  201  389:istore_3        
						obj.topMargin = 0;
	//  202  390:aload           9
	//  203  392:iconst_0        
	//  204  393:putfield        #1295 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
						flag1 = flag4;
	//  205  396:iload           8
	//  206  398:istore          4
						l = i;
	//  207  400:iload_1         
	//  208  401:istore          5
					}
				}
				flag2 = flag1;
				j = l;
				if(k != 0)
				{
					mActionModeView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
					j = l;
					flag2 = flag1;
				}
			}
		}
		if(mStatusGuard != null)
		{
			obj = ((Object) (mStatusGuard));
			if(flag2)
				i = ((int) (flag3));
			else
	//* 209  403:goto            266
				i = 8;
	//  210  406:bipush          8
	//  211  408:istore_1        
			((View) (obj)).setVisibility(i);
		}
		return j;
	//* 212  409:goto            314
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
