// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.*;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl

class AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1 extends az
{

	public void onAnimationEnd(View view)
	{
		mActionModeView.setVisibility(8);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
	//    2    4:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
	//    3    7:getfield        #28  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//    4   10:bipush          8
	//    5   12:invokevirtual   #34  <Method void ActionBarContextView.setVisibility(int)>
		if(mActionModePopup != null)
	//*   6   15:aload_0         
	//*   7   16:getfield        #10  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
	//*   8   19:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
	//*   9   22:getfield        #38  <Field PopupWindow AppCompatDelegateImpl.mActionModePopup>
	//*  10   25:ifnull          44
			mActionModePopup.dismiss();
	//   11   28:aload_0         
	//   12   29:getfield        #10  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
	//   13   32:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
	//   14   35:getfield        #38  <Field PopupWindow AppCompatDelegateImpl.mActionModePopup>
	//   15   38:invokevirtual   #43  <Method void PopupWindow.dismiss()>
		else
	//*  16   41:goto            82
		if(mActionModeView.getParent() instanceof View)
	//*  17   44:aload_0         
	//*  18   45:getfield        #10  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
	//*  19   48:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
	//*  20   51:getfield        #28  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//*  21   54:invokevirtual   #47  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//*  22   57:instanceof      #49  <Class View>
	//*  23   60:ifeq            82
			ac.p((View)mActionModeView.getParent());
	//   24   63:aload_0         
	//   25   64:getfield        #10  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
	//   26   67:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
	//   27   70:getfield        #28  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//   28   73:invokevirtual   #47  <Method android.view.ViewParent ActionBarContextView.getParent()>
	//   29   76:checkcast       #49  <Class View>
	//   30   79:invokestatic    #54  <Method void ac.p(View)>
		mActionModeView.removeAllViews();
	//   31   82:aload_0         
	//   32   83:getfield        #10  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
	//   33   86:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
	//   34   89:getfield        #28  <Field ActionBarContextView AppCompatDelegateImpl.mActionModeView>
	//   35   92:invokevirtual   #57  <Method void ActionBarContextView.removeAllViews()>
		mFadeAnim.a(((android.support.v4.view.ay) (null)));
	//   36   95:aload_0         
	//   37   96:getfield        #10  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
	//   38   99:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
	//   39  102:getfield        #61  <Field au AppCompatDelegateImpl.mFadeAnim>
	//   40  105:aconst_null     
	//   41  106:invokevirtual   #67  <Method au au.a(android.support.v4.view.ay)>
	//   42  109:pop             
		mFadeAnim = null;
	//   43  110:aload_0         
	//   44  111:getfield        #10  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
	//   45  114:getfield        #22  <Field AppCompatDelegateImpl AppCompatDelegateImpl$ActionModeCallbackWrapperV9.this$0>
	//   46  117:aconst_null     
	//   47  118:putfield        #61  <Field au AppCompatDelegateImpl.mFadeAnim>
	//   48  121:return          
	}

	final AppCompatDelegateImpl.ActionModeCallbackWrapperV9 this$1;

	AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1()
	{
		this$1 = AppCompatDelegateImpl.ActionModeCallbackWrapperV9.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field AppCompatDelegateImpl$ActionModeCallbackWrapperV9 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void az()>
	//    5    9:return          
	}
}
