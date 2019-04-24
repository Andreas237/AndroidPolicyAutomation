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
		View view = null;
	//    0    0:aconst_null     
	//    1    1:astore          14
		View view2 = null;
	//    2    3:aconst_null     
	//    3    4:astore          15
		int k2 = getChildCount();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #83  <Method int getChildCount()>
	//    6   10:istore          10
		int k = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		View view4 = null;
	//    9   14:aconst_null     
	//   10   15:astore          17
		while(k < k2) 
	//*  11   17:iload_3         
	//*  12   18:iload           10
	//*  13   20:icmpge          160
		{
			View view3 = getChildAt(k);
	//   14   23:aload_0         
	//   15   24:iload_3         
	//   16   25:invokevirtual   #35  <Method View getChildAt(int)>
	//   17   28:astore          16
			if(view3.getVisibility() == 8)
	//*  18   30:aload           16
	//*  19   32:invokevirtual   #40  <Method int View.getVisibility()>
	//*  20   35:bipush          8
	//*  21   37:icmpne          71
			{
				view3 = view2;
	//   22   40:aload           15
	//   23   42:astore          16
				view2 = view;
	//   24   44:aload           14
	//   25   46:astore          15
				view = view3;
	//   26   48:aload           16
	//   27   50:astore          14
			} else
	//*  28   52:iload_3         
	//*  29   53:iconst_1        
	//*  30   54:iadd            
	//*  31   55:istore_3        
	//*  32   56:aload           15
	//*  33   58:astore          16
	//*  34   60:aload           14
	//*  35   62:astore          15
	//*  36   64:aload           16
	//*  37   66:astore          14
	//*  38   68:goto            17
			{
				int l = view3.getId();
	//   39   71:aload           16
	//   40   73:invokevirtual   #86  <Method int View.getId()>
	//   41   76:istore          4
				if(l == android.support.v7.appcompat.R.id.topPanel)
	//*  42   78:iload           4
	//*  43   80:getstatic       #91  <Field int android.support.v7.appcompat.R$id.topPanel>
	//*  44   83:icmpne          97
				{
					view = view2;
	//   45   86:aload           15
	//   46   88:astore          14
					view2 = view3;
	//   47   90:aload           16
	//   48   92:astore          15
				} else
	//*  49   94:goto            52
				if(l == android.support.v7.appcompat.R.id.buttonPanel)
	//*  50   97:iload           4
	//*  51   99:getstatic       #94  <Field int android.support.v7.appcompat.R$id.buttonPanel>
	//*  52  102:icmpne          116
				{
					view2 = view;
	//   53  105:aload           14
	//   54  107:astore          15
					view = view3;
	//   55  109:aload           16
	//   56  111:astore          14
				} else
	//*  57  113:goto            52
				if(l == android.support.v7.appcompat.R.id.contentPanel || l == android.support.v7.appcompat.R.id.customPanel)
	//*  58  116:iload           4
	//*  59  118:getstatic       #97  <Field int android.support.v7.appcompat.R$id.contentPanel>
	//*  60  121:icmpeq          132
	//*  61  124:iload           4
	//*  62  126:getstatic       #100 <Field int android.support.v7.appcompat.R$id.customPanel>
	//*  63  129:icmpne          158
				{
					if(view4 != null)
	//*  64  132:aload           17
	//*  65  134:ifnull          139
						return false;
	//   66  137:iconst_0        
	//   67  138:ireturn         
					View view5 = view;
	//   68  139:aload           14
	//   69  141:astore          18
					view4 = view3;
	//   70  143:aload           16
	//   71  145:astore          17
					view = view2;
	//   72  147:aload           15
	//   73  149:astore          14
					view2 = view5;
	//   74  151:aload           18
	//   75  153:astore          15
				} else
	//*  76  155:goto            52
				{
					return false;
	//   77  158:iconst_0        
	//   78  159:ireturn         
				}
			}
			k++;
			view3 = view2;
			view2 = view;
			view = view3;
		}
		int i3 = android.view.View.MeasureSpec.getMode(j);
	//   79  160:iload_2         
	//   80  161:invokestatic    #104 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   81  164:istore          12
		int j2 = android.view.View.MeasureSpec.getSize(j);
	//   82  166:iload_2         
	//   83  167:invokestatic    #107 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   84  170:istore          9
		int l2 = android.view.View.MeasureSpec.getMode(i);
	//   85  172:iload_1         
	//   86  173:invokestatic    #104 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   87  176:istore          11
		int j1 = 0;
	//   88  178:iconst_0        
	//   89  179:istore          5
		k = getPaddingTop();
	//   90  181:aload_0         
	//   91  182:invokevirtual   #110 <Method int getPaddingTop()>
	//   92  185:istore_3        
		k = getPaddingBottom() + k;
	//   93  186:aload_0         
	//   94  187:invokevirtual   #113 <Method int getPaddingBottom()>
	//   95  190:iload_3         
	//   96  191:iadd            
	//   97  192:istore_3        
		int i1 = k;
	//   98  193:iload_3         
	//   99  194:istore          4
		if(view != null)
	//* 100  196:aload           14
	//* 101  198:ifnull          228
		{
			view.measure(i, 0);
	//  102  201:aload           14
	//  103  203:iload_1         
	//  104  204:iconst_0        
	//  105  205:invokevirtual   #116 <Method void View.measure(int, int)>
			i1 = k + view.getMeasuredHeight();
	//  106  208:iload_3         
	//  107  209:aload           14
	//  108  211:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//  109  214:iadd            
	//  110  215:istore          4
			j1 = View.combineMeasuredStates(0, view.getMeasuredState());
	//  111  217:iconst_0        
	//  112  218:aload           14
	//  113  220:invokevirtual   #119 <Method int View.getMeasuredState()>
	//  114  223:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//  115  226:istore          5
		}
		k = 0;
	//  116  228:iconst_0        
	//  117  229:istore_3        
		int k1;
		int i2;
		if(view2 != null)
	//* 118  230:aload           15
	//* 119  232:ifnull          615
		{
			view2.measure(i, 0);
	//  120  235:aload           15
	//  121  237:iload_1         
	//  122  238:iconst_0        
	//  123  239:invokevirtual   #116 <Method void View.measure(int, int)>
			k = resolveMinimumHeight(view2);
	//  124  242:aload           15
	//  125  244:invokestatic    #75  <Method int resolveMinimumHeight(View)>
	//  126  247:istore_3        
			k1 = view2.getMeasuredHeight();
	//  127  248:aload           15
	//  128  250:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//  129  253:istore          6
			i1 += k;
	//  130  255:iload           4
	//  131  257:iload_3         
	//  132  258:iadd            
	//  133  259:istore          4
			j1 = View.combineMeasuredStates(j1, view2.getMeasuredState());
	//  134  261:iload           5
	//  135  263:aload           15
	//  136  265:invokevirtual   #119 <Method int View.getMeasuredState()>
	//  137  268:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//  138  271:istore          5
			k1 -= k;
	//  139  273:iload           6
	//  140  275:iload_3         
	//  141  276:isub            
	//  142  277:istore          6
		} else
	//* 143  279:aload           17
	//* 144  281:ifnull          609
	//* 145  284:iload           12
	//* 146  286:ifne            533
	//* 147  289:iconst_0        
	//* 148  290:istore          7
	//* 149  292:aload           17
	//* 150  294:iload_1         
	//* 151  295:iload           7
	//* 152  297:invokevirtual   #116 <Method void View.measure(int, int)>
	//* 153  300:aload           17
	//* 154  302:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//* 155  305:istore          8
	//* 156  307:iload           4
	//* 157  309:iload           8
	//* 158  311:iadd            
	//* 159  312:istore          4
	//* 160  314:iload           5
	//* 161  316:aload           17
	//* 162  318:invokevirtual   #119 <Method int View.getMeasuredState()>
	//* 163  321:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//* 164  324:istore          5
	//* 165  326:iload           9
	//* 166  328:iload           4
	//* 167  330:isub            
	//* 168  331:istore          9
	//* 169  333:aload           15
	//* 170  335:ifnull          599
	//* 171  338:iload           9
	//* 172  340:iload           6
	//* 173  342:invokestatic    #127 <Method int Math.min(int, int)>
	//* 174  345:istore          13
	//* 175  347:iload           9
	//* 176  349:istore          6
	//* 177  351:iload_3         
	//* 178  352:istore          7
	//* 179  354:iload           13
	//* 180  356:ifle            372
	//* 181  359:iload           9
	//* 182  361:iload           13
	//* 183  363:isub            
	//* 184  364:istore          6
	//* 185  366:iload_3         
	//* 186  367:iload           13
	//* 187  369:iadd            
	//* 188  370:istore          7
	//* 189  372:aload           15
	//* 190  374:iload_1         
	//* 191  375:iload           7
	//* 192  377:ldc1            #25  <Int 0x40000000>
	//* 193  379:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 194  382:invokevirtual   #116 <Method void View.measure(int, int)>
	//* 195  385:aload           15
	//* 196  387:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//* 197  390:istore          7
	//* 198  392:iload           5
	//* 199  394:aload           15
	//* 200  396:invokevirtual   #119 <Method int View.getMeasuredState()>
	//* 201  399:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//* 202  402:istore          5
	//* 203  404:iload           7
	//* 204  406:iload           4
	//* 205  408:iload_3         
	//* 206  409:isub            
	//* 207  410:iadd            
	//* 208  411:istore_3        
	//* 209  412:iload           6
	//* 210  414:istore          9
	//* 211  416:iload           5
	//* 212  418:istore          4
	//* 213  420:aload           17
	//* 214  422:ifnull          596
	//* 215  425:iload           9
	//* 216  427:ifle            596
	//* 217  430:aload           17
	//* 218  432:iload_1         
	//* 219  433:iload           9
	//* 220  435:iload           8
	//* 221  437:iadd            
	//* 222  438:iload           12
	//* 223  440:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 224  443:invokevirtual   #116 <Method void View.measure(int, int)>
	//* 225  446:aload           17
	//* 226  448:invokevirtual   #56  <Method int View.getMeasuredHeight()>
	//* 227  451:istore          5
	//* 228  453:iload           4
	//* 229  455:aload           17
	//* 230  457:invokevirtual   #119 <Method int View.getMeasuredState()>
	//* 231  460:invokestatic    #122 <Method int View.combineMeasuredStates(int, int)>
	//* 232  463:istore          4
	//* 233  465:iload_3         
	//* 234  466:iload           8
	//* 235  468:isub            
	//* 236  469:iload           5
	//* 237  471:iadd            
	//* 238  472:istore_3        
	//* 239  473:iconst_0        
	//* 240  474:istore          6
	//* 241  476:iconst_0        
	//* 242  477:istore          5
	//* 243  479:iload           5
	//* 244  481:iload           10
	//* 245  483:icmpge          552
	//* 246  486:aload_0         
	//* 247  487:iload           5
	//* 248  489:invokevirtual   #35  <Method View getChildAt(int)>
	//* 249  492:astore          14
	//* 250  494:iload           6
	//* 251  496:istore          7
	//* 252  498:aload           14
	//* 253  500:invokevirtual   #40  <Method int View.getVisibility()>
	//* 254  503:bipush          8
	//* 255  505:icmpeq          520
	//* 256  508:iload           6
	//* 257  510:aload           14
	//* 258  512:invokevirtual   #128 <Method int View.getMeasuredWidth()>
	//* 259  515:invokestatic    #131 <Method int Math.max(int, int)>
	//* 260  518:istore          7
	//* 261  520:iload           5
	//* 262  522:iconst_1        
	//* 263  523:iadd            
	//* 264  524:istore          5
	//* 265  526:iload           7
	//* 266  528:istore          6
	//* 267  530:goto            479
	//* 268  533:iconst_0        
	//* 269  534:iload           9
	//* 270  536:iload           4
	//* 271  538:isub            
	//* 272  539:invokestatic    #131 <Method int Math.max(int, int)>
	//* 273  542:iload           12
	//* 274  544:invokestatic    #31  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 275  547:istore          7
	//* 276  549:goto            292
	//* 277  552:aload_0         
	//* 278  553:iload           6
	//* 279  555:aload_0         
	//* 280  556:invokevirtual   #134 <Method int getPaddingLeft()>
	//* 281  559:aload_0         
	//* 282  560:invokevirtual   #137 <Method int getPaddingRight()>
	//* 283  563:iadd            
	//* 284  564:iadd            
	//* 285  565:iload_1         
	//* 286  566:iload           4
	//* 287  568:invokestatic    #141 <Method int View.resolveSizeAndState(int, int, int)>
	//* 288  571:iload_3         
	//* 289  572:iload_2         
	//* 290  573:iconst_0        
	//* 291  574:invokestatic    #141 <Method int View.resolveSizeAndState(int, int, int)>
	//* 292  577:invokevirtual   #144 <Method void setMeasuredDimension(int, int)>
	//* 293  580:iload           11
	//* 294  582:ldc1            #25  <Int 0x40000000>
	//* 295  584:icmpeq          594
	//* 296  587:aload_0         
	//* 297  588:iload           10
	//* 298  590:iload_2         
	//* 299  591:invokespecial   #146 <Method void forceUniformWidth(int, int)>
	//* 300  594:iconst_1        
	//* 301  595:ireturn         
	//* 302  596:goto            473
	//* 303  599:iload           4
	//* 304  601:istore_3        
	//* 305  602:iload           5
	//* 306  604:istore          4
	//* 307  606:goto            420
	//* 308  609:iconst_0        
	//* 309  610:istore          8
	//* 310  612:goto            326
		{
			k1 = 0;
	//  311  615:iconst_0        
	//  312  616:istore          6
		}
		if(view4 != null)
		{
			int l1;
			int j3;
			View view1;
			if(i3 == 0)
				l1 = 0;
			else
				l1 = android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, j2 - i1), i3);
			view4.measure(i, l1);
			i2 = view4.getMeasuredHeight();
			i1 += i2;
			j1 = View.combineMeasuredStates(j1, view4.getMeasuredState());
		} else
		{
			i2 = 0;
		}
		j2 -= i1;
		if(view2 != null)
		{
			j3 = Math.min(j2, k1);
			k1 = j2;
			l1 = k;
			if(j3 > 0)
			{
				k1 = j2 - j3;
				l1 = k + j3;
			}
			view2.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
			l1 = view2.getMeasuredHeight();
			j1 = View.combineMeasuredStates(j1, view2.getMeasuredState());
			k = l1 + (i1 - k);
			j2 = k1;
			i1 = j1;
		} else
		{
			k = i1;
			i1 = j1;
		}
		if(view4 != null && j2 > 0)
		{
			view4.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(j2 + i2, i3));
			j1 = view4.getMeasuredHeight();
			i1 = View.combineMeasuredStates(i1, view4.getMeasuredState());
			k = (k - i2) + j1;
		}
		k1 = 0;
		for(j1 = 0; j1 < k2;)
		{
			view1 = getChildAt(j1);
			l1 = k1;
			if(view1.getVisibility() != 8)
				l1 = Math.max(k1, view1.getMeasuredWidth());
			j1++;
			k1 = l1;
		}

		setMeasuredDimension(View.resolveSizeAndState(k1 + (getPaddingLeft() + getPaddingRight()), i, i1), View.resolveSizeAndState(k, j, 0));
		if(l2 != 0x40000000)
			forceUniformWidth(k2, j);
		return true;
	//* 313  618:goto            279
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
	//	               16: 292
	//	               80: 277;
	//   25   46:lookupswitch    2: default 72
	//	               16: 292
	//	               80: 277
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
	//*  33   85:ifnonnull       313
			k = 0;
	//   34   88:iconst_0        
	//   35   89:istore          4
		else
	//*  36   91:iconst_0        
	//*  37   92:istore          5
	//*  38   94:iload           5
	//*  39   96:iload           11
	//*  40   98:icmpge          373
	//*  41  101:aload_0         
	//*  42  102:iload           5
	//*  43  104:invokevirtual   #35  <Method View getChildAt(int)>
	//*  44  107:astore          15
	//*  45  109:iload_2         
	//*  46  110:istore_3        
	//*  47  111:aload           15
	//*  48  113:ifnull          266
	//*  49  116:iload_2         
	//*  50  117:istore_3        
	//*  51  118:aload           15
	//*  52  120:invokevirtual   #40  <Method int View.getVisibility()>
	//*  53  123:bipush          8
	//*  54  125:icmpeq          266
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
	//	               1: 323
	//	               5: 355
	//*  83  212:iload           7
	//*  84  214:aload           16
	//*  85  216:getfield        #171 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//*  86  219:iadd            
	//*  87  220:istore_3        
	//*  88  221:aload_0         
	//*  89  222:iload           5
	//*  90  224:invokevirtual   #175 <Method boolean hasDividerBeforeChildAt(int)>
	//*  91  227:ifeq            374
	//*  92  230:iload_2         
	//*  93  231:iload           4
	//*  94  233:iadd            
	//*  95  234:istore_2        
	//*  96  235:aload           16
	//*  97  237:getfield        #178 <Field int LinearLayoutCompat$LayoutParams.topMargin>
	//*  98  240:iload_2         
	//*  99  241:iadd            
	//* 100  242:istore_2        
	//* 101  243:aload_0         
	//* 102  244:aload           15
	//* 103  246:iload_3         
	//* 104  247:iload_2         
	//* 105  248:iload           13
	//* 106  250:iload           14
	//* 107  252:invokespecial   #180 <Method void setChildFrame(View, int, int, int, int)>
	//* 108  255:iload_2         
	//* 109  256:aload           16
	//* 110  258:getfield        #183 <Field int LinearLayoutCompat$LayoutParams.bottomMargin>
	//* 111  261:iload           14
	//* 112  263:iadd            
	//* 113  264:iadd            
	//* 114  265:istore_3        
	//* 115  266:iload           5
	//* 116  268:iconst_1        
	//* 117  269:iadd            
	//* 118  270:istore          5
	//* 119  272:iload_3         
	//* 120  273:istore_2        
	//* 121  274:goto            94
	//* 122  277:aload_0         
	//* 123  278:invokevirtual   #110 <Method int getPaddingTop()>
	//* 124  281:iload           5
	//* 125  283:iadd            
	//* 126  284:iload_3         
	//* 127  285:isub            
	//* 128  286:iload_2         
	//* 129  287:isub            
	//* 130  288:istore_2        
	//* 131  289:goto            77
	//* 132  292:aload_0         
	//* 133  293:invokevirtual   #110 <Method int getPaddingTop()>
	//* 134  296:istore          4
	//* 135  298:iload           5
	//* 136  300:iload_3         
	//* 137  301:isub            
	//* 138  302:iload_2         
	//* 139  303:isub            
	//* 140  304:iconst_2        
	//* 141  305:idiv            
	//* 142  306:iload           4
	//* 143  308:iadd            
	//* 144  309:istore_2        
	//* 145  310:goto            77
			k = ((Drawable) (obj)).getIntrinsicHeight();
	//  146  313:aload           15
	//  147  315:invokevirtual   #188 <Method int Drawable.getIntrinsicHeight()>
	//  148  318:istore          4
