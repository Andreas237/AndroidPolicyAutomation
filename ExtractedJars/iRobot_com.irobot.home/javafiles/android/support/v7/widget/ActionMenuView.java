// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.*;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat, ActionMenuPresenter, bd

public class ActionMenuView extends LinearLayoutCompat
	implements android.support.v7.view.menu.h.b, p
{
	public static class LayoutParams extends LinearLayoutCompat.LayoutParams
	{

		public boolean a;
		public int b;
		public int c;
		public boolean d;
		public boolean e;
		boolean f;

		public LayoutParams(int i1, int j1)
		{
			super(i1, j1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #20  <Method void LinearLayoutCompat$LayoutParams(int, int)>
			a = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #22  <Field boolean a>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #26  <Method void LinearLayoutCompat$LayoutParams(Context, AttributeSet)>
		//    4    6:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
			a = layoutparams.a;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:getfield        #22  <Field boolean a>
		//    6   10:putfield        #22  <Field boolean a>
		//    7   13:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #30  <Method void LinearLayoutCompat$LayoutParams(android.view.ViewGroup$LayoutParams)>
		//    3    5:return          
		}
	}

	public static interface a
	{

		public abstract boolean c();

		public abstract boolean d();
	}

	private static class b
		implements android.support.v7.view.menu.o.a
	{

		public void a(h h1, boolean flag)
		{
		//    0    0:return          
		}

		public boolean a(h h1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	private class c
		implements android.support.v7.view.menu.h.a
	{

		public void a(h h1)
		{
			if(a.a != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field ActionMenuView a>
		//*   2    4:getfield        #23  <Field android.support.v7.view.menu.h$a ActionMenuView.a>
		//*   3    7:ifnull          23
				a.a.a(h1);
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field ActionMenuView a>
		//    6   14:getfield        #23  <Field android.support.v7.view.menu.h$a ActionMenuView.a>
		//    7   17:aload_1         
		//    8   18:invokeinterface #25  <Method void android.support.v7.view.menu.h$a.a(h)>
		//    9   23:return          
		}

		public boolean a(h h1, MenuItem menuitem)
		{
			return a.b != null && a.b.a(menuitem);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field ActionMenuView a>
		//    2    4:getfield        #30  <Field ActionMenuView$d ActionMenuView.b>
		//    3    7:ifnull          28
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field ActionMenuView a>
		//    6   14:getfield        #30  <Field ActionMenuView$d ActionMenuView.b>
		//    7   17:aload_2         
		//    8   18:invokeinterface #35  <Method boolean ActionMenuView$d.a(MenuItem)>
		//    9   23:ifeq            28
		//   10   26:iconst_1        
		//   11   27:ireturn         
		//   12   28:iconst_0        
		//   13   29:ireturn         
		}

		final ActionMenuView a;

		c()
		{
			a = ActionMenuView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ActionMenuView a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	public static interface d
	{

		public abstract boolean a(MenuItem menuitem);
	}


	public ActionMenuView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #44  <Method void ActionMenuView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionMenuView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method void LinearLayoutCompat(Context, AttributeSet)>
		setBaselineAligned(false);
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:invokevirtual   #50  <Method void setBaselineAligned(boolean)>
		float f1 = context.getResources().getDisplayMetrics().density;
	//    7   11:aload_1         
	//    8   12:invokevirtual   #56  <Method Resources Context.getResources()>
	//    9   15:invokevirtual   #62  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   10   18:getfield        #68  <Field float DisplayMetrics.density>
	//   11   21:fstore_3        
		k = (int)(56F * f1);
	//   12   22:aload_0         
	//   13   23:ldc1            #69  <Float 56F>
	//   14   25:fload_3         
	//   15   26:fmul            
	//   16   27:f2i             
	//   17   28:putfield        #71  <Field int k>
		l = (int)(f1 * 4F);
	//   18   31:aload_0         
	//   19   32:fload_3         
	//   20   33:ldc1            #72  <Float 4F>
	//   21   35:fmul            
	//   22   36:f2i             
	//   23   37:putfield        #74  <Field int l>
		d = context;
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:putfield        #76  <Field Context d>
		e = 0;
	//   27   45:aload_0         
	//   28   46:iconst_0        
	//   29   47:putfield        #78  <Field int e>
	//   30   50:return          
	}

	static int a(View view, int i1, int j1, int k1, int l1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//    3    7:astore          11
		int j2 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k1) - l1, android.view.View.MeasureSpec.getMode(k1));
	//    4    9:iload_3         
	//    5   10:invokestatic    #91  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    6   13:iload           4
	//    7   15:isub            
	//    8   16:iload_3         
	//    9   17:invokestatic    #94  <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   20:invokestatic    #98  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   11   23:istore          6
		ActionMenuItemView actionmenuitemview;
		if(view instanceof ActionMenuItemView)
	//*  12   25:aload_0         
	//*  13   26:instanceof      #100 <Class ActionMenuItemView>
	//*  14   29:ifeq            41
			actionmenuitemview = (ActionMenuItemView)view;
	//   15   32:aload_0         
	//   16   33:checkcast       #100 <Class ActionMenuItemView>
	//   17   36:astore          10
		else
	//*  18   38:goto            44
			actionmenuitemview = null;
	//   19   41:aconst_null     
	//   20   42:astore          10
		boolean flag1 = false;
	//   21   44:iconst_0        
	//   22   45:istore          9
		if(actionmenuitemview != null && actionmenuitemview.b())
	//*  23   47:aload           10
	//*  24   49:ifnull          65
	//*  25   52:aload           10
	//*  26   54:invokevirtual   #103 <Method boolean ActionMenuItemView.b()>
	//*  27   57:ifeq            65
			k1 = 1;
	//   28   60:iconst_1        
	//   29   61:istore_3        
		else
	//*  30   62:goto            67
			k1 = 0;
	//   31   65:iconst_0        
	//   32   66:istore_3        
		l1 = 2;
	//   33   67:iconst_2        
	//   34   68:istore          4
		if(j1 > 0 && (k1 == 0 || j1 >= 2))
	//*  35   70:iload_2         
	//*  36   71:ifle            142
	//*  37   74:iload_3         
	//*  38   75:ifeq            83
	//*  39   78:iload_2         
	//*  40   79:iconst_2        
	//*  41   80:icmplt          142
		{
			view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1 * i1, 0x80000000), j2);
	//   42   83:aload_0         
	//   43   84:iload_2         
	//   44   85:iload_1         
	//   45   86:imul            
	//   46   87:ldc1            #104 <Int 0x80000000>
	//   47   89:invokestatic    #98  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   48   92:iload           6
	//   49   94:invokevirtual   #108 <Method void View.measure(int, int)>
			int k2 = view.getMeasuredWidth();
	//   50   97:aload_0         
	//   51   98:invokevirtual   #112 <Method int View.getMeasuredWidth()>
	//   52  101:istore          7
			int i2 = k2 / i1;
	//   53  103:iload           7
	//   54  105:iload_1         
	//   55  106:idiv            
	//   56  107:istore          5
			j1 = i2;
	//   57  109:iload           5
	//   58  111:istore_2        
			if(k2 % i1 != 0)
	//*  59  112:iload           7
	//*  60  114:iload_1         
	//*  61  115:irem            
	//*  62  116:ifeq            124
				j1 = i2 + 1;
	//   63  119:iload           5
	//   64  121:iconst_1        
	//   65  122:iadd            
	//   66  123:istore_2        
			if(k1 != 0 && j1 < 2)
	//*  67  124:iload_3         
	//*  68  125:ifeq            139
	//*  69  128:iload_2         
	//*  70  129:iconst_2        
	//*  71  130:icmpge          139
				j1 = l1;
	//   72  133:iload           4
	//   73  135:istore_2        
		} else
	//*  74  136:goto            144
	//*  75  139:goto            144
		{
			j1 = 0;
	//   76  142:iconst_0        
	//   77  143:istore_2        
		}
		boolean flag = flag1;
	//   78  144:iload           9
	//   79  146:istore          8
		if(!layoutparams.a)
	//*  80  148:aload           11
	//*  81  150:getfield        #114 <Field boolean ActionMenuView$LayoutParams.a>
	//*  82  153:ifne            167
		{
			flag = flag1;
	//   83  156:iload           9
	//   84  158:istore          8
			if(k1 != 0)
	//*  85  160:iload_3         
	//*  86  161:ifeq            167
				flag = true;
	//   87  164:iconst_1        
	//   88  165:istore          8
		}
		layoutparams.d = flag;
	//   89  167:aload           11
	//   90  169:iload           8
	//   91  171:putfield        #116 <Field boolean ActionMenuView$LayoutParams.d>
		layoutparams.b = j1;
	//   92  174:aload           11
	//   93  176:iload_2         
	//   94  177:putfield        #118 <Field int ActionMenuView$LayoutParams.b>
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1 * j1, 0x40000000), j2);
	//   95  180:aload_0         
	//   96  181:iload_1         
	//   97  182:iload_2         
	//   98  183:imul            
	//   99  184:ldc1            #119 <Int 0x40000000>
	//  100  186:invokestatic    #98  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  101  189:iload           6
	//  102  191:invokevirtual   #108 <Method void View.measure(int, int)>
		return j1;
	//  103  194:iload_2         
	//  104  195:ireturn         
	}

	private void c(int i1, int j1)
	{
		boolean flag;
		int l2;
		int i3;
		int j3;
		int k4;
		int l4;
		int i5;
		int l5;
		int j7;
		int k7;
		long l7;
		j7 = android.view.View.MeasureSpec.getMode(j1);
	//    0    0:iload_2         
	//    1    1:invokestatic    #94  <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          20
		i1 = android.view.View.MeasureSpec.getSize(i1);
	//    3    6:iload_1         
	//    4    7:invokestatic    #91  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_1        
		l2 = android.view.View.MeasureSpec.getSize(j1);
	//    6   11:iload_2         
	//    7   12:invokestatic    #91  <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   15:istore          7
		int k1 = getPaddingLeft();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #122 <Method int getPaddingLeft()>
	//   11   21:istore          5
		int j2 = getPaddingRight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #125 <Method int getPaddingRight()>
	//   14   27:istore          6
		int j5 = getPaddingTop() + getPaddingBottom();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #128 <Method int getPaddingTop()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #131 <Method int getPaddingBottom()>
	//   19   37:iadd            
	//   20   38:istore          14
		int k3 = getChildMeasureSpec(j1, j5, -2);
	//   21   40:iload_2         
	//   22   41:iload           14
	//   23   43:bipush          -2
	//   24   45:invokestatic    #135 <Method int getChildMeasureSpec(int, int, int)>
	//   25   48:istore          10
		k4 = i1 - (k1 + j2);
	//   26   50:iload_1         
	//   27   51:iload           5
	//   28   53:iload           6
	//   29   55:iadd            
	//   30   56:isub            
	//   31   57:istore          11
		i1 = k4 / k;
	//   32   59:iload           11
	//   33   61:aload_0         
	//   34   62:getfield        #71  <Field int k>
	//   35   65:idiv            
	//   36   66:istore_1        
		j1 = k;
	//   37   67:aload_0         
	//   38   68:getfield        #71  <Field int k>
	//   39   71:istore_2        
		if(i1 == 0)
	//*  40   72:iload_1         
	//*  41   73:ifne            84
		{
			setMeasuredDimension(k4, 0);
	//   42   76:aload_0         
	//   43   77:iload           11
	//   44   79:iconst_0        
	//   45   80:invokevirtual   #138 <Method void setMeasuredDimension(int, int)>
			return;
	//   46   83:return          
		}
		k7 = k + (k4 % j1) / i1;
	//   47   84:aload_0         
	//   48   85:getfield        #71  <Field int k>
	//   49   88:iload           11
	//   50   90:iload_2         
	//   51   91:irem            
	//   52   92:iload_1         
	//   53   93:idiv            
	//   54   94:iadd            
	//   55   95:istore          21
		int i6 = getChildCount();
	//   56   97:aload_0         
	//   57   98:invokevirtual   #141 <Method int getChildCount()>
	//   58  101:istore          16
		j3 = 0;
	//   59  103:iconst_0        
	//   60  104:istore          9
		i3 = 0;
	//   61  106:iconst_0        
	//   62  107:istore          8
		flag = false;
	//   63  109:iconst_0        
	//   64  110:istore          5
		i5 = 0;
	//   65  112:iconst_0        
	//   66  113:istore          13
		l4 = 0;
	//   67  115:iconst_0        
	//   68  116:istore          12
		j2 = 0;
	//   69  118:iconst_0        
	//   70  119:istore          6
		l7 = 0L;
	//   71  121:lconst_0        
	//   72  122:lstore          22
		j1 = l2;
	//   73  124:iload           7
	//   74  126:istore_2        
		for(; j3 < i6; j3++)
	//*  75  127:iload           9
	//*  76  129:iload           16
	//*  77  131:icmpge          388
		{
			View view = getChildAt(j3);
	//   78  134:aload_0         
	//   79  135:iload           9
	//   80  137:invokevirtual   #145 <Method View getChildAt(int)>
	//   81  140:astore          31
			if(view.getVisibility() == 8)
	//*  82  142:aload           31
	//*  83  144:invokevirtual   #148 <Method int View.getVisibility()>
	//*  84  147:bipush          8
	//*  85  149:icmpne          155
				continue;
	//   86  152:goto            379
			boolean flag2 = view instanceof ActionMenuItemView;
	//   87  155:aload           31
	//   88  157:instanceof      #100 <Class ActionMenuItemView>
	//   89  160:istore          30
			i5++;
	//   90  162:iload           13
	//   91  164:iconst_1        
	//   92  165:iadd            
	//   93  166:istore          13
			if(flag2)
	//*  94  168:iload           30
	//*  95  170:ifeq            191
				view.setPadding(l, 0, l, 0);
	//   96  173:aload           31
	//   97  175:aload_0         
	//   98  176:getfield        #74  <Field int l>
	//   99  179:iconst_0        
	//  100  180:aload_0         
	//  101  181:getfield        #74  <Field int l>
	//  102  184:iconst_0        
	//  103  185:invokevirtual   #152 <Method void View.setPadding(int, int, int, int)>
	//* 104  188:goto            191
			LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
	//  105  191:aload           31
	//  106  193:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  107  196:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//  108  199:astore          32
			layoutparams1.f = false;
	//  109  201:aload           32
	//  110  203:iconst_0        
	//  111  204:putfield        #154 <Field boolean ActionMenuView$LayoutParams.f>
			layoutparams1.c = 0;
	//  112  207:aload           32
	//  113  209:iconst_0        
	//  114  210:putfield        #156 <Field int ActionMenuView$LayoutParams.c>
			layoutparams1.b = 0;
	//  115  213:aload           32
	//  116  215:iconst_0        
	//  117  216:putfield        #118 <Field int ActionMenuView$LayoutParams.b>
			layoutparams1.d = false;
	//  118  219:aload           32
	//  119  221:iconst_0        
	//  120  222:putfield        #116 <Field boolean ActionMenuView$LayoutParams.d>
			layoutparams1.leftMargin = 0;
	//  121  225:aload           32
	//  122  227:iconst_0        
	//  123  228:putfield        #159 <Field int ActionMenuView$LayoutParams.leftMargin>
			layoutparams1.rightMargin = 0;
	//  124  231:aload           32
	//  125  233:iconst_0        
	//  126  234:putfield        #162 <Field int ActionMenuView$LayoutParams.rightMargin>
			if(flag2 && ((ActionMenuItemView)view).b())
	//* 127  237:iload           30
	//* 128  239:ifeq            259
	//* 129  242:aload           31
	//* 130  244:checkcast       #100 <Class ActionMenuItemView>
	//* 131  247:invokevirtual   #103 <Method boolean ActionMenuItemView.b()>
	//* 132  250:ifeq            259
				flag2 = true;
	//  133  253:iconst_1        
	//  134  254:istore          30
			else
	//* 135  256:goto            262
				flag2 = false;
	//  136  259:iconst_0        
	//  137  260:istore          30
			layoutparams1.e = flag2;
	//  138  262:aload           32
	//  139  264:iload           30
	//  140  266:putfield        #164 <Field boolean ActionMenuView$LayoutParams.e>
			if(layoutparams1.a)
	//* 141  269:aload           32
	//* 142  271:getfield        #114 <Field boolean ActionMenuView$LayoutParams.a>
	//* 143  274:ifeq            283
				l2 = 1;
	//  144  277:iconst_1        
	//  145  278:istore          7
			else
	//* 146  280:goto            286
				l2 = i1;
	//  147  283:iload_1         
	//  148  284:istore          7
			int k5 = a(view, k7, l2, k3, j5);
	//  149  286:aload           31
	//  150  288:iload           21
	//  151  290:iload           7
	//  152  292:iload           10
	//  153  294:iload           14
	//  154  296:invokestatic    #166 <Method int a(View, int, int, int, int)>
	//  155  299:istore          15
			l4 = Math.max(l4, k5);
	//  156  301:iload           12
	//  157  303:iload           15
	//  158  305:invokestatic    #171 <Method int Math.max(int, int)>
	//  159  308:istore          12
			l2 = j2;
	//  160  310:iload           6
	//  161  312:istore          7
			if(layoutparams1.d)
	//* 162  314:aload           32
	//* 163  316:getfield        #116 <Field boolean ActionMenuView$LayoutParams.d>
	//* 164  319:ifeq            328
				l2 = j2 + 1;
	//  165  322:iload           6
	//  166  324:iconst_1        
	//  167  325:iadd            
	//  168  326:istore          7
			if(layoutparams1.a)
	//* 169  328:aload           32
	//* 170  330:getfield        #114 <Field boolean ActionMenuView$LayoutParams.a>
	//* 171  333:ifeq            339
				flag = true;
	//  172  336:iconst_1        
	//  173  337:istore          5
			i1 -= k5;
	//  174  339:iload_1         
	//  175  340:iload           15
	//  176  342:isub            
	//  177  343:istore_1        
			i3 = Math.max(i3, view.getMeasuredHeight());
	//  178  344:iload           8
	//  179  346:aload           31
	//  180  348:invokevirtual   #174 <Method int View.getMeasuredHeight()>
	//  181  351:invokestatic    #171 <Method int Math.max(int, int)>
	//  182  354:istore          8
			if(k5 == 1)
	//* 183  356:iload           15
	//* 184  358:iconst_1        
	//* 185  359:icmpne          375
				l7 |= 1 << j3;
	//  186  362:lload           22
	//  187  364:iconst_1        
	//  188  365:iload           9
	//  189  367:ishl            
	//  190  368:i2l             
	//  191  369:lor             
	//  192  370:lstore          22
	//* 193  372:goto            375
			j2 = l2;
	//  194  375:iload           7
	//  195  377:istore          6
		}

	//  196  379:iload           9
	//  197  381:iconst_1        
	//  198  382:iadd            
	//  199  383:istore          9
	//* 200  385:goto            127
		if(flag && i5 == 2)
	//* 201  388:iload           5
	//* 202  390:ifeq            405
	//* 203  393:iload           13
	//* 204  395:iconst_2        
	//* 205  396:icmpne          405
			j5 = 1;
	//  206  399:iconst_1        
	//  207  400:istore          14
		else
	//* 208  402:goto            408
			j5 = 0;
	//  209  405:iconst_0        
	//  210  406:istore          14
		boolean flag1 = false;
	//  211  408:iconst_0        
	//  212  409:istore          17
		l5 = i1;
	//  213  411:iload_1         
	//  214  412:istore          15
		l2 = i6;
	//  215  414:iload           16
	//  216  416:istore          7
		j3 = k3;
	//  217  418:iload           10
	//  218  420:istore          9
		i1 = ((int) (flag1));
	//  219  422:iload           17
	//  220  424:istore_1        
		do
		{
			if(j2 <= 0 || l5 <= 0)
				break;
	//  221  425:iload           6
	//  222  427:ifle            769
	//  223  430:iload           15
	//  224  432:ifle            769
			int k6 = 0;
	//  225  435:iconst_0        
	//  226  436:istore          17
			int l6 = 0;
	//  227  438:iconst_0        
	//  228  439:istore          18
			int j6 = 0x7fffffff;
	//  229  441:ldc1            #175 <Int 0x7fffffff>
	//  230  443:istore          16
			long l8;
			long l10;
			for(l10 = 0L; k6 < l2; l10 = l8)
	//* 231  445:lconst_0        
	//* 232  446:lstore          26
	//* 233  448:iload           17
	//* 234  450:iload           7
	//* 235  452:icmpge          589
			{
				LayoutParams layoutparams = (LayoutParams)getChildAt(k6).getLayoutParams();
	//  236  455:aload_0         
	//  237  456:iload           17
	//  238  458:invokevirtual   #145 <Method View getChildAt(int)>
	//  239  461:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  240  464:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//  241  467:astore          31
				int l3;
				int i7;
				if(!layoutparams.d)
	//* 242  469:aload           31
	//* 243  471:getfield        #116 <Field boolean ActionMenuView$LayoutParams.d>
	//* 244  474:ifne            492
				{
					l3 = l6;
	//  245  477:iload           18
	//  246  479:istore          10
					i7 = j6;
	//  247  481:iload           16
	//  248  483:istore          19
					l8 = l10;
	//  249  485:lload           26
	//  250  487:lstore          24
				} else
	//* 251  489:goto            568
				if(layoutparams.b < j6)
	//* 252  492:aload           31
	//* 253  494:getfield        #118 <Field int ActionMenuView$LayoutParams.b>
	//* 254  497:iload           16
	//* 255  499:icmpge          522
				{
					i7 = layoutparams.b;
	//  256  502:aload           31
	//  257  504:getfield        #118 <Field int ActionMenuView$LayoutParams.b>
	//  258  507:istore          19
					l8 = 1 << k6;
	//  259  509:iconst_1        
	//  260  510:iload           17
	//  261  512:ishl            
	//  262  513:i2l             
	//  263  514:lstore          24
					l3 = 1;
	//  264  516:iconst_1        
	//  265  517:istore          10
				} else
	//* 266  519:goto            568
				{
					l3 = l6;
	//  267  522:iload           18
	//  268  524:istore          10
					i7 = j6;
	//  269  526:iload           16
	//  270  528:istore          19
					l8 = l10;
	//  271  530:lload           26
	//  272  532:lstore          24
					if(layoutparams.b == j6)
	//* 273  534:aload           31
	//* 274  536:getfield        #118 <Field int ActionMenuView$LayoutParams.b>
	//* 275  539:iload           16
	//* 276  541:icmpne          568
					{
						l8 = 1 << k6;
	//  277  544:iconst_1        
	//  278  545:iload           17
	//  279  547:ishl            
	//  280  548:i2l             
	//  281  549:lstore          24
						l3 = l6 + 1;
	//  282  551:iload           18
	//  283  553:iconst_1        
	//  284  554:iadd            
	//  285  555:istore          10
						l8 = l10 | l8;
	//  286  557:lload           26
	//  287  559:lload           24
	//  288  561:lor             
	//  289  562:lstore          24
						i7 = j6;
	//  290  564:iload           16
	//  291  566:istore          19
					}
				}
				k6++;
	//  292  568:iload           17
	//  293  570:iconst_1        
	//  294  571:iadd            
	//  295  572:istore          17
				l6 = l3;
	//  296  574:iload           10
	//  297  576:istore          18
				j6 = i7;
	//  298  578:iload           19
	//  299  580:istore          16
			}

	//  300  582:lload           24
	//  301  584:lstore          26
	//* 302  586:goto            448
			l7 |= l10;
	//  303  589:lload           22
	//  304  591:lload           26
	//  305  593:lor             
	//  306  594:lstore          22
			if(l6 > l5)
	//* 307  596:iload           18
	//* 308  598:iload           15
	//* 309  600:icmple          606
				break;
	//  310  603:goto            772
			for(i1 = 0; i1 < l2;)
	//* 311  606:iconst_0        
	//* 312  607:istore_1        
	//* 313  608:iload_1         
	//* 314  609:iload           7
	//* 315  611:icmpge          764
			{
				View view1 = getChildAt(i1);
	//  316  614:aload_0         
	//  317  615:iload_1         
	//  318  616:invokevirtual   #145 <Method View getChildAt(int)>
	//  319  619:astore          31
				LayoutParams layoutparams2 = (LayoutParams)view1.getLayoutParams();
	//  320  621:aload           31
	//  321  623:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  322  626:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//  323  629:astore          32
				long l11 = 1 << i1;
	//  324  631:iconst_1        
	//  325  632:iload_1         
	//  326  633:ishl            
	//  327  634:i2l             
	//  328  635:lstore          28
				int i4;
				long l9;
				if((l10 & l11) == 0L)
	//* 329  637:lload           26
	//* 330  639:lload           28
	//* 331  641:land            
	//* 332  642:lconst_0        
	//* 333  643:lcmp            
	//* 334  644:ifne            681
				{
					i4 = l5;
	//  335  647:iload           15
	//  336  649:istore          10
					l9 = l7;
	//  337  651:lload           22
	//  338  653:lstore          24
					if(layoutparams2.b == j6 + 1)
	//* 339  655:aload           32
	//* 340  657:getfield        #118 <Field int ActionMenuView$LayoutParams.b>
	//* 341  660:iload           16
	//* 342  662:iconst_1        
	//* 343  663:iadd            
	//* 344  664:icmpne          749
					{
						l9 = l7 | l11;
	//  345  667:lload           22
	//  346  669:lload           28
	//  347  671:lor             
	//  348  672:lstore          24
						i4 = l5;
	//  349  674:iload           15
	//  350  676:istore          10
					}
				} else
	//* 351  678:goto            749
				{
					if(j5 && layoutparams2.e && l5 == 1)
	//* 352  681:iload           14
	//* 353  683:ifeq            721
	//* 354  686:aload           32
	//* 355  688:getfield        #164 <Field boolean ActionMenuView$LayoutParams.e>
	//* 356  691:ifeq            721
	//* 357  694:iload           15
	//* 358  696:iconst_1        
	//* 359  697:icmpne          721
						view1.setPadding(l + k7, 0, l, 0);
	//  360  700:aload           31
	//  361  702:aload_0         
	//  362  703:getfield        #74  <Field int l>
	//  363  706:iload           21
	//  364  708:iadd            
	//  365  709:iconst_0        
	//  366  710:aload_0         
	//  367  711:getfield        #74  <Field int l>
	//  368  714:iconst_0        
	//  369  715:invokevirtual   #152 <Method void View.setPadding(int, int, int, int)>
	//* 370  718:goto            721
					layoutparams2.b = layoutparams2.b + 1;
	//  371  721:aload           32
	//  372  723:aload           32
	//  373  725:getfield        #118 <Field int ActionMenuView$LayoutParams.b>
	//  374  728:iconst_1        
	//  375  729:iadd            
	//  376  730:putfield        #118 <Field int ActionMenuView$LayoutParams.b>
					layoutparams2.f = true;
	//  377  733:aload           32
	//  378  735:iconst_1        
	//  379  736:putfield        #154 <Field boolean ActionMenuView$LayoutParams.f>
					i4 = l5 - 1;
	//  380  739:iload           15
	//  381  741:iconst_1        
	//  382  742:isub            
	//  383  743:istore          10
					l9 = l7;
	//  384  745:lload           22
	//  385  747:lstore          24
				}
				i1++;
	//  386  749:iload_1         
	//  387  750:iconst_1        
	//  388  751:iadd            
	//  389  752:istore_1        
				l5 = i4;
	//  390  753:iload           10
	//  391  755:istore          15
				l7 = l9;
	//  392  757:lload           24
	//  393  759:lstore          22
			}

	//* 394  761:goto            608
			i1 = 1;
	//  395  764:iconst_1        
	//  396  765:istore_1        
		} while(true);
	//  397  766:goto            425
	//* 398  769:goto            603
		if(!flag && i5 == 1)
	//* 399  772:iload           5
	//* 400  774:ifne            789
	//* 401  777:iload           13
	//* 402  779:iconst_1        
	//* 403  780:icmpne          789
			flag = true;
	//  404  783:iconst_1        
	//  405  784:istore          5
		else
	//* 406  786:goto            792
			flag = false;
	//  407  789:iconst_0        
	//  408  790:istore          5
		if(l5 <= 0 || l7 == 0L || l5 >= i5 - 1 && !flag && l4 <= 1) goto _L2; else goto _L1
	//  409  792:iload           15
	//  410  794:ifle            1146
	//  411  797:lload           22
	//  412  799:lconst_0        
	//  413  800:lcmp            
	//  414  801:ifeq            1146
	//  415  804:iload           15
	//  416  806:iload           13
	//  417  808:iconst_1        
	//  418  809:isub            
	//  419  810:icmplt          824
	//  420  813:iload           5
	//  421  815:ifne            824
	//  422  818:iload           12
	//  423  820:iconst_1        
	//  424  821:icmple          1146
_L1:
		int i2;
		int k2;
		float f2 = Long.bitCount(l7);
	//  425  824:lload           22
	//  426  826:invokestatic    #181 <Method int Long.bitCount(long)>
	//  427  829:i2f             
	//  428  830:fstore          4
		if(!flag)
	//* 429  832:iload           5
	//* 430  834:ifne            930
		{
			float f1;
			if((1L & l7) != 0L)
	//* 431  837:lconst_1        
	//* 432  838:lload           22
	//* 433  840:land            
	//* 434  841:lconst_0        
	//* 435  842:lcmp            
	//* 436  843:ifeq            875
			{
				f1 = f2;
	//  437  846:fload           4
	//  438  848:fstore_3        
				if(!((LayoutParams)getChildAt(0).getLayoutParams()).e)
	//* 439  849:aload_0         
	//* 440  850:iconst_0        
	//* 441  851:invokevirtual   #145 <Method View getChildAt(int)>
	//* 442  854:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 443  857:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//* 444  860:getfield        #164 <Field boolean ActionMenuView$LayoutParams.e>
	//* 445  863:ifne            878
					f1 = f2 - 0.5F;
	//  446  866:fload           4
	//  447  868:ldc1            #182 <Float 0.5F>
	//  448  870:fsub            
	//  449  871:fstore_3        
			} else
	//* 450  872:goto            878
			{
				f1 = f2;
	//  451  875:fload           4
	//  452  877:fstore_3        
			}
			int l1 = l2 - 1;
	//  453  878:iload           7
	//  454  880:iconst_1        
	//  455  881:isub            
	//  456  882:istore          5
			f2 = f1;
	//  457  884:fload_3         
	//  458  885:fstore          4
			if(((long)(1 << l1) & l7) != 0L)
	//* 459  887:iconst_1        
	//* 460  888:iload           5
	//* 461  890:ishl            
	//* 462  891:i2l             
	//* 463  892:lload           22
	//* 464  894:land            
	//* 465  895:lconst_0        
	//* 466  896:lcmp            
	//* 467  897:ifeq            930
			{
				f2 = f1;
	//  468  900:fload_3         
	//  469  901:fstore          4
				if(!((LayoutParams)getChildAt(l1).getLayoutParams()).e)
	//* 470  903:aload_0         
	//* 471  904:iload           5
	//* 472  906:invokevirtual   #145 <Method View getChildAt(int)>
	//* 473  909:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 474  912:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//* 475  915:getfield        #164 <Field boolean ActionMenuView$LayoutParams.e>
	//* 476  918:ifne            930
					f2 = f1 - 0.5F;
	//  477  921:fload_3         
	//  478  922:ldc1            #182 <Float 0.5F>
	//  479  924:fsub            
	//  480  925:fstore          4
			}
		}
	//* 481  927:goto            930
		if(f2 > 0.0F)
	//* 482  930:fload           4
	//* 483  932:fconst_0        
	//* 484  933:fcmpl           
	//* 485  934:ifle            952
			i2 = (int)((float)(l5 * k7) / f2);
	//  486  937:iload           15
	//  487  939:iload           21
	//  488  941:imul            
	//  489  942:i2f             
	//  490  943:fload           4
	//  491  945:fdiv            
	//  492  946:f2i             
	//  493  947:istore          5
		else
	//* 494  949:goto            955
			i2 = 0;
	//  495  952:iconst_0        
	//  496  953:istore          5
		l4 = l2;
	//  497  955:iload           7
	//  498  957:istore          12
		k2 = 0;
	//  499  959:iconst_0        
	//  500  960:istore          6
_L8:
		int j4;
		View view2;
		LayoutParams layoutparams3;
		j4 = i1;
	//  501  962:iload_1         
	//  502  963:istore          10
		if(k2 >= l4)
			break; /* Loop/switch isn't completed */
	//  503  965:iload           6
	//  504  967:iload           12
	//  505  969:icmpge          1149
		if(((long)(1 << k2) & l7) == 0L)
	//* 506  972:iconst_1        
	//* 507  973:iload           6
	//* 508  975:ishl            
	//* 509  976:i2l             
	//* 510  977:lload           22
	//* 511  979:land            
	//* 512  980:lconst_0        
	//* 513  981:lcmp            
	//* 514  982:ifne            991
		{
			j4 = i1;
	//  515  985:iload_1         
	//  516  986:istore          10
			break MISSING_BLOCK_LABEL_1134;
	//  517  988:goto            1134
		}
		view2 = getChildAt(k2);
	//  518  991:aload_0         
	//  519  992:iload           6
	//  520  994:invokevirtual   #145 <Method View getChildAt(int)>
	//  521  997:astore          31
		layoutparams3 = (LayoutParams)view2.getLayoutParams();
	//  522  999:aload           31
	//  523 1001:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  524 1004:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//  525 1007:astore          32
		if(!(view2 instanceof ActionMenuItemView)) goto _L4; else goto _L3
	//  526 1009:aload           31
	//  527 1011:instanceof      #100 <Class ActionMenuItemView>
	//  528 1014:ifeq            1062
_L3:
		layoutparams3.c = i2;
	//  529 1017:aload           32
	//  530 1019:iload           5
	//  531 1021:putfield        #156 <Field int ActionMenuView$LayoutParams.c>
		layoutparams3.f = true;
	//  532 1024:aload           32
	//  533 1026:iconst_1        
	//  534 1027:putfield        #154 <Field boolean ActionMenuView$LayoutParams.f>
		if(k2 == 0 && !layoutparams3.e)
	//* 535 1030:iload           6
	//* 536 1032:ifne            1056
	//* 537 1035:aload           32
	//* 538 1037:getfield        #164 <Field boolean ActionMenuView$LayoutParams.e>
	//* 539 1040:ifne            1056
			layoutparams3.leftMargin = -i2 / 2;
	//  540 1043:aload           32
	//  541 1045:iload           5
	//  542 1047:ineg            
	//  543 1048:iconst_2        
	//  544 1049:idiv            
	//  545 1050:putfield        #159 <Field int ActionMenuView$LayoutParams.leftMargin>
	//* 546 1053:goto            1056
_L6:
		j4 = 1;
	//  547 1056:iconst_1        
	//  548 1057:istore          10
		break MISSING_BLOCK_LABEL_1134;
	//  549 1059:goto            1134
_L4:
		if(!layoutparams3.a)
			break; /* Loop/switch isn't completed */
	//  550 1062:aload           32
	//  551 1064:getfield        #114 <Field boolean ActionMenuView$LayoutParams.a>
	//  552 1067:ifeq            1096
		layoutparams3.c = i2;
	//  553 1070:aload           32
	//  554 1072:iload           5
	//  555 1074:putfield        #156 <Field int ActionMenuView$LayoutParams.c>
		layoutparams3.f = true;
	//  556 1077:aload           32
	//  557 1079:iconst_1        
	//  558 1080:putfield        #154 <Field boolean ActionMenuView$LayoutParams.f>
		layoutparams3.rightMargin = -i2 / 2;
	//  559 1083:aload           32
	//  560 1085:iload           5
	//  561 1087:ineg            
	//  562 1088:iconst_2        
	//  563 1089:idiv            
	//  564 1090:putfield        #162 <Field int ActionMenuView$LayoutParams.rightMargin>
		if(true) goto _L6; else goto _L5
	//  565 1093:goto            1056
_L5:
		if(k2 != 0)
	//* 566 1096:iload           6
	//* 567 1098:ifeq            1110
			layoutparams3.leftMargin = i2 / 2;
	//  568 1101:aload           32
	//  569 1103:iload           5
	//  570 1105:iconst_2        
	//  571 1106:idiv            
	//  572 1107:putfield        #159 <Field int ActionMenuView$LayoutParams.leftMargin>
		j4 = i1;
	//  573 1110:iload_1         
	//  574 1111:istore          10
		if(k2 != l4 - 1)
	//* 575 1113:iload           6
	//* 576 1115:iload           12
	//* 577 1117:iconst_1        
	//* 578 1118:isub            
	//* 579 1119:icmpeq          1134
		{
			layoutparams3.rightMargin = i2 / 2;
	//  580 1122:aload           32
	//  581 1124:iload           5
	//  582 1126:iconst_2        
	//  583 1127:idiv            
	//  584 1128:putfield        #162 <Field int ActionMenuView$LayoutParams.rightMargin>
			j4 = i1;
	//  585 1131:iload_1         
	//  586 1132:istore          10
		}
		k2++;
	//  587 1134:iload           6
	//  588 1136:iconst_1        
	//  589 1137:iadd            
	//  590 1138:istore          6
		i1 = j4;
	//  591 1140:iload           10
	//  592 1142:istore_1        
		if(true) goto _L8; else goto _L7
	//  593 1143:goto            962
_L2:
		j4 = i1;
	//  594 1146:iload_1         
	//  595 1147:istore          10
_L7:
		i1 = 0;
	//  596 1149:iconst_0        
	//  597 1150:istore_1        
		if(j4 != 0)
	//* 598 1151:iload           10
	//* 599 1153:ifeq            1223
			for(; i1 < l2; i1++)
	//* 600 1156:iload_1         
	//* 601 1157:iload           7
	//* 602 1159:icmpge          1223
			{
				View view3 = getChildAt(i1);
	//  603 1162:aload_0         
	//  604 1163:iload_1         
	//  605 1164:invokevirtual   #145 <Method View getChildAt(int)>
	//  606 1167:astore          31
				LayoutParams layoutparams4 = (LayoutParams)view3.getLayoutParams();
	//  607 1169:aload           31
	//  608 1171:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  609 1174:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//  610 1177:astore          32
				if(layoutparams4.f)
	//* 611 1179:aload           32
	//* 612 1181:getfield        #154 <Field boolean ActionMenuView$LayoutParams.f>
	//* 613 1184:ifne            1190
	//* 614 1187:goto            1216
					view3.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams4.b * k7 + layoutparams4.c, 0x40000000), j3);
	//  615 1190:aload           31
	//  616 1192:aload           32
	//  617 1194:getfield        #118 <Field int ActionMenuView$LayoutParams.b>
	//  618 1197:iload           21
	//  619 1199:imul            
	//  620 1200:aload           32
	//  621 1202:getfield        #156 <Field int ActionMenuView$LayoutParams.c>
	//  622 1205:iadd            
	//  623 1206:ldc1            #119 <Int 0x40000000>
	//  624 1208:invokestatic    #98  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  625 1211:iload           9
	//  626 1213:invokevirtual   #108 <Method void View.measure(int, int)>
			}

	//  627 1216:iload_1         
	//  628 1217:iconst_1        
	//  629 1218:iadd            
	//  630 1219:istore_1        
	//* 631 1220:goto            1156
		if(j7 != 0x40000000)
	//* 632 1223:iload           20
	//* 633 1225:ldc1            #119 <Int 0x40000000>
	//* 634 1227:icmpeq          1236
			j1 = i3;
	//  635 1230:iload           8
	//  636 1232:istore_2        
	//* 637 1233:goto            1236
		setMeasuredDimension(k4, j1);
	//  638 1236:aload_0         
	//  639 1237:iload           11
	//  640 1239:iload_2         
	//  641 1240:invokevirtual   #138 <Method void setMeasuredDimension(int, int)>
		return;
	//  642 1243:return          
	}

	public LayoutParams a(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #10  <Class ActionMenuView$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #187 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #188 <Method void ActionMenuView$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          50
		{
			if(layoutparams instanceof LayoutParams)
	//*   2    4:aload_1         
	//*   3    5:instanceof      #10  <Class ActionMenuView$LayoutParams>
	//*   4    8:ifeq            26
				layoutparams = ((android.view.ViewGroup.LayoutParams) (new LayoutParams((LayoutParams)layoutparams)));
	//    5   11:new             #10  <Class ActionMenuView$LayoutParams>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//    9   19:invokespecial   #192 <Method void ActionMenuView$LayoutParams(ActionMenuView$LayoutParams)>
	//   10   22:astore_1        
			else
	//*  11   23:goto            35
				layoutparams = ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//   12   26:new             #10  <Class ActionMenuView$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:invokespecial   #195 <Method void ActionMenuView$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   16   34:astore_1        
			if(((LayoutParams) (layoutparams)).h <= 0)
	//*  17   35:aload_1         
	//*  18   36:getfield        #197 <Field int android.support.v7.widget.ActionMenuView$LayoutParams.h>
	//*  19   39:ifgt            48
				layoutparams.h = 16;
	//   20   42:aload_1         
	//   21   43:bipush          16
	//   22   45:putfield        #197 <Field int android.support.v7.widget.ActionMenuView$LayoutParams.h>
			return ((LayoutParams) (layoutparams));
	//   23   48:aload_1         
	//   24   49:areturn         
		} else
		{
			return b();
	//   25   50:aload_0         
	//   26   51:invokevirtual   #200 <Method ActionMenuView$LayoutParams b()>
	//   27   54:areturn         
		}
	}

	public void a(h h1)
	{
		c = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #203 <Field h c>
	//    3    5:return          
	}

	public void a(android.support.v7.view.menu.o.a a1, android.support.v7.view.menu.h.a a2)
	{
		h = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #206 <Field android.support.v7.view.menu.o$a h>
		a = a2;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #208 <Field android.support.v7.view.menu.h$a a>
	//    6   10:return          
	}

	public boolean a()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field boolean f>
	//    2    4:ireturn         
	}

	protected boolean a(int i1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(i1 == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		View view = getChildAt(i1 - 1);
	//    6    8:aload_0         
	//    7    9:iload_1         
	//    8   10:iconst_1        
	//    9   11:isub            
	//   10   12:invokevirtual   #145 <Method View getChildAt(int)>
	//   11   15:astore          4
		View view1 = getChildAt(i1);
	//   12   17:aload_0         
	//   13   18:iload_1         
	//   14   19:invokevirtual   #145 <Method View getChildAt(int)>
	//   15   22:astore          5
		boolean flag = flag1;
	//   16   24:iload_3         
	//   17   25:istore_2        
		if(i1 < getChildCount())
	//*  18   26:iload_1         
	//*  19   27:aload_0         
	//*  20   28:invokevirtual   #141 <Method int getChildCount()>
	//*  21   31:icmpge          57
		{
			flag = flag1;
	//   22   34:iload_3         
	//   23   35:istore_2        
			if(view instanceof a)
	//*  24   36:aload           4
	//*  25   38:instanceof      #13  <Class ActionMenuView$a>
	//*  26   41:ifeq            57
				flag = false | ((a)view).d();
	//   27   44:iconst_0        
	//   28   45:aload           4
	//   29   47:checkcast       #13  <Class ActionMenuView$a>
	//   30   50:invokeinterface #212 <Method boolean ActionMenuView$a.d()>
	//   31   55:ior             
	//   32   56:istore_2        
		}
		flag1 = flag;
	//   33   57:iload_2         
	//   34   58:istore_3        
		if(i1 > 0)
	//*  35   59:iload_1         
	//*  36   60:ifle            86
		{
			flag1 = flag;
	//   37   63:iload_2         
	//   38   64:istore_3        
			if(view1 instanceof a)
	//*  39   65:aload           5
	//*  40   67:instanceof      #13  <Class ActionMenuView$a>
	//*  41   70:ifeq            86
				flag1 = flag | ((a)view1).c();
	//   42   73:iload_2         
	//   43   74:aload           5
	//   44   76:checkcast       #13  <Class ActionMenuView$a>
	//   45   79:invokeinterface #214 <Method boolean ActionMenuView$a.c()>
	//   46   84:ior             
	//   47   85:istore_3        
		}
		return flag1;
	//   48   86:iload_3         
	//   49   87:ireturn         
	}

	public boolean a(j j1)
	{
		return c.a(((MenuItem) (j1)), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field h c>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #220 <Method boolean h.a(MenuItem, int)>
	//    5    9:ireturn         
	}

	protected LayoutParams b()
	{
		LayoutParams layoutparams = new LayoutParams(-2, -2);
	//    0    0:new             #10  <Class ActionMenuView$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #222 <Method void ActionMenuView$LayoutParams(int, int)>
	//    5   11:astore_1        
		layoutparams.h = 16;
	//    6   12:aload_1         
	//    7   13:bipush          16
	//    8   15:putfield        #197 <Field int android.support.v7.widget.ActionMenuView$LayoutParams.h>
		return layoutparams;
	//    9   18:aload_1         
	//   10   19:areturn         
	}

	public LinearLayoutCompat.LayoutParams b(AttributeSet attributeset)
	{
		return ((LinearLayoutCompat.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #225 <Method ActionMenuView$LayoutParams a(AttributeSet)>
	//    3    5:areturn         
	}

	protected LinearLayoutCompat.LayoutParams b(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((LinearLayoutCompat.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #228 <Method ActionMenuView$LayoutParams a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public LayoutParams c()
	{
		LayoutParams layoutparams = b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method ActionMenuView$LayoutParams b()>
	//    2    4:astore_1        
		layoutparams.a = true;
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:putfield        #114 <Field boolean ActionMenuView$LayoutParams.a>
		return layoutparams;
	//    6   10:aload_1         
	//    7   11:areturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams != null && (layoutparams instanceof LayoutParams);
	//    0    0:aload_1         
	//    1    1:ifnull          13
	//    2    4:aload_1         
	//    3    5:instanceof      #10  <Class ActionMenuView$LayoutParams>
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public h d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field h c>
	//    2    4:areturn         
	}

	public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean e()
	{
		return g != null && g.f();
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field ActionMenuPresenter g>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #235 <Field ActionMenuPresenter g>
	//    5   11:invokevirtual   #239 <Method boolean ActionMenuPresenter.f()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean f()
	{
		return g != null && g.g();
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field ActionMenuPresenter g>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #235 <Field ActionMenuPresenter g>
	//    5   11:invokevirtual   #241 <Method boolean ActionMenuPresenter.g()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean g()
	{
		return g != null && g.j();
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field ActionMenuPresenter g>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #235 <Field ActionMenuPresenter g>
	//    5   11:invokevirtual   #243 <Method boolean android.support.v7.widget.ActionMenuPresenter.j()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method ActionMenuView$LayoutParams b()>
	//    2    4:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #225 <Method ActionMenuView$LayoutParams a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #228 <Method ActionMenuView$LayoutParams a(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public Menu getMenu()
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #203 <Field h c>
	//*   2    4:ifnonnull       115
		{
			Object obj = ((Object) (getContext()));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #187 <Method Context getContext()>
	//    5   11:astore_1        
			c = new h(((Context) (obj)));
	//    6   12:aload_0         
	//    7   13:new             #217 <Class h>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokespecial   #251 <Method void h(Context)>
	//   11   21:putfield        #203 <Field h c>
			c.a(((android.support.v7.view.menu.h.a) (new c())));
	//   12   24:aload_0         
	//   13   25:getfield        #203 <Field h c>
	//   14   28:new             #19  <Class ActionMenuView$c>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:invokespecial   #254 <Method void ActionMenuView$c(ActionMenuView)>
	//   18   36:invokevirtual   #257 <Method void h.a(android.support.v7.view.menu.h$a)>
			g = new ActionMenuPresenter(((Context) (obj)));
	//   19   39:aload_0         
	//   20   40:new             #237 <Class ActionMenuPresenter>
	//   21   43:dup             
	//   22   44:aload_1         
	//   23   45:invokespecial   #258 <Method void ActionMenuPresenter(Context)>
	//   24   48:putfield        #235 <Field ActionMenuPresenter g>
			g.c(true);
	//   25   51:aload_0         
	//   26   52:getfield        #235 <Field ActionMenuPresenter g>
	//   27   55:iconst_1        
	//   28   56:invokevirtual   #260 <Method void ActionMenuPresenter.c(boolean)>
			ActionMenuPresenter actionmenupresenter = g;
	//   29   59:aload_0         
	//   30   60:getfield        #235 <Field ActionMenuPresenter g>
	//   31   63:astore_2        
			if(h != null)
	//*  32   64:aload_0         
	//*  33   65:getfield        #206 <Field android.support.v7.view.menu.o$a h>
	//*  34   68:ifnull          79
				obj = ((Object) (h));
	//   35   71:aload_0         
	//   36   72:getfield        #206 <Field android.support.v7.view.menu.o$a h>
	//   37   75:astore_1        
			else
	//*  38   76:goto            87
				obj = ((Object) (new b()));
	//   39   79:new             #16  <Class ActionMenuView$b>
	//   40   82:dup             
	//   41   83:invokespecial   #263 <Method void ActionMenuView$b()>
	//   42   86:astore_1        
			actionmenupresenter.a(((android.support.v7.view.menu.o.a) (obj)));
	//   43   87:aload_2         
	//   44   88:aload_1         
	//   45   89:invokevirtual   #266 <Method void ActionMenuPresenter.a(android.support.v7.view.menu.o$a)>
			c.a(((android.support.v7.view.menu.o) (g)), d);
	//   46   92:aload_0         
	//   47   93:getfield        #203 <Field h c>
	//   48   96:aload_0         
	//   49   97:getfield        #235 <Field ActionMenuPresenter g>
	//   50  100:aload_0         
	//   51  101:getfield        #76  <Field Context d>
	//   52  104:invokevirtual   #269 <Method void h.a(android.support.v7.view.menu.o, Context)>
			g.a(this);
	//   53  107:aload_0         
	//   54  108:getfield        #235 <Field ActionMenuPresenter g>
	//   55  111:aload_0         
	//   56  112:invokevirtual   #271 <Method void ActionMenuPresenter.a(ActionMenuView)>
		}
		return ((Menu) (c));
	//   57  115:aload_0         
	//   58  116:getfield        #203 <Field h c>
	//   59  119:areturn         
	}

	public Drawable getOverflowIcon()
	{
		getMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #275 <Method Menu getMenu()>
	//    2    4:pop             
		return g.e();
	//    3    5:aload_0         
	//    4    6:getfield        #235 <Field ActionMenuPresenter g>
	//    5    9:invokevirtual   #277 <Method Drawable ActionMenuPresenter.e()>
	//    6   12:areturn         
	}

	public int getPopupTheme()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field int e>
	//    2    4:ireturn         
	}

	public int getWindowAnimations()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean h()
	{
		return g != null && g.k();
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field ActionMenuPresenter g>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #235 <Field ActionMenuPresenter g>
	//    5   11:invokevirtual   #281 <Method boolean ActionMenuPresenter.k()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void i()
	{
		if(g != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #235 <Field ActionMenuPresenter g>
	//*   2    4:ifnull          15
			g.h();
	//    3    7:aload_0         
	//    4    8:getfield        #235 <Field ActionMenuPresenter g>
	//    5   11:invokevirtual   #283 <Method boolean android.support.v7.widget.ActionMenuPresenter.h()>
	//    6   14:pop             
	//    7   15:return          
	}

	protected LinearLayoutCompat.LayoutParams j()
	{
		return ((LinearLayoutCompat.LayoutParams) (b()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method ActionMenuView$LayoutParams b()>
	//    2    4:areturn         
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #288 <Method void LinearLayoutCompat.onConfigurationChanged(Configuration)>
		if(g != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #235 <Field ActionMenuPresenter g>
	//*   5    9:ifnull          46
		{
			g.a(false);
	//    6   12:aload_0         
	//    7   13:getfield        #235 <Field ActionMenuPresenter g>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #290 <Method void ActionMenuPresenter.a(boolean)>
			if(g.j())
	//*  10   20:aload_0         
	//*  11   21:getfield        #235 <Field ActionMenuPresenter g>
	//*  12   24:invokevirtual   #243 <Method boolean android.support.v7.widget.ActionMenuPresenter.j()>
	//*  13   27:ifeq            46
			{
				g.g();
	//   14   30:aload_0         
	//   15   31:getfield        #235 <Field ActionMenuPresenter g>
	//   16   34:invokevirtual   #241 <Method boolean ActionMenuPresenter.g()>
	//   17   37:pop             
				g.f();
	//   18   38:aload_0         
	//   19   39:getfield        #235 <Field ActionMenuPresenter g>
	//   20   42:invokevirtual   #239 <Method boolean ActionMenuPresenter.f()>
	//   21   45:pop             
			}
		}
	//   22   46:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #293 <Method void LinearLayoutCompat.onDetachedFromWindow()>
		i();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #295 <Method void i()>
	//    4    8:return          
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		if(!i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #299 <Field boolean i>
	//*   2    4:ifne            19
		{
			super.onLayout(flag, i1, j1, k1, l1);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:iload           4
	//    8   13:iload           5
	//    9   15:invokespecial   #301 <Method void LinearLayoutCompat.onLayout(boolean, int, int, int, int)>
			return;
	//   10   18:return          
		}
		int k3 = getChildCount();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #141 <Method int getChildCount()>
	//   13   23:istore          9
		int j3 = (l1 - j1) / 2;
	//   14   25:iload           5
	//   15   27:iload_3         
	//   16   28:isub            
	//   17   29:iconst_2        
	//   18   30:idiv            
	//   19   31:istore          8
		int l3 = getDividerWidth();
	//   20   33:aload_0         
	//   21   34:invokevirtual   #304 <Method int getDividerWidth()>
	//   22   37:istore          10
		int i4 = k1 - i1;
	//   23   39:iload           4
	//   24   41:iload_2         
	//   25   42:isub            
	//   26   43:istore          11
		i1 = getPaddingRight();
	//   27   45:aload_0         
	//   28   46:invokevirtual   #125 <Method int getPaddingRight()>
	//   29   49:istore_2        
		j1 = getPaddingLeft();
	//   30   50:aload_0         
	//   31   51:invokevirtual   #122 <Method int getPaddingLeft()>
	//   32   54:istore_3        
		flag = bd.a(((View) (this)));
	//   33   55:aload_0         
	//   34   56:invokestatic    #309 <Method boolean bd.a(View)>
	//   35   59:istore_1        
		i1 = i4 - i1 - j1;
	//   36   60:iload           11
	//   37   62:iload_2         
	//   38   63:isub            
	//   39   64:iload_3         
	//   40   65:isub            
	//   41   66:istore_2        
		j1 = 0;
	//   42   67:iconst_0        
	//   43   68:istore_3        
		l1 = 0;
	//   44   69:iconst_0        
	//   45   70:istore          5
		k1 = 0;
	//   46   72:iconst_0        
	//   47   73:istore          4
		for(; j1 < k3; j1++)
	//*  48   75:iload_3         
	//*  49   76:iload           9
	//*  50   78:icmpge          277
		{
			View view = getChildAt(j1);
	//   51   81:aload_0         
	//   52   82:iload_3         
	//   53   83:invokevirtual   #145 <Method View getChildAt(int)>
	//   54   86:astore          14
			if(view.getVisibility() == 8)
	//*  55   88:aload           14
	//*  56   90:invokevirtual   #148 <Method int View.getVisibility()>
	//*  57   93:bipush          8
	//*  58   95:icmpne          101
				continue;
	//   59   98:goto            270
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   60  101:aload           14
	//   61  103:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   62  106:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//   63  109:astore          15
			if(layoutparams.a)
	//*  64  111:aload           15
	//*  65  113:getfield        #114 <Field boolean ActionMenuView$LayoutParams.a>
	//*  66  116:ifeq            238
			{
				int i2 = view.getMeasuredWidth();
	//   67  119:aload           14
	//   68  121:invokevirtual   #112 <Method int View.getMeasuredWidth()>
	//   69  124:istore          6
				l1 = i2;
	//   70  126:iload           6
	//   71  128:istore          5
				if(a(j1))
	//*  72  130:aload_0         
	//*  73  131:iload_3         
	//*  74  132:invokevirtual   #311 <Method boolean a(int)>
	//*  75  135:ifeq            145
					l1 = i2 + l3;
	//   76  138:iload           6
	//   77  140:iload           10
	//   78  142:iadd            
	//   79  143:istore          5
				int j4 = view.getMeasuredHeight();
	//   80  145:aload           14
	//   81  147:invokevirtual   #174 <Method int View.getMeasuredHeight()>
	//   82  150:istore          12
				int k2;
				if(flag)
	//*  83  152:iload_1         
	//*  84  153:ifeq            178
				{
					k2 = getPaddingLeft() + layoutparams.leftMargin;
	//   85  156:aload_0         
	//   86  157:invokevirtual   #122 <Method int getPaddingLeft()>
	//   87  160:aload           15
	//   88  162:getfield        #159 <Field int ActionMenuView$LayoutParams.leftMargin>
	//   89  165:iadd            
	//   90  166:istore          7
					i2 = k2 + l1;
	//   91  168:iload           7
	//   92  170:iload           5
	//   93  172:iadd            
	//   94  173:istore          6
				} else
	//*  95  175:goto            202
				{
					i2 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
	//   96  178:aload_0         
	//   97  179:invokevirtual   #314 <Method int getWidth()>
	//   98  182:aload_0         
	//   99  183:invokevirtual   #125 <Method int getPaddingRight()>
	//  100  186:isub            
	//  101  187:aload           15
	//  102  189:getfield        #162 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  103  192:isub            
	//  104  193:istore          6
					k2 = i2 - l1;
	//  105  195:iload           6
	//  106  197:iload           5
	//  107  199:isub            
	//  108  200:istore          7
				}
				int k4 = j3 - j4 / 2;
	//  109  202:iload           8
	//  110  204:iload           12
	//  111  206:iconst_2        
	//  112  207:idiv            
	//  113  208:isub            
	//  114  209:istore          13
				view.layout(k2, k4, i2, j4 + k4);
	//  115  211:aload           14
	//  116  213:iload           7
	//  117  215:iload           13
	//  118  217:iload           6
	//  119  219:iload           12
	//  120  221:iload           13
	//  121  223:iadd            
	//  122  224:invokevirtual   #317 <Method void View.layout(int, int, int, int)>
				i1 -= l1;
	//  123  227:iload_2         
	//  124  228:iload           5
	//  125  230:isub            
	//  126  231:istore_2        
				l1 = 1;
	//  127  232:iconst_1        
	//  128  233:istore          5
			} else
	//* 129  235:goto            270
			{
				i1 -= view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
	//  130  238:iload_2         
	//  131  239:aload           14
	//  132  241:invokevirtual   #112 <Method int View.getMeasuredWidth()>
	//  133  244:aload           15
	//  134  246:getfield        #159 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  135  249:iadd            
	//  136  250:aload           15
	//  137  252:getfield        #162 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  138  255:iadd            
	//  139  256:isub            
	//  140  257:istore_2        
				a(j1);
	//  141  258:aload_0         
	//  142  259:iload_3         
	//  143  260:invokevirtual   #311 <Method boolean a(int)>
	//  144  263:pop             
				k1++;
	//  145  264:iload           4
	//  146  266:iconst_1        
	//  147  267:iadd            
	//  148  268:istore          4
			}
		}

	//  149  270:iload_3         
	//  150  271:iconst_1        
	//  151  272:iadd            
	//  152  273:istore_3        
	//* 153  274:goto            75
		if(k3 == 1 && l1 == 0)
	//* 154  277:iload           9
	//* 155  279:iconst_1        
	//* 156  280:icmpne          343
	//* 157  283:iload           5
	//* 158  285:ifne            343
		{
			View view1 = getChildAt(0);
	//  159  288:aload_0         
	//  160  289:iconst_0        
	//  161  290:invokevirtual   #145 <Method View getChildAt(int)>
	//  162  293:astore          14
			i1 = view1.getMeasuredWidth();
	//  163  295:aload           14
	//  164  297:invokevirtual   #112 <Method int View.getMeasuredWidth()>
	//  165  300:istore_2        
			j1 = view1.getMeasuredHeight();
	//  166  301:aload           14
	//  167  303:invokevirtual   #174 <Method int View.getMeasuredHeight()>
	//  168  306:istore_3        
			k1 = i4 / 2 - i1 / 2;
	//  169  307:iload           11
	//  170  309:iconst_2        
	//  171  310:idiv            
	//  172  311:iload_2         
	//  173  312:iconst_2        
	//  174  313:idiv            
	//  175  314:isub            
	//  176  315:istore          4
			l1 = j3 - j1 / 2;
	//  177  317:iload           8
	//  178  319:iload_3         
	//  179  320:iconst_2        
	//  180  321:idiv            
	//  181  322:isub            
	//  182  323:istore          5
			view1.layout(k1, l1, i1 + k1, j1 + l1);
	//  183  325:aload           14
	//  184  327:iload           4
	//  185  329:iload           5
	//  186  331:iload_2         
	//  187  332:iload           4
	//  188  334:iadd            
	//  189  335:iload_3         
	//  190  336:iload           5
	//  191  338:iadd            
	//  192  339:invokevirtual   #317 <Method void View.layout(int, int, int, int)>
			return;
	//  193  342:return          
		}
		j1 = k1 - (l1 ^ 1);
	//  194  343:iload           4
	//  195  345:iload           5
	//  196  347:iconst_1        
	//  197  348:ixor            
	//  198  349:isub            
	//  199  350:istore_3        
		if(j1 > 0)
	//* 200  351:iload_3         
	//* 201  352:ifle            362
			i1 /= j1;
	//  202  355:iload_2         
	//  203  356:iload_3         
	//  204  357:idiv            
	//  205  358:istore_2        
		else
	//* 206  359:goto            364
			i1 = 0;
	//  207  362:iconst_0        
	//  208  363:istore_2        
		l1 = 0;
	//  209  364:iconst_0        
	//  210  365:istore          5
		k1 = 0;
	//  211  367:iconst_0        
	//  212  368:istore          4
		int j2 = Math.max(0, i1);
	//  213  370:iconst_0        
	//  214  371:iload_2         
	//  215  372:invokestatic    #171 <Method int Math.max(int, int)>
	//  216  375:istore          6
		if(flag)
	//* 217  377:iload_1         
	//* 218  378:ifeq            517
		{
			j1 = getWidth() - getPaddingRight();
	//  219  381:aload_0         
	//  220  382:invokevirtual   #314 <Method int getWidth()>
	//  221  385:aload_0         
	//  222  386:invokevirtual   #125 <Method int getPaddingRight()>
	//  223  389:isub            
	//  224  390:istore_3        
			for(i1 = k1; i1 < k3;)
	//* 225  391:iload           4
	//* 226  393:istore_2        
	//* 227  394:iload_2         
	//* 228  395:iload           9
	//* 229  397:icmpge          648
			{
				View view2 = getChildAt(i1);
	//  230  400:aload_0         
	//  231  401:iload_2         
	//  232  402:invokevirtual   #145 <Method View getChildAt(int)>
	//  233  405:astore          14
				LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
	//  234  407:aload           14
	//  235  409:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  236  412:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//  237  415:astore          15
				k1 = j1;
	//  238  417:iload_3         
	//  239  418:istore          4
				if(view2.getVisibility() != 8)
	//* 240  420:aload           14
	//* 241  422:invokevirtual   #148 <Method int View.getVisibility()>
	//* 242  425:bipush          8
	//* 243  427:icmpeq          507
					if(layoutparams1.a)
	//* 244  430:aload           15
	//* 245  432:getfield        #114 <Field boolean ActionMenuView$LayoutParams.a>
	//* 246  435:ifeq            444
					{
						k1 = j1;
	//  247  438:iload_3         
	//  248  439:istore          4
					} else
	//* 249  441:goto            507
					{
						j1 -= layoutparams1.rightMargin;
	//  250  444:iload_3         
	//  251  445:aload           15
	//  252  447:getfield        #162 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  253  450:isub            
	//  254  451:istore_3        
						k1 = view2.getMeasuredWidth();
	//  255  452:aload           14
	//  256  454:invokevirtual   #112 <Method int View.getMeasuredWidth()>
	//  257  457:istore          4
						l1 = view2.getMeasuredHeight();
	//  258  459:aload           14
	//  259  461:invokevirtual   #174 <Method int View.getMeasuredHeight()>
	//  260  464:istore          5
						int l2 = j3 - l1 / 2;
	//  261  466:iload           8
	//  262  468:iload           5
	//  263  470:iconst_2        
	//  264  471:idiv            
	//  265  472:isub            
	//  266  473:istore          7
						view2.layout(j1 - k1, l2, j1, l1 + l2);
	//  267  475:aload           14
	//  268  477:iload_3         
	//  269  478:iload           4
	//  270  480:isub            
	//  271  481:iload           7
	//  272  483:iload_3         
	//  273  484:iload           5
	//  274  486:iload           7
	//  275  488:iadd            
	//  276  489:invokevirtual   #317 <Method void View.layout(int, int, int, int)>
						k1 = j1 - (k1 + layoutparams1.leftMargin + j2);
	//  277  492:iload_3         
	//  278  493:iload           4
	//  279  495:aload           15
	//  280  497:getfield        #159 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  281  500:iadd            
	//  282  501:iload           6
	//  283  503:iadd            
	//  284  504:isub            
	//  285  505:istore          4
					}
				i1++;
	//  286  507:iload_2         
	//  287  508:iconst_1        
	//  288  509:iadd            
	//  289  510:istore_2        
				j1 = k1;
	//  290  511:iload           4
	//  291  513:istore_3        
			}

		} else
	//* 292  514:goto            394
		{
			j1 = getPaddingLeft();
	//  293  517:aload_0         
	//  294  518:invokevirtual   #122 <Method int getPaddingLeft()>
	//  295  521:istore_3        
			for(i1 = l1; i1 < k3;)
	//* 296  522:iload           5
	//* 297  524:istore_2        
	//* 298  525:iload_2         
	//* 299  526:iload           9
	//* 300  528:icmpge          648
			{
				View view3 = getChildAt(i1);
	//  301  531:aload_0         
	//  302  532:iload_2         
	//  303  533:invokevirtual   #145 <Method View getChildAt(int)>
	//  304  536:astore          14
				LayoutParams layoutparams2 = (LayoutParams)view3.getLayoutParams();
	//  305  538:aload           14
	//  306  540:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  307  543:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//  308  546:astore          15
				k1 = j1;
	//  309  548:iload_3         
	//  310  549:istore          4
				if(view3.getVisibility() != 8)
	//* 311  551:aload           14
	//* 312  553:invokevirtual   #148 <Method int View.getVisibility()>
	//* 313  556:bipush          8
	//* 314  558:icmpeq          638
					if(layoutparams2.a)
	//* 315  561:aload           15
	//* 316  563:getfield        #114 <Field boolean ActionMenuView$LayoutParams.a>
	//* 317  566:ifeq            575
					{
						k1 = j1;
	//  318  569:iload_3         
	//  319  570:istore          4
					} else
	//* 320  572:goto            638
					{
						j1 += layoutparams2.leftMargin;
	//  321  575:iload_3         
	//  322  576:aload           15
	//  323  578:getfield        #159 <Field int ActionMenuView$LayoutParams.leftMargin>
	//  324  581:iadd            
	//  325  582:istore_3        
						k1 = view3.getMeasuredWidth();
	//  326  583:aload           14
	//  327  585:invokevirtual   #112 <Method int View.getMeasuredWidth()>
	//  328  588:istore          4
						l1 = view3.getMeasuredHeight();
	//  329  590:aload           14
	//  330  592:invokevirtual   #174 <Method int View.getMeasuredHeight()>
	//  331  595:istore          5
						int i3 = j3 - l1 / 2;
	//  332  597:iload           8
	//  333  599:iload           5
	//  334  601:iconst_2        
	//  335  602:idiv            
	//  336  603:isub            
	//  337  604:istore          7
						view3.layout(j1, i3, j1 + k1, l1 + i3);
	//  338  606:aload           14
	//  339  608:iload_3         
	//  340  609:iload           7
	//  341  611:iload_3         
	//  342  612:iload           4
	//  343  614:iadd            
	//  344  615:iload           5
	//  345  617:iload           7
	//  346  619:iadd            
	//  347  620:invokevirtual   #317 <Method void View.layout(int, int, int, int)>
						k1 = j1 + (k1 + layoutparams2.rightMargin + j2);
	//  348  623:iload_3         
	//  349  624:iload           4
	//  350  626:aload           15
	//  351  628:getfield        #162 <Field int ActionMenuView$LayoutParams.rightMargin>
	//  352  631:iadd            
	//  353  632:iload           6
	//  354  634:iadd            
	//  355  635:iadd            
	//  356  636:istore          4
					}
				i1++;
	//  357  638:iload_2         
	//  358  639:iconst_1        
	//  359  640:iadd            
	//  360  641:istore_2        
				j1 = k1;
	//  361  642:iload           4
	//  362  644:istore_3        
			}

		}
	//* 363  645:goto            525
	//  364  648:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		boolean flag1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #299 <Field boolean i>
	//    2    4:istore          6
		boolean flag;
		if(android.view.View.MeasureSpec.getMode(i1) == 0x40000000)
	//*   3    6:iload_1         
	//*   4    7:invokestatic    #94  <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   5   10:ldc1            #119 <Int 0x40000000>
	//*   6   12:icmpne          21
			flag = true;
	//    7   15:iconst_1        
	//    8   16:istore          5
		else
	//*   9   18:goto            24
			flag = false;
	//   10   21:iconst_0        
	//   11   22:istore          5
		i = flag;
	//   12   24:aload_0         
	//   13   25:iload           5
	//   14   27:putfield        #299 <Field boolean i>
		if(flag1 != i)
	//*  15   30:iload           6
	//*  16   32:aload_0         
	//*  17   33:getfield        #299 <Field boolean i>
	//*  18   36:icmpeq          44
			j = 0;
	//   19   39:aload_0         
	//   20   40:iconst_0        
	//   21   41:putfield        #320 <Field int j>
		int k1 = android.view.View.MeasureSpec.getSize(i1);
	//   22   44:iload_1         
	//   23   45:invokestatic    #91  <Method int android.view.View$MeasureSpec.getSize(int)>
	//   24   48:istore_3        
		if(i && c != null && k1 != j)
	//*  25   49:aload_0         
	//*  26   50:getfield        #299 <Field boolean i>
	//*  27   53:ifeq            84
	//*  28   56:aload_0         
	//*  29   57:getfield        #203 <Field h c>
	//*  30   60:ifnull          84
	//*  31   63:iload_3         
	//*  32   64:aload_0         
	//*  33   65:getfield        #320 <Field int j>
	//*  34   68:icmpeq          84
		{
			j = k1;
	//   35   71:aload_0         
	//   36   72:iload_3         
	//   37   73:putfield        #320 <Field int j>
			c.a(true);
	//   38   76:aload_0         
	//   39   77:getfield        #203 <Field h c>
	//   40   80:iconst_1        
	//   41   81:invokevirtual   #321 <Method void h.a(boolean)>
		}
		int i2 = getChildCount();
	//   42   84:aload_0         
	//   43   85:invokevirtual   #141 <Method int getChildCount()>
	//   44   88:istore          4
		if(i && i2 > 0)
	//*  45   90:aload_0         
	//*  46   91:getfield        #299 <Field boolean i>
	//*  47   94:ifeq            109
	//*  48   97:iload           4
	//*  49   99:ifle            109
		{
			c(i1, j1);
	//   50  102:aload_0         
	//   51  103:iload_1         
	//   52  104:iload_2         
	//   53  105:invokespecial   #323 <Method void c(int, int)>
			return;
	//   54  108:return          
		}
		for(int l1 = 0; l1 < i2; l1++)
	//*  55  109:iconst_0        
	//*  56  110:istore_3        
	//*  57  111:iload_3         
	//*  58  112:iload           4
	//*  59  114:icmpge          149
		{
			LayoutParams layoutparams = (LayoutParams)getChildAt(l1).getLayoutParams();
	//   60  117:aload_0         
	//   61  118:iload_3         
	//   62  119:invokevirtual   #145 <Method View getChildAt(int)>
	//   63  122:invokevirtual   #85  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   64  125:checkcast       #10  <Class ActionMenuView$LayoutParams>
	//   65  128:astore          7
			layoutparams.rightMargin = 0;
	//   66  130:aload           7
	//   67  132:iconst_0        
	//   68  133:putfield        #162 <Field int ActionMenuView$LayoutParams.rightMargin>
			layoutparams.leftMargin = 0;
	//   69  136:aload           7
	//   70  138:iconst_0        
	//   71  139:putfield        #159 <Field int ActionMenuView$LayoutParams.leftMargin>
		}

	//   72  142:iload_3         
	//   73  143:iconst_1        
	//   74  144:iadd            
	//   75  145:istore_3        
	//*  76  146:goto            111
		super.onMeasure(i1, j1);
	//   77  149:aload_0         
	//   78  150:iload_1         
	//   79  151:iload_2         
	//   80  152:invokespecial   #325 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//   81  155:return          
	}

	public void setExpandedActionViewsExclusive(boolean flag)
	{
		g.d(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field ActionMenuPresenter g>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #328 <Method void ActionMenuPresenter.d(boolean)>
	//    4    8:return          
	}

	public void setOnMenuItemClickListener(d d1)
	{
		b = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #332 <Field ActionMenuView$d b>
	//    3    5:return          
	}

	public void setOverflowIcon(Drawable drawable)
	{
		getMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #275 <Method Menu getMenu()>
	//    2    4:pop             
		g.a(drawable);
	//    3    5:aload_0         
	//    4    6:getfield        #235 <Field ActionMenuPresenter g>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #336 <Method void ActionMenuPresenter.a(Drawable)>
	//    7   13:return          
	}

	public void setOverflowReserved(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #209 <Field boolean f>
	//    3    5:return          
	}

	public void setPopupTheme(int i1)
	{
		if(e != i1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field int e>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          42
		{
			e = i1;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #78  <Field int e>
			if(i1 == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            26
			{
				d = getContext();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #187 <Method Context getContext()>
	//   12   22:putfield        #76  <Field Context d>
				return;
	//   13   25:return          
			}
			d = ((Context) (new ContextThemeWrapper(getContext(), i1)));
	//   14   26:aload_0         
	//   15   27:new             #341 <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokevirtual   #187 <Method Context getContext()>
	//   19   35:iload_1         
	//   20   36:invokespecial   #344 <Method void ContextThemeWrapper(Context, int)>
	//   21   39:putfield        #76  <Field Context d>
		}
	//   22   42:return          
	}

	public void setPresenter(ActionMenuPresenter actionmenupresenter)
	{
		g = actionmenupresenter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #235 <Field ActionMenuPresenter g>
		g.a(this);
	//    3    5:aload_0         
	//    4    6:getfield        #235 <Field ActionMenuPresenter g>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #271 <Method void ActionMenuPresenter.a(ActionMenuView)>
	//    7   13:return          
	}

	android.support.v7.view.menu.h.a a;
	d b;
	private h c;
	private Context d;
	private int e;
	private boolean f;
	private ActionMenuPresenter g;
	private android.support.v7.view.menu.o.a h;
	private boolean i;
	private int j;
	private int k;
	private int l;
}
