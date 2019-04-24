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
		View view2 = null;
	//    0    0:aconst_null     
	//    1    1:astore          16
		View view4 = null;
	//    2    3:aconst_null     
	//    3    4:astore          18
		View view3 = null;
	//    4    6:aconst_null     
	//    5    7:astore          17
		int i3 = getChildCount();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #83  <Method int getChildCount()>
	//    8   13:istore          12
		int k = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		while(k < i3) 
	//*  11   17:iload_3         
	//*  12   18:iload           12
	//*  13   20:icmpge          116
		{
			View view = getChildAt(k);
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:invokevirtual   #35  <Method View getChildAt(int)>
	//   17   28:astore          15
			if(view.getVisibility() != 8)
	//*  18   30:aload           15
	//*  19   32:invokevirtual   #40  <Method int View.getVisibility()>
	//*  20   35:bipush          8
	//*  21   37:icmpne          47
	//*  22   40:iload_3         
	//*  23   41:iconst_1        
	//*  24   42:iadd            
	//*  25   43:istore_3        
	//*  26   44:goto            17
			{
				int l = view.getId();
	//   27   47:aload           15
	//   28   49:invokevirtual   #86  <Method int View.getId()>
	//   29   52:istore          4
				if(l == android.support.v7.appcompat.R.id.topPanel)
	//*  30   54:iload           4
	//*  31   56:getstatic       #91  <Field int android.support.v7.appcompat.R$id.topPanel>
	//*  32   59:icmpne          69
					view2 = view;
	//   33   62:aload           15
	//   34   64:astore          16
				else
	//*  35   66:goto            40
				if(l == android.support.v7.appcompat.R.id.buttonPanel)
	//*  36   69:iload           4
	//*  37   71:getstatic       #94  <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//*  38   74:icmpne          84
					view4 = view;
	//   39   77:aload           15
	//   40   79:astore          18
				else
	//*  41   81:goto            40
				if(l == android.support.v7.appcompat.R.id.contentPanel || l == android.support.v7.appcompat.R.id.customPanel)
	//*  42   84:iload           4
	//*  43   86:getstatic       #97  <Field int android.support.v7.appcompat.R$id.contentPanel>
	//*  44   89:icmpeq          100
	//*  45   92:iload           4
	//*  46   94:getstatic       #100 <Field int android.support.v7.appcompat.R$id.customPanel>
	//*  47   97:icmpne          114
				{
					if(view3 != null)
	//*  48  100:aload           17
	//*  49  102:ifnull          107
						return false;
	//   50  105:iconst_0        
	//   51  106:ireturn         
					view3 = view;
	//   52  107:aload           15
	//   53  109:astore          17
				} else
	//*  54  111:goto            40
				{
					return false;
	//   55  114:iconst_0        
	//   56  115:ireturn         
				}
			}
			k++;
		}
		int k3 = android.view.View.MeasureSpec.getMode(j);
	//   57  116:iload_2         
	//   58  117:invokestatic    #104 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   59  120:istore          14
		int k2 = android.view.View.MeasureSpec.getSize(j);
	//   60  122:iload_2         
	//   61  123:invokestatic    #107 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   62  126:istore          10
		int j3 = android.view.View.MeasureSpec.getMode(i);
	//   63  128:iload_1         
	//   64  129:invokestatic    #104 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   65  132:istore          13
		int i1 = 0;
	//   66  134:iconst_0        
	//   67  135:istore          4
		k = getPaddingTop() + getPaddingBottom();
	//   68  137:aload_0         
	//   69  138:invokevirtual   #110 <Method int getPaddingTop()>
	//   70  141:aload_0         
	//   71  142:invokevirtual   #113 <Method int getPaddingBottom()>
	//   72  145:iadd            
	//   73  146:istore_3        
		int j1 = k;
	//   74  147:iload_3         
	//   75  148:istore          5
		if(view2 != null)
	//*  76  150:aload           16
	//*  77  152:ifnull          182
		{
			view2.measure(i, 0);
	//   78  155:aload           16
	//   79  157:iload_1         
	//   80  158:iconst_0        
	//   81  159:invokevirtual   #116 <Method void View.measure(int, int)>
			j1 = k + view2.getMeasuredHeight();
	//   82  162:iload_3         
	//   83  163:aload           16
	//   84  165:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//   85  168:iadd            
	//   86  169:istore          5
			i1 = View.combineMeasuredStates(0, view2.getMeasuredState());
	//   87  171:iconst_0        
	//   88  172:aload           16
	//   89  174:invokevirtual   #119 <Method int View.getMeasuredState()>
	//   90  177:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//   91  180:istore          4
		}
		k = 0;
	//   92  182:iconst_0        
	//   93  183:istore_3        
		int j2 = 0;
	//   94  184:iconst_0        
	//   95  185:istore          9
		int k1 = i1;
	//   96  187:iload           4
	//   97  189:istore          6
		int l1 = j1;
	//   98  191:iload           5
	//   99  193:istore          7
		if(view4 != null)
	//* 100  195:aload           18
	//* 101  197:ifnull          240
		{
			view4.measure(i, 0);
	//  102  200:aload           18
	//  103  202:iload_1         
	//  104  203:iconst_0        
	//  105  204:invokevirtual   #116 <Method void View.measure(int, int)>
			k = resolveMinimumHeight(view4);
	//  106  207:aload           18
	//  107  209:invokestatic    #75  <Method int resolveMinimumHeight(View)>
	//  108  212:istore_3        
			j2 = view4.getMeasuredHeight() - k;
	//  109  213:aload           18
	//  110  215:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//  111  218:iload_3         
	//  112  219:isub            
	//  113  220:istore          9
			l1 = j1 + k;
	//  114  222:iload           5
	//  115  224:iload_3         
	//  116  225:iadd            
	//  117  226:istore          7
			k1 = View.combineMeasuredStates(i1, view4.getMeasuredState());
	//  118  228:iload           4
	//  119  230:aload           18
	//  120  232:invokevirtual   #119 <Method int View.getMeasuredState()>
	//  121  235:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//  122  238:istore          6
		}
		int i2 = 0;
	//  123  240:iconst_0        
	//  124  241:istore          8
		i1 = k1;
	//  125  243:iload           6
	//  126  245:istore          4
		j1 = l1;
	//  127  247:iload           7
	//  128  249:istore          5
		if(view3 != null)
	//* 129  251:aload           17
	//* 130  253:ifnull          298
		{
			int l2;
			View view1;
			if(k3 == 0)
	//* 131  256:iload           14
	//* 132  258:ifne            523
				i1 = 0;
	//  133  261:iconst_0        
	//  134  262:istore          4
			else
	//* 135  264:aload           17
	//* 136  266:iload_1         
	//* 137  267:iload           4
	//* 138  269:invokevirtual   #116 <Method void View.measure(int, int)>
	//* 139  272:aload           17
	//* 140  274:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//* 141  277:istore          8
	//* 142  279:iload           7
	//* 143  281:iload           8
	//* 144  283:iadd            
	//* 145  284:istore          5
	//* 146  286:iload           6
	//* 147  288:aload           17
	//* 148  290:invokevirtual   #119 <Method int View.getMeasuredState()>
	//* 149  293:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//* 150  296:istore          4
	//* 151  298:iload           10
	//* 152  300:iload           5
	//* 153  302:isub            
	//* 154  303:istore          10
	//* 155  305:iload           4
	//* 156  307:istore          6
	//* 157  309:iload           10
	//* 158  311:istore          11
	//* 159  313:iload           5
	//* 160  315:istore          7
	//* 161  317:aload           18
	//* 162  319:ifnull          399
	//* 163  322:iload           10
	//* 164  324:iload           9
	//* 165  326:invokestatic    #127 <Method int Math.min(int, int)>
	//* 166  329:istore          9
	//* 167  331:iload_3         
	//* 168  332:istore          7
	//* 169  334:iload           10
	//* 170  336:istore          6
	//* 171  338:iload           9
	//* 172  340:ifle            356
	//* 173  343:iload           10
	//* 174  345:iload           9
	//* 175  347:isub            
	//* 176  348:istore          6
	//* 177  350:iload_3         
	//* 178  351:iload           9
	//* 179  353:iadd            
	//* 180  354:istore          7
	//* 181  356:aload           18
	//* 182  358:iload_1         
	//* 183  359:iload           7
	//* 184  361:ldc1            #25  <Int 0x40000000>
	//* 185  363:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 186  366:invokevirtual   #116 <Method void View.measure(int, int)>
	//* 187  369:iload           5
	//* 188  371:iload_3         
	//* 189  372:isub            
	//* 190  373:aload           18
	//* 191  375:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//* 192  378:iadd            
	//* 193  379:istore          7
	//* 194  381:iload           4
	//* 195  383:aload           18
	//* 196  385:invokevirtual   #119 <Method int View.getMeasuredState()>
	//* 197  388:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//* 198  391:istore_3        
	//* 199  392:iload           6
	//* 200  394:istore          11
	//* 201  396:iload_3         
	//* 202  397:istore          6
	//* 203  399:iload           6
	//* 204  401:istore          4
	//* 205  403:iload           7
	//* 206  405:istore_3        
	//* 207  406:aload           17
	//* 208  408:ifnull          463
	//* 209  411:iload           6
	//* 210  413:istore          4
	//* 211  415:iload           7
	//* 212  417:istore_3        
	//* 213  418:iload           11
	//* 214  420:ifle            463
	//* 215  423:aload           17
	//* 216  425:iload_1         
	//* 217  426:iload           8
	//* 218  428:iload           11
	//* 219  430:iadd            
	//* 220  431:iload           14
	//* 221  433:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 222  436:invokevirtual   #116 <Method void View.measure(int, int)>
	//* 223  439:iload           7
	//* 224  441:iload           8
	//* 225  443:isub            
	//* 226  444:aload           17
	//* 227  446:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//* 228  449:iadd            
	//* 229  450:istore_3        
	//* 230  451:iload           6
	//* 231  453:aload           17
	//* 232  455:invokevirtual   #119 <Method int View.getMeasuredState()>
	//* 233  458:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//* 234  461:istore          4
	//* 235  463:iconst_0        
	//* 236  464:istore          6
	//* 237  466:iconst_0        
	//* 238  467:istore          5
	//* 239  469:iload           5
	//* 240  471:iload           12
	//* 241  473:icmpge          542
	//* 242  476:aload_0         
	//* 243  477:iload           5
	//* 244  479:invokevirtual   #35  <Method View getChildAt(int)>
	//* 245  482:astore          15
	//* 246  484:iload           6
	//* 247  486:istore          7
	//* 248  488:aload           15
	//* 249  490:invokevirtual   #40  <Method int View.getVisibility()>
	//* 250  493:bipush          8
	//* 251  495:icmpeq          510
	//* 252  498:iload           6
	//* 253  500:aload           15
	//* 254  502:invokevirtual   #128 <Method int View.getMeasuredWidth()>
	//* 255  505:invokestatic    #131 <Method int Math.max(int, int)>
	//* 256  508:istore          7
	//* 257  510:iload           5
	//* 258  512:iconst_1        
	//* 259  513:iadd            
	//* 260  514:istore          5
	//* 261  516:iload           7
	//* 262  518:istore          6
	//* 263  520:goto            469
				i1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, k2 - l1), k3);
	//  264  523:iconst_0        
	//  265  524:iload           10
	//  266  526:iload           7
	//  267  528:isub            
	//  268  529:invokestatic    #131 <Method int Math.max(int, int)>
	//  269  532:iload           14
	//  270  534:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  271  537:istore          4
			view3.measure(i, i1);
			i2 = view3.getMeasuredHeight();
			j1 = l1 + i2;
			i1 = View.combineMeasuredStates(k1, view3.getMeasuredState());
		}
		k2 -= j1;
		k1 = i1;
		l2 = k2;
		l1 = j1;
		if(view4 != null)
		{
			j2 = Math.min(k2, j2);
			l1 = k;
			k1 = k2;
			if(j2 > 0)
			{
				k1 = k2 - j2;
				l1 = k + j2;
			}
			view4.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
			l1 = (j1 - k) + view4.getMeasuredHeight();
			k = View.combineMeasuredStates(i1, view4.getMeasuredState());
			l2 = k1;
			k1 = k;
		}
		i1 = k1;
		k = l1;
		if(view3 != null)
		{
			i1 = k1;
			k = l1;
			if(l2 > 0)
			{
				view3.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(i2 + l2, k3));
				k = (l1 - i2) + view3.getMeasuredHeight();
				i1 = View.combineMeasuredStates(k1, view3.getMeasuredState());
			}
		}
		k1 = 0;
		for(j1 = 0; j1 < i3;)
		{
			view1 = getChildAt(j1);
			l1 = k1;
			if(view1.getVisibility() != 8)
				l1 = Math.max(k1, view1.getMeasuredWidth());
			j1++;
			k1 = l1;
		}

	//* 272  539:goto            264
		setMeasuredDimension(View.resolveSizeAndState(k1 + (getPaddingLeft() + getPaddingRight()), i, i1), View.resolveSizeAndState(k, j, 0));
	//  273  542:aload_0         
	//  274  543:iload           6
	//  275  545:aload_0         
	//  276  546:invokevirtual   #134 <Method int getPaddingLeft()>
	//  277  549:aload_0         
	//  278  550:invokevirtual   #137 <Method int getPaddingRight()>
	//  279  553:iadd            
	//  280  554:iadd            
	//  281  555:iload_1         
	//  282  556:iload           4
	//  283  558:invokestatic    #141 <Method int View.resolveSizeAndState(int, int, int)>
	//  284  561:iload_3         
	//  285  562:iload_2         
	//  286  563:iconst_0        
	//  287  564:invokestatic    #141 <Method int View.resolveSizeAndState(int, int, int)>
	//  288  567:invokevirtual   #144 <Method void setMeasuredDimension(int, int)>
		if(j3 != 0x40000000)
	//* 289  570:iload           13
	//* 290  572:ldc1            #25  <Int 0x40000000>
	//* 291  574:icmpeq          584
			forceUniformWidth(i3, j);
	//  292  577:aload_0         
	//  293  578:iload           12
	//  294  580:iload_2         
	//  295  581:invokespecial   #146 <Method void forceUniformWidth(int, int)>
		return true;
	//  296  584:iconst_1        
	//  297  585:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int j1;
		int k1;
		int l1;
		int i2;
		int j2;
		int k2;
		j1 = getPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #134 <Method int getPaddingLeft()>
	//    2    4:istore          7
		k1 = k - i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          8
		l1 = getPaddingRight();
	//    7   12:aload_0         
	//    8   13:invokevirtual   #137 <Method int getPaddingRight()>
	//    9   16:istore          9
		i2 = getPaddingRight();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #137 <Method int getPaddingRight()>
	//   12   22:istore          10
		i = getMeasuredHeight();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #149 <Method int getMeasuredHeight()>
	//   15   28:istore_2        
		j2 = getChildCount();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #83  <Method int getChildCount()>
	//   18   33:istore          11
		k2 = getGravity();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #152 <Method int getGravity()>
	//   21   39:istore          12
		k2 & 0x70;
	//   22   41:iload           12
	//   23   43:bipush          112
	//   24   45:iand            
		JVM INSTR lookupswitch 2: default 72
	//	               16: 297
	//	               80: 282;
	//   25   46:lookupswitch    2: default 72
	//	               16: 297
	//	               80: 282
		   goto _L1 _L2 _L3
