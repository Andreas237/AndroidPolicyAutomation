// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.widget.f;

// Referenced classes of package android.support.v7.widget:
//			SearchView, SuggestionsAdapter

class SearchView$2
	implements Runnable
{

	public void run()
	{
		if(mSuggestionsAdapter != null && (mSuggestionsAdapter instanceof SuggestionsAdapter))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field SearchView this$0>
	//*   2    4:getfield        #23  <Field f SearchView.mSuggestionsAdapter>
	//*   3    7:ifnull          34
	//*   4   10:aload_0         
	//*   5   11:getfield        #12  <Field SearchView this$0>
	//*   6   14:getfield        #23  <Field f SearchView.mSuggestionsAdapter>
	//*   7   17:instanceof      #25  <Class SuggestionsAdapter>
	//*   8   20:ifeq            34
			mSuggestionsAdapter.changeCursor(((android.database.Cursor) (null)));
	//    9   23:aload_0         
	//   10   24:getfield        #12  <Field SearchView this$0>
	//   11   27:getfield        #23  <Field f SearchView.mSuggestionsAdapter>
	//   12   30:aconst_null     
	//   13   31:invokevirtual   #31  <Method void f.changeCursor(android.database.Cursor)>
	//   14   34:return          
	}

	final SearchView this$0;

	SearchView$2()
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
