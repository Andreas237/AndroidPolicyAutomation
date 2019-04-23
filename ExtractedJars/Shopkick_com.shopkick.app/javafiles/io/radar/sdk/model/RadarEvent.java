// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.model;

import android.location.Location;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package io.radar.sdk.model:
//			RadarPlace, RadarGeofence

public final class RadarEvent
{
	public static final class Companion
	{

		private final RadarEvent fromJson(JSONObject jsonobject)
		{
			Object obj;
			Date date;
			String s2;
label0:
			{
				s2 = jsonobject.optString("_id");
		//    0    0:aload_1         
		//    1    1:ldc1            #58  <String "_id">
		//    2    3:invokevirtual   #64  <Method String JSONObject.optString(String)>
		//    3    6:astore          17
				obj = ((Object) (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")));
		//    4    8:new             #66  <Class SimpleDateFormat>
		//    5   11:dup             
		//    6   12:ldc1            #68  <String "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'">
		//    7   14:invokespecial   #71  <Method void SimpleDateFormat(String)>
		//    8   17:astore          8
				((SimpleDateFormat) (obj)).setTimeZone(TimeZone.getTimeZone("UTC"));
		//    9   19:aload           8
		//   10   21:ldc1            #73  <String "UTC">
		//   11   23:invokestatic    #79  <Method TimeZone TimeZone.getTimeZone(String)>
		//   12   26:invokevirtual   #83  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
				String s = jsonobject.optString("createdAt", ((String) (null)));
		//   13   29:aload_1         
		//   14   30:ldc1            #85  <String "createdAt">
		//   15   32:aconst_null     
		//   16   33:invokevirtual   #88  <Method String JSONObject.optString(String, String)>
		//   17   36:astore          9
				if(s != null)
		//*  18   38:aload           9
		//*  19   40:ifnull          60
				{
					date = ((SimpleDateFormat) (obj)).parse(s);
		//   20   43:aload           8
		//   21   45:aload           9
		//   22   47:invokevirtual   #92  <Method Date SimpleDateFormat.parse(String)>
		//   23   50:astore          11
					if(date != null)
		//*  24   52:aload           11
		//*  25   54:ifnull          60
						break label0;
		//   26   57:goto            69
				}
				date = new Date();
		//   27   60:new             #94  <Class Date>
		//   28   63:dup             
		//   29   64:invokespecial   #95  <Method void Date()>
		//   30   67:astore          11
			}
			Date date1;
label1:
			{
				String s1 = jsonobject.optString("actualCreatedAt", ((String) (null)));
		//   31   69:aload_1         
		//   32   70:ldc1            #97  <String "actualCreatedAt">
		//   33   72:aconst_null     
		//   34   73:invokevirtual   #88  <Method String JSONObject.optString(String, String)>
		//   35   76:astore          9
				if(s1 != null)
		//*  36   78:aload           9
		//*  37   80:ifnull          100
				{
					date1 = ((SimpleDateFormat) (obj)).parse(s1);
		//   38   83:aload           8
		//   39   85:aload           9
		//   40   87:invokevirtual   #92  <Method Date SimpleDateFormat.parse(String)>
		//   41   90:astore          12
					if(date1 != null)
		//*  42   92:aload           12
		//*  43   94:ifnull          100
						break label1;
		//   44   97:goto            109
				}
				date1 = new Date();
		//   45  100:new             #94  <Class Date>
		//   46  103:dup             
		//   47  104:invokespecial   #95  <Method void Date()>
		//   48  107:astore          12
			}
			boolean flag;
label2:
			{
				flag = jsonobject.optBoolean("live");
		//   49  109:aload_1         
		//   50  110:ldc1            #99  <String "live">
		//   51  112:invokevirtual   #103 <Method boolean JSONObject.optBoolean(String)>
		//   52  115:istore          7
				obj = ((Object) (jsonobject.optString("type")));
		//   53  117:aload_1         
		//   54  118:ldc1            #105 <String "type">
		//   55  120:invokevirtual   #64  <Method String JSONObject.optString(String)>
		//   56  123:astore          8
				if(obj != null)
		//*  57  125:aload           8
		//*  58  127:ifnonnull       133
		//*  59  130:goto            437
					switch(((String) (obj)).hashCode())
		//*  60  133:aload           8
		//*  61  135:invokevirtual   #111 <Method int String.hashCode()>
					{
					default:
						break;

		//*  62  138:lookupswitch    11: default 236
		//		               -2086465761: 419
		//		               -1716268600: 401
		//		               -1698734565: 383
		//		               -1161746201: 365
		//		               -878348537: 347
		//		               -609787906: 329
		//		               325491979: 311
		//		               450282474: 293
		//		               653871923: 275
		//		               1081142108: 257
		//		               1356297932: 239
		//*  63  236:goto            437
					case 1356297932: 
						if(((String) (obj)).equals("user.nearby_place_chain"))
		//*  64  239:aload           8
		//*  65  241:ldc1            #113 <String "user.nearby_place_chain">
		//*  66  243:invokevirtual   #117 <Method boolean String.equals(Object)>
		//*  67  246:ifeq            437
						{
							obj = ((Object) (RadarEventType.USER_NEARBY_PLACE_CHAIN));
		//   68  249:getstatic       #123 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_NEARBY_PLACE_CHAIN>
		//   69  252:astore          8
							break label2;
		//   70  254:goto            442
						}
						break;

					case 1081142108: 
						if(!((String) (obj)).equals("user.entered_place"))
							break;
		//   71  257:aload           8
		//   72  259:ldc1            #125 <String "user.entered_place">
		//   73  261:invokevirtual   #117 <Method boolean String.equals(Object)>
		//   74  264:ifeq            437
						obj = ((Object) (RadarEventType.USER_ENTERED_PLACE));
		//   75  267:getstatic       #128 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_ENTERED_PLACE>
		//   76  270:astore          8
						break label2;
		//   77  272:goto            442

					case 653871923: 
						if(!((String) (obj)).equals("user.stopped_traveling"))
							break;
		//   78  275:aload           8
		//   79  277:ldc1            #130 <String "user.stopped_traveling">
		//   80  279:invokevirtual   #117 <Method boolean String.equals(Object)>
		//   81  282:ifeq            437
						obj = ((Object) (RadarEventType.USER_STOPPED_TRAVELING));
		//   82  285:getstatic       #133 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_STOPPED_TRAVELING>
		//   83  288:astore          8
						break label2;
		//   84  290:goto            442

					case 450282474: 
						if(!((String) (obj)).equals("user.entered_home"))
							break;
		//   85  293:aload           8
		//   86  295:ldc1            #135 <String "user.entered_home">
		//   87  297:invokevirtual   #117 <Method boolean String.equals(Object)>
		//   88  300:ifeq            437
						obj = ((Object) (RadarEventType.USER_ENTERED_HOME));
		//   89  303:getstatic       #138 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_ENTERED_HOME>
		//   90  306:astore          8
						break label2;
		//   91  308:goto            442

					case 325491979: 
						if(!((String) (obj)).equals("user.entered_geofence"))
							break;
		//   92  311:aload           8
		//   93  313:ldc1            #140 <String "user.entered_geofence">
		//   94  315:invokevirtual   #117 <Method boolean String.equals(Object)>
		//   95  318:ifeq            437
						obj = ((Object) (RadarEventType.USER_ENTERED_GEOFENCE));
		//   96  321:getstatic       #143 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_ENTERED_GEOFENCE>
		//   97  324:astore          8
						break label2;
		//   98  326:goto            442

					case -609787906: 
						if(!((String) (obj)).equals("user.exited_home"))
							break;
		//   99  329:aload           8
		//  100  331:ldc1            #145 <String "user.exited_home">
		//  101  333:invokevirtual   #117 <Method boolean String.equals(Object)>
		//  102  336:ifeq            437
						obj = ((Object) (RadarEventType.USER_EXITED_HOME));
		//  103  339:getstatic       #148 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_EXITED_HOME>
		//  104  342:astore          8
						break label2;
		//  105  344:goto            442

					case -878348537: 
						if(!((String) (obj)).equals("user.entered_office"))
							break;
		//  106  347:aload           8
		//  107  349:ldc1            #150 <String "user.entered_office">
		//  108  351:invokevirtual   #117 <Method boolean String.equals(Object)>
		//  109  354:ifeq            437
						obj = ((Object) (RadarEventType.USER_ENTERED_OFFICE));
		//  110  357:getstatic       #153 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_ENTERED_OFFICE>
		//  111  360:astore          8
						break label2;
		//  112  362:goto            442

					case -1161746201: 
						if(!((String) (obj)).equals("user.started_traveling"))
							break;
		//  113  365:aload           8
		//  114  367:ldc1            #155 <String "user.started_traveling">
		//  115  369:invokevirtual   #117 <Method boolean String.equals(Object)>
		//  116  372:ifeq            437
						obj = ((Object) (RadarEventType.USER_STARTED_TRAVELING));
		//  117  375:getstatic       #158 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_STARTED_TRAVELING>
		//  118  378:astore          8
						break label2;
		//  119  380:goto            442

					case -1698734565: 
						if(!((String) (obj)).equals("user.exited_office"))
							break;
		//  120  383:aload           8
		//  121  385:ldc1            #160 <String "user.exited_office">
		//  122  387:invokevirtual   #117 <Method boolean String.equals(Object)>
		//  123  390:ifeq            437
						obj = ((Object) (RadarEventType.USER_EXITED_OFFICE));
		//  124  393:getstatic       #163 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_EXITED_OFFICE>
		//  125  396:astore          8
						break label2;
		//  126  398:goto            442

					case -1716268600: 
						if(!((String) (obj)).equals("user.exited_place"))
							break;
		//  127  401:aload           8
		//  128  403:ldc1            #165 <String "user.exited_place">
		//  129  405:invokevirtual   #117 <Method boolean String.equals(Object)>
		//  130  408:ifeq            437
						obj = ((Object) (RadarEventType.USER_EXITED_PLACE));
		//  131  411:getstatic       #168 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_EXITED_PLACE>
		//  132  414:astore          8
						break label2;
		//  133  416:goto            442

					case -2086465761: 
						if(!((String) (obj)).equals("user.exited_geofence"))
							break;
		//  134  419:aload           8
		//  135  421:ldc1            #170 <String "user.exited_geofence">
		//  136  423:invokevirtual   #117 <Method boolean String.equals(Object)>
		//  137  426:ifeq            437
						obj = ((Object) (RadarEventType.USER_EXITED_GEOFENCE));
		//  138  429:getstatic       #173 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.USER_EXITED_GEOFENCE>
		//  139  432:astore          8
						break label2;
		//  140  434:goto            442
					}
				obj = ((Object) (RadarEventType.UNKNOWN));
		//  141  437:getstatic       #176 <Field RadarEvent$RadarEventType RadarEvent$RadarEventType.UNKNOWN>
		//  142  440:astore          8
			}
			RadarGeofence radargeofence = RadarGeofence.Companion.fromJson(jsonobject.optJSONObject("geofence"));
		//  143  442:getstatic       #181 <Field RadarGeofence$Companion RadarGeofence.Companion>
		//  144  445:aload_1         
		//  145  446:ldc1            #183 <String "geofence">
		//  146  448:invokevirtual   #187 <Method JSONObject JSONObject.optJSONObject(String)>
		//  147  451:invokevirtual   #192 <Method RadarGeofence RadarGeofence$Companion.fromJson(JSONObject)>
		//  148  454:astore          18
			Object obj1 = ((Object) (jsonobject.optJSONObject("place")));
		//  149  456:aload_1         
		//  150  457:ldc1            #194 <String "place">
		//  151  459:invokevirtual   #187 <Method JSONObject JSONObject.optJSONObject(String)>
		//  152  462:astore          9
			RadarPlace radarplace;
			if(obj1 != null)
		//* 153  464:aload           9
		//* 154  466:ifnull          482
				radarplace = RadarPlace.Companion.fromJson(((JSONObject) (obj1)));
		//  155  469:getstatic       #199 <Field RadarPlace$Companion RadarPlace.Companion>
		//  156  472:aload           9
		//  157  474:invokevirtual   #204 <Method RadarPlace RadarPlace$Companion.fromJson(JSONObject)>
		//  158  477:astore          13
			else
		//* 159  479:goto            485
				radarplace = null;
		//  160  482:aconst_null     
		//  161  483:astore          13
			Object obj2 = ((Object) (jsonobject.optJSONArray("alternatePlaces")));
		//  162  485:aload_1         
		//  163  486:ldc1            #206 <String "alternatePlaces">
		//  164  488:invokevirtual   #210 <Method JSONArray JSONObject.optJSONArray(String)>
		//  165  491:astore          15
			RadarPlace aradarplace1[];
			if(obj2 != null)
		//* 166  493:aload           15
		//* 167  495:ifnull          573
			{
				RadarPlace aradarplace[] = new RadarPlace[((JSONArray) (obj2)).length()];
		//  168  498:aload           15
		//  169  500:invokevirtual   #215 <Method int JSONArray.length()>
		//  170  503:anewarray       RadarPlace[]
		//  171  506:astore          10
				int k = aradarplace.length;
		//  172  508:aload           10
		//  173  510:arraylength     
		//  174  511:istore          6
				int i = 0;
		//  175  513:iconst_0        
		//  176  514:istore          5
				do
				{
					aradarplace1 = aradarplace;
		//  177  516:aload           10
		//  178  518:astore          14
					if(i >= k)
						break;
		//  179  520:iload           5
		//  180  522:iload           6
		//  181  524:icmpge          576
					obj1 = ((Object) (((JSONArray) (obj2)).optJSONObject(i)));
		//  182  527:aload           15
		//  183  529:iload           5
		//  184  531:invokevirtual   #218 <Method JSONObject JSONArray.optJSONObject(int)>
		//  185  534:astore          9
					if(obj1 != null)
		//* 186  536:aload           9
		//* 187  538:ifnull          554
						obj1 = ((Object) (RadarPlace.Companion.fromJson(((JSONObject) (obj1)))));
		//  188  541:getstatic       #199 <Field RadarPlace$Companion RadarPlace.Companion>
		//  189  544:aload           9
		//  190  546:invokevirtual   #204 <Method RadarPlace RadarPlace$Companion.fromJson(JSONObject)>
		//  191  549:astore          9
					else
		//* 192  551:goto            557
						obj1 = null;
		//  193  554:aconst_null     
		//  194  555:astore          9
					aradarplace[i] = ((RadarPlace) (obj1));
		//  195  557:aload           10
		//  196  559:iload           5
		//  197  561:aload           9
		//  198  563:aastore         
					i++;
		//  199  564:iload           5
		//  200  566:iconst_1        
		//  201  567:iadd            
		//  202  568:istore          5
				} while(true);
		//  203  570:goto            516
			} else
			{
				aradarplace1 = null;
		//  204  573:aconst_null     
		//  205  574:astore          14
			}
			obj1 = ((Object) (jsonobject.optJSONObject("verifiedPlace")));
		//  206  576:aload_1         
		//  207  577:ldc1            #220 <String "verifiedPlace">
		//  208  579:invokevirtual   #187 <Method JSONObject JSONObject.optJSONObject(String)>
		//  209  582:astore          9
			if(obj1 != null)
		//* 210  584:aload           9
		//* 211  586:ifnull          602
				obj2 = ((Object) (RadarPlace.Companion.fromJson(((JSONObject) (obj1)))));
		//  212  589:getstatic       #199 <Field RadarPlace$Companion RadarPlace.Companion>
		//  213  592:aload           9
		//  214  594:invokevirtual   #204 <Method RadarPlace RadarPlace$Companion.fromJson(JSONObject)>
		//  215  597:astore          15
			else
		//* 216  599:goto            605
				obj2 = null;
		//  217  602:aconst_null     
		//  218  603:astore          15
			int j = jsonobject.optInt("verification");
		//  219  605:aload_1         
		//  220  606:ldc1            #222 <String "verification">
		//  221  608:invokevirtual   #226 <Method int JSONObject.optInt(String)>
		//  222  611:istore          5
			RadarEventVerification radareventverification;
			if(j != -1)
		//* 223  613:iload           5
		//* 224  615:iconst_m1       
		//* 225  616:icmpeq          641
			{
				if(j != 1)
		//* 226  619:iload           5
		//* 227  621:iconst_1        
		//* 228  622:icmpeq          633
					radareventverification = RadarEventVerification.UNVERIFY;
		//  229  625:getstatic       #232 <Field RadarEvent$RadarEventVerification RadarEvent$RadarEventVerification.UNVERIFY>
		//  230  628:astore          10
				else
		//* 231  630:goto            646
					radareventverification = RadarEventVerification.ACCEPT;
		//  232  633:getstatic       #235 <Field RadarEvent$RadarEventVerification RadarEvent$RadarEventVerification.ACCEPT>
		//  233  636:astore          10
			} else
		//* 234  638:goto            646
			{
				radareventverification = RadarEventVerification.REJECT;
		//  235  641:getstatic       #238 <Field RadarEvent$RadarEventVerification RadarEvent$RadarEventVerification.REJECT>
		//  236  644:astore          10
			}
			switch(jsonobject.optInt("confidence"))
		//* 237  646:aload_1         
		//* 238  647:ldc1            #240 <String "confidence">
		//* 239  649:invokevirtual   #226 <Method int JSONObject.optInt(String)>
			{
		//* 240  652:tableswitch     1 3: default 680
		//		               1 704
		//		               2 696
		//		               3 688
			default:
				obj1 = ((Object) (RadarEventConfidence.NONE));
		//  241  680:getstatic       #246 <Field RadarEvent$RadarEventConfidence RadarEvent$RadarEventConfidence.NONE>
		//  242  683:astore          9
				break;

		//* 243  685:goto            709
			case 3: // '\003'
				obj1 = ((Object) (RadarEventConfidence.HIGH));
		//  244  688:getstatic       #249 <Field RadarEvent$RadarEventConfidence RadarEvent$RadarEventConfidence.HIGH>
		//  245  691:astore          9
				break;

		//* 246  693:goto            709
			case 2: // '\002'
				obj1 = ((Object) (RadarEventConfidence.MEDIUM));
		//  247  696:getstatic       #252 <Field RadarEvent$RadarEventConfidence RadarEvent$RadarEventConfidence.MEDIUM>
		//  248  699:astore          9
				break;

		//* 249  701:goto            709
			case 1: // '\001'
				obj1 = ((Object) (RadarEventConfidence.LOW));
		//  250  704:getstatic       #255 <Field RadarEvent$RadarEventConfidence RadarEvent$RadarEventConfidence.LOW>
		//  251  707:astore          9
				break;
			}
			float f = (float)jsonobject.optDouble("duration", 0.0D);
		//  252  709:aload_1         
		//  253  710:ldc2            #257 <String "duration">
		//  254  713:dconst_0        
		//  255  714:invokevirtual   #261 <Method double JSONObject.optDouble(String, double)>
		//  256  717:d2f             
		//  257  718:fstore          4
			Object obj3 = ((Object) (jsonobject.optJSONObject("location")));
		//  258  720:aload_1         
		//  259  721:ldc2            #263 <String "location">
		//  260  724:invokevirtual   #187 <Method JSONObject JSONObject.optJSONObject(String)>
		//  261  727:astore          16
			if(obj3 != null)
		//* 262  729:aload           16
		//* 263  731:ifnull          747
				obj3 = ((Object) (((JSONObject) (obj3)).optJSONArray("coordinates")));
		//  264  734:aload           16
		//  265  736:ldc2            #265 <String "coordinates">
		//  266  739:invokevirtual   #210 <Method JSONArray JSONObject.optJSONArray(String)>
		//  267  742:astore          16
			else
		//* 268  744:goto            750
				obj3 = null;
		//  269  747:aconst_null     
		//  270  748:astore          16
			Location location1 = new Location("radar");
		//  271  750:new             #267 <Class Location>
		//  272  753:dup             
		//  273  754:ldc2            #269 <String "radar">
		//  274  757:invokespecial   #270 <Method void Location(String)>
		//  275  760:astore          19
			double d;
			if(obj3 != null)
		//* 276  762:aload           16
		//* 277  764:ifnull          777
				d = ((JSONArray) (obj3)).optDouble(0);
		//  278  767:aload           16
		//  279  769:iconst_0        
		//  280  770:invokevirtual   #273 <Method double JSONArray.optDouble(int)>
		//  281  773:dstore_2        
			else
		//* 282  774:goto            779
				d = 0.0D;
		//  283  777:dconst_0        
		//  284  778:dstore_2        
			location1.setLongitude(d);
		//  285  779:aload           19
		//  286  781:dload_2         
		//  287  782:invokevirtual   #277 <Method void Location.setLongitude(double)>
			if(obj3 != null)
		//* 288  785:aload           16
		//* 289  787:ifnull          800
				d = ((JSONArray) (obj3)).optDouble(1);
		//  290  790:aload           16
		//  291  792:iconst_1        
		//  292  793:invokevirtual   #273 <Method double JSONArray.optDouble(int)>
		//  293  796:dstore_2        
			else
		//* 294  797:goto            802
				d = 0.0D;
		//  295  800:dconst_0        
		//  296  801:dstore_2        
			location1.setLatitude(d);
		//  297  802:aload           19
		//  298  804:dload_2         
		//  299  805:invokevirtual   #280 <Method void Location.setLatitude(double)>
			if(jsonobject.has("locationAccuracy"))
		//* 300  808:aload_1         
		//* 301  809:ldc2            #282 <String "locationAccuracy">
		//* 302  812:invokevirtual   #285 <Method boolean JSONObject.has(String)>
		//* 303  815:ifeq            831
				location1.setAccuracy((float)jsonobject.getDouble("locationAccuracy"));
		//  304  818:aload           19
		//  305  820:aload_1         
		//  306  821:ldc2            #282 <String "locationAccuracy">
		//  307  824:invokevirtual   #289 <Method double JSONObject.getDouble(String)>
		//  308  827:d2f             
		//  309  828:invokevirtual   #293 <Method void Location.setAccuracy(float)>
			location1.setTime(date.getTime());
		//  310  831:aload           19
		//  311  833:aload           11
		//  312  835:invokevirtual   #297 <Method long Date.getTime()>
		//  313  838:invokevirtual   #301 <Method void Location.setTime(long)>
			Intrinsics.checkExpressionValueIsNotNull(((Object) (s2)), "id");
		//  314  841:aload           17
		//  315  843:ldc2            #303 <String "id">
		//  316  846:invokestatic    #309 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			return new RadarEvent(s2, date, date1, flag, ((RadarEventType) (obj)), radargeofence, radarplace, aradarplace1, ((RadarPlace) (obj2)), radareventverification, ((RadarEventConfidence) (obj1)), f, location1);
		//  317  849:new             #6   <Class RadarEvent>
		//  318  852:dup             
		//  319  853:aload           17
		//  320  855:aload           11
		//  321  857:aload           12
		//  322  859:iload           7
		//  323  861:aload           8
		//  324  863:aload           18
		//  325  865:aload           13
		//  326  867:aload           14
		//  327  869:aload           15
		//  328  871:aload           10
		//  329  873:aload           9
		//  330  875:fload           4
		//  331  877:aload           19
		//  332  879:invokespecial   #312 <Method void RadarEvent(String, Date, Date, boolean, RadarEvent$RadarEventType, RadarGeofence, RadarPlace, RadarPlace[], RadarPlace, RadarEvent$RadarEventVerification, RadarEvent$RadarEventConfidence, float, Location)>
		//  333  882:areturn         
		}

		public final RadarEvent[] eventsFromJSONArray$sdk_release(JSONArray jsonarray)
		{
			Intrinsics.checkParameterIsNotNull(((Object) (jsonarray)), "array");
		//    0    0:aload_1         
		//    1    1:ldc2            #315 <String "array">
		//    2    4:invokestatic    #318 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			RadarEvent aradarevent[] = new RadarEvent[jsonarray.length()];
		//    3    7:aload_1         
		//    4    8:invokevirtual   #215 <Method int JSONArray.length()>
		//    5   11:anewarray       RadarEvent[]
		//    6   14:astore          5
			int j = aradarevent.length;
		//    7   16:aload           5
		//    8   18:arraylength     
		//    9   19:istore_3        
			for(int i = 0; i < j; i++)
		//*  10   20:iconst_0        
		//*  11   21:istore_2        
		//*  12   22:iload_2         
		//*  13   23:iload_3         
		//*  14   24:icmpge          74
			{
				Companion companion = RadarEvent.Companion;
		//   15   27:getstatic       #320 <Field RadarEvent$Companion RadarEvent.Companion>
		//   16   30:astore          6
				JSONObject jsonobject = jsonarray.optJSONObject(i);
		//   17   32:aload_1         
		//   18   33:iload_2         
		//   19   34:invokevirtual   #218 <Method JSONObject JSONArray.optJSONObject(int)>
		//   20   37:astore          4
				if(jsonobject == null)
		//*  21   39:aload           4
		//*  22   41:ifnull          47
		//*  23   44:goto            56
					jsonobject = new JSONObject();
		//   24   47:new             #60  <Class JSONObject>
		//   25   50:dup             
		//   26   51:invokespecial   #321 <Method void JSONObject()>
		//   27   54:astore          4
				aradarevent[i] = companion.fromJson(jsonobject);
		//   28   56:aload           5
		//   29   58:iload_2         
		//   30   59:aload           6
		//   31   61:aload           4
		//   32   63:invokespecial   #323 <Method RadarEvent fromJson(JSONObject)>
		//   33   66:aastore         
			}

		//   34   67:iload_2         
		//   35   68:iconst_1        
		//   36   69:iadd            
		//   37   70:istore_2        
		//*  38   71:goto            22
			return aradarevent;
		//   39   74:aload           5
		//   40   76:areturn         
		}

		private Companion()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #49  <Method void Object()>
		//    2    4:return          
		}

		public Companion(DefaultConstructorMarker defaultconstructormarker)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #52  <Method void RadarEvent$Companion()>
		//    2    4:return          
		}
	}

