// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.amap.api.mapcore.util:
//			fo

class fo$2 extends Drawable
{

	private void a(Canvas canvas)
	{
		canvas.drawColor(fo.g(a));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field fo a>
	//    3    5:invokestatic    #24  <Method int fo.g(fo)>
	//    4    8:invokevirtual   #30  <Method void Canvas.drawColor(int)>
	//    5   11:return          
	}

	private void b(Canvas canvas)
	{
		Paint paint = new Paint();
	//    0    0:new             #33  <Class Paint>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void Paint()>
	//    3    7:astore_2        
		Rect rect = new Rect();
	//    4    8:new             #36  <Class Rect>
	//    5   11:dup             
	//    6   12:invokespecial   #37  <Method void Rect()>
	//    7   15:astore_3        
		Rect rect1 = new Rect();
	//    8   16:new             #36  <Class Rect>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void Rect()>
	//   11   23:astore          4
		rect.left = 0;
	//   12   25:aload_3         
	//   13   26:iconst_0        
	//   14   27:putfield        #41  <Field int Rect.left>
		rect.top = 0;
	//   15   30:aload_3         
	//   16   31:iconst_0        
	//   17   32:putfield        #44  <Field int Rect.top>
		rect.right = fo.h(a).getWidth() + 0;
	//   18   35:aload_3         
	//   19   36:aload_0         
	//   20   37:getfield        #15  <Field fo a>
	//   21   40:invokestatic    #48  <Method Bitmap fo.h(fo)>
	//   22   43:invokevirtual   #54  <Method int Bitmap.getWidth()>
	//   23   46:iconst_0        
	//   24   47:iadd            
	//   25   48:putfield        #57  <Field int Rect.right>
		rect.bottom = fo.h(a).getHeight() + 0;
	//   26   51:aload_3         
	//   27   52:aload_0         
	//   28   53:getfield        #15  <Field fo a>
	//   29   56:invokestatic    #48  <Method Bitmap fo.h(fo)>
	//   30   59:invokevirtual   #60  <Method int Bitmap.getHeight()>
	//   31   62:iconst_0        
	//   32   63:iadd            
	//   33   64:putfield        #63  <Field int Rect.bottom>
		rect1.left = 0;
	//   34   67:aload           4
	//   35   69:iconst_0        
	//   36   70:putfield        #41  <Field int Rect.left>
		rect1.top = fo.i(a)[0];
	//   37   73:aload           4
	//   38   75:aload_0         
	//   39   76:getfield        #15  <Field fo a>
	//   40   79:invokestatic    #67  <Method int[] fo.i(fo)>
	//   41   82:iconst_0        
	//   42   83:iaload          
	//   43   84:putfield        #44  <Field int Rect.top>
		rect1.right = fo.j(a) + 0;
	//   44   87:aload           4
	//   45   89:aload_0         
	//   46   90:getfield        #15  <Field fo a>
	//   47   93:invokestatic    #70  <Method int fo.j(fo)>
	//   48   96:iconst_0        
	//   49   97:iadd            
	//   50   98:putfield        #57  <Field int Rect.right>
		rect1.bottom = fo.i(a)[1];
	//   51  101:aload           4
	//   52  103:aload_0         
	//   53  104:getfield        #15  <Field fo a>
	//   54  107:invokestatic    #67  <Method int[] fo.i(fo)>
	//   55  110:iconst_1        
	//   56  111:iaload          
	//   57  112:putfield        #63  <Field int Rect.bottom>
		canvas.drawBitmap(fo.h(a), rect, rect1, paint);
	//   58  115:aload_1         
	//   59  116:aload_0         
	//   60  117:getfield        #15  <Field fo a>
	//   61  120:invokestatic    #48  <Method Bitmap fo.h(fo)>
	//   62  123:aload_3         
	//   63  124:aload           4
	//   64  126:aload_2         
	//   65  127:invokevirtual   #74  <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
	//   66  130:return          
	}

	private void c(Canvas canvas)
	{
		Paint paint = new Paint();
	//    0    0:new             #33  <Class Paint>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void Paint()>
	//    3    7:astore_2        
		Rect rect = canvas.getClipBounds();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #79  <Method Rect Canvas.getClipBounds()>
	//    6   12:astore_3        
		paint.setColor(fo.k(a));
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:getfield        #15  <Field fo a>
	//   10   18:invokestatic    #82  <Method int fo.k(fo)>
	//   11   21:invokevirtual   #85  <Method void Paint.setColor(int)>
		paint.setStyle(android.graphics..Style.STROKE);
	//   12   24:aload_2         
	//   13   25:getstatic       #91  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   14   28:invokevirtual   #95  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		paint.setStrokeWidth(fo.l(a));
	//   15   31:aload_2         
	//   16   32:aload_0         
	//   17   33:getfield        #15  <Field fo a>
	//   18   36:invokestatic    #98  <Method int fo.l(fo)>
	//   19   39:i2f             
	//   20   40:invokevirtual   #102 <Method void Paint.setStrokeWidth(float)>
		canvas.drawRect(rect, paint);
	//   21   43:aload_1         
	//   22   44:aload_3         
	//   23   45:aload_2         
	//   24   46:invokevirtual   #106 <Method void Canvas.drawRect(Rect, Paint)>
	//   25   49:return          
	}

	public void draw(Canvas canvas)
	{
		try
		{
			a(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #111 <Method void a(Canvas)>
			b(canvas);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #113 <Method void b(Canvas)>
			c(canvas);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #115 <Method void c(Canvas)>
			return;
	//    9   15:return          
		}
		// Misplaced declaration of an exception variable
		catch(Canvas canvas)
	//*  10   16:astore_1        
		{
			return;
	//   11   17:return          
		}
	}

	public int getOpacity()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setAlpha(int i)
	{
	//    0    0:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
	//    0    0:return          
	}

	final fo a;

	fo$2(fo fo1)
	{
		a = fo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field fo a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Drawable()>
	//    5    9:return          
	}
}