_L1:
		i = getPaddingTop();
	//   26   72:aload_0         
	//   27   73:invokevirtual   #110 <Method int getPaddingTop()>
	//   28   76:istore_2        
_L11:
		int l2;
		LinearLayoutCompat.LayoutParams layoutparams;
		Object obj = ((Object) (getDividerDrawable()));
	//   29   77:aload_0         
	//   30   78:invokevirtual   #156 <Method Drawable getDividerDrawable()>
	//   31   81:astore          15
		int i1;
		int i3;
		if(obj == null)
	//*  32   83:aload           15
	//*  33   85:ifnonnull       314
			k = 0;
	//   34   88:iconst_0        
	//   35   89:istore          4
		else
	//*  36   91:iconst_0        
	//*  37   92:istore          5
	//*  38   94:iload           5
	//*  39   96:iload           11
	//*  40   98:icmpge          374
	//*  41  101:aload_0         
	//*  42  102:iload           5
	//*  43  104:invokevirtual   #35  <Method View getChildAt(int)>
	//*  44  107:astore          15
	//*  45  109:iload_2         
	//*  46  110:istore_3        
	//*  47  111:aload           15
	//*  48  113:ifnull          271
	//*  49  116:iload_2         
	//*  50  117:istore_3        
	//*  51  118:aload           15
	//*  52  120:invokevirtual   #40  <Method int View.getVisibility()>
	//*  53  123:bipush          8
	//*  54  125:icmpeq          271
	//*  55  128:aload           15
	//*  56  130:invokevirtual   #128 <Method int View.getMeasuredWidth()>
	//*  57  133:istore          13
	//*  58  135:aload           15
	//*  59  137:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//*  60  140:istore          14
	//*  61  142:aload           15
	//*  62  144:invokevirtual   #44  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  63  147:checkcast       #46  <Class LinearLayoutCompat$LayoutParams>
	//*  64  150:astore          16
	//*  65  152:aload           16
	//*  66  154:getfield        #159 <Field int LinearLayoutCompat$LayoutParams.gravity>
	//*  67  157:istore          6
	//*  68  159:iload           6
	//*  69  161:istore_3        
	//*  70  162:iload           6
	//*  71  164:ifge            173
	//*  72  167:iload           12
	//*  73  169:ldc1            #160 <Int 0x800007>
	//*  74  171:iand            
	//*  75  172:istore_3        
	//*  76  173:iload_3         
	//*  77  174:aload_0         
	//*  78  175:invokestatic    #163 <Method int ViewCompat.getLayoutDirection(View)>
	//*  79  178:invokestatic    #168 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*  80  181:bipush          7
	//*  81  183:iand            
	//*  82  184:lookupswitch    2: default 212
	//	               1: 324
	//	               5: 356
	//*  83  212:iload           7
	//*  84  214:aload           16
	//*  85  216:getfield        #171 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//*  86  219:iadd            
	//*  87  220:istore_3        
	//*  88  221:iload_2         
	//*  89  222:istore          6
	//*  90  224:aload_0         
	//*  91  225:iload           5
	//*  92  227:invokevirtual   #175 <Method boolean hasDividerBeforeChildAt(int)>
	//*  93  230:ifeq            239
	//*  94  233:iload_2         
	//*  95  234:iload           4
	//*  96  236:iadd            
	//*  97  237:istore          6
	//*  98  239:iload           6
	//*  99  241:aload           16
	//* 100  243:getfield        #178 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//* 101  246:iadd            
	//* 102  247:istore_2        
	//* 103  248:aload_0         
	//* 104  249:aload           15
	//* 105  251:iload_3         
	//* 106  252:iload_2         
	//* 107  253:iload           13
	//* 108  255:iload           14
	//* 109  257:invokespecial   #180 <Method void setChildFrame(View, int, int, int, int)>
	//* 110  260:iload_2         
	//* 111  261:aload           16
	//* 112  263:getfield        #183 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 113  266:iload           14
	//* 114  268:iadd            
	//* 115  269:iadd            
	//* 116  270:istore_3        
	//* 117  271:iload           5
	//* 118  273:iconst_1        
	//* 119  274:iadd            
	//* 120  275:istore          5
	//* 121  277:iload_3         
	//* 122  278:istore_2        
	//* 123  279:goto            94
	//* 124  282:aload_0         
	//* 125  283:invokevirtual   #110 <Method int getPaddingTop()>
	//* 126  286:iload           5
	//* 127  288:iadd            
	//* 128  289:iload_3         
	//* 129  290:isub            
	//* 130  291:iload_2         
	//* 131  292:isub            
	//* 132  293:istore_2        
	//* 133  294:goto            77
	//* 134  297:aload_0         
	//* 135  298:invokevirtual   #110 <Method int getPaddingTop()>
	//* 136  301:iload           5
	//* 137  303:iload_3         
	//* 138  304:isub            
	//* 139  305:iload_2         
	//* 140  306:isub            
	//* 141  307:iconst_2        
	//* 142  308:idiv            
	//* 143  309:iadd            
	//* 144  310:istore_2        
	//* 145  311:goto            77
			k = ((Drawable) (obj)).getIntrinsicHeight();
	//  146  314:aload           15
	//  147  316:invokevirtual   #188 <Method int Drawable.getIntrinsicHeight()>
	//  148  319:istore          4
