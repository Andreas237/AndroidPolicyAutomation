// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IBubbleDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			BarLineScatterCandleBubbleDataSet, BubbleEntry, DataSet

public class BubbleDataSet extends BarLineScatterCandleBubbleDataSet
	implements IBubbleDataSet
{

	public BubbleDataSet(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void BarLineScatterCandleBubbleDataSet(List, String)>
		mHighlightCircleWidth = 2.5F;
	//    4    6:aload_0         
	//    5    7:ldc1            #17  <Float 2.5F>
	//    6    9:putfield        #19  <Field float mHighlightCircleWidth>
	//    7   12:return          
	}

	private float largestSize(BubbleEntry bubbleentry)
	{
		return bubbleentry.getSize();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method float BubbleEntry.getSize()>
	//    2    4:freturn         
	}

	private float xMax(BubbleEntry bubbleentry)
	{
		return (float)bubbleentry.getXIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method int BubbleEntry.getXIndex()>
	//    2    4:i2f             
	//    3    5:freturn         
	}

	private float xMin(BubbleEntry bubbleentry)
	{
		return (float)bubbleentry.getXIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method int BubbleEntry.getXIndex()>
	//    2    4:i2f             
	//    3    5:freturn         
	}

	private float yMax(BubbleEntry bubbleentry)
	{
		return bubbleentry.getVal();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method float BubbleEntry.getVal()>
	//    2    4:freturn         
	}

	private float yMin(BubbleEntry bubbleentry)
	{
		return bubbleentry.getVal();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #40  <Method float BubbleEntry.getVal()>
	//    2    4:freturn         
	}

	public void calcMinMax(int i, int j)
	{
		if(mYVals != null && mYVals.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List mYVals>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #47  <Field List mYVals>
	//*   6   12:invokeinterface #52  <Method int List.size()>
	//*   7   17:ifeq            7
		{
			if(j == 0 || j >= mYVals.size())
	//*   8   20:iload_2         
	//*   9   21:ifeq            37
	//*  10   24:iload_2         
	//*  11   25:aload_0         
	//*  12   26:getfield        #47  <Field List mYVals>
	//*  13   29:invokeinterface #52  <Method int List.size()>
	//*  14   34:icmplt          229
				j = mYVals.size() - 1;
	//   15   37:aload_0         
	//   16   38:getfield        #47  <Field List mYVals>
	//   17   41:invokeinterface #52  <Method int List.size()>
	//   18   46:iconst_1        
	//   19   47:isub            
	//   20   48:istore_2        
			mYMin = yMin((BubbleEntry)mYVals.get(i));
	//   21   49:aload_0         
	//   22   50:aload_0         
	//   23   51:aload_0         
	//   24   52:getfield        #47  <Field List mYVals>
	//   25   55:iload_1         
	//   26   56:invokeinterface #56  <Method Object List.get(int)>
	//   27   61:checkcast       #26  <Class BubbleEntry>
	//   28   64:invokespecial   #58  <Method float yMin(BubbleEntry)>
	//   29   67:putfield        #61  <Field float mYMin>
			mYMax = yMax((BubbleEntry)mYVals.get(i));
	//   30   70:aload_0         
	//   31   71:aload_0         
	//   32   72:aload_0         
	//   33   73:getfield        #47  <Field List mYVals>
	//   34   76:iload_1         
	//   35   77:invokeinterface #56  <Method Object List.get(int)>
	//   36   82:checkcast       #26  <Class BubbleEntry>
	//   37   85:invokespecial   #63  <Method float yMax(BubbleEntry)>
	//   38   88:putfield        #66  <Field float mYMax>
			while(i <= j) 
	//*  39   91:iload_1         
	//*  40   92:iload_2         
	//*  41   93:icmpgt          7
			{
				BubbleEntry bubbleentry = (BubbleEntry)mYVals.get(i);
	//   42   96:aload_0         
	//   43   97:getfield        #47  <Field List mYVals>
	//   44  100:iload_1         
	//   45  101:invokeinterface #56  <Method Object List.get(int)>
	//   46  106:checkcast       #26  <Class BubbleEntry>
	//   47  109:astore          5
				float f = yMin(bubbleentry);
	//   48  111:aload_0         
	//   49  112:aload           5
	//   50  114:invokespecial   #58  <Method float yMin(BubbleEntry)>
	//   51  117:fstore_3        
				float f1 = yMax(bubbleentry);
	//   52  118:aload_0         
	//   53  119:aload           5
	//   54  121:invokespecial   #63  <Method float yMax(BubbleEntry)>
	//   55  124:fstore          4
				if(f < mYMin)
	//*  56  126:fload_3         
	//*  57  127:aload_0         
	//*  58  128:getfield        #61  <Field float mYMin>
	//*  59  131:fcmpg           
	//*  60  132:ifge            140
					mYMin = f;
	//   61  135:aload_0         
	//   62  136:fload_3         
	//   63  137:putfield        #61  <Field float mYMin>
				if(f1 > mYMax)
	//*  64  140:fload           4
	//*  65  142:aload_0         
	//*  66  143:getfield        #66  <Field float mYMax>
	//*  67  146:fcmpl           
	//*  68  147:ifle            156
					mYMax = f1;
	//   69  150:aload_0         
	//   70  151:fload           4
	//   71  153:putfield        #66  <Field float mYMax>
				f = xMin(bubbleentry);
	//   72  156:aload_0         
	//   73  157:aload           5
	//   74  159:invokespecial   #68  <Method float xMin(BubbleEntry)>
	//   75  162:fstore_3        
				f1 = xMax(bubbleentry);
	//   76  163:aload_0         
	//   77  164:aload           5
	//   78  166:invokespecial   #70  <Method float xMax(BubbleEntry)>
	//   79  169:fstore          4
				if(f < mXMin)
	//*  80  171:fload_3         
	//*  81  172:aload_0         
	//*  82  173:getfield        #72  <Field float mXMin>
	//*  83  176:fcmpg           
	//*  84  177:ifge            185
					mXMin = f;
	//   85  180:aload_0         
	//   86  181:fload_3         
	//   87  182:putfield        #72  <Field float mXMin>
				if(f1 > mXMax)
	//*  88  185:fload           4
	//*  89  187:aload_0         
	//*  90  188:getfield        #74  <Field float mXMax>
	//*  91  191:fcmpl           
	//*  92  192:ifle            201
					mXMax = f1;
	//   93  195:aload_0         
	//   94  196:fload           4
	//   95  198:putfield        #74  <Field float mXMax>
				f = largestSize(bubbleentry);
	//   96  201:aload_0         
	//   97  202:aload           5
	//   98  204:invokespecial   #76  <Method float largestSize(BubbleEntry)>
	//   99  207:fstore_3        
				if(f > mMaxSize)
	//* 100  208:fload_3         
	//* 101  209:aload_0         
	//* 102  210:getfield        #78  <Field float mMaxSize>
	//* 103  213:fcmpl           
	//* 104  214:ifle            222
					mMaxSize = f;
	//  105  217:aload_0         
	//  106  218:fload_3         
	//  107  219:putfield        #78  <Field float mMaxSize>
				i++;
	//  108  222:iload_1         
	//  109  223:iconst_1        
	//  110  224:iadd            
	//  111  225:istore_1        
			}
		}
	//* 112  226:goto            91
	//* 113  229:goto            49
	}

	public DataSet copy()
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #82  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < mYVals.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #47  <Field List mYVals>
	//*   9   15:invokeinterface #52  <Method int List.size()>
	//*  10   20:icmpge          53
			((List) (obj)).add(((Object) (((BubbleEntry)mYVals.get(i)).copy())));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #47  <Field List mYVals>
	//   14   28:iload_1         
	//   15   29:invokeinterface #56  <Method Object List.get(int)>
	//   16   34:checkcast       #26  <Class BubbleEntry>
	//   17   37:invokevirtual   #88  <Method BubbleEntry BubbleEntry.copy()>
	//   18   40:invokeinterface #92  <Method boolean List.add(Object)>
	//   19   45:pop             

	//   20   46:iload_1         
	//   21   47:iconst_1        
	//   22   48:iadd            
	//   23   49:istore_1        
	//*  24   50:goto            10
		obj = ((Object) (new BubbleDataSet(((List) (obj)), getLabel())));
	//   25   53:new             #2   <Class BubbleDataSet>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:invokevirtual   #96  <Method String getLabel()>
	//   30   62:invokespecial   #97  <Method void BubbleDataSet(List, String)>
	//   31   65:astore_2        
		obj.mColors = mColors;
	//   32   66:aload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #100 <Field List mColors>
	//   35   71:putfield        #100 <Field List mColors>
		obj.mHighLightColor = mHighLightColor;
	//   36   74:aload_2         
	//   37   75:aload_0         
	//   38   76:getfield        #104 <Field int mHighLightColor>
	//   39   79:putfield        #104 <Field int mHighLightColor>
		return ((DataSet) (obj));
	//   40   82:aload_2         
	//   41   83:areturn         
	}

	public float getHighlightCircleWidth()
	{
		return mHighlightCircleWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float mHighlightCircleWidth>
	//    2    4:freturn         
	}

	public float getMaxSize()
	{
		return mMaxSize;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field float mMaxSize>
	//    2    4:freturn         
	}

	public float getXMax()
	{
		return mXMax;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field float mXMax>
	//    2    4:freturn         
	}

	public float getXMin()
	{
		return mXMin;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field float mXMin>
	//    2    4:freturn         
	}

	public void setHighlightCircleWidth(float f)
	{
		mHighlightCircleWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #117 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #19  <Field float mHighlightCircleWidth>
	//    4    8:return          
	}

	private float mHighlightCircleWidth;
	protected float mMaxSize;
	protected float mXMax;
	protected float mXMin;
}
