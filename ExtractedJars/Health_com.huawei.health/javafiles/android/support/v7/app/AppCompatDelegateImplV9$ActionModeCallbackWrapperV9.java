// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.ActionBarContextView;
import android.view.*;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9, AppCompatCallback

class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9
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
				//*  21   54:invokevirtual   #51  <Method android.view.ViewParent ActionBarContextView.getParent()>
				//*  22   57:instanceof      #53  <Class View>
				//*  23   60:ifeq            82
						ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
				//   24   63:aload_0         
				//   25   64:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
				//   26   67:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
				//   27   70:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
				//   28   73:invokevirtual   #51  <Method android.view.ViewParent ActionBarContextView.getParent()>
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

				final AppCompatDelegateImplV9.ActionModeCallbackWrapperV9 this$1;

			
			{
				this$1 = AppCompatDelegateImplV9.ActionModeCallbackWrapperV9.this;
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

	public AppCompatDelegateImplV9$ActionModeCallbackWrapperV9(android.support.v7.view.ActionMode.Callback callback)
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
