// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.ObservableList;

// Referenced classes of package android.databinding.adapters:
//			ObservableListAdapter

class ObservableListAdapter$1 extends android.databinding.ngedCallback
{

	public void onChanged(ObservableList observablelist)
	{
		notifyDataSetChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
	//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
	//    3    7:return          
	}

	public void onItemRangeChanged(ObservableList observablelist, int i, int j)
	{
		notifyDataSetChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
	//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
	//    3    7:return          
	}

	public void onItemRangeInserted(ObservableList observablelist, int i, int j)
	{
		notifyDataSetChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
	//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
	//    3    7:return          
	}

	public void onItemRangeMoved(ObservableList observablelist, int i, int j, int k)
	{
		notifyDataSetChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
	//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
	//    3    7:return          
	}

	public void onItemRangeRemoved(ObservableList observablelist, int i, int j)
	{
		notifyDataSetChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ObservableListAdapter this$0>
	//    2    4:invokevirtual   #24  <Method void ObservableListAdapter.notifyDataSetChanged()>
	//    3    7:return          
	}

	final ObservableListAdapter this$0;

	ObservableListAdapter$1()
	{
		this$0 = ObservableListAdapter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ObservableListAdapter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void android.databinding.ObservableList$OnListChangedCallback()>
	//    5    9:return          
	}
}
