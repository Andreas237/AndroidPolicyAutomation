// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.*;
import android.text.style.TextAppearanceSpan;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			ShowcaseView, ShowcaseAreaCalculator

class TextDrawer
{

	public TextDrawer(Resources resources, ShowcaseAreaCalculator showcaseareacalculator, Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mBestTextPosition = new float[3];
	//    2    4:aload_0         
	//    3    5:iconst_3        
	//    4    6:newarray        float[]
	//    5    8:putfield        #34  <Field float[] mBestTextPosition>
		padding = resources.getDimension(R.dimen.text_padding);
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:getstatic       #40  <Field int R$dimen.text_padding>
	//    9   16:invokevirtual   #46  <Method float Resources.getDimension(int)>
	//   10   19:putfield        #48  <Field float padding>
		actionBarOffset = resources.getDimension(R.dimen.action_bar_offset);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:getstatic       #51  <Field int R$dimen.action_bar_offset>
	//   14   27:invokevirtual   #46  <Method float Resources.getDimension(int)>
	//   15   30:putfield        #53  <Field float actionBarOffset>
		calculator = showcaseareacalculator;
	//   16   33:aload_0         
	//   17   34:aload_2         
	//   18   35:putfield        #55  <Field ShowcaseAreaCalculator calculator>
		context = context1;
	//   19   38:aload_0         
	//   20   39:aload_3         
	//   21   40:putfield        #57  <Field Context context>
	//   22   43:aload_0         
	//   23   44:new             #59  <Class TextPaint>
	//   24   47:dup             
	//   25   48:invokespecial   #60  <Method void TextPaint()>
	//   26   51:putfield        #62  <Field TextPaint titlePaint>
		titlePaint.setAntiAlias(true);
	//   27   54:aload_0         
	//   28   55:getfield        #62  <Field TextPaint titlePaint>
	//   29   58:iconst_1        
	//   30   59:invokevirtual   #66  <Method void TextPaint.setAntiAlias(boolean)>
	//   31   62:aload_0         
	//   32   63:new             #59  <Class TextPaint>
	//   33   66:dup             
	//   34   67:invokespecial   #60  <Method void TextPaint()>
	//   35   70:putfield        #68  <Field TextPaint textPaint>
		textPaint.setAntiAlias(true);
	//   36   73:aload_0         
	//   37   74:getfield        #68  <Field TextPaint textPaint>
	//   38   77:iconst_1        
	//   39   78:invokevirtual   #66  <Method void TextPaint.setAntiAlias(boolean)>
	//   40   81:return          
	}

