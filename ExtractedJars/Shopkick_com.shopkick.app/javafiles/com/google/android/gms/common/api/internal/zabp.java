// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApi;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zaag, zacm

public final class zabp extends zaag
{

	public zabp(GoogleApi googleapi)
	{
		super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <String "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.">
	//    2    3:invokespecial   #15  <Method void zaag(String)>
		zajg = googleapi;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #17  <Field GoogleApi zajg>
	//    6   11:return          
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		return zajg.doRead(apimethodimpl);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GoogleApi zajg>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method BaseImplementation$ApiMethodImpl GoogleApi.doRead(BaseImplementation$ApiMethodImpl)>
	//    4    8:areturn         
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		return zajg.doWrite(apimethodimpl);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GoogleApi zajg>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method BaseImplementation$ApiMethodImpl GoogleApi.doWrite(BaseImplementation$ApiMethodImpl)>
	//    4    8:areturn         
	}

	public final Context getContext()
	{
		return zajg.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GoogleApi zajg>
	//    2    4:invokevirtual   #40  <Method Context GoogleApi.getApplicationContext()>
	//    3    7:areturn         
	}

	public final Looper getLooper()
	{
		return zajg.getLooper();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field GoogleApi zajg>
	//    2    4:invokevirtual   #44  <Method Looper GoogleApi.getLooper()>
	//    3    7:areturn         
	}

	public final void zaa(zacm zacm)
	{
	//    0    0:return          
	}

	public final void zab(zacm zacm)
	{
	//    0    0:return          
	}

	private final GoogleApi zajg;
}
