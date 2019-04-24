// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.text.AllCapsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			AppCompatTextHelperV17, AppCompatDrawableManager, TintInfo, TintTypedArray

class AppCompatTextHelper
{

	AppCompatTextHelper(TextView textview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mView = textview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field TextView mView>
	//    5    9:return          
	}

	static AppCompatTextHelper create(TextView textview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          17
			return ((AppCompatTextHelper) (new AppCompatTextHelperV17(textview)));
	//    3    8:new             #32  <Class AppCompatTextHelperV17>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #34  <Method void AppCompatTextHelperV17(TextView)>
	//    7   16:areturn         
		else
			return new AppCompatTextHelper(textview);
	//    8   17:new             #2   <Class AppCompatTextHelper>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokespecial   #35  <Method void AppCompatTextHelper(TextView)>
	//   12   25:areturn         
	}

	protected static TintInfo createTintInfo(Context context, AppCompatDrawableManager appcompatdrawablemanager, int i)
	{
		context = ((Context) (appcompatdrawablemanager.getTintList(context, i)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #43  <Method android.content.res.ColorStateList AppCompatDrawableManager.getTintList(Context, int)>
	//    4    6:astore_0        
		if(context != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          31
		{
			appcompatdrawablemanager = ((AppCompatDrawableManager) (new TintInfo()));
	//    7   11:new             #45  <Class TintInfo>
	//    8   14:dup             
	//    9   15:invokespecial   #46  <Method void TintInfo()>
	//   10   18:astore_1        
			appcompatdrawablemanager.mHasTintList = true;
	//   11   19:aload_1         
	//   12   20:iconst_1        
	//   13   21:putfield        #50  <Field boolean TintInfo.mHasTintList>
			appcompatdrawablemanager.mTintList = ((android.content.res.ColorStateList) (context));
	//   14   24:aload_1         
	//   15   25:aload_0         
	//   16   26:putfield        #54  <Field android.content.res.ColorStateList TintInfo.mTintList>
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
	//    7   11:getfield        #21  <Field TextView mView>
	//    8   14:invokevirtual   #62  <Method int[] TextView.getDrawableState()>
	//    9   17:invokestatic    #66  <Method void AppCompatDrawableManager.tintDrawable(Drawable, TintInfo, int[])>
	//   10   20:return          
	}

	void applyCompoundDrawablesTints()
	{
		if(mDrawableLeftTint != null || mDrawableTopTint != null || mDrawableRightTint != null || mDrawableBottomTint != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field TintInfo mDrawableLeftTint>
	//*   2    4:ifnonnull       28
	//*   3    7:aload_0         
	//*   4    8:getfield        #71  <Field TintInfo mDrawableTopTint>
	//*   5   11:ifnonnull       28
	//*   6   14:aload_0         
	//*   7   15:getfield        #73  <Field TintInfo mDrawableRightTint>
	//*   8   18:ifnonnull       28
	//*   9   21:aload_0         
	//*  10   22:getfield        #75  <Field TintInfo mDrawableBottomTint>
	//*  11   25:ifnull          80
		{
			Drawable adrawable[] = mView.getCompoundDrawables();
	//   12   28:aload_0         
	//   13   29:getfield        #21  <Field TextView mView>
	//   14   32:invokevirtual   #79  <Method Drawable[] TextView.getCompoundDrawables()>
	//   15   35:astore_1        
			applyCompoundDrawableTint(adrawable[0], mDrawableLeftTint);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:iconst_0        
	//   19   39:aaload          
	//   20   40:aload_0         
	//   21   41:getfield        #69  <Field TintInfo mDrawableLeftTint>
	//   22   44:invokevirtual   #81  <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[1], mDrawableTopTint);
	//   23   47:aload_0         
	//   24   48:aload_1         
	//   25   49:iconst_1        
	//   26   50:aaload          
	//   27   51:aload_0         
	//   28   52:getfield        #71  <Field TintInfo mDrawableTopTint>
	//   29   55:invokevirtual   #81  <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[2], mDrawableRightTint);
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:iconst_2        
	//   33   61:aaload          
	//   34   62:aload_0         
	//   35   63:getfield        #73  <Field TintInfo mDrawableRightTint>
	//   36   66:invokevirtual   #81  <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
			applyCompoundDrawableTint(adrawable[3], mDrawableBottomTint);
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:iconst_3        
	//   40   72:aaload          
	//   41   73:aload_0         
	//   42   74:getfield        #75  <Field TintInfo mDrawableBottomTint>
	//   43   77:invokevirtual   #81  <Method void applyCompoundDrawableTint(Drawable, TintInfo)>
		}
	//   44   80:return          
	}

	void loadFromAttributes(AttributeSet attributeset, int i)
	{
		Context context = mView.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field TextView mView>
	//    2    4:invokevirtual   #87  <Method Context TextView.getContext()>
	//    3    7:astore          14
		Object obj = ((Object) (AppCompatDrawableManager.get()));
	//    4    9:invokestatic    #91  <Method AppCompatDrawableManager AppCompatDrawableManager.get()>
	//    5   12:astore          9
		Object obj1 = ((Object) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.AppCompatTextHelper, i, 0)));
	//    6   14:aload           14
	//    7   16:aload_1         
	//    8   17:getstatic       #97  <Field int[] android.support.v7.appcompat.R$styleable.AppCompatTextHelper>
	//    9   20:iload_2         
	//   10   21:iconst_0        
	//   11   22:invokestatic    #103 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   12   25:astore          10
		int j = ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance, -1);
	//   13   27:aload           10
	//   14   29:getstatic       #106 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_textAppearance>
	//   15   32:iconst_m1       
	//   16   33:invokevirtual   #110 <Method int TintTypedArray.getResourceId(int, int)>
	//   17   36:istore          5
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft))
	//*  18   38:aload           10
	//*  19   40:getstatic       #113 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//*  20   43:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//*  21   46:ifeq            69
			mDrawableLeftTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
	//   22   49:aload_0         
	//   23   50:aload           14
	//   24   52:aload           9
	//   25   54:aload           10
	//   26   56:getstatic       #113 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableLeft>
	//   27   59:iconst_0        
	//   28   60:invokevirtual   #110 <Method int TintTypedArray.getResourceId(int, int)>
	//   29   63:invokestatic    #119 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   30   66:putfield        #69  <Field TintInfo mDrawableLeftTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop))
	//*  31   69:aload           10
	//*  32   71:getstatic       #122 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//*  33   74:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//*  34   77:ifeq            100
			mDrawableTopTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop, 0));
	//   35   80:aload_0         
	//   36   81:aload           14
	//   37   83:aload           9
	//   38   85:aload           10
	//   39   87:getstatic       #122 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableTop>
	//   40   90:iconst_0        
	//   41   91:invokevirtual   #110 <Method int TintTypedArray.getResourceId(int, int)>
	//   42   94:invokestatic    #119 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   43   97:putfield        #71  <Field TintInfo mDrawableTopTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight))
	//*  44  100:aload           10
	//*  45  102:getstatic       #125 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//*  46  105:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//*  47  108:ifeq            131
			mDrawableRightTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight, 0));
	//   48  111:aload_0         
	//   49  112:aload           14
	//   50  114:aload           9
	//   51  116:aload           10
	//   52  118:getstatic       #125 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableRight>
	//   53  121:iconst_0        
	//   54  122:invokevirtual   #110 <Method int TintTypedArray.getResourceId(int, int)>
	//   55  125:invokestatic    #119 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   56  128:putfield        #73  <Field TintInfo mDrawableRightTint>
		if(((TintTypedArray) (obj1)).hasValue(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom))
	//*  57  131:aload           10
	//*  58  133:getstatic       #128 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//*  59  136:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//*  60  139:ifeq            162
			mDrawableBottomTint = createTintInfo(context, ((AppCompatDrawableManager) (obj)), ((TintTypedArray) (obj1)).getResourceId(android.support.v7.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
	//   61  142:aload_0         
	//   62  143:aload           14
	//   63  145:aload           9
	//   64  147:aload           10
	//   65  149:getstatic       #128 <Field int android.support.v7.appcompat.R$styleable.AppCompatTextHelper_android_drawableBottom>
	//   66  152:iconst_0        
	//   67  153:invokevirtual   #110 <Method int TintTypedArray.getResourceId(int, int)>
	//   68  156:invokestatic    #119 <Method TintInfo createTintInfo(Context, AppCompatDrawableManager, int)>
	//   69  159:putfield        #75  <Field TintInfo mDrawableBottomTint>
		((TintTypedArray) (obj1)).recycle();
	//   70  162:aload           10
	//   71  164:invokevirtual   #131 <Method void TintTypedArray.recycle()>
		boolean flag4 = mView.getTransformationMethod() instanceof PasswordTransformationMethod;
	//   72  167:aload_0         
	//   73  168:getfield        #21  <Field TextView mView>
	//   74  171:invokevirtual   #135 <Method android.text.method.TransformationMethod TextView.getTransformationMethod()>
	//   75  174:instanceof      #137 <Class PasswordTransformationMethod>
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
		android.content.res.ColorStateList colorstatelist = null;
	//   85  190:aconst_null     
	//   86  191:astore          11
		obj = null;
	//   87  193:aconst_null     
	//   88  194:astore          9
		Object obj2 = null;
	//   89  196:aconst_null     
	//   90  197:astore          13
		obj1 = null;
	//   91  199:aconst_null     
	//   92  200:astore          10
		TintTypedArray tinttypedarray = null;
	//   93  202:aconst_null     
	//   94  203:astore          12
		if(j != -1)
	//*  95  205:iload           5
	//*  96  207:iconst_m1       
	//*  97  208:icmpeq          349
		{
			TintTypedArray tinttypedarray1 = TintTypedArray.obtainStyledAttributes(context, j, android.support.v7.appcompat.R.styleable.TextAppearance);
	//   98  211:aload           14
	//   99  213:iload           5
	//  100  215:getstatic       #140 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  101  218:invokestatic    #143 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//  102  221:astore          15
			flag2 = flag3;
	//  103  223:iload           7
	//  104  225:istore          6
			flag = flag1;
	//  105  227:iload           4
	//  106  229:istore_3        
			if(!flag4)
	//* 107  230:iload           8
	//* 108  232:ifne            266
			{
				flag2 = flag3;
	//  109  235:iload           7
	//  110  237:istore          6
				flag = flag1;
	//  111  239:iload           4
	//  112  241:istore_3        
				if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//* 113  242:aload           15
	//* 114  244:getstatic       #146 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 115  247:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//* 116  250:ifeq            266
				{
					flag = true;
	//  117  253:iconst_1        
	//  118  254:istore_3        
					flag2 = tinttypedarray1.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//  119  255:aload           15
	//  120  257:getstatic       #146 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//  121  260:iconst_0        
	//  122  261:invokevirtual   #150 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  123  264:istore          6
				}
			}
			obj = ((Object) (colorstatelist));
	//  124  266:aload           11
	//  125  268:astore          9
			colorstatelist = ((android.content.res.ColorStateList) (tinttypedarray));
	//  126  270:aload           12
	//  127  272:astore          11
			if(android.os.Build.VERSION.SDK_INT < 23)
	//* 128  274:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//* 129  277:bipush          23
	//* 130  279:icmpge          340
			{
				obj1 = ((Object) (obj2));
	//  131  282:aload           13
	//  132  284:astore          10
				if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 133  286:aload           15
	//* 134  288:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 135  291:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//* 136  294:ifeq            307
					obj1 = ((Object) (tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  137  297:aload           15
	//  138  299:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  139  302:invokevirtual   #157 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  140  305:astore          10
				obj = obj1;
	//  141  307:aload           10
	//  142  309:astore          9
				colorstatelist = ((android.content.res.ColorStateList) (tinttypedarray));
	//  143  311:aload           12
	//  144  313:astore          11
				if(tinttypedarray1.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 145  315:aload           15
	//* 146  317:getstatic       #160 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 147  320:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//* 148  323:ifeq            340
				{
					colorstatelist = tinttypedarray1.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint);
	//  149  326:aload           15
	//  150  328:getstatic       #160 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  151  331:invokevirtual   #157 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  152  334:astore          11
					obj = obj1;
	//  153  336:aload           10
	//  154  338:astore          9
				}
			}
			tinttypedarray1.recycle();
	//  155  340:aload           15
	//  156  342:invokevirtual   #131 <Method void TintTypedArray.recycle()>
			obj1 = ((Object) (colorstatelist));
	//  157  345:aload           11
	//  158  347:astore          10
		}
		tinttypedarray = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.TextAppearance, i, 0);
	//  159  349:aload           14
	//  160  351:aload_1         
	//  161  352:getstatic       #140 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//  162  355:iload_2         
	//  163  356:iconst_0        
	//  164  357:invokestatic    #103 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//  165  360:astore          12
		flag3 = flag2;
	//  166  362:iload           6
	//  167  364:istore          7
		i = ((int) (flag));
	//  168  366:iload_3         
	//  169  367:istore_2        
		if(!flag4)
	//* 170  368:iload           8
	//* 171  370:ifne            403
		{
			flag3 = flag2;
	//  172  373:iload           6
	//  173  375:istore          7
			i = ((int) (flag));
	//  174  377:iload_3         
	//  175  378:istore_2        
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//* 176  379:aload           12
	//* 177  381:getstatic       #146 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//* 178  384:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//* 179  387:ifeq            403
			{
				i = 1;
	//  180  390:iconst_1        
	//  181  391:istore_2        
				flag3 = tinttypedarray.getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false);
	//  182  392:aload           12
	//  183  394:getstatic       #146 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//  184  397:iconst_0        
	//  185  398:invokevirtual   #150 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  186  401:istore          7
			}
		}
		attributeset = ((AttributeSet) (obj));
	//  187  403:aload           9
	//  188  405:astore_1        
		colorstatelist = ((android.content.res.ColorStateList) (obj1));
	//  189  406:aload           10
	//  190  408:astore          11
		if(android.os.Build.VERSION.SDK_INT < 23)
	//* 191  410:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//* 192  413:bipush          23
	//* 193  415:icmpge          470
		{
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//* 194  418:aload           12
	//* 195  420:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//* 196  423:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//* 197  426:ifeq            439
				obj = ((Object) (tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor)));
	//  198  429:aload           12
	//  199  431:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//  200  434:invokevirtual   #157 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  201  437:astore          9
			attributeset = ((AttributeSet) (obj));
	//  202  439:aload           9
	//  203  441:astore_1        
			colorstatelist = ((android.content.res.ColorStateList) (obj1));
	//  204  442:aload           10
	//  205  444:astore          11
			if(tinttypedarray.hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint))
	//* 206  446:aload           12
	//* 207  448:getstatic       #160 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//* 208  451:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//* 209  454:ifeq            470
			{
				colorstatelist = tinttypedarray.getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColorHint);
	//  210  457:aload           12
	//  211  459:getstatic       #160 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColorHint>
	//  212  462:invokevirtual   #157 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//  213  465:astore          11
				attributeset = ((AttributeSet) (obj));
	//  214  467:aload           9
	//  215  469:astore_1        
			}
		}
		tinttypedarray.recycle();
	//  216  470:aload           12
	//  217  472:invokevirtual   #131 <Method void TintTypedArray.recycle()>
		if(attributeset != null)
	//* 218  475:aload_1         
	//* 219  476:ifnull          487
			mView.setTextColor(((android.content.res.ColorStateList) (attributeset)));
	//  220  479:aload_0         
	//  221  480:getfield        #21  <Field TextView mView>
	//  222  483:aload_1         
	//  223  484:invokevirtual   #164 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
		if(colorstatelist != null)
	//* 224  487:aload           11
	//* 225  489:ifnull          501
			mView.setHintTextColor(colorstatelist);
	//  226  492:aload_0         
	//  227  493:getfield        #21  <Field TextView mView>
	//  228  496:aload           11
	//  229  498:invokevirtual   #167 <Method void TextView.setHintTextColor(android.content.res.ColorStateList)>
		if(!flag4 && i != 0)
	//* 230  501:iload           8
	//* 231  503:ifne            516
	//* 232  506:iload_2         
	//* 233  507:ifeq            516
			setAllCaps(flag3);
	//  234  510:aload_0         
	//  235  511:iload           7
	//  236  513:invokevirtual   #171 <Method void setAllCaps(boolean)>
	//  237  516:return          
	}

	void onSetTextAppearance(Context context, int i)
	{
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, i, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #140 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    3    5:invokestatic    #143 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    4    8:astore_1        
		if(((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps))
	//*   5    9:aload_1         
	//*   6   10:getstatic       #146 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*   7   13:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//*   8   16:ifeq            31
			setAllCaps(((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:getstatic       #146 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #150 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   14   28:invokevirtual   #171 <Method void setAllCaps(boolean)>
		if(android.os.Build.VERSION.SDK_INT < 23 && ((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor))
	//*  15   31:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*  16   34:bipush          23
	//*  17   36:icmpge          69
	//*  18   39:aload_1         
	//*  19   40:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//*  20   43:invokevirtual   #117 <Method boolean TintTypedArray.hasValue(int)>
	//*  21   46:ifeq            69
		{
			android.content.res.ColorStateList colorstatelist = ((TintTypedArray) (context)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//   22   49:aload_1         
	//   23   50:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//   24   53:invokevirtual   #157 <Method android.content.res.ColorStateList TintTypedArray.getColorStateList(int)>
	//   25   56:astore_3        
			if(colorstatelist != null)
	//*  26   57:aload_3         
	//*  27   58:ifnull          69
				mView.setTextColor(colorstatelist);
	//   28   61:aload_0         
	//   29   62:getfield        #21  <Field TextView mView>
	//   30   65:aload_3         
	//   31   66:invokevirtual   #164 <Method void TextView.setTextColor(android.content.res.ColorStateList)>
		}
		((TintTypedArray) (context)).recycle();
	//   32   69:aload_1         
	//   33   70:invokevirtual   #131 <Method void TintTypedArray.recycle()>
	//   34   73:return          
	}

	void setAllCaps(boolean flag)
	{
		TextView textview = mView;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field TextView mView>
	//    2    4:astore_3        
		AllCapsTransformationMethod allcapstransformationmethod;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            27
			allcapstransformationmethod = new AllCapsTransformationMethod(mView.getContext());
	//    5    9:new             #175 <Class AllCapsTransformationMethod>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field TextView mView>
	//    9   17:invokevirtual   #87  <Method Context TextView.getContext()>
	//   10   20:invokespecial   #178 <Method void AllCapsTransformationMethod(Context)>
	//   11   23:astore_2        
		else
	//*  12   24:goto            29
			allcapstransformationmethod = null;
	//   13   27:aconst_null     
	//   14   28:astore_2        
		textview.setTransformationMethod(((android.text.method.TransformationMethod) (allcapstransformationmethod)));
	//   15   29:aload_3         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #182 <Method void TextView.setTransformationMethod(android.text.method.TransformationMethod)>
	//   18   34:return          
	}

	private TintInfo mDrawableBottomTint;
	private TintInfo mDrawableLeftTint;
	private TintInfo mDrawableRightTint;
	private TintInfo mDrawableTopTint;
	final TextView mView;
}
