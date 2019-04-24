// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.ICandleDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			LineScatterCandleRadarDataSet, CandleEntry, DataSet

public class CandleDataSet extends LineScatterCandleRadarDataSet
	implements ICandleDataSet
{

	public CandleDataSet(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void LineScatterCandleRadarDataSet(List, String)>
		mShadowWidth = 3F;
	//    4    6:aload_0         
	//    5    7:ldc1            #26  <Float 3F>
	//    6    9:putfield        #28  <Field float mShadowWidth>
		mShowCandleBar = true;
	//    7   12:aload_0         
	//    8   13:iconst_1        
	//    9   14:putfield        #30  <Field boolean mShowCandleBar>
		mBarSpace = 0.1F;
	//   10   17:aload_0         
	//   11   18:ldc1            #31  <Float 0.1F>
	//   12   20:putfield        #33  <Field float mBarSpace>
		mShadowColorSameAsCandle = false;
	//   13   23:aload_0         
	//   14   24:iconst_0        
	//   15   25:putfield        #35  <Field boolean mShadowColorSameAsCandle>
		mIncreasingPaintStyle = android.graphics.Paint.Style.STROKE;
	//   16   28:aload_0         
	//   17   29:getstatic       #40  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   18   32:putfield        #42  <Field android.graphics.Paint$Style mIncreasingPaintStyle>
		mDecreasingPaintStyle = android.graphics.Paint.Style.FILL;
	//   19   35:aload_0         
	//   20   36:getstatic       #45  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   21   39:putfield        #47  <Field android.graphics.Paint$Style mDecreasingPaintStyle>
		mNeutralColor = -1;
	//   22   42:aload_0         
	//   23   43:iconst_m1       
	//   24   44:putfield        #49  <Field int mNeutralColor>
		mIncreasingColor = -1;
	//   25   47:aload_0         
	//   26   48:iconst_m1       
	//   27   49:putfield        #51  <Field int mIncreasingColor>
		mDecreasingColor = -1;
	//   28   52:aload_0         
	//   29   53:iconst_m1       
	//   30   54:putfield        #53  <Field int mDecreasingColor>
		mShadowColor = -1;
	//   31   57:aload_0         
	//   32   58:iconst_m1       
	//   33   59:putfield        #55  <Field int mShadowColor>
	//   34   62:return          
	}

	public void calcMinMax(int i, int j)
	{
		if(mYVals != null && mYVals.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field List mYVals>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:getfield        #64  <Field List mYVals>
	//*   6   12:invokeinterface #70  <Method int List.size()>
	//*   7   17:ifeq            7
		{
			if(j == 0 || j >= mYVals.size())
	//*   8   20:iload_2         
	//*   9   21:ifeq            37
	//*  10   24:iload_2         
	//*  11   25:aload_0         
	//*  12   26:getfield        #64  <Field List mYVals>
	//*  13   29:invokeinterface #70  <Method int List.size()>
	//*  14   34:icmplt          127
				j = mYVals.size() - 1;
	//   15   37:aload_0         
	//   16   38:getfield        #64  <Field List mYVals>
	//   17   41:invokeinterface #70  <Method int List.size()>
	//   18   46:iconst_1        
	//   19   47:isub            
	//   20   48:istore_2        
			mYMin = 3.402823E+38F;
	//   21   49:aload_0         
	//   22   50:ldc1            #71  <Float 3.402823E+38F>
	//   23   52:putfield        #74  <Field float mYMin>
			mYMax = -3.402823E+38F;
	//   24   55:aload_0         
	//   25   56:ldc1            #75  <Float -3.402823E+38F>
	//   26   58:putfield        #78  <Field float mYMax>
			while(i <= j) 
	//*  27   61:iload_1         
	//*  28   62:iload_2         
	//*  29   63:icmpgt          7
			{
				CandleEntry candleentry = (CandleEntry)mYVals.get(i);
	//   30   66:aload_0         
	//   31   67:getfield        #64  <Field List mYVals>
	//   32   70:iload_1         
	//   33   71:invokeinterface #82  <Method Object List.get(int)>
	//   34   76:checkcast       #84  <Class CandleEntry>
	//   35   79:astore_3        
				if(candleentry.getLow() < mYMin)
	//*  36   80:aload_3         
	//*  37   81:invokevirtual   #88  <Method float CandleEntry.getLow()>
	//*  38   84:aload_0         
	//*  39   85:getfield        #74  <Field float mYMin>
	//*  40   88:fcmpg           
	//*  41   89:ifge            100
					mYMin = candleentry.getLow();
	//   42   92:aload_0         
	//   43   93:aload_3         
	//   44   94:invokevirtual   #88  <Method float CandleEntry.getLow()>
	//   45   97:putfield        #74  <Field float mYMin>
				if(candleentry.getHigh() > mYMax)
	//*  46  100:aload_3         
	//*  47  101:invokevirtual   #91  <Method float CandleEntry.getHigh()>
	//*  48  104:aload_0         
	//*  49  105:getfield        #78  <Field float mYMax>
	//*  50  108:fcmpl           
	//*  51  109:ifle            120
					mYMax = candleentry.getHigh();
	//   52  112:aload_0         
	//   53  113:aload_3         
	//   54  114:invokevirtual   #91  <Method float CandleEntry.getHigh()>
	//   55  117:putfield        #78  <Field float mYMax>
				i++;
	//   56  120:iload_1         
	//   57  121:iconst_1        
	//   58  122:iadd            
	//   59  123:istore_1        
			}
		}
	//*  60  124:goto            61
	//*  61  127:goto            49
	}

	public DataSet copy()
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #95  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < mYVals.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #64  <Field List mYVals>
	//*   9   15:invokeinterface #70  <Method int List.size()>
	//*  10   20:icmpge          53
			((List) (obj)).add(((Object) (((CandleEntry)mYVals.get(i)).copy())));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #64  <Field List mYVals>
	//   14   28:iload_1         
	//   15   29:invokeinterface #82  <Method Object List.get(int)>
	//   16   34:checkcast       #84  <Class CandleEntry>
	//   17   37:invokevirtual   #101 <Method CandleEntry CandleEntry.copy()>
	//   18   40:invokeinterface #105 <Method boolean List.add(Object)>
	//   19   45:pop             

	//   20   46:iload_1         
	//   21   47:iconst_1        
	//   22   48:iadd            
	//   23   49:istore_1        
	//*  24   50:goto            10
		obj = ((Object) (new CandleDataSet(((List) (obj)), getLabel())));
	//   25   53:new             #2   <Class CandleDataSet>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:invokevirtual   #109 <Method String getLabel()>
	//   30   62:invokespecial   #110 <Method void CandleDataSet(List, String)>
	//   31   65:astore_2        
		obj.mColors = mColors;
	//   32   66:aload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #113 <Field List mColors>
	//   35   71:putfield        #113 <Field List mColors>
		obj.mShadowWidth = mShadowWidth;
	//   36   74:aload_2         
	//   37   75:aload_0         
	//   38   76:getfield        #28  <Field float mShadowWidth>
	//   39   79:putfield        #28  <Field float mShadowWidth>
		obj.mShowCandleBar = mShowCandleBar;
	//   40   82:aload_2         
	//   41   83:aload_0         
	//   42   84:getfield        #30  <Field boolean mShowCandleBar>
	//   43   87:putfield        #30  <Field boolean mShowCandleBar>
		obj.mBarSpace = mBarSpace;
	//   44   90:aload_2         
	//   45   91:aload_0         
	//   46   92:getfield        #33  <Field float mBarSpace>
	//   47   95:putfield        #33  <Field float mBarSpace>
		obj.mHighLightColor = mHighLightColor;
	//   48   98:aload_2         
	//   49   99:aload_0         
	//   50  100:getfield        #116 <Field int mHighLightColor>
	//   51  103:putfield        #116 <Field int mHighLightColor>
		obj.mIncreasingPaintStyle = mIncreasingPaintStyle;
	//   52  106:aload_2         
	//   53  107:aload_0         
	//   54  108:getfield        #42  <Field android.graphics.Paint$Style mIncreasingPaintStyle>
	//   55  111:putfield        #42  <Field android.graphics.Paint$Style mIncreasingPaintStyle>
		obj.mDecreasingPaintStyle = mDecreasingPaintStyle;
	//   56  114:aload_2         
	//   57  115:aload_0         
	//   58  116:getfield        #47  <Field android.graphics.Paint$Style mDecreasingPaintStyle>
	//   59  119:putfield        #47  <Field android.graphics.Paint$Style mDecreasingPaintStyle>
		obj.mShadowColor = mShadowColor;
	//   60  122:aload_2         
	//   61  123:aload_0         
	//   62  124:getfield        #55  <Field int mShadowColor>
	//   63  127:putfield        #55  <Field int mShadowColor>
		return ((DataSet) (obj));
	//   64  130:aload_2         
	//   65  131:areturn         
	}

	public float getBarSpace()
	{
		return mBarSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float mBarSpace>
	//    2    4:freturn         
	}

	public int getDecreasingColor()
	{
		return mDecreasingColor;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int mDecreasingColor>
	//    2    4:ireturn         
	}

	public android.graphics.Paint.Style getDecreasingPaintStyle()
	{
		return mDecreasingPaintStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field android.graphics.Paint$Style mDecreasingPaintStyle>
	//    2    4:areturn         
	}

	public int getIncreasingColor()
	{
		return mIncreasingColor;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field int mIncreasingColor>
	//    2    4:ireturn         
	}

	public android.graphics.Paint.Style getIncreasingPaintStyle()
	{
		return mIncreasingPaintStyle;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field android.graphics.Paint$Style mIncreasingPaintStyle>
	//    2    4:areturn         
	}

	public int getNeutralColor()
	{
		return mNeutralColor;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mNeutralColor>
	//    2    4:ireturn         
	}

	public int getShadowColor()
	{
		return mShadowColor;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int mShadowColor>
	//    2    4:ireturn         
	}

	public boolean getShadowColorSameAsCandle()
	{
		return mShadowColorSameAsCandle;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field boolean mShadowColorSameAsCandle>
	//    2    4:ireturn         
	}

	public float getShadowWidth()
	{
		return mShadowWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field float mShadowWidth>
	//    2    4:freturn         
	}

	public boolean getShowCandleBar()
	{
		return mShowCandleBar;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean mShowCandleBar>
	//    2    4:ireturn         
	}

	public void setBarSpace(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f < 0.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_0        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f1 = 0.0F;
	//    6    8:fconst_0        
	//    7    9:fstore_2        
		f = f1;
	//    8   10:fload_2         
	//    9   11:fstore_1        
		if(f1 > 0.45F)
	//*  10   12:fload_2         
	//*  11   13:ldc1            #132 <Float 0.45F>
	//*  12   15:fcmpl           
	//*  13   16:ifle            22
			f = 0.45F;
	//   14   19:ldc1            #132 <Float 0.45F>
	//   15   21:fstore_1        
		mBarSpace = f;
	//   16   22:aload_0         
	//   17   23:fload_1         
	//   18   24:putfield        #33  <Field float mBarSpace>
	//   19   27:return          
	}

	public void setDecreasingColor(int i)
	{
		mDecreasingColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #53  <Field int mDecreasingColor>
	//    3    5:return          
	}

	public void setDecreasingPaintStyle(android.graphics.Paint.Style style)
	{
		mDecreasingPaintStyle = style;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field android.graphics.Paint$Style mDecreasingPaintStyle>
	//    3    5:return          
	}

	public void setIncreasingColor(int i)
	{
		mIncreasingColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field int mIncreasingColor>
	//    3    5:return          
	}

	public void setIncreasingPaintStyle(android.graphics.Paint.Style style)
	{
		mIncreasingPaintStyle = style;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #42  <Field android.graphics.Paint$Style mIncreasingPaintStyle>
	//    3    5:return          
	}

	public void setNeutralColor(int i)
	{
		mNeutralColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int mNeutralColor>
	//    3    5:return          
	}

	public void setShadowColor(int i)
	{
		mShadowColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #55  <Field int mShadowColor>
	//    3    5:return          
	}

	public void setShadowColorSameAsCandle(boolean flag)
	{
		mShadowColorSameAsCandle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field boolean mShadowColorSameAsCandle>
	//    3    5:return          
	}

	public void setShadowWidth(float f)
	{
		mShadowWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #149 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #28  <Field float mShadowWidth>
	//    4    8:return          
	}

	public void setShadowWidth(boolean flag)
	{
		mShowCandleBar = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean mShowCandleBar>
	//    3    5:return          
	}

	private float mBarSpace;
	protected int mDecreasingColor;
	protected android.graphics.Paint.Style mDecreasingPaintStyle;
	protected int mIncreasingColor;
	protected android.graphics.Paint.Style mIncreasingPaintStyle;
	protected int mNeutralColor;
	protected int mShadowColor;
	private boolean mShadowColorSameAsCandle;
	private float mShadowWidth;
	private boolean mShowCandleBar;
}
