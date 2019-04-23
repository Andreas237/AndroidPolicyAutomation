// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.constraint.a.a.a;
import android.support.constraint.a.a.e;
import android.support.constraint.a.a.i;
import android.support.constraint.a.a.j;
import android.support.constraint.a.a.l;
import android.support.constraint.a.a.m;
import android.support.constraint.a.a.o;
import android.support.constraint.a.a.t;
import android.support.constraint.a.a.u;
import android.support.constraint.a.g;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package android.support.constraint:
//			c, n, e, k, 
//			b, j

public class ConstraintLayout extends ViewGroup
{

	public ConstraintLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void ViewGroup(Context, AttributeSet)>
		a = new SparseArray();
	//    4    6:aload_0         
	//    5    7:new             #38  <Class SparseArray>
	//    6   10:dup             
	//    7   11:invokespecial   #41  <Method void SparseArray()>
	//    8   14:putfield        #43  <Field SparseArray a>
		g = new ArrayList(4);
	//    9   17:aload_0         
	//   10   18:new             #45  <Class ArrayList>
	//   11   21:dup             
	//   12   22:iconst_4        
	//   13   23:invokespecial   #48  <Method void ArrayList(int)>
	//   14   26:putfield        #50  <Field ArrayList g>
	//   15   29:aload_0         
	//   16   30:new             #45  <Class ArrayList>
	//   17   33:dup             
	//   18   34:bipush          100
	//   19   36:invokespecial   #48  <Method void ArrayList(int)>
	//   20   39:putfield        #52  <Field ArrayList h>
		b = new m();
	//   21   42:aload_0         
	//   22   43:new             #54  <Class m>
	//   23   46:dup             
	//   24   47:invokespecial   #55  <Method void m()>
	//   25   50:putfield        #57  <Field m b>
		i = 0;
	//   26   53:aload_0         
	//   27   54:iconst_0        
	//   28   55:putfield        #59  <Field int i>
		j = 0;
	//   29   58:aload_0         
	//   30   59:iconst_0        
	//   31   60:putfield        #61  <Field int j>
		k = 0x7fffffff;
	//   32   63:aload_0         
	//   33   64:ldc1            #62  <Int 0x7fffffff>
	//   34   66:putfield        #64  <Field int k>
		l = 0x7fffffff;
	//   35   69:aload_0         
	//   36   70:ldc1            #62  <Int 0x7fffffff>
	//   37   72:putfield        #66  <Field int l>
		m = true;
	//   38   75:aload_0         
	//   39   76:iconst_1        
	//   40   77:putfield        #68  <Field boolean m>
		n = 7;
	//   41   80:aload_0         
	//   42   81:bipush          7
	//   43   83:putfield        #70  <Field int n>
		o = null;
	//   44   86:aload_0         
	//   45   87:aconst_null     
	//   46   88:putfield        #72  <Field android.support.constraint.e o>
		p = -1;
	//   47   91:aload_0         
	//   48   92:iconst_m1       
	//   49   93:putfield        #74  <Field int p>
		q = new HashMap();
	//   50   96:aload_0         
	//   51   97:new             #76  <Class HashMap>
	//   52  100:dup             
	//   53  101:invokespecial   #77  <Method void HashMap()>
	//   54  104:putfield        #79  <Field HashMap q>
		r = -1;
	//   55  107:aload_0         
	//   56  108:iconst_m1       
	//   57  109:putfield        #81  <Field int r>
		s = -1;
	//   58  112:aload_0         
	//   59  113:iconst_m1       
	//   60  114:putfield        #83  <Field int s>
		c = -1;
	//   61  117:aload_0         
	//   62  118:iconst_m1       
	//   63  119:putfield        #85  <Field int c>
		d = -1;
	//   64  122:aload_0         
	//   65  123:iconst_m1       
	//   66  124:putfield        #87  <Field int d>
		e = 0;
	//   67  127:aload_0         
	//   68  128:iconst_0        
	//   69  129:putfield        #89  <Field int e>
		f = 0;
	//   70  132:aload_0         
	//   71  133:iconst_0        
	//   72  134:putfield        #91  <Field int f>
		b(attributeset);
	//   73  137:aload_0         
	//   74  138:aload_2         
	//   75  139:invokespecial   #94  <Method void b(AttributeSet)>
	//   76  142:return          
	}

	private void a(int i1, int j1)
	{
		int i3 = getPaddingTop() + getPaddingBottom();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #100 <Method int getPaddingTop()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #103 <Method int getPaddingBottom()>
	//    4    8:iadd            
	//    5    9:istore          10
		int j3 = getPaddingLeft() + getPaddingRight();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #106 <Method int getPaddingLeft()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #109 <Method int getPaddingRight()>
	//   10   19:iadd            
	//   11   20:istore          11
		int k3 = getChildCount();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #112 <Method int getChildCount()>
	//   14   26:istore          12
		for(int j2 = 0; j2 < k3; j2++)
	//*  15   28:iconst_0        
	//*  16   29:istore          7
	//*  17   31:iload           7
	//*  18   33:iload           12
	//*  19   35:icmpge          512
		{
			View view = getChildAt(j2);
	//   20   38:aload_0         
	//   21   39:iload           7
	//   22   41:invokevirtual   #116 <Method View getChildAt(int)>
	//   23   44:astore          14
			if(view.getVisibility() == 8)
	//*  24   46:aload           14
	//*  25   48:invokevirtual   #121 <Method int View.getVisibility()>
	//*  26   51:bipush          8
	//*  27   53:icmpne          59
				continue;
	//   28   56:goto            503
			c c1 = (c)view.getLayoutParams();
	//   29   59:aload           14
	//   30   61:invokevirtual   #125 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   31   64:checkcast       #127 <Class c>
	//   32   67:astore          15
			j j4 = c1.al;
	//   33   69:aload           15
	//   34   71:getfield        #131 <Field j c.al>
	//   35   74:astore          16
			if(c1.Y || c1.Z)
	//*  36   76:aload           15
	//*  37   78:getfield        #134 <Field boolean c.Y>
	//*  38   81:ifne            503
	//*  39   84:aload           15
	//*  40   86:getfield        #136 <Field boolean c.Z>
	//*  41   89:ifeq            95
				continue;
	//   42   92:goto            503
			j4.e(view.getVisibility());
	//   43   95:aload           16
	//   44   97:aload           14
	//   45   99:invokevirtual   #121 <Method int View.getVisibility()>
	//   46  102:invokevirtual   #140 <Method void j.e(int)>
			int k2 = c1.width;
	//   47  105:aload           15
	//   48  107:getfield        #143 <Field int c.width>
	//   49  110:istore          8
			int l2 = c1.height;
	//   50  112:aload           15
	//   51  114:getfield        #146 <Field int c.height>
	//   52  117:istore          9
			boolean flag;
			if(!c1.V && !c1.W && (c1.V || c1.I != 1) && c1.width != -1 && (c1.W || c1.J != 1 && c1.height != -1))
	//*  53  119:aload           15
	//*  54  121:getfield        #149 <Field boolean c.V>
	//*  55  124:ifne            195
	//*  56  127:aload           15
	//*  57  129:getfield        #152 <Field boolean c.W>
	//*  58  132:ifne            195
	//*  59  135:aload           15
	//*  60  137:getfield        #149 <Field boolean c.V>
	//*  61  140:ifne            152
	//*  62  143:aload           15
	//*  63  145:getfield        #154 <Field int c.I>
	//*  64  148:iconst_1        
	//*  65  149:icmpeq          195
	//*  66  152:aload           15
	//*  67  154:getfield        #143 <Field int c.width>
	//*  68  157:iconst_m1       
	//*  69  158:icmpeq          195
	//*  70  161:aload           15
	//*  71  163:getfield        #152 <Field boolean c.W>
	//*  72  166:ifne            190
	//*  73  169:aload           15
	//*  74  171:getfield        #157 <Field int c.J>
	//*  75  174:iconst_1        
	//*  76  175:icmpeq          195
	//*  77  178:aload           15
	//*  78  180:getfield        #146 <Field int c.height>
	//*  79  183:iconst_m1       
	//*  80  184:icmpne          190
	//*  81  187:goto            195
				flag = false;
	//   82  190:iconst_0        
	//   83  191:istore_3        
			else
	//*  84  192:goto            197
				flag = true;
	//   85  195:iconst_1        
	//   86  196:istore_3        
			boolean flag1;
			int l1;
			int i2;
			if(flag)
	//*  87  197:iload_3         
	//*  88  198:ifeq            428
			{
				if(k2 == 0)
	//*  89  201:iload           8
	//*  90  203:ifne            221
				{
					l1 = getChildMeasureSpec(i1, j3, -2);
	//   91  206:iload_1         
	//   92  207:iload           11
	//   93  209:bipush          -2
	//   94  211:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//   95  214:istore          5
					flag = true;
	//   96  216:iconst_1        
	//   97  217:istore_3        
				} else
	//*  98  218:goto            265
				if(k2 == -1)
	//*  99  221:iload           8
	//* 100  223:iconst_m1       
	//* 101  224:icmpne          241
				{
					l1 = getChildMeasureSpec(i1, j3, -1);
	//  102  227:iload_1         
	//  103  228:iload           11
	//  104  230:iconst_m1       
	//  105  231:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  106  234:istore          5
					flag = false;
	//  107  236:iconst_0        
	//  108  237:istore_3        
				} else
	//* 109  238:goto            265
				{
					if(k2 == -2)
	//* 110  241:iload           8
	//* 111  243:bipush          -2
	//* 112  245:icmpne          253
						flag = true;
	//  113  248:iconst_1        
	//  114  249:istore_3        
					else
	//* 115  250:goto            255
						flag = false;
	//  116  253:iconst_0        
	//  117  254:istore_3        
					l1 = getChildMeasureSpec(i1, j3, k2);
	//  118  255:iload_1         
	//  119  256:iload           11
	//  120  258:iload           8
	//  121  260:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  122  263:istore          5
				}
				if(l2 == 0)
	//* 123  265:iload           9
	//* 124  267:ifne            286
				{
					i2 = getChildMeasureSpec(j1, i3, -2);
	//  125  270:iload_2         
	//  126  271:iload           10
	//  127  273:bipush          -2
	//  128  275:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  129  278:istore          6
					flag1 = true;
	//  130  280:iconst_1        
	//  131  281:istore          4
				} else
	//* 132  283:goto            333
				if(l2 == -1)
	//* 133  286:iload           9
	//* 134  288:iconst_m1       
	//* 135  289:icmpne          307
				{
					i2 = getChildMeasureSpec(j1, i3, -1);
	//  136  292:iload_2         
	//  137  293:iload           10
	//  138  295:iconst_m1       
	//  139  296:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  140  299:istore          6
					flag1 = false;
	//  141  301:iconst_0        
	//  142  302:istore          4
				} else
	//* 143  304:goto            333
				{
					if(l2 == -2)
	//* 144  307:iload           9
	//* 145  309:bipush          -2
	//* 146  311:icmpne          320
						flag1 = true;
	//  147  314:iconst_1        
	//  148  315:istore          4
					else
	//* 149  317:goto            323
						flag1 = false;
	//  150  320:iconst_0        
	//  151  321:istore          4
					i2 = getChildMeasureSpec(j1, i3, l2);
	//  152  323:iload_2         
	//  153  324:iload           10
	//  154  326:iload           9
	//  155  328:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  156  331:istore          6
				}
				view.measure(l1, i2);
	//  157  333:aload           14
	//  158  335:iload           5
	//  159  337:iload           6
	//  160  339:invokevirtual   #164 <Method void View.measure(int, int)>
				g g1 = t;
	//  161  342:aload_0         
	//  162  343:getfield        #166 <Field g t>
	//  163  346:astore          17
				if(g1 != null)
	//* 164  348:aload           17
	//* 165  350:ifnull          365
					g1.a = g1.a + 1L;
	//  166  353:aload           17
	//  167  355:aload           17
	//  168  357:getfield        #170 <Field long g.a>
	//  169  360:lconst_1        
	//  170  361:ladd            
	//  171  362:putfield        #170 <Field long g.a>
				boolean flag2;
				if(k2 == -2)
	//* 172  365:iload           8
	//* 173  367:bipush          -2
	//* 174  369:icmpne          378
					flag2 = true;
	//  175  372:iconst_1        
	//  176  373:istore          13
				else
	//* 177  375:goto            381
					flag2 = false;
	//  178  378:iconst_0        
	//  179  379:istore          13
				j4.b(flag2);
	//  180  381:aload           16
	//  181  383:iload           13
	//  182  385:invokevirtual   #173 <Method void j.b(boolean)>
				if(l2 == -2)
	//* 183  388:iload           9
	//* 184  390:bipush          -2
	//* 185  392:icmpne          401
					flag2 = true;
	//  186  395:iconst_1        
	//  187  396:istore          13
				else
	//* 188  398:goto            404
					flag2 = false;
	//  189  401:iconst_0        
	//  190  402:istore          13
				j4.c(flag2);
	//  191  404:aload           16
	//  192  406:iload           13
	//  193  408:invokevirtual   #175 <Method void j.c(boolean)>
				l1 = view.getMeasuredWidth();
	//  194  411:aload           14
	//  195  413:invokevirtual   #178 <Method int View.getMeasuredWidth()>
	//  196  416:istore          5
				i2 = view.getMeasuredHeight();
	//  197  418:aload           14
	//  198  420:invokevirtual   #181 <Method int View.getMeasuredHeight()>
	//  199  423:istore          6
			} else
	//* 200  425:goto            441
			{
				flag = false;
	//  201  428:iconst_0        
	//  202  429:istore_3        
				flag1 = false;
	//  203  430:iconst_0        
	//  204  431:istore          4
				i2 = l2;
	//  205  433:iload           9
	//  206  435:istore          6
				l1 = k2;
	//  207  437:iload           8
	//  208  439:istore          5
			}
			j4.j(l1);
	//  209  441:aload           16
	//  210  443:iload           5
	//  211  445:invokevirtual   #183 <Method void j.j(int)>
			j4.k(i2);
	//  212  448:aload           16
	//  213  450:iload           6
	//  214  452:invokevirtual   #185 <Method void j.k(int)>
			if(flag)
	//* 215  455:iload_3         
	//* 216  456:ifeq            466
				j4.n(l1);
	//  217  459:aload           16
	//  218  461:iload           5
	//  219  463:invokevirtual   #187 <Method void j.n(int)>
			if(flag1)
	//* 220  466:iload           4
	//* 221  468:ifeq            478
				j4.o(i2);
	//  222  471:aload           16
	//  223  473:iload           6
	//  224  475:invokevirtual   #189 <Method void j.o(int)>
			if(!c1.X)
				continue;
	//  225  478:aload           15
	//  226  480:getfield        #192 <Field boolean c.X>
	//  227  483:ifeq            503
			int k1 = view.getBaseline();
	//  228  486:aload           14
	//  229  488:invokevirtual   #195 <Method int View.getBaseline()>
	//  230  491:istore_3        
			if(k1 != -1)
	//* 231  492:iload_3         
	//* 232  493:iconst_m1       
	//* 233  494:icmpeq          503
				j4.q(k1);
	//  234  497:aload           16
	//  235  499:iload_3         
	//  236  500:invokevirtual   #197 <Method void j.q(int)>
		}

	//  237  503:iload           7
	//  238  505:iconst_1        
	//  239  506:iadd            
	//  240  507:istore          7
	//* 241  509:goto            31
	//  242  512:return          
	}

	private final j b(int i1)
	{
		if(i1 == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			return ((j) (b));
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field m b>
	//    4    8:areturn         
		View view1 = (View)a.get(i1);
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field SparseArray a>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #202 <Method Object SparseArray.get(int)>
	//    9   17:checkcast       #118 <Class View>
	//   10   20:astore_3        
		View view = view1;
	//   11   21:aload_3         
	//   12   22:astore_2        
		if(view1 == null)
	//*  13   23:aload_3         
	//*  14   24:ifnonnull       63
		{
			View view2 = findViewById(i1);
	//   15   27:aload_0         
	//   16   28:iload_1         
	//   17   29:invokevirtual   #205 <Method View findViewById(int)>
	//   18   32:astore_3        
			view = view2;
	//   19   33:aload_3         
	//   20   34:astore_2        
			if(view2 != null)
	//*  21   35:aload_3         
	//*  22   36:ifnull          63
			{
				view = view2;
	//   23   39:aload_3         
	//   24   40:astore_2        
				if(view2 != this)
	//*  25   41:aload_3         
	//*  26   42:aload_0         
	//*  27   43:if_acmpeq       63
				{
					view = view2;
	//   28   46:aload_3         
	//   29   47:astore_2        
					if(view2.getParent() == this)
	//*  30   48:aload_3         
	//*  31   49:invokevirtual   #209 <Method android.view.ViewParent View.getParent()>
	//*  32   52:aload_0         
	//*  33   53:if_acmpne       63
					{
						onViewAdded(view2);
	//   34   56:aload_0         
	//   35   57:aload_3         
	//   36   58:invokevirtual   #213 <Method void onViewAdded(View)>
						view = view2;
	//   37   61:aload_3         
	//   38   62:astore_2        
					}
				}
			}
		}
		if(view == this)
	//*  39   63:aload_2         
	//*  40   64:aload_0         
	//*  41   65:if_acmpne       73
			return ((j) (b));
	//   42   68:aload_0         
	//   43   69:getfield        #57  <Field m b>
	//   44   72:areturn         
		if(view == null)
	//*  45   73:aload_2         
	//*  46   74:ifnonnull       79
			return null;
	//   47   77:aconst_null     
	//   48   78:areturn         
		else
			return ((c)view.getLayoutParams()).al;
	//   49   79:aload_2         
	//   50   80:invokevirtual   #125 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   51   83:checkcast       #127 <Class c>
	//   52   86:getfield        #131 <Field j c.al>
	//   53   89:areturn         
	}

	private void b()
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int getChildCount()>
	//    2    4:istore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i1 = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//    7   10:iload_3         
	//    8   11:istore_2        
			if(i1 >= j1)
				break;
	//    9   12:iload_1         
	//   10   13:iload           4
	//   11   15:icmpge          41
			if(getChildAt(i1).isLayoutRequested())
	//*  12   18:aload_0         
	//*  13   19:iload_1         
	//*  14   20:invokevirtual   #116 <Method View getChildAt(int)>
	//*  15   23:invokevirtual   #217 <Method boolean View.isLayoutRequested()>
	//*  16   26:ifeq            34
			{
				flag = true;
	//   17   29:iconst_1        
	//   18   30:istore_2        
				break;
	//   19   31:goto            41
			}
			i1++;
	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
		} while(true);
	//   24   38:goto            10
		if(flag)
	//*  25   41:iload_2         
	//*  26   42:ifeq            56
		{
			h.clear();
	//   27   45:aload_0         
	//   28   46:getfield        #52  <Field ArrayList h>
	//   29   49:invokevirtual   #220 <Method void ArrayList.clear()>
			c();
	//   30   52:aload_0         
	//   31   53:invokespecial   #222 <Method void c()>
		}
	//   32   56:return          
	}

	private void b(int i1, int j1)
	{
		Object obj = ((Object) (this));
	//    0    0:aload_0         
	//    1    1:astore          21
		int l3 = getPaddingTop() + getPaddingBottom();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #100 <Method int getPaddingTop()>
	//    4    7:aload_0         
	//    5    8:invokevirtual   #103 <Method int getPaddingBottom()>
	//    6   11:iadd            
	//    7   12:istore          8
		int k5 = getPaddingLeft() + getPaddingRight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #106 <Method int getPaddingLeft()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #109 <Method int getPaddingRight()>
	//   12   22:iadd            
	//   13   23:istore          15
		int i4 = getChildCount();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #112 <Method int getChildCount()>
	//   16   29:istore          9
		int k1 = 0;
	//   17   31:iconst_0        
	//   18   32:istore_3        
		do
		{
			long l5 = 1L;
	//   19   33:lconst_1        
	//   20   34:lstore          16
			if(k1 >= i4)
				break;
	//   21   36:iload_3         
	//   22   37:iload           9
	//   23   39:icmpge          411
			View view = ((ConstraintLayout) (obj)).getChildAt(k1);
	//   24   42:aload           21
	//   25   44:iload_3         
	//   26   45:invokevirtual   #116 <Method View getChildAt(int)>
	//   27   48:astore          22
			if(view.getVisibility() != 8)
	//*  28   50:aload           22
	//*  29   52:invokevirtual   #121 <Method int View.getVisibility()>
	//*  30   55:bipush          8
	//*  31   57:icmpne          63
	//*  32   60:goto            404
			{
				c c1 = (c)view.getLayoutParams();
	//   33   63:aload           22
	//   34   65:invokevirtual   #125 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   35   68:checkcast       #127 <Class c>
	//   36   71:astore          23
				j j7 = c1.al;
	//   37   73:aload           23
	//   38   75:getfield        #131 <Field j c.al>
	//   39   78:astore          24
				if(!c1.Y && !c1.Z)
	//*  40   80:aload           23
	//*  41   82:getfield        #134 <Field boolean c.Y>
	//*  42   85:ifne            404
	//*  43   88:aload           23
	//*  44   90:getfield        #136 <Field boolean c.Z>
	//*  45   93:ifeq            99
	//*  46   96:goto            404
				{
					j7.e(view.getVisibility());
	//   47   99:aload           24
	//   48  101:aload           22
	//   49  103:invokevirtual   #121 <Method int View.getVisibility()>
	//   50  106:invokevirtual   #140 <Method void j.e(int)>
					int l2 = c1.width;
	//   51  109:aload           23
	//   52  111:getfield        #143 <Field int c.width>
	//   53  114:istore          6
					int j3 = c1.height;
	//   54  116:aload           23
	//   55  118:getfield        #146 <Field int c.height>
	//   56  121:istore          7
					if(l2 != 0 && j3 != 0)
	//*  57  123:iload           6
	//*  58  125:ifeq            385
	//*  59  128:iload           7
	//*  60  130:ifne            136
	//*  61  133:goto            385
					{
						boolean flag;
						if(l2 == -2)
	//*  62  136:iload           6
	//*  63  138:bipush          -2
	//*  64  140:icmpne          149
							flag = true;
	//   65  143:iconst_1        
	//   66  144:istore          4
						else
	//*  67  146:goto            152
							flag = false;
	//   68  149:iconst_0        
	//   69  150:istore          4
						int j4 = getChildMeasureSpec(i1, k5, l2);
	//   70  152:iload_1         
	//   71  153:iload           15
	//   72  155:iload           6
	//   73  157:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//   74  160:istore          10
						boolean flag2;
						if(j3 == -2)
	//*  75  162:iload           7
	//*  76  164:bipush          -2
	//*  77  166:icmpne          175
							flag2 = true;
	//   78  169:iconst_1        
	//   79  170:istore          5
						else
	//*  80  172:goto            178
							flag2 = false;
	//   81  175:iconst_0        
	//   82  176:istore          5
						view.measure(j4, getChildMeasureSpec(j1, l3, j3));
	//   83  178:aload           22
	//   84  180:iload           10
	//   85  182:iload_2         
	//   86  183:iload           8
	//   87  185:iload           7
	//   88  187:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//   89  190:invokevirtual   #164 <Method void View.measure(int, int)>
						g g1 = ((ConstraintLayout) (obj)).t;
	//   90  193:aload           21
	//   91  195:getfield        #166 <Field g t>
	//   92  198:astore          25
						if(g1 != null)
	//*  93  200:aload           25
	//*  94  202:ifnull          220
							g1.a = g1.a + 1L;
	//   95  205:aload           25
	//   96  207:aload           25
	//   97  209:getfield        #170 <Field long g.a>
	//   98  212:lconst_1        
	//   99  213:ladd            
	//  100  214:putfield        #170 <Field long g.a>
	//* 101  217:goto            220
						boolean flag5;
						if(l2 == -2)
	//* 102  220:iload           6
	//* 103  222:bipush          -2
	//* 104  224:icmpne          233
							flag5 = true;
	//  105  227:iconst_1        
	//  106  228:istore          20
						else
	//* 107  230:goto            236
							flag5 = false;
	//  108  233:iconst_0        
	//  109  234:istore          20
						j7.b(flag5);
	//  110  236:aload           24
	//  111  238:iload           20
	//  112  240:invokevirtual   #173 <Method void j.b(boolean)>
						if(j3 == -2)
	//* 113  243:iload           7
	//* 114  245:bipush          -2
	//* 115  247:icmpne          256
							flag5 = true;
	//  116  250:iconst_1        
	//  117  251:istore          20
						else
	//* 118  253:goto            259
							flag5 = false;
	//  119  256:iconst_0        
	//  120  257:istore          20
						j7.c(flag5);
	//  121  259:aload           24
	//  122  261:iload           20
	//  123  263:invokevirtual   #175 <Method void j.c(boolean)>
						l2 = view.getMeasuredWidth();
	//  124  266:aload           22
	//  125  268:invokevirtual   #178 <Method int View.getMeasuredWidth()>
	//  126  271:istore          6
						j3 = view.getMeasuredHeight();
	//  127  273:aload           22
	//  128  275:invokevirtual   #181 <Method int View.getMeasuredHeight()>
	//  129  278:istore          7
						j7.j(l2);
	//  130  280:aload           24
	//  131  282:iload           6
	//  132  284:invokevirtual   #183 <Method void j.j(int)>
						j7.k(j3);
	//  133  287:aload           24
	//  134  289:iload           7
	//  135  291:invokevirtual   #185 <Method void j.k(int)>
						if(flag)
	//* 136  294:iload           4
	//* 137  296:ifeq            306
							j7.n(l2);
	//  138  299:aload           24
	//  139  301:iload           6
	//  140  303:invokevirtual   #187 <Method void j.n(int)>
						if(flag2)
	//* 141  306:iload           5
	//* 142  308:ifeq            318
							j7.o(j3);
	//  143  311:aload           24
	//  144  313:iload           7
	//  145  315:invokevirtual   #189 <Method void j.o(int)>
						if(c1.X)
	//* 146  318:aload           23
	//* 147  320:getfield        #192 <Field boolean c.X>
	//* 148  323:ifeq            346
						{
							int j2 = view.getBaseline();
	//  149  326:aload           22
	//  150  328:invokevirtual   #195 <Method int View.getBaseline()>
	//  151  331:istore          4
							if(j2 != -1)
	//* 152  333:iload           4
	//* 153  335:iconst_m1       
	//* 154  336:icmpeq          346
								j7.q(j2);
	//  155  339:aload           24
	//  156  341:iload           4
	//  157  343:invokevirtual   #197 <Method void j.q(int)>
						}
						if(c1.V && c1.W)
	//* 158  346:aload           23
	//* 159  348:getfield        #149 <Field boolean c.V>
	//* 160  351:ifeq            404
	//* 161  354:aload           23
	//* 162  356:getfield        #152 <Field boolean c.W>
	//* 163  359:ifeq            404
						{
							j7.i().a(l2);
	//  164  362:aload           24
	//  165  364:invokevirtual   #225 <Method u j.i()>
	//  166  367:iload           6
	//  167  369:invokevirtual   #229 <Method void u.a(int)>
							j7.j().a(j3);
	//  168  372:aload           24
	//  169  374:invokevirtual   #231 <Method u j.j()>
	//  170  377:iload           7
	//  171  379:invokevirtual   #229 <Method void u.a(int)>
						}
					} else
	//* 172  382:goto            404
					{
						j7.i().e();
	//  173  385:aload           24
	//  174  387:invokevirtual   #225 <Method u j.i()>
	//  175  390:invokevirtual   #233 <Method void u.e()>
						j7.j().e();
	//  176  393:aload           24
	//  177  395:invokevirtual   #231 <Method u j.j()>
	//  178  398:invokevirtual   #233 <Method void u.e()>
					}
				}
			}
	//* 179  401:goto            404
			k1++;
	//  180  404:iload_3         
	//  181  405:iconst_1        
	//  182  406:iadd            
	//  183  407:istore_3        
		} while(true);
	//  184  408:goto            33
		((ConstraintLayout) (obj)).b.P();
	//  185  411:aload           21
	//  186  413:getfield        #57  <Field m b>
	//  187  416:invokevirtual   #236 <Method void m.P()>
		for(int k4 = 0; k4 < i4;)
	//* 188  419:iconst_0        
	//* 189  420:istore          10
	//* 190  422:iload           10
	//* 191  424:iload           9
	//* 192  426:icmpge          1338
		{
			Object obj1 = ((Object) (((ConstraintLayout) (obj)).getChildAt(k4)));
	//  193  429:aload           21
	//  194  431:iload           10
	//  195  433:invokevirtual   #116 <Method View getChildAt(int)>
	//  196  436:astore          22
			if(((View) (obj1)).getVisibility() == 8)
	//* 197  438:aload           22
	//* 198  440:invokevirtual   #121 <Method int View.getVisibility()>
	//* 199  443:bipush          8
	//* 200  445:icmpne          455
			{
				obj1 = obj;
	//  201  448:aload           21
	//  202  450:astore          22
			} else
	//* 203  452:goto            1325
			{
				c c2 = (c)((View) (obj1)).getLayoutParams();
	//  204  455:aload           22
	//  205  457:invokevirtual   #125 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  206  460:checkcast       #127 <Class c>
	//  207  463:astore          24
				j j6 = c2.al;
	//  208  465:aload           24
	//  209  467:getfield        #131 <Field j c.al>
	//  210  470:astore          23
				if(!c2.Y)
	//* 211  472:aload           24
	//* 212  474:getfield        #134 <Field boolean c.Y>
	//* 213  477:ifne            1321
				{
					if(c2.Z)
	//* 214  480:aload           24
	//* 215  482:getfield        #136 <Field boolean c.Z>
	//* 216  485:ifeq            495
					{
						obj1 = obj;
	//  217  488:aload           21
	//  218  490:astore          22
					} else
	//* 219  492:goto            1325
					{
						j6.e(((View) (obj1)).getVisibility());
	//  220  495:aload           23
	//  221  497:aload           22
	//  222  499:invokevirtual   #121 <Method int View.getVisibility()>
	//  223  502:invokevirtual   #140 <Method void j.e(int)>
						int l4 = c2.width;
	//  224  505:aload           24
	//  225  507:getfield        #143 <Field int c.width>
	//  226  510:istore          12
						int i5 = c2.height;
	//  227  512:aload           24
	//  228  514:getfield        #146 <Field int c.height>
	//  229  517:istore          13
						if(l4 != 0 && i5 != 0)
	//* 230  519:iload           12
	//* 231  521:ifeq            536
	//* 232  524:iload           13
	//* 233  526:ifeq            536
						{
							obj1 = obj;
	//  234  529:aload           21
	//  235  531:astore          22
						} else
	//* 236  533:goto            1325
						{
							Object obj2 = ((Object) (j6.a(i.b).a()));
	//  237  536:aload           23
	//  238  538:getstatic       #241 <Field i i.b>
	//  239  541:invokevirtual   #244 <Method e j.a(i)>
	//  240  544:invokevirtual   #249 <Method t e.a()>
	//  241  547:astore          25
							t t1 = j6.a(i.d).a();
	//  242  549:aload           23
	//  243  551:getstatic       #251 <Field i i.d>
	//  244  554:invokevirtual   #244 <Method e j.a(i)>
	//  245  557:invokevirtual   #249 <Method t e.a()>
	//  246  560:astore          26
							boolean flag1;
							if(j6.a(i.b).g() != null && j6.a(i.d).g() != null)
	//* 247  562:aload           23
	//* 248  564:getstatic       #241 <Field i i.b>
	//* 249  567:invokevirtual   #244 <Method e j.a(i)>
	//* 250  570:invokevirtual   #254 <Method e e.g()>
	//* 251  573:ifnull          596
	//* 252  576:aload           23
	//* 253  578:getstatic       #251 <Field i i.d>
	//* 254  581:invokevirtual   #244 <Method e j.a(i)>
	//* 255  584:invokevirtual   #254 <Method e e.g()>
	//* 256  587:ifnull          596
								flag1 = true;
	//  257  590:iconst_1        
	//  258  591:istore          4
							else
	//* 259  593:goto            599
								flag1 = false;
	//  260  596:iconst_0        
	//  261  597:istore          4
							t t2 = j6.a(i.c).a();
	//  262  599:aload           23
	//  263  601:getstatic       #256 <Field i i.c>
	//  264  604:invokevirtual   #244 <Method e j.a(i)>
	//  265  607:invokevirtual   #249 <Method t e.a()>
	//  266  610:astore          27
							t t3 = j6.a(i.e).a();
	//  267  612:aload           23
	//  268  614:getstatic       #258 <Field i i.e>
	//  269  617:invokevirtual   #244 <Method e j.a(i)>
	//  270  620:invokevirtual   #249 <Method t e.a()>
	//  271  623:astore          28
							int k3;
							if(j6.a(i.c).g() != null && j6.a(i.e).g() != null)
	//* 272  625:aload           23
	//* 273  627:getstatic       #256 <Field i i.c>
	//* 274  630:invokevirtual   #244 <Method e j.a(i)>
	//* 275  633:invokevirtual   #254 <Method e e.g()>
	//* 276  636:ifnull          659
	//* 277  639:aload           23
	//* 278  641:getstatic       #258 <Field i i.e>
	//* 279  644:invokevirtual   #244 <Method e j.a(i)>
	//* 280  647:invokevirtual   #254 <Method e e.g()>
	//* 281  650:ifnull          659
								k3 = 1;
	//  282  653:iconst_1        
	//  283  654:istore          7
							else
	//* 284  656:goto            662
								k3 = 0;
	//  285  659:iconst_0        
	//  286  660:istore          7
							if(l4 == 0 && i5 == 0 && flag1 && k3)
	//* 287  662:iload           12
	//* 288  664:ifne            692
	//* 289  667:iload           13
	//* 290  669:ifne            692
	//* 291  672:iload           4
	//* 292  674:ifeq            692
	//* 293  677:iload           7
	//* 294  679:ifeq            692
							{
								long l6 = 1L;
	//  295  682:lconst_1        
	//  296  683:lstore          16
								obj1 = obj;
	//  297  685:aload           21
	//  298  687:astore          22
							} else
	//* 299  689:goto            1325
							{
								boolean flag3;
								if(((ConstraintLayout) (obj)).b.F() != l.b)
	//* 300  692:aload           21
	//* 301  694:getfield        #57  <Field m b>
	//* 302  697:invokevirtual   #262 <Method l m.F()>
	//* 303  700:getstatic       #267 <Field l l.b>
	//* 304  703:if_acmpeq       712
									flag3 = true;
	//  305  706:iconst_1        
	//  306  707:istore          6
								else
	//* 307  709:goto            715
									flag3 = false;
	//  308  712:iconst_0        
	//  309  713:istore          6
								int l1;
								if(((ConstraintLayout) (obj)).b.G() != l.b)
	//* 310  715:aload           21
	//* 311  717:getfield        #57  <Field m b>
	//* 312  720:invokevirtual   #270 <Method l m.G()>
	//* 313  723:getstatic       #267 <Field l l.b>
	//* 314  726:if_acmpeq       734
									l1 = 1;
	//  315  729:iconst_1        
	//  316  730:istore_3        
								else
	//* 317  731:goto            736
									l1 = 0;
	//  318  734:iconst_0        
	//  319  735:istore_3        
								if(!flag3)
	//* 320  736:iload           6
	//* 321  738:ifne            749
									j6.i().e();
	//  322  741:aload           23
	//  323  743:invokevirtual   #225 <Method u j.i()>
	//  324  746:invokevirtual   #233 <Method void u.e()>
								if(l1 == 0)
	//* 325  749:iload_3         
	//* 326  750:ifne            761
									j6.j().e();
	//  327  753:aload           23
	//  328  755:invokevirtual   #231 <Method u j.j()>
	//  329  758:invokevirtual   #233 <Method void u.e()>
								int k2;
								boolean flag4;
								if(l4 == 0)
	//* 330  761:iload           12
	//* 331  763:ifne            863
								{
									if(flag3 && j6.d() && flag1 && ((t) (obj2)).g() && t1.g())
	//* 332  766:iload           6
	//* 333  768:ifeq            844
	//* 334  771:aload           23
	//* 335  773:invokevirtual   #272 <Method boolean j.d()>
	//* 336  776:ifeq            844
	//* 337  779:iload           4
	//* 338  781:ifeq            844
	//* 339  784:aload           25
	//* 340  786:invokevirtual   #276 <Method boolean t.g()>
	//* 341  789:ifeq            844
	//* 342  792:aload           26
	//* 343  794:invokevirtual   #276 <Method boolean t.g()>
	//* 344  797:ifeq            844
									{
										l4 = (int)(t1.d() - ((t) (obj2)).d());
	//  345  800:aload           26
	//  346  802:invokevirtual   #279 <Method float t.d()>
	//  347  805:aload           25
	//  348  807:invokevirtual   #279 <Method float t.d()>
	//  349  810:fsub            
	//  350  811:f2i             
	//  351  812:istore          12
										j6.i().a(l4);
	//  352  814:aload           23
	//  353  816:invokevirtual   #225 <Method u j.i()>
	//  354  819:iload           12
	//  355  821:invokevirtual   #229 <Method void u.a(int)>
										k2 = getChildMeasureSpec(i1, k5, l4);
	//  356  824:iload_1         
	//  357  825:iload           15
	//  358  827:iload           12
	//  359  829:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  360  832:istore          5
										flag1 = false;
	//  361  834:iconst_0        
	//  362  835:istore          4
										flag4 = flag3;
	//  363  837:iload           6
	//  364  839:istore          11
									} else
	//* 365  841:goto            918
									{
										k2 = getChildMeasureSpec(i1, k5, -2);
	//  366  844:iload_1         
	//  367  845:iload           15
	//  368  847:bipush          -2
	//  369  849:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  370  852:istore          5
										flag1 = true;
	//  371  854:iconst_1        
	//  372  855:istore          4
										flag4 = false;
	//  373  857:iconst_0        
	//  374  858:istore          11
									}
								} else
	//* 375  860:goto            918
								if(l4 == -1)
	//* 376  863:iload           12
	//* 377  865:iconst_m1       
	//* 378  866:icmpne          888
								{
									k2 = getChildMeasureSpec(i1, k5, -1);
	//  379  869:iload_1         
	//  380  870:iload           15
	//  381  872:iconst_m1       
	//  382  873:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  383  876:istore          5
									flag1 = false;
	//  384  878:iconst_0        
	//  385  879:istore          4
									flag4 = flag3;
	//  386  881:iload           6
	//  387  883:istore          11
								} else
	//* 388  885:goto            918
								{
									if(l4 == -2)
	//* 389  888:iload           12
	//* 390  890:bipush          -2
	//* 391  892:icmpne          901
										flag1 = true;
	//  392  895:iconst_1        
	//  393  896:istore          4
									else
	//* 394  898:goto            904
										flag1 = false;
	//  395  901:iconst_0        
	//  396  902:istore          4
									k2 = getChildMeasureSpec(i1, k5, l4);
	//  397  904:iload_1         
	//  398  905:iload           15
	//  399  907:iload           12
	//  400  909:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  401  912:istore          5
									flag4 = flag3;
	//  402  914:iload           6
	//  403  916:istore          11
								}
								int i3;
								if(i5 == 0)
	//* 404  918:iload           13
	//* 405  920:ifne            1020
								{
									if(l1 != 0 && j6.e() && k3 && t2.g() && t3.g())
	//* 406  923:iload_3         
	//* 407  924:ifeq            1002
	//* 408  927:aload           23
	//* 409  929:invokevirtual   #281 <Method boolean j.e()>
	//* 410  932:ifeq            1002
	//* 411  935:iload           7
	//* 412  937:ifeq            1002
	//* 413  940:aload           27
	//* 414  942:invokevirtual   #276 <Method boolean t.g()>
	//* 415  945:ifeq            1002
	//* 416  948:aload           28
	//* 417  950:invokevirtual   #276 <Method boolean t.g()>
	//* 418  953:ifeq            1002
									{
										i5 = (int)(t3.d() - t2.d());
	//  419  956:aload           28
	//  420  958:invokevirtual   #279 <Method float t.d()>
	//  421  961:aload           27
	//  422  963:invokevirtual   #279 <Method float t.d()>
	//  423  966:fsub            
	//  424  967:f2i             
	//  425  968:istore          13
										j6.j().a(i5);
	//  426  970:aload           23
	//  427  972:invokevirtual   #231 <Method u j.j()>
	//  428  975:iload           13
	//  429  977:invokevirtual   #229 <Method void u.a(int)>
										i3 = getChildMeasureSpec(j1, l3, i5);
	//  430  980:iload_2         
	//  431  981:iload           8
	//  432  983:iload           13
	//  433  985:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  434  988:istore          6
										k3 = l1;
	//  435  990:iload_3         
	//  436  991:istore          7
										l1 = i3;
	//  437  993:iload           6
	//  438  995:istore_3        
										i3 = 0;
	//  439  996:iconst_0        
	//  440  997:istore          6
									} else
	//* 441  999:goto            1079
									{
										l1 = getChildMeasureSpec(j1, l3, -2);
	//  442 1002:iload_2         
	//  443 1003:iload           8
	//  444 1005:bipush          -2
	//  445 1007:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  446 1010:istore_3        
										i3 = 1;
	//  447 1011:iconst_1        
	//  448 1012:istore          6
										k3 = 0;
	//  449 1014:iconst_0        
	//  450 1015:istore          7
									}
								} else
	//* 451 1017:goto            1079
								if(i5 == -1)
	//* 452 1020:iload           13
	//* 453 1022:iconst_m1       
	//* 454 1023:icmpne          1047
								{
									i3 = getChildMeasureSpec(j1, l3, -1);
	//  455 1026:iload_2         
	//  456 1027:iload           8
	//  457 1029:iconst_m1       
	//  458 1030:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  459 1033:istore          6
									k3 = l1;
	//  460 1035:iload_3         
	//  461 1036:istore          7
									l1 = i3;
	//  462 1038:iload           6
	//  463 1040:istore_3        
									i3 = 0;
	//  464 1041:iconst_0        
	//  465 1042:istore          6
								} else
	//* 466 1044:goto            1079
								{
									if(i5 == -2)
	//* 467 1047:iload           13
	//* 468 1049:bipush          -2
	//* 469 1051:icmpne          1060
										i3 = 1;
	//  470 1054:iconst_1        
	//  471 1055:istore          6
									else
	//* 472 1057:goto            1063
										i3 = 0;
	//  473 1060:iconst_0        
	//  474 1061:istore          6
									int j5 = getChildMeasureSpec(j1, l3, i5);
	//  475 1063:iload_2         
	//  476 1064:iload           8
	//  477 1066:iload           13
	//  478 1068:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  479 1071:istore          14
									k3 = l1;
	//  480 1073:iload_3         
	//  481 1074:istore          7
									l1 = j5;
	//  482 1076:iload           14
	//  483 1078:istore_3        
								}
								((View) (obj1)).measure(k2, l1);
	//  484 1079:aload           22
	//  485 1081:iload           5
	//  486 1083:iload_3         
	//  487 1084:invokevirtual   #164 <Method void View.measure(int, int)>
								obj = ((Object) (this));
	//  488 1087:aload_0         
	//  489 1088:astore          21
								obj2 = ((Object) (((ConstraintLayout) (obj)).t));
	//  490 1090:aload           21
	//  491 1092:getfield        #166 <Field g t>
	//  492 1095:astore          25
								if(obj2 != null)
	//* 493 1097:aload           25
	//* 494 1099:ifnull          1117
									obj2.a = ((g) (obj2)).a + 1L;
	//  495 1102:aload           25
	//  496 1104:aload           25
	//  497 1106:getfield        #170 <Field long g.a>
	//  498 1109:lconst_1        
	//  499 1110:ladd            
	//  500 1111:putfield        #170 <Field long g.a>
	//* 501 1114:goto            1117
								long l10 = 1L;
	//  502 1117:lconst_1        
	//  503 1118:lstore          18
								boolean flag6;
								if(l4 == -2)
	//* 504 1120:iload           12
	//* 505 1122:bipush          -2
	//* 506 1124:icmpne          1133
									flag6 = true;
	//  507 1127:iconst_1        
	//  508 1128:istore          20
								else
	//* 509 1130:goto            1136
									flag6 = false;
	//  510 1133:iconst_0        
	//  511 1134:istore          20
								j6.b(flag6);
	//  512 1136:aload           23
	//  513 1138:iload           20
	//  514 1140:invokevirtual   #173 <Method void j.b(boolean)>
								if(i5 == -2)
	//* 515 1143:iload           13
	//* 516 1145:bipush          -2
	//* 517 1147:icmpne          1156
									flag6 = true;
	//  518 1150:iconst_1        
	//  519 1151:istore          20
								else
	//* 520 1153:goto            1159
									flag6 = false;
	//  521 1156:iconst_0        
	//  522 1157:istore          20
								j6.c(flag6);
	//  523 1159:aload           23
	//  524 1161:iload           20
	//  525 1163:invokevirtual   #175 <Method void j.c(boolean)>
								l1 = ((View) (obj1)).getMeasuredWidth();
	//  526 1166:aload           22
	//  527 1168:invokevirtual   #178 <Method int View.getMeasuredWidth()>
	//  528 1171:istore_3        
								k2 = ((View) (obj1)).getMeasuredHeight();
	//  529 1172:aload           22
	//  530 1174:invokevirtual   #181 <Method int View.getMeasuredHeight()>
	//  531 1177:istore          5
								j6.j(l1);
	//  532 1179:aload           23
	//  533 1181:iload_3         
	//  534 1182:invokevirtual   #183 <Method void j.j(int)>
								j6.k(k2);
	//  535 1185:aload           23
	//  536 1187:iload           5
	//  537 1189:invokevirtual   #185 <Method void j.k(int)>
								if(flag1)
	//* 538 1192:iload           4
	//* 539 1194:ifeq            1203
									j6.n(l1);
	//  540 1197:aload           23
	//  541 1199:iload_3         
	//  542 1200:invokevirtual   #187 <Method void j.n(int)>
								if(i3 != 0)
	//* 543 1203:iload           6
	//* 544 1205:ifeq            1215
									j6.o(k2);
	//  545 1208:aload           23
	//  546 1210:iload           5
	//  547 1212:invokevirtual   #189 <Method void j.o(int)>
								if(flag4)
	//* 548 1215:iload           11
	//* 549 1217:ifeq            1232
									j6.i().a(l1);
	//  550 1220:aload           23
	//  551 1222:invokevirtual   #225 <Method u j.i()>
	//  552 1225:iload_3         
	//  553 1226:invokevirtual   #229 <Method void u.a(int)>
								else
	//* 554 1229:goto            1240
									j6.i().c();
	//  555 1232:aload           23
	//  556 1234:invokevirtual   #225 <Method u j.i()>
	//  557 1237:invokevirtual   #282 <Method void u.c()>
								if(k3 != 0)
	//* 558 1240:iload           7
	//* 559 1242:ifeq            1258
									j6.j().a(k2);
	//  560 1245:aload           23
	//  561 1247:invokevirtual   #231 <Method u j.j()>
	//  562 1250:iload           5
	//  563 1252:invokevirtual   #229 <Method void u.a(int)>
								else
	//* 564 1255:goto            1266
									j6.j().c();
	//  565 1258:aload           23
	//  566 1260:invokevirtual   #231 <Method u j.j()>
	//  567 1263:invokevirtual   #282 <Method void u.c()>
								if(c2.X)
	//* 568 1266:aload           24
	//* 569 1268:getfield        #192 <Field boolean c.X>
	//* 570 1271:ifeq            1310
								{
									int i2 = ((View) (obj1)).getBaseline();
	//  571 1274:aload           22
	//  572 1276:invokevirtual   #195 <Method int View.getBaseline()>
	//  573 1279:istore_3        
									obj1 = obj;
	//  574 1280:aload           21
	//  575 1282:astore          22
									long l7 = l10;
	//  576 1284:lload           18
	//  577 1286:lstore          16
									if(i2 != -1)
	//* 578 1288:iload_3         
	//* 579 1289:iconst_m1       
	//* 580 1290:icmpeq          1325
									{
										j6.q(i2);
	//  581 1293:aload           23
	//  582 1295:iload_3         
	//  583 1296:invokevirtual   #197 <Method void j.q(int)>
										obj1 = obj;
	//  584 1299:aload           21
	//  585 1301:astore          22
										long l8 = l10;
	//  586 1303:lload           18
	//  587 1305:lstore          16
									}
								} else
	//* 588 1307:goto            1325
								{
									obj1 = obj;
	//  589 1310:aload           21
	//  590 1312:astore          22
									long l9 = l10;
	//  591 1314:lload           18
	//  592 1316:lstore          16
								}
							}
						}
					}
				} else
	//* 593 1318:goto            1325
				{
					obj1 = obj;
	//  594 1321:aload           21
	//  595 1323:astore          22
				}
			}
			k4++;
	//  596 1325:iload           10
	//  597 1327:iconst_1        
	//  598 1328:iadd            
	//  599 1329:istore          10
			obj = obj1;
	//  600 1331:aload           22
	//  601 1333:astore          21
		}

	//* 602 1335:goto            422
	//  603 1338:return          
	}

	private void b(AttributeSet attributeset)
	{
		android.content.res.Resources.NotFoundException notfoundexception;
		b.a(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field m b>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #287 <Method void m.a(Object)>
		a.put(getId(), ((Object) (this)));
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field SparseArray a>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #290 <Method int getId()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #294 <Method void SparseArray.put(int, Object)>
		o = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #72  <Field android.support.constraint.e o>
		if(attributeset != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          251
		{
			attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, n.ConstraintLayout_Layout)));
	//   15   29:aload_0         
	//   16   30:invokevirtual   #298 <Method Context getContext()>
	//   17   33:aload_1         
	//   18   34:getstatic       #304 <Field int[] n.ConstraintLayout_Layout>
	//   19   37:invokevirtual   #310 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   20   40:astore_1        
			int j1 = ((TypedArray) (attributeset)).getIndexCount();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #315 <Method int TypedArray.getIndexCount()>
	//   23   45:istore_3        
			for(int i1 = 0; i1 < j1; i1++)
	//*  24   46:iconst_0        
	//*  25   47:istore_2        
	//*  26   48:iload_2         
	//*  27   49:iload_3         
	//*  28   50:icmpge          247
			{
				int k1 = ((TypedArray) (attributeset)).getIndex(i1);
	//   29   53:aload_1         
	//   30   54:iload_2         
	//   31   55:invokevirtual   #319 <Method int TypedArray.getIndex(int)>
	//   32   58:istore          4
				if(k1 == n.ConstraintLayout_Layout_android_minWidth)
	//*  33   60:iload           4
	//*  34   62:getstatic       #322 <Field int n.ConstraintLayout_Layout_android_minWidth>
	//*  35   65:icmpne          85
				{
					i = ((TypedArray) (attributeset)).getDimensionPixelOffset(k1, i);
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:iload           4
	//   39   72:aload_0         
	//   40   73:getfield        #59  <Field int i>
	//   41   76:invokevirtual   #326 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   42   79:putfield        #59  <Field int i>
					continue;
	//   43   82:goto            240
				}
				if(k1 == n.ConstraintLayout_Layout_android_minHeight)
	//*  44   85:iload           4
	//*  45   87:getstatic       #329 <Field int n.ConstraintLayout_Layout_android_minHeight>
	//*  46   90:icmpne          110
				{
					j = ((TypedArray) (attributeset)).getDimensionPixelOffset(k1, j);
	//   47   93:aload_0         
	//   48   94:aload_1         
	//   49   95:iload           4
	//   50   97:aload_0         
	//   51   98:getfield        #61  <Field int j>
	//   52  101:invokevirtual   #326 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   53  104:putfield        #61  <Field int j>
					continue;
	//   54  107:goto            240
				}
				if(k1 == n.ConstraintLayout_Layout_android_maxWidth)
	//*  55  110:iload           4
	//*  56  112:getstatic       #332 <Field int n.ConstraintLayout_Layout_android_maxWidth>
	//*  57  115:icmpne          135
				{
					k = ((TypedArray) (attributeset)).getDimensionPixelOffset(k1, k);
	//   58  118:aload_0         
	//   59  119:aload_1         
	//   60  120:iload           4
	//   61  122:aload_0         
	//   62  123:getfield        #64  <Field int k>
	//   63  126:invokevirtual   #326 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   64  129:putfield        #64  <Field int k>
					continue;
	//   65  132:goto            240
				}
				if(k1 == n.ConstraintLayout_Layout_android_maxHeight)
	//*  66  135:iload           4
	//*  67  137:getstatic       #335 <Field int n.ConstraintLayout_Layout_android_maxHeight>
	//*  68  140:icmpne          160
				{
					l = ((TypedArray) (attributeset)).getDimensionPixelOffset(k1, l);
	//   69  143:aload_0         
	//   70  144:aload_1         
	//   71  145:iload           4
	//   72  147:aload_0         
	//   73  148:getfield        #66  <Field int l>
	//   74  151:invokevirtual   #326 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   75  154:putfield        #66  <Field int l>
					continue;
	//   76  157:goto            240
				}
				if(k1 == n.ConstraintLayout_Layout_layout_optimizationLevel)
	//*  77  160:iload           4
	//*  78  162:getstatic       #338 <Field int n.ConstraintLayout_Layout_layout_optimizationLevel>
	//*  79  165:icmpne          185
				{
					n = ((TypedArray) (attributeset)).getInt(k1, n);
	//   80  168:aload_0         
	//   81  169:aload_1         
	//   82  170:iload           4
	//   83  172:aload_0         
	//   84  173:getfield        #70  <Field int n>
	//   85  176:invokevirtual   #341 <Method int TypedArray.getInt(int, int)>
	//   86  179:putfield        #70  <Field int n>
					continue;
	//   87  182:goto            240
				}
				if(k1 != n.ConstraintLayout_Layout_constraintSet)
					continue;
	//   88  185:iload           4
	//   89  187:getstatic       #344 <Field int n.ConstraintLayout_Layout_constraintSet>
	//   90  190:icmpne          240
				k1 = ((TypedArray) (attributeset)).getResourceId(k1, 0);
	//   91  193:aload_1         
	//   92  194:iload           4
	//   93  196:iconst_0        
	//   94  197:invokevirtual   #347 <Method int TypedArray.getResourceId(int, int)>
	//   95  200:istore          4
				try
				{
					o = new android.support.constraint.e();
	//   96  202:aload_0         
	//   97  203:new             #349 <Class android.support.constraint.e>
	//   98  206:dup             
	//   99  207:invokespecial   #350 <Method void android.support.constraint.e()>
	//  100  210:putfield        #72  <Field android.support.constraint.e o>
					o.a(getContext(), k1);
	//  101  213:aload_0         
	//  102  214:getfield        #72  <Field android.support.constraint.e o>
	//  103  217:aload_0         
	//  104  218:invokevirtual   #298 <Method Context getContext()>
	//  105  221:iload           4
	//  106  223:invokevirtual   #353 <Method void android.support.constraint.e.a(Context, int)>
				}
	//* 107  226:goto            234
	//* 108  229:aload_0         
	//* 109  230:aconst_null     
	//* 110  231:putfield        #72  <Field android.support.constraint.e o>
	//* 111  234:aload_0         
	//* 112  235:iload           4
	//* 113  237:putfield        #74  <Field int p>
	//* 114  240:iload_2         
	//* 115  241:iconst_1        
	//* 116  242:iadd            
	//* 117  243:istore_2        
	//* 118  244:goto            48
	//* 119  247:aload_1         
	//* 120  248:invokevirtual   #356 <Method void TypedArray.recycle()>
	//* 121  251:aload_0         
	//* 122  252:getfield        #57  <Field m b>
	//* 123  255:aload_0         
	//* 124  256:getfield        #70  <Field int n>
	//* 125  259:invokevirtual   #357 <Method void m.a(int)>
	//* 126  262:return          
				// Misplaced declaration of an exception variable
				catch(android.content.res.Resources.NotFoundException notfoundexception)
				{
					o = null;
				}
				p = k1;
			}

			((TypedArray) (attributeset)).recycle();
		}
		b.a(n);
	//* 127  263:astore          5
	//* 128  265:goto            229
	}

	private void c()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #359 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #361 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #366 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private void c(int i1, int j1)
	{
		int j2 = android.view.View.MeasureSpec.getMode(i1);
	//    0    0:iload_1         
	//    1    1:invokestatic    #371 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          6
		i1 = android.view.View.MeasureSpec.getSize(i1);
	//    3    6:iload_1         
	//    4    7:invokestatic    #374 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_1        
		int k1 = android.view.View.MeasureSpec.getMode(j1);
	//    6   11:iload_2         
	//    7   12:invokestatic    #371 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore_3        
		j1 = android.view.View.MeasureSpec.getSize(j1);
	//    9   16:iload_2         
	//   10   17:invokestatic    #374 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   20:istore_2        
		int l1 = getPaddingTop();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #100 <Method int getPaddingTop()>
	//   14   25:istore          4
		int i2 = getPaddingBottom();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #103 <Method int getPaddingBottom()>
	//   17   31:istore          5
		int k2 = getPaddingLeft();
	//   18   33:aload_0         
	//   19   34:invokevirtual   #106 <Method int getPaddingLeft()>
	//   20   37:istore          7
		int l2 = getPaddingRight();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #109 <Method int getPaddingRight()>
	//   23   43:istore          8
		l l3 = l.a;
	//   24   45:getstatic       #376 <Field l l.a>
	//   25   48:astore          9
		l l4 = l.a;
	//   26   50:getstatic       #376 <Field l l.a>
	//   27   53:astore          10
		getLayoutParams();
	//   28   55:aload_0         
	//   29   56:invokevirtual   #377 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   30   59:pop             
		if(j2 != 0x80000000)
	//*  31   60:iload           6
	//*  32   62:ldc2            #378 <Int 0x80000000>
	//*  33   65:icmpeq          114
		{
			if(j2 != 0)
	//*  34   68:iload           6
	//*  35   70:ifeq            104
			{
				if(j2 != 0x40000000)
	//*  36   73:iload           6
	//*  37   75:ldc2            #379 <Int 0x40000000>
	//*  38   78:icmpeq          86
					i1 = 0;
	//   39   81:iconst_0        
	//   40   82:istore_1        
				else
	//*  41   83:goto            119
					i1 = Math.min(k, i1) - (k2 + l2);
	//   42   86:aload_0         
	//   43   87:getfield        #64  <Field int k>
	//   44   90:iload_1         
	//   45   91:invokestatic    #384 <Method int Math.min(int, int)>
	//   46   94:iload           7
	//   47   96:iload           8
	//   48   98:iadd            
	//   49   99:isub            
	//   50  100:istore_1        
			} else
	//*  51  101:goto            119
			{
				l3 = l.b;
	//   52  104:getstatic       #267 <Field l l.b>
	//   53  107:astore          9
				i1 = 0;
	//   54  109:iconst_0        
	//   55  110:istore_1        
			}
		} else
	//*  56  111:goto            119
		{
			l3 = l.b;
	//   57  114:getstatic       #267 <Field l l.b>
	//   58  117:astore          9
		}
		if(k1 != 0x80000000)
	//*  59  119:iload_3         
	//*  60  120:ldc2            #378 <Int 0x80000000>
	//*  61  123:icmpeq          170
		{
			if(k1 != 0)
	//*  62  126:iload_3         
	//*  63  127:ifeq            160
			{
				if(k1 != 0x40000000)
	//*  64  130:iload_3         
	//*  65  131:ldc2            #379 <Int 0x40000000>
	//*  66  134:icmpeq          142
					j1 = 0;
	//   67  137:iconst_0        
	//   68  138:istore_2        
				else
	//*  69  139:goto            175
					j1 = Math.min(l, j1) - (l1 + i2);
	//   70  142:aload_0         
	//   71  143:getfield        #66  <Field int l>
	//   72  146:iload_2         
	//   73  147:invokestatic    #384 <Method int Math.min(int, int)>
	//   74  150:iload           4
	//   75  152:iload           5
	//   76  154:iadd            
	//   77  155:isub            
	//   78  156:istore_2        
			} else
	//*  79  157:goto            175
			{
				l4 = l.b;
	//   80  160:getstatic       #267 <Field l l.b>
	//   81  163:astore          10
				j1 = 0;
	//   82  165:iconst_0        
	//   83  166:istore_2        
			}
		} else
	//*  84  167:goto            175
		{
			l4 = l.b;
	//   85  170:getstatic       #267 <Field l l.b>
	//   86  173:astore          10
		}
		b.l(0);
	//   87  175:aload_0         
	//   88  176:getfield        #57  <Field m b>
	//   89  179:iconst_0        
	//   90  180:invokevirtual   #386 <Method void m.l(int)>
		b.m(0);
	//   91  183:aload_0         
	//   92  184:getfield        #57  <Field m b>
	//   93  187:iconst_0        
	//   94  188:invokevirtual   #388 <Method void m.m(int)>
		b.a(l3);
	//   95  191:aload_0         
	//   96  192:getfield        #57  <Field m b>
	//   97  195:aload           9
	//   98  197:invokevirtual   #391 <Method void m.a(l)>
		b.j(i1);
	//   99  200:aload_0         
	//  100  201:getfield        #57  <Field m b>
	//  101  204:iload_1         
	//  102  205:invokevirtual   #392 <Method void m.j(int)>
		b.b(l4);
	//  103  208:aload_0         
	//  104  209:getfield        #57  <Field m b>
	//  105  212:aload           10
	//  106  214:invokevirtual   #394 <Method void m.b(l)>
		b.k(j1);
	//  107  217:aload_0         
	//  108  218:getfield        #57  <Field m b>
	//  109  221:iload_2         
	//  110  222:invokevirtual   #395 <Method void m.k(int)>
		b.l(i - getPaddingLeft() - getPaddingRight());
	//  111  225:aload_0         
	//  112  226:getfield        #57  <Field m b>
	//  113  229:aload_0         
	//  114  230:getfield        #59  <Field int i>
	//  115  233:aload_0         
	//  116  234:invokevirtual   #106 <Method int getPaddingLeft()>
	//  117  237:isub            
	//  118  238:aload_0         
	//  119  239:invokevirtual   #109 <Method int getPaddingRight()>
	//  120  242:isub            
	//  121  243:invokevirtual   #386 <Method void m.l(int)>
		b.m(j - getPaddingTop() - getPaddingBottom());
	//  122  246:aload_0         
	//  123  247:getfield        #57  <Field m b>
	//  124  250:aload_0         
	//  125  251:getfield        #61  <Field int j>
	//  126  254:aload_0         
	//  127  255:invokevirtual   #100 <Method int getPaddingTop()>
	//  128  258:isub            
	//  129  259:aload_0         
	//  130  260:invokevirtual   #103 <Method int getPaddingBottom()>
	//  131  263:isub            
	//  132  264:invokevirtual   #388 <Method void m.m(int)>
	//  133  267:return          
	}

	private void d()
	{
		int k1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int getChildCount()>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		for(int i1 = 0; i1 < k1; i1++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_3         
	//*   9   11:icmpge          45
		{
			View view = getChildAt(i1);
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:invokevirtual   #116 <Method View getChildAt(int)>
	//   13   19:astore          4
			if(view instanceof k)
	//*  14   21:aload           4
	//*  15   23:instanceof      #397 <Class k>
	//*  16   26:ifeq            38
				((k)view).b(this);
	//   17   29:aload           4
	//   18   31:checkcast       #397 <Class k>
	//   19   34:aload_0         
	//   20   35:invokevirtual   #400 <Method void k.b(ConstraintLayout)>
		}

	//   21   38:iload_1         
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:istore_1        
	//*  25   42:goto            9
		k1 = g.size();
	//   26   45:aload_0         
	//   27   46:getfield        #50  <Field ArrayList g>
	//   28   49:invokevirtual   #403 <Method int ArrayList.size()>
	//   29   52:istore_3        
		if(k1 > 0)
	//*  30   53:iload_3         
	//*  31   54:ifle            86
		{
			for(int j1 = ((int) (flag)); j1 < k1; j1++)
	//*  32   57:iload_2         
	//*  33   58:istore_1        
	//*  34   59:iload_1         
	//*  35   60:iload_3         
	//*  36   61:icmpge          86
				((b)g.get(j1)).c(this);
	//   37   64:aload_0         
	//   38   65:getfield        #50  <Field ArrayList g>
	//   39   68:iload_1         
	//   40   69:invokevirtual   #404 <Method Object ArrayList.get(int)>
	//   41   72:checkcast       #406 <Class b>
	//   42   75:aload_0         
	//   43   76:invokevirtual   #408 <Method void b.c(ConstraintLayout)>

	//   44   79:iload_1         
	//   45   80:iconst_1        
	//   46   81:iadd            
	//   47   82:istore_1        
		}
	//*  48   83:goto            59
	//   49   86:return          
	}

	public final j a(View view)
	{
		if(view == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       10
			return ((j) (b));
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field m b>
	//    5    9:areturn         
		if(view == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		else
			return ((c)view.getLayoutParams()).al;
	//   10   16:aload_1         
	//   11   17:invokevirtual   #125 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   20:checkcast       #127 <Class c>
	//   13   23:getfield        #131 <Field j c.al>
	//   14   26:areturn         
	}

	protected c a()
	{
		return new c(-2, -2);
	//    0    0:new             #127 <Class c>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #412 <Method void c(int, int)>
	//    5   11:areturn         
	}

	public c a(AttributeSet attributeset)
	{
		return new c(getContext(), attributeset);
	//    0    0:new             #127 <Class c>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #298 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #414 <Method void c(Context, AttributeSet)>
	//    6   12:areturn         
	}

	public View a(int i1)
	{
		return (View)a.get(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field SparseArray a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #202 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #118 <Class View>
	//    5   11:areturn         
	}

	public Object a(int i1, Object obj)
	{
		if(i1 == 0 && (obj instanceof String))
	//*   0    0:iload_1         
	//*   1    1:ifne            42
	//*   2    4:aload_2         
	//*   3    5:instanceof      #417 <Class String>
	//*   4    8:ifeq            42
		{
			obj = ((Object) ((String)obj));
	//    5   11:aload_2         
	//    6   12:checkcast       #417 <Class String>
	//    7   15:astore_2        
			HashMap hashmap = q;
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field HashMap q>
	//   10   20:astore_3        
			if(hashmap != null && hashmap.containsKey(obj))
	//*  11   21:aload_3         
	//*  12   22:ifnull          42
	//*  13   25:aload_3         
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #421 <Method boolean HashMap.containsKey(Object)>
	//*  16   30:ifeq            42
				return q.get(obj);
	//   17   33:aload_0         
	//   18   34:getfield        #79  <Field HashMap q>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #424 <Method Object HashMap.get(Object)>
	//   21   41:areturn         
		}
		return ((Object) (null));
	//   22   42:aconst_null     
	//   23   43:areturn         
	}

	public void a(int i1, Object obj, Object obj1)
	{
		if(i1 == 0 && (obj instanceof String) && (obj1 instanceof Integer))
	//*   0    0:iload_1         
	//*   1    1:ifne            89
	//*   2    4:aload_2         
	//*   3    5:instanceof      #417 <Class String>
	//*   4    8:ifeq            89
	//*   5   11:aload_3         
	//*   6   12:instanceof      #427 <Class Integer>
	//*   7   15:ifeq            89
		{
			if(q == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #79  <Field HashMap q>
	//*  10   22:ifnonnull       36
				q = new HashMap();
	//   11   25:aload_0         
	//   12   26:new             #76  <Class HashMap>
	//   13   29:dup             
	//   14   30:invokespecial   #77  <Method void HashMap()>
	//   15   33:putfield        #79  <Field HashMap q>
			String s1 = (String)obj;
	//   16   36:aload_2         
	//   17   37:checkcast       #417 <Class String>
	//   18   40:astore          4
			i1 = s1.indexOf("/");
	//   19   42:aload           4
	//   20   44:ldc2            #429 <String "/">
	//   21   47:invokevirtual   #433 <Method int String.indexOf(String)>
	//   22   50:istore_1        
			obj = ((Object) (s1));
	//   23   51:aload           4
	//   24   53:astore_2        
			if(i1 != -1)
	//*  25   54:iload_1         
	//*  26   55:iconst_m1       
	//*  27   56:icmpeq          68
				obj = ((Object) (s1.substring(i1 + 1)));
	//   28   59:aload           4
	//   29   61:iload_1         
	//   30   62:iconst_1        
	//   31   63:iadd            
	//   32   64:invokevirtual   #437 <Method String String.substring(int)>
	//   33   67:astore_2        
			i1 = ((Integer)obj1).intValue();
	//   34   68:aload_3         
	//   35   69:checkcast       #427 <Class Integer>
	//   36   72:invokevirtual   #440 <Method int Integer.intValue()>
	//   37   75:istore_1        
			q.put(obj, ((Object) (Integer.valueOf(i1))));
	//   38   76:aload_0         
	//   39   77:getfield        #79  <Field HashMap q>
	//   40   80:aload_2         
	//   41   81:iload_1         
	//   42   82:invokestatic    #444 <Method Integer Integer.valueOf(int)>
	//   43   85:invokevirtual   #447 <Method Object HashMap.put(Object, Object)>
	//   44   88:pop             
		}
	//   45   89:return          
	}

	protected void a(String s1)
	{
		b.N();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field m b>
	//    2    4:invokevirtual   #450 <Method void m.N()>
		s1 = ((String) (t));
	//    3    7:aload_0         
	//    4    8:getfield        #166 <Field g t>
	//    5   11:astore_1        
		if(s1 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          26
			s1.c = ((g) (s1)).c + 1L;
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #452 <Field long g.c>
	//   11   21:lconst_1        
	//   12   22:ladd            
	//   13   23:putfield        #452 <Field long g.c>
	//   14   26:return          
	}

	public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i1, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #456 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
		if(android.os.Build.VERSION.SDK_INT < 14)
	//*   5    7:getstatic       #461 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   10:bipush          14
	//*   7   12:icmpge          20
			onViewAdded(view);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #213 <Method void onViewAdded(View)>
	//   11   20:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof c;
	//    0    0:aload_1         
	//    1    1:instanceof      #127 <Class c>
	//    2    4:ireturn         
	}

	public void dispatchDraw(Canvas canvas)
	{
		super.dispatchDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #467 <Method void ViewGroup.dispatchDraw(Canvas)>
		if(isInEditMode())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #470 <Method boolean isInEditMode()>
	//*   5    9:ifeq            330
		{
			int j1 = getChildCount();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #112 <Method int getChildCount()>
	//    8   16:istore          9
			float f1 = getWidth();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #473 <Method int getWidth()>
	//   11   22:i2f             
	//   12   23:fstore_2        
			float f2 = getHeight();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #476 <Method int getHeight()>
	//   15   28:i2f             
	//   16   29:fstore_3        
			for(int i1 = 0; i1 < j1; i1++)
	//*  17   30:iconst_0        
	//*  18   31:istore          8
	//*  19   33:iload           8
	//*  20   35:iload           9
	//*  21   37:icmpge          329
			{
				Object obj = ((Object) (getChildAt(i1)));
	//   22   40:aload_0         
	//   23   41:iload           8
	//   24   43:invokevirtual   #116 <Method View getChildAt(int)>
	//   25   46:astore          14
				if(((View) (obj)).getVisibility() == 8)
	//*  26   48:aload           14
	//*  27   50:invokevirtual   #121 <Method int View.getVisibility()>
	//*  28   53:bipush          8
	//*  29   55:icmpne          61
					continue;
	//   30   58:goto            320
				obj = ((View) (obj)).getTag();
	//   31   61:aload           14
	//   32   63:invokevirtual   #480 <Method Object View.getTag()>
	//   33   66:astore          14
				if(obj == null || !(obj instanceof String))
					continue;
	//   34   68:aload           14
	//   35   70:ifnull          320
	//   36   73:aload           14
	//   37   75:instanceof      #417 <Class String>
	//   38   78:ifeq            320
				String as[] = ((String)obj).split(",");
	//   39   81:aload           14
	//   40   83:checkcast       #417 <Class String>
	//   41   86:ldc2            #482 <String ",">
	//   42   89:invokevirtual   #486 <Method String[] String.split(String)>
	//   43   92:astore          14
				if(as.length == 4)
	//*  44   94:aload           14
	//*  45   96:arraylength     
	//*  46   97:iconst_4        
	//*  47   98:icmpne          320
				{
					int l1 = Integer.parseInt(as[0]);
	//   48  101:aload           14
	//   49  103:iconst_0        
	//   50  104:aaload          
	//   51  105:invokestatic    #489 <Method int Integer.parseInt(String)>
	//   52  108:istore          11
					int j2 = Integer.parseInt(as[1]);
	//   53  110:aload           14
	//   54  112:iconst_1        
	//   55  113:aaload          
	//   56  114:invokestatic    #489 <Method int Integer.parseInt(String)>
	//   57  117:istore          13
					int i2 = Integer.parseInt(as[2]);
	//   58  119:aload           14
	//   59  121:iconst_2        
	//   60  122:aaload          
	//   61  123:invokestatic    #489 <Method int Integer.parseInt(String)>
	//   62  126:istore          12
					int k1 = Integer.parseInt(as[3]);
	//   63  128:aload           14
	//   64  130:iconst_3        
	//   65  131:aaload          
	//   66  132:invokestatic    #489 <Method int Integer.parseInt(String)>
	//   67  135:istore          10
					l1 = (int)(((float)l1 / 1080F) * f1);
	//   68  137:iload           11
	//   69  139:i2f             
	//   70  140:ldc2            #490 <Float 1080F>
	//   71  143:fdiv            
	//   72  144:fload_2         
	//   73  145:fmul            
	//   74  146:f2i             
	//   75  147:istore          11
					j2 = (int)(((float)j2 / 1920F) * f2);
	//   76  149:iload           13
	//   77  151:i2f             
	//   78  152:ldc2            #491 <Float 1920F>
	//   79  155:fdiv            
	//   80  156:fload_3         
	//   81  157:fmul            
	//   82  158:f2i             
	//   83  159:istore          13
					i2 = (int)(((float)i2 / 1080F) * f1);
	//   84  161:iload           12
	//   85  163:i2f             
	//   86  164:ldc2            #490 <Float 1080F>
	//   87  167:fdiv            
	//   88  168:fload_2         
	//   89  169:fmul            
	//   90  170:f2i             
	//   91  171:istore          12
					k1 = (int)(((float)k1 / 1920F) * f2);
	//   92  173:iload           10
	//   93  175:i2f             
	//   94  176:ldc2            #491 <Float 1920F>
	//   95  179:fdiv            
	//   96  180:fload_3         
	//   97  181:fmul            
	//   98  182:f2i             
	//   99  183:istore          10
					Paint paint = new Paint();
	//  100  185:new             #493 <Class Paint>
	//  101  188:dup             
	//  102  189:invokespecial   #494 <Method void Paint()>
	//  103  192:astore          14
					paint.setColor(0xffff0000);
	//  104  194:aload           14
	//  105  196:ldc2            #495 <Int 0xffff0000>
	//  106  199:invokevirtual   #498 <Method void Paint.setColor(int)>
					float f3 = l1;
	//  107  202:iload           11
	//  108  204:i2f             
	//  109  205:fstore          4
					float f4 = j2;
	//  110  207:iload           13
	//  111  209:i2f             
	//  112  210:fstore          5
					float f5 = l1 + i2;
	//  113  212:iload           11
	//  114  214:iload           12
	//  115  216:iadd            
	//  116  217:i2f             
	//  117  218:fstore          6
					canvas.drawLine(f3, f4, f5, f4, paint);
	//  118  220:aload_1         
	//  119  221:fload           4
	//  120  223:fload           5
	//  121  225:fload           6
	//  122  227:fload           5
	//  123  229:aload           14
	//  124  231:invokevirtual   #504 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					float f6 = j2 + k1;
	//  125  234:iload           13
	//  126  236:iload           10
	//  127  238:iadd            
	//  128  239:i2f             
	//  129  240:fstore          7
					canvas.drawLine(f5, f4, f5, f6, paint);
	//  130  242:aload_1         
	//  131  243:fload           6
	//  132  245:fload           5
	//  133  247:fload           6
	//  134  249:fload           7
	//  135  251:aload           14
	//  136  253:invokevirtual   #504 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					canvas.drawLine(f5, f6, f3, f6, paint);
	//  137  256:aload_1         
	//  138  257:fload           6
	//  139  259:fload           7
	//  140  261:fload           4
	//  141  263:fload           7
	//  142  265:aload           14
	//  143  267:invokevirtual   #504 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					canvas.drawLine(f3, f6, f3, f4, paint);
	//  144  270:aload_1         
	//  145  271:fload           4
	//  146  273:fload           7
	//  147  275:fload           4
	//  148  277:fload           5
	//  149  279:aload           14
	//  150  281:invokevirtual   #504 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					paint.setColor(0xff00ff00);
	//  151  284:aload           14
	//  152  286:ldc2            #505 <Int 0xff00ff00>
	//  153  289:invokevirtual   #498 <Method void Paint.setColor(int)>
					canvas.drawLine(f3, f4, f5, f6, paint);
	//  154  292:aload_1         
	//  155  293:fload           4
	//  156  295:fload           5
	//  157  297:fload           6
	//  158  299:fload           7
	//  159  301:aload           14
	//  160  303:invokevirtual   #504 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					canvas.drawLine(f3, f6, f5, f4, paint);
	//  161  306:aload_1         
	//  162  307:fload           4
	//  163  309:fload           7
	//  164  311:fload           6
	//  165  313:fload           5
	//  166  315:aload           14
	//  167  317:invokevirtual   #504 <Method void Canvas.drawLine(float, float, float, float, Paint)>
				}
			}

	//  168  320:iload           8
	//  169  322:iconst_1        
	//  170  323:iadd            
	//  171  324:istore          8
	//* 172  326:goto            33
			return;
	//  173  329:return          
		} else
		{
			return;
	//  174  330:return          
		}
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (a()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #508 <Method c a()>
	//    2    4:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (a(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #512 <Method c a(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (new c(layoutparams)));
	//    0    0:new             #127 <Class c>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #516 <Method void c(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public int getMaxHeight()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field int l>
	//    2    4:ireturn         
	}

	public int getMaxWidth()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int k>
	//    2    4:ireturn         
	}

	public int getMinHeight()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int j>
	//    2    4:ireturn         
	}

	public int getMinWidth()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field int i>
	//    2    4:ireturn         
	}

	public int getOptimizationLevel()
	{
		return b.J();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field m b>
	//    2    4:invokevirtual   #523 <Method int m.J()>
	//    3    7:ireturn         
	}

	protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
	{
		k1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #112 <Method int getChildCount()>
	//    2    4:istore          4
		flag = isInEditMode();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #470 <Method boolean isInEditMode()>
	//    5   10:istore_1        
		j1 = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		for(i1 = 0; i1 < k1; i1++)
	//*   8   13:iconst_0        
	//*   9   14:istore_2        
	//*  10   15:iload_2         
	//*  11   16:iload           4
	//*  12   18:icmpge          185
		{
			View view = getChildAt(i1);
	//   13   21:aload_0         
	//   14   22:iload_2         
	//   15   23:invokevirtual   #116 <Method View getChildAt(int)>
	//   16   26:astore          9
			c c1 = (c)view.getLayoutParams();
	//   17   28:aload           9
	//   18   30:invokevirtual   #125 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   33:checkcast       #127 <Class c>
	//   20   36:astore          10
			j j3 = c1.al;
	//   21   38:aload           10
	//   22   40:getfield        #131 <Field j c.al>
	//   23   43:astore          11
			if(view.getVisibility() == 8 && !c1.Y && !c1.Z && !flag || c1.aa)
	//*  24   45:aload           9
	//*  25   47:invokevirtual   #121 <Method int View.getVisibility()>
	//*  26   50:bipush          8
	//*  27   52:icmpne          78
	//*  28   55:aload           10
	//*  29   57:getfield        #134 <Field boolean c.Y>
	//*  30   60:ifne            78
	//*  31   63:aload           10
	//*  32   65:getfield        #136 <Field boolean c.Z>
	//*  33   68:ifne            78
	//*  34   71:iload_1         
	//*  35   72:ifne            78
	//*  36   75:goto            178
	//*  37   78:aload           10
	//*  38   80:getfield        #528 <Field boolean c.aa>
	//*  39   83:ifeq            89
				continue;
	//   40   86:goto            178
			l1 = j3.t();
	//   41   89:aload           11
	//   42   91:invokevirtual   #530 <Method int j.t()>
	//   43   94:istore          5
			int i2 = j3.u();
	//   44   96:aload           11
	//   45   98:invokevirtual   #533 <Method int j.u()>
	//   46  101:istore          6
			int j2 = j3.p() + l1;
	//   47  103:aload           11
	//   48  105:invokevirtual   #535 <Method int j.p()>
	//   49  108:iload           5
	//   50  110:iadd            
	//   51  111:istore          7
			int k2 = j3.r() + i2;
	//   52  113:aload           11
	//   53  115:invokevirtual   #537 <Method int j.r()>
	//   54  118:iload           6
	//   55  120:iadd            
	//   56  121:istore          8
			view.layout(l1, i2, j2, k2);
	//   57  123:aload           9
	//   58  125:iload           5
	//   59  127:iload           6
	//   60  129:iload           7
	//   61  131:iload           8
	//   62  133:invokevirtual   #541 <Method void View.layout(int, int, int, int)>
			if(!(view instanceof k))
				continue;
	//   63  136:aload           9
	//   64  138:instanceof      #397 <Class k>
	//   65  141:ifeq            178
			view = ((k)view).getContent();
	//   66  144:aload           9
	//   67  146:checkcast       #397 <Class k>
	//   68  149:invokevirtual   #545 <Method View k.getContent()>
	//   69  152:astore          9
			if(view != null)
	//*  70  154:aload           9
	//*  71  156:ifnull          178
			{
				view.setVisibility(0);
	//   72  159:aload           9
	//   73  161:iconst_0        
	//   74  162:invokevirtual   #548 <Method void View.setVisibility(int)>
				view.layout(l1, i2, j2, k2);
	//   75  165:aload           9
	//   76  167:iload           5
	//   77  169:iload           6
	//   78  171:iload           7
	//   79  173:iload           8
	//   80  175:invokevirtual   #541 <Method void View.layout(int, int, int, int)>
			}
		}

	//   81  178:iload_2         
	//   82  179:iconst_1        
	//   83  180:iadd            
	//   84  181:istore_2        
	//*  85  182:goto            15
		k1 = g.size();
	//   86  185:aload_0         
	//   87  186:getfield        #50  <Field ArrayList g>
	//   88  189:invokevirtual   #403 <Method int ArrayList.size()>
	//   89  192:istore          4
		if(k1 > 0)
	//*  90  194:iload           4
	//*  91  196:ifle            229
			for(i1 = j1; i1 < k1; i1++)
	//*  92  199:iload_3         
	//*  93  200:istore_2        
	//*  94  201:iload_2         
	//*  95  202:iload           4
	//*  96  204:icmpge          229
				((b)g.get(i1)).b(this);
	//   97  207:aload_0         
	//   98  208:getfield        #50  <Field ArrayList g>
	//   99  211:iload_2         
	//  100  212:invokevirtual   #404 <Method Object ArrayList.get(int)>
	//  101  215:checkcast       #406 <Class b>
	//  102  218:aload_0         
	//  103  219:invokevirtual   #549 <Method void b.b(ConstraintLayout)>

	//  104  222:iload_2         
	//  105  223:iconst_1        
	//  106  224:iadd            
	//  107  225:istore_2        
	//* 108  226:goto            201
	//  109  229:return          
	}

	protected void onMeasure(int i1, int j1)
	{
		System.currentTimeMillis();
	//    0    0:invokestatic    #556 <Method long System.currentTimeMillis()>
	//    1    3:pop2            
		int j2 = android.view.View.MeasureSpec.getMode(i1);
	//    2    4:iload_1         
	//    3    5:invokestatic    #371 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    4    8:istore          6
		int l2 = android.view.View.MeasureSpec.getSize(i1);
	//    5   10:iload_1         
	//    6   11:invokestatic    #374 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    7   14:istore          7
		int k3 = android.view.View.MeasureSpec.getMode(j1);
	//    8   16:iload_2         
	//    9   17:invokestatic    #371 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   20:istore          9
		int l3 = android.view.View.MeasureSpec.getSize(j1);
	//   11   22:iload_2         
	//   12   23:invokestatic    #374 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   13   26:istore          10
		int l1 = getPaddingLeft();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #106 <Method int getPaddingLeft()>
	//   16   32:istore          4
		int i2 = getPaddingTop();
	//   17   34:aload_0         
	//   18   35:invokevirtual   #100 <Method int getPaddingTop()>
	//   19   38:istore          5
		b.h(l1);
	//   20   40:aload_0         
	//   21   41:getfield        #57  <Field m b>
	//   22   44:iload           4
	//   23   46:invokevirtual   #558 <Method void m.h(int)>
		b.i(i2);
	//   24   49:aload_0         
	//   25   50:getfield        #57  <Field m b>
	//   26   53:iload           5
	//   27   55:invokevirtual   #560 <Method void m.i(int)>
		b.c(k);
	//   28   58:aload_0         
	//   29   59:getfield        #57  <Field m b>
	//   30   62:aload_0         
	//   31   63:getfield        #64  <Field int k>
	//   32   66:invokevirtual   #562 <Method void m.c(int)>
		b.d(l);
	//   33   69:aload_0         
	//   34   70:getfield        #57  <Field m b>
	//   35   73:aload_0         
	//   36   74:getfield        #66  <Field int l>
	//   37   77:invokevirtual   #564 <Method void m.d(int)>
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  38   80:getstatic       #461 <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   83:bipush          17
	//*  40   85:icmplt          118
		{
			m m1 = b;
	//   41   88:aload_0         
	//   42   89:getfield        #57  <Field m b>
	//   43   92:astore          21
			boolean flag4;
			if(getLayoutDirection() == 1)
	//*  44   94:aload_0         
	//*  45   95:invokevirtual   #567 <Method int getLayoutDirection()>
	//*  46   98:iconst_1        
	//*  47   99:icmpne          108
				flag4 = true;
	//   48  102:iconst_1        
	//   49  103:istore          20
			else
	//*  50  105:goto            111
				flag4 = false;
	//   51  108:iconst_0        
	//   52  109:istore          20
			m1.a(flag4);
	//   53  111:aload           21
	//   54  113:iload           20
	//   55  115:invokevirtual   #569 <Method void m.a(boolean)>
		}
		c(i1, j1);
	//   56  118:aload_0         
	//   57  119:iload_1         
	//   58  120:iload_2         
	//   59  121:invokespecial   #571 <Method void c(int, int)>
		int l4 = b.p();
	//   60  124:aload_0         
	//   61  125:getfield        #57  <Field m b>
	//   62  128:invokevirtual   #572 <Method int m.p()>
	//   63  131:istore          13
		int k4 = b.r();
	//   64  133:aload_0         
	//   65  134:getfield        #57  <Field m b>
	//   66  137:invokevirtual   #573 <Method int m.r()>
	//   67  140:istore          12
		int k1;
		if(m)
	//*  68  142:aload_0         
	//*  69  143:getfield        #68  <Field boolean m>
	//*  70  146:ifeq            163
		{
			m = false;
	//   71  149:aload_0         
	//   72  150:iconst_0        
	//   73  151:putfield        #68  <Field boolean m>
			b();
	//   74  154:aload_0         
	//   75  155:invokespecial   #575 <Method void b()>
			k1 = 1;
	//   76  158:iconst_1        
	//   77  159:istore_3        
		} else
	//*  78  160:goto            165
		{
			k1 = 0;
	//   79  163:iconst_0        
	//   80  164:istore_3        
		}
		boolean flag1;
		if((n & 8) == 8)
	//*  81  165:aload_0         
	//*  82  166:getfield        #70  <Field int n>
	//*  83  169:bipush          8
	//*  84  171:iand            
	//*  85  172:bipush          8
	//*  86  174:icmpne          183
			flag1 = true;
	//   87  177:iconst_1        
	//   88  178:istore          8
		else
	//*  89  180:goto            186
			flag1 = false;
	//   90  183:iconst_0        
	//   91  184:istore          8
		if(flag1)
	//*  92  186:iload           8
	//*  93  188:ifeq            218
		{
			b.O();
	//   94  191:aload_0         
	//   95  192:getfield        #57  <Field m b>
	//   96  195:invokevirtual   #578 <Method void m.O()>
			b.f(l4, k4);
	//   97  198:aload_0         
	//   98  199:getfield        #57  <Field m b>
	//   99  202:iload           13
	//  100  204:iload           12
	//  101  206:invokevirtual   #580 <Method void m.f(int, int)>
			b(i1, j1);
	//  102  209:aload_0         
	//  103  210:iload_1         
	//  104  211:iload_2         
	//  105  212:invokespecial   #582 <Method void b(int, int)>
		} else
	//* 106  215:goto            224
		{
			a(i1, j1);
	//  107  218:aload_0         
	//  108  219:iload_1         
	//  109  220:iload_2         
	//  110  221:invokespecial   #584 <Method void a(int, int)>
		}
		d();
	//  111  224:aload_0         
	//  112  225:invokespecial   #586 <Method void d()>
		if(getChildCount() > 0 && k1)
	//* 113  228:aload_0         
	//* 114  229:invokevirtual   #112 <Method int getChildCount()>
	//* 115  232:ifle            246
	//* 116  235:iload_3         
	//* 117  236:ifeq            246
			android.support.constraint.a.a.a.a(b);
	//  118  239:aload_0         
	//  119  240:getfield        #57  <Field m b>
	//  120  243:invokestatic    #591 <Method void a.a(m)>
		if(b.as)
	//* 121  246:aload_0         
	//* 122  247:getfield        #57  <Field m b>
	//* 123  250:getfield        #594 <Field boolean m.as>
	//* 124  253:ifeq            368
		{
			if(b.at && j2 == 0x80000000)
	//* 125  256:aload_0         
	//* 126  257:getfield        #57  <Field m b>
	//* 127  260:getfield        #597 <Field boolean m.at>
	//* 128  263:ifeq            312
	//* 129  266:iload           6
	//* 130  268:ldc2            #378 <Int 0x80000000>
	//* 131  271:icmpne          312
			{
				if(b.av < l2)
	//* 132  274:aload_0         
	//* 133  275:getfield        #57  <Field m b>
	//* 134  278:getfield        #600 <Field int m.av>
	//* 135  281:iload           7
	//* 136  283:icmpge          302
				{
					m m2 = b;
	//  137  286:aload_0         
	//  138  287:getfield        #57  <Field m b>
	//  139  290:astore          21
					m2.j(m2.av);
	//  140  292:aload           21
	//  141  294:aload           21
	//  142  296:getfield        #600 <Field int m.av>
	//  143  299:invokevirtual   #392 <Method void m.j(int)>
				}
				b.a(l.a);
	//  144  302:aload_0         
	//  145  303:getfield        #57  <Field m b>
	//  146  306:getstatic       #376 <Field l l.a>
	//  147  309:invokevirtual   #391 <Method void m.a(l)>
			}
			if(b.au && k3 == 0x80000000)
	//* 148  312:aload_0         
	//* 149  313:getfield        #57  <Field m b>
	//* 150  316:getfield        #603 <Field boolean m.au>
	//* 151  319:ifeq            368
	//* 152  322:iload           9
	//* 153  324:ldc2            #378 <Int 0x80000000>
	//* 154  327:icmpne          368
			{
				if(b.aw < l3)
	//* 155  330:aload_0         
	//* 156  331:getfield        #57  <Field m b>
	//* 157  334:getfield        #606 <Field int m.aw>
	//* 158  337:iload           10
	//* 159  339:icmpge          358
				{
					m m3 = b;
	//  160  342:aload_0         
	//  161  343:getfield        #57  <Field m b>
	//  162  346:astore          21
					m3.k(m3.aw);
	//  163  348:aload           21
	//  164  350:aload           21
	//  165  352:getfield        #606 <Field int m.aw>
	//  166  355:invokevirtual   #395 <Method void m.k(int)>
				}
				b.b(l.a);
	//  167  358:aload_0         
	//  168  359:getfield        #57  <Field m b>
	//  169  362:getstatic       #376 <Field l l.a>
	//  170  365:invokevirtual   #394 <Method void m.b(l)>
			}
		}
		if((n & 0x20) == 32)
	//* 171  368:aload_0         
	//* 172  369:getfield        #70  <Field int n>
	//* 173  372:bipush          32
	//* 174  374:iand            
	//* 175  375:bipush          32
	//* 176  377:icmpne          534
		{
			k1 = b.p();
	//  177  380:aload_0         
	//  178  381:getfield        #57  <Field m b>
	//  179  384:invokevirtual   #572 <Method int m.p()>
	//  180  387:istore_3        
			int i4 = b.r();
	//  181  388:aload_0         
	//  182  389:getfield        #57  <Field m b>
	//  183  392:invokevirtual   #573 <Method int m.r()>
	//  184  395:istore          11
			if(r != k1 && j2 == 0x40000000)
	//* 185  397:aload_0         
	//* 186  398:getfield        #81  <Field int r>
	//* 187  401:iload_3         
	//* 188  402:icmpeq          425
	//* 189  405:iload           6
	//* 190  407:ldc2            #379 <Int 0x40000000>
	//* 191  410:icmpne          425
				android.support.constraint.a.a.a.a(b.ar, 0, k1);
	//  192  413:aload_0         
	//  193  414:getfield        #57  <Field m b>
	//  194  417:getfield        #610 <Field java.util.List m.ar>
	//  195  420:iconst_0        
	//  196  421:iload_3         
	//  197  422:invokestatic    #613 <Method void a.a(java.util.List, int, int)>
			if(s != i4 && k3 == 0x40000000)
	//* 198  425:aload_0         
	//* 199  426:getfield        #83  <Field int s>
	//* 200  429:iload           11
	//* 201  431:icmpeq          455
	//* 202  434:iload           9
	//* 203  436:ldc2            #379 <Int 0x40000000>
	//* 204  439:icmpne          455
				android.support.constraint.a.a.a.a(b.ar, 1, i4);
	//  205  442:aload_0         
	//  206  443:getfield        #57  <Field m b>
	//  207  446:getfield        #610 <Field java.util.List m.ar>
	//  208  449:iconst_1        
	//  209  450:iload           11
	//  210  452:invokestatic    #613 <Method void a.a(java.util.List, int, int)>
			if(b.at && b.av > l2)
	//* 211  455:aload_0         
	//* 212  456:getfield        #57  <Field m b>
	//* 213  459:getfield        #597 <Field boolean m.at>
	//* 214  462:ifeq            493
	//* 215  465:aload_0         
	//* 216  466:getfield        #57  <Field m b>
	//* 217  469:getfield        #600 <Field int m.av>
	//* 218  472:iload           7
	//* 219  474:icmple          493
				android.support.constraint.a.a.a.a(b.ar, 0, l2);
	//  220  477:aload_0         
	//  221  478:getfield        #57  <Field m b>
	//  222  481:getfield        #610 <Field java.util.List m.ar>
	//  223  484:iconst_0        
	//  224  485:iload           7
	//  225  487:invokestatic    #613 <Method void a.a(java.util.List, int, int)>
	//* 226  490:goto            493
			if(b.au && b.aw > l3)
	//* 227  493:aload_0         
	//* 228  494:getfield        #57  <Field m b>
	//* 229  497:getfield        #603 <Field boolean m.au>
	//* 230  500:ifeq            531
	//* 231  503:aload_0         
	//* 232  504:getfield        #57  <Field m b>
	//* 233  507:getfield        #606 <Field int m.aw>
	//* 234  510:iload           10
	//* 235  512:icmple          531
				android.support.constraint.a.a.a.a(b.ar, 1, l3);
	//  236  515:aload_0         
	//  237  516:getfield        #57  <Field m b>
	//  238  519:getfield        #610 <Field java.util.List m.ar>
	//  239  522:iconst_1        
	//  240  523:iload           10
	//  241  525:invokestatic    #613 <Method void a.a(java.util.List, int, int)>
		}
	//* 242  528:goto            534
	//* 243  531:goto            534
		if(getChildCount() > 0)
	//* 244  534:aload_0         
	//* 245  535:invokevirtual   #112 <Method int getChildCount()>
	//* 246  538:ifle            548
			a("First pass");
	//  247  541:aload_0         
	//  248  542:ldc2            #615 <String "First pass">
	//  249  545:invokevirtual   #617 <Method void a(String)>
		int j4 = h.size();
	//  250  548:aload_0         
	//  251  549:getfield        #52  <Field ArrayList h>
	//  252  552:invokevirtual   #403 <Method int ArrayList.size()>
	//  253  555:istore          11
		int l5 = i2 + getPaddingBottom();
	//  254  557:iload           5
	//  255  559:aload_0         
	//  256  560:invokevirtual   #103 <Method int getPaddingBottom()>
	//  257  563:iadd            
	//  258  564:istore          16
		int i6 = l1 + getPaddingRight();
	//  259  566:iload           4
	//  260  568:aload_0         
	//  261  569:invokevirtual   #109 <Method int getPaddingRight()>
	//  262  572:iadd            
	//  263  573:istore          17
		if(j4 > 0)
	//* 264  575:iload           11
	//* 265  577:ifle            1468
		{
			boolean flag2;
			if(b.F() == l.b)
	//* 266  580:aload_0         
	//* 267  581:getfield        #57  <Field m b>
	//* 268  584:invokevirtual   #262 <Method l m.F()>
	//* 269  587:getstatic       #267 <Field l l.b>
	//* 270  590:if_acmpne       599
				flag2 = true;
	//  271  593:iconst_1        
	//  272  594:istore          9
			else
	//* 273  596:goto            602
				flag2 = false;
	//  274  599:iconst_0        
	//  275  600:istore          9
			boolean flag3;
			if(b.G() == l.b)
	//* 276  602:aload_0         
	//* 277  603:getfield        #57  <Field m b>
	//* 278  606:invokevirtual   #270 <Method l m.G()>
	//* 279  609:getstatic       #267 <Field l l.b>
	//* 280  612:if_acmpne       621
				flag3 = true;
	//  281  615:iconst_1        
	//  282  616:istore          10
			else
	//* 283  618:goto            624
				flag3 = false;
	//  284  621:iconst_0        
	//  285  622:istore          10
			i2 = Math.max(b.p(), i);
	//  286  624:aload_0         
	//  287  625:getfield        #57  <Field m b>
	//  288  628:invokevirtual   #572 <Method int m.p()>
	//  289  631:aload_0         
	//  290  632:getfield        #59  <Field int i>
	//  291  635:invokestatic    #620 <Method int Math.max(int, int)>
	//  292  638:istore          5
			l1 = Math.max(b.r(), j);
	//  293  640:aload_0         
	//  294  641:getfield        #57  <Field m b>
	//  295  644:invokevirtual   #573 <Method int m.r()>
	//  296  647:aload_0         
	//  297  648:getfield        #61  <Field int j>
	//  298  651:invokestatic    #620 <Method int Math.max(int, int)>
	//  299  654:istore          4
			int i5 = 0;
	//  300  656:iconst_0        
	//  301  657:istore          14
			int k2 = 0;
	//  302  659:iconst_0        
	//  303  660:istore          6
			k1 = 0;
	//  304  662:iconst_0        
	//  305  663:istore_3        
			for(; i5 < j4; i5++)
	//* 306  664:iload           14
	//* 307  666:iload           11
	//* 308  668:icmpge          1209
			{
				j j7 = (j)h.get(i5);
	//  309  671:aload_0         
	//  310  672:getfield        #52  <Field ArrayList h>
	//  311  675:iload           14
	//  312  677:invokevirtual   #404 <Method Object ArrayList.get(int)>
	//  313  680:checkcast       #138 <Class j>
	//  314  683:astore          21
				View view = (View)j7.B();
	//  315  685:aload           21
	//  316  687:invokevirtual   #623 <Method Object j.B()>
	//  317  690:checkcast       #118 <Class View>
	//  318  693:astore          22
				if(view == null)
	//* 319  695:aload           22
	//* 320  697:ifnonnull       703
					continue;
	//  321  700:goto            1200
				c c1 = (c)view.getLayoutParams();
	//  322  703:aload           22
	//  323  705:invokevirtual   #125 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  324  708:checkcast       #127 <Class c>
	//  325  711:astore          23
				if(c1.Z || c1.Y)
	//* 326  713:aload           23
	//* 327  715:getfield        #136 <Field boolean c.Z>
	//* 328  718:ifne            1200
	//* 329  721:aload           23
	//* 330  723:getfield        #134 <Field boolean c.Y>
	//* 331  726:ifeq            732
					continue;
	//  332  729:goto            1200
				int i3 = view.getVisibility();
	//  333  732:aload           22
	//  334  734:invokevirtual   #121 <Method int View.getVisibility()>
	//  335  737:istore          7
				int j5 = k2;
	//  336  739:iload           6
	//  337  741:istore          15
				if(i3 == 8 || flag1 && j7.i().g() && j7.j().g())
	//* 338  743:iload           7
	//* 339  745:bipush          8
	//* 340  747:icmpne          753
	//* 341  750:goto            1200
	//* 342  753:iload           8
	//* 343  755:ifeq            783
	//* 344  758:aload           21
	//* 345  760:invokevirtual   #225 <Method u j.i()>
	//* 346  763:invokevirtual   #624 <Method boolean u.g()>
	//* 347  766:ifeq            783
	//* 348  769:aload           21
	//* 349  771:invokevirtual   #231 <Method u j.j()>
	//* 350  774:invokevirtual   #624 <Method boolean u.g()>
	//* 351  777:ifeq            783
					continue;
	//  352  780:goto            1200
				if(c1.width == -2 && c1.V)
	//* 353  783:aload           23
	//* 354  785:getfield        #143 <Field int c.width>
	//* 355  788:bipush          -2
	//* 356  790:icmpne          817
	//* 357  793:aload           23
	//* 358  795:getfield        #149 <Field boolean c.V>
	//* 359  798:ifeq            817
					k2 = getChildMeasureSpec(i1, i6, c1.width);
	//  360  801:iload_1         
	//  361  802:iload           17
	//  362  804:aload           23
	//  363  806:getfield        #143 <Field int c.width>
	//  364  809:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  365  812:istore          6
				else
	//* 366  814:goto            830
					k2 = android.view.View.MeasureSpec.makeMeasureSpec(j7.p(), 0x40000000);
	//  367  817:aload           21
	//  368  819:invokevirtual   #535 <Method int j.p()>
	//  369  822:ldc2            #379 <Int 0x40000000>
	//  370  825:invokestatic    #627 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  371  828:istore          6
				if(c1.height == -2 && c1.W)
	//* 372  830:aload           23
	//* 373  832:getfield        #146 <Field int c.height>
	//* 374  835:bipush          -2
	//* 375  837:icmpne          864
	//* 376  840:aload           23
	//* 377  842:getfield        #152 <Field boolean c.W>
	//* 378  845:ifeq            864
					i3 = getChildMeasureSpec(j1, l5, c1.height);
	//  379  848:iload_2         
	//  380  849:iload           16
	//  381  851:aload           23
	//  382  853:getfield        #146 <Field int c.height>
	//  383  856:invokestatic    #161 <Method int getChildMeasureSpec(int, int, int)>
	//  384  859:istore          7
				else
	//* 385  861:goto            877
					i3 = android.view.View.MeasureSpec.makeMeasureSpec(j7.r(), 0x40000000);
	//  386  864:aload           21
	//  387  866:invokevirtual   #537 <Method int j.r()>
	//  388  869:ldc2            #379 <Int 0x40000000>
	//  389  872:invokestatic    #627 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  390  875:istore          7
				view.measure(k2, i3);
	//  391  877:aload           22
	//  392  879:iload           6
	//  393  881:iload           7
	//  394  883:invokevirtual   #164 <Method void View.measure(int, int)>
				g g1 = t;
	//  395  886:aload_0         
	//  396  887:getfield        #166 <Field g t>
	//  397  890:astore          24
				if(g1 != null)
	//* 398  892:aload           24
	//* 399  894:ifnull          909
					g1.b = g1.b + 1L;
	//  400  897:aload           24
	//  401  899:aload           24
	//  402  901:getfield        #629 <Field long g.b>
	//  403  904:lconst_1        
	//  404  905:ladd            
	//  405  906:putfield        #629 <Field long g.b>
				int k6 = view.getMeasuredWidth();
	//  406  909:aload           22
	//  407  911:invokevirtual   #178 <Method int View.getMeasuredWidth()>
	//  408  914:istore          19
				int j6 = view.getMeasuredHeight();
	//  409  916:aload           22
	//  410  918:invokevirtual   #181 <Method int View.getMeasuredHeight()>
	//  411  921:istore          18
				i3 = i2;
	//  412  923:iload           5
	//  413  925:istore          7
				k2 = j5;
	//  414  927:iload           15
	//  415  929:istore          6
				if(k6 != j7.p())
	//* 416  931:iload           19
	//* 417  933:aload           21
	//* 418  935:invokevirtual   #535 <Method int j.p()>
	//* 419  938:icmpeq          1013
				{
					j7.j(k6);
	//  420  941:aload           21
	//  421  943:iload           19
	//  422  945:invokevirtual   #183 <Method void j.j(int)>
					if(flag1)
	//* 423  948:iload           8
	//* 424  950:ifeq            963
						j7.i().a(k6);
	//  425  953:aload           21
	//  426  955:invokevirtual   #225 <Method u j.i()>
	//  427  958:iload           19
	//  428  960:invokevirtual   #229 <Method void u.a(int)>
					i3 = i2;
	//  429  963:iload           5
	//  430  965:istore          7
					if(flag2)
	//* 431  967:iload           9
	//* 432  969:ifeq            1010
					{
						i3 = i2;
	//  433  972:iload           5
	//  434  974:istore          7
						if(j7.x() > i2)
	//* 435  976:aload           21
	//* 436  978:invokevirtual   #632 <Method int j.x()>
	//* 437  981:iload           5
	//* 438  983:icmple          1010
							i3 = Math.max(i2, j7.x() + j7.a(i.d).e());
	//  439  986:iload           5
	//  440  988:aload           21
	//  441  990:invokevirtual   #632 <Method int j.x()>
	//  442  993:aload           21
	//  443  995:getstatic       #251 <Field i i.d>
	//  444  998:invokevirtual   #244 <Method e j.a(i)>
	//  445 1001:invokevirtual   #634 <Method int e.e()>
	//  446 1004:iadd            
	//  447 1005:invokestatic    #620 <Method int Math.max(int, int)>
	//  448 1008:istore          7
					}
					k2 = 1;
	//  449 1010:iconst_1        
	//  450 1011:istore          6
				}
				i2 = l1;
	//  451 1013:iload           4
	//  452 1015:istore          5
				if(j6 != j7.r())
	//* 453 1017:iload           18
	//* 454 1019:aload           21
	//* 455 1021:invokevirtual   #537 <Method int j.r()>
	//* 456 1024:icmpeq          1099
				{
					j7.k(j6);
	//  457 1027:aload           21
	//  458 1029:iload           18
	//  459 1031:invokevirtual   #185 <Method void j.k(int)>
					if(flag1)
	//* 460 1034:iload           8
	//* 461 1036:ifeq            1049
						j7.j().a(j6);
	//  462 1039:aload           21
	//  463 1041:invokevirtual   #231 <Method u j.j()>
	//  464 1044:iload           18
	//  465 1046:invokevirtual   #229 <Method void u.a(int)>
					i2 = l1;
	//  466 1049:iload           4
	//  467 1051:istore          5
					if(flag3)
	//* 468 1053:iload           10
	//* 469 1055:ifeq            1096
					{
						i2 = l1;
	//  470 1058:iload           4
	//  471 1060:istore          5
						if(j7.y() > l1)
	//* 472 1062:aload           21
	//* 473 1064:invokevirtual   #637 <Method int j.y()>
	//* 474 1067:iload           4
	//* 475 1069:icmple          1096
							i2 = Math.max(l1, j7.y() + j7.a(i.e).e());
	//  476 1072:iload           4
	//  477 1074:aload           21
	//  478 1076:invokevirtual   #637 <Method int j.y()>
	//  479 1079:aload           21
	//  480 1081:getstatic       #258 <Field i i.e>
	//  481 1084:invokevirtual   #244 <Method e j.a(i)>
	//  482 1087:invokevirtual   #634 <Method int e.e()>
	//  483 1090:iadd            
	//  484 1091:invokestatic    #620 <Method int Math.max(int, int)>
	//  485 1094:istore          5
					}
					k2 = 1;
	//  486 1096:iconst_1        
	//  487 1097:istore          6
				}
				l1 = k2;
	//  488 1099:iload           6
	//  489 1101:istore          4
				if(c1.X)
	//* 490 1103:aload           23
	//* 491 1105:getfield        #192 <Field boolean c.X>
	//* 492 1108:ifeq            1152
				{
					int k5 = view.getBaseline();
	//  493 1111:aload           22
	//  494 1113:invokevirtual   #195 <Method int View.getBaseline()>
	//  495 1116:istore          15
					l1 = k2;
	//  496 1118:iload           6
	//  497 1120:istore          4
					if(k5 != -1)
	//* 498 1122:iload           15
	//* 499 1124:iconst_m1       
	//* 500 1125:icmpeq          1152
					{
						l1 = k2;
	//  501 1128:iload           6
	//  502 1130:istore          4
						if(k5 != j7.A())
	//* 503 1132:iload           15
	//* 504 1134:aload           21
	//* 505 1136:invokevirtual   #640 <Method int j.A()>
	//* 506 1139:icmpeq          1152
						{
							j7.q(k5);
	//  507 1142:aload           21
	//  508 1144:iload           15
	//  509 1146:invokevirtual   #197 <Method void j.q(int)>
							l1 = 1;
	//  510 1149:iconst_1        
	//  511 1150:istore          4
						}
					}
				}
				if(android.os.Build.VERSION.SDK_INT >= 11)
	//* 512 1152:getstatic       #461 <Field int android.os.Build$VERSION.SDK_INT>
	//* 513 1155:bipush          11
	//* 514 1157:icmplt          1185
				{
					k1 = combineMeasuredStates(k1, view.getMeasuredState());
	//  515 1160:iload_3         
	//  516 1161:aload           22
	//  517 1163:invokevirtual   #643 <Method int View.getMeasuredState()>
	//  518 1166:invokestatic    #646 <Method int combineMeasuredStates(int, int)>
	//  519 1169:istore_3        
					k2 = l1;
	//  520 1170:iload           4
	//  521 1172:istore          6
					l1 = i2;
	//  522 1174:iload           5
	//  523 1176:istore          4
					i2 = i3;
	//  524 1178:iload           7
	//  525 1180:istore          5
				} else
	//* 526 1182:goto            1200
				{
					k2 = l1;
	//  527 1185:iload           4
	//  528 1187:istore          6
					l1 = i2;
	//  529 1189:iload           5
	//  530 1191:istore          4
					i2 = i3;
	//  531 1193:iload           7
	//  532 1195:istore          5
				}
			}

	//  533 1197:goto            1200
	//  534 1200:iload           14
	//  535 1202:iconst_1        
	//  536 1203:iadd            
	//  537 1204:istore          14
	//* 538 1206:goto            664
			int j3 = k1;
	//  539 1209:iload_3         
	//  540 1210:istore          7
			if(k2 != 0)
	//* 541 1212:iload           6
	//* 542 1214:ifeq            1319
			{
				b.j(l4);
	//  543 1217:aload_0         
	//  544 1218:getfield        #57  <Field m b>
	//  545 1221:iload           13
	//  546 1223:invokevirtual   #392 <Method void m.j(int)>
				b.k(k4);
	//  547 1226:aload_0         
	//  548 1227:getfield        #57  <Field m b>
	//  549 1230:iload           12
	//  550 1232:invokevirtual   #395 <Method void m.k(int)>
				if(flag1)
	//* 551 1235:iload           8
	//* 552 1237:ifeq            1247
					b.P();
	//  553 1240:aload_0         
	//  554 1241:getfield        #57  <Field m b>
	//  555 1244:invokevirtual   #236 <Method void m.P()>
				a("2nd pass");
	//  556 1247:aload_0         
	//  557 1248:ldc2            #648 <String "2nd pass">
	//  558 1251:invokevirtual   #617 <Method void a(String)>
				boolean flag;
				if(b.p() < i2)
	//* 559 1254:aload_0         
	//* 560 1255:getfield        #57  <Field m b>
	//* 561 1258:invokevirtual   #572 <Method int m.p()>
	//* 562 1261:iload           5
	//* 563 1263:icmpge          1280
				{
					b.j(i2);
	//  564 1266:aload_0         
	//  565 1267:getfield        #57  <Field m b>
	//  566 1270:iload           5
	//  567 1272:invokevirtual   #392 <Method void m.j(int)>
					flag = true;
	//  568 1275:iconst_1        
	//  569 1276:istore_3        
				} else
	//* 570 1277:goto            1282
				{
					flag = false;
	//  571 1280:iconst_0        
	//  572 1281:istore_3        
				}
				if(b.r() < l1)
	//* 573 1282:aload_0         
	//* 574 1283:getfield        #57  <Field m b>
	//* 575 1286:invokevirtual   #573 <Method int m.r()>
	//* 576 1289:iload           4
	//* 577 1291:icmpge          1308
				{
					b.k(l1);
	//  578 1294:aload_0         
	//  579 1295:getfield        #57  <Field m b>
	//  580 1298:iload           4
	//  581 1300:invokevirtual   #395 <Method void m.k(int)>
					flag = true;
	//  582 1303:iconst_1        
	//  583 1304:istore_3        
				}
	//* 584 1305:goto            1308
				if(flag)
	//* 585 1308:iload_3         
	//* 586 1309:ifeq            1319
					a("3rd pass");
	//  587 1312:aload_0         
	//  588 1313:ldc2            #650 <String "3rd pass">
	//  589 1316:invokevirtual   #617 <Method void a(String)>
			}
			l1 = 0;
	//  590 1319:iconst_0        
	//  591 1320:istore          4
			do
			{
				flag = ((boolean) (j3));
	//  592 1322:iload           7
	//  593 1324:istore_3        
				if(l1 >= j4)
					break;
	//  594 1325:iload           4
	//  595 1327:iload           11
	//  596 1329:icmpge          1470
				Object obj = ((Object) ((j)h.get(l1)));
	//  597 1332:aload_0         
	//  598 1333:getfield        #52  <Field ArrayList h>
	//  599 1336:iload           4
	//  600 1338:invokevirtual   #404 <Method Object ArrayList.get(int)>
	//  601 1341:checkcast       #138 <Class j>
	//  602 1344:astore          21
				View view1 = (View)((j) (obj)).B();
	//  603 1346:aload           21
	//  604 1348:invokevirtual   #623 <Method Object j.B()>
	//  605 1351:checkcast       #118 <Class View>
	//  606 1354:astore          22
				if(view1 != null && (view1.getMeasuredWidth() != ((j) (obj)).p() || view1.getMeasuredHeight() != ((j) (obj)).r()) && ((j) (obj)).l() != 8)
	//* 607 1356:aload           22
	//* 608 1358:ifnonnull       1364
	//* 609 1361:goto            1459
	//* 610 1364:aload           22
	//* 611 1366:invokevirtual   #178 <Method int View.getMeasuredWidth()>
	//* 612 1369:aload           21
	//* 613 1371:invokevirtual   #535 <Method int j.p()>
	//* 614 1374:icmpne          1396
	//* 615 1377:aload           22
	//* 616 1379:invokevirtual   #181 <Method int View.getMeasuredHeight()>
	//* 617 1382:aload           21
	//* 618 1384:invokevirtual   #537 <Method int j.r()>
	//* 619 1387:icmpeq          1393
	//* 620 1390:goto            1396
	//* 621 1393:goto            1459
	//* 622 1396:aload           21
	//* 623 1398:invokevirtual   #652 <Method int j.l()>
	//* 624 1401:bipush          8
	//* 625 1403:icmpeq          1459
				{
					view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(((j) (obj)).p(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(((j) (obj)).r(), 0x40000000));
	//  626 1406:aload           22
	//  627 1408:aload           21
	//  628 1410:invokevirtual   #535 <Method int j.p()>
	//  629 1413:ldc2            #379 <Int 0x40000000>
	//  630 1416:invokestatic    #627 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  631 1419:aload           21
	//  632 1421:invokevirtual   #537 <Method int j.r()>
	//  633 1424:ldc2            #379 <Int 0x40000000>
	//  634 1427:invokestatic    #627 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  635 1430:invokevirtual   #164 <Method void View.measure(int, int)>
					obj = ((Object) (t));
	//  636 1433:aload_0         
	//  637 1434:getfield        #166 <Field g t>
	//  638 1437:astore          21
					if(obj != null)
	//* 639 1439:aload           21
	//* 640 1441:ifnull          1459
						obj.b = ((g) (obj)).b + 1L;
	//  641 1444:aload           21
	//  642 1446:aload           21
	//  643 1448:getfield        #629 <Field long g.b>
	//  644 1451:lconst_1        
	//  645 1452:ladd            
	//  646 1453:putfield        #629 <Field long g.b>
				}
	//* 647 1456:goto            1459
				l1++;
	//  648 1459:iload           4
	//  649 1461:iconst_1        
	//  650 1462:iadd            
	//  651 1463:istore          4
			} while(true);
	//  652 1465:goto            1322
		} else
		{
			flag = false;
	//  653 1468:iconst_0        
	//  654 1469:istore_3        
		}
		l1 = b.p() + i6;
	//  655 1470:aload_0         
	//  656 1471:getfield        #57  <Field m b>
	//  657 1474:invokevirtual   #572 <Method int m.p()>
	//  658 1477:iload           17
	//  659 1479:iadd            
	//  660 1480:istore          4
		i2 = b.r() + l5;
	//  661 1482:aload_0         
	//  662 1483:getfield        #57  <Field m b>
	//  663 1486:invokevirtual   #573 <Method int m.r()>
	//  664 1489:iload           16
	//  665 1491:iadd            
	//  666 1492:istore          5
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//* 667 1494:getstatic       #461 <Field int android.os.Build$VERSION.SDK_INT>
	//* 668 1497:bipush          11
	//* 669 1499:icmplt          1600
		{
			i1 = resolveSizeAndState(l1, i1, ((int) (flag)));
	//  670 1502:iload           4
	//  671 1504:iload_1         
	//  672 1505:iload_3         
	//  673 1506:invokestatic    #655 <Method int resolveSizeAndState(int, int, int)>
	//  674 1509:istore_1        
			flag = ((boolean) (resolveSizeAndState(i2, j1, flag << 16)));
	//  675 1510:iload           5
	//  676 1512:iload_2         
	//  677 1513:iload_3         
	//  678 1514:bipush          16
	//  679 1516:ishl            
	//  680 1517:invokestatic    #655 <Method int resolveSizeAndState(int, int, int)>
	//  681 1520:istore_3        
			j1 = Math.min(k, i1 & 0xffffff);
	//  682 1521:aload_0         
	//  683 1522:getfield        #64  <Field int k>
	//  684 1525:iload_1         
	//  685 1526:ldc2            #656 <Int 0xffffff>
	//  686 1529:iand            
	//  687 1530:invokestatic    #384 <Method int Math.min(int, int)>
	//  688 1533:istore_2        
			flag = ((boolean) (Math.min(l, flag & 0xffffff)));
	//  689 1534:aload_0         
	//  690 1535:getfield        #66  <Field int l>
	//  691 1538:iload_3         
	//  692 1539:ldc2            #656 <Int 0xffffff>
	//  693 1542:iand            
	//  694 1543:invokestatic    #384 <Method int Math.min(int, int)>
	//  695 1546:istore_3        
			i1 = j1;
	//  696 1547:iload_2         
	//  697 1548:istore_1        
			if(b.K())
	//* 698 1549:aload_0         
	//* 699 1550:getfield        #57  <Field m b>
	//* 700 1553:invokevirtual   #659 <Method boolean m.K()>
	//* 701 1556:ifeq            1565
				i1 = j1 | 0x1000000;
	//  702 1559:iload_2         
	//  703 1560:ldc2            #660 <Int 0x1000000>
	//  704 1563:ior             
	//  705 1564:istore_1        
			j1 = ((int) (flag));
	//  706 1565:iload_3         
	//  707 1566:istore_2        
			if(b.L())
	//* 708 1567:aload_0         
	//* 709 1568:getfield        #57  <Field m b>
	//* 710 1571:invokevirtual   #663 <Method boolean m.L()>
	//* 711 1574:ifeq            1583
				j1 = flag | 0x1000000;
	//  712 1577:iload_3         
	//  713 1578:ldc2            #660 <Int 0x1000000>
	//  714 1581:ior             
	//  715 1582:istore_2        
			setMeasuredDimension(i1, j1);
	//  716 1583:aload_0         
	//  717 1584:iload_1         
	//  718 1585:iload_2         
	//  719 1586:invokevirtual   #666 <Method void setMeasuredDimension(int, int)>
			r = i1;
	//  720 1589:aload_0         
	//  721 1590:iload_1         
	//  722 1591:putfield        #81  <Field int r>
			s = j1;
	//  723 1594:aload_0         
	//  724 1595:iload_2         
	//  725 1596:putfield        #83  <Field int s>
			return;
	//  726 1599:return          
		} else
		{
			setMeasuredDimension(l1, i2);
	//  727 1600:aload_0         
	//  728 1601:iload           4
	//  729 1603:iload           5
	//  730 1605:invokevirtual   #666 <Method void setMeasuredDimension(int, int)>
			r = l1;
	//  731 1608:aload_0         
	//  732 1609:iload           4
	//  733 1611:putfield        #81  <Field int r>
			s = i2;
	//  734 1614:aload_0         
	//  735 1615:iload           5
	//  736 1617:putfield        #83  <Field int s>
			return;
	//  737 1620:return          
		}
	}

	public void onViewAdded(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #461 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          13
			super.onViewAdded(view);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #667 <Method void ViewGroup.onViewAdded(View)>
		j j1 = a(view);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #669 <Method j a(View)>
	//    9   18:astore_2        
		if((view instanceof android.support.constraint.j) && !(j1 instanceof o))
	//*  10   19:aload_1         
	//*  11   20:instanceof      #671 <Class android.support.constraint.j>
	//*  12   23:ifeq            71
	//*  13   26:aload_2         
	//*  14   27:instanceof      #673 <Class o>
	//*  15   30:ifne            71
		{
			c c1 = (c)view.getLayoutParams();
	//   16   33:aload_1         
	//   17   34:invokevirtual   #125 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   37:checkcast       #127 <Class c>
	//   19   40:astore_2        
			c1.al = ((j) (new o()));
	//   20   41:aload_2         
	//   21   42:new             #673 <Class o>
	//   22   45:dup             
	//   23   46:invokespecial   #674 <Method void o()>
	//   24   49:putfield        #131 <Field j c.al>
			c1.Y = true;
	//   25   52:aload_2         
	//   26   53:iconst_1        
	//   27   54:putfield        #134 <Field boolean c.Y>
			((o)c1.al).a(c1.S);
	//   28   57:aload_2         
	//   29   58:getfield        #131 <Field j c.al>
	//   30   61:checkcast       #673 <Class o>
	//   31   64:aload_2         
	//   32   65:getfield        #677 <Field int c.S>
	//   33   68:invokevirtual   #678 <Method void o.a(int)>
		}
		if(view instanceof b)
	//*  34   71:aload_1         
	//*  35   72:instanceof      #406 <Class b>
	//*  36   75:ifeq            118
		{
			b b1 = (b)view;
	//   37   78:aload_1         
	//   38   79:checkcast       #406 <Class b>
	//   39   82:astore_2        
			b1.a();
	//   40   83:aload_2         
	//   41   84:invokevirtual   #680 <Method void android.support.constraint.b.a()>
			((c)view.getLayoutParams()).Z = true;
	//   42   87:aload_1         
	//   43   88:invokevirtual   #125 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   44   91:checkcast       #127 <Class c>
	//   45   94:iconst_1        
	//   46   95:putfield        #136 <Field boolean c.Z>
			if(!g.contains(((Object) (b1))))
	//*  47   98:aload_0         
	//*  48   99:getfield        #50  <Field ArrayList g>
	//*  49  102:aload_2         
	//*  50  103:invokevirtual   #683 <Method boolean ArrayList.contains(Object)>
	//*  51  106:ifne            118
				g.add(((Object) (b1)));
	//   52  109:aload_0         
	//   53  110:getfield        #50  <Field ArrayList g>
	//   54  113:aload_2         
	//   55  114:invokevirtual   #686 <Method boolean ArrayList.add(Object)>
	//   56  117:pop             
		}
		a.put(view.getId(), ((Object) (view)));
	//   57  118:aload_0         
	//   58  119:getfield        #43  <Field SparseArray a>
	//   59  122:aload_1         
	//   60  123:invokevirtual   #687 <Method int View.getId()>
	//   61  126:aload_1         
	//   62  127:invokevirtual   #294 <Method void SparseArray.put(int, Object)>
		m = true;
	//   63  130:aload_0         
	//   64  131:iconst_1        
	//   65  132:putfield        #68  <Field boolean m>
	//   66  135:return          
	}

	public void onViewRemoved(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #461 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          13
			super.onViewRemoved(view);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #690 <Method void ViewGroup.onViewRemoved(View)>
		a.remove(view.getId());
	//    6   13:aload_0         
	//    7   14:getfield        #43  <Field SparseArray a>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #687 <Method int View.getId()>
	//   10   21:invokevirtual   #693 <Method void SparseArray.remove(int)>
		j j1 = a(view);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokevirtual   #669 <Method j a(View)>
	//   14   29:astore_2        
		b.c(j1);
	//   15   30:aload_0         
	//   16   31:getfield        #57  <Field m b>
	//   17   34:aload_2         
	//   18   35:invokevirtual   #696 <Method void m.c(j)>
		g.remove(((Object) (view)));
	//   19   38:aload_0         
	//   20   39:getfield        #50  <Field ArrayList g>
	//   21   42:aload_1         
	//   22   43:invokevirtual   #698 <Method boolean ArrayList.remove(Object)>
	//   23   46:pop             
		h.remove(((Object) (j1)));
	//   24   47:aload_0         
	//   25   48:getfield        #52  <Field ArrayList h>
	//   26   51:aload_2         
	//   27   52:invokevirtual   #698 <Method boolean ArrayList.remove(Object)>
	//   28   55:pop             
		m = true;
	//   29   56:aload_0         
	//   30   57:iconst_1        
	//   31   58:putfield        #68  <Field boolean m>
	//   32   61:return          
	}

	public void removeView(View view)
	{
		super.removeView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #701 <Method void ViewGroup.removeView(View)>
		if(android.os.Build.VERSION.SDK_INT < 14)
	//*   3    5:getstatic       #461 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          14
	//*   5   10:icmpge          18
			onViewRemoved(view);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #702 <Method void onViewRemoved(View)>
	//    9   18:return          
	}

	public void requestLayout()
	{
		super.requestLayout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #705 <Method void ViewGroup.requestLayout()>
		m = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #68  <Field boolean m>
		r = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #81  <Field int r>
		s = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #83  <Field int s>
		c = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #85  <Field int c>
		d = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #87  <Field int d>
		e = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #89  <Field int e>
		f = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #91  <Field int f>
	//   23   39:return          
	}

	public void setConstraintSet(android.support.constraint.e e1)
	{
		o = e1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field android.support.constraint.e o>
	//    3    5:return          
	}

	public void setId(int i1)
	{
		a.remove(getId());
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field SparseArray a>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #290 <Method int getId()>
	//    4    8:invokevirtual   #693 <Method void SparseArray.remove(int)>
		super.setId(i1);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokespecial   #710 <Method void ViewGroup.setId(int)>
		a.put(getId(), ((Object) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field SparseArray a>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #290 <Method int getId()>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #294 <Method void SparseArray.put(int, Object)>
	//   14   28:return          
	}

	public void setMaxHeight(int i1)
	{
		if(i1 == l)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #66  <Field int l>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			l = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #66  <Field int l>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #712 <Method void requestLayout()>
			return;
	//   10   18:return          
		}
	}

	public void setMaxWidth(int i1)
	{
		if(i1 == k)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #64  <Field int k>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			k = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #64  <Field int k>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #712 <Method void requestLayout()>
			return;
	//   10   18:return          
		}
	}

	public void setMinHeight(int i1)
	{
		if(i1 == j)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #61  <Field int j>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			j = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #61  <Field int j>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #712 <Method void requestLayout()>
			return;
	//   10   18:return          
		}
	}

	public void setMinWidth(int i1)
	{
		if(i1 == i)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #59  <Field int i>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			i = i1;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #59  <Field int i>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #712 <Method void requestLayout()>
			return;
	//   10   18:return          
		}
	}

	public void setOptimizationLevel(int i1)
	{
		b.a(i1);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field m b>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #357 <Method void m.a(int)>
	//    4    8:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	SparseArray a;
	m b;
	int c;
	int d;
	int e;
	int f;
	private ArrayList g;
	private final ArrayList h = new ArrayList(100);
	private int i;
	private int j;
	private int k;
	private int l;
	private boolean m;
	private int n;
	private android.support.constraint.e o;
	private int p;
	private HashMap q;
	private int r;
	private int s;
	private g t;
}
