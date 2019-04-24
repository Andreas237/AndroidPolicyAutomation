// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.wearable:
//			WearableListenerService, DataEventBuffer

class WearableListenerService$zzc$1
	implements Runnable
{

	public void run()
	{
		DataEventBuffer dataeventbuffer = new DataEventBuffer(zzbTn);
	//    0    0:new             #31  <Class DataEventBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field DataHolder zzbTn>
	//    4    8:invokespecial   #33  <Method void DataEventBuffer(DataHolder)>
	//    5   11:astore_1        
		zzbTo.zzbTl.onDataChanged(dataeventbuffer);
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field WearableListenerService$zzc zzbTo>
	//    8   16:getfield        #37  <Field WearableListenerService WearableListenerService$zzc.zzbTl>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #41  <Method void WearableListenerService.onDataChanged(DataEventBuffer)>
		dataeventbuffer.release();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #44  <Method void DataEventBuffer.release()>
		return;
	//   13   27:return          
		Exception exception;
		exception;
	//   14   28:astore_2        
		dataeventbuffer.release();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #44  <Method void DataEventBuffer.release()>
		throw exception;
	//   17   33:aload_2         
	//   18   34:athrow          
	}

	final DataHolder zzbTn;
	final WearableListenerService.zzc zzbTo;

	WearableListenerService$zzc$1(WearableListenerService.zzc zzc1, DataHolder dataholder)
	{
		zzbTo = zzc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field WearableListenerService$zzc zzbTo>
		zzbTn = dataholder;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field DataHolder zzbTn>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
