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
import org.json.*;

// Referenced classes of package io.radar.sdk.model:
//			RadarUserInsightsLocation

public static final class RadarUserInsightsLocation$Companion
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
						obj1 = ((Object) (nsightsLocationType.HOME));
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
					obj1 = ((Object) (nsightsLocationType.OFFICE));
	//   34   77:getstatic       #79  <Field RadarUserInsightsLocation$RadarUserInsightsLocationType RadarUserInsightsLocation$RadarUserInsightsLocationType.OFFICE>
	//   35   80:astore          8
					break label0;
	//   36   82:goto            90
				}
			}
			obj1 = ((Object) (nsightsLocationType.UNKNOWN));
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
	//	               1 228
	//	               2 220
	//	               3 212
			default:
				obj = ((Object) (nsightsLocationConfidence.NONE));
	//   83  204:getstatic       #126 <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence RadarUserInsightsLocation$RadarUserInsightsLocationConfidence.NONE>
	//   84  207:astore          7
				break;

	//*  85  209:goto            233
			case 3: // '\003'
				obj = ((Object) (nsightsLocationConfidence.HIGH));
	//   86  212:getstatic       #129 <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence RadarUserInsightsLocation$RadarUserInsightsLocationConfidence.HIGH>
	//   87  215:astore          7
				break;

	//*  88  217:goto            233
			case 2: // '\002'
				obj = ((Object) (nsightsLocationConfidence.MEDIUM));
	//   89  220:getstatic       #132 <Field RadarUserInsightsLocation$RadarUserInsightsLocationConfidence RadarUserInsightsLocation$RadarUserInsightsLocationConfidence.MEDIUM>
	//   90  223:astore          7
				break;

	//*  91  225:goto            233
			case 1: // '\001'
				obj = ((Object) (nsightsLocationConfidence.LOW));
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
		return new RadarUserInsightsLocation(((nsightsLocationType) (obj1)), ((Location) (obj2)), ((nsightsLocationConfidence) (obj)), ((Date) (jsonobject)));
	//  120  287:new             #6   <Class RadarUserInsightsLocation>
	//  121  290:dup             
	//  122  291:aload           8
	//  123  293:aload           9
	//  124  295:aload           7
	//  125  297:aload_1         
	//  126  298:invokespecial   #164 <Method void RadarUserInsightsLocation(RadarUserInsightsLocation$RadarUserInsightsLocationType, Location, RadarUserInsightsLocation$RadarUserInsightsLocationConfidence, Date)>
	//  127  301:areturn         
	}

	private RadarUserInsightsLocation$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	public RadarUserInsightsLocation$Companion(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void RadarUserInsightsLocation$Companion()>
	//    2    4:return          
	}
}
