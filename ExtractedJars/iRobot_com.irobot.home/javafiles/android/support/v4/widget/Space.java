// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class Space extends View
{

	public Space(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #9   <Method void Space(Context, AttributeSet)>
	//    4    6:return          
	}

	public Space(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #13  <Method void Space(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public Space(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #14  <Method void View(Context, AttributeSet, int)>
		if(getVisibility() == 0)
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #18  <Method int getVisibility()>
	//*   7   11:ifne            19
			setVisibility(4);
	//    8   14:aload_0         
	//    9   15:iconst_4        
	//   10   16:invokevirtual   #22  <Method void setVisibility(int)>
	//   11   19:return          
	}

	private static int a(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #30  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
		int l = android.view.View.MeasureSpec.getSize(j);
	//    3    5:iload_1         
	//    4    6:invokestatic    #33  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_3        
		if(k != 0x80000000)
	//*   6   10:iload_2         
	//*   7   11:ldc1            #34  <Int 0x80000000>
	//*   8   13:icmpeq          32
		{
			j = i;
	//    9   16:iload_0         
	//   10   17:istore_1        
			if(k != 0)
	//*  11   18:iload_2         
	//*  12   19:ifeq            38
				if(k != 0x40000000)
	//*  13   22:iload_2         
	//*  14   23:ldc1            #35  <Int 0x40000000>
	//*  15   25:icmpeq          30
					return i;
	//   16   28:iload_0         
	//   17   29:ireturn         
				else
					return l;
	//   18   30:iload_3         
	//   19   31:ireturn         
		} else
		{
			j = Math.min(i, l);
	//   20   32:iload_0         
	//   21   33:iload_3         
	//   22   34:invokestatic    #40  <Method int Math.min(int, int)>
	//   23   37:istore_1        
		}
		return j;
	//   24   38:iload_1         
	//   25   39:ireturn         
	}

	public void draw(Canvas canvas)
	{
	//    0    0:return          
	}

	protected void onMeasure(int i, int j)
	{
		setMeasuredDimension(a(getSuggestedMinimumWidth(), i), a(getSuggestedMinimumHeight(), j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #51  <Method int getSuggestedMinimumWidth()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #53  <Method int a(int, int)>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #56  <Method int getSuggestedMinimumHeight()>
	//    7   13:iload_2         
	//    8   14:invokestatic    #53  <Method int a(int, int)>
	//    9   17:invokevirtual   #59  <Method void setMeasuredDimension(int, int)>
	//   10   20:return          
	}
}
