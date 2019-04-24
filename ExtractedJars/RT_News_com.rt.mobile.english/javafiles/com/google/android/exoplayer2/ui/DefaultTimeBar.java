// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

// Referenced classes of package com.google.android.exoplayer2.ui:
//			TimeBar

public class DefaultTimeBar extends View
	implements TimeBar
{

	public DefaultTimeBar(Context context, AttributeSet attributeset)
	{
		int j;
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #92  <Method void View(Context, AttributeSet)>
		seekBounds = new Rect();
	//    4    6:aload_0         
	//    5    7:new             #94  <Class Rect>
	//    6   10:dup             
	//    7   11:invokespecial   #97  <Method void Rect()>
	//    8   14:putfield        #99  <Field Rect seekBounds>
		progressBar = new Rect();
	//    9   17:aload_0         
	//   10   18:new             #94  <Class Rect>
	//   11   21:dup             
	//   12   22:invokespecial   #97  <Method void Rect()>
	//   13   25:putfield        #101 <Field Rect progressBar>
		bufferedBar = new Rect();
	//   14   28:aload_0         
	//   15   29:new             #94  <Class Rect>
	//   16   32:dup             
	//   17   33:invokespecial   #97  <Method void Rect()>
	//   18   36:putfield        #103 <Field Rect bufferedBar>
		scrubberBar = new Rect();
	//   19   39:aload_0         
	//   20   40:new             #94  <Class Rect>
	//   21   43:dup             
	//   22   44:invokespecial   #97  <Method void Rect()>
	//   23   47:putfield        #105 <Field Rect scrubberBar>
		playedPaint = new Paint();
	//   24   50:aload_0         
	//   25   51:new             #107 <Class Paint>
	//   26   54:dup             
	//   27   55:invokespecial   #108 <Method void Paint()>
	//   28   58:putfield        #110 <Field Paint playedPaint>
		bufferedPaint = new Paint();
	//   29   61:aload_0         
	//   30   62:new             #107 <Class Paint>
	//   31   65:dup             
	//   32   66:invokespecial   #108 <Method void Paint()>
	//   33   69:putfield        #112 <Field Paint bufferedPaint>
		unplayedPaint = new Paint();
	//   34   72:aload_0         
	//   35   73:new             #107 <Class Paint>
	//   36   76:dup             
	//   37   77:invokespecial   #108 <Method void Paint()>
	//   38   80:putfield        #114 <Field Paint unplayedPaint>
		adMarkerPaint = new Paint();
	//   39   83:aload_0         
	//   40   84:new             #107 <Class Paint>
	//   41   87:dup             
	//   42   88:invokespecial   #108 <Method void Paint()>
	//   43   91:putfield        #116 <Field Paint adMarkerPaint>
		playedAdMarkerPaint = new Paint();
	//   44   94:aload_0         
	//   45   95:new             #107 <Class Paint>
	//   46   98:dup             
	//   47   99:invokespecial   #108 <Method void Paint()>
	//   48  102:putfield        #118 <Field Paint playedAdMarkerPaint>
		scrubberPaint = new Paint();
	//   49  105:aload_0         
	//   50  106:new             #107 <Class Paint>
	//   51  109:dup             
	//   52  110:invokespecial   #108 <Method void Paint()>
	//   53  113:putfield        #120 <Field Paint scrubberPaint>
		scrubberPaint.setAntiAlias(true);
	//   54  116:aload_0         
	//   55  117:getfield        #120 <Field Paint scrubberPaint>
	//   56  120:iconst_1        
	//   57  121:invokevirtual   #124 <Method void Paint.setAntiAlias(boolean)>
		listeners = new CopyOnWriteArraySet();
	//   58  124:aload_0         
	//   59  125:new             #126 <Class CopyOnWriteArraySet>
	//   60  128:dup             
	//   61  129:invokespecial   #127 <Method void CopyOnWriteArraySet()>
	//   62  132:putfield        #129 <Field CopyOnWriteArraySet listeners>
		locationOnScreen = new int[2];
	//   63  135:aload_0         
	//   64  136:iconst_2        
	//   65  137:newarray        int[]
	//   66  139:putfield        #131 <Field int[] locationOnScreen>
		touchPosition = new Point();
	//   67  142:aload_0         
	//   68  143:new             #133 <Class Point>
	//   69  146:dup             
	//   70  147:invokespecial   #134 <Method void Point()>
	//   71  150:putfield        #136 <Field Point touchPosition>
		DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
	//   72  153:aload_1         
	//   73  154:invokevirtual   #142 <Method Resources Context.getResources()>
	//   74  157:invokevirtual   #148 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   75  160:astore          10
		fineScrubYThreshold = dpToPx(displaymetrics, -50);
	//   76  162:aload_0         
	//   77  163:aload           10
	//   78  165:bipush          -50
	//   79  167:invokestatic    #152 <Method int dpToPx(DisplayMetrics, int)>
	//   80  170:putfield        #154 <Field int fineScrubYThreshold>
		k = dpToPx(displaymetrics, 4);
	//   81  173:aload           10
	//   82  175:iconst_4        
	//   83  176:invokestatic    #152 <Method int dpToPx(DisplayMetrics, int)>
	//   84  179:istore          5
		j = dpToPx(displaymetrics, 26);
	//   85  181:aload           10
	//   86  183:bipush          26
	//   87  185:invokestatic    #152 <Method int dpToPx(DisplayMetrics, int)>
	//   88  188:istore          4
		l = dpToPx(displaymetrics, 4);
	//   89  190:aload           10
	//   90  192:iconst_4        
	//   91  193:invokestatic    #152 <Method int dpToPx(DisplayMetrics, int)>
	//   92  196:istore          6
		i1 = dpToPx(displaymetrics, 12);
	//   93  198:aload           10
	//   94  200:bipush          12
	//   95  202:invokestatic    #152 <Method int dpToPx(DisplayMetrics, int)>
	//   96  205:istore          7
		j1 = dpToPx(displaymetrics, 0);
	//   97  207:aload           10
	//   98  209:iconst_0        
	//   99  210:invokestatic    #152 <Method int dpToPx(DisplayMetrics, int)>
	//  100  213:istore          8
		k1 = dpToPx(displaymetrics, 16);
	//  101  215:aload           10
	//  102  217:bipush          16
	//  103  219:invokestatic    #152 <Method int dpToPx(DisplayMetrics, int)>
	//  104  222:istore          9
		if(attributeset == null)
			break MISSING_BLOCK_LABEL_502;
	//  105  224:aload_2         
	//  106  225:ifnull          502
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, R.styleable.DefaultTimeBar, 0, 0)));
	//  107  228:aload_1         
	//  108  229:invokevirtual   #158 <Method android.content.res.Resources$Theme Context.getTheme()>
	//  109  232:aload_2         
	//  110  233:getstatic       #163 <Field int[] R$styleable.DefaultTimeBar>
	//  111  236:iconst_0        
	//  112  237:iconst_0        
	//  113  238:invokevirtual   #169 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//  114  241:astore_1        
		scrubberDrawable = ((TypedArray) (context)).getDrawable(R.styleable.DefaultTimeBar_scrubber_drawable);
	//  115  242:aload_0         
	//  116  243:aload_1         
	//  117  244:getstatic       #172 <Field int R$styleable.DefaultTimeBar_scrubber_drawable>
	//  118  247:invokevirtual   #178 <Method Drawable TypedArray.getDrawable(int)>
	//  119  250:putfield        #180 <Field Drawable scrubberDrawable>
		int i = j;
	//  120  253:iload           4
	//  121  255:istore_3        
		if(scrubberDrawable != null)
	//* 122  256:aload_0         
	//* 123  257:getfield        #180 <Field Drawable scrubberDrawable>
	//* 124  260:ifnull          285
		{
			setDrawableLayoutDirection(scrubberDrawable);
	//  125  263:aload_0         
	//  126  264:aload_0         
	//  127  265:getfield        #180 <Field Drawable scrubberDrawable>
	//  128  268:invokespecial   #184 <Method boolean setDrawableLayoutDirection(Drawable)>
	//  129  271:pop             
			i = Math.max(scrubberDrawable.getMinimumHeight(), j);
	//  130  272:aload_0         
	//  131  273:getfield        #180 <Field Drawable scrubberDrawable>
	//  132  276:invokevirtual   #190 <Method int Drawable.getMinimumHeight()>
	//  133  279:iload           4
	//  134  281:invokestatic    #196 <Method int Math.max(int, int)>
	//  135  284:istore_3        
		}
		barHeight = ((TypedArray) (context)).getDimensionPixelSize(R.styleable.DefaultTimeBar_bar_height, k);
	//  136  285:aload_0         
	//  137  286:aload_1         
	//  138  287:getstatic       #199 <Field int R$styleable.DefaultTimeBar_bar_height>
	//  139  290:iload           5
	//  140  292:invokevirtual   #202 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  141  295:putfield        #204 <Field int barHeight>
		touchTargetHeight = ((TypedArray) (context)).getDimensionPixelSize(R.styleable.DefaultTimeBar_touch_target_height, i);
	//  142  298:aload_0         
	//  143  299:aload_1         
	//  144  300:getstatic       #207 <Field int R$styleable.DefaultTimeBar_touch_target_height>
	//  145  303:iload_3         
	//  146  304:invokevirtual   #202 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  147  307:putfield        #209 <Field int touchTargetHeight>
		adMarkerWidth = ((TypedArray) (context)).getDimensionPixelSize(R.styleable.DefaultTimeBar_ad_marker_width, l);
	//  148  310:aload_0         
	//  149  311:aload_1         
	//  150  312:getstatic       #212 <Field int R$styleable.DefaultTimeBar_ad_marker_width>
	//  151  315:iload           6
	//  152  317:invokevirtual   #202 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  153  320:putfield        #214 <Field int adMarkerWidth>
		scrubberEnabledSize = ((TypedArray) (context)).getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_enabled_size, i1);
	//  154  323:aload_0         
	//  155  324:aload_1         
	//  156  325:getstatic       #217 <Field int R$styleable.DefaultTimeBar_scrubber_enabled_size>
	//  157  328:iload           7
	//  158  330:invokevirtual   #202 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  159  333:putfield        #219 <Field int scrubberEnabledSize>
		scrubberDisabledSize = ((TypedArray) (context)).getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_disabled_size, j1);
	//  160  336:aload_0         
	//  161  337:aload_1         
	//  162  338:getstatic       #222 <Field int R$styleable.DefaultTimeBar_scrubber_disabled_size>
	//  163  341:iload           8
	//  164  343:invokevirtual   #202 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  165  346:putfield        #224 <Field int scrubberDisabledSize>
		scrubberDraggedSize = ((TypedArray) (context)).getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_dragged_size, k1);
	//  166  349:aload_0         
	//  167  350:aload_1         
	//  168  351:getstatic       #227 <Field int R$styleable.DefaultTimeBar_scrubber_dragged_size>
	//  169  354:iload           9
	//  170  356:invokevirtual   #202 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//  171  359:putfield        #229 <Field int scrubberDraggedSize>
		i = ((TypedArray) (context)).getInt(R.styleable.DefaultTimeBar_played_color, -1);
	//  172  362:aload_1         
	//  173  363:getstatic       #232 <Field int R$styleable.DefaultTimeBar_played_color>
	//  174  366:iconst_m1       
	//  175  367:invokevirtual   #235 <Method int TypedArray.getInt(int, int)>
	//  176  370:istore_3        
		j = ((TypedArray) (context)).getInt(R.styleable.DefaultTimeBar_scrubber_color, getDefaultScrubberColor(i));
	//  177  371:aload_1         
	//  178  372:getstatic       #238 <Field int R$styleable.DefaultTimeBar_scrubber_color>
	//  179  375:iload_3         
	//  180  376:invokestatic    #242 <Method int getDefaultScrubberColor(int)>
	//  181  379:invokevirtual   #235 <Method int TypedArray.getInt(int, int)>
	//  182  382:istore          4
		k = ((TypedArray) (context)).getInt(R.styleable.DefaultTimeBar_buffered_color, getDefaultBufferedColor(i));
	//  183  384:aload_1         
	//  184  385:getstatic       #245 <Field int R$styleable.DefaultTimeBar_buffered_color>
	//  185  388:iload_3         
	//  186  389:invokestatic    #248 <Method int getDefaultBufferedColor(int)>
	//  187  392:invokevirtual   #235 <Method int TypedArray.getInt(int, int)>
	//  188  395:istore          5
		l = ((TypedArray) (context)).getInt(R.styleable.DefaultTimeBar_unplayed_color, getDefaultUnplayedColor(i));
	//  189  397:aload_1         
	//  190  398:getstatic       #251 <Field int R$styleable.DefaultTimeBar_unplayed_color>
	//  191  401:iload_3         
	//  192  402:invokestatic    #254 <Method int getDefaultUnplayedColor(int)>
	//  193  405:invokevirtual   #235 <Method int TypedArray.getInt(int, int)>
	//  194  408:istore          6
		i1 = ((TypedArray) (context)).getInt(R.styleable.DefaultTimeBar_ad_marker_color, 0xb2ffff00);
	//  195  410:aload_1         
	//  196  411:getstatic       #257 <Field int R$styleable.DefaultTimeBar_ad_marker_color>
	//  197  414:ldc1            #15  <Int 0xb2ffff00>
	//  198  416:invokevirtual   #235 <Method int TypedArray.getInt(int, int)>
	//  199  419:istore          7
		j1 = ((TypedArray) (context)).getInt(R.styleable.DefaultTimeBar_played_ad_marker_color, getDefaultPlayedAdMarkerColor(i1));
	//  200  421:aload_1         
	//  201  422:getstatic       #260 <Field int R$styleable.DefaultTimeBar_played_ad_marker_color>
	//  202  425:iload           7
	//  203  427:invokestatic    #263 <Method int getDefaultPlayedAdMarkerColor(int)>
	//  204  430:invokevirtual   #235 <Method int TypedArray.getInt(int, int)>
	//  205  433:istore          8
		playedPaint.setColor(i);
	//  206  435:aload_0         
	//  207  436:getfield        #110 <Field Paint playedPaint>
	//  208  439:iload_3         
	//  209  440:invokevirtual   #267 <Method void Paint.setColor(int)>
		scrubberPaint.setColor(j);
	//  210  443:aload_0         
	//  211  444:getfield        #120 <Field Paint scrubberPaint>
	//  212  447:iload           4
	//  213  449:invokevirtual   #267 <Method void Paint.setColor(int)>
		bufferedPaint.setColor(k);
	//  214  452:aload_0         
	//  215  453:getfield        #112 <Field Paint bufferedPaint>
	//  216  456:iload           5
	//  217  458:invokevirtual   #267 <Method void Paint.setColor(int)>
		unplayedPaint.setColor(l);
	//  218  461:aload_0         
	//  219  462:getfield        #114 <Field Paint unplayedPaint>
	//  220  465:iload           6
	//  221  467:invokevirtual   #267 <Method void Paint.setColor(int)>
		adMarkerPaint.setColor(i1);
	//  222  470:aload_0         
	//  223  471:getfield        #116 <Field Paint adMarkerPaint>
	//  224  474:iload           7
	//  225  476:invokevirtual   #267 <Method void Paint.setColor(int)>
		playedAdMarkerPaint.setColor(j1);
	//  226  479:aload_0         
	//  227  480:getfield        #118 <Field Paint playedAdMarkerPaint>
	//  228  483:iload           8
	//  229  485:invokevirtual   #267 <Method void Paint.setColor(int)>
		((TypedArray) (context)).recycle();
	//  230  488:aload_1         
	//  231  489:invokevirtual   #270 <Method void TypedArray.recycle()>
		break MISSING_BLOCK_LABEL_593;
	//  232  492:goto            593
		attributeset;
	//  233  495:astore_2        
		((TypedArray) (context)).recycle();
	//  234  496:aload_1         
	//  235  497:invokevirtual   #270 <Method void TypedArray.recycle()>
		throw attributeset;
	//  236  500:aload_2         
	//  237  501:athrow          
		barHeight = k;
	//  238  502:aload_0         
	//  239  503:iload           5
	//  240  505:putfield        #204 <Field int barHeight>
		touchTargetHeight = j;
	//  241  508:aload_0         
	//  242  509:iload           4
	//  243  511:putfield        #209 <Field int touchTargetHeight>
		adMarkerWidth = l;
	//  244  514:aload_0         
	//  245  515:iload           6
	//  246  517:putfield        #214 <Field int adMarkerWidth>
		scrubberEnabledSize = i1;
	//  247  520:aload_0         
	//  248  521:iload           7
	//  249  523:putfield        #219 <Field int scrubberEnabledSize>
		scrubberDisabledSize = j1;
	//  250  526:aload_0         
	//  251  527:iload           8
	//  252  529:putfield        #224 <Field int scrubberDisabledSize>
		scrubberDraggedSize = k1;
	//  253  532:aload_0         
	//  254  533:iload           9
	//  255  535:putfield        #229 <Field int scrubberDraggedSize>
		playedPaint.setColor(-1);
	//  256  538:aload_0         
	//  257  539:getfield        #110 <Field Paint playedPaint>
	//  258  542:iconst_m1       
	//  259  543:invokevirtual   #267 <Method void Paint.setColor(int)>
		scrubberPaint.setColor(getDefaultScrubberColor(-1));
	//  260  546:aload_0         
	//  261  547:getfield        #120 <Field Paint scrubberPaint>
	//  262  550:iconst_m1       
	//  263  551:invokestatic    #242 <Method int getDefaultScrubberColor(int)>
	//  264  554:invokevirtual   #267 <Method void Paint.setColor(int)>
		bufferedPaint.setColor(getDefaultBufferedColor(-1));
	//  265  557:aload_0         
	//  266  558:getfield        #112 <Field Paint bufferedPaint>
	//  267  561:iconst_m1       
	//  268  562:invokestatic    #248 <Method int getDefaultBufferedColor(int)>
	//  269  565:invokevirtual   #267 <Method void Paint.setColor(int)>
		unplayedPaint.setColor(getDefaultUnplayedColor(-1));
	//  270  568:aload_0         
	//  271  569:getfield        #114 <Field Paint unplayedPaint>
	//  272  572:iconst_m1       
	//  273  573:invokestatic    #254 <Method int getDefaultUnplayedColor(int)>
	//  274  576:invokevirtual   #267 <Method void Paint.setColor(int)>
		adMarkerPaint.setColor(0xb2ffff00);
	//  275  579:aload_0         
	//  276  580:getfield        #116 <Field Paint adMarkerPaint>
	//  277  583:ldc1            #15  <Int 0xb2ffff00>
	//  278  585:invokevirtual   #267 <Method void Paint.setColor(int)>
		scrubberDrawable = null;
	//  279  588:aload_0         
	//  280  589:aconst_null     
	//  281  590:putfield        #180 <Field Drawable scrubberDrawable>
		formatBuilder = new StringBuilder();
	//  282  593:aload_0         
	//  283  594:new             #272 <Class StringBuilder>
	//  284  597:dup             
	//  285  598:invokespecial   #273 <Method void StringBuilder()>
	//  286  601:putfield        #275 <Field StringBuilder formatBuilder>
		formatter = new Formatter(((Appendable) (formatBuilder)), Locale.getDefault());
	//  287  604:aload_0         
	//  288  605:new             #277 <Class Formatter>
	//  289  608:dup             
	//  290  609:aload_0         
	//  291  610:getfield        #275 <Field StringBuilder formatBuilder>
	//  292  613:invokestatic    #283 <Method Locale Locale.getDefault()>
	//  293  616:invokespecial   #286 <Method void Formatter(Appendable, Locale)>
	//  294  619:putfield        #288 <Field Formatter formatter>
		stopScrubbingRunnable = new Runnable() {

			public void run()
			{
				stopScrubbing(false);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field DefaultTimeBar this$0>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #25  <Method void DefaultTimeBar.access$000(DefaultTimeBar, boolean)>
			//    4    8:return          
			}

			final DefaultTimeBar this$0;

			
			{
				this$0 = DefaultTimeBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DefaultTimeBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//  295  622:aload_0         
	//  296  623:new             #8   <Class DefaultTimeBar$1>
	//  297  626:dup             
	//  298  627:aload_0         
	//  299  628:invokespecial   #291 <Method void DefaultTimeBar$1(DefaultTimeBar)>
	//  300  631:putfield        #293 <Field Runnable stopScrubbingRunnable>
		if(scrubberDrawable != null)
	//* 301  634:aload_0         
	//* 302  635:getfield        #180 <Field Drawable scrubberDrawable>
	//* 303  638:ifnull          659
			scrubberPadding = (scrubberDrawable.getMinimumWidth() + 1) / 2;
	//  304  641:aload_0         
	//  305  642:aload_0         
	//  306  643:getfield        #180 <Field Drawable scrubberDrawable>
	//  307  646:invokevirtual   #296 <Method int Drawable.getMinimumWidth()>
	//  308  649:iconst_1        
	//  309  650:iadd            
	//  310  651:iconst_2        
	//  311  652:idiv            
	//  312  653:putfield        #298 <Field int scrubberPadding>
		else
	//* 313  656:goto            685
			scrubberPadding = (Math.max(scrubberDisabledSize, Math.max(scrubberEnabledSize, scrubberDraggedSize)) + 1) / 2;
	//  314  659:aload_0         
	//  315  660:aload_0         
	//  316  661:getfield        #224 <Field int scrubberDisabledSize>
	//  317  664:aload_0         
	//  318  665:getfield        #219 <Field int scrubberEnabledSize>
	//  319  668:aload_0         
	//  320  669:getfield        #229 <Field int scrubberDraggedSize>
	//  321  672:invokestatic    #196 <Method int Math.max(int, int)>
	//  322  675:invokestatic    #196 <Method int Math.max(int, int)>
	//  323  678:iconst_1        
	//  324  679:iadd            
	//  325  680:iconst_2        
	//  326  681:idiv            
	//  327  682:putfield        #298 <Field int scrubberPadding>
		duration = 0x1L;
	//  328  685:aload_0         
	//  329  686:ldc2w           #299 <Long 0x1L>
	//  330  689:putfield        #302 <Field long duration>
		keyTimeIncrement = 0x1L;
	//  331  692:aload_0         
	//  332  693:ldc2w           #299 <Long 0x1L>
	//  333  696:putfield        #304 <Field long keyTimeIncrement>
		keyCountIncrement = 20;
	//  334  699:aload_0         
	//  335  700:bipush          20
	//  336  702:putfield        #306 <Field int keyCountIncrement>
		setFocusable(true);
	//  337  705:aload_0         
	//  338  706:iconst_1        
	//  339  707:invokevirtual   #309 <Method void setFocusable(boolean)>
		if(Util.SDK_INT >= 16)
	//* 340  710:getstatic       #314 <Field int Util.SDK_INT>
	//* 341  713:bipush          16
	//* 342  715:icmplt          722
			maybeSetImportantForAccessibilityV16();
	//  343  718:aload_0         
	//  344  719:invokespecial   #317 <Method void maybeSetImportantForAccessibilityV16()>
		return;
	//  345  722:return          
	}

	private static int dpToPx(DisplayMetrics displaymetrics, int i)
	{
		return (int)((float)i * displaymetrics.density + 0.5F);
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:aload_0         
	//    3    3:getfield        #329 <Field float DisplayMetrics.density>
	//    4    6:fmul            
	//    5    7:ldc2            #330 <Float 0.5F>
	//    6   10:fadd            
	//    7   11:f2i             
	//    8   12:ireturn         
	}

	private void drawPlayhead(Canvas canvas)
	{
		if(duration <= 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #302 <Field long duration>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifgt            10
			return;
	//    5    9:return          
		int k = Util.constrainValue(scrubberBar.right, scrubberBar.left, progressBar.right);
	//    6   10:aload_0         
	//    7   11:getfield        #105 <Field Rect scrubberBar>
	//    8   14:getfield        #335 <Field int Rect.right>
	//    9   17:aload_0         
	//   10   18:getfield        #105 <Field Rect scrubberBar>
	//   11   21:getfield        #338 <Field int Rect.left>
	//   12   24:aload_0         
	//   13   25:getfield        #101 <Field Rect progressBar>
	//   14   28:getfield        #335 <Field int Rect.right>
	//   15   31:invokestatic    #342 <Method int Util.constrainValue(int, int, int)>
	//   16   34:istore_3        
		int l = scrubberBar.centerY();
	//   17   35:aload_0         
	//   18   36:getfield        #105 <Field Rect scrubberBar>
	//   19   39:invokevirtual   #345 <Method int Rect.centerY()>
	//   20   42:istore          4
		if(scrubberDrawable == null)
	//*  21   44:aload_0         
	//*  22   45:getfield        #180 <Field Drawable scrubberDrawable>
	//*  23   48:ifnonnull       116
		{
			int i;
			if(!scrubbing && !isFocused())
	//*  24   51:aload_0         
	//*  25   52:getfield        #347 <Field boolean scrubbing>
	//*  26   55:ifne            91
	//*  27   58:aload_0         
	//*  28   59:invokevirtual   #351 <Method boolean isFocused()>
	//*  29   62:ifeq            68
	//*  30   65:goto            91
			{
				if(isEnabled())
	//*  31   68:aload_0         
	//*  32   69:invokevirtual   #354 <Method boolean isEnabled()>
	//*  33   72:ifeq            83
					i = scrubberEnabledSize;
	//   34   75:aload_0         
	//   35   76:getfield        #219 <Field int scrubberEnabledSize>
	//   36   79:istore_2        
				else
	//*  37   80:goto            96
					i = scrubberDisabledSize;
	//   38   83:aload_0         
	//   39   84:getfield        #224 <Field int scrubberDisabledSize>
	//   40   87:istore_2        
			} else
	//*  41   88:goto            96
			{
				i = scrubberDraggedSize;
	//   42   91:aload_0         
	//   43   92:getfield        #229 <Field int scrubberDraggedSize>
	//   44   95:istore_2        
			}
			i /= 2;
	//   45   96:iload_2         
	//   46   97:iconst_2        
	//   47   98:idiv            
	//   48   99:istore_2        
			canvas.drawCircle(k, l, i, scrubberPaint);
	//   49  100:aload_1         
	//   50  101:iload_3         
	//   51  102:i2f             
	//   52  103:iload           4
	//   53  105:i2f             
	//   54  106:iload_2         
	//   55  107:i2f             
	//   56  108:aload_0         
	//   57  109:getfield        #120 <Field Paint scrubberPaint>
	//   58  112:invokevirtual   #360 <Method void Canvas.drawCircle(float, float, float, Paint)>
			return;
	//   59  115:return          
		} else
		{
			int i1 = scrubberDrawable.getIntrinsicWidth();
	//   60  116:aload_0         
	//   61  117:getfield        #180 <Field Drawable scrubberDrawable>
	//   62  120:invokevirtual   #363 <Method int Drawable.getIntrinsicWidth()>
	//   63  123:istore          5
			int j = scrubberDrawable.getIntrinsicHeight();
	//   64  125:aload_0         
	//   65  126:getfield        #180 <Field Drawable scrubberDrawable>
	//   66  129:invokevirtual   #366 <Method int Drawable.getIntrinsicHeight()>
	//   67  132:istore_2        
			Drawable drawable = scrubberDrawable;
	//   68  133:aload_0         
	//   69  134:getfield        #180 <Field Drawable scrubberDrawable>
	//   70  137:astore          6
			i1 /= 2;
	//   71  139:iload           5
	//   72  141:iconst_2        
	//   73  142:idiv            
	//   74  143:istore          5
			j /= 2;
	//   75  145:iload_2         
	//   76  146:iconst_2        
	//   77  147:idiv            
	//   78  148:istore_2        
			drawable.setBounds(k - i1, l - j, k + i1, l + j);
	//   79  149:aload           6
	//   80  151:iload_3         
	//   81  152:iload           5
	//   82  154:isub            
	//   83  155:iload           4
	//   84  157:iload_2         
	//   85  158:isub            
	//   86  159:iload_3         
	//   87  160:iload           5
	//   88  162:iadd            
	//   89  163:iload           4
	//   90  165:iload_2         
	//   91  166:iadd            
	//   92  167:invokevirtual   #370 <Method void Drawable.setBounds(int, int, int, int)>
			scrubberDrawable.draw(canvas);
	//   93  170:aload_0         
	//   94  171:getfield        #180 <Field Drawable scrubberDrawable>
	//   95  174:aload_1         
	//   96  175:invokevirtual   #373 <Method void Drawable.draw(Canvas)>
			return;
	//   97  178:return          
		}
	}

	private void drawTimeBar(Canvas canvas)
	{
		int i = progressBar.height();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Rect progressBar>
	//    2    4:invokevirtual   #377 <Method int Rect.height()>
	//    3    7:istore_2        
		int k = progressBar.centerY() - i / 2;
	//    4    8:aload_0         
	//    5    9:getfield        #101 <Field Rect progressBar>
	//    6   12:invokevirtual   #345 <Method int Rect.centerY()>
	//    7   15:iload_2         
	//    8   16:iconst_2        
	//    9   17:idiv            
	//   10   18:isub            
	//   11   19:istore_3        
		int l = i + k;
	//   12   20:iload_2         
	//   13   21:iload_3         
	//   14   22:iadd            
	//   15   23:istore          4
		if(duration <= 0L)
	//*  16   25:aload_0         
	//*  17   26:getfield        #302 <Field long duration>
	//*  18   29:lconst_0        
	//*  19   30:lcmp            
	//*  20   31:ifgt            64
		{
			canvas.drawRect(progressBar.left, k, progressBar.right, l, unplayedPaint);
	//   21   34:aload_1         
	//   22   35:aload_0         
	//   23   36:getfield        #101 <Field Rect progressBar>
	//   24   39:getfield        #338 <Field int Rect.left>
	//   25   42:i2f             
	//   26   43:iload_3         
	//   27   44:i2f             
	//   28   45:aload_0         
	//   29   46:getfield        #101 <Field Rect progressBar>
	//   30   49:getfield        #335 <Field int Rect.right>
	//   31   52:i2f             
	//   32   53:iload           4
	//   33   55:i2f             
	//   34   56:aload_0         
	//   35   57:getfield        #114 <Field Paint unplayedPaint>
	//   36   60:invokevirtual   #381 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			return;
	//   37   63:return          
		}
		int i1 = bufferedBar.left;
	//   38   64:aload_0         
	//   39   65:getfield        #103 <Field Rect bufferedBar>
	//   40   68:getfield        #338 <Field int Rect.left>
	//   41   71:istore          5
		i = bufferedBar.right;
	//   42   73:aload_0         
	//   43   74:getfield        #103 <Field Rect bufferedBar>
	//   44   77:getfield        #335 <Field int Rect.right>
	//   45   80:istore_2        
		int j1 = Math.max(Math.max(progressBar.left, i), scrubberBar.right);
	//   46   81:aload_0         
	//   47   82:getfield        #101 <Field Rect progressBar>
	//   48   85:getfield        #338 <Field int Rect.left>
	//   49   88:iload_2         
	//   50   89:invokestatic    #196 <Method int Math.max(int, int)>
	//   51   92:aload_0         
	//   52   93:getfield        #105 <Field Rect scrubberBar>
	//   53   96:getfield        #335 <Field int Rect.right>
	//   54   99:invokestatic    #196 <Method int Math.max(int, int)>
	//   55  102:istore          6
		if(j1 < progressBar.right)
	//*  56  104:iload           6
	//*  57  106:aload_0         
	//*  58  107:getfield        #101 <Field Rect progressBar>
	//*  59  110:getfield        #335 <Field int Rect.right>
	//*  60  113:icmpge          140
			canvas.drawRect(j1, k, progressBar.right, l, unplayedPaint);
	//   61  116:aload_1         
	//   62  117:iload           6
	//   63  119:i2f             
	//   64  120:iload_3         
	//   65  121:i2f             
	//   66  122:aload_0         
	//   67  123:getfield        #101 <Field Rect progressBar>
	//   68  126:getfield        #335 <Field int Rect.right>
	//   69  129:i2f             
	//   70  130:iload           4
	//   71  132:i2f             
	//   72  133:aload_0         
	//   73  134:getfield        #114 <Field Paint unplayedPaint>
	//   74  137:invokevirtual   #381 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		i1 = Math.max(i1, scrubberBar.right);
	//   75  140:iload           5
	//   76  142:aload_0         
	//   77  143:getfield        #105 <Field Rect scrubberBar>
	//   78  146:getfield        #335 <Field int Rect.right>
	//   79  149:invokestatic    #196 <Method int Math.max(int, int)>
	//   80  152:istore          5
		if(i > i1)
	//*  81  154:iload_2         
	//*  82  155:iload           5
	//*  83  157:icmple          178
			canvas.drawRect(i1, k, i, l, bufferedPaint);
	//   84  160:aload_1         
	//   85  161:iload           5
	//   86  163:i2f             
	//   87  164:iload_3         
	//   88  165:i2f             
	//   89  166:iload_2         
	//   90  167:i2f             
	//   91  168:iload           4
	//   92  170:i2f             
	//   93  171:aload_0         
	//   94  172:getfield        #112 <Field Paint bufferedPaint>
	//   95  175:invokevirtual   #381 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		if(scrubberBar.width() > 0)
	//*  96  178:aload_0         
	//*  97  179:getfield        #105 <Field Rect scrubberBar>
	//*  98  182:invokevirtual   #384 <Method int Rect.width()>
	//*  99  185:ifle            217
			canvas.drawRect(scrubberBar.left, k, scrubberBar.right, l, playedPaint);
	//  100  188:aload_1         
	//  101  189:aload_0         
	//  102  190:getfield        #105 <Field Rect scrubberBar>
	//  103  193:getfield        #338 <Field int Rect.left>
	//  104  196:i2f             
	//  105  197:iload_3         
	//  106  198:i2f             
	//  107  199:aload_0         
	//  108  200:getfield        #105 <Field Rect scrubberBar>
	//  109  203:getfield        #335 <Field int Rect.right>
	//  110  206:i2f             
	//  111  207:iload           4
	//  112  209:i2f             
	//  113  210:aload_0         
	//  114  211:getfield        #110 <Field Paint playedPaint>
	//  115  214:invokevirtual   #381 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		if(adGroupCount == 0)
	//* 116  217:aload_0         
	//* 117  218:getfield        #386 <Field int adGroupCount>
	//* 118  221:ifne            225
			return;
	//  119  224:return          
		long al[] = (long[])Assertions.checkNotNull(((Object) (adGroupTimesMs)));
	//  120  225:aload_0         
	//  121  226:getfield        #388 <Field long[] adGroupTimesMs>
	//  122  229:invokestatic    #394 <Method Object Assertions.checkNotNull(Object)>
	//  123  232:checkcast       #395 <Class long[]>
	//  124  235:astore          10
		boolean aflag[] = (boolean[])Assertions.checkNotNull(((Object) (playedAdGroups)));
	//  125  237:aload_0         
	//  126  238:getfield        #397 <Field boolean[] playedAdGroups>
	//  127  241:invokestatic    #394 <Method Object Assertions.checkNotNull(Object)>
	//  128  244:checkcast       #398 <Class boolean[]>
	//  129  247:astore          11
		i1 = adMarkerWidth / 2;
	//  130  249:aload_0         
	//  131  250:getfield        #214 <Field int adMarkerWidth>
	//  132  253:iconst_2        
	//  133  254:idiv            
	//  134  255:istore          5
		for(int j = 0; j < adGroupCount; j++)
	//* 135  257:iconst_0        
	//* 136  258:istore_2        
	//* 137  259:iload_2         
	//* 138  260:aload_0         
	//* 139  261:getfield        #386 <Field int adGroupCount>
	//* 140  264:icmpge          388
		{
			long l1 = Util.constrainValue(al[j], 0L, duration);
	//  141  267:aload           10
	//  142  269:iload_2         
	//  143  270:laload          
	//  144  271:lconst_0        
	//  145  272:aload_0         
	//  146  273:getfield        #302 <Field long duration>
	//  147  276:invokestatic    #401 <Method long Util.constrainValue(long, long, long)>
	//  148  279:lstore          7
			int k1 = (int)(((long)progressBar.width() * l1) / duration);
	//  149  281:aload_0         
	//  150  282:getfield        #101 <Field Rect progressBar>
	//  151  285:invokevirtual   #384 <Method int Rect.width()>
	//  152  288:i2l             
	//  153  289:lload           7
	//  154  291:lmul            
	//  155  292:aload_0         
	//  156  293:getfield        #302 <Field long duration>
	//  157  296:ldiv            
	//  158  297:l2i             
	//  159  298:istore          6
			k1 = progressBar.left + Math.min(progressBar.width() - adMarkerWidth, Math.max(0, k1 - i1));
	//  160  300:aload_0         
	//  161  301:getfield        #101 <Field Rect progressBar>
	//  162  304:getfield        #338 <Field int Rect.left>
	//  163  307:aload_0         
	//  164  308:getfield        #101 <Field Rect progressBar>
	//  165  311:invokevirtual   #384 <Method int Rect.width()>
	//  166  314:aload_0         
	//  167  315:getfield        #214 <Field int adMarkerWidth>
	//  168  318:isub            
	//  169  319:iconst_0        
	//  170  320:iload           6
	//  171  322:iload           5
	//  172  324:isub            
	//  173  325:invokestatic    #196 <Method int Math.max(int, int)>
	//  174  328:invokestatic    #404 <Method int Math.min(int, int)>
	//  175  331:iadd            
	//  176  332:istore          6
			Paint paint;
			if(aflag[j])
	//* 177  334:aload           11
	//* 178  336:iload_2         
	//* 179  337:baload          
	//* 180  338:ifeq            350
				paint = playedAdMarkerPaint;
	//  181  341:aload_0         
	//  182  342:getfield        #118 <Field Paint playedAdMarkerPaint>
	//  183  345:astore          9
			else
	//* 184  347:goto            359
				paint = adMarkerPaint;
	//  185  350:aload_0         
	//  186  351:getfield        #116 <Field Paint adMarkerPaint>
	//  187  354:astore          9
	//* 188  356:goto            347
			canvas.drawRect(k1, k, k1 + adMarkerWidth, l, paint);
	//  189  359:aload_1         
	//  190  360:iload           6
	//  191  362:i2f             
	//  192  363:iload_3         
	//  193  364:i2f             
	//  194  365:iload           6
	//  195  367:aload_0         
	//  196  368:getfield        #214 <Field int adMarkerWidth>
	//  197  371:iadd            
	//  198  372:i2f             
	//  199  373:iload           4
	//  200  375:i2f             
	//  201  376:aload           9
	//  202  378:invokevirtual   #381 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		}

	//  203  381:iload_2         
	//  204  382:iconst_1        
	//  205  383:iadd            
	//  206  384:istore_2        
	//* 207  385:goto            259
	//  208  388:return          
	}

	public static int getDefaultBufferedColor(int i)
	{
		return i & 0xffffff | 0xcc000000;
	//    0    0:iload_0         
	//    1    1:ldc2            #405 <Int 0xffffff>
	//    2    4:iand            
	//    3    5:ldc2            #406 <Int 0xcc000000>
	//    4    8:ior             
	//    5    9:ireturn         
	}

	public static int getDefaultPlayedAdMarkerColor(int i)
	{
		return i & 0xffffff | 0x33000000;
	//    0    0:iload_0         
	//    1    1:ldc2            #405 <Int 0xffffff>
	//    2    4:iand            
	//    3    5:ldc2            #407 <Int 0x33000000>
	//    4    8:ior             
	//    5    9:ireturn         
	}

	public static int getDefaultScrubberColor(int i)
	{
		return i | 0xff000000;
	//    0    0:iload_0         
	//    1    1:ldc2            #408 <Int 0xff000000>
	//    2    4:ior             
	//    3    5:ireturn         
	}

	public static int getDefaultUnplayedColor(int i)
	{
		return i & 0xffffff | 0x33000000;
	//    0    0:iload_0         
	//    1    1:ldc2            #405 <Int 0xffffff>
	//    2    4:iand            
	//    3    5:ldc2            #407 <Int 0x33000000>
	//    4    8:ior             
	//    5    9:ireturn         
	}

	private long getPositionIncrement()
	{
		if(keyTimeIncrement == 0x1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #304 <Field long keyTimeIncrement>
	//*   2    4:ldc2w           #299 <Long 0x1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            35
		{
			if(duration == 0x1L)
	//*   5   11:aload_0         
	//*   6   12:getfield        #302 <Field long duration>
	//*   7   15:ldc2w           #299 <Long 0x1L>
	//*   8   18:lcmp            
	//*   9   19:ifne            24
				return 0L;
	//   10   22:lconst_0        
	//   11   23:lreturn         
			else
				return duration / (long)keyCountIncrement;
	//   12   24:aload_0         
	//   13   25:getfield        #302 <Field long duration>
	//   14   28:aload_0         
	//   15   29:getfield        #306 <Field int keyCountIncrement>
	//   16   32:i2l             
	//   17   33:ldiv            
	//   18   34:lreturn         
		} else
		{
			return keyTimeIncrement;
	//   19   35:aload_0         
	//   20   36:getfield        #304 <Field long keyTimeIncrement>
	//   21   39:lreturn         
		}
	}

	private String getProgressText()
	{
		return Util.getStringForTime(formatBuilder, formatter, position);
	//    0    0:aload_0         
	//    1    1:getfield        #275 <Field StringBuilder formatBuilder>
	//    2    4:aload_0         
	//    3    5:getfield        #288 <Field Formatter formatter>
	//    4    8:aload_0         
	//    5    9:getfield        #414 <Field long position>
	//    6   12:invokestatic    #418 <Method String Util.getStringForTime(StringBuilder, Formatter, long)>
	//    7   15:areturn         
	}

	private long getScrubberPosition()
	{
		if(progressBar.width() > 0 && duration != 0x1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Rect progressBar>
	//*   2    4:invokevirtual   #384 <Method int Rect.width()>
	//*   3    7:ifle            47
	//*   4   10:aload_0         
	//*   5   11:getfield        #302 <Field long duration>
	//*   6   14:ldc2w           #299 <Long 0x1L>
	//*   7   17:lcmp            
	//*   8   18:ifne            24
	//*   9   21:goto            47
			return ((long)scrubberBar.width() * duration) / (long)progressBar.width();
	//   10   24:aload_0         
	//   11   25:getfield        #105 <Field Rect scrubberBar>
	//   12   28:invokevirtual   #384 <Method int Rect.width()>
	//   13   31:i2l             
	//   14   32:aload_0         
	//   15   33:getfield        #302 <Field long duration>
	//   16   36:lmul            
	//   17   37:aload_0         
	//   18   38:getfield        #101 <Field Rect progressBar>
	//   19   41:invokevirtual   #384 <Method int Rect.width()>
	//   20   44:i2l             
	//   21   45:ldiv            
	//   22   46:lreturn         
		else
			return 0L;
	//   23   47:lconst_0        
	//   24   48:lreturn         
	}

	private boolean isInSeekBar(float f, float f1)
	{
		return seekBounds.contains((int)f, (int)f1);
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Rect seekBounds>
	//    2    4:fload_1         
	//    3    5:f2i             
	//    4    6:fload_2         
	//    5    7:f2i             
	//    6    8:invokevirtual   #425 <Method boolean Rect.contains(int, int)>
	//    7   11:ireturn         
	}

	private void maybeSetImportantForAccessibilityV16()
	{
		if(getImportantForAccessibility() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #430 <Method int getImportantForAccessibility()>
	//*   2    4:ifne            12
			setImportantForAccessibility(1);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #433 <Method void setImportantForAccessibility(int)>
	//    6   12:return          
	}

	private void positionScrubber(float f)
	{
		scrubberBar.right = Util.constrainValue((int)f, progressBar.left, progressBar.right);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Rect scrubberBar>
	//    2    4:fload_1         
	//    3    5:f2i             
	//    4    6:aload_0         
	//    5    7:getfield        #101 <Field Rect progressBar>
	//    6   10:getfield        #338 <Field int Rect.left>
	//    7   13:aload_0         
	//    8   14:getfield        #101 <Field Rect progressBar>
	//    9   17:getfield        #335 <Field int Rect.right>
	//   10   20:invokestatic    #342 <Method int Util.constrainValue(int, int, int)>
	//   11   23:putfield        #335 <Field int Rect.right>
	//   12   26:return          
	}

	private Point resolveRelativeTouchPosition(MotionEvent motionevent)
	{
		getLocationOnScreen(locationOnScreen);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #131 <Field int[] locationOnScreen>
	//    3    5:invokevirtual   #442 <Method void getLocationOnScreen(int[])>
		touchPosition.set((int)motionevent.getRawX() - locationOnScreen[0], (int)motionevent.getRawY() - locationOnScreen[1]);
	//    4    8:aload_0         
	//    5    9:getfield        #136 <Field Point touchPosition>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #448 <Method float MotionEvent.getRawX()>
	//    8   16:f2i             
	//    9   17:aload_0         
	//   10   18:getfield        #131 <Field int[] locationOnScreen>
	//   11   21:iconst_0        
	//   12   22:iaload          
	//   13   23:isub            
	//   14   24:aload_1         
	//   15   25:invokevirtual   #451 <Method float MotionEvent.getRawY()>
	//   16   28:f2i             
	//   17   29:aload_0         
	//   18   30:getfield        #131 <Field int[] locationOnScreen>
	//   19   33:iconst_1        
	//   20   34:iaload          
	//   21   35:isub            
	//   22   36:invokevirtual   #455 <Method void Point.set(int, int)>
		return touchPosition;
	//   23   39:aload_0         
	//   24   40:getfield        #136 <Field Point touchPosition>
	//   25   43:areturn         
	}

	private boolean scrubIncrementally(long l)
	{
		if(duration <= 0L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #302 <Field long duration>
	//*   2    4:lconst_0        
	//*   3    5:lcmp            
	//*   4    6:ifgt            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		long l1 = getScrubberPosition();
	//    7   11:aload_0         
	//    8   12:invokespecial   #459 <Method long getScrubberPosition()>
	//    9   15:lstore_3        
		scrubPosition = Util.constrainValue(l1 + l, 0L, duration);
	//   10   16:aload_0         
	//   11   17:lload_3         
	//   12   18:lload_1         
	//   13   19:ladd            
	//   14   20:lconst_0        
	//   15   21:aload_0         
	//   16   22:getfield        #302 <Field long duration>
	//   17   25:invokestatic    #401 <Method long Util.constrainValue(long, long, long)>
	//   18   28:putfield        #461 <Field long scrubPosition>
		if(scrubPosition == l1)
	//*  19   31:aload_0         
	//*  20   32:getfield        #461 <Field long scrubPosition>
	//*  21   35:lload_3         
	//*  22   36:lcmp            
	//*  23   37:ifne            42
			return false;
	//   24   40:iconst_0        
	//   25   41:ireturn         
		if(!scrubbing)
	//*  26   42:aload_0         
	//*  27   43:getfield        #347 <Field boolean scrubbing>
	//*  28   46:ifne            53
			startScrubbing();
	//   29   49:aload_0         
	//   30   50:invokespecial   #464 <Method void startScrubbing()>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((TimeBar.OnScrubListener)iterator.next()).onScrubMove(((TimeBar) (this)), scrubPosition));
	//   31   53:aload_0         
	//   32   54:getfield        #129 <Field CopyOnWriteArraySet listeners>
	//   33   57:invokevirtual   #468 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   34   60:astore          5
	//   35   62:aload           5
	//   36   64:invokeinterface #473 <Method boolean Iterator.hasNext()>
	//   37   69:ifeq            95
	//   38   72:aload           5
	//   39   74:invokeinterface #477 <Method Object Iterator.next()>
	//   40   79:checkcast       #479 <Class TimeBar$OnScrubListener>
	//   41   82:aload_0         
	//   42   83:aload_0         
	//   43   84:getfield        #461 <Field long scrubPosition>
	//   44   87:invokeinterface #483 <Method void TimeBar$OnScrubListener.onScrubMove(TimeBar, long)>
	//*  45   92:goto            62
		update();
	//   46   95:aload_0         
	//   47   96:invokespecial   #486 <Method void update()>
		return true;
	//   48   99:iconst_1        
	//   49  100:ireturn         
	}

	private boolean setDrawableLayoutDirection(Drawable drawable)
	{
		return Util.SDK_INT >= 23 && setDrawableLayoutDirection(drawable, getLayoutDirection());
	//    0    0:getstatic       #314 <Field int Util.SDK_INT>
	//    1    3:bipush          23
	//    2    5:icmplt          21
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:invokevirtual   #489 <Method int getLayoutDirection()>
	//    6   13:invokestatic    #492 <Method boolean setDrawableLayoutDirection(Drawable, int)>
	//    7   16:ifeq            21
	//    8   19:iconst_1        
	//    9   20:ireturn         
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	private static boolean setDrawableLayoutDirection(Drawable drawable, int i)
	{
		return Util.SDK_INT >= 23 && drawable.setLayoutDirection(i);
	//    0    0:getstatic       #314 <Field int Util.SDK_INT>
	//    1    3:bipush          23
	//    2    5:icmplt          18
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #496 <Method boolean Drawable.setLayoutDirection(int)>
	//    6   13:ifeq            18
	//    7   16:iconst_1        
	//    8   17:ireturn         
	//    9   18:iconst_0        
	//   10   19:ireturn         
	}

	private void startScrubbing()
	{
		scrubbing = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #347 <Field boolean scrubbing>
		setPressed(true);
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #499 <Method void setPressed(boolean)>
		ViewParent viewparent = getParent();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #503 <Method ViewParent getParent()>
	//    8   14:astore_1        
		if(viewparent != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          26
			viewparent.requestDisallowInterceptTouchEvent(true);
	//   11   19:aload_1         
	//   12   20:iconst_1        
	//   13   21:invokeinterface #508 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((TimeBar.OnScrubListener)iterator.next()).onScrubStart(((TimeBar) (this)), getScrubberPosition()));
	//   14   26:aload_0         
	//   15   27:getfield        #129 <Field CopyOnWriteArraySet listeners>
	//   16   30:invokevirtual   #468 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   17   33:astore_1        
	//   18   34:aload_1         
	//   19   35:invokeinterface #473 <Method boolean Iterator.hasNext()>
	//   20   40:ifeq            65
	//   21   43:aload_1         
	//   22   44:invokeinterface #477 <Method Object Iterator.next()>
	//   23   49:checkcast       #479 <Class TimeBar$OnScrubListener>
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:invokespecial   #459 <Method long getScrubberPosition()>
	//   27   57:invokeinterface #511 <Method void TimeBar$OnScrubListener.onScrubStart(TimeBar, long)>
	//*  28   62:goto            34
	//   29   65:return          
	}

	private void stopScrubbing(boolean flag)
	{
		scrubbing = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #347 <Field boolean scrubbing>
		setPressed(false);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #499 <Method void setPressed(boolean)>
		ViewParent viewparent = getParent();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #503 <Method ViewParent getParent()>
	//    8   14:astore_2        
		if(viewparent != null)
	//*   9   15:aload_2         
	//*  10   16:ifnull          26
			viewparent.requestDisallowInterceptTouchEvent(false);
	//   11   19:aload_2         
	//   12   20:iconst_0        
	//   13   21:invokeinterface #508 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		invalidate();
	//   14   26:aload_0         
	//   15   27:invokevirtual   #514 <Method void invalidate()>
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((TimeBar.OnScrubListener)iterator.next()).onScrubStop(((TimeBar) (this)), getScrubberPosition(), flag));
	//   16   30:aload_0         
	//   17   31:getfield        #129 <Field CopyOnWriteArraySet listeners>
	//   18   34:invokevirtual   #468 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   19   37:astore_2        
	//   20   38:aload_2         
	//   21   39:invokeinterface #473 <Method boolean Iterator.hasNext()>
	//   22   44:ifeq            70
	//   23   47:aload_2         
	//   24   48:invokeinterface #477 <Method Object Iterator.next()>
	//   25   53:checkcast       #479 <Class TimeBar$OnScrubListener>
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:invokespecial   #459 <Method long getScrubberPosition()>
	//   29   61:iload_1         
	//   30   62:invokeinterface #518 <Method void TimeBar$OnScrubListener.onScrubStop(TimeBar, long, boolean)>
	//*  31   67:goto            38
	//   32   70:return          
	}

	private void update()
	{
		bufferedBar.set(progressBar);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Rect bufferedBar>
	//    2    4:aload_0         
	//    3    5:getfield        #101 <Field Rect progressBar>
	//    4    8:invokevirtual   #521 <Method void Rect.set(Rect)>
		scrubberBar.set(progressBar);
	//    5   11:aload_0         
	//    6   12:getfield        #105 <Field Rect scrubberBar>
	//    7   15:aload_0         
	//    8   16:getfield        #101 <Field Rect progressBar>
	//    9   19:invokevirtual   #521 <Method void Rect.set(Rect)>
		long l;
		if(scrubbing)
	//*  10   22:aload_0         
	//*  11   23:getfield        #347 <Field boolean scrubbing>
	//*  12   26:ifeq            37
			l = scrubPosition;
	//   13   29:aload_0         
	//   14   30:getfield        #461 <Field long scrubPosition>
	//   15   33:lstore_2        
		else
	//*  16   34:goto            42
			l = position;
	//   17   37:aload_0         
	//   18   38:getfield        #414 <Field long position>
	//   19   41:lstore_2        
		if(duration > 0L)
	//*  20   42:aload_0         
	//*  21   43:getfield        #302 <Field long duration>
	//*  22   46:lconst_0        
	//*  23   47:lcmp            
	//*  24   48:ifle            143
		{
			int i = (int)(((long)progressBar.width() * bufferedPosition) / duration);
	//   25   51:aload_0         
	//   26   52:getfield        #101 <Field Rect progressBar>
	//   27   55:invokevirtual   #384 <Method int Rect.width()>
	//   28   58:i2l             
	//   29   59:aload_0         
	//   30   60:getfield        #523 <Field long bufferedPosition>
	//   31   63:lmul            
	//   32   64:aload_0         
	//   33   65:getfield        #302 <Field long duration>
	//   34   68:ldiv            
	//   35   69:l2i             
	//   36   70:istore_1        
			bufferedBar.right = Math.min(progressBar.left + i, progressBar.right);
	//   37   71:aload_0         
	//   38   72:getfield        #103 <Field Rect bufferedBar>
	//   39   75:aload_0         
	//   40   76:getfield        #101 <Field Rect progressBar>
	//   41   79:getfield        #338 <Field int Rect.left>
	//   42   82:iload_1         
	//   43   83:iadd            
	//   44   84:aload_0         
	//   45   85:getfield        #101 <Field Rect progressBar>
	//   46   88:getfield        #335 <Field int Rect.right>
	//   47   91:invokestatic    #404 <Method int Math.min(int, int)>
	//   48   94:putfield        #335 <Field int Rect.right>
			i = (int)(((long)progressBar.width() * l) / duration);
	//   49   97:aload_0         
	//   50   98:getfield        #101 <Field Rect progressBar>
	//   51  101:invokevirtual   #384 <Method int Rect.width()>
	//   52  104:i2l             
	//   53  105:lload_2         
	//   54  106:lmul            
	//   55  107:aload_0         
	//   56  108:getfield        #302 <Field long duration>
	//   57  111:ldiv            
	//   58  112:l2i             
	//   59  113:istore_1        
			scrubberBar.right = Math.min(progressBar.left + i, progressBar.right);
	//   60  114:aload_0         
	//   61  115:getfield        #105 <Field Rect scrubberBar>
	//   62  118:aload_0         
	//   63  119:getfield        #101 <Field Rect progressBar>
	//   64  122:getfield        #338 <Field int Rect.left>
	//   65  125:iload_1         
	//   66  126:iadd            
	//   67  127:aload_0         
	//   68  128:getfield        #101 <Field Rect progressBar>
	//   69  131:getfield        #335 <Field int Rect.right>
	//   70  134:invokestatic    #404 <Method int Math.min(int, int)>
	//   71  137:putfield        #335 <Field int Rect.right>
		} else
	//*  72  140:goto            171
		{
			bufferedBar.right = progressBar.left;
	//   73  143:aload_0         
	//   74  144:getfield        #103 <Field Rect bufferedBar>
	//   75  147:aload_0         
	//   76  148:getfield        #101 <Field Rect progressBar>
	//   77  151:getfield        #338 <Field int Rect.left>
	//   78  154:putfield        #335 <Field int Rect.right>
			scrubberBar.right = progressBar.left;
	//   79  157:aload_0         
	//   80  158:getfield        #105 <Field Rect scrubberBar>
	//   81  161:aload_0         
	//   82  162:getfield        #101 <Field Rect progressBar>
	//   83  165:getfield        #338 <Field int Rect.left>
	//   84  168:putfield        #335 <Field int Rect.right>
		}
		invalidate(seekBounds);
	//   85  171:aload_0         
	//   86  172:aload_0         
	//   87  173:getfield        #99  <Field Rect seekBounds>
	//   88  176:invokevirtual   #525 <Method void invalidate(Rect)>
	//   89  179:return          
	}

	private void updateDrawableState()
	{
		if(scrubberDrawable != null && scrubberDrawable.isStateful() && scrubberDrawable.setState(getDrawableState()))
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field Drawable scrubberDrawable>
	//*   2    4:ifnull          35
	//*   3    7:aload_0         
	//*   4    8:getfield        #180 <Field Drawable scrubberDrawable>
	//*   5   11:invokevirtual   #529 <Method boolean Drawable.isStateful()>
	//*   6   14:ifeq            35
	//*   7   17:aload_0         
	//*   8   18:getfield        #180 <Field Drawable scrubberDrawable>
	//*   9   21:aload_0         
	//*  10   22:invokevirtual   #533 <Method int[] getDrawableState()>
	//*  11   25:invokevirtual   #537 <Method boolean Drawable.setState(int[])>
	//*  12   28:ifeq            35
			invalidate();
	//   13   31:aload_0         
	//   14   32:invokevirtual   #514 <Method void invalidate()>
	//   15   35:return          
	}

	public void addListener(TimeBar.OnScrubListener onscrublistener)
	{
		listeners.add(((Object) (onscrublistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #543 <Method boolean CopyOnWriteArraySet.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #546 <Method void View.drawableStateChanged()>
		updateDrawableState();
	//    2    4:aload_0         
	//    3    5:invokespecial   #548 <Method void updateDrawableState()>
	//    4    8:return          
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #551 <Method void View.jumpDrawablesToCurrentState()>
		if(scrubberDrawable != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #180 <Field Drawable scrubberDrawable>
	//*   4    8:ifnull          18
			scrubberDrawable.jumpToCurrentState();
	//    5   11:aload_0         
	//    6   12:getfield        #180 <Field Drawable scrubberDrawable>
	//    7   15:invokevirtual   #554 <Method void Drawable.jumpToCurrentState()>
	//    8   18:return          
	}

	public void onDraw(Canvas canvas)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #558 <Method int Canvas.save()>
	//    2    4:pop             
		drawTimeBar(canvas);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #560 <Method void drawTimeBar(Canvas)>
		drawPlayhead(canvas);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #562 <Method void drawPlayhead(Canvas)>
		canvas.restore();
	//    9   15:aload_1         
	//   10   16:invokevirtual   #565 <Method void Canvas.restore()>
	//   11   19:return          
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #569 <Method void View.onInitializeAccessibilityEvent(AccessibilityEvent)>
		if(accessibilityevent.getEventType() == 4)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #574 <Method int AccessibilityEvent.getEventType()>
	//*   5    9:iconst_4        
	//*   6   10:icmpne          27
			accessibilityevent.getText().add(((Object) (getProgressText())));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #578 <Method List AccessibilityEvent.getText()>
	//    9   17:aload_0         
	//   10   18:invokespecial   #580 <Method String getProgressText()>
	//   11   21:invokeinterface #583 <Method boolean List.add(Object)>
	//   12   26:pop             
		accessibilityevent.setClassName("android.widget.SeekBar");
	//   13   27:aload_1         
	//   14   28:ldc1            #12  <String "android.widget.SeekBar">
	//   15   30:invokevirtual   #587 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//   16   33:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #592 <Method void View.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName("android.widget.SeekBar");
	//    3    5:aload_1         
	//    4    6:ldc1            #12  <String "android.widget.SeekBar">
	//    5    8:invokevirtual   #595 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
		accessibilitynodeinfo.setContentDescription(((CharSequence) (getProgressText())));
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokespecial   #580 <Method String getProgressText()>
	//    9   16:invokevirtual   #598 <Method void AccessibilityNodeInfo.setContentDescription(CharSequence)>
		if(duration <= 0L)
	//*  10   19:aload_0         
	//*  11   20:getfield        #302 <Field long duration>
	//*  12   23:lconst_0        
	//*  13   24:lcmp            
	//*  14   25:ifgt            29
			return;
	//   15   28:return          
		if(Util.SDK_INT >= 21)
	//*  16   29:getstatic       #314 <Field int Util.SDK_INT>
	//*  17   32:bipush          21
	//*  18   34:icmplt          52
		{
			accessibilitynodeinfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
	//   19   37:aload_1         
	//   20   38:getstatic       #604 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_FORWARD>
	//   21   41:invokevirtual   #608 <Method void AccessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
			accessibilitynodeinfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
	//   22   44:aload_1         
	//   23   45:getstatic       #611 <Field android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_BACKWARD>
	//   24   48:invokevirtual   #608 <Method void AccessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
			return;
	//   25   51:return          
		}
		if(Util.SDK_INT >= 16)
	//*  26   52:getstatic       #314 <Field int Util.SDK_INT>
	//*  27   55:bipush          16
	//*  28   57:icmplt          74
		{
			accessibilitynodeinfo.addAction(4096);
	//   29   60:aload_1         
	//   30   61:sipush          4096
	//   31   64:invokevirtual   #613 <Method void AccessibilityNodeInfo.addAction(int)>
			accessibilitynodeinfo.addAction(8192);
	//   32   67:aload_1         
	//   33   68:sipush          8192
	//   34   71:invokevirtual   #613 <Method void AccessibilityNodeInfo.addAction(int)>
		}
	//   35   74:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(!isEnabled()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:invokevirtual   #354 <Method boolean isEnabled()>
	//    2    4:ifeq            113
_L1:
		long l1 = getPositionIncrement();
	//    3    7:aload_0         
	//    4    8:invokespecial   #617 <Method long getPositionIncrement()>
	//    5   11:lstore          5
		if(i == 66) goto _L4; else goto _L3
	//    6   13:iload_1         
	//    7   14:bipush          66
	//    8   16:icmpeq          86
_L3:
		long l = l1;
	//    9   19:lload           5
	//   10   21:lstore_3        
		i;
	//   11   22:iload_1         
		JVM INSTR tableswitch 21 23: default 48
	//	               21 51
	//	               22 55
	//	               23 86;
	//   12   23:tableswitch     21 23: default 48
	//	               21 51
	//	               22 55
	//	               23 86
		   goto _L5 _L6 _L7 _L4
_L5:
		break; /* Loop/switch isn't completed */
	//   13   48:goto            113
_L6:
		l = -l1;
	//   14   51:lload           5
	//   15   53:lneg            
	//   16   54:lstore_3        
_L7:
		if(scrubIncrementally(l))
	//*  17   55:aload_0         
	//*  18   56:lload_3         
	//*  19   57:invokespecial   #619 <Method boolean scrubIncrementally(long)>
	//*  20   60:ifeq            113
		{
			removeCallbacks(stopScrubbingRunnable);
	//   21   63:aload_0         
	//   22   64:aload_0         
	//   23   65:getfield        #293 <Field Runnable stopScrubbingRunnable>
	//   24   68:invokevirtual   #623 <Method boolean removeCallbacks(Runnable)>
	//   25   71:pop             
			postDelayed(stopScrubbingRunnable, 1000L);
	//   26   72:aload_0         
	//   27   73:aload_0         
	//   28   74:getfield        #293 <Field Runnable stopScrubbingRunnable>
	//   29   77:ldc2w           #37  <Long 1000L>
	//   30   80:invokevirtual   #627 <Method boolean postDelayed(Runnable, long)>
	//   31   83:pop             
			return true;
	//   32   84:iconst_1        
	//   33   85:ireturn         
		}
		break; /* Loop/switch isn't completed */
_L4:
		if(scrubbing)
	//*  34   86:aload_0         
	//*  35   87:getfield        #347 <Field boolean scrubbing>
	//*  36   90:ifeq            113
		{
			removeCallbacks(stopScrubbingRunnable);
	//   37   93:aload_0         
	//   38   94:aload_0         
	//   39   95:getfield        #293 <Field Runnable stopScrubbingRunnable>
	//   40   98:invokevirtual   #623 <Method boolean removeCallbacks(Runnable)>
	//   41  101:pop             
			stopScrubbingRunnable.run();
	//   42  102:aload_0         
	//   43  103:getfield        #293 <Field Runnable stopScrubbingRunnable>
	//   44  106:invokeinterface #632 <Method void Runnable.run()>
			return true;
	//   45  111:iconst_1        
	//   46  112:ireturn         
		}
_L2:
		return super.onKeyDown(i, keyevent);
	//   47  113:aload_0         
	//   48  114:iload_1         
	//   49  115:aload_2         
	//   50  116:invokespecial   #634 <Method boolean View.onKeyDown(int, KeyEvent)>
	//   51  119:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		j = (l - j - touchTargetHeight) / 2;
	//    0    0:iload           5
	//    1    2:iload_3         
	//    2    3:isub            
	//    3    4:aload_0         
	//    4    5:getfield        #209 <Field int touchTargetHeight>
	//    5    8:isub            
	//    6    9:iconst_2        
	//    7   10:idiv            
	//    8   11:istore_3        
		l = getPaddingLeft();
	//    9   12:aload_0         
	//   10   13:invokevirtual   #639 <Method int getPaddingLeft()>
	//   11   16:istore          5
		int i1 = getPaddingRight();
	//   12   18:aload_0         
	//   13   19:invokevirtual   #642 <Method int getPaddingRight()>
	//   14   22:istore          6
		int j1 = (touchTargetHeight - barHeight) / 2 + j;
	//   15   24:aload_0         
	//   16   25:getfield        #209 <Field int touchTargetHeight>
	//   17   28:aload_0         
	//   18   29:getfield        #204 <Field int barHeight>
	//   19   32:isub            
	//   20   33:iconst_2        
	//   21   34:idiv            
	//   22   35:iload_3         
	//   23   36:iadd            
	//   24   37:istore          7
		seekBounds.set(l, j, k - i - i1, touchTargetHeight + j);
	//   25   39:aload_0         
	//   26   40:getfield        #99  <Field Rect seekBounds>
	//   27   43:iload           5
	//   28   45:iload_3         
	//   29   46:iload           4
	//   30   48:iload_2         
	//   31   49:isub            
	//   32   50:iload           6
	//   33   52:isub            
	//   34   53:aload_0         
	//   35   54:getfield        #209 <Field int touchTargetHeight>
	//   36   57:iload_3         
	//   37   58:iadd            
	//   38   59:invokevirtual   #644 <Method void Rect.set(int, int, int, int)>
		progressBar.set(seekBounds.left + scrubberPadding, j1, seekBounds.right - scrubberPadding, barHeight + j1);
	//   39   62:aload_0         
	//   40   63:getfield        #101 <Field Rect progressBar>
	//   41   66:aload_0         
	//   42   67:getfield        #99  <Field Rect seekBounds>
	//   43   70:getfield        #338 <Field int Rect.left>
	//   44   73:aload_0         
	//   45   74:getfield        #298 <Field int scrubberPadding>
	//   46   77:iadd            
	//   47   78:iload           7
	//   48   80:aload_0         
	//   49   81:getfield        #99  <Field Rect seekBounds>
	//   50   84:getfield        #335 <Field int Rect.right>
	//   51   87:aload_0         
	//   52   88:getfield        #298 <Field int scrubberPadding>
	//   53   91:isub            
	//   54   92:aload_0         
	//   55   93:getfield        #204 <Field int barHeight>
	//   56   96:iload           7
	//   57   98:iadd            
	//   58   99:invokevirtual   #644 <Method void Rect.set(int, int, int, int)>
		update();
	//   59  102:aload_0         
	//   60  103:invokespecial   #486 <Method void update()>
	//   61  106:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_2         
	//    1    1:invokestatic    #650 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		j = android.view.View.MeasureSpec.getSize(j);
	//    3    5:iload_2         
	//    4    6:invokestatic    #653 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_2        
		if(k == 0)
	//*   6   10:iload_3         
	//*   7   11:ifne            22
			j = touchTargetHeight;
	//    8   14:aload_0         
	//    9   15:getfield        #209 <Field int touchTargetHeight>
	//   10   18:istore_2        
		else
	//*  11   19:goto            41
		if(k != 0x40000000)
	//*  12   22:iload_3         
	//*  13   23:ldc2            #654 <Int 0x40000000>
	//*  14   26:icmpne          32
	//*  15   29:goto            41
			j = Math.min(touchTargetHeight, j);
	//   16   32:aload_0         
	//   17   33:getfield        #209 <Field int touchTargetHeight>
	//   18   36:iload_2         
	//   19   37:invokestatic    #404 <Method int Math.min(int, int)>
	//   20   40:istore_2        
		setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), j);
	//   21   41:aload_0         
	//   22   42:iload_1         
	//   23   43:invokestatic    #653 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   24   46:iload_2         
	//   25   47:invokevirtual   #657 <Method void setMeasuredDimension(int, int)>
		updateDrawableState();
	//   26   50:aload_0         
	//   27   51:invokespecial   #548 <Method void updateDrawableState()>
	//   28   54:return          
	}

	public void onRtlPropertiesChanged(int i)
	{
		if(scrubberDrawable != null && setDrawableLayoutDirection(scrubberDrawable, i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #180 <Field Drawable scrubberDrawable>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:getfield        #180 <Field Drawable scrubberDrawable>
	//*   5   11:iload_1         
	//*   6   12:invokestatic    #492 <Method boolean setDrawableLayoutDirection(Drawable, int)>
	//*   7   15:ifeq            22
			invalidate();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #514 <Method void invalidate()>
	//   10   22:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		boolean flag1 = isEnabled();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #354 <Method boolean isEnabled()>
	//    2    4:istore          6
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          5
		if(flag1)
	//*   5    9:iload           6
	//*   6   11:ifeq            260
		{
			if(duration <= 0L)
	//*   7   14:aload_0         
	//*   8   15:getfield        #302 <Field long duration>
	//*   9   18:lconst_0        
	//*  10   19:lcmp            
	//*  11   20:ifgt            25
				return false;
	//   12   23:iconst_0        
	//   13   24:ireturn         
			Point point = resolveRelativeTouchPosition(motionevent);
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokespecial   #662 <Method Point resolveRelativeTouchPosition(MotionEvent)>
	//   17   30:astore          7
			int i = point.x;
	//   18   32:aload           7
	//   19   34:getfield        #665 <Field int Point.x>
	//   20   37:istore_3        
			int j = point.y;
	//   21   38:aload           7
	//   22   40:getfield        #668 <Field int Point.y>
	//   23   43:istore          4
			switch(motionevent.getAction())
	//*  24   45:aload_1         
	//*  25   46:invokevirtual   #671 <Method int MotionEvent.getAction()>
			{
	//*  26   49:tableswitch     0 3: default 80
	//	               0 217
	//	               1 191
	//	               2 82
	//	               3 191
			default:
				return false;
	//   27   80:iconst_0        
	//   28   81:ireturn         

			case 2: // '\002'
				if(scrubbing)
	//*  29   82:aload_0         
	//*  30   83:getfield        #347 <Field boolean scrubbing>
	//*  31   86:ifeq            258
				{
					if(j < fineScrubYThreshold)
	//*  32   89:iload           4
	//*  33   91:aload_0         
	//*  34   92:getfield        #154 <Field int fineScrubYThreshold>
	//*  35   95:icmpge          123
					{
						j = lastCoarseScrubXPosition;
	//   36   98:aload_0         
	//   37   99:getfield        #673 <Field int lastCoarseScrubXPosition>
	//   38  102:istore          4
						positionScrubber(lastCoarseScrubXPosition + (i - j) / 3);
	//   39  104:aload_0         
	//   40  105:aload_0         
	//   41  106:getfield        #673 <Field int lastCoarseScrubXPosition>
	//   42  109:iload_3         
	//   43  110:iload           4
	//   44  112:isub            
	//   45  113:iconst_3        
	//   46  114:idiv            
	//   47  115:iadd            
	//   48  116:i2f             
	//   49  117:invokespecial   #675 <Method void positionScrubber(float)>
					} else
	//*  50  120:goto            134
					{
						lastCoarseScrubXPosition = i;
	//   51  123:aload_0         
	//   52  124:iload_3         
	//   53  125:putfield        #673 <Field int lastCoarseScrubXPosition>
						positionScrubber(i);
	//   54  128:aload_0         
	//   55  129:iload_3         
	//   56  130:i2f             
	//   57  131:invokespecial   #675 <Method void positionScrubber(float)>
					}
					scrubPosition = getScrubberPosition();
	//   58  134:aload_0         
	//   59  135:aload_0         
	//   60  136:invokespecial   #459 <Method long getScrubberPosition()>
	//   61  139:putfield        #461 <Field long scrubPosition>
					for(motionevent = ((MotionEvent) (listeners.iterator())); ((Iterator) (motionevent)).hasNext(); ((TimeBar.OnScrubListener)((Iterator) (motionevent)).next()).onScrubMove(((TimeBar) (this)), scrubPosition));
	//   62  142:aload_0         
	//   63  143:getfield        #129 <Field CopyOnWriteArraySet listeners>
	//   64  146:invokevirtual   #468 <Method Iterator CopyOnWriteArraySet.iterator()>
	//   65  149:astore_1        
	//   66  150:aload_1         
	//   67  151:invokeinterface #473 <Method boolean Iterator.hasNext()>
	//   68  156:ifeq            181
	//   69  159:aload_1         
	//   70  160:invokeinterface #477 <Method Object Iterator.next()>
	//   71  165:checkcast       #479 <Class TimeBar$OnScrubListener>
	//   72  168:aload_0         
	//   73  169:aload_0         
	//   74  170:getfield        #461 <Field long scrubPosition>
	//   75  173:invokeinterface #483 <Method void TimeBar$OnScrubListener.onScrubMove(TimeBar, long)>
	//*  76  178:goto            150
					update();
	//   77  181:aload_0         
	//   78  182:invokespecial   #486 <Method void update()>
					invalidate();
	//   79  185:aload_0         
	//   80  186:invokevirtual   #514 <Method void invalidate()>
					return true;
	//   81  189:iconst_1        
	//   82  190:ireturn         
				}
				break;

			case 1: // '\001'
			case 3: // '\003'
				if(!scrubbing)
					break;
	//   83  191:aload_0         
	//   84  192:getfield        #347 <Field boolean scrubbing>
	//   85  195:ifeq            258
				if(motionevent.getAction() == 3)
	//*  86  198:aload_1         
	//*  87  199:invokevirtual   #671 <Method int MotionEvent.getAction()>
	//*  88  202:iconst_3        
	//*  89  203:icmpne          209
					flag = true;
	//   90  206:iconst_1        
	//   91  207:istore          5
				stopScrubbing(flag);
	//   92  209:aload_0         
	//   93  210:iload           5
	//   94  212:invokespecial   #323 <Method void stopScrubbing(boolean)>
				return true;
	//   95  215:iconst_1        
	//   96  216:ireturn         

			case 0: // '\0'
				float f = i;
	//   97  217:iload_3         
	//   98  218:i2f             
	//   99  219:fstore_2        
				if(isInSeekBar(f, j))
	//* 100  220:aload_0         
	//* 101  221:fload_2         
	//* 102  222:iload           4
	//* 103  224:i2f             
	//* 104  225:invokespecial   #677 <Method boolean isInSeekBar(float, float)>
	//* 105  228:ifeq            258
				{
					positionScrubber(f);
	//  106  231:aload_0         
	//  107  232:fload_2         
	//  108  233:invokespecial   #675 <Method void positionScrubber(float)>
					startScrubbing();
	//  109  236:aload_0         
	//  110  237:invokespecial   #464 <Method void startScrubbing()>
					scrubPosition = getScrubberPosition();
	//  111  240:aload_0         
	//  112  241:aload_0         
	//  113  242:invokespecial   #459 <Method long getScrubberPosition()>
	//  114  245:putfield        #461 <Field long scrubPosition>
					update();
	//  115  248:aload_0         
	//  116  249:invokespecial   #486 <Method void update()>
					invalidate();
	//  117  252:aload_0         
	//  118  253:invokevirtual   #514 <Method void invalidate()>
					return true;
	//  119  256:iconst_1        
	//  120  257:ireturn         
				}
				break;
			}
			return false;
	//  121  258:iconst_0        
	//  122  259:ireturn         
		} else
		{
			return false;
	//  123  260:iconst_0        
	//  124  261:ireturn         
		}
	}

	public boolean performAccessibilityAction(int i, Bundle bundle)
	{
label0:
		{
			if(super.performAccessibilityAction(i, bundle))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #681 <Method boolean View.performAccessibilityAction(int, Bundle)>
	//*   4    6:ifeq            11
				return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
			if(duration <= 0L)
	//*   7   11:aload_0         
	//*   8   12:getfield        #302 <Field long duration>
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:ifgt            22
				return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
			if(i == 8192)
	//*  14   22:iload_1         
	//*  15   23:sipush          8192
	//*  16   26:icmpne          49
			{
				if(scrubIncrementally(-getPositionIncrement()))
	//*  17   29:aload_0         
	//*  18   30:aload_0         
	//*  19   31:invokespecial   #617 <Method long getPositionIncrement()>
	//*  20   34:lneg            
	//*  21   35:invokespecial   #619 <Method boolean scrubIncrementally(long)>
	//*  22   38:ifeq            72
					stopScrubbing(false);
	//   23   41:aload_0         
	//   24   42:iconst_0        
	//   25   43:invokespecial   #323 <Method void stopScrubbing(boolean)>
			} else
	//*  26   46:goto            72
			{
				if(i != 4096)
					break label0;
	//   27   49:iload_1         
	//   28   50:sipush          4096
	//   29   53:icmpne          79
				if(scrubIncrementally(getPositionIncrement()))
	//*  30   56:aload_0         
	//*  31   57:aload_0         
	//*  32   58:invokespecial   #617 <Method long getPositionIncrement()>
	//*  33   61:invokespecial   #619 <Method boolean scrubIncrementally(long)>
	//*  34   64:ifeq            72
					stopScrubbing(false);
	//   35   67:aload_0         
	//   36   68:iconst_0        
	//   37   69:invokespecial   #323 <Method void stopScrubbing(boolean)>
			}
			sendAccessibilityEvent(4);
	//   38   72:aload_0         
	//   39   73:iconst_4        
	//   40   74:invokevirtual   #684 <Method void sendAccessibilityEvent(int)>
			return true;
	//   41   77:iconst_1        
	//   42   78:ireturn         
		}
		return false;
	//   43   79:iconst_0        
	//   44   80:ireturn         
	}

	public void removeListener(TimeBar.OnScrubListener onscrublistener)
	{
		listeners.remove(((Object) (onscrublistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field CopyOnWriteArraySet listeners>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #689 <Method boolean CopyOnWriteArraySet.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void setAdGroupTimesMs(long al[], boolean aflag[], int i)
	{
		boolean flag;
		if(i != 0 && (al == null || aflag == null))
	//*   0    0:iload_3         
	//*   1    1:ifeq            21
	//*   2    4:aload_1         
	//*   3    5:ifnull          15
	//*   4    8:aload_2         
	//*   5    9:ifnull          15
	//*   6   12:goto            21
			flag = false;
	//    7   15:iconst_0        
	//    8   16:istore          4
		else
	//*   9   18:goto            24
			flag = true;
	//   10   21:iconst_1        
	//   11   22:istore          4
		Assertions.checkArgument(flag);
	//   12   24:iload           4
	//   13   26:invokestatic    #694 <Method void Assertions.checkArgument(boolean)>
		adGroupCount = i;
	//   14   29:aload_0         
	//   15   30:iload_3         
	//   16   31:putfield        #386 <Field int adGroupCount>
		adGroupTimesMs = al;
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:putfield        #388 <Field long[] adGroupTimesMs>
		playedAdGroups = aflag;
	//   20   39:aload_0         
	//   21   40:aload_2         
	//   22   41:putfield        #397 <Field boolean[] playedAdGroups>
		update();
	//   23   44:aload_0         
	//   24   45:invokespecial   #486 <Method void update()>
	//   25   48:return          
	}

	public void setAdMarkerColor(int i)
	{
		adMarkerPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Paint adMarkerPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #267 <Method void Paint.setColor(int)>
		invalidate(seekBounds);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field Rect seekBounds>
	//    7   13:invokevirtual   #525 <Method void invalidate(Rect)>
	//    8   16:return          
	}

	public void setBufferedColor(int i)
	{
		bufferedPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field Paint bufferedPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #267 <Method void Paint.setColor(int)>
		invalidate(seekBounds);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field Rect seekBounds>
	//    7   13:invokevirtual   #525 <Method void invalidate(Rect)>
	//    8   16:return          
	}

	public void setBufferedPosition(long l)
	{
		bufferedPosition = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #523 <Field long bufferedPosition>
		update();
	//    3    5:aload_0         
	//    4    6:invokespecial   #486 <Method void update()>
	//    5    9:return          
	}

	public void setDuration(long l)
	{
		duration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #302 <Field long duration>
		if(scrubbing && l == 0x1L)
	//*   3    5:aload_0         
	//*   4    6:getfield        #347 <Field boolean scrubbing>
	//*   5    9:ifeq            25
	//*   6   12:lload_1         
	//*   7   13:ldc2w           #299 <Long 0x1L>
	//*   8   16:lcmp            
	//*   9   17:ifne            25
			stopScrubbing(true);
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:invokespecial   #323 <Method void stopScrubbing(boolean)>
		update();
	//   13   25:aload_0         
	//   14   26:invokespecial   #486 <Method void update()>
	//   15   29:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #703 <Method void View.setEnabled(boolean)>
		if(scrubbing && !flag)
	//*   3    5:aload_0         
	//*   4    6:getfield        #347 <Field boolean scrubbing>
	//*   5    9:ifeq            21
	//*   6   12:iload_1         
	//*   7   13:ifne            21
			stopScrubbing(true);
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:invokespecial   #323 <Method void stopScrubbing(boolean)>
	//   11   21:return          
	}

	public void setKeyCountIncrement(int i)
	{
		boolean flag;
		if(i > 0)
	//*   0    0:iload_1         
	//*   1    1:ifle            9
			flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
		else
	//*   4    6:goto            11
			flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		Assertions.checkArgument(flag);
	//    7   11:iload_2         
	//    8   12:invokestatic    #694 <Method void Assertions.checkArgument(boolean)>
		keyCountIncrement = i;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:putfield        #306 <Field int keyCountIncrement>
		keyTimeIncrement = 0x1L;
	//   12   20:aload_0         
	//   13   21:ldc2w           #299 <Long 0x1L>
	//   14   24:putfield        #304 <Field long keyTimeIncrement>
	//   15   27:return          
	}

	public void setKeyTimeIncrement(long l)
	{
		boolean flag;
		if(l > 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifle            11
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore_3        
		else
	//*   6    8:goto            13
			flag = false;
	//    7   11:iconst_0        
	//    8   12:istore_3        
		Assertions.checkArgument(flag);
	//    9   13:iload_3         
	//   10   14:invokestatic    #694 <Method void Assertions.checkArgument(boolean)>
		keyCountIncrement = -1;
	//   11   17:aload_0         
	//   12   18:iconst_m1       
	//   13   19:putfield        #306 <Field int keyCountIncrement>
		keyTimeIncrement = l;
	//   14   22:aload_0         
	//   15   23:lload_1         
	//   16   24:putfield        #304 <Field long keyTimeIncrement>
	//   17   27:return          
	}

	public void setPlayedAdMarkerColor(int i)
	{
		playedAdMarkerPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Paint playedAdMarkerPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #267 <Method void Paint.setColor(int)>
		invalidate(seekBounds);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field Rect seekBounds>
	//    7   13:invokevirtual   #525 <Method void invalidate(Rect)>
	//    8   16:return          
	}

	public void setPlayedColor(int i)
	{
		playedPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field Paint playedPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #267 <Method void Paint.setColor(int)>
		invalidate(seekBounds);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field Rect seekBounds>
	//    7   13:invokevirtual   #525 <Method void invalidate(Rect)>
	//    8   16:return          
	}

	public void setPosition(long l)
	{
		position = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #414 <Field long position>
		setContentDescription(((CharSequence) (getProgressText())));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #580 <Method String getProgressText()>
	//    6   10:invokevirtual   #709 <Method void setContentDescription(CharSequence)>
		update();
	//    7   13:aload_0         
	//    8   14:invokespecial   #486 <Method void update()>
	//    9   17:return          
	}

	public void setScrubberColor(int i)
	{
		scrubberPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field Paint scrubberPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #267 <Method void Paint.setColor(int)>
		invalidate(seekBounds);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field Rect seekBounds>
	//    7   13:invokevirtual   #525 <Method void invalidate(Rect)>
	//    8   16:return          
	}

	public void setUnplayedColor(int i)
	{
		unplayedPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field Paint unplayedPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #267 <Method void Paint.setColor(int)>
		invalidate(seekBounds);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #99  <Field Rect seekBounds>
	//    7   13:invokevirtual   #525 <Method void invalidate(Rect)>
	//    8   16:return          
	}

	private static final String ACCESSIBILITY_CLASS_NAME = "android.widget.SeekBar";
	public static final int DEFAULT_AD_MARKER_COLOR = 0xb2ffff00;
	public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
	public static final int DEFAULT_BAR_HEIGHT_DP = 4;
	private static final int DEFAULT_INCREMENT_COUNT = 20;
	public static final int DEFAULT_PLAYED_COLOR = -1;
	public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
	public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
	public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
	public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
	private static final int FINE_SCRUB_RATIO = 3;
	private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
	private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000L;
	private int adGroupCount;
	private long adGroupTimesMs[];
	private final Paint adMarkerPaint;
	private final int adMarkerWidth;
	private final int barHeight;
	private final Rect bufferedBar;
	private final Paint bufferedPaint;
	private long bufferedPosition;
	private long duration;
	private final int fineScrubYThreshold;
	private final StringBuilder formatBuilder;
	private final Formatter formatter;
	private int keyCountIncrement;
	private long keyTimeIncrement;
	private int lastCoarseScrubXPosition;
	private final CopyOnWriteArraySet listeners;
	private final int locationOnScreen[];
	private boolean playedAdGroups[];
	private final Paint playedAdMarkerPaint;
	private final Paint playedPaint;
	private long position;
	private final Rect progressBar;
	private long scrubPosition;
	private final Rect scrubberBar;
	private final int scrubberDisabledSize;
	private final int scrubberDraggedSize;
	private final Drawable scrubberDrawable;
	private final int scrubberEnabledSize;
	private final int scrubberPadding;
	private final Paint scrubberPaint;
	private boolean scrubbing;
	private final Rect seekBounds;
	private final Runnable stopScrubbingRunnable;
	private final Point touchPosition;
	private final int touchTargetHeight;
	private final Paint unplayedPaint;


/*
	static void access$000(DefaultTimeBar defaulttimebar, boolean flag)
	{
		defaulttimebar.stopScrubbing(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #323 <Method void stopScrubbing(boolean)>
		return;
	//    3    5:return          
	}

*/
}
