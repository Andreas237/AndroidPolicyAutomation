// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$1
	implements Runnable
{

	public void run()
	{
		InputMethodManager inputmethodmanager = (InputMethodManager)getContext().getSystemService("input_method");
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SearchView this$0>
	//    2    4:invokevirtual   #23  <Method Context SearchView.getContext()>
	//    3    7:ldc1            #25  <String "input_method">
	//    4    9:invokevirtual   #31  <Method Object Context.getSystemService(String)>
	//    5   12:checkcast       #33  <Class InputMethodManager>
	//    6   15:astore_1        
		if(inputmethodmanager != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          32
			SearchView.HIDDEN_METHOD_INVOKER.showSoftInputUnchecked(inputmethodmanager, ((android.view.View) (SearchView.this)), 0);
	//    9   20:getstatic       #37  <Field SearchView$AutoCompleteTextViewReflector SearchView.HIDDEN_METHOD_INVOKER>
	//   10   23:aload_1         
	//   11   24:aload_0         
	//   12   25:getfield        #14  <Field SearchView this$0>
	//   13   28:iconst_0        
	//   14   29:invokevirtual   #43  <Method void SearchView$AutoCompleteTextViewReflector.showSoftInputUnchecked(InputMethodManager, android.view.View, int)>
	//   15   32:return          
	}

	final SearchView this$0;

	SearchView$1()
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
