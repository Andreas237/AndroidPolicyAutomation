// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzaao
	implements Releasable, Result
{

	protected zzaao(DataHolder dataholder, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzair = status;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #19  <Field Status zzair>
		zzaBi = dataholder;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field DataHolder zzaBi>
	//    8   14:return          
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Status zzair>
	//    2    4:areturn         
	}

	public void release()
	{
		if(zzaBi != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field DataHolder zzaBi>
	//*   2    4:ifnull          14
			zzaBi.close();
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field DataHolder zzaBi>
	//    5   11:invokevirtual   #30  <Method void DataHolder.close()>
	//    6   14:return          
	}

	protected final DataHolder zzaBi;
	protected final Status zzair;
}