	public static final class RadarEventConfidence extends Enum
	{

		public static RadarEventConfidence valueOf(String s)
		{
			return (RadarEventConfidence)Enum.valueOf(io/radar/sdk/model/RadarEvent$RadarEventConfidence, s);
		//    0    0:ldc1            #2   <Class RadarEvent$RadarEventConfidence>
		//    1    2:aload_0         
		//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class RadarEvent$RadarEventConfidence>
		//    4    9:areturn         
		}

		public static RadarEventConfidence[] values()
		{
			return (RadarEventConfidence[])((RadarEventConfidence []) ($VALUES)).clone();
		//    0    0:getstatic       #48  <Field RadarEvent$RadarEventConfidence[] $VALUES>
		//    1    3:invokevirtual   #63  <Method Object _5B_Lio.radar.sdk.model.RadarEvent$RadarEventConfidence_3B_.clone()>
		//    2    6:checkcast       #59  <Class RadarEvent$RadarEventConfidence[]>
		//    3    9:areturn         
		}

		private static final RadarEventConfidence $VALUES[];
		public static final RadarEventConfidence HIGH;
		public static final RadarEventConfidence LOW;
		public static final RadarEventConfidence MEDIUM;
		public static final RadarEventConfidence NONE;

		static 
		{
			RadarEventConfidence radareventconfidence = new RadarEventConfidence("NONE", 0);
		//    0    0:new             #2   <Class RadarEvent$RadarEventConfidence>
		//    1    3:dup             
		//    2    4:ldc1            #32  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #35  <Method void RadarEvent$RadarEventConfidence(String, int)>
		//    5   10:astore_0        
			NONE = radareventconfidence;
		//    6   11:aload_0         
		//    7   12:putstatic       #37  <Field RadarEvent$RadarEventConfidence NONE>
			RadarEventConfidence radareventconfidence1 = new RadarEventConfidence("LOW", 1);
		//    8   15:new             #2   <Class RadarEvent$RadarEventConfidence>
		//    9   18:dup             
		//   10   19:ldc1            #38  <String "LOW">
		//   11   21:iconst_1        
		//   12   22:invokespecial   #35  <Method void RadarEvent$RadarEventConfidence(String, int)>
		//   13   25:astore_1        
			LOW = radareventconfidence1;
		//   14   26:aload_1         
		//   15   27:putstatic       #40  <Field RadarEvent$RadarEventConfidence LOW>
			RadarEventConfidence radareventconfidence2 = new RadarEventConfidence("MEDIUM", 2);
		//   16   30:new             #2   <Class RadarEvent$RadarEventConfidence>
		//   17   33:dup             
		//   18   34:ldc1            #41  <String "MEDIUM">
		//   19   36:iconst_2        
		//   20   37:invokespecial   #35  <Method void RadarEvent$RadarEventConfidence(String, int)>
		//   21   40:astore_2        
			MEDIUM = radareventconfidence2;
		//   22   41:aload_2         
		//   23   42:putstatic       #43  <Field RadarEvent$RadarEventConfidence MEDIUM>
			RadarEventConfidence radareventconfidence3 = new RadarEventConfidence("HIGH", 3);
		//   24   45:new             #2   <Class RadarEvent$RadarEventConfidence>
		//   25   48:dup             
		//   26   49:ldc1            #44  <String "HIGH">
		//   27   51:iconst_3        
		//   28   52:invokespecial   #35  <Method void RadarEvent$RadarEventConfidence(String, int)>
		//   29   55:astore_3        
			HIGH = radareventconfidence3;
		//   30   56:aload_3         
		//   31   57:putstatic       #46  <Field RadarEvent$RadarEventConfidence HIGH>
			$VALUES = (new RadarEventConfidence[] {
				radareventconfidence, radareventconfidence1, radareventconfidence2, radareventconfidence3
			});
		//   32   60:iconst_4        
		//   33   61:anewarray       RadarEventConfidence[]
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
		//   50   80:putstatic       #48  <Field RadarEvent$RadarEventConfidence[] $VALUES>
		//*  51   83:return          
		}

