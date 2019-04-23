// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.*;

// Referenced classes of package io.radar.sdk.model:
//			RadarChain, Coordinate

public final class RadarPlace
{
	public static final class Companion
	{

		public final RadarPlace fromJson(JSONObject jsonobject)
			throws JSONException
		{
			if(jsonobject == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			String s = jsonobject.optString("_id");
		//    4    6:aload_1         
		//    5    7:ldc1            #48  <String "_id">
		//    6    9:invokevirtual   #54  <Method String JSONObject.optString(String)>
		//    7   12:astore          11
			String s1 = jsonobject.optString("facebookId", ((String) (null)));
		//    8   14:aload_1         
		//    9   15:ldc1            #56  <String "facebookId">
		//   10   17:aconst_null     
		//   11   18:invokevirtual   #59  <Method String JSONObject.optString(String, String)>
		//   12   21:astore          12
			String s2 = jsonobject.optString("facebookPlaceId", ((String) (null)));
		//   13   23:aload_1         
		//   14   24:ldc1            #61  <String "facebookPlaceId">
		//   15   26:aconst_null     
		//   16   27:invokevirtual   #59  <Method String JSONObject.optString(String, String)>
		//   17   30:astore          13
			String s3 = jsonobject.optString("name");
		//   18   32:aload_1         
		//   19   33:ldc1            #63  <String "name">
		//   20   35:invokevirtual   #54  <Method String JSONObject.optString(String)>
		//   21   38:astore          14
			Object obj1 = ((Object) (jsonobject.optJSONArray("categories")));
		//   22   40:aload_1         
		//   23   41:ldc1            #65  <String "categories">
		//   24   43:invokevirtual   #69  <Method JSONArray JSONObject.optJSONArray(String)>
		//   25   46:astore          10
			String as[];
			if(obj1 != null)
		//*  26   48:aload           10
		//*  27   50:ifnull          114
			{
				String as1[] = new String[((JSONArray) (obj1)).length()];
		//   28   53:aload           10
		//   29   55:invokevirtual   #75  <Method int JSONArray.length()>
		//   30   58:anewarray       String[]
		//   31   61:astore          9
				int j = as1.length;
		//   32   63:aload           9
		//   33   65:arraylength     
		//   34   66:istore          7
				int i = 0;
		//   35   68:iconst_0        
		//   36   69:istore          6
				do
				{
					as = as1;
		//   37   71:aload           9
		//   38   73:astore          8
					if(i >= j)
						break;
		//   39   75:iload           6
		//   40   77:iload           7
		//   41   79:icmpge          120
					as = ((String []) (((JSONArray) (obj1)).optString(i)));
		//   42   82:aload           10
		//   43   84:iload           6
		//   44   86:invokevirtual   #80  <Method String JSONArray.optString(int)>
		//   45   89:astore          8
					Intrinsics.checkExpressionValueIsNotNull(((Object) (as)), "array.optString(it)");
		//   46   91:aload           8
		//   47   93:ldc1            #82  <String "array.optString(it)">
		//   48   95:invokestatic    #88  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
					as1[i] = ((String) (as));
		//   49   98:aload           9
		//   50  100:iload           6
		//   51  102:aload           8
		//   52  104:aastore         
					i++;
		//   53  105:iload           6
		//   54  107:iconst_1        
		//   55  108:iadd            
		//   56  109:istore          6
				} while(true);
		//   57  111:goto            71
			} else
			{
				as = new String[0];
		//   58  114:iconst_0        
		//   59  115:anewarray       String[]
		//   60  118:astore          8
			}
			Object obj = ((Object) (jsonobject.optJSONObject("chain")));
		//   61  120:aload_1         
		//   62  121:ldc1            #90  <String "chain">
		//   63  123:invokevirtual   #94  <Method JSONObject JSONObject.optJSONObject(String)>
		//   64  126:astore          9
			if(obj != null)
		//*  65  128:aload           9
		//*  66  130:ifnull          146
				obj = ((Object) (RadarChain.Companion.fromJson(((JSONObject) (obj)))));
		//   67  133:getstatic       #99  <Field RadarChain$Companion RadarChain.Companion>
		//   68  136:aload           9
		//   69  138:invokevirtual   #104 <Method RadarChain RadarChain$Companion.fromJson(JSONObject)>
		//   70  141:astore          9
			else
		//*  71  143:goto            149
				obj = null;
		//   72  146:aconst_null     
		//   73  147:astore          9
			obj1 = ((Object) (jsonobject.optJSONObject("location")));
		//   74  149:aload_1         
		//   75  150:ldc1            #106 <String "location">
		//   76  152:invokevirtual   #94  <Method JSONObject JSONObject.optJSONObject(String)>
		//   77  155:astore          10
			if(obj1 != null)
		//*  78  157:aload           10
		//*  79  159:ifnull          174
				obj1 = ((Object) (((JSONObject) (obj1)).optJSONArray("coordinates")));
		//   80  162:aload           10
		//   81  164:ldc1            #108 <String "coordinates">
		//   82  166:invokevirtual   #69  <Method JSONArray JSONObject.optJSONArray(String)>
		//   83  169:astore          10
			else
		//*  84  171:goto            177
				obj1 = null;
		//   85  174:aconst_null     
		//   86  175:astore          10
			double d1 = 0.0D;
		//   87  177:dconst_0        
		//   88  178:dstore          4
			double d;
			if(obj1 != null)
		//*  89  180:aload           10
		//*  90  182:ifnull          195
				d = ((JSONArray) (obj1)).optDouble(1);
		//   91  185:aload           10
		//   92  187:iconst_1        
		//   93  188:invokevirtual   #112 <Method double JSONArray.optDouble(int)>
		//   94  191:dstore_2        
			else
		//*  95  192:goto            197
				d = 0.0D;
		//   96  195:dconst_0        
		//   97  196:dstore_2        
			if(obj1 != null)
		//*  98  197:aload           10
		//*  99  199:ifnull          210
				d1 = ((JSONArray) (obj1)).optDouble(0);
		//  100  202:aload           10
		//  101  204:iconst_0        
		//  102  205:invokevirtual   #112 <Method double JSONArray.optDouble(int)>
		//  103  208:dstore          4
			obj1 = ((Object) (new Coordinate(d, d1)));
		//  104  210:new             #114 <Class Coordinate>
		//  105  213:dup             
		//  106  214:dload_2         
		//  107  215:dload           4
		//  108  217:invokespecial   #117 <Method void Coordinate(double, double)>
		//  109  220:astore          10
			String s4 = jsonobject.optString("group", ((String) (null)));
		//  110  222:aload_1         
		//  111  223:ldc1            #119 <String "group">
		//  112  225:aconst_null     
		//  113  226:invokevirtual   #59  <Method String JSONObject.optString(String, String)>
		//  114  229:astore          15
			jsonobject = jsonobject.optJSONObject("metadata");
		//  115  231:aload_1         
		//  116  232:ldc1            #121 <String "metadata">
		//  117  234:invokevirtual   #94  <Method JSONObject JSONObject.optJSONObject(String)>
		//  118  237:astore_1        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "id");
		//  119  238:aload           11
		//  120  240:ldc1            #123 <String "id">
		//  121  242:invokestatic    #88  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s3)), "name");
		//  122  245:aload           14
		//  123  247:ldc1            #63  <String "name">
		//  124  249:invokestatic    #88  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return new RadarPlace(s, s1, s2, s3, as, ((RadarChain) (obj)), ((Coordinate) (obj1)), s4, jsonobject);
		//  125  252:new             #6   <Class RadarPlace>
		//  126  255:dup             
		//  127  256:aload           11
		//  128  258:aload           12
		//  129  260:aload           13
		//  130  262:aload           14
		//  131  264:aload           8
		//  132  266:aload           9
		//  133  268:aload           10
		//  134  270:aload           15
		//  135  272:aload_1         
		//  136  273:invokespecial   #126 <Method void RadarPlace(String, String, String, String, String[], RadarChain, Coordinate, String, JSONObject)>
		//  137  276:areturn         
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #39  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #42  <Method void RadarPlace$Companion()>
		//    2    4:return          
		}
	}


