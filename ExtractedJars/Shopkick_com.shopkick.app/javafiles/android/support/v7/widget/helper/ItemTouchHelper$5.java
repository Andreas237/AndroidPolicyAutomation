// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.support.v7.widget.RecyclerView;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

class ItemTouchHelper$5
	implements android.support.v7.widget.DrawingOrderCallback
{

	public int onGetChildDrawingOrder(int i, int j)
	{
		if(mOverdrawChild == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field ItemTouchHelper this$0>
	//*   2    4:getfield        #26  <Field android.view.View ItemTouchHelper.mOverdrawChild>
	//*   3    7:ifnonnull       12
			return j;
	//    4   10:iload_2         
	//    5   11:ireturn         
		int l = mOverdrawChildPosition;
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field ItemTouchHelper this$0>
	//    8   16:getfield        #30  <Field int ItemTouchHelper.mOverdrawChildPosition>
	//    9   19:istore          4
		int k = l;
	//   10   21:iload           4
	//   11   23:istore_3        
		if(l == -1)
	//*  12   24:iload           4
	//*  13   26:iconst_m1       
	//*  14   27:icmpne          56
		{
			k = mRecyclerView.indexOfChild(mOverdrawChild);
	//   15   30:aload_0         
	//   16   31:getfield        #17  <Field ItemTouchHelper this$0>
	//   17   34:getfield        #34  <Field RecyclerView ItemTouchHelper.mRecyclerView>
	//   18   37:aload_0         
	//   19   38:getfield        #17  <Field ItemTouchHelper this$0>
	//   20   41:getfield        #26  <Field android.view.View ItemTouchHelper.mOverdrawChild>
	//   21   44:invokevirtual   #40  <Method int RecyclerView.indexOfChild(android.view.View)>
	//   22   47:istore_3        
			mOverdrawChildPosition = k;
	//   23   48:aload_0         
	//   24   49:getfield        #17  <Field ItemTouchHelper this$0>
	//   25   52:iload_3         
	//   26   53:putfield        #30  <Field int ItemTouchHelper.mOverdrawChildPosition>
		}
		if(j == i - 1)
	//*  27   56:iload_2         
	//*  28   57:iload_1         
	//*  29   58:iconst_1        
	//*  30   59:isub            
	//*  31   60:icmpne          65
			return k;
	//   32   63:iload_3         
	//   33   64:ireturn         
		if(j < k)
	//*  34   65:iload_2         
	//*  35   66:iload_3         
	//*  36   67:icmpge          72
			return j;
	//   37   70:iload_2         
	//   38   71:ireturn         
		else
			return j + 1;
	//   39   72:iload_2         
	//   40   73:iconst_1        
	//   41   74:iadd            
	//   42   75:ireturn         
	}

	final ItemTouchHelper this$0;

	ItemTouchHelper$5()
	{
		this$0 = ItemTouchHelper.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ItemTouchHelper this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
