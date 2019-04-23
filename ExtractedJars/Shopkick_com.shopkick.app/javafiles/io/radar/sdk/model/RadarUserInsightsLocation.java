// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import android.location.Location;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.*;

public final class RadarUserInsightsLocation
{
	public static final class Companion
	{

		public final RadarUserInsightsLocation fromJson(JSONObject jsonobject)
			throws JSONException, ParseException
		{
			Object obj;
			Object obj1;
label0:
			{
				obj = null;
		//    0    0:aconst_null     
		//    1    1:astore          7
				if(jsonobject == null)
		//*   2    3:aload_1         
		//*   3    4:ifnonnull       9
					return null;
		//    4    7:aconst_null     
		//    5    8:areturn         
				obj1 = ((Object) (jsonobject.optString("type")));
		//    6    9:aload_1         
		//    7   10:ldc1            #48  <String "type">
		//    8   12:invokevirtual   #54  <Method String JSONObject.optString(String)>
		//    9   15:astore          8
				if(obj1 != null)
		//*  10   17:aload           8
		//*  11   19:ifnonnull       25
		//*  12   22:goto            85
				{
					int i = ((String) (obj1)).hashCode();
		//   13   25:aload           8
		//   14   27:invokevirtual   #60  <Method int String.hashCode()>
		//   15   30:istore          6
					if(i != 0xc3373ebc)
		//*  16   32:iload           6
		//*  17   34:ldc1            #61  <Int 0xc3373ebc>
		//*  18   36:icmpeq          67
					{
						if(i == 0x30f4df && ((String) (obj1)).equals("home"))
		//*  19   39:iload           6
		//*  20   41:ldc1            #62  <Int 0x30f4df>
		//*  21   43:icmpeq          49
		//*  22   46:goto            85
		//*  23   49:aload           8
		//*  24   51:ldc1            #64  <String "home">
		//*  25   53:invokevirtual   #68  <Method boolean String.equals(Object)>
		//*  26   56:ifeq            85
						{
							obj1 = ((Object) (RadarUserInsightsLocationType.HOME));
		//   27   59:getstatic       #74  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType RadarUserInsightsLocation$RadarUserInsightsLocationType.HOME>
		//   28   62:astore          8
							break label0;
		//   29   64:goto            90
						}
					} else
					if(((String) (obj1)).equals("office"))
		//*  30   67:aload           8
		//*  31   69:ldc1            #76  <String "office">
		//*  32   71:invokevirtual   #68  <Method boolean String.equals(Object)>
		//*  33   74:ifeq            85
					{
						obj1 = ((Object) (RadarUserInsightsLocationType.OFFICE));
		//   34   77:getstatic       #79  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType RadarUserInsightsLocation$RadarUserInsightsLocationType.OFFICE>
		//   35   80:astore          8
						break label0;
		//   36   82:goto            90
					}
				}
				obj1 = ((Object) (RadarUserInsightsLocationType.UNKNOWN));
		//   37   85:getstatic       #82  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType RadarUserInsightsLocation$RadarUserInsightsLocationType.UNKNOWN>
		//   38   88:astore          8
			}
			Object obj2;
label1:
			{
				obj2 = ((Object) (jsonobject.optJSONObject("location")));
		//   39   90:aload_1         
		//   40   91:ldc1            #84  <String "location">
		//   41   93:invokevirtual   #88  <Method JSONObject JSONObject.optJSONObject(String)>
		//   42   96:astore          9
				if(obj2 != null)
		//*  43   98:aload           9
		//*  44  100:ifnull          112
					obj = ((Object) (((JSONObject) (obj2)).optJSONArray("coordinates")));
		//   45  103:aload           9
		//   46  105:ldc1            #90  <String "coordinates">
		//   47  107:invokevirtual   #94  <Method JSONArray JSONObject.optJSONArray(String)>
		//   48  110:astore          7
				obj2 = ((Object) (new Location("radar")));
		//   49  112:new             #96  <Class Location>
		//   50  115:dup             
		//   51  116:ldc1            #98  <String "radar">
		//   52  118:invokespecial   #101 <Method void Location(String)>
		//   53  121:astore          9
				double d1 = 0.0D;
		//   54  123:dconst_0        
		//   55  124:dstore          4
				double d;
				if(obj != null)
		//*  56  126:aload           7
		//*  57  128:ifnull          141
					d = ((JSONArray) (obj)).optDouble(0);
		//   58  131:aload           7
		//   59  133:iconst_0        
		//   60  134:invokevirtual   #107 <Method double JSONArray.optDouble(int)>
		//   61  137:dstore_2        
				else
		//*  62  138:goto            143
					d = 0.0D;
		//   63  141:dconst_0        
		//   64  142:dstore_2        
				((Location) (obj2)).setLongitude(d);
		//   65  143:aload           9
		//   66  145:dload_2         
		//   67  146:invokevirtual   #111 <Method void Location.setLongitude(double)>
				d = d1;
		//   68  149:dload           4
		//   69  151:dstore_2        
				if(obj != null)
		//*  70  152:aload           7
		//*  71  154:ifnull          164
					d = ((JSONArray) (obj)).optDouble(1);
		//   72  157:aload           7
		//   73  159:iconst_1        
		//   74  160:invokevirtual   #107 <Method double JSONArray.optDouble(int)>
		//   75  163:dstore_2        
				((Location) (obj2)).setLatitude(d);
		//   76  164:aload           9
		//   77  166:dload_2         
		//   78  167:invokevirtual   #114 <Method void Location.setLatitude(double)>
				switch(jsonobject.optInt("confidence"))
		//*  79  170:aload_1         
		//*  80  171:ldc1            #116 <String "confidence">
		//*  81  173:invokevirtual   #120 <Method int JSONObject.optInt(String)>
				{
		//*  82  176:tableswitch     1 3: default 204
		//		               1 228
		//		               2 220
		//		               3 212
				default:
					obj = ((Object) (RadarUserInsightsLocationConfidence.NONE));
		//   83  204:getstatic       #126 <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence RadarUserInsightsLocation$RadarUserInsightsLocationConfidence.NONE>
		//   84  207:astore          7
					break;

		//*  85  209:goto            233
				case 3: // '\003'
					obj = ((Object) (RadarUserInsightsLocationConfidence.HIGH));
		//   86  212:getstatic       #129 <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence RadarUserInsightsLocation$RadarUserInsightsLocationConfidence.HIGH>
		//   87  215:astore          7
					break;

		//*  88  217:goto            233
				case 2: // '\002'
					obj = ((Object) (RadarUserInsightsLocationConfidence.MEDIUM));
		//   89  220:getstatic       #132 <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence RadarUserInsightsLocation$RadarUserInsightsLocationConfidence.MEDIUM>
		//   90  223:astore          7
					break;

		//*  91  225:goto            233
				case 1: // '\001'
					obj = ((Object) (RadarUserInsightsLocationConfidence.LOW));
		//   92  228:getstatic       #135 <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence RadarUserInsightsLocation$RadarUserInsightsLocationConfidence.LOW>
		//   93  231:astore          7
					break;
				}
				SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		//   94  233:new             #137 <Class SimpleDateFormat>
		//   95  236:dup             
		//   96  237:ldc1            #139 <String "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'">
		//   97  239:invokespecial   #140 <Method void SimpleDateFormat(String)>
		//   98  242:astore          10
				simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
		//   99  244:aload           10
		//  100  246:ldc1            #142 <String "UTC">
		//  101  248:invokestatic    #148 <Method TimeZone TimeZone.getTimeZone(String)>
		//  102  251:invokevirtual   #152 <Method void SimpleDateFormat.setTimeZone(TimeZone)>
				jsonobject = ((JSONObject) (jsonobject.optString("updatedAt")));
		//  103  254:aload_1         
		//  104  255:ldc1            #154 <String "updatedAt">
		//  105  257:invokevirtual   #54  <Method String JSONObject.optString(String)>
		//  106  260:astore_1        
				if(jsonobject != null)
		//* 107  261:aload_1         
		//* 108  262:ifnull          279
				{
					jsonobject = ((JSONObject) (simpledateformat.parse(((String) (jsonobject)))));
		//  109  265:aload           10
		//  110  267:aload_1         
		//  111  268:invokevirtual   #158 <Method Date SimpleDateFormat.parse(String)>
		//  112  271:astore_1        
					if(jsonobject != null)
		//* 113  272:aload_1         
		//* 114  273:ifnull          279
						break label1;
		//  115  276:goto            287
				}
				jsonobject = ((JSONObject) (new Date()));
		//  116  279:new             #160 <Class Date>
		//  117  282:dup             
		//  118  283:invokespecial   #161 <Method void Date()>
		//  119  286:astore_1        
			}
			return new RadarUserInsightsLocation(((RadarUserInsightsLocationType) (obj1)), ((Location) (obj2)), ((RadarUserInsightsLocationConfidence) (obj)), ((Date) (jsonobject)));
		//  120  287:new             #6   <Class RadarUserInsightsLocation>
		//  121  290:dup             
		//  122  291:aload           8
		//  123  293:aload           9
		//  124  295:aload           7
		//  125  297:aload_1         
		//  126  298:invokespecial   #164 <Method void RadarUserInsightsLocation(RadarUserInsightsLocation$RadarUserInsightsLocationType, Location, RadarUserInsightsLocation$RadarUserInsightsLocationConfidence, Date)>
		//  127  301:areturn         
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #37  <Method void RadarUserInsightsLocation$Companion()>
		//    2    4:return          
		}
	}

