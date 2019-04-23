// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.widget:
//			AppCompatSpinner

class AppCompatSpinner$DropdownPopup$1
	implements android.widget.AdapterView.OnItemClickListener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		setSelection(i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
	//    2    4:getfield        #27  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
	//    3    7:iload_3         
	//    4    8:invokevirtual   #33  <Method void AppCompatSpinner.setSelection(int)>
		if(getOnItemClickListener() != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
	//*   7   15:getfield        #27  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
	//*   8   18:invokevirtual   #37  <Method android.widget.AdapterView$OnItemClickListener AppCompatSpinner.getOnItemClickListener()>
	//*   9   21:ifnull          50
			performItemClick(view, i, mAdapter.getItemId(i));
	//   10   24:aload_0         
	//   11   25:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
	//   12   28:getfield        #27  <Field AppCompatSpinner AppCompatSpinner$DropdownPopup.this$0>
	//   13   31:aload_2         
	//   14   32:iload_3         
	//   15   33:aload_0         
	//   16   34:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
	//   17   37:getfield        #41  <Field ListAdapter AppCompatSpinner$DropdownPopup.mAdapter>
	//   18   40:iload_3         
	//   19   41:invokeinterface #47  <Method long ListAdapter.getItemId(int)>
	//   20   46:invokevirtual   #51  <Method boolean AppCompatSpinner.performItemClick(View, int, long)>
	//   21   49:pop             
		dismiss();
	//   22   50:aload_0         
	//   23   51:getfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
	//   24   54:invokevirtual   #54  <Method void AppCompatSpinner$DropdownPopup.dismiss()>
	//   25   57:return          
	}

	final AppCompatSpinner.DropdownPopup this$1;
	final AppCompatSpinner val$this$0;

	AppCompatSpinner$DropdownPopup$1()
	{
		this$1 = final_dropdownpopup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field AppCompatSpinner$DropdownPopup this$1>
		val$this$0 = AppCompatSpinner.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field AppCompatSpinner val$this$0>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}
}
