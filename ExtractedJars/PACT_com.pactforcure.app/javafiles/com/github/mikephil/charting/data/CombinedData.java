// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			BarLineScatterCandleBubbleData, LineData, BarData, CandleData, 
//			ScatterData, BubbleData

public class CombinedData extends BarLineScatterCandleBubbleData
{

	public CombinedData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void BarLineScatterCandleBubbleData()>
	//    2    4:return          
	}

	public CombinedData(List list)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void BarLineScatterCandleBubbleData(List)>
	//    3    5:return          
	}

	public CombinedData(String as[])
	{
		super(as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void BarLineScatterCandleBubbleData(String[])>
	//    3    5:return          
	}

	public List getAllData()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #32  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void ArrayList()>
	//    3    7:astore_1        
		if(mLineData != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #35  <Field LineData mLineData>
	//*   6   12:ifnull          26
			((List) (arraylist)).add(((Object) (mLineData)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field LineData mLineData>
	//   10   20:invokeinterface #41  <Method boolean List.add(Object)>
	//   11   25:pop             
		if(mBarData != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #43  <Field BarData mBarData>
	//*  14   30:ifnull          44
			((List) (arraylist)).add(((Object) (mBarData)));
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #43  <Field BarData mBarData>
	//   18   38:invokeinterface #41  <Method boolean List.add(Object)>
	//   19   43:pop             
		if(mScatterData != null)
	//*  20   44:aload_0         
	//*  21   45:getfield        #45  <Field ScatterData mScatterData>
	//*  22   48:ifnull          62
			((List) (arraylist)).add(((Object) (mScatterData)));
	//   23   51:aload_1         
	//   24   52:aload_0         
	//   25   53:getfield        #45  <Field ScatterData mScatterData>
	//   26   56:invokeinterface #41  <Method boolean List.add(Object)>
	//   27   61:pop             
		if(mCandleData != null)
	//*  28   62:aload_0         
	//*  29   63:getfield        #47  <Field CandleData mCandleData>
	//*  30   66:ifnull          80
			((List) (arraylist)).add(((Object) (mCandleData)));
	//   31   69:aload_1         
	//   32   70:aload_0         
	//   33   71:getfield        #47  <Field CandleData mCandleData>
	//   34   74:invokeinterface #41  <Method boolean List.add(Object)>
	//   35   79:pop             
		if(mBubbleData != null)
	//*  36   80:aload_0         
	//*  37   81:getfield        #49  <Field BubbleData mBubbleData>
	//*  38   84:ifnull          98
			((List) (arraylist)).add(((Object) (mBubbleData)));
	//   39   87:aload_1         
	//   40   88:aload_0         
	//   41   89:getfield        #49  <Field BubbleData mBubbleData>
	//   42   92:invokeinterface #41  <Method boolean List.add(Object)>
	//   43   97:pop             
		return ((List) (arraylist));
	//   44   98:aload_1         
	//   45   99:areturn         
	}

	public BarData getBarData()
	{
		return mBarData;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field BarData mBarData>
	//    2    4:areturn         
	}

	public BubbleData getBubbleData()
	{
		return mBubbleData;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BubbleData mBubbleData>
	//    2    4:areturn         
	}

	public CandleData getCandleData()
	{
		return mCandleData;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field CandleData mCandleData>
	//    2    4:areturn         
	}

	public LineData getLineData()
	{
		return mLineData;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field LineData mLineData>
	//    2    4:areturn         
	}

	public ScatterData getScatterData()
	{
		return mScatterData;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ScatterData mScatterData>
	//    2    4:areturn         
	}

	public void notifyDataChanged()
	{
		if(mLineData != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field LineData mLineData>
	//*   2    4:ifnull          14
			mLineData.notifyDataChanged();
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field LineData mLineData>
	//    5   11:invokevirtual   #65  <Method void LineData.notifyDataChanged()>
		if(mBarData != null)
	//*   6   14:aload_0         
	//*   7   15:getfield        #43  <Field BarData mBarData>
	//*   8   18:ifnull          28
			mBarData.notifyDataChanged();
	//    9   21:aload_0         
	//   10   22:getfield        #43  <Field BarData mBarData>
	//   11   25:invokevirtual   #68  <Method void BarData.notifyDataChanged()>
		if(mCandleData != null)
	//*  12   28:aload_0         
	//*  13   29:getfield        #47  <Field CandleData mCandleData>
	//*  14   32:ifnull          42
			mCandleData.notifyDataChanged();
	//   15   35:aload_0         
	//   16   36:getfield        #47  <Field CandleData mCandleData>
	//   17   39:invokevirtual   #71  <Method void CandleData.notifyDataChanged()>
		if(mScatterData != null)
	//*  18   42:aload_0         
	//*  19   43:getfield        #45  <Field ScatterData mScatterData>
	//*  20   46:ifnull          56
			mScatterData.notifyDataChanged();
	//   21   49:aload_0         
	//   22   50:getfield        #45  <Field ScatterData mScatterData>
	//   23   53:invokevirtual   #74  <Method void ScatterData.notifyDataChanged()>
		if(mBubbleData != null)
	//*  24   56:aload_0         
	//*  25   57:getfield        #49  <Field BubbleData mBubbleData>
	//*  26   60:ifnull          70
			mBubbleData.notifyDataChanged();
	//   27   63:aload_0         
	//   28   64:getfield        #49  <Field BubbleData mBubbleData>
	//   29   67:invokevirtual   #77  <Method void BubbleData.notifyDataChanged()>
		init();
	//   30   70:aload_0         
	//   31   71:invokevirtual   #80  <Method void init()>
	//   32   74:return          
	}

	public void setData(BarData bardata)
	{
		mBarData = bardata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #43  <Field BarData mBarData>
		mDataSets.addAll(((java.util.Collection) (bardata.getDataSets())));
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field List mDataSets>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #89  <Method List BarData.getDataSets()>
	//    7   13:invokeinterface #93  <Method boolean List.addAll(java.util.Collection)>
	//    8   18:pop             
		init();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #80  <Method void init()>
	//   11   23:return          
	}

	public void setData(BubbleData bubbledata)
	{
		mBubbleData = bubbledata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field BubbleData mBubbleData>
		mDataSets.addAll(((java.util.Collection) (bubbledata.getDataSets())));
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field List mDataSets>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #95  <Method List BubbleData.getDataSets()>
	//    7   13:invokeinterface #93  <Method boolean List.addAll(java.util.Collection)>
	//    8   18:pop             
		init();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #80  <Method void init()>
	//   11   23:return          
	}

	public void setData(CandleData candledata)
	{
		mCandleData = candledata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field CandleData mCandleData>
		mDataSets.addAll(((java.util.Collection) (candledata.getDataSets())));
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field List mDataSets>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #97  <Method List CandleData.getDataSets()>
	//    7   13:invokeinterface #93  <Method boolean List.addAll(java.util.Collection)>
	//    8   18:pop             
		init();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #80  <Method void init()>
	//   11   23:return          
	}

	public void setData(LineData linedata)
	{
		mLineData = linedata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field LineData mLineData>
		mDataSets.addAll(((java.util.Collection) (linedata.getDataSets())));
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field List mDataSets>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #99  <Method List LineData.getDataSets()>
	//    7   13:invokeinterface #93  <Method boolean List.addAll(java.util.Collection)>
	//    8   18:pop             
		init();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #80  <Method void init()>
	//   11   23:return          
	}

	public void setData(ScatterData scatterdata)
	{
		mScatterData = scatterdata;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field ScatterData mScatterData>
		mDataSets.addAll(((java.util.Collection) (scatterdata.getDataSets())));
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field List mDataSets>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #101 <Method List ScatterData.getDataSets()>
	//    7   13:invokeinterface #93  <Method boolean List.addAll(java.util.Collection)>
	//    8   18:pop             
		init();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #80  <Method void init()>
	//   11   23:return          
	}

	private BarData mBarData;
	private BubbleData mBubbleData;
	private CandleData mCandleData;
	private LineData mLineData;
	private ScatterData mScatterData;
}
