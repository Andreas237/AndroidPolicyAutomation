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
	//    3    3:invokespecial   #98  <Method void SwitchCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwitchCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.switchStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #103 <Field int android.support.v7.appcompat.R$attr.switchStyle>
	//    4    6:invokespecial   #106 <Method void SwitchCompat(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SwitchCompat(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #107 <Method void CompoundButton(Context, AttributeSet, int)>
		mThumbTintList = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #109 <Field ColorStateList mThumbTintList>
		mThumbTintMode = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #111 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
		mHasThumbTint = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #113 <Field boolean mHasThumbTint>
		mHasThumbTintMode = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #115 <Field boolean mHasThumbTintMode>
		mTrackTintList = null;
	//   17   27:aload_0         
	//   18   28:aconst_null     
	//   19   29:putfield        #117 <Field ColorStateList mTrackTintList>
		mTrackTintMode = null;
	//   20   32:aload_0         
	//   21   33:aconst_null     
	//   22   34:putfield        #119 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
		mHasTrackTint = false;
	//   23   37:aload_0         
	//   24   38:iconst_0        
	//   25   39:putfield        #121 <Field boolean mHasTrackTint>
		mHasTrackTintMode = false;
	//   26   42:aload_0         
	//   27   43:iconst_0        
	//   28   44:putfield        #123 <Field boolean mHasTrackTintMode>
		mVelocityTracker = VelocityTracker.obtain();
	//   29   47:aload_0         
	//   30   48:invokestatic    #129 <Method VelocityTracker VelocityTracker.obtain()>
	//   31   51:putfield        #131 <Field VelocityTracker mVelocityTracker>
		mTempRect = new Rect();
	//   32   54:aload_0         
	//   33   55:new             #133 <Class Rect>
	//   34   58:dup             
	//   35   59:invokespecial   #135 <Method void Rect()>
	//   36   62:putfield        #137 <Field Rect mTempRect>
		mTextPaint = new TextPaint(1);
	//   37   65:aload_0         
	//   38   66:new             #139 <Class TextPaint>
	//   39   69:dup             
	//   40   70:iconst_1        
	//   41   71:invokespecial   #142 <Method void TextPaint(int)>
	//   42   74:putfield        #144 <Field TextPaint mTextPaint>
		Object obj = ((Object) (getResources()));
	//   43   77:aload_0         
	//   44   78:invokevirtual   #148 <Method Resources getResources()>
	//   45   81:astore          4
		mTextPaint.density = ((Resources) (obj)).getDisplayMetrics().density;
	//   46   83:aload_0         
	//   47   84:getfield        #144 <Field TextPaint mTextPaint>
	//   48   87:aload           4
	//   49   89:invokevirtual   #154 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   50   92:getfield        #159 <Field float DisplayMetrics.density>
	//   51   95:putfield        #160 <Field float TextPaint.density>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.SwitchCompat, i, 0)));
	//   52   98:aload_1         
	//   53   99:aload_2         
	//   54  100:getstatic       #165 <Field int[] android.support.v7.appcompat.R$styleable.SwitchCompat>
	//   55  103:iload_3         
	//   56  104:iconst_0        
	//   57  105:invokestatic    #171 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   58  108:astore_2        
		mThumbDrawable = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_android_thumb);
	//   59  109:aload_0         
	//   60  110:aload_2         
	//   61  111:getstatic       #174 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_thumb>
	//   62  114:invokevirtual   #178 <Method Drawable TintTypedArray.getDrawable(int)>
	//   63  117:putfield        #180 <Field Drawable mThumbDrawable>
		if(mThumbDrawable != null)
	//*  64  120:aload_0         
	//*  65  121:getfield        #180 <Field Drawable mThumbDrawable>
	//*  66  124:ifnull          135
			mThumbDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   67  127:aload_0         
	//   68  128:getfield        #180 <Field Drawable mThumbDrawable>
	//   69  131:aload_0         
	//   70  132:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTrackDrawable = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_track);
	//   71  135:aload_0         
	//   72  136:aload_2         
	//   73  137:getstatic       #189 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_track>
	//   74  140:invokevirtual   #178 <Method Drawable TintTypedArray.getDrawable(int)>
	//   75  143:putfield        #191 <Field Drawable mTrackDrawable>
		if(mTrackDrawable != null)
	//*  76  146:aload_0         
	//*  77  147:getfield        #191 <Field Drawable mTrackDrawable>
	//*  78  150:ifnull          161
			mTrackDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   79  153:aload_0         
	//   80  154:getfield        #191 <Field Drawable mTrackDrawable>
	//   81  157:aload_0         
	//   82  158:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTextOn = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOn);
	//   83  161:aload_0         
	//   84  162:aload_2         
	//   85  163:getstatic       #194 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_textOn>
	//   86  166:invokevirtual   #198 <Method CharSequence TintTypedArray.getText(int)>
	//   87  169:putfield        #200 <Field CharSequence mTextOn>
		mTextOff = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOff);
	//   88  172:aload_0         
	//   89  173:aload_2         
	//   90  174:getstatic       #203 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_textOff>
	//   91  177:invokevirtual   #198 <Method CharSequence TintTypedArray.getText(int)>
	//   92  180:putfield        #205 <Field CharSequence mTextOff>
		mShowText = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_showText, true);
	//   93  183:aload_0         
	//   94  184:aload_2         
	//   95  185:getstatic       #208 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_showText>
	//   96  188:iconst_1        
	//   97  189:invokevirtual   #212 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   98  192:putfield        #214 <Field boolean mShowText>
		mThumbTextPadding = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
	//   99  195:aload_0         
	//  100  196:aload_2         
	//  101  197:getstatic       #217 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTextPadding>
	//  102  200:iconst_0        
	//  103  201:invokevirtual   #221 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  104  204:putfield        #223 <Field int mThumbTextPadding>
		mSwitchMinWidth = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
	//  105  207:aload_0         
	//  106  208:aload_2         
	//  107  209:getstatic       #226 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchMinWidth>
	//  108  212:iconst_0        
	//  109  213:invokevirtual   #221 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  110  216:putfield        #228 <Field int mSwitchMinWidth>
		mSwitchPadding = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
	//  111  219:aload_0         
	//  112  220:aload_2         
	//  113  221:getstatic       #231 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchPadding>
	//  114  224:iconst_0        
	//  115  225:invokevirtual   #221 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  116  228:putfield        #233 <Field int mSwitchPadding>
		mSplitTrack = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_splitTrack, false);
	//  117  231:aload_0         
	//  118  232:aload_2         
	//  119  233:getstatic       #236 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_splitTrack>
	//  120  236:iconst_0        
	//  121  237:invokevirtual   #212 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  122  240:putfield        #238 <Field boolean mSplitTrack>
		obj = ((Object) (((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTint)));
	//  123  243:aload_2         
	//  124  244:getstatic       #241 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTint>
	//  125  247:invokevirtual   #245 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  126  250:astore          4
		if(obj != null)
	//* 127  252:aload           4
	//* 128  254:ifnull          268
		{
			mThumbTintList = ((ColorStateList) (obj));
	//  129  257:aload_0         
	//  130  258:aload           4
	//  131  260:putfield        #109 <Field ColorStateList mThumbTintList>
			mHasThumbTint = true;
	//  132  263:aload_0         
	//  133  264:iconst_1        
	//  134  265:putfield        #113 <Field boolean mHasThumbTint>
		}
		obj = ((Object) (DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  135  268:aload_2         
	//  136  269:getstatic       #248 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTintMode>
	//  137  272:iconst_m1       
	//  138  273:invokevirtual   #251 <Method int TintTypedArray.getInt(int, int)>
	//  139  276:aconst_null     
	//  140  277:invokestatic    #257 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  141  280:astore          4
		if(mThumbTintMode != obj)
	//* 142  282:aload_0         
	//* 143  283:getfield        #111 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//* 144  286:aload           4
	//* 145  288:if_acmpeq       302
		{
			mThumbTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//  146  291:aload_0         
	//  147  292:aload           4
	//  148  294:putfield        #111 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
			mHasThumbTintMode = true;
	//  149  297:aload_0         
	//  150  298:iconst_1        
	//  151  299:putfield        #115 <Field boolean mHasThumbTintMode>
		}
		if(mHasThumbTint || mHasThumbTintMode)
	//* 152  302:aload_0         
	//* 153  303:getfield        #113 <Field boolean mHasThumbTint>
	//* 154  306:ifne            316
	//* 155  309:aload_0         
	//* 156  310:getfield        #115 <Field boolean mHasThumbTintMode>
	//* 157  313:ifeq            320
			applyThumbTint();
	//  158  316:aload_0         
	//  159  317:invokespecial   #260 <Method void applyThumbTint()>
		obj = ((Object) (((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.SwitchCompat_trackTint)));
	//  160  320:aload_2         
	//  161  321:getstatic       #263 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_trackTint>
	//  162  324:invokevirtual   #245 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  163  327:astore          4
		if(obj != null)
	//* 164  329:aload           4
	//* 165  331:ifnull          345
		{
			mTrackTintList = ((ColorStateList) (obj));
	//  166  334:aload_0         
	//  167  335:aload           4
	//  168  337:putfield        #117 <Field ColorStateList mTrackTintList>
			mHasTrackTint = true;
	//  169  340:aload_0         
	//  170  341:iconst_1        
	//  171  342:putfield        #121 <Field boolean mHasTrackTint>
		}
		obj = ((Object) (DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SwitchCompat_trackTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  172  345:aload_2         
	//  173  346:getstatic       #266 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_trackTintMode>
	//  174  349:iconst_m1       
	//  175  350:invokevirtual   #251 <Method int TintTypedArray.getInt(int, int)>
	//  176  353:aconst_null     
	//  177  354:invokestatic    #257 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  178  357:astore          4
		if(mTrackTintMode != obj)
	//* 179  359:aload_0         
	//* 180  360:getfield        #119 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//* 181  363:aload           4
	//* 182  365:if_acmpeq       379
		{
			mTrackTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//  183  368:aload_0         
	//  184  369:aload           4
	//  185  371:putfield        #119 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
			mHasTrackTintMode = true;
	//  186  374:aload_0         
	//  187  375:iconst_1        
	//  188  376:putfield        #123 <Field boolean mHasTrackTintMode>
		}
		if(mHasTrackTint || mHasTrackTintMode)
	//* 189  379:aload_0         
	//* 190  380:getfield        #121 <Field boolean mHasTrackTint>
	//* 191  383:ifne            393
	//* 192  386:aload_0         
	//* 193  387:getfield        #123 <Field boolean mHasTrackTintMode>
	//* 194  390:ifeq            397
			applyTrackTint();
	//  195  393:aload_0         
	//  196  394:invokespecial   #269 <Method void applyTrackTint()>
		i = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
	//  197  397:aload_2         
	//  198  398:getstatic       #272 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchTextAppearance>
	//  199  401:iconst_0        
	//  200  402:invokevirtual   #275 <Method int TintTypedArray.getResourceId(int, int)>
	//  201  405:istore_3        
		if(i != 0)
	//* 202  406:iload_3         
	//* 203  407:ifeq            416
			setSwitchTextAppearance(context, i);
	//  204  410:aload_0         
	//  205  411:aload_1         
	//  206  412:iload_3         
	//  207  413:invokevirtual   #279 <Method void setSwitchTextAppearance(Context, int)>
		((TintTypedArray) (attributeset)).recycle();
	//  208  416:aload_2         
	//  209  417:invokevirtual   #282 <Method void TintTypedArray.recycle()>
		context = ((Context) (ViewConfiguration.get(context)));
	//  210  420:aload_1         
	//  211  421:invokestatic    #288 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//  212  424:astore_1        
		mTouchSlop = ((ViewConfiguration) (context)).getScaledTouchSlop();
	//  213  425:aload_0         
	//  214  426:aload_1         
	//  215  427:invokevirtual   #292 <Method int ViewConfiguration.getScaledTouchSlop()>
	//  216  430:putfield        #294 <Field int mTouchSlop>
		mMinFlingVelocity = ((ViewConfiguration) (context)).getScaledMinimumFlingVelocity();
	//  217  433:aload_0         
	//  218  434:aload_1         
	//  219  435:invokevirtual   #297 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//  220  438:putfield        #299 <Field int mMinFlingVelocity>
		refreshDrawableState();
	//  221  441:aload_0         
	//  222  442:invokevirtual   #302 <Method void refreshDrawableState()>
		setChecked(isChecked());
	//  223  445:aload_0         
	//  224  446:aload_0         
	//  225  447:invokevirtual   #306 <Method boolean isChecked()>
	//  226  450:invokevirtual   #310 <Method void setChecked(boolean)>
	//  227  453:return          
	}

	private void animateThumbToCheckedState(boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            9
			f = 1.0F;
	//    2    4:fconst_1        
	//    3    5:fstore_2        
		else
	//*   4    6:goto            11
			f = 0.0F;
	//    5    9:fconst_0        
	//    6   10:fstore_2        
		mPositionAnimator = ObjectAnimator.ofFloat(((Object) (this)), THUMB_POS, new float[] {
			f
		});
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getstatic       #90  <Field Property THUMB_POS>
	//   10   16:iconst_1        
	//   11   17:newarray        float[]
	//   12   19:dup             
	//   13   20:iconst_0        
	//   14   21:fload_2         
	//   15   22:fastore         
	//   16   23:invokestatic    #321 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   17   26:putfield        #323 <Field ObjectAnimator mPositionAnimator>
		mPositionAnimator.setDuration(250L);
	//   18   29:aload_0         
	//   19   30:getfield        #323 <Field ObjectAnimator mPositionAnimator>
	//   20   33:ldc2w           #324 <Long 250L>
	//   21   36:invokevirtual   #329 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   22   39:pop             
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  23   40:getstatic       #334 <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   43:bipush          18
	//*  25   45:icmplt          56
			mPositionAnimator.setAutoCancel(true);
	//   26   48:aload_0         
	//   27   49:getfield        #323 <Field ObjectAnimator mPositionAnimator>
	//   28   52:iconst_1        
	//   29   53:invokevirtual   #337 <Method void ObjectAnimator.setAutoCancel(boolean)>
		mPositionAnimator.start();
	//   30   56:aload_0         
	//   31   57:getfield        #323 <Field ObjectAnimator mPositionAnimator>
	//   32   60:invokevirtual   #340 <Method void ObjectAnimator.start()>
	//   33   63:return          
	}

	private void applyThumbTint()
	{
		if(mThumbDrawable != null && (mHasThumbTint || mHasThumbTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field Drawable mThumbDrawable>
	//*   2    4:ifnull          90
	//*   3    7:aload_0         
	//*   4    8:getfield        #113 <Field boolean mHasThumbTint>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #115 <Field boolean mHasThumbTintMode>
	//*   8   18:ifeq            90
		{
			mThumbDrawable = mThumbDrawable.mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #180 <Field Drawable mThumbDrawable>
	//   12   26:invokevirtual   #344 <Method Drawable Drawable.mutate()>
	//   13   29:putfield        #180 <Field Drawable mThumbDrawable>
			if(mHasThumbTint)
	//*  14   32:aload_0         
	//*  15   33:getfield        #113 <Field boolean mHasThumbTint>
	//*  16   36:ifeq            50
				DrawableCompat.setTintList(mThumbDrawable, mThumbTintList);
	//   17   39:aload_0         
	//   18   40:getfield        #180 <Field Drawable mThumbDrawable>
	//   19   43:aload_0         
	//   20   44:getfield        #109 <Field ColorStateList mThumbTintList>
	//   21   47:invokestatic    #350 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasThumbTintMode)
	//*  22   50:aload_0         
	//*  23   51:getfield        #115 <Field boolean mHasThumbTintMode>
	//*  24   54:ifeq            68
				DrawableCompat.setTintMode(mThumbDrawable, mThumbTintMode);
	//   25   57:aload_0         
	//   26   58:getfield        #180 <Field Drawable mThumbDrawable>
	//   27   61:aload_0         
	//   28   62:getfield        #111 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//   29   65:invokestatic    #354 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mThumbDrawable.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #180 <Field Drawable mThumbDrawable>
	//*  32   72:invokevirtual   #357 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				mThumbDrawable.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #180 <Field Drawable mThumbDrawable>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #361 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #365 <Method boolean Drawable.setState(int[])>
	//   39   89:pop             
		}
	//   40   90:return          
	}

	private void applyTrackTint()
	{
		if(mTrackDrawable != null && (mHasTrackTint || mHasTrackTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field Drawable mTrackDrawable>
	//*   2    4:ifnull          90
	//*   3    7:aload_0         
	//*   4    8:getfield        #121 <Field boolean mHasTrackTint>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #123 <Field boolean mHasTrackTintMode>
	//*   8   18:ifeq            90
		{
			mTrackDrawable = mTrackDrawable.mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #191 <Field Drawable mTrackDrawable>
	//   12   26:invokevirtual   #344 <Method Drawable Drawable.mutate()>
	//   13   29:putfield        #191 <Field Drawable mTrackDrawable>
			if(mHasTrackTint)
	//*  14   32:aload_0         
	//*  15   33:getfield        #121 <Field boolean mHasTrackTint>
	//*  16   36:ifeq            50
				DrawableCompat.setTintList(mTrackDrawable, mTrackTintList);
	//   17   39:aload_0         
	//   18   40:getfield        #191 <Field Drawable mTrackDrawable>
	//   19   43:aload_0         
	//   20   44:getfield        #117 <Field ColorStateList mTrackTintList>
	//   21   47:invokestatic    #350 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasTrackTintMode)
	//*  22   50:aload_0         
	//*  23   51:getfield        #123 <Field boolean mHasTrackTintMode>
	//*  24   54:ifeq            68
				DrawableCompat.setTintMode(mTrackDrawable, mTrackTintMode);
	//   25   57:aload_0         
	//   26   58:getfield        #191 <Field Drawable mTrackDrawable>
	//   27   61:aload_0         
	//   28   62:getfield        #119 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//   29   65:invokestatic    #354 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mTrackDrawable.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #191 <Field Drawable mTrackDrawable>
	//*  32   72:invokevirtual   #357 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				mTrackDrawable.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #191 <Field Drawable mTrackDrawable>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #361 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #365 <Method boolean Drawable.setState(int[])>
	//   39   89:pop             
		}
	//   40   90:return          
	}

	private void cancelPositionAnimator()
	{
		if(mPositionAnimator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #323 <Field ObjectAnimator mPositionAnimator>
	//*   2    4:ifnull          14
			mPositionAnimator.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #323 <Field ObjectAnimator mPositionAnimator>
	//    5   11:invokevirtual   #369 <Method void ObjectAnimator.cancel()>
	//    6   14:return          
	}

	private void cancelSuperTouch(MotionEvent motionevent)
	{
		motionevent = MotionEvent.obtain(motionevent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #376 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    2    4:astore_1        
		motionevent.setAction(3);
	//    3    5:aload_1         
	//    4    6:iconst_3        
	//    5    7:invokevirtual   #379 <Method void MotionEvent.setAction(int)>
		super.onTouchEvent(motionevent);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #383 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//    9   15:pop             
		motionevent.recycle();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #384 <Method void MotionEvent.recycle()>
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
		f1 = f;
	//    6    8:fload_0         
	//    7    9:fstore_1        
		if(f > f2)
	//*   8   10:fload_0         
	//*   9   11:fload_2         
	//*  10   12:fcmpl           
	//*  11   13:ifle            18
			f1 = f2;
	//   12   16:fload_2         
	//   13   17:fstore_1        
		return f1;
	//   14   18:fload_1         
	//   15   19:freturn         
	}

	private boolean getTargetCheckedState()
	{
		return mThumbPosition > 0.5F;
	//    0    0:aload_0         
	//    1    1:getfield        #314 <Field float mThumbPosition>
	//    2    4:ldc2            #388 <Float 0.5F>
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
	//*   1    1:invokestatic    #395 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifeq            17
			f = 1.0F - mThumbPosition;
	//    3    7:fconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #314 <Field float mThumbPosition>
	//    6   12:fsub            
	//    7   13:fstore_1        
		else
	//*   8   14:goto            22
			f = mThumbPosition;
	//    9   17:aload_0         
	//   10   18:getfield        #314 <Field float mThumbPosition>
	//   11   21:fstore_1        
		return (int)(f * (float)getThumbScrollRange() + 0.5F);
	//   12   22:fload_1         
	//   13   23:aload_0         
	//   14   24:invokespecial   #398 <Method int getThumbScrollRange()>
	//   15   27:i2f             
	//   16   28:fmul            
	//   17   29:ldc2            #388 <Float 0.5F>
	//   18   32:fadd            
	//   19   33:f2i             
	//   20   34:ireturn         
	}

	private int getThumbScrollRange()
	{
		if(mTrackDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field Drawable mTrackDrawable>
	//*   2    4:ifnull          73
		{
			Rect rect1 = mTempRect;
	//    3    7:aload_0         
	//    4    8:getfield        #137 <Field Rect mTempRect>
	//    5   11:astore_2        
			mTrackDrawable.getPadding(rect1);
	//    6   12:aload_0         
	//    7   13:getfield        #191 <Field Drawable mTrackDrawable>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   10   20:pop             
			Rect rect;
			if(mThumbDrawable != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #180 <Field Drawable mThumbDrawable>
	//*  13   25:ifnull          39
				rect = DrawableUtils.getOpticalBounds(mThumbDrawable);
	//   14   28:aload_0         
	//   15   29:getfield        #180 <Field Drawable mThumbDrawable>
	//   16   32:invokestatic    #406 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   17   35:astore_1        
			else
	//*  18   36:goto            43
				rect = DrawableUtils.INSETS_NONE;
	//   19   39:getstatic       #409 <Field Rect DrawableUtils.INSETS_NONE>
	//   20   42:astore_1        
			return mSwitchWidth - mThumbWidth - rect1.left - rect1.right - rect.left - rect.right;
	//   21   43:aload_0         
	//   22   44:getfield        #411 <Field int mSwitchWidth>
	//   23   47:aload_0         
	//   24   48:getfield        #413 <Field int mThumbWidth>
	//   25   51:isub            
	//   26   52:aload_2         
	//   27   53:getfield        #416 <Field int Rect.left>
	//   28   56:isub            
	//   29   57:aload_2         
	//   30   58:getfield        #419 <Field int Rect.right>
	//   31   61:isub            
	//   32   62:aload_1         
	//   33   63:getfield        #416 <Field int Rect.left>
	//   34   66:isub            
	//   35   67:aload_1         
	//   36   68:getfield        #419 <Field int Rect.right>
	//   37   71:isub            
	//   38   72:ireturn         
		} else
		{
			return 0;
	//   39   73:iconst_0        
	//   40   74:ireturn         
		}
	}

	private boolean hitThumb(float f, float f1)
	{
		Drawable drawable = mThumbDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field Drawable mThumbDrawable>
	//    2    4:astore          14
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          13
		if(drawable == null)
	//*   5    9:aload           14
	//*   6   11:ifnonnull       16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		int k = getThumbOffset();
	//    9   16:aload_0         
	//   10   17:invokespecial   #423 <Method int getThumbOffset()>
	//   11   20:istore          5
		mThumbDrawable.getPadding(mTempRect);
	//   12   22:aload_0         
	//   13   23:getfield        #180 <Field Drawable mThumbDrawable>
	//   14   26:aload_0         
	//   15   27:getfield        #137 <Field Rect mTempRect>
	//   16   30:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   17   33:pop             
		int i = mSwitchTop;
	//   18   34:aload_0         
	//   19   35:getfield        #425 <Field int mSwitchTop>
	//   20   38:istore_3        
		int j = mTouchSlop;
	//   21   39:aload_0         
	//   22   40:getfield        #294 <Field int mTouchSlop>
	//   23   43:istore          4
		k = (mSwitchLeft + k) - mTouchSlop;
	//   24   45:aload_0         
	//   25   46:getfield        #427 <Field int mSwitchLeft>
	//   26   49:iload           5
	//   27   51:iadd            
	//   28   52:aload_0         
	//   29   53:getfield        #294 <Field int mTouchSlop>
	//   30   56:isub            
	//   31   57:istore          5
		int l = mThumbWidth;
	//   32   59:aload_0         
	//   33   60:getfield        #413 <Field int mThumbWidth>
	//   34   63:istore          6
		int i1 = mTempRect.left;
	//   35   65:aload_0         
	//   36   66:getfield        #137 <Field Rect mTempRect>
	//   37   69:getfield        #416 <Field int Rect.left>
	//   38   72:istore          7
		int j1 = mTempRect.right;
	//   39   74:aload_0         
	//   40   75:getfield        #137 <Field Rect mTempRect>
	//   41   78:getfield        #419 <Field int Rect.right>
	//   42   81:istore          8
		int k1 = mTouchSlop;
	//   43   83:aload_0         
	//   44   84:getfield        #294 <Field int mTouchSlop>
	//   45   87:istore          9
		int l1 = mSwitchBottom;
	//   46   89:aload_0         
	//   47   90:getfield        #429 <Field int mSwitchBottom>
	//   48   93:istore          10
		int i2 = mTouchSlop;
	//   49   95:aload_0         
	//   50   96:getfield        #294 <Field int mTouchSlop>
	//   51   99:istore          11
		boolean flag = flag1;
	//   52  101:iload           13
	//   53  103:istore          12
		if(f > (float)k)
	//*  54  105:fload_1         
	//*  55  106:iload           5
	//*  56  108:i2f             
	//*  57  109:fcmpl           
	//*  58  110:ifle            169
		{
			flag = flag1;
	//   59  113:iload           13
	//   60  115:istore          12
			if(f < (float)(l + k + i1 + j1 + k1))
	//*  61  117:fload_1         
	//*  62  118:iload           6
	//*  63  120:iload           5
	//*  64  122:iadd            
	//*  65  123:iload           7
	//*  66  125:iadd            
	//*  67  126:iload           8
	//*  68  128:iadd            
	//*  69  129:iload           9
	//*  70  131:iadd            
	//*  71  132:i2f             
	//*  72  133:fcmpg           
	//*  73  134:ifge            169
			{
				flag = flag1;
	//   74  137:iload           13
	//   75  139:istore          12
				if(f1 > (float)(i - j))
	//*  76  141:fload_2         
	//*  77  142:iload_3         
	//*  78  143:iload           4
	//*  79  145:isub            
	//*  80  146:i2f             
	//*  81  147:fcmpl           
	//*  82  148:ifle            169
				{
					flag = flag1;
	//   83  151:iload           13
	//   84  153:istore          12
					if(f1 < (float)(l1 + i2))
	//*  85  155:fload_2         
	//*  86  156:iload           10
	//*  87  158:iload           11
	//*  88  160:iadd            
	//*  89  161:i2f             
	//*  90  162:fcmpg           
	//*  91  163:ifge            169
						flag = true;
	//   92  166:iconst_1        
	//   93  167:istore          12
				}
			}
		}
		return flag;
	//   94  169:iload           12
	//   95  171:ireturn         
	}

	private Layout makeLayout(CharSequence charsequence)
	{
		CharSequence charsequence1 = charsequence;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(mSwitchTransformationMethod != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #433 <Field TransformationMethod mSwitchTransformationMethod>
	//*   4    6:ifnull          21
			charsequence1 = mSwitchTransformationMethod.getTransformation(charsequence, ((android.view.View) (this)));
	//    5    9:aload_0         
	//    6   10:getfield        #433 <Field TransformationMethod mSwitchTransformationMethod>
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:invokeinterface #439 <Method CharSequence TransformationMethod.getTransformation(CharSequence, android.view.View)>
	//   10   20:astore_3        
		charsequence = ((CharSequence) (mTextPaint));
	//   11   21:aload_0         
	//   12   22:getfield        #144 <Field TextPaint mTextPaint>
	//   13   25:astore_1        
		int i;
		if(charsequence1 != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          47
			i = (int)Math.ceil(Layout.getDesiredWidth(charsequence1, mTextPaint));
	//   16   30:aload_3         
	//   17   31:aload_0         
	//   18   32:getfield        #144 <Field TextPaint mTextPaint>
	//   19   35:invokestatic    #445 <Method float Layout.getDesiredWidth(CharSequence, TextPaint)>
	//   20   38:f2d             
	//   21   39:invokestatic    #451 <Method double Math.ceil(double)>
	//   22   42:d2i             
	//   23   43:istore_2        
		else
	//*  24   44:goto            52
			i = 0;
	//   25   47:iconst_0        
	//   26   48:istore_2        
	//*  27   49:goto            44
		return ((Layout) (new StaticLayout(charsequence1, ((TextPaint) (charsequence)), i, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true)));
	//   28   52:new             #453 <Class StaticLayout>
	//   29   55:dup             
	//   30   56:aload_3         
	//   31   57:aload_1         
	//   32   58:iload_2         
	//   33   59:getstatic       #459 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//   34   62:fconst_1        
	//   35   63:fconst_0        
	//   36   64:iconst_1        
	//   37   65:invokespecial   #462 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//   38   68:areturn         
	}

	private void setSwitchTypefaceByIndex(int i, int j)
	{
		Typeface typeface;
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 47
	//	               2 40
	//	               3 33
		default:
			typeface = null;
	//    2   28:aconst_null     
	//    3   29:astore_3        
			break;

	//*   4   30:goto            51
		case 3: // '\003'
			typeface = Typeface.MONOSPACE;
	//    5   33:getstatic       #469 <Field Typeface Typeface.MONOSPACE>
	//    6   36:astore_3        
			break;

	//*   7   37:goto            51
		case 2: // '\002'
			typeface = Typeface.SERIF;
	//    8   40:getstatic       #471 <Field Typeface Typeface.SERIF>
	//    9   43:astore_3        
			break;

	//*  10   44:goto            51
		case 1: // '\001'
			typeface = Typeface.SANS_SERIF;
	//   11   47:getstatic       #474 <Field Typeface Typeface.SANS_SERIF>
	//   12   50:astore_3        
			break;
		}
		setSwitchTypeface(typeface, j);
	//   13   51:aload_0         
	//   14   52:aload_3         
	//   15   53:iload_2         
	//   16   54:invokevirtual   #478 <Method void setSwitchTypeface(Typeface, int)>
	//   17   57:return          
	}

	private void stopDrag(MotionEvent motionevent)
	{
		mTouchMode = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #481 <Field int mTouchMode>
		int i = motionevent.getAction();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #484 <Method int MotionEvent.getAction()>
	//    5    9:istore_3        
		boolean flag1 = true;
	//    6   10:iconst_1        
	//    7   11:istore          4
		boolean flag;
		if(i == 1 && isEnabled())
	//*   8   13:iload_3         
	//*   9   14:iconst_1        
	//*  10   15:icmpne          30
	//*  11   18:aload_0         
	//*  12   19:invokevirtual   #487 <Method boolean isEnabled()>
	//*  13   22:ifeq            30
			flag = true;
	//   14   25:iconst_1        
	//   15   26:istore_3        
		else
	//*  16   27:goto            32
			flag = false;
	//   17   30:iconst_0        
	//   18   31:istore_3        
		boolean flag2 = isChecked();
	//   19   32:aload_0         
	//   20   33:invokevirtual   #306 <Method boolean isChecked()>
	//   21   36:istore          5
		if(flag)
	//*  22   38:iload_3         
	//*  23   39:ifeq            113
		{
			mVelocityTracker.computeCurrentVelocity(1000);
	//   24   42:aload_0         
	//   25   43:getfield        #131 <Field VelocityTracker mVelocityTracker>
	//   26   46:sipush          1000
	//   27   49:invokevirtual   #490 <Method void VelocityTracker.computeCurrentVelocity(int)>
			float f = mVelocityTracker.getXVelocity();
	//   28   52:aload_0         
	//   29   53:getfield        #131 <Field VelocityTracker mVelocityTracker>
	//   30   56:invokevirtual   #494 <Method float VelocityTracker.getXVelocity()>
	//   31   59:fstore_2        
			if(Math.abs(f) > (float)mMinFlingVelocity)
	//*  32   60:fload_2         
	//*  33   61:invokestatic    #498 <Method float Math.abs(float)>
	//*  34   64:aload_0         
	//*  35   65:getfield        #299 <Field int mMinFlingVelocity>
	//*  36   68:i2f             
	//*  37   69:fcmpl           
	//*  38   70:ifle            104
			{
				if(ViewUtils.isLayoutRtl(((android.view.View) (this))) ? f >= 0.0F : f <= 0.0F)
	//*  39   73:aload_0         
	//*  40   74:invokestatic    #395 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  41   77:ifeq            95
	//*  42   80:fload_2         
	//*  43   81:fconst_0        
	//*  44   82:fcmpg           
	//*  45   83:ifge            89
	//*  46   86:goto            101
					flag1 = false;
	//   47   89:iconst_0        
	//   48   90:istore          4
	//   49   92:goto            101
	//   50   95:fload_2         
	//   51   96:fconst_0        
	//   52   97:fcmpl           
	//   53   98:ifle            89
			} else
	//*  54  101:goto            117
			{
				flag1 = getTargetCheckedState();
	//   55  104:aload_0         
	//   56  105:invokespecial   #500 <Method boolean getTargetCheckedState()>
	//   57  108:istore          4
			}
		} else
	//*  58  110:goto            117
		{
			flag1 = flag2;
	//   59  113:iload           5
	//   60  115:istore          4
		}
		if(flag1 != flag2)
	//*  61  117:iload           4
	//*  62  119:iload           5
	//*  63  121:icmpeq          129
			playSoundEffect(0);
	//   64  124:aload_0         
	//   65  125:iconst_0        
	//   66  126:invokevirtual   #503 <Method void playSoundEffect(int)>
		setChecked(flag1);
	//   67  129:aload_0         
	//   68  130:iload           4
	//   69  132:invokevirtual   #310 <Method void setChecked(boolean)>
		cancelSuperTouch(motionevent);
	//   70  135:aload_0         
	//   71  136:aload_1         
	//   72  137:invokespecial   #505 <Method void cancelSuperTouch(MotionEvent)>
	//   73  140:return          
	}

	public void draw(Canvas canvas)
	{
		int i;
		int l1;
		int i2;
		Rect rect1;
label0:
		{
			int j;
			int l;
			int k1;
			int j2;
label1:
			{
				rect1 = mTempRect;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Rect mTempRect>
	//    2    4:astore          12
				int i1 = mSwitchLeft;
	//    3    6:aload_0         
	//    4    7:getfield        #427 <Field int mSwitchLeft>
	//    5   10:istore          5
				l1 = mSwitchTop;
	//    6   12:aload_0         
	//    7   13:getfield        #425 <Field int mSwitchTop>
	//    8   16:istore          8
				int j1 = mSwitchRight;
	//    9   18:aload_0         
	//   10   19:getfield        #509 <Field int mSwitchRight>
	//   11   22:istore          6
				i2 = mSwitchBottom;
	//   12   24:aload_0         
	//   13   25:getfield        #429 <Field int mSwitchBottom>
	//   14   28:istore          9
				j = getThumbOffset() + i1;
	//   15   30:aload_0         
	//   16   31:invokespecial   #423 <Method int getThumbOffset()>
	//   17   34:iload           5
	//   18   36:iadd            
	//   19   37:istore_3        
				Rect rect;
				if(mThumbDrawable != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #180 <Field Drawable mThumbDrawable>
	//*  22   42:ifnull          57
					rect = DrawableUtils.getOpticalBounds(mThumbDrawable);
	//   23   45:aload_0         
	//   24   46:getfield        #180 <Field Drawable mThumbDrawable>
	//   25   49:invokestatic    #406 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   26   52:astore          11
				else
	//*  27   54:goto            62
					rect = DrawableUtils.INSETS_NONE;
	//   28   57:getstatic       #409 <Field Rect DrawableUtils.INSETS_NONE>
	//   29   60:astore          11
				i = j;
	//   30   62:iload_3         
	//   31   63:istore_2        
				if(mTrackDrawable == null)
					break label0;
	//   32   64:aload_0         
	//   33   65:getfield        #191 <Field Drawable mTrackDrawable>
	//   34   68:ifnull          271
				mTrackDrawable.getPadding(rect1);
	//   35   71:aload_0         
	//   36   72:getfield        #191 <Field Drawable mTrackDrawable>
	//   37   75:aload           12
	//   38   77:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   39   80:pop             
				j2 = j + rect1.left;
	//   40   81:iload_3         
	//   41   82:aload           12
	//   42   84:getfield        #416 <Field int Rect.left>
	//   43   87:iadd            
	//   44   88:istore          10
				if(rect != null)
	//*  45   90:aload           11
	//*  46   92:ifnull          235
				{
					i = i1;
	//   47   95:iload           5
	//   48   97:istore_2        
					if(rect.left > rect1.left)
	//*  49   98:aload           11
	//*  50  100:getfield        #416 <Field int Rect.left>
	//*  51  103:aload           12
	//*  52  105:getfield        #416 <Field int Rect.left>
	//*  53  108:icmple          126
						i = i1 + (rect.left - rect1.left);
	//   54  111:iload           5
	//   55  113:aload           11
	//   56  115:getfield        #416 <Field int Rect.left>
	//   57  118:aload           12
	//   58  120:getfield        #416 <Field int Rect.left>
	//   59  123:isub            
	//   60  124:iadd            
	//   61  125:istore_2        
					if(rect.top > rect1.top)
	//*  62  126:aload           11
	//*  63  128:getfield        #512 <Field int Rect.top>
	//*  64  131:aload           12
	//*  65  133:getfield        #512 <Field int Rect.top>
	//*  66  136:icmple          157
						j = (rect.top - rect1.top) + l1;
	//   67  139:aload           11
	//   68  141:getfield        #512 <Field int Rect.top>
	//   69  144:aload           12
	//   70  146:getfield        #512 <Field int Rect.top>
	//   71  149:isub            
	//   72  150:iload           8
	//   73  152:iadd            
	//   74  153:istore_3        
					else
	//*  75  154:goto            160
						j = l1;
	//   76  157:iload           8
	//   77  159:istore_3        
					l = j1;
	//   78  160:iload           6
	//   79  162:istore          4
					if(rect.right > rect1.right)
	//*  80  164:aload           11
	//*  81  166:getfield        #419 <Field int Rect.right>
	//*  82  169:aload           12
	//*  83  171:getfield        #419 <Field int Rect.right>
	//*  84  174:icmple          193
						l = j1 - (rect.right - rect1.right);
	//   85  177:iload           6
	//   86  179:aload           11
	//   87  181:getfield        #419 <Field int Rect.right>
	//   88  184:aload           12
	//   89  186:getfield        #419 <Field int Rect.right>
	//   90  189:isub            
	//   91  190:isub            
	//   92  191:istore          4
					i1 = i;
	//   93  193:iload_2         
	//   94  194:istore          5
					j1 = l;
	//   95  196:iload           4
	//   96  198:istore          6
					k1 = j;
	//   97  200:iload_3         
	//   98  201:istore          7
					if(rect.bottom > rect1.bottom)
	//*  99  203:aload           11
	//* 100  205:getfield        #515 <Field int Rect.bottom>
	//* 101  208:aload           12
	//* 102  210:getfield        #515 <Field int Rect.bottom>
	//* 103  213:icmple          239
					{
						k1 = i2 - (rect.bottom - rect1.bottom);
	//  104  216:iload           9
	//  105  218:aload           11
	//  106  220:getfield        #515 <Field int Rect.bottom>
	//  107  223:aload           12
	//  108  225:getfield        #515 <Field int Rect.bottom>
	//  109  228:isub            
	//  110  229:isub            
	//  111  230:istore          7
						break label1;
	//  112  232:goto            255
					}
				} else
				{
					k1 = l1;
	//  113  235:iload           8
	//  114  237:istore          7
				}
				i = i2;
	//  115  239:iload           9
	//  116  241:istore_2        
				j = k1;
	//  117  242:iload           7
	//  118  244:istore_3        
				k1 = i;
	//  119  245:iload_2         
	//  120  246:istore          7
				l = j1;
	//  121  248:iload           6
	//  122  250:istore          4
				i = i1;
	//  123  252:iload           5
	//  124  254:istore_2        
			}
			mTrackDrawable.setBounds(i, j, l, k1);
	//  125  255:aload_0         
	//  126  256:getfield        #191 <Field Drawable mTrackDrawable>
	//  127  259:iload_2         
	//  128  260:iload_3         
	//  129  261:iload           4
	//  130  263:iload           7
	//  131  265:invokevirtual   #519 <Method void Drawable.setBounds(int, int, int, int)>
			i = j2;
	//  132  268:iload           10
	//  133  270:istore_2        
		}
		if(mThumbDrawable != null)
	//* 134  271:aload_0         
	//* 135  272:getfield        #180 <Field Drawable mThumbDrawable>
	//* 136  275:ifnull          344
		{
			mThumbDrawable.getPadding(rect1);
	//  137  278:aload_0         
	//  138  279:getfield        #180 <Field Drawable mThumbDrawable>
	//  139  282:aload           12
	//  140  284:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//  141  287:pop             
			int k = i - rect1.left;
	//  142  288:iload_2         
	//  143  289:aload           12
	//  144  291:getfield        #416 <Field int Rect.left>
	//  145  294:isub            
	//  146  295:istore_3        
			i = i + mThumbWidth + rect1.right;
	//  147  296:iload_2         
	//  148  297:aload_0         
	//  149  298:getfield        #413 <Field int mThumbWidth>
	//  150  301:iadd            
	//  151  302:aload           12
	//  152  304:getfield        #419 <Field int Rect.right>
	//  153  307:iadd            
	//  154  308:istore_2        
			mThumbDrawable.setBounds(k, l1, i, i2);
	//  155  309:aload_0         
	//  156  310:getfield        #180 <Field Drawable mThumbDrawable>
	//  157  313:iload_3         
	//  158  314:iload           8
	//  159  316:iload_2         
	//  160  317:iload           9
	//  161  319:invokevirtual   #519 <Method void Drawable.setBounds(int, int, int, int)>
			Drawable drawable = getBackground();
	//  162  322:aload_0         
	//  163  323:invokevirtual   #522 <Method Drawable getBackground()>
	//  164  326:astore          11
			if(drawable != null)
	//* 165  328:aload           11
	//* 166  330:ifnull          344
				DrawableCompat.setHotspotBounds(drawable, k, l1, i, i2);
	//  167  333:aload           11
	//  168  335:iload_3         
	//  169  336:iload           8
	//  170  338:iload_2         
	//  171  339:iload           9
	//  172  341:invokestatic    #526 <Method void DrawableCompat.setHotspotBounds(Drawable, int, int, int, int)>
		}
		super.draw(canvas);
	//  173  344:aload_0         
	//  174  345:aload_1         
	//  175  346:invokespecial   #528 <Method void CompoundButton.draw(Canvas)>
	//  176  349:return          
	}

	public void drawableHotspotChanged(float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #334 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			super.drawableHotspotChanged(f, f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:invokespecial   #532 <Method void CompoundButton.drawableHotspotChanged(float, float)>
		if(mThumbDrawable != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #180 <Field Drawable mThumbDrawable>
	//*   9   18:ifnull          30
			DrawableCompat.setHotspot(mThumbDrawable, f, f1);
	//   10   21:aload_0         
	//   11   22:getfield        #180 <Field Drawable mThumbDrawable>
	//   12   25:fload_1         
	//   13   26:fload_2         
	//   14   27:invokestatic    #536 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
		if(mTrackDrawable != null)
	//*  15   30:aload_0         
	//*  16   31:getfield        #191 <Field Drawable mTrackDrawable>
	//*  17   34:ifnull          46
			DrawableCompat.setHotspot(mTrackDrawable, f, f1);
	//   18   37:aload_0         
	//   19   38:getfield        #191 <Field Drawable mTrackDrawable>
	//   20   41:fload_1         
	//   21   42:fload_2         
	//   22   43:invokestatic    #536 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//   23   46:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #539 <Method void CompoundButton.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #361 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		Drawable drawable = mThumbDrawable;
	//    5    9:aload_0         
	//    6   10:getfield        #180 <Field Drawable mThumbDrawable>
	//    7   13:astore          4
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
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
	//*  17   28:invokevirtual   #357 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #365 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		drawable = mTrackDrawable;
	//   25   43:aload_0         
	//   26   44:getfield        #191 <Field Drawable mTrackDrawable>
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
	//*  35   60:invokevirtual   #357 <Method boolean Drawable.isStateful()>
	//*  36   63:ifeq            75
				flag1 = flag | drawable.setState(ai);
	//   37   66:iload_1         
	//   38   67:aload           4
	//   39   69:aload_3         
	//   40   70:invokevirtual   #365 <Method boolean Drawable.setState(int[])>
	//   41   73:ior             
	//   42   74:istore_2        
		}
		if(flag1)
	//*  43   75:iload_2         
	//*  44   76:ifeq            83
			invalidate();
	//   45   79:aload_0         
	//   46   80:invokevirtual   #542 <Method void invalidate()>
	//   47   83:return          
	}

	public int getCompoundPaddingLeft()
	{
		if(!ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #395 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifne            12
			return super.getCompoundPaddingLeft();
	//    3    7:aload_0         
	//    4    8:invokespecial   #545 <Method int CompoundButton.getCompoundPaddingLeft()>
	//    5   11:ireturn         
		int j = super.getCompoundPaddingLeft() + mSwitchWidth;
	//    6   12:aload_0         
	//    7   13:invokespecial   #545 <Method int CompoundButton.getCompoundPaddingLeft()>
	//    8   16:aload_0         
	//    9   17:getfield        #411 <Field int mSwitchWidth>
	//   10   20:iadd            
	//   11   21:istore_2        
		int i = j;
	//   12   22:iload_2         
	//   13   23:istore_1        
		if(!TextUtils.isEmpty(getText()))
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #548 <Method CharSequence getText()>
	//*  16   28:invokestatic    #554 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   31:ifne            41
			i = j + mSwitchPadding;
	//   18   34:iload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #233 <Field int mSwitchPadding>
	//   21   39:iadd            
	//   22   40:istore_1        
		return i;
	//   23   41:iload_1         
	//   24   42:ireturn         
	}

	public int getCompoundPaddingRight()
	{
		if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #395 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifeq            12
			return super.getCompoundPaddingRight();
	//    3    7:aload_0         
	//    4    8:invokespecial   #557 <Method int CompoundButton.getCompoundPaddingRight()>
	//    5   11:ireturn         
		int j = super.getCompoundPaddingRight() + mSwitchWidth;
	//    6   12:aload_0         
	//    7   13:invokespecial   #557 <Method int CompoundButton.getCompoundPaddingRight()>
	//    8   16:aload_0         
	//    9   17:getfield        #411 <Field int mSwitchWidth>
	//   10   20:iadd            
	//   11   21:istore_2        
		int i = j;
	//   12   22:iload_2         
	//   13   23:istore_1        
		if(!TextUtils.isEmpty(getText()))
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #548 <Method CharSequence getText()>
	//*  16   28:invokestatic    #554 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   31:ifne            41
			i = j + mSwitchPadding;
	//   18   34:iload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #233 <Field int mSwitchPadding>
	//   21   39:iadd            
	//   22   40:istore_1        
		return i;
	//   23   41:iload_1         
	//   24   42:ireturn         
	}

	public boolean getShowText()
	{
		return mShowText;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field boolean mShowText>
	//    2    4:ireturn         
	}

	public boolean getSplitTrack()
	{
		return mSplitTrack;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field boolean mSplitTrack>
	//    2    4:ireturn         
	}

	public int getSwitchMinWidth()
	{
		return mSwitchMinWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field int mSwitchMinWidth>
	//    2    4:ireturn         
	}

	public int getSwitchPadding()
	{
		return mSwitchPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field int mSwitchPadding>
	//    2    4:ireturn         
	}

	public CharSequence getTextOff()
	{
		return mTextOff;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field CharSequence mTextOff>
	//    2    4:areturn         
	}

	public CharSequence getTextOn()
	{
		return mTextOn;
	//    0    0:aload_0         
	//    1    1:getfield        #200 <Field CharSequence mTextOn>
	//    2    4:areturn         
	}

	public Drawable getThumbDrawable()
	{
		return mThumbDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field Drawable mThumbDrawable>
	//    2    4:areturn         
	}

	public int getThumbTextPadding()
	{
		return mThumbTextPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field int mThumbTextPadding>
	//    2    4:ireturn         
	}

	public ColorStateList getThumbTintList()
	{
		return mThumbTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field ColorStateList mThumbTintList>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getThumbTintMode()
	{
		return mThumbTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//    2    4:areturn         
	}

	public Drawable getTrackDrawable()
	{
		return mTrackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field Drawable mTrackDrawable>
	//    2    4:areturn         
	}

	public ColorStateList getTrackTintList()
	{
		return mTrackTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field ColorStateList mTrackTintList>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getTrackTintMode()
	{
		return mTrackTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//    2    4:areturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #577 <Method void CompoundButton.jumpDrawablesToCurrentState()>
		if(mThumbDrawable != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #180 <Field Drawable mThumbDrawable>
	//*   4    8:ifnull          18
			mThumbDrawable.jumpToCurrentState();
	//    5   11:aload_0         
	//    6   12:getfield        #180 <Field Drawable mThumbDrawable>
	//    7   15:invokevirtual   #580 <Method void Drawable.jumpToCurrentState()>
		if(mTrackDrawable != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #191 <Field Drawable mTrackDrawable>
	//*  10   22:ifnull          32
			mTrackDrawable.jumpToCurrentState();
	//   11   25:aload_0         
	//   12   26:getfield        #191 <Field Drawable mTrackDrawable>
	//   13   29:invokevirtual   #580 <Method void Drawable.jumpToCurrentState()>
		if(mPositionAnimator != null && mPositionAnimator.isStarted())
	//*  14   32:aload_0         
	//*  15   33:getfield        #323 <Field ObjectAnimator mPositionAnimator>
	//*  16   36:ifnull          61
	//*  17   39:aload_0         
	//*  18   40:getfield        #323 <Field ObjectAnimator mPositionAnimator>
	//*  19   43:invokevirtual   #583 <Method boolean ObjectAnimator.isStarted()>
	//*  20   46:ifeq            61
		{
			mPositionAnimator.end();
	//   21   49:aload_0         
	//   22   50:getfield        #323 <Field ObjectAnimator mPositionAnimator>
	//   23   53:invokevirtual   #586 <Method void ObjectAnimator.end()>
			mPositionAnimator = null;
	//   24   56:aload_0         
	//   25   57:aconst_null     
	//   26   58:putfield        #323 <Field ObjectAnimator mPositionAnimator>
		}
	//   27   61:return          
	}

	protected int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #590 <Method int[] CompoundButton.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(isChecked())
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #306 <Method boolean isChecked()>
	//*   8   12:ifeq            23
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//    9   15:aload_2         
	//   10   16:getstatic       #93  <Field int[] CHECKED_STATE_SET>
	//   11   19:invokestatic    #594 <Method int[] mergeDrawableStates(int[], int[])>
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
	//    2    2:invokespecial   #597 <Method void CompoundButton.onDraw(Canvas)>
		Object obj = ((Object) (mTempRect));
	//    3    5:aload_0         
	//    4    6:getfield        #137 <Field Rect mTempRect>
	//    5    9:astore          9
		Drawable drawable = mTrackDrawable;
	//    6   11:aload_0         
	//    7   12:getfield        #191 <Field Drawable mTrackDrawable>
	//    8   15:astore          11
		if(drawable != null)
	//*   9   17:aload           11
	//*  10   19:ifnull          33
			drawable.getPadding(((Rect) (obj)));
	//   11   22:aload           11
	//   12   24:aload           9
	//   13   26:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   14   29:pop             
		else
	//*  15   30:goto            38
			((Rect) (obj)).setEmpty();
	//   16   33:aload           9
	//   17   35:invokevirtual   #600 <Method void Rect.setEmpty()>
		int l = mSwitchTop;
	//   18   38:aload_0         
	//   19   39:getfield        #425 <Field int mSwitchTop>
	//   20   42:istore          4
		int i1 = mSwitchBottom;
	//   21   44:aload_0         
	//   22   45:getfield        #429 <Field int mSwitchBottom>
	//   23   48:istore          5
		int j1 = ((Rect) (obj)).top;
	//   24   50:aload           9
	//   25   52:getfield        #512 <Field int Rect.top>
	//   26   55:istore          6
		int k1 = ((Rect) (obj)).bottom;
	//   27   57:aload           9
	//   28   59:getfield        #515 <Field int Rect.bottom>
	//   29   62:istore          7
		Object obj1 = ((Object) (mThumbDrawable));
	//   30   64:aload_0         
	//   31   65:getfield        #180 <Field Drawable mThumbDrawable>
	//   32   68:astore          10
		if(drawable != null)
	//*  33   70:aload           11
	//*  34   72:ifnull          168
			if(mSplitTrack && obj1 != null)
	//*  35   75:aload_0         
	//*  36   76:getfield        #238 <Field boolean mSplitTrack>
	//*  37   79:ifeq            162
	//*  38   82:aload           10
	//*  39   84:ifnull          162
			{
				Rect rect = DrawableUtils.getOpticalBounds(((Drawable) (obj1)));
	//   40   87:aload           10
	//   41   89:invokestatic    #406 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   42   92:astore          12
				((Drawable) (obj1)).copyBounds(((Rect) (obj)));
	//   43   94:aload           10
	//   44   96:aload           9
	//   45   98:invokevirtual   #604 <Method void Drawable.copyBounds(Rect)>
				obj.left = ((Rect) (obj)).left + rect.left;
	//   46  101:aload           9
	//   47  103:aload           9
	//   48  105:getfield        #416 <Field int Rect.left>
	//   49  108:aload           12
	//   50  110:getfield        #416 <Field int Rect.left>
	//   51  113:iadd            
	//   52  114:putfield        #416 <Field int Rect.left>
				obj.right = ((Rect) (obj)).right - rect.right;
	//   53  117:aload           9
	//   54  119:aload           9
	//   55  121:getfield        #419 <Field int Rect.right>
	//   56  124:aload           12
	//   57  126:getfield        #419 <Field int Rect.right>
	//   58  129:isub            
	//   59  130:putfield        #419 <Field int Rect.right>
				int i = canvas.save();
	//   60  133:aload_1         
	//   61  134:invokevirtual   #609 <Method int Canvas.save()>
	//   62  137:istore_2        
				canvas.clipRect(((Rect) (obj)), android.graphics.Region.Op.DIFFERENCE);
	//   63  138:aload_1         
	//   64  139:aload           9
	//   65  141:getstatic       #615 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   66  144:invokevirtual   #619 <Method boolean Canvas.clipRect(Rect, android.graphics.Region$Op)>
	//   67  147:pop             
				drawable.draw(canvas);
	//   68  148:aload           11
	//   69  150:aload_1         
	//   70  151:invokevirtual   #620 <Method void Drawable.draw(Canvas)>
				canvas.restoreToCount(i);
	//   71  154:aload_1         
	//   72  155:iload_2         
	//   73  156:invokevirtual   #623 <Method void Canvas.restoreToCount(int)>
			} else
	//*  74  159:goto            168
			{
				drawable.draw(canvas);
	//   75  162:aload           11
	//   76  164:aload_1         
	//   77  165:invokevirtual   #620 <Method void Drawable.draw(Canvas)>
			}
		int k = canvas.save();
	//   78  168:aload_1         
	//   79  169:invokevirtual   #609 <Method int Canvas.save()>
	//   80  172:istore_3        
		if(obj1 != null)
	//*  81  173:aload           10
	//*  82  175:ifnull          184
			((Drawable) (obj1)).draw(canvas);
	//   83  178:aload           10
	//   84  180:aload_1         
	//   85  181:invokevirtual   #620 <Method void Drawable.draw(Canvas)>
		if(getTargetCheckedState())
	//*  86  184:aload_0         
	//*  87  185:invokespecial   #500 <Method boolean getTargetCheckedState()>
	//*  88  188:ifeq            200
			obj = ((Object) (mOnLayout));
	//   89  191:aload_0         
	//   90  192:getfield        #625 <Field Layout mOnLayout>
	//   91  195:astore          9
		else
	//*  92  197:goto            206
			obj = ((Object) (mOffLayout));
	//   93  200:aload_0         
	//   94  201:getfield        #627 <Field Layout mOffLayout>
	//   95  204:astore          9
		if(obj != null)
	//*  96  206:aload           9
	//*  97  208:ifnull          340
		{
			int ai[] = getDrawableState();
	//   98  211:aload_0         
	//   99  212:invokevirtual   #361 <Method int[] getDrawableState()>
	//  100  215:astore          11
			if(mTextColors != null)
	//* 101  217:aload_0         
	//* 102  218:getfield        #629 <Field ColorStateList mTextColors>
	//* 103  221:ifnull          241
				mTextPaint.setColor(mTextColors.getColorForState(ai, 0));
	//  104  224:aload_0         
	//  105  225:getfield        #144 <Field TextPaint mTextPaint>
	//  106  228:aload_0         
	//  107  229:getfield        #629 <Field ColorStateList mTextColors>
	//  108  232:aload           11
	//  109  234:iconst_0        
	//  110  235:invokevirtual   #635 <Method int ColorStateList.getColorForState(int[], int)>
	//  111  238:invokevirtual   #638 <Method void TextPaint.setColor(int)>
			mTextPaint.drawableState = ai;
	//  112  241:aload_0         
	//  113  242:getfield        #144 <Field TextPaint mTextPaint>
	//  114  245:aload           11
	//  115  247:putfield        #641 <Field int[] TextPaint.drawableState>
			int j;
			if(obj1 != null)
	//* 116  250:aload           10
	//* 117  252:ifnull          277
			{
				obj1 = ((Object) (((Drawable) (obj1)).getBounds()));
	//  118  255:aload           10
	//  119  257:invokevirtual   #645 <Method Rect Drawable.getBounds()>
	//  120  260:astore          10
				j = ((Rect) (obj1)).left + ((Rect) (obj1)).right;
	//  121  262:aload           10
	//  122  264:getfield        #416 <Field int Rect.left>
	//  123  267:aload           10
	//  124  269:getfield        #419 <Field int Rect.right>
	//  125  272:iadd            
	//  126  273:istore_2        
			} else
	//* 127  274:goto            282
			{
				j = getWidth();
	//  128  277:aload_0         
	//  129  278:invokevirtual   #648 <Method int getWidth()>
	//  130  281:istore_2        
			}
			j /= 2;
	//  131  282:iload_2         
	//  132  283:iconst_2        
	//  133  284:idiv            
	//  134  285:istore_2        
			int l1 = ((Layout) (obj)).getWidth() / 2;
	//  135  286:aload           9
	//  136  288:invokevirtual   #649 <Method int Layout.getWidth()>
	//  137  291:iconst_2        
	//  138  292:idiv            
	//  139  293:istore          8
			l = (l + j1 + (i1 - k1)) / 2;
	//  140  295:iload           4
	//  141  297:iload           6
	//  142  299:iadd            
	//  143  300:iload           5
	//  144  302:iload           7
	//  145  304:isub            
	//  146  305:iadd            
	//  147  306:iconst_2        
	//  148  307:idiv            
	//  149  308:istore          4
			i1 = ((Layout) (obj)).getHeight() / 2;
	//  150  310:aload           9
	//  151  312:invokevirtual   #652 <Method int Layout.getHeight()>
	//  152  315:iconst_2        
	//  153  316:idiv            
	//  154  317:istore          5
			canvas.translate(j - l1, l - i1);
	//  155  319:aload_1         
	//  156  320:iload_2         
	//  157  321:iload           8
	//  158  323:isub            
	//  159  324:i2f             
	//  160  325:iload           4
	//  161  327:iload           5
	//  162  329:isub            
	//  163  330:i2f             
	//  164  331:invokevirtual   #655 <Method void Canvas.translate(float, float)>
			((Layout) (obj)).draw(canvas);
	//  165  334:aload           9
	//  166  336:aload_1         
	//  167  337:invokevirtual   #656 <Method void Layout.draw(Canvas)>
		}
		canvas.restoreToCount(k);
	//  168  340:aload_1         
	//  169  341:iload_3         
	//  170  342:invokevirtual   #623 <Method void Canvas.restoreToCount(int)>
	//  171  345:return          
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #660 <Method void CompoundButton.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName("android.widget.Switch");
	//    3    5:aload_1         
	//    4    6:ldc1            #10  <String "android.widget.Switch">
	//    5    8:invokevirtual   #666 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    6   11:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #670 <Method void CompoundButton.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName("android.widget.Switch");
	//    3    5:aload_1         
	//    4    6:ldc1            #10  <String "android.widget.Switch">
	//    5    8:invokevirtual   #673 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		CharSequence charsequence;
		if(isChecked())
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #306 <Method boolean isChecked()>
	//*   8   15:ifeq            26
			charsequence = mTextOn;
	//    9   18:aload_0         
	//   10   19:getfield        #200 <Field CharSequence mTextOn>
	//   11   22:astore_2        
		else
	//*  12   23:goto            31
			charsequence = mTextOff;
	//   13   26:aload_0         
	//   14   27:getfield        #205 <Field CharSequence mTextOff>
	//   15   30:astore_2        
		if(!TextUtils.isEmpty(charsequence))
	//*  16   31:aload_2         
	//*  17   32:invokestatic    #554 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   35:ifne            93
		{
			CharSequence charsequence1 = accessibilitynodeinfo.getText();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #674 <Method CharSequence AccessibilityNodeInfo.getText()>
	//   21   42:astore_3        
			if(TextUtils.isEmpty(charsequence1))
	//*  22   43:aload_3         
	//*  23   44:invokestatic    #554 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  24   47:ifeq            56
			{
				accessibilitynodeinfo.setText(charsequence);
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:invokevirtual   #677 <Method void AccessibilityNodeInfo.setText(CharSequence)>
				return;
	//   28   55:return          
			}
			StringBuilder stringbuilder = new StringBuilder();
	//   29   56:new             #679 <Class StringBuilder>
	//   30   59:dup             
	//   31   60:invokespecial   #680 <Method void StringBuilder()>
	//   32   63:astore          4
			stringbuilder.append(charsequence1);
	//   33   65:aload           4
	//   34   67:aload_3         
	//   35   68:invokevirtual   #684 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   36   71:pop             
			stringbuilder.append(' ');
	//   37   72:aload           4
	//   38   74:bipush          32
	//   39   76:invokevirtual   #687 <Method StringBuilder StringBuilder.append(char)>
	//   40   79:pop             
			stringbuilder.append(charsequence);
	//   41   80:aload           4
	//   42   82:aload_2         
	//   43   83:invokevirtual   #684 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   44   86:pop             
			accessibilitynodeinfo.setText(((CharSequence) (stringbuilder)));
	//   45   87:aload_1         
	//   46   88:aload           4
	//   47   90:invokevirtual   #677 <Method void AccessibilityNodeInfo.setText(CharSequence)>
		}
	//   48   93:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #691 <Method void CompoundButton.onLayout(boolean, int, int, int, int)>
		Drawable drawable = mThumbDrawable;
	//    7   11:aload_0         
	//    8   12:getfield        #180 <Field Drawable mThumbDrawable>
	//    9   15:astore          6
		j = 0;
	//   10   17:iconst_0        
	//   11   18:istore_3        
		if(drawable != null)
	//*  12   19:aload           6
	//*  13   21:ifnull          99
		{
			Rect rect = mTempRect;
	//   14   24:aload_0         
	//   15   25:getfield        #137 <Field Rect mTempRect>
	//   16   28:astore          6
			if(mTrackDrawable != null)
	//*  17   30:aload_0         
	//*  18   31:getfield        #191 <Field Drawable mTrackDrawable>
	//*  19   34:ifnull          50
				mTrackDrawable.getPadding(rect);
	//   20   37:aload_0         
	//   21   38:getfield        #191 <Field Drawable mTrackDrawable>
	//   22   41:aload           6
	//   23   43:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   24   46:pop             
			else
	//*  25   47:goto            55
				rect.setEmpty();
	//   26   50:aload           6
	//   27   52:invokevirtual   #600 <Method void Rect.setEmpty()>
			Rect rect1 = DrawableUtils.getOpticalBounds(mThumbDrawable);
	//   28   55:aload_0         
	//   29   56:getfield        #180 <Field Drawable mThumbDrawable>
	//   30   59:invokestatic    #406 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   31   62:astore          7
			j = Math.max(0, rect1.left - rect.left);
	//   32   64:iconst_0        
	//   33   65:aload           7
	//   34   67:getfield        #416 <Field int Rect.left>
	//   35   70:aload           6
	//   36   72:getfield        #416 <Field int Rect.left>
	//   37   75:isub            
	//   38   76:invokestatic    #694 <Method int Math.max(int, int)>
	//   39   79:istore_3        
			i = Math.max(0, rect1.right - rect.right);
	//   40   80:iconst_0        
	//   41   81:aload           7
	//   42   83:getfield        #419 <Field int Rect.right>
	//   43   86:aload           6
	//   44   88:getfield        #419 <Field int Rect.right>
	//   45   91:isub            
	//   46   92:invokestatic    #694 <Method int Math.max(int, int)>
	//   47   95:istore_2        
		} else
	//*  48   96:goto            101
		{
			i = 0;
	//   49   99:iconst_0        
	//   50  100:istore_2        
		}
		if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*  51  101:aload_0         
	//*  52  102:invokestatic    #395 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  53  105:ifeq            132
		{
			k = getPaddingLeft() + j;
	//   54  108:aload_0         
	//   55  109:invokevirtual   #697 <Method int getPaddingLeft()>
	//   56  112:iload_3         
	//   57  113:iadd            
	//   58  114:istore          4
			l = (mSwitchWidth + k) - j - i;
	//   59  116:aload_0         
	//   60  117:getfield        #411 <Field int mSwitchWidth>
	//   61  120:iload           4
	//   62  122:iadd            
	//   63  123:iload_3         
	//   64  124:isub            
	//   65  125:iload_2         
	//   66  126:isub            
	//   67  127:istore          5
		} else
	//*  68  129:goto            158
		{
			l = getWidth() - getPaddingRight() - i;
	//   69  132:aload_0         
	//   70  133:invokevirtual   #648 <Method int getWidth()>
	//   71  136:aload_0         
	//   72  137:invokevirtual   #700 <Method int getPaddingRight()>
	//   73  140:isub            
	//   74  141:iload_2         
	//   75  142:isub            
	//   76  143:istore          5
			k = (l - mSwitchWidth) + j + i;
	//   77  145:iload           5
	//   78  147:aload_0         
	//   79  148:getfield        #411 <Field int mSwitchWidth>
	//   80  151:isub            
	//   81  152:iload_3         
	//   82  153:iadd            
	//   83  154:iload_2         
	//   84  155:iadd            
	//   85  156:istore          4
		}
		i = getGravity() & 0x70;
	//   86  158:aload_0         
	//   87  159:invokevirtual   #703 <Method int getGravity()>
	//   88  162:bipush          112
	//   89  164:iand            
	//   90  165:istore_2        
		if(i != 16)
	//*  91  166:iload_2         
	//*  92  167:bipush          16
	//*  93  169:icmpeq          213
		{
			if(i != 80)
	//*  94  172:iload_2         
	//*  95  173:bipush          80
	//*  96  175:icmpeq          193
			{
				i = getPaddingTop();
	//   97  178:aload_0         
	//   98  179:invokevirtual   #706 <Method int getPaddingTop()>
	//   99  182:istore_2        
				j = mSwitchHeight + i;
	//  100  183:aload_0         
	//  101  184:getfield        #708 <Field int mSwitchHeight>
	//  102  187:iload_2         
	//  103  188:iadd            
	//  104  189:istore_3        
			} else
	//* 105  190:goto            244
			{
				j = getHeight() - getPaddingBottom();
	//  106  193:aload_0         
	//  107  194:invokevirtual   #709 <Method int getHeight()>
	//  108  197:aload_0         
	//  109  198:invokevirtual   #712 <Method int getPaddingBottom()>
	//  110  201:isub            
	//  111  202:istore_3        
				i = j - mSwitchHeight;
	//  112  203:iload_3         
	//  113  204:aload_0         
	//  114  205:getfield        #708 <Field int mSwitchHeight>
	//  115  208:isub            
	//  116  209:istore_2        
			}
		} else
	//* 117  210:goto            244
		{
			i = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - mSwitchHeight / 2;
	//  118  213:aload_0         
	//  119  214:invokevirtual   #706 <Method int getPaddingTop()>
	//  120  217:aload_0         
	//  121  218:invokevirtual   #709 <Method int getHeight()>
	//  122  221:iadd            
	//  123  222:aload_0         
	//  124  223:invokevirtual   #712 <Method int getPaddingBottom()>
	//  125  226:isub            
	//  126  227:iconst_2        
	//  127  228:idiv            
	//  128  229:aload_0         
	//  129  230:getfield        #708 <Field int mSwitchHeight>
	//  130  233:iconst_2        
	//  131  234:idiv            
	//  132  235:isub            
	//  133  236:istore_2        
			j = mSwitchHeight + i;
	//  134  237:aload_0         
	//  135  238:getfield        #708 <Field int mSwitchHeight>
	//  136  241:iload_2         
	//  137  242:iadd            
	//  138  243:istore_3        
		}
		mSwitchLeft = k;
	//  139  244:aload_0         
	//  140  245:iload           4
	//  141  247:putfield        #427 <Field int mSwitchLeft>
		mSwitchTop = i;
	//  142  250:aload_0         
	//  143  251:iload_2         
	//  144  252:putfield        #425 <Field int mSwitchTop>
		mSwitchBottom = j;
	//  145  255:aload_0         
	//  146  256:iload_3         
	//  147  257:putfield        #429 <Field int mSwitchBottom>
		mSwitchRight = l;
	//  148  260:aload_0         
	//  149  261:iload           5
	//  150  263:putfield        #509 <Field int mSwitchRight>
	//  151  266:return          
	}

	public void onMeasure(int i, int j)
	{
		if(mShowText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field boolean mShowText>
	//*   2    4:ifeq            45
		{
			if(mOnLayout == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #625 <Field Layout mOnLayout>
	//*   5   11:ifnonnull       26
				mOnLayout = makeLayout(mTextOn);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #200 <Field CharSequence mTextOn>
	//   10   20:invokespecial   #715 <Method Layout makeLayout(CharSequence)>
	//   11   23:putfield        #625 <Field Layout mOnLayout>
			if(mOffLayout == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #627 <Field Layout mOffLayout>
	//*  14   30:ifnonnull       45
				mOffLayout = makeLayout(mTextOff);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #205 <Field CharSequence mTextOff>
	//   19   39:invokespecial   #715 <Method Layout makeLayout(CharSequence)>
	//   20   42:putfield        #627 <Field Layout mOffLayout>
		}
		Rect rect = mTempRect;
	//   21   45:aload_0         
	//   22   46:getfield        #137 <Field Rect mTempRect>
	//   23   49:astore          9
		Drawable drawable = mThumbDrawable;
	//   24   51:aload_0         
	//   25   52:getfield        #180 <Field Drawable mThumbDrawable>
	//   26   55:astore          10
		int j1 = 0;
	//   27   57:iconst_0        
	//   28   58:istore          6
		int k;
		int l;
		if(drawable != null)
	//*  29   60:aload           10
	//*  30   62:ifnull          107
		{
			mThumbDrawable.getPadding(rect);
	//   31   65:aload_0         
	//   32   66:getfield        #180 <Field Drawable mThumbDrawable>
	//   33   69:aload           9
	//   34   71:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   35   74:pop             
			l = mThumbDrawable.getIntrinsicWidth() - rect.left - rect.right;
	//   36   75:aload_0         
	//   37   76:getfield        #180 <Field Drawable mThumbDrawable>
	//   38   79:invokevirtual   #718 <Method int Drawable.getIntrinsicWidth()>
	//   39   82:aload           9
	//   40   84:getfield        #416 <Field int Rect.left>
	//   41   87:isub            
	//   42   88:aload           9
	//   43   90:getfield        #419 <Field int Rect.right>
	//   44   93:isub            
	//   45   94:istore          4
			k = mThumbDrawable.getIntrinsicHeight();
	//   46   96:aload_0         
	//   47   97:getfield        #180 <Field Drawable mThumbDrawable>
	//   48  100:invokevirtual   #721 <Method int Drawable.getIntrinsicHeight()>
	//   49  103:istore_3        
		} else
	//*  50  104:goto            113
		{
			l = 0;
	//   51  107:iconst_0        
	//   52  108:istore          4
			k = l;
	//   53  110:iload           4
	//   54  112:istore_3        
		}
		int i1;
		if(mShowText)
	//*  55  113:aload_0         
	//*  56  114:getfield        #214 <Field boolean mShowText>
	//*  57  117:ifeq            149
			i1 = Math.max(mOnLayout.getWidth(), mOffLayout.getWidth()) + mThumbTextPadding * 2;
	//   58  120:aload_0         
	//   59  121:getfield        #625 <Field Layout mOnLayout>
	//   60  124:invokevirtual   #649 <Method int Layout.getWidth()>
	//   61  127:aload_0         
	//   62  128:getfield        #627 <Field Layout mOffLayout>
	//   63  131:invokevirtual   #649 <Method int Layout.getWidth()>
	//   64  134:invokestatic    #694 <Method int Math.max(int, int)>
	//   65  137:aload_0         
	//   66  138:getfield        #223 <Field int mThumbTextPadding>
	//   67  141:iconst_2        
	//   68  142:imul            
	//   69  143:iadd            
	//   70  144:istore          5
		else
	//*  71  146:goto            152
			i1 = 0;
	//   72  149:iconst_0        
	//   73  150:istore          5
		mThumbWidth = Math.max(i1, l);
	//   74  152:aload_0         
	//   75  153:iload           5
	//   76  155:iload           4
	//   77  157:invokestatic    #694 <Method int Math.max(int, int)>
	//   78  160:putfield        #413 <Field int mThumbWidth>
		if(mTrackDrawable != null)
	//*  79  163:aload_0         
	//*  80  164:getfield        #191 <Field Drawable mTrackDrawable>
	//*  81  167:ifnull          192
		{
			mTrackDrawable.getPadding(rect);
	//   82  170:aload_0         
	//   83  171:getfield        #191 <Field Drawable mTrackDrawable>
	//   84  174:aload           9
	//   85  176:invokevirtual   #402 <Method boolean Drawable.getPadding(Rect)>
	//   86  179:pop             
			l = mTrackDrawable.getIntrinsicHeight();
	//   87  180:aload_0         
	//   88  181:getfield        #191 <Field Drawable mTrackDrawable>
	//   89  184:invokevirtual   #721 <Method int Drawable.getIntrinsicHeight()>
	//   90  187:istore          4
		} else
	//*  91  189:goto            201
		{
			rect.setEmpty();
	//   92  192:aload           9
	//   93  194:invokevirtual   #600 <Method void Rect.setEmpty()>
			l = j1;
	//   94  197:iload           6
	//   95  199:istore          4
		}
		int l1 = rect.left;
	//   96  201:aload           9
	//   97  203:getfield        #416 <Field int Rect.left>
	//   98  206:istore          8
		int k1 = rect.right;
	//   99  208:aload           9
	//  100  210:getfield        #419 <Field int Rect.right>
	//  101  213:istore          7
		j1 = k1;
	//  102  215:iload           7
	//  103  217:istore          6
		i1 = l1;
	//  104  219:iload           8
	//  105  221:istore          5
		if(mThumbDrawable != null)
	//* 106  223:aload_0         
	//* 107  224:getfield        #180 <Field Drawable mThumbDrawable>
	//* 108  227:ifnull          263
		{
			Rect rect1 = DrawableUtils.getOpticalBounds(mThumbDrawable);
	//  109  230:aload_0         
	//  110  231:getfield        #180 <Field Drawable mThumbDrawable>
	//  111  234:invokestatic    #406 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//  112  237:astore          9
			i1 = Math.max(l1, rect1.left);
	//  113  239:iload           8
	//  114  241:aload           9
	//  115  243:getfield        #416 <Field int Rect.left>
	//  116  246:invokestatic    #694 <Method int Math.max(int, int)>
	//  117  249:istore          5
			j1 = Math.max(k1, rect1.right);
	//  118  251:iload           7
	//  119  253:aload           9
	//  120  255:getfield        #419 <Field int Rect.right>
	//  121  258:invokestatic    #694 <Method int Math.max(int, int)>
	//  122  261:istore          6
		}
		i1 = Math.max(mSwitchMinWidth, 2 * mThumbWidth + i1 + j1);
	//  123  263:aload_0         
	//  124  264:getfield        #228 <Field int mSwitchMinWidth>
	//  125  267:iconst_2        
	//  126  268:aload_0         
	//  127  269:getfield        #413 <Field int mThumbWidth>
	//  128  272:imul            
	//  129  273:iload           5
	//  130  275:iadd            
	//  131  276:iload           6
	//  132  278:iadd            
	//  133  279:invokestatic    #694 <Method int Math.max(int, int)>
	//  134  282:istore          5
		k = Math.max(l, k);
	//  135  284:iload           4
	//  136  286:iload_3         
	//  137  287:invokestatic    #694 <Method int Math.max(int, int)>
	//  138  290:istore_3        
		mSwitchWidth = i1;
	//  139  291:aload_0         
	//  140  292:iload           5
	//  141  294:putfield        #411 <Field int mSwitchWidth>
		mSwitchHeight = k;
	//  142  297:aload_0         
	//  143  298:iload_3         
	//  144  299:putfield        #708 <Field int mSwitchHeight>
		super.onMeasure(i, j);
	//  145  302:aload_0         
	//  146  303:iload_1         
	//  147  304:iload_2         
	//  148  305:invokespecial   #723 <Method void CompoundButton.onMeasure(int, int)>
		if(getMeasuredHeight() < k)
	//* 149  308:aload_0         
	//* 150  309:invokevirtual   #726 <Method int getMeasuredHeight()>
	//* 151  312:iload_3         
	//* 152  313:icmpge          325
			setMeasuredDimension(getMeasuredWidthAndState(), k);
	//  153  316:aload_0         
	//  154  317:aload_0         
	//  155  318:invokevirtual   #729 <Method int getMeasuredWidthAndState()>
	//  156  321:iload_3         
	//  157  322:invokevirtual   #732 <Method void setMeasuredDimension(int, int)>
	//  158  325:return          
	}

	public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onPopulateAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #735 <Method void CompoundButton.onPopulateAccessibilityEvent(AccessibilityEvent)>
		CharSequence charsequence;
		if(isChecked())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #306 <Method boolean isChecked()>
	//*   5    9:ifeq            20
			charsequence = mTextOn;
	//    6   12:aload_0         
	//    7   13:getfield        #200 <Field CharSequence mTextOn>
	//    8   16:astore_2        
		else
	//*   9   17:goto            25
			charsequence = mTextOff;
	//   10   20:aload_0         
	//   11   21:getfield        #205 <Field CharSequence mTextOff>
	//   12   24:astore_2        
		if(charsequence != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          40
			accessibilityevent.getText().add(((Object) (charsequence)));
	//   15   29:aload_1         
	//   16   30:invokevirtual   #738 <Method List AccessibilityEvent.getText()>
	//   17   33:aload_2         
	//   18   34:invokeinterface #744 <Method boolean List.add(Object)>
	//   19   39:pop             
	//   20   40:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		mVelocityTracker.addMovement(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field VelocityTracker mVelocityTracker>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #747 <Method void VelocityTracker.addMovement(MotionEvent)>
		switch(motionevent.getActionMasked())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #750 <Method int MotionEvent.getActionMasked()>
		{
		default:
			break;

	//*   6   12:tableswitch     0 3: default 44
	//	               0 283
	//	               1 247
	//	               2 47
	//	               3 247
	//*   7   44:goto            324
		case 2: // '\002'
			switch(mTouchMode)
	//*   8   47:aload_0         
	//*   9   48:getfield        #481 <Field int mTouchMode>
			{
	//*  10   51:tableswitch     0 2: default 76
	//	               0 324
	//	               1 174
	//	               2 79
	//*  11   76:goto            324
			case 2: // '\002'
				float f6 = motionevent.getX();
	//   12   79:aload_1         
	//   13   80:invokevirtual   #753 <Method float MotionEvent.getX()>
	//   14   83:fstore          4
				int i = getThumbScrollRange();
	//   15   85:aload_0         
	//   16   86:invokespecial   #398 <Method int getThumbScrollRange()>
	//   17   89:istore          5
				float f = f6 - mTouchX;
	//   18   91:fload           4
	//   19   93:aload_0         
	//   20   94:getfield        #755 <Field float mTouchX>
	//   21   97:fsub            
	//   22   98:fstore_2        
				if(i != 0)
	//*  23   99:iload           5
	//*  24  101:ifeq            113
					f /= i;
	//   25  104:fload_2         
	//   26  105:iload           5
	//   27  107:i2f             
	//   28  108:fdiv            
	//   29  109:fstore_2        
				else
	//*  30  110:goto            128
				if(f > 0.0F)
	//*  31  113:fload_2         
	//*  32  114:fconst_0        
	//*  33  115:fcmpl           
	//*  34  116:ifle            124
					f = 1.0F;
	//   35  119:fconst_1        
	//   36  120:fstore_2        
				else
	//*  37  121:goto            128
					f = -1F;
	//   38  124:ldc2            #756 <Float -1F>
	//   39  127:fstore_2        
				float f3 = f;
	//   40  128:fload_2         
	//   41  129:fstore_3        
				if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*  42  130:aload_0         
	//*  43  131:invokestatic    #395 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  44  134:ifeq            140
					f3 = -f;
	//   45  137:fload_2         
	//   46  138:fneg            
	//   47  139:fstore_3        
				f = constrain(mThumbPosition + f3, 0.0F, 1.0F);
	//   48  140:aload_0         
	//   49  141:getfield        #314 <Field float mThumbPosition>
	//   50  144:fload_3         
	//   51  145:fadd            
	//   52  146:fconst_0        
	//   53  147:fconst_1        
	//   54  148:invokestatic    #758 <Method float constrain(float, float, float)>
	//   55  151:fstore_2        
				if(f != mThumbPosition)
	//*  56  152:fload_2         
	//*  57  153:aload_0         
	//*  58  154:getfield        #314 <Field float mThumbPosition>
	//*  59  157:fcmpl           
	//*  60  158:ifeq            172
				{
					mTouchX = f6;
	//   61  161:aload_0         
	//   62  162:fload           4
	//   63  164:putfield        #755 <Field float mTouchX>
					setThumbPosition(f);
	//   64  167:aload_0         
	//   65  168:fload_2         
	//   66  169:invokevirtual   #762 <Method void setThumbPosition(float)>
				}
				return true;
	//   67  172:iconst_1        
	//   68  173:ireturn         

			case 1: // '\001'
				float f1 = motionevent.getX();
	//   69  174:aload_1         
	//   70  175:invokevirtual   #753 <Method float MotionEvent.getX()>
	//   71  178:fstore_2        
				float f4 = motionevent.getY();
	//   72  179:aload_1         
	//   73  180:invokevirtual   #765 <Method float MotionEvent.getY()>
	//   74  183:fstore_3        
				if(Math.abs(f1 - mTouchX) > (float)mTouchSlop || Math.abs(f4 - mTouchY) > (float)mTouchSlop)
	//*  75  184:fload_2         
	//*  76  185:aload_0         
	//*  77  186:getfield        #755 <Field float mTouchX>
	//*  78  189:fsub            
	//*  79  190:invokestatic    #498 <Method float Math.abs(float)>
	//*  80  193:aload_0         
	//*  81  194:getfield        #294 <Field int mTouchSlop>
	//*  82  197:i2f             
	//*  83  198:fcmpl           
	//*  84  199:ifgt            220
	//*  85  202:fload_3         
	//*  86  203:aload_0         
	//*  87  204:getfield        #767 <Field float mTouchY>
	//*  88  207:fsub            
	//*  89  208:invokestatic    #498 <Method float Math.abs(float)>
	//*  90  211:aload_0         
	//*  91  212:getfield        #294 <Field int mTouchSlop>
	//*  92  215:i2f             
	//*  93  216:fcmpl           
	//*  94  217:ifle            324
				{
					mTouchMode = 2;
	//   95  220:aload_0         
	//   96  221:iconst_2        
	//   97  222:putfield        #481 <Field int mTouchMode>
					getParent().requestDisallowInterceptTouchEvent(true);
	//   98  225:aload_0         
	//   99  226:invokevirtual   #771 <Method ViewParent getParent()>
	//  100  229:iconst_1        
	//  101  230:invokeinterface #776 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
					mTouchX = f1;
	//  102  235:aload_0         
	//  103  236:fload_2         
	//  104  237:putfield        #755 <Field float mTouchX>
					mTouchY = f4;
	//  105  240:aload_0         
	//  106  241:fload_3         
	//  107  242:putfield        #767 <Field float mTouchY>
					return true;
	//  108  245:iconst_1        
	//  109  246:ireturn         
				}
				break;
			}
			break;

		case 1: // '\001'
		case 3: // '\003'
			if(mTouchMode == 2)
	//* 110  247:aload_0         
	//* 111  248:getfield        #481 <Field int mTouchMode>
	//* 112  251:iconst_2        
	//* 113  252:icmpne          268
			{
				stopDrag(motionevent);
	//  114  255:aload_0         
	//  115  256:aload_1         
	//  116  257:invokespecial   #778 <Method void stopDrag(MotionEvent)>
				super.onTouchEvent(motionevent);
	//  117  260:aload_0         
	//  118  261:aload_1         
	//  119  262:invokespecial   #383 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//  120  265:pop             
				return true;
	//  121  266:iconst_1        
	//  122  267:ireturn         
			}
			mTouchMode = 0;
	//  123  268:aload_0         
	//  124  269:iconst_0        
	//  125  270:putfield        #481 <Field int mTouchMode>
			mVelocityTracker.clear();
	//  126  273:aload_0         
	//  127  274:getfield        #131 <Field VelocityTracker mVelocityTracker>
	//  128  277:invokevirtual   #781 <Method void VelocityTracker.clear()>
			break;
	//  129  280:goto            324

		case 0: // '\0'
			float f2 = motionevent.getX();
	//  130  283:aload_1         
	//  131  284:invokevirtual   #753 <Method float MotionEvent.getX()>
	//  132  287:fstore_2        
			float f5 = motionevent.getY();
	//  133  288:aload_1         
	//  134  289:invokevirtual   #765 <Method float MotionEvent.getY()>
	//  135  292:fstore_3        
			if(isEnabled() && hitThumb(f2, f5))
	//* 136  293:aload_0         
	//* 137  294:invokevirtual   #487 <Method boolean isEnabled()>
	//* 138  297:ifeq            324
	//* 139  300:aload_0         
	//* 140  301:fload_2         
	//* 141  302:fload_3         
	//* 142  303:invokespecial   #783 <Method boolean hitThumb(float, float)>
	//* 143  306:ifeq            324
			{
				mTouchMode = 1;
	//  144  309:aload_0         
	//  145  310:iconst_1        
	//  146  311:putfield        #481 <Field int mTouchMode>
				mTouchX = f2;
	//  147  314:aload_0         
	//  148  315:fload_2         
	//  149  316:putfield        #755 <Field float mTouchX>
				mTouchY = f5;
	//  150  319:aload_0         
	//  151  320:fload_3         
	//  152  321:putfield        #767 <Field float mTouchY>
			}
			break;
		}
		return super.onTouchEvent(motionevent);
	//  153  324:aload_0         
	//  154  325:aload_1         
	//  155  326:invokespecial   #383 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//  156  329:ireturn         
	}

	public void setChecked(boolean flag)
	{
		super.setChecked(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #784 <Method void CompoundButton.setChecked(boolean)>
		flag = isChecked();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #306 <Method boolean isChecked()>
	//    5    9:istore_1        
		if(getWindowToken() != null && ViewCompat.isLaidOut(((android.view.View) (this))))
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #788 <Method android.os.IBinder getWindowToken()>
	//*   8   14:ifnull          30
	//*   9   17:aload_0         
	//*  10   18:invokestatic    #793 <Method boolean ViewCompat.isLaidOut(android.view.View)>
	//*  11   21:ifeq            30
		{
			animateThumbToCheckedState(flag);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #795 <Method void animateThumbToCheckedState(boolean)>
			return;
	//   15   29:return          
		}
		cancelPositionAnimator();
	//   16   30:aload_0         
	//   17   31:invokespecial   #797 <Method void cancelPositionAnimator()>
		float f;
		if(flag)
	//*  18   34:iload_1         
	//*  19   35:ifeq            43
			f = 1.0F;
	//   20   38:fconst_1        
	//   21   39:fstore_2        
		else
	//*  22   40:goto            45
			f = 0.0F;
	//   23   43:fconst_0        
	//   24   44:fstore_2        
		setThumbPosition(f);
	//   25   45:aload_0         
	//   26   46:fload_2         
	//   27   47:invokevirtual   #762 <Method void setThumbPosition(float)>
	//   28   50:return          
	}

	public void setShowText(boolean flag)
	{
		if(mShowText != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #214 <Field boolean mShowText>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mShowText = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #214 <Field boolean mShowText>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #801 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setSplitTrack(boolean flag)
	{
		mSplitTrack = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #238 <Field boolean mSplitTrack>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #542 <Method void invalidate()>
	//    5    9:return          
	}

	public void setSwitchMinWidth(int i)
	{
		mSwitchMinWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #228 <Field int mSwitchMinWidth>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #801 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setSwitchPadding(int i)
	{
		mSwitchPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #233 <Field int mSwitchPadding>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #801 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setSwitchTextAppearance(Context context, int i)
	{
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, i, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #807 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    3    5:invokestatic    #810 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    4    8:astore_1        
		ColorStateList colorstatelist = ((TintTypedArray) (context)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//    5    9:aload_1         
	//    6   10:getstatic       #813 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//    7   13:invokevirtual   #245 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//    8   16:astore          4
		if(colorstatelist != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          32
			mTextColors = colorstatelist;
	//   11   23:aload_0         
	//   12   24:aload           4
	//   13   26:putfield        #629 <Field ColorStateList mTextColors>
		else
	//*  14   29:goto            40
			mTextColors = getTextColors();
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:invokevirtual   #816 <Method ColorStateList getTextColors()>
	//   18   37:putfield        #629 <Field ColorStateList mTextColors>
		i = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
	//   19   40:aload_1         
	//   20   41:getstatic       #819 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   21   44:iconst_0        
	//   22   45:invokevirtual   #221 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   23   48:istore_2        
		if(i != 0)
	//*  24   49:iload_2         
	//*  25   50:ifeq            80
		{
			float f = i;
	//   26   53:iload_2         
	//   27   54:i2f             
	//   28   55:fstore_3        
			if(f != mTextPaint.getTextSize())
	//*  29   56:fload_3         
	//*  30   57:aload_0         
	//*  31   58:getfield        #144 <Field TextPaint mTextPaint>
	//*  32   61:invokevirtual   #822 <Method float TextPaint.getTextSize()>
	//*  33   64:fcmpl           
	//*  34   65:ifeq            80
			{
				mTextPaint.setTextSize(f);
	//   35   68:aload_0         
	//   36   69:getfield        #144 <Field TextPaint mTextPaint>
	//   37   72:fload_3         
	//   38   73:invokevirtual   #825 <Method void TextPaint.setTextSize(float)>
				requestLayout();
	//   39   76:aload_0         
	//   40   77:invokevirtual   #801 <Method void requestLayout()>
			}
		}
		setSwitchTypefaceByIndex(((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface, -1), ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle, -1));
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:getstatic       #828 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//   44   85:iconst_m1       
	//   45   86:invokevirtual   #251 <Method int TintTypedArray.getInt(int, int)>
	//   46   89:aload_1         
	//   47   90:getstatic       #831 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textStyle>
	//   48   93:iconst_m1       
	//   49   94:invokevirtual   #251 <Method int TintTypedArray.getInt(int, int)>
	//   50   97:invokespecial   #833 <Method void setSwitchTypefaceByIndex(int, int)>
		if(((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false))
	//*  51  100:aload_1         
	//*  52  101:getstatic       #836 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*  53  104:iconst_0        
	//*  54  105:invokevirtual   #212 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//*  55  108:ifeq            129
			mSwitchTransformationMethod = ((TransformationMethod) (new AllCapsTransformationMethod(getContext())));
	//   56  111:aload_0         
	//   57  112:new             #838 <Class AllCapsTransformationMethod>
	//   58  115:dup             
	//   59  116:aload_0         
	//   60  117:invokevirtual   #842 <Method Context getContext()>
	//   61  120:invokespecial   #844 <Method void AllCapsTransformationMethod(Context)>
	//   62  123:putfield        #433 <Field TransformationMethod mSwitchTransformationMethod>
		else
	//*  63  126:goto            134
			mSwitchTransformationMethod = null;
	//   64  129:aload_0         
	//   65  130:aconst_null     
	//   66  131:putfield        #433 <Field TransformationMethod mSwitchTransformationMethod>
		((TintTypedArray) (context)).recycle();
	//   67  134:aload_1         
	//   68  135:invokevirtual   #282 <Method void TintTypedArray.recycle()>
	//   69  138:return          
	}

	public void setSwitchTypeface(Typeface typeface)
	{
		if(mTextPaint.getTypeface() != null && !mTextPaint.getTypeface().equals(((Object) (typeface))) || mTextPaint.getTypeface() == null && typeface != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field TextPaint mTextPaint>
	//*   2    4:invokevirtual   #849 <Method Typeface TextPaint.getTypeface()>
	//*   3    7:ifnull          24
	//*   4   10:aload_0         
	//*   5   11:getfield        #144 <Field TextPaint mTextPaint>
	//*   6   14:invokevirtual   #849 <Method Typeface TextPaint.getTypeface()>
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #852 <Method boolean Typeface.equals(Object)>
	//*   9   21:ifeq            38
	//*  10   24:aload_0         
	//*  11   25:getfield        #144 <Field TextPaint mTextPaint>
	//*  12   28:invokevirtual   #849 <Method Typeface TextPaint.getTypeface()>
	//*  13   31:ifnonnull       55
	//*  14   34:aload_1         
	//*  15   35:ifnull          55
		{
			mTextPaint.setTypeface(typeface);
	//   16   38:aload_0         
	//   17   39:getfield        #144 <Field TextPaint mTextPaint>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #856 <Method Typeface TextPaint.setTypeface(Typeface)>
	//   20   46:pop             
			requestLayout();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #801 <Method void requestLayout()>
			invalidate();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #542 <Method void invalidate()>
		}
	//   25   55:return          
	}

	public void setSwitchTypeface(Typeface typeface, int i)
	{
		float f = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_3        
		boolean flag = false;
	//    2    2:iconst_0        
	//    3    3:istore          5
		if(i > 0)
	//*   4    5:iload_2         
	//*   5    6:ifle            96
		{
			if(typeface == null)
	//*   6    9:aload_1         
	//*   7   10:ifnonnull       21
				typeface = Typeface.defaultFromStyle(i);
	//    8   13:iload_2         
	//    9   14:invokestatic    #860 <Method Typeface Typeface.defaultFromStyle(int)>
	//   10   17:astore_1        
			else
	//*  11   18:goto            27
				typeface = Typeface.create(typeface, i);
	//   12   21:aload_1         
	//   13   22:iload_2         
	//   14   23:invokestatic    #864 <Method Typeface Typeface.create(Typeface, int)>
	//   15   26:astore_1        
			setSwitchTypeface(typeface);
	//   16   27:aload_0         
	//   17   28:aload_1         
	//   18   29:invokevirtual   #866 <Method void setSwitchTypeface(Typeface)>
			int j;
			if(typeface != null)
	//*  19   32:aload_1         
	//*  20   33:ifnull          45
				j = typeface.getStyle();
	//   21   36:aload_1         
	//   22   37:invokevirtual   #869 <Method int Typeface.getStyle()>
	//   23   40:istore          4
			else
	//*  24   42:goto            48
				j = 0;
	//   25   45:iconst_0        
	//   26   46:istore          4
			i = ~j & i;
	//   27   48:iload           4
	//   28   50:iconst_m1       
	//   29   51:ixor            
	//   30   52:iload_2         
	//   31   53:iand            
	//   32   54:istore_2        
			typeface = ((Typeface) (mTextPaint));
	//   33   55:aload_0         
	//   34   56:getfield        #144 <Field TextPaint mTextPaint>
	//   35   59:astore_1        
			if((i & 1) != 0)
	//*  36   60:iload_2         
	//*  37   61:iconst_1        
	//*  38   62:iand            
	//*  39   63:ifeq            69
				flag = true;
	//   40   66:iconst_1        
	//   41   67:istore          5
			((TextPaint) (typeface)).setFakeBoldText(flag);
	//   42   69:aload_1         
	//   43   70:iload           5
	//   44   72:invokevirtual   #872 <Method void TextPaint.setFakeBoldText(boolean)>
			typeface = ((Typeface) (mTextPaint));
	//   45   75:aload_0         
	//   46   76:getfield        #144 <Field TextPaint mTextPaint>
	//   47   79:astore_1        
			if((i & 2) != 0)
	//*  48   80:iload_2         
	//*  49   81:iconst_2        
	//*  50   82:iand            
	//*  51   83:ifeq            90
				f = -0.25F;
	//   52   86:ldc2            #873 <Float -0.25F>
	//   53   89:fstore_3        
			((TextPaint) (typeface)).setTextSkewX(f);
	//   54   90:aload_1         
	//   55   91:fload_3         
	//   56   92:invokevirtual   #876 <Method void TextPaint.setTextSkewX(float)>
			return;
	//   57   95:return          
		} else
		{
			mTextPaint.setFakeBoldText(false);
	//   58   96:aload_0         
	//   59   97:getfield        #144 <Field TextPaint mTextPaint>
	//   60  100:iconst_0        
	//   61  101:invokevirtual   #872 <Method void TextPaint.setFakeBoldText(boolean)>
			mTextPaint.setTextSkewX(0.0F);
	//   62  104:aload_0         
	//   63  105:getfield        #144 <Field TextPaint mTextPaint>
	//   64  108:fconst_0        
	//   65  109:invokevirtual   #876 <Method void TextPaint.setTextSkewX(float)>
			setSwitchTypeface(typeface);
	//   66  112:aload_0         
	//   67  113:aload_1         
	//   68  114:invokevirtual   #866 <Method void setSwitchTypeface(Typeface)>
			return;
	//   69  117:return          
		}
	}

	public void setTextOff(CharSequence charsequence)
	{
		mTextOff = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #205 <Field CharSequence mTextOff>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #801 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTextOn(CharSequence charsequence)
	{
		mTextOn = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #200 <Field CharSequence mTextOn>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #801 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setThumbDrawable(Drawable drawable)
	{
		if(mThumbDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field Drawable mThumbDrawable>
	//*   2    4:ifnull          15
			mThumbDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #180 <Field Drawable mThumbDrawable>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mThumbDrawable = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #180 <Field Drawable mThumbDrawable>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #801 <Method void requestLayout()>
	//   17   33:return          
	}

	void setThumbPosition(float f)
	{
		mThumbPosition = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #314 <Field float mThumbPosition>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #542 <Method void invalidate()>
	//    5    9:return          
	}

	public void setThumbResource(int i)
	{
		setThumbDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #842 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #886 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #888 <Method void setThumbDrawable(Drawable)>
	//    6   12:return          
	}

	public void setThumbTextPadding(int i)
	{
		mThumbTextPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #223 <Field int mThumbTextPadding>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #801 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setThumbTintList(ColorStateList colorstatelist)
	{
		mThumbTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field ColorStateList mThumbTintList>
		mHasThumbTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #113 <Field boolean mHasThumbTint>
		applyThumbTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #260 <Method void applyThumbTint()>
	//    8   14:return          
	}

	public void setThumbTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mThumbTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
		mHasThumbTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #115 <Field boolean mHasThumbTintMode>
		applyThumbTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #260 <Method void applyThumbTint()>
	//    8   14:return          
	}

	public void setTrackDrawable(Drawable drawable)
	{
		if(mTrackDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #191 <Field Drawable mTrackDrawable>
	//*   2    4:ifnull          15
			mTrackDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #191 <Field Drawable mTrackDrawable>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTrackDrawable = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #191 <Field Drawable mTrackDrawable>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #801 <Method void requestLayout()>
	//   17   33:return          
	}

	public void setTrackResource(int i)
	{
		setTrackDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #842 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #886 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #898 <Method void setTrackDrawable(Drawable)>
	//    6   12:return          
	}

	public void setTrackTintList(ColorStateList colorstatelist)
	{
		mTrackTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #117 <Field ColorStateList mTrackTintList>
		mHasTrackTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #121 <Field boolean mHasTrackTint>
		applyTrackTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #269 <Method void applyTrackTint()>
	//    8   14:return          
	}

	public void setTrackTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mTrackTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #119 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
		mHasTrackTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #123 <Field boolean mHasTrackTintMode>
		applyTrackTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #269 <Method void applyTrackTint()>
	//    8   14:return          
	}

	public void toggle()
	{
		setChecked(isChecked() ^ true);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #306 <Method boolean isChecked()>
	//    3    5:iconst_1        
	//    4    6:ixor            
	//    5    7:invokevirtual   #310 <Method void setChecked(boolean)>
	//    6   10:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mThumbDrawable || drawable == mTrackDrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #905 <Method boolean CompoundButton.verifyDrawable(Drawable)>
	//    3    5:ifne            29
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #180 <Field Drawable mThumbDrawable>
	//    7   13:if_acmpeq       29
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #191 <Field Drawable mTrackDrawable>
	//   11   21:if_acmpne       27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
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
	//    2    4:ldc1            #82  <Class Float>
	//    3    6:ldc1            #84  <String "thumbPos">
	//    4    8:invokespecial   #88  <Method void SwitchCompat$1(Class, String)>
	//    5   11:putstatic       #90  <Field Property THUMB_POS>
	//    6   14:iconst_1        
	//    7   15:newarray        int[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:ldc1            #91  <Int 0x10100a0>
	//   11   21:iastore         
	//   12   22:putstatic       #93  <Field int[] CHECKED_STATE_SET>
	//*  13   25:return          
	}


/*
	static float access$000(SwitchCompat switchcompat)
	{
		return switchcompat.mThumbPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #314 <Field float mThumbPosition>
	//    2    4:freturn         
	}

*/
}
