// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import android.support.v7.util.AdapterListUpdateCallback;
import java.util.List;

// Referenced classes of package android.support.v7.recyclerview.extensions:
//			AsyncListDiffer, AsyncDifferConfig

public abstract class ListAdapter extends android.support.v7.widget.RecyclerView.Adapter
{

	protected ListAdapter(AsyncDifferConfig asyncdifferconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		mHelper = new AsyncListDiffer(((android.support.v7.util.ListUpdateCallback) (new AdapterListUpdateCallback(((android.support.v7.widget.RecyclerView.Adapter) (this))))), asyncdifferconfig);
	//    2    4:aload_0         
	//    3    5:new             #16  <Class AsyncListDiffer>
	//    4    8:dup             
	//    5    9:new             #18  <Class AdapterListUpdateCallback>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #21  <Method void AdapterListUpdateCallback(android.support.v7.widget.RecyclerView$Adapter)>
	//    9   17:aload_1         
	//   10   18:invokespecial   #24  <Method void AsyncListDiffer(android.support.v7.util.ListUpdateCallback, AsyncDifferConfig)>
	//   11   21:putfield        #26  <Field AsyncListDiffer mHelper>
	//   12   24:return          
	}

	protected ListAdapter(android.support.v7.util.DiffUtil.ItemCallback itemcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void android.support.v7.widget.RecyclerView$Adapter()>
		mHelper = new AsyncListDiffer(((android.support.v7.util.ListUpdateCallback) (new AdapterListUpdateCallback(((android.support.v7.widget.RecyclerView.Adapter) (this))))), (new AsyncDifferConfig.Builder(itemcallback)).build());
	//    2    4:aload_0         
	//    3    5:new             #16  <Class AsyncListDiffer>
	//    4    8:dup             
	//    5    9:new             #18  <Class AdapterListUpdateCallback>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #21  <Method void AdapterListUpdateCallback(android.support.v7.widget.RecyclerView$Adapter)>
	//    9   17:new             #33  <Class AsyncDifferConfig$Builder>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #35  <Method void AsyncDifferConfig$Builder(android.support.v7.util.DiffUtil$ItemCallback)>
	//   13   25:invokevirtual   #39  <Method AsyncDifferConfig AsyncDifferConfig$Builder.build()>
	//   14   28:invokespecial   #24  <Method void AsyncListDiffer(android.support.v7.util.ListUpdateCallback, AsyncDifferConfig)>
	//   15   31:putfield        #26  <Field AsyncListDiffer mHelper>
	//   16   34:return          
	}

	protected Object getItem(int i)
	{
		return mHelper.getCurrentList().get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AsyncListDiffer mHelper>
	//    2    4:invokevirtual   #46  <Method List AsyncListDiffer.getCurrentList()>
	//    3    7:iload_1         
	//    4    8:invokeinterface #51  <Method Object List.get(int)>
	//    5   13:areturn         
	}

	public int getItemCount()
	{
		return mHelper.getCurrentList().size();
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AsyncListDiffer mHelper>
	//    2    4:invokevirtual   #46  <Method List AsyncListDiffer.getCurrentList()>
	//    3    7:invokeinterface #57  <Method int List.size()>
	//    4   12:ireturn         
	}

	public void submitList(List list)
	{
		mHelper.submitList(list);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AsyncListDiffer mHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #62  <Method void AsyncListDiffer.submitList(List)>
	//    4    8:return          
	}

	private final AsyncListDiffer mHelper;
}
