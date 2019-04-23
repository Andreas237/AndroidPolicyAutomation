// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.model;

import android.location.Location;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.facebook.places.model:
//			CurrentPlaceRequestParams

public static class CurrentPlaceRequestParams$Builder
{

	public CurrentPlaceRequestParams$Builder addField(String s)
	{
		fields.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Set fields>
	//    2    4:aload_1         
	//    3    5:invokeinterface #59  <Method boolean Set.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public CurrentPlaceRequestParams build()
	{
		return new CurrentPlaceRequestParams(this, ((CurrentPlaceRequestParams._cls1) (null)));
	//    0    0:new             #6   <Class CurrentPlaceRequestParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #64  <Method void CurrentPlaceRequestParams(CurrentPlaceRequestParams$Builder, CurrentPlaceRequestParams$1)>
	//    5    9:areturn         
	}

	public CurrentPlaceRequestParams$Builder setLimit(int i)
	{
		limit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #49  <Field int limit>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CurrentPlaceRequestParams$Builder setLocation(Location location1)
	{
		location = location1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field Location location>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CurrentPlaceRequestParams$Builder setMinConfidenceLevel(ceLevel celevel)
	{
		minConfidenceLevel = celevel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field CurrentPlaceRequestParams$ConfidenceLevel minConfidenceLevel>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public CurrentPlaceRequestParams$Builder setScanMode( )
	{
		scanMode = ;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field CurrentPlaceRequestParams$ScanMode scanMode>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private final Set fields = new HashSet();
	private int limit;
	private Location location;
	private ceLevel minConfidenceLevel;
	private  scanMode;


/*
	static Location access$000(CurrentPlaceRequestParams$Builder currentplacerequestparams$builder)
	{
		return currentplacerequestparams$builder.location;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Location location>
	//    2    4:areturn         
	}

*/


/*
	static  access$100(CurrentPlaceRequestParams$Builder currentplacerequestparams$builder)
	{
		return currentplacerequestparams$builder.scanMode;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field CurrentPlaceRequestParams$ScanMode scanMode>
	//    2    4:areturn         
	}

*/


/*
	static ceLevel access$200(CurrentPlaceRequestParams$Builder currentplacerequestparams$builder)
	{
		return currentplacerequestparams$builder.minConfidenceLevel;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field CurrentPlaceRequestParams$ConfidenceLevel minConfidenceLevel>
	//    2    4:areturn         
	}

*/


/*
	static int access$300(CurrentPlaceRequestParams$Builder currentplacerequestparams$builder)
	{
		return currentplacerequestparams$builder.limit;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int limit>
	//    2    4:ireturn         
	}

*/


/*
	static Set access$400(CurrentPlaceRequestParams$Builder currentplacerequestparams$builder)
	{
		return currentplacerequestparams$builder.fields;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Set fields>
	//    2    4:areturn         
	}

*/

	public CurrentPlaceRequestParams$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		scanMode = .HIGH_ACCURACY;
	//    2    4:aload_0         
	//    3    5:getstatic       #27  <Field CurrentPlaceRequestParams$ScanMode CurrentPlaceRequestParams$ScanMode.HIGH_ACCURACY>
	//    4    8:putfield        #29  <Field CurrentPlaceRequestParams$ScanMode scanMode>
	//    5   11:aload_0         
	//    6   12:new             #31  <Class HashSet>
	//    7   15:dup             
	//    8   16:invokespecial   #32  <Method void HashSet()>
	//    9   19:putfield        #34  <Field Set fields>
	//   10   22:return          
	}
}
