// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.Transformer;

// Referenced classes of package com.github.mikephil.charting.highlight:
//			BarHighlighter, Highlight

public class HorizontalBarHighlighter extends BarHighlighter
{

	public HorizontalBarHighlighter(BarDataProvider bardataprovider)
	{
		super(bardataprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void BarHighlighter(BarDataProvider)>
	//    3    5:return          
	}

	protected float getBase(float f)
	{
		float af[] = new float[2];
	//    0    0:iconst_2        
	//    1    1:newarray        float[]
	//    2    3:astore          4
		af[1] = f;
	//    3    5:aload           4
	//    4    7:iconst_1        
	//    5    8:fload_1         
	//    6    9:fastore         
		((BarDataProvider)mChart).getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
	//    7   10:aload_0         
	//    8   11:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//    9   14:checkcast       #17  <Class BarDataProvider>
	//   10   17:getstatic       #23  <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//   11   20:invokeinterface #27  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   12   25:aload           4
	//   13   27:invokevirtual   #33  <Method void Transformer.pixelsToValue(float[])>
		f = af[1];
	//   14   30:aload           4
	//   15   32:iconst_1        
	//   16   33:faload          
	//   17   34:fstore_1        
		float f1 = ((BarDataProvider)mChart).getBarData().getDataSetCount();
	//   18   35:aload_0         
	//   19   36:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   20   39:checkcast       #17  <Class BarDataProvider>
	//   21   42:invokeinterface #37  <Method BarData BarDataProvider.getBarData()>
	//   22   47:invokevirtual   #43  <Method int BarData.getDataSetCount()>
	//   23   50:i2f             
	//   24   51:fstore_2        
		int i = (int)(f / (((BarDataProvider)mChart).getBarData().getGroupSpace() + f1));
	//   25   52:fload_1         
	//   26   53:aload_0         
	//   27   54:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   28   57:checkcast       #17  <Class BarDataProvider>
	//   29   60:invokeinterface #37  <Method BarData BarDataProvider.getBarData()>
	//   30   65:invokevirtual   #47  <Method float BarData.getGroupSpace()>
	//   31   68:fload_2         
	//   32   69:fadd            
	//   33   70:fdiv            
	//   34   71:f2i             
	//   35   72:istore_3        
		return f - ((BarDataProvider)mChart).getBarData().getGroupSpace() * (float)i;
	//   36   73:fload_1         
	//   37   74:aload_0         
	//   38   75:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   39   78:checkcast       #17  <Class BarDataProvider>
	//   40   81:invokeinterface #37  <Method BarData BarDataProvider.getBarData()>
	//   41   86:invokevirtual   #47  <Method float BarData.getGroupSpace()>
	//   42   89:iload_3         
	//   43   90:i2f             
	//   44   91:fmul            
	//   45   92:fsub            
	//   46   93:freturn         
	}

	public Highlight getHighlight(float f, float f1)
	{
		Highlight highlight = super.getHighlight(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #51  <Method Highlight BarHighlighter.getHighlight(float, float)>
	//    4    6:astore_3        
		IBarDataSet ibardataset;
		if(highlight != null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       13
	//*   7   11:aload_3         
	//*   8   12:areturn         
	//*   9   13:aload_0         
	//*  10   14:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//*  11   17:checkcast       #17  <Class BarDataProvider>
	//*  12   20:invokeinterface #37  <Method BarData BarDataProvider.getBarData()>
	//*  13   25:aload_3         
	//*  14   26:invokevirtual   #56  <Method int Highlight.getDataSetIndex()>
	//*  15   29:invokevirtual   #60  <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarData.getDataSetByIndex(int)>
	//*  16   32:checkcast       #62  <Class IBarDataSet>
	//*  17   35:astore          4
			if((ibardataset = (IBarDataSet)((BarDataProvider)mChart).getBarData().getDataSetByIndex(highlight.getDataSetIndex())).isStacked())
	//*  18   37:aload           4
	//*  19   39:invokeinterface #66  <Method boolean IBarDataSet.isStacked()>
	//*  20   44:ifeq            11
			{
				float af[] = new float[2];
	//   21   47:iconst_2        
	//   22   48:newarray        float[]
	//   23   50:astore          5
				af[0] = f1;
	//   24   52:aload           5
	//   25   54:iconst_0        
	//   26   55:fload_2         
	//   27   56:fastore         
				((BarDataProvider)mChart).getTransformer(ibardataset.getAxisDependency()).pixelsToValue(af);
	//   28   57:aload_0         
	//   29   58:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   30   61:checkcast       #17  <Class BarDataProvider>
	//   31   64:aload           4
	//   32   66:invokeinterface #70  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//   33   71:invokeinterface #27  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   34   76:aload           5
	//   35   78:invokevirtual   #33  <Method void Transformer.pixelsToValue(float[])>
				return getStackedHighlight(highlight, ibardataset, highlight.getXIndex(), highlight.getDataSetIndex(), af[0]);
	//   36   81:aload_0         
	//   37   82:aload_3         
	//   38   83:aload           4
	//   39   85:aload_3         
	//   40   86:invokevirtual   #73  <Method int Highlight.getXIndex()>
	//   41   89:aload_3         
	//   42   90:invokevirtual   #56  <Method int Highlight.getDataSetIndex()>
	//   43   93:aload           5
	//   44   95:iconst_0        
	//   45   96:faload          
	//   46   97:f2d             
	//   47   98:invokevirtual   #77  <Method Highlight getStackedHighlight(Highlight, IBarDataSet, int, int, double)>
	//   48  101:areturn         
			}
		return highlight;
	}

	protected int getXIndex(float f)
	{
		int i;
		if(!((BarDataProvider)mChart).getBarData().isGrouped())
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//*   2    4:checkcast       #17  <Class BarDataProvider>
	//*   3    7:invokeinterface #37  <Method BarData BarDataProvider.getBarData()>
	//*   4   12:invokevirtual   #81  <Method boolean BarData.isGrouped()>
	//*   5   15:ifne            58
		{
			float af[] = new float[2];
	//    6   18:iconst_2        
	//    7   19:newarray        float[]
	//    8   21:astore          5
			af[1] = f;
	//    9   23:aload           5
	//   10   25:iconst_1        
	//   11   26:fload_1         
	//   12   27:fastore         
			((BarDataProvider)mChart).getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
	//   13   28:aload_0         
	//   14   29:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   15   32:checkcast       #17  <Class BarDataProvider>
	//   16   35:getstatic       #23  <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//   17   38:invokeinterface #27  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   18   43:aload           5
	//   19   45:invokevirtual   #33  <Method void Transformer.pixelsToValue(float[])>
			i = Math.round(af[1]);
	//   20   48:aload           5
	//   21   50:iconst_1        
	//   22   51:faload          
	//   23   52:invokestatic    #86  <Method int Math.round(float)>
	//   24   55:istore_2        
		} else
	//*  25   56:iload_2         
	//*  26   57:ireturn         
		{
			f = getBase(f);
	//   27   58:aload_0         
	//   28   59:fload_1         
	//   29   60:invokevirtual   #88  <Method float getBase(float)>
	//   30   63:fstore_1        
			i = ((BarDataProvider)mChart).getBarData().getDataSetCount();
	//   31   64:aload_0         
	//   32   65:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   33   68:checkcast       #17  <Class BarDataProvider>
	//   34   71:invokeinterface #37  <Method BarData BarDataProvider.getBarData()>
	//   35   76:invokevirtual   #43  <Method int BarData.getDataSetCount()>
	//   36   79:istore_2        
			int j = (int)f / i;
	//   37   80:fload_1         
	//   38   81:f2i             
	//   39   82:iload_2         
	//   40   83:idiv            
	//   41   84:istore_3        
			int k = ((BarDataProvider)mChart).getData().getXValCount();
	//   42   85:aload_0         
	//   43   86:getfield        #15  <Field com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider mChart>
	//   44   89:checkcast       #17  <Class BarDataProvider>
	//   45   92:invokeinterface #92  <Method BarLineScatterCandleBubbleData BarDataProvider.getData()>
	//   46   97:invokevirtual   #97  <Method int BarLineScatterCandleBubbleData.getXValCount()>
	//   47  100:istore          4
			if(j < 0)
	//*  48  102:iload_3         
	//*  49  103:ifge            108
				return 0;
	//   50  106:iconst_0        
	//   51  107:ireturn         
			i = j;
	//   52  108:iload_3         
	//   53  109:istore_2        
			if(j >= k)
	//*  54  110:iload_3         
	//*  55  111:iload           4
	//*  56  113:icmplt          56
				return k - 1;
	//   57  116:iload           4
	//   58  118:iconst_1        
	//   59  119:isub            
	//   60  120:ireturn         
		}
		return i;
	}
}
