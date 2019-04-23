// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$9
	implements android.widget.nItemSelectedListener
{

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		SearchView.this.onItemSelected(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field SearchView this$0>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #23  <Method boolean SearchView.onItemSelected(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	final SearchView this$0;

	SearchView$9()
	{
		this$0 = SearchView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field SearchView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
