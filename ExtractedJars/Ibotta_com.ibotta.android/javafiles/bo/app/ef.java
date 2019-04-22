// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.appboy.models.AppboyGeofence;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.*;
import com.google.android.gms.tasks.*;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//			ee

public final class ef
{

	public ef()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	static String a()
	{
		return a;
	//    0    0:getstatic       #24  <Field String a>
	//    1    3:areturn         
	}

	public static void a(Context context)
	{
		AppboyLogger.d(a, "Deleting registered geofence cache.");
	//    0    0:getstatic       #24  <Field String a>
	//    1    3:ldc1            #32  <String "Deleting registered geofence cache.">
	//    2    5:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
		context = ((Context) (context.getSharedPreferences("com.appboy.support.geofences", 0).edit()));
	//    4    9:aload_0         
	//    5   10:ldc1            #38  <String "com.appboy.support.geofences">
	//    6   12:iconst_0        
	//    7   13:invokevirtual   #44  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    8   16:invokeinterface #50  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    9   21:astore_0        
		((android.content.SharedPreferences.Editor) (context)).clear();
	//   10   22:aload_0         
	//   11   23:invokeinterface #55  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   12   28:pop             
		((android.content.SharedPreferences.Editor) (context)).apply();
	//   13   29:aload_0         
	//   14   30:invokeinterface #58  <Method void android.content.SharedPreferences$Editor.apply()>
	//   15   35:return          
	}

	public static void a(Context context, PendingIntent pendingintent)
	{
		try
		{
			AppboyLogger.d(a, "Requesting single location update from Google Play Services.");
	//    0    0:getstatic       #24  <Field String a>
	//    1    3:ldc1            #65  <String "Requesting single location update from Google Play Services.">
	//    2    5:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//    3    8:pop             
			LocationRequest locationrequest = LocationRequest.create();
	//    4    9:invokestatic    #71  <Method LocationRequest LocationRequest.create()>
	//    5   12:astore_2        
			locationrequest.setPriority(100);
	//    6   13:aload_2         
	//    7   14:bipush          100
	//    8   16:invokevirtual   #75  <Method LocationRequest LocationRequest.setPriority(int)>
	//    9   19:pop             
			locationrequest.setNumUpdates(1);
	//   10   20:aload_2         
	//   11   21:iconst_1        
	//   12   22:invokevirtual   #78  <Method LocationRequest LocationRequest.setNumUpdates(int)>
	//   13   25:pop             
			if(Looper.myLooper() == null)
	//*  14   26:invokestatic    #84  <Method Looper Looper.myLooper()>
	//*  15   29:ifnonnull       35
				Looper.prepare();
	//   16   32:invokestatic    #87  <Method void Looper.prepare()>
			LocationServices.getFusedLocationProviderClient(context).requestLocationUpdates(locationrequest, pendingintent);
	//   17   35:aload_0         
	//   18   36:invokestatic    #93  <Method FusedLocationProviderClient LocationServices.getFusedLocationProviderClient(Context)>
	//   19   39:aload_2         
	//   20   40:aload_1         
	//   21   41:invokevirtual   #99  <Method Task FusedLocationProviderClient.requestLocationUpdates(LocationRequest, PendingIntent)>
	//   22   44:pop             
			return;
	//   23   45:return          
		}
	//*  24   46:astore_0        
	//*  25   47:getstatic       #24  <Field String a>
	//*  26   50:ldc1            #101 <String "Failed to request location update due to exception.">
	//*  27   52:aload_0         
	//*  28   53:invokestatic    #105 <Method int AppboyLogger.w(String, String, Throwable)>
	//*  29   56:pop             
	//*  30   57:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  31   58:astore_0        
		{
			AppboyLogger.w(a, "Failed to request location update due to security exception from insufficient permissions.", ((Throwable) (context)));
	//   32   59:getstatic       #24  <Field String a>
	//   33   62:ldc1            #107 <String "Failed to request location update due to security exception from insufficient permissions.">
	//   34   64:aload_0         
	//   35   65:invokestatic    #105 <Method int AppboyLogger.w(String, String, Throwable)>
	//   36   68:pop             
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			AppboyLogger.w(a, "Failed to request location update due to exception.", ((Throwable) (context)));
			return;
		}
	//   37   69:return          
	}

