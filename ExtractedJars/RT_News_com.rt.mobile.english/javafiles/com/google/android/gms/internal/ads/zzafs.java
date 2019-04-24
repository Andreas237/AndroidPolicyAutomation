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
import com.google.android.gms.ads.internal.zzbv;
import java.text.SimpleDateFormat;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaef, zzakq, zzang, zzafn, 
//			zzaej, zzaig, zzael, zzaiq, 
//			zzakb, zzafl, zznk, zzkb, 
//			zzni, zzajw, zzjj, zzjn, 
//			zzaga, zzpl, zzlu, zzagk, 
//			zzamu, zzams, zzaan, zzakk

public final class zzafs
{

	public static zzaej zza(Context context, zzaef zzaef1, String s)
	{
		int i;
		int j;
		boolean flag;
		boolean flag1;
		long l;
		long l1;
		String s1;
		Object obj;
		Object obj1;
		Object obj2;
		Object obj3;
		JSONObject jsonobject;
		String s2;
		String s3;
		String s4;
		String s5;
		Object obj4;
		try
		{
			jsonobject = new JSONObject(s);
	//    0    0:new             #32  <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #35  <Method void JSONObject(String)>
	//    4    8:astore          32
			obj = ((Object) (jsonobject.optString("ad_base_url", ((String) (null)))));
	//    5   10:aload           32
	//    6   12:ldc1            #37  <String "ad_base_url">
	//    7   14:aconst_null     
	//    8   15:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//    9   18:astore          28
			obj1 = ((Object) (jsonobject.optString("ad_url", ((String) (null)))));
	//   10   20:aload           32
	//   11   22:ldc1            #43  <String "ad_url">
	//   12   24:aconst_null     
	//   13   25:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//   14   28:astore          29
			s2 = jsonobject.optString("ad_size", ((String) (null)));
	//   15   30:aload           32
	//   16   32:ldc1            #45  <String "ad_size">
	//   17   34:aconst_null     
	//   18   35:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//   19   38:astore          33
			s3 = jsonobject.optString("ad_slot_size", s2);
	//   20   40:aload           32
	//   21   42:ldc1            #47  <String "ad_slot_size">
	//   22   44:aload           33
	//   23   46:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//   24   49:astore          34
		}
	//*  25   51:aload_1         
	//*  26   52:ifnull          971
	//*  27   55:aload_1         
	//*  28   56:getfield        #53  <Field int zzaef.zzcdb>
	//*  29   59:ifeq            971
	//*  30   62:iconst_1        
	//*  31   63:istore          5
	//*  32   65:goto            68
	//*  33   68:aload           32
	//*  34   70:ldc1            #55  <String "ad_json">
	//*  35   72:aconst_null     
	//*  36   73:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//*  37   76:astore          27
	//*  38   78:aload           27
	//*  39   80:astore_2        
	//*  40   81:aload           27
	//*  41   83:ifnonnull       95
	//*  42   86:aload           32
	//*  43   88:ldc1            #57  <String "ad_html">
	//*  44   90:aconst_null     
	//*  45   91:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//*  46   94:astore_2        
	//*  47   95:aload_2         
	//*  48   96:astore          27
	//*  49   98:aload_2         
	//*  50   99:ifnonnull       112
	//*  51  102:aload           32
	//*  52  104:ldc1            #59  <String "body">
	//*  53  106:aconst_null     
	//*  54  107:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//*  55  110:astore          27
	//*  56  112:aload           27
	//*  57  114:astore_2        
	//*  58  115:aload           27
	//*  59  117:ifnonnull       139
	//*  60  120:aload           27
	//*  61  122:astore_2        
	//*  62  123:aload           32
	//*  63  125:ldc1            #61  <String "ads">
	//*  64  127:invokevirtual   #65  <Method boolean JSONObject.has(String)>
	//*  65  130:ifeq            139
	//*  66  133:aload           32
	//*  67  135:invokevirtual   #69  <Method String JSONObject.toString()>
	//*  68  138:astore_2        
	//*  69  139:aload           32
	//*  70  141:ldc1            #71  <String "debug_dialog">
	//*  71  143:aconst_null     
	//*  72  144:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//*  73  147:astore          35
	//*  74  149:aload           32
	//*  75  151:ldc1            #73  <String "debug_signals">
	//*  76  153:aconst_null     
	//*  77  154:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//*  78  157:astore          36
	//*  79  159:aload           32
	//*  80  161:ldc1            #75  <String "interstitial_timeout">
	//*  81  163:invokevirtual   #65  <Method boolean JSONObject.has(String)>
	//*  82  166:ifeq            977
	//*  83  169:aload           32
	//*  84  171:ldc1            #75  <String "interstitial_timeout">
	//*  85  173:invokevirtual   #79  <Method double JSONObject.getDouble(String)>
	//*  86  176:ldc2w           #80  <Double 1000D>
	//*  87  179:dmul            
	//*  88  180:d2l             
	//*  89  181:lstore          19
	//*  90  183:goto            186
	//*  91  186:aload           32
	//*  92  188:ldc1            #83  <String "orientation">
	//*  93  190:aconst_null     
	//*  94  191:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//*  95  194:astore          27
	//*  96  196:ldc1            #85  <String "portrait">
	//*  97  198:aload           27
	//*  98  200:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  99  203:ifeq            216
	//* 100  206:invokestatic    #97  <Method zzakq zzbv.zzem()>
	//* 101  209:invokevirtual   #103 <Method int zzakq.zzrm()>
	//* 102  212:istore_3        
	//* 103  213:goto            985
	//* 104  216:ldc1            #105 <String "landscape">
	//* 105  218:aload           27
	//* 106  220:invokevirtual   #91  <Method boolean String.equals(Object)>
	//* 107  223:ifeq            988
	//* 108  226:invokestatic    #97  <Method zzakq zzbv.zzem()>
	//* 109  229:invokevirtual   #108 <Method int zzakq.zzrl()>
	//* 110  232:istore_3        
	//* 111  233:goto            985
	//* 112  236:aload_2         
	//* 113  237:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 114  240:ifeq            993
	//* 115  243:aload           29
	//* 116  245:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 117  248:ifne            993
	//* 118  251:aload_1         
	//* 119  252:aload_0         
	//* 120  253:aload_1         
	//* 121  254:getfield        #118 <Field zzang zzaef.zzacr>
	//* 122  257:getfield        #124 <Field String zzang.zzcw>
	//* 123  260:aload           29
	//* 124  262:aconst_null     
	//* 125  263:aconst_null     
	//* 126  264:aconst_null     
	//* 127  265:aconst_null     
	//* 128  266:aconst_null     
	//* 129  267:invokestatic    #129 <Method zzaej zzafn.zza(zzaef, Context, String, String, String, String, zzafz, zznx, zzafm)>
	//* 130  270:astore          30
	//* 131  272:aload           30
	//* 132  274:getfield        #134 <Field String zzaej.zzbyq>
	//* 133  277:astore_2        
	//* 134  278:aload           30
	//* 135  280:getfield        #137 <Field String zzaej.zzceo>
	//* 136  283:astore          27
	//* 137  285:aload           30
	//* 138  287:getfield        #141 <Field long zzaej.zzceu>
	//* 139  290:lstore          21
	//* 140  292:goto            295
	//* 141  295:aload           27
	//* 142  297:ifnonnull       309
	//* 143  300:new             #131 <Class zzaej>
	//* 144  303:dup             
	//* 145  304:iconst_0        
	//* 146  305:invokespecial   #144 <Method void zzaej(int)>
	//* 147  308:areturn         
	//* 148  309:aload           32
	//* 149  311:ldc1            #146 <String "click_urls">
	//* 150  313:invokevirtual   #150 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 151  316:astore          29
	//* 152  318:aload           30
	//* 153  320:ifnonnull       328
	//* 154  323:aconst_null     
	//* 155  324:astore_0        
	//* 156  325:goto            334
	//* 157  328:aload           30
	//* 158  330:getfield        #154 <Field List zzaej.zzbsn>
	//* 159  333:astore_0        
	//* 160  334:aload_0         
	//* 161  335:astore          28
	//* 162  337:aload           29
	//* 163  339:ifnull          350
	//* 164  342:aload           29
	//* 165  344:aload_0         
	//* 166  345:invokestatic    #157 <Method List zza(JSONArray, List)>
	//* 167  348:astore          28
	//* 168  350:aload           32
	//* 169  352:ldc1            #159 <String "impression_urls">
	//* 170  354:invokevirtual   #150 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 171  357:astore          31
	//* 172  359:aload           30
	//* 173  361:ifnonnull       369
	//* 174  364:aconst_null     
	//* 175  365:astore_0        
	//* 176  366:goto            375
	//* 177  369:aload           30
	//* 178  371:getfield        #162 <Field List zzaej.zzbso>
	//* 179  374:astore_0        
	//* 180  375:aload_0         
	//* 181  376:astore          29
	//* 182  378:aload           31
	//* 183  380:ifnull          391
	//* 184  383:aload           31
	//* 185  385:aload_0         
	//* 186  386:invokestatic    #157 <Method List zza(JSONArray, List)>
	//* 187  389:astore          29
	//* 188  391:aload           32
	//* 189  393:ldc1            #164 <String "downloaded_impression_urls">
	//* 190  395:invokevirtual   #150 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 191  398:astore          31
	//* 192  400:aload           30
	//* 193  402:ifnonnull       410
	//* 194  405:aconst_null     
	//* 195  406:astore_0        
	//* 196  407:goto            416
	//* 197  410:aload           30
	//* 198  412:getfield        #167 <Field List zzaej.zzbsp>
	//* 199  415:astore_0        
	//* 200  416:aload           31
	//* 201  418:ifnull          1012
	//* 202  421:aload           31
	//* 203  423:aload_0         
	//* 204  424:invokestatic    #157 <Method List zza(JSONArray, List)>
	//* 205  427:astore          31
	//* 206  429:goto            432
	//* 207  432:aload           32
	//* 208  434:ldc1            #169 <String "manual_impression_urls">
	//* 209  436:invokevirtual   #150 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 210  439:astore          37
	//* 211  441:aload           30
	//* 212  443:ifnonnull       451
	//* 213  446:aconst_null     
	//* 214  447:astore_0        
	//* 215  448:goto            457
	//* 216  451:aload           30
	//* 217  453:getfield        #172 <Field List zzaej.zzces>
	//* 218  456:astore_0        
	//* 219  457:aload           37
	//* 220  459:ifnull          1018
	//* 221  462:aload           37
	//* 222  464:aload_0         
	//* 223  465:invokestatic    #157 <Method List zza(JSONArray, List)>
	//* 224  468:astore_0        
	//* 225  469:goto            472
	//* 226  472:iload_3         
	//* 227  473:istore          4
	//* 228  475:aload           30
	//* 229  477:ifnull          1021
	//* 230  480:aload           30
	//* 231  482:getfield        #174 <Field int zzaej.orientation>
	//* 232  485:iconst_m1       
	//* 233  486:icmpeq          495
	//* 234  489:aload           30
	//* 235  491:getfield        #174 <Field int zzaej.orientation>
	//* 236  494:istore_3        
	//* 237  495:iload_3         
	//* 238  496:istore          4
	//* 239  498:aload           30
	//* 240  500:getfield        #177 <Field long zzaej.zzcep>
	//* 241  503:lconst_0        
	//* 242  504:lcmp            
	//* 243  505:ifle            1021
	//* 244  508:aload           30
	//* 245  510:getfield        #177 <Field long zzaej.zzcep>
	//* 246  513:lstore          19
	//* 247  515:goto            518
	//* 248  518:aload           32
	//* 249  520:ldc1            #179 <String "active_view">
	//* 250  522:invokevirtual   #182 <Method String JSONObject.optString(String)>
	//* 251  525:astore          37
	//* 252  527:aload           32
	//* 253  529:ldc1            #184 <String "ad_is_javascript">
	//* 254  531:iconst_0        
	//* 255  532:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 256  535:istore          6
	//* 257  537:iload           6
	//* 258  539:ifeq            1027
	//* 259  542:aload           32
	//* 260  544:ldc1            #190 <String "ad_passback_url">
	//* 261  546:aconst_null     
	//* 262  547:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//* 263  550:astore          30
	//* 264  552:goto            555
	//* 265  555:aload           32
	//* 266  557:ldc1            #192 <String "mediation">
	//* 267  559:iconst_0        
	//* 268  560:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 269  563:istore          7
	//* 270  565:aload           32
	//* 271  567:ldc1            #194 <String "custom_render_allowed">
	//* 272  569:iconst_0        
	//* 273  570:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 274  573:istore          8
	//* 275  575:aload           32
	//* 276  577:ldc1            #196 <String "content_url_opted_out">
	//* 277  579:iconst_1        
	//* 278  580:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 279  583:istore          9
	//* 280  585:aload           32
	//* 281  587:ldc1            #198 <String "content_vertical_opted_out">
	//* 282  589:iconst_1        
	//* 283  590:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 284  593:istore          10
	//* 285  595:aload           32
	//* 286  597:ldc1            #200 <String "prefetch">
	//* 287  599:iconst_0        
	//* 288  600:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 289  603:istore          11
	//* 290  605:aload           32
	//* 291  607:ldc1            #202 <String "refresh_interval_milliseconds">
	//* 292  609:ldc2w           #203 <Long -1L>
	//* 293  612:invokevirtual   #208 <Method long JSONObject.optLong(String, long)>
	//* 294  615:lstore          23
	//* 295  617:aload           32
	//* 296  619:ldc1            #210 <String "mediation_config_cache_time_milliseconds">
	//* 297  621:ldc2w           #203 <Long -1L>
	//* 298  624:invokevirtual   #208 <Method long JSONObject.optLong(String, long)>
	//* 299  627:lstore          25
	//* 300  629:aload           32
	//* 301  631:ldc1            #212 <String "gws_query_id">
	//* 302  633:ldc1            #214 <String "">
	//* 303  635:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//* 304  638:astore          38
	//* 305  640:ldc1            #216 <String "height">
	//* 306  642:aload           32
	//* 307  644:ldc1            #218 <String "fluid">
	//* 308  646:ldc1            #214 <String "">
	//* 309  648:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//* 310  651:invokevirtual   #91  <Method boolean String.equals(Object)>
	//* 311  654:istore          12
	//* 312  656:aload           32
	//* 313  658:ldc1            #220 <String "native_express">
	//* 314  660:iconst_0        
	//* 315  661:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 316  664:istore          13
	//* 317  666:aload           32
	//* 318  668:ldc1            #222 <String "video_start_urls">
	//* 319  670:invokevirtual   #150 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 320  673:aconst_null     
	//* 321  674:invokestatic    #157 <Method List zza(JSONArray, List)>
	//* 322  677:astore          39
	//* 323  679:aload           32
	//* 324  681:ldc1            #224 <String "video_complete_urls">
	//* 325  683:invokevirtual   #150 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 326  686:aconst_null     
	//* 327  687:invokestatic    #157 <Method List zza(JSONArray, List)>
	//* 328  690:astore          40
	//* 329  692:aload           32
	//* 330  694:ldc1            #226 <String "rewards">
	//* 331  696:invokevirtual   #150 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 332  699:invokestatic    #231 <Method zzaig zzaig.zza(JSONArray)>
	//* 333  702:astore          41
	//* 334  704:aload           32
	//* 335  706:ldc1            #233 <String "use_displayed_impression">
	//* 336  708:iconst_0        
	//* 337  709:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 338  712:istore          14
	//* 339  714:aload           32
	//* 340  716:ldc1            #235 <String "auto_protection_configuration">
	//* 341  718:invokevirtual   #239 <Method JSONObject JSONObject.optJSONObject(String)>
	//* 342  721:invokestatic    #245 <Method zzael zzael.zzl(JSONObject)>
	//* 343  724:astore          42
	//* 344  726:aload           32
	//* 345  728:ldc1            #247 <String "set_cookie">
	//* 346  730:ldc1            #214 <String "">
	//* 347  732:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//* 348  735:astore          43
	//* 349  737:aload           32
	//* 350  739:ldc1            #249 <String "remote_ping_urls">
	//* 351  741:invokevirtual   #150 <Method JSONArray JSONObject.optJSONArray(String)>
	//* 352  744:aconst_null     
	//* 353  745:invokestatic    #157 <Method List zza(JSONArray, List)>
	//* 354  748:astore          44
	//* 355  750:aload           32
	//* 356  752:ldc1            #251 <String "safe_browsing">
	//* 357  754:invokevirtual   #239 <Method JSONObject JSONObject.optJSONObject(String)>
	//* 358  757:invokestatic    #257 <Method zzaiq zzaiq.zzo(JSONObject)>
	//* 359  760:astore          45
	//* 360  762:aload           32
	//* 361  764:ldc2            #259 <String "render_in_browser">
	//* 362  767:aload_1         
	//* 363  768:getfield        #263 <Field boolean zzaef.zzbss>
	//* 364  771:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 365  774:istore          15
	//* 366  776:aload           32
	//* 367  778:ldc2            #265 <String "custom_close_blocked">
	//* 368  781:invokevirtual   #267 <Method boolean JSONObject.optBoolean(String)>
	//* 369  784:istore          16
	//* 370  786:aload           32
	//* 371  788:ldc2            #269 <String "enable_omid">
	//* 372  791:iconst_0        
	//* 373  792:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 374  795:istore          17
	//* 375  797:aload           32
	//* 376  799:ldc2            #271 <String "omid_settings">
	//* 377  802:aconst_null     
	//* 378  803:invokevirtual   #41  <Method String JSONObject.optString(String, String)>
	//* 379  806:astore          46
	//* 380  808:aload           32
	//* 381  810:ldc2            #273 <String "disable_closable_area">
	//* 382  813:iconst_0        
	//* 383  814:invokevirtual   #188 <Method boolean JSONObject.optBoolean(String, boolean)>
	//* 384  817:istore          18
	//* 385  819:new             #131 <Class zzaej>
	//* 386  822:dup             
	//* 387  823:aload_1         
	//* 388  824:aload_2         
	//* 389  825:aload           27
	//* 390  827:aload           28
	//* 391  829:aload           29
	//* 392  831:lload           19
	//* 393  833:iload           7
	//* 394  835:lload           25
	//* 395  837:aload_0         
	//* 396  838:lload           23
	//* 397  840:iload_3         
	//* 398  841:aload           33
	//* 399  843:lload           21
	//* 400  845:aload           35
	//* 401  847:iload           6
	//* 402  849:aload           30
	//* 403  851:aload           37
	//* 404  853:iload           8
	//* 405  855:iload           5
	//* 406  857:aload_1         
	//* 407  858:getfield        #276 <Field boolean zzaef.zzcdd>
	//* 408  861:iload           9
	//* 409  863:iload           11
	//* 410  865:aload           38
	//* 411  867:iload           12
	//* 412  869:iload           13
	//* 413  871:aload           41
	//* 414  873:aload           39
	//* 415  875:aload           40
	//* 416  877:iload           14
	//* 417  879:aload           42
	//* 418  881:aload_1         
	//* 419  882:getfield        #279 <Field boolean zzaef.zzcdr>
	//* 420  885:aload           43
	//* 421  887:aload           44
	//* 422  889:iload           15
	//* 423  891:aload           34
	//* 424  893:aload           45
	//* 425  895:aload           36
	//* 426  897:iload           10
	//* 427  899:aload_1         
	//* 428  900:getfield        #282 <Field boolean zzaef.zzced>
	//* 429  903:iload           16
	//* 430  905:iconst_0        
	//* 431  906:iload           17
	//* 432  908:aload           31
	//* 433  910:iload           18
	//* 434  912:aload           46
	//* 435  914:invokespecial   #285 <Method void zzaej(zzaef, String, String, List, List, long, boolean, long, List, long, int, String, long, String, boolean, String, String, boolean, boolean, boolean, boolean, boolean, String, boolean, boolean, zzaig, List, List, boolean, zzael, boolean, String, List, boolean, String, zzaiq, String, boolean, boolean, boolean, int, boolean, List, boolean, String)>
	//* 436  917:astore_0        
	//* 437  918:aload_0         
	//* 438  919:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 439  920:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((JSONException) (context)).getMessage())))));
	//  440  921:aload_0         
	//  441  922:invokevirtual   #288 <Method String JSONException.getMessage()>
	//  442  925:invokestatic    #292 <Method String String.valueOf(Object)>
	//  443  928:astore_0        
			if(((String) (context)).length() != 0)
	//* 444  929:aload_0         
	//* 445  930:invokevirtual   #295 <Method int String.length()>
	//* 446  933:ifeq            947
				context = ((Context) ("Could not parse the inline ad response: ".concat(((String) (context)))));
	//  447  936:ldc2            #297 <String "Could not parse the inline ad response: ">
	//  448  939:aload_0         
	//  449  940:invokevirtual   #300 <Method String String.concat(String)>
	//  450  943:astore_0        
			else
	//* 451  944:goto            958
				context = ((Context) (new String("Could not parse the inline ad response: ")));
	//  452  947:new             #87  <Class String>
	//  453  950:dup             
	//  454  951:ldc2            #297 <String "Could not parse the inline ad response: ">
	//  455  954:invokespecial   #301 <Method void String(String)>
	//  456  957:astore_0        
			zzakb.zzdk(((String) (context)));
	//  457  958:aload_0         
	//  458  959:invokestatic    #306 <Method void zzakb.zzdk(String)>
			return new zzaej(0);
	//  459  962:new             #131 <Class zzaej>
	//  460  965:dup             
	//  461  966:iconst_0        
	//  462  967:invokespecial   #144 <Method void zzaej(int)>
	//  463  970:areturn         
		}
		if(zzaef1 == null) goto _L2; else goto _L1
_L1:
		if(zzaef1.zzcdb == 0) goto _L2; else goto _L3
_L3:
		flag = true;
_L18:
		s1 = jsonobject.optString("ad_json", ((String) (null)));
		s = s1;
		if(s1 != null)
			break MISSING_BLOCK_LABEL_95;
		s = jsonobject.optString("ad_html", ((String) (null)));
		s1 = s;
		if(s != null)
			break MISSING_BLOCK_LABEL_112;
		s1 = jsonobject.optString("body", ((String) (null)));
		s = s1;
		if(s1 != null)
			break MISSING_BLOCK_LABEL_139;
		s = s1;
		if(jsonobject.has("ads"))
			s = jsonobject.toString();
		s4 = jsonobject.optString("debug_dialog", ((String) (null)));
		s5 = jsonobject.optString("debug_signals", ((String) (null)));
		if(!jsonobject.has("interstitial_timeout")) goto _L5; else goto _L4
_L4:
		l = (long)(jsonobject.getDouble("interstitial_timeout") * 1000D);
_L19:
		s1 = jsonobject.optString("orientation", ((String) (null)));
		if(!"portrait".equals(((Object) (s1)))) goto _L7; else goto _L6
_L6:
		i = zzbv.zzem().zzrm();
		  goto _L8
_L7:
		if(!"landscape".equals(((Object) (s1)))) goto _L10; else goto _L9
_L9:
		i = zzbv.zzem().zzrl();
_L8:
		if(!TextUtils.isEmpty(((CharSequence) (s))) || TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L12; else goto _L11
_L11:
		obj2 = ((Object) (zzafn.zza(zzaef1, context, zzaef1.zzacr.zzcw, ((String) (obj1)), ((String) (null)), ((String) (null)), ((zzafz) (null)), ((zznx) (null)), ((zzafm) (null)))));
		s = ((zzaej) (obj2)).zzbyq;
		s1 = ((zzaej) (obj2)).zzceo;
		l1 = ((zzaej) (obj2)).zzceu;
_L20:
		if(s1 != null)
			break MISSING_BLOCK_LABEL_309;
		return new zzaej(0);
		obj1 = ((Object) (jsonobject.optJSONArray("click_urls")));
		if(obj2 == null)
		{
			context = null;
			break MISSING_BLOCK_LABEL_334;
		}
		context = ((Context) (((zzaej) (obj2)).zzbsn));
		obj = ((Object) (context));
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_350;
		obj = ((Object) (zza(((JSONArray) (obj1)), ((List) (context)))));
		obj3 = ((Object) (jsonobject.optJSONArray("impression_urls")));
		if(obj2 == null)
		{
			context = null;
			break MISSING_BLOCK_LABEL_375;
		}
		context = ((Context) (((zzaej) (obj2)).zzbso));
		obj1 = ((Object) (context));
		if(obj3 == null)
			break MISSING_BLOCK_LABEL_391;
		obj1 = ((Object) (zza(((JSONArray) (obj3)), ((List) (context)))));
		obj3 = ((Object) (jsonobject.optJSONArray("downloaded_impression_urls")));
		if(obj2 == null)
		{
			context = null;
			break MISSING_BLOCK_LABEL_416;
		}
		context = ((Context) (((zzaej) (obj2)).zzbsp));
		if(obj3 == null) goto _L14; else goto _L13
_L13:
		obj3 = ((Object) (zza(((JSONArray) (obj3)), ((List) (context)))));
_L21:
		obj4 = ((Object) (jsonobject.optJSONArray("manual_impression_urls")));
		if(obj2 == null)
		{
			context = null;
			break MISSING_BLOCK_LABEL_457;
		}
		context = ((Context) (((zzaej) (obj2)).zzces));
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_472;
		context = ((Context) (zza(((JSONArray) (obj4)), ((List) (context)))));
		j = i;
		if(obj2 == null) goto _L16; else goto _L15
_L15:
		if(((zzaej) (obj2)).orientation != -1)
			i = ((zzaej) (obj2)).orientation;
		j = i;
		if(((zzaej) (obj2)).zzcep <= 0L) goto _L16; else goto _L17
_L17:
		l = ((zzaej) (obj2)).zzcep;
_L22:
		obj4 = ((Object) (jsonobject.optString("active_view")));
		flag1 = jsonobject.optBoolean("ad_is_javascript", false);
		if(!flag1)
			break MISSING_BLOCK_LABEL_1027;
		obj2 = ((Object) (jsonobject.optString("ad_passback_url", ((String) (null)))));
_L23:
		boolean flag2 = jsonobject.optBoolean("mediation", false);
		boolean flag3 = jsonobject.optBoolean("custom_render_allowed", false);
		boolean flag4 = jsonobject.optBoolean("content_url_opted_out", true);
		boolean flag5 = jsonobject.optBoolean("content_vertical_opted_out", true);
		boolean flag6 = jsonobject.optBoolean("prefetch", false);
		long l2 = jsonobject.optLong("refresh_interval_milliseconds", -1L);
		long l3 = jsonobject.optLong("mediation_config_cache_time_milliseconds", -1L);
		String s6 = jsonobject.optString("gws_query_id", "");
		boolean flag7 = "height".equals(((Object) (jsonobject.optString("fluid", ""))));
		boolean flag8 = jsonobject.optBoolean("native_express", false);
		List list = zza(jsonobject.optJSONArray("video_start_urls"), ((List) (null)));
		List list1 = zza(jsonobject.optJSONArray("video_complete_urls"), ((List) (null)));
		zzaig zzaig1 = zzaig.zza(jsonobject.optJSONArray("rewards"));
		boolean flag9 = jsonobject.optBoolean("use_displayed_impression", false);
		zzael zzael1 = zzael.zzl(jsonobject.optJSONObject("auto_protection_configuration"));
		String s7 = jsonobject.optString("set_cookie", "");
		List list2 = zza(jsonobject.optJSONArray("remote_ping_urls"), ((List) (null)));
		zzaiq zzaiq1 = zzaiq.zzo(jsonobject.optJSONObject("safe_browsing"));
		boolean flag10 = jsonobject.optBoolean("render_in_browser", zzaef1.zzbss);
		boolean flag11 = jsonobject.optBoolean("custom_close_blocked");
		boolean flag12 = jsonobject.optBoolean("enable_omid", false);
		String s8 = jsonobject.optString("omid_settings", ((String) (null)));
		boolean flag13 = jsonobject.optBoolean("disable_closable_area", false);
		context = ((Context) (new zzaej(zzaef1, s, s1, ((List) (obj)), ((List) (obj1)), l, flag2, l3, ((List) (context)), l2, i, s2, l1, s4, flag1, ((String) (obj2)), ((String) (obj4)), flag3, flag, zzaef1.zzcdd, flag4, flag6, s6, flag7, flag8, zzaig1, list, list1, flag9, zzael1, zzaef1.zzcdr, s7, list2, flag10, s3, zzaiq1, s5, flag5, zzaef1.zzced, flag11, 0, flag12, ((List) (obj3)), flag13, s8)));
		return ((zzaej) (context));
_L2:
		flag = false;
	//  464  971:iconst_0        
	//  465  972:istore          5
		  goto _L18
	//* 466  974:goto            68
_L5:
		l = -1L;
	//  467  977:ldc2w           #203 <Long -1L>
	//  468  980:lstore          19
		  goto _L19
	//* 469  982:goto            186
	//* 470  985:goto            236
_L10:
		i = -1;
	//  471  988:iconst_m1       
	//  472  989:istore_3        
		  goto _L8
	//* 473  990:goto            236
_L12:
		context = ((Context) (obj));
	//  474  993:aload           28
	//  475  995:astore_0        
		s1 = s;
	//  476  996:aload_2         
	//  477  997:astore          27
		obj2 = null;
	//  478  999:aconst_null     
	//  479 1000:astore          30
		l1 = -1L;
	//  480 1002:ldc2w           #203 <Long -1L>
	//  481 1005:lstore          21
		s = ((String) (context));
	//  482 1007:aload_0         
	//  483 1008:astore_2        
		  goto _L20
	//* 484 1009:goto            295
_L14:
		obj3 = ((Object) (context));
	//  485 1012:aload_0         
	//  486 1013:astore          31
		  goto _L21
	//* 487 1015:goto            432
	//* 488 1018:goto            472
_L16:
		i = j;
	//  489 1021:iload           4
	//  490 1023:istore_3        
		  goto _L22
	//* 491 1024:goto            518
		obj2 = null;
	//  492 1027:aconst_null     
	//  493 1028:astore          30
		  goto _L23
	//* 494 1030:goto            555
	}

