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
		boolean flag1;
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
	//   11   22:astore          5
		else
	//*  12   24:goto            37
			obj = ((Object) (new ActionBarBackgroundDrawable(this)));
	//   13   27:new             #41  <Class ActionBarBackgroundDrawable>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #42  <Method void ActionBarBackgroundDrawable(ActionBarContainer)>
	//   17   35:astore          5
		ViewCompat.setBackground(((View) (this)), ((Drawable) (obj)));
	//   18   37:aload_0         
	//   19   38:aload           5
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
		flag = mIsSplit;
	//   56  116:aload_0         
	//   57  117:getfield        #96  <Field boolean mIsSplit>
	//   58  120:istore_3        
		flag1 = false;
	//   59  121:iconst_0        
	//   60  122:istore          4
		if(!flag) goto _L2; else goto _L1
	//   61  124:iload_3         
	//   62  125:ifeq            143
_L1:
		flag = flag1;
	//   63  128:iload           4
	//   64  130:istore_3        
		if(mSplitBackground != null) goto _L4; else goto _L3
	//   65  131:aload_0         
	//   66  132:getfield        #101 <Field Drawable mSplitBackground>
	//   67  135:ifnonnull       166
_L3:
		flag = true;
	//   68  138:iconst_1        
	//   69  139:istore_3        
		break; /* Loop/switch isn't completed */
	//   70  140:goto            166
_L2:
		flag = flag1;
	//   71  143:iload           4
	//   72  145:istore_3        
		if(mBackground != null)
			break; /* Loop/switch isn't completed */
	//   73  146:aload_0         
	//   74  147:getfield        #71  <Field Drawable mBackground>
	//   75  150:ifnonnull       166
		flag = flag1;
	//   76  153:iload           4
	//   77  155:istore_3        
		if(mStackedBackground != null) goto _L4; else goto _L3
	//   78  156:aload_0         
	//   79  157:getfield        #76  <Field Drawable mStackedBackground>
	//   80  160:ifnonnull       166
	//*  81  163:goto            138