	public static void a(Context context, List list, PendingIntent pendingintent)
	{
		Object obj;
		Object obj1;
		obj = ((Object) (context.getSharedPreferences("com.appboy.support.geofences", 0)));
	//    0    0:aload_0         
	//    1    1:ldc1            #38  <String "com.appboy.support.geofences">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #44  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    7:astore          5
		obj1 = ((Object) (ee.a(((SharedPreferences) (obj)))));
	//    5    9:aload           5
	//    6   11:invokestatic    #113 <Method List ee.a(SharedPreferences)>
	//    7   14:astore          6
		if(!list.isEmpty())
			break MISSING_BLOCK_LABEL_213;
	//    8   16:aload_1         
	//    9   17:invokeinterface #119 <Method boolean List.isEmpty()>
	//   10   22:ifeq            213
		list = ((List) (new ArrayList()));
	//   11   25:new             #121 <Class ArrayList>
	//   12   28:dup             
	//   13   29:invokespecial   #122 <Method void ArrayList()>
	//   14   32:astore_1        
		String s;
		StringBuilder stringbuilder;
		for(pendingintent = ((PendingIntent) (((List) (obj1)).iterator())); ((Iterator) (pendingintent)).hasNext(); AppboyLogger.d(s, stringbuilder.toString()))
	//*  15   33:aload           6
	//*  16   35:invokeinterface #126 <Method Iterator List.iterator()>
	//*  17   40:astore_2        
	//*  18   41:aload_2         
	//*  19   42:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//*  20   47:ifeq            120
		{
			AppboyGeofence appboygeofence = (AppboyGeofence)((Iterator) (pendingintent)).next();
	//   21   50:aload_2         
	//   22   51:invokeinterface #135 <Method Object Iterator.next()>
	//   23   56:checkcast       #137 <Class AppboyGeofence>
	//   24   59:astore          4
			list.add(((Object) (appboygeofence.getId())));
	//   25   61:aload_1         
	//   26   62:aload           4
	//   27   64:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//   28   67:invokeinterface #144 <Method boolean List.add(Object)>
	//   29   72:pop             
			s = a;
	//   30   73:getstatic       #24  <Field String a>
	//   31   76:astore          7
			stringbuilder = new StringBuilder();
	//   32   78:new             #146 <Class StringBuilder>
	//   33   81:dup             
	//   34   82:invokespecial   #147 <Method void StringBuilder()>
	//   35   85:astore          8
			stringbuilder.append("Obsolete geofence will be un-registered: ");
	//   36   87:aload           8
	//   37   89:ldc1            #149 <String "Obsolete geofence will be un-registered: ">
	//   38   91:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   39   94:pop             
			stringbuilder.append(appboygeofence.getId());
	//   40   95:aload           8
	//   41   97:aload           4
	//   42   99:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//   43  102:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   44  105:pop             
		}

	//   45  106:aload           7
	//   46  108:aload           8
	//   47  110:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   48  113:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//   49  116:pop             
	//*  50  117:goto            41
		if(!list.isEmpty())
	//*  51  120:aload_1         
	//*  52  121:invokeinterface #119 <Method boolean List.isEmpty()>
	//*  53  126:ifne            203
		{
			LocationServices.getGeofencingClient(context).removeGeofences(list);
	//   54  129:aload_0         
	//   55  130:invokestatic    #160 <Method GeofencingClient LocationServices.getGeofencingClient(Context)>
	//   56  133:aload_1         
	//   57  134:invokevirtual   #166 <Method Task GeofencingClient.removeGeofences(List)>
	//   58  137:pop             
			((SharedPreferences) (obj)).edit().clear().apply();
	//   59  138:aload           5
	//   60  140:invokeinterface #50  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   61  145:invokeinterface #55  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   62  150:invokeinterface #58  <Method void android.content.SharedPreferences$Editor.apply()>
			context = ((Context) (a));
	//   63  155:getstatic       #24  <Field String a>
	//   64  158:astore_0        
			list = ((List) (new StringBuilder()));
	//   65  159:new             #146 <Class StringBuilder>
	//   66  162:dup             
	//   67  163:invokespecial   #147 <Method void StringBuilder()>
	//   68  166:astore_1        
			((StringBuilder) (list)).append("No new geofences to register. Cleared ");
	//   69  167:aload_1         
	//   70  168:ldc1            #168 <String "No new geofences to register. Cleared ">
	//   71  170:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   72  173:pop             
			((StringBuilder) (list)).append(((List) (obj1)).size());
	//   73  174:aload_1         
	//   74  175:aload           6
	//   75  177:invokeinterface #172 <Method int List.size()>
	//   76  182:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//   77  185:pop             
			((StringBuilder) (list)).append(" previously registered geofences.");
	//   78  186:aload_1         
	//   79  187:ldc1            #177 <String " previously registered geofences.">
	//   80  189:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   81  192:pop             
			AppboyLogger.d(((String) (context)), ((StringBuilder) (list)).toString());
	//   82  193:aload_0         
	//   83  194:aload_1         
	//   84  195:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   85  198:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//   86  201:pop             
			return;
	//   87  202:return          
		}
		boolean flag;
		ArrayList arraylist;
		Object obj2;
		Object obj3;
		Object obj4;
		Object obj5;
		try
		{
			AppboyLogger.d(a, "No new geofences to register. No geofences are currently registered.");
	//   88  203:getstatic       #24  <Field String a>
	//   89  206:ldc1            #179 <String "No new geofences to register. No geofences are currently registered.">
	//   90  208:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//   91  211:pop             
			return;
	//   92  212:return          
		}
	//*  93  213:new             #121 <Class ArrayList>
	//*  94  216:dup             
	//*  95  217:invokespecial   #122 <Method void ArrayList()>
	//*  96  220:astore          4
	//*  97  222:new             #181 <Class HashSet>
	//*  98  225:dup             
	//*  99  226:invokespecial   #182 <Method void HashSet()>
	//* 100  229:astore          7
	//* 101  231:aload_1         
	//* 102  232:invokeinterface #126 <Method Iterator List.iterator()>
	//* 103  237:astore_1        
	//* 104  238:aload_1         
	//* 105  239:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//* 106  244:ifeq            396
	//* 107  247:aload_1         
	//* 108  248:invokeinterface #135 <Method Object Iterator.next()>
	//* 109  253:checkcast       #137 <Class AppboyGeofence>
	//* 110  256:astore          8
	//* 111  258:aload           7
	//* 112  260:aload           8
	//* 113  262:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//* 114  265:invokeinterface #185 <Method boolean Set.add(Object)>
	//* 115  270:pop             
	//* 116  271:iconst_1        
	//* 117  272:istore_3        
	//* 118  273:aload           6
	//* 119  275:invokeinterface #126 <Method Iterator List.iterator()>
	//* 120  280:astore          9
	//* 121  282:aload           9
	//* 122  284:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//* 123  289:ifeq            335
	//* 124  292:aload           9
	//* 125  294:invokeinterface #135 <Method Object Iterator.next()>
	//* 126  299:checkcast       #137 <Class AppboyGeofence>
	//* 127  302:astore          10
	//* 128  304:aload           8
	//* 129  306:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//* 130  309:aload           10
	//* 131  311:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//* 132  314:invokevirtual   #190 <Method boolean String.equals(Object)>
	//* 133  317:ifeq            282
	//* 134  320:aload           8
	//* 135  322:aload           10
	//* 136  324:invokevirtual   #194 <Method boolean AppboyGeofence.equivalentServerData(AppboyGeofence)>
	//* 137  327:ifeq            282
	//* 138  330:iconst_0        
	//* 139  331:istore_3        
	//* 140  332:goto            282
	//* 141  335:iload_3         
	//* 142  336:ifeq            238
	//* 143  339:getstatic       #24  <Field String a>
	//* 144  342:astore          9
	//* 145  344:new             #146 <Class StringBuilder>
	//* 146  347:dup             
	//* 147  348:invokespecial   #147 <Method void StringBuilder()>
	//* 148  351:astore          10
	//* 149  353:aload           10
	//* 150  355:ldc1            #196 <String "New geofence will be registered: ">
	//* 151  357:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 152  360:pop             
	//* 153  361:aload           10
	//* 154  363:aload           8
	//* 155  365:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//* 156  368:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 157  371:pop             
	//* 158  372:aload           9
	//* 159  374:aload           10
	//* 160  376:invokevirtual   #156 <Method String StringBuilder.toString()>
	//* 161  379:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//* 162  382:pop             
	//* 163  383:aload           4
	//* 164  385:aload           8
	//* 165  387:invokeinterface #144 <Method boolean List.add(Object)>
	//* 166  392:pop             
	//* 167  393:goto            238
	//* 168  396:new             #121 <Class ArrayList>
	//* 169  399:dup             
	//* 170  400:invokespecial   #122 <Method void ArrayList()>
	//* 171  403:astore_1        
	//* 172  404:aload           6
	//* 173  406:invokeinterface #126 <Method Iterator List.iterator()>
	//* 174  411:astore          6
	//* 175  413:aload           6
	//* 176  415:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//* 177  420:ifeq            509
	//* 178  423:aload           6
	//* 179  425:invokeinterface #135 <Method Object Iterator.next()>
	//* 180  430:checkcast       #137 <Class AppboyGeofence>
	//* 181  433:astore          8
	//* 182  435:aload           7
	//* 183  437:aload           8
	//* 184  439:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//* 185  442:invokeinterface #199 <Method boolean Set.contains(Object)>
	//* 186  447:ifne            413
	//* 187  450:aload_1         
	//* 188  451:aload           8
	//* 189  453:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//* 190  456:invokeinterface #144 <Method boolean List.add(Object)>
	//* 191  461:pop             
	//* 192  462:getstatic       #24  <Field String a>
	//* 193  465:astore          9
	//* 194  467:new             #146 <Class StringBuilder>
	//* 195  470:dup             
	//* 196  471:invokespecial   #147 <Method void StringBuilder()>
	//* 197  474:astore          10
	//* 198  476:aload           10
	//* 199  478:ldc1            #149 <String "Obsolete geofence will be un-registered: ">
	//* 200  480:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 201  483:pop             
	//* 202  484:aload           10
	//* 203  486:aload           8
	//* 204  488:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//* 205  491:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 206  494:pop             
	//* 207  495:aload           9
	//* 208  497:aload           10
	//* 209  499:invokevirtual   #156 <Method String StringBuilder.toString()>
	//* 210  502:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//* 211  505:pop             
	//* 212  506:goto            413
	//* 213  509:aload_1         
	//* 214  510:invokeinterface #119 <Method boolean List.isEmpty()>
	//* 215  515:ifne            638
	//* 216  518:aload           5
	//* 217  520:invokeinterface #50  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//* 218  525:astore          6
	//* 219  527:aload_1         
	//* 220  528:invokeinterface #126 <Method Iterator List.iterator()>
	//* 221  533:astore          7
	//* 222  535:aload           7
	//* 223  537:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//* 224  542:ifeq            566
	//* 225  545:aload           6
	//* 226  547:aload           7
	//* 227  549:invokeinterface #135 <Method Object Iterator.next()>
	//* 228  554:checkcast       #187 <Class String>
	//* 229  557:invokeinterface #203 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//* 230  562:pop             
	//* 231  563:goto            535
	//* 232  566:aload           6
	//* 233  568:invokeinterface #58  <Method void android.content.SharedPreferences$Editor.apply()>
	//* 234  573:getstatic       #24  <Field String a>
	//* 235  576:astore          6
	//* 236  578:new             #146 <Class StringBuilder>
	//* 237  581:dup             
	//* 238  582:invokespecial   #147 <Method void StringBuilder()>
	//* 239  585:astore          7
	//* 240  587:aload           7
	//* 241  589:ldc1            #205 <String "Un-registering ">
	//* 242  591:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 243  594:pop             
	//* 244  595:aload           7
	//* 245  597:aload_1         
	//* 246  598:invokeinterface #172 <Method int List.size()>
	//* 247  603:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//* 248  606:pop             
	//* 249  607:aload           7
	//* 250  609:ldc1            #207 <String " obsolete geofences from Google Play Services.">
	//* 251  611:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 252  614:pop             
	//* 253  615:aload           6
	//* 254  617:aload           7
	//* 255  619:invokevirtual   #156 <Method String StringBuilder.toString()>
	//* 256  622:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//* 257  625:pop             
	//* 258  626:aload_0         
	//* 259  627:invokestatic    #160 <Method GeofencingClient LocationServices.getGeofencingClient(Context)>
	//* 260  630:aload_1         
	//* 261  631:invokevirtual   #166 <Method Task GeofencingClient.removeGeofences(List)>
	//* 262  634:pop             
	//* 263  635:goto            647
	//* 264  638:getstatic       #24  <Field String a>
	//* 265  641:ldc1            #209 <String "No obsolete geofences need to be unregistered from Google Play Services.">
	//* 266  643:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//* 267  646:pop             
	//* 268  647:aload           4
	//* 269  649:invokeinterface #119 <Method boolean List.isEmpty()>
	//* 270  654:ifne            832
	//* 271  657:new             #121 <Class ArrayList>
	//* 272  660:dup             
	//* 273  661:invokespecial   #122 <Method void ArrayList()>
	//* 274  664:astore          6
	//* 275  666:aload           5
	//* 276  668:invokeinterface #50  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//* 277  673:astore          5
	//* 278  675:aload           4
	//* 279  677:invokeinterface #126 <Method Iterator List.iterator()>
	//* 280  682:astore          7
	//* 281  684:aload           7
	//* 282  686:invokeinterface #131 <Method boolean Iterator.hasNext()>
	//* 283  691:ifeq            765
	//* 284  694:aload           7
	//* 285  696:invokeinterface #135 <Method Object Iterator.next()>
	//* 286  701:checkcast       #137 <Class AppboyGeofence>
	//* 287  704:astore_1        
	//* 288  705:aload           6
	//* 289  707:aload_1         
	//* 290  708:invokevirtual   #213 <Method com.google.android.gms.location.Geofence AppboyGeofence.toGeofence()>
	//* 291  711:invokeinterface #144 <Method boolean List.add(Object)>
	//* 292  716:pop             
	//* 293  717:aload_1         
	//* 294  718:invokevirtual   #140 <Method String AppboyGeofence.getId()>
	//* 295  721:astore          8
	//* 296  723:aload_1         
	//* 297  724:invokevirtual   #217 <Method JSONObject AppboyGeofence.forJsonPut()>
	//* 298  727:astore_1        
	//* 299  728:aload_1         
	//* 300  729:instanceof      #219 <Class JSONObject>
	//* 301  732:ifne            743
	//* 302  735:aload_1         
	//* 303  736:invokevirtual   #220 <Method String JSONObject.toString()>
	//* 304  739:astore_1        
	//* 305  740:goto            751
	//* 306  743:aload_1         
	//* 307  744:checkcast       #219 <Class JSONObject>
	//* 308  747:invokestatic    #225 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//* 309  750:astore_1        
	//* 310  751:aload           5
	//* 311  753:aload           8
	//* 312  755:aload_1         
	//* 313  756:invokeinterface #229 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//* 314  761:pop             
	//* 315  762:goto            684
	//* 316  765:aload           5
	//* 317  767:invokeinterface #58  <Method void android.content.SharedPreferences$Editor.apply()>
	//* 318  772:getstatic       #24  <Field String a>
	//* 319  775:astore_1        
	//* 320  776:new             #146 <Class StringBuilder>
	//* 321  779:dup             
	//* 322  780:invokespecial   #147 <Method void StringBuilder()>
	//* 323  783:astore          5
	//* 324  785:aload           5
	//* 325  787:ldc1            #231 <String "Registering ">
	//* 326  789:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 327  792:pop             
	//* 328  793:aload           5
	//* 329  795:aload           4
	//* 330  797:invokeinterface #172 <Method int List.size()>
	//* 331  802:invokevirtual   #175 <Method StringBuilder StringBuilder.append(int)>
	//* 332  805:pop             
	//* 333  806:aload           5
	//* 334  808:ldc1            #233 <String " new geofences with Google Play Services.">
	//* 335  810:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//* 336  813:pop             
	//* 337  814:aload_1         
	//* 338  815:aload           5
	//* 339  817:invokevirtual   #156 <Method String StringBuilder.toString()>
	//* 340  820:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//* 341  823:pop             
	//* 342  824:aload_0         
	//* 343  825:aload           6
	//* 344  827:aload_2         
	//* 345  828:invokestatic    #236 <Method void b(Context, List, PendingIntent)>
	//* 346  831:return          
	//* 347  832:getstatic       #24  <Field String a>
	//* 348  835:ldc1            #238 <String "No new geofences need to be registered with Google Play Services.">
	//* 349  837:invokestatic    #36  <Method int AppboyLogger.d(String, String)>
	//* 350  840:pop             
	//* 351  841:return          
	//* 352  842:astore_0        
	//* 353  843:getstatic       #24  <Field String a>
	//* 354  846:ldc1            #240 <String "Exception while adding geofences.">
	//* 355  848:aload_0         
	//* 356  849:invokestatic    #243 <Method int AppboyLogger.e(String, String, Throwable)>
	//* 357  852:pop             
	//* 358  853:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 359  854:astore_0        
		{
			AppboyLogger.e(a, "Security exception while adding geofences.", ((Throwable) (context)));
	//  360  855:getstatic       #24  <Field String a>
	//  361  858:ldc1            #245 <String "Security exception while adding geofences.">
	//  362  860:aload_0         
	//  363  861:invokestatic    #243 <Method int AppboyLogger.e(String, String, Throwable)>
	//  364  864:pop             
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			AppboyLogger.e(a, "Exception while adding geofences.", ((Throwable) (context)));
			return;
		}
		break MISSING_BLOCK_LABEL_865;
		arraylist = new ArrayList();
		obj2 = ((Object) (new HashSet()));
		list = ((List) (list.iterator()));
_L5:
		if(!((Iterator) (list)).hasNext())
			break MISSING_BLOCK_LABEL_396;
		obj3 = ((Object) ((AppboyGeofence)((Iterator) (list)).next()));
		((Set) (obj2)).add(((Object) (((AppboyGeofence) (obj3)).getId())));
		flag = true;
		obj4 = ((Object) (((List) (obj1)).iterator()));
_L3:
		if(!((Iterator) (obj4)).hasNext()) goto _L2; else goto _L1
_L1:
		obj5 = ((Object) ((AppboyGeofence)((Iterator) (obj4)).next()));
		if(((AppboyGeofence) (obj3)).getId().equals(((Object) (((AppboyGeofence) (obj5)).getId()))) && ((AppboyGeofence) (obj3)).equivalentServerData(((AppboyGeofence) (obj5))))
			flag = false;
		  goto _L3
_L2:
		if(!flag) goto _L5; else goto _L4
_L4:
		obj4 = ((Object) (a));
		obj5 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj5)).append("New geofence will be registered: ");
		((StringBuilder) (obj5)).append(((AppboyGeofence) (obj3)).getId());
		AppboyLogger.d(((String) (obj4)), ((StringBuilder) (obj5)).toString());
		((List) (arraylist)).add(obj3);
		  goto _L5
		list = ((List) (new ArrayList()));
		obj1 = ((Object) (((List) (obj1)).iterator()));
		do
		{
			if(!((Iterator) (obj1)).hasNext())
				break;
			obj3 = ((Object) ((AppboyGeofence)((Iterator) (obj1)).next()));
			if(!((Set) (obj2)).contains(((Object) (((AppboyGeofence) (obj3)).getId()))))
			{
				list.add(((Object) (((AppboyGeofence) (obj3)).getId())));
				obj4 = ((Object) (a));
				obj5 = ((Object) (new StringBuilder()));
				((StringBuilder) (obj5)).append("Obsolete geofence will be un-registered: ");
				((StringBuilder) (obj5)).append(((AppboyGeofence) (obj3)).getId());
				AppboyLogger.d(((String) (obj4)), ((StringBuilder) (obj5)).toString());
			}
		} while(true);
		if(list.isEmpty())
			break MISSING_BLOCK_LABEL_638;
		obj1 = ((Object) (((SharedPreferences) (obj)).edit()));
		for(obj2 = ((Object) (list.iterator())); ((Iterator) (obj2)).hasNext(); ((android.content.SharedPreferences.Editor) (obj1)).remove((String)((Iterator) (obj2)).next()));
		((android.content.SharedPreferences.Editor) (obj1)).apply();
		obj1 = ((Object) (a));
		obj2 = ((Object) (new StringBuilder()));
		((StringBuilder) (obj2)).append("Un-registering ");
		((StringBuilder) (obj2)).append(list.size());
		((StringBuilder) (obj2)).append(" obsolete geofences from Google Play Services.");
		AppboyLogger.d(((String) (obj1)), ((StringBuilder) (obj2)).toString());
		LocationServices.getGeofencingClient(context).removeGeofences(list);
		break MISSING_BLOCK_LABEL_647;
		AppboyLogger.d(a, "No obsolete geofences need to be unregistered from Google Play Services.");
		if(((List) (arraylist)).isEmpty())
			break MISSING_BLOCK_LABEL_832;
		obj1 = ((Object) (new ArrayList()));
		obj = ((Object) (((SharedPreferences) (obj)).edit()));
		obj2 = ((Object) (((List) (arraylist)).iterator()));