	public static final class RadarUserInsightsLocationConfidence extends Enum
	{

		public static RadarUserInsightsLocationConfidence valueOf(String s)
		{
			return (RadarUserInsightsLocationConfidence)Enum.valueOf(io/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationConfidence, s);
		//    0    0:ldc1            #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationConfidence>
		//    1    2:aload_0         
		//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationConfidence>
		//    4    9:areturn         
		}

		public static RadarUserInsightsLocationConfidence[] values()
		{
			return (RadarUserInsightsLocationConfidence[])((RadarUserInsightsLocationConfidence []) ($VALUES)).clone();
		//    0    0:getstatic       #48  <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence[] $VALUES>
		//    1    3:invokevirtual   #63  <Method Object _5B_Lio.radar.sdk.model.RadarUserInsightsLocation$RadarUserInsightsLocationConfidence_3B_.clone()>
		//    2    6:checkcast       #59  <Class RadarUserInsightsLocation$RadarUserInsightsLocationConfidence[]>
		//    3    9:areturn         
		}

		private static final RadarUserInsightsLocationConfidence $VALUES[];
		public static final RadarUserInsightsLocationConfidence HIGH;
		public static final RadarUserInsightsLocationConfidence LOW;
		public static final RadarUserInsightsLocationConfidence MEDIUM;
		public static final RadarUserInsightsLocationConfidence NONE;

