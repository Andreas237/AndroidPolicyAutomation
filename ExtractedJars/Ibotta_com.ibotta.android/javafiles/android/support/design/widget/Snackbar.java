// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

public final class Snackbar extends BaseTransientBottomBar
{
	public static interface Duration
		extends Annotation
	{
	}

	public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout
	{

		protected void onMeasure(int i, int j)
		{
			super.onMeasure(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #20  <Method void BaseTransientBottomBar$SnackbarBaseLayout.onMeasure(int, int)>
			j = getChildCount();
		//    4    6:aload_0         
		//    5    7:invokevirtual   #24  <Method int getChildCount()>
		//    6   10:istore_2        
			int k = getMeasuredWidth();
		//    7   11:aload_0         
		//    8   12:invokevirtual   #27  <Method int getMeasuredWidth()>
		//    9   15:istore_3        
			int l = getPaddingLeft();
		//   10   16:aload_0         
		//   11   17:invokevirtual   #30  <Method int getPaddingLeft()>
		//   12   20:istore          4
			int i1 = getPaddingRight();
		//   13   22:aload_0         
		//   14   23:invokevirtual   #33  <Method int getPaddingRight()>
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
		//   23   37:invokevirtual   #37  <Method View getChildAt(int)>
		//   24   40:astore          6
				if(view.getLayoutParams().width == -1)
		//*  25   42:aload           6
		//*  26   44:invokevirtual   #43  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//*  27   47:getfield        #49  <Field int android.view.ViewGroup$LayoutParams.width>
		//*  28   50:iconst_m1       
		//*  29   51:icmpne          81
					view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k - l - i1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000));
		//   30   54:aload           6
		//   31   56:iload_3         
		//   32   57:iload           4
		//   33   59:isub            
		//   34   60:iload           5
		//   35   62:isub            
		//   36   63:ldc1            #50  <Int 0x40000000>
		//   37   65:invokestatic    #56  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   38   68:aload           6
		//   39   70:invokevirtual   #59  <Method int View.getMeasuredHeight()>
		//   40   73:ldc1            #50  <Int 0x40000000>
		//   41   75:invokestatic    #56  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
		//   42   78:invokevirtual   #62  <Method void View.measure(int, int)>
			}

		//   43   81:iload_1         
		//   44   82:iconst_1        
		//   45   83:iadd            
		//   46   84:istore_1        
		//*  47   85:goto            30
		//   48   88:return          
		}

		public SnackbarLayout(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void BaseTransientBottomBar$SnackbarBaseLayout(Context, AttributeSet)>
		//    4    6:return          
		}
	}


	private static final int SNACKBAR_BUTTON_STYLE_ATTR[];

	static 
	{
		SNACKBAR_BUTTON_STYLE_ATTR = (new int[] {
			android.support.design.R.attr.snackbarButtonStyle
		});
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:getstatic       #21  <Field int android.support.design.R$attr.snackbarButtonStyle>
	//    5    8:iastore         
	//    6    9:putstatic       #23  <Field int[] SNACKBAR_BUTTON_STYLE_ATTR>
	//*   7   12:return          
	}
}
