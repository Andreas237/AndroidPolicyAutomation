// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
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
	//*   1    1:getfield        #37  <Field TintInfo mTmpInfo>
	//*   2    4:ifnonnull       18
			mTmpInfo = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #39  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #40  <Method void TintInfo()>
	//    7   15:putfield        #37  <Field TintInfo mTmpInfo>
		TintInfo tintinfo = mTmpInfo;
	//    8   18:aload_0         
	//    9   19:getfield        #37  <Field TintInfo mTmpInfo>
	//   10   22:astore_2        
		tintinfo.clear();
	//   11   23:aload_2         
	//   12   24:invokevirtual   #43  <Method void TintInfo.clear()>
		Object obj = ((Object) (ViewCompat.getBackgroundTintList(mView)));
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field View mView>
	//   15   31:invokestatic    #49  <Method ColorStateList ViewCompat.getBackgroundTintList(View)>
	//   16   34:astore_3        
		if(obj != null)
	//*  17   35:aload_3         
	//*  18   36:ifnull          49
		{
			tintinfo.mHasTintList = true;
	//   19   39:aload_2         
	//   20   40:iconst_1        
	//   21   41:putfield        #53  <Field boolean TintInfo.mHasTintList>
			tintinfo.mTintList = ((ColorStateList) (obj));
	//   22   44:aload_2         
	//   23   45:aload_3         
	//   24   46:putfield        #57  <Field ColorStateList TintInfo.mTintList>
		}
		obj = ((Object) (ViewCompat.getBackgroundTintMode(mView)));
	//   25   49:aload_0         
	//   26   50:getfield        #23  <Field View mView>
	//   27   53:invokestatic    #61  <Method android.graphics.PorterDuff$Mode ViewCompat.getBackgroundTintMode(View)>
	//   28   56:astore_3        
		if(obj != null)
	//*  29   57:aload_3         
	//*  30   58:ifnull          71
		{
			tintinfo.mHasTintMode = true;
	//   31   61:aload_2         
	//   32   62:iconst_1        
	//   33   63:putfield        #64  <Field boolean TintInfo.mHasTintMode>
			tintinfo.mTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//   34   66:aload_2         
	//   35   67:aload_3         
	//   36   68:putfield        #68  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
		}
		if(tintinfo.mHasTintList || tintinfo.mHasTintMode)
	//*  37   71:aload_2         
	//*  38   72:getfield        #53  <Field boolean TintInfo.mHasTintList>
	//*  39   75:ifne            85
	//*  40   78:aload_2         
	//*  41   79:getfield        #64  <Field boolean TintInfo.mHasTintMode>
	//*  42   82:ifeq            99
		{
			AppCompatDrawableManager.tintDrawable(drawable, tintinfo, mView.getDrawableState());
	//   43   85:aload_1         
	//   44   86:aload_2         
	//   45   87:aload_0         
	//   46   88:getfield        #23  <Field View mView>
	//   47   91:invokevirtual   #74  <Method int[] View.getDrawableState()>
	//   48   94:invokestatic    #78  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
			return true;
	//   49   97:iconst_1        
	//   50   98:ireturn         
		} else
		{
			return false;
	//   51   99:iconst_0        
	//   52  100:ireturn         
		}
	}

	private boolean shouldApplyFrameworkTintUsingColorFilter()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #86  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		if(i <= 21) goto _L2; else goto _L1
	//    2    4:iload_1         
	//    3    5:bipush          21
	//    4    7:icmple          21
_L1:
		if(mInternalBackgroundTint == null) goto _L4; else goto _L3
	//    5   10:aload_0         
	//    6   11:getfield        #88  <Field TintInfo mInternalBackgroundTint>
	//    7   14:ifnull          19
_L3:
		return true;
	//    8   17:iconst_1        
	//    9   18:ireturn         
_L4:
		return false;
	//   10   19:iconst_0        
	//   11   20:ireturn         
