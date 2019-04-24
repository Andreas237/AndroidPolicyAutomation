// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import android.support.v7.util.*;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package android.support.v7.recyclerview.extensions:
//			AsyncDifferConfig

public class AsyncListDiffer
{

	public AsyncListDiffer(ListUpdateCallback listupdatecallback, AsyncDifferConfig asyncdifferconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mReadOnlyList = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #35  <Method List Collections.emptyList()>
	//    4    8:putfield        #37  <Field List mReadOnlyList>
		mUpdateCallback = listupdatecallback;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #39  <Field ListUpdateCallback mUpdateCallback>
		mConfig = asyncdifferconfig;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #41  <Field AsyncDifferConfig mConfig>
	//   11   21:return          
	}

	public AsyncListDiffer(android.support.v7.widget.RecyclerView.Adapter adapter, android.support.v7.util.DiffUtil.ItemCallback itemcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		mReadOnlyList = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #35  <Method List Collections.emptyList()>
	//    4    8:putfield        #37  <Field List mReadOnlyList>
		mUpdateCallback = ((ListUpdateCallback) (new AdapterListUpdateCallback(adapter)));
	//    5   11:aload_0         
	//    6   12:new             #48  <Class AdapterListUpdateCallback>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #51  <Method void AdapterListUpdateCallback(android.support.v7.widget.RecyclerView$Adapter)>
	//   10   20:putfield        #39  <Field ListUpdateCallback mUpdateCallback>
		mConfig = (new AsyncDifferConfig.Builder(itemcallback)).build();
	//   11   23:aload_0         
	//   12   24:new             #53  <Class AsyncDifferConfig$Builder>
	//   13   27:dup             
	//   14   28:aload_2         
	//   15   29:invokespecial   #56  <Method void AsyncDifferConfig$Builder(android.support.v7.util.DiffUtil$ItemCallback)>
	//   16   32:invokevirtual   #60  <Method AsyncDifferConfig AsyncDifferConfig$Builder.build()>
	//   17   35:putfield        #41  <Field AsyncDifferConfig mConfig>
	//   18   38:return          
	}

	private void latchList(List list, android.support.v7.util.DiffUtil.DiffResult diffresult)
	{
		mList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field List mList>
		mReadOnlyList = Collections.unmodifiableList(list);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #79  <Method List Collections.unmodifiableList(List)>
	//    6   10:putfield        #37  <Field List mReadOnlyList>
		diffresult.dispatchUpdatesTo(mUpdateCallback);
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field ListUpdateCallback mUpdateCallback>
	//   10   18:invokevirtual   #85  <Method void android.support.v7.util.DiffUtil$DiffResult.dispatchUpdatesTo(ListUpdateCallback)>
	//   11   21:return          
	}

	public List getCurrentList()
	{
		return mReadOnlyList;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field List mReadOnlyList>
	//    2    4:areturn         
	}

