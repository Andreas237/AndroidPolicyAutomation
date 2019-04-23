// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//			ListPopupWindow, DropDownListView

class ListPopupWindow$3
	implements android.widget.SelectedListener
{

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		if(i != -1)
	//*   0    0:iload_3         
	//*   1    1:iconst_m1       
	//*   2    2:icmpeq          22
		{
			adapterview = ((AdapterView) (mDropDownList));
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field ListPopupWindow this$0>
	//    5    9:getfield        #24  <Field DropDownListView ListPopupWindow.mDropDownList>
	//    6   12:astore_1        
			if(adapterview != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
				((DropDownListView) (adapterview)).setListSelectionHidden(false);
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #30  <Method void DropDownListView.setListSelectionHidden(boolean)>
		}
	//   12   22:return          
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	final ListPopupWindow this$0;

	ListPopupWindow$3()
	{
		this$0 = ListPopupWindow.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ListPopupWindow this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
