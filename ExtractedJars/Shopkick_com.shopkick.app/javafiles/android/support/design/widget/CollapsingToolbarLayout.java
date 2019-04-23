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
import android.support.design.animation.AnimationUtils;
import android.support.design.internal.ThemeEnforcement;
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

// Referenced classes of package android.support.design.widget:
//			CollapsingTextHelper, ViewOffsetHelper, AppBarLayout, DescendantOffsetUtils

public class CollapsingToolbarLayout extends FrameLayout
{
	public static class LayoutParams extends android.widget.FrameLayout.LayoutParams
	{

		public int getCollapseMode()
		{
			return collapseMode;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int collapseMode>
		//    2    4:ireturn         
		}

		public float getParallaxMultiplier()
		{
			return parallaxMult;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field float parallaxMult>
		//    2    4:freturn         
		}

		public void setCollapseMode(int i)
		{
			collapseMode = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #25  <Field int collapseMode>
		//    3    5:return          
		}

		public void setParallaxMultiplier(float f)
		{
			parallaxMult = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #27  <Field float parallaxMult>
		//    3    5:return          
		}

		public static final int COLLAPSE_MODE_OFF = 0;
		public static final int COLLAPSE_MODE_PARALLAX = 2;
		public static final int COLLAPSE_MODE_PIN = 1;
		private static final float DEFAULT_PARALLAX_MULTIPLIER = 0.5F;
		int collapseMode;
		float parallaxMult;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #23  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
			collapseMode = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #25  <Field int collapseMode>
			parallaxMult = 0.5F;
		//    7   11:aload_0         
		//    8   12:ldc1            #17  <Float 0.5F>
		//    9   14:putfield        #27  <Field float parallaxMult>
		//   10   17:return          
		}

