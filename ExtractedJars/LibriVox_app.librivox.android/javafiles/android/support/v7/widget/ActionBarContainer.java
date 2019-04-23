// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ac;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.widget:
//			ActionBarBackgroundDrawable, ScrollingTabContainerView

public class ActionBarContainer extends FrameLayout
{

	public ActionBarContainer(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #23  <Method void ActionBarContainer(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionBarContainer(Context context, AttributeSet attributeset)
	{
		boolean flag;
		boolean flag1;
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void FrameLayout(Context, AttributeSet)>
		ac.a(((View) (this)), ((Drawable) (new ActionBarBackgroundDrawable(this))));
	//    4    6:aload_0         
	//    5    7:new             #27  <Class ActionBarBackgroundDrawable>
	//    6   10:dup             
	//    7   11:aload_0         
	//    8   12:invokespecial   #30  <Method void ActionBarBackgroundDrawable(ActionBarContainer)>
	//    9   15:invokestatic    #36  <Method void ac.a(View, Drawable)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar)));
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:getstatic       #42  <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//   13   23:invokevirtual   #48  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   14   26:astore_1        
		mBackground = ((TypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_background);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getstatic       #51  <Field int android.support.v7.appcompat.R$styleable.ActionBar_background>
	//   18   32:invokevirtual   #57  <Method Drawable TypedArray.getDrawable(int)>
	//   19   35:putfield        #59  <Field Drawable mBackground>
		mStackedBackground = ((TypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_backgroundStacked);
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getstatic       #62  <Field int android.support.v7.appcompat.R$styleable.ActionBar_backgroundStacked>
	//   23   43:invokevirtual   #57  <Method Drawable TypedArray.getDrawable(int)>
	//   24   46:putfield        #64  <Field Drawable mStackedBackground>
		mHeight = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_height, -1);
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:getstatic       #67  <Field int android.support.v7.appcompat.R$styleable.ActionBar_height>
	//   28   54:iconst_m1       
	//   29   55:invokevirtual   #71  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   30   58:putfield        #73  <Field int mHeight>
		if(getId() == android.support.v7.appcompat.R.id.split_action_bar)
	//*  31   61:aload_0         
	//*  32   62:invokevirtual   #77  <Method int getId()>
	//*  33   65:getstatic       #82  <Field int android.support.v7.appcompat.R$id.split_action_bar>
	//*  34   68:icmpne          87
		{
			mIsSplit = true;
	//   35   71:aload_0         
	//   36   72:iconst_1        
	//   37   73:putfield        #84  <Field boolean mIsSplit>
			mSplitBackground = ((TypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_backgroundSplit);
	//   38   76:aload_0         
	//   39   77:aload_1         
	//   40   78:getstatic       #87  <Field int android.support.v7.appcompat.R$styleable.ActionBar_backgroundSplit>
	//   41   81:invokevirtual   #57  <Method Drawable TypedArray.getDrawable(int)>
	//   42   84:putfield        #89  <Field Drawable mSplitBackground>
		}
		((TypedArray) (context)).recycle();
	//   43   87:aload_1         
	//   44   88:invokevirtual   #93  <Method void TypedArray.recycle()>
		flag = mIsSplit;
	//   45   91:aload_0         
	//   46   92:getfield        #84  <Field boolean mIsSplit>
	//   47   95:istore_3        
		flag1 = false;
	//   48   96:iconst_0        
	//   49   97:istore          4
		if(!flag) goto _L2; else goto _L1
	//   50   99:iload_3         
	//   51  100:ifeq            118
_L1:
		flag = flag1;
	//   52  103:iload           4
	//   53  105:istore_3        
		if(mSplitBackground != null) goto _L4; else goto _L3
	//   54  106:aload_0         
	//   55  107:getfield        #89  <Field Drawable mSplitBackground>
	//   56  110:ifnonnull       141
_L3:
		flag = true;
	//   57  113:iconst_1        
	//   58  114:istore_3        
		break; /* Loop/switch isn't completed */
	//   59  115:goto            141
_L2:
		flag = flag1;
	//   60  118:iload           4
	//   61  120:istore_3        
		if(mBackground != null)
			break; /* Loop/switch isn't completed */
	//   62  121:aload_0         
	//   63  122:getfield        #59  <Field Drawable mBackground>
	//   64  125:ifnonnull       141
		flag = flag1;
	//   65  128:iload           4
	//   66  130:istore_3        
		if(mStackedBackground != null) goto _L4; else goto _L3
	//   67  131:aload_0         
	//   68  132:getfield        #64  <Field Drawable mStackedBackground>
	//   69  135:ifnonnull       141
	//*  70  138:goto            113
_L4:
		setWillNotDraw(flag);
	//   71  141:aload_0         
	//   72  142:iload_3         
	//   73  143:invokevirtual   #97  <Method void setWillNotDraw(boolean)>
		return;
	//   74  146:return          
	}

	private int getMeasuredHeightWithMargins(View view)
	{
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #105 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #107 <Class android.widget.FrameLayout$LayoutParams>
	//    3    7:astore_2        
		return view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #110 <Method int View.getMeasuredHeight()>
	//    6   12:aload_2         
	//    7   13:getfield        #113 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//    8   16:iadd            
	//    9   17:aload_2         
	//   10   18:getfield        #116 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   11   21:iadd            
	//   12   22:ireturn         
	}

	private boolean isCollapsed(View view)
	{
		return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
	//    0    0:aload_1         
	//    1    1:ifnull          25
	//    2    4:aload_1         
	//    3    5:invokevirtual   #121 <Method int View.getVisibility()>
	//    4    8:bipush          8
	//    5   10:icmpeq          25
	//    6   13:aload_1         
	//    7   14:invokevirtual   #110 <Method int View.getMeasuredHeight()>
	//    8   17:ifne            23
	//    9   20:goto            25
	//   10   23:iconst_0        
	//   11   24:ireturn         
	//   12   25:iconst_1        
	//   13   26:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void FrameLayout.drawableStateChanged()>
		Drawable drawable = mBackground;
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field Drawable mBackground>
	//    4    8:astore_1        
		if(drawable != null && drawable.isStateful())
	//*   5    9:aload_1         
	//*   6   10:ifnull          32
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #130 <Method boolean Drawable.isStateful()>
	//*   9   17:ifeq            32
			mBackground.setState(getDrawableState());
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field Drawable mBackground>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #134 <Method int[] getDrawableState()>
	//   14   28:invokevirtual   #138 <Method boolean Drawable.setState(int[])>
	//   15   31:pop             
		drawable = mStackedBackground;
	//   16   32:aload_0         
	//   17   33:getfield        #64  <Field Drawable mStackedBackground>
	//   18   36:astore_1        
		if(drawable != null && drawable.isStateful())
	//*  19   37:aload_1         
	//*  20   38:ifnull          60
	//*  21   41:aload_1         
	//*  22   42:invokevirtual   #130 <Method boolean Drawable.isStateful()>
	//*  23   45:ifeq            60
			mStackedBackground.setState(getDrawableState());
	//   24   48:aload_0         
	//   25   49:getfield        #64  <Field Drawable mStackedBackground>
	//   26   52:aload_0         
	//   27   53:invokevirtual   #134 <Method int[] getDrawableState()>
	//   28   56:invokevirtual   #138 <Method boolean Drawable.setState(int[])>
	//   29   59:pop             
		drawable = mSplitBackground;
	//   30   60:aload_0         
	//   31   61:getfield        #89  <Field Drawable mSplitBackground>
	//   32   64:astore_1        
		if(drawable != null && drawable.isStateful())
	//*  33   65:aload_1         
	//*  34   66:ifnull          88
	//*  35   69:aload_1         
	//*  36   70:invokevirtual   #130 <Method boolean Drawable.isStateful()>
	//*  37   73:ifeq            88
			mSplitBackground.setState(getDrawableState());
	//   38   76:aload_0         
	//   39   77:getfield        #89  <Field Drawable mSplitBackground>
	//   40   80:aload_0         
	//   41   81:invokevirtual   #134 <Method int[] getDrawableState()>
	//   42   84:invokevirtual   #138 <Method boolean Drawable.setState(int[])>
	//   43   87:pop             
	//   44   88:return          
	}

	public View getTabContainer()
	{
		return mTabContainer;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field View mTabContainer>
	//    2    4:areturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void FrameLayout.jumpDrawablesToCurrentState()>
		Drawable drawable = mBackground;
	//    2    4:aload_0         
	//    3    5:getfield        #59  <Field Drawable mBackground>
	//    4    8:astore_1        
		if(drawable != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          17
			drawable.jumpToCurrentState();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #148 <Method void Drawable.jumpToCurrentState()>
		drawable = mStackedBackground;
	//    9   17:aload_0         
	//   10   18:getfield        #64  <Field Drawable mStackedBackground>
	//   11   21:astore_1        
		if(drawable != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          30
			drawable.jumpToCurrentState();
	//   14   26:aload_1         
	//   15   27:invokevirtual   #148 <Method void Drawable.jumpToCurrentState()>
		drawable = mSplitBackground;
	//   16   30:aload_0         
	//   17   31:getfield        #89  <Field Drawable mSplitBackground>
	//   18   34:astore_1        
		if(drawable != null)
	//*  19   35:aload_1         
	//*  20   36:ifnull          43
			drawable.jumpToCurrentState();
	//   21   39:aload_1         
	//   22   40:invokevirtual   #148 <Method void Drawable.jumpToCurrentState()>
	//   23   43:return          
	}

	public void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #151 <Method void FrameLayout.onFinishInflate()>
		mActionBarView = findViewById(android.support.v7.appcompat.R.id.action_bar);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getstatic       #154 <Field int android.support.v7.appcompat.R$id.action_bar>
	//    5    9:invokevirtual   #158 <Method View findViewById(int)>
	//    6   12:putfield        #160 <Field View mActionBarView>
		mContextView = findViewById(android.support.v7.appcompat.R.id.action_context_bar);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getstatic       #163 <Field int android.support.v7.appcompat.R$id.action_context_bar>
	//   10   20:invokevirtual   #158 <Method View findViewById(int)>
	//   11   23:putfield        #165 <Field View mContextView>
	//   12   26:return          
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		super.onHoverEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #169 <Method boolean FrameLayout.onHoverEvent(MotionEvent)>
	//    3    5:pop             
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		return mIsTransitioning || super.onInterceptTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field boolean mIsTransitioning>
	//    2    4:ifne            20
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #174 <Method boolean FrameLayout.onInterceptTouchEvent(MotionEvent)>
	//    6   12:ifeq            18
	//    7   15:goto            20
	//    8   18:iconst_0        
	//    9   19:ireturn         
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	public void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #178 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		Object obj = ((Object) (mTabContainer));
	//    7   11:aload_0         
	//    8   12:getfield        #142 <Field View mTabContainer>
	//    9   15:astore          7
		j = 1;
	//   10   17:iconst_1        
	//   11   18:istore_3        
		l = 0;
	//   12   19:iconst_0        
	//   13   20:istore          5
		if(obj != null && ((View) (obj)).getVisibility() != 8)
	//*  14   22:aload           7
	//*  15   24:ifnull          42
	//*  16   27:aload           7
	//*  17   29:invokevirtual   #121 <Method int View.getVisibility()>
	//*  18   32:bipush          8
	//*  19   34:icmpeq          42
			flag = true;
	//   20   37:iconst_1        
	//   21   38:istore_1        
		else
	//*  22   39:goto            44
			flag = false;
	//   23   42:iconst_0        
	//   24   43:istore_1        
		if(obj != null && ((View) (obj)).getVisibility() != 8)
	//*  25   44:aload           7
	//*  26   46:ifnull          105
	//*  27   49:aload           7
	//*  28   51:invokevirtual   #121 <Method int View.getVisibility()>
	//*  29   54:bipush          8
	//*  30   56:icmpeq          105
		{
			int i1 = getMeasuredHeight();
	//   31   59:aload_0         
	//   32   60:invokevirtual   #179 <Method int getMeasuredHeight()>
	//   33   63:istore          6
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)((View) (obj)).getLayoutParams();
	//   34   65:aload           7
	//   35   67:invokevirtual   #105 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   36   70:checkcast       #107 <Class android.widget.FrameLayout$LayoutParams>
	//   37   73:astore          8
			((View) (obj)).layout(i, i1 - ((View) (obj)).getMeasuredHeight() - layoutparams.bottomMargin, k, i1 - layoutparams.bottomMargin);
	//   38   75:aload           7
	//   39   77:iload_2         
	//   40   78:iload           6
	//   41   80:aload           7
	//   42   82:invokevirtual   #110 <Method int View.getMeasuredHeight()>
	//   43   85:isub            
	//   44   86:aload           8
	//   45   88:getfield        #116 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   46   91:isub            
	//   47   92:iload           4
	//   48   94:iload           6
	//   49   96:aload           8
	//   50   98:getfield        #116 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   51  101:isub            
	//   52  102:invokevirtual   #183 <Method void View.layout(int, int, int, int)>
		}
		if(mIsSplit)
	//*  53  105:aload_0         
	//*  54  106:getfield        #84  <Field boolean mIsSplit>
	//*  55  109:ifeq            148
		{
			obj = ((Object) (mSplitBackground));
	//   56  112:aload_0         
	//   57  113:getfield        #89  <Field Drawable mSplitBackground>
	//   58  116:astore          7
			if(obj != null)
	//*  59  118:aload           7
	//*  60  120:ifnull          143
			{
				((Drawable) (obj)).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//   61  123:aload           7
	//   62  125:iconst_0        
	//   63  126:iconst_0        
	//   64  127:aload_0         
	//   65  128:invokevirtual   #186 <Method int getMeasuredWidth()>
	//   66  131:aload_0         
	//   67  132:invokevirtual   #179 <Method int getMeasuredHeight()>
	//   68  135:invokevirtual   #189 <Method void Drawable.setBounds(int, int, int, int)>
				i = j;
	//   69  138:iload_3         
	//   70  139:istore_2        
			} else
	//*  71  140:goto            326
			{
				i = 0;
	//   72  143:iconst_0        
	//   73  144:istore_2        
			}
		} else
	//*  74  145:goto            326
		{
			i = l;
	//   75  148:iload           5
	//   76  150:istore_2        
			if(mBackground != null)
	//*  77  151:aload_0         
	//*  78  152:getfield        #59  <Field Drawable mBackground>
	//*  79  155:ifnull          276
			{
				if(mActionBarView.getVisibility() == 0)
	//*  80  158:aload_0         
	//*  81  159:getfield        #160 <Field View mActionBarView>
	//*  82  162:invokevirtual   #121 <Method int View.getVisibility()>
	//*  83  165:ifne            206
				{
					mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
	//   84  168:aload_0         
	//   85  169:getfield        #59  <Field Drawable mBackground>
	//   86  172:aload_0         
	//   87  173:getfield        #160 <Field View mActionBarView>
	//   88  176:invokevirtual   #192 <Method int View.getLeft()>
	//   89  179:aload_0         
	//   90  180:getfield        #160 <Field View mActionBarView>
	//   91  183:invokevirtual   #195 <Method int View.getTop()>
	//   92  186:aload_0         
	//   93  187:getfield        #160 <Field View mActionBarView>
	//   94  190:invokevirtual   #198 <Method int View.getRight()>
	//   95  193:aload_0         
	//   96  194:getfield        #160 <Field View mActionBarView>
	//   97  197:invokevirtual   #201 <Method int View.getBottom()>
	//   98  200:invokevirtual   #189 <Method void Drawable.setBounds(int, int, int, int)>
				} else
	//*  99  203:goto            274
				{
					View view = mContextView;
	//  100  206:aload_0         
	//  101  207:getfield        #165 <Field View mContextView>
	//  102  210:astore          8
					if(view != null && view.getVisibility() == 0)
	//* 103  212:aload           8
	//* 104  214:ifnull          263
	//* 105  217:aload           8
	//* 106  219:invokevirtual   #121 <Method int View.getVisibility()>
	//* 107  222:ifne            263
						mBackground.setBounds(mContextView.getLeft(), mContextView.getTop(), mContextView.getRight(), mContextView.getBottom());
	//  108  225:aload_0         
	//  109  226:getfield        #59  <Field Drawable mBackground>
	//  110  229:aload_0         
	//  111  230:getfield        #165 <Field View mContextView>
	//  112  233:invokevirtual   #192 <Method int View.getLeft()>
	//  113  236:aload_0         
	//  114  237:getfield        #165 <Field View mContextView>
	//  115  240:invokevirtual   #195 <Method int View.getTop()>
	//  116  243:aload_0         
	//  117  244:getfield        #165 <Field View mContextView>
	//  118  247:invokevirtual   #198 <Method int View.getRight()>
	//  119  250:aload_0         
	//  120  251:getfield        #165 <Field View mContextView>
	//  121  254:invokevirtual   #201 <Method int View.getBottom()>
	//  122  257:invokevirtual   #189 <Method void Drawable.setBounds(int, int, int, int)>
					else
	//* 123  260:goto            274
						mBackground.setBounds(0, 0, 0, 0);
	//  124  263:aload_0         
	//  125  264:getfield        #59  <Field Drawable mBackground>
	//  126  267:iconst_0        
	//  127  268:iconst_0        
	//  128  269:iconst_0        
	//  129  270:iconst_0        
	//  130  271:invokevirtual   #189 <Method void Drawable.setBounds(int, int, int, int)>
				}
				i = 1;
	//  131  274:iconst_1        
	//  132  275:istore_2        
			}
			mIsStacked = flag;
	//  133  276:aload_0         
	//  134  277:iload_1         
	//  135  278:putfield        #203 <Field boolean mIsStacked>
			if(flag)
	//* 136  281:iload_1         
	//* 137  282:ifeq            326
			{
				Drawable drawable = mStackedBackground;
	//  138  285:aload_0         
	//  139  286:getfield        #64  <Field Drawable mStackedBackground>
	//  140  289:astore          8
				if(drawable != null)
	//* 141  291:aload           8
	//* 142  293:ifnull          326
				{
					drawable.setBounds(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom());
	//  143  296:aload           8
	//  144  298:aload           7
	//  145  300:invokevirtual   #192 <Method int View.getLeft()>
	//  146  303:aload           7
	//  147  305:invokevirtual   #195 <Method int View.getTop()>
	//  148  308:aload           7
	//  149  310:invokevirtual   #198 <Method int View.getRight()>
	//  150  313:aload           7
	//  151  315:invokevirtual   #201 <Method int View.getBottom()>
	//  152  318:invokevirtual   #189 <Method void Drawable.setBounds(int, int, int, int)>
					i = j;
	//  153  321:iload_3         
	//  154  322:istore_2        
				}
			}
		}
	//* 155  323:goto            326
		if(i != 0)
	//* 156  326:iload_2         
	//* 157  327:ifeq            334
			invalidate();
	//  158  330:aload_0         
	//  159  331:invokevirtual   #206 <Method void invalidate()>
	//  160  334:return          
	}

	public void onMeasure(int i, int j)
	{
		int k = j;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(mActionBarView == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #160 <Field View mActionBarView>
	//*   4    6:ifnonnull       48
		{
			k = j;
	//    5    9:iload_2         
	//    6   10:istore_3        
			if(android.view.View.MeasureSpec.getMode(j) == 0x80000000)
	//*   7   11:iload_2         
	//*   8   12:invokestatic    #214 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   9   15:ldc1            #215 <Int 0x80000000>
	//*  10   17:icmpne          48
			{
				int l = mHeight;
	//   11   20:aload_0         
	//   12   21:getfield        #73  <Field int mHeight>
	//   13   24:istore          4
				k = j;
	//   14   26:iload_2         
	//   15   27:istore_3        
				if(l >= 0)
	//*  16   28:iload           4
	//*  17   30:iflt            48
					k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(l, android.view.View.MeasureSpec.getSize(j)), 0x80000000);
	//   18   33:iload           4
	//   19   35:iload_2         
	//   20   36:invokestatic    #218 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   21   39:invokestatic    #223 <Method int Math.min(int, int)>
	//   22   42:ldc1            #215 <Int 0x80000000>
	//   23   44:invokestatic    #226 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   24   47:istore_3        
			}
		}
		super.onMeasure(i, k);
	//   25   48:aload_0         
	//   26   49:iload_1         
	//   27   50:iload_3         
	//   28   51:invokespecial   #228 <Method void FrameLayout.onMeasure(int, int)>
		if(mActionBarView == null)
	//*  29   54:aload_0         
	//*  30   55:getfield        #160 <Field View mActionBarView>
	//*  31   58:ifnonnull       62
			return;
	//   32   61:return          
		j = android.view.View.MeasureSpec.getMode(k);
	//   33   62:iload_3         
	//   34   63:invokestatic    #214 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   35   66:istore_2        
		View view = mTabContainer;
	//   36   67:aload_0         
	//   37   68:getfield        #142 <Field View mTabContainer>
	//   38   71:astore          5
		if(view != null && view.getVisibility() != 8 && j != 0x40000000)
	//*  39   73:aload           5
	//*  40   75:ifnull          181
	//*  41   78:aload           5
	//*  42   80:invokevirtual   #121 <Method int View.getVisibility()>
	//*  43   83:bipush          8
	//*  44   85:icmpeq          181
	//*  45   88:iload_2         
	//*  46   89:ldc1            #229 <Int 0x40000000>
	//*  47   91:icmpeq          181
		{
			if(!isCollapsed(mActionBarView))
	//*  48   94:aload_0         
	//*  49   95:aload_0         
	//*  50   96:getfield        #160 <Field View mActionBarView>
	//*  51   99:invokespecial   #231 <Method boolean isCollapsed(View)>
	//*  52  102:ifne            117
				i = getMeasuredHeightWithMargins(mActionBarView);
	//   53  105:aload_0         
	//   54  106:aload_0         
	//   55  107:getfield        #160 <Field View mActionBarView>
	//   56  110:invokespecial   #233 <Method int getMeasuredHeightWithMargins(View)>
	//   57  113:istore_1        
			else
	//*  58  114:goto            142
			if(!isCollapsed(mContextView))
	//*  59  117:aload_0         
	//*  60  118:aload_0         
	//*  61  119:getfield        #165 <Field View mContextView>
	//*  62  122:invokespecial   #231 <Method boolean isCollapsed(View)>
	//*  63  125:ifne            140
				i = getMeasuredHeightWithMargins(mContextView);
	//   64  128:aload_0         
	//   65  129:aload_0         
	//   66  130:getfield        #165 <Field View mContextView>
	//   67  133:invokespecial   #233 <Method int getMeasuredHeightWithMargins(View)>
	//   68  136:istore_1        
			else
	//*  69  137:goto            142
				i = 0;
	//   70  140:iconst_0        
	//   71  141:istore_1        
			if(j == 0x80000000)
	//*  72  142:iload_2         
	//*  73  143:ldc1            #215 <Int 0x80000000>
	//*  74  145:icmpne          156
				j = android.view.View.MeasureSpec.getSize(k);
	//   75  148:iload_3         
	//   76  149:invokestatic    #218 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   77  152:istore_2        
			else
	//*  78  153:goto            159
				j = 0x7fffffff;
	//   79  156:ldc1            #234 <Int 0x7fffffff>
	//   80  158:istore_2        
			setMeasuredDimension(getMeasuredWidth(), Math.min(i + getMeasuredHeightWithMargins(mTabContainer), j));
	//   81  159:aload_0         
	//   82  160:aload_0         
	//   83  161:invokevirtual   #186 <Method int getMeasuredWidth()>
	//   84  164:iload_1         
	//   85  165:aload_0         
	//   86  166:aload_0         
	//   87  167:getfield        #142 <Field View mTabContainer>
	//   88  170:invokespecial   #233 <Method int getMeasuredHeightWithMargins(View)>
	//   89  173:iadd            
	//   90  174:iload_2         
	//   91  175:invokestatic    #223 <Method int Math.min(int, int)>
	//   92  178:invokevirtual   #237 <Method void setMeasuredDimension(int, int)>
		}
	//   93  181:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #240 <Method boolean FrameLayout.onTouchEvent(MotionEvent)>
	//    3    5:pop             
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public void setPrimaryBackground(Drawable drawable)
	{
		Drawable drawable1 = mBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field Drawable mBackground>
	//    2    4:astore          4
		if(drawable1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          25
		{
			drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5   11:aload           4
	//    6   13:aconst_null     
	//    7   14:invokevirtual   #246 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mBackground);
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:getfield        #59  <Field Drawable mBackground>
	//   11   22:invokevirtual   #249 <Method void unscheduleDrawable(Drawable)>
		}
		mBackground = drawable;
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:putfield        #59  <Field Drawable mBackground>
		if(drawable != null)
	//*  15   30:aload_1         
	//*  16   31:ifnull          80
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:invokevirtual   #246 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			drawable = ((Drawable) (mActionBarView));
	//   20   39:aload_0         
	//   21   40:getfield        #160 <Field View mActionBarView>
	//   22   43:astore_1        
			if(drawable != null)
	//*  23   44:aload_1         
	//*  24   45:ifnull          80
				mBackground.setBounds(((View) (drawable)).getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
	//   25   48:aload_0         
	//   26   49:getfield        #59  <Field Drawable mBackground>
	//   27   52:aload_1         
	//   28   53:invokevirtual   #192 <Method int View.getLeft()>
	//   29   56:aload_0         
	//   30   57:getfield        #160 <Field View mActionBarView>
	//   31   60:invokevirtual   #195 <Method int View.getTop()>
	//   32   63:aload_0         
	//   33   64:getfield        #160 <Field View mActionBarView>
	//   34   67:invokevirtual   #198 <Method int View.getRight()>
	//   35   70:aload_0         
	//   36   71:getfield        #160 <Field View mActionBarView>
	//   37   74:invokevirtual   #201 <Method int View.getBottom()>
	//   38   77:invokevirtual   #189 <Method void Drawable.setBounds(int, int, int, int)>
		}
		boolean flag1 = mIsSplit;
	//   39   80:aload_0         
	//   40   81:getfield        #84  <Field boolean mIsSplit>
	//   41   84:istore_3        
		boolean flag = true;
	//   42   85:iconst_1        
	//   43   86:istore_2        
		if(flag1 ? mSplitBackground != null : mBackground != null || mStackedBackground != null)
	//*  44   87:iload_3         
	//*  45   88:ifeq            101
	//*  46   91:aload_0         
	//*  47   92:getfield        #89  <Field Drawable mSplitBackground>
	//*  48   95:ifnonnull       118
	//*  49   98:goto            120
	//*  50  101:aload_0         
	//*  51  102:getfield        #59  <Field Drawable mBackground>
	//*  52  105:ifnonnull       118
	//*  53  108:aload_0         
	//*  54  109:getfield        #64  <Field Drawable mStackedBackground>
	//*  55  112:ifnonnull       118
	//*  56  115:goto            120
			flag = false;
	//   57  118:iconst_0        
	//   58  119:istore_2        
		setWillNotDraw(flag);
	//   59  120:aload_0         
	//   60  121:iload_2         
	//   61  122:invokevirtual   #97  <Method void setWillNotDraw(boolean)>
		invalidate();
	//   62  125:aload_0         
	//   63  126:invokevirtual   #206 <Method void invalidate()>
	//   64  129:return          
	}

	public void setSplitBackground(Drawable drawable)
	{
		boolean flag1;
		Drawable drawable1 = mSplitBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field Drawable mSplitBackground>
	//    2    4:astore          4
		if(drawable1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          25
		{
			drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5   11:aload           4
	//    6   13:aconst_null     
	//    7   14:invokevirtual   #246 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mSplitBackground);
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:getfield        #89  <Field Drawable mSplitBackground>
	//   11   22:invokevirtual   #249 <Method void unscheduleDrawable(Drawable)>
		}
		mSplitBackground = drawable;
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:putfield        #89  <Field Drawable mSplitBackground>
		flag1 = false;
	//   15   30:iconst_0        
	//   16   31:istore_3        
		if(drawable != null)
	//*  17   32:aload_1         
	//*  18   33:ifnull          71
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   19   36:aload_1         
	//   20   37:aload_0         
	//   21   38:invokevirtual   #246 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mIsSplit)
	//*  22   41:aload_0         
	//*  23   42:getfield        #84  <Field boolean mIsSplit>
	//*  24   45:ifeq            71
			{
				drawable = mSplitBackground;
	//   25   48:aload_0         
	//   26   49:getfield        #89  <Field Drawable mSplitBackground>
	//   27   52:astore_1        
				if(drawable != null)
	//*  28   53:aload_1         
	//*  29   54:ifnull          71
					drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//   30   57:aload_1         
	//   31   58:iconst_0        
	//   32   59:iconst_0        
	//   33   60:aload_0         
	//   34   61:invokevirtual   #186 <Method int getMeasuredWidth()>
	//   35   64:aload_0         
	//   36   65:invokevirtual   #179 <Method int getMeasuredHeight()>
	//   37   68:invokevirtual   #189 <Method void Drawable.setBounds(int, int, int, int)>
			}
		}
		if(!mIsSplit) goto _L2; else goto _L1
	//   38   71:aload_0         
	//   39   72:getfield        #84  <Field boolean mIsSplit>
	//   40   75:ifeq            92
_L1:
		boolean flag = flag1;
	//   41   78:iload_3         
	//   42   79:istore_2        
		if(mSplitBackground != null) goto _L4; else goto _L3
	//   43   80:aload_0         
	//   44   81:getfield        #89  <Field Drawable mSplitBackground>
	//   45   84:ifnonnull       113
_L3:
		flag = true;
	//   46   87:iconst_1        
	//   47   88:istore_2        
		break; /* Loop/switch isn't completed */
	//   48   89:goto            113
_L2:
		flag = flag1;
	//   49   92:iload_3         
	//   50   93:istore_2        
		if(mBackground != null)
			break; /* Loop/switch isn't completed */
	//   51   94:aload_0         
	//   52   95:getfield        #59  <Field Drawable mBackground>
	//   53   98:ifnonnull       113
		flag = flag1;
	//   54  101:iload_3         
	//   55  102:istore_2        
		if(mStackedBackground != null) goto _L4; else goto _L3
	//   56  103:aload_0         
	//   57  104:getfield        #64  <Field Drawable mStackedBackground>
	//   58  107:ifnonnull       113
	//*  59  110:goto            87
_L4:
		setWillNotDraw(flag);
	//   60  113:aload_0         
	//   61  114:iload_2         
	//   62  115:invokevirtual   #97  <Method void setWillNotDraw(boolean)>
		invalidate();
	//   63  118:aload_0         
	//   64  119:invokevirtual   #206 <Method void invalidate()>
		return;
	//   65  122:return          
	}

	public void setStackedBackground(Drawable drawable)
	{
		Drawable drawable1 = mStackedBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Drawable mStackedBackground>
	//    2    4:astore          4
		if(drawable1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          25
		{
			drawable1.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5   11:aload           4
	//    6   13:aconst_null     
	//    7   14:invokevirtual   #246 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mStackedBackground);
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:getfield        #64  <Field Drawable mStackedBackground>
	//   11   22:invokevirtual   #249 <Method void unscheduleDrawable(Drawable)>
		}
		mStackedBackground = drawable;
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:putfield        #64  <Field Drawable mStackedBackground>
		if(drawable != null)
	//*  15   30:aload_1         
	//*  16   31:ifnull          87
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:invokevirtual   #246 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mIsStacked)
	//*  20   39:aload_0         
	//*  21   40:getfield        #203 <Field boolean mIsStacked>
	//*  22   43:ifeq            87
			{
				drawable = mStackedBackground;
	//   23   46:aload_0         
	//   24   47:getfield        #64  <Field Drawable mStackedBackground>
	//   25   50:astore_1        
				if(drawable != null)
	//*  26   51:aload_1         
	//*  27   52:ifnull          87
					drawable.setBounds(mTabContainer.getLeft(), mTabContainer.getTop(), mTabContainer.getRight(), mTabContainer.getBottom());
	//   28   55:aload_1         
	//   29   56:aload_0         
	//   30   57:getfield        #142 <Field View mTabContainer>
	//   31   60:invokevirtual   #192 <Method int View.getLeft()>
	//   32   63:aload_0         
	//   33   64:getfield        #142 <Field View mTabContainer>
	//   34   67:invokevirtual   #195 <Method int View.getTop()>
	//   35   70:aload_0         
	//   36   71:getfield        #142 <Field View mTabContainer>
	//   37   74:invokevirtual   #198 <Method int View.getRight()>
	//   38   77:aload_0         
	//   39   78:getfield        #142 <Field View mTabContainer>
	//   40   81:invokevirtual   #201 <Method int View.getBottom()>
	//   41   84:invokevirtual   #189 <Method void Drawable.setBounds(int, int, int, int)>
			}
		}
		boolean flag1 = mIsSplit;
	//   42   87:aload_0         
	//   43   88:getfield        #84  <Field boolean mIsSplit>
	//   44   91:istore_3        
		boolean flag = true;
	//   45   92:iconst_1        
	//   46   93:istore_2        
		if(flag1 ? mSplitBackground != null : mBackground != null || mStackedBackground != null)
	//*  47   94:iload_3         
	//*  48   95:ifeq            108
	//*  49   98:aload_0         
	//*  50   99:getfield        #89  <Field Drawable mSplitBackground>
	//*  51  102:ifnonnull       125
	//*  52  105:goto            127
	//*  53  108:aload_0         
	//*  54  109:getfield        #59  <Field Drawable mBackground>
	//*  55  112:ifnonnull       125
	//*  56  115:aload_0         
	//*  57  116:getfield        #64  <Field Drawable mStackedBackground>
	//*  58  119:ifnonnull       125
	//*  59  122:goto            127
			flag = false;
	//   60  125:iconst_0        
	//   61  126:istore_2        
		setWillNotDraw(flag);
	//   62  127:aload_0         
	//   63  128:iload_2         
	//   64  129:invokevirtual   #97  <Method void setWillNotDraw(boolean)>
		invalidate();
	//   65  132:aload_0         
	//   66  133:invokevirtual   #206 <Method void invalidate()>
	//   67  136:return          
	}

	public void setTabContainer(ScrollingTabContainerView scrollingtabcontainerview)
	{
		View view = mTabContainer;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field View mTabContainer>
	//    2    4:astore_2        
		if(view != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			removeView(view);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #257 <Method void removeView(View)>
		mTabContainer = ((View) (scrollingtabcontainerview));
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #142 <Field View mTabContainer>
		if(scrollingtabcontainerview != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          49
		{
			addView(((View) (scrollingtabcontainerview)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #260 <Method void addView(View)>
			android.view.ViewGroup.LayoutParams layoutparams = scrollingtabcontainerview.getLayoutParams();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #263 <Method android.view.ViewGroup$LayoutParams ScrollingTabContainerView.getLayoutParams()>
	//   18   32:astore_2        
			layoutparams.width = -1;
	//   19   33:aload_2         
	//   20   34:iconst_m1       
	//   21   35:putfield        #268 <Field int android.view.ViewGroup$LayoutParams.width>
			layoutparams.height = -2;
	//   22   38:aload_2         
	//   23   39:bipush          -2
	//   24   41:putfield        #271 <Field int android.view.ViewGroup$LayoutParams.height>
			scrollingtabcontainerview.setAllowCollapse(false);
	//   25   44:aload_1         
	//   26   45:iconst_0        
	//   27   46:invokevirtual   #274 <Method void ScrollingTabContainerView.setAllowCollapse(boolean)>
		}
	//   28   49:return          
	}

	public void setTransitioning(boolean flag)
	{
		mIsTransitioning = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #172 <Field boolean mIsTransitioning>
		int i;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            16
			i = 0x60000;
	//    5    9:ldc2            #276 <Int 0x60000>
	//    6   12:istore_2        
		else
	//*   7   13:goto            20
			i = 0x40000;
	//    8   16:ldc2            #277 <Int 0x40000>
	//    9   19:istore_2        
		setDescendantFocusability(i);
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #281 <Method void setDescendantFocusability(int)>
	//   13   25:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #284 <Method void FrameLayout.setVisibility(int)>
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
		Drawable drawable = mBackground;
	//   10   16:aload_0         
	//   11   17:getfield        #59  <Field Drawable mBackground>
	//   12   20:astore_3        
		if(drawable != null)
	//*  13   21:aload_3         
	//*  14   22:ifnull          32
			drawable.setVisible(flag, false);
	//   15   25:aload_3         
	//   16   26:iload_2         
	//   17   27:iconst_0        
	//   18   28:invokevirtual   #288 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   19   31:pop             
		drawable = mStackedBackground;
	//   20   32:aload_0         
	//   21   33:getfield        #64  <Field Drawable mStackedBackground>
	//   22   36:astore_3        
		if(drawable != null)
	//*  23   37:aload_3         
	//*  24   38:ifnull          48
			drawable.setVisible(flag, false);
	//   25   41:aload_3         
	//   26   42:iload_2         
	//   27   43:iconst_0        
	//   28   44:invokevirtual   #288 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   29   47:pop             
		drawable = mSplitBackground;
	//   30   48:aload_0         
	//   31   49:getfield        #89  <Field Drawable mSplitBackground>
	//   32   52:astore_3        
		if(drawable != null)
	//*  33   53:aload_3         
	//*  34   54:ifnull          64
			drawable.setVisible(flag, false);
	//   35   57:aload_3         
	//   36   58:iload_2         
	//   37   59:iconst_0        
	//   38   60:invokevirtual   #288 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   39   63:pop             
	//   40   64:return          
	}

	public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback, int i)
	{
		if(i != 0)
	//*   0    0:iload_3         
	//*   1    1:ifeq            12
			return super.startActionModeForChild(view, callback, i);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #293 <Method ActionMode FrameLayout.startActionModeForChild(View, android.view.ActionMode$Callback, int)>
	//    7   11:areturn         
		else
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return drawable == mBackground && !mIsSplit || drawable == mStackedBackground && mIsStacked || drawable == mSplitBackground && mIsSplit || super.verifyDrawable(drawable);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #59  <Field Drawable mBackground>
	//    3    5:if_acmpne       15
	//    4    8:aload_0         
	//    5    9:getfield        #84  <Field boolean mIsSplit>
	//    6   12:ifeq            53
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #64  <Field Drawable mStackedBackground>
	//   10   20:if_acmpne       30
	//   11   23:aload_0         
	//   12   24:getfield        #203 <Field boolean mIsStacked>
	//   13   27:ifne            53
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #89  <Field Drawable mSplitBackground>
	//   17   35:if_acmpne       45
	//   18   38:aload_0         
	//   19   39:getfield        #84  <Field boolean mIsSplit>
	//   20   42:ifne            53
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokespecial   #297 <Method boolean FrameLayout.verifyDrawable(Drawable)>
	//   24   50:ifeq            55
	//   25   53:iconst_1        
	//   26   54:ireturn         
	//   27   55:iconst_0        
	//   28   56:ireturn         
	}

	private View mActionBarView;
	Drawable mBackground;
	private View mContextView;
	private int mHeight;
	boolean mIsSplit;
	boolean mIsStacked;
	private boolean mIsTransitioning;
	Drawable mSplitBackground;
	Drawable mStackedBackground;
	private View mTabContainer;
}