_L4:
		setWillNotDraw(flag);
	//   82  166:aload_0         
	//   83  167:iload_3         
	//   84  168:invokevirtual   #109 <Method void setWillNotDraw(boolean)>
		return;
	//   85  171:return          
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
	//    1    1:ifnull          25
	//    2    4:aload_1         
	//    3    5:invokevirtual   #133 <Method int View.getVisibility()>
	//    4    8:bipush          8
	//    5   10:icmpeq          25
	//    6   13:aload_1         
	//    7   14:invokevirtual   #122 <Method int View.getMeasuredHeight()>
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
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void FrameLayout.jumpDrawablesToCurrentState()>
		if(mBackground != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #71  <Field Drawable mBackground>
	//*   4    8:ifnull          18
			mBackground.jumpToCurrentState();
	//    5   11:aload_0         
	//    6   12:getfield        #71  <Field Drawable mBackground>
	//    7   15:invokevirtual   #160 <Method void Drawable.jumpToCurrentState()>
		if(mStackedBackground != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #76  <Field Drawable mStackedBackground>
	//*  10   22:ifnull          32
			mStackedBackground.jumpToCurrentState();
	//   11   25:aload_0         
	//   12   26:getfield        #76  <Field Drawable mStackedBackground>
	//   13   29:invokevirtual   #160 <Method void Drawable.jumpToCurrentState()>
		if(mSplitBackground != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #101 <Field Drawable mSplitBackground>
	//*  16   36:ifnull          46
			mSplitBackground.jumpToCurrentState();
	//   17   39:aload_0         
	//   18   40:getfield        #101 <Field Drawable mSplitBackground>
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
	//    2    4:ifne            20
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #186 <Method boolean FrameLayout.onInterceptTouchEvent(MotionEvent)>
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
	//    6    8:invokespecial   #190 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		View view = mTabContainer;
	//    7   11:aload_0         
	//    8   12:getfield        #154 <Field View mTabContainer>
	//    9   15:astore          8
		l = 1;
	//   10   17:iconst_1        
	//   11   18:istore          5
		boolean flag1 = false;
	//   12   20:iconst_0        
	//   13   21:istore          6
		j = 0;
	//   14   23:iconst_0        
	//   15   24:istore_3        
		if(view != null && view.getVisibility() != 8)
	//*  16   25:aload           8
	//*  17   27:ifnull          45
	//*  18   30:aload           8
	//*  19   32:invokevirtual   #133 <Method int View.getVisibility()>
	//*  20   35:bipush          8
	//*  21   37:icmpeq          45
			flag = true;
	//   22   40:iconst_1        
	//   23   41:istore_1        
		else
	//*  24   42:goto            47
			flag = false;
	//   25   45:iconst_0        
	//   26   46:istore_1        
		if(view != null && view.getVisibility() != 8)
	//*  27   47:aload           8
	//*  28   49:ifnull          108
	//*  29   52:aload           8
	//*  30   54:invokevirtual   #133 <Method int View.getVisibility()>
	//*  31   57:bipush          8
	//*  32   59:icmpeq          108
		{
			int i1 = getMeasuredHeight();
	//   33   62:aload_0         
	//   34   63:invokevirtual   #191 <Method int getMeasuredHeight()>
	//   35   66:istore          7
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//   36   68:aload           8
	//   37   70:invokevirtual   #117 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   38   73:checkcast       #119 <Class android.widget.FrameLayout$LayoutParams>
	//   39   76:astore          9
			view.layout(i, i1 - view.getMeasuredHeight() - layoutparams.bottomMargin, k, i1 - layoutparams.bottomMargin);
	//   40   78:aload           8
	//   41   80:iload_2         
	//   42   81:iload           7
	//   43   83:aload           8
	//   44   85:invokevirtual   #122 <Method int View.getMeasuredHeight()>
	//   45   88:isub            
	//   46   89:aload           9
	//   47   91:getfield        #128 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   48   94:isub            
	//   49   95:iload           4
	//   50   97:iload           7
	//   51   99:aload           9
	//   52  101:getfield        #128 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   53  104:isub            
	//   54  105:invokevirtual   #195 <Method void View.layout(int, int, int, int)>
		}
		if(mIsSplit)
	//*  55  108:aload_0         
	//*  56  109:getfield        #96  <Field boolean mIsSplit>
	//*  57  112:ifeq            150
		{
			i = j;
	//   58  115:iload_3         
	//   59  116:istore_2        
			if(mSplitBackground != null)
	//*  60  117:aload_0         
	//*  61  118:getfield        #101 <Field Drawable mSplitBackground>
	//*  62  121:ifnull          147
			{
				mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//   63  124:aload_0         
	//   64  125:getfield        #101 <Field Drawable mSplitBackground>
	//   65  128:iconst_0        
	//   66  129:iconst_0        
	//   67  130:aload_0         
	//   68  131:invokevirtual   #198 <Method int getMeasuredWidth()>
	//   69  134:aload_0         
	//   70  135:invokevirtual   #191 <Method int getMeasuredHeight()>
	//   71  138:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
				i = l;
	//   72  141:iload           5
	//   73  143:istore_2        
			}
		} else
	//*  74  144:goto            326
	//*  75  147:goto            326
		{
			j = ((int) (flag1));
	//   76  150:iload           6
	//   77  152:istore_3        
			if(mBackground != null)
	//*  78  153:aload_0         
	//*  79  154:getfield        #71  <Field Drawable mBackground>
	//*  80  157:ifnull          276
			{
				if(mActionBarView.getVisibility() == 0)
	//*  81  160:aload_0         
	//*  82  161:getfield        #172 <Field View mActionBarView>
	//*  83  164:invokevirtual   #133 <Method int View.getVisibility()>
	//*  84  167:ifne            208
					mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
	//   85  170:aload_0         
	//   86  171:getfield        #71  <Field Drawable mBackground>
	//   87  174:aload_0         
	//   88  175:getfield        #172 <Field View mActionBarView>
	//   89  178:invokevirtual   #204 <Method int View.getLeft()>
	//   90  181:aload_0         
	//   91  182:getfield        #172 <Field View mActionBarView>
	//   92  185:invokevirtual   #207 <Method int View.getTop()>
	//   93  188:aload_0         
	//   94  189:getfield        #172 <Field View mActionBarView>
	//   95  192:invokevirtual   #210 <Method int View.getRight()>
	//   96  195:aload_0         
	//   97  196:getfield        #172 <Field View mActionBarView>
	//   98  199:invokevirtual   #213 <Method int View.getBottom()>
	//   99  202:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
				else
	//* 100  205:goto            274
				if(mContextView != null && mContextView.getVisibility() == 0)
	//* 101  208:aload_0         
	//* 102  209:getfield        #177 <Field View mContextView>
	//* 103  212:ifnull          263
	//* 104  215:aload_0         
	//* 105  216:getfield        #177 <Field View mContextView>
	//* 106  219:invokevirtual   #133 <Method int View.getVisibility()>
	//* 107  222:ifne            263
					mBackground.setBounds(mContextView.getLeft(), mContextView.getTop(), mContextView.getRight(), mContextView.getBottom());
	//  108  225:aload_0         
	//  109  226:getfield        #71  <Field Drawable mBackground>
	//  110  229:aload_0         
	//  111  230:getfield        #177 <Field View mContextView>
	//  112  233:invokevirtual   #204 <Method int View.getLeft()>
	//  113  236:aload_0         
	//  114  237:getfield        #177 <Field View mContextView>
	//  115  240:invokevirtual   #207 <Method int View.getTop()>
	//  116  243:aload_0         
	//  117  244:getfield        #177 <Field View mContextView>
	//  118  247:invokevirtual   #210 <Method int View.getRight()>
	//  119  250:aload_0         
	//  120  251:getfield        #177 <Field View mContextView>
	//  121  254:invokevirtual   #213 <Method int View.getBottom()>
	//  122  257:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
				else
	//* 123  260:goto            274
					mBackground.setBounds(0, 0, 0, 0);
	//  124  263:aload_0         
	//  125  264:getfield        #71  <Field Drawable mBackground>
	//  126  267:iconst_0        
	//  127  268:iconst_0        
	//  128  269:iconst_0        
	//  129  270:iconst_0        
	//  130  271:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
				j = 1;
	//  131  274:iconst_1        
	//  132  275:istore_3        
			}
			mIsStacked = flag;
	//  133  276:aload_0         
	//  134  277:iload_1         
	//  135  278:putfield        #215 <Field boolean mIsStacked>
			i = j;
	//  136  281:iload_3         
	//  137  282:istore_2        
			if(flag)
	//* 138  283:iload_1         
	//* 139  284:ifeq            147
			{
				i = j;
	//  140  287:iload_3         
	//  141  288:istore_2        
				if(mStackedBackground != null)
	//* 142  289:aload_0         
	//* 143  290:getfield        #76  <Field Drawable mStackedBackground>
	//* 144  293:ifnull          147
				{
					mStackedBackground.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//  145  296:aload_0         
	//  146  297:getfield        #76  <Field Drawable mStackedBackground>
	//  147  300:aload           8
	//  148  302:invokevirtual   #204 <Method int View.getLeft()>
	//  149  305:aload           8
	//  150  307:invokevirtual   #207 <Method int View.getTop()>
	//  151  310:aload           8
	//  152  312:invokevirtual   #210 <Method int View.getRight()>
	//  153  315:aload           8
	//  154  317:invokevirtual   #213 <Method int View.getBottom()>
	//  155  320:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
					i = l;
	//  156  323:iload           5
	//  157  325:istore_2        
				}
			}
		}
		if(i != 0)
	//* 158  326:iload_2         
	//* 159  327:ifeq            334
			invalidate();
	//  160  330:aload_0         
	//  161  331:invokevirtual   #218 <Method void invalidate()>
	//  162  334:return          
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
	//*  14   23:getfield        #85  <Field int mHeight>
	//*  15   26:iflt            46
					k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(mHeight, android.view.View.MeasureSpec.getSize(j)), 0x80000000);
	//   16   29:aload_0         
	//   17   30:getfield        #85  <Field int mHeight>
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
		if(mActionBarView == null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #172 <Field View mActionBarView>
	//*  30   56:ifnonnull       60
			return;
	//   31   59:return          
		j = android.view.View.MeasureSpec.getMode(k);
	//   32   60:iload_3         
	//   33   61:invokestatic    #226 <Method int android.view.View$MeasureSpec.getMode(int)>
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
	//*  44   85:ldc1            #241 <Int 0x40000000>
	//*  45   87:icmpeq          177
		{
			if(!isCollapsed(mActionBarView))
	//*  46   90:aload_0         
	//*  47   91:aload_0         
	//*  48   92:getfield        #172 <Field View mActionBarView>
	//*  49   95:invokespecial   #243 <Method boolean isCollapsed(View)>
	//*  50   98:ifne            113
				i = getMeasuredHeightWithMargins(mActionBarView);
	//   51  101:aload_0         
	//   52  102:aload_0         
	//   53  103:getfield        #172 <Field View mActionBarView>
	//   54  106:invokespecial   #245 <Method int getMeasuredHeightWithMargins(View)>
	//   55  109:istore_1        
			else
	//*  56  110:goto            138
			if(!isCollapsed(mContextView))
	//*  57  113:aload_0         
	//*  58  114:aload_0         
	//*  59  115:getfield        #177 <Field View mContextView>
	//*  60  118:invokespecial   #243 <Method boolean isCollapsed(View)>
	//*  61  121:ifne            136
				i = getMeasuredHeightWithMargins(mContextView);
	//   62  124:aload_0         
	//   63  125:aload_0         
	//   64  126:getfield        #177 <Field View mContextView>
	//   65  129:invokespecial   #245 <Method int getMeasuredHeightWithMargins(View)>
	//   66  132:istore_1        
			else
	//*  67  133:goto            138
				i = 0;
	//   68  136:iconst_0        
	//   69  137:istore_1        
			if(j == 0x80000000)
	//*  70  138:iload_2         
	//*  71  139:ldc1            #227 <Int 0x80000000>
	//*  72  141:icmpne          152
				j = android.view.View.MeasureSpec.getSize(k);
	//   73  144:iload_3         
	//   74  145:invokestatic    #230 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   75  148:istore_2        
			else
	//*  76  149:goto            155
				j = 0x7fffffff;
	//   77  152:ldc1            #246 <Int 0x7fffffff>
	//   78  154:istore_2        
			setMeasuredDimension(getMeasuredWidth(), Math.min(i + getMeasuredHeightWithMargins(mTabContainer), j));
	//   79  155:aload_0         
	//   80  156:aload_0         
	//   81  157:invokevirtual   #198 <Method int getMeasuredWidth()>
	//   82  160:iload_1         
	//   83  161:aload_0         
	//   84  162:aload_0         
	//   85  163:getfield        #154 <Field View mTabContainer>
	//   86  166:invokespecial   #245 <Method int getMeasuredHeightWithMargins(View)>
	//   87  169:iadd            
	//   88  170:iload_2         
	//   89  171:invokestatic    #235 <Method int Math.min(int, int)>
	//   90  174:invokevirtual   #249 <Method void setMeasuredDimension(int, int)>
		}
	//   91  177:return          
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
		boolean flag1;
		if(mBackground != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field Drawable mBackground>
	//*   2    4:ifnull          23
		{
			mBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field Drawable mBackground>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mBackground);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #71  <Field Drawable mBackground>
	//   10   20:invokevirtual   #261 <Method void unscheduleDrawable(Drawable)>
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
	//   18   34:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mActionBarView != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #172 <Field View mActionBarView>
	//*  21   41:ifnull          79
				mBackground.setBounds(mActionBarView.getLeft(), mActionBarView.getTop(), mActionBarView.getRight(), mActionBarView.getBottom());
	//   22   44:aload_0         
	//   23   45:getfield        #71  <Field Drawable mBackground>
	//   24   48:aload_0         
	//   25   49:getfield        #172 <Field View mActionBarView>
	//   26   52:invokevirtual   #204 <Method int View.getLeft()>
	//   27   55:aload_0         
	//   28   56:getfield        #172 <Field View mActionBarView>
	//   29   59:invokevirtual   #207 <Method int View.getTop()>
	//   30   62:aload_0         
	//   31   63:getfield        #172 <Field View mActionBarView>
	//   32   66:invokevirtual   #210 <Method int View.getRight()>
	//   33   69:aload_0         
	//   34   70:getfield        #172 <Field View mActionBarView>
	//   35   73:invokevirtual   #213 <Method int View.getBottom()>
	//   36   76:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
		}
		flag = mIsSplit;
	//   37   79:aload_0         
	//   38   80:getfield        #96  <Field boolean mIsSplit>
	//   39   83:istore_2        
		flag1 = false;
	//   40   84:iconst_0        
	//   41   85:istore_3        
		if(!flag) goto _L2; else goto _L1
	//   42   86:iload_2         
	//   43   87:ifeq            104
_L1:
		flag = flag1;
	//   44   90:iload_3         
	//   45   91:istore_2        
		if(mSplitBackground != null) goto _L4; else goto _L3
	//   46   92:aload_0         
	//   47   93:getfield        #101 <Field Drawable mSplitBackground>
	//   48   96:ifnonnull       125
_L3:
		flag = true;
	//   49   99:iconst_1        
	//   50  100:istore_2        
		break; /* Loop/switch isn't completed */
	//   51  101:goto            125
_L2:
		flag = flag1;
	//   52  104:iload_3         
	//   53  105:istore_2        
		if(mBackground != null)
			break; /* Loop/switch isn't completed */
	//   54  106:aload_0         
	//   55  107:getfield        #71  <Field Drawable mBackground>
	//   56  110:ifnonnull       125
		flag = flag1;
	//   57  113:iload_3         
	//   58  114:istore_2        
		if(mStackedBackground != null) goto _L4; else goto _L3
	//   59  115:aload_0         
	//   60  116:getfield        #76  <Field Drawable mStackedBackground>
	//   61  119:ifnonnull       125
	//*  62  122:goto            99
_L4:
		setWillNotDraw(flag);
	//   63  125:aload_0         
	//   64  126:iload_2         
	//   65  127:invokevirtual   #109 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   66  130:aload_0         
	//   67  131:invokevirtual   #218 <Method void invalidate()>
		return;
	//   68  134:return          
	}

	public void setSplitBackground(Drawable drawable)
	{
		boolean flag1;
		if(mSplitBackground != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Drawable mSplitBackground>
	//*   2    4:ifnull          23
		{
			mSplitBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field Drawable mSplitBackground>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mSplitBackground);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #101 <Field Drawable mSplitBackground>
	//   10   20:invokevirtual   #261 <Method void unscheduleDrawable(Drawable)>
		}
		mSplitBackground = drawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #101 <Field Drawable mSplitBackground>
		flag1 = false;
	//   14   28:iconst_0        
	//   15   29:istore_3        
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
	//*  22   40:getfield        #96  <Field boolean mIsSplit>
	//*  23   43:ifeq            70
	//*  24   46:aload_0         
	//*  25   47:getfield        #101 <Field Drawable mSplitBackground>
	//*  26   50:ifnull          70
				mSplitBackground.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//   27   53:aload_0         
	//   28   54:getfield        #101 <Field Drawable mSplitBackground>
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
	//   37   71:getfield        #96  <Field boolean mIsSplit>
	//   38   74:ifeq            91
_L1:
		boolean flag = flag1;
	//   39   77:iload_3         
	//   40   78:istore_2        
		if(mSplitBackground != null) goto _L4; else goto _L3
	//   41   79:aload_0         
	//   42   80:getfield        #101 <Field Drawable mSplitBackground>
	//   43   83:ifnonnull       112
_L3:
		flag = true;
	//   44   86:iconst_1        
	//   45   87:istore_2        
		break; /* Loop/switch isn't completed */
	//   46   88:goto            112
_L2:
		flag = flag1;
	//   47   91:iload_3         
	//   48   92:istore_2        
		if(mBackground != null)
			break; /* Loop/switch isn't completed */
	//   49   93:aload_0         
	//   50   94:getfield        #71  <Field Drawable mBackground>
	//   51   97:ifnonnull       112
		flag = flag1;
	//   52  100:iload_3         
	//   53  101:istore_2        
		if(mStackedBackground != null) goto _L4; else goto _L3
	//   54  102:aload_0         
	//   55  103:getfield        #76  <Field Drawable mStackedBackground>
	//   56  106:ifnonnull       112
	//*  57  109:goto            86
_L4:
		setWillNotDraw(flag);
	//   58  112:aload_0         
	//   59  113:iload_2         
	//   60  114:invokevirtual   #109 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   61  117:aload_0         
	//   62  118:invokevirtual   #218 <Method void invalidate()>
		return;
	//   63  121:return          
	}

	public void setStackedBackground(Drawable drawable)
	{
		boolean flag;
		boolean flag1;
		if(mStackedBackground != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field Drawable mStackedBackground>
	//*   2    4:ifnull          23
		{
			mStackedBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field Drawable mStackedBackground>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(mStackedBackground);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #76  <Field Drawable mStackedBackground>
	//   10   20:invokevirtual   #261 <Method void unscheduleDrawable(Drawable)>
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
	//   18   34:invokevirtual   #258 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(mIsStacked && mStackedBackground != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #215 <Field boolean mIsStacked>
	//*  21   41:ifeq            86
	//*  22   44:aload_0         
	//*  23   45:getfield        #76  <Field Drawable mStackedBackground>
	//*  24   48:ifnull          86
				mStackedBackground.setBounds(mTabContainer.getLeft(), mTabContainer.getTop(), mTabContainer.getRight(), mTabContainer.getBottom());
	//   25   51:aload_0         
	//   26   52:getfield        #76  <Field Drawable mStackedBackground>
	//   27   55:aload_0         
	//   28   56:getfield        #154 <Field View mTabContainer>
	//   29   59:invokevirtual   #204 <Method int View.getLeft()>
	//   30   62:aload_0         
	//   31   63:getfield        #154 <Field View mTabContainer>
	//   32   66:invokevirtual   #207 <Method int View.getTop()>
	//   33   69:aload_0         
	//   34   70:getfield        #154 <Field View mTabContainer>
	//   35   73:invokevirtual   #210 <Method int View.getRight()>
	//   36   76:aload_0         
	//   37   77:getfield        #154 <Field View mTabContainer>
	//   38   80:invokevirtual   #213 <Method int View.getBottom()>
	//   39   83:invokevirtual   #201 <Method void Drawable.setBounds(int, int, int, int)>
		}
		flag = mIsSplit;
	//   40   86:aload_0         
	//   41   87:getfield        #96  <Field boolean mIsSplit>
	//   42   90:istore_2        
		flag1 = false;
	//   43   91:iconst_0        
	//   44   92:istore_3        
		if(!flag) goto _L2; else goto _L1
	//   45   93:iload_2         
	//   46   94:ifeq            111
_L1:
		flag = flag1;
	//   47   97:iload_3         
	//   48   98:istore_2        
		if(mSplitBackground != null) goto _L4; else goto _L3
	//   49   99:aload_0         
	//   50  100:getfield        #101 <Field Drawable mSplitBackground>
	//   51  103:ifnonnull       132
_L3:
		flag = true;
	//   52  106:iconst_1        
	//   53  107:istore_2        
		break; /* Loop/switch isn't completed */
	//   54  108:goto            132
_L2:
		flag = flag1;
	//   55  111:iload_3         
	//   56  112:istore_2        
		if(mBackground != null)
			break; /* Loop/switch isn't completed */
	//   57  113:aload_0         
	//   58  114:getfield        #71  <Field Drawable mBackground>
	//   59  117:ifnonnull       132
		flag = flag1;
	//   60  120:iload_3         
	//   61  121:istore_2        
		if(mStackedBackground != null) goto _L4; else goto _L3
	//   62  122:aload_0         
	//   63  123:getfield        #76  <Field Drawable mStackedBackground>
	//   64  126:ifnonnull       132
	//*  65  129:goto            106
_L4:
		setWillNotDraw(flag);
	//   66  132:aload_0         
	//   67  133:iload_2         
	//   68  134:invokevirtual   #109 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   69  137:aload_0         
	//   70  138:invokevirtual   #218 <Method void invalidate()>
		return;
	//   71  141:return          
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
	//*   4    6:ifeq            16
			i = 0x60000;
	//    5    9:ldc2            #288 <Int 0x60000>
	//    6   12:istore_2        
		else
	//*   7   13:goto            20
			i = 0x40000;
	//    8   16:ldc2            #289 <Int 0x40000>
	//    9   19:istore_2        
		setDescendantFocusability(i);
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #293 <Method void setDescendantFocusability(int)>
	//   13   25:return          
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
	//   17   29:invokevirtual   #300 <Method boolean Drawable.setVisible(boolean, boolean)>
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
	//   26   46:invokevirtual   #300 <Method boolean Drawable.setVisible(boolean, boolean)>
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
	//   35   63:invokevirtual   #300 <Method boolean Drawable.setVisible(boolean, boolean)>
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
	//   12   24:getfield        #215 <Field boolean mIsStacked>
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
