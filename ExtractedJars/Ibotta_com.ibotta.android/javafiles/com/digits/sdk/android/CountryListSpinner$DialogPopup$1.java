// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.widget.ListView;

// Referenced classes of package com.digits.sdk.android:
//			CountryListSpinner

class CountryListSpinner$DialogPopup$1
	implements Runnable
{

	public void run()
	{
		val$listView.setSelection(val$selected);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field ListView val$listView>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field int val$selected>
	//    4    8:invokevirtual   #38  <Method void ListView.setSelection(int)>
	//    5   11:return          
	}

	final CountryListSpinner.DialogPopup this$1;
	final ListView val$listView;
	final int val$selected;

	CountryListSpinner$DialogPopup$1()
	{
		this$1 = final_dialogpopup;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field CountryListSpinner$DialogPopup this$1>
		val$listView = listview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field ListView val$listView>
		val$selected = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #28  <Field int val$selected>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #31  <Method void Object()>
	//   11   19:return          
	}
}