_L6:
		if(!((Iterator) (obj2)).hasNext())
			break MISSING_BLOCK_LABEL_765;
		list = ((List) ((AppboyGeofence)((Iterator) (obj2)).next()));
		((List) (obj1)).add(((Object) (((AppboyGeofence) (list)).toGeofence())));
		obj3 = ((Object) (((AppboyGeofence) (list)).getId()));
		list = ((List) (((AppboyGeofence) (list)).forJsonPut()));
		if(!(list instanceof JSONObject))
		{
			list = ((List) (((JSONObject) (list)).toString()));
			break MISSING_BLOCK_LABEL_751;
		}
		list = ((List) (JSONObjectInstrumentation.toString((JSONObject)list)));
		((android.content.SharedPreferences.Editor) (obj)).putString(((String) (obj3)), ((String) (list)));
		  goto _L6
		((android.content.SharedPreferences.Editor) (obj)).apply();
		list = ((List) (a));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Registering ");
		((StringBuilder) (obj)).append(((List) (arraylist)).size());
		((StringBuilder) (obj)).append(" new geofences with Google Play Services.");
		AppboyLogger.d(((String) (list)), ((StringBuilder) (obj)).toString());
		b(context, ((List) (obj1)), pendingintent);
		return;
		AppboyLogger.d(a, "No new geofences need to be registered with Google Play Services.");
		return;
	//  365  865:return          
	}

	private static void b(Context context, List list, PendingIntent pendingintent)
	{
		list = ((List) ((new com.google.android.gms.location.GeofencingRequest.Builder()).addGeofences(list).setInitialTrigger(0).build()));
	//    0    0:new             #249 <Class com.google.android.gms.location.GeofencingRequest$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #250 <Method void com.google.android.gms.location.GeofencingRequest$Builder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #254 <Method com.google.android.gms.location.GeofencingRequest$Builder com.google.android.gms.location.GeofencingRequest$Builder.addGeofences(List)>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #258 <Method com.google.android.gms.location.GeofencingRequest$Builder com.google.android.gms.location.GeofencingRequest$Builder.setInitialTrigger(int)>
	//    7   15:invokevirtual   #262 <Method com.google.android.gms.location.GeofencingRequest com.google.android.gms.location.GeofencingRequest$Builder.build()>
	//    8   18:astore_1        
		LocationServices.getGeofencingClient(context).addGeofences(((com.google.android.gms.location.GeofencingRequest) (list)), pendingintent).addOnSuccessListener(new OnSuccessListener() {

			public void a(Void void1)
			{
				AppboyLogger.d(ef.a(), "Geofences successfully registered with Google Play Services.");
			//    0    0:invokestatic    #22  <Method String ef.a()>
			//    1    3:ldc1            #24  <String "Geofences successfully registered with Google Play Services.">
			//    2    5:invokestatic    #30  <Method int AppboyLogger.d(String, String)>
			//    3    8:pop             
			//    4    9:return          
			}

			public void onSuccess(Object obj)
			{
				a((Void)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #34  <Class Void>
			//    3    5:invokevirtual   #36  <Method void a(Void)>
			//    4    8:return          
			}

		}
).addOnFailureListener(new OnFailureListener() {

			public void onFailure(Exception exception)
			{
				if(exception instanceof ApiException)
			//*   0    0:aload_1         
			//*   1    1:instanceof      #21  <Class ApiException>
			//*   2    4:ifeq            198
				{
					int i = ((ApiException)exception).getStatusCode();
			//    3    7:aload_1         
			//    4    8:checkcast       #21  <Class ApiException>
			//    5   11:invokevirtual   #25  <Method int ApiException.getStatusCode()>
			//    6   14:istore_2        
					if(i != 0)
			//*   7   15:iload_2         
			//*   8   16:ifeq            188
					{
						switch(i)
			//*   9   19:iload_2         
						{
			//*  10   20:tableswitch     1000 1002: default 48
			//			               1000 153
			//			               1001 118
			//			               1002 83
						default:
							exception = ((Exception) (ef.a()));
			//   11   48:invokestatic    #29  <Method String ef.a()>
			//   12   51:astore_1        
							StringBuilder stringbuilder = new StringBuilder();
			//   13   52:new             #31  <Class StringBuilder>
			//   14   55:dup             
			//   15   56:invokespecial   #32  <Method void StringBuilder()>
			//   16   59:astore_3        
							stringbuilder.append("Geofence pending result returned unknown status code: ");
			//   17   60:aload_3         
			//   18   61:ldc1            #34  <String "Geofence pending result returned unknown status code: ">
			//   19   63:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   20   66:pop             
							stringbuilder.append(i);
			//   21   67:aload_3         
			//   22   68:iload_2         
			//   23   69:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
			//   24   72:pop             
							AppboyLogger.w(((String) (exception)), stringbuilder.toString());
			//   25   73:aload_1         
			//   26   74:aload_3         
			//   27   75:invokevirtual   #44  <Method String StringBuilder.toString()>
			//   28   78:invokestatic    #50  <Method int AppboyLogger.w(String, String)>
			//   29   81:pop             
							return;
			//   30   82:return          

						case 1002: 
							exception = ((Exception) (ef.a()));
			//   31   83:invokestatic    #29  <Method String ef.a()>
			//   32   86:astore_1        
							StringBuilder stringbuilder1 = new StringBuilder();
			//   33   87:new             #31  <Class StringBuilder>
			//   34   90:dup             
			//   35   91:invokespecial   #32  <Method void StringBuilder()>
			//   36   94:astore_3        
							stringbuilder1.append("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ");
			//   37   95:aload_3         
			//   38   96:ldc1            #52  <String "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: ">
			//   39   98:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   40  101:pop             
							stringbuilder1.append(i);
			//   41  102:aload_3         
			//   42  103:iload_2         
			//   43  104:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
			//   44  107:pop             
							AppboyLogger.w(((String) (exception)), stringbuilder1.toString());
			//   45  108:aload_1         
			//   46  109:aload_3         
			//   47  110:invokevirtual   #44  <Method String StringBuilder.toString()>
			//   48  113:invokestatic    #50  <Method int AppboyLogger.w(String, String)>
			//   49  116:pop             
							return;
			//   50  117:return          

						case 1001: 
							exception = ((Exception) (ef.a()));
			//   51  118:invokestatic    #29  <Method String ef.a()>
			//   52  121:astore_1        
							StringBuilder stringbuilder2 = new StringBuilder();
			//   53  122:new             #31  <Class StringBuilder>
			//   54  125:dup             
			//   55  126:invokespecial   #32  <Method void StringBuilder()>
			//   56  129:astore_3        
							stringbuilder2.append("Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ");
			//   57  130:aload_3         
			//   58  131:ldc1            #54  <String "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: ">
			//   59  133:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   60  136:pop             
							stringbuilder2.append(i);
			//   61  137:aload_3         
			//   62  138:iload_2         
			//   63  139:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
			//   64  142:pop             
							AppboyLogger.w(((String) (exception)), stringbuilder2.toString());
			//   65  143:aload_1         
			//   66  144:aload_3         
			//   67  145:invokevirtual   #44  <Method String StringBuilder.toString()>
			//   68  148:invokestatic    #50  <Method int AppboyLogger.w(String, String)>
			//   69  151:pop             
							return;
			//   70  152:return          

						case 1000: 
							exception = ((Exception) (ef.a()));
			//   71  153:invokestatic    #29  <Method String ef.a()>
			//   72  156:astore_1        
							StringBuilder stringbuilder3 = new StringBuilder();
			//   73  157:new             #31  <Class StringBuilder>
			//   74  160:dup             
			//   75  161:invokespecial   #32  <Method void StringBuilder()>
			//   76  164:astore_3        
							stringbuilder3.append("Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ");
			//   77  165:aload_3         
			//   78  166:ldc1            #56  <String "Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: ">
			//   79  168:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   80  171:pop             
							stringbuilder3.append(i);
			//   81  172:aload_3         
			//   82  173:iload_2         
			//   83  174:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
			//   84  177:pop             
							AppboyLogger.w(((String) (exception)), stringbuilder3.toString());
			//   85  178:aload_1         
			//   86  179:aload_3         
			//   87  180:invokevirtual   #44  <Method String StringBuilder.toString()>
			//   88  183:invokestatic    #50  <Method int AppboyLogger.w(String, String)>
			//   89  186:pop             
							return;
			//   90  187:return          
						}
					} else
					{
						AppboyLogger.d(ef.a(), "Received Geofence registration success code in failure block with Google Play Services.");
			//   91  188:invokestatic    #29  <Method String ef.a()>
			//   92  191:ldc1            #58  <String "Received Geofence registration success code in failure block with Google Play Services.">
			//   93  193:invokestatic    #61  <Method int AppboyLogger.d(String, String)>
			//   94  196:pop             
						return;
			//   95  197:return          
					}
				} else
				{
					AppboyLogger.e(ef.a(), "Geofence exception encountered while adding geofences.", ((Throwable) (exception)));
			//   96  198:invokestatic    #29  <Method String ef.a()>
			//   97  201:ldc1            #63  <String "Geofence exception encountered while adding geofences.">
			//   98  203:aload_1         
			//   99  204:invokestatic    #67  <Method int AppboyLogger.e(String, String, Throwable)>
			//  100  207:pop             
					return;
			//  101  208:return          
				}
			}

		}
);
	//    9   19:aload_0         
	//   10   20:invokestatic    #160 <Method GeofencingClient LocationServices.getGeofencingClient(Context)>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #265 <Method Task GeofencingClient.addGeofences(com.google.android.gms.location.GeofencingRequest, PendingIntent)>
	//   14   28:new             #8   <Class ef$2>
	//   15   31:dup             
	//   16   32:invokespecial   #266 <Method void ef$2()>
	//   17   35:invokevirtual   #272 <Method Task Task.addOnSuccessListener(OnSuccessListener)>
	//   18   38:new             #6   <Class ef$1>
	//   19   41:dup             
	//   20   42:invokespecial   #273 <Method void ef$1()>
	//   21   45:invokevirtual   #277 <Method Task Task.addOnFailureListener(OnFailureListener)>
	//   22   48:pop             
	//   23   49:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/ef);

	static 
	{
	//    0    0:ldc1            #2   <Class ef>
	//    1    2:invokestatic    #22  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #24  <Field String a>
	//*   3    8:return          
	}
}
