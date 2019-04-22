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


	private void drawOverlayDrawable(Canvas canvas)
	{
		if(shouldDrawOverlayDrawable())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #45  <Method boolean shouldDrawOverlayDrawable()>
	//*   2    4:ifeq            72
		{
			Rect rect = overlayDrawable.getBounds();
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field Drawable overlayDrawable>
	//    5   11:invokevirtual   #53  <Method Rect Drawable.getBounds()>
	//    6   14:astore          4
			float f = revealInfo.centerX - (float)rect.width() / 2.0F;
	//    7   16:aload_0         
	//    8   17:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    9   20:getfield        #61  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   10   23:aload           4
	//   11   25:invokevirtual   #67  <Method int Rect.width()>
	//   12   28:i2f             
	//   13   29:fconst_2        
	//   14   30:fdiv            
	//   15   31:fsub            
	//   16   32:fstore_2        
			float f1 = revealInfo.centerY - (float)rect.height() / 2.0F;
	//   17   33:aload_0         
	//   18   34:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   19   37:getfield        #70  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   20   40:aload           4
	//   21   42:invokevirtual   #73  <Method int Rect.height()>
	//   22   45:i2f             
	//   23   46:fconst_2        
	//   24   47:fdiv            
	//   25   48:fsub            
	//   26   49:fstore_3        
			canvas.translate(f, f1);
	//   27   50:aload_1         
	//   28   51:fload_2         
	//   29   52:fload_3         
	//   30   53:invokevirtual   #79  <Method void Canvas.translate(float, float)>
			overlayDrawable.draw(canvas);
	//   31   56:aload_0         
	//   32   57:getfield        #47  <Field Drawable overlayDrawable>
	//   33   60:aload_1         
	//   34   61:invokevirtual   #82  <Method void Drawable.draw(Canvas)>
			canvas.translate(-f, -f1);
	//   35   64:aload_1         
	//   36   65:fload_2         
	//   37   66:fneg            
	//   38   67:fload_3         
	//   39   68:fneg            
	//   40   69:invokevirtual   #79  <Method void Canvas.translate(float, float)>
		}
	//   41   72:return          
	}

	private float getDistanceToFurthestCorner(CircularRevealWidget.RevealInfo revealinfo)
	{
		return MathUtils.distanceToFurthestCorner(revealinfo.centerX, revealinfo.centerY, 0.0F, 0.0F, view.getWidth(), view.getHeight());
	//    0    0:aload_1         
	//    1    1:getfield        #61  <Field float CircularRevealWidget$RevealInfo.centerX>
	//    2    4:aload_1         
	//    3    5:getfield        #70  <Field float CircularRevealWidget$RevealInfo.centerY>
	//    4    8:fconst_0        
	//    5    9:fconst_0        
	//    6   10:aload_0         
	//    7   11:getfield        #86  <Field View view>
	//    8   14:invokevirtual   #91  <Method int View.getWidth()>
	//    9   17:i2f             
	//   10   18:aload_0         
	//   11   19:getfield        #86  <Field View view>
	//   12   22:invokevirtual   #94  <Method int View.getHeight()>
	//   13   25:i2f             
	//   14   26:invokestatic    #100 <Method float MathUtils.distanceToFurthestCorner(float, float, float, float, float, float)>
	//   15   29:freturn         
	}

	private void invalidateRevealInfo()
	{
		if(STRATEGY == 1)
	//*   0    0:getstatic       #38  <Field int STRATEGY>
	//*   1    3:iconst_1        
	//*   2    4:icmpne          51
		{
			revealPath.rewind();
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field Path revealPath>
	//    5   11:invokevirtual   #108 <Method void Path.rewind()>
			CircularRevealWidget.RevealInfo revealinfo = revealInfo;
	//    6   14:aload_0         
	//    7   15:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    8   18:astore_1        
			if(revealinfo != null)
	//*   9   19:aload_1         
	//*  10   20:ifnull          51
				revealPath.addCircle(revealinfo.centerX, revealInfo.centerY, revealInfo.radius, android.graphics.Path.Direction.CW);
	//   11   23:aload_0         
	//   12   24:getfield        #103 <Field Path revealPath>
	//   13   27:aload_1         
	//   14   28:getfield        #61  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   15   31:aload_0         
	//   16   32:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   17   35:getfield        #70  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   18   38:aload_0         
	//   19   39:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   20   42:getfield        #111 <Field float CircularRevealWidget$RevealInfo.radius>
	//   21   45:getstatic       #117 <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
	//   22   48:invokevirtual   #121 <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
		}
		view.invalidate();
	//   23   51:aload_0         
	//   24   52:getfield        #86  <Field View view>
	//   25   55:invokevirtual   #124 <Method void View.invalidate()>
	//   26   58:return          
	}

	private boolean shouldDrawCircularReveal()
	{
		CircularRevealWidget.RevealInfo revealinfo = revealInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    2    4:astore          4
		boolean flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag;
		if(revealinfo != null && !revealinfo.isInvalid())
	//*   5    8:aload           4
	//*   6   10:ifnull          29
	//*   7   13:aload           4
	//*   8   15:invokevirtual   #128 <Method boolean CircularRevealWidget$RevealInfo.isInvalid()>
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
	//*  16   31:getstatic       #38  <Field int STRATEGY>
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
	//*  25   46:getfield        #130 <Field boolean hasCircularRevealCache>
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
	//    1    1:getfield        #132 <Field boolean buildingCircularRevealCache>
	//    2    4:ifne            23
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field Drawable overlayDrawable>
	//    5   11:ifnull          23
	//    6   14:aload_0         
	//    7   15:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
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
	//    1    1:getfield        #132 <Field boolean buildingCircularRevealCache>
	//    2    4:ifne            22
	//    3    7:aload_0         
	//    4    8:getfield        #135 <Field Paint scrimPaint>
	//    5   11:invokevirtual   #140 <Method int Paint.getColor()>
	//    6   14:invokestatic    #146 <Method int Color.alpha(int)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public void buildCircularRevealCache()
	{
		if(STRATEGY == 0)
	//*   0    0:getstatic       #38  <Field int STRATEGY>
	//*   1    3:ifne            135
		{
			buildingCircularRevealCache = true;
	//    2    6:aload_0         
	//    3    7:iconst_1        
	//    4    8:putfield        #132 <Field boolean buildingCircularRevealCache>
			hasCircularRevealCache = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #130 <Field boolean hasCircularRevealCache>
			view.buildDrawingCache();
	//    8   16:aload_0         
	//    9   17:getfield        #86  <Field View view>
	//   10   20:invokevirtual   #150 <Method void View.buildDrawingCache()>
			Bitmap bitmap1 = view.getDrawingCache();
	//   11   23:aload_0         
	//   12   24:getfield        #86  <Field View view>
	//   13   27:invokevirtual   #154 <Method Bitmap View.getDrawingCache()>
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
	//*  22   40:getfield        #86  <Field View view>
	//*  23   43:invokevirtual   #91  <Method int View.getWidth()>
	//*  24   46:ifeq            99
				{
					bitmap = bitmap1;
	//   25   49:aload_2         
	//   26   50:astore_1        
					if(view.getHeight() != 0)
	//*  27   51:aload_0         
	//*  28   52:getfield        #86  <Field View view>
	//*  29   55:invokevirtual   #94  <Method int View.getHeight()>
	//*  30   58:ifeq            99
					{
						bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//   31   61:aload_0         
	//   32   62:getfield        #86  <Field View view>
	//   33   65:invokevirtual   #91  <Method int View.getWidth()>
	//   34   68:aload_0         
	//   35   69:getfield        #86  <Field View view>
	//   36   72:invokevirtual   #94  <Method int View.getHeight()>
	//   37   75:getstatic       #160 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   38   78:invokestatic    #166 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   39   81:astore_1        
						Canvas canvas = new Canvas(bitmap);
	//   40   82:new             #75  <Class Canvas>
	//   41   85:dup             
	//   42   86:aload_1         
	//   43   87:invokespecial   #170 <Method void Canvas(Bitmap)>
	//   44   90:astore_2        
						view.draw(canvas);
	//   45   91:aload_0         
	//   46   92:getfield        #86  <Field View view>
	//   47   95:aload_2         
	//   48   96:invokevirtual   #171 <Method void View.draw(Canvas)>
					}
				}
			}
			if(bitmap != null)
	//*  49   99:aload_1         
	//*  50  100:ifnull          125
				revealPaint.setShader(((android.graphics.Shader) (new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP))));
	//   51  103:aload_0         
	//   52  104:getfield        #173 <Field Paint revealPaint>
	//   53  107:new             #175 <Class BitmapShader>
	//   54  110:dup             
	//   55  111:aload_1         
	//   56  112:getstatic       #181 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   57  115:getstatic       #181 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   58  118:invokespecial   #184 <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//   59  121:invokevirtual   #188 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   60  124:pop             
			buildingCircularRevealCache = false;
	//   61  125:aload_0         
	//   62  126:iconst_0        
	//   63  127:putfield        #132 <Field boolean buildingCircularRevealCache>
			hasCircularRevealCache = true;
	//   64  130:aload_0         
	//   65  131:iconst_1        
	//   66  132:putfield        #130 <Field boolean hasCircularRevealCache>
		}
	//   67  135:return          
	}

	public void destroyCircularRevealCache()
	{
		if(STRATEGY == 0)
	//*   0    0:getstatic       #38  <Field int STRATEGY>
	//*   1    3:ifne            34
		{
			hasCircularRevealCache = false;
	//    2    6:aload_0         
	//    3    7:iconst_0        
	//    4    8:putfield        #130 <Field boolean hasCircularRevealCache>
			view.destroyDrawingCache();
	//    5   11:aload_0         
	//    6   12:getfield        #86  <Field View view>
	//    7   15:invokevirtual   #192 <Method void View.destroyDrawingCache()>
			revealPaint.setShader(((android.graphics.Shader) (null)));
	//    8   18:aload_0         
	//    9   19:getfield        #173 <Field Paint revealPaint>
	//   10   22:aconst_null     
	//   11   23:invokevirtual   #188 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   12   26:pop             
			view.invalidate();
	//   13   27:aload_0         
	//   14   28:getfield        #86  <Field View view>
	//   15   31:invokevirtual   #124 <Method void View.invalidate()>
		}
	//   16   34:return          
	}

	public void draw(Canvas canvas)
	{
		if(shouldDrawCircularReveal())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #194 <Method boolean shouldDrawCircularReveal()>
	//*   2    4:ifeq            250
		{
			switch(STRATEGY)
	//*   3    7:getstatic       #38  <Field int STRATEGY>
			{
	//*   4   10:tableswitch     0 2: default 36
	//	               0 182
	//	               1 117
	//	               2 71
			default:
				canvas = ((Canvas) (new StringBuilder()));
	//    5   36:new             #196 <Class StringBuilder>
	//    6   39:dup             
	//    7   40:invokespecial   #198 <Method void StringBuilder()>
	//    8   43:astore_1        
				((StringBuilder) (canvas)).append("Unsupported strategy ");
	//    9   44:aload_1         
	//   10   45:ldc1            #200 <String "Unsupported strategy ">
	//   11   47:invokevirtual   #204 <Method StringBuilder StringBuilder.append(String)>
	//   12   50:pop             
				((StringBuilder) (canvas)).append(STRATEGY);
	//   13   51:aload_1         
	//   14   52:getstatic       #38  <Field int STRATEGY>
	//   15   55:invokevirtual   #207 <Method StringBuilder StringBuilder.append(int)>
	//   16   58:pop             
				throw new IllegalStateException(((StringBuilder) (canvas)).toString());
	//   17   59:new             #209 <Class IllegalStateException>
	//   18   62:dup             
	//   19   63:aload_1         
	//   20   64:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   21   67:invokespecial   #216 <Method void IllegalStateException(String)>
	//   22   70:athrow          

			case 2: // '\002'
				_flddelegate.actualDraw(canvas);
	//   23   71:aload_0         
	//   24   72:getfield        #218 <Field CircularRevealHelper$Delegate _flddelegate>
	//   25   75:aload_1         
	//   26   76:invokeinterface #221 <Method void CircularRevealHelper$Delegate.actualDraw(Canvas)>
				if(shouldDrawScrim())
	//*  27   81:aload_0         
	//*  28   82:invokespecial   #223 <Method boolean shouldDrawScrim()>
	//*  29   85:ifeq            293
					canvas.drawRect(0.0F, 0.0F, view.getWidth(), view.getHeight(), scrimPaint);
	//   30   88:aload_1         
	//   31   89:fconst_0        
	//   32   90:fconst_0        
	//   33   91:aload_0         
	//   34   92:getfield        #86  <Field View view>
	//   35   95:invokevirtual   #91  <Method int View.getWidth()>
	//   36   98:i2f             
	//   37   99:aload_0         
	//   38  100:getfield        #86  <Field View view>
	//   39  103:invokevirtual   #94  <Method int View.getHeight()>
	//   40  106:i2f             
	//   41  107:aload_0         
	//   42  108:getfield        #135 <Field Paint scrimPaint>
	//   43  111:invokevirtual   #227 <Method void Canvas.drawRect(float, float, float, float, Paint)>
				break;

	//*  44  114:goto            293
			case 1: // '\001'
				int i = canvas.save();
	//   45  117:aload_1         
	//   46  118:invokevirtual   #230 <Method int Canvas.save()>
	//   47  121:istore_2        
				canvas.clipPath(revealPath);
	//   48  122:aload_1         
	//   49  123:aload_0         
	//   50  124:getfield        #103 <Field Path revealPath>
	//   51  127:invokevirtual   #234 <Method boolean Canvas.clipPath(Path)>
	//   52  130:pop             
				_flddelegate.actualDraw(canvas);
	//   53  131:aload_0         
	//   54  132:getfield        #218 <Field CircularRevealHelper$Delegate _flddelegate>
	//   55  135:aload_1         
	//   56  136:invokeinterface #221 <Method void CircularRevealHelper$Delegate.actualDraw(Canvas)>
				if(shouldDrawScrim())
	//*  57  141:aload_0         
	//*  58  142:invokespecial   #223 <Method boolean shouldDrawScrim()>
	//*  59  145:ifeq            174
					canvas.drawRect(0.0F, 0.0F, view.getWidth(), view.getHeight(), scrimPaint);
	//   60  148:aload_1         
	//   61  149:fconst_0        
	//   62  150:fconst_0        
	//   63  151:aload_0         
	//   64  152:getfield        #86  <Field View view>
	//   65  155:invokevirtual   #91  <Method int View.getWidth()>
	//   66  158:i2f             
	//   67  159:aload_0         
	//   68  160:getfield        #86  <Field View view>
	//   69  163:invokevirtual   #94  <Method int View.getHeight()>
	//   70  166:i2f             
	//   71  167:aload_0         
	//   72  168:getfield        #135 <Field Paint scrimPaint>
	//   73  171:invokevirtual   #227 <Method void Canvas.drawRect(float, float, float, float, Paint)>
				canvas.restoreToCount(i);
	//   74  174:aload_1         
	//   75  175:iload_2         
	//   76  176:invokevirtual   #238 <Method void Canvas.restoreToCount(int)>
				break;

	//*  77  179:goto            293
			case 0: // '\0'
				canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, revealPaint);
	//   78  182:aload_1         
	//   79  183:aload_0         
	//   80  184:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   81  187:getfield        #61  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   82  190:aload_0         
	//   83  191:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   84  194:getfield        #70  <Field float CircularRevealWidget$RevealInfo.centerY>
	//   85  197:aload_0         
	//   86  198:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   87  201:getfield        #111 <Field float CircularRevealWidget$RevealInfo.radius>
	//   88  204:aload_0         
	//   89  205:getfield        #173 <Field Paint revealPaint>
	//   90  208:invokevirtual   #242 <Method void Canvas.drawCircle(float, float, float, Paint)>
				if(shouldDrawScrim())
	//*  91  211:aload_0         
	//*  92  212:invokespecial   #223 <Method boolean shouldDrawScrim()>
	//*  93  215:ifeq            293
					canvas.drawCircle(revealInfo.centerX, revealInfo.centerY, revealInfo.radius, scrimPaint);
	//   94  218:aload_1         
	//   95  219:aload_0         
	//   96  220:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   97  223:getfield        #61  <Field float CircularRevealWidget$RevealInfo.centerX>
	//   98  226:aload_0         
	//   99  227:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//  100  230:getfield        #70  <Field float CircularRevealWidget$RevealInfo.centerY>
	//  101  233:aload_0         
	//  102  234:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//  103  237:getfield        #111 <Field float CircularRevealWidget$RevealInfo.radius>
	//  104  240:aload_0         
	//  105  241:getfield        #135 <Field Paint scrimPaint>
	//  106  244:invokevirtual   #242 <Method void Canvas.drawCircle(float, float, float, Paint)>
				break;
			}
		} else
	//* 107  247:goto            293
		{
			_flddelegate.actualDraw(canvas);
	//  108  250:aload_0         
	//  109  251:getfield        #218 <Field CircularRevealHelper$Delegate _flddelegate>
	//  110  254:aload_1         
	//  111  255:invokeinterface #221 <Method void CircularRevealHelper$Delegate.actualDraw(Canvas)>
			if(shouldDrawScrim())
	//* 112  260:aload_0         
	//* 113  261:invokespecial   #223 <Method boolean shouldDrawScrim()>
	//* 114  264:ifeq            293
				canvas.drawRect(0.0F, 0.0F, view.getWidth(), view.getHeight(), scrimPaint);
	//  115  267:aload_1         
	//  116  268:fconst_0        
	//  117  269:fconst_0        
	//  118  270:aload_0         
	//  119  271:getfield        #86  <Field View view>
	//  120  274:invokevirtual   #91  <Method int View.getWidth()>
	//  121  277:i2f             
	//  122  278:aload_0         
	//  123  279:getfield        #86  <Field View view>
	//  124  282:invokevirtual   #94  <Method int View.getHeight()>
	//  125  285:i2f             
	//  126  286:aload_0         
	//  127  287:getfield        #135 <Field Paint scrimPaint>
	//  128  290:invokevirtual   #227 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}
		drawOverlayDrawable(canvas);
	//  129  293:aload_0         
	//  130  294:aload_1         
	//  131  295:invokespecial   #244 <Method void drawOverlayDrawable(Canvas)>
	//  132  298:return          
	}

	public Drawable getCircularRevealOverlayDrawable()
	{
		return overlayDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Drawable overlayDrawable>
	//    2    4:areturn         
	}

	public int getCircularRevealScrimColor()
	{
		return scrimPaint.getColor();
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field Paint scrimPaint>
	//    2    4:invokevirtual   #140 <Method int Paint.getColor()>
	//    3    7:ireturn         
	}

	public CircularRevealWidget.RevealInfo getRevealInfo()
	{
		CircularRevealWidget.RevealInfo revealinfo = revealInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    2    4:astore_1        
		if(revealinfo == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		revealinfo = new CircularRevealWidget.RevealInfo(revealinfo);
	//    7   11:new             #57  <Class CircularRevealWidget$RevealInfo>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:invokespecial   #254 <Method void CircularRevealWidget$RevealInfo(CircularRevealWidget$RevealInfo)>
	//   11   19:astore_1        
		if(revealinfo.isInvalid())
	//*  12   20:aload_1         
	//*  13   21:invokevirtual   #128 <Method boolean CircularRevealWidget$RevealInfo.isInvalid()>
	//*  14   24:ifeq            36
			revealinfo.radius = getDistanceToFurthestCorner(revealinfo);
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokespecial   #256 <Method float getDistanceToFurthestCorner(CircularRevealWidget$RevealInfo)>
	//   19   33:putfield        #111 <Field float CircularRevealWidget$RevealInfo.radius>
		return revealinfo;
	//   20   36:aload_1         
	//   21   37:areturn         
	}

	public boolean isOpaque()
	{
		return _flddelegate.actualIsOpaque() && !shouldDrawCircularReveal();
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field CircularRevealHelper$Delegate _flddelegate>
	//    2    4:invokeinterface #260 <Method boolean CircularRevealHelper$Delegate.actualIsOpaque()>
	//    3    9:ifeq            21
	//    4   12:aload_0         
	//    5   13:invokespecial   #194 <Method boolean shouldDrawCircularReveal()>
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
	//    2    2:putfield        #47  <Field Drawable overlayDrawable>
		view.invalidate();
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field View view>
	//    5    9:invokevirtual   #124 <Method void View.invalidate()>
	//    6   12:return          
	}

	public void setCircularRevealScrimColor(int i)
	{
		scrimPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field Paint scrimPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #267 <Method void Paint.setColor(int)>
		view.invalidate();
	//    4    8:aload_0         
	//    5    9:getfield        #86  <Field View view>
	//    6   12:invokevirtual   #124 <Method void View.invalidate()>
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
	//    4    6:putfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
		} else
	//*   5    9:goto            69
		{
			CircularRevealWidget.RevealInfo revealinfo1 = revealInfo;
	//    6   12:aload_0         
	//    7   13:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//    8   16:astore_2        
			if(revealinfo1 == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       36
				revealInfo = new CircularRevealWidget.RevealInfo(revealinfo);
	//   11   21:aload_0         
	//   12   22:new             #57  <Class CircularRevealWidget$RevealInfo>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:invokespecial   #254 <Method void CircularRevealWidget$RevealInfo(CircularRevealWidget$RevealInfo)>
	//   16   30:putfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
			else
	//*  17   33:goto            41
				revealinfo1.set(revealinfo);
	//   18   36:aload_2         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #271 <Method void CircularRevealWidget$RevealInfo.set(CircularRevealWidget$RevealInfo)>
			if(MathUtils.geq(revealinfo.radius, getDistanceToFurthestCorner(revealinfo), 0.0001F))
	//*  21   41:aload_1         
	//*  22   42:getfield        #111 <Field float CircularRevealWidget$RevealInfo.radius>
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:invokespecial   #256 <Method float getDistanceToFurthestCorner(CircularRevealWidget$RevealInfo)>
	//*  26   50:ldc2            #272 <Float 0.0001F>
	//*  27   53:invokestatic    #276 <Method boolean MathUtils.geq(float, float, float)>
	//*  28   56:ifeq            69
				revealInfo.radius = 3.402823E+38F;
	//   29   59:aload_0         
	//   30   60:getfield        #55  <Field CircularRevealWidget$RevealInfo revealInfo>
	//   31   63:ldc2            #277 <Float 3.402823E+38F>
	//   32   66:putfield        #111 <Field float CircularRevealWidget$RevealInfo.radius>
		}
		invalidateRevealInfo();
	//   33   69:aload_0         
	//   34   70:invokespecial   #279 <Method void invalidateRevealInfo()>
	//   35   73:return          
	}

	public static final int STRATEGY;
	private boolean buildingCircularRevealCache;
	private final Delegate _flddelegate;
	private boolean hasCircularRevealCache;
	private Drawable overlayDrawable;
	private CircularRevealWidget.RevealInfo revealInfo;
	private final Paint revealPaint;
	private final Path revealPath;
	private final Paint scrimPaint;
	private final View view;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			STRATEGY = 2;
	//    3    8:iconst_2        
	//    4    9:putstatic       #38  <Field int STRATEGY>
	//    5   12:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   6   13:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          18
	//*   8   18:icmplt          26
			STRATEGY = 1;
	//    9   21:iconst_1        
	//   10   22:putstatic       #38  <Field int STRATEGY>
	//   11   25:return          
		else
			STRATEGY = 0;
	//   12   26:iconst_0        
	//   13   27:putstatic       #38  <Field int STRATEGY>
	//*  14   30:return          
	}
}
