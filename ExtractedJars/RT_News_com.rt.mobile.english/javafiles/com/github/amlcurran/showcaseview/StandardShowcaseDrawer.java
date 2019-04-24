// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			ShowcaseDrawer

class StandardShowcaseDrawer
	implements ShowcaseDrawer
{

	public StandardShowcaseDrawer(Resources resources)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		PorterDuffXfermode porterduffxfermode = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.MULTIPLY);
	//    2    4:new             #22  <Class PorterDuffXfermode>
	//    3    7:dup             
	//    4    8:getstatic       #28  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//    5   11:invokespecial   #31  <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//    6   14:astore_2        
	//    7   15:aload_0         
	//    8   16:new             #33  <Class Paint>
	//    9   19:dup             
	//   10   20:invokespecial   #34  <Method void Paint()>
	//   11   23:putfield        #36  <Field Paint eraserPaint>
		eraserPaint.setColor(0xffffff);
	//   12   26:aload_0         
	//   13   27:getfield        #36  <Field Paint eraserPaint>
	//   14   30:ldc1            #37  <Int 0xffffff>
	//   15   32:invokevirtual   #41  <Method void Paint.setColor(int)>
		eraserPaint.setAlpha(0);
	//   16   35:aload_0         
	//   17   36:getfield        #36  <Field Paint eraserPaint>
	//   18   39:iconst_0        
	//   19   40:invokevirtual   #44  <Method void Paint.setAlpha(int)>
		eraserPaint.setXfermode(((android.graphics.Xfermode) (porterduffxfermode)));
	//   20   43:aload_0         
	//   21   44:getfield        #36  <Field Paint eraserPaint>
	//   22   47:aload_2         
	//   23   48:invokevirtual   #48  <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   24   51:pop             
		eraserPaint.setAntiAlias(true);
	//   25   52:aload_0         
	//   26   53:getfield        #36  <Field Paint eraserPaint>
	//   27   56:iconst_1        
	//   28   57:invokevirtual   #52  <Method void Paint.setAntiAlias(boolean)>
	//   29   60:aload_0         
	//   30   61:new             #33  <Class Paint>
	//   31   64:dup             
	//   32   65:invokespecial   #34  <Method void Paint()>
	//   33   68:putfield        #54  <Field Paint basicPaint>
		showcaseRadius = resources.getDimension(R.dimen.showcase_radius);
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:getstatic       #59  <Field int R$dimen.showcase_radius>
	//   37   76:invokevirtual   #65  <Method float Resources.getDimension(int)>
	//   38   79:putfield        #67  <Field float showcaseRadius>
		showcaseDrawable = resources.getDrawable(R.drawable.cling_bleached);
	//   39   82:aload_0         
	//   40   83:aload_1         
	//   41   84:getstatic       #72  <Field int R$drawable.cling_bleached>
	//   42   87:invokevirtual   #76  <Method Drawable Resources.getDrawable(int)>
	//   43   90:putfield        #78  <Field Drawable showcaseDrawable>
	//   44   93:return          
	}

	public void drawShowcase(Bitmap bitmap, float f, float f1, float f2)
	{
		bitmap = ((Bitmap) (new Canvas(bitmap)));
	//    0    0:new             #83  <Class Canvas>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #86  <Method void Canvas(Bitmap)>
	//    4    8:astore_1        
		((Canvas) (bitmap)).drawCircle(f, f1, showcaseRadius, eraserPaint);
	//    5    9:aload_1         
	//    6   10:fload_2         
	//    7   11:fload_3         
	//    8   12:aload_0         
	//    9   13:getfield        #67  <Field float showcaseRadius>
	//   10   16:aload_0         
	//   11   17:getfield        #36  <Field Paint eraserPaint>
	//   12   20:invokevirtual   #90  <Method void Canvas.drawCircle(float, float, float, Paint)>
		int j = getShowcaseWidth() / 2;
	//   13   23:aload_0         
	//   14   24:invokevirtual   #94  <Method int getShowcaseWidth()>
	//   15   27:iconst_2        
	//   16   28:idiv            
	//   17   29:istore          6
		int i = getShowcaseHeight() / 2;
	//   18   31:aload_0         
	//   19   32:invokevirtual   #97  <Method int getShowcaseHeight()>
	//   20   35:iconst_2        
	//   21   36:idiv            
	//   22   37:istore          5
		j = (int)(f - (float)j);
	//   23   39:fload_2         
	//   24   40:iload           6
	//   25   42:i2f             
	//   26   43:fsub            
	//   27   44:f2i             
	//   28   45:istore          6
		i = (int)(f1 - (float)i);
	//   29   47:fload_3         
	//   30   48:iload           5
	//   31   50:i2f             
	//   32   51:fsub            
	//   33   52:f2i             
	//   34   53:istore          5
		showcaseDrawable.setBounds(j, i, getShowcaseWidth() + j, getShowcaseHeight() + i);
	//   35   55:aload_0         
	//   36   56:getfield        #78  <Field Drawable showcaseDrawable>
	//   37   59:iload           6
	//   38   61:iload           5
	//   39   63:aload_0         
	//   40   64:invokevirtual   #94  <Method int getShowcaseWidth()>
	//   41   67:iload           6
	//   42   69:iadd            
	//   43   70:aload_0         
	//   44   71:invokevirtual   #97  <Method int getShowcaseHeight()>
	//   45   74:iload           5
	//   46   76:iadd            
	//   47   77:invokevirtual   #103 <Method void Drawable.setBounds(int, int, int, int)>
		showcaseDrawable.draw(((Canvas) (bitmap)));
	//   48   80:aload_0         
	//   49   81:getfield        #78  <Field Drawable showcaseDrawable>
	//   50   84:aload_1         
	//   51   85:invokevirtual   #107 <Method void Drawable.draw(Canvas)>
	//   52   88:return          
	}

	public void drawToCanvas(Canvas canvas, Bitmap bitmap)
	{
		canvas.drawBitmap(bitmap, 0.0F, 0.0F, basicPaint);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:aload_0         
	//    5    5:getfield        #54  <Field Paint basicPaint>
	//    6    8:invokevirtual   #113 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
	//    7   11:return          
	}

	public void erase(Bitmap bitmap)
	{
		bitmap.eraseColor(backgroundColour);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #116 <Field int backgroundColour>
	//    3    5:invokevirtual   #121 <Method void Bitmap.eraseColor(int)>
	//    4    8:return          
	}

	public float getBlockedRadius()
	{
		return showcaseRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field float showcaseRadius>
	//    2    4:freturn         
	}

	public int getShowcaseHeight()
	{
		return showcaseDrawable.getIntrinsicHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Drawable showcaseDrawable>
	//    2    4:invokevirtual   #126 <Method int Drawable.getIntrinsicHeight()>
	//    3    7:ireturn         
	}

	public int getShowcaseWidth()
	{
		return showcaseDrawable.getIntrinsicWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Drawable showcaseDrawable>
	//    2    4:invokevirtual   #129 <Method int Drawable.getIntrinsicWidth()>
	//    3    7:ireturn         
	}

	public void setBackgroundColour(int i)
	{
		backgroundColour = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #116 <Field int backgroundColour>
	//    3    5:return          
	}

	public void setShowcaseColour(int i)
	{
		showcaseDrawable.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Drawable showcaseDrawable>
	//    2    4:iload_1         
	//    3    5:getstatic       #28  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.MULTIPLY>
	//    4    8:invokevirtual   #135 <Method void Drawable.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    5   11:return          
	}

	protected int backgroundColour;
	private final Paint basicPaint = new Paint();
	protected final Paint eraserPaint = new Paint();
	protected final Drawable showcaseDrawable;
	private final float showcaseRadius;
}
