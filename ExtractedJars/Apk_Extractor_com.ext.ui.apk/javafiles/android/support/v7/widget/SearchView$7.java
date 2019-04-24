// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$7
	implements android.widget.itorActionListener
{

	public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
	{
		onSubmitQuery();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SearchView this$0>
	//    2    4:invokevirtual   #23  <Method void SearchView.onSubmitQuery()>
		return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
	}

	final SearchView this$0;

	SearchView$7()
	{
		this$0 = SearchView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SearchView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
