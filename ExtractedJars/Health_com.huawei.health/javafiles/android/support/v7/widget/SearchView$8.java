// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$8
	implements android.view.tener
{

	public boolean onKey(View view, int i, KeyEvent keyevent)
	{
		if(mSearchable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field SearchView this$0>
	//*   2    4:getfield        #24  <Field android.app.SearchableInfo SearchView.mSearchable>
	//*   3    7:ifnonnull       12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(mSearchSrcTextView.isPopupShowing() && mSearchSrcTextView.getListSelection() != -1)
	//*   6   12:aload_0         
	//*   7   13:getfield        #14  <Field SearchView this$0>
	//*   8   16:getfield        #28  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
	//*   9   19:invokevirtual   #34  <Method boolean SearchView$SearchAutoComplete.isPopupShowing()>
	//*  10   22:ifeq            50
	//*  11   25:aload_0         
	//*  12   26:getfield        #14  <Field SearchView this$0>
	//*  13   29:getfield        #28  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
	//*  14   32:invokevirtual   #38  <Method int SearchView$SearchAutoComplete.getListSelection()>
	//*  15   35:iconst_m1       
	//*  16   36:icmpeq          50
			return onSuggestionsKey(view, i, keyevent);
	//   17   39:aload_0         
	//   18   40:getfield        #14  <Field SearchView this$0>
	//   19   43:aload_1         
	//   20   44:iload_2         
	//   21   45:aload_3         
	//   22   46:invokevirtual   #41  <Method boolean SearchView.onSuggestionsKey(View, int, KeyEvent)>
	//   23   49:ireturn         
		if(!archAutoComplete.access._mth000(mSearchSrcTextView) && keyevent.hasNoModifiers() && keyevent.getAction() == 1 && i == 66)
	//*  24   50:aload_0         
	//*  25   51:getfield        #14  <Field SearchView this$0>
	//*  26   54:getfield        #28  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
	//*  27   57:invokestatic    #45  <Method boolean SearchView$SearchAutoComplete.access$000(SearchView$SearchAutoComplete)>
	//*  28   60:ifne            112
	//*  29   63:aload_3         
	//*  30   64:invokevirtual   #50  <Method boolean KeyEvent.hasNoModifiers()>
	//*  31   67:ifeq            112
	//*  32   70:aload_3         
	//*  33   71:invokevirtual   #53  <Method int KeyEvent.getAction()>
	//*  34   74:iconst_1        
	//*  35   75:icmpne          112
	//*  36   78:iload_2         
	//*  37   79:bipush          66
	//*  38   81:icmpne          112
		{
			view.cancelLongPress();
	//   39   84:aload_1         
	//   40   85:invokevirtual   #58  <Method void View.cancelLongPress()>
			launchQuerySearch(0, ((String) (null)), ((Object) (mSearchSrcTextView.getText())).toString());
	//   41   88:aload_0         
	//   42   89:getfield        #14  <Field SearchView this$0>
	//   43   92:iconst_0        
	//   44   93:aconst_null     
	//   45   94:aload_0         
	//   46   95:getfield        #14  <Field SearchView this$0>
	//   47   98:getfield        #28  <Field SearchView$SearchAutoComplete SearchView.mSearchSrcTextView>
	//   48  101:invokevirtual   #62  <Method android.text.Editable SearchView$SearchAutoComplete.getText()>
	//   49  104:invokevirtual   #66  <Method String Object.toString()>
	//   50  107:invokevirtual   #70  <Method void SearchView.launchQuerySearch(int, String, String)>
			return true;
	//   51  110:iconst_1        
	//   52  111:ireturn         
		} else
		{
			return false;
	//   53  112:iconst_0        
	//   54  113:ireturn         
		}
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