_L2:
		if(i != 21)
	//*  12   21:iload_1         
	//*  13   22:bipush          21
	//*  14   24:icmpeq          17
			return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	void applySupportBackgroundTint()
	{
		Drawable drawable = mView.getBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View mView>
	//    2    4:invokevirtual   #93  <Method Drawable View.getBackground()>
	//    3    7:astore_1        
		if(drawable != null && (!shouldApplyFrameworkTintUsingColorFilter() || !applyFrameworkTintUsingColorFilter(drawable)))
	//*   4    8:aload_1         
	//*   5    9:ifnull          27
	//*   6   12:aload_0         
	//*   7   13:invokespecial   #95  <Method boolean shouldApplyFrameworkTintUsingColorFilter()>
	//*   8   16:ifeq            28
	//*   9   19:aload_0         
	//*  10   20:aload_1         
	//*  11   21:invokespecial   #97  <Method boolean applyFrameworkTintUsingColorFilter(Drawable)>
	//*  12   24:ifeq            28
	//*  13   27:return          
		{
			if(mBackgroundTint != null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #99  <Field TintInfo mBackgroundTint>
	//*  16   32:ifnull          51
			{
				AppCompatDrawableManager.tintDrawable(drawable, mBackgroundTint, mView.getDrawableState());
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #99  <Field TintInfo mBackgroundTint>
	//   20   40:aload_0         
	//   21   41:getfield        #23  <Field View mView>
	//   22   44:invokevirtual   #74  <Method int[] View.getDrawableState()>
	//   23   47:invokestatic    #78  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
				return;
	//   24   50:return          
			}
			if(mInternalBackgroundTint != null)
	//*  25   51:aload_0         
	//*  26   52:getfield        #88  <Field TintInfo mInternalBackgroundTint>
	//*  27   55:ifnull          27
			{
				AppCompatDrawableManager.tintDrawable(drawable, mInternalBackgroundTint, mView.getDrawableState());
	//   28   58:aload_1         
	//   29   59:aload_0         
	//   30   60:getfield        #88  <Field TintInfo mInternalBackgroundTint>
	//   31   63:aload_0         
	//   32   64:getfield        #23  <Field View mView>
	//   33   67:invokevirtual   #74  <Method int[] View.getDrawableState()>
	//   34   70:invokestatic    #78  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
				return;
	//   35   73:return          
			}
		}
	}

	ColorStateList getSupportBackgroundTintList()
	{
		if(mBackgroundTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field TintInfo mBackgroundTint>
	//*   2    4:ifnull          15
			return mBackgroundTint.mTintList;
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field TintInfo mBackgroundTint>
	//    5   11:getfield        #57  <Field ColorStateList TintInfo.mTintList>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		if(mBackgroundTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field TintInfo mBackgroundTint>
	//*   2    4:ifnull          15
			return mBackgroundTint.mTintMode;
	//    3    7:aload_0         
	//    4    8:getfield        #99  <Field TintInfo mBackgroundTint>
	//    5   11:getfield        #68  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(mView.getContext(), attributeset, android.support.v7.appcompat.R.styleable.ViewBackgroundHelper, i, 0)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View mView>
	//    2    4:invokevirtual   #109 <Method android.content.Context View.getContext()>
	//    3    7:aload_1         
	//    4    8:getstatic       #115 <Field int[] android.support.v7.appcompat.R$styleable.ViewBackgroundHelper>
	//    5   11:iload_2         
	//    6   12:iconst_0        
	//    7   13:invokestatic    #121 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(android.content.Context, AttributeSet, int[], int, int)>
	//    8   16:astore_1        
		ColorStateList colorstatelist;
		if(!((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_android_background))
			break MISSING_BLOCK_LABEL_67;
	//    9   17:aload_1         
	//   10   18:getstatic       #124 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_android_background>
	//   11   21:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//   12   24:ifeq            67
		mBackgroundResId = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_android_background, -1);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:getstatic       #124 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_android_background>
	//   16   32:iconst_m1       
	//   17   33:invokevirtual   #132 <Method int TintTypedArray.getResourceId(int, int)>
	//   18   36:putfield        #21  <Field int mBackgroundResId>
		colorstatelist = mDrawableManager.getTintList(mView.getContext(), mBackgroundResId);
	//   19   39:aload_0         
	//   20   40:getfield        #31  <Field AppCompatDrawableManager mDrawableManager>
	//   21   43:aload_0         
	//   22   44:getfield        #23  <Field View mView>
	//   23   47:invokevirtual   #109 <Method android.content.Context View.getContext()>
	//   24   50:aload_0         
	//   25   51:getfield        #21  <Field int mBackgroundResId>
	//   26   54:invokevirtual   #136 <Method ColorStateList AppCompatDrawableManager.getTintList(android.content.Context, int)>
	//   27   57:astore_3        
		if(colorstatelist == null)
			break MISSING_BLOCK_LABEL_67;
	//   28   58:aload_3         
	//   29   59:ifnull          67
		setInternalBackgroundTint(colorstatelist);
	//   30   62:aload_0         
	//   31   63:aload_3         
	//   32   64:invokevirtual   #140 <Method void setInternalBackgroundTint(ColorStateList)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint))
	//*  33   67:aload_1         
	//*  34   68:getstatic       #143 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_backgroundTint>
	//*  35   71:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  36   74:ifeq            91
			ViewCompat.setBackgroundTintList(mView, ((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint));
	//   37   77:aload_0         
	//   38   78:getfield        #23  <Field View mView>
	//   39   81:aload_1         
	//   40   82:getstatic       #143 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_backgroundTint>
	//   41   85:invokevirtual   #147 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   42   88:invokestatic    #151 <Method void ViewCompat.setBackgroundTintList(View, ColorStateList)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode))
	//*  43   91:aload_1         
	//*  44   92:getstatic       #154 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_backgroundTintMode>
	//*  45   95:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  46   98:ifeq            120
			ViewCompat.setBackgroundTintMode(mView, DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), ((android.graphics.PorterDuff.Mode) (null))));
	//   47  101:aload_0         
	//   48  102:getfield        #23  <Field View mView>
	//   49  105:aload_1         
	//   50  106:getstatic       #154 <Field int android.support.v7.appcompat.R$styleable.ViewBackgroundHelper_backgroundTintMode>
	//   51  109:iconst_m1       
	//   52  110:invokevirtual   #157 <Method int TintTypedArray.getInt(int, int)>
	//   53  113:aconst_null     
	//   54  114:invokestatic    #163 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   55  117:invokestatic    #167 <Method void ViewCompat.setBackgroundTintMode(View, android.graphics.PorterDuff$Mode)>
		((TintTypedArray) (attributeset)).recycle();
	//   56  120:aload_1         
	//   57  121:invokevirtual   #170 <Method void TintTypedArray.recycle()>
		return;
	//   58  124:return          
		Exception exception;
		exception;
	//   59  125:astore_3        
		((TintTypedArray) (attributeset)).recycle();
	//   60  126:aload_1         
	//   61  127:invokevirtual   #170 <Method void TintTypedArray.recycle()>
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
	//    5    7:invokevirtual   #140 <Method void setInternalBackgroundTint(ColorStateList)>
		applySupportBackgroundTint();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #174 <Method void applySupportBackgroundTint()>
	//    8   14:return          
	}

	void onSetBackgroundResource(int i)
	{
		mBackgroundResId = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int mBackgroundResId>
		ColorStateList colorstatelist;
		if(mDrawableManager != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #31  <Field AppCompatDrawableManager mDrawableManager>
	//*   5    9:ifnull          38
			colorstatelist = mDrawableManager.getTintList(mView.getContext(), i);
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field AppCompatDrawableManager mDrawableManager>
	//    8   16:aload_0         
	//    9   17:getfield        #23  <Field View mView>
	//   10   20:invokevirtual   #109 <Method android.content.Context View.getContext()>
	//   11   23:iload_1         
	//   12   24:invokevirtual   #136 <Method ColorStateList AppCompatDrawableManager.getTintList(android.content.Context, int)>
	//   13   27:astore_2        
		else
	//*  14   28:aload_0         
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #140 <Method void setInternalBackgroundTint(ColorStateList)>
	//*  17   33:aload_0         
	//*  18   34:invokevirtual   #174 <Method void applySupportBackgroundTint()>
	//*  19   37:return          
			colorstatelist = null;
	//   20   38:aconst_null     
	//   21   39:astore_2        
		setInternalBackgroundTint(colorstatelist);
		applySupportBackgroundTint();
	//*  22   40:goto            28
	}

	void setInternalBackgroundTint(ColorStateList colorstatelist)
	{
		if(colorstatelist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          43
		{
			if(mInternalBackgroundTint == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #88  <Field TintInfo mInternalBackgroundTint>
	//*   4    8:ifnonnull       22
				mInternalBackgroundTint = new TintInfo();
	//    5   11:aload_0         
	//    6   12:new             #39  <Class TintInfo>
	//    7   15:dup             
	//    8   16:invokespecial   #40  <Method void TintInfo()>
	//    9   19:putfield        #88  <Field TintInfo mInternalBackgroundTint>
			mInternalBackgroundTint.mTintList = colorstatelist;
	//   10   22:aload_0         
	//   11   23:getfield        #88  <Field TintInfo mInternalBackgroundTint>
	//   12   26:aload_1         
	//   13   27:putfield        #57  <Field ColorStateList TintInfo.mTintList>
			mInternalBackgroundTint.mHasTintList = true;
	//   14   30:aload_0         
	//   15   31:getfield        #88  <Field TintInfo mInternalBackgroundTint>
	//   16   34:iconst_1        
	//   17   35:putfield        #53  <Field boolean TintInfo.mHasTintList>
		} else
	//*  18   38:aload_0         
	//*  19   39:invokevirtual   #174 <Method void applySupportBackgroundTint()>
	//*  20   42:return          
		{
			mInternalBackgroundTint = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #88  <Field TintInfo mInternalBackgroundTint>
		}
		applySupportBackgroundTint();
	//*  24   48:goto            38
	}

	void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field TintInfo mBackgroundTint>
	//*   2    4:ifnonnull       18
			mBackgroundTint = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #39  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #40  <Method void TintInfo()>
	//    7   15:putfield        #99  <Field TintInfo mBackgroundTint>
		mBackgroundTint.mTintList = colorstatelist;
	//    8   18:aload_0         
	//    9   19:getfield        #99  <Field TintInfo mBackgroundTint>
	//   10   22:aload_1         
	//   11   23:putfield        #57  <Field ColorStateList TintInfo.mTintList>
		mBackgroundTint.mHasTintList = true;
	//   12   26:aload_0         
	//   13   27:getfield        #99  <Field TintInfo mBackgroundTint>
	//   14   30:iconst_1        
	//   15   31:putfield        #53  <Field boolean TintInfo.mHasTintList>
		applySupportBackgroundTint();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #174 <Method void applySupportBackgroundTint()>
	//   18   38:return          
	}

	void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTint == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field TintInfo mBackgroundTint>
	//*   2    4:ifnonnull       18
			mBackgroundTint = new TintInfo();
	//    3    7:aload_0         
	//    4    8:new             #39  <Class TintInfo>
	//    5   11:dup             
	//    6   12:invokespecial   #40  <Method void TintInfo()>
	//    7   15:putfield        #99  <Field TintInfo mBackgroundTint>
		mBackgroundTint.mTintMode = mode;
	//    8   18:aload_0         
	//    9   19:getfield        #99  <Field TintInfo mBackgroundTint>
	//   10   22:aload_1         
	//   11   23:putfield        #68  <Field android.graphics.PorterDuff$Mode TintInfo.mTintMode>
		mBackgroundTint.mHasTintMode = true;
	//   12   26:aload_0         
	//   13   27:getfield        #99  <Field TintInfo mBackgroundTint>
	//   14   30:iconst_1        
	//   15   31:putfield        #64  <Field boolean TintInfo.mHasTintMode>
		applySupportBackgroundTint();
	//   16   34:aload_0         
	//   17   35:invokevirtual   #174 <Method void applySupportBackgroundTint()>
	//   18   38:return          
	}

	private int mBackgroundResId;
	private TintInfo mBackgroundTint;
	private final AppCompatDrawableManager mDrawableManager = AppCompatDrawableManager.get();
	private TintInfo mInternalBackgroundTint;
	private TintInfo mTmpInfo;
	private final View mView;
}
