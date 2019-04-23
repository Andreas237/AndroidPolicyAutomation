// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.recyclerview.extensions;

import java.util.List;

// Referenced classes of package android.support.v7.recyclerview.extensions:
//			AsyncListDiffer, AsyncDifferConfig

class AsyncListDiffer$1$1 extends android.support.v7.util.DiffUtil.Callback
{

	public boolean areContentsTheSame(int i, int j)
	{
		Object obj = val$oldList.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
	//    2    4:getfield        #22  <Field List AsyncListDiffer$1.val$oldList>
	//    3    7:iload_1         
	//    4    8:invokeinterface #28  <Method Object List.get(int)>
	//    5   13:astore_3        
		Object obj1 = val$newList.get(j);
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
		Object obj = val$oldList.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
	//    2    4:getfield        #22  <Field List AsyncListDiffer$1.val$oldList>
	//    3    7:iload_1         
	//    4    8:invokeinterface #28  <Method Object List.get(int)>
	//    5   13:astore_3        
		Object obj1 = val$newList.get(j);
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
		Object obj = val$oldList.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
	//    2    4:getfield        #22  <Field List AsyncListDiffer$1.val$oldList>
	//    3    7:iload_1         
	//    4    8:invokeinterface #28  <Method Object List.get(int)>
	//    5   13:astore_3        
		Object obj1 = val$newList.get(j);
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
		return val$newList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
	//    2    4:getfield        #31  <Field List AsyncListDiffer$1.val$newList>
	//    3    7:invokeinterface #68  <Method int List.size()>
	//    4   12:ireturn         
	}

	public int getOldListSize()
	{
		return val$oldList.size();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field AsyncListDiffer$1 this$1>
	//    2    4:getfield        #22  <Field List AsyncListDiffer$1.val$oldList>
	//    3    7:invokeinterface #68  <Method int List.size()>
	//    4   12:ireturn         
	}

	final AsyncListDiffer._cls1 this$1;

	AsyncListDiffer$1$1()
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
