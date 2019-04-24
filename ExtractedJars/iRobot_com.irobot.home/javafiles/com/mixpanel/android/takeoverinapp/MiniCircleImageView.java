// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.takeoverinapp;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ImageView;

public class MiniCircleImageView extends ImageView
{

	public MiniCircleImageView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void ImageView(Context)>
		a();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void a()>
	//    5    9:return          
	}

	public MiniCircleImageView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void ImageView(Context, AttributeSet)>
		a();
	//    4    6:aload_0         
	//    5    7:invokespecial   #16  <Method void a()>
	//    6   10:return          
	}

	public MiniCircleImageView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #23  <Method void ImageView(Context, AttributeSet, int)>
		a();
	//    5    7:aload_0         
	//    6    8:invokespecial   #16  <Method void a()>
	//    7   11:return          
	}

	private void a()
	{
		a = new Paint(1);
	//    0    0:aload_0         
	//    1    1:new             #25  <Class Paint>
	//    2    4:dup             
	//    3    5:iconst_1        
	//    4    6:invokespecial   #28  <Method void Paint(int)>
	//    5    9:putfield        #30  <Field Paint a>
		int i;
		Paint paint;
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   6   12:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          23
	//*   8   17:icmplt          44
		{
			paint = a;
	//    9   20:aload_0         
	//   10   21:getfield        #30  <Field Paint a>
	//   11   24:astore_3        
			i = getResources().getColor(0x106000b, ((android.content.res.Resources.Theme) (null)));
	//   12   25:aload_0         
	//   13   26:invokevirtual   #39  <Method Resources getResources()>
	//   14   29:ldc1            #40  <Int 0x106000b>
	//   15   31:aconst_null     
	//   16   32:invokevirtual   #46  <Method int Resources.getColor(int, android.content.res.Resources$Theme)>
	//   17   35:istore_2        
		} else
	//*  18   36:aload_3         
	//*  19   37:iload_2         
	//*  20   38:invokevirtual   #49  <Method void Paint.setColor(int)>
	//*  21   41:goto            62
		{
			paint = a;
	//   22   44:aload_0         
	//   23   45:getfield        #30  <Field Paint a>
	//   24   48:astore_3        
			i = getResources().getColor(0x106000b);
	//   25   49:aload_0         
	//   26   50:invokevirtual   #39  <Method Resources getResources()>
	//   27   53:ldc1            #40  <Int 0x106000b>
	//   28   55:invokevirtual   #52  <Method int Resources.getColor(int)>
	//   29   58:istore_2        
		}
		paint.setColor(i);
	//*  30   59:goto            36
		a.setStyle(android.graphics.Paint.Style.STROKE);
	//   31   62:aload_0         
	//   32   63:getfield        #30  <Field Paint a>
	//   33   66:getstatic       #58  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   34   69:invokevirtual   #62  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		float f = TypedValue.applyDimension(1, 2.0F, getResources().getDisplayMetrics());
	//   35   72:iconst_1        
	//   36   73:fconst_2        
	//   37   74:aload_0         
	//   38   75:invokevirtual   #39  <Method Resources getResources()>
	//   39   78:invokevirtual   #66  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   40   81:invokestatic    #72  <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   41   84:fstore_1        
		a.setStrokeWidth(f);
	//   42   85:aload_0         
	//   43   86:getfield        #30  <Field Paint a>
	//   44   89:fload_1         
	//   45   90:invokevirtual   #76  <Method void Paint.setStrokeWidth(float)>
	//   46   93:return          
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #80  <Method void ImageView.onSizeChanged(int, int, int, int)>
		b = i;
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:putfield        #82  <Field int b>
		c = j;
	//    9   14:aload_0         
	//   10   15:iload_2         
	//   11   16:putfield        #84  <Field int c>
	//   12   19:return          
	}

	private Paint a;
	private int b;
	private int c;
}
