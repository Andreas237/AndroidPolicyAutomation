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
	//    2    2:getfield        #66  <Field Bitmap mCachedBitmap>
	//    3    5:invokevirtual   #72  <Method int Bitmap.getWidth()>
	//    4    8:icmpne          24
	//    5   11:iload_2         
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field Bitmap mCachedBitmap>
	//    8   16:invokevirtual   #75  <Method int Bitmap.getHeight()>
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
	//    1    1:getfield        #79  <Field boolean mCacheDirty>
	//    2    4:ifne            56
	//    3    7:aload_0         
	//    4    8:getfield        #81  <Field ColorStateList mCachedTint>
	//    5   11:aload_0         
	//    6   12:getfield        #32  <Field ColorStateList mTint>
	//    7   15:if_acmpne       56
	//    8   18:aload_0         
	//    9   19:getfield        #83  <Field android.graphics.PorterDuff$Mode mCachedTintMode>
	//   10   22:aload_0         
	//   11   23:getfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   12   26:if_acmpne       56
	//   13   29:aload_0         
	//   14   30:getfield        #85  <Field boolean mCachedAutoMirrored>
	//   15   33:aload_0         
	//   16   34:getfield        #62  <Field boolean mAutoMirrored>
	//   17   37:icmpne          56
	//   18   40:aload_0         
	//   19   41:getfield        #87  <Field int mCachedRootAlpha>
	//   20   44:aload_0         
	//   21   45:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   22   48:invokevirtual   #90  <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
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
	//*   1    1:getfield        #66  <Field Bitmap mCachedBitmap>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:iload_1         
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #94  <Method boolean canReuseBitmap(int, int)>
	//*   7   13:ifne            33
		{
			mCachedBitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:iload_2         
	//   11   19:getstatic       #100 <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   12   22:invokestatic    #104 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   13   25:putfield        #66  <Field Bitmap mCachedBitmap>
			mCacheDirty = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #79  <Field boolean mCacheDirty>
		}
	//   17   33:return          
	}

	public void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorfilter, Rect rect)
	{
		colorfilter = ((ColorFilter) (getPaint(colorfilter)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #110 <Method Paint getPaint(ColorFilter)>
	//    3    5:astore_2        
		canvas.drawBitmap(mCachedBitmap, ((Rect) (null)), rect, ((Paint) (colorfilter)));
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #66  <Field Bitmap mCachedBitmap>
	//    7   11:aconst_null     
	//    8   12:aload_3         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #116 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
	//   11   17:return          
	}

	public int getChangingConfigurations()
	{
		return mChangingConfigurations;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mChangingConfigurations>
	//    2    4:ireturn         
	}

	public Paint getPaint(ColorFilter colorfilter)
	{
		if(!hasTranslucentRoot() && colorfilter == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #120 <Method boolean hasTranslucentRoot()>
	//*   2    4:ifne            13
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		if(mTempPaint == null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #122 <Field Paint mTempPaint>
	//*   9   17:ifnonnull       39
		{
			mTempPaint = new Paint();
	//   10   20:aload_0         
	//   11   21:new             #54  <Class Paint>
	//   12   24:dup             
	//   13   25:invokespecial   #123 <Method void Paint()>
	//   14   28:putfield        #122 <Field Paint mTempPaint>
			mTempPaint.setFilterBitmap(true);
	//   15   31:aload_0         
	//   16   32:getfield        #122 <Field Paint mTempPaint>
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #127 <Method void Paint.setFilterBitmap(boolean)>
		}
		mTempPaint.setAlpha(mVPathRenderer.getRootAlpha());
	//   19   39:aload_0         
	//   20   40:getfield        #122 <Field Paint mTempPaint>
	//   21   43:aload_0         
	//   22   44:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   23   47:invokevirtual   #90  <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//   24   50:invokevirtual   #131 <Method void Paint.setAlpha(int)>
		mTempPaint.setColorFilter(colorfilter);
	//   25   53:aload_0         
	//   26   54:getfield        #122 <Field Paint mTempPaint>
	//   27   57:aload_1         
	//   28   58:invokevirtual   #135 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//   29   61:pop             
		return mTempPaint;
	//   30   62:aload_0         
	//   31   63:getfield        #122 <Field Paint mTempPaint>
	//   32   66:areturn         
	}

	public boolean hasTranslucentRoot()
	{
		return mVPathRenderer.getRootAlpha() < 255;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//    2    4:invokevirtual   #90  <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//    3    7:sipush          255
	//    4   10:icmpge          15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isStateful()
	{
		return mVPathRenderer.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//    2    4:invokevirtual   #138 <Method boolean VectorDrawableCompat$VPathRenderer.isStateful()>
	//    3    7:ireturn         
	}

	public Drawable newDrawable()
	{
		return ((Drawable) (new VectorDrawableCompat(this)));
	//    0    0:new             #6   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #143 <Method void VectorDrawableCompat(VectorDrawableCompat$VectorDrawableCompatState)>
	//    4    8:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		return ((Drawable) (new VectorDrawableCompat(this)));
	//    0    0:new             #6   <Class VectorDrawableCompat>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #143 <Method void VectorDrawableCompat(VectorDrawableCompat$VectorDrawableCompatState)>
	//    4    8:areturn         
	}

	public boolean onStateChanged(int ai[])
	{
		boolean flag = mVPathRenderer.onStateChanged(ai);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method boolean VectorDrawableCompat$VPathRenderer.onStateChanged(int[])>
	//    4    8:istore_2        
		mCacheDirty = mCacheDirty | flag;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #79  <Field boolean mCacheDirty>
	//    8   14:iload_2         
	//    9   15:ior             
	//   10   16:putfield        #79  <Field boolean mCacheDirty>
		return flag;
	//   11   19:iload_2         
	//   12   20:ireturn         
	}

	public void updateCacheStates()
	{
		mCachedTint = mTint;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #32  <Field ColorStateList mTint>
	//    3    5:putfield        #81  <Field ColorStateList mCachedTint>
		mCachedTintMode = mTintMode;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
	//    7   13:putfield        #83  <Field android.graphics.PorterDuff$Mode mCachedTintMode>
		mCachedRootAlpha = mVPathRenderer.getRootAlpha();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   11   21:invokevirtual   #90  <Method int VectorDrawableCompat$VPathRenderer.getRootAlpha()>
	//   12   24:putfield        #87  <Field int mCachedRootAlpha>
		mCachedAutoMirrored = mAutoMirrored;
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #62  <Field boolean mAutoMirrored>
	//   16   32:putfield        #85  <Field boolean mCachedAutoMirrored>
		mCacheDirty = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #79  <Field boolean mCacheDirty>
	//   20   40:return          
	}

	public void updateCachedBitmap(int i, int j)
	{
		mCachedBitmap.eraseColor(0);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Bitmap mCachedBitmap>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #154 <Method void Bitmap.eraseColor(int)>
		Canvas canvas = new Canvas(mCachedBitmap);
	//    4    8:new             #112 <Class Canvas>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field Bitmap mCachedBitmap>
	//    8   16:invokespecial   #157 <Method void Canvas(Bitmap)>
	//    9   19:astore_3        
		mVPathRenderer.draw(canvas, i, j, ((ColorFilter) (null)));
	//   10   20:aload_0         
	//   11   21:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   12   24:aload_3         
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:aconst_null     
	//   16   28:invokevirtual   #161 <Method void VectorDrawableCompat$VPathRenderer.draw(Canvas, int, int, ColorFilter)>
	//   17   31:return          
	}

	boolean mAutoMirrored;
	boolean mCacheDirty;
	boolean mCachedAutoMirrored;
	Bitmap mCachedBitmap;
	int mCachedRootAlpha;
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
	//    1    1:invokespecial   #30  <Method void android.graphics.drawable.Drawable$ConstantState()>
		mTint = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #32  <Field ColorStateList mTint>
		mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #35  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
	//    7   13:putfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
		mVPathRenderer = new VectorDrawableCompat.VPathRenderer();
	//    8   16:aload_0         
	//    9   17:new             #39  <Class VectorDrawableCompat$VPathRenderer>
	//   10   20:dup             
	//   11   21:invokespecial   #40  <Method void VectorDrawableCompat$VPathRenderer()>
	//   12   24:putfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   13   27:return          
	}

	public VectorDrawableCompat$VectorDrawableCompatState(VectorDrawableCompat$VectorDrawableCompatState vectordrawablecompat$vectordrawablecompatstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void android.graphics.drawable.Drawable$ConstantState()>
		mTint = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #32  <Field ColorStateList mTint>
		mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #35  <Field android.graphics.PorterDuff$Mode VectorDrawableCompat.DEFAULT_TINT_MODE>
	//    7   13:putfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
		if(vectordrawablecompat$vectordrawablecompatstate != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          129
		{
			mChangingConfigurations = vectordrawablecompat$vectordrawablecompatstate.mChangingConfigurations;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #46  <Field int mChangingConfigurations>
	//   13   25:putfield        #46  <Field int mChangingConfigurations>
			mVPathRenderer = new VectorDrawableCompat.VPathRenderer(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer);
	//   14   28:aload_0         
	//   15   29:new             #39  <Class VectorDrawableCompat$VPathRenderer>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   19   37:invokespecial   #49  <Method void VectorDrawableCompat$VPathRenderer(VectorDrawableCompat$VPathRenderer)>
	//   20   40:putfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
			if(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer.mFillPaint != null)
	//*  21   43:aload_1         
	//*  22   44:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//*  23   47:getfield        #52  <Field Paint VectorDrawableCompat$VPathRenderer.mFillPaint>
	//*  24   50:ifnull          74
				mVPathRenderer.mFillPaint = new Paint(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer.mFillPaint);
	//   25   53:aload_0         
	//   26   54:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   27   57:new             #54  <Class Paint>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   31   65:getfield        #52  <Field Paint VectorDrawableCompat$VPathRenderer.mFillPaint>
	//   32   68:invokespecial   #57  <Method void Paint(Paint)>
	//   33   71:putfield        #52  <Field Paint VectorDrawableCompat$VPathRenderer.mFillPaint>
			if(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer.mStrokePaint != null)
	//*  34   74:aload_1         
	//*  35   75:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//*  36   78:getfield        #60  <Field Paint VectorDrawableCompat$VPathRenderer.mStrokePaint>
	//*  37   81:ifnull          105
				mVPathRenderer.mStrokePaint = new Paint(vectordrawablecompat$vectordrawablecompatstate.mVPathRenderer.mStrokePaint);
	//   38   84:aload_0         
	//   39   85:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   40   88:new             #54  <Class Paint>
	//   41   91:dup             
	//   42   92:aload_1         
	//   43   93:getfield        #42  <Field VectorDrawableCompat$VPathRenderer mVPathRenderer>
	//   44   96:getfield        #60  <Field Paint VectorDrawableCompat$VPathRenderer.mStrokePaint>
	//   45   99:invokespecial   #57  <Method void Paint(Paint)>
	//   46  102:putfield        #60  <Field Paint VectorDrawableCompat$VPathRenderer.mStrokePaint>
			mTint = vectordrawablecompat$vectordrawablecompatstate.mTint;
	//   47  105:aload_0         
	//   48  106:aload_1         
	//   49  107:getfield        #32  <Field ColorStateList mTint>
	//   50  110:putfield        #32  <Field ColorStateList mTint>
			mTintMode = vectordrawablecompat$vectordrawablecompatstate.mTintMode;
	//   51  113:aload_0         
	//   52  114:aload_1         
	//   53  115:getfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
	//   54  118:putfield        #37  <Field android.graphics.PorterDuff$Mode mTintMode>
			mAutoMirrored = vectordrawablecompat$vectordrawablecompatstate.mAutoMirrored;
	//   55  121:aload_0         
	//   56  122:aload_1         
	//   57  123:getfield        #62  <Field boolean mAutoMirrored>
	//   58  126:putfield        #62  <Field boolean mAutoMirrored>
		}
	//   59  129:return          
	}
}
