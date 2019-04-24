// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.AutoSizeableTextView;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.widget:
//			AppCompatTextViewAutoSizeHelper, AppCompatTextHelperV17, AppCompatDrawableManager, TintInfo, 
//			TintTypedArray

class AppCompatTextHelper
{

	AppCompatTextHelper(TextView textview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mStyle = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #38  <Field int mStyle>
		mView = textview;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #40  <Field TextView mView>
		mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(mView);
	//    8   14:aload_0         
	//    9   15:new             #42  <Class AppCompatTextViewAutoSizeHelper>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #40  <Field TextView mView>
	//   13   23:invokespecial   #44  <Method void AppCompatTextViewAutoSizeHelper(TextView)>
	//   14   26:putfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//   15   29:return          
	}

	static AppCompatTextHelper create(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          17
			return ((AppCompatTextHelper) (new AppCompatTextHelperV17(textview)));
	//    3    8:new             #62  <Class AppCompatTextHelperV17>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #63  <Method void AppCompatTextHelperV17(TextView)>
	//    7   16:areturn         
		else
			return new AppCompatTextHelper(textview);
	//    8   17:new             #2   <Class AppCompatTextHelper>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #64  <Method void AppCompatTextHelper(TextView)>
	//   12   25:areturn         
	}

	protected static TintInfo createTintInfo(Context context, AppCompatDrawableManager appcompatdrawablemanager, int i)
	{
		context = ((Context) (appcompatdrawablemanager.getTintList(context, i)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #72  <Method android.content.res.ColorStateList AppCompatDrawableManager.getTintList(Context, int)>
	//    4    6:astore_0        
		if(context != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          31
		{
			appcompatdrawablemanager = ((AppCompatDrawableManager) (new TintInfo()));
	//    7   11:new             #74  <Class TintInfo>
	//    8   14:dup             
	//    9   15:invokespecial   #75  <Method void TintInfo()>
	//   10   18:astore_1        
			appcompatdrawablemanager.mHasTintList = true;
	//   11   19:aload_1         
	//   12   20:iconst_1        
	//   13   21:putfield        #78  <Field boolean TintInfo.mHasTintList>
			appcompatdrawablemanager.mTintList = ((android.content.res.ColorStateList) (context));
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:putfield        #82  <Field android.content.res.ColorStateList TintInfo.mTintList>
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

	private void onAsyncTypefaceReceived(WeakReference weakreference, Typeface typeface)
	{
		if(mAsyncFontPending)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field boolean mAsyncFontPending>
	//*   2    4:ifeq            33
		{
			mFontTypeface = typeface;
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:putfield        #86  <Field Typeface mFontTypeface>
			weakreference = ((WeakReference) ((TextView)weakreference.get()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #92  <Method Object WeakReference.get()>
	//    8   16:checkcast       #94  <Class TextView>
	//    9   19:astore_1        
			if(weakreference != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          33
				((TextView) (weakreference)).setTypeface(typeface, mStyle);
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:getfield        #38  <Field int mStyle>
	//   16   30:invokevirtual   #98  <Method void TextView.setTypeface(Typeface, int)>
		}
	//   17   33:return          
	}

	private void setTextSizeInternal(int i, float f)
	{
		mAutoSizeTextHelper.setTextSizeInternal(i, f);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #104 <Method void AppCompatTextViewAutoSizeHelper.setTextSizeInternal(int, float)>
	//    5    9:return          
	}

	private void updateTypefaceAndStyle(Context context, TintTypedArray tinttypedarray)
	{
		int i;
		boolean flag;
		mStyle = tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle, mStyle);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:getstatic       #115 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textStyle>
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field int mStyle>
	//    5    9:invokevirtual   #121 <Method int TintTypedArray.getInt(int, int)>
	//    6   12:putfield        #38  <Field int mStyle>
		boolean flag1 = tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_fontFamily);
	//    7   15:aload_2         
	//    8   16:getstatic       #124 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_fontFamily>
	//    9   19:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//   10   22:istore          5
		flag = true;
	//   11   24:iconst_1        
	//   12   25:istore          4
		if(!flag1 && !tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily))
	//*  13   27:iload           5
	//*  14   29:ifne            121
	//*  15   32:aload_2         
	//*  16   33:getstatic       #131 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//*  17   36:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  18   39:ifeq            45
	//*  19   42:goto            121
		{
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface))
	//*  20   45:aload_2         
	//*  21   46:getstatic       #134 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//*  22   49:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  23   52:ifeq            120
			{
				mAsyncFontPending = false;
	//   24   55:aload_0         
	//   25   56:iconst_0        
	//   26   57:putfield        #84  <Field boolean mAsyncFontPending>
				switch(tinttypedarray.getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface, 1))
	//*  27   60:aload_2         
	//*  28   61:getstatic       #134 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//*  29   64:iconst_1        
	//*  30   65:invokevirtual   #121 <Method int TintTypedArray.getInt(int, int)>
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
	//   34   98:getstatic       #138 <Field Typeface Typeface.MONOSPACE>
	//   35  101:putfield        #86  <Field Typeface mFontTypeface>
					return;
	//   36  104:return          

				case 2: // '\002'
					mFontTypeface = Typeface.SERIF;
	//   37  105:aload_0         
	//   38  106:getstatic       #140 <Field Typeface Typeface.SERIF>
	//   39  109:putfield        #86  <Field Typeface mFontTypeface>
					return;
	//   40  112:return          

				case 1: // '\001'
					mFontTypeface = Typeface.SANS_SERIF;
	//   41  113:aload_0         
	//   42  114:getstatic       #143 <Field Typeface Typeface.SANS_SERIF>
	//   43  117:putfield        #86  <Field Typeface mFontTypeface>
					break;
				}
			}
			return;
	//   44  120:return          
		}
		mFontTypeface = null;
	//   45  121:aload_0         
	//   46  122:aconst_null     
	//   47  123:putfield        #86  <Field Typeface mFontTypeface>
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily))
	//*  48  126:aload_2         
	//*  49  127:getstatic       #131 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//*  50  130:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  51  133:ifeq            143
			i = android.support.v7.appcompat.R.styleable.TextAppearance_fontFamily;
	//   52  136:getstatic       #131 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_fontFamily>
	//   53  139:istore_3        
		else
	//*  54  140:goto            147
			i = android.support.v7.appcompat.R.styleable.TextAppearance_android_fontFamily;
	//   55  143:getstatic       #124 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_fontFamily>
	//   56  146:istore_3        
		if(context.isRestricted())
			break MISSING_BLOCK_LABEL_204;
	//   57  147:aload_1         
	//   58  148:invokevirtual   #149 <Method boolean Context.isRestricted()>
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
			//    5    9:invokestatic    #32  <Method void AppCompatTextHelper.access$000(AppCompatTextHelper, WeakReference, Typeface)>
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
	//   63  159:new             #88  <Class WeakReference>
	//   64  162:dup             
	//   65  163:aload_0         
	//   66  164:getfield        #40  <Field TextView mView>
	//   67  167:invokespecial   #152 <Method void WeakReference(Object)>
	//   68  170:invokespecial   #155 <Method void AppCompatTextHelper$1(AppCompatTextHelper, WeakReference)>
	//   69  173:astore_1        
		mFontTypeface = tinttypedarray.getFont(i, mStyle, ((android.support.v4.content.res.ResourcesCompat.FontCallback) (context)));
	//   70  174:aload_0         
	//   71  175:aload_2         
	//   72  176:iload_3         
	//   73  177:aload_0         
	//   74  178:getfield        #38  <Field int mStyle>
	//   75  181:aload_1         
	//   76  182:invokevirtual   #159 <Method Typeface TintTypedArray.getFont(int, int, android.support.v4.content.res.ResourcesCompat$FontCallback)>
	//   77  185:putfield        #86  <Field Typeface mFontTypeface>
		if(mFontTypeface != null)
	//*  78  188:aload_0         
	//*  79  189:getfield        #86  <Field Typeface mFontTypeface>
	//*  80  192:ifnonnull       238
	//*  81  195:goto            198
	//*  82  198:aload_0         
	//*  83  199:iload           4
	//*  84  201:putfield        #84  <Field boolean mAsyncFontPending>
	//*  85  204:aload_0         
	//*  86  205:getfield        #86  <Field Typeface mFontTypeface>
	//*  87  208:ifnonnull       233
	//*  88  211:aload_2         
	//*  89  212:iload_3         
	//*  90  213:invokevirtual   #163 <Method String TintTypedArray.getString(int)>
	//*  91  216:astore_1        
	//*  92  217:aload_1         
	//*  93  218:ifnull          233
	//*  94  221:aload_0         
	//*  95  222:aload_1         
	//*  96  223:aload_0         
	//*  97  224:getfield        #38  <Field int mStyle>
	//*  98  227:invokestatic    #166 <Method Typeface Typeface.create(String, int)>
	//*  99  230:putfield        #86  <Field Typeface mFontTypeface>
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
	//    7   11:getfield        #40  <Field TextView mView>
	//    8   14:invokevirtual   #172 <Method int[] TextView.getDrawableState()>
	//    9   17:invokestatic    #176 <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
	//   10   20:return          
	}

	void applyCompoundDrawablesTints()
	{
		if(mDrawableLeftTint != null || mDrawableTopTint != null || mDrawableRightTint != null || mDrawableBottomTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field TintInfo mDrawableLeftTint>
	//*   2    4:ifnonnull       28
	//*   3    7:aload_0         
	//*   4    8:getfield        #181 <Field TintInfo mDrawableTopTint>
	//*   5   11:ifnonnull       28
	//*   6   14:aload_0         
	//*   7   15:getfield        #183 <Field TintInfo mDrawableRightTint>
	//*   8   18:ifnonnull       28
	//*   9   21:aload_0         
	//*  10   22:getfield        #185 <Field TintInfo mDrawableBottomTint>
	//*  11   25:ifnull          80
		{
			Drawable adrawable[] = mView.getCompoundDrawables();
	//   12   28:aload_0         
	//   13   29:getfield        #40  <Field TextView mView>
	//   14   32:invokevirtual   #189 <Method Drawable[] TextView.getCompoundDrawables()>
	//   15   35:astore_1        
			applyCompoundDrawableTint(adrawable[0], mDrawableLeftTint);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:iconst_0        
	//   19   39:aaload          
	//   20   40:aload_0         
	//   21   41:getfield        #179 <Field TintInfo mDrawableLeftTint>
	//   22   44:invokevirtual   #191 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[1], mDrawableTopTint);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:iconst_1        
	//   26   50:aaload          
	//   27   51:aload_0         
	//   28   52:getfield        #181 <Field TintInfo mDrawableTopTint>
	//   29   55:invokevirtual   #191 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[2], mDrawableRightTint);
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:iconst_2        
	//   33   61:aaload          
	//   34   62:aload_0         
	//   35   63:getfield        #183 <Field TintInfo mDrawableRightTint>
	//   36   66:invokevirtual   #191 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[3], mDrawableBottomTint);
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:iconst_3        
	//   40   72:aaload          
	//   41   73:aload_0         
	//   42   74:getfield        #185 <Field TintInfo mDrawableBottomTint>
	//   43   77:invokevirtual   #191 <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
		}
	//   44   80:return          
	}

	void autoSizeText()
	{
		mAutoSizeTextHelper.autoSizeText();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #197 <Method void AppCompatTextViewAutoSizeHelper.autoSizeText()>
	//    3    7:return          
	}

	int getAutoSizeMaxTextSize()
	{
		return mAutoSizeTextHelper.getAutoSizeMaxTextSize();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #202 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize()>
	//    3    7:ireturn         
	}

	int getAutoSizeMinTextSize()
	{
		return mAutoSizeTextHelper.getAutoSizeMinTextSize();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #205 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize()>
	//    3    7:ireturn         
	}

	int getAutoSizeStepGranularity()
	{
		return mAutoSizeTextHelper.getAutoSizeStepGranularity();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #208 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity()>
	//    3    7:ireturn         
	}

	int[] getAutoSizeTextAvailableSizes()
	{
		return mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #211 <Method int[] AppCompatTextViewAutoSizeHelper.getAutoSizeTextAvailableSizes()>
	//    3    7:areturn         
	}

	int getAutoSizeTextType()
	{
		return mAutoSizeTextHelper.getAutoSizeTextType();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #214 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeTextType()>
	//    3    7:ireturn         
	}

	boolean isAutoSizeEnabled()
	{
		return mAutoSizeTextHelper.isAutoSizeEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:invokevirtual   #217 <Method boolean AppCompatTextViewAutoSizeHelper.isAutoSizeEnabled()>
	//    3    7:ireturn         
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		Context context = mView.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TextView mView>
	//    2    4:invokevirtual   #225 <Method Context TextView.getContext()>
	//    3    7:astore          15
		Object obj = ((Object) (AppCompatDrawableManager.get()));
	//    4    9:invokestatic    #228 <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//    5   12:astore          9
		Object obj1 = ((Object) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextHelper, i, 0)));
	//    6   14:aload           15
	//    7   16:aload_1         
	//    8   17:getstatic       #232 <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextHelper>
	//    9   20:iload_2         
	//   10   21:iconst_0        
	//   11   22:invokestatic    #236 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   12   25:astore          10
		int j = ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance, -1);
	//   13   27:aload           10
	//   14   29:getstatic       #239 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_textAppearance>
	//   15   32:iconst_m1       
	//   16   33:invokevirtual   #242 <Method int TintTypedArray.getResourceId(int, int)>
	//   17   36:istore_3        
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft))
	//*  18   37:aload           10
	//*  19   39:getstatic       #245 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//*  20   42:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  21   45:ifeq            68
			mDrawableLeftTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
	//   22   48:aload_0         
	//   23   49:aload           15
	//   24   51:aload           9
	//   25   53:aload           10
	//   26   55:getstatic       #245 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//   27   58:iconst_0        
	//   28   59:invokevirtual   #242 <Method int TintTypedArray.getResourceId(int, int)>
	//   29   62:invokestatic    #247 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   30   65:putfield        #179 <Field TintInfo mDrawableLeftTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop))
	//*  31   68:aload           10
	//*  32   70:getstatic       #250 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//*  33   73:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  34   76:ifeq            99
			mDrawableTopTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop, 0));
	//   35   79:aload_0         
	//   36   80:aload           15
	//   37   82:aload           9
	//   38   84:aload           10
	//   39   86:getstatic       #250 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//   40   89:iconst_0        
	//   41   90:invokevirtual   #242 <Method int TintTypedArray.getResourceId(int, int)>
	//   42   93:invokestatic    #247 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   43   96:putfield        #181 <Field TintInfo mDrawableTopTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight))
	//*  44   99:aload           10
	//*  45  101:getstatic       #253 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//*  46  104:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  47  107:ifeq            130
			mDrawableRightTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight, 0));
	//   48  110:aload_0         
	//   49  111:aload           15
	//   50  113:aload           9
	//   51  115:aload           10
	//   52  117:getstatic       #253 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//   53  120:iconst_0        
	//   54  121:invokevirtual   #242 <Method int TintTypedArray.getResourceId(int, int)>
	//   55  124:invokestatic    #247 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   56  127:putfield        #183 <Field TintInfo mDrawableRightTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom))
	//*  57  130:aload           10
	//*  58  132:getstatic       #256 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//*  59  135:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  60  138:ifeq            161
			mDrawableBottomTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
	//   61  141:aload_0         
	//   62  142:aload           15
	//   63  144:aload           9
	//   64  146:aload           10
	//   65  148:getstatic       #256 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//   66  151:iconst_0        
	//   67  152:invokevirtual   #242 <Method int TintTypedArray.getResourceId(int, int)>
	//   68  155:invokestatic    #247 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   69  158:putfield        #185 <Field TintInfo mDrawableBottomTint>
		((TintTypedArray) (obj1)).recycle();
	//   70  161:aload           10
	//   71  163:invokevirtual   #259 <Method void TintTypedArray.recycle()>
		boolean flag4 = mView.getTransformationMethod() instanceof PasswordTransformationMethod;
	//   72  166:aload_0         
	//   73  167:getfield        #40  <Field TextView mView>
	//   74  170:invokevirtual   #263 <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//   75  173:instanceof      #265 <Class PasswordTransformationMethod>
	//   76  176:istore          8
		obj1 = null;
	//   77  178:aconst_null     
	//   78  179:astore          10
		Object obj2 = null;
	//   79  181:aconst_null     
	//   80  182:astore          12
		android.content.res.ColorStateList colorstatelist = null;
	//   81  184:aconst_null     
	//   82  185:astore          11
		boolean flag;
		boolean flag1;
		if(j != -1)
	//*  83  187:iload_3         
	//*  84  188:iconst_m1       
	//*  85  189:icmpeq          352
		{
			obj2 = ((Object) (TintTypedArray.obtainStyledAttributes(context, j, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//   86  192:aload           15
	//   87  194:iload_3         
	//   88  195:getstatic       #268 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//   89  198:invokestatic    #271 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//   90  201:astore          12
			if(!flag4 && ((TintTypedArray) (obj2)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//*  91  203:iload           8
	//*  92  205:ifne            236
	//*  93  208:aload           12
	//*  94  210:getstatic       #274 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*  95  213:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  96  216:ifeq            236
			{
				flag1 = ((TintTypedArray) (obj2)).getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//   97  219:aload           12
	//   98  221:getstatic       #274 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//   99  224:iconst_0        
	//  100  225:invokevirtual   #278 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  101  228:istore          5
				flag = true;
	//  102  230:iconst_1        
	//  103  231:istore          4
			} else
	//* 104  233:goto            243
			{
				flag = false;
	//  105  236:iconst_0        
	//  106  237:istore          4
				flag1 = flag;
	//  107  239:iload           4
	//  108  241:istore          5
			}
			updateTypefaceAndStyle(context, ((TintTypedArray) (obj2)));
	//  109  243:aload_0         
	//  110  244:aload           15
	//  111  246:aload           12
	//  112  248:invokespecial   #280 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
			if(android.os.Build.VERSION.SDK_INT < 23)
	//* 113  251:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//* 114  254:bipush          23
	//* 115  256:icmpge          337
			{
				if(((TintTypedArray) (obj2)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 116  259:aload           12
	//* 117  261:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 118  264:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//* 119  267:ifeq            283
					obj1 = ((Object) (((TintTypedArray) (obj2)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  120  270:aload           12
	//  121  272:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  122  275:invokevirtual   #287 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  123  278:astore          10
				else
	//* 124  280:goto            286
					obj1 = null;
	//  125  283:aconst_null     
	//  126  284:astore          10
				if(((TintTypedArray) (obj2)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 127  286:aload           12
	//* 128  288:getstatic       #290 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 129  291:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//* 130  294:ifeq            310
					obj = ((Object) (((TintTypedArray) (obj2)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint)));
	//  131  297:aload           12
	//  132  299:getstatic       #290 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  133  302:invokevirtual   #287 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  134  305:astore          9
				else
	//* 135  307:goto            313
					obj = null;
	//  136  310:aconst_null     
	//  137  311:astore          9
				if(((TintTypedArray) (obj2)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
	//* 138  313:aload           12
	//* 139  315:getstatic       #293 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 140  318:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//* 141  321:ifeq            334
					colorstatelist = ((TintTypedArray) (obj2)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink);
	//  142  324:aload           12
	//  143  326:getstatic       #293 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//  144  329:invokevirtual   #287 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  145  332:astore          11
			} else
	//* 146  334:goto            344
			{
				colorstatelist = null;
	//  147  337:aconst_null     
	//  148  338:astore          11
				obj = ((Object) (colorstatelist));
	//  149  340:aload           11
	//  150  342:astore          9
			}
			((TintTypedArray) (obj2)).recycle();
	//  151  344:aload           12
	//  152  346:invokevirtual   #259 <Method void TintTypedArray.recycle()>
		} else
	//* 153  349:goto            370
		{
			flag = false;
	//  154  352:iconst_0        
	//  155  353:istore          4
			flag1 = flag;
	//  156  355:iload           4
	//  157  357:istore          5
			colorstatelist = null;
	//  158  359:aconst_null     
	//  159  360:astore          11
			obj = ((Object) (colorstatelist));
	//  160  362:aload           11
	//  161  364:astore          9
			obj1 = obj2;
	//  162  366:aload           12
	//  163  368:astore          10
		}
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.TextAppearance, i, 0);
	//  164  370:aload           15
	//  165  372:aload_1         
	//  166  373:getstatic       #268 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  167  376:iload_2         
	//  168  377:iconst_0        
	//  169  378:invokestatic    #236 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//  170  381:astore          16
		boolean flag3 = flag;
	//  171  383:iload           4
	//  172  385:istore          7
		boolean flag2 = flag1;
	//  173  387:iload           5
	//  174  389:istore          6
		if(!flag4)
	//* 175  391:iload           8
	//* 176  393:ifne            429
		{
			flag3 = flag;
	//  177  396:iload           4
	//  178  398:istore          7
			flag2 = flag1;
	//  179  400:iload           5
	//  180  402:istore          6
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//* 181  404:aload           16
	//* 182  406:getstatic       #274 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 183  409:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//* 184  412:ifeq            429
			{
				flag2 = tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//  185  415:aload           16
	//  186  417:getstatic       #274 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//  187  420:iconst_0        
	//  188  421:invokevirtual   #278 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  189  424:istore          6
				flag3 = true;
	//  190  426:iconst_1        
	//  191  427:istore          7
			}
		}
		Object obj3 = obj1;
	//  192  429:aload           10
	//  193  431:astore          13
		android.content.res.ColorStateList colorstatelist1 = colorstatelist;
	//  194  433:aload           11
	//  195  435:astore          14
		obj2 = obj;
	//  196  437:aload           9
	//  197  439:astore          12
		if(android.os.Build.VERSION.SDK_INT < 23)
	//* 198  441:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//* 199  444:bipush          23
	//* 200  446:icmpge          532
		{
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 201  449:aload           16
	//* 202  451:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 203  454:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//* 204  457:ifeq            470
				obj1 = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  205  460:aload           16
	//  206  462:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  207  465:invokevirtual   #287 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  208  468:astore          10
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 209  470:aload           16
	//* 210  472:getstatic       #290 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 211  475:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//* 212  478:ifeq            491
				obj = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint)));
	//  213  481:aload           16
	//  214  483:getstatic       #290 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  215  486:invokevirtual   #287 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  216  489:astore          9
			obj3 = obj1;
	//  217  491:aload           10
	//  218  493:astore          13
			colorstatelist1 = colorstatelist;
	//  219  495:aload           11
	//  220  497:astore          14
			obj2 = obj;
	//  221  499:aload           9
	//  222  501:astore          12
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink))
	//* 223  503:aload           16
	//* 224  505:getstatic       #293 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//* 225  508:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//* 226  511:ifeq            532
			{
				colorstatelist1 = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorLink);
	//  227  514:aload           16
	//  228  516:getstatic       #293 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorLink>
	//  229  519:invokevirtual   #287 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  230  522:astore          14
				obj2 = obj;
	//  231  524:aload           9
	//  232  526:astore          12
				obj3 = obj1;
	//  233  528:aload           10
	//  234  530:astore          13
			}
		}
		updateTypefaceAndStyle(context, tinttypedarray);
	//  235  532:aload_0         
	//  236  533:aload           15
	//  237  535:aload           16
	//  238  537:invokespecial   #280 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
		tinttypedarray.recycle();
	//  239  540:aload           16
	//  240  542:invokevirtual   #259 <Method void TintTypedArray.recycle()>
		if(obj3 != null)
	//* 241  545:aload           13
	//* 242  547:ifnull          559
			mView.setTextColor(((android.content.res.ColorStateList) (obj3)));
	//  243  550:aload_0         
	//  244  551:getfield        #40  <Field TextView mView>
	//  245  554:aload           13
	//  246  556:invokevirtual   #297 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
		if(obj2 != null)
	//* 247  559:aload           12
	//* 248  561:ifnull          573
			mView.setHintTextColor(((android.content.res.ColorStateList) (obj2)));
	//  249  564:aload_0         
	//  250  565:getfield        #40  <Field TextView mView>
	//  251  568:aload           12
	//  252  570:invokevirtual   #300 <Method void TextView.setHintTextColor(android.content.res.ColorStateList)>
		if(colorstatelist1 != null)
	//* 253  573:aload           14
	//* 254  575:ifnull          587
			mView.setLinkTextColor(colorstatelist1);
	//  255  578:aload_0         
	//  256  579:getfield        #40  <Field TextView mView>
	//  257  582:aload           14
	//  258  584:invokevirtual   #303 <Method void TextView.setLinkTextColor(android.content.res.ColorStateList)>
		if(!flag4 && flag3)
	//* 259  587:iload           8
	//* 260  589:ifne            603
	//* 261  592:iload           7
	//* 262  594:ifeq            603
			setAllCaps(flag2);
	//  263  597:aload_0         
	//  264  598:iload           6
	//  265  600:invokevirtual   #307 <Method void setAllCaps(boolean)>
		if(mFontTypeface != null)
	//* 266  603:aload_0         
	//* 267  604:getfield        #86  <Field Typeface mFontTypeface>
	//* 268  607:ifnull          625
			mView.setTypeface(mFontTypeface, mStyle);
	//  269  610:aload_0         
	//  270  611:getfield        #40  <Field TextView mView>
	//  271  614:aload_0         
	//  272  615:getfield        #86  <Field Typeface mFontTypeface>
	//  273  618:aload_0         
	//  274  619:getfield        #38  <Field int mStyle>
	//  275  622:invokevirtual   #98  <Method void TextView.setTypeface(Typeface, int)>
		mAutoSizeTextHelper.loadFromAttributes(attributeset, i);
	//  276  625:aload_0         
	//  277  626:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  278  629:aload_1         
	//  279  630:iload_2         
	//  280  631:invokevirtual   #309 <Method void AppCompatTextViewAutoSizeHelper.loadFromAttributes(AttributeSet, int)>
		if(AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && mAutoSizeTextHelper.getAutoSizeTextType() != 0)
	//* 281  634:getstatic       #314 <Field boolean AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE>
	//* 282  637:ifeq            717
	//* 283  640:aload_0         
	//* 284  641:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//* 285  644:invokevirtual   #214 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeTextType()>
	//* 286  647:ifeq            717
		{
			attributeset = ((AttributeSet) (mAutoSizeTextHelper.getAutoSizeTextAvailableSizes()));
	//  287  650:aload_0         
	//  288  651:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  289  654:invokevirtual   #211 <Method int[] AppCompatTextViewAutoSizeHelper.getAutoSizeTextAvailableSizes()>
	//  290  657:astore_1        
			if(attributeset.length > 0)
	//* 291  658:aload_1         
	//* 292  659:arraylength     
	//* 293  660:ifle            717
			{
				if((float)mView.getAutoSizeStepGranularity() != -1F)
	//* 294  663:aload_0         
	//* 295  664:getfield        #40  <Field TextView mView>
	//* 296  667:invokevirtual   #315 <Method int TextView.getAutoSizeStepGranularity()>
	//* 297  670:i2f             
	//* 298  671:ldc2            #316 <Float -1F>
	//* 299  674:fcmpl           
	//* 300  675:ifeq            708
				{
					mView.setAutoSizeTextTypeUniformWithConfiguration(mAutoSizeTextHelper.getAutoSizeMinTextSize(), mAutoSizeTextHelper.getAutoSizeMaxTextSize(), mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
	//  301  678:aload_0         
	//  302  679:getfield        #40  <Field TextView mView>
	//  303  682:aload_0         
	//  304  683:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  305  686:invokevirtual   #205 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMinTextSize()>
	//  306  689:aload_0         
	//  307  690:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  308  693:invokevirtual   #202 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeMaxTextSize()>
	//  309  696:aload_0         
	//  310  697:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//  311  700:invokevirtual   #208 <Method int AppCompatTextViewAutoSizeHelper.getAutoSizeStepGranularity()>
	//  312  703:iconst_0        
	//  313  704:invokevirtual   #320 <Method void TextView.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
					return;
	//  314  707:return          
				}
				mView.setAutoSizeTextTypeUniformWithPresetSizes(((int []) (attributeset)), 0);
	//  315  708:aload_0         
	//  316  709:getfield        #40  <Field TextView mView>
	//  317  712:aload_1         
	//  318  713:iconst_0        
	//  319  714:invokevirtual   #324 <Method void TextView.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
			}
		}
	//  320  717:return          
	}

	void onLayout(boolean flag, int i, int j, int k, int l)
	{
		if(!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE)
	//*   0    0:getstatic       #314 <Field boolean AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifne            10
			autoSizeText();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #327 <Method void autoSizeText()>
	//    4   10:return          
	}

	void onSetTextAppearance(Context context, int i)
	{
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, i, android.support.v7.appcompat.R.styleable.TextAppearance);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #268 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    3    5:invokestatic    #271 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    4    8:astore_3        
		if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//*   5    9:aload_3         
	//*   6   10:getstatic       #274 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*   7   13:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*   8   16:ifeq            31
			setAllCaps(tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
	//    9   19:aload_0         
	//   10   20:aload_3         
	//   11   21:getstatic       #274 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #278 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   14   28:invokevirtual   #307 <Method void setAllCaps(boolean)>
		if(android.os.Build.VERSION.SDK_INT < 23 && tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*  15   31:getstatic       #60  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          23
	//*  17   36:icmpge          72
	//*  18   39:aload_3         
	//*  19   40:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*  20   43:invokevirtual   #128 <Method boolean TintTypedArray.hasValue(int)>
	//*  21   46:ifeq            72
		{
			android.content.res.ColorStateList colorstatelist = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   22   49:aload_3         
	//   23   50:getstatic       #283 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   24   53:invokevirtual   #287 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//   25   56:astore          4
			if(colorstatelist != null)
	//*  26   58:aload           4
	//*  27   60:ifnull          72
				mView.setTextColor(colorstatelist);
	//   28   63:aload_0         
	//   29   64:getfield        #40  <Field TextView mView>
	//   30   67:aload           4
	//   31   69:invokevirtual   #297 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
		}
		updateTypefaceAndStyle(context, tinttypedarray);
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:aload_3         
	//   35   75:invokespecial   #280 <Method void updateTypefaceAndStyle(Context, TintTypedArray)>
		tinttypedarray.recycle();
	//   36   78:aload_3         
	//   37   79:invokevirtual   #259 <Method void TintTypedArray.recycle()>
		if(mFontTypeface != null)
	//*  38   82:aload_0         
	//*  39   83:getfield        #86  <Field Typeface mFontTypeface>
	//*  40   86:ifnull          104
			mView.setTypeface(mFontTypeface, mStyle);
	//   41   89:aload_0         
	//   42   90:getfield        #40  <Field TextView mView>
	//   43   93:aload_0         
	//   44   94:getfield        #86  <Field Typeface mFontTypeface>
	//   45   97:aload_0         
	//   46   98:getfield        #38  <Field int mStyle>
	//   47  101:invokevirtual   #98  <Method void TextView.setTypeface(Typeface, int)>
	//   48  104:return          
	}

	void setAllCaps(boolean flag)
	{
		mView.setAllCaps(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field TextView mView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #330 <Method void TextView.setAllCaps(boolean)>
	//    4    8:return          
	}

	void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int l)
		throws IllegalArgumentException
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #333 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
	//    7   12:return          
	}

	void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
		throws IllegalArgumentException
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #335 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
	//    5    9:return          
	}

	void setAutoSizeTextTypeWithDefaults(int i)
	{
		mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #340 <Method void AppCompatTextViewAutoSizeHelper.setAutoSizeTextTypeWithDefaults(int)>
	//    4    8:return          
	}

	void setTextSize(int i, float f)
	{
		if(!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && !isAutoSizeEnabled())
	//*   0    0:getstatic       #314 <Field boolean AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE>
	//*   1    3:ifne            19
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #342 <Method boolean isAutoSizeEnabled()>
	//*   4   10:ifne            19
			setTextSizeInternal(i, f);
	//    5   13:aload_0         
	//    6   14:iload_1         
	//    7   15:fload_2         
	//    8   16:invokespecial   #343 <Method void setTextSizeInternal(int, float)>
	//    9   19:return          
	}

	private static final int MONOSPACE = 3;
	private static final int SANS = 1;
	private static final int SERIF = 2;
	private boolean mAsyncFontPending;
	private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
	private TintInfo mDrawableBottomTint;
	private TintInfo mDrawableLeftTint;
	private TintInfo mDrawableRightTint;
	private TintInfo mDrawableTopTint;
	private Typeface mFontTypeface;
	private int mStyle;
	final TextView mView;


/*
	static void access$000(AppCompatTextHelper appcompattexthelper, WeakReference weakreference, Typeface typeface)
	{
		appcompattexthelper.onAsyncTypefaceReceived(weakreference, typeface);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #53  <Method void onAsyncTypefaceReceived(WeakReference, Typeface)>
		return;
	//    4    6:return          
	}

*/
}
