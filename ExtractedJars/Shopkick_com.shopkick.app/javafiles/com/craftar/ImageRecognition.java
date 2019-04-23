// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;


// Referenced classes of package com.craftar:
//			CraftARSearchResponseHandler, CraftARQueryImage

public abstract class ImageRecognition
{

	public ImageRecognition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public CraftARSearchResponseHandler getCraftARSearchResponseHandler()
	{
		return mResponseHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field CraftARSearchResponseHandler mResponseHandler>
	//    2    4:areturn         
	}

	public abstract int getPendingSearchRequestsCount();

	public abstract void search(CraftARQueryImage craftarqueryimage);

	public abstract void search(CraftARQueryImage craftarqueryimage, int i);

	public void setCraftARSearchResponseHandler(CraftARSearchResponseHandler craftarsearchresponsehandler)
	{
		mResponseHandler = craftarsearchresponsehandler;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CraftARSearchResponseHandler mResponseHandler>
	//    3    5:return          
	}

	CraftARSearchResponseHandler mResponseHandler;
}
