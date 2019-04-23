// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import java.text.ParseException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.*;

// Referenced classes of package io.radar.sdk.model:
//			RadarUserInsightsLocation, RadarUserInsightsState

public final class RadarUserInsights
{
	public static final class Companion
	{

		public final RadarUserInsights fromJson(JSONObject jsonobject)
			throws JSONException, ParseException
		{
			Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "obj");
		//    0    0:aload_1         
		//    1    1:ldc1            #41  <String "obj">
		//    2    3:invokestatic    #47  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			RadarUserInsightsLocation radaruserinsightslocation = (RadarUserInsightsLocation)null;
		//    3    6:aconst_null     
		//    4    7:checkcast       #49  <Class RadarUserInsightsLocation>
		//    5   10:astore          4
			JSONArray jsonarray = jsonobject.optJSONArray("locations");
		//    6   12:aload_1         
		//    7   13:ldc1            #51  <String "locations">
		//    8   15:invokevirtual   #57  <Method JSONArray JSONObject.optJSONArray(String)>
		//    9   18:astore          8
			RadarUserInsightsLocation radaruserinsightslocation2;
			Object obj;
			if(jsonarray != null)
		//*  10   20:aload           8
		//*  11   22:ifnull          141
			{
				int i = 0;
		//   12   25:iconst_0        
		//   13   26:istore_2        
				int j = jsonarray.length();
		//   14   27:aload           8
		//   15   29:invokevirtual   #63  <Method int JSONArray.length()>
		//   16   32:istore_3        
				RadarUserInsightsLocation radaruserinsightslocation1 = radaruserinsightslocation;
		//   17   33:aload           4
		//   18   35:astore          5
				do
				{
					obj = ((Object) (radaruserinsightslocation));
		//   19   37:aload           4
		//   20   39:astore          7
					radaruserinsightslocation2 = radaruserinsightslocation1;
		//   21   41:aload           5
		//   22   43:astore          6
					if(i >= j)
						break;
		//   23   45:iload_2         
		//   24   46:iload_3         
		//   25   47:icmpge          149
					radaruserinsightslocation2 = RadarUserInsightsLocation.Companion.fromJson(jsonarray.optJSONObject(i));
		//   26   50:getstatic       #66  <Field RadarUserInsightsLocation$Companion RadarUserInsightsLocation.Companion>
		//   27   53:aload           8
		//   28   55:iload_2         
		//   29   56:invokevirtual   #70  <Method JSONObject JSONArray.optJSONObject(int)>
		//   30   59:invokevirtual   #75  <Method RadarUserInsightsLocation RadarUserInsightsLocation$Companion.fromJson(JSONObject)>
		//   31   62:astore          6
					if(radaruserinsightslocation2 != null)
		//*  32   64:aload           6
		//*  33   66:ifnull          79
						obj = ((Object) (radaruserinsightslocation2.getType()));
		//   34   69:aload           6
		//   35   71:invokevirtual   #79  <Method RadarUserInsightsLocation$RadarUserInsightsLocationType RadarUserInsightsLocation.getType()>
		//   36   74:astore          7
					else
		//*  37   76:goto            82
						obj = null;
		//   38   79:aconst_null     
		//   39   80:astore          7
					class WhenMappings
					{

						public static final int $EnumSwitchMapping$0[];

						static 
						{
							$EnumSwitchMapping$0 = new int[RadarUserInsightsLocation.RadarUserInsightsLocationType.values().length];
						//    0    0:invokestatic    #22  <Method RadarUserInsightsLocation$RadarUserInsightsLocationType[] RadarUserInsightsLocation$RadarUserInsightsLocationType.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #24  <Field int[] $EnumSwitchMapping$0>
							$EnumSwitchMapping$0[RadarUserInsightsLocation.RadarUserInsightsLocationType.HOME.ordinal()] = 1;
						//    4    9:getstatic       #24  <Field int[] $EnumSwitchMapping$0>
						//    5   12:getstatic       #28  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType RadarUserInsightsLocation$RadarUserInsightsLocationType.HOME>
						//    6   15:invokevirtual   #32  <Method int RadarUserInsightsLocation$RadarUserInsightsLocationType.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
							$EnumSwitchMapping$0[RadarUserInsightsLocation.RadarUserInsightsLocationType.OFFICE.ordinal()] = 2;
						//    9   20:getstatic       #24  <Field int[] $EnumSwitchMapping$0>
						//   10   23:getstatic       #35  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType RadarUserInsightsLocation$RadarUserInsightsLocationType.OFFICE>
						//   11   26:invokevirtual   #32  <Method int RadarUserInsightsLocation$RadarUserInsightsLocationType.ordinal()>
						//   12   29:iconst_2        
						//   13   30:iastore         
						//*  14   31:return          
						}
					}

					if(obj != null)
		//*  40   82:aload           7
		//*  41   84:ifnonnull       90
		//*  42   87:goto            134
						switch(WhenMappings..EnumSwitchMapping._fld0[((RadarUserInsightsLocation.RadarUserInsightsLocationType) (obj)).ordinal()])
		//*  43   90:getstatic       #85  <Field int[] RadarUserInsights$Companion$WhenMappings.$EnumSwitchMapping$0>
		//*  44   93:aload           7
		//*  45   95:invokevirtual   #90  <Method int RadarUserInsightsLocation$RadarUserInsightsLocationType.ordinal()>
		//*  46   98:iaload          
						{
		//*  47   99:tableswitch     1 2: default 120
		//		               1 130
		//		               2 123
		//*  48  120:goto            134
						case 2: // '\002'
							radaruserinsightslocation1 = radaruserinsightslocation2;
		//   49  123:aload           6
		//   50  125:astore          5
							break;

		//*  51  127:goto            134
						case 1: // '\001'
							radaruserinsightslocation = radaruserinsightslocation2;
		//   52  130:aload           6
		//   53  132:astore          4
							break;
						}
					i++;
		//   54  134:iload_2         
		//   55  135:iconst_1        
		//   56  136:iadd            
		//   57  137:istore_2        
				} while(true);
		//   58  138:goto            37
			} else
			{
				radaruserinsightslocation2 = radaruserinsightslocation;
		//   59  141:aload           4
		//   60  143:astore          6
				obj = ((Object) (radaruserinsightslocation));
		//   61  145:aload           4
		//   62  147:astore          7
			}
			jsonobject = jsonobject.optJSONObject("state");
		//   63  149:aload_1         
		//   64  150:ldc1            #92  <String "state">
		//   65  152:invokevirtual   #95  <Method JSONObject JSONObject.optJSONObject(String)>
		//   66  155:astore_1        
			if(jsonobject != null)
		//*  67  156:aload_1         
		//*  68  157:ifnull          171
				jsonobject = ((JSONObject) (RadarUserInsightsState.Companion.fromJson(jsonobject)));
		//   69  160:getstatic       #100 <Field RadarUserInsightsState$Companion RadarUserInsightsState.Companion>
		//   70  163:aload_1         
		//   71  164:invokevirtual   #105 <Method RadarUserInsightsState RadarUserInsightsState$Companion.fromJson(JSONObject)>
		//   72  167:astore_1        
			else
		//*  73  168:goto            173
				jsonobject = null;
		//   74  171:aconst_null     
		//   75  172:astore_1        
			return new RadarUserInsights(((RadarUserInsightsLocation) (obj)), radaruserinsightslocation2, ((RadarUserInsightsState) (jsonobject)), ((DefaultConstructorMarker) (null)));
		//   76  173:new             #6   <Class RadarUserInsights>
		//   77  176:dup             
		//   78  177:aload           7
		//   79  179:aload           6
		//   80  181:aload_1         
		//   81  182:aconst_null     
		//   82  183:invokespecial   #108 <Method void RadarUserInsights(RadarUserInsightsLocation, RadarUserInsightsLocation, RadarUserInsightsState, DefaultConstructorMarker)>
		//   83  186:areturn         
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #31  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void RadarUserInsights$Companion()>
		//    2    4:return          
		}
	}


	private RadarUserInsights(RadarUserInsightsLocation radaruserinsightslocation, RadarUserInsightsLocation radaruserinsightslocation1, RadarUserInsightsState radaruserinsightsstate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #52  <Method void Object()>
		homeLocation = radaruserinsightslocation;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #54  <Field RadarUserInsightsLocation homeLocation>
		officeLocation = radaruserinsightslocation1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #56  <Field RadarUserInsightsLocation officeLocation>
		state = radaruserinsightsstate;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #58  <Field RadarUserInsightsState state>
	//   11   19:return          
	}

	public RadarUserInsights(RadarUserInsightsLocation radaruserinsightslocation, RadarUserInsightsLocation radaruserinsightslocation1, RadarUserInsightsState radaruserinsightsstate, DefaultConstructorMarker defaultconstructormarker)
	{
		this(radaruserinsightslocation, radaruserinsightslocation1, radaruserinsightsstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #61  <Method void RadarUserInsights(RadarUserInsightsLocation, RadarUserInsightsLocation, RadarUserInsightsState)>
	//    5    7:return          
	}

	public final RadarUserInsightsLocation getHomeLocation()
	{
		return homeLocation;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field RadarUserInsightsLocation homeLocation>
	//    2    4:areturn         
	}

	public final RadarUserInsightsLocation getOfficeLocation()
	{
		return officeLocation;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field RadarUserInsightsLocation officeLocation>
	//    2    4:areturn         
	}

	public final RadarUserInsightsState getState()
	{
		return state;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field RadarUserInsightsState state>
	//    2    4:areturn         
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final String FIELD_LOCATIONS = "locations";
	public static final String FIELD_STATE = "state";
	private final RadarUserInsightsLocation homeLocation;
	private final RadarUserInsightsLocation officeLocation;
	private final RadarUserInsightsState state;

	static 
	{
	//    0    0:new             #6   <Class RadarUserInsights$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #47  <Method void RadarUserInsights$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #49  <Field RadarUserInsights$Companion Companion>
	//*   5   11:return          
	}
}
