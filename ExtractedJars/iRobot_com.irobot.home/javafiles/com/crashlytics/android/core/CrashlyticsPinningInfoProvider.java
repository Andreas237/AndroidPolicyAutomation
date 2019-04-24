// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.e.g;
import java.io.InputStream;

// Referenced classes of package com.crashlytics.android.core:
//			PinningInfoProvider

class CrashlyticsPinningInfoProvider
	implements g
{

	public CrashlyticsPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		pinningInfo = pinninginfoprovider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field PinningInfoProvider pinningInfo>
	//    5    9:return          
	}

	public String getKeyStorePassword()
	{
		return pinningInfo.getKeyStorePassword();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PinningInfoProvider pinningInfo>
	//    2    4:invokeinterface #22  <Method String PinningInfoProvider.getKeyStorePassword()>
	//    3    9:areturn         
	}

	public InputStream getKeyStoreStream()
	{
		return pinningInfo.getKeyStoreStream();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PinningInfoProvider pinningInfo>
	//    2    4:invokeinterface #26  <Method InputStream PinningInfoProvider.getKeyStoreStream()>
	//    3    9:areturn         
	}

	public long getPinCreationTimeInMillis()
	{
		return -1L;
	//    0    0:ldc2w           #29  <Long -1L>
	//    1    3:lreturn         
	}

	public String[] getPins()
	{
		return pinningInfo.getPins();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PinningInfoProvider pinningInfo>
	//    2    4:invokeinterface #34  <Method String[] PinningInfoProvider.getPins()>
	//    3    9:areturn         
	}

	private final PinningInfoProvider pinningInfo;
}
