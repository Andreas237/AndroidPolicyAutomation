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
	//*   4    8:ifnull          81
		{
			if(!ewholder.isTmpDetached() && !ewholder.shouldIgnore())
	//*   5   11:aload           4
	//*   6   13:invokevirtual   #40  <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*   7   16:ifne            76
	//*   8   19:aload           4
	//*   9   21:invokevirtual   #43  <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  10   24:ifeq            30
	//*  11   27:goto            76
			{
				view = ((View) (new StringBuilder()));
	//   12   30:new             #45  <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #46  <Method void StringBuilder()>
	//   15   37:astore_1        
				((StringBuilder) (view)).append("Called attach on a child which is not detached: ");
	//   16   38:aload_1         
	//   17   39:ldc1            #48  <String "Called attach on a child which is not detached: ">
	//   18   41:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
				((StringBuilder) (view)).append(((Object) (ewholder)));
	//   20   45:aload_1         
	//   21   46:aload           4
	//   22   48:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   23   51:pop             
				((StringBuilder) (view)).append(exceptionLabel());
	//   24   52:aload_1         
	//   25   53:aload_0         
	//   26   54:getfield        #17  <Field RecyclerView this$0>
	//   27   57:invokevirtual   #59  <Method String RecyclerView.exceptionLabel()>
	//   28   60:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
				throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   30   64:new             #61  <Class IllegalArgumentException>
	//   31   67:dup             
	//   32   68:aload_1         
	//   33   69:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   34   72:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//   35   75:athrow          
			}
			ewholder.clearTmpDetachFlag();
	//   36   76:aload           4
	//   37   78:invokevirtual   #70  <Method void RecyclerView$ViewHolder.clearTmpDetachFlag()>
		}
		RecyclerView.access$000(RecyclerView.this, view, i, tparams);
	//   38   81:aload_0         
	//   39   82:getfield        #17  <Field RecyclerView this$0>
	//   40   85:aload_1         
	//   41   86:iload_2         
	//   42   87:aload_3         
	//   43   88:invokestatic    #74  <Method void RecyclerView.access$000(RecyclerView, View, int, android.view.ViewGroup$LayoutParams)>
	//   44   91:return          
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
	//*   5    7:ifnull          88
		{
			obj = ((Object) (RecyclerView.getChildViewHolderInt(((View) (obj)))));
	//    6   10:aload_2         
	//    7   11:invokestatic    #34  <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(View)>
	//    8   14:astore_2        
			if(obj != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          88
			{
				if(((ewHolder) (obj)).isTmpDetached() && !((ewHolder) (obj)).shouldIgnore())
	//*  11   19:aload_2         
	//*  12   20:invokevirtual   #40  <Method boolean RecyclerView$ViewHolder.isTmpDetached()>
	//*  13   23:ifeq            81
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #43  <Method boolean RecyclerView$ViewHolder.shouldIgnore()>
	//*  16   30:ifeq            36
	//*  17   33:goto            81
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   18   36:new             #45  <Class StringBuilder>
	//   19   39:dup             
	//   20   40:invokespecial   #46  <Method void StringBuilder()>
	//   21   43:astore_3        
					stringbuilder.append("called detach on an already detached child ");
	//   22   44:aload_3         
	//   23   45:ldc1            #82  <String "called detach on an already detached child ">
	//   24   47:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
					stringbuilder.append(obj);
	//   26   51:aload_3         
	//   27   52:aload_2         
	//   28   53:invokevirtual   #55  <Method StringBuilder StringBuilder.append(Object)>
	//   29   56:pop             
					stringbuilder.append(exceptionLabel());
	//   30   57:aload_3         
	//   31   58:aload_0         
	//   32   59:getfield        #17  <Field RecyclerView this$0>
	//   33   62:invokevirtual   #59  <Method String RecyclerView.exceptionLabel()>
	//   34   65:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
					throw new IllegalArgumentException(stringbuilder.toString());
	//   36   69:new             #61  <Class IllegalArgumentException>
	//   37   72:dup             
	//   38   73:aload_3         
	//   39   74:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   40   77:invokespecial   #67  <Method void IllegalArgumentException(String)>
	//   41   80:athrow          
				}
				((ewHolder) (obj)).addFlags(256);
	//   42   81:aload_2         
	//   43   82:sipush          256
	//   44   85:invokevirtual   #85  <Method void RecyclerView$ViewHolder.addFlags(int)>
			}
		}
		RecyclerView.access$100(RecyclerView.this, i);
	//   45   88:aload_0         
	//   46   89:getfield        #17  <Field RecyclerView this$0>
	//   47   92:iload_1         
	//   48   93:invokestatic    #89  <Method void RecyclerView.access$100(RecyclerView, int)>
	//   49   96:return          
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
			((ewHolder) (view)).onEnteredHiddenState(RecyclerView.this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView this$0>
	//    8   14:invokevirtual   #102 <Method void RecyclerView$ViewHolder.onEnteredHiddenState(RecyclerView)>
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
			((ewHolder) (view)).onLeftHiddenState(RecyclerView.this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field RecyclerView this$0>
	//    8   14:invokevirtual   #105 <Method void RecyclerView$ViewHolder.onLeftHiddenState(RecyclerView)>
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
	//   15   23:invokevirtual   #110 <Method void RecyclerView.dispatchChildDetached(View)>
			view.clearAnimation();
	//   16   26:aload_3         
	//   17   27:invokevirtual   #115 <Method void View.clearAnimation()>
		}

	//   18   30:iload_1         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_1        
	//*  22   34:goto            7
		RecyclerView.this.removeAllViews();
	//   23   37:aload_0         
	//   24   38:getfield        #17  <Field RecyclerView this$0>
	//   25   41:invokevirtual   #117 <Method void RecyclerView.removeAllViews()>
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
	//   10   18:invokevirtual   #110 <Method void RecyclerView.dispatchChildDetached(View)>
			view.clearAnimation();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #115 <Method void View.clearAnimation()>
		}
		RecyclerView.this.removeViewAt(i);
	//   13   25:aload_0         
	//   14   26:getfield        #17  <Field RecyclerView this$0>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #120 <Method void RecyclerView.removeViewAt(int)>
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
