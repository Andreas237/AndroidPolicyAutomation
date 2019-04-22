// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

public static class TextInputLayout$AccessibilityDelegate extends AccessibilityDelegateCompat
{

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		view = ((View) (layout.getEditText()));
	//    4    6:aload_0         
	//    5    7:getfield        #16  <Field TextInputLayout layout>
	//    6   10:invokevirtual   #25  <Method EditText TextInputLayout.getEditText()>
	//    7   13:astore_1        
		if(view != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          26
			view = ((View) (((EditText) (view)).getText()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #31  <Method android.text.Editable EditText.getText()>
	//   12   22:astore_1        
		else
	//*  13   23:goto            28
			view = null;
	//   14   26:aconst_null     
	//   15   27:astore_1        
		CharSequence charsequence2 = layout.getHint();
	//   16   28:aload_0         
	//   17   29:getfield        #16  <Field TextInputLayout layout>
	//   18   32:invokevirtual   #35  <Method CharSequence TextInputLayout.getHint()>
	//   19   35:astore          11
		CharSequence charsequence = layout.getError();
	//   20   37:aload_0         
	//   21   38:getfield        #16  <Field TextInputLayout layout>
	//   22   41:invokevirtual   #38  <Method CharSequence TextInputLayout.getError()>
	//   23   44:astore          9
		CharSequence charsequence1 = layout.getCounterOverflowDescription();
	//   24   46:aload_0         
	//   25   47:getfield        #16  <Field TextInputLayout layout>
	//   26   50:invokevirtual   #41  <Method CharSequence TextInputLayout.getCounterOverflowDescription()>
	//   27   53:astore          10
		boolean flag1 = TextUtils.isEmpty(((CharSequence) (view))) ^ true;
	//   28   55:aload_1         
	//   29   56:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   30   59:iconst_1        
	//   31   60:ixor            
	//   32   61:istore          4
		boolean flag2 = TextUtils.isEmpty(charsequence2) ^ true;
	//   33   63:aload           11
	//   34   65:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   35   68:iconst_1        
	//   36   69:ixor            
	//   37   70:istore          5
		boolean flag3 = TextUtils.isEmpty(charsequence) ^ true;
	//   38   72:aload           9
	//   39   74:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   40   77:iconst_1        
	//   41   78:ixor            
	//   42   79:istore          6
		boolean flag5 = false;
	//   43   81:iconst_0        
	//   44   82:istore          8
		boolean flag;
		if(!flag3 && TextUtils.isEmpty(charsequence1))
	//*  45   84:iload           6
	//*  46   86:ifne            105
	//*  47   89:aload           10
	//*  48   91:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  49   94:ifne            100
	//*  50   97:goto            105
			flag = false;
	//   51  100:iconst_0        
	//   52  101:istore_3        
		else
	//*  53  102:goto            107
			flag = true;
	//   54  105:iconst_1        
	//   55  106:istore_3        
		if(flag1)
	//*  56  107:iload           4
	//*  57  109:ifeq            120
			accessibilitynodeinfocompat.setText(((CharSequence) (view)));
	//   58  112:aload_2         
	//   59  113:aload_1         
	//   60  114:invokevirtual   #53  <Method void AccessibilityNodeInfoCompat.setText(CharSequence)>
		else
	//*  61  117:goto            131
		if(flag2)
	//*  62  120:iload           5
	//*  63  122:ifeq            131
			accessibilitynodeinfocompat.setText(charsequence2);
	//   64  125:aload_2         
	//   65  126:aload           11
	//   66  128:invokevirtual   #53  <Method void AccessibilityNodeInfoCompat.setText(CharSequence)>
		if(flag2)
	//*  67  131:iload           5
	//*  68  133:ifeq            169
		{
			accessibilitynodeinfocompat.setHintText(charsequence2);
	//   69  136:aload_2         
	//   70  137:aload           11
	//   71  139:invokevirtual   #56  <Method void AccessibilityNodeInfoCompat.setHintText(CharSequence)>
			boolean flag4 = flag5;
	//   72  142:iload           8
	//   73  144:istore          7
			if(!flag1)
	//*  74  146:iload           4
	//*  75  148:ifne            163
			{
				flag4 = flag5;
	//   76  151:iload           8
	//   77  153:istore          7
				if(flag2)
	//*  78  155:iload           5
	//*  79  157:ifeq            163
					flag4 = true;
	//   80  160:iconst_1        
	//   81  161:istore          7
			}
			accessibilitynodeinfocompat.setShowingHintText(flag4);
	//   82  163:aload_2         
	//   83  164:iload           7
	//   84  166:invokevirtual   #60  <Method void AccessibilityNodeInfoCompat.setShowingHintText(boolean)>
		}
		if(flag)
	//*  85  169:iload_3         
	//*  86  170:ifeq            197
		{
			if(flag3)
	//*  87  173:iload           6
	//*  88  175:ifeq            184
				view = ((View) (charsequence));
	//   89  178:aload           9
	//   90  180:astore_1        
			else
	//*  91  181:goto            187
				view = ((View) (charsequence1));
	//   92  184:aload           10
	//   93  186:astore_1        
			accessibilitynodeinfocompat.setError(((CharSequence) (view)));
	//   94  187:aload_2         
	//   95  188:aload_1         
	//   96  189:invokevirtual   #63  <Method void AccessibilityNodeInfoCompat.setError(CharSequence)>
			accessibilitynodeinfocompat.setContentInvalid(true);
	//   97  192:aload_2         
	//   98  193:iconst_1        
	//   99  194:invokevirtual   #66  <Method void AccessibilityNodeInfoCompat.setContentInvalid(boolean)>
		}
	//  100  197:return          
	}

	public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onPopulateAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #70  <Method void AccessibilityDelegateCompat.onPopulateAccessibilityEvent(View, AccessibilityEvent)>
		view = ((View) (layout.getEditText()));
	//    4    6:aload_0         
	//    5    7:getfield        #16  <Field TextInputLayout layout>
	//    6   10:invokevirtual   #25  <Method EditText TextInputLayout.getEditText()>
	//    7   13:astore_1        
		if(view != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          26
			view = ((View) (((EditText) (view)).getText()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #31  <Method android.text.Editable EditText.getText()>
	//   12   22:astore_1        
		else
	//*  13   23:goto            28
			view = null;
	//   14   26:aconst_null     
	//   15   27:astore_1        
		Object obj = ((Object) (view));
	//   16   28:aload_1         
	//   17   29:astore_3        
		if(TextUtils.isEmpty(((CharSequence) (view))))
	//*  18   30:aload_1         
	//*  19   31:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   34:ifeq            45
			obj = ((Object) (layout.getHint()));
	//   21   37:aload_0         
	//   22   38:getfield        #16  <Field TextInputLayout layout>
	//   23   41:invokevirtual   #35  <Method CharSequence TextInputLayout.getHint()>
	//   24   44:astore_3        
		if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  25   45:aload_3         
	//*  26   46:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   49:ifne            63
			accessibilityevent.getText().add(obj);
	//   28   52:aload_2         
	//   29   53:invokevirtual   #75  <Method List AccessibilityEvent.getText()>
	//   30   56:aload_3         
	//   31   57:invokeinterface #81  <Method boolean List.add(Object)>
	//   32   62:pop             
	//   33   63:return          
	}

	private final TextInputLayout layout;

	public TextInputLayout$AccessibilityDelegate(TextInputLayout textinputlayout)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void AccessibilityDelegateCompat()>
		layout = textinputlayout;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field TextInputLayout layout>
	//    5    9:return          
	}
}
