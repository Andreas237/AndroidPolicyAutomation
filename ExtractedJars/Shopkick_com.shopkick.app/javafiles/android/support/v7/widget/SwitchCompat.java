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
import android.support.v4.widget.TextViewCompat;
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
		obj = ((Object) (mThumbDrawable));
	//   64  120:aload_0         
	//   65  121:getfield        #180 <Field Drawable mThumbDrawable>
	//   66  124:astore          4
		if(obj != null)
	//*  67  126:aload           4
	//*  68  128:ifnull          137
			((Drawable) (obj)).setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   69  131:aload           4
	//   70  133:aload_0         
	//   71  134:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTrackDrawable = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.SwitchCompat_track);
	//   72  137:aload_0         
	//   73  138:aload_2         
	//   74  139:getstatic       #189 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_track>
	//   75  142:invokevirtual   #178 <Method Drawable TintTypedArray.getDrawable(int)>
	//   76  145:putfield        #191 <Field Drawable mTrackDrawable>
		obj = ((Object) (mTrackDrawable));
	//   77  148:aload_0         
	//   78  149:getfield        #191 <Field Drawable mTrackDrawable>
	//   79  152:astore          4
		if(obj != null)
	//*  80  154:aload           4
	//*  81  156:ifnull          165
			((Drawable) (obj)).setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   82  159:aload           4
	//   83  161:aload_0         
	//   84  162:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTextOn = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOn);
	//   85  165:aload_0         
	//   86  166:aload_2         
	//   87  167:getstatic       #194 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_textOn>
	//   88  170:invokevirtual   #198 <Method CharSequence TintTypedArray.getText(int)>
	//   89  173:putfield        #200 <Field CharSequence mTextOn>
		mTextOff = ((TintTypedArray) (attributeset)).getText(android.support.v7.appcompat.R.styleable.SwitchCompat_android_textOff);
	//   90  176:aload_0         
	//   91  177:aload_2         
	//   92  178:getstatic       #203 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_android_textOff>
	//   93  181:invokevirtual   #198 <Method CharSequence TintTypedArray.getText(int)>
	//   94  184:putfield        #205 <Field CharSequence mTextOff>
		mShowText = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_showText, true);
	//   95  187:aload_0         
	//   96  188:aload_2         
	//   97  189:getstatic       #208 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_showText>
	//   98  192:iconst_1        
	//   99  193:invokevirtual   #212 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  100  196:putfield        #214 <Field boolean mShowText>
		mThumbTextPadding = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
	//  101  199:aload_0         
	//  102  200:aload_2         
	//  103  201:getstatic       #217 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTextPadding>
	//  104  204:iconst_0        
	//  105  205:invokevirtual   #221 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  106  208:putfield        #223 <Field int mThumbTextPadding>
		mSwitchMinWidth = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
	//  107  211:aload_0         
	//  108  212:aload_2         
	//  109  213:getstatic       #226 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchMinWidth>
	//  110  216:iconst_0        
	//  111  217:invokevirtual   #221 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  112  220:putfield        #228 <Field int mSwitchMinWidth>
		mSwitchPadding = ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
	//  113  223:aload_0         
	//  114  224:aload_2         
	//  115  225:getstatic       #231 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchPadding>
	//  116  228:iconst_0        
	//  117  229:invokevirtual   #221 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  118  232:putfield        #233 <Field int mSwitchPadding>
		mSplitTrack = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.SwitchCompat_splitTrack, false);
	//  119  235:aload_0         
	//  120  236:aload_2         
	//  121  237:getstatic       #236 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_splitTrack>
	//  122  240:iconst_0        
	//  123  241:invokevirtual   #212 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  124  244:putfield        #238 <Field boolean mSplitTrack>
		obj = ((Object) (((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTint)));
	//  125  247:aload_2         
	//  126  248:getstatic       #241 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTint>
	//  127  251:invokevirtual   #245 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  128  254:astore          4
		if(obj != null)
	//* 129  256:aload           4
	//* 130  258:ifnull          272
		{
			mThumbTintList = ((ColorStateList) (obj));
	//  131  261:aload_0         
	//  132  262:aload           4
	//  133  264:putfield        #109 <Field ColorStateList mThumbTintList>
			mHasThumbTint = true;
	//  134  267:aload_0         
	//  135  268:iconst_1        
	//  136  269:putfield        #113 <Field boolean mHasThumbTint>
		}
		obj = ((Object) (DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SwitchCompat_thumbTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  137  272:aload_2         
	//  138  273:getstatic       #248 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_thumbTintMode>
	//  139  276:iconst_m1       
	//  140  277:invokevirtual   #251 <Method int TintTypedArray.getInt(int, int)>
	//  141  280:aconst_null     
	//  142  281:invokestatic    #257 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  143  284:astore          4
		if(mThumbTintMode != obj)
	//* 144  286:aload_0         
	//* 145  287:getfield        #111 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//* 146  290:aload           4
	//* 147  292:if_acmpeq       306
		{
			mThumbTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//  148  295:aload_0         
	//  149  296:aload           4
	//  150  298:putfield        #111 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
			mHasThumbTintMode = true;
	//  151  301:aload_0         
	//  152  302:iconst_1        
	//  153  303:putfield        #115 <Field boolean mHasThumbTintMode>
		}
		if(mHasThumbTint || mHasThumbTintMode)
	//* 154  306:aload_0         
	//* 155  307:getfield        #113 <Field boolean mHasThumbTint>
	//* 156  310:ifne            320
	//* 157  313:aload_0         
	//* 158  314:getfield        #115 <Field boolean mHasThumbTintMode>
	//* 159  317:ifeq            324
			applyThumbTint();
	//  160  320:aload_0         
	//  161  321:invokespecial   #260 <Method void applyThumbTint()>
		obj = ((Object) (((TintTypedArray) (attributeset)).getColorStateList(android.support.v7.appcompat.R.styleable.SwitchCompat_trackTint)));
	//  162  324:aload_2         
	//  163  325:getstatic       #263 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_trackTint>
	//  164  328:invokevirtual   #245 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  165  331:astore          4
		if(obj != null)
	//* 166  333:aload           4
	//* 167  335:ifnull          349
		{
			mTrackTintList = ((ColorStateList) (obj));
	//  168  338:aload_0         
	//  169  339:aload           4
	//  170  341:putfield        #117 <Field ColorStateList mTrackTintList>
			mHasTrackTint = true;
	//  171  344:aload_0         
	//  172  345:iconst_1        
	//  173  346:putfield        #121 <Field boolean mHasTrackTint>
		}
		obj = ((Object) (DrawableUtils.parseTintMode(((TintTypedArray) (attributeset)).getInt(android.support.v7.appcompat.R.styleable.SwitchCompat_trackTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)))));
	//  174  349:aload_2         
	//  175  350:getstatic       #266 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_trackTintMode>
	//  176  353:iconst_m1       
	//  177  354:invokevirtual   #251 <Method int TintTypedArray.getInt(int, int)>
	//  178  357:aconst_null     
	//  179  358:invokestatic    #257 <Method android.graphics.PorterDuff$Mode DrawableUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//  180  361:astore          4
		if(mTrackTintMode != obj)
	//* 181  363:aload_0         
	//* 182  364:getfield        #119 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//* 183  367:aload           4
	//* 184  369:if_acmpeq       383
		{
			mTrackTintMode = ((android.graphics.PorterDuff.Mode) (obj));
	//  185  372:aload_0         
	//  186  373:aload           4
	//  187  375:putfield        #119 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
			mHasTrackTintMode = true;
	//  188  378:aload_0         
	//  189  379:iconst_1        
	//  190  380:putfield        #123 <Field boolean mHasTrackTintMode>
		}
		if(mHasTrackTint || mHasTrackTintMode)
	//* 191  383:aload_0         
	//* 192  384:getfield        #121 <Field boolean mHasTrackTint>
	//* 193  387:ifne            397
	//* 194  390:aload_0         
	//* 195  391:getfield        #123 <Field boolean mHasTrackTintMode>
	//* 196  394:ifeq            401
			applyTrackTint();
	//  197  397:aload_0         
	//  198  398:invokespecial   #269 <Method void applyTrackTint()>
		i = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
	//  199  401:aload_2         
	//  200  402:getstatic       #272 <Field int android.support.v7.appcompat.R$styleable.SwitchCompat_switchTextAppearance>
	//  201  405:iconst_0        
	//  202  406:invokevirtual   #275 <Method int TintTypedArray.getResourceId(int, int)>
	//  203  409:istore_3        
		if(i != 0)
	//* 204  410:iload_3         
	//* 205  411:ifeq            420
			setSwitchTextAppearance(context, i);
	//  206  414:aload_0         
	//  207  415:aload_1         
	//  208  416:iload_3         
	//  209  417:invokevirtual   #279 <Method void setSwitchTextAppearance(Context, int)>
		((TintTypedArray) (attributeset)).recycle();
	//  210  420:aload_2         
	//  211  421:invokevirtual   #282 <Method void TintTypedArray.recycle()>
		context = ((Context) (ViewConfiguration.get(context)));
	//  212  424:aload_1         
	//  213  425:invokestatic    #288 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//  214  428:astore_1        
		mTouchSlop = ((ViewConfiguration) (context)).getScaledTouchSlop();
	//  215  429:aload_0         
	//  216  430:aload_1         
	//  217  431:invokevirtual   #292 <Method int ViewConfiguration.getScaledTouchSlop()>
	//  218  434:putfield        #294 <Field int mTouchSlop>
		mMinFlingVelocity = ((ViewConfiguration) (context)).getScaledMinimumFlingVelocity();
	//  219  437:aload_0         
	//  220  438:aload_1         
	//  221  439:invokevirtual   #297 <Method int ViewConfiguration.getScaledMinimumFlingVelocity()>
	//  222  442:putfield        #299 <Field int mMinFlingVelocity>
		refreshDrawableState();
	//  223  445:aload_0         
	//  224  446:invokevirtual   #302 <Method void refreshDrawableState()>
		setChecked(isChecked());
	//  225  449:aload_0         
	//  226  450:aload_0         
	//  227  451:invokevirtual   #306 <Method boolean isChecked()>
	//  228  454:invokevirtual   #310 <Method void setChecked(boolean)>
	//  229  457:return          
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
	//   16   23:invokestatic    #317 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, Property, float[])>
	//   17   26:putfield        #319 <Field ObjectAnimator mPositionAnimator>
		mPositionAnimator.setDuration(250L);
	//   18   29:aload_0         
	//   19   30:getfield        #319 <Field ObjectAnimator mPositionAnimator>
	//   20   33:ldc2w           #320 <Long 250L>
	//   21   36:invokevirtual   #325 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   22   39:pop             
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  23   40:getstatic       #330 <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   43:bipush          18
	//*  25   45:icmplt          56
			mPositionAnimator.setAutoCancel(true);
	//   26   48:aload_0         
	//   27   49:getfield        #319 <Field ObjectAnimator mPositionAnimator>
	//   28   52:iconst_1        
	//   29   53:invokevirtual   #333 <Method void ObjectAnimator.setAutoCancel(boolean)>
		mPositionAnimator.start();
	//   30   56:aload_0         
	//   31   57:getfield        #319 <Field ObjectAnimator mPositionAnimator>
	//   32   60:invokevirtual   #336 <Method void ObjectAnimator.start()>
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
	//   12   26:invokevirtual   #340 <Method Drawable Drawable.mutate()>
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
	//   21   47:invokestatic    #346 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasThumbTintMode)
	//*  22   50:aload_0         
	//*  23   51:getfield        #115 <Field boolean mHasThumbTintMode>
	//*  24   54:ifeq            68
				DrawableCompat.setTintMode(mThumbDrawable, mThumbTintMode);
	//   25   57:aload_0         
	//   26   58:getfield        #180 <Field Drawable mThumbDrawable>
	//   27   61:aload_0         
	//   28   62:getfield        #111 <Field android.graphics.PorterDuff$Mode mThumbTintMode>
	//   29   65:invokestatic    #350 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mThumbDrawable.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #180 <Field Drawable mThumbDrawable>
	//*  32   72:invokevirtual   #353 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				mThumbDrawable.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #180 <Field Drawable mThumbDrawable>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #357 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #361 <Method boolean Drawable.setState(int[])>
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
	//   12   26:invokevirtual   #340 <Method Drawable Drawable.mutate()>
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
	//   21   47:invokestatic    #346 <Method void DrawableCompat.setTintList(Drawable, ColorStateList)>
			if(mHasTrackTintMode)
	//*  22   50:aload_0         
	//*  23   51:getfield        #123 <Field boolean mHasTrackTintMode>
	//*  24   54:ifeq            68
				DrawableCompat.setTintMode(mTrackDrawable, mTrackTintMode);
	//   25   57:aload_0         
	//   26   58:getfield        #191 <Field Drawable mTrackDrawable>
	//   27   61:aload_0         
	//   28   62:getfield        #119 <Field android.graphics.PorterDuff$Mode mTrackTintMode>
	//   29   65:invokestatic    #350 <Method void DrawableCompat.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
			if(mTrackDrawable.isStateful())
	//*  30   68:aload_0         
	//*  31   69:getfield        #191 <Field Drawable mTrackDrawable>
	//*  32   72:invokevirtual   #353 <Method boolean Drawable.isStateful()>
	//*  33   75:ifeq            90
				mTrackDrawable.setState(getDrawableState());
	//   34   78:aload_0         
	//   35   79:getfield        #191 <Field Drawable mTrackDrawable>
	//   36   82:aload_0         
	//   37   83:invokevirtual   #357 <Method int[] getDrawableState()>
	//   38   86:invokevirtual   #361 <Method boolean Drawable.setState(int[])>
	//   39   89:pop             
		}
	//   40   90:return          
	}

	private void cancelPositionAnimator()
	{
		ObjectAnimator objectanimator = mPositionAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #319 <Field ObjectAnimator mPositionAnimator>
	//    2    4:astore_1        
		if(objectanimator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			objectanimator.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #365 <Method void ObjectAnimator.cancel()>
	//    7   13:return          
	}

	private void cancelSuperTouch(MotionEvent motionevent)
	{
		motionevent = MotionEvent.obtain(motionevent);
	//    0    0:aload_1         
	//    1    1:invokestatic    #372 <Method MotionEvent MotionEvent.obtain(MotionEvent)>
	//    2    4:astore_1        
		motionevent.setAction(3);
	//    3    5:aload_1         
	//    4    6:iconst_3        
	//    5    7:invokevirtual   #375 <Method void MotionEvent.setAction(int)>
		super.onTouchEvent(motionevent);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #379 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//    9   15:pop             
		motionevent.recycle();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #380 <Method void MotionEvent.recycle()>
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
	//    1    1:getfield        #385 <Field float mThumbPosition>
	//    2    4:ldc2            #386 <Float 0.5F>
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
	//*   1    1:invokestatic    #393 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifeq            17
			f = 1.0F - mThumbPosition;
	//    3    7:fconst_1        
	//    4    8:aload_0         
	//    5    9:getfield        #385 <Field float mThumbPosition>
	//    6   12:fsub            
	//    7   13:fstore_1        
		else
	//*   8   14:goto            22
			f = mThumbPosition;
	//    9   17:aload_0         
	//   10   18:getfield        #385 <Field float mThumbPosition>
	//   11   21:fstore_1        
		return (int)(f * (float)getThumbScrollRange() + 0.5F);
	//   12   22:fload_1         
	//   13   23:aload_0         
	//   14   24:invokespecial   #396 <Method int getThumbScrollRange()>
	//   15   27:i2f             
	//   16   28:fmul            
	//   17   29:ldc2            #386 <Float 0.5F>
	//   18   32:fadd            
	//   19   33:f2i             
	//   20   34:ireturn         
	}

	private int getThumbScrollRange()
	{
		Object obj = ((Object) (mTrackDrawable));
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field Drawable mTrackDrawable>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          71
		{
			Rect rect = mTempRect;
	//    5    9:aload_0         
	//    6   10:getfield        #137 <Field Rect mTempRect>
	//    7   13:astore_2        
			((Drawable) (obj)).getPadding(rect);
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #400 <Method boolean Drawable.getPadding(Rect)>
	//   11   19:pop             
			obj = ((Object) (mThumbDrawable));
	//   12   20:aload_0         
	//   13   21:getfield        #180 <Field Drawable mThumbDrawable>
	//   14   24:astore_1        
			if(obj != null)
	//*  15   25:aload_1         
	//*  16   26:ifnull          37
				obj = ((Object) (DrawableUtils.getOpticalBounds(((Drawable) (obj)))));
	//   17   29:aload_1         
	//   18   30:invokestatic    #404 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   19   33:astore_1        
			else
	//*  20   34:goto            41
				obj = ((Object) (DrawableUtils.INSETS_NONE));
	//   21   37:getstatic       #407 <Field Rect DrawableUtils.INSETS_NONE>
	//   22   40:astore_1        
			return mSwitchWidth - mThumbWidth - rect.left - rect.right - ((Rect) (obj)).left - ((Rect) (obj)).right;
	//   23   41:aload_0         
	//   24   42:getfield        #409 <Field int mSwitchWidth>
	//   25   45:aload_0         
	//   26   46:getfield        #411 <Field int mThumbWidth>
	//   27   49:isub            
	//   28   50:aload_2         
	//   29   51:getfield        #414 <Field int Rect.left>
	//   30   54:isub            
	//   31   55:aload_2         
	//   32   56:getfield        #417 <Field int Rect.right>
	//   33   59:isub            
	//   34   60:aload_1         
	//   35   61:getfield        #414 <Field int Rect.left>
	//   36   64:isub            
	//   37   65:aload_1         
	//   38   66:getfield        #417 <Field int Rect.right>
	//   39   69:isub            
	//   40   70:ireturn         
		} else
		{
			return 0;
	//   41   71:iconst_0        
	//   42   72:ireturn         
		}
	}

	private boolean hitThumb(float f, float f1)
	{
		Drawable drawable = mThumbDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field Drawable mThumbDrawable>
	//    2    4:astore          13
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          12
		if(drawable == null)
	//*   5    9:aload           13
	//*   6   11:ifnonnull       16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		int k = getThumbOffset();
	//    9   16:aload_0         
	//   10   17:invokespecial   #421 <Method int getThumbOffset()>
	//   11   20:istore          5
		mThumbDrawable.getPadding(mTempRect);
	//   12   22:aload_0         
	//   13   23:getfield        #180 <Field Drawable mThumbDrawable>
	//   14   26:aload_0         
	//   15   27:getfield        #137 <Field Rect mTempRect>
	//   16   30:invokevirtual   #400 <Method boolean Drawable.getPadding(Rect)>
	//   17   33:pop             
		int i = mSwitchTop;
	//   18   34:aload_0         
	//   19   35:getfield        #423 <Field int mSwitchTop>
	//   20   38:istore_3        
		int j = mTouchSlop;
	//   21   39:aload_0         
	//   22   40:getfield        #294 <Field int mTouchSlop>
	//   23   43:istore          4
		k = (mSwitchLeft + k) - j;
	//   24   45:aload_0         
	//   25   46:getfield        #425 <Field int mSwitchLeft>
	//   26   49:iload           5
	//   27   51:iadd            
	//   28   52:iload           4
	//   29   54:isub            
	//   30   55:istore          5
		int l = mThumbWidth;
	//   31   57:aload_0         
	//   32   58:getfield        #411 <Field int mThumbWidth>
	//   33   61:istore          6
		int i1 = mTempRect.left;
	//   34   63:aload_0         
	//   35   64:getfield        #137 <Field Rect mTempRect>
	//   36   67:getfield        #414 <Field int Rect.left>
	//   37   70:istore          7
		int j1 = mTempRect.right;
	//   38   72:aload_0         
	//   39   73:getfield        #137 <Field Rect mTempRect>
	//   40   76:getfield        #417 <Field int Rect.right>
	//   41   79:istore          8
		int k1 = mTouchSlop;
	//   42   81:aload_0         
	//   43   82:getfield        #294 <Field int mTouchSlop>
	//   44   85:istore          9
		int l1 = mSwitchBottom;
	//   45   87:aload_0         
	//   46   88:getfield        #427 <Field int mSwitchBottom>
	//   47   91:istore          10
		boolean flag = flag1;
	//   48   93:iload           12
	//   49   95:istore          11
		if(f > (float)k)
	//*  50   97:fload_1         
	//*  51   98:iload           5
	//*  52  100:i2f             
	//*  53  101:fcmpl           
	//*  54  102:ifle            161
		{
			flag = flag1;
	//   55  105:iload           12
	//   56  107:istore          11
			if(f < (float)(l + k + i1 + j1 + k1))
	//*  57  109:fload_1         
	//*  58  110:iload           6
	//*  59  112:iload           5
	//*  60  114:iadd            
	//*  61  115:iload           7
	//*  62  117:iadd            
	//*  63  118:iload           8
	//*  64  120:iadd            
	//*  65  121:iload           9
	//*  66  123:iadd            
	//*  67  124:i2f             
	//*  68  125:fcmpg           
	//*  69  126:ifge            161
			{
				flag = flag1;
	//   70  129:iload           12
	//   71  131:istore          11
				if(f1 > (float)(i - j))
	//*  72  133:fload_2         
	//*  73  134:iload_3         
	//*  74  135:iload           4
	//*  75  137:isub            
	//*  76  138:i2f             
	//*  77  139:fcmpl           
	//*  78  140:ifle            161
				{
					flag = flag1;
	//   79  143:iload           12
	//   80  145:istore          11
					if(f1 < (float)(l1 + k1))
	//*  81  147:fload_2         
	//*  82  148:iload           10
	//*  83  150:iload           9
	//*  84  152:iadd            
	//*  85  153:i2f             
	//*  86  154:fcmpg           
	//*  87  155:ifge            161
						flag = true;
	//   88  158:iconst_1        
	//   89  159:istore          11
				}
			}
		}
		return flag;
	//   90  161:iload           11
	//   91  163:ireturn         
	}

	private Layout makeLayout(CharSequence charsequence)
	{
		TransformationMethod transformationmethod = mSwitchTransformationMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #431 <Field TransformationMethod mSwitchTransformationMethod>
	//    2    4:astore          4
		CharSequence charsequence1 = charsequence;
	//    3    6:aload_1         
	//    4    7:astore_3        
		if(transformationmethod != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          23
			charsequence1 = transformationmethod.getTransformation(charsequence, ((android.view.View) (this)));
	//    7   13:aload           4
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokeinterface #437 <Method CharSequence TransformationMethod.getTransformation(CharSequence, android.view.View)>
	//   11   22:astore_3        
		charsequence = ((CharSequence) (mTextPaint));
	//   12   23:aload_0         
	//   13   24:getfield        #144 <Field TextPaint mTextPaint>
	//   14   27:astore_1        
		int i;
		if(charsequence1 != null)
	//*  15   28:aload_3         
	//*  16   29:ifnull          46
			i = (int)Math.ceil(Layout.getDesiredWidth(charsequence1, ((TextPaint) (charsequence))));
	//   17   32:aload_3         
	//   18   33:aload_1         
	//   19   34:invokestatic    #443 <Method float Layout.getDesiredWidth(CharSequence, TextPaint)>
	//   20   37:f2d             
	//   21   38:invokestatic    #449 <Method double Math.ceil(double)>
	//   22   41:d2i             
	//   23   42:istore_2        
		else
	//*  24   43:goto            48
			i = 0;
	//   25   46:iconst_0        
	//   26   47:istore_2        
		return ((Layout) (new StaticLayout(charsequence1, ((TextPaint) (charsequence)), i, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 0.0F, true)));
	//   27   48:new             #451 <Class StaticLayout>
	//   28   51:dup             
	//   29   52:aload_3         
	//   30   53:aload_1         
	//   31   54:iload_2         
	//   32   55:getstatic       #457 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//   33   58:fconst_1        
	//   34   59:fconst_0        
	//   35   60:iconst_1        
	//   36   61:invokespecial   #460 <Method void StaticLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//   37   64:areturn         
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
	//    5   33:getstatic       #467 <Field Typeface Typeface.MONOSPACE>
	//    6   36:astore_3        
			break;

	//*   7   37:goto            51
		case 2: // '\002'
			typeface = Typeface.SERIF;
	//    8   40:getstatic       #469 <Field Typeface Typeface.SERIF>
	//    9   43:astore_3        
			break;

	//*  10   44:goto            51
		case 1: // '\001'
			typeface = Typeface.SANS_SERIF;
	//   11   47:getstatic       #472 <Field Typeface Typeface.SANS_SERIF>
	//   12   50:astore_3        
			break;
		}
		setSwitchTypeface(typeface, j);
	//   13   51:aload_0         
	//   14   52:aload_3         
	//   15   53:iload_2         
	//   16   54:invokevirtual   #476 <Method void setSwitchTypeface(Typeface, int)>
	//   17   57:return          
	}

	private void stopDrag(MotionEvent motionevent)
	{
		mTouchMode = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #479 <Field int mTouchMode>
		int i = motionevent.getAction();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #482 <Method int MotionEvent.getAction()>
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
	//*  12   19:invokevirtual   #485 <Method boolean isEnabled()>
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
	//   27   49:invokevirtual   #488 <Method void VelocityTracker.computeCurrentVelocity(int)>
			float f = mVelocityTracker.getXVelocity();
	//   28   52:aload_0         
	//   29   53:getfield        #131 <Field VelocityTracker mVelocityTracker>
	//   30   56:invokevirtual   #492 <Method float VelocityTracker.getXVelocity()>
	//   31   59:fstore_2        
			if(Math.abs(f) > (float)mMinFlingVelocity)
	//*  32   60:fload_2         
	//*  33   61:invokestatic    #496 <Method float Math.abs(float)>
	//*  34   64:aload_0         
	//*  35   65:getfield        #299 <Field int mMinFlingVelocity>
	//*  36   68:i2f             
	//*  37   69:fcmpl           
	//*  38   70:ifle            104
			{
				if(ViewUtils.isLayoutRtl(((android.view.View) (this))) ? f >= 0.0F : f <= 0.0F)
	//*  39   73:aload_0         
	//*  40   74:invokestatic    #393 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  41   77:ifeq            89
	//*  42   80:fload_2         
	//*  43   81:fconst_0        
	//*  44   82:fcmpg           
	//*  45   83:ifge            98
	//*  46   86:goto            101
	//*  47   89:fload_2         
	//*  48   90:fconst_0        
	//*  49   91:fcmpl           
	//*  50   92:ifle            98
	//*  51   95:goto            101
					flag1 = false;
	//   52   98:iconst_0        
	//   53   99:istore          4
			} else
	//*  54  101:goto            117
			{
				flag1 = getTargetCheckedState();
	//   55  104:aload_0         
	//   56  105:invokespecial   #498 <Method boolean getTargetCheckedState()>
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
	//   66  126:invokevirtual   #501 <Method void playSoundEffect(int)>
		setChecked(flag1);
	//   67  129:aload_0         
	//   68  130:iload           4
	//   69  132:invokevirtual   #310 <Method void setChecked(boolean)>
		cancelSuperTouch(motionevent);
	//   70  135:aload_0         
	//   71  136:aload_1         
	//   72  137:invokespecial   #503 <Method void cancelSuperTouch(MotionEvent)>
	//   73  140:return          
	}

	public void draw(Canvas canvas)
	{
		Rect rect = mTempRect;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Rect mTempRect>
	//    2    4:astore          11
		int j = mSwitchLeft;
	//    3    6:aload_0         
	//    4    7:getfield        #425 <Field int mSwitchLeft>
	//    5   10:istore_3        
		int i1 = mSwitchTop;
	//    6   11:aload_0         
	//    7   12:getfield        #423 <Field int mSwitchTop>
	//    8   15:istore          5
		int k1 = mSwitchRight;
	//    9   17:aload_0         
	//   10   18:getfield        #507 <Field int mSwitchRight>
	//   11   21:istore          7
		int j1 = mSwitchBottom;
	//   12   23:aload_0         
	//   13   24:getfield        #427 <Field int mSwitchBottom>
	//   14   27:istore          6
		int l = getThumbOffset() + j;
	//   15   29:aload_0         
	//   16   30:invokespecial   #421 <Method int getThumbOffset()>
	//   17   33:iload_3         
	//   18   34:iadd            
	//   19   35:istore          4
		Object obj = ((Object) (mThumbDrawable));
	//   20   37:aload_0         
	//   21   38:getfield        #180 <Field Drawable mThumbDrawable>
	//   22   41:astore          10
		if(obj != null)
	//*  23   43:aload           10
	//*  24   45:ifnull          58
			obj = ((Object) (DrawableUtils.getOpticalBounds(((Drawable) (obj)))));
	//   25   48:aload           10
	//   26   50:invokestatic    #404 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   27   53:astore          10
		else
	//*  28   55:goto            63
			obj = ((Object) (DrawableUtils.INSETS_NONE));
	//   29   58:getstatic       #407 <Field Rect DrawableUtils.INSETS_NONE>
	//   30   61:astore          10
		Drawable drawable = mTrackDrawable;
	//   31   63:aload_0         
	//   32   64:getfield        #191 <Field Drawable mTrackDrawable>
	//   33   67:astore          12
		int i = l;
	//   34   69:iload           4
	//   35   71:istore_2        
		if(drawable != null)
	//*  36   72:aload           12
	//*  37   74:ifnull          284
		{
			drawable.getPadding(rect);
	//   38   77:aload           12
	//   39   79:aload           11
	//   40   81:invokevirtual   #400 <Method boolean Drawable.getPadding(Rect)>
	//   41   84:pop             
			int i2 = l + rect.left;
	//   42   85:iload           4
	//   43   87:aload           11
	//   44   89:getfield        #414 <Field int Rect.left>
	//   45   92:iadd            
	//   46   93:istore          9
			int l1;
			if(obj != null)
	//*  47   95:aload           10
	//*  48   97:ifnull          253
			{
				i = j;
	//   49  100:iload_3         
	//   50  101:istore_2        
				if(((Rect) (obj)).left > rect.left)
	//*  51  102:aload           10
	//*  52  104:getfield        #414 <Field int Rect.left>
	//*  53  107:aload           11
	//*  54  109:getfield        #414 <Field int Rect.left>
	//*  55  112:icmple          129
					i = j + (((Rect) (obj)).left - rect.left);
	//   56  115:iload_3         
	//   57  116:aload           10
	//   58  118:getfield        #414 <Field int Rect.left>
	//   59  121:aload           11
	//   60  123:getfield        #414 <Field int Rect.left>
	//   61  126:isub            
	//   62  127:iadd            
	//   63  128:istore_2        
				if(((Rect) (obj)).top > rect.top)
	//*  64  129:aload           10
	//*  65  131:getfield        #510 <Field int Rect.top>
	//*  66  134:aload           11
	//*  67  136:getfield        #510 <Field int Rect.top>
	//*  68  139:icmple          160
					j = (((Rect) (obj)).top - rect.top) + i1;
	//   69  142:aload           10
	//   70  144:getfield        #510 <Field int Rect.top>
	//   71  147:aload           11
	//   72  149:getfield        #510 <Field int Rect.top>
	//   73  152:isub            
	//   74  153:iload           5
	//   75  155:iadd            
	//   76  156:istore_3        
				else
	//*  77  157:goto            163
					j = i1;
	//   78  160:iload           5
	//   79  162:istore_3        
				l = k1;
	//   80  163:iload           7
	//   81  165:istore          4
				if(((Rect) (obj)).right > rect.right)
	//*  82  167:aload           10
	//*  83  169:getfield        #417 <Field int Rect.right>
	//*  84  172:aload           11
	//*  85  174:getfield        #417 <Field int Rect.right>
	//*  86  177:icmple          196
					l = k1 - (((Rect) (obj)).right - rect.right);
	//   87  180:iload           7
	//   88  182:aload           10
	//   89  184:getfield        #417 <Field int Rect.right>
	//   90  187:aload           11
	//   91  189:getfield        #417 <Field int Rect.right>
	//   92  192:isub            
	//   93  193:isub            
	//   94  194:istore          4
				if(((Rect) (obj)).bottom > rect.bottom)
	//*  95  196:aload           10
	//*  96  198:getfield        #513 <Field int Rect.bottom>
	//*  97  201:aload           11
	//*  98  203:getfield        #513 <Field int Rect.bottom>
	//*  99  206:icmple          237
				{
					l1 = j1 - (((Rect) (obj)).bottom - rect.bottom);
	//  100  209:iload           6
	//  101  211:aload           10
	//  102  213:getfield        #513 <Field int Rect.bottom>
	//  103  216:aload           11
	//  104  218:getfield        #513 <Field int Rect.bottom>
	//  105  221:isub            
	//  106  222:isub            
	//  107  223:istore          8
					k1 = i;
	//  108  225:iload_2         
	//  109  226:istore          7
					i = l1;
	//  110  228:iload           8
	//  111  230:istore_2        
					l1 = j;
	//  112  231:iload_3         
	//  113  232:istore          8
				} else
	//* 114  234:goto            267
				{
					l1 = j1;
	//  115  237:iload           6
	//  116  239:istore          8
					k1 = i;
	//  117  241:iload_2         
	//  118  242:istore          7
					i = l1;
	//  119  244:iload           8
	//  120  246:istore_2        
					l1 = j;
	//  121  247:iload_3         
	//  122  248:istore          8
				}
			} else
	//* 123  250:goto            267
			{
				l1 = i1;
	//  124  253:iload           5
	//  125  255:istore          8
				i = j1;
	//  126  257:iload           6
	//  127  259:istore_2        
				l = k1;
	//  128  260:iload           7
	//  129  262:istore          4
				k1 = j;
	//  130  264:iload_3         
	//  131  265:istore          7
			}
			mTrackDrawable.setBounds(k1, l1, l, i);
	//  132  267:aload_0         
	//  133  268:getfield        #191 <Field Drawable mTrackDrawable>
	//  134  271:iload           7
	//  135  273:iload           8
	//  136  275:iload           4
	//  137  277:iload_2         
	//  138  278:invokevirtual   #517 <Method void Drawable.setBounds(int, int, int, int)>
			i = i2;
	//  139  281:iload           9
	//  140  283:istore_2        
		}
		obj = ((Object) (mThumbDrawable));
	//  141  284:aload_0         
	//  142  285:getfield        #180 <Field Drawable mThumbDrawable>
	//  143  288:astore          10
		if(obj != null)
	//* 144  290:aload           10
	//* 145  292:ifnull          359
		{
			((Drawable) (obj)).getPadding(rect);
	//  146  295:aload           10
	//  147  297:aload           11
	//  148  299:invokevirtual   #400 <Method boolean Drawable.getPadding(Rect)>
	//  149  302:pop             
			int k = i - rect.left;
	//  150  303:iload_2         
	//  151  304:aload           11
	//  152  306:getfield        #414 <Field int Rect.left>
	//  153  309:isub            
	//  154  310:istore_3        
			i = i + mThumbWidth + rect.right;
	//  155  311:iload_2         
	//  156  312:aload_0         
	//  157  313:getfield        #411 <Field int mThumbWidth>
	//  158  316:iadd            
	//  159  317:aload           11
	//  160  319:getfield        #417 <Field int Rect.right>
	//  161  322:iadd            
	//  162  323:istore_2        
			mThumbDrawable.setBounds(k, i1, i, j1);
	//  163  324:aload_0         
	//  164  325:getfield        #180 <Field Drawable mThumbDrawable>
	//  165  328:iload_3         
	//  166  329:iload           5
	//  167  331:iload_2         
	//  168  332:iload           6
	//  169  334:invokevirtual   #517 <Method void Drawable.setBounds(int, int, int, int)>
			obj = ((Object) (getBackground()));
	//  170  337:aload_0         
	//  171  338:invokevirtual   #520 <Method Drawable getBackground()>
	//  172  341:astore          10
			if(obj != null)
	//* 173  343:aload           10
	//* 174  345:ifnull          359
				DrawableCompat.setHotspotBounds(((Drawable) (obj)), k, i1, i, j1);
	//  175  348:aload           10
	//  176  350:iload_3         
	//  177  351:iload           5
	//  178  353:iload_2         
	//  179  354:iload           6
	//  180  356:invokestatic    #524 <Method void DrawableCompat.setHotspotBounds(Drawable, int, int, int, int)>
		}
		super.draw(canvas);
	//  181  359:aload_0         
	//  182  360:aload_1         
	//  183  361:invokespecial   #526 <Method void CompoundButton.draw(Canvas)>
	//  184  364:return          
	}

	public void drawableHotspotChanged(float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #330 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			super.drawableHotspotChanged(f, f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:invokespecial   #530 <Method void CompoundButton.drawableHotspotChanged(float, float)>
		Drawable drawable = mThumbDrawable;
	//    7   14:aload_0         
	//    8   15:getfield        #180 <Field Drawable mThumbDrawable>
	//    9   18:astore_3        
		if(drawable != null)
	//*  10   19:aload_3         
	//*  11   20:ifnull          29
			DrawableCompat.setHotspot(drawable, f, f1);
	//   12   23:aload_3         
	//   13   24:fload_1         
	//   14   25:fload_2         
	//   15   26:invokestatic    #534 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
		drawable = mTrackDrawable;
	//   16   29:aload_0         
	//   17   30:getfield        #191 <Field Drawable mTrackDrawable>
	//   18   33:astore_3        
		if(drawable != null)
	//*  19   34:aload_3         
	//*  20   35:ifnull          44
			DrawableCompat.setHotspot(drawable, f, f1);
	//   21   38:aload_3         
	//   22   39:fload_1         
	//   23   40:fload_2         
	//   24   41:invokestatic    #534 <Method void DrawableCompat.setHotspot(Drawable, float, float)>
	//   25   44:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #537 <Method void CompoundButton.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #357 <Method int[] getDrawableState()>
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
	//*  17   28:invokevirtual   #353 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #361 <Method boolean Drawable.setState(int[])>
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
	//*  35   60:invokevirtual   #353 <Method boolean Drawable.isStateful()>
	//*  36   63:ifeq            75
				flag1 = flag | drawable.setState(ai);
	//   37   66:iload_1         
	//   38   67:aload           4
	//   39   69:aload_3         
	//   40   70:invokevirtual   #361 <Method boolean Drawable.setState(int[])>
	//   41   73:ior             
	//   42   74:istore_2        
		}
		if(flag1)
	//*  43   75:iload_2         
	//*  44   76:ifeq            83
			invalidate();
	//   45   79:aload_0         
	//   46   80:invokevirtual   #540 <Method void invalidate()>
	//   47   83:return          
	}

	public int getCompoundPaddingLeft()
	{
		if(!ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #393 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifne            12
			return super.getCompoundPaddingLeft();
	//    3    7:aload_0         
	//    4    8:invokespecial   #543 <Method int CompoundButton.getCompoundPaddingLeft()>
	//    5   11:ireturn         
		int j = super.getCompoundPaddingLeft() + mSwitchWidth;
	//    6   12:aload_0         
	//    7   13:invokespecial   #543 <Method int CompoundButton.getCompoundPaddingLeft()>
	//    8   16:aload_0         
	//    9   17:getfield        #409 <Field int mSwitchWidth>
	//   10   20:iadd            
	//   11   21:istore_2        
		int i = j;
	//   12   22:iload_2         
	//   13   23:istore_1        
		if(!TextUtils.isEmpty(getText()))
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #546 <Method CharSequence getText()>
	//*  16   28:invokestatic    #552 <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//*   1    1:invokestatic    #393 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*   2    4:ifeq            12
			return super.getCompoundPaddingRight();
	//    3    7:aload_0         
	//    4    8:invokespecial   #555 <Method int CompoundButton.getCompoundPaddingRight()>
	//    5   11:ireturn         
		int j = super.getCompoundPaddingRight() + mSwitchWidth;
	//    6   12:aload_0         
	//    7   13:invokespecial   #555 <Method int CompoundButton.getCompoundPaddingRight()>
	//    8   16:aload_0         
	//    9   17:getfield        #409 <Field int mSwitchWidth>
	//   10   20:iadd            
	//   11   21:istore_2        
		int i = j;
	//   12   22:iload_2         
	//   13   23:istore_1        
		if(!TextUtils.isEmpty(getText()))
	//*  14   24:aload_0         
	//*  15   25:invokevirtual   #546 <Method CharSequence getText()>
	//*  16   28:invokestatic    #552 <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//    1    1:invokespecial   #575 <Method void CompoundButton.jumpDrawablesToCurrentState()>
		Object obj = ((Object) (mThumbDrawable));
	//    2    4:aload_0         
	//    3    5:getfield        #180 <Field Drawable mThumbDrawable>
	//    4    8:astore_1        
		if(obj != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			((Drawable) (obj)).jumpToCurrentState();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #578 <Method void Drawable.jumpToCurrentState()>
		obj = ((Object) (mTrackDrawable));
	//    9   17:aload_0         
	//   10   18:getfield        #191 <Field Drawable mTrackDrawable>
	//   11   21:astore_1        
		if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          30
			((Drawable) (obj)).jumpToCurrentState();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #578 <Method void Drawable.jumpToCurrentState()>
		obj = ((Object) (mPositionAnimator));
	//   16   30:aload_0         
	//   17   31:getfield        #319 <Field ObjectAnimator mPositionAnimator>
	//   18   34:astore_1        
		if(obj != null && ((ObjectAnimator) (obj)).isStarted())
	//*  19   35:aload_1         
	//*  20   36:ifnull          58
	//*  21   39:aload_1         
	//*  22   40:invokevirtual   #581 <Method boolean ObjectAnimator.isStarted()>
	//*  23   43:ifeq            58
		{
			mPositionAnimator.end();
	//   24   46:aload_0         
	//   25   47:getfield        #319 <Field ObjectAnimator mPositionAnimator>
	//   26   50:invokevirtual   #584 <Method void ObjectAnimator.end()>
			mPositionAnimator = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #319 <Field ObjectAnimator mPositionAnimator>
		}
	//   30   58:return          
	}

	protected int[] onCreateDrawableState(int i)
	{
		int ai[] = super.onCreateDrawableState(i + 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:invokespecial   #588 <Method int[] CompoundButton.onCreateDrawableState(int)>
	//    5    7:astore_2        
		if(isChecked())
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #306 <Method boolean isChecked()>
	//*   8   12:ifeq            23
			mergeDrawableStates(ai, CHECKED_STATE_SET);
	//    9   15:aload_2         
	//   10   16:getstatic       #93  <Field int[] CHECKED_STATE_SET>
	//   11   19:invokestatic    #592 <Method int[] mergeDrawableStates(int[], int[])>
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
	//    2    2:invokespecial   #595 <Method void CompoundButton.onDraw(Canvas)>
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
	//   13   26:invokevirtual   #400 <Method boolean Drawable.getPadding(Rect)>
	//   14   29:pop             
		else
	//*  15   30:goto            38
			((Rect) (obj)).setEmpty();
	//   16   33:aload           9
	//   17   35:invokevirtual   #598 <Method void Rect.setEmpty()>
		int l = mSwitchTop;
	//   18   38:aload_0         
	//   19   39:getfield        #423 <Field int mSwitchTop>
	//   20   42:istore          4
		int i1 = mSwitchBottom;
	//   21   44:aload_0         
	//   22   45:getfield        #427 <Field int mSwitchBottom>
	//   23   48:istore          5
		int j1 = ((Rect) (obj)).top;
	//   24   50:aload           9
	//   25   52:getfield        #510 <Field int Rect.top>
	//   26   55:istore          6
		int k1 = ((Rect) (obj)).bottom;
	//   27   57:aload           9
	//   28   59:getfield        #513 <Field int Rect.bottom>
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
	//   41   89:invokestatic    #404 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   42   92:astore          12
				((Drawable) (obj1)).copyBounds(((Rect) (obj)));
	//   43   94:aload           10
	//   44   96:aload           9
	//   45   98:invokevirtual   #602 <Method void Drawable.copyBounds(Rect)>
				obj.left = ((Rect) (obj)).left + rect.left;
	//   46  101:aload           9
	//   47  103:aload           9
	//   48  105:getfield        #414 <Field int Rect.left>
	//   49  108:aload           12
	//   50  110:getfield        #414 <Field int Rect.left>
	//   51  113:iadd            
	//   52  114:putfield        #414 <Field int Rect.left>
				obj.right = ((Rect) (obj)).right - rect.right;
	//   53  117:aload           9
	//   54  119:aload           9
	//   55  121:getfield        #417 <Field int Rect.right>
	//   56  124:aload           12
	//   57  126:getfield        #417 <Field int Rect.right>
	//   58  129:isub            
	//   59  130:putfield        #417 <Field int Rect.right>
				int i = canvas.save();
	//   60  133:aload_1         
	//   61  134:invokevirtual   #607 <Method int Canvas.save()>
	//   62  137:istore_2        
				canvas.clipRect(((Rect) (obj)), android.graphics.Region.Op.DIFFERENCE);
	//   63  138:aload_1         
	//   64  139:aload           9
	//   65  141:getstatic       #613 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   66  144:invokevirtual   #617 <Method boolean Canvas.clipRect(Rect, android.graphics.Region$Op)>
	//   67  147:pop             
				drawable.draw(canvas);
	//   68  148:aload           11
	//   69  150:aload_1         
	//   70  151:invokevirtual   #618 <Method void Drawable.draw(Canvas)>
				canvas.restoreToCount(i);
	//   71  154:aload_1         
	//   72  155:iload_2         
	//   73  156:invokevirtual   #621 <Method void Canvas.restoreToCount(int)>
			} else
	//*  74  159:goto            168
			{
				drawable.draw(canvas);
	//   75  162:aload           11
	//   76  164:aload_1         
	//   77  165:invokevirtual   #618 <Method void Drawable.draw(Canvas)>
			}
		int k = canvas.save();
	//   78  168:aload_1         
	//   79  169:invokevirtual   #607 <Method int Canvas.save()>
	//   80  172:istore_3        
		if(obj1 != null)
	//*  81  173:aload           10
	//*  82  175:ifnull          184
			((Drawable) (obj1)).draw(canvas);
	//   83  178:aload           10
	//   84  180:aload_1         
	//   85  181:invokevirtual   #618 <Method void Drawable.draw(Canvas)>
		if(getTargetCheckedState())
	//*  86  184:aload_0         
	//*  87  185:invokespecial   #498 <Method boolean getTargetCheckedState()>
	//*  88  188:ifeq            200
			obj = ((Object) (mOnLayout));
	//   89  191:aload_0         
	//   90  192:getfield        #623 <Field Layout mOnLayout>
	//   91  195:astore          9
		else
	//*  92  197:goto            206
			obj = ((Object) (mOffLayout));
	//   93  200:aload_0         
	//   94  201:getfield        #625 <Field Layout mOffLayout>
	//   95  204:astore          9
		if(obj != null)
	//*  96  206:aload           9
	//*  97  208:ifnull          342
		{
			int ai[] = getDrawableState();
	//   98  211:aload_0         
	//   99  212:invokevirtual   #357 <Method int[] getDrawableState()>
	//  100  215:astore          11
			ColorStateList colorstatelist = mTextColors;
	//  101  217:aload_0         
	//  102  218:getfield        #627 <Field ColorStateList mTextColors>
	//  103  221:astore          12
			if(colorstatelist != null)
	//* 104  223:aload           12
	//* 105  225:ifnull          243
				mTextPaint.setColor(colorstatelist.getColorForState(ai, 0));
	//  106  228:aload_0         
	//  107  229:getfield        #144 <Field TextPaint mTextPaint>
	//  108  232:aload           12
	//  109  234:aload           11
	//  110  236:iconst_0        
	//  111  237:invokevirtual   #633 <Method int ColorStateList.getColorForState(int[], int)>
	//  112  240:invokevirtual   #636 <Method void TextPaint.setColor(int)>
			mTextPaint.drawableState = ai;
	//  113  243:aload_0         
	//  114  244:getfield        #144 <Field TextPaint mTextPaint>
	//  115  247:aload           11
	//  116  249:putfield        #639 <Field int[] TextPaint.drawableState>
			int j;
			if(obj1 != null)
	//* 117  252:aload           10
	//* 118  254:ifnull          279
			{
				obj1 = ((Object) (((Drawable) (obj1)).getBounds()));
	//  119  257:aload           10
	//  120  259:invokevirtual   #643 <Method Rect Drawable.getBounds()>
	//  121  262:astore          10
				j = ((Rect) (obj1)).left + ((Rect) (obj1)).right;
	//  122  264:aload           10
	//  123  266:getfield        #414 <Field int Rect.left>
	//  124  269:aload           10
	//  125  271:getfield        #417 <Field int Rect.right>
	//  126  274:iadd            
	//  127  275:istore_2        
			} else
	//* 128  276:goto            284
			{
				j = getWidth();
	//  129  279:aload_0         
	//  130  280:invokevirtual   #646 <Method int getWidth()>
	//  131  283:istore_2        
			}
			j /= 2;
	//  132  284:iload_2         
	//  133  285:iconst_2        
	//  134  286:idiv            
	//  135  287:istore_2        
			int l1 = ((Layout) (obj)).getWidth() / 2;
	//  136  288:aload           9
	//  137  290:invokevirtual   #647 <Method int Layout.getWidth()>
	//  138  293:iconst_2        
	//  139  294:idiv            
	//  140  295:istore          8
			l = (l + j1 + (i1 - k1)) / 2;
	//  141  297:iload           4
	//  142  299:iload           6
	//  143  301:iadd            
	//  144  302:iload           5
	//  145  304:iload           7
	//  146  306:isub            
	//  147  307:iadd            
	//  148  308:iconst_2        
	//  149  309:idiv            
	//  150  310:istore          4
			i1 = ((Layout) (obj)).getHeight() / 2;
	//  151  312:aload           9
	//  152  314:invokevirtual   #650 <Method int Layout.getHeight()>
	//  153  317:iconst_2        
	//  154  318:idiv            
	//  155  319:istore          5
			canvas.translate(j - l1, l - i1);
	//  156  321:aload_1         
	//  157  322:iload_2         
	//  158  323:iload           8
	//  159  325:isub            
	//  160  326:i2f             
	//  161  327:iload           4
	//  162  329:iload           5
	//  163  331:isub            
	//  164  332:i2f             
	//  165  333:invokevirtual   #653 <Method void Canvas.translate(float, float)>
			((Layout) (obj)).draw(canvas);
	//  166  336:aload           9
	//  167  338:aload_1         
	//  168  339:invokevirtual   #654 <Method void Layout.draw(Canvas)>
		}
		canvas.restoreToCount(k);
	//  169  342:aload_1         
	//  170  343:iload_3         
	//  171  344:invokevirtual   #621 <Method void Canvas.restoreToCount(int)>
	//  172  347:return          
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #658 <Method void CompoundButton.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName("android.widget.Switch");
	//    3    5:aload_1         
	//    4    6:ldc1            #10  <String "android.widget.Switch">
	//    5    8:invokevirtual   #664 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    6   11:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #668 <Method void CompoundButton.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName("android.widget.Switch");
	//    3    5:aload_1         
	//    4    6:ldc1            #10  <String "android.widget.Switch">
	//    5    8:invokevirtual   #671 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
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
	//*  17   32:invokestatic    #552 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   35:ifne            93
		{
			CharSequence charsequence1 = accessibilitynodeinfo.getText();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #672 <Method CharSequence AccessibilityNodeInfo.getText()>
	//   21   42:astore_3        
			if(TextUtils.isEmpty(charsequence1))
	//*  22   43:aload_3         
	//*  23   44:invokestatic    #552 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  24   47:ifeq            56
			{
				accessibilitynodeinfo.setText(charsequence);
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:invokevirtual   #675 <Method void AccessibilityNodeInfo.setText(CharSequence)>
				return;
	//   28   55:return          
			}
			StringBuilder stringbuilder = new StringBuilder();
	//   29   56:new             #677 <Class StringBuilder>
	//   30   59:dup             
	//   31   60:invokespecial   #678 <Method void StringBuilder()>
	//   32   63:astore          4
			stringbuilder.append(charsequence1);
	//   33   65:aload           4
	//   34   67:aload_3         
	//   35   68:invokevirtual   #682 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   36   71:pop             
			stringbuilder.append(' ');
	//   37   72:aload           4
	//   38   74:bipush          32
	//   39   76:invokevirtual   #685 <Method StringBuilder StringBuilder.append(char)>
	//   40   79:pop             
			stringbuilder.append(charsequence);
	//   41   80:aload           4
	//   42   82:aload_2         
	//   43   83:invokevirtual   #682 <Method StringBuilder StringBuilder.append(CharSequence)>
	//   44   86:pop             
			accessibilitynodeinfo.setText(((CharSequence) (stringbuilder)));
	//   45   87:aload_1         
	//   46   88:aload           4
	//   47   90:invokevirtual   #675 <Method void AccessibilityNodeInfo.setText(CharSequence)>
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
	//    6    8:invokespecial   #689 <Method void CompoundButton.onLayout(boolean, int, int, int, int)>
		Drawable drawable = mThumbDrawable;
	//    7   11:aload_0         
	//    8   12:getfield        #180 <Field Drawable mThumbDrawable>
	//    9   15:astore          6
		i = 0;
	//   10   17:iconst_0        
	//   11   18:istore_2        
		if(drawable != null)
	//*  12   19:aload           6
	//*  13   21:ifnull          101
		{
			Rect rect = mTempRect;
	//   14   24:aload_0         
	//   15   25:getfield        #137 <Field Rect mTempRect>
	//   16   28:astore          6
			Object obj = ((Object) (mTrackDrawable));
	//   17   30:aload_0         
	//   18   31:getfield        #191 <Field Drawable mTrackDrawable>
	//   19   34:astore          7
			if(obj != null)
	//*  20   36:aload           7
	//*  21   38:ifnull          52
				((Drawable) (obj)).getPadding(rect);
	//   22   41:aload           7
	//   23   43:aload           6
	//   24   45:invokevirtual   #400 <Method boolean Drawable.getPadding(Rect)>
	//   25   48:pop             
			else
	//*  26   49:goto            57
				rect.setEmpty();
	//   27   52:aload           6
	//   28   54:invokevirtual   #598 <Method void Rect.setEmpty()>
			obj = ((Object) (DrawableUtils.getOpticalBounds(mThumbDrawable)));
	//   29   57:aload_0         
	//   30   58:getfield        #180 <Field Drawable mThumbDrawable>
	//   31   61:invokestatic    #404 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//   32   64:astore          7
			j = Math.max(0, ((Rect) (obj)).left - rect.left);
	//   33   66:iconst_0        
	//   34   67:aload           7
	//   35   69:getfield        #414 <Field int Rect.left>
	//   36   72:aload           6
	//   37   74:getfield        #414 <Field int Rect.left>
	//   38   77:isub            
	//   39   78:invokestatic    #692 <Method int Math.max(int, int)>
	//   40   81:istore_3        
			i = Math.max(0, ((Rect) (obj)).right - rect.right);
	//   41   82:iconst_0        
	//   42   83:aload           7
	//   43   85:getfield        #417 <Field int Rect.right>
	//   44   88:aload           6
	//   45   90:getfield        #417 <Field int Rect.right>
	//   46   93:isub            
	//   47   94:invokestatic    #692 <Method int Math.max(int, int)>
	//   48   97:istore_2        
		} else
	//*  49   98:goto            103
		{
			j = 0;
	//   50  101:iconst_0        
	//   51  102:istore_3        
		}
		if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*  52  103:aload_0         
	//*  53  104:invokestatic    #393 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  54  107:ifeq            134
		{
			k = getPaddingLeft() + j;
	//   55  110:aload_0         
	//   56  111:invokevirtual   #695 <Method int getPaddingLeft()>
	//   57  114:iload_3         
	//   58  115:iadd            
	//   59  116:istore          4
			l = (mSwitchWidth + k) - j - i;
	//   60  118:aload_0         
	//   61  119:getfield        #409 <Field int mSwitchWidth>
	//   62  122:iload           4
	//   63  124:iadd            
	//   64  125:iload_3         
	//   65  126:isub            
	//   66  127:iload_2         
	//   67  128:isub            
	//   68  129:istore          5
		} else
	//*  69  131:goto            160
		{
			l = getWidth() - getPaddingRight() - i;
	//   70  134:aload_0         
	//   71  135:invokevirtual   #646 <Method int getWidth()>
	//   72  138:aload_0         
	//   73  139:invokevirtual   #698 <Method int getPaddingRight()>
	//   74  142:isub            
	//   75  143:iload_2         
	//   76  144:isub            
	//   77  145:istore          5
			k = (l - mSwitchWidth) + j + i;
	//   78  147:iload           5
	//   79  149:aload_0         
	//   80  150:getfield        #409 <Field int mSwitchWidth>
	//   81  153:isub            
	//   82  154:iload_3         
	//   83  155:iadd            
	//   84  156:iload_2         
	//   85  157:iadd            
	//   86  158:istore          4
		}
		i = getGravity() & 0x70;
	//   87  160:aload_0         
	//   88  161:invokevirtual   #701 <Method int getGravity()>
	//   89  164:bipush          112
	//   90  166:iand            
	//   91  167:istore_2        
		if(i != 16)
	//*  92  168:iload_2         
	//*  93  169:bipush          16
	//*  94  171:icmpeq          215
		{
			if(i != 80)
	//*  95  174:iload_2         
	//*  96  175:bipush          80
	//*  97  177:icmpeq          195
			{
				i = getPaddingTop();
	//   98  180:aload_0         
	//   99  181:invokevirtual   #704 <Method int getPaddingTop()>
	//  100  184:istore_2        
				j = mSwitchHeight + i;
	//  101  185:aload_0         
	//  102  186:getfield        #706 <Field int mSwitchHeight>
	//  103  189:iload_2         
	//  104  190:iadd            
	//  105  191:istore_3        
			} else
	//* 106  192:goto            247
			{
				j = getHeight() - getPaddingBottom();
	//  107  195:aload_0         
	//  108  196:invokevirtual   #707 <Method int getHeight()>
	//  109  199:aload_0         
	//  110  200:invokevirtual   #710 <Method int getPaddingBottom()>
	//  111  203:isub            
	//  112  204:istore_3        
				i = j - mSwitchHeight;
	//  113  205:iload_3         
	//  114  206:aload_0         
	//  115  207:getfield        #706 <Field int mSwitchHeight>
	//  116  210:isub            
	//  117  211:istore_2        
			}
		} else
	//* 118  212:goto            247
		{
			i = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
	//  119  215:aload_0         
	//  120  216:invokevirtual   #704 <Method int getPaddingTop()>
	//  121  219:aload_0         
	//  122  220:invokevirtual   #707 <Method int getHeight()>
	//  123  223:iadd            
	//  124  224:aload_0         
	//  125  225:invokevirtual   #710 <Method int getPaddingBottom()>
	//  126  228:isub            
	//  127  229:iconst_2        
	//  128  230:idiv            
	//  129  231:istore_2        
			j = mSwitchHeight;
	//  130  232:aload_0         
	//  131  233:getfield        #706 <Field int mSwitchHeight>
	//  132  236:istore_3        
			i -= j / 2;
	//  133  237:iload_2         
	//  134  238:iload_3         
	//  135  239:iconst_2        
	//  136  240:idiv            
	//  137  241:isub            
	//  138  242:istore_2        
			j += i;
	//  139  243:iload_3         
	//  140  244:iload_2         
	//  141  245:iadd            
	//  142  246:istore_3        
		}
		mSwitchLeft = k;
	//  143  247:aload_0         
	//  144  248:iload           4
	//  145  250:putfield        #425 <Field int mSwitchLeft>
		mSwitchTop = i;
	//  146  253:aload_0         
	//  147  254:iload_2         
	//  148  255:putfield        #423 <Field int mSwitchTop>
		mSwitchBottom = j;
	//  149  258:aload_0         
	//  150  259:iload_3         
	//  151  260:putfield        #427 <Field int mSwitchBottom>
		mSwitchRight = l;
	//  152  263:aload_0         
	//  153  264:iload           5
	//  154  266:putfield        #507 <Field int mSwitchRight>
	//  155  269:return          
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
	//*   4    8:getfield        #623 <Field Layout mOnLayout>
	//*   5   11:ifnonnull       26
				mOnLayout = makeLayout(mTextOn);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #200 <Field CharSequence mTextOn>
	//   10   20:invokespecial   #713 <Method Layout makeLayout(CharSequence)>
	//   11   23:putfield        #623 <Field Layout mOnLayout>
			if(mOffLayout == null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #625 <Field Layout mOffLayout>
	//*  14   30:ifnonnull       45
				mOffLayout = makeLayout(mTextOff);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:aload_0         
	//   18   36:getfield        #205 <Field CharSequence mTextOff>
	//   19   39:invokespecial   #713 <Method Layout makeLayout(CharSequence)>
	//   20   42:putfield        #625 <Field Layout mOffLayout>
		}
		Object obj = ((Object) (mTempRect));
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
	//*  30   62:ifnull          105
		{
			drawable.getPadding(((Rect) (obj)));
	//   31   65:aload           10
	//   32   67:aload           9
	//   33   69:invokevirtual   #400 <Method boolean Drawable.getPadding(Rect)>
	//   34   72:pop             
			l = mThumbDrawable.getIntrinsicWidth() - ((Rect) (obj)).left - ((Rect) (obj)).right;
	//   35   73:aload_0         
	//   36   74:getfield        #180 <Field Drawable mThumbDrawable>
	//   37   77:invokevirtual   #716 <Method int Drawable.getIntrinsicWidth()>
	//   38   80:aload           9
	//   39   82:getfield        #414 <Field int Rect.left>
	//   40   85:isub            
	//   41   86:aload           9
	//   42   88:getfield        #417 <Field int Rect.right>
	//   43   91:isub            
	//   44   92:istore          4
			k = mThumbDrawable.getIntrinsicHeight();
	//   45   94:aload_0         
	//   46   95:getfield        #180 <Field Drawable mThumbDrawable>
	//   47   98:invokevirtual   #719 <Method int Drawable.getIntrinsicHeight()>
	//   48  101:istore_3        
		} else
	//*  49  102:goto            111
		{
			l = 0;
	//   50  105:iconst_0        
	//   51  106:istore          4
			k = l;
	//   52  108:iload           4
	//   53  110:istore_3        
		}
		int i1;
		if(mShowText)
	//*  54  111:aload_0         
	//*  55  112:getfield        #214 <Field boolean mShowText>
	//*  56  115:ifeq            147
			i1 = Math.max(mOnLayout.getWidth(), mOffLayout.getWidth()) + mThumbTextPadding * 2;
	//   57  118:aload_0         
	//   58  119:getfield        #623 <Field Layout mOnLayout>
	//   59  122:invokevirtual   #647 <Method int Layout.getWidth()>
	//   60  125:aload_0         
	//   61  126:getfield        #625 <Field Layout mOffLayout>
	//   62  129:invokevirtual   #647 <Method int Layout.getWidth()>
	//   63  132:invokestatic    #692 <Method int Math.max(int, int)>
	//   64  135:aload_0         
	//   65  136:getfield        #223 <Field int mThumbTextPadding>
	//   66  139:iconst_2        
	//   67  140:imul            
	//   68  141:iadd            
	//   69  142:istore          5
		else
	//*  70  144:goto            150
			i1 = 0;
	//   71  147:iconst_0        
	//   72  148:istore          5
		mThumbWidth = Math.max(i1, l);
	//   73  150:aload_0         
	//   74  151:iload           5
	//   75  153:iload           4
	//   76  155:invokestatic    #692 <Method int Math.max(int, int)>
	//   77  158:putfield        #411 <Field int mThumbWidth>
		drawable = mTrackDrawable;
	//   78  161:aload_0         
	//   79  162:getfield        #191 <Field Drawable mTrackDrawable>
	//   80  165:astore          10
		if(drawable != null)
	//*  81  167:aload           10
	//*  82  169:ifnull          192
		{
			drawable.getPadding(((Rect) (obj)));
	//   83  172:aload           10
	//   84  174:aload           9
	//   85  176:invokevirtual   #400 <Method boolean Drawable.getPadding(Rect)>
	//   86  179:pop             
			l = mTrackDrawable.getIntrinsicHeight();
	//   87  180:aload_0         
	//   88  181:getfield        #191 <Field Drawable mTrackDrawable>
	//   89  184:invokevirtual   #719 <Method int Drawable.getIntrinsicHeight()>
	//   90  187:istore          4
		} else
	//*  91  189:goto            201
		{
			((Rect) (obj)).setEmpty();
	//   92  192:aload           9
	//   93  194:invokevirtual   #598 <Method void Rect.setEmpty()>
			l = j1;
	//   94  197:iload           6
	//   95  199:istore          4
		}
		int l1 = ((Rect) (obj)).left;
	//   96  201:aload           9
	//   97  203:getfield        #414 <Field int Rect.left>
	//   98  206:istore          8
		int k1 = ((Rect) (obj)).right;
	//   99  208:aload           9
	//  100  210:getfield        #417 <Field int Rect.right>
	//  101  213:istore          7
		obj = ((Object) (mThumbDrawable));
	//  102  215:aload_0         
	//  103  216:getfield        #180 <Field Drawable mThumbDrawable>
	//  104  219:astore          9
		j1 = k1;
	//  105  221:iload           7
	//  106  223:istore          6
		i1 = l1;
	//  107  225:iload           8
	//  108  227:istore          5
		if(obj != null)
	//* 109  229:aload           9
	//* 110  231:ifnull          265
		{
			obj = ((Object) (DrawableUtils.getOpticalBounds(((Drawable) (obj)))));
	//  111  234:aload           9
	//  112  236:invokestatic    #404 <Method Rect DrawableUtils.getOpticalBounds(Drawable)>
	//  113  239:astore          9
			i1 = Math.max(l1, ((Rect) (obj)).left);
	//  114  241:iload           8
	//  115  243:aload           9
	//  116  245:getfield        #414 <Field int Rect.left>
	//  117  248:invokestatic    #692 <Method int Math.max(int, int)>
	//  118  251:istore          5
			j1 = Math.max(k1, ((Rect) (obj)).right);
	//  119  253:iload           7
	//  120  255:aload           9
	//  121  257:getfield        #417 <Field int Rect.right>
	//  122  260:invokestatic    #692 <Method int Math.max(int, int)>
	//  123  263:istore          6
		}
		i1 = Math.max(mSwitchMinWidth, mThumbWidth * 2 + i1 + j1);
	//  124  265:aload_0         
	//  125  266:getfield        #228 <Field int mSwitchMinWidth>
	//  126  269:aload_0         
	//  127  270:getfield        #411 <Field int mThumbWidth>
	//  128  273:iconst_2        
	//  129  274:imul            
	//  130  275:iload           5
	//  131  277:iadd            
	//  132  278:iload           6
	//  133  280:iadd            
	//  134  281:invokestatic    #692 <Method int Math.max(int, int)>
	//  135  284:istore          5
		k = Math.max(l, k);
	//  136  286:iload           4
	//  137  288:iload_3         
	//  138  289:invokestatic    #692 <Method int Math.max(int, int)>
	//  139  292:istore_3        
		mSwitchWidth = i1;
	//  140  293:aload_0         
	//  141  294:iload           5
	//  142  296:putfield        #409 <Field int mSwitchWidth>
		mSwitchHeight = k;
	//  143  299:aload_0         
	//  144  300:iload_3         
	//  145  301:putfield        #706 <Field int mSwitchHeight>
		super.onMeasure(i, j);
	//  146  304:aload_0         
	//  147  305:iload_1         
	//  148  306:iload_2         
	//  149  307:invokespecial   #721 <Method void CompoundButton.onMeasure(int, int)>
		if(getMeasuredHeight() < k)
	//* 150  310:aload_0         
	//* 151  311:invokevirtual   #724 <Method int getMeasuredHeight()>
	//* 152  314:iload_3         
	//* 153  315:icmpge          327
			setMeasuredDimension(getMeasuredWidthAndState(), k);
	//  154  318:aload_0         
	//  155  319:aload_0         
	//  156  320:invokevirtual   #727 <Method int getMeasuredWidthAndState()>
	//  157  323:iload_3         
	//  158  324:invokevirtual   #730 <Method void setMeasuredDimension(int, int)>
	//  159  327:return          
	}

	public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onPopulateAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #733 <Method void CompoundButton.onPopulateAccessibilityEvent(AccessibilityEvent)>
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
	//   16   30:invokevirtual   #736 <Method List AccessibilityEvent.getText()>
	//   17   33:aload_2         
	//   18   34:invokeinterface #742 <Method boolean List.add(Object)>
	//   19   39:pop             
	//   20   40:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		mVelocityTracker.addMovement(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field VelocityTracker mVelocityTracker>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #745 <Method void VelocityTracker.addMovement(MotionEvent)>
		switch(motionevent.getActionMasked())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #748 <Method int MotionEvent.getActionMasked()>
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
	//*   9   48:getfield        #479 <Field int mTouchMode>
			{
	//*  10   51:tableswitch     0 2: default 76
	//	               0 324
	//	               1 174
	//	               2 79
	//*  11   76:goto            324
			case 2: // '\002'
				float f6 = motionevent.getX();
	//   12   79:aload_1         
	//   13   80:invokevirtual   #751 <Method float MotionEvent.getX()>
	//   14   83:fstore          4
				int i = getThumbScrollRange();
	//   15   85:aload_0         
	//   16   86:invokespecial   #396 <Method int getThumbScrollRange()>
	//   17   89:istore          5
				float f = f6 - mTouchX;
	//   18   91:fload           4
	//   19   93:aload_0         
	//   20   94:getfield        #753 <Field float mTouchX>
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
	//   38  124:ldc2            #754 <Float -1F>
	//   39  127:fstore_2        
				float f3 = f;
	//   40  128:fload_2         
	//   41  129:fstore_3        
				if(ViewUtils.isLayoutRtl(((android.view.View) (this))))
	//*  42  130:aload_0         
	//*  43  131:invokestatic    #393 <Method boolean ViewUtils.isLayoutRtl(android.view.View)>
	//*  44  134:ifeq            140
					f3 = -f;
	//   45  137:fload_2         
	//   46  138:fneg            
	//   47  139:fstore_3        
				f = constrain(mThumbPosition + f3, 0.0F, 1.0F);
	//   48  140:aload_0         
	//   49  141:getfield        #385 <Field float mThumbPosition>
	//   50  144:fload_3         
	//   51  145:fadd            
	//   52  146:fconst_0        
	//   53  147:fconst_1        
	//   54  148:invokestatic    #756 <Method float constrain(float, float, float)>
	//   55  151:fstore_2        
				if(f != mThumbPosition)
	//*  56  152:fload_2         
	//*  57  153:aload_0         
	//*  58  154:getfield        #385 <Field float mThumbPosition>
	//*  59  157:fcmpl           
	//*  60  158:ifeq            172
				{
					mTouchX = f6;
	//   61  161:aload_0         
	//   62  162:fload           4
	//   63  164:putfield        #753 <Field float mTouchX>
					setThumbPosition(f);
	//   64  167:aload_0         
	//   65  168:fload_2         
	//   66  169:invokevirtual   #760 <Method void setThumbPosition(float)>
				}
				return true;
	//   67  172:iconst_1        
	//   68  173:ireturn         

			case 1: // '\001'
				float f1 = motionevent.getX();
	//   69  174:aload_1         
	//   70  175:invokevirtual   #751 <Method float MotionEvent.getX()>
	//   71  178:fstore_2        
				float f4 = motionevent.getY();
	//   72  179:aload_1         
	//   73  180:invokevirtual   #763 <Method float MotionEvent.getY()>
	//   74  183:fstore_3        
				if(Math.abs(f1 - mTouchX) > (float)mTouchSlop || Math.abs(f4 - mTouchY) > (float)mTouchSlop)
	//*  75  184:fload_2         
	//*  76  185:aload_0         
	//*  77  186:getfield        #753 <Field float mTouchX>
	//*  78  189:fsub            
	//*  79  190:invokestatic    #496 <Method float Math.abs(float)>
	//*  80  193:aload_0         
	//*  81  194:getfield        #294 <Field int mTouchSlop>
	//*  82  197:i2f             
	//*  83  198:fcmpl           
	//*  84  199:ifgt            220
	//*  85  202:fload_3         
	//*  86  203:aload_0         
	//*  87  204:getfield        #765 <Field float mTouchY>
	//*  88  207:fsub            
	//*  89  208:invokestatic    #496 <Method float Math.abs(float)>
	//*  90  211:aload_0         
	//*  91  212:getfield        #294 <Field int mTouchSlop>
	//*  92  215:i2f             
	//*  93  216:fcmpl           
	//*  94  217:ifle            324
				{
					mTouchMode = 2;
	//   95  220:aload_0         
	//   96  221:iconst_2        
	//   97  222:putfield        #479 <Field int mTouchMode>
					getParent().requestDisallowInterceptTouchEvent(true);
	//   98  225:aload_0         
	//   99  226:invokevirtual   #769 <Method ViewParent getParent()>
	//  100  229:iconst_1        
	//  101  230:invokeinterface #774 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
					mTouchX = f1;
	//  102  235:aload_0         
	//  103  236:fload_2         
	//  104  237:putfield        #753 <Field float mTouchX>
					mTouchY = f4;
	//  105  240:aload_0         
	//  106  241:fload_3         
	//  107  242:putfield        #765 <Field float mTouchY>
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
	//* 111  248:getfield        #479 <Field int mTouchMode>
	//* 112  251:iconst_2        
	//* 113  252:icmpne          268
			{
				stopDrag(motionevent);
	//  114  255:aload_0         
	//  115  256:aload_1         
	//  116  257:invokespecial   #776 <Method void stopDrag(MotionEvent)>
				super.onTouchEvent(motionevent);
	//  117  260:aload_0         
	//  118  261:aload_1         
	//  119  262:invokespecial   #379 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//  120  265:pop             
				return true;
	//  121  266:iconst_1        
	//  122  267:ireturn         
			}
			mTouchMode = 0;
	//  123  268:aload_0         
	//  124  269:iconst_0        
	//  125  270:putfield        #479 <Field int mTouchMode>
			mVelocityTracker.clear();
	//  126  273:aload_0         
	//  127  274:getfield        #131 <Field VelocityTracker mVelocityTracker>
	//  128  277:invokevirtual   #779 <Method void VelocityTracker.clear()>
			break;
	//  129  280:goto            324

		case 0: // '\0'
			float f2 = motionevent.getX();
	//  130  283:aload_1         
	//  131  284:invokevirtual   #751 <Method float MotionEvent.getX()>
	//  132  287:fstore_2        
			float f5 = motionevent.getY();
	//  133  288:aload_1         
	//  134  289:invokevirtual   #763 <Method float MotionEvent.getY()>
	//  135  292:fstore_3        
			if(isEnabled() && hitThumb(f2, f5))
	//* 136  293:aload_0         
	//* 137  294:invokevirtual   #485 <Method boolean isEnabled()>
	//* 138  297:ifeq            324
	//* 139  300:aload_0         
	//* 140  301:fload_2         
	//* 141  302:fload_3         
	//* 142  303:invokespecial   #781 <Method boolean hitThumb(float, float)>
	//* 143  306:ifeq            324
			{
				mTouchMode = 1;
	//  144  309:aload_0         
	//  145  310:iconst_1        
	//  146  311:putfield        #479 <Field int mTouchMode>
				mTouchX = f2;
	//  147  314:aload_0         
	//  148  315:fload_2         
	//  149  316:putfield        #753 <Field float mTouchX>
				mTouchY = f5;
	//  150  319:aload_0         
	//  151  320:fload_3         
	//  152  321:putfield        #765 <Field float mTouchY>
			}
			break;
		}
		return super.onTouchEvent(motionevent);
	//  153  324:aload_0         
	//  154  325:aload_1         
	//  155  326:invokespecial   #379 <Method boolean CompoundButton.onTouchEvent(MotionEvent)>
	//  156  329:ireturn         
	}

	public void setChecked(boolean flag)
	{
		super.setChecked(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #782 <Method void CompoundButton.setChecked(boolean)>
		flag = isChecked();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #306 <Method boolean isChecked()>
	//    5    9:istore_1        
		if(getWindowToken() != null && ViewCompat.isLaidOut(((android.view.View) (this))))
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #786 <Method android.os.IBinder getWindowToken()>
	//*   8   14:ifnull          30
	//*   9   17:aload_0         
	//*  10   18:invokestatic    #791 <Method boolean ViewCompat.isLaidOut(android.view.View)>
	//*  11   21:ifeq            30
		{
			animateThumbToCheckedState(flag);
	//   12   24:aload_0         
	//   13   25:iload_1         
	//   14   26:invokespecial   #793 <Method void animateThumbToCheckedState(boolean)>
			return;
	//   15   29:return          
		}
		cancelPositionAnimator();
	//   16   30:aload_0         
	//   17   31:invokespecial   #795 <Method void cancelPositionAnimator()>
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
	//   27   47:invokevirtual   #760 <Method void setThumbPosition(float)>
	//   28   50:return          
	}

	public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback)
	{
		super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(((android.widget.TextView) (this)), callback));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokestatic    #803 <Method android.view.ActionMode$Callback TextViewCompat.wrapCustomSelectionActionModeCallback(android.widget.TextView, android.view.ActionMode$Callback)>
	//    4    6:invokespecial   #805 <Method void CompoundButton.setCustomSelectionActionModeCallback(android.view.ActionMode$Callback)>
	//    5    9:return          
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
	//    8   14:invokevirtual   #809 <Method void requestLayout()>
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
	//    4    6:invokevirtual   #540 <Method void invalidate()>
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
	//    4    6:invokevirtual   #809 <Method void requestLayout()>
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
	//    4    6:invokevirtual   #809 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setSwitchTextAppearance(Context context, int i)
	{
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, i, android.support.v7.appcompat.R.styleable.TextAppearance)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #815 <Field int[] android.support.v7.appcompat.R$styleable.TextAppearance>
	//    3    5:invokestatic    #818 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, int, int[])>
	//    4    8:astore_1        
		ColorStateList colorstatelist = ((TintTypedArray) (context)).getColorStateList(android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor);
	//    5    9:aload_1         
	//    6   10:getstatic       #821 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textColor>
	//    7   13:invokevirtual   #245 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//    8   16:astore          4
		if(colorstatelist != null)
	//*   9   18:aload           4
	//*  10   20:ifnull          32
			mTextColors = colorstatelist;
	//   11   23:aload_0         
	//   12   24:aload           4
	//   13   26:putfield        #627 <Field ColorStateList mTextColors>
		else
	//*  14   29:goto            40
			mTextColors = getTextColors();
	//   15   32:aload_0         
	//   16   33:aload_0         
	//   17   34:invokevirtual   #824 <Method ColorStateList getTextColors()>
	//   18   37:putfield        #627 <Field ColorStateList mTextColors>
		i = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
	//   19   40:aload_1         
	//   20   41:getstatic       #827 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textSize>
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
	//*  32   61:invokevirtual   #830 <Method float TextPaint.getTextSize()>
	//*  33   64:fcmpl           
	//*  34   65:ifeq            80
			{
				mTextPaint.setTextSize(f);
	//   35   68:aload_0         
	//   36   69:getfield        #144 <Field TextPaint mTextPaint>
	//   37   72:fload_3         
	//   38   73:invokevirtual   #833 <Method void TextPaint.setTextSize(float)>
				requestLayout();
	//   39   76:aload_0         
	//   40   77:invokevirtual   #809 <Method void requestLayout()>
			}
		}
		setSwitchTypefaceByIndex(((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_typeface, -1), ((TintTypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.TextAppearance_android_textStyle, -1));
	//   41   80:aload_0         
	//   42   81:aload_1         
	//   43   82:getstatic       #836 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_typeface>
	//   44   85:iconst_m1       
	//   45   86:invokevirtual   #251 <Method int TintTypedArray.getInt(int, int)>
	//   46   89:aload_1         
	//   47   90:getstatic       #839 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_android_textStyle>
	//   48   93:iconst_m1       
	//   49   94:invokevirtual   #251 <Method int TintTypedArray.getInt(int, int)>
	//   50   97:invokespecial   #841 <Method void setSwitchTypefaceByIndex(int, int)>
		if(((TintTypedArray) (context)).getBoolean(android.support.v7.appcompat.R.styleable.TextAppearance_textAllCaps, false))
	//*  51  100:aload_1         
	//*  52  101:getstatic       #844 <Field int android.support.v7.appcompat.R$styleable.TextAppearance_textAllCaps>
	//*  53  104:iconst_0        
	//*  54  105:invokevirtual   #212 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//*  55  108:ifeq            129
			mSwitchTransformationMethod = ((TransformationMethod) (new AllCapsTransformationMethod(getContext())));
	//   56  111:aload_0         
	//   57  112:new             #846 <Class AllCapsTransformationMethod>
	//   58  115:dup             
	//   59  116:aload_0         
	//   60  117:invokevirtual   #850 <Method Context getContext()>
	//   61  120:invokespecial   #852 <Method void AllCapsTransformationMethod(Context)>
	//   62  123:putfield        #431 <Field TransformationMethod mSwitchTransformationMethod>
		else
	//*  63  126:goto            134
			mSwitchTransformationMethod = null;
	//   64  129:aload_0         
	//   65  130:aconst_null     
	//   66  131:putfield        #431 <Field TransformationMethod mSwitchTransformationMethod>
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
	//*   2    4:invokevirtual   #857 <Method Typeface TextPaint.getTypeface()>
	//*   3    7:ifnull          24
	//*   4   10:aload_0         
	//*   5   11:getfield        #144 <Field TextPaint mTextPaint>
	//*   6   14:invokevirtual   #857 <Method Typeface TextPaint.getTypeface()>
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #860 <Method boolean Typeface.equals(Object)>
	//*   9   21:ifeq            38
	//*  10   24:aload_0         
	//*  11   25:getfield        #144 <Field TextPaint mTextPaint>
	//*  12   28:invokevirtual   #857 <Method Typeface TextPaint.getTypeface()>
	//*  13   31:ifnonnull       55
	//*  14   34:aload_1         
	//*  15   35:ifnull          55
		{
			mTextPaint.setTypeface(typeface);
	//   16   38:aload_0         
	//   17   39:getfield        #144 <Field TextPaint mTextPaint>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #864 <Method Typeface TextPaint.setTypeface(Typeface)>
	//   20   46:pop             
			requestLayout();
	//   21   47:aload_0         
	//   22   48:invokevirtual   #809 <Method void requestLayout()>
			invalidate();
	//   23   51:aload_0         
	//   24   52:invokevirtual   #540 <Method void invalidate()>
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
	//*   5    6:ifle            94
		{
			if(typeface == null)
	//*   6    9:aload_1         
	//*   7   10:ifnonnull       21
				typeface = Typeface.defaultFromStyle(i);
	//    8   13:iload_2         
	//    9   14:invokestatic    #868 <Method Typeface Typeface.defaultFromStyle(int)>
	//   10   17:astore_1        
			else
	//*  11   18:goto            27
				typeface = Typeface.create(typeface, i);
	//   12   21:aload_1         
	//   13   22:iload_2         
	//   14   23:invokestatic    #872 <Method Typeface Typeface.create(Typeface, int)>
	//   15   26:astore_1        
			setSwitchTypeface(typeface);
	//   16   27:aload_0         
	//   17   28:aload_1         
	//   18   29:invokevirtual   #874 <Method void setSwitchTypeface(Typeface)>
			int j;
			if(typeface != null)
	//*  19   32:aload_1         
	//*  20   33:ifnull          45
				j = typeface.getStyle();
	//   21   36:aload_1         
	//   22   37:invokevirtual   #877 <Method int Typeface.getStyle()>
	//   23   40:istore          4
			else
	//*  24   42:goto            48
				j = 0;
	//   25   45:iconst_0        
	//   26   46:istore          4
			i = j & i;
	//   27   48:iload           4
	//   28   50:iload_2         
	//   29   51:iand            
	//   30   52:istore_2        
			typeface = ((Typeface) (mTextPaint));
	//   31   53:aload_0         
	//   32   54:getfield        #144 <Field TextPaint mTextPaint>
	//   33   57:astore_1        
			if((i & 1) != 0)
	//*  34   58:iload_2         
	//*  35   59:iconst_1        
	//*  36   60:iand            
	//*  37   61:ifeq            67
				flag = true;
	//   38   64:iconst_1        
	//   39   65:istore          5
			((TextPaint) (typeface)).setFakeBoldText(flag);
	//   40   67:aload_1         
	//   41   68:iload           5
	//   42   70:invokevirtual   #880 <Method void TextPaint.setFakeBoldText(boolean)>
			typeface = ((Typeface) (mTextPaint));
	//   43   73:aload_0         
	//   44   74:getfield        #144 <Field TextPaint mTextPaint>
	//   45   77:astore_1        
			if((i & 2) != 0)
	//*  46   78:iload_2         
	//*  47   79:iconst_2        
	//*  48   80:iand            
	//*  49   81:ifeq            88
				f = -0.25F;
	//   50   84:ldc2            #881 <Float -0.25F>
	//   51   87:fstore_3        
			((TextPaint) (typeface)).setTextSkewX(f);
	//   52   88:aload_1         
	//   53   89:fload_3         
	//   54   90:invokevirtual   #884 <Method void TextPaint.setTextSkewX(float)>
			return;
	//   55   93:return          
		} else
		{
			mTextPaint.setFakeBoldText(false);
	//   56   94:aload_0         
	//   57   95:getfield        #144 <Field TextPaint mTextPaint>
	//   58   98:iconst_0        
	//   59   99:invokevirtual   #880 <Method void TextPaint.setFakeBoldText(boolean)>
			mTextPaint.setTextSkewX(0.0F);
	//   60  102:aload_0         
	//   61  103:getfield        #144 <Field TextPaint mTextPaint>
	//   62  106:fconst_0        
	//   63  107:invokevirtual   #884 <Method void TextPaint.setTextSkewX(float)>
			setSwitchTypeface(typeface);
	//   64  110:aload_0         
	//   65  111:aload_1         
	//   66  112:invokevirtual   #874 <Method void setSwitchTypeface(Typeface)>
			return;
	//   67  115:return          
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
	//    4    6:invokevirtual   #809 <Method void requestLayout()>
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
	//    4    6:invokevirtual   #809 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setThumbDrawable(Drawable drawable)
	{
		Drawable drawable1 = mThumbDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field Drawable mThumbDrawable>
	//    2    4:astore_2        
		if(drawable1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mThumbDrawable = drawable;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #180 <Field Drawable mThumbDrawable>
		if(drawable != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          28
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #809 <Method void requestLayout()>
	//   18   32:return          
	}

	void setThumbPosition(float f)
	{
		mThumbPosition = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #385 <Field float mThumbPosition>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #540 <Method void invalidate()>
	//    5    9:return          
	}

	public void setThumbResource(int i)
	{
		setThumbDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #850 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #894 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #896 <Method void setThumbDrawable(Drawable)>
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
	//    4    6:invokevirtual   #809 <Method void requestLayout()>
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
		Drawable drawable1 = mTrackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field Drawable mTrackDrawable>
	//    2    4:astore_2        
		if(drawable1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5    9:aload_2         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		mTrackDrawable = drawable;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #191 <Field Drawable mTrackDrawable>
		if(drawable != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          28
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   13   23:aload_1         
	//   14   24:aload_0         
	//   15   25:invokevirtual   #186 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
		requestLayout();
	//   16   28:aload_0         
	//   17   29:invokevirtual   #809 <Method void requestLayout()>
	//   18   32:return          
	}

	public void setTrackResource(int i)
	{
		setTrackDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #850 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #894 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #906 <Method void setTrackDrawable(Drawable)>
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
	//    2    2:invokespecial   #913 <Method boolean CompoundButton.verifyDrawable(Drawable)>
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
		//    1    1:getfield        #18  <Field float SwitchCompat.mThumbPosition>
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
	float mThumbPosition;
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
}
