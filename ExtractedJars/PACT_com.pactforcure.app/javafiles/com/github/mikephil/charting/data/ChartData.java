// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.graphics.Typeface;
import android.util.Log;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import java.util.*;

// Referenced classes of package com.github.mikephil.charting.data:
//			ScatterData, Entry

public abstract class ChartData
{

	public ChartData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mYMax = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #26  <Field float mYMax>
		mYMin = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #28  <Field float mYMin>
		mLeftAxisMax = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #30  <Field float mLeftAxisMax>
		mLeftAxisMin = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #32  <Field float mLeftAxisMin>
		mRightAxisMax = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #34  <Field float mRightAxisMax>
		mRightAxisMin = 0.0F;
	//   17   29:aload_0         
	//   18   30:fconst_0        
	//   19   31:putfield        #36  <Field float mRightAxisMin>
		mYValCount = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #38  <Field int mYValCount>
		mXValMaximumLength = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #40  <Field float mXValMaximumLength>
		mXVals = ((List) (new ArrayList()));
	//   26   44:aload_0         
	//   27   45:new             #42  <Class ArrayList>
	//   28   48:dup             
	//   29   49:invokespecial   #43  <Method void ArrayList()>
	//   30   52:putfield        #45  <Field List mXVals>
		mDataSets = ((List) (new ArrayList()));
	//   31   55:aload_0         
	//   32   56:new             #42  <Class ArrayList>
	//   33   59:dup             
	//   34   60:invokespecial   #43  <Method void ArrayList()>
	//   35   63:putfield        #47  <Field List mDataSets>
	//   36   66:return          
	}

	public ChartData(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mYMax = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #26  <Field float mYMax>
		mYMin = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #28  <Field float mYMin>
		mLeftAxisMax = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #30  <Field float mLeftAxisMax>
		mLeftAxisMin = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #32  <Field float mLeftAxisMin>
		mRightAxisMax = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #34  <Field float mRightAxisMax>
		mRightAxisMin = 0.0F;
	//   17   29:aload_0         
	//   18   30:fconst_0        
	//   19   31:putfield        #36  <Field float mRightAxisMin>
		mYValCount = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #38  <Field int mYValCount>
		mXValMaximumLength = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #40  <Field float mXValMaximumLength>
		mXVals = list;
	//   26   44:aload_0         
	//   27   45:aload_1         
	//   28   46:putfield        #45  <Field List mXVals>
		mDataSets = ((List) (new ArrayList()));
	//   29   49:aload_0         
	//   30   50:new             #42  <Class ArrayList>
	//   31   53:dup             
	//   32   54:invokespecial   #43  <Method void ArrayList()>
	//   33   57:putfield        #47  <Field List mDataSets>
		init();
	//   34   60:aload_0         
	//   35   61:invokevirtual   #52  <Method void init()>
	//   36   64:return          
	}

	public ChartData(List list, List list1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mYMax = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #26  <Field float mYMax>
		mYMin = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #28  <Field float mYMin>
		mLeftAxisMax = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #30  <Field float mLeftAxisMax>
		mLeftAxisMin = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #32  <Field float mLeftAxisMin>
		mRightAxisMax = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #34  <Field float mRightAxisMax>
		mRightAxisMin = 0.0F;
	//   17   29:aload_0         
	//   18   30:fconst_0        
	//   19   31:putfield        #36  <Field float mRightAxisMin>
		mYValCount = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #38  <Field int mYValCount>
		mXValMaximumLength = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #40  <Field float mXValMaximumLength>
		mXVals = list;
	//   26   44:aload_0         
	//   27   45:aload_1         
	//   28   46:putfield        #45  <Field List mXVals>
		mDataSets = list1;
	//   29   49:aload_0         
	//   30   50:aload_2         
	//   31   51:putfield        #47  <Field List mDataSets>
		init();
	//   32   54:aload_0         
	//   33   55:invokevirtual   #52  <Method void init()>
	//   34   58:return          
	}

	public ChartData(String as[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mYMax = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #26  <Field float mYMax>
		mYMin = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #28  <Field float mYMin>
		mLeftAxisMax = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #30  <Field float mLeftAxisMax>
		mLeftAxisMin = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #32  <Field float mLeftAxisMin>
		mRightAxisMax = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #34  <Field float mRightAxisMax>
		mRightAxisMin = 0.0F;
	//   17   29:aload_0         
	//   18   30:fconst_0        
	//   19   31:putfield        #36  <Field float mRightAxisMin>
		mYValCount = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #38  <Field int mYValCount>
		mXValMaximumLength = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #40  <Field float mXValMaximumLength>
		mXVals = arrayToList(as);
	//   26   44:aload_0         
	//   27   45:aload_0         
	//   28   46:aload_1         
	//   29   47:invokespecial   #61  <Method List arrayToList(String[])>
	//   30   50:putfield        #45  <Field List mXVals>
		mDataSets = ((List) (new ArrayList()));
	//   31   53:aload_0         
	//   32   54:new             #42  <Class ArrayList>
	//   33   57:dup             
	//   34   58:invokespecial   #43  <Method void ArrayList()>
	//   35   61:putfield        #47  <Field List mDataSets>
		init();
	//   36   64:aload_0         
	//   37   65:invokevirtual   #52  <Method void init()>
	//   38   68:return          
	}

	public ChartData(String as[], List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		mYMax = 0.0F;
	//    2    4:aload_0         
	//    3    5:fconst_0        
	//    4    6:putfield        #26  <Field float mYMax>
		mYMin = 0.0F;
	//    5    9:aload_0         
	//    6   10:fconst_0        
	//    7   11:putfield        #28  <Field float mYMin>
		mLeftAxisMax = 0.0F;
	//    8   14:aload_0         
	//    9   15:fconst_0        
	//   10   16:putfield        #30  <Field float mLeftAxisMax>
		mLeftAxisMin = 0.0F;
	//   11   19:aload_0         
	//   12   20:fconst_0        
	//   13   21:putfield        #32  <Field float mLeftAxisMin>
		mRightAxisMax = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #34  <Field float mRightAxisMax>
		mRightAxisMin = 0.0F;
	//   17   29:aload_0         
	//   18   30:fconst_0        
	//   19   31:putfield        #36  <Field float mRightAxisMin>
		mYValCount = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #38  <Field int mYValCount>
		mXValMaximumLength = 0.0F;
	//   23   39:aload_0         
	//   24   40:fconst_0        
	//   25   41:putfield        #40  <Field float mXValMaximumLength>
		mXVals = arrayToList(as);
	//   26   44:aload_0         
	//   27   45:aload_0         
	//   28   46:aload_1         
	//   29   47:invokespecial   #61  <Method List arrayToList(String[])>
	//   30   50:putfield        #45  <Field List mXVals>
		mDataSets = list;
	//   31   53:aload_0         
	//   32   54:aload_2         
	//   33   55:putfield        #47  <Field List mDataSets>
		init();
	//   34   58:aload_0         
	//   35   59:invokevirtual   #52  <Method void init()>
	//   36   62:return          
	}

	private List arrayToList(String as[])
	{
		return Arrays.asList(((Object []) (as)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #69  <Method List Arrays.asList(Object[])>
	//    2    4:areturn         
	}

	private void calcXValMaximumLength()
	{
		if(mXVals.size() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field List mXVals>
	//*   2    4:invokeinterface #77  <Method int List.size()>
	//*   3    9:ifgt            18
		{
			mXValMaximumLength = 1.0F;
	//    4   12:aload_0         
	//    5   13:fconst_1        
	//    6   14:putfield        #40  <Field float mXValMaximumLength>
			return;
	//    7   17:return          
		}
		int j = 1;
	//    8   18:iconst_1        
	//    9   19:istore_2        
		for(int i = 0; i < mXVals.size();)
	//*  10   20:iconst_0        
	//*  11   21:istore_1        
	//*  12   22:iload_1         
	//*  13   23:aload_0         
	//*  14   24:getfield        #45  <Field List mXVals>
	//*  15   27:invokeinterface #77  <Method int List.size()>
	//*  16   32:icmpge          73
		{
			int l = ((String)mXVals.get(i)).length();
	//   17   35:aload_0         
	//   18   36:getfield        #45  <Field List mXVals>
	//   19   39:iload_1         
	//   20   40:invokeinterface #81  <Method Object List.get(int)>
	//   21   45:checkcast       #83  <Class String>
	//   22   48:invokevirtual   #86  <Method int String.length()>
	//   23   51:istore          4
			int k = j;
	//   24   53:iload_2         
	//   25   54:istore_3        
			if(l > j)
	//*  26   55:iload           4
	//*  27   57:iload_2         
	//*  28   58:icmple          64
				k = l;
	//   29   61:iload           4
	//   30   63:istore_3        
			i++;
	//   31   64:iload_1         
	//   32   65:iconst_1        
	//   33   66:iadd            
	//   34   67:istore_1        
			j = k;
	//   35   68:iload_3         
	//   36   69:istore_2        
		}

	//*  37   70:goto            22
		mXValMaximumLength = j;
	//   38   73:aload_0         
	//   39   74:iload_2         
	//   40   75:i2f             
	//   41   76:putfield        #40  <Field float mXValMaximumLength>
	//   42   79:return          
	}

	private void checkLegal()
	{
		if(mDataSets != null && !(this instanceof ScatterData))
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List mDataSets>
	//*   2    4:ifnonnull       8
	//*   3    7:return          
	//*   4    8:aload_0         
	//*   5    9:instanceof      #89  <Class ScatterData>
	//*   6   12:ifne            7
		{
			int i = 0;
	//    7   15:iconst_0        
	//    8   16:istore_1        
			while(i < mDataSets.size()) 
	//*   9   17:iload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #47  <Field List mDataSets>
	//*  12   22:invokeinterface #77  <Method int List.size()>
	//*  13   27:icmpge          7
			{
				if(((IDataSet)mDataSets.get(i)).getEntryCount() > mXVals.size())
	//*  14   30:aload_0         
	//*  15   31:getfield        #47  <Field List mDataSets>
	//*  16   34:iload_1         
	//*  17   35:invokeinterface #81  <Method Object List.get(int)>
	//*  18   40:checkcast       #91  <Class IDataSet>
	//*  19   43:invokeinterface #94  <Method int IDataSet.getEntryCount()>
	//*  20   48:aload_0         
	//*  21   49:getfield        #45  <Field List mXVals>
	//*  22   52:invokeinterface #77  <Method int List.size()>
	//*  23   57:icmple          70
					throw new IllegalArgumentException("One or more of the DataSet Entry arrays are longer than the x-values array of this ChartData object.");
	//   24   60:new             #96  <Class IllegalArgumentException>
	//   25   63:dup             
	//   26   64:ldc1            #98  <String "One or more of the DataSet Entry arrays are longer than the x-values array of this ChartData object.">
	//   27   66:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   28   69:athrow          
				i++;
	//   29   70:iload_1         
	//   30   71:iconst_1        
	//   31   72:iadd            
	//   32   73:istore_1        
			}
		}
	//*  33   74:goto            17
	}

	public static List generateXVals(int i, int j)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #42  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void ArrayList()>
	//    3    7:astore_2        
		for(; i < j; i++)
	//*   4    8:iload_0         
	//*   5    9:iload_1         
	//*   6   10:icmpge          46
			((List) (arraylist)).add(((Object) ((new StringBuilder()).append("").append(i).toString())));
	//    7   13:aload_2         
	//    8   14:new             #105 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #106 <Method void StringBuilder()>
	//   11   21:ldc1            #108 <String "">
	//   12   23:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:iload_0         
	//   14   27:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   15   30:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   16   33:invokeinterface #123 <Method boolean List.add(Object)>
	//   17   38:pop             

	//   18   39:iload_0         
	//   19   40:iconst_1        
	//   20   41:iadd            
	//   21   42:istore_0        
	//*  22   43:goto            8
		return ((List) (arraylist));
	//   23   46:aload_2         
	//   24   47:areturn         
	}

	private void handleEmptyAxis(IDataSet idataset, IDataSet idataset1)
	{
		if(idataset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       21
		{
			mLeftAxisMax = mRightAxisMax;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field float mRightAxisMax>
	//    5    9:putfield        #30  <Field float mLeftAxisMax>
			mLeftAxisMin = mRightAxisMin;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field float mRightAxisMin>
	//    9   17:putfield        #32  <Field float mLeftAxisMin>
		} else
	//*  10   20:return          
		if(idataset1 == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       20
		{
			mRightAxisMax = mLeftAxisMax;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #30  <Field float mLeftAxisMax>
	//   16   30:putfield        #34  <Field float mRightAxisMax>
			mRightAxisMin = mLeftAxisMin;
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #32  <Field float mLeftAxisMin>
	//   20   38:putfield        #36  <Field float mRightAxisMin>
			return;
	//   21   41:return          
		}
	}

	public void addDataSet(IDataSet idataset)
	{
		if(idataset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		mYValCount = mYValCount + idataset.getEntryCount();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field int mYValCount>
	//    6   10:aload_1         
	//    7   11:invokeinterface #94  <Method int IDataSet.getEntryCount()>
	//    8   16:iadd            
	//    9   17:putfield        #38  <Field int mYValCount>
		if(mDataSets.size() > 0) goto _L2; else goto _L1
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field List mDataSets>
	//   12   24:invokeinterface #77  <Method int List.size()>
	//   13   29:ifgt            131
_L1:
		mYMax = idataset.getYMax();
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:invokeinterface #133 <Method float IDataSet.getYMax()>
	//   17   39:putfield        #26  <Field float mYMax>
		mYMin = idataset.getYMin();
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:invokeinterface #136 <Method float IDataSet.getYMin()>
	//   21   49:putfield        #28  <Field float mYMin>
		if(idataset.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  22   52:aload_1         
	//*  23   53:invokeinterface #140 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//*  24   58:getstatic       #146 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  25   61:if_acmpne       108
		{
			mLeftAxisMax = idataset.getYMax();
	//   26   64:aload_0         
	//   27   65:aload_1         
	//   28   66:invokeinterface #133 <Method float IDataSet.getYMax()>
	//   29   71:putfield        #30  <Field float mLeftAxisMax>
			mLeftAxisMin = idataset.getYMin();
	//   30   74:aload_0         
	//   31   75:aload_1         
	//   32   76:invokeinterface #136 <Method float IDataSet.getYMin()>
	//   33   81:putfield        #32  <Field float mLeftAxisMin>
		} else
	//*  34   84:aload_0         
	//*  35   85:getfield        #47  <Field List mDataSets>
	//*  36   88:aload_1         
	//*  37   89:invokeinterface #123 <Method boolean List.add(Object)>
	//*  38   94:pop             
	//*  39   95:aload_0         
	//*  40   96:aload_0         
	//*  41   97:invokevirtual   #150 <Method IDataSet getFirstLeft()>
	//*  42  100:aload_0         
	//*  43  101:invokevirtual   #153 <Method IDataSet getFirstRight()>
	//*  44  104:invokespecial   #155 <Method void handleEmptyAxis(IDataSet, IDataSet)>
	//*  45  107:return          
		{
			mRightAxisMax = idataset.getYMax();
	//   46  108:aload_0         
	//   47  109:aload_1         
	//   48  110:invokeinterface #133 <Method float IDataSet.getYMax()>
	//   49  115:putfield        #34  <Field float mRightAxisMax>
			mRightAxisMin = idataset.getYMin();
	//   50  118:aload_0         
	//   51  119:aload_1         
	//   52  120:invokeinterface #136 <Method float IDataSet.getYMin()>
	//   53  125:putfield        #36  <Field float mRightAxisMin>
		}
_L4:
		mDataSets.add(((Object) (idataset)));
		handleEmptyAxis(getFirstLeft(), getFirstRight());
		return;
	//*  54  128:goto            84
_L2:
		if(mYMax < idataset.getYMax())
	//*  55  131:aload_0         
	//*  56  132:getfield        #26  <Field float mYMax>
	//*  57  135:aload_1         
	//*  58  136:invokeinterface #133 <Method float IDataSet.getYMax()>
	//*  59  141:fcmpg           
	//*  60  142:ifge            155
			mYMax = idataset.getYMax();
	//   61  145:aload_0         
	//   62  146:aload_1         
	//   63  147:invokeinterface #133 <Method float IDataSet.getYMax()>
	//   64  152:putfield        #26  <Field float mYMax>
		if(mYMin > idataset.getYMin())
	//*  65  155:aload_0         
	//*  66  156:getfield        #28  <Field float mYMin>
	//*  67  159:aload_1         
	//*  68  160:invokeinterface #136 <Method float IDataSet.getYMin()>
	//*  69  165:fcmpl           
	//*  70  166:ifle            179
			mYMin = idataset.getYMin();
	//   71  169:aload_0         
	//   72  170:aload_1         
	//   73  171:invokeinterface #136 <Method float IDataSet.getYMin()>
	//   74  176:putfield        #28  <Field float mYMin>
		if(idataset.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  75  179:aload_1         
	//*  76  180:invokeinterface #140 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//*  77  185:getstatic       #146 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  78  188:if_acmpne       242
		{
			if(mLeftAxisMax < idataset.getYMax())
	//*  79  191:aload_0         
	//*  80  192:getfield        #30  <Field float mLeftAxisMax>
	//*  81  195:aload_1         
	//*  82  196:invokeinterface #133 <Method float IDataSet.getYMax()>
	//*  83  201:fcmpg           
	//*  84  202:ifge            215
				mLeftAxisMax = idataset.getYMax();
	//   85  205:aload_0         
	//   86  206:aload_1         
	//   87  207:invokeinterface #133 <Method float IDataSet.getYMax()>
	//   88  212:putfield        #30  <Field float mLeftAxisMax>
			if(mLeftAxisMin > idataset.getYMin())
	//*  89  215:aload_0         
	//*  90  216:getfield        #32  <Field float mLeftAxisMin>
	//*  91  219:aload_1         
	//*  92  220:invokeinterface #136 <Method float IDataSet.getYMin()>
	//*  93  225:fcmpl           
	//*  94  226:ifle            84
				mLeftAxisMin = idataset.getYMin();
	//   95  229:aload_0         
	//   96  230:aload_1         
	//   97  231:invokeinterface #136 <Method float IDataSet.getYMin()>
	//   98  236:putfield        #32  <Field float mLeftAxisMin>
		} else
	//*  99  239:goto            84
		{
			if(mRightAxisMax < idataset.getYMax())
	//* 100  242:aload_0         
	//* 101  243:getfield        #34  <Field float mRightAxisMax>
	//* 102  246:aload_1         
	//* 103  247:invokeinterface #133 <Method float IDataSet.getYMax()>
	//* 104  252:fcmpg           
	//* 105  253:ifge            266
				mRightAxisMax = idataset.getYMax();
	//  106  256:aload_0         
	//  107  257:aload_1         
	//  108  258:invokeinterface #133 <Method float IDataSet.getYMax()>
	//  109  263:putfield        #34  <Field float mRightAxisMax>
			if(mRightAxisMin > idataset.getYMin())
	//* 110  266:aload_0         
	//* 111  267:getfield        #36  <Field float mRightAxisMin>
	//* 112  270:aload_1         
	//* 113  271:invokeinterface #136 <Method float IDataSet.getYMin()>
	//* 114  276:fcmpl           
	//* 115  277:ifle            84
				mRightAxisMin = idataset.getYMin();
	//  116  280:aload_0         
	//  117  281:aload_1         
	//  118  282:invokeinterface #136 <Method float IDataSet.getYMin()>
	//  119  287:putfield        #36  <Field float mRightAxisMin>
		}
		if(true) goto _L4; else goto _L3
	//  120  290:goto            84
_L3:
	}

	public void addEntry(Entry entry, int i)
	{
		if(mDataSets.size() <= i || i < 0) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #77  <Method int List.size()>
	//    3    9:iload_2         
	//    4   10:icmple          264
	//    5   13:iload_2         
	//    6   14:iflt            264
_L1:
		float f;
		IDataSet idataset;
		idataset = (IDataSet)mDataSets.get(i);
	//    7   17:aload_0         
	//    8   18:getfield        #47  <Field List mDataSets>
	//    9   21:iload_2         
	//   10   22:invokeinterface #81  <Method Object List.get(int)>
	//   11   27:checkcast       #91  <Class IDataSet>
	//   12   30:astore          4
		if(!idataset.addEntry(entry))
	//*  13   32:aload           4
	//*  14   34:aload_1         
	//*  15   35:invokeinterface #161 <Method boolean IDataSet.addEntry(Entry)>
	//*  16   40:ifne            44
			return;
	//   17   43:return          
		f = entry.getVal();
	//   18   44:aload_1         
	//   19   45:invokevirtual   #166 <Method float Entry.getVal()>
	//   20   48:fstore_3        
		if(mYValCount != 0) goto _L4; else goto _L3
	//   21   49:aload_0         
	//   22   50:getfield        #38  <Field int mYValCount>
	//   23   53:ifne            137
_L3:
		mYMin = f;
	//   24   56:aload_0         
	//   25   57:fload_3         
	//   26   58:putfield        #28  <Field float mYMin>
		mYMax = f;
	//   27   61:aload_0         
	//   28   62:fload_3         
	//   29   63:putfield        #26  <Field float mYMax>
		if(idataset.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  30   66:aload           4
	//*  31   68:invokeinterface #140 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//*  32   73:getstatic       #146 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  33   76:if_acmpne       118
		{
			mLeftAxisMax = entry.getVal();
	//   34   79:aload_0         
	//   35   80:aload_1         
	//   36   81:invokevirtual   #166 <Method float Entry.getVal()>
	//   37   84:putfield        #30  <Field float mLeftAxisMax>
			mLeftAxisMin = entry.getVal();
	//   38   87:aload_0         
	//   39   88:aload_1         
	//   40   89:invokevirtual   #166 <Method float Entry.getVal()>
	//   41   92:putfield        #32  <Field float mLeftAxisMin>
		} else
	//*  42   95:aload_0         
	//*  43   96:aload_0         
	//*  44   97:getfield        #38  <Field int mYValCount>
	//*  45  100:iconst_1        
	//*  46  101:iadd            
	//*  47  102:putfield        #38  <Field int mYValCount>
	//*  48  105:aload_0         
	//*  49  106:aload_0         
	//*  50  107:invokevirtual   #150 <Method IDataSet getFirstLeft()>
	//*  51  110:aload_0         
	//*  52  111:invokevirtual   #153 <Method IDataSet getFirstRight()>
	//*  53  114:invokespecial   #155 <Method void handleEmptyAxis(IDataSet, IDataSet)>
	//*  54  117:return          
		{
			mRightAxisMax = entry.getVal();
	//   55  118:aload_0         
	//   56  119:aload_1         
	//   57  120:invokevirtual   #166 <Method float Entry.getVal()>
	//   58  123:putfield        #34  <Field float mRightAxisMax>
			mRightAxisMin = entry.getVal();
	//   59  126:aload_0         
	//   60  127:aload_1         
	//   61  128:invokevirtual   #166 <Method float Entry.getVal()>
	//   62  131:putfield        #36  <Field float mRightAxisMin>
		}
_L5:
		mYValCount = mYValCount + 1;
		handleEmptyAxis(getFirstLeft(), getFirstRight());
		return;
	//*  63  134:goto            95
_L4:
		if(mYMax < f)
	//*  64  137:aload_0         
	//*  65  138:getfield        #26  <Field float mYMax>
	//*  66  141:fload_3         
	//*  67  142:fcmpg           
	//*  68  143:ifge            151
			mYMax = f;
	//   69  146:aload_0         
	//   70  147:fload_3         
	//   71  148:putfield        #26  <Field float mYMax>
		if(mYMin > f)
	//*  72  151:aload_0         
	//*  73  152:getfield        #28  <Field float mYMin>
	//*  74  155:fload_3         
	//*  75  156:fcmpl           
	//*  76  157:ifle            165
			mYMin = f;
	//   77  160:aload_0         
	//   78  161:fload_3         
	//   79  162:putfield        #28  <Field float mYMin>
		if(idataset.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  80  165:aload           4
	//*  81  167:invokeinterface #140 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//*  82  172:getstatic       #146 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  83  175:if_acmpne       221
		{
			if(mLeftAxisMax < entry.getVal())
	//*  84  178:aload_0         
	//*  85  179:getfield        #30  <Field float mLeftAxisMax>
	//*  86  182:aload_1         
	//*  87  183:invokevirtual   #166 <Method float Entry.getVal()>
	//*  88  186:fcmpg           
	//*  89  187:ifge            198
				mLeftAxisMax = entry.getVal();
	//   90  190:aload_0         
	//   91  191:aload_1         
	//   92  192:invokevirtual   #166 <Method float Entry.getVal()>
	//   93  195:putfield        #30  <Field float mLeftAxisMax>
			if(mLeftAxisMin > entry.getVal())
	//*  94  198:aload_0         
	//*  95  199:getfield        #32  <Field float mLeftAxisMin>
	//*  96  202:aload_1         
	//*  97  203:invokevirtual   #166 <Method float Entry.getVal()>
	//*  98  206:fcmpl           
	//*  99  207:ifle            95
				mLeftAxisMin = entry.getVal();
	//  100  210:aload_0         
	//  101  211:aload_1         
	//  102  212:invokevirtual   #166 <Method float Entry.getVal()>
	//  103  215:putfield        #32  <Field float mLeftAxisMin>
		} else
	//* 104  218:goto            95
		{
			if(mRightAxisMax < entry.getVal())
	//* 105  221:aload_0         
	//* 106  222:getfield        #34  <Field float mRightAxisMax>
	//* 107  225:aload_1         
	//* 108  226:invokevirtual   #166 <Method float Entry.getVal()>
	//* 109  229:fcmpg           
	//* 110  230:ifge            241
				mRightAxisMax = entry.getVal();
	//  111  233:aload_0         
	//  112  234:aload_1         
	//  113  235:invokevirtual   #166 <Method float Entry.getVal()>
	//  114  238:putfield        #34  <Field float mRightAxisMax>
			if(mRightAxisMin > entry.getVal())
	//* 115  241:aload_0         
	//* 116  242:getfield        #36  <Field float mRightAxisMin>
	//* 117  245:aload_1         
	//* 118  246:invokevirtual   #166 <Method float Entry.getVal()>
	//* 119  249:fcmpl           
	//* 120  250:ifle            95
				mRightAxisMin = entry.getVal();
	//  121  253:aload_0         
	//  122  254:aload_1         
	//  123  255:invokevirtual   #166 <Method float Entry.getVal()>
	//  124  258:putfield        #36  <Field float mRightAxisMin>
		}
		if(true) goto _L5; else goto _L2
	//  125  261:goto            95
_L2:
		Log.e("addEntry", "Cannot add Entry because dataSetIndex too high or too low.");
	//  126  264:ldc1            #167 <String "addEntry">
	//  127  266:ldc1            #169 <String "Cannot add Entry because dataSetIndex too high or too low.">
	//  128  268:invokestatic    #175 <Method int Log.e(String, String)>
	//  129  271:pop             
		return;
	//  130  272:return          
	}

	public void addXValue(String s)
	{
		if(s != null && (float)s.length() > mXValMaximumLength)
	//*   0    0:aload_1         
	//*   1    1:ifnull          26
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #86  <Method int String.length()>
	//*   4    8:i2f             
	//*   5    9:aload_0         
	//*   6   10:getfield        #40  <Field float mXValMaximumLength>
	//*   7   13:fcmpl           
	//*   8   14:ifle            26
			mXValMaximumLength = s.length();
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #86  <Method int String.length()>
	//   12   22:i2f             
	//   13   23:putfield        #40  <Field float mXValMaximumLength>
		mXVals.add(((Object) (s)));
	//   14   26:aload_0         
	//   15   27:getfield        #45  <Field List mXVals>
	//   16   30:aload_1         
	//   17   31:invokeinterface #123 <Method boolean List.add(Object)>
	//   18   36:pop             
	//   19   37:return          
	}

	public void calcMinMax(int i, int j)
	{
		if(mDataSets == null || mDataSets.size() < 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List mDataSets>
	//*   2    4:ifnull          20
	//*   3    7:aload_0         
	//*   4    8:getfield        #47  <Field List mDataSets>
	//*   5   11:invokeinterface #77  <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:icmpge          31
		{
			mYMax = 0.0F;
	//    8   20:aload_0         
	//    9   21:fconst_0        
	//   10   22:putfield        #26  <Field float mYMax>
			mYMin = 0.0F;
	//   11   25:aload_0         
	//   12   26:fconst_0        
	//   13   27:putfield        #28  <Field float mYMin>
			return;
	//   14   30:return          
		}
		mYMin = 3.402823E+38F;
	//   15   31:aload_0         
	//   16   32:ldc1            #179 <Float 3.402823E+38F>
	//   17   34:putfield        #28  <Field float mYMin>
		mYMax = -3.402823E+38F;
	//   18   37:aload_0         
	//   19   38:ldc1            #180 <Float -3.402823E+38F>
	//   20   40:putfield        #26  <Field float mYMax>
		for(int k = 0; k < mDataSets.size(); k++)
	//*  21   43:iconst_0        
	//*  22   44:istore_3        
	//*  23   45:iload_3         
	//*  24   46:aload_0         
	//*  25   47:getfield        #47  <Field List mDataSets>
	//*  26   50:invokeinterface #77  <Method int List.size()>
	//*  27   55:icmpge          141
		{
			IDataSet idataset = (IDataSet)mDataSets.get(k);
	//   28   58:aload_0         
	//   29   59:getfield        #47  <Field List mDataSets>
	//   30   62:iload_3         
	//   31   63:invokeinterface #81  <Method Object List.get(int)>
	//   32   68:checkcast       #91  <Class IDataSet>
	//   33   71:astore          4
			idataset.calcMinMax(i, j);
	//   34   73:aload           4
	//   35   75:iload_1         
	//   36   76:iload_2         
	//   37   77:invokeinterface #182 <Method void IDataSet.calcMinMax(int, int)>
			if(idataset.getYMin() < mYMin)
	//*  38   82:aload           4
	//*  39   84:invokeinterface #136 <Method float IDataSet.getYMin()>
	//*  40   89:aload_0         
	//*  41   90:getfield        #28  <Field float mYMin>
	//*  42   93:fcmpg           
	//*  43   94:ifge            108
				mYMin = idataset.getYMin();
	//   44   97:aload_0         
	//   45   98:aload           4
	//   46  100:invokeinterface #136 <Method float IDataSet.getYMin()>
	//   47  105:putfield        #28  <Field float mYMin>
			if(idataset.getYMax() > mYMax)
	//*  48  108:aload           4
	//*  49  110:invokeinterface #133 <Method float IDataSet.getYMax()>
	//*  50  115:aload_0         
	//*  51  116:getfield        #26  <Field float mYMax>
	//*  52  119:fcmpl           
	//*  53  120:ifle            134
				mYMax = idataset.getYMax();
	//   54  123:aload_0         
	//   55  124:aload           4
	//   56  126:invokeinterface #133 <Method float IDataSet.getYMax()>
	//   57  131:putfield        #26  <Field float mYMax>
		}

	//   58  134:iload_3         
	//   59  135:iconst_1        
	//   60  136:iadd            
	//   61  137:istore_3        
	//*  62  138:goto            45
		if(mYMin == 3.402823E+38F)
	//*  63  141:aload_0         
	//*  64  142:getfield        #28  <Field float mYMin>
	//*  65  145:ldc1            #179 <Float 3.402823E+38F>
	//*  66  147:fcmpl           
	//*  67  148:ifne            161
		{
			mYMin = 0.0F;
	//   68  151:aload_0         
	//   69  152:fconst_0        
	//   70  153:putfield        #28  <Field float mYMin>
			mYMax = 0.0F;
	//   71  156:aload_0         
	//   72  157:fconst_0        
	//   73  158:putfield        #26  <Field float mYMax>
		}
		IDataSet idataset1 = getFirstLeft();
	//   74  161:aload_0         
	//   75  162:invokevirtual   #150 <Method IDataSet getFirstLeft()>
	//   76  165:astore          4
		if(idataset1 != null)
	//*  77  167:aload           4
	//*  78  169:ifnull          295
		{
			mLeftAxisMax = idataset1.getYMax();
	//   79  172:aload_0         
	//   80  173:aload           4
	//   81  175:invokeinterface #133 <Method float IDataSet.getYMax()>
	//   82  180:putfield        #30  <Field float mLeftAxisMax>
			mLeftAxisMin = idataset1.getYMin();
	//   83  183:aload_0         
	//   84  184:aload           4
	//   85  186:invokeinterface #136 <Method float IDataSet.getYMin()>
	//   86  191:putfield        #32  <Field float mLeftAxisMin>
			Iterator iterator = mDataSets.iterator();
	//   87  194:aload_0         
	//   88  195:getfield        #47  <Field List mDataSets>
	//   89  198:invokeinterface #186 <Method Iterator List.iterator()>
	//   90  203:astore          5
			do
			{
				if(!iterator.hasNext())
					break;
	//   91  205:aload           5
	//   92  207:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//   93  212:ifeq            295
				IDataSet idataset3 = (IDataSet)iterator.next();
	//   94  215:aload           5
	//   95  217:invokeinterface #196 <Method Object Iterator.next()>
	//   96  222:checkcast       #91  <Class IDataSet>
	//   97  225:astore          6
				if(idataset3.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  98  227:aload           6
	//*  99  229:invokeinterface #140 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//* 100  234:getstatic       #146 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//* 101  237:if_acmpne       205
				{
					if(idataset3.getYMin() < mLeftAxisMin)
	//* 102  240:aload           6
	//* 103  242:invokeinterface #136 <Method float IDataSet.getYMin()>
	//* 104  247:aload_0         
	//* 105  248:getfield        #32  <Field float mLeftAxisMin>
	//* 106  251:fcmpg           
	//* 107  252:ifge            266
						mLeftAxisMin = idataset3.getYMin();
	//  108  255:aload_0         
	//  109  256:aload           6
	//  110  258:invokeinterface #136 <Method float IDataSet.getYMin()>
	//  111  263:putfield        #32  <Field float mLeftAxisMin>
					if(idataset3.getYMax() > mLeftAxisMax)
	//* 112  266:aload           6
	//* 113  268:invokeinterface #133 <Method float IDataSet.getYMax()>
	//* 114  273:aload_0         
	//* 115  274:getfield        #30  <Field float mLeftAxisMax>
	//* 116  277:fcmpl           
	//* 117  278:ifle            205
						mLeftAxisMax = idataset3.getYMax();
	//  118  281:aload_0         
	//  119  282:aload           6
	//  120  284:invokeinterface #133 <Method float IDataSet.getYMax()>
	//  121  289:putfield        #30  <Field float mLeftAxisMax>
				}
			} while(true);
	//  122  292:goto            205
		}
		IDataSet idataset2 = getFirstRight();
	//  123  295:aload_0         
	//  124  296:invokevirtual   #153 <Method IDataSet getFirstRight()>
	//  125  299:astore          5
		if(idataset2 != null)
	//* 126  301:aload           5
	//* 127  303:ifnull          429
		{
			mRightAxisMax = idataset2.getYMax();
	//  128  306:aload_0         
	//  129  307:aload           5
	//  130  309:invokeinterface #133 <Method float IDataSet.getYMax()>
	//  131  314:putfield        #34  <Field float mRightAxisMax>
			mRightAxisMin = idataset2.getYMin();
	//  132  317:aload_0         
	//  133  318:aload           5
	//  134  320:invokeinterface #136 <Method float IDataSet.getYMin()>
	//  135  325:putfield        #36  <Field float mRightAxisMin>
			Iterator iterator1 = mDataSets.iterator();
	//  136  328:aload_0         
	//  137  329:getfield        #47  <Field List mDataSets>
	//  138  332:invokeinterface #186 <Method Iterator List.iterator()>
	//  139  337:astore          6
			do
			{
				if(!iterator1.hasNext())
					break;
	//  140  339:aload           6
	//  141  341:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//  142  346:ifeq            429
				IDataSet idataset4 = (IDataSet)iterator1.next();
	//  143  349:aload           6
	//  144  351:invokeinterface #196 <Method Object Iterator.next()>
	//  145  356:checkcast       #91  <Class IDataSet>
	//  146  359:astore          7
				if(idataset4.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT)
	//* 147  361:aload           7
	//* 148  363:invokeinterface #140 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//* 149  368:getstatic       #199 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.RIGHT>
	//* 150  371:if_acmpne       339
				{
					if(idataset4.getYMin() < mRightAxisMin)
	//* 151  374:aload           7
	//* 152  376:invokeinterface #136 <Method float IDataSet.getYMin()>
	//* 153  381:aload_0         
	//* 154  382:getfield        #36  <Field float mRightAxisMin>
	//* 155  385:fcmpg           
	//* 156  386:ifge            400
						mRightAxisMin = idataset4.getYMin();
	//  157  389:aload_0         
	//  158  390:aload           7
	//  159  392:invokeinterface #136 <Method float IDataSet.getYMin()>
	//  160  397:putfield        #36  <Field float mRightAxisMin>
					if(idataset4.getYMax() > mRightAxisMax)
	//* 161  400:aload           7
	//* 162  402:invokeinterface #133 <Method float IDataSet.getYMax()>
	//* 163  407:aload_0         
	//* 164  408:getfield        #34  <Field float mRightAxisMax>
	//* 165  411:fcmpl           
	//* 166  412:ifle            339
						mRightAxisMax = idataset4.getYMax();
	//  167  415:aload_0         
	//  168  416:aload           7
	//  169  418:invokeinterface #133 <Method float IDataSet.getYMax()>
	//  170  423:putfield        #34  <Field float mRightAxisMax>
				}
			} while(true);
	//  171  426:goto            339
		}
		handleEmptyAxis(idataset1, idataset2);
	//  172  429:aload_0         
	//  173  430:aload           4
	//  174  432:aload           5
	//  175  434:invokespecial   #155 <Method void handleEmptyAxis(IDataSet, IDataSet)>
	//  176  437:return          
	}

	protected void calcYValueCount()
	{
		mYValCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #38  <Field int mYValCount>
		if(mDataSets == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #47  <Field List mDataSets>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		int j = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		for(int i = 0; i < mDataSets.size(); i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_1        
	//*  11   17:iload_1         
	//*  12   18:aload_0         
	//*  13   19:getfield        #47  <Field List mDataSets>
	//*  14   22:invokeinterface #77  <Method int List.size()>
	//*  15   27:icmpge          58
			j += ((IDataSet)mDataSets.get(i)).getEntryCount();
	//   16   30:iload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #47  <Field List mDataSets>
	//   19   35:iload_1         
	//   20   36:invokeinterface #81  <Method Object List.get(int)>
	//   21   41:checkcast       #91  <Class IDataSet>
	//   22   44:invokeinterface #94  <Method int IDataSet.getEntryCount()>
	//   23   49:iadd            
	//   24   50:istore_2        

	//   25   51:iload_1         
	//   26   52:iconst_1        
	//   27   53:iadd            
	//   28   54:istore_1        
	//*  29   55:goto            17
		mYValCount = j;
	//   30   58:aload_0         
	//   31   59:iload_2         
	//   32   60:putfield        #38  <Field int mYValCount>
	//   33   63:return          
	}

	public void clearValues()
	{
		mDataSets.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #204 <Method void List.clear()>
		notifyDataChanged();
	//    3    9:aload_0         
	//    4   10:invokevirtual   #207 <Method void notifyDataChanged()>
	//    5   13:return          
	}

	public boolean contains(IDataSet idataset)
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List mDataSets>
	//*   2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            37
			if(((Object) ((IDataSet)iterator.next())).equals(((Object) (idataset))))
	//*   7   19:aload_2         
	//*   8   20:invokeinterface #196 <Method Object Iterator.next()>
	//*   9   25:checkcast       #91  <Class IDataSet>
	//*  10   28:aload_1         
	//*  11   29:invokevirtual   #212 <Method boolean Object.equals(Object)>
	//*  12   32:ifeq            10
				return true;
	//   13   35:iconst_1        
	//   14   36:ireturn         

		return false;
	//   15   37:iconst_0        
	//   16   38:ireturn         
	}

	public int[] getColors()
	{
		if(mDataSets != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:ifnonnull       11
_L1:
		int ai[] = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
_L4:
		return ai;
	//    5    9:aload_3         
	//    6   10:areturn         
_L2:
		int k = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		for(int i = 0; i < mDataSets.size(); i++)
	//*   9   13:iconst_0        
	//*  10   14:istore_1        
	//*  11   15:iload_1         
	//*  12   16:aload_0         
	//*  13   17:getfield        #47  <Field List mDataSets>
	//*  14   20:invokeinterface #77  <Method int List.size()>
	//*  15   25:icmpge          61
			k += ((IDataSet)mDataSets.get(i)).getColors().size();
	//   16   28:iload_2         
	//   17   29:aload_0         
	//   18   30:getfield        #47  <Field List mDataSets>
	//   19   33:iload_1         
	//   20   34:invokeinterface #81  <Method Object List.get(int)>
	//   21   39:checkcast       #91  <Class IDataSet>
	//   22   42:invokeinterface #218 <Method List IDataSet.getColors()>
	//   23   47:invokeinterface #77  <Method int List.size()>
	//   24   52:iadd            
	//   25   53:istore_2        

	//   26   54:iload_1         
	//   27   55:iconst_1        
	//   28   56:iadd            
	//   29   57:istore_1        
	//*  30   58:goto            15
		int ai1[] = new int[k];
	//   31   61:iload_2         
	//   32   62:newarray        int[]
	//   33   64:astore          4
		k = 0;
	//   34   66:iconst_0        
	//   35   67:istore_2        
		int j = 0;
	//   36   68:iconst_0        
	//   37   69:istore_1        
		do
		{
			ai = ai1;
	//   38   70:aload           4
	//   39   72:astore_3        
			if(j >= mDataSets.size())
				continue;
	//   40   73:iload_1         
	//   41   74:aload_0         
	//   42   75:getfield        #47  <Field List mDataSets>
	//   43   78:invokeinterface #77  <Method int List.size()>
	//   44   83:icmpge          9
			for(Iterator iterator = ((IDataSet)mDataSets.get(j)).getColors().iterator(); iterator.hasNext();)
	//*  45   86:aload_0         
	//*  46   87:getfield        #47  <Field List mDataSets>
	//*  47   90:iload_1         
	//*  48   91:invokeinterface #81  <Method Object List.get(int)>
	//*  49   96:checkcast       #91  <Class IDataSet>
	//*  50   99:invokeinterface #218 <Method List IDataSet.getColors()>
	//*  51  104:invokeinterface #186 <Method Iterator List.iterator()>
	//*  52  109:astore_3        
	//*  53  110:aload_3         
	//*  54  111:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*  55  116:ifeq            142
			{
				ai1[k] = ((Integer)iterator.next()).intValue();
	//   56  119:aload           4
	//   57  121:iload_2         
	//   58  122:aload_3         
	//   59  123:invokeinterface #196 <Method Object Iterator.next()>
	//   60  128:checkcast       #220 <Class Integer>
	//   61  131:invokevirtual   #223 <Method int Integer.intValue()>
	//   62  134:iastore         
				k++;
	//   63  135:iload_2         
	//   64  136:iconst_1        
	//   65  137:iadd            
	//   66  138:istore_2        
			}

	//*  67  139:goto            110
			j++;
	//   68  142:iload_1         
	//   69  143:iconst_1        
	//   70  144:iadd            
	//   71  145:istore_1        
		} while(true);
	//   72  146:goto            70
		if(true) goto _L4; else goto _L3
_L3:
	}

	public IDataSet getDataSetByIndex(int i)
	{
		if(mDataSets == null || i < 0 || i >= mDataSets.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List mDataSets>
	//*   2    4:ifnull          24
	//*   3    7:iload_1         
	//*   4    8:iflt            24
	//*   5   11:iload_1         
	//*   6   12:aload_0         
	//*   7   13:getfield        #47  <Field List mDataSets>
	//*   8   16:invokeinterface #77  <Method int List.size()>
	//*   9   21:icmplt          26
			return null;
	//   10   24:aconst_null     
	//   11   25:areturn         
		else
			return (IDataSet)mDataSets.get(i);
	//   12   26:aload_0         
	//   13   27:getfield        #47  <Field List mDataSets>
	//   14   30:iload_1         
	//   15   31:invokeinterface #81  <Method Object List.get(int)>
	//   16   36:checkcast       #91  <Class IDataSet>
	//   17   39:areturn         
	}

	public IDataSet getDataSetByLabel(String s, boolean flag)
	{
		int i = getDataSetIndexByLabel(mDataSets, s, flag);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #47  <Field List mDataSets>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:invokevirtual   #232 <Method int getDataSetIndexByLabel(List, String, boolean)>
	//    6   10:istore_3        
		if(i < 0 || i >= mDataSets.size())
	//*   7   11:iload_3         
	//*   8   12:iflt            28
	//*   9   15:iload_3         
	//*  10   16:aload_0         
	//*  11   17:getfield        #47  <Field List mDataSets>
	//*  12   20:invokeinterface #77  <Method int List.size()>
	//*  13   25:icmplt          30
			return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
		else
			return (IDataSet)mDataSets.get(i);
	//   16   30:aload_0         
	//   17   31:getfield        #47  <Field List mDataSets>
	//   18   34:iload_3         
	//   19   35:invokeinterface #81  <Method Object List.get(int)>
	//   20   40:checkcast       #91  <Class IDataSet>
	//   21   43:areturn         
	}

	public int getDataSetCount()
	{
		if(mDataSets == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List mDataSets>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mDataSets.size();
	//    5    9:aload_0         
	//    6   10:getfield        #47  <Field List mDataSets>
	//    7   13:invokeinterface #77  <Method int List.size()>
	//    8   18:ireturn         
	}

	public IDataSet getDataSetForEntry(Entry entry)
	{
		IDataSet idataset;
		if(entry != null)
			break MISSING_BLOCK_LABEL_10;
	//    0    0:aload_1         
	//    1    1:ifnonnull       10
		idataset = null;
	//    2    4:aconst_null     
	//    3    5:astore          4
		return idataset;
	//    4    7:aload           4
	//    5    9:areturn         
		int j;
		IDataSet idataset1;
		int i = 0;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		  goto _L1
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #47  <Field List mDataSets>
	//*  11   17:invokeinterface #77  <Method int List.size()>
	//*  12   22:icmpge          89
	//*  13   25:aload_0         
	//*  14   26:getfield        #47  <Field List mDataSets>
	//*  15   29:iload_2         
	//*  16   30:invokeinterface #81  <Method Object List.get(int)>
	//*  17   35:checkcast       #91  <Class IDataSet>
	//*  18   38:astore          5
	//*  19   40:iconst_0        
	//*  20   41:istore_3        
	//*  21   42:iload_3         
	//*  22   43:aload           5
	//*  23   45:invokeinterface #94  <Method int IDataSet.getEntryCount()>
	//*  24   50:icmpge          82
	//*  25   53:aload           5
	//*  26   55:astore          4
	//*  27   57:aload_1         
	//*  28   58:aload           5
	//*  29   60:aload_1         
	//*  30   61:invokevirtual   #239 <Method int Entry.getXIndex()>
	//*  31   64:invokeinterface #243 <Method Entry IDataSet.getEntryForXIndex(int)>
	//*  32   69:invokevirtual   #246 <Method boolean Entry.equalTo(Entry)>
	//*  33   72:ifne            7
	//*  34   75:iload_3         
	//*  35   76:iconst_1        
	//*  36   77:iadd            
	//*  37   78:istore_3        
		continue; /* Loop/switch isn't completed */
	//   38   79:goto            42
		i++;
	//   39   82:iload_2         
	//   40   83:iconst_1        
	//   41   84:iadd            
	//   42   85:istore_2        
	//*  43   86:goto            12
	//*  44   89:aconst_null     
	//*  45   90:areturn         
	}

	protected int getDataSetIndexByLabel(List list, String s, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            53
		{
			for(int i = 0; i < list.size(); i++)
	//*   2    4:iconst_0        
	//*   3    5:istore          4
	//*   4    7:iload           4
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #77  <Method int List.size()>
	//*   7   15:icmpge          102
				if(s.equalsIgnoreCase(((IDataSet)list.get(i)).getLabel()))
	//*   8   18:aload_2         
	//*   9   19:aload_1         
	//*  10   20:iload           4
	//*  11   22:invokeinterface #81  <Method Object List.get(int)>
	//*  12   27:checkcast       #91  <Class IDataSet>
	//*  13   30:invokeinterface #250 <Method String IDataSet.getLabel()>
	//*  14   35:invokevirtual   #254 <Method boolean String.equalsIgnoreCase(String)>
	//*  15   38:ifeq            44
					return i;
	//   16   41:iload           4
	//   17   43:ireturn         

	//   18   44:iload           4
	//   19   46:iconst_1        
	//   20   47:iadd            
	//   21   48:istore          4
		} else
	//*  22   50:goto            7
		{
			for(int j = 0; j < list.size(); j++)
	//*  23   53:iconst_0        
	//*  24   54:istore          4
	//*  25   56:iload           4
	//*  26   58:aload_1         
	//*  27   59:invokeinterface #77  <Method int List.size()>
	//*  28   64:icmpge          102
				if(s.equals(((Object) (((IDataSet)list.get(j)).getLabel()))))
	//*  29   67:aload_2         
	//*  30   68:aload_1         
	//*  31   69:iload           4
	//*  32   71:invokeinterface #81  <Method Object List.get(int)>
	//*  33   76:checkcast       #91  <Class IDataSet>
	//*  34   79:invokeinterface #250 <Method String IDataSet.getLabel()>
	//*  35   84:invokevirtual   #255 <Method boolean String.equals(Object)>
	//*  36   87:ifeq            93
					return j;
	//   37   90:iload           4
	//   38   92:ireturn         

	//   39   93:iload           4
	//   40   95:iconst_1        
	//   41   96:iadd            
	//   42   97:istore          4
		}
	//*  43   99:goto            56
		return -1;
	//   44  102:iconst_m1       
	//   45  103:ireturn         
	}

	protected String[] getDataSetLabels()
	{
		String as[] = new String[mDataSets.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #77  <Method int List.size()>
	//    3    9:anewarray       String[]
	//    4   12:astore_2        
		for(int i = 0; i < mDataSets.size(); i++)
	//*   5   13:iconst_0        
	//*   6   14:istore_1        
	//*   7   15:iload_1         
	//*   8   16:aload_0         
	//*   9   17:getfield        #47  <Field List mDataSets>
	//*  10   20:invokeinterface #77  <Method int List.size()>
	//*  11   25:icmpge          56
			as[i] = ((IDataSet)mDataSets.get(i)).getLabel();
	//   12   28:aload_2         
	//   13   29:iload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #47  <Field List mDataSets>
	//   16   34:iload_1         
	//   17   35:invokeinterface #81  <Method Object List.get(int)>
	//   18   40:checkcast       #91  <Class IDataSet>
	//   19   43:invokeinterface #250 <Method String IDataSet.getLabel()>
	//   20   48:aastore         

	//   21   49:iload_1         
	//   22   50:iconst_1        
	//   23   51:iadd            
	//   24   52:istore_1        
	//*  25   53:goto            15
		return as;
	//   26   56:aload_2         
	//   27   57:areturn         
	}

	public List getDataSets()
	{
		return mDataSets;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:areturn         
	}

	public Entry getEntryForHighlight(Highlight highlight)
	{
		if(highlight.getDataSetIndex() >= mDataSets.size())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #267 <Method int Highlight.getDataSetIndex()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #47  <Field List mDataSets>
	//*   4    8:invokeinterface #77  <Method int List.size()>
	//*   5   13:icmplt          18
			return null;
	//    6   16:aconst_null     
	//    7   17:areturn         
		else
			return ((IDataSet)mDataSets.get(highlight.getDataSetIndex())).getEntryForXIndex(highlight.getXIndex());
	//    8   18:aload_0         
	//    9   19:getfield        #47  <Field List mDataSets>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #267 <Method int Highlight.getDataSetIndex()>
	//   12   26:invokeinterface #81  <Method Object List.get(int)>
	//   13   31:checkcast       #91  <Class IDataSet>
	//   14   34:aload_1         
	//   15   35:invokevirtual   #268 <Method int Highlight.getXIndex()>
	//   16   38:invokeinterface #243 <Method Entry IDataSet.getEntryForXIndex(int)>
	//   17   43:areturn         
	}

	public IDataSet getFirstLeft()
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List mDataSets>
	//*   2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            43
		{
			IDataSet idataset = (IDataSet)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #196 <Method Object Iterator.next()>
	//    9   25:checkcast       #91  <Class IDataSet>
	//   10   28:astore_2        
			if(idataset.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  11   29:aload_2         
	//*  12   30:invokeinterface #140 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//*  13   35:getstatic       #146 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  14   38:if_acmpne       10
				return idataset;
	//   15   41:aload_2         
	//   16   42:areturn         
		}

		return null;
	//   17   43:aconst_null     
	//   18   44:areturn         
	}

	public IDataSet getFirstRight()
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List mDataSets>
	//*   2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            43
		{
			IDataSet idataset = (IDataSet)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #196 <Method Object Iterator.next()>
	//    9   25:checkcast       #91  <Class IDataSet>
	//   10   28:astore_2        
			if(idataset.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.RIGHT)
	//*  11   29:aload_2         
	//*  12   30:invokeinterface #140 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//*  13   35:getstatic       #199 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.RIGHT>
	//*  14   38:if_acmpne       10
				return idataset;
	//   15   41:aload_2         
	//   16   42:areturn         
		}

		return null;
	//   17   43:aconst_null     
	//   18   44:areturn         
	}

	public int getIndexOfDataSet(IDataSet idataset)
	{
		for(int i = 0; i < mDataSets.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_2        
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #47  <Field List mDataSets>
	//*   5    7:invokeinterface #77  <Method int List.size()>
	//*   6   12:icmpge          38
			if(mDataSets.get(i) == idataset)
	//*   7   15:aload_0         
	//*   8   16:getfield        #47  <Field List mDataSets>
	//*   9   19:iload_2         
	//*  10   20:invokeinterface #81  <Method Object List.get(int)>
	//*  11   25:aload_1         
	//*  12   26:if_acmpne       31
				return i;
	//   13   29:iload_2         
	//   14   30:ireturn         

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:istore_2        
	//*  19   35:goto            2
		return -1;
	//   20   38:iconst_m1       
	//   21   39:ireturn         
	}

	public int getXValCount()
	{
		return mXVals.size();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List mXVals>
	//    2    4:invokeinterface #77  <Method int List.size()>
	//    3    9:ireturn         
	}

	public float getXValMaximumLength()
	{
		return mXValMaximumLength;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field float mXValMaximumLength>
	//    2    4:freturn         
	}

	public List getXVals()
	{
		return mXVals;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List mXVals>
	//    2    4:areturn         
	}

	public float getYMax()
	{
		return mYMax;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field float mYMax>
	//    2    4:freturn         
	}

	public float getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		if(axisdependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #146 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*   2    4:if_acmpne       12
			return mLeftAxisMax;
	//    3    7:aload_0         
	//    4    8:getfield        #30  <Field float mLeftAxisMax>
	//    5   11:freturn         
		else
			return mRightAxisMax;
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field float mRightAxisMax>
	//    8   16:freturn         
	}

	public float getYMin()
	{
		return mYMin;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field float mYMin>
	//    2    4:freturn         
	}

	public float getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		if(axisdependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #146 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*   2    4:if_acmpne       12
			return mLeftAxisMin;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field float mLeftAxisMin>
	//    5   11:freturn         
		else
			return mRightAxisMin;
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field float mRightAxisMin>
	//    8   16:freturn         
	}

	public int getYValCount()
	{
		return mYValCount;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int mYValCount>
	//    2    4:ireturn         
	}

	protected void init()
	{
		checkLegal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #280 <Method void checkLegal()>
		calcYValueCount();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #282 <Method void calcYValueCount()>
		calcMinMax(0, mYValCount);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:getfield        #38  <Field int mYValCount>
	//    8   14:invokevirtual   #283 <Method void calcMinMax(int, int)>
		calcXValMaximumLength();
	//    9   17:aload_0         
	//   10   18:invokespecial   #285 <Method void calcXValMaximumLength()>
	//   11   21:return          
	}

	public boolean isHighlightEnabled()
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #47  <Field List mDataSets>
	//*   2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            38
			if(!((IDataSet)iterator.next()).isHighlightEnabled())
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #196 <Method Object Iterator.next()>
	//*   9   25:checkcast       #91  <Class IDataSet>
	//*  10   28:invokeinterface #288 <Method boolean IDataSet.isHighlightEnabled()>
	//*  11   33:ifne            10
				return false;
	//   12   36:iconst_0        
	//   13   37:ireturn         

		return true;
	//   14   38:iconst_1        
	//   15   39:ireturn         
	}

	public void notifyDataChanged()
	{
		init();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method void init()>
	//    2    4:return          
	}

	public boolean removeDataSet(int i)
	{
		if(i >= mDataSets.size() || i < 0)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #47  <Field List mDataSets>
	//*   3    5:invokeinterface #77  <Method int List.size()>
	//*   4   10:icmpge          17
	//*   5   13:iload_1         
	//*   6   14:ifge            19
			return false;
	//    7   17:iconst_0        
	//    8   18:ireturn         
		else
			return removeDataSet((IDataSet)mDataSets.get(i));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field List mDataSets>
	//   12   24:iload_1         
	//   13   25:invokeinterface #81  <Method Object List.get(int)>
	//   14   30:checkcast       #91  <Class IDataSet>
	//   15   33:invokevirtual   #292 <Method boolean removeDataSet(IDataSet)>
	//   16   36:ireturn         
	}

	public boolean removeDataSet(IDataSet idataset)
	{
		boolean flag;
		if(idataset == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
		{
			flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		} else
	//*   4    6:iload_2         
	//*   5    7:ireturn         
		{
			boolean flag1 = mDataSets.remove(((Object) (idataset)));
	//    6    8:aload_0         
	//    7    9:getfield        #47  <Field List mDataSets>
	//    8   12:aload_1         
	//    9   13:invokeinterface #295 <Method boolean List.remove(Object)>
	//   10   18:istore_3        
			flag = flag1;
	//   11   19:iload_3         
	//   12   20:istore_2        
			if(flag1)
	//*  13   21:iload_3         
	//*  14   22:ifeq            6
			{
				mYValCount = mYValCount - idataset.getEntryCount();
	//   15   25:aload_0         
	//   16   26:aload_0         
	//   17   27:getfield        #38  <Field int mYValCount>
	//   18   30:aload_1         
	//   19   31:invokeinterface #94  <Method int IDataSet.getEntryCount()>
	//   20   36:isub            
	//   21   37:putfield        #38  <Field int mYValCount>
				calcMinMax(0, mYValCount);
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:aload_0         
	//   25   43:getfield        #38  <Field int mYValCount>
	//   26   46:invokevirtual   #283 <Method void calcMinMax(int, int)>
				return flag1;
	//   27   49:iload_3         
	//   28   50:ireturn         
			}
		}
		return flag;
	}

	public boolean removeEntry(int i, int j)
	{
		Entry entry;
		if(j < mDataSets.size())
	//*   0    0:iload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #47  <Field List mDataSets>
	//*   3    5:invokeinterface #77  <Method int List.size()>
	//*   4   10:icmplt          15
	//*   5   13:iconst_0        
	//*   6   14:ireturn         
	//*   7   15:aload_0         
	//*   8   16:getfield        #47  <Field List mDataSets>
	//*   9   19:iload_2         
	//*  10   20:invokeinterface #81  <Method Object List.get(int)>
	//*  11   25:checkcast       #91  <Class IDataSet>
	//*  12   28:iload_1         
	//*  13   29:invokeinterface #243 <Method Entry IDataSet.getEntryForXIndex(int)>
	//*  14   34:astore_3        
			if((entry = ((IDataSet)mDataSets.get(j)).getEntryForXIndex(i)) != null && entry.getXIndex() == i)
	//*  15   35:aload_3         
	//*  16   36:ifnull          13
	//*  17   39:aload_3         
	//*  18   40:invokevirtual   #239 <Method int Entry.getXIndex()>
	//*  19   43:iload_1         
	//*  20   44:icmpne          13
				return removeEntry(entry, j);
	//   21   47:aload_0         
	//   22   48:aload_3         
	//   23   49:iload_2         
	//   24   50:invokevirtual   #300 <Method boolean removeEntry(Entry, int)>
	//   25   53:ireturn         
		return false;
	}

	public boolean removeEntry(Entry entry, int i)
	{
		boolean flag;
		if(entry == null || i >= mDataSets.size())
	//*   0    0:aload_1         
	//*   1    1:ifnull          17
	//*   2    4:iload_2         
	//*   3    5:aload_0         
	//*   4    6:getfield        #47  <Field List mDataSets>
	//*   5    9:invokeinterface #77  <Method int List.size()>
	//*   6   14:icmplt          21
		{
			flag = false;
	//    7   17:iconst_0        
	//    8   18:istore_3        
		} else
	//*   9   19:iload_3         
	//*  10   20:ireturn         
		{
			IDataSet idataset = (IDataSet)mDataSets.get(i);
	//   11   21:aload_0         
	//   12   22:getfield        #47  <Field List mDataSets>
	//   13   25:iload_2         
	//   14   26:invokeinterface #81  <Method Object List.get(int)>
	//   15   31:checkcast       #91  <Class IDataSet>
	//   16   34:astore          5
			if(idataset != null)
	//*  17   36:aload           5
	//*  18   38:ifnull          81
			{
				boolean flag1 = idataset.removeEntry(entry);
	//   19   41:aload           5
	//   20   43:aload_1         
	//   21   44:invokeinterface #302 <Method boolean IDataSet.removeEntry(Entry)>
	//   22   49:istore          4
				flag = flag1;
	//   23   51:iload           4
	//   24   53:istore_3        
				if(flag1)
	//*  25   54:iload           4
	//*  26   56:ifeq            19
				{
					mYValCount = mYValCount - 1;
	//   27   59:aload_0         
	//   28   60:aload_0         
	//   29   61:getfield        #38  <Field int mYValCount>
	//   30   64:iconst_1        
	//   31   65:isub            
	//   32   66:putfield        #38  <Field int mYValCount>
					calcMinMax(0, mYValCount);
	//   33   69:aload_0         
	//   34   70:iconst_0        
	//   35   71:aload_0         
	//   36   72:getfield        #38  <Field int mYValCount>
	//   37   75:invokevirtual   #283 <Method void calcMinMax(int, int)>
					return flag1;
	//   38   78:iload           4
	//   39   80:ireturn         
				}
			} else
			{
				return false;
	//   40   81:iconst_0        
	//   41   82:ireturn         
			}
		}
		return flag;
	}

	public void removeXValue(int i)
	{
		mXVals.remove(i);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field List mXVals>
	//    2    4:iload_1         
	//    3    5:invokeinterface #306 <Method Object List.remove(int)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void setDrawValues(boolean flag)
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext(); ((IDataSet)iterator.next()).setDrawValues(flag));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #196 <Method Object Iterator.next()>
	//    9   25:checkcast       #91  <Class IDataSet>
	//   10   28:iload_1         
	//   11   29:invokeinterface #310 <Method void IDataSet.setDrawValues(boolean)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	public void setHighlightEnabled(boolean flag)
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext(); ((IDataSet)iterator.next()).setHighlightEnabled(flag));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #196 <Method Object Iterator.next()>
	//    9   25:checkcast       #91  <Class IDataSet>
	//   10   28:iload_1         
	//   11   29:invokeinterface #313 <Method void IDataSet.setHighlightEnabled(boolean)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	public void setValueFormatter(ValueFormatter valueformatter)
	{
		if(valueformatter != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			Iterator iterator = mDataSets.iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field List mDataSets>
	//    5    9:invokeinterface #186 <Method Iterator List.iterator()>
	//    6   14:astore_2        
			while(iterator.hasNext()) 
	//*   7   15:aload_2         
	//*   8   16:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            4
				((IDataSet)iterator.next()).setValueFormatter(valueformatter);
	//   10   24:aload_2         
	//   11   25:invokeinterface #196 <Method Object Iterator.next()>
	//   12   30:checkcast       #91  <Class IDataSet>
	//   13   33:aload_1         
	//   14   34:invokeinterface #317 <Method void IDataSet.setValueFormatter(ValueFormatter)>
		}
	//*  15   39:goto            15
	}

	public void setValueTextColor(int i)
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext(); ((IDataSet)iterator.next()).setValueTextColor(i));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #196 <Method Object Iterator.next()>
	//    9   25:checkcast       #91  <Class IDataSet>
	//   10   28:iload_1         
	//   11   29:invokeinterface #320 <Method void IDataSet.setValueTextColor(int)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	public void setValueTextColors(List list)
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext(); ((IDataSet)iterator.next()).setValueTextColors(list));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #196 <Method Object Iterator.next()>
	//    9   25:checkcast       #91  <Class IDataSet>
	//   10   28:aload_1         
	//   11   29:invokeinterface #323 <Method void IDataSet.setValueTextColors(List)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	public void setValueTextSize(float f)
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext(); ((IDataSet)iterator.next()).setValueTextSize(f));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #196 <Method Object Iterator.next()>
	//    9   25:checkcast       #91  <Class IDataSet>
	//   10   28:fload_1         
	//   11   29:invokeinterface #328 <Method void IDataSet.setValueTextSize(float)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	public void setValueTypeface(Typeface typeface)
	{
		for(Iterator iterator = mDataSets.iterator(); iterator.hasNext(); ((IDataSet)iterator.next()).setValueTypeface(typeface));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field List mDataSets>
	//    2    4:invokeinterface #186 <Method Iterator List.iterator()>
	//    3    9:astore_2        
	//    4   10:aload_2         
	//    5   11:invokeinterface #192 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            37
	//    7   19:aload_2         
	//    8   20:invokeinterface #196 <Method Object Iterator.next()>
	//    9   25:checkcast       #91  <Class IDataSet>
	//   10   28:aload_1         
	//   11   29:invokeinterface #332 <Method void IDataSet.setValueTypeface(Typeface)>
	//*  12   34:goto            10
	//   13   37:return          
	}

	protected List mDataSets;
	protected float mLeftAxisMax;
	protected float mLeftAxisMin;
	protected float mRightAxisMax;
	protected float mRightAxisMin;
	private float mXValMaximumLength;
	protected List mXVals;
	protected float mYMax;
	protected float mYMin;
	private int mYValCount;
}