		public LayoutParams(int i, int j, int k)
		{
			super(i, j, k);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #31  <Method void android.widget.FrameLayout$LayoutParams(int, int, int)>
			collapseMode = 0;
		//    5    7:aload_0         
		//    6    8:iconst_0        
		//    7    9:putfield        #25  <Field int collapseMode>
			parallaxMult = 0.5F;
		//    8   12:aload_0         
		//    9   13:ldc1            #17  <Float 0.5F>
		//   10   15:putfield        #27  <Field float parallaxMult>
		//   11   18:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #34  <Method void android.widget.FrameLayout$LayoutParams(Context, AttributeSet)>
			collapseMode = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #25  <Field int collapseMode>
			parallaxMult = 0.5F;
		//    7   11:aload_0         
		//    8   12:ldc1            #17  <Float 0.5F>
		//    9   14:putfield        #27  <Field float parallaxMult>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CollapsingToolbarLayout_Layout)));
		//   10   17:aload_1         
		//   11   18:aload_2         
		//   12   19:getstatic       #40  <Field int[] android.support.design.R$styleable.CollapsingToolbarLayout_Layout>
		//   13   22:invokevirtual   #46  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   14   25:astore_1        
			collapseMode = ((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
		//   15   26:aload_0         
		//   16   27:aload_1         
		//   17   28:getstatic       #49  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode>
		//   18   31:iconst_0        
		//   19   32:invokevirtual   #55  <Method int TypedArray.getInt(int, int)>
		//   20   35:putfield        #25  <Field int collapseMode>
			setParallaxMultiplier(((TypedArray) (context)).getFloat(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5F));
		//   21   38:aload_0         
		//   22   39:aload_1         
		//   23   40:getstatic       #58  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier>
		//   24   43:ldc1            #17  <Float 0.5F>
		//   25   45:invokevirtual   #62  <Method float TypedArray.getFloat(int, float)>
		//   26   48:invokevirtual   #66  <Method void setParallaxMultiplier(float)>
			((TypedArray) (context)).recycle();
		//   27   51:aload_1         
		//   28   52:invokevirtual   #70  <Method void TypedArray.recycle()>
		//   29   55:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #73  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
			collapseMode = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #25  <Field int collapseMode>
			parallaxMult = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #17  <Float 0.5F>
		//    8   13:putfield        #27  <Field float parallaxMult>
		//    9   16:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #76  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			collapseMode = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #25  <Field int collapseMode>
			parallaxMult = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #17  <Float 0.5F>
		//    8   13:putfield        #27  <Field float parallaxMult>
		//    9   16:return          
		}

		public LayoutParams(android.widget.FrameLayout.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #82  <Method void android.widget.FrameLayout$LayoutParams(android.widget.FrameLayout$LayoutParams)>
			collapseMode = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #25  <Field int collapseMode>
			parallaxMult = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #17  <Float 0.5F>
		//    8   13:putfield        #27  <Field float parallaxMult>
		//    9   16:return          
		}
	}

	private class OffsetUpdateListener
		implements AppBarLayout.OnOffsetChangedListener
	{

		public void onOffsetChanged(AppBarLayout appbarlayout, int i)
		{
			appbarlayout = ((AppBarLayout) (CollapsingToolbarLayout.this));
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//    2    4:astore_1        
			appbarlayout.currentOffset = i;
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:putfield        #25  <Field int CollapsingToolbarLayout.currentOffset>
			int j;
			if(((CollapsingToolbarLayout) (appbarlayout)).lastInsets != null)
		//*   6   10:aload_1         
		//*   7   11:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.lastInsets>
		//*   8   14:ifnull          31
				j = lastInsets.getSystemWindowInsetTop();
		//    9   17:aload_0         
		//   10   18:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   11   21:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.lastInsets>
		//   12   24:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
		//   13   27:istore_3        
			else
		//*  14   28:goto            33
				j = 0;
		//   15   31:iconst_0        
		//   16   32:istore_3        
			int i1 = getChildCount();
		//   17   33:aload_0         
		//   18   34:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   19   37:invokevirtual   #38  <Method int CollapsingToolbarLayout.getChildCount()>
		//   20   40:istore          5
			for(int k = 0; k < i1; k++)
		//*  21   42:iconst_0        
		//*  22   43:istore          4
		//*  23   45:iload           4
		//*  24   47:iload           5
		//*  25   49:icmpge          157
			{
				appbarlayout = ((AppBarLayout) (getChildAt(k)));
		//   26   52:aload_0         
		//   27   53:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   28   56:iload           4
		//   29   58:invokevirtual   #42  <Method View CollapsingToolbarLayout.getChildAt(int)>
		//   30   61:astore_1        
				LayoutParams layoutparams = (LayoutParams)((View) (appbarlayout)).getLayoutParams();
		//   31   62:aload_1         
		//   32   63:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   33   66:checkcast       #50  <Class CollapsingToolbarLayout$LayoutParams>
		//   34   69:astore          6
				ViewOffsetHelper viewoffsethelper = CollapsingToolbarLayout.getViewOffsetHelper(((View) (appbarlayout)));
		//   35   71:aload_1         
		//   36   72:invokestatic    #54  <Method ViewOffsetHelper CollapsingToolbarLayout.getViewOffsetHelper(View)>
		//   37   75:astore          7
				switch(layoutparams.collapseMode)
		//*  38   77:aload           6
		//*  39   79:getfield        #57  <Field int CollapsingToolbarLayout$LayoutParams.collapseMode>
				{
		//*  40   82:tableswitch     1 2: default 104
		//		               1 128
		//		               2 107
		//*  41  104:goto            148
				case 2: // '\002'
					viewoffsethelper.setTopAndBottomOffset(Math.round((float)(-i) * layoutparams.parallaxMult));
		//   42  107:aload           7
		//   43  109:iload_2         
		//   44  110:ineg            
		//   45  111:i2f             
		//   46  112:aload           6
		//   47  114:getfield        #61  <Field float CollapsingToolbarLayout$LayoutParams.parallaxMult>
		//   48  117:fmul            
		//   49  118:invokestatic    #67  <Method int Math.round(float)>
		//   50  121:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
		//   51  124:pop             
					break;

		//*  52  125:goto            148
				case 1: // '\001'
					viewoffsethelper.setTopAndBottomOffset(MathUtils.clamp(-i, 0, getMaxOffsetForPinChild(((View) (appbarlayout)))));
		//   53  128:aload           7
		//   54  130:iload_2         
		//   55  131:ineg            
		//   56  132:iconst_0        
		//   57  133:aload_0         
		//   58  134:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   59  137:aload_1         
		//   60  138:invokevirtual   #77  <Method int CollapsingToolbarLayout.getMaxOffsetForPinChild(View)>
		//   61  141:invokestatic    #83  <Method int MathUtils.clamp(int, int, int)>
		//   62  144:invokevirtual   #73  <Method boolean ViewOffsetHelper.setTopAndBottomOffset(int)>
		//   63  147:pop             
					break;
				}
			}

		//   64  148:iload           4
		//   65  150:iconst_1        
		//   66  151:iadd            
		//   67  152:istore          4
		//*  68  154:goto            45
			updateScrimVisibility();
		//   69  157:aload_0         
		//   70  158:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   71  161:invokevirtual   #86  <Method void CollapsingToolbarLayout.updateScrimVisibility()>
			if(statusBarScrim != null && j > 0)
		//*  72  164:aload_0         
		//*  73  165:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//*  74  168:getfield        #90  <Field Drawable CollapsingToolbarLayout.statusBarScrim>
		//*  75  171:ifnull          185
		//*  76  174:iload_3         
		//*  77  175:ifle            185
				ViewCompat.postInvalidateOnAnimation(((View) (CollapsingToolbarLayout.this)));
		//   78  178:aload_0         
		//   79  179:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   80  182:invokestatic    #96  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			int l = getHeight();
		//   81  185:aload_0         
		//   82  186:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   83  189:invokevirtual   #99  <Method int CollapsingToolbarLayout.getHeight()>
		//   84  192:istore          4
			i1 = ViewCompat.getMinimumHeight(((View) (CollapsingToolbarLayout.this)));
		//   85  194:aload_0         
		//   86  195:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   87  198:invokestatic    #102 <Method int ViewCompat.getMinimumHeight(View)>
		//   88  201:istore          5
			collapsingTextHelper.setExpansionFraction((float)Math.abs(i) / (float)(l - i1 - j));
		//   89  203:aload_0         
		//   90  204:getfield        #15  <Field CollapsingToolbarLayout this$0>
		//   91  207:getfield        #106 <Field CollapsingTextHelper CollapsingToolbarLayout.collapsingTextHelper>
		//   92  210:iload_2         
		//   93  211:invokestatic    #110 <Method int Math.abs(int)>
		//   94  214:i2f             
		//   95  215:iload           4
		//   96  217:iload           5
		//   97  219:isub            
		//   98  220:iload_3         
		//   99  221:isub            
		//  100  222:i2f             
		//  101  223:fdiv            
		//  102  224:invokevirtual   #116 <Method void CollapsingTextHelper.setExpansionFraction(float)>
		//  103  227:return          
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
	//    3    3:invokespecial   #55  <Method void CollapsingToolbarLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public CollapsingToolbarLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #59  <Method void CollapsingToolbarLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public CollapsingToolbarLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #60  <Method void FrameLayout(Context, AttributeSet, int)>
		refreshToolbar = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #62  <Field boolean refreshToolbar>
		tmpRect = new Rect();
	//    8   12:aload_0         
	//    9   13:new             #64  <Class Rect>
	//   10   16:dup             
	//   11   17:invokespecial   #67  <Method void Rect()>
	//   12   20:putfield        #69  <Field Rect tmpRect>
		scrimVisibleHeightTrigger = -1;
	//   13   23:aload_0         
	//   14   24:iconst_m1       
	//   15   25:putfield        #71  <Field int scrimVisibleHeightTrigger>
		collapsingTextHelper = new CollapsingTextHelper(((View) (this)));
	//   16   28:aload_0         
	//   17   29:new             #73  <Class CollapsingTextHelper>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:invokespecial   #76  <Method void CollapsingTextHelper(View)>
	//   21   37:putfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
		collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
	//   22   40:aload_0         
	//   23   41:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//   24   44:getstatic       #84  <Field android.animation.TimeInterpolator AnimationUtils.DECELERATE_INTERPOLATOR>
	//   25   47:invokevirtual   #88  <Method void CollapsingTextHelper.setTextSizeInterpolator(android.animation.TimeInterpolator)>
		context = ((Context) (ThemeEnforcement.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.CollapsingToolbarLayout, i, android.support.design.R.style.Widget_Design_CollapsingToolbar, new int[0])));
	//   26   50:aload_1         
	//   27   51:aload_2         
	//   28   52:getstatic       #94  <Field int[] android.support.design.R$styleable.CollapsingToolbarLayout>
	//   29   55:iload_3         
	//   30   56:getstatic       #99  <Field int android.support.design.R$style.Widget_Design_CollapsingToolbar>
	//   31   59:iconst_0        
	//   32   60:newarray        int[]
	//   33   62:invokestatic    #105 <Method TypedArray ThemeEnforcement.obtainStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   34   65:astore_1        
		collapsingTextHelper.setExpandedTextGravity(((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 0x800053));
	//   35   66:aload_0         
	//   36   67:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//   37   70:aload_1         
	//   38   71:getstatic       #108 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleGravity>
	//   39   74:ldc1            #109 <Int 0x800053>
	//   40   76:invokevirtual   #115 <Method int TypedArray.getInt(int, int)>
	//   41   79:invokevirtual   #119 <Method void CollapsingTextHelper.setExpandedTextGravity(int)>
		collapsingTextHelper.setCollapsedTextGravity(((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 0x800013));
	//   42   82:aload_0         
	//   43   83:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//   44   86:aload_1         
	//   45   87:getstatic       #122 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_collapsedTitleGravity>
	//   46   90:ldc1            #123 <Int 0x800013>
	//   47   92:invokevirtual   #115 <Method int TypedArray.getInt(int, int)>
	//   48   95:invokevirtual   #126 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
		i = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
	//   49   98:aload_1         
	//   50   99:getstatic       #129 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMargin>
	//   51  102:iconst_0        
	//   52  103:invokevirtual   #132 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   53  106:istore_3        
		expandedMarginBottom = i;
	//   54  107:aload_0         
	//   55  108:iload_3         
	//   56  109:putfield        #134 <Field int expandedMarginBottom>
		expandedMarginEnd = i;
	//   57  112:aload_0         
	//   58  113:iload_3         
	//   59  114:putfield        #136 <Field int expandedMarginEnd>
		expandedMarginTop = i;
	//   60  117:aload_0         
	//   61  118:iload_3         
	//   62  119:putfield        #138 <Field int expandedMarginTop>
		expandedMarginStart = i;
	//   63  122:aload_0         
	//   64  123:iload_3         
	//   65  124:putfield        #140 <Field int expandedMarginStart>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart))
	//*  66  127:aload_1         
	//*  67  128:getstatic       #143 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart>
	//*  68  131:invokevirtual   #147 <Method boolean TypedArray.hasValue(int)>
	//*  69  134:ifeq            149
			expandedMarginStart = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
	//   70  137:aload_0         
	//   71  138:aload_1         
	//   72  139:getstatic       #143 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart>
	//   73  142:iconst_0        
	//   74  143:invokevirtual   #132 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   75  146:putfield        #140 <Field int expandedMarginStart>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd))
	//*  76  149:aload_1         
	//*  77  150:getstatic       #150 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd>
	//*  78  153:invokevirtual   #147 <Method boolean TypedArray.hasValue(int)>
	//*  79  156:ifeq            171
			expandedMarginEnd = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
	//   80  159:aload_0         
	//   81  160:aload_1         
	//   82  161:getstatic       #150 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd>
	//   83  164:iconst_0        
	//   84  165:invokevirtual   #132 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   85  168:putfield        #136 <Field int expandedMarginEnd>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop))
	//*  86  171:aload_1         
	//*  87  172:getstatic       #153 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop>
	//*  88  175:invokevirtual   #147 <Method boolean TypedArray.hasValue(int)>
	//*  89  178:ifeq            193
			expandedMarginTop = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
	//   90  181:aload_0         
	//   91  182:aload_1         
	//   92  183:getstatic       #153 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop>
	//   93  186:iconst_0        
	//   94  187:invokevirtual   #132 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   95  190:putfield        #138 <Field int expandedMarginTop>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom))
	//*  96  193:aload_1         
	//*  97  194:getstatic       #156 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom>
	//*  98  197:invokevirtual   #147 <Method boolean TypedArray.hasValue(int)>
	//*  99  200:ifeq            215
			expandedMarginBottom = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
	//  100  203:aload_0         
	//  101  204:aload_1         
	//  102  205:getstatic       #156 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom>
	//  103  208:iconst_0        
	//  104  209:invokevirtual   #132 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  105  212:putfield        #134 <Field int expandedMarginBottom>
		collapsingTitleEnabled = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.CollapsingToolbarLayout_titleEnabled, true);
	//  106  215:aload_0         
	//  107  216:aload_1         
	//  108  217:getstatic       #159 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_titleEnabled>
	//  109  220:iconst_1        
	//  110  221:invokevirtual   #163 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  111  224:putfield        #165 <Field boolean collapsingTitleEnabled>
		setTitle(((TypedArray) (context)).getText(android.support.design.R.styleable.CollapsingToolbarLayout_title));
	//  112  227:aload_0         
	//  113  228:aload_1         
	//  114  229:getstatic       #168 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_title>
	//  115  232:invokevirtual   #172 <Method CharSequence TypedArray.getText(int)>
	//  116  235:invokevirtual   #176 <Method void setTitle(CharSequence)>
		collapsingTextHelper.setExpandedTextAppearance(android.support.design.R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
	//  117  238:aload_0         
	//  118  239:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//  119  242:getstatic       #179 <Field int android.support.design.R$style.TextAppearance_Design_CollapsingToolbar_Expanded>
	//  120  245:invokevirtual   #182 <Method void CollapsingTextHelper.setExpandedTextAppearance(int)>
		collapsingTextHelper.setCollapsedTextAppearance(android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
	//  121  248:aload_0         
	//  122  249:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//  123  252:getstatic       #187 <Field int android.support.v7.appcompat.R$style.TextAppearance_AppCompat_Widget_ActionBar_Title>
	//  124  255:invokevirtual   #190 <Method void CollapsingTextHelper.setCollapsedTextAppearance(int)>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance))
	//* 125  258:aload_1         
	//* 126  259:getstatic       #193 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance>
	//* 127  262:invokevirtual   #147 <Method boolean TypedArray.hasValue(int)>
	//* 128  265:ifeq            283
			collapsingTextHelper.setExpandedTextAppearance(((TypedArray) (context)).getResourceId(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
	//  129  268:aload_0         
	//  130  269:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//  131  272:aload_1         
	//  132  273:getstatic       #193 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance>
	//  133  276:iconst_0        
	//  134  277:invokevirtual   #196 <Method int TypedArray.getResourceId(int, int)>
	//  135  280:invokevirtual   #182 <Method void CollapsingTextHelper.setExpandedTextAppearance(int)>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance))
	//* 136  283:aload_1         
	//* 137  284:getstatic       #199 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance>
	//* 138  287:invokevirtual   #147 <Method boolean TypedArray.hasValue(int)>
	//* 139  290:ifeq            308
			collapsingTextHelper.setCollapsedTextAppearance(((TypedArray) (context)).getResourceId(android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
	//  140  293:aload_0         
	//  141  294:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//  142  297:aload_1         
	//  143  298:getstatic       #199 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance>
	//  144  301:iconst_0        
	//  145  302:invokevirtual   #196 <Method int TypedArray.getResourceId(int, int)>
	//  146  305:invokevirtual   #190 <Method void CollapsingTextHelper.setCollapsedTextAppearance(int)>
		scrimVisibleHeightTrigger = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
	//  147  308:aload_0         
	//  148  309:aload_1         
	//  149  310:getstatic       #202 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger>
	//  150  313:iconst_m1       
	//  151  314:invokevirtual   #132 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  152  317:putfield        #71  <Field int scrimVisibleHeightTrigger>
		scrimAnimationDuration = ((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
	//  153  320:aload_0         
	//  154  321:aload_1         
	//  155  322:getstatic       #205 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_scrimAnimationDuration>
	//  156  325:sipush          600
	//  157  328:invokevirtual   #115 <Method int TypedArray.getInt(int, int)>
	//  158  331:i2l             
	//  159  332:putfield        #207 <Field long scrimAnimationDuration>
		setContentScrim(((TypedArray) (context)).getDrawable(android.support.design.R.styleable.CollapsingToolbarLayout_contentScrim));
	//  160  335:aload_0         
	//  161  336:aload_1         
	//  162  337:getstatic       #210 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_contentScrim>
	//  163  340:invokevirtual   #214 <Method Drawable TypedArray.getDrawable(int)>
	//  164  343:invokevirtual   #218 <Method void setContentScrim(Drawable)>
		setStatusBarScrim(((TypedArray) (context)).getDrawable(android.support.design.R.styleable.CollapsingToolbarLayout_statusBarScrim));
	//  165  346:aload_0         
	//  166  347:aload_1         
	//  167  348:getstatic       #221 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_statusBarScrim>
	//  168  351:invokevirtual   #214 <Method Drawable TypedArray.getDrawable(int)>
	//  169  354:invokevirtual   #224 <Method void setStatusBarScrim(Drawable)>
		toolbarId = ((TypedArray) (context)).getResourceId(android.support.design.R.styleable.CollapsingToolbarLayout_toolbarId, -1);
	//  170  357:aload_0         
	//  171  358:aload_1         
	//  172  359:getstatic       #227 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_toolbarId>
	//  173  362:iconst_m1       
	//  174  363:invokevirtual   #196 <Method int TypedArray.getResourceId(int, int)>
	//  175  366:putfield        #229 <Field int toolbarId>
		((TypedArray) (context)).recycle();
	//  176  369:aload_1         
	//  177  370:invokevirtual   #232 <Method void TypedArray.recycle()>
		setWillNotDraw(false);
	//  178  373:aload_0         
	//  179  374:iconst_0        
	//  180  375:invokevirtual   #236 <Method void setWillNotDraw(boolean)>
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
	//  181  378:aload_0         
	//  182  379:new             #6   <Class CollapsingToolbarLayout$1>
	//  183  382:dup             
	//  184  383:aload_0         
	//  185  384:invokespecial   #239 <Method void CollapsingToolbarLayout$1(CollapsingToolbarLayout)>
	//  186  387:invokestatic    #245 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//  187  390:return          
	}

	private void animateScrim(int i)
	{
		ensureToolbar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #249 <Method void ensureToolbar()>
		Object obj = ((Object) (scrimAnimator));
	//    2    4:aload_0         
	//    3    5:getfield        #251 <Field ValueAnimator scrimAnimator>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       83
		{
			scrimAnimator = new ValueAnimator();
	//    7   13:aload_0         
	//    8   14:new             #253 <Class ValueAnimator>
	//    9   17:dup             
	//   10   18:invokespecial   #254 <Method void ValueAnimator()>
	//   11   21:putfield        #251 <Field ValueAnimator scrimAnimator>
			scrimAnimator.setDuration(scrimAnimationDuration);
	//   12   24:aload_0         
	//   13   25:getfield        #251 <Field ValueAnimator scrimAnimator>
	//   14   28:aload_0         
	//   15   29:getfield        #207 <Field long scrimAnimationDuration>
	//   16   32:invokevirtual   #258 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   17   35:pop             
			ValueAnimator valueanimator = scrimAnimator;
	//   18   36:aload_0         
	//   19   37:getfield        #251 <Field ValueAnimator scrimAnimator>
	//   20   40:astore_3        
			if(i > scrimAlpha)
	//*  21   41:iload_1         
	//*  22   42:aload_0         
	//*  23   43:getfield        #260 <Field int scrimAlpha>
	//*  24   46:icmple          56
				obj = ((Object) (AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR));
	//   25   49:getstatic       #263 <Field android.animation.TimeInterpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
	//   26   52:astore_2        
			else
	//*  27   53:goto            60
				obj = ((Object) (AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR));
	//   28   56:getstatic       #266 <Field android.animation.TimeInterpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   29   59:astore_2        
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (obj)));
	//   30   60:aload_3         
	//   31   61:aload_2         
	//   32   62:invokevirtual   #269 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			scrimAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

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
	//   33   65:aload_0         
	//   34   66:getfield        #251 <Field ValueAnimator scrimAnimator>
	//   35   69:new             #8   <Class CollapsingToolbarLayout$2>
	//   36   72:dup             
	//   37   73:aload_0         
	//   38   74:invokespecial   #270 <Method void CollapsingToolbarLayout$2(CollapsingToolbarLayout)>
	//   39   77:invokevirtual   #274 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		} else
	//*  40   80:goto            97
		if(((ValueAnimator) (obj)).isRunning())
	//*  41   83:aload_2         
	//*  42   84:invokevirtual   #278 <Method boolean ValueAnimator.isRunning()>
	//*  43   87:ifeq            97
			scrimAnimator.cancel();
	//   44   90:aload_0         
	//   45   91:getfield        #251 <Field ValueAnimator scrimAnimator>
	//   46   94:invokevirtual   #281 <Method void ValueAnimator.cancel()>
		scrimAnimator.setIntValues(new int[] {
			scrimAlpha, i
		});
	//   47   97:aload_0         
	//   48   98:getfield        #251 <Field ValueAnimator scrimAnimator>
	//   49  101:iconst_2        
	//   50  102:newarray        int[]
	//   51  104:dup             
	//   52  105:iconst_0        
	//   53  106:aload_0         
	//   54  107:getfield        #260 <Field int scrimAlpha>
	//   55  110:iastore         
	//   56  111:dup             
	//   57  112:iconst_1        
	//   58  113:iload_1         
	//   59  114:iastore         
	//   60  115:invokevirtual   #285 <Method void ValueAnimator.setIntValues(int[])>
		scrimAnimator.start();
	//   61  118:aload_0         
	//   62  119:getfield        #251 <Field ValueAnimator scrimAnimator>
	//   63  122:invokevirtual   #288 <Method void ValueAnimator.start()>
	//   64  125:return          
	}

	private void ensureToolbar()
	{
		if(!refreshToolbar)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean refreshToolbar>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj1 = null;
	//    4    8:aconst_null     
	//    5    9:astore          4
		toolbar = null;
	//    6   11:aload_0         
	//    7   12:aconst_null     
	//    8   13:putfield        #290 <Field Toolbar toolbar>
		toolbarDirectChild = null;
	//    9   16:aload_0         
	//   10   17:aconst_null     
	//   11   18:putfield        #292 <Field View toolbarDirectChild>
		int i = toolbarId;
	//   12   21:aload_0         
	//   13   22:getfield        #229 <Field int toolbarId>
	//   14   25:istore_1        
		if(i != -1)
	//*  15   26:iload_1         
	//*  16   27:iconst_m1       
	//*  17   28:icmpeq          61
		{
			toolbar = (Toolbar)findViewById(i);
	//   18   31:aload_0         
	//   19   32:aload_0         
	//   20   33:iload_1         
	//   21   34:invokevirtual   #296 <Method View findViewById(int)>
	//   22   37:checkcast       #298 <Class Toolbar>
	//   23   40:putfield        #290 <Field Toolbar toolbar>
			Toolbar toolbar1 = toolbar;
	//   24   43:aload_0         
	//   25   44:getfield        #290 <Field Toolbar toolbar>
	//   26   47:astore_3        
			if(toolbar1 != null)
	//*  27   48:aload_3         
	//*  28   49:ifnull          61
				toolbarDirectChild = findDirectChild(((View) (toolbar1)));
	//   29   52:aload_0         
	//   30   53:aload_0         
	//   31   54:aload_3         
	//   32   55:invokespecial   #302 <Method View findDirectChild(View)>
	//   33   58:putfield        #292 <Field View toolbarDirectChild>
		}
		if(toolbar == null)
	//*  34   61:aload_0         
	//*  35   62:getfield        #290 <Field Toolbar toolbar>
	//*  36   65:ifnonnull       116
		{
			int k = getChildCount();
	//   37   68:aload_0         
	//   38   69:invokevirtual   #306 <Method int getChildCount()>
	//   39   72:istore_2        
			int j = 0;
	//   40   73:iconst_0        
	//   41   74:istore_1        
			Object obj;
			do
			{
				obj = ((Object) (obj1));
	//   42   75:aload           4
	//   43   77:astore_3        
				if(j >= k)
					break;
	//   44   78:iload_1         
	//   45   79:iload_2         
	//   46   80:icmpge          111
				obj = ((Object) (getChildAt(j)));
	//   47   83:aload_0         
	//   48   84:iload_1         
	//   49   85:invokevirtual   #309 <Method View getChildAt(int)>
	//   50   88:astore_3        
				if(obj instanceof Toolbar)
	//*  51   89:aload_3         
	//*  52   90:instanceof      #298 <Class Toolbar>
	//*  53   93:ifeq            104
				{
					obj = ((Object) ((Toolbar)obj));
	//   54   96:aload_3         
	//   55   97:checkcast       #298 <Class Toolbar>
	//   56  100:astore_3        
					break;
	//   57  101:goto            111
				}
				j++;
	//   58  104:iload_1         
	//   59  105:iconst_1        
	//   60  106:iadd            
	//   61  107:istore_1        
			} while(true);
	//   62  108:goto            75
			toolbar = ((Toolbar) (obj));
	//   63  111:aload_0         
	//   64  112:aload_3         
	//   65  113:putfield        #290 <Field Toolbar toolbar>
		}
		updateDummyView();
	//   66  116:aload_0         
	//   67  117:invokespecial   #312 <Method void updateDummyView()>
		refreshToolbar = false;
	//   68  120:aload_0         
	//   69  121:iconst_0        
	//   70  122:putfield        #62  <Field boolean refreshToolbar>
	//   71  125:return          
	}

	private View findDirectChild(View view)
	{
		ViewParent viewparent = view.getParent();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #318 <Method ViewParent View.getParent()>
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
	//*  13   19:instanceof      #314 <Class View>
	//*  14   22:ifeq            30
				view1 = (View)view;
	//   15   25:aload_1         
	//   16   26:checkcast       #314 <Class View>
	//   17   29:astore_2        

	//   18   30:aload_1         
	//   19   31:invokeinterface #321 <Method ViewParent ViewParent.getParent()>
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
	//    1    1:invokevirtual   #328 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_1        
		if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #330 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   5    9:ifeq            32
		{
			obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #330 <Class android.view.ViewGroup$MarginLayoutParams>
	//    8   16:astore_1        
			return view.getHeight() + ((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (obj)).bottomMargin;
	//    9   17:aload_0         
	//   10   18:invokevirtual   #333 <Method int View.getHeight()>
	//   11   21:aload_1         
	//   12   22:getfield        #336 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   13   25:iadd            
	//   14   26:aload_1         
	//   15   27:getfield        #339 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   16   30:iadd            
	//   17   31:ireturn         
		} else
		{
			return view.getHeight();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #333 <Method int View.getHeight()>
	//   20   36:ireturn         
		}
	}

	static ViewOffsetHelper getViewOffsetHelper(View view)
	{
		ViewOffsetHelper viewoffsethelper1 = (ViewOffsetHelper)view.getTag(android.support.design.R.id.view_offset_helper);
	//    0    0:aload_0         
	//    1    1:getstatic       #347 <Field int android.support.design.R$id.view_offset_helper>
	//    2    4:invokevirtual   #351 <Method Object View.getTag(int)>
	//    3    7:checkcast       #353 <Class ViewOffsetHelper>
	//    4   10:astore_2        
		ViewOffsetHelper viewoffsethelper = viewoffsethelper1;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(viewoffsethelper1 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       34
		{
			viewoffsethelper = new ViewOffsetHelper(view);
	//    9   17:new             #353 <Class ViewOffsetHelper>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #354 <Method void ViewOffsetHelper(View)>
	//   13   25:astore_1        
			view.setTag(android.support.design.R.id.view_offset_helper, ((Object) (viewoffsethelper)));
	//   14   26:aload_0         
	//   15   27:getstatic       #347 <Field int android.support.design.R$id.view_offset_helper>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #358 <Method void View.setTag(int, Object)>
		}
		return viewoffsethelper;
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	private boolean isToolbarChild(View view)
	{
		View view1 = toolbarDirectChild;
	//    0    0:aload_0         
	//    1    1:getfield        #292 <Field View toolbarDirectChild>
	//    2    4:astore_2        
		if(view1 != null && view1 != this)
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
	//*   5    9:aload_2         
	//*   6   10:aload_0         
	//*   7   11:if_acmpne       17
	//*   8   14:goto            24
		{
			if(view == view1)
	//*   9   17:aload_1         
	//*  10   18:aload_2         
	//*  11   19:if_acmpne       34
				return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		} else
		if(view == toolbar)
	//*  14   24:aload_1         
	//*  15   25:aload_0         
	//*  16   26:getfield        #290 <Field Toolbar toolbar>
	//*  17   29:if_acmpne       34
			return true;
	//   18   32:iconst_1        
	//   19   33:ireturn         
		return false;
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	private void updateContentDescriptionFromTitle()
	{
		setContentDescription(getTitle());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #365 <Method CharSequence getTitle()>
	//    3    5:invokevirtual   #368 <Method void setContentDescription(CharSequence)>
	//    4    8:return          
	}

	private void updateDummyView()
	{
		if(!collapsingTitleEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field boolean collapsingTitleEnabled>
	//*   2    4:ifne            39
		{
			Object obj = ((Object) (dummyView));
	//    3    7:aload_0         
	//    4    8:getfield        #370 <Field View dummyView>
	//    5   11:astore_1        
			if(obj != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          39
			{
				obj = ((Object) (((View) (obj)).getParent()));
	//    8   16:aload_1         
	//    9   17:invokevirtual   #318 <Method ViewParent View.getParent()>
	//   10   20:astore_1        
				if(obj instanceof ViewGroup)
	//*  11   21:aload_1         
	//*  12   22:instanceof      #372 <Class ViewGroup>
	//*  13   25:ifeq            39
					((ViewGroup)obj).removeView(dummyView);
	//   14   28:aload_1         
	//   15   29:checkcast       #372 <Class ViewGroup>
	//   16   32:aload_0         
	//   17   33:getfield        #370 <Field View dummyView>
	//   18   36:invokevirtual   #375 <Method void ViewGroup.removeView(View)>
			}
		}
		if(collapsingTitleEnabled && toolbar != null)
	//*  19   39:aload_0         
	//*  20   40:getfield        #165 <Field boolean collapsingTitleEnabled>
	//*  21   43:ifeq            98
	//*  22   46:aload_0         
	//*  23   47:getfield        #290 <Field Toolbar toolbar>
	//*  24   50:ifnull          98
		{
			if(dummyView == null)
	//*  25   53:aload_0         
	//*  26   54:getfield        #370 <Field View dummyView>
	//*  27   57:ifnonnull       75
				dummyView = new View(getContext());
	//   28   60:aload_0         
	//   29   61:new             #314 <Class View>
	//   30   64:dup             
	//   31   65:aload_0         
	//   32   66:invokevirtual   #379 <Method Context getContext()>
	//   33   69:invokespecial   #381 <Method void View(Context)>
	//   34   72:putfield        #370 <Field View dummyView>
			if(dummyView.getParent() == null)
	//*  35   75:aload_0         
	//*  36   76:getfield        #370 <Field View dummyView>
	//*  37   79:invokevirtual   #318 <Method ViewParent View.getParent()>
	//*  38   82:ifnonnull       98
				toolbar.addView(dummyView, -1, -1);
	//   39   85:aload_0         
	//   40   86:getfield        #290 <Field Toolbar toolbar>
	//   41   89:aload_0         
	//   42   90:getfield        #370 <Field View dummyView>
	//   43   93:iconst_m1       
	//   44   94:iconst_m1       
	//   45   95:invokevirtual   #385 <Method void Toolbar.addView(View, int, int)>
		}
	//   46   98:return          
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
	//    2    2:invokespecial   #391 <Method void FrameLayout.draw(Canvas)>
		ensureToolbar();
	//    3    5:aload_0         
	//    4    6:invokespecial   #249 <Method void ensureToolbar()>
		if(toolbar == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #290 <Field Toolbar toolbar>
	//*   7   13:ifnonnull       51
		{
			Drawable drawable = contentScrim;
	//    8   16:aload_0         
	//    9   17:getfield        #393 <Field Drawable contentScrim>
	//   10   20:astore_3        
			if(drawable != null && scrimAlpha > 0)
	//*  11   21:aload_3         
	//*  12   22:ifnull          51
	//*  13   25:aload_0         
	//*  14   26:getfield        #260 <Field int scrimAlpha>
	//*  15   29:ifle            51
			{
				drawable.mutate().setAlpha(scrimAlpha);
	//   16   32:aload_3         
	//   17   33:invokevirtual   #399 <Method Drawable Drawable.mutate()>
	//   18   36:aload_0         
	//   19   37:getfield        #260 <Field int scrimAlpha>
	//   20   40:invokevirtual   #402 <Method void Drawable.setAlpha(int)>
				contentScrim.draw(canvas);
	//   21   43:aload_0         
	//   22   44:getfield        #393 <Field Drawable contentScrim>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #403 <Method void Drawable.draw(Canvas)>
			}
		}
		if(collapsingTitleEnabled && drawCollapsingTitle)
	//*  25   51:aload_0         
	//*  26   52:getfield        #165 <Field boolean collapsingTitleEnabled>
	//*  27   55:ifeq            73
	//*  28   58:aload_0         
	//*  29   59:getfield        #405 <Field boolean drawCollapsingTitle>
	//*  30   62:ifeq            73
			collapsingTextHelper.draw(canvas);
	//   31   65:aload_0         
	//   32   66:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//   33   69:aload_1         
	//   34   70:invokevirtual   #406 <Method void CollapsingTextHelper.draw(Canvas)>
		if(statusBarScrim != null && scrimAlpha > 0)
	//*  35   73:aload_0         
	//*  36   74:getfield        #408 <Field Drawable statusBarScrim>
	//*  37   77:ifnull          155
	//*  38   80:aload_0         
	//*  39   81:getfield        #260 <Field int scrimAlpha>
	//*  40   84:ifle            155
		{
			WindowInsetsCompat windowinsetscompat = lastInsets;
	//   41   87:aload_0         
	//   42   88:getfield        #410 <Field WindowInsetsCompat lastInsets>
	//   43   91:astore_3        
			int i;
			if(windowinsetscompat != null)
	//*  44   92:aload_3         
	//*  45   93:ifnull          104
				i = windowinsetscompat.getSystemWindowInsetTop();
	//   46   96:aload_3         
	//   47   97:invokevirtual   #415 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   48  100:istore_2        
			else
	//*  49  101:goto            106
				i = 0;
	//   50  104:iconst_0        
	//   51  105:istore_2        
			if(i > 0)
	//*  52  106:iload_2         
	//*  53  107:ifle            155
			{
				statusBarScrim.setBounds(0, -currentOffset, getWidth(), i - currentOffset);
	//   54  110:aload_0         
	//   55  111:getfield        #408 <Field Drawable statusBarScrim>
	//   56  114:iconst_0        
	//   57  115:aload_0         
	//   58  116:getfield        #417 <Field int currentOffset>
	//   59  119:ineg            
	//   60  120:aload_0         
	//   61  121:invokevirtual   #420 <Method int getWidth()>
	//   62  124:iload_2         
	//   63  125:aload_0         
	//   64  126:getfield        #417 <Field int currentOffset>
	//   65  129:isub            
	//   66  130:invokevirtual   #424 <Method void Drawable.setBounds(int, int, int, int)>
				statusBarScrim.mutate().setAlpha(scrimAlpha);
	//   67  133:aload_0         
	//   68  134:getfield        #408 <Field Drawable statusBarScrim>
	//   69  137:invokevirtual   #399 <Method Drawable Drawable.mutate()>
	//   70  140:aload_0         
	//   71  141:getfield        #260 <Field int scrimAlpha>
	//   72  144:invokevirtual   #402 <Method void Drawable.setAlpha(int)>
				statusBarScrim.draw(canvas);
	//   73  147:aload_0         
	//   74  148:getfield        #408 <Field Drawable statusBarScrim>
	//   75  151:aload_1         
	//   76  152:invokevirtual   #403 <Method void Drawable.draw(Canvas)>
			}
		}
	//   77  155:return          
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		Drawable drawable = contentScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #393 <Field Drawable contentScrim>
	//    2    4:astore          7
		boolean flag1 = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		boolean flag;
		if(drawable != null && scrimAlpha > 0 && isToolbarChild(view))
	//*   5    9:aload           7
	//*   6   11:ifnull          57
	//*   7   14:aload_0         
	//*   8   15:getfield        #260 <Field int scrimAlpha>
	//*   9   18:ifle            57
	//*  10   21:aload_0         
	//*  11   22:aload_2         
	//*  12   23:invokespecial   #428 <Method boolean isToolbarChild(View)>
	//*  13   26:ifeq            57
		{
			contentScrim.mutate().setAlpha(scrimAlpha);
	//   14   29:aload_0         
	//   15   30:getfield        #393 <Field Drawable contentScrim>
	//   16   33:invokevirtual   #399 <Method Drawable Drawable.mutate()>
	//   17   36:aload_0         
	//   18   37:getfield        #260 <Field int scrimAlpha>
	//   19   40:invokevirtual   #402 <Method void Drawable.setAlpha(int)>
			contentScrim.draw(canvas);
	//   20   43:aload_0         
	//   21   44:getfield        #393 <Field Drawable contentScrim>
	//   22   47:aload_1         
	//   23   48:invokevirtual   #403 <Method void Drawable.draw(Canvas)>
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
	//*  33   64:invokespecial   #430 <Method boolean FrameLayout.drawChild(Canvas, View, long)>
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
	//    1    1:invokespecial   #433 <Method void FrameLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #437 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		Object obj = ((Object) (statusBarScrim));
	//    5    9:aload_0         
	//    6   10:getfield        #408 <Field Drawable statusBarScrim>
	//    7   13:astore          4
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(obj != null)
	//*  12   19:aload           4
	//*  13   21:ifnull          43
		{
			flag = flag1;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if(((Drawable) (obj)).isStateful())
	//*  16   26:aload           4
	//*  17   28:invokevirtual   #440 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | ((Drawable) (obj)).setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #444 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		obj = ((Object) (contentScrim));
	//   25   43:aload_0         
	//   26   44:getfield        #393 <Field Drawable contentScrim>
	//   27   47:astore          4
		flag1 = flag;
	//   28   49:iload_1         
	//   29   50:istore_2        
		if(obj != null)
	//*  30   51:aload           4
	//*  31   53:ifnull          75
		{
			flag1 = flag;
	//   32   56:iload_1         
	//   33   57:istore_2        
			if(((Drawable) (obj)).isStateful())
	//*  34   58:aload           4
	//*  35   60:invokevirtual   #440 <Method boolean Drawable.isStateful()>
	//*  36   63:ifeq            75
				flag1 = flag | ((Drawable) (obj)).setState(ai);
	//   37   66:iload_1         
	//   38   67:aload           4
	//   39   69:aload_3         
	//   40   70:invokevirtual   #444 <Method boolean Drawable.setState(int[])>
	//   41   73:ior             
	//   42   74:istore_2        
		}
		obj = ((Object) (collapsingTextHelper));
	//   43   75:aload_0         
	//   44   76:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//   45   79:astore          4
		flag = flag1;
	//   46   81:iload_2         
	//   47   82:istore_1        
		if(obj != null)
	//*  48   83:aload           4
	//*  49   85:ifnull          97
			flag = flag1 | ((CollapsingTextHelper) (obj)).setState(ai);
	//   50   88:iload_2         
	//   51   89:aload           4
	//   52   91:aload_3         
	//   53   92:invokevirtual   #445 <Method boolean CollapsingTextHelper.setState(int[])>
	//   54   95:ior             
	//   55   96:istore_1        
		if(flag)
	//*  56   97:iload_1         
	//*  57   98:ifeq            105
			invalidate();
	//   58  101:aload_0         
	//   59  102:invokevirtual   #448 <Method void invalidate()>
	//   60  105:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-1, -1);
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #453 <Method void CollapsingToolbarLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #455 <Method CollapsingToolbarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	protected volatile android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.widget.FrameLayout.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #455 <Method CollapsingToolbarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #461 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #465 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.widget.FrameLayout.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #379 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #466 <Method void CollapsingToolbarLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.widget.FrameLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.widget.FrameLayout.LayoutParams) (new LayoutParams(layoutparams)));
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #469 <Method void CollapsingToolbarLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public int getCollapsedTitleGravity()
	{
		return collapsingTextHelper.getCollapsedTextGravity();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:invokevirtual   #473 <Method int CollapsingTextHelper.getCollapsedTextGravity()>
	//    3    7:ireturn         
	}

	public Typeface getCollapsedTitleTypeface()
	{
		return collapsingTextHelper.getCollapsedTypeface();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:invokevirtual   #478 <Method Typeface CollapsingTextHelper.getCollapsedTypeface()>
	//    3    7:areturn         
	}

	public Drawable getContentScrim()
	{
		return contentScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #393 <Field Drawable contentScrim>
	//    2    4:areturn         
	}

	public int getExpandedTitleGravity()
	{
		return collapsingTextHelper.getExpandedTextGravity();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:invokevirtual   #485 <Method int CollapsingTextHelper.getExpandedTextGravity()>
	//    3    7:ireturn         
	}

	public int getExpandedTitleMarginBottom()
	{
		return expandedMarginBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field int expandedMarginBottom>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginEnd()
	{
		return expandedMarginEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int expandedMarginEnd>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginStart()
	{
		return expandedMarginStart;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field int expandedMarginStart>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginTop()
	{
		return expandedMarginTop;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field int expandedMarginTop>
	//    2    4:ireturn         
	}

	public Typeface getExpandedTitleTypeface()
	{
		return collapsingTextHelper.getExpandedTypeface();
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:invokevirtual   #493 <Method Typeface CollapsingTextHelper.getExpandedTypeface()>
	//    3    7:areturn         
	}

	final int getMaxOffsetForPinChild(View view)
	{
		ViewOffsetHelper viewoffsethelper = getViewOffsetHelper(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #496 <Method ViewOffsetHelper getViewOffsetHelper(View)>
	//    2    4:astore_2        
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #328 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    9:checkcast       #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    6   12:astore_3        
		return getHeight() - viewoffsethelper.getLayoutTop() - view.getHeight() - layoutparams.bottomMargin;
	//    7   13:aload_0         
	//    8   14:invokevirtual   #497 <Method int getHeight()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #500 <Method int ViewOffsetHelper.getLayoutTop()>
	//   11   21:isub            
	//   12   22:aload_1         
	//   13   23:invokevirtual   #333 <Method int View.getHeight()>
	//   14   26:isub            
	//   15   27:aload_3         
	//   16   28:getfield        #501 <Field int CollapsingToolbarLayout$LayoutParams.bottomMargin>
	//   17   31:isub            
	//   18   32:ireturn         
	}

	int getScrimAlpha()
	{
		return scrimAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field int scrimAlpha>
	//    2    4:ireturn         
	}

	public long getScrimAnimationDuration()
	{
		return scrimAnimationDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field long scrimAnimationDuration>
	//    2    4:lreturn         
	}

	public int getScrimVisibleHeightTrigger()
	{
		int i = scrimVisibleHeightTrigger;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int scrimVisibleHeightTrigger>
	//    2    4:istore_1        
		if(i >= 0)
	//*   3    5:iload_1         
	//*   4    6:iflt            11
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		WindowInsetsCompat windowinsetscompat = lastInsets;
	//    7   11:aload_0         
	//    8   12:getfield        #410 <Field WindowInsetsCompat lastInsets>
	//    9   15:astore_3        
		if(windowinsetscompat != null)
	//*  10   16:aload_3         
	//*  11   17:ifnull          28
			i = windowinsetscompat.getSystemWindowInsetTop();
	//   12   20:aload_3         
	//   13   21:invokevirtual   #415 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   14   24:istore_1        
		else
	//*  15   25:goto            30
			i = 0;
	//   16   28:iconst_0        
	//   17   29:istore_1        
		int j = ViewCompat.getMinimumHeight(((View) (this)));
	//   18   30:aload_0         
	//   19   31:invokestatic    #508 <Method int ViewCompat.getMinimumHeight(View)>
	//   20   34:istore_2        
		if(j > 0)
	//*  21   35:iload_2         
	//*  22   36:ifle            52
			return Math.min(j * 2 + i, getHeight());
	//   23   39:iload_2         
	//   24   40:iconst_2        
	//   25   41:imul            
	//   26   42:iload_1         
	//   27   43:iadd            
	//   28   44:aload_0         
	//   29   45:invokevirtual   #497 <Method int getHeight()>
	//   30   48:invokestatic    #513 <Method int Math.min(int, int)>
	//   31   51:ireturn         
		else
			return getHeight() / 3;
	//   32   52:aload_0         
	//   33   53:invokevirtual   #497 <Method int getHeight()>
	//   34   56:iconst_3        
	//   35   57:idiv            
	//   36   58:ireturn         
	}

	public Drawable getStatusBarScrim()
	{
		return statusBarScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field Drawable statusBarScrim>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		if(collapsingTitleEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field boolean collapsingTitleEnabled>
	//*   2    4:ifeq            15
			return collapsingTextHelper.getText();
	//    3    7:aload_0         
	//    4    8:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    5   11:invokevirtual   #516 <Method CharSequence CollapsingTextHelper.getText()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public boolean isTitleEnabled()
	{
		return collapsingTitleEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field boolean collapsingTitleEnabled>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #520 <Method void FrameLayout.onAttachedToWindow()>
		ViewParent viewparent = getParent();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #521 <Method ViewParent getParent()>
	//    4    8:astore_1        
		if(viewparent instanceof AppBarLayout)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #523 <Class AppBarLayout>
	//*   7   13:ifeq            61
		{
			ViewCompat.setFitsSystemWindows(((View) (this)), ViewCompat.getFitsSystemWindows((View)viewparent));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #314 <Class View>
	//   11   21:invokestatic    #526 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//   12   24:invokestatic    #530 <Method void ViewCompat.setFitsSystemWindows(View, boolean)>
			if(onOffsetChangedListener == null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #532 <Field AppBarLayout$OnOffsetChangedListener onOffsetChangedListener>
	//*  15   31:ifnonnull       46
				onOffsetChangedListener = ((AppBarLayout.OnOffsetChangedListener) (new OffsetUpdateListener()));
	//   16   34:aload_0         
	//   17   35:new             #13  <Class CollapsingToolbarLayout$OffsetUpdateListener>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #533 <Method void CollapsingToolbarLayout$OffsetUpdateListener(CollapsingToolbarLayout)>
	//   21   43:putfield        #532 <Field AppBarLayout$OnOffsetChangedListener onOffsetChangedListener>
			((AppBarLayout)viewparent).addOnOffsetChangedListener(onOffsetChangedListener);
	//   22   46:aload_1         
	//   23   47:checkcast       #523 <Class AppBarLayout>
	//   24   50:aload_0         
	//   25   51:getfield        #532 <Field AppBarLayout$OnOffsetChangedListener onOffsetChangedListener>
	//   26   54:invokevirtual   #537 <Method void AppBarLayout.addOnOffsetChangedListener(AppBarLayout$OnOffsetChangedListener)>
			ViewCompat.requestApplyInsets(((View) (this)));
	//   27   57:aload_0         
	//   28   58:invokestatic    #540 <Method void ViewCompat.requestApplyInsets(View)>
		}
	//   29   61:return          
	}

	protected void onDetachedFromWindow()
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #521 <Method ViewParent getParent()>
	//    2    4:astore_1        
		AppBarLayout.OnOffsetChangedListener onoffsetchangedlistener = onOffsetChangedListener;
	//    3    5:aload_0         
	//    4    6:getfield        #532 <Field AppBarLayout$OnOffsetChangedListener onOffsetChangedListener>
	//    5    9:astore_2        
		if(onoffsetchangedlistener != null && (viewparent instanceof AppBarLayout))
	//*   6   10:aload_2         
	//*   7   11:ifnull          29
	//*   8   14:aload_1         
	//*   9   15:instanceof      #523 <Class AppBarLayout>
	//*  10   18:ifeq            29
			((AppBarLayout)viewparent).removeOnOffsetChangedListener(onoffsetchangedlistener);
	//   11   21:aload_1         
	//   12   22:checkcast       #523 <Class AppBarLayout>
	//   13   25:aload_2         
	//   14   26:invokevirtual   #544 <Method void AppBarLayout.removeOnOffsetChangedListener(AppBarLayout$OnOffsetChangedListener)>
		super.onDetachedFromWindow();
	//   15   29:aload_0         
	//   16   30:invokespecial   #546 <Method void FrameLayout.onDetachedFromWindow()>
	//   17   33:return          
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
	//    6    8:invokespecial   #550 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		WindowInsetsCompat windowinsetscompat = lastInsets;
	//    7   11:aload_0         
	//    8   12:getfield        #410 <Field WindowInsetsCompat lastInsets>
	//    9   15:astore          15
		boolean flag2 = false;
	//   10   17:iconst_0        
	//   11   18:istore          9
		if(windowinsetscompat != null)
	//*  12   20:aload           15
	//*  13   22:ifnull          90
		{
			int k1 = windowinsetscompat.getSystemWindowInsetTop();
	//   14   25:aload           15
	//   15   27:invokevirtual   #415 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   16   30:istore          7
			int i2 = getChildCount();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #306 <Method int getChildCount()>
	//   19   36:istore          8
			for(int i1 = 0; i1 < i2; i1++)
	//*  20   38:iconst_0        
	//*  21   39:istore          6
	//*  22   41:iload           6
	//*  23   43:iload           8
	//*  24   45:icmpge          90
			{
				View view = getChildAt(i1);
	//   25   48:aload_0         
	//   26   49:iload           6
	//   27   51:invokevirtual   #309 <Method View getChildAt(int)>
	//   28   54:astore          15
				if(!ViewCompat.getFitsSystemWindows(view) && view.getTop() < k1)
	//*  29   56:aload           15
	//*  30   58:invokestatic    #526 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  31   61:ifne            81
	//*  32   64:aload           15
	//*  33   66:invokevirtual   #553 <Method int View.getTop()>
	//*  34   69:iload           7
	//*  35   71:icmpge          81
					ViewCompat.offsetTopAndBottom(view, k1);
	//   36   74:aload           15
	//   37   76:iload           7
	//   38   78:invokestatic    #557 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			}

	//   39   81:iload           6
	//   40   83:iconst_1        
	//   41   84:iadd            
	//   42   85:istore          6
		}
	//*  43   87:goto            41
		if(collapsingTitleEnabled)
	//*  44   90:aload_0         
	//*  45   91:getfield        #165 <Field boolean collapsingTitleEnabled>
	//*  46   94:ifeq            435
		{
			View view1 = dummyView;
	//   47   97:aload_0         
	//   48   98:getfield        #370 <Field View dummyView>
	//   49  101:astore          15
			if(view1 != null)
	//*  50  103:aload           15
	//*  51  105:ifnull          435
			{
				flag = ViewCompat.isAttachedToWindow(view1);
	//   52  108:aload           15
	//   53  110:invokestatic    #560 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//   54  113:istore_1        
				boolean flag1 = true;
	//   55  114:iconst_1        
	//   56  115:istore          6
				if(flag && dummyView.getVisibility() == 0)
	//*  57  117:iload_1         
	//*  58  118:ifeq            136
	//*  59  121:aload_0         
	//*  60  122:getfield        #370 <Field View dummyView>
	//*  61  125:invokevirtual   #563 <Method int View.getVisibility()>
	//*  62  128:ifne            136
					flag = true;
	//   63  131:iconst_1        
	//   64  132:istore_1        
				else
	//*  65  133:goto            138
					flag = false;
	//   66  136:iconst_0        
	//   67  137:istore_1        
				drawCollapsingTitle = flag;
	//   68  138:aload_0         
	//   69  139:iload_1         
	//   70  140:putfield        #405 <Field boolean drawCollapsingTitle>
				if(drawCollapsingTitle)
	//*  71  143:aload_0         
	//*  72  144:getfield        #405 <Field boolean drawCollapsingTitle>
	//*  73  147:ifeq            435
				{
					if(ViewCompat.getLayoutDirection(((View) (this))) != 1)
	//*  74  150:aload_0         
	//*  75  151:invokestatic    #566 <Method int ViewCompat.getLayoutDirection(View)>
	//*  76  154:iconst_1        
	//*  77  155:icmpne          161
	//*  78  158:goto            164
						flag1 = false;
	//   79  161:iconst_0        
	//   80  162:istore          6
					Object obj = ((Object) (toolbarDirectChild));
	//   81  164:aload_0         
	//   82  165:getfield        #292 <Field View toolbarDirectChild>
	//   83  168:astore          15
					if(obj == null)
	//*  84  170:aload           15
	//*  85  172:ifnull          178
	//*  86  175:goto            184
						obj = ((Object) (toolbar));
	//   87  178:aload_0         
	//   88  179:getfield        #290 <Field Toolbar toolbar>
	//   89  182:astore          15
					int k2 = getMaxOffsetForPinChild(((View) (obj)));
	//   90  184:aload_0         
	//   91  185:aload           15
	//   92  187:invokevirtual   #568 <Method int getMaxOffsetForPinChild(View)>
	//   93  190:istore          10
					DescendantOffsetUtils.getDescendantRect(((ViewGroup) (this)), dummyView, tmpRect);
	//   94  192:aload_0         
	//   95  193:aload_0         
	//   96  194:getfield        #370 <Field View dummyView>
	//   97  197:aload_0         
	//   98  198:getfield        #69  <Field Rect tmpRect>
	//   99  201:invokestatic    #574 <Method void DescendantOffsetUtils.getDescendantRect(ViewGroup, View, Rect)>
					obj = ((Object) (collapsingTextHelper));
	//  100  204:aload_0         
	//  101  205:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//  102  208:astore          15
					int l2 = tmpRect.left;
	//  103  210:aload_0         
	//  104  211:getfield        #69  <Field Rect tmpRect>
	//  105  214:getfield        #577 <Field int Rect.left>
	//  106  217:istore          11
					int l1;
					if(flag1)
	//* 107  219:iload           6
	//* 108  221:ifeq            236
						l1 = toolbar.getTitleMarginEnd();
	//  109  224:aload_0         
	//  110  225:getfield        #290 <Field Toolbar toolbar>
	//  111  228:invokevirtual   #580 <Method int Toolbar.getTitleMarginEnd()>
	//  112  231:istore          7
					else
	//* 113  233:goto            245
						l1 = toolbar.getTitleMarginStart();
	//  114  236:aload_0         
	//  115  237:getfield        #290 <Field Toolbar toolbar>
	//  116  240:invokevirtual   #583 <Method int Toolbar.getTitleMarginStart()>
	//  117  243:istore          7
					int i3 = tmpRect.top;
	//  118  245:aload_0         
	//  119  246:getfield        #69  <Field Rect tmpRect>
	//  120  249:getfield        #586 <Field int Rect.top>
	//  121  252:istore          12
					int j3 = toolbar.getTitleMarginTop();
	//  122  254:aload_0         
	//  123  255:getfield        #290 <Field Toolbar toolbar>
	//  124  258:invokevirtual   #589 <Method int Toolbar.getTitleMarginTop()>
	//  125  261:istore          13
					int k3 = tmpRect.right;
	//  126  263:aload_0         
	//  127  264:getfield        #69  <Field Rect tmpRect>
	//  128  267:getfield        #592 <Field int Rect.right>
	//  129  270:istore          14
					int j2;
					if(flag1)
	//* 130  272:iload           6
	//* 131  274:ifeq            289
						j2 = toolbar.getTitleMarginStart();
	//  132  277:aload_0         
	//  133  278:getfield        #290 <Field Toolbar toolbar>
	//  134  281:invokevirtual   #583 <Method int Toolbar.getTitleMarginStart()>
	//  135  284:istore          8
					else
	//* 136  286:goto            298
						j2 = toolbar.getTitleMarginEnd();
	//  137  289:aload_0         
	//  138  290:getfield        #290 <Field Toolbar toolbar>
	//  139  293:invokevirtual   #580 <Method int Toolbar.getTitleMarginEnd()>
	//  140  296:istore          8
					((CollapsingTextHelper) (obj)).setCollapsedBounds(l2 + l1, i3 + k2 + j3, k3 + j2, (tmpRect.bottom + k2) - toolbar.getTitleMarginBottom());
	//  141  298:aload           15
	//  142  300:iload           11
	//  143  302:iload           7
	//  144  304:iadd            
	//  145  305:iload           12
	//  146  307:iload           10
	//  147  309:iadd            
	//  148  310:iload           13
	//  149  312:iadd            
	//  150  313:iload           14
	//  151  315:iload           8
	//  152  317:iadd            
	//  153  318:aload_0         
	//  154  319:getfield        #69  <Field Rect tmpRect>
	//  155  322:getfield        #595 <Field int Rect.bottom>
	//  156  325:iload           10
	//  157  327:iadd            
	//  158  328:aload_0         
	//  159  329:getfield        #290 <Field Toolbar toolbar>
	//  160  332:invokevirtual   #598 <Method int Toolbar.getTitleMarginBottom()>
	//  161  335:isub            
	//  162  336:invokevirtual   #601 <Method void CollapsingTextHelper.setCollapsedBounds(int, int, int, int)>
					obj = ((Object) (collapsingTextHelper));
	//  163  339:aload_0         
	//  164  340:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//  165  343:astore          15
					if(flag1)
	//* 166  345:iload           6
	//* 167  347:ifeq            359
						l1 = expandedMarginEnd;
	//  168  350:aload_0         
	//  169  351:getfield        #136 <Field int expandedMarginEnd>
	//  170  354:istore          7
					else
	//* 171  356:goto            365
						l1 = expandedMarginStart;
	//  172  359:aload_0         
	//  173  360:getfield        #140 <Field int expandedMarginStart>
	//  174  363:istore          7
					j2 = tmpRect.top;
	//  175  365:aload_0         
	//  176  366:getfield        #69  <Field Rect tmpRect>
	//  177  369:getfield        #586 <Field int Rect.top>
	//  178  372:istore          8
					k2 = expandedMarginTop;
	//  179  374:aload_0         
	//  180  375:getfield        #138 <Field int expandedMarginTop>
	//  181  378:istore          10
					int j1;
					if(flag1)
	//* 182  380:iload           6
	//* 183  382:ifeq            394
						j1 = expandedMarginStart;
	//  184  385:aload_0         
	//  185  386:getfield        #140 <Field int expandedMarginStart>
	//  186  389:istore          6
					else
	//* 187  391:goto            400
						j1 = expandedMarginEnd;
	//  188  394:aload_0         
	//  189  395:getfield        #136 <Field int expandedMarginEnd>
	//  190  398:istore          6
					((CollapsingTextHelper) (obj)).setExpandedBounds(l1, j2 + k2, k - i - j1, l - j - expandedMarginBottom);
	//  191  400:aload           15
	//  192  402:iload           7
	//  193  404:iload           8
	//  194  406:iload           10
	//  195  408:iadd            
	//  196  409:iload           4
	//  197  411:iload_2         
	//  198  412:isub            
	//  199  413:iload           6
	//  200  415:isub            
	//  201  416:iload           5
	//  202  418:iload_3         
	//  203  419:isub            
	//  204  420:aload_0         
	//  205  421:getfield        #134 <Field int expandedMarginBottom>
	//  206  424:isub            
	//  207  425:invokevirtual   #604 <Method void CollapsingTextHelper.setExpandedBounds(int, int, int, int)>
					collapsingTextHelper.recalculate();
	//  208  428:aload_0         
	//  209  429:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//  210  432:invokevirtual   #607 <Method void CollapsingTextHelper.recalculate()>
				}
			}
		}
		j = getChildCount();
	//  211  435:aload_0         
	//  212  436:invokevirtual   #306 <Method int getChildCount()>
	//  213  439:istore_3        
		for(i = ((int) (flag2)); i < j; i++)
	//* 214  440:iload           9
	//* 215  442:istore_2        
	//* 216  443:iload_2         
	//* 217  444:iload_3         
	//* 218  445:icmpge          466
			getViewOffsetHelper(getChildAt(i)).onViewLayout();
	//  219  448:aload_0         
	//  220  449:iload_2         
	//  221  450:invokevirtual   #309 <Method View getChildAt(int)>
	//  222  453:invokestatic    #496 <Method ViewOffsetHelper getViewOffsetHelper(View)>
	//  223  456:invokevirtual   #610 <Method void ViewOffsetHelper.onViewLayout()>

	//  224  459:iload_2         
	//  225  460:iconst_1        
	//  226  461:iadd            
	//  227  462:istore_2        
	//* 228  463:goto            443
		if(toolbar != null)
	//* 229  466:aload_0         
	//* 230  467:getfield        #290 <Field Toolbar toolbar>
	//* 231  470:ifnull          547
		{
			if(collapsingTitleEnabled && TextUtils.isEmpty(collapsingTextHelper.getText()))
	//* 232  473:aload_0         
	//* 233  474:getfield        #165 <Field boolean collapsingTitleEnabled>
	//* 234  477:ifeq            504
	//* 235  480:aload_0         
	//* 236  481:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//* 237  484:invokevirtual   #516 <Method CharSequence CollapsingTextHelper.getText()>
	//* 238  487:invokestatic    #616 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 239  490:ifeq            504
				setTitle(toolbar.getTitle());
	//  240  493:aload_0         
	//  241  494:aload_0         
	//  242  495:getfield        #290 <Field Toolbar toolbar>
	//  243  498:invokevirtual   #617 <Method CharSequence Toolbar.getTitle()>
	//  244  501:invokevirtual   #176 <Method void setTitle(CharSequence)>
			View view2 = toolbarDirectChild;
	//  245  504:aload_0         
	//  246  505:getfield        #292 <Field View toolbarDirectChild>
	//  247  508:astore          15
			if(view2 != null && view2 != this)
	//* 248  510:aload           15
	//* 249  512:ifnull          536
	//* 250  515:aload           15
	//* 251  517:aload_0         
	//* 252  518:if_acmpne       524
	//* 253  521:goto            536
				setMinimumHeight(getHeightWithMargins(view2));
	//  254  524:aload_0         
	//  255  525:aload           15
	//  256  527:invokestatic    #619 <Method int getHeightWithMargins(View)>
	//  257  530:invokevirtual   #622 <Method void setMinimumHeight(int)>
			else
	//* 258  533:goto            547
				setMinimumHeight(getHeightWithMargins(((View) (toolbar))));
	//  259  536:aload_0         
	//  260  537:aload_0         
	//  261  538:getfield        #290 <Field Toolbar toolbar>
	//  262  541:invokestatic    #619 <Method int getHeightWithMargins(View)>
	//  263  544:invokevirtual   #622 <Method void setMinimumHeight(int)>
		}
		updateScrimVisibility();
	//  264  547:aload_0         
	//  265  548:invokevirtual   #625 <Method void updateScrimVisibility()>
	//  266  551:return          
	}

	protected void onMeasure(int i, int j)
	{
		ensureToolbar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #249 <Method void ensureToolbar()>
		super.onMeasure(i, j);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #628 <Method void FrameLayout.onMeasure(int, int)>
		int k = android.view.View.MeasureSpec.getMode(j);
	//    6   10:iload_2         
	//    7   11:invokestatic    #634 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   14:istore_3        
		WindowInsetsCompat windowinsetscompat = lastInsets;
	//    9   15:aload_0         
	//   10   16:getfield        #410 <Field WindowInsetsCompat lastInsets>
	//   11   19:astore          4
		if(windowinsetscompat != null)
	//*  12   21:aload           4
	//*  13   23:ifnull          35
			j = windowinsetscompat.getSystemWindowInsetTop();
	//   14   26:aload           4
	//   15   28:invokevirtual   #415 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   16   31:istore_2        
		else
	//*  17   32:goto            37
			j = 0;
	//   18   35:iconst_0        
	//   19   36:istore_2        
		if(k == 0 && j > 0)
	//*  20   37:iload_3         
	//*  21   38:ifne            62
	//*  22   41:iload_2         
	//*  23   42:ifle            62
			super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + j, 0x40000000));
	//   24   45:aload_0         
	//   25   46:iload_1         
	//   26   47:aload_0         
	//   27   48:invokevirtual   #637 <Method int getMeasuredHeight()>
	//   28   51:iload_2         
	//   29   52:iadd            
	//   30   53:ldc2            #638 <Int 0x40000000>
	//   31   56:invokestatic    #641 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   32   59:invokespecial   #628 <Method void FrameLayout.onMeasure(int, int)>
	//   33   62:return          
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #644 <Method void FrameLayout.onSizeChanged(int, int, int, int)>
		Drawable drawable = contentScrim;
	//    6    9:aload_0         
	//    7   10:getfield        #393 <Field Drawable contentScrim>
	//    8   13:astore          5
		if(drawable != null)
	//*   9   15:aload           5
	//*  10   17:ifnull          29
			drawable.setBounds(0, 0, i, j);
	//   11   20:aload           5
	//   12   22:iconst_0        
	//   13   23:iconst_0        
	//   14   24:iload_1         
	//   15   25:iload_2         
	//   16   26:invokevirtual   #424 <Method void Drawable.setBounds(int, int, int, int)>
	//   17   29:return          
	}

	WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat windowinsetscompat)
	{
		WindowInsetsCompat windowinsetscompat1;
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #526 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   2    4:ifeq            12
			windowinsetscompat1 = windowinsetscompat;
	//    3    7:aload_1         
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			windowinsetscompat1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		if(!ObjectsCompat.equals(((Object) (lastInsets)), ((Object) (windowinsetscompat1))))
	//*   8   14:aload_0         
	//*   9   15:getfield        #410 <Field WindowInsetsCompat lastInsets>
	//*  10   18:aload_2         
	//*  11   19:invokestatic    #652 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*  12   22:ifne            34
		{
			lastInsets = windowinsetscompat1;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #410 <Field WindowInsetsCompat lastInsets>
			requestLayout();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #655 <Method void requestLayout()>
		}
		return windowinsetscompat.consumeSystemWindowInsets();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #659 <Method WindowInsetsCompat WindowInsetsCompat.consumeSystemWindowInsets()>
	//   20   38:areturn         
	}

	public void setCollapsedTitleGravity(int i)
	{
		collapsingTextHelper.setCollapsedTextGravity(i);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #126 <Method void CollapsingTextHelper.setCollapsedTextGravity(int)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextAppearance(int i)
	{
		collapsingTextHelper.setCollapsedTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #190 <Method void CollapsingTextHelper.setCollapsedTextAppearance(int)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextColor(int i)
	{
		setCollapsedTitleTextColor(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #670 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #673 <Method void setCollapsedTitleTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextColor(ColorStateList colorstatelist)
	{
		collapsingTextHelper.setCollapsedTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #676 <Method void CollapsingTextHelper.setCollapsedTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setCollapsedTitleTypeface(Typeface typeface)
	{
		collapsingTextHelper.setCollapsedTypeface(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #681 <Method void CollapsingTextHelper.setCollapsedTypeface(Typeface)>
	//    4    8:return          
	}

	public void setContentScrim(Drawable drawable)
	{
		Drawable drawable2 = contentScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #393 <Field Drawable contentScrim>
	//    2    4:astore_3        
		if(drawable2 != drawable)
	//*   3    5:aload_3         
	//*   4    6:aload_1         
	//*   5    7:if_acmpeq       81
		{
			Drawable drawable1 = null;
	//    6   10:aconst_null     
	//    7   11:astore_2        
			if(drawable2 != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          21
				drawable2.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   10   16:aload_3         
	//   11   17:aconst_null     
	//   12   18:invokevirtual   #685 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  13   21:aload_1         
	//*  14   22:ifnull          30
				drawable1 = drawable.mutate();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #399 <Method Drawable Drawable.mutate()>
	//   17   29:astore_2        
			contentScrim = drawable1;
	//   18   30:aload_0         
	//   19   31:aload_2         
	//   20   32:putfield        #393 <Field Drawable contentScrim>
			drawable = contentScrim;
	//   21   35:aload_0         
	//   22   36:getfield        #393 <Field Drawable contentScrim>
	//   23   39:astore_1        
			if(drawable != null)
	//*  24   40:aload_1         
	//*  25   41:ifnull          77
			{
				drawable.setBounds(0, 0, getWidth(), getHeight());
	//   26   44:aload_1         
	//   27   45:iconst_0        
	//   28   46:iconst_0        
	//   29   47:aload_0         
	//   30   48:invokevirtual   #420 <Method int getWidth()>
	//   31   51:aload_0         
	//   32   52:invokevirtual   #497 <Method int getHeight()>
	//   33   55:invokevirtual   #424 <Method void Drawable.setBounds(int, int, int, int)>
				contentScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   34   58:aload_0         
	//   35   59:getfield        #393 <Field Drawable contentScrim>
	//   36   62:aload_0         
	//   37   63:invokevirtual   #685 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				contentScrim.setAlpha(scrimAlpha);
	//   38   66:aload_0         
	//   39   67:getfield        #393 <Field Drawable contentScrim>
	//   40   70:aload_0         
	//   41   71:getfield        #260 <Field int scrimAlpha>
	//   42   74:invokevirtual   #402 <Method void Drawable.setAlpha(int)>
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   43   77:aload_0         
	//   44   78:invokestatic    #688 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   45   81:return          
	}

	public void setContentScrimColor(int i)
	{
		setContentScrim(((Drawable) (new ColorDrawable(i))));
	//    0    0:aload_0         
	//    1    1:new             #691 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #693 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #218 <Method void setContentScrim(Drawable)>
	//    6   12:return          
	}

	public void setContentScrimResource(int i)
	{
		setContentScrim(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #379 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #700 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #218 <Method void setContentScrim(Drawable)>
	//    6   12:return          
	}

	public void setExpandedTitleColor(int i)
	{
		setExpandedTitleTextColor(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #670 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #704 <Method void setExpandedTitleTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setExpandedTitleGravity(int i)
	{
		collapsingTextHelper.setExpandedTextGravity(i);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #119 <Method void CollapsingTextHelper.setExpandedTextGravity(int)>
	//    4    8:return          
	}

	public void setExpandedTitleMargin(int i, int j, int k, int l)
	{
		expandedMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #140 <Field int expandedMarginStart>
		expandedMarginTop = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #138 <Field int expandedMarginTop>
		expandedMarginEnd = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #136 <Field int expandedMarginEnd>
		expandedMarginBottom = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #134 <Field int expandedMarginBottom>
		requestLayout();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #655 <Method void requestLayout()>
	//   14   25:return          
	}

	public void setExpandedTitleMarginBottom(int i)
	{
		expandedMarginBottom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #134 <Field int expandedMarginBottom>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #655 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginEnd(int i)
	{
		expandedMarginEnd = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #136 <Field int expandedMarginEnd>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #655 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginStart(int i)
	{
		expandedMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #140 <Field int expandedMarginStart>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #655 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginTop(int i)
	{
		expandedMarginTop = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #138 <Field int expandedMarginTop>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #655 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleTextAppearance(int i)
	{
		collapsingTextHelper.setExpandedTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #182 <Method void CollapsingTextHelper.setExpandedTextAppearance(int)>
	//    4    8:return          
	}

	public void setExpandedTitleTextColor(ColorStateList colorstatelist)
	{
		collapsingTextHelper.setExpandedTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #714 <Method void CollapsingTextHelper.setExpandedTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setExpandedTitleTypeface(Typeface typeface)
	{
		collapsingTextHelper.setExpandedTypeface(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #718 <Method void CollapsingTextHelper.setExpandedTypeface(Typeface)>
	//    4    8:return          
	}

	void setScrimAlpha(int i)
	{
		if(i != scrimAlpha)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #260 <Field int scrimAlpha>
	//*   3    5:icmpeq          37
		{
			if(contentScrim != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #393 <Field Drawable contentScrim>
	//*   6   12:ifnull          28
			{
				Toolbar toolbar1 = toolbar;
	//    7   15:aload_0         
	//    8   16:getfield        #290 <Field Toolbar toolbar>
	//    9   19:astore_2        
				if(toolbar1 != null)
	//*  10   20:aload_2         
	//*  11   21:ifnull          28
					ViewCompat.postInvalidateOnAnimation(((View) (toolbar1)));
	//   12   24:aload_2         
	//   13   25:invokestatic    #688 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			}
			scrimAlpha = i;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:putfield        #260 <Field int scrimAlpha>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   17   33:aload_0         
	//   18   34:invokestatic    #688 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   19   37:return          
	}

	public void setScrimAnimationDuration(long l)
	{
		scrimAnimationDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #207 <Field long scrimAnimationDuration>
	//    3    5:return          
	}

	public void setScrimVisibleHeightTrigger(int i)
	{
		if(scrimVisibleHeightTrigger != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int scrimVisibleHeightTrigger>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			scrimVisibleHeightTrigger = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #71  <Field int scrimVisibleHeightTrigger>
			updateScrimVisibility();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #625 <Method void updateScrimVisibility()>
		}
	//    9   17:return          
	}

	public void setScrimsShown(boolean flag)
	{
		boolean flag1;
		if(ViewCompat.isLaidOut(((View) (this))) && !isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #730 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifeq            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #733 <Method boolean isInEditMode()>
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
	//   14   24:invokevirtual   #736 <Method void setScrimsShown(boolean, boolean)>
	//   15   27:return          
	}

	public void setScrimsShown(boolean flag, boolean flag1)
	{
		if(scrimsAreShown != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #738 <Field boolean scrimsAreShown>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          52
		{
			char c = '\377';
	//    4    8:sipush          255
	//    5   11:istore_3        
			if(flag1)
	//*   6   12:iload_2         
	//*   7   13:ifeq            33
			{
				if(!flag)
	//*   8   16:iload_1         
	//*   9   17:ifeq            23
	//*  10   20:goto            25
					c = '\0';
	//   11   23:iconst_0        
	//   12   24:istore_3        
				animateScrim(((int) (c)));
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:invokespecial   #740 <Method void animateScrim(int)>
			} else
	//*  16   30:goto            47
			{
				if(!flag)
	//*  17   33:iload_1         
	//*  18   34:ifeq            40
	//*  19   37:goto            42
					c = '\0';
	//   20   40:iconst_0        
	//   21   41:istore_3        
				setScrimAlpha(((int) (c)));
	//   22   42:aload_0         
	//   23   43:iload_3         
	//   24   44:invokevirtual   #742 <Method void setScrimAlpha(int)>
			}
			scrimsAreShown = flag;
	//   25   47:aload_0         
	//   26   48:iload_1         
	//   27   49:putfield        #738 <Field boolean scrimsAreShown>
		}
	//   28   52:return          
	}

	public void setStatusBarScrim(Drawable drawable)
	{
		Drawable drawable2 = statusBarScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field Drawable statusBarScrim>
	//    2    4:astore          4
		if(drawable2 != drawable)
	//*   3    6:aload           4
	//*   4    8:aload_1         
	//*   5    9:if_acmpeq       128
		{
			Drawable drawable1 = null;
	//    6   12:aconst_null     
	//    7   13:astore_3        
			if(drawable2 != null)
	//*   8   14:aload           4
	//*   9   16:ifnull          25
				drawable2.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   10   19:aload           4
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #685 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          34
				drawable1 = drawable.mutate();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #399 <Method Drawable Drawable.mutate()>
	//   17   33:astore_3        
			statusBarScrim = drawable1;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:putfield        #408 <Field Drawable statusBarScrim>
			drawable = statusBarScrim;
	//   21   39:aload_0         
	//   22   40:getfield        #408 <Field Drawable statusBarScrim>
	//   23   43:astore_1        
			if(drawable != null)
	//*  24   44:aload_1         
	//*  25   45:ifnull          124
			{
				if(drawable.isStateful())
	//*  26   48:aload_1         
	//*  27   49:invokevirtual   #440 <Method boolean Drawable.isStateful()>
	//*  28   52:ifeq            67
					statusBarScrim.setState(getDrawableState());
	//   29   55:aload_0         
	//   30   56:getfield        #408 <Field Drawable statusBarScrim>
	//   31   59:aload_0         
	//   32   60:invokevirtual   #437 <Method int[] getDrawableState()>
	//   33   63:invokevirtual   #444 <Method boolean Drawable.setState(int[])>
	//   34   66:pop             
				DrawableCompat.setLayoutDirection(statusBarScrim, ViewCompat.getLayoutDirection(((View) (this))));
	//   35   67:aload_0         
	//   36   68:getfield        #408 <Field Drawable statusBarScrim>
	//   37   71:aload_0         
	//   38   72:invokestatic    #566 <Method int ViewCompat.getLayoutDirection(View)>
	//   39   75:invokestatic    #748 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   40   78:pop             
				drawable = statusBarScrim;
	//   41   79:aload_0         
	//   42   80:getfield        #408 <Field Drawable statusBarScrim>
	//   43   83:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  44   84:aload_0         
	//*  45   85:invokevirtual   #749 <Method int getVisibility()>
	//*  46   88:ifne            96
					flag = true;
	//   47   91:iconst_1        
	//   48   92:istore_2        
				else
	//*  49   93:goto            98
					flag = false;
	//   50   96:iconst_0        
	//   51   97:istore_2        
				drawable.setVisible(flag, false);
	//   52   98:aload_1         
	//   53   99:iload_2         
	//   54  100:iconst_0        
	//   55  101:invokevirtual   #753 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   56  104:pop             
				statusBarScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   57  105:aload_0         
	//   58  106:getfield        #408 <Field Drawable statusBarScrim>
	//   59  109:aload_0         
	//   60  110:invokevirtual   #685 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				statusBarScrim.setAlpha(scrimAlpha);
	//   61  113:aload_0         
	//   62  114:getfield        #408 <Field Drawable statusBarScrim>
	//   63  117:aload_0         
	//   64  118:getfield        #260 <Field int scrimAlpha>
	//   65  121:invokevirtual   #402 <Method void Drawable.setAlpha(int)>
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   66  124:aload_0         
	//   67  125:invokestatic    #688 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   68  128:return          
	}

	public void setStatusBarScrimColor(int i)
	{
		setStatusBarScrim(((Drawable) (new ColorDrawable(i))));
	//    0    0:aload_0         
	//    1    1:new             #691 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #693 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #224 <Method void setStatusBarScrim(Drawable)>
	//    6   12:return          
	}

	public void setStatusBarScrimResource(int i)
	{
		setStatusBarScrim(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #379 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #700 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #224 <Method void setStatusBarScrim(Drawable)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		collapsingTextHelper.setText(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field CollapsingTextHelper collapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #758 <Method void CollapsingTextHelper.setText(CharSequence)>
		updateContentDescriptionFromTitle();
	//    4    8:aload_0         
	//    5    9:invokespecial   #760 <Method void updateContentDescriptionFromTitle()>
	//    6   12:return          
	}

	public void setTitleEnabled(boolean flag)
	{
		if(flag != collapsingTitleEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #165 <Field boolean collapsingTitleEnabled>
	//*   3    5:icmpeq          25
		{
			collapsingTitleEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #165 <Field boolean collapsingTitleEnabled>
			updateContentDescriptionFromTitle();
	//    7   13:aload_0         
	//    8   14:invokespecial   #760 <Method void updateContentDescriptionFromTitle()>
			updateDummyView();
	//    9   17:aload_0         
	//   10   18:invokespecial   #312 <Method void updateDummyView()>
			requestLayout();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #655 <Method void requestLayout()>
		}
	//   13   25:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #764 <Method void FrameLayout.setVisibility(int)>
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
		Drawable drawable = statusBarScrim;
	//   10   16:aload_0         
	//   11   17:getfield        #408 <Field Drawable statusBarScrim>
	//   12   20:astore_3        
		if(drawable != null && drawable.isVisible() != flag)
	//*  13   21:aload_3         
	//*  14   22:ifnull          43
	//*  15   25:aload_3         
	//*  16   26:invokevirtual   #767 <Method boolean Drawable.isVisible()>
	//*  17   29:iload_2         
	//*  18   30:icmpeq          43
			statusBarScrim.setVisible(flag, false);
	//   19   33:aload_0         
	//   20   34:getfield        #408 <Field Drawable statusBarScrim>
	//   21   37:iload_2         
	//   22   38:iconst_0        
	//   23   39:invokevirtual   #753 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   24   42:pop             
		drawable = contentScrim;
	//   25   43:aload_0         
	//   26   44:getfield        #393 <Field Drawable contentScrim>
	//   27   47:astore_3        
		if(drawable != null && drawable.isVisible() != flag)
	//*  28   48:aload_3         
	//*  29   49:ifnull          70
	//*  30   52:aload_3         
	//*  31   53:invokevirtual   #767 <Method boolean Drawable.isVisible()>
	//*  32   56:iload_2         
	//*  33   57:icmpeq          70
			contentScrim.setVisible(flag, false);
	//   34   60:aload_0         
	//   35   61:getfield        #393 <Field Drawable contentScrim>
	//   36   64:iload_2         
	//   37   65:iconst_0        
	//   38   66:invokevirtual   #753 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   39   69:pop             
	//   40   70:return          
	}

	final void updateScrimVisibility()
	{
		if(contentScrim != null || statusBarScrim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #393 <Field Drawable contentScrim>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #408 <Field Drawable statusBarScrim>
	//*   5   11:ifnull          42
		{
			boolean flag;
			if(getHeight() + currentOffset < getScrimVisibleHeightTrigger())
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #497 <Method int getHeight()>
	//*   8   18:aload_0         
	//*   9   19:getfield        #417 <Field int currentOffset>
	//*  10   22:iadd            
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #769 <Method int getScrimVisibleHeightTrigger()>
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
	//   21   39:invokevirtual   #771 <Method void setScrimsShown(boolean)>
		}
	//   22   42:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == contentScrim || drawable == statusBarScrim;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #775 <Method boolean FrameLayout.verifyDrawable(Drawable)>
	//    3    5:ifne            29
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #393 <Field Drawable contentScrim>
	//    7   13:if_acmpeq       29
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #408 <Field Drawable statusBarScrim>
	//   11   21:if_acmpne       27
	//   12   24:goto            29
	//   13   27:iconst_0        
	//   14   28:ireturn         
	//   15   29:iconst_1        
	//   16   30:ireturn         
	}

	private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
	final CollapsingTextHelper collapsingTextHelper;
	private boolean collapsingTitleEnabled;
	private Drawable contentScrim;
	int currentOffset;
	private boolean drawCollapsingTitle;
	private View dummyView;
	private int expandedMarginBottom;
	private int expandedMarginEnd;
	private int expandedMarginStart;
	private int expandedMarginTop;
	WindowInsetsCompat lastInsets;
	private AppBarLayout.OnOffsetChangedListener onOffsetChangedListener;
	private boolean refreshToolbar;
	private int scrimAlpha;
	private long scrimAnimationDuration;
	private ValueAnimator scrimAnimator;
	private int scrimVisibleHeightTrigger;
	private boolean scrimsAreShown;
	Drawable statusBarScrim;
	private final Rect tmpRect;
	private Toolbar toolbar;
	private View toolbarDirectChild;
	private int toolbarId;
}
