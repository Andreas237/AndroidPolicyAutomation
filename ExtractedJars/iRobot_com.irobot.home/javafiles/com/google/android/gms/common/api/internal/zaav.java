// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabd, zabe, zaaw

public final class zaav
	implements zabd
{

	public zaav(zabe zabe1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zafs = zabe1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zabe zafs>
	//    5    9:return          
	}

	public final void begin()
	{
		for(Iterator iterator = zafs.zagy.values().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.Client)iterator.next()).disconnect());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zabe zafs>
	//    2    4:getfield        #23  <Field Map zabe.zagy>
	//    3    7:invokeinterface #29  <Method Collection Map.values()>
	//    4   12:invokeinterface #35  <Method Iterator Collection.iterator()>
	//    5   17:astore_1        
	//    6   18:aload_1         
	//    7   19:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//    8   24:ifeq            44
	//    9   27:aload_1         
	//   10   28:invokeinterface #45  <Method Object Iterator.next()>
	//   11   33:checkcast       #47  <Class com.google.android.gms.common.api.Api$Client>
	//   12   36:invokeinterface #50  <Method void com.google.android.gms.common.api.Api$Client.disconnect()>
	//*  13   41:goto            18
		zafs.zaed.zagz = Collections.emptySet();
	//   14   44:aload_0         
	//   15   45:getfield        #15  <Field zabe zafs>
	//   16   48:getfield        #54  <Field zaaw zabe.zaed>
	//   17   51:invokestatic    #60  <Method java.util.Set Collections.emptySet()>
	//   18   54:putfield        #66  <Field java.util.Set zaaw.zagz>
	//   19   57:return          
	}

	public final void connect()
	{
		zafs.zaaz();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zabe zafs>
	//    2    4:invokevirtual   #70  <Method void zabe.zaaz()>
	//    3    7:return          
	}

	public final boolean disconnect()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		zafs.zaed.zafb.add(((Object) (apimethodimpl)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zabe zafs>
	//    2    4:getfield        #54  <Field zaaw zabe.zaed>
	//    3    7:getfield        #76  <Field Queue zaaw.zafb>
	//    4   10:aload_1         
	//    5   11:invokeinterface #82  <Method boolean Queue.add(Object)>
	//    6   16:pop             
		return apimethodimpl;
	//    7   17:aload_1         
	//    8   18:areturn         
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		throw new IllegalStateException("GoogleApiClient is not connected yet.");
	//    0    0:new             #87  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #89  <String "GoogleApiClient is not connected yet.">
	//    3    6:invokespecial   #92  <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public final void onConnected(Bundle bundle)
	{
	//    0    0:return          
	}

	public final void onConnectionSuspended(int i)
	{
	//    0    0:return          
	}

	public final void zaa(ConnectionResult connectionresult, Api api, boolean flag)
	{
	//    0    0:return          
	}

	private final zabe zafs;
}
