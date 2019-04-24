// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzcg, zzbn, zzbt

public final class zzcf
{

	public static zzcg zzaaa = zzcg.zza("analytics.http_connection.read_timeout_millis", 61000, 61000);
	public static zzcg zzaab = zzcg.zza("analytics.campaigns.time_limit", 0x5265c00L, 0x5265c00L);
	private static zzcg zzaac = zzcg.zza("analytics.first_party_experiment_id", "", "");
	private static zzcg zzaad = zzcg.zza("analytics.first_party_experiment_variant", 0, 0);
	public static zzcg zzaae = zzcg.zza("analytics.test.disable_receiver", false, false);
	public static zzcg zzaaf = zzcg.zza("analytics.service_client.idle_disconnect_millis", 10000L, 10000L);
	public static zzcg zzaag = zzcg.zza("analytics.service_client.connect_timeout_millis", 5000L, 5000L);
	private static zzcg zzaah = zzcg.zza("analytics.service_client.second_connect_delay_millis", 5000L, 5000L);
	private static zzcg zzaai = zzcg.zza("analytics.service_client.unexpected_reconnect_millis", 60000L, 60000L);
	public static zzcg zzaaj = zzcg.zza("analytics.service_client.reconnect_throttle_millis", 0x1b7740L, 0x1b7740L);
	public static zzcg zzaak = zzcg.zza("analytics.monitoring.sample_period_millis", 0x5265c00L, 0x5265c00L);
	public static zzcg zzaal = zzcg.zza("analytics.initialization_warning_threshold", 5000L, 5000L);
	public static zzcg zzaam = zzcg.zza("analytics.gcm_task_service", false, false);
	private static zzcg zzyv = zzcg.zza("analytics.service_enabled", false, false);
	public static zzcg zzyw = zzcg.zza("analytics.service_client_enabled", true, true);
	public static zzcg zzyx = zzcg.zza("analytics.log_tag", "GAv4", "GAv4-SVC");
	private static zzcg zzyy = zzcg.zza("analytics.max_tokens", 60L, 60L);
	private static zzcg zzyz = zzcg.zza("analytics.tokens_per_sec", 0.5F, 0.5F);
	public static zzcg zzza = zzcg.zza("analytics.max_stored_hits", 2000, 20000);
	private static zzcg zzzb = zzcg.zza("analytics.max_stored_hits_per_app", 2000, 2000);
	public static zzcg zzzc = zzcg.zza("analytics.max_stored_properties_per_app", 100, 100);
	public static zzcg zzzd = zzcg.zza("analytics.local_dispatch_millis", 0x1b7740L, 0x1d4c0L);
	public static zzcg zzze = zzcg.zza("analytics.initial_local_dispatch_millis", 5000L, 5000L);
	private static zzcg zzzf = zzcg.zza("analytics.min_local_dispatch_millis", 0x1d4c0L, 0x1d4c0L);
	private static zzcg zzzg = zzcg.zza("analytics.max_local_dispatch_millis", 0x6ddd00L, 0x6ddd00L);
	public static zzcg zzzh = zzcg.zza("analytics.dispatch_alarm_millis", 0x6ddd00L, 0x6ddd00L);
	public static zzcg zzzi = zzcg.zza("analytics.max_dispatch_alarm_millis", 0x1ee6280L, 0x1ee6280L);
	public static zzcg zzzj = zzcg.zza("analytics.max_hits_per_dispatch", 20, 20);
	public static zzcg zzzk = zzcg.zza("analytics.max_hits_per_batch", 20, 20);
	public static zzcg zzzl = zzcg.zza("analytics.insecure_host", "http://www.google-analytics.com", "http://www.google-analytics.com");
	public static zzcg zzzm = zzcg.zza("analytics.secure_host", "https://ssl.google-analytics.com", "https://ssl.google-analytics.com");
	public static zzcg zzzn = zzcg.zza("analytics.simple_endpoint", "/collect", "/collect");
	public static zzcg zzzo = zzcg.zza("analytics.batching_endpoint", "/batch", "/batch");
	public static zzcg zzzp = zzcg.zza("analytics.max_get_length", 2036, 2036);
	public static zzcg zzzq;
	public static zzcg zzzr;
	private static zzcg zzzs = zzcg.zza("analytics.max_hits_per_request.k", 20, 20);
	public static zzcg zzzt = zzcg.zza("analytics.max_hit_length.k", 8192, 8192);
	public static zzcg zzzu = zzcg.zza("analytics.max_post_length.k", 8192, 8192);
	public static zzcg zzzv = zzcg.zza("analytics.max_batch_post_length", 8192, 8192);
	public static zzcg zzzw = zzcg.zza("analytics.fallback_responses.k", "404,502", "404,502");
	public static zzcg zzzx = zzcg.zza("analytics.batch_retry_interval.seconds.k", 3600, 3600);
	private static zzcg zzzy = zzcg.zza("analytics.service_monitor_interval", 0x5265c00L, 0x5265c00L);
	public static zzcg zzzz = zzcg.zza("analytics.http_connection.connect_timeout_millis", 60000, 60000);

