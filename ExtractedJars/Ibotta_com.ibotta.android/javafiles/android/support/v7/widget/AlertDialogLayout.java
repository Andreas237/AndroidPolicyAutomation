// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.widget:
//			LinearLayoutCompat

public class AlertDialogLayout extends LinearLayoutCompat
{

	public AlertDialogLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void LinearLayoutCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	private void forceUniformWidth(int i, int j)
	{
		int l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method int getMeasuredWidth()>
	//    2    4:ldc1            #22  <Int 0x40000000>
	//    3    6:invokestatic    #28  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    4    9:istore          4
		for(int k = 0; k < i; k++)
	//*   5   11:iconst_0        
	//*   6   12:istore_3        
	//*   7   13:iload_3         
	//*   8   14:iload_1         
	//*   9   15:icmpge          96
		{
			View view = getChildAt(k);
	//   10   18:aload_0         
	//   11   19:iload_3         
	//   12   20:invokevirtual   #32  <Method View getChildAt(int)>
	//   13   23:astore          6
			if(view.getVisibility() == 8)
				continue;
	//   14   25:aload           6
	//   15   27:invokevirtual   #37  <Method int View.getVisibility()>
	//   16   30:bipush          8
	//   17   32:icmpeq          89
			LinearLayoutCompat.LayoutParams layoutparams = (LinearLayoutCompat.LayoutParams)view.getLayoutParams();
	//   18   35:aload           6
	//   19   37:invokevirtual   #41  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   40:checkcast       #43  <Class LinearLayoutCompat$LayoutParams>
	//   21   43:astore          7
			if(layoutparams.width == -1)
	//*  22   45:aload           7
	//*  23   47:getfield        #47  <Field int LinearLayoutCompat$LayoutParams.width>
	//*  24   50:iconst_m1       
	//*  25   51:icmpne          89
			{
				int i1 = layoutparams.height;
	//   26   54:aload           7
	//   27   56:getfield        #50  <Field int LinearLayoutCompat$LayoutParams.height>
	//   28   59:istore          5
				layoutparams.height = view.getMeasuredHeight();
	//   29   61:aload           7
	//   30   63:aload           6
	//   31   65:invokevirtual   #53  <Method int View.getMeasuredHeight()>
	//   32   68:putfield        #50  <Field int LinearLayoutCompat$LayoutParams.height>
				measureChildWithMargins(view, l, 0, j, 0);
	//   33   71:aload_0         
	//   34   72:aload           6
	//   35   74:iload           4
	//   36   76:iconst_0        
	//   37   77:iload_2         
	//   38   78:iconst_0        
	//   39   79:invokevirtual   #57  <Method void measureChildWithMargins(View, int, int, int, int)>
				layoutparams.height = i1;
	//   40   82:aload           7
	//   41   84:iload           5
	//   42   86:putfield        #50  <Field int LinearLayoutCompat$LayoutParams.height>
			}
		}

	//   43   89:iload_3         
	//   44   90:iconst_1        
	//   45   91:iadd            
	//   46   92:istore_3        
	//*  47   93:goto            13
	//   48   96:return          
	}

