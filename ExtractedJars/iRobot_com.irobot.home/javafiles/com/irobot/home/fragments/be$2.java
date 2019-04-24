// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.View;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$2
	implements android.view.OnClickListener
{

	public void onClick(View view)
	{
		a.show();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field android.app.AlertDialog$Builder a>
	//    2    4:invokevirtual   #32  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//    3    7:pop             
	//    4    8:return          
	}

	final android.app.Dialog.Builder a;
	final be b;

	be$2(be be1, android.app.Dialog.Builder builder)
	{
		b = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field be b>
		a = builder;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field android.app.AlertDialog$Builder a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
