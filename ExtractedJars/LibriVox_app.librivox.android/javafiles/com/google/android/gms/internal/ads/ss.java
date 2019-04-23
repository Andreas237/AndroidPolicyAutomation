// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.aw;
import java.text.SimpleDateFormat;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzasi, xo, zzbbi, sn, 
//			zzasm, zzawd, zzaso, zzawo, 
//			zzwb, wx, sl, p, 
//			bwk, m, ws, zzwf, 
//			sw, zzacp, zzyv, zzafz, 
//			aag, zv, zt, nk, 
//			xg

public final class ss
{

	public static zzasm a(Context context, zzasi zzasi1, String s)
	{
		int i;
		boolean flag;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		boolean flag6;
		boolean flag7;
		boolean flag8;
		boolean flag9;
		boolean flag10;
		boolean flag11;
		boolean flag12;
		boolean flag13;
		boolean flag14;
		long l;
		long l1;
		long l2;
		long l3;
		String s1;
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		String s2;
		String s3;
		Object obj4;
		String s4;
		String s5;
		Object obj5;
		String s6;
		List list;
		List list1;
		zzawd zzawd1;
		zzaso zzaso1;
		String s7;
		List list2;
		zzawo zzawo1;
		String s8;
		try
		{
			obj4 = ((Object) (new JSONObject(s)));
	//    0    0:new             #11  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #15  <Method void JSONObject(String)>
	//    4    8:astore          34
			obj = ((Object) (((JSONObject) (obj4)).optString("ad_base_url", ((String) (null)))));
	//    5   10:aload           34
	//    6   12:ldc1            #17  <String "ad_base_url">
	//    7   14:aconst_null     
	//    8   15:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//    9   18:astore          28
			obj1 = ((Object) (((JSONObject) (obj4)).optString("ad_url", ((String) (null)))));
	//   10   20:aload           34
	//   11   22:ldc1            #23  <String "ad_url">
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//   14   28:astore          29
			s2 = ((JSONObject) (obj4)).optString("ad_size", ((String) (null)));
	//   15   30:aload           34
	//   16   32:ldc1            #25  <String "ad_size">
	//   17   34:aconst_null     
	//   18   35:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//   19   38:astore          32
			s3 = ((JSONObject) (obj4)).optString("ad_slot_size", s2);
	//   20   40:aload           34
	//   21   42:ldc1            #27  <String "ad_slot_size">
	//   22   44:aload           32
	//   23   46:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//   24   49:astore          33
		}
	//*  25   51:aload_1         
	//*  26   52:ifnull          1004
	//*  27   55:aload_1         
	//*  28   56:getfield        #33  <Field int zzasi.m>
	//*  29   59:ifeq            1004
	//*  30   62:iconst_1        
	//*  31   63:istore          4
	//*  32   65:goto            68
	//*  33   68:aload           34
	//*  34   70:ldc1            #35  <String "ad_json">
	//*  35   72:aconst_null     
	//*  36   73:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//*  37   76:astore          27
	//*  38   78:aload           27
	//*  39   80:astore_2        
	//*  40   81:aload           27
	//*  41   83:ifnonnull       95
	//*  42   86:aload           34
	//*  43   88:ldc1            #37  <String "ad_html">
	//*  44   90:aconst_null     
	//*  45   91:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//*  46   94:astore_2        
	//*  47   95:aload_2         
	//*  48   96:astore          27
	//*  49   98:aload_2         
	//*  50   99:ifnonnull       112
	//*  51  102:aload           34
	//*  52  104:ldc1            #39  <String "body">
	//*  53  106:aconst_null     
	//*  54  107:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//*  55  110:astore          27
	//*  56  112:aload           27
	//*  57  114:astore_2        
	//*  58  115:aload           27
	//*  59  117:ifnonnull       139
	//*  60  120:aload           27
	//*  61  122:astore_2        
	//*  62  123:aload           34
	//*  63  125:ldc1            #41  <String "ads">
	//*  64  127:invokevirtual   #45  <Method boolean JSONObject.has(String)>
	//*  65  130:ifeq            139
	//*  66  133:aload           34
	//*  67  135:invokevirtual   #49  <Method String JSONObject.toString()>
	//*  68  138:astore_2        
	//*  69  139:aload           34
	//*  70  141:ldc1            #51  <String "debug_dialog">
	//*  71  143:aconst_null     
	//*  72  144:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//*  73  147:astore          35
	//*  74  149:aload           34
	//*  75  151:ldc1            #53  <String "debug_signals">
	//*  76  153:aconst_null     
	//*  77  154:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//*  78  157:astore          36
	//*  79  159:aload           34
	//*  80  161:ldc1            #55  <String "interstitial_timeout">
	//*  81  163:invokevirtual   #45  <Method boolean JSONObject.has(String)>
	//*  82  166:ifeq            1010
	//*  83  169:aload           34
	//*  84  171:ldc1            #55  <String "interstitial_timeout">
	//*  85  173:invokevirtual   #59  <Method double JSONObject.getDouble(String)>
	//*  86  176:ldc2w           #60  <Double 1000D>
	//*  87  179:dmul            
	//*  88  180:d2l             
	//*  89  181:lstore          19
	//*  90  183:goto            186
	//*  91  186:aload           34
	//*  92  188:ldc1            #63  <String "orientation">
	//*  93  190:aconst_null     
	//*  94  191:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//*  95  194:astore          27
	//*  96  196:ldc1            #65  <String "portrait">
	//*  97  198:aload           27
	//*  98  200:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*  99  203:ifeq            216
	//* 100  206:invokestatic    #77  <Method xo aw.g()>
	//* 101  209:invokevirtual   #83  <Method int xo.b()>
	//* 102  212:istore_3        
	//* 103  213:goto            236
	//* 104  216:ldc1            #85  <String "landscape">
	//* 105  218:aload           27
	//* 106  220:invokevirtual   #71  <Method boolean String.equals(Object)>
	//* 107  223:ifeq            1018
	//* 108  226:invokestatic    #77  <Method xo aw.g()>
	//* 109  229:invokevirtual   #87  <Method int xo.a()>
	//* 110  232:istore_3        
	//* 111  233:goto            236
	//* 112  236:aload_2         
	//* 113  237:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 114  240:ifeq            1023
	//* 115  243:aload           29
	//* 116  245:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 117  248:ifne            1023
	//* 118  251:aload_1         
	//* 119  252:aload_0         
	//* 120  253:aload_1         
	//* 121  254:getfield        #97  <Field zzbbi zzasi.k>
	//* 122  257:getfield        #102 <Field String zzbbi.a>
	//* 123  260:aload           29
	//* 124  262:aconst_null     
	//* 125  263:aconst_null     
	//* 126  264:aconst_null     
	//* 127  265:aconst_null     
	//* 128  266:aconst_null     
	//* 129  267:invokestatic    #107 <Method zzasm sn.a(zzasi, Context, String, String, String, String, sv, ad, sm)>
	//* 130  270:astore          30
	//* 131  272:aload           30
	//* 132  274:getfield        #110 <Field String zzasm.a>
	//* 133  277:astore_2        
	//* 134  278:aload           30
	//* 135  280:getfield        #112 <Field String zzasm.b>
	//* 136  283:astore          27
	//* 137  285:aload           30
	//* 138  287:getfield        #115 <Field long zzasm.m>
	//* 139  290:lstore          21
	//* 140  292:goto            295
	//* 141  295:aload           27
	//* 142  297:ifnonnull       309
	//* 143  300:new             #109 <Class zzasm>
	//* 144  303:dup             
	//* 145  304:iconst_0        
	//* 146  305:invokespecial   #118 <Method void zzasm(int)>
	//* 147  308:areturn         
	//* 148  309:aload           34
	//* 149  311:ldc1            #120 <String "click_urls">
	//* 150  313:invokevirtual   #124 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 151  316:astore          29
	//* 152  318:aload           30
	//* 153  320:ifnonnull       328
	//* 154  323:aconst_null     
	//* 155  324:astore_0        
	//* 156  325:goto            334
	//* 157  328:aload           30
	//* 158  330:getfield        #128 <Field List zzasm.c>
	//* 159  333:astore_0        
	//* 160  334:aload_0         
	//* 161  335:astore          28
	//* 162  337:aload           29
	//* 163  339:ifnull          350
	//* 164  342:aload           29
	//* 165  344:aload_0         
	//* 166  345:invokestatic    #131 <Method List a(JSONArray, List)>
	//* 167  348:astore          28
	//* 168  350:aload           34
	//* 169  352:ldc1            #133 <String "impression_urls">
	//* 170  354:invokevirtual   #124 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 171  357:astore          31
	//* 172  359:aload           30
	//* 173  361:ifnonnull       369
	//* 174  364:aconst_null     
	//* 175  365:astore_0        
	//* 176  366:goto            375
	//* 177  369:aload           30
	//* 178  371:getfield        #136 <Field List zzasm.e>
	//* 179  374:astore_0        
	//* 180  375:aload_0         
	//* 181  376:astore          29
	//* 182  378:aload           31
	//* 183  380:ifnull          391
	//* 184  383:aload           31
	//* 185  385:aload_0         
	//* 186  386:invokestatic    #131 <Method List a(JSONArray, List)>
	//* 187  389:astore          29
	//* 188  391:aload           34
	//* 189  393:ldc1            #138 <String "downloaded_impression_urls">
	//* 190  395:invokevirtual   #124 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 191  398:astore          31
	//* 192  400:aload           30
	//* 193  402:ifnonnull       410
	//* 194  405:aconst_null     
	//* 195  406:astore_0        
	//* 196  407:goto            416
	//* 197  410:aload           30
	//* 198  412:getfield        #141 <Field List zzasm.R>
	//* 199  415:astore_0        
	//* 200  416:aload           31
	//* 201  418:ifnull          1042
	//* 202  421:aload           31
	//* 203  423:aload_0         
	//* 204  424:invokestatic    #131 <Method List a(JSONArray, List)>
	//* 205  427:astore          31
	//* 206  429:goto            432
	//* 207  432:aload           34
	//* 208  434:ldc1            #143 <String "manual_impression_urls">
	//* 209  436:invokevirtual   #124 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 210  439:astore          37
	//* 211  441:aload           30
	//* 212  443:ifnonnull       451
	//* 213  446:aconst_null     
	//* 214  447:astore_0        
	//* 215  448:goto            457
	//* 216  451:aload           30
	//* 217  453:getfield        #146 <Field List zzasm.i>
	//* 218  456:astore_0        
	//* 219  457:aload           37
	//* 220  459:ifnull          1048
	//* 221  462:aload           37
	//* 222  464:aload_0         
	//* 223  465:invokestatic    #131 <Method List a(JSONArray, List)>
	//* 224  468:astore_0        
	//* 225  469:goto            472
	//* 226  472:aload           30
	//* 227  474:ifnull          1054
	//* 228  477:aload           30
	//* 229  479:getfield        #148 <Field int zzasm.k>
	//* 230  482:iconst_m1       
	//* 231  483:icmpeq          492
	//* 232  486:aload           30
	//* 233  488:getfield        #148 <Field int zzasm.k>
	//* 234  491:istore_3        
	//* 235  492:aload           30
	//* 236  494:getfield        #151 <Field long zzasm.f>
	//* 237  497:lconst_0        
	//* 238  498:lcmp            
	//* 239  499:ifle            1051
	//* 240  502:aload           30
	//* 241  504:getfield        #151 <Field long zzasm.f>
	//* 242  507:lstore          19
	//* 243  509:goto            512
	//* 244  512:aload           34
	//* 245  514:ldc1            #153 <String "active_view">
	//* 246  516:invokevirtual   #156 <Method String JSONObject.optString(String)>
	//* 247  519:astore          37
	//* 248  521:aload           34
	//* 249  523:ldc1            #158 <String "ad_is_javascript">
	//* 250  525:iconst_0        
	//* 251  526:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 252  529:istore          6
	//* 253  531:iload           6
	//* 254  533:ifeq            1057
	//* 255  536:aload           34
	//* 256  538:ldc1            #164 <String "ad_passback_url">
	//* 257  540:aconst_null     
	//* 258  541:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//* 259  544:astore          30
	//* 260  546:goto            549
	//* 261  549:aload           34
	//* 262  551:ldc1            #166 <String "mediation">
	//* 263  553:iconst_0        
	//* 264  554:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 265  557:istore          7
	//* 266  559:aload           34
	//* 267  561:ldc1            #168 <String "custom_render_allowed">
	//* 268  563:iconst_0        
	//* 269  564:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 270  567:istore          8
	//* 271  569:aload           34
	//* 272  571:ldc1            #170 <String "content_url_opted_out">
	//* 273  573:iconst_1        
	//* 274  574:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 275  577:istore          9
	//* 276  579:aload           34
	//* 277  581:ldc1            #172 <String "content_vertical_opted_out">
	//* 278  583:iconst_1        
	//* 279  584:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 280  587:istore          10
	//* 281  589:aload           34
	//* 282  591:ldc1            #174 <String "prefetch">
	//* 283  593:iconst_0        
	//* 284  594:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 285  597:istore          11
	//* 286  599:aload           34
	//* 287  601:ldc1            #176 <String "refresh_interval_milliseconds">
	//* 288  603:ldc2w           #177 <Long -1L>
	//* 289  606:invokevirtual   #182 <Method long JSONObject.optLong(String, long)>
	//* 290  609:lstore          23
	//* 291  611:aload           34
	//* 292  613:ldc1            #184 <String "mediation_config_cache_time_milliseconds">
	//* 293  615:ldc2w           #177 <Long -1L>
	//* 294  618:invokevirtual   #182 <Method long JSONObject.optLong(String, long)>
	//* 295  621:lstore          25
	//* 296  623:aload           34
	//* 297  625:ldc1            #186 <String "gws_query_id">
	//* 298  627:ldc1            #188 <String "">
	//* 299  629:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//* 300  632:astore          38
	//* 301  634:ldc1            #190 <String "height">
	//* 302  636:aload           34
	//* 303  638:ldc1            #192 <String "fluid">
	//* 304  640:ldc1            #188 <String "">
	//* 305  642:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//* 306  645:invokevirtual   #71  <Method boolean String.equals(Object)>
	//* 307  648:istore          12
	//* 308  650:aload           34
	//* 309  652:ldc1            #194 <String "native_express">
	//* 310  654:iconst_0        
	//* 311  655:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 312  658:istore          13
	//* 313  660:aload           34
	//* 314  662:ldc1            #196 <String "video_start_urls">
	//* 315  664:invokevirtual   #124 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 316  667:aconst_null     
	//* 317  668:invokestatic    #131 <Method List a(JSONArray, List)>
	//* 318  671:astore          39
	//* 319  673:aload           34
	//* 320  675:ldc1            #198 <String "video_complete_urls">
	//* 321  677:invokevirtual   #124 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 322  680:aconst_null     
	//* 323  681:invokestatic    #131 <Method List a(JSONArray, List)>
	//* 324  684:astore          40
	//* 325  686:aload           34
	//* 326  688:ldc1            #200 <String "rewards">
	//* 327  690:invokevirtual   #124 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 328  693:invokestatic    #205 <Method zzawd zzawd.a(JSONArray)>
	//* 329  696:astore          41
	//* 330  698:aload           34
	//* 331  700:ldc1            #207 <String "use_displayed_impression">
	//* 332  702:iconst_0        
	//* 333  703:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 334  706:istore          14
	//* 335  708:aload           34
	//* 336  710:ldc1            #209 <String "auto_protection_configuration">
	//* 337  712:invokevirtual   #213 <Method JSONObject JSONObject.optJSONObject(String)>
	//* 338  715:invokestatic    #218 <Method zzaso zzaso.a(JSONObject)>
	//* 339  718:astore          42
	//* 340  720:aload           34
	//* 341  722:ldc1            #220 <String "set_cookie">
	//* 342  724:ldc1            #188 <String "">
	//* 343  726:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//* 344  729:astore          43
	//* 345  731:aload           34
	//* 346  733:ldc1            #222 <String "remote_ping_urls">
	//* 347  735:invokevirtual   #124 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 348  738:aconst_null     
	//* 349  739:invokestatic    #131 <Method List a(JSONArray, List)>
	//* 350  742:astore          44
	//* 351  744:aload           34
	//* 352  746:ldc1            #224 <String "safe_browsing">
	//* 353  748:invokevirtual   #213 <Method JSONObject JSONObject.optJSONObject(String)>
	//* 354  751:invokestatic    #229 <Method zzawo zzawo.a(JSONObject)>
	//* 355  754:astore          45
	//* 356  756:aload           34
	//* 357  758:ldc1            #231 <String "render_in_browser">
	//* 358  760:aload_1         
	//* 359  761:getfield        #235 <Field boolean zzasi.K>
	//* 360  764:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 361  767:istore          15
	//* 362  769:aload           34
	//* 363  771:ldc1            #237 <String "custom_close_blocked">
	//* 364  773:invokevirtual   #239 <Method boolean JSONObject.optBoolean(String)>
	//* 365  776:istore          16
	//* 366  778:aload           34
	//* 367  780:ldc1            #241 <String "enable_omid">
	//* 368  782:iconst_0        
	//* 369  783:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 370  786:istore          17
	//* 371  788:aload           34
	//* 372  790:ldc1            #243 <String "omid_settings">
	//* 373  792:aconst_null     
	//* 374  793:invokevirtual   #21  <Method String JSONObject.optString(String, String)>
	//* 375  796:astore          46
	//* 376  798:aload           34
	//* 377  800:ldc1            #245 <String "disable_closable_area">
	//* 378  802:iconst_0        
	//* 379  803:invokevirtual   #162 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 380  806:istore          18
	//* 381  808:aload_1         
	//* 382  809:getfield        #248 <Field zzwb zzasi.c>
	//* 383  812:getfield        #253 <Field Bundle zzwb.m>
	//* 384  815:ldc1            #255 <Class AdMobAdapter>
	//* 385  817:invokevirtual   #260 <Method String Class.getName()>
	//* 386  820:invokevirtual   #266 <Method Bundle Bundle.getBundle(String)>
	//* 387  823:astore          34
	//* 388  825:aload           34
	//* 389  827:ifnull          1063
	//* 390  830:aload           34
	//* 391  832:ldc2            #268 <String "is_analytics_logging_enabled">
	//* 392  835:iconst_0        
	//* 393  836:invokevirtual   #271 <Method boolean Bundle.getBoolean(String, boolean)>
	//* 394  839:ifeq            1063
	//* 395  842:iconst_1        
	//* 396  843:istore          5
	//* 397  845:goto            848
	//* 398  848:new             #109 <Class zzasm>
	//* 399  851:dup             
	//* 400  852:aload_1         
	//* 401  853:aload_2         
	//* 402  854:aload           27
	//* 403  856:aload           28
	//* 404  858:aload           29
	//* 405  860:lload           19
	//* 406  862:iload           7
	//* 407  864:lload           25
	//* 408  866:aload_0         
	//* 409  867:lload           23
	//* 410  869:iload_3         
	//* 411  870:aload           32
	//* 412  872:lload           21
	//* 413  874:aload           35
	//* 414  876:iload           6
	//* 415  878:aload           30
	//* 416  880:aload           37
	//* 417  882:iload           8
	//* 418  884:iload           4
	//* 419  886:aload_1         
	//* 420  887:getfield        #274 <Field boolean zzasi.p>
	//* 421  890:iload           9
	//* 422  892:iload           11
	//* 423  894:aload           38
	//* 424  896:iload           12
	//* 425  898:iload           13
	//* 426  900:aload           41
	//* 427  902:aload           39
	//* 428  904:aload           40
	//* 429  906:iload           14
	//* 430  908:aload           42
	//* 431  910:aload_1         
	//* 432  911:getfield        #277 <Field boolean zzasi.G>
	//* 433  914:aload           43
	//* 434  916:aload           44
	//* 435  918:iload           15
	//* 436  920:aload           33
	//* 437  922:aload           45
	//* 438  924:aload           36
	//* 439  926:iload           10
	//* 440  928:aload_1         
	//* 441  929:getfield        #280 <Field boolean zzasi.U>
	//* 442  932:iload           16
	//* 443  934:iconst_0        
	//* 444  935:iload           17
	//* 445  937:aload           31
	//* 446  939:iload           18
	//* 447  941:aload           46
	//* 448  943:ldc1            #188 <String "">
	//* 449  945:iload           5
	//* 450  947:invokespecial   #283 <Method void zzasm(zzasi, String, String, List, List, long, boolean, long, List, long, int, String, long, String, boolean, String, String, boolean, boolean, boolean, boolean, boolean, String, boolean, boolean, zzawd, List, List, boolean, zzaso, boolean, String, List, boolean, String, zzawo, String, boolean, boolean, boolean, int, boolean, List, boolean, String, String, boolean)>
	//* 451  950:astore_0        
	//* 452  951:aload_0         
	//* 453  952:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 454  953:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((JSONException) (context)).getMessage())))));
	//  455  954:aload_0         
	//  456  955:invokevirtual   #286 <Method String JSONException.getMessage()>
	//  457  958:invokestatic    #290 <Method String String.valueOf(Object)>
	//  458  961:astore_0        
			if(((String) (context)).length() != 0)
	//* 459  962:aload_0         
	//* 460  963:invokevirtual   #293 <Method int String.length()>
	//* 461  966:ifeq            980
				context = ((Context) ("Could not parse the inline ad response: ".concat(((String) (context)))));
	//  462  969:ldc2            #295 <String "Could not parse the inline ad response: ">
	//  463  972:aload_0         
	//  464  973:invokevirtual   #298 <Method String String.concat(String)>
	//  465  976:astore_0        
			else
	//* 466  977:goto            991
				context = ((Context) (new String("Could not parse the inline ad response: ")));
	//  467  980:new             #67  <Class String>
	//  468  983:dup             
	//  469  984:ldc2            #295 <String "Could not parse the inline ad response: ">
	//  470  987:invokespecial   #299 <Method void String(String)>
	//  471  990:astore_0        
			wx.e(((String) (context)));
	//  472  991:aload_0         
	//  473  992:invokestatic    #303 <Method void wx.e(String)>
			return new zzasm(0);
	//  474  995:new             #109 <Class zzasm>
	//  475  998:dup             
	//  476  999:iconst_0        
	//  477 1000:invokespecial   #118 <Method void zzasm(int)>
	//  478 1003:areturn         
		}
		if(zzasi1 == null) goto _L2; else goto _L1
_L1:
		if(zzasi1.m == 0) goto _L2; else goto _L3
_L3:
		flag = true;
_L17:
		s1 = ((JSONObject) (obj4)).optString("ad_json", ((String) (null)));
		s = s1;
		if(s1 != null)
			break MISSING_BLOCK_LABEL_95;
		s = ((JSONObject) (obj4)).optString("ad_html", ((String) (null)));
		s1 = s;
		if(s != null)
			break MISSING_BLOCK_LABEL_112;
		s1 = ((JSONObject) (obj4)).optString("body", ((String) (null)));
		s = s1;
		if(s1 != null)
			break MISSING_BLOCK_LABEL_139;
		s = s1;
		if(((JSONObject) (obj4)).has("ads"))
			s = ((JSONObject) (obj4)).toString();
		s4 = ((JSONObject) (obj4)).optString("debug_dialog", ((String) (null)));
		s5 = ((JSONObject) (obj4)).optString("debug_signals", ((String) (null)));
		if(!((JSONObject) (obj4)).has("interstitial_timeout")) goto _L5; else goto _L4
_L4:
		l = (long)(((JSONObject) (obj4)).getDouble("interstitial_timeout") * 1000D);
_L18:
		s1 = ((JSONObject) (obj4)).optString("orientation", ((String) (null)));
		if(!"portrait".equals(((Object) (s1)))) goto _L7; else goto _L6
_L6:
		i = aw.g().b();
		  goto _L8
_L7:
		if(!"landscape".equals(((Object) (s1)))) goto _L10; else goto _L9
_L9:
		i = aw.g().a();
_L8:
		if(!TextUtils.isEmpty(((CharSequence) (s))) || TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L12; else goto _L11
_L11:
		obj2 = ((Object) (sn.a(zzasi1, context, zzasi1.k.a, ((String) (obj1)), ((String) (null)), ((String) (null)), ((sv) (null)), ((ad) (null)), ((sm) (null)))));
		s = ((zzasm) (obj2)).a;
		s1 = ((zzasm) (obj2)).b;
		l1 = ((zzasm) (obj2)).m;
_L19:
		if(s1 != null)
			break MISSING_BLOCK_LABEL_309;
		return new zzasm(0);
		obj1 = ((Object) (((JSONObject) (obj4)).optJSONArray("click_urls")));
		if(obj2 == null)
		{
			context = null;
			break MISSING_BLOCK_LABEL_334;
		}
		context = ((Context) (((zzasm) (obj2)).c));
		obj = ((Object) (context));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_350;
		obj = ((Object) (a(((JSONArray) (obj1)), ((List) (context)))));
		obj3 = ((Object) (((JSONObject) (obj4)).optJSONArray("impression_urls")));
		if(obj2 == null)
		{
			context = null;
			break MISSING_BLOCK_LABEL_375;
		}
		context = ((Context) (((zzasm) (obj2)).e));
		obj1 = ((Object) (context));
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_391;
		obj1 = ((Object) (a(((JSONArray) (obj3)), ((List) (context)))));
		obj3 = ((Object) (((JSONObject) (obj4)).optJSONArray("downloaded_impression_urls")));
		if(obj2 == null)
		{
			context = null;
			break MISSING_BLOCK_LABEL_416;
		}
		context = ((Context) (((zzasm) (obj2)).R));
		if(obj3 == null) goto _L14; else goto _L13
_L13:
		obj3 = ((Object) (a(((JSONArray) (obj3)), ((List) (context)))));
_L20:
		obj5 = ((Object) (((JSONObject) (obj4)).optJSONArray("manual_impression_urls")));
		if(obj2 == null)
		{
			context = null;
			break MISSING_BLOCK_LABEL_457;
		}
		context = ((Context) (((zzasm) (obj2)).i));
		if(obj5 == null)
			break MISSING_BLOCK_LABEL_472;
		context = ((Context) (a(((JSONArray) (obj5)), ((List) (context)))));
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_512;
		if(((zzasm) (obj2)).k != -1)
			i = ((zzasm) (obj2)).k;
		if(((zzasm) (obj2)).f > 0L)
			l = ((zzasm) (obj2)).f;
		obj5 = ((Object) (((JSONObject) (obj4)).optString("active_view")));
		flag2 = ((JSONObject) (obj4)).optBoolean("ad_is_javascript", false);
		if(!flag2) goto _L16; else goto _L15
_L15:
		obj2 = ((Object) (((JSONObject) (obj4)).optString("ad_passback_url", ((String) (null)))));
_L21:
		flag3 = ((JSONObject) (obj4)).optBoolean("mediation", false);
		flag4 = ((JSONObject) (obj4)).optBoolean("custom_render_allowed", false);
		flag5 = ((JSONObject) (obj4)).optBoolean("content_url_opted_out", true);
		flag6 = ((JSONObject) (obj4)).optBoolean("content_vertical_opted_out", true);
		flag7 = ((JSONObject) (obj4)).optBoolean("prefetch", false);
		l2 = ((JSONObject) (obj4)).optLong("refresh_interval_milliseconds", -1L);
		l3 = ((JSONObject) (obj4)).optLong("mediation_config_cache_time_milliseconds", -1L);
		s6 = ((JSONObject) (obj4)).optString("gws_query_id", "");
		flag8 = "height".equals(((Object) (((JSONObject) (obj4)).optString("fluid", ""))));
		flag9 = ((JSONObject) (obj4)).optBoolean("native_express", false);
		list = a(((JSONObject) (obj4)).optJSONArray("video_start_urls"), ((List) (null)));
		list1 = a(((JSONObject) (obj4)).optJSONArray("video_complete_urls"), ((List) (null)));
		zzawd1 = zzawd.a(((JSONObject) (obj4)).optJSONArray("rewards"));
		flag10 = ((JSONObject) (obj4)).optBoolean("use_displayed_impression", false);
		zzaso1 = zzaso.a(((JSONObject) (obj4)).optJSONObject("auto_protection_configuration"));
		s7 = ((JSONObject) (obj4)).optString("set_cookie", "");
		list2 = a(((JSONObject) (obj4)).optJSONArray("remote_ping_urls"), ((List) (null)));
		zzawo1 = zzawo.a(((JSONObject) (obj4)).optJSONObject("safe_browsing"));
		flag11 = ((JSONObject) (obj4)).optBoolean("render_in_browser", zzasi1.K);
		flag12 = ((JSONObject) (obj4)).optBoolean("custom_close_blocked");
		flag13 = ((JSONObject) (obj4)).optBoolean("enable_omid", false);
		s8 = ((JSONObject) (obj4)).optString("omid_settings", ((String) (null)));
		flag14 = ((JSONObject) (obj4)).optBoolean("disable_closable_area", false);
		obj4 = ((Object) (zzasi1.c.m.getBundle(((Class) (com/google/ads/mediation/admob/AdMobAdapter)).getName())));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_1063;
		if(!((Bundle) (obj4)).getBoolean("is_analytics_logging_enabled", false))
			break MISSING_BLOCK_LABEL_1063;
		flag1 = true;
_L22:
		context = ((Context) (new zzasm(zzasi1, s, s1, ((List) (obj)), ((List) (obj1)), l, flag3, l3, ((List) (context)), l2, i, s2, l1, s4, flag2, ((String) (obj2)), ((String) (obj5)), flag4, flag, zzasi1.p, flag5, flag7, s6, flag8, flag9, zzawd1, list, list1, flag10, zzaso1, zzasi1.G, s7, list2, flag11, s3, zzawo1, s5, flag6, zzasi1.U, flag12, 0, flag13, ((List) (obj3)), flag14, s8, "", flag1)));
		return ((zzasm) (context));
_L2:
		flag = false;
	//  479 1004:iconst_0        
	//  480 1005:istore          4
		  goto _L17
	//* 481 1007:goto            68
_L5:
		l = -1L;
	//  482 1010:ldc2w           #177 <Long -1L>
	//  483 1013:lstore          19
		  goto _L18
	//* 484 1015:goto            186
_L10:
		i = -1;
	//  485 1018:iconst_m1       
	//  486 1019:istore_3        
		  goto _L8
	//* 487 1020:goto            236
_L12:
		context = ((Context) (obj));
	//  488 1023:aload           28
	//  489 1025:astore_0        
		s1 = s;
	//  490 1026:aload_2         
	//  491 1027:astore          27
		obj2 = null;
	//  492 1029:aconst_null     
	//  493 1030:astore          30
		l1 = -1L;
	//  494 1032:ldc2w           #177 <Long -1L>
	//  495 1035:lstore          21
		s = ((String) (context));
	//  496 1037:aload_0         
	//  497 1038:astore_2        
		  goto _L19
	//* 498 1039:goto            295
_L14:
		obj3 = ((Object) (context));
	//  499 1042:aload_0         
	//  500 1043:astore          31
		  goto _L20
	//* 501 1045:goto            432
	//* 502 1048:goto            472
	//* 503 1051:goto            512
	//* 504 1054:goto            512
_L16:
		obj2 = null;
	//  505 1057:aconst_null     
	//  506 1058:astore          30
		  goto _L21
	//* 507 1060:goto            549
		flag1 = false;
	//  508 1063:iconst_0        
	//  509 1064:istore          5
		  goto _L22
	//* 510 1066:goto            848
	}

