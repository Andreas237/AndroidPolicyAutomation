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
	//    3    3:invokespecial   #102 <Method void SwitchCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwitchCompat(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.switchStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #107 <Field int android.support.v7.appcompat.R$attr.switchStyle>
	//    4    6:invokespecial   #110 <Method void SwitchCompat(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public SwitchCompat(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #111 <Method void CompoundButton(Context, AttributeSet, int)>
		mThumbTintList = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #113 <Field ColorStateList mThumbTintList>
		mThumbTintMode = null;
	//    8   12:aload_0         
	//    9   13:aconst_null     
	//   10   14:putfield        #115 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
		mHasThumbTint = false;
	//   11   17:aload_0         
	//   12   18:iconst_0        
	//   13   19:putfield        #117 <Field boolean mHasThumbTint>
		mHasThumbTintMode = false;
	//   14   22:aload_0         
	//   15   23:iconst_0        
	//   16   24:putfield        #119 <Field boolean mHasThumbTintMode>
		mTrackTintList = null;
	//   17   27:aload_0         
	//   18   28:aconst_null     
	//   19   29:putfield        #121 <Field ColorStateList mTrackTintList>
		mTrackTintMode = null;
	//   20   32:aload_0         
	//   21   33:aconst_null     
	//   22   34:putfield        #123 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
		mHasTrackTint = false;
	//   23   37:aload_0         
	//   24   38:iconst_0        
	//   25   39:putfield        #125 <Field boolean mHasTrackTint>
		mHasTrackTintMode = false;
	//   26   42:aload_0         
	//   27   43:iconst_0        
	//   28   44:putfield        #127 <Field boolean mHasTrackTintMode>
		mVelocityTracker = VelocityTracker.obtain();
	//   29   47:aload_0         
	//   30   48:invokestatic    #133 <Method VelocityTracker VelocityTracker.obtain()>
	//   31   51:putfield        #135 <Field VelocityTracker mVelocityTracker>
		mTempRect = new Rect();
	//   32   54:aload_0         
	//   33   55:new             #137 <Class Rect>
	//   34   58:dup             
	//   35   59:invokespecial   #139 <Method void Rect()>
	//   36   62:putfield        #141 <Field Rect mTempRect>
		mTextPaint = new TextPaint(1);
	//   37   65:aload_0         
	//   38   66:new             #143 <Class TextPaint>
	//   39   69:dup             
	//   40   70:iconst_1        
	//   41   71:invokespecial   #146 <Method void TextPaint(int)>
	//   42   74:putfield        #148 <Field TextPaint mTextPaint>
		Object obj = ((Object) (getResources()));
	//   43   77:aload_0         
	//   44   78:invokevirtual   #152 <Method Resources getResources()>
	//   45   81:astore          4
		mTextPaint.density = ((Resources) (obj)).getDisplayMetrics().density;
	//   46   83:aload_0         
	//   47   84:getfield        #148 <Field TextPaint mTextPaint>
	//   48   87:aload           4
	//   49   89:invokevirtual   #158 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   50   92:getfield        #163 <Field float DisplayMetrics.density>
	//   51   95:putfield        #164 <Field float TextPaint.density>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.SwitchCompat, i, 0)));
	//   52   98:aload_1         
	//   53   99:aload_2         
	//   54  100:getstatic       #169 <Field int[] android.support.v7.appcompat.R$styleable.SwitchCompat>
	//   55  103:iload_3         
	//   56  104:iconst_0        
	//   57  105:invokestatic    #175 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   58  108:astore_2        
		mThumbDrawable = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_android_thumb);
	//   59  109:aload_0         
	//   60  110:aload_2         
	//   61  111:getstatic       #178 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_thumb>
	//   62  114:invokevirtual   #182 <Method Drawable TintTypedArray.getDrawable(int)>
	//   63  117:putfield        #184 <Field Drawable mThumbDrawable>
		if(mThumbDrawable != null)
	//*  64  120:aload_0         
	//*  65  121:getfield        #184 <Field Drawable mThumbDrawable>
	//*  66  124:ifnull          135
			mThumbDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   67  127:aload_0         
	//   68  128:getfield        #184 <Field Drawable mThumbDrawable>
	//   69  131:aload_0         
	//   70  132:invokevirtual   #190 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTrackDrawable = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_track);
	//   71  135:aload_0         
	//   72  136:aload_2         
	//   73  137:getstatic       #193 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_track>
	//   74  140:invokevirtual   #182 <Method Drawable TintTypedArray.getDrawable(int)>
	//   75  143:putfield        #195 <Field Drawable mTrackDrawable>
		if(mTrackDrawable != null)
	//*  76  146:aload_0         
	//*  77  147:getfield        #195 <Field Drawable mTrackDrawable>
	//*  78  150:ifnull          161
			mTrackDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   79  153:aload_0         
	//   80  154:getfield        #195 <Field Drawable mTrackDrawable>
	//   81  157:aload_0         
	//   82  158:invokevirtual   #190 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTextOn = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOn);
	//   83  161:aload_0         
	//   84  162:aload_2         
	//   85  163:getstatic       #198 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_textOn>
	//   86  166:invokevirtual   #202 <Method CharSequence TintTypedArray.getText(int)>
	//   87  169:putfield        #204 <Field CharSequence mTextOn>
		mTextOff = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOff);
	//   88  172:aload_0         
	//   89  173:aload_2         
	//   90  174:getstatic       #207 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_textOff>
	//   91  177:invokevirtual   #202 <Method CharSequence TintTypedArray.getText(int)>
	//   92  180:putfield        #209 <Field CharSequence mTextOff>
		mShowText = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_showText, true);
	//   93  183:aload_0         
	//   94  184:aload_2         
	//   95  185:getstatic       #212 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_showText>
	//   96  188:iconst_1        
	//   97  189:invokevirtual   #216 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   98  192:putfield        #218 <Field boolean mShowText>
		mThumbTextPadding = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
	//   99  195:aload_0         
	//  100  196:aload_2         
	//  101  197:getstatic       #221 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTextPadding>
	//  102  200:iconst_0        
	//  103  201:invokevirtual   #225 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  104  204:putfield        #227 <Field int mThumbTextPadding>
		mSwitchMinWidth = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
	//  105  207:aload_0         
	//  106  208:aload_2         
	//  107  209:getstatic       #230 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchMinWidth>
	//  108  212:iconst_0        
	//  109  213:invokevirtual   #225 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  110  216:putfield        #232 <Field int mSwitchMinWidth>
		mSwitchPadding = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
	//  111  219:aload_0         
	//  112  220:aload_2         
	//  113  221:getstatic       #235 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchPadding>
	//  114  224:iconst_0        
	//  115  225:invokevirtual   #225 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  116  228:putfield        #237 <Field int mSwitchPadding>
		mSplitTrack = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_splitTrack, false);
	//  117  231:aload_0         
	//  118  232:aload_2         
	//  119  233:getstatic       #240 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_splitTrack>
	//  120  236:iconst_0        
	//  121  237:invokevirtual   #216 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  122  240:putfield        #242 <Field boolean mSplitTrack>
		obj = ((Object) (((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTint)));
	//  123  243:aload_2         
	//  124  244:getstatic       #245 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTint>
	//  125  247:invokevirtual   #249 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  126  250:astore          4
		if(obj != null)
	//* 127  252:aload           4
	//* 128  254:ifnull          268
		{
			mThumbTintList = ((ColorStateList) (obj));
	//  129  257:aload_0         
	//  130  258:aload           4
	//  131  260:putfield        #113 <Field ColorStateList mThumbTintList>
			mHasThumbTint = true;
	//  132  263:aload_0         
	//  133  264:iconst_1        
	//  134  265:putfield        #117 <Field boolean mHasThumbTint>
		}
		obj = ((Object) (DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  135  268:aload_2         
	//  136  269:getstatic       #252 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTintMode>
	//  137  272:iconst_m1       
	//  138  273:invokevirtual   #255 <Method int TintTypedArray.getInt(int, int)>
	//  139  276:aconst_null     
	//  140  277:invokestatic    #261 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  141  280:astore          4
		if(mThumbTintMode != obj)
	//* 142  282:aload_0         
	//* 143  283:getfield        #115 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//* 144  286:aload           4
	//* 145  288:if_acmpeq       302
		{
			mThumbTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//  146  291:aload_0         
	//  147  292:aload           4
	//  148  294:putfield        #115 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
			mHasThumbTintMode = true;
	//  149  297:aload_0         
	//  150  298:iconst_1        
	//  151  299:putfield        #119 <Field boolean mHasThumbTintMode>
		}
		if(mHasThumbTint || mHasThumbTintMode)
	//* 152  302:aload_0         
	//* 153  303:getfield        #117 <Field boolean mHasThumbTint>
	//* 154  306:ifne            316
	//* 155  309:aload_0         
	//* 156  310:getfield        #119 <Field boolean mHasThumbTintMode>
	//* 157  313:ifeq            320
			applyThumbTint();
	//  158  316:aload_0         
	//  159  317:invokespecial   #264 <Method void applyThumbTint()>
		obj = ((Object) (((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.SwitchCompat_trackTint)));
	//  160  320:aload_2         
	//  161  321:getstatic       #267 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_trackTint>
	//  162  324:invokevirtual   #249 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  163  327:astore          4
		if(obj != null)
	//* 164  329:aload           4
	//* 165  331:ifnull          345
		{
			mTrackTintList = ((ColorStateList) (obj));
	//  166  334:aload_0         
	//  167  335:aload           4
	//  168  337:putfield        #121 <Field ColorStateList mTrackTintList>
			mHasTrackTint = true;
	//  169  340:aload_0         
	//  170  341:iconst_1        
	//  171  342:putfield        #125 <Field boolean mHasTrackTint>
		}
		obj = ((Object) (DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SwitchCompat_trackTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  172  345:aload_2         
	//  173  346:getstatic       #270 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_trackTintMode>
	//  174  349:iconst_m1       
	//  175  350:invokevirtual   #255 <Method int TintTypedArray.getInt(int, int)>
	//  176  353:aconst_null     
	//  177  354:invokestatic    #261 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  178  357:astore          4
		if(mTrackTintMode != obj)
	//* 179  359:aload_0         
	//* 180  360:getfield        #123 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//* 181  363:aload           4
	//* 182  365:if_acmpeq       379
		{
			mTrackTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//  183  368:aload_0         
	//  184  369:aload           4
	//  185  371:putfield        #123 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
			mHasTrackTintMode = true;
	//  186  374:aload_0         
	//  187  375:iconst_1        
	//  188  376:putfield        #127 <Field boolean mHasTrackTintMode>
		}
		if(mHasTrackTint || mHasTrackTintMode)
	//* 189  379:aload_0         
	//* 190  380:getfield        #125 <Field boolean mHasTrackTint>
	//* 191  383:ifne            393
	//* 192  386:aload_0         
	//* 193  387:getfield        #127 <Field boolean mHasTrackTintMode>
	//* 194  390:ifeq            397
			applyTrackTint();
	//  195  393:aload_0         
	//  196  394:invokespecial   #273 <Method void applyTrackTint()>
		i = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
	//  197  397:aload_2         
	//  198  398:getstatic       #276 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchTextAppearance>
	//  199  401:iconst_0        
	//  200  402:invokevirtual   #279 <Method int TintTypedArray.getResourceId(int, int)>
	//  201  405:istore_3        
		if(i != 0)
	//* 202  406:iload_3         
	//* 203  407:ifeq            416
			setSwitchTextAppearance(context, i);
	//  204  410:aload_0         
	//  205  411:aload_1         
	//  206  412:iload_3         
	//  207  413:invokevirtual   #283 <Method void setSwitchTextAppearance(Context, int)>
		((TintTypedArray) (attributeset)).recycle();
	//  208  416:aload_2         
	//  209  417:invokevirtual   #286 <Method void TintTypedArray.recycle()>
		context = ((Context) (ViewConfiguration.get(context)));
	//  210  420:aload_1         
	//  211  421:invokestatic    #292 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//  212  424:astore_1        
		mTouchSlop = ((ViewConfiguration) (context)).getScaledTouchSlop();
	//  213  425:aload_0         
	//  214  426:aload_1         
	//  215  427:invokevirtual   #296 <Method int ViewConfiguration.getScaledTouchSlop()>
	//  216  430:putfield        #298 <Field int mTouchSlop>
		mMinFlingVelocity = ((ViewConfiguration) (context)).getScaledMinimumFlingVelocity();
	//  217  433:aload_0         
	//  218  434:aload_1         
	//  219  435:invokevirtual   #301 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//  220  438:putfield        #303 <Field int mMinFlingVelocity>
		refreshDrawableState();
	//  221  441:aload_0         
	//  222  442:invokevirtual   #306 <Method void refreshDrawableState()>
		setChecked(isChecked());
	//  223  445:aload_0         
	//  224  446:aload_0         
	//  225  447:invokevirtual   #310 <Method boolean isChecked()>
	//  226  450:invokevirtual   #314 <Method void setChecked(boolean)>
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
	//    9   13:getstatic       #94  <Field Property THUMB_POS>
	//   10   16:iconst_1        
	//   11   17:newarray        float[]
	//   12   19:dup             
	//   13   20:iconst_0        
	//   14   21:fload_2         
	//   15   22:fastore         
	//   16   23:invokestatic    #325 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   17   26:putfield        #327 <Field ObjectAnimator mPositionAnimator>
		mPositionAnimator.setDuration(250L);
	//   18   29:aload_0         
	//   19   30:getfield        #327 <Field ObjectAnimator mPositionAnimator>
	//   20   33:ldc2w           #328 <Long 250L>
	//   21   36:invokevirtual   #333 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   22   39:pop             
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  23   40:getstatic       #338 <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   43:bipush          18
	//*  25   45:icmplt          56
			mPositionAnimator.setAutoCancel(true);
	//   26   48:aload_0         
	//   27   49:getfield        #327 <Field ObjectAnimator mPositionAnimator>
	//   28   52:iconst_1        
	//   29   53:invokevirtual   #341 <Method void ObjectAnimator.setAutoCancel(boolean)>
		mPositionAnimator.start();
	//   30   56:aload_0         
	//   31   57:getfield        #327 <Field ObjectAnimator mPositionAnimator>
	//   32   60:invokevirtual   #344 <Method void ObjectAnimator.start()>
	//   33   63:return          
	}

	private void applyThumbTint()
	{
		if(mThumbDrawable != null && (mHasThumbTint || mHasThumbTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field Drawable mThumbDrawable>
	//*   2    4:ifnull          90
	//*   3    7:aload_0         
	//*   4    8:getfield        #117 <Field boolean mHasThumbTint>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #119 <Field boolean mHasThumbTintMode>
	//*   8   18:ifeq            90
		{
			mThumbDrawable = mThumbDrawable.mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #184 <Field Drawable mThumbDrawable>
	//   12   26:invokevirtual   #348 <Method Drawable Drawable.mutate()>
	//   13   29:putfield        #184 <Field Drawable mThumbDrawable>
			if(mHasThumbTint)
	//*  14   32:aload_0         
	//*  15   33:getfield        #117 <Field boolean mHasThumbTint>
	//*  16   36:ifeq            50
				DrawableCompat.setTintList(mThumbDrawable, mThumbTintList);
	//   17   39:aload_0         
	//   18   40:getfield        #184 <Field Drawable mThumbDrawable>
	//   19   43:aload_0         
	//   20   44:getfield        #113 <Field ColorStateList mThumbTintList>
	//   21   47:invokestatic    #354 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasThumbTintMode)
	//*  22   50:aload_0         
	//*  23   51:getfield        #119 <Field boolean mHasThumbTintMode>
	//*  24   54:ifeq            68
				DrawableCompat.setTintMode(mThumbDrawable, mThumbTintMode);
	//   25   57:aload_0         
	//   26   58:getfield        #184 <Field Drawable mThumbDrawable>
	//   27   61:aload_0         
	//   28   62:getfield        #115 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//   29   65:invokestatic    #358 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mThumbDrawable.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #184 <Field Drawable mThumbDrawable>
	//*  32   72:invokevirtual   #361 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				mThumbDrawable.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #184 <Field Drawable mThumbDrawable>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #365 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #369 <Method boolean Drawable.setState(int[])>
	//   39   89:pop             
		}
	//   40   90:return          
	}

	private void applyTrackTint()
	{
		if(mTrackDrawable != null && (mHasTrackTint || mHasTrackTintMode))
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field Drawable mTrackDrawable>
	//*   2    4:ifnull          90
	//*   3    7:aload_0         
	//*   4    8:getfield        #125 <Field boolean mHasTrackTint>
	//*   5   11:ifne            21
	//*   6   14:aload_0         
	//*   7   15:getfield        #127 <Field boolean mHasTrackTintMode>
	//*   8   18:ifeq            90
		{
			mTrackDrawable = mTrackDrawable.mutate();
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getfield        #195 <Field Drawable mTrackDrawable>
	//   12   26:invokevirtual   #348 <Method Drawable Drawable.mutate()>
	//   13   29:putfield        #195 <Field Drawable mTrackDrawable>
			if(mHasTrackTint)
	//*  14   32:aload_0         
	//*  15   33:getfield        #125 <Field boolean mHasTrackTint>
	//*  16   36:ifeq            50
				DrawableCompat.setTintList(mTrackDrawable, mTrackTintList);
	//   17   39:aload_0         
	//   18   40:getfield        #195 <Field Drawable mTrackDrawable>
	//   19   43:aload_0         
	//   20   44:getfield        #121 <Field ColorStateList mTrackTintList>
	//   21   47:invokestatic    #354 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasTrackTintMode)
	//*  22   50:aload_0         
	//*  23   51:getfield        #127 <Field boolean mHasTrackTintMode>
	//*  24   54:ifeq            68
				DrawableCompat.setTintMode(mTrackDrawable, mTrackTintMode);
	//   25   57:aload_0         
	//   26   58:getfield        #195 <Field Drawable mTrackDrawable>
	//   27   61:aload_0         
	//   28   62:getfield        #123 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//   29   65:invokestatic    #358 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mTrackDrawable.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #195 <Field Drawable mTrackDrawable>
	//*  32   72:invokevirtual   #361 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				mTrackDrawable.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #195 <Field Drawable mTrackDrawable>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #365 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #369 <Method boolean Drawable.setState(int[])>
	//   39   89:pop             
		}
	//   40   90:return          
	}

	private void cancelPositionAnimator()
	{
		if(mPositionAnimator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #327 <Field ObjectAnimator mPositionAnimator>
	//*   2    4:ifnull          14
			mPositionAnimator.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #327 <Field ObjectAnimator mPositionAnimator>
	//    5   11:invokevirtual   #373 <Method void ObjectAnimator.cancel()>
	//    6   14:return          
	}

	private void cancelSuperTouch(MotionEvent motionevent)
	{
		motionevent = MotionEvent.obtain(motionevent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #380 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    2    4:astore_1        
		motionevent.setAction(3);
	//    3    5:aload_1         
	//    4    6:iconst_3        
	//    5    7:invokevirtual   #383 <Method void MotionEvent.setAction(int)>
		super.onTouchEvent(motionevent);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #387 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//    9   15:pop             
		motionevent.recycle();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #388 <Method void MotionEvent.recycle()>
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
	//    1    1:getfield        #318 <Field float mThumbPosition>
	//    2    4:ldc2            #392 <Float 0.5F>
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
	//*   1    1:invokestatic    #399 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifeq            17
			f = 1.0F - mThumbPosition;
	//    3    7:fconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #318 <Field float mThumbPosition>
	//    6   12:fsub            
	//    7   13:fstore_1        
		else
	//*   8   14:goto            22
			f = mThumbPosition;
	//    9   17:aload_0         
	//   10   18:getfield        #318 <Field float mThumbPosition>
	//   11   21:fstore_1        
		return (int)((float)getThumbScrollRange() * f + 0.5F);
	//   12   22:aload_0         
	//   13   23:invokespecial   #402 <Method int getThumbScrollRange()>
	//   14   26:i2f             
	//   15   27:fload_1         
	//   16   28:fmul            
	//   17   29:ldc2            #392 <Float 0.5F>
	//   18   32:fadd            
	//   19   33:f2i             
	//   20   34:ireturn         
	}

	private int getThumbScrollRange()
	{
		if(mTrackDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field Drawable mTrackDrawable>
	//*   2    4:ifnull          73
		{
			Rect rect1 = mTempRect;
	//    3    7:aload_0         
	//    4    8:getfield        #141 <Field Rect mTempRect>
	//    5   11:astore_2        
			mTrackDrawable.getPadding(rect1);
	//    6   12:aload_0         
	//    7   13:getfield        #195 <Field Drawable mTrackDrawable>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #406 <Method boolean Drawable.getPadding(Rect)>
	//   10   20:pop             
			Rect rect;
			if(mThumbDrawable != null)
	//*  11   21:aload_0         
	//*  12   22:getfield        #184 <Field Drawable mThumbDrawable>
	//*  13   25:ifnull          39
				rect = DrawableUtils.getOpticalBounds(mThumbDrawable);
	//   14   28:aload_0         
	//   15   29:getfield        #184 <Field Drawable mThumbDrawable>
	//   16   32:invokestatic    #410 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   17   35:astore_1        
			else
	//*  18   36:goto            43
				rect = DrawableUtils.INSETS_NONE;
	//   19   39:getstatic       #413 <Field Rect DrawableUtils.INSETS_NONE>
	//   20   42:astore_1        
			return mSwitchWidth - mThumbWidth - rect1.left - rect1.right - rect.left - rect.right;
	//   21   43:aload_0         
	//   22   44:getfield        #415 <Field int mSwitchWidth>
	//   23   47:aload_0         
	//   24   48:getfield        #417 <Field int mThumbWidth>
	//   25   51:isub            
	//   26   52:aload_2         
	//   27   53:getfield        #420 <Field int Rect.left>
	//   28   56:isub            
	//   29   57:aload_2         
	//   30   58:getfield        #423 <Field int Rect.right>
	//   31   61:isub            
	//   32   62:aload_1         
	//   33   63:getfield        #420 <Field int Rect.left>
	//   34   66:isub            
	//   35   67:aload_1         
	//   36   68:getfield        #423 <Field int Rect.right>
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
		if(mThumbDrawable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field Drawable mThumbDrawable>
	//*   2    4:ifnonnull       9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int k = getThumbOffset();
	//    5    9:aload_0         
	//    6   10:invokespecial   #427 <Method int getThumbOffset()>
	//    7   13:istore          5
		mThumbDrawable.getPadding(mTempRect);
	//    8   15:aload_0         
	//    9   16:getfield        #184 <Field Drawable mThumbDrawable>
	//   10   19:aload_0         
	//   11   20:getfield        #141 <Field Rect mTempRect>
	//   12   23:invokevirtual   #406 <Method boolean Drawable.getPadding(Rect)>
	//   13   26:pop             
		int i = mSwitchTop;
	//   14   27:aload_0         
	//   15   28:getfield        #429 <Field int mSwitchTop>
	//   16   31:istore_3        
		int j = mTouchSlop;
	//   17   32:aload_0         
	//   18   33:getfield        #298 <Field int mTouchSlop>
	//   19   36:istore          4
		k = (mSwitchLeft + k) - mTouchSlop;
	//   20   38:aload_0         
	//   21   39:getfield        #431 <Field int mSwitchLeft>
	//   22   42:iload           5
	//   23   44:iadd            
	//   24   45:aload_0         
	//   25   46:getfield        #298 <Field int mTouchSlop>
	//   26   49:isub            
	//   27   50:istore          5
		int l = mThumbWidth;
	//   28   52:aload_0         
	//   29   53:getfield        #417 <Field int mThumbWidth>
	//   30   56:istore          6
		int i1 = mTempRect.left;
	//   31   58:aload_0         
	//   32   59:getfield        #141 <Field Rect mTempRect>
	//   33   62:getfield        #420 <Field int Rect.left>
	//   34   65:istore          7
		int j1 = mTempRect.right;
	//   35   67:aload_0         
	//   36   68:getfield        #141 <Field Rect mTempRect>
	//   37   71:getfield        #423 <Field int Rect.right>
	//   38   74:istore          8
		int k1 = mTouchSlop;
	//   39   76:aload_0         
	//   40   77:getfield        #298 <Field int mTouchSlop>
	//   41   80:istore          9
		int l1 = mSwitchBottom;
	//   42   82:aload_0         
	//   43   83:getfield        #433 <Field int mSwitchBottom>
	//   44   86:istore          10
		int i2 = mTouchSlop;
	//   45   88:aload_0         
	//   46   89:getfield        #298 <Field int mTouchSlop>
	//   47   92:istore          11
		return f > (float)k && f < (float)(l + k + i1 + j1 + k1) && f1 > (float)(i - j) && f1 < (float)(l1 + i2);
	//   48   94:fload_1         
	//   49   95:iload           5
	//   50   97:i2f             
	//   51   98:fcmpl           
	//   52   99:ifle            145
	//   53  102:fload_1         
	//   54  103:iload           6
	//   55  105:iload           5
	//   56  107:iadd            
	//   57  108:iload           7
	//   58  110:iadd            
	//   59  111:iload           8
	//   60  113:iadd            
	//   61  114:iload           9
	//   62  116:iadd            
	//   63  117:i2f             
	//   64  118:fcmpg           
	//   65  119:ifge            145
	//   66  122:fload_2         
	//   67  123:iload_3         
	//   68  124:iload           4
	//   69  126:isub            
	//   70  127:i2f             
	//   71  128:fcmpl           
	//   72  129:ifle            145
	//   73  132:fload_2         
	//   74  133:iload           10
	//   75  135:iload           11
	//   76  137:iadd            
	//   77  138:i2f             
	//   78  139:fcmpg           
	//   79  140:ifge            145
	//   80  143:iconst_1        
	//   81  144:ireturn         
	//   82  145:iconst_0        
	//   83  146:ireturn         
	}

	private Layout makeLayout(CharSequence charsequence)
	{
		if(mSwitchTransformationMethod != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #437 <Field TransformationMethod mSwitchTransformationMethod>
	//*   2    4:ifnull          22
			charsequence = mSwitchTransformationMethod.getTransformation(charsequence, ((android.view.View) (this)));
	//    3    7:aload_0         
	//    4    8:getfield        #437 <Field TransformationMethod mSwitchTransformationMethod>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokeinterface #443 <Method CharSequence TransformationMethod.getTransformation(CharSequence, android.view.View)>
	//    8   18:astore_1        
	//*   9   19:goto            22
		TextPaint textpaint = mTextPaint;
	//   10   22:aload_0         
	//   11   23:getfield        #148 <Field TextPaint mTextPaint>
	//   12   26:astore_3        
		int i;
		if(charsequence != null)
	//*  13   27:aload_1         
	//*  14   28:ifnull          48
			i = (int)Math.ceil(Layout.getDesiredWidth(charsequence, mTextPaint));
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:getfield        #148 <Field TextPaint mTextPaint>
	//   18   36:invokestatic    #449 <Method float Layout.getDesiredWidth(CharSequence, TextPaint)>
	//   19   39:f2d             
	//   20   40:invokestatic    #455 <Method double Math.ceil(double)>
	//   21   43:d2i             
	//   22   44:istore_2        
		else
	//*  23   45:goto            50
			i = 0;
	//   24   48:iconst_0        
	//   25   49:istore_2        
		return ((Layout) (new StaticLayout(charsequence, textpaint, i, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true)));
	//   26   50:new             #457 <Class StaticLayout>
	//   27   53:dup             
	//   28   54:aload_1         
	//   29   55:aload_3         
	//   30   56:iload_2         
	//   31   57:getstatic       #463 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//   32   60:fconst_1        
	//   33   61:fconst_0        
	//   34   62:iconst_1        
	//   35   63:invokespecial   #466 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//   36   66:areturn         
	}

	private void setSwitchTypefaceByIndex(int i, int j)
	{
		Typeface typeface = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		switch(i)
	//*   2    2:iload_1         
		{
	//*   3    3:tableswitch     1 3: default 28
	//	               1 31
	//	               2 38
	//	               3 45
	//*   4   28:goto            49
		case 1: // '\001'
			typeface = Typeface.SANS_SERIF;
	//    5   31:getstatic       #474 <Field Typeface Typeface.SANS_SERIF>
	//    6   34:astore_3        
			break;

	//*   7   35:goto            49
		case 2: // '\002'
			typeface = Typeface.SERIF;
	//    8   38:getstatic       #476 <Field Typeface Typeface.SERIF>
	//    9   41:astore_3        
			break;

	//*  10   42:goto            49
		case 3: // '\003'
			typeface = Typeface.MONOSPACE;
	//   11   45:getstatic       #478 <Field Typeface Typeface.MONOSPACE>
	//   12   48:astore_3        
			break;
		}
		setSwitchTypeface(typeface, j);
	//   13   49:aload_0         
	//   14   50:aload_3         
	//   15   51:iload_2         
	//   16   52:invokevirtual   #482 <Method void setSwitchTypeface(Typeface, int)>
	//   17   55:return          
	}

	private void stopDrag(MotionEvent motionevent)
	{
		mTouchMode = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #485 <Field int mTouchMode>
		boolean flag;
		if(motionevent.getAction() == 1 && isEnabled())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #488 <Method int MotionEvent.getAction()>
	//*   5    9:iconst_1        
	//*   6   10:icmpne          25
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #491 <Method boolean isEnabled()>
	//*   9   17:ifeq            25
			flag = true;
	//   10   20:iconst_1        
	//   11   21:istore_3        
		else
	//*  12   22:goto            27
			flag = false;
	//   13   25:iconst_0        
	//   14   26:istore_3        
		boolean flag2 = isChecked();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #310 <Method boolean isChecked()>
	//   17   31:istore          5
		boolean flag1;
		if(flag)
	//*  18   33:iload_3         
	//*  19   34:ifeq            120
		{
			mVelocityTracker.computeCurrentVelocity(1000);
	//   20   37:aload_0         
	//   21   38:getfield        #135 <Field VelocityTracker mVelocityTracker>
	//   22   41:sipush          1000
	//   23   44:invokevirtual   #494 <Method void VelocityTracker.computeCurrentVelocity(int)>
			float f = mVelocityTracker.getXVelocity();
	//   24   47:aload_0         
	//   25   48:getfield        #135 <Field VelocityTracker mVelocityTracker>
	//   26   51:invokevirtual   #498 <Method float VelocityTracker.getXVelocity()>
	//   27   54:fstore_2        
			if(Math.abs(f) > (float)mMinFlingVelocity)
	//*  28   55:fload_2         
	//*  29   56:invokestatic    #502 <Method float Math.abs(float)>
	//*  30   59:aload_0         
	//*  31   60:getfield        #303 <Field int mMinFlingVelocity>
	//*  32   63:i2f             
	//*  33   64:fcmpl           
	//*  34   65:ifle            111
			{
				if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*  35   68:aload_0         
	//*  36   69:invokestatic    #399 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  37   72:ifeq            93
				{
					if(f < 0.0F)
	//*  38   75:fload_2         
	//*  39   76:fconst_0        
	//*  40   77:fcmpg           
	//*  41   78:ifge            87
						flag1 = true;
	//   42   81:iconst_1        
	//   43   82:istore          4
					else
	//*  44   84:goto            108
						flag1 = false;
	//   45   87:iconst_0        
	//   46   88:istore          4
				} else
	//*  47   90:goto            108
				if(f > 0.0F)
	//*  48   93:fload_2         
	//*  49   94:fconst_0        
	//*  50   95:fcmpl           
	//*  51   96:ifle            105
					flag1 = true;
	//   52   99:iconst_1        
	//   53  100:istore          4
				else
	//*  54  102:goto            108
					flag1 = false;
	//   55  105:iconst_0        
	//   56  106:istore          4
			} else
	//*  57  108:goto            117
			{
				flag1 = getTargetCheckedState();
	//   58  111:aload_0         
	//   59  112:invokespecial   #504 <Method boolean getTargetCheckedState()>
	//   60  115:istore          4
			}
		} else
	//*  61  117:goto            124
		{
			flag1 = flag2;
	//   62  120:iload           5
	//   63  122:istore          4
		}
		if(flag1 != flag2)
	//*  64  124:iload           4
	//*  65  126:iload           5
	//*  66  128:icmpeq          136
			playSoundEffect(0);
	//   67  131:aload_0         
	//   68  132:iconst_0        
	//   69  133:invokevirtual   #507 <Method void playSoundEffect(int)>
		setChecked(flag1);
	//   70  136:aload_0         
	//   71  137:iload           4
	//   72  139:invokevirtual   #314 <Method void setChecked(boolean)>
		cancelSuperTouch(motionevent);
	//   73  142:aload_0         
	//   74  143:aload_1         
	//   75  144:invokespecial   #509 <Method void cancelSuperTouch(MotionEvent)>
	//   76  147:return          
	}

	public void draw(Canvas canvas)
	{
		Rect rect1 = mTempRect;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field Rect mTempRect>
	//    2    4:astore          15
		int i1 = mSwitchLeft;
	//    3    6:aload_0         
	//    4    7:getfield        #431 <Field int mSwitchLeft>
	//    5   10:istore          5
		int k2 = mSwitchTop;
	//    6   12:aload_0         
	//    7   13:getfield        #429 <Field int mSwitchTop>
	//    8   16:istore          11
		int j = mSwitchRight;
	//    9   18:aload_0         
	//   10   19:getfield        #513 <Field int mSwitchRight>
	//   11   22:istore_3        
		int l2 = mSwitchBottom;
	//   12   23:aload_0         
	//   13   24:getfield        #433 <Field int mSwitchBottom>
	//   14   27:istore          12
		int l = i1 + getThumbOffset();
	//   15   29:iload           5
	//   16   31:aload_0         
	//   17   32:invokespecial   #427 <Method int getThumbOffset()>
	//   18   35:iadd            
	//   19   36:istore          4
		Rect rect;
		if(mThumbDrawable != null)
	//*  20   38:aload_0         
	//*  21   39:getfield        #184 <Field Drawable mThumbDrawable>
	//*  22   42:ifnull          57
			rect = DrawableUtils.getOpticalBounds(mThumbDrawable);
	//   23   45:aload_0         
	//   24   46:getfield        #184 <Field Drawable mThumbDrawable>
	//   25   49:invokestatic    #410 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   26   52:astore          14
		else
	//*  27   54:goto            62
			rect = DrawableUtils.INSETS_NONE;
	//   28   57:getstatic       #413 <Field Rect DrawableUtils.INSETS_NONE>
	//   29   60:astore          14
		int i = l;
	//   30   62:iload           4
	//   31   64:istore_2        
		if(mTrackDrawable != null)
	//*  32   65:aload_0         
	//*  33   66:getfield        #195 <Field Drawable mTrackDrawable>
	//*  34   69:ifnull          288
		{
			mTrackDrawable.getPadding(rect1);
	//   35   72:aload_0         
	//   36   73:getfield        #195 <Field Drawable mTrackDrawable>
	//   37   76:aload           15
	//   38   78:invokevirtual   #406 <Method boolean Drawable.getPadding(Rect)>
	//   39   81:pop             
			int i3 = l + rect1.left;
	//   40   82:iload           4
	//   41   84:aload           15
	//   42   86:getfield        #420 <Field int Rect.left>
	//   43   89:iadd            
	//   44   90:istore          13
			l = k2;
	//   45   92:iload           11
	//   46   94:istore          4
			int j1 = l2;
	//   47   96:iload           12
	//   48   98:istore          6
			int k1 = i1;
	//   49  100:iload           5
	//   50  102:istore          7
			int l1 = l;
	//   51  104:iload           4
	//   52  106:istore          8
			int i2 = j;
	//   53  108:iload_3         
	//   54  109:istore          9
			int j2 = j1;
	//   55  111:iload           6
	//   56  113:istore          10
			if(rect != null)
	//*  57  115:aload           14
	//*  58  117:ifnull          270
			{
				i = i1;
	//   59  120:iload           5
	//   60  122:istore_2        
				if(rect.left > rect1.left)
	//*  61  123:aload           14
	//*  62  125:getfield        #420 <Field int Rect.left>
	//*  63  128:aload           15
	//*  64  130:getfield        #420 <Field int Rect.left>
	//*  65  133:icmple          151
					i = i1 + (rect.left - rect1.left);
	//   66  136:iload           5
	//   67  138:aload           14
	//   68  140:getfield        #420 <Field int Rect.left>
	//   69  143:aload           15
	//   70  145:getfield        #420 <Field int Rect.left>
	//   71  148:isub            
	//   72  149:iadd            
	//   73  150:istore_2        
				i1 = l;
	//   74  151:iload           4
	//   75  153:istore          5
				if(rect.top > rect1.top)
	//*  76  155:aload           14
	//*  77  157:getfield        #516 <Field int Rect.top>
	//*  78  160:aload           15
	//*  79  162:getfield        #516 <Field int Rect.top>
	//*  80  165:icmple          184
					i1 = l + (rect.top - rect1.top);
	//   81  168:iload           4
	//   82  170:aload           14
	//   83  172:getfield        #516 <Field int Rect.top>
	//   84  175:aload           15
	//   85  177:getfield        #516 <Field int Rect.top>
	//   86  180:isub            
	//   87  181:iadd            
	//   88  182:istore          5
				l = j;
	//   89  184:iload_3         
	//   90  185:istore          4
				if(rect.right > rect1.right)
	//*  91  187:aload           14
	//*  92  189:getfield        #423 <Field int Rect.right>
	//*  93  192:aload           15
	//*  94  194:getfield        #423 <Field int Rect.right>
	//*  95  197:icmple          215
					l = j - (rect.right - rect1.right);
	//   96  200:iload_3         
	//   97  201:aload           14
	//   98  203:getfield        #423 <Field int Rect.right>
	//   99  206:aload           15
	//  100  208:getfield        #423 <Field int Rect.right>
	//  101  211:isub            
	//  102  212:isub            
	//  103  213:istore          4
				k1 = i;
	//  104  215:iload_2         
	//  105  216:istore          7
				l1 = i1;
	//  106  218:iload           5
	//  107  220:istore          8
				i2 = l;
	//  108  222:iload           4
	//  109  224:istore          9
				j2 = j1;
	//  110  226:iload           6
	//  111  228:istore          10
				if(rect.bottom > rect1.bottom)
	//* 112  230:aload           14
	//* 113  232:getfield        #519 <Field int Rect.bottom>
	//* 114  235:aload           15
	//* 115  237:getfield        #519 <Field int Rect.bottom>
	//* 116  240:icmple          270
				{
					j2 = j1 - (rect.bottom - rect1.bottom);
	//  117  243:iload           6
	//  118  245:aload           14
	//  119  247:getfield        #519 <Field int Rect.bottom>
	//  120  250:aload           15
	//  121  252:getfield        #519 <Field int Rect.bottom>
	//  122  255:isub            
	//  123  256:isub            
	//  124  257:istore          10
					i2 = l;
	//  125  259:iload           4
	//  126  261:istore          9
					l1 = i1;
	//  127  263:iload           5
	//  128  265:istore          8
					k1 = i;
	//  129  267:iload_2         
	//  130  268:istore          7
				}
			}
			mTrackDrawable.setBounds(k1, l1, i2, j2);
	//  131  270:aload_0         
	//  132  271:getfield        #195 <Field Drawable mTrackDrawable>
	//  133  274:iload           7
	//  134  276:iload           8
	//  135  278:iload           9
	//  136  280:iload           10
	//  137  282:invokevirtual   #523 <Method void Drawable.setBounds(int, int, int, int)>
			i = i3;
	//  138  285:iload           13
	//  139  287:istore_2        
		}
		if(mThumbDrawable != null)
	//* 140  288:aload_0         
	//* 141  289:getfield        #184 <Field Drawable mThumbDrawable>
	//* 142  292:ifnull          361
		{
			mThumbDrawable.getPadding(rect1);
	//  143  295:aload_0         
	//  144  296:getfield        #184 <Field Drawable mThumbDrawable>
	//  145  299:aload           15
	//  146  301:invokevirtual   #406 <Method boolean Drawable.getPadding(Rect)>
	//  147  304:pop             
			int k = i - rect1.left;
	//  148  305:iload_2         
	//  149  306:aload           15
	//  150  308:getfield        #420 <Field int Rect.left>
	//  151  311:isub            
	//  152  312:istore_3        
			i = mThumbWidth + i + rect1.right;
	//  153  313:aload_0         
	//  154  314:getfield        #417 <Field int mThumbWidth>
	//  155  317:iload_2         
	//  156  318:iadd            
	//  157  319:aload           15
	//  158  321:getfield        #423 <Field int Rect.right>
	//  159  324:iadd            
	//  160  325:istore_2        
			mThumbDrawable.setBounds(k, k2, i, l2);
	//  161  326:aload_0         
	//  162  327:getfield        #184 <Field Drawable mThumbDrawable>
	//  163  330:iload_3         
	//  164  331:iload           11
	//  165  333:iload_2         
	//  166  334:iload           12
	//  167  336:invokevirtual   #523 <Method void Drawable.setBounds(int, int, int, int)>
			Drawable drawable = getBackground();
	//  168  339:aload_0         
	//  169  340:invokevirtual   #526 <Method Drawable getBackground()>
	//  170  343:astore          14
			if(drawable != null)
	//* 171  345:aload           14
	//* 172  347:ifnull          361
				DrawableCompat.setHotspotBounds(drawable, k, k2, i, l2);
	//  173  350:aload           14
	//  174  352:iload_3         
	//  175  353:iload           11
	//  176  355:iload_2         
	//  177  356:iload           12
	//  178  358:invokestatic    #530 <Method void DrawableCompat.setHotspotBounds(Drawable, int, int, int, int)>
		}
		super.draw(canvas);
	//  179  361:aload_0         
	//  180  362:aload_1         
	//  181  363:invokespecial   #532 <Method void CompoundButton.draw(Canvas)>
	//  182  366:return          
	}

	public void drawableHotspotChanged(float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #338 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			super.drawableHotspotChanged(f, f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:invokespecial   #536 <Method void CompoundButton.drawableHotspotChanged(float, float)>
		if(mThumbDrawable != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #184 <Field Drawable mThumbDrawable>
	//*   9   18:ifnull          30
			DrawableCompat.setHotspot(mThumbDrawable, f, f1);
	//   10   21:aload_0         
	//   11   22:getfield        #184 <Field Drawable mThumbDrawable>
	//   12   25:fload_1         
	//   13   26:fload_2         
	//   14   27:invokestatic    #540 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
		if(mTrackDrawable != null)
	//*  15   30:aload_0         
	//*  16   31:getfield        #195 <Field Drawable mTrackDrawable>
	//*  17   34:ifnull          46
			DrawableCompat.setHotspot(mTrackDrawable, f, f1);
	//   18   37:aload_0         
	//   19   38:getfield        #195 <Field Drawable mTrackDrawable>
	//   20   41:fload_1         
	//   21   42:fload_2         
	//   22   43:invokestatic    #540 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//   23   46:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #543 <Method void CompoundButton.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #365 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		Drawable drawable = mThumbDrawable;
	//    7   11:aload_0         
	//    8   12:getfield        #184 <Field Drawable mThumbDrawable>
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
	//*  17   28:invokevirtual   #361 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = drawable.setState(ai) | false;
	//   19   34:aload           4
	//   20   36:aload_3         
	//   21   37:invokevirtual   #369 <Method boolean Drawable.setState(int[])>
	//   22   40:iconst_0        
	//   23   41:ior             
	//   24   42:istore_1        
		}
		drawable = mTrackDrawable;
	//   25   43:aload_0         
	//   26   44:getfield        #195 <Field Drawable mTrackDrawable>
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
	//*  35   60:invokevirtual   #361 <Method boolean Drawable.isStateful()>
	//*  36   63:ifeq            75
				flag1 = flag | drawable.setState(ai);
	//   37   66:iload_1         
	//   38   67:aload           4
	//   39   69:aload_3         
	//   40   70:invokevirtual   #369 <Method boolean Drawable.setState(int[])>
	//   41   73:ior             
	//   42   74:istore_2        
		}
		if(flag1)
	//*  43   75:iload_2         
	//*  44   76:ifeq            83
			invalidate();
	//   45   79:aload_0         
	//   46   80:invokevirtual   #546 <Method void invalidate()>
	//   47   83:return          
	}

	public int getCompoundPaddingLeft()
	{
		if(!ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #399 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifne            12
			return super.getCompoundPaddingLeft();
	//    3    7:aload_0         
	//    4    8:invokespecial   #549 <Method int CompoundButton.getCompoundPaddingLeft()>
	//    5   11:ireturn         
		int j = super.getCompoundPaddingLeft() + mSwitchWidth;
	//    6   12:aload_0         
	//    7   13:invokespecial   #549 <Method int CompoundButton.getCompoundPaddingLeft()>
	//    8   16:aload_0         
	//    9   17:getfield        #415 <Field int mSwitchWidth>
	//   10   20:iadd            
	//   11   21:istore_2        
		int i = j;
	//   12   22:iload_2         
	//   13   23:istore_1        
		if(!TextUtils.isEmpty(getText()))
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #552 <Method CharSequence getText()>
	//*  16   28:invokestatic    #558 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   31:ifne            41
			i = j + mSwitchPadding;
	//   18   34:iload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #237 <Field int mSwitchPadding>
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
	//*   1    1:invokestatic    #399 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifeq            12
			return super.getCompoundPaddingRight();
	//    3    7:aload_0         
	//    4    8:invokespecial   #561 <Method int CompoundButton.getCompoundPaddingRight()>
	//    5   11:ireturn         
		int j = super.getCompoundPaddingRight() + mSwitchWidth;
	//    6   12:aload_0         
	//    7   13:invokespecial   #561 <Method int CompoundButton.getCompoundPaddingRight()>
	//    8   16:aload_0         
	//    9   17:getfield        #415 <Field int mSwitchWidth>
	//   10   20:iadd            
	//   11   21:istore_2        
		int i = j;
	//   12   22:iload_2         
	//   13   23:istore_1        
		if(!TextUtils.isEmpty(getText()))
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #552 <Method CharSequence getText()>
	//*  16   28:invokestatic    #558 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   31:ifne            41
			i = j + mSwitchPadding;
	//   18   34:iload_2         
	//   19   35:aload_0         
	//   20   36:getfield        #237 <Field int mSwitchPadding>
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
	//    1    1:getfield        #218 <Field boolean mShowText>
	//    2    4:ireturn         
	}

	public boolean getSplitTrack()
	{
		return mSplitTrack;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field boolean mSplitTrack>
	//    2    4:ireturn         
	}

	public int getSwitchMinWidth()
	{
		return mSwitchMinWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field int mSwitchMinWidth>
	//    2    4:ireturn         
	}

	public int getSwitchPadding()
	{
		return mSwitchPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field int mSwitchPadding>
	//    2    4:ireturn         
	}

	public CharSequence getTextOff()
	{
		return mTextOff;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field CharSequence mTextOff>
	//    2    4:areturn         
	}

	public CharSequence getTextOn()
	{
		return mTextOn;
	//    0    0:aload_0         
	//    1    1:getfield        #204 <Field CharSequence mTextOn>
	//    2    4:areturn         
	}

	public Drawable getThumbDrawable()
	{
		return mThumbDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field Drawable mThumbDrawable>
	//    2    4:areturn         
	}

	public int getThumbTextPadding()
	{
		return mThumbTextPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field int mThumbTextPadding>
	//    2    4:ireturn         
	}

	public ColorStateList getThumbTintList()
	{
		return mThumbTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field ColorStateList mThumbTintList>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getThumbTintMode()
	{
		return mThumbTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//    2    4:areturn         
	}

	public Drawable getTrackDrawable()
	{
		return mTrackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field Drawable mTrackDrawable>
	//    2    4:areturn         
	}

	public ColorStateList getTrackTintList()
	{
		return mTrackTintList;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field ColorStateList mTrackTintList>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getTrackTintMode()
	{
		return mTrackTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//    2    4:areturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #338 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          69
		{
			super.jumpDrawablesToCurrentState();
	//    3    8:aload_0         
	//    4    9:invokespecial   #581 <Method void CompoundButton.jumpDrawablesToCurrentState()>
			if(mThumbDrawable != null)
	//*   5   12:aload_0         
	//*   6   13:getfield        #184 <Field Drawable mThumbDrawable>
	//*   7   16:ifnull          26
				mThumbDrawable.jumpToCurrentState();
	//    8   19:aload_0         
	//    9   20:getfield        #184 <Field Drawable mThumbDrawable>
	//   10   23:invokevirtual   #584 <Method void Drawable.jumpToCurrentState()>
			if(mTrackDrawable != null)
	//*  11   26:aload_0         
	//*  12   27:getfield        #195 <Field Drawable mTrackDrawable>
	//*  13   30:ifnull          40
				mTrackDrawable.jumpToCurrentState();
	//   14   33:aload_0         
	//   15   34:getfield        #195 <Field Drawable mTrackDrawable>
	//   16   37:invokevirtual   #584 <Method void Drawable.jumpToCurrentState()>
			if(mPositionAnimator != null && mPositionAnimator.isStarted())
	//*  17   40:aload_0         
	//*  18   41:getfield        #327 <Field ObjectAnimator mPositionAnimator>
	//*  19   44:ifnull          69
	//*  20   47:aload_0         
	//*  21   48:getfield        #327 <Field ObjectAnimator mPositionAnimator>
	//*  22   51:invokevirtual   #587 <Method boolean ObjectAnimator.isStarted()>
	//*  23   54:ifeq            69
			{
				mPositionAnimator.end();
	//   24   57:aload_0         
	//   25   58:getfield        #327 <Field ObjectAnimator mPositionAnimator>
	//   26   61:invokevirtual   #590 <Method void ObjectAnimator.end()>
				mPositionAnimator = null;
	//   27   64:aload_0         
	//   28   65:aconst_null     
	//   29   66:putfield        #327 <Field ObjectAnimator mPositionAnimator>
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
	//    4    4:invokespecial   #594 <Method int[] CompoundButton.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(isChecked())
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #310 <Method boolean isChecked()>
	//*   8   12:ifeq            23
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//    9   15:aload_2         
	//   10   16:getstatic       #97  <Field int[] CHECKED_STATE_SET>
	//   11   19:invokestatic    #598 <Method int[] mergeDrawableStates(int[], int[])>
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
	//    2    2:invokespecial   #601 <Method void CompoundButton.onDraw(Canvas)>
		Object obj = ((Object) (mTempRect));
	//    3    5:aload_0         
	//    4    6:getfield        #141 <Field Rect mTempRect>
	//    5    9:astore          9
		Drawable drawable = mTrackDrawable;
	//    6   11:aload_0         
	//    7   12:getfield        #195 <Field Drawable mTrackDrawable>
	//    8   15:astore          11
		if(drawable != null)
	//*   9   17:aload           11
	//*  10   19:ifnull          33
			drawable.getPadding(((Rect) (obj)));
	//   11   22:aload           11
	//   12   24:aload           9
	//   13   26:invokevirtual   #406 <Method boolean Drawable.getPadding(Rect)>
	//   14   29:pop             
		else
	//*  15   30:goto            38
			((Rect) (obj)).setEmpty();
	//   16   33:aload           9
	//   17   35:invokevirtual   #604 <Method void Rect.setEmpty()>
		int l = mSwitchTop;
	//   18   38:aload_0         
	//   19   39:getfield        #429 <Field int mSwitchTop>
	//   20   42:istore          4
		int i1 = mSwitchBottom;
	//   21   44:aload_0         
	//   22   45:getfield        #433 <Field int mSwitchBottom>
	//   23   48:istore          5
		int j1 = ((Rect) (obj)).top;
	//   24   50:aload           9
	//   25   52:getfield        #516 <Field int Rect.top>
	//   26   55:istore          6
		int k1 = ((Rect) (obj)).bottom;
	//   27   57:aload           9
	//   28   59:getfield        #519 <Field int Rect.bottom>
	//   29   62:istore          7
		Object obj1 = ((Object) (mThumbDrawable));
	//   30   64:aload_0         
	//   31   65:getfield        #184 <Field Drawable mThumbDrawable>
	//   32   68:astore          10
		if(drawable != null)
	//*  33   70:aload           11
	//*  34   72:ifnull          168
			if(mSplitTrack && obj1 != null)
	//*  35   75:aload_0         
	//*  36   76:getfield        #242 <Field boolean mSplitTrack>
	//*  37   79:ifeq            162
	//*  38   82:aload           10
	//*  39   84:ifnull          162
			{
				Rect rect = DrawableUtils.getOpticalBounds(((Drawable) (obj1)));
	//   40   87:aload           10
	//   41   89:invokestatic    #410 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   42   92:astore          12
				((Drawable) (obj1)).copyBounds(((Rect) (obj)));
	//   43   94:aload           10
	//   44   96:aload           9
	//   45   98:invokevirtual   #608 <Method void Drawable.copyBounds(Rect)>
				obj.left = ((Rect) (obj)).left + rect.left;
	//   46  101:aload           9
	//   47  103:aload           9
	//   48  105:getfield        #420 <Field int Rect.left>
	//   49  108:aload           12
	//   50  110:getfield        #420 <Field int Rect.left>
	//   51  113:iadd            
	//   52  114:putfield        #420 <Field int Rect.left>
				obj.right = ((Rect) (obj)).right - rect.right;
	//   53  117:aload           9
	//   54  119:aload           9
	//   55  121:getfield        #423 <Field int Rect.right>
	//   56  124:aload           12
	//   57  126:getfield        #423 <Field int Rect.right>
	//   58  129:isub            
	//   59  130:putfield        #423 <Field int Rect.right>
				int i = canvas.save();
	//   60  133:aload_1         
	//   61  134:invokevirtual   #613 <Method int Canvas.save()>
	//   62  137:istore_2        
				canvas.clipRect(((Rect) (obj)), android.graphics.Region.Op.DIFFERENCE);
	//   63  138:aload_1         
	//   64  139:aload           9
	//   65  141:getstatic       #619 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   66  144:invokevirtual   #623 <Method boolean Canvas.clipRect(Rect, android.graphics.Region$Op)>
	//   67  147:pop             
				drawable.draw(canvas);
	//   68  148:aload           11
	//   69  150:aload_1         
	//   70  151:invokevirtual   #624 <Method void Drawable.draw(Canvas)>
				canvas.restoreToCount(i);
	//   71  154:aload_1         
	//   72  155:iload_2         
	//   73  156:invokevirtual   #627 <Method void Canvas.restoreToCount(int)>
			} else
	//*  74  159:goto            168
			{
				drawable.draw(canvas);
	//   75  162:aload           11
	//   76  164:aload_1         
	//   77  165:invokevirtual   #624 <Method void Drawable.draw(Canvas)>
			}
		int k = canvas.save();
	//   78  168:aload_1         
	//   79  169:invokevirtual   #613 <Method int Canvas.save()>
	//   80  172:istore_3        
		if(obj1 != null)
	//*  81  173:aload           10
	//*  82  175:ifnull          184
			((Drawable) (obj1)).draw(canvas);
	//   83  178:aload           10
	//   84  180:aload_1         
	//   85  181:invokevirtual   #624 <Method void Drawable.draw(Canvas)>
		if(getTargetCheckedState())
	//*  86  184:aload_0         
	//*  87  185:invokespecial   #504 <Method boolean getTargetCheckedState()>
	//*  88  188:ifeq            200
			obj = ((Object) (mOnLayout));
	//   89  191:aload_0         
	//   90  192:getfield        #629 <Field Layout mOnLayout>
	//   91  195:astore          9
		else
	//*  92  197:goto            206
			obj = ((Object) (mOffLayout));
	//   93  200:aload_0         
	//   94  201:getfield        #631 <Field Layout mOffLayout>
	//   95  204:astore          9
		if(obj != null)
	//*  96  206:aload           9
	//*  97  208:ifnull          340
		{
			int ai[] = getDrawableState();
	//   98  211:aload_0         
	//   99  212:invokevirtual   #365 <Method int[] getDrawableState()>
	//  100  215:astore          11
			if(mTextColors != null)
	//* 101  217:aload_0         
	//* 102  218:getfield        #633 <Field ColorStateList mTextColors>
	//* 103  221:ifnull          241
				mTextPaint.setColor(mTextColors.getColorForState(ai, 0));
	//  104  224:aload_0         
	//  105  225:getfield        #148 <Field TextPaint mTextPaint>
	//  106  228:aload_0         
	//  107  229:getfield        #633 <Field ColorStateList mTextColors>
	//  108  232:aload           11
	//  109  234:iconst_0        
	//  110  235:invokevirtual   #639 <Method int ColorStateList.getColorForState(int[], int)>
	//  111  238:invokevirtual   #642 <Method void TextPaint.setColor(int)>
			mTextPaint.drawableState = ai;
	//  112  241:aload_0         
	//  113  242:getfield        #148 <Field TextPaint mTextPaint>
	//  114  245:aload           11
	//  115  247:putfield        #645 <Field int[] TextPaint.drawableState>
			int j;
			if(obj1 != null)
	//* 116  250:aload           10
	//* 117  252:ifnull          277
			{
				obj1 = ((Object) (((Drawable) (obj1)).getBounds()));
	//  118  255:aload           10
	//  119  257:invokevirtual   #649 <Method Rect Drawable.getBounds()>
	//  120  260:astore          10
				j = ((Rect) (obj1)).left + ((Rect) (obj1)).right;
	//  121  262:aload           10
	//  122  264:getfield        #420 <Field int Rect.left>
	//  123  267:aload           10
	//  124  269:getfield        #423 <Field int Rect.right>
	//  125  272:iadd            
	//  126  273:istore_2        
			} else
	//* 127  274:goto            282
			{
				j = getWidth();
	//  128  277:aload_0         
	//  129  278:invokevirtual   #652 <Method int getWidth()>
	//  130  281:istore_2        
			}
			j /= 2;
	//  131  282:iload_2         
	//  132  283:iconst_2        
	//  133  284:idiv            
	//  134  285:istore_2        
			int l1 = ((Layout) (obj)).getWidth() / 2;
	//  135  286:aload           9
	//  136  288:invokevirtual   #653 <Method int Layout.getWidth()>
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
	//  151  312:invokevirtual   #656 <Method int Layout.getHeight()>
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
	//  164  331:invokevirtual   #659 <Method void Canvas.translate(float, float)>
			((Layout) (obj)).draw(canvas);
	//  165  334:aload           9
	//  166  336:aload_1         
	//  167  337:invokevirtual   #660 <Method void Layout.draw(Canvas)>
		}
		canvas.restoreToCount(k);
	//  168  340:aload_1         
	//  169  341:iload_3         
	//  170  342:invokevirtual   #627 <Method void Canvas.restoreToCount(int)>
	//  171  345:return          
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #664 <Method void CompoundButton.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName("android.widget.Switch");
	//    3    5:aload_1         
	//    4    6:ldc1            #14  <String "android.widget.Switch">
	//    5    8:invokevirtual   #670 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    6   11:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #338 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          95
		{
			super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #674 <Method void CompoundButton.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
			accessibilitynodeinfo.setClassName("android.widget.Switch");
	//    6   13:aload_1         
	//    7   14:ldc1            #14  <String "android.widget.Switch">
	//    8   16:invokevirtual   #677 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
			CharSequence charsequence;
			if(isChecked())
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #310 <Method boolean isChecked()>
	//*  11   23:ifeq            34
				charsequence = mTextOn;
	//   12   26:aload_0         
	//   13   27:getfield        #204 <Field CharSequence mTextOn>
	//   14   30:astore_2        
			else
	//*  15   31:goto            39
				charsequence = mTextOff;
	//   16   34:aload_0         
	//   17   35:getfield        #209 <Field CharSequence mTextOff>
	//   18   38:astore_2        
			if(!TextUtils.isEmpty(charsequence))
	//*  19   39:aload_2         
	//*  20   40:invokestatic    #558 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  21   43:ifne            95
			{
				CharSequence charsequence1 = accessibilitynodeinfo.getText();
	//   22   46:aload_1         
	//   23   47:invokevirtual   #678 <Method CharSequence AccessibilityNodeInfo.getText()>
	//   24   50:astore_3        
				if(TextUtils.isEmpty(charsequence1))
	//*  25   51:aload_3         
	//*  26   52:invokestatic    #558 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   55:ifeq            64
				{
					accessibilitynodeinfo.setText(charsequence);
	//   28   58:aload_1         
	//   29   59:aload_2         
	//   30   60:invokevirtual   #681 <Method void AccessibilityNodeInfo.setText(CharSequence)>
					return;
	//   31   63:return          
				}
				StringBuilder stringbuilder = new StringBuilder();
	//   32   64:new             #683 <Class StringBuilder>
	//   33   67:dup             
	//   34   68:invokespecial   #684 <Method void StringBuilder()>
	//   35   71:astore          4
				stringbuilder.append(charsequence1).append(' ').append(charsequence);
	//   36   73:aload           4
	//   37   75:aload_3         
	//   38   76:invokevirtual   #688 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   39   79:bipush          32
	//   40   81:invokevirtual   #691 <Method StringBuilder StringBuilder.append(char)>
	//   41   84:aload_2         
	//   42   85:invokevirtual   #688 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   43   88:pop             
				accessibilitynodeinfo.setText(((CharSequence) (stringbuilder)));
	//   44   89:aload_1         
	//   45   90:aload           4
	//   46   92:invokevirtual   #681 <Method void AccessibilityNodeInfo.setText(CharSequence)>
			}
		}
	//   47   95:return          
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
	//    6    8:invokespecial   #695 <Method void CompoundButton.onLayout(boolean, int, int, int, int)>
		i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		j = 0;
	//    9   13:iconst_0        
	//   10   14:istore_3        
		if(mThumbDrawable != null)
	//*  11   15:aload_0         
	//*  12   16:getfield        #184 <Field Drawable mThumbDrawable>
	//*  13   19:ifnull          94
		{
			Rect rect = mTempRect;
	//   14   22:aload_0         
	//   15   23:getfield        #141 <Field Rect mTempRect>
	//   16   26:astore          6
			if(mTrackDrawable != null)
	//*  17   28:aload_0         
	//*  18   29:getfield        #195 <Field Drawable mTrackDrawable>
	//*  19   32:ifnull          48
				mTrackDrawable.getPadding(rect);
	//   20   35:aload_0         
	//   21   36:getfield        #195 <Field Drawable mTrackDrawable>
	//   22   39:aload           6
	//   23   41:invokevirtual   #406 <Method boolean Drawable.getPadding(Rect)>
	//   24   44:pop             
			else
	//*  25   45:goto            53
				rect.setEmpty();
	//   26   48:aload           6
	//   27   50:invokevirtual   #604 <Method void Rect.setEmpty()>
			Rect rect1 = DrawableUtils.getOpticalBounds(mThumbDrawable);
	//   28   53:aload_0         
	//   29   54:getfield        #184 <Field Drawable mThumbDrawable>
	//   30   57:invokestatic    #410 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   31   60:astore          7
			i = Math.max(0, rect1.left - rect.left);
	//   32   62:iconst_0        
	//   33   63:aload           7
	//   34   65:getfield        #420 <Field int Rect.left>
	//   35   68:aload           6
	//   36   70:getfield        #420 <Field int Rect.left>
	//   37   73:isub            
	//   38   74:invokestatic    #698 <Method int Math.max(int, int)>
	//   39   77:istore_2        
			j = Math.max(0, rect1.right - rect.right);
	//   40   78:iconst_0        
	//   41   79:aload           7
	//   42   81:getfield        #423 <Field int Rect.right>
	//   43   84:aload           6
	//   44   86:getfield        #423 <Field int Rect.right>
	//   45   89:isub            
	//   46   90:invokestatic    #698 <Method int Math.max(int, int)>
	//   47   93:istore_3        
		}
		if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*  48   94:aload_0         
	//*  49   95:invokestatic    #399 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  50   98:ifeq            125
		{
			l = getPaddingLeft() + i;
	//   51  101:aload_0         
	//   52  102:invokevirtual   #701 <Method int getPaddingLeft()>
	//   53  105:iload_2         
	//   54  106:iadd            
	//   55  107:istore          5
			k = (mSwitchWidth + l) - i - j;
	//   56  109:aload_0         
	//   57  110:getfield        #415 <Field int mSwitchWidth>
	//   58  113:iload           5
	//   59  115:iadd            
	//   60  116:iload_2         
	//   61  117:isub            
	//   62  118:iload_3         
	//   63  119:isub            
	//   64  120:istore          4
		} else
	//*  65  122:goto            151
		{
			k = getWidth() - getPaddingRight() - j;
	//   66  125:aload_0         
	//   67  126:invokevirtual   #652 <Method int getWidth()>
	//   68  129:aload_0         
	//   69  130:invokevirtual   #704 <Method int getPaddingRight()>
	//   70  133:isub            
	//   71  134:iload_3         
	//   72  135:isub            
	//   73  136:istore          4
			l = (k - mSwitchWidth) + i + j;
	//   74  138:iload           4
	//   75  140:aload_0         
	//   76  141:getfield        #415 <Field int mSwitchWidth>
	//   77  144:isub            
	//   78  145:iload_2         
	//   79  146:iadd            
	//   80  147:iload_3         
	//   81  148:iadd            
	//   82  149:istore          5
		}
		switch(getGravity() & 0x70)
	//*  83  151:aload_0         
	//*  84  152:invokevirtual   #707 <Method int getGravity()>
	//*  85  155:bipush          112
	//*  86  157:iand            
		{
	//*  87  158:lookupswitch    3: default 192
	//	               16: 207
	//	               48: 192
	//	               80: 241
		case 48: // '0'
		default:
			i = getPaddingTop();
	//   88  192:aload_0         
	//   89  193:invokevirtual   #710 <Method int getPaddingTop()>
	//   90  196:istore_2        
			j = i + mSwitchHeight;
	//   91  197:iload_2         
	//   92  198:aload_0         
	//   93  199:getfield        #712 <Field int mSwitchHeight>
	//   94  202:iadd            
	//   95  203:istore_3        
			break;

	//*  96  204:goto            258
		case 16: // '\020'
			i = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2 - mSwitchHeight / 2;
	//   97  207:aload_0         
	//   98  208:invokevirtual   #710 <Method int getPaddingTop()>
	//   99  211:aload_0         
	//  100  212:invokevirtual   #713 <Method int getHeight()>
	//  101  215:iadd            
	//  102  216:aload_0         
	//  103  217:invokevirtual   #716 <Method int getPaddingBottom()>
	//  104  220:isub            
	//  105  221:iconst_2        
	//  106  222:idiv            
	//  107  223:aload_0         
	//  108  224:getfield        #712 <Field int mSwitchHeight>
	//  109  227:iconst_2        
	//  110  228:idiv            
	//  111  229:isub            
	//  112  230:istore_2        
			j = i + mSwitchHeight;
	//  113  231:iload_2         
	//  114  232:aload_0         
	//  115  233:getfield        #712 <Field int mSwitchHeight>
	//  116  236:iadd            
	//  117  237:istore_3        
			break;

	//* 118  238:goto            258
		case 80: // 'P'
			j = getHeight() - getPaddingBottom();
	//  119  241:aload_0         
	//  120  242:invokevirtual   #713 <Method int getHeight()>
	//  121  245:aload_0         
	//  122  246:invokevirtual   #716 <Method int getPaddingBottom()>
	//  123  249:isub            
	//  124  250:istore_3        
			i = j - mSwitchHeight;
	//  125  251:iload_3         
	//  126  252:aload_0         
	//  127  253:getfield        #712 <Field int mSwitchHeight>
	//  128  256:isub            
	//  129  257:istore_2        
			break;
		}
		mSwitchLeft = l;
	//  130  258:aload_0         
	//  131  259:iload           5
	//  132  261:putfield        #431 <Field int mSwitchLeft>
		mSwitchTop = i;
	//  133  264:aload_0         
	//  134  265:iload_2         
	//  135  266:putfield        #429 <Field int mSwitchTop>
		mSwitchBottom = j;
	//  136  269:aload_0         
	//  137  270:iload_3         
	//  138  271:putfield        #433 <Field int mSwitchBottom>
		mSwitchRight = k;
	//  139  274:aload_0         
	//  140  275:iload           4
	//  141  277:putfield        #513 <Field int mSwitchRight>
	//  142  280:return          
	}

	public void onMeasure(int i, int j)
	{
		if(mShowText)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field boolean mShowText>
	//*   2    4:ifeq            45
		{
			if(mOnLayout == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #629 <Field Layout mOnLayout>
	//*   5   11:ifnonnull       26
				mOnLayout = makeLayout(mTextOn);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #204 <Field CharSequence mTextOn>
	//   10   20:invokespecial   #719 <Method Layout makeLayout(CharSequence)>
	//   11   23:putfield        #629 <Field Layout mOnLayout>
			if(mOffLayout == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #631 <Field Layout mOffLayout>
	//*  14   30:ifnonnull       45
				mOffLayout = makeLayout(mTextOff);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #209 <Field CharSequence mTextOff>
	//   19   39:invokespecial   #719 <Method Layout makeLayout(CharSequence)>
	//   20   42:putfield        #631 <Field Layout mOffLayout>
		}
		Rect rect = mTempRect;
	//   21   45:aload_0         
	//   22   46:getfield        #141 <Field Rect mTempRect>
	//   23   49:astore          9
		int k;
		int l;
		if(mThumbDrawable != null)
	//*  24   51:aload_0         
	//*  25   52:getfield        #184 <Field Drawable mThumbDrawable>
	//*  26   55:ifnull          100
		{
			mThumbDrawable.getPadding(rect);
	//   27   58:aload_0         
	//   28   59:getfield        #184 <Field Drawable mThumbDrawable>
	//   29   62:aload           9
	//   30   64:invokevirtual   #406 <Method boolean Drawable.getPadding(Rect)>
	//   31   67:pop             
			l = mThumbDrawable.getIntrinsicWidth() - rect.left - rect.right;
	//   32   68:aload_0         
	//   33   69:getfield        #184 <Field Drawable mThumbDrawable>
	//   34   72:invokevirtual   #722 <Method int Drawable.getIntrinsicWidth()>
	//   35   75:aload           9
	//   36   77:getfield        #420 <Field int Rect.left>
	//   37   80:isub            
	//   38   81:aload           9
	//   39   83:getfield        #423 <Field int Rect.right>
	//   40   86:isub            
	//   41   87:istore          4
			k = mThumbDrawable.getIntrinsicHeight();
	//   42   89:aload_0         
	//   43   90:getfield        #184 <Field Drawable mThumbDrawable>
	//   44   93:invokevirtual   #725 <Method int Drawable.getIntrinsicHeight()>
	//   45   96:istore_3        
		} else
	//*  46   97:goto            105
		{
			l = 0;
	//   47  100:iconst_0        
	//   48  101:istore          4
			k = 0;
	//   49  103:iconst_0        
	//   50  104:istore_3        
		}
		int i1;
		if(mShowText)
	//*  51  105:aload_0         
	//*  52  106:getfield        #218 <Field boolean mShowText>
	//*  53  109:ifeq            141
			i1 = Math.max(mOnLayout.getWidth(), mOffLayout.getWidth()) + mThumbTextPadding * 2;
	//   54  112:aload_0         
	//   55  113:getfield        #629 <Field Layout mOnLayout>
	//   56  116:invokevirtual   #653 <Method int Layout.getWidth()>
	//   57  119:aload_0         
	//   58  120:getfield        #631 <Field Layout mOffLayout>
	//   59  123:invokevirtual   #653 <Method int Layout.getWidth()>
	//   60  126:invokestatic    #698 <Method int Math.max(int, int)>
	//   61  129:aload_0         
	//   62  130:getfield        #227 <Field int mThumbTextPadding>
	//   63  133:iconst_2        
	//   64  134:imul            
	//   65  135:iadd            
	//   66  136:istore          5
		else
	//*  67  138:goto            144
			i1 = 0;
	//   68  141:iconst_0        
	//   69  142:istore          5
		mThumbWidth = Math.max(i1, l);
	//   70  144:aload_0         
	//   71  145:iload           5
	//   72  147:iload           4
	//   73  149:invokestatic    #698 <Method int Math.max(int, int)>
	//   74  152:putfield        #417 <Field int mThumbWidth>
		if(mTrackDrawable != null)
	//*  75  155:aload_0         
	//*  76  156:getfield        #195 <Field Drawable mTrackDrawable>
	//*  77  159:ifnull          184
		{
			mTrackDrawable.getPadding(rect);
	//   78  162:aload_0         
	//   79  163:getfield        #195 <Field Drawable mTrackDrawable>
	//   80  166:aload           9
	//   81  168:invokevirtual   #406 <Method boolean Drawable.getPadding(Rect)>
	//   82  171:pop             
			l = mTrackDrawable.getIntrinsicHeight();
	//   83  172:aload_0         
	//   84  173:getfield        #195 <Field Drawable mTrackDrawable>
	//   85  176:invokevirtual   #725 <Method int Drawable.getIntrinsicHeight()>
	//   86  179:istore          4
		} else
	//*  87  181:goto            192
		{
			rect.setEmpty();
	//   88  184:aload           9
	//   89  186:invokevirtual   #604 <Method void Rect.setEmpty()>
			l = 0;
	//   90  189:iconst_0        
	//   91  190:istore          4
		}
		int l1 = rect.left;
	//   92  192:aload           9
	//   93  194:getfield        #420 <Field int Rect.left>
	//   94  197:istore          8
		int k1 = rect.right;
	//   95  199:aload           9
	//   96  201:getfield        #423 <Field int Rect.right>
	//   97  204:istore          7
		int j1 = l1;
	//   98  206:iload           8
	//   99  208:istore          6
		i1 = k1;
	//  100  210:iload           7
	//  101  212:istore          5
		if(mThumbDrawable != null)
	//* 102  214:aload_0         
	//* 103  215:getfield        #184 <Field Drawable mThumbDrawable>
	//* 104  218:ifnull          254
		{
			Rect rect1 = DrawableUtils.getOpticalBounds(mThumbDrawable);
	//  105  221:aload_0         
	//  106  222:getfield        #184 <Field Drawable mThumbDrawable>
	//  107  225:invokestatic    #410 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//  108  228:astore          9
			j1 = Math.max(l1, rect1.left);
	//  109  230:iload           8
	//  110  232:aload           9
	//  111  234:getfield        #420 <Field int Rect.left>
	//  112  237:invokestatic    #698 <Method int Math.max(int, int)>
	//  113  240:istore          6
			i1 = Math.max(k1, rect1.right);
	//  114  242:iload           7
	//  115  244:aload           9
	//  116  246:getfield        #423 <Field int Rect.right>
	//  117  249:invokestatic    #698 <Method int Math.max(int, int)>
	//  118  252:istore          5
		}
		i1 = Math.max(mSwitchMinWidth, mThumbWidth * 2 + j1 + i1);
	//  119  254:aload_0         
	//  120  255:getfield        #232 <Field int mSwitchMinWidth>
	//  121  258:aload_0         
	//  122  259:getfield        #417 <Field int mThumbWidth>
	//  123  262:iconst_2        
	//  124  263:imul            
	//  125  264:iload           6
	//  126  266:iadd            
	//  127  267:iload           5
	//  128  269:iadd            
	//  129  270:invokestatic    #698 <Method int Math.max(int, int)>
	//  130  273:istore          5
		k = Math.max(l, k);
	//  131  275:iload           4
	//  132  277:iload_3         
	//  133  278:invokestatic    #698 <Method int Math.max(int, int)>
	//  134  281:istore_3        
		mSwitchWidth = i1;
	//  135  282:aload_0         
	//  136  283:iload           5
	//  137  285:putfield        #415 <Field int mSwitchWidth>
		mSwitchHeight = k;
	//  138  288:aload_0         
	//  139  289:iload_3         
	//  140  290:putfield        #712 <Field int mSwitchHeight>
		super.onMeasure(i, j);
	//  141  293:aload_0         
	//  142  294:iload_1         
	//  143  295:iload_2         
	//  144  296:invokespecial   #727 <Method void CompoundButton.onMeasure(int, int)>
		if(getMeasuredHeight() < k)
	//* 145  299:aload_0         
	//* 146  300:invokevirtual   #730 <Method int getMeasuredHeight()>
	//* 147  303:iload_3         
	//* 148  304:icmpge          316
			setMeasuredDimension(getMeasuredWidthAndState(), k);
	//  149  307:aload_0         
	//  150  308:aload_0         
	//  151  309:invokevirtual   #733 <Method int getMeasuredWidthAndState()>
	//  152  312:iload_3         
	//  153  313:invokevirtual   #736 <Method void setMeasuredDimension(int, int)>
	//  154  316:return          
	}

	public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onPopulateAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #739 <Method void CompoundButton.onPopulateAccessibilityEvent(AccessibilityEvent)>
		CharSequence charsequence;
		if(isChecked())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #310 <Method boolean isChecked()>
	//*   5    9:ifeq            20
			charsequence = mTextOn;
	//    6   12:aload_0         
	//    7   13:getfield        #204 <Field CharSequence mTextOn>
	//    8   16:astore_2        
		else
	//*   9   17:goto            25
			charsequence = mTextOff;
	//   10   20:aload_0         
	//   11   21:getfield        #209 <Field CharSequence mTextOff>
	//   12   24:astore_2        
		if(charsequence != null)
	//*  13   25:aload_2         
	//*  14   26:ifnull          40
			accessibilityevent.getText().add(((Object) (charsequence)));
	//   15   29:aload_1         
	//   16   30:invokevirtual   #742 <Method List AccessibilityEvent.getText()>
	//   17   33:aload_2         
	//   18   34:invokeinterface #748 <Method boolean List.add(Object)>
	//   19   39:pop             
	//   20   40:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		mVelocityTracker.addMovement(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field VelocityTracker mVelocityTracker>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #751 <Method void VelocityTracker.addMovement(MotionEvent)>
label0:
		switch(motionevent.getActionMasked())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #754 <Method int MotionEvent.getActionMasked()>
		{
		default:
			break;

	//*   6   12:tableswitch     0 3: default 44
	//	               0 47
	//	               1 297
	//	               2 91
	//	               3 297
	//*   7   44:goto            330
		case 0: // '\0'
			float f = motionevent.getX();
	//    8   47:aload_1         
	//    9   48:invokevirtual   #757 <Method float MotionEvent.getX()>
	//   10   51:fstore_2        
			float f3 = motionevent.getY();
	//   11   52:aload_1         
	//   12   53:invokevirtual   #760 <Method float MotionEvent.getY()>
	//   13   56:fstore_3        
			if(isEnabled() && hitThumb(f, f3))
	//*  14   57:aload_0         
	//*  15   58:invokevirtual   #491 <Method boolean isEnabled()>
	//*  16   61:ifeq            330
	//*  17   64:aload_0         
	//*  18   65:fload_2         
	//*  19   66:fload_3         
	//*  20   67:invokespecial   #762 <Method boolean hitThumb(float, float)>
	//*  21   70:ifeq            330
			{
				mTouchMode = 1;
	//   22   73:aload_0         
	//   23   74:iconst_1        
	//   24   75:putfield        #485 <Field int mTouchMode>
				mTouchX = f;
	//   25   78:aload_0         
	//   26   79:fload_2         
	//   27   80:putfield        #764 <Field float mTouchX>
				mTouchY = f3;
	//   28   83:aload_0         
	//   29   84:fload_3         
	//   30   85:putfield        #766 <Field float mTouchY>
			}
			break;
	//   31   88:goto            330

		case 2: // '\002'
			float f2;
			float f6;
			int i;
			switch(mTouchMode)
	//*  32   91:aload_0         
	//*  33   92:getfield        #485 <Field int mTouchMode>
			{
	//*  34   95:tableswitch     0 2: default 120
	//	               0 123
	//	               1 126
	//	               2 199
			case 0: // '\0'
			default:
				break label0;
	//   35  120:goto            294

	//*  36  123:goto            294
			case 1: // '\001'
				float f1 = motionevent.getX();
	//   37  126:aload_1         
	//   38  127:invokevirtual   #757 <Method float MotionEvent.getX()>
	//   39  130:fstore_2        
				float f4 = motionevent.getY();
	//   40  131:aload_1         
	//   41  132:invokevirtual   #760 <Method float MotionEvent.getY()>
	//   42  135:fstore_3        
				if(Math.abs(f1 - mTouchX) > (float)mTouchSlop || Math.abs(f4 - mTouchY) > (float)mTouchSlop)
	//*  43  136:fload_2         
	//*  44  137:aload_0         
	//*  45  138:getfield        #764 <Field float mTouchX>
	//*  46  141:fsub            
	//*  47  142:invokestatic    #502 <Method float Math.abs(float)>
	//*  48  145:aload_0         
	//*  49  146:getfield        #298 <Field int mTouchSlop>
	//*  50  149:i2f             
	//*  51  150:fcmpl           
	//*  52  151:ifgt            172
	//*  53  154:fload_3         
	//*  54  155:aload_0         
	//*  55  156:getfield        #766 <Field float mTouchY>
	//*  56  159:fsub            
	//*  57  160:invokestatic    #502 <Method float Math.abs(float)>
	//*  58  163:aload_0         
	//*  59  164:getfield        #298 <Field int mTouchSlop>
	//*  60  167:i2f             
	//*  61  168:fcmpl           
	//*  62  169:ifle            294
				{
					mTouchMode = 2;
	//   63  172:aload_0         
	//   64  173:iconst_2        
	//   65  174:putfield        #485 <Field int mTouchMode>
					getParent().requestDisallowInterceptTouchEvent(true);
	//   66  177:aload_0         
	//   67  178:invokevirtual   #770 <Method ViewParent getParent()>
	//   68  181:iconst_1        
	//   69  182:invokeinterface #775 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
					mTouchX = f1;
	//   70  187:aload_0         
	//   71  188:fload_2         
	//   72  189:putfield        #764 <Field float mTouchX>
					mTouchY = f4;
	//   73  192:aload_0         
	//   74  193:fload_3         
	//   75  194:putfield        #766 <Field float mTouchY>
					return true;
	//   76  197:iconst_1        
	//   77  198:ireturn         
				}
				break label0;

			case 2: // '\002'
				f6 = motionevent.getX();
	//   78  199:aload_1         
	//   79  200:invokevirtual   #757 <Method float MotionEvent.getX()>
	//   80  203:fstore          4
				i = getThumbScrollRange();
	//   81  205:aload_0         
	//   82  206:invokespecial   #402 <Method int getThumbScrollRange()>
	//   83  209:istore          5
				f2 = f6 - mTouchX;
	//   84  211:fload           4
	//   85  213:aload_0         
	//   86  214:getfield        #764 <Field float mTouchX>
	//   87  217:fsub            
	//   88  218:fstore_2        
				break;
			}
			if(i != 0)
	//*  89  219:iload           5
	//*  90  221:ifeq            233
				f2 /= i;
	//   91  224:fload_2         
	//   92  225:iload           5
	//   93  227:i2f             
	//   94  228:fdiv            
	//   95  229:fstore_2        
			else
	//*  96  230:goto            248
			if(f2 > 0.0F)
	//*  97  233:fload_2         
	//*  98  234:fconst_0        
	//*  99  235:fcmpl           
	//* 100  236:ifle            244
				f2 = 1.0F;
	//  101  239:fconst_1        
	//  102  240:fstore_2        
			else
	//* 103  241:goto            248
				f2 = -1F;
	//  104  244:ldc2            #776 <Float -1F>
	//  105  247:fstore_2        
			float f5 = f2;
	//  106  248:fload_2         
	//  107  249:fstore_3        
			if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//* 108  250:aload_0         
	//* 109  251:invokestatic    #399 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//* 110  254:ifeq            260
				f5 = -f2;
	//  111  257:fload_2         
	//  112  258:fneg            
	//  113  259:fstore_3        
			f2 = constrain(mThumbPosition + f5, 0.0F, 1.0F);
	//  114  260:aload_0         
	//  115  261:getfield        #318 <Field float mThumbPosition>
	//  116  264:fload_3         
	//  117  265:fadd            
	//  118  266:fconst_0        
	//  119  267:fconst_1        
	//  120  268:invokestatic    #778 <Method float constrain(float, float, float)>
	//  121  271:fstore_2        
			if(f2 != mThumbPosition)
	//* 122  272:fload_2         
	//* 123  273:aload_0         
	//* 124  274:getfield        #318 <Field float mThumbPosition>
	//* 125  277:fcmpl           
	//* 126  278:ifeq            292
			{
				mTouchX = f6;
	//  127  281:aload_0         
	//  128  282:fload           4
	//  129  284:putfield        #764 <Field float mTouchX>
				setThumbPosition(f2);
	//  130  287:aload_0         
	//  131  288:fload_2         
	//  132  289:invokevirtual   #782 <Method void setThumbPosition(float)>
			}
			return true;
	//  133  292:iconst_1        
	//  134  293:ireturn         

	//* 135  294:goto            330
		case 1: // '\001'
		case 3: // '\003'
			if(mTouchMode == 2)
	//* 136  297:aload_0         
	//* 137  298:getfield        #485 <Field int mTouchMode>
	//* 138  301:iconst_2        
	//* 139  302:icmpne          318
			{
				stopDrag(motionevent);
	//  140  305:aload_0         
	//  141  306:aload_1         
	//  142  307:invokespecial   #784 <Method void stopDrag(MotionEvent)>
				super.onTouchEvent(motionevent);
	//  143  310:aload_0         
	//  144  311:aload_1         
	//  145  312:invokespecial   #387 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//  146  315:pop             
				return true;
	//  147  316:iconst_1        
	//  148  317:ireturn         
			}
			mTouchMode = 0;
	//  149  318:aload_0         
	//  150  319:iconst_0        
	//  151  320:putfield        #485 <Field int mTouchMode>
			mVelocityTracker.clear();
	//  152  323:aload_0         
	//  153  324:getfield        #135 <Field VelocityTracker mVelocityTracker>
	//  154  327:invokevirtual   #787 <Method void VelocityTracker.clear()>
			break;
		}
		return super.onTouchEvent(motionevent);
	//  155  330:aload_0         
	//  156  331:aload_1         
	//  157  332:invokespecial   #387 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//  158  335:ireturn         
	}

	public void setChecked(boolean flag)
	{
		super.setChecked(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #788 <Method void CompoundButton.setChecked(boolean)>
		flag = isChecked();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #310 <Method boolean isChecked()>
	//    5    9:istore_1        
		if(getWindowToken() != null && ViewCompat.isLaidOut(((android.view.View) (this))))
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #792 <Method android.os.IBinder getWindowToken()>
	//*   8   14:ifnull          30
	//*   9   17:aload_0         
	//*  10   18:invokestatic    #797 <Method boolean ViewCompat.isLaidOut(android.view.View)>
	//*  11   21:ifeq            30
		{
			animateThumbToCheckedState(flag);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #799 <Method void animateThumbToCheckedState(boolean)>
			return;
	//   15   29:return          
		}
		cancelPositionAnimator();
	//   16   30:aload_0         
	//   17   31:invokespecial   #801 <Method void cancelPositionAnimator()>
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
	//   27   47:invokevirtual   #782 <Method void setThumbPosition(float)>
	//   28   50:return          
	}

	public void setShowText(boolean flag)
	{
		if(mShowText != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #218 <Field boolean mShowText>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mShowText = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #218 <Field boolean mShowText>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #805 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setSplitTrack(boolean flag)
	{
		mSplitTrack = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #242 <Field boolean mSplitTrack>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #546 <Method void invalidate()>
	//    5    9:return          
	}

	public void setSwitchMinWidth(int i)
	{
		mSwitchMinWidth = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #232 <Field int mSwitchMinWidth>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #805 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setSwitchPadding(int i)
	{
		mSwitchPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #237 <Field int mSwitchPadding>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #805 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setSwitchTextAppearance(Context context, int i)
	{
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, i, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #811 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    3    5:invokestatic    #814 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    4    8:astore_1        
		ColorStateList colorstatelist = ((TintTypedArray) (context)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//    5    9:aload_1         
	//    6   10:getstatic       #817 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//    7   13:invokevirtual   #249 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//    8   16:astore_3        
		if(colorstatelist != null)
	//*   9   17:aload_3         
	//*  10   18:ifnull          29
			mTextColors = colorstatelist;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #633 <Field ColorStateList mTextColors>
		else
	//*  14   26:goto            37
			mTextColors = getTextColors();
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #820 <Method ColorStateList getTextColors()>
	//   18   34:putfield        #633 <Field ColorStateList mTextColors>
		i = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
	//   19   37:aload_1         
	//   20   38:getstatic       #823 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
	//   21   41:iconst_0        
	//   22   42:invokevirtual   #225 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   23   45:istore_2        
		if(i != 0 && (float)i != mTextPaint.getTextSize())
	//*  24   46:iload_2         
	//*  25   47:ifeq            76
	//*  26   50:iload_2         
	//*  27   51:i2f             
	//*  28   52:aload_0         
	//*  29   53:getfield        #148 <Field TextPaint mTextPaint>
	//*  30   56:invokevirtual   #826 <Method float TextPaint.getTextSize()>
	//*  31   59:fcmpl           
	//*  32   60:ifeq            76
		{
			mTextPaint.setTextSize(i);
	//   33   63:aload_0         
	//   34   64:getfield        #148 <Field TextPaint mTextPaint>
	//   35   67:iload_2         
	//   36   68:i2f             
	//   37   69:invokevirtual   #829 <Method void TextPaint.setTextSize(float)>
			requestLayout();
	//   38   72:aload_0         
	//   39   73:invokevirtual   #805 <Method void requestLayout()>
		}
		setSwitchTypefaceByIndex(((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface, -1), ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle, -1));
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:getstatic       #832 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//   43   81:iconst_m1       
	//   44   82:invokevirtual   #255 <Method int TintTypedArray.getInt(int, int)>
	//   45   85:aload_1         
	//   46   86:getstatic       #835 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textStyle>
	//   47   89:iconst_m1       
	//   48   90:invokevirtual   #255 <Method int TintTypedArray.getInt(int, int)>
	//   49   93:invokespecial   #837 <Method void setSwitchTypefaceByIndex(int, int)>
		if(((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false))
	//*  50   96:aload_1         
	//*  51   97:getstatic       #840 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*  52  100:iconst_0        
	//*  53  101:invokevirtual   #216 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//*  54  104:ifeq            125
			mSwitchTransformationMethod = ((TransformationMethod) (new AllCapsTransformationMethod(getContext())));
	//   55  107:aload_0         
	//   56  108:new             #842 <Class AllCapsTransformationMethod>
	//   57  111:dup             
	//   58  112:aload_0         
	//   59  113:invokevirtual   #846 <Method Context getContext()>
	//   60  116:invokespecial   #848 <Method void AllCapsTransformationMethod(Context)>
	//   61  119:putfield        #437 <Field TransformationMethod mSwitchTransformationMethod>
		else
	//*  62  122:goto            130
			mSwitchTransformationMethod = null;
	//   63  125:aload_0         
	//   64  126:aconst_null     
	//   65  127:putfield        #437 <Field TransformationMethod mSwitchTransformationMethod>
		((TintTypedArray) (context)).recycle();
	//   66  130:aload_1         
	//   67  131:invokevirtual   #286 <Method void TintTypedArray.recycle()>
	//   68  134:return          
	}

	public void setSwitchTypeface(Typeface typeface)
	{
		if(mTextPaint.getTypeface() != typeface)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field TextPaint mTextPaint>
	//*   2    4:invokevirtual   #853 <Method Typeface TextPaint.getTypeface()>
	//*   3    7:aload_1         
	//*   4    8:if_acmpeq       28
		{
			mTextPaint.setTypeface(typeface);
	//    5   11:aload_0         
	//    6   12:getfield        #148 <Field TextPaint mTextPaint>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #857 <Method Typeface TextPaint.setTypeface(Typeface)>
	//    9   19:pop             
			requestLayout();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #805 <Method void requestLayout()>
			invalidate();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #546 <Method void invalidate()>
		}
	//   14   28:return          
	}

	public void setSwitchTypeface(Typeface typeface, int i)
	{
		if(i > 0)
	//*   0    0:iload_2         
	//*   1    1:ifle            102
		{
			if(typeface == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       16
				typeface = Typeface.defaultFromStyle(i);
	//    4    8:iload_2         
	//    5    9:invokestatic    #861 <Method Typeface Typeface.defaultFromStyle(int)>
	//    6   12:astore_1        
			else
	//*   7   13:goto            22
				typeface = Typeface.create(typeface, i);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:invokestatic    #865 <Method Typeface Typeface.create(Typeface, int)>
	//   11   21:astore_1        
			setSwitchTypeface(typeface);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #867 <Method void setSwitchTypeface(Typeface)>
			int j;
			if(typeface != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          40
				j = typeface.getStyle();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #870 <Method int Typeface.getStyle()>
	//   19   35:istore          4
			else
	//*  20   37:goto            43
				j = 0;
	//   21   40:iconst_0        
	//   22   41:istore          4
			i &= ~j;
	//   23   43:iload_2         
	//   24   44:iload           4
	//   25   46:iconst_m1       
	//   26   47:ixor            
	//   27   48:iand            
	//   28   49:istore_2        
			typeface = ((Typeface) (mTextPaint));
	//   29   50:aload_0         
	//   30   51:getfield        #148 <Field TextPaint mTextPaint>
	//   31   54:astore_1        
			boolean flag;
			if((i & 1) != 0)
	//*  32   55:iload_2         
	//*  33   56:iconst_1        
	//*  34   57:iand            
	//*  35   58:ifeq            67
				flag = true;
	//   36   61:iconst_1        
	//   37   62:istore          5
			else
	//*  38   64:goto            70
				flag = false;
	//   39   67:iconst_0        
	//   40   68:istore          5
			((TextPaint) (typeface)).setFakeBoldText(flag);
	//   41   70:aload_1         
	//   42   71:iload           5
	//   43   73:invokevirtual   #873 <Method void TextPaint.setFakeBoldText(boolean)>
			typeface = ((Typeface) (mTextPaint));
	//   44   76:aload_0         
	//   45   77:getfield        #148 <Field TextPaint mTextPaint>
	//   46   80:astore_1        
			float f;
			if((i & 2) != 0)
	//*  47   81:iload_2         
	//*  48   82:iconst_2        
	//*  49   83:iand            
	//*  50   84:ifeq            94
				f = -0.25F;
	//   51   87:ldc2            #874 <Float -0.25F>
	//   52   90:fstore_3        
			else
	//*  53   91:goto            96
				f = 0.0F;
	//   54   94:fconst_0        
	//   55   95:fstore_3        
			((TextPaint) (typeface)).setTextSkewX(f);
	//   56   96:aload_1         
	//   57   97:fload_3         
	//   58   98:invokevirtual   #877 <Method void TextPaint.setTextSkewX(float)>
			return;
	//   59  101:return          
		} else
		{
			mTextPaint.setFakeBoldText(false);
	//   60  102:aload_0         
	//   61  103:getfield        #148 <Field TextPaint mTextPaint>
	//   62  106:iconst_0        
	//   63  107:invokevirtual   #873 <Method void TextPaint.setFakeBoldText(boolean)>
			mTextPaint.setTextSkewX(0.0F);
	//   64  110:aload_0         
	//   65  111:getfield        #148 <Field TextPaint mTextPaint>
	//   66  114:fconst_0        
	//   67  115:invokevirtual   #877 <Method void TextPaint.setTextSkewX(float)>
			setSwitchTypeface(typeface);
	//   68  118:aload_0         
	//   69  119:aload_1         
	//   70  120:invokevirtual   #867 <Method void setSwitchTypeface(Typeface)>
			return;
	//   71  123:return          
		}
	}

	public void setTextOff(CharSequence charsequence)
	{
		mTextOff = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #209 <Field CharSequence mTextOff>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #805 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTextOn(CharSequence charsequence)
	{
		mTextOn = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #204 <Field CharSequence mTextOn>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #805 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setThumbDrawable(Drawable drawable)
	{
		if(mThumbDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field Drawable mThumbDrawable>
	//*   2    4:ifnull          15
			mThumbDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #184 <Field Drawable mThumbDrawable>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #190 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mThumbDrawable = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #184 <Field Drawable mThumbDrawable>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #190 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #805 <Method void requestLayout()>
	//   17   33:return          
	}

	void setThumbPosition(float f)
	{
		mThumbPosition = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #318 <Field float mThumbPosition>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #546 <Method void invalidate()>
	//    5    9:return          
	}

	public void setThumbResource(int i)
	{
		setThumbDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #846 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #887 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #889 <Method void setThumbDrawable(Drawable)>
	//    6   12:return          
	}

	public void setThumbTextPadding(int i)
	{
		mThumbTextPadding = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #227 <Field int mThumbTextPadding>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #805 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setThumbTintList(ColorStateList colorstatelist)
	{
		mThumbTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field ColorStateList mThumbTintList>
		mHasThumbTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #117 <Field boolean mHasThumbTint>
		applyThumbTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #264 <Method void applyThumbTint()>
	//    8   14:return          
	}

	public void setThumbTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mThumbTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
		mHasThumbTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #119 <Field boolean mHasThumbTintMode>
		applyThumbTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #264 <Method void applyThumbTint()>
	//    8   14:return          
	}

	public void setTrackDrawable(Drawable drawable)
	{
		if(mTrackDrawable != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #195 <Field Drawable mTrackDrawable>
	//*   2    4:ifnull          15
			mTrackDrawable.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #195 <Field Drawable mTrackDrawable>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #190 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTrackDrawable = drawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #195 <Field Drawable mTrackDrawable>
		if(drawable != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          29
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #190 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #805 <Method void requestLayout()>
	//   17   33:return          
	}

	public void setTrackResource(int i)
	{
		setTrackDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #846 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #887 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #899 <Method void setTrackDrawable(Drawable)>
	//    6   12:return          
	}

	public void setTrackTintList(ColorStateList colorstatelist)
	{
		mTrackTintList = colorstatelist;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field ColorStateList mTrackTintList>
		mHasTrackTint = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #125 <Field boolean mHasTrackTint>
		applyTrackTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #273 <Method void applyTrackTint()>
	//    8   14:return          
	}

	public void setTrackTintMode(android.graphics.PorterDuff.Mode mode)
	{
		mTrackTintMode = mode;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #123 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
		mHasTrackTintMode = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #127 <Field boolean mHasTrackTintMode>
		applyTrackTint();
	//    6   10:aload_0         
	//    7   11:invokespecial   #273 <Method void applyTrackTint()>
	//    8   14:return          
	}

	public void toggle()
	{
		boolean flag;
		if(!isChecked())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #310 <Method boolean isChecked()>
	//*   2    4:ifne            12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		setChecked(flag);
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #314 <Method void setChecked(boolean)>
	//   11   19:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mThumbDrawable || drawable == mTrackDrawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #906 <Method boolean CompoundButton.verifyDrawable(Drawable)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #184 <Field Drawable mThumbDrawable>
	//    7   13:if_acmpeq       24
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #195 <Field Drawable mTrackDrawable>
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
	private TextPaint mTextPaint;
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
	//    2    4:ldc1            #86  <Class Float>
	//    3    6:ldc1            #88  <String "thumbPos">
	//    4    8:invokespecial   #92  <Method void SwitchCompat$1(Class, String)>
	//    5   11:putstatic       #94  <Field Property THUMB_POS>
	//    6   14:iconst_1        
	//    7   15:newarray        int[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:ldc1            #95  <Int 0x10100a0>
	//   11   21:iastore         
	//   12   22:putstatic       #97  <Field int[] CHECKED_STATE_SET>
	//*  13   25:return          
	}


/*
	static float access$000(SwitchCompat switchcompat)
	{
		return switchcompat.mThumbPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field float mThumbPosition>
	//    2    4:freturn         
	}

*/
}
