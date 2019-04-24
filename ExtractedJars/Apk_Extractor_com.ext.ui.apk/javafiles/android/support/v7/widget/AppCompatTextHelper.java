// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			AppCompatTextViewAutoSizeHelper, AppCompatTextHelperV17, AppCompatDrawableManager, TintInfo, 
//			TintTypedArray

class AppCompatTextHelper
{

	AppCompatTextHelper(TextView textview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		mStyle = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #28  <Field int mStyle>
		mView = textview;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #30  <Field TextView mView>
		mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(mView);
	//    8   14:aload_0         
	//    9   15:new             #32  <Class AppCompatTextViewAutoSizeHelper>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #30  <Field TextView mView>
	//   13   23:invokespecial   #34  <Method void AppCompatTextViewAutoSizeHelper(TextView)>
	//   14   26:putfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//   15   29:return          
	}

	static AppCompatTextHelper create(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          17
			return ((AppCompatTextHelper) (new AppCompatTextHelperV17(textview)));
	//    3    8:new             #46  <Class AppCompatTextHelperV17>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #47  <Method void AppCompatTextHelperV17(TextView)>
	//    7   16:areturn         
		else
			return new AppCompatTextHelper(textview);
	//    8   17:new             #2   <Class AppCompatTextHelper>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #48  <Method void AppCompatTextHelper(TextView)>
	//   12   25:areturn         
	}

	protected static TintInfo createTintInfo(Context context, AppCompatDrawableManager appcompatdrawablemanager, int i)
	{
		context = ((Context) (appcompatdrawablemanager.getTintList(context, i)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #56  <Method android.content.res.ColorStateList AppCompatDrawableManager.getTintList(Context, int)>
	//    4    6:astore_0        
		if(context != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          31
		{
			appcompatdrawablemanager = ((AppCompatDrawableManager) (new TintInfo()));
	//    7   11:new             #58  <Class TintInfo>
	//    8   14:dup             
	//    9   15:invokespecial   #59  <Method void TintInfo()>
	//   10   18:astore_1        
			appcompatdrawablemanager.mHasTintList = true;
	//   11   19:aload_1         
	//   12   20:iconst_1        
	//   13   21:putfield        #63  <Field boolean TintInfo.mHasTintList>
			appcompatdrawablemanager.mTintList = ((android.content.res.ColorStateList) (context));
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:putfield        #67  <Field android.content.res.ColorStateList TintInfo.mTintList>
			return ((TintInfo) (appcompatdrawablemanager));
	//   17   29:aload_1         
	//   18   30:areturn         
		} else
		{
			return null;
	//   19   31:aconst_null     
	//   20   32:areturn         
		}
	}

	private void setTextSizeInternal(int i, float f)
	{
		mAutoSizeTextHelper.setTextSizeInternal(i, f);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #71  <Method void AppCompatTextViewAutoSizeHelper.setTextSizeInternal(int, float)>
	//    5    9:return          
	}

	private void updateTypefaceAndStyle(Context context, TintTypedArray tinttypedarray)
	{
		mStyle = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle, mStyle);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:getstatic       #82  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textStyle>
	//    3    5:aload_0         
	//    4    6:getfield        #28  <Field int mStyle>
	//    5    9:invokevirtual   #88  <Method int TintTypedArray.getInt(int, int)>
	//    6   12:putfield        #28  <Field int mStyle>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_fontFamily) || tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily))
	//*   7   15:aload_2         
	//*   8   16:getstatic       #91  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_fontFamily>
	//*   9   19:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  10   22:ifne            35
	//*  11   25:aload_2         
	//*  12   26:getstatic       #98  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//*  13   29:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  14   32:ifeq            101
		{
			mFontTypeface = null;
	//   15   35:aload_0         
	//   16   36:aconst_null     
	//   17   37:putfield        #100 <Field Typeface mFontTypeface>
			int i;
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_fontFamily))
	//*  18   40:aload_2         
	//*  19   41:getstatic       #91  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_fontFamily>
	//*  20   44:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  21   47:ifeq            102
				i = android.support.v7.appcompat.R.styleable.TextAppearance_android_fontFamily;
	//   22   50:getstatic       #91  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_fontFamily>
	//   23   53:istore_3        
			else
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #106 <Method boolean Context.isRestricted()>
	//*  26   58:ifne            78
	//*  27   61:aload_0         
	//*  28   62:aload_2         
	//*  29   63:iload_3         
	//*  30   64:aload_0         
	//*  31   65:getfield        #28  <Field int mStyle>
	//*  32   68:aload_0         
	//*  33   69:getfield        #30  <Field TextView mView>
	//*  34   72:invokevirtual   #110 <Method Typeface TintTypedArray.getFont(int, int, TextView)>
	//*  35   75:putfield        #100 <Field Typeface mFontTypeface>
	//*  36   78:aload_0         
	//*  37   79:getfield        #100 <Field Typeface mFontTypeface>
	//*  38   82:ifnonnull       101
	//*  39   85:aload_0         
	//*  40   86:aload_2         
	//*  41   87:iload_3         
	//*  42   88:invokevirtual   #114 <Method String TintTypedArray.getString(int)>
	//*  43   91:aload_0         
	//*  44   92:getfield        #28  <Field int mStyle>
	//*  45   95:invokestatic    #119 <Method Typeface Typeface.create(String, int)>
	//*  46   98:putfield        #100 <Field Typeface mFontTypeface>
	//*  47  101:return          
				i = android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily;
	//   48  102:getstatic       #98  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//   49  105:istore_3        
			if(!context.isRestricted())
				try
				{
					mFontTypeface = tinttypedarray.getFont(i, mStyle, mView);
				}
	//*  50  106:goto            54
				// Misplaced declaration of an exception variable
				catch(Context context) { }
	//   51  109:astore_1        
	//*  52  110:goto            78
				// Misplaced declaration of an exception variable
				catch(Context context) { }
	//   53  113:astore_1        
			if(mFontTypeface == null)
				mFontTypeface = Typeface.create(tinttypedarray.getString(i), mStyle);
		}
	//*  54  114:goto            78
	}

