// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			SortedList, BatchingListUpdateCallback

public static class SortedList$BatchedCallback extends SortedList.Callback
{

	public boolean areContentsTheSame(Object obj, Object obj1)
	{
		return mWrappedCallback.areContentsTheSame(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SortedList$Callback mWrappedCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #34  <Method boolean SortedList$Callback.areContentsTheSame(Object, Object)>
	//    5    9:ireturn         
	}

	public boolean areItemsTheSame(Object obj, Object obj1)
	{
		return mWrappedCallback.areItemsTheSame(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SortedList$Callback mWrappedCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #38  <Method boolean SortedList$Callback.areItemsTheSame(Object, Object)>
	//    5    9:ireturn         
	}

	public int compare(Object obj, Object obj1)
	{
		return mWrappedCallback.compare(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field SortedList$Callback mWrappedCallback>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #42  <Method int SortedList$Callback.compare(Object, Object)>
	//    5    9:ireturn         
	}

	public void dispatchLastEvent()
	{
		mBatchingListUpdateCallback.dispatchLastEvent();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
	//    2    4:invokevirtual   #46  <Method void BatchingListUpdateCallback.dispatchLastEvent()>
	//    3    7:return          
	}

	public void onChanged(int i, int j)
	{
		mBatchingListUpdateCallback.onChanged(i, j, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #51  <Method void BatchingListUpdateCallback.onChanged(int, int, Object)>
	//    6   10:return          
	}

	public void onInserted(int i, int j)
	{
		mBatchingListUpdateCallback.onInserted(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #54  <Method void BatchingListUpdateCallback.onInserted(int, int)>
	//    5    9:return          
	}

	public void onMoved(int i, int j)
	{
		mBatchingListUpdateCallback.onMoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #57  <Method void BatchingListUpdateCallback.onMoved(int, int)>
	//    5    9:return          
	}

	public void onRemoved(int i, int j)
	{
		mBatchingListUpdateCallback.onRemoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #60  <Method void BatchingListUpdateCallback.onRemoved(int, int)>
	//    5    9:return          
	}

	private final BatchingListUpdateCallback mBatchingListUpdateCallback;
	final SortedList.Callback mWrappedCallback;

	public SortedList$BatchedCallback(SortedList.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void SortedList$Callback()>
		mWrappedCallback = callback;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field SortedList$Callback mWrappedCallback>
		mBatchingListUpdateCallback = new BatchingListUpdateCallback(((ListUpdateCallback) (mWrappedCallback)));
	//    5    9:aload_0         
	//    6   10:new             #22  <Class BatchingListUpdateCallback>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #20  <Field SortedList$Callback mWrappedCallback>
	//   10   18:invokespecial   #25  <Method void BatchingListUpdateCallback(ListUpdateCallback)>
	//   11   21:putfield        #27  <Field BatchingListUpdateCallback mBatchingListUpdateCallback>
	//   12   24:return          
	}
}
