// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

// Referenced classes of package android.support.v7.app:
//			AlertController

class AlertController$AlertParams$1 extends ArrayAdapter
{

	public View getView(int i, View view, ViewGroup viewgroup)
	{
		view = super.getView(i, view, viewgroup);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #31  <Method View ArrayAdapter.getView(int, View, ViewGroup)>
	//    5    7:astore_2        
		if(mCheckedItems != null && mCheckedItems[i])
	//*   6    8:aload_0         
	//*   7    9:getfield        #21  <Field AlertController$AlertParams this$0>
	//*   8   12:getfield        #35  <Field boolean[] AlertController$AlertParams.mCheckedItems>
	//*   9   15:ifnull          39
	//*  10   18:aload_0         
	//*  11   19:getfield        #21  <Field AlertController$AlertParams this$0>
	//*  12   22:getfield        #35  <Field boolean[] AlertController$AlertParams.mCheckedItems>
	//*  13   25:iload_1         
	//*  14   26:baload          
	//*  15   27:ifeq            39
			val$listView.setItemChecked(i, true);
	//   16   30:aload_0         
	//   17   31:getfield        #23  <Field AlertController$RecycleListView val$listView>
	//   18   34:iload_1         
	//   19   35:iconst_1        
	//   20   36:invokevirtual   #41  <Method void AlertController$RecycleListView.setItemChecked(int, boolean)>
		return view;
	//   21   39:aload_2         
	//   22   40:areturn         
	}

	final AlertController.AlertParams this$0;
	final w val$listView;

	AlertController$AlertParams$1(int i, int j, CharSequence acharsequence[], w w)
	{
		this$0 = final_alertparams;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AlertController$AlertParams this$0>
		val$listView = w;
	//    3    5:aload_0         
	//    4    6:aload           6
	//    5    8:putfield        #23  <Field AlertController$RecycleListView val$listView>
		super(Context.this, i, j, ((Object []) (acharsequence)));
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:iload_3         
	//    9   14:iload           4
	//   10   16:aload           5
	//   11   18:invokespecial   #26  <Method void ArrayAdapter(Context, int, int, Object[])>
	//   12   21:return          
	}
}
