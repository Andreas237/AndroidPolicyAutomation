// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$2
	implements TextWatcher
{

	public void afterTextChanged(Editable editable)
	{
	//    0    0:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
	{
	//    0    0:return          
	}

	public void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		a.b(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field SearchView a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method void SearchView.b(CharSequence)>
	//    4    8:return          
	}

	final SearchView a;

	SearchView$2(SearchView searchview)
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
