// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;

// Referenced classes of package com.github.mikephil.charting.highlight:
//			ChartHighlighter, Range, Highlight

public class BarHighlighter extends ChartHighlighter
{

	public BarHighlighter(BarDataProvider bardataprovider)
	{
		super(((com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider) (bardataprovider)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void ChartHighlighter(com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider)>
	//    3    5:return          
	}

	protected float getBase(float f)
	{
		float af[] = new float[2];
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:astore          4
		af[0] = f;
	//    3    5:aload           4
	//    4    7:iconst_0        
	//    5    8:fload_1         
	//    6    9:fastore         
		((BarDataProvider)mChart).getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
	//    7   10:aload_0         
	//    8   11:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//    9   14:checkcast       #19  <Class BarDataProvider>
	//   10   17:getstatic       #25  <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//   11   20:invokeinterface #29  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   12   25:aload           4
	//   13   27:invokevirtual   #35  <Method void Transformer.pixelsToValue(float[])>
		f = af[0];
	//   14   30:aload           4
	//   15   32:iconst_0        
	//   16   33:faload          
	//   17   34:fstore_1        
		float f1 = ((BarDataProvider)mChart).getBarData().getDataSetCount();
	//   18   35:aload_0         
	//   19   36:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   20   39:checkcast       #19  <Class BarDataProvider>
	//   21   42:invokeinterface #39  <Method BarData BarDataProvider.getBarData()>
	//   22   47:invokevirtual   #45  <Method int BarData.getDataSetCount()>
	//   23   50:i2f             
	//   24   51:fstore_2        
		int i = (int)(f / (((BarDataProvider)mChart).getBarData().getGroupSpace() + f1));
	//   25   52:fload_1         
	//   26   53:aload_0         
	//   27   54:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   28   57:checkcast       #19  <Class BarDataProvider>
	//   29   60:invokeinterface #39  <Method BarData BarDataProvider.getBarData()>
	//   30   65:invokevirtual   #49  <Method float BarData.getGroupSpace()>
	//   31   68:fload_2         
	//   32   69:fadd            
	//   33   70:fdiv            
	//   34   71:f2i             
	//   35   72:istore_3        
		return f - ((BarDataProvider)mChart).getBarData().getGroupSpace() * (float)i;
	//   36   73:fload_1         
	//   37   74:aload_0         
	//   38   75:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   39   78:checkcast       #19  <Class BarDataProvider>
	//   40   81:invokeinterface #39  <Method BarData BarDataProvider.getBarData()>
	//   41   86:invokevirtual   #49  <Method float BarData.getGroupSpace()>
	//   42   89:iload_3         
	//   43   90:i2f             
	//   44   91:fmul            
	//   45   92:fsub            
	//   46   93:freturn         
	}

	protected int getClosestStackIndex(Range arange[], float f)
	{
		if(arange != null && arange.length != 0) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnull          9
	//    2    4:aload_1         
	//    3    5:arraylength     
	//    4    6:ifne            15
_L1:
		int l = 0;
	//    5    9:iconst_0        
	//    6   10:istore          5
_L4:
		return l;
	//    7   12:iload           5
	//    8   14:ireturn         
_L2:
		int i = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		int i1 = arange.length;
	//   11   17:aload_1         
	//   12   18:arraylength     
	//   13   19:istore          6
		int k = 0;
	//   14   21:iconst_0        
	//   15   22:istore          4
label0:
		do
		{
label1:
			{
				if(k >= i1)
					break label1;
	//   16   24:iload           4
	//   17   26:iload           6
	//   18   28:icmpge          58
				l = i;
	//   19   31:iload_3         
	//   20   32:istore          5
				if(arange[k].contains(f))
					break label0;
	//   21   34:aload_1         
	//   22   35:iload           4
	//   23   37:aaload          
	//   24   38:fload_2         
	//   25   39:invokevirtual   #57  <Method boolean Range.contains(float)>
	//   26   42:ifne            12
				i++;
	//   27   45:iload_3         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_3        
				k++;
	//   31   49:iload           4
	//   32   51:iconst_1        
	//   33   52:iadd            
	//   34   53:istore          4
			}
		} while(true);
	//   35   55:goto            24
		if(true) goto _L4; else goto _L3
_L3:
		int j = Math.max(arange.length - 1, 0);
	//   36   58:aload_1         
	//   37   59:arraylength     
	//   38   60:iconst_1        
	//   39   61:isub            
	//   40   62:iconst_0        
	//   41   63:invokestatic    #63  <Method int Math.max(int, int)>
	//   42   66:istore_3        
		if(f <= arange[j].to)
	//*  43   67:fload_2         
	//*  44   68:aload_1         
	//*  45   69:iload_3         
	//*  46   70:aaload          
	//*  47   71:getfield        #67  <Field float Range.to>
	//*  48   74:fcmpl           
	//*  49   75:ifle            80
	//*  50   78:iload_3         
	//*  51   79:ireturn         
			j = 0;
	//   52   80:iconst_0        
	//   53   81:istore_3        
		return j;
	//*  54   82:goto            78
	}

	protected int getDataSetIndex(int i, float f, float f1)
	{
		if(!((BarDataProvider)mChart).getBarData().isGrouped())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//*   2    4:checkcast       #19  <Class BarDataProvider>
	//*   3    7:invokeinterface #39  <Method BarData BarDataProvider.getBarData()>
	//*   4   12:invokevirtual   #73  <Method boolean BarData.isGrouped()>
	//*   5   15:ifne            22
		{
			i = 0;
	//    6   18:iconst_0        
	//    7   19:istore_1        
		} else
	//*   8   20:iload_1         
	//*   9   21:ireturn         
		{
			f = getBase(f);
	//   10   22:aload_0         
	//   11   23:fload_2         
	//   12   24:invokevirtual   #75  <Method float getBase(float)>
	//   13   27:fstore_2        
			int k = ((BarDataProvider)mChart).getBarData().getDataSetCount();
	//   14   28:aload_0         
	//   15   29:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   16   32:checkcast       #19  <Class BarDataProvider>
	//   17   35:invokeinterface #39  <Method BarData BarDataProvider.getBarData()>
	//   18   40:invokevirtual   #45  <Method int BarData.getDataSetCount()>
	//   19   43:istore          5
			int j = (int)f % k;
	//   20   45:fload_2         
	//   21   46:f2i             
	//   22   47:iload           5
	//   23   49:irem            
	//   24   50:istore          4
			if(j < 0)
	//*  25   52:iload           4
	//*  26   54:ifge            59
				return 0;
	//   27   57:iconst_0        
	//   28   58:ireturn         
			i = j;
	//   29   59:iload           4
	//   30   61:istore_1        
			if(j >= k)
	//*  31   62:iload           4
	//*  32   64:iload           5
	//*  33   66:icmplt          20
				return k - 1;
	//   34   69:iload           5
	//   35   71:iconst_1        
	//   36   72:isub            
	//   37   73:ireturn         
		}
		return i;
	}

	public Highlight getHighlight(float f, float f1)
	{
		Highlight highlight = super.getHighlight(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #79  <Method Highlight ChartHighlighter.getHighlight(float, float)>
	//    4    6:astore_3        
		IBarDataSet ibardataset;
		if(highlight != null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       13
	//*   7   11:aload_3         
	//*   8   12:areturn         
	//*   9   13:aload_0         
	//*  10   14:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//*  11   17:checkcast       #19  <Class BarDataProvider>
	//*  12   20:invokeinterface #39  <Method BarData BarDataProvider.getBarData()>
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #83  <Method int Highlight.getDataSetIndex()>
	//*  15   29:invokevirtual   #87  <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarData.getDataSetByIndex(int)>
	//*  16   32:checkcast       #89  <Class IBarDataSet>
	//*  17   35:astore          4
			if((ibardataset = (IBarDataSet)((BarDataProvider)mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex())).isStacked())
	//*  18   37:aload           4
	//*  19   39:invokeinterface #92  <Method boolean IBarDataSet.isStacked()>
	//*  20   44:ifeq            11
			{
				float af[] = new float[2];
	//   21   47:iconst_2        
	//   22   48:newarray        float[]
	//   23   50:astore          5
				af[1] = f1;
	//   24   52:aload           5
	//   25   54:iconst_1        
	//   26   55:fload_2         
	//   27   56:fastore         
				((BarDataProvider)mChart).getTransformer(ibardataset.getAxisDependency()).pixelsToValue(af);
	//   28   57:aload_0         
	//   29   58:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   30   61:checkcast       #19  <Class BarDataProvider>
	//   31   64:aload           4
	//   32   66:invokeinterface #96  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//   33   71:invokeinterface #29  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   34   76:aload           5
	//   35   78:invokevirtual   #35  <Method void Transformer.pixelsToValue(float[])>
				return getStackedHighlight(highlight, ibardataset, highlight.getXIndex(), highlight.getDataSetIndex(), af[1]);
	//   36   81:aload_0         
	//   37   82:aload_3         
	//   38   83:aload           4
	//   39   85:aload_3         
	//   40   86:invokevirtual   #99  <Method int Highlight.getXIndex()>
	//   41   89:aload_3         
	//   42   90:invokevirtual   #83  <Method int Highlight.getDataSetIndex()>
	//   43   93:aload           5
	//   44   95:iconst_1        
	//   45   96:faload          
	//   46   97:f2d             
	//   47   98:invokevirtual   #103 <Method Highlight getStackedHighlight(Highlight, IBarDataSet, int, int, double)>
	//   48  101:areturn         
			}
		return highlight;
	}

	protected Range[] getRanges(BarEntry barentry)
	{
		float af[] = barentry.getVals();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method float[] BarEntry.getVals()>
	//    2    4:astore          7
		if(af != null && af.length != 0) goto _L2; else goto _L1
	//    3    6:aload           7
	//    4    8:ifnull          17
	//    5   11:aload           7
	//    6   13:arraylength     
	//    7   14:ifne            21
_L1:
		barentry = null;
	//    8   17:aconst_null     
	//    9   18:astore_1        
_L4:
		return ((Range []) (barentry));
	//   10   19:aload_1         
	//   11   20:areturn         
_L2:
		float f = -barentry.getNegativeSum();
	//   12   21:aload_1         
	//   13   22:invokevirtual   #114 <Method float BarEntry.getNegativeSum()>
	//   14   25:fneg            
	//   15   26:fstore_2        
		float f1 = 0.0F;
	//   16   27:fconst_0        
	//   17   28:fstore_3        
		Range arange[] = new Range[af.length];
	//   18   29:aload           7
	//   19   31:arraylength     
	//   20   32:anewarray       Range[]
	//   21   35:astore          6
		int i = 0;
	//   22   37:iconst_0        
	//   23   38:istore          5
		do
		{
			barentry = ((BarEntry) (arange));
	//   24   40:aload           6
	//   25   42:astore_1        
			if(i >= arange.length)
				continue;
	//   26   43:iload           5
	//   27   45:aload           6
	//   28   47:arraylength     
	//   29   48:icmpge          19
			float f2 = af[i];
	//   30   51:aload           7
	//   31   53:iload           5
	//   32   55:faload          
	//   33   56:fstore          4
			if(f2 < 0.0F)
	//*  34   58:fload           4
	//*  35   60:fconst_0        
	//*  36   61:fcmpg           
	//*  37   62:ifge            102
			{
				arange[i] = new Range(f, Math.abs(f2) + f);
	//   38   65:aload           6
	//   39   67:iload           5
	//   40   69:new             #53  <Class Range>
	//   41   72:dup             
	//   42   73:fload_2         
	//   43   74:fload           4
	//   44   76:invokestatic    #117 <Method float Math.abs(float)>
	//   45   79:fload_2         
	//   46   80:fadd            
	//   47   81:invokespecial   #120 <Method void Range(float, float)>
	//   48   84:aastore         
				f += Math.abs(f2);
	//   49   85:fload_2         
	//   50   86:fload           4
	//   51   88:invokestatic    #117 <Method float Math.abs(float)>
	//   52   91:fadd            
	//   53   92:fstore_2        
			} else
	//*  54   93:iload           5
	//*  55   95:iconst_1        
	//*  56   96:iadd            
	//*  57   97:istore          5
	//*  58   99:goto            40
			{
				arange[i] = new Range(f1, f1 + f2);
	//   59  102:aload           6
	//   60  104:iload           5
	//   61  106:new             #53  <Class Range>
	//   62  109:dup             
	//   63  110:fload_3         
	//   64  111:fload_3         
	//   65  112:fload           4
	//   66  114:fadd            
	//   67  115:invokespecial   #120 <Method void Range(float, float)>
	//   68  118:aastore         
				f1 += f2;
	//   69  119:fload_3         
	//   70  120:fload           4
	//   71  122:fadd            
	//   72  123:fstore_3        
			}
			i++;
		} while(true);
	//   73  124:goto            93
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected Highlight getStackedHighlight(Highlight highlight, IBarDataSet ibardataset, int i, int j, double d)
	{
		ibardataset = ((IBarDataSet) ((BarEntry)ibardataset.getEntryForXIndex(i)));
	//    0    0:aload_2         
	//    1    1:iload_3         
	//    2    2:invokeinterface #124 <Method com.github.mikephil.charting.data.Entry IBarDataSet.getEntryForXIndex(int)>
	//    3    7:checkcast       #107 <Class BarEntry>
	//    4   10:astore_2        
		if(ibardataset == null || ((BarEntry) (ibardataset)).getVals() == null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          22
	//*   7   15:aload_2         
	//*   8   16:invokevirtual   #111 <Method float[] BarEntry.getVals()>
	//*   9   19:ifnonnull       24
		{
			return highlight;
	//   10   22:aload_1         
	//   11   23:areturn         
		} else
		{
			highlight = ((Highlight) (getRanges(((BarEntry) (ibardataset)))));
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #126 <Method Range[] getRanges(BarEntry)>
	//   15   29:astore_1        
			int k = getClosestStackIndex(((Range []) (highlight)), (float)d);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:dload           5
	//   19   34:d2f             
	//   20   35:invokevirtual   #128 <Method int getClosestStackIndex(Range[], float)>
	//   21   38:istore          7
			return new Highlight(i, j, k, ((Range) (highlight[k])));
	//   22   40:new             #81  <Class Highlight>
	//   23   43:dup             
	//   24   44:iload_3         
	//   25   45:iload           4
	//   26   47:iload           7
	//   27   49:aload_1         
	//   28   50:iload           7
	//   29   52:aaload          
	//   30   53:invokespecial   #131 <Method void Highlight(int, int, int, Range)>
	//   31   56:areturn         
		}
	}

	protected int getXIndex(float f)
	{
		int i;
		if(!((BarDataProvider)mChart).getBarData().isGrouped())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//*   2    4:checkcast       #19  <Class BarDataProvider>
	//*   3    7:invokeinterface #39  <Method BarData BarDataProvider.getBarData()>
	//*   4   12:invokevirtual   #73  <Method boolean BarData.isGrouped()>
	//*   5   15:ifne            26
		{
			i = super.getXIndex(f);
	//    6   18:aload_0         
	//    7   19:fload_1         
	//    8   20:invokespecial   #134 <Method int ChartHighlighter.getXIndex(float)>
	//    9   23:istore_2        
		} else
	//*  10   24:iload_2         
	//*  11   25:ireturn         
		{
			f = getBase(f);
	//   12   26:aload_0         
	//   13   27:fload_1         
	//   14   28:invokevirtual   #75  <Method float getBase(float)>
	//   15   31:fstore_1        
			i = ((BarDataProvider)mChart).getBarData().getDataSetCount();
	//   16   32:aload_0         
	//   17   33:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   18   36:checkcast       #19  <Class BarDataProvider>
	//   19   39:invokeinterface #39  <Method BarData BarDataProvider.getBarData()>
	//   20   44:invokevirtual   #45  <Method int BarData.getDataSetCount()>
	//   21   47:istore_2        
			int j = (int)f / i;
	//   22   48:fload_1         
	//   23   49:f2i             
	//   24   50:iload_2         
	//   25   51:idiv            
	//   26   52:istore_3        
			int k = ((BarDataProvider)mChart).getData().getXValCount();
	//   27   53:aload_0         
	//   28   54:getfield        #17  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   29   57:checkcast       #19  <Class BarDataProvider>
	//   30   60:invokeinterface #138 <Method BarLineScatterCandleBubbleData BarDataProvider.getData()>
	//   31   65:invokevirtual   #143 <Method int BarLineScatterCandleBubbleData.getXValCount()>
	//   32   68:istore          4
			if(j < 0)
	//*  33   70:iload_3         
	//*  34   71:ifge            76
				return 0;
	//   35   74:iconst_0        
	//   36   75:ireturn         
			i = j;
	//   37   76:iload_3         
	//   38   77:istore_2        
			if(j >= k)
	//*  39   78:iload_3         
	//*  40   79:iload           4
	//*  41   81:icmplt          24
				return k - 1;
	//   42   84:iload           4
	//   43   86:iconst_1        
	//   44   87:isub            
	//   45   88:ireturn         
		}
		return i;
	}
}