	static 
	{
	//    0    0:ldc1            #60  <String "analytics.service_enabled">
	//    1    2:iconst_0        
	//    2    3:iconst_0        
	//    3    4:invokestatic    #66  <Method zzcg zzcg.zza(String, boolean, boolean)>
	//    4    7:putstatic       #68  <Field zzcg zzyv>
	//    5   10:ldc1            #70  <String "analytics.service_client_enabled">
	//    6   12:iconst_1        
	//    7   13:iconst_1        
	//    8   14:invokestatic    #66  <Method zzcg zzcg.zza(String, boolean, boolean)>
	//    9   17:putstatic       #72  <Field zzcg zzyw>
	//   10   20:ldc1            #74  <String "analytics.log_tag">
	//   11   22:ldc1            #76  <String "GAv4">
	//   12   24:ldc1            #78  <String "GAv4-SVC">
	//   13   26:invokestatic    #81  <Method zzcg zzcg.zza(String, String, String)>
	//   14   29:putstatic       #83  <Field zzcg zzyx>
	//   15   32:ldc1            #85  <String "analytics.max_tokens">
	//   16   34:ldc2w           #86  <Long 60L>
	//   17   37:ldc2w           #86  <Long 60L>
	//   18   40:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//   19   43:putstatic       #92  <Field zzcg zzyy>
	//   20   46:ldc1            #94  <String "analytics.tokens_per_sec">
	//   21   48:ldc1            #95  <Float 0.5F>
	//   22   50:ldc1            #95  <Float 0.5F>
	//   23   52:invokestatic    #98  <Method zzcg zzcg.zza(String, float, float)>
	//   24   55:putstatic       #100 <Field zzcg zzyz>
	//   25   58:ldc1            #102 <String "analytics.max_stored_hits">
	//   26   60:sipush          2000
	//   27   63:sipush          20000
	//   28   66:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//   29   69:putstatic       #107 <Field zzcg zzza>
	//   30   72:ldc1            #109 <String "analytics.max_stored_hits_per_app">
	//   31   74:sipush          2000
	//   32   77:sipush          2000
	//   33   80:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//   34   83:putstatic       #111 <Field zzcg zzzb>
	//   35   86:ldc1            #113 <String "analytics.max_stored_properties_per_app">
	//   36   88:bipush          100
	//   37   90:bipush          100
	//   38   92:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//   39   95:putstatic       #115 <Field zzcg zzzc>
	//   40   98:ldc1            #117 <String "analytics.local_dispatch_millis">
	//   41  100:ldc2w           #118 <Long 0x1b7740L>
	//   42  103:ldc2w           #120 <Long 0x1d4c0L>
	//   43  106:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//   44  109:putstatic       #123 <Field zzcg zzzd>
	//   45  112:ldc1            #125 <String "analytics.initial_local_dispatch_millis">
	//   46  114:ldc2w           #126 <Long 5000L>
	//   47  117:ldc2w           #126 <Long 5000L>
	//   48  120:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//   49  123:putstatic       #129 <Field zzcg zzze>
	//   50  126:ldc1            #131 <String "analytics.min_local_dispatch_millis">
	//   51  128:ldc2w           #120 <Long 0x1d4c0L>
	//   52  131:ldc2w           #120 <Long 0x1d4c0L>
	//   53  134:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//   54  137:putstatic       #133 <Field zzcg zzzf>
	//   55  140:ldc1            #135 <String "analytics.max_local_dispatch_millis">
	//   56  142:ldc2w           #136 <Long 0x6ddd00L>
	//   57  145:ldc2w           #136 <Long 0x6ddd00L>
	//   58  148:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//   59  151:putstatic       #139 <Field zzcg zzzg>
	//   60  154:ldc1            #141 <String "analytics.dispatch_alarm_millis">
	//   61  156:ldc2w           #136 <Long 0x6ddd00L>
	//   62  159:ldc2w           #136 <Long 0x6ddd00L>
	//   63  162:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//   64  165:putstatic       #143 <Field zzcg zzzh>
	//   65  168:ldc1            #145 <String "analytics.max_dispatch_alarm_millis">
	//   66  170:ldc2w           #146 <Long 0x1ee6280L>
	//   67  173:ldc2w           #146 <Long 0x1ee6280L>
	//   68  176:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//   69  179:putstatic       #149 <Field zzcg zzzi>
	//   70  182:ldc1            #151 <String "analytics.max_hits_per_dispatch">
	//   71  184:bipush          20
	//   72  186:bipush          20
	//   73  188:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//   74  191:putstatic       #153 <Field zzcg zzzj>
	//   75  194:ldc1            #155 <String "analytics.max_hits_per_batch">
	//   76  196:bipush          20
	//   77  198:bipush          20
	//   78  200:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//   79  203:putstatic       #157 <Field zzcg zzzk>
	//   80  206:ldc1            #159 <String "analytics.insecure_host">
	//   81  208:ldc1            #161 <String "http://www.google-analytics.com">
	//   82  210:ldc1            #161 <String "http://www.google-analytics.com">
	//   83  212:invokestatic    #81  <Method zzcg zzcg.zza(String, String, String)>
	//   84  215:putstatic       #163 <Field zzcg zzzl>
	//   85  218:ldc1            #165 <String "analytics.secure_host">
	//   86  220:ldc1            #167 <String "https://ssl.google-analytics.com">
	//   87  222:ldc1            #167 <String "https://ssl.google-analytics.com">
	//   88  224:invokestatic    #81  <Method zzcg zzcg.zza(String, String, String)>
	//   89  227:putstatic       #169 <Field zzcg zzzm>
	//   90  230:ldc1            #171 <String "analytics.simple_endpoint">
	//   91  232:ldc1            #173 <String "/collect">
	//   92  234:ldc1            #173 <String "/collect">
	//   93  236:invokestatic    #81  <Method zzcg zzcg.zza(String, String, String)>
	//   94  239:putstatic       #175 <Field zzcg zzzn>
	//   95  242:ldc1            #177 <String "analytics.batching_endpoint">
	//   96  244:ldc1            #179 <String "/batch">
	//   97  246:ldc1            #179 <String "/batch">
	//   98  248:invokestatic    #81  <Method zzcg zzcg.zza(String, String, String)>
	//   99  251:putstatic       #181 <Field zzcg zzzo>
	//  100  254:ldc1            #183 <String "analytics.max_get_length">
	//  101  256:sipush          2036
	//  102  259:sipush          2036
	//  103  262:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//  104  265:putstatic       #185 <Field zzcg zzzp>
		zzzq = zzcg.zza("analytics.batching_strategy.k", zzbn.zzya.name(), zzbn.zzya.name());
	//  105  268:ldc1            #187 <String "analytics.batching_strategy.k">
	//  106  270:getstatic       #193 <Field zzbn zzbn.zzya>
	//  107  273:invokevirtual   #197 <Method String zzbn.name()>
	//  108  276:getstatic       #193 <Field zzbn zzbn.zzya>
	//  109  279:invokevirtual   #197 <Method String zzbn.name()>
	//  110  282:invokestatic    #81  <Method zzcg zzcg.zza(String, String, String)>
	//  111  285:putstatic       #199 <Field zzcg zzzq>
		String s = zzbt.zzyh.name();
	//  112  288:getstatic       #205 <Field zzbt zzbt.zzyh>
	//  113  291:invokevirtual   #206 <Method String zzbt.name()>
	//  114  294:astore_0        
		zzzr = zzcg.zza("analytics.compression_strategy.k", s, s);
	//  115  295:ldc1            #208 <String "analytics.compression_strategy.k">
	//  116  297:aload_0         
	//  117  298:aload_0         
	//  118  299:invokestatic    #81  <Method zzcg zzcg.zza(String, String, String)>
	//  119  302:putstatic       #210 <Field zzcg zzzr>
	//  120  305:ldc1            #212 <String "analytics.max_hits_per_request.k">
	//  121  307:bipush          20
	//  122  309:bipush          20
	//  123  311:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//  124  314:putstatic       #214 <Field zzcg zzzs>
	//  125  317:ldc1            #216 <String "analytics.max_hit_length.k">
	//  126  319:sipush          8192
	//  127  322:sipush          8192
	//  128  325:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//  129  328:putstatic       #218 <Field zzcg zzzt>
	//  130  331:ldc1            #220 <String "analytics.max_post_length.k">
	//  131  333:sipush          8192
	//  132  336:sipush          8192
	//  133  339:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//  134  342:putstatic       #222 <Field zzcg zzzu>
	//  135  345:ldc1            #224 <String "analytics.max_batch_post_length">
	//  136  347:sipush          8192
	//  137  350:sipush          8192
	//  138  353:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//  139  356:putstatic       #226 <Field zzcg zzzv>
	//  140  359:ldc1            #228 <String "analytics.fallback_responses.k">
	//  141  361:ldc1            #230 <String "404,502">
	//  142  363:ldc1            #230 <String "404,502">
	//  143  365:invokestatic    #81  <Method zzcg zzcg.zza(String, String, String)>
	//  144  368:putstatic       #232 <Field zzcg zzzw>
	//  145  371:ldc1            #234 <String "analytics.batch_retry_interval.seconds.k">
	//  146  373:sipush          3600
	//  147  376:sipush          3600
	//  148  379:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//  149  382:putstatic       #236 <Field zzcg zzzx>
	//  150  385:ldc1            #238 <String "analytics.service_monitor_interval">
	//  151  387:ldc2w           #239 <Long 0x5265c00L>
	//  152  390:ldc2w           #239 <Long 0x5265c00L>
	//  153  393:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//  154  396:putstatic       #242 <Field zzcg zzzy>
	//  155  399:ldc1            #244 <String "analytics.http_connection.connect_timeout_millis">
	//  156  401:ldc1            #245 <Int 60000>
	//  157  403:ldc1            #245 <Int 60000>
	//  158  405:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//  159  408:putstatic       #247 <Field zzcg zzzz>
	//  160  411:ldc1            #249 <String "analytics.http_connection.read_timeout_millis">
	//  161  413:ldc1            #250 <Int 61000>
	//  162  415:ldc1            #250 <Int 61000>
	//  163  417:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//  164  420:putstatic       #252 <Field zzcg zzaaa>
	//  165  423:ldc1            #254 <String "analytics.campaigns.time_limit">
	//  166  425:ldc2w           #239 <Long 0x5265c00L>
	//  167  428:ldc2w           #239 <Long 0x5265c00L>
	//  168  431:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//  169  434:putstatic       #256 <Field zzcg zzaab>
	//  170  437:ldc2            #258 <String "analytics.first_party_experiment_id">
	//  171  440:ldc2            #260 <String "">
	//  172  443:ldc2            #260 <String "">
	//  173  446:invokestatic    #81  <Method zzcg zzcg.zza(String, String, String)>
	//  174  449:putstatic       #262 <Field zzcg zzaac>
	//  175  452:ldc2            #264 <String "analytics.first_party_experiment_variant">
	//  176  455:iconst_0        
	//  177  456:iconst_0        
	//  178  457:invokestatic    #105 <Method zzcg zzcg.zza(String, int, int)>
	//  179  460:putstatic       #266 <Field zzcg zzaad>
	//  180  463:ldc2            #268 <String "analytics.test.disable_receiver">
	//  181  466:iconst_0        
	//  182  467:iconst_0        
	//  183  468:invokestatic    #66  <Method zzcg zzcg.zza(String, boolean, boolean)>
	//  184  471:putstatic       #270 <Field zzcg zzaae>
	//  185  474:ldc2            #272 <String "analytics.service_client.idle_disconnect_millis">
	//  186  477:ldc2w           #273 <Long 10000L>
	//  187  480:ldc2w           #273 <Long 10000L>
	//  188  483:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//  189  486:putstatic       #276 <Field zzcg zzaaf>
	//  190  489:ldc2            #278 <String "analytics.service_client.connect_timeout_millis">
	//  191  492:ldc2w           #126 <Long 5000L>
	//  192  495:ldc2w           #126 <Long 5000L>
	//  193  498:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//  194  501:putstatic       #280 <Field zzcg zzaag>
	//  195  504:ldc2            #282 <String "analytics.service_client.second_connect_delay_millis">
	//  196  507:ldc2w           #126 <Long 5000L>
	//  197  510:ldc2w           #126 <Long 5000L>
	//  198  513:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//  199  516:putstatic       #284 <Field zzcg zzaah>
	//  200  519:ldc2            #286 <String "analytics.service_client.unexpected_reconnect_millis">
	//  201  522:ldc2w           #287 <Long 60000L>
	//  202  525:ldc2w           #287 <Long 60000L>
	//  203  528:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//  204  531:putstatic       #290 <Field zzcg zzaai>
	//  205  534:ldc2            #292 <String "analytics.service_client.reconnect_throttle_millis">
	//  206  537:ldc2w           #118 <Long 0x1b7740L>
	//  207  540:ldc2w           #118 <Long 0x1b7740L>
	//  208  543:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//  209  546:putstatic       #294 <Field zzcg zzaaj>
	//  210  549:ldc2            #296 <String "analytics.monitoring.sample_period_millis">
	//  211  552:ldc2w           #239 <Long 0x5265c00L>
	//  212  555:ldc2w           #239 <Long 0x5265c00L>
	//  213  558:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//  214  561:putstatic       #298 <Field zzcg zzaak>
	//  215  564:ldc2            #300 <String "analytics.initialization_warning_threshold">
	//  216  567:ldc2w           #126 <Long 5000L>
	//  217  570:ldc2w           #126 <Long 5000L>
	//  218  573:invokestatic    #90  <Method zzcg zzcg.zza(String, long, long)>
	//  219  576:putstatic       #302 <Field zzcg zzaal>
	//  220  579:ldc2            #304 <String "analytics.gcm_task_service">
	//  221  582:iconst_0        
	//  222  583:iconst_0        
	//  223  584:invokestatic    #66  <Method zzcg zzcg.zza(String, boolean, boolean)>
	//  224  587:putstatic       #306 <Field zzcg zzaam>
	//* 225  590:return          
	}
}
