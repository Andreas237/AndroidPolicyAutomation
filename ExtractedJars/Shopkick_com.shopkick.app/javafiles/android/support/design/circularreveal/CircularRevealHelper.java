// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.design.widget.MathUtils;
import android.view.View;
import java.lang.annotation.Annotation;

public class CircularRevealHelper
{
	static interface Delegate
	{

		public abstract void actualDraw(Canvas canvas);

		public abstract boolean actualIsOpaque();
	}

	public static interface Strategy
		extends Annotation
	{
	}


	public CircularRevealHelper(Delegate delegate1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		_flddelegate = delegate1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #53  <Field CircularRevealHelper$Delegate _flddelegate>
		view = (View)delegate1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:checkcast       #55  <Class View>
	//    8   14:putfield        #57  <Field View view>
		view.setWillNotDraw(false);
	//    9   17:aload_0         
	//   10   18:getfield        #57  <Field View view>
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #61  <Method void View.setWillNotDraw(boolean)>
	//   13   25:aload_0         
	//   14   26:new             #63  <Class Path>
	//   15   29:dup             
	//   16   30:invokespecial   #64  <Method void Path()>
	//   17   33:putfield        #66  <Field Path revealPath>
	//   18   36:aload_0         
	//   19   37:new             #68  <Class Paint>
	//   20   40:dup             
	//   21   41:bipush          7
	//   22   43:invokespecial   #71  <Method void Paint(int)>
	//   23   46:putfield        #73  <Field Paint revealPaint>
	//   24   49:aload_0         
	//   25   50:new             #68  <Class Paint>
	//   26   53:dup             
	//   27   54:iconst_1        
	//   28   55:invokespecial   #71  <Method void Paint(int)>
	//   29   58:putfield        #75  <Field Paint scrimPaint>
		scrimPaint.setColor(0);
	//   30   61:aload_0         
	//   31   62:getfield        #75  <Field Paint scrimPaint>
	//   32   65:iconst_0        
	//   33   66:invokevirtual   #78  <Method void Paint.setColor(int)>
	//   34   69:return          
	}

