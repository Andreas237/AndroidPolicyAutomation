// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.catalogbase.support;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.util.TypedValue;

public class GridAutofitLayoutManager extends GridLayoutManager
{

	public GridAutofitLayoutManager(Context context, int i)
	{
		super(context, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokespecial   #16  <Method void GridLayoutManager(Context, int)>
		c = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #18  <Field int c>
		d = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #20  <Field boolean d>
		e = null;
	//   10   16:aload_0         
	//   11   17:aconst_null     
	//   12   18:putfield        #22  <Field Runnable e>
		a(a(context, i));
	//   13   21:aload_0         
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:iload_2         
	//   17   25:invokespecial   #25  <Method int a(Context, int)>
	//   18   28:invokevirtual   #28  <Method void a(int)>
	//   19   31:return          
	}

	private int a(Context context, int i)
	{
		int j = i;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(i <= 0)
	//*   2    2:iload_2         
	//*   3    3:ifgt            21
			j = (int)TypedValue.applyDimension(1, 48F, context.getResources().getDisplayMetrics());
	//    4    6:iconst_1        
	//    5    7:ldc1            #30  <Float 48F>
	//    6    9:aload_1         
	//    7   10:invokevirtual   #36  <Method Resources Context.getResources()>
	//    8   13:invokevirtual   #42  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//    9   16:invokestatic    #48  <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   10   19:f2i             
	//   11   20:istore_3        
		return j;
	//   12   21:iload_3         
	//   13   22:ireturn         
	}

	public void a(int i)
	{
		if(i > 0 && i != a)
	//*   0    0:iload_1         
	//*   1    1:ifle            22
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #50  <Field int a>
	//*   5    9:icmpeq          22
		{
			a = i;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #50  <Field int a>
			d = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #20  <Field boolean d>
		}
	//   12   22:return          
	}

	public void a(Runnable runnable)
	{
		e = runnable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field Runnable e>
	//    3    5:return          
	}

	public void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state)
	{
		if(d && a > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean d>
	//*   2    4:ifeq            106
	//*   3    7:aload_0         
	//*   4    8:getfield        #50  <Field int a>
	//*   5   11:ifle            106
		{
			int i;
			if(getOrientation() == 1)
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #57  <Method int getOrientation()>
	//*   8   18:iconst_1        
	//*   9   19:icmpne          40
				i = getWidth() - getPaddingRight() - getPaddingLeft();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #60  <Method int getWidth()>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #63  <Method int getPaddingRight()>
	//   14   30:isub            
	//   15   31:aload_0         
	//   16   32:invokevirtual   #66  <Method int getPaddingLeft()>
	//   17   35:isub            
	//   18   36:istore_3        
			else
	//*  19   37:goto            55
				i = getHeight() - getPaddingTop() - getPaddingBottom();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #69  <Method int getHeight()>
	//   22   44:aload_0         
	//   23   45:invokevirtual   #72  <Method int getPaddingTop()>
	//   24   48:isub            
	//   25   49:aload_0         
	//   26   50:invokevirtual   #75  <Method int getPaddingBottom()>
	//   27   53:isub            
	//   28   54:istore_3        
			i = Math.max(1, i / a);
	//   29   55:iconst_1        
	//   30   56:iload_3         
	//   31   57:aload_0         
	//   32   58:getfield        #50  <Field int a>
	//   33   61:idiv            
	//   34   62:invokestatic    #81  <Method int Math.max(int, int)>
	//   35   65:istore_3        
			int j = getSpanCount();
	//   36   66:aload_0         
	//   37   67:invokevirtual   #84  <Method int getSpanCount()>
	//   38   70:istore          4
			setSpanCount(i);
	//   39   72:aload_0         
	//   40   73:iload_3         
	//   41   74:invokevirtual   #87  <Method void setSpanCount(int)>
			if(i != j)
	//*  42   77:iload_3         
	//*  43   78:iload           4
	//*  44   80:icmpeq          101
			{
				Runnable runnable = e;
	//   45   83:aload_0         
	//   46   84:getfield        #22  <Field Runnable e>
	//   47   87:astore          5
				if(runnable != null)
	//*  48   89:aload           5
	//*  49   91:ifnull          101
					runnable.run();
	//   50   94:aload           5
	//   51   96:invokeinterface #93  <Method void Runnable.run()>
			}
			d = false;
	//   52  101:aload_0         
	//   53  102:iconst_0        
	//   54  103:putfield        #20  <Field boolean d>
		}
		super.onLayoutChildren(recycler, state);
	//   55  106:aload_0         
	//   56  107:aload_1         
	//   57  108:aload_2         
	//   58  109:invokespecial   #95  <Method void GridLayoutManager.onLayoutChildren(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State)>
	//   59  112:return          
	}

	public void onMeasure(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state, int i, int j)
	{
		super.onMeasure(recycler, state, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #99  <Method void GridLayoutManager.onMeasure(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, int, int)>
		if(b != i || c != j)
	//*   6    9:aload_0         
	//*   7   10:getfield        #101 <Field int b>
	//*   8   13:iload_3         
	//*   9   14:icmpne          26
	//*  10   17:aload_0         
	//*  11   18:getfield        #18  <Field int c>
	//*  12   21:iload           4
	//*  13   23:icmpeq          42
		{
			d = true;
	//   14   26:aload_0         
	//   15   27:iconst_1        
	//   16   28:putfield        #20  <Field boolean d>
			b = i;
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:putfield        #101 <Field int b>
			c = j;
	//   20   36:aload_0         
	//   21   37:iload           4
	//   22   39:putfield        #18  <Field int c>
		}
	//   23   42:return          
	}

	private int a;
	private int b;
	private int c;
	private boolean d;
	private Runnable e;
}