	public void calculateTextPosition(int i, int j, ShowcaseView showcaseview, boolean flag)
	{
		if(showcaseview.hasShowcaseView())
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #77  <Method boolean ShowcaseView.hasShowcaseView()>
	//*   2    4:ifeq            18
			showcaseview = ((ShowcaseView) (calculator.getShowcaseRect()));
	//    3    7:aload_0         
	//    4    8:getfield        #55  <Field ShowcaseAreaCalculator calculator>
	//    5   11:invokevirtual   #83  <Method Rect ShowcaseAreaCalculator.getShowcaseRect()>
	//    6   14:astore_3        
		else
	//*   7   15:goto            26
			showcaseview = ((ShowcaseView) (new Rect()));
	//    8   18:new             #85  <Class Rect>
	//    9   21:dup             
	//   10   22:invokespecial   #86  <Method void Rect()>
	//   11   25:astore_3        
		int ai[] = new int[4];
	//   12   26:iconst_4        
	//   13   27:newarray        int[]
	//   14   29:astore          8
		ai[0] = ((Rect) (showcaseview)).left * j;
	//   15   31:aload           8
	//   16   33:iconst_0        
	//   17   34:aload_3         
	//   18   35:getfield        #89  <Field int Rect.left>
	//   19   38:iload_2         
	//   20   39:imul            
	//   21   40:iastore         
		ai[1] = ((Rect) (showcaseview)).top * i;
	//   22   41:aload           8
	//   23   43:iconst_1        
	//   24   44:aload_3         
	//   25   45:getfield        #92  <Field int Rect.top>
	//   26   48:iload_1         
	//   27   49:imul            
	//   28   50:iastore         
		ai[2] = (i - ((Rect) (showcaseview)).right) * j;
	//   29   51:aload           8
	//   30   53:iconst_2        
	//   31   54:iload_1         
	//   32   55:aload_3         
	//   33   56:getfield        #95  <Field int Rect.right>
	//   34   59:isub            
	//   35   60:iload_2         
	//   36   61:imul            
	//   37   62:iastore         
		ai[3] = (j - ((Rect) (showcaseview)).bottom) * i;
	//   38   63:aload           8
	//   39   65:iconst_3        
	//   40   66:iload_2         
	//   41   67:aload_3         
	//   42   68:getfield        #98  <Field int Rect.bottom>
	//   43   71:isub            
	//   44   72:iload_1         
	//   45   73:imul            
	//   46   74:iastore         
		int l = 0;
	//   47   75:iconst_0        
	//   48   76:istore          6
		for(int k = 1; k < ai.length;)
	//*  49   78:iconst_1        
	//*  50   79:istore          5
	//*  51   81:iload           5
	//*  52   83:aload           8
	//*  53   85:arraylength     
	//*  54   86:icmpge          123
		{
			int i1 = l;
	//   55   89:iload           6
	//   56   91:istore          7
			if(ai[k] > ai[l])
	//*  57   93:aload           8
	//*  58   95:iload           5
	//*  59   97:iaload          
	//*  60   98:aload           8
	//*  61  100:iload           6
	//*  62  102:iaload          
	//*  63  103:icmple          110
				i1 = k;
	//   64  106:iload           5
	//   65  108:istore          7
			k++;
	//   66  110:iload           5
	//   67  112:iconst_1        
	//   68  113:iadd            
	//   69  114:istore          5
			l = i1;
	//   70  116:iload           7
	//   71  118:istore          6
		}

	//*  72  120:goto            81
		switch(l)
	//*  73  123:iload           6
		{
	//*  74  125:tableswitch     0 3: default 156
	//	               0 295
	//	               1 252
	//	               2 203
	//	               3 159
	//*  75  156:goto            333
		case 3: // '\003'
			mBestTextPosition[0] = padding;
	//   76  159:aload_0         
	//   77  160:getfield        #34  <Field float[] mBestTextPosition>
	//   78  163:iconst_0        
	//   79  164:aload_0         
	//   80  165:getfield        #48  <Field float padding>
	//   81  168:fastore         
			mBestTextPosition[1] = (float)((Rect) (showcaseview)).bottom + padding;
	//   82  169:aload_0         
	//   83  170:getfield        #34  <Field float[] mBestTextPosition>
	//   84  173:iconst_1        
	//   85  174:aload_3         
	//   86  175:getfield        #98  <Field int Rect.bottom>
	//   87  178:i2f             
	//   88  179:aload_0         
	//   89  180:getfield        #48  <Field float padding>
	//   90  183:fadd            
	//   91  184:fastore         
			mBestTextPosition[2] = (float)i - padding * 2.0F;
	//   92  185:aload_0         
	//   93  186:getfield        #34  <Field float[] mBestTextPosition>
	//   94  189:iconst_2        
	//   95  190:iload_1         
	//   96  191:i2f             
	//   97  192:aload_0         
	//   98  193:getfield        #48  <Field float padding>
	//   99  196:fconst_2        
	//  100  197:fmul            
	//  101  198:fsub            
	//  102  199:fastore         
			break;

	//* 103  200:goto            333
		case 2: // '\002'
			mBestTextPosition[0] = (float)((Rect) (showcaseview)).right + padding;
	//  104  203:aload_0         
	//  105  204:getfield        #34  <Field float[] mBestTextPosition>
	//  106  207:iconst_0        
	//  107  208:aload_3         
	//  108  209:getfield        #95  <Field int Rect.right>
	//  109  212:i2f             
	//  110  213:aload_0         
	//  111  214:getfield        #48  <Field float padding>
	//  112  217:fadd            
	//  113  218:fastore         
			mBestTextPosition[1] = padding;
	//  114  219:aload_0         
	//  115  220:getfield        #34  <Field float[] mBestTextPosition>
	//  116  223:iconst_1        
	//  117  224:aload_0         
	//  118  225:getfield        #48  <Field float padding>
	//  119  228:fastore         
			mBestTextPosition[2] = (float)(i - ((Rect) (showcaseview)).right) - padding * 2.0F;
	//  120  229:aload_0         
	//  121  230:getfield        #34  <Field float[] mBestTextPosition>
	//  122  233:iconst_2        
	//  123  234:iload_1         
	//  124  235:aload_3         
	//  125  236:getfield        #95  <Field int Rect.right>
	//  126  239:isub            
	//  127  240:i2f             
	//  128  241:aload_0         
	//  129  242:getfield        #48  <Field float padding>
	//  130  245:fconst_2        
	//  131  246:fmul            
	//  132  247:fsub            
	//  133  248:fastore         
			break;

	//* 134  249:goto            333
		case 1: // '\001'
			mBestTextPosition[0] = padding;
	//  135  252:aload_0         
	//  136  253:getfield        #34  <Field float[] mBestTextPosition>
	//  137  256:iconst_0        
	//  138  257:aload_0         
	//  139  258:getfield        #48  <Field float padding>
	//  140  261:fastore         
			mBestTextPosition[1] = padding + actionBarOffset;
	//  141  262:aload_0         
	//  142  263:getfield        #34  <Field float[] mBestTextPosition>
	//  143  266:iconst_1        
	//  144  267:aload_0         
	//  145  268:getfield        #48  <Field float padding>
	//  146  271:aload_0         
	//  147  272:getfield        #53  <Field float actionBarOffset>
	//  148  275:fadd            
	//  149  276:fastore         
			mBestTextPosition[2] = (float)i - padding * 2.0F;
	//  150  277:aload_0         
	//  151  278:getfield        #34  <Field float[] mBestTextPosition>
	//  152  281:iconst_2        
	//  153  282:iload_1         
	//  154  283:i2f             
	//  155  284:aload_0         
	//  156  285:getfield        #48  <Field float padding>
	//  157  288:fconst_2        
	//  158  289:fmul            
	//  159  290:fsub            
	//  160  291:fastore         
			break;

	//* 161  292:goto            333
		case 0: // '\0'
			mBestTextPosition[0] = padding;
	//  162  295:aload_0         
	//  163  296:getfield        #34  <Field float[] mBestTextPosition>
	//  164  299:iconst_0        
	//  165  300:aload_0         
	//  166  301:getfield        #48  <Field float padding>
	//  167  304:fastore         
			mBestTextPosition[1] = padding;
	//  168  305:aload_0         
	//  169  306:getfield        #34  <Field float[] mBestTextPosition>
	//  170  309:iconst_1        
	//  171  310:aload_0         
	//  172  311:getfield        #48  <Field float padding>
	//  173  314:fastore         
			mBestTextPosition[2] = (float)((Rect) (showcaseview)).left - padding * 2.0F;
	//  174  315:aload_0         
	//  175  316:getfield        #34  <Field float[] mBestTextPosition>
	//  176  319:iconst_2        
	//  177  320:aload_3         
	//  178  321:getfield        #89  <Field int Rect.left>
	//  179  324:i2f             
	//  180  325:aload_0         
	//  181  326:getfield        #48  <Field float padding>
	//  182  329:fconst_2        
	//  183  330:fmul            
	//  184  331:fsub            
	//  185  332:fastore         
			break;
		}
		if(flag)
	//* 186  333:iload           4
	//* 187  335:ifeq            426
			switch(l)
	//* 188  338:iload           6
			{
	//* 189  340:tableswitch     0 3: default 372
	//	               0 407
	//	               1 375
	//	               2 407
	//	               3 375
	//* 190  372:goto            456
			case 1: // '\001'
			case 3: // '\003'
				showcaseview = ((ShowcaseView) (mBestTextPosition));
	//  191  375:aload_0         
	//  192  376:getfield        #34  <Field float[] mBestTextPosition>
	//  193  379:astore_3        
				showcaseview[2] = showcaseview[2] / 2.0F;
	//  194  380:aload_3         
	//  195  381:iconst_2        
	//  196  382:aload_3         
	//  197  383:iconst_2        
	//  198  384:faload          
	//  199  385:fconst_2        
	//  200  386:fdiv            
	//  201  387:fastore         
				showcaseview = ((ShowcaseView) (mBestTextPosition));
	//  202  388:aload_0         
	//  203  389:getfield        #34  <Field float[] mBestTextPosition>
	//  204  392:astore_3        
				showcaseview[0] = showcaseview[0] + (float)(i / 4);
	//  205  393:aload_3         
	//  206  394:iconst_0        
	//  207  395:aload_3         
	//  208  396:iconst_0        
	//  209  397:faload          
	//  210  398:iload_1         
	//  211  399:iconst_4        
	//  212  400:idiv            
	//  213  401:i2f             
	//  214  402:fadd            
	//  215  403:fastore         
				break;

	//* 216  404:goto            456
			case 0: // '\0'
			case 2: // '\002'
				showcaseview = ((ShowcaseView) (mBestTextPosition));
	//  217  407:aload_0         
	//  218  408:getfield        #34  <Field float[] mBestTextPosition>
	//  219  411:astore_3        
				showcaseview[1] = showcaseview[1] + (float)(j / 4);
	//  220  412:aload_3         
	//  221  413:iconst_1        
	//  222  414:aload_3         
	//  223  415:iconst_1        
	//  224  416:faload          
	//  225  417:iload_2         
	//  226  418:iconst_4        
	//  227  419:idiv            
	//  228  420:i2f             
	//  229  421:fadd            
	//  230  422:fastore         
				break;
			}
		else
	//* 231  423:goto            456
		if(l == 0 || l == 2)
	//* 232  426:iload           6
	//* 233  428:ifeq            440
	//* 234  431:iload           6
	//* 235  433:iconst_2        
	//* 236  434:icmpeq          440
	//* 237  437:goto            456
		{
			showcaseview = ((ShowcaseView) (mBestTextPosition));
	//  238  440:aload_0         
	//  239  441:getfield        #34  <Field float[] mBestTextPosition>
	//  240  444:astore_3        
			showcaseview[1] = showcaseview[1] + actionBarOffset;
	//  241  445:aload_3         
	//  242  446:iconst_1        
	//  243  447:aload_3         
	//  244  448:iconst_1        
	//  245  449:faload          
	//  246  450:aload_0         
	//  247  451:getfield        #53  <Field float actionBarOffset>
	//  248  454:fadd            
	//  249  455:fastore         
		}
		hasRecalculated = true;
	//  250  456:aload_0         
	//  251  457:iconst_1        
	//  252  458:putfield        #100 <Field boolean hasRecalculated>
	//  253  461:return          
	}

