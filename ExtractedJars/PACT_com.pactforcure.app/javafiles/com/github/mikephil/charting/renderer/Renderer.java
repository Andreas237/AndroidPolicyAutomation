// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class Renderer
{

	public Renderer(ViewPortHandler viewporthandler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mMinX = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int mMinX>
		mMaxX = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #18  <Field int mMaxX>
		mViewPortHandler = viewporthandler;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #20  <Field ViewPortHandler mViewPortHandler>
	//   11   19:return          
	}

	public void calcXBounds(BarLineScatterCandleBubbleDataProvider barlinescattercandlebubbledataprovider, int i)
	{
		int k = barlinescattercandlebubbledataprovider.getLowestVisibleXIndex();
	//    0    0:aload_1         
	//    1    1:invokeinterface #29  <Method int BarLineScatterCandleBubbleDataProvider.getLowestVisibleXIndex()>
	//    2    6:istore          4
		int l = barlinescattercandlebubbledataprovider.getHighestVisibleXIndex();
	//    3    8:aload_1         
	//    4    9:invokeinterface #32  <Method int BarLineScatterCandleBubbleDataProvider.getHighestVisibleXIndex()>
	//    5   14:istore          5
		int j;
		if(k % i == 0)
	//*   6   16:iload           4
	//*   7   18:iload_2         
	//*   8   19:irem            
	//*   9   20:ifne            64
			j = i;
	//   10   23:iload_2         
	//   11   24:istore_3        
		else
	//*  12   25:aload_0         
	//*  13   26:iload           4
	//*  14   28:iload_2         
	//*  15   29:idiv            
	//*  16   30:iload_2         
	//*  17   31:imul            
	//*  18   32:iload_3         
	//*  19   33:isub            
	//*  20   34:iconst_0        
	//*  21   35:invokestatic    #38  <Method int Math.max(int, int)>
	//*  22   38:putfield        #16  <Field int mMinX>
	//*  23   41:aload_0         
	//*  24   42:iload           5
	//*  25   44:iload_2         
	//*  26   45:idiv            
	//*  27   46:iload_2         
	//*  28   47:imul            
	//*  29   48:iload_2         
	//*  30   49:iadd            
	//*  31   50:aload_1         
	//*  32   51:invokeinterface #42  <Method float BarLineScatterCandleBubbleDataProvider.getXChartMax()>
	//*  33   56:f2i             
	//*  34   57:invokestatic    #45  <Method int Math.min(int, int)>
	//*  35   60:putfield        #18  <Field int mMaxX>
	//*  36   63:return          
			j = 0;
	//   37   64:iconst_0        
	//   38   65:istore_3        
		mMinX = Math.max((k / i) * i - j, 0);
		mMaxX = Math.min((l / i) * i + i, (int)barlinescattercandlebubbledataprovider.getXChartMax());
	//*  39   66:goto            25
	}

	protected boolean fitsBounds(float f, float f1, float f2)
	{
		return f >= f1 && f <= f2;
	//    0    0:fload_1         
	//    1    1:fload_2         
	//    2    2:fcmpg           
	//    3    3:iflt            12
	//    4    6:fload_1         
	//    5    7:fload_3         
	//    6    8:fcmpl           
	//    7    9:ifle            14
	//    8   12:iconst_0        
	//    9   13:ireturn         
	//   10   14:iconst_1        
	//   11   15:ireturn         
	}

	protected int mMaxX;
	protected int mMinX;
	protected ViewPortHandler mViewPortHandler;
}
