// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.view.*;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//			ThemeUtils, CollapsingTextHelper, AnimationUtils, ViewOffsetHelper, 
//			AppBarLayout, ViewGroupUtils

public class CollapsingToolbarLayout extends FrameLayout
{
	public static class LayoutParams extends android.widget.FrameLayout.LayoutParams
	{

		public int getCollapseMode()
		{
			return mCollapseMode;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field int mCollapseMode>
		//    2    4:ireturn         
		}

		public float getParallaxMultiplier()
		{
			return mParallaxMult;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field float mParallaxMult>
		//    2    4:freturn         
		}

		public void setCollapseMode(int i)
		{
			mCollapseMode = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #28  <Field int mCollapseMode>
		//    3    5:return          
		}

		public void setParallaxMultiplier(float f)
		{
			mParallaxMult = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #30  <Field float mParallaxMult>
		//    3    5:return          
		}

		public static final int COLLAPSE_MODE_OFF = 0;
		public static final int COLLAPSE_MODE_PARALLAX = 2;
		public static final int COLLAPSE_MODE_PIN = 1;
		private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5F;
		int mCollapseMode;
		float mParallaxMult;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #26  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
			mCollapseMode = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #28  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    7   11:aload_0         
		//    8   12:ldc1            #20  <Float 0.5F>
		//    9   14:putfield        #30  <Field float mParallaxMult>
		//   10   17:return          
		}

