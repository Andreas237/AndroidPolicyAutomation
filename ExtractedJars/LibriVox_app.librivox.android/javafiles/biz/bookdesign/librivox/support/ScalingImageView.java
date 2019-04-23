// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package biz.bookdesign.librivox.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class ScalingImageView extends View
{

	public ScalingImageView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void View(Context, AttributeSet)>
	//    4    6:return          
	}

	public void a(Bitmap bitmap, boolean flag)
	{
		a = ((Drawable) (new BitmapDrawable(getResources(), bitmap)));
	//    0    0:aload_0         
	//    1    1:new             #16  <Class BitmapDrawable>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #20  <Method android.content.res.Resources getResources()>
	//    5    9:aload_1         
	//    6   10:invokespecial   #23  <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
	//    7   13:putfield        #25  <Field Drawable a>
		b = flag;
	//    8   16:aload_0         
	//    9   17:iload_2         
	//   10   18:putfield        #27  <Field boolean b>
		setBackgroundDrawable(a);
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field Drawable a>
	//   14   26:invokevirtual   #31  <Method void setBackgroundDrawable(Drawable)>
	//   15   29:return          
	}

	public void a(Drawable drawable, boolean flag)
	{
		a = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Drawable a>
		b = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #27  <Field boolean b>
		setBackgroundDrawable(a);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #25  <Field Drawable a>
	//    9   15:invokevirtual   #31  <Method void setBackgroundDrawable(Drawable)>
	//   10   18:return          
	}

	protected void onMeasure(int i, int j)
	{
		Drawable drawable = a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Drawable a>
	//    2    4:astore          5
		int k;
		int l;
		if(drawable != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          29
		{
			k = drawable.getIntrinsicWidth();
	//    5   11:aload           5
	//    6   13:invokevirtual   #40  <Method int Drawable.getIntrinsicWidth()>
	//    7   16:istore_3        
			l = a.getIntrinsicHeight();
	//    8   17:aload_0         
	//    9   18:getfield        #25  <Field Drawable a>
	//   10   21:invokevirtual   #43  <Method int Drawable.getIntrinsicHeight()>
	//   11   24:istore          4
		} else
	//*  12   26:goto            34
		{
			k = 1;
	//   13   29:iconst_1        
	//   14   30:istore_3        
			l = 1;
	//   15   31:iconst_1        
	//   16   32:istore          4
		}
		if(b)
	//*  17   34:aload_0         
	//*  18   35:getfield        #27  <Field boolean b>
	//*  19   38:iconst_1        
	//*  20   39:icmpne          57
		{
			i = android.view.View.MeasureSpec.getSize(j);
	//   21   42:iload_2         
	//   22   43:invokestatic    #49  <Method int android.view.View$MeasureSpec.getSize(int)>
	//   23   46:istore_1        
			j = (k * i) / l;
	//   24   47:iload_3         
	//   25   48:iload_1         
	//   26   49:imul            
	//   27   50:iload           4
	//   28   52:idiv            
	//   29   53:istore_2        
		} else
	//*  30   54:goto            69
		{
			j = android.view.View.MeasureSpec.getSize(i);
	//   31   57:iload_1         
	//   32   58:invokestatic    #49  <Method int android.view.View$MeasureSpec.getSize(int)>
	//   33   61:istore_2        
			i = (l * j) / k;
	//   34   62:iload           4
	//   35   64:iload_2         
	//   36   65:imul            
	//   37   66:iload_3         
	//   38   67:idiv            
	//   39   68:istore_1        
		}
		setMeasuredDimension(j, i);
	//   40   69:aload_0         
	//   41   70:iload_2         
	//   42   71:iload_1         
	//   43   72:invokevirtual   #52  <Method void setMeasuredDimension(int, int)>
	//   44   75:return          
	}

	private Drawable a;
	private boolean b;
}
