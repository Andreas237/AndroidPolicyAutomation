// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.text.AllCapsTransformationMethod;
import android.text.*;
import android.text.method.TransformationMethod;
import android.util.*;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray, DrawableUtils, ViewUtils

public class SwitchCompat extends CompoundButton
{

	public SwitchCompat(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #101 <Method void SwitchCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwitchCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.switchStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #106 <Field int android.support.v7.appcompat.R$attr.switchStyle>
	//    4    6:invokespecial   #109 <Method void SwitchCompat(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SwitchCompat(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #110 <Method void CompoundButton(Context, AttributeSet, int)>
		mThumbTintList = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #112 <Field ColorStateList mThumbTintList>
		mThumbTintMode = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #114 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
		mHasThumbTint = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #116 <Field boolean mHasThumbTint>
		mHasThumbTintMode = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #118 <Field boolean mHasThumbTintMode>
		mTrackTintList = null;
	//   17   27:aload_0         
	//   18   28:aconst_null     
	//   19   29:putfield        #120 <Field ColorStateList mTrackTintList>
		mTrackTintMode = null;
	//   20   32:aload_0         
	//   21   33:aconst_null     
	//   22   34:putfield        #122 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
		mHasTrackTint = false;
	//   23   37:aload_0         
	//   24   38:iconst_0        
	//   25   39:putfield        #124 <Field boolean mHasTrackTint>
		mHasTrackTintMode = false;
	//   26   42:aload_0         
	//   27   43:iconst_0        
	//   28   44:putfield        #126 <Field boolean mHasTrackTintMode>
		mVelocityTracker = VelocityTracker.obtain();
	//   29   47:aload_0         
	//   30   48:invokestatic    #132 <Method VelocityTracker VelocityTracker.obtain()>
	//   31   51:putfield        #134 <Field VelocityTracker mVelocityTracker>
		mTempRect = new Rect();
	//   32   54:aload_0         
	//   33   55:new             #136 <Class Rect>
	//   34   58:dup             
	//   35   59:invokespecial   #138 <Method void Rect()>
	//   36   62:putfield        #140 <Field Rect mTempRect>
		mTextPaint = new TextPaint(1);
	//   37   65:aload_0         
	//   38   66:new             #142 <Class TextPaint>
	//   39   69:dup             
	//   40   70:iconst_1        
	//   41   71:invokespecial   #145 <Method void TextPaint(int)>
	//   42   74:putfield        #147 <Field TextPaint mTextPaint>
		Object obj = ((Object) (getResources()));
	//   43   77:aload_0         
	//   44   78:invokevirtual   #151 <Method Resources getResources()>
	//   45   81:astore          4
		mTextPaint.density = ((Resources) (obj)).getDisplayMetrics().density;
	//   46   83:aload_0         
	//   47   84:getfield        #147 <Field TextPaint mTextPaint>
	//   48   87:aload           4
	//   49   89:invokevirtual   #157 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   50   92:getfield        #162 <Field float DisplayMetrics.density>
	//   51   95:putfield        #163 <Field float TextPaint.density>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.SwitchCompat, i, 0)));
	//   52   98:aload_1         
	//   53   99:aload_2         
	//   54  100:getstatic       #168 <Field int[] android.support.v7.appcompat.R$styleable.SwitchCompat>
	//   55  103:iload_3         
	//   56  104:iconst_0        
	//   57  105:invokestatic    #174 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   58  108:astore_2        
		mThumbDrawable = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_android_thumb);
	//   59  109:aload_0         
	//   60  110:aload_2         
	//   61  111:getstatic       #177 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_thumb>
	//   62  114:invokevirtual   #181 <Method Drawable TintTypedArray.getDrawable(int)>
	//   63  117:putfield        #183 <Field Drawable mThumbDrawable>
		if(mThumbDrawable != null)
	//*  64  120:aload_0         
	//*  65  121:getfield        #183 <Field Drawable mThumbDrawable>
	//*  66  124:ifnull          135
			mThumbDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   67  127:aload_0         
	//   68  128:getfield        #183 <Field Drawable mThumbDrawable>
	//   69  131:aload_0         
	//   70  132:invokevirtual   #189 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTrackDrawable = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_track);
	//   71  135:aload_0         
	//   72  136:aload_2         
	//   73  137:getstatic       #192 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_track>
	//   74  140:invokevirtual   #181 <Method Drawable TintTypedArray.getDrawable(int)>
	//   75  143:putfield        #194 <Field Drawable mTrackDrawable>
		if(mTrackDrawable != null)
	//*  76  146:aload_0         
	//*  77  147:getfield        #194 <Field Drawable mTrackDrawable>
	//*  78  150:ifnull          161
			mTrackDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   79  153:aload_0         
	//   80  154:getfield        #194 <Field Drawable mTrackDrawable>
	//   81  157:aload_0         
	//   82  158:invokevirtual   #189 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTextOn = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOn);
	//   83  161:aload_0         
	//   84  162:aload_2         
	//   85  163:getstatic       #197 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_textOn>
	//   86  166:invokevirtual   #201 <Method CharSequence TintTypedArray.getText(int)>
	//   87  169:putfield        #203 <Field CharSequence mTextOn>
		mTextOff = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOff);
	//   88  172:aload_0         
	//   89  173:aload_2         
	//   90  174:getstatic       #206 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_textOff>
	//   91  177:invokevirtual   #201 <Method CharSequence TintTypedArray.getText(int)>
	//   92  180:putfield        #208 <Field CharSequence mTextOff>
		mShowText = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_showText, true);
	//   93  183:aload_0         
	//   94  184:aload_2         
	//   95  185:getstatic       #211 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_showText>
	//   96  188:iconst_1        
	//   97  189:invokevirtual   #215 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   98  192:putfield        #217 <Field boolean mShowText>
		mThumbTextPadding = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
	//   99  195:aload_0         
	//  100  196:aload_2         
	//  101  197:getstatic       #220 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTextPadding>
	//  102  200:iconst_0        
	//  103  201:invokevirtual   #224 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  104  204:putfield        #226 <Field int mThumbTextPadding>
		mSwitchMinWidth = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
	//  105  207:aload_0         
	//  106  208:aload_2         
	//  107  209:getstatic       #229 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchMinWidth>
	//  108  212:iconst_0        
	//  109  213:invokevirtual   #224 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  110  216:putfield        #231 <Field int mSwitchMinWidth>
		mSwitchPadding = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
	//  111  219:aload_0         
	//  112  220:aload_2         
	//  113  221:getstatic       #234 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchPadding>
	//  114  224:iconst_0        
	//  115  225:invokevirtual   #224 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  116  228:putfield        #236 <Field int mSwitchPadding>
		mSplitTrack = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_splitTrack, false);
	//  117  231:aload_0         
	//  118  232:aload_2         
	//  119  233:getstatic       #239 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_splitTrack>
	//  120  236:iconst_0        
	//  121  237:invokevirtual   #215 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  122  240:putfield        #241 <Field boolean mSplitTrack>
		obj = ((Object) (((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTint)));
	//  123  243:aload_2         
	//  124  244:getstatic       #244 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTint>
	//  125  247:invokevirtual   #248 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  126  250:astore          4
		if(obj != null)
	//* 127  252:aload           4
	//* 128  254:ifnull          268
		{
			mThumbTintList = ((ColorStateList) (obj));
	//  129  257:aload_0         
	//  130  258:aload           4
	//  131  260:putfield        #112 <Field ColorStateList mThumbTintList>
			mHasThumbTint = true;
	//  132  263:aload_0         
	//  133  264:iconst_1        
	//  134  265:putfield        #116 <Field boolean mHasThumbTint>
		}
		obj = ((Object) (DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  135  268:aload_2         
	//  136  269:getstatic       #251 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTintMode>
	//  137  272:iconst_m1       
	//  138  273:invokevirtual   #254 <Method int TintTypedArray.getInt(int, int)>
	//  139  276:aconst_null     
	//  140  277:invokestatic    #260 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  141  280:astore          4
		if(mThumbTintMode != obj)
	//* 142  282:aload_0         
	//* 143  283:getfield        #114 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//* 144  286:aload           4
	//* 145  288:if_acmpeq       302
		{
			mThumbTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//  146  291:aload_0         
	//  147  292:aload           4
	//  148  294:putfield        #114 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
			mHasThumbTintMode = true;
	//  149  297:aload_0         
	//  150  298:iconst_1        
	//  151  299:putfield        #118 <Field boolean mHasThumbTintMode>
		}
		if(mHasThumbTint || mHasThumbTintMode)
	//* 152  302:aload_0         
	//* 153  303:getfield        #116 <Field boolean mHasThumbTint>
	//* 154  306:ifne            316
	//* 155  309:aload_0         
	//* 156  310:getfield        #118 <Field boolean mHasThumbTintMode>
	//* 157  313:ifeq            320
			applyThumbTint();
	//  158  316:aload_0         
	//  159  317:invokespecial   #263 <Method void applyThumbTint()>
		obj = ((Object) (((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.SwitchCompat_trackTint)));
	//  160  320:aload_2         
	//  161  321:getstatic       #266 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_trackTint>
	//  162  324:invokevirtual   #248 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  163  327:astore          4
		if(obj != null)
	//* 164  329:aload           4
	//* 165  331:ifnull          345
		{
			mTrackTintList = ((ColorStateList) (obj));
	//  166  334:aload_0         
	//  167  335:aload           4
	//  168  337:putfield        #120 <Field ColorStateList mTrackTintList>
			mHasTrackTint = true;
	//  169  340:aload_0         
	//  170  341:iconst_1        
	//  171  342:putfield        #124 <Field boolean mHasTrackTint>
		}
		obj = ((Object) (DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SwitchCompat_trackTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  172  345:aload_2         
	//  173  346:getstatic       #269 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_trackTintMode>
	//  174  349:iconst_m1       
	//  175  350:invokevirtual   #254 <Method int TintTypedArray.getInt(int, int)>
	//  176  353:aconst_null     
	//  177  354:invokestatic    #260 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  178  357:astore          4
		if(mTrackTintMode != obj)
	//* 179  359:aload_0         
	//* 180  360:getfield        #122 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//* 181  363:aload           4
	//* 182  365:if_acmpeq       379
		{
			mTrackTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//  183  368:aload_0         
	//  184  369:aload           4
	//  185  371:putfield        #122 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
			mHasTrackTintMode = true;
	//  186  374:aload_0         
	//  187  375:iconst_1        
	//  188  376:putfield        #126 <Field boolean mHasTrackTintMode>
		}
		if(mHasTrackTint || mHasTrackTintMode)
	//* 189  379:aload_0         
	//* 190  380:getfield        #124 <Field boolean mHasTrackTint>
	//* 191  383:ifne            393
	//* 192  386:aload_0         
	//* 193  387:getfield        #126 <Field boolean mHasTrackTintMode>
	//* 194  390:ifeq            397
			applyTrackTint();
	//  195  393:aload_0         
	//  196  394:invokespecial   #272 <Method void applyTrackTint()>
		i = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
	//  197  397:aload_2         
	//  198  398:getstatic       #275 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchTextAppearance>
	//  199  401:iconst_0        
	//  200  402:invokevirtual   #278 <Method int TintTypedArray.getResourceId(int, int)>
	//  201  405:istore_3        
		if(i != 0)
	//* 202  406:iload_3         
	//* 203  407:ifeq            416
			setSwitchTextAppearance(context, i);
	//  204  410:aload_0         
	//  205  411:aload_1         
	//  206  412:iload_3         
	//  207  413:invokevirtual   #282 <Method void setSwitchTextAppearance(Context, int)>
		((TintTypedArray) (attributeset)).recycle();
	//  208  416:aload_2         
	//  209  417:invokevirtual   #285 <Method void TintTypedArray.recycle()>
		context = ((Context) (ViewConfiguration.get(context)));
	//  210  420:aload_1         
	//  211  421:invokestatic    #291 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//  212  424:astore_1        
		mTouchSlop = ((ViewConfiguration) (context)).getScaledTouchSlop();
	//  213  425:aload_0         
	//  214  426:aload_1         
	//  215  427:invokevirtual   #295 <Method int ViewConfiguration.getScaledTouchSlop()>
	//  216  430:putfield        #297 <Field int mTouchSlop>
		mMinFlingVelocity = ((ViewConfiguration) (context)).getScaledMinimumFlingVelocity();
	//  217  433:aload_0         
	//  218  434:aload_1         
	//  219  435:invokevirtual   #300 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//  220  438:putfield        #302 <Field int mMinFlingVelocity>
		refreshDrawableState();
	//  221  441:aload_0         
	//  222  442:invokevirtual   #305 <Method void refreshDrawableState()>
		setChecked(isChecked());
	//  223  445:aload_0         
	//  224  446:aload_0         
	//  225  447:invokevirtual   #309 <Method boolean isChecked()>
	//  226  450:invokevirtual   #313 <Method void setChecked(boolean)>
	//  227  453:return          
	}

	private void animateThumbToCheckedState(boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            59
			f = 1.0F;
	//    2    4:fconst_1        
	//    3    5:fstore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:aload_0         
	//*   6    8:getstatic       #93  <Field Property THUMB_POS>
	//*   7   11:iconst_1        
	//*   8   12:newarray        float[]
	//*   9   14:dup             
	//*  10   15:iconst_0        
	//*  11   16:fload_2         
	//*  12   17:fastore         
	//*  13   18:invokestatic    #324 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//*  14   21:putfield        #326 <Field ObjectAnimator mPositionAnimator>
	//*  15   24:aload_0         
	//*  16   25:getfield        #326 <Field ObjectAnimator mPositionAnimator>
	//*  17   28:ldc2w           #327 <Long 250L>
	//*  18   31:invokevirtual   #332 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//*  19   34:pop             
	//*  20   35:getstatic       #337 <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   38:bipush          18
	//*  22   40:icmplt          51
	//*  23   43:aload_0         
	//*  24   44:getfield        #326 <Field ObjectAnimator mPositionAnimator>
	//*  25   47:iconst_1        
	//*  26   48:invokevirtual   #340 <Method void ObjectAnimator.setAutoCancel(boolean)>
	//*  27   51:aload_0         
	//*  28   52:getfield        #326 <Field ObjectAnimator mPositionAnimator>
	//*  29   55:invokevirtual   #343 <Method void ObjectAnimator.start()>
	//*  30   58:return          
			f = 0.0F;
	//   31   59:fconst_0        
	//   32   60:fstore_2        
		mPositionAnimator = ObjectAnimator.ofFloat(((Object) (this)), THUMB_POS, new float[] {
			f
		});
		mPositionAnimator.setDuration(250L);
		if(android.os.Build.VERSION.SDK_INT >= 18)
			mPositionAnimator.setAutoCancel(true);
		mPositionAnimator.start();
	//*  33   61:goto            6
	}

	private void applyThumbTint()
	{
		if(mThumbDrawable != null && (mHasThumbTint || mHasThumbTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field Drawable mThumbDrawable>
	//*   2    4:ifnull          90
	//*   3    7:aload_0         
	//*   4    8:getfield        #116 <Field boolean mHasThumbTint>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #118 <Field boolean mHasThumbTintMode>
	//*   8   18:ifeq            90
		{
			mThumbDrawable = mThumbDrawable.mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #183 <Field Drawable mThumbDrawable>
	//   12   26:invokevirtual   #347 <Method Drawable Drawable.mutate()>
	//   13   29:putfield        #183 <Field Drawable mThumbDrawable>
			if(mHasThumbTint)
	//*  14   32:aload_0         
	//*  15   33:getfield        #116 <Field boolean mHasThumbTint>
	//*  16   36:ifeq            50
				DrawableCompat.setTintList(mThumbDrawable, mThumbTintList);
	//   17   39:aload_0         
	//   18   40:getfield        #183 <Field Drawable mThumbDrawable>
	//   19   43:aload_0         
	//   20   44:getfield        #112 <Field ColorStateList mThumbTintList>
	//   21   47:invokestatic    #353 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasThumbTintMode)
	//*  22   50:aload_0         
	//*  23   51:getfield        #118 <Field boolean mHasThumbTintMode>
	//*  24   54:ifeq            68
				DrawableCompat.setTintMode(mThumbDrawable, mThumbTintMode);
	//   25   57:aload_0         
	//   26   58:getfield        #183 <Field Drawable mThumbDrawable>
	//   27   61:aload_0         
	//   28   62:getfield        #114 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//   29   65:invokestatic    #357 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mThumbDrawable.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #183 <Field Drawable mThumbDrawable>
	//*  32   72:invokevirtual   #360 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				mThumbDrawable.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #183 <Field Drawable mThumbDrawable>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #364 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #368 <Method boolean Drawable.setState(int[])>
	//   39   89:pop             
		}
	//   40   90:return          
	}

	private void applyTrackTint()
	{
		if(mTrackDrawable != null && (mHasTrackTint || mHasTrackTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field Drawable mTrackDrawable>
	//*   2    4:ifnull          90
	//*   3    7:aload_0         
	//*   4    8:getfield        #124 <Field boolean mHasTrackTint>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #126 <Field boolean mHasTrackTintMode>
	//*   8   18:ifeq            90
		{
			mTrackDrawable = mTrackDrawable.mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #194 <Field Drawable mTrackDrawable>
	//   12   26:invokevirtual   #347 <Method Drawable Drawable.mutate()>
	//   13   29:putfield        #194 <Field Drawable mTrackDrawable>
			if(mHasTrackTint)
	//*  14   32:aload_0         
	//*  15   33:getfield        #124 <Field boolean mHasTrackTint>
	//*  16   36:ifeq            50
				DrawableCompat.setTintList(mTrackDrawable, mTrackTintList);
	//   17   39:aload_0         
	//   18   40:getfield        #194 <Field Drawable mTrackDrawable>
	//   19   43:aload_0         
	//   20   44:getfield        #120 <Field ColorStateList mTrackTintList>
	//   21   47:invokestatic    #353 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasTrackTintMode)
	//*  22   50:aload_0         
	//*  23   51:getfield        #126 <Field boolean mHasTrackTintMode>
	//*  24   54:ifeq            68
				DrawableCompat.setTintMode(mTrackDrawable, mTrackTintMode);
	//   25   57:aload_0         
	//   26   58:getfield        #194 <Field Drawable mTrackDrawable>
	//   27   61:aload_0         
	//   28   62:getfield        #122 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//   29   65:invokestatic    #357 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mTrackDrawable.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #194 <Field Drawable mTrackDrawable>
	//*  32   72:invokevirtual   #360 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				mTrackDrawable.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #194 <Field Drawable mTrackDrawable>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #364 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #368 <Method boolean Drawable.setState(int[])>
	//   39   89:pop             
		}
	//   40   90:return          
	}

	private void cancelPositionAnimator()
	{
		if(mPositionAnimator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #326 <Field ObjectAnimator mPositionAnimator>
	//*   2    4:ifnull          14
			mPositionAnimator.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #326 <Field ObjectAnimator mPositionAnimator>
	//    5   11:invokevirtual   #372 <Method void ObjectAnimator.cancel()>
	//    6   14:return          
	}

	private void cancelSuperTouch(MotionEvent motionevent)
	{
		motionevent = MotionEvent.obtain(motionevent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #379 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    2    4:astore_1        
		motionevent.setAction(3);
	//    3    5:aload_1         
	//    4    6:iconst_3        
	//    5    7:invokevirtual   #382 <Method void MotionEvent.setAction(int)>
		super.onTouchEvent(motionevent);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #386 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//    9   15:pop             
		motionevent.recycle();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #387 <Method void MotionEvent.recycle()>
	//   12   20:return          
	}

	private static float constrain(float f, float f1, float f2)
	{
		if(f < f1)
	//*   0    0:fload_0         
	//*   1    1:fload_1         
	//*   2    2:fcmpg           
	//*   3    3:ifge            8
			return f1;
	//    4    6:fload_1         
	//    5    7:freturn         
		if(f > f2)
	//*   6    8:fload_0         
	//*   7    9:fload_2         
	//*   8   10:fcmpl           
	//*   9   11:ifle            16
			return f2;
	//   10   14:fload_2         
	//   11   15:freturn         
		else
			return f;
	//   12   16:fload_0         
	//   13   17:freturn         
	}

	private boolean getTargetCheckedState()
	{
		return mThumbPosition > 0.5F;
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field float mThumbPosition>
	//    2    4:ldc2            #391 <Float 0.5F>
	//    3    7:fcmpl           
	//    4    8:ifle            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private int getThumbOffset()
	{
		float f;
		if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #398 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifeq            27
			f = 1.0F - mThumbPosition;
	//    3    7:fconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #317 <Field float mThumbPosition>
	//    6   12:fsub            
	//    7   13:fstore_1        
		else
	//*   8   14:fload_1         
	//*   9   15:aload_0         
	//*  10   16:invokespecial   #401 <Method int getThumbScrollRange()>
	//*  11   19:i2f             
	//*  12   20:fmul            
	//*  13   21:ldc2            #391 <Float 0.5F>
	//*  14   24:fadd            
	//*  15   25:f2i             
	//*  16   26:ireturn         
			f = mThumbPosition;
	//   17   27:aload_0         
	//   18   28:getfield        #317 <Field float mThumbPosition>
	//   19   31:fstore_1        
		return (int)(f * (float)getThumbScrollRange() + 0.5F);
	//*  20   32:goto            14
	}

	private int getThumbScrollRange()
	{
		if(mTrackDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field Drawable mTrackDrawable>
	//*   2    4:ifnull          73
		{
			Rect rect1 = mTempRect;
	//    3    7:aload_0         
	//    4    8:getfield        #140 <Field Rect mTempRect>
	//    5   11:astore_2        
			mTrackDrawable.getPadding(rect1);
	//    6   12:aload_0         
	//    7   13:getfield        #194 <Field Drawable mTrackDrawable>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #405 <Method boolean Drawable.getPadding(Rect)>
	//   10   20:pop             
			Rect rect;
			if(mThumbDrawable != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #183 <Field Drawable mThumbDrawable>
	//*  13   25:ifnull          66
				rect = DrawableUtils.getOpticalBounds(mThumbDrawable);
	//   14   28:aload_0         
	//   15   29:getfield        #183 <Field Drawable mThumbDrawable>
	//   16   32:invokestatic    #409 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   17   35:astore_1        
			else
	//*  18   36:aload_0         
	//*  19   37:getfield        #411 <Field int mSwitchWidth>
	//*  20   40:aload_0         
	//*  21   41:getfield        #413 <Field int mThumbWidth>
	//*  22   44:isub            
	//*  23   45:aload_2         
	//*  24   46:getfield        #416 <Field int Rect.left>
	//*  25   49:isub            
	//*  26   50:aload_2         
	//*  27   51:getfield        #419 <Field int Rect.right>
	//*  28   54:isub            
	//*  29   55:aload_1         
	//*  30   56:getfield        #416 <Field int Rect.left>
	//*  31   59:isub            
	//*  32   60:aload_1         
	//*  33   61:getfield        #419 <Field int Rect.right>
	//*  34   64:isub            
	//*  35   65:ireturn         
				rect = DrawableUtils.INSETS_NONE;
	//   36   66:getstatic       #422 <Field Rect DrawableUtils.INSETS_NONE>
	//   37   69:astore_1        
			return mSwitchWidth - mThumbWidth - rect1.left - rect1.right - rect.left - rect.right;
		} else
	//*  38   70:goto            36
		{
			return 0;
	//   39   73:iconst_0        
	//   40   74:ireturn         
		}
	}

	private boolean hitThumb(float f, float f1)
	{
		if(mThumbDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field Drawable mThumbDrawable>
	//*   2    4:ifnonnull       9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
		{
			int k = getThumbOffset();
	//    5    9:aload_0         
	//    6   10:invokespecial   #426 <Method int getThumbOffset()>
	//    7   13:istore          5
			mThumbDrawable.getPadding(mTempRect);
	//    8   15:aload_0         
	//    9   16:getfield        #183 <Field Drawable mThumbDrawable>
	//   10   19:aload_0         
	//   11   20:getfield        #140 <Field Rect mTempRect>
	//   12   23:invokevirtual   #405 <Method boolean Drawable.getPadding(Rect)>
	//   13   26:pop             
			int i = mSwitchTop;
	//   14   27:aload_0         
	//   15   28:getfield        #428 <Field int mSwitchTop>
	//   16   31:istore_3        
			int j = mTouchSlop;
	//   17   32:aload_0         
	//   18   33:getfield        #297 <Field int mTouchSlop>
	//   19   36:istore          4
			k = (k + mSwitchLeft) - mTouchSlop;
	//   20   38:iload           5
	//   21   40:aload_0         
	//   22   41:getfield        #430 <Field int mSwitchLeft>
	//   23   44:iadd            
	//   24   45:aload_0         
	//   25   46:getfield        #297 <Field int mTouchSlop>
	//   26   49:isub            
	//   27   50:istore          5
			int l = mThumbWidth;
	//   28   52:aload_0         
	//   29   53:getfield        #413 <Field int mThumbWidth>
	//   30   56:istore          6
			int i1 = mTempRect.left;
	//   31   58:aload_0         
	//   32   59:getfield        #140 <Field Rect mTempRect>
	//   33   62:getfield        #416 <Field int Rect.left>
	//   34   65:istore          7
			int j1 = mTempRect.right;
	//   35   67:aload_0         
	//   36   68:getfield        #140 <Field Rect mTempRect>
	//   37   71:getfield        #419 <Field int Rect.right>
	//   38   74:istore          8
			int k1 = mTouchSlop;
	//   39   76:aload_0         
	//   40   77:getfield        #297 <Field int mTouchSlop>
	//   41   80:istore          9
			int l1 = mSwitchBottom;
	//   42   82:aload_0         
	//   43   83:getfield        #432 <Field int mSwitchBottom>
	//   44   86:istore          10
			int i2 = mTouchSlop;
	//   45   88:aload_0         
	//   46   89:getfield        #297 <Field int mTouchSlop>
	//   47   92:istore          11
			if(f > (float)k && f < (float)(l + k + i1 + j1 + k1) && f1 > (float)(i - j) && f1 < (float)(l1 + i2))
	//*  48   94:fload_1         
	//*  49   95:iload           5
	//*  50   97:i2f             
	//*  51   98:fcmpl           
	//*  52   99:ifle            7
	//*  53  102:fload_1         
	//*  54  103:iload           6
	//*  55  105:iload           5
	//*  56  107:iadd            
	//*  57  108:iload           7
	//*  58  110:iadd            
	//*  59  111:iload           8
	//*  60  113:iadd            
	//*  61  114:iload           9
	//*  62  116:iadd            
	//*  63  117:i2f             
	//*  64  118:fcmpg           
	//*  65  119:ifge            7
	//*  66  122:fload_2         
	//*  67  123:iload_3         
	//*  68  124:iload           4
	//*  69  126:isub            
	//*  70  127:i2f             
	//*  71  128:fcmpl           
	//*  72  129:ifle            7
	//*  73  132:fload_2         
	//*  74  133:iload           10
	//*  75  135:iload           11
	//*  76  137:iadd            
	//*  77  138:i2f             
	//*  78  139:fcmpg           
	//*  79  140:ifge            7
				return true;
	//   80  143:iconst_1        
	//   81  144:ireturn         
		}
		return false;
	}

	private Layout makeLayout(CharSequence charsequence)
	{
		if(mSwitchTransformationMethod != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #436 <Field TransformationMethod mSwitchTransformationMethod>
	//*   2    4:ifnull          59
			charsequence = mSwitchTransformationMethod.getTransformation(charsequence, ((android.view.View) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #436 <Field TransformationMethod mSwitchTransformationMethod>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokeinterface #442 <Method CharSequence TransformationMethod.getTransformation(CharSequence, android.view.View)>
	//    8   18:astore_1        
		TextPaint textpaint = mTextPaint;
	//    9   19:aload_0         
	//   10   20:getfield        #147 <Field TextPaint mTextPaint>
	//   11   23:astore_3        
		int i;
		if(charsequence != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          62
			i = (int)Math.ceil(Layout.getDesiredWidth(charsequence, mTextPaint));
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #147 <Field TextPaint mTextPaint>
	//   17   33:invokestatic    #448 <Method float Layout.getDesiredWidth(CharSequence, TextPaint)>
	//   18   36:f2d             
	//   19   37:invokestatic    #454 <Method double Math.ceil(double)>
	//   20   40:d2i             
	//   21   41:istore_2        
		else
	//*  22   42:new             #456 <Class StaticLayout>
	//*  23   45:dup             
	//*  24   46:aload_1         
	//*  25   47:aload_3         
	//*  26   48:iload_2         
	//*  27   49:getstatic       #462 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//*  28   52:fconst_1        
	//*  29   53:fconst_0        
	//*  30   54:iconst_1        
	//*  31   55:invokespecial   #465 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//*  32   58:areturn         
	//*  33   59:goto            19
			i = 0;
	//   34   62:iconst_0        
	//   35   63:istore_2        
		return ((Layout) (new StaticLayout(charsequence, textpaint, i, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true)));
	//*  36   64:goto            42
	}

	private void setSwitchTypefaceByIndex(int i, int j)
	{
		Typeface typeface = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		i;
	//    2    2:iload_1         
		JVM INSTR tableswitch 1 3: default 28
	//	               1 35
	//	               2 42
	//	               3 49;
	//    3    3:tableswitch     1 3: default 28
	//	               1 35
	//	               2 42
	//	               3 49
		   goto _L1 _L2 _L3 _L4
_L1:
		setSwitchTypeface(typeface, j);
	//    4   28:aload_0         
	//    5   29:aload_3         
	//    6   30:iload_2         
	//    7   31:invokevirtual   #471 <Method void setSwitchTypeface(Typeface, int)>
		return;
	//    8   34:return          
_L2:
		typeface = Typeface.SANS_SERIF;
	//    9   35:getstatic       #477 <Field Typeface Typeface.SANS_SERIF>
	//   10   38:astore_3        
		continue; /* Loop/switch isn't completed */
	//   11   39:goto            28
_L3:
		typeface = Typeface.SERIF;
	//   12   42:getstatic       #479 <Field Typeface Typeface.SERIF>
	//   13   45:astore_3        
		continue; /* Loop/switch isn't completed */
	//   14   46:goto            28
_L4:
		typeface = Typeface.MONOSPACE;
	//   15   49:getstatic       #481 <Field Typeface Typeface.MONOSPACE>
	//   16   52:astore_3        
		if(true) goto _L1; else goto _L5
	//   17   53:goto            28
_L5:
	}

	private void stopDrag(MotionEvent motionevent)
	{
		float f;
		boolean flag1;
		boolean flag2;
		flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          4
		mTouchMode = 0;
	//    2    3:aload_0         
	//    3    4:iconst_0        
	//    4    5:putfield        #484 <Field int mTouchMode>
		boolean flag;
		if(motionevent.getAction() == 1 && isEnabled())
	//*   5    8:aload_1         
	//*   6    9:invokevirtual   #487 <Method int MotionEvent.getAction()>
	//*   7   12:iconst_1        
	//*   8   13:icmpne          103
	//*   9   16:aload_0         
	//*  10   17:invokevirtual   #490 <Method boolean isEnabled()>
	//*  11   20:ifeq            103
			flag = true;
	//   12   23:iconst_1        
	//   13   24:istore_3        
		else
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #309 <Method boolean isChecked()>
	//*  16   29:istore          5
	//*  17   31:iload_3         
	//*  18   32:ifeq            135
	//*  19   35:aload_0         
	//*  20   36:getfield        #134 <Field VelocityTracker mVelocityTracker>
	//*  21   39:sipush          1000
	//*  22   42:invokevirtual   #493 <Method void VelocityTracker.computeCurrentVelocity(int)>
	//*  23   45:aload_0         
	//*  24   46:getfield        #134 <Field VelocityTracker mVelocityTracker>
	//*  25   49:invokevirtual   #497 <Method float VelocityTracker.getXVelocity()>
	//*  26   52:fstore_2        
	//*  27   53:fload_2         
	//*  28   54:invokestatic    #501 <Method float Math.abs(float)>
	//*  29   57:aload_0         
	//*  30   58:getfield        #302 <Field int mMinFlingVelocity>
	//*  31   61:i2f             
	//*  32   62:fcmpl           
	//*  33   63:ifle            126
	//*  34   66:aload_0         
	//*  35   67:invokestatic    #398 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  36   70:ifeq            114
	//*  37   73:fload_2         
	//*  38   74:fconst_0        
	//*  39   75:fcmpg           
	//*  40   76:ifge            108
	//*  41   79:iload           4
	//*  42   81:iload           5
	//*  43   83:icmpeq          91
	//*  44   86:aload_0         
	//*  45   87:iconst_0        
	//*  46   88:invokevirtual   #504 <Method void playSoundEffect(int)>
	//*  47   91:aload_0         
	//*  48   92:iload           4
	//*  49   94:invokevirtual   #313 <Method void setChecked(boolean)>
	//*  50   97:aload_0         
	//*  51   98:aload_1         
	//*  52   99:invokespecial   #506 <Method void cancelSuperTouch(MotionEvent)>
	//*  53  102:return          
			flag = false;
	//   54  103:iconst_0        
	//   55  104:istore_3        
		flag2 = isChecked();
		if(!flag) goto _L2; else goto _L1
_L1:
		mVelocityTracker.computeCurrentVelocity(1000);
		f = mVelocityTracker.getXVelocity();
		if(Math.abs(f) <= (float)mMinFlingVelocity) goto _L4; else goto _L3
_L3:
		if(!ViewUtils.isLayoutRtl(((android.view.View) (this)))) goto _L6; else goto _L5
_L5:
		if(f >= 0.0F)
	//*  56  105:goto            25
			flag1 = false;
	//   57  108:iconst_0        
	//   58  109:istore          4
_L8:
		if(flag1 != flag2)
			playSoundEffect(0);
		setChecked(flag1);
		cancelSuperTouch(motionevent);
		return;
	//*  59  111:goto            79
_L6:
		if(f <= 0.0F)
	//*  60  114:fload_2         
	//*  61  115:fconst_0        
	//*  62  116:fcmpl           
	//*  63  117:ifgt            79
			flag1 = false;
	//   64  120:iconst_0        
	//   65  121:istore          4
		continue; /* Loop/switch isn't completed */
	//   66  123:goto            79
_L4:
		flag1 = getTargetCheckedState();
	//   67  126:aload_0         
	//   68  127:invokespecial   #508 <Method boolean getTargetCheckedState()>
	//   69  130:istore          4
		continue; /* Loop/switch isn't completed */
	//   70  132:goto            79
_L2:
		flag1 = flag2;
	//   71  135:iload           5
	//   72  137:istore          4
		if(true) goto _L8; else goto _L7
	//   73  139:goto            79
_L7:
	}

	public void draw(Canvas canvas)
	{
		Rect rect = mTempRect;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field Rect mTempRect>
	//    2    4:astore          12
		int j = mSwitchLeft;
	//    3    6:aload_0         
	//    4    7:getfield        #430 <Field int mSwitchLeft>
	//    5   10:istore_3        
		int i1 = mSwitchTop;
	//    6   11:aload_0         
	//    7   12:getfield        #428 <Field int mSwitchTop>
	//    8   15:istore          6
		int k1 = mSwitchRight;
	//    9   17:aload_0         
	//   10   18:getfield        #512 <Field int mSwitchRight>
	//   11   21:istore          8
		int j1 = mSwitchBottom;
	//   12   23:aload_0         
	//   13   24:getfield        #432 <Field int mSwitchBottom>
	//   14   27:istore          7
		int l1 = j + getThumbOffset();
	//   15   29:iload_3         
	//   16   30:aload_0         
	//   17   31:invokespecial   #426 <Method int getThumbOffset()>
	//   18   34:iadd            
	//   19   35:istore          9
		int i;
		Object obj;
		if(mThumbDrawable != null)
	//*  20   37:aload_0         
	//*  21   38:getfield        #183 <Field Drawable mThumbDrawable>
	//*  22   41:ifnull          299
			obj = ((Object) (DrawableUtils.getOpticalBounds(mThumbDrawable)));
	//   23   44:aload_0         
	//   24   45:getfield        #183 <Field Drawable mThumbDrawable>
	//   25   48:invokestatic    #409 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   26   51:astore          11
		else
	//*  27   53:aload_0         
	//*  28   54:getfield        #194 <Field Drawable mTrackDrawable>
	//*  29   57:ifnull          340
	//*  30   60:aload_0         
	//*  31   61:getfield        #194 <Field Drawable mTrackDrawable>
	//*  32   64:aload           12
	//*  33   66:invokevirtual   #405 <Method boolean Drawable.getPadding(Rect)>
	//*  34   69:pop             
	//*  35   70:aload           12
	//*  36   72:getfield        #416 <Field int Rect.left>
	//*  37   75:istore          10
	//*  38   77:aload           11
	//*  39   79:ifnull          320
	//*  40   82:iload_3         
	//*  41   83:istore_2        
	//*  42   84:aload           11
	//*  43   86:getfield        #416 <Field int Rect.left>
	//*  44   89:aload           12
	//*  45   91:getfield        #416 <Field int Rect.left>
	//*  46   94:icmple          111
	//*  47   97:iload_3         
	//*  48   98:aload           11
	//*  49  100:getfield        #416 <Field int Rect.left>
	//*  50  103:aload           12
	//*  51  105:getfield        #416 <Field int Rect.left>
	//*  52  108:isub            
	//*  53  109:iadd            
	//*  54  110:istore_2        
	//*  55  111:aload           11
	//*  56  113:getfield        #515 <Field int Rect.top>
	//*  57  116:aload           12
	//*  58  118:getfield        #515 <Field int Rect.top>
	//*  59  121:icmple          314
	//*  60  124:aload           11
	//*  61  126:getfield        #515 <Field int Rect.top>
	//*  62  129:aload           12
	//*  63  131:getfield        #515 <Field int Rect.top>
	//*  64  134:isub            
	//*  65  135:iload           6
	//*  66  137:iadd            
	//*  67  138:istore_3        
	//*  68  139:iload           8
	//*  69  141:istore          5
	//*  70  143:aload           11
	//*  71  145:getfield        #419 <Field int Rect.right>
	//*  72  148:aload           12
	//*  73  150:getfield        #419 <Field int Rect.right>
	//*  74  153:icmple          172
	//*  75  156:iload           8
	//*  76  158:aload           11
	//*  77  160:getfield        #419 <Field int Rect.right>
	//*  78  163:aload           12
	//*  79  165:getfield        #419 <Field int Rect.right>
	//*  80  168:isub            
	//*  81  169:isub            
	//*  82  170:istore          5
	//*  83  172:aload           11
	//*  84  174:getfield        #518 <Field int Rect.bottom>
	//*  85  177:aload           12
	//*  86  179:getfield        #518 <Field int Rect.bottom>
	//*  87  182:icmple          307
	//*  88  185:iload           7
	//*  89  187:aload           11
	//*  90  189:getfield        #518 <Field int Rect.bottom>
	//*  91  192:aload           12
	//*  92  194:getfield        #518 <Field int Rect.bottom>
	//*  93  197:isub            
	//*  94  198:isub            
	//*  95  199:istore          4
	//*  96  201:aload_0         
	//*  97  202:getfield        #194 <Field Drawable mTrackDrawable>
	//*  98  205:iload_2         
	//*  99  206:iload_3         
	//* 100  207:iload           5
	//* 101  209:iload           4
	//* 102  211:invokevirtual   #522 <Method void Drawable.setBounds(int, int, int, int)>
	//* 103  214:iload           10
	//* 104  216:iload           9
	//* 105  218:iadd            
	//* 106  219:istore_2        
	//* 107  220:aload_0         
	//* 108  221:getfield        #183 <Field Drawable mThumbDrawable>
	//* 109  224:ifnull          293
	//* 110  227:aload_0         
	//* 111  228:getfield        #183 <Field Drawable mThumbDrawable>
	//* 112  231:aload           12
	//* 113  233:invokevirtual   #405 <Method boolean Drawable.getPadding(Rect)>
	//* 114  236:pop             
	//* 115  237:iload_2         
	//* 116  238:aload           12
	//* 117  240:getfield        #416 <Field int Rect.left>
	//* 118  243:isub            
	//* 119  244:istore_3        
	//* 120  245:iload_2         
	//* 121  246:aload_0         
	//* 122  247:getfield        #413 <Field int mThumbWidth>
	//* 123  250:iadd            
	//* 124  251:aload           12
	//* 125  253:getfield        #419 <Field int Rect.right>
	//* 126  256:iadd            
	//* 127  257:istore_2        
	//* 128  258:aload_0         
	//* 129  259:getfield        #183 <Field Drawable mThumbDrawable>
	//* 130  262:iload_3         
	//* 131  263:iload           6
	//* 132  265:iload_2         
	//* 133  266:iload           7
	//* 134  268:invokevirtual   #522 <Method void Drawable.setBounds(int, int, int, int)>
	//* 135  271:aload_0         
	//* 136  272:invokevirtual   #525 <Method Drawable getBackground()>
	//* 137  275:astore          11
	//* 138  277:aload           11
	//* 139  279:ifnull          293
	//* 140  282:aload           11
	//* 141  284:iload_3         
	//* 142  285:iload           6
	//* 143  287:iload_2         
	//* 144  288:iload           7
	//* 145  290:invokestatic    #529 <Method void DrawableCompat.setHotspotBounds(Drawable, int, int, int, int)>
	//* 146  293:aload_0         
	//* 147  294:aload_1         
	//* 148  295:invokespecial   #531 <Method void CompoundButton.draw(Canvas)>
	//* 149  298:return          
			obj = ((Object) (DrawableUtils.INSETS_NONE));
	//  150  299:getstatic       #422 <Field Rect DrawableUtils.INSETS_NONE>
	//  151  302:astore          11
		if(mTrackDrawable != null)
		{
			mTrackDrawable.getPadding(rect);
			int i2 = rect.left;
			int k;
			int l;
			if(obj != null)
			{
				i = j;
				if(((Rect) (obj)).left > rect.left)
					i = j + (((Rect) (obj)).left - rect.left);
				if(((Rect) (obj)).top > rect.top)
					j = (((Rect) (obj)).top - rect.top) + i1;
				else
	//* 152  304:goto            53
	//* 153  307:iload           7
	//* 154  309:istore          4
	//* 155  311:goto            201
					j = i1;
	//  156  314:iload           6
	//  157  316:istore_3        
				l = k1;
				if(((Rect) (obj)).right > rect.right)
					l = k1 - (((Rect) (obj)).right - rect.right);
				if(((Rect) (obj)).bottom > rect.bottom)
					k = j1 - (((Rect) (obj)).bottom - rect.bottom);
				else
					k = j1;
			} else
	//* 158  317:goto            139
			{
				k = j1;
	//  159  320:iload           7
	//  160  322:istore          4
				l = i1;
	//  161  324:iload           6
	//  162  326:istore          5
				i = j;
	//  163  328:iload_3         
	//  164  329:istore_2        
				j = l;
	//  165  330:iload           5
	//  166  332:istore_3        
				l = k1;
	//  167  333:iload           8
	//  168  335:istore          5
			}
			mTrackDrawable.setBounds(i, j, l, k);
			i = i2 + l1;
		} else
	//* 169  337:goto            201
		{
			i = l1;
	//  170  340:iload           9
	//  171  342:istore_2        
		}
		if(mThumbDrawable != null)
		{
			mThumbDrawable.getPadding(rect);
			j = i - rect.left;
			i = i + mThumbWidth + rect.right;
			mThumbDrawable.setBounds(j, i1, i, j1);
			obj = ((Object) (getBackground()));
			if(obj != null)
				DrawableCompat.setHotspotBounds(((Drawable) (obj)), j, i1, i, j1);
		}
		super.draw(canvas);
	//* 172  343:goto            220
	}

	public void drawableHotspotChanged(float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #337 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			super.drawableHotspotChanged(f, f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:invokespecial   #535 <Method void CompoundButton.drawableHotspotChanged(float, float)>
		if(mThumbDrawable != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #183 <Field Drawable mThumbDrawable>
	//*   9   18:ifnull          30
			DrawableCompat.setHotspot(mThumbDrawable, f, f1);
	//   10   21:aload_0         
	//   11   22:getfield        #183 <Field Drawable mThumbDrawable>
	//   12   25:fload_1         
	//   13   26:fload_2         
	//   14   27:invokestatic    #539 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
		if(mTrackDrawable != null)
	//*  15   30:aload_0         
	//*  16   31:getfield        #194 <Field Drawable mTrackDrawable>
	//*  17   34:ifnull          46
			DrawableCompat.setHotspot(mTrackDrawable, f, f1);
	//   18   37:aload_0         
	//   19   38:getfield        #194 <Field Drawable mTrackDrawable>
	//   20   41:fload_1         
	//   21   42:fload_2         
	//   22   43:invokestatic    #539 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//   23   46:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #542 <Method void CompoundButton.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #364 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		Drawable drawable = mThumbDrawable;
	//    7   11:aload_0         
	//    8   12:getfield        #183 <Field Drawable mThumbDrawable>
	//    9   15:astore          4
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(drawable != null)
	//*  12   19:aload           4
	//*  13   21:ifnull          43
		{
			flag = flag1;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if(drawable.isStateful())
	//*  16   26:aload           4
	//*  17   28:invokevirtual   #360 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #368 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		drawable = mTrackDrawable;
	//   25   43:aload_0         
	//   26   44:getfield        #194 <Field Drawable mTrackDrawable>
	//   27   47:astore          4
		flag1 = flag;
	//   28   49:iload_1         
	//   29   50:istore_2        
		if(drawable != null)
	//*  30   51:aload           4
	//*  31   53:ifnull          75
		{
			flag1 = flag;
	//   32   56:iload_1         
	//   33   57:istore_2        
			if(drawable.isStateful())
	//*  34   58:aload           4
	//*  35   60:invokevirtual   #360 <Method boolean Drawable.isStateful()>
	//*  36   63:ifeq            75
				flag1 = flag | drawable.setState(ai);
	//   37   66:iload_1         
	//   38   67:aload           4
	//   39   69:aload_3         
	//   40   70:invokevirtual   #368 <Method boolean Drawable.setState(int[])>
	//   41   73:ior             
	//   42   74:istore_2        
		}
		if(flag1)
	//*  43   75:iload_2         
	//*  44   76:ifeq            83
			invalidate();
	//   45   79:aload_0         
	//   46   80:invokevirtual   #545 <Method void invalidate()>
	//   47   83:return          
	}

	public int getCompoundPaddingLeft()
	{
		int i;
		if(!ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #398 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifne            14
		{
			i = super.getCompoundPaddingLeft();
	//    3    7:aload_0         
	//    4    8:invokespecial   #548 <Method int CompoundButton.getCompoundPaddingLeft()>
	//    5   11:istore_1        
		} else
	//*   6   12:iload_1         
	//*   7   13:ireturn         
		{
			int j = super.getCompoundPaddingLeft() + mSwitchWidth;
	//    8   14:aload_0         
	//    9   15:invokespecial   #548 <Method int CompoundButton.getCompoundPaddingLeft()>
	//   10   18:aload_0         
	//   11   19:getfield        #411 <Field int mSwitchWidth>
	//   12   22:iadd            
	//   13   23:istore_2        
			i = j;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if(!TextUtils.isEmpty(getText()))
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #551 <Method CharSequence getText()>
	//*  18   30:invokestatic    #557 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   33:ifne            12
				return j + mSwitchPadding;
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:getfield        #236 <Field int mSwitchPadding>
	//   23   41:iadd            
	//   24   42:ireturn         
		}
		return i;
	}

	public int getCompoundPaddingRight()
	{
		int i;
		if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #398 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifeq            14
		{
			i = super.getCompoundPaddingRight();
	//    3    7:aload_0         
	//    4    8:invokespecial   #560 <Method int CompoundButton.getCompoundPaddingRight()>
	//    5   11:istore_1        
		} else
	//*   6   12:iload_1         
	//*   7   13:ireturn         
		{
			int j = super.getCompoundPaddingRight() + mSwitchWidth;
	//    8   14:aload_0         
	//    9   15:invokespecial   #560 <Method int CompoundButton.getCompoundPaddingRight()>
	//   10   18:aload_0         
	//   11   19:getfield        #411 <Field int mSwitchWidth>
	//   12   22:iadd            
	//   13   23:istore_2        
			i = j;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if(!TextUtils.isEmpty(getText()))
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #551 <Method CharSequence getText()>
	//*  18   30:invokestatic    #557 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   33:ifne            12
				return j + mSwitchPadding;
	//   20   36:iload_2         
	//   21   37:aload_0         
	//   22   38:getfield        #236 <Field int mSwitchPadding>
	//   23   41:iadd            
	//   24   42:ireturn         
		}
		return i;
	}

	public boolean getShowText()
	{
		return mShowText;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field boolean mShowText>
	//    2    4:ireturn         
	}

	public boolean getSplitTrack()
	{
		return mSplitTrack;
	//    0    0:aload_0         
	//    1    1:getfield        #241 <Field boolean mSplitTrack>
	//    2    4:ireturn         
	}

	public int getSwitchMinWidth()
	{
		return mSwitchMinWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field int mSwitchMinWidth>
	//    2    4:ireturn         
	}

	public int getSwitchPadding()
	{
		return mSwitchPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field int mSwitchPadding>
	//    2    4:ireturn         
	}

	public CharSequence getTextOff()
	{
		return mTextOff;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field CharSequence mTextOff>
	//    2    4:areturn         
	}

	public CharSequence getTextOn()
	{
		return mTextOn;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field CharSequence mTextOn>
	//    2    4:areturn         
	}

	public Drawable getThumbDrawable()
	{
		return mThumbDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field Drawable mThumbDrawable>
	//    2    4:areturn         
	}

	public int getThumbTextPadding()
	{
		return mThumbTextPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #226 <Field int mThumbTextPadding>
	//    2    4:ireturn         
	}

	public ColorStateList getThumbTintList()
	{
		return mThumbTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field ColorStateList mThumbTintList>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getThumbTintMode()
	{
		return mThumbTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//    2    4:areturn         
	}

	public Drawable getTrackDrawable()
	{
		return mTrackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field Drawable mTrackDrawable>
	//    2    4:areturn         
	}

	public ColorStateList getTrackTintList()
	{
		return mTrackTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field ColorStateList mTrackTintList>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getTrackTintMode()
	{
		return mTrackTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//    2    4:areturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #337 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          69
		{
			super.jumpDrawablesToCurrentState();
	//    3    8:aload_0         
	//    4    9:invokespecial   #580 <Method void CompoundButton.jumpDrawablesToCurrentState()>
			if(mThumbDrawable != null)
	//*   5   12:aload_0         
	//*   6   13:getfield        #183 <Field Drawable mThumbDrawable>
	//*   7   16:ifnull          26
				mThumbDrawable.jumpToCurrentState();
	//    8   19:aload_0         
	//    9   20:getfield        #183 <Field Drawable mThumbDrawable>
	//   10   23:invokevirtual   #583 <Method void Drawable.jumpToCurrentState()>
			if(mTrackDrawable != null)
	//*  11   26:aload_0         
	//*  12   27:getfield        #194 <Field Drawable mTrackDrawable>
	//*  13   30:ifnull          40
				mTrackDrawable.jumpToCurrentState();
	//   14   33:aload_0         
	//   15   34:getfield        #194 <Field Drawable mTrackDrawable>
	//   16   37:invokevirtual   #583 <Method void Drawable.jumpToCurrentState()>
			if(mPositionAnimator != null && mPositionAnimator.isStarted())
	//*  17   40:aload_0         
	//*  18   41:getfield        #326 <Field ObjectAnimator mPositionAnimator>
	//*  19   44:ifnull          69
	//*  20   47:aload_0         
	//*  21   48:getfield        #326 <Field ObjectAnimator mPositionAnimator>
	//*  22   51:invokevirtual   #586 <Method boolean ObjectAnimator.isStarted()>
	//*  23   54:ifeq            69
			{
				mPositionAnimator.end();
	//   24   57:aload_0         
	//   25   58:getfield        #326 <Field ObjectAnimator mPositionAnimator>
	//   26   61:invokevirtual   #589 <Method void ObjectAnimator.end()>
				mPositionAnimator = null;
	//   27   64:aload_0         
	//   28   65:aconst_null     
	//   29   66:putfield        #326 <Field ObjectAnimator mPositionAnimator>
			}
		}
	//   30   69:return          
	}

	protected int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #593 <Method int[] CompoundButton.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(isChecked())
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #309 <Method boolean isChecked()>
	//*   8   12:ifeq            23
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//    9   15:aload_2         
	//   10   16:getstatic       #96  <Field int[] CHECKED_STATE_SET>
	//   11   19:invokestatic    #597 <Method int[] mergeDrawableStates(int[], int[])>
	//   12   22:pop             
		return ai;
	//   13   23:aload_2         
	//   14   24:areturn         
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #600 <Method void CompoundButton.onDraw(Canvas)>
		Object obj = ((Object) (mTempRect));
	//    3    5:aload_0         
	//    4    6:getfield        #140 <Field Rect mTempRect>
	//    5    9:astore          9
		int ai[] = ((int []) (mTrackDrawable));
	//    6   11:aload_0         
	//    7   12:getfield        #194 <Field Drawable mTrackDrawable>
	//    8   15:astore          11
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		Object obj1;
		if(ai != null)
	//*   9   17:aload           11
	//*  10   19:ifnull          314
			((Drawable) (ai)).getPadding(((Rect) (obj)));
	//   11   22:aload           11
	//   12   24:aload           9
	//   13   26:invokevirtual   #405 <Method boolean Drawable.getPadding(Rect)>
	//   14   29:pop             
		else
	//*  15   30:aload_0         
	//*  16   31:getfield        #428 <Field int mSwitchTop>
	//*  17   34:istore          4
	//*  18   36:aload_0         
	//*  19   37:getfield        #432 <Field int mSwitchBottom>
	//*  20   40:istore          5
	//*  21   42:aload           9
	//*  22   44:getfield        #515 <Field int Rect.top>
	//*  23   47:istore          6
	//*  24   49:aload           9
	//*  25   51:getfield        #518 <Field int Rect.bottom>
	//*  26   54:istore          7
	//*  27   56:aload_0         
	//*  28   57:getfield        #183 <Field Drawable mThumbDrawable>
	//*  29   60:astore          10
	//*  30   62:aload           11
	//*  31   64:ifnull          151
	//*  32   67:aload_0         
	//*  33   68:getfield        #241 <Field boolean mSplitTrack>
	//*  34   71:ifeq            322
	//*  35   74:aload           10
	//*  36   76:ifnull          322
	//*  37   79:aload           10
	//*  38   81:invokestatic    #409 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//*  39   84:astore          12
	//*  40   86:aload           10
	//*  41   88:aload           9
	//*  42   90:invokevirtual   #604 <Method void Drawable.copyBounds(Rect)>
	//*  43   93:aload           9
	//*  44   95:aload           9
	//*  45   97:getfield        #416 <Field int Rect.left>
	//*  46  100:aload           12
	//*  47  102:getfield        #416 <Field int Rect.left>
	//*  48  105:iadd            
	//*  49  106:putfield        #416 <Field int Rect.left>
	//*  50  109:aload           9
	//*  51  111:aload           9
	//*  52  113:getfield        #419 <Field int Rect.right>
	//*  53  116:aload           12
	//*  54  118:getfield        #419 <Field int Rect.right>
	//*  55  121:isub            
	//*  56  122:putfield        #419 <Field int Rect.right>
	//*  57  125:aload_1         
	//*  58  126:invokevirtual   #609 <Method int Canvas.save()>
	//*  59  129:istore_2        
	//*  60  130:aload_1         
	//*  61  131:aload           9
	//*  62  133:getstatic       #615 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//*  63  136:invokevirtual   #619 <Method boolean Canvas.clipRect(Rect, android.graphics.Region$Op)>
	//*  64  139:pop             
	//*  65  140:aload           11
	//*  66  142:aload_1         
	//*  67  143:invokevirtual   #620 <Method void Drawable.draw(Canvas)>
	//*  68  146:aload_1         
	//*  69  147:iload_2         
	//*  70  148:invokevirtual   #623 <Method void Canvas.restoreToCount(int)>
	//*  71  151:aload_1         
	//*  72  152:invokevirtual   #609 <Method int Canvas.save()>
	//*  73  155:istore_3        
	//*  74  156:aload           10
	//*  75  158:ifnull          167
	//*  76  161:aload           10
	//*  77  163:aload_1         
	//*  78  164:invokevirtual   #620 <Method void Drawable.draw(Canvas)>
	//*  79  167:aload_0         
	//*  80  168:invokespecial   #508 <Method boolean getTargetCheckedState()>
	//*  81  171:ifeq            331
	//*  82  174:aload_0         
	//*  83  175:getfield        #625 <Field Layout mOnLayout>
	//*  84  178:astore          9
	//*  85  180:aload           9
	//*  86  182:ifnull          308
	//*  87  185:aload_0         
	//*  88  186:invokevirtual   #364 <Method int[] getDrawableState()>
	//*  89  189:astore          11
	//*  90  191:aload_0         
	//*  91  192:getfield        #627 <Field ColorStateList mTextColors>
	//*  92  195:ifnull          215
	//*  93  198:aload_0         
	//*  94  199:getfield        #147 <Field TextPaint mTextPaint>
	//*  95  202:aload_0         
	//*  96  203:getfield        #627 <Field ColorStateList mTextColors>
	//*  97  206:aload           11
	//*  98  208:iconst_0        
	//*  99  209:invokevirtual   #633 <Method int ColorStateList.getColorForState(int[], int)>
	//* 100  212:invokevirtual   #636 <Method void TextPaint.setColor(int)>
	//* 101  215:aload_0         
	//* 102  216:getfield        #147 <Field TextPaint mTextPaint>
	//* 103  219:aload           11
	//* 104  221:putfield        #639 <Field int[] TextPaint.drawableState>
	//* 105  224:aload           10
	//* 106  226:ifnull          340
	//* 107  229:aload           10
	//* 108  231:invokevirtual   #643 <Method Rect Drawable.getBounds()>
	//* 109  234:astore          10
	//* 110  236:aload           10
	//* 111  238:getfield        #416 <Field int Rect.left>
	//* 112  241:istore_2        
	//* 113  242:aload           10
	//* 114  244:getfield        #419 <Field int Rect.right>
	//* 115  247:iload_2         
	//* 116  248:iadd            
	//* 117  249:istore_2        
	//* 118  250:iload_2         
	//* 119  251:iconst_2        
	//* 120  252:idiv            
	//* 121  253:istore_2        
	//* 122  254:aload           9
	//* 123  256:invokevirtual   #646 <Method int Layout.getWidth()>
	//* 124  259:iconst_2        
	//* 125  260:idiv            
	//* 126  261:istore          8
	//* 127  263:iload           4
	//* 128  265:iload           6
	//* 129  267:iadd            
	//* 130  268:iload           5
	//* 131  270:iload           7
	//* 132  272:isub            
	//* 133  273:iadd            
	//* 134  274:iconst_2        
	//* 135  275:idiv            
	//* 136  276:istore          4
	//* 137  278:aload           9
	//* 138  280:invokevirtual   #649 <Method int Layout.getHeight()>
	//* 139  283:iconst_2        
	//* 140  284:idiv            
	//* 141  285:istore          5
	//* 142  287:aload_1         
	//* 143  288:iload_2         
	//* 144  289:iload           8
	//* 145  291:isub            
	//* 146  292:i2f             
	//* 147  293:iload           4
	//* 148  295:iload           5
	//* 149  297:isub            
	//* 150  298:i2f             
	//* 151  299:invokevirtual   #652 <Method void Canvas.translate(float, float)>
	//* 152  302:aload           9
	//* 153  304:aload_1         
	//* 154  305:invokevirtual   #653 <Method void Layout.draw(Canvas)>
	//* 155  308:aload_1         
	//* 156  309:iload_3         
	//* 157  310:invokevirtual   #623 <Method void Canvas.restoreToCount(int)>
	//* 158  313:return          
			((Rect) (obj)).setEmpty();
	//  159  314:aload           9
	//  160  316:invokevirtual   #656 <Method void Rect.setEmpty()>
		l = mSwitchTop;
		i1 = mSwitchBottom;
		j1 = ((Rect) (obj)).top;
		k1 = ((Rect) (obj)).bottom;
		obj1 = ((Object) (mThumbDrawable));
		if(ai != null)
			if(mSplitTrack && obj1 != null)
			{
				Rect rect = DrawableUtils.getOpticalBounds(((Drawable) (obj1)));
				((Drawable) (obj1)).copyBounds(((Rect) (obj)));
				obj.left = ((Rect) (obj)).left + rect.left;
				obj.right = ((Rect) (obj)).right - rect.right;
				int i = canvas.save();
				canvas.clipRect(((Rect) (obj)), android.graphics.Region.Op.DIFFERENCE);
				((Drawable) (ai)).draw(canvas);
				canvas.restoreToCount(i);
			} else
	//* 161  319:goto            30
			{
				((Drawable) (ai)).draw(canvas);
	//  162  322:aload           11
	//  163  324:aload_1         
	//  164  325:invokevirtual   #620 <Method void Drawable.draw(Canvas)>
			}
		k = canvas.save();
		if(obj1 != null)
			((Drawable) (obj1)).draw(canvas);
		if(getTargetCheckedState())
			obj = ((Object) (mOnLayout));
		else
	//* 165  328:goto            151
			obj = ((Object) (mOffLayout));
	//  166  331:aload_0         
	//  167  332:getfield        #658 <Field Layout mOffLayout>
	//  168  335:astore          9
		if(obj != null)
		{
			ai = getDrawableState();
			if(mTextColors != null)
				mTextPaint.setColor(mTextColors.getColorForState(ai, 0));
			mTextPaint.drawableState = ai;
			int j;
			int l1;
			if(obj1 != null)
			{
				obj1 = ((Object) (((Drawable) (obj1)).getBounds()));
				j = ((Rect) (obj1)).left;
				j = ((Rect) (obj1)).right + j;
			} else
	//* 169  337:goto            180
			{
				j = getWidth();
	//  170  340:aload_0         
	//  171  341:invokevirtual   #659 <Method int getWidth()>
	//  172  344:istore_2        
			}
			j /= 2;
			l1 = ((Layout) (obj)).getWidth() / 2;
			l = (l + j1 + (i1 - k1)) / 2;
			i1 = ((Layout) (obj)).getHeight() / 2;
			canvas.translate(j - l1, l - i1);
			((Layout) (obj)).draw(canvas);
		}
		canvas.restoreToCount(k);
	//* 173  345:goto            250
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #663 <Method void CompoundButton.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName("android.widget.Switch");
	//    3    5:aload_1         
	//    4    6:ldc1            #13  <String "android.widget.Switch">
	//    5    8:invokevirtual   #669 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    6   11:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		CharSequence charsequence;
		CharSequence charsequence1;
label0:
		{
			if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #337 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          55
			{
				super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #673 <Method void CompoundButton.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
				accessibilitynodeinfo.setClassName("android.widget.Switch");
	//    6   13:aload_1         
	//    7   14:ldc1            #13  <String "android.widget.Switch">
	//    8   16:invokevirtual   #676 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
				if(isChecked())
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #309 <Method boolean isChecked()>
	//*  11   23:ifeq            56
					charsequence = mTextOn;
	//   12   26:aload_0         
	//   13   27:getfield        #203 <Field CharSequence mTextOn>
	//   14   30:astore_2        
				else
	//*  15   31:aload_2         
	//*  16   32:invokestatic    #557 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   35:ifne            55
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #677 <Method CharSequence AccessibilityNodeInfo.getText()>
	//*  20   42:astore_3        
	//*  21   43:aload_3         
	//*  22   44:invokestatic    #557 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   47:ifeq            64
	//*  24   50:aload_1         
	//*  25   51:aload_2         
	//*  26   52:invokevirtual   #680 <Method void AccessibilityNodeInfo.setText(CharSequence)>
	//*  27   55:return          
					charsequence = mTextOff;
	//   28   56:aload_0         
	//   29   57:getfield        #208 <Field CharSequence mTextOff>
	//   30   60:astore_2        
				if(!TextUtils.isEmpty(charsequence))
				{
					charsequence1 = accessibilitynodeinfo.getText();
					if(!TextUtils.isEmpty(charsequence1))
						break label0;
					accessibilitynodeinfo.setText(charsequence);
				}
			}
			return;
		}
	//*  31   61:goto            31
		StringBuilder stringbuilder = new StringBuilder();
	//   32   64:new             #682 <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #683 <Method void StringBuilder()>
	//   35   71:astore          4
		stringbuilder.append(charsequence1).append(' ').append(charsequence);
	//   36   73:aload           4
	//   37   75:aload_3         
	//   38   76:invokevirtual   #687 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   39   79:bipush          32
	//   40   81:invokevirtual   #690 <Method StringBuilder StringBuilder.append(char)>
	//   41   84:aload_2         
	//   42   85:invokevirtual   #687 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   43   88:pop             
		accessibilitynodeinfo.setText(((CharSequence) (stringbuilder)));
	//   44   89:aload_1         
	//   45   90:aload           4
	//   46   92:invokevirtual   #680 <Method void AccessibilityNodeInfo.setText(CharSequence)>
	//   47   95:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		super.onLayout(flag, i, j, k, l);
	//    2    3:aload_0         
	//    3    4:iload_1         
	//    4    5:iload_2         
	//    5    6:iload_3         
	//    6    7:iload           4
	//    7    9:iload           5
	//    8   11:invokespecial   #694 <Method void CompoundButton.onLayout(boolean, int, int, int, int)>
		if(mThumbDrawable != null)
	//*   9   14:aload_0         
	//*  10   15:getfield        #183 <Field Drawable mThumbDrawable>
	//*  11   18:ifnull          274
		{
			Rect rect = mTempRect;
	//   12   21:aload_0         
	//   13   22:getfield        #140 <Field Rect mTempRect>
	//   14   25:astore          7
			Rect rect1;
			if(mTrackDrawable != null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #194 <Field Drawable mTrackDrawable>
	//*  17   31:ifnull          183
				mTrackDrawable.getPadding(rect);
	//   18   34:aload_0         
	//   19   35:getfield        #194 <Field Drawable mTrackDrawable>
	//   20   38:aload           7
	//   21   40:invokevirtual   #405 <Method boolean Drawable.getPadding(Rect)>
	//   22   43:pop             
			else
	//*  23   44:aload_0         
	//*  24   45:getfield        #183 <Field Drawable mThumbDrawable>
	//*  25   48:invokestatic    #409 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//*  26   51:astore          8
	//*  27   53:iconst_0        
	//*  28   54:aload           8
	//*  29   56:getfield        #416 <Field int Rect.left>
	//*  30   59:aload           7
	//*  31   61:getfield        #416 <Field int Rect.left>
	//*  32   64:isub            
	//*  33   65:invokestatic    #697 <Method int Math.max(int, int)>
	//*  34   68:istore_3        
	//*  35   69:iconst_0        
	//*  36   70:aload           8
	//*  37   72:getfield        #419 <Field int Rect.right>
	//*  38   75:aload           7
	//*  39   77:getfield        #419 <Field int Rect.right>
	//*  40   80:isub            
	//*  41   81:invokestatic    #697 <Method int Math.max(int, int)>
	//*  42   84:istore_2        
	//*  43   85:aload_0         
	//*  44   86:invokestatic    #398 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  45   89:ifeq            191
	//*  46   92:aload_0         
	//*  47   93:invokevirtual   #700 <Method int getPaddingLeft()>
	//*  48   96:iload_3         
	//*  49   97:iadd            
	//*  50   98:istore          4
	//*  51  100:aload_0         
	//*  52  101:getfield        #411 <Field int mSwitchWidth>
	//*  53  104:iload           4
	//*  54  106:iadd            
	//*  55  107:iload_3         
	//*  56  108:isub            
	//*  57  109:iload_2         
	//*  58  110:isub            
	//*  59  111:istore          5
	//*  60  113:aload_0         
	//*  61  114:invokevirtual   #703 <Method int getGravity()>
	//*  62  117:bipush          112
	//*  63  119:iand            
	//*  64  120:lookupswitch    2: default 148
	//	               16: 220
	//	               80: 254
	//*  65  148:aload_0         
	//*  66  149:invokevirtual   #706 <Method int getPaddingTop()>
	//*  67  152:istore_3        
	//*  68  153:aload_0         
	//*  69  154:getfield        #708 <Field int mSwitchHeight>
	//*  70  157:iload_3         
	//*  71  158:iadd            
	//*  72  159:istore_2        
	//*  73  160:aload_0         
	//*  74  161:iload           4
	//*  75  163:putfield        #430 <Field int mSwitchLeft>
	//*  76  166:aload_0         
	//*  77  167:iload_3         
	//*  78  168:putfield        #428 <Field int mSwitchTop>
	//*  79  171:aload_0         
	//*  80  172:iload_2         
	//*  81  173:putfield        #432 <Field int mSwitchBottom>
	//*  82  176:aload_0         
	//*  83  177:iload           5
	//*  84  179:putfield        #512 <Field int mSwitchRight>
	//*  85  182:return          
				rect.setEmpty();
	//   86  183:aload           7
	//   87  185:invokevirtual   #656 <Method void Rect.setEmpty()>
			rect1 = DrawableUtils.getOpticalBounds(mThumbDrawable);
			j = Math.max(0, rect1.left - rect.left);
			i = Math.max(0, rect1.right - rect.right);
		} else
	//*  88  188:goto            44
	//*  89  191:aload_0         
	//*  90  192:invokevirtual   #659 <Method int getWidth()>
	//*  91  195:aload_0         
	//*  92  196:invokevirtual   #711 <Method int getPaddingRight()>
	//*  93  199:isub            
	//*  94  200:iload_2         
	//*  95  201:isub            
	//*  96  202:istore          5
	//*  97  204:iload_2         
	//*  98  205:iload_3         
	//*  99  206:iload           5
	//* 100  208:aload_0         
	//* 101  209:getfield        #411 <Field int mSwitchWidth>
	//* 102  212:isub            
	//* 103  213:iadd            
	//* 104  214:iadd            
	//* 105  215:istore          4
	//* 106  217:goto            113
	//* 107  220:aload_0         
	//* 108  221:invokevirtual   #706 <Method int getPaddingTop()>
	//* 109  224:aload_0         
	//* 110  225:invokevirtual   #712 <Method int getHeight()>
	//* 111  228:iadd            
	//* 112  229:aload_0         
	//* 113  230:invokevirtual   #715 <Method int getPaddingBottom()>
	//* 114  233:isub            
	//* 115  234:iconst_2        
	//* 116  235:idiv            
	//* 117  236:aload_0         
	//* 118  237:getfield        #708 <Field int mSwitchHeight>
	//* 119  240:iconst_2        
	//* 120  241:idiv            
	//* 121  242:isub            
	//* 122  243:istore_3        
	//* 123  244:aload_0         
	//* 124  245:getfield        #708 <Field int mSwitchHeight>
	//* 125  248:iload_3         
	//* 126  249:iadd            
	//* 127  250:istore_2        
	//* 128  251:goto            160
	//* 129  254:aload_0         
	//* 130  255:invokevirtual   #712 <Method int getHeight()>
	//* 131  258:aload_0         
	//* 132  259:invokevirtual   #715 <Method int getPaddingBottom()>
	//* 133  262:isub            
	//* 134  263:istore_2        
	//* 135  264:iload_2         
	//* 136  265:aload_0         
	//* 137  266:getfield        #708 <Field int mSwitchHeight>
	//* 138  269:isub            
	//* 139  270:istore_3        
	//* 140  271:goto            160
		{
			j = 0;
	//  141  274:iconst_0        
	//  142  275:istore_3        
			i = ((int) (flag1));
	//  143  276:iload           6
	//  144  278:istore_2        
		}
		if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
		{
			k = getPaddingLeft() + j;
			l = (mSwitchWidth + k) - j - i;
		} else
		{
			l = getWidth() - getPaddingRight() - i;
			k = i + (j + (l - mSwitchWidth));
		}
		getGravity() & 0x70;
		JVM INSTR lookupswitch 2: default 148
	//	               16: 220
	//	               80: 254;
		   goto _L1 _L2 _L3
_L1:
		j = getPaddingTop();
		i = mSwitchHeight + j;
_L5:
		mSwitchLeft = k;
		mSwitchTop = j;
		mSwitchBottom = i;
		mSwitchRight = l;
		return;
_L2:
		j = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - mSwitchHeight / 2;
		i = mSwitchHeight + j;
		continue; /* Loop/switch isn't completed */
_L3:
		i = getHeight() - getPaddingBottom();
		j = i - mSwitchHeight;
		if(true) goto _L5; else goto _L4
_L4:
	//* 145  279:goto            85
	}

	public void onMeasure(int i, int j)
	{
		int j1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		if(mShowText)
	//*   2    3:aload_0         
	//*   3    4:getfield        #217 <Field boolean mShowText>
	//*   4    7:ifeq            48
		{
			if(mOnLayout == null)
	//*   5   10:aload_0         
	//*   6   11:getfield        #625 <Field Layout mOnLayout>
	//*   7   14:ifnonnull       29
				mOnLayout = makeLayout(mTextOn);
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #203 <Field CharSequence mTextOn>
	//   12   23:invokespecial   #718 <Method Layout makeLayout(CharSequence)>
	//   13   26:putfield        #625 <Field Layout mOnLayout>
			if(mOffLayout == null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #658 <Field Layout mOffLayout>
	//*  16   33:ifnonnull       48
				mOffLayout = makeLayout(mTextOff);
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:aload_0         
	//   20   39:getfield        #208 <Field CharSequence mTextOff>
	//   21   42:invokespecial   #718 <Method Layout makeLayout(CharSequence)>
	//   22   45:putfield        #658 <Field Layout mOffLayout>
		}
		Rect rect = mTempRect;
	//   23   48:aload_0         
	//   24   49:getfield        #140 <Field Rect mTempRect>
	//   25   52:astore          9
		int k;
		int l;
		int i1;
		int k1;
		int l1;
		if(mThumbDrawable != null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #183 <Field Drawable mThumbDrawable>
	//*  28   58:ifnull          295
		{
			mThumbDrawable.getPadding(rect);
	//   29   61:aload_0         
	//   30   62:getfield        #183 <Field Drawable mThumbDrawable>
	//   31   65:aload           9
	//   32   67:invokevirtual   #405 <Method boolean Drawable.getPadding(Rect)>
	//   33   70:pop             
			l = mThumbDrawable.getIntrinsicWidth() - rect.left - rect.right;
	//   34   71:aload_0         
	//   35   72:getfield        #183 <Field Drawable mThumbDrawable>
	//   36   75:invokevirtual   #721 <Method int Drawable.getIntrinsicWidth()>
	//   37   78:aload           9
	//   38   80:getfield        #416 <Field int Rect.left>
	//   39   83:isub            
	//   40   84:aload           9
	//   41   86:getfield        #419 <Field int Rect.right>
	//   42   89:isub            
	//   43   90:istore          4
			k = mThumbDrawable.getIntrinsicHeight();
	//   44   92:aload_0         
	//   45   93:getfield        #183 <Field Drawable mThumbDrawable>
	//   46   96:invokevirtual   #724 <Method int Drawable.getIntrinsicHeight()>
	//   47   99:istore_3        
		} else
	//*  48  100:aload_0         
	//*  49  101:getfield        #217 <Field boolean mShowText>
	//*  50  104:ifeq            303
	//*  51  107:aload_0         
	//*  52  108:getfield        #625 <Field Layout mOnLayout>
	//*  53  111:invokevirtual   #646 <Method int Layout.getWidth()>
	//*  54  114:aload_0         
	//*  55  115:getfield        #658 <Field Layout mOffLayout>
	//*  56  118:invokevirtual   #646 <Method int Layout.getWidth()>
	//*  57  121:invokestatic    #697 <Method int Math.max(int, int)>
	//*  58  124:aload_0         
	//*  59  125:getfield        #226 <Field int mThumbTextPadding>
	//*  60  128:iconst_2        
	//*  61  129:imul            
	//*  62  130:iadd            
	//*  63  131:istore          5
	//*  64  133:aload_0         
	//*  65  134:iload           5
	//*  66  136:iload           4
	//*  67  138:invokestatic    #697 <Method int Math.max(int, int)>
	//*  68  141:putfield        #413 <Field int mThumbWidth>
	//*  69  144:aload_0         
	//*  70  145:getfield        #194 <Field Drawable mTrackDrawable>
	//*  71  148:ifnull          309
	//*  72  151:aload_0         
	//*  73  152:getfield        #194 <Field Drawable mTrackDrawable>
	//*  74  155:aload           9
	//*  75  157:invokevirtual   #405 <Method boolean Drawable.getPadding(Rect)>
	//*  76  160:pop             
	//*  77  161:aload_0         
	//*  78  162:getfield        #194 <Field Drawable mTrackDrawable>
	//*  79  165:invokevirtual   #724 <Method int Drawable.getIntrinsicHeight()>
	//*  80  168:istore          4
	//*  81  170:aload           9
	//*  82  172:getfield        #416 <Field int Rect.left>
	//*  83  175:istore          8
	//*  84  177:aload           9
	//*  85  179:getfield        #419 <Field int Rect.right>
	//*  86  182:istore          7
	//*  87  184:iload           7
	//*  88  186:istore          6
	//*  89  188:iload           8
	//*  90  190:istore          5
	//*  91  192:aload_0         
	//*  92  193:getfield        #183 <Field Drawable mThumbDrawable>
	//*  93  196:ifnull          232
	//*  94  199:aload_0         
	//*  95  200:getfield        #183 <Field Drawable mThumbDrawable>
	//*  96  203:invokestatic    #409 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//*  97  206:astore          9
	//*  98  208:iload           8
	//*  99  210:aload           9
	//* 100  212:getfield        #416 <Field int Rect.left>
	//* 101  215:invokestatic    #697 <Method int Math.max(int, int)>
	//* 102  218:istore          5
	//* 103  220:iload           7
	//* 104  222:aload           9
	//* 105  224:getfield        #419 <Field int Rect.right>
	//* 106  227:invokestatic    #697 <Method int Math.max(int, int)>
	//* 107  230:istore          6
	//* 108  232:aload_0         
	//* 109  233:getfield        #231 <Field int mSwitchMinWidth>
	//* 110  236:iload           6
	//* 111  238:iload           5
	//* 112  240:aload_0         
	//* 113  241:getfield        #413 <Field int mThumbWidth>
	//* 114  244:iconst_2        
	//* 115  245:imul            
	//* 116  246:iadd            
	//* 117  247:iadd            
	//* 118  248:invokestatic    #697 <Method int Math.max(int, int)>
	//* 119  251:istore          5
	//* 120  253:iload           4
	//* 121  255:iload_3         
	//* 122  256:invokestatic    #697 <Method int Math.max(int, int)>
	//* 123  259:istore_3        
	//* 124  260:aload_0         
	//* 125  261:iload           5
	//* 126  263:putfield        #411 <Field int mSwitchWidth>
	//* 127  266:aload_0         
	//* 128  267:iload_3         
	//* 129  268:putfield        #708 <Field int mSwitchHeight>
	//* 130  271:aload_0         
	//* 131  272:iload_1         
	//* 132  273:iload_2         
	//* 133  274:invokespecial   #726 <Method void CompoundButton.onMeasure(int, int)>
	//* 134  277:aload_0         
	//* 135  278:invokevirtual   #729 <Method int getMeasuredHeight()>
	//* 136  281:iload_3         
	//* 137  282:icmpge          294
	//* 138  285:aload_0         
	//* 139  286:aload_0         
	//* 140  287:invokevirtual   #732 <Method int getMeasuredWidthAndState()>
	//* 141  290:iload_3         
	//* 142  291:invokevirtual   #735 <Method void setMeasuredDimension(int, int)>
	//* 143  294:return          
		{
			k = 0;
	//  144  295:iconst_0        
	//  145  296:istore_3        
			l = 0;
	//  146  297:iconst_0        
	//  147  298:istore          4
		}
		if(mShowText)
			i1 = Math.max(mOnLayout.getWidth(), mOffLayout.getWidth()) + mThumbTextPadding * 2;
		else
	//* 148  300:goto            100
			i1 = 0;
	//  149  303:iconst_0        
	//  150  304:istore          5
		mThumbWidth = Math.max(i1, l);
		if(mTrackDrawable != null)
		{
			mTrackDrawable.getPadding(rect);
			l = mTrackDrawable.getIntrinsicHeight();
		} else
	//* 151  306:goto            133
		{
			rect.setEmpty();
	//  152  309:aload           9
	//  153  311:invokevirtual   #656 <Method void Rect.setEmpty()>
			l = j1;
	//  154  314:iload           6
	//  155  316:istore          4
		}
		l1 = rect.left;
		k1 = rect.right;
		j1 = k1;
		i1 = l1;
		if(mThumbDrawable != null)
		{
			rect = DrawableUtils.getOpticalBounds(mThumbDrawable);
			i1 = Math.max(l1, rect.left);
			j1 = Math.max(k1, rect.right);
		}
		i1 = Math.max(mSwitchMinWidth, j1 + (i1 + mThumbWidth * 2));
		k = Math.max(l, k);
		mSwitchWidth = i1;
		mSwitchHeight = k;
		super.onMeasure(i, j);
		if(getMeasuredHeight() < k)
			setMeasuredDimension(getMeasuredWidthAndState(), k);
	//* 156  318:goto            170
	}

	public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onPopulateAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #738 <Method void CompoundButton.onPopulateAccessibilityEvent(AccessibilityEvent)>
		CharSequence charsequence;
		if(isChecked())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #309 <Method boolean isChecked()>
	//*   5    9:ifeq            33
			charsequence = mTextOn;
	//    6   12:aload_0         
	//    7   13:getfield        #203 <Field CharSequence mTextOn>
	//    8   16:astore_2        
		else
	//*   9   17:aload_2         
	//*  10   18:ifnull          32
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #741 <Method List AccessibilityEvent.getText()>
	//*  13   25:aload_2         
	//*  14   26:invokeinterface #747 <Method boolean List.add(Object)>
	//*  15   31:pop             
	//*  16   32:return          
			charsequence = mTextOff;
	//   17   33:aload_0         
	//   18   34:getfield        #208 <Field CharSequence mTextOff>
	//   19   37:astore_2        
		if(charsequence != null)
			accessibilityevent.getText().add(((Object) (charsequence)));
	//*  20   38:goto            17
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		mVelocityTracker.addMovement(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field VelocityTracker mVelocityTracker>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #750 <Method void VelocityTracker.addMovement(MotionEvent)>
		motionevent.getActionMasked();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #753 <Method int MotionEvent.getActionMasked()>
		JVM INSTR tableswitch 0 3: default 44
	//	               0 50
	//	               1 295
	//	               2 94
	//	               3 295;
	//    6   12:tableswitch     0 3: default 44
	//	               0 50
	//	               1 295
	//	               2 94
	//	               3 295
		   goto _L1 _L2 _L3 _L4 _L3
_L1:
		return super.onTouchEvent(motionevent);
	//    7   44:aload_0         
	//    8   45:aload_1         
	//    9   46:invokespecial   #386 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//   10   49:ireturn         
_L2:
		float f = motionevent.getX();
	//   11   50:aload_1         
	//   12   51:invokevirtual   #756 <Method float MotionEvent.getX()>
	//   13   54:fstore_2        
		float f3 = motionevent.getY();
	//   14   55:aload_1         
	//   15   56:invokevirtual   #759 <Method float MotionEvent.getY()>
	//   16   59:fstore_3        
		if(isEnabled() && hitThumb(f, f3))
	//*  17   60:aload_0         
	//*  18   61:invokevirtual   #490 <Method boolean isEnabled()>
	//*  19   64:ifeq            44
	//*  20   67:aload_0         
	//*  21   68:fload_2         
	//*  22   69:fload_3         
	//*  23   70:invokespecial   #761 <Method boolean hitThumb(float, float)>
	//*  24   73:ifeq            44
		{
			mTouchMode = 1;
	//   25   76:aload_0         
	//   26   77:iconst_1        
	//   27   78:putfield        #484 <Field int mTouchMode>
			mTouchX = f;
	//   28   81:aload_0         
	//   29   82:fload_2         
	//   30   83:putfield        #763 <Field float mTouchX>
			mTouchY = f3;
	//   31   86:aload_0         
	//   32   87:fload_3         
	//   33   88:putfield        #765 <Field float mTouchY>
		}
		continue; /* Loop/switch isn't completed */
	//   34   91:goto            44
_L4:
		switch(mTouchMode)
	//*  35   94:aload_0         
	//*  36   95:getfield        #484 <Field int mTouchMode>
		{
	//*  37   98:tableswitch     0 2: default 124
	//	               0 44
	//	               1 127
	//	               2 200
	//*  38  124:goto            44
		case 1: // '\001'
			float f1 = motionevent.getX();
	//   39  127:aload_1         
	//   40  128:invokevirtual   #756 <Method float MotionEvent.getX()>
	//   41  131:fstore_2        
			float f4 = motionevent.getY();
	//   42  132:aload_1         
	//   43  133:invokevirtual   #759 <Method float MotionEvent.getY()>
	//   44  136:fstore_3        
			if(Math.abs(f1 - mTouchX) > (float)mTouchSlop || Math.abs(f4 - mTouchY) > (float)mTouchSlop)
	//*  45  137:fload_2         
	//*  46  138:aload_0         
	//*  47  139:getfield        #763 <Field float mTouchX>
	//*  48  142:fsub            
	//*  49  143:invokestatic    #501 <Method float Math.abs(float)>
	//*  50  146:aload_0         
	//*  51  147:getfield        #297 <Field int mTouchSlop>
	//*  52  150:i2f             
	//*  53  151:fcmpl           
	//*  54  152:ifgt            173
	//*  55  155:fload_3         
	//*  56  156:aload_0         
	//*  57  157:getfield        #765 <Field float mTouchY>
	//*  58  160:fsub            
	//*  59  161:invokestatic    #501 <Method float Math.abs(float)>
	//*  60  164:aload_0         
	//*  61  165:getfield        #297 <Field int mTouchSlop>
	//*  62  168:i2f             
	//*  63  169:fcmpl           
	//*  64  170:ifle            44
			{
				mTouchMode = 2;
	//   65  173:aload_0         
	//   66  174:iconst_2        
	//   67  175:putfield        #484 <Field int mTouchMode>
				getParent().requestDisallowInterceptTouchEvent(true);
	//   68  178:aload_0         
	//   69  179:invokevirtual   #769 <Method ViewParent getParent()>
	//   70  182:iconst_1        
	//   71  183:invokeinterface #774 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				mTouchX = f1;
	//   72  188:aload_0         
	//   73  189:fload_2         
	//   74  190:putfield        #763 <Field float mTouchX>
				mTouchY = f4;
	//   75  193:aload_0         
	//   76  194:fload_3         
	//   77  195:putfield        #765 <Field float mTouchY>
				return true;
	//   78  198:iconst_1        
	//   79  199:ireturn         
			}
			break;

		case 2: // '\002'
			float f6 = motionevent.getX();
	//   80  200:aload_1         
	//   81  201:invokevirtual   #756 <Method float MotionEvent.getX()>
	//   82  204:fstore          4
			int i = getThumbScrollRange();
	//   83  206:aload_0         
	//   84  207:invokespecial   #401 <Method int getThumbScrollRange()>
	//   85  210:istore          5
			float f2 = f6 - mTouchX;
	//   86  212:fload           4
	//   87  214:aload_0         
	//   88  215:getfield        #763 <Field float mTouchX>
	//   89  218:fsub            
	//   90  219:fstore_2        
			float f5;
			if(i != 0)
	//*  91  220:iload           5
	//*  92  222:ifeq            277
				f2 /= i;
	//   93  225:fload_2         
	//   94  226:iload           5
	//   95  228:i2f             
	//   96  229:fdiv            
	//   97  230:fstore_2        
			else
	//*  98  231:fload_2         
	//*  99  232:fstore_3        
	//* 100  233:aload_0         
	//* 101  234:invokestatic    #398 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//* 102  237:ifeq            243
	//* 103  240:fload_2         
	//* 104  241:fneg            
	//* 105  242:fstore_3        
	//* 106  243:fload_3         
	//* 107  244:aload_0         
	//* 108  245:getfield        #317 <Field float mThumbPosition>
	//* 109  248:fadd            
	//* 110  249:fconst_0        
	//* 111  250:fconst_1        
	//* 112  251:invokestatic    #776 <Method float constrain(float, float, float)>
	//* 113  254:fstore_2        
	//* 114  255:fload_2         
	//* 115  256:aload_0         
	//* 116  257:getfield        #317 <Field float mThumbPosition>
	//* 117  260:fcmpl           
	//* 118  261:ifeq            275
	//* 119  264:aload_0         
	//* 120  265:fload           4
	//* 121  267:putfield        #763 <Field float mTouchX>
	//* 122  270:aload_0         
	//* 123  271:fload_2         
	//* 124  272:invokevirtual   #780 <Method void setThumbPosition(float)>
	//* 125  275:iconst_1        
	//* 126  276:ireturn         
			if(f2 > 0.0F)
	//* 127  277:fload_2         
	//* 128  278:fconst_0        
	//* 129  279:fcmpl           
	//* 130  280:ifle            288
				f2 = 1.0F;
	//  131  283:fconst_1        
	//  132  284:fstore_2        
			else
	//* 133  285:goto            231
				f2 = -1F;
	//  134  288:ldc2            #781 <Float -1F>
	//  135  291:fstore_2        
			f5 = f2;
			if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
				f5 = -f2;
			f2 = constrain(f5 + mThumbPosition, 0.0F, 1.0F);
			if(f2 != mThumbPosition)
			{
				mTouchX = f6;
				setThumbPosition(f2);
			}
			return true;
		}
		continue; /* Loop/switch isn't completed */
	//  136  292:goto            231
_L3:
		if(mTouchMode == 2)
	//* 137  295:aload_0         
	//* 138  296:getfield        #484 <Field int mTouchMode>
	//* 139  299:iconst_2        
	//* 140  300:icmpne          316
		{
			stopDrag(motionevent);
	//  141  303:aload_0         
	//  142  304:aload_1         
	//  143  305:invokespecial   #783 <Method void stopDrag(MotionEvent)>
			super.onTouchEvent(motionevent);
	//  144  308:aload_0         
	//  145  309:aload_1         
	//  146  310:invokespecial   #386 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//  147  313:pop             
			return true;
	//  148  314:iconst_1        
	//  149  315:ireturn         
		}
		mTouchMode = 0;
	//  150  316:aload_0         
	//  151  317:iconst_0        
	//  152  318:putfield        #484 <Field int mTouchMode>
		mVelocityTracker.clear();
	//  153  321:aload_0         
	//  154  322:getfield        #134 <Field VelocityTracker mVelocityTracker>
	//  155  325:invokevirtual   #786 <Method void VelocityTracker.clear()>
		if(true) goto _L1; else goto _L5
	//  156  328:goto            44
_L5:
	}

	public void setChecked(boolean flag)
	{
		super.setChecked(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #787 <Method void CompoundButton.setChecked(boolean)>
		flag = isChecked();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #309 <Method boolean isChecked()>
	//    5    9:istore_1        
		if(getWindowToken() != null && ViewCompat.isLaidOut(((android.view.View) (this))))
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #791 <Method android.os.IBinder getWindowToken()>
	//*   8   14:ifnull          30
	//*   9   17:aload_0         
	//*  10   18:invokestatic    #796 <Method boolean ViewCompat.isLaidOut(android.view.View)>
	//*  11   21:ifeq            30
		{
			animateThumbToCheckedState(flag);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #798 <Method void animateThumbToCheckedState(boolean)>
			return;
	//   15   29:return          
		}
		cancelPositionAnimator();
	//   16   30:aload_0         
	//   17   31:invokespecial   #800 <Method void cancelPositionAnimator()>
		float f;
		if(flag)
	//*  18   34:iload_1         
	//*  19   35:ifeq            46
			f = 1.0F;
	//   20   38:fconst_1        
	//   21   39:fstore_2        
		else
	//*  22   40:aload_0         
	//*  23   41:fload_2         
	//*  24   42:invokevirtual   #780 <Method void setThumbPosition(float)>
	//*  25   45:return          
			f = 0.0F;
	//   26   46:fconst_0        
	//   27   47:fstore_2        
		setThumbPosition(f);
	//*  28   48:goto            40
	}

	public void setShowText(boolean flag)
	{
		if(mShowText != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field boolean mShowText>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mShowText = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #217 <Field boolean mShowText>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #804 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setSplitTrack(boolean flag)
	{
		mSplitTrack = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #241 <Field boolean mSplitTrack>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #545 <Method void invalidate()>
	//    5    9:return          
	}

	public void setSwitchMinWidth(int i)
	{
		mSwitchMinWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #231 <Field int mSwitchMinWidth>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #804 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setSwitchPadding(int i)
	{
		mSwitchPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #236 <Field int mSwitchPadding>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #804 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setSwitchTextAppearance(Context context, int i)
	{
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, i, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #810 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    3    5:invokestatic    #813 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    4    8:astore_1        
		ColorStateList colorstatelist = ((TintTypedArray) (context)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//    5    9:aload_1         
	//    6   10:getstatic       #816 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//    7   13:invokevirtual   #248 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//    8   16:astore_3        
		if(colorstatelist != null)
	//*   9   17:aload_3         
	//*  10   18:ifnull          116
			mTextColors = colorstatelist;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #627 <Field ColorStateList mTextColors>
		else
	//*  14   26:aload_1         
	//*  15   27:getstatic       #819 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//*  16   30:iconst_0        
	//*  17   31:invokevirtual   #224 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//*  18   34:istore_2        
	//*  19   35:iload_2         
	//*  20   36:ifeq            65
	//*  21   39:iload_2         
	//*  22   40:i2f             
	//*  23   41:aload_0         
	//*  24   42:getfield        #147 <Field TextPaint mTextPaint>
	//*  25   45:invokevirtual   #822 <Method float TextPaint.getTextSize()>
	//*  26   48:fcmpl           
	//*  27   49:ifeq            65
	//*  28   52:aload_0         
	//*  29   53:getfield        #147 <Field TextPaint mTextPaint>
	//*  30   56:iload_2         
	//*  31   57:i2f             
	//*  32   58:invokevirtual   #825 <Method void TextPaint.setTextSize(float)>
	//*  33   61:aload_0         
	//*  34   62:invokevirtual   #804 <Method void requestLayout()>
	//*  35   65:aload_0         
	//*  36   66:aload_1         
	//*  37   67:getstatic       #828 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//*  38   70:iconst_m1       
	//*  39   71:invokevirtual   #254 <Method int TintTypedArray.getInt(int, int)>
	//*  40   74:aload_1         
	//*  41   75:getstatic       #831 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textStyle>
	//*  42   78:iconst_m1       
	//*  43   79:invokevirtual   #254 <Method int TintTypedArray.getInt(int, int)>
	//*  44   82:invokespecial   #833 <Method void setSwitchTypefaceByIndex(int, int)>
	//*  45   85:aload_1         
	//*  46   86:getstatic       #836 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*  47   89:iconst_0        
	//*  48   90:invokevirtual   #215 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//*  49   93:ifeq            127
	//*  50   96:aload_0         
	//*  51   97:new             #838 <Class AllCapsTransformationMethod>
	//*  52  100:dup             
	//*  53  101:aload_0         
	//*  54  102:invokevirtual   #842 <Method Context getContext()>
	//*  55  105:invokespecial   #844 <Method void AllCapsTransformationMethod(Context)>
	//*  56  108:putfield        #436 <Field TransformationMethod mSwitchTransformationMethod>
	//*  57  111:aload_1         
	//*  58  112:invokevirtual   #285 <Method void TintTypedArray.recycle()>
	//*  59  115:return          
			mTextColors = getTextColors();
	//   60  116:aload_0         
	//   61  117:aload_0         
	//   62  118:invokevirtual   #847 <Method ColorStateList getTextColors()>
	//   63  121:putfield        #627 <Field ColorStateList mTextColors>
		i = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
		if(i != 0 && (float)i != mTextPaint.getTextSize())
		{
			mTextPaint.setTextSize(i);
			requestLayout();
		}
		setSwitchTypefaceByIndex(((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface, -1), ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle, -1));
		if(((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false))
			mSwitchTransformationMethod = ((TransformationMethod) (new AllCapsTransformationMethod(getContext())));
		else
	//*  64  124:goto            26
			mSwitchTransformationMethod = null;
	//   65  127:aload_0         
	//   66  128:aconst_null     
	//   67  129:putfield        #436 <Field TransformationMethod mSwitchTransformationMethod>
		((TintTypedArray) (context)).recycle();
	//*  68  132:goto            111
	}

	public void setSwitchTypeface(Typeface typeface)
	{
		if(mTextPaint.getTypeface() != null && !mTextPaint.getTypeface().equals(((Object) (typeface))) || mTextPaint.getTypeface() == null && typeface != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field TextPaint mTextPaint>
	//*   2    4:invokevirtual   #852 <Method Typeface TextPaint.getTypeface()>
	//*   3    7:ifnull          24
	//*   4   10:aload_0         
	//*   5   11:getfield        #147 <Field TextPaint mTextPaint>
	//*   6   14:invokevirtual   #852 <Method Typeface TextPaint.getTypeface()>
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #855 <Method boolean Typeface.equals(Object)>
	//*   9   21:ifeq            38
	//*  10   24:aload_0         
	//*  11   25:getfield        #147 <Field TextPaint mTextPaint>
	//*  12   28:invokevirtual   #852 <Method Typeface TextPaint.getTypeface()>
	//*  13   31:ifnonnull       55
	//*  14   34:aload_1         
	//*  15   35:ifnull          55
		{
			mTextPaint.setTypeface(typeface);
	//   16   38:aload_0         
	//   17   39:getfield        #147 <Field TextPaint mTextPaint>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #859 <Method Typeface TextPaint.setTypeface(Typeface)>
	//   20   46:pop             
			requestLayout();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #804 <Method void requestLayout()>
			invalidate();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #545 <Method void invalidate()>
		}
	//   25   55:return          
	}

	public void setSwitchTypeface(Typeface typeface, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		if(i > 0)
	//*   2    3:iload_2         
	//*   3    4:ifle            99
		{
			float f;
			int j;
			if(typeface == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       79
				typeface = Typeface.defaultFromStyle(i);
	//    6   11:iload_2         
	//    7   12:invokestatic    #863 <Method Typeface Typeface.defaultFromStyle(int)>
	//    8   15:astore_1        
			else
	//*   9   16:aload_0         
	//*  10   17:aload_1         
	//*  11   18:invokevirtual   #865 <Method void setSwitchTypeface(Typeface)>
	//*  12   21:aload_1         
	//*  13   22:ifnull          88
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #868 <Method int Typeface.getStyle()>
	//*  16   29:istore          4
	//*  17   31:iload           4
	//*  18   33:iconst_m1       
	//*  19   34:ixor            
	//*  20   35:iload_2         
	//*  21   36:iand            
	//*  22   37:istore_2        
	//*  23   38:aload_0         
	//*  24   39:getfield        #147 <Field TextPaint mTextPaint>
	//*  25   42:astore_1        
	//*  26   43:iload_2         
	//*  27   44:iconst_1        
	//*  28   45:iand            
	//*  29   46:ifeq            52
	//*  30   49:iconst_1        
	//*  31   50:istore          5
	//*  32   52:aload_1         
	//*  33   53:iload           5
	//*  34   55:invokevirtual   #871 <Method void TextPaint.setFakeBoldText(boolean)>
	//*  35   58:aload_0         
	//*  36   59:getfield        #147 <Field TextPaint mTextPaint>
	//*  37   62:astore_1        
	//*  38   63:iload_2         
	//*  39   64:iconst_2        
	//*  40   65:iand            
	//*  41   66:ifeq            94
	//*  42   69:ldc2            #872 <Float -0.25F>
	//*  43   72:fstore_3        
	//*  44   73:aload_1         
	//*  45   74:fload_3         
	//*  46   75:invokevirtual   #875 <Method void TextPaint.setTextSkewX(float)>
	//*  47   78:return          
				typeface = Typeface.create(typeface, i);
	//   48   79:aload_1         
	//   49   80:iload_2         
	//   50   81:invokestatic    #879 <Method Typeface Typeface.create(Typeface, int)>
	//   51   84:astore_1        
			setSwitchTypeface(typeface);
			if(typeface != null)
				j = typeface.getStyle();
			else
	//*  52   85:goto            16
				j = 0;
	//   53   88:iconst_0        
	//   54   89:istore          4
			i = ~j & i;
			typeface = ((Typeface) (mTextPaint));
			if((i & 1) != 0)
				flag = true;
			((TextPaint) (typeface)).setFakeBoldText(flag);
			typeface = ((Typeface) (mTextPaint));
			if((i & 2) != 0)
				f = -0.25F;
			else
	//*  55   91:goto            31
				f = 0.0F;
	//   56   94:fconst_0        
	//   57   95:fstore_3        
			((TextPaint) (typeface)).setTextSkewX(f);
			return;
		} else
	//*  58   96:goto            73
		{
			mTextPaint.setFakeBoldText(false);
	//   59   99:aload_0         
	//   60  100:getfield        #147 <Field TextPaint mTextPaint>
	//   61  103:iconst_0        
	//   62  104:invokevirtual   #871 <Method void TextPaint.setFakeBoldText(boolean)>
			mTextPaint.setTextSkewX(0.0F);
	//   63  107:aload_0         
	//   64  108:getfield        #147 <Field TextPaint mTextPaint>
	//   65  111:fconst_0        
	//   66  112:invokevirtual   #875 <Method void TextPaint.setTextSkewX(float)>
			setSwitchTypeface(typeface);
	//   67  115:aload_0         
	//   68  116:aload_1         
	//   69  117:invokevirtual   #865 <Method void setSwitchTypeface(Typeface)>
			return;
	//   70  120:return          
		}
	}

	public void setTextOff(CharSequence charsequence)
	{
		mTextOff = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #208 <Field CharSequence mTextOff>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #804 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTextOn(CharSequence charsequence)
	{
		mTextOn = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #203 <Field CharSequence mTextOn>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #804 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setThumbDrawable(Drawable drawable)
	{
		if(mThumbDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field Drawable mThumbDrawable>
	//*   2    4:ifnull          15
			mThumbDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #183 <Field Drawable mThumbDrawable>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #189 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mThumbDrawable = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #183 <Field Drawable mThumbDrawable>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #189 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #804 <Method void requestLayout()>
	//   17   33:return          
	}

	void setThumbPosition(float f)
	{
		mThumbPosition = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #317 <Field float mThumbPosition>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #545 <Method void invalidate()>
	//    5    9:return          
	}

	public void setThumbResource(int i)
	{
		setThumbDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #842 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #889 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #891 <Method void setThumbDrawable(Drawable)>
	//    6   12:return          
	}

	public void setThumbTextPadding(int i)
	{
		mThumbTextPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #226 <Field int mThumbTextPadding>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #804 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setThumbTintList(ColorStateList colorstatelist)
	{
		mThumbTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #112 <Field ColorStateList mThumbTintList>
		mHasThumbTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #116 <Field boolean mHasThumbTint>
		applyThumbTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #263 <Method void applyThumbTint()>
	//    8   14:return          
	}

	public void setThumbTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mThumbTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #114 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
		mHasThumbTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #118 <Field boolean mHasThumbTintMode>
		applyThumbTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #263 <Method void applyThumbTint()>
	//    8   14:return          
	}

	public void setTrackDrawable(Drawable drawable)
	{
		if(mTrackDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field Drawable mTrackDrawable>
	//*   2    4:ifnull          15
			mTrackDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #194 <Field Drawable mTrackDrawable>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #189 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTrackDrawable = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #194 <Field Drawable mTrackDrawable>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #189 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #804 <Method void requestLayout()>
	//   17   33:return          
	}

	public void setTrackResource(int i)
	{
		setTrackDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #842 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #889 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #901 <Method void setTrackDrawable(Drawable)>
	//    6   12:return          
	}

	public void setTrackTintList(ColorStateList colorstatelist)
	{
		mTrackTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #120 <Field ColorStateList mTrackTintList>
		mHasTrackTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #124 <Field boolean mHasTrackTint>
		applyTrackTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #272 <Method void applyTrackTint()>
	//    8   14:return          
	}

	public void setTrackTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mTrackTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
		mHasTrackTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #126 <Field boolean mHasTrackTintMode>
		applyTrackTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #272 <Method void applyTrackTint()>
	//    8   14:return          
	}

	public void toggle()
	{
		boolean flag;
		if(!isChecked())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #309 <Method boolean isChecked()>
	//*   2    4:ifne            15
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:aload_0         
	//*   6   10:iload_1         
	//*   7   11:invokevirtual   #313 <Method void setChecked(boolean)>
	//*   8   14:return          
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_1        
		setChecked(flag);
	//*  11   17:goto            9
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mThumbDrawable || drawable == mTrackDrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #908 <Method boolean CompoundButton.verifyDrawable(Drawable)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #183 <Field Drawable mThumbDrawable>
	//    7   13:if_acmpeq       24
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #194 <Field Drawable mTrackDrawable>
	//   11   21:if_acmpne       26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	private static final int MONOSPACE = 3;
	private static final int SANS = 1;
	private static final int SERIF = 2;
	private static final int THUMB_ANIMATION_DURATION = 250;
	private static final Property THUMB_POS = new Property(java/lang/Float, "thumbPos") {

		public Float get(SwitchCompat switchcompat)
		{
			return Float.valueOf(switchcompat.mThumbPosition);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method float SwitchCompat.access$000(SwitchCompat)>
		//    2    4:invokestatic    #24  <Method Float Float.valueOf(float)>
		//    3    7:areturn         
		}

		public volatile Object get(Object obj)
		{
			return ((Object) (get((SwitchCompat)obj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class SwitchCompat>
		//    3    5:invokevirtual   #27  <Method Float get(SwitchCompat)>
		//    4    8:areturn         
		}

		public void set(SwitchCompat switchcompat, Float float1)
		{
			switchcompat.setThumbPosition(float1.floatValue());
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #33  <Method float Float.floatValue()>
		//    3    5:invokevirtual   #37  <Method void SwitchCompat.setThumbPosition(float)>
		//    4    8:return          
		}

		public volatile void set(Object obj, Object obj1)
		{
			set((SwitchCompat)obj, (Float)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class SwitchCompat>
		//    3    5:aload_2         
		//    4    6:checkcast       #20  <Class Float>
		//    5    9:invokevirtual   #40  <Method void set(SwitchCompat, Float)>
		//    6   12:return          
		}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #11  <Method void Property(Class, String)>
			//    4    6:return          
			}
	}
;
	private static final int TOUCH_MODE_DOWN = 1;
	private static final int TOUCH_MODE_DRAGGING = 2;
	private static final int TOUCH_MODE_IDLE = 0;
	private boolean mHasThumbTint;
	private boolean mHasThumbTintMode;
	private boolean mHasTrackTint;
	private boolean mHasTrackTintMode;
	private int mMinFlingVelocity;
	private Layout mOffLayout;
	private Layout mOnLayout;
	ObjectAnimator mPositionAnimator;
	private boolean mShowText;
	private boolean mSplitTrack;
	private int mSwitchBottom;
	private int mSwitchHeight;
	private int mSwitchLeft;
	private int mSwitchMinWidth;
	private int mSwitchPadding;
	private int mSwitchRight;
	private int mSwitchTop;
	private TransformationMethod mSwitchTransformationMethod;
	private int mSwitchWidth;
	private final Rect mTempRect;
	private ColorStateList mTextColors;
	private CharSequence mTextOff;
	private CharSequence mTextOn;
	private final TextPaint mTextPaint;
	private Drawable mThumbDrawable;
	private float mThumbPosition;
	private int mThumbTextPadding;
	private ColorStateList mThumbTintList;
	private android.graphics.PorterDuff.Mode mThumbTintMode;
	private int mThumbWidth;
	private int mTouchMode;
	private int mTouchSlop;
	private float mTouchX;
	private float mTouchY;
	private Drawable mTrackDrawable;
	private ColorStateList mTrackTintList;
	private android.graphics.PorterDuff.Mode mTrackTintMode;
	private VelocityTracker mVelocityTracker;

	static 
	{
	//    0    0:new             #6   <Class SwitchCompat$1>
	//    1    3:dup             
	//    2    4:ldc1            #85  <Class Float>
	//    3    6:ldc1            #87  <String "thumbPos">
	//    4    8:invokespecial   #91  <Method void SwitchCompat$1(Class, String)>
	//    5   11:putstatic       #93  <Field Property THUMB_POS>
	//    6   14:iconst_1        
	//    7   15:newarray        int[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:ldc1            #94  <Int 0x10100a0>
	//   11   21:iastore         
	//   12   22:putstatic       #96  <Field int[] CHECKED_STATE_SET>
	//*  13   25:return          
	}


/*
	static float access$000(SwitchCompat switchcompat)
	{
		return switchcompat.mThumbPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #317 <Field float mThumbPosition>
	//    2    4:freturn         
	}

*/
}
