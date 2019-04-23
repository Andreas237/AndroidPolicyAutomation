// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ac;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			AppCompatDrawableManager, TintInfo, TintTypedArray, DrawableUtils

class AppCompatBackgroundHelper
{

	AppCompatBackgroundHelper(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mBackgroundResId = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #21  <Field int mBackgroundResId>
		mView = view;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #23  <Field View mView>
	//    8   14:aload_0         
	//    9   15:invokestatic    #29  <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//   10   18:putfield        #31  <Field AppCompatDrawableManager mDrawableManager>
	//   11   21:return          
	}

	private boolean applyFrameworkTintUsingColorFilter(Drawable drawable)
	{
		if(mTmpInfo == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field TintInfo mTmpInfo>
	//*   2    4:ifnonnull       18
			mTmpInfo = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #38  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #39  <Method void TintInfo()>
	//    7   15:putfield        #36  <Field TintInfo mTmpInfo>
		TintInfo tintinfo = mTmpInfo;
	//    8   18:aload_0         
	//    9   19:getfield        #36  <Field TintInfo mTmpInfo>
	//   10   22:astore_2        
		tintinfo.clear();
	//   11   23:aload_2         
	//   12   24:invokevirtual   #42  <Method void TintInfo.clear()>
		Object obj = ((Object) (ac.t(mView)));
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field View mView>
	//   15   31:invokestatic    #48  <Method ColorStateList ac.t(View)>
	//   16   34:astore_3        
		if(obj != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          49
		{
			tintinfo.mHasTintList = true;
	//   19   39:aload_2         
	//   20   40:iconst_1        
	//   21   41:putfield        #52  <Field boolean TintInfo.mHasTintList>
			tintinfo.mTintList = ((ColorStateList) (obj));
	//   22   44:aload_2         
	//   23   45:aload_3         
	//   24   46:putfield        #56  <Field ColorStateList TintInfo.mTintList>
		}
		obj = ((Object) (ac.u(mView)));
	//   25   49:aload_0         
	//   26   50:getfield        #23  <Field View mView>
	//   27   53:invokestatic    #60  <Method android.graphics.PorterDuff$Mode ac.u(View)>
	//   28   56:astore_3        
		if(obj != null)
	//*  29   57:aload_3         
	//*  30   58:ifnull          71
		{
			tintinfo.mHasTintMode = true;
	//   31   61:aload_2         
	//   32   62:iconst_1        
	//   33   63:putfield        #63  <Field boolean TintInfo.mHasTintMode>
			tintinfo.mTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//   34   66:aload_2         
	//   35   67:aload_3         
	//   36   68:putfield        #67  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
		}
		if(!tintinfo.mHasTintList && !tintinfo.mHasTintMode)
	//*  37   71:aload_2         
	//*  38   72:getfield        #52  <Field boolean TintInfo.mHasTintList>
	//*  39   75:ifne            90
	//*  40   78:aload_2         
	//*  41   79:getfield        #63  <Field boolean TintInfo.mHasTintMode>
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
	//   49   93:getfield        #23  <Field View mView>
	//   50   96:invokevirtual   #73  <Method int[] View.getDrawableState()>
	//   51   99:invokestatic    #77  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
			return true;
	//   52  102:iconst_1        
	//   53  103:ireturn         
		}
	}

	private boolean shouldApplyFrameworkTintUsingColorFilter()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #84  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		if(i > 21)
	//*   2    4:iload_1         
	//*   3    5:bipush          21
	//*   4    7:icmple          21
			return mInternalBackgroundTint != null;
	//    5   10:aload_0         
	//    6   11:getfield        #86  <Field TintInfo mInternalBackgroundTint>
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

	void applySupportBackgroundTint()
	{
		Drawable drawable = mView.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View mView>
	//    2    4:invokevirtual   #91  <Method Drawable View.getBackground()>
	//    3    7:astore_1        
		if(drawable != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          71
		{
			if(shouldApplyFrameworkTintUsingColorFilter() && applyFrameworkTintUsingColorFilter(drawable))
	//*   6   12:aload_0         
	//*   7   13:invokespecial   #93  <Method boolean shouldApplyFrameworkTintUsingColorFilter()>
	//*   8   16:ifeq            28
	//*   9   19:aload_0         
	//*  10   20:aload_1         
	//*  11   21:invokespecial   #95  <Method boolean applyFrameworkTintUsingColorFilter(Drawable)>
	//*  12   24:ifeq            28
				return;
	//   13   27:return          
			TintInfo tintinfo = mBackgroundTint;
	//   14   28:aload_0         
	//   15   29:getfield        #97  <Field TintInfo mBackgroundTint>
	//   16   32:astore_2        
			if(tintinfo != null)
	//*  17   33:aload_2         
	//*  18   34:ifnull          50
			{
				AppCompatDrawableManager.tintDrawable(drawable, tintinfo, mView.getDrawableState());
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:aload_0         
	//   22   40:getfield        #23  <Field View mView>
	//   23   43:invokevirtual   #73  <Method int[] View.getDrawableState()>
	//   24   46:invokestatic    #77  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
				return;
	//   25   49:return          
			}
			tintinfo = mInternalBackgroundTint;
	//   26   50:aload_0         
	//   27   51:getfield        #86  <Field TintInfo mInternalBackgroundTint>
	//   28   54:astore_2        
			if(tintinfo != null)
	//*  29   55:aload_2         
	//*  30   56:ifnull          71
				AppCompatDrawableManager.tintDrawable(drawable, tintinfo, mView.getDrawableState());
	//   31   59:aload_1         
	//   32   60:aload_2         
	//   33   61:aload_0         
	//   34   62:getfield        #23  <Field View mView>
	//   35   65:invokevirtual   #73  <Method int[] View.getDrawableState()>
	//   36   68:invokestatic    #77  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
		}
	//   37   71:return          
	}

	ColorStateList getSupportBackgroundTintList()
	{
		TintInfo tintinfo = mBackgroundTint;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TintInfo mBackgroundTint>
	//    2    4:astore_1        
		if(tintinfo != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return tintinfo.mTintList;
	//    5    9:aload_1         
	//    6   10:getfield        #56  <Field ColorStateList TintInfo.mTintList>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		TintInfo tintinfo = mBackgroundTint;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TintInfo mBackgroundTint>
	//    2    4:astore_1        
		if(tintinfo != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return tintinfo.mTintMode;
	//    5    9:aload_1         
	//    6   10:getfield        #67  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, android.support.v7.appcompat.R.styleable.ViewBackgroundHelper, i, 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View mView>
	//    2    4:invokevirtual   #107 <Method android.content.Context View.getContext()>
	//    3    7:aload_1         
	//    4    8:getstatic       #113 <Field int[] android.support.v7.appcompat.R$styleable.ViewBackgroundHelper>
	//    5   11:iload_2         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #119 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int)>
	//    8   16:astore_1        
		ColorStateList colorstatelist;
		if(!((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_android_background))
			break MISSING_BLOCK_LABEL_67;
	//    9   17:aload_1         
	//   10   18:getstatic       #122 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_android_background>
	//   11   21:invokevirtual   #126 <Method boolean TintTypedArray.hasValue(int)>
	//   12   24:ifeq            67
		mBackgroundResId = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_android_background, -1);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getstatic       #122 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_android_background>
	//   16   32:iconst_m1       
	//   17   33:invokevirtual   #130 <Method int TintTypedArray.getResourceId(int, int)>
	//   18   36:putfield        #21  <Field int mBackgroundResId>
		colorstatelist = mDrawableManager.getTintList(mView.getContext(), mBackgroundResId);
	//   19   39:aload_0         
	//   20   40:getfield        #31  <Field AppCompatDrawableManager mDrawableManager>
	//   21   43:aload_0         
	//   22   44:getfield        #23  <Field View mView>
	//   23   47:invokevirtual   #107 <Method android.content.Context View.getContext()>
	//   24   50:aload_0         
	//   25   51:getfield        #21  <Field int mBackgroundResId>
	//   26   54:invokevirtual   #134 <Method ColorStateList AppCompatDrawableManager.getTintList(android.content.Context, int)>
	//   27   57:astore_3        
		if(colorstatelist == null)
			break MISSING_BLOCK_LABEL_67;
	//   28   58:aload_3         
	//   29   59:ifnull          67
		setInternalBackgroundTint(colorstatelist);
	//   30   62:aload_0         
	//   31   63:aload_3         
	//   32   64:invokevirtual   #138 <Method void setInternalBackgroundTint(ColorStateList)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint))
	//*  33   67:aload_1         
	//*  34   68:getstatic       #141 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_backgroundTint>
	//*  35   71:invokevirtual   #126 <Method boolean TintTypedArray.hasValue(int)>
	//*  36   74:ifeq            91
			ac.a(mView, ((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint));
	//   37   77:aload_0         
	//   38   78:getfield        #23  <Field View mView>
	//   39   81:aload_1         
	//   40   82:getstatic       #141 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_backgroundTint>
	//   41   85:invokevirtual   #145 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   42   88:invokestatic    #149 <Method void ac.a(View, ColorStateList)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode))
	//*  43   91:aload_1         
	//*  44   92:getstatic       #152 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_backgroundTintMode>
	//*  45   95:invokevirtual   #126 <Method boolean TintTypedArray.hasValue(int)>
	//*  46   98:ifeq            120
			ac.a(mView, DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), ((android.graphics.PorterDuff.Mode) (null))));
	//   47  101:aload_0         
	//   48  102:getfield        #23  <Field View mView>
	//   49  105:aload_1         
	//   50  106:getstatic       #152 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_backgroundTintMode>
	//   51  109:iconst_m1       
	//   52  110:invokevirtual   #155 <Method int TintTypedArray.getInt(int, int)>
	//   53  113:aconst_null     
	//   54  114:invokestatic    #161 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   55  117:invokestatic    #164 <Method void ac.a(View, android.graphics.PorterDuff$Mode)>
		((TintTypedArray) (attributeset)).recycle();
	//   56  120:aload_1         
	//   57  121:invokevirtual   #167 <Method void TintTypedArray.recycle()>
		return;
	//   58  124:return          
		Exception exception;
		exception;
	//   59  125:astore_3        
		((TintTypedArray) (attributeset)).recycle();
	//   60  126:aload_1         
	//   61  127:invokevirtual   #167 <Method void TintTypedArray.recycle()>
		throw exception;
	//   62  130:aload_3         
	//   63  131:athrow          
	}

	void onSetBackgroundDrawable(Drawable drawable)
	{
		mBackgroundResId = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #21  <Field int mBackgroundResId>
		setInternalBackgroundTint(((ColorStateList) (null)));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #138 <Method void setInternalBackgroundTint(ColorStateList)>
		applySupportBackgroundTint();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #171 <Method void applySupportBackgroundTint()>
	//    8   14:return          
	}

	void onSetBackgroundResource(int i)
	{
		mBackgroundResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int mBackgroundResId>
		Object obj = ((Object) (mDrawableManager));
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field AppCompatDrawableManager mDrawableManager>
	//    5    9:astore_2        
		if(obj != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          30
			obj = ((Object) (((AppCompatDrawableManager) (obj)).getTintList(mView.getContext(), i)));
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:getfield        #23  <Field View mView>
	//   11   19:invokevirtual   #107 <Method android.content.Context View.getContext()>
	//   12   22:iload_1         
	//   13   23:invokevirtual   #134 <Method ColorStateList AppCompatDrawableManager.getTintList(android.content.Context, int)>
	//   14   26:astore_2        
		else
	//*  15   27:goto            32
			obj = null;
	//   16   30:aconst_null     
	//   17   31:astore_2        
		setInternalBackgroundTint(((ColorStateList) (obj)));
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #138 <Method void setInternalBackgroundTint(ColorStateList)>
		applySupportBackgroundTint();
	//   21   37:aload_0         
	//   22   38:invokevirtual   #171 <Method void applySupportBackgroundTint()>
	//   23   41:return          
	}

	void setInternalBackgroundTint(ColorStateList colorstatelist)
	{
		if(colorstatelist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          40
		{
			if(mInternalBackgroundTint == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #86  <Field TintInfo mInternalBackgroundTint>
	//*   4    8:ifnonnull       22
				mInternalBackgroundTint = new TintInfo();
	//    5   11:aload_0         
	//    6   12:new             #38  <Class TintInfo>
	//    7   15:dup             
	//    8   16:invokespecial   #39  <Method void TintInfo()>
	//    9   19:putfield        #86  <Field TintInfo mInternalBackgroundTint>
			TintInfo tintinfo = mInternalBackgroundTint;
	//   10   22:aload_0         
	//   11   23:getfield        #86  <Field TintInfo mInternalBackgroundTint>
	//   12   26:astore_2        
			tintinfo.mTintList = colorstatelist;
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:putfield        #56  <Field ColorStateList TintInfo.mTintList>
			tintinfo.mHasTintList = true;
	//   16   32:aload_2         
	//   17   33:iconst_1        
	//   18   34:putfield        #52  <Field boolean TintInfo.mHasTintList>
		} else
	//*  19   37:goto            45
		{
			mInternalBackgroundTint = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #86  <Field TintInfo mInternalBackgroundTint>
		}
		applySupportBackgroundTint();
	//   23   45:aload_0         
	//   24   46:invokevirtual   #171 <Method void applySupportBackgroundTint()>
	//   25   49:return          
	}

	void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field TintInfo mBackgroundTint>
	//*   2    4:ifnonnull       18
			mBackgroundTint = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #38  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #39  <Method void TintInfo()>
	//    7   15:putfield        #97  <Field TintInfo mBackgroundTint>
		TintInfo tintinfo = mBackgroundTint;
	//    8   18:aload_0         
	//    9   19:getfield        #97  <Field TintInfo mBackgroundTint>
	//   10   22:astore_2        
		tintinfo.mTintList = colorstatelist;
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:putfield        #56  <Field ColorStateList TintInfo.mTintList>
		tintinfo.mHasTintList = true;
	//   14   28:aload_2         
	//   15   29:iconst_1        
	//   16   30:putfield        #52  <Field boolean TintInfo.mHasTintList>
		applySupportBackgroundTint();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #171 <Method void applySupportBackgroundTint()>
	//   19   37:return          
	}

	void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field TintInfo mBackgroundTint>
	//*   2    4:ifnonnull       18
			mBackgroundTint = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #38  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #39  <Method void TintInfo()>
	//    7   15:putfield        #97  <Field TintInfo mBackgroundTint>
		TintInfo tintinfo = mBackgroundTint;
	//    8   18:aload_0         
	//    9   19:getfield        #97  <Field TintInfo mBackgroundTint>
	//   10   22:astore_2        
		tintinfo.mTintMode = mode;
	//   11   23:aload_2         
	//   12   24:aload_1         
	//   13   25:putfield        #67  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
		tintinfo.mHasTintMode = true;
	//   14   28:aload_2         
	//   15   29:iconst_1        
	//   16   30:putfield        #63  <Field boolean TintInfo.mHasTintMode>
		applySupportBackgroundTint();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #171 <Method void applySupportBackgroundTint()>
	//   19   37:return          
	}

	private int mBackgroundResId;
	private TintInfo mBackgroundTint;
	private final AppCompatDrawableManager mDrawableManager = AppCompatDrawableManager.get();
	private TintInfo mInternalBackgroundTint;
	private TintInfo mTmpInfo;
	private final View mView;
}
