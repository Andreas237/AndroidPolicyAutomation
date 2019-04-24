// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.widget.ImageViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package android.support.v7.widget:
//			TintInfo, AppCompatDrawableManager, DrawableUtils, TintTypedArray

public class AppCompatImageHelper
{

	public AppCompatImageHelper(ImageView imageview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mView = imageview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field ImageView mView>
	//    5    9:return          
	}

	private boolean applyFrameworkTintUsingColorFilter(Drawable drawable)
	{
		if(mTmpInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field TintInfo mTmpInfo>
	//*   2    4:ifnonnull       18
			mTmpInfo = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #29  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #30  <Method void TintInfo()>
	//    7   15:putfield        #27  <Field TintInfo mTmpInfo>
		TintInfo tintinfo = mTmpInfo;
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field TintInfo mTmpInfo>
	//   10   22:astore_2        
		tintinfo.clear();
	//   11   23:aload_2         
	//   12   24:invokevirtual   #33  <Method void TintInfo.clear()>
		Object obj = ((Object) (ImageViewCompat.getImageTintList(mView)));
	//   13   27:aload_0         
	//   14   28:getfield        #21  <Field ImageView mView>
	//   15   31:invokestatic    #39  <Method ColorStateList ImageViewCompat.getImageTintList(ImageView)>
	//   16   34:astore_3        
		if(obj != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          49
		{
			tintinfo.mHasTintList = true;
	//   19   39:aload_2         
	//   20   40:iconst_1        
	//   21   41:putfield        #43  <Field boolean TintInfo.mHasTintList>
			tintinfo.mTintList = ((ColorStateList) (obj));
	//   22   44:aload_2         
	//   23   45:aload_3         
	//   24   46:putfield        #47  <Field ColorStateList TintInfo.mTintList>
		}
		obj = ((Object) (ImageViewCompat.getImageTintMode(mView)));
	//   25   49:aload_0         
	//   26   50:getfield        #21  <Field ImageView mView>
	//   27   53:invokestatic    #51  <Method android.graphics.PorterDuff$Mode ImageViewCompat.getImageTintMode(ImageView)>
	//   28   56:astore_3        
		if(obj != null)
	//*  29   57:aload_3         
	//*  30   58:ifnull          71
		{
			tintinfo.mHasTintMode = true;
	//   31   61:aload_2         
	//   32   62:iconst_1        
	//   33   63:putfield        #54  <Field boolean TintInfo.mHasTintMode>
			tintinfo.mTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//   34   66:aload_2         
	//   35   67:aload_3         
	//   36   68:putfield        #58  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
		}
		if(!tintinfo.mHasTintList && !tintinfo.mHasTintMode)
	//*  37   71:aload_2         
	//*  38   72:getfield        #43  <Field boolean TintInfo.mHasTintList>
	//*  39   75:ifne            90
	//*  40   78:aload_2         
	//*  41   79:getfield        #54  <Field boolean TintInfo.mHasTintMode>
	//*  42   82:ifeq            88
	//*  43   85:goto            90
		{
			return false;
	//   44   88:iconst_0        
	//   45   89:ireturn         
		} else
		{
			AppCompatDrawableManager.tintDrawable(drawable, tintinfo, mView.getDrawableState());
	//   46   90:aload_1         
	//   47   91:aload_2         
	//   48   92:aload_0         
	//   49   93:getfield        #21  <Field ImageView mView>
	//   50   96:invokevirtual   #64  <Method int[] ImageView.getDrawableState()>
	//   51   99:invokestatic    #70  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
			return true;
	//   52  102:iconst_1        
	//   53  103:ireturn         
		}
	}

	private boolean shouldApplyFrameworkTintUsingColorFilter()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #79  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		if(i > 21)
	//*   4    6:iload_1         
	//*   5    7:bipush          21
	//*   6    9:icmple          23
		{
			if(mInternalImageTint != null)
	//*   7   12:aload_0         
	//*   8   13:getfield        #81  <Field TintInfo mInternalImageTint>
	//*   9   16:ifnull          21
				flag = true;
	//   10   19:iconst_1        
	//   11   20:istore_2        
			return flag;
	//   12   21:iload_2         
	//   13   22:ireturn         
		}
		return i == 21;
	//   14   23:iload_1         
	//   15   24:bipush          21
	//   16   26:icmpne          31
	//   17   29:iconst_1        
	//   18   30:ireturn         
	//   19   31:iconst_0        
	//   20   32:ireturn         
	}

	void applySupportImageTint()
	{
		Drawable drawable = mView.getDrawable();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ImageView mView>
	//    2    4:invokevirtual   #86  <Method Drawable ImageView.getDrawable()>
	//    3    7:astore_1        
		if(drawable != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          16
			DrawableUtils.fixDrawable(drawable);
	//    6   12:aload_1         
	//    7   13:invokestatic    #92  <Method void DrawableUtils.fixDrawable(Drawable)>
		if(drawable != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          81
		{
			if(shouldApplyFrameworkTintUsingColorFilter() && applyFrameworkTintUsingColorFilter(drawable))
	//*  10   20:aload_0         
	//*  11   21:invokespecial   #94  <Method boolean shouldApplyFrameworkTintUsingColorFilter()>
	//*  12   24:ifeq            36
	//*  13   27:aload_0         
	//*  14   28:aload_1         
	//*  15   29:invokespecial   #96  <Method boolean applyFrameworkTintUsingColorFilter(Drawable)>
	//*  16   32:ifeq            36
				return;
	//   17   35:return          
			if(mImageTint != null)
	//*  18   36:aload_0         
	//*  19   37:getfield        #98  <Field TintInfo mImageTint>
	//*  20   40:ifnull          59
			{
				AppCompatDrawableManager.tintDrawable(drawable, mImageTint, mView.getDrawableState());
	//   21   43:aload_1         
	//   22   44:aload_0         
	//   23   45:getfield        #98  <Field TintInfo mImageTint>
	//   24   48:aload_0         
	//   25   49:getfield        #21  <Field ImageView mView>
	//   26   52:invokevirtual   #64  <Method int[] ImageView.getDrawableState()>
	//   27   55:invokestatic    #70  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
				return;
	//   28   58:return          
			}
			if(mInternalImageTint != null)
	//*  29   59:aload_0         
	//*  30   60:getfield        #81  <Field TintInfo mInternalImageTint>
	//*  31   63:ifnull          81
				AppCompatDrawableManager.tintDrawable(drawable, mInternalImageTint, mView.getDrawableState());
	//   32   66:aload_1         
	//   33   67:aload_0         
	//   34   68:getfield        #81  <Field TintInfo mInternalImageTint>
	//   35   71:aload_0         
	//   36   72:getfield        #21  <Field ImageView mView>
	//   37   75:invokevirtual   #64  <Method int[] ImageView.getDrawableState()>
	//   38   78:invokestatic    #70  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
		}
	//   39   81:return          
	}

	ColorStateList getSupportImageTintList()
	{
		if(mImageTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field TintInfo mImageTint>
	//*   2    4:ifnull          15
			return mImageTint.mTintList;
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field TintInfo mImageTint>
	//    5   11:getfield        #47  <Field ColorStateList TintInfo.mTintList>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	android.graphics.PorterDuff.Mode getSupportImageTintMode()
	{
		if(mImageTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field TintInfo mImageTint>
	//*   2    4:ifnull          15
			return mImageTint.mTintMode;
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field TintInfo mImageTint>
	//    5   11:getfield        #58  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	boolean hasOverlappingRendering()
	{
		Drawable drawable = mView.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ImageView mView>
	//    2    4:invokevirtual   #106 <Method Drawable ImageView.getBackground()>
	//    3    7:astore_1        
		return android.os.Build.VERSION.SDK_INT < 21 || !(drawable instanceof RippleDrawable);
	//    4    8:getstatic       #79  <Field int android.os.Build$VERSION.SDK_INT>
	//    5   11:bipush          21
	//    6   13:icmplt          25
	//    7   16:aload_1         
	//    8   17:instanceof      #108 <Class RippleDrawable>
	//    9   20:ifeq            25
	//   10   23:iconst_0        
	//   11   24:ireturn         
	//   12   25:iconst_1        
	//   13   26:ireturn         
	}

	public void loadFromAttributes(AttributeSet attributeset, int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, android.support.v7.appcompat.R.styleable.AppCompatImageView, i, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ImageView mView>
	//    2    4:invokevirtual   #114 <Method android.content.Context ImageView.getContext()>
	//    3    7:aload_1         
	//    4    8:getstatic       #120 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatImageView>
	//    5   11:iload_2         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #126 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int)>
	//    8   16:astore          4
		Drawable drawable = mView.getDrawable();
	//    9   18:aload_0         
	//   10   19:getfield        #21  <Field ImageView mView>
	//   11   22:invokevirtual   #86  <Method Drawable ImageView.getDrawable()>
	//   12   25:astore_3        
		attributeset = ((AttributeSet) (drawable));
	//   13   26:aload_3         
	//   14   27:astore_1        
		if(drawable != null)
			break MISSING_BLOCK_LABEL_77;
	//   15   28:aload_3         
	//   16   29:ifnonnull       77
		i = tinttypedarray.getResourceId(android.support.v7.appcompat.R.styleable.AppCompatImageView_srcCompat, -1);
	//   17   32:aload           4
	//   18   34:getstatic       #129 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_srcCompat>
	//   19   37:iconst_m1       
	//   20   38:invokevirtual   #133 <Method int TintTypedArray.getResourceId(int, int)>
	//   21   41:istore_2        
		attributeset = ((AttributeSet) (drawable));
	//   22   42:aload_3         
	//   23   43:astore_1        
		if(i == -1)
			break MISSING_BLOCK_LABEL_77;
	//   24   44:iload_2         
	//   25   45:iconst_m1       
	//   26   46:icmpeq          77
		drawable = AppCompatResources.getDrawable(mView.getContext(), i);
	//   27   49:aload_0         
	//   28   50:getfield        #21  <Field ImageView mView>
	//   29   53:invokevirtual   #114 <Method android.content.Context ImageView.getContext()>
	//   30   56:iload_2         
	//   31   57:invokestatic    #138 <Method Drawable AppCompatResources.getDrawable(android.content.Context, int)>
	//   32   60:astore_3        
		attributeset = ((AttributeSet) (drawable));
	//   33   61:aload_3         
	//   34   62:astore_1        
		if(drawable == null)
			break MISSING_BLOCK_LABEL_77;
	//   35   63:aload_3         
	//   36   64:ifnull          77
		mView.setImageDrawable(drawable);
	//   37   67:aload_0         
	//   38   68:getfield        #21  <Field ImageView mView>
	//   39   71:aload_3         
	//   40   72:invokevirtual   #141 <Method void ImageView.setImageDrawable(Drawable)>
		attributeset = ((AttributeSet) (drawable));
	//   41   75:aload_3         
	//   42   76:astore_1        
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_85;
	//   43   77:aload_1         
	//   44   78:ifnull          85
		DrawableUtils.fixDrawable(((Drawable) (attributeset)));
	//   45   81:aload_1         
	//   46   82:invokestatic    #92  <Method void DrawableUtils.fixDrawable(Drawable)>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.AppCompatImageView_tint))
	//*  47   85:aload           4
	//*  48   87:getstatic       #144 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_tint>
	//*  49   90:invokevirtual   #148 <Method boolean TintTypedArray.hasValue(int)>
	//*  50   93:ifeq            111
			ImageViewCompat.setImageTintList(mView, tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.AppCompatImageView_tint));
	//   51   96:aload_0         
	//   52   97:getfield        #21  <Field ImageView mView>
	//   53  100:aload           4
	//   54  102:getstatic       #144 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_tint>
	//   55  105:invokevirtual   #152 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   56  108:invokestatic    #156 <Method void ImageViewCompat.setImageTintList(ImageView, ColorStateList)>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.AppCompatImageView_tintMode))
	//*  57  111:aload           4
	//*  58  113:getstatic       #159 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_tintMode>
	//*  59  116:invokevirtual   #148 <Method boolean TintTypedArray.hasValue(int)>
	//*  60  119:ifeq            142
			ImageViewCompat.setImageTintMode(mView, DrawableUtils.parseTintMode(tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.AppCompatImageView_tintMode, -1), ((android.graphics.PorterDuff.Mode) (null))));
	//   61  122:aload_0         
	//   62  123:getfield        #21  <Field ImageView mView>
	//   63  126:aload           4
	//   64  128:getstatic       #159 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_tintMode>
	//   65  131:iconst_m1       
	//   66  132:invokevirtual   #162 <Method int TintTypedArray.getInt(int, int)>
	//   67  135:aconst_null     
	//   68  136:invokestatic    #166 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   69  139:invokestatic    #170 <Method void ImageViewCompat.setImageTintMode(ImageView, android.graphics.PorterDuff$Mode)>
		tinttypedarray.recycle();
	//   70  142:aload           4
	//   71  144:invokevirtual   #173 <Method void TintTypedArray.recycle()>
		return;
	//   72  147:return          
		attributeset;
	//   73  148:astore_1        
		tinttypedarray.recycle();
	//   74  149:aload           4
	//   75  151:invokevirtual   #173 <Method void TintTypedArray.recycle()>
		throw attributeset;
	//   76  154:aload_1         
	//   77  155:athrow          
	}

	public void setImageResource(int i)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            35
		{
			Drawable drawable = AppCompatResources.getDrawable(mView.getContext(), i);
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field ImageView mView>
	//    4    8:invokevirtual   #114 <Method android.content.Context ImageView.getContext()>
	//    5   11:iload_1         
	//    6   12:invokestatic    #138 <Method Drawable AppCompatResources.getDrawable(android.content.Context, int)>
	//    7   15:astore_2        
			if(drawable != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          24
				DrawableUtils.fixDrawable(drawable);
	//   10   20:aload_2         
	//   11   21:invokestatic    #92  <Method void DrawableUtils.fixDrawable(Drawable)>
			mView.setImageDrawable(drawable);
	//   12   24:aload_0         
	//   13   25:getfield        #21  <Field ImageView mView>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #141 <Method void ImageView.setImageDrawable(Drawable)>
		} else
	//*  16   32:goto            43
		{
			mView.setImageDrawable(((Drawable) (null)));
	//   17   35:aload_0         
	//   18   36:getfield        #21  <Field ImageView mView>
	//   19   39:aconst_null     
	//   20   40:invokevirtual   #141 <Method void ImageView.setImageDrawable(Drawable)>
		}
		applySupportImageTint();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #177 <Method void applySupportImageTint()>
	//   23   47:return          
	}

	void setInternalImageTint(ColorStateList colorstatelist)
	{
		if(colorstatelist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          41
		{
			if(mInternalImageTint == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #81  <Field TintInfo mInternalImageTint>
	//*   4    8:ifnonnull       22
				mInternalImageTint = new TintInfo();
	//    5   11:aload_0         
	//    6   12:new             #29  <Class TintInfo>
	//    7   15:dup             
	//    8   16:invokespecial   #30  <Method void TintInfo()>
	//    9   19:putfield        #81  <Field TintInfo mInternalImageTint>
			mInternalImageTint.mTintList = colorstatelist;
	//   10   22:aload_0         
	//   11   23:getfield        #81  <Field TintInfo mInternalImageTint>
	//   12   26:aload_1         
	//   13   27:putfield        #47  <Field ColorStateList TintInfo.mTintList>
			mInternalImageTint.mHasTintList = true;
	//   14   30:aload_0         
	//   15   31:getfield        #81  <Field TintInfo mInternalImageTint>
	//   16   34:iconst_1        
	//   17   35:putfield        #43  <Field boolean TintInfo.mHasTintList>
		} else
	//*  18   38:goto            46
		{
			mInternalImageTint = null;
	//   19   41:aload_0         
	//   20   42:aconst_null     
	//   21   43:putfield        #81  <Field TintInfo mInternalImageTint>
		}
		applySupportImageTint();
	//   22   46:aload_0         
	//   23   47:invokevirtual   #177 <Method void applySupportImageTint()>
	//   24   50:return          
	}

	void setSupportImageTintList(ColorStateList colorstatelist)
	{
		if(mImageTint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field TintInfo mImageTint>
	//*   2    4:ifnonnull       18
			mImageTint = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #29  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #30  <Method void TintInfo()>
	//    7   15:putfield        #98  <Field TintInfo mImageTint>
		mImageTint.mTintList = colorstatelist;
	//    8   18:aload_0         
	//    9   19:getfield        #98  <Field TintInfo mImageTint>
	//   10   22:aload_1         
	//   11   23:putfield        #47  <Field ColorStateList TintInfo.mTintList>
		mImageTint.mHasTintList = true;
	//   12   26:aload_0         
	//   13   27:getfield        #98  <Field TintInfo mImageTint>
	//   14   30:iconst_1        
	//   15   31:putfield        #43  <Field boolean TintInfo.mHasTintList>
		applySupportImageTint();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #177 <Method void applySupportImageTint()>
	//   18   38:return          
	}

	void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mImageTint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field TintInfo mImageTint>
	//*   2    4:ifnonnull       18
			mImageTint = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #29  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #30  <Method void TintInfo()>
	//    7   15:putfield        #98  <Field TintInfo mImageTint>
		mImageTint.mTintMode = mode;
	//    8   18:aload_0         
	//    9   19:getfield        #98  <Field TintInfo mImageTint>
	//   10   22:aload_1         
	//   11   23:putfield        #58  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
		mImageTint.mHasTintMode = true;
	//   12   26:aload_0         
	//   13   27:getfield        #98  <Field TintInfo mImageTint>
	//   14   30:iconst_1        
	//   15   31:putfield        #54  <Field boolean TintInfo.mHasTintMode>
		applySupportImageTint();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #177 <Method void applySupportImageTint()>
	//   18   38:return          
	}

	private TintInfo mImageTint;
	private TintInfo mInternalImageTint;
	private TintInfo mTmpInfo;
	private final ImageView mView;
}