	final void applyCompoundDrawableTint(Drawable drawable, TintInfo tintinfo)
	{
		if(drawable != null && tintinfo != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
	//*   2    4:aload_2         
	//*   3    5:ifnull          20
			AppCompatDrawableManager.tintDrawable(drawable, tintinfo, mView.getDrawableState());
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field TextView mView>
	//    8   14:invokevirtual   #127 <Method int[] TextView.getDrawableState()>
	//    9   17:invokestatic    #131 <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
	//   10   20:return          
	}

	void applyCompoundDrawablesTints()
	{
		if(mDrawableLeftTint != null || mDrawableTopTint != null || mDrawableRightTint != null || mDrawableBottomTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #134 <Field TintInfo mDrawableLeftTint>
	//*   2    4:ifnonnull       28
	//*   3    7:aload_0         
	//*   4    8:getfield        #136 <Field TintInfo mDrawableTopTint>
	//*   5   11:ifnonnull       28
	//*   6   14:aload_0         
	//*   7   15:getfield        #138 <Field TintInfo mDrawableRightTint>
	//*   8   18:ifnonnull       28
	//*   9   21:aload_0         
	//*  10   22:getfield        #140 <Field TintInfo mDrawableBottomTint>
	//*  11   25:ifnull          80
		{
			Drawable adrawable[] = mView.getCompoundDrawables();
	//   12   28:aload_0         
	//   13   29:getfield        #30  <Field TextView mView>
	//   14   32:invokevirtual   #144 <Method Drawable[] TextView.getCompoundDrawables()>
	//   15   35:astore_1        
			applyCompoundDrawableTint(adrawable[0], mDrawableLeftTint);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:iconst_0        
	//   19   39:aaload          
	//   20   40:aload_0         
	//   21   41:getfield        #134 <Field TintInfo mDrawableLeftTint>
	//   22   44:invokevirtual   #146 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[1], mDrawableTopTint);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:iconst_1        
	//   26   50:aaload          
	//   27   51:aload_0         
	//   28   52:getfield        #136 <Field TintInfo mDrawableTopTint>
	//   29   55:invokevirtual   #146 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[2], mDrawableRightTint);
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:iconst_2        
	//   33   61:aaload          
	//   34   62:aload_0         
	//   35   63:getfield        #138 <Field TintInfo mDrawableRightTint>
	//   36   66:invokevirtual   #146 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[3], mDrawableBottomTint);
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:iconst_3        
	//   40   72:aaload          
	//   41   73:aload_0         
	//   42   74:getfield        #140 <Field TintInfo mDrawableBottomTint>
	//   43   77:invokevirtual   #146 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
		}
	//   44   80:return          
	}

	void autoSizeText()
	{
		mAutoSizeTextHelper.autoSizeText();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #152 <Method void AppCompatTextViewAutoSizeHelper.autoSizeText()>
	//    3    7:return          
	}

	int getAutoSizeMaxTextSize()
	{
		return mAutoSizeTextHelper.getAutoSizeMaxTextSize();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #157 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize()>
	//    3    7:ireturn         
	}

	int getAutoSizeMinTextSize()
	{
		return mAutoSizeTextHelper.getAutoSizeMinTextSize();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #160 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize()>
	//    3    7:ireturn         
	}

	int getAutoSizeStepGranularity()
	{
		return mAutoSizeTextHelper.getAutoSizeStepGranularity();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #163 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity()>
	//    3    7:ireturn         
	}

	int[] getAutoSizeTextAvailableSizes()
	{
		return mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #166 <Method int[] AppCompatTextViewAutoSizeHelper.getAutoSizeTextAvailableSizes()>
	//    3    7:areturn         
	}

	int getAutoSizeTextType()
	{
		return mAutoSizeTextHelper.getAutoSizeTextType();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #169 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeTextType()>
	//    3    7:ireturn         
	}

	boolean isAutoSizeEnabled()
	{
		return mAutoSizeTextHelper.isAutoSizeEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #172 <Method boolean AppCompatTextViewAutoSizeHelper.isAutoSizeEnabled()>
	//    3    7:ireturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
label0:
		{
			android.content.res.ColorStateList colorstatelist = null;
	//    0    0:aconst_null     
	//    1    1:astore          10
			android.content.res.ColorStateList colorstatelist1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          11
			Context context = mView.getContext();
	//    4    6:aload_0         
	//    5    7:getfield        #30  <Field TextView mView>
	//    6   10:invokevirtual   #178 <Method Context TextView.getContext()>
	//    7   13:astore          14
			Object obj = ((Object) (AppCompatDrawableManager.get()));
	//    8   15:invokestatic    #182 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//    9   18:astore          8
			Object obj1 = ((Object) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextHelper, i, 0)));
	//   10   20:aload           14
	//   11   22:aload_1         
	//   12   23:getstatic       #186 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextHelper>
	//   13   26:iload_2         
	//   14   27:iconst_0        
	//   15   28:invokestatic    #190 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   16   31:astore          9
			int j = ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance, -1);
	//   17   33:aload           9
	//   18   35:getstatic       #193 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_textAppearance>
	//   19   38:iconst_m1       
	//   20   39:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   21   42:istore_3        
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft))
	//*  22   43:aload           9
	//*  23   45:getstatic       #199 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//*  24   48:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  25   51:ifeq            74
				mDrawableLeftTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
	//   26   54:aload_0         
	//   27   55:aload           14
	//   28   57:aload           8
	//   29   59:aload           9
	//   30   61:getstatic       #199 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//   31   64:iconst_0        
	//   32   65:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   33   68:invokestatic    #201 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   34   71:putfield        #134 <Field TintInfo mDrawableLeftTint>
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop))
	//*  35   74:aload           9
	//*  36   76:getstatic       #204 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//*  37   79:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  38   82:ifeq            105
				mDrawableTopTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop, 0));
	//   39   85:aload_0         
	//   40   86:aload           14
	//   41   88:aload           8
	//   42   90:aload           9
	//   43   92:getstatic       #204 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//   44   95:iconst_0        
	//   45   96:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   46   99:invokestatic    #201 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   47  102:putfield        #136 <Field TintInfo mDrawableTopTint>
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight))
	//*  48  105:aload           9
	//*  49  107:getstatic       #207 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//*  50  110:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  51  113:ifeq            136
				mDrawableRightTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight, 0));
	//   52  116:aload_0         
	//   53  117:aload           14
	//   54  119:aload           8
	//   55  121:aload           9
	//   56  123:getstatic       #207 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//   57  126:iconst_0        
	//   58  127:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   59  130:invokestatic    #201 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   60  133:putfield        #138 <Field TintInfo mDrawableRightTint>
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom))
	//*  61  136:aload           9
	//*  62  138:getstatic       #210 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//*  63  141:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  64  144:ifeq            167
				mDrawableBottomTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
	//   65  147:aload_0         
	//   66  148:aload           14
	//   67  150:aload           8
	//   68  152:aload           9
	//   69  154:getstatic       #210 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//   70  157:iconst_0        
	//   71  158:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   72  161:invokestatic    #201 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   73  164:putfield        #140 <Field TintInfo mDrawableBottomTint>
			((TintTypedArray) (obj1)).recycle();
	//   74  167:aload           9
	//   75  169:invokevirtual   #213 <Method void TintTypedArray.recycle()>
			boolean flag3 = mView.getTransformationMethod() instanceof PasswordTransformationMethod;
	//   76  172:aload_0         
	//   77  173:getfield        #30  <Field TextView mView>
	//   78  176:invokevirtual   #217 <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//   79  179:instanceof      #219 <Class PasswordTransformationMethod>
	//   80  182:istore          7
			boolean flag1;
			if(j != -1)
	//*  81  184:iload_3         
	//*  82  185:iconst_m1       
	//*  83  186:icmpeq          714
			{
				Object obj2 = ((Object) (TintTypedArray.obtainStyledAttributes(context, j, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//   84  189:aload           14
	//   85  191:iload_3         
	//   86  192:getstatic       #222 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//   87  195:invokestatic    #225 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//   88  198:astore          13
				android.content.res.ColorStateList colorstatelist2;
				if(!flag3 && ((TintTypedArray) (obj2)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//*  89  200:iload           7
	//*  90  202:ifne            706
	//*  91  205:aload           13
	//*  92  207:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*  93  210:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  94  213:ifeq            706
				{
					flag1 = ((TintTypedArray) (obj2)).getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//   95  216:aload           13
	//   96  218:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//   97  221:iconst_0        
	//   98  222:invokevirtual   #232 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   99  225:istore          5
					j = 1;
	//  100  227:iconst_1        
	//  101  228:istore_3        
				} else
	//* 102  229:aload_0         
	//* 103  230:aload           14
	//* 104  232:aload           13
	//* 105  234:invokespecial   #234 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
	//* 106  237:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//* 107  240:bipush          23
	//* 108  242:icmpge          697
	//* 109  245:aload           13
	//* 110  247:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 111  250:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 112  253:ifeq            691
	//* 113  256:aload           13
	//* 114  258:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 115  261:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//* 116  264:astore          8
	//* 117  266:aload           13
	//* 118  268:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 119  271:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 120  274:ifeq            685
	//* 121  277:aload           13
	//* 122  279:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 123  282:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//* 124  285:astore          10
	//* 125  287:aload           8
	//* 126  289:astore          9
	//* 127  291:aload           10
	//* 128  293:astore          12
	//* 129  295:aload           13
	//* 130  297:getstatic       #247 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 131  300:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 132  303:ifeq            324
	//* 133  306:aload           13
	//* 134  308:getstatic       #247 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 135  311:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//* 136  314:astore          11
	//* 137  316:aload           10
	//* 138  318:astore          12
	//* 139  320:aload           8
	//* 140  322:astore          9
	//* 141  324:aload           13
	//* 142  326:invokevirtual   #213 <Method void TintTypedArray.recycle()>
	//* 143  329:aload           12
	//* 144  331:astore          8
	//* 145  333:aload           11
	//* 146  335:astore          10
	//* 147  337:aload           14
	//* 148  339:aload_1         
	//* 149  340:getstatic       #222 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//* 150  343:iload_2         
	//* 151  344:iconst_0        
	//* 152  345:invokestatic    #190 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//* 153  348:astore          15
	//* 154  350:iload_3         
	//* 155  351:istore          4
	//* 156  353:iload           5
	//* 157  355:istore          6
	//* 158  357:iload           7
	//* 159  359:ifne            394
	//* 160  362:iload_3         
	//* 161  363:istore          4
	//* 162  365:iload           5
	//* 163  367:istore          6
	//* 164  369:aload           15
	//* 165  371:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 166  374:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 167  377:ifeq            394
	//* 168  380:aload           15
	//* 169  382:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 170  385:iconst_0        
	//* 171  386:invokevirtual   #232 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//* 172  389:istore          6
	//* 173  391:iconst_1        
	//* 174  392:istore          4
	//* 175  394:aload           9
	//* 176  396:astore          12
	//* 177  398:aload           10
	//* 178  400:astore          13
	//* 179  402:aload           8
	//* 180  404:astore          11
	//* 181  406:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//* 182  409:bipush          23
	//* 183  411:icmpge          497
	//* 184  414:aload           15
	//* 185  416:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 186  419:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 187  422:ifeq            435
	//* 188  425:aload           15
	//* 189  427:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 190  430:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//* 191  433:astore          9
	//* 192  435:aload           15
	//* 193  437:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 194  440:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 195  443:ifeq            456
	//* 196  446:aload           15
	//* 197  448:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 198  451:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//* 199  454:astore          8
	//* 200  456:aload           9
	//* 201  458:astore          12
	//* 202  460:aload           10
	//* 203  462:astore          13
	//* 204  464:aload           8
	//* 205  466:astore          11
	//* 206  468:aload           15
	//* 207  470:getstatic       #247 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 208  473:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 209  476:ifeq            497
	//* 210  479:aload           15
	//* 211  481:getstatic       #247 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 212  484:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//* 213  487:astore          13
	//* 214  489:aload           8
	//* 215  491:astore          11
	//* 216  493:aload           9
	//* 217  495:astore          12
	//* 218  497:aload_0         
	//* 219  498:aload           14
	//* 220  500:aload           15
	//* 221  502:invokespecial   #234 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
	//* 222  505:aload           15
	//* 223  507:invokevirtual   #213 <Method void TintTypedArray.recycle()>
	//* 224  510:aload           12
	//* 225  512:ifnull          524
	//* 226  515:aload_0         
	//* 227  516:getfield        #30  <Field TextView mView>
	//* 228  519:aload           12
	//* 229  521:invokevirtual   #251 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
	//* 230  524:aload           11
	//* 231  526:ifnull          538
	//* 232  529:aload_0         
	//* 233  530:getfield        #30  <Field TextView mView>
	//* 234  533:aload           11
	//* 235  535:invokevirtual   #254 <Method void TextView.setHintTextColor(android.content.res.ColorStateList)>
	//* 236  538:aload           13
	//* 237  540:ifnull          552
	//* 238  543:aload_0         
	//* 239  544:getfield        #30  <Field TextView mView>
	//* 240  547:aload           13
	//* 241  549:invokevirtual   #257 <Method void TextView.setLinkTextColor(android.content.res.ColorStateList)>
	//* 242  552:iload           7
	//* 243  554:ifne            568
	//* 244  557:iload           4
	//* 245  559:ifeq            568
	//* 246  562:aload_0         
	//* 247  563:iload           6
	//* 248  565:invokevirtual   #261 <Method void setAllCaps(boolean)>
	//* 249  568:aload_0         
	//* 250  569:getfield        #100 <Field Typeface mFontTypeface>
	//* 251  572:ifnull          590
	//* 252  575:aload_0         
	//* 253  576:getfield        #30  <Field TextView mView>
	//* 254  579:aload_0         
	//* 255  580:getfield        #100 <Field Typeface mFontTypeface>
	//* 256  583:aload_0         
	//* 257  584:getfield        #28  <Field int mStyle>
	//* 258  587:invokevirtual   #265 <Method void TextView.setTypeface(Typeface, int)>
	//* 259  590:aload_0         
	//* 260  591:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 261  594:aload_1         
	//* 262  595:iload_2         
	//* 263  596:invokevirtual   #267 <Method void AppCompatTextViewAutoSizeHelper.loadFromAttributes(AttributeSet, int)>
	//* 264  599:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//* 265  602:bipush          26
	//* 266  604:icmplt          674
	//* 267  607:aload_0         
	//* 268  608:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 269  611:invokevirtual   #169 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeTextType()>
	//* 270  614:ifeq            674
	//* 271  617:aload_0         
	//* 272  618:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 273  621:invokevirtual   #166 <Method int[] AppCompatTextViewAutoSizeHelper.getAutoSizeTextAvailableSizes()>
	//* 274  624:astore_1        
	//* 275  625:aload_1         
	//* 276  626:arraylength     
	//* 277  627:ifle            674
	//* 278  630:aload_0         
	//* 279  631:getfield        #30  <Field TextView mView>
	//* 280  634:invokevirtual   #268 <Method int TextView.getAutoSizeStepGranularity()>
	//* 281  637:i2f             
	//* 282  638:ldc2            #269 <Float -1F>
	//* 283  641:fcmpl           
	//* 284  642:ifeq            675
	//* 285  645:aload_0         
	//* 286  646:getfield        #30  <Field TextView mView>
	//* 287  649:aload_0         
	//* 288  650:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 289  653:invokevirtual   #160 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize()>
	//* 290  656:aload_0         
	//* 291  657:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 292  660:invokevirtual   #157 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize()>
	//* 293  663:aload_0         
	//* 294  664:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 295  667:invokevirtual   #163 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity()>
	//* 296  670:iconst_0        
	//* 297  671:invokevirtual   #273 <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//* 298  674:return          
	//* 299  675:aload_0         
	//* 300  676:getfield        #30  <Field TextView mView>
	//* 301  679:aload_1         
	//* 302  680:iconst_0        
	//* 303  681:invokevirtual   #277 <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//* 304  684:return          
	//* 305  685:aconst_null     
	//* 306  686:astore          10
	//* 307  688:goto            287
	//* 308  691:aconst_null     
	//* 309  692:astore          8
	//* 310  694:goto            266
	//* 311  697:aconst_null     
	//* 312  698:astore          12
	//* 313  700:aconst_null     
	//* 314  701:astore          9
	//* 315  703:goto            324
				{
					j = 0;
	//  316  706:iconst_0        
	//  317  707:istore_3        
					flag1 = false;
	//  318  708:iconst_0        
	//  319  709:istore          5
				}
				updateTypefaceAndStyle(context, ((TintTypedArray) (obj2)));
				if(android.os.Build.VERSION.SDK_INT < 23)
				{
					boolean flag;
					boolean flag2;
					TintTypedArray tinttypedarray;
					if(((TintTypedArray) (obj2)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
						obj = ((Object) (((TintTypedArray) (obj2)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
					else
						obj = null;
					if(((TintTypedArray) (obj2)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
						colorstatelist = ((TintTypedArray) (obj2)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint);
					else
						colorstatelist = null;
					obj1 = obj;
					colorstatelist2 = colorstatelist;
					if(((TintTypedArray) (obj2)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
					{
						colorstatelist1 = ((TintTypedArray) (obj2)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink);
						colorstatelist2 = colorstatelist;
						obj1 = obj;
					}
				} else
				{
					colorstatelist2 = null;
					obj1 = null;
				}
				((TintTypedArray) (obj2)).recycle();
				obj = ((Object) (colorstatelist2));
				colorstatelist = colorstatelist1;
			} else
	//* 320  711:goto            229
			{
				obj = null;
	//  321  714:aconst_null     
	//  322  715:astore          8
				obj1 = null;
	//  323  717:aconst_null     
	//  324  718:astore          9
				j = 0;
	//  325  720:iconst_0        
	//  326  721:istore_3        
				flag1 = false;
	//  327  722:iconst_0        
	//  328  723:istore          5
			}
			tinttypedarray = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.TextAppearance, i, 0);
			flag = ((boolean) (j));
			flag2 = flag1;
			if(!flag3)
			{
				flag = ((boolean) (j));
				flag2 = flag1;
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
				{
					flag2 = tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
					flag = true;
				}
			}
			colorstatelist2 = ((android.content.res.ColorStateList) (obj1));
			obj2 = ((Object) (colorstatelist));
			colorstatelist1 = ((android.content.res.ColorStateList) (obj));
			if(android.os.Build.VERSION.SDK_INT < 23)
			{
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
					obj1 = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
					obj = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint)));
				colorstatelist2 = ((android.content.res.ColorStateList) (obj1));
				obj2 = ((Object) (colorstatelist));
				colorstatelist1 = ((android.content.res.ColorStateList) (obj));
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
				{
					obj2 = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink)));
					colorstatelist1 = ((android.content.res.ColorStateList) (obj));
					colorstatelist2 = ((android.content.res.ColorStateList) (obj1));
				}
			}
			updateTypefaceAndStyle(context, tinttypedarray);
			tinttypedarray.recycle();
			if(colorstatelist2 != null)
				mView.setTextColor(colorstatelist2);
			if(colorstatelist1 != null)
				mView.setHintTextColor(colorstatelist1);
			if(obj2 != null)
				mView.setLinkTextColor(((android.content.res.ColorStateList) (obj2)));
			if(!flag3 && flag)
				setAllCaps(flag2);
			if(mFontTypeface != null)
				mView.setTypeface(mFontTypeface, mStyle);
			mAutoSizeTextHelper.loadFromAttributes(attributeset, i);
			if(android.os.Build.VERSION.SDK_INT >= 26 && mAutoSizeTextHelper.getAutoSizeTextType() != 0)
			{
				attributeset = ((AttributeSet) (mAutoSizeTextHelper.getAutoSizeTextAvailableSizes()));
				if(attributeset.length > 0)
				{
					if((float)mView.getAutoSizeStepGranularity() == -1F)
						break label0;
					mView.setAutoSizeTextTypeUniformWithConfiguration(mAutoSizeTextHelper.getAutoSizeMinTextSize(), mAutoSizeTextHelper.getAutoSizeMaxTextSize(), mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
				}
			}
			return;
		}
		mView.setAutoSizeTextTypeUniformWithPresetSizes(((int []) (attributeset)), 0);
	//* 329  725:goto            337
	}

	void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT < 26)
	//*   0    0:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          12
			autoSizeText();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #280 <Method void autoSizeText()>
	//    5   12:return          
	}

	void onSetTextAppearance(Context context, int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #222 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    3    5:invokestatic    #225 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    4    8:astore_3        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//*   5    9:aload_3         
	//*   6   10:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*   7   13:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*   8   16:ifeq            31
			setAllCaps(tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
	//    9   19:aload_0         
	//   10   20:aload_3         
	//   11   21:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #232 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   14   28:invokevirtual   #261 <Method void setAllCaps(boolean)>
		if(android.os.Build.VERSION.SDK_INT < 23 && tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*  15   31:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          23
	//*  17   36:icmpge          72
	//*  18   39:aload_3         
	//*  19   40:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*  20   43:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  21   46:ifeq            72
		{
			android.content.res.ColorStateList colorstatelist = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   22   49:aload_3         
	//   23   50:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   24   53:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//   25   56:astore          4
			if(colorstatelist != null)
	//*  26   58:aload           4
	//*  27   60:ifnull          72
				mView.setTextColor(colorstatelist);
	//   28   63:aload_0         
	//   29   64:getfield        #30  <Field TextView mView>
	//   30   67:aload           4
	//   31   69:invokevirtual   #251 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
		}
		updateTypefaceAndStyle(context, tinttypedarray);
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:aload_3         
	//   35   75:invokespecial   #234 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
		tinttypedarray.recycle();
	//   36   78:aload_3         
	//   37   79:invokevirtual   #213 <Method void TintTypedArray.recycle()>
		if(mFontTypeface != null)
	//*  38   82:aload_0         
	//*  39   83:getfield        #100 <Field Typeface mFontTypeface>
	//*  40   86:ifnull          104
			mView.setTypeface(mFontTypeface, mStyle);
	//   41   89:aload_0         
	//   42   90:getfield        #30  <Field TextView mView>
	//   43   93:aload_0         
	//   44   94:getfield        #100 <Field Typeface mFontTypeface>
	//   45   97:aload_0         
	//   46   98:getfield        #28  <Field int mStyle>
	//   47  101:invokevirtual   #265 <Method void TextView.setTypeface(Typeface, int)>
	//   48  104:return          
	}

	void setAllCaps(boolean flag)
	{
		mView.setAllCaps(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field TextView mView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #283 <Method void TextView.setAllCaps(boolean)>
	//    4    8:return          
	}

	void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #286 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//    7   12:return          
	}

	void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
		throws IllegalArgumentException
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #288 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//    5    9:return          
	}

	void setAutoSizeTextTypeWithDefaults(int i)
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #293 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeWithDefaults(int)>
	//    4    8:return          
	}

	void setTextSize(int i, float f)
	{
		if(android.os.Build.VERSION.SDK_INT < 26 && !isAutoSizeEnabled())
	//*   0    0:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          21
	//*   3    8:aload_0         
	//*   4    9:invokevirtual   #295 <Method boolean isAutoSizeEnabled()>
	//*   5   12:ifne            21
			setTextSizeInternal(i, f);
	//    6   15:aload_0         
	//    7   16:iload_1         
	//    8   17:fload_2         
	//    9   18:invokespecial   #296 <Method void setTextSizeInternal(int, float)>
	//   10   21:return          
	}

	private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
	private TintInfo mDrawableBottomTint;
	private TintInfo mDrawableLeftTint;
	private TintInfo mDrawableRightTint;
	private TintInfo mDrawableTopTint;
	private Typeface mFontTypeface;
	private int mStyle;
	final TextView mView;
}
