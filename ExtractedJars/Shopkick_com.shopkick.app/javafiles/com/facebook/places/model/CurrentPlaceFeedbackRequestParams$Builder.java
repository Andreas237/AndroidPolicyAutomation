// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.model;


// Referenced classes of package com.facebook.places.model:
//			CurrentPlaceFeedbackRequestParams

public static class CurrentPlaceFeedbackRequestParams$Builder
{

	public CurrentPlaceFeedbackRequestParams build()
	{
		return new CurrentPlaceFeedbackRequestParams(this, ((CurrentPlaceFeedbackRequestParams._cls1) (null)));
	//    0    0:new             #6   <Class CurrentPlaceFeedbackRequestParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #33  <Method void CurrentPlaceFeedbackRequestParams(CurrentPlaceFeedbackRequestParams$Builder, CurrentPlaceFeedbackRequestParams$1)>
	//    5    9:areturn         
	}

	public CurrentPlaceFeedbackRequestParams$Builder setPlaceId(String s)
	{
		placeId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field String placeId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CurrentPlaceFeedbackRequestParams$Builder setTracking(String s)
	{
		tracking = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field String tracking>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CurrentPlaceFeedbackRequestParams$Builder setWasHere(boolean flag)
	{
		wasHere = Boolean.valueOf(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #44  <Method Boolean Boolean.valueOf(boolean)>
	//    3    5:putfield        #28  <Field Boolean wasHere>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private String placeId;
	private String tracking;
	private Boolean wasHere;


/*
	static String access$000(CurrentPlaceFeedbackRequestParams$Builder currentplacefeedbackrequestparams$builder)
	{
		return currentplacefeedbackrequestparams$builder.tracking;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String tracking>
	//    2    4:areturn         
	}

*/


/*
	static String access$100(CurrentPlaceFeedbackRequestParams$Builder currentplacefeedbackrequestparams$builder)
	{
		return currentplacefeedbackrequestparams$builder.placeId;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field String placeId>
	//    2    4:areturn         
	}

*/


/*
	static Boolean access$200(CurrentPlaceFeedbackRequestParams$Builder currentplacefeedbackrequestparams$builder)
	{
		return currentplacefeedbackrequestparams$builder.wasHere;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Boolean wasHere>
	//    2    4:areturn         
	}

*/

	public CurrentPlaceFeedbackRequestParams$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
