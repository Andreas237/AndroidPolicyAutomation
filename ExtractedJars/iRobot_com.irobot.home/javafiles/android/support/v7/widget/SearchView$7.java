// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			SearchView

class SearchView$7
	implements android.view.tener
{

	public boolean onKey(View view, int i, KeyEvent keyevent)
	{
		if(a.h == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field SearchView a>
	//*   2    4:getfield        #24  <Field android.app.SearchableInfo SearchView.h>
	//*   3    7:ifnonnull       12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(a.a.isPopupShowing() && a.a.getListSelection() != -1)
	//*   6   12:aload_0         
	//*   7   13:getfield        #14  <Field SearchView a>
	//*   8   16:getfield        #27  <Field SearchView$SearchAutoComplete SearchView.a>
	//*   9   19:invokevirtual   #33  <Method boolean SearchView$SearchAutoComplete.isPopupShowing()>
	//*  10   22:ifeq            50
	//*  11   25:aload_0         
	//*  12   26:getfield        #14  <Field SearchView a>
	//*  13   29:getfield        #27  <Field SearchView$SearchAutoComplete SearchView.a>
	//*  14   32:invokevirtual   #37  <Method int SearchView$SearchAutoComplete.getListSelection()>
	//*  15   35:iconst_m1       
	//*  16   36:icmpeq          50
			return a.a(view, i, keyevent);
	//   17   39:aload_0         
	//   18   40:getfield        #14  <Field SearchView a>
	//   19   43:aload_1         
	//   20   44:iload_2         
	//   21   45:aload_3         
	//   22   46:invokevirtual   #39  <Method boolean SearchView.a(View, int, KeyEvent)>
	//   23   49:ireturn         
		if(!archAutoComplete.a(a.a) && keyevent.hasNoModifiers() && keyevent.getAction() == 1 && i == 66)
	//*  24   50:aload_0         
	//*  25   51:getfield        #14  <Field SearchView a>
	//*  26   54:getfield        #27  <Field SearchView$SearchAutoComplete SearchView.a>
	//*  27   57:invokestatic    #42  <Method boolean SearchView$SearchAutoComplete.a(SearchView$SearchAutoComplete)>
	//*  28   60:ifne            112
	//*  29   63:aload_3         
	//*  30   64:invokevirtual   #47  <Method boolean KeyEvent.hasNoModifiers()>
	//*  31   67:ifeq            112
	//*  32   70:aload_3         
	//*  33   71:invokevirtual   #50  <Method int KeyEvent.getAction()>
	//*  34   74:iconst_1        
	//*  35   75:icmpne          112
	//*  36   78:iload_2         
	//*  37   79:bipush          66
	//*  38   81:icmpne          112
		{
			view.cancelLongPress();
	//   39   84:aload_1         
	//   40   85:invokevirtual   #55  <Method void View.cancelLongPress()>
			a.a(0, ((String) (null)), ((Object) (a.a.getText())).toString());
	//   41   88:aload_0         
	//   42   89:getfield        #14  <Field SearchView a>
	//   43   92:iconst_0        
	//   44   93:aconst_null     
	//   45   94:aload_0         
	//   46   95:getfield        #14  <Field SearchView a>
	//   47   98:getfield        #27  <Field SearchView$SearchAutoComplete SearchView.a>
	//   48  101:invokevirtual   #59  <Method android.text.Editable SearchView$SearchAutoComplete.getText()>
	//   49  104:invokevirtual   #63  <Method String Object.toString()>
	//   50  107:invokevirtual   #66  <Method void SearchView.a(int, String, String)>
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

	final SearchView a;

	SearchView$7(SearchView searchview)
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
