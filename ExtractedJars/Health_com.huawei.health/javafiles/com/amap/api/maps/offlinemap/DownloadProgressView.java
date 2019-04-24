// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class DownloadProgressView extends View
{

	public DownloadProgressView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void View(Context)>
		b = 0xffff0000;
	//    3    5:aload_0         
	//    4    6:ldc1            #22  <Int 0xffff0000>
	//    5    8:putfield        #24  <Field int b>
		c = 0xffff0000;
	//    6   11:aload_0         
	//    7   12:ldc1            #22  <Int 0xffff0000>
	//    8   14:putfield        #26  <Field int c>
		d = 0.0F;
	//    9   17:aload_0         
	//   10   18:fconst_0        
	//   11   19:putfield        #28  <Field float d>
		e = 0.6F;
	//   12   22:aload_0         
	//   13   23:ldc1            #29  <Float 0.6F>
	//   14   25:putfield        #31  <Field float e>
		a(((AttributeSet) (null)), 0);
	//   15   28:aload_0         
	//   16   29:aconst_null     
	//   17   30:iconst_0        
	//   18   31:invokespecial   #34  <Method void a(AttributeSet, int)>
	//   19   34:return          
	}

	public DownloadProgressView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #38  <Method void View(Context, AttributeSet)>
		b = 0xffff0000;
	//    4    6:aload_0         
	//    5    7:ldc1            #22  <Int 0xffff0000>
	//    6    9:putfield        #24  <Field int b>
		c = 0xffff0000;
	//    7   12:aload_0         
	//    8   13:ldc1            #22  <Int 0xffff0000>
	//    9   15:putfield        #26  <Field int c>
		d = 0.0F;
	//   10   18:aload_0         
	//   11   19:fconst_0        
	//   12   20:putfield        #28  <Field float d>
		e = 0.6F;
	//   13   23:aload_0         
	//   14   24:ldc1            #29  <Float 0.6F>
	//   15   26:putfield        #31  <Field float e>
		a(attributeset, 0);
	//   16   29:aload_0         
	//   17   30:aload_2         
	//   18   31:iconst_0        
	//   19   32:invokespecial   #34  <Method void a(AttributeSet, int)>
	//   20   35:return          
	}

	public DownloadProgressView(Context context, AttributeSet attributeset, int j)
	{
		super(context, attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #41  <Method void View(Context, AttributeSet, int)>
		b = 0xffff0000;
	//    5    7:aload_0         
	//    6    8:ldc1            #22  <Int 0xffff0000>
	//    7   10:putfield        #24  <Field int b>
		c = 0xffff0000;
	//    8   13:aload_0         
	//    9   14:ldc1            #22  <Int 0xffff0000>
	//   10   16:putfield        #26  <Field int c>
		d = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #28  <Field float d>
		e = 0.6F;
	//   14   24:aload_0         
	//   15   25:ldc1            #29  <Float 0.6F>
	//   16   27:putfield        #31  <Field float e>
		a(attributeset, j);
	//   17   30:aload_0         
	//   18   31:aload_2         
	//   19   32:iload_3         
	//   20   33:invokespecial   #34  <Method void a(AttributeSet, int)>
	//   21   36:return          
	}

	private void a()
	{
		f.setTextSize(d);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field TextPaint f>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field float d>
	//    4    8:invokevirtual   #50  <Method void TextPaint.setTextSize(float)>
		f.setColor(b);
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field TextPaint f>
	//    7   15:aload_0         
	//    8   16:getfield        #24  <Field int b>
	//    9   19:invokevirtual   #54  <Method void TextPaint.setColor(int)>
		g.setColor(c);
	//   10   22:aload_0         
	//   11   23:getfield        #56  <Field TextPaint g>
	//   12   26:aload_0         
	//   13   27:getfield        #26  <Field int c>
	//   14   30:invokevirtual   #54  <Method void TextPaint.setColor(int)>
		h = f.measureText(a);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #44  <Field TextPaint f>
	//   18   38:aload_0         
	//   19   39:getfield        #58  <Field String a>
	//   20   42:invokevirtual   #62  <Method float TextPaint.measureText(String)>
	//   21   45:putfield        #64  <Field float h>
		i = f.getFontMetrics().bottom;
	//   22   48:aload_0         
	//   23   49:aload_0         
	//   24   50:getfield        #44  <Field TextPaint f>
	//   25   53:invokevirtual   #68  <Method android.graphics.Paint$FontMetrics TextPaint.getFontMetrics()>
	//   26   56:getfield        #73  <Field float android.graphics.Paint$FontMetrics.bottom>
	//   27   59:putfield        #75  <Field float i>
	//   28   62:return          
	}

	private void a(AttributeSet attributeset, int j)
	{
		attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, com.amap.api.mapcore.util.a.a.a, j, 0)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #79  <Method Context getContext()>
	//    2    4:aload_1         
	//    3    5:getstatic       #84  <Field int[] com.amap.api.mapcore.util.a$a.a>
	//    4    8:iload_2         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #90  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    7   13:astore_1        
		a = ((TypedArray) (attributeset)).getString(0);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #96  <Method String TypedArray.getString(int)>
	//   12   20:putfield        #58  <Field String a>
		b = ((TypedArray) (attributeset)).getColor(3, b);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #24  <Field int b>
	//   18   30:invokevirtual   #100 <Method int TypedArray.getColor(int, int)>
	//   19   33:putfield        #24  <Field int b>
		d = ((TypedArray) (attributeset)).getDimension(1, d);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:iconst_1        
	//   23   39:aload_0         
	//   24   40:getfield        #28  <Field float d>
	//   25   43:invokevirtual   #104 <Method float TypedArray.getDimension(int, float)>
	//   26   46:putfield        #28  <Field float d>
		c = ((TypedArray) (attributeset)).getColor(2, c);
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:iconst_2        
	//   30   52:aload_0         
	//   31   53:getfield        #26  <Field int c>
	//   32   56:invokevirtual   #100 <Method int TypedArray.getColor(int, int)>
	//   33   59:putfield        #26  <Field int c>
		((TypedArray) (attributeset)).recycle();
	//   34   62:aload_1         
	//   35   63:invokevirtual   #107 <Method void TypedArray.recycle()>
		f = new TextPaint();
	//   36   66:aload_0         
	//   37   67:new             #46  <Class TextPaint>
	//   38   70:dup             
	//   39   71:invokespecial   #109 <Method void TextPaint()>
	//   40   74:putfield        #44  <Field TextPaint f>
		f.setFlags(1);
	//   41   77:aload_0         
	//   42   78:getfield        #44  <Field TextPaint f>
	//   43   81:iconst_1        
	//   44   82:invokevirtual   #112 <Method void TextPaint.setFlags(int)>
		f.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//   45   85:aload_0         
	//   46   86:getfield        #44  <Field TextPaint f>
	//   47   89:getstatic       #118 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//   48   92:invokevirtual   #122 <Method void TextPaint.setTextAlign(android.graphics.Paint$Align)>
		g = new TextPaint();
	//   49   95:aload_0         
	//   50   96:new             #46  <Class TextPaint>
	//   51   99:dup             
	//   52  100:invokespecial   #109 <Method void TextPaint()>
	//   53  103:putfield        #56  <Field TextPaint g>
		g.setStyle(android.graphics.Paint.Style.FILL);
	//   54  106:aload_0         
	//   55  107:getfield        #56  <Field TextPaint g>
	//   56  110:getstatic       #128 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   57  113:invokevirtual   #132 <Method void TextPaint.setStyle(android.graphics.Paint$Style)>
		a();
	//   58  116:aload_0         
	//   59  117:invokespecial   #134 <Method void a()>
	//   60  120:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #138 <Method void View.onDraw(Canvas)>
		int l = getPaddingLeft();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method int getPaddingLeft()>
	//    5    9:istore          8
		int j = getPaddingTop();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #145 <Method int getPaddingTop()>
	//    8   15:istore          6
		int i1 = getPaddingRight();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #148 <Method int getPaddingRight()>
	//   11   21:istore          9
		int k = getPaddingBottom();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #151 <Method int getPaddingBottom()>
	//   14   27:istore          7
		l = getWidth() - l - i1;
	//   15   29:aload_0         
	//   16   30:invokevirtual   #154 <Method int getWidth()>
	//   17   33:iload           8
	//   18   35:isub            
	//   19   36:iload           9
	//   20   38:isub            
	//   21   39:istore          8
		j = getHeight() - j - k;
	//   22   41:aload_0         
	//   23   42:invokevirtual   #157 <Method int getHeight()>
	//   24   45:iload           6
	//   25   47:isub            
	//   26   48:iload           7
	//   27   50:isub            
	//   28   51:istore          6
		double d1 = (float)j * 0.8F;
	//   29   53:iload           6
	//   30   55:i2f             
	//   31   56:ldc1            #158 <Float 0.8F>
	//   32   58:fmul            
	//   33   59:f2d             
	//   34   60:dstore_2        
		double d2 = (float)l * e;
	//   35   61:iload           8
	//   36   63:i2f             
	//   37   64:aload_0         
	//   38   65:getfield        #31  <Field float e>
	//   39   68:fmul            
	//   40   69:f2d             
	//   41   70:dstore          4
		String s = (new StringBuilder()).append(String.valueOf((int)(e * 100F))).append("%").toString();
	//   42   72:new             #160 <Class StringBuilder>
	//   43   75:dup             
	//   44   76:invokespecial   #161 <Method void StringBuilder()>
	//   45   79:aload_0         
	//   46   80:getfield        #31  <Field float e>
	//   47   83:ldc1            #162 <Float 100F>
	//   48   85:fmul            
	//   49   86:f2i             
	//   50   87:invokestatic    #167 <Method String String.valueOf(int)>
	//   51   90:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   52   93:ldc1            #173 <String "%">
	//   53   95:invokevirtual   #171 <Method StringBuilder StringBuilder.append(String)>
	//   54   98:invokevirtual   #177 <Method String StringBuilder.toString()>
	//   55  101:astore          10
		canvas.drawRect(new Rect(0, (int)d1, (int)((float)l * e), j), ((android.graphics.Paint) (g)));
	//   56  103:aload_1         
	//   57  104:new             #179 <Class Rect>
	//   58  107:dup             
	//   59  108:iconst_0        
	//   60  109:dload_2         
	//   61  110:d2i             
	//   62  111:iload           8
	//   63  113:i2f             
	//   64  114:aload_0         
	//   65  115:getfield        #31  <Field float e>
	//   66  118:fmul            
	//   67  119:f2i             
	//   68  120:iload           6
	//   69  122:invokespecial   #182 <Method void Rect(int, int, int, int)>
	//   70  125:aload_0         
	//   71  126:getfield        #56  <Field TextPaint g>
	//   72  129:invokevirtual   #188 <Method void Canvas.drawRect(Rect, android.graphics.Paint)>
		canvas.drawText(s, (int)d2, (int)(d1 - 3D), ((android.graphics.Paint) (f)));
	//   73  132:aload_1         
	//   74  133:aload           10
	//   75  135:dload           4
	//   76  137:d2i             
	//   77  138:i2f             
	//   78  139:dload_2         
	//   79  140:ldc2w           #189 <Double 3D>
	//   80  143:dsub            
	//   81  144:d2i             
	//   82  145:i2f             
	//   83  146:aload_0         
	//   84  147:getfield        #44  <Field TextPaint f>
	//   85  150:invokevirtual   #194 <Method void Canvas.drawText(String, float, float, android.graphics.Paint)>
	//   86  153:return          
	}

	public void setProgress(int j)
	{
		if(j > 100 || j < 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          100
	//*   2    3:icmpgt          10
	//*   3    6:iload_1         
	//*   4    7:ifge            11
		{
			return;
	//    5   10:return          
		} else
		{
			e = (float)j / 100F;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:i2f             
	//    9   14:ldc1            #162 <Float 100F>
	//   10   16:fdiv            
	//   11   17:putfield        #31  <Field float e>
			invalidate();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #198 <Method void invalidate()>
			return;
	//   14   24:return          
		}
	}

	private String a;
	private int b;
	private int c;
	private float d;
	private float e;
	private TextPaint f;
	private TextPaint g;
	private float h;
	private float i;
}