	private static List zza(JSONArray jsonarray, List list)
		throws JSONException
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
	//    8   12:new             #309 <Class ArrayList>
	//    9   15:dup             
	//   10   16:invokespecial   #311 <Method void ArrayList()>
	//   11   19:astore_3        
		for(int i = 0; i < jsonarray.length(); i++)
	//*  12   20:iconst_0        
	//*  13   21:istore_2        
	//*  14   22:iload_2         
	//*  15   23:aload_0         
	//*  16   24:invokevirtual   #314 <Method int JSONArray.length()>
	//*  17   27:icmpge          49
			((List) (obj)).add(((Object) (jsonarray.getString(i))));
	//   18   30:aload_3         
	//   19   31:aload_0         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #318 <Method String JSONArray.getString(int)>
	//   22   36:invokeinterface #323 <Method boolean List.add(Object)>
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

	public static JSONObject zza(Context context, zzafl zzafl1)
	{
		Object obj2;
		Object obj4;
		Location location;
		zzaga zzaga1;
		JSONObject jsonobject;
		obj4 = ((Object) (zzafl1.zzcgs));
	//    0    0:aload_1         
	//    1    1:getfield        #335 <Field zzaef zzafl.zzcgs>
	//    2    4:astore          14
		location = zzafl1.zzaqe;
	//    3    6:aload_1         
	//    4    7:getfield        #339 <Field Location zzafl.zzaqe>
	//    5   10:astore          15
		zzaga1 = zzafl1.zzcgt;
	//    6   12:aload_1         
	//    7   13:getfield        #343 <Field zzaga zzafl.zzcgt>
	//    8   16:astore          16
		obj2 = ((Object) (zzafl1.zzcdc));
	//    9   18:aload_1         
	//   10   19:getfield        #347 <Field Bundle zzafl.zzcdc>
	//   11   22:astore          13
		jsonobject = zzafl1.zzcgu;
	//   12   24:aload_1         
	//   13   25:getfield        #351 <Field JSONObject zzafl.zzcgu>
	//   14   28:astore          18
		Object obj;
		HashMap hashmap;
		Object obj5;
		hashmap = new HashMap();
	//   15   30:new             #353 <Class HashMap>
	//   16   33:dup             
	//   17   34:invokespecial   #354 <Method void HashMap()>
	//   18   37:astore          17
		obj = ((Object) (zznk.zzbbk));
	//   19   39:getstatic       #360 <Field zzna zznk.zzbbk>
	//   20   42:astore          11
		hashmap.put("extra_caps", zzkb.zzik().zzd(((zzna) (obj))));
	//   21   44:aload           17
	//   22   46:ldc2            #362 <String "extra_caps">
	//   23   49:invokestatic    #368 <Method zzni zzkb.zzik()>
	//   24   52:aload           11
	//   25   54:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	//   26   57:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   27   60:pop             
		if(zzafl1.zzcdj.size() > 0)
	//*  28   61:aload_1         
	//*  29   62:getfield        #381 <Field List zzafl.zzcdj>
	//*  30   65:invokeinterface #384 <Method int List.size()>
	//*  31   70:ifle            92
			hashmap.put("eid", ((Object) (TextUtils.join(",", ((Iterable) (zzafl1.zzcdj))))));
	//   32   73:aload           17
	//   33   75:ldc2            #386 <String "eid">
	//   34   78:ldc2            #388 <String ",">
	//   35   81:aload_1         
	//   36   82:getfield        #381 <Field List zzafl.zzcdj>
	//   37   85:invokestatic    #392 <Method String TextUtils.join(CharSequence, Iterable)>
	//   38   88:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   39   91:pop             
		if(((zzaef) (obj4)).zzccu != null)
	//*  40   92:aload           14
	//*  41   94:getfield        #395 <Field Bundle zzaef.zzccu>
	//*  42   97:ifnull          114
			hashmap.put("ad_pos", ((Object) (((zzaef) (obj4)).zzccu)));
	//   43  100:aload           17
	//   44  102:ldc2            #397 <String "ad_pos">
	//   45  105:aload           14
	//   46  107:getfield        #395 <Field Bundle zzaef.zzccu>
	//   47  110:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   48  113:pop             
		obj5 = ((Object) (((zzaef) (obj4)).zzccv));
	//   49  114:aload           14
	//   50  116:getfield        #401 <Field zzjj zzaef.zzccv>
	//   51  119:astore          19
		obj = ((Object) (zzajw.zzqn()));
	//   52  121:invokestatic    #406 <Method String zzajw.zzqn()>
	//   53  124:astore          11
		if(obj == null)
			break MISSING_BLOCK_LABEL_142;
	//   54  126:aload           11
	//   55  128:ifnull          142
		hashmap.put("abf", obj);
	//   56  131:aload           17
	//   57  133:ldc2            #408 <String "abf">
	//   58  136:aload           11
	//   59  138:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   60  141:pop             
		if(((zzjj) (obj5)).zzapw != -1L)
	//*  61  142:aload           19
	//*  62  144:getfield        #413 <Field long zzjj.zzapw>
	//*  63  147:ldc2w           #203 <Long -1L>
	//*  64  150:lcmp            
	//*  65  151:ifeq            181
			hashmap.put("cust_age", ((Object) (zzcho.format(new Date(((zzjj) (obj5)).zzapw)))));
	//   66  154:aload           17
	//   67  156:ldc2            #415 <String "cust_age">
	//   68  159:getstatic       #25  <Field SimpleDateFormat zzcho>
	//   69  162:new             #417 <Class Date>
	//   70  165:dup             
	//   71  166:aload           19
	//   72  168:getfield        #413 <Field long zzjj.zzapw>
	//   73  171:invokespecial   #420 <Method void Date(long)>
	//   74  174:invokevirtual   #424 <Method String SimpleDateFormat.format(Date)>
	//   75  177:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   76  180:pop             
		if(((zzjj) (obj5)).extras != null)
	//*  77  181:aload           19
	//*  78  183:getfield        #427 <Field Bundle zzjj.extras>
	//*  79  186:ifnull          203
			hashmap.put("extras", ((Object) (((zzjj) (obj5)).extras)));
	//   80  189:aload           17
	//   81  191:ldc2            #428 <String "extras">
	//   82  194:aload           19
	//   83  196:getfield        #427 <Field Bundle zzjj.extras>
	//   84  199:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   85  202:pop             
		if(((zzjj) (obj5)).zzapx != -1)
	//*  86  203:aload           19
	//*  87  205:getfield        #431 <Field int zzjj.zzapx>
	//*  88  208:iconst_m1       
	//*  89  209:icmpeq          229
			hashmap.put("cust_gender", ((Object) (Integer.valueOf(((zzjj) (obj5)).zzapx))));
	//   90  212:aload           17
	//   91  214:ldc2            #433 <String "cust_gender">
	//   92  217:aload           19
	//   93  219:getfield        #431 <Field int zzjj.zzapx>
	//   94  222:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//   95  225:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   96  228:pop             
		if(((zzjj) (obj5)).zzapy != null)
	//*  97  229:aload           19
	//*  98  231:getfield        #441 <Field List zzjj.zzapy>
	//*  99  234:ifnull          251
			hashmap.put("kw", ((Object) (((zzjj) (obj5)).zzapy)));
	//  100  237:aload           17
	//  101  239:ldc2            #443 <String "kw">
	//  102  242:aload           19
	//  103  244:getfield        #441 <Field List zzjj.zzapy>
	//  104  247:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  105  250:pop             
		if(((zzjj) (obj5)).zzaqa != -1)
	//* 106  251:aload           19
	//* 107  253:getfield        #446 <Field int zzjj.zzaqa>
	//* 108  256:iconst_m1       
	//* 109  257:icmpeq          277
			hashmap.put("tag_for_child_directed_treatment", ((Object) (Integer.valueOf(((zzjj) (obj5)).zzaqa))));
	//  110  260:aload           17
	//  111  262:ldc2            #448 <String "tag_for_child_directed_treatment">
	//  112  265:aload           19
	//  113  267:getfield        #446 <Field int zzjj.zzaqa>
	//  114  270:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  115  273:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  116  276:pop             
		if(!((zzjj) (obj5)).zzapz) goto _L2; else goto _L1
	//  117  277:aload           19
	//  118  279:getfield        #451 <Field boolean zzjj.zzapz>
	//  119  282:ifeq            331
_L1:
		obj = ((Object) (zznk.zzbfp));
	//  120  285:getstatic       #454 <Field zzna zznk.zzbfp>
	//  121  288:astore          11
		if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue()) goto _L4; else goto _L3
	//  122  290:invokestatic    #368 <Method zzni zzkb.zzik()>
	//  123  293:aload           11
	//  124  295:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	//  125  298:checkcast       #456 <Class Boolean>
	//  126  301:invokevirtual   #460 <Method boolean Boolean.booleanValue()>
	//  127  304:ifeq            4031
_L3:
		obj = "test_request";
	//  128  307:ldc2            #462 <String "test_request">
	//  129  310:astore          11
		Object obj1 = ((Object) (Boolean.valueOf(true)));
	//  130  312:iconst_1        
	//  131  313:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	//  132  316:astore          12
_L46:
		hashmap.put(obj, obj1);
	//  133  318:aload           17
	//  134  320:aload           11
	//  135  322:aload           12
	//  136  324:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  137  327:pop             
	//* 138  328:goto            331
_L2:
		if(((zzjj) (obj5)).versionCode >= 2)
	//* 139  331:aload           19
	//* 140  333:getfield        #468 <Field int zzjj.versionCode>
	//* 141  336:iconst_2        
	//* 142  337:icmplt          386
		{
			if(((zzjj) (obj5)).zzaqb)
	//* 143  340:aload           19
	//* 144  342:getfield        #471 <Field boolean zzjj.zzaqb>
	//* 145  345:ifeq            361
				hashmap.put("d_imp_hdr", ((Object) (Integer.valueOf(1))));
	//  146  348:aload           17
	//  147  350:ldc2            #473 <String "d_imp_hdr">
	//  148  353:iconst_1        
	//  149  354:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  150  357:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  151  360:pop             
			if(!TextUtils.isEmpty(((CharSequence) (((zzjj) (obj5)).zzaqc))))
	//* 152  361:aload           19
	//* 153  363:getfield        #476 <Field String zzjj.zzaqc>
	//* 154  366:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 155  369:ifne            386
				hashmap.put("ppid", ((Object) (((zzjj) (obj5)).zzaqc)));
	//  156  372:aload           17
	//  157  374:ldc2            #478 <String "ppid">
	//  158  377:aload           19
	//  159  379:getfield        #476 <Field String zzjj.zzaqc>
	//  160  382:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  161  385:pop             
		}
		if(((zzjj) (obj5)).versionCode >= 3 && ((zzjj) (obj5)).zzaqf != null)
	//* 162  386:aload           19
	//* 163  388:getfield        #468 <Field int zzjj.versionCode>
	//* 164  391:iconst_3        
	//* 165  392:icmplt          417
	//* 166  395:aload           19
	//* 167  397:getfield        #481 <Field String zzjj.zzaqf>
	//* 168  400:ifnull          417
			hashmap.put("url", ((Object) (((zzjj) (obj5)).zzaqf)));
	//  169  403:aload           17
	//  170  405:ldc2            #483 <String "url">
	//  171  408:aload           19
	//  172  410:getfield        #481 <Field String zzjj.zzaqf>
	//  173  413:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  174  416:pop             
		if(((zzjj) (obj5)).versionCode >= 5)
	//* 175  417:aload           19
	//* 176  419:getfield        #468 <Field int zzjj.versionCode>
	//* 177  422:iconst_5        
	//* 178  423:icmplt          492
		{
			if(((zzjj) (obj5)).zzaqh != null)
	//* 179  426:aload           19
	//* 180  428:getfield        #486 <Field Bundle zzjj.zzaqh>
	//* 181  431:ifnull          448
				hashmap.put("custom_targeting", ((Object) (((zzjj) (obj5)).zzaqh)));
	//  182  434:aload           17
	//  183  436:ldc2            #488 <String "custom_targeting">
	//  184  439:aload           19
	//  185  441:getfield        #486 <Field Bundle zzjj.zzaqh>
	//  186  444:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  187  447:pop             
			if(((zzjj) (obj5)).zzaqi != null)
	//* 188  448:aload           19
	//* 189  450:getfield        #491 <Field List zzjj.zzaqi>
	//* 190  453:ifnull          470
				hashmap.put("category_exclusions", ((Object) (((zzjj) (obj5)).zzaqi)));
	//  191  456:aload           17
	//  192  458:ldc2            #493 <String "category_exclusions">
	//  193  461:aload           19
	//  194  463:getfield        #491 <Field List zzjj.zzaqi>
	//  195  466:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  196  469:pop             
			if(((zzjj) (obj5)).zzaqj != null)
	//* 197  470:aload           19
	//* 198  472:getfield        #496 <Field String zzjj.zzaqj>
	//* 199  475:ifnull          492
				hashmap.put("request_agent", ((Object) (((zzjj) (obj5)).zzaqj)));
	//  200  478:aload           17
	//  201  480:ldc2            #498 <String "request_agent">
	//  202  483:aload           19
	//  203  485:getfield        #496 <Field String zzjj.zzaqj>
	//  204  488:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  205  491:pop             
		}
		if(((zzjj) (obj5)).versionCode >= 6 && ((zzjj) (obj5)).zzaqk != null)
	//* 206  492:aload           19
	//* 207  494:getfield        #468 <Field int zzjj.versionCode>
	//* 208  497:bipush          6
	//* 209  499:icmplt          524
	//* 210  502:aload           19
	//* 211  504:getfield        #501 <Field String zzjj.zzaqk>
	//* 212  507:ifnull          524
			hashmap.put("request_pkg", ((Object) (((zzjj) (obj5)).zzaqk)));
	//  213  510:aload           17
	//  214  512:ldc2            #503 <String "request_pkg">
	//  215  515:aload           19
	//  216  517:getfield        #501 <Field String zzjj.zzaqk>
	//  217  520:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  218  523:pop             
		if(((zzjj) (obj5)).versionCode >= 7)
	//* 219  524:aload           19
	//* 220  526:getfield        #468 <Field int zzjj.versionCode>
	//* 221  529:bipush          7
	//* 222  531:icmplt          551
			hashmap.put("is_designed_for_families", ((Object) (Boolean.valueOf(((zzjj) (obj5)).zzaql))));
	//  223  534:aload           17
	//  224  536:ldc2            #505 <String "is_designed_for_families">
	//  225  539:aload           19
	//  226  541:getfield        #508 <Field boolean zzjj.zzaql>
	//  227  544:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	//  228  547:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  229  550:pop             
		if(((zzaef) (obj4)).zzacv.zzard != null) goto _L6; else goto _L5
	//  230  551:aload           14
	//  231  553:getfield        #512 <Field zzjn zzaef.zzacv>
	//  232  556:getfield        #518 <Field zzjn[] zzjn.zzard>
	//  233  559:ifnonnull       603
_L5:
		hashmap.put("format", ((Object) (((zzaef) (obj4)).zzacv.zzarb)));
	//  234  562:aload           17
	//  235  564:ldc2            #519 <String "format">
	//  236  567:aload           14
	//  237  569:getfield        #512 <Field zzjn zzaef.zzacv>
	//  238  572:getfield        #522 <Field String zzjn.zzarb>
	//  239  575:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  240  578:pop             
		if(((zzaef) (obj4)).zzacv.zzarf)
	//* 241  579:aload           14
	//* 242  581:getfield        #512 <Field zzjn zzaef.zzacv>
	//* 243  584:getfield        #525 <Field boolean zzjn.zzarf>
	//* 244  587:ifeq            709
			hashmap.put("fluid", "height");
	//  245  590:aload           17
	//  246  592:ldc1            #218 <String "fluid">
	//  247  594:ldc1            #216 <String "height">
	//  248  596:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  249  599:pop             
		  goto _L7
	//* 250  600:goto            709
_L6:
		int i1;
		obj = ((Object) (((zzaef) (obj4)).zzacv.zzard));
	//  251  603:aload           14
	//  252  605:getfield        #512 <Field zzjn zzaef.zzacv>
	//  253  608:getfield        #518 <Field zzjn[] zzjn.zzard>
	//  254  611:astore          11
		i1 = obj.length;
	//  255  613:aload           11
	//  256  615:arraylength     
	//  257  616:istore          7
		int i;
		int j;
		int l;
		j = 0;
	//  258  618:iconst_0        
	//  259  619:istore_3        
		l = 0;
	//  260  620:iconst_0        
	//  261  621:istore          5
		i = 0;
	//  262  623:iconst_0        
	//  263  624:istore_2        
_L48:
		if(j >= i1) goto _L7; else goto _L8
	//  264  625:iload_3         
	//  265  626:iload           7
	//  266  628:icmpge          709
_L8:
		int k;
		obj1 = ((Object) (obj[j]));
	//  267  631:aload           11
	//  268  633:iload_3         
	//  269  634:aaload          
	//  270  635:astore          12
		k = l;
	//  271  637:iload           5
	//  272  639:istore          4
		if(((zzjn) (obj1)).zzarf)
			break MISSING_BLOCK_LABEL_675;
	//  273  641:aload           12
	//  274  643:getfield        #525 <Field boolean zzjn.zzarf>
	//  275  646:ifne            675
		k = l;
	//  276  649:iload           5
	//  277  651:istore          4
		if(l != 0)
			break MISSING_BLOCK_LABEL_675;
	//  278  653:iload           5
	//  279  655:ifne            675
		hashmap.put("format", ((Object) (((zzjn) (obj1)).zzarb)));
	//  280  658:aload           17
	//  281  660:ldc2            #519 <String "format">
	//  282  663:aload           12
	//  283  665:getfield        #522 <Field String zzjn.zzarb>
	//  284  668:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  285  671:pop             
		k = 1;
	//  286  672:iconst_1        
	//  287  673:istore          4
		boolean flag = ((boolean) (i));
	//  288  675:iload_2         
	//  289  676:istore          6
		if(!((zzjn) (obj1)).zzarf) goto _L10; else goto _L9
	//  290  678:aload           12
	//  291  680:getfield        #525 <Field boolean zzjn.zzarf>
	//  292  683:ifeq            4044
_L9:
		flag = ((boolean) (i));
	//  293  686:iload_2         
	//  294  687:istore          6
		if(i != 0) goto _L10; else goto _L11
	//  295  689:iload_2         
	//  296  690:ifne            4044
_L11:
		hashmap.put("fluid", "height");
	//  297  693:aload           17
	//  298  695:ldc1            #218 <String "fluid">
	//  299  697:ldc1            #216 <String "height">
	//  300  699:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  301  702:pop             
		flag = true;
	//  302  703:iconst_1        
	//  303  704:istore          6
		  goto _L10
	//* 304  706:goto            4044
_L7:
		if(((zzaef) (obj4)).zzacv.width == -1)
	//* 305  709:aload           14
	//* 306  711:getfield        #512 <Field zzjn zzaef.zzacv>
	//* 307  714:getfield        #528 <Field int zzjn.width>
	//* 308  717:iconst_m1       
	//* 309  718:icmpne          733
			hashmap.put("smart_w", "full");
	//  310  721:aload           17
	//  311  723:ldc2            #530 <String "smart_w">
	//  312  726:ldc2            #532 <String "full">
	//  313  729:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  314  732:pop             
		if(((zzaef) (obj4)).zzacv.height == -2)
	//* 315  733:aload           14
	//* 316  735:getfield        #512 <Field zzjn zzaef.zzacv>
	//* 317  738:getfield        #534 <Field int zzjn.height>
	//* 318  741:bipush          -2
	//* 319  743:icmpne          758
			hashmap.put("smart_h", "auto");
	//  320  746:aload           17
	//  321  748:ldc2            #536 <String "smart_h">
	//  322  751:ldc2            #538 <String "auto">
	//  323  754:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  324  757:pop             
		if(((zzaef) (obj4)).zzacv.zzard == null) goto _L13; else goto _L12
	//  325  758:aload           14
	//  326  760:getfield        #512 <Field zzjn zzaef.zzacv>
	//  327  763:getfield        #518 <Field zzjn[] zzjn.zzard>
	//  328  766:ifnull          982
_L12:
		obj = ((Object) (new StringBuilder()));
	//  329  769:new             #540 <Class StringBuilder>
	//  330  772:dup             
	//  331  773:invokespecial   #541 <Method void StringBuilder()>
	//  332  776:astore          11
		obj1 = ((Object) (((zzaef) (obj4)).zzacv.zzard));
	//  333  778:aload           14
	//  334  780:getfield        #512 <Field zzjn zzaef.zzacv>
	//  335  783:getfield        #518 <Field zzjn[] zzjn.zzard>
	//  336  786:astore          12
		l = obj1.length;
	//  337  788:aload           12
	//  338  790:arraylength     
	//  339  791:istore          5
		i = 0;
	//  340  793:iconst_0        
	//  341  794:istore_2        
		j = 0;
	//  342  795:iconst_0        
	//  343  796:istore_3        
_L49:
		if(i >= l) goto _L15; else goto _L14
	//  344  797:iload_2         
	//  345  798:iload           5
	//  346  800:icmpge          936
_L14:
		obj5 = ((Object) (obj1[i]));
	//  347  803:aload           12
	//  348  805:iload_2         
	//  349  806:aaload          
	//  350  807:astore          19
		if(!((zzjn) (obj5)).zzarf) goto _L17; else goto _L16
	//  351  809:aload           19
	//  352  811:getfield        #525 <Field boolean zzjn.zzarf>
	//  353  814:ifeq            822
_L16:
		j = 1;
	//  354  817:iconst_1        
	//  355  818:istore_3        
		  goto _L18
	//* 356  819:goto            4068
_L17:
		if(((StringBuilder) (obj)).length() != 0)
	//* 357  822:aload           11
	//* 358  824:invokevirtual   #542 <Method int StringBuilder.length()>
	//* 359  827:ifeq            839
			((StringBuilder) (obj)).append("|");
	//  360  830:aload           11
	//  361  832:ldc2            #544 <String "|">
	//  362  835:invokevirtual   #548 <Method StringBuilder StringBuilder.append(String)>
	//  363  838:pop             
		if(((zzjn) (obj5)).width == -1)
	//* 364  839:aload           19
	//* 365  841:getfield        #528 <Field int zzjn.width>
	//* 366  844:iconst_m1       
	//* 367  845:icmpne          866
		{
			k = (int)((float)((zzjn) (obj5)).widthPixels / zzaga1.zzagu);
	//  368  848:aload           19
	//  369  850:getfield        #551 <Field int zzjn.widthPixels>
	//  370  853:i2f             
	//  371  854:aload           16
	//  372  856:getfield        #557 <Field float zzaga.zzagu>
	//  373  859:fdiv            
	//  374  860:f2i             
	//  375  861:istore          4
			break MISSING_BLOCK_LABEL_873;
	//  376  863:goto            873
		}
		k = ((zzjn) (obj5)).width;
	//  377  866:aload           19
	//  378  868:getfield        #528 <Field int zzjn.width>
	//  379  871:istore          4
		((StringBuilder) (obj)).append(k);
	//  380  873:aload           11
	//  381  875:iload           4
	//  382  877:invokevirtual   #560 <Method StringBuilder StringBuilder.append(int)>
	//  383  880:pop             
		((StringBuilder) (obj)).append("x");
	//  384  881:aload           11
	//  385  883:ldc2            #562 <String "x">
	//  386  886:invokevirtual   #548 <Method StringBuilder StringBuilder.append(String)>
	//  387  889:pop             
		if(((zzjn) (obj5)).height == -2)
	//* 388  890:aload           19
	//* 389  892:getfield        #534 <Field int zzjn.height>
	//* 390  895:bipush          -2
	//* 391  897:icmpne          918
		{
			k = (int)((float)((zzjn) (obj5)).heightPixels / zzaga1.zzagu);
	//  392  900:aload           19
	//  393  902:getfield        #565 <Field int zzjn.heightPixels>
	//  394  905:i2f             
	//  395  906:aload           16
	//  396  908:getfield        #557 <Field float zzaga.zzagu>
	//  397  911:fdiv            
	//  398  912:f2i             
	//  399  913:istore          4
			break MISSING_BLOCK_LABEL_925;
	//  400  915:goto            925
		}
		k = ((zzjn) (obj5)).height;
	//  401  918:aload           19
	//  402  920:getfield        #534 <Field int zzjn.height>
	//  403  923:istore          4
		((StringBuilder) (obj)).append(k);
	//  404  925:aload           11
	//  405  927:iload           4
	//  406  929:invokevirtual   #560 <Method StringBuilder StringBuilder.append(int)>
	//  407  932:pop             
		  goto _L18
	//* 408  933:goto            4068
_L15:
		if(j == 0)
			break MISSING_BLOCK_LABEL_971;
	//  409  936:iload_3         
	//  410  937:ifeq            971
		if(((StringBuilder) (obj)).length() != 0)
	//* 411  940:aload           11
	//* 412  942:invokevirtual   #542 <Method int StringBuilder.length()>
	//* 413  945:ifeq            4075
			((StringBuilder) (obj)).insert(0, "|");
	//  414  948:aload           11
	//  415  950:iconst_0        
	//  416  951:ldc2            #544 <String "|">
	//  417  954:invokevirtual   #569 <Method StringBuilder StringBuilder.insert(int, String)>
	//  418  957:pop             
	//* 419  958:goto            961
		((StringBuilder) (obj)).insert(0, "320x50");
	//  420  961:aload           11
	//  421  963:iconst_0        
	//  422  964:ldc2            #571 <String "320x50">
	//  423  967:invokevirtual   #569 <Method StringBuilder StringBuilder.insert(int, String)>
	//  424  970:pop             
		hashmap.put("sz", obj);
	//  425  971:aload           17
	//  426  973:ldc2            #573 <String "sz">
	//  427  976:aload           11
	//  428  978:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  429  981:pop             
_L13:
		if(((zzaef) (obj4)).zzcdb == 0) goto _L20; else goto _L19
	//  430  982:aload           14
	//  431  984:getfield        #53  <Field int zzaef.zzcdb>
	//  432  987:ifeq            1182
_L19:
		hashmap.put("native_version", ((Object) (Integer.valueOf(((zzaef) (obj4)).zzcdb))));
	//  433  990:aload           17
	//  434  992:ldc2            #575 <String "native_version">
	//  435  995:aload           14
	//  436  997:getfield        #53  <Field int zzaef.zzcdb>
	//  437 1000:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  438 1003:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  439 1006:pop             
		hashmap.put("native_templates", ((Object) (((zzaef) (obj4)).zzads)));
	//  440 1007:aload           17
	//  441 1009:ldc2            #577 <String "native_templates">
	//  442 1012:aload           14
	//  443 1014:getfield        #580 <Field List zzaef.zzads>
	//  444 1017:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  445 1020:pop             
		obj = ((Object) (((zzaef) (obj4)).zzadj));
	//  446 1021:aload           14
	//  447 1023:getfield        #584 <Field zzpl zzaef.zzadj>
	//  448 1026:astore          11
		if(obj != null) goto _L22; else goto _L21
	//  449 1028:aload           11
	//  450 1030:ifnonnull       1036
	//* 451 1033:goto            4078
_L22:
		((zzpl) (obj)).zzbjo;
	//  452 1036:aload           11
	//  453 1038:getfield        #589 <Field int zzpl.zzbjo>
		JVM INSTR tableswitch 0 2: default 4086
	//	               0 4078
	//	               1 4101
	//	               2 4094;
	//  454 1041:tableswitch     0 2: default 4086
	//	               0 4078
	//	               1 4101
	//	               2 4094
		   goto _L23 _L21 _L24 _L25
_L50:
		boolean flag1;
		hashmap.put("native_image_orientation", obj);
	//  455 1068:aload           17
	//  456 1070:ldc2            #591 <String "native_image_orientation">
	//  457 1073:aload           11
	//  458 1075:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  459 1078:pop             
		if(!((zzaef) (obj4)).zzcdk.isEmpty())
	//* 460 1079:aload           14
	//* 461 1081:getfield        #594 <Field List zzaef.zzcdk>
	//* 462 1084:invokeinterface #596 <Method boolean List.isEmpty()>
	//* 463 1089:ifne            1106
			hashmap.put("native_custom_templates", ((Object) (((zzaef) (obj4)).zzcdk)));
	//  464 1092:aload           17
	//  465 1094:ldc2            #598 <String "native_custom_templates">
	//  466 1097:aload           14
	//  467 1099:getfield        #594 <Field List zzaef.zzcdk>
	//  468 1102:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  469 1105:pop             
		if(((zzaef) (obj4)).versionCode >= 24)
	//* 470 1106:aload           14
	//* 471 1108:getfield        #599 <Field int zzaef.versionCode>
	//* 472 1111:bipush          24
	//* 473 1113:icmplt          1133
			hashmap.put("max_num_ads", ((Object) (Integer.valueOf(((zzaef) (obj4)).zzceg))));
	//  474 1116:aload           17
	//  475 1118:ldc2            #601 <String "max_num_ads">
	//  476 1121:aload           14
	//  477 1123:getfield        #604 <Field int zzaef.zzceg>
	//  478 1126:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  479 1129:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  480 1132:pop             
		flag1 = TextUtils.isEmpty(((CharSequence) (((zzaef) (obj4)).zzcee)));
	//  481 1133:aload           14
	//  482 1135:getfield        #607 <Field String zzaef.zzcee>
	//  483 1138:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  484 1141:istore          8
		if(flag1) goto _L20; else goto _L26
	//  485 1143:iload           8
	//  486 1145:ifne            1182
_L26:
		hashmap.put("native_advanced_settings", ((Object) (new JSONArray(((zzaef) (obj4)).zzcee))));
	//  487 1148:aload           17
	//  488 1150:ldc2            #609 <String "native_advanced_settings">
	//  489 1153:new             #313 <Class JSONArray>
	//  490 1156:dup             
	//  491 1157:aload           14
	//  492 1159:getfield        #607 <Field String zzaef.zzcee>
	//  493 1162:invokespecial   #610 <Method void JSONArray(String)>
	//  494 1165:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  495 1168:pop             
		  goto _L20
	//* 496 1169:goto            1182
		obj;
	//  497 1172:astore          11
		zzakb.zzc("Problem creating json from native advanced settings", ((Throwable) (obj)));
	//  498 1174:ldc2            #612 <String "Problem creating json from native advanced settings">
	//  499 1177:aload           11
	//  500 1179:invokestatic    #616 <Method void zzakb.zzc(String, Throwable)>
_L20:
		if(((zzaef) (obj4)).zzadn == null || ((zzaef) (obj4)).zzadn.size() <= 0) goto _L28; else goto _L27
	//  501 1182:aload           14
	//  502 1184:getfield        #619 <Field List zzaef.zzadn>
	//  503 1187:ifnull          1293
	//  504 1190:aload           14
	//  505 1192:getfield        #619 <Field List zzaef.zzadn>
	//  506 1195:invokeinterface #384 <Method int List.size()>
	//  507 1200:ifle            1293
_L27:
		obj5 = ((Object) (((zzaef) (obj4)).zzadn.iterator()));
	//  508 1203:aload           14
	//  509 1205:getfield        #619 <Field List zzaef.zzadn>
	//  510 1208:invokeinterface #623 <Method Iterator List.iterator()>
	//  511 1213:astore          19
_L30:
		if(!((Iterator) (obj5)).hasNext()) goto _L28; else goto _L29
	//  512 1215:aload           19
	//  513 1217:invokeinterface #628 <Method boolean Iterator.hasNext()>
	//  514 1222:ifeq            1293
_L29:
		obj = ((Object) ((Integer)((Iterator) (obj5)).next()));
	//  515 1225:aload           19
	//  516 1227:invokeinterface #632 <Method Object Iterator.next()>
	//  517 1232:checkcast       #435 <Class Integer>
	//  518 1235:astore          11
		if(((Integer) (obj)).intValue() != 2)
			continue; /* Loop/switch isn't completed */
	//  519 1237:aload           11
	//  520 1239:invokevirtual   #635 <Method int Integer.intValue()>
	//  521 1242:iconst_2        
	//  522 1243:icmpne          1270
		obj = "iba";
	//  523 1246:ldc2            #637 <String "iba">
	//  524 1249:astore          11
		obj1 = ((Object) (Boolean.valueOf(true)));
	//  525 1251:iconst_1        
	//  526 1252:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	//  527 1255:astore          12
_L32:
		hashmap.put(obj, obj1);
	//  528 1257:aload           17
	//  529 1259:aload           11
	//  530 1261:aload           12
	//  531 1263:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  532 1266:pop             
		  goto _L30
	//* 533 1267:goto            1215
		if(((Integer) (obj)).intValue() != 1) goto _L30; else goto _L31
	//  534 1270:aload           11
	//  535 1272:invokevirtual   #635 <Method int Integer.intValue()>
	//  536 1275:iconst_1        
	//  537 1276:icmpne          1215
_L31:
		obj = "ina";
	//  538 1279:ldc2            #639 <String "ina">
	//  539 1282:astore          11
		obj1 = ((Object) (Boolean.valueOf(true)));
	//  540 1284:iconst_1        
	//  541 1285:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	//  542 1288:astore          12
		  goto _L32
	//* 543 1290:goto            1257
_L28:
		Object obj6;
		if(((zzaef) (obj4)).zzacv.zzarg)
	//* 544 1293:aload           14
	//* 545 1295:getfield        #512 <Field zzjn zzaef.zzacv>
	//* 546 1298:getfield        #642 <Field boolean zzjn.zzarg>
	//* 547 1301:ifeq            1317
			hashmap.put("ene", ((Object) (Boolean.valueOf(true))));
	//  548 1304:aload           17
	//  549 1306:ldc2            #644 <String "ene">
	//  550 1309:iconst_1        
	//  551 1310:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	//  552 1313:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  553 1316:pop             
		obj = ((Object) (zznk.zzaxv));
	//  554 1317:getstatic       #647 <Field zzna zznk.zzaxv>
	//  555 1320:astore          11
		if(((Boolean)zzkb.zzik().zzd(((zzna) (obj)))).booleanValue())
	//* 556 1322:invokestatic    #368 <Method zzni zzkb.zzik()>
	//* 557 1325:aload           11
	//* 558 1327:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	//* 559 1330:checkcast       #456 <Class Boolean>
	//* 560 1333:invokevirtual   #460 <Method boolean Boolean.booleanValue()>
	//* 561 1336:ifeq            1352
			hashmap.put("xsrve", ((Object) (Boolean.valueOf(true))));
	//  562 1339:aload           17
	//  563 1341:ldc2            #649 <String "xsrve">
	//  564 1344:iconst_1        
	//  565 1345:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	//  566 1348:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  567 1351:pop             
		if(((zzaef) (obj4)).zzadl != null)
	//* 568 1352:aload           14
	//* 569 1354:getfield        #653 <Field zzlu zzaef.zzadl>
	//* 570 1357:ifnull          1393
		{
			hashmap.put("is_icon_ad", ((Object) (Boolean.valueOf(true))));
	//  571 1360:aload           17
	//  572 1362:ldc2            #655 <String "is_icon_ad">
	//  573 1365:iconst_1        
	//  574 1366:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	//  575 1369:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  576 1372:pop             
			hashmap.put("icon_ad_expansion_behavior", ((Object) (Integer.valueOf(((zzaef) (obj4)).zzadl.zzasj))));
	//  577 1373:aload           17
	//  578 1375:ldc2            #657 <String "icon_ad_expansion_behavior">
	//  579 1378:aload           14
	//  580 1380:getfield        #653 <Field zzlu zzaef.zzadl>
	//  581 1383:getfield        #662 <Field int zzlu.zzasj>
	//  582 1386:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  583 1389:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  584 1392:pop             
		}
		hashmap.put("slotname", ((Object) (((zzaef) (obj4)).zzacp)));
	//  585 1393:aload           17
	//  586 1395:ldc2            #664 <String "slotname">
	//  587 1398:aload           14
	//  588 1400:getfield        #667 <Field String zzaef.zzacp>
	//  589 1403:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  590 1406:pop             
		hashmap.put("pn", ((Object) (((zzaef) (obj4)).applicationInfo.packageName)));
	//  591 1407:aload           17
	//  592 1409:ldc2            #669 <String "pn">
	//  593 1412:aload           14
	//  594 1414:getfield        #673 <Field ApplicationInfo zzaef.applicationInfo>
	//  595 1417:getfield        #678 <Field String ApplicationInfo.packageName>
	//  596 1420:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  597 1423:pop             
		if(((zzaef) (obj4)).zzccw != null)
	//* 598 1424:aload           14
	//* 599 1426:getfield        #682 <Field PackageInfo zzaef.zzccw>
	//* 600 1429:ifnull          1452
			hashmap.put("vc", ((Object) (Integer.valueOf(((zzaef) (obj4)).zzccw.versionCode))));
	//  601 1432:aload           17
	//  602 1434:ldc2            #684 <String "vc">
	//  603 1437:aload           14
	//  604 1439:getfield        #682 <Field PackageInfo zzaef.zzccw>
	//  605 1442:getfield        #687 <Field int PackageInfo.versionCode>
	//  606 1445:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  607 1448:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  608 1451:pop             
		hashmap.put("ms", ((Object) (zzafl1.zzccx)));
	//  609 1452:aload           17
	//  610 1454:ldc2            #689 <String "ms">
	//  611 1457:aload_1         
	//  612 1458:getfield        #692 <Field String zzafl.zzccx>
	//  613 1461:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  614 1464:pop             
		hashmap.put("seq_num", ((Object) (((zzaef) (obj4)).zzccy)));
	//  615 1465:aload           17
	//  616 1467:ldc2            #694 <String "seq_num">
	//  617 1470:aload           14
	//  618 1472:getfield        #697 <Field String zzaef.zzccy>
	//  619 1475:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  620 1478:pop             
		hashmap.put("session_id", ((Object) (((zzaef) (obj4)).zzccz)));
	//  621 1479:aload           17
	//  622 1481:ldc2            #699 <String "session_id">
	//  623 1484:aload           14
	//  624 1486:getfield        #702 <Field String zzaef.zzccz>
	//  625 1489:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  626 1492:pop             
		hashmap.put("js", ((Object) (((zzaef) (obj4)).zzacr.zzcw)));
	//  627 1493:aload           17
	//  628 1495:ldc2            #704 <String "js">
	//  629 1498:aload           14
	//  630 1500:getfield        #118 <Field zzang zzaef.zzacr>
	//  631 1503:getfield        #124 <Field String zzang.zzcw>
	//  632 1506:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  633 1509:pop             
		obj6 = ((Object) (zzafl1.zzcgo));
	//  634 1510:aload_1         
	//  635 1511:getfield        #708 <Field zzagk zzafl.zzcgo>
	//  636 1514:astore          20
		obj = ((Object) (((zzaef) (obj4)).zzcdw));
	//  637 1516:aload           14
	//  638 1518:getfield        #711 <Field Bundle zzaef.zzcdw>
	//  639 1521:astore          11
		obj1 = ((Object) (zzafl1.zzcgn));
	//  640 1523:aload_1         
	//  641 1524:getfield        #714 <Field Bundle zzafl.zzcgn>
	//  642 1527:astore          12
		hashmap.put("am", ((Object) (Integer.valueOf(zzaga1.zzcjk))));
	//  643 1529:aload           17
	//  644 1531:ldc2            #716 <String "am">
	//  645 1534:aload           16
	//  646 1536:getfield        #719 <Field int zzaga.zzcjk>
	//  647 1539:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  648 1542:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  649 1545:pop             
		hashmap.put("cog", ((Object) (zzv(zzaga1.zzcjl))));
	//  650 1546:aload           17
	//  651 1548:ldc2            #721 <String "cog">
	//  652 1551:aload           16
	//  653 1553:getfield        #724 <Field boolean zzaga.zzcjl>
	//  654 1556:invokestatic    #728 <Method Integer zzv(boolean)>
	//  655 1559:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  656 1562:pop             
		hashmap.put("coh", ((Object) (zzv(zzaga1.zzcjm))));
	//  657 1563:aload           17
	//  658 1565:ldc2            #730 <String "coh">
	//  659 1568:aload           16
	//  660 1570:getfield        #733 <Field boolean zzaga.zzcjm>
	//  661 1573:invokestatic    #728 <Method Integer zzv(boolean)>
	//  662 1576:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  663 1579:pop             
		if(!TextUtils.isEmpty(((CharSequence) (zzaga1.zzcjn))))
	//* 664 1580:aload           16
	//* 665 1582:getfield        #736 <Field String zzaga.zzcjn>
	//* 666 1585:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 667 1588:ifne            1605
			hashmap.put("carrier", ((Object) (zzaga1.zzcjn)));
	//  668 1591:aload           17
	//  669 1593:ldc2            #738 <String "carrier">
	//  670 1596:aload           16
	//  671 1598:getfield        #736 <Field String zzaga.zzcjn>
	//  672 1601:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  673 1604:pop             
		hashmap.put("gl", ((Object) (zzaga1.zzcjo)));
	//  674 1605:aload           17
	//  675 1607:ldc2            #740 <String "gl">
	//  676 1610:aload           16
	//  677 1612:getfield        #743 <Field String zzaga.zzcjo>
	//  678 1615:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  679 1618:pop             
		if(zzaga1.zzcjp)
	//* 680 1619:aload           16
	//* 681 1621:getfield        #746 <Field boolean zzaga.zzcjp>
	//* 682 1624:ifeq            1640
			hashmap.put("simulator", ((Object) (Integer.valueOf(1))));
	//  683 1627:aload           17
	//  684 1629:ldc2            #748 <String "simulator">
	//  685 1632:iconst_1        
	//  686 1633:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  687 1636:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  688 1639:pop             
		if(zzaga1.zzcjq)
	//* 689 1640:aload           16
	//* 690 1642:getfield        #751 <Field boolean zzaga.zzcjq>
	//* 691 1645:ifeq            4108
			hashmap.put("is_sidewinder", ((Object) (Integer.valueOf(1))));
	//  692 1648:aload           17
	//  693 1650:ldc2            #753 <String "is_sidewinder">
	//  694 1653:iconst_1        
	//  695 1654:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  696 1657:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  697 1660:pop             
	//* 698 1661:goto            1664
		Bundle bundle;
		hashmap.put("ma", ((Object) (zzv(zzaga1.zzcjr))));
	//  699 1664:aload           17
	//  700 1666:ldc2            #755 <String "ma">
	//  701 1669:aload           16
	//  702 1671:getfield        #758 <Field boolean zzaga.zzcjr>
	//  703 1674:invokestatic    #728 <Method Integer zzv(boolean)>
	//  704 1677:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  705 1680:pop             
		hashmap.put("sp", ((Object) (zzv(zzaga1.zzcjs))));
	//  706 1681:aload           17
	//  707 1683:ldc2            #760 <String "sp">
	//  708 1686:aload           16
	//  709 1688:getfield        #763 <Field boolean zzaga.zzcjs>
	//  710 1691:invokestatic    #728 <Method Integer zzv(boolean)>
	//  711 1694:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  712 1697:pop             
		hashmap.put("hl", ((Object) (zzaga1.zzcjt)));
	//  713 1698:aload           17
	//  714 1700:ldc2            #765 <String "hl">
	//  715 1703:aload           16
	//  716 1705:getfield        #768 <Field String zzaga.zzcjt>
	//  717 1708:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  718 1711:pop             
		if(!TextUtils.isEmpty(((CharSequence) (zzaga1.zzcju))))
	//* 719 1712:aload           16
	//* 720 1714:getfield        #771 <Field String zzaga.zzcju>
	//* 721 1717:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 722 1720:ifne            1737
			hashmap.put("mv", ((Object) (zzaga1.zzcju)));
	//  723 1723:aload           17
	//  724 1725:ldc2            #773 <String "mv">
	//  725 1728:aload           16
	//  726 1730:getfield        #771 <Field String zzaga.zzcju>
	//  727 1733:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  728 1736:pop             
		hashmap.put("muv", ((Object) (Integer.valueOf(zzaga1.zzcjw))));
	//  729 1737:aload           17
	//  730 1739:ldc2            #775 <String "muv">
	//  731 1742:aload           16
	//  732 1744:getfield        #778 <Field int zzaga.zzcjw>
	//  733 1747:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  734 1750:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  735 1753:pop             
		if(zzaga1.zzcjx != -2)
	//* 736 1754:aload           16
	//* 737 1756:getfield        #781 <Field int zzaga.zzcjx>
	//* 738 1759:bipush          -2
	//* 739 1761:icmpeq          1781
			hashmap.put("cnt", ((Object) (Integer.valueOf(zzaga1.zzcjx))));
	//  740 1764:aload           17
	//  741 1766:ldc2            #783 <String "cnt">
	//  742 1769:aload           16
	//  743 1771:getfield        #781 <Field int zzaga.zzcjx>
	//  744 1774:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  745 1777:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  746 1780:pop             
		hashmap.put("gnt", ((Object) (Integer.valueOf(zzaga1.zzcjy))));
	//  747 1781:aload           17
	//  748 1783:ldc2            #785 <String "gnt">
	//  749 1786:aload           16
	//  750 1788:getfield        #788 <Field int zzaga.zzcjy>
	//  751 1791:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  752 1794:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  753 1797:pop             
		hashmap.put("pt", ((Object) (Integer.valueOf(zzaga1.zzcjz))));
	//  754 1798:aload           17
	//  755 1800:ldc2            #790 <String "pt">
	//  756 1803:aload           16
	//  757 1805:getfield        #793 <Field int zzaga.zzcjz>
	//  758 1808:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  759 1811:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  760 1814:pop             
		hashmap.put("rm", ((Object) (Integer.valueOf(zzaga1.zzcka))));
	//  761 1815:aload           17
	//  762 1817:ldc2            #795 <String "rm">
	//  763 1820:aload           16
	//  764 1822:getfield        #798 <Field int zzaga.zzcka>
	//  765 1825:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  766 1828:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  767 1831:pop             
		hashmap.put("riv", ((Object) (Integer.valueOf(zzaga1.zzckb))));
	//  768 1832:aload           17
	//  769 1834:ldc2            #800 <String "riv">
	//  770 1837:aload           16
	//  771 1839:getfield        #803 <Field int zzaga.zzckb>
	//  772 1842:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	//  773 1845:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  774 1848:pop             
		obj5 = ((Object) (new Bundle()));
	//  775 1849:new             #805 <Class Bundle>
	//  776 1852:dup             
	//  777 1853:invokespecial   #806 <Method void Bundle()>
	//  778 1856:astore          19
		((Bundle) (obj5)).putString("build_build", zzaga1.zzckg);
	//  779 1858:aload           19
	//  780 1860:ldc2            #808 <String "build_build">
	//  781 1863:aload           16
	//  782 1865:getfield        #811 <Field String zzaga.zzckg>
	//  783 1868:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj5)).putString("build_device", zzaga1.zzckh);
	//  784 1871:aload           19
	//  785 1873:ldc2            #817 <String "build_device">
	//  786 1876:aload           16
	//  787 1878:getfield        #820 <Field String zzaga.zzckh>
	//  788 1881:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		bundle = new Bundle();
	//  789 1884:new             #805 <Class Bundle>
	//  790 1887:dup             
	//  791 1888:invokespecial   #806 <Method void Bundle()>
	//  792 1891:astore          21
		bundle.putBoolean("is_charging", zzaga1.zzckd);
	//  793 1893:aload           21
	//  794 1895:ldc2            #822 <String "is_charging">
	//  795 1898:aload           16
	//  796 1900:getfield        #825 <Field boolean zzaga.zzckd>
	//  797 1903:invokevirtual   #829 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putDouble("battery_level", zzaga1.zzckc);
	//  798 1906:aload           21
	//  799 1908:ldc2            #831 <String "battery_level">
	//  800 1911:aload           16
	//  801 1913:getfield        #835 <Field double zzaga.zzckc>
	//  802 1916:invokevirtual   #839 <Method void Bundle.putDouble(String, double)>
		((Bundle) (obj5)).putBundle("battery", bundle);
	//  803 1919:aload           19
	//  804 1921:ldc2            #841 <String "battery">
	//  805 1924:aload           21
	//  806 1926:invokevirtual   #845 <Method void Bundle.putBundle(String, Bundle)>
		bundle = new Bundle();
	//  807 1929:new             #805 <Class Bundle>
	//  808 1932:dup             
	//  809 1933:invokespecial   #806 <Method void Bundle()>
	//  810 1936:astore          21
		bundle.putInt("active_network_state", zzaga1.zzckf);
	//  811 1938:aload           21
	//  812 1940:ldc2            #847 <String "active_network_state">
	//  813 1943:aload           16
	//  814 1945:getfield        #850 <Field int zzaga.zzckf>
	//  815 1948:invokevirtual   #854 <Method void Bundle.putInt(String, int)>
		bundle.putBoolean("active_network_metered", zzaga1.zzcke);
	//  816 1951:aload           21
	//  817 1953:ldc2            #856 <String "active_network_metered">
	//  818 1956:aload           16
	//  819 1958:getfield        #859 <Field boolean zzaga.zzcke>
	//  820 1961:invokevirtual   #829 <Method void Bundle.putBoolean(String, boolean)>
		if(obj6 == null)
			break MISSING_BLOCK_LABEL_2027;
	//  821 1964:aload           20
	//  822 1966:ifnull          2027
		Bundle bundle1 = new Bundle();
	//  823 1969:new             #805 <Class Bundle>
	//  824 1972:dup             
	//  825 1973:invokespecial   #806 <Method void Bundle()>
	//  826 1976:astore          22
		bundle1.putInt("predicted_latency_micros", ((zzagk) (obj6)).zzckq);
	//  827 1978:aload           22
	//  828 1980:ldc2            #861 <String "predicted_latency_micros">
	//  829 1983:aload           20
	//  830 1985:getfield        #866 <Field int zzagk.zzckq>
	//  831 1988:invokevirtual   #854 <Method void Bundle.putInt(String, int)>
		bundle1.putLong("predicted_down_throughput_bps", ((zzagk) (obj6)).zzckr);
	//  832 1991:aload           22
	//  833 1993:ldc2            #868 <String "predicted_down_throughput_bps">
	//  834 1996:aload           20
	//  835 1998:getfield        #871 <Field long zzagk.zzckr>
	//  836 2001:invokevirtual   #875 <Method void Bundle.putLong(String, long)>
		bundle1.putLong("predicted_up_throughput_bps", ((zzagk) (obj6)).zzcks);
	//  837 2004:aload           22
	//  838 2006:ldc2            #877 <String "predicted_up_throughput_bps">
	//  839 2009:aload           20
	//  840 2011:getfield        #880 <Field long zzagk.zzcks>
	//  841 2014:invokevirtual   #875 <Method void Bundle.putLong(String, long)>
		bundle.putBundle("predictions", bundle1);
	//  842 2017:aload           21
	//  843 2019:ldc2            #882 <String "predictions">
	//  844 2022:aload           22
	//  845 2024:invokevirtual   #845 <Method void Bundle.putBundle(String, Bundle)>
		((Bundle) (obj5)).putBundle("network", bundle);
	//  846 2027:aload           19
	//  847 2029:ldc2            #884 <String "network">
	//  848 2032:aload           21
	//  849 2034:invokevirtual   #845 <Method void Bundle.putBundle(String, Bundle)>
		obj6 = ((Object) (new Bundle()));
	//  850 2037:new             #805 <Class Bundle>
	//  851 2040:dup             
	//  852 2041:invokespecial   #806 <Method void Bundle()>
	//  853 2044:astore          20
		((Bundle) (obj6)).putBoolean("is_browser_custom_tabs_capable", zzaga1.zzcki);
	//  854 2046:aload           20
	//  855 2048:ldc2            #886 <String "is_browser_custom_tabs_capable">
	//  856 2051:aload           16
	//  857 2053:getfield        #889 <Field boolean zzaga.zzcki>
	//  858 2056:invokevirtual   #829 <Method void Bundle.putBoolean(String, boolean)>
		((Bundle) (obj5)).putBundle("browser", ((Bundle) (obj6)));
	//  859 2059:aload           19
	//  860 2061:ldc2            #891 <String "browser">
	//  861 2064:aload           20
	//  862 2066:invokevirtual   #845 <Method void Bundle.putBundle(String, Bundle)>
		if(obj == null)
			break MISSING_BLOCK_LABEL_2344;
	//  863 2069:aload           11
	//  864 2071:ifnull          4111
		obj6 = ((Object) (new Bundle()));
	//  865 2074:new             #805 <Class Bundle>
	//  866 2077:dup             
	//  867 2078:invokespecial   #806 <Method void Bundle()>
	//  868 2081:astore          20
		((Bundle) (obj6)).putString("runtime_free", Long.toString(((Bundle) (obj)).getLong("runtime_free_memory", -1L)));
	//  869 2083:aload           20
	//  870 2085:ldc2            #893 <String "runtime_free">
	//  871 2088:aload           11
	//  872 2090:ldc2            #895 <String "runtime_free_memory">
	//  873 2093:ldc2w           #203 <Long -1L>
	//  874 2096:invokevirtual   #898 <Method long Bundle.getLong(String, long)>
	//  875 2099:invokestatic    #903 <Method String Long.toString(long)>
	//  876 2102:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("runtime_max", Long.toString(((Bundle) (obj)).getLong("runtime_max_memory", -1L)));
	//  877 2105:aload           20
	//  878 2107:ldc2            #905 <String "runtime_max">
	//  879 2110:aload           11
	//  880 2112:ldc2            #907 <String "runtime_max_memory">
	//  881 2115:ldc2w           #203 <Long -1L>
	//  882 2118:invokevirtual   #898 <Method long Bundle.getLong(String, long)>
	//  883 2121:invokestatic    #903 <Method String Long.toString(long)>
	//  884 2124:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("runtime_total", Long.toString(((Bundle) (obj)).getLong("runtime_total_memory", -1L)));
	//  885 2127:aload           20
	//  886 2129:ldc2            #909 <String "runtime_total">
	//  887 2132:aload           11
	//  888 2134:ldc2            #911 <String "runtime_total_memory">
	//  889 2137:ldc2w           #203 <Long -1L>
	//  890 2140:invokevirtual   #898 <Method long Bundle.getLong(String, long)>
	//  891 2143:invokestatic    #903 <Method String Long.toString(long)>
	//  892 2146:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("web_view_count", Integer.toString(((Bundle) (obj)).getInt("web_view_count", 0)));
	//  893 2149:aload           20
	//  894 2151:ldc2            #913 <String "web_view_count">
	//  895 2154:aload           11
	//  896 2156:ldc2            #913 <String "web_view_count">
	//  897 2159:iconst_0        
	//  898 2160:invokevirtual   #917 <Method int Bundle.getInt(String, int)>
	//  899 2163:invokestatic    #919 <Method String Integer.toString(int)>
	//  900 2166:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		obj = ((Object) ((android.os.Debug.MemoryInfo)((Bundle) (obj)).getParcelable("debug_memory_info")));
	//  901 2169:aload           11
	//  902 2171:ldc2            #921 <String "debug_memory_info">
	//  903 2174:invokevirtual   #925 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//  904 2177:checkcast       #927 <Class android.os.Debug$MemoryInfo>
	//  905 2180:astore          11
		if(obj == null)
			break MISSING_BLOCK_LABEL_2331;
	//  906 2182:aload           11
	//  907 2184:ifnull          2331
		((Bundle) (obj6)).putString("debug_info_dalvik_private_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj)).dalvikPrivateDirty));
	//  908 2187:aload           20
	//  909 2189:ldc2            #929 <String "debug_info_dalvik_private_dirty">
	//  910 2192:aload           11
	//  911 2194:getfield        #932 <Field int android.os.Debug$MemoryInfo.dalvikPrivateDirty>
	//  912 2197:invokestatic    #919 <Method String Integer.toString(int)>
	//  913 2200:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("debug_info_dalvik_pss", Integer.toString(((android.os.Debug.MemoryInfo) (obj)).dalvikPss));
	//  914 2203:aload           20
	//  915 2205:ldc2            #934 <String "debug_info_dalvik_pss">
	//  916 2208:aload           11
	//  917 2210:getfield        #937 <Field int android.os.Debug$MemoryInfo.dalvikPss>
	//  918 2213:invokestatic    #919 <Method String Integer.toString(int)>
	//  919 2216:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("debug_info_dalvik_shared_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj)).dalvikSharedDirty));
	//  920 2219:aload           20
	//  921 2221:ldc2            #939 <String "debug_info_dalvik_shared_dirty">
	//  922 2224:aload           11
	//  923 2226:getfield        #942 <Field int android.os.Debug$MemoryInfo.dalvikSharedDirty>
	//  924 2229:invokestatic    #919 <Method String Integer.toString(int)>
	//  925 2232:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("debug_info_native_private_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj)).nativePrivateDirty));
	//  926 2235:aload           20
	//  927 2237:ldc2            #944 <String "debug_info_native_private_dirty">
	//  928 2240:aload           11
	//  929 2242:getfield        #947 <Field int android.os.Debug$MemoryInfo.nativePrivateDirty>
	//  930 2245:invokestatic    #919 <Method String Integer.toString(int)>
	//  931 2248:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("debug_info_native_pss", Integer.toString(((android.os.Debug.MemoryInfo) (obj)).nativePss));
	//  932 2251:aload           20
	//  933 2253:ldc2            #949 <String "debug_info_native_pss">
	//  934 2256:aload           11
	//  935 2258:getfield        #952 <Field int android.os.Debug$MemoryInfo.nativePss>
	//  936 2261:invokestatic    #919 <Method String Integer.toString(int)>
	//  937 2264:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("debug_info_native_shared_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj)).nativeSharedDirty));
	//  938 2267:aload           20
	//  939 2269:ldc2            #954 <String "debug_info_native_shared_dirty">
	//  940 2272:aload           11
	//  941 2274:getfield        #957 <Field int android.os.Debug$MemoryInfo.nativeSharedDirty>
	//  942 2277:invokestatic    #919 <Method String Integer.toString(int)>
	//  943 2280:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("debug_info_other_private_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj)).otherPrivateDirty));
	//  944 2283:aload           20
	//  945 2285:ldc2            #959 <String "debug_info_other_private_dirty">
	//  946 2288:aload           11
	//  947 2290:getfield        #962 <Field int android.os.Debug$MemoryInfo.otherPrivateDirty>
	//  948 2293:invokestatic    #919 <Method String Integer.toString(int)>
	//  949 2296:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("debug_info_other_pss", Integer.toString(((android.os.Debug.MemoryInfo) (obj)).otherPss));
	//  950 2299:aload           20
	//  951 2301:ldc2            #964 <String "debug_info_other_pss">
	//  952 2304:aload           11
	//  953 2306:getfield        #967 <Field int android.os.Debug$MemoryInfo.otherPss>
	//  954 2309:invokestatic    #919 <Method String Integer.toString(int)>
	//  955 2312:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj6)).putString("debug_info_other_shared_dirty", Integer.toString(((android.os.Debug.MemoryInfo) (obj)).otherSharedDirty));
	//  956 2315:aload           20
	//  957 2317:ldc2            #969 <String "debug_info_other_shared_dirty">
	//  958 2320:aload           11
	//  959 2322:getfield        #972 <Field int android.os.Debug$MemoryInfo.otherSharedDirty>
	//  960 2325:invokestatic    #919 <Method String Integer.toString(int)>
	//  961 2328:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj5)).putBundle("android_mem_info", ((Bundle) (obj6)));
	//  962 2331:aload           19
	//  963 2333:ldc2            #974 <String "android_mem_info">
	//  964 2336:aload           20
	//  965 2338:invokevirtual   #845 <Method void Bundle.putBundle(String, Bundle)>
	//* 966 2341:goto            2344
		obj = obj4;
	//  967 2344:aload           14
	//  968 2346:astore          11
		obj4 = obj2;
	//  969 2348:aload           13
	//  970 2350:astore          14
		k = 0;
	//  971 2352:iconst_0        
	//  972 2353:istore          4
		obj2 = ((Object) (new Bundle()));
	//  973 2355:new             #805 <Class Bundle>
	//  974 2358:dup             
	//  975 2359:invokespecial   #806 <Method void Bundle()>
	//  976 2362:astore          13
		((Bundle) (obj2)).putBundle("parental_controls", ((Bundle) (obj1)));
	//  977 2364:aload           13
	//  978 2366:ldc2            #976 <String "parental_controls">
	//  979 2369:aload           12
	//  980 2371:invokevirtual   #845 <Method void Bundle.putBundle(String, Bundle)>
		if(!TextUtils.isEmpty(((CharSequence) (zzaga1.zzcjv))))
	//* 981 2374:aload           16
	//* 982 2376:getfield        #979 <Field String zzaga.zzcjv>
	//* 983 2379:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 984 2382:ifne            2398
			((Bundle) (obj2)).putString("package_version", zzaga1.zzcjv);
	//  985 2385:aload           13
	//  986 2387:ldc2            #981 <String "package_version">
	//  987 2390:aload           16
	//  988 2392:getfield        #979 <Field String zzaga.zzcjv>
	//  989 2395:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj5)).putBundle("play_store", ((Bundle) (obj2)));
	//  990 2398:aload           19
	//  991 2400:ldc2            #983 <String "play_store">
	//  992 2403:aload           13
	//  993 2405:invokevirtual   #845 <Method void Bundle.putBundle(String, Bundle)>
		hashmap.put("device", obj5);
	//  994 2408:aload           17
	//  995 2410:ldc2            #985 <String "device">
	//  996 2413:aload           19
	//  997 2415:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//  998 2418:pop             
		obj5 = ((Object) (new Bundle()));
	//  999 2419:new             #805 <Class Bundle>
	// 1000 2422:dup             
	// 1001 2423:invokespecial   #806 <Method void Bundle()>
	// 1002 2426:astore          19
		((Bundle) (obj5)).putString("doritos", zzafl1.zzcgp);
	// 1003 2428:aload           19
	// 1004 2430:ldc2            #987 <String "doritos">
	// 1005 2433:aload_1         
	// 1006 2434:getfield        #990 <Field String zzafl.zzcgp>
	// 1007 2437:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj5)).putString("doritos_v2", zzafl1.zzcgq);
	// 1008 2440:aload           19
	// 1009 2442:ldc2            #992 <String "doritos_v2">
	// 1010 2445:aload_1         
	// 1011 2446:getfield        #995 <Field String zzafl.zzcgq>
	// 1012 2449:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		obj1 = ((Object) (zznk.zzayj));
	// 1013 2452:getstatic       #998 <Field zzna zznk.zzayj>
	// 1014 2455:astore          12
		if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj1)))).booleanValue()) goto _L34; else goto _L33
	// 1015 2457:invokestatic    #368 <Method zzni zzkb.zzik()>
	// 1016 2460:aload           12
	// 1017 2462:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	// 1018 2465:checkcast       #456 <Class Boolean>
	// 1019 2468:invokevirtual   #460 <Method boolean Boolean.booleanValue()>
	// 1020 2471:ifeq            2581
