// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;
import android.util.SparseArray;

class TransitionValuesMaps
{

	TransitionValuesMaps()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #21  <Class ArrayMap>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void ArrayMap()>
	//    6   12:putfield        #24  <Field ArrayMap mViewValues>
	//    7   15:aload_0         
	//    8   16:new             #26  <Class SparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #27  <Method void SparseArray()>
	//   11   23:putfield        #29  <Field SparseArray mIdValues>
	//   12   26:aload_0         
	//   13   27:new             #31  <Class LongSparseArray>
	//   14   30:dup             
	//   15   31:invokespecial   #32  <Method void LongSparseArray()>
	//   16   34:putfield        #34  <Field LongSparseArray mItemIdValues>
	//   17   37:aload_0         
	//   18   38:new             #21  <Class ArrayMap>
	//   19   41:dup             
	//   20   42:invokespecial   #22  <Method void ArrayMap()>
	//   21   45:putfield        #36  <Field ArrayMap mNameValues>
	//   22   48:return          
	}

	final SparseArray mIdValues = new SparseArray();
	final LongSparseArray mItemIdValues = new LongSparseArray();
	final ArrayMap mNameValues = new ArrayMap();
	final ArrayMap mViewValues = new ArrayMap();
}
