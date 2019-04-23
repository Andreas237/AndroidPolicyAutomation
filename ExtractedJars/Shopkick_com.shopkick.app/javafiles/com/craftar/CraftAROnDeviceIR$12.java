// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.util.ArrayList;

// Referenced classes of package com.craftar:
//			CraftAROnDeviceIR, CraftARSearchResponseHandler, CLog

class CraftAROnDeviceIR$12
	implements Runnable
{

	public void run()
	{
		if(mResponseHandler != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field CraftAROnDeviceIR this$0>
	//*   2    4:getfield        #38  <Field CraftARSearchResponseHandler CraftAROnDeviceIR.mResponseHandler>
	//*   3    7:ifnull          35
		{
			mResponseHandler.searchResults(val$searchResults, val$ellapsedTime, val$requestCode);
	//    4   10:aload_0         
	//    5   11:getfield        #23  <Field CraftAROnDeviceIR this$0>
	//    6   14:getfield        #38  <Field CraftARSearchResponseHandler CraftAROnDeviceIR.mResponseHandler>
	//    7   17:aload_0         
	//    8   18:getfield        #25  <Field ArrayList val$searchResults>
	//    9   21:aload_0         
	//   10   22:getfield        #27  <Field long val$ellapsedTime>
	//   11   25:aload_0         
	//   12   26:getfield        #29  <Field int val$requestCode>
	//   13   29:invokeinterface #44  <Method void CraftARSearchResponseHandler.searchResults(ArrayList, long, int)>
			return;
	//   14   34:return          
		} else
		{
			CLog.w("Search results came back but there is no handler to receive them");
	//   15   35:ldc1            #46  <String "Search results came back but there is no handler to receive them">
	//   16   37:invokestatic    #52  <Method void CLog.w(String)>
			return;
	//   17   40:return          
		}
	}

	final CraftAROnDeviceIR this$0;
	final long val$ellapsedTime;
	final int val$requestCode;
	final ArrayList val$searchResults;

	CraftAROnDeviceIR$12()
	{
		this$0 = final_craftarondeviceir;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field CraftAROnDeviceIR this$0>
		val$searchResults = arraylist;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field ArrayList val$searchResults>
		val$ellapsedTime = l;
	//    6   10:aload_0         
	//    7   11:lload_3         
	//    8   12:putfield        #27  <Field long val$ellapsedTime>
		val$requestCode = I.this;
	//    9   15:aload_0         
	//   10   16:iload           5
	//   11   18:putfield        #29  <Field int val$requestCode>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
