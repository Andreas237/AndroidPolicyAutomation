// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//			DataBuffer, Freezable

public final class DataBufferUtils
{

	private DataBufferUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ArrayList freezeAndClose(DataBuffer databuffer)
	{
		Object obj = ((Object) (new ArrayList(databuffer.getCount())));
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokeinterface #19  <Method int DataBuffer.getCount()>
	//    4   10:invokespecial   #22  <Method void ArrayList(int)>
	//    5   13:astore_1        
		for(Iterator iterator = databuffer.iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(((Freezable)iterator.next()).freeze()));
	//    6   14:aload_0         
	//    7   15:invokeinterface #26  <Method Iterator DataBuffer.iterator()>
	//    8   20:astore_2        
	//    9   21:aload_2         
	//   10   22:invokeinterface #32  <Method boolean Iterator.hasNext()>
	//   11   27:ifeq            61
	//   12   30:aload_1         
	//   13   31:aload_2         
	//   14   32:invokeinterface #36  <Method Object Iterator.next()>
	//   15   37:checkcast       #38  <Class Freezable>
	//   16   40:invokeinterface #41  <Method Object Freezable.freeze()>
	//   17   45:invokevirtual   #45  <Method boolean ArrayList.add(Object)>
	//   18   48:pop             
		break MISSING_BLOCK_LABEL_61;
	//   19   49:goto            21
		obj;
	//   20   52:astore_1        
		databuffer.close();
	//   21   53:aload_0         
	//   22   54:invokeinterface #48  <Method void DataBuffer.close()>
		throw obj;
	//   23   59:aload_1         
	//   24   60:athrow          
		databuffer.close();
	//   25   61:aload_0         
	//   26   62:invokeinterface #48  <Method void DataBuffer.close()>
		return ((ArrayList) (obj));
	//   27   67:aload_1         
	//   28   68:areturn         
	}

	public static boolean hasData(DataBuffer databuffer)
	{
		return databuffer != null && databuffer.getCount() > 0;
	//    0    0:aload_0         
	//    1    1:ifnull          15
	//    2    4:aload_0         
	//    3    5:invokeinterface #19  <Method int DataBuffer.getCount()>
	//    4   10:ifle            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public static boolean hasNextPage(DataBuffer databuffer)
	{
		databuffer = ((DataBuffer) (databuffer.zzwy()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #58  <Method Bundle DataBuffer.zzwy()>
	//    2    6:astore_0        
		return databuffer != null && ((Bundle) (databuffer)).getString("next_page_token") != null;
	//    3    7:aload_0         
	//    4    8:ifnull          22
	//    5   11:aload_0         
	//    6   12:ldc1            #60  <String "next_page_token">
	//    7   14:invokevirtual   #66  <Method String Bundle.getString(String)>
	//    8   17:ifnull          22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	public static boolean hasPrevPage(DataBuffer databuffer)
	{
		databuffer = ((DataBuffer) (databuffer.zzwy()));
	//    0    0:aload_0         
	//    1    1:invokeinterface #58  <Method Bundle DataBuffer.zzwy()>
	//    2    6:astore_0        
		return databuffer != null && ((Bundle) (databuffer)).getString("prev_page_token") != null;
	//    3    7:aload_0         
	//    4    8:ifnull          22
	//    5   11:aload_0         
	//    6   12:ldc1            #69  <String "prev_page_token">
	//    7   14:invokevirtual   #66  <Method String Bundle.getString(String)>
	//    8   17:ifnull          22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}
}