	public void draw(Canvas canvas)
	{
		if(shouldDrawText())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #105 <Method boolean shouldDrawText()>
	//*   2    4:ifeq            196
		{
			float af[] = getBestTextPosition();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #109 <Method float[] getBestTextPosition()>
	//    5   11:astore_3        
			if(!TextUtils.isEmpty(mTitle))
	//*   6   12:aload_0         
	//*   7   13:getfield        #111 <Field CharSequence mTitle>
	//*   8   16:invokestatic    #117 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   9   19:ifne            92
			{
				canvas.save();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #123 <Method int Canvas.save()>
	//   12   26:pop             
				if(hasRecalculated)
	//*  13   27:aload_0         
	//*  14   28:getfield        #100 <Field boolean hasRecalculated>
	//*  15   31:ifeq            63
					mDynamicTitleLayout = new DynamicLayout(mTitle, titlePaint, (int)af[2], android.text.Layout.Alignment.ALIGN_NORMAL, 1.0F, 1.0F, true);
	//   16   34:aload_0         
	//   17   35:new             #125 <Class DynamicLayout>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:getfield        #111 <Field CharSequence mTitle>
	//   21   43:aload_0         
	//   22   44:getfield        #62  <Field TextPaint titlePaint>
	//   23   47:aload_3         
	//   24   48:iconst_2        
	//   25   49:faload          
	//   26   50:f2i             
	//   27   51:getstatic       #131 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//   28   54:fconst_1        
	//   29   55:fconst_1        
	//   30   56:iconst_1        
	//   31   57:invokespecial   #134 <Method void DynamicLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//   32   60:putfield        #136 <Field DynamicLayout mDynamicTitleLayout>
				if(mDynamicTitleLayout != null)
	//*  33   63:aload_0         
	//*  34   64:getfield        #136 <Field DynamicLayout mDynamicTitleLayout>
	//*  35   67:ifnull          92
				{
					canvas.translate(af[0], af[1]);
	//   36   70:aload_1         
	//   37   71:aload_3         
	//   38   72:iconst_0        
	//   39   73:faload          
	//   40   74:aload_3         
	//   41   75:iconst_1        
	//   42   76:faload          
	//   43   77:invokevirtual   #140 <Method void Canvas.translate(float, float)>
					mDynamicTitleLayout.draw(canvas);
	//   44   80:aload_0         
	//   45   81:getfield        #136 <Field DynamicLayout mDynamicTitleLayout>
	//   46   84:aload_1         
	//   47   85:invokevirtual   #142 <Method void DynamicLayout.draw(Canvas)>
					canvas.restore();
	//   48   88:aload_1         
	//   49   89:invokevirtual   #145 <Method void Canvas.restore()>
				}
			}
			if(!TextUtils.isEmpty(mDetails))
	//*  50   92:aload_0         
	//*  51   93:getfield        #147 <Field CharSequence mDetails>
	//*  52   96:invokestatic    #117 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  53   99:ifne            196
			{
				canvas.save();
	//   54  102:aload_1         
	//   55  103:invokevirtual   #123 <Method int Canvas.save()>
	//   56  106:pop             
				if(hasRecalculated)
	//*  57  107:aload_0         
	//*  58  108:getfield        #100 <Field boolean hasRecalculated>
	//*  59  111:ifeq            144
					mDynamicDetailLayout = new DynamicLayout(mDetails, textPaint, (int)af[2], android.text.Layout.Alignment.ALIGN_NORMAL, 1.2F, 1.0F, true);
	//   60  114:aload_0         
	//   61  115:new             #125 <Class DynamicLayout>
	//   62  118:dup             
	//   63  119:aload_0         
	//   64  120:getfield        #147 <Field CharSequence mDetails>
	//   65  123:aload_0         
	//   66  124:getfield        #68  <Field TextPaint textPaint>
	//   67  127:aload_3         
	//   68  128:iconst_2        
	//   69  129:faload          
	//   70  130:f2i             
	//   71  131:getstatic       #131 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//   72  134:ldc1            #148 <Float 1.2F>
	//   73  136:fconst_1        
	//   74  137:iconst_1        
	//   75  138:invokespecial   #134 <Method void DynamicLayout(CharSequence, TextPaint, int, android.text.Layout$Alignment, float, float, boolean)>
	//   76  141:putfield        #150 <Field DynamicLayout mDynamicDetailLayout>
				float f;
				if(mDynamicTitleLayout != null)
	//*  77  144:aload_0         
	//*  78  145:getfield        #136 <Field DynamicLayout mDynamicTitleLayout>
	//*  79  148:ifnull          163
					f = mDynamicTitleLayout.getHeight();
	//   80  151:aload_0         
	//   81  152:getfield        #136 <Field DynamicLayout mDynamicTitleLayout>
	//   82  155:invokevirtual   #153 <Method int DynamicLayout.getHeight()>
	//   83  158:i2f             
	//   84  159:fstore_2        
				else
	//*  85  160:goto            165
					f = 0.0F;
	//   86  163:fconst_0        
	//   87  164:fstore_2        
				if(mDynamicDetailLayout != null)
	//*  88  165:aload_0         
	//*  89  166:getfield        #150 <Field DynamicLayout mDynamicDetailLayout>
	//*  90  169:ifnull          196
				{
					canvas.translate(af[0], af[1] + f);
	//   91  172:aload_1         
	//   92  173:aload_3         
	//   93  174:iconst_0        
	//   94  175:faload          
	//   95  176:aload_3         
	//   96  177:iconst_1        
	//   97  178:faload          
	//   98  179:fload_2         
	//   99  180:fadd            
	//  100  181:invokevirtual   #140 <Method void Canvas.translate(float, float)>
					mDynamicDetailLayout.draw(canvas);
	//  101  184:aload_0         
	//  102  185:getfield        #150 <Field DynamicLayout mDynamicDetailLayout>
	//  103  188:aload_1         
	//  104  189:invokevirtual   #142 <Method void DynamicLayout.draw(Canvas)>
					canvas.restore();
	//  105  192:aload_1         
	//  106  193:invokevirtual   #145 <Method void Canvas.restore()>
				}
			}
		}
		hasRecalculated = false;
	//  107  196:aload_0         
	//  108  197:iconst_0        
	//  109  198:putfield        #100 <Field boolean hasRecalculated>
	//  110  201:return          
	}

