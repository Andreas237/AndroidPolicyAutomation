// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzaj;

// Referenced classes of package com.google.android.gms.wearable:
//			DataEvent

public class DataEventBuffer extends zzf
	implements Result
{

	public DataEventBuffer(DataHolder dataholder)
	{
		super(dataholder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void zzf(DataHolder)>
		zzair = new Status(dataholder.getStatusCode());
	//    3    5:aload_0         
	//    4    6:new             #15  <Class Status>
	//    5    9:dup             
	//    6   10:aload_1         
	//    7   11:invokevirtual   #21  <Method int DataHolder.getStatusCode()>
	//    8   14:invokespecial   #24  <Method void Status(int)>
	//    9   17:putfield        #26  <Field Status zzair>
	//   10   20:return          
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Status zzair>
	//    2    4:areturn         
	}

	protected DataEvent zzC(int i, int j)
	{
		return ((DataEvent) (new zzaj(zzaBi, i, j)));
	//    0    0:new             #33  <Class zzaj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field DataHolder zzaBi>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #40  <Method void zzaj(DataHolder, int, int)>
	//    7   13:areturn         
	}

	public Object zzo(int i, int j)
	{
		return ((Object) (zzC(i, j)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #44  <Method DataEvent zzC(int, int)>
	//    4    6:areturn         
	}

	public String zzxn()
	{
		return "path";
	//    0    0:ldc1            #48  <String "path">
	//    1    2:areturn         
	}

	private final Status zzair;
}