_L10:
		for(l = 0; l >= j2;)
			break MISSING_BLOCK_LABEL_373;

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
	//	               1: 323
	//	               5: 355;
		   goto _L7 _L8 _L9
_L7:
		j = j1 + layoutparams.leftMargin;
_L12:
		if(hasDividerBeforeChildAt(l))
			i += k;
		i = layoutparams.topMargin + i;
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
		k = getPaddingTop();
		i = (l - j - i) / 2 + k;
		  goto _L11
	//* 149  320:goto            91
_L8:
		j = ((k1 - j1 - i2 - l2) / 2 + j1 + layoutparams.leftMargin) - layoutparams.rightMargin;
	//  150  323:iload           8
	//  151  325:iload           7
	//  152  327:isub            
	//  153  328:iload           10
	//  154  330:isub            
	//  155  331:iload           13
	//  156  333:isub            
	//  157  334:iconst_2        
	//  158  335:idiv            
	//  159  336:iload           7
	//  160  338:iadd            
	//  161  339:aload           16
	//  162  341:getfield        #171 <Field int LinearLayoutCompat$LayoutParams.leftMargin>
	//  163  344:iadd            
	//  164  345:aload           16
	//  165  347:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  166  350:isub            
	//  167  351:istore_3        
		  goto _L12
	//* 168  352:goto            221
_L9:
		j = k1 - l1 - l2 - layoutparams.rightMargin;
	//  169  355:iload           8
	//  170  357:iload           9
	//  171  359:isub            
	//  172  360:iload           13
	//  173  362:isub            
	//  174  363:aload           16
	//  175  365:getfield        #191 <Field int LinearLayoutCompat$LayoutParams.rightMargin>
	//  176  368:isub            
	//  177  369:istore_3        
		  goto _L12
	//* 178  370:goto            221
	//  179  373:return          
		  goto _L10
	//* 180  374:goto            235
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
