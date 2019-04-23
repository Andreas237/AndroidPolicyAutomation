// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class RadarChain
{
	public static final class Companion
	{

		public final RadarChain fromJson(JSONObject jsonobject)
			throws JSONException
		{
			Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "obj");
		//    0    0:aload_1         
		//    1    1:ldc1            #40  <String "obj">
		//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			String s = jsonobject.optString("slug");
		//    3    6:aload_1         
		//    4    7:ldc1            #48  <String "slug">
		//    5    9:invokevirtual   #54  <Method String JSONObject.optString(String)>
		//    6   12:astore_2        
			String s1 = jsonobject.optString("name");
		//    7   13:aload_1         
		//    8   14:ldc1            #56  <String "name">
		//    9   16:invokevirtual   #54  <Method String JSONObject.optString(String)>
		//   10   19:astore_3        
			jsonobject = ((JSONObject) (jsonobject.optString("externalId", ((String) (null)))));
		//   11   20:aload_1         
		//   12   21:ldc1            #58  <String "externalId">
		//   13   23:aconst_null     
		//   14   24:invokevirtual   #61  <Method String JSONObject.optString(String, String)>
		//   15   27:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "slug");
		//   16   28:aload_2         
		//   17   29:ldc1            #48  <String "slug">
		//   18   31:invokestatic    #64  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s1)), "name");
		//   19   34:aload_3         
		//   20   35:ldc1            #56  <String "name">
		//   21   37:invokestatic    #64  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return new RadarChain(s, s1, ((String) (jsonobject)));
		//   22   40:new             #6   <Class RadarChain>
		//   23   43:dup             
		//   24   44:aload_2         
		//   25   45:aload_3         
		//   26   46:aload_1         
		//   27   47:invokespecial   #67  <Method void RadarChain(String, String, String)>
		//   28   50:areturn         
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #32  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void RadarChain$Companion()>
		//    2    4:return          
		}
	}


	public RadarChain(String s, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "slug");
	//    0    0:aload_1         
	//    1    1:ldc1            #37  <String "slug">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "name");
	//    3    6:aload_2         
	//    4    7:ldc1            #35  <String "name">
	//    5    9:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//    6   12:aload_0         
	//    7   13:invokespecial   #56  <Method void Object()>
		slug = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #58  <Field String slug>
		name = s1;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #60  <Field String name>
		externalId = s2;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #62  <Field String externalId>
	//   17   31:return          
	}

	public final String getExternalId()
	{
		return externalId;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field String externalId>
	//    2    4:areturn         
	}

	public final String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String name>
	//    2    4:areturn         
	}

	public final String getSlug()
	{
		return slug;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field String slug>
	//    2    4:areturn         
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	private static final String FIELD_EXTERNAL_ID = "externalId";
	private static final String FIELD_NAME = "name";
	private static final String FIELD_SLUG = "slug";
	private final String externalId;
	private final String name;
	private final String slug;

	static 
	{
	//    0    0:new             #6   <Class RadarChain$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #45  <Method void RadarChain$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #47  <Field RadarChain$Companion Companion>
	//*   5   11:return          
	}
}
