// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v7.view.b;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			ActionBarContextView

class ActionBarContextView$1
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		a.c();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field b a>
	//    2    4:invokevirtual   #31  <Method void b.c()>
	//    3    7:return          
	}

	final b a;
	final ActionBarContextView b;

	ActionBarContextView$1(ActionBarContextView actionbarcontextview, b b1)
	{
		b = actionbarcontextview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ActionBarContextView b>
		a = b1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field b a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
