// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.takeoverinapp;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FadingImageView extends ImageView
{

	public FadingImageView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void ImageView(Context)>
		a();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void a()>
	//    5    9:return          
	}

	public FadingImageView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void ImageView(Context, AttributeSet)>
		a();
	//    4    6:aload_0         
	//    5    7:invokespecial   #24  <Method void a()>
	//    6   10:return          
	}

	public FadingImageView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void ImageView(Context, AttributeSet, int)>
		a();
	//    5    7:aload_0         
	//    6    8:invokespecial   #24  <Method void a()>
	//    7   11:return          
	}

	private void a()
	{
		a = new Matrix();
	//    0    0:aload_0         
	//    1    1:new             #33  <Class Matrix>
	//    2    4:dup             
	//    3    5:invokespecial   #35  <Method void Matrix()>
	//    4    8:putfield        #37  <Field Matrix a>
		b = new Paint();
	//    5   11:aload_0         
	//    6   12:new             #39  <Class Paint>
	//    7   15:dup             
	//    8   16:invokespecial   #40  <Method void Paint()>
	//    9   19:putfield        #42  <Field Paint b>
		android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
	//   10   22:getstatic       #48  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   11   25:astore_1        
		c = ((Shader) (new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, new int[] {
			0xff000000, 0xff000000, 0xe5000000, 0
		}, new float[] {
			0.0F, 0.2F, 0.4F, 1.0F
		}, tilemode)));
	//   12   26:aload_0         
	//   13   27:new             #50  <Class LinearGradient>
	//   14   30:dup             
	//   15   31:fconst_0        
	//   16   32:fconst_0        
	//   17   33:fconst_0        
	//   18   34:fconst_1        
	//   19   35:iconst_4        
	//   20   36:newarray        int[]
	//   21   38:dup             
	//   22   39:iconst_0        
	//   23   40:ldc1            #51  <Int 0xff000000>
	//   24   42:iastore         
	//   25   43:dup             
	//   26   44:iconst_1        
	//   27   45:ldc1            #51  <Int 0xff000000>
	//   28   47:iastore         
	//   29   48:dup             
	//   30   49:iconst_2        
	//   31   50:ldc1            #52  <Int 0xe5000000>
	//   32   52:iastore         
	//   33   53:dup             
	//   34   54:iconst_3        
	//   35   55:iconst_0        
	//   36   56:iastore         
	//   37   57:iconst_4        
	//   38   58:newarray        float[]
	//   39   60:dup             
	//   40   61:iconst_0        
	//   41   62:fconst_0        
	//   42   63:fastore         
	//   43   64:dup             
	//   44   65:iconst_1        
	//   45   66:ldc1            #53  <Float 0.2F>
	//   46   68:fastore         
	//   47   69:dup             
	//   48   70:iconst_2        
	//   49   71:ldc1            #54  <Float 0.4F>
	//   50   73:fastore         
	//   51   74:dup             
	//   52   75:iconst_3        
	//   53   76:fconst_1        
	//   54   77:fastore         
	//   55   78:aload_1         
	//   56   79:invokespecial   #57  <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//   57   82:putfield        #59  <Field Shader c>
		b.setShader(c);
	//   58   85:aload_0         
	//   59   86:getfield        #42  <Field Paint b>
	//   60   89:aload_0         
	//   61   90:getfield        #59  <Field Shader c>
	//   62   93:invokevirtual   #63  <Method Shader Paint.setShader(Shader)>
	//   63   96:pop             
		b.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN))));
	//   64   97:aload_0         
	//   65   98:getfield        #42  <Field Paint b>
	//   66  101:new             #65  <Class PorterDuffXfermode>
	//   67  104:dup             
	//   68  105:getstatic       #71  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.DST_IN>
	//   69  108:invokespecial   #74  <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//   70  111:invokevirtual   #78  <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   71  114:pop             
		d = new Paint();
	//   72  115:aload_0         
	//   73  116:new             #39  <Class Paint>
	//   74  119:dup             
	//   75  120:invokespecial   #40  <Method void Paint()>
	//   76  123:putfield        #80  <Field Paint d>
		tilemode = android.graphics.Shader.TileMode.CLAMP;
	//   77  126:getstatic       #48  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   78  129:astore_1        
		e = ((Shader) (new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, new int[] {
			0, 0, 0xff000000, 0xff000000
		}, new float[] {
			0.0F, 0.85F, 0.98F, 1.0F
		}, tilemode)));
	//   79  130:aload_0         
	//   80  131:new             #50  <Class LinearGradient>
	//   81  134:dup             
	//   82  135:fconst_0        
	//   83  136:fconst_0        
	//   84  137:fconst_0        
	//   85  138:fconst_1        
	//   86  139:iconst_4        
	//   87  140:newarray        int[]
	//   88  142:dup             
	//   89  143:iconst_0        
	//   90  144:iconst_0        
	//   91  145:iastore         
	//   92  146:dup             
	//   93  147:iconst_1        
	//   94  148:iconst_0        
	//   95  149:iastore         
	//   96  150:dup             
	//   97  151:iconst_2        
	//   98  152:ldc1            #51  <Int 0xff000000>
	//   99  154:iastore         
	//  100  155:dup             
	//  101  156:iconst_3        
	//  102  157:ldc1            #51  <Int 0xff000000>
	//  103  159:iastore         
	//  104  160:iconst_4        
	//  105  161:newarray        float[]
	//  106  163:dup             
	//  107  164:iconst_0        
	//  108  165:fconst_0        
	//  109  166:fastore         
	//  110  167:dup             
	//  111  168:iconst_1        
	//  112  169:ldc1            #81  <Float 0.85F>
	//  113  171:fastore         
	//  114  172:dup             
	//  115  173:iconst_2        
	//  116  174:ldc1            #82  <Float 0.98F>
	//  117  176:fastore         
	//  118  177:dup             
	//  119  178:iconst_3        
	//  120  179:fconst_1        
	//  121  180:fastore         
	//  122  181:aload_1         
	//  123  182:invokespecial   #57  <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  124  185:putfield        #84  <Field Shader e>
		d.setShader(e);
	//  125  188:aload_0         
	//  126  189:getfield        #80  <Field Paint d>
	//  127  192:aload_0         
	//  128  193:getfield        #84  <Field Shader e>
	//  129  196:invokevirtual   #63  <Method Shader Paint.setShader(Shader)>
	//  130  199:pop             
		b.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN))));
	//  131  200:aload_0         
	//  132  201:getfield        #42  <Field Paint b>
	//  133  204:new             #65  <Class PorterDuffXfermode>
	//  134  207:dup             
	//  135  208:getstatic       #71  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.DST_IN>
	//  136  211:invokespecial   #74  <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//  137  214:invokevirtual   #78  <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//  138  217:pop             
	//  139  218:return          
	}

	public void a(boolean flag)
	{
		h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field boolean h>
	//    3    5:return          
	}

	public void draw(Canvas canvas)
	{
		if(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field boolean h>
	//*   2    4:ifeq            63
		{
			Rect rect = canvas.getClipBounds();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #95  <Method Rect Canvas.getClipBounds()>
	//    5   11:astore_3        
			int i = canvas.saveLayer(0.0F, 0.0F, rect.width(), rect.height(), ((Paint) (null)), 31);
	//    6   12:aload_1         
	//    7   13:fconst_0        
	//    8   14:fconst_0        
	//    9   15:aload_3         
	//   10   16:invokevirtual   #101 <Method int Rect.width()>
	//   11   19:i2f             
	//   12   20:aload_3         
	//   13   21:invokevirtual   #104 <Method int Rect.height()>
	//   14   24:i2f             
	//   15   25:aconst_null     
	//   16   26:bipush          31
	//   17   28:invokevirtual   #108 <Method int Canvas.saveLayer(float, float, float, float, Paint, int)>
	//   18   31:istore_2        
			super.draw(canvas);
	//   19   32:aload_0         
	//   20   33:aload_1         
	//   21   34:invokespecial   #110 <Method void ImageView.draw(Canvas)>
			canvas.drawRect(0.0F, 0.0F, g, f, b);
	//   22   37:aload_1         
	//   23   38:fconst_0        
	//   24   39:fconst_0        
	//   25   40:aload_0         
	//   26   41:getfield        #112 <Field int g>
	//   27   44:i2f             
	//   28   45:aload_0         
	//   29   46:getfield        #114 <Field int f>
	//   30   49:i2f             
	//   31   50:aload_0         
	//   32   51:getfield        #42  <Field Paint b>
	//   33   54:invokevirtual   #118 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			canvas.restoreToCount(i);
	//   34   57:aload_1         
	//   35   58:iload_2         
	//   36   59:invokevirtual   #122 <Method void Canvas.restoreToCount(int)>
			return;
	//   37   62:return          
		} else
		{
			super.draw(canvas);
	//   38   63:aload_0         
	//   39   64:aload_1         
	//   40   65:invokespecial   #110 <Method void ImageView.draw(Canvas)>
			return;
	//   41   68:return          
		}
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #126 <Method void ImageView.onMeasure(int, int)>
		if(h)
	//*   4    6:aload_0         
	//*   5    7:getfield        #87  <Field boolean h>
	//*   6   10:ifeq            66
		{
			f = getHeight();
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #129 <Method int getHeight()>
	//   10   18:putfield        #114 <Field int f>
			g = getWidth();
	//   11   21:aload_0         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #132 <Method int getWidth()>
	//   14   26:putfield        #112 <Field int g>
			i = android.view.View.MeasureSpec.getSize(j);
	//   15   29:iload_2         
	//   16   30:invokestatic    #138 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   17   33:istore_1        
			a.setScale(1.0F, i);
	//   18   34:aload_0         
	//   19   35:getfield        #37  <Field Matrix a>
	//   20   38:fconst_1        
	//   21   39:iload_1         
	//   22   40:i2f             
	//   23   41:invokevirtual   #142 <Method void Matrix.setScale(float, float)>
			c.setLocalMatrix(a);
	//   24   44:aload_0         
	//   25   45:getfield        #59  <Field Shader c>
	//   26   48:aload_0         
	//   27   49:getfield        #37  <Field Matrix a>
	//   28   52:invokevirtual   #148 <Method void Shader.setLocalMatrix(Matrix)>
			e.setLocalMatrix(a);
	//   29   55:aload_0         
	//   30   56:getfield        #84  <Field Shader e>
	//   31   59:aload_0         
	//   32   60:getfield        #37  <Field Matrix a>
	//   33   63:invokevirtual   #148 <Method void Shader.setLocalMatrix(Matrix)>
		}
	//   34   66:return          
	}

	private Matrix a;
	private Paint b;
	private Shader c;
	private Paint d;
	private Shader e;
	private int f;
	private int g;
	private boolean h;
}