	private static int resolveMinimumHeight(View view)
	{
		int i = ViewCompat.getMinimumHeight(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #64  <Method int ViewCompat.getMinimumHeight(View)>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            11
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		if(view instanceof ViewGroup)
	//*   7   11:aload_0         
	//*   8   12:instanceof      #66  <Class ViewGroup>
	//*   9   15:ifeq            40
		{
			view = ((View) ((ViewGroup)view));
	//   10   18:aload_0         
	//   11   19:checkcast       #66  <Class ViewGroup>
	//   12   22:astore_0        
			if(((ViewGroup) (view)).getChildCount() == 1)
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #69  <Method int ViewGroup.getChildCount()>
	//*  15   27:iconst_1        
	//*  16   28:icmpne          40
				return resolveMinimumHeight(((ViewGroup) (view)).getChildAt(0));
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #70  <Method View ViewGroup.getChildAt(int)>
	//   20   36:invokestatic    #72  <Method int resolveMinimumHeight(View)>
	//   21   39:ireturn         
		}
		return 0;
	//   22   40:iconst_0        
	//   23   41:ireturn         
	}

	private void setChildFrame(View view, int i, int j, int k, int l)
	{
		view.layout(i, j, k + i, l + j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload_2         
	//    5    6:iadd            
	//    6    7:iload           5
	//    7    9:iload_3         
	//    8   10:iadd            
	//    9   11:invokevirtual   #77  <Method void View.layout(int, int, int, int)>
	//   10   14:return          
	}

	private boolean tryOnMeasure(int i, int j)
	{
		int k3 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #80  <Method int getChildCount()>
	//    2    4:istore          12
		View view5 = null;
	//    3    6:aconst_null     
	//    4    7:astore          18
		View view = view5;
	//    5    9:aload           18
	//    6   11:astore          15
		View view3 = view;
	//    7   13:aload           15
	//    8   15:astore          16
		int k = 0;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		View view4 = view;
	//   11   19:aload           15
	//   12   21:astore          17
		for(; k < k3; k++)
	//*  13   23:iload_3         
	//*  14   24:iload           12
	//*  15   26:icmpge          125
		{
			View view1 = getChildAt(k);
	//   16   29:aload_0         
	//   17   30:iload_3         
	//   18   31:invokevirtual   #32  <Method View getChildAt(int)>
	//   19   34:astore          15
			if(view1.getVisibility() == 8)
	//*  20   36:aload           15
	//*  21   38:invokevirtual   #37  <Method int View.getVisibility()>
	//*  22   41:bipush          8
	//*  23   43:icmpne          49
				continue;
	//   24   46:goto            118
			int l = view1.getId();
	//   25   49:aload           15
	//   26   51:invokevirtual   #83  <Method int View.getId()>
	//   27   54:istore          4
			if(l == android.support.v7.appcompat.R.id.topPanel)
	//*  28   56:iload           4
	//*  29   58:getstatic       #88  <Field int android.support.v7.appcompat.R$id.topPanel>
	//*  30   61:icmpne          71
			{
				view5 = view1;
	//   31   64:aload           15
	//   32   66:astore          18
				continue;
	//   33   68:goto            118
			}
			if(l == android.support.v7.appcompat.R.id.buttonPanel)
	//*  34   71:iload           4
	//*  35   73:getstatic       #91  <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//*  36   76:icmpne          86
			{
				view4 = view1;
	//   37   79:aload           15
	//   38   81:astore          17
				continue;
	//   39   83:goto            118
			}
			if(l != android.support.v7.appcompat.R.id.contentPanel && l != android.support.v7.appcompat.R.id.customPanel)
	//*  40   86:iload           4
	//*  41   88:getstatic       #94  <Field int android.support.v7.appcompat.R$id.contentPanel>
	//*  42   91:icmpeq          107
	//*  43   94:iload           4
	//*  44   96:getstatic       #97  <Field int android.support.v7.appcompat.R$id.customPanel>
	//*  45   99:icmpne          105
	//*  46  102:goto            107
				return false;
	//   47  105:iconst_0        
	//   48  106:ireturn         
			if(view3 != null)
	//*  49  107:aload           16
	//*  50  109:ifnull          114
				return false;
	//   51  112:iconst_0        
	//   52  113:ireturn         
			view3 = view1;
	//   53  114:aload           15
	//   54  116:astore          16
		}

	//   55  118:iload_3         
	//   56  119:iconst_1        
	//   57  120:iadd            
	//   58  121:istore_3        
	//*  59  122:goto            23
		int i4 = android.view.View.MeasureSpec.getMode(j);
	//   60  125:iload_2         
	//   61  126:invokestatic    #101 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   62  129:istore          14
		int i2 = android.view.View.MeasureSpec.getSize(j);
	//   63  131:iload_2         
	//   64  132:invokestatic    #104 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   65  135:istore          7
		int l3 = android.view.View.MeasureSpec.getMode(i);
	//   66  137:iload_1         
	//   67  138:invokestatic    #101 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   68  141:istore          13
		int j1 = getPaddingTop() + getPaddingBottom();
	//   69  143:aload_0         
	//   70  144:invokevirtual   #107 <Method int getPaddingTop()>
	//   71  147:aload_0         
	//   72  148:invokevirtual   #110 <Method int getPaddingBottom()>
	//   73  151:iadd            
	//   74  152:istore          5
		int i1;
		if(view5 != null)
	//*  75  154:aload           18
	//*  76  156:ifnull          190
		{
			view5.measure(i, 0);
	//   77  159:aload           18
	//   78  161:iload_1         
	//   79  162:iconst_0        
	//   80  163:invokevirtual   #113 <Method void View.measure(int, int)>
			j1 += view5.getMeasuredHeight();
	//   81  166:iload           5
	//   82  168:aload           18
	//   83  170:invokevirtual   #53  <Method int View.getMeasuredHeight()>
	//   84  173:iadd            
	//   85  174:istore          5
			i1 = View.combineMeasuredStates(0, view5.getMeasuredState());
	//   86  176:iconst_0        
	//   87  177:aload           18
	//   88  179:invokevirtual   #116 <Method int View.getMeasuredState()>
	//   89  182:invokestatic    #119 <Method int View.combineMeasuredStates(int, int)>
	//   90  185:istore          4
		} else
	//*  91  187:goto            193
		{
			i1 = 0;
	//   92  190:iconst_0        
	//   93  191:istore          4
		}
		int k2;
		if(view4 != null)
	//*  94  193:aload           17
	//*  95  195:ifnull          241
		{
			view4.measure(i, 0);
	//   96  198:aload           17
	//   97  200:iload_1         
	//   98  201:iconst_0        
	//   99  202:invokevirtual   #113 <Method void View.measure(int, int)>
			k = resolveMinimumHeight(view4);
	//  100  205:aload           17
	//  101  207:invokestatic    #72  <Method int resolveMinimumHeight(View)>
	//  102  210:istore_3        
			k2 = view4.getMeasuredHeight() - k;
	//  103  211:aload           17
	//  104  213:invokevirtual   #53  <Method int View.getMeasuredHeight()>
	//  105  216:iload_3         
	//  106  217:isub            
	//  107  218:istore          8
			j1 += k;
	//  108  220:iload           5
	//  109  222:iload_3         
	//  110  223:iadd            
	//  111  224:istore          5
			i1 = View.combineMeasuredStates(i1, view4.getMeasuredState());
	//  112  226:iload           4
	//  113  228:aload           17
	//  114  230:invokevirtual   #116 <Method int View.getMeasuredState()>
	//  115  233:invokestatic    #119 <Method int View.combineMeasuredStates(int, int)>
	//  116  236:istore          4
		} else
	//* 117  238:goto            246
		{
			k = 0;
	//  118  241:iconst_0        
	//  119  242:istore_3        
			k2 = 0;
	//  120  243:iconst_0        
	//  121  244:istore          8
		}
		int l2;
		if(view3 != null)
	//* 122  246:aload           16
	//* 123  248:ifnull          315
		{
			int k1;
			if(i4 == 0)
	//* 124  251:iload           14
	//* 125  253:ifne            262
				k1 = 0;
	//  126  256:iconst_0        
	//  127  257:istore          6
			else
	//* 128  259:goto            278
				k1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, i2 - j1), i4);
	//  129  262:iconst_0        
	//  130  263:iload           7
	//  131  265:iload           5
	//  132  267:isub            
	//  133  268:invokestatic    #124 <Method int Math.max(int, int)>
	//  134  271:iload           14
	//  135  273:invokestatic    #28  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  136  276:istore          6
			view3.measure(i, k1);
	//  137  278:aload           16
	//  138  280:iload_1         
	//  139  281:iload           6
	//  140  283:invokevirtual   #113 <Method void View.measure(int, int)>
			l2 = view3.getMeasuredHeight();
	//  141  286:aload           16
	//  142  288:invokevirtual   #53  <Method int View.getMeasuredHeight()>
	//  143  291:istore          9
			j1 += l2;
	//  144  293:iload           5
	//  145  295:iload           9
	//  146  297:iadd            
	//  147  298:istore          5
			i1 = View.combineMeasuredStates(i1, view3.getMeasuredState());
	//  148  300:iload           4
	//  149  302:aload           16
	//  150  304:invokevirtual   #116 <Method int View.getMeasuredState()>
	//  151  307:invokestatic    #119 <Method int View.combineMeasuredStates(int, int)>
	//  152  310:istore          4
		} else
	//* 153  312:goto            318
		{
			l2 = 0;
	//  154  315:iconst_0        
	//  155  316:istore          9
		}
		int i3 = i2 - j1;
	//  156  318:iload           7
	//  157  320:iload           5
	//  158  322:isub            
	//  159  323:istore          10
		i2 = i1;
	//  160  325:iload           4
	//  161  327:istore          7
		int j3 = i3;
	//  162  329:iload           10
	//  163  331:istore          11
		int l1 = j1;
	//  164  333:iload           5
	//  165  335:istore          6
		if(view4 != null)
	//* 166  337:aload           17
	//* 167  339:ifnull          419
		{
			k2 = Math.min(i3, k2);
	//  168  342:iload           10
	//  169  344:iload           8
	//  170  346:invokestatic    #127 <Method int Math.min(int, int)>
	//  171  349:istore          8
			i2 = i3;
	//  172  351:iload           10
	//  173  353:istore          7
			l1 = k;
	//  174  355:iload_3         
	//  175  356:istore          6
			if(k2 > 0)
	//* 176  358:iload           8
	//* 177  360:ifle            376
			{
				i2 = i3 - k2;
	//  178  363:iload           10
	//  179  365:iload           8
	//  180  367:isub            
	//  181  368:istore          7
				l1 = k + k2;
	//  182  370:iload_3         
	//  183  371:iload           8
	//  184  373:iadd            
	//  185  374:istore          6
			}
			view4.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
	//  186  376:aload           17
	//  187  378:iload_1         
	//  188  379:iload           6
	//  189  381:ldc1            #22  <Int 0x40000000>
	//  190  383:invokestatic    #28  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  191  386:invokevirtual   #113 <Method void View.measure(int, int)>
			l1 = (j1 - k) + view4.getMeasuredHeight();
	//  192  389:iload           5
	//  193  391:iload_3         
	//  194  392:isub            
	//  195  393:aload           17
	//  196  395:invokevirtual   #53  <Method int View.getMeasuredHeight()>
	//  197  398:iadd            
	//  198  399:istore          6
			k = View.combineMeasuredStates(i1, view4.getMeasuredState());
	//  199  401:iload           4
	//  200  403:aload           17
	//  201  405:invokevirtual   #116 <Method int View.getMeasuredState()>
	//  202  408:invokestatic    #119 <Method int View.combineMeasuredStates(int, int)>
	//  203  411:istore_3        
			j3 = i2;
	//  204  412:iload           7
	//  205  414:istore          11
			i2 = k;
	//  206  416:iload_3         
	//  207  417:istore          7
		}
		i1 = i2;
	//  208  419:iload           7
	//  209  421:istore          4
		k = l1;
	//  210  423:iload           6
	//  211  425:istore_3        
		if(view3 != null)
	//* 212  426:aload           16
	//* 213  428:ifnull          483
		{
			i1 = i2;
	//  214  431:iload           7
	//  215  433:istore          4
			k = l1;
	//  216  435:iload           6
	//  217  437:istore_3        
			if(j3 > 0)
	//* 218  438:iload           11
	//* 219  440:ifle            483
			{
				view3.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(l2 + j3, i4));
	//  220  443:aload           16
	//  221  445:iload_1         
	//  222  446:iload           9
	//  223  448:iload           11
	//  224  450:iadd            
	//  225  451:iload           14
	//  226  453:invokestatic    #28  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  227  456:invokevirtual   #113 <Method void View.measure(int, int)>
				k = (l1 - l2) + view3.getMeasuredHeight();
	//  228  459:iload           6
	//  229  461:iload           9
	//  230  463:isub            
	//  231  464:aload           16
	//  232  466:invokevirtual   #53  <Method int View.getMeasuredHeight()>
	//  233  469:iadd            
	//  234  470:istore_3        
				i1 = View.combineMeasuredStates(i2, view3.getMeasuredState());
	//  235  471:iload           7
	//  236  473:aload           16
	//  237  475:invokevirtual   #116 <Method int View.getMeasuredState()>
	//  238  478:invokestatic    #119 <Method int View.combineMeasuredStates(int, int)>
	//  239  481:istore          4
			}
		}
		j1 = 0;
	//  240  483:iconst_0        
	//  241  484:istore          5
		int j2;
		for(l1 = 0; j1 < k3; l1 = j2)
	//* 242  486:iconst_0        
	//* 243  487:istore          6
	//* 244  489:iload           5
	//* 245  491:iload           12
	//* 246  493:icmpge          543
		{
			View view2 = getChildAt(j1);
	//  247  496:aload_0         
	//  248  497:iload           5
	//  249  499:invokevirtual   #32  <Method View getChildAt(int)>
	//  250  502:astore          15
			j2 = l1;
	//  251  504:iload           6
	//  252  506:istore          7
			if(view2.getVisibility() != 8)
	//* 253  508:aload           15
	//* 254  510:invokevirtual   #37  <Method int View.getVisibility()>
	//* 255  513:bipush          8
	//* 256  515:icmpeq          530
				j2 = Math.max(l1, view2.getMeasuredWidth());
	//  257  518:iload           6
	//  258  520:aload           15
	//  259  522:invokevirtual   #128 <Method int View.getMeasuredWidth()>
	//  260  525:invokestatic    #124 <Method int Math.max(int, int)>
	//  261  528:istore          7
			j1++;
	//  262  530:iload           5
	//  263  532:iconst_1        
	//  264  533:iadd            
	//  265  534:istore          5
		}

