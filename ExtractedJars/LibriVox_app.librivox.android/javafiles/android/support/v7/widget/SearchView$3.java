// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$3
	implements android.view.hangeListener
{

	public void onFocusChange(View view, boolean flag)
	{
		if(mOnQueryTextFocusChangeListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field SearchView this$0>
	//*   2    4:getfield        #24  <Field android.view.View$OnFocusChangeListener SearchView.mOnQueryTextFocusChangeListener>
	//*   3    7:ifnull          27
			mOnQueryTextFocusChangeListener.onFocusChange(((View) (SearchView.this)), flag);
	//    4   10:aload_0         
	//    5   11:getfield        #12  <Field SearchView this$0>
	//    6   14:getfield        #24  <Field android.view.View$OnFocusChangeListener SearchView.mOnQueryTextFocusChangeListener>
	//    7   17:aload_0         
	//    8   18:getfield        #12  <Field SearchView this$0>
	//    9   21:iload_2         
	//   10   22:invokeinterface #26  <Method void android.view.View$OnFocusChangeListener.onFocusChange(View, boolean)>
	//   11   27:return          
	}

	final SearchView this$0;

	SearchView$3()
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
