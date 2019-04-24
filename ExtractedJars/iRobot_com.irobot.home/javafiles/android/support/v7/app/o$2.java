// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.y;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			o

class o$2 extends y
{

	public void b(View view)
	{
		a.n = null;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field o a>
	//    2    4:aconst_null     
	//    3    5:putfield        #22  <Field android.support.v7.view.h o.n>
		a.c.requestLayout();
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field o a>
	//    6   12:getfield        #26  <Field ActionBarContainer o.c>
	//    7   15:invokevirtual   #31  <Method void ActionBarContainer.requestLayout()>
	//    8   18:return          
	}

	final o a;

	o$2(o o1)
	{
		a = o1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field o a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void y()>
	//    5    9:return          
	}
}
