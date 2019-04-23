// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			s

public final class Snackbar$SnackbarLayout extends s
{

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #13  <Method void s.onMeasure(int, int)>
		j = getChildCount();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #17  <Method int getChildCount()>
	//    6   10:istore_2        
		int k = getMeasuredWidth();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #20  <Method int getMeasuredWidth()>
	//    9   15:istore_3        
		int l = getPaddingLeft();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #23  <Method int getPaddingLeft()>
	//   12   20:istore          4
		int i1 = getPaddingRight();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #26  <Method int getPaddingRight()>
	//   15   26:istore          5
		for(i = 0; i < j; i++)
	//*  16   28:iconst_0        
	//*  17   29:istore_1        
	//*  18   30:iload_1         
	//*  19   31:iload_2         
	//*  20   32:icmpge          88
		{
			View view = getChildAt(i);
	//   21   35:aload_0         
	//   22   36:iload_1         
	//   23   37:invokevirtual   #30  <Method View getChildAt(int)>
	//   24   40:astore          6
			if(view.getLayoutParams().width == -1)
	//*  25   42:aload           6
	//*  26   44:invokevirtual   #36  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  27   47:getfield        #42  <Field int android.view.ViewGroup$LayoutParams.width>
	//*  28   50:iconst_m1       
	//*  29   51:icmpne          81
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k - l - i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
	//   30   54:aload           6
	//   31   56:iload_3         
	//   32   57:iload           4
	//   33   59:isub            
	//   34   60:iload           5
	//   35   62:isub            
	//   36   63:ldc1            #43  <Int 0x40000000>
	//   37   65:invokestatic    #49  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   38   68:aload           6
	//   39   70:invokevirtual   #52  <Method int View.getMeasuredHeight()>
	//   40   73:ldc1            #43  <Int 0x40000000>
	//   41   75:invokestatic    #49  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   42   78:invokevirtual   #55  <Method void View.measure(int, int)>
		}

	//   43   81:iload_1         
	//   44   82:iconst_1        
	//   45   83:iadd            
	//   46   84:istore_1        
	//*  47   85:goto            30
	//   48   88:return          
	}

	public Snackbar$SnackbarLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void s(Context, AttributeSet)>
	//    4    6:return          
	}
}
