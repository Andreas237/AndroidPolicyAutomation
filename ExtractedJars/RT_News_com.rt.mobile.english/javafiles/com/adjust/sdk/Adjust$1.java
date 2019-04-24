// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.content.Context;
import android.os.AsyncTask;

// Referenced classes of package com.adjust.sdk:
//			Adjust, AdjustFactory, Util, ILogger, 
//			OnDeviceIdsRead

static final class Adjust$1 extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Context[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #24  <Class Context[]>
	//    3    5:invokevirtual   #27  <Method String doInBackground(Context[])>
	//    4    8:areturn         
	}

	protected transient String doInBackground(Context acontext[])
	{
		ILogger ilogger = AdjustFactory.getLogger();
	//    0    0:invokestatic    #33  <Method ILogger AdjustFactory.getLogger()>
	//    1    3:astore_2        
		acontext = ((Context []) (Util.getPlayAdId(acontext[0])));
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:aaload          
	//    5    7:invokestatic    #39  <Method String Util.getPlayAdId(Context)>
	//    6   10:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   11:new             #41  <Class StringBuilder>
	//    8   14:dup             
	//    9   15:invokespecial   #42  <Method void StringBuilder()>
	//   10   18:astore_3        
		stringbuilder.append("GoogleAdId read ");
	//   11   19:aload_3         
	//   12   20:ldc1            #44  <String "GoogleAdId read ">
	//   13   22:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   14   25:pop             
		stringbuilder.append(((String) (acontext)));
	//   15   26:aload_3         
	//   16   27:aload_1         
	//   17   28:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   18   31:pop             
		ilogger.debug(stringbuilder.toString(), new Object[0]);
	//   19   32:aload_2         
	//   20   33:aload_3         
	//   21   34:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   22   37:iconst_0        
	//   23   38:anewarray       Object[]
	//   24   41:invokeinterface #60  <Method void ILogger.debug(String, Object[])>
		return ((String) (acontext));
	//   25   46:aload_1         
	//   26   47:areturn         
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #64  <Class String>
	//    3    5:invokevirtual   #67  <Method void onPostExecute(String)>
	//    4    8:return          
	}

	protected void onPostExecute(String s)
	{
		AdjustFactory.getLogger();
	//    0    0:invokestatic    #33  <Method ILogger AdjustFactory.getLogger()>
	//    1    3:pop             
		val$onDeviceIdRead.onGoogleAdIdRead(s);
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field OnDeviceIdsRead val$onDeviceIdRead>
	//    4    8:aload_1         
	//    5    9:invokeinterface #72  <Method void OnDeviceIdsRead.onGoogleAdIdRead(String)>
	//    6   14:return          
	}

	final OnDeviceIdsRead val$onDeviceIdRead;

	Adjust$1(OnDeviceIdsRead ondeviceidsread)
	{
		val$onDeviceIdRead = ondeviceidsread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field OnDeviceIdsRead val$onDeviceIdRead>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void AsyncTask()>
	//    5    9:return          
	}
}
