// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.ah;
import android.support.v4.widget.d;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.widget:
//			AppCompatTextViewAutoSizeHelper, AppCompatDrawableManager, TintInfo, TintTypedArray

class AppCompatTextHelper
{

	AppCompatTextHelper(TextView textview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mStyle = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #34  <Field int mStyle>
		mView = textview;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #36  <Field TextView mView>
		mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(mView);
	//    8   14:aload_0         
	//    9   15:new             #38  <Class AppCompatTextViewAutoSizeHelper>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #36  <Field TextView mView>
	//   13   23:invokespecial   #40  <Method void AppCompatTextViewAutoSizeHelper(TextView)>
	//   14   26:putfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//   15   29:return          
	}

	private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintinfo)
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
	//    7   11:getfield        #36  <Field TextView mView>
	//    8   14:invokevirtual   #51  <Method int[] TextView.getDrawableState()>
	//    9   17:invokestatic    #57  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
	//   10   20:return          
	}

	private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appcompatdrawablemanager, int i)
	{
		context = ((Context) (appcompatdrawablemanager.getTintList(context, i)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #63  <Method android.content.res.ColorStateList AppCompatDrawableManager.getTintList(Context, int)>
	//    4    6:astore_0        
		if(context != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          31
		{
			appcompatdrawablemanager = ((AppCompatDrawableManager) (new TintInfo()));
	//    7   11:new             #65  <Class TintInfo>
	//    8   14:dup             
	//    9   15:invokespecial   #66  <Method void TintInfo()>
	//   10   18:astore_1        
			appcompatdrawablemanager.mHasTintList = true;
	//   11   19:aload_1         
	//   12   20:iconst_1        
	//   13   21:putfield        #69  <Field boolean TintInfo.mHasTintList>
			appcompatdrawablemanager.mTintList = ((android.content.res.ColorStateList) (context));
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:putfield        #73  <Field android.content.res.ColorStateList TintInfo.mTintList>
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
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #77  <Method void AppCompatTextViewAutoSizeHelper.setTextSizeInternal(int, float)>
	//    5    9:return          
	}

	private void updateTypefaceAndStyle(Context context, TintTypedArray tinttypedarray)
	{
		int i;
		boolean flag;
		mStyle = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle, mStyle);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:getstatic       #88  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textStyle>
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field int mStyle>
	//    5    9:invokevirtual   #94  <Method int TintTypedArray.getInt(int, int)>
	//    6   12:putfield        #34  <Field int mStyle>
		boolean flag1 = tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_fontFamily);
	//    7   15:aload_2         
	//    8   16:getstatic       #97  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_fontFamily>
	//    9   19:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//   10   22:istore          5
		flag = true;
	//   11   24:iconst_1        
	//   12   25:istore          4
		if(!flag1 && !tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily))
	//*  13   27:iload           5
	//*  14   29:ifne            121
	//*  15   32:aload_2         
	//*  16   33:getstatic       #104 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//*  17   36:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  18   39:ifeq            45
	//*  19   42:goto            121
		{
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface))
	//*  20   45:aload_2         
	//*  21   46:getstatic       #107 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//*  22   49:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  23   52:ifeq            120
			{
				mAsyncFontPending = false;
	//   24   55:aload_0         
	//   25   56:iconst_0        
	//   26   57:putfield        #109 <Field boolean mAsyncFontPending>
				switch(tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface, 1))
	//*  27   60:aload_2         
	//*  28   61:getstatic       #107 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//*  29   64:iconst_1        
	//*  30   65:invokevirtual   #94  <Method int TintTypedArray.getInt(int, int)>
				{
	//*  31   68:tableswitch     1 3: default 96
	//	               1 113
	//	               2 105
	//	               3 97
				default:
					return;
	//   32   96:return          

				case 3: // '\003'
					mFontTypeface = Typeface.MONOSPACE;
	//   33   97:aload_0         
	//   34   98:getstatic       #113 <Field Typeface Typeface.MONOSPACE>
	//   35  101:putfield        #115 <Field Typeface mFontTypeface>
					return;
	//   36  104:return          

				case 2: // '\002'
					mFontTypeface = Typeface.SERIF;
	//   37  105:aload_0         
	//   38  106:getstatic       #117 <Field Typeface Typeface.SERIF>
	//   39  109:putfield        #115 <Field Typeface mFontTypeface>
					return;
	//   40  112:return          

				case 1: // '\001'
					mFontTypeface = Typeface.SANS_SERIF;
	//   41  113:aload_0         
	//   42  114:getstatic       #120 <Field Typeface Typeface.SANS_SERIF>
	//   43  117:putfield        #115 <Field Typeface mFontTypeface>
					break;
				}
			}
			return;
	//   44  120:return          
		}
		mFontTypeface = null;
	//   45  121:aload_0         
	//   46  122:aconst_null     
	//   47  123:putfield        #115 <Field Typeface mFontTypeface>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily))
	//*  48  126:aload_2         
	//*  49  127:getstatic       #104 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//*  50  130:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  51  133:ifeq            143
			i = android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily;
	//   52  136:getstatic       #104 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//   53  139:istore_3        
		else
	//*  54  140:goto            147
			i = android.support.v7.appcompat.R.styleable.TextAppearance_android_fontFamily;
	//   55  143:getstatic       #97  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_fontFamily>
	//   56  146:istore_3        
		if(context.isRestricted())
			break MISSING_BLOCK_LABEL_207;
	//   57  147:aload_1         
	//   58  148:invokevirtual   #126 <Method boolean Context.isRestricted()>
	//   59  151:ifne            207
		context = ((Context) (new _cls1()));
	//   60  154:new             #128 <Class AppCompatTextHelper$1>
	//   61  157:dup             
	//   62  158:aload_0         
	//   63  159:new             #130 <Class WeakReference>
	//   64  162:dup             
	//   65  163:aload_0         
	//   66  164:getfield        #36  <Field TextView mView>
	//   67  167:invokespecial   #133 <Method void WeakReference(Object)>
	//   68  170:invokespecial   #136 <Method void AppCompatTextHelper$1(AppCompatTextHelper, WeakReference)>
	//   69  173:astore_1        
		mFontTypeface = tinttypedarray.getFont(i, mStyle, ((l) (context)));
	//   70  174:aload_0         
	//   71  175:aload_2         
	//   72  176:iload_3         
	//   73  177:aload_0         
	//   74  178:getfield        #34  <Field int mStyle>
	//   75  181:aload_1         
	//   76  182:invokevirtual   #140 <Method Typeface TintTypedArray.getFont(int, int, l)>
	//   77  185:putfield        #115 <Field Typeface mFontTypeface>
		if(mFontTypeface != null)
	//*  78  188:aload_0         
	//*  79  189:getfield        #115 <Field Typeface mFontTypeface>
	//*  80  192:ifnonnull       241
	//*  81  195:goto            198
	//*  82  198:aload_0         
	//*  83  199:iload           4
	//*  84  201:putfield        #109 <Field boolean mAsyncFontPending>
	//*  85  204:goto            207
	//*  86  207:aload_0         
	//*  87  208:getfield        #115 <Field Typeface mFontTypeface>
	//*  88  211:ifnonnull       236
	//*  89  214:aload_2         
	//*  90  215:iload_3         
	//*  91  216:invokevirtual   #144 <Method String TintTypedArray.getString(int)>
	//*  92  219:astore_1        
	//*  93  220:aload_1         
	//*  94  221:ifnull          236
	//*  95  224:aload_0         
	//*  96  225:aload_1         
	//*  97  226:aload_0         
	//*  98  227:getfield        #34  <Field int mStyle>
	//*  99  230:invokestatic    #148 <Method Typeface Typeface.create(String, int)>
	//* 100  233:putfield        #115 <Field Typeface mFontTypeface>
	//* 101  236:return          
	//* 102  237:astore_1        
	//* 103  238:goto            207
			flag = false;
	//  104  241:iconst_0        
	//  105  242:istore          4
		try
		{
			mAsyncFontPending = flag;
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
		if(mFontTypeface == null)
		{
			context = ((Context) (tinttypedarray.getString(i)));
			if(context != null)
				mFontTypeface = Typeface.create(((String) (context)), mStyle);
		}
		return;
	//* 106  244:goto            198
	}

	void applyCompoundDrawablesTints()
	{
		if(mDrawableLeftTint != null || mDrawableTopTint != null || mDrawableRightTint != null || mDrawableBottomTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field TintInfo mDrawableLeftTint>
	//*   2    4:ifnonnull       28
	//*   3    7:aload_0         
	//*   4    8:getfield        #153 <Field TintInfo mDrawableTopTint>
	//*   5   11:ifnonnull       28
	//*   6   14:aload_0         
	//*   7   15:getfield        #155 <Field TintInfo mDrawableRightTint>
	//*   8   18:ifnonnull       28
	//*   9   21:aload_0         
	//*  10   22:getfield        #157 <Field TintInfo mDrawableBottomTint>
	//*  11   25:ifnull          80
		{
			Drawable adrawable[] = mView.getCompoundDrawables();
	//   12   28:aload_0         
	//   13   29:getfield        #36  <Field TextView mView>
	//   14   32:invokevirtual   #161 <Method Drawable[] TextView.getCompoundDrawables()>
	//   15   35:astore_1        
			applyCompoundDrawableTint(adrawable[0], mDrawableLeftTint);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:iconst_0        
	//   19   39:aaload          
	//   20   40:aload_0         
	//   21   41:getfield        #151 <Field TintInfo mDrawableLeftTint>
	//   22   44:invokespecial   #163 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[1], mDrawableTopTint);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:iconst_1        
	//   26   50:aaload          
	//   27   51:aload_0         
	//   28   52:getfield        #153 <Field TintInfo mDrawableTopTint>
	//   29   55:invokespecial   #163 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[2], mDrawableRightTint);
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:iconst_2        
	//   33   61:aaload          
	//   34   62:aload_0         
	//   35   63:getfield        #155 <Field TintInfo mDrawableRightTint>
	//   36   66:invokespecial   #163 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[3], mDrawableBottomTint);
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:iconst_3        
	//   40   72:aaload          
	//   41   73:aload_0         
	//   42   74:getfield        #157 <Field TintInfo mDrawableBottomTint>
	//   43   77:invokespecial   #163 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
		}
		if(android.os.Build.VERSION.SDK_INT >= 17 && (mDrawableStartTint != null || mDrawableEndTint != null))
	//*  44   80:getstatic       #168 <Field int android.os.Build$VERSION.SDK_INT>
	//*  45   83:bipush          17
	//*  46   85:icmplt          132
	//*  47   88:aload_0         
	//*  48   89:getfield        #170 <Field TintInfo mDrawableStartTint>
	//*  49   92:ifnonnull       102
	//*  50   95:aload_0         
	//*  51   96:getfield        #172 <Field TintInfo mDrawableEndTint>
	//*  52   99:ifnull          132
		{
			Drawable adrawable1[] = mView.getCompoundDrawablesRelative();
	//   53  102:aload_0         
	//   54  103:getfield        #36  <Field TextView mView>
	//   55  106:invokevirtual   #175 <Method Drawable[] TextView.getCompoundDrawablesRelative()>
	//   56  109:astore_1        
			applyCompoundDrawableTint(adrawable1[0], mDrawableStartTint);
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:iconst_0        
	//   60  113:aaload          
	//   61  114:aload_0         
	//   62  115:getfield        #170 <Field TintInfo mDrawableStartTint>
	//   63  118:invokespecial   #163 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable1[2], mDrawableEndTint);
	//   64  121:aload_0         
	//   65  122:aload_1         
	//   66  123:iconst_2        
	//   67  124:aaload          
	//   68  125:aload_0         
	//   69  126:getfield        #172 <Field TintInfo mDrawableEndTint>
	//   70  129:invokespecial   #163 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
		}
	//   71  132:return          
	}

	void autoSizeText()
	{
		mAutoSizeTextHelper.autoSizeText();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #178 <Method void AppCompatTextViewAutoSizeHelper.autoSizeText()>
	//    3    7:return          
	}

	int getAutoSizeMaxTextSize()
	{
		return mAutoSizeTextHelper.getAutoSizeMaxTextSize();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #182 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize()>
	//    3    7:ireturn         
	}

	int getAutoSizeMinTextSize()
	{
		return mAutoSizeTextHelper.getAutoSizeMinTextSize();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #185 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize()>
	//    3    7:ireturn         
	}

	int getAutoSizeStepGranularity()
	{
		return mAutoSizeTextHelper.getAutoSizeStepGranularity();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #188 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity()>
	//    3    7:ireturn         
	}

	int[] getAutoSizeTextAvailableSizes()
	{
		return mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #191 <Method int[] AppCompatTextViewAutoSizeHelper.getAutoSizeTextAvailableSizes()>
	//    3    7:areturn         
	}

	int getAutoSizeTextType()
	{
		return mAutoSizeTextHelper.getAutoSizeTextType();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #194 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeTextType()>
	//    3    7:ireturn         
	}

	boolean isAutoSizeEnabled()
	{
		return mAutoSizeTextHelper.isAutoSizeEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #197 <Method boolean AppCompatTextViewAutoSizeHelper.isAutoSizeEnabled()>
	//    3    7:ireturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		Context context = mView.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TextView mView>
	//    2    4:invokevirtual   #206 <Method Context TextView.getContext()>
	//    3    7:astore          13
		Object obj = ((Object) (AppCompatDrawableManager.get()));
	//    4    9:invokestatic    #210 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//    5   12:astore          7
		Object obj1 = ((Object) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextHelper, i, 0)));
	//    6   14:aload           13
	//    7   16:aload_1         
	//    8   17:getstatic       #214 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextHelper>
	//    9   20:iload_2         
	//   10   21:iconst_0        
	//   11   22:invokestatic    #218 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   12   25:astore          8
		int j = ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance, -1);
	//   13   27:aload           8
	//   14   29:getstatic       #221 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_textAppearance>
	//   15   32:iconst_m1       
	//   16   33:invokevirtual   #224 <Method int TintTypedArray.getResourceId(int, int)>
	//   17   36:istore_3        
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft))
	//*  18   37:aload           8
	//*  19   39:getstatic       #227 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//*  20   42:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  21   45:ifeq            68
			mDrawableLeftTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
	//   22   48:aload_0         
	//   23   49:aload           13
	//   24   51:aload           7
	//   25   53:aload           8
	//   26   55:getstatic       #227 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//   27   58:iconst_0        
	//   28   59:invokevirtual   #224 <Method int TintTypedArray.getResourceId(int, int)>
	//   29   62:invokestatic    #229 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   30   65:putfield        #151 <Field TintInfo mDrawableLeftTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop))
	//*  31   68:aload           8
	//*  32   70:getstatic       #232 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//*  33   73:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  34   76:ifeq            99
			mDrawableTopTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop, 0));
	//   35   79:aload_0         
	//   36   80:aload           13
	//   37   82:aload           7
	//   38   84:aload           8
	//   39   86:getstatic       #232 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//   40   89:iconst_0        
	//   41   90:invokevirtual   #224 <Method int TintTypedArray.getResourceId(int, int)>
	//   42   93:invokestatic    #229 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   43   96:putfield        #153 <Field TintInfo mDrawableTopTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight))
	//*  44   99:aload           8
	//*  45  101:getstatic       #235 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//*  46  104:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  47  107:ifeq            130
			mDrawableRightTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight, 0));
	//   48  110:aload_0         
	//   49  111:aload           13
	//   50  113:aload           7
	//   51  115:aload           8
	//   52  117:getstatic       #235 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//   53  120:iconst_0        
	//   54  121:invokevirtual   #224 <Method int TintTypedArray.getResourceId(int, int)>
	//   55  124:invokestatic    #229 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   56  127:putfield        #155 <Field TintInfo mDrawableRightTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom))
	//*  57  130:aload           8
	//*  58  132:getstatic       #238 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//*  59  135:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  60  138:ifeq            161
			mDrawableBottomTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
	//   61  141:aload_0         
	//   62  142:aload           13
	//   63  144:aload           7
	//   64  146:aload           8
	//   65  148:getstatic       #238 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//   66  151:iconst_0        
	//   67  152:invokevirtual   #224 <Method int TintTypedArray.getResourceId(int, int)>
	//   68  155:invokestatic    #229 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   69  158:putfield        #157 <Field TintInfo mDrawableBottomTint>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  70  161:getstatic       #168 <Field int android.os.Build$VERSION.SDK_INT>
	//*  71  164:bipush          17
	//*  72  166:icmplt          231
		{
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart))
	//*  73  169:aload           8
	//*  74  171:getstatic       #241 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableStart>
	//*  75  174:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  76  177:ifeq            200
				mDrawableStartTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart, 0));
	//   77  180:aload_0         
	//   78  181:aload           13
	//   79  183:aload           7
	//   80  185:aload           8
	//   81  187:getstatic       #241 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableStart>
	//   82  190:iconst_0        
	//   83  191:invokevirtual   #224 <Method int TintTypedArray.getResourceId(int, int)>
	//   84  194:invokestatic    #229 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   85  197:putfield        #170 <Field TintInfo mDrawableStartTint>
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd))
	//*  86  200:aload           8
	//*  87  202:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableEnd>
	//*  88  205:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  89  208:ifeq            231
				mDrawableEndTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
	//   90  211:aload_0         
	//   91  212:aload           13
	//   92  214:aload           7
	//   93  216:aload           8
	//   94  218:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableEnd>
	//   95  221:iconst_0        
	//   96  222:invokevirtual   #224 <Method int TintTypedArray.getResourceId(int, int)>
	//   97  225:invokestatic    #229 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   98  228:putfield        #172 <Field TintInfo mDrawableEndTint>
		}
		((TintTypedArray) (obj1)).recycle();
	//   99  231:aload           8
	//  100  233:invokevirtual   #247 <Method void TintTypedArray.recycle()>
		boolean flag1 = mView.getTransformationMethod() instanceof PasswordTransformationMethod;
	//  101  236:aload_0         
	//  102  237:getfield        #36  <Field TextView mView>
	//  103  240:invokevirtual   #251 <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//  104  243:instanceof      #253 <Class PasswordTransformationMethod>
	//  105  246:istore          6
		int k = 1;
	//  106  248:iconst_1        
	//  107  249:istore          4
		android.content.res.ColorStateList colorstatelist2 = null;
	//  108  251:aconst_null     
	//  109  252:astore          10
		obj1 = null;
	//  110  254:aconst_null     
	//  111  255:astore          8
		boolean flag;
		android.content.res.ColorStateList colorstatelist1;
		if(j != -1)
	//* 112  257:iload_3         
	//* 113  258:iconst_m1       
	//* 114  259:icmpeq          457
		{
			TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, j, android.support.v7.appcompat.R.styleable.TextAppearance);
	//  115  262:aload           13
	//  116  264:iload_3         
	//  117  265:getstatic       #256 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  118  268:invokestatic    #259 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//  119  271:astore          11
			if(!flag1 && tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//* 120  273:iload           6
	//* 121  275:ifne            305
	//* 122  278:aload           11
	//* 123  280:getstatic       #262 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 124  283:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//* 125  286:ifeq            305
			{
				flag = tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//  126  289:aload           11
	//  127  291:getstatic       #262 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//  128  294:iconst_0        
	//  129  295:invokevirtual   #266 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  130  298:istore          5
				j = 1;
	//  131  300:iconst_1        
	//  132  301:istore_3        
			} else
	//* 133  302:goto            310
			{
				j = 0;
	//  134  305:iconst_0        
	//  135  306:istore_3        
				flag = false;
	//  136  307:iconst_0        
	//  137  308:istore          5
			}
			updateTypefaceAndStyle(context, tinttypedarray);
	//  138  310:aload_0         
	//  139  311:aload           13
	//  140  313:aload           11
	//  141  315:invokespecial   #268 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
			if(android.os.Build.VERSION.SDK_INT < 23)
	//* 142  318:getstatic       #168 <Field int android.os.Build$VERSION.SDK_INT>
	//* 143  321:bipush          23
	//* 144  323:icmpge          434
			{
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 145  326:aload           11
	//* 146  328:getstatic       #271 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 147  331:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//* 148  334:ifeq            350
					obj = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  149  337:aload           11
	//  150  339:getstatic       #271 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  151  342:invokevirtual   #275 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  152  345:astore          7
				else
	//* 153  347:goto            353
					obj = null;
	//  154  350:aconst_null     
	//  155  351:astore          7
				android.content.res.ColorStateList colorstatelist;
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 156  353:aload           11
	//* 157  355:getstatic       #278 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 158  358:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//* 159  361:ifeq            377
					colorstatelist = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint);
	//  160  364:aload           11
	//  161  366:getstatic       #278 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  162  369:invokevirtual   #275 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  163  372:astore          9
				else
	//* 164  374:goto            380
					colorstatelist = null;
	//  165  377:aconst_null     
	//  166  378:astore          9
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
	//* 167  380:aload           11
	//* 168  382:getstatic       #281 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 169  385:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//* 170  388:ifeq            416
				{
					colorstatelist2 = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink);
	//  171  391:aload           11
	//  172  393:getstatic       #281 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//  173  396:invokevirtual   #275 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  174  399:astore          10
					obj1 = obj;
	//  175  401:aload           7
	//  176  403:astore          8
					obj = ((Object) (colorstatelist2));
	//  177  405:aload           10
	//  178  407:astore          7
					colorstatelist2 = colorstatelist;
	//  179  409:aload           9
	//  180  411:astore          10
				} else
	//* 181  413:goto            441
				{
					colorstatelist2 = null;
	//  182  416:aconst_null     
	//  183  417:astore          10
					obj1 = obj;
	//  184  419:aload           7
	//  185  421:astore          8
					obj = ((Object) (colorstatelist2));
	//  186  423:aload           10
	//  187  425:astore          7
					colorstatelist2 = colorstatelist;
	//  188  427:aload           9
	//  189  429:astore          10
				}
			} else
	//* 190  431:goto            441
			{
				obj = null;
	//  191  434:aconst_null     
	//  192  435:astore          7
				colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  193  437:aload           7
	//  194  439:astore          10
			}
			tinttypedarray.recycle();
	//  195  441:aload           11
	//  196  443:invokevirtual   #247 <Method void TintTypedArray.recycle()>
			colorstatelist1 = ((android.content.res.ColorStateList) (obj));
	//  197  446:aload           7
	//  198  448:astore          9
			obj = ((Object) (colorstatelist2));
	//  199  450:aload           10
	//  200  452:astore          7
		} else
	//* 201  454:goto            473
		{
			colorstatelist1 = null;
	//  202  457:aconst_null     
	//  203  458:astore          9
			obj = ((Object) (colorstatelist1));
	//  204  460:aload           9
	//  205  462:astore          7
			j = 0;
	//  206  464:iconst_0        
	//  207  465:istore_3        
			flag = false;
	//  208  466:iconst_0        
	//  209  467:istore          5
			obj1 = ((Object) (colorstatelist2));
	//  210  469:aload           10
	//  211  471:astore          8
		}
		TintTypedArray tinttypedarray1 = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.TextAppearance, i, 0);
	//  212  473:aload           13
	//  213  475:aload_1         
	//  214  476:getstatic       #256 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  215  479:iload_2         
	//  216  480:iconst_0        
	//  217  481:invokestatic    #218 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//  218  484:astore          14
		if(!flag1 && tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//* 219  486:iload           6
	//* 220  488:ifne            519
	//* 221  491:aload           14
	//* 222  493:getstatic       #262 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 223  496:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//* 224  499:ifeq            519
		{
			flag = tinttypedarray1.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//  225  502:aload           14
	//  226  504:getstatic       #262 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//  227  507:iconst_0        
	//  228  508:invokevirtual   #266 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  229  511:istore          5
			j = k;
	//  230  513:iload           4
	//  231  515:istore_3        
		}
	//* 232  516:goto            519
		android.content.res.ColorStateList colorstatelist3 = ((android.content.res.ColorStateList) (obj1));
	//  233  519:aload           8
	//  234  521:astore          11
		android.content.res.ColorStateList colorstatelist4 = colorstatelist1;
	//  235  523:aload           9
	//  236  525:astore          12
		colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  237  527:aload           7
	//  238  529:astore          10
		if(android.os.Build.VERSION.SDK_INT < 23)
	//* 239  531:getstatic       #168 <Field int android.os.Build$VERSION.SDK_INT>
	//* 240  534:bipush          23
	//* 241  536:icmpge          622
		{
			if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 242  539:aload           14
	//* 243  541:getstatic       #271 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 244  544:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//* 245  547:ifeq            560
				obj1 = ((Object) (tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  246  550:aload           14
	//  247  552:getstatic       #271 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  248  555:invokevirtual   #275 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  249  558:astore          8
			if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 250  560:aload           14
	//* 251  562:getstatic       #278 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 252  565:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//* 253  568:ifeq            581
				obj = ((Object) (tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint)));
	//  254  571:aload           14
	//  255  573:getstatic       #278 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  256  576:invokevirtual   #275 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  257  579:astore          7
			colorstatelist3 = ((android.content.res.ColorStateList) (obj1));
	//  258  581:aload           8
	//  259  583:astore          11
			colorstatelist4 = colorstatelist1;
	//  260  585:aload           9
	//  261  587:astore          12
			colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  262  589:aload           7
	//  263  591:astore          10
			if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
	//* 264  593:aload           14
	//* 265  595:getstatic       #281 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 266  598:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//* 267  601:ifeq            622
			{
				colorstatelist4 = tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink);
	//  268  604:aload           14
	//  269  606:getstatic       #281 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//  270  609:invokevirtual   #275 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  271  612:astore          12
				colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  272  614:aload           7
	//  273  616:astore          10
				colorstatelist3 = ((android.content.res.ColorStateList) (obj1));
	//  274  618:aload           8
	//  275  620:astore          11
			}
		}
		if(android.os.Build.VERSION.SDK_INT >= 28 && tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize) && tinttypedarray1.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, -1) == 0)
	//* 276  622:getstatic       #168 <Field int android.os.Build$VERSION.SDK_INT>
	//* 277  625:bipush          28
	//* 278  627:icmplt          662
	//* 279  630:aload           14
	//* 280  632:getstatic       #284 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//* 281  635:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//* 282  638:ifeq            662
	//* 283  641:aload           14
	//* 284  643:getstatic       #284 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//* 285  646:iconst_m1       
	//* 286  647:invokevirtual   #287 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//* 287  650:ifne            662
			mView.setTextSize(0, 0.0F);
	//  288  653:aload_0         
	//  289  654:getfield        #36  <Field TextView mView>
	//  290  657:iconst_0        
	//  291  658:fconst_0        
	//  292  659:invokevirtual   #290 <Method void TextView.setTextSize(int, float)>
		updateTypefaceAndStyle(context, tinttypedarray1);
	//  293  662:aload_0         
	//  294  663:aload           13
	//  295  665:aload           14
	//  296  667:invokespecial   #268 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
		tinttypedarray1.recycle();
	//  297  670:aload           14
	//  298  672:invokevirtual   #247 <Method void TintTypedArray.recycle()>
		if(colorstatelist3 != null)
	//* 299  675:aload           11
	//* 300  677:ifnull          689
			mView.setTextColor(colorstatelist3);
	//  301  680:aload_0         
	//  302  681:getfield        #36  <Field TextView mView>
	//  303  684:aload           11
	//  304  686:invokevirtual   #294 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
		if(colorstatelist2 != null)
	//* 305  689:aload           10
	//* 306  691:ifnull          703
			mView.setHintTextColor(colorstatelist2);
	//  307  694:aload_0         
	//  308  695:getfield        #36  <Field TextView mView>
	//  309  698:aload           10
	//  310  700:invokevirtual   #297 <Method void TextView.setHintTextColor(android.content.res.ColorStateList)>
		if(colorstatelist4 != null)
	//* 311  703:aload           12
	//* 312  705:ifnull          717
			mView.setLinkTextColor(colorstatelist4);
	//  313  708:aload_0         
	//  314  709:getfield        #36  <Field TextView mView>
	//  315  712:aload           12
	//  316  714:invokevirtual   #300 <Method void TextView.setLinkTextColor(android.content.res.ColorStateList)>
		if(!flag1 && j)
	//* 317  717:iload           6
	//* 318  719:ifne            732
	//* 319  722:iload_3         
	//* 320  723:ifeq            732
			setAllCaps(flag);
	//  321  726:aload_0         
	//  322  727:iload           5
	//  323  729:invokevirtual   #304 <Method void setAllCaps(boolean)>
		obj = ((Object) (mFontTypeface));
	//  324  732:aload_0         
	//  325  733:getfield        #115 <Field Typeface mFontTypeface>
	//  326  736:astore          7
		if(obj != null)
	//* 327  738:aload           7
	//* 328  740:ifnull          756
			mView.setTypeface(((Typeface) (obj)), mStyle);
	//  329  743:aload_0         
	//  330  744:getfield        #36  <Field TextView mView>
	//  331  747:aload           7
	//  332  749:aload_0         
	//  333  750:getfield        #34  <Field int mStyle>
	//  334  753:invokevirtual   #308 <Method void TextView.setTypeface(Typeface, int)>
		mAutoSizeTextHelper.loadFromAttributes(attributeset, i);
	//  335  756:aload_0         
	//  336  757:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  337  760:aload_1         
	//  338  761:iload_2         
	//  339  762:invokevirtual   #310 <Method void AppCompatTextViewAutoSizeHelper.loadFromAttributes(AttributeSet, int)>
		if(d.a && mAutoSizeTextHelper.getAutoSizeTextType() != 0)
	//* 340  765:getstatic       #315 <Field boolean d.a>
	//* 341  768:ifeq            853
	//* 342  771:aload_0         
	//* 343  772:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 344  775:invokevirtual   #194 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeTextType()>
	//* 345  778:ifeq            853
		{
			int ai[] = mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
	//  346  781:aload_0         
	//  347  782:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  348  785:invokevirtual   #191 <Method int[] AppCompatTextViewAutoSizeHelper.getAutoSizeTextAvailableSizes()>
	//  349  788:astore          7
			if(ai.length > 0)
	//* 350  790:aload           7
	//* 351  792:arraylength     
	//* 352  793:ifle            853
				if((float)mView.getAutoSizeStepGranularity() != -1F)
	//* 353  796:aload_0         
	//* 354  797:getfield        #36  <Field TextView mView>
	//* 355  800:invokevirtual   #316 <Method int TextView.getAutoSizeStepGranularity()>
	//* 356  803:i2f             
	//* 357  804:ldc2            #317 <Float -1F>
	//* 358  807:fcmpl           
	//* 359  808:ifeq            843
					mView.setAutoSizeTextTypeUniformWithConfiguration(mAutoSizeTextHelper.getAutoSizeMinTextSize(), mAutoSizeTextHelper.getAutoSizeMaxTextSize(), mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
	//  360  811:aload_0         
	//  361  812:getfield        #36  <Field TextView mView>
	//  362  815:aload_0         
	//  363  816:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  364  819:invokevirtual   #185 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize()>
	//  365  822:aload_0         
	//  366  823:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  367  826:invokevirtual   #182 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize()>
	//  368  829:aload_0         
	//  369  830:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  370  833:invokevirtual   #188 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity()>
	//  371  836:iconst_0        
	//  372  837:invokevirtual   #321 <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
				else
	//* 373  840:goto            853
					mView.setAutoSizeTextTypeUniformWithPresetSizes(ai, 0);
	//  374  843:aload_0         
	//  375  844:getfield        #36  <Field TextView mView>
	//  376  847:aload           7
	//  377  849:iconst_0        
	//  378  850:invokevirtual   #325 <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
		}
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView)));
	//  379  853:aload           13
	//  380  855:aload_1         
	//  381  856:getstatic       #328 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextView>
	//  382  859:invokestatic    #331 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[])>
	//  383  862:astore_1        
		i = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
	//  384  863:aload_1         
	//  385  864:getstatic       #334 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_firstBaselineToTopHeight>
	//  386  867:iconst_m1       
	//  387  868:invokevirtual   #287 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  388  871:istore_2        
		j = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
	//  389  872:aload_1         
	//  390  873:getstatic       #337 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_lastBaselineToBottomHeight>
	//  391  876:iconst_m1       
	//  392  877:invokevirtual   #287 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  393  880:istore_3        
		k = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.AppCompatTextView_lineHeight, -1);
	//  394  881:aload_1         
	//  395  882:getstatic       #340 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_lineHeight>
	//  396  885:iconst_m1       
	//  397  886:invokevirtual   #287 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  398  889:istore          4
		((TintTypedArray) (attributeset)).recycle();
	//  399  891:aload_1         
	//  400  892:invokevirtual   #247 <Method void TintTypedArray.recycle()>
		if(i != -1)
	//* 401  895:iload_2         
	//* 402  896:iconst_m1       
	//* 403  897:icmpeq          908
			ah.b(mView, i);
	//  404  900:aload_0         
	//  405  901:getfield        #36  <Field TextView mView>
	//  406  904:iload_2         
	//  407  905:invokestatic    #346 <Method void ah.b(TextView, int)>
		if(j != -1)
	//* 408  908:iload_3         
	//* 409  909:iconst_m1       
	//* 410  910:icmpeq          921
			ah.c(mView, j);
	//  411  913:aload_0         
	//  412  914:getfield        #36  <Field TextView mView>
	//  413  917:iload_3         
	//  414  918:invokestatic    #349 <Method void ah.c(TextView, int)>
		if(k != -1)
	//* 415  921:iload           4
	//* 416  923:iconst_m1       
	//* 417  924:icmpeq          936
			ah.d(mView, k);
	//  418  927:aload_0         
	//  419  928:getfield        #36  <Field TextView mView>
	//  420  931:iload           4
	//  421  933:invokestatic    #352 <Method void ah.d(TextView, int)>
	//  422  936:return          
	}

	void onAsyncTypefaceReceived(WeakReference weakreference, Typeface typeface)
	{
		if(mAsyncFontPending)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field boolean mAsyncFontPending>
	//*   2    4:ifeq            33
		{
			mFontTypeface = typeface;
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:putfield        #115 <Field Typeface mFontTypeface>
			weakreference = ((WeakReference) ((TextView)weakreference.get()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #358 <Method Object WeakReference.get()>
	//    8   16:checkcast       #47  <Class TextView>
	//    9   19:astore_1        
			if(weakreference != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          33
				((TextView) (weakreference)).setTypeface(typeface, mStyle);
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:getfield        #34  <Field int mStyle>
	//   16   30:invokevirtual   #308 <Method void TextView.setTypeface(Typeface, int)>
		}
	//   17   33:return          
	}

	void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(!d.a)
	//*   0    0:getstatic       #315 <Field boolean d.a>
	//*   1    3:ifne            10
			autoSizeText();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #361 <Method void autoSizeText()>
	//    4   10:return          
	}

	void onSetTextAppearance(Context context, int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #256 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    3    5:invokestatic    #259 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    4    8:astore_3        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//*   5    9:aload_3         
	//*   6   10:getstatic       #262 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*   7   13:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*   8   16:ifeq            31
			setAllCaps(tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
	//    9   19:aload_0         
	//   10   20:aload_3         
	//   11   21:getstatic       #262 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #266 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   14   28:invokevirtual   #304 <Method void setAllCaps(boolean)>
		if(android.os.Build.VERSION.SDK_INT < 23 && tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*  15   31:getstatic       #168 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          23
	//*  17   36:icmpge          72
	//*  18   39:aload_3         
	//*  19   40:getstatic       #271 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*  20   43:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  21   46:ifeq            72
		{
			android.content.res.ColorStateList colorstatelist = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   22   49:aload_3         
	//   23   50:getstatic       #271 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   24   53:invokevirtual   #275 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//   25   56:astore          4
			if(colorstatelist != null)
	//*  26   58:aload           4
	//*  27   60:ifnull          72
				mView.setTextColor(colorstatelist);
	//   28   63:aload_0         
	//   29   64:getfield        #36  <Field TextView mView>
	//   30   67:aload           4
	//   31   69:invokevirtual   #294 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
		}
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize) && tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, -1) == 0)
	//*  32   72:aload_3         
	//*  33   73:getstatic       #284 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  34   76:invokevirtual   #101 <Method boolean TintTypedArray.hasValue(int)>
	//*  35   79:ifeq            102
	//*  36   82:aload_3         
	//*  37   83:getstatic       #284 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  38   86:iconst_m1       
	//*  39   87:invokevirtual   #287 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//*  40   90:ifne            102
			mView.setTextSize(0, 0.0F);
	//   41   93:aload_0         
	//   42   94:getfield        #36  <Field TextView mView>
	//   43   97:iconst_0        
	//   44   98:fconst_0        
	//   45   99:invokevirtual   #290 <Method void TextView.setTextSize(int, float)>
		updateTypefaceAndStyle(context, tinttypedarray);
	//   46  102:aload_0         
	//   47  103:aload_1         
	//   48  104:aload_3         
	//   49  105:invokespecial   #268 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
		tinttypedarray.recycle();
	//   50  108:aload_3         
	//   51  109:invokevirtual   #247 <Method void TintTypedArray.recycle()>
		context = ((Context) (mFontTypeface));
	//   52  112:aload_0         
	//   53  113:getfield        #115 <Field Typeface mFontTypeface>
	//   54  116:astore_1        
		if(context != null)
	//*  55  117:aload_1         
	//*  56  118:ifnull          133
			mView.setTypeface(((Typeface) (context)), mStyle);
	//   57  121:aload_0         
	//   58  122:getfield        #36  <Field TextView mView>
	//   59  125:aload_1         
	//   60  126:aload_0         
	//   61  127:getfield        #34  <Field int mStyle>
	//   62  130:invokevirtual   #308 <Method void TextView.setTypeface(Typeface, int)>
	//   63  133:return          
	}

	void setAllCaps(boolean flag)
	{
		mView.setAllCaps(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field TextView mView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #364 <Method void TextView.setAllCaps(boolean)>
	//    4    8:return          
	}

	void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #365 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//    7   12:return          
	}

	void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #366 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//    5    9:return          
	}

	void setAutoSizeTextTypeWithDefaults(int i)
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #370 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeWithDefaults(int)>
	//    4    8:return          
	}

	void setTextSize(int i, float f)
	{
		if(!d.a && !isAutoSizeEnabled())
	//*   0    0:getstatic       #315 <Field boolean d.a>
	//*   1    3:ifne            19
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #371 <Method boolean isAutoSizeEnabled()>
	//*   4   10:ifne            19
			setTextSizeInternal(i, f);
	//    5   13:aload_0         
	//    6   14:iload_1         
	//    7   15:fload_2         
	//    8   16:invokespecial   #372 <Method void setTextSizeInternal(int, float)>
	//    9   19:return          
	}

	private static final int MONOSPACE = 3;
	private static final int SANS = 1;
	private static final int SERIF = 2;
	private boolean mAsyncFontPending;
	private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
	private TintInfo mDrawableBottomTint;
	private TintInfo mDrawableEndTint;
	private TintInfo mDrawableLeftTint;
	private TintInfo mDrawableRightTint;
	private TintInfo mDrawableStartTint;
	private TintInfo mDrawableTopTint;
	private Typeface mFontTypeface;
	private int mStyle;
	private final TextView mView;

	private class _cls1 extends l
	{

		public void onFontRetrievalFailed(int i)
		{
		//    0    0:return          
		}

		public void onFontRetrieved(Typeface typeface)
		{
			onAsyncTypefaceReceived(textViewWeak, typeface);
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field AppCompatTextHelper this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #14  <Field WeakReference val$textViewWeak>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #28  <Method void AppCompatTextHelper.onAsyncTypefaceReceived(WeakReference, Typeface)>
		//    6   12:return          
		}

		final AppCompatTextHelper this$0;
		final WeakReference val$textViewWeak;

		_cls1()
		{
			this$0 = AppCompatTextHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field AppCompatTextHelper this$0>
			textViewWeak = weakreference;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #14  <Field WeakReference val$textViewWeak>
			super();
		//    6   10:aload_0         
		//    7   11:invokespecial   #17  <Method void l()>
		//    8   14:return          
		}
	}

}
