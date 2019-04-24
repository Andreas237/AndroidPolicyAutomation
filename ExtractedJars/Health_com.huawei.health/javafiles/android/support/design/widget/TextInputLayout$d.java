// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;
import o.n;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

class TextInputLayout$d extends AccessibilityDelegateCompat
{

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/design/widget/TextInputLayout)).getSimpleName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class TextInputLayout>
	//    6    9:invokevirtual   #27  <Method String Class.getSimpleName()>
	//    7   12:invokevirtual   #33  <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    8   15:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #37  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/design/widget/TextInputLayout)).getSimpleName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class TextInputLayout>
	//    6    9:invokevirtual   #27  <Method String Class.getSimpleName()>
	//    7   12:invokevirtual   #40  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		view = ((View) (e.mCollapsingTextHelper.k()));
	//    8   15:aload_0         
	//    9   16:getfield        #13  <Field TextInputLayout e>
	//   10   19:getfield        #44  <Field n TextInputLayout.mCollapsingTextHelper>
	//   11   22:invokevirtual   #50  <Method CharSequence n.k()>
	//   12   25:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (view))))
	//*  13   26:aload_1         
	//*  14   27:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   30:ifne            38
			accessibilitynodeinfocompat.setText(((CharSequence) (view)));
	//   16   33:aload_2         
	//   17   34:aload_1         
	//   18   35:invokevirtual   #59  <Method void AccessibilityNodeInfoCompat.setText(CharSequence)>
		if(e.mEditText != null)
	//*  19   38:aload_0         
	//*  20   39:getfield        #13  <Field TextInputLayout e>
	//*  21   42:getfield        #63  <Field android.widget.EditText TextInputLayout.mEditText>
	//*  22   45:ifnull          59
			accessibilitynodeinfocompat.setLabelFor(((View) (e.mEditText)));
	//   23   48:aload_2         
	//   24   49:aload_0         
	//   25   50:getfield        #13  <Field TextInputLayout e>
	//   26   53:getfield        #63  <Field android.widget.EditText TextInputLayout.mEditText>
	//   27   56:invokevirtual   #67  <Method void AccessibilityNodeInfoCompat.setLabelFor(View)>
		if(e.mErrorView != null)
	//*  28   59:aload_0         
	//*  29   60:getfield        #13  <Field TextInputLayout e>
	//*  30   63:getfield        #71  <Field TextView TextInputLayout.mErrorView>
	//*  31   66:ifnull          83
			view = ((View) (e.mErrorView.getText()));
	//   32   69:aload_0         
	//   33   70:getfield        #13  <Field TextInputLayout e>
	//   34   73:getfield        #71  <Field TextView TextInputLayout.mErrorView>
	//   35   76:invokevirtual   #76  <Method CharSequence TextView.getText()>
	//   36   79:astore_1        
		else
	//*  37   80:goto            85
			view = null;
	//   38   83:aconst_null     
	//   39   84:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (view))))
	//*  40   85:aload_1         
	//*  41   86:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  42   89:ifne            102
		{
			accessibilitynodeinfocompat.setContentInvalid(true);
	//   43   92:aload_2         
	//   44   93:iconst_1        
	//   45   94:invokevirtual   #80  <Method void AccessibilityNodeInfoCompat.setContentInvalid(boolean)>
			accessibilitynodeinfocompat.setError(((CharSequence) (view)));
	//   46   97:aload_2         
	//   47   98:aload_1         
	//   48   99:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.setError(CharSequence)>
		}
	//   49  102:return          
	}

	public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #86  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
		view = ((View) (e.mCollapsingTextHelper.k()));
	//    4    6:aload_0         
	//    5    7:getfield        #13  <Field TextInputLayout e>
	//    6   10:getfield        #44  <Field n TextInputLayout.mCollapsingTextHelper>
	//    7   13:invokevirtual   #50  <Method CharSequence n.k()>
	//    8   16:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (view))))
	//*   9   17:aload_1         
	//*  10   18:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   21:ifne            35
			accessibilityevent.getText().add(((Object) (view)));
	//   12   24:aload_2         
	//   13   25:invokevirtual   #89  <Method List AccessibilityEvent.getText()>
	//   14   28:aload_1         
	//   15   29:invokeinterface #95  <Method boolean List.add(Object)>
	//   16   34:pop             
	//   17   35:return          
	}

	final TextInputLayout e;

	TextInputLayout$d(TextInputLayout textinputlayout)
	{
		e = textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field TextInputLayout e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void AccessibilityDelegateCompat()>
	//    5    9:return          
	}
}
