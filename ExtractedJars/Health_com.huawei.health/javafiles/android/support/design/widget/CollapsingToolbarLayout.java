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
import android.support.v4.view.*;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;
import o.*;

// Referenced classes of package android.support.design.widget:
//			AppBarLayout

public class CollapsingToolbarLayout extends FrameLayout
{
	public static class LayoutParams extends android.widget.FrameLayout.LayoutParams
	{

		public int getCollapseMode()
		{
			return mCollapseMode;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field int mCollapseMode>
		//    2    4:ireturn         
		}

		public float getParallaxMultiplier()
		{
			return mParallaxMult;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field float mParallaxMult>
		//    2    4:freturn         
		}

		public void setCollapseMode(int i)
		{
			mCollapseMode = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #25  <Field int mCollapseMode>
		//    3    5:return          
		}

		public void setParallaxMultiplier(float f)
		{
			mParallaxMult = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #27  <Field float mParallaxMult>
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
		//    3    3:invokespecial   #23  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
			mCollapseMode = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #25  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    7   11:aload_0         
		//    8   12:ldc1            #17  <Float 0.5F>
		//    9   14:putfield        #27  <Field float mParallaxMult>
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
			mCollapseMode = 0;
		//    5    7:aload_0         
		//    6    8:iconst_0        
		//    7    9:putfield        #25  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    8   12:aload_0         
		//    9   13:ldc1            #17  <Float 0.5F>
		//   10   15:putfield        #27  <Field float mParallaxMult>
		//   11   18:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #34  <Method void android.widget.FrameLayout$LayoutParams(Context, AttributeSet)>
			mCollapseMode = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #25  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    7   11:aload_0         
		//    8   12:ldc1            #17  <Float 0.5F>
		//    9   14:putfield        #27  <Field float mParallaxMult>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CollapsingToolbarLayout_Layout)));
		//   10   17:aload_1         
		//   11   18:aload_2         
		//   12   19:getstatic       #40  <Field int[] android.support.design.R$styleable.CollapsingToolbarLayout_Layout>
		//   13   22:invokevirtual   #46  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   14   25:astore_1        
			mCollapseMode = ((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
		//   15   26:aload_0         
		//   16   27:aload_1         
		//   17   28:getstatic       #49  <Field int android.support.design.R$styleable.CollapsingToolbarLayout_Layout_layout_collapseMode>
		//   18   31:iconst_0        
		//   19   32:invokevirtual   #55  <Method int TypedArray.getInt(int, int)>
		//   20   35:putfield        #25  <Field int mCollapseMode>
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
			mCollapseMode = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #25  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #17  <Float 0.5F>
		//    8   13:putfield        #27  <Field float mParallaxMult>
		//    9   16:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #76  <Method void android.widget.FrameLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			mCollapseMode = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #25  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #17  <Float 0.5F>
		//    8   13:putfield        #27  <Field float mParallaxMult>
		//    9   16:return          
		}

		public LayoutParams(android.widget.FrameLayout.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #82  <Method void android.widget.FrameLayout$LayoutParams(android.widget.FrameLayout$LayoutParams)>
			mCollapseMode = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #25  <Field int mCollapseMode>
			mParallaxMult = 0.5F;
		//    6   10:aload_0         
		//    7   11:ldc1            #17  <Float 0.5F>
		//    8   13:putfield        #27  <Field float mParallaxMult>
		//    9   16:return          
		}
	}

	class d
		implements AppBarLayout.OnOffsetChangedListener
	{

		public void onOffsetChanged(AppBarLayout appbarlayout, int i)
		{
			e.mCurrentOffset = i;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CollapsingToolbarLayout e>
		//    2    4:iload_2         
		//    3    5:putfield        #25  <Field int CollapsingToolbarLayout.mCurrentOffset>
			int j;
			if(e.mLastInsets != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #15  <Field CollapsingToolbarLayout e>
		//*   6   12:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
		//*   7   15:ifnull          32
				j = e.mLastInsets.getSystemWindowInsetTop();
		//    8   18:aload_0         
		//    9   19:getfield        #15  <Field CollapsingToolbarLayout e>
		//   10   22:getfield        #29  <Field WindowInsetsCompat CollapsingToolbarLayout.mLastInsets>
		//   11   25:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
		//   12   28:istore_3        
			else
		//*  13   29:goto            34
				j = 0;
		//   14   32:iconst_0        
		//   15   33:istore_3        
			int k = 0;
		//   16   34:iconst_0        
		//   17   35:istore          4
			for(int l = e.getChildCount(); k < l; k++)
		//*  18   37:aload_0         
		//*  19   38:getfield        #15  <Field CollapsingToolbarLayout e>
		//*  20   41:invokevirtual   #38  <Method int CollapsingToolbarLayout.getChildCount()>
		//*  21   44:istore          5
		//*  22   46:iload           4
		//*  23   48:iload           5
		//*  24   50:icmpge          161
			{
				appbarlayout = ((AppBarLayout) (e.getChildAt(k)));
		//   25   53:aload_0         
		//   26   54:getfield        #15  <Field CollapsingToolbarLayout e>
		//   27   57:iload           4
		//   28   59:invokevirtual   #42  <Method View CollapsingToolbarLayout.getChildAt(int)>
		//   29   62:astore_1        
				LayoutParams layoutparams = (LayoutParams)((View) (appbarlayout)).getLayoutParams();
		//   30   63:aload_1         
		//   31   64:invokevirtual   #48  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   32   67:checkcast       #50  <Class CollapsingToolbarLayout$LayoutParams>
		//   33   70:astore          6
				ab ab1 = CollapsingToolbarLayout.getViewOffsetHelper(((View) (appbarlayout)));
		//   34   72:aload_1         
		//   35   73:invokestatic    #54  <Method ab CollapsingToolbarLayout.getViewOffsetHelper(View)>
		//   36   76:astore          7
				switch(layoutparams.mCollapseMode)
		//*  37   78:aload           6
		//*  38   80:getfield        #57  <Field int CollapsingToolbarLayout$LayoutParams.mCollapseMode>
				{
		//*  39   83:lookupswitch    2: default 108
		//		               1: 111
		//		               2: 134
		//*  40  108:goto            152
				case 1: // '\001'
					ab1.b(w.b(-i, 0, e.getMaxOffsetForPinChild(((View) (appbarlayout)))));
		//   41  111:aload           7
		//   42  113:iload_2         
		//   43  114:ineg            
		//   44  115:iconst_0        
		//   45  116:aload_0         
		//   46  117:getfield        #15  <Field CollapsingToolbarLayout e>
		//   47  120:aload_1         
		//   48  121:invokevirtual   #61  <Method int CollapsingToolbarLayout.getMaxOffsetForPinChild(View)>
		//   49  124:invokestatic    #67  <Method int w.b(int, int, int)>
		//   50  127:invokevirtual   #72  <Method boolean ab.b(int)>
		//   51  130:pop             
					break;

		//*  52  131:goto            152
				case 2: // '\002'
					ab1.b(Math.round((float)(-i) * layoutparams.mParallaxMult));
		//   53  134:aload           7
		//   54  136:iload_2         
		//   55  137:ineg            
		//   56  138:i2f             
		//   57  139:aload           6
		//   58  141:getfield        #76  <Field float CollapsingToolbarLayout$LayoutParams.mParallaxMult>
		//   59  144:fmul            
		//   60  145:invokestatic    #82  <Method int Math.round(float)>
		//   61  148:invokevirtual   #72  <Method boolean ab.b(int)>
		//   62  151:pop             
					break;
				}
			}

		//   63  152:iload           4
		//   64  154:iconst_1        
		//   65  155:iadd            
		//   66  156:istore          4
		//*  67  158:goto            46
			e.updateScrimVisibility();
		//   68  161:aload_0         
		//   69  162:getfield        #15  <Field CollapsingToolbarLayout e>
		//   70  165:invokevirtual   #85  <Method void CollapsingToolbarLayout.updateScrimVisibility()>
			if(e.mStatusBarScrim != null && j > 0)
		//*  71  168:aload_0         
		//*  72  169:getfield        #15  <Field CollapsingToolbarLayout e>
		//*  73  172:getfield        #89  <Field Drawable CollapsingToolbarLayout.mStatusBarScrim>
		//*  74  175:ifnull          189
		//*  75  178:iload_3         
		//*  76  179:ifle            189
				ViewCompat.postInvalidateOnAnimation(((View) (e)));
		//   77  182:aload_0         
		//   78  183:getfield        #15  <Field CollapsingToolbarLayout e>
		//   79  186:invokestatic    #95  <Method void ViewCompat.postInvalidateOnAnimation(View)>
			k = e.getHeight();
		//   80  189:aload_0         
		//   81  190:getfield        #15  <Field CollapsingToolbarLayout e>
		//   82  193:invokevirtual   #98  <Method int CollapsingToolbarLayout.getHeight()>
		//   83  196:istore          4
			int i1 = ViewCompat.getMinimumHeight(((View) (e)));
		//   84  198:aload_0         
		//   85  199:getfield        #15  <Field CollapsingToolbarLayout e>
		//   86  202:invokestatic    #101 <Method int ViewCompat.getMinimumHeight(View)>
		//   87  205:istore          5
			e.mCollapsingTextHelper.a((float)Math.abs(i) / (float)(k - i1 - j));
		//   88  207:aload_0         
		//   89  208:getfield        #15  <Field CollapsingToolbarLayout e>
		//   90  211:getfield        #105 <Field n CollapsingToolbarLayout.mCollapsingTextHelper>
		//   91  214:iload_2         
		//   92  215:invokestatic    #109 <Method int Math.abs(int)>
		//   93  218:i2f             
		//   94  219:iload           4
		//   95  221:iload           5
		//   96  223:isub            
		//   97  224:iload_3         
		//   98  225:isub            
		//   99  226:i2f             
		//  100  227:fdiv            
		//  101  228:invokevirtual   #115 <Method void n.a(float)>
		//  102  231:return          
		}

		final CollapsingToolbarLayout e;

		d()
		{
			e = CollapsingToolbarLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CollapsingToolbarLayout e>
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
		mRefreshToolbar = true;
	//    5    7:aload_0         
	//    6    8:iconst_1        
	//    7    9:putfield        #62  <Field boolean mRefreshToolbar>
		mTmpRect = new Rect();
	//    8   12:aload_0         
	//    9   13:new             #64  <Class Rect>
	//   10   16:dup             
	//   11   17:invokespecial   #67  <Method void Rect()>
	//   12   20:putfield        #69  <Field Rect mTmpRect>
		mScrimVisibleHeightTrigger = -1;
	//   13   23:aload_0         
	//   14   24:iconst_m1       
	//   15   25:putfield        #71  <Field int mScrimVisibleHeightTrigger>
		aa.b(context);
	//   16   28:aload_1         
	//   17   29:invokestatic    #76  <Method void aa.b(Context)>
		mCollapsingTextHelper = new n(((View) (this)));
	//   18   32:aload_0         
	//   19   33:new             #78  <Class n>
	//   20   36:dup             
	//   21   37:aload_0         
	//   22   38:invokespecial   #81  <Method void n(View)>
	//   23   41:putfield        #83  <Field n mCollapsingTextHelper>
		mCollapsingTextHelper.b(p.d);
	//   24   44:aload_0         
	//   25   45:getfield        #83  <Field n mCollapsingTextHelper>
	//   26   48:getstatic       #88  <Field android.view.animation.Interpolator p.d>
	//   27   51:invokevirtual   #91  <Method void n.b(android.view.animation.Interpolator)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CollapsingToolbarLayout, i, android.support.design.R.style.Widget_Design_CollapsingToolbar)));
	//   28   54:aload_1         
	//   29   55:aload_2         
	//   30   56:getstatic       #97  <Field int[] android.support.design.R$styleable.CollapsingToolbarLayout>
	//   31   59:iload_3         
	//   32   60:getstatic       #102 <Field int android.support.design.R$style.Widget_Design_CollapsingToolbar>
	//   33   63:invokevirtual   #108 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   34   66:astore_1        
		mCollapsingTextHelper.e(((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleGravity, 0x800053));
	//   35   67:aload_0         
	//   36   68:getfield        #83  <Field n mCollapsingTextHelper>
	//   37   71:aload_1         
	//   38   72:getstatic       #111 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleGravity>
	//   39   75:ldc1            #112 <Int 0x800053>
	//   40   77:invokevirtual   #118 <Method int TypedArray.getInt(int, int)>
	//   41   80:invokevirtual   #122 <Method void n.e(int)>
		mCollapsingTextHelper.b(((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleGravity, 0x800013));
	//   42   83:aload_0         
	//   43   84:getfield        #83  <Field n mCollapsingTextHelper>
	//   44   87:aload_1         
	//   45   88:getstatic       #125 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_collapsedTitleGravity>
	//   46   91:ldc1            #126 <Int 0x800013>
	//   47   93:invokevirtual   #118 <Method int TypedArray.getInt(int, int)>
	//   48   96:invokevirtual   #128 <Method void n.b(int)>
		i = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
	//   49   99:aload_1         
	//   50  100:getstatic       #131 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMargin>
	//   51  103:iconst_0        
	//   52  104:invokevirtual   #134 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   53  107:istore_3        
		mExpandedMarginBottom = i;
	//   54  108:aload_0         
	//   55  109:iload_3         
	//   56  110:putfield        #136 <Field int mExpandedMarginBottom>
		mExpandedMarginEnd = i;
	//   57  113:aload_0         
	//   58  114:iload_3         
	//   59  115:putfield        #138 <Field int mExpandedMarginEnd>
		mExpandedMarginTop = i;
	//   60  118:aload_0         
	//   61  119:iload_3         
	//   62  120:putfield        #140 <Field int mExpandedMarginTop>
		mExpandedMarginStart = i;
	//   63  123:aload_0         
	//   64  124:iload_3         
	//   65  125:putfield        #142 <Field int mExpandedMarginStart>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart))
	//*  66  128:aload_1         
	//*  67  129:getstatic       #145 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart>
	//*  68  132:invokevirtual   #149 <Method boolean TypedArray.hasValue(int)>
	//*  69  135:ifeq            150
			mExpandedMarginStart = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
	//   70  138:aload_0         
	//   71  139:aload_1         
	//   72  140:getstatic       #145 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart>
	//   73  143:iconst_0        
	//   74  144:invokevirtual   #134 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   75  147:putfield        #142 <Field int mExpandedMarginStart>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd))
	//*  76  150:aload_1         
	//*  77  151:getstatic       #152 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd>
	//*  78  154:invokevirtual   #149 <Method boolean TypedArray.hasValue(int)>
	//*  79  157:ifeq            172
			mExpandedMarginEnd = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
	//   80  160:aload_0         
	//   81  161:aload_1         
	//   82  162:getstatic       #152 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd>
	//   83  165:iconst_0        
	//   84  166:invokevirtual   #134 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   85  169:putfield        #138 <Field int mExpandedMarginEnd>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop))
	//*  86  172:aload_1         
	//*  87  173:getstatic       #155 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop>
	//*  88  176:invokevirtual   #149 <Method boolean TypedArray.hasValue(int)>
	//*  89  179:ifeq            194
			mExpandedMarginTop = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
	//   90  182:aload_0         
	//   91  183:aload_1         
	//   92  184:getstatic       #155 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop>
	//   93  187:iconst_0        
	//   94  188:invokevirtual   #134 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   95  191:putfield        #140 <Field int mExpandedMarginTop>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom))
	//*  96  194:aload_1         
	//*  97  195:getstatic       #158 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom>
	//*  98  198:invokevirtual   #149 <Method boolean TypedArray.hasValue(int)>
	//*  99  201:ifeq            216
			mExpandedMarginBottom = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
	//  100  204:aload_0         
	//  101  205:aload_1         
	//  102  206:getstatic       #158 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom>
	//  103  209:iconst_0        
	//  104  210:invokevirtual   #134 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  105  213:putfield        #136 <Field int mExpandedMarginBottom>
		mCollapsingTitleEnabled = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.CollapsingToolbarLayout_titleEnabled, true);
	//  106  216:aload_0         
	//  107  217:aload_1         
	//  108  218:getstatic       #161 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_titleEnabled>
	//  109  221:iconst_1        
	//  110  222:invokevirtual   #165 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  111  225:putfield        #167 <Field boolean mCollapsingTitleEnabled>
		setTitle(((TypedArray) (context)).getText(android.support.design.R.styleable.CollapsingToolbarLayout_title));
	//  112  228:aload_0         
	//  113  229:aload_1         
	//  114  230:getstatic       #170 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_title>
	//  115  233:invokevirtual   #174 <Method CharSequence TypedArray.getText(int)>
	//  116  236:invokevirtual   #178 <Method void setTitle(CharSequence)>
		mCollapsingTextHelper.a(android.support.design.R.style.TextAppearance_Design_CollapsingToolbar_Expanded);
	//  117  239:aload_0         
	//  118  240:getfield        #83  <Field n mCollapsingTextHelper>
	//  119  243:getstatic       #181 <Field int android.support.design.R$style.TextAppearance_Design_CollapsingToolbar_Expanded>
	//  120  246:invokevirtual   #184 <Method void n.a(int)>
		mCollapsingTextHelper.c(android.support.v7.appcompat.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title);
	//  121  249:aload_0         
	//  122  250:getfield        #83  <Field n mCollapsingTextHelper>
	//  123  253:getstatic       #189 <Field int android.support.v7.appcompat.R$style.TextAppearance_AppCompat_Widget_ActionBar_Title>
	//  124  256:invokevirtual   #192 <Method void n.c(int)>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance))
	//* 125  259:aload_1         
	//* 126  260:getstatic       #195 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance>
	//* 127  263:invokevirtual   #149 <Method boolean TypedArray.hasValue(int)>
	//* 128  266:ifeq            284
			mCollapsingTextHelper.a(((TypedArray) (context)).getResourceId(android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
	//  129  269:aload_0         
	//  130  270:getfield        #83  <Field n mCollapsingTextHelper>
	//  131  273:aload_1         
	//  132  274:getstatic       #195 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance>
	//  133  277:iconst_0        
	//  134  278:invokevirtual   #198 <Method int TypedArray.getResourceId(int, int)>
	//  135  281:invokevirtual   #184 <Method void n.a(int)>
		if(((TypedArray) (context)).hasValue(android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance))
	//* 136  284:aload_1         
	//* 137  285:getstatic       #201 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance>
	//* 138  288:invokevirtual   #149 <Method boolean TypedArray.hasValue(int)>
	//* 139  291:ifeq            309
			mCollapsingTextHelper.c(((TypedArray) (context)).getResourceId(android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
	//  140  294:aload_0         
	//  141  295:getfield        #83  <Field n mCollapsingTextHelper>
	//  142  298:aload_1         
	//  143  299:getstatic       #201 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance>
	//  144  302:iconst_0        
	//  145  303:invokevirtual   #198 <Method int TypedArray.getResourceId(int, int)>
	//  146  306:invokevirtual   #192 <Method void n.c(int)>
		mScrimVisibleHeightTrigger = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
	//  147  309:aload_0         
	//  148  310:aload_1         
	//  149  311:getstatic       #204 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger>
	//  150  314:iconst_m1       
	//  151  315:invokevirtual   #134 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  152  318:putfield        #71  <Field int mScrimVisibleHeightTrigger>
		mScrimAnimationDuration = ((TypedArray) (context)).getInt(android.support.design.R.styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
	//  153  321:aload_0         
	//  154  322:aload_1         
	//  155  323:getstatic       #207 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_scrimAnimationDuration>
	//  156  326:sipush          600
	//  157  329:invokevirtual   #118 <Method int TypedArray.getInt(int, int)>
	//  158  332:i2l             
	//  159  333:putfield        #209 <Field long mScrimAnimationDuration>
		setContentScrim(((TypedArray) (context)).getDrawable(android.support.design.R.styleable.CollapsingToolbarLayout_contentScrim));
	//  160  336:aload_0         
	//  161  337:aload_1         
	//  162  338:getstatic       #212 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_contentScrim>
	//  163  341:invokevirtual   #216 <Method Drawable TypedArray.getDrawable(int)>
	//  164  344:invokevirtual   #220 <Method void setContentScrim(Drawable)>
		setStatusBarScrim(((TypedArray) (context)).getDrawable(android.support.design.R.styleable.CollapsingToolbarLayout_statusBarScrim));
	//  165  347:aload_0         
	//  166  348:aload_1         
	//  167  349:getstatic       #223 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_statusBarScrim>
	//  168  352:invokevirtual   #216 <Method Drawable TypedArray.getDrawable(int)>
	//  169  355:invokevirtual   #226 <Method void setStatusBarScrim(Drawable)>
		mToolbarId = ((TypedArray) (context)).getResourceId(android.support.design.R.styleable.CollapsingToolbarLayout_toolbarId, -1);
	//  170  358:aload_0         
	//  171  359:aload_1         
	//  172  360:getstatic       #229 <Field int android.support.design.R$styleable.CollapsingToolbarLayout_toolbarId>
	//  173  363:iconst_m1       
	//  174  364:invokevirtual   #198 <Method int TypedArray.getResourceId(int, int)>
	//  175  367:putfield        #231 <Field int mToolbarId>
		((TypedArray) (context)).recycle();
	//  176  370:aload_1         
	//  177  371:invokevirtual   #234 <Method void TypedArray.recycle()>
		setWillNotDraw(false);
	//  178  374:aload_0         
	//  179  375:iconst_0        
	//  180  376:invokevirtual   #238 <Method void setWillNotDraw(boolean)>
		ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), new OnApplyWindowInsetsListener() {

			public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
			{
				return e.onWindowInsetChanged(windowinsetscompat);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field CollapsingToolbarLayout e>
			//    2    4:aload_2         
			//    3    5:invokevirtual   #26  <Method WindowInsetsCompat CollapsingToolbarLayout.onWindowInsetChanged(WindowInsetsCompat)>
			//    4    8:areturn         
			}

			final CollapsingToolbarLayout e;

			
			{
				e = CollapsingToolbarLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field CollapsingToolbarLayout e>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  181  379:aload_0         
	//  182  380:new             #8   <Class CollapsingToolbarLayout$5>
	//  183  383:dup             
	//  184  384:aload_0         
	//  185  385:invokespecial   #241 <Method void CollapsingToolbarLayout$5(CollapsingToolbarLayout)>
	//  186  388:invokestatic    #247 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
	//  187  391:return          
	}

	private void animateScrim(int i)
	{
		ensureToolbar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #251 <Method void ensureToolbar()>
		if(mScrimAnimator == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #253 <Field ValueAnimator mScrimAnimator>
	//*   4    8:ifnonnull       81
		{
			mScrimAnimator = new ValueAnimator();
	//    5   11:aload_0         
	//    6   12:new             #255 <Class ValueAnimator>
	//    7   15:dup             
	//    8   16:invokespecial   #256 <Method void ValueAnimator()>
	//    9   19:putfield        #253 <Field ValueAnimator mScrimAnimator>
			mScrimAnimator.setDuration(mScrimAnimationDuration);
	//   10   22:aload_0         
	//   11   23:getfield        #253 <Field ValueAnimator mScrimAnimator>
	//   12   26:aload_0         
	//   13   27:getfield        #209 <Field long mScrimAnimationDuration>
	//   14   30:invokevirtual   #260 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   15   33:pop             
			ValueAnimator valueanimator = mScrimAnimator;
	//   16   34:aload_0         
	//   17   35:getfield        #253 <Field ValueAnimator mScrimAnimator>
	//   18   38:astore_3        
			android.view.animation.Interpolator interpolator;
			if(i > mScrimAlpha)
	//*  19   39:iload_1         
	//*  20   40:aload_0         
	//*  21   41:getfield        #262 <Field int mScrimAlpha>
	//*  22   44:icmple          54
				interpolator = p.b;
	//   23   47:getstatic       #264 <Field android.view.animation.Interpolator p.b>
	//   24   50:astore_2        
			else
	//*  25   51:goto            58
				interpolator = p.c;
	//   26   54:getstatic       #266 <Field android.view.animation.Interpolator p.c>
	//   27   57:astore_2        
			valueanimator.setInterpolator(((android.animation.TimeInterpolator) (interpolator)));
	//   28   58:aload_3         
	//   29   59:aload_2         
	//   30   60:invokevirtual   #270 <Method void ValueAnimator.setInterpolator(android.animation.TimeInterpolator)>
			mScrimAnimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					e.setScrimAlpha(((Integer)valueanimator1.getAnimatedValue()).intValue());
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field CollapsingToolbarLayout e>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #29  <Method Object ValueAnimator.getAnimatedValue()>
				//    4    8:checkcast       #31  <Class Integer>
				//    5   11:invokevirtual   #35  <Method int Integer.intValue()>
				//    6   14:invokevirtual   #38  <Method void CollapsingToolbarLayout.setScrimAlpha(int)>
				//    7   17:return          
				}

				final CollapsingToolbarLayout e;

			
			{
				e = CollapsingToolbarLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CollapsingToolbarLayout e>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   31   63:aload_0         
	//   32   64:getfield        #253 <Field ValueAnimator mScrimAnimator>
	//   33   67:new             #6   <Class CollapsingToolbarLayout$4>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:invokespecial   #271 <Method void CollapsingToolbarLayout$4(CollapsingToolbarLayout)>
	//   37   75:invokevirtual   #275 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		} else
	//*  38   78:goto            98
		if(mScrimAnimator.isRunning())
	//*  39   81:aload_0         
	//*  40   82:getfield        #253 <Field ValueAnimator mScrimAnimator>
	//*  41   85:invokevirtual   #279 <Method boolean ValueAnimator.isRunning()>
	//*  42   88:ifeq            98
			mScrimAnimator.cancel();
	//   43   91:aload_0         
	//   44   92:getfield        #253 <Field ValueAnimator mScrimAnimator>
	//   45   95:invokevirtual   #282 <Method void ValueAnimator.cancel()>
		mScrimAnimator.setIntValues(new int[] {
			mScrimAlpha, i
		});
	//   46   98:aload_0         
	//   47   99:getfield        #253 <Field ValueAnimator mScrimAnimator>
	//   48  102:iconst_2        
	//   49  103:newarray        int[]
	//   50  105:dup             
	//   51  106:iconst_0        
	//   52  107:aload_0         
	//   53  108:getfield        #262 <Field int mScrimAlpha>
	//   54  111:iastore         
	//   55  112:dup             
	//   56  113:iconst_1        
	//   57  114:iload_1         
	//   58  115:iastore         
	//   59  116:invokevirtual   #286 <Method void ValueAnimator.setIntValues(int[])>
		mScrimAnimator.start();
	//   60  119:aload_0         
	//   61  120:getfield        #253 <Field ValueAnimator mScrimAnimator>
	//   62  123:invokevirtual   #289 <Method void ValueAnimator.start()>
	//   63  126:return          
	}

	private void ensureToolbar()
	{
		if(!mRefreshToolbar)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field boolean mRefreshToolbar>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		mToolbar = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #291 <Field Toolbar mToolbar>
		mToolbarDirectChild = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #293 <Field View mToolbarDirectChild>
		if(mToolbarId != -1)
	//*  10   18:aload_0         
	//*  11   19:getfield        #231 <Field int mToolbarId>
	//*  12   22:iconst_m1       
	//*  13   23:icmpeq          60
		{
			mToolbar = (Toolbar)findViewById(mToolbarId);
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #231 <Field int mToolbarId>
	//   18   32:invokevirtual   #297 <Method View findViewById(int)>
	//   19   35:checkcast       #299 <Class Toolbar>
	//   20   38:putfield        #291 <Field Toolbar mToolbar>
			if(mToolbar != null)
	//*  21   41:aload_0         
	//*  22   42:getfield        #291 <Field Toolbar mToolbar>
	//*  23   45:ifnull          60
				mToolbarDirectChild = findDirectChild(((View) (mToolbar)));
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #291 <Field Toolbar mToolbar>
	//   28   54:invokespecial   #303 <Method View findDirectChild(View)>
	//   29   57:putfield        #293 <Field View mToolbarDirectChild>
		}
		if(mToolbar == null)
	//*  30   60:aload_0         
	//*  31   61:getfield        #291 <Field Toolbar mToolbar>
	//*  32   64:ifnonnull       118
		{
			Object obj1 = null;
	//   33   67:aconst_null     
	//   34   68:astore          4
			int i = 0;
	//   35   70:iconst_0        
	//   36   71:istore_1        
			int j = getChildCount();
	//   37   72:aload_0         
	//   38   73:invokevirtual   #307 <Method int getChildCount()>
	//   39   76:istore_2        
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
	//   47   87:invokevirtual   #310 <Method View getChildAt(int)>
	//   48   90:astore_3        
				if(obj instanceof Toolbar)
	//*  49   91:aload_3         
	//*  50   92:instanceof      #299 <Class Toolbar>
	//*  51   95:ifeq            106
				{
					obj = ((Object) ((Toolbar)obj));
	//   52   98:aload_3         
	//   53   99:checkcast       #299 <Class Toolbar>
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
	//   63  115:putfield        #291 <Field Toolbar mToolbar>
		}
		updateDummyView();
	//   64  118:aload_0         
	//   65  119:invokespecial   #313 <Method void updateDummyView()>
		mRefreshToolbar = false;
	//   66  122:aload_0         
	//   67  123:iconst_0        
	//   68  124:putfield        #62  <Field boolean mRefreshToolbar>
	//   69  127:return          
	}

	private View findDirectChild(View view)
	{
		View view1 = view;
	//    0    0:aload_1         
	//    1    1:astore_2        
		for(view = ((View) (view.getParent())); view != this && view != null; view = ((View) (((ViewParent) (view)).getParent())))
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #319 <Method ViewParent View.getParent()>
	//*   4    6:astore_1        
	//*   5    7:aload_1         
	//*   6    8:aload_0         
	//*   7    9:if_acmpeq       38
	//*   8   12:aload_1         
	//*   9   13:ifnull          38
			if(view instanceof View)
	//*  10   16:aload_1         
	//*  11   17:instanceof      #315 <Class View>
	//*  12   20:ifeq            28
				view1 = (View)view;
	//   13   23:aload_1         
	//   14   24:checkcast       #315 <Class View>
	//   15   27:astore_2        

	//   16   28:aload_1         
	//   17   29:invokeinterface #322 <Method ViewParent ViewParent.getParent()>
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
	//    1    1:invokevirtual   #329 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_1        
		if(obj instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #331 <Class android.view.ViewGroup$MarginLayoutParams>
	//*   5    9:ifeq            32
		{
			obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)obj));
	//    6   12:aload_1         
	//    7   13:checkcast       #331 <Class android.view.ViewGroup$MarginLayoutParams>
	//    8   16:astore_1        
			return view.getHeight() + ((android.view.ViewGroup.MarginLayoutParams) (obj)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (obj)).bottomMargin;
	//    9   17:aload_0         
	//   10   18:invokevirtual   #334 <Method int View.getHeight()>
	//   11   21:aload_1         
	//   12   22:getfield        #337 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   13   25:iadd            
	//   14   26:aload_1         
	//   15   27:getfield        #340 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   16   30:iadd            
	//   17   31:ireturn         
		} else
		{
			return view.getHeight();
	//   18   32:aload_0         
	//   19   33:invokevirtual   #334 <Method int View.getHeight()>
	//   20   36:ireturn         
		}
	}

	static ab getViewOffsetHelper(View view)
	{
		ab ab2 = (ab)view.getTag(android.support.design.R.id.view_offset_helper);
	//    0    0:aload_0         
	//    1    1:getstatic       #348 <Field int android.support.design.R$id.view_offset_helper>
	//    2    4:invokevirtual   #352 <Method Object View.getTag(int)>
	//    3    7:checkcast       #354 <Class ab>
	//    4   10:astore_2        
		ab ab1 = ab2;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(ab2 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       34
		{
			ab1 = new ab(view);
	//    9   17:new             #354 <Class ab>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #355 <Method void ab(View)>
	//   13   25:astore_1        
			view.setTag(android.support.design.R.id.view_offset_helper, ((Object) (ab1)));
	//   14   26:aload_0         
	//   15   27:getstatic       #348 <Field int android.support.design.R$id.view_offset_helper>
	//   16   30:aload_1         
	//   17   31:invokevirtual   #359 <Method void View.setTag(int, Object)>
		}
		return ab1;
	//   18   34:aload_1         
	//   19   35:areturn         
	}

	private boolean isToolbarChild(View view)
	{
		if(mToolbarDirectChild == null || mToolbarDirectChild == this)
	//*   0    0:aload_0         
	//*   1    1:getfield        #293 <Field View mToolbarDirectChild>
	//*   2    4:ifnull          15
	//*   3    7:aload_0         
	//*   4    8:getfield        #293 <Field View mToolbarDirectChild>
	//*   5   11:aload_0         
	//*   6   12:if_acmpne       27
			return view == mToolbar;
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #291 <Field Toolbar mToolbar>
	//   10   20:if_acmpne       25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
		return view == mToolbarDirectChild;
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #293 <Field View mToolbarDirectChild>
	//   18   32:if_acmpne       37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
	}

	private void updateDummyView()
	{
		if(!mCollapsingTitleEnabled && mDummyView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field boolean mCollapsingTitleEnabled>
	//*   2    4:ifne            40
	//*   3    7:aload_0         
	//*   4    8:getfield        #363 <Field View mDummyView>
	//*   5   11:ifnull          40
		{
			ViewParent viewparent = mDummyView.getParent();
	//    6   14:aload_0         
	//    7   15:getfield        #363 <Field View mDummyView>
	//    8   18:invokevirtual   #319 <Method ViewParent View.getParent()>
	//    9   21:astore_1        
			if(viewparent instanceof ViewGroup)
	//*  10   22:aload_1         
	//*  11   23:instanceof      #365 <Class ViewGroup>
	//*  12   26:ifeq            40
				((ViewGroup)viewparent).removeView(mDummyView);
	//   13   29:aload_1         
	//   14   30:checkcast       #365 <Class ViewGroup>
	//   15   33:aload_0         
	//   16   34:getfield        #363 <Field View mDummyView>
	//   17   37:invokevirtual   #368 <Method void ViewGroup.removeView(View)>
		}
		if(mCollapsingTitleEnabled && mToolbar != null)
	//*  18   40:aload_0         
	//*  19   41:getfield        #167 <Field boolean mCollapsingTitleEnabled>
	//*  20   44:ifeq            99
	//*  21   47:aload_0         
	//*  22   48:getfield        #291 <Field Toolbar mToolbar>
	//*  23   51:ifnull          99
		{
			if(mDummyView == null)
	//*  24   54:aload_0         
	//*  25   55:getfield        #363 <Field View mDummyView>
	//*  26   58:ifnonnull       76
				mDummyView = new View(getContext());
	//   27   61:aload_0         
	//   28   62:new             #315 <Class View>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:invokevirtual   #372 <Method Context getContext()>
	//   32   70:invokespecial   #374 <Method void View(Context)>
	//   33   73:putfield        #363 <Field View mDummyView>
			if(mDummyView.getParent() == null)
	//*  34   76:aload_0         
	//*  35   77:getfield        #363 <Field View mDummyView>
	//*  36   80:invokevirtual   #319 <Method ViewParent View.getParent()>
	//*  37   83:ifnonnull       99
				mToolbar.addView(mDummyView, -1, -1);
	//   38   86:aload_0         
	//   39   87:getfield        #291 <Field Toolbar mToolbar>
	//   40   90:aload_0         
	//   41   91:getfield        #363 <Field View mDummyView>
	//   42   94:iconst_m1       
	//   43   95:iconst_m1       
	//   44   96:invokevirtual   #378 <Method void Toolbar.addView(View, int, int)>
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
	//    2    2:invokespecial   #384 <Method void FrameLayout.draw(Canvas)>
		ensureToolbar();
	//    3    5:aload_0         
	//    4    6:invokespecial   #251 <Method void ensureToolbar()>
		if(mToolbar == null && mContentScrim != null && mScrimAlpha > 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #291 <Field Toolbar mToolbar>
	//*   7   13:ifnonnull       52
	//*   8   16:aload_0         
	//*   9   17:getfield        #386 <Field Drawable mContentScrim>
	//*  10   20:ifnull          52
	//*  11   23:aload_0         
	//*  12   24:getfield        #262 <Field int mScrimAlpha>
	//*  13   27:ifle            52
		{
			mContentScrim.mutate().setAlpha(mScrimAlpha);
	//   14   30:aload_0         
	//   15   31:getfield        #386 <Field Drawable mContentScrim>
	//   16   34:invokevirtual   #392 <Method Drawable Drawable.mutate()>
	//   17   37:aload_0         
	//   18   38:getfield        #262 <Field int mScrimAlpha>
	//   19   41:invokevirtual   #395 <Method void Drawable.setAlpha(int)>
			mContentScrim.draw(canvas);
	//   20   44:aload_0         
	//   21   45:getfield        #386 <Field Drawable mContentScrim>
	//   22   48:aload_1         
	//   23   49:invokevirtual   #396 <Method void Drawable.draw(Canvas)>
		}
		if(mCollapsingTitleEnabled && mDrawCollapsingTitle)
	//*  24   52:aload_0         
	//*  25   53:getfield        #167 <Field boolean mCollapsingTitleEnabled>
	//*  26   56:ifeq            74
	//*  27   59:aload_0         
	//*  28   60:getfield        #398 <Field boolean mDrawCollapsingTitle>
	//*  29   63:ifeq            74
			mCollapsingTextHelper.d(canvas);
	//   30   66:aload_0         
	//   31   67:getfield        #83  <Field n mCollapsingTextHelper>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #400 <Method void n.d(Canvas)>
		if(mStatusBarScrim != null && mScrimAlpha > 0)
	//*  34   74:aload_0         
	//*  35   75:getfield        #402 <Field Drawable mStatusBarScrim>
	//*  36   78:ifnull          157
	//*  37   81:aload_0         
	//*  38   82:getfield        #262 <Field int mScrimAlpha>
	//*  39   85:ifle            157
		{
			int i;
			if(mLastInsets != null)
	//*  40   88:aload_0         
	//*  41   89:getfield        #404 <Field WindowInsetsCompat mLastInsets>
	//*  42   92:ifnull          106
				i = mLastInsets.getSystemWindowInsetTop();
	//   43   95:aload_0         
	//   44   96:getfield        #404 <Field WindowInsetsCompat mLastInsets>
	//   45   99:invokevirtual   #409 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
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
	//   53  113:getfield        #402 <Field Drawable mStatusBarScrim>
	//   54  116:iconst_0        
	//   55  117:aload_0         
	//   56  118:getfield        #411 <Field int mCurrentOffset>
	//   57  121:ineg            
	//   58  122:aload_0         
	//   59  123:invokevirtual   #414 <Method int getWidth()>
	//   60  126:iload_2         
	//   61  127:aload_0         
	//   62  128:getfield        #411 <Field int mCurrentOffset>
	//   63  131:isub            
	//   64  132:invokevirtual   #418 <Method void Drawable.setBounds(int, int, int, int)>
				mStatusBarScrim.mutate().setAlpha(mScrimAlpha);
	//   65  135:aload_0         
	//   66  136:getfield        #402 <Field Drawable mStatusBarScrim>
	//   67  139:invokevirtual   #392 <Method Drawable Drawable.mutate()>
	//   68  142:aload_0         
	//   69  143:getfield        #262 <Field int mScrimAlpha>
	//   70  146:invokevirtual   #395 <Method void Drawable.setAlpha(int)>
				mStatusBarScrim.draw(canvas);
	//   71  149:aload_0         
	//   72  150:getfield        #402 <Field Drawable mStatusBarScrim>
	//   73  153:aload_1         
	//   74  154:invokevirtual   #396 <Method void Drawable.draw(Canvas)>
			}
		}
	//   75  157:return          
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
	//*   5    8:getfield        #386 <Field Drawable mContentScrim>
	//*   6   11:ifnull          62
		{
			flag = flag1;
	//    7   14:iload           6
	//    8   16:istore          5
			if(mScrimAlpha > 0)
	//*   9   18:aload_0         
	//*  10   19:getfield        #262 <Field int mScrimAlpha>
	//*  11   22:ifle            62
			{
				flag = flag1;
	//   12   25:iload           6
	//   13   27:istore          5
				if(isToolbarChild(view))
	//*  14   29:aload_0         
	//*  15   30:aload_2         
	//*  16   31:invokespecial   #422 <Method boolean isToolbarChild(View)>
	//*  17   34:ifeq            62
				{
					mContentScrim.mutate().setAlpha(mScrimAlpha);
	//   18   37:aload_0         
	//   19   38:getfield        #386 <Field Drawable mContentScrim>
	//   20   41:invokevirtual   #392 <Method Drawable Drawable.mutate()>
	//   21   44:aload_0         
	//   22   45:getfield        #262 <Field int mScrimAlpha>
	//   23   48:invokevirtual   #395 <Method void Drawable.setAlpha(int)>
					mContentScrim.draw(canvas);
	//   24   51:aload_0         
	//   25   52:getfield        #386 <Field Drawable mContentScrim>
	//   26   55:aload_1         
	//   27   56:invokevirtual   #396 <Method void Drawable.draw(Canvas)>
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
	//   34   66:invokespecial   #424 <Method boolean FrameLayout.drawChild(Canvas, View, long)>
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
	//    1    1:invokespecial   #427 <Method void FrameLayout.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #431 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		Drawable drawable = mStatusBarScrim;
	//    7   11:aload_0         
	//    8   12:getfield        #402 <Field Drawable mStatusBarScrim>
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
	//*  17   28:invokevirtual   #434 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = drawable.setState(ai) | false;
	//   19   34:aload           4
	//   20   36:aload_3         
	//   21   37:invokevirtual   #438 <Method boolean Drawable.setState(int[])>
	//   22   40:iconst_0        
	//   23   41:ior             
	//   24   42:istore_1        
		}
		drawable = mContentScrim;
	//   25   43:aload_0         
	//   26   44:getfield        #386 <Field Drawable mContentScrim>
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
	//*  35   60:invokevirtual   #434 <Method boolean Drawable.isStateful()>
	//*  36   63:ifeq            75
				flag1 = flag | drawable.setState(ai);
	//   37   66:iload_1         
	//   38   67:aload           4
	//   39   69:aload_3         
	//   40   70:invokevirtual   #438 <Method boolean Drawable.setState(int[])>
	//   41   73:ior             
	//   42   74:istore_2        
		}
		flag = flag1;
	//   43   75:iload_2         
	//   44   76:istore_1        
		if(mCollapsingTextHelper != null)
	//*  45   77:aload_0         
	//*  46   78:getfield        #83  <Field n mCollapsingTextHelper>
	//*  47   81:ifnull          95
			flag = flag1 | mCollapsingTextHelper.a(ai);
	//   48   84:iload_2         
	//   49   85:aload_0         
	//   50   86:getfield        #83  <Field n mCollapsingTextHelper>
	//   51   89:aload_3         
	//   52   90:invokevirtual   #440 <Method boolean n.a(int[])>
	//   53   93:ior             
	//   54   94:istore_1        
		if(flag)
	//*  55   95:iload_1         
	//*  56   96:ifeq            103
			invalidate();
	//   57   99:aload_0         
	//   58  100:invokevirtual   #443 <Method void invalidate()>
	//   59  103:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-1, -1);
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #448 <Method void CollapsingToolbarLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method CollapsingToolbarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	protected volatile android.widget.FrameLayout.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.widget.FrameLayout.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #450 <Method CollapsingToolbarLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #456 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #460 <Method android.widget.FrameLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public android.widget.FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.widget.FrameLayout.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #372 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #461 <Method void CollapsingToolbarLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.widget.FrameLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.widget.FrameLayout.LayoutParams) (new LayoutParams(layoutparams)));
	//    0    0:new             #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #464 <Method void CollapsingToolbarLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public int getCollapsedTitleGravity()
	{
		return mCollapsingTextHelper.a();
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:invokevirtual   #467 <Method int n.a()>
	//    3    7:ireturn         
	}

	public Typeface getCollapsedTitleTypeface()
	{
		return mCollapsingTextHelper.c();
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:invokevirtual   #471 <Method Typeface n.c()>
	//    3    7:areturn         
	}

	public Drawable getContentScrim()
	{
		return mContentScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #386 <Field Drawable mContentScrim>
	//    2    4:areturn         
	}

	public int getExpandedTitleGravity()
	{
		return mCollapsingTextHelper.d();
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:invokevirtual   #477 <Method int n.d()>
	//    3    7:ireturn         
	}

	public int getExpandedTitleMarginBottom()
	{
		return mExpandedMarginBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field int mExpandedMarginBottom>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginEnd()
	{
		return mExpandedMarginEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field int mExpandedMarginEnd>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginStart()
	{
		return mExpandedMarginStart;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field int mExpandedMarginStart>
	//    2    4:ireturn         
	}

	public int getExpandedTitleMarginTop()
	{
		return mExpandedMarginTop;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field int mExpandedMarginTop>
	//    2    4:ireturn         
	}

	public Typeface getExpandedTitleTypeface()
	{
		return mCollapsingTextHelper.e();
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:invokevirtual   #484 <Method Typeface n.e()>
	//    3    7:areturn         
	}

	final int getMaxOffsetForPinChild(View view)
	{
		ab ab1 = getViewOffsetHelper(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #487 <Method ab getViewOffsetHelper(View)>
	//    2    4:astore_2        
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #329 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    5    9:checkcast       #10  <Class CollapsingToolbarLayout$LayoutParams>
	//    6   12:astore_3        
		return getHeight() - ab1.b() - view.getHeight() - layoutparams.bottomMargin;
	//    7   13:aload_0         
	//    8   14:invokevirtual   #488 <Method int getHeight()>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #490 <Method int ab.b()>
	//   11   21:isub            
	//   12   22:aload_1         
	//   13   23:invokevirtual   #334 <Method int View.getHeight()>
	//   14   26:isub            
	//   15   27:aload_3         
	//   16   28:getfield        #491 <Field int CollapsingToolbarLayout$LayoutParams.bottomMargin>
	//   17   31:isub            
	//   18   32:ireturn         
	}

	int getScrimAlpha()
	{
		return mScrimAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field int mScrimAlpha>
	//    2    4:ireturn         
	}

	public long getScrimAnimationDuration()
	{
		return mScrimAnimationDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field long mScrimAnimationDuration>
	//    2    4:lreturn         
	}

	public int getScrimVisibleHeightTrigger()
	{
		if(mScrimVisibleHeightTrigger >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int mScrimVisibleHeightTrigger>
	//*   2    4:iflt            12
			return mScrimVisibleHeightTrigger;
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field int mScrimVisibleHeightTrigger>
	//    5   11:ireturn         
		int i;
		if(mLastInsets != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #404 <Field WindowInsetsCompat mLastInsets>
	//*   8   16:ifnull          30
			i = mLastInsets.getSystemWindowInsetTop();
	//    9   19:aload_0         
	//   10   20:getfield        #404 <Field WindowInsetsCompat mLastInsets>
	//   11   23:invokevirtual   #409 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   12   26:istore_1        
		else
	//*  13   27:goto            32
			i = 0;
	//   14   30:iconst_0        
	//   15   31:istore_1        
		int j = ViewCompat.getMinimumHeight(((View) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #498 <Method int ViewCompat.getMinimumHeight(View)>
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
	//   27   47:invokevirtual   #488 <Method int getHeight()>
	//   28   50:invokestatic    #503 <Method int Math.min(int, int)>
	//   29   53:ireturn         
		else
			return getHeight() / 3;
	//   30   54:aload_0         
	//   31   55:invokevirtual   #488 <Method int getHeight()>
	//   32   58:iconst_3        
	//   33   59:idiv            
	//   34   60:ireturn         
	}

	public Drawable getStatusBarScrim()
	{
		return mStatusBarScrim;
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field Drawable mStatusBarScrim>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		if(mCollapsingTitleEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field boolean mCollapsingTitleEnabled>
	//*   2    4:ifeq            15
			return mCollapsingTextHelper.k();
	//    3    7:aload_0         
	//    4    8:getfield        #83  <Field n mCollapsingTextHelper>
	//    5   11:invokevirtual   #509 <Method CharSequence n.k()>
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
	//    1    1:getfield        #167 <Field boolean mCollapsingTitleEnabled>
	//    2    4:ireturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #513 <Method void FrameLayout.onAttachedToWindow()>
		ViewParent viewparent = getParent();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #514 <Method ViewParent getParent()>
	//    4    8:astore_1        
		if(viewparent instanceof AppBarLayout)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #516 <Class AppBarLayout>
	//*   7   13:ifeq            61
		{
			ViewCompat.setFitsSystemWindows(((View) (this)), ViewCompat.getFitsSystemWindows((View)viewparent));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:checkcast       #315 <Class View>
	//   11   21:invokestatic    #519 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//   12   24:invokestatic    #523 <Method void ViewCompat.setFitsSystemWindows(View, boolean)>
			if(mOnOffsetChangedListener == null)
	//*  13   27:aload_0         
	//*  14   28:getfield        #525 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
	//*  15   31:ifnonnull       46
				mOnOffsetChangedListener = ((AppBarLayout.OnOffsetChangedListener) (new d()));
	//   16   34:aload_0         
	//   17   35:new             #13  <Class CollapsingToolbarLayout$d>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:invokespecial   #526 <Method void CollapsingToolbarLayout$d(CollapsingToolbarLayout)>
	//   21   43:putfield        #525 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
			((AppBarLayout)viewparent).addOnOffsetChangedListener(mOnOffsetChangedListener);
	//   22   46:aload_1         
	//   23   47:checkcast       #516 <Class AppBarLayout>
	//   24   50:aload_0         
	//   25   51:getfield        #525 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
	//   26   54:invokevirtual   #530 <Method void AppBarLayout.addOnOffsetChangedListener(AppBarLayout$OnOffsetChangedListener)>
			ViewCompat.requestApplyInsets(((View) (this)));
	//   27   57:aload_0         
	//   28   58:invokestatic    #533 <Method void ViewCompat.requestApplyInsets(View)>
		}
	//   29   61:return          
	}

	protected void onDetachedFromWindow()
	{
		ViewParent viewparent = getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #514 <Method ViewParent getParent()>
	//    2    4:astore_1        
		if(mOnOffsetChangedListener != null && (viewparent instanceof AppBarLayout))
	//*   3    5:aload_0         
	//*   4    6:getfield        #525 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
	//*   5    9:ifnull          30
	//*   6   12:aload_1         
	//*   7   13:instanceof      #516 <Class AppBarLayout>
	//*   8   16:ifeq            30
			((AppBarLayout)viewparent).removeOnOffsetChangedListener(mOnOffsetChangedListener);
	//    9   19:aload_1         
	//   10   20:checkcast       #516 <Class AppBarLayout>
	//   11   23:aload_0         
	//   12   24:getfield        #525 <Field AppBarLayout$OnOffsetChangedListener mOnOffsetChangedListener>
	//   13   27:invokevirtual   #537 <Method void AppBarLayout.removeOnOffsetChangedListener(AppBarLayout$OnOffsetChangedListener)>
		super.onDetachedFromWindow();
	//   14   30:aload_0         
	//   15   31:invokespecial   #539 <Method void FrameLayout.onDetachedFromWindow()>
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
	//    6    8:invokespecial   #543 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		if(mLastInsets != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #404 <Field WindowInsetsCompat mLastInsets>
	//*   9   15:ifnull          85
		{
			int k1 = mLastInsets.getSystemWindowInsetTop();
	//   10   18:aload_0         
	//   11   19:getfield        #404 <Field WindowInsetsCompat mLastInsets>
	//   12   22:invokevirtual   #409 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   13   25:istore          7
			int i1 = 0;
	//   14   27:iconst_0        
	//   15   28:istore          6
			for(int i2 = getChildCount(); i1 < i2; i1++)
	//*  16   30:aload_0         
	//*  17   31:invokevirtual   #307 <Method int getChildCount()>
	//*  18   34:istore          8
	//*  19   36:iload           6
	//*  20   38:iload           8
	//*  21   40:icmpge          85
			{
				View view = getChildAt(i1);
	//   22   43:aload_0         
	//   23   44:iload           6
	//   24   46:invokevirtual   #310 <Method View getChildAt(int)>
	//   25   49:astore          14
				if(!ViewCompat.getFitsSystemWindows(view) && view.getTop() < k1)
	//*  26   51:aload           14
	//*  27   53:invokestatic    #519 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  28   56:ifne            76
	//*  29   59:aload           14
	//*  30   61:invokevirtual   #546 <Method int View.getTop()>
	//*  31   64:iload           7
	//*  32   66:icmpge          76
					ViewCompat.offsetTopAndBottom(view, k1);
	//   33   69:aload           14
	//   34   71:iload           7
	//   35   73:invokestatic    #550 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			}

	//   36   76:iload           6
	//   37   78:iconst_1        
	//   38   79:iadd            
	//   39   80:istore          6
		}
	//*  40   82:goto            36
		if(mCollapsingTitleEnabled && mDummyView != null)
	//*  41   85:aload_0         
	//*  42   86:getfield        #167 <Field boolean mCollapsingTitleEnabled>
	//*  43   89:ifeq            428
	//*  44   92:aload_0         
	//*  45   93:getfield        #363 <Field View mDummyView>
	//*  46   96:ifnull          428
		{
			if(ViewCompat.isAttachedToWindow(mDummyView) && mDummyView.getVisibility() == 0)
	//*  47   99:aload_0         
	//*  48  100:getfield        #363 <Field View mDummyView>
	//*  49  103:invokestatic    #553 <Method boolean ViewCompat.isAttachedToWindow(View)>
	//*  50  106:ifeq            124
	//*  51  109:aload_0         
	//*  52  110:getfield        #363 <Field View mDummyView>
	//*  53  113:invokevirtual   #556 <Method int View.getVisibility()>
	//*  54  116:ifne            124
				flag = true;
	//   55  119:iconst_1        
	//   56  120:istore_1        
			else
	//*  57  121:goto            126
				flag = false;
	//   58  124:iconst_0        
	//   59  125:istore_1        
			mDrawCollapsingTitle = flag;
	//   60  126:aload_0         
	//   61  127:iload_1         
	//   62  128:putfield        #398 <Field boolean mDrawCollapsingTitle>
			if(mDrawCollapsingTitle)
	//*  63  131:aload_0         
	//*  64  132:getfield        #398 <Field boolean mDrawCollapsingTitle>
	//*  65  135:ifeq            428
			{
				boolean flag1;
				if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*  66  138:aload_0         
	//*  67  139:invokestatic    #559 <Method int ViewCompat.getLayoutDirection(View)>
	//*  68  142:iconst_1        
	//*  69  143:icmpne          152
					flag1 = true;
	//   70  146:iconst_1        
	//   71  147:istore          6
				else
	//*  72  149:goto            155
					flag1 = false;
	//   73  152:iconst_0        
	//   74  153:istore          6
				Object obj;
				if(mToolbarDirectChild != null)
	//*  75  155:aload_0         
	//*  76  156:getfield        #293 <Field View mToolbarDirectChild>
	//*  77  159:ifnull          171
					obj = ((Object) (mToolbarDirectChild));
	//   78  162:aload_0         
	//   79  163:getfield        #293 <Field View mToolbarDirectChild>
	//   80  166:astore          14
				else
	//*  81  168:goto            177
					obj = ((Object) (mToolbar));
	//   82  171:aload_0         
	//   83  172:getfield        #291 <Field Toolbar mToolbar>
	//   84  175:astore          14
				int k2 = getMaxOffsetForPinChild(((View) (obj)));
	//   85  177:aload_0         
	//   86  178:aload           14
	//   87  180:invokevirtual   #561 <Method int getMaxOffsetForPinChild(View)>
	//   88  183:istore          9
				ac.e(((ViewGroup) (this)), mDummyView, mTmpRect);
	//   89  185:aload_0         
	//   90  186:aload_0         
	//   91  187:getfield        #363 <Field View mDummyView>
	//   92  190:aload_0         
	//   93  191:getfield        #69  <Field Rect mTmpRect>
	//   94  194:invokestatic    #566 <Method void ac.e(ViewGroup, View, Rect)>
				obj = ((Object) (mCollapsingTextHelper));
	//   95  197:aload_0         
	//   96  198:getfield        #83  <Field n mCollapsingTextHelper>
	//   97  201:astore          14
				int l2 = mTmpRect.left;
	//   98  203:aload_0         
	//   99  204:getfield        #69  <Field Rect mTmpRect>
	//  100  207:getfield        #569 <Field int Rect.left>
	//  101  210:istore          10
				int l1;
				if(flag1)
	//* 102  212:iload           6
	//* 103  214:ifeq            229
					l1 = mToolbar.getTitleMarginEnd();
	//  104  217:aload_0         
	//  105  218:getfield        #291 <Field Toolbar mToolbar>
	//  106  221:invokevirtual   #572 <Method int Toolbar.getTitleMarginEnd()>
	//  107  224:istore          7
				else
	//* 108  226:goto            238
					l1 = mToolbar.getTitleMarginStart();
	//  109  229:aload_0         
	//  110  230:getfield        #291 <Field Toolbar mToolbar>
	//  111  233:invokevirtual   #575 <Method int Toolbar.getTitleMarginStart()>
	//  112  236:istore          7
				int i3 = mTmpRect.top;
	//  113  238:aload_0         
	//  114  239:getfield        #69  <Field Rect mTmpRect>
	//  115  242:getfield        #578 <Field int Rect.top>
	//  116  245:istore          11
				int j3 = mToolbar.getTitleMarginTop();
	//  117  247:aload_0         
	//  118  248:getfield        #291 <Field Toolbar mToolbar>
	//  119  251:invokevirtual   #581 <Method int Toolbar.getTitleMarginTop()>
	//  120  254:istore          12
				int k3 = mTmpRect.right;
	//  121  256:aload_0         
	//  122  257:getfield        #69  <Field Rect mTmpRect>
	//  123  260:getfield        #584 <Field int Rect.right>
	//  124  263:istore          13
				int j2;
				if(flag1)
	//* 125  265:iload           6
	//* 126  267:ifeq            282
					j2 = mToolbar.getTitleMarginStart();
	//  127  270:aload_0         
	//  128  271:getfield        #291 <Field Toolbar mToolbar>
	//  129  274:invokevirtual   #575 <Method int Toolbar.getTitleMarginStart()>
	//  130  277:istore          8
				else
	//* 131  279:goto            291
					j2 = mToolbar.getTitleMarginEnd();
	//  132  282:aload_0         
	//  133  283:getfield        #291 <Field Toolbar mToolbar>
	//  134  286:invokevirtual   #572 <Method int Toolbar.getTitleMarginEnd()>
	//  135  289:istore          8
				((n) (obj)).b(l2 + l1, i3 + k2 + j3, k3 + j2, (mTmpRect.bottom + k2) - mToolbar.getTitleMarginBottom());
	//  136  291:aload           14
	//  137  293:iload           10
	//  138  295:iload           7
	//  139  297:iadd            
	//  140  298:iload           11
	//  141  300:iload           9
	//  142  302:iadd            
	//  143  303:iload           12
	//  144  305:iadd            
	//  145  306:iload           13
	//  146  308:iload           8
	//  147  310:iadd            
	//  148  311:aload_0         
	//  149  312:getfield        #69  <Field Rect mTmpRect>
	//  150  315:getfield        #587 <Field int Rect.bottom>
	//  151  318:iload           9
	//  152  320:iadd            
	//  153  321:aload_0         
	//  154  322:getfield        #291 <Field Toolbar mToolbar>
	//  155  325:invokevirtual   #590 <Method int Toolbar.getTitleMarginBottom()>
	//  156  328:isub            
	//  157  329:invokevirtual   #592 <Method void n.b(int, int, int, int)>
				obj = ((Object) (mCollapsingTextHelper));
	//  158  332:aload_0         
	//  159  333:getfield        #83  <Field n mCollapsingTextHelper>
	//  160  336:astore          14
				if(flag1)
	//* 161  338:iload           6
	//* 162  340:ifeq            352
					l1 = mExpandedMarginEnd;
	//  163  343:aload_0         
	//  164  344:getfield        #138 <Field int mExpandedMarginEnd>
	//  165  347:istore          7
				else
	//* 166  349:goto            358
					l1 = mExpandedMarginStart;
	//  167  352:aload_0         
	//  168  353:getfield        #142 <Field int mExpandedMarginStart>
	//  169  356:istore          7
				j2 = mTmpRect.top;
	//  170  358:aload_0         
	//  171  359:getfield        #69  <Field Rect mTmpRect>
	//  172  362:getfield        #578 <Field int Rect.top>
	//  173  365:istore          8
				k2 = mExpandedMarginTop;
	//  174  367:aload_0         
	//  175  368:getfield        #140 <Field int mExpandedMarginTop>
	//  176  371:istore          9
				int j1;
				if(flag1)
	//* 177  373:iload           6
	//* 178  375:ifeq            387
					j1 = mExpandedMarginStart;
	//  179  378:aload_0         
	//  180  379:getfield        #142 <Field int mExpandedMarginStart>
	//  181  382:istore          6
				else
	//* 182  384:goto            393
					j1 = mExpandedMarginEnd;
	//  183  387:aload_0         
	//  184  388:getfield        #138 <Field int mExpandedMarginEnd>
	//  185  391:istore          6
				((n) (obj)).d(l1, j2 + k2, k - i - j1, l - j - mExpandedMarginBottom);
	//  186  393:aload           14
	//  187  395:iload           7
	//  188  397:iload           8
	//  189  399:iload           9
	//  190  401:iadd            
	//  191  402:iload           4
	//  192  404:iload_2         
	//  193  405:isub            
	//  194  406:iload           6
	//  195  408:isub            
	//  196  409:iload           5
	//  197  411:iload_3         
	//  198  412:isub            
	//  199  413:aload_0         
	//  200  414:getfield        #136 <Field int mExpandedMarginBottom>
	//  201  417:isub            
	//  202  418:invokevirtual   #594 <Method void n.d(int, int, int, int)>
				mCollapsingTextHelper.h();
	//  203  421:aload_0         
	//  204  422:getfield        #83  <Field n mCollapsingTextHelper>
	//  205  425:invokevirtual   #597 <Method void n.h()>
			}
		}
		i = 0;
	//  206  428:iconst_0        
	//  207  429:istore_2        
		for(j = getChildCount(); i < j; i++)
	//* 208  430:aload_0         
	//* 209  431:invokevirtual   #307 <Method int getChildCount()>
	//* 210  434:istore_3        
	//* 211  435:iload_2         
	//* 212  436:iload_3         
	//* 213  437:icmpge          458
			getViewOffsetHelper(getChildAt(i)).a();
	//  214  440:aload_0         
	//  215  441:iload_2         
	//  216  442:invokevirtual   #310 <Method View getChildAt(int)>
	//  217  445:invokestatic    #487 <Method ab getViewOffsetHelper(View)>
	//  218  448:invokevirtual   #599 <Method void ab.a()>

	//  219  451:iload_2         
	//  220  452:iconst_1        
	//  221  453:iadd            
	//  222  454:istore_2        
	//* 223  455:goto            435
		if(mToolbar != null)
	//* 224  458:aload_0         
	//* 225  459:getfield        #291 <Field Toolbar mToolbar>
	//* 226  462:ifnull          539
		{
			if(mCollapsingTitleEnabled && TextUtils.isEmpty(mCollapsingTextHelper.k()))
	//* 227  465:aload_0         
	//* 228  466:getfield        #167 <Field boolean mCollapsingTitleEnabled>
	//* 229  469:ifeq            499
	//* 230  472:aload_0         
	//* 231  473:getfield        #83  <Field n mCollapsingTextHelper>
	//* 232  476:invokevirtual   #509 <Method CharSequence n.k()>
	//* 233  479:invokestatic    #605 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 234  482:ifeq            499
				mCollapsingTextHelper.a(mToolbar.getTitle());
	//  235  485:aload_0         
	//  236  486:getfield        #83  <Field n mCollapsingTextHelper>
	//  237  489:aload_0         
	//  238  490:getfield        #291 <Field Toolbar mToolbar>
	//  239  493:invokevirtual   #607 <Method CharSequence Toolbar.getTitle()>
	//  240  496:invokevirtual   #609 <Method void n.a(CharSequence)>
			if(mToolbarDirectChild == null || mToolbarDirectChild == this)
	//* 241  499:aload_0         
	//* 242  500:getfield        #293 <Field View mToolbarDirectChild>
	//* 243  503:ifnull          514
	//* 244  506:aload_0         
	//* 245  507:getfield        #293 <Field View mToolbarDirectChild>
	//* 246  510:aload_0         
	//* 247  511:if_acmpne       528
				setMinimumHeight(getHeightWithMargins(((View) (mToolbar))));
	//  248  514:aload_0         
	//  249  515:aload_0         
	//  250  516:getfield        #291 <Field Toolbar mToolbar>
	//  251  519:invokestatic    #611 <Method int getHeightWithMargins(View)>
	//  252  522:invokevirtual   #614 <Method void setMinimumHeight(int)>
			else
	//* 253  525:goto            539
				setMinimumHeight(getHeightWithMargins(mToolbarDirectChild));
	//  254  528:aload_0         
	//  255  529:aload_0         
	//  256  530:getfield        #293 <Field View mToolbarDirectChild>
	//  257  533:invokestatic    #611 <Method int getHeightWithMargins(View)>
	//  258  536:invokevirtual   #614 <Method void setMinimumHeight(int)>
		}
		updateScrimVisibility();
	//  259  539:aload_0         
	//  260  540:invokevirtual   #617 <Method void updateScrimVisibility()>
	//  261  543:return          
	}

	protected void onMeasure(int i, int j)
	{
		ensureToolbar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #251 <Method void ensureToolbar()>
		super.onMeasure(i, j);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #620 <Method void FrameLayout.onMeasure(int, int)>
	//    6   10:return          
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #623 <Method void FrameLayout.onSizeChanged(int, int, int, int)>
		if(mContentScrim != null)
	//*   6    9:aload_0         
	//*   7   10:getfield        #386 <Field Drawable mContentScrim>
	//*   8   13:ifnull          27
			mContentScrim.setBounds(0, 0, i, j);
	//    9   16:aload_0         
	//   10   17:getfield        #386 <Field Drawable mContentScrim>
	//   11   20:iconst_0        
	//   12   21:iconst_0        
	//   13   22:iload_1         
	//   14   23:iload_2         
	//   15   24:invokevirtual   #418 <Method void Drawable.setBounds(int, int, int, int)>
	//   16   27:return          
	}

	WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat windowinsetscompat)
	{
		WindowInsetsCompat windowinsetscompat1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #519 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   4    6:ifeq            11
			windowinsetscompat1 = windowinsetscompat;
	//    5    9:aload_1         
	//    6   10:astore_2        
		if(!ad.a(((Object) (mLastInsets)), ((Object) (windowinsetscompat1))))
	//*   7   11:aload_0         
	//*   8   12:getfield        #404 <Field WindowInsetsCompat mLastInsets>
	//*   9   15:aload_2         
	//*  10   16:invokestatic    #630 <Method boolean ad.a(Object, Object)>
	//*  11   19:ifne            31
		{
			mLastInsets = windowinsetscompat1;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #404 <Field WindowInsetsCompat mLastInsets>
			requestLayout();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #633 <Method void requestLayout()>
		}
		return windowinsetscompat.consumeSystemWindowInsets();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #637 <Method WindowInsetsCompat WindowInsetsCompat.consumeSystemWindowInsets()>
	//   19   35:areturn         
	}

	public void setCollapsedTitleGravity(int i)
	{
		mCollapsingTextHelper.b(i);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #128 <Method void n.b(int)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextAppearance(int i)
	{
		mCollapsingTextHelper.c(i);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #192 <Method void n.c(int)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextColor(int i)
	{
		setCollapsedTitleTextColor(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #648 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #651 <Method void setCollapsedTitleTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setCollapsedTitleTextColor(ColorStateList colorstatelist)
	{
		mCollapsingTextHelper.c(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #653 <Method void n.c(ColorStateList)>
	//    4    8:return          
	}

	public void setCollapsedTitleTypeface(Typeface typeface)
	{
		mCollapsingTextHelper.d(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #657 <Method void n.d(Typeface)>
	//    4    8:return          
	}

	public void setContentScrim(Drawable drawable)
	{
		if(mContentScrim != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #386 <Field Drawable mContentScrim>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       89
		{
			if(mContentScrim != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #386 <Field Drawable mContentScrim>
	//*   6   12:ifnull          23
				mContentScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #386 <Field Drawable mContentScrim>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #661 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          35
				drawable = drawable.mutate();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #392 <Method Drawable Drawable.mutate()>
	//   15   31:astore_1        
			else
	//*  16   32:goto            37
				drawable = null;
	//   17   35:aconst_null     
	//   18   36:astore_1        
			mContentScrim = drawable;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:putfield        #386 <Field Drawable mContentScrim>
			if(mContentScrim != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #386 <Field Drawable mContentScrim>
	//*  24   46:ifnull          85
			{
				mContentScrim.setBounds(0, 0, getWidth(), getHeight());
	//   25   49:aload_0         
	//   26   50:getfield        #386 <Field Drawable mContentScrim>
	//   27   53:iconst_0        
	//   28   54:iconst_0        
	//   29   55:aload_0         
	//   30   56:invokevirtual   #414 <Method int getWidth()>
	//   31   59:aload_0         
	//   32   60:invokevirtual   #488 <Method int getHeight()>
	//   33   63:invokevirtual   #418 <Method void Drawable.setBounds(int, int, int, int)>
				mContentScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   34   66:aload_0         
	//   35   67:getfield        #386 <Field Drawable mContentScrim>
	//   36   70:aload_0         
	//   37   71:invokevirtual   #661 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				mContentScrim.setAlpha(mScrimAlpha);
	//   38   74:aload_0         
	//   39   75:getfield        #386 <Field Drawable mContentScrim>
	//   40   78:aload_0         
	//   41   79:getfield        #262 <Field int mScrimAlpha>
	//   42   82:invokevirtual   #395 <Method void Drawable.setAlpha(int)>
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   43   85:aload_0         
	//   44   86:invokestatic    #664 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   45   89:return          
	}

	public void setContentScrimColor(int i)
	{
		setContentScrim(((Drawable) (new ColorDrawable(i))));
	//    0    0:aload_0         
	//    1    1:new             #667 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #669 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #220 <Method void setContentScrim(Drawable)>
	//    6   12:return          
	}

	public void setContentScrimResource(int i)
	{
		setContentScrim(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #372 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #676 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #220 <Method void setContentScrim(Drawable)>
	//    6   12:return          
	}

	public void setExpandedTitleColor(int i)
	{
		setExpandedTitleTextColor(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #648 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #680 <Method void setExpandedTitleTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setExpandedTitleGravity(int i)
	{
		mCollapsingTextHelper.e(i);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #122 <Method void n.e(int)>
	//    4    8:return          
	}

	public void setExpandedTitleMargin(int i, int j, int k, int l)
	{
		mExpandedMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #142 <Field int mExpandedMarginStart>
		mExpandedMarginTop = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #140 <Field int mExpandedMarginTop>
		mExpandedMarginEnd = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #138 <Field int mExpandedMarginEnd>
		mExpandedMarginBottom = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #136 <Field int mExpandedMarginBottom>
		requestLayout();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #633 <Method void requestLayout()>
	//   14   25:return          
	}

	public void setExpandedTitleMarginBottom(int i)
	{
		mExpandedMarginBottom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #136 <Field int mExpandedMarginBottom>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #633 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginEnd(int i)
	{
		mExpandedMarginEnd = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #138 <Field int mExpandedMarginEnd>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #633 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginStart(int i)
	{
		mExpandedMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #142 <Field int mExpandedMarginStart>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #633 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleMarginTop(int i)
	{
		mExpandedMarginTop = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #140 <Field int mExpandedMarginTop>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #633 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setExpandedTitleTextAppearance(int i)
	{
		mCollapsingTextHelper.a(i);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #184 <Method void n.a(int)>
	//    4    8:return          
	}

	public void setExpandedTitleTextColor(ColorStateList colorstatelist)
	{
		mCollapsingTextHelper.b(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #689 <Method void n.b(ColorStateList)>
	//    4    8:return          
	}

	public void setExpandedTitleTypeface(Typeface typeface)
	{
		mCollapsingTextHelper.e(typeface);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #692 <Method void n.e(Typeface)>
	//    4    8:return          
	}

	void setScrimAlpha(int i)
	{
		if(i != mScrimAlpha)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #262 <Field int mScrimAlpha>
	//*   3    5:icmpeq          38
		{
			if(mContentScrim != null && mToolbar != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #386 <Field Drawable mContentScrim>
	//*   6   12:ifnull          29
	//*   7   15:aload_0         
	//*   8   16:getfield        #291 <Field Toolbar mToolbar>
	//*   9   19:ifnull          29
				ViewCompat.postInvalidateOnAnimation(((View) (mToolbar)));
	//   10   22:aload_0         
	//   11   23:getfield        #291 <Field Toolbar mToolbar>
	//   12   26:invokestatic    #664 <Method void ViewCompat.postInvalidateOnAnimation(View)>
			mScrimAlpha = i;
	//   13   29:aload_0         
	//   14   30:iload_1         
	//   15   31:putfield        #262 <Field int mScrimAlpha>
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   16   34:aload_0         
	//   17   35:invokestatic    #664 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   18   38:return          
	}

	public void setScrimAnimationDuration(long l)
	{
		mScrimAnimationDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #209 <Field long mScrimAnimationDuration>
	//    3    5:return          
	}

	public void setScrimVisibleHeightTrigger(int i)
	{
		if(mScrimVisibleHeightTrigger != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field int mScrimVisibleHeightTrigger>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mScrimVisibleHeightTrigger = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #71  <Field int mScrimVisibleHeightTrigger>
			updateScrimVisibility();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #617 <Method void updateScrimVisibility()>
		}
	//    9   17:return          
	}

	public void setScrimsShown(boolean flag)
	{
		boolean flag1;
		if(ViewCompat.isLaidOut(((View) (this))) && !isInEditMode())
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #704 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifeq            19
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #707 <Method boolean isInEditMode()>
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
	//   14   24:invokevirtual   #710 <Method void setScrimsShown(boolean, boolean)>
	//   15   27:return          
	}

	public void setScrimsShown(boolean flag, boolean flag1)
	{
		if(mScrimsAreShown != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #712 <Field boolean mScrimsAreShown>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          56
		{
			if(flag1)
	//*   4    8:iload_2         
	//*   5    9:ifeq            33
			{
				char c;
				if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            23
					c = '\377';
	//    8   16:sipush          255
	//    9   19:istore_3        
				else
	//*  10   20:goto            25
					c = '\0';
	//   11   23:iconst_0        
	//   12   24:istore_3        
				animateScrim(((int) (c)));
	//   13   25:aload_0         
	//   14   26:iload_3         
	//   15   27:invokespecial   #714 <Method void animateScrim(int)>
			} else
	//*  16   30:goto            51
			{
				char c1;
				if(flag)
	//*  17   33:iload_1         
	//*  18   34:ifeq            44
					c1 = '\377';
	//   19   37:sipush          255
	//   20   40:istore_3        
				else
	//*  21   41:goto            46
					c1 = '\0';
	//   22   44:iconst_0        
	//   23   45:istore_3        
				setScrimAlpha(((int) (c1)));
	//   24   46:aload_0         
	//   25   47:iload_3         
	//   26   48:invokevirtual   #716 <Method void setScrimAlpha(int)>
			}
			mScrimsAreShown = flag;
	//   27   51:aload_0         
	//   28   52:iload_1         
	//   29   53:putfield        #712 <Field boolean mScrimsAreShown>
		}
	//   30   56:return          
	}

	public void setStatusBarScrim(Drawable drawable)
	{
		if(mStatusBarScrim != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #402 <Field Drawable mStatusBarScrim>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       132
		{
			if(mStatusBarScrim != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #402 <Field Drawable mStatusBarScrim>
	//*   6   12:ifnull          23
				mStatusBarScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #402 <Field Drawable mStatusBarScrim>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #661 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          35
				drawable = drawable.mutate();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #392 <Method Drawable Drawable.mutate()>
	//   15   31:astore_1        
			else
	//*  16   32:goto            37
				drawable = null;
	//   17   35:aconst_null     
	//   18   36:astore_1        
			mStatusBarScrim = drawable;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:putfield        #402 <Field Drawable mStatusBarScrim>
			if(mStatusBarScrim != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #402 <Field Drawable mStatusBarScrim>
	//*  24   46:ifnull          128
			{
				if(mStatusBarScrim.isStateful())
	//*  25   49:aload_0         
	//*  26   50:getfield        #402 <Field Drawable mStatusBarScrim>
	//*  27   53:invokevirtual   #434 <Method boolean Drawable.isStateful()>
	//*  28   56:ifeq            71
					mStatusBarScrim.setState(getDrawableState());
	//   29   59:aload_0         
	//   30   60:getfield        #402 <Field Drawable mStatusBarScrim>
	//   31   63:aload_0         
	//   32   64:invokevirtual   #431 <Method int[] getDrawableState()>
	//   33   67:invokevirtual   #438 <Method boolean Drawable.setState(int[])>
	//   34   70:pop             
				DrawableCompat.setLayoutDirection(mStatusBarScrim, ViewCompat.getLayoutDirection(((View) (this))));
	//   35   71:aload_0         
	//   36   72:getfield        #402 <Field Drawable mStatusBarScrim>
	//   37   75:aload_0         
	//   38   76:invokestatic    #559 <Method int ViewCompat.getLayoutDirection(View)>
	//   39   79:invokestatic    #722 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   40   82:pop             
				drawable = mStatusBarScrim;
	//   41   83:aload_0         
	//   42   84:getfield        #402 <Field Drawable mStatusBarScrim>
	//   43   87:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  44   88:aload_0         
	//*  45   89:invokevirtual   #723 <Method int getVisibility()>
	//*  46   92:ifne            100
					flag = true;
	//   47   95:iconst_1        
	//   48   96:istore_2        
				else
	//*  49   97:goto            102
					flag = false;
	//   50  100:iconst_0        
	//   51  101:istore_2        
				drawable.setVisible(flag, false);
	//   52  102:aload_1         
	//   53  103:iload_2         
	//   54  104:iconst_0        
	//   55  105:invokevirtual   #727 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   56  108:pop             
				mStatusBarScrim.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   57  109:aload_0         
	//   58  110:getfield        #402 <Field Drawable mStatusBarScrim>
	//   59  113:aload_0         
	//   60  114:invokevirtual   #661 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
				mStatusBarScrim.setAlpha(mScrimAlpha);
	//   61  117:aload_0         
	//   62  118:getfield        #402 <Field Drawable mStatusBarScrim>
	//   63  121:aload_0         
	//   64  122:getfield        #262 <Field int mScrimAlpha>
	//   65  125:invokevirtual   #395 <Method void Drawable.setAlpha(int)>
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   66  128:aload_0         
	//   67  129:invokestatic    #664 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   68  132:return          
	}

	public void setStatusBarScrimColor(int i)
	{
		setStatusBarScrim(((Drawable) (new ColorDrawable(i))));
	//    0    0:aload_0         
	//    1    1:new             #667 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #669 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #226 <Method void setStatusBarScrim(Drawable)>
	//    6   12:return          
	}

	public void setStatusBarScrimResource(int i)
	{
		setStatusBarScrim(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #372 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #676 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #226 <Method void setStatusBarScrim(Drawable)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mCollapsingTextHelper.a(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field n mCollapsingTextHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #609 <Method void n.a(CharSequence)>
	//    4    8:return          
	}

	public void setTitleEnabled(boolean flag)
	{
		if(flag != mCollapsingTitleEnabled)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #167 <Field boolean mCollapsingTitleEnabled>
	//*   3    5:icmpeq          21
		{
			mCollapsingTitleEnabled = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #167 <Field boolean mCollapsingTitleEnabled>
			updateDummyView();
	//    7   13:aload_0         
	//    8   14:invokespecial   #313 <Method void updateDummyView()>
			requestLayout();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #633 <Method void requestLayout()>
		}
	//   11   21:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #733 <Method void FrameLayout.setVisibility(int)>
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
	//*  11   17:getfield        #402 <Field Drawable mStatusBarScrim>
	//*  12   20:ifnull          44
	//*  13   23:aload_0         
	//*  14   24:getfield        #402 <Field Drawable mStatusBarScrim>
	//*  15   27:invokevirtual   #736 <Method boolean Drawable.isVisible()>
	//*  16   30:iload_2         
	//*  17   31:icmpeq          44
			mStatusBarScrim.setVisible(flag, false);
	//   18   34:aload_0         
	//   19   35:getfield        #402 <Field Drawable mStatusBarScrim>
	//   20   38:iload_2         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #727 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   23   43:pop             
		if(mContentScrim != null && mContentScrim.isVisible() != flag)
	//*  24   44:aload_0         
	//*  25   45:getfield        #386 <Field Drawable mContentScrim>
	//*  26   48:ifnull          72
	//*  27   51:aload_0         
	//*  28   52:getfield        #386 <Field Drawable mContentScrim>
	//*  29   55:invokevirtual   #736 <Method boolean Drawable.isVisible()>
	//*  30   58:iload_2         
	//*  31   59:icmpeq          72
			mContentScrim.setVisible(flag, false);
	//   32   62:aload_0         
	//   33   63:getfield        #386 <Field Drawable mContentScrim>
	//   34   66:iload_2         
	//   35   67:iconst_0        
	//   36   68:invokevirtual   #727 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   37   71:pop             
	//   38   72:return          
	}

	final void updateScrimVisibility()
	{
		if(mContentScrim != null || mStatusBarScrim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #386 <Field Drawable mContentScrim>
	//*   2    4:ifnonnull       14
	//*   3    7:aload_0         
	//*   4    8:getfield        #402 <Field Drawable mStatusBarScrim>
	//*   5   11:ifnull          42
		{
			boolean flag;
			if(getHeight() + mCurrentOffset < getScrimVisibleHeightTrigger())
	//*   6   14:aload_0         
	//*   7   15:invokevirtual   #488 <Method int getHeight()>
	//*   8   18:aload_0         
	//*   9   19:getfield        #411 <Field int mCurrentOffset>
	//*  10   22:iadd            
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #738 <Method int getScrimVisibleHeightTrigger()>
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
	//   21   39:invokevirtual   #740 <Method void setScrimsShown(boolean)>
		}
	//   22   42:return          
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mContentScrim || drawable == mStatusBarScrim;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #744 <Method boolean FrameLayout.verifyDrawable(Drawable)>
	//    3    5:ifne            24
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #386 <Field Drawable mContentScrim>
	//    7   13:if_acmpeq       24
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #402 <Field Drawable mStatusBarScrim>
	//   11   21:if_acmpne       26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	private static final int DEFAULT_SCRIM_ANIMATION_DURATION = 600;
	final n mCollapsingTextHelper;
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
