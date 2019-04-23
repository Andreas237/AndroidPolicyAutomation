// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.app:
//			AlertController

class AlertController$AlertParams$4
	implements android.widget.r
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		if(mCheckedItems != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field AlertController$AlertParams this$0>
	//*   2    4:getfield        #32  <Field boolean[] AlertController$AlertParams.mCheckedItems>
	//*   3    7:ifnull          27
			mCheckedItems[i] = val$listView.isItemChecked(i);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field AlertController$AlertParams this$0>
	//    6   14:getfield        #32  <Field boolean[] AlertController$AlertParams.mCheckedItems>
	//    7   17:iload_3         
	//    8   18:aload_0         
	//    9   19:getfield        #18  <Field AlertController$RecycleListView val$listView>
	//   10   22:iload_3         
	//   11   23:invokevirtual   #38  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
	//   12   26:bastore         
		mOnCheckboxClickListener.onClick(((android.content.DialogInterface) (val$dialog.mDialog)), i, val$listView.isItemChecked(i));
	//   13   27:aload_0         
	//   14   28:getfield        #16  <Field AlertController$AlertParams this$0>
	//   15   31:getfield        #42  <Field android.content.DialogInterface$OnMultiChoiceClickListener AlertController$AlertParams.mOnCheckboxClickListener>
	//   16   34:aload_0         
	//   17   35:getfield        #20  <Field AlertController val$dialog>
	//   18   38:getfield        #48  <Field AppCompatDialog AlertController.mDialog>
	//   19   41:iload_3         
	//   20   42:aload_0         
	//   21   43:getfield        #18  <Field AlertController$RecycleListView val$listView>
	//   22   46:iload_3         
	//   23   47:invokevirtual   #38  <Method boolean AlertController$RecycleListView.isItemChecked(int)>
	//   24   50:invokeinterface #54  <Method void android.content.DialogInterface$OnMultiChoiceClickListener.onClick(android.content.DialogInterface, int, boolean)>
	//   25   55:return          
	}

	final AlertController.AlertParams this$0;
	final AlertController val$dialog;
	final w val$listView;

	AlertController$AlertParams$4()
	{
		this$0 = final_alertparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field AlertController$AlertParams this$0>
		val$listView = w;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field AlertController$RecycleListView val$listView>
		val$dialog = AlertController.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field AlertController val$dialog>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}
}
