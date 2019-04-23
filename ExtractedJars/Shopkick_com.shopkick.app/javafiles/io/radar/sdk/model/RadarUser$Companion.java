// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import android.location.Location;
import java.util.Collection;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.model:
//			RadarUser, RadarGeofence, RadarPlace, RadarUserInsights

public static final class RadarUser$Companion
{

	public final RadarUser fromJson$sdk_release(JSONObject jsonobject)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (jsonobject)), "obj");
	//    0    0:aload_1         
	//    1    1:ldc1            #49  <String "obj">
	//    2    3:invokestatic    #55  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		String s = jsonobject.optString("_id");
	//    3    6:aload_1         
	//    4    7:ldc1            #57  <String "_id">
	//    5    9:invokevirtual   #63  <Method String JSONObject.optString(String)>
	//    6   12:astore          12
		String s1 = jsonobject.optString("userId", ((String) (null)));
	//    7   14:aload_1         
	//    8   15:ldc1            #65  <String "userId">
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #68  <Method String JSONObject.optString(String, String)>
	//   11   21:astore          13
		String s2 = jsonobject.optString("deviceId", ((String) (null)));
	//   12   23:aload_1         
	//   13   24:ldc1            #70  <String "deviceId">
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #68  <Method String JSONObject.optString(String, String)>
	//   16   30:astore          14
		String s3 = jsonobject.optString("description", ((String) (null)));
	//   17   32:aload_1         
	//   18   33:ldc1            #72  <String "description">
	//   19   35:aconst_null     
	//   20   36:invokevirtual   #68  <Method String JSONObject.optString(String, String)>
	//   21   39:astore          15
		JSONObject jsonobject1 = jsonobject.optJSONObject("metadata");
	//   22   41:aload_1         
	//   23   42:ldc1            #74  <String "metadata">
	//   24   44:invokevirtual   #78  <Method JSONObject JSONObject.optJSONObject(String)>
	//   25   47:astore          16
		boolean flag = jsonobject.optBoolean("stopped");
	//   26   49:aload_1         
	//   27   50:ldc1            #80  <String "stopped">
	//   28   52:invokevirtual   #84  <Method boolean JSONObject.optBoolean(String)>
	//   29   55:istore          8
		boolean flag1 = jsonobject.optBoolean("foreground");
	//   30   57:aload_1         
	//   31   58:ldc1            #86  <String "foreground">
	//   32   60:invokevirtual   #84  <Method boolean JSONObject.optBoolean(String)>
	//   33   63:istore          9
		Object obj = ((Object) (jsonobject.optJSONObject("location")));
	//   34   65:aload_1         
	//   35   66:ldc1            #88  <String "location">
	//   36   68:invokevirtual   #78  <Method JSONObject JSONObject.optJSONObject(String)>
	//   37   71:astore          10
		if(obj != null)
	//*  38   73:aload           10
	//*  39   75:ifnull          90
			obj = ((Object) (((JSONObject) (obj)).optJSONArray("coordinates")));
	//   40   78:aload           10
	//   41   80:ldc1            #90  <String "coordinates">
	//   42   82:invokevirtual   #94  <Method JSONArray JSONObject.optJSONArray(String)>
	//   43   85:astore          10
		else
	//*  44   87:goto            93
			obj = null;
	//   45   90:aconst_null     
	//   46   91:astore          10
		Location location = new Location("radar");
	//   47   93:new             #96  <Class Location>
	//   48   96:dup             
	//   49   97:ldc1            #98  <String "radar">
	//   50   99:invokespecial   #101 <Method void Location(String)>
	//   51  102:astore          17
		double d1 = 0.0D;
	//   52  104:dconst_0        
	//   53  105:dstore          4
		double d;
		if(obj != null)
	//*  54  107:aload           10
	//*  55  109:ifnull          122
			d = ((JSONArray) (obj)).optDouble(0);
	//   56  112:aload           10
	//   57  114:iconst_0        
	//   58  115:invokevirtual   #107 <Method double JSONArray.optDouble(int)>
	//   59  118:dstore_2        
		else
	//*  60  119:goto            124
			d = 0.0D;
	//   61  122:dconst_0        
	//   62  123:dstore_2        
		location.setLongitude(d);
	//   63  124:aload           17
	//   64  126:dload_2         
	//   65  127:invokevirtual   #111 <Method void Location.setLongitude(double)>
		d = d1;
	//   66  130:dload           4
	//   67  132:dstore_2        
		if(obj != null)
	//*  68  133:aload           10
	//*  69  135:ifnull          145
			d = ((JSONArray) (obj)).optDouble(1);
	//   70  138:aload           10
	//   71  140:iconst_1        
	//   72  141:invokevirtual   #107 <Method double JSONArray.optDouble(int)>
	//   73  144:dstore_2        
		location.setLatitude(d);
	//   74  145:aload           17
	//   75  147:dload_2         
	//   76  148:invokevirtual   #114 <Method void Location.setLatitude(double)>
		if(jsonobject.has("locationAccuracy"))
	//*  77  151:aload_1         
	//*  78  152:ldc1            #116 <String "locationAccuracy">
	//*  79  154:invokevirtual   #119 <Method boolean JSONObject.has(String)>
	//*  80  157:ifeq            172
			location.setAccuracy((float)jsonobject.optDouble("locationAccuracy"));
	//   81  160:aload           17
	//   82  162:aload_1         
	//   83  163:ldc1            #116 <String "locationAccuracy">
	//   84  165:invokevirtual   #122 <Method double JSONObject.optDouble(String)>
	//   85  168:d2f             
	//   86  169:invokevirtual   #126 <Method void Location.setAccuracy(float)>
		Object obj2 = ((Object) (jsonobject.optJSONArray("geofences")));
	//   87  172:aload_1         
	//   88  173:ldc1            #128 <String "geofences">
	//   89  175:invokevirtual   #94  <Method JSONArray JSONObject.optJSONArray(String)>
	//   90  178:astore          11
		Object aobj[];
		if(obj2 != null)
	//*  91  180:aload           11
	//*  92  182:ifnull          319
		{
			RadarGeofence aradargeofence[] = new RadarGeofence[((JSONArray) (obj2)).length()];
	//   93  185:aload           11
	//   94  187:invokevirtual   #132 <Method int JSONArray.length()>
	//   95  190:anewarray       RadarGeofence[]
	//   96  193:astore          18
			int j = aradargeofence.length;
	//   97  195:aload           18
	//   98  197:arraylength     
	//   99  198:istore          7
			for(int i = 0; i < j; i++)
	//* 100  200:iconst_0        
	//* 101  201:istore          6
	//* 102  203:iload           6
	//* 103  205:iload           7
	//* 104  207:icmpge          256
			{
				Object obj1 = ((Object) (((JSONArray) (obj2)).optJSONObject(i)));
	//  105  210:aload           11
	//  106  212:iload           6
	//  107  214:invokevirtual   #137 <Method JSONObject JSONArray.optJSONObject(int)>
	//  108  217:astore          10
				if(obj1 != null)
	//* 109  219:aload           10
	//* 110  221:ifnull          237
					obj1 = ((Object) (RadarGeofence.Companion.fromJson(((JSONObject) (obj1)))));
	//  111  224:getstatic       #140 <Field RadarGeofence$Companion RadarGeofence.Companion>
	//  112  227:aload           10
	//  113  229:invokevirtual   #145 <Method RadarGeofence RadarGeofence$Companion.fromJson(JSONObject)>
	//  114  232:astore          10
				else
	//* 115  234:goto            240
					obj1 = null;
	//  116  237:aconst_null     
	//  117  238:astore          10
				aradargeofence[i] = ((RadarGeofence) (obj1));
	//  118  240:aload           18
	//  119  242:iload           6
	//  120  244:aload           10
	//  121  246:aastore         
			}

	//  122  247:iload           6
	//  123  249:iconst_1        
	//  124  250:iadd            
	//  125  251:istore          6
	//* 126  253:goto            203
			Collection collection = (Collection)ArraysKt.filterNotNull(((Object []) (aradargeofence)));
	//  127  256:aload           18
	//  128  258:invokestatic    #151 <Method java.util.List ArraysKt.filterNotNull(Object[])>
	//  129  261:checkcast       #153 <Class Collection>
	//  130  264:astore          10
			if(collection != null)
	//* 131  266:aload           10
	//* 132  268:ifnull          309
			{
				aobj = collection.toArray(((Object []) (new RadarGeofence[0])));
	//  133  271:aload           10
	//  134  273:iconst_0        
	//  135  274:anewarray       RadarGeofence[]
	//  136  277:invokeinterface #157 <Method Object[] Collection.toArray(Object[])>
	//  137  282:astore          10
				if(aobj != null)
	//* 138  284:aload           10
	//* 139  286:ifnull          299
					aobj = ((Object []) ((RadarGeofence[])aobj));
	//  140  289:aload           10
	//  141  291:checkcast       #159 <Class RadarGeofence[]>
	//  142  294:astore          10
				else
	//* 143  296:goto            322
					throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
	//  144  299:new             #161 <Class TypeCastException>
	//  145  302:dup             
	//  146  303:ldc1            #163 <String "null cannot be cast to non-null type kotlin.Array<T>">
	//  147  305:invokespecial   #164 <Method void TypeCastException(String)>
	//  148  308:athrow          
			} else
			{
				throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
	//  149  309:new             #161 <Class TypeCastException>
	//  150  312:dup             
	//  151  313:ldc1            #166 <String "null cannot be cast to non-null type java.util.Collection<T>">
	//  152  315:invokespecial   #164 <Method void TypeCastException(String)>
	//  153  318:athrow          
			}
		} else
		{
			aobj = null;
	//  154  319:aconst_null     
	//  155  320:astore          10
		}
		obj2 = ((Object) (jsonobject.optJSONObject("place")));
	//  156  322:aload_1         
	//  157  323:ldc1            #168 <String "place">
	//  158  325:invokevirtual   #78  <Method JSONObject JSONObject.optJSONObject(String)>
	//  159  328:astore          11
		if(obj2 != null)
	//* 160  330:aload           11
	//* 161  332:ifnull          348
			obj2 = ((Object) (RadarPlace.Companion.fromJson(((JSONObject) (obj2)))));
	//  162  335:getstatic       #173 <Field RadarPlace$Companion RadarPlace.Companion>
	//  163  338:aload           11
	//  164  340:invokevirtual   #178 <Method RadarPlace RadarPlace$Companion.fromJson(JSONObject)>
	//  165  343:astore          11
		else
	//* 166  345:goto            351
			obj2 = null;
	//  167  348:aconst_null     
	//  168  349:astore          11
		jsonobject = jsonobject.optJSONObject("insights");
	//  169  351:aload_1         
	//  170  352:ldc1            #180 <String "insights">
	//  171  354:invokevirtual   #78  <Method JSONObject JSONObject.optJSONObject(String)>
	//  172  357:astore_1        
		if(jsonobject != null)
	//* 173  358:aload_1         
	//* 174  359:ifnull          373
			jsonobject = ((JSONObject) (RadarUserInsights.Companion.fromJson(jsonobject)));
	//  175  362:getstatic       #185 <Field RadarUserInsights$Companion RadarUserInsights.Companion>
	//  176  365:aload_1         
	//  177  366:invokevirtual   #190 <Method RadarUserInsights RadarUserInsights$Companion.fromJson(JSONObject)>
	//  178  369:astore_1        
		else
	//* 179  370:goto            375
			jsonobject = null;
	//  180  373:aconst_null     
	//  181  374:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "id");
	//  182  375:aload           12
	//  183  377:ldc1            #192 <String "id">
	//  184  379:invokestatic    #195 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return new RadarUser(s, s1, s2, s3, jsonobject1, location, ((RadarGeofence []) (aobj)), ((RadarPlace) (obj2)), ((RadarUserInsights) (jsonobject)), flag, flag1);
	//  185  382:new             #6   <Class RadarUser>
	//  186  385:dup             
	//  187  386:aload           12
	//  188  388:aload           13
	//  189  390:aload           14
	//  190  392:aload           15
	//  191  394:aload           16
	//  192  396:aload           17
	//  193  398:aload           10
	//  194  400:aload           11
	//  195  402:aload_1         
	//  196  403:iload           8
	//  197  405:iload           9
	//  198  407:invokespecial   #198 <Method void RadarUser(String, String, String, String, JSONObject, Location, RadarGeofence[], RadarPlace, RadarUserInsights, boolean, boolean)>
	//  199  410:areturn         
	}

	private RadarUser$Companion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	public RadarUser$Companion(DefaultConstructorMarker defaultconstructormarker)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void RadarUser$Companion()>
	//    2    4:return          
	}
}
