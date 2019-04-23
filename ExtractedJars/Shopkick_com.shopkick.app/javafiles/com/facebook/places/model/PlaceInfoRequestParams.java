// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.places.model;

import java.util.HashSet;
import java.util.Set;

public final class PlaceInfoRequestParams
{
	public static class Builder
	{

		public Builder addField(String s)
		{
			fields.add(((Object) (s)));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Set fields>
		//    2    4:aload_1         
		//    3    5:invokeinterface #36  <Method boolean Set.add(Object)>
		//    4   10:pop             
			return this;
		//    5   11:aload_0         
		//    6   12:areturn         
		}

		public Builder addFields(String as[])
		{
			int j = as.length;
		//    0    0:aload_1         
		//    1    1:arraylength     
		//    2    2:istore_3        
			for(int i = 0; i < j; i++)
		//*   3    3:iconst_0        
		//*   4    4:istore_2        
		//*   5    5:iload_2         
		//*   6    6:iload_3         
		//*   7    7:icmpge          34
			{
				String s = as[i];
		//    8   10:aload_1         
		//    9   11:iload_2         
		//   10   12:aaload          
		//   11   13:astore          4
				fields.add(((Object) (s)));
		//   12   15:aload_0         
		//   13   16:getfield        #21  <Field Set fields>
		//   14   19:aload           4
		//   15   21:invokeinterface #36  <Method boolean Set.add(Object)>
		//   16   26:pop             
			}

		//   17   27:iload_2         
		//   18   28:iconst_1        
		//   19   29:iadd            
		//   20   30:istore_2        
		//*  21   31:goto            5
			return this;
		//   22   34:aload_0         
		//   23   35:areturn         
		}

		public PlaceInfoRequestParams build()
		{
			return new PlaceInfoRequestParams(this);
		//    0    0:new             #6   <Class PlaceInfoRequestParams>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #43  <Method void PlaceInfoRequestParams(PlaceInfoRequestParams$Builder, PlaceInfoRequestParams$1)>
		//    5    9:areturn         
		}

		public Builder setPlaceId(String s)
		{
			placeId = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #26  <Field String placeId>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private final Set fields = new HashSet();
		private String placeId;


/*
		static String access$000(Builder builder)
		{
			return builder.placeId;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field String placeId>
		//    2    4:areturn         
		}

*/


/*
		static Set access$100(Builder builder)
		{
			return builder.fields;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Set fields>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #18  <Class HashSet>
		//    4    8:dup             
		//    5    9:invokespecial   #19  <Method void HashSet()>
		//    6   12:putfield        #21  <Field Set fields>
		//    7   15:return          
		}
	}


	private PlaceInfoRequestParams(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		fields = ((Set) (new HashSet()));
	//    2    4:aload_0         
	//    3    5:new             #21  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void HashSet()>
	//    6   12:putfield        #24  <Field Set fields>
		placeId = builder.placeId;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokestatic    #28  <Method String PlaceInfoRequestParams$Builder.access$000(PlaceInfoRequestParams$Builder)>
	//   10   20:putfield        #30  <Field String placeId>
		fields.addAll(((java.util.Collection) (builder.fields)));
	//   11   23:aload_0         
	//   12   24:getfield        #24  <Field Set fields>
	//   13   27:aload_1         
	//   14   28:invokestatic    #34  <Method Set PlaceInfoRequestParams$Builder.access$100(PlaceInfoRequestParams$Builder)>
	//   15   31:invokeinterface #40  <Method boolean Set.addAll(java.util.Collection)>
	//   16   36:pop             
	//   17   37:return          
	}


	public Set getFields()
	{
		return fields;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Set fields>
	//    2    4:areturn         
	}

	public String getPlaceId()
	{
		return placeId;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String placeId>
	//    2    4:areturn         
	}

	private final Set fields;
	private final String placeId;
}