		static 
		{
			RadarUserInsightsLocationConfidence radaruserinsightslocationconfidence = new RadarUserInsightsLocationConfidence("NONE", 0);
		//    0    0:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationConfidence>
		//    1    3:dup             
		//    2    4:ldc1            #32  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #35  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationConfidence(String, int)>
		//    5   10:astore_0        
			NONE = radaruserinsightslocationconfidence;
		//    6   11:aload_0         
		//    7   12:putstatic       #37  <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence NONE>
			RadarUserInsightsLocationConfidence radaruserinsightslocationconfidence1 = new RadarUserInsightsLocationConfidence("LOW", 1);
		//    8   15:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationConfidence>
		//    9   18:dup             
		//   10   19:ldc1            #38  <String "LOW">
		//   11   21:iconst_1        
		//   12   22:invokespecial   #35  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationConfidence(String, int)>
		//   13   25:astore_1        
			LOW = radaruserinsightslocationconfidence1;
		//   14   26:aload_1         
		//   15   27:putstatic       #40  <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence LOW>
			RadarUserInsightsLocationConfidence radaruserinsightslocationconfidence2 = new RadarUserInsightsLocationConfidence("MEDIUM", 2);
		//   16   30:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationConfidence>
		//   17   33:dup             
		//   18   34:ldc1            #41  <String "MEDIUM">
		//   19   36:iconst_2        
		//   20   37:invokespecial   #35  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationConfidence(String, int)>
		//   21   40:astore_2        
			MEDIUM = radaruserinsightslocationconfidence2;
		//   22   41:aload_2         
		//   23   42:putstatic       #43  <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence MEDIUM>
			RadarUserInsightsLocationConfidence radaruserinsightslocationconfidence3 = new RadarUserInsightsLocationConfidence("HIGH", 3);
		//   24   45:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationConfidence>
		//   25   48:dup             
		//   26   49:ldc1            #44  <String "HIGH">
		//   27   51:iconst_3        
		//   28   52:invokespecial   #35  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationConfidence(String, int)>
		//   29   55:astore_3        
			HIGH = radaruserinsightslocationconfidence3;
		//   30   56:aload_3         
		//   31   57:putstatic       #46  <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence HIGH>
			$VALUES = (new RadarUserInsightsLocationConfidence[] {
				radaruserinsightslocationconfidence, radaruserinsightslocationconfidence1, radaruserinsightslocationconfidence2, radaruserinsightslocationconfidence3
			});
		//   32   60:iconst_4        
		//   33   61:anewarray       RadarUserInsightsLocationConfidence[]
		//   34   64:dup             
		//   35   65:iconst_0        
		//   36   66:aload_0         
		//   37   67:aastore         
		//   38   68:dup             
		//   39   69:iconst_1        
		//   40   70:aload_1         
		//   41   71:aastore         
		//   42   72:dup             
		//   43   73:iconst_2        
		//   44   74:aload_2         
		//   45   75:aastore         
		//   46   76:dup             
		//   47   77:iconst_3        
		//   48   78:aload_3         
		//   49   79:aastore         
		//   50   80:putstatic       #48  <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence[] $VALUES>
		//*  51   83:return          
		}

