// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.DataHolder;

public abstract class zzaaf
	implements zzaaz.zzc
{

	protected zzaaf(DataHolder dataholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzazI = dataholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field DataHolder zzazI>
	//    5    9:return          
	}

	protected abstract void zza(Object obj, DataHolder dataholder);

	public final void zzs(Object obj)
	{
		zza(obj, zzazI);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #16  <Field DataHolder zzazI>
	//    4    6:invokevirtual   #23  <Method void zza(Object, DataHolder)>
	//    5    9:return          
	}

	public void zzvy()
	{
		if(zzazI != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field DataHolder zzazI>
	//*   2    4:ifnull          14
			zzazI.close();
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field DataHolder zzazI>
	//    5   11:invokevirtual   #31  <Method void DataHolder.close()>
	//    6   14:return          
	}

	private final DataHolder zzazI;
}