	private void drawDebugCircle(Canvas canvas, int i, float f)
	{
		debugPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field Paint debugPaint>
	//    2    4:iload_2         
	//    3    5:invokevirtual   #78  <Method void Paint.setColor(int)>
		debugPaint.setStrokeWidth(f);
	//    4    8:aload_0         
	//    5    9:getfield        #82  <Field Paint debugPaint>
	//    6   12:fload_3         
	//    7   13:invokevirtual   #86  <Method void Paint.setStrokeWidth(float)>
		canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius - f / 2.0F, debugPaint);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   11   21:getfield        #94  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   12   24:aload_0         
	//   13   25:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   14   28:getfield        #97  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   15   31:aload_0         
	//   16   32:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   17   35:getfield        #100 <Field float CircularRevealWidget$RevealInfo.radius>
	//   18   38:fload_3         
	//   19   39:fconst_2        
	//   20   40:fdiv            
	//   21   41:fsub            
	//   22   42:aload_0         
	//   23   43:getfield        #82  <Field Paint debugPaint>
	//   24   46:invokevirtual   #106 <Method void Canvas.drawCircle(float, float, float, Paint)>
	//   25   49:return          
	}

	private void drawDebugMode(Canvas canvas)
	{
		_flddelegate.actualDraw(canvas);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field CircularRevealHelper$Delegate _flddelegate>
	//    2    4:aload_1         
	//    3    5:invokeinterface #111 <Method void CircularRevealHelper$Delegate.actualDraw(Canvas)>
		if(shouldDrawScrim())
	//*   4   10:aload_0         
	//*   5   11:invokespecial   #115 <Method boolean shouldDrawScrim()>
	//*   6   14:ifeq            46
			canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, scrimPaint);
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   10   22:getfield        #94  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   11   25:aload_0         
	//   12   26:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   13   29:getfield        #97  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   14   32:aload_0         
	//   15   33:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   16   36:getfield        #100 <Field float CircularRevealWidget$RevealInfo.radius>
	//   17   39:aload_0         
	//   18   40:getfield        #75  <Field Paint scrimPaint>
	//   19   43:invokevirtual   #106 <Method void Canvas.drawCircle(float, float, float, Paint)>
		if(shouldDrawCircularReveal())
	//*  20   46:aload_0         
	//*  21   47:invokespecial   #118 <Method boolean shouldDrawCircularReveal()>
	//*  22   50:ifeq            71
		{
			drawDebugCircle(canvas, 0xff000000, 10F);
	//   23   53:aload_0         
	//   24   54:aload_1         
	//   25   55:ldc1            #119 <Int 0xff000000>
	//   26   57:ldc1            #120 <Float 10F>
	//   27   59:invokespecial   #122 <Method void drawDebugCircle(Canvas, int, float)>
			drawDebugCircle(canvas, 0xffff0000, 5F);
	//   28   62:aload_0         
	//   29   63:aload_1         
	//   30   64:ldc1            #123 <Int 0xffff0000>
	//   31   66:ldc1            #124 <Float 5F>
	//   32   68:invokespecial   #122 <Method void drawDebugCircle(Canvas, int, float)>
		}
		drawOverlayDrawable(canvas);
	//   33   71:aload_0         
	//   34   72:aload_1         
	//   35   73:invokespecial   #127 <Method void drawOverlayDrawable(Canvas)>
	//   36   76:return          
	}

	private void drawOverlayDrawable(Canvas canvas)
	{
		if(shouldDrawOverlayDrawable())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #130 <Method boolean shouldDrawOverlayDrawable()>
	//*   2    4:ifeq            72
		{
			Rect rect = overlayDrawable.getBounds();
	//    3    7:aload_0         
	//    4    8:getfield        #132 <Field Drawable overlayDrawable>
	//    5   11:invokevirtual   #138 <Method Rect Drawable.getBounds()>
	//    6   14:astore          4
			float f = revealInfo.centerX - (float)rect.width() / 2.0F;
	//    7   16:aload_0         
	//    8   17:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    9   20:getfield        #94  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   10   23:aload           4
	//   11   25:invokevirtual   #144 <Method int Rect.width()>
	//   12   28:i2f             
	//   13   29:fconst_2        
	//   14   30:fdiv            
	//   15   31:fsub            
	//   16   32:fstore_2        
			float f1 = revealInfo.centerY - (float)rect.height() / 2.0F;
	//   17   33:aload_0         
	//   18   34:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   19   37:getfield        #97  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   20   40:aload           4
	//   21   42:invokevirtual   #147 <Method int Rect.height()>
	//   22   45:i2f             
	//   23   46:fconst_2        
	//   24   47:fdiv            
	//   25   48:fsub            
	//   26   49:fstore_3        
			canvas.translate(f, f1);
	//   27   50:aload_1         
	//   28   51:fload_2         
	//   29   52:fload_3         
	//   30   53:invokevirtual   #151 <Method void Canvas.translate(float, float)>
			overlayDrawable.draw(canvas);
	//   31   56:aload_0         
	//   32   57:getfield        #132 <Field Drawable overlayDrawable>
	//   33   60:aload_1         
	//   34   61:invokevirtual   #154 <Method void Drawable.draw(Canvas)>
			canvas.translate(-f, -f1);
	//   35   64:aload_1         
	//   36   65:fload_2         
	//   37   66:fneg            
	//   38   67:fload_3         
	//   39   68:fneg            
	//   40   69:invokevirtual   #151 <Method void Canvas.translate(float, float)>
		}
	//   41   72:return          
	}

	private float getDistanceToFurthestCorner(CircularRevealWidget.RevealInfo revealinfo)
	{
		return MathUtils.distanceToFurthestCorner(revealinfo.centerX, revealinfo.centerY, 0.0F, 0.0F, view.getWidth(), view.getHeight());
	//    0    0:aload_1         
	//    1    1:getfield        #94  <Field float CircularRevealWidget$RevealInfo.centerX>
	//    2    4:aload_1         
	//    3    5:getfield        #97  <Field float CircularRevealWidget$RevealInfo.centerY>
	//    4    8:fconst_0        
	//    5    9:fconst_0        
	//    6   10:aload_0         
	//    7   11:getfield        #57  <Field View view>
	//    8   14:invokevirtual   #159 <Method int View.getWidth()>
	//    9   17:i2f             
	//   10   18:aload_0         
	//   11   19:getfield        #57  <Field View view>
	//   12   22:invokevirtual   #162 <Method int View.getHeight()>
	//   13   25:i2f             
	//   14   26:invokestatic    #168 <Method float MathUtils.distanceToFurthestCorner(float, float, float, float, float, float)>
	//   15   29:freturn         
	}

	private void invalidateRevealInfo()
	{
		if(STRATEGY == 1)
	//*   0    0:getstatic       #46  <Field int STRATEGY>
	//*   1    3:iconst_1        
	//*   2    4:icmpne          51
		{
			revealPath.rewind();
	//    3    7:aload_0         
	//    4    8:getfield        #66  <Field Path revealPath>
	//    5   11:invokevirtual   #172 <Method void Path.rewind()>
			CircularRevealWidget.RevealInfo revealinfo = revealInfo;
	//    6   14:aload_0         
	//    7   15:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    8   18:astore_1        
			if(revealinfo != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          51
				revealPath.addCircle(revealinfo.centerX, revealInfo.centerY, revealInfo.radius, android.graphics.Path.Direction.CW);
	//   11   23:aload_0         
	//   12   24:getfield        #66  <Field Path revealPath>
	//   13   27:aload_1         
	//   14   28:getfield        #94  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   15   31:aload_0         
	//   16   32:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   17   35:getfield        #97  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   18   38:aload_0         
	//   19   39:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   20   42:getfield        #100 <Field float CircularRevealWidget$RevealInfo.radius>
	//   21   45:getstatic       #178 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
	//   22   48:invokevirtual   #182 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
		}
		view.invalidate();
	//   23   51:aload_0         
	//   24   52:getfield        #57  <Field View view>
	//   25   55:invokevirtual   #185 <Method void View.invalidate()>
	//   26   58:return          
	}

	private boolean shouldDrawCircularReveal()
	{
		CircularRevealWidget.RevealInfo revealinfo = revealInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    2    4:astore          4
		boolean flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag;
		if(revealinfo != null && !revealinfo.isInvalid())
	//*   5    8:aload           4
	//*   6   10:ifnull          29
	//*   7   13:aload           4
	//*   8   15:invokevirtual   #188 <Method boolean CircularRevealWidget$RevealInfo.isInvalid()>
	//*   9   18:ifeq            24
	//*  10   21:goto            29
			flag = false;
	//   11   24:iconst_0        
	//   12   25:istore_1        
		else
	//*  13   26:goto            31
			flag = true;
	//   14   29:iconst_1        
	//   15   30:istore_1        
		if(STRATEGY == 0)
	//*  16   31:getstatic       #46  <Field int STRATEGY>
	//*  17   34:ifne            56
		{
			boolean flag1 = flag2;
	//   18   37:iload_3         
	//   19   38:istore_2        
			if(!flag)
	//*  20   39:iload_1         
	//*  21   40:ifne            54
			{
				flag1 = flag2;
	//   22   43:iload_3         
	//   23   44:istore_2        
				if(hasCircularRevealCache)
	//*  24   45:aload_0         
	//*  25   46:getfield        #190 <Field boolean hasCircularRevealCache>
	//*  26   49:ifeq            54
					flag1 = true;
	//   27   52:iconst_1        
	//   28   53:istore_2        
			}
			return flag1;
	//   29   54:iload_2         
	//   30   55:ireturn         
		} else
		{
			return flag ^ true;
	//   31   56:iload_1         
	//   32   57:iconst_1        
	//   33   58:ixor            
	//   34   59:ireturn         
		}
	}

	private boolean shouldDrawOverlayDrawable()
	{
		return !buildingCircularRevealCache && overlayDrawable != null && revealInfo != null;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field boolean buildingCircularRevealCache>
	//    2    4:ifne            23
	//    3    7:aload_0         
	//    4    8:getfield        #132 <Field Drawable overlayDrawable>
	//    5   11:ifnull          23
	//    6   14:aload_0         
	//    7   15:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    8   18:ifnull          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private boolean shouldDrawScrim()
	{
		return !buildingCircularRevealCache && Color.alpha(scrimPaint.getColor()) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field boolean buildingCircularRevealCache>
	//    2    4:ifne            22
	//    3    7:aload_0         
	//    4    8:getfield        #75  <Field Paint scrimPaint>
	//    5   11:invokevirtual   #195 <Method int Paint.getColor()>
	//    6   14:invokestatic    #201 <Method int Color.alpha(int)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public void buildCircularRevealCache()
	{
		if(STRATEGY == 0)
	//*   0    0:getstatic       #46  <Field int STRATEGY>
	//*   1    3:ifne            135
		{
			buildingCircularRevealCache = true;
	//    2    6:aload_0         
	//    3    7:iconst_1        
	//    4    8:putfield        #192 <Field boolean buildingCircularRevealCache>
			hasCircularRevealCache = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #190 <Field boolean hasCircularRevealCache>
			view.buildDrawingCache();
	//    8   16:aload_0         
	//    9   17:getfield        #57  <Field View view>
	//   10   20:invokevirtual   #205 <Method void View.buildDrawingCache()>
			Bitmap bitmap1 = view.getDrawingCache();
	//   11   23:aload_0         
	//   12   24:getfield        #57  <Field View view>
	//   13   27:invokevirtual   #209 <Method Bitmap View.getDrawingCache()>
	//   14   30:astore_2        
			Bitmap bitmap = bitmap1;
	//   15   31:aload_2         
	//   16   32:astore_1        
			if(bitmap1 == null)
	//*  17   33:aload_2         
	//*  18   34:ifnonnull       99
			{
				bitmap = bitmap1;
	//   19   37:aload_2         
	//   20   38:astore_1        
				if(view.getWidth() != 0)
	//*  21   39:aload_0         
	//*  22   40:getfield        #57  <Field View view>
	//*  23   43:invokevirtual   #159 <Method int View.getWidth()>
	//*  24   46:ifeq            99
				{
					bitmap = bitmap1;
	//   25   49:aload_2         
	//   26   50:astore_1        
					if(view.getHeight() != 0)
	//*  27   51:aload_0         
	//*  28   52:getfield        #57  <Field View view>
	//*  29   55:invokevirtual   #162 <Method int View.getHeight()>
	//*  30   58:ifeq            99
					{
						bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//   31   61:aload_0         
	//   32   62:getfield        #57  <Field View view>
	//   33   65:invokevirtual   #159 <Method int View.getWidth()>
	//   34   68:aload_0         
	//   35   69:getfield        #57  <Field View view>
	//   36   72:invokevirtual   #162 <Method int View.getHeight()>
	//   37   75:getstatic       #215 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   38   78:invokestatic    #221 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   39   81:astore_1        
						Canvas canvas = new Canvas(bitmap);
	//   40   82:new             #102 <Class Canvas>
	//   41   85:dup             
	//   42   86:aload_1         
	//   43   87:invokespecial   #224 <Method void Canvas(Bitmap)>
	//   44   90:astore_2        
						view.draw(canvas);
	//   45   91:aload_0         
	//   46   92:getfield        #57  <Field View view>
	//   47   95:aload_2         
	//   48   96:invokevirtual   #225 <Method void View.draw(Canvas)>
					}
				}
			}
			if(bitmap != null)
	//*  49   99:aload_1         
	//*  50  100:ifnull          125
				revealPaint.setShader(((android.graphics.Shader) (new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP))));
	//   51  103:aload_0         
	//   52  104:getfield        #73  <Field Paint revealPaint>
	//   53  107:new             #227 <Class BitmapShader>
	//   54  110:dup             
	//   55  111:aload_1         
	//   56  112:getstatic       #233 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   57  115:getstatic       #233 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   58  118:invokespecial   #236 <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//   59  121:invokevirtual   #240 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   60  124:pop             
			buildingCircularRevealCache = false;
	//   61  125:aload_0         
	//   62  126:iconst_0        
	//   63  127:putfield        #192 <Field boolean buildingCircularRevealCache>
			hasCircularRevealCache = true;
	//   64  130:aload_0         
	//   65  131:iconst_1        
	//   66  132:putfield        #190 <Field boolean hasCircularRevealCache>
		}
	//   67  135:return          
	}

	public void destroyCircularRevealCache()
	{
		if(STRATEGY == 0)
	//*   0    0:getstatic       #46  <Field int STRATEGY>
	//*   1    3:ifne            34
		{
			hasCircularRevealCache = false;
	//    2    6:aload_0         
	//    3    7:iconst_0        
	//    4    8:putfield        #190 <Field boolean hasCircularRevealCache>
			view.destroyDrawingCache();
	//    5   11:aload_0         
	//    6   12:getfield        #57  <Field View view>
	//    7   15:invokevirtual   #244 <Method void View.destroyDrawingCache()>
			revealPaint.setShader(((android.graphics.Shader) (null)));
	//    8   18:aload_0         
	//    9   19:getfield        #73  <Field Paint revealPaint>
	//   10   22:aconst_null     
	//   11   23:invokevirtual   #240 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   12   26:pop             
			view.invalidate();
	//   13   27:aload_0         
	//   14   28:getfield        #57  <Field View view>
	//   15   31:invokevirtual   #185 <Method void View.invalidate()>
		}
	//   16   34:return          
	}

	public void draw(Canvas canvas)
	{
		if(shouldDrawCircularReveal())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #118 <Method boolean shouldDrawCircularReveal()>
	//*   2    4:ifeq            250
		{
			switch(STRATEGY)
	//*   3    7:getstatic       #46  <Field int STRATEGY>
			{
	//*   4   10:tableswitch     0 2: default 36
	//	               0 182
	//	               1 117
	//	               2 71
			default:
				canvas = ((Canvas) (new StringBuilder()));
	//    5   36:new             #246 <Class StringBuilder>
	//    6   39:dup             
	//    7   40:invokespecial   #247 <Method void StringBuilder()>
	//    8   43:astore_1        
				((StringBuilder) (canvas)).append("Unsupported strategy ");
	//    9   44:aload_1         
	//   10   45:ldc1            #249 <String "Unsupported strategy ">
	//   11   47:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   12   50:pop             
				((StringBuilder) (canvas)).append(STRATEGY);
	//   13   51:aload_1         
	//   14   52:getstatic       #46  <Field int STRATEGY>
	//   15   55:invokevirtual   #256 <Method StringBuilder StringBuilder.append(int)>
	//   16   58:pop             
				throw new IllegalStateException(((StringBuilder) (canvas)).toString());
	//   17   59:new             #258 <Class IllegalStateException>
	//   18   62:dup             
	//   19   63:aload_1         
	//   20   64:invokevirtual   #262 <Method String StringBuilder.toString()>
	//   21   67:invokespecial   #265 <Method void IllegalStateException(String)>
	//   22   70:athrow          

			case 2: // '\002'
				_flddelegate.actualDraw(canvas);
	//   23   71:aload_0         
	//   24   72:getfield        #53  <Field CircularRevealHelper$Delegate _flddelegate>
	//   25   75:aload_1         
	//   26   76:invokeinterface #111 <Method void CircularRevealHelper$Delegate.actualDraw(Canvas)>
				if(shouldDrawScrim())
	//*  27   81:aload_0         
	//*  28   82:invokespecial   #115 <Method boolean shouldDrawScrim()>
	//*  29   85:ifeq            293
					canvas.drawRect(0.0F, 0.0F, view.getWidth(), view.getHeight(), scrimPaint);
	//   30   88:aload_1         
	//   31   89:fconst_0        
	//   32   90:fconst_0        
	//   33   91:aload_0         
	//   34   92:getfield        #57  <Field View view>
	//   35   95:invokevirtual   #159 <Method int View.getWidth()>
	//   36   98:i2f             
	//   37   99:aload_0         
	//   38  100:getfield        #57  <Field View view>
	//   39  103:invokevirtual   #162 <Method int View.getHeight()>
	//   40  106:i2f             
	//   41  107:aload_0         
	//   42  108:getfield        #75  <Field Paint scrimPaint>
	//   43  111:invokevirtual   #269 <Method void Canvas.drawRect(float, float, float, float, Paint)>
				break;

	//*  44  114:goto            293
			case 1: // '\001'
				int i = canvas.save();
	//   45  117:aload_1         
	//   46  118:invokevirtual   #272 <Method int Canvas.save()>
	//   47  121:istore_2        
				canvas.clipPath(revealPath);
	//   48  122:aload_1         
	//   49  123:aload_0         
	//   50  124:getfield        #66  <Field Path revealPath>
	//   51  127:invokevirtual   #276 <Method boolean Canvas.clipPath(Path)>
	//   52  130:pop             
				_flddelegate.actualDraw(canvas);
	//   53  131:aload_0         
	//   54  132:getfield        #53  <Field CircularRevealHelper$Delegate _flddelegate>
	//   55  135:aload_1         
	//   56  136:invokeinterface #111 <Method void CircularRevealHelper$Delegate.actualDraw(Canvas)>
				if(shouldDrawScrim())
	//*  57  141:aload_0         
	//*  58  142:invokespecial   #115 <Method boolean shouldDrawScrim()>
	//*  59  145:ifeq            174
					canvas.drawRect(0.0F, 0.0F, view.getWidth(), view.getHeight(), scrimPaint);
	//   60  148:aload_1         
	//   61  149:fconst_0        
	//   62  150:fconst_0        
	//   63  151:aload_0         
	//   64  152:getfield        #57  <Field View view>
	//   65  155:invokevirtual   #159 <Method int View.getWidth()>
	//   66  158:i2f             
	//   67  159:aload_0         
	//   68  160:getfield        #57  <Field View view>
	//   69  163:invokevirtual   #162 <Method int View.getHeight()>
	//   70  166:i2f             
	//   71  167:aload_0         
	//   72  168:getfield        #75  <Field Paint scrimPaint>
	//   73  171:invokevirtual   #269 <Method void Canvas.drawRect(float, float, float, float, Paint)>
				canvas.restoreToCount(i);
	//   74  174:aload_1         
	//   75  175:iload_2         
	//   76  176:invokevirtual   #279 <Method void Canvas.restoreToCount(int)>
				break;

	//*  77  179:goto            293
			case 0: // '\0'
				canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, revealPaint);
	//   78  182:aload_1         
	//   79  183:aload_0         
	//   80  184:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   81  187:getfield        #94  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   82  190:aload_0         
	//   83  191:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   84  194:getfield        #97  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   85  197:aload_0         
	//   86  198:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   87  201:getfield        #100 <Field float CircularRevealWidget$RevealInfo.radius>
	//   88  204:aload_0         
	//   89  205:getfield        #73  <Field Paint revealPaint>
	//   90  208:invokevirtual   #106 <Method void Canvas.drawCircle(float, float, float, Paint)>
				if(shouldDrawScrim())
	//*  91  211:aload_0         
	//*  92  212:invokespecial   #115 <Method boolean shouldDrawScrim()>
	//*  93  215:ifeq            293
					canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, scrimPaint);
	//   94  218:aload_1         
	//   95  219:aload_0         
	//   96  220:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   97  223:getfield        #94  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   98  226:aload_0         
	//   99  227:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//  100  230:getfield        #97  <Field float CircularRevealWidget$RevealInfo.centerY>
	//  101  233:aload_0         
	//  102  234:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//  103  237:getfield        #100 <Field float CircularRevealWidget$RevealInfo.radius>
	//  104  240:aload_0         
	//  105  241:getfield        #75  <Field Paint scrimPaint>
	//  106  244:invokevirtual   #106 <Method void Canvas.drawCircle(float, float, float, Paint)>
				break;
			}
		} else
	//* 107  247:goto            293
		{
			_flddelegate.actualDraw(canvas);
	//  108  250:aload_0         
	//  109  251:getfield        #53  <Field CircularRevealHelper$Delegate _flddelegate>
	//  110  254:aload_1         
	//  111  255:invokeinterface #111 <Method void CircularRevealHelper$Delegate.actualDraw(Canvas)>
			if(shouldDrawScrim())
	//* 112  260:aload_0         
	//* 113  261:invokespecial   #115 <Method boolean shouldDrawScrim()>
	//* 114  264:ifeq            293
				canvas.drawRect(0.0F, 0.0F, view.getWidth(), view.getHeight(), scrimPaint);
	//  115  267:aload_1         
	//  116  268:fconst_0        
	//  117  269:fconst_0        
	//  118  270:aload_0         
	//  119  271:getfield        #57  <Field View view>
	//  120  274:invokevirtual   #159 <Method int View.getWidth()>
	//  121  277:i2f             
	//  122  278:aload_0         
	//  123  279:getfield        #57  <Field View view>
	//  124  282:invokevirtual   #162 <Method int View.getHeight()>
	//  125  285:i2f             
	//  126  286:aload_0         
	//  127  287:getfield        #75  <Field Paint scrimPaint>
	//  128  290:invokevirtual   #269 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		drawOverlayDrawable(canvas);
	//  129  293:aload_0         
	//  130  294:aload_1         
	//  131  295:invokespecial   #127 <Method void drawOverlayDrawable(Canvas)>
	//  132  298:return          
	}

	public Drawable getCircularRevealOverlayDrawable()
	{
		return overlayDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field Drawable overlayDrawable>
	//    2    4:areturn         
	}

	public int getCircularRevealScrimColor()
	{
		return scrimPaint.getColor();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Paint scrimPaint>
	//    2    4:invokevirtual   #195 <Method int Paint.getColor()>
	//    3    7:ireturn         
	}

	public CircularRevealWidget.RevealInfo getRevealInfo()
	{
		CircularRevealWidget.RevealInfo revealinfo = revealInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    2    4:astore_1        
		if(revealinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		revealinfo = new CircularRevealWidget.RevealInfo(revealinfo);
	//    7   11:new             #90  <Class CircularRevealWidget$RevealInfo>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #289 <Method void CircularRevealWidget$RevealInfo(CircularRevealWidget$RevealInfo)>
	//   11   19:astore_1        
		if(revealinfo.isInvalid())
	//*  12   20:aload_1         
	//*  13   21:invokevirtual   #188 <Method boolean CircularRevealWidget$RevealInfo.isInvalid()>
	//*  14   24:ifeq            36
			revealinfo.radius = getDistanceToFurthestCorner(revealinfo);
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokespecial   #291 <Method float getDistanceToFurthestCorner(CircularRevealWidget$RevealInfo)>
	//   19   33:putfield        #100 <Field float CircularRevealWidget$RevealInfo.radius>
		return revealinfo;
	//   20   36:aload_1         
	//   21   37:areturn         
	}

	public boolean isOpaque()
	{
		return _flddelegate.actualIsOpaque() && !shouldDrawCircularReveal();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field CircularRevealHelper$Delegate _flddelegate>
	//    2    4:invokeinterface #295 <Method boolean CircularRevealHelper$Delegate.actualIsOpaque()>
	//    3    9:ifeq            21
	//    4   12:aload_0         
	//    5   13:invokespecial   #118 <Method boolean shouldDrawCircularReveal()>
	//    6   16:ifne            21
	//    7   19:iconst_1        
	//    8   20:ireturn         
	//    9   21:iconst_0        
	//   10   22:ireturn         
	}

	public void setCircularRevealOverlayDrawable(Drawable drawable)
	{
		overlayDrawable = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field Drawable overlayDrawable>
		view.invalidate();
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field View view>
	//    5    9:invokevirtual   #185 <Method void View.invalidate()>
	//    6   12:return          
	}

	public void setCircularRevealScrimColor(int i)
	{
		scrimPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Paint scrimPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #78  <Method void Paint.setColor(int)>
		view.invalidate();
	//    4    8:aload_0         
	//    5    9:getfield        #57  <Field View view>
	//    6   12:invokevirtual   #185 <Method void View.invalidate()>
	//    7   15:return          
	}

	public void setRevealInfo(CircularRevealWidget.RevealInfo revealinfo)
	{
		if(revealinfo == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			revealInfo = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
		} else
	//*   5    9:goto            69
		{
			CircularRevealWidget.RevealInfo revealinfo1 = revealInfo;
	//    6   12:aload_0         
	//    7   13:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    8   16:astore_2        
			if(revealinfo1 == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       36
				revealInfo = new CircularRevealWidget.RevealInfo(revealinfo);
	//   11   21:aload_0         
	//   12   22:new             #90  <Class CircularRevealWidget$RevealInfo>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokespecial   #289 <Method void CircularRevealWidget$RevealInfo(CircularRevealWidget$RevealInfo)>
	//   16   30:putfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
			else
	//*  17   33:goto            41
				revealinfo1.set(revealinfo);
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #303 <Method void CircularRevealWidget$RevealInfo.set(CircularRevealWidget$RevealInfo)>
			if(MathUtils.geq(revealinfo.radius, getDistanceToFurthestCorner(revealinfo), 0.0001F))
	//*  21   41:aload_1         
	//*  22   42:getfield        #100 <Field float CircularRevealWidget$RevealInfo.radius>
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:invokespecial   #291 <Method float getDistanceToFurthestCorner(CircularRevealWidget$RevealInfo)>
	//*  26   50:ldc2            #304 <Float 0.0001F>
	//*  27   53:invokestatic    #308 <Method boolean MathUtils.geq(float, float, float)>
	//*  28   56:ifeq            69
				revealInfo.radius = 3.402823E+38F;
	//   29   59:aload_0         
	//   30   60:getfield        #88  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   31   63:ldc2            #309 <Float 3.402823E+38F>
	//   32   66:putfield        #100 <Field float CircularRevealWidget$RevealInfo.radius>
		}
		invalidateRevealInfo();
	//   33   69:aload_0         
	//   34   70:invokespecial   #311 <Method void invalidateRevealInfo()>
	//   35   73:return          
	}

	public static final int BITMAP_SHADER = 0;
	public static final int CLIP_PATH = 1;
	private static final boolean DEBUG = false;
	public static final int REVEAL_ANIMATOR = 2;
	public static final int STRATEGY;
	private boolean buildingCircularRevealCache;
	private Paint debugPaint;
	private final Delegate _flddelegate;
	private boolean hasCircularRevealCache;
	private Drawable overlayDrawable;
	private CircularRevealWidget.RevealInfo revealInfo;
	private final Paint revealPaint = new Paint(7);
	private final Path revealPath = new Path();
	private final Paint scrimPaint = new Paint(1);
	private final View view;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			STRATEGY = 2;
	//    3    8:iconst_2        
	//    4    9:putstatic       #46  <Field int STRATEGY>
	//    5   12:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   6   13:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          18
	//*   8   18:icmplt          26
			STRATEGY = 1;
	//    9   21:iconst_1        
	//   10   22:putstatic       #46  <Field int STRATEGY>
	//   11   25:return          
		else
			STRATEGY = 0;
	//   12   26:iconst_0        
	//   13   27:putstatic       #46  <Field int STRATEGY>
	//*  14   30:return          
	}
}
