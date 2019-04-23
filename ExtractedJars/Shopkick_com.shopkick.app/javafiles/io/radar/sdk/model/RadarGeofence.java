// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.model:
//			RadarGeofenceGeometry, Coordinate, RadarPolygonGeometry, RadarCircleGeometry

public final class RadarGeofence
{
	public static final class Companion
	{

		public final RadarGeofence fromJson(JSONObject jsonobject)
		{
			Object obj;
			Object obj1;
			Object obj2;
			String s;
			String s1;
			String s2;
label0:
			{
				Object obj5;
				Object obj6;
				String s3;
label1:
				{
					obj6 = null;
		//    0    0:aconst_null     
		//    1    1:astore          10
					obj5 = null;
		//    2    3:aconst_null     
		//    3    4:astore          9
					if(jsonobject == null)
		//*   4    6:aload_1         
		//*   5    7:ifnonnull       12
						return null;
		//    6   10:aconst_null     
		//    7   11:areturn         
					s = jsonobject.optString("_id");
		//    8   12:aload_1         
		//    9   13:ldc1            #49  <String "_id">
		//   10   15:invokevirtual   #55  <Method String JSONObject.optString(String)>
		//   11   18:astore          11
					s1 = jsonobject.optString("description");
		//   12   20:aload_1         
		//   13   21:ldc1            #57  <String "description">
		//   14   23:invokevirtual   #55  <Method String JSONObject.optString(String)>
		//   15   26:astore          12
					s2 = jsonobject.optString("tag", ((String) (null)));
		//   16   28:aload_1         
		//   17   29:ldc1            #59  <String "tag">
		//   18   31:aconst_null     
		//   19   32:invokevirtual   #62  <Method String JSONObject.optString(String, String)>
		//   20   35:astore          13
					obj1 = ((Object) (jsonobject.optString("externalId", ((String) (null)))));
		//   21   37:aload_1         
		//   22   38:ldc1            #64  <String "externalId">
		//   23   40:aconst_null     
		//   24   41:invokevirtual   #62  <Method String JSONObject.optString(String, String)>
		//   25   44:astore          5
					obj = ((Object) (jsonobject.optJSONObject("metadata")));
		//   26   46:aload_1         
		//   27   47:ldc1            #66  <String "metadata">
		//   28   49:invokevirtual   #70  <Method JSONObject JSONObject.optJSONObject(String)>
		//   29   52:astore          4
					s3 = jsonobject.optString("type");
		//   30   54:aload_1         
		//   31   55:ldc1            #72  <String "type">
		//   32   57:invokevirtual   #55  <Method String JSONObject.optString(String)>
		//   33   60:astore          14
					int i;
					if(s3 != null)
		//*  34   62:aload           14
		//*  35   64:ifnonnull       70
		//*  36   67:goto            88
					{
						i = s3.hashCode();
		//   37   70:aload           14
		//   38   72:invokevirtual   #78  <Method int String.hashCode()>
		//   39   75:istore_2        
						if(i == 0xaeecbcd0)
							break label1;
		//   40   76:iload_2         
		//   41   77:ldc1            #79  <Int 0xaeecbcd0>
		//   42   79:icmpeq          255
						break MISSING_BLOCK_LABEL_82;
					}
					do
		//*  43   82:iload_2         
		//*  44   83:ldc1            #80  <Int 0xe84e553a>
		//*  45   85:icmpeq          99
					{
						obj2 = obj;
		//   46   88:aload           4
		//   47   90:astore          6
						obj = ((Object) (obj6));
		//   48   92:aload           10
		//   49   94:astore          4
						break label0;
		//   50   96:goto            369
					} while(i != 0xe84e553a || !s3.equals("polygon"));
		//   51   99:aload           14
		//   52  101:ldc1            #82  <String "polygon">
		//   53  103:invokevirtual   #86  <Method boolean String.equals(Object)>
		//   54  106:ifeq            88
label2:
					{
						jsonobject = jsonobject.optJSONObject("geometry");
		//   55  109:aload_1         
		//   56  110:ldc1            #88  <String "geometry">
		//   57  112:invokevirtual   #70  <Method JSONObject JSONObject.optJSONObject(String)>
		//   58  115:astore_1        
						if(jsonobject != null)
		//*  59  116:aload_1         
		//*  60  117:ifnull          130
							jsonobject = ((JSONObject) (jsonobject.optJSONArray("coordinates")));
		//   61  120:aload_1         
		//   62  121:ldc1            #90  <String "coordinates">
		//   63  123:invokevirtual   #94  <Method JSONArray JSONObject.optJSONArray(String)>
		//   64  126:astore_1        
						else
		//*  65  127:goto            132
							jsonobject = null;
		//   66  130:aconst_null     
		//   67  131:astore_1        
						if(jsonobject != null)
		//*  68  132:aload_1         
		//*  69  133:ifnull          240
						{
							JSONArray jsonarray = ((JSONArray) (jsonobject)).optJSONArray(0);
		//   70  136:aload_1         
		//   71  137:iconst_0        
		//   72  138:invokevirtual   #99  <Method JSONArray JSONArray.optJSONArray(int)>
		//   73  141:astore          7
							if(jsonarray != null)
		//*  74  143:aload           7
		//*  75  145:ifnull          240
							{
								obj2 = ((Object) (new Coordinate[jsonarray.length()]));
		//   76  148:aload           7
		//   77  150:invokevirtual   #102 <Method int JSONArray.length()>
		//   78  153:anewarray       Coordinate[]
		//   79  156:astore          6
								int k = obj2.length;
		//   80  158:aload           6
		//   81  160:arraylength     
		//   82  161:istore_3        
								for(int j = 0; j < k; j++)
		//*  83  162:iconst_0        
		//*  84  163:istore_2        
		//*  85  164:iload_2         
		//*  86  165:iload_3         
		//*  87  166:icmpge          223
								{
									jsonobject = ((JSONObject) (jsonarray.optJSONArray(j)));
		//   88  169:aload           7
		//   89  171:iload_2         
		//   90  172:invokevirtual   #99  <Method JSONArray JSONArray.optJSONArray(int)>
		//   91  175:astore_1        
									if(jsonobject != null)
		//*  92  176:aload_1         
		//*  93  177:ifnull          201
										jsonobject = ((JSONObject) (new Coordinate(((JSONArray) (jsonobject)).optDouble(1), ((JSONArray) (jsonobject)).optDouble(0))));
		//   94  180:new             #104 <Class Coordinate>
		//   95  183:dup             
		//   96  184:aload_1         
		//   97  185:iconst_1        
		//   98  186:invokevirtual   #108 <Method double JSONArray.optDouble(int)>
		//   99  189:aload_1         
		//  100  190:iconst_0        
		//  101  191:invokevirtual   #108 <Method double JSONArray.optDouble(int)>
		//  102  194:invokespecial   #111 <Method void Coordinate(double, double)>
		//  103  197:astore_1        
									else
		//* 104  198:goto            211
										jsonobject = ((JSONObject) (new Coordinate(0.0D, 0.0D)));
		//  105  201:new             #104 <Class Coordinate>
		//  106  204:dup             
		//  107  205:dconst_0        
		//  108  206:dconst_0        
		//  109  207:invokespecial   #111 <Method void Coordinate(double, double)>
		//  110  210:astore_1        
									obj2[j] = ((/*<invalid signature>*/java.lang.Object) (jsonobject));
		//  111  211:aload           6
		//  112  213:iload_2         
		//  113  214:aload_1         
		//  114  215:aastore         
								}

		//  115  216:iload_2         
		//  116  217:iconst_1        
		//  117  218:iadd            
		//  118  219:istore_2        
		//* 119  220:goto            164
								jsonobject = ((JSONObject) (new RadarPolygonGeometry(((Coordinate []) (obj2)))));
		//  120  223:new             #113 <Class RadarPolygonGeometry>
		//  121  226:dup             
		//  122  227:aload           6
		//  123  229:invokespecial   #116 <Method void RadarPolygonGeometry(Coordinate[])>
		//  124  232:astore_1        
								obj2 = obj;
		//  125  233:aload           4
		//  126  235:astore          6
								break label2;
		//  127  237:goto            246
							}
						}
						jsonobject = null;
		//  128  240:aconst_null     
		//  129  241:astore_1        
						obj2 = obj;
		//  130  242:aload           4
		//  131  244:astore          6
					}
					obj = ((Object) ((RadarGeofenceGeometry)jsonobject));
		//  132  246:aload_1         
		//  133  247:checkcast       #118 <Class RadarGeofenceGeometry>
		//  134  250:astore          4
					break label0;
		//  135  252:goto            369
				}
				Object obj3 = obj1;
		//  136  255:aload           5
		//  137  257:astore          7
				Object obj4 = obj;
		//  138  259:aload           4
		//  139  261:astore          8
				obj = ((Object) (obj6));
		//  140  263:aload           10
		//  141  265:astore          4
				obj1 = obj3;
		//  142  267:aload           7
		//  143  269:astore          5
				obj2 = obj4;
		//  144  271:aload           8
		//  145  273:astore          6
				if(s3.equals("circle"))
		//* 146  275:aload           14
		//* 147  277:ldc1            #120 <String "circle">
		//* 148  279:invokevirtual   #86  <Method boolean String.equals(Object)>
		//* 149  282:ifeq            369
				{
					obj1 = ((Object) (jsonobject.optJSONObject("geometryCenter")));
		//  150  285:aload_1         
		//  151  286:ldc1            #122 <String "geometryCenter">
		//  152  288:invokevirtual   #70  <Method JSONObject JSONObject.optJSONObject(String)>
		//  153  291:astore          5
					obj = ((Object) (obj5));
		//  154  293:aload           9
		//  155  295:astore          4
					if(obj1 != null)
		//* 156  297:aload           5
		//* 157  299:ifnull          354
					{
						obj1 = ((Object) (((JSONObject) (obj1)).optJSONArray("coordinates")));
		//  158  302:aload           5
		//  159  304:ldc1            #90  <String "coordinates">
		//  160  306:invokevirtual   #94  <Method JSONArray JSONObject.optJSONArray(String)>
		//  161  309:astore          5
						obj = ((Object) (obj5));
		//  162  311:aload           9
		//  163  313:astore          4
						if(obj1 != null)
		//* 164  315:aload           5
		//* 165  317:ifnull          354
							obj = ((Object) (new RadarCircleGeometry(new Coordinate(((JSONArray) (obj1)).optDouble(1), ((JSONArray) (obj1)).optDouble(0)), jsonobject.optDouble("geometryRadius"))));
		//  166  320:new             #124 <Class RadarCircleGeometry>
		//  167  323:dup             
		//  168  324:new             #104 <Class Coordinate>
		//  169  327:dup             
		//  170  328:aload           5
		//  171  330:iconst_1        
		//  172  331:invokevirtual   #108 <Method double JSONArray.optDouble(int)>
		//  173  334:aload           5
		//  174  336:iconst_0        
		//  175  337:invokevirtual   #108 <Method double JSONArray.optDouble(int)>
		//  176  340:invokespecial   #111 <Method void Coordinate(double, double)>
		//  177  343:aload_1         
		//  178  344:ldc1            #126 <String "geometryRadius">
		//  179  346:invokevirtual   #129 <Method double JSONObject.optDouble(String)>
		//  180  349:invokespecial   #132 <Method void RadarCircleGeometry(Coordinate, double)>
		//  181  352:astore          4
					}
					obj = ((Object) ((RadarGeofenceGeometry)obj));
		//  182  354:aload           4
		//  183  356:checkcast       #118 <Class RadarGeofenceGeometry>
		//  184  359:astore          4
					obj2 = obj4;
		//  185  361:aload           8
		//  186  363:astore          6
					obj1 = obj3;
		//  187  365:aload           7
		//  188  367:astore          5
				}
			}
			if(obj == null)
		//* 189  369:aload           4
		//* 190  371:ifnull          377
		//* 191  374:goto            399
				obj = ((Object) ((RadarGeofenceGeometry)new RadarCircleGeometry(new Coordinate(0.0D, 0.0D), 0.0D)));
		//  192  377:new             #124 <Class RadarCircleGeometry>
		//  193  380:dup             
		//  194  381:new             #104 <Class Coordinate>
		//  195  384:dup             
		//  196  385:dconst_0        
		//  197  386:dconst_0        
		//  198  387:invokespecial   #111 <Method void Coordinate(double, double)>
		//  199  390:dconst_0        
		//  200  391:invokespecial   #132 <Method void RadarCircleGeometry(Coordinate, double)>
		//  201  394:checkcast       #118 <Class RadarGeofenceGeometry>
		//  202  397:astore          4
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "id");
		//  203  399:aload           11
		//  204  401:ldc1            #134 <String "id">
		//  205  403:invokestatic    #140 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s1)), "description");
		//  206  406:aload           12
		//  207  408:ldc1            #57  <String "description">
		//  208  410:invokestatic    #140 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return new RadarGeofence(s, s1, s2, ((String) (obj1)), ((JSONObject) (obj2)), ((RadarGeofenceGeometry) (obj)));
		//  209  413:new             #6   <Class RadarGeofence>
		//  210  416:dup             
		//  211  417:aload           11
		//  212  419:aload           12
		//  213  421:aload           13
		//  214  423:aload           5
		//  215  425:aload           6
		//  216  427:aload           4
		//  217  429:invokespecial   #143 <Method void RadarGeofence(String, String, String, String, JSONObject, RadarGeofenceGeometry)>
		//  218  432:areturn         
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void RadarGeofence$Companion()>
		//    2    4:return          
		}
	}


	public RadarGeofence(String s, String s1, String s2, String s3, JSONObject jsonobject, RadarGeofenceGeometry radargeofencegeometry)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "id");
	//    0    0:aload_1         
	//    1    1:ldc1            #84  <String "id">
	//    2    3:invokestatic    #90  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "description");
	//    3    6:aload_2         
	//    4    7:ldc1            #47  <String "description">
	//    5    9:invokestatic    #90  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (radargeofencegeometry)), "geometry");
	//    6   12:aload           6
	//    7   14:ldc1            #54  <String "geometry">
	//    8   16:invokestatic    #90  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//    9   19:aload_0         
	//   10   20:invokespecial   #92  <Method void Object()>
		id = s;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:putfield        #94  <Field String id>
		description = s1;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #96  <Field String description>
		tag = s2;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #98  <Field String tag>
		externalId = s3;
	//   20   38:aload_0         
	//   21   39:aload           4
	//   22   41:putfield        #100 <Field String externalId>
		metadata = jsonobject;
	//   23   44:aload_0         
	//   24   45:aload           5
	//   25   47:putfield        #102 <Field JSONObject metadata>
		geometry = radargeofencegeometry;
	//   26   50:aload_0         
	//   27   51:aload           6
	//   28   53:putfield        #104 <Field RadarGeofenceGeometry geometry>
	//   29   56:return          
	}

	public static final RadarGeofence fromJson(JSONObject jsonobject)
	{
		return Companion.fromJson(jsonobject);
	//    0    0:getstatic       #82  <Field RadarGeofence$Companion Companion>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #110 <Method RadarGeofence RadarGeofence$Companion.fromJson(JSONObject)>
	//    3    7:areturn         
	}

	public final String getDescription()
	{
		return description;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field String description>
	//    2    4:areturn         
	}

	public final String getExternalId()
	{
		return externalId;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String externalId>
	//    2    4:areturn         
	}

	public final RadarGeofenceGeometry getGeometry()
	{
		return geometry;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field RadarGeofenceGeometry geometry>
	//    2    4:areturn         
	}

	public final String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field String id>
	//    2    4:areturn         
	}

	public final JSONObject getMetadata()
	{
		return metadata;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field JSONObject metadata>
	//    2    4:areturn         
	}

	public final String getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field String tag>
	//    2    4:areturn         
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final String FIELD_COORDINATES = "coordinates";
	public static final String FIELD_DESCRIPTION = "description";
	public static final String FIELD_EXTERNAL_ID = "externalId";
	public static final String FIELD_GEOMETRY_CENTER = "geometryCenter";
	public static final String FIELD_GEOMETRY_POLYGON = "geometry";
	public static final String FIELD_GEOMETRY_RADIUS = "geometryRadius";
	public static final String FIELD_ID = "_id";
	public static final String FIELD_METADATA = "metadata";
	public static final String FIELD_TAG = "tag";
	public static final String FIELD_TYPE = "type";
	public static final String TYPE_CIRCLE = "circle";
	public static final String TYPE_POLYGON = "polygon";
	private final String description;
	private final String externalId;
	private final RadarGeofenceGeometry geometry;
	private final String id;
	private final JSONObject metadata;
	private final String tag;

	static 
	{
	//    0    0:new             #6   <Class RadarGeofence$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #80  <Method void RadarGeofence$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #82  <Field RadarGeofence$Companion Companion>
	//*   5   11:return          
	}
}