	public void submitList(final List newList)
	{
		if(newList == mList)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #75  <Field List mList>
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		final int runGeneration = mMaxScheduledGeneration + 1;
	//    5    9:aload_0         
	//    6   10:getfield        #67  <Field int mMaxScheduledGeneration>
	//    7   13:iconst_1        
	//    8   14:iadd            
	//    9   15:istore_2        
		mMaxScheduledGeneration = runGeneration;
	//   10   16:aload_0         
	//   11   17:iload_2         
	//   12   18:putfield        #67  <Field int mMaxScheduledGeneration>
		if(newList == null)
	//*  13   21:aload_1         
	//*  14   22:ifnonnull       59
		{
			runGeneration = mList.size();
	//   15   25:aload_0         
	//   16   26:getfield        #75  <Field List mList>
	//   17   29:invokeinterface #97  <Method int List.size()>
	//   18   34:istore_2        
			mList = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #75  <Field List mList>
			mReadOnlyList = Collections.emptyList();
	//   22   40:aload_0         
	//   23   41:invokestatic    #35  <Method List Collections.emptyList()>
	//   24   44:putfield        #37  <Field List mReadOnlyList>
			mUpdateCallback.onRemoved(0, runGeneration);
	//   25   47:aload_0         
	//   26   48:getfield        #39  <Field ListUpdateCallback mUpdateCallback>
	//   27   51:iconst_0        
	//   28   52:iload_2         
	//   29   53:invokeinterface #103 <Method void ListUpdateCallback.onRemoved(int, int)>
			return;
	//   30   58:return          
		}
		if(mList == null)
	//*  31   59:aload_0         
	//*  32   60:getfield        #75  <Field List mList>
	//*  33   63:ifnonnull       96
		{
			mList = newList;
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:putfield        #75  <Field List mList>
			mReadOnlyList = Collections.unmodifiableList(newList);
	//   37   71:aload_0         
	//   38   72:aload_1         
	//   39   73:invokestatic    #79  <Method List Collections.unmodifiableList(List)>
	//   40   76:putfield        #37  <Field List mReadOnlyList>
			mUpdateCallback.onInserted(0, newList.size());
	//   41   79:aload_0         
	//   42   80:getfield        #39  <Field ListUpdateCallback mUpdateCallback>
	//   43   83:iconst_0        
	//   44   84:aload_1         
	//   45   85:invokeinterface #97  <Method int List.size()>
	//   46   90:invokeinterface #106 <Method void ListUpdateCallback.onInserted(int, int)>
			return;
	//   47   95:return          
		} else
		{
			final List oldList = mList;
	//   48   96:aload_0         
	//   49   97:getfield        #75  <Field List mList>
	//   50  100:astore_3        
			mConfig.getBackgroundThreadExecutor().execute(new Runnable() {

				public void run()
				{
					android.support.v7.util.DiffUtil.DiffResult diffresult = DiffUtil.calculateDiff(((android.support.v7.util.DiffUtil.Callback) (new android.support.v7.util.DiffUtil.Callback() {

						public boolean areContentsTheSame(int i, int j)
						{
							return mConfig.getDiffCallback().areContentsTheSame(oldList.get(i), newList.get(j));
						//    0    0:aload_0         
						//    1    1:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//    2    4:getfield        #24  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
						//    3    7:invokestatic    #30  <Method AsyncDifferConfig AsyncListDiffer.access$000(AsyncListDiffer)>
						//    4   10:invokevirtual   #36  <Method android.support.v7.util.DiffUtil$ItemCallback AsyncDifferConfig.getDiffCallback()>
						//    5   13:aload_0         
						//    6   14:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//    7   17:getfield        #40  <Field List AsyncListDiffer$1.val$oldList>
						//    8   20:iload_1         
						//    9   21:invokeinterface #46  <Method Object List.get(int)>
						//   10   26:aload_0         
						//   11   27:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//   12   30:getfield        #49  <Field List AsyncListDiffer$1.val$newList>
						//   13   33:iload_2         
						//   14   34:invokeinterface #46  <Method Object List.get(int)>
						//   15   39:invokevirtual   #54  <Method boolean android.support.v7.util.DiffUtil$ItemCallback.areContentsTheSame(Object, Object)>
						//   16   42:ireturn         
						}

						public boolean areItemsTheSame(int i, int j)
						{
							return mConfig.getDiffCallback().areItemsTheSame(oldList.get(i), newList.get(j));
						//    0    0:aload_0         
						//    1    1:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//    2    4:getfield        #24  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
						//    3    7:invokestatic    #30  <Method AsyncDifferConfig AsyncListDiffer.access$000(AsyncListDiffer)>
						//    4   10:invokevirtual   #36  <Method android.support.v7.util.DiffUtil$ItemCallback AsyncDifferConfig.getDiffCallback()>
						//    5   13:aload_0         
						//    6   14:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//    7   17:getfield        #40  <Field List AsyncListDiffer$1.val$oldList>
						//    8   20:iload_1         
						//    9   21:invokeinterface #46  <Method Object List.get(int)>
						//   10   26:aload_0         
						//   11   27:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//   12   30:getfield        #49  <Field List AsyncListDiffer$1.val$newList>
						//   13   33:iload_2         
						//   14   34:invokeinterface #46  <Method Object List.get(int)>
						//   15   39:invokevirtual   #57  <Method boolean android.support.v7.util.DiffUtil$ItemCallback.areItemsTheSame(Object, Object)>
						//   16   42:ireturn         
						}

						public Object getChangePayload(int i, int j)
						{
							return mConfig.getDiffCallback().getChangePayload(oldList.get(i), newList.get(j));
						//    0    0:aload_0         
						//    1    1:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//    2    4:getfield        #24  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
						//    3    7:invokestatic    #30  <Method AsyncDifferConfig AsyncListDiffer.access$000(AsyncListDiffer)>
						//    4   10:invokevirtual   #36  <Method android.support.v7.util.DiffUtil$ItemCallback AsyncDifferConfig.getDiffCallback()>
						//    5   13:aload_0         
						//    6   14:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//    7   17:getfield        #40  <Field List AsyncListDiffer$1.val$oldList>
						//    8   20:iload_1         
						//    9   21:invokeinterface #46  <Method Object List.get(int)>
						//   10   26:aload_0         
						//   11   27:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//   12   30:getfield        #49  <Field List AsyncListDiffer$1.val$newList>
						//   13   33:iload_2         
						//   14   34:invokeinterface #46  <Method Object List.get(int)>
						//   15   39:invokevirtual   #63  <Method Object android.support.v7.util.DiffUtil$ItemCallback.getChangePayload(Object, Object)>
						//   16   42:areturn         
						}

						public int getNewListSize()
						{
							return newList.size();
						//    0    0:aload_0         
						//    1    1:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//    2    4:getfield        #49  <Field List AsyncListDiffer$1.val$newList>
						//    3    7:invokeinterface #69  <Method int List.size()>
						//    4   12:ireturn         
						}

						public int getOldListSize()
						{
							return oldList.size();
						//    0    0:aload_0         
						//    1    1:getfield        #15  <Field AsyncListDiffer$1 this$1>
						//    2    4:getfield        #40  <Field List AsyncListDiffer$1.val$oldList>
						//    3    7:invokeinterface #69  <Method int List.size()>
						//    4   12:ireturn         
						}

						final _cls1 this$1;

			
			{
				this$1 = _cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AsyncListDiffer$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void android.support.v7.util.DiffUtil$Callback()>
			//    5    9:return          
			}
					}
)));
				//    0    0:new             #13  <Class AsyncListDiffer$1$1>
				//    1    3:dup             
				//    2    4:aload_0         
				//    3    5:invokespecial   #40  <Method void AsyncListDiffer$1$1(AsyncListDiffer$1)>
				//    4    8:invokestatic    #46  <Method android.support.v7.util.DiffUtil$DiffResult DiffUtil.calculateDiff(android.support.v7.util.DiffUtil$Callback)>
				//    5   11:astore_1        
					mConfig.getMainThreadExecutor().execute(((_cls2) (diffresult)). new Runnable() {

						public void run()
						{
							if(mMaxScheduledGeneration == runGeneration)
						//*   0    0:aload_0         
						//*   1    1:getfield        #19  <Field AsyncListDiffer$1 this$1>
						//*   2    4:getfield        #28  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
						//*   3    7:invokestatic    #34  <Method int AsyncListDiffer.access$100(AsyncListDiffer)>
						//*   4   10:aload_0         
						//*   5   11:getfield        #19  <Field AsyncListDiffer$1 this$1>
						//*   6   14:getfield        #38  <Field int AsyncListDiffer$1.val$runGeneration>
						//*   7   17:icmpne          41
								latchList(newList, result);
						//    8   20:aload_0         
						//    9   21:getfield        #19  <Field AsyncListDiffer$1 this$1>
						//   10   24:getfield        #28  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
						//   11   27:aload_0         
						//   12   28:getfield        #19  <Field AsyncListDiffer$1 this$1>
						//   13   31:getfield        #42  <Field List AsyncListDiffer$1.val$newList>
						//   14   34:aload_0         
						//   15   35:getfield        #21  <Field android.support.v7.util.DiffUtil$DiffResult val$result>
						//   16   38:invokestatic    #46  <Method void AsyncListDiffer.access$200(AsyncListDiffer, List, android.support.v7.util.DiffUtil$DiffResult)>
						//   17   41:return          
						}

						final _cls1 this$1;
						final android.support.v7.util.DiffUtil.DiffResult val$result;

			
			{
				this$1 = final__pcls1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AsyncListDiffer$1 this$1>
				result = android.support.v7.util.DiffUtil.DiffResult.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field android.support.v7.util.DiffUtil$DiffResult val$result>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
					}
);
				//    6   12:aload_0         
				//    7   13:getfield        #26  <Field AsyncListDiffer this$0>
				//    8   16:invokestatic    #50  <Method AsyncDifferConfig AsyncListDiffer.access$000(AsyncListDiffer)>
				//    9   19:invokevirtual   #56  <Method Executor AsyncDifferConfig.getMainThreadExecutor()>
				//   10   22:new             #15  <Class AsyncListDiffer$1$2>
				//   11   25:dup             
				//   12   26:aload_0         
				//   13   27:aload_1         
				//   14   28:invokespecial   #59  <Method void AsyncListDiffer$1$2(AsyncListDiffer$1, android.support.v7.util.DiffUtil$DiffResult)>
				//   15   31:invokeinterface #65  <Method void Executor.execute(Runnable)>
				//   16   36:return          
				}

				final AsyncListDiffer this$0;
				final List val$newList;
				final List val$oldList;
				final int val$runGeneration;

			
			{
				this$0 = AsyncListDiffer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field AsyncListDiffer this$0>
				oldList = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field List val$oldList>
				newList = list1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field List val$newList>
				runGeneration = i;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #32  <Field int val$runGeneration>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #35  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   51  101:aload_0         
	//   52  102:getfield        #41  <Field AsyncDifferConfig mConfig>
	//   53  105:invokevirtual   #112 <Method Executor AsyncDifferConfig.getBackgroundThreadExecutor()>
	//   54  108:new             #7   <Class AsyncListDiffer$1>
	//   55  111:dup             
	//   56  112:aload_0         
	//   57  113:aload_3         
	//   58  114:aload_1         
	//   59  115:iload_2         
	//   60  116:invokespecial   #115 <Method void AsyncListDiffer$1(AsyncListDiffer, List, List, int)>
	//   61  119:invokeinterface #121 <Method void Executor.execute(Runnable)>
			return;
	//   62  124:return          
		}
	}

	private final AsyncDifferConfig mConfig;
	private List mList;
	private int mMaxScheduledGeneration;
	private List mReadOnlyList;
	private final ListUpdateCallback mUpdateCallback;


/*
	static AsyncDifferConfig access$000(AsyncListDiffer asynclistdiffer)
	{
		return asynclistdiffer.mConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AsyncDifferConfig mConfig>
	//    2    4:areturn         
	}

*/


/*
	static int access$100(AsyncListDiffer asynclistdiffer)
	{
		return asynclistdiffer.mMaxScheduledGeneration;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int mMaxScheduledGeneration>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(AsyncListDiffer asynclistdiffer, List list, android.support.v7.util.DiffUtil.DiffResult diffresult)
	{
		asynclistdiffer.latchList(list, diffresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #73  <Method void latchList(List, android.support.v7.util.DiffUtil$DiffResult)>
		return;
	//    4    6:return          
	}

*/
}
