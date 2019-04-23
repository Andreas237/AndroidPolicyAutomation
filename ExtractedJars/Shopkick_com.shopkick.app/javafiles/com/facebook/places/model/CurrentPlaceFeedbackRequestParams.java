// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.model;


public class CurrentPlaceFeedbackRequestParams
{
	public static class Builder
	{

		public CurrentPlaceFeedbackRequestParams build()
		{
			return new CurrentPlaceFeedbackRequestParams(this);
		//    0    0:new             #6   <Class CurrentPlaceFeedbackRequestParams>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #33  <Method void CurrentPlaceFeedbackRequestParams(CurrentPlaceFeedbackRequestParams$Builder, CurrentPlaceFeedbackRequestParams$1)>
		//    5    9:areturn         
		}

		public Builder setPlaceId(String s)
		{
			placeId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #24  <Field String placeId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setTracking(String s)
		{
			tracking = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field String tracking>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setWasHere(boolean flag)
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
		static String access$000(Builder builder)
		{
			return builder.tracking;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String tracking>
		//    2    4:areturn         
		}

*/


/*
		static String access$100(Builder builder)
		{
			return builder.placeId;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field String placeId>
		//    2    4:areturn         
		}

*/


/*
		static Boolean access$200(Builder builder)
		{
			return builder.wasHere;
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field Boolean wasHere>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	private CurrentPlaceFeedbackRequestParams(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		tracking = builder.tracking;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #23  <Method String CurrentPlaceFeedbackRequestParams$Builder.access$000(CurrentPlaceFeedbackRequestParams$Builder)>
	//    5    9:putfield        #25  <Field String tracking>
		placeId = builder.placeId;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #28  <Method String CurrentPlaceFeedbackRequestParams$Builder.access$100(CurrentPlaceFeedbackRequestParams$Builder)>
	//    9   17:putfield        #30  <Field String placeId>
		wasHere = builder.wasHere;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #34  <Method Boolean CurrentPlaceFeedbackRequestParams$Builder.access$200(CurrentPlaceFeedbackRequestParams$Builder)>
	//   13   25:putfield        #36  <Field Boolean wasHere>
	//   14   28:return          
	}


	public String getPlaceId()
	{
		return placeId;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String placeId>
	//    2    4:areturn         
	}

	public String getTracking()
	{
		return tracking;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String tracking>
	//    2    4:areturn         
	}

	public Boolean wasHere()
	{
		return wasHere;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Boolean wasHere>
	//    2    4:areturn         
	}

	private final String placeId;
	private final String tracking;
	private final Boolean wasHere;
}