_L33:
		if(zzafl1.zzcgr == null) goto _L36; else goto _L35
	// 1021 2474:aload_1         
	// 1022 2475:getfield        #1002 <Field com.google.android.gms.ads.identifier.AdvertisingIdClient$Info zzafl.zzcgr>
	// 1023 2478:ifnull          4114
_L35:
		obj1 = ((Object) (zzafl1.zzcgr.getId()));
	// 1024 2481:aload_1         
	// 1025 2482:getfield        #1002 <Field com.google.android.gms.ads.identifier.AdvertisingIdClient$Info zzafl.zzcgr>
	// 1026 2485:invokevirtual   #1007 <Method String com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.getId()>
	// 1027 2488:astore          12
		flag1 = zzafl1.zzcgr.isLimitAdTrackingEnabled();
	// 1028 2490:aload_1         
	// 1029 2491:getfield        #1002 <Field com.google.android.gms.ads.identifier.AdvertisingIdClient$Info zzafl.zzcgr>
	// 1030 2494:invokevirtual   #1010 <Method boolean com.google.android.gms.ads.identifier.AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	// 1031 2497:istore          8
	//*1032 2499:goto            2502
_L51:
		if(TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L38; else goto _L37
	// 1033 2502:aload           12
	// 1034 2504:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	// 1035 2507:ifne            2552
_L37:
		((Bundle) (obj5)).putString("rdid", ((String) (obj1)));
	// 1036 2510:aload           19
	// 1037 2512:ldc2            #1012 <String "rdid">
	// 1038 2515:aload           12
	// 1039 2517:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj5)).putBoolean("is_lat", flag1);
	// 1040 2520:aload           19
	// 1041 2522:ldc2            #1014 <String "is_lat">
	// 1042 2525:iload           8
	// 1043 2527:invokevirtual   #829 <Method void Bundle.putBoolean(String, boolean)>
		obj1 = "idtype";
	// 1044 2530:ldc2            #1016 <String "idtype">
	// 1045 2533:astore          12
		obj2 = "adid";
	// 1046 2535:ldc2            #1018 <String "adid">
	// 1047 2538:astore          13
		break MISSING_BLOCK_LABEL_2540;
	//*1048 2540:aload           19
	//*1049 2542:aload           12
	//*1050 2544:aload           13
	//*1051 2546:invokevirtual   #815 <Method void Bundle.putString(String, String)>
	//*1052 2549:goto            2581
_L38:
		zzkb.zzif();
	// 1053 2552:invokestatic    #1022 <Method zzamu zzkb.zzif()>
	// 1054 2555:pop             
		((Bundle) (obj5)).putString("pdid", zzamu.zzbd(context));
	// 1055 2556:aload           19
	// 1056 2558:ldc2            #1024 <String "pdid">
	// 1057 2561:aload_0         
	// 1058 2562:invokestatic    #1030 <Method String zzamu.zzbd(Context)>
	// 1059 2565:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		obj1 = "pdidtype";
	// 1060 2568:ldc2            #1032 <String "pdidtype">
	// 1061 2571:astore          12
		obj2 = "ssaid";
	// 1062 2573:ldc2            #1034 <String "ssaid">
	// 1063 2576:astore          13
		if(true) goto _L39; else goto _L34
	// 1064 2578:goto            2540
_L34:
		hashmap.put("pii", obj5);
	// 1065 2581:aload           17
	// 1066 2583:ldc2            #1036 <String "pii">
	// 1067 2586:aload           19
	// 1068 2588:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1069 2591:pop             
		hashmap.put("platform", ((Object) (Build.MANUFACTURER)));
	// 1070 2592:aload           17
	// 1071 2594:ldc2            #1038 <String "platform">
	// 1072 2597:getstatic       #1043 <Field String Build.MANUFACTURER>
	// 1073 2600:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1074 2603:pop             
		hashmap.put("submodel", ((Object) (Build.MODEL)));
	// 1075 2604:aload           17
	// 1076 2606:ldc2            #1045 <String "submodel">
	// 1077 2609:getstatic       #1048 <Field String Build.MODEL>
	// 1078 2612:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1079 2615:pop             
		if(location == null)
			break MISSING_BLOCK_LABEL_2631;
	// 1080 2616:aload           15
	// 1081 2618:ifnull          2631
		zza(hashmap, location);
	// 1082 2621:aload           17
	// 1083 2623:aload           15
	// 1084 2625:invokestatic    #1051 <Method void zza(HashMap, Location)>
		break MISSING_BLOCK_LABEL_2671;
	// 1085 2628:goto            2671
		obj1 = obj;
	// 1086 2631:aload           11
	// 1087 2633:astore          12
		if(((zzaef) (obj1)).zzccv.versionCode >= 2 && ((zzaef) (obj1)).zzccv.zzaqe != null)
	//*1088 2635:aload           12
	//*1089 2637:getfield        #401 <Field zzjj zzaef.zzccv>
	//*1090 2640:getfield        #468 <Field int zzjj.versionCode>
	//*1091 2643:iconst_2        
	//*1092 2644:icmplt          2671
	//*1093 2647:aload           12
	//*1094 2649:getfield        #401 <Field zzjj zzaef.zzccv>
	//*1095 2652:getfield        #1052 <Field Location zzjj.zzaqe>
	//*1096 2655:ifnull          2671
			zza(hashmap, ((zzaef) (obj1)).zzccv.zzaqe);
	// 1097 2658:aload           17
	// 1098 2660:aload           12
	// 1099 2662:getfield        #401 <Field zzjj zzaef.zzccv>
	// 1100 2665:getfield        #1052 <Field Location zzjj.zzaqe>
	// 1101 2668:invokestatic    #1051 <Method void zza(HashMap, Location)>
		obj1 = obj;
	// 1102 2671:aload           11
	// 1103 2673:astore          12
		if(((zzaef) (obj1)).versionCode >= 2)
	//*1104 2675:aload           12
	//*1105 2677:getfield        #599 <Field int zzaef.versionCode>
	//*1106 2680:iconst_2        
	//*1107 2681:icmplt          2698
			hashmap.put("quality_signals", ((Object) (((zzaef) (obj1)).zzcda)));
	// 1108 2684:aload           17
	// 1109 2686:ldc2            #1054 <String "quality_signals">
	// 1110 2689:aload           12
	// 1111 2691:getfield        #1057 <Field Bundle zzaef.zzcda>
	// 1112 2694:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1113 2697:pop             
		if(((zzaef) (obj1)).versionCode >= 4 && ((zzaef) (obj1)).zzcdd)
	//*1114 2698:aload           12
	//*1115 2700:getfield        #599 <Field int zzaef.versionCode>
	//*1116 2703:iconst_4        
	//*1117 2704:icmplt          2732
	//*1118 2707:aload           12
	//*1119 2709:getfield        #276 <Field boolean zzaef.zzcdd>
	//*1120 2712:ifeq            2732
			hashmap.put("forceHttps", ((Object) (Boolean.valueOf(((zzaef) (obj1)).zzcdd))));
	// 1121 2715:aload           17
	// 1122 2717:ldc2            #1059 <String "forceHttps">
	// 1123 2720:aload           12
	// 1124 2722:getfield        #276 <Field boolean zzaef.zzcdd>
	// 1125 2725:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	// 1126 2728:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1127 2731:pop             
		if(obj4 == null)
			break MISSING_BLOCK_LABEL_2748;
	// 1128 2732:aload           14
	// 1129 2734:ifnull          2748
		hashmap.put("content_info", obj4);
	// 1130 2737:aload           17
	// 1131 2739:ldc2            #1061 <String "content_info">
	// 1132 2742:aload           14
	// 1133 2744:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1134 2747:pop             
		if(((zzaef) (obj1)).versionCode >= 5)
	//*1135 2748:aload           12
	//*1136 2750:getfield        #599 <Field int zzaef.versionCode>
	//*1137 2753:iconst_5        
	//*1138 2754:icmplt          2811
		{
			hashmap.put("u_sd", ((Object) (Float.valueOf(((zzaef) (obj1)).zzagu))));
	// 1139 2757:aload           17
	// 1140 2759:ldc2            #1063 <String "u_sd">
	// 1141 2762:aload           12
	// 1142 2764:getfield        #1064 <Field float zzaef.zzagu>
	// 1143 2767:invokestatic    #1069 <Method Float Float.valueOf(float)>
	// 1144 2770:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1145 2773:pop             
			hashmap.put("sh", ((Object) (Integer.valueOf(((zzaef) (obj1)).zzcdf))));
	// 1146 2774:aload           17
	// 1147 2776:ldc2            #1071 <String "sh">
	// 1148 2779:aload           12
	// 1149 2781:getfield        #1074 <Field int zzaef.zzcdf>
	// 1150 2784:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	// 1151 2787:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1152 2790:pop             
			hashmap.put("sw", ((Object) (Integer.valueOf(((zzaef) (obj1)).zzcde))));
	// 1153 2791:aload           17
	// 1154 2793:ldc2            #1076 <String "sw">
	// 1155 2796:aload           12
	// 1156 2798:getfield        #1079 <Field int zzaef.zzcde>
	// 1157 2801:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	// 1158 2804:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1159 2807:pop             
			break MISSING_BLOCK_LABEL_2862;
	// 1160 2808:goto            2862
		}
		hashmap.put("u_sd", ((Object) (Float.valueOf(zzaga1.zzagu))));
	// 1161 2811:aload           17
	// 1162 2813:ldc2            #1063 <String "u_sd">
	// 1163 2816:aload           16
	// 1164 2818:getfield        #557 <Field float zzaga.zzagu>
	// 1165 2821:invokestatic    #1069 <Method Float Float.valueOf(float)>
	// 1166 2824:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1167 2827:pop             
		hashmap.put("sh", ((Object) (Integer.valueOf(zzaga1.zzcdf))));
	// 1168 2828:aload           17
	// 1169 2830:ldc2            #1071 <String "sh">
	// 1170 2833:aload           16
	// 1171 2835:getfield        #1080 <Field int zzaga.zzcdf>
	// 1172 2838:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	// 1173 2841:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1174 2844:pop             
		hashmap.put("sw", ((Object) (Integer.valueOf(zzaga1.zzcde))));
	// 1175 2845:aload           17
	// 1176 2847:ldc2            #1076 <String "sw">
	// 1177 2850:aload           16
	// 1178 2852:getfield        #1081 <Field int zzaga.zzcde>
	// 1179 2855:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	// 1180 2858:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1181 2861:pop             
		if(((zzaef) (obj1)).versionCode < 6)
			break MISSING_BLOCK_LABEL_2938;
	// 1182 2862:aload           12
	// 1183 2864:getfield        #599 <Field int zzaef.versionCode>
	// 1184 2867:bipush          6
	// 1185 2869:icmplt          2938
		flag1 = TextUtils.isEmpty(((CharSequence) (((zzaef) (obj1)).zzcdg)));
	// 1186 2872:aload           12
	// 1187 2874:getfield        #1084 <Field String zzaef.zzcdg>
	// 1188 2877:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	// 1189 2880:istore          8
		if(flag1)
			break MISSING_BLOCK_LABEL_2921;
	// 1190 2882:iload           8
	// 1191 2884:ifne            2921
		try
		{
			hashmap.put("view_hierarchy", ((Object) (new JSONObject(((zzaef) (obj1)).zzcdg))));
	// 1192 2887:aload           17
	// 1193 2889:ldc2            #1086 <String "view_hierarchy">
	// 1194 2892:new             #32  <Class JSONObject>
	// 1195 2895:dup             
	// 1196 2896:aload           12
	// 1197 2898:getfield        #1084 <Field String zzaef.zzcdg>
	// 1198 2901:invokespecial   #35  <Method void JSONObject(String)>
	// 1199 2904:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1200 2907:pop             
			break MISSING_BLOCK_LABEL_2921;
	// 1201 2908:goto            2921
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	// 1202 2911:astore          11
		zzakb.zzc("Problem serializing view hierarchy to JSON", ((Throwable) (obj)));
	// 1203 2913:ldc2            #1088 <String "Problem serializing view hierarchy to JSON">
	// 1204 2916:aload           11
	// 1205 2918:invokestatic    #616 <Method void zzakb.zzc(String, Throwable)>
		hashmap.put("correlation_id", ((Object) (Long.valueOf(((zzaef) (obj1)).zzcdh))));
	// 1206 2921:aload           17
	// 1207 2923:ldc2            #1090 <String "correlation_id">
	// 1208 2926:aload           12
	// 1209 2928:getfield        #1093 <Field long zzaef.zzcdh>
	// 1210 2931:invokestatic    #1096 <Method Long Long.valueOf(long)>
	// 1211 2934:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1212 2937:pop             
		if(((zzaef) (obj1)).versionCode >= 7)
	//*1213 2938:aload           12
	//*1214 2940:getfield        #599 <Field int zzaef.versionCode>
	//*1215 2943:bipush          7
	//*1216 2945:icmplt          2962
			hashmap.put("request_id", ((Object) (((zzaef) (obj1)).zzcdi)));
	// 1217 2948:aload           17
	// 1218 2950:ldc2            #1098 <String "request_id">
	// 1219 2953:aload           12
	// 1220 2955:getfield        #1101 <Field String zzaef.zzcdi>
	// 1221 2958:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1222 2961:pop             
		if(((zzaef) (obj1)).versionCode >= 12 && !TextUtils.isEmpty(((CharSequence) (((zzaef) (obj1)).zzcdm))))
	//*1223 2962:aload           12
	//*1224 2964:getfield        #599 <Field int zzaef.versionCode>
	//*1225 2967:bipush          12
	//*1226 2969:icmplt          2997
	//*1227 2972:aload           12
	//*1228 2974:getfield        #1104 <Field String zzaef.zzcdm>
	//*1229 2977:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*1230 2980:ifne            2997
			hashmap.put("anchor", ((Object) (((zzaef) (obj1)).zzcdm)));
	// 1231 2983:aload           17
	// 1232 2985:ldc2            #1106 <String "anchor">
	// 1233 2988:aload           12
	// 1234 2990:getfield        #1104 <Field String zzaef.zzcdm>
	// 1235 2993:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1236 2996:pop             
		if(((zzaef) (obj1)).versionCode >= 13)
	//*1237 2997:aload           12
	//*1238 2999:getfield        #599 <Field int zzaef.versionCode>
	//*1239 3002:bipush          13
	//*1240 3004:icmplt          3024
			hashmap.put("android_app_volume", ((Object) (Float.valueOf(((zzaef) (obj1)).zzcdn))));
	// 1241 3007:aload           17
	// 1242 3009:ldc2            #1108 <String "android_app_volume">
	// 1243 3012:aload           12
	// 1244 3014:getfield        #1111 <Field float zzaef.zzcdn>
	// 1245 3017:invokestatic    #1069 <Method Float Float.valueOf(float)>
	// 1246 3020:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1247 3023:pop             
		if(((zzaef) (obj1)).versionCode >= 18)
	//*1248 3024:aload           12
	//*1249 3026:getfield        #599 <Field int zzaef.versionCode>
	//*1250 3029:bipush          18
	//*1251 3031:icmplt          3051
			hashmap.put("android_app_muted", ((Object) (Boolean.valueOf(((zzaef) (obj1)).zzcdt))));
	// 1252 3034:aload           17
	// 1253 3036:ldc2            #1113 <String "android_app_muted">
	// 1254 3039:aload           12
	// 1255 3041:getfield        #1116 <Field boolean zzaef.zzcdt>
	// 1256 3044:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	// 1257 3047:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1258 3050:pop             
		if(((zzaef) (obj1)).versionCode >= 14 && ((zzaef) (obj1)).zzcdo > 0)
	//*1259 3051:aload           12
	//*1260 3053:getfield        #599 <Field int zzaef.versionCode>
	//*1261 3056:bipush          14
	//*1262 3058:icmplt          3086
	//*1263 3061:aload           12
	//*1264 3063:getfield        #1119 <Field int zzaef.zzcdo>
	//*1265 3066:ifle            3086
			hashmap.put("target_api", ((Object) (Integer.valueOf(((zzaef) (obj1)).zzcdo))));
	// 1266 3069:aload           17
	// 1267 3071:ldc2            #1121 <String "target_api">
	// 1268 3074:aload           12
	// 1269 3076:getfield        #1119 <Field int zzaef.zzcdo>
	// 1270 3079:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	// 1271 3082:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1272 3085:pop             
		if(((zzaef) (obj1)).versionCode < 15)
			break MISSING_BLOCK_LABEL_3131;
	// 1273 3086:aload           12
	// 1274 3088:getfield        #599 <Field int zzaef.versionCode>
	// 1275 3091:bipush          15
	// 1276 3093:icmplt          3131
		j = ((zzaef) (obj1)).zzcdp;
	// 1277 3096:aload           12
	// 1278 3098:getfield        #1124 <Field int zzaef.zzcdp>
	// 1279 3101:istore_3        
		i = -1;
	// 1280 3102:iconst_m1       
	// 1281 3103:istore_2        
		if(j == -1)
	//*1282 3104:iload_3         
	//*1283 3105:iconst_m1       
	//*1284 3106:icmpne          3112
			break MISSING_BLOCK_LABEL_3118;
	// 1285 3109:goto            3118
		i = ((zzaef) (obj1)).zzcdp;
	// 1286 3112:aload           12
	// 1287 3114:getfield        #1124 <Field int zzaef.zzcdp>
	// 1288 3117:istore_2        
		hashmap.put("scroll_index", ((Object) (Integer.valueOf(i))));
	// 1289 3118:aload           17
	// 1290 3120:ldc2            #1126 <String "scroll_index">
	// 1291 3123:iload_2         
	// 1292 3124:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	// 1293 3127:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1294 3130:pop             
		if(((zzaef) (obj1)).versionCode >= 16)
	//*1295 3131:aload           12
	//*1296 3133:getfield        #599 <Field int zzaef.versionCode>
	//*1297 3136:bipush          16
	//*1298 3138:icmplt          3158
			hashmap.put("_activity_context", ((Object) (Boolean.valueOf(((zzaef) (obj1)).zzcdq))));
	// 1299 3141:aload           17
	// 1300 3143:ldc2            #1128 <String "_activity_context">
	// 1301 3146:aload           12
	// 1302 3148:getfield        #1131 <Field boolean zzaef.zzcdq>
	// 1303 3151:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	// 1304 3154:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1305 3157:pop             
		if(((zzaef) (obj1)).versionCode < 18)
			break MISSING_BLOCK_LABEL_3234;
	// 1306 3158:aload           12
	// 1307 3160:getfield        #599 <Field int zzaef.versionCode>
	// 1308 3163:bipush          18
	// 1309 3165:icmplt          3234
		flag1 = TextUtils.isEmpty(((CharSequence) (((zzaef) (obj1)).zzcdu)));
	// 1310 3168:aload           12
	// 1311 3170:getfield        #1134 <Field String zzaef.zzcdu>
	// 1312 3173:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	// 1313 3176:istore          8
		if(flag1)
			break MISSING_BLOCK_LABEL_3217;
	// 1314 3178:iload           8
	// 1315 3180:ifne            3217
		try
		{
			hashmap.put("app_settings", ((Object) (new JSONObject(((zzaef) (obj1)).zzcdu))));
	// 1316 3183:aload           17
	// 1317 3185:ldc2            #1136 <String "app_settings">
	// 1318 3188:new             #32  <Class JSONObject>
	// 1319 3191:dup             
	// 1320 3192:aload           12
	// 1321 3194:getfield        #1134 <Field String zzaef.zzcdu>
	// 1322 3197:invokespecial   #35  <Method void JSONObject(String)>
	// 1323 3200:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1324 3203:pop             
			break MISSING_BLOCK_LABEL_3217;
	// 1325 3204:goto            3217
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
	// 1326 3207:astore          11
		zzakb.zzc("Problem creating json from app settings", ((Throwable) (obj)));
	// 1327 3209:ldc2            #1138 <String "Problem creating json from app settings">
	// 1328 3212:aload           11
	// 1329 3214:invokestatic    #616 <Method void zzakb.zzc(String, Throwable)>
		hashmap.put("render_in_browser", ((Object) (Boolean.valueOf(((zzaef) (obj1)).zzbss))));
	// 1330 3217:aload           17
	// 1331 3219:ldc2            #259 <String "render_in_browser">
	// 1332 3222:aload           12
	// 1333 3224:getfield        #263 <Field boolean zzaef.zzbss>
	// 1334 3227:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	// 1335 3230:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1336 3233:pop             
		if(((zzaef) (obj1)).versionCode >= 18)
	//*1337 3234:aload           12
	//*1338 3236:getfield        #599 <Field int zzaef.versionCode>
	//*1339 3239:bipush          18
	//*1340 3241:icmplt          3261
			hashmap.put("android_num_video_cache_tasks", ((Object) (Integer.valueOf(((zzaef) (obj1)).zzcdv))));
	// 1341 3244:aload           17
	// 1342 3246:ldc2            #1140 <String "android_num_video_cache_tasks">
	// 1343 3249:aload           12
	// 1344 3251:getfield        #1143 <Field int zzaef.zzcdv>
	// 1345 3254:invokestatic    #438 <Method Integer Integer.valueOf(int)>
	// 1346 3257:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1347 3260:pop             
		obj = ((Object) (((zzaef) (obj1)).zzacr));
	// 1348 3261:aload           12
	// 1349 3263:getfield        #118 <Field zzang zzaef.zzacr>
	// 1350 3266:astore          11
		flag1 = ((zzaef) (obj1)).zzceh;
	// 1351 3268:aload           12
	// 1352 3270:getfield        #1146 <Field boolean zzaef.zzceh>
	// 1353 3273:istore          8
		boolean flag2 = zzafl1.zzcgv;
	// 1354 3275:aload_1         
	// 1355 3276:getfield        #1149 <Field boolean zzafl.zzcgv>
	// 1356 3279:istore          9
		boolean flag3 = ((zzaef) (obj1)).zzcej;
	// 1357 3281:aload           12
	// 1358 3283:getfield        #1152 <Field boolean zzaef.zzcej>
	// 1359 3286:istore          10
		zzafl1 = ((zzafl) (new Bundle()));
	// 1360 3288:new             #805 <Class Bundle>
	// 1361 3291:dup             
	// 1362 3292:invokespecial   #806 <Method void Bundle()>
	// 1363 3295:astore_1        
		Object obj3 = ((Object) (new Bundle()));
	// 1364 3296:new             #805 <Class Bundle>
	// 1365 3299:dup             
	// 1366 3300:invokespecial   #806 <Method void Bundle()>
	// 1367 3303:astore          13
		((Bundle) (obj3)).putString("cl", "193400285");
	// 1368 3305:aload           13
	// 1369 3307:ldc2            #1154 <String "cl">
	// 1370 3310:ldc2            #1156 <String "193400285">
	// 1371 3313:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj3)).putString("rapid_rc", "dev");
	// 1372 3316:aload           13
	// 1373 3318:ldc2            #1158 <String "rapid_rc">
	// 1374 3321:ldc2            #1160 <String "dev">
	// 1375 3324:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (obj3)).putString("rapid_rollup", "HEAD");
	// 1376 3327:aload           13
	// 1377 3329:ldc2            #1162 <String "rapid_rollup">
	// 1378 3332:ldc2            #1164 <String "HEAD">
	// 1379 3335:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (zzafl1)).putBundle("build_meta", ((Bundle) (obj3)));
	// 1380 3338:aload_1         
	// 1381 3339:ldc2            #1166 <String "build_meta">
	// 1382 3342:aload           13
	// 1383 3344:invokevirtual   #845 <Method void Bundle.putBundle(String, Bundle)>
		obj3 = ((Object) (zznk.zzbbm));
	// 1384 3347:getstatic       #1169 <Field zzna zznk.zzbbm>
	// 1385 3350:astore          13
		((Bundle) (zzafl1)).putString("mf", Boolean.toString(((Boolean)zzkb.zzik().zzd(((zzna) (obj3)))).booleanValue()));
	// 1386 3352:aload_1         
	// 1387 3353:ldc2            #1171 <String "mf">
	// 1388 3356:invokestatic    #368 <Method zzni zzkb.zzik()>
	// 1389 3359:aload           13
	// 1390 3361:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	// 1391 3364:checkcast       #456 <Class Boolean>
	// 1392 3367:invokevirtual   #460 <Method boolean Boolean.booleanValue()>
	// 1393 3370:invokestatic    #1174 <Method String Boolean.toString(boolean)>
	// 1394 3373:invokevirtual   #815 <Method void Bundle.putString(String, String)>
		((Bundle) (zzafl1)).putBoolean("instant_app", flag1);
	// 1395 3376:aload_1         
	// 1396 3377:ldc2            #1176 <String "instant_app">
	// 1397 3380:iload           8
	// 1398 3382:invokevirtual   #829 <Method void Bundle.putBoolean(String, boolean)>
		((Bundle) (zzafl1)).putBoolean("lite", ((zzang) (obj)).zzcvh);
	// 1399 3385:aload_1         
	// 1400 3386:ldc2            #1178 <String "lite">
	// 1401 3389:aload           11
	// 1402 3391:getfield        #1181 <Field boolean zzang.zzcvh>
	// 1403 3394:invokevirtual   #829 <Method void Bundle.putBoolean(String, boolean)>
		((Bundle) (zzafl1)).putBoolean("local_service", flag2);
	// 1404 3397:aload_1         
	// 1405 3398:ldc2            #1183 <String "local_service">
	// 1406 3401:iload           9
	// 1407 3403:invokevirtual   #829 <Method void Bundle.putBoolean(String, boolean)>
		((Bundle) (zzafl1)).putBoolean("is_privileged_process", flag3);
	// 1408 3406:aload_1         
	// 1409 3407:ldc2            #1185 <String "is_privileged_process">
	// 1410 3410:iload           10
	// 1411 3412:invokevirtual   #829 <Method void Bundle.putBoolean(String, boolean)>
		hashmap.put("sdk_env", ((Object) (zzafl1)));
	// 1412 3415:aload           17
	// 1413 3417:ldc2            #1187 <String "sdk_env">
	// 1414 3420:aload_1         
	// 1415 3421:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1416 3424:pop             
		hashmap.put("cache_state", ((Object) (jsonobject)));
	// 1417 3425:aload           17
	// 1418 3427:ldc2            #1189 <String "cache_state">
	// 1419 3430:aload           18
	// 1420 3432:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1421 3435:pop             
		if(((zzaef) (obj1)).versionCode >= 19)
	//*1422 3436:aload           12
	//*1423 3438:getfield        #599 <Field int zzaef.versionCode>
	//*1424 3441:bipush          19
	//*1425 3443:icmplt          3460
			hashmap.put("gct", ((Object) (((zzaef) (obj1)).zzcdx)));
	// 1426 3446:aload           17
	// 1427 3448:ldc2            #1191 <String "gct">
	// 1428 3451:aload           12
	// 1429 3453:getfield        #1194 <Field String zzaef.zzcdx>
	// 1430 3456:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1431 3459:pop             
		if(((zzaef) (obj1)).versionCode >= 21 && ((zzaef) (obj1)).zzcdy)
	//*1432 3460:aload           12
	//*1433 3462:getfield        #599 <Field int zzaef.versionCode>
	//*1434 3465:bipush          21
	//*1435 3467:icmplt          3490
	//*1436 3470:aload           12
	//*1437 3472:getfield        #1197 <Field boolean zzaef.zzcdy>
	//*1438 3475:ifeq            3490
			hashmap.put("de", "1");
	// 1439 3478:aload           17
	// 1440 3480:ldc2            #1199 <String "de">
	// 1441 3483:ldc2            #1201 <String "1">
	// 1442 3486:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	// 1443 3489:pop             
		zzafl1 = ((zzafl) (zznk.zzayy));
	// 1444 3490:getstatic       #1204 <Field zzna zznk.zzayy>
	// 1445 3493:astore_1        
		if(!((Boolean)zzkb.zzik().zzd(((zzna) (zzafl1)))).booleanValue())
			break MISSING_BLOCK_LABEL_3594;
	// 1446 3494:invokestatic    #368 <Method zzni zzkb.zzik()>
	// 1447 3497:aload_1         
	// 1448 3498:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	// 1449 3501:checkcast       #456 <Class Boolean>
	// 1450 3504:invokevirtual   #460 <Method boolean Boolean.booleanValue()>
	// 1451 3507:ifeq            3594
		zzafl1 = ((zzafl) (((zzaef) (obj1)).zzacv.zzarb));
	// 1452 3510:aload           12
	// 1453 3512:getfield        #512 <Field zzjn zzaef.zzacv>
	// 1454 3515:getfield        #522 <Field String zzjn.zzarb>
	// 1455 3518:astore_1        
		if(!((String) (zzafl1)).equals("interstitial_mb") && !((String) (zzafl1)).equals("reward_mb"))
	//*1456 3519:aload_1         
	//*1457 3520:ldc2            #1206 <String "interstitial_mb">
	//*1458 3523:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*1459 3526:ifne            4128
	//*1460 3529:aload_1         
	//*1461 3530:ldc2            #1208 <String "reward_mb">
	//*1462 3533:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*1463 3536:ifeq            4123
	//*1464 3539:goto            4128
	//*1465 3542:aload           12
	//*1466 3544:getfield        #1211 <Field Bundle zzaef.zzcdz>
	//*1467 3547:astore_1        
	//*1468 3548:aload_1         
	//*1469 3549:ifnull          4133
	//*1470 3552:iconst_1        
	//*1471 3553:istore_3        
	//*1472 3554:goto            3557
	//*1473 3557:iload_2         
	//*1474 3558:ifeq            3594
	//*1475 3561:iload_3         
	//*1476 3562:ifeq            3594
	//*1477 3565:new             #805 <Class Bundle>
	//*1478 3568:dup             
	//*1479 3569:invokespecial   #806 <Method void Bundle()>
	//*1480 3572:astore          11
	//*1481 3574:aload           11
	//*1482 3576:ldc2            #1213 <String "interstitial_pool">
	//*1483 3579:aload_1         
	//*1484 3580:invokevirtual   #845 <Method void Bundle.putBundle(String, Bundle)>
	//*1485 3583:aload           17
	//*1486 3585:ldc2            #1215 <String "counters">
	//*1487 3588:aload           11
	//*1488 3590:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//*1489 3593:pop             
	//*1490 3594:aload           12
	//*1491 3596:getfield        #1218 <Field String zzaef.zzcea>
	//*1492 3599:ifnull          3616
	//*1493 3602:aload           17
	//*1494 3604:ldc2            #1220 <String "gmp_app_id">
	//*1495 3607:aload           12
	//*1496 3609:getfield        #1218 <Field String zzaef.zzcea>
	//*1497 3612:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//*1498 3615:pop             
	//*1499 3616:aload           12
	//*1500 3618:getfield        #1223 <Field String zzaef.zzceb>
	//*1501 3621:ifnull          4138
	//*1502 3624:ldc2            #1225 <String "TIME_OUT">
	//*1503 3627:aload           12
	//*1504 3629:getfield        #1223 <Field String zzaef.zzceb>
	//*1505 3632:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*1506 3635:ifeq            3669
	//*1507 3638:ldc2            #1227 <String "sai_timeout">
	//*1508 3641:astore_1        
	//*1509 3642:getstatic       #1230 <Field zzna zznk.zzaxt>
	//*1510 3645:astore          11
	//*1511 3647:invokestatic    #368 <Method zzni zzkb.zzik()>
	//*1512 3650:aload           11
	//*1513 3652:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	//*1514 3655:astore          11
	//*1515 3657:aload           17
	//*1516 3659:aload_1         
	//*1517 3660:aload           11
	//*1518 3662:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//*1519 3665:pop             
	//*1520 3666:goto            3683
	//*1521 3669:ldc2            #1232 <String "fbs_aiid">
	//*1522 3672:astore_1        
	//*1523 3673:aload           12
	//*1524 3675:getfield        #1223 <Field String zzaef.zzceb>
	//*1525 3678:astore          11
	//*1526 3680:goto            3657
	//*1527 3683:aload           12
	//*1528 3685:getfield        #1235 <Field String zzaef.zzcec>
	//*1529 3688:ifnull          3705
	//*1530 3691:aload           17
	//*1531 3693:ldc2            #1237 <String "fbs_aeid">
	//*1532 3696:aload           12
	//*1533 3698:getfield        #1235 <Field String zzaef.zzcec>
	//*1534 3701:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//*1535 3704:pop             
	//*1536 3705:aload           12
	//*1537 3707:getfield        #599 <Field int zzaef.versionCode>
	//*1538 3710:bipush          24
	//*1539 3712:icmplt          3732
	//*1540 3715:aload           17
	//*1541 3717:ldc2            #1239 <String "disable_ml">
	//*1542 3720:aload           12
	//*1543 3722:getfield        #1242 <Field boolean zzaef.zzcei>
	//*1544 3725:invokestatic    #465 <Method Boolean Boolean.valueOf(boolean)>
	//*1545 3728:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//*1546 3731:pop             
	//*1547 3732:getstatic       #1245 <Field zzna zznk.zzavo>
	//*1548 3735:astore_1        
	//*1549 3736:invokestatic    #368 <Method zzni zzkb.zzik()>
	//*1550 3739:aload_1         
	//*1551 3740:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	//*1552 3743:checkcast       #87  <Class String>
	//*1553 3746:astore          11
	//*1554 3748:aload           11
	//*1555 3750:ifnull          3851
	//*1556 3753:aload           11
	//*1557 3755:invokevirtual   #1246 <Method boolean String.isEmpty()>
	//*1558 3758:ifne            3851
	//*1559 3761:getstatic       #1251 <Field int android.os.Build$VERSION.SDK_INT>
	//*1560 3764:istore_2        
	//*1561 3765:getstatic       #1254 <Field zzna zznk.zzavp>
	//*1562 3768:astore_1        
	//*1563 3769:iload_2         
	//*1564 3770:invokestatic    #368 <Method zzni zzkb.zzik()>
	//*1565 3773:aload_1         
	//*1566 3774:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	//*1567 3777:checkcast       #435 <Class Integer>
	//*1568 3780:invokevirtual   #635 <Method int Integer.intValue()>
	//*1569 3783:icmplt          3851
	//*1570 3786:new             #353 <Class HashMap>
	//*1571 3789:dup             
	//*1572 3790:invokespecial   #354 <Method void HashMap()>
	//*1573 3793:astore_1        
	//*1574 3794:aload           11
	//*1575 3796:ldc2            #388 <String ",">
	//*1576 3799:invokevirtual   #1258 <Method String[] String.split(String)>
	//*1577 3802:astore          11
	//*1578 3804:aload           11
	//*1579 3806:arraylength     
	//*1580 3807:istore_3        
	//*1581 3808:iload           4
	//*1582 3810:istore_2        
	//*1583 3811:iload_2         
	//*1584 3812:iload_3         
	//*1585 3813:icmpge          3841
	//*1586 3816:aload           11
	//*1587 3818:iload_2         
	//*1588 3819:aaload          
	//*1589 3820:astore          13
	//*1590 3822:aload_1         
	//*1591 3823:aload           13
	//*1592 3825:aload           13
	//*1593 3827:invokestatic    #1264 <Method List zzams.zzdd(String)>
	//*1594 3830:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//*1595 3833:pop             
	//*1596 3834:iload_2         
	//*1597 3835:iconst_1        
	//*1598 3836:iadd            
	//*1599 3837:istore_2        
	//*1600 3838:goto            3811
	//*1601 3841:aload           17
	//*1602 3843:ldc2            #1266 <String "video_decoders">
	//*1603 3846:aload_1         
	//*1604 3847:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//*1605 3850:pop             
	//*1606 3851:getstatic       #1269 <Field zzna zznk.zzbet>
	//*1607 3854:astore_1        
	//*1608 3855:invokestatic    #368 <Method zzni zzkb.zzik()>
	//*1609 3858:aload_1         
	//*1610 3859:invokevirtual   #374 <Method Object zzni.zzd(zzna)>
	//*1611 3862:checkcast       #456 <Class Boolean>
	//*1612 3865:invokevirtual   #460 <Method boolean Boolean.booleanValue()>
	//*1613 3868:ifeq            3887
	//*1614 3871:aload           17
	//*1615 3873:ldc2            #1271 <String "omid_v">
	//*1616 3876:invokestatic    #1275 <Method zzaan zzbv.zzfa()>
	//*1617 3879:aload_0         
	//*1618 3880:invokevirtual   #1280 <Method String zzaan.getVersion(Context)>
	//*1619 3883:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//*1620 3886:pop             
	//*1621 3887:aload           12
	//*1622 3889:getfield        #1284 <Field ArrayList zzaef.zzcek>
	//*1623 3892:ifnull          3920
	//*1624 3895:aload           12
	//*1625 3897:getfield        #1284 <Field ArrayList zzaef.zzcek>
	//*1626 3900:invokevirtual   #1285 <Method boolean ArrayList.isEmpty()>
	//*1627 3903:ifne            3920
	//*1628 3906:aload           17
	//*1629 3908:ldc2            #1287 <String "android_permissions">
	//*1630 3911:aload           12
	//*1631 3913:getfield        #1284 <Field ArrayList zzaef.zzcek>
	//*1632 3916:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//*1633 3919:pop             
	//*1634 3920:iconst_2        
	//*1635 3921:invokestatic    #1291 <Method boolean zzakb.isLoggable(int)>
	//*1636 3924:ifeq            3976
	//*1637 3927:invokestatic    #1295 <Method zzakk zzbv.zzek()>
	//*1638 3930:aload           17
	//*1639 3932:invokevirtual   #1301 <Method JSONObject zzakk.zzn(java.util.Map)>
	//*1640 3935:iconst_2        
	//*1641 3936:invokevirtual   #1302 <Method String JSONObject.toString(int)>
	//*1642 3939:invokestatic    #292 <Method String String.valueOf(Object)>
	//*1643 3942:astore_0        
	//*1644 3943:aload_0         
	//*1645 3944:invokevirtual   #295 <Method int String.length()>
	//*1646 3947:ifeq            3961
	//*1647 3950:ldc2            #1304 <String "Ad Request JSON: ">
	//*1648 3953:aload_0         
	//*1649 3954:invokevirtual   #300 <Method String String.concat(String)>
	//*1650 3957:astore_0        
	//*1651 3958:goto            3972
	//*1652 3961:new             #87  <Class String>
	//*1653 3964:dup             
	//*1654 3965:ldc2            #1304 <String "Ad Request JSON: ">
	//*1655 3968:invokespecial   #301 <Method void String(String)>
	//*1656 3971:astore_0        
	//*1657 3972:aload_0         
	//*1658 3973:invokestatic    #1307 <Method void zzakb.v(String)>
	//*1659 3976:invokestatic    #1295 <Method zzakk zzbv.zzek()>
	//*1660 3979:aload           17
	//*1661 3981:invokevirtual   #1301 <Method JSONObject zzakk.zzn(java.util.Map)>
	//*1662 3984:astore_0        
	//*1663 3985:aload_0         
	//*1664 3986:areturn         
	//*1665 3987:astore_0        
	//*1666 3988:aload_0         
	//*1667 3989:invokevirtual   #288 <Method String JSONException.getMessage()>
	//*1668 3992:invokestatic    #292 <Method String String.valueOf(Object)>
	//*1669 3995:astore_0        
	//*1670 3996:aload_0         
	//*1671 3997:invokevirtual   #295 <Method int String.length()>
	//*1672 4000:ifeq            4014
	//*1673 4003:ldc2            #1309 <String "Problem serializing ad request to JSON: ">
	//*1674 4006:aload_0         
	//*1675 4007:invokevirtual   #300 <Method String String.concat(String)>
	//*1676 4010:astore_0        
	//*1677 4011:goto            4025
	//*1678 4014:new             #87  <Class String>
	//*1679 4017:dup             
	//*1680 4018:ldc2            #1309 <String "Problem serializing ad request to JSON: ">
	//*1681 4021:invokespecial   #301 <Method void String(String)>
	//*1682 4024:astore_0        
	//*1683 4025:aload_0         
	//*1684 4026:invokestatic    #306 <Method void zzakb.zzdk(String)>
	//*1685 4029:aconst_null     
	//*1686 4030:areturn         
	//*1687 4031:ldc2            #1311 <String "adtest">
	//*1688 4034:astore          11
	//*1689 4036:ldc2            #1313 <String "on">
	//*1690 4039:astore          12
	//*1691 4041:goto            318
	//*1692 4044:iload           4
	//*1693 4046:ifeq            4054
	//*1694 4049:iload           6
	//*1695 4051:ifne            709
	//*1696 4054:iload_3         
	//*1697 4055:iconst_1        
	//*1698 4056:iadd            
	//*1699 4057:istore_3        
	//*1700 4058:iload           4
	//*1701 4060:istore          5
	//*1702 4062:iload           6
	//*1703 4064:istore_2        
	//*1704 4065:goto            625
	//*1705 4068:iload_2         
	//*1706 4069:iconst_1        
	//*1707 4070:iadd            
	//*1708 4071:istore_2        
	//*1709 4072:goto            797
	//*1710 4075:goto            961
	//*1711 4078:ldc2            #1315 <String "any">
	//*1712 4081:astore          11
	//*1713 4083:goto            1068
	//*1714 4086:ldc2            #1317 <String "not_set">
	//*1715 4089:astore          11
	//*1716 4091:goto            1068
	//*1717 4094:ldc1            #105 <String "landscape">
	//*1718 4096:astore          11
	//*1719 4098:goto            1068
	//*1720 4101:ldc1            #85  <String "portrait">
	//*1721 4103:astore          11
	//*1722 4105:goto            1068
	//*1723 4108:goto            1664
	//*1724 4111:goto            2344
	//*1725 4114:iconst_0        
	//*1726 4115:istore          8
	//*1727 4117:aconst_null     
	//*1728 4118:astore          12
	//*1729 4120:goto            2502
			i = 0;
	// 1730 4123:iconst_0        
	// 1731 4124:istore_2        
		else
	//*1732 4125:goto            3542
			i = 1;
	// 1733 4128:iconst_1        
	// 1734 4129:istore_2        
		zzafl1 = ((zzafl) (((zzaef) (obj1)).zzcdz));
		String s;
		if(zzafl1 != null)
			j = 1;
		else
	//*1735 4130:goto            3542
			j = 0;
	// 1736 4133:iconst_0        
	// 1737 4134:istore_3        
		if(i == 0 || j == 0)
			break MISSING_BLOCK_LABEL_3594;
		obj = ((Object) (new Bundle()));
		((Bundle) (obj)).putBundle("interstitial_pool", ((Bundle) (zzafl1)));
		hashmap.put("counters", obj);
		if(((zzaef) (obj1)).zzcea != null)
			hashmap.put("gmp_app_id", ((Object) (((zzaef) (obj1)).zzcea)));
		if(((zzaef) (obj1)).zzceb == null)
			break MISSING_BLOCK_LABEL_4138;
		if(!"TIME_OUT".equals(((Object) (((zzaef) (obj1)).zzceb)))) goto _L41; else goto _L40
_L40:
		zzafl1 = "sai_timeout";
		obj = ((Object) (zznk.zzaxt));
		obj = zzkb.zzik().zzd(((zzna) (obj)));
_L43:
		hashmap.put(((Object) (zzafl1)), obj);
		  goto _L42
_L41:
		zzafl1 = "fbs_aiid";
		obj = ((Object) (((zzaef) (obj1)).zzceb));
		  goto _L43
_L42:
		if(((zzaef) (obj1)).zzcec != null)
			hashmap.put("fbs_aeid", ((Object) (((zzaef) (obj1)).zzcec)));
		if(((zzaef) (obj1)).versionCode >= 24)
			hashmap.put("disable_ml", ((Object) (Boolean.valueOf(((zzaef) (obj1)).zzcei))));
		zzafl1 = ((zzafl) (zznk.zzavo));
		obj = ((Object) ((String)zzkb.zzik().zzd(((zzna) (zzafl1)))));
		if(obj == null)
			break MISSING_BLOCK_LABEL_3851;
		if(((String) (obj)).isEmpty())
			break MISSING_BLOCK_LABEL_3851;
		i = android.os.Build.VERSION.SDK_INT;
		zzafl1 = ((zzafl) (zznk.zzavp));
		if(i < ((Integer)zzkb.zzik().zzd(((zzna) (zzafl1)))).intValue())
			break MISSING_BLOCK_LABEL_3851;
		zzafl1 = ((zzafl) (new HashMap()));
		obj = ((Object) (((String) (obj)).split(",")));
		j = obj.length;
		i = k;
_L45:
		if(i >= j)
			break; /* Loop/switch isn't completed */
		s = obj[i];
		((HashMap) (zzafl1)).put(((Object) (s)), ((Object) (zzams.zzdd(s))));
		i++;
		if(true) goto _L45; else goto _L44
_L44:
		hashmap.put("video_decoders", ((Object) (zzafl1)));
		zzafl1 = ((zzafl) (zznk.zzbet));
		if(((Boolean)zzkb.zzik().zzd(((zzna) (zzafl1)))).booleanValue())
			hashmap.put("omid_v", ((Object) (zzbv.zzfa().getVersion(context))));
		if(((zzaef) (obj1)).zzcek != null && !((zzaef) (obj1)).zzcek.isEmpty())
			hashmap.put("android_permissions", ((Object) (((zzaef) (obj1)).zzcek)));
		if(!zzakb.isLoggable(2))
			break MISSING_BLOCK_LABEL_3976;
		context = ((Context) (String.valueOf(((Object) (zzbv.zzek().zzn(((java.util.Map) (hashmap))).toString(2))))));
		if(((String) (context)).length() != 0)
		{
			context = ((Context) ("Ad Request JSON: ".concat(((String) (context)))));
			break MISSING_BLOCK_LABEL_3972;
		}
		context = ((Context) (new String("Ad Request JSON: ")));
		zzakb.v(((String) (context)));
		context = ((Context) (zzbv.zzek().zzn(((java.util.Map) (hashmap)))));
		return ((JSONObject) (context));
_L39:
		try
		{
			((Bundle) (obj5)).putString(((String) (obj1)), ((String) (obj2)));
			break; /* Loop/switch isn't completed */
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			context = ((Context) (String.valueOf(((Object) (((JSONException) (context)).getMessage())))));
		}
		if(((String) (context)).length() != 0)
			context = ((Context) ("Problem serializing ad request to JSON: ".concat(((String) (context)))));
		else
			context = ((Context) (new String("Problem serializing ad request to JSON: ")));
		zzakb.zzdk(((String) (context)));
		return null;
_L4:
		obj = "adtest";
		obj1 = "on";
		  goto _L46
_L10:
		if(k != 0 && flag) goto _L7; else goto _L47
_L47:
		j++;
		l = k;
		i = ((int) (flag));
		  goto _L48
_L18:
		i++;
		  goto _L49
_L21:
		obj = "any";
		  goto _L50
_L23:
		obj = "not_set";
		  goto _L50
_L25:
		obj = "landscape";
		  goto _L50
_L24:
		obj = "portrait";
		  goto _L50
_L36:
		flag1 = false;
		obj1 = null;
		  goto _L51
	//*1738 4135:goto            3557
		zzafl1 = "fbs_aiid";
	// 1739 4138:ldc2            #1232 <String "fbs_aiid">
	// 1740 4141:astore_1        
		obj = "";
	// 1741 4142:ldc1            #214 <String "">
	// 1742 4144:astore          11
		  goto _L43
	//*1743 4146:goto            3657
	}

	private static void zza(HashMap hashmap, Location location)
	{
		HashMap hashmap1 = new HashMap();
	//    0    0:new             #353 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #354 <Method void HashMap()>
	//    3    7:astore          9
		float f = location.getAccuracy();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #1323 <Method float Location.getAccuracy()>
	//    6   13:fstore_2        
		long l = location.getTime();
	//    7   14:aload_1         
	//    8   15:invokevirtual   #1327 <Method long Location.getTime()>
	//    9   18:lstore_3        
		long l1 = (long)(location.getLatitude() * 10000000D);
	//   10   19:aload_1         
	//   11   20:invokevirtual   #1331 <Method double Location.getLatitude()>
	//   12   23:ldc2w           #1332 <Double 10000000D>
	//   13   26:dmul            
	//   14   27:d2l             
	//   15   28:lstore          5
		long l2 = (long)(location.getLongitude() * 10000000D);
	//   16   30:aload_1         
	//   17   31:invokevirtual   #1336 <Method double Location.getLongitude()>
	//   18   34:ldc2w           #1332 <Double 10000000D>
	//   19   37:dmul            
	//   20   38:d2l             
	//   21   39:lstore          7
		hashmap1.put("radius", ((Object) (Float.valueOf(f * 1000F))));
	//   22   41:aload           9
	//   23   43:ldc2            #1338 <String "radius">
	//   24   46:fload_2         
	//   25   47:ldc2            #1339 <Float 1000F>
	//   26   50:fmul            
	//   27   51:invokestatic    #1069 <Method Float Float.valueOf(float)>
	//   28   54:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   29   57:pop             
		hashmap1.put("lat", ((Object) (Long.valueOf(l1))));
	//   30   58:aload           9
	//   31   60:ldc2            #1341 <String "lat">
	//   32   63:lload           5
	//   33   65:invokestatic    #1096 <Method Long Long.valueOf(long)>
	//   34   68:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   35   71:pop             
		hashmap1.put("long", ((Object) (Long.valueOf(l2))));
	//   36   72:aload           9
	//   37   74:ldc2            #1343 <String "long">
	//   38   77:lload           7
	//   39   79:invokestatic    #1096 <Method Long Long.valueOf(long)>
	//   40   82:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   41   85:pop             
		hashmap1.put("time", ((Object) (Long.valueOf(l * 1000L))));
	//   42   86:aload           9
	//   43   88:ldc2            #1345 <String "time">
	//   44   91:lload_3         
	//   45   92:ldc2w           #1346 <Long 1000L>
	//   46   95:lmul            
	//   47   96:invokestatic    #1096 <Method Long Long.valueOf(long)>
	//   48   99:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   49  102:pop             
		hashmap.put("uule", ((Object) (hashmap1)));
	//   50  103:aload_0         
	//   51  104:ldc2            #1349 <String "uule">
	//   52  107:aload           9
	//   53  109:invokevirtual   #378 <Method Object HashMap.put(Object, Object)>
	//   54  112:pop             
	//   55  113:return          
	}

	public static JSONObject zzb(zzaej zzaej1)
		throws JSONException
	{
		JSONObject jsonobject1;
		jsonobject1 = new JSONObject();
	//    0    0:new             #32  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #1353 <Method void JSONObject()>
	//    3    7:astore_2        
		if(zzaej1.zzbyq != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #134 <Field String zzaej.zzbyq>
	//*   6   12:ifnull          26
			jsonobject1.put("ad_base_url", ((Object) (zzaej1.zzbyq)));
	//    7   15:aload_2         
	//    8   16:ldc1            #37  <String "ad_base_url">
	//    9   18:aload_0         
	//   10   19:getfield        #134 <Field String zzaej.zzbyq>
	//   11   22:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//   12   25:pop             
		if(zzaej1.zzcet != null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #1359 <Field String zzaej.zzcet>
	//*  15   30:ifnull          44
			jsonobject1.put("ad_size", ((Object) (zzaej1.zzcet)));
	//   16   33:aload_2         
	//   17   34:ldc1            #45  <String "ad_size">
	//   18   36:aload_0         
	//   19   37:getfield        #1359 <Field String zzaej.zzcet>
	//   20   40:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//   21   43:pop             
		jsonobject1.put("native", zzaej1.zzare);
	//   22   44:aload_2         
	//   23   45:ldc2            #1361 <String "native">
	//   24   48:aload_0         
	//   25   49:getfield        #1364 <Field boolean zzaej.zzare>
	//   26   52:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//   27   55:pop             
		String s;
		if(zzaej1.zzare)
	//*  28   56:aload_0         
	//*  29   57:getfield        #1364 <Field boolean zzaej.zzare>
	//*  30   60:ifeq            79
			s = "ad_json";
	//   31   63:ldc1            #55  <String "ad_json">
	//   32   65:astore_1        
		else
	//*  33   66:aload_2         
	//*  34   67:aload_1         
	//*  35   68:aload_0         
	//*  36   69:getfield        #137 <Field String zzaej.zzceo>
	//*  37   72:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//*  38   75:pop             
	//*  39   76:goto            85
			s = "ad_html";
	//   40   79:ldc1            #57  <String "ad_html">
	//   41   81:astore_1        
		jsonobject1.put(s, ((Object) (zzaej1.zzceo)));
	//*  42   82:goto            66
		if(zzaej1.zzcev != null)
	//*  43   85:aload_0         
	//*  44   86:getfield        #1370 <Field String zzaej.zzcev>
	//*  45   89:ifnull          103
			jsonobject1.put("debug_dialog", ((Object) (zzaej1.zzcev)));
	//   46   92:aload_2         
	//   47   93:ldc1            #71  <String "debug_dialog">
	//   48   95:aload_0         
	//   49   96:getfield        #1370 <Field String zzaej.zzcev>
	//   50   99:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//   51  102:pop             
		if(zzaej1.zzcfl != null)
	//*  52  103:aload_0         
	//*  53  104:getfield        #1373 <Field String zzaej.zzcfl>
	//*  54  107:ifnull          121
			jsonobject1.put("debug_signals", ((Object) (zzaej1.zzcfl)));
	//   55  110:aload_2         
	//   56  111:ldc1            #73  <String "debug_signals">
	//   57  113:aload_0         
	//   58  114:getfield        #1373 <Field String zzaej.zzcfl>
	//   59  117:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//   60  120:pop             
		if(zzaej1.zzcep != -1L)
	//*  61  121:aload_0         
	//*  62  122:getfield        #177 <Field long zzaej.zzcep>
	//*  63  125:ldc2w           #203 <Long -1L>
	//*  64  128:lcmp            
	//*  65  129:ifeq            148
			jsonobject1.put("interstitial_timeout", (double)zzaej1.zzcep / 1000D);
	//   66  132:aload_2         
	//   67  133:ldc1            #75  <String "interstitial_timeout">
	//   68  135:aload_0         
	//   69  136:getfield        #177 <Field long zzaej.zzcep>
	//   70  139:l2d             
	//   71  140:ldc2w           #80  <Double 1000D>
	//   72  143:ddiv            
	//   73  144:invokevirtual   #1376 <Method JSONObject JSONObject.put(String, double)>
	//   74  147:pop             
		if(zzaej1.orientation != zzbv.zzem().zzrm()) goto _L2; else goto _L1
	//   75  148:aload_0         
	//   76  149:getfield        #174 <Field int zzaej.orientation>
	//   77  152:invokestatic    #97  <Method zzakq zzbv.zzem()>
	//   78  155:invokevirtual   #103 <Method int zzakq.zzrm()>
	//   79  158:icmpne          175
_L1:
		String s1 = "portrait";
	//   80  161:ldc1            #85  <String "portrait">
	//   81  163:astore_1        
_L4:
		jsonobject1.put("orientation", ((Object) (s1)));
	//   82  164:aload_2         
	//   83  165:ldc1            #83  <String "orientation">
	//   84  167:aload_1         
	//   85  168:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//   86  171:pop             
		break; /* Loop/switch isn't completed */
	//   87  172:goto            194
_L2:
		if(zzaej1.orientation != zzbv.zzem().zzrl())
			break; /* Loop/switch isn't completed */
	//   88  175:aload_0         
	//   89  176:getfield        #174 <Field int zzaej.orientation>
	//   90  179:invokestatic    #97  <Method zzakq zzbv.zzem()>
	//   91  182:invokevirtual   #108 <Method int zzakq.zzrl()>
	//   92  185:icmpne          194
		s1 = "landscape";
	//   93  188:ldc1            #105 <String "landscape">
	//   94  190:astore_1        
		if(true) goto _L4; else goto _L3
	//   95  191:goto            164
_L3:
		if(zzaej1.zzbsn != null)
	//*  96  194:aload_0         
	//*  97  195:getfield        #154 <Field List zzaej.zzbsn>
	//*  98  198:ifnull          215
			jsonobject1.put("click_urls", ((Object) (zzm(zzaej1.zzbsn))));
	//   99  201:aload_2         
	//  100  202:ldc1            #146 <String "click_urls">
	//  101  204:aload_0         
	//  102  205:getfield        #154 <Field List zzaej.zzbsn>
	//  103  208:invokestatic    #1380 <Method JSONArray zzm(List)>
	//  104  211:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  105  214:pop             
		if(zzaej1.zzbso != null)
	//* 106  215:aload_0         
	//* 107  216:getfield        #162 <Field List zzaej.zzbso>
	//* 108  219:ifnull          236
			jsonobject1.put("impression_urls", ((Object) (zzm(zzaej1.zzbso))));
	//  109  222:aload_2         
	//  110  223:ldc1            #159 <String "impression_urls">
	//  111  225:aload_0         
	//  112  226:getfield        #162 <Field List zzaej.zzbso>
	//  113  229:invokestatic    #1380 <Method JSONArray zzm(List)>
	//  114  232:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  115  235:pop             
		if(zzaej1.zzbsp != null)
	//* 116  236:aload_0         
	//* 117  237:getfield        #167 <Field List zzaej.zzbsp>
	//* 118  240:ifnull          257
			jsonobject1.put("downloaded_impression_urls", ((Object) (zzm(zzaej1.zzbsp))));
	//  119  243:aload_2         
	//  120  244:ldc1            #164 <String "downloaded_impression_urls">
	//  121  246:aload_0         
	//  122  247:getfield        #167 <Field List zzaej.zzbsp>
	//  123  250:invokestatic    #1380 <Method JSONArray zzm(List)>
	//  124  253:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  125  256:pop             
		if(zzaej1.zzces != null)
	//* 126  257:aload_0         
	//* 127  258:getfield        #172 <Field List zzaej.zzces>
	//* 128  261:ifnull          278
			jsonobject1.put("manual_impression_urls", ((Object) (zzm(zzaej1.zzces))));
	//  129  264:aload_2         
	//  130  265:ldc1            #169 <String "manual_impression_urls">
	//  131  267:aload_0         
	//  132  268:getfield        #172 <Field List zzaej.zzces>
	//  133  271:invokestatic    #1380 <Method JSONArray zzm(List)>
	//  134  274:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  135  277:pop             
		if(zzaej1.zzcey != null)
	//* 136  278:aload_0         
	//* 137  279:getfield        #1383 <Field String zzaej.zzcey>
	//* 138  282:ifnull          296
			jsonobject1.put("active_view", ((Object) (zzaej1.zzcey)));
	//  139  285:aload_2         
	//  140  286:ldc1            #179 <String "active_view">
	//  141  288:aload_0         
	//  142  289:getfield        #1383 <Field String zzaej.zzcey>
	//  143  292:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  144  295:pop             
		jsonobject1.put("ad_is_javascript", zzaej1.zzcew);
	//  145  296:aload_2         
	//  146  297:ldc1            #184 <String "ad_is_javascript">
	//  147  299:aload_0         
	//  148  300:getfield        #1386 <Field boolean zzaej.zzcew>
	//  149  303:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  150  306:pop             
		if(zzaej1.zzcex != null)
	//* 151  307:aload_0         
	//* 152  308:getfield        #1389 <Field String zzaej.zzcex>
	//* 153  311:ifnull          325
			jsonobject1.put("ad_passback_url", ((Object) (zzaej1.zzcex)));
	//  154  314:aload_2         
	//  155  315:ldc1            #190 <String "ad_passback_url">
	//  156  317:aload_0         
	//  157  318:getfield        #1389 <Field String zzaej.zzcex>
	//  158  321:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  159  324:pop             
		jsonobject1.put("mediation", zzaej1.zzceq);
	//  160  325:aload_2         
	//  161  326:ldc1            #192 <String "mediation">
	//  162  328:aload_0         
	//  163  329:getfield        #1392 <Field boolean zzaej.zzceq>
	//  164  332:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  165  335:pop             
		jsonobject1.put("custom_render_allowed", zzaej1.zzcez);
	//  166  336:aload_2         
	//  167  337:ldc1            #194 <String "custom_render_allowed">
	//  168  339:aload_0         
	//  169  340:getfield        #1395 <Field boolean zzaej.zzcez>
	//  170  343:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  171  346:pop             
		jsonobject1.put("content_url_opted_out", zzaej1.zzcfa);
	//  172  347:aload_2         
	//  173  348:ldc1            #196 <String "content_url_opted_out">
	//  174  350:aload_0         
	//  175  351:getfield        #1398 <Field boolean zzaej.zzcfa>
	//  176  354:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  177  357:pop             
		jsonobject1.put("content_vertical_opted_out", zzaej1.zzcfm);
	//  178  358:aload_2         
	//  179  359:ldc1            #198 <String "content_vertical_opted_out">
	//  180  361:aload_0         
	//  181  362:getfield        #1401 <Field boolean zzaej.zzcfm>
	//  182  365:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  183  368:pop             
		jsonobject1.put("prefetch", zzaej1.zzcfb);
	//  184  369:aload_2         
	//  185  370:ldc1            #200 <String "prefetch">
	//  186  372:aload_0         
	//  187  373:getfield        #1404 <Field boolean zzaej.zzcfb>
	//  188  376:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  189  379:pop             
		if(zzaej1.zzbsu != -1L)
	//* 190  380:aload_0         
	//* 191  381:getfield        #1407 <Field long zzaej.zzbsu>
	//* 192  384:ldc2w           #203 <Long -1L>
	//* 193  387:lcmp            
	//* 194  388:ifeq            402
			jsonobject1.put("refresh_interval_milliseconds", zzaej1.zzbsu);
	//  195  391:aload_2         
	//  196  392:ldc1            #202 <String "refresh_interval_milliseconds">
	//  197  394:aload_0         
	//  198  395:getfield        #1407 <Field long zzaej.zzbsu>
	//  199  398:invokevirtual   #1410 <Method JSONObject JSONObject.put(String, long)>
	//  200  401:pop             
		if(zzaej1.zzcer != -1L)
	//* 201  402:aload_0         
	//* 202  403:getfield        #1413 <Field long zzaej.zzcer>
	//* 203  406:ldc2w           #203 <Long -1L>
	//* 204  409:lcmp            
	//* 205  410:ifeq            424
			jsonobject1.put("mediation_config_cache_time_milliseconds", zzaej1.zzcer);
	//  206  413:aload_2         
	//  207  414:ldc1            #210 <String "mediation_config_cache_time_milliseconds">
	//  208  416:aload_0         
	//  209  417:getfield        #1413 <Field long zzaej.zzcer>
	//  210  420:invokevirtual   #1410 <Method JSONObject JSONObject.put(String, long)>
	//  211  423:pop             
		if(!TextUtils.isEmpty(((CharSequence) (zzaej1.zzamj))))
	//* 212  424:aload_0         
	//* 213  425:getfield        #1416 <Field String zzaej.zzamj>
	//* 214  428:invokestatic    #114 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 215  431:ifne            445
			jsonobject1.put("gws_query_id", ((Object) (zzaej1.zzamj)));
	//  216  434:aload_2         
	//  217  435:ldc1            #212 <String "gws_query_id">
	//  218  437:aload_0         
	//  219  438:getfield        #1416 <Field String zzaej.zzamj>
	//  220  441:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  221  444:pop             
		String s2;
		if(zzaej1.zzarf)
	//* 222  445:aload_0         
	//* 223  446:getfield        #1417 <Field boolean zzaej.zzarf>
	//* 224  449:ifeq            458
			s2 = "height";
	//  225  452:ldc1            #216 <String "height">
	//  226  454:astore_1        
		else
	//* 227  455:goto            461
			s2 = "";
	//  228  458:ldc1            #214 <String "">
	//  229  460:astore_1        
		jsonobject1.put("fluid", ((Object) (s2)));
	//  230  461:aload_2         
	//  231  462:ldc1            #218 <String "fluid">
	//  232  464:aload_1         
	//  233  465:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  234  468:pop             
		jsonobject1.put("native_express", zzaej1.zzarg);
	//  235  469:aload_2         
	//  236  470:ldc1            #220 <String "native_express">
	//  237  472:aload_0         
	//  238  473:getfield        #1418 <Field boolean zzaej.zzarg>
	//  239  476:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  240  479:pop             
		if(zzaej1.zzcff != null)
	//* 241  480:aload_0         
	//* 242  481:getfield        #1421 <Field List zzaej.zzcff>
	//* 243  484:ifnull          501
			jsonobject1.put("video_start_urls", ((Object) (zzm(zzaej1.zzcff))));
	//  244  487:aload_2         
	//  245  488:ldc1            #222 <String "video_start_urls">
	//  246  490:aload_0         
	//  247  491:getfield        #1421 <Field List zzaej.zzcff>
	//  248  494:invokestatic    #1380 <Method JSONArray zzm(List)>
	//  249  497:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  250  500:pop             
		if(zzaej1.zzcfg != null)
	//* 251  501:aload_0         
	//* 252  502:getfield        #1424 <Field List zzaej.zzcfg>
	//* 253  505:ifnull          522
			jsonobject1.put("video_complete_urls", ((Object) (zzm(zzaej1.zzcfg))));
	//  254  508:aload_2         
	//  255  509:ldc1            #224 <String "video_complete_urls">
	//  256  511:aload_0         
	//  257  512:getfield        #1424 <Field List zzaej.zzcfg>
	//  258  515:invokestatic    #1380 <Method JSONArray zzm(List)>
	//  259  518:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  260  521:pop             
		if(zzaej1.zzcfe != null)
	//* 261  522:aload_0         
	//* 262  523:getfield        #1428 <Field zzaig zzaej.zzcfe>
	//* 263  526:ifnull          588
		{
			Object obj = ((Object) (zzaej1.zzcfe));
	//  264  529:aload_0         
	//  265  530:getfield        #1428 <Field zzaig zzaej.zzcfe>
	//  266  533:astore_3        
			JSONObject jsonobject = new JSONObject();
	//  267  534:new             #32  <Class JSONObject>
	//  268  537:dup             
	//  269  538:invokespecial   #1353 <Method void JSONObject()>
	//  270  541:astore_1        
			jsonobject.put("rb_type", ((Object) (((zzaig) (obj)).type)));
	//  271  542:aload_1         
	//  272  543:ldc2            #1430 <String "rb_type">
	//  273  546:aload_3         
	//  274  547:getfield        #1433 <Field String zzaig.type>
	//  275  550:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  276  553:pop             
			jsonobject.put("rb_amount", ((zzaig) (obj)).zzcmk);
	//  277  554:aload_1         
	//  278  555:ldc2            #1435 <String "rb_amount">
	//  279  558:aload_3         
	//  280  559:getfield        #1438 <Field int zzaig.zzcmk>
	//  281  562:invokevirtual   #1441 <Method JSONObject JSONObject.put(String, int)>
	//  282  565:pop             
			obj = ((Object) (new JSONArray()));
	//  283  566:new             #313 <Class JSONArray>
	//  284  569:dup             
	//  285  570:invokespecial   #1442 <Method void JSONArray()>
	//  286  573:astore_3        
			((JSONArray) (obj)).put(((Object) (jsonobject)));
	//  287  574:aload_3         
	//  288  575:aload_1         
	//  289  576:invokevirtual   #1445 <Method JSONArray JSONArray.put(Object)>
	//  290  579:pop             
			jsonobject1.put("rewards", obj);
	//  291  580:aload_2         
	//  292  581:ldc1            #226 <String "rewards">
	//  293  583:aload_3         
	//  294  584:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  295  587:pop             
		}
		jsonobject1.put("use_displayed_impression", zzaej1.zzcfh);
	//  296  588:aload_2         
	//  297  589:ldc1            #233 <String "use_displayed_impression">
	//  298  591:aload_0         
	//  299  592:getfield        #1448 <Field boolean zzaej.zzcfh>
	//  300  595:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  301  598:pop             
		jsonobject1.put("auto_protection_configuration", ((Object) (zzaej1.zzcfi)));
	//  302  599:aload_2         
	//  303  600:ldc1            #235 <String "auto_protection_configuration">
	//  304  602:aload_0         
	//  305  603:getfield        #1452 <Field zzael zzaej.zzcfi>
	//  306  606:invokevirtual   #1356 <Method JSONObject JSONObject.put(String, Object)>
	//  307  609:pop             
		jsonobject1.put("render_in_browser", zzaej1.zzbss);
	//  308  610:aload_2         
	//  309  611:ldc2            #259 <String "render_in_browser">
	//  310  614:aload_0         
	//  311  615:getfield        #1453 <Field boolean zzaej.zzbss>
	//  312  618:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  313  621:pop             
		jsonobject1.put("disable_closable_area", zzaej1.zzzm);
	//  314  622:aload_2         
	//  315  623:ldc2            #273 <String "disable_closable_area">
	//  316  626:aload_0         
	//  317  627:getfield        #1456 <Field boolean zzaej.zzzm>
	//  318  630:invokevirtual   #1367 <Method JSONObject JSONObject.put(String, boolean)>
	//  319  633:pop             
		return jsonobject1;
	//  320  634:aload_2         
	//  321  635:areturn         
	}

	private static JSONArray zzm(List list)
		throws JSONException
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #313 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #1442 <Method void JSONArray()>
	//    3    7:astore_1        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext(); jsonarray.put(((Object) ((String)((Iterator) (list)).next()))));
	//    4    8:aload_0         
	//    5    9:invokeinterface #623 <Method Iterator List.iterator()>
	//    6   14:astore_0        
	//    7   15:aload_0         
	//    8   16:invokeinterface #628 <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            41
	//   10   24:aload_1         
	//   11   25:aload_0         
	//   12   26:invokeinterface #632 <Method Object Iterator.next()>
	//   13   31:checkcast       #87  <Class String>
	//   14   34:invokevirtual   #1445 <Method JSONArray JSONArray.put(Object)>
	//   15   37:pop             
	//*  16   38:goto            15
		return jsonarray;
	//   17   41:aload_1         
	//   18   42:areturn         
	}

	private static Integer zzv(boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #1459 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1461 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #1464 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private static final SimpleDateFormat zzcho;

	static 
	{
		zzcho = new SimpleDateFormat("yyyyMMdd", Locale.US);
	//    0    0:new             #11  <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "yyyyMMdd">
	//    3    6:getstatic       #19  <Field Locale Locale.US>
	//    4    9:invokespecial   #23  <Method void SimpleDateFormat(String, Locale)>
	//    5   12:putstatic       #25  <Field SimpleDateFormat zzcho>
	//*   6   15:return          
	}
}