		protected RadarUserInsightsLocationConfidence(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #50  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class RadarUserInsightsLocationType extends Enum
	{

		public static RadarUserInsightsLocationType valueOf(String s)
		{
			return (RadarUserInsightsLocationType)Enum.valueOf(io/radar/sdk/model/RadarUserInsightsLocation$RadarUserInsightsLocationType, s);
		//    0    0:ldc1            #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
		//    4    9:areturn         
		}

		public static RadarUserInsightsLocationType[] values()
		{
			return (RadarUserInsightsLocationType[])((RadarUserInsightsLocationType []) ($VALUES)).clone();
		//    0    0:getstatic       #44  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType[] $VALUES>
		//    1    3:invokevirtual   #59  <Method Object _5B_Lio.radar.sdk.model.RadarUserInsightsLocation$RadarUserInsightsLocationType_3B_.clone()>
		//    2    6:checkcast       #55  <Class RadarUserInsightsLocation$RadarUserInsightsLocationType[]>
		//    3    9:areturn         
		}

		private static final RadarUserInsightsLocationType $VALUES[];
		public static final RadarUserInsightsLocationType HOME;
		public static final RadarUserInsightsLocationType OFFICE;
		public static final RadarUserInsightsLocationType UNKNOWN;

		static 
		{
			RadarUserInsightsLocationType radaruserinsightslocationtype = new RadarUserInsightsLocationType("UNKNOWN", 0);
		//    0    0:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
		//    1    3:dup             
		//    2    4:ldc1            #31  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #34  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationType(String, int)>
		//    5   10:astore_0        
			UNKNOWN = radaruserinsightslocationtype;
		//    6   11:aload_0         
		//    7   12:putstatic       #36  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType UNKNOWN>
			RadarUserInsightsLocationType radaruserinsightslocationtype1 = new RadarUserInsightsLocationType("HOME", 1);
		//    8   15:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
		//    9   18:dup             
		//   10   19:ldc1            #37  <String "HOME">
		//   11   21:iconst_1        
		//   12   22:invokespecial   #34  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationType(String, int)>
		//   13   25:astore_1        
			HOME = radaruserinsightslocationtype1;
		//   14   26:aload_1         
		//   15   27:putstatic       #39  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType HOME>
			RadarUserInsightsLocationType radaruserinsightslocationtype2 = new RadarUserInsightsLocationType("OFFICE", 2);
		//   16   30:new             #2   <Class RadarUserInsightsLocation$RadarUserInsightsLocationType>
		//   17   33:dup             
		//   18   34:ldc1            #40  <String "OFFICE">
		//   19   36:iconst_2        
		//   20   37:invokespecial   #34  <Method void RadarUserInsightsLocation$RadarUserInsightsLocationType(String, int)>
		//   21   40:astore_2        
			OFFICE = radaruserinsightslocationtype2;
		//   22   41:aload_2         
		//   23   42:putstatic       #42  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType OFFICE>
			$VALUES = (new RadarUserInsightsLocationType[] {
				radaruserinsightslocationtype, radaruserinsightslocationtype1, radaruserinsightslocationtype2
			});
		//   24   45:iconst_3        
		//   25   46:anewarray       RadarUserInsightsLocationType[]
		//   26   49:dup             
		//   27   50:iconst_0        
		//   28   51:aload_0         
		//   29   52:aastore         
		//   30   53:dup             
		//   31   54:iconst_1        
		//   32   55:aload_1         
		//   33   56:aastore         
		//   34   57:dup             
		//   35   58:iconst_2        
		//   36   59:aload_2         
		//   37   60:aastore         
		//   38   61:putstatic       #44  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType[] $VALUES>
		//*  39   64:return          
		}

		protected RadarUserInsightsLocationType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #46  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public RadarUserInsightsLocation(RadarUserInsightsLocationType radaruserinsightslocationtype, Location location1, RadarUserInsightsLocationConfidence radaruserinsightslocationconfidence, Date date)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (radaruserinsightslocationtype)), "type");
	//    0    0:aload_1         
	//    1    1:ldc1            #55  <String "type">
	//    2    3:invokestatic    #73  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
	//    3    6:aload_2         
	//    4    7:ldc1            #53  <String "location">
	//    5    9:invokestatic    #73  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (radaruserinsightslocationconfidence)), "confidence");
	//    6   12:aload_3         
	//    7   13:ldc1            #48  <String "confidence">
	//    8   15:invokestatic    #73  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (date)), "updatedAt");
	//    9   18:aload           4
	//   10   20:ldc1            #57  <String "updatedAt">
	//   11   22:invokestatic    #73  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//   12   25:aload_0         
	//   13   26:invokespecial   #75  <Method void Object()>
		type = radaruserinsightslocationtype;
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:putfield        #77  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType type>
		location = location1;
	//   17   34:aload_0         
	//   18   35:aload_2         
	//   19   36:putfield        #79  <Field Location location>
		confidence = radaruserinsightslocationconfidence;
	//   20   39:aload_0         
	//   21   40:aload_3         
	//   22   41:putfield        #81  <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence confidence>
		updatedAt = date;
	//   23   44:aload_0         
	//   24   45:aload           4
	//   25   47:putfield        #83  <Field Date updatedAt>
	//   26   50:return          
	}

	public final RadarUserInsightsLocationConfidence getConfidence()
	{
		return confidence;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence confidence>
	//    2    4:areturn         
	}

	public final Location getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field Location location>
	//    2    4:areturn         
	}

	public final RadarUserInsightsLocationType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType type>
	//    2    4:areturn         
	}

	public final Date getUpdatedAt()
	{
		return updatedAt;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Date updatedAt>
	//    2    4:areturn         
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	private static final String FIELD_CONFIDENCE = "confidence";
	private static final String FIELD_COORDINATES = "coordinates";
	private static final String FIELD_LOCATION = "location";
	private static final String FIELD_TYPE = "type";
	private static final String FIELD_UPDATED_AT = "updatedAt";
	private final RadarUserInsightsLocationConfidence confidence;
	private final Location location;
	private final RadarUserInsightsLocationType type;
	private final Date updatedAt;

	static 
	{
	//    0    0:new             #6   <Class RadarUserInsightsLocation$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #64  <Method void RadarUserInsightsLocation$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #66  <Field RadarUserInsightsLocation$Companion Companion>
	//*   5   11:return          
	}
}