	public RadarPlace(String s, String s1, String s2, String s3, String as[], RadarChain radarchain, Coordinate coordinate, 
			String s4, JSONObject jsonobject)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "id");
	//    0    0:aload_1         
	//    1    1:ldc1            #89  <String "id">
	//    2    3:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s3)), "name");
	//    3    6:aload           4
	//    4    8:ldc1            #78  <String "name">
	//    5   10:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (as)), "categories");
	//    6   13:aload           5
	//    7   15:ldc1            #57  <String "categories">
	//    8   17:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (coordinate)), "location");
	//    9   20:aload           7
	//   10   22:ldc1            #74  <String "location">
	//   11   24:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//   12   27:aload_0         
	//   13   28:invokespecial   #97  <Method void Object()>
		id = s;
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:putfield        #99  <Field String id>
		facebookId = s1;
	//   17   36:aload_0         
	//   18   37:aload_2         
	//   19   38:putfield        #101 <Field String facebookId>
		facebookPlaceId = s2;
	//   20   41:aload_0         
	//   21   42:aload_3         
	//   22   43:putfield        #103 <Field String facebookPlaceId>
		name = s3;
	//   23   46:aload_0         
	//   24   47:aload           4
	//   25   49:putfield        #105 <Field String name>
		categories = as;
	//   26   52:aload_0         
	//   27   53:aload           5
	//   28   55:putfield        #107 <Field String[] categories>
		chain = radarchain;
	//   29   58:aload_0         
	//   30   59:aload           6
	//   31   61:putfield        #109 <Field RadarChain chain>
		location = coordinate;
	//   32   64:aload_0         
	//   33   65:aload           7
	//   34   67:putfield        #111 <Field Coordinate location>
		group = s4;
	//   35   70:aload_0         
	//   36   71:aload           8
	//   37   73:putfield        #113 <Field String group>
		metadata = jsonobject;
	//   38   76:aload_0         
	//   39   77:aload           9
	//   40   79:putfield        #115 <Field JSONObject metadata>
	//   41   82:return          
	}

	public final String[] getCategories()
	{
		return categories;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String[] categories>
	//    2    4:areturn         
	}

	public final RadarChain getChain()
	{
		return chain;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field RadarChain chain>
	//    2    4:areturn         
	}

	public final String getFacebookId()
	{
		return facebookId;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field String facebookId>
	//    2    4:areturn         
	}

	public final String getFacebookPlaceId()
	{
		return facebookPlaceId;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String facebookPlaceId>
	//    2    4:areturn         
	}

	public final String getGroup()
	{
		return group;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field String group>
	//    2    4:areturn         
	}

	public final String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field String id>
	//    2    4:areturn         
	}

	public final Coordinate getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field Coordinate location>
	//    2    4:areturn         
	}

	public final JSONObject getMetadata()
	{
		return metadata;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field JSONObject metadata>
	//    2    4:areturn         
	}

	public final String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String name>
	//    2    4:areturn         
	}

	public final boolean hasCategory(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "category");
	//    0    0:aload_1         
	//    1    1:ldc1            #119 <String "category">
	//    2    3:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return ArraysKt.contains(((Object []) (categories)), ((Object) (s)));
	//    3    6:aload_0         
	//    4    7:getfield        #107 <Field String[] categories>
	//    5   10:aload_1         
	//    6   11:invokestatic    #125 <Method boolean ArraysKt.contains(Object[], Object)>
	//    7   14:ireturn         
	}

	public final boolean isChain(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "slug");
	//    0    0:aload_1         
	//    1    1:ldc1            #126 <String "slug">
	//    2    3:invokestatic    #95  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) (chain));
	//    3    6:aload_0         
	//    4    7:getfield        #109 <Field RadarChain chain>
	//    5   10:astore_2        
		if(obj != null)
	//*   6   11:aload_2         
	//*   7   12:ifnull          23
			obj = ((Object) (((RadarChain) (obj)).getSlug()));
	//    8   15:aload_2         
	//    9   16:invokevirtual   #131 <Method String RadarChain.getSlug()>
	//   10   19:astore_2        
		else
	//*  11   20:goto            25
			obj = null;
	//   12   23:aconst_null     
	//   13   24:astore_2        
		return Intrinsics.areEqual(obj, ((Object) (s)));
	//   14   25:aload_2         
	//   15   26:aload_1         
	//   16   27:invokestatic    #135 <Method boolean Intrinsics.areEqual(Object, Object)>
	//   17   30:ireturn         
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final String FIELD_CATEGORIES = "categories";
	public static final String FIELD_CHAIN = "chain";
	public static final String FIELD_COORDINATES = "coordinates";
	public static final String FIELD_FACEBOOK_ID = "facebookId";
	public static final String FIELD_FACEBOOK_PLACE_ID = "facebookPlaceId";
	public static final String FIELD_GROUP = "group";
	public static final String FIELD_ID = "_id";
	public static final String FIELD_LOCATION = "location";
	public static final String FIELD_METADATA = "metadata";
	public static final String FIELD_NAME = "name";
	private final String categories[];
	private final RadarChain chain;
	private final String facebookId;
	private final String facebookPlaceId;
	private final String group;
	private final String id;
	private final Coordinate location;
	private final JSONObject metadata;
	private final String name;

	static 
	{
	//    0    0:new             #6   <Class RadarPlace$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #85  <Method void RadarPlace$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #87  <Field RadarPlace$Companion Companion>
	//*   5   11:return          
	}
}
