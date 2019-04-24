// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.interfaces.datasets.*;
import com.github.mikephil.charting.utils.*;
import java.util.*;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			Renderer

public class LegendRenderer extends Renderer
{

	public LegendRenderer(ViewPortHandler viewporthandler, Legend legend)
	{
		super(viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void Renderer(ViewPortHandler)>
		mLegend = legend;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Legend mLegend>
		mLegendLabelPaint = new Paint(1);
	//    6   10:aload_0         
	//    7   11:new             #20  <Class Paint>
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:invokespecial   #23  <Method void Paint(int)>
	//   11   19:putfield        #25  <Field Paint mLegendLabelPaint>
		mLegendLabelPaint.setTextSize(Utils.convertDpToPixel(9F));
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field Paint mLegendLabelPaint>
	//   14   26:ldc1            #26  <Float 9F>
	//   15   28:invokestatic    #32  <Method float Utils.convertDpToPixel(float)>
	//   16   31:invokevirtual   #36  <Method void Paint.setTextSize(float)>
		mLegendLabelPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   17   34:aload_0         
	//   18   35:getfield        #25  <Field Paint mLegendLabelPaint>
	//   19   38:getstatic       #42  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   20   41:invokevirtual   #46  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		mLegendFormPaint = new Paint(1);
	//   21   44:aload_0         
	//   22   45:new             #20  <Class Paint>
	//   23   48:dup             
	//   24   49:iconst_1        
	//   25   50:invokespecial   #23  <Method void Paint(int)>
	//   26   53:putfield        #48  <Field Paint mLegendFormPaint>
		mLegendFormPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   27   56:aload_0         
	//   28   57:getfield        #48  <Field Paint mLegendFormPaint>
	//   29   60:getstatic       #54  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   30   63:invokevirtual   #58  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mLegendFormPaint.setStrokeWidth(3F);
	//   31   66:aload_0         
	//   32   67:getfield        #48  <Field Paint mLegendFormPaint>
	//   33   70:ldc1            #59  <Float 3F>
	//   34   72:invokevirtual   #62  <Method void Paint.setStrokeWidth(float)>
	//   35   75:return          
	}

	public void computeLegend(ChartData chartdata)
	{
		if(!mLegend.isLegendCustom())
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Legend mLegend>
	//*   2    4:invokevirtual   #71  <Method boolean Legend.isLegendCustom()>
	//*   3    7:ifne            613
		{
			ArrayList arraylist = new ArrayList();
	//    4   10:new             #73  <Class ArrayList>
	//    5   13:dup             
	//    6   14:invokespecial   #76  <Method void ArrayList()>
	//    7   17:astore          5
			ArrayList arraylist1 = new ArrayList();
	//    8   19:new             #73  <Class ArrayList>
	//    9   22:dup             
	//   10   23:invokespecial   #76  <Method void ArrayList()>
	//   11   26:astore          6
			int i = 0;
	//   12   28:iconst_0        
	//   13   29:istore_2        
			while(i < chartdata.getDataSetCount()) 
	//*  14   30:iload_2         
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #82  <Method int ChartData.getDataSetCount()>
	//*  17   35:icmpge          523
			{
				Object obj = ((Object) (chartdata.getDataSetByIndex(i)));
	//   18   38:aload_1         
	//   19   39:iload_2         
	//   20   40:invokevirtual   #86  <Method IDataSet ChartData.getDataSetByIndex(int)>
	//   21   43:astore          9
				List list = ((IDataSet) (obj)).getColors();
	//   22   45:aload           9
	//   23   47:invokeinterface #92  <Method List IDataSet.getColors()>
	//   24   52:astore          7
				int k1 = ((IDataSet) (obj)).getEntryCount();
	//   25   54:aload           9
	//   26   56:invokeinterface #95  <Method int IDataSet.getEntryCount()>
	//   27   61:istore          4
				if((obj instanceof IBarDataSet) && ((IBarDataSet)obj).isStacked())
	//*  28   63:aload           9
	//*  29   65:instanceof      #97  <Class IBarDataSet>
	//*  30   68:ifeq            208
	//*  31   71:aload           9
	//*  32   73:checkcast       #97  <Class IBarDataSet>
	//*  33   76:invokeinterface #100 <Method boolean IBarDataSet.isStacked()>
	//*  34   81:ifeq            208
				{
					IBarDataSet ibardataset = (IBarDataSet)obj;
	//   35   84:aload           9
	//   36   86:checkcast       #97  <Class IBarDataSet>
	//   37   89:astore          8
					obj = ((Object) (ibardataset.getStackLabels()));
	//   38   91:aload           8
	//   39   93:invokeinterface #104 <Method String[] IBarDataSet.getStackLabels()>
	//   40   98:astore          9
					for(int k = 0; k < list.size() && k < ibardataset.getStackSize(); k++)
	//*  41  100:iconst_0        
	//*  42  101:istore_3        
	//*  43  102:iload_3         
	//*  44  103:aload           7
	//*  45  105:invokeinterface #109 <Method int List.size()>
	//*  46  110:icmpge          163
	//*  47  113:iload_3         
	//*  48  114:aload           8
	//*  49  116:invokeinterface #112 <Method int IBarDataSet.getStackSize()>
	//*  50  121:icmpge          163
					{
						((List) (arraylist)).add(((Object) (obj[k % obj.length])));
	//   51  124:aload           5
	//   52  126:aload           9
	//   53  128:iload_3         
	//   54  129:aload           9
	//   55  131:arraylength     
	//   56  132:irem            
	//   57  133:aaload          
	//   58  134:invokeinterface #116 <Method boolean List.add(Object)>
	//   59  139:pop             
						((List) (arraylist1)).add(list.get(k));
	//   60  140:aload           6
	//   61  142:aload           7
	//   62  144:iload_3         
	//   63  145:invokeinterface #120 <Method Object List.get(int)>
	//   64  150:invokeinterface #116 <Method boolean List.add(Object)>
	//   65  155:pop             
					}

	//   66  156:iload_3         
	//   67  157:iconst_1        
	//   68  158:iadd            
	//   69  159:istore_3        
	//*  70  160:goto            102
					if(ibardataset.getLabel() != null)
	//*  71  163:aload           8
	//*  72  165:invokeinterface #124 <Method String IBarDataSet.getLabel()>
	//*  73  170:ifnull          201
					{
						((List) (arraylist1)).add(((Object) (Integer.valueOf(-2))));
	//   74  173:aload           6
	//   75  175:bipush          -2
	//   76  177:invokestatic    #130 <Method Integer Integer.valueOf(int)>
	//   77  180:invokeinterface #116 <Method boolean List.add(Object)>
	//   78  185:pop             
						((List) (arraylist)).add(((Object) (ibardataset.getLabel())));
	//   79  186:aload           5
	//   80  188:aload           8
	//   81  190:invokeinterface #124 <Method String IBarDataSet.getLabel()>
	//   82  195:invokeinterface #116 <Method boolean List.add(Object)>
	//   83  200:pop             
					}
				} else
	//*  84  201:iload_2         
	//*  85  202:iconst_1        
	//*  86  203:iadd            
	//*  87  204:istore_2        
	//*  88  205:goto            30
				if(obj instanceof IPieDataSet)
	//*  89  208:aload           9
	//*  90  210:instanceof      #132 <Class IPieDataSet>
	//*  91  213:ifeq            339
				{
					List list1 = chartdata.getXVals();
	//   92  216:aload_1         
	//   93  217:invokevirtual   #135 <Method List ChartData.getXVals()>
	//   94  220:astore          8
					obj = ((Object) ((IPieDataSet)obj));
	//   95  222:aload           9
	//   96  224:checkcast       #132 <Class IPieDataSet>
	//   97  227:astore          9
					for(int l = 0; l < list.size() && l < k1 && l < list1.size(); l++)
	//*  98  229:iconst_0        
	//*  99  230:istore_3        
	//* 100  231:iload_3         
	//* 101  232:aload           7
	//* 102  234:invokeinterface #109 <Method int List.size()>
	//* 103  239:icmpge          298
	//* 104  242:iload_3         
	//* 105  243:iload           4
	//* 106  245:icmpge          298
	//* 107  248:iload_3         
	//* 108  249:aload           8
	//* 109  251:invokeinterface #109 <Method int List.size()>
	//* 110  256:icmpge          298
					{
						((List) (arraylist)).add(list1.get(l));
	//  111  259:aload           5
	//  112  261:aload           8
	//  113  263:iload_3         
	//  114  264:invokeinterface #120 <Method Object List.get(int)>
	//  115  269:invokeinterface #116 <Method boolean List.add(Object)>
	//  116  274:pop             
						((List) (arraylist1)).add(list.get(l));
	//  117  275:aload           6
	//  118  277:aload           7
	//  119  279:iload_3         
	//  120  280:invokeinterface #120 <Method Object List.get(int)>
	//  121  285:invokeinterface #116 <Method boolean List.add(Object)>
	//  122  290:pop             
					}

	//  123  291:iload_3         
	//  124  292:iconst_1        
	//  125  293:iadd            
	//  126  294:istore_3        
	//* 127  295:goto            231
					if(((IPieDataSet) (obj)).getLabel() != null)
	//* 128  298:aload           9
	//* 129  300:invokeinterface #136 <Method String IPieDataSet.getLabel()>
	//* 130  305:ifnull          201
					{
						((List) (arraylist1)).add(((Object) (Integer.valueOf(-2))));
	//  131  308:aload           6
	//  132  310:bipush          -2
	//  133  312:invokestatic    #130 <Method Integer Integer.valueOf(int)>
	//  134  315:invokeinterface #116 <Method boolean List.add(Object)>
	//  135  320:pop             
						((List) (arraylist)).add(((Object) (((IPieDataSet) (obj)).getLabel())));
	//  136  321:aload           5
	//  137  323:aload           9
	//  138  325:invokeinterface #136 <Method String IPieDataSet.getLabel()>
	//  139  330:invokeinterface #116 <Method boolean List.add(Object)>
	//  140  335:pop             
					}
				} else
	//* 141  336:goto            201
				if((obj instanceof ICandleDataSet) && ((ICandleDataSet)obj).getDecreasingColor() != -1)
	//* 142  339:aload           9
	//* 143  341:instanceof      #138 <Class ICandleDataSet>
	//* 144  344:ifeq            430
	//* 145  347:aload           9
	//* 146  349:checkcast       #138 <Class ICandleDataSet>
	//* 147  352:invokeinterface #141 <Method int ICandleDataSet.getDecreasingColor()>
	//* 148  357:iconst_m1       
	//* 149  358:icmpeq          430
				{
					((List) (arraylist1)).add(((Object) (Integer.valueOf(((ICandleDataSet)obj).getDecreasingColor()))));
	//  150  361:aload           6
	//  151  363:aload           9
	//  152  365:checkcast       #138 <Class ICandleDataSet>
	//  153  368:invokeinterface #141 <Method int ICandleDataSet.getDecreasingColor()>
	//  154  373:invokestatic    #130 <Method Integer Integer.valueOf(int)>
	//  155  376:invokeinterface #116 <Method boolean List.add(Object)>
	//  156  381:pop             
					((List) (arraylist1)).add(((Object) (Integer.valueOf(((ICandleDataSet)obj).getIncreasingColor()))));
	//  157  382:aload           6
	//  158  384:aload           9
	//  159  386:checkcast       #138 <Class ICandleDataSet>
	//  160  389:invokeinterface #144 <Method int ICandleDataSet.getIncreasingColor()>
	//  161  394:invokestatic    #130 <Method Integer Integer.valueOf(int)>
	//  162  397:invokeinterface #116 <Method boolean List.add(Object)>
	//  163  402:pop             
					((List) (arraylist)).add(((Object) (null)));
	//  164  403:aload           5
	//  165  405:aconst_null     
	//  166  406:invokeinterface #116 <Method boolean List.add(Object)>
	//  167  411:pop             
					((List) (arraylist)).add(((Object) (((IDataSet) (obj)).getLabel())));
	//  168  412:aload           5
	//  169  414:aload           9
	//  170  416:invokeinterface #145 <Method String IDataSet.getLabel()>
	//  171  421:invokeinterface #116 <Method boolean List.add(Object)>
	//  172  426:pop             
				} else
	//* 173  427:goto            201
				{
					int i1 = 0;
	//  174  430:iconst_0        
	//  175  431:istore_3        
					while(i1 < list.size() && i1 < k1) 
	//* 176  432:iload_3         
	//* 177  433:aload           7
	//* 178  435:invokeinterface #109 <Method int List.size()>
	//* 179  440:icmpge          201
	//* 180  443:iload_3         
	//* 181  444:iload           4
	//* 182  446:icmpge          201
					{
						if(i1 < list.size() - 1 && i1 < k1 - 1)
	//* 183  449:iload_3         
	//* 184  450:aload           7
	//* 185  452:invokeinterface #109 <Method int List.size()>
	//* 186  457:iconst_1        
	//* 187  458:isub            
	//* 188  459:icmpge          502
	//* 189  462:iload_3         
	//* 190  463:iload           4
	//* 191  465:iconst_1        
	//* 192  466:isub            
	//* 193  467:icmpge          502
							((List) (arraylist)).add(((Object) (null)));
	//  194  470:aload           5
	//  195  472:aconst_null     
	//  196  473:invokeinterface #116 <Method boolean List.add(Object)>
	//  197  478:pop             
						else
	//* 198  479:aload           6
	//* 199  481:aload           7
	//* 200  483:iload_3         
	//* 201  484:invokeinterface #120 <Method Object List.get(int)>
	//* 202  489:invokeinterface #116 <Method boolean List.add(Object)>
	//* 203  494:pop             
	//* 204  495:iload_3         
	//* 205  496:iconst_1        
	//* 206  497:iadd            
	//* 207  498:istore_3        
	//* 208  499:goto            432
							((List) (arraylist)).add(((Object) (chartdata.getDataSetByIndex(i).getLabel())));
	//  209  502:aload           5
	//  210  504:aload_1         
	//  211  505:iload_2         
	//  212  506:invokevirtual   #86  <Method IDataSet ChartData.getDataSetByIndex(int)>
	//  213  509:invokeinterface #145 <Method String IDataSet.getLabel()>
	//  214  514:invokeinterface #116 <Method boolean List.add(Object)>
	//  215  519:pop             
						((List) (arraylist1)).add(list.get(i1));
						i1++;
					}
				}
				i++;
			}
	//* 216  520:goto            479
			if(mLegend.getExtraColors() != null && mLegend.getExtraLabels() != null)
	//* 217  523:aload_0         
	//* 218  524:getfield        #18  <Field Legend mLegend>
	//* 219  527:invokevirtual   #149 <Method int[] Legend.getExtraColors()>
	//* 220  530:ifnull          595
	//* 221  533:aload_0         
	//* 222  534:getfield        #18  <Field Legend mLegend>
	//* 223  537:invokevirtual   #152 <Method String[] Legend.getExtraLabels()>
	//* 224  540:ifnull          595
			{
				chartdata = ((ChartData) (mLegend.getExtraColors()));
	//  225  543:aload_0         
	//  226  544:getfield        #18  <Field Legend mLegend>
	//  227  547:invokevirtual   #149 <Method int[] Legend.getExtraColors()>
	//  228  550:astore_1        
				int j1 = chartdata.length;
	//  229  551:aload_1         
	//  230  552:arraylength     
	//  231  553:istore_3        
				for(int j = 0; j < j1; j++)
	//* 232  554:iconst_0        
	//* 233  555:istore_2        
	//* 234  556:iload_2         
	//* 235  557:iload_3         
	//* 236  558:icmpge          582
					((List) (arraylist1)).add(((Object) (Integer.valueOf(chartdata[j]))));
	//  237  561:aload           6
	//  238  563:aload_1         
	//  239  564:iload_2         
	//  240  565:iaload          
	//  241  566:invokestatic    #130 <Method Integer Integer.valueOf(int)>
	//  242  569:invokeinterface #116 <Method boolean List.add(Object)>
	//  243  574:pop             

	//  244  575:iload_2         
	//  245  576:iconst_1        
	//  246  577:iadd            
	//  247  578:istore_2        
	//* 248  579:goto            556
				Collections.addAll(((java.util.Collection) (arraylist)), ((Object []) (mLegend.getExtraLabels())));
	//  249  582:aload           5
	//  250  584:aload_0         
	//  251  585:getfield        #18  <Field Legend mLegend>
	//  252  588:invokevirtual   #152 <Method String[] Legend.getExtraLabels()>
	//  253  591:invokestatic    #158 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//  254  594:pop             
			}
			mLegend.setComputedColors(((List) (arraylist1)));
	//  255  595:aload_0         
	//  256  596:getfield        #18  <Field Legend mLegend>
	//  257  599:aload           6
	//  258  601:invokevirtual   #162 <Method void Legend.setComputedColors(List)>
			mLegend.setComputedLabels(((List) (arraylist)));
	//  259  604:aload_0         
	//  260  605:getfield        #18  <Field Legend mLegend>
	//  261  608:aload           5
	//  262  610:invokevirtual   #165 <Method void Legend.setComputedLabels(List)>
		}
		chartdata = ((ChartData) (mLegend.getTypeface()));
	//  263  613:aload_0         
	//  264  614:getfield        #18  <Field Legend mLegend>
	//  265  617:invokevirtual   #169 <Method android.graphics.Typeface Legend.getTypeface()>
	//  266  620:astore_1        
		if(chartdata != null)
	//* 267  621:aload_1         
	//* 268  622:ifnull          634
			mLegendLabelPaint.setTypeface(((android.graphics.Typeface) (chartdata)));
	//  269  625:aload_0         
	//  270  626:getfield        #25  <Field Paint mLegendLabelPaint>
	//  271  629:aload_1         
	//  272  630:invokevirtual   #173 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//  273  633:pop             
		mLegendLabelPaint.setTextSize(mLegend.getTextSize());
	//  274  634:aload_0         
	//  275  635:getfield        #25  <Field Paint mLegendLabelPaint>
	//  276  638:aload_0         
	//  277  639:getfield        #18  <Field Legend mLegend>
	//  278  642:invokevirtual   #177 <Method float Legend.getTextSize()>
	//  279  645:invokevirtual   #36  <Method void Paint.setTextSize(float)>
		mLegendLabelPaint.setColor(mLegend.getTextColor());
	//  280  648:aload_0         
	//  281  649:getfield        #25  <Field Paint mLegendLabelPaint>
	//  282  652:aload_0         
	//  283  653:getfield        #18  <Field Legend mLegend>
	//  284  656:invokevirtual   #180 <Method int Legend.getTextColor()>
	//  285  659:invokevirtual   #183 <Method void Paint.setColor(int)>
		mLegend.calculateDimensions(mLegendLabelPaint, mViewPortHandler);
	//  286  662:aload_0         
	//  287  663:getfield        #18  <Field Legend mLegend>
	//  288  666:aload_0         
	//  289  667:getfield        #25  <Field Paint mLegendLabelPaint>
	//  290  670:aload_0         
	//  291  671:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//  292  674:invokevirtual   #191 <Method void Legend.calculateDimensions(Paint, ViewPortHandler)>
	//  293  677:return          
	}

	protected void drawForm(Canvas canvas, float f, float f1, int i, Legend legend)
	{
		if(legend.getColors()[i] == -2)
	//*   0    0:aload           5
	//*   1    2:invokevirtual   #197 <Method int[] Legend.getColors()>
	//*   2    5:iload           4
	//*   3    7:iaload          
	//*   4    8:bipush          -2
	//*   5   10:icmpne          14
			return;
	//    6   13:return          
		mLegendFormPaint.setColor(legend.getColors()[i]);
	//    7   14:aload_0         
	//    8   15:getfield        #48  <Field Paint mLegendFormPaint>
	//    9   18:aload           5
	//   10   20:invokevirtual   #197 <Method int[] Legend.getColors()>
	//   11   23:iload           4
	//   12   25:iaload          
	//   13   26:invokevirtual   #183 <Method void Paint.setColor(int)>
		float f2 = legend.getFormSize();
	//   14   29:aload           5
	//   15   31:invokevirtual   #200 <Method float Legend.getFormSize()>
	//   16   34:fstore          6
		float f3 = f2 / 2.0F;
	//   17   36:fload           6
	//   18   38:fconst_2        
	//   19   39:fdiv            
	//   20   40:fstore          7
		static class _cls1
		{

			static final int $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[];
			static final int $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[];

			static 
			{
				$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm = new int[com.github.mikephil.charting.components.Legend.LegendForm.values().length];
			//    0    0:invokestatic    #19  <Method com.github.mikephil.charting.components.Legend$LegendForm[] com.github.mikephil.charting.components.Legend$LegendForm.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm>
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[com.github.mikephil.charting.components.Legend.LegendForm.CIRCLE.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm>
			//    5   12:getstatic       #25  <Field com.github.mikephil.charting.components.Legend$LegendForm com.github.mikephil.charting.components.Legend$LegendForm.CIRCLE>
			//    6   15:invokevirtual   #29  <Method int com.github.mikephil.charting.components.Legend$LegendForm.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm>
			//*  10   23:getstatic       #32  <Field com.github.mikephil.charting.components.Legend$LegendForm com.github.mikephil.charting.components.Legend$LegendForm.SQUARE>
			//*  11   26:invokevirtual   #29  <Method int com.github.mikephil.charting.components.Legend$LegendForm.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm>
			//*  15   34:getstatic       #35  <Field com.github.mikephil.charting.components.Legend$LegendForm com.github.mikephil.charting.components.Legend$LegendForm.LINE>
			//*  16   37:invokevirtual   #29  <Method int com.github.mikephil.charting.components.Legend$LegendForm.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:invokestatic    #40  <Method com.github.mikephil.charting.components.Legend$LegendPosition[] com.github.mikephil.charting.components.Legend$LegendPosition.values()>
			//*  20   45:arraylength     
			//*  21   46:newarray        int[]
			//*  22   48:putstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  23   51:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  24   54:getstatic       #46  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_LEFT>
			//*  25   57:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  26   60:iconst_1        
			//*  27   61:iastore         
			//*  28   62:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  29   65:getstatic       #50  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_RIGHT>
			//*  30   68:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  31   71:iconst_2        
			//*  32   72:iastore         
			//*  33   73:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  34   76:getstatic       #53  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_CENTER>
			//*  35   79:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  36   82:iconst_3        
			//*  37   83:iastore         
			//*  38   84:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  39   87:getstatic       #56  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_LEFT>
			//*  40   90:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  41   93:iconst_4        
			//*  42   94:iastore         
			//*  43   95:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  44   98:getstatic       #59  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_RIGHT>
			//*  45  101:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  46  104:iconst_5        
			//*  47  105:iastore         
			//*  48  106:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  49  109:getstatic       #62  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_CENTER>
			//*  50  112:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  51  115:bipush          6
			//*  52  117:iastore         
			//*  53  118:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  54  121:getstatic       #65  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.PIECHART_CENTER>
			//*  55  124:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  56  127:bipush          7
			//*  57  129:iastore         
			//*  58  130:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  59  133:getstatic       #68  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART>
			//*  60  136:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  61  139:bipush          8
			//*  62  141:iastore         
			//*  63  142:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  64  145:getstatic       #71  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_CENTER>
			//*  65  148:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  66  151:bipush          9
			//*  67  153:iastore         
			//*  68  154:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  69  157:getstatic       #74  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_INSIDE>
			//*  70  160:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  71  163:bipush          10
			//*  72  165:iastore         
			//*  73  166:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  74  169:getstatic       #77  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART>
			//*  75  172:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  76  175:bipush          11
			//*  77  177:iastore         
			//*  78  178:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  79  181:getstatic       #80  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART_CENTER>
			//*  80  184:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  81  187:bipush          12
			//*  82  189:iastore         
			//*  83  190:getstatic       #42  <Field int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
			//*  84  193:getstatic       #83  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART_INSIDE>
			//*  85  196:invokevirtual   #47  <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
			//*  86  199:bipush          13
			//*  87  201:iastore         
			//*  88  202:return          
			//*  89  203:astore_0        
			//*  90  204:return          
			//*  91  205:astore_0        
			//*  92  206:goto            190
			//*  93  209:astore_0        
			//*  94  210:goto            178
			//*  95  213:astore_0        
			//*  96  214:goto            166
			//*  97  217:astore_0        
			//*  98  218:goto            154
			//*  99  221:astore_0        
			//* 100  222:goto            142
			//* 101  225:astore_0        
			//* 102  226:goto            130
			//* 103  229:astore_0        
			//* 104  230:goto            118
			//* 105  233:astore_0        
			//* 106  234:goto            106
			//* 107  237:astore_0        
			//* 108  238:goto            95
			//* 109  241:astore_0        
			//* 110  242:goto            84
			//* 111  245:astore_0        
			//* 112  246:goto            73
			//* 113  249:astore_0        
			//* 114  250:goto            62
			//* 115  253:astore_0        
			//* 116  254:goto            42
			//* 117  257:astore_0        
			//* 118  258:goto            31
				catch(NoSuchFieldError nosuchfielderror15) { }
			//  119  261:astore_0        
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[com.github.mikephil.charting.components.Legend.LegendForm.SQUARE.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror14) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm[com.github.mikephil.charting.components.Legend.LegendForm.LINE.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror13) { }
				$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition = new int[com.github.mikephil.charting.components.Legend.LegendPosition.values().length];
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT.ordinal()] = 1;
				}
				catch(NoSuchFieldError nosuchfielderror12) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror11) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_CENTER.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror10) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror9) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT.ordinal()] = 5;
				}
				catch(NoSuchFieldError nosuchfielderror8) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_CENTER.ordinal()] = 6;
				}
				catch(NoSuchFieldError nosuchfielderror7) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.PIECHART_CENTER.ordinal()] = 7;
				}
				catch(NoSuchFieldError nosuchfielderror6) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART.ordinal()] = 8;
				}
				catch(NoSuchFieldError nosuchfielderror5) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER.ordinal()] = 9;
				}
				catch(NoSuchFieldError nosuchfielderror4) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_INSIDE.ordinal()] = 10;
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART.ordinal()] = 11;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER.ordinal()] = 12;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition[com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_INSIDE.ordinal()] = 13;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//* 120  262:goto            20
			}
		}

		switch(_cls1..SwitchMap.com.github.mikephil.charting.components.Legend.LegendForm[legend.getForm().ordinal()])
	//*  21   42:getstatic       #204 <Field int[] LegendRenderer$1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendForm>
	//*  22   45:aload           5
	//*  23   47:invokevirtual   #208 <Method com.github.mikephil.charting.components.Legend$LegendForm Legend.getForm()>
	//*  24   50:invokevirtual   #213 <Method int com.github.mikephil.charting.components.Legend$LegendForm.ordinal()>
	//*  25   53:iaload          
		{
	//*  26   54:tableswitch     1 3: default 80
	//	               1 81
	//	               2 97
	//	               3 119
		default:
			return;
	//   27   80:return          

		case 1: // '\001'
			canvas.drawCircle(f + f3, f1, f3, mLegendFormPaint);
	//   28   81:aload_1         
	//   29   82:fload_2         
	//   30   83:fload           7
	//   31   85:fadd            
	//   32   86:fload_3         
	//   33   87:fload           7
	//   34   89:aload_0         
	//   35   90:getfield        #48  <Field Paint mLegendFormPaint>
	//   36   93:invokevirtual   #219 <Method void Canvas.drawCircle(float, float, float, Paint)>
			return;
	//   37   96:return          

		case 2: // '\002'
			canvas.drawRect(f, f1 - f3, f + f2, f1 + f3, mLegendFormPaint);
	//   38   97:aload_1         
	//   39   98:fload_2         
	//   40   99:fload_3         
	//   41  100:fload           7
	//   42  102:fsub            
	//   43  103:fload_2         
	//   44  104:fload           6
	//   45  106:fadd            
	//   46  107:fload_3         
	//   47  108:fload           7
	//   48  110:fadd            
	//   49  111:aload_0         
	//   50  112:getfield        #48  <Field Paint mLegendFormPaint>
	//   51  115:invokevirtual   #223 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			return;
	//   52  118:return          

		case 3: // '\003'
			canvas.drawLine(f, f1, f + f2, f1, mLegendFormPaint);
	//   53  119:aload_1         
	//   54  120:fload_2         
	//   55  121:fload_3         
	//   56  122:fload_2         
	//   57  123:fload           6
	//   58  125:fadd            
	//   59  126:fload_3         
	//   60  127:aload_0         
	//   61  128:getfield        #48  <Field Paint mLegendFormPaint>
	//   62  131:invokevirtual   #226 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			break;
		}
	//   63  134:return          
	}

	protected void drawLabel(Canvas canvas, float f, float f1, String s)
	{
		canvas.drawText(s, f, f1, mLegendLabelPaint);
	//    0    0:aload_1         
	//    1    1:aload           4
	//    2    3:fload_2         
	//    3    4:fload_3         
	//    4    5:aload_0         
	//    5    6:getfield        #25  <Field Paint mLegendLabelPaint>
	//    6    9:invokevirtual   #232 <Method void Canvas.drawText(String, float, float, Paint)>
	//    7   12:return          
	}

	public Paint getFormPaint()
	{
		return mLegendFormPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Paint mLegendFormPaint>
	//    2    4:areturn         
	}

	public Paint getLabelPaint()
	{
		return mLegendLabelPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Paint mLegendLabelPaint>
	//    2    4:areturn         
	}

	public void renderLegend(Canvas canvas)
	{
		if(mLegend.isEnabled()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Legend mLegend>
	//    2    4:invokevirtual   #240 <Method boolean Legend.isEnabled()>
	//    3    7:ifne            11
_L1:
		return;
	//    4   10:return          
_L2:
		float f2;
		float f5;
		float f6;
		float f9;
		float f10;
		float f11;
		float f12;
		float f13;
		float f14;
		String as[];
		int ai[];
		com.github.mikephil.charting.components.Legend.LegendDirection legenddirection;
		Object obj;
		android.graphics.Typeface typeface = mLegend.getTypeface();
	//    5   11:aload_0         
	//    6   12:getfield        #18  <Field Legend mLegend>
	//    7   15:invokevirtual   #169 <Method android.graphics.Typeface Legend.getTypeface()>
	//    8   18:astore          20
		if(typeface != null)
	//*   9   20:aload           20
	//*  10   22:ifnull          35
			mLegendLabelPaint.setTypeface(typeface);
	//   11   25:aload_0         
	//   12   26:getfield        #25  <Field Paint mLegendLabelPaint>
	//   13   29:aload           20
	//   14   31:invokevirtual   #173 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   15   34:pop             
		mLegendLabelPaint.setTextSize(mLegend.getTextSize());
	//   16   35:aload_0         
	//   17   36:getfield        #25  <Field Paint mLegendLabelPaint>
	//   18   39:aload_0         
	//   19   40:getfield        #18  <Field Legend mLegend>
	//   20   43:invokevirtual   #177 <Method float Legend.getTextSize()>
	//   21   46:invokevirtual   #36  <Method void Paint.setTextSize(float)>
		mLegendLabelPaint.setColor(mLegend.getTextColor());
	//   22   49:aload_0         
	//   23   50:getfield        #25  <Field Paint mLegendLabelPaint>
	//   24   53:aload_0         
	//   25   54:getfield        #18  <Field Legend mLegend>
	//   26   57:invokevirtual   #180 <Method int Legend.getTextColor()>
	//   27   60:invokevirtual   #183 <Method void Paint.setColor(int)>
		f11 = Utils.getLineHeight(mLegendLabelPaint);
	//   28   63:aload_0         
	//   29   64:getfield        #25  <Field Paint mLegendLabelPaint>
	//   30   67:invokestatic    #244 <Method float Utils.getLineHeight(Paint)>
	//   31   70:fstore          10
		f12 = Utils.getLineSpacing(mLegendLabelPaint) + mLegend.getYEntrySpace();
	//   32   72:aload_0         
	//   33   73:getfield        #25  <Field Paint mLegendLabelPaint>
	//   34   76:invokestatic    #247 <Method float Utils.getLineSpacing(Paint)>
	//   35   79:aload_0         
	//   36   80:getfield        #18  <Field Legend mLegend>
	//   37   83:invokevirtual   #250 <Method float Legend.getYEntrySpace()>
	//   38   86:fadd            
	//   39   87:fstore          11
		f13 = f11 - (float)Utils.calcTextHeight(mLegendLabelPaint, "ABC") / 2.0F;
	//   40   89:fload           10
	//   41   91:aload_0         
	//   42   92:getfield        #25  <Field Paint mLegendLabelPaint>
	//   43   95:ldc1            #252 <String "ABC">
	//   44   97:invokestatic    #256 <Method int Utils.calcTextHeight(Paint, String)>
	//   45  100:i2f             
	//   46  101:fconst_2        
	//   47  102:fdiv            
	//   48  103:fsub            
	//   49  104:fstore          12
		as = mLegend.getLabels();
	//   50  106:aload_0         
	//   51  107:getfield        #18  <Field Legend mLegend>
	//   52  110:invokevirtual   #259 <Method String[] Legend.getLabels()>
	//   53  113:astore          20
		ai = mLegend.getColors();
	//   54  115:aload_0         
	//   55  116:getfield        #18  <Field Legend mLegend>
	//   56  119:invokevirtual   #197 <Method int[] Legend.getColors()>
	//   57  122:astore          21
		f6 = mLegend.getFormToTextSpace();
	//   58  124:aload_0         
	//   59  125:getfield        #18  <Field Legend mLegend>
	//   60  128:invokevirtual   #262 <Method float Legend.getFormToTextSpace()>
	//   61  131:fstore          6
		f10 = mLegend.getXEntrySpace();
	//   62  133:aload_0         
	//   63  134:getfield        #18  <Field Legend mLegend>
	//   64  137:invokevirtual   #265 <Method float Legend.getXEntrySpace()>
	//   65  140:fstore          9
		legenddirection = mLegend.getDirection();
	//   66  142:aload_0         
	//   67  143:getfield        #18  <Field Legend mLegend>
	//   68  146:invokevirtual   #269 <Method com.github.mikephil.charting.components.Legend$LegendDirection Legend.getDirection()>
	//   69  149:astore          22
		f14 = mLegend.getFormSize();
	//   70  151:aload_0         
	//   71  152:getfield        #18  <Field Legend mLegend>
	//   72  155:invokevirtual   #200 <Method float Legend.getFormSize()>
	//   73  158:fstore          13
		f9 = mLegend.getStackSpace();
	//   74  160:aload_0         
	//   75  161:getfield        #18  <Field Legend mLegend>
	//   76  164:invokevirtual   #272 <Method float Legend.getStackSpace()>
	//   77  167:fstore          8
		f5 = mLegend.getYOffset();
	//   78  169:aload_0         
	//   79  170:getfield        #18  <Field Legend mLegend>
	//   80  173:invokevirtual   #275 <Method float Legend.getYOffset()>
	//   81  176:fstore          5
		f2 = mLegend.getXOffset();
	//   82  178:aload_0         
	//   83  179:getfield        #18  <Field Legend mLegend>
	//   84  182:invokevirtual   #278 <Method float Legend.getXOffset()>
	//   85  185:fstore_3        
		obj = ((Object) (mLegend.getPosition()));
	//   86  186:aload_0         
	//   87  187:getfield        #18  <Field Legend mLegend>
	//   88  190:invokevirtual   #282 <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//   89  193:astore          23
		_cls1..SwitchMap.com.github.mikephil.charting.components.Legend.LegendPosition[((com.github.mikephil.charting.components.Legend.LegendPosition) (obj)).ordinal()];
	//   90  195:getstatic       #285 <Field int[] LegendRenderer$1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendPosition>
	//   91  198:aload           23
	//   92  200:invokevirtual   #288 <Method int com.github.mikephil.charting.components.Legend$LegendPosition.ordinal()>
	//   93  203:iaload          
		JVM INSTR tableswitch 1 13: default 272
	//	               1 273
	//	               2 273
	//	               3 273
	//	               4 273
	//	               5 273
	//	               6 273
	//	               7 893
	//	               8 893
	//	               9 893
	//	               10 893
	//	               11 893
	//	               12 893
	//	               13 893;
	//   94  204:tableswitch     1 13: default 272
	//	               1 273
	//	               2 273
	//	               3 273
	//	               4 273
	//	               5 273
	//	               6 273
	//	               7 893
	//	               8 893
	//	               9 893
	//	               10 893
	//	               11 893
	//	               12 893
	//	               13 893
		   goto _L3 _L4 _L4 _L4 _L4 _L4 _L4 _L5 _L5 _L5 _L5 _L5 _L5 _L5
_L3:
		return;
	//   95  272:return          
_L4:
		float f = mViewPortHandler.contentWidth();
	//   96  273:aload_0         
	//   97  274:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//   98  277:invokevirtual   #293 <Method float ViewPortHandler.contentWidth()>
	//   99  280:fstore_2        
		if(obj != com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT && obj != com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT) goto _L7; else goto _L6
	//  100  281:aload           23
	//  101  283:getstatic       #297 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_LEFT>
	//  102  286:if_acmpeq       297
	//  103  289:aload           23
	//  104  291:getstatic       #300 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_LEFT>
	//  105  294:if_acmpne       739
_L6:
		f2 = mViewPortHandler.contentLeft() + f2;
	//  106  297:aload_0         
	//  107  298:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//  108  301:invokevirtual   #303 <Method float ViewPortHandler.contentLeft()>
	//  109  304:fload_3         
	//  110  305:fadd            
	//  111  306:fstore_3        
		f = f2;
	//  112  307:fload_3         
	//  113  308:fstore_2        
		if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT)
	//* 114  309:aload           22
	//* 115  311:getstatic       #309 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.RIGHT_TO_LEFT>
	//* 116  314:if_acmpne       327
			f = f2 + mLegend.mNeededWidth;
	//  117  317:fload_3         
	//  118  318:aload_0         
	//  119  319:getfield        #18  <Field Legend mLegend>
	//  120  322:getfield        #313 <Field float Legend.mNeededWidth>
	//  121  325:fadd            
	//  122  326:fstore_2        
_L9:
		FSize afsize[] = mLegend.getCalculatedLineSizes();
	//  123  327:aload_0         
	//  124  328:getfield        #18  <Field Legend mLegend>
	//  125  331:invokevirtual   #317 <Method FSize[] Legend.getCalculatedLineSizes()>
	//  126  334:astore          24
		FSize afsize1[] = mLegend.getCalculatedLabelSizes();
	//  127  336:aload_0         
	//  128  337:getfield        #18  <Field Legend mLegend>
	//  129  340:invokevirtual   #320 <Method FSize[] Legend.getCalculatedLabelSizes()>
	//  130  343:astore          25
		Boolean aboolean[] = mLegend.getCalculatedLabelBreakPoints();
	//  131  345:aload_0         
	//  132  346:getfield        #18  <Field Legend mLegend>
	//  133  349:invokevirtual   #324 <Method Boolean[] Legend.getCalculatedLabelBreakPoints()>
	//  134  352:astore          26
		float f3 = f;
	//  135  354:fload_2         
	//  136  355:fstore          4
		int i;
		int l;
		int i1;
		if(obj == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT || obj == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT || obj == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_CENTER)
	//* 137  357:aload           23
	//* 138  359:getstatic       #300 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_LEFT>
	//* 139  362:if_acmpeq       381
	//* 140  365:aload           23
	//* 141  367:getstatic       #327 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_RIGHT>
	//* 142  370:if_acmpeq       381
	//* 143  373:aload           23
	//* 144  375:getstatic       #330 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_CENTER>
	//* 145  378:if_acmpne       803
			f2 = 0.0F;
	//  146  381:fconst_0        
	//  147  382:fstore_3        
		else
	//* 148  383:iconst_0        
	//* 149  384:istore          16
	//* 150  386:iconst_0        
	//* 151  387:istore          14
	//* 152  389:aload           20
	//* 153  391:arraylength     
	//* 154  392:istore          18
	//* 155  394:fload_3         
	//* 156  395:fstore          5
	//* 157  397:iload           14
	//* 158  399:iload           18
	//* 159  401:icmpge          10
	//* 160  404:fload           4
	//* 161  406:fstore_3        
	//* 162  407:fload           5
	//* 163  409:fstore          7
	//* 164  411:iload           14
	//* 165  413:aload           26
	//* 166  415:arraylength     
	//* 167  416:icmpge          449
	//* 168  419:fload           4
	//* 169  421:fstore_3        
	//* 170  422:fload           5
	//* 171  424:fstore          7
	//* 172  426:aload           26
	//* 173  428:iload           14
	//* 174  430:aaload          
	//* 175  431:invokevirtual   #335 <Method boolean Boolean.booleanValue()>
	//* 176  434:ifeq            449
	//* 177  437:fload_2         
	//* 178  438:fstore_3        
	//* 179  439:fload           5
	//* 180  441:fload           10
	//* 181  443:fload           11
	//* 182  445:fadd            
	//* 183  446:fadd            
	//* 184  447:fstore          7
	//* 185  449:fload_3         
	//* 186  450:fstore          4
	//* 187  452:iload           16
	//* 188  454:istore          15
	//* 189  456:fload_3         
	//* 190  457:fload_2         
	//* 191  458:fcmpl           
	//* 192  459:ifne            524
	//* 193  462:fload_3         
	//* 194  463:fstore          4
	//* 195  465:iload           16
	//* 196  467:istore          15
	//* 197  469:aload           23
	//* 198  471:getstatic       #338 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_CENTER>
	//* 199  474:if_acmpne       524
	//* 200  477:fload_3         
	//* 201  478:fstore          4
	//* 202  480:iload           16
	//* 203  482:istore          15
	//* 204  484:iload           16
	//* 205  486:aload           24
	//* 206  488:arraylength     
	//* 207  489:icmpge          524
	//* 208  492:aload           22
	//* 209  494:getstatic       #309 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.RIGHT_TO_LEFT>
	//* 210  497:if_acmpne       825
	//* 211  500:aload           24
	//* 212  502:iload           16
	//* 213  504:aaload          
	//* 214  505:getfield        #343 <Field float FSize.width>
	//* 215  508:fstore          4
	//* 216  510:fload_3         
	//* 217  511:fload           4
	//* 218  513:fconst_2        
	//* 219  514:fdiv            
	//* 220  515:fadd            
	//* 221  516:fstore          4
	//* 222  518:iload           16
	//* 223  520:iconst_1        
	//* 224  521:iadd            
	//* 225  522:istore          15
	//* 226  524:aload           21
	//* 227  526:iload           14
	//* 228  528:iaload          
	//* 229  529:bipush          -2
	//* 230  531:icmpeq          839
	//* 231  534:iconst_1        
	//* 232  535:istore          16
	//* 233  537:aload           20
	//* 234  539:iload           14
	//* 235  541:aaload          
	//* 236  542:ifnonnull       845
	//* 237  545:iconst_1        
	//* 238  546:istore          17
	//* 239  548:fload           4
	//* 240  550:fstore_3        
	//* 241  551:iload           16
	//* 242  553:ifeq            610
	//* 243  556:fload           4
	//* 244  558:fstore          5
	//* 245  560:aload           22
	//* 246  562:getstatic       #309 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.RIGHT_TO_LEFT>
	//* 247  565:if_acmpne       575
	//* 248  568:fload           4
	//* 249  570:fload           13
	//* 250  572:fsub            
	//* 251  573:fstore          5
	//* 252  575:aload_0         
	//* 253  576:aload_1         
	//* 254  577:fload           5
	//* 255  579:fload           7
	//* 256  581:fload           12
	//* 257  583:fadd            
	//* 258  584:iload           14
	//* 259  586:aload_0         
	//* 260  587:getfield        #18  <Field Legend mLegend>
	//* 261  590:invokevirtual   #345 <Method void drawForm(Canvas, float, float, int, Legend)>
	//* 262  593:fload           5
	//* 263  595:fstore_3        
	//* 264  596:aload           22
	//* 265  598:getstatic       #348 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.LEFT_TO_RIGHT>
	//* 266  601:if_acmpne       610
	//* 267  604:fload           5
	//* 268  606:fload           13
	//* 269  608:fadd            
	//* 270  609:fstore_3        
	//* 271  610:iload           17
	//* 272  612:ifne            864
	//* 273  615:fload_3         
	//* 274  616:fstore          4
	//* 275  618:iload           16
	//* 276  620:ifeq            642
	//* 277  623:aload           22
	//* 278  625:getstatic       #309 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.RIGHT_TO_LEFT>
	//* 279  628:if_acmpne       851
	//* 280  631:fload           6
	//* 281  633:fneg            
	//* 282  634:fstore          4
	//* 283  636:fload_3         
	//* 284  637:fload           4
	//* 285  639:fadd            
	//* 286  640:fstore          4
	//* 287  642:fload           4
	//* 288  644:fstore_3        
	//* 289  645:aload           22
	//* 290  647:getstatic       #309 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.RIGHT_TO_LEFT>
	//* 291  650:if_acmpne       665
	//* 292  653:fload           4
	//* 293  655:aload           25
	//* 294  657:iload           14
	//* 295  659:aaload          
	//* 296  660:getfield        #343 <Field float FSize.width>
	//* 297  663:fsub            
	//* 298  664:fstore_3        
	//* 299  665:aload_0         
	//* 300  666:aload_1         
	//* 301  667:fload_3         
	//* 302  668:fload           7
	//* 303  670:fload           10
	//* 304  672:fadd            
	//* 305  673:aload           20
	//* 306  675:iload           14
	//* 307  677:aaload          
	//* 308  678:invokevirtual   #350 <Method void drawLabel(Canvas, float, float, String)>
	//* 309  681:fload_3         
	//* 310  682:fstore          4
	//* 311  684:aload           22
	//* 312  686:getstatic       #348 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.LEFT_TO_RIGHT>
	//* 313  689:if_acmpne       704
	//* 314  692:fload_3         
	//* 315  693:aload           25
	//* 316  695:iload           14
	//* 317  697:aaload          
	//* 318  698:getfield        #343 <Field float FSize.width>
	//* 319  701:fadd            
	//* 320  702:fstore          4
	//* 321  704:aload           22
	//* 322  706:getstatic       #309 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.RIGHT_TO_LEFT>
	//* 323  709:if_acmpne       858
	//* 324  712:fload           9
	//* 325  714:fneg            
	//* 326  715:fstore_3        
	//* 327  716:fload           4
	//* 328  718:fload_3         
	//* 329  719:fadd            
	//* 330  720:fstore          4
	//* 331  722:iload           14
	//* 332  724:iconst_1        
	//* 333  725:iadd            
	//* 334  726:istore          14
	//* 335  728:iload           15
	//* 336  730:istore          16
	//* 337  732:fload           7
	//* 338  734:fstore          5
	//* 339  736:goto            397
	//* 340  739:aload           23
	//* 341  741:getstatic       #353 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_RIGHT>
	//* 342  744:if_acmpeq       755
	//* 343  747:aload           23
	//* 344  749:getstatic       #327 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_RIGHT>
	//* 345  752:if_acmpne       788
	//* 346  755:aload_0         
	//* 347  756:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//* 348  759:invokevirtual   #356 <Method float ViewPortHandler.contentRight()>
	//* 349  762:fload_3         
	//* 350  763:fsub            
	//* 351  764:fstore_3        
	//* 352  765:fload_3         
	//* 353  766:fstore_2        
	//* 354  767:aload           22
	//* 355  769:getstatic       #348 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.LEFT_TO_RIGHT>
	//* 356  772:if_acmpne       327
	//* 357  775:fload_3         
	//* 358  776:aload_0         
	//* 359  777:getfield        #18  <Field Legend mLegend>
	//* 360  780:getfield        #313 <Field float Legend.mNeededWidth>
	//* 361  783:fsub            
	//* 362  784:fstore_2        
	//* 363  785:goto            327
	//* 364  788:aload_0         
	//* 365  789:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//* 366  792:invokevirtual   #303 <Method float ViewPortHandler.contentLeft()>
	//* 367  795:fload_2         
	//* 368  796:fconst_2        
	//* 369  797:fdiv            
	//* 370  798:fadd            
	//* 371  799:fstore_2        
	//* 372  800:goto            327
			f2 = mViewPortHandler.getChartHeight() - f5 - mLegend.mNeededHeight;
	//  373  803:aload_0         
	//  374  804:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//  375  807:invokevirtual   #359 <Method float ViewPortHandler.getChartHeight()>
	//  376  810:fload           5
	//  377  812:fsub            
	//  378  813:aload_0         
	//  379  814:getfield        #18  <Field Legend mLegend>
	//  380  817:getfield        #362 <Field float Legend.mNeededHeight>
	//  381  820:fsub            
	//  382  821:fstore_3        
		l = 0;
		i = 0;
		i1 = as.length;
		f5 = f2;
		while(i < i1) 
		{
			f2 = f3;
			float f7 = f5;
			if(i < aboolean.length)
			{
				f2 = f3;
				f7 = f5;
				if(aboolean[i].booleanValue())
				{
					f2 = f;
					f7 = f5 + (f11 + f12);
				}
			}
			f3 = f2;
			int k = l;
			boolean flag1;
			if(f2 == f)
			{
				f3 = f2;
				k = l;
				if(obj == com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_CENTER)
				{
					f3 = f2;
					k = l;
					if(l < afsize.length)
					{
						if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT)
							f3 = afsize[l].width;
						else
	//* 383  822:goto            383
							f3 = -afsize[l].width;
	//  384  825:aload           24
	//  385  827:iload           16
	//  386  829:aaload          
	//  387  830:getfield        #343 <Field float FSize.width>
	//  388  833:fneg            
	//  389  834:fstore          4
						f3 = f2 + f3 / 2.0F;
						k = l + 1;
					}
				}
			}
			if(ai[i] != -2)
				l = 1;
			else
	//* 390  836:goto            510
				l = 0;
	//  391  839:iconst_0        
	//  392  840:istore          16
			if(as[i] == null)
				flag1 = true;
			else
	//* 393  842:goto            537
				flag1 = false;
	//  394  845:iconst_0        
	//  395  846:istore          17
			f2 = f3;
			if(l != 0)
			{
				f5 = f3;
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT)
					f5 = f3 - f14;
				drawForm(canvas, f5, f7 + f13, i, mLegend);
				f2 = f5;
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT)
					f2 = f5 + f14;
			}
			if(!flag1)
			{
				f3 = f2;
				if(l != 0)
				{
					if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT)
						f3 = -f6;
					else
	//* 396  848:goto            548
						f3 = f6;
	//  397  851:fload           6
	//  398  853:fstore          4
					f3 = f2 + f3;
				}
				f2 = f3;
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT)
					f2 = f3 - afsize1[i].width;
				drawLabel(canvas, f2, f7 + f11, as[i]);
				f3 = f2;
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT)
					f3 = f2 + afsize1[i].width;
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT)
					f2 = -f10;
				else
	//* 399  855:goto            636
					f2 = f10;
	//  400  858:fload           9
	//  401  860:fstore_3        
				f3 += f2;
			} else
	//* 402  861:goto            716
			{
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT)
	//* 403  864:aload           22
	//* 404  866:getstatic       #309 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.RIGHT_TO_LEFT>
	//* 405  869:if_acmpne       886
					f3 = -f9;
	//  406  872:fload           8
	//  407  874:fneg            
	//  408  875:fstore          4
				else
	//* 409  877:fload_3         
	//* 410  878:fload           4
	//* 411  880:fadd            
	//* 412  881:fstore          4
	//* 413  883:goto            722
					f3 = f9;
	//  414  886:fload           8
	//  415  888:fstore          4
				f3 = f2 + f3;
			}
			i++;
			l = k;
			f5 = f7;
		}
		if(true) goto _L8; else goto _L7
	//  416  890:goto            877