		public LayoutParams(int i, int j, int k)
		{
			super(i, j, k);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #34  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
			mCollapseMode = 0;
		//    5    7:aload_0         
		//    6    8:iconst_0        
		//    7    9:putfield        #28  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    8   12:aload_0         
		//    9   13:ldc1            #20  <Float 0.5F>
		//   10   15:putfield        #30  <Field float mParallaxMult>
		//   11   18:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #37  <Method void android.widget.FrameLayout$LayoutParams(Context, AttributeSet)>
			mCollapseMode = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #28  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    7   11:aload_0         
		//    8   12:ldc1            #20  <Float 0.5F>
		//    9   14:putfield        #30  <Field float mParallaxMult>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CollapsingToolbarLayout_Layout)));
		//   10   17:aload_1         
		//   11   18:aload_2         
		//   12   19:getstatic       #43  <Field int[] android.support.design.R$styleable.CollapsingToolbarLayout_Layout>
		//   13   22:invokevirtual   #49  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   14   25:astore_1        
			mCollapseMode = ((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
		//   15   26:aload_0         
		//   16   27:aload_1         
		//   17   28:getstatic       #52  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode>
		//   18   31:iconst_0        
		//   19   32:invokevirtual   #58  <Method int TypedArray.getInt(int, int)>
		//   20   35:putfield        #28  <Field int mCollapseMode>
			setParallaxMultiplier(((TypedArray) (context)).getFloat(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5F));
		//   21   38:aload_0         
		//   22   39:aload_1         
		//   23   40:getstatic       #61  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier>
		//   24   43:ldc1            #20  <Float 0.5F>
		//   25   45:invokevirtual   #65  <Method float TypedArray.getFloat(int, float)>
		//   26   48:invokevirtual   #69  <Method void setParallaxMultiplier(float)>
			((TypedArray) (context)).recycle();
		//   27   51:aload_1         
		//   28   52:invokevirtual   #73  <Method void TypedArray.recycle()>
		//   29   55:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #76  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
			mCollapseMode = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #28  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #20  <Float 0.5F>
		//    8   13:putfield        #30  <Field float mParallaxMult>
		//    9   16:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #79  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			mCollapseMode = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #28  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #20  <Float 0.5F>
		//    8   13:putfield        #30  <Field float mParallaxMult>
		//    9   16:return          
		}

		public LayoutParams(android.widget.FrameLayout.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #85  <Method void android.widget.FrameLayout$LayoutParams(android.widget.FrameLayout$LayoutParams)>
			mCollapseMode = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #28  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #20  <Float 0.5F>
		//    8   13:putfield        #30  <Field float mParallaxMult>
		//    9   16:return          
		}
	}

	static interface LayoutParams.CollapseMode
		extends Annotation
	{
	}

	private class OffsetUpdateListener
		implements AppBarLayout.OnOffsetChangedListener
	{

		public void onOffsetChanged(AppBarLayout appbarlayout, int i)
		{
			int j;
			LayoutParams layoutparams;
			ViewOffsetHelper viewoffsethelper;
			mCurrentOffset = i;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//    2    4:iload_2         
		//    3    5:putfield        #25  <Field int CollapsingToolbarLayout.mCurrentOffset>
			int k;
			int i1;
			if(mLastInsets != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//*   6   12:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
		//*   7   15:ifnull          109
				j = mLastInsets.getSystemWindowInsetTop();
		//    8   18:aload_0         
		//    9   19:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   10   22:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
		//   11   25:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
		//   12   28:istore_3        
			else
		//*  13   29:iconst_0        
		//*  14   30:istore          4
		//*  15   32:aload_0         
		//*  16   33:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//*  17   36:invokevirtual   #38  <Method int CollapsingToolbarLayout.getChildCount()>
		//*  18   39:istore          5
		//*  19   41:iload           4
		//*  20   43:iload           5
		//*  21   45:icmpge          158
		//*  22   48:aload_0         
		//*  23   49:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//*  24   52:iload           4
		//*  25   54:invokevirtual   #42  <Method View CollapsingToolbarLayout.getChildAt(int)>
		//*  26   57:astore_1        
		//*  27   58:aload_1         
		//*  28   59:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//*  29   62:checkcast       #50  <Class CollapsingToolbarLayout$LayoutParams>
		//*  30   65:astore          6
		//*  31   67:aload_1         
		//*  32   68:invokestatic    #54  <Method ViewOffsetHelper CollapsingToolbarLayout.getViewOffsetHelper(View)>
		//*  33   71:astore          7
		//*  34   73:aload           6
		//*  35   75:getfield        #57  <Field int CollapsingToolbarLayout$LayoutParams.mCollapseMode>
		//*  36   78:tableswitch     1 2: default 100
		//		               1 114
		//		               2 137
		//*  37  100:iload           4
		//*  38  102:iconst_1        
		//*  39  103:iadd            
		//*  40  104:istore          4
		//*  41  106:goto            41
				j = 0;
		//   42  109:iconst_0        
		//   43  110:istore_3        
			k = 0;
			i1 = getChildCount();
			if(k >= i1)
				break MISSING_BLOCK_LABEL_158;
			appbarlayout = ((AppBarLayout) (getChildAt(k)));
			layoutparams = (LayoutParams)((View) (appbarlayout)).getLayoutParams();
			viewoffsethelper = CollapsingToolbarLayout.getViewOffsetHelper(((View) (appbarlayout)));
			switch(layoutparams.mCollapseMode)
			{
			default:
				break;

			case 1: // '\001'
				break; /* Loop/switch isn't completed */

			case 2: // '\002'
				break;
			}
			break MISSING_BLOCK_LABEL_137;
_L4:
			k++;
			if(true) goto _L2; else goto _L1
_L2:
			break MISSING_BLOCK_LABEL_41;
		//*  44  111:goto            29
_L1:
			viewoffsethelper.setTopAndBottomOffset(MathUtils.clamp(-i, 0, getMaxOffsetForPinChild(((View) (appbarlayout)))));
		//   45  114:aload           7
		//   46  116:iload_2         
		//   47  117:ineg            
		//   48  118:iconst_0        
		//   49  119:aload_0         
		//   50  120:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   51  123:aload_1         
		//   52  124:invokevirtual   #61  <Method int CollapsingToolbarLayout.getMaxOffsetForPinChild(View)>
		//   53  127:invokestatic    #67  <Method int MathUtils.clamp(int, int, int)>
		//   54  130:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
		//   55  133:pop             
			continue; /* Loop/switch isn't completed */
		//   56  134:goto            100
			viewoffsethelper.setTopAndBottomOffset(Math.round((float)(-i) * layoutparams.mParallaxMult));
		//   57  137:aload           7
		//   58  139:iload_2         
		//   59  140:ineg            
		//   60  141:i2f             
		//   61  142:aload           6
		//   62  144:getfield        #77  <Field float CollapsingToolbarLayout$LayoutParams.mParallaxMult>
		//   63  147:fmul            
		//   64  148:invokestatic    #83  <Method int Math.round(float)>
		//   65  151:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
		//   66  154:pop             
			if(true) goto _L4; else goto _L3
		//   67  155:goto            100
_L3:
			updateScrimVisibility();
		//   68  158:aload_0         
		//   69  159:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   70  162:invokevirtual   #86  <Method void CollapsingToolbarLayout.updateScrimVisibility()>
			if(mStatusBarScrim != null && j > 0)
		//*  71  165:aload_0         
		//*  72  166:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//*  73  169:getfield        #90  <Field Drawable CollapsingToolbarLayout.mStatusBarScrim>
		//*  74  172:ifnull          186
		//*  75  175:iload_3         
		//*  76  176:ifle            186
				ViewCompat.postInvalidateOnAnimation(((View) (CollapsingToolbarLayout.this)));
		//   77  179:aload_0         
		//   78  180:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   79  183:invokestatic    #96  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			int l = getHeight();
		//   80  186:aload_0         
		//   81  187:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   82  190:invokevirtual   #99  <Method int CollapsingToolbarLayout.getHeight()>
		//   83  193:istore          4
			int j1 = ViewCompat.getMinimumHeight(((View) (CollapsingToolbarLayout.this)));
		//   84  195:aload_0         
		//   85  196:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   86  199:invokestatic    #102 <Method int ViewCompat.getMinimumHeight(View)>
		//   87  202:istore          5
			mCollapsingTextHelper.setExpansionFraction((float)Math.abs(i) / (float)(l - j1 - j));
		//   88  204:aload_0         
		//   89  205:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   90  208:getfield        #106 <Field CollapsingTextHelper CollapsingToolbarLayout.mCollapsingTextHelper>
		//   91  211:iload_2         
		//   92  212:invokestatic    #110 <Method int Math.abs(int)>
		//   93  215:i2f             
		//   94  216:iload           4
		//   95  218:iload           5
		//   96  220:isub            
		//   97  221:iload_3         
		//   98  222:isub            
		//   99  223:i2f             
		//  100  224:fdiv            
		//  101  225:invokevirtual   #116 <Method void CollapsingTextHelper.setExpansionFraction(float)>
			return;
		//  102  228:return          
		}

		final CollapsingToolbarLayout this$0;

		OffsetUpdateListener()
		{
			this$0 = CollapsingToolbarLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CollapsingToolbarLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public CollapsingToolbarLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #58  <Method void CollapsingToolbarLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public CollapsingToolbarLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #62  <Method void CollapsingToolbarLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public CollapsingToolbarLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #63  <Method void FrameLayout(Context, AttributeSet, int)>
		mRefreshToolbar = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #65  <Field boolean mRefreshToolbar>
		mTmpRect = new Rect();
	//    8   12:aload_0         
	//    9   13:new             #67  <Class Rect>
	//   10   16:dup             
	//   11   17:invokespecial   #70  <Method void Rect()>
	//   12   20:putfield        #72  <Field Rect mTmpRect>
		mScrimVisibleHeightTrigger = -1;
	//   13   23:aload_0         
	//   14   24:iconst_m1       
	//   15   25:putfield        #74  <Field int mScrimVisibleHeightTrigger>
		ThemeUtils.checkAppCompatTheme(context);
	//   16   28:aload_1         
	//   17   29:invokestatic    #79  <Method void ThemeUtils.checkAppCompatTheme(Context)>
		mCollapsingTextHelper = new CollapsingTextHelper(((View) (this)));
	//   18   32:aload_0         
	//   19   33:new             #81  <Class CollapsingTextHelper>
	//   20   36:dup             
	//   21   37:aload_0         
	//   22   38:invokespecial   #84  <Method void CollapsingTextHelper(View)>
	//   23   41:putfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
		mCollapsingTextHelper.setTextSizeInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
	//   24   44:aload_0         
	//   25   45:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//   26   48:getstatic       #92  <Field android.view.animation.Interpolator AnimationUtils.DECELERATE_INTERPOLATOR>
	//   27   51:invokevirtual   #96  <Method void CollapsingTextHelper.setTextSizeInterpolator(android.view.animation.Interpolator)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CollapsingToolbarLayout, i, android.support.design.R.style.Widget_Design_CollapsingToolbar)));
	//   28   54:aload_1         
	//   29   55:aload_2         
	//   30   56:getstatic       #102 <Field int[] android.support.design.R$styleable.CollapsingToolbarLayout>
	//   31   59:iload_3         
	//   32   60:getstatic       #107 <Field int android.support.design.R$style.Widget_Design_CollapsingToolbar>
	//   33   63:invokevirtual   #113 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   34   66:astore_1        
		mCollapsingTextHelper.setExpandedTextGravity(((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 0x800053));
	//   35   67:aload_0         
	//   36   68:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//   37   71:aload_1         
	//   38   72:getstatic       #116 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleGravity>
	//   39   75:ldc1            #117 <Int 0x800053>
	//   40   77:invokevirtual   #123 <Method int TypedArray.getInt(int, int)>
	//   41   80:invokevirtual   #127 <Method void CollapsingTextHelper.setExpandedTextGravity(int)>
		mCollapsingTextHelper.setCollapsedTextGravity(((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 0x800013));
	//   42   83:aload_0         
	//   43   84:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//   44   87:aload_1         
	//   45   88:getstatic       #130 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_collapsedTitleGravity>
	//   46   91:ldc1            #131 <Int 0x800013>
	//   47   93:invokevirtual   #123 <Method int TypedArray.getInt(int, int)>
	//   48   96:invokevirtual   #134 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
		i = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
	//   49   99:aload_1         
	//   50  100:getstatic       #137 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMargin>
	//   51  103:iconst_0        
	//   52  104:invokevirtual   #140 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   53  107:istore_3        
		mExpandedMarginBottom = i;
	//   54  108:aload_0         
	//   55  109:iload_3         
	//   56  110:putfield        #142 <Field int mExpandedMarginBottom>
		mExpandedMarginEnd = i;
	//   57  113:aload_0         
	//   58  114:iload_3         
	//   59  115:putfield        #144 <Field int mExpandedMarginEnd>
		mExpandedMarginTop = i;
	//   60  118:aload_0         
	//   61  119:iload_3         
	//   62  120:putfield        #146 <Field int mExpandedMarginTop>
		mExpandedMarginStart = i;
	//   63  123:aload_0         
	//   64  124:iload_3         
	//   65  125:putfield        #148 <Field int mExpandedMarginStart>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart))
	//*  66  128:aload_1         
	//*  67  129:getstatic       #151 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart>
	//*  68  132:invokevirtual   #155 <Method boolean TypedArray.hasValue(int)>
	//*  69  135:ifeq            150
			mExpandedMarginStart = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
	//   70  138:aload_0         
	//   71  139:aload_1         
	//   72  140:getstatic       #151 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart>
	//   73  143:iconst_0        
	//   74  144:invokevirtual   #140 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   75  147:putfield        #148 <Field int mExpandedMarginStart>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd))
	//*  76  150:aload_1         
	//*  77  151:getstatic       #158 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd>
	//*  78  154:invokevirtual   #155 <Method boolean TypedArray.hasValue(int)>
	//*  79  157:ifeq            172
			mExpandedMarginEnd = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
	//   80  160:aload_0         
	//   81  161:aload_1         
	//   82  162:getstatic       #158 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd>
	//   83  165:iconst_0        
	//   84  166:invokevirtual   #140 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   85  169:putfield        #144 <Field int mExpandedMarginEnd>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop))
	//*  86  172:aload_1         
	//*  87  173:getstatic       #161 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop>
	//*  88  176:invokevirtual   #155 <Method boolean TypedArray.hasValue(int)>
	//*  89  179:ifeq            194
			mExpandedMarginTop = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
	//   90  182:aload_0         
	//   91  183:aload_1         
	//   92  184:getstatic       #161 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop>
	//   93  187:iconst_0        
	//   94  188:invokevirtual   #140 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   95  191:putfield        #146 <Field int mExpandedMarginTop>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom))
	//*  96  194:aload_1         
	//*  97  195:getstatic       #164 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom>
	//*  98  198:invokevirtual   #155 <Method boolean TypedArray.hasValue(int)>
	//*  99  201:ifeq            216
			mExpandedMarginBottom = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
	//  100  204:aload_0         
	//  101  205:aload_1         
	//  102  206:getstatic       #164 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom>
	//  103  209:iconst_0        
	//  104  210:invokevirtual   #140 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  105  213:putfield        #142 <Field int mExpandedMarginBottom>
		mCollapsingTitleEnabled = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.CollapsingToolbarLayout_titleEnabled, true);
	//  106  216:aload_0         
	//  107  217:aload_1         
	//  108  218:getstatic       #167 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_titleEnabled>
	//  109  221:iconst_1        
	//  110  222:invokevirtual   #171 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  111  225:putfield        #173 <Field boolean mCollapsingTitleEnabled>
		setTitle(((TypedArray) (context)).getText(android.support.design.R.styleable.CollapsingToolbarLayout_title));
	//  112  228:aload_0         
	//  113  229:aload_1         
	//  114  230:getstatic       #176 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_title>
	//  115  233:invokevirtual   #180 <Method CharSequence TypedArray.getText(int)>
	//  116  236:invokevirtual   #184 <Method void setTitle(CharSequence)>
		mCollapsingTextHelper.setExpandedTextAppearance(android.support.design.R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
	//  117  239:aload_0         
	//  118  240:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//  119  243:getstatic       #187 <Field int android.support.design.R$style.TextAppearance_Design_CollapsingToolbar_Expanded>
	//  120  246:invokevirtual   #190 <Method void CollapsingTextHelper.setExpandedTextAppearance(int)>
		mCollapsingTextHelper.setCollapsedTextAppearance(android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
	//  121  249:aload_0         
	//  122  250:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//  123  253:getstatic       #195 <Field int android.support.v7.appcompat.R$style.TextAppearance_AppCompat_Widget_ActionBar_Title>
	//  124  256:invokevirtual   #198 <Method void CollapsingTextHelper.setCollapsedTextAppearance(int)>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance))
	//* 125  259:aload_1         
	//* 126  260:getstatic       #201 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance>
	//* 127  263:invokevirtual   #155 <Method boolean TypedArray.hasValue(int)>
	//* 128  266:ifeq            284
			mCollapsingTextHelper.setExpandedTextAppearance(((TypedArray) (context)).getResourceId(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
	//  129  269:aload_0         
	//  130  270:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//  131  273:aload_1         
	//  132  274:getstatic       #201 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance>
	//  133  277:iconst_0        
	//  134  278:invokevirtual   #204 <Method int TypedArray.getResourceId(int, int)>
	//  135  281:invokevirtual   #190 <Method void CollapsingTextHelper.setExpandedTextAppearance(int)>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance))
	//* 136  284:aload_1         
	//* 137  285:getstatic       #207 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance>
	//* 138  288:invokevirtual   #155 <Method boolean TypedArray.hasValue(int)>
	//* 139  291:ifeq            309
			mCollapsingTextHelper.setCollapsedTextAppearance(((TypedArray) (context)).getResourceId(android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
	//  140  294:aload_0         
	//  141  295:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//  142  298:aload_1         
	//  143  299:getstatic       #207 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance>
	//  144  302:iconst_0        
	//  145  303:invokevirtual   #204 <Method int TypedArray.getResourceId(int, int)>
	//  146  306:invokevirtual   #198 <Method void CollapsingTextHelper.setCollapsedTextAppearance(int)>
		mScrimVisibleHeightTrigger = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
	//  147  309:aload_0         
	//  148  310:aload_1         
	//  149  311:getstatic       #210 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger>
	//  150  314:iconst_m1       
	//  151  315:invokevirtual   #140 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  152  318:putfield        #74  <Field int mScrimVisibleHeightTrigger>
		mScrimAnimationDuration = ((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
	//  153  321:aload_0         
	//  154  322:aload_1         
	//  155  323:getstatic       #213 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_scrimAnimationDuration>
	//  156  326:sipush          600
	//  157  329:invokevirtual   #123 <Method int TypedArray.getInt(int, int)>
	//  158  332:i2l             
	//  159  333:putfield        #215 <Field long mScrimAnimationDuration>
		setContentScrim(((TypedArray) (context)).getDrawable(android.support.design.R.styleable.CollapsingToolbarLayout_contentScrim));
	//  160  336:aload_0         
	//  161  337:aload_1         
	//  162  338:getstatic       #218 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_contentScrim>
	//  163  341:invokevirtual   #222 <Method Drawable TypedArray.getDrawable(int)>
	//  164  344:invokevirtual   #226 <Method void setContentScrim(Drawable)>
		setStatusBarScrim(((TypedArray) (context)).getDrawable(android.support.design.R.styleable.CollapsingToolbarLayout_statusBarScrim));
	//  165  347:aload_0         
	//  166  348:aload_1         
	//  167  349:getstatic       #229 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_statusBarScrim>
	//  168  352:invokevirtual   #222 <Method Drawable TypedArray.getDrawable(int)>
	//  169  355:invokevirtual   #232 <Method void setStatusBarScrim(Drawable)>
		mToolbarId = ((TypedArray) (context)).getResourceId(android.support.design.R.styleable.CollapsingToolbarLayout_toolbarId, -1);
	//  170  358:aload_0         
	//  171  359:aload_1         
	//  172  360:getstatic       #235 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_toolbarId>
	//  173  363:iconst_m1       
	//  174  364:invokevirtual   #204 <Method int TypedArray.getResourceId(int, int)>
	//  175  367:putfield        #237 <Field int mToolbarId>
		((TypedArray) (context)).recycle();
	//  176  370:aload_1         
	//  177  371:invokevirtual   #240 <Method void TypedArray.recycle()>
		setWillNotDraw(false);
	//  178  374:aload_0         
	//  179  375:iconst_0        
	//  180  376:invokevirtual   #244 <Method void setWillNotDraw(boolean)>
		ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), new OnApplyWindowInsetsListener() {

			public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
			{
				return onWindowInsetChanged(windowinsetscompat);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CollapsingToolbarLayout this$0>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #26  <Method WindowInsetsCompat CollapsingToolbarLayout.onWindowInsetChanged(WindowInsetsCompat)>
			//    4    8:areturn         
			}

			final CollapsingToolbarLayout this$0;

			
			{
				this$0 = CollapsingToolbarLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CollapsingToolbarLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  181  379:aload_0         
	//  182  380:new             #6   <Class CollapsingToolbarLayout$1>
	//  183  383:dup             
	//  184  384:aload_0         
	//  185  385:invokespecial   #247 <Method void CollapsingToolbarLayout$1(CollapsingToolbarLayout)>
	//  186  388:invokestatic    #253 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//  187  391:return          
	}

	private void animateScrim(int i)
	{
		ensureToolbar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method void ensureToolbar()>
		if(mScrimAnimator != null) goto _L2; else goto _L1
	//    2    4:aload_0         
	//    3    5:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//    4    8:ifnonnull       107
_L1:
		mScrimAnimator = new ValueAnimator();
	//    5   11:aload_0         
	//    6   12:new             #261 <Class ValueAnimator>
	//    7   15:dup             
	//    8   16:invokespecial   #262 <Method void ValueAnimator()>
	//    9   19:putfield        #259 <Field ValueAnimator mScrimAnimator>
		mScrimAnimator.setDuration(mScrimAnimationDuration);
	//   10   22:aload_0         
	//   11   23:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//   12   26:aload_0         
	//   13   27:getfield        #215 <Field long mScrimAnimationDuration>
	//   14   30:invokevirtual   #266 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   15   33:pop             
		ValueAnimator valueanimator = mScrimAnimator;
	//   16   34:aload_0         
	//   17   35:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//   18   38:astore_3        
		android.view.animation.Interpolator interpolator;
		if(i > mScrimAlpha)
	//*  19   39:iload_1         
	//*  20   40:aload_0         
	//*  21   41:getfield        #268 <Field int mScrimAlpha>
	//*  22   44:icmple          100
			interpolator = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
	//   23   47:getstatic       #271 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   24   50:astore_2        
		else
	//*  25   51:aload_3         
	//*  26   52:aload_2         
	//*  27   53:invokevirtual   #275 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
	//*  28   56:aload_0         
	//*  29   57:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//*  30   60:new             #8   <Class CollapsingToolbarLayout$2>
	//*  31   63:dup             
	//*  32   64:aload_0         
	//*  33   65:invokespecial   #276 <Method void CollapsingToolbarLayout$2(CollapsingToolbarLayout)>
	//*  34   68:invokevirtual   #280 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
	//*  35   71:aload_0         
	//*  36   72:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//*  37   75:iconst_2        
	//*  38   76:newarray        int[]
	//*  39   78:dup             
	//*  40   79:iconst_0        
	//*  41   80:aload_0         
	//*  42   81:getfield        #268 <Field int mScrimAlpha>
	//*  43   84:iastore         
	//*  44   85:dup             
	//*  45   86:iconst_1        
	//*  46   87:iload_1         
	//*  47   88:iastore         
	//*  48   89:invokevirtual   #284 <Method void ValueAnimator.setIntValues(int[])>
	//*  49   92:aload_0         
	//*  50   93:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//*  51   96:invokevirtual   #287 <Method void ValueAnimator.start()>
	//*  52   99:return          
			interpolator = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
	//   53  100:getstatic       #290 <Field android.view.animation.Interpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   54  103:astore_2        
		valueanimator.setInterpolator(((android.animation.TimeInterpolator) (interpolator)));
		mScrimAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

			public void onAnimationUpdate(ValueAnimator valueanimator1)
			{
				setScrimAlpha(((Integer)valueanimator1.getAnimatedValue()).intValue());
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field CollapsingToolbarLayout this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #29  <Method Object ValueAnimator.getAnimatedValue()>
			//    4    8:checkcast       #31  <Class Integer>
			//    5   11:invokevirtual   #35  <Method int Integer.intValue()>
			//    6   14:invokevirtual   #38  <Method void CollapsingToolbarLayout.setScrimAlpha(int)>
			//    7   17:return          
			}

			final CollapsingToolbarLayout this$0;

			
			{
				this$0 = CollapsingToolbarLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CollapsingToolbarLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
_L4:
		mScrimAnimator.setIntValues(new int[] {
			mScrimAlpha, i
		});
		mScrimAnimator.start();
		return;
	//*  55  104:goto            51
_L2:
		if(mScrimAnimator.isRunning())
	//*  56  107:aload_0         
	//*  57  108:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//*  58  111:invokevirtual   #294 <Method boolean ValueAnimator.isRunning()>
	//*  59  114:ifeq            71
			mScrimAnimator.cancel();
	//   60  117:aload_0         
	//   61  118:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//   62  121:invokevirtual   #297 <Method void ValueAnimator.cancel()>
		if(true) goto _L4; else goto _L3
	//   63  124:goto            71
_L3:
	}

	private void ensureToolbar()
	{
		if(!mRefreshToolbar)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field boolean mRefreshToolbar>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		mToolbar = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #299 <Field Toolbar mToolbar>
		mToolbarDirectChild = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #301 <Field View mToolbarDirectChild>
		if(mToolbarId != -1)
	//*  10   18:aload_0         
	//*  11   19:getfield        #237 <Field int mToolbarId>
	//*  12   22:iconst_m1       
	//*  13   23:icmpeq          60
		{
			mToolbar = (Toolbar)findViewById(mToolbarId);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #237 <Field int mToolbarId>
	//   18   32:invokevirtual   #305 <Method View findViewById(int)>
	//   19   35:checkcast       #307 <Class Toolbar>
	//   20   38:putfield        #299 <Field Toolbar mToolbar>
			if(mToolbar != null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #299 <Field Toolbar mToolbar>
	//*  23   45:ifnull          60
				mToolbarDirectChild = findDirectChild(((View) (mToolbar)));
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #299 <Field Toolbar mToolbar>
	//   28   54:invokespecial   #311 <Method View findDirectChild(View)>
	//   29   57:putfield        #301 <Field View mToolbarDirectChild>
		}
		if(mToolbar != null) goto _L2; else goto _L1
	//   30   60:aload_0         
	//   31   61:getfield        #299 <Field Toolbar mToolbar>
	//   32   64:ifnonnull       108
_L1:
		int i;
		int j;
		Object obj1;
		obj1 = null;
	//   33   67:aconst_null     
	//   34   68:astore          4
		i = 0;
	//   35   70:iconst_0        
	//   36   71:istore_1        
		j = getChildCount();
	//   37   72:aload_0         
	//   38   73:invokevirtual   #315 <Method int getChildCount()>
	//   39   76:istore_2        
_L8:
		Object obj = ((Object) (obj1));
	//   40   77:aload           4
	//   41   79:astore_3        
		if(i >= j) goto _L4; else goto _L3
	//   42   80:iload_1         
	//   43   81:iload_2         
	//   44   82:icmpge          103
_L3:
		obj = ((Object) (getChildAt(i)));
	//   45   85:aload_0         
	//   46   86:iload_1         
	//   47   87:invokevirtual   #318 <Method View getChildAt(int)>
	//   48   90:astore_3        
		if(!(obj instanceof Toolbar)) goto _L6; else goto _L5
	//   49   91:aload_3         
	//   50   92:instanceof      #307 <Class Toolbar>
	//   51   95:ifeq            118
_L5:
		obj = ((Object) ((Toolbar)obj));
	//   52   98:aload_3         
	//   53   99:checkcast       #307 <Class Toolbar>
	//   54  102:astore_3        
_L4:
		mToolbar = ((Toolbar) (obj));
	//   55  103:aload_0         
	//   56  104:aload_3         
	//   57  105:putfield        #299 <Field Toolbar mToolbar>
_L2:
		updateDummyView();
	//   58  108:aload_0         
	//   59  109:invokespecial   #321 <Method void updateDummyView()>
		mRefreshToolbar = false;
	//   60  112:aload_0         
	//   61  113:iconst_0        
	//   62  114:putfield        #65  <Field boolean mRefreshToolbar>
		return;
	//   63  117:return          
_L6:
		i++;
	//   64  118:iload_1         
	//   65  119:iconst_1        
	//   66  120:iadd            
	//   67  121:istore_1        
		if(true) goto _L8; else goto _L7
	//   68  122:goto            77
_L7:
	}

	private View findDirectChild(View view)
	{
		View view1 = view;
	//    0    0:aload_1         
	//    1    1:astore_2        
		for(view = ((View) (view.getParent())); view != this && view != null; view = ((View) (((ViewParent) (view)).getParent())))
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #327 <Method ViewParent View.getParent()>
	//*   4    6:astore_1        
	//*   5    7:aload_1         
	//*   6    8:aload_0         
	//*   7    9:if_acmpeq       38
	//*   8   12:aload_1         
	//*   9   13:ifnull          38
			if(view instanceof View)
	//*  10   16:aload_1         
	//*  11   17:instanceof      #323 <Class View>
	//*  12   20:ifeq            28
				view1 = (View)view;
	//   13   23:aload_1         
	//   14   24:checkcast       #323 <Class View>
	//   15   27:astore_2        

	//   16   28:aload_1         
	//   17   29:invokeinterface #330 <Method ViewParent ViewParent.getParent()>
	//   18   34:astore_1        
	//*  19   35:goto            7
		return view1;
	//   20   38:aload_2         
	//   21   39:areturn         
	}

	private static int getHeightWithMargins(View view)
	{
		Object obj = ((Object) (view.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #337 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_1        
		if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #339 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   5    9:ifeq            32
		{
			obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #339 <Class android.view.ViewGroup$MarginLayoutParams>
	//    8   16:astore_1        
			return view.getHeight() + ((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (obj)).bottomMargin;
	//    9   17:aload_0         
	//   10   18:invokevirtual   #342 <Method int View.getHeight()>
	//   11   21:aload_1         
	//   12   22:getfield        #345 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   13   25:iadd            
	//   14   26:aload_1         
	//   15   27:getfield        #348 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   16   30:iadd            
	//   17   31:ireturn         
		} else
		{
			return view.getHeight();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #342 <Method int View.getHeight()>
	//   20   36:ireturn         
		}
	}

	static ViewOffsetHelper getViewOffsetHelper(View view)
	{
		ViewOffsetHelper viewoffsethelper1 = (ViewOffsetHelper)view.getTag(android.support.design.R.id.view_offset_helper);
	//    0    0:aload_0         
	//    1    1:getstatic       #356 <Field int android.support.design.R$id.view_offset_helper>
	//    2    4:invokevirtual   #360 <Method Object View.getTag(int)>
	//    3    7:checkcast       #362 <Class ViewOffsetHelper>
	//    4   10:astore_2        
		ViewOffsetHelper viewoffsethelper = viewoffsethelper1;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(viewoffsethelper1 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       34
		{
			viewoffsethelper = new ViewOffsetHelper(view);
	//    9   17:new             #362 <Class ViewOffsetHelper>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #363 <Method void ViewOffsetHelper(View)>
	//   13   25:astore_1        
			view.setTag(android.support.design.R.id.view_offset_helper, ((Object) (viewoffsethelper)));
	//   14   26:aload_0         
	//   15   27:getstatic       #356 <Field int android.support.design.R$id.view_offset_helper>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #367 <Method void View.setTag(int, Object)>
		}
		return viewoffsethelper;
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	private boolean isToolbarChild(View view)
	{
		if(mToolbarDirectChild != null && mToolbarDirectChild != this) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field View mToolbarDirectChild>
	//    2    4:ifnull          15
	//    3    7:aload_0         
	//    4    8:getfield        #301 <Field View mToolbarDirectChild>
	//    5   11:aload_0         
	//    6   12:if_acmpne       27
_L1:
		if(view != mToolbar) goto _L4; else goto _L3
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #299 <Field Toolbar mToolbar>
	//   10   20:if_acmpne       25
_L3:
		return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
_L4:
		return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
_L2:
		if(view != mToolbarDirectChild)
	//*  15   27:aload_1         
	//*  16   28:aload_0         
	//*  17   29:getfield        #301 <Field View mToolbarDirectChild>
	//*  18   32:if_acmpeq       23
			return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	private void updateDummyView()
	{
		if(!mCollapsingTitleEnabled && mDummyView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//*   2    4:ifne            40
	//*   3    7:aload_0         
	//*   4    8:getfield        #371 <Field View mDummyView>
	//*   5   11:ifnull          40
		{
			ViewParent viewparent = mDummyView.getParent();
	//    6   14:aload_0         
	//    7   15:getfield        #371 <Field View mDummyView>
	//    8   18:invokevirtual   #327 <Method ViewParent View.getParent()>
	//    9   21:astore_1        
			if(viewparent instanceof ViewGroup)
	//*  10   22:aload_1         
	//*  11   23:instanceof      #373 <Class ViewGroup>
	//*  12   26:ifeq            40
				((ViewGroup)viewparent).removeView(mDummyView);
	//   13   29:aload_1         
	//   14   30:checkcast       #373 <Class ViewGroup>
	//   15   33:aload_0         
	//   16   34:getfield        #371 <Field View mDummyView>
	//   17   37:invokevirtual   #376 <Method void ViewGroup.removeView(View)>
		}
		if(mCollapsingTitleEnabled && mToolbar != null)
	//*  18   40:aload_0         
	//*  19   41:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//*  20   44:ifeq            99
	//*  21   47:aload_0         
	//*  22   48:getfield        #299 <Field Toolbar mToolbar>
	//*  23   51:ifnull          99
		{
			if(mDummyView == null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #371 <Field View mDummyView>
	//*  26   58:ifnonnull       76
				mDummyView = new View(getContext());
	//   27   61:aload_0         
	//   28   62:new             #323 <Class View>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:invokevirtual   #380 <Method Context getContext()>
	//   32   70:invokespecial   #382 <Method void View(Context)>
	//   33   73:putfield        #371 <Field View mDummyView>
			if(mDummyView.getParent() == null)
	//*  34   76:aload_0         
	//*  35   77:getfield        #371 <Field View mDummyView>
	//*  36   80:invokevirtual   #327 <Method ViewParent View.getParent()>
	//*  37   83:ifnonnull       99
				mToolbar.addView(mDummyView, -1, -1);
	//   38   86:aload_0         
	//   39   87:getfield        #299 <Field Toolbar mToolbar>
	//   40   90:aload_0         
	//   41   91:getfield        #371 <Field View mDummyView>
	//   42   94:iconst_m1       
	//   43   95:iconst_m1       
	//   44   96:invokevirtual   #386 <Method void Toolbar.addView(View, int, int)>
		}
	//   45   99:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    2    4:ireturn         
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #392 <Method void FrameLayout.draw(Canvas)>
		ensureToolbar();
	//    3    5:aload_0         
	//    4    6:invokespecial   #257 <Method void ensureToolbar()>
		if(mToolbar == null && mContentScrim != null && mScrimAlpha > 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #299 <Field Toolbar mToolbar>
	//*   7   13:ifnonnull       52
	//*   8   16:aload_0         
	//*   9   17:getfield        #394 <Field Drawable mContentScrim>
	//*  10   20:ifnull          52
	//*  11   23:aload_0         
	//*  12   24:getfield        #268 <Field int mScrimAlpha>
	//*  13   27:ifle            52
		{
			mContentScrim.mutate().setAlpha(mScrimAlpha);
	//   14   30:aload_0         
	//   15   31:getfield        #394 <Field Drawable mContentScrim>
	//   16   34:invokevirtual   #400 <Method Drawable Drawable.mutate()>
	//   17   37:aload_0         
	//   18   38:getfield        #268 <Field int mScrimAlpha>
	//   19   41:invokevirtual   #403 <Method void Drawable.setAlpha(int)>
			mContentScrim.draw(canvas);
	//   20   44:aload_0         
	//   21   45:getfield        #394 <Field Drawable mContentScrim>
	//   22   48:aload_1         
	//   23   49:invokevirtual   #404 <Method void Drawable.draw(Canvas)>
		}
		if(mCollapsingTitleEnabled && mDrawCollapsingTitle)
	//*  24   52:aload_0         
	//*  25   53:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//*  26   56:ifeq            74
	//*  27   59:aload_0         
	//*  28   60:getfield        #406 <Field boolean mDrawCollapsingTitle>
	//*  29   63:ifeq            74
			mCollapsingTextHelper.draw(canvas);
	//   30   66:aload_0         
	//   31   67:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #407 <Method void CollapsingTextHelper.draw(Canvas)>
		if(mStatusBarScrim != null && mScrimAlpha > 0)
	//*  34   74:aload_0         
	//*  35   75:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  36   78:ifnull          152
	//*  37   81:aload_0         
	//*  38   82:getfield        #268 <Field int mScrimAlpha>
	//*  39   85:ifle            152
		{
			int i;
			if(mLastInsets != null)
	//*  40   88:aload_0         
	//*  41   89:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//*  42   92:ifnull          153
				i = mLastInsets.getSystemWindowInsetTop();
	//   43   95:aload_0         
	//   44   96:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//   45   99:invokevirtual   #416 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   46  102:istore_2        
			else
	//*  47  103:iload_2         
	//*  48  104:ifle            152
	//*  49  107:aload_0         
	//*  50  108:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  51  111:iconst_0        
	//*  52  112:aload_0         
	//*  53  113:getfield        #418 <Field int mCurrentOffset>
	//*  54  116:ineg            
	//*  55  117:aload_0         
	//*  56  118:invokevirtual   #421 <Method int getWidth()>
	//*  57  121:iload_2         
	//*  58  122:aload_0         
	//*  59  123:getfield        #418 <Field int mCurrentOffset>
	//*  60  126:isub            
	//*  61  127:invokevirtual   #425 <Method void Drawable.setBounds(int, int, int, int)>
	//*  62  130:aload_0         
	//*  63  131:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  64  134:invokevirtual   #400 <Method Drawable Drawable.mutate()>
	//*  65  137:aload_0         
	//*  66  138:getfield        #268 <Field int mScrimAlpha>
	//*  67  141:invokevirtual   #403 <Method void Drawable.setAlpha(int)>
	//*  68  144:aload_0         
	//*  69  145:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  70  148:aload_1         
	//*  71  149:invokevirtual   #404 <Method void Drawable.draw(Canvas)>
	//*  72  152:return          
				i = 0;
	//   73  153:iconst_0        
	//   74  154:istore_2        
			if(i > 0)
			{
				mStatusBarScrim.setBounds(0, -mCurrentOffset, getWidth(), i - mCurrentOffset);
				mStatusBarScrim.mutate().setAlpha(mScrimAlpha);
				mStatusBarScrim.draw(canvas);
			}
		}
	//*  75  155:goto            103
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		boolean flag = flag1;
	//    2    3:iload           6
	//    3    5:istore          5
		if(mContentScrim != null)
	//*   4    7:aload_0         
	//*   5    8:getfield        #394 <Field Drawable mContentScrim>
	//*   6   11:ifnull          62
		{
			flag = flag1;
	//    7   14:iload           6
	//    8   16:istore          5
			if(mScrimAlpha > 0)
	//*   9   18:aload_0         
	//*  10   19:getfield        #268 <Field int mScrimAlpha>
	//*  11   22:ifle            62
			{
				flag = flag1;
	//   12   25:iload           6
	//   13   27:istore          5
				if(isToolbarChild(view))
	//*  14   29:aload_0         
	//*  15   30:aload_2         
	//*  16   31:invokespecial   #429 <Method boolean isToolbarChild(View)>
	//*  17   34:ifeq            62
				{
					mContentScrim.mutate().setAlpha(mScrimAlpha);
	//   18   37:aload_0         
	//   19   38:getfield        #394 <Field Drawable mContentScrim>
	//   20   41:invokevirtual   #400 <Method Drawable Drawable.mutate()>
	//   21   44:aload_0         
	//   22   45:getfield        #268 <Field int mScrimAlpha>
	//   23   48:invokevirtual   #403 <Method void Drawable.setAlpha(int)>
					mContentScrim.draw(canvas);
	//   24   51:aload_0         
	//   25   52:getfield        #394 <Field Drawable mContentScrim>
	//   26   55:aload_1         
	//   27   56:invokevirtual   #404 <Method void Drawable.draw(Canvas)>
					flag = true;
	//   28   59:iconst_1        
	//   29   60:istore          5
				}
			}
		}
		return super.drawChild(canvas, view, l) || flag;
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:aload_2         
	//   33   65:lload_3         
	//   34   66:invokespecial   #431 <Method boolean FrameLayout.drawChild(Canvas, View, long)>
	//   35   69:ifne            77
	//   36   72:iload           5
	//   37   74:ifeq            79
	//   38   77:iconst_1        
	//   39   78:ireturn         
	//   40   79:iconst_0        
	//   41   80:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #434 <Method void FrameLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #438 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		Drawable drawable = mStatusBarScrim;
	//    7   11:aload_0         
	//    8   12:getfield        #409 <Field Drawable mStatusBarScrim>
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
	//*  17   28:invokevirtual   #441 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #445 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		drawable = mContentScrim;
	//   25   43:aload_0         
	//   26   44:getfield        #394 <Field Drawable mContentScrim>
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
	//*  35   60:invokevirtual   #441 <Method boolean Drawable.isStateful()>
	//*  36   63:ifeq            75
				flag1 = flag | drawable.setState(ai);
	//   37   66:iload_1         
	//   38   67:aload           4
	//   39   69:aload_3         
	//   40   70:invokevirtual   #445 <Method boolean Drawable.setState(int[])>
	//   41   73:ior             
	//   42   74:istore_2        
		}
		flag = flag1;
	//   43   75:iload_2         
	//   44   76:istore_1        
		if(mCollapsingTextHelper != null)
	//*  45   77:aload_0         
	//*  46   78:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//*  47   81:ifnull          95
			flag = flag1 | mCollapsingTextHelper.setState(ai);
	//   48   84:iload_2         
	//   49   85:aload_0         
	//   50   86:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//   51   89:aload_3         
	//   52   90:invokevirtual   #446 <Method boolean CollapsingTextHelper.setState(int[])>
	//   53   93:ior             
	//   54   94:istore_1        
		if(flag)
	//*  55   95:iload_1         
	//*  56   96:ifeq            103
			invalidate();
	//   57   99:aload_0         
	//   58  100:invokevirtual   #449 <Method void invalidate()>
	//   59  103:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-1, -1);
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #454 <Method void CollapsingToolbarLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #456 <Method CollapsingToolbarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	protected volatile android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.widget.FrameLayout.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #456 <Method CollapsingToolbarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #462 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #466 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.widget.FrameLayout.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #380 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #467 <Method void CollapsingToolbarLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.widget.FrameLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.widget.FrameLayout.LayoutParams) (new LayoutParams(layoutparams)));
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #470 <Method void CollapsingToolbarLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public int getCollapsedTitleGravity()
	{
		return mCollapsingTextHelper.getCollapsedTextGravity();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:invokevirtual   #474 <Method int CollapsingTextHelper.getCollapsedTextGravity()>
	//    3    7:ireturn         
	}

	public Typeface getCollapsedTitleTypeface()
	{
		return mCollapsingTextHelper.getCollapsedTypeface();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:invokevirtual   #479 <Method Typeface CollapsingTextHelper.getCollapsedTypeface()>
	//    3    7:areturn         
	}

	public Drawable getContentScrim()
	{
		return mContentScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #394 <Field Drawable mContentScrim>
	//    2    4:areturn         
	}

	public int getExpandedTitleGravity()
	{
		return mCollapsingTextHelper.getExpandedTextGravity();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:invokevirtual   #486 <Method int CollapsingTextHelper.getExpandedTextGravity()>
	//    3    7:ireturn         
	}

	public int getExpandedTitleMarginBottom()
	{
		return mExpandedMarginBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int mExpandedMarginBottom>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginEnd()
	{
		return mExpandedMarginEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field int mExpandedMarginEnd>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginStart()
	{
		return mExpandedMarginStart;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field int mExpandedMarginStart>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginTop()
	{
		return mExpandedMarginTop;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field int mExpandedMarginTop>
	//    2    4:ireturn         
	}

	public Typeface getExpandedTitleTypeface()
	{
		return mCollapsingTextHelper.getExpandedTypeface();
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:invokevirtual   #494 <Method Typeface CollapsingTextHelper.getExpandedTypeface()>
	//    3    7:areturn         
	}

	final int getMaxOffsetForPinChild(View view)
	{
		ViewOffsetHelper viewoffsethelper = getViewOffsetHelper(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #497 <Method ViewOffsetHelper getViewOffsetHelper(View)>
	//    2    4:astore_2        
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #337 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    9:checkcast       #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    6   12:astore_3        
		return getHeight() - viewoffsethelper.getLayoutTop() - view.getHeight() - layoutparams.bottomMargin;
	//    7   13:aload_0         
	//    8   14:invokevirtual   #498 <Method int getHeight()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #501 <Method int ViewOffsetHelper.getLayoutTop()>
	//   11   21:isub            
	//   12   22:aload_1         
	//   13   23:invokevirtual   #342 <Method int View.getHeight()>
	//   14   26:isub            
	//   15   27:aload_3         
	//   16   28:getfield        #502 <Field int CollapsingToolbarLayout$LayoutParams.bottomMargin>
	//   17   31:isub            
	//   18   32:ireturn         
	}

	int getScrimAlpha()
	{
		return mScrimAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #268 <Field int mScrimAlpha>
	//    2    4:ireturn         
	}

	public long getScrimAnimationDuration()
	{
		return mScrimAnimationDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field long mScrimAnimationDuration>
	//    2    4:lreturn         
	}

	public int getScrimVisibleHeightTrigger()
	{
		if(mScrimVisibleHeightTrigger >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field int mScrimVisibleHeightTrigger>
	//*   2    4:iflt            12
			return mScrimVisibleHeightTrigger;
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field int mScrimVisibleHeightTrigger>
	//    5   11:ireturn         
		int i;
		int j;
		if(mLastInsets != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//*   8   16:ifnull          49
			i = mLastInsets.getSystemWindowInsetTop();
	//    9   19:aload_0         
	//   10   20:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//   11   23:invokevirtual   #416 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   12   26:istore_1        
		else
	//*  13   27:aload_0         
	//*  14   28:invokestatic    #509 <Method int ViewCompat.getMinimumHeight(View)>
	//*  15   31:istore_2        
	//*  16   32:iload_2         
	//*  17   33:ifle            54
	//*  18   36:iload_2         
	//*  19   37:iconst_2        
	//*  20   38:imul            
	//*  21   39:iload_1         
	//*  22   40:iadd            
	//*  23   41:aload_0         
	//*  24   42:invokevirtual   #498 <Method int getHeight()>
	//*  25   45:invokestatic    #514 <Method int Math.min(int, int)>
	//*  26   48:ireturn         
			i = 0;
	//   27   49:iconst_0        
	//   28   50:istore_1        
		j = ViewCompat.getMinimumHeight(((View) (this)));
		if(j > 0)
			return Math.min(j * 2 + i, getHeight());
		else
	//*  29   51:goto            27
			return getHeight() / 3;
	//   30   54:aload_0         
	//   31   55:invokevirtual   #498 <Method int getHeight()>
	//   32   58:iconst_3        
	//   33   59:idiv            
	//   34   60:ireturn         
	}

	public Drawable getStatusBarScrim()
	{
		return mStatusBarScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #409 <Field Drawable mStatusBarScrim>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		if(mCollapsingTitleEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//*   2    4:ifeq            15
			return mCollapsingTextHelper.getText();
	//    3    7:aload_0         
	//    4    8:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    5   11:invokevirtual   #519 <Method CharSequence CollapsingTextHelper.getText()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public boolean isTitleEnabled()
	{
		return mCollapsingTitleEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #523 <Method void FrameLayout.onAttachedToWindow()>
		ViewParent viewparent = getParent();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #524 <Method ViewParent getParent()>
	//    4    8:astore_1        
		if(viewparent instanceof AppBarLayout)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #526 <Class AppBarLayout>
	//*   7   13:ifeq            61
		{
			ViewCompat.setFitsSystemWindows(((View) (this)), ViewCompat.getFitsSystemWindows((View)viewparent));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #323 <Class View>
	//   11   21:invokestatic    #529 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//   12   24:invokestatic    #533 <Method void ViewCompat.setFitsSystemWindows(View, boolean)>
			if(mOnOffsetChangedListener == null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #535 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
	//*  15   31:ifnonnull       46
				mOnOffsetChangedListener = ((AppBarLayout.OnOffsetChangedListener) (new OffsetUpdateListener()));
	//   16   34:aload_0         
	//   17   35:new             #16  <Class CollapsingToolbarLayout$OffsetUpdateListener>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #536 <Method void CollapsingToolbarLayout$OffsetUpdateListener(CollapsingToolbarLayout)>
	//   21   43:putfield        #535 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
			((AppBarLayout)viewparent).addOnOffsetChangedListener(mOnOffsetChangedListener);
	//   22   46:aload_1         
	//   23   47:checkcast       #526 <Class AppBarLayout>
	//   24   50:aload_0         
	//   25   51:getfield        #535 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
	//   26   54:invokevirtual   #540 <Method void AppBarLayout.addOnOffsetChangedListener(AppBarLayout$OnOffsetChangedListener)>
			ViewCompat.requestApplyInsets(((View) (this)));
	//   27   57:aload_0         
	//   28   58:invokestatic    #543 <Method void ViewCompat.requestApplyInsets(View)>
		}
	//   29   61:return          
	}

	protected void onDetachedFromWindow()
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #524 <Method ViewParent getParent()>
	//    2    4:astore_1        
		if(mOnOffsetChangedListener != null && (viewparent instanceof AppBarLayout))
	//*   3    5:aload_0         
	//*   4    6:getfield        #535 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
	//*   5    9:ifnull          30
	//*   6   12:aload_1         
	//*   7   13:instanceof      #526 <Class AppBarLayout>
	//*   8   16:ifeq            30
			((AppBarLayout)viewparent).removeOnOffsetChangedListener(mOnOffsetChangedListener);
	//    9   19:aload_1         
	//   10   20:checkcast       #526 <Class AppBarLayout>
	//   11   23:aload_0         
	//   12   24:getfield        #535 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
	//   13   27:invokevirtual   #547 <Method void AppBarLayout.removeOnOffsetChangedListener(AppBarLayout$OnOffsetChangedListener)>
		super.onDetachedFromWindow();
	//   14   30:aload_0         
	//   15   31:invokespecial   #549 <Method void FrameLayout.onDetachedFromWindow()>
	//   16   34:return          
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
	//    6    8:invokespecial   #553 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		if(mLastInsets != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//*   9   15:ifnull          85
		{
			int k1 = mLastInsets.getSystemWindowInsetTop();
	//   10   18:aload_0         
	//   11   19:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//   12   22:invokevirtual   #416 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   13   25:istore          7
			int i1 = 0;
	//   14   27:iconst_0        
	//   15   28:istore          6
			for(int i2 = getChildCount(); i1 < i2; i1++)
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #315 <Method int getChildCount()>
	//*  18   34:istore          8
	//*  19   36:iload           6
	//*  20   38:iload           8
	//*  21   40:icmpge          85
			{
				View view = getChildAt(i1);
	//   22   43:aload_0         
	//   23   44:iload           6
	//   24   46:invokevirtual   #318 <Method View getChildAt(int)>
	//   25   49:astore          14
				if(!ViewCompat.getFitsSystemWindows(view) && view.getTop() < k1)
	//*  26   51:aload           14
	//*  27   53:invokestatic    #529 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  28   56:ifne            76
	//*  29   59:aload           14
	//*  30   61:invokevirtual   #556 <Method int View.getTop()>
	//*  31   64:iload           7
	//*  32   66:icmpge          76
					ViewCompat.offsetTopAndBottom(view, k1);
	//   33   69:aload           14
	//   34   71:iload           7
	//   35   73:invokestatic    #560 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			}

	//   36   76:iload           6
	//   37   78:iconst_1        
	//   38   79:iadd            
	//   39   80:istore          6
		}
	//*  40   82:goto            36
		if(mCollapsingTitleEnabled && mDummyView != null)
	//*  41   85:aload_0         
	//*  42   86:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//*  43   89:ifeq            366
	//*  44   92:aload_0         
	//*  45   93:getfield        #371 <Field View mDummyView>
	//*  46   96:ifnull          366
		{
			if(ViewCompat.isAttachedToWindow(mDummyView) && mDummyView.getVisibility() == 0)
	//*  47   99:aload_0         
	//*  48  100:getfield        #371 <Field View mDummyView>
	//*  49  103:invokestatic    #563 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  50  106:ifeq            396
	//*  51  109:aload_0         
	//*  52  110:getfield        #371 <Field View mDummyView>
	//*  53  113:invokevirtual   #566 <Method int View.getVisibility()>
	//*  54  116:ifne            396
				flag = true;
	//   55  119:iconst_1        
	//   56  120:istore_1        
			else
	//*  57  121:aload_0         
	//*  58  122:iload_1         
	//*  59  123:putfield        #406 <Field boolean mDrawCollapsingTitle>
	//*  60  126:aload_0         
	//*  61  127:getfield        #406 <Field boolean mDrawCollapsingTitle>
	//*  62  130:ifeq            366
	//*  63  133:aload_0         
	//*  64  134:invokestatic    #569 <Method int ViewCompat.getLayoutDirection(View)>
	//*  65  137:iconst_1        
	//*  66  138:icmpne          401
	//*  67  141:iconst_1        
	//*  68  142:istore          6
	//*  69  144:aload_0         
	//*  70  145:getfield        #301 <Field View mToolbarDirectChild>
	//*  71  148:ifnull          407
	//*  72  151:aload_0         
	//*  73  152:getfield        #301 <Field View mToolbarDirectChild>
	//*  74  155:astore          14
	//*  75  157:aload_0         
	//*  76  158:aload           14
	//*  77  160:invokevirtual   #571 <Method int getMaxOffsetForPinChild(View)>
	//*  78  163:istore          9
	//*  79  165:aload_0         
	//*  80  166:aload_0         
	//*  81  167:getfield        #371 <Field View mDummyView>
	//*  82  170:aload_0         
	//*  83  171:getfield        #72  <Field Rect mTmpRect>
	//*  84  174:invokestatic    #577 <Method void ViewGroupUtils.getDescendantRect(ViewGroup, View, Rect)>
	//*  85  177:aload_0         
	//*  86  178:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//*  87  181:astore          14
	//*  88  183:aload_0         
	//*  89  184:getfield        #72  <Field Rect mTmpRect>
	//*  90  187:getfield        #580 <Field int Rect.left>
	//*  91  190:istore          10
	//*  92  192:iload           6
	//*  93  194:ifeq            416
	//*  94  197:aload_0         
	//*  95  198:getfield        #299 <Field Toolbar mToolbar>
	//*  96  201:invokevirtual   #583 <Method int Toolbar.getTitleMarginEnd()>
	//*  97  204:istore          7
	//*  98  206:aload_0         
	//*  99  207:getfield        #72  <Field Rect mTmpRect>
	//* 100  210:getfield        #586 <Field int Rect.top>
	//* 101  213:istore          11
	//* 102  215:aload_0         
	//* 103  216:getfield        #299 <Field Toolbar mToolbar>
	//* 104  219:invokevirtual   #589 <Method int Toolbar.getTitleMarginTop()>
	//* 105  222:istore          12
	//* 106  224:aload_0         
	//* 107  225:getfield        #72  <Field Rect mTmpRect>
	//* 108  228:getfield        #592 <Field int Rect.right>
	//* 109  231:istore          13
	//* 110  233:iload           6
	//* 111  235:ifeq            428
	//* 112  238:aload_0         
	//* 113  239:getfield        #299 <Field Toolbar mToolbar>
	//* 114  242:invokevirtual   #595 <Method int Toolbar.getTitleMarginStart()>
	//* 115  245:istore          8
	//* 116  247:aload           14
	//* 117  249:iload           10
	//* 118  251:iload           7
	//* 119  253:iadd            
	//* 120  254:iload           12
	//* 121  256:iload           11
	//* 122  258:iload           9
	//* 123  260:iadd            
	//* 124  261:iadd            
	//* 125  262:iload           8
	//* 126  264:iload           13
	//* 127  266:iadd            
	//* 128  267:aload_0         
	//* 129  268:getfield        #72  <Field Rect mTmpRect>
	//* 130  271:getfield        #598 <Field int Rect.bottom>
	//* 131  274:iload           9
	//* 132  276:iadd            
	//* 133  277:aload_0         
	//* 134  278:getfield        #299 <Field Toolbar mToolbar>
	//* 135  281:invokevirtual   #601 <Method int Toolbar.getTitleMarginBottom()>
	//* 136  284:isub            
	//* 137  285:invokevirtual   #604 <Method void CollapsingTextHelper.setCollapsedBounds(int, int, int, int)>
	//* 138  288:aload_0         
	//* 139  289:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//* 140  292:astore          14
	//* 141  294:iload           6
	//* 142  296:ifeq            440
	//* 143  299:aload_0         
	//* 144  300:getfield        #144 <Field int mExpandedMarginEnd>
	//* 145  303:istore          7
	//* 146  305:aload_0         
	//* 147  306:getfield        #72  <Field Rect mTmpRect>
	//* 148  309:getfield        #586 <Field int Rect.top>
	//* 149  312:istore          8
	//* 150  314:aload_0         
	//* 151  315:getfield        #146 <Field int mExpandedMarginTop>
	//* 152  318:istore          9
	//* 153  320:iload           6
	//* 154  322:ifeq            449
	//* 155  325:aload_0         
	//* 156  326:getfield        #148 <Field int mExpandedMarginStart>
	//* 157  329:istore          6
	//* 158  331:aload           14
	//* 159  333:iload           7
	//* 160  335:iload           9
	//* 161  337:iload           8
	//* 162  339:iadd            
	//* 163  340:iload           4
	//* 164  342:iload_2         
	//* 165  343:isub            
	//* 166  344:iload           6
	//* 167  346:isub            
	//* 168  347:iload           5
	//* 169  349:iload_3         
	//* 170  350:isub            
	//* 171  351:aload_0         
	//* 172  352:getfield        #142 <Field int mExpandedMarginBottom>
	//* 173  355:isub            
	//* 174  356:invokevirtual   #607 <Method void CollapsingTextHelper.setExpandedBounds(int, int, int, int)>
	//* 175  359:aload_0         
	//* 176  360:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//* 177  363:invokevirtual   #610 <Method void CollapsingTextHelper.recalculate()>
	//* 178  366:iconst_0        
	//* 179  367:istore_2        
	//* 180  368:aload_0         
	//* 181  369:invokevirtual   #315 <Method int getChildCount()>
	//* 182  372:istore_3        
	//* 183  373:iload_2         
	//* 184  374:iload_3         
	//* 185  375:icmpge          458
	//* 186  378:aload_0         
	//* 187  379:iload_2         
	//* 188  380:invokevirtual   #318 <Method View getChildAt(int)>
	//* 189  383:invokestatic    #497 <Method ViewOffsetHelper getViewOffsetHelper(View)>
	//* 190  386:invokevirtual   #613 <Method void ViewOffsetHelper.onViewLayout()>
	//* 191  389:iload_2         
	//* 192  390:iconst_1        
	//* 193  391:iadd            
	//* 194  392:istore_2        
	//* 195  393:goto            373
				flag = false;
	//  196  396:iconst_0        
	//  197  397:istore_1        
			mDrawCollapsingTitle = flag;
			if(mDrawCollapsingTitle)
			{
				int j1;
				int l1;
				int j2;
				int k2;
				int l2;
				int i3;
				int j3;
				int k3;
				Object obj;
				if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
					j1 = 1;
				else
	//* 198  398:goto            121
					j1 = 0;
	//  199  401:iconst_0        
	//  200  402:istore          6
				if(mToolbarDirectChild != null)
					obj = ((Object) (mToolbarDirectChild));
				else
	//* 201  404:goto            144
					obj = ((Object) (mToolbar));
	//  202  407:aload_0         
	//  203  408:getfield        #299 <Field Toolbar mToolbar>
	//  204  411:astore          14
				k2 = getMaxOffsetForPinChild(((View) (obj)));
				ViewGroupUtils.getDescendantRect(((ViewGroup) (this)), mDummyView, mTmpRect);
				obj = ((Object) (mCollapsingTextHelper));
				l2 = mTmpRect.left;
				if(j1 != 0)
					l1 = mToolbar.getTitleMarginEnd();
				else
	//* 205  413:goto            157
					l1 = mToolbar.getTitleMarginStart();
	//  206  416:aload_0         
	//  207  417:getfield        #299 <Field Toolbar mToolbar>
	//  208  420:invokevirtual   #595 <Method int Toolbar.getTitleMarginStart()>
	//  209  423:istore          7
				i3 = mTmpRect.top;
				j3 = mToolbar.getTitleMarginTop();
				k3 = mTmpRect.right;
				if(j1 != 0)
					j2 = mToolbar.getTitleMarginStart();
				else
	//* 210  425:goto            206
					j2 = mToolbar.getTitleMarginEnd();
	//  211  428:aload_0         
	//  212  429:getfield        #299 <Field Toolbar mToolbar>
	//  213  432:invokevirtual   #583 <Method int Toolbar.getTitleMarginEnd()>
	//  214  435:istore          8
				((CollapsingTextHelper) (obj)).setCollapsedBounds(l2 + l1, j3 + (i3 + k2), j2 + k3, (mTmpRect.bottom + k2) - mToolbar.getTitleMarginBottom());
				obj = ((Object) (mCollapsingTextHelper));
				if(j1 != 0)
					l1 = mExpandedMarginEnd;
				else
	//* 215  437:goto            247
					l1 = mExpandedMarginStart;
	//  216  440:aload_0         
	//  217  441:getfield        #148 <Field int mExpandedMarginStart>
	//  218  444:istore          7
				j2 = mTmpRect.top;
				k2 = mExpandedMarginTop;
				if(j1 != 0)
					j1 = mExpandedMarginStart;
				else
	//* 219  446:goto            305
					j1 = mExpandedMarginEnd;
	//  220  449:aload_0         
	//  221  450:getfield        #144 <Field int mExpandedMarginEnd>
	//  222  453:istore          6
				((CollapsingTextHelper) (obj)).setExpandedBounds(l1, k2 + j2, k - i - j1, l - j - mExpandedMarginBottom);
				mCollapsingTextHelper.recalculate();
			}
		}
		i = 0;
		for(j = getChildCount(); i < j; i++)
			getViewOffsetHelper(getChildAt(i)).onViewLayout();

	//* 223  455:goto            331
		if(mToolbar != null)
	//* 224  458:aload_0         
	//* 225  459:getfield        #299 <Field Toolbar mToolbar>
	//* 226  462:ifnull          525
		{
			if(mCollapsingTitleEnabled && TextUtils.isEmpty(mCollapsingTextHelper.getText()))
	//* 227  465:aload_0         
	//* 228  466:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//* 229  469:ifeq            499
	//* 230  472:aload_0         
	//* 231  473:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//* 232  476:invokevirtual   #519 <Method CharSequence CollapsingTextHelper.getText()>
	//* 233  479:invokestatic    #619 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 234  482:ifeq            499
				mCollapsingTextHelper.setText(mToolbar.getTitle());
	//  235  485:aload_0         
	//  236  486:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//  237  489:aload_0         
	//  238  490:getfield        #299 <Field Toolbar mToolbar>
	//  239  493:invokevirtual   #621 <Method CharSequence Toolbar.getTitle()>
	//  240  496:invokevirtual   #624 <Method void CollapsingTextHelper.setText(CharSequence)>
			if(mToolbarDirectChild == null || mToolbarDirectChild == this)
	//* 241  499:aload_0         
	//* 242  500:getfield        #301 <Field View mToolbarDirectChild>
	//* 243  503:ifnull          514
	//* 244  506:aload_0         
	//* 245  507:getfield        #301 <Field View mToolbarDirectChild>
	//* 246  510:aload_0         
	//* 247  511:if_acmpne       530
				setMinimumHeight(getHeightWithMargins(((View) (mToolbar))));
	//  248  514:aload_0         
	//  249  515:aload_0         
	//  250  516:getfield        #299 <Field Toolbar mToolbar>
	//  251  519:invokestatic    #626 <Method int getHeightWithMargins(View)>
	//  252  522:invokevirtual   #629 <Method void setMinimumHeight(int)>
			else
	//* 253  525:aload_0         
	//* 254  526:invokevirtual   #632 <Method void updateScrimVisibility()>
	//* 255  529:return          
				setMinimumHeight(getHeightWithMargins(mToolbarDirectChild));
	//  256  530:aload_0         
	//  257  531:aload_0         
	//  258  532:getfield        #301 <Field View mToolbarDirectChild>
	//  259  535:invokestatic    #626 <Method int getHeightWithMargins(View)>
	//  260  538:invokevirtual   #629 <Method void setMinimumHeight(int)>
		}
		updateScrimVisibility();
	//* 261  541:goto            525
	}

	protected void onMeasure(int i, int j)
	{
		ensureToolbar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #257 <Method void ensureToolbar()>
		super.onMeasure(i, j);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #635 <Method void FrameLayout.onMeasure(int, int)>
		int k = android.view.View.MeasureSpec.getMode(j);
	//    6   10:iload_2         
	//    7   11:invokestatic    #641 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   14:istore_3        
		if(mLastInsets != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//*  11   19:ifnull          56
			j = mLastInsets.getSystemWindowInsetTop();
	//   12   22:aload_0         
	//   13   23:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//   14   26:invokevirtual   #416 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   15   29:istore_2        
		else
	//*  16   30:iload_3         
	//*  17   31:ifne            55
	//*  18   34:iload_2         
	//*  19   35:ifle            55
	//*  20   38:aload_0         
	//*  21   39:iload_1         
	//*  22   40:aload_0         
	//*  23   41:invokevirtual   #644 <Method int getMeasuredHeight()>
	//*  24   44:iload_2         
	//*  25   45:iadd            
	//*  26   46:ldc2            #645 <Int 0x40000000>
	//*  27   49:invokestatic    #648 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  28   52:invokespecial   #635 <Method void FrameLayout.onMeasure(int, int)>
	//*  29   55:return          
			j = 0;
	//   30   56:iconst_0        
	//   31   57:istore_2        
		if(k == 0 && j > 0)
			super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + j, 0x40000000));
	//*  32   58:goto            30
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #651 <Method void FrameLayout.onSizeChanged(int, int, int, int)>
		if(mContentScrim != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #394 <Field Drawable mContentScrim>
	//*   8   13:ifnull          27
			mContentScrim.setBounds(0, 0, i, j);
	//    9   16:aload_0         
	//   10   17:getfield        #394 <Field Drawable mContentScrim>
	//   11   20:iconst_0        
	//   12   21:iconst_0        
	//   13   22:iload_1         
	//   14   23:iload_2         
	//   15   24:invokevirtual   #425 <Method void Drawable.setBounds(int, int, int, int)>
	//   16   27:return          
	}

	WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat windowinsetscompat)
	{
		WindowInsetsCompat windowinsetscompat1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #529 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   4    6:ifeq            11
			windowinsetscompat1 = windowinsetscompat;
	//    5    9:aload_1         
	//    6   10:astore_2        
		if(!ObjectsCompat.equals(((Object) (mLastInsets)), ((Object) (windowinsetscompat1))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//*   9   15:aload_2         
	//*  10   16:invokestatic    #659 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  11   19:ifne            31
		{
			mLastInsets = windowinsetscompat1;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #411 <Field WindowInsetsCompat mLastInsets>
			requestLayout();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #662 <Method void requestLayout()>
		}
		return windowinsetscompat.consumeSystemWindowInsets();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #666 <Method WindowInsetsCompat WindowInsetsCompat.consumeSystemWindowInsets()>
	//   19   35:areturn         
	}

	public void setCollapsedTitleGravity(int i)
	{
		mCollapsingTextHelper.setCollapsedTextGravity(i);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #134 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextAppearance(int i)
	{
		mCollapsingTextHelper.setCollapsedTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #198 <Method void CollapsingTextHelper.setCollapsedTextAppearance(int)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextColor(int i)
	{
		setCollapsedTitleTextColor(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #677 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #680 <Method void setCollapsedTitleTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextColor(ColorStateList colorstatelist)
	{
		mCollapsingTextHelper.setCollapsedTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #683 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setCollapsedTitleTypeface(Typeface typeface)
	{
		mCollapsingTextHelper.setCollapsedTypeface(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #688 <Method void CollapsingTextHelper.setCollapsedTypeface(Typeface)>
	//    4    8:return          
	}

	public void setContentScrim(Drawable drawable)
	{
		Drawable drawable1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(mContentScrim != drawable)
	//*   2    2:aload_0         
	//*   3    3:getfield        #394 <Field Drawable mContentScrim>
	//*   4    6:aload_1         
	//*   5    7:if_acmpeq       86
		{
			if(mContentScrim != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #394 <Field Drawable mContentScrim>
	//*   8   14:ifnull          25
				mContentScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    9   17:aload_0         
	//   10   18:getfield        #394 <Field Drawable mContentScrim>
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #692 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          34
				drawable1 = drawable.mutate();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #400 <Method Drawable Drawable.mutate()>
	//   17   33:astore_2        
			mContentScrim = drawable1;
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #394 <Field Drawable mContentScrim>
			if(mContentScrim != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #394 <Field Drawable mContentScrim>
	//*  23   43:ifnull          82
			{
				mContentScrim.setBounds(0, 0, getWidth(), getHeight());
	//   24   46:aload_0         
	//   25   47:getfield        #394 <Field Drawable mContentScrim>
	//   26   50:iconst_0        
	//   27   51:iconst_0        
	//   28   52:aload_0         
	//   29   53:invokevirtual   #421 <Method int getWidth()>
	//   30   56:aload_0         
	//   31   57:invokevirtual   #498 <Method int getHeight()>
	//   32   60:invokevirtual   #425 <Method void Drawable.setBounds(int, int, int, int)>
				mContentScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   33   63:aload_0         
	//   34   64:getfield        #394 <Field Drawable mContentScrim>
	//   35   67:aload_0         
	//   36   68:invokevirtual   #692 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				mContentScrim.setAlpha(mScrimAlpha);
	//   37   71:aload_0         
	//   38   72:getfield        #394 <Field Drawable mContentScrim>
	//   39   75:aload_0         
	//   40   76:getfield        #268 <Field int mScrimAlpha>
	//   41   79:invokevirtual   #403 <Method void Drawable.setAlpha(int)>
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   42   82:aload_0         
	//   43   83:invokestatic    #695 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   44   86:return          
	}

	public void setContentScrimColor(int i)
	{
		setContentScrim(((Drawable) (new ColorDrawable(i))));
	//    0    0:aload_0         
	//    1    1:new             #698 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #700 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #226 <Method void setContentScrim(Drawable)>
	//    6   12:return          
	}

	public void setContentScrimResource(int i)
	{
		setContentScrim(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #380 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #707 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #226 <Method void setContentScrim(Drawable)>
	//    6   12:return          
	}

	public void setExpandedTitleColor(int i)
	{
		setExpandedTitleTextColor(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #677 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #711 <Method void setExpandedTitleTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setExpandedTitleGravity(int i)
	{
		mCollapsingTextHelper.setExpandedTextGravity(i);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #127 <Method void CollapsingTextHelper.setExpandedTextGravity(int)>
	//    4    8:return          
	}

	public void setExpandedTitleMargin(int i, int j, int k, int l)
	{
		mExpandedMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #148 <Field int mExpandedMarginStart>
		mExpandedMarginTop = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #146 <Field int mExpandedMarginTop>
		mExpandedMarginEnd = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #144 <Field int mExpandedMarginEnd>
		mExpandedMarginBottom = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #142 <Field int mExpandedMarginBottom>
		requestLayout();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #662 <Method void requestLayout()>
	//   14   25:return          
	}

	public void setExpandedTitleMarginBottom(int i)
	{
		mExpandedMarginBottom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #142 <Field int mExpandedMarginBottom>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #662 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginEnd(int i)
	{
		mExpandedMarginEnd = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #144 <Field int mExpandedMarginEnd>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #662 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginStart(int i)
	{
		mExpandedMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #148 <Field int mExpandedMarginStart>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #662 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginTop(int i)
	{
		mExpandedMarginTop = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #146 <Field int mExpandedMarginTop>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #662 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleTextAppearance(int i)
	{
		mCollapsingTextHelper.setExpandedTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #190 <Method void CollapsingTextHelper.setExpandedTextAppearance(int)>
	//    4    8:return          
	}

	public void setExpandedTitleTextColor(ColorStateList colorstatelist)
	{
		mCollapsingTextHelper.setExpandedTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #721 <Method void CollapsingTextHelper.setExpandedTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setExpandedTitleTypeface(Typeface typeface)
	{
		mCollapsingTextHelper.setExpandedTypeface(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #725 <Method void CollapsingTextHelper.setExpandedTypeface(Typeface)>
	//    4    8:return          
	}

	void setScrimAlpha(int i)
	{
		if(i != mScrimAlpha)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #268 <Field int mScrimAlpha>
	//*   3    5:icmpeq          38
		{
			if(mContentScrim != null && mToolbar != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #394 <Field Drawable mContentScrim>
	//*   6   12:ifnull          29
	//*   7   15:aload_0         
	//*   8   16:getfield        #299 <Field Toolbar mToolbar>
	//*   9   19:ifnull          29
				ViewCompat.postInvalidateOnAnimation(((View) (mToolbar)));
	//   10   22:aload_0         
	//   11   23:getfield        #299 <Field Toolbar mToolbar>
	//   12   26:invokestatic    #695 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			mScrimAlpha = i;
	//   13   29:aload_0         
	//   14   30:iload_1         
	//   15   31:putfield        #268 <Field int mScrimAlpha>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   16   34:aload_0         
	//   17   35:invokestatic    #695 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   18   38:return          
	}

	public void setScrimAnimationDuration(long l)
	{
		mScrimAnimationDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #215 <Field long mScrimAnimationDuration>
	//    3    5:return          
	}

	public void setScrimVisibleHeightTrigger(int i)
	{
		if(mScrimVisibleHeightTrigger != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field int mScrimVisibleHeightTrigger>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mScrimVisibleHeightTrigger = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #74  <Field int mScrimVisibleHeightTrigger>
			updateScrimVisibility();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #632 <Method void updateScrimVisibility()>
		}
	//    9   17:return          
	}

	public void setScrimsShown(boolean flag)
	{
		boolean flag1;
		if(ViewCompat.isLaidOut(((View) (this))) && !isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #737 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #740 <Method boolean isInEditMode()>
	//*   5   11:ifne            23
			flag1 = true;
	//    6   14:iconst_1        
	//    7   15:istore_2        
		else
	//*   8   16:aload_0         
	//*   9   17:iload_1         
	//*  10   18:iload_2         
	//*  11   19:invokevirtual   #743 <Method void setScrimsShown(boolean, boolean)>
	//*  12   22:return          
			flag1 = false;
	//   13   23:iconst_0        
	//   14   24:istore_2        
		setScrimsShown(flag, flag1);
	//*  15   25:goto            16
	}

	public void setScrimsShown(boolean flag, boolean flag1)
	{
		char c = '\377';
	//    0    0:sipush          255
	//    1    3:istore_3        
		if(mScrimsAreShown != flag)
	//*   2    4:aload_0         
	//*   3    5:getfield        #745 <Field boolean mScrimsAreShown>
	//*   4    8:iload_1         
	//*   5    9:icmpeq          30
		{
			if(flag1)
	//*   6   12:iload_2         
	//*   7   13:ifeq            36
			{
				if(!flag)
	//*   8   16:iload_1         
	//*   9   17:ifeq            31
	//*  10   20:aload_0         
	//*  11   21:iload_3         
	//*  12   22:invokespecial   #747 <Method void animateScrim(int)>
	//*  13   25:aload_0         
	//*  14   26:iload_1         
	//*  15   27:putfield        #745 <Field boolean mScrimsAreShown>
	//*  16   30:return          
					c = '\0';
	//   17   31:iconst_0        
	//   18   32:istore_3        
				animateScrim(((int) (c)));
			} else
	//*  19   33:goto            20
			{
				if(!flag)
	//*  20   36:iload_1         
	//*  21   37:ifeq            48
	//*  22   40:aload_0         
	//*  23   41:iload_3         
	//*  24   42:invokevirtual   #749 <Method void setScrimAlpha(int)>
	//*  25   45:goto            25
					c = '\0';
	//   26   48:iconst_0        
	//   27   49:istore_3        
				setScrimAlpha(((int) (c)));
			}
			mScrimsAreShown = flag;
		}
	//*  28   50:goto            40
	}

	public void setStatusBarScrim(Drawable drawable)
	{
		Drawable drawable1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(mStatusBarScrim != drawable)
	//*   2    2:aload_0         
	//*   3    3:getfield        #409 <Field Drawable mStatusBarScrim>
	//*   4    6:aload_1         
	//*   5    7:if_acmpeq       124
		{
			if(mStatusBarScrim != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #409 <Field Drawable mStatusBarScrim>
	//*   8   14:ifnull          25
				mStatusBarScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    9   17:aload_0         
	//   10   18:getfield        #409 <Field Drawable mStatusBarScrim>
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #692 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          34
				drawable1 = drawable.mutate();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #400 <Method Drawable Drawable.mutate()>
	//   17   33:astore_3        
			mStatusBarScrim = drawable1;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:putfield        #409 <Field Drawable mStatusBarScrim>
			if(mStatusBarScrim != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  23   43:ifnull          120
			{
				if(mStatusBarScrim.isStateful())
	//*  24   46:aload_0         
	//*  25   47:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  26   50:invokevirtual   #441 <Method boolean Drawable.isStateful()>
	//*  27   53:ifeq            68
					mStatusBarScrim.setState(getDrawableState());
	//   28   56:aload_0         
	//   29   57:getfield        #409 <Field Drawable mStatusBarScrim>
	//   30   60:aload_0         
	//   31   61:invokevirtual   #438 <Method int[] getDrawableState()>
	//   32   64:invokevirtual   #445 <Method boolean Drawable.setState(int[])>
	//   33   67:pop             
				DrawableCompat.setLayoutDirection(mStatusBarScrim, ViewCompat.getLayoutDirection(((View) (this))));
	//   34   68:aload_0         
	//   35   69:getfield        #409 <Field Drawable mStatusBarScrim>
	//   36   72:aload_0         
	//   37   73:invokestatic    #569 <Method int ViewCompat.getLayoutDirection(View)>
	//   38   76:invokestatic    #755 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   39   79:pop             
				drawable = mStatusBarScrim;
	//   40   80:aload_0         
	//   41   81:getfield        #409 <Field Drawable mStatusBarScrim>
	//   42   84:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  43   85:aload_0         
	//*  44   86:invokevirtual   #756 <Method int getVisibility()>
	//*  45   89:ifne            125
					flag = true;
	//   46   92:iconst_1        
	//   47   93:istore_2        
				else
	//*  48   94:aload_1         
	//*  49   95:iload_2         
	//*  50   96:iconst_0        
	//*  51   97:invokevirtual   #760 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  52  100:pop             
	//*  53  101:aload_0         
	//*  54  102:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  55  105:aload_0         
	//*  56  106:invokevirtual   #692 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//*  57  109:aload_0         
	//*  58  110:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  59  113:aload_0         
	//*  60  114:getfield        #268 <Field int mScrimAlpha>
	//*  61  117:invokevirtual   #403 <Method void Drawable.setAlpha(int)>
	//*  62  120:aload_0         
	//*  63  121:invokestatic    #695 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//*  64  124:return          
					flag = false;
	//   65  125:iconst_0        
	//   66  126:istore_2        
				drawable.setVisible(flag, false);
				mStatusBarScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
				mStatusBarScrim.setAlpha(mScrimAlpha);
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
		}
	//*  67  127:goto            94
	}

	public void setStatusBarScrimColor(int i)
	{
		setStatusBarScrim(((Drawable) (new ColorDrawable(i))));
	//    0    0:aload_0         
	//    1    1:new             #698 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #700 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #232 <Method void setStatusBarScrim(Drawable)>
	//    6   12:return          
	}

	public void setStatusBarScrimResource(int i)
	{
		setStatusBarScrim(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #380 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #707 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #232 <Method void setStatusBarScrim(Drawable)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mCollapsingTextHelper.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #624 <Method void CollapsingTextHelper.setText(CharSequence)>
	//    4    8:return          
	}

	public void setTitleEnabled(boolean flag)
	{
		if(flag != mCollapsingTitleEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//*   3    5:icmpeq          21
		{
			mCollapsingTitleEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #173 <Field boolean mCollapsingTitleEnabled>
			updateDummyView();
	//    7   13:aload_0         
	//    8   14:invokespecial   #321 <Method void updateDummyView()>
			requestLayout();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #662 <Method void requestLayout()>
		}
	//   11   21:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #766 <Method void FrameLayout.setVisibility(int)>
		boolean flag;
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            68
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:aload_0         
	//*   8   12:getfield        #409 <Field Drawable mStatusBarScrim>
	//*   9   15:ifnull          39
	//*  10   18:aload_0         
	//*  11   19:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  12   22:invokevirtual   #769 <Method boolean Drawable.isVisible()>
	//*  13   25:iload_2         
	//*  14   26:icmpeq          39
	//*  15   29:aload_0         
	//*  16   30:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  17   33:iload_2         
	//*  18   34:iconst_0        
	//*  19   35:invokevirtual   #760 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  20   38:pop             
	//*  21   39:aload_0         
	//*  22   40:getfield        #394 <Field Drawable mContentScrim>
	//*  23   43:ifnull          67
	//*  24   46:aload_0         
	//*  25   47:getfield        #394 <Field Drawable mContentScrim>
	//*  26   50:invokevirtual   #769 <Method boolean Drawable.isVisible()>
	//*  27   53:iload_2         
	//*  28   54:icmpeq          67
	//*  29   57:aload_0         
	//*  30   58:getfield        #394 <Field Drawable mContentScrim>
	//*  31   61:iload_2         
	//*  32   62:iconst_0        
	//*  33   63:invokevirtual   #760 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  34   66:pop             
	//*  35   67:return          
			flag = false;
	//   36   68:iconst_0        
	//   37   69:istore_2        
		if(mStatusBarScrim != null && mStatusBarScrim.isVisible() != flag)
			mStatusBarScrim.setVisible(flag, false);
		if(mContentScrim != null && mContentScrim.isVisible() != flag)
			mContentScrim.setVisible(flag, false);
	//*  38   70:goto            11
	}

	final void updateScrimVisibility()
	{
		if(mContentScrim != null || mStatusBarScrim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #394 <Field Drawable mContentScrim>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #409 <Field Drawable mStatusBarScrim>
	//*   5   11:ifnull          37
		{
			boolean flag;
			if(getHeight() + mCurrentOffset < getScrimVisibleHeightTrigger())
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #498 <Method int getHeight()>
	//*   8   18:aload_0         
	//*   9   19:getfield        #418 <Field int mCurrentOffset>
	//*  10   22:iadd            
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #771 <Method int getScrimVisibleHeightTrigger()>
	//*  13   27:icmpge          38
				flag = true;
	//   14   30:iconst_1        
	//   15   31:istore_1        
			else
	//*  16   32:aload_0         
	//*  17   33:iload_1         
	//*  18   34:invokevirtual   #773 <Method void setScrimsShown(boolean)>
	//*  19   37:return          
				flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_1        
			setScrimsShown(flag);
		}
	//*  22   40:goto            32
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mContentScrim || drawable == mStatusBarScrim;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #777 <Method boolean FrameLayout.verifyDrawable(Drawable)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #394 <Field Drawable mContentScrim>
	//    7   13:if_acmpeq       24
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #409 <Field Drawable mStatusBarScrim>
	//   11   21:if_acmpne       26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
	final CollapsingTextHelper mCollapsingTextHelper;
	private boolean mCollapsingTitleEnabled;
	private Drawable mContentScrim;
	int mCurrentOffset;
	private boolean mDrawCollapsingTitle;
	private View mDummyView;
	private int mExpandedMarginBottom;
	private int mExpandedMarginEnd;
	private int mExpandedMarginStart;
	private int mExpandedMarginTop;
	WindowInsetsCompat mLastInsets;
	private AppBarLayout.OnOffsetChangedListener mOnOffsetChangedListener;
	private boolean mRefreshToolbar;
	private int mScrimAlpha;
	private long mScrimAnimationDuration;
	private ValueAnimator mScrimAnimator;
	private int mScrimVisibleHeightTrigger;
	private boolean mScrimsAreShown;
	Drawable mStatusBarScrim;
	private final Rect mTmpRect;
	private Toolbar mToolbar;
	private View mToolbarDirectChild;
	private int mToolbarId;
}