	//  266  536:iload           7
	//  267  538:istore          6
	//* 268  540:goto            489
		setMeasuredDimension(View.resolveSizeAndState(l1 + (getPaddingLeft() + getPaddingRight()), i, i1), View.resolveSizeAndState(k, j, 0));
	//  269  543:aload_0         
	//  270  544:iload           6
	//  271  546:aload_0         
	//  272  547:invokevirtual   #131 <Method int getPaddingLeft()>
	//  273  550:aload_0         
	//  274  551:invokevirtual   #134 <Method int getPaddingRight()>
	//  275  554:iadd            
	//  276  555:iadd            
	//  277  556:iload_1         
	//  278  557:iload           4
	//  279  559:invokestatic    #138 <Method int View.resolveSizeAndState(int, int, int)>
	//  280  562:iload_3         
	//  281  563:iload_2         
	//  282  564:iconst_0        
	//  283  565:invokestatic    #138 <Method int View.resolveSizeAndState(int, int, int)>
	//  284  568:invokevirtual   #141 <Method void setMeasuredDimension(int, int)>
		if(l3 != 0x40000000)
	//* 285  571:iload           13
	//* 286  573:ldc1            #22  <Int 0x40000000>
	//* 287  575:icmpeq          585
			forceUniformWidth(k3, j);
	//  288  578:aload_0         
	//  289  579:iload           12
	//  290  581:iload_2         
	//  291  582:invokespecial   #143 <Method void forceUniformWidth(int, int)>
		return true;
	//  292  585:iconst_1        
	//  293  586:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int j1 = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method int getPaddingLeft()>
	//    2    4:istore          7
		int k1 = k - i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          8
		int l1 = getPaddingRight();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #134 <Method int getPaddingRight()>
	//    9   16:istore          9
		int i2 = getPaddingRight();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #134 <Method int getPaddingRight()>
	//   12   22:istore          10
		i = getMeasuredHeight();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #146 <Method int getMeasuredHeight()>
	//   15   28:istore_2        
		int j2 = getChildCount();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #80  <Method int getChildCount()>
	//   18   33:istore          11
		int k2 = getGravity();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #149 <Method int getGravity()>
	//   21   39:istore          12
		k = k2 & 0x70;
	//   22   41:iload           12
	//   23   43:bipush          112
	//   24   45:iand            
	//   25   46:istore          4
		if(k != 16)
	//*  26   48:iload           4
	//*  27   50:bipush          16
	//*  28   52:icmpeq          85
		{
			if(k != 80)
	//*  29   55:iload           4
	//*  30   57:bipush          80
	//*  31   59:icmpeq          70
				i = getPaddingTop();
	//   32   62:aload_0         
	//   33   63:invokevirtual   #107 <Method int getPaddingTop()>
	//   34   66:istore_2        
			else
	//*  35   67:goto            99
				i = (getPaddingTop() + l) - j - i;
	//   36   70:aload_0         
	//   37   71:invokevirtual   #107 <Method int getPaddingTop()>
	//   38   74:iload           5
	//   39   76:iadd            
	//   40   77:iload_3         
	//   41   78:isub            
	//   42   79:iload_2         
	//   43   80:isub            
	//   44   81:istore_2        
		} else
	//*  45   82:goto            99
		{
			i = getPaddingTop() + (l - j - i) / 2;
	//   46   85:aload_0         
	//   47   86:invokevirtual   #107 <Method int getPaddingTop()>
	//   48   89:iload           5
	//   49   91:iload_3         
	//   50   92:isub            
	//   51   93:iload_2         
	//   52   94:isub            
	//   53   95:iconst_2        
	//   54   96:idiv            
	//   55   97:iadd            
	//   56   98:istore_2        
		}
		Drawable drawable = getDividerDrawable();
	//   57   99:aload_0         
	//   58  100:invokevirtual   #153 <Method Drawable getDividerDrawable()>
	//   59  103:astore          15
		if(drawable == null)
	//*  60  105:aload           15
	//*  61  107:ifnonnull       116
			k = 0;
	//   62  110:iconst_0        
	//   63  111:istore          4
		else
	//*  64  113:goto            123
			k = drawable.getIntrinsicHeight();
	//   65  116:aload           15
	//   66  118:invokevirtual   #158 <Method int Drawable.getIntrinsicHeight()>
	//   67  121:istore          4
		for(l = 0; l < j2;)
	//*  68  123:iconst_0        
	//*  69  124:istore          5
	//*  70  126:iload           5
	//*  71  128:iload           11
	//*  72  130:icmpge          347
		{
			View view = getChildAt(l);
	//   73  133:aload_0         
	//   74  134:iload           5
	//   75  136:invokevirtual   #32  <Method View getChildAt(int)>
	//   76  139:astore          15
			j = i;
	//   77  141:iload_2         
	//   78  142:istore_3        
			if(view != null)
	//*  79  143:aload           15
	//*  80  145:ifnull          336
			{
				j = i;
	//   81  148:iload_2         
	//   82  149:istore_3        
				if(view.getVisibility() != 8)
	//*  83  150:aload           15
	//*  84  152:invokevirtual   #37  <Method int View.getVisibility()>
	//*  85  155:bipush          8
	//*  86  157:icmpeq          336
				{
					int l2 = view.getMeasuredWidth();
	//   87  160:aload           15
	//   88  162:invokevirtual   #128 <Method int View.getMeasuredWidth()>
	//   89  165:istore          13
					int i3 = view.getMeasuredHeight();
	//   90  167:aload           15
	//   91  169:invokevirtual   #53  <Method int View.getMeasuredHeight()>
	//   92  172:istore          14
					LinearLayoutCompat.LayoutParams layoutparams = (LinearLayoutCompat.LayoutParams)view.getLayoutParams();
	//   93  174:aload           15
	//   94  176:invokevirtual   #41  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   95  179:checkcast       #43  <Class LinearLayoutCompat$LayoutParams>
	//   96  182:astore          16
					int i1 = layoutparams.gravity;
	//   97  184:aload           16
	//   98  186:getfield        #161 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//   99  189:istore          6
					j = i1;
	//  100  191:iload           6
	//  101  193:istore_3        
					if(i1 < 0)
	//* 102  194:iload           6
	//* 103  196:ifge            205
						j = k2 & 0x800007;
	//  104  199:iload           12
	//  105  201:ldc1            #162 <Int 0x800007>
	//  106  203:iand            
	//  107  204:istore_3        
					j = GravityCompat.getAbsoluteGravity(j, ViewCompat.getLayoutDirection(((View) (this)))) & 7;
	//  108  205:iload_3         
	//  109  206:aload_0         
	//  110  207:invokestatic    #165 <Method int ViewCompat.getLayoutDirection(View)>
	//  111  210:invokestatic    #170 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  112  213:bipush          7
	//  113  215:iand            
	//  114  216:istore_3        
					if(j != 1)
	//* 115  217:iload_3         
	//* 116  218:iconst_1        
	//* 117  219:icmpeq          257
					{
						if(j != 5)
	//* 118  222:iload_3         
	//* 119  223:iconst_5        
	//* 120  224:icmpeq          239
							j = layoutparams.leftMargin + j1;
	//  121  227:aload           16
	//  122  229:getfield        #173 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  123  232:iload           7
	//  124  234:iadd            
	//  125  235:istore_3        
						else
	//* 126  236:goto            286
							j = k1 - l1 - l2 - layoutparams.rightMargin;
	//  127  239:iload           8
	//  128  241:iload           9
	//  129  243:isub            
	//  130  244:iload           13
	//  131  246:isub            
	//  132  247:aload           16
	//  133  249:getfield        #176 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  134  252:isub            
	//  135  253:istore_3        
					} else
	//* 136  254:goto            286
					{
						j = ((k1 - j1 - i2 - l2) / 2 + j1 + layoutparams.leftMargin) - layoutparams.rightMargin;
	//  137  257:iload           8
	//  138  259:iload           7
	//  139  261:isub            
	//  140  262:iload           10
	//  141  264:isub            
	//  142  265:iload           13
	//  143  267:isub            
	//  144  268:iconst_2        
	//  145  269:idiv            
	//  146  270:iload           7
	//  147  272:iadd            
	//  148  273:aload           16
	//  149  275:getfield        #173 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  150  278:iadd            
	//  151  279:aload           16
	//  152  281:getfield        #176 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  153  284:isub            
	//  154  285:istore_3        
					}
					i1 = i;
	//  155  286:iload_2         
	//  156  287:istore          6
					if(hasDividerBeforeChildAt(l))
	//* 157  289:aload_0         
	//* 158  290:iload           5
	//* 159  292:invokevirtual   #180 <Method boolean hasDividerBeforeChildAt(int)>
	//* 160  295:ifeq            304
						i1 = i + k;
	//  161  298:iload_2         
	//  162  299:iload           4
	//  163  301:iadd            
	//  164  302:istore          6
					i = i1 + layoutparams.topMargin;
	//  165  304:iload           6
	//  166  306:aload           16
	//  167  308:getfield        #183 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  168  311:iadd            
	//  169  312:istore_2        
					setChildFrame(view, j, i, l2, i3);
	//  170  313:aload_0         
	//  171  314:aload           15
	//  172  316:iload_3         
	//  173  317:iload_2         
	//  174  318:iload           13
	//  175  320:iload           14
	//  176  322:invokespecial   #185 <Method void setChildFrame(View, int, int, int, int)>
					j = i + (i3 + layoutparams.bottomMargin);
	//  177  325:iload_2         
	//  178  326:iload           14
	//  179  328:aload           16
	//  180  330:getfield        #188 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  181  333:iadd            
	//  182  334:iadd            
	//  183  335:istore_3        
				}
			}
			l++;
	//  184  336:iload           5
	//  185  338:iconst_1        
	//  186  339:iadd            
	//  187  340:istore          5
			i = j;
	//  188  342:iload_3         
	//  189  343:istore_2        
		}

	//* 190  344:goto            126
	//  191  347:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(!tryOnMeasure(i, j))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:iload_2         
	//*   3    3:invokespecial   #191 <Method boolean tryOnMeasure(int, int)>
	//*   4    6:ifne            15
			super.onMeasure(i, j);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokespecial   #193 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//    9   15:return          
	}
}
