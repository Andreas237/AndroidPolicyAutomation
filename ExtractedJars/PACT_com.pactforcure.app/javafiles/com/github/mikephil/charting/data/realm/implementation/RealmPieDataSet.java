// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.realm.implementation;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.realm.base.RealmBaseDataSet;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.Utils;
import io.realm.*;
import java.util.Iterator;
import java.util.List;

public class RealmPieDataSet extends RealmBaseDataSet
	implements IPieDataSet
{

	public RealmPieDataSet(RealmResults realmresults, String s)
	{
		super(realmresults, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void RealmBaseDataSet(RealmResults, String)>
		mSliceSpace = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #16  <Field float mSliceSpace>
		mShift = 18F;
	//    7   11:aload_0         
	//    8   12:ldc1            #17  <Float 18F>
	//    9   14:putfield        #19  <Field float mShift>
		build(results);
	//   10   17:aload_0         
	//   11   18:aload_0         
	//   12   19:getfield        #23  <Field RealmResults results>
	//   13   22:invokevirtual   #27  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:aload_0         
	//   17   28:getfield        #23  <Field RealmResults results>
	//   18   31:invokevirtual   #33  <Method int RealmResults.size()>
	//   19   34:invokevirtual   #37  <Method void calcMinMax(int, int)>
	//   20   37:return          
	}

	public RealmPieDataSet(RealmResults realmresults, String s, String s1)
	{
		super(realmresults, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #43  <Method void RealmBaseDataSet(RealmResults, String, String)>
		mSliceSpace = 0.0F;
	//    5    7:aload_0         
	//    6    8:fconst_0        
	//    7    9:putfield        #16  <Field float mSliceSpace>
		mShift = 18F;
	//    8   12:aload_0         
	//    9   13:ldc1            #17  <Float 18F>
	//   10   15:putfield        #19  <Field float mShift>
		build(results);
	//   11   18:aload_0         
	//   12   19:aload_0         
	//   13   20:getfield        #23  <Field RealmResults results>
	//   14   23:invokevirtual   #27  <Method void build(RealmResults)>
		calcMinMax(0, results.size());
	//   15   26:aload_0         
	//   16   27:iconst_0        
	//   17   28:aload_0         
	//   18   29:getfield        #23  <Field RealmResults results>
	//   19   32:invokevirtual   #33  <Method int RealmResults.size()>
	//   20   35:invokevirtual   #37  <Method void calcMinMax(int, int)>
	//   21   38:return          
	}

	public void build(RealmResults realmresults)
	{
		if(mIndexField == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field String mIndexField>
	//*   2    4:ifnonnull       73
		{
			int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_2        
			for(realmresults = ((RealmResults) (realmresults.iterator())); ((Iterator) (realmresults)).hasNext();)
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #52  <Method Iterator RealmResults.iterator()>
	//*   7   13:astore_1        
	//*   8   14:aload_1         
	//*   9   15:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            140
			{
				DynamicRealmObject dynamicrealmobject = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   11   23:new             #60  <Class DynamicRealmObject>
	//   12   26:dup             
	//   13   27:aload_1         
	//   14   28:invokeinterface #64  <Method Object Iterator.next()>
	//   15   33:checkcast       #66  <Class RealmObject>
	//   16   36:invokespecial   #69  <Method void DynamicRealmObject(RealmObject)>
	//   17   39:astore_3        
				mValues.add(((Object) (new Entry(dynamicrealmobject.getFloat(mValuesField), i))));
	//   18   40:aload_0         
	//   19   41:getfield        #73  <Field List mValues>
	//   20   44:new             #75  <Class Entry>
	//   21   47:dup             
	//   22   48:aload_3         
	//   23   49:aload_0         
	//   24   50:getfield        #78  <Field String mValuesField>
	//   25   53:invokevirtual   #82  <Method float DynamicRealmObject.getFloat(String)>
	//   26   56:iload_2         
	//   27   57:invokespecial   #85  <Method void Entry(float, int)>
	//   28   60:invokeinterface #91  <Method boolean List.add(Object)>
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
	//*  36   74:invokevirtual   #52  <Method Iterator RealmResults.iterator()>
	//*  37   77:astore_1        
	//*  38   78:aload_1         
	//*  39   79:invokeinterface #58  <Method boolean Iterator.hasNext()>
	//*  40   84:ifeq            140
				dynamicrealmobject1 = new DynamicRealmObject((RealmObject)((Iterator) (realmresults)).next());
	//   41   87:new             #60  <Class DynamicRealmObject>
	//   42   90:dup             
	//   43   91:aload_1         
	//   44   92:invokeinterface #64  <Method Object Iterator.next()>
	//   45   97:checkcast       #66  <Class RealmObject>
	//   46  100:invokespecial   #69  <Method void DynamicRealmObject(RealmObject)>
	//   47  103:astore_3        

	//   48  104:aload_0         
	//   49  105:getfield        #73  <Field List mValues>
	//   50  108:new             #75  <Class Entry>
	//   51  111:dup             
	//   52  112:aload_3         
	//   53  113:aload_0         
	//   54  114:getfield        #78  <Field String mValuesField>
	//   55  117:invokevirtual   #82  <Method float DynamicRealmObject.getFloat(String)>
	//   56  120:aload_3         
	//   57  121:aload_0         
	//   58  122:getfield        #48  <Field String mIndexField>
	//   59  125:invokevirtual   #95  <Method int DynamicRealmObject.getInt(String)>
	//   60  128:invokespecial   #85  <Method void Entry(float, int)>
	//   61  131:invokeinterface #91  <Method boolean List.add(Object)>
	//   62  136:pop             
		}
	//*  63  137:goto            78
	//   64  140:return          
	}

	public float getSelectionShift()
	{
		return mShift;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field float mShift>
	//    2    4:freturn         
	}

	public float getSliceSpace()
	{
		return mSliceSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field float mSliceSpace>
	//    2    4:freturn         
	}

	public void setSelectionShift(float f)
	{
		mShift = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #107 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #19  <Field float mShift>
	//    4    8:return          
	}

	public void setSliceSpace(float f)
	{
		float f1 = f;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f > 20F)
	//*   2    2:fload_1         
	//*   3    3:ldc1            #109 <Float 20F>
	//*   4    5:fcmpl           
	//*   5    6:ifle            12
			f1 = 20F;
	//    6    9:ldc1            #109 <Float 20F>
	//    7   11:fstore_2        
		f = f1;
	//    8   12:fload_2         
	//    9   13:fstore_1        
		if(f1 < 0.0F)
	//*  10   14:fload_2         
	//*  11   15:fconst_0        
	//*  12   16:fcmpg           
	//*  13   17:ifge            22
			f = 0.0F;
	//   14   20:fconst_0        
	//   15   21:fstore_1        
		mSliceSpace = Utils.convertDpToPixel(f);
	//   16   22:aload_0         
	//   17   23:fload_1         
	//   18   24:invokestatic    #107 <Method float Utils.convertDpToPixel(float)>
	//   19   27:putfield        #16  <Field float mSliceSpace>
	//   20   30:return          
	}

	private float mShift;
	private float mSliceSpace;
}
