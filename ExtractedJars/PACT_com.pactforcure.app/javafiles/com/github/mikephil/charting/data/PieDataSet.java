// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			DataSet, Entry

public class PieDataSet extends DataSet
	implements IPieDataSet
{

	public PieDataSet(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void DataSet(List, String)>
		mSliceSpace = 0.0F;
	//    4    6:aload_0         
	//    5    7:fconst_0        
	//    6    8:putfield        #16  <Field float mSliceSpace>
		mShift = 18F;
	//    7   11:aload_0         
	//    8   12:ldc1            #17  <Float 18F>
	//    9   14:putfield        #19  <Field float mShift>
	//   10   17:return          
	}

	public DataSet copy()
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #26  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < mYVals.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #33  <Field List mYVals>
	//*   9   15:invokeinterface #39  <Method int List.size()>
	//*  10   20:icmpge          53
			((List) (obj)).add(((Object) (((Entry)mYVals.get(i)).copy())));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #33  <Field List mYVals>
	//   14   28:iload_1         
	//   15   29:invokeinterface #43  <Method Object List.get(int)>
	//   16   34:checkcast       #45  <Class Entry>
	//   17   37:invokevirtual   #48  <Method Entry Entry.copy()>
	//   18   40:invokeinterface #52  <Method boolean List.add(Object)>
	//   19   45:pop             

	//   20   46:iload_1         
	//   21   47:iconst_1        
	//   22   48:iadd            
	//   23   49:istore_1        
	//*  24   50:goto            10
		obj = ((Object) (new PieDataSet(((List) (obj)), getLabel())));
	//   25   53:new             #2   <Class PieDataSet>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:invokevirtual   #56  <Method String getLabel()>
	//   30   62:invokespecial   #57  <Method void PieDataSet(List, String)>
	//   31   65:astore_2        
		obj.mColors = mColors;
	//   32   66:aload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #60  <Field List mColors>
	//   35   71:putfield        #60  <Field List mColors>
		obj.mSliceSpace = mSliceSpace;
	//   36   74:aload_2         
	//   37   75:aload_0         
	//   38   76:getfield        #16  <Field float mSliceSpace>
	//   39   79:putfield        #16  <Field float mSliceSpace>
		obj.mShift = mShift;
	//   40   82:aload_2         
	//   41   83:aload_0         
	//   42   84:getfield        #19  <Field float mShift>
	//   43   87:putfield        #19  <Field float mShift>
		return ((DataSet) (obj));
	//   44   90:aload_2         
	//   45   91:areturn         
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
	//    2    2:invokestatic    #72  <Method float Utils.convertDpToPixel(float)>
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
	//*   3    3:ldc1            #74  <Float 20F>
	//*   4    5:fcmpl           
	//*   5    6:ifle            12
			f1 = 20F;
	//    6    9:ldc1            #74  <Float 20F>
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
	//   18   24:invokestatic    #72  <Method float Utils.convertDpToPixel(float)>
	//   19   27:putfield        #16  <Field float mSliceSpace>
	//   20   30:return          
	}

	private float mShift;
	private float mSliceSpace;
}
