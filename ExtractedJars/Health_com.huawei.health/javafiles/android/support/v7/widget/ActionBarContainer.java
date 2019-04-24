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
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void FrameLayout(Context, AttributeSet)>
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   4    6:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5    9:bipush          21
	//*   6   11:icmplt          27
			obj = ((Object) (new ActionBarBackgroundDrawableV21(this)));
	//    7   14:new             #36  <Class ActionBarBackgroundDrawableV21>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #39  <Method void ActionBarBackgroundDrawableV21(ActionBarContainer)>
	//   11   22:astore          4
		else
	//*  12   24:goto            37
			obj = ((Object) (new ActionBarBackgroundDrawable(this)));
	//   13   27:new             #41  <Class ActionBarBackgroundDrawable>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #42  <Method void ActionBarBackgroundDrawable(ActionBarContainer)>
	//   17   35:astore          4
		ViewCompat.setBackground(((View) (this)), ((Drawable) (obj)));
	//   18   37:aload_0         
	//   19   38:aload           4
	//   20   40:invokestatic    #48  <Method void ViewCompat.setBackground(View, Drawable)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar)));
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:getstatic       #54  <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//   24   48:invokevirtual   #60  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   25   51:astore_1        
		mBackground = ((TypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_background);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getstatic       #63  <Field int android.support.v7.appcompat.R$styleable.ActionBar_background>
	//   29   57:invokevirtual   #69  <Method Drawable TypedArray.getDrawable(int)>
	//   30   60:putfield        #71  <Field Drawable mBackground>
		mStackedBackground = ((TypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_backgroundStacked);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getstatic       #74  <Field int android.support.v7.appcompat.R$styleable.ActionBar_backgroundStacked>
	//   34   68:invokevirtual   #69  <Method Drawable TypedArray.getDrawable(int)>
	//   35   71:putfield        #76  <Field Drawable mStackedBackground>
		mHeight = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionBar_height, -1);
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:getstatic       #79  <Field int android.support.v7.appcompat.R$styleable.ActionBar_height>
	//   39   79:iconst_m1       
	//   40   80:invokevirtual   #83  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   41   83:putfield        #85  <Field int mHeight>
		if(getId() == android.support.v7.appcompat.R.id.split_action_bar)
	//*  42   86:aload_0         
	//*  43   87:invokevirtual   #89  <Method int getId()>
	//*  44   90:getstatic       #94  <Field int android.support.v7.appcompat.R$id.split_action_bar>
	//*  45   93:icmpne          112
		{
			mIsSplit = true;
	//   46   96:aload_0         
	//   47   97:iconst_1        
	//   48   98:putfield        #96  <Field boolean mIsSplit>
			mSplitBackground = ((TypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_backgroundSplit);
	//   49  101:aload_0         
	//   50  102:aload_1         
	//   51  103:getstatic       #99  <Field int android.support.v7.appcompat.R$styleable.ActionBar_backgroundSplit>
	//   52  106:invokevirtual   #69  <Method Drawable TypedArray.getDrawable(int)>
	//   53  109:putfield        #101 <Field Drawable mSplitBackground>
		}
		((TypedArray) (context)).recycle();
	//   54  112:aload_1         
	//   55  113:invokevirtual   #105 <Method void TypedArray.recycle()>
		boolean flag;
		if(mIsSplit)
	//*  56  116:aload_0         
	//*  57  117:getfield        #96  <Field boolean mIsSplit>
	//*  58  120:ifeq            140
		{
			if(mSplitBackground == null)
	//*  59  123:aload_0         
	//*  60  124:getfield        #101 <Field Drawable mSplitBackground>
	//*  61  127:ifnonnull       135
				flag = true;
	//   62  130:iconst_1        
	//   63  131:istore_3        
			else
	//*  64  132:goto            161
				flag = false;
	//   65  135:iconst_0        
	//   66  136:istore_3        
		} else
	//*  67  137:goto            161
		if(mBackground == null && mStackedBackground == null)
	//*  68  140:aload_0         
	//*  69  141:getfield        #71  <Field Drawable mBackground>
	//*  70  144:ifnonnull       159
	//*  71  147:aload_0         
	//*  72  148:getfield        #76  <Field Drawable mStackedBackground>
	//*  73  151:ifnonnull       159
			flag = true;
	//   74  154:iconst_1        
	//   75  155:istore_3        
		else
	//*  76  156:goto            161
			flag = false;
	//   77  159:iconst_0        
	//   78  160:istore_3        
		setWillNotDraw(flag);
	//   79  161:aload_0         
	//   80  162:iload_3         
	//   81  163:invokevirtual   #109 <Method void setWillNotDraw(boolean)>
	//   82  166:return          
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
	//*   3    5:getfield        #71  <Field Drawable mBackground>
	//*   4    8:ifnull          33
	//*   5   11:aload_0         
	//*   6   12:getfield        #71  <Field Drawable mBackground>
	//*   7   15:invokevirtual   #142 <Method boolean Drawable.isStateful()>
	//*   8   18:ifeq            33
			mBackground.setState(getDrawableState());
	//    9   21:aload_0         
	//   10   22:getfield        #71  <Field Drawable mBackground>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #146 <Method int[] getDrawableState()>
	//   13   29:invokevirtual   #150 <Method boolean Drawable.setState(int[])>
	//   14   32:pop             
		if(mStackedBackground != null && mStackedBackground.isStateful())
	//*  15   33:aload_0         
	//*  16   34:getfield        #76  <Field Drawable mStackedBackground>
	//*  17   37:ifnull          62
	//*  18   40:aload_0         
	//*  19   41:getfield        #76  <Field Drawable mStackedBackground>
	//*  20   44:invokevirtual   #142 <Method boolean Drawable.isStateful()>
	//*  21   47:ifeq            62
			mStackedBackground.setState(getDrawableState());
	//   22   50:aload_0         
	//   23   51:getfield        #76  <Field Drawable mStackedBackground>
	//   24   54:aload_0         
	//   25   55:invokevirtual   #146 <Method int[] getDrawableState()>
	//   26   58:invokevirtual   #150 <Method boolean Drawable.setState(int[])>
	//   27   61:pop             
		if(mSplitBackground != null && mSplitBackground.isStateful())
	//*  28   62:aload_0         
	//*  29   63:getfield        #101 <Field Drawable mSplitBackground>
	//*  30   66:ifnull          91
	//*  31   69:aload_0         
	//*  32   70:getfield        #101 <Field Drawable mSplitBackground>
	//*  33   73:invokevirtual   #142 <Method boolean Drawable.isStateful()>
	//*  34   76:ifeq            91
			mSplitBackground.setState(getDrawableState());
	//   35   79:aload_0         
	//   36   80:getfield        #101 <Field Drawable mSplitBackground>
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
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          54
		{
			super.jumpDrawablesToCurrentState();
	//    3    8:aload_0         
	//    4    9:invokespecial   #157 <Method void FrameLayout.jumpDrawablesToCurrentState()>
			if(mBackground != null)
	//*   5   12:aload_0         
	//*   6   13:getfield        #71  <Field Drawable mBackground>
	//*   7   16:ifnull          26
				mBackground.jumpToCurrentState();
	//    8   19:aload_0         
	//    9   20:getfield        #71  <Field Drawable mBackground>
	//   10   23:invokevirtual   #160 <Method void Drawable.jumpToCurrentState()>
			if(mStackedBackground != null)
	//*  11   26:aload_0         
	//*  12   27:getfield        #76  <Field Drawable mStackedBackground>
	//*  13   30:ifnull          40
				mStackedBackground.jumpToCurrentState();
	//   14   33:aload_0         
	//   15   34:getfield        #76  <Field Drawable mStackedBackground>
	//   16   37:invokevirtual   #160 <Method void Drawable.jumpToCurrentState()>
			if(mSplitBackground != null)
	//*  17   40:aload_0         
	//*  18   41:getfield        #101 <Field Drawable mSplitBackground>
	//*  19   44:ifnull          54
				mSplitBackground.jumpToCurrentState();
	//   20   47:aload_0         
	//   21   48:getfield        #101 <Field Drawable mSplitBackground>
	//   22   51:invokevirtual   #160 <Method void Drawable.jumpToCurrentState()>
		}
	//   23   54:return          
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

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		return mIsTransitioning || super.onInterceptTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field boolean mIsTransitioning>
	//    2    4:ifne            15
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #183 <Method boolean FrameLayout.onInterceptTouchEvent(MotionEvent)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
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
	//    6    8:invokespecial   #187 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		View view = mTabContainer;
	//    7   11:aload_0         
	//    8   12:getfield        #154 <Field View mTabContainer>
	//    9   15:astore          6
		if(view != null && view.getVisibility() != 8)
	//*  10   17:aload           6
	//*  11   19:ifnull          37
	//*  12   22:aload           6
	//*  13   24:invokevirtual   #133 <Method int View.getVisibility()>
	//*  14   27:bipush          8
	//*  15   29:icmpeq          37
			flag = true;
	//   16   32:iconst_1        
	//   17   33:istore_1        
		else
	//*  18   34:goto            39
			flag = false;
	//   19   37:iconst_0        
	//   20   38:istore_1        
		if(view != null && view.getVisibility() != 8)
	//*  21   39:aload           6
	//*  22   41:ifnull          97
	//*  23   44:aload           6
	//*  24   46:invokevirtual   #133 <Method int View.getVisibility()>
	//*  25   49:bipush          8
	//*  26   51:icmpeq          97
		{
			j = getMeasuredHeight();
	//   27   54:aload_0         
	//   28   55:invokevirtual   #188 <Method int getMeasuredHeight()>
	//   29   58:istore_3        
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   30   59:aload           6
	//   31   61:invokevirtual   #117 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   32   64:checkcast       #119 <Class android.widget.FrameLayout$LayoutParams>
	//   33   67:astore          7
			view.layout(i, j - view.getMeasuredHeight() - layoutparams.bottomMargin, k, j - layoutparams.bottomMargin);
	//   34   69:aload           6
	//   35   71:iload_2         
	//   36   72:iload_3         
	//   37   73:aload           6
	//   38   75:invokevirtual   #122 <Method int View.getMeasuredHeight()>
	//   39   78:isub            
	//   40   79:aload           7
	//   41   81:getfield        #128 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   42   84:isub            
	//   43   85:iload           4
	//   44   87:iload_3         
	//   45   88:aload           7
	//   46   90:getfield        #128 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   47   93:isub            
	//   48   94:invokevirtual   #192 <Method void View.layout(int, int, int, int)>
		}
		i = 0;
	//   49   97:iconst_0        
	//   50   98:istore_2        
		j = 0;
	//   51   99:iconst_0        
	//   52  100:istore_3        
		if(mIsSplit)
	//*  53  101:aload_0         
	//*  54  102:getfield        #96  <Field boolean mIsSplit>
	//*  55  105:ifeq            137
		{
			if(mSplitBackground != null)
	//*  56  108:aload_0         
	//*  57  109:getfield        #101 <Field Drawable mSplitBackground>
	//*  58  112:ifnull          309
			{
				mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//   59  115:aload_0         
	//   60  116:getfield        #101 <Field Drawable mSplitBackground>
	//   61  119:iconst_0        
	//   62  120:iconst_0        
	//   63  121:aload_0         
	//   64  122:invokevirtual   #195 <Method int getMeasuredWidth()>
	//   65  125:aload_0         
	//   66  126:invokevirtual   #188 <Method int getMeasuredHeight()>
	//   67  129:invokevirtual   #198 <Method void Drawable.setBounds(int, int, int, int)>
				i = 1;
	//   68  132:iconst_1        
	//   69  133:istore_2        
			}
		} else
	//*  70  134:goto            309
		{
			if(mBackground != null)
	//*  71  137:aload_0         
	//*  72  138:getfield        #71  <Field Drawable mBackground>
	//*  73  141:ifnull          260
			{
				if(mActionBarView.getVisibility() == 0)
	//*  74  144:aload_0         
	//*  75  145:getfield        #172 <Field View mActionBarView>
	//*  76  148:invokevirtual   #133 <Method int View.getVisibility()>
	//*  77  151:ifne            192
					mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
	//   78  154:aload_0         
	//   79  155:getfield        #71  <Field Drawable mBackground>
	//   80  158:aload_0         
	//   81  159:getfield        #172 <Field View mActionBarView>
	//   82  162:invokevirtual   #201 <Method int View.getLeft()>
	//   83  165:aload_0         
	//   84  166:getfield        #172 <Field View mActionBarView>
	//   85  169:invokevirtual   #204 <Method int View.getTop()>
	//   86  172:aload_0         
	//   87  173:getfield        #172 <Field View mActionBarView>
	//   88  176:invokevirtual   #207 <Method int View.getRight()>
	//   89  179:aload_0         
	//   90  180:getfield        #172 <Field View mActionBarView>
	//   91  183:invokevirtual   #210 <Method int View.getBottom()>
	//   92  186:invokevirtual   #198 <Method void Drawable.setBounds(int, int, int, int)>
				else
	//*  93  189:goto            258
				if(mContextView != null && mContextView.getVisibility() == 0)
	//*  94  192:aload_0         
	//*  95  193:getfield        #177 <Field View mContextView>
	//*  96  196:ifnull          247
	//*  97  199:aload_0         
	//*  98  200:getfield        #177 <Field View mContextView>
	//*  99  203:invokevirtual   #133 <Method int View.getVisibility()>
	//* 100  206:ifne            247
					mBackground.setBounds(mContextView.getLeft(), mContextView.getTop(), mContextView.getRight(), mContextView.getBottom());
	//  101  209:aload_0         
	//  102  210:getfield        #71  <Field Drawable mBackground>
	//  103  213:aload_0         
	//  104  214:getfield        #177 <Field View mContextView>
	//  105  217:invokevirtual   #201 <Method int View.getLeft()>
	//  106  220:aload_0         
	//  107  221:getfield        #177 <Field View mContextView>
	//  108  224:invokevirtual   #204 <Method int View.getTop()>
	//  109  227:aload_0         
	//  110  228:getfield        #177 <Field View mContextView>
	//  111  231:invokevirtual   #207 <Method int View.getRight()>
	//  112  234:aload_0         
	//  113  235:getfield        #177 <Field View mContextView>
	//  114  238:invokevirtual   #210 <Method int View.getBottom()>
	//  115  241:invokevirtual   #198 <Method void Drawable.setBounds(int, int, int, int)>
				else
	//* 116  244:goto            258
					mBackground.setBounds(0, 0, 0, 0);
	//  117  247:aload_0         
	//  118  248:getfield        #71  <Field Drawable mBackground>
	//  119  251:iconst_0        
	//  120  252:iconst_0        
	//  121  253:iconst_0        
	//  122  254:iconst_0        
	//  123  255:invokevirtual   #198 <Method void Drawable.setBounds(int, int, int, int)>
				j = 1;
	//  124  258:iconst_1        
	//  125  259:istore_3        
			}
			mIsStacked = flag;
	//  126  260:aload_0         
	//  127  261:iload_1         
	//  128  262:putfield        #212 <Field boolean mIsStacked>
			i = j;
	//  129  265:iload_3         
	//  130  266:istore_2        
			if(flag)
	//* 131  267:iload_1         
	//* 132  268:ifeq            309
			{
				i = j;
	//  133  271:iload_3         
	//  134  272:istore_2        
				if(mStackedBackground != null)
	//* 135  273:aload_0         
	//* 136  274:getfield        #76  <Field Drawable mStackedBackground>
	//* 137  277:ifnull          309
				{
					mStackedBackground.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//  138  280:aload_0         
	//  139  281:getfield        #76  <Field Drawable mStackedBackground>
	//  140  284:aload           6
	//  141  286:invokevirtual   #201 <Method int View.getLeft()>
	//  142  289:aload           6
	//  143  291:invokevirtual   #204 <Method int View.getTop()>
	//  144  294:aload           6
	//  145  296:invokevirtual   #207 <Method int View.getRight()>
	//  146  299:aload           6
	//  147  301:invokevirtual   #210 <Method int View.getBottom()>
	//  148  304:invokevirtual   #198 <Method void Drawable.setBounds(int, int, int, int)>
					i = 1;
	//  149  307:iconst_1        
	//  150  308:istore_2        
				}
			}
		}
		if(i != 0)
	//* 151  309:iload_2         
	//* 152  310:ifeq            317
			invalidate();
	//  153  313:aload_0         
	//  154  314:invokevirtual   #215 <Method void invalidate()>
	//  155  317:return          
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
	//*   8   12:invokestatic    #223 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   9   15:ldc1            #224 <Int 0x80000000>
	//*  10   17:icmpne          46
			{
				k = j;
	//   11   20:iload_2         
	//   12   21:istore_3        
				if(mHeight >= 0)
	//*  13   22:aload_0         
	//*  14   23:getfield        #85  <Field int mHeight>
	//*  15   26:iflt            46
					k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(mHeight, android.view.View.MeasureSpec.getSize(j)), 0x80000000);
	//   16   29:aload_0         
	//   17   30:getfield        #85  <Field int mHeight>
	//   18   33:iload_2         
	//   19   34:invokestatic    #227 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   20   37:invokestatic    #232 <Method int Math.min(int, int)>
	//   21   40:ldc1            #224 <Int 0x80000000>
	//   22   42:invokestatic    #235 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   45:istore_3        
			}
		}
		super.onMeasure(i, k);
	//   24   46:aload_0         
	//   25   47:iload_1         
	//   26   48:iload_3         
	//   27   49:invokespecial   #237 <Method void FrameLayout.onMeasure(int, int)>
		if(mActionBarView == null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #172 <Field View mActionBarView>
	//*  30   56:ifnonnull       60
			return;
	//   31   59:return          
		j = android.view.View.MeasureSpec.getMode(k);
	//   32   60:iload_3         
	//   33   61:invokestatic    #223 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   34   64:istore_2        
		if(mTabContainer != null && mTabContainer.getVisibility() != 8 && j != 0x40000000)
	//*  35   65:aload_0         
	//*  36   66:getfield        #154 <Field View mTabContainer>
	//*  37   69:ifnull          177
	//*  38   72:aload_0         
	//*  39   73:getfield        #154 <Field View mTabContainer>
	//*  40   76:invokevirtual   #133 <Method int View.getVisibility()>
	//*  41   79:bipush          8
	//*  42   81:icmpeq          177
	//*  43   84:iload_2         
	//*  44   85:ldc1            #238 <Int 0x40000000>
	//*  45   87:icmpeq          177
		{
			if(!isCollapsed(mActionBarView))
	//*  46   90:aload_0         
	//*  47   91:aload_0         
	//*  48   92:getfield        #172 <Field View mActionBarView>
	//*  49   95:invokespecial   #240 <Method boolean isCollapsed(View)>
	//*  50   98:ifne            113
				i = getMeasuredHeightWithMargins(mActionBarView);
	//   51  101:aload_0         
	//   52  102:aload_0         
	//   53  103:getfield        #172 <Field View mActionBarView>
	//   54  106:invokespecial   #242 <Method int getMeasuredHeightWithMargins(View)>
	//   55  109:istore_1        
			else
	//*  56  110:goto            138
			if(!isCollapsed(mContextView))
	//*  57  113:aload_0         
	//*  58  114:aload_0         
	//*  59  115:getfield        #177 <Field View mContextView>
	//*  60  118:invokespecial   #240 <Method boolean isCollapsed(View)>
	//*  61  121:ifne            136
				i = getMeasuredHeightWithMargins(mContextView);
	//   62  124:aload_0         
	//   63  125:aload_0         
	//   64  126:getfield        #177 <Field View mContextView>
	//   65  129:invokespecial   #242 <Method int getMeasuredHeightWithMargins(View)>
	//   66  132:istore_1        
			else
	//*  67  133:goto            138
				i = 0;
	//   68  136:iconst_0        
	//   69  137:istore_1        
			if(j == 0x80000000)
	//*  70  138:iload_2         
	//*  71  139:ldc1            #224 <Int 0x80000000>
	//*  72  141:icmpne          152
				j = android.view.View.MeasureSpec.getSize(k);
	//   73  144:iload_3         
	//   74  145:invokestatic    #227 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   75  148:istore_2        
			else
	//*  76  149:goto            155
				j = 0x7fffffff;
	//   77  152:ldc1            #243 <Int 0x7fffffff>
	//   78  154:istore_2        
			setMeasuredDimension(getMeasuredWidth(), Math.min(getMeasuredHeightWithMargins(mTabContainer) + i, j));
	//   79  155:aload_0         
	//   80  156:aload_0         
	//   81  157:invokevirtual   #195 <Method int getMeasuredWidth()>
	//   82  160:aload_0         
	//   83  161:aload_0         
	//   84  162:getfield        #154 <Field View mTabContainer>
	//   85  165:invokespecial   #242 <Method int getMeasuredHeightWithMargins(View)>
	//   86  168:iload_1         
	//   87  169:iadd            
	//   88  170:iload_2         
	//   89  171:invokestatic    #232 <Method int Math.min(int, int)>
	//   90  174:invokevirtual   #246 <Method void setMeasuredDimension(int, int)>
		}
	//   91  177:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #249 <Method boolean FrameLayout.onTouchEvent(MotionEvent)>
	//    3    5:pop             
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public void setPrimaryBackground(Drawable drawable)
	{
		if(mBackground != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field Drawable mBackground>
	//*   2    4:ifnull          23
		{
			mBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field Drawable mBackground>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #255 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mBackground);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #71  <Field Drawable mBackground>
	//   10   20:invokevirtual   #258 <Method void unscheduleDrawable(Drawable)>
		}
		mBackground = drawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #71  <Field Drawable mBackground>
		if(drawable != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          79
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #255 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mActionBarView != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #172 <Field View mActionBarView>
	//*  21   41:ifnull          79
				mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
	//   22   44:aload_0         
	//   23   45:getfield        #71  <Field Drawable mBackground>
	//   24   48:aload_0         
	//   25   49:getfield        #172 <Field View mActionBarView>
	//   26   52:invokevirtual   #201 <Method int View.getLeft()>
	//   27   55:aload_0         
	//   28   56:getfield        #172 <Field View mActionBarView>
	//   29   59:invokevirtual   #204 <Method int View.getTop()>
	//   30   62:aload_0         
	//   31   63:getfield        #172 <Field View mActionBarView>
	//   32   66:invokevirtual   #207 <Method int View.getRight()>
	//   33   69:aload_0         
	//   34   70:getfield        #172 <Field View mActionBarView>
	//   35   73:invokevirtual   #210 <Method int View.getBottom()>
	//   36   76:invokevirtual   #198 <Method void Drawable.setBounds(int, int, int, int)>
		}
		boolean flag;
		if(mIsSplit)
	//*  37   79:aload_0         
	//*  38   80:getfield        #96  <Field boolean mIsSplit>
	//*  39   83:ifeq            103
		{
			if(mSplitBackground == null)
	//*  40   86:aload_0         
	//*  41   87:getfield        #101 <Field Drawable mSplitBackground>
	//*  42   90:ifnonnull       98
				flag = true;
	//   43   93:iconst_1        
	//   44   94:istore_2        
			else
	//*  45   95:goto            124
				flag = false;
	//   46   98:iconst_0        
	//   47   99:istore_2        
		} else
	//*  48  100:goto            124
		if(mBackground == null && mStackedBackground == null)
	//*  49  103:aload_0         
	//*  50  104:getfield        #71  <Field Drawable mBackground>
	//*  51  107:ifnonnull       122
	//*  52  110:aload_0         
	//*  53  111:getfield        #76  <Field Drawable mStackedBackground>
	//*  54  114:ifnonnull       122
			flag = true;
	//   55  117:iconst_1        
	//   56  118:istore_2        
		else
	//*  57  119:goto            124
			flag = false;
	//   58  122:iconst_0        
	//   59  123:istore_2        
		setWillNotDraw(flag);
	//   60  124:aload_0         
	//   61  125:iload_2         
	//   62  126:invokevirtual   #109 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   63  129:aload_0         
	//   64  130:invokevirtual   #215 <Method void invalidate()>
	//   65  133:return          
	}

	public void setSplitBackground(Drawable drawable)
	{
		if(mSplitBackground != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mSplitBackground>
	//*   2    4:ifnull          23
		{
			mSplitBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mSplitBackground>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #255 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mSplitBackground);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #101 <Field Drawable mSplitBackground>
	//   10   20:invokevirtual   #258 <Method void unscheduleDrawable(Drawable)>
		}
		mSplitBackground = drawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #101 <Field Drawable mSplitBackground>
		if(drawable != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          68
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #255 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mIsSplit && mSplitBackground != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #96  <Field boolean mIsSplit>
	//*  21   41:ifeq            68
	//*  22   44:aload_0         
	//*  23   45:getfield        #101 <Field Drawable mSplitBackground>
	//*  24   48:ifnull          68
				mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//   25   51:aload_0         
	//   26   52:getfield        #101 <Field Drawable mSplitBackground>
	//   27   55:iconst_0        
	//   28   56:iconst_0        
	//   29   57:aload_0         
	//   30   58:invokevirtual   #195 <Method int getMeasuredWidth()>
	//   31   61:aload_0         
	//   32   62:invokevirtual   #188 <Method int getMeasuredHeight()>
	//   33   65:invokevirtual   #198 <Method void Drawable.setBounds(int, int, int, int)>
		}
		boolean flag;
		if(mIsSplit)
	//*  34   68:aload_0         
	//*  35   69:getfield        #96  <Field boolean mIsSplit>
	//*  36   72:ifeq            92
		{
			if(mSplitBackground == null)
	//*  37   75:aload_0         
	//*  38   76:getfield        #101 <Field Drawable mSplitBackground>
	//*  39   79:ifnonnull       87
				flag = true;
	//   40   82:iconst_1        
	//   41   83:istore_2        
			else
	//*  42   84:goto            113
				flag = false;
	//   43   87:iconst_0        
	//   44   88:istore_2        
		} else
	//*  45   89:goto            113
		if(mBackground == null && mStackedBackground == null)
	//*  46   92:aload_0         
	//*  47   93:getfield        #71  <Field Drawable mBackground>
	//*  48   96:ifnonnull       111
	//*  49   99:aload_0         
	//*  50  100:getfield        #76  <Field Drawable mStackedBackground>
	//*  51  103:ifnonnull       111
			flag = true;
	//   52  106:iconst_1        
	//   53  107:istore_2        
		else
	//*  54  108:goto            113
			flag = false;
	//   55  111:iconst_0        
	//   56  112:istore_2        
		setWillNotDraw(flag);
	//   57  113:aload_0         
	//   58  114:iload_2         
	//   59  115:invokevirtual   #109 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   60  118:aload_0         
	//   61  119:invokevirtual   #215 <Method void invalidate()>
	//   62  122:return          
	}

	public void setStackedBackground(Drawable drawable)
	{
		if(mStackedBackground != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field Drawable mStackedBackground>
	//*   2    4:ifnull          23
		{
			mStackedBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field Drawable mStackedBackground>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #255 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mStackedBackground);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #76  <Field Drawable mStackedBackground>
	//   10   20:invokevirtual   #258 <Method void unscheduleDrawable(Drawable)>
		}
		mStackedBackground = drawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #76  <Field Drawable mStackedBackground>
		if(drawable != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          86
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #255 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mIsStacked && mStackedBackground != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #212 <Field boolean mIsStacked>
	//*  21   41:ifeq            86
	//*  22   44:aload_0         
	//*  23   45:getfield        #76  <Field Drawable mStackedBackground>
	//*  24   48:ifnull          86
				mStackedBackground.setBounds(mTabContainer.getLeft(), mTabContainer.getTop(), mTabContainer.getRight(), mTabContainer.getBottom());
	//   25   51:aload_0         
	//   26   52:getfield        #76  <Field Drawable mStackedBackground>
	//   27   55:aload_0         
	//   28   56:getfield        #154 <Field View mTabContainer>
	//   29   59:invokevirtual   #201 <Method int View.getLeft()>
	//   30   62:aload_0         
	//   31   63:getfield        #154 <Field View mTabContainer>
	//   32   66:invokevirtual   #204 <Method int View.getTop()>
	//   33   69:aload_0         
	//   34   70:getfield        #154 <Field View mTabContainer>
	//   35   73:invokevirtual   #207 <Method int View.getRight()>
	//   36   76:aload_0         
	//   37   77:getfield        #154 <Field View mTabContainer>
	//   38   80:invokevirtual   #210 <Method int View.getBottom()>
	//   39   83:invokevirtual   #198 <Method void Drawable.setBounds(int, int, int, int)>
		}
		boolean flag;
		if(mIsSplit)
	//*  40   86:aload_0         
	//*  41   87:getfield        #96  <Field boolean mIsSplit>
	//*  42   90:ifeq            110
		{
			if(mSplitBackground == null)
	//*  43   93:aload_0         
	//*  44   94:getfield        #101 <Field Drawable mSplitBackground>
	//*  45   97:ifnonnull       105
				flag = true;
	//   46  100:iconst_1        
	//   47  101:istore_2        
			else
	//*  48  102:goto            131
				flag = false;
	//   49  105:iconst_0        
	//   50  106:istore_2        
		} else
	//*  51  107:goto            131
		if(mBackground == null && mStackedBackground == null)
	//*  52  110:aload_0         
	//*  53  111:getfield        #71  <Field Drawable mBackground>
	//*  54  114:ifnonnull       129
	//*  55  117:aload_0         
	//*  56  118:getfield        #76  <Field Drawable mStackedBackground>
	//*  57  121:ifnonnull       129
			flag = true;
	//   58  124:iconst_1        
	//   59  125:istore_2        
		else
	//*  60  126:goto            131
			flag = false;
	//   61  129:iconst_0        
	//   62  130:istore_2        
		setWillNotDraw(flag);
	//   63  131:aload_0         
	//   64  132:iload_2         
	//   65  133:invokevirtual   #109 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   66  136:aload_0         
	//   67  137:invokevirtual   #215 <Method void invalidate()>
	//   68  140:return          
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
	//    6   12:invokevirtual   #266 <Method void removeView(View)>
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
	//   14   26:invokevirtual   #269 <Method void addView(View)>
			android.view.ViewGroup.LayoutParams layoutparams = scrollingtabcontainerview.getLayoutParams();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #272 <Method android.view.ViewGroup$LayoutParams ScrollingTabContainerView.getLayoutParams()>
	//   17   33:astore_2        
			layoutparams.width = -1;
	//   18   34:aload_2         
	//   19   35:iconst_m1       
	//   20   36:putfield        #277 <Field int android.view.ViewGroup$LayoutParams.width>
			layoutparams.height = -2;
	//   21   39:aload_2         
	//   22   40:bipush          -2
	//   23   42:putfield        #280 <Field int android.view.ViewGroup$LayoutParams.height>
			scrollingtabcontainerview.setAllowCollapse(false);
	//   24   45:aload_1         
	//   25   46:iconst_0        
	//   26   47:invokevirtual   #283 <Method void ScrollingTabContainerView.setAllowCollapse(boolean)>
		}
	//   27   50:return          
	}

	public void setTransitioning(boolean flag)
	{
		mIsTransitioning = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #181 <Field boolean mIsTransitioning>
		int i;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            16
			i = 0x60000;
	//    5    9:ldc2            #285 <Int 0x60000>
	//    6   12:istore_2        
		else
	//*   7   13:goto            20
			i = 0x40000;
	//    8   16:ldc2            #286 <Int 0x40000>
	//    9   19:istore_2        
		setDescendantFocusability(i);
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #290 <Method void setDescendantFocusability(int)>
	//   13   25:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #293 <Method void FrameLayout.setVisibility(int)>
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
		if(mBackground != null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #71  <Field Drawable mBackground>
	//*  12   20:ifnull          33
			mBackground.setVisible(flag, false);
	//   13   23:aload_0         
	//   14   24:getfield        #71  <Field Drawable mBackground>
	//   15   27:iload_2         
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #297 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   18   32:pop             
		if(mStackedBackground != null)
	//*  19   33:aload_0         
	//*  20   34:getfield        #76  <Field Drawable mStackedBackground>
	//*  21   37:ifnull          50
			mStackedBackground.setVisible(flag, false);
	//   22   40:aload_0         
	//   23   41:getfield        #76  <Field Drawable mStackedBackground>
	//   24   44:iload_2         
	//   25   45:iconst_0        
	//   26   46:invokevirtual   #297 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   27   49:pop             
		if(mSplitBackground != null)
	//*  28   50:aload_0         
	//*  29   51:getfield        #101 <Field Drawable mSplitBackground>
	//*  30   54:ifnull          67
			mSplitBackground.setVisible(flag, false);
	//   31   57:aload_0         
	//   32   58:getfield        #101 <Field Drawable mSplitBackground>
	//   33   61:iload_2         
	//   34   62:iconst_0        
	//   35   63:invokevirtual   #297 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   36   66:pop             
	//   37   67:return          
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
	//    6    8:invokespecial   #302 <Method ActionMode FrameLayout.startActionModeForChild(View, android.view.ActionMode$Callback, int)>
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
	//    2    2:getfield        #71  <Field Drawable mBackground>
	//    3    5:if_acmpne       15
	//    4    8:aload_0         
	//    5    9:getfield        #96  <Field boolean mIsSplit>
	//    6   12:ifeq            53
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #76  <Field Drawable mStackedBackground>
	//   10   20:if_acmpne       30
	//   11   23:aload_0         
	//   12   24:getfield        #212 <Field boolean mIsStacked>
	//   13   27:ifne            53
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #101 <Field Drawable mSplitBackground>
	//   17   35:if_acmpne       45
	//   18   38:aload_0         
	//   19   39:getfield        #96  <Field boolean mIsSplit>
	//   20   42:ifne            53
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokespecial   #306 <Method boolean FrameLayout.verifyDrawable(Drawable)>
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
