// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$8
	implements android.widget.nItemClickListener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		onItemClicked(i, 0, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SearchView this$0>
	//    2    4:iload_3         
	//    3    5:iconst_0        
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #24  <Method boolean SearchView.onItemClicked(int, int, String)>
	//    6   10:pop             
	//    7   11:return          
	}

	final SearchView this$0;

	SearchView$8()
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
