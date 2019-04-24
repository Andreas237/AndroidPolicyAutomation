// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import android.support.v7.util.DiffUtil;
import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package android.support.v7.recyclerview.extensions:
//			AsyncListDiffer, AsyncDifferConfig

class AsyncListDiffer$1
	implements Runnable
{

	public void run()
	{
		final android.support.v7.util.t result = DiffUtil.calculateDiff(((android.support.v7.util.DiffUtil$Callback) (new android.support.v7.util.DiffUtil.Callback() {

			public boolean areContentsTheSame(int i, int j)
			{
				return AsyncListDiffer.access$000(this$0).getDiffCallback().areContentsTheSame(oldList.get(i), newList.get(j));
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
				return AsyncListDiffer.access$000(this$0).getDiffCallback().areItemsTheSame(oldList.get(i), newList.get(j));
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
				return AsyncListDiffer.access$000(this$0).getDiffCallback().getChangePayload(oldList.get(i), newList.get(j));
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

			final AsyncListDiffer._cls1 this$1;

			
			{
				this$1 = AsyncListDiffer._cls1.this;
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
		AsyncListDiffer.access$000(AsyncListDiffer.this).getMainThreadExecutor().execute(new Runnable() {

			public void run()
			{
				if(AsyncListDiffer.access$100(this$0) == runGeneration)
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field AsyncListDiffer$1 this$1>
			//*   2    4:getfield        #28  <Field AsyncListDiffer AsyncListDiffer$1.this$0>
			//*   3    7:invokestatic    #34  <Method int AsyncListDiffer.access$100(AsyncListDiffer)>
			//*   4   10:aload_0         
			//*   5   11:getfield        #19  <Field AsyncListDiffer$1 this$1>
			//*   6   14:getfield        #38  <Field int AsyncListDiffer$1.val$runGeneration>
			//*   7   17:icmpne          41
					AsyncListDiffer.access$200(this$0, newList, result);
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

			final AsyncListDiffer._cls1 this$1;
			final android.support.v7.util.DiffUtil.DiffResult val$result;

			
			{
				this$1 = AsyncListDiffer._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field AsyncListDiffer$1 this$1>
				result = diffresult;
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

	AsyncListDiffer$1()
	{
		this$0 = final_asynclistdiffer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field AsyncListDiffer this$0>
		val$oldList = list;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field List val$oldList>
		val$newList = list1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #30  <Field List val$newList>
		val$runGeneration = I.this;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #32  <Field int val$runGeneration>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #35  <Method void Object()>
	//   14   25:return          
	}
}
