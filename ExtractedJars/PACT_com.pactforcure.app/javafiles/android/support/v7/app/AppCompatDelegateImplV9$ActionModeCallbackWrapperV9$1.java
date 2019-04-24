// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1 extends ViewPropertyAnimatorListenerAdapter
{

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
	//*  38   91:invokevirtual   #64  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//*  39   94:instanceof      #66  <Class View>
	//*  40   97:ifeq            41
			ViewCompat.requestApplyInsets((View)mActionModeView.getParent());
	//   41  100:aload_0         
	//   42  101:getfield        #18  <Field AppCompatDelegateImplV9$ActionModeCallbackWrapperV9 this$1>
	//   43  104:getfield        #28  <Field AppCompatDelegateImplV9 AppCompatDelegateImplV9$ActionModeCallbackWrapperV9.this$0>
	//   44  107:getfield        #32  <Field ActionBarContextView AppCompatDelegateImplV9.mActionModeView>
	//   45  110:invokevirtual   #64  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//   46  113:checkcast       #66  <Class View>
	//   47  116:invokestatic    #71  <Method void ViewCompat.requestApplyInsets(View)>
		if(true) goto _L4; else goto _L3
	//   48  119:goto            41
_L3:
	}

	final AppCompatDelegateImplV9.ActionModeCallbackWrapperV9 this$1;

	AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1()
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
