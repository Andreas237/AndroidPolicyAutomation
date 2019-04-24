// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.app:
//			AlertController, i

class AlertController$a$3
	implements android.widget.ickListener
{

	public void onItemClick(AdapterView adapterview, View view, int j, long l)
	{
		b.u.onClick(((android.content.DialogInterface) (a.a)), j);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AlertController$a b>
	//    2    4:getfield        #32  <Field android.content.DialogInterface$OnClickListener AlertController$a.u>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field AlertController a>
	//    5   11:getfield        #35  <Field i AlertController.a>
	//    6   14:iload_3         
	//    7   15:invokeinterface #41  <Method void android.content.DialogInterface$OnClickListener.onClick(android.content.DialogInterface, int)>
		if(!b.E)
	//*   8   20:aload_0         
	//*   9   21:getfield        #20  <Field AlertController$a b>
	//*  10   24:getfield        #45  <Field boolean AlertController$a.E>
	//*  11   27:ifne            40
			a.a.dismiss();
	//   12   30:aload_0         
	//   13   31:getfield        #22  <Field AlertController a>
	//   14   34:getfield        #35  <Field i AlertController.a>
	//   15   37:invokevirtual   #50  <Method void i.dismiss()>
	//   16   40:return          
	}

	final AlertController a;
	final AlertController.a b;

	AlertController$a$3(AlertController.a a1, AlertController alertcontroller)
	{
		b = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field AlertController$a b>
		a = alertcontroller;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field AlertController a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
