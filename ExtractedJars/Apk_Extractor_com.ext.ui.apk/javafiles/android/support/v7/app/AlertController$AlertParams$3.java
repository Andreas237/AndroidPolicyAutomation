// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.app:
//			AlertController, AppCompatDialog

class AlertController$AlertParams$3
	implements android.widget.r
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		mOnClickListener.onClick(((android.content.DialogInterface) (val$dialog.mDialog)), i);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AlertController$AlertParams this$0>
	//    2    4:getfield        #34  <Field android.content.DialogInterface$OnClickListener AlertController$AlertParams.mOnClickListener>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field AlertController val$dialog>
	//    5   11:getfield        #38  <Field AppCompatDialog AlertController.mDialog>
	//    6   14:iload_3         
	//    7   15:invokeinterface #44  <Method void android.content.DialogInterface$OnClickListener.onClick(android.content.DialogInterface, int)>
		if(!mIsSingleChoice)
	//*   8   20:aload_0         
	//*   9   21:getfield        #22  <Field AlertController$AlertParams this$0>
	//*  10   24:getfield        #48  <Field boolean AlertController$AlertParams.mIsSingleChoice>
	//*  11   27:ifne            40
			val$dialog.mDialog.dismiss();
	//   12   30:aload_0         
	//   13   31:getfield        #24  <Field AlertController val$dialog>
	//   14   34:getfield        #38  <Field AppCompatDialog AlertController.mDialog>
	//   15   37:invokevirtual   #53  <Method void AppCompatDialog.dismiss()>
	//   16   40:return          
	}

	final AlertController.AlertParams this$0;
	final AlertController val$dialog;

	AlertController$AlertParams$3()
	{
		this$0 = final_alertparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AlertController$AlertParams this$0>
		val$dialog = AlertController.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field AlertController val$dialog>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