_L10:
		for(l = 0; l >= j2;)
			break MISSING_BLOCK_LABEL_374;

		obj = ((Object) (getChildAt(l)));
		j = i;
		if(obj == null) goto _L5; else goto _L4
_L4:
		j = i;
		if(((View) (obj)).getVisibility() == 8) goto _L5; else goto _L6
_L6:
		l2 = ((View) (obj)).getMeasuredWidth();
		i3 = ((View) (obj)).getMeasuredHeight();
		layoutparams = (LinearLayoutCompat.LayoutParams)((View) (obj)).getLayoutParams();
		i1 = layoutparams.gravity;
		j = i1;
		if(i1 < 0)
			j = k2 & 0x800007;
		GravityCompat.getAbsoluteGravity(j, ViewCompat.getLayoutDirection(((View) (this)))) & 7;
		JVM INSTR lookupswitch 2: default 212
	//	               1: 324
	//	               5: 356;
		   goto _L7 _L8 _L9
_L7:
		j = j1 + layoutparams.leftMargin;
_L12:
		i1 = i;
		if(hasDividerBeforeChildAt(l))
			i1 = i + k;
		i = i1 + layoutparams.topMargin;
		setChildFrame(((View) (obj)), j, i, l2, i3);
		j = i + (layoutparams.bottomMargin + i3);