	public float[] getBestTextPosition()
	{
		return mBestTextPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field float[] mBestTextPosition>
	//    2    4:areturn         
	}

	public CharSequence getContentText()
	{
		return mDetails;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field CharSequence mDetails>
	//    2    4:areturn         
	}

	public CharSequence getContentTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public void setContentText(CharSequence charsequence)
	{
		if(charsequence != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          32
		{
			charsequence = ((CharSequence) (new SpannableString(charsequence)));
	//    2    4:new             #160 <Class SpannableString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #162 <Method void SpannableString(CharSequence)>
	//    6   12:astore_1        
			((SpannableString) (charsequence)).setSpan(((Object) (mDetailSpan)), 0, ((SpannableString) (charsequence)).length(), 0);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #164 <Field TextAppearanceSpan mDetailSpan>
	//   10   18:iconst_0        
	//   11   19:aload_1         
	//   12   20:invokevirtual   #167 <Method int SpannableString.length()>
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #171 <Method void SpannableString.setSpan(Object, int, int, int)>
			mDetails = charsequence;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #147 <Field CharSequence mDetails>
		}
	//   18   32:return          
	}

	public void setContentTitle(CharSequence charsequence)
	{
		if(charsequence != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          32
		{
			charsequence = ((CharSequence) (new SpannableString(charsequence)));
	//    2    4:new             #160 <Class SpannableString>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #162 <Method void SpannableString(CharSequence)>
	//    6   12:astore_1        
			((SpannableString) (charsequence)).setSpan(((Object) (mTitleSpan)), 0, ((SpannableString) (charsequence)).length(), 0);
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #174 <Field TextAppearanceSpan mTitleSpan>
	//   10   18:iconst_0        
	//   11   19:aload_1         
	//   12   20:invokevirtual   #167 <Method int SpannableString.length()>
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #171 <Method void SpannableString.setSpan(Object, int, int, int)>
			mTitle = charsequence;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:putfield        #111 <Field CharSequence mTitle>
		}
	//   18   32:return          
	}

	public void setDetailStyling(int i)
	{
		mDetailSpan = new TextAppearanceSpan(context, i);
	//    0    0:aload_0         
	//    1    1:new             #178 <Class TextAppearanceSpan>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field Context context>
	//    5    9:iload_1         
	//    6   10:invokespecial   #181 <Method void TextAppearanceSpan(Context, int)>
	//    7   13:putfield        #164 <Field TextAppearanceSpan mDetailSpan>
		setContentText(mDetails);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #147 <Field CharSequence mDetails>
	//   11   21:invokevirtual   #183 <Method void setContentText(CharSequence)>
	//   12   24:return          
	}

	public void setTitleStyling(int i)
	{
		mTitleSpan = new TextAppearanceSpan(context, i);
	//    0    0:aload_0         
	//    1    1:new             #178 <Class TextAppearanceSpan>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #57  <Field Context context>
	//    5    9:iload_1         
	//    6   10:invokespecial   #181 <Method void TextAppearanceSpan(Context, int)>
	//    7   13:putfield        #174 <Field TextAppearanceSpan mTitleSpan>
		setContentTitle(mTitle);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #111 <Field CharSequence mTitle>
	//   11   21:invokevirtual   #186 <Method void setContentTitle(CharSequence)>
	//   12   24:return          
	}

	public boolean shouldDrawText()
	{
		return !TextUtils.isEmpty(mTitle) || !TextUtils.isEmpty(mDetails);
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field CharSequence mTitle>
	//    2    4:invokestatic    #117 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:ifeq            25
	//    4   10:aload_0         
	//    5   11:getfield        #147 <Field CharSequence mDetails>
	//    6   14:invokestatic    #117 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    7   17:ifne            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	private final float actionBarOffset;
	private final ShowcaseAreaCalculator calculator;
	private final Context context;
	private boolean hasRecalculated;
	private float mBestTextPosition[];
	private TextAppearanceSpan mDetailSpan;
	private CharSequence mDetails;
	private DynamicLayout mDynamicDetailLayout;
	private DynamicLayout mDynamicTitleLayout;
	private CharSequence mTitle;
	private TextAppearanceSpan mTitleSpan;
	private final float padding;
	private final TextPaint textPaint = new TextPaint();
	private final TextPaint titlePaint = new TextPaint();
}
