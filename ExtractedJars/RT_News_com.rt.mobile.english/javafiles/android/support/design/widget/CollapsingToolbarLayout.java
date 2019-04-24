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
import android.support.v4.widget.ViewGroupUtils;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.design.widget:
//			ThemeUtils, CollapsingTextHelper, AnimationUtils, ViewOffsetHelper, 
//			AppBarLayout

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
			mCurrentOffset = i;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//    2    4:iload_2         
		//    3    5:putfield        #25  <Field int CollapsingToolbarLayout.mCurrentOffset>
			int j;
			if(mLastInsets != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//*   6   12:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
		//*   7   15:ifnull          32
				j = mLastInsets.getSystemWindowInsetTop();
		//    8   18:aload_0         
		//    9   19:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   10   22:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
		//   11   25:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
		//   12   28:istore_3        
			else
		//*  13   29:goto            34
				j = 0;
		//   14   32:iconst_0        
		//   15   33:istore_3        
			int i1 = getChildCount();
		//   16   34:aload_0         
		//   17   35:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   18   38:invokevirtual   #38  <Method int CollapsingToolbarLayout.getChildCount()>
		//   19   41:istore          5
			for(int k = 0; k < i1; k++)
		//*  20   43:iconst_0        
		//*  21   44:istore          4
		//*  22   46:iload           4
		//*  23   48:iload           5
		//*  24   50:icmpge          157
			{
				appbarlayout = ((AppBarLayout) (getChildAt(k)));
		//   25   53:aload_0         
		//   26   54:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   27   57:iload           4
		//   28   59:invokevirtual   #42  <Method View CollapsingToolbarLayout.getChildAt(int)>
		//   29   62:astore_1        
				LayoutParams layoutparams = (LayoutParams)((View) (appbarlayout)).getLayoutParams();
		//   30   63:aload_1         
		//   31   64:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   32   67:checkcast       #50  <Class CollapsingToolbarLayout$LayoutParams>
		//   33   70:astore          6
				ViewOffsetHelper viewoffsethelper = CollapsingToolbarLayout.getViewOffsetHelper(((View) (appbarlayout)));
		//   34   72:aload_1         
		//   35   73:invokestatic    #54  <Method ViewOffsetHelper CollapsingToolbarLayout.getViewOffsetHelper(View)>
		//   36   76:astore          7
				switch(layoutparams.mCollapseMode)
		//*  37   78:aload           6
		//*  38   80:getfield        #57  <Field int CollapsingToolbarLayout$LayoutParams.mCollapseMode>
				{
		//*  39   83:tableswitch     1 2: default 104
		//		               1 128
		//		               2 107
		//*  40  104:goto            148
				case 2: // '\002'
					viewoffsethelper.setTopAndBottomOffset(Math.round((float)(-i) * layoutparams.mParallaxMult));
		//   41  107:aload           7
		//   42  109:iload_2         
		//   43  110:ineg            
		//   44  111:i2f             
		//   45  112:aload           6
		//   46  114:getfield        #61  <Field float CollapsingToolbarLayout$LayoutParams.mParallaxMult>
		//   47  117:fmul            
		//   48  118:invokestatic    #67  <Method int Math.round(float)>
		//   49  121:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
		//   50  124:pop             
					break;

		//*  51  125:goto            148
				case 1: // '\001'
					viewoffsethelper.setTopAndBottomOffset(MathUtils.clamp(-i, 0, getMaxOffsetForPinChild(((View) (appbarlayout)))));
		//   52  128:aload           7
		//   53  130:iload_2         
		//   54  131:ineg            
		//   55  132:iconst_0        
		//   56  133:aload_0         
		//   57  134:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   58  137:aload_1         
		//   59  138:invokevirtual   #77  <Method int CollapsingToolbarLayout.getMaxOffsetForPinChild(View)>
		//   60  141:invokestatic    #83  <Method int MathUtils.clamp(int, int, int)>
		//   61  144:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
		//   62  147:pop             
					break;
				}
			}

		//   63  148:iload           4
		//   64  150:iconst_1        
		//   65  151:iadd            
		//   66  152:istore          4
		//*  67  154:goto            46
			updateScrimVisibility();
		//   68  157:aload_0         
		//   69  158:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   70  161:invokevirtual   #86  <Method void CollapsingToolbarLayout.updateScrimVisibility()>
			if(mStatusBarScrim != null && j > 0)
		//*  71  164:aload_0         
		//*  72  165:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//*  73  168:getfield        #90  <Field Drawable CollapsingToolbarLayout.mStatusBarScrim>
		//*  74  171:ifnull          185
		//*  75  174:iload_3         
		//*  76  175:ifle            185
				ViewCompat.postInvalidateOnAnimation(((View) (CollapsingToolbarLayout.this)));
		//   77  178:aload_0         
		//   78  179:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   79  182:invokestatic    #96  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			int l = getHeight();
		//   80  185:aload_0         
		//   81  186:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   82  189:invokevirtual   #99  <Method int CollapsingToolbarLayout.getHeight()>
		//   83  192:istore          4
			i1 = ViewCompat.getMinimumHeight(((View) (CollapsingToolbarLayout.this)));
		//   84  194:aload_0         
		//   85  195:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   86  198:invokestatic    #102 <Method int ViewCompat.getMinimumHeight(View)>
		//   87  201:istore          5
			mCollapsingTextHelper.setExpansionFraction((float)Math.abs(i) / (float)(l - i1 - j));
		//   88  203:aload_0         
		//   89  204:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   90  207:getfield        #106 <Field CollapsingTextHelper CollapsingToolbarLayout.mCollapsingTextHelper>
		//   91  210:iload_2         
		//   92  211:invokestatic    #110 <Method int Math.abs(int)>
		//   93  214:i2f             
		//   94  215:iload           4
		//   95  217:iload           5
		//   96  219:isub            
		//   97  220:iload_3         
		//   98  221:isub            
		//   99  222:i2f             
		//  100  223:fdiv            
		//  101  224:invokevirtual   #116 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		//  102  227:return          
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
		if(mScrimAnimator == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//*   4    8:ifnonnull       81
		{
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
	//*  22   44:icmple          54
				interpolator = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
	//   23   47:getstatic       #271 <Field android.view.animation.Interpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   24   50:astore_2        
			else
	//*  25   51:goto            58
				interpolator = AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
	//   26   54:getstatic       #274 <Field android.view.animation.Interpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   27   57:astore_2        
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (interpolator)));
	//   28   58:aload_3         
	//   29   59:aload_2         
	//   30   60:invokevirtual   #278 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
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
	//   31   63:aload_0         
	//   32   64:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//   33   67:new             #8   <Class CollapsingToolbarLayout$2>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:invokespecial   #279 <Method void CollapsingToolbarLayout$2(CollapsingToolbarLayout)>
	//   37   75:invokevirtual   #283 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		} else
	//*  38   78:goto            98
		if(mScrimAnimator.isRunning())
	//*  39   81:aload_0         
	//*  40   82:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//*  41   85:invokevirtual   #287 <Method boolean ValueAnimator.isRunning()>
	//*  42   88:ifeq            98
			mScrimAnimator.cancel();
	//   43   91:aload_0         
	//   44   92:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//   45   95:invokevirtual   #290 <Method void ValueAnimator.cancel()>
		mScrimAnimator.setIntValues(new int[] {
			mScrimAlpha, i
		});
	//   46   98:aload_0         
	//   47   99:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//   48  102:iconst_2        
	//   49  103:newarray        int[]
	//   50  105:dup             
	//   51  106:iconst_0        
	//   52  107:aload_0         
	//   53  108:getfield        #268 <Field int mScrimAlpha>
	//   54  111:iastore         
	//   55  112:dup             
	//   56  113:iconst_1        
	//   57  114:iload_1         
	//   58  115:iastore         
	//   59  116:invokevirtual   #294 <Method void ValueAnimator.setIntValues(int[])>
		mScrimAnimator.start();
	//   60  119:aload_0         
	//   61  120:getfield        #259 <Field ValueAnimator mScrimAnimator>
	//   62  123:invokevirtual   #297 <Method void ValueAnimator.start()>
	//   63  126:return          
	}

	private void ensureToolbar()
	{
		if(!mRefreshToolbar)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field boolean mRefreshToolbar>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj1 = null;
	//    4    8:aconst_null     
	//    5    9:astore          4
		mToolbar = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #299 <Field Toolbar mToolbar>
		mToolbarDirectChild = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #301 <Field View mToolbarDirectChild>
		if(mToolbarId != -1)
	//*  12   21:aload_0         
	//*  13   22:getfield        #237 <Field int mToolbarId>
	//*  14   25:iconst_m1       
	//*  15   26:icmpeq          63
		{
			mToolbar = (Toolbar)findViewById(mToolbarId);
	//   16   29:aload_0         
	//   17   30:aload_0         
	//   18   31:aload_0         
	//   19   32:getfield        #237 <Field int mToolbarId>
	//   20   35:invokevirtual   #305 <Method View findViewById(int)>
	//   21   38:checkcast       #307 <Class Toolbar>
	//   22   41:putfield        #299 <Field Toolbar mToolbar>
			if(mToolbar != null)
	//*  23   44:aload_0         
	//*  24   45:getfield        #299 <Field Toolbar mToolbar>
	//*  25   48:ifnull          63
				mToolbarDirectChild = findDirectChild(((View) (mToolbar)));
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #299 <Field Toolbar mToolbar>
	//   30   57:invokespecial   #311 <Method View findDirectChild(View)>
	//   31   60:putfield        #301 <Field View mToolbarDirectChild>
		}
		if(mToolbar == null)
	//*  32   63:aload_0         
	//*  33   64:getfield        #299 <Field Toolbar mToolbar>
	//*  34   67:ifnonnull       118
		{
			int j = getChildCount();
	//   35   70:aload_0         
	//   36   71:invokevirtual   #315 <Method int getChildCount()>
	//   37   74:istore_2        
			int i = 0;
	//   38   75:iconst_0        
	//   39   76:istore_1        
			Object obj;
			do
			{
				obj = ((Object) (obj1));
	//   40   77:aload           4
	//   41   79:astore_3        
				if(i >= j)
					break;
	//   42   80:iload_1         
	//   43   81:iload_2         
	//   44   82:icmpge          113
				obj = ((Object) (getChildAt(i)));
	//   45   85:aload_0         
	//   46   86:iload_1         
	//   47   87:invokevirtual   #318 <Method View getChildAt(int)>
	//   48   90:astore_3        
				if(obj instanceof Toolbar)
	//*  49   91:aload_3         
	//*  50   92:instanceof      #307 <Class Toolbar>
	//*  51   95:ifeq            106
				{
					obj = ((Object) ((Toolbar)obj));
	//   52   98:aload_3         
	//   53   99:checkcast       #307 <Class Toolbar>
	//   54  102:astore_3        
					break;
	//   55  103:goto            113
				}
				i++;
	//   56  106:iload_1         
	//   57  107:iconst_1        
	//   58  108:iadd            
	//   59  109:istore_1        
			} while(true);
	//   60  110:goto            77
			mToolbar = ((Toolbar) (obj));
	//   61  113:aload_0         
	//   62  114:aload_3         
	//   63  115:putfield        #299 <Field Toolbar mToolbar>
		}
		updateDummyView();
	//   64  118:aload_0         
	//   65  119:invokespecial   #321 <Method void updateDummyView()>
		mRefreshToolbar = false;
	//   66  122:aload_0         
	//   67  123:iconst_0        
	//   68  124:putfield        #65  <Field boolean mRefreshToolbar>
	//   69  127:return          
	}

	private View findDirectChild(View view)
	{
		ViewParent viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #327 <Method ViewParent View.getParent()>
	//    2    4:astore_3        
		View view1 = view;
	//    3    5:aload_1         
	//    4    6:astore_2        
		for(view = ((View) (viewparent)); view != this && view != null; view = ((View) (((ViewParent) (view)).getParent())))
	//*   5    7:aload_3         
	//*   6    8:astore_1        
	//*   7    9:aload_1         
	//*   8   10:aload_0         
	//*   9   11:if_acmpeq       40
	//*  10   14:aload_1         
	//*  11   15:ifnull          40
			if(view instanceof View)
	//*  12   18:aload_1         
	//*  13   19:instanceof      #323 <Class View>
	//*  14   22:ifeq            30
				view1 = (View)view;
	//   15   25:aload_1         
	//   16   26:checkcast       #323 <Class View>
	//   17   29:astore_2        

	//   18   30:aload_1         
	//   19   31:invokeinterface #330 <Method ViewParent ViewParent.getParent()>
	//   20   36:astore_1        
	//*  21   37:goto            9
		return view1;
	//   22   40:aload_2         
	//   23   41:areturn         
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
		View view1 = mToolbarDirectChild;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field View mToolbarDirectChild>
	//    2    4:astore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(view1 != null && mToolbarDirectChild != this ? view == mToolbarDirectChild : view == mToolbar)
	//*   5    7:aload_3         
	//*   6    8:ifnull          33
	//*   7   11:aload_0         
	//*   8   12:getfield        #301 <Field View mToolbarDirectChild>
	//*   9   15:aload_0         
	//*  10   16:if_acmpne       22
	//*  11   19:goto            33
	//*  12   22:aload_1         
	//*  13   23:aload_0         
	//*  14   24:getfield        #301 <Field View mToolbarDirectChild>
	//*  15   27:if_acmpne       43
	//*  16   30:goto            41
	//*  17   33:aload_1         
	//*  18   34:aload_0         
	//*  19   35:getfield        #299 <Field Toolbar mToolbar>
	//*  20   38:if_acmpne       43
			flag = true;
	//   21   41:iconst_1        
	//   22   42:istore_2        
		return flag;
	//   23   43:iload_2         
	//   24   44:ireturn         
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
	//*  36   78:ifnull          157
	//*  37   81:aload_0         
	//*  38   82:getfield        #268 <Field int mScrimAlpha>
	//*  39   85:ifle            157
		{
			int i;
			if(mLastInsets != null)
	//*  40   88:aload_0         
	//*  41   89:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//*  42   92:ifnull          106
				i = mLastInsets.getSystemWindowInsetTop();
	//   43   95:aload_0         
	//   44   96:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//   45   99:invokevirtual   #416 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   46  102:istore_2        
			else
	//*  47  103:goto            108
				i = 0;
	//   48  106:iconst_0        
	//   49  107:istore_2        
			if(i > 0)
	//*  50  108:iload_2         
	//*  51  109:ifle            157
			{
				mStatusBarScrim.setBounds(0, -mCurrentOffset, getWidth(), i - mCurrentOffset);
	//   52  112:aload_0         
	//   53  113:getfield        #409 <Field Drawable mStatusBarScrim>
	//   54  116:iconst_0        
	//   55  117:aload_0         
	//   56  118:getfield        #418 <Field int mCurrentOffset>
	//   57  121:ineg            
	//   58  122:aload_0         
	//   59  123:invokevirtual   #421 <Method int getWidth()>
	//   60  126:iload_2         
	//   61  127:aload_0         
	//   62  128:getfield        #418 <Field int mCurrentOffset>
	//   63  131:isub            
	//   64  132:invokevirtual   #425 <Method void Drawable.setBounds(int, int, int, int)>
				mStatusBarScrim.mutate().setAlpha(mScrimAlpha);
	//   65  135:aload_0         
	//   66  136:getfield        #409 <Field Drawable mStatusBarScrim>
	//   67  139:invokevirtual   #400 <Method Drawable Drawable.mutate()>
	//   68  142:aload_0         
	//   69  143:getfield        #268 <Field int mScrimAlpha>
	//   70  146:invokevirtual   #403 <Method void Drawable.setAlpha(int)>
				mStatusBarScrim.draw(canvas);
	//   71  149:aload_0         
	//   72  150:getfield        #409 <Field Drawable mStatusBarScrim>
	//   73  153:aload_1         
	//   74  154:invokevirtual   #404 <Method void Drawable.draw(Canvas)>
			}
		}
	//   75  157:return          
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		Drawable drawable = mContentScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #394 <Field Drawable mContentScrim>
	//    2    4:astore          7
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		boolean flag;
		if(drawable != null && mScrimAlpha > 0 && isToolbarChild(view))
	//*   5    9:aload           7
	//*   6   11:ifnull          57
	//*   7   14:aload_0         
	//*   8   15:getfield        #268 <Field int mScrimAlpha>
	//*   9   18:ifle            57
	//*  10   21:aload_0         
	//*  11   22:aload_2         
	//*  12   23:invokespecial   #429 <Method boolean isToolbarChild(View)>
	//*  13   26:ifeq            57
		{
			mContentScrim.mutate().setAlpha(mScrimAlpha);
	//   14   29:aload_0         
	//   15   30:getfield        #394 <Field Drawable mContentScrim>
	//   16   33:invokevirtual   #400 <Method Drawable Drawable.mutate()>
	//   17   36:aload_0         
	//   18   37:getfield        #268 <Field int mScrimAlpha>
	//   19   40:invokevirtual   #403 <Method void Drawable.setAlpha(int)>
			mContentScrim.draw(canvas);
	//   20   43:aload_0         
	//   21   44:getfield        #394 <Field Drawable mContentScrim>
	//   22   47:aload_1         
	//   23   48:invokevirtual   #404 <Method void Drawable.draw(Canvas)>
			flag = true;
	//   24   51:iconst_1        
	//   25   52:istore          5
		} else
	//*  26   54:goto            60
		{
			flag = false;
	//   27   57:iconst_0        
	//   28   58:istore          5
		}
		if(!super.drawChild(canvas, view, l))
	//*  29   60:aload_0         
	//*  30   61:aload_1         
	//*  31   62:aload_2         
	//*  32   63:lload_3         
	//*  33   64:invokespecial   #431 <Method boolean FrameLayout.drawChild(Canvas, View, long)>
	//*  34   67:ifne            80
		{
			if(flag)
	//*  35   70:iload           5
	//*  36   72:ifeq            77
				return true;
	//   37   75:iconst_1        
	//   38   76:ireturn         
			flag1 = false;
	//   39   77:iconst_0        
	//   40   78:istore          6
		}
		return flag1;
	//   41   80:iload           6
	//   42   82:ireturn         
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
		Drawable drawable = mStatusBarScrim;
	//    5    9:aload_0         
	//    6   10:getfield        #409 <Field Drawable mStatusBarScrim>
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
		if(mLastInsets != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//*   8   16:ifnull          30
			i = mLastInsets.getSystemWindowInsetTop();
	//    9   19:aload_0         
	//   10   20:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//   11   23:invokevirtual   #416 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   12   26:istore_1        
		else
	//*  13   27:goto            32
			i = 0;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		int j = ViewCompat.getMinimumHeight(((View) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #509 <Method int ViewCompat.getMinimumHeight(View)>
	//   18   36:istore_2        
		if(j > 0)
	//*  19   37:iload_2         
	//*  20   38:ifle            54
			return Math.min(j * 2 + i, getHeight());
	//   21   41:iload_2         
	//   22   42:iconst_2        
	//   23   43:imul            
	//   24   44:iload_1         
	//   25   45:iadd            
	//   26   46:aload_0         
	//   27   47:invokevirtual   #498 <Method int getHeight()>
	//   28   50:invokestatic    #514 <Method int Math.min(int, int)>
	//   29   53:ireturn         
		else
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
		WindowInsetsCompat windowinsetscompat = mLastInsets;
	//    7   11:aload_0         
	//    8   12:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//    9   15:astore          15
		boolean flag2 = false;
	//   10   17:iconst_0        
	//   11   18:istore          9
		if(windowinsetscompat != null)
	//*  12   20:aload           15
	//*  13   22:ifnull          92
		{
			int k1 = mLastInsets.getSystemWindowInsetTop();
	//   14   25:aload_0         
	//   15   26:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//   16   29:invokevirtual   #416 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   17   32:istore          7
			int i2 = getChildCount();
	//   18   34:aload_0         
	//   19   35:invokevirtual   #315 <Method int getChildCount()>
	//   20   38:istore          8
			for(int i1 = 0; i1 < i2; i1++)
	//*  21   40:iconst_0        
	//*  22   41:istore          6
	//*  23   43:iload           6
	//*  24   45:iload           8
	//*  25   47:icmpge          92
			{
				View view = getChildAt(i1);
	//   26   50:aload_0         
	//   27   51:iload           6
	//   28   53:invokevirtual   #318 <Method View getChildAt(int)>
	//   29   56:astore          15
				if(!ViewCompat.getFitsSystemWindows(view) && view.getTop() < k1)
	//*  30   58:aload           15
	//*  31   60:invokestatic    #529 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  32   63:ifne            83
	//*  33   66:aload           15
	//*  34   68:invokevirtual   #556 <Method int View.getTop()>
	//*  35   71:iload           7
	//*  36   73:icmpge          83
					ViewCompat.offsetTopAndBottom(view, k1);
	//   37   76:aload           15
	//   38   78:iload           7
	//   39   80:invokestatic    #560 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			}

	//   40   83:iload           6
	//   41   85:iconst_1        
	//   42   86:iadd            
	//   43   87:istore          6
		}
	//*  44   89:goto            43
		if(mCollapsingTitleEnabled && mDummyView != null)
	//*  45   92:aload_0         
	//*  46   93:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//*  47   96:ifeq            437
	//*  48   99:aload_0         
	//*  49  100:getfield        #371 <Field View mDummyView>
	//*  50  103:ifnull          437
		{
			flag = ViewCompat.isAttachedToWindow(mDummyView);
	//   51  106:aload_0         
	//   52  107:getfield        #371 <Field View mDummyView>
	//   53  110:invokestatic    #563 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//   54  113:istore_1        
			boolean flag1 = true;
	//   55  114:iconst_1        
	//   56  115:istore          6
			if(flag && mDummyView.getVisibility() == 0)
	//*  57  117:iload_1         
	//*  58  118:ifeq            136
	//*  59  121:aload_0         
	//*  60  122:getfield        #371 <Field View mDummyView>
	//*  61  125:invokevirtual   #566 <Method int View.getVisibility()>
	//*  62  128:ifne            136
				flag = true;
	//   63  131:iconst_1        
	//   64  132:istore_1        
			else
	//*  65  133:goto            138
				flag = false;
	//   66  136:iconst_0        
	//   67  137:istore_1        
			mDrawCollapsingTitle = flag;
	//   68  138:aload_0         
	//   69  139:iload_1         
	//   70  140:putfield        #406 <Field boolean mDrawCollapsingTitle>
			if(mDrawCollapsingTitle)
	//*  71  143:aload_0         
	//*  72  144:getfield        #406 <Field boolean mDrawCollapsingTitle>
	//*  73  147:ifeq            437
			{
				if(ViewCompat.getLayoutDirection(((View) (this))) != 1)
	//*  74  150:aload_0         
	//*  75  151:invokestatic    #569 <Method int ViewCompat.getLayoutDirection(View)>
	//*  76  154:iconst_1        
	//*  77  155:icmpne          161
	//*  78  158:goto            164
					flag1 = false;
	//   79  161:iconst_0        
	//   80  162:istore          6
				Object obj;
				if(mToolbarDirectChild != null)
	//*  81  164:aload_0         
	//*  82  165:getfield        #301 <Field View mToolbarDirectChild>
	//*  83  168:ifnull          180
					obj = ((Object) (mToolbarDirectChild));
	//   84  171:aload_0         
	//   85  172:getfield        #301 <Field View mToolbarDirectChild>
	//   86  175:astore          15
				else
	//*  87  177:goto            186
					obj = ((Object) (mToolbar));
	//   88  180:aload_0         
	//   89  181:getfield        #299 <Field Toolbar mToolbar>
	//   90  184:astore          15
				int k2 = getMaxOffsetForPinChild(((View) (obj)));
	//   91  186:aload_0         
	//   92  187:aload           15
	//   93  189:invokevirtual   #571 <Method int getMaxOffsetForPinChild(View)>
	//   94  192:istore          10
				ViewGroupUtils.getDescendantRect(((ViewGroup) (this)), mDummyView, mTmpRect);
	//   95  194:aload_0         
	//   96  195:aload_0         
	//   97  196:getfield        #371 <Field View mDummyView>
	//   98  199:aload_0         
	//   99  200:getfield        #72  <Field Rect mTmpRect>
	//  100  203:invokestatic    #577 <Method void ViewGroupUtils.getDescendantRect(ViewGroup, View, Rect)>
				obj = ((Object) (mCollapsingTextHelper));
	//  101  206:aload_0         
	//  102  207:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//  103  210:astore          15
				int l2 = mTmpRect.left;
	//  104  212:aload_0         
	//  105  213:getfield        #72  <Field Rect mTmpRect>
	//  106  216:getfield        #580 <Field int Rect.left>
	//  107  219:istore          11
				int l1;
				if(flag1)
	//* 108  221:iload           6
	//* 109  223:ifeq            238
					l1 = mToolbar.getTitleMarginEnd();
	//  110  226:aload_0         
	//  111  227:getfield        #299 <Field Toolbar mToolbar>
	//  112  230:invokevirtual   #583 <Method int Toolbar.getTitleMarginEnd()>
	//  113  233:istore          7
				else
	//* 114  235:goto            247
					l1 = mToolbar.getTitleMarginStart();
	//  115  238:aload_0         
	//  116  239:getfield        #299 <Field Toolbar mToolbar>
	//  117  242:invokevirtual   #586 <Method int Toolbar.getTitleMarginStart()>
	//  118  245:istore          7
				int i3 = mTmpRect.top;
	//  119  247:aload_0         
	//  120  248:getfield        #72  <Field Rect mTmpRect>
	//  121  251:getfield        #589 <Field int Rect.top>
	//  122  254:istore          12
				int j3 = mToolbar.getTitleMarginTop();
	//  123  256:aload_0         
	//  124  257:getfield        #299 <Field Toolbar mToolbar>
	//  125  260:invokevirtual   #592 <Method int Toolbar.getTitleMarginTop()>
	//  126  263:istore          13
				int k3 = mTmpRect.right;
	//  127  265:aload_0         
	//  128  266:getfield        #72  <Field Rect mTmpRect>
	//  129  269:getfield        #595 <Field int Rect.right>
	//  130  272:istore          14
				int j2;
				if(flag1)
	//* 131  274:iload           6
	//* 132  276:ifeq            291
					j2 = mToolbar.getTitleMarginStart();
	//  133  279:aload_0         
	//  134  280:getfield        #299 <Field Toolbar mToolbar>
	//  135  283:invokevirtual   #586 <Method int Toolbar.getTitleMarginStart()>
	//  136  286:istore          8
				else
	//* 137  288:goto            300
					j2 = mToolbar.getTitleMarginEnd();
	//  138  291:aload_0         
	//  139  292:getfield        #299 <Field Toolbar mToolbar>
	//  140  295:invokevirtual   #583 <Method int Toolbar.getTitleMarginEnd()>
	//  141  298:istore          8
				((CollapsingTextHelper) (obj)).setCollapsedBounds(l2 + l1, i3 + k2 + j3, k3 + j2, (mTmpRect.bottom + k2) - mToolbar.getTitleMarginBottom());
	//  142  300:aload           15
	//  143  302:iload           11
	//  144  304:iload           7
	//  145  306:iadd            
	//  146  307:iload           12
	//  147  309:iload           10
	//  148  311:iadd            
	//  149  312:iload           13
	//  150  314:iadd            
	//  151  315:iload           14
	//  152  317:iload           8
	//  153  319:iadd            
	//  154  320:aload_0         
	//  155  321:getfield        #72  <Field Rect mTmpRect>
	//  156  324:getfield        #598 <Field int Rect.bottom>
	//  157  327:iload           10
	//  158  329:iadd            
	//  159  330:aload_0         
	//  160  331:getfield        #299 <Field Toolbar mToolbar>
	//  161  334:invokevirtual   #601 <Method int Toolbar.getTitleMarginBottom()>
	//  162  337:isub            
	//  163  338:invokevirtual   #604 <Method void CollapsingTextHelper.setCollapsedBounds(int, int, int, int)>
				obj = ((Object) (mCollapsingTextHelper));
	//  164  341:aload_0         
	//  165  342:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//  166  345:astore          15
				if(flag1)
	//* 167  347:iload           6
	//* 168  349:ifeq            361
					l1 = mExpandedMarginEnd;
	//  169  352:aload_0         
	//  170  353:getfield        #144 <Field int mExpandedMarginEnd>
	//  171  356:istore          7
				else
	//* 172  358:goto            367
					l1 = mExpandedMarginStart;
	//  173  361:aload_0         
	//  174  362:getfield        #148 <Field int mExpandedMarginStart>
	//  175  365:istore          7
				j2 = mTmpRect.top;
	//  176  367:aload_0         
	//  177  368:getfield        #72  <Field Rect mTmpRect>
	//  178  371:getfield        #589 <Field int Rect.top>
	//  179  374:istore          8
				k2 = mExpandedMarginTop;
	//  180  376:aload_0         
	//  181  377:getfield        #146 <Field int mExpandedMarginTop>
	//  182  380:istore          10
				int j1;
				if(flag1)
	//* 183  382:iload           6
	//* 184  384:ifeq            396
					j1 = mExpandedMarginStart;
	//  185  387:aload_0         
	//  186  388:getfield        #148 <Field int mExpandedMarginStart>
	//  187  391:istore          6
				else
	//* 188  393:goto            402
					j1 = mExpandedMarginEnd;
	//  189  396:aload_0         
	//  190  397:getfield        #144 <Field int mExpandedMarginEnd>
	//  191  400:istore          6
				((CollapsingTextHelper) (obj)).setExpandedBounds(l1, j2 + k2, k - i - j1, l - j - mExpandedMarginBottom);
	//  192  402:aload           15
	//  193  404:iload           7
	//  194  406:iload           8
	//  195  408:iload           10
	//  196  410:iadd            
	//  197  411:iload           4
	//  198  413:iload_2         
	//  199  414:isub            
	//  200  415:iload           6
	//  201  417:isub            
	//  202  418:iload           5
	//  203  420:iload_3         
	//  204  421:isub            
	//  205  422:aload_0         
	//  206  423:getfield        #142 <Field int mExpandedMarginBottom>
	//  207  426:isub            
	//  208  427:invokevirtual   #607 <Method void CollapsingTextHelper.setExpandedBounds(int, int, int, int)>
				mCollapsingTextHelper.recalculate();
	//  209  430:aload_0         
	//  210  431:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//  211  434:invokevirtual   #610 <Method void CollapsingTextHelper.recalculate()>
			}
		}
		j = getChildCount();
	//  212  437:aload_0         
	//  213  438:invokevirtual   #315 <Method int getChildCount()>
	//  214  441:istore_3        
		for(i = ((int) (flag2)); i < j; i++)
	//* 215  442:iload           9
	//* 216  444:istore_2        
	//* 217  445:iload_2         
	//* 218  446:iload_3         
	//* 219  447:icmpge          468
			getViewOffsetHelper(getChildAt(i)).onViewLayout();
	//  220  450:aload_0         
	//  221  451:iload_2         
	//  222  452:invokevirtual   #318 <Method View getChildAt(int)>
	//  223  455:invokestatic    #497 <Method ViewOffsetHelper getViewOffsetHelper(View)>
	//  224  458:invokevirtual   #613 <Method void ViewOffsetHelper.onViewLayout()>

	//  225  461:iload_2         
	//  226  462:iconst_1        
	//  227  463:iadd            
	//  228  464:istore_2        
	//* 229  465:goto            445
		if(mToolbar != null)
	//* 230  468:aload_0         
	//* 231  469:getfield        #299 <Field Toolbar mToolbar>
	//* 232  472:ifnull          552
		{
			if(mCollapsingTitleEnabled && TextUtils.isEmpty(mCollapsingTextHelper.getText()))
	//* 233  475:aload_0         
	//* 234  476:getfield        #173 <Field boolean mCollapsingTitleEnabled>
	//* 235  479:ifeq            509
	//* 236  482:aload_0         
	//* 237  483:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//* 238  486:invokevirtual   #519 <Method CharSequence CollapsingTextHelper.getText()>
	//* 239  489:invokestatic    #619 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 240  492:ifeq            509
				mCollapsingTextHelper.setText(mToolbar.getTitle());
	//  241  495:aload_0         
	//  242  496:getfield        #86  <Field CollapsingTextHelper mCollapsingTextHelper>
	//  243  499:aload_0         
	//  244  500:getfield        #299 <Field Toolbar mToolbar>
	//  245  503:invokevirtual   #621 <Method CharSequence Toolbar.getTitle()>
	//  246  506:invokevirtual   #624 <Method void CollapsingTextHelper.setText(CharSequence)>
			if(mToolbarDirectChild != null && mToolbarDirectChild != this)
	//* 247  509:aload_0         
	//* 248  510:getfield        #301 <Field View mToolbarDirectChild>
	//* 249  513:ifnull          541
	//* 250  516:aload_0         
	//* 251  517:getfield        #301 <Field View mToolbarDirectChild>
	//* 252  520:aload_0         
	//* 253  521:if_acmpne       527
	//* 254  524:goto            541
				setMinimumHeight(getHeightWithMargins(mToolbarDirectChild));
	//  255  527:aload_0         
	//  256  528:aload_0         
	//  257  529:getfield        #301 <Field View mToolbarDirectChild>
	//  258  532:invokestatic    #626 <Method int getHeightWithMargins(View)>
	//  259  535:invokevirtual   #629 <Method void setMinimumHeight(int)>
			else
	//* 260  538:goto            552
				setMinimumHeight(getHeightWithMargins(((View) (mToolbar))));
	//  261  541:aload_0         
	//  262  542:aload_0         
	//  263  543:getfield        #299 <Field Toolbar mToolbar>
	//  264  546:invokestatic    #626 <Method int getHeightWithMargins(View)>
	//  265  549:invokevirtual   #629 <Method void setMinimumHeight(int)>
		}
		updateScrimVisibility();
	//  266  552:aload_0         
	//  267  553:invokevirtual   #632 <Method void updateScrimVisibility()>
	//  268  556:return          
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
	//*  11   19:ifnull          33
			j = mLastInsets.getSystemWindowInsetTop();
	//   12   22:aload_0         
	//   13   23:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//   14   26:invokevirtual   #416 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   15   29:istore_2        
		else
	//*  16   30:goto            35
			j = 0;
	//   17   33:iconst_0        
	//   18   34:istore_2        
		if(k == 0 && j > 0)
	//*  19   35:iload_3         
	//*  20   36:ifne            60
	//*  21   39:iload_2         
	//*  22   40:ifle            60
			super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + j, 0x40000000));
	//   23   43:aload_0         
	//   24   44:iload_1         
	//   25   45:aload_0         
	//   26   46:invokevirtual   #644 <Method int getMeasuredHeight()>
	//   27   49:iload_2         
	//   28   50:iadd            
	//   29   51:ldc2            #645 <Int 0x40000000>
	//   30   54:invokestatic    #648 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   31   57:invokespecial   #635 <Method void FrameLayout.onMeasure(int, int)>
	//   32   60:return          
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
		WindowInsetsCompat windowinsetscompat1;
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #529 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   2    4:ifeq            12
			windowinsetscompat1 = windowinsetscompat;
	//    3    7:aload_1         
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			windowinsetscompat1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		if(!ObjectsCompat.equals(((Object) (mLastInsets)), ((Object) (windowinsetscompat1))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #411 <Field WindowInsetsCompat mLastInsets>
	//*  10   18:aload_2         
	//*  11   19:invokestatic    #659 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  12   22:ifne            34
		{
			mLastInsets = windowinsetscompat1;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #411 <Field WindowInsetsCompat mLastInsets>
			requestLayout();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #662 <Method void requestLayout()>
		}
		return windowinsetscompat.consumeSystemWindowInsets();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #666 <Method WindowInsetsCompat WindowInsetsCompat.consumeSystemWindowInsets()>
	//   20   38:areturn         
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
		if(mContentScrim != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #394 <Field Drawable mContentScrim>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       88
		{
			Drawable drawable2 = mContentScrim;
	//    4    8:aload_0         
	//    5    9:getfield        #394 <Field Drawable mContentScrim>
	//    6   12:astore_3        
			Drawable drawable1 = null;
	//    7   13:aconst_null     
	//    8   14:astore_2        
			if(drawable2 != null)
	//*   9   15:aload_3         
	//*  10   16:ifnull          27
				mContentScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   11   19:aload_0         
	//   12   20:getfield        #394 <Field Drawable mContentScrim>
	//   13   23:aconst_null     
	//   14   24:invokevirtual   #692 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          36
				drawable1 = drawable.mutate();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #400 <Method Drawable Drawable.mutate()>
	//   19   35:astore_2        
			mContentScrim = drawable1;
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:putfield        #394 <Field Drawable mContentScrim>
			if(mContentScrim != null)
	//*  23   41:aload_0         
	//*  24   42:getfield        #394 <Field Drawable mContentScrim>
	//*  25   45:ifnull          84
			{
				mContentScrim.setBounds(0, 0, getWidth(), getHeight());
	//   26   48:aload_0         
	//   27   49:getfield        #394 <Field Drawable mContentScrim>
	//   28   52:iconst_0        
	//   29   53:iconst_0        
	//   30   54:aload_0         
	//   31   55:invokevirtual   #421 <Method int getWidth()>
	//   32   58:aload_0         
	//   33   59:invokevirtual   #498 <Method int getHeight()>
	//   34   62:invokevirtual   #425 <Method void Drawable.setBounds(int, int, int, int)>
				mContentScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   35   65:aload_0         
	//   36   66:getfield        #394 <Field Drawable mContentScrim>
	//   37   69:aload_0         
	//   38   70:invokevirtual   #692 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				mContentScrim.setAlpha(mScrimAlpha);
	//   39   73:aload_0         
	//   40   74:getfield        #394 <Field Drawable mContentScrim>
	//   41   77:aload_0         
	//   42   78:getfield        #268 <Field int mScrimAlpha>
	//   43   81:invokevirtual   #403 <Method void Drawable.setAlpha(int)>
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   44   84:aload_0         
	//   45   85:invokestatic    #695 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   46   88:return          
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
	//*   2    4:ifeq            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #740 <Method boolean isInEditMode()>
	//*   5   11:ifne            19
			flag1 = true;
	//    6   14:iconst_1        
	//    7   15:istore_2        
		else
	//*   8   16:goto            21
			flag1 = false;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		setScrimsShown(flag, flag1);
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:iload_2         
	//   14   24:invokevirtual   #743 <Method void setScrimsShown(boolean, boolean)>
	//   15   27:return          
	}

	public void setScrimsShown(boolean flag, boolean flag1)
	{
		if(mScrimsAreShown != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #745 <Field boolean mScrimsAreShown>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          54
		{
			boolean flag2 = false;
	//    4    8:iconst_0        
	//    5    9:istore          4
			char c = '\0';
	//    6   11:iconst_0        
	//    7   12:istore_3        
			if(flag1)
	//*   8   13:iload_2         
	//*   9   14:ifeq            33
			{
				if(flag)
	//*  10   17:iload_1         
	//*  11   18:ifeq            25
					c = '\377';
	//   12   21:sipush          255
	//   13   24:istore_3        
				animateScrim(((int) (c)));
	//   14   25:aload_0         
	//   15   26:iload_3         
	//   16   27:invokespecial   #747 <Method void animateScrim(int)>
			} else
	//*  17   30:goto            49
			{
				char c1 = ((char) (flag2));
	//   18   33:iload           4
	//   19   35:istore_3        
				if(flag)
	//*  20   36:iload_1         
	//*  21   37:ifeq            44
					c1 = '\377';
	//   22   40:sipush          255
	//   23   43:istore_3        
				setScrimAlpha(((int) (c1)));
	//   24   44:aload_0         
	//   25   45:iload_3         
	//   26   46:invokevirtual   #749 <Method void setScrimAlpha(int)>
			}
			mScrimsAreShown = flag;
	//   27   49:aload_0         
	//   28   50:iload_1         
	//   29   51:putfield        #745 <Field boolean mScrimsAreShown>
		}
	//   30   54:return          
	}

	public void setStatusBarScrim(Drawable drawable)
	{
		if(mStatusBarScrim != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #409 <Field Drawable mStatusBarScrim>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       133
		{
			Drawable drawable2 = mStatusBarScrim;
	//    4    8:aload_0         
	//    5    9:getfield        #409 <Field Drawable mStatusBarScrim>
	//    6   12:astore          4
			Drawable drawable1 = null;
	//    7   14:aconst_null     
	//    8   15:astore_3        
			if(drawable2 != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          29
				mStatusBarScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   11   21:aload_0         
	//   12   22:getfield        #409 <Field Drawable mStatusBarScrim>
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #692 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          38
				drawable1 = drawable.mutate();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #400 <Method Drawable Drawable.mutate()>
	//   19   37:astore_3        
			mStatusBarScrim = drawable1;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:putfield        #409 <Field Drawable mStatusBarScrim>
			if(mStatusBarScrim != null)
	//*  23   43:aload_0         
	//*  24   44:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  25   47:ifnull          129
			{
				if(mStatusBarScrim.isStateful())
	//*  26   50:aload_0         
	//*  27   51:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  28   54:invokevirtual   #441 <Method boolean Drawable.isStateful()>
	//*  29   57:ifeq            72
					mStatusBarScrim.setState(getDrawableState());
	//   30   60:aload_0         
	//   31   61:getfield        #409 <Field Drawable mStatusBarScrim>
	//   32   64:aload_0         
	//   33   65:invokevirtual   #438 <Method int[] getDrawableState()>
	//   34   68:invokevirtual   #445 <Method boolean Drawable.setState(int[])>
	//   35   71:pop             
				DrawableCompat.setLayoutDirection(mStatusBarScrim, ViewCompat.getLayoutDirection(((View) (this))));
	//   36   72:aload_0         
	//   37   73:getfield        #409 <Field Drawable mStatusBarScrim>
	//   38   76:aload_0         
	//   39   77:invokestatic    #569 <Method int ViewCompat.getLayoutDirection(View)>
	//   40   80:invokestatic    #755 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   41   83:pop             
				drawable = mStatusBarScrim;
	//   42   84:aload_0         
	//   43   85:getfield        #409 <Field Drawable mStatusBarScrim>
	//   44   88:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  45   89:aload_0         
	//*  46   90:invokevirtual   #756 <Method int getVisibility()>
	//*  47   93:ifne            101
					flag = true;
	//   48   96:iconst_1        
	//   49   97:istore_2        
				else
	//*  50   98:goto            103
					flag = false;
	//   51  101:iconst_0        
	//   52  102:istore_2        
				drawable.setVisible(flag, false);
	//   53  103:aload_1         
	//   54  104:iload_2         
	//   55  105:iconst_0        
	//   56  106:invokevirtual   #760 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   57  109:pop             
				mStatusBarScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   58  110:aload_0         
	//   59  111:getfield        #409 <Field Drawable mStatusBarScrim>
	//   60  114:aload_0         
	//   61  115:invokevirtual   #692 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				mStatusBarScrim.setAlpha(mScrimAlpha);
	//   62  118:aload_0         
	//   63  119:getfield        #409 <Field Drawable mStatusBarScrim>
	//   64  122:aload_0         
	//   65  123:getfield        #268 <Field int mScrimAlpha>
	//   66  126:invokevirtual   #403 <Method void Drawable.setAlpha(int)>
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   67  129:aload_0         
	//   68  130:invokestatic    #695 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   69  133:return          
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
	//*   4    6:ifne            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if(mStatusBarScrim != null && mStatusBarScrim.isVisible() != flag)
	//*  10   16:aload_0         
	//*  11   17:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  12   20:ifnull          44
	//*  13   23:aload_0         
	//*  14   24:getfield        #409 <Field Drawable mStatusBarScrim>
	//*  15   27:invokevirtual   #769 <Method boolean Drawable.isVisible()>
	//*  16   30:iload_2         
	//*  17   31:icmpeq          44
			mStatusBarScrim.setVisible(flag, false);
	//   18   34:aload_0         
	//   19   35:getfield        #409 <Field Drawable mStatusBarScrim>
	//   20   38:iload_2         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #760 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   23   43:pop             
		if(mContentScrim != null && mContentScrim.isVisible() != flag)
	//*  24   44:aload_0         
	//*  25   45:getfield        #394 <Field Drawable mContentScrim>
	//*  26   48:ifnull          72
	//*  27   51:aload_0         
	//*  28   52:getfield        #394 <Field Drawable mContentScrim>
	//*  29   55:invokevirtual   #769 <Method boolean Drawable.isVisible()>
	//*  30   58:iload_2         
	//*  31   59:icmpeq          72
			mContentScrim.setVisible(flag, false);
	//   32   62:aload_0         
	//   33   63:getfield        #394 <Field Drawable mContentScrim>
	//   34   66:iload_2         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #760 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   37   71:pop             
	//   38   72:return          
	}

	final void updateScrimVisibility()
	{
		if(mContentScrim != null || mStatusBarScrim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #394 <Field Drawable mContentScrim>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #409 <Field Drawable mStatusBarScrim>
	//*   5   11:ifnull          42
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
	//*  13   27:icmpge          35
				flag = true;
	//   14   30:iconst_1        
	//   15   31:istore_1        
			else
	//*  16   32:goto            37
				flag = false;
	//   17   35:iconst_0        
	//   18   36:istore_1        
			setScrimsShown(flag);
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:invokevirtual   #773 <Method void setScrimsShown(boolean)>
		}
	//   22   42:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mContentScrim || drawable == mStatusBarScrim;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #777 <Method boolean FrameLayout.verifyDrawable(Drawable)>
	//    3    5:ifne            29
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #394 <Field Drawable mContentScrim>
	//    7   13:if_acmpeq       29
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #409 <Field Drawable mStatusBarScrim>
	//   11   21:if_acmpne       27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
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
