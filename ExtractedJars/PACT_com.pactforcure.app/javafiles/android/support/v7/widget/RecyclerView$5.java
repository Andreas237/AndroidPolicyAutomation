// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class RecyclerView$5
	implements lback
{

	public void addView(View view, int i)
	{
		RecyclerView.this.addView(view, i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #24  <Method void RecyclerView.addView(View, int)>
		dispatchChildAttached(view);
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field RecyclerView this$0>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #28  <Method void RecyclerView.dispatchChildAttached(View)>
	//    9   17:return          
	}

	public void attachViewToParent(View view, int i, android.view.tParams tparams)
	{
		ewHolder ewholder = RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #34  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore          4
		if(ewholder != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          70
		{
			if(!ewholder.isTmpDetached() && !ewholder.shouldIgnore())
	//*   5   11:aload           4
	//*   6   13:invokevirtual   #40  <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*   7   16:ifne            65
	//*   8   19:aload           4
	//*   9   21:invokevirtual   #43  <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  10   24:ifne            65
				throw new IllegalArgumentException((new StringBuilder()).append("Called attach on a child which is not detached: ").append(((Object) (ewholder))).append(exceptionLabel()).toString());
	//   11   27:new             #45  <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #47  <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #48  <Method void StringBuilder()>
	//   16   38:ldc1            #50  <String "Called attach on a child which is not detached: ">
	//   17   40:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload           4
	//   19   45:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   20   48:aload_0         
	//   21   49:getfield        #17  <Field RecyclerView this$0>
	//   22   52:invokevirtual   #61  <Method String RecyclerView.exceptionLabel()>
	//   23   55:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   24   58:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   25   61:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//   26   64:athrow          
			ewholder.clearTmpDetachFlag();
	//   27   65:aload           4
	//   28   67:invokevirtual   #70  <Method void RecyclerView$ViewHolder.clearTmpDetachFlag()>
		}
		RecyclerView.access$000(RecyclerView.this, view, i, tparams);
	//   29   70:aload_0         
	//   30   71:getfield        #17  <Field RecyclerView this$0>
	//   31   74:aload_1         
	//   32   75:iload_2         
	//   33   76:aload_3         
	//   34   77:invokestatic    #74  <Method void RecyclerView.access$000(RecyclerView, View, int, android.view.ViewGroup$LayoutParams)>
	//   35   80:return          
	}

	public void detachViewFromParent(int i)
	{
		Object obj = ((Object) (getChildAt(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #80  <Method View getChildAt(int)>
	//    3    5:astore_2        
		if(obj != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          77
		{
			obj = ((Object) (RecyclerView.getChildViewHolderInt(((View) (obj)))));
	//    6   10:aload_2         
	//    7   11:invokestatic    #34  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    8   14:astore_2        
			if(obj != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          77
			{
				if(((ewHolder) (obj)).isTmpDetached() && !((ewHolder) (obj)).shouldIgnore())
	//*  11   19:aload_2         
	//*  12   20:invokevirtual   #40  <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  13   23:ifeq            70
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #43  <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  16   30:ifne            70
					throw new IllegalArgumentException((new StringBuilder()).append("called detach on an already detached child ").append(obj).append(exceptionLabel()).toString());
	//   17   33:new             #45  <Class IllegalArgumentException>
	//   18   36:dup             
	//   19   37:new             #47  <Class StringBuilder>
	//   20   40:dup             
	//   21   41:invokespecial   #48  <Method void StringBuilder()>
	//   22   44:ldc1            #82  <String "called detach on an already detached child ">
	//   23   46:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:aload_2         
	//   25   50:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   26   53:aload_0         
	//   27   54:getfield        #17  <Field RecyclerView this$0>
	//   28   57:invokevirtual   #61  <Method String RecyclerView.exceptionLabel()>
	//   29   60:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   30   63:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   31   66:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//   32   69:athrow          
				((ewHolder) (obj)).addFlags(256);
	//   33   70:aload_2         
	//   34   71:sipush          256
	//   35   74:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
			}
		}
		RecyclerView.access$100(RecyclerView.this, i);
	//   36   77:aload_0         
	//   37   78:getfield        #17  <Field RecyclerView this$0>
	//   38   81:iload_1         
	//   39   82:invokestatic    #89  <Method void RecyclerView.access$100(RecyclerView, int)>
	//   40   85:return          
	}

	public View getChildAt(int i)
	{
		return RecyclerView.this.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #90  <Method View RecyclerView.getChildAt(int)>
	//    4    8:areturn         
	}

	public int getChildCount()
	{
		return RecyclerView.this.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:invokevirtual   #94  <Method int RecyclerView.getChildCount()>
	//    3    7:ireturn         
	}

	public ewHolder getChildViewHolder(View view)
	{
		return RecyclerView.getChildViewHolderInt(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #34  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:areturn         
	}

	public int indexOfChild(View view)
	{
		return RecyclerView.this.indexOfChild(view);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #99  <Method int RecyclerView.indexOfChild(View)>
	//    4    8:ireturn         
	}

	public void onEnteredHiddenState(View view)
	{
		view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #34  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_1        
		if(view != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			ewHolder.access._mth200(((ewHolder) (view)), RecyclerView.this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView this$0>
	//    8   14:invokestatic    #104 <Method void RecyclerView$ViewHolder.access$200(RecyclerView$ViewHolder, RecyclerView)>
	//    9   17:return          
	}

	public void onLeftHiddenState(View view)
	{
		view = ((View) (RecyclerView.getChildViewHolderInt(view)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #34  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    2    4:astore_1        
		if(view != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			ewHolder.access._mth300(((ewHolder) (view)), RecyclerView.this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView this$0>
	//    8   14:invokestatic    #108 <Method void RecyclerView$ViewHolder.access$300(RecyclerView$ViewHolder, RecyclerView)>
	//    9   17:return          
	}

	public void removeAllViews()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          37
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #80  <Method View getChildAt(int)>
	//   11   17:astore_3        
			dispatchChildDetached(view);
	//   12   18:aload_0         
	//   13   19:getfield        #17  <Field RecyclerView this$0>
	//   14   22:aload_3         
	//   15   23:invokevirtual   #113 <Method void RecyclerView.dispatchChildDetached(View)>
			view.clearAnimation();
	//   16   26:aload_3         
	//   17   27:invokevirtual   #118 <Method void View.clearAnimation()>
		}

	//   18   30:iload_1         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_1        
	//*  22   34:goto            7
		RecyclerView.this.removeAllViews();
	//   23   37:aload_0         
	//   24   38:getfield        #17  <Field RecyclerView this$0>
	//   25   41:invokevirtual   #120 <Method void RecyclerView.removeAllViews()>
	//   26   44:return          
	}

	public void removeViewAt(int i)
	{
		View view = RecyclerView.this.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #90  <Method View RecyclerView.getChildAt(int)>
	//    4    8:astore_2        
		if(view != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          25
		{
			dispatchChildDetached(view);
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field RecyclerView this$0>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #113 <Method void RecyclerView.dispatchChildDetached(View)>
			view.clearAnimation();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #118 <Method void View.clearAnimation()>
		}
		RecyclerView.this.removeViewAt(i);
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field RecyclerView this$0>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #123 <Method void RecyclerView.removeViewAt(int)>
	//   17   33:return          
	}

	final RecyclerView this$0;

	RecyclerView$5()
	{
		this$0 = RecyclerView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RecyclerView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
