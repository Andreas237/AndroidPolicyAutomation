// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.model:
//			RadarUserInsightsState

public static final class RadarUserInsightsState$Companion
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

	private RadarUserInsightsState$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public RadarUserInsightsState$Companion(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void RadarUserInsightsState$Companion()>
	//    2    4:return          
	}
}