		protected RadarEventConfidence(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #50  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class RadarEventType extends Enum
	{

		public static RadarEventType valueOf(String s)
		{
			return (RadarEventType)Enum.valueOf(io/radar/sdk/model/RadarEvent$RadarEventType, s);
		//    0    0:ldc1            #2   <Class RadarEvent$RadarEventType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #88  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class RadarEvent$RadarEventType>
		//    4    9:areturn         
		}

		public static RadarEventType[] values()
		{
			return (RadarEventType[])((RadarEventType []) ($VALUES)).clone();
		//    0    0:getstatic       #80  <Field RadarEvent$RadarEventType[] $VALUES>
		//    1    3:invokevirtual   #95  <Method Object _5B_Lio.radar.sdk.model.RadarEvent$RadarEventType_3B_.clone()>
		//    2    6:checkcast       #91  <Class RadarEvent$RadarEventType[]>
		//    3    9:areturn         
		}

		private static final RadarEventType $VALUES[];
		public static final RadarEventType UNKNOWN;
		public static final RadarEventType USER_ENTERED_GEOFENCE;
		public static final RadarEventType USER_ENTERED_HOME;
		public static final RadarEventType USER_ENTERED_OFFICE;
		public static final RadarEventType USER_ENTERED_PLACE;
		public static final RadarEventType USER_EXITED_GEOFENCE;
		public static final RadarEventType USER_EXITED_HOME;
		public static final RadarEventType USER_EXITED_OFFICE;
		public static final RadarEventType USER_EXITED_PLACE;
		public static final RadarEventType USER_NEARBY_PLACE_CHAIN;
		public static final RadarEventType USER_STARTED_TRAVELING;
		public static final RadarEventType USER_STOPPED_TRAVELING;

		static 
		{
			RadarEventType radareventtype = new RadarEventType("UNKNOWN", 0);
		//    0    0:new             #2   <Class RadarEvent$RadarEventType>
		//    1    3:dup             
		//    2    4:ldc1            #40  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//    5   10:astore_0        
			UNKNOWN = radareventtype;
		//    6   11:aload_0         
		//    7   12:putstatic       #45  <Field RadarEvent$RadarEventType UNKNOWN>
			RadarEventType radareventtype1 = new RadarEventType("USER_ENTERED_GEOFENCE", 1);
		//    8   15:new             #2   <Class RadarEvent$RadarEventType>
		//    9   18:dup             
		//   10   19:ldc1            #46  <String "USER_ENTERED_GEOFENCE">
		//   11   21:iconst_1        
		//   12   22:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   13   25:astore_1        
			USER_ENTERED_GEOFENCE = radareventtype1;
		//   14   26:aload_1         
		//   15   27:putstatic       #48  <Field RadarEvent$RadarEventType USER_ENTERED_GEOFENCE>
			RadarEventType radareventtype2 = new RadarEventType("USER_EXITED_GEOFENCE", 2);
		//   16   30:new             #2   <Class RadarEvent$RadarEventType>
		//   17   33:dup             
		//   18   34:ldc1            #49  <String "USER_EXITED_GEOFENCE">
		//   19   36:iconst_2        
		//   20   37:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   21   40:astore_2        
			USER_EXITED_GEOFENCE = radareventtype2;
		//   22   41:aload_2         
		//   23   42:putstatic       #51  <Field RadarEvent$RadarEventType USER_EXITED_GEOFENCE>
			RadarEventType radareventtype3 = new RadarEventType("USER_ENTERED_HOME", 3);
		//   24   45:new             #2   <Class RadarEvent$RadarEventType>
		//   25   48:dup             
		//   26   49:ldc1            #52  <String "USER_ENTERED_HOME">
		//   27   51:iconst_3        
		//   28   52:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   29   55:astore_3        
			USER_ENTERED_HOME = radareventtype3;
		//   30   56:aload_3         
		//   31   57:putstatic       #54  <Field RadarEvent$RadarEventType USER_ENTERED_HOME>
			RadarEventType radareventtype4 = new RadarEventType("USER_EXITED_HOME", 4);
		//   32   60:new             #2   <Class RadarEvent$RadarEventType>
		//   33   63:dup             
		//   34   64:ldc1            #55  <String "USER_EXITED_HOME">
		//   35   66:iconst_4        
		//   36   67:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   37   70:astore          4
			USER_EXITED_HOME = radareventtype4;
		//   38   72:aload           4
		//   39   74:putstatic       #57  <Field RadarEvent$RadarEventType USER_EXITED_HOME>
			RadarEventType radareventtype5 = new RadarEventType("USER_ENTERED_OFFICE", 5);
		//   40   77:new             #2   <Class RadarEvent$RadarEventType>
		//   41   80:dup             
		//   42   81:ldc1            #58  <String "USER_ENTERED_OFFICE">
		//   43   83:iconst_5        
		//   44   84:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   45   87:astore          5
			USER_ENTERED_OFFICE = radareventtype5;
		//   46   89:aload           5
		//   47   91:putstatic       #60  <Field RadarEvent$RadarEventType USER_ENTERED_OFFICE>
			RadarEventType radareventtype6 = new RadarEventType("USER_EXITED_OFFICE", 6);
		//   48   94:new             #2   <Class RadarEvent$RadarEventType>
		//   49   97:dup             
		//   50   98:ldc1            #61  <String "USER_EXITED_OFFICE">
		//   51  100:bipush          6
		//   52  102:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   53  105:astore          6
			USER_EXITED_OFFICE = radareventtype6;
		//   54  107:aload           6
		//   55  109:putstatic       #63  <Field RadarEvent$RadarEventType USER_EXITED_OFFICE>
			RadarEventType radareventtype7 = new RadarEventType("USER_STARTED_TRAVELING", 7);
		//   56  112:new             #2   <Class RadarEvent$RadarEventType>
		//   57  115:dup             
		//   58  116:ldc1            #64  <String "USER_STARTED_TRAVELING">
		//   59  118:bipush          7
		//   60  120:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   61  123:astore          7
			USER_STARTED_TRAVELING = radareventtype7;
		//   62  125:aload           7
		//   63  127:putstatic       #66  <Field RadarEvent$RadarEventType USER_STARTED_TRAVELING>
			RadarEventType radareventtype8 = new RadarEventType("USER_STOPPED_TRAVELING", 8);
		//   64  130:new             #2   <Class RadarEvent$RadarEventType>
		//   65  133:dup             
		//   66  134:ldc1            #67  <String "USER_STOPPED_TRAVELING">
		//   67  136:bipush          8
		//   68  138:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   69  141:astore          8
			USER_STOPPED_TRAVELING = radareventtype8;
		//   70  143:aload           8
		//   71  145:putstatic       #69  <Field RadarEvent$RadarEventType USER_STOPPED_TRAVELING>
			RadarEventType radareventtype9 = new RadarEventType("USER_ENTERED_PLACE", 9);
		//   72  148:new             #2   <Class RadarEvent$RadarEventType>
		//   73  151:dup             
		//   74  152:ldc1            #70  <String "USER_ENTERED_PLACE">
		//   75  154:bipush          9
		//   76  156:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   77  159:astore          9
			USER_ENTERED_PLACE = radareventtype9;
		//   78  161:aload           9
		//   79  163:putstatic       #72  <Field RadarEvent$RadarEventType USER_ENTERED_PLACE>
			RadarEventType radareventtype10 = new RadarEventType("USER_EXITED_PLACE", 10);
		//   80  166:new             #2   <Class RadarEvent$RadarEventType>
		//   81  169:dup             
		//   82  170:ldc1            #73  <String "USER_EXITED_PLACE">
		//   83  172:bipush          10
		//   84  174:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   85  177:astore          10
			USER_EXITED_PLACE = radareventtype10;
		//   86  179:aload           10
		//   87  181:putstatic       #75  <Field RadarEvent$RadarEventType USER_EXITED_PLACE>
			RadarEventType radareventtype11 = new RadarEventType("USER_NEARBY_PLACE_CHAIN", 11);
		//   88  184:new             #2   <Class RadarEvent$RadarEventType>
		//   89  187:dup             
		//   90  188:ldc1            #76  <String "USER_NEARBY_PLACE_CHAIN">
		//   91  190:bipush          11
		//   92  192:invokespecial   #43  <Method void RadarEvent$RadarEventType(String, int)>
		//   93  195:astore          11
			USER_NEARBY_PLACE_CHAIN = radareventtype11;
		//   94  197:aload           11
		//   95  199:putstatic       #78  <Field RadarEvent$RadarEventType USER_NEARBY_PLACE_CHAIN>
			$VALUES = (new RadarEventType[] {
				radareventtype, radareventtype1, radareventtype2, radareventtype3, radareventtype4, radareventtype5, radareventtype6, radareventtype7, radareventtype8, radareventtype9, 
				radareventtype10, radareventtype11
			});
		//   96  202:bipush          12
		//   97  204:anewarray       RadarEventType[]
		//   98  207:dup             
		//   99  208:iconst_0        
		//  100  209:aload_0         
		//  101  210:aastore         
		//  102  211:dup             
		//  103  212:iconst_1        
		//  104  213:aload_1         
		//  105  214:aastore         
		//  106  215:dup             
		//  107  216:iconst_2        
		//  108  217:aload_2         
		//  109  218:aastore         
		//  110  219:dup             
		//  111  220:iconst_3        
		//  112  221:aload_3         
		//  113  222:aastore         
		//  114  223:dup             
		//  115  224:iconst_4        
		//  116  225:aload           4
		//  117  227:aastore         
		//  118  228:dup             
		//  119  229:iconst_5        
		//  120  230:aload           5
		//  121  232:aastore         
		//  122  233:dup             
		//  123  234:bipush          6
		//  124  236:aload           6
		//  125  238:aastore         
		//  126  239:dup             
		//  127  240:bipush          7
		//  128  242:aload           7
		//  129  244:aastore         
		//  130  245:dup             
		//  131  246:bipush          8
		//  132  248:aload           8
		//  133  250:aastore         
		//  134  251:dup             
		//  135  252:bipush          9
		//  136  254:aload           9
		//  137  256:aastore         
		//  138  257:dup             
		//  139  258:bipush          10
		//  140  260:aload           10
		//  141  262:aastore         
		//  142  263:dup             
		//  143  264:bipush          11
		//  144  266:aload           11
		//  145  268:aastore         
		//  146  269:putstatic       #80  <Field RadarEvent$RadarEventType[] $VALUES>
		//* 147  272:return          
		}

		protected RadarEventType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #82  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class RadarEventVerification extends Enum
	{

		public static RadarEventVerification valueOf(String s)
		{
			return (RadarEventVerification)Enum.valueOf(io/radar/sdk/model/RadarEvent$RadarEventVerification, s);
		//    0    0:ldc1            #2   <Class RadarEvent$RadarEventVerification>
		//    1    2:aload_0         
		//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class RadarEvent$RadarEventVerification>
		//    4    9:areturn         
		}

		public static RadarEventVerification[] values()
		{
			return (RadarEventVerification[])((RadarEventVerification []) ($VALUES)).clone();
		//    0    0:getstatic       #44  <Field RadarEvent$RadarEventVerification[] $VALUES>
		//    1    3:invokevirtual   #59  <Method Object _5B_Lio.radar.sdk.model.RadarEvent$RadarEventVerification_3B_.clone()>
		//    2    6:checkcast       #55  <Class RadarEvent$RadarEventVerification[]>
		//    3    9:areturn         
		}

		private static final RadarEventVerification $VALUES[];
		public static final RadarEventVerification ACCEPT;
		public static final RadarEventVerification REJECT;
		public static final RadarEventVerification UNVERIFY;

		static 
		{
			RadarEventVerification radareventverification = new RadarEventVerification("ACCEPT", 0);
		//    0    0:new             #2   <Class RadarEvent$RadarEventVerification>
		//    1    3:dup             
		//    2    4:ldc1            #31  <String "ACCEPT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #34  <Method void RadarEvent$RadarEventVerification(String, int)>
		//    5   10:astore_0        
			ACCEPT = radareventverification;
		//    6   11:aload_0         
		//    7   12:putstatic       #36  <Field RadarEvent$RadarEventVerification ACCEPT>
			RadarEventVerification radareventverification1 = new RadarEventVerification("UNVERIFY", 1);
		//    8   15:new             #2   <Class RadarEvent$RadarEventVerification>
		//    9   18:dup             
		//   10   19:ldc1            #37  <String "UNVERIFY">
		//   11   21:iconst_1        
		//   12   22:invokespecial   #34  <Method void RadarEvent$RadarEventVerification(String, int)>
		//   13   25:astore_1        
			UNVERIFY = radareventverification1;
		//   14   26:aload_1         
		//   15   27:putstatic       #39  <Field RadarEvent$RadarEventVerification UNVERIFY>
			RadarEventVerification radareventverification2 = new RadarEventVerification("REJECT", 2);
		//   16   30:new             #2   <Class RadarEvent$RadarEventVerification>
		//   17   33:dup             
		//   18   34:ldc1            #40  <String "REJECT">
		//   19   36:iconst_2        
		//   20   37:invokespecial   #34  <Method void RadarEvent$RadarEventVerification(String, int)>
		//   21   40:astore_2        
			REJECT = radareventverification2;
		//   22   41:aload_2         
		//   23   42:putstatic       #42  <Field RadarEvent$RadarEventVerification REJECT>
			$VALUES = (new RadarEventVerification[] {
				radareventverification, radareventverification1, radareventverification2
			});
		//   24   45:iconst_3        
		//   25   46:anewarray       RadarEventVerification[]
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
		//   38   61:putstatic       #44  <Field RadarEvent$RadarEventVerification[] $VALUES>
		//*  39   64:return          
		}

		protected RadarEventVerification(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #46  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public RadarEvent(String s, Date date, Date date1, boolean flag, RadarEventType radareventtype, RadarGeofence radargeofence, RadarPlace radarplace, 
			RadarPlace aradarplace[], RadarPlace radarplace1, RadarEventVerification radareventverification, RadarEventConfidence radareventconfidence, float f, Location location1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "id");
	//    0    0:aload_1         
	//    1    1:ldc1            #125 <String "id">
	//    2    3:invokestatic    #131 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (date)), "createdAt");
	//    3    6:aload_2         
	//    4    7:ldc1            #89  <String "createdAt">
	//    5    9:invokestatic    #131 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (date1)), "actualCreatedAt");
	//    6   12:aload_3         
	//    7   13:ldc1            #80  <String "actualCreatedAt">
	//    8   15:invokestatic    #131 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (radareventtype)), "type");
	//    9   18:aload           5
	//   10   20:ldc1            #107 <String "type">
	//   11   22:invokestatic    #131 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (radareventverification)), "verification");
	//   12   25:aload           10
	//   13   27:ldc1            #109 <String "verification">
	//   14   29:invokestatic    #131 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (radareventconfidence)), "confidence");
	//   15   32:aload           11
	//   16   34:ldc1            #84  <String "confidence">
	//   17   36:invokestatic    #131 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (location1)), "location");
	//   18   39:aload           13
	//   19   41:ldc1            #100 <String "location">
	//   20   43:invokestatic    #131 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		super();
	//   21   46:aload_0         
	//   22   47:invokespecial   #133 <Method void Object()>
		id = s;
	//   23   50:aload_0         
	//   24   51:aload_1         
	//   25   52:putfield        #135 <Field String id>
		createdAt = date;
	//   26   55:aload_0         
	//   27   56:aload_2         
	//   28   57:putfield        #137 <Field Date createdAt>
		actualCreatedAt = date1;
	//   29   60:aload_0         
	//   30   61:aload_3         
	//   31   62:putfield        #139 <Field Date actualCreatedAt>
		live = flag;
	//   32   65:aload_0         
	//   33   66:iload           4
	//   34   68:putfield        #141 <Field boolean live>
		type = radareventtype;
	//   35   71:aload_0         
	//   36   72:aload           5
	//   37   74:putfield        #143 <Field RadarEvent$RadarEventType type>
		geofence = radargeofence;
	//   38   77:aload_0         
	//   39   78:aload           6
	//   40   80:putfield        #145 <Field RadarGeofence geofence>
		place = radarplace;
	//   41   83:aload_0         
	//   42   84:aload           7
	//   43   86:putfield        #147 <Field RadarPlace place>
		alternatePlaces = aradarplace;
	//   44   89:aload_0         
	//   45   90:aload           8
	//   46   92:putfield        #149 <Field RadarPlace[] alternatePlaces>
		verifiedPlace = radarplace1;
	//   47   95:aload_0         
	//   48   96:aload           9
	//   49   98:putfield        #151 <Field RadarPlace verifiedPlace>
		verification = radareventverification;
	//   50  101:aload_0         
	//   51  102:aload           10
	//   52  104:putfield        #153 <Field RadarEvent$RadarEventVerification verification>
		confidence = radareventconfidence;
	//   53  107:aload_0         
	//   54  108:aload           11
	//   55  110:putfield        #155 <Field RadarEvent$RadarEventConfidence confidence>
		duration = f;
	//   56  113:aload_0         
	//   57  114:fload           12
	//   58  116:putfield        #157 <Field float duration>
		location = location1;
	//   59  119:aload_0         
	//   60  120:aload           13
	//   61  122:putfield        #159 <Field Location location>
	//   62  125:return          
	}

	public final Date getActualCreatedAt()
	{
		return actualCreatedAt;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field Date actualCreatedAt>
	//    2    4:areturn         
	}

	public final RadarPlace[] getAlternatePlaces()
	{
		return alternatePlaces;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field RadarPlace[] alternatePlaces>
	//    2    4:areturn         
	}

	public final RadarEventConfidence getConfidence()
	{
		return confidence;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field RadarEvent$RadarEventConfidence confidence>
	//    2    4:areturn         
	}

	public final Date getCreatedAt()
	{
		return createdAt;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Date createdAt>
	//    2    4:areturn         
	}

	public final float getDuration()
	{
		return duration;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field float duration>
	//    2    4:freturn         
	}

	public final RadarGeofence getGeofence()
	{
		return geofence;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field RadarGeofence geofence>
	//    2    4:areturn         
	}

	public final String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field String id>
	//    2    4:areturn         
	}

	public final boolean getLive()
	{
		return live;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field boolean live>
	//    2    4:ireturn         
	}

	public final Location getLocation()
	{
		return location;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field Location location>
	//    2    4:areturn         
	}

	public final RadarPlace getPlace()
	{
		return place;
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field RadarPlace place>
	//    2    4:areturn         
	}

	public final RadarEventType getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field RadarEvent$RadarEventType type>
	//    2    4:areturn         
	}