_L8:
		continue; /* Loop/switch isn't completed */
_L7:
		if(obj == com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT || obj == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT)
		{
			f2 = mViewPortHandler.contentRight() - f2;
			f = f2;
			if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT)
				f = f2 - mLegend.mNeededWidth;
		} else
		{
			f = mViewPortHandler.contentLeft() + f / 2.0F;
		}
		  goto _L9
_L5:
		float f8 = 0.0F;
	//  417  893:fconst_0        
	//  418  894:fstore          7
		boolean flag = false;
	//  419  896:iconst_0        
	//  420  897:istore          15
		float f1;
		float f4;
		int j;
		if(obj == com.github.mikephil.charting.components.Legend.LegendPosition.PIECHART_CENTER)
	//* 421  899:aload           23
	//* 422  901:getstatic       #365 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.PIECHART_CENTER>
	//* 423  904:if_acmpne       1191
		{
			f2 = mViewPortHandler.getChartWidth() / 2.0F;
	//  424  907:aload_0         
	//  425  908:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//  426  911:invokevirtual   #368 <Method float ViewPortHandler.getChartWidth()>
	//  427  914:fconst_2        
	//  428  915:fdiv            
	//  429  916:fstore_3        
			if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT)
	//* 430  917:aload           22
	//* 431  919:getstatic       #348 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.LEFT_TO_RIGHT>
	//* 432  922:if_acmpne       1178
				f1 = -mLegend.mTextWidthMax / 2.0F;
	//  433  925:aload_0         
	//  434  926:getfield        #18  <Field Legend mLegend>
	//  435  929:getfield        #371 <Field float Legend.mTextWidthMax>
	//  436  932:fneg            
	//  437  933:fconst_2        
	//  438  934:fdiv            
	//  439  935:fstore_2        
			else
	//* 440  936:fload_3         
	//* 441  937:fload_2         
	//* 442  938:fadd            
	//* 443  939:fstore_3        
	//* 444  940:aload_0         
	//* 445  941:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//* 446  944:invokevirtual   #359 <Method float ViewPortHandler.getChartHeight()>
	//* 447  947:fconst_2        
	//* 448  948:fdiv            
	//* 449  949:aload_0         
	//* 450  950:getfield        #18  <Field Legend mLegend>
	//* 451  953:getfield        #362 <Field float Legend.mNeededHeight>
	//* 452  956:fconst_2        
	//* 453  957:fdiv            
	//* 454  958:fsub            
	//* 455  959:aload_0         
	//* 456  960:getfield        #18  <Field Legend mLegend>
	//* 457  963:invokevirtual   #275 <Method float Legend.getYOffset()>
	//* 458  966:fadd            
	//* 459  967:fstore_2        
	//* 460  968:iconst_0        
	//* 461  969:istore          14
	//* 462  971:fload_2         
	//* 463  972:fstore          4
	//* 464  974:iload           14
	//* 465  976:aload           20
	//* 466  978:arraylength     
	//* 467  979:icmpge          10
	//* 468  982:aload           21
	//* 469  984:iload           14
	//* 470  986:iaload          
	//* 471  987:bipush          -2
	//* 472  989:icmpeq          1383
	//* 473  992:iconst_1        
	//* 474  993:istore          19
	//* 475  995:iload           19
	//* 476  997:invokestatic    #374 <Method Boolean Boolean.valueOf(boolean)>
	//* 477 1000:astore          23
	//* 478 1002:fload_3         
	//* 479 1003:fstore          5
	//* 480 1005:fload           5
	//* 481 1007:fstore_2        
	//* 482 1008:aload           23
	//* 483 1010:invokevirtual   #335 <Method boolean Boolean.booleanValue()>
	//* 484 1013:ifeq            1066
	//* 485 1016:aload           22
	//* 486 1018:getstatic       #348 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.LEFT_TO_RIGHT>
	//* 487 1021:if_acmpne       1389
	//* 488 1024:fload           5
	//* 489 1026:fload           7
	//* 490 1028:fadd            
	//* 491 1029:fstore          5
	//* 492 1031:aload_0         
	//* 493 1032:aload_1         
	//* 494 1033:fload           5
	//* 495 1035:fload           4
	//* 496 1037:fload           12
	//* 497 1039:fadd            
	//* 498 1040:iload           14
	//* 499 1042:aload_0         
	//* 500 1043:getfield        #18  <Field Legend mLegend>
	//* 501 1046:invokevirtual   #345 <Method void drawForm(Canvas, float, float, int, Legend)>
	//* 502 1049:fload           5
	//* 503 1051:fstore_2        
	//* 504 1052:aload           22
	//* 505 1054:getstatic       #348 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.LEFT_TO_RIGHT>
	//* 506 1057:if_acmpne       1066
	//* 507 1060:fload           5
	//* 508 1062:fload           13
	//* 509 1064:fadd            
	//* 510 1065:fstore_2        
	//* 511 1066:aload           20
	//* 512 1068:iload           14
	//* 513 1070:aaload          
	//* 514 1071:ifnull          1450
	//* 515 1074:aload           23
	//* 516 1076:invokevirtual   #335 <Method boolean Boolean.booleanValue()>
	//* 517 1079:ifeq            1410
	//* 518 1082:iload           15
	//* 519 1084:ifne            1410
	//* 520 1087:aload           22
	//* 521 1089:getstatic       #348 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.LEFT_TO_RIGHT>
	//* 522 1092:if_acmpne       1402
	//* 523 1095:fload           6
	//* 524 1097:fstore          5
	//* 525 1099:fload_2         
	//* 526 1100:fload           5
	//* 527 1102:fadd            
	//* 528 1103:fstore_2        
	//* 529 1104:fload_2         
	//* 530 1105:fstore          5
	//* 531 1107:aload           22
	//* 532 1109:getstatic       #309 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.RIGHT_TO_LEFT>
	//* 533 1112:if_acmpne       1132
	//* 534 1115:fload_2         
	//* 535 1116:aload_0         
	//* 536 1117:getfield        #25  <Field Paint mLegendLabelPaint>
	//* 537 1120:aload           20
	//* 538 1122:iload           14
	//* 539 1124:aaload          
	//* 540 1125:invokestatic    #377 <Method int Utils.calcTextWidth(Paint, String)>
	//* 541 1128:i2f             
	//* 542 1129:fsub            
	//* 543 1130:fstore          5
	//* 544 1132:iload           15
	//* 545 1134:ifne            1420
	//* 546 1137:aload_0         
	//* 547 1138:aload_1         
	//* 548 1139:fload           5
	//* 549 1141:fload           4
	//* 550 1143:fload           10
	//* 551 1145:fadd            
	//* 552 1146:aload           20
	//* 553 1148:iload           14
	//* 554 1150:aaload          
	//* 555 1151:invokevirtual   #350 <Method void drawLabel(Canvas, float, float, String)>
	//* 556 1154:fload           4
	//* 557 1156:fload           10
	//* 558 1158:fload           11
	//* 559 1160:fadd            
	//* 560 1161:fadd            
	//* 561 1162:fstore          4
	//* 562 1164:fconst_0        
	//* 563 1165:fstore_2        
	//* 564 1166:iload           14
	//* 565 1168:iconst_1        
	//* 566 1169:iadd            
	//* 567 1170:istore          14
	//* 568 1172:fload_2         
	//* 569 1173:fstore          7
	//* 570 1175:goto            974
				f1 = mLegend.mTextWidthMax / 2.0F;
	//  571 1178:aload_0         
	//  572 1179:getfield        #18  <Field Legend mLegend>
	//  573 1182:getfield        #371 <Field float Legend.mTextWidthMax>
	//  574 1185:fconst_2        
	//  575 1186:fdiv            
	//  576 1187:fstore_2        
			f2 += f1;
			f1 = (mViewPortHandler.getChartHeight() / 2.0F - mLegend.mNeededHeight / 2.0F) + mLegend.getYOffset();
		} else
	//* 577 1188:goto            936
		{
			if(obj == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART || obj == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER || obj == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_INSIDE)
	//* 578 1191:aload           23
	//* 579 1193:getstatic       #380 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART>
	//* 580 1196:if_acmpeq       1215
	//* 581 1199:aload           23
	//* 582 1201:getstatic       #383 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_CENTER>
	//* 583 1204:if_acmpeq       1215
	//* 584 1207:aload           23
	//* 585 1209:getstatic       #386 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_INSIDE>
	//* 586 1212:if_acmpne       1289
				j = 1;
	//  587 1215:iconst_1        
	//  588 1216:istore          14
			else
	//* 589 1218:iload           14
	//* 590 1220:ifeq            1295
	//* 591 1223:aload_0         
	//* 592 1224:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//* 593 1227:invokevirtual   #368 <Method float ViewPortHandler.getChartWidth()>
	//* 594 1230:fload_3         
	//* 595 1231:fsub            
	//* 596 1232:fstore_3        
	//* 597 1233:fload_3         
	//* 598 1234:fstore_2        
	//* 599 1235:aload           22
	//* 600 1237:getstatic       #348 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.LEFT_TO_RIGHT>
	//* 601 1240:if_acmpne       1253
	//* 602 1243:fload_3         
	//* 603 1244:aload_0         
	//* 604 1245:getfield        #18  <Field Legend mLegend>
	//* 605 1248:getfield        #371 <Field float Legend.mTextWidthMax>
	//* 606 1251:fsub            
	//* 607 1252:fstore_2        
	//* 608 1253:aload           23
	//* 609 1255:getstatic       #380 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART>
	//* 610 1258:if_acmpeq       1269
	//* 611 1261:aload           23
	//* 612 1263:getstatic       #389 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART>
	//* 613 1266:if_acmpne       1318
	//* 614 1269:aload_0         
	//* 615 1270:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//* 616 1273:invokevirtual   #392 <Method float ViewPortHandler.contentTop()>
	//* 617 1276:fload           5
	//* 618 1278:fadd            
	//* 619 1279:fstore          4
	//* 620 1281:fload_2         
	//* 621 1282:fstore_3        
	//* 622 1283:fload           4
	//* 623 1285:fstore_2        
	//* 624 1286:goto            968
				j = 0;
	//  625 1289:iconst_0        
	//  626 1290:istore          14
			if(j != 0)
			{
				f2 = mViewPortHandler.getChartWidth() - f2;
				f1 = f2;
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT)
					f1 = f2 - mLegend.mTextWidthMax;
			} else
	//* 627 1292:goto            1218
			{
				f1 = f2;
	//  628 1295:fload_3         
	//  629 1296:fstore_2        
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT)
	//* 630 1297:aload           22
	//* 631 1299:getstatic       #309 <Field com.github.mikephil.charting.components.Legend$LegendDirection com.github.mikephil.charting.components.Legend$LegendDirection.RIGHT_TO_LEFT>
	//* 632 1302:if_acmpne       1253
					f1 = f2 + mLegend.mTextWidthMax;
	//  633 1305:fload_3         
	//  634 1306:aload_0         
	//  635 1307:getfield        #18  <Field Legend mLegend>
	//  636 1310:getfield        #371 <Field float Legend.mTextWidthMax>
	//  637 1313:fadd            
	//  638 1314:fstore_2        
			}
			if(obj == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART || obj == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART)
			{
				f4 = mViewPortHandler.contentTop() + f5;
				f2 = f1;
				f1 = f4;
			} else
	//* 639 1315:goto            1253
			if(obj == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER || obj == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER)
	//* 640 1318:aload           23
	//* 641 1320:getstatic       #383 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_CENTER>
	//* 642 1323:if_acmpeq       1334
	//* 643 1326:aload           23
	//* 644 1328:getstatic       #395 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART_CENTER>
	//* 645 1331:if_acmpne       1363
			{
				f4 = mViewPortHandler.getChartHeight() / 2.0F - mLegend.mNeededHeight / 2.0F;
	//  646 1334:aload_0         
	//  647 1335:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//  648 1338:invokevirtual   #359 <Method float ViewPortHandler.getChartHeight()>
	//  649 1341:fconst_2        
	//  650 1342:fdiv            
	//  651 1343:aload_0         
	//  652 1344:getfield        #18  <Field Legend mLegend>
	//  653 1347:getfield        #362 <Field float Legend.mNeededHeight>
	//  654 1350:fconst_2        
	//  655 1351:fdiv            
	//  656 1352:fsub            
	//  657 1353:fstore          4
				f2 = f1;
	//  658 1355:fload_2         
	//  659 1356:fstore_3        
				f1 = f4;
	//  660 1357:fload           4
	//  661 1359:fstore_2        
			} else
	//* 662 1360:goto            968
			{
				f4 = mViewPortHandler.contentTop() + f5;
	//  663 1363:aload_0         
	//  664 1364:getfield        #187 <Field ViewPortHandler mViewPortHandler>
	//  665 1367:invokevirtual   #392 <Method float ViewPortHandler.contentTop()>
	//  666 1370:fload           5
	//  667 1372:fadd            
	//  668 1373:fstore          4
				f2 = f1;
	//  669 1375:fload_2         
	//  670 1376:fstore_3        
				f1 = f4;
	//  671 1377:fload           4
	//  672 1379:fstore_2        
			}
		}
		j = 0;
		f4 = f1;
		while(j < as.length) 
		{
			boolean flag2;
			if(ai[j] != -2)
				flag2 = true;
			else
	//* 673 1380:goto            968
				flag2 = false;
	//  674 1383:iconst_0        
	//  675 1384:istore          19
			obj = ((Object) (Boolean.valueOf(flag2)));
			f5 = f2;
			f1 = f5;
			if(((Boolean) (obj)).booleanValue())
			{
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT)
					f5 += f8;
				else
	//* 676 1386:goto            995
					f5 -= f14 - f8;
	//  677 1389:fload           5
	//  678 1391:fload           13
	//  679 1393:fload           7
	//  680 1395:fsub            
	//  681 1396:fsub            
	//  682 1397:fstore          5
				drawForm(canvas, f5, f4 + f13, j, mLegend);
				f1 = f5;
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT)
					f1 = f5 + f14;
			}
			if(as[j] != null)
			{
				if(((Boolean) (obj)).booleanValue() && !flag)
				{
					if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.LEFT_TO_RIGHT)
						f5 = f6;
					else
	//* 683 1399:goto            1031
						f5 = -f6;
	//  684 1402:fload           6
	//  685 1404:fneg            
	//  686 1405:fstore          5
					f1 += f5;
				} else
	//* 687 1407:goto            1099
				if(flag)
	//* 688 1410:iload           15
	//* 689 1412:ifeq            1104
					f1 = f2;
	//  690 1415:fload_3         
	//  691 1416:fstore_2        
				f5 = f1;
				if(legenddirection == com.github.mikephil.charting.components.Legend.LegendDirection.RIGHT_TO_LEFT)
					f5 = f1 - (float)Utils.calcTextWidth(mLegendLabelPaint, as[j]);
				if(!flag)
				{
					drawLabel(canvas, f5, f4 + f11, as[j]);
				} else
	//* 692 1417:goto            1104
				{
					f4 += f11 + f12;
	//  693 1420:fload           4
	//  694 1422:fload           10
	//  695 1424:fload           11
	//  696 1426:fadd            
	//  697 1427:fadd            
	//  698 1428:fstore          4
					drawLabel(canvas, f5, f4 + f11, as[j]);
	//  699 1430:aload_0         
	//  700 1431:aload_1         
	//  701 1432:fload           5
	//  702 1434:fload           4
	//  703 1436:fload           10
	//  704 1438:fadd            
	//  705 1439:aload           20
	//  706 1441:iload           14
	//  707 1443:aaload          
	//  708 1444:invokevirtual   #350 <Method void drawLabel(Canvas, float, float, String)>
				}
				f4 += f11 + f12;
				f1 = 0.0F;
			} else
	//* 709 1447:goto            1154
			{
				f1 = f8 + (f14 + f9);
	//  710 1450:fload           7
	//  711 1452:fload           13
	//  712 1454:fload           8
	//  713 1456:fadd            
	//  714 1457:fadd            
	//  715 1458:fstore_2        
				flag = true;
	//  716 1459:iconst_1        
	//  717 1460:istore          15
			}
			j++;
			f8 = f1;
		}
		if(true) goto _L1; else goto _L10
	//  718 1462:goto            1166
_L10:
	}

	protected Legend mLegend;
	protected Paint mLegendFormPaint;
	protected Paint mLegendLabelPaint;
}
