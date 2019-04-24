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
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
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
	final class ActionMenuPresenterCallback
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

	class ListMenuDecorView extends ContentFrameLayout
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
			if(shownPanelView == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #100 <Field View shownPanelView>
		//*   2    4:ifnonnull       9
				return false;
		//    3    7:iconst_0        
		//    4    8:ireturn         
			if(createdPanelView != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #102 <Field View createdPanelView>
		//*   7   13:ifnull          18
				return true;
		//    8   16:iconst_1        
		//    9   17:ireturn         
			return listMenuPresenter.getAdapter().getCount() > 0;
		//   10   18:aload_0         
		//   11   19:getfield        #65  <Field ListMenuPresenter listMenuPresenter>
		//   12   22:invokevirtual   #106 <Method ListAdapter ListMenuPresenter.getAdapter()>
		//   13   25:invokeinterface #112 <Method int ListAdapter.getCount()>
		//   14   30:ifle            35
		//   15   33:iconst_1        
		//   16   34:ireturn         
		//   17   35:iconst_0        
		//   18   36:ireturn         
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

	static class PanelFeatureState.SavedState
		implements Parcelable
	{

		static PanelFeatureState.SavedState readFromParcel(Parcel parcel, ClassLoader classloader)
		{
			PanelFeatureState.SavedState savedstate = new PanelFeatureState.SavedState();
		//    0    0:new             #2   <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState>
		//    1    3:dup             
		//    2    4:invokespecial   #41  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState()>
		//    3    7:astore_3        
			savedstate.featureId = parcel.readInt();
		//    4    8:aload_3         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #47  <Method int Parcel.readInt()>
		//    7   13:putfield        #49  <Field int featureId>
			boolean flag;
			if(parcel.readInt() == 1)
		//*   8   16:aload_0         
		//*   9   17:invokevirtual   #47  <Method int Parcel.readInt()>
		//*  10   20:iconst_1        
		//*  11   21:icmpne          29
				flag = true;
		//   12   24:iconst_1        
		//   13   25:istore_2        
			else
		//*  14   26:goto            31
				flag = false;
		//   15   29:iconst_0        
		//   16   30:istore_2        
			savedstate.isOpen = flag;
		//   17   31:aload_3         
		//   18   32:iload_2         
		//   19   33:putfield        #51  <Field boolean isOpen>
			if(savedstate.isOpen)
		//*  20   36:aload_3         
		//*  21   37:getfield        #51  <Field boolean isOpen>
		//*  22   40:ifeq            52
				savedstate.menuState = parcel.readBundle(classloader);
		//   23   43:aload_3         
		//   24   44:aload_0         
		//   25   45:aload_1         
		//   26   46:invokevirtual   #55  <Method Bundle Parcel.readBundle(ClassLoader)>
		//   27   49:putfield        #57  <Field Bundle menuState>
			return savedstate;
		//   28   52:aload_3         
		//   29   53:areturn         
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
		//    2    2:getfield        #49  <Field int featureId>
		//    3    5:invokevirtual   #64  <Method void Parcel.writeInt(int)>
			if(isOpen)
		//*   4    8:aload_0         
		//*   5    9:getfield        #51  <Field boolean isOpen>
		//*   6   12:ifeq            20
				i = 1;
		//    7   15:iconst_1        
		//    8   16:istore_2        
			else
		//*   9   17:goto            22
				i = 0;
		//   10   20:iconst_0        
		//   11   21:istore_2        
			parcel.writeInt(i);
		//   12   22:aload_1         
		//   13   23:iload_2         
		//   14   24:invokevirtual   #64  <Method void Parcel.writeInt(int)>
			if(isOpen)
		//*  15   27:aload_0         
		//*  16   28:getfield        #51  <Field boolean isOpen>
		//*  17   31:ifeq            42
				parcel.writeBundle(menuState);
		//   18   34:aload_1         
		//   19   35:aload_0         
		//   20   36:getfield        #57  <Field Bundle menuState>
		//   21   39:invokevirtual   #68  <Method void Parcel.writeBundle(Bundle)>
		//   22   42:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

			public PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return PanelFeatureState.SavedState.readFromParcel(parcel, classloader);
			//    0    0:aload_1         
			//    1    1:aload_2         
			//    2    2:invokestatic    #25  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState AppCompatDelegateImplV9$PanelFeatureState$SavedState.readFromParcel(Parcel, ClassLoader)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #28  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #33  <Method AppCompatDelegateImplV9$PanelFeatureState$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
);
		int featureId;
		boolean isOpen;
		Bundle menuState;

		static 
		{
		//    0    0:new             #14  <Class AppCompatDelegateImplV9$PanelFeatureState$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #28  <Method void AppCompatDelegateImplV9$PanelFeatureState$SavedState$1()>
		//    3    7:invokestatic    #34  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		PanelFeatureState.SavedState()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #38  <Method void Object()>
		//    2    4:return          
		}
	}

	final class PanelMenuPresenterCallback
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
		//*  15   26:ifeq            35
				menubuilder = menubuilder1;
		//   16   29:aload           4
		//   17   31:astore_1        
		//*  18   32:goto            35
			menubuilder = ((MenuBuilder) (appcompatdelegateimplv9.findMenuPanel(((Menu) (menubuilder)))));
		//   19   35:aload           5
		//   20   37:aload_1         
		//   21   38:invokevirtual   #31  <Method AppCompatDelegateImplV9$PanelFeatureState AppCompatDelegateImplV9.findMenuPanel(Menu)>
		//   22   41:astore_1        
			if(menubuilder != null)
		//*  23   42:aload_1         
		//*  24   43:ifnull          83
			{
				if(flag1)
		//*  25   46:iload_3         
		//*  26   47:ifeq            74
				{
					callOnPanelClosed(((PanelFeatureState) (menubuilder)).featureId, ((PanelFeatureState) (menubuilder)), ((Menu) (menubuilder1)));
		//   27   50:aload_0         
		//   28   51:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//   29   54:aload_1         
		//   30   55:getfield        #37  <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
		//   31   58:aload_1         
		//   32   59:aload           4
		//   33   61:invokevirtual   #41  <Method void AppCompatDelegateImplV9.callOnPanelClosed(int, AppCompatDelegateImplV9$PanelFeatureState, Menu)>
					closePanel(((PanelFeatureState) (menubuilder)), true);
		//   34   64:aload_0         
		//   35   65:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//   36   68:aload_1         
		//   37   69:iconst_1        
		//   38   70:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
					return;
		//   39   73:return          
				}
				closePanel(((PanelFeatureState) (menubuilder)), flag);
		//   40   74:aload_0         
		//   41   75:getfield        #15  <Field AppCompatDelegateImplV9 this$0>
		//   42   78:aload_1         
		//   43   79:iload_2         
		//   44   80:invokevirtual   #45  <Method void AppCompatDelegateImplV9.closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
			}
		//   45   83:return          
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
		Object obj1 = ((Object) (LayoutInflater.from(mContext)));
	//   65  133:aload_0         
	//   66  134:getfield        #156 <Field Context mContext>
	//   67  137:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//   68  140:astore_2        
		obj = null;
	//   69  141:aconst_null     
	//   70  142:astore_1        
		if(!mWindowNoTitle)
	//*  71  143:aload_0         
	//*  72  144:getfield        #264 <Field boolean mWindowNoTitle>
	//*  73  147:ifne            341
		{
			if(mIsFloating)
	//*  74  150:aload_0         
	//*  75  151:getfield        #255 <Field boolean mIsFloating>
	//*  76  154:ifeq            182
			{
				obj = ((Object) ((ViewGroup)((LayoutInflater) (obj1)).inflate(android.support.v7.appcompat.R.layout.abc_dialog_title_material, ((ViewGroup) (null)))));
	//   77  157:aload_2         
	//   78  158:getstatic       #269 <Field int android.support.v7.appcompat.R$layout.abc_dialog_title_material>
	//   79  161:aconst_null     
	//   80  162:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//   81  165:checkcast       #117 <Class ViewGroup>
	//   82  168:astore_1        
				mOverlayActionBar = false;
	//   83  169:aload_0         
	//   84  170:iconst_0        
	//   85  171:putfield        #276 <Field boolean mOverlayActionBar>
				mHasActionBar = false;
	//   86  174:aload_0         
	//   87  175:iconst_0        
	//   88  176:putfield        #279 <Field boolean mHasActionBar>
			} else
	//*  89  179:goto            415
			if(mHasActionBar)
	//*  90  182:aload_0         
	//*  91  183:getfield        #279 <Field boolean mHasActionBar>
	//*  92  186:ifeq            415
			{
				obj = ((Object) (new TypedValue()));
	//   93  189:new             #281 <Class TypedValue>
	//   94  192:dup             
	//   95  193:invokespecial   #283 <Method void TypedValue()>
	//   96  196:astore_1        
				mContext.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, ((TypedValue) (obj)), true);
	//   97  197:aload_0         
	//   98  198:getfield        #156 <Field Context mContext>
	//   99  201:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//  100  204:getstatic       #292 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//  101  207:aload_1         
	//  102  208:iconst_1        
	//  103  209:invokevirtual   #298 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//  104  212:pop             
				if(((TypedValue) (obj)).resourceId != 0)
	//* 105  213:aload_1         
	//* 106  214:getfield        #301 <Field int TypedValue.resourceId>
	//* 107  217:ifeq            239
					obj = ((Object) (new ContextThemeWrapper(mContext, ((TypedValue) (obj)).resourceId)));
	//  108  220:new             #303 <Class ContextThemeWrapper>
	//  109  223:dup             
	//  110  224:aload_0         
	//  111  225:getfield        #156 <Field Context mContext>
	//  112  228:aload_1         
	//  113  229:getfield        #301 <Field int TypedValue.resourceId>
	//  114  232:invokespecial   #306 <Method void ContextThemeWrapper(Context, int)>
	//  115  235:astore_1        
				else
	//* 116  236:goto            244
					obj = ((Object) (mContext));
	//  117  239:aload_0         
	//  118  240:getfield        #156 <Field Context mContext>
	//  119  243:astore_1        
				obj = ((Object) ((ViewGroup)LayoutInflater.from(((Context) (obj))).inflate(android.support.v7.appcompat.R.layout.abc_screen_toolbar, ((ViewGroup) (null)))));
	//  120  244:aload_1         
	//  121  245:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//  122  248:getstatic       #309 <Field int android.support.v7.appcompat.R$layout.abc_screen_toolbar>
	//  123  251:aconst_null     
	//  124  252:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  125  255:checkcast       #117 <Class ViewGroup>
	//  126  258:astore_1        
				mDecorContentParent = (DecorContentParent)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.decor_content_parent);
	//  127  259:aload_0         
	//  128  260:aload_1         
	//  129  261:getstatic       #314 <Field int android.support.v7.appcompat.R$id.decor_content_parent>
	//  130  264:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  131  267:checkcast       #316 <Class DecorContentParent>
	//  132  270:putfield        #318 <Field DecorContentParent mDecorContentParent>
				mDecorContentParent.setWindowCallback(getWindowCallback());
	//  133  273:aload_0         
	//  134  274:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  135  277:aload_0         
	//  136  278:invokevirtual   #322 <Method android.view.Window$Callback getWindowCallback()>
	//  137  281:invokeinterface #326 <Method void DecorContentParent.setWindowCallback(android.view.Window$Callback)>
				if(mOverlayActionBar)
	//* 138  286:aload_0         
	//* 139  287:getfield        #276 <Field boolean mOverlayActionBar>
	//* 140  290:ifeq            304
					mDecorContentParent.initFeature(109);
	//  141  293:aload_0         
	//  142  294:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  143  297:bipush          109
	//  144  299:invokeinterface #330 <Method void DecorContentParent.initFeature(int)>
				if(mFeatureProgress)
	//* 145  304:aload_0         
	//* 146  305:getfield        #332 <Field boolean mFeatureProgress>
	//* 147  308:ifeq            321
					mDecorContentParent.initFeature(2);
	//  148  311:aload_0         
	//  149  312:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  150  315:iconst_2        
	//  151  316:invokeinterface #330 <Method void DecorContentParent.initFeature(int)>
				if(mFeatureIndeterminateProgress)
	//* 152  321:aload_0         
	//* 153  322:getfield        #334 <Field boolean mFeatureIndeterminateProgress>
	//* 154  325:ifeq            338
					mDecorContentParent.initFeature(5);
	//  155  328:aload_0         
	//  156  329:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  157  332:iconst_5        
	//  158  333:invokeinterface #330 <Method void DecorContentParent.initFeature(int)>
			}
		} else
	//* 159  338:goto            415
		{
			if(mOverlayActionMode)
	//* 160  341:aload_0         
	//* 161  342:getfield        #337 <Field boolean mOverlayActionMode>
	//* 162  345:ifeq            363
				obj = ((Object) ((ViewGroup)((LayoutInflater) (obj1)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode, ((ViewGroup) (null)))));
	//  163  348:aload_2         
	//  164  349:getstatic       #340 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple_overlay_action_mode>
	//  165  352:aconst_null     
	//  166  353:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  167  356:checkcast       #117 <Class ViewGroup>
	//  168  359:astore_1        
			else
	//* 169  360:goto            375
				obj = ((Object) ((ViewGroup)((LayoutInflater) (obj1)).inflate(android.support.v7.appcompat.R.layout.abc_screen_simple, ((ViewGroup) (null)))));
	//  170  363:aload_2         
	//  171  364:getstatic       #343 <Field int android.support.v7.appcompat.R$layout.abc_screen_simple>
	//  172  367:aconst_null     
	//  173  368:invokevirtual   #273 <Method View LayoutInflater.inflate(int, ViewGroup)>
	//  174  371:checkcast       #117 <Class ViewGroup>
	//  175  374:astore_1        
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 176  375:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//* 177  378:bipush          21
	//* 178  380:icmplt          398
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
	//  179  383:aload_1         
	//  180  384:new             #12  <Class AppCompatDelegateImplV9$2>
	//  181  387:dup             
	//  182  388:aload_0         
	//  183  389:invokespecial   #344 <Method void AppCompatDelegateImplV9$2(AppCompatDelegateImplV9)>
	//  184  392:invokestatic    #350 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			else
	//* 185  395:goto            415
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
	//  186  398:aload_1         
	//  187  399:checkcast       #352 <Class FitWindowsViewGroup>
	//  188  402:new             #14  <Class AppCompatDelegateImplV9$3>
	//  189  405:dup             
	//  190  406:aload_0         
	//  191  407:invokespecial   #353 <Method void AppCompatDelegateImplV9$3(AppCompatDelegateImplV9)>
	//  192  410:invokeinterface #357 <Method void FitWindowsViewGroup.setOnFitSystemWindowsListener(android.support.v7.widget.FitWindowsViewGroup$OnFitSystemWindowsListener)>
		}
		if(obj == null)
	//* 193  415:aload_1         
	//* 194  416:ifnonnull       508
			throw new IllegalArgumentException((new StringBuilder()).append("AppCompat does not support the current theme features: { windowActionBar: ").append(mHasActionBar).append(", windowActionBarOverlay: ").append(mOverlayActionBar).append(", android:windowIsFloating: ").append(mIsFloating).append(", windowActionModeOverlay: ").append(mOverlayActionMode).append(", windowNoTitle: ").append(mWindowNoTitle).append(" }").toString());
	//  195  419:new             #359 <Class IllegalArgumentException>
	//  196  422:dup             
	//  197  423:new             #361 <Class StringBuilder>
	//  198  426:dup             
	//  199  427:invokespecial   #362 <Method void StringBuilder()>
	//  200  430:ldc2            #364 <String "AppCompat does not support the current theme features: { windowActionBar: ">
	//  201  433:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//  202  436:aload_0         
	//  203  437:getfield        #279 <Field boolean mHasActionBar>
	//  204  440:invokevirtual   #371 <Method StringBuilder StringBuilder.append(boolean)>
	//  205  443:ldc2            #373 <String ", windowActionBarOverlay: ">
	//  206  446:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//  207  449:aload_0         
	//  208  450:getfield        #276 <Field boolean mOverlayActionBar>
	//  209  453:invokevirtual   #371 <Method StringBuilder StringBuilder.append(boolean)>
	//  210  456:ldc2            #375 <String ", android:windowIsFloating: ">
	//  211  459:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//  212  462:aload_0         
	//  213  463:getfield        #255 <Field boolean mIsFloating>
	//  214  466:invokevirtual   #371 <Method StringBuilder StringBuilder.append(boolean)>
	//  215  469:ldc2            #377 <String ", windowActionModeOverlay: ">
	//  216  472:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//  217  475:aload_0         
	//  218  476:getfield        #337 <Field boolean mOverlayActionMode>
	//  219  479:invokevirtual   #371 <Method StringBuilder StringBuilder.append(boolean)>
	//  220  482:ldc2            #379 <String ", windowNoTitle: ">
	//  221  485:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//  222  488:aload_0         
	//  223  489:getfield        #264 <Field boolean mWindowNoTitle>
	//  224  492:invokevirtual   #371 <Method StringBuilder StringBuilder.append(boolean)>
	//  225  495:ldc2            #381 <String " }">
	//  226  498:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//  227  501:invokevirtual   #385 <Method String StringBuilder.toString()>
	//  228  504:invokespecial   #386 <Method void IllegalArgumentException(String)>
	//  229  507:athrow          
		if(mDecorContentParent == null)
	//* 230  508:aload_0         
	//* 231  509:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//* 232  512:ifnonnull       529
			mTitleView = (TextView)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.title);
	//  233  515:aload_0         
	//  234  516:aload_1         
	//  235  517:getstatic       #389 <Field int android.support.v7.appcompat.R$id.title>
	//  236  520:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  237  523:checkcast       #391 <Class TextView>
	//  238  526:putfield        #393 <Field TextView mTitleView>
		ViewUtils.makeOptionalFitsSystemWindows(((View) (obj)));
	//  239  529:aload_1         
	//  240  530:invokestatic    #399 <Method void ViewUtils.makeOptionalFitsSystemWindows(View)>
		obj1 = ((Object) ((ContentFrameLayout)((ViewGroup) (obj)).findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content)));
	//  241  533:aload_1         
	//  242  534:getstatic       #402 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
	//  243  537:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  244  540:checkcast       #123 <Class ContentFrameLayout>
	//  245  543:astore_2        
		ViewGroup viewgroup = (ViewGroup)mWindow.findViewById(0x1020002);
	//  246  544:aload_0         
	//  247  545:getfield        #127 <Field Window mWindow>
	//  248  548:ldc1            #115 <Int 0x1020002>
	//  249  550:invokevirtual   #403 <Method View Window.findViewById(int)>
	//  250  553:checkcast       #117 <Class ViewGroup>
	//  251  556:astore_3        
		if(viewgroup != null)
	//* 252  557:aload_3         
	//* 253  558:ifnull          615
		{
			View view;
			for(; viewgroup.getChildCount() > 0; ((ContentFrameLayout) (obj1)).addView(view))
	//* 254  561:aload_3         
	//* 255  562:invokevirtual   #406 <Method int ViewGroup.getChildCount()>
	//* 256  565:ifle            589
			{
				view = viewgroup.getChildAt(0);
	//  257  568:aload_3         
	//  258  569:iconst_0        
	//  259  570:invokevirtual   #409 <Method View ViewGroup.getChildAt(int)>
	//  260  573:astore          4
				viewgroup.removeViewAt(0);
	//  261  575:aload_3         
	//  262  576:iconst_0        
	//  263  577:invokevirtual   #412 <Method void ViewGroup.removeViewAt(int)>
			}

	//  264  580:aload_2         
	//  265  581:aload           4
	//  266  583:invokevirtual   #415 <Method void ContentFrameLayout.addView(View)>
	//* 267  586:goto            561
			viewgroup.setId(-1);
	//  268  589:aload_3         
	//  269  590:iconst_m1       
	//  270  591:invokevirtual   #418 <Method void ViewGroup.setId(int)>
			((ContentFrameLayout) (obj1)).setId(0x1020002);
	//  271  594:aload_2         
	//  272  595:ldc1            #115 <Int 0x1020002>
	//  273  597:invokevirtual   #419 <Method void ContentFrameLayout.setId(int)>
			if(viewgroup instanceof FrameLayout)
	//* 274  600:aload_3         
	//* 275  601:instanceof      #421 <Class FrameLayout>
	//* 276  604:ifeq            615
				((FrameLayout)viewgroup).setForeground(((android.graphics.drawable.Drawable) (null)));
	//  277  607:aload_3         
	//  278  608:checkcast       #421 <Class FrameLayout>
	//  279  611:aconst_null     
	//  280  612:invokevirtual   #425 <Method void FrameLayout.setForeground(android.graphics.drawable.Drawable)>
		}
		mWindow.setContentView(((View) (obj)));
	//  281  615:aload_0         
	//  282  616:getfield        #127 <Field Window mWindow>
	//  283  619:aload_1         
	//  284  620:invokevirtual   #428 <Method void Window.setContentView(View)>
		((ContentFrameLayout) (obj1)).setAttachListener(new android.support.v7.widget.ContentFrameLayout.OnAttachListener() {

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
	//  285  623:aload_2         
	//  286  624:new             #16  <Class AppCompatDelegateImplV9$4>
	//  287  627:dup             
	//  288  628:aload_0         
	//  289  629:invokespecial   #429 <Method void AppCompatDelegateImplV9$4(AppCompatDelegateImplV9)>
	//  290  632:invokevirtual   #433 <Method void ContentFrameLayout.setAttachListener(android.support.v7.widget.ContentFrameLayout$OnAttachListener)>
		return ((ViewGroup) (obj));
	//  291  635:aload_1         
	//  292  636:areturn         
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
		if(mActionMode != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #570 <Field ActionMode mActionMode>
	//*   2    4:ifnull          9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		boolean flag2 = false;
	//    5    9:iconst_0        
	//    6   10:istore          5
		PanelFeatureState panelfeaturestate = getPanelState(i, true);
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:iconst_1        
	//   10   15:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   11   18:astore          6
		boolean flag;
		if(i == 0 && mDecorContentParent != null && mDecorContentParent.canShowOverflowMenu() && !ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(mContext)))
	//*  12   20:iload_1         
	//*  13   21:ifne            117
	//*  14   24:aload_0         
	//*  15   25:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  16   28:ifnull          117
	//*  17   31:aload_0         
	//*  18   32:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  19   35:invokeinterface #573 <Method boolean DecorContentParent.canShowOverflowMenu()>
	//*  20   40:ifeq            117
	//*  21   43:aload_0         
	//*  22   44:getfield        #156 <Field Context mContext>
	//*  23   47:invokestatic    #579 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//*  24   50:invokestatic    #585 <Method boolean ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration)>
	//*  25   53:ifne            117
		{
			if(!mDecorContentParent.isOverflowMenuShowing())
	//*  26   56:aload_0         
	//*  27   57:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  28   60:invokeinterface #588 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  29   65:ifne            104
			{
				flag = flag2;
	//   30   68:iload           5
	//   31   70:istore_3        
				if(!isDestroyed())
	//*  32   71:aload_0         
	//*  33   72:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  34   75:ifne            203
				{
					flag = flag2;
	//   35   78:iload           5
	//   36   80:istore_3        
					if(preparePanel(panelfeaturestate, keyevent))
	//*  37   81:aload_0         
	//*  38   82:aload           6
	//*  39   84:aload_2         
	//*  40   85:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//*  41   88:ifeq            203
						flag = mDecorContentParent.showOverflowMenu();
	//   42   91:aload_0         
	//   43   92:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   44   95:invokeinterface #591 <Method boolean DecorContentParent.showOverflowMenu()>
	//   45  100:istore_3        
				}
			} else
	//*  46  101:goto            203
			{
				flag = mDecorContentParent.hideOverflowMenu();
	//   47  104:aload_0         
	//   48  105:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   49  108:invokeinterface #594 <Method boolean DecorContentParent.hideOverflowMenu()>
	//   50  113:istore_3        
			}
		} else
	//*  51  114:goto            203
		if(panelfeaturestate.isOpen || panelfeaturestate.isHandled)
	//*  52  117:aload           6
	//*  53  119:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  54  122:ifne            133
	//*  55  125:aload           6
	//*  56  127:getfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
	//*  57  130:ifeq            149
		{
			flag = panelfeaturestate.isOpen;
	//   58  133:aload           6
	//   59  135:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//   60  138:istore_3        
			closePanel(panelfeaturestate, true);
	//   61  139:aload_0         
	//   62  140:aload           6
	//   63  142:iconst_1        
	//   64  143:invokevirtual   #601 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		} else
	//*  65  146:goto            203
		{
			flag = flag2;
	//   66  149:iload           5
	//   67  151:istore_3        
			if(panelfeaturestate.isPrepared)
	//*  68  152:aload           6
	//*  69  154:getfield        #604 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*  70  157:ifeq            203
			{
				boolean flag1 = true;
	//   71  160:iconst_1        
	//   72  161:istore          4
				if(panelfeaturestate.refreshMenuContent)
	//*  73  163:aload           6
	//*  74  165:getfield        #607 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  75  168:ifeq            186
				{
					panelfeaturestate.isPrepared = false;
	//   76  171:aload           6
	//   77  173:iconst_0        
	//   78  174:putfield        #604 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
					flag1 = preparePanel(panelfeaturestate, keyevent);
	//   79  177:aload_0         
	//   80  178:aload           6
	//   81  180:aload_2         
	//   82  181:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   83  184:istore          4
				}
				flag = flag2;
	//   84  186:iload           5
	//   85  188:istore_3        
				if(flag1)
	//*  86  189:iload           4
	//*  87  191:ifeq            203
				{
					openPanel(panelfeaturestate, keyevent);
	//   88  194:aload_0         
	//   89  195:aload           6
	//   90  197:aload_2         
	//   91  198:invokespecial   #611 <Method void openPanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
					flag = true;
	//   92  201:iconst_1        
	//   93  202:istore_3        
				}
			}
		}
		if(flag)
	//*  94  203:iload_3         
	//*  95  204:ifeq            242
		{
			keyevent = ((KeyEvent) ((AudioManager)mContext.getSystemService("audio")));
	//   96  207:aload_0         
	//   97  208:getfield        #156 <Field Context mContext>
	//   98  211:ldc2            #613 <String "audio">
	//   99  214:invokevirtual   #617 <Method Object Context.getSystemService(String)>
	//  100  217:checkcast       #619 <Class AudioManager>
	//  101  220:astore_2        
			if(keyevent != null)
	//* 102  221:aload_2         
	//* 103  222:ifnull          232
			{
				((AudioManager) (keyevent)).playSoundEffect(0);
	//  104  225:aload_2         
	//  105  226:iconst_0        
	//  106  227:invokevirtual   #622 <Method void AudioManager.playSoundEffect(int)>
				return flag;
	//  107  230:iload_3         
	//  108  231:ireturn         
			}
			Log.w("AppCompatDelegate", "Couldn't get audio manager");
	//  109  232:ldc2            #624 <String "AppCompatDelegate">
	//  110  235:ldc2            #626 <String "Couldn't get audio manager">
	//  111  238:invokestatic    #632 <Method int Log.w(String, String)>
	//  112  241:pop             
		}
		return flag;
	//  113  242:iload_3         
	//  114  243:ireturn         
	}

	private void openPanel(PanelFeatureState panelfeaturestate, KeyEvent keyevent)
	{
		if(panelfeaturestate.isOpen || isDestroyed())
	//*   0    0:aload_1         
	//*   1    1:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #466 <Method boolean isDestroyed()>
	//*   5   11:ifeq            15
			return;
	//    6   14:return          
		if(panelfeaturestate.featureId == 0)
	//*   7   15:aload_1         
	//*   8   16:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*   9   19:ifne            85
		{
			Context context = mContext;
	//   10   22:aload_0         
	//   11   23:getfield        #156 <Field Context mContext>
	//   12   26:astore          5
			boolean flag;
			if((context.getResources().getConfiguration().screenLayout & 0xf) == 4)
	//*  13   28:aload           5
	//*  14   30:invokevirtual   #517 <Method Resources Context.getResources()>
	//*  15   33:invokevirtual   #636 <Method Configuration Resources.getConfiguration()>
	//*  16   36:getfield        #641 <Field int Configuration.screenLayout>
	//*  17   39:bipush          15
	//*  18   41:iand            
	//*  19   42:iconst_4        
	//*  20   43:icmpne          51
				flag = true;
	//   21   46:iconst_1        
	//   22   47:istore_3        
			else
	//*  23   48:goto            53
				flag = false;
	//   24   51:iconst_0        
	//   25   52:istore_3        
			boolean flag1;
			if(context.getApplicationInfo().targetSdkVersion >= 11)
	//*  26   53:aload           5
	//*  27   55:invokevirtual   #645 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  28   58:getfield        #650 <Field int ApplicationInfo.targetSdkVersion>
	//*  29   61:bipush          11
	//*  30   63:icmplt          72
				flag1 = true;
	//   31   66:iconst_1        
	//   32   67:istore          4
			else
	//*  33   69:goto            75
				flag1 = false;
	//   34   72:iconst_0        
	//   35   73:istore          4
			if(flag && flag1)
	//*  36   75:iload_3         
	//*  37   76:ifeq            85
	//*  38   79:iload           4
	//*  39   81:ifeq            85
				return;
	//   40   84:return          
		}
		android.view.Window.Callback callback = getWindowCallback();
	//   41   85:aload_0         
	//   42   86:invokevirtual   #322 <Method android.view.Window$Callback getWindowCallback()>
	//   43   89:astore          5
		if(callback != null && !callback.onMenuOpened(panelfeaturestate.featureId, ((Menu) (panelfeaturestate.menu))))
	//*  44   91:aload           5
	//*  45   93:ifnull          121
	//*  46   96:aload           5
	//*  47   98:aload_1         
	//*  48   99:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  49  102:aload_1         
	//*  50  103:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  51  106:invokeinterface #656 <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//*  52  111:ifne            121
		{
			closePanel(panelfeaturestate, true);
	//   53  114:aload_0         
	//   54  115:aload_1         
	//   55  116:iconst_1        
	//   56  117:invokevirtual   #601 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
			return;
	//   57  120:return          
		}
		WindowManager windowmanager = (WindowManager)mContext.getSystemService("window");
	//   58  121:aload_0         
	//   59  122:getfield        #156 <Field Context mContext>
	//   60  125:ldc2            #658 <String "window">
	//   61  128:invokevirtual   #617 <Method Object Context.getSystemService(String)>
	//   62  131:checkcast       #660 <Class WindowManager>
	//   63  134:astore          6
		if(windowmanager == null)
	//*  64  136:aload           6
	//*  65  138:ifnonnull       142
			return;
	//   66  141:return          
		if(!preparePanel(panelfeaturestate, keyevent))
	//*  67  142:aload_0         
	//*  68  143:aload_1         
	//*  69  144:aload_2         
	//*  70  145:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//*  71  148:ifne            152
			return;
	//   72  151:return          
		byte byte0 = -2;
	//   73  152:bipush          -2
	//   74  154:istore          4
		int i;
		if(panelfeaturestate.decorView == null || panelfeaturestate.refreshDecorView)
	//*  75  156:aload_1         
	//*  76  157:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//*  77  160:ifnull          170
	//*  78  163:aload_1         
	//*  79  164:getfield        #663 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
	//*  80  167:ifeq            345
		{
			if(panelfeaturestate.decorView == null)
	//*  81  170:aload_1         
	//*  82  171:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//*  83  174:ifnonnull       193
			{
				if(!initializePanelDecor(panelfeaturestate) || panelfeaturestate.decorView == null)
	//*  84  177:aload_0         
	//*  85  178:aload_1         
	//*  86  179:invokespecial   #665 <Method boolean initializePanelDecor(AppCompatDelegateImplV9$PanelFeatureState)>
	//*  87  182:ifeq            192
	//*  88  185:aload_1         
	//*  89  186:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//*  90  189:ifnonnull       217
					return;
	//   91  192:return          
			} else
			if(panelfeaturestate.refreshDecorView && panelfeaturestate.decorView.getChildCount() > 0)
	//*  92  193:aload_1         
	//*  93  194:getfield        #663 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
	//*  94  197:ifeq            217
	//*  95  200:aload_1         
	//*  96  201:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//*  97  204:invokevirtual   #406 <Method int ViewGroup.getChildCount()>
	//*  98  207:ifle            217
				panelfeaturestate.decorView.removeAllViews();
	//   99  210:aload_1         
	//  100  211:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  101  214:invokevirtual   #668 <Method void ViewGroup.removeAllViews()>
			if(!initializePanelContent(panelfeaturestate) || !panelfeaturestate.hasPanelItems())
	//* 102  217:aload_0         
	//* 103  218:aload_1         
	//* 104  219:invokespecial   #670 <Method boolean initializePanelContent(AppCompatDelegateImplV9$PanelFeatureState)>
	//* 105  222:ifeq            232
	//* 106  225:aload_1         
	//* 107  226:invokevirtual   #673 <Method boolean AppCompatDelegateImplV9$PanelFeatureState.hasPanelItems()>
	//* 108  229:ifne            233
				return;
	//  109  232:return          
			Object obj = ((Object) (panelfeaturestate.shownPanelView.getLayoutParams()));
	//  110  233:aload_1         
	//  111  234:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  112  237:invokevirtual   #677 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  113  240:astore          5
			keyevent = ((KeyEvent) (obj));
	//  114  242:aload           5
	//  115  244:astore_2        
			if(obj == null)
	//* 116  245:aload           5
	//* 117  247:ifnonnull       262
				keyevent = ((KeyEvent) (new android.view.ViewGroup.LayoutParams(-2, -2)));
	//  118  250:new             #679 <Class android.view.ViewGroup$LayoutParams>
	//  119  253:dup             
	//  120  254:bipush          -2
	//  121  256:bipush          -2
	//  122  258:invokespecial   #682 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  123  261:astore_2        
			i = panelfeaturestate.background;
	//  124  262:aload_1         
	//  125  263:getfield        #685 <Field int AppCompatDelegateImplV9$PanelFeatureState.background>
	//  126  266:istore_3        
			panelfeaturestate.decorView.setBackgroundResource(i);
	//  127  267:aload_1         
	//  128  268:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  129  271:iload_3         
	//  130  272:invokevirtual   #688 <Method void ViewGroup.setBackgroundResource(int)>
			obj = ((Object) (panelfeaturestate.shownPanelView.getParent()));
	//  131  275:aload_1         
	//  132  276:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  133  279:invokevirtual   #692 <Method ViewParent View.getParent()>
	//  134  282:astore          5
			if(obj != null && (obj instanceof ViewGroup))
	//* 135  284:aload           5
	//* 136  286:ifnull          309
	//* 137  289:aload           5
	//* 138  291:instanceof      #117 <Class ViewGroup>
	//* 139  294:ifeq            309
				((ViewGroup)obj).removeView(panelfeaturestate.shownPanelView);
	//  140  297:aload           5
	//  141  299:checkcast       #117 <Class ViewGroup>
	//  142  302:aload_1         
	//  143  303:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  144  306:invokevirtual   #695 <Method void ViewGroup.removeView(View)>
			panelfeaturestate.decorView.addView(panelfeaturestate.shownPanelView, ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  145  309:aload_1         
	//  146  310:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  147  313:aload_1         
	//  148  314:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  149  317:aload_2         
	//  150  318:invokevirtual   #698 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
			if(!panelfeaturestate.shownPanelView.hasFocus())
	//* 151  321:aload_1         
	//* 152  322:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//* 153  325:invokevirtual   #701 <Method boolean View.hasFocus()>
	//* 154  328:ifne            339
				panelfeaturestate.shownPanelView.requestFocus();
	//  155  331:aload_1         
	//  156  332:getfield        #481 <Field View AppCompatDelegateImplV9$PanelFeatureState.shownPanelView>
	//  157  335:invokevirtual   #704 <Method boolean View.requestFocus()>
	//  158  338:pop             
			i = ((int) (byte0));
	//  159  339:iload           4
	//  160  341:istore_3        
		} else
	//* 161  342:goto            383
		{
			i = ((int) (byte0));
	//  162  345:iload           4
	//  163  347:istore_3        
			if(panelfeaturestate.createdPanelView != null)
	//* 164  348:aload_1         
	//* 165  349:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//* 166  352:ifnull          383
			{
				keyevent = ((KeyEvent) (panelfeaturestate.createdPanelView.getLayoutParams()));
	//  167  355:aload_1         
	//  168  356:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//  169  359:invokevirtual   #677 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  170  362:astore_2        
				i = ((int) (byte0));
	//  171  363:iload           4
	//  172  365:istore_3        
				if(keyevent != null)
	//* 173  366:aload_2         
	//* 174  367:ifnull          383
				{
					i = ((int) (byte0));
	//  175  370:iload           4
	//  176  372:istore_3        
					if(((android.view.ViewGroup.LayoutParams) (keyevent)).width == -1)
	//* 177  373:aload_2         
	//* 178  374:getfield        #707 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 179  377:iconst_m1       
	//* 180  378:icmpne          383
						i = -1;
	//  181  381:iconst_m1       
	//  182  382:istore_3        
				}
			}
		}
		panelfeaturestate.isHandled = false;
	//  183  383:aload_1         
	//  184  384:iconst_0        
	//  185  385:putfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
		keyevent = ((KeyEvent) (new android.view.WindowManager.LayoutParams(i, -2, panelfeaturestate.x, panelfeaturestate.y, 1002, 0x820000, -3)));
	//  186  388:new             #709 <Class android.view.WindowManager$LayoutParams>
	//  187  391:dup             
	//  188  392:iload_3         
	//  189  393:bipush          -2
	//  190  395:aload_1         
	//  191  396:getfield        #712 <Field int AppCompatDelegateImplV9$PanelFeatureState.x>
	//  192  399:aload_1         
	//  193  400:getfield        #715 <Field int AppCompatDelegateImplV9$PanelFeatureState.y>
	//  194  403:sipush          1002
	//  195  406:ldc2            #716 <Int 0x820000>
	//  196  409:bipush          -3
	//  197  411:invokespecial   #719 <Method void android.view.WindowManager$LayoutParams(int, int, int, int, int, int, int)>
	//  198  414:astore_2        
		keyevent.gravity = panelfeaturestate.gravity;
	//  199  415:aload_2         
	//  200  416:aload_1         
	//  201  417:getfield        #509 <Field int AppCompatDelegateImplV9$PanelFeatureState.gravity>
	//  202  420:putfield        #720 <Field int android.view.WindowManager$LayoutParams.gravity>
		keyevent.windowAnimations = panelfeaturestate.windowAnimations;
	//  203  423:aload_2         
	//  204  424:aload_1         
	//  205  425:getfield        #723 <Field int AppCompatDelegateImplV9$PanelFeatureState.windowAnimations>
	//  206  428:putfield        #724 <Field int android.view.WindowManager$LayoutParams.windowAnimations>
		windowmanager.addView(((View) (panelfeaturestate.decorView)), ((android.view.ViewGroup.LayoutParams) (keyevent)));
	//  207  431:aload           6
	//  208  433:aload_1         
	//  209  434:getfield        #506 <Field ViewGroup AppCompatDelegateImplV9$PanelFeatureState.decorView>
	//  210  437:aload_2         
	//  211  438:invokeinterface #725 <Method void WindowManager.addView(View, android.view.ViewGroup$LayoutParams)>
		panelfeaturestate.isOpen = true;
	//  212  443:aload_1         
	//  213  444:iconst_1        
	//  214  445:putfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//  215  448:return          
	}

	private boolean performPanelShortcut(PanelFeatureState panelfeaturestate, int i, KeyEvent keyevent, int j)
	{
		boolean flag;
label0:
		{
			if(keyevent.isSystem())
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #730 <Method boolean KeyEvent.isSystem()>
	//*   2    4:ifeq            9
				return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
			boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore          6
			if(!panelfeaturestate.isPrepared)
	//*   7   12:aload_1         
	//*   8   13:getfield        #604 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*   9   16:ifne            32
			{
				flag = flag1;
	//   10   19:iload           6
	//   11   21:istore          5
				if(!preparePanel(panelfeaturestate, keyevent))
					break label0;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:aload_3         
	//   15   26:invokespecial   #567 <Method boolean preparePanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
	//   16   29:ifeq            56
			}
			flag = flag1;
	//   17   32:iload           6
	//   18   34:istore          5
			if(panelfeaturestate.menu != null)
	//*  19   36:aload_1         
	//*  20   37:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  21   40:ifnull          56
				flag = panelfeaturestate.menu.performShortcut(i, keyevent, j);
	//   22   43:aload_1         
	//   23   44:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   24   47:iload_2         
	//   25   48:aload_3         
	//   26   49:iload           4
	//   27   51:invokevirtual   #734 <Method boolean MenuBuilder.performShortcut(int, KeyEvent, int)>
	//   28   54:istore          5
		}
		if(flag && (j & 1) == 0 && mDecorContentParent == null)
	//*  29   56:iload           5
	//*  30   58:ifeq            81
	//*  31   61:iload           4
	//*  32   63:iconst_1        
	//*  33   64:iand            
	//*  34   65:ifne            81
	//*  35   68:aload_0         
	//*  36   69:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  37   72:ifnonnull       81
			closePanel(panelfeaturestate, true);
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:iconst_1        
	//   41   78:invokevirtual   #601 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		return flag;
	//   42   81:iload           5
	//   43   83:ireturn         
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
	//*   6   10:getfield        #604 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
	//*   7   13:ifeq            18
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(mPreparedPanel != null && mPreparedPanel != panelfeaturestate)
	//*  10   18:aload_0         
	//*  11   19:getfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  12   22:ifnull          42
	//*  13   25:aload_0         
	//*  14   26:getfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  15   29:aload_1         
	//*  16   30:if_acmpeq       42
			closePanel(mPreparedPanel, false);
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   20   38:iconst_0        
	//   21   39:invokevirtual   #601 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
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
	//   31   60:invokeinterface #739 <Method View android.view.Window$Callback.onCreatePanelView(int)>
	//   32   65:putfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
		int i;
		if(panelfeaturestate.featureId == 0 || panelfeaturestate.featureId == 108)
	//*  33   68:aload_1         
	//*  34   69:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  35   72:ifeq            84
	//*  36   75:aload_1         
	//*  37   76:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//*  38   79:bipush          108
	//*  39   81:icmpne          89
			i = 1;
	//   40   84:iconst_1        
	//   41   85:istore_3        
		else
	//*  42   86:goto            91
			i = 0;
	//   43   89:iconst_0        
	//   44   90:istore_3        
		if(i && mDecorContentParent != null)
	//*  45   91:iload_3         
	//*  46   92:ifeq            111
	//*  47   95:aload_0         
	//*  48   96:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  49   99:ifnull          111
			mDecorContentParent.setMenuPrepared();
	//   50  102:aload_0         
	//   51  103:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   52  106:invokeinterface #742 <Method void DecorContentParent.setMenuPrepared()>
		if(panelfeaturestate.createdPanelView == null && (!i || !(peekSupportActionBar() instanceof ToolbarActionBar)))
	//*  53  111:aload_1         
	//*  54  112:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//*  55  115:ifnonnull       420
	//*  56  118:iload_3         
	//*  57  119:ifeq            132
	//*  58  122:aload_0         
	//*  59  123:invokevirtual   #746 <Method ActionBar peekSupportActionBar()>
	//*  60  126:instanceof      #748 <Class ToolbarActionBar>
	//*  61  129:ifne            420
		{
			if(panelfeaturestate.menu == null || panelfeaturestate.refreshMenuContent)
	//*  62  132:aload_1         
	//*  63  133:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  64  136:ifnull          146
	//*  65  139:aload_1         
	//*  66  140:getfield        #607 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  67  143:ifeq            279
			{
				if(panelfeaturestate.menu == null && (!initializePanelMenu(panelfeaturestate) || panelfeaturestate.menu == null))
	//*  68  146:aload_1         
	//*  69  147:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  70  150:ifnonnull       170
	//*  71  153:aload_0         
	//*  72  154:aload_1         
	//*  73  155:invokespecial   #750 <Method boolean initializePanelMenu(AppCompatDelegateImplV9$PanelFeatureState)>
	//*  74  158:ifeq            168
	//*  75  161:aload_1         
	//*  76  162:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  77  165:ifnonnull       170
					return false;
	//   78  168:iconst_0        
	//   79  169:ireturn         
				if(i && mDecorContentParent != null)
	//*  80  170:iload_3         
	//*  81  171:ifeq            217
	//*  82  174:aload_0         
	//*  83  175:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  84  178:ifnull          217
				{
					if(mActionMenuPresenterCallback == null)
	//*  85  181:aload_0         
	//*  86  182:getfield        #752 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//*  87  185:ifnonnull       200
						mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
	//   88  188:aload_0         
	//   89  189:new             #24  <Class AppCompatDelegateImplV9$ActionMenuPresenterCallback>
	//   90  192:dup             
	//   91  193:aload_0         
	//   92  194:invokespecial   #753 <Method void AppCompatDelegateImplV9$ActionMenuPresenterCallback(AppCompatDelegateImplV9)>
	//   93  197:putfield        #752 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
					mDecorContentParent.setMenu(((Menu) (panelfeaturestate.menu)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//   94  200:aload_0         
	//   95  201:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   96  204:aload_1         
	//   97  205:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   98  208:aload_0         
	//   99  209:getfield        #752 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  100  212:invokeinterface #756 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
				}
				panelfeaturestate.menu.stopDispatchingItemsChanged();
	//  101  217:aload_1         
	//  102  218:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  103  221:invokevirtual   #759 <Method void MenuBuilder.stopDispatchingItemsChanged()>
				if(!callback.onCreatePanelMenu(panelfeaturestate.featureId, ((Menu) (panelfeaturestate.menu))))
	//* 104  224:aload           5
	//* 105  226:aload_1         
	//* 106  227:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//* 107  230:aload_1         
	//* 108  231:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//* 109  234:invokeinterface #762 <Method boolean android.view.Window$Callback.onCreatePanelMenu(int, Menu)>
	//* 110  239:ifne            274
				{
					panelfeaturestate.setMenu(((MenuBuilder) (null)));
	//  111  242:aload_1         
	//  112  243:aconst_null     
	//  113  244:invokevirtual   #545 <Method void AppCompatDelegateImplV9$PanelFeatureState.setMenu(MenuBuilder)>
					if(i && mDecorContentParent != null)
	//* 114  247:iload_3         
	//* 115  248:ifeq            272
	//* 116  251:aload_0         
	//* 117  252:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//* 118  255:ifnull          272
						mDecorContentParent.setMenu(((Menu) (null)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//  119  258:aload_0         
	//  120  259:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  121  262:aconst_null     
	//  122  263:aload_0         
	//  123  264:getfield        #752 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  124  267:invokeinterface #756 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
					return false;
	//  125  272:iconst_0        
	//  126  273:ireturn         
				}
				panelfeaturestate.refreshMenuContent = false;
	//  127  274:aload_1         
	//  128  275:iconst_0        
	//  129  276:putfield        #607 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
			}
			panelfeaturestate.menu.stopDispatchingItemsChanged();
	//  130  279:aload_1         
	//  131  280:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  132  283:invokevirtual   #759 <Method void MenuBuilder.stopDispatchingItemsChanged()>
			if(panelfeaturestate.frozenActionViewState != null)
	//* 133  286:aload_1         
	//* 134  287:getfield        #766 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
	//* 135  290:ifnull          309
			{
				panelfeaturestate.menu.restoreActionViewStates(panelfeaturestate.frozenActionViewState);
	//  136  293:aload_1         
	//  137  294:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  138  297:aload_1         
	//  139  298:getfield        #766 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
	//  140  301:invokevirtual   #770 <Method void MenuBuilder.restoreActionViewStates(Bundle)>
				panelfeaturestate.frozenActionViewState = null;
	//  141  304:aload_1         
	//  142  305:aconst_null     
	//  143  306:putfield        #766 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
			}
			if(!callback.onPreparePanel(0, panelfeaturestate.createdPanelView, ((Menu) (panelfeaturestate.menu))))
	//* 144  309:aload           5
	//* 145  311:iconst_0        
	//* 146  312:aload_1         
	//* 147  313:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//* 148  316:aload_1         
	//* 149  317:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//* 150  320:invokeinterface #774 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//* 151  325:ifne            362
			{
				if(i && mDecorContentParent != null)
	//* 152  328:iload_3         
	//* 153  329:ifeq            353
	//* 154  332:aload_0         
	//* 155  333:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//* 156  336:ifnull          353
					mDecorContentParent.setMenu(((Menu) (null)), ((android.support.v7.view.menu.MenuPresenter.Callback) (mActionMenuPresenterCallback)));
	//  157  339:aload_0         
	//  158  340:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//  159  343:aconst_null     
	//  160  344:aload_0         
	//  161  345:getfield        #752 <Field AppCompatDelegateImplV9$ActionMenuPresenterCallback mActionMenuPresenterCallback>
	//  162  348:invokeinterface #756 <Method void DecorContentParent.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
				panelfeaturestate.menu.startDispatchingItemsChanged();
	//  163  353:aload_1         
	//  164  354:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  165  357:invokevirtual   #777 <Method void MenuBuilder.startDispatchingItemsChanged()>
				return false;
	//  166  360:iconst_0        
	//  167  361:ireturn         
			}
			if(keyevent != null)
	//* 168  362:aload_2         
	//* 169  363:ifnull          374
				i = keyevent.getDeviceId();
	//  170  366:aload_2         
	//  171  367:invokevirtual   #780 <Method int KeyEvent.getDeviceId()>
	//  172  370:istore_3        
			else
	//* 173  371:goto            376
				i = -1;
	//  174  374:iconst_m1       
	//  175  375:istore_3        
			boolean flag;
			if(KeyCharacterMap.load(i).getKeyboardType() != 1)
	//* 176  376:iload_3         
	//* 177  377:invokestatic    #786 <Method KeyCharacterMap KeyCharacterMap.load(int)>
	//* 178  380:invokevirtual   #789 <Method int KeyCharacterMap.getKeyboardType()>
	//* 179  383:iconst_1        
	//* 180  384:icmpeq          393
				flag = true;
	//  181  387:iconst_1        
	//  182  388:istore          4
			else
	//* 183  390:goto            396
				flag = false;
	//  184  393:iconst_0        
	//  185  394:istore          4
			panelfeaturestate.qwertyMode = flag;
	//  186  396:aload_1         
	//  187  397:iload           4
	//  188  399:putfield        #792 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.qwertyMode>
			panelfeaturestate.menu.setQwertyMode(panelfeaturestate.qwertyMode);
	//  189  402:aload_1         
	//  190  403:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  191  406:aload_1         
	//  192  407:getfield        #792 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.qwertyMode>
	//  193  410:invokevirtual   #796 <Method void MenuBuilder.setQwertyMode(boolean)>
			panelfeaturestate.menu.startDispatchingItemsChanged();
	//  194  413:aload_1         
	//  195  414:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//  196  417:invokevirtual   #777 <Method void MenuBuilder.startDispatchingItemsChanged()>
		}
		panelfeaturestate.isPrepared = true;
	//  197  420:aload_1         
	//  198  421:iconst_1        
	//  199  422:putfield        #604 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
		panelfeaturestate.isHandled = false;
	//  200  425:aload_1         
	//  201  426:iconst_0        
	//  202  427:putfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
		mPreparedPanel = panelfeaturestate;
	//  203  430:aload_0         
	//  204  431:aload_1         
	//  205  432:putfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
		return true;
	//  206  435:iconst_1        
	//  207  436:ireturn         
	}

	private void reopenMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(mDecorContentParent != null && mDecorContentParent.canShowOverflowMenu() && (!ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(mContext)) || mDecorContentParent.isOverflowMenuShowPending()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*   2    4:ifnull          214
	//*   3    7:aload_0         
	//*   4    8:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*   5   11:invokeinterface #573 <Method boolean DecorContentParent.canShowOverflowMenu()>
	//*   6   16:ifeq            214
	//*   7   19:aload_0         
	//*   8   20:getfield        #156 <Field Context mContext>
	//*   9   23:invokestatic    #579 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//*  10   26:invokestatic    #585 <Method boolean ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration)>
	//*  11   29:ifeq            44
	//*  12   32:aload_0         
	//*  13   33:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  14   36:invokeinterface #801 <Method boolean DecorContentParent.isOverflowMenuShowPending()>
	//*  15   41:ifeq            214
		{
			menubuilder = ((MenuBuilder) (getWindowCallback()));
	//   16   44:aload_0         
	//   17   45:invokevirtual   #322 <Method android.view.Window$Callback getWindowCallback()>
	//   18   48:astore_1        
			if(!mDecorContentParent.isOverflowMenuShowing() || !flag)
	//*  19   49:aload_0         
	//*  20   50:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//*  21   53:invokeinterface #588 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  22   58:ifeq            65
	//*  23   61:iload_2         
	//*  24   62:ifne            179
			{
				if(menubuilder != null && !isDestroyed())
	//*  25   65:aload_1         
	//*  26   66:ifnull          213
	//*  27   69:aload_0         
	//*  28   70:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  29   73:ifne            213
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
	//   43  103:invokevirtual   #805 <Method boolean View.removeCallbacks(Runnable)>
	//   44  106:pop             
						mInvalidatePanelMenuRunnable.run();
	//   45  107:aload_0         
	//   46  108:getfield        #111 <Field Runnable mInvalidatePanelMenuRunnable>
	//   47  111:invokeinterface #810 <Method void Runnable.run()>
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
	//*  57  131:getfield        #607 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
	//*  58  134:ifne            178
	//*  59  137:aload_1         
	//*  60  138:iconst_0        
	//*  61  139:aload_3         
	//*  62  140:getfield        #478 <Field View AppCompatDelegateImplV9$PanelFeatureState.createdPanelView>
	//*  63  143:aload_3         
	//*  64  144:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  65  147:invokeinterface #774 <Method boolean android.view.Window$Callback.onPreparePanel(int, View, Menu)>
	//*  66  152:ifeq            178
					{
						((android.view.Window.Callback) (menubuilder)).onMenuOpened(108, ((Menu) (panelfeaturestate.menu)));
	//   67  155:aload_1         
	//   68  156:bipush          108
	//   69  158:aload_3         
	//   70  159:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   71  162:invokeinterface #656 <Method boolean android.view.Window$Callback.onMenuOpened(int, Menu)>
	//   72  167:pop             
						mDecorContentParent.showOverflowMenu();
	//   73  168:aload_0         
	//   74  169:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   75  172:invokeinterface #591 <Method boolean DecorContentParent.showOverflowMenu()>
	//   76  177:pop             
					}
					return;
	//   77  178:return          
				}
			} else
			{
				mDecorContentParent.hideOverflowMenu();
	//   78  179:aload_0         
	//   79  180:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//   80  183:invokeinterface #594 <Method boolean DecorContentParent.hideOverflowMenu()>
	//   81  188:pop             
				if(!isDestroyed())
	//*  82  189:aload_0         
	//*  83  190:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  84  193:ifne            213
					((android.view.Window.Callback) (menubuilder)).onPanelClosed(108, ((Menu) (getPanelState(0, true).menu)));
	//   85  196:aload_1         
	//   86  197:bipush          108
	//   87  199:aload_0         
	//   88  200:iconst_0        
	//   89  201:iconst_1        
	//   90  202:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   91  205:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   92  208:invokeinterface #814 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
			}
			return;
	//   93  213:return          
		} else
		{
			menubuilder = ((MenuBuilder) (getPanelState(0, true)));
	//   94  214:aload_0         
	//   95  215:iconst_0        
	//   96  216:iconst_1        
	//   97  217:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   98  220:astore_1        
			menubuilder.refreshDecorView = true;
	//   99  221:aload_1         
	//  100  222:iconst_1        
	//  101  223:putfield        #663 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
			closePanel(((PanelFeatureState) (menubuilder)), false);
	//  102  226:aload_0         
	//  103  227:aload_1         
	//  104  228:iconst_0        
	//  105  229:invokevirtual   #601 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
			openPanel(((PanelFeatureState) (menubuilder)), ((KeyEvent) (null)));
	//  106  232:aload_0         
	//  107  233:aload_1         
	//  108  234:aconst_null     
	//  109  235:invokespecial   #611 <Method void openPanel(AppCompatDelegateImplV9$PanelFeatureState, KeyEvent)>
			return;
	//  110  238:return          
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
	//    3    6:ldc2            #624 <String "AppCompatDelegate">
	//    4    9:ldc2            #818 <String "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.">
	//    5   12:invokestatic    #821 <Method int Log.i(String, String)>
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
	//   12   25:ldc2            #624 <String "AppCompatDelegate">
	//   13   28:ldc2            #823 <String "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.">
	//   14   31:invokestatic    #821 <Method int Log.i(String, String)>
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
			if(viewparent == view || !(viewparent instanceof View) || ViewCompat.isAttachedToWindow((View)viewparent))
	//*  12   20:aload_1         
	//*  13   21:aload_2         
	//*  14   22:if_acmpeq       42
	//*  15   25:aload_1         
	//*  16   26:instanceof      #135 <Class View>
	//*  17   29:ifeq            42
	//*  18   32:aload_1         
	//*  19   33:checkcast       #135 <Class View>
	//*  20   36:invokestatic    #829 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  21   39:ifeq            44
				return false;
	//   22   42:iconst_0        
	//   23   43:ireturn         
			viewparent = viewparent.getParent();
	//   24   44:aload_1         
	//   25   45:invokeinterface #832 <Method ViewParent ViewParent.getParent()>
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
	//    3    7:new             #835 <Class AndroidRuntimeException>
	//    4   10:dup             
	//    5   11:ldc2            #837 <String "Window feature must be requested before adding content">
	//    6   14:invokespecial   #838 <Method void AndroidRuntimeException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #841 <Method void ensureSubDecor()>
		((ViewGroup)mSubDecor.findViewById(0x1020002)).addView(view, layoutparams);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:invokevirtual   #698 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		mOriginalWindowCallback.onContentChanged();
	//   10   21:aload_0         
	//   11   22:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   12   25:invokeinterface #848 <Method void android.view.Window$Callback.onContentChanged()>
	//   13   30:return          
	}

	View callActivityOnCreateView(View view, String s, Context context, AttributeSet attributeset)
	{
		if(mOriginalWindowCallback instanceof android.view.LayoutInflater.Factory)
	//*   0    0:aload_0         
	//*   1    1:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #852 <Class android.view.LayoutInflater$Factory>
	//*   3    7:ifeq            33
		{
			view = ((android.view.LayoutInflater.Factory)mOriginalWindowCallback).onCreateView(s, context, attributeset);
	//    4   10:aload_0         
	//    5   11:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//    6   14:checkcast       #852 <Class android.view.LayoutInflater$Factory>
	//    7   17:aload_2         
	//    8   18:aload_3         
	//    9   19:aload           4
	//   10   21:invokeinterface #856 <Method View android.view.LayoutInflater$Factory.onCreateView(String, Context, AttributeSet)>
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
	//*  18   29:getfield        #860 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
	//*  19   32:arraylength     
	//*  20   33:icmpge          44
						panelfeaturestate1 = mPanels[i];
	//   21   36:aload_0         
	//   22   37:getfield        #860 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
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
	//   47   89:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   48   92:iload_1         
	//   49   93:aload           6
	//   50   95:invokeinterface #814 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
	//   51  100:return          
	}

	void checkCloseActionMenu(MenuBuilder menubuilder)
	{
		if(mClosingActionMenu)
	//*   0    0:aload_0         
	//*   1    1:getfield        #863 <Field boolean mClosingActionMenu>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		mClosingActionMenu = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #863 <Field boolean mClosingActionMenu>
		mDecorContentParent.dismissPopups();
	//    7   13:aload_0         
	//    8   14:getfield        #318 <Field DecorContentParent mDecorContentParent>
	//    9   17:invokeinterface #866 <Method void DecorContentParent.dismissPopups()>
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
	//   21   42:invokeinterface #814 <Method void android.view.Window$Callback.onPanelClosed(int, Menu)>
		mClosingActionMenu = false;
	//   22   47:aload_0         
	//   23   48:iconst_0        
	//   24   49:putfield        #863 <Field boolean mClosingActionMenu>
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
	//    6    8:invokevirtual   #601 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
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
	//*  10   22:invokeinterface #588 <Method boolean DecorContentParent.isOverflowMenuShowing()>
	//*  11   27:ifeq            39
		{
			checkCloseActionMenu(panelfeaturestate.menu);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   15   35:invokevirtual   #868 <Method void checkCloseActionMenu(MenuBuilder)>
			return;
	//   16   38:return          
		}
		WindowManager windowmanager = (WindowManager)mContext.getSystemService("window");
	//   17   39:aload_0         
	//   18   40:getfield        #156 <Field Context mContext>
	//   19   43:ldc2            #658 <String "window">
	//   20   46:invokevirtual   #617 <Method Object Context.getSystemService(String)>
	//   21   49:checkcast       #660 <Class WindowManager>
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
	//   34   76:invokeinterface #869 <Method void WindowManager.removeView(View)>
			if(flag)
	//*  35   81:iload_2         
	//*  36   82:ifeq            95
				callOnPanelClosed(panelfeaturestate.featureId, panelfeaturestate, ((Menu) (null)));
	//   37   85:aload_0         
	//   38   86:aload_1         
	//   39   87:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   40   90:aload_1         
	//   41   91:aconst_null     
	//   42   92:invokevirtual   #871 <Method void callOnPanelClosed(int, AppCompatDelegateImplV9$PanelFeatureState, Menu)>
		}
		panelfeaturestate.isPrepared = false;
	//   43   95:aload_1         
	//   44   96:iconst_0        
	//   45   97:putfield        #604 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
		panelfeaturestate.isHandled = false;
	//   46  100:aload_1         
	//   47  101:iconst_0        
	//   48  102:putfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
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
	//   57  117:putfield        #663 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
		if(mPreparedPanel == panelfeaturestate)
	//*  58  120:aload_0         
	//*  59  121:getfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  60  124:aload_1         
	//*  61  125:if_acmpne       133
			mPreparedPanel = null;
	//   62  128:aload_0         
	//   63  129:aconst_null     
	//   64  130:putfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   65  133:return          
	}

	public View createView(View view, String s, Context context, AttributeSet attributeset)
	{
		if(mAppCompatViewInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #875 <Field AppCompatViewInflater mAppCompatViewInflater>
	//*   2    4:ifnonnull       18
			mAppCompatViewInflater = new AppCompatViewInflater();
	//    3    7:aload_0         
	//    4    8:new             #877 <Class AppCompatViewInflater>
	//    5   11:dup             
	//    6   12:invokespecial   #878 <Method void AppCompatViewInflater()>
	//    7   15:putfield        #875 <Field AppCompatViewInflater mAppCompatViewInflater>
		boolean flag = false;
	//    8   18:iconst_0        
	//    9   19:istore          5
		if(IS_PRE_LOLLIPOP)
	//*  10   21:getstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//*  11   24:ifeq            71
			if(attributeset instanceof XmlPullParser)
	//*  12   27:aload           4
	//*  13   29:instanceof      #880 <Class XmlPullParser>
	//*  14   32:ifeq            61
			{
				if(((XmlPullParser)attributeset).getDepth() > 1)
	//*  15   35:aload           4
	//*  16   37:checkcast       #880 <Class XmlPullParser>
	//*  17   40:invokeinterface #883 <Method int XmlPullParser.getDepth()>
	//*  18   45:iconst_1        
	//*  19   46:icmple          55
					flag = true;
	//   20   49:iconst_1        
	//   21   50:istore          5
				else
	//*  22   52:goto            71
					flag = false;
	//   23   55:iconst_0        
	//   24   56:istore          5
			} else
	//*  25   58:goto            71
			{
				flag = shouldInheritContext((ViewParent)view);
	//   26   61:aload_0         
	//   27   62:aload_1         
	//   28   63:checkcast       #831 <Class ViewParent>
	//   29   66:invokespecial   #885 <Method boolean shouldInheritContext(ViewParent)>
	//   30   69:istore          5
			}
		return mAppCompatViewInflater.createView(view, s, context, attributeset, flag, IS_PRE_LOLLIPOP, true, VectorEnabledTintResources.shouldBeUsed());
	//   31   71:aload_0         
	//   32   72:getfield        #875 <Field AppCompatViewInflater mAppCompatViewInflater>
	//   33   75:aload_1         
	//   34   76:aload_2         
	//   35   77:aload_3         
	//   36   78:aload           4
	//   37   80:iload           5
	//   38   82:getstatic       #99  <Field boolean IS_PRE_LOLLIPOP>
	//   39   85:iconst_1        
	//   40   86:invokestatic    #890 <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//   41   89:invokevirtual   #893 <Method View AppCompatViewInflater.createView(View, String, Context, AttributeSet, boolean, boolean, boolean, boolean)>
	//   42   92:areturn         
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
	//    5   11:invokeinterface #866 <Method void DecorContentParent.dismissPopups()>
		if(mActionModePopup != null)
	//*   6   16:aload_0         
	//*   7   17:getfield        #896 <Field PopupWindow mActionModePopup>
	//*   8   20:ifnull          64
		{
			mWindow.getDecorView().removeCallbacks(mShowActionModePopup);
	//    9   23:aload_0         
	//   10   24:getfield        #127 <Field Window mWindow>
	//   11   27:invokevirtual   #133 <Method View Window.getDecorView()>
	//   12   30:aload_0         
	//   13   31:getfield        #898 <Field Runnable mShowActionModePopup>
	//   14   34:invokevirtual   #805 <Method boolean View.removeCallbacks(Runnable)>
	//   15   37:pop             
			if(mActionModePopup.isShowing())
	//*  16   38:aload_0         
	//*  17   39:getfield        #896 <Field PopupWindow mActionModePopup>
	//*  18   42:invokevirtual   #903 <Method boolean PopupWindow.isShowing()>
	//*  19   45:ifeq            59
				try
				{
					mActionModePopup.dismiss();
	//   20   48:aload_0         
	//   21   49:getfield        #896 <Field PopupWindow mActionModePopup>
	//   22   52:invokevirtual   #906 <Method void PopupWindow.dismiss()>
				}
	//*  23   55:goto            59
				catch(IllegalArgumentException illegalargumentexception) { }
	//   24   58:astore_1        
			mActionModePopup = null;
	//   25   59:aload_0         
	//   26   60:aconst_null     
	//   27   61:putfield        #896 <Field PopupWindow mActionModePopup>
		}
		endOnGoingFadeAnimation();
	//   28   64:aload_0         
	//   29   65:invokevirtual   #909 <Method void endOnGoingFadeAnimation()>
		PanelFeatureState panelfeaturestate = getPanelState(0, false);
	//   30   68:aload_0         
	//   31   69:iconst_0        
	//   32   70:iconst_0        
	//   33   71:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   34   74:astore_1        
		if(panelfeaturestate != null && panelfeaturestate.menu != null)
	//*  35   75:aload_1         
	//*  36   76:ifnull          93
	//*  37   79:aload_1         
	//*  38   80:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//*  39   83:ifnull          93
			panelfeaturestate.menu.close();
	//   40   86:aload_1         
	//   41   87:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   42   90:invokevirtual   #912 <Method void MenuBuilder.close()>
	//   43   93:return          
	}

	boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		if(keyevent.getKeyCode() == 82 && mOriginalWindowCallback.dispatchKeyEvent(keyevent))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #917 <Method int KeyEvent.getKeyCode()>
	//*   2    4:bipush          82
	//*   3    6:icmpne          24
	//*   4    9:aload_0         
	//*   5   10:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   6   13:aload_1         
	//*   7   14:invokeinterface #919 <Method boolean android.view.Window$Callback.dispatchKeyEvent(KeyEvent)>
	//*   8   19:ifeq            24
			return true;
	//    9   22:iconst_1        
	//   10   23:ireturn         
		int i = keyevent.getKeyCode();
	//   11   24:aload_1         
	//   12   25:invokevirtual   #917 <Method int KeyEvent.getKeyCode()>
	//   13   28:istore_3        
		boolean flag;
		if(keyevent.getAction() == 0)
	//*  14   29:aload_1         
	//*  15   30:invokevirtual   #922 <Method int KeyEvent.getAction()>
	//*  16   33:ifne            41
			flag = true;
	//   17   36:iconst_1        
	//   18   37:istore_2        
		else
	//*  19   38:goto            43
			flag = false;
	//   20   41:iconst_0        
	//   21   42:istore_2        
		if(flag)
	//*  22   43:iload_2         
	//*  23   44:ifeq            54
			return onKeyDown(i, keyevent);
	//   24   47:aload_0         
	//   25   48:iload_3         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #925 <Method boolean onKeyDown(int, KeyEvent)>
	//   28   53:ireturn         
		else
			return onKeyUp(i, keyevent);
	//   29   54:aload_0         
	//   30   55:iload_3         
	//   31   56:aload_1         
	//   32   57:invokevirtual   #928 <Method boolean onKeyUp(int, KeyEvent)>
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
	//    8   14:new             #931 <Class Bundle>
	//    9   17:dup             
	//   10   18:invokespecial   #932 <Method void Bundle()>
	//   11   21:astore_3        
			panelfeaturestate.menu.saveActionViewStates(bundle);
	//   12   22:aload_2         
	//   13   23:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   14   26:aload_3         
	//   15   27:invokevirtual   #935 <Method void MenuBuilder.saveActionViewStates(Bundle)>
			if(bundle.size() > 0)
	//*  16   30:aload_3         
	//*  17   31:invokevirtual   #938 <Method int Bundle.size()>
	//*  18   34:ifle            42
				panelfeaturestate.frozenActionViewState = bundle;
	//   19   37:aload_2         
	//   20   38:aload_3         
	//   21   39:putfield        #766 <Field Bundle AppCompatDelegateImplV9$PanelFeatureState.frozenActionViewState>
			panelfeaturestate.menu.stopDispatchingItemsChanged();
	//   22   42:aload_2         
	//   23   43:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   24   46:invokevirtual   #759 <Method void MenuBuilder.stopDispatchingItemsChanged()>
			panelfeaturestate.menu.clear();
	//   25   49:aload_2         
	//   26   50:getfield        #470 <Field MenuBuilder AppCompatDelegateImplV9$PanelFeatureState.menu>
	//   27   53:invokevirtual   #941 <Method void MenuBuilder.clear()>
		}
		panelfeaturestate.refreshMenuContent = true;
	//   28   56:aload_2         
	//   29   57:iconst_1        
	//   30   58:putfield        #607 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshMenuContent>
		panelfeaturestate.refreshDecorView = true;
	//   31   61:aload_2         
	//   32   62:iconst_1        
	//   33   63:putfield        #663 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.refreshDecorView>
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
	//   51   96:putfield        #604 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
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
	//    5   11:invokevirtual   #946 <Method void ViewPropertyAnimatorCompat.cancel()>
	//    6   14:return          
	}

	PanelFeatureState findMenuPanel(Menu menu)
	{
		PanelFeatureState apanelfeaturestate[] = mPanels;
	//    0    0:aload_0         
	//    1    1:getfield        #860 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
	//    2    4:astore          4
		int i;
		if(apanelfeaturestate != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          18
			i = apanelfeaturestate.length;
	//    5   11:aload           4
	//    6   13:arraylength     
	//    7   14:istore_2        
		else
	//*   8   15:goto            20
			i = 0;
	//    9   18:iconst_0        
	//   10   19:istore_2        
		for(int j = 0; j < i; j++)
	//*  11   20:iconst_0        
	//*  12   21:istore_3        
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
	//    1    1:invokespecial   #841 <Method void ensureSubDecor()>
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
	//    1    1:getfield        #860 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
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
	//   24   43:invokestatic    #957 <Method void System.arraycopy(Object, int, Object, int, int)>
			apanelfeaturestate = apanelfeaturestate2;
	//   25   46:aload           5
	//   26   48:astore_3        
			mPanels = apanelfeaturestate2;
	//   27   49:aload_0         
	//   28   50:aload           5
	//   29   52:putfield        #860 <Field AppCompatDelegateImplV9$PanelFeatureState[] mPanels>
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
	//   41   74:invokespecial   #959 <Method void AppCompatDelegateImplV9$PanelFeatureState(int)>
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
	//*   2    2:invokespecial   #963 <Method int sanitizeWindowFeatureId(int)>
		{
	//*   3    5:lookupswitch    6: default 64
	//	               1: 92
	//	               2: 82
	//	               5: 87
	//	               10: 77
	//	               108: 67
	//	               109: 72
	//*   4   64:goto            97
		case 108: // 'l'
			return mHasActionBar;
	//    5   67:aload_0         
	//    6   68:getfield        #279 <Field boolean mHasActionBar>
	//    7   71:ireturn         

		case 109: // 'm'
			return mOverlayActionBar;
	//    8   72:aload_0         
	//    9   73:getfield        #276 <Field boolean mOverlayActionBar>
	//   10   76:ireturn         

		case 10: // '\n'
			return mOverlayActionMode;
	//   11   77:aload_0         
	//   12   78:getfield        #337 <Field boolean mOverlayActionMode>
	//   13   81:ireturn         

		case 2: // '\002'
			return mFeatureProgress;
	//   14   82:aload_0         
	//   15   83:getfield        #332 <Field boolean mFeatureProgress>
	//   16   86:ireturn         

		case 5: // '\005'
			return mFeatureIndeterminateProgress;
	//   17   87:aload_0         
	//   18   88:getfield        #334 <Field boolean mFeatureIndeterminateProgress>
	//   19   91:ireturn         

		case 1: // '\001'
			return mWindowNoTitle;
	//   20   92:aload_0         
	//   21   93:getfield        #264 <Field boolean mWindowNoTitle>
	//   22   96:ireturn         
		}
		return false;
	//   23   97:iconst_0        
	//   24   98:ireturn         
	}

	public void initWindowDecorActionBar()
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #841 <Method void ensureSubDecor()>
		if(!mHasActionBar || mActionBar != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #279 <Field boolean mHasActionBar>
	//*   4    8:ifeq            18
	//*   5   11:aload_0         
	//*   6   12:getfield        #968 <Field ActionBar mActionBar>
	//*   7   15:ifnull          19
			return;
	//    8   18:return          
		if(mOriginalWindowCallback instanceof Activity)
	//*   9   19:aload_0         
	//*  10   20:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*  11   23:instanceof      #970 <Class Activity>
	//*  12   26:ifeq            54
			mActionBar = ((ActionBar) (new WindowDecorActionBar((Activity)mOriginalWindowCallback, mOverlayActionBar)));
	//   13   29:aload_0         
	//   14   30:new             #972 <Class WindowDecorActionBar>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   18   38:checkcast       #970 <Class Activity>
	//   19   41:aload_0         
	//   20   42:getfield        #276 <Field boolean mOverlayActionBar>
	//   21   45:invokespecial   #975 <Method void WindowDecorActionBar(Activity, boolean)>
	//   22   48:putfield        #968 <Field ActionBar mActionBar>
		else
	//*  23   51:goto            82
		if(mOriginalWindowCallback instanceof Dialog)
	//*  24   54:aload_0         
	//*  25   55:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*  26   58:instanceof      #977 <Class Dialog>
	//*  27   61:ifeq            82
			mActionBar = ((ActionBar) (new WindowDecorActionBar((Dialog)mOriginalWindowCallback)));
	//   28   64:aload_0         
	//   29   65:new             #972 <Class WindowDecorActionBar>
	//   30   68:dup             
	//   31   69:aload_0         
	//   32   70:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   33   73:checkcast       #977 <Class Dialog>
	//   34   76:invokespecial   #980 <Method void WindowDecorActionBar(Dialog)>
	//   35   79:putfield        #968 <Field ActionBar mActionBar>
		if(mActionBar != null)
	//*  36   82:aload_0         
	//*  37   83:getfield        #968 <Field ActionBar mActionBar>
	//*  38   86:ifnull          100
			mActionBar.setDefaultDisplayHomeAsUpEnabled(mEnableDefaultActionBarUp);
	//   39   89:aload_0         
	//   40   90:getfield        #968 <Field ActionBar mActionBar>
	//   41   93:aload_0         
	//   42   94:getfield        #982 <Field boolean mEnableDefaultActionBarUp>
	//   43   97:invokevirtual   #987 <Method void ActionBar.setDefaultDisplayHomeAsUpEnabled(boolean)>
	//   44  100:return          
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
	//*   5    9:invokevirtual   #992 <Method android.view.LayoutInflater$Factory LayoutInflater.getFactory()>
	//*   6   12:ifnonnull       21
		{
			LayoutInflaterCompat.setFactory2(layoutinflater, ((android.view.LayoutInflater.Factory2) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokestatic    #998 <Method void LayoutInflaterCompat.setFactory2(LayoutInflater, android.view.LayoutInflater$Factory2)>
			return;
	//   10   20:return          
		}
		if(!(layoutinflater.getFactory2() instanceof AppCompatDelegateImplV9))
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #1002 <Method android.view.LayoutInflater$Factory2 LayoutInflater.getFactory2()>
	//*  13   25:instanceof      #2   <Class AppCompatDelegateImplV9>
	//*  14   28:ifne            41
			Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
	//   15   31:ldc2            #624 <String "AppCompatDelegate">
	//   16   34:ldc2            #1004 <String "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's">
	//   17   37:invokestatic    #821 <Method int Log.i(String, String)>
	//   18   40:pop             
	//   19   41:return          
	}

	public void invalidateOptionsMenu()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null && actionbar.invalidateOptionsMenu())
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #1010 <Method boolean ActionBar.invalidateOptionsMenu()>
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
	//    5   11:invokevirtual   #1016 <Method void ActionMode.finish()>
			return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		}
		ActionBar actionbar = getSupportActionBar();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//   10   20:astore_1        
		return actionbar != null && actionbar.collapseActionView();
	//   11   21:aload_1         
	//   12   22:ifnull          34
	//   13   25:aload_1         
	//   14   26:invokevirtual   #1019 <Method boolean ActionBar.collapseActionView()>
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
	//    7   15:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//    8   18:astore_2        
			if(actionbar != null)
	//*   9   19:aload_2         
	//*  10   20:ifnull          28
				actionbar.onConfigurationChanged(configuration);
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #1023 <Method void ActionBar.onConfigurationChanged(Configuration)>
		}
		AppCompatDrawableManager.get().onConfigurationChanged(mContext);
	//   14   28:invokestatic    #1028 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//   15   31:aload_0         
	//   16   32:getfield        #156 <Field Context mContext>
	//   17   35:invokevirtual   #1030 <Method void AppCompatDrawableManager.onConfigurationChanged(Context)>
		applyDayNight();
	//   18   38:aload_0         
	//   19   39:invokevirtual   #1033 <Method boolean applyDayNight()>
	//   20   42:pop             
	//   21   43:return          
	}

	public void onCreate(Bundle bundle)
	{
		if((mOriginalWindowCallback instanceof Activity) && NavUtils.getParentActivityName((Activity)mOriginalWindowCallback) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #970 <Class Activity>
	//*   3    7:ifeq            43
	//*   4   10:aload_0         
	//*   5   11:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   6   14:checkcast       #970 <Class Activity>
	//*   7   17:invokestatic    #1040 <Method String NavUtils.getParentActivityName(Activity)>
	//*   8   20:ifnull          43
		{
			bundle = ((Bundle) (peekSupportActionBar()));
	//    9   23:aload_0         
	//   10   24:invokevirtual   #746 <Method ActionBar peekSupportActionBar()>
	//   11   27:astore_1        
			if(bundle == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       38
			{
				mEnableDefaultActionBarUp = true;
	//   14   32:aload_0         
	//   15   33:iconst_1        
	//   16   34:putfield        #982 <Field boolean mEnableDefaultActionBarUp>
				return;
	//   17   37:return          
			}
			((ActionBar) (bundle)).setDefaultDisplayHomeAsUpEnabled(true);
	//   18   38:aload_1         
	//   19   39:iconst_1        
	//   20   40:invokevirtual   #987 <Method void ActionBar.setDefaultDisplayHomeAsUpEnabled(boolean)>
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
	//    5    6:invokevirtual   #1042 <Method View callActivityOnCreateView(View, String, Context, AttributeSet)>
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
	//   16   25:invokevirtual   #1044 <Method View createView(View, String, Context, AttributeSet)>
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
	//    5    5:invokevirtual   #1046 <Method View onCreateView(View, String, Context, AttributeSet)>
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
	//    8   18:invokevirtual   #805 <Method boolean View.removeCallbacks(Runnable)>
	//    9   21:pop             
		super.onDestroy();
	//   10   22:aload_0         
	//   11   23:invokespecial   #1049 <Method void AppCompatDelegateImplBase.onDestroy()>
		if(mActionBar != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #968 <Field ActionBar mActionBar>
	//*  14   30:ifnull          40
			mActionBar.onDestroy();
	//   15   33:aload_0         
	//   16   34:getfield        #968 <Field ActionBar mActionBar>
	//   17   37:invokevirtual   #1050 <Method void ActionBar.onDestroy()>
	//   18   40:return          
	}

	boolean onKeyDown(int i, KeyEvent keyevent)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               4: 40
	//	               82: 31
	//*   2   28:goto            63
		case 82: // 'R'
			onKeyDownPanel(0, keyevent);
	//    3   31:aload_0         
	//    4   32:iconst_0        
	//    5   33:aload_2         
	//    6   34:invokespecial   #1052 <Method boolean onKeyDownPanel(int, KeyEvent)>
	//    7   37:pop             
			return true;
	//    8   38:iconst_1        
	//    9   39:ireturn         

		case 4: // '\004'
			boolean flag;
			if((keyevent.getFlags() & 0x80) != 0)
	//*  10   40:aload_2         
	//*  11   41:invokevirtual   #1055 <Method int KeyEvent.getFlags()>
	//*  12   44:sipush          128
	//*  13   47:iand            
	//*  14   48:ifeq            56
				flag = true;
	//   15   51:iconst_1        
	//   16   52:istore_3        
			else
	//*  17   53:goto            58
				flag = false;
	//   18   56:iconst_0        
	//   19   57:istore_3        
			mLongPressBackDown = flag;
	//   20   58:aload_0         
	//   21   59:iload_3         
	//   22   60:putfield        #1057 <Field boolean mLongPressBackDown>
			break;
		}
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*  23   63:getstatic       #97  <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   66:bipush          11
	//*  25   68:icmpge          78
			onKeyShortcut(i, keyevent);
	//   26   71:aload_0         
	//   27   72:iload_1         
	//   28   73:aload_2         
	//   29   74:invokevirtual   #1060 <Method boolean onKeyShortcut(int, KeyEvent)>
	//   30   77:pop             
		return false;
	//   31   78:iconst_0        
	//   32   79:ireturn         
	}

	boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//    2    4:astore          4
		if(actionbar != null && actionbar.onKeyShortcut(i, keyevent))
	//*   3    6:aload           4
	//*   4    8:ifnull          23
	//*   5   11:aload           4
	//*   6   13:iload_1         
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #1061 <Method boolean ActionBar.onKeyShortcut(int, KeyEvent)>
	//*   9   18:ifeq            23
			return true;
	//   10   21:iconst_1        
	//   11   22:ireturn         
		if(mPreparedPanel != null && performPanelShortcut(mPreparedPanel, keyevent.getKeyCode(), keyevent, 1))
	//*  12   23:aload_0         
	//*  13   24:getfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  14   27:ifnull          64
	//*  15   30:aload_0         
	//*  16   31:aload_0         
	//*  17   32:getfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  18   35:aload_2         
	//*  19   36:invokevirtual   #917 <Method int KeyEvent.getKeyCode()>
	//*  20   39:aload_2         
	//*  21   40:iconst_1        
	//*  22   41:invokespecial   #1063 <Method boolean performPanelShortcut(AppCompatDelegateImplV9$PanelFeatureState, int, KeyEvent, int)>
	//*  23   44:ifeq            64
		{
			if(mPreparedPanel != null)
	//*  24   47:aload_0         
	//*  25   48:getfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//*  26   51:ifnull          62
				mPreparedPanel.isHandled = true;
	//   27   54:aload_0         
	//   28   55:getfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
	//   29   58:iconst_1        
	//   30   59:putfield        #597 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isHandled>
			return true;
	//   31   62:iconst_1        
	//   32   63:ireturn         
		}
		if(mPreparedPanel == null)
	//*  33   64:aload_0         
	//*  34   65:getfield        #736 <Field AppCompatDelegateImplV9$PanelFeatureState mPreparedPanel>
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
	//   49   91:invokevirtual   #917 <Method int KeyEvent.getKeyCode()>
	//   50   94:aload_2         
	//   51   95:iconst_1        
	//   52   96:invokespecial   #1063 <Method boolean performPanelShortcut(AppCompatDelegateImplV9$PanelFeatureState, int, KeyEvent, int)>
	//   53   99:istore_3        
			panelfeaturestate.isPrepared = false;
	//   54  100:aload           4
	//   55  102:iconst_0        
	//   56  103:putfield        #604 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isPrepared>
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
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               4: 40
	//	               82: 31
	//*   2   28:goto            89
		case 82: // 'R'
			onKeyUpPanel(0, keyevent);
	//    3   31:aload_0         
	//    4   32:iconst_0        
	//    5   33:aload_2         
	//    6   34:invokespecial   #1065 <Method boolean onKeyUpPanel(int, KeyEvent)>
	//    7   37:pop             
			return true;
	//    8   38:iconst_1        
	//    9   39:ireturn         

		case 4: // '\004'
			boolean flag = mLongPressBackDown;
	//   10   40:aload_0         
	//   11   41:getfield        #1057 <Field boolean mLongPressBackDown>
	//   12   44:istore_3        
			mLongPressBackDown = false;
	//   13   45:aload_0         
	//   14   46:iconst_0        
	//   15   47:putfield        #1057 <Field boolean mLongPressBackDown>
			keyevent = ((KeyEvent) (getPanelState(0, false)));
	//   16   50:aload_0         
	//   17   51:iconst_0        
	//   18   52:iconst_0        
	//   19   53:invokevirtual   #462 <Method AppCompatDelegateImplV9$PanelFeatureState getPanelState(int, boolean)>
	//   20   56:astore_2        
			if(keyevent != null && ((PanelFeatureState) (keyevent)).isOpen)
	//*  21   57:aload_2         
	//*  22   58:ifnull          80
	//*  23   61:aload_2         
	//*  24   62:getfield        #563 <Field boolean AppCompatDelegateImplV9$PanelFeatureState.isOpen>
	//*  25   65:ifeq            80
			{
				if(!flag)
	//*  26   68:iload_3         
	//*  27   69:ifne            78
					closePanel(((PanelFeatureState) (keyevent)), true);
	//   28   72:aload_0         
	//   29   73:aload_2         
	//   30   74:iconst_1        
	//   31   75:invokevirtual   #601 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
				return true;
	//   32   78:iconst_1        
	//   33   79:ireturn         
			}
			if(onBackPressed())
	//*  34   80:aload_0         
	//*  35   81:invokevirtual   #1067 <Method boolean onBackPressed()>
	//*  36   84:ifeq            89
				return true;
	//   37   87:iconst_1        
	//   38   88:ireturn         
			break;
		}
		return false;
	//   39   89:iconst_0        
	//   40   90:ireturn         
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
	//   10   18:invokevirtual   #1073 <Method MenuBuilder MenuBuilder.getRootMenu()>
	//   11   21:invokevirtual   #1075 <Method AppCompatDelegateImplV9$PanelFeatureState findMenuPanel(Menu)>
	//   12   24:astore_1        
			if(menubuilder != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          41
				return callback.onMenuItemSelected(((PanelFeatureState) (menubuilder)).featureId, menuitem);
	//   15   29:aload_3         
	//   16   30:aload_1         
	//   17   31:getfield        #513 <Field int AppCompatDelegateImplV9$PanelFeatureState.featureId>
	//   18   34:aload_2         
	//   19   35:invokeinterface #1078 <Method boolean android.view.Window$Callback.onMenuItemSelected(int, MenuItem)>
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
	//    3    3:invokespecial   #1081 <Method void reopenMenu(MenuBuilder, boolean)>
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
	//    4    7:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//    5   10:astore_2        
			if(menu != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          20
				((ActionBar) (menu)).dispatchMenuVisibilityChanged(true);
	//    8   15:aload_2         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #1084 <Method void ActionBar.dispatchMenuVisibilityChanged(boolean)>
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
	//    4    7:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//    5   10:astore_2        
			if(menu != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          20
				((ActionBar) (menu)).dispatchMenuVisibilityChanged(false);
	//    8   15:aload_2         
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #1084 <Method void ActionBar.dispatchMenuVisibilityChanged(boolean)>
			return;
	//   11   20:return          
		}
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
	//   25   42:invokevirtual   #601 <Method void closePanel(AppCompatDelegateImplV9$PanelFeatureState, boolean)>
		}
	//   26   45:return          
	}

	public void onPostCreate(Bundle bundle)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #841 <Method void ensureSubDecor()>
	//    2    4:return          
	}

	public void onPostResume()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionbar.setShowHideAnimationEnabled(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #1089 <Method void ActionBar.setShowHideAnimationEnabled(boolean)>
	//    8   14:return          
	}

	public void onStop()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(actionbar != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionbar.setShowHideAnimationEnabled(false);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #1089 <Method void ActionBar.setShowHideAnimationEnabled(boolean)>
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
	//    6   12:invokeinterface #1093 <Method void DecorContentParent.setWindowTitle(CharSequence)>
			return;
	//    7   17:return          
		}
		if(peekSupportActionBar() != null)
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #746 <Method ActionBar peekSupportActionBar()>
	//*  10   22:ifnull          34
		{
			peekSupportActionBar().setWindowTitle(charsequence);
	//   11   25:aload_0         
	//   12   26:invokevirtual   #746 <Method ActionBar peekSupportActionBar()>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #1094 <Method void ActionBar.setWindowTitle(CharSequence)>
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
	//   22   46:invokevirtual   #1097 <Method void TextView.setText(CharSequence)>
	//   23   49:return          
	}

	public boolean requestWindowFeature(int i)
	{
		i = sanitizeWindowFeatureId(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #963 <Method int sanitizeWindowFeatureId(int)>
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
	//	               1: 154
	//	               2: 132
	//	               5: 143
	//	               10: 121
	//	               108: 99
	//	               109: 110
	//*  23   96:goto            165
		case 108: // 'l'
			throwFeatureRequestIfSubDecorInstalled();
	//   24   99:aload_0         
	//   25  100:invokespecial   #1099 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mHasActionBar = true;
	//   26  103:aload_0         
	//   27  104:iconst_1        
	//   28  105:putfield        #279 <Field boolean mHasActionBar>
			return true;
	//   29  108:iconst_1        
	//   30  109:ireturn         

		case 109: // 'm'
			throwFeatureRequestIfSubDecorInstalled();
	//   31  110:aload_0         
	//   32  111:invokespecial   #1099 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mOverlayActionBar = true;
	//   33  114:aload_0         
	//   34  115:iconst_1        
	//   35  116:putfield        #276 <Field boolean mOverlayActionBar>
			return true;
	//   36  119:iconst_1        
	//   37  120:ireturn         

		case 10: // '\n'
			throwFeatureRequestIfSubDecorInstalled();
	//   38  121:aload_0         
	//   39  122:invokespecial   #1099 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mOverlayActionMode = true;
	//   40  125:aload_0         
	//   41  126:iconst_1        
	//   42  127:putfield        #337 <Field boolean mOverlayActionMode>
			return true;
	//   43  130:iconst_1        
	//   44  131:ireturn         

		case 2: // '\002'
			throwFeatureRequestIfSubDecorInstalled();
	//   45  132:aload_0         
	//   46  133:invokespecial   #1099 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mFeatureProgress = true;
	//   47  136:aload_0         
	//   48  137:iconst_1        
	//   49  138:putfield        #332 <Field boolean mFeatureProgress>
			return true;
	//   50  141:iconst_1        
	//   51  142:ireturn         

		case 5: // '\005'
			throwFeatureRequestIfSubDecorInstalled();
	//   52  143:aload_0         
	//   53  144:invokespecial   #1099 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mFeatureIndeterminateProgress = true;
	//   54  147:aload_0         
	//   55  148:iconst_1        
	//   56  149:putfield        #334 <Field boolean mFeatureIndeterminateProgress>
			return true;
	//   57  152:iconst_1        
	//   58  153:ireturn         

		case 1: // '\001'
			throwFeatureRequestIfSubDecorInstalled();
	//   59  154:aload_0         
	//   60  155:invokespecial   #1099 <Method void throwFeatureRequestIfSubDecorInstalled()>
			mWindowNoTitle = true;
	//   61  158:aload_0         
	//   62  159:iconst_1        
	//   63  160:putfield        #264 <Field boolean mWindowNoTitle>
			return true;
	//   64  163:iconst_1        
	//   65  164:ireturn         
		}
		return mWindow.requestFeature(i);
	//   66  165:aload_0         
	//   67  166:getfield        #127 <Field Window mWindow>
	//   68  169:iload_1         
	//   69  170:invokevirtual   #1102 <Method boolean Window.requestFeature(int)>
	//   70  173:ireturn         
	}

	public void setContentView(int i)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #841 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:astore_2        
		viewgroup.removeAllViews();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #668 <Method void ViewGroup.removeAllViews()>
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
	//   18   35:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   19   38:invokeinterface #848 <Method void android.view.Window$Callback.onContentChanged()>
	//   20   43:return          
	}

	public void setContentView(View view)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #841 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:astore_2        
		viewgroup.removeAllViews();
	//    8   17:aload_2         
	//    9   18:invokevirtual   #668 <Method void ViewGroup.removeAllViews()>
		viewgroup.addView(view);
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #1103 <Method void ViewGroup.addView(View)>
		mOriginalWindowCallback.onContentChanged();
	//   13   26:aload_0         
	//   14   27:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   15   30:invokeinterface #848 <Method void android.view.Window$Callback.onContentChanged()>
	//   16   35:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		ensureSubDecor();
	//    0    0:aload_0         
	//    1    1:invokespecial   #841 <Method void ensureSubDecor()>
		ViewGroup viewgroup = (ViewGroup)mSubDecor.findViewById(0x1020002);
	//    2    4:aload_0         
	//    3    5:getfield        #114 <Field ViewGroup mSubDecor>
	//    4    8:ldc1            #115 <Int 0x1020002>
	//    5   10:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//    6   13:checkcast       #117 <Class ViewGroup>
	//    7   16:astore_3        
		viewgroup.removeAllViews();
	//    8   17:aload_3         
	//    9   18:invokevirtual   #668 <Method void ViewGroup.removeAllViews()>
		viewgroup.addView(view, layoutparams);
	//   10   21:aload_3         
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #698 <Method void ViewGroup.addView(View, android.view.ViewGroup$LayoutParams)>
		mOriginalWindowCallback.onContentChanged();
	//   14   27:aload_0         
	//   15   28:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   16   31:invokeinterface #848 <Method void android.view.Window$Callback.onContentChanged()>
	//   17   36:return          
	}

	public void setSupportActionBar(Toolbar toolbar)
	{
		if(!(mOriginalWindowCallback instanceof Activity))
	//*   0    0:aload_0         
	//*   1    1:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #970 <Class Activity>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		ActionBar actionbar = getSupportActionBar();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//    7   15:astore_2        
		if(actionbar instanceof WindowDecorActionBar)
	//*   8   16:aload_2         
	//*   9   17:instanceof      #972 <Class WindowDecorActionBar>
	//*  10   20:ifeq            34
			throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
	//   11   23:new             #228 <Class IllegalStateException>
	//   12   26:dup             
	//   13   27:ldc2            #1107 <String "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.">
	//   14   30:invokespecial   #233 <Method void IllegalStateException(String)>
	//   15   33:athrow          
		mMenuInflater = null;
	//   16   34:aload_0         
	//   17   35:aconst_null     
	//   18   36:putfield        #1111 <Field android.view.MenuInflater mMenuInflater>
		if(actionbar != null)
	//*  19   39:aload_2         
	//*  20   40:ifnull          47
			actionbar.onDestroy();
	//   21   43:aload_2         
	//   22   44:invokevirtual   #1050 <Method void ActionBar.onDestroy()>
		if(toolbar != null)
	//*  23   47:aload_1         
	//*  24   48:ifnull          93
		{
			toolbar = ((Toolbar) (new ToolbarActionBar(toolbar, ((Activity)mOriginalWindowCallback).getTitle(), mAppCompatWindowCallback)));
	//   25   51:new             #748 <Class ToolbarActionBar>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #845 <Field android.view.Window$Callback mOriginalWindowCallback>
	//   30   60:checkcast       #970 <Class Activity>
	//   31   63:invokevirtual   #1112 <Method CharSequence Activity.getTitle()>
	//   32   66:aload_0         
	//   33   67:getfield        #1115 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   34   70:invokespecial   #1118 <Method void ToolbarActionBar(Toolbar, CharSequence, android.view.Window$Callback)>
	//   35   73:astore_1        
			mActionBar = ((ActionBar) (toolbar));
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:putfield        #968 <Field ActionBar mActionBar>
			mWindow.setCallback(((ToolbarActionBar) (toolbar)).getWrappedWindowCallback());
	//   39   79:aload_0         
	//   40   80:getfield        #127 <Field Window mWindow>
	//   41   83:aload_1         
	//   42   84:invokevirtual   #1121 <Method android.view.Window$Callback ToolbarActionBar.getWrappedWindowCallback()>
	//   43   87:invokevirtual   #1123 <Method void Window.setCallback(android.view.Window$Callback)>
		} else
	//*  44   90:goto            109
		{
			mActionBar = null;
	//   45   93:aload_0         
	//   46   94:aconst_null     
	//   47   95:putfield        #968 <Field ActionBar mActionBar>
			mWindow.setCallback(mAppCompatWindowCallback);
	//   48   98:aload_0         
	//   49   99:getfield        #127 <Field Window mWindow>
	//   50  102:aload_0         
	//   51  103:getfield        #1115 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   52  106:invokevirtual   #1123 <Method void Window.setCallback(android.view.Window$Callback)>
		}
		invalidateOptionsMenu();
	//   53  109:aload_0         
	//   54  110:invokevirtual   #1125 <Method void invalidateOptionsMenu()>
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
	//    8   18:invokestatic    #1129 <Method boolean ViewCompat.isLaidOut(View)>
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
	//    2    4:new             #359 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #1133 <String "ActionMode callback can not be null.">
	//    5   11:invokespecial   #386 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		if(mActionMode != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #570 <Field ActionMode mActionMode>
	//*   9   19:ifnull          29
			mActionMode.finish();
	//   10   22:aload_0         
	//   11   23:getfield        #570 <Field ActionMode mActionMode>
	//   12   26:invokevirtual   #1016 <Method void ActionMode.finish()>
		callback = ((android.support.v7.view.ActionMode.Callback) (new ActionModeCallbackWrapperV9(callback)));
	//   13   29:new             #27  <Class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:invokespecial   #1136 <Method void AppCompatDelegateImplV9$ActionModeCallbackWrapperV9(AppCompatDelegateImplV9, android.support.v7.view.ActionMode$Callback)>
	//   18   38:astore_1        
		ActionBar actionbar = getSupportActionBar();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #1008 <Method ActionBar getSupportActionBar()>
	//   21   43:astore_2        
		if(actionbar != null)
	//*  22   44:aload_2         
	//*  23   45:ifnull          84
		{
			mActionMode = actionbar.startActionMode(callback);
	//   24   48:aload_0         
	//   25   49:aload_2         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #1139 <Method ActionMode ActionBar.startActionMode(android.support.v7.view.ActionMode$Callback)>
	//   28   54:putfield        #570 <Field ActionMode mActionMode>
			if(mActionMode != null && mAppCompatCallback != null)
	//*  29   57:aload_0         
	//*  30   58:getfield        #570 <Field ActionMode mActionMode>
	//*  31   61:ifnull          84
	//*  32   64:aload_0         
	//*  33   65:getfield        #1143 <Field AppCompatCallback mAppCompatCallback>
	//*  34   68:ifnull          84
				mAppCompatCallback.onSupportActionModeStarted(mActionMode);
	//   35   71:aload_0         
	//   36   72:getfield        #1143 <Field AppCompatCallback mAppCompatCallback>
	//   37   75:aload_0         
	//   38   76:getfield        #570 <Field ActionMode mActionMode>
	//   39   79:invokeinterface #1149 <Method void AppCompatCallback.onSupportActionModeStarted(ActionMode)>
		}
		if(mActionMode == null)
	//*  40   84:aload_0         
	//*  41   85:getfield        #570 <Field ActionMode mActionMode>
	//*  42   88:ifnonnull       100
			mActionMode = startSupportActionModeFromWindow(callback);
	//   43   91:aload_0         
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:invokevirtual   #1152 <Method ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode$Callback)>
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
	//    1    1:invokevirtual   #909 <Method void endOnGoingFadeAnimation()>
		if(mActionMode != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #570 <Field ActionMode mActionMode>
	//*   4    8:ifnull          18
			mActionMode.finish();
	//    5   11:aload_0         
	//    6   12:getfield        #570 <Field ActionMode mActionMode>
	//    7   15:invokevirtual   #1016 <Method void ActionMode.finish()>
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
	//   17   34:invokespecial   #1136 <Method void AppCompatDelegateImplV9$ActionModeCallbackWrapperV9(AppCompatDelegateImplV9, android.support.v7.view.ActionMode$Callback)>
	//   18   37:astore          4
		Object obj1 = null;
	//   19   39:aconst_null     
	//   20   40:astore          5
		callback = ((android.support.v7.view.ActionMode.Callback) (obj1));
	//   21   42:aload           5
	//   22   44:astore_1        
		if(mAppCompatCallback != null)
	//*  23   45:aload_0         
	//*  24   46:getfield        #1143 <Field AppCompatCallback mAppCompatCallback>
	//*  25   49:ifnull          81
		{
			callback = ((android.support.v7.view.ActionMode.Callback) (obj1));
	//   26   52:aload           5
	//   27   54:astore_1        
			if(!isDestroyed())
	//*  28   55:aload_0         
	//*  29   56:invokevirtual   #466 <Method boolean isDestroyed()>
	//*  30   59:ifne            81
				try
				{
					callback = ((android.support.v7.view.ActionMode.Callback) (mAppCompatCallback.onWindowStartingSupportActionMode(((android.support.v7.view.ActionMode.Callback) (obj)))));
	//   31   62:aload_0         
	//   32   63:getfield        #1143 <Field AppCompatCallback mAppCompatCallback>
	//   33   66:aload           4
	//   34   68:invokeinterface #1157 <Method ActionMode AppCompatCallback.onWindowStartingSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//   35   73:astore_1        
				}
	//*  36   74:goto            81
				// Misplaced declaration of an exception variable
				catch(android.support.v7.view.ActionMode.Callback callback)
	//*  37   77:astore_1        
				{
					callback = ((android.support.v7.view.ActionMode.Callback) (obj1));
	//   38   78:aload           5
	//   39   80:astore_1        
				}
		}
		if(callback != null)
	//*  40   81:aload_1         
	//*  41   82:ifnull          93
		{
			mActionMode = ((ActionMode) (callback));
	//   42   85:aload_0         
	//   43   86:aload_1         
	//   44   87:putfield        #570 <Field ActionMode mActionMode>
		} else
	//*  45   90:goto            581
		{
			if(mActionModeView == null)
	//*  46   93:aload_0         
	//*  47   94:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//*  48   97:ifnonnull       359
				if(mIsFloating)
	//*  49  100:aload_0         
	//*  50  101:getfield        #255 <Field boolean mIsFloating>
	//*  51  104:ifeq            319
				{
					TypedValue typedvalue = new TypedValue();
	//   52  107:new             #281 <Class TypedValue>
	//   53  110:dup             
	//   54  111:invokespecial   #283 <Method void TypedValue()>
	//   55  114:astore          5
					callback = ((android.support.v7.view.ActionMode.Callback) (mContext.getTheme()));
	//   56  116:aload_0         
	//   57  117:getfield        #156 <Field Context mContext>
	//   58  120:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   59  123:astore_1        
					((android.content.res.Resources.Theme) (callback)).resolveAttribute(android.support.v7.appcompat.R.attr.actionBarTheme, typedvalue, true);
	//   60  124:aload_1         
	//   61  125:getstatic       #292 <Field int android.support.v7.appcompat.R$attr.actionBarTheme>
	//   62  128:aload           5
	//   63  130:iconst_1        
	//   64  131:invokevirtual   #298 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   65  134:pop             
					if(typedvalue.resourceId != 0)
	//*  66  135:aload           5
	//*  67  137:getfield        #301 <Field int TypedValue.resourceId>
	//*  68  140:ifeq            197
					{
						android.content.res.Resources.Theme theme = mContext.getResources().newTheme();
	//   69  143:aload_0         
	//   70  144:getfield        #156 <Field Context mContext>
	//   71  147:invokevirtual   #517 <Method Resources Context.getResources()>
	//   72  150:invokevirtual   #522 <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   73  153:astore          6
						theme.setTo(((android.content.res.Resources.Theme) (callback)));
	//   74  155:aload           6
	//   75  157:aload_1         
	//   76  158:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
						theme.applyStyle(typedvalue.resourceId, true);
	//   77  161:aload           6
	//   78  163:aload           5
	//   79  165:getfield        #301 <Field int TypedValue.resourceId>
	//   80  168:iconst_1        
	//   81  169:invokevirtual   #530 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
						callback = ((android.support.v7.view.ActionMode.Callback) (new ContextThemeWrapper(mContext, 0)));
	//   82  172:new             #303 <Class ContextThemeWrapper>
	//   83  175:dup             
	//   84  176:aload_0         
	//   85  177:getfield        #156 <Field Context mContext>
	//   86  180:iconst_0        
	//   87  181:invokespecial   #306 <Method void ContextThemeWrapper(Context, int)>
	//   88  184:astore_1        
						((Context) (callback)).getTheme().setTo(theme);
	//   89  185:aload_1         
	//   90  186:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   91  189:aload           6
	//   92  191:invokevirtual   #526 <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
					} else
	//*  93  194:goto            202
					{
						callback = ((android.support.v7.view.ActionMode.Callback) (mContext));
	//   94  197:aload_0         
	//   95  198:getfield        #156 <Field Context mContext>
	//   96  201:astore_1        
					}
					mActionModeView = new ActionBarContextView(((Context) (callback)));
	//   97  202:aload_0         
	//   98  203:new             #1161 <Class ActionBarContextView>
	//   99  206:dup             
	//  100  207:aload_1         
	//  101  208:invokespecial   #1162 <Method void ActionBarContextView(Context)>
	//  102  211:putfield        #1159 <Field ActionBarContextView mActionModeView>
					mActionModePopup = new PopupWindow(((Context) (callback)), ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionModePopupWindowStyle);
	//  103  214:aload_0         
	//  104  215:new             #900 <Class PopupWindow>
	//  105  218:dup             
	//  106  219:aload_1         
	//  107  220:aconst_null     
	//  108  221:getstatic       #1165 <Field int android.support.v7.appcompat.R$attr.actionModePopupWindowStyle>
	//  109  224:invokespecial   #1168 <Method void PopupWindow(Context, AttributeSet, int)>
	//  110  227:putfield        #896 <Field PopupWindow mActionModePopup>
					PopupWindowCompat.setWindowLayoutType(mActionModePopup, 2);
	//  111  230:aload_0         
	//  112  231:getfield        #896 <Field PopupWindow mActionModePopup>
	//  113  234:iconst_2        
	//  114  235:invokestatic    #1174 <Method void PopupWindowCompat.setWindowLayoutType(PopupWindow, int)>
					mActionModePopup.setContentView(((View) (mActionModeView)));
	//  115  238:aload_0         
	//  116  239:getfield        #896 <Field PopupWindow mActionModePopup>
	//  117  242:aload_0         
	//  118  243:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  119  246:invokevirtual   #1175 <Method void PopupWindow.setContentView(View)>
					mActionModePopup.setWidth(-1);
	//  120  249:aload_0         
	//  121  250:getfield        #896 <Field PopupWindow mActionModePopup>
	//  122  253:iconst_m1       
	//  123  254:invokevirtual   #1178 <Method void PopupWindow.setWidth(int)>
					((Context) (callback)).getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarSize, typedvalue, true);
	//  124  257:aload_1         
	//  125  258:invokevirtual   #287 <Method android.content.res.Resources$Theme Context.getTheme()>
	//  126  261:getstatic       #1181 <Field int android.support.v7.appcompat.R$attr.actionBarSize>
	//  127  264:aload           5
	//  128  266:iconst_1        
	//  129  267:invokevirtual   #298 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//  130  270:pop             
					int i = TypedValue.complexToDimensionPixelSize(typedvalue.data, ((Context) (callback)).getResources().getDisplayMetrics());
	//  131  271:aload           5
	//  132  273:getfield        #1184 <Field int TypedValue.data>
	//  133  276:aload_1         
	//  134  277:invokevirtual   #517 <Method Resources Context.getResources()>
	//  135  280:invokevirtual   #1188 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//  136  283:invokestatic    #1192 <Method int TypedValue.complexToDimensionPixelSize(int, android.util.DisplayMetrics)>
	//  137  286:istore_2        
					mActionModeView.setContentHeight(i);
	//  138  287:aload_0         
	//  139  288:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  140  291:iload_2         
	//  141  292:invokevirtual   #1195 <Method void ActionBarContextView.setContentHeight(int)>
					mActionModePopup.setHeight(-2);
	//  142  295:aload_0         
	//  143  296:getfield        #896 <Field PopupWindow mActionModePopup>
	//  144  299:bipush          -2
	//  145  301:invokevirtual   #1198 <Method void PopupWindow.setHeight(int)>
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
	//  146  304:aload_0         
	//  147  305:new             #18  <Class AppCompatDelegateImplV9$5>
	//  148  308:dup             
	//  149  309:aload_0         
	//  150  310:invokespecial   #1199 <Method void AppCompatDelegateImplV9$5(AppCompatDelegateImplV9)>
	//  151  313:putfield        #898 <Field Runnable mShowActionModePopup>
				} else
	//* 152  316:goto            359
				{
					callback = ((android.support.v7.view.ActionMode.Callback) ((ViewStubCompat)mSubDecor.findViewById(android.support.v7.appcompat.R.id.action_mode_bar_stub)));
	//  153  319:aload_0         
	//  154  320:getfield        #114 <Field ViewGroup mSubDecor>
	//  155  323:getstatic       #1202 <Field int android.support.v7.appcompat.R$id.action_mode_bar_stub>
	//  156  326:invokevirtual   #121 <Method View ViewGroup.findViewById(int)>
	//  157  329:checkcast       #1204 <Class ViewStubCompat>
	//  158  332:astore_1        
					if(callback != null)
	//* 159  333:aload_1         
	//* 160  334:ifnull          359
					{
						((ViewStubCompat) (callback)).setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
	//  161  337:aload_1         
	//  162  338:aload_0         
	//  163  339:invokevirtual   #493 <Method Context getActionBarThemedContext()>
	//  164  342:invokestatic    #261 <Method LayoutInflater LayoutInflater.from(Context)>
	//  165  345:invokevirtual   #1208 <Method void ViewStubCompat.setLayoutInflater(LayoutInflater)>
						mActionModeView = (ActionBarContextView)((ViewStubCompat) (callback)).inflate();
	//  166  348:aload_0         
	//  167  349:aload_1         
	//  168  350:invokevirtual   #1210 <Method View ViewStubCompat.inflate()>
	//  169  353:checkcast       #1161 <Class ActionBarContextView>
	//  170  356:putfield        #1159 <Field ActionBarContextView mActionModeView>
					}
				}
			if(mActionModeView != null)
	//* 171  359:aload_0         
	//* 172  360:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//* 173  363:ifnull          581
			{
				endOnGoingFadeAnimation();
	//  174  366:aload_0         
	//  175  367:invokevirtual   #909 <Method void endOnGoingFadeAnimation()>
				mActionModeView.killMode();
	//  176  370:aload_0         
	//  177  371:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  178  374:invokevirtual   #1213 <Method void ActionBarContextView.killMode()>
				callback = ((android.support.v7.view.ActionMode.Callback) (mActionModeView.getContext()));
	//  179  377:aload_0         
	//  180  378:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  181  381:invokevirtual   #1216 <Method Context ActionBarContextView.getContext()>
	//  182  384:astore_1        
				ActionBarContextView actionbarcontextview = mActionModeView;
	//  183  385:aload_0         
	//  184  386:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  185  389:astore          5
				boolean flag;
				if(mActionModePopup == null)
	//* 186  391:aload_0         
	//* 187  392:getfield        #896 <Field PopupWindow mActionModePopup>
	//* 188  395:ifnonnull       403
					flag = true;
	//  189  398:iconst_1        
	//  190  399:istore_3        
				else
	//* 191  400:goto            405
					flag = false;
	//  192  403:iconst_0        
	//  193  404:istore_3        
				callback = ((android.support.v7.view.ActionMode.Callback) (new StandaloneActionMode(((Context) (callback)), actionbarcontextview, ((android.support.v7.view.ActionMode.Callback) (obj)), flag)));
	//  194  405:new             #1218 <Class StandaloneActionMode>
	//  195  408:dup             
	//  196  409:aload_1         
	//  197  410:aload           5
	//  198  412:aload           4
	//  199  414:iload_3         
	//  200  415:invokespecial   #1221 <Method void StandaloneActionMode(Context, ActionBarContextView, android.support.v7.view.ActionMode$Callback, boolean)>
	//  201  418:astore_1        
				if(((android.support.v7.view.ActionMode.Callback) (obj)).onCreateActionMode(((ActionMode) (callback)), ((ActionMode) (callback)).getMenu()))
	//* 202  419:aload           4
	//* 203  421:aload_1         
	//* 204  422:aload_1         
	//* 205  423:invokevirtual   #1225 <Method Menu ActionMode.getMenu()>
	//* 206  426:invokeinterface #1231 <Method boolean android.support.v7.view.ActionMode$Callback.onCreateActionMode(ActionMode, Menu)>
	//* 207  431:ifeq            576
				{
					((ActionMode) (callback)).invalidate();
	//  208  434:aload_1         
	//  209  435:invokevirtual   #1234 <Method void ActionMode.invalidate()>
					mActionModeView.initForMode(((ActionMode) (callback)));
	//  210  438:aload_0         
	//  211  439:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  212  442:aload_1         
	//  213  443:invokevirtual   #1237 <Method void ActionBarContextView.initForMode(ActionMode)>
					mActionMode = ((ActionMode) (callback));
	//  214  446:aload_0         
	//  215  447:aload_1         
	//  216  448:putfield        #570 <Field ActionMode mActionMode>
					if(shouldAnimateActionModeView())
	//* 217  451:aload_0         
	//* 218  452:invokevirtual   #1239 <Method boolean shouldAnimateActionModeView()>
	//* 219  455:ifeq            500
					{
						mActionModeView.setAlpha(0.0F);
	//  220  458:aload_0         
	//  221  459:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  222  462:fconst_0        
	//  223  463:invokevirtual   #1243 <Method void ActionBarContextView.setAlpha(float)>
						mFadeAnim = ViewCompat.animate(((View) (mActionModeView))).alpha(1.0F);
	//  224  466:aload_0         
	//  225  467:aload_0         
	//  226  468:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  227  471:invokestatic    #1247 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//  228  474:fconst_1        
	//  229  475:invokevirtual   #1251 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//  230  478:putfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
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
	//  231  481:aload_0         
	//  232  482:getfield        #106 <Field ViewPropertyAnimatorCompat mFadeAnim>
	//  233  485:new             #22  <Class AppCompatDelegateImplV9$6>
	//  234  488:dup             
	//  235  489:aload_0         
	//  236  490:invokespecial   #1252 <Method void AppCompatDelegateImplV9$6(AppCompatDelegateImplV9)>
	//  237  493:invokevirtual   #1256 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//  238  496:pop             
					} else
	//* 239  497:goto            551
					{
						mActionModeView.setAlpha(1.0F);
	//  240  500:aload_0         
	//  241  501:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  242  504:fconst_1        
	//  243  505:invokevirtual   #1243 <Method void ActionBarContextView.setAlpha(float)>
						mActionModeView.setVisibility(0);
	//  244  508:aload_0         
	//  245  509:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  246  512:iconst_0        
	//  247  513:invokevirtual   #1259 <Method void ActionBarContextView.setVisibility(int)>
						mActionModeView.sendAccessibilityEvent(32);
	//  248  516:aload_0         
	//  249  517:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  250  520:bipush          32
	//  251  522:invokevirtual   #1262 <Method void ActionBarContextView.sendAccessibilityEvent(int)>
						if(mActionModeView.getParent() instanceof View)
	//* 252  525:aload_0         
	//* 253  526:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//* 254  529:invokevirtual   #1263 <Method ViewParent ActionBarContextView.getParent()>
	//* 255  532:instanceof      #135 <Class View>
	//* 256  535:ifeq            551
							ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
	//  257  538:aload_0         
	//  258  539:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  259  542:invokevirtual   #1263 <Method ViewParent ActionBarContextView.getParent()>
	//  260  545:checkcast       #135 <Class View>
	//  261  548:invokestatic    #1266 <Method void ViewCompat.requestApplyInsets(View)>
					}
					if(mActionModePopup != null)
	//* 262  551:aload_0         
	//* 263  552:getfield        #896 <Field PopupWindow mActionModePopup>
	//* 264  555:ifnull          581
						mWindow.getDecorView().post(mShowActionModePopup);
	//  265  558:aload_0         
	//  266  559:getfield        #127 <Field Window mWindow>
	//  267  562:invokevirtual   #133 <Method View Window.getDecorView()>
	//  268  565:aload_0         
	//  269  566:getfield        #898 <Field Runnable mShowActionModePopup>
	//  270  569:invokevirtual   #1269 <Method boolean View.post(Runnable)>
	//  271  572:pop             
				} else
	//* 272  573:goto            581
				{
					mActionMode = null;
	//  273  576:aload_0         
	//  274  577:aconst_null     
	//  275  578:putfield        #570 <Field ActionMode mActionMode>
				}
			}
		}
		if(mActionMode != null && mAppCompatCallback != null)
	//* 276  581:aload_0         
	//* 277  582:getfield        #570 <Field ActionMode mActionMode>
	//* 278  585:ifnull          608
	//* 279  588:aload_0         
	//* 280  589:getfield        #1143 <Field AppCompatCallback mAppCompatCallback>
	//* 281  592:ifnull          608
			mAppCompatCallback.onSupportActionModeStarted(mActionMode);
	//  282  595:aload_0         
	//  283  596:getfield        #1143 <Field AppCompatCallback mAppCompatCallback>
	//  284  599:aload_0         
	//  285  600:getfield        #570 <Field ActionMode mActionMode>
	//  286  603:invokeinterface #1149 <Method void AppCompatCallback.onSupportActionModeStarted(ActionMode)>
		return mActionMode;
	//  287  608:aload_0         
	//  288  609:getfield        #570 <Field ActionMode mActionMode>
	//  289  612:areturn         
	}

	int updateStatusGuard(int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag4 = false;
	//    2    2:iconst_0        
	//    3    3:istore          7
		boolean flag3 = flag;
	//    4    5:iload_2         
	//    5    6:istore          6
		int i1 = i;
	//    6    8:iload_1         
	//    7    9:istore          5
		if(mActionModeView != null)
	//*   8   11:aload_0         
	//*   9   12:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//*  10   15:ifnull          357
		{
			flag3 = flag;
	//   11   18:iload_2         
	//   12   19:istore          6
			i1 = i;
	//   13   21:iload_1         
	//   14   22:istore          5
			if(mActionModeView.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  15   24:aload_0         
	//*  16   25:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//*  17   28:invokevirtual   #1271 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//*  18   31:instanceof      #1273 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  19   34:ifeq            357
			{
				android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mActionModeView.getLayoutParams();
	//   20   37:aload_0         
	//   21   38:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//   22   41:invokevirtual   #1271 <Method android.view.ViewGroup$LayoutParams ActionBarContextView.getLayoutParams()>
	//   23   44:checkcast       #1273 <Class android.view.ViewGroup$MarginLayoutParams>
	//   24   47:astore          8
				int l = 0;
	//   25   49:iconst_0        
	//   26   50:istore          4
				int j = 0;
	//   27   52:iconst_0        
	//   28   53:istore_2        
				boolean flag2;
				if(mActionModeView.isShown())
	//*  29   54:aload_0         
	//*  30   55:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//*  31   58:invokevirtual   #1276 <Method boolean ActionBarContextView.isShown()>
	//*  32   61:ifeq            299
				{
					if(mTempRect1 == null)
	//*  33   64:aload_0         
	//*  34   65:getfield        #1278 <Field Rect mTempRect1>
	//*  35   68:ifnonnull       93
					{
						mTempRect1 = new Rect();
	//   36   71:aload_0         
	//   37   72:new             #1280 <Class Rect>
	//   38   75:dup             
	//   39   76:invokespecial   #1281 <Method void Rect()>
	//   40   79:putfield        #1278 <Field Rect mTempRect1>
						mTempRect2 = new Rect();
	//   41   82:aload_0         
	//   42   83:new             #1280 <Class Rect>
	//   43   86:dup             
	//   44   87:invokespecial   #1281 <Method void Rect()>
	//   45   90:putfield        #1283 <Field Rect mTempRect2>
					}
					Rect rect = mTempRect1;
	//   46   93:aload_0         
	//   47   94:getfield        #1278 <Field Rect mTempRect1>
	//   48   97:astore          9
					Rect rect1 = mTempRect2;
	//   49   99:aload_0         
	//   50  100:getfield        #1283 <Field Rect mTempRect2>
	//   51  103:astore          10
					rect.set(0, i, 0, 0);
	//   52  105:aload           9
	//   53  107:iconst_0        
	//   54  108:iload_1         
	//   55  109:iconst_0        
	//   56  110:iconst_0        
	//   57  111:invokevirtual   #1286 <Method void Rect.set(int, int, int, int)>
					ViewUtils.computeFitSystemWindows(((View) (mSubDecor)), rect, rect1);
	//   58  114:aload_0         
	//   59  115:getfield        #114 <Field ViewGroup mSubDecor>
	//   60  118:aload           9
	//   61  120:aload           10
	//   62  122:invokestatic    #1290 <Method void ViewUtils.computeFitSystemWindows(View, Rect, Rect)>
					int k;
					if(rect1.top == 0)
	//*  63  125:aload           10
	//*  64  127:getfield        #1293 <Field int Rect.top>
	//*  65  130:ifne            138
						k = i;
	//   66  133:iload_1         
	//   67  134:istore_3        
					else
	//*  68  135:goto            140
						k = 0;
	//   69  138:iconst_0        
	//   70  139:istore_3        
					if(marginlayoutparams.topMargin != k)
	//*  71  140:aload           8
	//*  72  142:getfield        #1296 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//*  73  145:iload_3         
	//*  74  146:icmpeq          262
					{
						boolean flag1 = true;
	//   75  149:iconst_1        
	//   76  150:istore_3        
						marginlayoutparams.topMargin = i;
	//   77  151:aload           8
	//   78  153:iload_1         
	//   79  154:putfield        #1296 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
						if(mStatusGuard == null)
	//*  80  157:aload_0         
	//*  81  158:getfield        #1298 <Field View mStatusGuard>
	//*  82  161:ifnonnull       225
						{
							mStatusGuard = new View(mContext);
	//   83  164:aload_0         
	//   84  165:new             #135 <Class View>
	//   85  168:dup             
	//   86  169:aload_0         
	//   87  170:getfield        #156 <Field Context mContext>
	//   88  173:invokespecial   #1299 <Method void View(Context)>
	//   89  176:putfield        #1298 <Field View mStatusGuard>
							mStatusGuard.setBackgroundColor(mContext.getResources().getColor(android.support.v7.appcompat.R.color.abc_input_method_navigation_guard));
	//   90  179:aload_0         
	//   91  180:getfield        #1298 <Field View mStatusGuard>
	//   92  183:aload_0         
	//   93  184:getfield        #156 <Field Context mContext>
	//   94  187:invokevirtual   #517 <Method Resources Context.getResources()>
	//   95  190:getstatic       #1304 <Field int android.support.v7.appcompat.R$color.abc_input_method_navigation_guard>
	//   96  193:invokevirtual   #1307 <Method int Resources.getColor(int)>
	//   97  196:invokevirtual   #1310 <Method void View.setBackgroundColor(int)>
							mSubDecor.addView(mStatusGuard, -1, new android.view.ViewGroup.LayoutParams(-1, i));
	//   98  199:aload_0         
	//   99  200:getfield        #114 <Field ViewGroup mSubDecor>
	//  100  203:aload_0         
	//  101  204:getfield        #1298 <Field View mStatusGuard>
	//  102  207:iconst_m1       
	//  103  208:new             #679 <Class android.view.ViewGroup$LayoutParams>
	//  104  211:dup             
	//  105  212:iconst_m1       
	//  106  213:iload_1         
	//  107  214:invokespecial   #682 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//  108  217:invokevirtual   #1313 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
							j = ((int) (flag1));
	//  109  220:iload_3         
	//  110  221:istore_2        
						} else
	//* 111  222:goto            262
						{
							android.view.ViewGroup.LayoutParams layoutparams = mStatusGuard.getLayoutParams();
	//  112  225:aload_0         
	//  113  226:getfield        #1298 <Field View mStatusGuard>
	//  114  229:invokevirtual   #677 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  115  232:astore          9
							j = ((int) (flag1));
	//  116  234:iload_3         
	//  117  235:istore_2        
							if(layoutparams.height != i)
	//* 118  236:aload           9
	//* 119  238:getfield        #1316 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 120  241:iload_1         
	//* 121  242:icmpeq          262
							{
								layoutparams.height = i;
	//  122  245:aload           9
	//  123  247:iload_1         
	//  124  248:putfield        #1316 <Field int android.view.ViewGroup$LayoutParams.height>
								mStatusGuard.setLayoutParams(layoutparams);
	//  125  251:aload_0         
	//  126  252:getfield        #1298 <Field View mStatusGuard>
	//  127  255:aload           9
	//  128  257:invokevirtual   #1320 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
								j = ((int) (flag1));
	//  129  260:iload_3         
	//  130  261:istore_2        
							}
						}
					}
					if(mStatusGuard != null)
	//* 131  262:aload_0         
	//* 132  263:getfield        #1298 <Field View mStatusGuard>
	//* 133  266:ifnull          274
						flag2 = true;
	//  134  269:iconst_1        
	//  135  270:istore_3        
					else
	//* 136  271:goto            276
						flag2 = false;
	//  137  274:iconst_0        
	//  138  275:istore_3        
					l = i;
	//  139  276:iload_1         
	//  140  277:istore          4
					if(!mOverlayActionMode)
	//* 141  279:aload_0         
	//* 142  280:getfield        #337 <Field boolean mOverlayActionMode>
	//* 143  283:ifne            296
					{
						l = i;
	//  144  286:iload_1         
	//  145  287:istore          4
						if(flag2)
	//* 146  289:iload_3         
	//* 147  290:ifeq            296
							l = 0;
	//  148  293:iconst_0        
	//  149  294:istore          4
					}
				} else
	//* 150  296:goto            330
				{
					flag2 = flag4;
	//  151  299:iload           7
	//  152  301:istore_3        
					j = l;
	//  153  302:iload           4
	//  154  304:istore_2        
					l = i;
	//  155  305:iload_1         
	//  156  306:istore          4
					if(marginlayoutparams.topMargin != 0)
	//* 157  308:aload           8
	//* 158  310:getfield        #1296 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//* 159  313:ifeq            330
					{
						j = 1;
	//  160  316:iconst_1        
	//  161  317:istore_2        
						marginlayoutparams.topMargin = 0;
	//  162  318:aload           8
	//  163  320:iconst_0        
	//  164  321:putfield        #1296 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
						l = i;
	//  165  324:iload_1         
	//  166  325:istore          4
						flag2 = flag4;
	//  167  327:iload           7
	//  168  329:istore_3        
					}
				}
				flag3 = flag2;
	//  169  330:iload_3         
	//  170  331:istore          6
				i1 = l;
	//  171  333:iload           4
	//  172  335:istore          5
				if(j != 0)
	//* 173  337:iload_2         
	//* 174  338:ifeq            357
				{
					mActionModeView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (marginlayoutparams)));
	//  175  341:aload_0         
	//  176  342:getfield        #1159 <Field ActionBarContextView mActionModeView>
	//  177  345:aload           8
	//  178  347:invokevirtual   #1321 <Method void ActionBarContextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					i1 = l;
	//  179  350:iload           4
	//  180  352:istore          5
					flag3 = flag2;
	//  181  354:iload_3         
	//  182  355:istore          6
				}
			}
		}
		if(mStatusGuard != null)
	//* 183  357:aload_0         
	//* 184  358:getfield        #1298 <Field View mStatusGuard>
	//* 185  361:ifnull          389
		{
			View view = mStatusGuard;
	//  186  364:aload_0         
	//  187  365:getfield        #1298 <Field View mStatusGuard>
	//  188  368:astore          8
			if(flag3)
	//* 189  370:iload           6
	//* 190  372:ifeq            380
				i = 0;
	//  191  375:iconst_0        
	//  192  376:istore_1        
			else
	//* 193  377:goto            383
				i = 8;
	//  194  380:bipush          8
	//  195  382:istore_1        
			view.setVisibility(i);
	//  196  383:aload           8
	//  197  385:iload_1         
	//  198  386:invokevirtual   #1322 <Method void View.setVisibility(int)>
		}
		return i1;
	//  199  389:iload           5
	//  200  391:ireturn         
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
