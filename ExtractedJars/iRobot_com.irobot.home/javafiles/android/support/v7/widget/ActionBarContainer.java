// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;

// Referenced classes of package android.support.v7.widget:
//			c, b, ScrollingTabContainerView

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
		Object obj;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   4    6:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5    9:bipush          21
	//*   6   11:icmplt          27
			obj = ((Object) (new c(this)));
	//    7   14:new             #32  <Class c>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:invokespecial   #35  <Method void c(ActionBarContainer)>
	//   11   22:astore          5
		else
	//*  12   24:goto            37
			obj = ((Object) (new b(this)));
	//   13   27:new             #37  <Class b>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #38  <Method void b(ActionBarContainer)>
	//   17   35:astore          5
		s.a(((View) (this)), ((Drawable) (obj)));
	//   18   37:aload_0         
	//   19   38:aload           5
	//   20   40:invokestatic    #43  <Method void s.a(View, Drawable)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.ActionBar)));
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:getstatic       #49  <Field int[] android.support.v7.a.a$j.ActionBar>
	//   24   48:invokevirtual   #55  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   25   51:astore_1        
		a = ((TypedArray) (context)).getDrawable(android.support.v7.a.a.j.ActionBar_background);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:getstatic       #58  <Field int android.support.v7.a.a$j.ActionBar_background>
	//   29   57:invokevirtual   #64  <Method Drawable TypedArray.getDrawable(int)>
	//   30   60:putfield        #66  <Field Drawable a>
		b = ((TypedArray) (context)).getDrawable(android.support.v7.a.a.j.ActionBar_backgroundStacked);
	//   31   63:aload_0         
	//   32   64:aload_1         
	//   33   65:getstatic       #69  <Field int android.support.v7.a.a$j.ActionBar_backgroundStacked>
	//   34   68:invokevirtual   #64  <Method Drawable TypedArray.getDrawable(int)>
	//   35   71:putfield        #71  <Field Drawable b>
		j = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.a.a.j.ActionBar_height, -1);
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:getstatic       #74  <Field int android.support.v7.a.a$j.ActionBar_height>
	//   39   79:iconst_m1       
	//   40   80:invokevirtual   #78  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   41   83:putfield        #80  <Field int j>
		if(getId() == android.support.v7.a.a.f.split_action_bar)
	//*  42   86:aload_0         
	//*  43   87:invokevirtual   #84  <Method int getId()>
	//*  44   90:getstatic       #89  <Field int android.support.v7.a.a$f.split_action_bar>
	//*  45   93:icmpne          112
		{
			d = true;
	//   46   96:aload_0         
	//   47   97:iconst_1        
	//   48   98:putfield        #91  <Field boolean d>
			c = ((TypedArray) (context)).getDrawable(android.support.v7.a.a.j.ActionBar_backgroundSplit);
	//   49  101:aload_0         
	//   50  102:aload_1         
	//   51  103:getstatic       #94  <Field int android.support.v7.a.a$j.ActionBar_backgroundSplit>
	//   52  106:invokevirtual   #64  <Method Drawable TypedArray.getDrawable(int)>
	//   53  109:putfield        #96  <Field Drawable c>
		}
		((TypedArray) (context)).recycle();
	//   54  112:aload_1         
	//   55  113:invokevirtual   #100 <Method void TypedArray.recycle()>
		flag = d;
	//   56  116:aload_0         
	//   57  117:getfield        #91  <Field boolean d>
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
		if(c != null) goto _L4; else goto _L3
	//   65  131:aload_0         
	//   66  132:getfield        #96  <Field Drawable c>
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
		if(a != null)
			break; /* Loop/switch isn't completed */
	//   73  146:aload_0         
	//   74  147:getfield        #66  <Field Drawable a>
	//   75  150:ifnonnull       166
		flag = flag1;
	//   76  153:iload           4
	//   77  155:istore_3        
		if(b != null) goto _L4; else goto _L3
	//   78  156:aload_0         
	//   79  157:getfield        #71  <Field Drawable b>
	//   80  160:ifnonnull       166
	//*  81  163:goto            138
