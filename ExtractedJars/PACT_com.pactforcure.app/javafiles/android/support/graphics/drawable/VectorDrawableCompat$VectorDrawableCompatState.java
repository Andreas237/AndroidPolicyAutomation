// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.graphics.drawable:
//			VectorDrawableCompat

private static class VectorDrawableCompat$VectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState
{

	public boolean canReuseBitmap(int i, int j)
	{
		return i == mCachedBitmap.getWidth() && j == mCachedBitmap.getHeight();
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #76  <Field Bitmap mCachedBitmap>
	//    3    5:invokevirtual   #82  <Method int Bitmap.getWidth()>
	//    4    8:icmpne          24
	//    5   11:iload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field Bitmap mCachedBitmap>
	//    8   16:invokevirtual   #85  <Method int Bitmap.getHeight()>
	//    9   19:icmpne          24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public boolean canReuseCache()
	{
		return !mCacheDirty && mCachedTint == mTint && mCachedTintMode == mTintMode && mCachedAutoMirrored == mAutoMirrored && mCachedRootAlpha == mVPathRenderer.getRootAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field boolean mCacheDirty>
	//    2    4:ifne            56
	//    3    7:aload_0         
	//    4    8:getfield        #91  <Field ColorStateList mCachedTint>
	//    5   11:aload_0         
	//    6   12:getfield        #34  <Field ColorStateList mTint>
	//    7   15:if_acmpne       56
	//    8   18:aload_0         
	//    9   19:getfield        #93  <Field android.graphics.PorterDuff$Mode mCachedTintMode>
	//   10   22:aload_0         
	//   11   23:getfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   12   26:if_acmpne       56
	//   13   29:aload_0         
	//   14   30:getfield        #95  <Field boolean mCachedAutoMirrored>
	//   15   33:aload_0         
	//   16   34:getfield        #72  <Field boolean mAutoMirrored>
	//   17   37:icmpne          56
	//   18   40:aload_0         
	//   19   41:getfield        #97  <Field int mCachedRootAlpha>
	//   20   44:aload_0         
	//   21   45:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   22   48:invokevirtual   #100 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//   23   51:icmpne          56
	//   24   54:iconst_1        
	//   25   55:ireturn         
	//   26   56:iconst_0        
	//   27   57:ireturn         
	}

	public void createCachedBitmapIfNeeded(int i, int j)
	{
		if(mCachedBitmap == null || !canReuseBitmap(i, j))
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field Bitmap mCachedBitmap>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:iload_1         
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #104 <Method boolean canReuseBitmap(int, int)>
	//*   7   13:ifne            33
		{
			mCachedBitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:getstatic       #110 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   12   22:invokestatic    #114 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   13   25:putfield        #76  <Field Bitmap mCachedBitmap>
			mCacheDirty = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #89  <Field boolean mCacheDirty>
		}
	//   17   33:return          
	}

	public void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorfilter, Rect rect)
	{
		colorfilter = ((ColorFilter) (getPaint(colorfilter)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #120 <Method Paint getPaint(ColorFilter)>
	//    3    5:astore_2        
		canvas.drawBitmap(mCachedBitmap, ((Rect) (null)), rect, ((Paint) (colorfilter)));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #76  <Field Bitmap mCachedBitmap>
	//    7   11:aconst_null     
	//    8   12:aload_3         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #126 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
	//   11   17:return          
	}

	public int getChangingConfigurations()
	{
		return mChangingConfigurations;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int mChangingConfigurations>
	//    2    4:ireturn         
	}

	public Paint getPaint(ColorFilter colorfilter)
	{
		if(!hasTranslucentRoot() && colorfilter == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #130 <Method boolean hasTranslucentRoot()>
	//*   2    4:ifne            13
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		if(mTempPaint == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #132 <Field Paint mTempPaint>
	//*   9   17:ifnonnull       39
		{
			mTempPaint = new Paint();
	//   10   20:aload_0         
	//   11   21:new             #57  <Class Paint>
	//   12   24:dup             
	//   13   25:invokespecial   #133 <Method void Paint()>
	//   14   28:putfield        #132 <Field Paint mTempPaint>
			mTempPaint.setFilterBitmap(true);
	//   15   31:aload_0         
	//   16   32:getfield        #132 <Field Paint mTempPaint>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #137 <Method void Paint.setFilterBitmap(boolean)>
		}
		mTempPaint.setAlpha(mVPathRenderer.getRootAlpha());
	//   19   39:aload_0         
	//   20   40:getfield        #132 <Field Paint mTempPaint>
	//   21   43:aload_0         
	//   22   44:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   23   47:invokevirtual   #100 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//   24   50:invokevirtual   #141 <Method void Paint.setAlpha(int)>
		mTempPaint.setColorFilter(colorfilter);
	//   25   53:aload_0         
	//   26   54:getfield        #132 <Field Paint mTempPaint>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #145 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   29   61:pop             
		return mTempPaint;
	//   30   62:aload_0         
	//   31   63:getfield        #132 <Field Paint mTempPaint>
	//   32   66:areturn         
	}

	public boolean hasTranslucentRoot()
	{
		return mVPathRenderer.getRootAlpha() < 255;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//    2    4:invokevirtual   #100 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//    3    7:sipush          255
	//    4   10:icmpge          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public Drawable newDrawable()
	{
		return ((Drawable) (new VectorDrawableCompat(this)));
	//    0    0:new             #6   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #149 <Method void VectorDrawableCompat(VectorDrawableCompat$VectorDrawableCompatState)>
	//    4    8:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		return ((Drawable) (new VectorDrawableCompat(this)));
	//    0    0:new             #6   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #149 <Method void VectorDrawableCompat(VectorDrawableCompat$VectorDrawableCompatState)>
	//    4    8:areturn         
	}

	public void updateCacheStates()
	{
		mCachedTint = mTint;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #34  <Field ColorStateList mTint>
	//    3    5:putfield        #91  <Field ColorStateList mCachedTint>
		mCachedTintMode = mTintMode;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    7   13:putfield        #93  <Field android.graphics.PorterDuff$Mode mCachedTintMode>
		mCachedRootAlpha = mVPathRenderer.getRootAlpha();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   11   21:invokevirtual   #100 <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//   12   24:putfield        #97  <Field int mCachedRootAlpha>
		mCachedAutoMirrored = mAutoMirrored;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #72  <Field boolean mAutoMirrored>
	//   16   32:putfield        #95  <Field boolean mCachedAutoMirrored>
		mCacheDirty = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #89  <Field boolean mCacheDirty>
	//   20   40:return          
	}

	public void updateCachedBitmap(int i, int j)
	{
		mCachedBitmap.eraseColor(0);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Bitmap mCachedBitmap>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #155 <Method void Bitmap.eraseColor(int)>
		Canvas canvas = new Canvas(mCachedBitmap);
	//    4    8:new             #122 <Class Canvas>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field Bitmap mCachedBitmap>
	//    8   16:invokespecial   #158 <Method void Canvas(Bitmap)>
	//    9   19:astore_3        
		mVPathRenderer.draw(canvas, i, j, ((ColorFilter) (null)));
	//   10   20:aload_0         
	//   11   21:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   12   24:aload_3         
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:aconst_null     
	//   16   28:invokevirtual   #162 <Method void VectorDrawableCompat$VPathRenderer.draw(Canvas, int, int, ColorFilter)>
	//   17   31:return          
	}

	boolean mAutoMirrored;
	boolean mCacheDirty;
	boolean mCachedAutoMirrored;
	Bitmap mCachedBitmap;
	int mCachedRootAlpha;
	int mCachedThemeAttrs[];
	ColorStateList mCachedTint;
	android.graphics.PorterDuff.Mode mCachedTintMode;
	int mChangingConfigurations;
	Paint mTempPaint;
	ColorStateList mTint;
	android.graphics.PorterDuff.Mode mTintMode;
	VectorDrawableCompat.VPathRenderer mVPathRenderer;

	public VectorDrawableCompat$VectorDrawableCompatState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void android.graphics.drawable.Drawable$ConstantState()>
		mTint = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #34  <Field ColorStateList mTint>
		mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #37  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
	//    7   13:putfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
		mVPathRenderer = new VectorDrawableCompat.VPathRenderer();
	//    8   16:aload_0         
	//    9   17:new             #41  <Class VectorDrawableCompat$VPathRenderer>
	//   10   20:dup             
	//   11   21:invokespecial   #42  <Method void VectorDrawableCompat$VPathRenderer()>
	//   12   24:putfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   13   27:return          
	}

	public VectorDrawableCompat$VectorDrawableCompatState(VectorDrawableCompat$VectorDrawableCompatState vectordrawablecompat$vectordrawablecompatstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void android.graphics.drawable.Drawable$ConstantState()>
		mTint = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #34  <Field ColorStateList mTint>
		mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #37  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
	//    7   13:putfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
		if(vectordrawablecompat$vectordrawablecompatstate != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          131
		{
			mChangingConfigurations = vectordrawablecompat$vectordrawablecompatstate.mChangingConfigurations;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #48  <Field int mChangingConfigurations>
	//   13   25:putfield        #48  <Field int mChangingConfigurations>
			mVPathRenderer = new VectorDrawableCompat.VPathRenderer(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer);
	//   14   28:aload_0         
	//   15   29:new             #41  <Class VectorDrawableCompat$VPathRenderer>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   19   37:invokespecial   #51  <Method void VectorDrawableCompat$VPathRenderer(VectorDrawableCompat$VPathRenderer)>
	//   20   40:putfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
			if(VectorDrawableCompat.VPathRenderer.access$000(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer) != null)
	//*  21   43:aload_1         
	//*  22   44:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//*  23   47:invokestatic    #55  <Method Paint VectorDrawableCompat$VPathRenderer.access$000(VectorDrawableCompat$VPathRenderer)>
	//*  24   50:ifnull          75
				VectorDrawableCompat.VPathRenderer.access$002(mVPathRenderer, new Paint(VectorDrawableCompat.VPathRenderer.access$000(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer)));
	//   25   53:aload_0         
	//   26   54:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   27   57:new             #57  <Class Paint>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   31   65:invokestatic    #55  <Method Paint VectorDrawableCompat$VPathRenderer.access$000(VectorDrawableCompat$VPathRenderer)>
	//   32   68:invokespecial   #60  <Method void Paint(Paint)>
	//   33   71:invokestatic    #64  <Method Paint VectorDrawableCompat$VPathRenderer.access$002(VectorDrawableCompat$VPathRenderer, Paint)>
	//   34   74:pop             
			if(VectorDrawableCompat.VPathRenderer.access$100(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer) != null)
	//*  35   75:aload_1         
	//*  36   76:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//*  37   79:invokestatic    #67  <Method Paint VectorDrawableCompat$VPathRenderer.access$100(VectorDrawableCompat$VPathRenderer)>
	//*  38   82:ifnull          107
				VectorDrawableCompat.VPathRenderer.access$102(mVPathRenderer, new Paint(VectorDrawableCompat.VPathRenderer.access$100(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer)));
	//   39   85:aload_0         
	//   40   86:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   41   89:new             #57  <Class Paint>
	//   42   92:dup             
	//   43   93:aload_1         
	//   44   94:getfield        #44  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   45   97:invokestatic    #67  <Method Paint VectorDrawableCompat$VPathRenderer.access$100(VectorDrawableCompat$VPathRenderer)>
	//   46  100:invokespecial   #60  <Method void Paint(Paint)>
	//   47  103:invokestatic    #70  <Method Paint VectorDrawableCompat$VPathRenderer.access$102(VectorDrawableCompat$VPathRenderer, Paint)>
	//   48  106:pop             
			mTint = vectordrawablecompat$vectordrawablecompatstate.mTint;
	//   49  107:aload_0         
	//   50  108:aload_1         
	//   51  109:getfield        #34  <Field ColorStateList mTint>
	//   52  112:putfield        #34  <Field ColorStateList mTint>
			mTintMode = vectordrawablecompat$vectordrawablecompatstate.mTintMode;
	//   53  115:aload_0         
	//   54  116:aload_1         
	//   55  117:getfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   56  120:putfield        #39  <Field android.graphics.PorterDuff$Mode mTintMode>
			mAutoMirrored = vectordrawablecompat$vectordrawablecompatstate.mAutoMirrored;
	//   57  123:aload_0         
	//   58  124:aload_1         
	//   59  125:getfield        #72  <Field boolean mAutoMirrored>
	//   60  128:putfield        #72  <Field boolean mAutoMirrored>
		}
	//   61  131:return          
	}
}
