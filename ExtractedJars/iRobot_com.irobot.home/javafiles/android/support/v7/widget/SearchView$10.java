// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$10
	implements android.widget.ItemSelectedListener
{

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		a.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SearchView a>
	//    2    4:iload_3         
	//    3    5:invokevirtual   #23  <Method boolean SearchView.a(int)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	final SearchView a;

	SearchView$10(SearchView searchview)
	{
		a = searchview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field SearchView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