_L5:
		l++;
		i = j;
		  goto _L10
_L3:
		i = (getPaddingTop() + l) - j - i;
		  goto _L11
_L2:
		i = getPaddingTop() + (l - j - i) / 2;
		  goto _L11
	//* 149  321:goto            91
_L8:
		j = ((k1 - j1 - i2 - l2) / 2 + j1 + layoutparams.leftMargin) - layoutparams.rightMargin;
	//  150  324:iload           8
	//  151  326:iload           7
	//  152  328:isub            
	//  153  329:iload           10
	//  154  331:isub            
	//  155  332:iload           13
	//  156  334:isub            
	//  157  335:iconst_2        
	//  158  336:idiv            
	//  159  337:iload           7
	//  160  339:iadd            
	//  161  340:aload           16
	//  162  342:getfield        #171 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  163  345:iadd            
	//  164  346:aload           16
	//  165  348:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  166  351:isub            
	//  167  352:istore_3        
		  goto _L12
	//* 168  353:goto            221
_L9:
		j = k1 - l1 - l2 - layoutparams.rightMargin;
	//  169  356:iload           8
	//  170  358:iload           9
	//  171  360:isub            
	//  172  361:iload           13
	//  173  363:isub            
	//  174  364:aload           16
	//  175  366:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  176  369:isub            
	//  177  370:istore_3        
		  goto _L12
	//* 178  371:goto            221
	//  179  374:return          
		  goto _L10
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
