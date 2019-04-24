// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.widget.av;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;

// Referenced classes of package android.support.v7.view.menu:
//			p, h, j

public final class ExpandedMenuView extends ListView
	implements h.b, p, android.widget.AdapterView.OnItemClickListener
{

	public ExpandedMenuView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0x1010074);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #26  <Int 0x1010074>
	//    4    5:invokespecial   #29  <Method void ExpandedMenuView(Context, AttributeSet, int)>
	//    5    8:return          
	}

	public ExpandedMenuView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void ListView(Context, AttributeSet)>
		setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #35  <Method void setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		context = ((Context) (av.a(context, attributeset, a, i, 0)));
	//    7   11:aload_1         
	//    8   12:aload_2         
	//    9   13:getstatic       #22  <Field int[] a>
	//   10   16:iload_3         
	//   11   17:iconst_0        
	//   12   18:invokestatic    #40  <Method av av.a(Context, AttributeSet, int[], int, int)>
	//   13   21:astore_1        
		if(((av) (context)).g(0))
	//*  14   22:aload_1         
	//*  15   23:iconst_0        
	//*  16   24:invokevirtual   #44  <Method boolean av.g(int)>
	//*  17   27:ifeq            39
			setBackgroundDrawable(((av) (context)).a(0));
	//   18   30:aload_0         
	//   19   31:aload_1         
	//   20   32:iconst_0        
	//   21   33:invokevirtual   #47  <Method android.graphics.drawable.Drawable av.a(int)>
	//   22   36:invokevirtual   #51  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
		if(((av) (context)).g(1))
	//*  23   39:aload_1         
	//*  24   40:iconst_1        
	//*  25   41:invokevirtual   #44  <Method boolean av.g(int)>
	//*  26   44:ifeq            56
			setDivider(((av) (context)).a(1));
	//   27   47:aload_0         
	//   28   48:aload_1         
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #47  <Method android.graphics.drawable.Drawable av.a(int)>
	//   31   53:invokevirtual   #54  <Method void setDivider(android.graphics.drawable.Drawable)>
		((av) (context)).a();
	//   32   56:aload_1         
	//   33   57:invokevirtual   #56  <Method void av.a()>
	//   34   60:return          
	}

	public void a(h h1)
	{
		b = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field h b>
	//    3    5:return          
	}

	public boolean a(j j1)
	{
		return b.a(((android.view.MenuItem) (j1)), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field h b>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #65  <Method boolean h.a(android.view.MenuItem, int)>
	//    5    9:ireturn         
	}

	public int getWindowAnimations()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int c>
	//    2    4:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void ListView.onDetachedFromWindow()>
		setChildrenDrawingCacheEnabled(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #76  <Method void setChildrenDrawingCacheEnabled(boolean)>
	//    5    9:return          
	}

	public void onItemClick(AdapterView adapterview, View view, int i, long l)
	{
		a((j)getAdapter().getItem(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #82  <Method ListAdapter getAdapter()>
	//    3    5:iload_3         
	//    4    6:invokeinterface #88  <Method Object ListAdapter.getItem(int)>
	//    5   11:checkcast       #90  <Class j>
	//    6   14:invokevirtual   #92  <Method boolean a(j)>
	//    7   17:pop             
	//    8   18:return          
	}

	private static final int a[] = {
		0x10100d4, 0x1010129
	};
	private h b;
	private int c;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #19  <Int 0x10100d4>
	//    5    7:iastore         
	//    6    8:dup             
	//    7    9:iconst_1        
	//    8   10:ldc1            #20  <Int 0x1010129>
	//    9   12:iastore         
	//   10   13:putstatic       #22  <Field int[] a>
	//*  11   16:return          
	}
}