_L4:
		setWillNotDraw(flag);
	//   82  166:aload_0         
	//   83  167:iload_3         
	//   84  168:invokevirtual   #104 <Method void setWillNotDraw(boolean)>
		return;
	//   85  171:return          
	}

	private boolean a(View view)
	{
		return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
	//    0    0:aload_1         
	//    1    1:ifnull          25
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method int View.getVisibility()>
	//    4    8:bipush          8
	//    5   10:icmpeq          25
	//    6   13:aload_1         
	//    7   14:invokevirtual   #113 <Method int View.getMeasuredHeight()>
	//    8   17:ifne            23
	//    9   20:goto            25
	//   10   23:iconst_0        
	//   11   24:ireturn         
	//   12   25:iconst_1        
	//   13   26:ireturn         
	}

	private int b(View view)
	{
		android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #118 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #120 <Class android.widget.FrameLayout$LayoutParams>
	//    3    7:astore_2        
		return view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #113 <Method int View.getMeasuredHeight()>
	//    6   12:aload_2         
	//    7   13:getfield        #123 <Field int android.widget.FrameLayout$LayoutParams.topMargin>
	//    8   16:iadd            
	//    9   17:aload_2         
	//   10   18:getfield        #126 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   11   21:iadd            
	//   12   22:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void FrameLayout.drawableStateChanged()>
		if(a != null && a.isStateful())
	//*   2    4:aload_0         
	//*   3    5:getfield        #66  <Field Drawable a>
	//*   4    8:ifnull          33
	//*   5   11:aload_0         
	//*   6   12:getfield        #66  <Field Drawable a>
	//*   7   15:invokevirtual   #135 <Method boolean Drawable.isStateful()>
	//*   8   18:ifeq            33
			a.setState(getDrawableState());
	//    9   21:aload_0         
	//   10   22:getfield        #66  <Field Drawable a>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #139 <Method int[] getDrawableState()>
	//   13   29:invokevirtual   #143 <Method boolean Drawable.setState(int[])>
	//   14   32:pop             
		if(b != null && b.isStateful())
	//*  15   33:aload_0         
	//*  16   34:getfield        #71  <Field Drawable b>
	//*  17   37:ifnull          62
	//*  18   40:aload_0         
	//*  19   41:getfield        #71  <Field Drawable b>
	//*  20   44:invokevirtual   #135 <Method boolean Drawable.isStateful()>
	//*  21   47:ifeq            62
			b.setState(getDrawableState());
	//   22   50:aload_0         
	//   23   51:getfield        #71  <Field Drawable b>
	//   24   54:aload_0         
	//   25   55:invokevirtual   #139 <Method int[] getDrawableState()>
	//   26   58:invokevirtual   #143 <Method boolean Drawable.setState(int[])>
	//   27   61:pop             
		if(c != null && c.isStateful())
	//*  28   62:aload_0         
	//*  29   63:getfield        #96  <Field Drawable c>
	//*  30   66:ifnull          91
	//*  31   69:aload_0         
	//*  32   70:getfield        #96  <Field Drawable c>
	//*  33   73:invokevirtual   #135 <Method boolean Drawable.isStateful()>
	//*  34   76:ifeq            91
			c.setState(getDrawableState());
	//   35   79:aload_0         
	//   36   80:getfield        #96  <Field Drawable c>
	//   37   83:aload_0         
	//   38   84:invokevirtual   #139 <Method int[] getDrawableState()>
	//   39   87:invokevirtual   #143 <Method boolean Drawable.setState(int[])>
	//   40   90:pop             
	//   41   91:return          
	}

	public View getTabContainer()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field View g>
	//    2    4:areturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #150 <Method void FrameLayout.jumpDrawablesToCurrentState()>
		if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #66  <Field Drawable a>
	//*   4    8:ifnull          18
			a.jumpToCurrentState();
	//    5   11:aload_0         
	//    6   12:getfield        #66  <Field Drawable a>
	//    7   15:invokevirtual   #153 <Method void Drawable.jumpToCurrentState()>
		if(b != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #71  <Field Drawable b>
	//*  10   22:ifnull          32
			b.jumpToCurrentState();
	//   11   25:aload_0         
	//   12   26:getfield        #71  <Field Drawable b>
	//   13   29:invokevirtual   #153 <Method void Drawable.jumpToCurrentState()>
		if(c != null)
	//*  14   32:aload_0         
	//*  15   33:getfield        #96  <Field Drawable c>
	//*  16   36:ifnull          46
			c.jumpToCurrentState();
	//   17   39:aload_0         
	//   18   40:getfield        #96  <Field Drawable c>
	//   19   43:invokevirtual   #153 <Method void Drawable.jumpToCurrentState()>
	//   20   46:return          
	}

	public void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #156 <Method void FrameLayout.onFinishInflate()>
		h = findViewById(android.support.v7.a.a.f.action_bar);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getstatic       #159 <Field int android.support.v7.a.a$f.action_bar>
	//    5    9:invokevirtual   #163 <Method View findViewById(int)>
	//    6   12:putfield        #165 <Field View h>
		i = findViewById(android.support.v7.a.a.f.action_context_bar);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getstatic       #168 <Field int android.support.v7.a.a$f.action_context_bar>
	//   10   20:invokevirtual   #163 <Method View findViewById(int)>
	//   11   23:putfield        #170 <Field View i>
	//   12   26:return          
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		super.onHoverEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #174 <Method boolean FrameLayout.onHoverEvent(MotionEvent)>
	//    3    5:pop             
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		return f || super.onInterceptTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field boolean f>
	//    2    4:ifne            20
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #179 <Method boolean FrameLayout.onInterceptTouchEvent(MotionEvent)>
	//    6   12:ifeq            18
	//    7   15:goto            20
	//    8   18:iconst_0        
	//    9   19:ireturn         
	//   10   20:iconst_1        
	//   11   21:ireturn         
	}

	public void onLayout(boolean flag, int k, int l, int i1, int j1)
	{
		View view1;
		super.onLayout(flag, k, l, i1, j1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #183 <Method void FrameLayout.onLayout(boolean, int, int, int, int)>
		view1 = g;
	//    7   11:aload_0         
	//    8   12:getfield        #147 <Field View g>
	//    9   15:astore          9
		j1 = 1;
	//   10   17:iconst_1        
	//   11   18:istore          5
		l = 0;
	//   12   20:iconst_0        
	//   13   21:istore_3        
		if(view1 != null && view1.getVisibility() != 8)
	//*  14   22:aload           9
	//*  15   24:ifnull          42
	//*  16   27:aload           9
	//*  17   29:invokevirtual   #110 <Method int View.getVisibility()>
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
		if(view1 != null && view1.getVisibility() != 8)
	//*  25   44:aload           9
	//*  26   46:ifnull          105
	//*  27   49:aload           9
	//*  28   51:invokevirtual   #110 <Method int View.getVisibility()>
	//*  29   54:bipush          8
	//*  30   56:icmpeq          105
		{
			int k1 = getMeasuredHeight();
	//   31   59:aload_0         
	//   32   60:invokevirtual   #184 <Method int getMeasuredHeight()>
	//   33   63:istore          6
			android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view1.getLayoutParams();
	//   34   65:aload           9
	//   35   67:invokevirtual   #118 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   36   70:checkcast       #120 <Class android.widget.FrameLayout$LayoutParams>
	//   37   73:astore          7
			view1.layout(k, k1 - view1.getMeasuredHeight() - layoutparams.bottomMargin, i1, k1 - layoutparams.bottomMargin);
	//   38   75:aload           9
	//   39   77:iload_2         
	//   40   78:iload           6
	//   41   80:aload           9
	//   42   82:invokevirtual   #113 <Method int View.getMeasuredHeight()>
	//   43   85:isub            
	//   44   86:aload           7
	//   45   88:getfield        #126 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   46   91:isub            
	//   47   92:iload           4
	//   48   94:iload           6
	//   49   96:aload           7
	//   50   98:getfield        #126 <Field int android.widget.FrameLayout$LayoutParams.bottomMargin>
	//   51  101:isub            
	//   52  102:invokevirtual   #188 <Method void View.layout(int, int, int, int)>
		}
		if(d)
	//*  53  105:aload_0         
	//*  54  106:getfield        #91  <Field boolean d>
	//*  55  109:ifeq            147
		{
			if(c != null)
	//*  56  112:aload_0         
	//*  57  113:getfield        #96  <Field Drawable c>
	//*  58  116:ifnull          142
			{
				c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//   59  119:aload_0         
	//   60  120:getfield        #96  <Field Drawable c>
	//   61  123:iconst_0        
	//   62  124:iconst_0        
	//   63  125:aload_0         
	//   64  126:invokevirtual   #191 <Method int getMeasuredWidth()>
	//   65  129:aload_0         
	//   66  130:invokevirtual   #184 <Method int getMeasuredHeight()>
	//   67  133:invokevirtual   #194 <Method void Drawable.setBounds(int, int, int, int)>
				k = j1;
	//   68  136:iload           5
	//   69  138:istore_2        
			} else
	//*  70  139:goto            339
			{
				k = 0;
	//   71  142:iconst_0        
	//   72  143:istore_2        
			}
			break MISSING_BLOCK_LABEL_339;
	//   73  144:goto            339
		}
		k = l;
	//   74  147:iload_3         
	//   75  148:istore_2        
		if(a == null)
			break MISSING_BLOCK_LABEL_290;
	//   76  149:aload_0         
	//   77  150:getfield        #66  <Field Drawable a>
	//   78  153:ifnull          290
		if(h.getVisibility() != 0) goto _L2; else goto _L1
	//   79  156:aload_0         
	//   80  157:getfield        #165 <Field View h>
	//   81  160:invokevirtual   #110 <Method int View.getVisibility()>
	//   82  163:ifne            220
_L1:
		View view;
		Drawable drawable;
		drawable = a;
	//   83  166:aload_0         
	//   84  167:getfield        #66  <Field Drawable a>
	//   85  170:astore          8
		l = h.getLeft();
	//   86  172:aload_0         
	//   87  173:getfield        #165 <Field View h>
	//   88  176:invokevirtual   #197 <Method int View.getLeft()>
	//   89  179:istore_3        
		i1 = h.getTop();
	//   90  180:aload_0         
	//   91  181:getfield        #165 <Field View h>
	//   92  184:invokevirtual   #200 <Method int View.getTop()>
	//   93  187:istore          4
		k = h.getRight();
	//   94  189:aload_0         
	//   95  190:getfield        #165 <Field View h>
	//   96  193:invokevirtual   #203 <Method int View.getRight()>
	//   97  196:istore_2        
		view = h;
	//   98  197:aload_0         
	//   99  198:getfield        #165 <Field View h>
	//  100  201:astore          7
_L4:
		drawable.setBounds(l, i1, k, view.getBottom());
	//  101  203:aload           8
	//  102  205:iload_3         
	//  103  206:iload           4
	//  104  208:iload_2         
	//  105  209:aload           7
	//  106  211:invokevirtual   #206 <Method int View.getBottom()>
	//  107  214:invokevirtual   #194 <Method void Drawable.setBounds(int, int, int, int)>
		break MISSING_BLOCK_LABEL_288;
	//  108  217:goto            288
_L2:
		if(i == null || i.getVisibility() != 0)
			break; /* Loop/switch isn't completed */
	//  109  220:aload_0         
	//  110  221:getfield        #170 <Field View i>
	//  111  224:ifnull          277
	//  112  227:aload_0         
	//  113  228:getfield        #170 <Field View i>
	//  114  231:invokevirtual   #110 <Method int View.getVisibility()>
	//  115  234:ifne            277
		drawable = a;
	//  116  237:aload_0         
	//  117  238:getfield        #66  <Field Drawable a>
	//  118  241:astore          8
		l = i.getLeft();
	//  119  243:aload_0         
	//  120  244:getfield        #170 <Field View i>
	//  121  247:invokevirtual   #197 <Method int View.getLeft()>
	//  122  250:istore_3        
		i1 = i.getTop();
	//  123  251:aload_0         
	//  124  252:getfield        #170 <Field View i>
	//  125  255:invokevirtual   #200 <Method int View.getTop()>
	//  126  258:istore          4
		k = i.getRight();
	//  127  260:aload_0         
	//  128  261:getfield        #170 <Field View i>
	//  129  264:invokevirtual   #203 <Method int View.getRight()>
	//  130  267:istore_2        
		view = i;
	//  131  268:aload_0         
	//  132  269:getfield        #170 <Field View i>
	//  133  272:astore          7
		if(true) goto _L4; else goto _L3
	//  134  274:goto            203
_L3:
		a.setBounds(0, 0, 0, 0);
	//  135  277:aload_0         
	//  136  278:getfield        #66  <Field Drawable a>
	//  137  281:iconst_0        
	//  138  282:iconst_0        
	//  139  283:iconst_0        
	//  140  284:iconst_0        
	//  141  285:invokevirtual   #194 <Method void Drawable.setBounds(int, int, int, int)>
		k = 1;
	//  142  288:iconst_1        
	//  143  289:istore_2        
		e = flag;
	//  144  290:aload_0         
	//  145  291:iload_1         
	//  146  292:putfield        #208 <Field boolean e>
		if(flag && b != null)
	//* 147  295:iload_1         
	//* 148  296:ifeq            339
	//* 149  299:aload_0         
	//* 150  300:getfield        #71  <Field Drawable b>
	//* 151  303:ifnull          339
		{
			b.setBounds(view1.getLeft(), view1.getTop(), view1.getRight(), view1.getBottom());
	//  152  306:aload_0         
	//  153  307:getfield        #71  <Field Drawable b>
	//  154  310:aload           9
	//  155  312:invokevirtual   #197 <Method int View.getLeft()>
	//  156  315:aload           9
	//  157  317:invokevirtual   #200 <Method int View.getTop()>
	//  158  320:aload           9
	//  159  322:invokevirtual   #203 <Method int View.getRight()>
	//  160  325:aload           9
	//  161  327:invokevirtual   #206 <Method int View.getBottom()>
	//  162  330:invokevirtual   #194 <Method void Drawable.setBounds(int, int, int, int)>
			k = j1;
	//  163  333:iload           5
	//  164  335:istore_2        
		}
	//* 165  336:goto            339
		if(k != 0)
	//* 166  339:iload_2         
	//* 167  340:ifeq            347
			invalidate();
	//  168  343:aload_0         
	//  169  344:invokevirtual   #211 <Method void invalidate()>
		return;
	//  170  347:return          
	}

	public void onMeasure(int k, int l)
	{
		int i1;
		i1 = l;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(h == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #165 <Field View h>
	//*   4    6:ifnonnull       46
		{
			i1 = l;
	//    5    9:iload_2         
	//    6   10:istore_3        
			if(android.view.View.MeasureSpec.getMode(l) == 0x80000000)
	//*   7   11:iload_2         
	//*   8   12:invokestatic    #219 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   9   15:ldc1            #220 <Int 0x80000000>
	//*  10   17:icmpne          46
			{
				i1 = l;
	//   11   20:iload_2         
	//   12   21:istore_3        
				if(j >= 0)
	//*  13   22:aload_0         
	//*  14   23:getfield        #80  <Field int j>
	//*  15   26:iflt            46
					i1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(j, android.view.View.MeasureSpec.getSize(l)), 0x80000000);
	//   16   29:aload_0         
	//   17   30:getfield        #80  <Field int j>
	//   18   33:iload_2         
	//   19   34:invokestatic    #223 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   20   37:invokestatic    #228 <Method int Math.min(int, int)>
	//   21   40:ldc1            #220 <Int 0x80000000>
	//   22   42:invokestatic    #231 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   23   45:istore_3        
			}
		}
		super.onMeasure(k, i1);
	//   24   46:aload_0         
	//   25   47:iload_1         
	//   26   48:iload_3         
	//   27   49:invokespecial   #233 <Method void FrameLayout.onMeasure(int, int)>
		if(h == null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #165 <Field View h>
	//*  30   56:ifnonnull       60
			return;
	//   31   59:return          
		l = android.view.View.MeasureSpec.getMode(i1);
	//   32   60:iload_3         
	//   33   61:invokestatic    #219 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   34   64:istore_2        
		if(g == null || g.getVisibility() == 8 || l == 0x40000000)
			break MISSING_BLOCK_LABEL_178;
	//   35   65:aload_0         
	//   36   66:getfield        #147 <Field View g>
	//   37   69:ifnull          178
	//   38   72:aload_0         
	//   39   73:getfield        #147 <Field View g>
	//   40   76:invokevirtual   #110 <Method int View.getVisibility()>
	//   41   79:bipush          8
	//   42   81:icmpeq          178
	//   43   84:iload_2         
	//   44   85:ldc1            #234 <Int 0x40000000>
	//   45   87:icmpeq          178
		if(a(h)) goto _L2; else goto _L1
	//   46   90:aload_0         
	//   47   91:aload_0         
	//   48   92:getfield        #165 <Field View h>
	//   49   95:invokespecial   #236 <Method boolean a(View)>
	//   50   98:ifne            117
_L1:
		View view = h;
	//   51  101:aload_0         
	//   52  102:getfield        #165 <Field View h>
	//   53  105:astore          4
_L4:
		k = b(view);
	//   54  107:aload_0         
	//   55  108:aload           4
	//   56  110:invokespecial   #238 <Method int b(View)>
	//   57  113:istore_1        
		break MISSING_BLOCK_LABEL_139;
	//   58  114:goto            139
_L2:
		if(a(i))
			break; /* Loop/switch isn't completed */
	//   59  117:aload_0         
	//   60  118:aload_0         
	//   61  119:getfield        #170 <Field View i>
	//   62  122:invokespecial   #236 <Method boolean a(View)>
	//   63  125:ifne            137
		view = i;
	//   64  128:aload_0         
	//   65  129:getfield        #170 <Field View i>
	//   66  132:astore          4
		if(true) goto _L4; else goto _L3
	//   67  134:goto            107
_L3:
		k = 0;
	//   68  137:iconst_0        
	//   69  138:istore_1        
		if(l == 0x80000000)
	//*  70  139:iload_2         
	//*  71  140:ldc1            #220 <Int 0x80000000>
	//*  72  142:icmpne          153
			l = android.view.View.MeasureSpec.getSize(i1);
	//   73  145:iload_3         
	//   74  146:invokestatic    #223 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   75  149:istore_2        
		else
	//*  76  150:goto            156
			l = 0x7fffffff;
	//   77  153:ldc1            #239 <Int 0x7fffffff>
	//   78  155:istore_2        
		setMeasuredDimension(getMeasuredWidth(), Math.min(k + b(g), l));
	//   79  156:aload_0         
	//   80  157:aload_0         
	//   81  158:invokevirtual   #191 <Method int getMeasuredWidth()>
	//   82  161:iload_1         
	//   83  162:aload_0         
	//   84  163:aload_0         
	//   85  164:getfield        #147 <Field View g>
	//   86  167:invokespecial   #238 <Method int b(View)>
	//   87  170:iadd            
	//   88  171:iload_2         
	//   89  172:invokestatic    #228 <Method int Math.min(int, int)>
	//   90  175:invokevirtual   #242 <Method void setMeasuredDimension(int, int)>
	//   91  178:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #245 <Method boolean FrameLayout.onTouchEvent(MotionEvent)>
	//    3    5:pop             
		return true;
	//    4    6:iconst_1        
	//    5    7:ireturn         
	}

	public void setPrimaryBackground(Drawable drawable)
	{
		boolean flag;
		boolean flag1;
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Drawable a>
	//*   2    4:ifnull          23
		{
			a.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #66  <Field Drawable a>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #251 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(a);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #66  <Field Drawable a>
	//   10   20:invokevirtual   #254 <Method void unscheduleDrawable(Drawable)>
		}
		a = drawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #66  <Field Drawable a>
		if(drawable != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          79
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #251 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(h != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #165 <Field View h>
	//*  21   41:ifnull          79
				a.setBounds(h.getLeft(), h.getTop(), h.getRight(), h.getBottom());
	//   22   44:aload_0         
	//   23   45:getfield        #66  <Field Drawable a>
	//   24   48:aload_0         
	//   25   49:getfield        #165 <Field View h>
	//   26   52:invokevirtual   #197 <Method int View.getLeft()>
	//   27   55:aload_0         
	//   28   56:getfield        #165 <Field View h>
	//   29   59:invokevirtual   #200 <Method int View.getTop()>
	//   30   62:aload_0         
	//   31   63:getfield        #165 <Field View h>
	//   32   66:invokevirtual   #203 <Method int View.getRight()>
	//   33   69:aload_0         
	//   34   70:getfield        #165 <Field View h>
	//   35   73:invokevirtual   #206 <Method int View.getBottom()>
	//   36   76:invokevirtual   #194 <Method void Drawable.setBounds(int, int, int, int)>
		}
		flag = d;
	//   37   79:aload_0         
	//   38   80:getfield        #91  <Field boolean d>
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
		if(c != null) goto _L4; else goto _L3
	//   46   92:aload_0         
	//   47   93:getfield        #96  <Field Drawable c>
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
		if(a != null)
			break; /* Loop/switch isn't completed */
	//   54  106:aload_0         
	//   55  107:getfield        #66  <Field Drawable a>
	//   56  110:ifnonnull       125
		flag = flag1;
	//   57  113:iload_3         
	//   58  114:istore_2        
		if(b != null) goto _L4; else goto _L3
	//   59  115:aload_0         
	//   60  116:getfield        #71  <Field Drawable b>
	//   61  119:ifnonnull       125
	//*  62  122:goto            99
_L4:
		setWillNotDraw(flag);
	//   63  125:aload_0         
	//   64  126:iload_2         
	//   65  127:invokevirtual   #104 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   66  130:aload_0         
	//   67  131:invokevirtual   #211 <Method void invalidate()>
		return;
	//   68  134:return          
	}

	public void setSplitBackground(Drawable drawable)
	{
		boolean flag1;
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field Drawable c>
	//*   2    4:ifnull          23
		{
			c.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #96  <Field Drawable c>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #251 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(c);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #96  <Field Drawable c>
	//   10   20:invokevirtual   #254 <Method void unscheduleDrawable(Drawable)>
		}
		c = drawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #96  <Field Drawable c>
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
	//   20   36:invokevirtual   #251 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(d && c != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #91  <Field boolean d>
	//*  23   43:ifeq            70
	//*  24   46:aload_0         
	//*  25   47:getfield        #96  <Field Drawable c>
	//*  26   50:ifnull          70
				c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//   27   53:aload_0         
	//   28   54:getfield        #96  <Field Drawable c>
	//   29   57:iconst_0        
	//   30   58:iconst_0        
	//   31   59:aload_0         
	//   32   60:invokevirtual   #191 <Method int getMeasuredWidth()>
	//   33   63:aload_0         
	//   34   64:invokevirtual   #184 <Method int getMeasuredHeight()>
	//   35   67:invokevirtual   #194 <Method void Drawable.setBounds(int, int, int, int)>
		}
		if(!d) goto _L2; else goto _L1
	//   36   70:aload_0         
	//   37   71:getfield        #91  <Field boolean d>
	//   38   74:ifeq            91
_L1:
		boolean flag = flag1;
	//   39   77:iload_3         
	//   40   78:istore_2        
		if(c != null) goto _L4; else goto _L3
	//   41   79:aload_0         
	//   42   80:getfield        #96  <Field Drawable c>
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
		if(a != null)
			break; /* Loop/switch isn't completed */
	//   49   93:aload_0         
	//   50   94:getfield        #66  <Field Drawable a>
	//   51   97:ifnonnull       112
		flag = flag1;
	//   52  100:iload_3         
	//   53  101:istore_2        
		if(b != null) goto _L4; else goto _L3
	//   54  102:aload_0         
	//   55  103:getfield        #71  <Field Drawable b>
	//   56  106:ifnonnull       112
	//*  57  109:goto            86
_L4:
		setWillNotDraw(flag);
	//   58  112:aload_0         
	//   59  113:iload_2         
	//   60  114:invokevirtual   #104 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   61  117:aload_0         
	//   62  118:invokevirtual   #211 <Method void invalidate()>
		return;
	//   63  121:return          
	}

	public void setStackedBackground(Drawable drawable)
	{
		boolean flag;
		boolean flag1;
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field Drawable b>
	//*   2    4:ifnull          23
		{
			b.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field Drawable b>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #251 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			unscheduleDrawable(b);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #71  <Field Drawable b>
	//   10   20:invokevirtual   #254 <Method void unscheduleDrawable(Drawable)>
		}
		b = drawable;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #71  <Field Drawable b>
		if(drawable != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          86
		{
			drawable.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #251 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(e && b != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #208 <Field boolean e>
	//*  21   41:ifeq            86
	//*  22   44:aload_0         
	//*  23   45:getfield        #71  <Field Drawable b>
	//*  24   48:ifnull          86
				b.setBounds(g.getLeft(), g.getTop(), g.getRight(), g.getBottom());
	//   25   51:aload_0         
	//   26   52:getfield        #71  <Field Drawable b>
	//   27   55:aload_0         
	//   28   56:getfield        #147 <Field View g>
	//   29   59:invokevirtual   #197 <Method int View.getLeft()>
	//   30   62:aload_0         
	//   31   63:getfield        #147 <Field View g>
	//   32   66:invokevirtual   #200 <Method int View.getTop()>
	//   33   69:aload_0         
	//   34   70:getfield        #147 <Field View g>
	//   35   73:invokevirtual   #203 <Method int View.getRight()>
	//   36   76:aload_0         
	//   37   77:getfield        #147 <Field View g>
	//   38   80:invokevirtual   #206 <Method int View.getBottom()>
	//   39   83:invokevirtual   #194 <Method void Drawable.setBounds(int, int, int, int)>
		}
		flag = d;
	//   40   86:aload_0         
	//   41   87:getfield        #91  <Field boolean d>
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
		if(c != null) goto _L4; else goto _L3
	//   49   99:aload_0         
	//   50  100:getfield        #96  <Field Drawable c>
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
		if(a != null)
			break; /* Loop/switch isn't completed */
	//   57  113:aload_0         
	//   58  114:getfield        #66  <Field Drawable a>
	//   59  117:ifnonnull       132
		flag = flag1;
	//   60  120:iload_3         
	//   61  121:istore_2        
		if(b != null) goto _L4; else goto _L3
	//   62  122:aload_0         
	//   63  123:getfield        #71  <Field Drawable b>
	//   64  126:ifnonnull       132
	//*  65  129:goto            106
_L4:
		setWillNotDraw(flag);
	//   66  132:aload_0         
	//   67  133:iload_2         
	//   68  134:invokevirtual   #104 <Method void setWillNotDraw(boolean)>
		invalidate();
	//   69  137:aload_0         
	//   70  138:invokevirtual   #211 <Method void invalidate()>
		return;
	//   71  141:return          
	}

	public void setTabContainer(ScrollingTabContainerView scrollingtabcontainerview)
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #147 <Field View g>
	//*   2    4:ifnull          15
			removeView(g);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #147 <Field View g>
	//    6   12:invokevirtual   #262 <Method void removeView(View)>
		g = ((View) (scrollingtabcontainerview));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #147 <Field View g>
		if(scrollingtabcontainerview != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          50
		{
			addView(((View) (scrollingtabcontainerview)));
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #265 <Method void addView(View)>
			android.view.ViewGroup.LayoutParams layoutparams = scrollingtabcontainerview.getLayoutParams();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #268 <Method android.view.ViewGroup$LayoutParams ScrollingTabContainerView.getLayoutParams()>
	//   17   33:astore_2        
			layoutparams.width = -1;
	//   18   34:aload_2         
	//   19   35:iconst_m1       
	//   20   36:putfield        #273 <Field int android.view.ViewGroup$LayoutParams.width>
			layoutparams.height = -2;
	//   21   39:aload_2         
	//   22   40:bipush          -2
	//   23   42:putfield        #276 <Field int android.view.ViewGroup$LayoutParams.height>
			scrollingtabcontainerview.setAllowCollapse(false);
	//   24   45:aload_1         
	//   25   46:iconst_0        
	//   26   47:invokevirtual   #279 <Method void ScrollingTabContainerView.setAllowCollapse(boolean)>
		}
	//   27   50:return          
	}

	public void setTransitioning(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #177 <Field boolean f>
		int k;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            16
			k = 0x60000;
	//    5    9:ldc2            #281 <Int 0x60000>
	//    6   12:istore_2        
		else
	//*   7   13:goto            20
			k = 0x40000;
	//    8   16:ldc2            #282 <Int 0x40000>
	//    9   19:istore_2        
		setDescendantFocusability(k);
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:invokevirtual   #286 <Method void setDescendantFocusability(int)>
	//   13   25:return          
	}

	public void setVisibility(int k)
	{
		super.setVisibility(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #289 <Method void FrameLayout.setVisibility(int)>
		boolean flag;
		if(k == 0)
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
		if(a != null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #66  <Field Drawable a>
	//*  12   20:ifnull          33
			a.setVisible(flag, false);
	//   13   23:aload_0         
	//   14   24:getfield        #66  <Field Drawable a>
	//   15   27:iload_2         
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #293 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   18   32:pop             
		if(b != null)
	//*  19   33:aload_0         
	//*  20   34:getfield        #71  <Field Drawable b>
	//*  21   37:ifnull          50
			b.setVisible(flag, false);
	//   22   40:aload_0         
	//   23   41:getfield        #71  <Field Drawable b>
	//   24   44:iload_2         
	//   25   45:iconst_0        
	//   26   46:invokevirtual   #293 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   27   49:pop             
		if(c != null)
	//*  28   50:aload_0         
	//*  29   51:getfield        #96  <Field Drawable c>
	//*  30   54:ifnull          67
			c.setVisible(flag, false);
	//   31   57:aload_0         
	//   32   58:getfield        #96  <Field Drawable c>
	//   33   61:iload_2         
	//   34   62:iconst_0        
	//   35   63:invokevirtual   #293 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   36   66:pop             
	//   37   67:return          
	}

	public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public ActionMode startActionModeForChild(View view, android.view.ActionMode.Callback callback, int k)
	{
		if(k != 0)
	//*   0    0:iload_3         
	//*   1    1:ifeq            12
			return super.startActionModeForChild(view, callback, k);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #298 <Method ActionMode FrameLayout.startActionModeForChild(View, android.view.ActionMode$Callback, int)>
	//    7   11:areturn         
		else
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return drawable == a && !d || drawable == b && e || drawable == c && d || super.verifyDrawable(drawable);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #66  <Field Drawable a>
	//    3    5:if_acmpne       15
	//    4    8:aload_0         
	//    5    9:getfield        #91  <Field boolean d>
	//    6   12:ifeq            53
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #71  <Field Drawable b>
	//   10   20:if_acmpne       30
	//   11   23:aload_0         
	//   12   24:getfield        #208 <Field boolean e>
	//   13   27:ifne            53
	//   14   30:aload_1         
	//   15   31:aload_0         
	//   16   32:getfield        #96  <Field Drawable c>
	//   17   35:if_acmpne       45
	//   18   38:aload_0         
	//   19   39:getfield        #91  <Field boolean d>
	//   20   42:ifne            53
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:invokespecial   #302 <Method boolean FrameLayout.verifyDrawable(Drawable)>
	//   24   50:ifeq            55
	//   25   53:iconst_1        
	//   26   54:ireturn         
	//   27   55:iconst_0        
	//   28   56:ireturn         
	}

	Drawable a;
	Drawable b;
	Drawable c;
	boolean d;
	boolean e;
	private boolean f;
	private View g;
	private View h;
	private View i;
	private int j;
}