	private static Integer a(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #307 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #309 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #312 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private static List a(JSONArray jsonarray, List list)
	{
		if(jsonarray == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		Object obj = ((Object) (list));
	//    4    6:aload_1         
	//    5    7:astore_3        
		if(list == null)
	//*   6    8:aload_1         
	//*   7    9:ifnonnull       20
			obj = ((Object) (new ArrayList()));
	//    8   12:new             #314 <Class ArrayList>
	//    9   15:dup             
	//   10   16:invokespecial   #317 <Method void ArrayList()>
	//   11   19:astore_3        
		for(int i = 0; i < jsonarray.length(); i++)
	//*  12   20:iconst_0        
	//*  13   21:istore_2        
	//*  14   22:iload_2         
	//*  15   23:aload_0         
	//*  16   24:invokevirtual   #320 <Method int JSONArray.length()>
	//*  17   27:icmpge          49
			((List) (obj)).add(((Object) (jsonarray.getString(i))));
	//   18   30:aload_3         
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #324 <Method String JSONArray.getString(int)>
	//   22   36:invokeinterface #329 <Method boolean List.add(Object)>
	//   23   41:pop             

	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
	//*  28   46:goto            22
		return ((List) (obj));
	//   29   49:aload_3         
	//   30   50:areturn         
	}

	private static JSONArray a(List list)
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #319 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #331 <Method void JSONArray()>
	//    3    7:astore_1        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); jsonarray.put(((Object) ((String)((Iterator) (list)).next()))));
	//    4    8:aload_0         
	//    5    9:invokeinterface #335 <Method Iterator List.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #341 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            41
	//   10   24:aload_1         
	//   11   25:aload_0         
	//   12   26:invokeinterface #345 <Method Object Iterator.next()>
	//   13   31:checkcast       #67  <Class String>
	//   14   34:invokevirtual   #349 <Method JSONArray JSONArray.put(Object)>
	//   15   37:pop             
	//*  16   38:goto            15
		return jsonarray;
	//   17   41:aload_1         
	//   18   42:areturn         
	}

	public static JSONObject a(Context context, sl sl1)
	{
		zzasi zzasi1;
		Object obj2;
		Object obj3;
		sw sw1;
		Bundle bundle;
		zzasi1 = sl1.i;
	//    0    0:aload_1         
	//    1    1:getfield        #355 <Field zzasi sl.i>
	//    2    4:astore          13
		obj3 = ((Object) (sl1.d));
	//    3    6:aload_1         
	//    4    7:getfield        #359 <Field Location sl.d>
	//    5   10:astore          15
		sw1 = sl1.j;
	//    6   12:aload_1         
	//    7   13:getfield        #363 <Field sw sl.j>
	//    8   16:astore          16
		bundle = sl1.a;
	//    9   18:aload_1         
	//   10   19:getfield        #365 <Field Bundle sl.a>
	//   11   22:astore          17
		obj2 = ((Object) (sl1.k));
	//   12   24:aload_1         
	//   13   25:getfield        #368 <Field JSONObject sl.k>
	//   14   28:astore          14
		HashMap hashmap;
		hashmap = new HashMap();
	//   15   30:new             #370 <Class HashMap>
	//   16   33:dup             
	//   17   34:invokespecial   #371 <Method void HashMap()>
	//   18   37:astore          12
		Object obj = ((Object) (p.bt));
	//   19   39:getstatic       #377 <Field e p.bt>
	//   20   42:astore          11
		hashmap.put("extra_caps", bwk.e().a(((e) (obj))));
	//   21   44:aload           12
	//   22   46:ldc2            #379 <String "extra_caps">
	//   23   49:invokestatic    #384 <Method m bwk.e()>
	//   24   52:aload           11
	//   25   54:invokevirtual   #389 <Method Object m.a(e)>
	//   26   57:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   27   60:pop             
		if(sl1.c.size() > 0)
	//*  28   61:aload_1         
	//*  29   62:getfield        #393 <Field List sl.c>
	//*  30   65:invokeinterface #396 <Method int List.size()>
	//*  31   70:ifle            92
			hashmap.put("eid", ((Object) (TextUtils.join(",", ((Iterable) (sl1.c))))));
	//   32   73:aload           12
	//   33   75:ldc2            #398 <String "eid">
	//   34   78:ldc2            #400 <String ",">
	//   35   81:aload_1         
	//   36   82:getfield        #393 <Field List sl.c>
	//   37   85:invokestatic    #404 <Method String TextUtils.join(CharSequence, Iterable)>
	//   38   88:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   39   91:pop             
		if(zzasi1.b != null)
	//*  40   92:aload           13
	//*  41   94:getfield        #406 <Field Bundle zzasi.b>
	//*  42   97:ifnull          114
			hashmap.put("ad_pos", ((Object) (zzasi1.b)));
	//   43  100:aload           12
	//   44  102:ldc2            #408 <String "ad_pos">
	//   45  105:aload           13
	//   46  107:getfield        #406 <Field Bundle zzasi.b>
	//   47  110:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   48  113:pop             
		obj = ((Object) (zzasi1.c));
	//   49  114:aload           13
	//   50  116:getfield        #248 <Field zzwb zzasi.c>
	//   51  119:astore          11
		ws.a();
	//   52  121:invokestatic    #412 <Method String ws.a()>
	//   53  124:pop             
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMdd", Locale.US);
	//   54  125:new             #414 <Class SimpleDateFormat>
	//   55  128:dup             
	//   56  129:ldc2            #416 <String "yyyyMMdd">
	//   57  132:getstatic       #422 <Field Locale Locale.US>
	//   58  135:invokespecial   #425 <Method void SimpleDateFormat(String, Locale)>
	//   59  138:astore          18
		if(((zzwb) (obj)).b != -1L)
	//*  60  140:aload           11
	//*  61  142:getfield        #427 <Field long zzwb.b>
	//*  62  145:ldc2w           #177 <Long -1L>
	//*  63  148:lcmp            
	//*  64  149:ifeq            178
			hashmap.put("cust_age", ((Object) (simpledateformat.format(new Date(((zzwb) (obj)).b)))));
	//   65  152:aload           12
	//   66  154:ldc2            #429 <String "cust_age">
	//   67  157:aload           18
	//   68  159:new             #431 <Class Date>
	//   69  162:dup             
	//   70  163:aload           11
	//   71  165:getfield        #427 <Field long zzwb.b>
	//   72  168:invokespecial   #434 <Method void Date(long)>
	//   73  171:invokevirtual   #438 <Method String SimpleDateFormat.format(Date)>
	//   74  174:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   75  177:pop             
		if(((zzwb) (obj)).c != null)
	//*  76  178:aload           11
	//*  77  180:getfield        #440 <Field Bundle zzwb.c>
	//*  78  183:ifnull          200
			hashmap.put("extras", ((Object) (((zzwb) (obj)).c)));
	//   79  186:aload           12
	//   80  188:ldc2            #442 <String "extras">
	//   81  191:aload           11
	//   82  193:getfield        #440 <Field Bundle zzwb.c>
	//   83  196:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   84  199:pop             
		if(((zzwb) (obj)).d != -1)
	//*  85  200:aload           11
	//*  86  202:getfield        #444 <Field int zzwb.d>
	//*  87  205:iconst_m1       
	//*  88  206:icmpeq          226
			hashmap.put("cust_gender", ((Object) (Integer.valueOf(((zzwb) (obj)).d))));
	//   89  209:aload           12
	//   90  211:ldc2            #446 <String "cust_gender">
	//   91  214:aload           11
	//   92  216:getfield        #444 <Field int zzwb.d>
	//   93  219:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//   94  222:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   95  225:pop             
		if(((zzwb) (obj)).e != null)
	//*  96  226:aload           11
	//*  97  228:getfield        #452 <Field List zzwb.e>
	//*  98  231:ifnull          248
			hashmap.put("kw", ((Object) (((zzwb) (obj)).e)));
	//   99  234:aload           12
	//  100  236:ldc2            #454 <String "kw">
	//  101  239:aload           11
	//  102  241:getfield        #452 <Field List zzwb.e>
	//  103  244:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  104  247:pop             
		if(((zzwb) (obj)).g != -1)
	//* 105  248:aload           11
	//* 106  250:getfield        #456 <Field int zzwb.g>
	//* 107  253:iconst_m1       
	//* 108  254:icmpeq          274
			hashmap.put("tag_for_child_directed_treatment", ((Object) (Integer.valueOf(((zzwb) (obj)).g))));
	//  109  257:aload           12
	//  110  259:ldc2            #458 <String "tag_for_child_directed_treatment">
	//  111  262:aload           11
	//  112  264:getfield        #456 <Field int zzwb.g>
	//  113  267:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//  114  270:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  115  273:pop             
		if(((zzwb) (obj)).f)
	//* 116  274:aload           11
	//* 117  276:getfield        #460 <Field boolean zzwb.f>
	//* 118  279:ifeq            295
			hashmap.put("test_request", ((Object) (Boolean.valueOf(true))));
	//  119  282:aload           12
	//  120  284:ldc2            #462 <String "test_request">
	//  121  287:iconst_1        
	//  122  288:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//  123  291:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  124  294:pop             
		if(((zzwb) (obj)).a >= 2)
	//* 125  295:aload           11
	//* 126  297:getfield        #469 <Field int zzwb.a>
	//* 127  300:iconst_2        
	//* 128  301:icmplt          350
		{
			if(((zzwb) (obj)).h)
	//* 129  304:aload           11
	//* 130  306:getfield        #472 <Field boolean zzwb.h>
	//* 131  309:ifeq            325
				hashmap.put("d_imp_hdr", ((Object) (Integer.valueOf(1))));
	//  132  312:aload           12
	//  133  314:ldc2            #474 <String "d_imp_hdr">
	//  134  317:iconst_1        
	//  135  318:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//  136  321:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  137  324:pop             
			if(!TextUtils.isEmpty(((CharSequence) (((zzwb) (obj)).i))))
	//* 138  325:aload           11
	//* 139  327:getfield        #476 <Field String zzwb.i>
	//* 140  330:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 141  333:ifne            350
				hashmap.put("ppid", ((Object) (((zzwb) (obj)).i)));
	//  142  336:aload           12
	//  143  338:ldc2            #478 <String "ppid">
	//  144  341:aload           11
	//  145  343:getfield        #476 <Field String zzwb.i>
	//  146  346:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  147  349:pop             
		}
		if(((zzwb) (obj)).a >= 3 && ((zzwb) (obj)).l != null)
	//* 148  350:aload           11
	//* 149  352:getfield        #469 <Field int zzwb.a>
	//* 150  355:iconst_3        
	//* 151  356:icmplt          381
	//* 152  359:aload           11
	//* 153  361:getfield        #481 <Field String zzwb.l>
	//* 154  364:ifnull          381
			hashmap.put("url", ((Object) (((zzwb) (obj)).l)));
	//  155  367:aload           12
	//  156  369:ldc2            #483 <String "url">
	//  157  372:aload           11
	//  158  374:getfield        #481 <Field String zzwb.l>
	//  159  377:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  160  380:pop             
		if(((zzwb) (obj)).a >= 5)
	//* 161  381:aload           11
	//* 162  383:getfield        #469 <Field int zzwb.a>
	//* 163  386:iconst_5        
	//* 164  387:icmplt          456
		{
			if(((zzwb) (obj)).n != null)
	//* 165  390:aload           11
	//* 166  392:getfield        #486 <Field Bundle zzwb.n>
	//* 167  395:ifnull          412
				hashmap.put("custom_targeting", ((Object) (((zzwb) (obj)).n)));
	//  168  398:aload           12
	//  169  400:ldc2            #488 <String "custom_targeting">
	//  170  403:aload           11
	//  171  405:getfield        #486 <Field Bundle zzwb.n>
	//  172  408:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  173  411:pop             
			if(((zzwb) (obj)).o != null)
	//* 174  412:aload           11
	//* 175  414:getfield        #491 <Field List zzwb.o>
	//* 176  417:ifnull          434
				hashmap.put("category_exclusions", ((Object) (((zzwb) (obj)).o)));
	//  177  420:aload           12
	//  178  422:ldc2            #493 <String "category_exclusions">
	//  179  425:aload           11
	//  180  427:getfield        #491 <Field List zzwb.o>
	//  181  430:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  182  433:pop             
			if(((zzwb) (obj)).p != null)
	//* 183  434:aload           11
	//* 184  436:getfield        #495 <Field String zzwb.p>
	//* 185  439:ifnull          456
				hashmap.put("request_agent", ((Object) (((zzwb) (obj)).p)));
	//  186  442:aload           12
	//  187  444:ldc2            #497 <String "request_agent">
	//  188  447:aload           11
	//  189  449:getfield        #495 <Field String zzwb.p>
	//  190  452:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  191  455:pop             
		}
		if(((zzwb) (obj)).a >= 6 && ((zzwb) (obj)).q != null)
	//* 192  456:aload           11
	//* 193  458:getfield        #469 <Field int zzwb.a>
	//* 194  461:bipush          6
	//* 195  463:icmplt          488
	//* 196  466:aload           11
	//* 197  468:getfield        #500 <Field String zzwb.q>
	//* 198  471:ifnull          488
			hashmap.put("request_pkg", ((Object) (((zzwb) (obj)).q)));
	//  199  474:aload           12
	//  200  476:ldc2            #502 <String "request_pkg">
	//  201  479:aload           11
	//  202  481:getfield        #500 <Field String zzwb.q>
	//  203  484:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  204  487:pop             
		if(((zzwb) (obj)).a >= 7)
	//* 205  488:aload           11
	//* 206  490:getfield        #469 <Field int zzwb.a>
	//* 207  493:bipush          7
	//* 208  495:icmplt          515
			hashmap.put("is_designed_for_families", ((Object) (Boolean.valueOf(((zzwb) (obj)).r))));
	//  209  498:aload           12
	//  210  500:ldc2            #504 <String "is_designed_for_families">
	//  211  503:aload           11
	//  212  505:getfield        #507 <Field boolean zzwb.r>
	//  213  508:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//  214  511:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  215  514:pop             
		if(((zzwb) (obj)).a >= 8)
	//* 216  515:aload           11
	//* 217  517:getfield        #469 <Field int zzwb.a>
	//* 218  520:bipush          8
	//* 219  522:icmplt          573
		{
			if(((zzwb) (obj)).t != -1)
	//* 220  525:aload           11
	//* 221  527:getfield        #510 <Field int zzwb.t>
	//* 222  530:iconst_m1       
	//* 223  531:icmpeq          551
				hashmap.put("tag_for_under_age_of_consent", ((Object) (Integer.valueOf(((zzwb) (obj)).t))));
	//  224  534:aload           12
	//  225  536:ldc2            #512 <String "tag_for_under_age_of_consent">
	//  226  539:aload           11
	//  227  541:getfield        #510 <Field int zzwb.t>
	//  228  544:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//  229  547:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  230  550:pop             
			if(((zzwb) (obj)).u != null)
	//* 231  551:aload           11
	//* 232  553:getfield        #515 <Field String zzwb.u>
	//* 233  556:ifnull          573
				hashmap.put("max_ad_content_rating", ((Object) (((zzwb) (obj)).u)));
	//  234  559:aload           12
	//  235  561:ldc2            #517 <String "max_ad_content_rating">
	//  236  564:aload           11
	//  237  566:getfield        #515 <Field String zzwb.u>
	//  238  569:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  239  572:pop             
		}
		if(zzasi1.d.g != null) goto _L2; else goto _L1
	//  240  573:aload           13
	//  241  575:getfield        #520 <Field zzwf zzasi.d>
	//  242  578:getfield        #525 <Field zzwf[] zzwf.g>
	//  243  581:ifnonnull       625
_L1:
		hashmap.put("format", ((Object) (zzasi1.d.a)));
	//  244  584:aload           12
	//  245  586:ldc2            #526 <String "format">
	//  246  589:aload           13
	//  247  591:getfield        #520 <Field zzwf zzasi.d>
	//  248  594:getfield        #527 <Field String zzwf.a>
	//  249  597:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  250  600:pop             
		if(zzasi1.d.i)
	//* 251  601:aload           13
	//* 252  603:getfield        #520 <Field zzwf zzasi.d>
	//* 253  606:getfield        #529 <Field boolean zzwf.i>
	//* 254  609:ifeq            731
			hashmap.put("fluid", "height");
	//  255  612:aload           12
	//  256  614:ldc1            #192 <String "fluid">
	//  257  616:ldc1            #190 <String "height">
	//  258  618:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//  259  621:pop             
		  goto _L3
	//* 260  622:goto            731
_L2:
		int i;
		int j;
		int k;
		int l;
		boolean flag;
		boolean flag1;
		Object obj1;
		int i1;
		boolean flag2;
		boolean flag3;
		zzwf azzwf[];
		Object obj4;
		zzwf azzwf1[];
		Object obj5;
		Bundle bundle1;
		try
		{
			azzwf = zzasi1.d.g;
	//  261  625:aload           13
	//  262  627:getfield        #520 <Field zzwf zzasi.d>
	//  263  630:getfield        #525 <Field zzwf[] zzwf.g>
	//  264  633:astore          11
			i1 = azzwf.length;
	//  265  635:aload           11
	//  266  637:arraylength     
	//  267  638:istore          7
		}
	//* 268  640:iconst_0        
	//* 269  641:istore_3        
	//* 270  642:iconst_0        
	//* 271  643:istore          5
	//* 272  645:iconst_0        
	//* 273  646:istore_2        
	//* 274  647:iload_3         
	//* 275  648:iload           7
	//* 276  650:icmpge          731
	//* 277  653:aload           11
	//* 278  655:iload_3         
	//* 279  656:aaload          
	//* 280  657:astore          18
	//* 281  659:iload           5
	//* 282  661:istore          4
	//* 283  663:aload           18
	//* 284  665:getfield        #529 <Field boolean zzwf.i>
	//* 285  668:ifne            697
	//* 286  671:iload           5
	//* 287  673:istore          4
	//* 288  675:iload           5
	//* 289  677:ifne            697
	//* 290  680:aload           12
	//* 291  682:ldc2            #526 <String "format">
	//* 292  685:aload           18
	//* 293  687:getfield        #527 <Field String zzwf.a>
	//* 294  690:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 295  693:pop             
	//* 296  694:iconst_1        
	//* 297  695:istore          4
	//* 298  697:iload_2         
	//* 299  698:istore          6
	//* 300  700:aload           18
	//* 301  702:getfield        #529 <Field boolean zzwf.i>
	//* 302  705:ifeq            4190
	//* 303  708:iload_2         
	//* 304  709:istore          6
	//* 305  711:iload_2         
	//* 306  712:ifne            4190
	//* 307  715:aload           12
	//* 308  717:ldc1            #192 <String "fluid">
	//* 309  719:ldc1            #190 <String "height">
	//* 310  721:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 311  724:pop             
	//* 312  725:iconst_1        
	//* 313  726:istore          6
	//* 314  728:goto            4190
	//* 315  731:aload           13
	//* 316  733:getfield        #520 <Field zzwf zzasi.d>
	//* 317  736:getfield        #531 <Field int zzwf.e>
	//* 318  739:iconst_m1       
	//* 319  740:icmpne          755
	//* 320  743:aload           12
	//* 321  745:ldc2            #533 <String "smart_w">
	//* 322  748:ldc2            #535 <String "full">
	//* 323  751:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 324  754:pop             
	//* 325  755:aload           13
	//* 326  757:getfield        #520 <Field zzwf zzasi.d>
	//* 327  760:getfield        #537 <Field int zzwf.b>
	//* 328  763:bipush          -2
	//* 329  765:icmpne          780
	//* 330  768:aload           12
	//* 331  770:ldc2            #539 <String "smart_h">
	//* 332  773:ldc2            #541 <String "auto">
	//* 333  776:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 334  779:pop             
	//* 335  780:aload           13
	//* 336  782:getfield        #520 <Field zzwf zzasi.d>
	//* 337  785:getfield        #525 <Field zzwf[] zzwf.g>
	//* 338  788:ifnull          1004
	//* 339  791:new             #543 <Class StringBuilder>
	//* 340  794:dup             
	//* 341  795:invokespecial   #544 <Method void StringBuilder()>
	//* 342  798:astore          11
	//* 343  800:aload           13
	//* 344  802:getfield        #520 <Field zzwf zzasi.d>
	//* 345  805:getfield        #525 <Field zzwf[] zzwf.g>
	//* 346  808:astore          18
	//* 347  810:aload           18
	//* 348  812:arraylength     
	//* 349  813:istore          5
	//* 350  815:iconst_0        
	//* 351  816:istore_2        
	//* 352  817:iconst_0        
	//* 353  818:istore_3        
	//* 354  819:iload_2         
	//* 355  820:iload           5
	//* 356  822:icmpge          958
	//* 357  825:aload           18
	//* 358  827:iload_2         
	//* 359  828:aaload          
	//* 360  829:astore          19
	//* 361  831:aload           19
	//* 362  833:getfield        #529 <Field boolean zzwf.i>
	//* 363  836:ifeq            844
	//* 364  839:iconst_1        
	//* 365  840:istore_3        
	//* 366  841:goto            4214
	//* 367  844:aload           11
	//* 368  846:invokevirtual   #545 <Method int StringBuilder.length()>
	//* 369  849:ifeq            861
	//* 370  852:aload           11
	//* 371  854:ldc2            #547 <String "|">
	//* 372  857:invokevirtual   #551 <Method StringBuilder StringBuilder.append(String)>
	//* 373  860:pop             
	//* 374  861:aload           19
	//* 375  863:getfield        #531 <Field int zzwf.e>
	//* 376  866:iconst_m1       
	//* 377  867:icmpne          888
	//* 378  870:aload           19
	//* 379  872:getfield        #553 <Field int zzwf.f>
	//* 380  875:i2f             
	//* 381  876:aload           16
	//* 382  878:getfield        #558 <Field float sw.t>
	//* 383  881:fdiv            
	//* 384  882:f2i             
	//* 385  883:istore          4
	//* 386  885:goto            895
	//* 387  888:aload           19
	//* 388  890:getfield        #531 <Field int zzwf.e>
	//* 389  893:istore          4
	//* 390  895:aload           11
	//* 391  897:iload           4
	//* 392  899:invokevirtual   #561 <Method StringBuilder StringBuilder.append(int)>
	//* 393  902:pop             
	//* 394  903:aload           11
	//* 395  905:ldc2            #563 <String "x">
	//* 396  908:invokevirtual   #551 <Method StringBuilder StringBuilder.append(String)>
	//* 397  911:pop             
	//* 398  912:aload           19
	//* 399  914:getfield        #537 <Field int zzwf.b>
	//* 400  917:bipush          -2
	//* 401  919:icmpne          940
	//* 402  922:aload           19
	//* 403  924:getfield        #565 <Field int zzwf.c>
	//* 404  927:i2f             
	//* 405  928:aload           16
	//* 406  930:getfield        #558 <Field float sw.t>
	//* 407  933:fdiv            
	//* 408  934:f2i             
	//* 409  935:istore          4
	//* 410  937:goto            947
	//* 411  940:aload           19
	//* 412  942:getfield        #537 <Field int zzwf.b>
	//* 413  945:istore          4
	//* 414  947:aload           11
	//* 415  949:iload           4
	//* 416  951:invokevirtual   #561 <Method StringBuilder StringBuilder.append(int)>
	//* 417  954:pop             
	//* 418  955:goto            4214
	//* 419  958:iload_3         
	//* 420  959:ifeq            993
	//* 421  962:aload           11
	//* 422  964:invokevirtual   #545 <Method int StringBuilder.length()>
	//* 423  967:ifeq            4221
	//* 424  970:aload           11
	//* 425  972:iconst_0        
	//* 426  973:ldc2            #547 <String "|">
	//* 427  976:invokevirtual   #569 <Method StringBuilder StringBuilder.insert(int, String)>
	//* 428  979:pop             
	//* 429  980:goto            983
	//* 430  983:aload           11
	//* 431  985:iconst_0        
	//* 432  986:ldc2            #571 <String "320x50">
	//* 433  989:invokevirtual   #569 <Method StringBuilder StringBuilder.insert(int, String)>
	//* 434  992:pop             
	//* 435  993:aload           12
	//* 436  995:ldc2            #573 <String "sz">
	//* 437  998:aload           11
	//* 438 1000:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 439 1003:pop             
	//* 440 1004:aload           13
	//* 441 1006:getfield        #33  <Field int zzasi.m>
	//* 442 1009:ifeq            1250
	//* 443 1012:aload           12
	//* 444 1014:ldc2            #575 <String "native_version">
	//* 445 1017:aload           13
	//* 446 1019:getfield        #33  <Field int zzasi.m>
	//* 447 1022:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 448 1025:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 449 1028:pop             
	//* 450 1029:aload           12
	//* 451 1031:ldc2            #577 <String "native_templates">
	//* 452 1034:aload           13
	//* 453 1036:getfield        #579 <Field List zzasi.n>
	//* 454 1039:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 455 1042:pop             
	//* 456 1043:aload           13
	//* 457 1045:getfield        #583 <Field zzacp zzasi.y>
	//* 458 1048:astore          11
	//* 459 1050:aload           11
	//* 460 1052:ifnonnull       1063
	//* 461 1055:ldc2            #585 <String "any">
	//* 462 1058:astore          11
	//* 463 1060:goto            1096
	//* 464 1063:aload           11
	//* 465 1065:getfield        #588 <Field int zzacp.c>
	//* 466 1068:tableswitch     0 2: default 4224
	//	               0 4246
	//	               1 4239
	//	               2 4232
	//* 467 1096:aload           12
	//* 468 1098:ldc2            #590 <String "native_image_orientation">
	//* 469 1101:aload           11
	//* 470 1103:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 471 1106:pop             
	//* 472 1107:aload           13
	//* 473 1109:getfield        #583 <Field zzacp zzasi.y>
	//* 474 1112:astore          11
	//* 475 1114:aload           11
	//* 476 1116:ifnull          4254
	//* 477 1119:aload           11
	//* 478 1121:getfield        #592 <Field boolean zzacp.d>
	//* 479 1124:ifeq            4254
	//* 480 1127:iconst_1        
	//* 481 1128:istore          8
	//* 482 1130:goto            1133
	//* 483 1133:aload           12
	//* 484 1135:ldc2            #594 <String "native_multiple_images">
	//* 485 1138:iload           8
	//* 486 1140:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//* 487 1143:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 488 1146:pop             
	//* 489 1147:aload           13
	//* 490 1149:getfield        #597 <Field List zzasi.z>
	//* 491 1152:invokeinterface #599 <Method boolean List.isEmpty()>
	//* 492 1157:ifne            1174
	//* 493 1160:aload           12
	//* 494 1162:ldc2            #601 <String "native_custom_templates">
	//* 495 1165:aload           13
	//* 496 1167:getfield        #597 <Field List zzasi.z>
	//* 497 1170:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 498 1173:pop             
	//* 499 1174:aload           13
	//* 500 1176:getfield        #602 <Field int zzasi.a>
	//* 501 1179:bipush          24
	//* 502 1181:icmplt          1201
	//* 503 1184:aload           12
	//* 504 1186:ldc2            #604 <String "max_num_ads">
	//* 505 1189:aload           13
	//* 506 1191:getfield        #607 <Field int zzasi.Y>
	//* 507 1194:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 508 1197:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 509 1200:pop             
	//* 510 1201:aload           13
	//* 511 1203:getfield        #610 <Field String zzasi.W>
	//* 512 1206:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 513 1209:istore          8
	//* 514 1211:iload           8
	//* 515 1213:ifne            1250
	//* 516 1216:aload           12
	//* 517 1218:ldc2            #612 <String "native_advanced_settings">
	//* 518 1221:new             #319 <Class JSONArray>
	//* 519 1224:dup             
	//* 520 1225:aload           13
	//* 521 1227:getfield        #610 <Field String zzasi.W>
	//* 522 1230:invokespecial   #613 <Method void JSONArray(String)>
	//* 523 1233:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 524 1236:pop             
	//* 525 1237:goto            1250
	//* 526 1240:astore          11
	//* 527 1242:ldc2            #615 <String "Problem creating json from native advanced settings">
	//* 528 1245:aload           11
	//* 529 1247:invokestatic    #618 <Method void wx.c(String, Throwable)>
	//* 530 1250:aload           13
	//* 531 1252:getfield        #621 <Field List zzasi.V>
	//* 532 1255:ifnull          1355
	//* 533 1258:aload           13
	//* 534 1260:getfield        #621 <Field List zzasi.V>
	//* 535 1263:invokeinterface #396 <Method int List.size()>
	//* 536 1268:ifle            1355
	//* 537 1271:aload           13
	//* 538 1273:getfield        #621 <Field List zzasi.V>
	//* 539 1276:invokeinterface #335 <Method Iterator List.iterator()>
	//* 540 1281:astore          11
	//* 541 1283:aload           11
	//* 542 1285:invokeinterface #341 <Method boolean Iterator.hasNext()>
	//* 543 1290:ifeq            1355
	//* 544 1293:aload           11
	//* 545 1295:invokeinterface #345 <Method Object Iterator.next()>
	//* 546 1300:checkcast       #448 <Class Integer>
	//* 547 1303:astore          18
	//* 548 1305:aload           18
	//* 549 1307:invokevirtual   #624 <Method int Integer.intValue()>
	//* 550 1310:iconst_2        
	//* 551 1311:icmpne          1330
	//* 552 1314:aload           12
	//* 553 1316:ldc2            #626 <String "iba">
	//* 554 1319:iconst_1        
	//* 555 1320:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//* 556 1323:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 557 1326:pop             
	//* 558 1327:goto            1283
	//* 559 1330:aload           18
	//* 560 1332:invokevirtual   #624 <Method int Integer.intValue()>
	//* 561 1335:iconst_1        
	//* 562 1336:icmpne          1283
	//* 563 1339:aload           12
	//* 564 1341:ldc2            #628 <String "ina">
	//* 565 1344:iconst_1        
	//* 566 1345:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//* 567 1348:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 568 1351:pop             
	//* 569 1352:goto            1283
	//* 570 1355:aload           13
	//* 571 1357:getfield        #520 <Field zzwf zzasi.d>
	//* 572 1360:getfield        #630 <Field boolean zzwf.j>
	//* 573 1363:ifeq            1379
	//* 574 1366:aload           12
	//* 575 1368:ldc2            #632 <String "ene">
	//* 576 1371:iconst_1        
	//* 577 1372:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//* 578 1375:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 579 1378:pop             
	//* 580 1379:aload           13
	//* 581 1381:getfield        #636 <Field zzyv zzasi.O>
	//* 582 1384:ifnull          1420
	//* 583 1387:aload           12
	//* 584 1389:ldc2            #638 <String "is_icon_ad">
	//* 585 1392:iconst_1        
	//* 586 1393:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//* 587 1396:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 588 1399:pop             
	//* 589 1400:aload           12
	//* 590 1402:ldc2            #640 <String "icon_ad_expansion_behavior">
	//* 591 1405:aload           13
	//* 592 1407:getfield        #636 <Field zzyv zzasi.O>
	//* 593 1410:getfield        #643 <Field int zzyv.a>
	//* 594 1413:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 595 1416:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 596 1419:pop             
	//* 597 1420:aload           13
	//* 598 1422:getfield        #647 <Field zzafz zzasi.ae>
	//* 599 1425:ifnull          1546
	//* 600 1428:aload           13
	//* 601 1430:getfield        #647 <Field zzafz zzasi.ae>
	//* 602 1433:astore          11
	//* 603 1435:aload           11
	//* 604 1437:getfield        #650 <Field int zzafz.a>
	//* 605 1440:tableswitch     1 2: default 4260
	//	               1 4271
	//	               2 4263
	//* 606 1464:aload           11
	//* 607 1466:getfield        #650 <Field int zzafz.a>
	//* 608 1469:istore_2        
	//* 609 1470:goto            1473
	//* 610 1473:new             #543 <Class StringBuilder>
	//* 611 1476:dup             
	//* 612 1477:bipush          52
	//* 613 1479:invokespecial   #651 <Method void StringBuilder(int)>
	//* 614 1482:astore          11
	//* 615 1484:aload           11
	//* 616 1486:ldc2            #653 <String "Instream ad video aspect ratio ">
	//* 617 1489:invokevirtual   #551 <Method StringBuilder StringBuilder.append(String)>
	//* 618 1492:pop             
	//* 619 1493:aload           11
	//* 620 1495:iload_2         
	//* 621 1496:invokevirtual   #561 <Method StringBuilder StringBuilder.append(int)>
	//* 622 1499:pop             
	//* 623 1500:aload           11
	//* 624 1502:ldc2            #655 <String " is wrong.">
	//* 625 1505:invokevirtual   #551 <Method StringBuilder StringBuilder.append(String)>
	//* 626 1508:pop             
	//* 627 1509:aload           11
	//* 628 1511:invokevirtual   #656 <Method String StringBuilder.toString()>
	//* 629 1514:invokestatic    #660 <Method void aag.c(String)>
	//* 630 1517:ldc2            #661 <String "l">
	//* 631 1520:astore          11
	//* 632 1522:aload           12
	//* 633 1524:ldc2            #663 <String "ia_var">
	//* 634 1527:aload           11
	//* 635 1529:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 636 1532:pop             
	//* 637 1533:aload           12
	//* 638 1535:ldc2            #665 <String "instr">
	//* 639 1538:iconst_1        
	//* 640 1539:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//* 641 1542:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 642 1545:pop             
	//* 643 1546:aload           12
	//* 644 1548:ldc2            #667 <String "slotname">
	//* 645 1551:aload           13
	//* 646 1553:getfield        #669 <Field String zzasi.e>
	//* 647 1556:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 648 1559:pop             
	//* 649 1560:aload           12
	//* 650 1562:ldc2            #671 <String "pn">
	//* 651 1565:aload           13
	//* 652 1567:getfield        #674 <Field ApplicationInfo zzasi.f>
	//* 653 1570:getfield        #679 <Field String ApplicationInfo.packageName>
	//* 654 1573:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 655 1576:pop             
	//* 656 1577:aload           13
	//* 657 1579:getfield        #682 <Field PackageInfo zzasi.g>
	//* 658 1582:ifnull          1605
	//* 659 1585:aload           12
	//* 660 1587:ldc2            #684 <String "vc">
	//* 661 1590:aload           13
	//* 662 1592:getfield        #682 <Field PackageInfo zzasi.g>
	//* 663 1595:getfield        #689 <Field int PackageInfo.versionCode>
	//* 664 1598:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 665 1601:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 666 1604:pop             
	//* 667 1605:aload           12
	//* 668 1607:ldc2            #691 <String "ms">
	//* 669 1610:aload_1         
	//* 670 1611:getfield        #693 <Field String sl.g>
	//* 671 1614:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 672 1617:pop             
	//* 673 1618:aload           12
	//* 674 1620:ldc2            #695 <String "seq_num">
	//* 675 1623:aload           13
	//* 676 1625:getfield        #696 <Field String zzasi.i>
	//* 677 1628:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 678 1631:pop             
	//* 679 1632:aload           12
	//* 680 1634:ldc2            #698 <String "session_id">
	//* 681 1637:aload           13
	//* 682 1639:getfield        #700 <Field String zzasi.j>
	//* 683 1642:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 684 1645:pop             
	//* 685 1646:aload           12
	//* 686 1648:ldc2            #702 <String "js">
	//* 687 1651:aload           13
	//* 688 1653:getfield        #97  <Field zzbbi zzasi.k>
	//* 689 1656:getfield        #102 <Field String zzbbi.a>
	//* 690 1659:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 691 1662:pop             
	//* 692 1663:aload           13
	//* 693 1665:getfield        #705 <Field Bundle zzasi.M>
	//* 694 1668:astore          19
	//* 695 1670:aload_1         
	//* 696 1671:getfield        #706 <Field Bundle sl.b>
	//* 697 1674:astore          11
	//* 698 1676:aload           12
	//* 699 1678:ldc2            #708 <String "am">
	//* 700 1681:aload           16
	//* 701 1683:getfield        #709 <Field int sw.a>
	//* 702 1686:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 703 1689:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 704 1692:pop             
	//* 705 1693:aload           12
	//* 706 1695:ldc2            #711 <String "cog">
	//* 707 1698:aload           16
	//* 708 1700:getfield        #713 <Field boolean sw.b>
	//* 709 1703:invokestatic    #715 <Method Integer a(boolean)>
	//* 710 1706:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 711 1709:pop             
	//* 712 1710:aload           12
	//* 713 1712:ldc2            #717 <String "coh">
	//* 714 1715:aload           16
	//* 715 1717:getfield        #719 <Field boolean sw.c>
	//* 716 1720:invokestatic    #715 <Method Integer a(boolean)>
	//* 717 1723:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 718 1726:pop             
	//* 719 1727:aload           16
	//* 720 1729:getfield        #721 <Field String sw.d>
	//* 721 1732:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 722 1735:ifne            1752
	//* 723 1738:aload           12
	//* 724 1740:ldc2            #723 <String "carrier">
	//* 725 1743:aload           16
	//* 726 1745:getfield        #721 <Field String sw.d>
	//* 727 1748:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 728 1751:pop             
	//* 729 1752:aload           12
	//* 730 1754:ldc2            #725 <String "gl">
	//* 731 1757:aload           16
	//* 732 1759:getfield        #726 <Field String sw.e>
	//* 733 1762:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 734 1765:pop             
	//* 735 1766:aload           16
	//* 736 1768:getfield        #727 <Field boolean sw.f>
	//* 737 1771:ifeq            1787
	//* 738 1774:aload           12
	//* 739 1776:ldc2            #729 <String "simulator">
	//* 740 1779:iconst_1        
	//* 741 1780:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 742 1783:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 743 1786:pop             
	//* 744 1787:aload           12
	//* 745 1789:ldc2            #731 <String "is_latchsky">
	//* 746 1792:aload           16
	//* 747 1794:getfield        #733 <Field boolean sw.g>
	//* 748 1797:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//* 749 1800:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 750 1803:pop             
	//* 751 1804:aload           16
	//* 752 1806:getfield        #734 <Field boolean sw.h>
	//* 753 1809:ifeq            4279
	//* 754 1812:aload           12
	//* 755 1814:ldc2            #736 <String "is_sidewinder">
	//* 756 1817:iconst_1        
	//* 757 1818:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 758 1821:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 759 1824:pop             
	//* 760 1825:goto            1828
	//* 761 1828:aload           12
	//* 762 1830:ldc2            #738 <String "ma">
	//* 763 1833:aload           16
	//* 764 1835:getfield        #739 <Field boolean sw.i>
	//* 765 1838:invokestatic    #715 <Method Integer a(boolean)>
	//* 766 1841:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 767 1844:pop             
	//* 768 1845:aload           12
	//* 769 1847:ldc2            #741 <String "sp">
	//* 770 1850:aload           16
	//* 771 1852:getfield        #742 <Field boolean sw.j>
	//* 772 1855:invokestatic    #715 <Method Integer a(boolean)>
	//* 773 1858:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 774 1861:pop             
	//* 775 1862:aload           12
	//* 776 1864:ldc2            #744 <String "hl">
	//* 777 1867:aload           16
	//* 778 1869:getfield        #746 <Field String sw.k>
	//* 779 1872:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 780 1875:pop             
	//* 781 1876:aload           16
	//* 782 1878:getfield        #747 <Field String sw.l>
	//* 783 1881:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 784 1884:ifne            1901
	//* 785 1887:aload           12
	//* 786 1889:ldc2            #749 <String "mv">
	//* 787 1892:aload           16
	//* 788 1894:getfield        #747 <Field String sw.l>
	//* 789 1897:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 790 1900:pop             
	//* 791 1901:aload           12
	//* 792 1903:ldc2            #751 <String "muv">
	//* 793 1906:aload           16
	//* 794 1908:getfield        #753 <Field int sw.n>
	//* 795 1911:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 796 1914:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 797 1917:pop             
	//* 798 1918:aload           16
	//* 799 1920:getfield        #755 <Field int sw.o>
	//* 800 1923:bipush          -2
	//* 801 1925:icmpeq          1945
	//* 802 1928:aload           12
	//* 803 1930:ldc2            #757 <String "cnt">
	//* 804 1933:aload           16
	//* 805 1935:getfield        #755 <Field int sw.o>
	//* 806 1938:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 807 1941:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 808 1944:pop             
	//* 809 1945:aload           12
	//* 810 1947:ldc2            #759 <String "gnt">
	//* 811 1950:aload           16
	//* 812 1952:getfield        #761 <Field int sw.p>
	//* 813 1955:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 814 1958:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 815 1961:pop             
	//* 816 1962:aload           12
	//* 817 1964:ldc2            #763 <String "pt">
	//* 818 1967:aload           16
	//* 819 1969:getfield        #765 <Field int sw.q>
	//* 820 1972:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 821 1975:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 822 1978:pop             
	//* 823 1979:aload           12
	//* 824 1981:ldc2            #767 <String "rm">
	//* 825 1984:aload           16
	//* 826 1986:getfield        #769 <Field int sw.r>
	//* 827 1989:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 828 1992:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 829 1995:pop             
	//* 830 1996:aload           12
	//* 831 1998:ldc2            #771 <String "riv">
	//* 832 2001:aload           16
	//* 833 2003:getfield        #774 <Field int sw.s>
	//* 834 2006:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//* 835 2009:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//* 836 2012:pop             
	//* 837 2013:new             #262 <Class Bundle>
	//* 838 2016:dup             
	//* 839 2017:invokespecial   #775 <Method void Bundle()>
	//* 840 2020:astore          18
	//* 841 2022:aload           18
	//* 842 2024:ldc2            #777 <String "build_build">
	//* 843 2027:aload           16
	//* 844 2029:getfield        #780 <Field String sw.A>
	//* 845 2032:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 846 2035:aload           18
	//* 847 2037:ldc2            #786 <String "build_device">
	//* 848 2040:aload           16
	//* 849 2042:getfield        #789 <Field String sw.B>
	//* 850 2045:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 851 2048:new             #262 <Class Bundle>
	//* 852 2051:dup             
	//* 853 2052:invokespecial   #775 <Method void Bundle()>
	//* 854 2055:astore          20
	//* 855 2057:aload           20
	//* 856 2059:ldc2            #791 <String "is_charging">
	//* 857 2062:aload           16
	//* 858 2064:getfield        #793 <Field boolean sw.x>
	//* 859 2067:invokevirtual   #797 <Method void Bundle.putBoolean(String, boolean)>
	//* 860 2070:aload           20
	//* 861 2072:ldc2            #799 <String "battery_level">
	//* 862 2075:aload           16
	//* 863 2077:getfield        #803 <Field double sw.w>
	//* 864 2080:invokevirtual   #807 <Method void Bundle.putDouble(String, double)>
	//* 865 2083:aload           18
	//* 866 2085:ldc2            #809 <String "battery">
	//* 867 2088:aload           20
	//* 868 2090:invokevirtual   #813 <Method void Bundle.putBundle(String, Bundle)>
	//* 869 2093:new             #262 <Class Bundle>
	//* 870 2096:dup             
	//* 871 2097:invokespecial   #775 <Method void Bundle()>
	//* 872 2100:astore          20
	//* 873 2102:aload           20
	//* 874 2104:ldc2            #815 <String "active_network_state">
	//* 875 2107:aload           16
	//* 876 2109:getfield        #817 <Field int sw.z>
	//* 877 2112:invokevirtual   #821 <Method void Bundle.putInt(String, int)>
	//* 878 2115:aload           20
	//* 879 2117:ldc2            #823 <String "active_network_metered">
	//* 880 2120:aload           16
	//* 881 2122:getfield        #825 <Field boolean sw.y>
	//* 882 2125:invokevirtual   #797 <Method void Bundle.putBoolean(String, boolean)>
	//* 883 2128:aload           18
	//* 884 2130:ldc2            #827 <String "network">
	//* 885 2133:aload           20
	//* 886 2135:invokevirtual   #813 <Method void Bundle.putBundle(String, Bundle)>
	//* 887 2138:new             #262 <Class Bundle>
	//* 888 2141:dup             
	//* 889 2142:invokespecial   #775 <Method void Bundle()>
	//* 890 2145:astore          20
	//* 891 2147:aload           20
	//* 892 2149:ldc2            #829 <String "is_browser_custom_tabs_capable">
	//* 893 2152:aload           16
	//* 894 2154:getfield        #832 <Field boolean sw.C>
	//* 895 2157:invokevirtual   #797 <Method void Bundle.putBoolean(String, boolean)>
	//* 896 2160:aload           18
	//* 897 2162:ldc2            #834 <String "browser">
	//* 898 2165:aload           20
	//* 899 2167:invokevirtual   #813 <Method void Bundle.putBundle(String, Bundle)>
	//* 900 2170:aload           19
	//* 901 2172:ifnull          4282
	//* 902 2175:new             #262 <Class Bundle>
	//* 903 2178:dup             
	//* 904 2179:invokespecial   #775 <Method void Bundle()>
	//* 905 2182:astore          20
	//* 906 2184:aload           20
	//* 907 2186:ldc2            #836 <String "runtime_free">
	//* 908 2189:aload           19
	//* 909 2191:ldc2            #838 <String "runtime_free_memory">
	//* 910 2194:ldc2w           #177 <Long -1L>
	//* 911 2197:invokevirtual   #841 <Method long Bundle.getLong(String, long)>
	//* 912 2200:invokestatic    #846 <Method String Long.toString(long)>
	//* 913 2203:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 914 2206:aload           20
	//* 915 2208:ldc2            #848 <String "runtime_max">
	//* 916 2211:aload           19
	//* 917 2213:ldc2            #850 <String "runtime_max_memory">
	//* 918 2216:ldc2w           #177 <Long -1L>
	//* 919 2219:invokevirtual   #841 <Method long Bundle.getLong(String, long)>
	//* 920 2222:invokestatic    #846 <Method String Long.toString(long)>
	//* 921 2225:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 922 2228:aload           20
	//* 923 2230:ldc2            #852 <String "runtime_total">
	//* 924 2233:aload           19
	//* 925 2235:ldc2            #854 <String "runtime_total_memory">
	//* 926 2238:ldc2w           #177 <Long -1L>
	//* 927 2241:invokevirtual   #841 <Method long Bundle.getLong(String, long)>
	//* 928 2244:invokestatic    #846 <Method String Long.toString(long)>
	//* 929 2247:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 930 2250:aload           20
	//* 931 2252:ldc2            #856 <String "web_view_count">
	//* 932 2255:aload           19
	//* 933 2257:ldc2            #856 <String "web_view_count">
	//* 934 2260:iconst_0        
	//* 935 2261:invokevirtual   #860 <Method int Bundle.getInt(String, int)>
	//* 936 2264:invokestatic    #862 <Method String Integer.toString(int)>
	//* 937 2267:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 938 2270:aload           19
	//* 939 2272:ldc2            #864 <String "debug_memory_info">
	//* 940 2275:invokevirtual   #868 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//* 941 2278:checkcast       #870 <Class android.os.Debug$MemoryInfo>
	//* 942 2281:astore          19
	//* 943 2283:aload           19
	//* 944 2285:ifnull          2432
	//* 945 2288:aload           20
	//* 946 2290:ldc2            #872 <String "debug_info_dalvik_private_dirty">
	//* 947 2293:aload           19
	//* 948 2295:getfield        #875 <Field int android.os.Debug$MemoryInfo.dalvikPrivateDirty>
	//* 949 2298:invokestatic    #862 <Method String Integer.toString(int)>
	//* 950 2301:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 951 2304:aload           20
	//* 952 2306:ldc2            #877 <String "debug_info_dalvik_pss">
	//* 953 2309:aload           19
	//* 954 2311:getfield        #880 <Field int android.os.Debug$MemoryInfo.dalvikPss>
	//* 955 2314:invokestatic    #862 <Method String Integer.toString(int)>
	//* 956 2317:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 957 2320:aload           20
	//* 958 2322:ldc2            #882 <String "debug_info_dalvik_shared_dirty">
	//* 959 2325:aload           19
	//* 960 2327:getfield        #885 <Field int android.os.Debug$MemoryInfo.dalvikSharedDirty>
	//* 961 2330:invokestatic    #862 <Method String Integer.toString(int)>
	//* 962 2333:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 963 2336:aload           20
	//* 964 2338:ldc2            #887 <String "debug_info_native_private_dirty">
	//* 965 2341:aload           19
	//* 966 2343:getfield        #890 <Field int android.os.Debug$MemoryInfo.nativePrivateDirty>
	//* 967 2346:invokestatic    #862 <Method String Integer.toString(int)>
	//* 968 2349:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 969 2352:aload           20
	//* 970 2354:ldc2            #892 <String "debug_info_native_pss">
	//* 971 2357:aload           19
	//* 972 2359:getfield        #895 <Field int android.os.Debug$MemoryInfo.nativePss>
	//* 973 2362:invokestatic    #862 <Method String Integer.toString(int)>
	//* 974 2365:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 975 2368:aload           20
	//* 976 2370:ldc2            #897 <String "debug_info_native_shared_dirty">
	//* 977 2373:aload           19
	//* 978 2375:getfield        #900 <Field int android.os.Debug$MemoryInfo.nativeSharedDirty>
	//* 979 2378:invokestatic    #862 <Method String Integer.toString(int)>
	//* 980 2381:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 981 2384:aload           20
	//* 982 2386:ldc2            #902 <String "debug_info_other_private_dirty">
	//* 983 2389:aload           19
	//* 984 2391:getfield        #905 <Field int android.os.Debug$MemoryInfo.otherPrivateDirty>
	//* 985 2394:invokestatic    #862 <Method String Integer.toString(int)>
	//* 986 2397:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 987 2400:aload           20
	//* 988 2402:ldc2            #907 <String "debug_info_other_pss">
	//* 989 2405:aload           19
	//* 990 2407:getfield        #910 <Field int android.os.Debug$MemoryInfo.otherPss>
	//* 991 2410:invokestatic    #862 <Method String Integer.toString(int)>
	//* 992 2413:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 993 2416:aload           20
	//* 994 2418:ldc2            #912 <String "debug_info_other_shared_dirty">
	//* 995 2421:aload           19
	//* 996 2423:getfield        #915 <Field int android.os.Debug$MemoryInfo.otherSharedDirty>
	//* 997 2426:invokestatic    #862 <Method String Integer.toString(int)>
	//* 998 2429:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//* 999 2432:aload           18
	//*1000 2434:ldc2            #917 <String "android_mem_info">
	//*1001 2437:aload           20
	//*1002 2439:invokevirtual   #813 <Method void Bundle.putBundle(String, Bundle)>
	//*1003 2442:goto            2445
	//*1004 2445:iconst_0        
	//*1005 2446:istore          4
	//*1006 2448:new             #262 <Class Bundle>
	//*1007 2451:dup             
	//*1008 2452:invokespecial   #775 <Method void Bundle()>
	//*1009 2455:astore          19
	//*1010 2457:aload           19
	//*1011 2459:ldc2            #919 <String "parental_controls">
	//*1012 2462:aload           11
	//*1013 2464:invokevirtual   #813 <Method void Bundle.putBundle(String, Bundle)>
	//*1014 2467:aload           16
	//*1015 2469:getfield        #921 <Field String sw.m>
	//*1016 2472:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*1017 2475:ifne            2491
	//*1018 2478:aload           19
	//*1019 2480:ldc2            #923 <String "package_version">
	//*1020 2483:aload           16
	//*1021 2485:getfield        #921 <Field String sw.m>
	//*1022 2488:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1023 2491:aload           18
	//*1024 2493:ldc2            #925 <String "play_store">
	//*1025 2496:aload           19
	//*1026 2498:invokevirtual   #813 <Method void Bundle.putBundle(String, Bundle)>
	//*1027 2501:aload           12
	//*1028 2503:ldc2            #927 <String "device">
	//*1029 2506:aload           18
	//*1030 2508:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1031 2511:pop             
	//*1032 2512:new             #262 <Class Bundle>
	//*1033 2515:dup             
	//*1034 2516:invokespecial   #775 <Method void Bundle()>
	//*1035 2519:astore          18
	//*1036 2521:aload           18
	//*1037 2523:ldc2            #929 <String "doritos">
	//*1038 2526:aload_1         
	//*1039 2527:getfield        #930 <Field String sl.e>
	//*1040 2530:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1041 2533:aload           18
	//*1042 2535:ldc2            #932 <String "doritos_v2">
	//*1043 2538:aload_1         
	//*1044 2539:getfield        #934 <Field String sl.f>
	//*1045 2542:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1046 2545:getstatic       #937 <Field e com.google.android.gms.internal.ads.p.aw>
	//*1047 2548:astore          11
	//*1048 2550:invokestatic    #384 <Method m bwk.e()>
	//*1049 2553:aload           11
	//*1050 2555:invokevirtual   #389 <Method Object m.a(e)>
	//*1051 2558:checkcast       #464 <Class Boolean>
	//*1052 2561:invokevirtual   #940 <Method boolean Boolean.booleanValue()>
	//*1053 2564:ifeq            2664
	//*1054 2567:aload_1         
	//*1055 2568:getfield        #943 <Field com.google.android.gms.ads.identifier.AdvertisingIdClient$Info sl.h>
	//*1056 2571:ifnull          4285
	//*1057 2574:aload_1         
	//*1058 2575:getfield        #943 <Field com.google.android.gms.ads.identifier.AdvertisingIdClient$Info sl.h>
	//*1059 2578:invokevirtual   #948 <Method String com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.getId()>
	//*1060 2581:astore          11
	//*1061 2583:aload_1         
	//*1062 2584:getfield        #943 <Field com.google.android.gms.ads.identifier.AdvertisingIdClient$Info sl.h>
	//*1063 2587:invokevirtual   #951 <Method boolean com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	//*1064 2590:istore          8
	//*1065 2592:goto            2595
	//*1066 2595:aload           11
	//*1067 2597:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*1068 2600:ifne            2637
	//*1069 2603:aload           18
	//*1070 2605:ldc2            #953 <String "rdid">
	//*1071 2608:aload           11
	//*1072 2610:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1073 2613:aload           18
	//*1074 2615:ldc2            #955 <String "is_lat">
	//*1075 2618:iload           8
	//*1076 2620:invokevirtual   #797 <Method void Bundle.putBoolean(String, boolean)>
	//*1077 2623:aload           18
	//*1078 2625:ldc2            #957 <String "idtype">
	//*1079 2628:ldc2            #959 <String "adid">
	//*1080 2631:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1081 2634:goto            2664
	//*1082 2637:invokestatic    #962 <Method zv bwk.a()>
	//*1083 2640:pop             
	//*1084 2641:aload           18
	//*1085 2643:ldc2            #964 <String "pdid">
	//*1086 2646:aload_0         
	//*1087 2647:invokestatic    #969 <Method String zv.b(Context)>
	//*1088 2650:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1089 2653:aload           18
	//*1090 2655:ldc2            #971 <String "pdidtype">
	//*1091 2658:ldc2            #973 <String "ssaid">
	//*1092 2661:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1093 2664:aload           12
	//*1094 2666:ldc2            #975 <String "pii">
	//*1095 2669:aload           18
	//*1096 2671:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1097 2674:pop             
	//*1098 2675:aload           12
	//*1099 2677:ldc2            #977 <String "platform">
	//*1100 2680:getstatic       #982 <Field String Build.MANUFACTURER>
	//*1101 2683:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1102 2686:pop             
	//*1103 2687:aload           12
	//*1104 2689:ldc2            #984 <String "submodel">
	//*1105 2692:getstatic       #987 <Field String Build.MODEL>
	//*1106 2695:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1107 2698:pop             
	//*1108 2699:aload           15
	//*1109 2701:ifnull          2714
	//*1110 2704:aload           12
	//*1111 2706:aload           15
	//*1112 2708:invokestatic    #990 <Method void a(HashMap, Location)>
	//*1113 2711:goto            2750
	//*1114 2714:aload           13
	//*1115 2716:getfield        #248 <Field zzwb zzasi.c>
	//*1116 2719:getfield        #469 <Field int zzwb.a>
	//*1117 2722:iconst_2        
	//*1118 2723:icmplt          2750
	//*1119 2726:aload           13
	//*1120 2728:getfield        #248 <Field zzwb zzasi.c>
	//*1121 2731:getfield        #992 <Field Location zzwb.k>
	//*1122 2734:ifnull          2750
	//*1123 2737:aload           12
	//*1124 2739:aload           13
	//*1125 2741:getfield        #248 <Field zzwb zzasi.c>
	//*1126 2744:getfield        #992 <Field Location zzwb.k>
	//*1127 2747:invokestatic    #990 <Method void a(HashMap, Location)>
	//*1128 2750:aload           13
	//*1129 2752:getfield        #602 <Field int zzasi.a>
	//*1130 2755:iconst_2        
	//*1131 2756:icmplt          2773
	//*1132 2759:aload           12
	//*1133 2761:ldc2            #994 <String "quality_signals">
	//*1134 2764:aload           13
	//*1135 2766:getfield        #996 <Field Bundle zzasi.l>
	//*1136 2769:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1137 2772:pop             
	//*1138 2773:aload           13
	//*1139 2775:getfield        #602 <Field int zzasi.a>
	//*1140 2778:iconst_4        
	//*1141 2779:icmplt          2807
	//*1142 2782:aload           13
	//*1143 2784:getfield        #274 <Field boolean zzasi.p>
	//*1144 2787:ifeq            2807
	//*1145 2790:aload           12
	//*1146 2792:ldc2            #998 <String "forceHttps">
	//*1147 2795:aload           13
	//*1148 2797:getfield        #274 <Field boolean zzasi.p>
	//*1149 2800:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//*1150 2803:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1151 2806:pop             
	//*1152 2807:aload           17
	//*1153 2809:ifnull          2823
	//*1154 2812:aload           12
	//*1155 2814:ldc2            #1000 <String "content_info">
	//*1156 2817:aload           17
	//*1157 2819:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1158 2822:pop             
	//*1159 2823:aload           13
	//*1160 2825:getfield        #602 <Field int zzasi.a>
	//*1161 2828:iconst_5        
	//*1162 2829:icmplt          2886
	//*1163 2832:aload           12
	//*1164 2834:ldc2            #1002 <String "u_sd">
	//*1165 2837:aload           13
	//*1166 2839:getfield        #1004 <Field float zzasi.s>
	//*1167 2842:invokestatic    #1009 <Method Float Float.valueOf(float)>
	//*1168 2845:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1169 2848:pop             
	//*1170 2849:aload           12
	//*1171 2851:ldc2            #1011 <String "sh">
	//*1172 2854:aload           13
	//*1173 2856:getfield        #1012 <Field int zzasi.r>
	//*1174 2859:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//*1175 2862:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1176 2865:pop             
	//*1177 2866:aload           12
	//*1178 2868:ldc2            #1014 <String "sw">
	//*1179 2871:aload           13
	//*1180 2873:getfield        #1015 <Field int zzasi.q>
	//*1181 2876:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//*1182 2879:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1183 2882:pop             
	//*1184 2883:goto            2937
	//*1185 2886:aload           12
	//*1186 2888:ldc2            #1002 <String "u_sd">
	//*1187 2891:aload           16
	//*1188 2893:getfield        #558 <Field float sw.t>
	//*1189 2896:invokestatic    #1009 <Method Float Float.valueOf(float)>
	//*1190 2899:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1191 2902:pop             
	//*1192 2903:aload           12
	//*1193 2905:ldc2            #1011 <String "sh">
	//*1194 2908:aload           16
	//*1195 2910:getfield        #1018 <Field int sw.v>
	//*1196 2913:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//*1197 2916:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1198 2919:pop             
	//*1199 2920:aload           12
	//*1200 2922:ldc2            #1014 <String "sw">
	//*1201 2925:aload           16
	//*1202 2927:getfield        #1020 <Field int sw.u>
	//*1203 2930:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//*1204 2933:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1205 2936:pop             
	//*1206 2937:aload           13
	//*1207 2939:getfield        #602 <Field int zzasi.a>
	//*1208 2942:bipush          6
	//*1209 2944:icmplt          3013
	//*1210 2947:aload           13
	//*1211 2949:getfield        #1022 <Field String zzasi.t>
	//*1212 2952:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*1213 2955:istore          8
	//*1214 2957:iload           8
	//*1215 2959:ifne            2996
	//*1216 2962:aload           12
	//*1217 2964:ldc2            #1024 <String "view_hierarchy">
	//*1218 2967:new             #11  <Class JSONObject>
	//*1219 2970:dup             
	//*1220 2971:aload           13
	//*1221 2973:getfield        #1022 <Field String zzasi.t>
	//*1222 2976:invokespecial   #15  <Method void JSONObject(String)>
	//*1223 2979:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1224 2982:pop             
	//*1225 2983:goto            2996
	//*1226 2986:astore          11
	//*1227 2988:ldc2            #1026 <String "Problem serializing view hierarchy to JSON">
	//*1228 2991:aload           11
	//*1229 2993:invokestatic    #618 <Method void wx.c(String, Throwable)>
	//*1230 2996:aload           12
	//*1231 2998:ldc2            #1028 <String "correlation_id">
	//*1232 3001:aload           13
	//*1233 3003:getfield        #1030 <Field long zzasi.u>
	//*1234 3006:invokestatic    #1033 <Method Long Long.valueOf(long)>
	//*1235 3009:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1236 3012:pop             
	//*1237 3013:aload           13
	//*1238 3015:getfield        #602 <Field int zzasi.a>
	//*1239 3018:bipush          7
	//*1240 3020:icmplt          3037
	//*1241 3023:aload           12
	//*1242 3025:ldc2            #1035 <String "request_id">
	//*1243 3028:aload           13
	//*1244 3030:getfield        #1037 <Field String zzasi.v>
	//*1245 3033:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1246 3036:pop             
	//*1247 3037:aload           13
	//*1248 3039:getfield        #602 <Field int zzasi.a>
	//*1249 3042:bipush          12
	//*1250 3044:icmplt          3072
	//*1251 3047:aload           13
	//*1252 3049:getfield        #1038 <Field String zzasi.B>
	//*1253 3052:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*1254 3055:ifne            3072
	//*1255 3058:aload           12
	//*1256 3060:ldc2            #1040 <String "anchor">
	//*1257 3063:aload           13
	//*1258 3065:getfield        #1038 <Field String zzasi.B>
	//*1259 3068:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1260 3071:pop             
	//*1261 3072:aload           13
	//*1262 3074:getfield        #602 <Field int zzasi.a>
	//*1263 3077:bipush          13
	//*1264 3079:icmplt          3099
	//*1265 3082:aload           12
	//*1266 3084:ldc2            #1042 <String "android_app_volume">
	//*1267 3087:aload           13
	//*1268 3089:getfield        #1044 <Field float zzasi.C>
	//*1269 3092:invokestatic    #1009 <Method Float Float.valueOf(float)>
	//*1270 3095:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1271 3098:pop             
	//*1272 3099:aload           13
	//*1273 3101:getfield        #602 <Field int zzasi.a>
	//*1274 3104:bipush          18
	//*1275 3106:icmplt          3126
	//*1276 3109:aload           12
	//*1277 3111:ldc2            #1046 <String "android_app_muted">
	//*1278 3114:aload           13
	//*1279 3116:getfield        #1048 <Field boolean zzasi.I>
	//*1280 3119:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//*1281 3122:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1282 3125:pop             
	//*1283 3126:aload           13
	//*1284 3128:getfield        #602 <Field int zzasi.a>
	//*1285 3131:bipush          14
	//*1286 3133:icmplt          3161
	//*1287 3136:aload           13
	//*1288 3138:getfield        #1050 <Field int zzasi.D>
	//*1289 3141:ifle            3161
	//*1290 3144:aload           12
	//*1291 3146:ldc2            #1052 <String "target_api">
	//*1292 3149:aload           13
	//*1293 3151:getfield        #1050 <Field int zzasi.D>
	//*1294 3154:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//*1295 3157:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1296 3160:pop             
	//*1297 3161:aload           13
	//*1298 3163:getfield        #602 <Field int zzasi.a>
	//*1299 3166:bipush          15
	//*1300 3168:icmplt          3206
	//*1301 3171:aload           13
	//*1302 3173:getfield        #1055 <Field int zzasi.E>
	//*1303 3176:istore_3        
	//*1304 3177:iconst_m1       
	//*1305 3178:istore_2        
	//*1306 3179:iload_3         
	//*1307 3180:iconst_m1       
	//*1308 3181:icmpne          3187
	//*1309 3184:goto            3193
	//*1310 3187:aload           13
	//*1311 3189:getfield        #1055 <Field int zzasi.E>
	//*1312 3192:istore_2        
	//*1313 3193:aload           12
	//*1314 3195:ldc2            #1057 <String "scroll_index">
	//*1315 3198:iload_2         
	//*1316 3199:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//*1317 3202:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1318 3205:pop             
	//*1319 3206:aload           13
	//*1320 3208:getfield        #602 <Field int zzasi.a>
	//*1321 3211:bipush          16
	//*1322 3213:icmplt          3233
	//*1323 3216:aload           12
	//*1324 3218:ldc2            #1059 <String "_activity_context">
	//*1325 3221:aload           13
	//*1326 3223:getfield        #1061 <Field boolean zzasi.F>
	//*1327 3226:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//*1328 3229:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1329 3232:pop             
	//*1330 3233:aload           13
	//*1331 3235:getfield        #602 <Field int zzasi.a>
	//*1332 3238:bipush          18
	//*1333 3240:icmplt          3308
	//*1334 3243:aload           13
	//*1335 3245:getfield        #1063 <Field String zzasi.J>
	//*1336 3248:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*1337 3251:istore          8
	//*1338 3253:iload           8
	//*1339 3255:ifne            3292
	//*1340 3258:aload           12
	//*1341 3260:ldc2            #1065 <String "app_settings">
	//*1342 3263:new             #11  <Class JSONObject>
	//*1343 3266:dup             
	//*1344 3267:aload           13
	//*1345 3269:getfield        #1063 <Field String zzasi.J>
	//*1346 3272:invokespecial   #15  <Method void JSONObject(String)>
	//*1347 3275:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1348 3278:pop             
	//*1349 3279:goto            3292
	//*1350 3282:astore          11
	//*1351 3284:ldc2            #1067 <String "Problem creating json from app settings">
	//*1352 3287:aload           11
	//*1353 3289:invokestatic    #618 <Method void wx.c(String, Throwable)>
	//*1354 3292:aload           12
	//*1355 3294:ldc1            #231 <String "render_in_browser">
	//*1356 3296:aload           13
	//*1357 3298:getfield        #235 <Field boolean zzasi.K>
	//*1358 3301:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//*1359 3304:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1360 3307:pop             
	//*1361 3308:aload           13
	//*1362 3310:getfield        #602 <Field int zzasi.a>
	//*1363 3313:bipush          18
	//*1364 3315:icmplt          3335
	//*1365 3318:aload           12
	//*1366 3320:ldc2            #1069 <String "android_num_video_cache_tasks">
	//*1367 3323:aload           13
	//*1368 3325:getfield        #1072 <Field int zzasi.L>
	//*1369 3328:invokestatic    #451 <Method Integer Integer.valueOf(int)>
	//*1370 3331:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1371 3334:pop             
	//*1372 3335:aload           13
	//*1373 3337:getfield        #97  <Field zzbbi zzasi.k>
	//*1374 3340:astore          11
	//*1375 3342:aload           13
	//*1376 3344:getfield        #1074 <Field boolean zzasi.Z>
	//*1377 3347:istore          8
	//*1378 3349:aload_1         
	//*1379 3350:getfield        #1076 <Field boolean sl.l>
	//*1380 3353:istore          9
	//*1381 3355:aload           13
	//*1382 3357:getfield        #1079 <Field boolean zzasi.ab>
	//*1383 3360:istore          10
	//*1384 3362:new             #262 <Class Bundle>
	//*1385 3365:dup             
	//*1386 3366:invokespecial   #775 <Method void Bundle()>
	//*1387 3369:astore_1        
	//*1388 3370:new             #262 <Class Bundle>
	//*1389 3373:dup             
	//*1390 3374:invokespecial   #775 <Method void Bundle()>
	//*1391 3377:astore          15
	//*1392 3379:aload           15
	//*1393 3381:ldc2            #1081 <String "cl">
	//*1394 3384:ldc2            #1083 <String "230840877">
	//*1395 3387:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1396 3390:aload           15
	//*1397 3392:ldc2            #1085 <String "rapid_rc">
	//*1398 3395:ldc2            #1087 <String "dev">
	//*1399 3398:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1400 3401:aload           15
	//*1401 3403:ldc2            #1089 <String "rapid_rollup">
	//*1402 3406:ldc2            #1091 <String "HEAD">
	//*1403 3409:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1404 3412:aload_1         
	//*1405 3413:ldc2            #1093 <String "build_meta">
	//*1406 3416:aload           15
	//*1407 3418:invokevirtual   #813 <Method void Bundle.putBundle(String, Bundle)>
	//*1408 3421:getstatic       #1096 <Field e p.bv>
	//*1409 3424:astore          15
	//*1410 3426:aload_1         
	//*1411 3427:ldc2            #1098 <String "mf">
	//*1412 3430:invokestatic    #384 <Method m bwk.e()>
	//*1413 3433:aload           15
	//*1414 3435:invokevirtual   #389 <Method Object m.a(e)>
	//*1415 3438:checkcast       #464 <Class Boolean>
	//*1416 3441:invokevirtual   #940 <Method boolean Boolean.booleanValue()>
	//*1417 3444:invokestatic    #1101 <Method String Boolean.toString(boolean)>
	//*1418 3447:invokevirtual   #784 <Method void Bundle.putString(String, String)>
	//*1419 3450:aload_1         
	//*1420 3451:ldc2            #1103 <String "instant_app">
	//*1421 3454:iload           8
	//*1422 3456:invokevirtual   #797 <Method void Bundle.putBoolean(String, boolean)>
	//*1423 3459:aload_1         
	//*1424 3460:ldc2            #1105 <String "lite">
	//*1425 3463:aload           11
	//*1426 3465:getfield        #1107 <Field boolean zzbbi.e>
	//*1427 3468:invokevirtual   #797 <Method void Bundle.putBoolean(String, boolean)>
	//*1428 3471:aload_1         
	//*1429 3472:ldc2            #1109 <String "local_service">
	//*1430 3475:iload           9
	//*1431 3477:invokevirtual   #797 <Method void Bundle.putBoolean(String, boolean)>
	//*1432 3480:aload_1         
	//*1433 3481:ldc2            #1111 <String "is_privileged_process">
	//*1434 3484:iload           10
	//*1435 3486:invokevirtual   #797 <Method void Bundle.putBoolean(String, boolean)>
	//*1436 3489:aload_1         
	//*1437 3490:ldc2            #1113 <String "container_version">
	//*1438 3493:ldc2            #1114 <Int 0xbdfcc1>
	//*1439 3496:invokevirtual   #821 <Method void Bundle.putInt(String, int)>
	//*1440 3499:aload           12
	//*1441 3501:ldc2            #1116 <String "sdk_env">
	//*1442 3504:aload_1         
	//*1443 3505:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1444 3508:pop             
	//*1445 3509:aload           12
	//*1446 3511:ldc2            #1118 <String "cache_state">
	//*1447 3514:aload           14
	//*1448 3516:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1449 3519:pop             
	//*1450 3520:aload           13
	//*1451 3522:getfield        #602 <Field int zzasi.a>
	//*1452 3525:bipush          19
	//*1453 3527:icmplt          3544
	//*1454 3530:aload           12
	//*1455 3532:ldc2            #1120 <String "gct">
	//*1456 3535:aload           13
	//*1457 3537:getfield        #1123 <Field String zzasi.N>
	//*1458 3540:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1459 3543:pop             
	//*1460 3544:aload           13
	//*1461 3546:getfield        #602 <Field int zzasi.a>
	//*1462 3549:bipush          21
	//*1463 3551:icmplt          3574
	//*1464 3554:aload           13
	//*1465 3556:getfield        #1126 <Field boolean zzasi.P>
	//*1466 3559:ifeq            3574
	//*1467 3562:aload           12
	//*1468 3564:ldc2            #1128 <String "de">
	//*1469 3567:ldc2            #1130 <String "1">
	//*1470 3570:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1471 3573:pop             
	//*1472 3574:getstatic       #1133 <Field e p.aC>
	//*1473 3577:astore_1        
	//*1474 3578:invokestatic    #384 <Method m bwk.e()>
	//*1475 3581:aload_1         
	//*1476 3582:invokevirtual   #389 <Method Object m.a(e)>
	//*1477 3585:checkcast       #464 <Class Boolean>
	//*1478 3588:invokevirtual   #940 <Method boolean Boolean.booleanValue()>
	//*1479 3591:ifeq            3678
	//*1480 3594:aload           13
	//*1481 3596:getfield        #520 <Field zzwf zzasi.d>
	//*1482 3599:getfield        #527 <Field String zzwf.a>
	//*1483 3602:astore_1        
	//*1484 3603:aload_1         
	//*1485 3604:ldc2            #1135 <String "interstitial_mb">
	//*1486 3607:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*1487 3610:ifne            4299
	//*1488 3613:aload_1         
	//*1489 3614:ldc2            #1137 <String "reward_mb">
	//*1490 3617:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*1491 3620:ifeq            4294
	//*1492 3623:goto            4299
	//*1493 3626:aload           13
	//*1494 3628:getfield        #1140 <Field Bundle zzasi.Q>
	//*1495 3631:astore_1        
	//*1496 3632:aload_1         
	//*1497 3633:ifnull          4304
	//*1498 3636:iconst_1        
	//*1499 3637:istore_3        
	//*1500 3638:goto            3641
	//*1501 3641:iload_2         
	//*1502 3642:ifeq            3678
	//*1503 3645:iload_3         
	//*1504 3646:ifeq            3678
	//*1505 3649:new             #262 <Class Bundle>
	//*1506 3652:dup             
	//*1507 3653:invokespecial   #775 <Method void Bundle()>
	//*1508 3656:astore          11
	//*1509 3658:aload           11
	//*1510 3660:ldc2            #1142 <String "interstitial_pool">
	//*1511 3663:aload_1         
	//*1512 3664:invokevirtual   #813 <Method void Bundle.putBundle(String, Bundle)>
	//*1513 3667:aload           12
	//*1514 3669:ldc2            #1144 <String "counters">
	//*1515 3672:aload           11
	//*1516 3674:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1517 3677:pop             
	//*1518 3678:aload           13
	//*1519 3680:getfield        #1146 <Field String zzasi.R>
	//*1520 3683:ifnull          3700
	//*1521 3686:aload           12
	//*1522 3688:ldc2            #1148 <String "gmp_app_id">
	//*1523 3691:aload           13
	//*1524 3693:getfield        #1146 <Field String zzasi.R>
	//*1525 3696:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1526 3699:pop             
	//*1527 3700:aload           13
	//*1528 3702:getfield        #1151 <Field String zzasi.S>
	//*1529 3705:ifnull          3762
	//*1530 3708:ldc2            #1153 <String "TIME_OUT">
	//*1531 3711:aload           13
	//*1532 3713:getfield        #1151 <Field String zzasi.S>
	//*1533 3716:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*1534 3719:ifeq            3745
	//*1535 3722:getstatic       #1156 <Field e p.ah>
	//*1536 3725:astore_1        
	//*1537 3726:aload           12
	//*1538 3728:ldc2            #1158 <String "sai_timeout">
	//*1539 3731:invokestatic    #384 <Method m bwk.e()>
	//*1540 3734:aload_1         
	//*1541 3735:invokevirtual   #389 <Method Object m.a(e)>
	//*1542 3738:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1543 3741:pop             
	//*1544 3742:goto            3773
	//*1545 3745:aload           12
	//*1546 3747:ldc2            #1160 <String "fbs_aiid">
	//*1547 3750:aload           13
	//*1548 3752:getfield        #1151 <Field String zzasi.S>
	//*1549 3755:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1550 3758:pop             
	//*1551 3759:goto            3773
	//*1552 3762:aload           12
	//*1553 3764:ldc2            #1160 <String "fbs_aiid">
	//*1554 3767:ldc1            #188 <String "">
	//*1555 3769:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1556 3772:pop             
	//*1557 3773:aload           13
	//*1558 3775:getfield        #1163 <Field String zzasi.T>
	//*1559 3778:ifnull          3795
	//*1560 3781:aload           12
	//*1561 3783:ldc2            #1165 <String "fbs_aeid">
	//*1562 3786:aload           13
	//*1563 3788:getfield        #1163 <Field String zzasi.T>
	//*1564 3791:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1565 3794:pop             
	//*1566 3795:aload           13
	//*1567 3797:getfield        #1168 <Field String zzasi.af>
	//*1568 3800:ifnull          3817
	//*1569 3803:aload           12
	//*1570 3805:ldc2            #1170 <String "apm_id_origin">
	//*1571 3808:aload           13
	//*1572 3810:getfield        #1168 <Field String zzasi.af>
	//*1573 3813:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1574 3816:pop             
	//*1575 3817:aload           13
	//*1576 3819:getfield        #602 <Field int zzasi.a>
	//*1577 3822:bipush          24
	//*1578 3824:icmplt          3844
	//*1579 3827:aload           12
	//*1580 3829:ldc2            #1172 <String "disable_ml">
	//*1581 3832:aload           13
	//*1582 3834:getfield        #1175 <Field boolean zzasi.aa>
	//*1583 3837:invokestatic    #467 <Method Boolean Boolean.valueOf(boolean)>
	//*1584 3840:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1585 3843:pop             
	//*1586 3844:getstatic       #1177 <Field e p.D>
	//*1587 3847:astore_1        
	//*1588 3848:invokestatic    #384 <Method m bwk.e()>
	//*1589 3851:aload_1         
	//*1590 3852:invokevirtual   #389 <Method Object m.a(e)>
	//*1591 3855:checkcast       #67  <Class String>
	//*1592 3858:astore          11
	//*1593 3860:aload           11
	//*1594 3862:ifnull          3963
	//*1595 3865:aload           11
	//*1596 3867:invokevirtual   #1178 <Method boolean String.isEmpty()>
	//*1597 3870:ifne            3963
	//*1598 3873:getstatic       #1183 <Field int android.os.Build$VERSION.SDK_INT>
	//*1599 3876:istore_2        
	//*1600 3877:getstatic       #1185 <Field e p.E>
	//*1601 3880:astore_1        
	//*1602 3881:iload_2         
	//*1603 3882:invokestatic    #384 <Method m bwk.e()>
	//*1604 3885:aload_1         
	//*1605 3886:invokevirtual   #389 <Method Object m.a(e)>
	//*1606 3889:checkcast       #448 <Class Integer>
	//*1607 3892:invokevirtual   #624 <Method int Integer.intValue()>
	//*1608 3895:icmplt          3963
	//*1609 3898:new             #370 <Class HashMap>
	//*1610 3901:dup             
	//*1611 3902:invokespecial   #371 <Method void HashMap()>
	//*1612 3905:astore_1        
	//*1613 3906:aload           11
	//*1614 3908:ldc2            #400 <String ",">
	//*1615 3911:invokevirtual   #1189 <Method String[] String.split(String)>
	//*1616 3914:astore          11
	//*1617 3916:aload           11
	//*1618 3918:arraylength     
	//*1619 3919:istore_3        
	//*1620 3920:iload           4
	//*1621 3922:istore_2        
	//*1622 3923:iload_2         
	//*1623 3924:iload_3         
	//*1624 3925:icmpge          3953
	//*1625 3928:aload           11
	//*1626 3930:iload_2         
	//*1627 3931:aaload          
	//*1628 3932:astore          14
	//*1629 3934:aload_1         
	//*1630 3935:aload           14
	//*1631 3937:aload           14
	//*1632 3939:invokestatic    #1194 <Method List zt.a(String)>
	//*1633 3942:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1634 3945:pop             
	//*1635 3946:iload_2         
	//*1636 3947:iconst_1        
	//*1637 3948:iadd            
	//*1638 3949:istore_2        
	//*1639 3950:goto            3923
	//*1640 3953:aload           12
	//*1641 3955:ldc2            #1196 <String "video_decoders">
	//*1642 3958:aload_1         
	//*1643 3959:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1644 3962:pop             
	//*1645 3963:getstatic       #1199 <Field e p.cC>
	//*1646 3966:astore_1        
	//*1647 3967:invokestatic    #384 <Method m bwk.e()>
	//*1648 3970:aload_1         
	//*1649 3971:invokevirtual   #389 <Method Object m.a(e)>
	//*1650 3974:checkcast       #464 <Class Boolean>
	//*1651 3977:invokevirtual   #940 <Method boolean Boolean.booleanValue()>
	//*1652 3980:ifeq            3999
	//*1653 3983:aload           12
	//*1654 3985:ldc2            #1201 <String "omid_v">
	//*1655 3988:invokestatic    #1204 <Method nk aw.v()>
	//*1656 3991:aload_0         
	//*1657 3992:invokevirtual   #1207 <Method String nk.b(Context)>
	//*1658 3995:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1659 3998:pop             
	//*1660 3999:aload           13
	//*1661 4001:getfield        #1211 <Field ArrayList zzasi.ac>
	//*1662 4004:ifnull          4032
	//*1663 4007:aload           13
	//*1664 4009:getfield        #1211 <Field ArrayList zzasi.ac>
	//*1665 4012:invokevirtual   #1212 <Method boolean ArrayList.isEmpty()>
	//*1666 4015:ifne            4032
	//*1667 4018:aload           12
	//*1668 4020:ldc2            #1214 <String "android_permissions">
	//*1669 4023:aload           13
	//*1670 4025:getfield        #1211 <Field ArrayList zzasi.ac>
	//*1671 4028:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1672 4031:pop             
	//*1673 4032:aload           13
	//*1674 4034:getfield        #1217 <Field String zzasi.ad>
	//*1675 4037:ifnull          4054
	//*1676 4040:aload           12
	//*1677 4042:ldc2            #1219 <String "consent_string">
	//*1678 4045:aload           13
	//*1679 4047:getfield        #1217 <Field String zzasi.ad>
	//*1680 4050:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1681 4053:pop             
	//*1682 4054:aload           13
	//*1683 4056:getfield        #1217 <Field String zzasi.ad>
	//*1684 4059:ifnull          4309
	//*1685 4062:aload           12
	//*1686 4064:ldc2            #1221 <String "iab_consent_info">
	//*1687 4067:aload           13
	//*1688 4069:getfield        #1224 <Field Bundle zzasi.ag>
	//*1689 4072:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//*1690 4075:pop             
	//*1691 4076:goto            4079
	//*1692 4079:iconst_2        
	//*1693 4080:invokestatic    #1227 <Method boolean wx.a(int)>
	//*1694 4083:ifeq            4135
	//*1695 4086:invokestatic    #1230 <Method xg aw.e()>
	//*1696 4089:aload           12
	//*1697 4091:invokevirtual   #1235 <Method JSONObject xg.a(java.util.Map)>
	//*1698 4094:iconst_2        
	//*1699 4095:invokevirtual   #1236 <Method String JSONObject.toString(int)>
	//*1700 4098:invokestatic    #290 <Method String String.valueOf(Object)>
	//*1701 4101:astore_0        
	//*1702 4102:aload_0         
	//*1703 4103:invokevirtual   #293 <Method int String.length()>
	//*1704 4106:ifeq            4120
	//*1705 4109:ldc2            #1238 <String "Ad Request JSON: ">
	//*1706 4112:aload_0         
	//*1707 4113:invokevirtual   #298 <Method String String.concat(String)>
	//*1708 4116:astore_0        
	//*1709 4117:goto            4131
	//*1710 4120:new             #67  <Class String>
	//*1711 4123:dup             
	//*1712 4124:ldc2            #1238 <String "Ad Request JSON: ">
	//*1713 4127:invokespecial   #299 <Method void String(String)>
	//*1714 4130:astore_0        
	//*1715 4131:aload_0         
	//*1716 4132:invokestatic    #1240 <Method void wx.a(String)>
	//*1717 4135:invokestatic    #1230 <Method xg aw.e()>
	//*1718 4138:aload           12
	//*1719 4140:invokevirtual   #1235 <Method JSONObject xg.a(java.util.Map)>
	//*1720 4143:astore_0        
	//*1721 4144:aload_0         
	//*1722 4145:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*1723 4146:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((JSONException) (context)).getMessage())))));
	// 1724 4147:aload_0         
	// 1725 4148:invokevirtual   #286 <Method String JSONException.getMessage()>
	// 1726 4151:invokestatic    #290 <Method String String.valueOf(Object)>
	// 1727 4154:astore_0        
			if(((String) (context)).length() != 0)
	//*1728 4155:aload_0         
	//*1729 4156:invokevirtual   #293 <Method int String.length()>
	//*1730 4159:ifeq            4173
				context = ((Context) ("Problem serializing ad request to JSON: ".concat(((String) (context)))));
	// 1731 4162:ldc2            #1242 <String "Problem serializing ad request to JSON: ">
	// 1732 4165:aload_0         
	// 1733 4166:invokevirtual   #298 <Method String String.concat(String)>
	// 1734 4169:astore_0        
			else
	//*1735 4170:goto            4184
				context = ((Context) (new String("Problem serializing ad request to JSON: ")));
	// 1736 4173:new             #67  <Class String>
	// 1737 4176:dup             
	// 1738 4177:ldc2            #1242 <String "Problem serializing ad request to JSON: ">
	// 1739 4180:invokespecial   #299 <Method void String(String)>
	// 1740 4183:astore_0        
			wx.e(((String) (context)));
	// 1741 4184:aload_0         
	// 1742 4185:invokestatic    #303 <Method void wx.e(String)>
			return null;
	// 1743 4188:aconst_null     
	// 1744 4189:areturn         
		}
		j = 0;
		l = 0;
		i = 0;
_L47:
		if(j >= i1) goto _L3; else goto _L4
_L4:
		obj4 = ((Object) (azzwf[j]));
		k = l;
		if(((zzwf) (obj4)).i)
			break MISSING_BLOCK_LABEL_697;
		k = l;
		if(l != 0)
			break MISSING_BLOCK_LABEL_697;
		hashmap.put("format", ((Object) (((zzwf) (obj4)).a)));
		k = 1;
		flag = ((boolean) (i));
		if(!((zzwf) (obj4)).i) goto _L6; else goto _L5
_L5:
		flag = ((boolean) (i));
		if(i != 0) goto _L6; else goto _L7
_L7:
		hashmap.put("fluid", "height");
		flag = true;
		  goto _L6
_L3:
		if(zzasi1.d.e == -1)
			hashmap.put("smart_w", "full");
		if(zzasi1.d.b == -2)
			hashmap.put("smart_h", "auto");
		if(zzasi1.d.g == null) goto _L9; else goto _L8
_L8:
		obj1 = ((Object) (new StringBuilder()));
		azzwf1 = zzasi1.d.g;
		l = azzwf1.length;
		i = 0;
		j = 0;
_L48:
		if(i >= l) goto _L11; else goto _L10
_L10:
		obj5 = ((Object) (azzwf1[i]));
		if(!((zzwf) (obj5)).i) goto _L13; else goto _L12
_L12:
		j = 1;
		  goto _L14
_L13:
		if(((StringBuilder) (obj1)).length() != 0)
			((StringBuilder) (obj1)).append("|");
		if(((zzwf) (obj5)).e == -1)
		{
			k = (int)((float)((zzwf) (obj5)).f / sw1.t);
			break MISSING_BLOCK_LABEL_895;
		}
		k = ((zzwf) (obj5)).e;
		((StringBuilder) (obj1)).append(k);
		((StringBuilder) (obj1)).append("x");
		if(((zzwf) (obj5)).b == -2)
		{
			k = (int)((float)((zzwf) (obj5)).c / sw1.t);
			break MISSING_BLOCK_LABEL_947;
		}
		k = ((zzwf) (obj5)).b;
		((StringBuilder) (obj1)).append(k);
		  goto _L14
_L11:
		if(j == 0)
			break MISSING_BLOCK_LABEL_993;
		if(((StringBuilder) (obj1)).length() != 0)
			((StringBuilder) (obj1)).insert(0, "|");
		((StringBuilder) (obj1)).insert(0, "320x50");
		hashmap.put("sz", obj1);
_L9:
		if(zzasi1.m == 0) goto _L16; else goto _L15
_L15:
		hashmap.put("native_version", ((Object) (Integer.valueOf(zzasi1.m))));
		hashmap.put("native_templates", ((Object) (zzasi1.n)));
		obj1 = ((Object) (zzasi1.y));
		if(obj1 != null) goto _L18; else goto _L17
_L17:
		obj1 = "any";
		  goto _L19
_L18:
		((zzacp) (obj1)).c;
		JVM INSTR tableswitch 0 2: default 4224
	//	               0 4246
	//	               1 4239
	//	               2 4232;
		   goto _L20 _L21 _L22 _L23
_L19:
		hashmap.put("native_image_orientation", obj1);
		obj1 = ((Object) (zzasi1.y));
		if(obj1 == null) goto _L25; else goto _L24
_L24:
		if(!((zzacp) (obj1)).d) goto _L25; else goto _L26
_L26:
		flag1 = true;
_L49:
		hashmap.put("native_multiple_images", ((Object) (Boolean.valueOf(flag1))));
		if(!zzasi1.z.isEmpty())
			hashmap.put("native_custom_templates", ((Object) (zzasi1.z)));
		if(zzasi1.a >= 24)
			hashmap.put("max_num_ads", ((Object) (Integer.valueOf(zzasi1.Y))));
		flag1 = TextUtils.isEmpty(((CharSequence) (zzasi1.W)));
		if(flag1) goto _L16; else goto _L27
_L27:
		hashmap.put("native_advanced_settings", ((Object) (new JSONArray(zzasi1.W))));
		  goto _L16
		obj1;
		wx.c("Problem creating json from native advanced settings", ((Throwable) (obj1)));
_L16:
		if(zzasi1.V == null || zzasi1.V.size() <= 0) goto _L29; else goto _L28
_L28:
		obj1 = ((Object) (zzasi1.V.iterator()));
_L33:
		if(!((Iterator) (obj1)).hasNext()) goto _L29; else goto _L30
_L30:
		azzwf1 = ((zzwf []) ((Integer)((Iterator) (obj1)).next()));
		if(((Integer) (azzwf1)).intValue() != 2) goto _L32; else goto _L31
_L31:
		hashmap.put("iba", ((Object) (Boolean.valueOf(true))));
		  goto _L33
_L32:
		if(((Integer) (azzwf1)).intValue() != 1) goto _L33; else goto _L34
_L34:
		hashmap.put("ina", ((Object) (Boolean.valueOf(true))));
		  goto _L33
_L29:
		if(zzasi1.d.j)
			hashmap.put("ene", ((Object) (Boolean.valueOf(true))));
		if(zzasi1.O != null)
		{
			hashmap.put("is_icon_ad", ((Object) (Boolean.valueOf(true))));
			hashmap.put("icon_ad_expansion_behavior", ((Object) (Integer.valueOf(zzasi1.O.a))));
		}
		if(zzasi1.ae == null) goto _L36; else goto _L35
_L35:
		obj1 = ((Object) (zzasi1.ae));
		((zzafz) (obj1)).a;
		JVM INSTR tableswitch 1 2: default 4260
	//	               1 4271
	//	               2 4263;
		   goto _L37 _L38 _L39
_L37:
		i = ((zzafz) (obj1)).a;
		obj1 = ((Object) (new StringBuilder(52)));
		((StringBuilder) (obj1)).append("Instream ad video aspect ratio ");
		((StringBuilder) (obj1)).append(i);
		((StringBuilder) (obj1)).append(" is wrong.");
		aag.c(((StringBuilder) (obj1)).toString());
		obj1 = "l";
_L50:
		hashmap.put("ia_var", obj1);
		hashmap.put("instr", ((Object) (Boolean.valueOf(true))));
_L36:
		hashmap.put("slotname", ((Object) (zzasi1.e)));
		hashmap.put("pn", ((Object) (zzasi1.f.packageName)));
		if(zzasi1.g != null)
			hashmap.put("vc", ((Object) (Integer.valueOf(zzasi1.g.versionCode))));
		hashmap.put("ms", ((Object) (sl1.g)));
		hashmap.put("seq_num", ((Object) (zzasi1.i)));
		hashmap.put("session_id", ((Object) (zzasi1.j)));
		hashmap.put("js", ((Object) (zzasi1.k.a)));
		obj5 = ((Object) (zzasi1.M));
		obj1 = ((Object) (sl1.b));
		hashmap.put("am", ((Object) (Integer.valueOf(sw1.a))));
		hashmap.put("cog", ((Object) (a(sw1.b))));
		hashmap.put("coh", ((Object) (a(sw1.c))));
		if(!TextUtils.isEmpty(((CharSequence) (sw1.d))))
			hashmap.put("carrier", ((Object) (sw1.d)));
		hashmap.put("gl", ((Object) (sw1.e)));
		if(sw1.f)
			hashmap.put("simulator", ((Object) (Integer.valueOf(1))));
		hashmap.put("is_latchsky", ((Object) (Boolean.valueOf(sw1.g))));
		if(sw1.h)
			hashmap.put("is_sidewinder", ((Object) (Integer.valueOf(1))));
		hashmap.put("ma", ((Object) (a(sw1.i))));
		hashmap.put("sp", ((Object) (a(sw1.j))));
		hashmap.put("hl", ((Object) (sw1.k)));
		if(!TextUtils.isEmpty(((CharSequence) (sw1.l))))
			hashmap.put("mv", ((Object) (sw1.l)));
		hashmap.put("muv", ((Object) (Integer.valueOf(sw1.n))));
		if(sw1.o != -2)
			hashmap.put("cnt", ((Object) (Integer.valueOf(sw1.o))));
		hashmap.put("gnt", ((Object) (Integer.valueOf(sw1.p))));
		hashmap.put("pt", ((Object) (Integer.valueOf(sw1.q))));
		hashmap.put("rm", ((Object) (Integer.valueOf(sw1.r))));
		hashmap.put("riv", ((Object) (Integer.valueOf(sw1.s))));
		azzwf1 = ((zzwf []) (new Bundle()));
		((Bundle) (azzwf1)).putString("build_build", sw1.A);
		((Bundle) (azzwf1)).putString("build_device", sw1.B);
		bundle1 = new Bundle();
		bundle1.putBoolean("is_charging", sw1.x);
		bundle1.putDouble("battery_level", sw1.w);
		((Bundle) (azzwf1)).putBundle("battery", bundle1);
		bundle1 = new Bundle();
		bundle1.putInt("active_network_state", sw1.z);
		bundle1.putBoolean("active_network_metered", sw1.y);
		((Bundle) (azzwf1)).putBundle("network", bundle1);
		bundle1 = new Bundle();
		bundle1.putBoolean("is_browser_custom_tabs_capable", sw1.C);
		((Bundle) (azzwf1)).putBundle("browser", bundle1);
		if(obj5 == null)
			break MISSING_BLOCK_LABEL_2445;
		bundle1 = new Bundle();
		bundle1.putString("runtime_free", Long.toString(((Bundle) (obj5)).getLong("runtime_free_memory", -1L)));
		bundle1.putString("runtime_max", Long.toString(((Bundle) (obj5)).getLong("runtime_max_memory", -1L)));
		bundle1.putString("runtime_total", Long.toString(((Bundle) (obj5)).getLong("runtime_total_memory", -1L)));
		bundle1.putString("web_view_count", Integer.toString(((Bundle) (obj5)).getInt("web_view_count", 0)));
		obj5 = ((Object) ((android.os.Debug.MemoryInfo)((Bundle) (obj5)).getParcelable("debug_memory_info")));
		if(obj5 == null)
			break MISSING_BLOCK_LABEL_2432;
		bundle1.putString("debug_info_dalvik_private_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj5)).dalvikPrivateDirty));
		bundle1.putString("debug_info_dalvik_pss", Integer.toString(((android.os.Debug.MemoryInfo) (obj5)).dalvikPss));
		bundle1.putString("debug_info_dalvik_shared_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj5)).dalvikSharedDirty));
		bundle1.putString("debug_info_native_private_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj5)).nativePrivateDirty));
		bundle1.putString("debug_info_native_pss", Integer.toString(((android.os.Debug.MemoryInfo) (obj5)).nativePss));
		bundle1.putString("debug_info_native_shared_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj5)).nativeSharedDirty));
		bundle1.putString("debug_info_other_private_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj5)).otherPrivateDirty));
		bundle1.putString("debug_info_other_pss", Integer.toString(((android.os.Debug.MemoryInfo) (obj5)).otherPss));
		bundle1.putString("debug_info_other_shared_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj5)).otherSharedDirty));
		((Bundle) (azzwf1)).putBundle("android_mem_info", bundle1);
		k = 0;
		obj5 = ((Object) (new Bundle()));
		((Bundle) (obj5)).putBundle("parental_controls", ((Bundle) (obj1)));
		if(!TextUtils.isEmpty(((CharSequence) (sw1.m))))
			((Bundle) (obj5)).putString("package_version", sw1.m);
		((Bundle) (azzwf1)).putBundle("play_store", ((Bundle) (obj5)));
		hashmap.put("device", ((Object) (azzwf1)));
		azzwf1 = ((zzwf []) (new Bundle()));
		((Bundle) (azzwf1)).putString("doritos", sl1.e);
		((Bundle) (azzwf1)).putString("doritos_v2", sl1.f);
		obj1 = ((Object) (com.google.android.gms.internal.ads.p.aw));
		if(!((Boolean)bwk.e().a(((e) (obj1)))).booleanValue()) goto _L41; else goto _L40
_L40:
		if(sl1.h == null)
			break MISSING_BLOCK_LABEL_4285;
		obj1 = ((Object) (sl1.h.getId()));
		flag1 = sl1.h.isLimitAdTrackingEnabled();
_L51:
		if(TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L43; else goto _L42
_L42:
		((Bundle) (azzwf1)).putString("rdid", ((String) (obj1)));
		((Bundle) (azzwf1)).putBoolean("is_lat", flag1);
		((Bundle) (azzwf1)).putString("idtype", "adid");
		  goto _L41
_L43:
		bwk.a();
		((Bundle) (azzwf1)).putString("pdid", zv.b(context));
		((Bundle) (azzwf1)).putString("pdidtype", "ssaid");
_L41:
		hashmap.put("pii", ((Object) (azzwf1)));
		hashmap.put("platform", ((Object) (Build.MANUFACTURER)));
		hashmap.put("submodel", ((Object) (Build.MODEL)));
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_2714;
		a(hashmap, ((Location) (obj3)));
		break MISSING_BLOCK_LABEL_2750;
		if(zzasi1.c.a >= 2 && zzasi1.c.k != null)
			a(hashmap, zzasi1.c.k);
		if(zzasi1.a >= 2)
			hashmap.put("quality_signals", ((Object) (zzasi1.l)));
		if(zzasi1.a >= 4 && zzasi1.p)
			hashmap.put("forceHttps", ((Object) (Boolean.valueOf(zzasi1.p))));
		if(bundle == null)
			break MISSING_BLOCK_LABEL_2823;
		hashmap.put("content_info", ((Object) (bundle)));
		if(zzasi1.a >= 5)
		{
			hashmap.put("u_sd", ((Object) (Float.valueOf(zzasi1.s))));
			hashmap.put("sh", ((Object) (Integer.valueOf(zzasi1.r))));
			hashmap.put("sw", ((Object) (Integer.valueOf(zzasi1.q))));
			break MISSING_BLOCK_LABEL_2937;
		}
		hashmap.put("u_sd", ((Object) (Float.valueOf(sw1.t))));
		hashmap.put("sh", ((Object) (Integer.valueOf(sw1.v))));
		hashmap.put("sw", ((Object) (Integer.valueOf(sw1.u))));
		if(zzasi1.a < 6)
			break MISSING_BLOCK_LABEL_3013;
		flag1 = TextUtils.isEmpty(((CharSequence) (zzasi1.t)));
		if(flag1)
			break MISSING_BLOCK_LABEL_2996;
		try
		{
			hashmap.put("view_hierarchy", ((Object) (new JSONObject(zzasi1.t))));
			break MISSING_BLOCK_LABEL_2996;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
		wx.c("Problem serializing view hierarchy to JSON", ((Throwable) (obj1)));
		hashmap.put("correlation_id", ((Object) (Long.valueOf(zzasi1.u))));
		if(zzasi1.a >= 7)
			hashmap.put("request_id", ((Object) (zzasi1.v)));
		if(zzasi1.a >= 12 && !TextUtils.isEmpty(((CharSequence) (zzasi1.B))))
			hashmap.put("anchor", ((Object) (zzasi1.B)));
		if(zzasi1.a >= 13)
			hashmap.put("android_app_volume", ((Object) (Float.valueOf(zzasi1.C))));
		if(zzasi1.a >= 18)
			hashmap.put("android_app_muted", ((Object) (Boolean.valueOf(zzasi1.I))));
		if(zzasi1.a >= 14 && zzasi1.D > 0)
			hashmap.put("target_api", ((Object) (Integer.valueOf(zzasi1.D))));
		if(zzasi1.a < 15)
			break MISSING_BLOCK_LABEL_3206;
		j = zzasi1.E;
		i = -1;
		if(j == -1)
			break MISSING_BLOCK_LABEL_3193;
		i = zzasi1.E;
		hashmap.put("scroll_index", ((Object) (Integer.valueOf(i))));
		if(zzasi1.a >= 16)
			hashmap.put("_activity_context", ((Object) (Boolean.valueOf(zzasi1.F))));
		if(zzasi1.a < 18)
			break MISSING_BLOCK_LABEL_3308;
		flag1 = TextUtils.isEmpty(((CharSequence) (zzasi1.J)));
		if(flag1)
			break MISSING_BLOCK_LABEL_3292;
		try
		{
			hashmap.put("app_settings", ((Object) (new JSONObject(zzasi1.J))));
			break MISSING_BLOCK_LABEL_3292;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
		wx.c("Problem creating json from app settings", ((Throwable) (obj1)));
		hashmap.put("render_in_browser", ((Object) (Boolean.valueOf(zzasi1.K))));
		if(zzasi1.a >= 18)
			hashmap.put("android_num_video_cache_tasks", ((Object) (Integer.valueOf(zzasi1.L))));
		obj1 = ((Object) (zzasi1.k));
		flag1 = zzasi1.Z;
		flag2 = sl1.l;
		flag3 = zzasi1.ab;
		sl1 = ((sl) (new Bundle()));
		obj3 = ((Object) (new Bundle()));
		((Bundle) (obj3)).putString("cl", "230840877");
		((Bundle) (obj3)).putString("rapid_rc", "dev");
		((Bundle) (obj3)).putString("rapid_rollup", "HEAD");
		((Bundle) (sl1)).putBundle("build_meta", ((Bundle) (obj3)));
		obj3 = ((Object) (p.bv));
		((Bundle) (sl1)).putString("mf", Boolean.toString(((Boolean)bwk.e().a(((e) (obj3)))).booleanValue()));
		((Bundle) (sl1)).putBoolean("instant_app", flag1);
		((Bundle) (sl1)).putBoolean("lite", ((zzbbi) (obj1)).e);
		((Bundle) (sl1)).putBoolean("local_service", flag2);
		((Bundle) (sl1)).putBoolean("is_privileged_process", flag3);
		((Bundle) (sl1)).putInt("container_version", 0xbdfcc1);
		hashmap.put("sdk_env", ((Object) (sl1)));
		hashmap.put("cache_state", obj2);
		if(zzasi1.a >= 19)
			hashmap.put("gct", ((Object) (zzasi1.N)));
		if(zzasi1.a >= 21 && zzasi1.P)
			hashmap.put("de", "1");
		sl1 = ((sl) (p.aC));
		if(!((Boolean)bwk.e().a(((e) (sl1)))).booleanValue())
			break MISSING_BLOCK_LABEL_3678;
		sl1 = ((sl) (zzasi1.d.a));
		if(!((String) (sl1)).equals("interstitial_mb") && !((String) (sl1)).equals("reward_mb"))
	//*1745 4190:iload           4
	//*1746 4192:ifeq            4200
	//*1747 4195:iload           6
	//*1748 4197:ifne            731
	//*1749 4200:iload_3         
	//*1750 4201:iconst_1        
	//*1751 4202:iadd            
	//*1752 4203:istore_3        
	//*1753 4204:iload           4
	//*1754 4206:istore          5
	//*1755 4208:iload           6
	//*1756 4210:istore_2        
	//*1757 4211:goto            647
	//*1758 4214:iload_2         
	//*1759 4215:iconst_1        
	//*1760 4216:iadd            
	//*1761 4217:istore_2        
	//*1762 4218:goto            819
	//*1763 4221:goto            983
	//*1764 4224:ldc2            #1244 <String "not_set">
	//*1765 4227:astore          11
	//*1766 4229:goto            1096
	//*1767 4232:ldc1            #85  <String "landscape">
	//*1768 4234:astore          11
	//*1769 4236:goto            1096
	//*1770 4239:ldc1            #65  <String "portrait">
	//*1771 4241:astore          11
	//*1772 4243:goto            1096
	//*1773 4246:ldc2            #585 <String "any">
	//*1774 4249:astore          11
	//*1775 4251:goto            1096
	//*1776 4254:iconst_0        
	//*1777 4255:istore          8
	//*1778 4257:goto            1133
	//*1779 4260:goto            1464
	//*1780 4263:ldc2            #1245 <String "p">
	//*1781 4266:astore          11
	//*1782 4268:goto            1522
	//*1783 4271:ldc2            #661 <String "l">
	//*1784 4274:astore          11
	//*1785 4276:goto            1522
	//*1786 4279:goto            1828
	//*1787 4282:goto            2445
	//*1788 4285:aconst_null     
	//*1789 4286:astore          11
	//*1790 4288:iconst_0        
	//*1791 4289:istore          8
	//*1792 4291:goto            2595
			i = 0;
	// 1793 4294:iconst_0        
	// 1794 4295:istore_2        
		else
	//*1795 4296:goto            3626
			i = 1;
	// 1796 4299:iconst_1        
	// 1797 4300:istore_2        
		sl1 = ((sl) (zzasi1.Q));
		if(sl1 != null)
			j = 1;
		else
	//*1798 4301:goto            3626
			j = 0;
	// 1799 4304:iconst_0        
	// 1800 4305:istore_3        
		if(i == 0 || j == 0)
			break MISSING_BLOCK_LABEL_3678;
		obj1 = ((Object) (new Bundle()));
		((Bundle) (obj1)).putBundle("interstitial_pool", ((Bundle) (sl1)));
		hashmap.put("counters", obj1);
		if(zzasi1.R != null)
			hashmap.put("gmp_app_id", ((Object) (zzasi1.R)));
		if(zzasi1.S == null)
			break MISSING_BLOCK_LABEL_3762;
		if("TIME_OUT".equals(((Object) (zzasi1.S))))
		{
			sl1 = ((sl) (p.ah));
			hashmap.put("sai_timeout", bwk.e().a(((e) (sl1))));
			break MISSING_BLOCK_LABEL_3773;
		}
		hashmap.put("fbs_aiid", ((Object) (zzasi1.S)));
		break MISSING_BLOCK_LABEL_3773;
		hashmap.put("fbs_aiid", "");
		if(zzasi1.T != null)
			hashmap.put("fbs_aeid", ((Object) (zzasi1.T)));
		if(zzasi1.af != null)
			hashmap.put("apm_id_origin", ((Object) (zzasi1.af)));
		if(zzasi1.a >= 24)
			hashmap.put("disable_ml", ((Object) (Boolean.valueOf(zzasi1.aa))));
		sl1 = ((sl) (p.D));
		obj1 = ((Object) ((String)bwk.e().a(((e) (sl1)))));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_3963;
		if(((String) (obj1)).isEmpty())
			break MISSING_BLOCK_LABEL_3963;
		i = android.os.Build.VERSION.SDK_INT;
		sl1 = ((sl) (p.E));
		if(i < ((Integer)bwk.e().a(((e) (sl1)))).intValue())
			break MISSING_BLOCK_LABEL_3963;
		sl1 = ((sl) (new HashMap()));
		obj1 = ((Object) (((String) (obj1)).split(",")));
		j = obj1.length;
		i = k;
_L45:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		obj2 = ((Object) (obj1[i]));
		((HashMap) (sl1)).put(obj2, ((Object) (zt.a(((String) (obj2))))));
		i++;
		if(true) goto _L45; else goto _L44
_L44:
		hashmap.put("video_decoders", ((Object) (sl1)));
		sl1 = ((sl) (p.cC));
		if(((Boolean)bwk.e().a(((e) (sl1)))).booleanValue())
			hashmap.put("omid_v", ((Object) (aw.v().b(context))));
		if(zzasi1.ac != null && !zzasi1.ac.isEmpty())
			hashmap.put("android_permissions", ((Object) (zzasi1.ac)));
		if(zzasi1.ad != null)
			hashmap.put("consent_string", ((Object) (zzasi1.ad)));
		if(zzasi1.ad != null)
			hashmap.put("iab_consent_info", ((Object) (zzasi1.ag)));
		if(!wx.a(2))
			break MISSING_BLOCK_LABEL_4135;
		context = ((Context) (String.valueOf(((Object) (aw.e().a(((java.util.Map) (hashmap))).toString(2))))));
		if(((String) (context)).length() != 0)
		{
			context = ((Context) ("Ad Request JSON: ".concat(((String) (context)))));
			break MISSING_BLOCK_LABEL_4131;
		}
		context = ((Context) (new String("Ad Request JSON: ")));
		wx.a(((String) (context)));
		context = ((Context) (aw.e().a(((java.util.Map) (hashmap)))));
		return ((JSONObject) (context));
_L6:
		if(k != 0 && flag) goto _L3; else goto _L46
_L46:
		j++;
		l = k;
		i = ((int) (flag));
		  goto _L47
_L14:
		i++;
		  goto _L48
_L20:
		obj1 = "not_set";
		  goto _L19
_L23:
		obj1 = "landscape";
		  goto _L19
_L22:
		obj1 = "portrait";
		  goto _L19
_L21:
		obj1 = "any";
		  goto _L19
_L25:
		flag1 = false;
		  goto _L49
_L39:
		obj1 = "p";
		  goto _L50
_L38:
		obj1 = "l";
		  goto _L50
		obj1 = null;
		flag1 = false;
		  goto _L51
	//*1801 4306:goto            3641
	//*1802 4309:goto            4079
	}

	public static JSONObject a(zzasm zzasm1)
	{
		JSONObject jsonobject1 = new JSONObject();
	//    0    0:new             #11  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #1247 <Method void JSONObject()>
	//    3    7:astore          4
		if(zzasm1.a != null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #110 <Field String zzasm.a>
	//*   6   13:ifnull          28
			jsonobject1.put("ad_base_url", ((Object) (zzasm1.a)));
	//    7   16:aload           4
	//    8   18:ldc1            #17  <String "ad_base_url">
	//    9   20:aload_0         
	//   10   21:getfield        #110 <Field String zzasm.a>
	//   11   24:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//   12   27:pop             
		if(zzasm1.l != null)
	//*  13   28:aload_0         
	//*  14   29:getfield        #1251 <Field String zzasm.l>
	//*  15   32:ifnull          47
			jsonobject1.put("ad_size", ((Object) (zzasm1.l)));
	//   16   35:aload           4
	//   17   37:ldc1            #25  <String "ad_size">
	//   18   39:aload_0         
	//   19   40:getfield        #1251 <Field String zzasm.l>
	//   20   43:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//   21   46:pop             
		jsonobject1.put("native", zzasm1.s);
	//   22   47:aload           4
	//   23   49:ldc2            #1253 <String "native">
	//   24   52:aload_0         
	//   25   53:getfield        #1255 <Field boolean zzasm.s>
	//   26   56:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//   27   59:pop             
		if(zzasm1.s)
	//*  28   60:aload_0         
	//*  29   61:getfield        #1255 <Field boolean zzasm.s>
	//*  30   64:ifeq            82
			jsonobject1.put("ad_json", ((Object) (zzasm1.b)));
	//   31   67:aload           4
	//   32   69:ldc1            #35  <String "ad_json">
	//   33   71:aload_0         
	//   34   72:getfield        #112 <Field String zzasm.b>
	//   35   75:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//   36   78:pop             
		else
	//*  37   79:goto            94
			jsonobject1.put("ad_html", ((Object) (zzasm1.b)));
	//   38   82:aload           4
	//   39   84:ldc1            #37  <String "ad_html">
	//   40   86:aload_0         
	//   41   87:getfield        #112 <Field String zzasm.b>
	//   42   90:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//   43   93:pop             
		if(zzasm1.n != null)
	//*  44   94:aload_0         
	//*  45   95:getfield        #1260 <Field String zzasm.n>
	//*  46   98:ifnull          113
			jsonobject1.put("debug_dialog", ((Object) (zzasm1.n)));
	//   47  101:aload           4
	//   48  103:ldc1            #51  <String "debug_dialog">
	//   49  105:aload_0         
	//   50  106:getfield        #1260 <Field String zzasm.n>
	//   51  109:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//   52  112:pop             
		if(zzasm1.L != null)
	//*  53  113:aload_0         
	//*  54  114:getfield        #1262 <Field String zzasm.L>
	//*  55  117:ifnull          132
			jsonobject1.put("debug_signals", ((Object) (zzasm1.L)));
	//   56  120:aload           4
	//   57  122:ldc1            #53  <String "debug_signals">
	//   58  124:aload_0         
	//   59  125:getfield        #1262 <Field String zzasm.L>
	//   60  128:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//   61  131:pop             
		if(zzasm1.f != -1L)
	//*  62  132:aload_0         
	//*  63  133:getfield        #151 <Field long zzasm.f>
	//*  64  136:ldc2w           #177 <Long -1L>
	//*  65  139:lcmp            
	//*  66  140:ifeq            167
		{
			double d = zzasm1.f;
	//   67  143:aload_0         
	//   68  144:getfield        #151 <Field long zzasm.f>
	//   69  147:l2d             
	//   70  148:dstore_1        
			Double.isNaN(d);
	//   71  149:dload_1         
	//   72  150:invokestatic    #1268 <Method boolean Double.isNaN(double)>
	//   73  153:pop             
			jsonobject1.put("interstitial_timeout", d / 1000D);
	//   74  154:aload           4
	//   75  156:ldc1            #55  <String "interstitial_timeout">
	//   76  158:dload_1         
	//   77  159:ldc2w           #60  <Double 1000D>
	//   78  162:ddiv            
	//   79  163:invokevirtual   #1271 <Method JSONObject JSONObject.put(String, double)>
	//   80  166:pop             
		}
		if(zzasm1.k == aw.g().b())
	//*  81  167:aload_0         
	//*  82  168:getfield        #148 <Field int zzasm.k>
	//*  83  171:invokestatic    #77  <Method xo aw.g()>
	//*  84  174:invokevirtual   #83  <Method int xo.b()>
	//*  85  177:icmpne          193
			jsonobject1.put("orientation", "portrait");
	//   86  180:aload           4
	//   87  182:ldc1            #63  <String "orientation">
	//   88  184:ldc1            #65  <String "portrait">
	//   89  186:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//   90  189:pop             
		else
	//*  91  190:goto            216
		if(zzasm1.k == aw.g().a())
	//*  92  193:aload_0         
	//*  93  194:getfield        #148 <Field int zzasm.k>
	//*  94  197:invokestatic    #77  <Method xo aw.g()>
	//*  95  200:invokevirtual   #87  <Method int xo.a()>
	//*  96  203:icmpne          216
			jsonobject1.put("orientation", "landscape");
	//   97  206:aload           4
	//   98  208:ldc1            #63  <String "orientation">
	//   99  210:ldc1            #85  <String "landscape">
	//  100  212:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  101  215:pop             
		if(zzasm1.c != null)
	//* 102  216:aload_0         
	//* 103  217:getfield        #128 <Field List zzasm.c>
	//* 104  220:ifnull          238
			jsonobject1.put("click_urls", ((Object) (a(zzasm1.c))));
	//  105  223:aload           4
	//  106  225:ldc1            #120 <String "click_urls">
	//  107  227:aload_0         
	//  108  228:getfield        #128 <Field List zzasm.c>
	//  109  231:invokestatic    #1273 <Method JSONArray a(List)>
	//  110  234:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  111  237:pop             
		if(zzasm1.e != null)
	//* 112  238:aload_0         
	//* 113  239:getfield        #136 <Field List zzasm.e>
	//* 114  242:ifnull          260
			jsonobject1.put("impression_urls", ((Object) (a(zzasm1.e))));
	//  115  245:aload           4
	//  116  247:ldc1            #133 <String "impression_urls">
	//  117  249:aload_0         
	//  118  250:getfield        #136 <Field List zzasm.e>
	//  119  253:invokestatic    #1273 <Method JSONArray a(List)>
	//  120  256:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  121  259:pop             
		if(zzasm1.R != null)
	//* 122  260:aload_0         
	//* 123  261:getfield        #141 <Field List zzasm.R>
	//* 124  264:ifnull          282
			jsonobject1.put("downloaded_impression_urls", ((Object) (a(zzasm1.R))));
	//  125  267:aload           4
	//  126  269:ldc1            #138 <String "downloaded_impression_urls">
	//  127  271:aload_0         
	//  128  272:getfield        #141 <Field List zzasm.R>
	//  129  275:invokestatic    #1273 <Method JSONArray a(List)>
	//  130  278:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  131  281:pop             
		if(zzasm1.i != null)
	//* 132  282:aload_0         
	//* 133  283:getfield        #146 <Field List zzasm.i>
	//* 134  286:ifnull          304
			jsonobject1.put("manual_impression_urls", ((Object) (a(zzasm1.i))));
	//  135  289:aload           4
	//  136  291:ldc1            #143 <String "manual_impression_urls">
	//  137  293:aload_0         
	//  138  294:getfield        #146 <Field List zzasm.i>
	//  139  297:invokestatic    #1273 <Method JSONArray a(List)>
	//  140  300:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  141  303:pop             
		if(zzasm1.q != null)
	//* 142  304:aload_0         
	//* 143  305:getfield        #1274 <Field String zzasm.q>
	//* 144  308:ifnull          323
			jsonobject1.put("active_view", ((Object) (zzasm1.q)));
	//  145  311:aload           4
	//  146  313:ldc1            #153 <String "active_view">
	//  147  315:aload_0         
	//  148  316:getfield        #1274 <Field String zzasm.q>
	//  149  319:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  150  322:pop             
		jsonobject1.put("ad_is_javascript", zzasm1.o);
	//  151  323:aload           4
	//  152  325:ldc1            #158 <String "ad_is_javascript">
	//  153  327:aload_0         
	//  154  328:getfield        #1276 <Field boolean zzasm.o>
	//  155  331:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  156  334:pop             
		if(zzasm1.p != null)
	//* 157  335:aload_0         
	//* 158  336:getfield        #1277 <Field String zzasm.p>
	//* 159  339:ifnull          354
			jsonobject1.put("ad_passback_url", ((Object) (zzasm1.p)));
	//  160  342:aload           4
	//  161  344:ldc1            #164 <String "ad_passback_url">
	//  162  346:aload_0         
	//  163  347:getfield        #1277 <Field String zzasm.p>
	//  164  350:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  165  353:pop             
		jsonobject1.put("mediation", zzasm1.g);
	//  166  354:aload           4
	//  167  356:ldc1            #166 <String "mediation">
	//  168  358:aload_0         
	//  169  359:getfield        #1278 <Field boolean zzasm.g>
	//  170  362:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  171  365:pop             
		jsonobject1.put("custom_render_allowed", zzasm1.r);
	//  172  366:aload           4
	//  173  368:ldc1            #168 <String "custom_render_allowed">
	//  174  370:aload_0         
	//  175  371:getfield        #1279 <Field boolean zzasm.r>
	//  176  374:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  177  377:pop             
		jsonobject1.put("content_url_opted_out", zzasm1.u);
	//  178  378:aload           4
	//  179  380:ldc1            #170 <String "content_url_opted_out">
	//  180  382:aload_0         
	//  181  383:getfield        #1281 <Field boolean zzasm.u>
	//  182  386:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  183  389:pop             
		jsonobject1.put("content_vertical_opted_out", zzasm1.M);
	//  184  390:aload           4
	//  185  392:ldc1            #172 <String "content_vertical_opted_out">
	//  186  394:aload_0         
	//  187  395:getfield        #1283 <Field boolean zzasm.M>
	//  188  398:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  189  401:pop             
		jsonobject1.put("prefetch", zzasm1.v);
	//  190  402:aload           4
	//  191  404:ldc1            #174 <String "prefetch">
	//  192  406:aload_0         
	//  193  407:getfield        #1285 <Field boolean zzasm.v>
	//  194  410:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  195  413:pop             
		if(zzasm1.j != -1L)
	//* 196  414:aload_0         
	//* 197  415:getfield        #1287 <Field long zzasm.j>
	//* 198  418:ldc2w           #177 <Long -1L>
	//* 199  421:lcmp            
	//* 200  422:ifeq            437
			jsonobject1.put("refresh_interval_milliseconds", zzasm1.j);
	//  201  425:aload           4
	//  202  427:ldc1            #176 <String "refresh_interval_milliseconds">
	//  203  429:aload_0         
	//  204  430:getfield        #1287 <Field long zzasm.j>
	//  205  433:invokevirtual   #1290 <Method JSONObject JSONObject.put(String, long)>
	//  206  436:pop             
		if(zzasm1.h != -1L)
	//* 207  437:aload_0         
	//* 208  438:getfield        #1292 <Field long zzasm.h>
	//* 209  441:ldc2w           #177 <Long -1L>
	//* 210  444:lcmp            
	//* 211  445:ifeq            460
			jsonobject1.put("mediation_config_cache_time_milliseconds", zzasm1.h);
	//  212  448:aload           4
	//  213  450:ldc1            #184 <String "mediation_config_cache_time_milliseconds">
	//  214  452:aload_0         
	//  215  453:getfield        #1292 <Field long zzasm.h>
	//  216  456:invokevirtual   #1290 <Method JSONObject JSONObject.put(String, long)>
	//  217  459:pop             
		if(!TextUtils.isEmpty(((CharSequence) (zzasm1.x))))
	//* 218  460:aload_0         
	//* 219  461:getfield        #1294 <Field String zzasm.x>
	//* 220  464:invokestatic    #93  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 221  467:ifne            482
			jsonobject1.put("gws_query_id", ((Object) (zzasm1.x)));
	//  222  470:aload           4
	//  223  472:ldc1            #186 <String "gws_query_id">
	//  224  474:aload_0         
	//  225  475:getfield        #1294 <Field String zzasm.x>
	//  226  478:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  227  481:pop             
		String s;
		if(zzasm1.y)
	//* 228  482:aload_0         
	//* 229  483:getfield        #1295 <Field boolean zzasm.y>
	//* 230  486:ifeq            495
			s = "height";
	//  231  489:ldc1            #190 <String "height">
	//  232  491:astore_3        
		else
	//* 233  492:goto            498
			s = "";
	//  234  495:ldc1            #188 <String "">
	//  235  497:astore_3        
		jsonobject1.put("fluid", ((Object) (s)));
	//  236  498:aload           4
	//  237  500:ldc1            #192 <String "fluid">
	//  238  502:aload_3         
	//  239  503:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  240  506:pop             
		jsonobject1.put("native_express", zzasm1.z);
	//  241  507:aload           4
	//  242  509:ldc1            #194 <String "native_express">
	//  243  511:aload_0         
	//  244  512:getfield        #1297 <Field boolean zzasm.z>
	//  245  515:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  246  518:pop             
		if(zzasm1.B != null)
	//* 247  519:aload_0         
	//* 248  520:getfield        #1299 <Field List zzasm.B>
	//* 249  523:ifnull          541
			jsonobject1.put("video_start_urls", ((Object) (a(zzasm1.B))));
	//  250  526:aload           4
	//  251  528:ldc1            #196 <String "video_start_urls">
	//  252  530:aload_0         
	//  253  531:getfield        #1299 <Field List zzasm.B>
	//  254  534:invokestatic    #1273 <Method JSONArray a(List)>
	//  255  537:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  256  540:pop             
		if(zzasm1.C != null)
	//* 257  541:aload_0         
	//* 258  542:getfield        #1301 <Field List zzasm.C>
	//* 259  545:ifnull          563
			jsonobject1.put("video_complete_urls", ((Object) (a(zzasm1.C))));
	//  260  548:aload           4
	//  261  550:ldc1            #198 <String "video_complete_urls">
	//  262  552:aload_0         
	//  263  553:getfield        #1301 <Field List zzasm.C>
	//  264  556:invokestatic    #1273 <Method JSONArray a(List)>
	//  265  559:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  266  562:pop             
		if(zzasm1.A != null)
	//* 267  563:aload_0         
	//* 268  564:getfield        #1304 <Field zzawd zzasm.A>
	//* 269  567:ifnull          636
		{
			Object obj = ((Object) (zzasm1.A));
	//  270  570:aload_0         
	//  271  571:getfield        #1304 <Field zzawd zzasm.A>
	//  272  574:astore          5
			JSONObject jsonobject = new JSONObject();
	//  273  576:new             #11  <Class JSONObject>
	//  274  579:dup             
	//  275  580:invokespecial   #1247 <Method void JSONObject()>
	//  276  583:astore_3        
			jsonobject.put("rb_type", ((Object) (((zzawd) (obj)).a)));
	//  277  584:aload_3         
	//  278  585:ldc2            #1306 <String "rb_type">
	//  279  588:aload           5
	//  280  590:getfield        #1307 <Field String zzawd.a>
	//  281  593:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  282  596:pop             
			jsonobject.put("rb_amount", ((zzawd) (obj)).b);
	//  283  597:aload_3         
	//  284  598:ldc2            #1309 <String "rb_amount">
	//  285  601:aload           5
	//  286  603:getfield        #1310 <Field int zzawd.b>
	//  287  606:invokevirtual   #1313 <Method JSONObject JSONObject.put(String, int)>
	//  288  609:pop             
			obj = ((Object) (new JSONArray()));
	//  289  610:new             #319 <Class JSONArray>
	//  290  613:dup             
	//  291  614:invokespecial   #331 <Method void JSONArray()>
	//  292  617:astore          5
			((JSONArray) (obj)).put(((Object) (jsonobject)));
	//  293  619:aload           5
	//  294  621:aload_3         
	//  295  622:invokevirtual   #349 <Method JSONArray JSONArray.put(Object)>
	//  296  625:pop             
			jsonobject1.put("rewards", obj);
	//  297  626:aload           4
	//  298  628:ldc1            #200 <String "rewards">
	//  299  630:aload           5
	//  300  632:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  301  635:pop             
		}
		jsonobject1.put("use_displayed_impression", zzasm1.D);
	//  302  636:aload           4
	//  303  638:ldc1            #207 <String "use_displayed_impression">
	//  304  640:aload_0         
	//  305  641:getfield        #1315 <Field boolean zzasm.D>
	//  306  644:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  307  647:pop             
		jsonobject1.put("auto_protection_configuration", ((Object) (zzasm1.E)));
	//  308  648:aload           4
	//  309  650:ldc1            #209 <String "auto_protection_configuration">
	//  310  652:aload_0         
	//  311  653:getfield        #1318 <Field zzaso zzasm.E>
	//  312  656:invokevirtual   #1250 <Method JSONObject JSONObject.put(String, Object)>
	//  313  659:pop             
		jsonobject1.put("render_in_browser", zzasm1.I);
	//  314  660:aload           4
	//  315  662:ldc1            #231 <String "render_in_browser">
	//  316  664:aload_0         
	//  317  665:getfield        #1319 <Field boolean zzasm.I>
	//  318  668:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  319  671:pop             
		jsonobject1.put("disable_closable_area", zzasm1.S);
	//  320  672:aload           4
	//  321  674:ldc1            #245 <String "disable_closable_area">
	//  322  676:aload_0         
	//  323  677:getfield        #1321 <Field boolean zzasm.S>
	//  324  680:invokevirtual   #1258 <Method JSONObject JSONObject.put(String, boolean)>
	//  325  683:pop             
		return jsonobject1;
	//  326  684:aload           4
	//  327  686:areturn         
	}

	private static void a(HashMap hashmap, Location location)
	{
		HashMap hashmap1 = new HashMap();
	//    0    0:new             #370 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #371 <Method void HashMap()>
	//    3    7:astore          9
		float f = location.getAccuracy();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #1327 <Method float Location.getAccuracy()>
	//    6   13:fstore_2        
		long l = location.getTime();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #1331 <Method long Location.getTime()>
	//    9   18:lstore_3        
		long l1 = (long)(location.getLatitude() * 10000000D);
	//   10   19:aload_1         
	//   11   20:invokevirtual   #1335 <Method double Location.getLatitude()>
	//   12   23:ldc2w           #1336 <Double 10000000D>
	//   13   26:dmul            
	//   14   27:d2l             
	//   15   28:lstore          5
		long l2 = (long)(location.getLongitude() * 10000000D);
	//   16   30:aload_1         
	//   17   31:invokevirtual   #1340 <Method double Location.getLongitude()>
	//   18   34:ldc2w           #1336 <Double 10000000D>
	//   19   37:dmul            
	//   20   38:d2l             
	//   21   39:lstore          7
		hashmap1.put("radius", ((Object) (Float.valueOf(f * 1000F))));
	//   22   41:aload           9
	//   23   43:ldc2            #1342 <String "radius">
	//   24   46:fload_2         
	//   25   47:ldc2            #1343 <Float 1000F>
	//   26   50:fmul            
	//   27   51:invokestatic    #1009 <Method Float Float.valueOf(float)>
	//   28   54:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   29   57:pop             
		hashmap1.put("lat", ((Object) (Long.valueOf(l1))));
	//   30   58:aload           9
	//   31   60:ldc2            #1345 <String "lat">
	//   32   63:lload           5
	//   33   65:invokestatic    #1033 <Method Long Long.valueOf(long)>
	//   34   68:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   35   71:pop             
		hashmap1.put("long", ((Object) (Long.valueOf(l2))));
	//   36   72:aload           9
	//   37   74:ldc2            #1347 <String "long">
	//   38   77:lload           7
	//   39   79:invokestatic    #1033 <Method Long Long.valueOf(long)>
	//   40   82:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   41   85:pop             
		hashmap1.put("time", ((Object) (Long.valueOf(l * 1000L))));
	//   42   86:aload           9
	//   43   88:ldc2            #1349 <String "time">
	//   44   91:lload_3         
	//   45   92:ldc2w           #1350 <Long 1000L>
	//   46   95:lmul            
	//   47   96:invokestatic    #1033 <Method Long Long.valueOf(long)>
	//   48   99:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   49  102:pop             
		hashmap.put("uule", ((Object) (hashmap1)));
	//   50  103:aload_0         
	//   51  104:ldc2            #1353 <String "uule">
	//   52  107:aload           9
	//   53  109:invokevirtual   #392 <Method Object HashMap.put(Object, Object)>
	//   54  112:pop             
	//   55  113:return          
	}
}
