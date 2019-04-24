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

	public AlertDialogLayout(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void LinearLayoutCompat(Context)>
	//    3    5:return          
	}

	public AlertDialogLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void LinearLayoutCompat(Context, AttributeSet)>
	//    4    6:return          
	}

	private void forceUniformWidth(int i, int j)
	{
		int l = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #24  <Method int getMeasuredWidth()>
	//    2    4:ldc1            #25  <Int 0x40000000>
	//    3    6:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
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
	//   12   20:invokevirtual   #35  <Method View getChildAt(int)>
	//   13   23:astore          6
			if(view.getVisibility() == 8)
				continue;
	//   14   25:aload           6
	//   15   27:invokevirtual   #40  <Method int View.getVisibility()>
	//   16   30:bipush          8
	//   17   32:icmpeq          89
			LinearLayoutCompat.LayoutParams layoutparams = (LinearLayoutCompat.LayoutParams)view.getLayoutParams();
	//   18   35:aload           6
	//   19   37:invokevirtual   #44  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   40:checkcast       #46  <Class LinearLayoutCompat$LayoutParams>
	//   21   43:astore          7
			if(layoutparams.width == -1)
	//*  22   45:aload           7
	//*  23   47:getfield        #50  <Field int LinearLayoutCompat$LayoutParams.width>
	//*  24   50:iconst_m1       
	//*  25   51:icmpne          89
			{
				int i1 = layoutparams.height;
	//   26   54:aload           7
	//   27   56:getfield        #53  <Field int LinearLayoutCompat$LayoutParams.height>
	//   28   59:istore          5
				layoutparams.height = view.getMeasuredHeight();
	//   29   61:aload           7
	//   30   63:aload           6
	//   31   65:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//   32   68:putfield        #53  <Field int LinearLayoutCompat$LayoutParams.height>
				measureChildWithMargins(view, l, 0, j, 0);
	//   33   71:aload_0         
	//   34   72:aload           6
	//   35   74:iload           4
	//   36   76:iconst_0        
	//   37   77:iload_2         
	//   38   78:iconst_0        
	//   39   79:invokevirtual   #60  <Method void measureChildWithMargins(View, int, int, int, int)>
				layoutparams.height = i1;
	//   40   82:aload           7
	//   41   84:iload           5
	//   42   86:putfield        #53  <Field int LinearLayoutCompat$LayoutParams.height>
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
	//    1    1:invokestatic    #67  <Method int ViewCompat.getMinimumHeight(View)>
	//    2    4:istore_1        
		if(i > 0)
	//*   3    5:iload_1         
	//*   4    6:ifle            11
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		if(view instanceof ViewGroup)
	//*   7   11:aload_0         
	//*   8   12:instanceof      #69  <Class ViewGroup>
	//*   9   15:ifeq            40
		{
			view = ((View) ((ViewGroup)view));
	//   10   18:aload_0         
	//   11   19:checkcast       #69  <Class ViewGroup>
	//   12   22:astore_0        
			if(((ViewGroup) (view)).getChildCount() == 1)
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #72  <Method int ViewGroup.getChildCount()>
	//*  15   27:iconst_1        
	//*  16   28:icmpne          40
				return resolveMinimumHeight(((ViewGroup) (view)).getChildAt(0));
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:invokevirtual   #73  <Method View ViewGroup.getChildAt(int)>
	//   20   36:invokestatic    #75  <Method int resolveMinimumHeight(View)>
	//   21   39:ireturn         
		}
		return 0;
	//   22   40:iconst_0        
	//   23   41:ireturn         
	}

	private void setChildFrame(View view, int i, int j, int k, int l)
	{
		view.layout(i, j, i + k, j + l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload_2         
	//    4    4:iload           4
	//    5    6:iadd            
	//    6    7:iload_3         
	//    7    8:iload           5
	//    8   10:iadd            
	//    9   11:invokevirtual   #80  <Method void View.layout(int, int, int, int)>
	//   10   14:return          
	}

	private boolean tryOnMeasure(int i, int j)
	{
		View view4 = null;
	//    0    0:aconst_null     
	//    1    1:astore          18
		View view3 = null;
	//    2    3:aconst_null     
	//    3    4:astore          17
		View view2 = null;
	//    4    6:aconst_null     
	//    5    7:astore          16
		int l3 = getChildCount();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #83  <Method int getChildCount()>
	//    8   13:istore          12
		for(int k = 0; k < l3;)
	//*   9   15:iconst_0        
	//*  10   16:istore_3        
	//*  11   17:iload_3         
	//*  12   18:iload           12
	//*  13   20:icmpge          131
		{
			View view = getChildAt(k);
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:invokevirtual   #35  <Method View getChildAt(int)>
	//   17   28:astore          15
			if(view.getVisibility() == 8)
	//*  18   30:aload           15
	//*  19   32:invokevirtual   #40  <Method int View.getVisibility()>
	//*  20   35:bipush          8
	//*  21   37:icmpne          47
			{
				view = view2;
	//   22   40:aload           16
	//   23   42:astore          15
			} else
	//*  24   44:goto            120
			{
				int i1 = view.getId();
	//   25   47:aload           15
	//   26   49:invokevirtual   #86  <Method int View.getId()>
	//   27   52:istore          4
				if(i1 == android.support.v7.appcompat.R.id.topPanel)
	//*  28   54:iload           4
	//*  29   56:getstatic       #91  <Field int android.support.v7.appcompat.R$id.topPanel>
	//*  30   59:icmpne          73
				{
					view4 = view;
	//   31   62:aload           15
	//   32   64:astore          18
					view = view2;
	//   33   66:aload           16
	//   34   68:astore          15
				} else
	//*  35   70:goto            120
				if(i1 == android.support.v7.appcompat.R.id.buttonPanel)
	//*  36   73:iload           4
	//*  37   75:getstatic       #94  <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//*  38   78:icmpne          92
				{
					view3 = view;
	//   39   81:aload           15
	//   40   83:astore          17
					view = view2;
	//   41   85:aload           16
	//   42   87:astore          15
				} else
	//*  43   89:goto            120
				if(i1 == android.support.v7.appcompat.R.id.contentPanel || i1 == android.support.v7.appcompat.R.id.customPanel)
	//*  44   92:iload           4
	//*  45   94:getstatic       #97  <Field int android.support.v7.appcompat.R$id.contentPanel>
	//*  46   97:icmpeq          108
	//*  47  100:iload           4
	//*  48  102:getstatic       #100 <Field int android.support.v7.appcompat.R$id.customPanel>
	//*  49  105:icmpne          118
				{
					if(view2 != null)
	//*  50  108:aload           16
	//*  51  110:ifnull          115
						return false;
	//   52  113:iconst_0        
	//   53  114:ireturn         
				} else
	//*  54  115:goto            120
				{
					return false;
	//   55  118:iconst_0        
	//   56  119:ireturn         
				}
			}
			k++;
	//   57  120:iload_3         
	//   58  121:iconst_1        
	//   59  122:iadd            
	//   60  123:istore_3        
			view2 = view;
	//   61  124:aload           15
	//   62  126:astore          16
		}

	//*  63  128:goto            17
		int j4 = android.view.View.MeasureSpec.getMode(j);
	//   64  131:iload_2         
	//   65  132:invokestatic    #104 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   66  135:istore          14
		int j3 = android.view.View.MeasureSpec.getSize(j);
	//   67  137:iload_2         
	//   68  138:invokestatic    #107 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   69  141:istore          10
		int i4 = android.view.View.MeasureSpec.getMode(i);
	//   70  143:iload_1         
	//   71  144:invokestatic    #104 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   72  147:istore          13
		int j1 = 0;
	//   73  149:iconst_0        
	//   74  150:istore          4
		int l = getPaddingTop() + getPaddingBottom();
	//   75  152:aload_0         
	//   76  153:invokevirtual   #110 <Method int getPaddingTop()>
	//   77  156:aload_0         
	//   78  157:invokevirtual   #113 <Method int getPaddingBottom()>
	//   79  160:iadd            
	//   80  161:istore_3        
		int k1 = l;
	//   81  162:iload_3         
	//   82  163:istore          5
		if(view4 != null)
	//*  83  165:aload           18
	//*  84  167:ifnull          197
		{
			view4.measure(i, 0);
	//   85  170:aload           18
	//   86  172:iload_1         
	//   87  173:iconst_0        
	//   88  174:invokevirtual   #116 <Method void View.measure(int, int)>
			k1 = l + view4.getMeasuredHeight();
	//   89  177:iload_3         
	//   90  178:aload           18
	//   91  180:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//   92  183:iadd            
	//   93  184:istore          5
			j1 = View.combineMeasuredStates(0, view4.getMeasuredState());
	//   94  186:iconst_0        
	//   95  187:aload           18
	//   96  189:invokevirtual   #119 <Method int View.getMeasuredState()>
	//   97  192:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//   98  195:istore          4
		}
		l = 0;
	//   99  197:iconst_0        
	//  100  198:istore_3        
		int l2 = 0;
	//  101  199:iconst_0        
	//  102  200:istore          8
		int i2 = j1;
	//  103  202:iload           4
	//  104  204:istore          6
		int j2 = k1;
	//  105  206:iload           5
	//  106  208:istore          7
		if(view3 != null)
	//* 107  210:aload           17
	//* 108  212:ifnull          255
		{
			view3.measure(i, 0);
	//  109  215:aload           17
	//  110  217:iload_1         
	//  111  218:iconst_0        
	//  112  219:invokevirtual   #116 <Method void View.measure(int, int)>
			l = resolveMinimumHeight(view3);
	//  113  222:aload           17
	//  114  224:invokestatic    #75  <Method int resolveMinimumHeight(View)>
	//  115  227:istore_3        
			l2 = view3.getMeasuredHeight() - l;
	//  116  228:aload           17
	//  117  230:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//  118  233:iload_3         
	//  119  234:isub            
	//  120  235:istore          8
			j2 = k1 + l;
	//  121  237:iload           5
	//  122  239:iload_3         
	//  123  240:iadd            
	//  124  241:istore          7
			i2 = View.combineMeasuredStates(j1, view3.getMeasuredState());
	//  125  243:iload           4
	//  126  245:aload           17
	//  127  247:invokevirtual   #119 <Method int View.getMeasuredState()>
	//  128  250:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//  129  253:istore          6
		}
		int i3 = 0;
	//  130  255:iconst_0        
	//  131  256:istore          9
		j1 = i2;
	//  132  258:iload           6
	//  133  260:istore          4
		k1 = j2;
	//  134  262:iload           7
	//  135  264:istore          5
		if(view2 != null)
	//* 136  266:aload           16
	//* 137  268:ifnull          332
		{
			if(j4 == 0)
	//* 138  271:iload           14
	//* 139  273:ifne            282
				j1 = 0;
	//  140  276:iconst_0        
	//  141  277:istore          4
			else
	//* 142  279:goto            298
				j1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, j3 - j2), j4);
	//  143  282:iconst_0        
	//  144  283:iload           10
	//  145  285:iload           7
	//  146  287:isub            
	//  147  288:invokestatic    #127 <Method int Math.max(int, int)>
	//  148  291:iload           14
	//  149  293:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  150  296:istore          4
			view2.measure(i, j1);
	//  151  298:aload           16
	//  152  300:iload_1         
	//  153  301:iload           4
	//  154  303:invokevirtual   #116 <Method void View.measure(int, int)>
			i3 = view2.getMeasuredHeight();
	//  155  306:aload           16
	//  156  308:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//  157  311:istore          9
			k1 = j2 + i3;
	//  158  313:iload           7
	//  159  315:iload           9
	//  160  317:iadd            
	//  161  318:istore          5
			j1 = View.combineMeasuredStates(i2, view2.getMeasuredState());
	//  162  320:iload           6
	//  163  322:aload           16
	//  164  324:invokevirtual   #119 <Method int View.getMeasuredState()>
	//  165  327:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//  166  330:istore          4
		}
		int k3 = j3 - k1;
	//  167  332:iload           10
	//  168  334:iload           5
	//  169  336:isub            
	//  170  337:istore          11
		i2 = j1;
	//  171  339:iload           4
	//  172  341:istore          6
		j2 = k1;
	//  173  343:iload           5
	//  174  345:istore          7
		j3 = k3;
	//  175  347:iload           11
	//  176  349:istore          10
		if(view3 != null)
	//* 177  351:aload           17
	//* 178  353:ifnull          433
		{
			l2 = Math.min(k3, l2);
	//  179  356:iload           11
	//  180  358:iload           8
	//  181  360:invokestatic    #130 <Method int Math.min(int, int)>
	//  182  363:istore          8
			j2 = l;
	//  183  365:iload_3         
	//  184  366:istore          7
			i2 = k3;
	//  185  368:iload           11
	//  186  370:istore          6
			if(l2 > 0)
	//* 187  372:iload           8
	//* 188  374:ifle            390
			{
				i2 = k3 - l2;
	//  189  377:iload           11
	//  190  379:iload           8
	//  191  381:isub            
	//  192  382:istore          6
				j2 = l + l2;
	//  193  384:iload_3         
	//  194  385:iload           8
	//  195  387:iadd            
	//  196  388:istore          7
			}
			view3.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x40000000));
	//  197  390:aload           17
	//  198  392:iload_1         
	//  199  393:iload           7
	//  200  395:ldc1            #25  <Int 0x40000000>
	//  201  397:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  202  400:invokevirtual   #116 <Method void View.measure(int, int)>
			j2 = (k1 - l) + view3.getMeasuredHeight();
	//  203  403:iload           5
	//  204  405:iload_3         
	//  205  406:isub            
	//  206  407:aload           17
	//  207  409:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//  208  412:iadd            
	//  209  413:istore          7
			l = View.combineMeasuredStates(j1, view3.getMeasuredState());
	//  210  415:iload           4
	//  211  417:aload           17
	//  212  419:invokevirtual   #119 <Method int View.getMeasuredState()>
	//  213  422:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//  214  425:istore_3        
			j3 = i2;
	//  215  426:iload           6
	//  216  428:istore          10
			i2 = l;
	//  217  430:iload_3         
	//  218  431:istore          6
		}
		j1 = i2;
	//  219  433:iload           6
	//  220  435:istore          4
		l = j2;
	//  221  437:iload           7
	//  222  439:istore_3        
		if(view2 != null)
	//* 223  440:aload           16
	//* 224  442:ifnull          497
		{
			j1 = i2;
	//  225  445:iload           6
	//  226  447:istore          4
			l = j2;
	//  227  449:iload           7
	//  228  451:istore_3        
			if(j3 > 0)
	//* 229  452:iload           10
	//* 230  454:ifle            497
			{
				view2.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(i3 + j3, j4));
	//  231  457:aload           16
	//  232  459:iload_1         
	//  233  460:iload           9
	//  234  462:iload           10
	//  235  464:iadd            
	//  236  465:iload           14
	//  237  467:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  238  470:invokevirtual   #116 <Method void View.measure(int, int)>
				l = (j2 - i3) + view2.getMeasuredHeight();
	//  239  473:iload           7
	//  240  475:iload           9
	//  241  477:isub            
	//  242  478:aload           16
	//  243  480:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//  244  483:iadd            
	//  245  484:istore_3        
				j1 = View.combineMeasuredStates(i2, view2.getMeasuredState());
	//  246  485:iload           6
	//  247  487:aload           16
	//  248  489:invokevirtual   #119 <Method int View.getMeasuredState()>
	//  249  492:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//  250  495:istore          4
			}
		}
		i2 = 0;
	//  251  497:iconst_0        
	//  252  498:istore          6
		for(int l1 = 0; l1 < l3;)
	//* 253  500:iconst_0        
	//* 254  501:istore          5
	//* 255  503:iload           5
	//* 256  505:iload           12
	//* 257  507:icmpge          557
		{
			View view1 = getChildAt(l1);
	//  258  510:aload_0         
	//  259  511:iload           5
	//  260  513:invokevirtual   #35  <Method View getChildAt(int)>
	//  261  516:astore          15
			int k2 = i2;
	//  262  518:iload           6
	//  263  520:istore          7
			if(view1.getVisibility() != 8)
	//* 264  522:aload           15
	//* 265  524:invokevirtual   #40  <Method int View.getVisibility()>
	//* 266  527:bipush          8
	//* 267  529:icmpeq          544
				k2 = Math.max(i2, view1.getMeasuredWidth());
	//  268  532:iload           6
	//  269  534:aload           15
	//  270  536:invokevirtual   #131 <Method int View.getMeasuredWidth()>
	//  271  539:invokestatic    #127 <Method int Math.max(int, int)>
	//  272  542:istore          7
			l1++;
	//  273  544:iload           5
	//  274  546:iconst_1        
	//  275  547:iadd            
	//  276  548:istore          5
			i2 = k2;
	//  277  550:iload           7
	//  278  552:istore          6
		}

	//* 279  554:goto            503
		setMeasuredDimension(View.resolveSizeAndState(i2 + (getPaddingLeft() + getPaddingRight()), i, j1), View.resolveSizeAndState(l, j, 0));
	//  280  557:aload_0         
	//  281  558:iload           6
	//  282  560:aload_0         
	//  283  561:invokevirtual   #134 <Method int getPaddingLeft()>
	//  284  564:aload_0         
	//  285  565:invokevirtual   #137 <Method int getPaddingRight()>
	//  286  568:iadd            
	//  287  569:iadd            
	//  288  570:iload_1         
	//  289  571:iload           4
	//  290  573:invokestatic    #141 <Method int View.resolveSizeAndState(int, int, int)>
	//  291  576:iload_3         
	//  292  577:iload_2         
	//  293  578:iconst_0        
	//  294  579:invokestatic    #141 <Method int View.resolveSizeAndState(int, int, int)>
	//  295  582:invokevirtual   #144 <Method void setMeasuredDimension(int, int)>
		if(i4 != 0x40000000)
	//* 296  585:iload           13
	//* 297  587:ldc1            #25  <Int 0x40000000>
	//* 298  589:icmpeq          599
			forceUniformWidth(l3, j);
	//  299  592:aload_0         
	//  300  593:iload           12
	//  301  595:iload_2         
	//  302  596:invokespecial   #146 <Method void forceUniformWidth(int, int)>
		return true;
	//  303  599:iconst_1        
	//  304  600:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int j1 = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method int getPaddingLeft()>
	//    2    4:istore          7
		int k1 = k - i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          8
		int l1 = getPaddingRight();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #137 <Method int getPaddingRight()>
	//    9   16:istore          9
		int i2 = getPaddingRight();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #137 <Method int getPaddingRight()>
	//   12   22:istore          10
		i = getMeasuredHeight();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #149 <Method int getMeasuredHeight()>
	//   15   28:istore_2        
		int j2 = getChildCount();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #83  <Method int getChildCount()>
	//   18   33:istore          11
		int k2 = getGravity();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #152 <Method int getGravity()>
	//   21   39:istore          12
		switch(k2 & 0x70)
	//*  22   41:iload           12
	//*  23   43:bipush          112
	//*  24   45:iand            
		{
	//*  25   46:lookupswitch    3: default 80
	//	               16: 98
	//	               48: 115
	//	               80: 83
	//*  26   80:goto            115
		case 80: // 'P'
			i = (getPaddingTop() + l) - j - i;
	//   27   83:aload_0         
	//   28   84:invokevirtual   #110 <Method int getPaddingTop()>
	//   29   87:iload           5
	//   30   89:iadd            
	//   31   90:iload_3         
	//   32   91:isub            
	//   33   92:iload_2         
	//   34   93:isub            
	//   35   94:istore_2        
			break;

	//*  36   95:goto            120
		case 16: // '\020'
			i = getPaddingTop() + (l - j - i) / 2;
	//   37   98:aload_0         
	//   38   99:invokevirtual   #110 <Method int getPaddingTop()>
	//   39  102:iload           5
	//   40  104:iload_3         
	//   41  105:isub            
	//   42  106:iload_2         
	//   43  107:isub            
	//   44  108:iconst_2        
	//   45  109:idiv            
	//   46  110:iadd            
	//   47  111:istore_2        
			break;

	//*  48  112:goto            120
		case 48: // '0'
		default:
			i = getPaddingTop();
	//   49  115:aload_0         
	//   50  116:invokevirtual   #110 <Method int getPaddingTop()>
	//   51  119:istore_2        
			break;
		}
		Drawable drawable = getDividerDrawable();
	//   52  120:aload_0         
	//   53  121:invokevirtual   #156 <Method Drawable getDividerDrawable()>
	//   54  124:astore          15
		if(drawable == null)
	//*  55  126:aload           15
	//*  56  128:ifnonnull       137
			k = 0;
	//   57  131:iconst_0        
	//   58  132:istore          4
		else
	//*  59  134:goto            144
			k = drawable.getIntrinsicHeight();
	//   60  137:aload           15
	//   61  139:invokevirtual   #161 <Method int Drawable.getIntrinsicHeight()>
	//   62  142:istore          4
		for(l = 0; l < j2;)
	//*  63  144:iconst_0        
	//*  64  145:istore          5
	//*  65  147:iload           5
	//*  66  149:iload           11
	//*  67  151:icmpge          395
		{
			View view = getChildAt(l);
	//   68  154:aload_0         
	//   69  155:iload           5
	//   70  157:invokevirtual   #35  <Method View getChildAt(int)>
	//   71  160:astore          15
			j = i;
	//   72  162:iload_2         
	//   73  163:istore_3        
			if(view != null)
	//*  74  164:aload           15
	//*  75  166:ifnull          384
			{
				j = i;
	//   76  169:iload_2         
	//   77  170:istore_3        
				if(view.getVisibility() != 8)
	//*  78  171:aload           15
	//*  79  173:invokevirtual   #40  <Method int View.getVisibility()>
	//*  80  176:bipush          8
	//*  81  178:icmpeq          384
				{
					int l2 = view.getMeasuredWidth();
	//   82  181:aload           15
	//   83  183:invokevirtual   #131 <Method int View.getMeasuredWidth()>
	//   84  186:istore          13
					int i3 = view.getMeasuredHeight();
	//   85  188:aload           15
	//   86  190:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//   87  193:istore          14
					LinearLayoutCompat.LayoutParams layoutparams = (LinearLayoutCompat.LayoutParams)view.getLayoutParams();
	//   88  195:aload           15
	//   89  197:invokevirtual   #44  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   90  200:checkcast       #46  <Class LinearLayoutCompat$LayoutParams>
	//   91  203:astore          16
					int i1 = layoutparams.gravity;
	//   92  205:aload           16
	//   93  207:getfield        #164 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//   94  210:istore          6
					j = i1;
	//   95  212:iload           6
	//   96  214:istore_3        
					if(i1 < 0)
	//*  97  215:iload           6
	//*  98  217:ifge            226
						j = k2 & 0x800007;
	//   99  220:iload           12
	//  100  222:ldc1            #165 <Int 0x800007>
	//  101  224:iand            
	//  102  225:istore_3        
					switch(GravityCompat.getAbsoluteGravity(j, ViewCompat.getLayoutDirection(((View) (this)))) & 7)
	//* 103  226:iload_3         
	//* 104  227:aload_0         
	//* 105  228:invokestatic    #168 <Method int ViewCompat.getLayoutDirection(View)>
	//* 106  231:invokestatic    #173 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//* 107  234:bipush          7
	//* 108  236:iand            
					{
	//* 109  237:tableswitch     1 5: default 272
	//	               1 275
	//	               2 325
	//	               3 325
	//	               4 325
	//	               5 307
	//* 110  272:goto            325
					case 1: // '\001'
						j = ((k1 - j1 - i2 - l2) / 2 + j1 + layoutparams.leftMargin) - layoutparams.rightMargin;
	//  111  275:iload           8
	//  112  277:iload           7
	//  113  279:isub            
	//  114  280:iload           10
	//  115  282:isub            
	//  116  283:iload           13
	//  117  285:isub            
	//  118  286:iconst_2        
	//  119  287:idiv            
	//  120  288:iload           7
	//  121  290:iadd            
	//  122  291:aload           16
	//  123  293:getfield        #176 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  124  296:iadd            
	//  125  297:aload           16
	//  126  299:getfield        #179 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  127  302:isub            
	//  128  303:istore_3        
						break;

	//* 129  304:goto            334
					case 5: // '\005'
						j = k1 - l1 - l2 - layoutparams.rightMargin;
	//  130  307:iload           8
	//  131  309:iload           9
	//  132  311:isub            
	//  133  312:iload           13
	//  134  314:isub            
	//  135  315:aload           16
	//  136  317:getfield        #179 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  137  320:isub            
	//  138  321:istore_3        
						break;

	//* 139  322:goto            334
					case 2: // '\002'
					case 3: // '\003'
					case 4: // '\004'
					default:
						j = j1 + layoutparams.leftMargin;
	//  140  325:iload           7
	//  141  327:aload           16
	//  142  329:getfield        #176 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  143  332:iadd            
	//  144  333:istore_3        
						break;
					}
					i1 = i;
	//  145  334:iload_2         
	//  146  335:istore          6
					if(hasDividerBeforeChildAt(l))
	//* 147  337:aload_0         
	//* 148  338:iload           5
	//* 149  340:invokevirtual   #183 <Method boolean hasDividerBeforeChildAt(int)>
	//* 150  343:ifeq            352
						i1 = i + k;
	//  151  346:iload_2         
	//  152  347:iload           4
	//  153  349:iadd            
	//  154  350:istore          6
					i = i1 + layoutparams.topMargin;
	//  155  352:iload           6
	//  156  354:aload           16
	//  157  356:getfield        #186 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//  158  359:iadd            
	//  159  360:istore_2        
					setChildFrame(view, j, i, l2, i3);
	//  160  361:aload_0         
	//  161  362:aload           15
	//  162  364:iload_3         
	//  163  365:iload_2         
	//  164  366:iload           13
	//  165  368:iload           14
	//  166  370:invokespecial   #188 <Method void setChildFrame(View, int, int, int, int)>
					j = i + (layoutparams.bottomMargin + i3);
	//  167  373:iload_2         
	//  168  374:aload           16
	//  169  376:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//  170  379:iload           14
	//  171  381:iadd            
	//  172  382:iadd            
	//  173  383:istore_3        
				}
			}
			l++;
	//  174  384:iload           5
	//  175  386:iconst_1        
	//  176  387:iadd            
	//  177  388:istore          5
			i = j;
	//  178  390:iload_3         
	//  179  391:istore_2        
		}

	//* 180  392:goto            147
	//  181  395:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(!tryOnMeasure(i, j))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:iload_2         
	//*   3    3:invokespecial   #194 <Method boolean tryOnMeasure(int, int)>
	//*   4    6:ifne            15
			super.onMeasure(i, j);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:iload_2         
	//    8   12:invokespecial   #196 <Method void LinearLayoutCompat.onMeasure(int, int)>
	//    9   15:return          
	}
}
