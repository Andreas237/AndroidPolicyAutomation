// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public abstract class RoundedBitmapDrawable extends Drawable
{

	RoundedBitmapDrawable(Resources resources, Bitmap bitmap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Drawable()>
		mTargetDensity = 160;
	//    2    4:aload_0         
	//    3    5:sipush          160
	//    4    8:putfield        #38  <Field int mTargetDensity>
		mGravity = 119;
	//    5   11:aload_0         
	//    6   12:bipush          119
	//    7   14:putfield        #40  <Field int mGravity>
	//    8   17:aload_0         
	//    9   18:new             #42  <Class Paint>
	//   10   21:dup             
	//   11   22:iconst_3        
	//   12   23:invokespecial   #45  <Method void Paint(int)>
	//   13   26:putfield        #47  <Field Paint mPaint>
	//   14   29:aload_0         
	//   15   30:new             #49  <Class Matrix>
	//   16   33:dup             
	//   17   34:invokespecial   #50  <Method void Matrix()>
	//   18   37:putfield        #52  <Field Matrix mShaderMatrix>
	//   19   40:aload_0         
	//   20   41:new             #54  <Class Rect>
	//   21   44:dup             
	//   22   45:invokespecial   #55  <Method void Rect()>
	//   23   48:putfield        #57  <Field Rect mDstRect>
	//   24   51:aload_0         
	//   25   52:new             #59  <Class RectF>
	//   26   55:dup             
	//   27   56:invokespecial   #60  <Method void RectF()>
	//   28   59:putfield        #62  <Field RectF mDstRectF>
		mApplyGravity = true;
	//   29   62:aload_0         
	//   30   63:iconst_1        
	//   31   64:putfield        #64  <Field boolean mApplyGravity>
		if(resources != null)
	//*  32   67:aload_1         
	//*  33   68:ifnull          82
			mTargetDensity = resources.getDisplayMetrics().densityDpi;
	//   34   71:aload_0         
	//   35   72:aload_1         
	//   36   73:invokevirtual   #70  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   37   76:getfield        #75  <Field int DisplayMetrics.densityDpi>
	//   38   79:putfield        #38  <Field int mTargetDensity>
		mBitmap = bitmap;
	//   39   82:aload_0         
	//   40   83:aload_2         
	//   41   84:putfield        #77  <Field Bitmap mBitmap>
		if(mBitmap != null)
	//*  42   87:aload_0         
	//*  43   88:getfield        #77  <Field Bitmap mBitmap>
	//*  44   91:ifnull          120
		{
			computeBitmapSize();
	//   45   94:aload_0         
	//   46   95:invokespecial   #80  <Method void computeBitmapSize()>
			mBitmapShader = new BitmapShader(mBitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
	//   47   98:aload_0         
	//   48   99:new             #82  <Class BitmapShader>
	//   49  102:dup             
	//   50  103:aload_0         
	//   51  104:getfield        #77  <Field Bitmap mBitmap>
	//   52  107:getstatic       #88  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   53  110:getstatic       #88  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   54  113:invokespecial   #91  <Method void BitmapShader(Bitmap, android.graphics.Shader$TileMode, android.graphics.Shader$TileMode)>
	//   55  116:putfield        #93  <Field BitmapShader mBitmapShader>
			return;
	//   56  119:return          
		} else
		{
			mBitmapHeight = -1;
	//   57  120:aload_0         
	//   58  121:iconst_m1       
	//   59  122:putfield        #95  <Field int mBitmapHeight>
			mBitmapWidth = -1;
	//   60  125:aload_0         
	//   61  126:iconst_m1       
	//   62  127:putfield        #97  <Field int mBitmapWidth>
			mBitmapShader = null;
	//   63  130:aload_0         
	//   64  131:aconst_null     
	//   65  132:putfield        #93  <Field BitmapShader mBitmapShader>
			return;
	//   66  135:return          
		}
	}

	private void computeBitmapSize()
	{
		mBitmapWidth = mBitmap.getScaledWidth(mTargetDensity);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #77  <Field Bitmap mBitmap>
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field int mTargetDensity>
	//    5    9:invokevirtual   #104 <Method int Bitmap.getScaledWidth(int)>
	//    6   12:putfield        #97  <Field int mBitmapWidth>
		mBitmapHeight = mBitmap.getScaledHeight(mTargetDensity);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #77  <Field Bitmap mBitmap>
	//   10   20:aload_0         
	//   11   21:getfield        #38  <Field int mTargetDensity>
	//   12   24:invokevirtual   #107 <Method int Bitmap.getScaledHeight(int)>
	//   13   27:putfield        #95  <Field int mBitmapHeight>
	//   14   30:return          
	}

	private static boolean isGreaterThanZero(float f)
	{
		return f > 0.05F;
	//    0    0:fload_0         
	//    1    1:ldc1            #110 <Float 0.05F>
	//    2    3:fcmpl           
	//    3    4:ifle            9
	//    4    7:iconst_1        
	//    5    8:ireturn         
	//    6    9:iconst_0        
	//    7   10:ireturn         
	}

	private void updateCircularCornerRadius()
	{
		mCornerRadius = Math.min(mBitmapHeight, mBitmapWidth) / 2;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #95  <Field int mBitmapHeight>
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field int mBitmapWidth>
	//    5    9:invokestatic    #117 <Method int Math.min(int, int)>
	//    6   12:iconst_2        
	//    7   13:idiv            
	//    8   14:i2f             
	//    9   15:putfield        #119 <Field float mCornerRadius>
	//   10   18:return          
	}

	public void draw(Canvas canvas)
	{
		Bitmap bitmap = mBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Bitmap mBitmap>
	//    2    4:astore_2        
		if(bitmap == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		updateDstRect();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #125 <Method void updateDstRect()>
		if(mPaint.getShader() == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #47  <Field Paint mPaint>
	//*  10   18:invokevirtual   #129 <Method android.graphics.Shader Paint.getShader()>
	//*  11   21:ifnonnull       39
		{
			canvas.drawBitmap(bitmap, ((Rect) (null)), mDstRect, mPaint);
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:aconst_null     
	//   15   27:aload_0         
	//   16   28:getfield        #57  <Field Rect mDstRect>
	//   17   31:aload_0         
	//   18   32:getfield        #47  <Field Paint mPaint>
	//   19   35:invokevirtual   #135 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
			return;
	//   20   38:return          
		} else
		{
			canvas.drawRoundRect(mDstRectF, mCornerRadius, mCornerRadius, mPaint);
	//   21   39:aload_1         
	//   22   40:aload_0         
	//   23   41:getfield        #62  <Field RectF mDstRectF>
	//   24   44:aload_0         
	//   25   45:getfield        #119 <Field float mCornerRadius>
	//   26   48:aload_0         
	//   27   49:getfield        #119 <Field float mCornerRadius>
	//   28   52:aload_0         
	//   29   53:getfield        #47  <Field Paint mPaint>
	//   30   56:invokevirtual   #139 <Method void Canvas.drawRoundRect(RectF, float, float, Paint)>
			return;
	//   31   59:return          
		}
	}

	public int getAlpha()
	{
		return mPaint.getAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Paint mPaint>
	//    2    4:invokevirtual   #144 <Method int Paint.getAlpha()>
	//    3    7:ireturn         
	}

	public final Bitmap getBitmap()
	{
		return mBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field Bitmap mBitmap>
	//    2    4:areturn         
	}

	public ColorFilter getColorFilter()
	{
		return mPaint.getColorFilter();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Paint mPaint>
	//    2    4:invokevirtual   #152 <Method ColorFilter Paint.getColorFilter()>
	//    3    7:areturn         
	}

	public float getCornerRadius()
	{
		return mCornerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field float mCornerRadius>
	//    2    4:freturn         
	}

	public int getGravity()
	{
		return mGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int mGravity>
	//    2    4:ireturn         
	}

	public int getIntrinsicHeight()
	{
		return mBitmapHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int mBitmapHeight>
	//    2    4:ireturn         
	}

	public int getIntrinsicWidth()
	{
		return mBitmapWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int mBitmapWidth>
	//    2    4:ireturn         
	}

	public int getOpacity()
	{
		int i = mGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int mGravity>
	//    2    4:istore_1        
		byte byte1 = -3;
	//    3    5:bipush          -3
	//    4    7:istore_2        
		if(i == 119)
	//*   5    8:iload_1         
	//*   6    9:bipush          119
	//*   7   11:icmpne          76
		{
			if(mIsCircular)
	//*   8   14:aload_0         
	//*   9   15:getfield        #160 <Field boolean mIsCircular>
	//*  10   18:ifeq            24
				return -3;
	//   11   21:bipush          -3
	//   12   23:ireturn         
			Bitmap bitmap = mBitmap;
	//   13   24:aload_0         
	//   14   25:getfield        #77  <Field Bitmap mBitmap>
	//   15   28:astore_3        
			byte byte0 = byte1;
	//   16   29:iload_2         
	//   17   30:istore_1        
			if(bitmap != null)
	//*  18   31:aload_3         
	//*  19   32:ifnull          74
			{
				byte0 = byte1;
	//   20   35:iload_2         
	//   21   36:istore_1        
				if(!bitmap.hasAlpha())
	//*  22   37:aload_3         
	//*  23   38:invokevirtual   #164 <Method boolean Bitmap.hasAlpha()>
	//*  24   41:ifne            74
				{
					byte0 = byte1;
	//   25   44:iload_2         
	//   26   45:istore_1        
					if(mPaint.getAlpha() >= 255)
	//*  27   46:aload_0         
	//*  28   47:getfield        #47  <Field Paint mPaint>
	//*  29   50:invokevirtual   #144 <Method int Paint.getAlpha()>
	//*  30   53:sipush          255
	//*  31   56:icmplt          74
					{
						if(isGreaterThanZero(mCornerRadius))
	//*  32   59:aload_0         
	//*  33   60:getfield        #119 <Field float mCornerRadius>
	//*  34   63:invokestatic    #166 <Method boolean isGreaterThanZero(float)>
	//*  35   66:ifeq            72
							return -3;
	//   36   69:bipush          -3
	//   37   71:ireturn         
						byte0 = -1;
	//   38   72:iconst_m1       
	//   39   73:istore_1        
					}
				}
			}
			return ((int) (byte0));
	//   40   74:iload_1         
	//   41   75:ireturn         
		} else
		{
			return -3;
	//   42   76:bipush          -3
	//   43   78:ireturn         
		}
	}

	public final Paint getPaint()
	{
		return mPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Paint mPaint>
	//    2    4:areturn         
	}

	void gravityCompatApply(int i, int j, int k, Rect rect, Rect rect1)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #172 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #173 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean hasAntiAlias()
	{
		return mPaint.isAntiAlias();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Paint mPaint>
	//    2    4:invokevirtual   #177 <Method boolean Paint.isAntiAlias()>
	//    3    7:ireturn         
	}

	public boolean hasMipMap()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #172 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #173 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean isCircular()
	{
		return mIsCircular;
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field boolean mIsCircular>
	//    2    4:ireturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		super.onBoundsChange(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #183 <Method void Drawable.onBoundsChange(Rect)>
		if(mIsCircular)
	//*   3    5:aload_0         
	//*   4    6:getfield        #160 <Field boolean mIsCircular>
	//*   5    9:ifeq            16
			updateCircularCornerRadius();
	//    6   12:aload_0         
	//    7   13:invokespecial   #185 <Method void updateCircularCornerRadius()>
		mApplyGravity = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #64  <Field boolean mApplyGravity>
	//   11   21:return          
	}

	public void setAlpha(int i)
	{
		if(i != mPaint.getAlpha())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #47  <Field Paint mPaint>
	//*   3    5:invokevirtual   #144 <Method int Paint.getAlpha()>
	//*   4    8:icmpeq          23
		{
			mPaint.setAlpha(i);
	//    5   11:aload_0         
	//    6   12:getfield        #47  <Field Paint mPaint>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #188 <Method void Paint.setAlpha(int)>
			invalidateSelf();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #191 <Method void invalidateSelf()>
		}
	//   11   23:return          
	}

	public void setAntiAlias(boolean flag)
	{
		mPaint.setAntiAlias(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Paint mPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #195 <Method void Paint.setAntiAlias(boolean)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #191 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setCircular(boolean flag)
	{
		mIsCircular = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #160 <Field boolean mIsCircular>
		mApplyGravity = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #64  <Field boolean mApplyGravity>
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            35
		{
			updateCircularCornerRadius();
	//    8   14:aload_0         
	//    9   15:invokespecial   #185 <Method void updateCircularCornerRadius()>
			mPaint.setShader(((android.graphics.Shader) (mBitmapShader)));
	//   10   18:aload_0         
	//   11   19:getfield        #47  <Field Paint mPaint>
	//   12   22:aload_0         
	//   13   23:getfield        #93  <Field BitmapShader mBitmapShader>
	//   14   26:invokevirtual   #200 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   15   29:pop             
			invalidateSelf();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #191 <Method void invalidateSelf()>
			return;
	//   18   34:return          
		} else
		{
			setCornerRadius(0.0F);
	//   19   35:aload_0         
	//   20   36:fconst_0        
	//   21   37:invokevirtual   #204 <Method void setCornerRadius(float)>
			return;
	//   22   40:return          
		}
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		mPaint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Paint mPaint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #209 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #191 <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setCornerRadius(float f)
	{
		if(mCornerRadius == f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #119 <Field float mCornerRadius>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifne            10
			return;
	//    5    9:return          
		mIsCircular = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #160 <Field boolean mIsCircular>
		if(isGreaterThanZero(f))
	//*   9   15:fload_1         
	//*  10   16:invokestatic    #166 <Method boolean isGreaterThanZero(float)>
	//*  11   19:ifeq            37
			mPaint.setShader(((android.graphics.Shader) (mBitmapShader)));
	//   12   22:aload_0         
	//   13   23:getfield        #47  <Field Paint mPaint>
	//   14   26:aload_0         
	//   15   27:getfield        #93  <Field BitmapShader mBitmapShader>
	//   16   30:invokevirtual   #200 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   17   33:pop             
		else
	//*  18   34:goto            46
			mPaint.setShader(((android.graphics.Shader) (null)));
	//   19   37:aload_0         
	//   20   38:getfield        #47  <Field Paint mPaint>
	//   21   41:aconst_null     
	//   22   42:invokevirtual   #200 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   23   45:pop             
		mCornerRadius = f;
	//   24   46:aload_0         
	//   25   47:fload_1         
	//   26   48:putfield        #119 <Field float mCornerRadius>
		invalidateSelf();
	//   27   51:aload_0         
	//   28   52:invokevirtual   #191 <Method void invalidateSelf()>
	//   29   55:return          
	}

	public void setDither(boolean flag)
	{
		mPaint.setDither(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Paint mPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #212 <Method void Paint.setDither(boolean)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #191 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setFilterBitmap(boolean flag)
	{
		mPaint.setFilterBitmap(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Paint mPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #215 <Method void Paint.setFilterBitmap(boolean)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #191 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setGravity(int i)
	{
		if(mGravity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field int mGravity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          22
		{
			mGravity = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #40  <Field int mGravity>
			mApplyGravity = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #64  <Field boolean mApplyGravity>
			invalidateSelf();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #191 <Method void invalidateSelf()>
		}
	//   12   22:return          
	}

	public void setMipMap(boolean flag)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #172 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #173 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void setTargetDensity(int i)
	{
		if(mTargetDensity != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field int mTargetDensity>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          38
		{
			int j = i;
	//    4    8:iload_1         
	//    5    9:istore_2        
			if(i == 0)
	//*   6   10:iload_1         
	//*   7   11:ifne            18
				j = 160;
	//    8   14:sipush          160
	//    9   17:istore_2        
			mTargetDensity = j;
	//   10   18:aload_0         
	//   11   19:iload_2         
	//   12   20:putfield        #38  <Field int mTargetDensity>
			if(mBitmap != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #77  <Field Bitmap mBitmap>
	//*  15   27:ifnull          34
				computeBitmapSize();
	//   16   30:aload_0         
	//   17   31:invokespecial   #80  <Method void computeBitmapSize()>
			invalidateSelf();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #191 <Method void invalidateSelf()>
		}
	//   20   38:return          
	}

	public void setTargetDensity(Canvas canvas)
	{
		setTargetDensity(canvas.getDensity());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #221 <Method int Canvas.getDensity()>
	//    3    5:invokevirtual   #223 <Method void setTargetDensity(int)>
	//    4    8:return          
	}

	public void setTargetDensity(DisplayMetrics displaymetrics)
	{
		setTargetDensity(displaymetrics.densityDpi);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #75  <Field int DisplayMetrics.densityDpi>
	//    3    5:invokevirtual   #223 <Method void setTargetDensity(int)>
	//    4    8:return          
	}

	void updateDstRect()
	{
		if(mApplyGravity)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field boolean mApplyGravity>
	//*   2    4:ifeq            246
		{
			if(mIsCircular)
	//*   3    7:aload_0         
	//*   4    8:getfield        #160 <Field boolean mIsCircular>
	//*   5   11:ifeq            115
			{
				int i = Math.min(mBitmapWidth, mBitmapHeight);
	//    6   14:aload_0         
	//    7   15:getfield        #97  <Field int mBitmapWidth>
	//    8   18:aload_0         
	//    9   19:getfield        #95  <Field int mBitmapHeight>
	//   10   22:invokestatic    #117 <Method int Math.min(int, int)>
	//   11   25:istore_1        
				gravityCompatApply(mGravity, i, i, getBounds(), mDstRect);
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #40  <Field int mGravity>
	//   15   31:iload_1         
	//   16   32:iload_1         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #228 <Method Rect getBounds()>
	//   19   37:aload_0         
	//   20   38:getfield        #57  <Field Rect mDstRect>
	//   21   41:invokevirtual   #230 <Method void gravityCompatApply(int, int, int, Rect, Rect)>
				i = Math.min(mDstRect.width(), mDstRect.height());
	//   22   44:aload_0         
	//   23   45:getfield        #57  <Field Rect mDstRect>
	//   24   48:invokevirtual   #233 <Method int Rect.width()>
	//   25   51:aload_0         
	//   26   52:getfield        #57  <Field Rect mDstRect>
	//   27   55:invokevirtual   #236 <Method int Rect.height()>
	//   28   58:invokestatic    #117 <Method int Math.min(int, int)>
	//   29   61:istore_1        
				int j = Math.max(0, (mDstRect.width() - i) / 2);
	//   30   62:iconst_0        
	//   31   63:aload_0         
	//   32   64:getfield        #57  <Field Rect mDstRect>
	//   33   67:invokevirtual   #233 <Method int Rect.width()>
	//   34   70:iload_1         
	//   35   71:isub            
	//   36   72:iconst_2        
	//   37   73:idiv            
	//   38   74:invokestatic    #239 <Method int Math.max(int, int)>
	//   39   77:istore_2        
				int k = Math.max(0, (mDstRect.height() - i) / 2);
	//   40   78:iconst_0        
	//   41   79:aload_0         
	//   42   80:getfield        #57  <Field Rect mDstRect>
	//   43   83:invokevirtual   #236 <Method int Rect.height()>
	//   44   86:iload_1         
	//   45   87:isub            
	//   46   88:iconst_2        
	//   47   89:idiv            
	//   48   90:invokestatic    #239 <Method int Math.max(int, int)>
	//   49   93:istore_3        
				mDstRect.inset(j, k);
	//   50   94:aload_0         
	//   51   95:getfield        #57  <Field Rect mDstRect>
	//   52   98:iload_2         
	//   53   99:iload_3         
	//   54  100:invokevirtual   #243 <Method void Rect.inset(int, int)>
				mCornerRadius = 0.5F * (float)i;
	//   55  103:aload_0         
	//   56  104:ldc1            #244 <Float 0.5F>
	//   57  106:iload_1         
	//   58  107:i2f             
	//   59  108:fmul            
	//   60  109:putfield        #119 <Field float mCornerRadius>
			} else
	//*  61  112:goto            139
			{
				gravityCompatApply(mGravity, mBitmapWidth, mBitmapHeight, getBounds(), mDstRect);
	//   62  115:aload_0         
	//   63  116:aload_0         
	//   64  117:getfield        #40  <Field int mGravity>
	//   65  120:aload_0         
	//   66  121:getfield        #97  <Field int mBitmapWidth>
	//   67  124:aload_0         
	//   68  125:getfield        #95  <Field int mBitmapHeight>
	//   69  128:aload_0         
	//   70  129:invokevirtual   #228 <Method Rect getBounds()>
	//   71  132:aload_0         
	//   72  133:getfield        #57  <Field Rect mDstRect>
	//   73  136:invokevirtual   #230 <Method void gravityCompatApply(int, int, int, Rect, Rect)>
			}
			mDstRectF.set(mDstRect);
	//   74  139:aload_0         
	//   75  140:getfield        #62  <Field RectF mDstRectF>
	//   76  143:aload_0         
	//   77  144:getfield        #57  <Field Rect mDstRect>
	//   78  147:invokevirtual   #247 <Method void RectF.set(Rect)>
			if(mBitmapShader != null)
	//*  79  150:aload_0         
	//*  80  151:getfield        #93  <Field BitmapShader mBitmapShader>
	//*  81  154:ifnull          241
			{
				mShaderMatrix.setTranslate(mDstRectF.left, mDstRectF.top);
	//   82  157:aload_0         
	//   83  158:getfield        #52  <Field Matrix mShaderMatrix>
	//   84  161:aload_0         
	//   85  162:getfield        #62  <Field RectF mDstRectF>
	//   86  165:getfield        #250 <Field float RectF.left>
	//   87  168:aload_0         
	//   88  169:getfield        #62  <Field RectF mDstRectF>
	//   89  172:getfield        #253 <Field float RectF.top>
	//   90  175:invokevirtual   #257 <Method void Matrix.setTranslate(float, float)>
				mShaderMatrix.preScale(mDstRectF.width() / (float)mBitmap.getWidth(), mDstRectF.height() / (float)mBitmap.getHeight());
	//   91  178:aload_0         
	//   92  179:getfield        #52  <Field Matrix mShaderMatrix>
	//   93  182:aload_0         
	//   94  183:getfield        #62  <Field RectF mDstRectF>
	//   95  186:invokevirtual   #259 <Method float RectF.width()>
	//   96  189:aload_0         
	//   97  190:getfield        #77  <Field Bitmap mBitmap>
	//   98  193:invokevirtual   #262 <Method int Bitmap.getWidth()>
	//   99  196:i2f             
	//  100  197:fdiv            
	//  101  198:aload_0         
	//  102  199:getfield        #62  <Field RectF mDstRectF>
	//  103  202:invokevirtual   #264 <Method float RectF.height()>
	//  104  205:aload_0         
	//  105  206:getfield        #77  <Field Bitmap mBitmap>
	//  106  209:invokevirtual   #267 <Method int Bitmap.getHeight()>
	//  107  212:i2f             
	//  108  213:fdiv            
	//  109  214:invokevirtual   #271 <Method boolean Matrix.preScale(float, float)>
	//  110  217:pop             
				mBitmapShader.setLocalMatrix(mShaderMatrix);
	//  111  218:aload_0         
	//  112  219:getfield        #93  <Field BitmapShader mBitmapShader>
	//  113  222:aload_0         
	//  114  223:getfield        #52  <Field Matrix mShaderMatrix>
	//  115  226:invokevirtual   #275 <Method void BitmapShader.setLocalMatrix(Matrix)>
				mPaint.setShader(((android.graphics.Shader) (mBitmapShader)));
	//  116  229:aload_0         
	//  117  230:getfield        #47  <Field Paint mPaint>
	//  118  233:aload_0         
	//  119  234:getfield        #93  <Field BitmapShader mBitmapShader>
	//  120  237:invokevirtual   #200 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//  121  240:pop             
			}
			mApplyGravity = false;
	//  122  241:aload_0         
	//  123  242:iconst_0        
	//  124  243:putfield        #64  <Field boolean mApplyGravity>
		}
	//  125  246:return          
	}

	private static final int DEFAULT_PAINT_FLAGS = 3;
	private boolean mApplyGravity;
	final Bitmap mBitmap;
	private int mBitmapHeight;
	private final BitmapShader mBitmapShader;
	private int mBitmapWidth;
	private float mCornerRadius;
	final Rect mDstRect = new Rect();
	private final RectF mDstRectF = new RectF();
	private int mGravity;
	private boolean mIsCircular;
	private final Paint mPaint = new Paint(3);
	private final Matrix mShaderMatrix = new Matrix();
	private int mTargetDensity;
}
