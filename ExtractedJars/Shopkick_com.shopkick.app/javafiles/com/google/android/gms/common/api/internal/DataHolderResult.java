// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.*;
import com.google.android.gms.common.data.DataHolder;

public class DataHolderResult
	implements Releasable, Result
{

	protected DataHolderResult(DataHolder dataholder)
	{
		this(dataholder, new Status(dataholder.getStatusCode()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #17  <Class Status>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:invokevirtual   #23  <Method int DataHolder.getStatusCode()>
	//    6   10:invokespecial   #26  <Method void Status(int)>
	//    7   13:invokespecial   #29  <Method void DataHolderResult(DataHolder, Status)>
	//    8   16:return          
	}

	protected DataHolderResult(DataHolder dataholder, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		mStatus = status;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #36  <Field Status mStatus>
		mDataHolder = dataholder;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #38  <Field DataHolder mDataHolder>
	//    8   14:return          
	}

	public Status getStatus()
	{
		return mStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Status mStatus>
	//    2    4:areturn         
	}

	public void release()
	{
		DataHolder dataholder = mDataHolder;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field DataHolder mDataHolder>
	//    2    4:astore_1        
		if(dataholder != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			dataholder.close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #44  <Method void DataHolder.close()>
	//    7   13:return          
	}

	protected final DataHolder mDataHolder;
	protected final Status mStatus;
}
