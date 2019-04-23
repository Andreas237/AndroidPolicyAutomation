// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.widget.r;
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
	//    1    1:invokespecial   #15  <Method void Object()>
		mView = imageview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ImageView mView>
	//    5    9:return          
	}

	private boolean applyFrameworkTintUsingColorFilter(Drawable drawable)
	{
		if(mTmpInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field TintInfo mTmpInfo>
	//*   2    4:ifnonnull       18
			mTmpInfo = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #24  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #25  <Method void TintInfo()>
	//    7   15:putfield        #22  <Field TintInfo mTmpInfo>
		TintInfo tintinfo = mTmpInfo;
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field TintInfo mTmpInfo>
	//   10   22:astore_2        
		tintinfo.clear();
	//   11   23:aload_2         
	//   12   24:invokevirtual   #28  <Method void TintInfo.clear()>
		Object obj = ((Object) (r.a(mView)));
	//   13   27:aload_0         
	//   14   28:getfield        #17  <Field ImageView mView>
	//   15   31:invokestatic    #34  <Method ColorStateList r.a(ImageView)>
	//   16   34:astore_3        
		if(obj != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          49
		{
			tintinfo.mHasTintList = true;
	//   19   39:aload_2         
	//   20   40:iconst_1        
	//   21   41:putfield        #38  <Field boolean TintInfo.mHasTintList>
			tintinfo.mTintList = ((ColorStateList) (obj));
	//   22   44:aload_2         
	//   23   45:aload_3         
	//   24   46:putfield        #42  <Field ColorStateList TintInfo.mTintList>
		}
		obj = ((Object) (r.b(mView)));
	//   25   49:aload_0         
	//   26   50:getfield        #17  <Field ImageView mView>
	//   27   53:invokestatic    #46  <Method android.graphics.PorterDuff$Mode r.b(ImageView)>
	//   28   56:astore_3        
		if(obj != null)
	//*  29   57:aload_3         
	//*  30   58:ifnull          71
		{
			tintinfo.mHasTintMode = true;
	//   31   61:aload_2         
	//   32   62:iconst_1        
	//   33   63:putfield        #49  <Field boolean TintInfo.mHasTintMode>
			tintinfo.mTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//   34   66:aload_2         
	//   35   67:aload_3         
	//   36   68:putfield        #53  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
		}
		if(!tintinfo.mHasTintList && !tintinfo.mHasTintMode)
	//*  37   71:aload_2         
	//*  38   72:getfield        #38  <Field boolean TintInfo.mHasTintList>
	//*  39   75:ifne            90
	//*  40   78:aload_2         
	//*  41   79:getfield        #49  <Field boolean TintInfo.mHasTintMode>
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
	//   49   93:getfield        #17  <Field ImageView mView>
	//   50   96:invokevirtual   #59  <Method int[] ImageView.getDrawableState()>
	//   51   99:invokestatic    #65  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
			return true;
	//   52  102:iconst_1        
	//   53  103:ireturn         
		}
	}

	private boolean shouldApplyFrameworkTintUsingColorFilter()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		if(i > 21)
	//*   2    4:iload_1         
	//*   3    5:bipush          21
	//*   4    7:icmple          21
			return mInternalImageTint != null;
	//    5   10:aload_0         
	//    6   11:getfield        #75  <Field TintInfo mInternalImageTint>
	//    7   14:ifnull          19
	//    8   17:iconst_1        
	//    9   18:ireturn         
	//   10   19:iconst_0        
	//   11   20:ireturn         
		return i == 21;
	//   12   21:iload_1         
	//   13   22:bipush          21
	//   14   24:icmpne          29
	//   15   27:iconst_1        
	//   16   28:ireturn         
	//   17   29:iconst_0        
	//   18   30:ireturn         
	}

	void applySupportImageTint()
	{
		Drawable drawable = mView.getDrawable();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ImageView mView>
	//    2    4:invokevirtual   #80  <Method Drawable ImageView.getDrawable()>
	//    3    7:astore_1        
		if(drawable != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          16
			DrawableUtils.fixDrawable(drawable);
	//    6   12:aload_1         
	//    7   13:invokestatic    #86  <Method void DrawableUtils.fixDrawable(Drawable)>
		if(drawable != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          79
		{
			if(shouldApplyFrameworkTintUsingColorFilter() && applyFrameworkTintUsingColorFilter(drawable))
	//*  10   20:aload_0         
	//*  11   21:invokespecial   #88  <Method boolean shouldApplyFrameworkTintUsingColorFilter()>
	//*  12   24:ifeq            36
	//*  13   27:aload_0         
	//*  14   28:aload_1         
	//*  15   29:invokespecial   #90  <Method boolean applyFrameworkTintUsingColorFilter(Drawable)>
	//*  16   32:ifeq            36
				return;
	//   17   35:return          
			TintInfo tintinfo = mImageTint;
	//   18   36:aload_0         
	//   19   37:getfield        #92  <Field TintInfo mImageTint>
	//   20   40:astore_2        
			if(tintinfo != null)
	//*  21   41:aload_2         
	//*  22   42:ifnull          58
			{
				AppCompatDrawableManager.tintDrawable(drawable, tintinfo, mView.getDrawableState());
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:aload_0         
	//   26   48:getfield        #17  <Field ImageView mView>
	//   27   51:invokevirtual   #59  <Method int[] ImageView.getDrawableState()>
	//   28   54:invokestatic    #65  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
				return;
	//   29   57:return          
			}
			tintinfo = mInternalImageTint;
	//   30   58:aload_0         
	//   31   59:getfield        #75  <Field TintInfo mInternalImageTint>
	//   32   62:astore_2        
			if(tintinfo != null)
	//*  33   63:aload_2         
	//*  34   64:ifnull          79
				AppCompatDrawableManager.tintDrawable(drawable, tintinfo, mView.getDrawableState());
	//   35   67:aload_1         
	//   36   68:aload_2         
	//   37   69:aload_0         
	//   38   70:getfield        #17  <Field ImageView mView>
	//   39   73:invokevirtual   #59  <Method int[] ImageView.getDrawableState()>
	//   40   76:invokestatic    #65  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
		}
	//   41   79:return          
	}

	ColorStateList getSupportImageTintList()
	{
		TintInfo tintinfo = mImageTint;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field TintInfo mImageTint>
	//    2    4:astore_1        
		if(tintinfo != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return tintinfo.mTintList;
	//    5    9:aload_1         
	//    6   10:getfield        #42  <Field ColorStateList TintInfo.mTintList>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	android.graphics.PorterDuff.Mode getSupportImageTintMode()
	{
		TintInfo tintinfo = mImageTint;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field TintInfo mImageTint>
	//    2    4:astore_1        
		if(tintinfo != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return tintinfo.mTintMode;
	//    5    9:aload_1         
	//    6   10:getfield        #53  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	boolean hasOverlappingRendering()
	{
		Drawable drawable = mView.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ImageView mView>
	//    2    4:invokevirtual   #100 <Method Drawable ImageView.getBackground()>
	//    3    7:astore_1        
		return android.os.Build.VERSION.SDK_INT < 21 || !(drawable instanceof RippleDrawable);
	//    4    8:getstatic       #73  <Field int android.os.Build$VERSION.SDK_INT>
	//    5   11:bipush          21
	//    6   13:icmplt          25
	//    7   16:aload_1         
	//    8   17:instanceof      #102 <Class RippleDrawable>
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
	//    1    1:getfield        #17  <Field ImageView mView>
	//    2    4:invokevirtual   #108 <Method android.content.Context ImageView.getContext()>
	//    3    7:aload_1         
	//    4    8:getstatic       #114 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatImageView>
	//    5   11:iload_2         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #120 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int)>
	//    8   16:astore          4
		Drawable drawable = mView.getDrawable();
	//    9   18:aload_0         
	//   10   19:getfield        #17  <Field ImageView mView>
	//   11   22:invokevirtual   #80  <Method Drawable ImageView.getDrawable()>
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
	//   18   34:getstatic       #123 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_srcCompat>
	//   19   37:iconst_m1       
	//   20   38:invokevirtual   #127 <Method int TintTypedArray.getResourceId(int, int)>
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
	//   28   50:getfield        #17  <Field ImageView mView>
	//   29   53:invokevirtual   #108 <Method android.content.Context ImageView.getContext()>
	//   30   56:iload_2         
	//   31   57:invokestatic    #132 <Method Drawable AppCompatResources.getDrawable(android.content.Context, int)>
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
	//   38   68:getfield        #17  <Field ImageView mView>
	//   39   71:aload_3         
	//   40   72:invokevirtual   #135 <Method void ImageView.setImageDrawable(Drawable)>
		attributeset = ((AttributeSet) (drawable));
	//   41   75:aload_3         
	//   42   76:astore_1        
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_85;
	//   43   77:aload_1         
	//   44   78:ifnull          85
		DrawableUtils.fixDrawable(((Drawable) (attributeset)));
	//   45   81:aload_1         
	//   46   82:invokestatic    #86  <Method void DrawableUtils.fixDrawable(Drawable)>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.AppCompatImageView_tint))
	//*  47   85:aload           4
	//*  48   87:getstatic       #138 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_tint>
	//*  49   90:invokevirtual   #142 <Method boolean TintTypedArray.hasValue(int)>
	//*  50   93:ifeq            111
			r.a(mView, tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.AppCompatImageView_tint));
	//   51   96:aload_0         
	//   52   97:getfield        #17  <Field ImageView mView>
	//   53  100:aload           4
	//   54  102:getstatic       #138 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_tint>
	//   55  105:invokevirtual   #146 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   56  108:invokestatic    #149 <Method void r.a(ImageView, ColorStateList)>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.AppCompatImageView_tintMode))
	//*  57  111:aload           4
	//*  58  113:getstatic       #152 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_tintMode>
	//*  59  116:invokevirtual   #142 <Method boolean TintTypedArray.hasValue(int)>
	//*  60  119:ifeq            142
			r.a(mView, DrawableUtils.parseTintMode(tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.AppCompatImageView_tintMode, -1), ((android.graphics.PorterDuff.Mode) (null))));
	//   61  122:aload_0         
	//   62  123:getfield        #17  <Field ImageView mView>
	//   63  126:aload           4
	//   64  128:getstatic       #152 <Field int android.support.v7.appcompat.R$styleable.AppCompatImageView_tintMode>
	//   65  131:iconst_m1       
	//   66  132:invokevirtual   #155 <Method int TintTypedArray.getInt(int, int)>
	//   67  135:aconst_null     
	//   68  136:invokestatic    #159 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   69  139:invokestatic    #162 <Method void r.a(ImageView, android.graphics.PorterDuff$Mode)>
		tinttypedarray.recycle();
	//   70  142:aload           4
	//   71  144:invokevirtual   #165 <Method void TintTypedArray.recycle()>
		return;
	//   72  147:return          
		attributeset;
	//   73  148:astore_1        
		tinttypedarray.recycle();
	//   74  149:aload           4
	//   75  151:invokevirtual   #165 <Method void TintTypedArray.recycle()>
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
	//    3    5:getfield        #17  <Field ImageView mView>
	//    4    8:invokevirtual   #108 <Method android.content.Context ImageView.getContext()>
	//    5   11:iload_1         
	//    6   12:invokestatic    #132 <Method Drawable AppCompatResources.getDrawable(android.content.Context, int)>
	//    7   15:astore_2        
			if(drawable != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          24
				DrawableUtils.fixDrawable(drawable);
	//   10   20:aload_2         
	//   11   21:invokestatic    #86  <Method void DrawableUtils.fixDrawable(Drawable)>
			mView.setImageDrawable(drawable);
	//   12   24:aload_0         
	//   13   25:getfield        #17  <Field ImageView mView>
	//   14   28:aload_2         
	//   15   29:invokevirtual   #135 <Method void ImageView.setImageDrawable(Drawable)>
		} else
	//*  16   32:goto            43
		{
			mView.setImageDrawable(((Drawable) (null)));
	//   17   35:aload_0         
	//   18   36:getfield        #17  <Field ImageView mView>
	//   19   39:aconst_null     
	//   20   40:invokevirtual   #135 <Method void ImageView.setImageDrawable(Drawable)>
		}
		applySupportImageTint();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #169 <Method void applySupportImageTint()>
	//   23   47:return          
	}

	void setInternalImageTint(ColorStateList colorstatelist)
	{
		if(colorstatelist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          40
		{
			if(mInternalImageTint == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #75  <Field TintInfo mInternalImageTint>
	//*   4    8:ifnonnull       22
				mInternalImageTint = new TintInfo();
	//    5   11:aload_0         
	//    6   12:new             #24  <Class TintInfo>
	//    7   15:dup             
	//    8   16:invokespecial   #25  <Method void TintInfo()>
	//    9   19:putfield        #75  <Field TintInfo mInternalImageTint>
			TintInfo tintinfo = mInternalImageTint;
	//   10   22:aload_0         
	//   11   23:getfield        #75  <Field TintInfo mInternalImageTint>
	//   12   26:astore_2        
			tintinfo.mTintList = colorstatelist;
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:putfield        #42  <Field ColorStateList TintInfo.mTintList>
			tintinfo.mHasTintList = true;
	//   16   32:aload_2         
	//   17   33:iconst_1        
	//   18   34:putfield        #38  <Field boolean TintInfo.mHasTintList>
		} else
	//*  19   37:goto            45
		{
			mInternalImageTint = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #75  <Field TintInfo mInternalImageTint>
		}
		applySupportImageTint();
	//   23   45:aload_0         
	//   24   46:invokevirtual   #169 <Method void applySupportImageTint()>
	//   25   49:return          
	}

	void setSupportImageTintList(ColorStateList colorstatelist)
	{
		if(mImageTint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field TintInfo mImageTint>
	//*   2    4:ifnonnull       18
			mImageTint = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #24  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #25  <Method void TintInfo()>
	//    7   15:putfield        #92  <Field TintInfo mImageTint>
		TintInfo tintinfo = mImageTint;
	//    8   18:aload_0         
	//    9   19:getfield        #92  <Field TintInfo mImageTint>
	//   10   22:astore_2        
		tintinfo.mTintList = colorstatelist;
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:putfield        #42  <Field ColorStateList TintInfo.mTintList>
		tintinfo.mHasTintList = true;
	//   14   28:aload_2         
	//   15   29:iconst_1        
	//   16   30:putfield        #38  <Field boolean TintInfo.mHasTintList>
		applySupportImageTint();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #169 <Method void applySupportImageTint()>
	//   19   37:return          
	}

	void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mImageTint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field TintInfo mImageTint>
	//*   2    4:ifnonnull       18
			mImageTint = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #24  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #25  <Method void TintInfo()>
	//    7   15:putfield        #92  <Field TintInfo mImageTint>
		TintInfo tintinfo = mImageTint;
	//    8   18:aload_0         
	//    9   19:getfield        #92  <Field TintInfo mImageTint>
	//   10   22:astore_2        
		tintinfo.mTintMode = mode;
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:putfield        #53  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
		tintinfo.mHasTintMode = true;
	//   14   28:aload_2         
	//   15   29:iconst_1        
	//   16   30:putfield        #49  <Field boolean TintInfo.mHasTintMode>
		applySupportImageTint();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #169 <Method void applySupportImageTint()>
	//   19   37:return          
	}

	private TintInfo mImageTint;
	private TintInfo mInternalImageTint;
	private TintInfo mTmpInfo;
	private final ImageView mView;
}
