// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.common.data:
//			FilteredDataBuffer, DataBuffer, AbstractDataBuffer

public final class PositionFilteredDataBuffer extends FilteredDataBuffer
{

	public PositionFilteredDataBuffer(AbstractDataBuffer abstractdatabuffer)
	{
		super(((DataBuffer) (abstractdatabuffer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void FilteredDataBuffer(DataBuffer)>
	//    3    5:aload_0         
	//    4    6:new             #18  <Class HashSet>
	//    5    9:dup             
	//    6   10:invokespecial   #21  <Method void HashSet()>
	//    7   13:putfield        #23  <Field HashSet zzoe>
	//    8   16:aload_0         
	//    9   17:new             #25  <Class ArrayList>
	//   10   20:dup             
	//   11   21:invokespecial   #26  <Method void ArrayList()>
	//   12   24:putfield        #28  <Field ArrayList zzob>
		zzcl();
	//   13   27:aload_0         
	//   14   28:invokespecial   #31  <Method void zzcl()>
	//   15   31:return          
	}

	private final void zzcl()
	{
		zzob.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field ArrayList zzob>
	//    2    4:invokevirtual   #37  <Method void ArrayList.clear()>
		int j = mDataBuffer.getCount();
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field DataBuffer mDataBuffer>
	//    5   11:invokeinterface #47  <Method int DataBuffer.getCount()>
	//    6   16:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   17:iconst_0        
	//*   8   18:istore_1        
	//*   9   19:iload_1         
	//*  10   20:iload_2         
	//*  11   21:icmpge          57
			if(!zzoe.contains(((Object) (Integer.valueOf(i)))))
	//*  12   24:aload_0         
	//*  13   25:getfield        #23  <Field HashSet zzoe>
	//*  14   28:iload_1         
	//*  15   29:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//*  16   32:invokevirtual   #57  <Method boolean HashSet.contains(Object)>
	//*  17   35:ifne            50
				zzob.add(((Object) (Integer.valueOf(i))));
	//   18   38:aload_0         
	//   19   39:getfield        #28  <Field ArrayList zzob>
	//   20   42:iload_1         
	//   21   43:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   22   46:invokevirtual   #60  <Method boolean ArrayList.add(Object)>
	//   23   49:pop             

	//   24   50:iload_1         
	//   25   51:iconst_1        
	//   26   52:iadd            
	//   27   53:istore_1        
	//*  28   54:goto            19
	//   29   57:return          
	}

	public final void clearFilters()
	{
		zzoe.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field HashSet zzoe>
	//    2    4:invokevirtual   #62  <Method void HashSet.clear()>
		zzcl();
	//    3    7:aload_0         
	//    4    8:invokespecial   #31  <Method void zzcl()>
	//    5   11:return          
	}

	public final int computeRealPosition(int i)
	{
		if(i >= 0 && i < getCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            27
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #65  <Method int getCount()>
	//*   5    9:icmpge          27
		{
			return ((Integer)zzob.get(i)).intValue();
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field ArrayList zzob>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #69  <Method Object ArrayList.get(int)>
	//   10   20:checkcast       #49  <Class Integer>
	//   11   23:invokevirtual   #72  <Method int Integer.intValue()>
	//   12   26:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   13   27:new             #74  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:bipush          53
	//   16   33:invokespecial   #77  <Method void StringBuilder(int)>
	//   17   36:astore_2        
			stringbuilder.append("Position ");
	//   18   37:aload_2         
	//   19   38:ldc1            #79  <String "Position ">
	//   20   40:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
			stringbuilder.append(i);
	//   22   44:aload_2         
	//   23   45:iload_1         
	//   24   46:invokevirtual   #86  <Method StringBuilder StringBuilder.append(int)>
	//   25   49:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   26   50:aload_2         
	//   27   51:ldc1            #88  <String " is out of bounds for this buffer">
	//   28   53:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   30   57:new             #90  <Class IllegalArgumentException>
	//   31   60:dup             
	//   32   61:aload_2         
	//   33   62:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   34   65:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   35   68:athrow          
		}
	}

	public final void filterOut(int i)
	{
		if(i >= 0 && i <= mDataBuffer.getCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            33
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #41  <Field DataBuffer mDataBuffer>
	//*   5    9:invokeinterface #47  <Method int DataBuffer.getCount()>
	//*   6   14:icmpgt          33
		{
			zzoe.add(((Object) (Integer.valueOf(i))));
	//    7   17:aload_0         
	//    8   18:getfield        #23  <Field HashSet zzoe>
	//    9   21:iload_1         
	//   10   22:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//   11   25:invokevirtual   #99  <Method boolean HashSet.add(Object)>
	//   12   28:pop             
			zzcl();
	//   13   29:aload_0         
	//   14   30:invokespecial   #31  <Method void zzcl()>
		}
	//   15   33:return          
	}

	public final int getCount()
	{
		return mDataBuffer.getCount() - zzoe.size();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field DataBuffer mDataBuffer>
	//    2    4:invokeinterface #47  <Method int DataBuffer.getCount()>
	//    3    9:aload_0         
	//    4   10:getfield        #23  <Field HashSet zzoe>
	//    5   13:invokevirtual   #102 <Method int HashSet.size()>
	//    6   16:isub            
	//    7   17:ireturn         
	}

	public final void unfilter(int i)
	{
		zzoe.remove(((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field HashSet zzoe>
	//    2    4:iload_1         
	//    3    5:invokestatic    #53  <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #106 <Method boolean HashSet.remove(Object)>
	//    5   11:pop             
		zzcl();
	//    6   12:aload_0         
	//    7   13:invokespecial   #31  <Method void zzcl()>
	//    8   16:return          
	}

	private final ArrayList zzob = new ArrayList();
	private final HashSet zzoe = new HashSet();
}
