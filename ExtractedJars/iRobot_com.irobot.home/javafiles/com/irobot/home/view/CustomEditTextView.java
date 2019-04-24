// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

// Referenced classes of package com.irobot.home.view:
//			a

public class CustomEditTextView extends AppCompatEditText
{

	public CustomEditTextView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void AppCompatEditText(Context)>
		a = com.irobot.home.view.a.a(((android.widget.TextView) (this)), context, ((AttributeSet) (null)));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aconst_null     
	//    7    9:invokestatic    #15  <Method String a.a(android.widget.TextView, Context, AttributeSet)>
	//    8   12:putfield        #17  <Field String a>
	//    9   15:return          
	}

	public CustomEditTextView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void AppCompatEditText(Context, AttributeSet)>
		a = com.irobot.home.view.a.a(((android.widget.TextView) (this)), context, attributeset);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokestatic    #15  <Method String a.a(android.widget.TextView, Context, AttributeSet)>
	//    9   13:putfield        #17  <Field String a>
	//   10   16:return          
	}

	public CustomEditTextView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #24  <Method void AppCompatEditText(Context, AttributeSet, int)>
		a = com.irobot.home.view.a.a(((android.widget.TextView) (this)), context, attributeset);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #15  <Method String a.a(android.widget.TextView, Context, AttributeSet)>
	//   10   14:putfield        #17  <Field String a>
	//   11   17:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void AppCompatEditText.setTextAppearance(Context, int)>
		com.irobot.home.view.a.a(((android.widget.TextView) (this)), context, a);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:getfield        #17  <Field String a>
	//    8   12:invokestatic    #31  <Method void a.a(android.widget.TextView, Context, String)>
	//    9   15:return          
	}

	protected String a;
}
