// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;


// Referenced classes of package com.google.android.gms.measurement.internal:
//			zzdw

public class zzcu
{

	protected zzcu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void Object()>
	//    2    4:return          
	}

	public static String zzcn(String s)
	{
		return zzdw.zza(s, zzaqu, zzaqt);
	//    0    0:aload_0         
	//    1    1:getstatic       #125 <Field String[] zzaqu>
	//    2    4:getstatic       #69  <Field String[] zzaqt>
	//    3    7:invokestatic    #137 <Method String zzdw.zza(String, String[], String[])>
	//    4   10:areturn         
	}

	public static String zzco(String s)
	{
		return zzdw.zza(s, zzaqt, zzaqu);
	//    0    0:aload_0         
	//    1    1:getstatic       #69  <Field String[] zzaqt>
	//    2    4:getstatic       #125 <Field String[] zzaqu>
	//    3    7:invokestatic    #137 <Method String zzdw.zza(String, String[], String[])>
	//    4   10:areturn         
	}

	public static final String zzaqt[] = {
		"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "ga_campaign", "error", "first_open", 
		"first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", 
		"adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter"
	};
	public static final String zzaqu[] = {
		"_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_cmp", "_err", "_f", 
		"_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", 
		"_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep"
	};

	static 
	{
	//    0    0:bipush          28
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #13  <String "app_clear_data">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #15  <String "app_exception">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #17  <String "app_remove">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #19  <String "app_upgrade">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #21  <String "app_install">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #23  <String "app_update">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #25  <String "firebase_campaign">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #27  <String "ga_campaign">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #29  <String "error">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #31  <String "first_open">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #33  <String "first_visit">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #35  <String "in_app_purchase">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #37  <String "notification_dismiss">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #39  <String "notification_foreground">
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #41  <String "notification_open">
	//   61   88:aastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #43  <String "notification_receive">
	//   65   94:aastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #45  <String "os_update">
	//   69  100:aastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #47  <String "session_start">
	//   73  106:aastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #49  <String "user_engagement">
	//   77  112:aastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #51  <String "ad_exposure">
	//   81  118:aastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #53  <String "adunit_exposure">
	//   85  124:aastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #55  <String "ad_query">
	//   89  130:aastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #57  <String "ad_activeview">
	//   93  136:aastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #59  <String "ad_impression">
	//   97  142:aastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #61  <String "ad_click">
	//  101  148:aastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #63  <String "ad_reward">
	//  105  154:aastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #65  <String "screen_view">
	//  109  160:aastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #67  <String "ga_extra_parameter">
	//  113  166:aastore         
	//  114  167:putstatic       #69  <Field String[] zzaqt>
	//  115  170:bipush          28
	//  116  172:anewarray       String[]
	//  117  175:dup             
	//  118  176:iconst_0        
	//  119  177:ldc1            #71  <String "_cd">
	//  120  179:aastore         
	//  121  180:dup             
	//  122  181:iconst_1        
	//  123  182:ldc1            #73  <String "_ae">
	//  124  184:aastore         
	//  125  185:dup             
	//  126  186:iconst_2        
	//  127  187:ldc1            #75  <String "_ui">
	//  128  189:aastore         
	//  129  190:dup             
	//  130  191:iconst_3        
	//  131  192:ldc1            #77  <String "_ug">
	//  132  194:aastore         
	//  133  195:dup             
	//  134  196:iconst_4        
	//  135  197:ldc1            #79  <String "_in">
	//  136  199:aastore         
	//  137  200:dup             
	//  138  201:iconst_5        
	//  139  202:ldc1            #81  <String "_au">
	//  140  204:aastore         
	//  141  205:dup             
	//  142  206:bipush          6
	//  143  208:ldc1            #83  <String "_cmp">
	//  144  210:aastore         
	//  145  211:dup             
	//  146  212:bipush          7
	//  147  214:ldc1            #83  <String "_cmp">
	//  148  216:aastore         
	//  149  217:dup             
	//  150  218:bipush          8
	//  151  220:ldc1            #85  <String "_err">
	//  152  222:aastore         
	//  153  223:dup             
	//  154  224:bipush          9
	//  155  226:ldc1            #87  <String "_f">
	//  156  228:aastore         
	//  157  229:dup             
	//  158  230:bipush          10
	//  159  232:ldc1            #89  <String "_v">
	//  160  234:aastore         
	//  161  235:dup             
	//  162  236:bipush          11
	//  163  238:ldc1            #91  <String "_iap">
	//  164  240:aastore         
	//  165  241:dup             
	//  166  242:bipush          12
	//  167  244:ldc1            #93  <String "_nd">
	//  168  246:aastore         
	//  169  247:dup             
	//  170  248:bipush          13
	//  171  250:ldc1            #95  <String "_nf">
	//  172  252:aastore         
	//  173  253:dup             
	//  174  254:bipush          14
	//  175  256:ldc1            #97  <String "_no">
	//  176  258:aastore         
	//  177  259:dup             
	//  178  260:bipush          15
	//  179  262:ldc1            #99  <String "_nr">
	//  180  264:aastore         
	//  181  265:dup             
	//  182  266:bipush          16
	//  183  268:ldc1            #101 <String "_ou">
	//  184  270:aastore         
	//  185  271:dup             
	//  186  272:bipush          17
	//  187  274:ldc1            #103 <String "_s">
	//  188  276:aastore         
	//  189  277:dup             
	//  190  278:bipush          18
	//  191  280:ldc1            #105 <String "_e">
	//  192  282:aastore         
	//  193  283:dup             
	//  194  284:bipush          19
	//  195  286:ldc1            #107 <String "_xa">
	//  196  288:aastore         
	//  197  289:dup             
	//  198  290:bipush          20
	//  199  292:ldc1            #109 <String "_xu">
	//  200  294:aastore         
	//  201  295:dup             
	//  202  296:bipush          21
	//  203  298:ldc1            #111 <String "_aq">
	//  204  300:aastore         
	//  205  301:dup             
	//  206  302:bipush          22
	//  207  304:ldc1            #113 <String "_aa">
	//  208  306:aastore         
	//  209  307:dup             
	//  210  308:bipush          23
	//  211  310:ldc1            #115 <String "_ai">
	//  212  312:aastore         
	//  213  313:dup             
	//  214  314:bipush          24
	//  215  316:ldc1            #117 <String "_ac">
	//  216  318:aastore         
	//  217  319:dup             
	//  218  320:bipush          25
	//  219  322:ldc1            #119 <String "_ar">
	//  220  324:aastore         
	//  221  325:dup             
	//  222  326:bipush          26
	//  223  328:ldc1            #121 <String "_vs">
	//  224  330:aastore         
	//  225  331:dup             
	//  226  332:bipush          27
	//  227  334:ldc1            #123 <String "_ep">
	//  228  336:aastore         
	//  229  337:putstatic       #125 <Field String[] zzaqu>
	//* 230  340:return          
	}
}
