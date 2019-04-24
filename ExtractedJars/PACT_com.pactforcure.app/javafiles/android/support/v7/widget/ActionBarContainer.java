// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.widget:
//			ActionBarBackgroundDrawableV21, ActionBarBackgroundDrawable, ScrollingTabContainerView

public class ActionBarContainer extends FrameLayout
{

	public ActionBarContainer(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #27  <Method void ActionBarContainer(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionBarContainer(Context context, AttributeSet attributeset)
	{
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		super(context, attributeset);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokespecial   #29  <Method void FrameLayout(Context, AttributeSet)>
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6    8:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   11:bipush          21
	//*   8   13:icmplt          125
			obj = ((Object) (new ActionBarBackgroundDrawableV21(this)));
	//    9   16:new             #36  <Class ActionBarBackgroundDrawableV21>
	//   10   19:dup             
	//   11   20:aload_0         
	//   12   21:invokespecial   #39  <Method void ActionBarBackgroundDrawableV21(ActionBarContainer)>
	//   13   24:astore          4
		else
	//*  14   26:aload_0         
	//*  15   27:aload           4
	//*  16   29:invokestatic    #45  <Method void ViewCompat.setBackground(View, Drawable)>
	//*  17   32:aload_1         
	//*  18   33:aload_2         
	//*  19   34:getstatic       #51  <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//*  20   37:invokevirtual   #57  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//*  21   40:astore_1        
	//*  22   41:aload_0         
	//*  23   42:aload_1         
	//*  24   43:getstatic       #60  <Field int android.support.v7.appcompat.R$styleable.ActionBar_background>
	//*  25   46:invokevirtual   #66  <Method Drawable TypedArray.getDrawable(int)>
	//*  26   49:putfield        #68  <Field Drawable mBackground>
	//*  27   52:aload_0         
	//*  28   53:aload_1         
	//*  29   54:getstatic       #71  <Field int android.support.v7.appcompat.R$styleable.ActionBar_backgroundStacked>
	//*  30   57:invokevirtual   #66  <Method Drawable TypedArray.getDrawable(int)>
	//*  31   60:putfield        #73  <Field Drawable mStackedBackground>
	//*  32   63:aload_0         
	//*  33   64:aload_1         
	//*  34   65:getstatic       #76  <Field int android.support.v7.appcompat.R$styleable.ActionBar_height>
	//*  35   68:iconst_m1       
	//*  36   69:invokevirtual   #80  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//*  37   72:putfield        #82  <Field int mHeight>
	//*  38   75:aload_0         
	//*  39   76:invokevirtual   #86  <Method int getId()>
	//*  40   79:getstatic       #91  <Field int android.support.v7.appcompat.R$id.split_action_bar>
	//*  41   82:icmpne          101
	//*  42   85:aload_0         
	//*  43   86:iconst_1        
	//*  44   87:putfield        #93  <Field boolean mIsSplit>
	//*  45   90:aload_0         
	//*  46   91:aload_1         
	//*  47   92:getstatic       #96  <Field int android.support.v7.appcompat.R$styleable.ActionBar_backgroundSplit>
	//*  48   95:invokevirtual   #66  <Method Drawable TypedArray.getDrawable(int)>
	//*  49   98:putfield        #98  <Field Drawable mSplitBackground>
	//*  50  101:aload_1         
	//*  51  102:invokevirtual   #102 <Method void TypedArray.recycle()>
	//*  52  105:aload_0         
	//*  53  106:getfield        #93  <Field boolean mIsSplit>
	//*  54  109:ifeq            143
	//*  55  112:aload_0         
	//*  56  113:getfield        #98  <Field Drawable mSplitBackground>
	//*  57  116:ifnonnull       138
	//*  58  119:aload_0         
	//*  59  120:iload_3         
	//*  60  121:invokevirtual   #106 <Method void setWillNotDraw(boolean)>
	//*  61  124:return          
			obj = ((Object) (new ActionBarBackgroundDrawable(this)));
	//   62  125:new             #108 <Class ActionBarBackgroundDrawable>
	//   63  128:dup             
	//   64  129:aload_0         
	//   65  130:invokespecial   #109 <Method void ActionBarBackgroundDrawable(ActionBarContainer)>
	//   66  133:astore          4
		ViewCompat.setBackground(((View) (this)), ((Drawable) (obj)));
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar)));
		mBackground = ((TypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_background);
		mStackedBackground = ((TypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_backgroundStacked);
		mHeight = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_height, -1);
		if(getId() == android.support.v7.appcompat.R.id.split_action_bar)
		{
			mIsSplit = true;
			mSplitBackground = ((TypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_backgroundSplit);
		}
		((TypedArray) (context)).recycle();
		if(!mIsSplit) goto _L2; else goto _L1
_L1:
		if(mSplitBackground != null)
	//*  67  135:goto            26
			flag = false;
	//   68  138:iconst_0        
	//   69  139:istore_3        
_L4:
		setWillNotDraw(flag);
		return;
	//*  70  140:goto            119
_L2:
		if(mBackground != null || mStackedBackground != null)
	//*  71  143:aload_0         
	//*  72  144:getfield        #68  <Field Drawable mBackground>
	//*  73  147:ifnonnull       157
	//*  74  150:aload_0         
	//*  75  151:getfield        #73  <Field Drawable mStackedBackground>
	//*  76  154:ifnull          119
			flag = false;
	//   77  157:iconst_0        
	//   78  158:istore_3        
		if(true) goto _L4; else goto _L3
	//   79  159:goto            119
_L3:
	}

	private int getMeasuredHeightWithMargins(View view)
	{
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #117 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #119 <Class android.widget.FrameLayout$LayoutParams>
	//    3    7:astore_2        
		return view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #122 <Method int View.getMeasuredHeight()>
	//    6   12:aload_2         
	//    7   13:getfield        #125 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//    8   16:iadd            
	//    9   17:aload_2         
	//   10   18:getfield        #128 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   11   21:iadd            
	//   12   22:ireturn         
	}

	private boolean isCollapsed(View view)
	{
		return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method int View.getVisibility()>
	//    4    8:bipush          8
	//    5   10:icmpeq          20
	//    6   13:aload_1         
	//    7   14:invokevirtual   #122 <Method int View.getMeasuredHeight()>
	//    8   17:ifne            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #136 <Method void FrameLayout.drawableStateChanged()>
		if(mBackground != null && mBackground.isStateful())
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field Drawable mBackground>
	//*   4    8:ifnull          33
	//*   5   11:aload_0         
	//*   6   12:getfield        #68  <Field Drawable mBackground>
	//*   7   15:invokevirtual   #142 <Method boolean Drawable.isStateful()>
	//*   8   18:ifeq            33
			mBackground.setState(getDrawableState());
	//    9   21:aload_0         
	//   10   22:getfield        #68  <Field Drawable mBackground>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #146 <Method int[] getDrawableState()>
	//   13   29:invokevirtual   #150 <Method boolean Drawable.setState(int[])>
	//   14   32:pop             
		if(mStackedBackground != null && mStackedBackground.isStateful())
	//*  15   33:aload_0         
	//*  16   34:getfield        #73  <Field Drawable mStackedBackground>
	//*  17   37:ifnull          62
	//*  18   40:aload_0         
	//*  19   41:getfield        #73  <Field Drawable mStackedBackground>
	//*  20   44:invokevirtual   #142 <Method boolean Drawable.isStateful()>
	//*  21   47:ifeq            62
			mStackedBackground.setState(getDrawableState());
	//   22   50:aload_0         
	//   23   51:getfield        #73  <Field Drawable mStackedBackground>
	//   24   54:aload_0         
	//   25   55:invokevirtual   #146 <Method int[] getDrawableState()>
	//   26   58:invokevirtual   #150 <Method boolean Drawable.setState(int[])>
	//   27   61:pop             
		if(mSplitBackground != null && mSplitBackground.isStateful())
	//*  28   62:aload_0         
	//*  29   63:getfield        #98  <Field Drawable mSplitBackground>
	//*  30   66:ifnull          91
	//*  31   69:aload_0         
	//*  32   70:getfield        #98  <Field Drawable mSplitBackground>
	//*  33   73:invokevirtual   #142 <Method boolean Drawable.isStateful()>
	//*  34   76:ifeq            91
			mSplitBackground.setState(getDrawableState());
	//   35   79:aload_0         
	//   36   80:getfield        #98  <Field Drawable mSplitBackground>
	//   37   83:aload_0         
	//   38   84:invokevirtual   #146 <Method int[] getDrawableState()>
	//   39   87:invokevirtual   #150 <Method boolean Drawable.setState(int[])>
	//   40   90:pop             
	//   41   91:return          
	}

	public View getTabContainer()
	{
		return mTabContainer;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field View mTabContainer>
	//    2    4:areturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void FrameLayout.jumpDrawablesToCurrentState()>
		if(mBackground != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #68  <Field Drawable mBackground>
	//*   4    8:ifnull          18
			mBackground.jumpToCurrentState();
	//    5   11:aload_0         
	//    6   12:getfield        #68  <Field Drawable mBackground>
	//    7   15:invokevirtual   #160 <Method void Drawable.jumpToCurrentState()>
		if(mStackedBackground != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #73  <Field Drawable mStackedBackground>
	//*  10   22:ifnull          32
			mStackedBackground.jumpToCurrentState();
	//   11   25:aload_0         
	//   12   26:getfield        #73  <Field Drawable mStackedBackground>
	//   13   29:invokevirtual   #160 <Method void Drawable.jumpToCurrentState()>
		if(mSplitBackground != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #98  <Field Drawable mSplitBackground>
	//*  16   36:ifnull          46
			mSplitBackground.jumpToCurrentState();
	//   17   39:aload_0         
	//   18   40:getfield        #98  <Field Drawable mSplitBackground>
	//   19   43:invokevirtual   #160 <Method void Drawable.jumpToCurrentState()>
	//   20   46:return          
	}

	public void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method void FrameLayout.onFinishInflate()>
		mActionBarView = findViewById(android.support.v7.appcompat.R.id.action_bar);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getstatic       #166 <Field int android.support.v7.appcompat.R$id.action_bar>
	//    5    9:invokevirtual   #170 <Method View findViewById(int)>
	//    6   12:putfield        #172 <Field View mActionBarView>
		mContextView = findViewById(android.support.v7.appcompat.R.id.action_context_bar);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getstatic       #175 <Field int android.support.v7.appcompat.R$id.action_context_bar>
	//   10   20:invokevirtual   #170 <Method View findViewById(int)>
	//   11   23:putfield        #177 <Field View mContextView>
	//   12   26:return          
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		super.onHoverEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #181 <Method boolean FrameLayout.onHoverEvent(MotionEvent)>
	//    3    5:pop             
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		return mIsTransitioning || super.onInterceptTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #184 <Field boolean mIsTransitioning>
	//    2    4:ifne            15
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #186 <Method boolean FrameLayout.onInterceptTouchEvent(MotionEvent)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void onLayout(boolean flag, int i, int j, int k, int l)
	{
		View view;
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #190 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		view = mTabContainer;
	//    7   11:aload_0         
	//    8   12:getfield        #154 <Field View mTabContainer>
	//    9   15:astore          6
		if(view != null && view.getVisibility() != 8)
	//*  10   17:aload           6
	//*  11   19:ifnull          138
	//*  12   22:aload           6
	//*  13   24:invokevirtual   #133 <Method int View.getVisibility()>
	//*  14   27:bipush          8
	//*  15   29:icmpeq          138
			flag = true;
	//   16   32:iconst_1        
	//   17   33:istore_1        
		else
	//*  18   34:aload           6
	//*  19   36:ifnull          92
	//*  20   39:aload           6
	//*  21   41:invokevirtual   #133 <Method int View.getVisibility()>
	//*  22   44:bipush          8
	//*  23   46:icmpeq          92
	//*  24   49:aload_0         
	//*  25   50:invokevirtual   #191 <Method int getMeasuredHeight()>
	//*  26   53:istore_3        
	//*  27   54:aload           6
	//*  28   56:invokevirtual   #117 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  29   59:checkcast       #119 <Class android.widget.FrameLayout$LayoutParams>
	//*  30   62:astore          7
	//*  31   64:aload           6
	//*  32   66:iload_2         
	//*  33   67:iload_3         
	//*  34   68:aload           6
	//*  35   70:invokevirtual   #122 <Method int View.getMeasuredHeight()>
	//*  36   73:isub            
	//*  37   74:aload           7
	//*  38   76:getfield        #128 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//*  39   79:isub            
	//*  40   80:iload           4
	//*  41   82:iload_3         
	//*  42   83:aload           7
	//*  43   85:getfield        #128 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//*  44   88:isub            
	//*  45   89:invokevirtual   #195 <Method void View.layout(int, int, int, int)>
	//*  46   92:iconst_0        
	//*  47   93:istore_3        
	//*  48   94:iconst_0        
	//*  49   95:istore_2        
	//*  50   96:aload_0         
	//*  51   97:getfield        #93  <Field boolean mIsSplit>
	//*  52  100:ifeq            143
	//*  53  103:aload_0         
	//*  54  104:getfield        #98  <Field Drawable mSplitBackground>
	//*  55  107:ifnull          129
	//*  56  110:aload_0         
	//*  57  111:getfield        #98  <Field Drawable mSplitBackground>
	//*  58  114:iconst_0        
	//*  59  115:iconst_0        
	//*  60  116:aload_0         
	//*  61  117:invokevirtual   #198 <Method int getMeasuredWidth()>
	//*  62  120:aload_0         
	//*  63  121:invokevirtual   #191 <Method int getMeasuredHeight()>
	//*  64  124:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
	//*  65  127:iconst_1        
	//*  66  128:istore_2        
	//*  67  129:iload_2         
	//*  68  130:ifeq            137
	//*  69  133:aload_0         
	//*  70  134:invokevirtual   #204 <Method void invalidate()>
	//*  71  137:return          
			flag = false;
	//   72  138:iconst_0        
	//   73  139:istore_1        
		if(view != null && view.getVisibility() != 8)
		{
			j = getMeasuredHeight();
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
			view.layout(i, j - view.getMeasuredHeight() - layoutparams.bottomMargin, k, j - layoutparams.bottomMargin);
		}
		j = 0;
		i = 0;
		if(!mIsSplit) goto _L2; else goto _L1
_L1:
		if(mSplitBackground != null)
		{
			mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
			i = 1;
		}
_L4:
		if(i != 0)
			invalidate();
		return;
	//*  74  140:goto            34
_L2:
		if(mBackground != null)
	//*  75  143:aload_0         
	//*  76  144:getfield        #68  <Field Drawable mBackground>
	//*  77  147:ifnull          197
		{
			if(mActionBarView.getVisibility() == 0)
	//*  78  150:aload_0         
	//*  79  151:getfield        #172 <Field View mActionBarView>
	//*  80  154:invokevirtual   #133 <Method int View.getVisibility()>
	//*  81  157:ifne            249
				mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
	//   82  160:aload_0         
	//   83  161:getfield        #68  <Field Drawable mBackground>
	//   84  164:aload_0         
	//   85  165:getfield        #172 <Field View mActionBarView>
	//   86  168:invokevirtual   #207 <Method int View.getLeft()>
	//   87  171:aload_0         
	//   88  172:getfield        #172 <Field View mActionBarView>
	//   89  175:invokevirtual   #210 <Method int View.getTop()>
	//   90  178:aload_0         
	//   91  179:getfield        #172 <Field View mActionBarView>
	//   92  182:invokevirtual   #213 <Method int View.getRight()>
	//   93  185:aload_0         
	//   94  186:getfield        #172 <Field View mActionBarView>
	//   95  189:invokevirtual   #216 <Method int View.getBottom()>
	//   96  192:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
			else
	//*  97  195:iconst_1        
	//*  98  196:istore_3        
	//*  99  197:aload_0         
	//* 100  198:iload_1         
	//* 101  199:putfield        #218 <Field boolean mIsStacked>
	//* 102  202:iload_3         
	//* 103  203:istore_2        
	//* 104  204:iload_1         
	//* 105  205:ifeq            129
	//* 106  208:iload_3         
	//* 107  209:istore_2        
	//* 108  210:aload_0         
	//* 109  211:getfield        #73  <Field Drawable mStackedBackground>
	//* 110  214:ifnull          129
	//* 111  217:aload_0         
	//* 112  218:getfield        #73  <Field Drawable mStackedBackground>
	//* 113  221:aload           6
	//* 114  223:invokevirtual   #207 <Method int View.getLeft()>
	//* 115  226:aload           6
	//* 116  228:invokevirtual   #210 <Method int View.getTop()>
	//* 117  231:aload           6
	//* 118  233:invokevirtual   #213 <Method int View.getRight()>
	//* 119  236:aload           6
	//* 120  238:invokevirtual   #216 <Method int View.getBottom()>
	//* 121  241:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
	//* 122  244:iconst_1        
	//* 123  245:istore_2        
	//* 124  246:goto            129
			if(mContextView != null && mContextView.getVisibility() == 0)
	//* 125  249:aload_0         
	//* 126  250:getfield        #177 <Field View mContextView>
	//* 127  253:ifnull          304
	//* 128  256:aload_0         
	//* 129  257:getfield        #177 <Field View mContextView>
	//* 130  260:invokevirtual   #133 <Method int View.getVisibility()>
	//* 131  263:ifne            304
				mBackground.setBounds(mContextView.getLeft(), mContextView.getTop(), mContextView.getRight(), mContextView.getBottom());
	//  132  266:aload_0         
	//  133  267:getfield        #68  <Field Drawable mBackground>
	//  134  270:aload_0         
	//  135  271:getfield        #177 <Field View mContextView>
	//  136  274:invokevirtual   #207 <Method int View.getLeft()>
	//  137  277:aload_0         
	//  138  278:getfield        #177 <Field View mContextView>
	//  139  281:invokevirtual   #210 <Method int View.getTop()>
	//  140  284:aload_0         
	//  141  285:getfield        #177 <Field View mContextView>
	//  142  288:invokevirtual   #213 <Method int View.getRight()>
	//  143  291:aload_0         
	//  144  292:getfield        #177 <Field View mContextView>
	//  145  295:invokevirtual   #216 <Method int View.getBottom()>
	//  146  298:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
			else
	//* 147  301:goto            195
				mBackground.setBounds(0, 0, 0, 0);
	//  148  304:aload_0         
	//  149  305:getfield        #68  <Field Drawable mBackground>
	//  150  308:iconst_0        
	//  151  309:iconst_0        
	//  152  310:iconst_0        
	//  153  311:iconst_0        
	//  154  312:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
			j = 1;
		}
		mIsStacked = flag;
		i = j;
		if(flag)
		{
			i = j;
			if(mStackedBackground != null)
			{
				mStackedBackground.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
				i = 1;
			}
		}
		if(true) goto _L4; else goto _L3
_L3:
	//* 155  315:goto            195
	}

	public void onMeasure(int i, int j)
	{
		int k = j;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(mActionBarView == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #172 <Field View mActionBarView>
	//*   4    6:ifnonnull       46
		{
			k = j;
	//    5    9:iload_2         
	//    6   10:istore_3        
			if(android.view.View.MeasureSpec.getMode(j) == 0x80000000)
	//*   7   11:iload_2         
	//*   8   12:invokestatic    #226 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   9   15:ldc1            #227 <Int 0x80000000>
	//*  10   17:icmpne          46
			{
				k = j;
	//   11   20:iload_2         
	//   12   21:istore_3        
				if(mHeight >= 0)
	//*  13   22:aload_0         
	//*  14   23:getfield        #82  <Field int mHeight>
	//*  15   26:iflt            46
					k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(mHeight, android.view.View.MeasureSpec.getSize(j)), 0x80000000);
	//   16   29:aload_0         
	//   17   30:getfield        #82  <Field int mHeight>
	//   18   33:iload_2         
	//   19   34:invokestatic    #230 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   20   37:invokestatic    #235 <Method int Math.min(int, int)>
	//   21   40:ldc1            #227 <Int 0x80000000>
	//   22   42:invokestatic    #238 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   45:istore_3        
			}
		}
		super.onMeasure(i, k);
	//   24   46:aload_0         
	//   25   47:iload_1         
	//   26   48:iload_3         
	//   27   49:invokespecial   #240 <Method void FrameLayout.onMeasure(int, int)>
		if(mActionBarView != null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #172 <Field View mActionBarView>
	//*  30   56:ifnonnull       60
	//*  31   59:return          
		{
			j = android.view.View.MeasureSpec.getMode(k);
	//   32   60:iload_3         
	//   33   61:invokestatic    #226 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   34   64:istore_2        
			if(mTabContainer != null && mTabContainer.getVisibility() != 8 && j != 0x40000000)
	//*  35   65:aload_0         
	//*  36   66:getfield        #154 <Field View mTabContainer>
	//*  37   69:ifnull          59
	//*  38   72:aload_0         
	//*  39   73:getfield        #154 <Field View mTabContainer>
	//*  40   76:invokevirtual   #133 <Method int View.getVisibility()>
	//*  41   79:bipush          8
	//*  42   81:icmpeq          59
	//*  43   84:iload_2         
	//*  44   85:ldc1            #241 <Int 0x40000000>
	//*  45   87:icmpeq          59
			{
				if(!isCollapsed(mActionBarView))
	//*  46   90:aload_0         
	//*  47   91:aload_0         
	//*  48   92:getfield        #172 <Field View mActionBarView>
	//*  49   95:invokespecial   #243 <Method boolean isCollapsed(View)>
	//*  50   98:ifne            144
					i = getMeasuredHeightWithMargins(mActionBarView);
	//   51  101:aload_0         
	//   52  102:aload_0         
	//   53  103:getfield        #172 <Field View mActionBarView>
	//   54  106:invokespecial   #245 <Method int getMeasuredHeightWithMargins(View)>
	//   55  109:istore_1        
				else
	//*  56  110:iload_2         
	//*  57  111:ldc1            #227 <Int 0x80000000>
	//*  58  113:icmpne          172
	//*  59  116:iload_3         
	//*  60  117:invokestatic    #230 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  61  120:istore_2        
	//*  62  121:aload_0         
	//*  63  122:aload_0         
	//*  64  123:invokevirtual   #198 <Method int getMeasuredWidth()>
	//*  65  126:aload_0         
	//*  66  127:aload_0         
	//*  67  128:getfield        #154 <Field View mTabContainer>
	//*  68  131:invokespecial   #245 <Method int getMeasuredHeightWithMargins(View)>
	//*  69  134:iload_1         
	//*  70  135:iadd            
	//*  71  136:iload_2         
	//*  72  137:invokestatic    #235 <Method int Math.min(int, int)>
	//*  73  140:invokevirtual   #248 <Method void setMeasuredDimension(int, int)>
	//*  74  143:return          
				if(!isCollapsed(mContextView))
	//*  75  144:aload_0         
	//*  76  145:aload_0         
	//*  77  146:getfield        #177 <Field View mContextView>
	//*  78  149:invokespecial   #243 <Method boolean isCollapsed(View)>
	//*  79  152:ifne            167
					i = getMeasuredHeightWithMargins(mContextView);
	//   80  155:aload_0         
	//   81  156:aload_0         
	//   82  157:getfield        #177 <Field View mContextView>
	//   83  160:invokespecial   #245 <Method int getMeasuredHeightWithMargins(View)>
	//   84  163:istore_1        
				else
	//*  85  164:goto            110
					i = 0;
	//   86  167:iconst_0        
	//   87  168:istore_1        
				if(j == 0x80000000)
					j = android.view.View.MeasureSpec.getSize(k);
				else
	//*  88  169:goto            110
					j = 0x7fffffff;
	//   89  172:ldc1            #249 <Int 0x7fffffff>
	//   90  174:istore_2        
				setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeightWithMargins(mTabContainer) + i, j));
				return;
			}
		}
	//*  91  175:goto            121
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #252 <Method boolean FrameLayout.onTouchEvent(MotionEvent)>
	//    3    5:pop             
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public void setPrimaryBackground(Drawable drawable)
	{
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(mBackground != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #68  <Field Drawable mBackground>
	//*   4    6:ifnull          25
		{
			mBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #68  <Field Drawable mBackground>
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mBackground);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #68  <Field Drawable mBackground>
	//   12   22:invokevirtual   #261 <Method void unscheduleDrawable(Drawable)>
		}
		mBackground = drawable;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #68  <Field Drawable mBackground>
		if(drawable != null)
	//*  16   30:aload_1         
	//*  17   31:ifnull          81
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mActionBarView != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #172 <Field View mActionBarView>
	//*  23   43:ifnull          81
				mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
	//   24   46:aload_0         
	//   25   47:getfield        #68  <Field Drawable mBackground>
	//   26   50:aload_0         
	//   27   51:getfield        #172 <Field View mActionBarView>
	//   28   54:invokevirtual   #207 <Method int View.getLeft()>
	//   29   57:aload_0         
	//   30   58:getfield        #172 <Field View mActionBarView>
	//   31   61:invokevirtual   #210 <Method int View.getTop()>
	//   32   64:aload_0         
	//   33   65:getfield        #172 <Field View mActionBarView>
	//   34   68:invokevirtual   #213 <Method int View.getRight()>
	//   35   71:aload_0         
	//   36   72:getfield        #172 <Field View mActionBarView>
	//   37   75:invokevirtual   #216 <Method int View.getBottom()>
	//   38   78:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
		}
		if(!mIsSplit) goto _L2; else goto _L1
	//   39   81:aload_0         
	//   40   82:getfield        #93  <Field boolean mIsSplit>
	//   41   85:ifeq            110
_L1:
		if(mSplitBackground != null)
	//*  42   88:aload_0         
	//*  43   89:getfield        #98  <Field Drawable mSplitBackground>
	//*  44   92:ifnonnull       105
	//*  45   95:aload_0         
	//*  46   96:iload_2         
	//*  47   97:invokevirtual   #106 <Method void setWillNotDraw(boolean)>
	//*  48  100:aload_0         
	//*  49  101:invokevirtual   #204 <Method void invalidate()>
	//*  50  104:return          
			flag = false;
	//   51  105:iconst_0        
	//   52  106:istore_2        
_L4:
		setWillNotDraw(flag);
		invalidate();
		return;
	//*  53  107:goto            95
_L2:
		if(mBackground != null || mStackedBackground != null)
	//*  54  110:aload_0         
	//*  55  111:getfield        #68  <Field Drawable mBackground>
	//*  56  114:ifnonnull       124
	//*  57  117:aload_0         
	//*  58  118:getfield        #73  <Field Drawable mStackedBackground>
	//*  59  121:ifnull          95
			flag = false;
	//   60  124:iconst_0        
	//   61  125:istore_2        
		if(true) goto _L4; else goto _L3
	//   62  126:goto            95
_L3:
	}

	public void setSplitBackground(Drawable drawable)
	{
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(mSplitBackground != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #98  <Field Drawable mSplitBackground>
	//*   4    6:ifnull          25
		{
			mSplitBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #98  <Field Drawable mSplitBackground>
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mSplitBackground);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #98  <Field Drawable mSplitBackground>
	//   12   22:invokevirtual   #261 <Method void unscheduleDrawable(Drawable)>
		}
		mSplitBackground = drawable;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #98  <Field Drawable mSplitBackground>
		if(drawable != null)
	//*  16   30:aload_1         
	//*  17   31:ifnull          70
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mIsSplit && mSplitBackground != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #93  <Field boolean mIsSplit>
	//*  23   43:ifeq            70
	//*  24   46:aload_0         
	//*  25   47:getfield        #98  <Field Drawable mSplitBackground>
	//*  26   50:ifnull          70
				mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//   27   53:aload_0         
	//   28   54:getfield        #98  <Field Drawable mSplitBackground>
	//   29   57:iconst_0        
	//   30   58:iconst_0        
	//   31   59:aload_0         
	//   32   60:invokevirtual   #198 <Method int getMeasuredWidth()>
	//   33   63:aload_0         
	//   34   64:invokevirtual   #191 <Method int getMeasuredHeight()>
	//   35   67:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
		}
		if(!mIsSplit) goto _L2; else goto _L1
	//   36   70:aload_0         
	//   37   71:getfield        #93  <Field boolean mIsSplit>
	//   38   74:ifeq            99
_L1:
		if(mSplitBackground != null)
	//*  39   77:aload_0         
	//*  40   78:getfield        #98  <Field Drawable mSplitBackground>
	//*  41   81:ifnonnull       94
	//*  42   84:aload_0         
	//*  43   85:iload_2         
	//*  44   86:invokevirtual   #106 <Method void setWillNotDraw(boolean)>
	//*  45   89:aload_0         
	//*  46   90:invokevirtual   #204 <Method void invalidate()>
	//*  47   93:return          
			flag = false;
	//   48   94:iconst_0        
	//   49   95:istore_2        
_L4:
		setWillNotDraw(flag);
		invalidate();
		return;
	//*  50   96:goto            84
_L2:
		if(mBackground != null || mStackedBackground != null)
	//*  51   99:aload_0         
	//*  52  100:getfield        #68  <Field Drawable mBackground>
	//*  53  103:ifnonnull       113
	//*  54  106:aload_0         
	//*  55  107:getfield        #73  <Field Drawable mStackedBackground>
	//*  56  110:ifnull          84
			flag = false;
	//   57  113:iconst_0        
	//   58  114:istore_2        
		if(true) goto _L4; else goto _L3
	//   59  115:goto            84
_L3:
	}

	public void setStackedBackground(Drawable drawable)
	{
		boolean flag;
		flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(mStackedBackground != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #73  <Field Drawable mStackedBackground>
	//*   4    6:ifnull          25
		{
			mStackedBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #73  <Field Drawable mStackedBackground>
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mStackedBackground);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #73  <Field Drawable mStackedBackground>
	//   12   22:invokevirtual   #261 <Method void unscheduleDrawable(Drawable)>
		}
		mStackedBackground = drawable;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #73  <Field Drawable mStackedBackground>
		if(drawable != null)
	//*  16   30:aload_1         
	//*  17   31:ifnull          88
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mIsStacked && mStackedBackground != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #218 <Field boolean mIsStacked>
	//*  23   43:ifeq            88
	//*  24   46:aload_0         
	//*  25   47:getfield        #73  <Field Drawable mStackedBackground>
	//*  26   50:ifnull          88
				mStackedBackground.setBounds(mTabContainer.getLeft(), mTabContainer.getTop(), mTabContainer.getRight(), mTabContainer.getBottom());
	//   27   53:aload_0         
	//   28   54:getfield        #73  <Field Drawable mStackedBackground>
	//   29   57:aload_0         
	//   30   58:getfield        #154 <Field View mTabContainer>
	//   31   61:invokevirtual   #207 <Method int View.getLeft()>
	//   32   64:aload_0         
	//   33   65:getfield        #154 <Field View mTabContainer>
	//   34   68:invokevirtual   #210 <Method int View.getTop()>
	//   35   71:aload_0         
	//   36   72:getfield        #154 <Field View mTabContainer>
	//   37   75:invokevirtual   #213 <Method int View.getRight()>
	//   38   78:aload_0         
	//   39   79:getfield        #154 <Field View mTabContainer>
	//   40   82:invokevirtual   #216 <Method int View.getBottom()>
	//   41   85:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
		}
		if(!mIsSplit) goto _L2; else goto _L1
	//   42   88:aload_0         
	//   43   89:getfield        #93  <Field boolean mIsSplit>
	//   44   92:ifeq            117
_L1:
		if(mSplitBackground != null)
	//*  45   95:aload_0         
	//*  46   96:getfield        #98  <Field Drawable mSplitBackground>
	//*  47   99:ifnonnull       112
	//*  48  102:aload_0         
	//*  49  103:iload_2         
	//*  50  104:invokevirtual   #106 <Method void setWillNotDraw(boolean)>
	//*  51  107:aload_0         
	//*  52  108:invokevirtual   #204 <Method void invalidate()>
	//*  53  111:return          
			flag = false;
	//   54  112:iconst_0        
	//   55  113:istore_2        
_L4:
		setWillNotDraw(flag);
		invalidate();
		return;
	//*  56  114:goto            102
_L2:
		if(mBackground != null || mStackedBackground != null)
	//*  57  117:aload_0         
	//*  58  118:getfield        #68  <Field Drawable mBackground>
	//*  59  121:ifnonnull       131
	//*  60  124:aload_0         
	//*  61  125:getfield        #73  <Field Drawable mStackedBackground>
	//*  62  128:ifnull          102
			flag = false;
	//   63  131:iconst_0        
	//   64  132:istore_2        
		if(true) goto _L4; else goto _L3
	//   65  133:goto            102
_L3:
	}

	public void setTabContainer(ScrollingTabContainerView scrollingtabcontainerview)
	{
		if(mTabContainer != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field View mTabContainer>
	//*   2    4:ifnull          15
			removeView(mTabContainer);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #154 <Field View mTabContainer>
	//    6   12:invokevirtual   #269 <Method void removeView(View)>
		mTabContainer = ((View) (scrollingtabcontainerview));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #154 <Field View mTabContainer>
		if(scrollingtabcontainerview != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          50
		{
			addView(((View) (scrollingtabcontainerview)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #272 <Method void addView(View)>
			android.view.ViewGroup.LayoutParams layoutparams = scrollingtabcontainerview.getLayoutParams();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #275 <Method android.view.ViewGroup$LayoutParams ScrollingTabContainerView.getLayoutParams()>
	//   17   33:astore_2        
			layoutparams.width = -1;
	//   18   34:aload_2         
	//   19   35:iconst_m1       
	//   20   36:putfield        #280 <Field int android.view.ViewGroup$LayoutParams.width>
			layoutparams.height = -2;
	//   21   39:aload_2         
	//   22   40:bipush          -2
	//   23   42:putfield        #283 <Field int android.view.ViewGroup$LayoutParams.height>
			scrollingtabcontainerview.setAllowCollapse(false);
	//   24   45:aload_1         
	//   25   46:iconst_0        
	//   26   47:invokevirtual   #286 <Method void ScrollingTabContainerView.setAllowCollapse(boolean)>
		}
	//   27   50:return          
	}

	public void setTransitioning(boolean flag)
	{
		mIsTransitioning = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #184 <Field boolean mIsTransitioning>
		int i;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            19
			i = 0x60000;
	//    5    9:ldc2            #288 <Int 0x60000>
	//    6   12:istore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:iload_2         
	//*   9   15:invokevirtual   #292 <Method void setDescendantFocusability(int)>
	//*  10   18:return          
			i = 0x40000;
	//   11   19:ldc2            #293 <Int 0x40000>
	//   12   22:istore_2        
		setDescendantFocusability(i);
	//*  13   23:goto            13
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #296 <Method void FrameLayout.setVisibility(int)>
		boolean flag;
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            63
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:aload_0         
	//*   8   12:getfield        #68  <Field Drawable mBackground>
	//*   9   15:ifnull          28
	//*  10   18:aload_0         
	//*  11   19:getfield        #68  <Field Drawable mBackground>
	//*  12   22:iload_2         
	//*  13   23:iconst_0        
	//*  14   24:invokevirtual   #300 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  15   27:pop             
	//*  16   28:aload_0         
	//*  17   29:getfield        #73  <Field Drawable mStackedBackground>
	//*  18   32:ifnull          45
	//*  19   35:aload_0         
	//*  20   36:getfield        #73  <Field Drawable mStackedBackground>
	//*  21   39:iload_2         
	//*  22   40:iconst_0        
	//*  23   41:invokevirtual   #300 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  24   44:pop             
	//*  25   45:aload_0         
	//*  26   46:getfield        #98  <Field Drawable mSplitBackground>
	//*  27   49:ifnull          62
	//*  28   52:aload_0         
	//*  29   53:getfield        #98  <Field Drawable mSplitBackground>
	//*  30   56:iload_2         
	//*  31   57:iconst_0        
	//*  32   58:invokevirtual   #300 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  33   61:pop             
	//*  34   62:return          
			flag = false;
	//   35   63:iconst_0        
	//   36   64:istore_2        
		if(mBackground != null)
			mBackground.setVisible(flag, false);
		if(mStackedBackground != null)
			mStackedBackground.setVisible(flag, false);
		if(mSplitBackground != null)
			mSplitBackground.setVisible(flag, false);
	//*  37   65:goto            11
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
	//    6    8:invokespecial   #305 <Method ActionMode FrameLayout.startActionModeForChild(View, android.view.ActionMode$Callback, int)>
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
	//    2    2:getfield        #68  <Field Drawable mBackground>
	//    3    5:if_acmpne       15
	//    4    8:aload_0         
	//    5    9:getfield        #93  <Field boolean mIsSplit>
	//    6   12:ifeq            53
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #73  <Field Drawable mStackedBackground>
	//   10   20:if_acmpne       30
	//   11   23:aload_0         
	//   12   24:getfield        #218 <Field boolean mIsStacked>
	//   13   27:ifne            53
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #98  <Field Drawable mSplitBackground>
	//   17   35:if_acmpne       45
	//   18   38:aload_0         
	//   19   39:getfield        #93  <Field boolean mIsSplit>
	//   20   42:ifne            53
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokespecial   #309 <Method boolean FrameLayout.verifyDrawable(Drawable)>
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
