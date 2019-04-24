// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.app:
//			AlertController

class AlertController$a$4
	implements android.widget.ickListener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		if(c.C != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field AlertController$a c>
	//*   2    4:getfield        #36  <Field boolean[] AlertController$a.C>
	//*   3    7:ifnull          27
			c.C[i] = a.isItemChecked(i);
	//    4   10:aload_0         
	//    5   11:getfield        #22  <Field AlertController$a c>
	//    6   14:getfield        #36  <Field boolean[] AlertController$a.C>
	//    7   17:iload_3         
	//    8   18:aload_0         
	//    9   19:getfield        #24  <Field AlertController$RecycleListView a>
	//   10   22:iload_3         
	//   11   23:invokevirtual   #42  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
	//   12   26:bastore         
		c.G.onClick(((android.content.DialogInterface) (b.a)), i, a.isItemChecked(i));
	//   13   27:aload_0         
	//   14   28:getfield        #22  <Field AlertController$a c>
	//   15   31:getfield        #46  <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$a.G>
	//   16   34:aload_0         
	//   17   35:getfield        #26  <Field AlertController b>
	//   18   38:getfield        #49  <Field i AlertController.a>
	//   19   41:iload_3         
	//   20   42:aload_0         
	//   21   43:getfield        #24  <Field AlertController$RecycleListView a>
	//   22   46:iload_3         
	//   23   47:invokevirtual   #42  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
	//   24   50:invokeinterface #55  <Method void android.content.DialogInterface$OnMultiChoiceClickListener.onClick(android.content.DialogInterface, int, boolean)>
	//   25   55:return          
	}

	final cleListView a;
	final AlertController b;
	final AlertController.a c;

	AlertController$a$4(AlertController.a a1, cleListView clelistview, AlertController alertcontroller)
	{
		c = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AlertController$a c>
		a = clelistview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field AlertController$RecycleListView a>
		b = alertcontroller;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field AlertController b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #29  <Method void Object()>
	//   11   19:return          
	}
}
