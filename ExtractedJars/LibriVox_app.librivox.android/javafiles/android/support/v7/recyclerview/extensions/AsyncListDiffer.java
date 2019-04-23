// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import android.support.v7.util.AdapterListUpdateCallback;
import android.support.v7.util.ListUpdateCallback;
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
	//    1    1:invokespecial   #28  <Method void Object()>
		mReadOnlyList = Collections.emptyList();
	//    2    4:aload_0         
	//    3    5:invokestatic    #34  <Method List Collections.emptyList()>
	//    4    8:putfield        #36  <Field List mReadOnlyList>
		mUpdateCallback = listupdatecallback;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #38  <Field ListUpdateCallback mUpdateCallback>
		mConfig = asyncdifferconfig;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #40  <Field AsyncDifferConfig mConfig>
		if(asyncdifferconfig.getMainThreadExecutor() != null)
	//*  11   21:aload_2         
	//*  12   22:invokevirtual   #46  <Method Executor AsyncDifferConfig.getMainThreadExecutor()>
	//*  13   25:ifnull          37
		{
			mMainThreadExecutor = asyncdifferconfig.getMainThreadExecutor();
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #46  <Method Executor AsyncDifferConfig.getMainThreadExecutor()>
	//   17   33:putfield        #48  <Field Executor mMainThreadExecutor>
			return;
	//   18   36:return          
		} else
		{
			mMainThreadExecutor = sMainThreadExecutor;
	//   19   37:aload_0         
	//   20   38:getstatic       #25  <Field Executor sMainThreadExecutor>
	//   21   41:putfield        #48  <Field Executor mMainThreadExecutor>
			return;
	//   22   44:return          
		}
	}

	public AsyncListDiffer(android.support.v7.widget.RecyclerView.Adapter adapter, android.support.v7.util.DiffUtil.ItemCallback itemcallback)
	{
		this(((ListUpdateCallback) (new AdapterListUpdateCallback(adapter))), (new AsyncDifferConfig.Builder(itemcallback)).build());
	//    0    0:aload_0         
	//    1    1:new             #51  <Class AdapterListUpdateCallback>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #54  <Method void AdapterListUpdateCallback(android.support.v7.widget.RecyclerView$Adapter)>
	//    5    9:new             #56  <Class AsyncDifferConfig$Builder>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:invokespecial   #59  <Method void AsyncDifferConfig$Builder(android.support.v7.util.DiffUtil$ItemCallback)>
	//    9   17:invokevirtual   #63  <Method AsyncDifferConfig AsyncDifferConfig$Builder.build()>
	//   10   20:invokespecial   #65  <Method void AsyncListDiffer(ListUpdateCallback, AsyncDifferConfig)>
	//   11   23:return          
	}

	public List getCurrentList()
	{
		return mReadOnlyList;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field List mReadOnlyList>
	//    2    4:areturn         
	}

	void latchList(List list, android.support.v7.util.DiffUtil.DiffResult diffresult)
	{
		mList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field List mList>
		mReadOnlyList = Collections.unmodifiableList(list);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #74  <Method List Collections.unmodifiableList(List)>
	//    6   10:putfield        #36  <Field List mReadOnlyList>
		diffresult.dispatchUpdatesTo(mUpdateCallback);
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field ListUpdateCallback mUpdateCallback>
	//   10   18:invokevirtual   #80  <Method void android.support.v7.util.DiffUtil$DiffResult.dispatchUpdatesTo(ListUpdateCallback)>
	//   11   21:return          
	}

	public void submitList(final List newList)
	{
		final int runGeneration = mMaxScheduledGeneration + 1;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int mMaxScheduledGeneration>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:istore_2        
		mMaxScheduledGeneration = runGeneration;
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:putfield        #84  <Field int mMaxScheduledGeneration>
		final List oldList = mList;
	//    8   12:aload_0         
	//    9   13:getfield        #70  <Field List mList>
	//   10   16:astore_3        
		if(newList == oldList)
	//*  11   17:aload_1         
	//*  12   18:aload_3         
	//*  13   19:if_acmpne       23
			return;
	//   14   22:return          
		if(newList == null)
	//*  15   23:aload_1         
	//*  16   24:ifnonnull       58
		{
			runGeneration = oldList.size();
	//   17   27:aload_3         
	//   18   28:invokeinterface #90  <Method int List.size()>
	//   19   33:istore_2        
			mList = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #70  <Field List mList>
			mReadOnlyList = Collections.emptyList();
	//   23   39:aload_0         
	//   24   40:invokestatic    #34  <Method List Collections.emptyList()>
	//   25   43:putfield        #36  <Field List mReadOnlyList>
			mUpdateCallback.onRemoved(0, runGeneration);
	//   26   46:aload_0         
	//   27   47:getfield        #38  <Field ListUpdateCallback mUpdateCallback>
	//   28   50:iconst_0        
	//   29   51:iload_2         
	//   30   52:invokeinterface #96  <Method void ListUpdateCallback.onRemoved(int, int)>
			return;
	//   31   57:return          
		}
		if(oldList == null)
	//*  32   58:aload_3         
	//*  33   59:ifnonnull       92
		{
			mList = newList;
	//   34   62:aload_0         
	//   35   63:aload_1         
	//   36   64:putfield        #70  <Field List mList>
			mReadOnlyList = Collections.unmodifiableList(newList);
	//   37   67:aload_0         
	//   38   68:aload_1         
	//   39   69:invokestatic    #74  <Method List Collections.unmodifiableList(List)>
	//   40   72:putfield        #36  <Field List mReadOnlyList>
			mUpdateCallback.onInserted(0, newList.size());
	//   41   75:aload_0         
	//   42   76:getfield        #38  <Field ListUpdateCallback mUpdateCallback>
	//   43   79:iconst_0        
	//   44   80:aload_1         
	//   45   81:invokeinterface #90  <Method int List.size()>
	//   46   86:invokeinterface #99  <Method void ListUpdateCallback.onInserted(int, int)>
			return;
	//   47   91:return          
		} else
		{
			mConfig.getBackgroundThreadExecutor().execute(((Runnable) (new _cls1())));
	//   48   92:aload_0         
	//   49   93:getfield        #40  <Field AsyncDifferConfig mConfig>
	//   50   96:invokevirtual   #102 <Method Executor AsyncDifferConfig.getBackgroundThreadExecutor()>
	//   51   99:new             #104 <Class AsyncListDiffer$1>
	//   52  102:dup             
	//   53  103:aload_0         
	//   54  104:aload_3         
	//   55  105:aload_1         
	//   56  106:iload_2         
	//   57  107:invokespecial   #107 <Method void AsyncListDiffer$1(AsyncListDiffer, List, List, int)>
	//   58  110:invokeinterface #113 <Method void Executor.execute(Runnable)>
			return;
	//   59  115:return          
		}
	}

	private static final Executor sMainThreadExecutor = new MainThreadExecutor();
	final AsyncDifferConfig mConfig;
	private List mList;
	final Executor mMainThreadExecutor;
	int mMaxScheduledGeneration;
	private List mReadOnlyList;
	private final ListUpdateCallback mUpdateCallback;

	static 
	{
	//    0    0:new             #20  <Class AsyncListDiffer$MainThreadExecutor>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void AsyncListDiffer$MainThreadExecutor()>
	//    3    7:putstatic       #25  <Field Executor sMainThreadExecutor>
	//*   4   10:return          
	}

	private class _cls1
		implements Runnable
	{

		public void run()
		{
			class _cls1 extends android.support.v7.util.DiffUtil.Callback
			{

				public boolean areContentsTheSame(int i, int j)
				{
					Object obj = oldList.get(i);
				//    0    0:aload_0         
				//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//    2    4:getfield        #22  <Field List AsyncListDiffer$1.val$oldList>
				//    3    7:iload_1         
				//    4    8:invokeinterface #28  <Method Object List.get(int)>
				//    5   13:astore_3        
					Object obj1 = newList.get(j);
				//    6   14:aload_0         
				//    7   15:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//    8   18:getfield        #31  <Field List AsyncListDiffer$1.val$newList>
				//    9   21:iload_2         
				//   10   22:invokeinterface #28  <Method Object List.get(int)>
				//   11   27:astore          4
					if(obj != null && obj1 != null)
				//*  12   29:aload_3         
				//*  13   30:ifnull          58
				//*  14   33:aload           4
				//*  15   35:ifnull          58
						return mConfig.getDiffCallback().areContentsTheSame(obj, obj1);
				//   16   38:aload_0         
				//   17   39:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//   18   42:getfield        #35  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
				//   19   45:getfield        #41  <Field AsyncDifferConfig AsyncListDiffer.mConfig>
				//   20   48:invokevirtual   #47  <Method android.support.v7.util.DiffUtil$ItemCallback AsyncDifferConfig.getDiffCallback()>
				//   21   51:aload_3         
				//   22   52:aload           4
				//   23   54:invokevirtual   #52  <Method boolean android.support.v7.util.DiffUtil$ItemCallback.areContentsTheSame(Object, Object)>
				//   24   57:ireturn         
					if(obj == null && obj1 == null)
				//*  25   58:aload_3         
				//*  26   59:ifnonnull       69
				//*  27   62:aload           4
				//*  28   64:ifnonnull       69
						return true;
				//   29   67:iconst_1        
				//   30   68:ireturn         
					else
						throw new AssertionError();
				//   31   69:new             #54  <Class AssertionError>
				//   32   72:dup             
				//   33   73:invokespecial   #55  <Method void AssertionError()>
				//   34   76:athrow          
				}

				public boolean areItemsTheSame(int i, int j)
				{
					Object obj = oldList.get(i);
				//    0    0:aload_0         
				//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//    2    4:getfield        #22  <Field List AsyncListDiffer$1.val$oldList>
				//    3    7:iload_1         
				//    4    8:invokeinterface #28  <Method Object List.get(int)>
				//    5   13:astore_3        
					Object obj1 = newList.get(j);
				//    6   14:aload_0         
				//    7   15:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//    8   18:getfield        #31  <Field List AsyncListDiffer$1.val$newList>
				//    9   21:iload_2         
				//   10   22:invokeinterface #28  <Method Object List.get(int)>
				//   11   27:astore          4
					if(obj != null && obj1 != null)
				//*  12   29:aload_3         
				//*  13   30:ifnull          58
				//*  14   33:aload           4
				//*  15   35:ifnull          58
						return mConfig.getDiffCallback().areItemsTheSame(obj, obj1);
				//   16   38:aload_0         
				//   17   39:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//   18   42:getfield        #35  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
				//   19   45:getfield        #41  <Field AsyncDifferConfig AsyncListDiffer.mConfig>
				//   20   48:invokevirtual   #47  <Method android.support.v7.util.DiffUtil$ItemCallback AsyncDifferConfig.getDiffCallback()>
				//   21   51:aload_3         
				//   22   52:aload           4
				//   23   54:invokevirtual   #58  <Method boolean android.support.v7.util.DiffUtil$ItemCallback.areItemsTheSame(Object, Object)>
				//   24   57:ireturn         
					return obj == null && obj1 == null;
				//   25   58:aload_3         
				//   26   59:ifnonnull       69
				//   27   62:aload           4
				//   28   64:ifnonnull       69
				//   29   67:iconst_1        
				//   30   68:ireturn         
				//   31   69:iconst_0        
				//   32   70:ireturn         
				}

				public Object getChangePayload(int i, int j)
				{
					Object obj = oldList.get(i);
				//    0    0:aload_0         
				//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//    2    4:getfield        #22  <Field List AsyncListDiffer$1.val$oldList>
				//    3    7:iload_1         
				//    4    8:invokeinterface #28  <Method Object List.get(int)>
				//    5   13:astore_3        
					Object obj1 = newList.get(j);
				//    6   14:aload_0         
				//    7   15:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//    8   18:getfield        #31  <Field List AsyncListDiffer$1.val$newList>
				//    9   21:iload_2         
				//   10   22:invokeinterface #28  <Method Object List.get(int)>
				//   11   27:astore          4
					if(obj != null && obj1 != null)
				//*  12   29:aload_3         
				//*  13   30:ifnull          58
				//*  14   33:aload           4
				//*  15   35:ifnull          58
						return mConfig.getDiffCallback().getChangePayload(obj, obj1);
				//   16   38:aload_0         
				//   17   39:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//   18   42:getfield        #35  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
				//   19   45:getfield        #41  <Field AsyncDifferConfig AsyncListDiffer.mConfig>
				//   20   48:invokevirtual   #47  <Method android.support.v7.util.DiffUtil$ItemCallback AsyncDifferConfig.getDiffCallback()>
				//   21   51:aload_3         
				//   22   52:aload           4
				//   23   54:invokevirtual   #63  <Method Object android.support.v7.util.DiffUtil$ItemCallback.getChangePayload(Object, Object)>
				//   24   57:areturn         
					else
						throw new AssertionError();
				//   25   58:new             #54  <Class AssertionError>
				//   26   61:dup             
				//   27   62:invokespecial   #55  <Method void AssertionError()>
				//   28   65:athrow          
				}

				public int getNewListSize()
				{
					return newList.size();
				//    0    0:aload_0         
				//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//    2    4:getfield        #31  <Field List AsyncListDiffer$1.val$newList>
				//    3    7:invokeinterface #68  <Method int List.size()>
				//    4   12:ireturn         
				}

				public int getOldListSize()
				{
					return oldList.size();
				//    0    0:aload_0         
				//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
				//    2    4:getfield        #22  <Field List AsyncListDiffer$1.val$oldList>
				//    3    7:invokeinterface #68  <Method int List.size()>
				//    4   12:ireturn         
				}

				final _cls1 this$1;

				_cls1()
				{
					this$1 = _cls1.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #10  <Field AsyncListDiffer$1 this$1>
					super();
				//    3    5:aload_0         
				//    4    6:invokespecial   #13  <Method void android.support.v7.util.DiffUtil$Callback()>
				//    5    9:return          
				}
			}

			final android.support.v7.util.DiffUtil.DiffResult result = DiffUtil.calculateDiff(((android.support.v7.util.DiffUtil.Callback) (new _cls1())));
		//    0    0:new             #30  <Class AsyncListDiffer$1$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #33  <Method void AsyncListDiffer$1$1(AsyncListDiffer$1)>
		//    4    8:invokestatic    #39  <Method android.support.v7.util.DiffUtil$DiffResult DiffUtil.calculateDiff(android.support.v7.util.DiffUtil$Callback)>
		//    5   11:astore_1        
			class _cls2
				implements Runnable
			{

				public void run()
				{
					if(mMaxScheduledGeneration == runGeneration)
				//*   0    0:aload_0         
				//*   1    1:getfield        #14  <Field AsyncListDiffer$1 this$1>
				//*   2    4:getfield        #27  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
				//*   3    7:getfield        #33  <Field int AsyncListDiffer.mMaxScheduledGeneration>
				//*   4   10:aload_0         
				//*   5   11:getfield        #14  <Field AsyncListDiffer$1 this$1>
				//*   6   14:getfield        #36  <Field int AsyncListDiffer$1.val$runGeneration>
				//*   7   17:icmpne          41
						latchList(newList, result);
				//    8   20:aload_0         
				//    9   21:getfield        #14  <Field AsyncListDiffer$1 this$1>
				//   10   24:getfield        #27  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
				//   11   27:aload_0         
				//   12   28:getfield        #14  <Field AsyncListDiffer$1 this$1>
				//   13   31:getfield        #40  <Field List AsyncListDiffer$1.val$newList>
				//   14   34:aload_0         
				//   15   35:getfield        #16  <Field android.support.v7.util.DiffUtil$DiffResult val$result>
				//   16   38:invokevirtual   #44  <Method void AsyncListDiffer.latchList(List, android.support.v7.util.DiffUtil$DiffResult)>
				//   17   41:return          
				}

				final _cls1 this$1;
				final android.support.v7.util.DiffUtil.DiffResult val$result;

				_cls2()
				{
					this$1 = _cls1.this;
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:putfield        #14  <Field AsyncListDiffer$1 this$1>
					result = diffresult;
				//    3    5:aload_0         
				//    4    6:aload_2         
				//    5    7:putfield        #16  <Field android.support.v7.util.DiffUtil$DiffResult val$result>
					super();
				//    6   10:aload_0         
				//    7   11:invokespecial   #19  <Method void Object()>
				//    8   14:return          
				}
			}

			mMainThreadExecutor.execute(((Runnable) (new _cls2())));
		//    6   12:aload_0         
		//    7   13:getfield        #17  <Field AsyncListDiffer this$0>
		//    8   16:getfield        #45  <Field Executor AsyncListDiffer.mMainThreadExecutor>
		//    9   19:new             #47  <Class AsyncListDiffer$1$2>
		//   10   22:dup             
		//   11   23:aload_0         
		//   12   24:aload_1         
		//   13   25:invokespecial   #50  <Method void AsyncListDiffer$1$2(AsyncListDiffer$1, android.support.v7.util.DiffUtil$DiffResult)>
		//   14   28:invokeinterface #56  <Method void Executor.execute(Runnable)>
		//   15   33:return          
		}

		final AsyncListDiffer this$0;
		final List val$newList;
		final List val$oldList;
		final int val$runGeneration;

		_cls1()
		{
			this$0 = AsyncListDiffer.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field AsyncListDiffer this$0>
			oldList = list;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #19  <Field List val$oldList>
			newList = list1;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #21  <Field List val$newList>
			runGeneration = i;
		//    9   15:aload_0         
		//   10   16:iload           4
		//   11   18:putfield        #23  <Field int val$runGeneration>
			super();
		//   12   21:aload_0         
		//   13   22:invokespecial   #26  <Method void Object()>
		//   14   25:return          
		}
	}


	private class MainThreadExecutor
		implements Executor
	{

		public void execute(Runnable runnable)
		{
			mHandler.post(runnable);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Handler mHandler>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #32  <Method boolean Handler.post(Runnable)>
		//    4    8:pop             
		//    5    9:return          
		}

		final Handler mHandler = new Handler(Looper.getMainLooper());

		MainThreadExecutor()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #14  <Class Handler>
		//    4    8:dup             
		//    5    9:invokestatic    #20  <Method Looper Looper.getMainLooper()>
		//    6   12:invokespecial   #23  <Method void Handler(Looper)>
		//    7   15:putfield        #25  <Field Handler mHandler>
		//    8   18:return          
		}
	}

}
