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
		if(j <= k)
	//*  13   26:iload_3         
	//*  14   27:iload           4
	//*  15   29:icmpgt          81
		{
			databuffer = ((DataBuffer) (new ArrayList(k)));
	//   16   32:new             #29  <Class ArrayList>
	//   17   35:dup             
	//   18   36:iload           4
	//   19   38:invokespecial   #32  <Method void ArrayList(int)>
	//   20   41:astore_1        
			for(i = 0; i < k; i++)
	//*  21   42:iconst_0        
	//*  22   43:istore_2        
	//*  23   44:iload_2         
	//*  24   45:iload           4
	//*  25   47:icmpge          66
				((ArrayList) (databuffer)).add(((Object) (Integer.valueOf(i))));
	//   26   50:aload_1         
	//   27   51:iload_2         
	//   28   52:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//   29   55:invokevirtual   #42  <Method boolean ArrayList.add(Object)>
	//   30   58:pop             

	//   31   59:iload_2         
	//   32   60:iconst_1        
	//   33   61:iadd            
	//   34   62:istore_2        
	//*  35   63:goto            44
			Collections.shuffle(((List) (databuffer)));
	//   36   66:aload_1         
	//   37   67:invokestatic    #48  <Method void Collections.shuffle(List)>
			zzoh = ((ArrayList) (databuffer)).subList(0, j);
	//   38   70:aload_0         
	//   39   71:aload_1         
	//   40   72:iconst_0        
	//   41   73:iload_3         
	//   42   74:invokevirtual   #52  <Method List ArrayList.subList(int, int)>
	//   43   77:putfield        #54  <Field List zzoh>
			return;
	//   44   80:return          
		} else
		{
			throw new IllegalArgumentException("numIndexes must be smaller or equal to max");
	//   45   81:new             #56  <Class IllegalArgumentException>
	//   46   84:dup             
	//   47   85:ldc1            #58  <String "numIndexes must be smaller or equal to max">
	//   48   87:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   49   90:athrow          
		}
	}

	public final int computeRealPosition(int i)
	{
		if(i >= 0 && i < getCount())
	//*   0    0:iload_1         
	//*   1    1:iflt            29
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #67  <Method int getCount()>
	//*   5    9:icmpge          29
		{
			return ((Integer)zzoh.get(i)).intValue();
	//    6   12:aload_0         
	//    7   13:getfield        #54  <Field List zzoh>
	//    8   16:iload_1         
	//    9   17:invokeinterface #73  <Method Object List.get(int)>
	//   10   22:checkcast       #34  <Class Integer>
	//   11   25:invokevirtual   #76  <Method int Integer.intValue()>
	//   12   28:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder(53);
	//   13   29:new             #78  <Class StringBuilder>
	//   14   32:dup             
	//   15   33:bipush          53
	//   16   35:invokespecial   #79  <Method void StringBuilder(int)>
	//   17   38:astore_2        
			stringbuilder.append("Position ");
	//   18   39:aload_2         
	//   19   40:ldc1            #81  <String "Position ">
	//   20   42:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
			stringbuilder.append(i);
	//   22   46:aload_2         
	//   23   47:iload_1         
	//   24   48:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   25   51:pop             
			stringbuilder.append(" is out of bounds for this buffer");
	//   26   52:aload_2         
	//   27   53:ldc1            #90  <String " is out of bounds for this buffer">
	//   28   55:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   30   59:new             #56  <Class IllegalArgumentException>
	//   31   62:dup             
	//   32   63:aload_2         
	//   33   64:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   34   67:invokespecial   #61  <Method void IllegalArgumentException(String)>
	//   35   70:athrow          
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
