// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$4
	implements android.view.hangeListener
{

	public void onFocusChange(View view, boolean flag)
	{
		if(a.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field SearchView a>
	//*   2    4:getfield        #26  <Field android.view.View$OnFocusChangeListener SearchView.f>
	//*   3    7:ifnull          27
			a.f.onFocusChange(((View) (a)), flag);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field SearchView a>
	//    6   14:getfield        #26  <Field android.view.View$OnFocusChangeListener SearchView.f>
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field SearchView a>
	//    9   21:iload_2         
	//   10   22:invokeinterface #28  <Method void android.view.View$OnFocusChangeListener.onFocusChange(View, boolean)>
	//   11   27:return          
	}

	final SearchView a;

	SearchView$4(SearchView searchview)
	{
		a = searchview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field SearchView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
