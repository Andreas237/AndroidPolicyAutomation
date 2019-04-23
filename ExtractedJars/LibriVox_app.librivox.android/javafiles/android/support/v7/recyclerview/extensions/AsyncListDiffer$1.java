// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import android.support.v7.util.DiffUtil;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package android.support.v7.recyclerview.extensions:
//			AsyncListDiffer

class AsyncListDiffer$1
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

			final AsyncListDiffer._cls1 this$1;

			_cls1()
			{
				this$1 = AsyncListDiffer._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #10  <Field AsyncListDiffer$1 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #13  <Method void android.support.v7.util.DiffUtil$Callback()>
			//    5    9:return          
			}
		}

		final android.support.v7.util.t result = DiffUtil.calculateDiff(((android.support.v7.util.DiffUtil$Callback) (new _cls1())));
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

			final AsyncListDiffer._cls1 this$1;
			final android.support.v7.util.DiffUtil.DiffResult val$result;

			_cls2()
			{
				this$1 = AsyncListDiffer._cls1.this;
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

	AsyncListDiffer$1()
	{
		this$0 = final_asynclistdiffer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field AsyncListDiffer this$0>
		val$oldList = list;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field List val$oldList>
		val$newList = list1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field List val$newList>
		val$runGeneration = I.this;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #23  <Field int val$runGeneration>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #26  <Method void Object()>
	//   14   25:return          
	}
}
