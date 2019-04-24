// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import java.util.*;

// Referenced classes of package com.mixpanel.android.b:
//			o

public static class o$b extends o$d
{
	private class a
		implements TextWatcher
	{

		public void afterTextChanged(Editable editable)
		{
			a.c(b);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field o$b a>
		//    2    4:aload_0         
		//    3    5:getfield        #23  <Field View b>
		//    4    8:invokevirtual   #30  <Method void o$b.c(View)>
		//    5   11:return          
		}

		public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
		{
		//    0    0:return          
		}

		public void onTextChanged(CharSequence charsequence, int i, int j, int k)
		{
		//    0    0:return          
		}

		final o.b a;
		private final View b;

		public a(View view)
		{
			a = o.b.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field o$b a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			b = view;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field View b>
		//    8   14:return          
		}
	}


	public void a()
	{
		java.util.Entry entry;
		for(Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((TextView)entry.getKey()).removeTextChangedListener((TextWatcher)entry.getValue()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Map a>
	//*   2    4:invokeinterface #33  <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #39  <Method Iterator Set.iterator()>
	//*   4   14:astore_1        
	//*   5   15:aload_1         
	//*   6   16:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            58
			entry = (java.util.Entry)iterator.next();
	//    8   24:aload_1         
	//    9   25:invokeinterface #49  <Method Object Iterator.next()>
	//   10   30:checkcast       #51  <Class java.util.Map$Entry>
	//   11   33:astore_2        

	//   12   34:aload_2         
	//   13   35:invokeinterface #54  <Method Object java.util.Map$Entry.getKey()>
	//   14   40:checkcast       #56  <Class TextView>
	//   15   43:aload_2         
	//   16   44:invokeinterface #59  <Method Object java.util.Map$Entry.getValue()>
	//   17   49:checkcast       #61  <Class TextWatcher>
	//   18   52:invokevirtual   #65  <Method void TextView.removeTextChangedListener(TextWatcher)>
	//*  19   55:goto            15
		a.clear();
	//   20   58:aload_0         
	//   21   59:getfield        #24  <Field Map a>
	//   22   62:invokeinterface #68  <Method void Map.clear()>
	//   23   67:return          
	}

	public void a(View view)
	{
		if(view instanceof TextView)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #56  <Class TextView>
	//*   2    4:ifeq            62
		{
			view = ((View) ((TextView)view));
	//    3    7:aload_1         
	//    4    8:checkcast       #56  <Class TextView>
	//    5   11:astore_1        
			a a1 = new a(view);
	//    6   12:new             #9   <Class o$b$a>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokespecial   #72  <Method void o$b$a(o$b, View)>
	//   11   21:astore_2        
			TextWatcher textwatcher = (TextWatcher)a.get(((Object) (view)));
	//   12   22:aload_0         
	//   13   23:getfield        #24  <Field Map a>
	//   14   26:aload_1         
	//   15   27:invokeinterface #76  <Method Object Map.get(Object)>
	//   16   32:checkcast       #61  <Class TextWatcher>
	//   17   35:astore_3        
			if(textwatcher != null)
	//*  18   36:aload_3         
	//*  19   37:ifnull          45
				((TextView) (view)).removeTextChangedListener(textwatcher);
	//   20   40:aload_1         
	//   21   41:aload_3         
	//   22   42:invokevirtual   #65  <Method void TextView.removeTextChangedListener(TextWatcher)>
			((TextView) (view)).addTextChangedListener(((TextWatcher) (a1)));
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:invokevirtual   #79  <Method void TextView.addTextChangedListener(TextWatcher)>
			a.put(((Object) (view)), ((Object) (a1)));
	//   26   50:aload_0         
	//   27   51:getfield        #24  <Field Map a>
	//   28   54:aload_1         
	//   29   55:aload_2         
	//   30   56:invokeinterface #83  <Method Object Map.put(Object, Object)>
	//   31   61:pop             
		}
	//   32   62:return          
	}

	public volatile void b(View view)
	{
		super.b(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #85  <Method void o$d.b(View)>
	//    3    5:return          
	}

	private final Map a = new HashMap();

	public o$b(List list, String s, o$h o$h)
	{
		super(list, s, o$h, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_1        
	//    5    5:invokespecial   #17  <Method void o$d(List, String, o$h, boolean)>
	//    6    8:aload_0         
	//    7    9:new             #19  <Class HashMap>
	//    8   12:dup             
	//    9   13:invokespecial   #22  <Method void HashMap()>
	//   10   16:putfield        #24  <Field Map a>
	//   11   19:return          
	}
}
