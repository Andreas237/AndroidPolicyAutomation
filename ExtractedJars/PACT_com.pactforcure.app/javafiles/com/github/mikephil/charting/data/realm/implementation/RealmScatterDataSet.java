// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.implementation;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.realm.base.RealmLineScatterCandleRadarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import io.realm.*;
import java.util.Iterator;
import java.util.List;

public class RealmScatterDataSet extends RealmLineScatterCandleRadarDataSet
	implements IScatterDataSet
{

	public RealmScatterDataSet(RealmResults realmresults, String s)
	{
		super(realmresults, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void RealmLineScatterCandleRadarDataSet(RealmResults, String)>
		mShapeSize = 10F;
	//    4    6:aload_0         
	//    5    7:ldc1            #19  <Float 10F>
	//    6    9:putfield        #21  <Field float mShapeSize>
		mScatterShape = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE;
	//    7   12:aload_0         
	//    8   13:getstatic       #26  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.SQUARE>
	//    9   16:putfield        #28  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape mScatterShape>
		mScatterShapeHoleRadius = 0.0F;
	//   10   19:aload_0         
	//   11   20:fconst_0        
	//   12   21:putfield        #30  <Field float mScatterShapeHoleRadius>
		mScatterShapeHoleColor = -1;
	//   13   24:aload_0         
	//   14   25:iconst_m1       
	//   15   26:putfield        #32  <Field int mScatterShapeHoleColor>
		build(results);
	//   16   29:aload_0         
	//   17   30:aload_0         
	//   18   31:getfield        #36  <Field RealmResults results>
	//   19   34:invokevirtual   #40  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//   20   37:aload_0         
	//   21   38:iconst_0        
	//   22   39:aload_0         
	//   23   40:getfield        #36  <Field RealmResults results>
	//   24   43:invokevirtual   #46  <Method int RealmResults.size()>
	//   25   46:invokevirtual   #50  <Method void calcMinMax(int, int)>
	//   26   49:return          
	}

	public RealmScatterDataSet(RealmResults realmresults, String s, String s1)
	{
		super(realmresults, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #56  <Method void RealmLineScatterCandleRadarDataSet(RealmResults, String, String)>
		mShapeSize = 10F;
	//    5    7:aload_0         
	//    6    8:ldc1            #19  <Float 10F>
	//    7   10:putfield        #21  <Field float mShapeSize>
		mScatterShape = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE;
	//    8   13:aload_0         
	//    9   14:getstatic       #26  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.SQUARE>
	//   10   17:putfield        #28  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape mScatterShape>
		mScatterShapeHoleRadius = 0.0F;
	//   11   20:aload_0         
	//   12   21:fconst_0        
	//   13   22:putfield        #30  <Field float mScatterShapeHoleRadius>
		mScatterShapeHoleColor = -1;
	//   14   25:aload_0         
	//   15   26:iconst_m1       
	//   16   27:putfield        #32  <Field int mScatterShapeHoleColor>
		build(results);
	//   17   30:aload_0         
	//   18   31:aload_0         
	//   19   32:getfield        #36  <Field RealmResults results>
	//   20   35:invokevirtual   #40  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//   21   38:aload_0         
	//   22   39:iconst_0        
	//   23   40:aload_0         
	//   24   41:getfield        #36  <Field RealmResults results>
	//   25   44:invokevirtual   #46  <Method int RealmResults.size()>
	//   26   47:invokevirtual   #50  <Method void calcMinMax(int, int)>
	//   27   50:return          
	}

	public void build(RealmResults realmresults)
	{
		if(mIndexField == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field String mIndexField>
	//*   2    4:ifnonnull       73
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext();)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #65  <Method Iterator RealmResults.iterator()>
	//*   7   13:astore_1        
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            140
			{
				DynamicRealmObject dynamicrealmobject = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   11   23:new             #73  <Class DynamicRealmObject>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:invokeinterface #77  <Method Object Iterator.next()>
	//   15   33:checkcast       #79  <Class RealmObject>
	//   16   36:invokespecial   #82  <Method void DynamicRealmObject(RealmObject)>
	//   17   39:astore_3        
				mValues.add(((Object) (new Entry(dynamicrealmobject.getFloat(mValuesField), i))));
	//   18   40:aload_0         
	//   19   41:getfield        #86  <Field List mValues>
	//   20   44:new             #88  <Class Entry>
	//   21   47:dup             
	//   22   48:aload_3         
	//   23   49:aload_0         
	//   24   50:getfield        #91  <Field String mValuesField>
	//   25   53:invokevirtual   #95  <Method float DynamicRealmObject.getFloat(String)>
	//   26   56:iload_2         
	//   27   57:invokespecial   #98  <Method void Entry(float, int)>
	//   28   60:invokeinterface #104 <Method boolean List.add(Object)>
	//   29   65:pop             
				i++;
	//   30   66:iload_2         
	//   31   67:iconst_1        
	//   32   68:iadd            
	//   33   69:istore_2        
			}

		} else
	//*  34   70:goto            14
		{
			DynamicRealmObject dynamicrealmobject1;
			for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext(); mValues.add(((Object) (new Entry(dynamicrealmobject1.getFloat(mValuesField), dynamicrealmobject1.getInt(mIndexField))))))
	//*  35   73:aload_1         
	//*  36   74:invokevirtual   #65  <Method Iterator RealmResults.iterator()>
	//*  37   77:astore_1        
	//*  38   78:aload_1         
	//*  39   79:invokeinterface #71  <Method boolean Iterator.hasNext()>
	//*  40   84:ifeq            140
				dynamicrealmobject1 = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   41   87:new             #73  <Class DynamicRealmObject>
	//   42   90:dup             
	//   43   91:aload_1         
	//   44   92:invokeinterface #77  <Method Object Iterator.next()>
	//   45   97:checkcast       #79  <Class RealmObject>
	//   46  100:invokespecial   #82  <Method void DynamicRealmObject(RealmObject)>
	//   47  103:astore_3        

	//   48  104:aload_0         
	//   49  105:getfield        #86  <Field List mValues>
	//   50  108:new             #88  <Class Entry>
	//   51  111:dup             
	//   52  112:aload_3         
	//   53  113:aload_0         
	//   54  114:getfield        #91  <Field String mValuesField>
	//   55  117:invokevirtual   #95  <Method float DynamicRealmObject.getFloat(String)>
	//   56  120:aload_3         
	//   57  121:aload_0         
	//   58  122:getfield        #61  <Field String mIndexField>
	//   59  125:invokevirtual   #108 <Method int DynamicRealmObject.getInt(String)>
	//   60  128:invokespecial   #98  <Method void Entry(float, int)>
	//   61  131:invokeinterface #104 <Method boolean List.add(Object)>
	//   62  136:pop             
		}
	//*  63  137:goto            78
	//   64  140:return          
	}

	public com.github.mikephil.charting.charts.ScatterChart.ScatterShape getScatterShape()
	{
		return mScatterShape;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape mScatterShape>
	//    2    4:areturn         
	}

	public int getScatterShapeHoleColor()
	{
		return mScatterShapeHoleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int mScatterShapeHoleColor>
	//    2    4:ireturn         
	}

	public float getScatterShapeHoleRadius()
	{
		return mScatterShapeHoleRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float mScatterShapeHoleRadius>
	//    2    4:freturn         
	}

	public float getScatterShapeSize()
	{
		return mShapeSize;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float mShapeSize>
	//    2    4:freturn         
	}

	public void setScatterShape(com.github.mikephil.charting.charts.ScatterChart.ScatterShape scattershape)
	{
		mScatterShape = scattershape;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape mScatterShape>
	//    3    5:return          
	}

	public void setScatterShapeHoleColor(int i)
	{
		mScatterShapeHoleColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int mScatterShapeHoleColor>
	//    3    5:return          
	}

	public void setScatterShapeHoleRadius(float f)
	{
		mScatterShapeHoleRadius = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #30  <Field float mScatterShapeHoleRadius>
	//    3    5:return          
	}

	public void setScatterShapeSize(float f)
	{
		mShapeSize = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #21  <Field float mShapeSize>
	//    3    5:return          
	}

	private com.github.mikephil.charting.charts.ScatterChart.ScatterShape mScatterShape;
	private int mScatterShapeHoleColor;
	private float mScatterShapeHoleRadius;
	private float mShapeSize;
}
