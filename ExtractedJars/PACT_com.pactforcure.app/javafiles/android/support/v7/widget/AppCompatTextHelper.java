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
			Context context = mView.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field TextView mView>
	//    2    4:invokevirtual   #178 <Method Context TextView.getContext()>
	//    3    7:astore          17
			Object obj = ((Object) (AppCompatDrawableManager.get()));
	//    4    9:invokestatic    #182 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//    5   12:astore          9
			Object obj1 = ((Object) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextHelper, i, 0)));
	//    6   14:aload           17
	//    7   16:aload_1         
	//    8   17:getstatic       #186 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextHelper>
	//    9   20:iload_2         
	//   10   21:iconst_0        
	//   11   22:invokestatic    #190 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   12   25:astore          10
			int j = ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance, -1);
	//   13   27:aload           10
	//   14   29:getstatic       #193 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_textAppearance>
	//   15   32:iconst_m1       
	//   16   33:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   17   36:istore          5
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft))
	//*  18   38:aload           10
	//*  19   40:getstatic       #199 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//*  20   43:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  21   46:ifeq            69
				mDrawableLeftTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
	//   22   49:aload_0         
	//   23   50:aload           17
	//   24   52:aload           9
	//   25   54:aload           10
	//   26   56:getstatic       #199 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//   27   59:iconst_0        
	//   28   60:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   29   63:invokestatic    #201 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   30   66:putfield        #134 <Field TintInfo mDrawableLeftTint>
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop))
	//*  31   69:aload           10
	//*  32   71:getstatic       #204 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//*  33   74:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  34   77:ifeq            100
				mDrawableTopTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop, 0));
	//   35   80:aload_0         
	//   36   81:aload           17
	//   37   83:aload           9
	//   38   85:aload           10
	//   39   87:getstatic       #204 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//   40   90:iconst_0        
	//   41   91:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   42   94:invokestatic    #201 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   43   97:putfield        #136 <Field TintInfo mDrawableTopTint>
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight))
	//*  44  100:aload           10
	//*  45  102:getstatic       #207 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//*  46  105:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  47  108:ifeq            131
				mDrawableRightTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight, 0));
	//   48  111:aload_0         
	//   49  112:aload           17
	//   50  114:aload           9
	//   51  116:aload           10
	//   52  118:getstatic       #207 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//   53  121:iconst_0        
	//   54  122:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   55  125:invokestatic    #201 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   56  128:putfield        #138 <Field TintInfo mDrawableRightTint>
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom))
	//*  57  131:aload           10
	//*  58  133:getstatic       #210 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//*  59  136:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//*  60  139:ifeq            162
				mDrawableBottomTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
	//   61  142:aload_0         
	//   62  143:aload           17
	//   63  145:aload           9
	//   64  147:aload           10
	//   65  149:getstatic       #210 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//   66  152:iconst_0        
	//   67  153:invokevirtual   #196 <Method int TintTypedArray.getResourceId(int, int)>
	//   68  156:invokestatic    #201 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   69  159:putfield        #140 <Field TintInfo mDrawableBottomTint>
			((TintTypedArray) (obj1)).recycle();
	//   70  162:aload           10
	//   71  164:invokevirtual   #213 <Method void TintTypedArray.recycle()>
			boolean flag4 = mView.getTransformationMethod() instanceof PasswordTransformationMethod;
	//   72  167:aload_0         
	//   73  168:getfield        #30  <Field TextView mView>
	//   74  171:invokevirtual   #217 <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//   75  174:instanceof      #219 <Class PasswordTransformationMethod>
	//   76  177:istore          8
			boolean flag2 = false;
	//   77  179:iconst_0        
	//   78  180:istore          6
			boolean flag3 = false;
	//   79  182:iconst_0        
	//   80  183:istore          7
			boolean flag = false;
	//   81  185:iconst_0        
	//   82  186:istore_3        
			boolean flag1 = false;
	//   83  187:iconst_0        
	//   84  188:istore          4
			Object obj2 = null;
	//   85  190:aconst_null     
	//   86  191:astore          16
			obj1 = null;
	//   87  193:aconst_null     
	//   88  194:astore          10
			TintTypedArray tinttypedarray = null;
	//   89  196:aconst_null     
	//   90  197:astore          15
			android.content.res.ColorStateList colorstatelist1 = null;
	//   91  199:aconst_null     
	//   92  200:astore          12
			obj = null;
	//   93  202:aconst_null     
	//   94  203:astore          9
			android.content.res.ColorStateList colorstatelist2 = null;
	//   95  205:aconst_null     
	//   96  206:astore          13
			android.content.res.ColorStateList colorstatelist = null;
	//   97  208:aconst_null     
	//   98  209:astore          11
			android.content.res.ColorStateList colorstatelist3 = null;
	//   99  211:aconst_null     
	//  100  212:astore          14
			if(j != -1)
	//* 101  214:iload           5
	//* 102  216:iconst_m1       
	//* 103  217:icmpeq          395
			{
				TintTypedArray tinttypedarray1 = TintTypedArray.obtainStyledAttributes(context, j, android.support.v7.appcompat.R.styleable.TextAppearance);
	//  104  220:aload           17
	//  105  222:iload           5
	//  106  224:getstatic       #222 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  107  227:invokestatic    #225 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//  108  230:astore          18
				flag2 = flag3;
	//  109  232:iload           7
	//  110  234:istore          6
				flag = flag1;
	//  111  236:iload           4
	//  112  238:istore_3        
				if(!flag4)
	//* 113  239:iload           8
	//* 114  241:ifne            275
				{
					flag2 = flag3;
	//  115  244:iload           7
	//  116  246:istore          6
					flag = flag1;
	//  117  248:iload           4
	//  118  250:istore_3        
					if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//* 119  251:aload           18
	//* 120  253:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 121  256:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 122  259:ifeq            275
					{
						flag = true;
	//  123  262:iconst_1        
	//  124  263:istore_3        
						flag2 = tinttypedarray1.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//  125  264:aload           18
	//  126  266:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//  127  269:iconst_0        
	//  128  270:invokevirtual   #232 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  129  273:istore          6
					}
				}
				updateTypefaceAndStyle(context, tinttypedarray1);
	//  130  275:aload_0         
	//  131  276:aload           17
	//  132  278:aload           18
	//  133  280:invokespecial   #234 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
				obj1 = ((Object) (obj2));
	//  134  283:aload           16
	//  135  285:astore          10
				colorstatelist = colorstatelist3;
	//  136  287:aload           14
	//  137  289:astore          11
				if(android.os.Build.VERSION.SDK_INT < 23)
	//* 138  291:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//* 139  294:bipush          23
	//* 140  296:icmpge          386
				{
					obj = ((Object) (tinttypedarray));
	//  141  299:aload           15
	//  142  301:astore          9
					if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 143  303:aload           18
	//* 144  305:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 145  308:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 146  311:ifeq            324
						obj = ((Object) (tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  147  314:aload           18
	//  148  316:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  149  319:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  150  322:astore          9
					if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 151  324:aload           18
	//* 152  326:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 153  329:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 154  332:ifeq            345
						colorstatelist2 = tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint);
	//  155  335:aload           18
	//  156  337:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  157  340:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  158  343:astore          13
					obj1 = obj;
	//  159  345:aload           9
	//  160  347:astore          10
					colorstatelist1 = colorstatelist2;
	//  161  349:aload           13
	//  162  351:astore          12
					colorstatelist = colorstatelist3;
	//  163  353:aload           14
	//  164  355:astore          11
					if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
	//* 165  357:aload           18
	//* 166  359:getstatic       #247 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 167  362:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 168  365:ifeq            386
					{
						colorstatelist = tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink);
	//  169  368:aload           18
	//  170  370:getstatic       #247 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//  171  373:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  172  376:astore          11
						colorstatelist1 = colorstatelist2;
	//  173  378:aload           13
	//  174  380:astore          12
						obj1 = obj;
	//  175  382:aload           9
	//  176  384:astore          10
					}
				}
				tinttypedarray1.recycle();
	//  177  386:aload           18
	//  178  388:invokevirtual   #213 <Method void TintTypedArray.recycle()>
				obj = ((Object) (colorstatelist1));
	//  179  391:aload           12
	//  180  393:astore          9
			}
			tinttypedarray = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.TextAppearance, i, 0);
	//  181  395:aload           17
	//  182  397:aload_1         
	//  183  398:getstatic       #222 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  184  401:iload_2         
	//  185  402:iconst_0        
	//  186  403:invokestatic    #190 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//  187  406:astore          15
			flag3 = flag2;
	//  188  408:iload           6
	//  189  410:istore          7
			flag1 = flag;
	//  190  412:iload_3         
	//  191  413:istore          4
			if(!flag4)
	//* 192  415:iload           8
	//* 193  417:ifne            452
			{
				flag3 = flag2;
	//  194  420:iload           6
	//  195  422:istore          7
				flag1 = flag;
	//  196  424:iload_3         
	//  197  425:istore          4
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//* 198  427:aload           15
	//* 199  429:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 200  432:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 201  435:ifeq            452
				{
					flag1 = true;
	//  202  438:iconst_1        
	//  203  439:istore          4
					flag3 = tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//  204  441:aload           15
	//  205  443:getstatic       #228 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//  206  446:iconst_0        
	//  207  447:invokevirtual   #232 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  208  450:istore          7
				}
			}
			colorstatelist1 = ((android.content.res.ColorStateList) (obj1));
	//  209  452:aload           10
	//  210  454:astore          12
			colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  211  456:aload           9
	//  212  458:astore          13
			colorstatelist3 = colorstatelist;
	//  213  460:aload           11
	//  214  462:astore          14
			if(android.os.Build.VERSION.SDK_INT < 23)
	//* 215  464:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//* 216  467:bipush          23
	//* 217  469:icmpge          555
			{
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 218  472:aload           15
	//* 219  474:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 220  477:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 221  480:ifeq            493
					obj1 = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  222  483:aload           15
	//  223  485:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  224  488:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  225  491:astore          10
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 226  493:aload           15
	//* 227  495:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 228  498:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 229  501:ifeq            514
					obj = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint)));
	//  230  504:aload           15
	//  231  506:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  232  509:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  233  512:astore          9
				colorstatelist1 = ((android.content.res.ColorStateList) (obj1));
	//  234  514:aload           10
	//  235  516:astore          12
				colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  236  518:aload           9
	//  237  520:astore          13
				colorstatelist3 = colorstatelist;
	//  238  522:aload           11
	//  239  524:astore          14
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
	//* 240  526:aload           15
	//* 241  528:getstatic       #247 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 242  531:invokevirtual   #95  <Method boolean TintTypedArray.hasValue(int)>
	//* 243  534:ifeq            555
				{
					colorstatelist3 = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink);
	//  244  537:aload           15
	//  245  539:getstatic       #247 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//  246  542:invokevirtual   #241 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  247  545:astore          14
					colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  248  547:aload           9
	//  249  549:astore          13
					colorstatelist1 = ((android.content.res.ColorStateList) (obj1));
	//  250  551:aload           10
	//  251  553:astore          12
				}
			}
			updateTypefaceAndStyle(context, tinttypedarray);
	//  252  555:aload_0         
	//  253  556:aload           17
	//  254  558:aload           15
	//  255  560:invokespecial   #234 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
			tinttypedarray.recycle();
	//  256  563:aload           15
	//  257  565:invokevirtual   #213 <Method void TintTypedArray.recycle()>
			if(colorstatelist1 != null)
	//* 258  568:aload           12
	//* 259  570:ifnull          582
				mView.setTextColor(colorstatelist1);
	//  260  573:aload_0         
	//  261  574:getfield        #30  <Field TextView mView>
	//  262  577:aload           12
	//  263  579:invokevirtual   #251 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
			if(colorstatelist2 != null)
	//* 264  582:aload           13
	//* 265  584:ifnull          596
				mView.setHintTextColor(colorstatelist2);
	//  266  587:aload_0         
	//  267  588:getfield        #30  <Field TextView mView>
	//  268  591:aload           13
	//  269  593:invokevirtual   #254 <Method void TextView.setHintTextColor(android.content.res.ColorStateList)>
			if(colorstatelist3 != null)
	//* 270  596:aload           14
	//* 271  598:ifnull          610
				mView.setLinkTextColor(colorstatelist3);
	//  272  601:aload_0         
	//  273  602:getfield        #30  <Field TextView mView>
	//  274  605:aload           14
	//  275  607:invokevirtual   #257 <Method void TextView.setLinkTextColor(android.content.res.ColorStateList)>
			if(!flag4 && flag1)
	//* 276  610:iload           8
	//* 277  612:ifne            626
	//* 278  615:iload           4
	//* 279  617:ifeq            626
				setAllCaps(flag3);
	//  280  620:aload_0         
	//  281  621:iload           7
	//  282  623:invokevirtual   #261 <Method void setAllCaps(boolean)>
			if(mFontTypeface != null)
	//* 283  626:aload_0         
	//* 284  627:getfield        #100 <Field Typeface mFontTypeface>
	//* 285  630:ifnull          648
				mView.setTypeface(mFontTypeface, mStyle);
	//  286  633:aload_0         
	//  287  634:getfield        #30  <Field TextView mView>
	//  288  637:aload_0         
	//  289  638:getfield        #100 <Field Typeface mFontTypeface>
	//  290  641:aload_0         
	//  291  642:getfield        #28  <Field int mStyle>
	//  292  645:invokevirtual   #265 <Method void TextView.setTypeface(Typeface, int)>
			mAutoSizeTextHelper.loadFromAttributes(attributeset, i);
	//  293  648:aload_0         
	//  294  649:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  295  652:aload_1         
	//  296  653:iload_2         
	//  297  654:invokevirtual   #267 <Method void AppCompatTextViewAutoSizeHelper.loadFromAttributes(AttributeSet, int)>
			if(android.os.Build.VERSION.SDK_INT >= 26 && mAutoSizeTextHelper.getAutoSizeTextType() != 0)
	//* 298  657:getstatic       #44  <Field int android.os.Build$VERSION.SDK_INT>
	//* 299  660:bipush          26
	//* 300  662:icmplt          732
	//* 301  665:aload_0         
	//* 302  666:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 303  669:invokevirtual   #169 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeTextType()>
	//* 304  672:ifeq            732
			{
				attributeset = ((AttributeSet) (mAutoSizeTextHelper.getAutoSizeTextAvailableSizes()));
	//  305  675:aload_0         
	//  306  676:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  307  679:invokevirtual   #166 <Method int[] AppCompatTextViewAutoSizeHelper.getAutoSizeTextAvailableSizes()>
	//  308  682:astore_1        
				if(attributeset.length > 0)
	//* 309  683:aload_1         
	//* 310  684:arraylength     
	//* 311  685:ifle            732
				{
					if((float)mView.getAutoSizeStepGranularity() == -1F)
						break label0;
	//  312  688:aload_0         
	//  313  689:getfield        #30  <Field TextView mView>
	//  314  692:invokevirtual   #268 <Method int TextView.getAutoSizeStepGranularity()>
	//  315  695:i2f             
	//  316  696:ldc2            #269 <Float -1F>
	//  317  699:fcmpl           
	//  318  700:ifeq            733
					mView.setAutoSizeTextTypeUniformWithConfiguration(mAutoSizeTextHelper.getAutoSizeMinTextSize(), mAutoSizeTextHelper.getAutoSizeMaxTextSize(), mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
	//  319  703:aload_0         
	//  320  704:getfield        #30  <Field TextView mView>
	//  321  707:aload_0         
	//  322  708:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  323  711:invokevirtual   #160 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize()>
	//  324  714:aload_0         
	//  325  715:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  326  718:invokevirtual   #157 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize()>
	//  327  721:aload_0         
	//  328  722:getfield        #36  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  329  725:invokevirtual   #163 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity()>
	//  330  728:iconst_0        
	//  331  729:invokevirtual   #273 <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
				}
			}
			return;
	//  332  732:return          
		}
		mView.setAutoSizeTextTypeUniformWithPresetSizes(((int []) (attributeset)), 0);
	//  333  733:aload_0         
	//  334  734:getfield        #30  <Field TextView mView>
	//  335  737:aload_1         
	//  336  738:iconst_0        
	//  337  739:invokevirtual   #277 <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//  338  742:return          
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
