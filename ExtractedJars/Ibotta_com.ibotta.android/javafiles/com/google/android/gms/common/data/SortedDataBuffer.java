// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.data:
//			DataBuffer, zzb, DataBufferIterator

public final class SortedDataBuffer
	implements DataBuffer
{

	public SortedDataBuffer(DataBuffer databuffer, Comparator comparator)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzok = databuffer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field DataBuffer zzok>
		zzol = new Integer[databuffer.getCount()];
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokeinterface #23  <Method int DataBuffer.getCount()>
	//    8   16:anewarray       Integer[]
	//    9   19:putfield        #27  <Field Integer[] zzol>
		int i = 0;
	//   10   22:iconst_0        
	//   11   23:istore_3        
		do
		{
			databuffer = ((DataBuffer) (zzol));
	//   12   24:aload_0         
	//   13   25:getfield        #27  <Field Integer[] zzol>
	//   14   28:astore_1        
			if(i < databuffer.length)
	//*  15   29:iload_3         
	//*  16   30:aload_1         
	//*  17   31:arraylength     
	//*  18   32:icmpge          49
			{
				databuffer[i] = ((/*<invalid signature>*/java.lang.Object) (Integer.valueOf(i)));
	//   19   35:aload_1         
	//   20   36:iload_3         
	//   21   37:iload_3         
	//   22   38:invokestatic    #31  <Method Integer Integer.valueOf(int)>
	//   23   41:aastore         
				i++;
	//   24   42:iload_3         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_3        
			} else
	//*  28   46:goto            24
			{
				Arrays.sort(((Object []) (databuffer)), ((Comparator) (new zzb(this, comparator))));
	//   29   49:aload_1         
	//   30   50:new             #33  <Class zzb>
	//   31   53:dup             
	//   32   54:aload_0         
	//   33   55:aload_2         
	//   34   56:invokespecial   #36  <Method void zzb(SortedDataBuffer, Comparator)>
	//   35   59:invokestatic    #42  <Method void Arrays.sort(Object[], Comparator)>
				return;
	//   36   62:return          
			}
		} while(true);
	}

	static DataBuffer zza(SortedDataBuffer sorteddatabuffer)
	{
		return sorteddatabuffer.zzok;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DataBuffer zzok>
	//    2    4:areturn         
	}

	public final void close()
	{
		zzok.release();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DataBuffer zzok>
	//    2    4:invokeinterface #51  <Method void DataBuffer.release()>
	//    3    9:return          
	}

	public final Object get(int i)
	{
		return zzok.get(zzol[i].intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DataBuffer zzok>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field Integer[] zzol>
	//    4    8:iload_1         
	//    5    9:aaload          
	//    6   10:invokevirtual   #56  <Method int Integer.intValue()>
	//    7   13:invokeinterface #58  <Method Object DataBuffer.get(int)>
	//    8   18:areturn         
	}

	public final int getCount()
	{
		return zzol.length;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Integer[] zzol>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public final Bundle getMetadata()
	{
		return zzok.getMetadata();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DataBuffer zzok>
	//    2    4:invokeinterface #63  <Method Bundle DataBuffer.getMetadata()>
	//    3    9:areturn         
	}

	public final boolean isClosed()
	{
		return zzok.isClosed();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DataBuffer zzok>
	//    2    4:invokeinterface #67  <Method boolean DataBuffer.isClosed()>
	//    3    9:ireturn         
	}

	public final Iterator iterator()
	{
		return ((Iterator) (new DataBufferIterator(((DataBuffer) (this)))));
	//    0    0:new             #71  <Class DataBufferIterator>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #74  <Method void DataBufferIterator(DataBuffer)>
	//    4    8:areturn         
	}

	public final void release()
	{
		zzok.release();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field DataBuffer zzok>
	//    2    4:invokeinterface #51  <Method void DataBuffer.release()>
	//    3    9:return          
	}

	public final Iterator singleRefIterator()
	{
		return iterator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #78  <Method Iterator iterator()>
	//    2    4:areturn         
	}

	private final DataBuffer zzok;
	private final Integer zzol[];
}
