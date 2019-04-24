// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;

public class DialogTitle extends TextView
{

	public DialogTitle(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void TextView(Context)>
	//    3    5:return          
	}

	public DialogTitle(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void TextView(Context, AttributeSet)>
	//    4    6:return          
	}

	public DialogTitle(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #15  <Method void TextView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #19  <Method void TextView.onMeasure(int, int)>
		Layout layout = getLayout();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #23  <Method Layout getLayout()>
	//    6   10:astore          4
		if(layout != null)
	//*   7   12:aload           4
	//*   8   14:ifnull          97
		{
			int k = layout.getLineCount();
	//    9   17:aload           4
	//   10   19:invokevirtual   #29  <Method int Layout.getLineCount()>
	//   11   22:istore_3        
			if(k > 0 && layout.getEllipsisCount(k - 1) > 0)
	//*  12   23:iload_3         
	//*  13   24:ifle            97
	//*  14   27:aload           4
	//*  15   29:iload_3         
	//*  16   30:iconst_1        
	//*  17   31:isub            
	//*  18   32:invokevirtual   #33  <Method int Layout.getEllipsisCount(int)>
	//*  19   35:ifle            97
			{
				setSingleLine(false);
	//   20   38:aload_0         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #37  <Method void setSingleLine(boolean)>
				setMaxLines(2);
	//   23   43:aload_0         
	//   24   44:iconst_2        
	//   25   45:invokevirtual   #41  <Method void setMaxLines(int)>
				TypedArray typedarray = getContext().obtainStyledAttributes(((AttributeSet) (null)), android.support.v7.a.a.j.TextAppearance, 0x1010041, 0x1030044);
	//   26   48:aload_0         
	//   27   49:invokevirtual   #45  <Method Context getContext()>
	//   28   52:aconst_null     
	//   29   53:getstatic       #51  <Field int[] android.support.v7.a.a$j.TextAppearance>
	//   30   56:ldc1            #52  <Int 0x1010041>
	//   31   58:ldc1            #53  <Int 0x1030044>
	//   32   60:invokevirtual   #59  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   33   63:astore          4
				int l = typedarray.getDimensionPixelSize(android.support.v7.a.a.j.TextAppearance_android_textSize, 0);
	//   34   65:aload           4
	//   35   67:getstatic       #63  <Field int android.support.v7.a.a$j.TextAppearance_android_textSize>
	//   36   70:iconst_0        
	//   37   71:invokevirtual   #69  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   38   74:istore_3        
				if(l != 0)
	//*  39   75:iload_3         
	//*  40   76:ifeq            86
					setTextSize(0, l);
	//   41   79:aload_0         
	//   42   80:iconst_0        
	//   43   81:iload_3         
	//   44   82:i2f             
	//   45   83:invokevirtual   #73  <Method void setTextSize(int, float)>
				typedarray.recycle();
	//   46   86:aload           4
	//   47   88:invokevirtual   #77  <Method void TypedArray.recycle()>
				super.onMeasure(i, j);
	//   48   91:aload_0         
	//   49   92:iload_1         
	//   50   93:iload_2         
	//   51   94:invokespecial   #19  <Method void TextView.onMeasure(int, int)>
			}
		}
	//   52   97:return          
	}
}
