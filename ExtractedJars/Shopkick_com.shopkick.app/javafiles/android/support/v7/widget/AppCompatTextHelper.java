// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.AutoSizeableTextView;
import android.support.v4.widget.TextViewCompat;
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
	//    1    1:invokespecial   #35  <Method void Object()>
		mStyle = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #37  <Field int mStyle>
		mView = textview;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field TextView mView>
		mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(mView);
	//    8   14:aload_0         
	//    9   15:new             #41  <Class AppCompatTextViewAutoSizeHelper>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #39  <Field TextView mView>
	//   13   23:invokespecial   #43  <Method void AppCompatTextViewAutoSizeHelper(TextView)>
	//   14   26:putfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
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
	//    7   11:getfield        #39  <Field TextView mView>
	//    8   14:invokevirtual   #54  <Method int[] TextView.getDrawableState()>
	//    9   17:invokestatic    #60  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
	//   10   20:return          
	}

	private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appcompatdrawablemanager, int i)
	{
		context = ((Context) (appcompatdrawablemanager.getTintList(context, i)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #66  <Method android.content.res.ColorStateList AppCompatDrawableManager.getTintList(Context, int)>
	//    4    6:astore_0        
		if(context != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          31
		{
			appcompatdrawablemanager = ((AppCompatDrawableManager) (new TintInfo()));
	//    7   11:new             #68  <Class TintInfo>
	//    8   14:dup             
	//    9   15:invokespecial   #69  <Method void TintInfo()>
	//   10   18:astore_1        
			appcompatdrawablemanager.mHasTintList = true;
	//   11   19:aload_1         
	//   12   20:iconst_1        
	//   13   21:putfield        #72  <Field boolean TintInfo.mHasTintList>
			appcompatdrawablemanager.mTintList = ((android.content.res.ColorStateList) (context));
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:putfield        #76  <Field android.content.res.ColorStateList TintInfo.mTintList>
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
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #80  <Method void AppCompatTextViewAutoSizeHelper.setTextSizeInternal(int, float)>
	//    5    9:return          
	}

	private void updateTypefaceAndStyle(Context context, TintTypedArray tinttypedarray)
	{
		int i;
		boolean flag;
		mStyle = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle, mStyle);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:getstatic       #91  <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textStyle>
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field int mStyle>
	//    5    9:invokevirtual   #97  <Method int TintTypedArray.getInt(int, int)>
	//    6   12:putfield        #37  <Field int mStyle>
		boolean flag1 = tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_fontFamily);
	//    7   15:aload_2         
	//    8   16:getstatic       #100 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_fontFamily>
	//    9   19:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//   10   22:istore          5
		flag = true;
	//   11   24:iconst_1        
	//   12   25:istore          4
		if(!flag1 && !tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily))
	//*  13   27:iload           5
	//*  14   29:ifne            121
	//*  15   32:aload_2         
	//*  16   33:getstatic       #107 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//*  17   36:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  18   39:ifeq            45
	//*  19   42:goto            121
		{
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface))
	//*  20   45:aload_2         
	//*  21   46:getstatic       #110 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//*  22   49:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  23   52:ifeq            120
			{
				mAsyncFontPending = false;
	//   24   55:aload_0         
	//   25   56:iconst_0        
	//   26   57:putfield        #112 <Field boolean mAsyncFontPending>
				switch(tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface, 1))
	//*  27   60:aload_2         
	//*  28   61:getstatic       #110 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//*  29   64:iconst_1        
	//*  30   65:invokevirtual   #97  <Method int TintTypedArray.getInt(int, int)>
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
	//   34   98:getstatic       #116 <Field Typeface Typeface.MONOSPACE>
	//   35  101:putfield        #118 <Field Typeface mFontTypeface>
					return;
	//   36  104:return          

				case 2: // '\002'
					mFontTypeface = Typeface.SERIF;
	//   37  105:aload_0         
	//   38  106:getstatic       #120 <Field Typeface Typeface.SERIF>
	//   39  109:putfield        #118 <Field Typeface mFontTypeface>
					return;
	//   40  112:return          

				case 1: // '\001'
					mFontTypeface = Typeface.SANS_SERIF;
	//   41  113:aload_0         
	//   42  114:getstatic       #123 <Field Typeface Typeface.SANS_SERIF>
	//   43  117:putfield        #118 <Field Typeface mFontTypeface>
					break;
				}
			}
			return;
	//   44  120:return          
		}
		mFontTypeface = null;
	//   45  121:aload_0         
	//   46  122:aconst_null     
	//   47  123:putfield        #118 <Field Typeface mFontTypeface>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily))
	//*  48  126:aload_2         
	//*  49  127:getstatic       #107 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//*  50  130:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  51  133:ifeq            143
			i = android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily;
	//   52  136:getstatic       #107 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//   53  139:istore_3        
		else
	//*  54  140:goto            147
			i = android.support.v7.appcompat.R.styleable.TextAppearance_android_fontFamily;
	//   55  143:getstatic       #100 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_fontFamily>
	//   56  146:istore_3        
		if(context.isRestricted())
			break MISSING_BLOCK_LABEL_204;
	//   57  147:aload_1         
	//   58  148:invokevirtual   #129 <Method boolean Context.isRestricted()>
	//   59  151:ifne            204
		context = ((Context) (new android.support.v4.content.res.ResourcesCompat.FontCallback() {

			public void onFontRetrievalFailed(int j)
			{
			//    0    0:return          
			}

			public void onFontRetrieved(Typeface typeface)
			{
				onAsyncTypefaceReceived(textViewWeak, typeface);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AppCompatTextHelper this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field WeakReference val$textViewWeak>
			//    4    8:aload_1         
			//    5    9:invokevirtual   #32  <Method void AppCompatTextHelper.onAsyncTypefaceReceived(WeakReference, Typeface)>
			//    6   12:return          
			}

			final AppCompatTextHelper this$0;
			final WeakReference val$textViewWeak;

			
			{
				this$0 = AppCompatTextHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppCompatTextHelper this$0>
				textViewWeak = weakreference;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field WeakReference val$textViewWeak>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback()>
			//    8   14:return          
			}
		}
));
	//   60  154:new             #6   <Class AppCompatTextHelper$1>
	//   61  157:dup             
	//   62  158:aload_0         
	//   63  159:new             #131 <Class WeakReference>
	//   64  162:dup             
	//   65  163:aload_0         
	//   66  164:getfield        #39  <Field TextView mView>
	//   67  167:invokespecial   #134 <Method void WeakReference(Object)>
	//   68  170:invokespecial   #137 <Method void AppCompatTextHelper$1(AppCompatTextHelper, WeakReference)>
	//   69  173:astore_1        
		mFontTypeface = tinttypedarray.getFont(i, mStyle, ((android.support.v4.content.res.ResourcesCompat.FontCallback) (context)));
	//   70  174:aload_0         
	//   71  175:aload_2         
	//   72  176:iload_3         
	//   73  177:aload_0         
	//   74  178:getfield        #37  <Field int mStyle>
	//   75  181:aload_1         
	//   76  182:invokevirtual   #141 <Method Typeface TintTypedArray.getFont(int, int, android.support.v4.content.res.ResourcesCompat$FontCallback)>
	//   77  185:putfield        #118 <Field Typeface mFontTypeface>
		if(mFontTypeface != null)
	//*  78  188:aload_0         
	//*  79  189:getfield        #118 <Field Typeface mFontTypeface>
	//*  80  192:ifnonnull       238
	//*  81  195:goto            198
	//*  82  198:aload_0         
	//*  83  199:iload           4
	//*  84  201:putfield        #112 <Field boolean mAsyncFontPending>
	//*  85  204:aload_0         
	//*  86  205:getfield        #118 <Field Typeface mFontTypeface>
	//*  87  208:ifnonnull       233
	//*  88  211:aload_2         
	//*  89  212:iload_3         
	//*  90  213:invokevirtual   #145 <Method String TintTypedArray.getString(int)>
	//*  91  216:astore_1        
	//*  92  217:aload_1         
	//*  93  218:ifnull          233
	//*  94  221:aload_0         
	//*  95  222:aload_1         
	//*  96  223:aload_0         
	//*  97  224:getfield        #37  <Field int mStyle>
	//*  98  227:invokestatic    #149 <Method Typeface Typeface.create(String, int)>
	//*  99  230:putfield        #118 <Field Typeface mFontTypeface>
	//* 100  233:return          
	//* 101  234:astore_1        
	//* 102  235:goto            204
			flag = false;
	//  103  238:iconst_0        
	//  104  239:istore          4
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
	//* 105  241:goto            198
	}

	void applyCompoundDrawablesTints()
	{
		if(mDrawableLeftTint != null || mDrawableTopTint != null || mDrawableRightTint != null || mDrawableBottomTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field TintInfo mDrawableLeftTint>
	//*   2    4:ifnonnull       28
	//*   3    7:aload_0         
	//*   4    8:getfield        #154 <Field TintInfo mDrawableTopTint>
	//*   5   11:ifnonnull       28
	//*   6   14:aload_0         
	//*   7   15:getfield        #156 <Field TintInfo mDrawableRightTint>
	//*   8   18:ifnonnull       28
	//*   9   21:aload_0         
	//*  10   22:getfield        #158 <Field TintInfo mDrawableBottomTint>
	//*  11   25:ifnull          80
		{
			Drawable adrawable[] = mView.getCompoundDrawables();
	//   12   28:aload_0         
	//   13   29:getfield        #39  <Field TextView mView>
	//   14   32:invokevirtual   #162 <Method Drawable[] TextView.getCompoundDrawables()>
	//   15   35:astore_1        
			applyCompoundDrawableTint(adrawable[0], mDrawableLeftTint);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:iconst_0        
	//   19   39:aaload          
	//   20   40:aload_0         
	//   21   41:getfield        #152 <Field TintInfo mDrawableLeftTint>
	//   22   44:invokespecial   #164 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[1], mDrawableTopTint);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:iconst_1        
	//   26   50:aaload          
	//   27   51:aload_0         
	//   28   52:getfield        #154 <Field TintInfo mDrawableTopTint>
	//   29   55:invokespecial   #164 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[2], mDrawableRightTint);
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:iconst_2        
	//   33   61:aaload          
	//   34   62:aload_0         
	//   35   63:getfield        #156 <Field TintInfo mDrawableRightTint>
	//   36   66:invokespecial   #164 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[3], mDrawableBottomTint);
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:iconst_3        
	//   40   72:aaload          
	//   41   73:aload_0         
	//   42   74:getfield        #158 <Field TintInfo mDrawableBottomTint>
	//   43   77:invokespecial   #164 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
		}
		if(android.os.Build.VERSION.SDK_INT >= 17 && (mDrawableStartTint != null || mDrawableEndTint != null))
	//*  44   80:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*  45   83:bipush          17
	//*  46   85:icmplt          132
	//*  47   88:aload_0         
	//*  48   89:getfield        #171 <Field TintInfo mDrawableStartTint>
	//*  49   92:ifnonnull       102
	//*  50   95:aload_0         
	//*  51   96:getfield        #173 <Field TintInfo mDrawableEndTint>
	//*  52   99:ifnull          132
		{
			Drawable adrawable1[] = mView.getCompoundDrawablesRelative();
	//   53  102:aload_0         
	//   54  103:getfield        #39  <Field TextView mView>
	//   55  106:invokevirtual   #176 <Method Drawable[] TextView.getCompoundDrawablesRelative()>
	//   56  109:astore_1        
			applyCompoundDrawableTint(adrawable1[0], mDrawableStartTint);
	//   57  110:aload_0         
	//   58  111:aload_1         
	//   59  112:iconst_0        
	//   60  113:aaload          
	//   61  114:aload_0         
	//   62  115:getfield        #171 <Field TintInfo mDrawableStartTint>
	//   63  118:invokespecial   #164 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable1[2], mDrawableEndTint);
	//   64  121:aload_0         
	//   65  122:aload_1         
	//   66  123:iconst_2        
	//   67  124:aaload          
	//   68  125:aload_0         
	//   69  126:getfield        #173 <Field TintInfo mDrawableEndTint>
	//   70  129:invokespecial   #164 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
		}
	//   71  132:return          
	}

	void autoSizeText()
	{
		mAutoSizeTextHelper.autoSizeText();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #183 <Method void AppCompatTextViewAutoSizeHelper.autoSizeText()>
	//    3    7:return          
	}

	int getAutoSizeMaxTextSize()
	{
		return mAutoSizeTextHelper.getAutoSizeMaxTextSize();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #188 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize()>
	//    3    7:ireturn         
	}

	int getAutoSizeMinTextSize()
	{
		return mAutoSizeTextHelper.getAutoSizeMinTextSize();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #191 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize()>
	//    3    7:ireturn         
	}

	int getAutoSizeStepGranularity()
	{
		return mAutoSizeTextHelper.getAutoSizeStepGranularity();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #194 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity()>
	//    3    7:ireturn         
	}

	int[] getAutoSizeTextAvailableSizes()
	{
		return mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #197 <Method int[] AppCompatTextViewAutoSizeHelper.getAutoSizeTextAvailableSizes()>
	//    3    7:areturn         
	}

	int getAutoSizeTextType()
	{
		return mAutoSizeTextHelper.getAutoSizeTextType();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #200 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeTextType()>
	//    3    7:ireturn         
	}

	boolean isAutoSizeEnabled()
	{
		return mAutoSizeTextHelper.isAutoSizeEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #203 <Method boolean AppCompatTextViewAutoSizeHelper.isAutoSizeEnabled()>
	//    3    7:ireturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		Context context = mView.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field TextView mView>
	//    2    4:invokevirtual   #211 <Method Context TextView.getContext()>
	//    3    7:astore          15
		Object obj = ((Object) (AppCompatDrawableManager.get()));
	//    4    9:invokestatic    #215 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//    5   12:astore          9
		Object obj1 = ((Object) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextHelper, i, 0)));
	//    6   14:aload           15
	//    7   16:aload_1         
	//    8   17:getstatic       #219 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextHelper>
	//    9   20:iload_2         
	//   10   21:iconst_0        
	//   11   22:invokestatic    #223 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   12   25:astore          10
		int j = ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance, -1);
	//   13   27:aload           10
	//   14   29:getstatic       #226 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_textAppearance>
	//   15   32:iconst_m1       
	//   16   33:invokevirtual   #229 <Method int TintTypedArray.getResourceId(int, int)>
	//   17   36:istore_3        
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft))
	//*  18   37:aload           10
	//*  19   39:getstatic       #232 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//*  20   42:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  21   45:ifeq            68
			mDrawableLeftTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
	//   22   48:aload_0         
	//   23   49:aload           15
	//   24   51:aload           9
	//   25   53:aload           10
	//   26   55:getstatic       #232 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//   27   58:iconst_0        
	//   28   59:invokevirtual   #229 <Method int TintTypedArray.getResourceId(int, int)>
	//   29   62:invokestatic    #234 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   30   65:putfield        #152 <Field TintInfo mDrawableLeftTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop))
	//*  31   68:aload           10
	//*  32   70:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//*  33   73:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  34   76:ifeq            99
			mDrawableTopTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop, 0));
	//   35   79:aload_0         
	//   36   80:aload           15
	//   37   82:aload           9
	//   38   84:aload           10
	//   39   86:getstatic       #237 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//   40   89:iconst_0        
	//   41   90:invokevirtual   #229 <Method int TintTypedArray.getResourceId(int, int)>
	//   42   93:invokestatic    #234 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   43   96:putfield        #154 <Field TintInfo mDrawableTopTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight))
	//*  44   99:aload           10
	//*  45  101:getstatic       #240 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//*  46  104:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  47  107:ifeq            130
			mDrawableRightTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight, 0));
	//   48  110:aload_0         
	//   49  111:aload           15
	//   50  113:aload           9
	//   51  115:aload           10
	//   52  117:getstatic       #240 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//   53  120:iconst_0        
	//   54  121:invokevirtual   #229 <Method int TintTypedArray.getResourceId(int, int)>
	//   55  124:invokestatic    #234 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   56  127:putfield        #156 <Field TintInfo mDrawableRightTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom))
	//*  57  130:aload           10
	//*  58  132:getstatic       #243 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//*  59  135:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  60  138:ifeq            161
			mDrawableBottomTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
	//   61  141:aload_0         
	//   62  142:aload           15
	//   63  144:aload           9
	//   64  146:aload           10
	//   65  148:getstatic       #243 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//   66  151:iconst_0        
	//   67  152:invokevirtual   #229 <Method int TintTypedArray.getResourceId(int, int)>
	//   68  155:invokestatic    #234 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   69  158:putfield        #158 <Field TintInfo mDrawableBottomTint>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  70  161:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*  71  164:bipush          17
	//*  72  166:icmplt          231
		{
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart))
	//*  73  169:aload           10
	//*  74  171:getstatic       #246 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableStart>
	//*  75  174:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  76  177:ifeq            200
				mDrawableStartTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart, 0));
	//   77  180:aload_0         
	//   78  181:aload           15
	//   79  183:aload           9
	//   80  185:aload           10
	//   81  187:getstatic       #246 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableStart>
	//   82  190:iconst_0        
	//   83  191:invokevirtual   #229 <Method int TintTypedArray.getResourceId(int, int)>
	//   84  194:invokestatic    #234 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   85  197:putfield        #171 <Field TintInfo mDrawableStartTint>
			if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd))
	//*  86  200:aload           10
	//*  87  202:getstatic       #249 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableEnd>
	//*  88  205:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  89  208:ifeq            231
				mDrawableEndTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
	//   90  211:aload_0         
	//   91  212:aload           15
	//   92  214:aload           9
	//   93  216:aload           10
	//   94  218:getstatic       #249 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableEnd>
	//   95  221:iconst_0        
	//   96  222:invokevirtual   #229 <Method int TintTypedArray.getResourceId(int, int)>
	//   97  225:invokestatic    #234 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   98  228:putfield        #173 <Field TintInfo mDrawableEndTint>
		}
		((TintTypedArray) (obj1)).recycle();
	//   99  231:aload           10
	//  100  233:invokevirtual   #252 <Method void TintTypedArray.recycle()>
		boolean flag3 = mView.getTransformationMethod() instanceof PasswordTransformationMethod;
	//  101  236:aload_0         
	//  102  237:getfield        #39  <Field TextView mView>
	//  103  240:invokevirtual   #256 <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//  104  243:instanceof      #258 <Class PasswordTransformationMethod>
	//  105  246:istore          8
		boolean flag2 = true;
	//  106  248:iconst_1        
	//  107  249:istore          7
		android.content.res.ColorStateList colorstatelist2 = null;
	//  108  251:aconst_null     
	//  109  252:astore          12
		obj1 = null;
	//  110  254:aconst_null     
	//  111  255:astore          10
		boolean flag;
		boolean flag1;
		android.content.res.ColorStateList colorstatelist1;
		if(j != -1)
	//* 112  257:iload_3         
	//* 113  258:iconst_m1       
	//* 114  259:icmpeq          460
		{
			TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, j, android.support.v7.appcompat.R.styleable.TextAppearance);
	//  115  262:aload           15
	//  116  264:iload_3         
	//  117  265:getstatic       #261 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  118  268:invokestatic    #264 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//  119  271:astore          13
			if(!flag3 && tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//* 120  273:iload           8
	//* 121  275:ifne            306
	//* 122  278:aload           13
	//* 123  280:getstatic       #267 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 124  283:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//* 125  286:ifeq            306
			{
				flag = tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//  126  289:aload           13
	//  127  291:getstatic       #267 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//  128  294:iconst_0        
	//  129  295:invokevirtual   #271 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  130  298:istore          5
				flag1 = true;
	//  131  300:iconst_1        
	//  132  301:istore          6
			} else
	//* 133  303:goto            313
			{
				flag1 = false;
	//  134  306:iconst_0        
	//  135  307:istore          6
				flag = flag1;
	//  136  309:iload           6
	//  137  311:istore          5
			}
			updateTypefaceAndStyle(context, tinttypedarray);
	//  138  313:aload_0         
	//  139  314:aload           15
	//  140  316:aload           13
	//  141  318:invokespecial   #273 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
			if(android.os.Build.VERSION.SDK_INT < 23)
	//* 142  321:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//* 143  324:bipush          23
	//* 144  326:icmpge          437
			{
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 145  329:aload           13
	//* 146  331:getstatic       #276 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 147  334:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//* 148  337:ifeq            353
					obj = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  149  340:aload           13
	//  150  342:getstatic       #276 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  151  345:invokevirtual   #280 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  152  348:astore          9
				else
	//* 153  350:goto            356
					obj = null;
	//  154  353:aconst_null     
	//  155  354:astore          9
				android.content.res.ColorStateList colorstatelist;
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 156  356:aload           13
	//* 157  358:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 158  361:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//* 159  364:ifeq            380
					colorstatelist = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint);
	//  160  367:aload           13
	//  161  369:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  162  372:invokevirtual   #280 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  163  375:astore          11
				else
	//* 164  377:goto            383
					colorstatelist = null;
	//  165  380:aconst_null     
	//  166  381:astore          11
				if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
	//* 167  383:aload           13
	//* 168  385:getstatic       #286 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 169  388:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//* 170  391:ifeq            419
				{
					colorstatelist2 = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink);
	//  171  394:aload           13
	//  172  396:getstatic       #286 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//  173  399:invokevirtual   #280 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  174  402:astore          12
					obj1 = obj;
	//  175  404:aload           9
	//  176  406:astore          10
					obj = ((Object) (colorstatelist2));
	//  177  408:aload           12
	//  178  410:astore          9
					colorstatelist2 = colorstatelist;
	//  179  412:aload           11
	//  180  414:astore          12
				} else
	//* 181  416:goto            444
				{
					colorstatelist2 = null;
	//  182  419:aconst_null     
	//  183  420:astore          12
					obj1 = obj;
	//  184  422:aload           9
	//  185  424:astore          10
					obj = ((Object) (colorstatelist2));
	//  186  426:aload           12
	//  187  428:astore          9
					colorstatelist2 = colorstatelist;
	//  188  430:aload           11
	//  189  432:astore          12
				}
			} else
	//* 190  434:goto            444
			{
				obj = null;
	//  191  437:aconst_null     
	//  192  438:astore          9
				colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  193  440:aload           9
	//  194  442:astore          12
			}
			tinttypedarray.recycle();
	//  195  444:aload           13
	//  196  446:invokevirtual   #252 <Method void TintTypedArray.recycle()>
			colorstatelist1 = ((android.content.res.ColorStateList) (obj));
	//  197  449:aload           9
	//  198  451:astore          11
			obj = ((Object) (colorstatelist2));
	//  199  453:aload           12
	//  200  455:astore          9
		} else
	//* 201  457:goto            478
		{
			flag1 = false;
	//  202  460:iconst_0        
	//  203  461:istore          6
			flag = flag1;
	//  204  463:iload           6
	//  205  465:istore          5
			colorstatelist1 = null;
	//  206  467:aconst_null     
	//  207  468:astore          11
			obj = ((Object) (colorstatelist1));
	//  208  470:aload           11
	//  209  472:astore          9
			obj1 = ((Object) (colorstatelist2));
	//  210  474:aload           12
	//  211  476:astore          10
		}
		TintTypedArray tinttypedarray1 = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.TextAppearance, i, 0);
	//  212  478:aload           15
	//  213  480:aload_1         
	//  214  481:getstatic       #261 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  215  484:iload_2         
	//  216  485:iconst_0        
	//  217  486:invokestatic    #223 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//  218  489:astore          16
		if(!flag3 && tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//* 219  491:iload           8
	//* 220  493:ifne            525
	//* 221  496:aload           16
	//* 222  498:getstatic       #267 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 223  501:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//* 224  504:ifeq            525
		{
			flag = tinttypedarray1.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//  225  507:aload           16
	//  226  509:getstatic       #267 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//  227  512:iconst_0        
	//  228  513:invokevirtual   #271 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  229  516:istore          5
			flag1 = flag2;
	//  230  518:iload           7
	//  231  520:istore          6
		}
	//* 232  522:goto            525
		android.content.res.ColorStateList colorstatelist3 = ((android.content.res.ColorStateList) (obj1));
	//  233  525:aload           10
	//  234  527:astore          13
		android.content.res.ColorStateList colorstatelist4 = colorstatelist1;
	//  235  529:aload           11
	//  236  531:astore          14
		colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  237  533:aload           9
	//  238  535:astore          12
		if(android.os.Build.VERSION.SDK_INT < 23)
	//* 239  537:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//* 240  540:bipush          23
	//* 241  542:icmpge          628
		{
			if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 242  545:aload           16
	//* 243  547:getstatic       #276 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 244  550:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//* 245  553:ifeq            566
				obj1 = ((Object) (tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  246  556:aload           16
	//  247  558:getstatic       #276 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  248  561:invokevirtual   #280 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  249  564:astore          10
			if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 250  566:aload           16
	//* 251  568:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 252  571:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//* 253  574:ifeq            587
				obj = ((Object) (tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint)));
	//  254  577:aload           16
	//  255  579:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  256  582:invokevirtual   #280 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  257  585:astore          9
			colorstatelist3 = ((android.content.res.ColorStateList) (obj1));
	//  258  587:aload           10
	//  259  589:astore          13
			colorstatelist4 = colorstatelist1;
	//  260  591:aload           11
	//  261  593:astore          14
			colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  262  595:aload           9
	//  263  597:astore          12
			if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
	//* 264  599:aload           16
	//* 265  601:getstatic       #286 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 266  604:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//* 267  607:ifeq            628
			{
				colorstatelist4 = tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink);
	//  268  610:aload           16
	//  269  612:getstatic       #286 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//  270  615:invokevirtual   #280 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  271  618:astore          14
				colorstatelist2 = ((android.content.res.ColorStateList) (obj));
	//  272  620:aload           9
	//  273  622:astore          12
				colorstatelist3 = ((android.content.res.ColorStateList) (obj1));
	//  274  624:aload           10
	//  275  626:astore          13
			}
		}
		if(android.os.Build.VERSION.SDK_INT >= 28 && tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize) && tinttypedarray1.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, -1) == 0)
	//* 276  628:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//* 277  631:bipush          28
	//* 278  633:icmplt          668
	//* 279  636:aload           16
	//* 280  638:getstatic       #289 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//* 281  641:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//* 282  644:ifeq            668
	//* 283  647:aload           16
	//* 284  649:getstatic       #289 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//* 285  652:iconst_m1       
	//* 286  653:invokevirtual   #292 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//* 287  656:ifne            668
			mView.setTextSize(0, 0.0F);
	//  288  659:aload_0         
	//  289  660:getfield        #39  <Field TextView mView>
	//  290  663:iconst_0        
	//  291  664:fconst_0        
	//  292  665:invokevirtual   #295 <Method void TextView.setTextSize(int, float)>
		updateTypefaceAndStyle(context, tinttypedarray1);
	//  293  668:aload_0         
	//  294  669:aload           15
	//  295  671:aload           16
	//  296  673:invokespecial   #273 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
		tinttypedarray1.recycle();
	//  297  676:aload           16
	//  298  678:invokevirtual   #252 <Method void TintTypedArray.recycle()>
		if(colorstatelist3 != null)
	//* 299  681:aload           13
	//* 300  683:ifnull          695
			mView.setTextColor(colorstatelist3);
	//  301  686:aload_0         
	//  302  687:getfield        #39  <Field TextView mView>
	//  303  690:aload           13
	//  304  692:invokevirtual   #299 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
		if(colorstatelist2 != null)
	//* 305  695:aload           12
	//* 306  697:ifnull          709
			mView.setHintTextColor(colorstatelist2);
	//  307  700:aload_0         
	//  308  701:getfield        #39  <Field TextView mView>
	//  309  704:aload           12
	//  310  706:invokevirtual   #302 <Method void TextView.setHintTextColor(android.content.res.ColorStateList)>
		if(colorstatelist4 != null)
	//* 311  709:aload           14
	//* 312  711:ifnull          723
			mView.setLinkTextColor(colorstatelist4);
	//  313  714:aload_0         
	//  314  715:getfield        #39  <Field TextView mView>
	//  315  718:aload           14
	//  316  720:invokevirtual   #305 <Method void TextView.setLinkTextColor(android.content.res.ColorStateList)>
		if(!flag3 && flag1)
	//* 317  723:iload           8
	//* 318  725:ifne            739
	//* 319  728:iload           6
	//* 320  730:ifeq            739
			setAllCaps(flag);
	//  321  733:aload_0         
	//  322  734:iload           5
	//  323  736:invokevirtual   #309 <Method void setAllCaps(boolean)>
		obj = ((Object) (mFontTypeface));
	//  324  739:aload_0         
	//  325  740:getfield        #118 <Field Typeface mFontTypeface>
	//  326  743:astore          9
		if(obj != null)
	//* 327  745:aload           9
	//* 328  747:ifnull          763
			mView.setTypeface(((Typeface) (obj)), mStyle);
	//  329  750:aload_0         
	//  330  751:getfield        #39  <Field TextView mView>
	//  331  754:aload           9
	//  332  756:aload_0         
	//  333  757:getfield        #37  <Field int mStyle>
	//  334  760:invokevirtual   #313 <Method void TextView.setTypeface(Typeface, int)>
		mAutoSizeTextHelper.loadFromAttributes(attributeset, i);
	//  335  763:aload_0         
	//  336  764:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  337  767:aload_1         
	//  338  768:iload_2         
	//  339  769:invokevirtual   #315 <Method void AppCompatTextViewAutoSizeHelper.loadFromAttributes(AttributeSet, int)>
		if(AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && mAutoSizeTextHelper.getAutoSizeTextType() != 0)
	//* 340  772:getstatic       #320 <Field boolean AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE>
	//* 341  775:ifeq            860
	//* 342  778:aload_0         
	//* 343  779:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 344  782:invokevirtual   #200 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeTextType()>
	//* 345  785:ifeq            860
		{
			int ai[] = mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
	//  346  788:aload_0         
	//  347  789:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  348  792:invokevirtual   #197 <Method int[] AppCompatTextViewAutoSizeHelper.getAutoSizeTextAvailableSizes()>
	//  349  795:astore          9
			if(ai.length > 0)
	//* 350  797:aload           9
	//* 351  799:arraylength     
	//* 352  800:ifle            860
				if((float)mView.getAutoSizeStepGranularity() != -1F)
	//* 353  803:aload_0         
	//* 354  804:getfield        #39  <Field TextView mView>
	//* 355  807:invokevirtual   #321 <Method int TextView.getAutoSizeStepGranularity()>
	//* 356  810:i2f             
	//* 357  811:ldc2            #322 <Float -1F>
	//* 358  814:fcmpl           
	//* 359  815:ifeq            850
					mView.setAutoSizeTextTypeUniformWithConfiguration(mAutoSizeTextHelper.getAutoSizeMinTextSize(), mAutoSizeTextHelper.getAutoSizeMaxTextSize(), mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
	//  360  818:aload_0         
	//  361  819:getfield        #39  <Field TextView mView>
	//  362  822:aload_0         
	//  363  823:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  364  826:invokevirtual   #191 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize()>
	//  365  829:aload_0         
	//  366  830:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  367  833:invokevirtual   #188 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize()>
	//  368  836:aload_0         
	//  369  837:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  370  840:invokevirtual   #194 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity()>
	//  371  843:iconst_0        
	//  372  844:invokevirtual   #326 <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
				else
	//* 373  847:goto            860
					mView.setAutoSizeTextTypeUniformWithPresetSizes(ai, 0);
	//  374  850:aload_0         
	//  375  851:getfield        #39  <Field TextView mView>
	//  376  854:aload           9
	//  377  856:iconst_0        
	//  378  857:invokevirtual   #330 <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
		}
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextView)));
	//  379  860:aload           15
	//  380  862:aload_1         
	//  381  863:getstatic       #333 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextView>
	//  382  866:invokestatic    #336 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[])>
	//  383  869:astore_1        
		i = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
	//  384  870:aload_1         
	//  385  871:getstatic       #339 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_firstBaselineToTopHeight>
	//  386  874:iconst_m1       
	//  387  875:invokevirtual   #292 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  388  878:istore_2        
		j = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
	//  389  879:aload_1         
	//  390  880:getstatic       #342 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_lastBaselineToBottomHeight>
	//  391  883:iconst_m1       
	//  392  884:invokevirtual   #292 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  393  887:istore_3        
		int k = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.AppCompatTextView_lineHeight, -1);
	//  394  888:aload_1         
	//  395  889:getstatic       #345 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextView_lineHeight>
	//  396  892:iconst_m1       
	//  397  893:invokevirtual   #292 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  398  896:istore          4
		((TintTypedArray) (attributeset)).recycle();
	//  399  898:aload_1         
	//  400  899:invokevirtual   #252 <Method void TintTypedArray.recycle()>
		if(i != -1)
	//* 401  902:iload_2         
	//* 402  903:iconst_m1       
	//* 403  904:icmpeq          915
			TextViewCompat.setFirstBaselineToTopHeight(mView, i);
	//  404  907:aload_0         
	//  405  908:getfield        #39  <Field TextView mView>
	//  406  911:iload_2         
	//  407  912:invokestatic    #351 <Method void TextViewCompat.setFirstBaselineToTopHeight(TextView, int)>
		if(j != -1)
	//* 408  915:iload_3         
	//* 409  916:iconst_m1       
	//* 410  917:icmpeq          928
			TextViewCompat.setLastBaselineToBottomHeight(mView, j);
	//  411  920:aload_0         
	//  412  921:getfield        #39  <Field TextView mView>
	//  413  924:iload_3         
	//  414  925:invokestatic    #354 <Method void TextViewCompat.setLastBaselineToBottomHeight(TextView, int)>
		if(k != -1)
	//* 415  928:iload           4
	//* 416  930:iconst_m1       
	//* 417  931:icmpeq          943
			TextViewCompat.setLineHeight(mView, k);
	//  418  934:aload_0         
	//  419  935:getfield        #39  <Field TextView mView>
	//  420  938:iload           4
	//  421  940:invokestatic    #357 <Method void TextViewCompat.setLineHeight(TextView, int)>
	//  422  943:return          
	}

	void onAsyncTypefaceReceived(WeakReference weakreference, Typeface typeface)
	{
		if(mAsyncFontPending)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field boolean mAsyncFontPending>
	//*   2    4:ifeq            33
		{
			mFontTypeface = typeface;
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:putfield        #118 <Field Typeface mFontTypeface>
			weakreference = ((WeakReference) ((TextView)weakreference.get()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #362 <Method Object WeakReference.get()>
	//    8   16:checkcast       #50  <Class TextView>
	//    9   19:astore_1        
			if(weakreference != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          33
				((TextView) (weakreference)).setTypeface(typeface, mStyle);
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:getfield        #37  <Field int mStyle>
	//   16   30:invokevirtual   #313 <Method void TextView.setTypeface(Typeface, int)>
		}
	//   17   33:return          
	}

	void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #320 <Field boolean AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifne            10
			autoSizeText();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #367 <Method void autoSizeText()>
	//    4   10:return          
	}

	void onSetTextAppearance(Context context, int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #261 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    3    5:invokestatic    #264 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    4    8:astore_3        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//*   5    9:aload_3         
	//*   6   10:getstatic       #267 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*   7   13:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*   8   16:ifeq            31
			setAllCaps(tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
	//    9   19:aload_0         
	//   10   20:aload_3         
	//   11   21:getstatic       #267 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #271 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   14   28:invokevirtual   #309 <Method void setAllCaps(boolean)>
		if(android.os.Build.VERSION.SDK_INT < 23 && tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*  15   31:getstatic       #169 <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          23
	//*  17   36:icmpge          72
	//*  18   39:aload_3         
	//*  19   40:getstatic       #276 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*  20   43:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  21   46:ifeq            72
		{
			android.content.res.ColorStateList colorstatelist = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   22   49:aload_3         
	//   23   50:getstatic       #276 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   24   53:invokevirtual   #280 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//   25   56:astore          4
			if(colorstatelist != null)
	//*  26   58:aload           4
	//*  27   60:ifnull          72
				mView.setTextColor(colorstatelist);
	//   28   63:aload_0         
	//   29   64:getfield        #39  <Field TextView mView>
	//   30   67:aload           4
	//   31   69:invokevirtual   #299 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
		}
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize) && tinttypedarray.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, -1) == 0)
	//*  32   72:aload_3         
	//*  33   73:getstatic       #289 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  34   76:invokevirtual   #104 <Method boolean TintTypedArray.hasValue(int)>
	//*  35   79:ifeq            102
	//*  36   82:aload_3         
	//*  37   83:getstatic       #289 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  38   86:iconst_m1       
	//*  39   87:invokevirtual   #292 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//*  40   90:ifne            102
			mView.setTextSize(0, 0.0F);
	//   41   93:aload_0         
	//   42   94:getfield        #39  <Field TextView mView>
	//   43   97:iconst_0        
	//   44   98:fconst_0        
	//   45   99:invokevirtual   #295 <Method void TextView.setTextSize(int, float)>
		updateTypefaceAndStyle(context, tinttypedarray);
	//   46  102:aload_0         
	//   47  103:aload_1         
	//   48  104:aload_3         
	//   49  105:invokespecial   #273 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
		tinttypedarray.recycle();
	//   50  108:aload_3         
	//   51  109:invokevirtual   #252 <Method void TintTypedArray.recycle()>
		context = ((Context) (mFontTypeface));
	//   52  112:aload_0         
	//   53  113:getfield        #118 <Field Typeface mFontTypeface>
	//   54  116:astore_1        
		if(context != null)
	//*  55  117:aload_1         
	//*  56  118:ifnull          133
			mView.setTypeface(((Typeface) (context)), mStyle);
	//   57  121:aload_0         
	//   58  122:getfield        #39  <Field TextView mView>
	//   59  125:aload_1         
	//   60  126:aload_0         
	//   61  127:getfield        #37  <Field int mStyle>
	//   62  130:invokevirtual   #313 <Method void TextView.setTypeface(Typeface, int)>
	//   63  133:return          
	}

	void setAllCaps(boolean flag)
	{
		mView.setAllCaps(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field TextView mView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #370 <Method void TextView.setAllCaps(boolean)>
	//    4    8:return          
	}

	void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #373 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//    7   12:return          
	}

	void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
		throws IllegalArgumentException
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #375 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//    5    9:return          
	}

	void setAutoSizeTextTypeWithDefaults(int i)
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #380 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeWithDefaults(int)>
	//    4    8:return          
	}

	void setTextSize(int i, float f)
	{
		if(!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && !isAutoSizeEnabled())
	//*   0    0:getstatic       #320 <Field boolean AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifne            19
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #381 <Method boolean isAutoSizeEnabled()>
	//*   4   10:ifne            19
			setTextSizeInternal(i, f);
	//    5   13:aload_0         
	//    6   14:iload_1         
	//    7   15:fload_2         
	//    8   16:invokespecial   #382 <Method void setTextSizeInternal(int, float)>
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
}
