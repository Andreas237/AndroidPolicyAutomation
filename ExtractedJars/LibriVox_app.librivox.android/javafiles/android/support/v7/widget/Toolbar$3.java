// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			Toolbar

class Toolbar$3
	implements android.view.ckListener
{

	public void onClick(View view)
	{
		collapseActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Toolbar this$0>
	//    2    4:invokevirtual   #23  <Method void Toolbar.collapseActionView()>
	//    3    7:return          
	}

	final Toolbar this$0;

	Toolbar$3()
	{
		this$0 = Toolbar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Toolbar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
