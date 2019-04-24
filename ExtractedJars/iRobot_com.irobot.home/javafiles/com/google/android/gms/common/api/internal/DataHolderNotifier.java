// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.data.DataHolder;

public abstract class DataHolderNotifier
	implements ListenerHolder.Notifier
{

	protected DataHolderNotifier(DataHolder dataholder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		mDataHolder = dataholder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field DataHolder mDataHolder>
	//    5    9:return          
	}

	public final void notifyListener(Object obj)
	{
		notifyListener(obj, mDataHolder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #17  <Field DataHolder mDataHolder>
	//    4    6:invokevirtual   #24  <Method void notifyListener(Object, DataHolder)>
	//    5    9:return          
	}

	protected abstract void notifyListener(Object obj, DataHolder dataholder);

	public void onNotifyListenerFailed()
	{
		if(mDataHolder != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field DataHolder mDataHolder>
	//*   2    4:ifnull          14
			mDataHolder.close();
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field DataHolder mDataHolder>
	//    5   11:invokevirtual   #32  <Method void DataHolder.close()>
	//    6   14:return          
	}

	private final DataHolder mDataHolder;
}
