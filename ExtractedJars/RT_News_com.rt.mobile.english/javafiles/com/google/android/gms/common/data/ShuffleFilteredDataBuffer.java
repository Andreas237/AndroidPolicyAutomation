// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			FilteredDataBuffer, DataBuffer

public final class ShuffleFilteredDataBuffer extends FilteredDataBuffer
{

	public ShuffleFilteredDataBuffer(DataBuffer databuffer, int i)
	{
		super(databuffer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #15  <Method void FilteredDataBuffer(DataBuffer)>
		zzoi = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #17  <Field int zzoi>
		int j = zzoi;
	//    6   10:aload_0         
	//    7   11:getfield        #17  <Field int zzoi>
	//    8   14:istore_3        
		int k = mDataBuffer.getCount();
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field DataBuffer mDataBuffer>
	//   11   19:invokeinterface #27  <Method int DataBuffer.getCount()>
	//   12   24:istore          4
		if(j > k)
	//*  13   26:iload_3         
	//*  14   27:iload           4
	//*  15   29:icmple          42
			throw new IllegalArgumentException("numIndexes must be smaller or equal to max");
	//   16   32:new             #29  <Class IllegalArgumentException>
	//   17   35:dup             
	//   18   36:ldc1            #31  <String "numIndexes must be smaller or equal to max">
	//   19   38:invokespecial   #34  <Method void IllegalArgumentException(String)>
	//   20   41:athrow          
		databuffer = ((DataBuffer) (new ArrayList(k)));
	//   21   42:new             #36  <Class ArrayList>
	//   22   45:dup             
	//   23   46:iload           4
	//   24   48:invokespecial   #39  <Method void ArrayList(int)>
	//   25   51:astore_1        
		for(i = 0; i < k; i++)
	//*  26   52:iconst_0        
	//*  27   53:istore_2        
	//*  28   54:iload_2         
	//*  29   55:iload           4
	//*  30   57:icmpge          76
			((ArrayList) (databuffer)).add(((Object) (Integer.valueOf(i))));
	//   31   60:aload_1         
	//   32   61:iload_2         
	//   33   62:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//   34   65:invokevirtual   #49  <Method boolean ArrayList.add(Object)>
	//   35   68:pop             

	//   36   69:iload_2         
	//   37   70:iconst_1        
	//   38   71:iadd            
	//   39   72:istore_2        
	//*  40   73:goto            54
		Collections.shuffle(((List) (databuffer)));
	//   41   76:aload_1         
	//   42   77:invokestatic    #55  <Method void Collections.shuffle(List)>
		zzoh = ((ArrayList) (databuffer)).subList(0, j);
	//   43   80:aload_0         
	//   44   81:aload_1         
	//   45   82:iconst_0        
	//   46   83:iload_3         
	//   47   84:invokevirtual   #59  <Method List ArrayList.subList(int, int)>
	//   48   87:putfield        #61  <Field List zzoh>
	//   49   90:return          
	}

	public final int computeRealPosition(int i)
	{
		if(i >= 0 && i < getCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            32
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #67  <Method int getCount()>
	//*   5    9:icmplt          15
	//*   6   12:goto            32
		{
			return ((Integer)zzoh.get(i)).intValue();
	//    7   15:aload_0         
	//    8   16:getfield        #61  <Field List zzoh>
	//    9   19:iload_1         
	//   10   20:invokeinterface #73  <Method Object List.get(int)>
	//   11   25:checkcast       #41  <Class Integer>
	//   12   28:invokevirtual   #76  <Method int Integer.intValue()>
	//   13   31:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   14   32:new             #78  <Class StringBuilder>
	//   15   35:dup             
	//   16   36:bipush          53
	//   17   38:invokespecial   #79  <Method void StringBuilder(int)>
	//   18   41:astore_2        
			stringbuilder.append("Position ");
	//   19   42:aload_2         
	//   20   43:ldc1            #81  <String "Position ">
	//   21   45:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   22   48:pop             
			stringbuilder.append(i);
	//   23   49:aload_2         
	//   24   50:iload_1         
	//   25   51:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   26   54:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   27   55:aload_2         
	//   28   56:ldc1            #90  <String " is out of bounds for this buffer">
	//   29   58:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   30   61:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   31   62:new             #29  <Class IllegalArgumentException>
	//   32   65:dup             
	//   33   66:aload_2         
	//   34   67:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   35   70:invokespecial   #34  <Method void IllegalArgumentException(String)>
	//   36   73:athrow          
		}
	}

	public final int getCount()
	{
		return Math.min(zzoi, mDataBuffer.getCount());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int zzoi>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field DataBuffer mDataBuffer>
	//    4    8:invokeinterface #27  <Method int DataBuffer.getCount()>
	//    5   13:invokestatic    #100 <Method int Math.min(int, int)>
	//    6   16:ireturn         
	}

	private final List zzoh;
	private final int zzoi;
}
