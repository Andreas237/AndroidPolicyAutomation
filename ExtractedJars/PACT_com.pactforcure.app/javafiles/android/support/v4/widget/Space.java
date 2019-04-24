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

	private static int getDefaultSize2(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #30  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
		j = android.view.View.MeasureSpec.getSize(j);
	//    3    5:iload_1         
	//    4    6:invokestatic    #33  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_1        
		switch(k)
	//*   6   10:iload_2         
		{
	//*   7   11:lookupswitch    3: default 44
	//	               -2147483648: 48
	//	               0: 46
	//	               1073741824: 54
		default:
			return i;
	//    8   44:iload_0         
	//    9   45:ireturn         

		case 0: // '\0'
			return i;
	//   10   46:iload_0         
	//   11   47:ireturn         

		case -2147483648: 
			return Math.min(i, j);
	//   12   48:iload_0         
	//   13   49:iload_1         
	//   14   50:invokestatic    #38  <Method int Math.min(int, int)>
	//   15   53:ireturn         

		case 1073741824: 
			return j;
	//   16   54:iload_1         
	//   17   55:ireturn         
		}
	}

	public void draw(Canvas canvas)
	{
	//    0    0:return          
	}

	protected void onMeasure(int i, int j)
	{
		setMeasuredDimension(getDefaultSize2(getSuggestedMinimumWidth(), i), getDefaultSize2(getSuggestedMinimumHeight(), j));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #49  <Method int getSuggestedMinimumWidth()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #51  <Method int getDefaultSize2(int, int)>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #54  <Method int getSuggestedMinimumHeight()>
	//    7   13:iload_2         
	//    8   14:invokestatic    #51  <Method int getDefaultSize2(int, int)>
	//    9   17:invokevirtual   #57  <Method void setMeasuredDimension(int, int)>
	//   10   20:return          
	}
}
