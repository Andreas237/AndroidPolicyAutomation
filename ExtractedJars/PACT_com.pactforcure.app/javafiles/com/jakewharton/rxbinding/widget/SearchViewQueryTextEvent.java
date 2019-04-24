// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.SearchView;
import com.jakewharton.rxbinding.view.ViewEvent;

public final class SearchViewQueryTextEvent extends ViewEvent
{

	private SearchViewQueryTextEvent(SearchView searchview, CharSequence charsequence, boolean flag)
	{
		super(((android.view.View) (searchview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void ViewEvent(android.view.View)>
		queryText = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field CharSequence queryText>
		submitted = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #19  <Field boolean submitted>
	//    9   15:return          
	}

	public static SearchViewQueryTextEvent create(SearchView searchview, CharSequence charsequence, boolean flag)
	{
		return new SearchViewQueryTextEvent(searchview, charsequence, flag);
	//    0    0:new             #2   <Class SearchViewQueryTextEvent>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #26  <Method void SearchViewQueryTextEvent(SearchView, CharSequence, boolean)>
	//    6   10:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(!(obj instanceof SearchViewQueryTextEvent))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class SearchViewQueryTextEvent>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((SearchViewQueryTextEvent)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class SearchViewQueryTextEvent>
	//   12   20:astore_1        
			if(((SearchViewQueryTextEvent) (obj)).view() != view() || !((Object) (((SearchViewQueryTextEvent) (obj)).queryText)).equals(((Object) (queryText))) || ((SearchViewQueryTextEvent) (obj)).submitted != submitted)
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #33  <Method android.view.View view()>
	//*  15   25:aload_0         
	//*  16   26:invokevirtual   #33  <Method android.view.View view()>
	//*  17   29:if_acmpne       57
	//*  18   32:aload_1         
	//*  19   33:getfield        #17  <Field CharSequence queryText>
	//*  20   36:aload_0         
	//*  21   37:getfield        #17  <Field CharSequence queryText>
	//*  22   40:invokevirtual   #37  <Method boolean Object.equals(Object)>
	//*  23   43:ifeq            57
	//*  24   46:aload_1         
	//*  25   47:getfield        #19  <Field boolean submitted>
	//*  26   50:aload_0         
	//*  27   51:getfield        #19  <Field boolean submitted>
	//*  28   54:icmpeq          5
				return false;
	//   29   57:iconst_0        
	//   30   58:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		int j = ((Object) ((SearchView)view())).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method android.view.View view()>
	//    2    4:checkcast       #41  <Class SearchView>
	//    3    7:invokevirtual   #43  <Method int Object.hashCode()>
	//    4   10:istore_2        
		int k = ((Object) (queryText)).hashCode();
	//    5   11:aload_0         
	//    6   12:getfield        #17  <Field CharSequence queryText>
	//    7   15:invokevirtual   #43  <Method int Object.hashCode()>
	//    8   18:istore_3        
		int i;
		if(submitted)
	//*   9   19:aload_0         
	//*  10   20:getfield        #19  <Field boolean submitted>
	//*  11   23:ifeq            44
			i = 1;
	//   12   26:iconst_1        
	//   13   27:istore_1        
		else
	//*  14   28:iload_2         
	//*  15   29:sipush          629
	//*  16   32:iadd            
	//*  17   33:bipush          37
	//*  18   35:imul            
	//*  19   36:iload_3         
	//*  20   37:iadd            
	//*  21   38:bipush          37
	//*  22   40:imul            
	//*  23   41:iload_1         
	//*  24   42:iadd            
	//*  25   43:ireturn         
			i = 0;
	//   26   44:iconst_0        
	//   27   45:istore_1        
		return ((j + 629) * 37 + k) * 37 + i;
	//*  28   46:goto            28
	}

	public boolean isSubmitted()
	{
		return submitted;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean submitted>
	//    2    4:ireturn         
	}

	public CharSequence queryText()
	{
		return queryText;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CharSequence queryText>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("TextViewEditorActionEvent{view=").append(((Object) (view()))).append(", queryText=").append(((Object) (queryText))).append(", submitted=").append(submitted).append('}').toString();
	//    0    0:new             #50  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:ldc1            #55  <String "TextViewEditorActionEvent{view=">
	//    4    9:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #33  <Method android.view.View view()>
	//    7   16:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//    8   19:ldc1            #64  <String ", queryText=">
	//    9   21:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #17  <Field CharSequence queryText>
	//   12   28:invokevirtual   #62  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:ldc1            #66  <String ", submitted=">
	//   14   33:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #19  <Field boolean submitted>
	//   17   40:invokevirtual   #69  <Method StringBuilder StringBuilder.append(boolean)>
	//   18   43:bipush          125
	//   19   45:invokevirtual   #72  <Method StringBuilder StringBuilder.append(char)>
	//   20   48:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   21   51:areturn         
	}

	private final CharSequence queryText;
	private final boolean submitted;
}
