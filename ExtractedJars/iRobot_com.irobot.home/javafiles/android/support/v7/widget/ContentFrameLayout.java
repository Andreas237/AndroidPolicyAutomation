// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.s;
import android.util.*;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout
{
	public static interface a
	{

		public abstract void a();

		public abstract void b();
	}


	public ContentFrameLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void ContentFrameLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public ContentFrameLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #26  <Method void ContentFrameLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ContentFrameLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #27  <Method void FrameLayout(Context, AttributeSet, int)>
		g = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #29  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #32  <Method void Rect()>
	//    9   15:putfield        #34  <Field Rect g>
	//   10   18:return          
	}

	public void a(int i, int j, int k, int l)
	{
		g.set(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Rect g>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #38  <Method void Rect.set(int, int, int, int)>
		if(s.x(((android.view.View) (this))))
	//*   7   12:aload_0         
	//*   8   13:invokestatic    #44  <Method boolean s.x(android.view.View)>
	//*   9   16:ifeq            23
			requestLayout();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #47  <Method void requestLayout()>
	//   12   23:return          
	}

	public void a(Rect rect)
	{
		fitSystemWindows(rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method boolean fitSystemWindows(Rect)>
	//    3    5:pop             
	//    4    6:return          
	}

	public TypedValue getFixedHeightMajor()
	{
		if(e == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field TypedValue e>
	//*   2    4:ifnonnull       18
			e = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #58  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #59  <Method void TypedValue()>
	//    7   15:putfield        #56  <Field TypedValue e>
		return e;
	//    8   18:aload_0         
	//    9   19:getfield        #56  <Field TypedValue e>
	//   10   22:areturn         
	}

	public TypedValue getFixedHeightMinor()
	{
		if(f == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field TypedValue f>
	//*   2    4:ifnonnull       18
			f = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #58  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #59  <Method void TypedValue()>
	//    7   15:putfield        #62  <Field TypedValue f>
		return f;
	//    8   18:aload_0         
	//    9   19:getfield        #62  <Field TypedValue f>
	//   10   22:areturn         
	}

	public TypedValue getFixedWidthMajor()
	{
		if(c == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field TypedValue c>
	//*   2    4:ifnonnull       18
			c = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #58  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #59  <Method void TypedValue()>
	//    7   15:putfield        #65  <Field TypedValue c>
		return c;
	//    8   18:aload_0         
	//    9   19:getfield        #65  <Field TypedValue c>
	//   10   22:areturn         
	}

	public TypedValue getFixedWidthMinor()
	{
		if(d == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field TypedValue d>
	//*   2    4:ifnonnull       18
			d = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #58  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #59  <Method void TypedValue()>
	//    7   15:putfield        #68  <Field TypedValue d>
		return d;
	//    8   18:aload_0         
	//    9   19:getfield        #68  <Field TypedValue d>
	//   10   22:areturn         
	}

	public TypedValue getMinWidthMajor()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field TypedValue a>
	//*   2    4:ifnonnull       18
			a = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #58  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #59  <Method void TypedValue()>
	//    7   15:putfield        #71  <Field TypedValue a>
		return a;
	//    8   18:aload_0         
	//    9   19:getfield        #71  <Field TypedValue a>
	//   10   22:areturn         
	}

	public TypedValue getMinWidthMinor()
	{
		if(b == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #74  <Field TypedValue b>
	//*   2    4:ifnonnull       18
			b = new TypedValue();
	//    3    7:aload_0         
	//    4    8:new             #58  <Class TypedValue>
	//    5   11:dup             
	//    6   12:invokespecial   #59  <Method void TypedValue()>
	//    7   15:putfield        #74  <Field TypedValue b>
		return b;
	//    8   18:aload_0         
	//    9   19:getfield        #74  <Field TypedValue b>
	//   10   22:areturn         
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #77  <Method void FrameLayout.onAttachedToWindow()>
		if(h != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #79  <Field ContentFrameLayout$a h>
	//*   4    8:ifnull          20
			h.a();
	//    5   11:aload_0         
	//    6   12:getfield        #79  <Field ContentFrameLayout$a h>
	//    7   15:invokeinterface #81  <Method void ContentFrameLayout$a.a()>
	//    8   20:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void FrameLayout.onDetachedFromWindow()>
		if(h != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #79  <Field ContentFrameLayout$a h>
	//*   4    8:ifnull          20
			h.b();
	//    5   11:aload_0         
	//    6   12:getfield        #79  <Field ContentFrameLayout$a h>
	//    7   15:invokeinterface #86  <Method void ContentFrameLayout$a.b()>
	//    8   20:return          
	}

	protected void onMeasure(int i, int j)
	{
		boolean flag;
		int k1;
		boolean flag1;
		int l1;
		TypedValue typedvalue;
		DisplayMetrics displaymetrics;
		displaymetrics = getContext().getResources().getDisplayMetrics();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #92  <Method Context getContext()>
	//    2    4:invokevirtual   #98  <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #104 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    4   10:astore          11
		int k = displaymetrics.widthPixels;
	//    5   12:aload           11
	//    6   14:getfield        #110 <Field int DisplayMetrics.widthPixels>
	//    7   17:istore          4
		int l = displaymetrics.heightPixels;
	//    8   19:aload           11
	//    9   21:getfield        #113 <Field int DisplayMetrics.heightPixels>
	//   10   24:istore          5
		flag1 = true;
	//   11   26:iconst_1        
	//   12   27:istore          8
		if(k < l)
	//*  13   29:iload           4
	//*  14   31:iload           5
	//*  15   33:icmpge          42
			flag = true;
	//   16   36:iconst_1        
	//   17   37:istore          4
		else
	//*  18   39:goto            45
			flag = false;
	//   19   42:iconst_0        
	//   20   43:istore          4
		l1 = android.view.View.MeasureSpec.getMode(i);
	//   21   45:iload_1         
	//   22   46:invokestatic    #119 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   23   49:istore          9
		k1 = android.view.View.MeasureSpec.getMode(j);
	//   24   51:iload_2         
	//   25   52:invokestatic    #119 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   26   55:istore          7
		if(l1 != 0x80000000)
			break MISSING_BLOCK_LABEL_197;
	//   27   57:iload           9
	//   28   59:ldc1            #120 <Int 0x80000000>
	//   29   61:icmpne          197
		if(flag)
	//*  30   64:iload           4
	//*  31   66:ifeq            78
			typedvalue = d;
	//   32   69:aload_0         
	//   33   70:getfield        #68  <Field TypedValue d>
	//   34   73:astore          10
		else
	//*  35   75:goto            84
			typedvalue = c;
	//   36   78:aload_0         
	//   37   79:getfield        #65  <Field TypedValue c>
	//   38   82:astore          10
		if(typedvalue == null || typedvalue.type == 0)
			break MISSING_BLOCK_LABEL_197;
	//   39   84:aload           10
	//   40   86:ifnull          197
	//   41   89:aload           10
	//   42   91:getfield        #123 <Field int TypedValue.type>
	//   43   94:ifeq            197
		if(typedvalue.type != 5) goto _L2; else goto _L1
	//   44   97:aload           10
	//   45   99:getfield        #123 <Field int TypedValue.type>
	//   46  102:iconst_5        
	//   47  103:icmpne          121
_L1:
		float f1 = typedvalue.getDimension(displaymetrics);
	//   48  106:aload           10
	//   49  108:aload           11
	//   50  110:invokevirtual   #127 <Method float TypedValue.getDimension(DisplayMetrics)>
	//   51  113:fstore_3        
_L4:
		int i1;
		i1 = (int)f1;
	//   52  114:fload_3         
	//   53  115:f2i             
	//   54  116:istore          5
		break MISSING_BLOCK_LABEL_155;
	//   55  118:goto            155
_L2:
		if(typedvalue.type != 6)
			break; /* Loop/switch isn't completed */
	//   56  121:aload           10
	//   57  123:getfield        #123 <Field int TypedValue.type>
	//   58  126:bipush          6
	//   59  128:icmpne          152
		f1 = typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//   60  131:aload           10
	//   61  133:aload           11
	//   62  135:getfield        #110 <Field int DisplayMetrics.widthPixels>
	//   63  138:i2f             
	//   64  139:aload           11
	//   65  141:getfield        #110 <Field int DisplayMetrics.widthPixels>
	//   66  144:i2f             
	//   67  145:invokevirtual   #131 <Method float TypedValue.getFraction(float, float)>
	//   68  148:fstore_3        
		if(true) goto _L4; else goto _L3
	//   69  149:goto            114
_L3:
		i1 = 0;
	//   70  152:iconst_0        
	//   71  153:istore          5
		int j1;
		if(i1 > 0)
	//*  72  155:iload           5
	//*  73  157:ifle            197
		{
			j1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i1 - (g.left + g.right), android.view.View.MeasureSpec.getSize(i)), 0x40000000);
	//   74  160:iload           5
	//   75  162:aload_0         
	//   76  163:getfield        #34  <Field Rect g>
	//   77  166:getfield        #134 <Field int Rect.left>
	//   78  169:aload_0         
	//   79  170:getfield        #34  <Field Rect g>
	//   80  173:getfield        #137 <Field int Rect.right>
	//   81  176:iadd            
	//   82  177:isub            
	//   83  178:iload_1         
	//   84  179:invokestatic    #140 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   85  182:invokestatic    #146 <Method int Math.min(int, int)>
	//   86  185:ldc1            #147 <Int 0x40000000>
	//   87  187:invokestatic    #150 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   88  190:istore          6
			i = 1;
	//   89  192:iconst_1        
	//   90  193:istore_1        
			break MISSING_BLOCK_LABEL_202;
	//   91  194:goto            202
		}
		j1 = i;
	//   92  197:iload_1         
	//   93  198:istore          6
		i = 0;
	//   94  200:iconst_0        
	//   95  201:istore_1        
		i1 = j;
	//   96  202:iload_2         
	//   97  203:istore          5
		if(k1 != 0x80000000)
			break MISSING_BLOCK_LABEL_349;
	//   98  205:iload           7
	//   99  207:ldc1            #120 <Int 0x80000000>
	//  100  209:icmpne          349
		if(flag)
	//* 101  212:iload           4
	//* 102  214:ifeq            226
			typedvalue = e;
	//  103  217:aload_0         
	//  104  218:getfield        #56  <Field TypedValue e>
	//  105  221:astore          10
		else
	//* 106  223:goto            232
			typedvalue = f;
	//  107  226:aload_0         
	//  108  227:getfield        #62  <Field TypedValue f>
	//  109  230:astore          10
		i1 = j;
	//  110  232:iload_2         
	//  111  233:istore          5
		if(typedvalue == null)
			break MISSING_BLOCK_LABEL_349;
	//  112  235:aload           10
	//  113  237:ifnull          349
		i1 = j;
	//  114  240:iload_2         
	//  115  241:istore          5
		if(typedvalue.type == 0)
			break MISSING_BLOCK_LABEL_349;
	//  116  243:aload           10
	//  117  245:getfield        #123 <Field int TypedValue.type>
	//  118  248:ifeq            349
		if(typedvalue.type != 5) goto _L6; else goto _L5
	//  119  251:aload           10
	//  120  253:getfield        #123 <Field int TypedValue.type>
	//  121  256:iconst_5        
	//  122  257:icmpne          275
_L5:
		f1 = typedvalue.getDimension(displaymetrics);
	//  123  260:aload           10
	//  124  262:aload           11
	//  125  264:invokevirtual   #127 <Method float TypedValue.getDimension(DisplayMetrics)>
	//  126  267:fstore_3        
_L8:
		k1 = (int)f1;
	//  127  268:fload_3         
	//  128  269:f2i             
	//  129  270:istore          7
		break MISSING_BLOCK_LABEL_309;
	//  130  272:goto            309
_L6:
		if(typedvalue.type != 6)
			break; /* Loop/switch isn't completed */
	//  131  275:aload           10
	//  132  277:getfield        #123 <Field int TypedValue.type>
	//  133  280:bipush          6
	//  134  282:icmpne          306
		f1 = typedvalue.getFraction(displaymetrics.heightPixels, displaymetrics.heightPixels);
	//  135  285:aload           10
	//  136  287:aload           11
	//  137  289:getfield        #113 <Field int DisplayMetrics.heightPixels>
	//  138  292:i2f             
	//  139  293:aload           11
	//  140  295:getfield        #113 <Field int DisplayMetrics.heightPixels>
	//  141  298:i2f             
	//  142  299:invokevirtual   #131 <Method float TypedValue.getFraction(float, float)>
	//  143  302:fstore_3        
		if(true) goto _L8; else goto _L7
	//  144  303:goto            268
_L7:
		k1 = 0;
	//  145  306:iconst_0        
	//  146  307:istore          7
		i1 = j;
	//  147  309:iload_2         
	//  148  310:istore          5
		if(k1 > 0)
	//* 149  312:iload           7
	//* 150  314:ifle            349
			i1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k1 - (g.top + g.bottom), android.view.View.MeasureSpec.getSize(j)), 0x40000000);
	//  151  317:iload           7
	//  152  319:aload_0         
	//  153  320:getfield        #34  <Field Rect g>
	//  154  323:getfield        #153 <Field int Rect.top>
	//  155  326:aload_0         
	//  156  327:getfield        #34  <Field Rect g>
	//  157  330:getfield        #156 <Field int Rect.bottom>
	//  158  333:iadd            
	//  159  334:isub            
	//  160  335:iload_2         
	//  161  336:invokestatic    #140 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  162  339:invokestatic    #146 <Method int Math.min(int, int)>
	//  163  342:ldc1            #147 <Int 0x40000000>
	//  164  344:invokestatic    #150 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  165  347:istore          5
		super.onMeasure(j1, i1);
	//  166  349:aload_0         
	//  167  350:iload           6
	//  168  352:iload           5
	//  169  354:invokespecial   #158 <Method void FrameLayout.onMeasure(int, int)>
		k1 = getMeasuredWidth();
	//  170  357:aload_0         
	//  171  358:invokevirtual   #162 <Method int getMeasuredWidth()>
	//  172  361:istore          7
		j1 = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000);
	//  173  363:iload           7
	//  174  365:ldc1            #147 <Int 0x40000000>
	//  175  367:invokestatic    #150 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  176  370:istore          6
		if(i != 0 || l1 != 0x80000000)
			break MISSING_BLOCK_LABEL_515;
	//  177  372:iload_1         
	//  178  373:ifne            515
	//  179  376:iload           9
	//  180  378:ldc1            #120 <Int 0x80000000>
	//  181  380:icmpne          515
		if(flag)
	//* 182  383:iload           4
	//* 183  385:ifeq            397
			typedvalue = b;
	//  184  388:aload_0         
	//  185  389:getfield        #74  <Field TypedValue b>
	//  186  392:astore          10
		else
	//* 187  394:goto            403
			typedvalue = a;
	//  188  397:aload_0         
	//  189  398:getfield        #71  <Field TypedValue a>
	//  190  401:astore          10
		if(typedvalue == null || typedvalue.type == 0)
			break MISSING_BLOCK_LABEL_515;
	//  191  403:aload           10
	//  192  405:ifnull          515
	//  193  408:aload           10
	//  194  410:getfield        #123 <Field int TypedValue.type>
	//  195  413:ifeq            515
		if(typedvalue.type != 5) goto _L10; else goto _L9
	//  196  416:aload           10
	//  197  418:getfield        #123 <Field int TypedValue.type>
	//  198  421:iconst_5        
	//  199  422:icmpne          439
_L9:
		f1 = typedvalue.getDimension(displaymetrics);
	//  200  425:aload           10
	//  201  427:aload           11
	//  202  429:invokevirtual   #127 <Method float TypedValue.getDimension(DisplayMetrics)>
	//  203  432:fstore_3        
_L12:
		i = (int)f1;
	//  204  433:fload_3         
	//  205  434:f2i             
	//  206  435:istore_1        
		break MISSING_BLOCK_LABEL_472;
	//  207  436:goto            472
_L10:
		if(typedvalue.type != 6)
			break; /* Loop/switch isn't completed */
	//  208  439:aload           10
	//  209  441:getfield        #123 <Field int TypedValue.type>
	//  210  444:bipush          6
	//  211  446:icmpne          470
		f1 = typedvalue.getFraction(displaymetrics.widthPixels, displaymetrics.widthPixels);
	//  212  449:aload           10
	//  213  451:aload           11
	//  214  453:getfield        #110 <Field int DisplayMetrics.widthPixels>
	//  215  456:i2f             
	//  216  457:aload           11
	//  217  459:getfield        #110 <Field int DisplayMetrics.widthPixels>
	//  218  462:i2f             
	//  219  463:invokevirtual   #131 <Method float TypedValue.getFraction(float, float)>
	//  220  466:fstore_3        
		if(true) goto _L12; else goto _L11
	//  221  467:goto            433
_L11:
		i = 0;
	//  222  470:iconst_0        
	//  223  471:istore_1        
		j = i;
	//  224  472:iload_1         
	//  225  473:istore_2        
		if(i > 0)
	//* 226  474:iload_1         
	//* 227  475:ifle            496
			j = i - (g.left + g.right);
	//  228  478:iload_1         
	//  229  479:aload_0         
	//  230  480:getfield        #34  <Field Rect g>
	//  231  483:getfield        #134 <Field int Rect.left>
	//  232  486:aload_0         
	//  233  487:getfield        #34  <Field Rect g>
	//  234  490:getfield        #137 <Field int Rect.right>
	//  235  493:iadd            
	//  236  494:isub            
	//  237  495:istore_2        
		if(k1 < j)
	//* 238  496:iload           7
	//* 239  498:iload_2         
	//* 240  499:icmpge          515
		{
			j = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
	//  241  502:iload_2         
	//  242  503:ldc1            #147 <Int 0x40000000>
	//  243  505:invokestatic    #150 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  244  508:istore_2        
			i = ((int) (flag1));
	//  245  509:iload           8
	//  246  511:istore_1        
			break MISSING_BLOCK_LABEL_520;
	//  247  512:goto            520
		}
		i = 0;
	//  248  515:iconst_0        
	//  249  516:istore_1        
		j = j1;
	//  250  517:iload           6
	//  251  519:istore_2        
		if(i != 0)
	//* 252  520:iload_1         
	//* 253  521:ifeq            531
			super.onMeasure(j, i1);
	//  254  524:aload_0         
	//  255  525:iload_2         
	//  256  526:iload           5
	//  257  528:invokespecial   #158 <Method void FrameLayout.onMeasure(int, int)>
		return;
	//  258  531:return          
	}

	public void setAttachListener(a a1)
	{
		h = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field ContentFrameLayout$a h>
	//    3    5:return          
	}

	private TypedValue a;
	private TypedValue b;
	private TypedValue c;
	private TypedValue d;
	private TypedValue e;
	private TypedValue f;
	private final Rect g;
	private a h;
}
