// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class RadarUserInsightsState
{
	public static final class Companion
	{

		public final RadarUserInsightsState fromJson(JSONObject jsonobject)
			throws JSONException
		{
			Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "obj");
		//    0    0:aload_1         
		//    1    1:ldc1            #40  <String "obj">
		//    2    3:invokestatic    #46  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			return new RadarUserInsightsState(jsonobject.optBoolean("home"), jsonobject.optBoolean("office"), jsonobject.optBoolean("traveling"));
		//    3    6:new             #6   <Class RadarUserInsightsState>
		//    4    9:dup             
		//    5   10:aload_1         
		//    6   11:ldc1            #48  <String "home">
		//    7   13:invokevirtual   #54  <Method boolean JSONObject.optBoolean(String)>
		//    8   16:aload_1         
		//    9   17:ldc1            #56  <String "office">
		//   10   19:invokevirtual   #54  <Method boolean JSONObject.optBoolean(String)>
		//   11   22:aload_1         
		//   12   23:ldc1            #58  <String "traveling">
		//   13   25:invokevirtual   #54  <Method boolean JSONObject.optBoolean(String)>
		//   14   28:invokespecial   #61  <Method void RadarUserInsightsState(boolean, boolean, boolean)>
		//   15   31:areturn         
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
		//    1    1:invokespecial   #35  <Method void RadarUserInsightsState$Companion()>
		//    2    4:return          
		}
	}


	public RadarUserInsightsState(boolean flag, boolean flag1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		home = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #51  <Field boolean home>
		office = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #53  <Field boolean office>
		traveling = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #55  <Field boolean traveling>
	//   11   19:return          
	}

	public final boolean getHome()
	{
		return home;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field boolean home>
	//    2    4:ireturn         
	}

	public final boolean getOffice()
	{
		return office;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field boolean office>
	//    2    4:ireturn         
	}

	public final boolean getTraveling()
	{
		return traveling;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field boolean traveling>
	//    2    4:ireturn         
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	private static final String FIELD_HOME = "home";
	private static final String FIELD_OFFICE = "office";
	private static final String FIELD_TRAVELING = "traveling";
	private final boolean home;
	private final boolean office;
	private final boolean traveling;

	static 
	{
	//    0    0:new             #6   <Class RadarUserInsightsState$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #44  <Method void RadarUserInsightsState$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #46  <Field RadarUserInsightsState$Companion Companion>
	//*   5   11:return          
	}
}
