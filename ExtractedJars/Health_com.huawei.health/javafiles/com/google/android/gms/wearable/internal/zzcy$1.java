// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataEventBuffer;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcy

final class zzcy$1
	implements com.google.android.gms.internal.zc
{

	public void zza(com.google.android.gms.wearable..DataListener datalistener)
	{
		datalistener.onDataChanged(new DataEventBuffer(zzbTn));
	//    0    0:aload_1         
	//    1    1:new             #26  <Class DataEventBuffer>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #18  <Field DataHolder zzbTn>
	//    5    9:invokespecial   #28  <Method void DataEventBuffer(DataHolder)>
	//    6   12:invokeinterface #34  <Method void com.google.android.gms.wearable.DataApi$DataListener.onDataChanged(DataEventBuffer)>
		zzbTn.close();
	//    7   17:aload_0         
	//    8   18:getfield        #18  <Field DataHolder zzbTn>
	//    9   21:invokevirtual   #39  <Method void DataHolder.close()>
		return;
	//   10   24:return          
		datalistener;
	//   11   25:astore_1        
		zzbTn.close();
	//   12   26:aload_0         
	//   13   27:getfield        #18  <Field DataHolder zzbTn>
	//   14   30:invokevirtual   #39  <Method void DataHolder.close()>
		throw datalistener;
	//   15   33:aload_1         
	//   16   34:athrow          
	}

	public void zzs(Object obj)
	{
		zza((com.google.android.gms.wearable..DataListener)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class com.google.android.gms.wearable.DataApi$DataListener>
	//    3    5:invokevirtual   #43  <Method void zza(com.google.android.gms.wearable.DataApi$DataListener)>
	//    4    8:return          
	}

	public void zzwc()
	{
		zzbTn.close();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field DataHolder zzbTn>
	//    2    4:invokevirtual   #39  <Method void DataHolder.close()>
	//    3    7:return          
	}

	final DataHolder zzbTn;

	zzcy$1(DataHolder dataholder)
	{
		zzbTn = dataholder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field DataHolder zzbTn>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
