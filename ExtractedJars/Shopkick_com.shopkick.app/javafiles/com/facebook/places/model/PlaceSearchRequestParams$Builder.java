// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.model;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.facebook.places.model:
//			PlaceSearchRequestParams

public static class PlaceSearchRequestParams$Builder
{

	public PlaceSearchRequestParams$Builder addCategory(String s)
	{
		categories.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Set categories>
	//    2    4:aload_1         
	//    3    5:invokeinterface #50  <Method boolean Set.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public PlaceSearchRequestParams$Builder addField(String s)
	{
		fields.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Set fields>
	//    2    4:aload_1         
	//    3    5:invokeinterface #50  <Method boolean Set.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public PlaceSearchRequestParams build()
	{
		return new PlaceSearchRequestParams(this, ((PlaceSearchRequestParams._cls1) (null)));
	//    0    0:new             #6   <Class PlaceSearchRequestParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #56  <Method void PlaceSearchRequestParams(PlaceSearchRequestParams$Builder, PlaceSearchRequestParams$1)>
	//    5    9:areturn         
	}

	public PlaceSearchRequestParams$Builder setDistance(int i)
	{
		distance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int distance>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PlaceSearchRequestParams$Builder setLimit(int i)
	{
		limit = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int limit>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public PlaceSearchRequestParams$Builder setSearchText(String s)
	{
		searchText = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String searchText>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private final Set categories = new HashSet();
	private int distance;
	private final Set fields = new HashSet();
	private int limit;
	private String searchText;


/*
	static int access$000(PlaceSearchRequestParams$Builder placesearchrequestparams$builder)
	{
		return placesearchrequestparams$builder.distance;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int distance>
	//    2    4:ireturn         
	}

*/


/*
	static int access$100(PlaceSearchRequestParams$Builder placesearchrequestparams$builder)
	{
		return placesearchrequestparams$builder.limit;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int limit>
	//    2    4:ireturn         
	}

*/


/*
	static String access$200(PlaceSearchRequestParams$Builder placesearchrequestparams$builder)
	{
		return placesearchrequestparams$builder.searchText;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String searchText>
	//    2    4:areturn         
	}

*/


/*
	static Set access$300(PlaceSearchRequestParams$Builder placesearchrequestparams$builder)
	{
		return placesearchrequestparams$builder.categories;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Set categories>
	//    2    4:areturn         
	}

*/


/*
	static Set access$400(PlaceSearchRequestParams$Builder placesearchrequestparams$builder)
	{
		return placesearchrequestparams$builder.fields;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Set fields>
	//    2    4:areturn         
	}

*/

	public PlaceSearchRequestParams$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void HashSet()>
	//    6   12:putfield        #25  <Field Set categories>
	//    7   15:aload_0         
	//    8   16:new             #22  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #23  <Method void HashSet()>
	//   11   23:putfield        #27  <Field Set fields>
	//   12   26:return          
	}
}
