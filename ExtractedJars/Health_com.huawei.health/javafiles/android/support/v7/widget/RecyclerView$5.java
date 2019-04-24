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
	//*   4    8:ifnull          60
		{
			if(!ewholder.isTmpDetached() && !ewholder.shouldIgnore())
	//*   5   11:aload           4
	//*   6   13:invokevirtual   #40  <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*   7   16:ifne            55
	//*   8   19:aload           4
	//*   9   21:invokevirtual   #43  <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  10   24:ifne            55
				throw new IllegalArgumentException((new StringBuilder()).append("Called attach on a child which is not detached: ").append(((Object) (ewholder))).toString());
	//   11   27:new             #45  <Class IllegalArgumentException>
	//   12   30:dup             
	//   13   31:new             #47  <Class StringBuilder>
	//   14   34:dup             
	//   15   35:invokespecial   #48  <Method void StringBuilder()>
	//   16   38:ldc1            #50  <String "Called attach on a child which is not detached: ">
	//   17   40:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload           4
	//   19   45:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   20   48:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   21   51:invokespecial   #64  <Method void IllegalArgumentException(String)>
	//   22   54:athrow          
			ewholder.clearTmpDetachFlag();
	//   23   55:aload           4
	//   24   57:invokevirtual   #67  <Method void RecyclerView$ViewHolder.clearTmpDetachFlag()>
		}
		RecyclerView.access$000(RecyclerView.this, view, i, tparams);
	//   25   60:aload_0         
	//   26   61:getfield        #17  <Field RecyclerView this$0>
	//   27   64:aload_1         
	//   28   65:iload_2         
	//   29   66:aload_3         
	//   30   67:invokestatic    #71  <Method void RecyclerView.access$000(RecyclerView, View, int, android.view.ViewGroup$LayoutParams)>
	//   31   70:return          
	}

	public void detachViewFromParent(int i)
	{
		Object obj = ((Object) (getChildAt(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #77  <Method View getChildAt(int)>
	//    3    5:astore_2        
		if(obj != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          67
		{
			obj = ((Object) (RecyclerView.getChildViewHolderInt(((View) (obj)))));
	//    6   10:aload_2         
	//    7   11:invokestatic    #34  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    8   14:astore_2        
			if(obj != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          67
			{
				if(((ewHolder) (obj)).isTmpDetached() && !((ewHolder) (obj)).shouldIgnore())
	//*  11   19:aload_2         
	//*  12   20:invokevirtual   #40  <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  13   23:ifeq            60
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #43  <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  16   30:ifne            60
					throw new IllegalArgumentException((new StringBuilder()).append("called detach on an already detached child ").append(obj).toString());
	//   17   33:new             #45  <Class IllegalArgumentException>
	//   18   36:dup             
	//   19   37:new             #47  <Class StringBuilder>
	//   20   40:dup             
	//   21   41:invokespecial   #48  <Method void StringBuilder()>
	//   22   44:ldc1            #79  <String "called detach on an already detached child ">
	//   23   46:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:aload_2         
	//   25   50:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
	//   26   53:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   27   56:invokespecial   #64  <Method void IllegalArgumentException(String)>
	//   28   59:athrow          
				((ewHolder) (obj)).addFlags(256);
	//   29   60:aload_2         
	//   30   61:sipush          256
	//   31   64:invokevirtual   #82  <Method void RecyclerView$ViewHolder.addFlags(int)>
			}
		}
		RecyclerView.access$100(RecyclerView.this, i);
	//   32   67:aload_0         
	//   33   68:getfield        #17  <Field RecyclerView this$0>
	//   34   71:iload_1         
	//   35   72:invokestatic    #86  <Method void RecyclerView.access$100(RecyclerView, int)>
	//   36   75:return          
	}

	public View getChildAt(int i)
	{
		return RecyclerView.this.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #87  <Method View RecyclerView.getChildAt(int)>
	//    4    8:areturn         
	}

	public int getChildCount()
	{
		return RecyclerView.this.getChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:invokevirtual   #91  <Method int RecyclerView.getChildCount()>
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
	//    3    5:invokevirtual   #96  <Method int RecyclerView.indexOfChild(View)>
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
	//    8   14:invokestatic    #101 <Method void RecyclerView$ViewHolder.access$200(RecyclerView$ViewHolder, RecyclerView)>
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
	//    8   14:invokestatic    #105 <Method void RecyclerView$ViewHolder.access$300(RecyclerView$ViewHolder, RecyclerView)>
	//    9   17:return          
	}

	public void removeAllViews()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          31
			dispatchChildDetached(getChildAt(i));
	//    8   12:aload_0         
	//    9   13:getfield        #17  <Field RecyclerView this$0>
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokevirtual   #77  <Method View getChildAt(int)>
	//   13   21:invokevirtual   #110 <Method void RecyclerView.dispatchChildDetached(View)>

	//   14   24:iload_1         
	//   15   25:iconst_1        
	//   16   26:iadd            
	//   17   27:istore_1        
	//*  18   28:goto            7
		RecyclerView.this.removeAllViews();
	//   19   31:aload_0         
	//   20   32:getfield        #17  <Field RecyclerView this$0>
	//   21   35:invokevirtual   #112 <Method void RecyclerView.removeAllViews()>
	//   22   38:return          
	}

	public void removeViewAt(int i)
	{
		View view = RecyclerView.this.getChildAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RecyclerView this$0>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #87  <Method View RecyclerView.getChildAt(int)>
	//    4    8:astore_2        
		if(view != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          21
			dispatchChildDetached(view);
	//    7   13:aload_0         
	//    8   14:getfield        #17  <Field RecyclerView this$0>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #110 <Method void RecyclerView.dispatchChildDetached(View)>
		RecyclerView.this.removeViewAt(i);
	//   11   21:aload_0         
	//   12   22:getfield        #17  <Field RecyclerView this$0>
	//   13   25:iload_1         
	//   14   26:invokevirtual   #115 <Method void RecyclerView.removeViewAt(int)>
	//   15   29:return          
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
