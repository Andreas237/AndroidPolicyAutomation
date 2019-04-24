// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package android.support.v4.app:
//			ListFragment

class ListFragment$2
	implements android.widget.temClickListener
{

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		onListItemClick((ListView)adapterview, view, i, l);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ListFragment this$0>
	//    2    4:aload_1         
	//    3    5:checkcast       #22  <Class ListView>
	//    4    8:aload_2         
	//    5    9:iload_3         
	//    6   10:lload           4
	//    7   12:invokevirtual   #26  <Method void ListFragment.onListItemClick(ListView, View, int, long)>
	//    8   15:return          
	}

	final ListFragment this$0;

	ListFragment$2()
	{
		this$0 = ListFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ListFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
