// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package com.irobot.home.view:
//			a

public class CustomTextView extends TextView
{

	public CustomTextView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void TextView(Context)>
		a = com.irobot.home.view.a.a(((TextView) (this)), context, ((AttributeSet) (null)));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aconst_null     
	//    7    9:invokestatic    #15  <Method String a.a(TextView, Context, AttributeSet)>
	//    8   12:putfield        #17  <Field String a>
	//    9   15:return          
	}

	public CustomTextView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void TextView(Context, AttributeSet)>
		a = com.irobot.home.view.a.a(((TextView) (this)), context, attributeset);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokestatic    #15  <Method String a.a(TextView, Context, AttributeSet)>
	//    9   13:putfield        #17  <Field String a>
	//   10   16:return          
	}

	public CustomTextView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #24  <Method void TextView(Context, AttributeSet, int)>
		a = com.irobot.home.view.a.a(((TextView) (this)), context, attributeset);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokestatic    #15  <Method String a.a(TextView, Context, AttributeSet)>
	//   10   14:putfield        #17  <Field String a>
	//   11   17:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #28  <Method void TextView.setTextAppearance(Context, int)>
		com.irobot.home.view.a.a(((TextView) (this)), context, a);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:getfield        #17  <Field String a>
	//    8   12:invokestatic    #31  <Method void a.a(TextView, Context, String)>
	//    9   15:return          
	}

	public void setTextColor(int i)
	{
		super.setTextColor(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #35  <Method void TextView.setTextColor(int)>
	//    3    5:return          
	}

	private String a;
}