	public final RadarEventVerification getVerification()
	{
		return verification;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field RadarEvent$RadarEventVerification verification>
	//    2    4:areturn         
	}

	public final RadarPlace getVerifiedPlace()
	{
		return verifiedPlace;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field RadarPlace verifiedPlace>
	//    2    4:areturn         
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	private static final String FIELD_ACTUAL_CREATED = "actualCreatedAt";
	private static final String FIELD_ALTERNATE_PLACES = "alternatePlaces";
	private static final String FIELD_CONFIDENCE = "confidence";
	private static final String FIELD_COORDINATES = "coordinates";
	private static final String FIELD_CREATED = "createdAt";
	private static final String FIELD_DURATION = "duration";
	private static final String FIELD_GEOFENCE = "geofence";
	private static final String FIELD_ID = "_id";
	private static final String FIELD_LIVE = "live";
	private static final String FIELD_LOCATION = "location";
	private static final String FIELD_LOCATION_ACCURACY = "locationAccuracy";
	private static final String FIELD_PLACE = "place";
	private static final String FIELD_TYPE = "type";
	private static final String FIELD_VERIFICATION = "verification";
	private static final String FIELD_VERIFIED_PLACE = "verifiedPlace";
	private final Date actualCreatedAt;
	private final RadarPlace alternatePlaces[];
	private final RadarEventConfidence confidence;
	private final Date createdAt;
	private final float duration;
	private final RadarGeofence geofence;
	private final String id;
	private final boolean live;
	private final Location location;
	private final RadarPlace place;
	private final RadarEventType type;
	private final RadarEventVerification verification;
	private final RadarPlace verifiedPlace;

	static 
	{
	//    0    0:new             #6   <Class RadarEvent$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #121 <Method void RadarEvent$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #123 <Field RadarEvent$Companion Companion>
	//*   5   11:return          
	}
}
