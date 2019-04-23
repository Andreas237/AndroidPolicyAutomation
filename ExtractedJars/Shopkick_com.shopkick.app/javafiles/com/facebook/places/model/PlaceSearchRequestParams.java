// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.model;

import java.util.HashSet;
import java.util.Set;

public final class PlaceSearchRequestParams
{
	public static class Builder
	{

		public Builder addCategory(String s)
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

		public Builder addField(String s)
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
			return new PlaceSearchRequestParams(this);
		//    0    0:new             #6   <Class PlaceSearchRequestParams>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #56  <Method void PlaceSearchRequestParams(PlaceSearchRequestParams$Builder, PlaceSearchRequestParams$1)>
		//    5    9:areturn         
		}

		public Builder setDistance(int i)
		{
			distance = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #32  <Field int distance>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setLimit(int i)
		{
			limit = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #35  <Field int limit>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setSearchText(String s)
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
		static int access$000(Builder builder)
		{
			return builder.distance;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field int distance>
		//    2    4:ireturn         
		}

*/


/*
		static int access$100(Builder builder)
		{
			return builder.limit;
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field int limit>
		//    2    4:ireturn         
		}

*/


/*
		static String access$200(Builder builder)
		{
			return builder.searchText;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field String searchText>
		//    2    4:areturn         
		}

*/


/*
		static Set access$300(Builder builder)
		{
			return builder.categories;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Set categories>
		//    2    4:areturn         
		}

*/


/*
		static Set access$400(Builder builder)
		{
			return builder.fields;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field Set fields>
		//    2    4:areturn         
		}

*/

		public Builder()
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


	private PlaceSearchRequestParams(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		categories = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #25  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void HashSet()>
	//    6   12:putfield        #28  <Field Set categories>
		fields = ((Set) (new HashSet()));
	//    7   15:aload_0         
	//    8   16:new             #25  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #26  <Method void HashSet()>
	//   11   23:putfield        #30  <Field Set fields>
		distance = builder.distance;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokestatic    #34  <Method int PlaceSearchRequestParams$Builder.access$000(PlaceSearchRequestParams$Builder)>
	//   15   31:putfield        #36  <Field int distance>
		limit = builder.limit;
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokestatic    #39  <Method int PlaceSearchRequestParams$Builder.access$100(PlaceSearchRequestParams$Builder)>
	//   19   39:putfield        #41  <Field int limit>
		searchText = builder.searchText;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:invokestatic    #45  <Method String PlaceSearchRequestParams$Builder.access$200(PlaceSearchRequestParams$Builder)>
	//   23   47:putfield        #47  <Field String searchText>
		categories.addAll(((java.util.Collection) (builder.categories)));
	//   24   50:aload_0         
	//   25   51:getfield        #28  <Field Set categories>
	//   26   54:aload_1         
	//   27   55:invokestatic    #51  <Method Set PlaceSearchRequestParams$Builder.access$300(PlaceSearchRequestParams$Builder)>
	//   28   58:invokeinterface #57  <Method boolean Set.addAll(java.util.Collection)>
	//   29   63:pop             
		fields.addAll(((java.util.Collection) (builder.fields)));
	//   30   64:aload_0         
	//   31   65:getfield        #30  <Field Set fields>
	//   32   68:aload_1         
	//   33   69:invokestatic    #60  <Method Set PlaceSearchRequestParams$Builder.access$400(PlaceSearchRequestParams$Builder)>
	//   34   72:invokeinterface #57  <Method boolean Set.addAll(java.util.Collection)>
	//   35   77:pop             
	//   36   78:return          
	}


	public Set getCategories()
	{
		return categories;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Set categories>
	//    2    4:areturn         
	}

	public int getDistance()
	{
		return distance;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int distance>
	//    2    4:ireturn         
	}

	public Set getFields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Set fields>
	//    2    4:areturn         
	}

	public int getLimit()
	{
		return limit;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int limit>
	//    2    4:ireturn         
	}

	public String getSearchText()
	{
		return searchText;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String searchText>
	//    2    4:areturn         
	}

	private final Set categories;
	private final int distance;
	private final Set fields;
	private final int limit;
	private final String searchText;
}
