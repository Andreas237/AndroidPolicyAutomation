// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$4
	implements android.view.ChangeListener
{

	public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
			int k1, int l1)
	{
		adjustDropDownSizeAndPosition();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field SearchView this$0>
	//    2    4:invokevirtual   #25  <Method void SearchView.adjustDropDownSizeAndPosition()>
	//    3    7:return          
	}

	final SearchView this$0;

	SearchView$4()
	{
		this$0 = SearchView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field SearchView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
