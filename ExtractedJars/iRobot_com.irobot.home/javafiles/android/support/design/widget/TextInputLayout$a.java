// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout, e

private class TextInputLayout$a extends a
{

	public void a(View view, b b1)
	{
		super.a(view, b1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void a.a(View, b)>
		b1.b(((CharSequence) (((Class) (android/support/design/widget/TextInputLayout)).getSimpleName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class TextInputLayout>
	//    6    9:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    7   12:invokevirtual   #31  <Method void b.b(CharSequence)>
		view = ((View) (a.d.j()));
	//    8   15:aload_0         
	//    9   16:getfield        #12  <Field TextInputLayout a>
	//   10   19:getfield        #35  <Field e TextInputLayout.d>
	//   11   22:invokevirtual   #41  <Method CharSequence e.j()>
	//   12   25:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (view))))
	//*  13   26:aload_1         
	//*  14   27:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   30:ifne            38
			b1.c(((CharSequence) (view)));
	//   16   33:aload_2         
	//   17   34:aload_1         
	//   18   35:invokevirtual   #50  <Method void b.c(CharSequence)>
		if(a.a != null)
	//*  19   38:aload_0         
	//*  20   39:getfield        #12  <Field TextInputLayout a>
	//*  21   42:getfield        #53  <Field android.widget.EditText android.support.design.widget.TextInputLayout.a>
	//*  22   45:ifnull          59
			b1.d(((View) (a.a)));
	//   23   48:aload_2         
	//   24   49:aload_0         
	//   25   50:getfield        #12  <Field TextInputLayout a>
	//   26   53:getfield        #53  <Field android.widget.EditText android.support.design.widget.TextInputLayout.a>
	//   27   56:invokevirtual   #56  <Method void b.d(View)>
		if(a.b != null)
	//*  28   59:aload_0         
	//*  29   60:getfield        #12  <Field TextInputLayout a>
	//*  30   63:getfield        #59  <Field TextView android.support.design.widget.TextInputLayout.b>
	//*  31   66:ifnull          83
			view = ((View) (a.b.getText()));
	//   32   69:aload_0         
	//   33   70:getfield        #12  <Field TextInputLayout a>
	//   34   73:getfield        #59  <Field TextView android.support.design.widget.TextInputLayout.b>
	//   35   76:invokevirtual   #64  <Method CharSequence TextView.getText()>
	//   36   79:astore_1        
		else
	//*  37   80:goto            85
			view = null;
	//   38   83:aconst_null     
	//   39   84:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (view))))
	//*  40   85:aload_1         
	//*  41   86:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  42   89:ifne            102
		{
			b1.l(true);
	//   43   92:aload_2         
	//   44   93:iconst_1        
	//   45   94:invokevirtual   #68  <Method void b.l(boolean)>
			b1.e(((CharSequence) (view)));
	//   46   97:aload_2         
	//   47   98:aload_1         
	//   48   99:invokevirtual   #71  <Method void b.e(CharSequence)>
		}
	//   49  102:return          
	}

	public void a(View view, AccessibilityEvent accessibilityevent)
	{
		super.a(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #74  <Method void a.a(View, AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/design/widget/TextInputLayout)).getSimpleName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class TextInputLayout>
	//    6    9:invokevirtual   #25  <Method String Class.getSimpleName()>
	//    7   12:invokevirtual   #79  <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    8   15:return          
	}

	public void b(View view, AccessibilityEvent accessibilityevent)
	{
		super.b(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #81  <Method void a.b(View, AccessibilityEvent)>
		view = ((View) (a.d.j()));
	//    4    6:aload_0         
	//    5    7:getfield        #12  <Field TextInputLayout a>
	//    6   10:getfield        #35  <Field e TextInputLayout.d>
	//    7   13:invokevirtual   #41  <Method CharSequence e.j()>
	//    8   16:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (view))))
	//*   9   17:aload_1         
	//*  10   18:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   21:ifne            35
			accessibilityevent.getText().add(((Object) (view)));
	//   12   24:aload_2         
	//   13   25:invokevirtual   #84  <Method List AccessibilityEvent.getText()>
	//   14   28:aload_1         
	//   15   29:invokeinterface #90  <Method boolean List.add(Object)>
	//   16   34:pop             
	//   17   35:return          
	}

	final TextInputLayout a;

	TextInputLayout$a(TextInputLayout textinputlayout)
	{
		a = textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field TextInputLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void a()>
	//    5    9:return          
	}
}
