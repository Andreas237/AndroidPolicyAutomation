// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzwx, zzxg, zzaig

public final class zzwy
{

	public zzwy(String s)
		throws JSONException
	{
		this(new JSONObject(s));
	//    0    0:aload_0         
	//    1    1:new             #38  <Class JSONObject>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #40  <Method void JSONObject(String)>
	//    5    9:invokespecial   #43  <Method void zzwy(JSONObject)>
	//    6   12:return          
	}

	public zzwy(List list, long l, List list1, List list2, List list3, List list4, 
			List list5, boolean flag, String s, long l1, int i, int j, 
			String s1, int k, int i1, long l2, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		zzbsm = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #51  <Field List zzbsm>
		zzbsl = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #53  <Field long zzbsl>
		zzbsn = list1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #55  <Field List zzbsn>
		zzbso = list2;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #57  <Field List zzbso>
		zzbsp = list3;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #59  <Field List zzbsp>
		zzbsq = list4;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #61  <Field List zzbsq>
		zzbsr = list5;
	//   20   38:aload_0         
	//   21   39:aload           8
	//   22   41:putfield        #63  <Field List zzbsr>
		zzbss = flag;
	//   23   44:aload_0         
	//   24   45:iload           9
	//   25   47:putfield        #65  <Field boolean zzbss>
		zzbst = s;
	//   26   50:aload_0         
	//   27   51:aload           10
	//   28   53:putfield        #67  <Field String zzbst>
		zzbsu = -1L;
	//   29   56:aload_0         
	//   30   57:ldc2w           #68  <Long -1L>
	//   31   60:putfield        #71  <Field long zzbsu>
		zzbtc = 0;
	//   32   63:aload_0         
	//   33   64:iconst_0        
	//   34   65:putfield        #73  <Field int zzbtc>
		zzbtd = 1;
	//   35   68:aload_0         
	//   36   69:iconst_1        
	//   37   70:putfield        #75  <Field int zzbtd>
		zzbsv = null;
	//   38   73:aload_0         
	//   39   74:aconst_null     
	//   40   75:putfield        #77  <Field String zzbsv>
		zzbsw = 0;
	//   41   78:aload_0         
	//   42   79:iconst_0        
	//   43   80:putfield        #79  <Field int zzbsw>
		zzbsx = -1;
	//   44   83:aload_0         
	//   45   84:iconst_m1       
	//   46   85:putfield        #81  <Field int zzbsx>
		zzbsy = -1L;
	//   47   88:aload_0         
	//   48   89:ldc2w           #68  <Long -1L>
	//   49   92:putfield        #83  <Field long zzbsy>
		zzbsz = false;
	//   50   95:aload_0         
	//   51   96:iconst_0        
	//   52   97:putfield        #85  <Field boolean zzbsz>
		zzbta = false;
	//   53  100:aload_0         
	//   54  101:iconst_0        
	//   55  102:putfield        #87  <Field boolean zzbta>
		zzbtb = false;
	//   56  105:aload_0         
	//   57  106:iconst_0        
	//   58  107:putfield        #89  <Field boolean zzbtb>
		zzbte = false;
	//   59  110:aload_0         
	//   60  111:iconst_0        
	//   61  112:putfield        #91  <Field boolean zzbte>
	//   62  115:return          
	}

	public zzwy(JSONObject jsonobject)
		throws JSONException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
		if(zzakb.isLoggable(2))
	//*   2    4:iconst_2        
	//*   3    5:invokestatic    #99  <Method boolean zzakb.isLoggable(int)>
	//*   4    8:ifeq            57
		{
			String s = String.valueOf(((Object) (jsonobject.toString(2))));
	//    5   11:aload_1         
	//    6   12:iconst_2        
	//    7   13:invokevirtual   #103 <Method String JSONObject.toString(int)>
	//    8   16:invokestatic    #109 <Method String String.valueOf(Object)>
	//    9   19:astore          11
			if(s.length() != 0)
	//*  10   21:aload           11
	//*  11   23:invokevirtual   #113 <Method int String.length()>
	//*  12   26:ifeq            41
				s = "Mediation Response JSON: ".concat(s);
	//   13   29:ldc1            #115 <String "Mediation Response JSON: ">
	//   14   31:aload           11
	//   15   33:invokevirtual   #119 <Method String String.concat(String)>
	//   16   36:astore          11
			else
	//*  17   38:goto            52
				s = new String("Mediation Response JSON: ");
	//   18   41:new             #105 <Class String>
	//   19   44:dup             
	//   20   45:ldc1            #115 <String "Mediation Response JSON: ">
	//   21   47:invokespecial   #120 <Method void String(String)>
	//   22   50:astore          11
			zzakb.v(s);
	//   23   52:aload           11
	//   24   54:invokestatic    #123 <Method void zzakb.v(String)>
		}
		JSONArray jsonarray = jsonobject.getJSONArray("ad_networks");
	//   25   57:aload_1         
	//   26   58:ldc1            #125 <String "ad_networks">
	//   27   60:invokevirtual   #129 <Method JSONArray JSONObject.getJSONArray(String)>
	//   28   63:astore          11
		ArrayList arraylist = new ArrayList(jsonarray.length());
	//   29   65:new             #131 <Class ArrayList>
	//   30   68:dup             
	//   31   69:aload           11
	//   32   71:invokevirtual   #134 <Method int JSONArray.length()>
	//   33   74:invokespecial   #137 <Method void ArrayList(int)>
	//   34   77:astore          12
		int j = -1;
	//   35   79:iconst_m1       
	//   36   80:istore_3        
		for(int i = 0; i < jsonarray.length();)
	//*  37   81:iconst_0        
	//*  38   82:istore_2        
	//*  39   83:iload_2         
	//*  40   84:aload           11
	//*  41   86:invokevirtual   #134 <Method int JSONArray.length()>
	//*  42   89:icmpge          211
		{
			int k;
label0:
			{
				boolean flag;
label1:
				{
					Object obj = ((Object) (new zzwx(jsonarray.getJSONObject(i))));
	//   43   92:new             #139 <Class zzwx>
	//   44   95:dup             
	//   45   96:aload           11
	//   46   98:iload_2         
	//   47   99:invokevirtual   #143 <Method JSONObject JSONArray.getJSONObject(int)>
	//   48  102:invokespecial   #144 <Method void zzwx(JSONObject)>
	//   49  105:astore          13
					boolean flag1 = ((zzwx) (obj)).zzmf();
	//   50  107:aload           13
	//   51  109:invokevirtual   #148 <Method boolean zzwx.zzmf()>
	//   52  112:istore          6
					flag = true;
	//   53  114:iconst_1        
	//   54  115:istore          5
					if(flag1)
	//*  55  117:iload           6
	//*  56  119:ifeq            127
						zzbte = true;
	//   57  122:aload_0         
	//   58  123:iconst_1        
	//   59  124:putfield        #91  <Field boolean zzbte>
					((List) (arraylist)).add(obj);
	//   60  127:aload           12
	//   61  129:aload           13
	//   62  131:invokeinterface #154 <Method boolean List.add(Object)>
	//   63  136:pop             
					k = j;
	//   64  137:iload_3         
	//   65  138:istore          4
					if(j >= 0)
						break label0;
	//   66  140:iload_3         
	//   67  141:ifge            201
					for(obj = ((Object) (((zzwx) (obj)).zzbrt.iterator())); ((Iterator) (obj)).hasNext();)
	//*  68  144:aload           13
	//*  69  146:getfield        #157 <Field List zzwx.zzbrt>
	//*  70  149:invokeinterface #161 <Method Iterator List.iterator()>
	//*  71  154:astore          13
	//*  72  156:aload           13
	//*  73  158:invokeinterface #166 <Method boolean Iterator.hasNext()>
	//*  74  163:ifeq            187
						if(((String)((Iterator) (obj)).next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
	//*  75  166:aload           13
	//*  76  168:invokeinterface #170 <Method Object Iterator.next()>
	//*  77  173:checkcast       #105 <Class String>
	//*  78  176:ldc1            #172 <String "com.google.ads.mediation.admob.AdMobAdapter">
	//*  79  178:invokevirtual   #175 <Method boolean String.equals(Object)>
	//*  80  181:ifeq            156
							break label1;
	//   81  184:goto            190

					flag = false;
	//   82  187:iconst_0        
	//   83  188:istore          5
				}
				k = j;
	//   84  190:iload_3         
	//   85  191:istore          4
				if(flag)
	//*  86  193:iload           5
	//*  87  195:ifeq            201
					k = i;
	//   88  198:iload_2         
	//   89  199:istore          4
			}
			i++;
	//   90  201:iload_2         
	//   91  202:iconst_1        
	//   92  203:iadd            
	//   93  204:istore_2        
			j = k;
	//   94  205:iload           4
	//   95  207:istore_3        
		}

	//*  96  208:goto            83
		zzbtc = j;
	//   97  211:aload_0         
	//   98  212:iload_3         
	//   99  213:putfield        #73  <Field int zzbtc>
		zzbtd = jsonarray.length();
	//  100  216:aload_0         
	//  101  217:aload           11
	//  102  219:invokevirtual   #134 <Method int JSONArray.length()>
	//  103  222:putfield        #75  <Field int zzbtd>
		zzbsm = Collections.unmodifiableList(((List) (arraylist)));
	//  104  225:aload_0         
	//  105  226:aload           12
	//  106  228:invokestatic    #181 <Method List Collections.unmodifiableList(List)>
	//  107  231:putfield        #51  <Field List zzbsm>
		zzbst = jsonobject.optString("qdata");
	//  108  234:aload_0         
	//  109  235:aload_1         
	//  110  236:ldc1            #183 <String "qdata">
	//  111  238:invokevirtual   #186 <Method String JSONObject.optString(String)>
	//  112  241:putfield        #67  <Field String zzbst>
		zzbsx = jsonobject.optInt("fs_model_type", -1);
	//  113  244:aload_0         
	//  114  245:aload_1         
	//  115  246:ldc1            #188 <String "fs_model_type">
	//  116  248:iconst_m1       
	//  117  249:invokevirtual   #192 <Method int JSONObject.optInt(String, int)>
	//  118  252:putfield        #81  <Field int zzbsx>
		long l = -1L;
	//  119  255:ldc2w           #68  <Long -1L>
	//  120  258:lstore          7
		zzbsy = jsonobject.optLong("timeout_ms", -1L);
	//  121  260:aload_0         
	//  122  261:aload_1         
	//  123  262:ldc1            #194 <String "timeout_ms">
	//  124  264:ldc2w           #68  <Long -1L>
	//  125  267:invokevirtual   #198 <Method long JSONObject.optLong(String, long)>
	//  126  270:putfield        #83  <Field long zzbsy>
		jsonobject = jsonobject.optJSONObject("settings");
	//  127  273:aload_1         
	//  128  274:ldc1            #200 <String "settings">
	//  129  276:invokevirtual   #204 <Method JSONObject JSONObject.optJSONObject(String)>
	//  130  279:astore_1        
		if(jsonobject != null)
	//* 131  280:aload_1         
	//* 132  281:ifnull          494
		{
			zzbsl = jsonobject.optLong("ad_network_timeout_millis", -1L);
	//  133  284:aload_0         
	//  134  285:aload_1         
	//  135  286:ldc1            #206 <String "ad_network_timeout_millis">
	//  136  288:ldc2w           #68  <Long -1L>
	//  137  291:invokevirtual   #198 <Method long JSONObject.optLong(String, long)>
	//  138  294:putfield        #53  <Field long zzbsl>
			zzbv.zzfd();
	//  139  297:invokestatic    #212 <Method zzxg zzbv.zzfd()>
	//  140  300:pop             
			zzbsn = zzxg.zza(jsonobject, "click_urls");
	//  141  301:aload_0         
	//  142  302:aload_1         
	//  143  303:ldc1            #214 <String "click_urls">
	//  144  305:invokestatic    #220 <Method List zzxg.zza(JSONObject, String)>
	//  145  308:putfield        #55  <Field List zzbsn>
			zzbv.zzfd();
	//  146  311:invokestatic    #212 <Method zzxg zzbv.zzfd()>
	//  147  314:pop             
			zzbso = zzxg.zza(jsonobject, "imp_urls");
	//  148  315:aload_0         
	//  149  316:aload_1         
	//  150  317:ldc1            #222 <String "imp_urls">
	//  151  319:invokestatic    #220 <Method List zzxg.zza(JSONObject, String)>
	//  152  322:putfield        #57  <Field List zzbso>
			zzbv.zzfd();
	//  153  325:invokestatic    #212 <Method zzxg zzbv.zzfd()>
	//  154  328:pop             
			zzbsp = zzxg.zza(jsonobject, "downloaded_imp_urls");
	//  155  329:aload_0         
	//  156  330:aload_1         
	//  157  331:ldc1            #224 <String "downloaded_imp_urls">
	//  158  333:invokestatic    #220 <Method List zzxg.zza(JSONObject, String)>
	//  159  336:putfield        #59  <Field List zzbsp>
			zzbv.zzfd();
	//  160  339:invokestatic    #212 <Method zzxg zzbv.zzfd()>
	//  161  342:pop             
			zzbsq = zzxg.zza(jsonobject, "nofill_urls");
	//  162  343:aload_0         
	//  163  344:aload_1         
	//  164  345:ldc1            #226 <String "nofill_urls">
	//  165  347:invokestatic    #220 <Method List zzxg.zza(JSONObject, String)>
	//  166  350:putfield        #61  <Field List zzbsq>
			zzbv.zzfd();
	//  167  353:invokestatic    #212 <Method zzxg zzbv.zzfd()>
	//  168  356:pop             
			zzbsr = zzxg.zza(jsonobject, "remote_ping_urls");
	//  169  357:aload_0         
	//  170  358:aload_1         
	//  171  359:ldc1            #228 <String "remote_ping_urls">
	//  172  361:invokestatic    #220 <Method List zzxg.zza(JSONObject, String)>
	//  173  364:putfield        #63  <Field List zzbsr>
			zzbss = jsonobject.optBoolean("render_in_browser", false);
	//  174  367:aload_0         
	//  175  368:aload_1         
	//  176  369:ldc1            #230 <String "render_in_browser">
	//  177  371:iconst_0        
	//  178  372:invokevirtual   #234 <Method boolean JSONObject.optBoolean(String, boolean)>
	//  179  375:putfield        #65  <Field boolean zzbss>
			long l1 = jsonobject.optLong("refresh", -1L);
	//  180  378:aload_1         
	//  181  379:ldc1            #236 <String "refresh">
	//  182  381:ldc2w           #68  <Long -1L>
	//  183  384:invokevirtual   #198 <Method long JSONObject.optLong(String, long)>
	//  184  387:lstore          9
			if(l1 > 0L)
	//* 185  389:lload           9
	//* 186  391:lconst_0        
	//* 187  392:lcmp            
	//* 188  393:ifle            404
				l = 1000L * l1;
	//  189  396:ldc2w           #237 <Long 1000L>
	//  190  399:lload           9
	//  191  401:lmul            
	//  192  402:lstore          7
			zzbsu = l;
	//  193  404:aload_0         
	//  194  405:lload           7
	//  195  407:putfield        #71  <Field long zzbsu>
			zzaig zzaig1 = zzaig.zza(jsonobject.optJSONArray("rewards"));
	//  196  410:aload_1         
	//  197  411:ldc1            #240 <String "rewards">
	//  198  413:invokevirtual   #243 <Method JSONArray JSONObject.optJSONArray(String)>
	//  199  416:invokestatic    #248 <Method zzaig zzaig.zza(JSONArray)>
	//  200  419:astore          11
			if(zzaig1 == null)
	//* 201  421:aload           11
	//* 202  423:ifnonnull       439
			{
				zzbsv = null;
	//  203  426:aload_0         
	//  204  427:aconst_null     
	//  205  428:putfield        #77  <Field String zzbsv>
				zzbsw = 0;
	//  206  431:aload_0         
	//  207  432:iconst_0        
	//  208  433:putfield        #79  <Field int zzbsw>
			} else
	//* 209  436:goto            457
			{
				zzbsv = zzaig1.type;
	//  210  439:aload_0         
	//  211  440:aload           11
	//  212  442:getfield        #251 <Field String zzaig.type>
	//  213  445:putfield        #77  <Field String zzbsv>
				zzbsw = zzaig1.zzcmk;
	//  214  448:aload_0         
	//  215  449:aload           11
	//  216  451:getfield        #254 <Field int zzaig.zzcmk>
	//  217  454:putfield        #79  <Field int zzbsw>
			}
			zzbsz = jsonobject.optBoolean("use_displayed_impression", false);
	//  218  457:aload_0         
	//  219  458:aload_1         
	//  220  459:ldc2            #256 <String "use_displayed_impression">
	//  221  462:iconst_0        
	//  222  463:invokevirtual   #234 <Method boolean JSONObject.optBoolean(String, boolean)>
	//  223  466:putfield        #85  <Field boolean zzbsz>
			zzbta = jsonobject.optBoolean("allow_pub_rendered_attribution", false);
	//  224  469:aload_0         
	//  225  470:aload_1         
	//  226  471:ldc2            #258 <String "allow_pub_rendered_attribution">
	//  227  474:iconst_0        
	//  228  475:invokevirtual   #234 <Method boolean JSONObject.optBoolean(String, boolean)>
	//  229  478:putfield        #87  <Field boolean zzbta>
			zzbtb = jsonobject.optBoolean("allow_pub_owned_ad_view", false);
	//  230  481:aload_0         
	//  231  482:aload_1         
	//  232  483:ldc2            #260 <String "allow_pub_owned_ad_view">
	//  233  486:iconst_0        
	//  234  487:invokevirtual   #234 <Method boolean JSONObject.optBoolean(String, boolean)>
	//  235  490:putfield        #89  <Field boolean zzbtb>
			return;
	//  236  493:return          
		} else
		{
			zzbsl = -1L;
	//  237  494:aload_0         
	//  238  495:ldc2w           #68  <Long -1L>
	//  239  498:putfield        #53  <Field long zzbsl>
			zzbsn = null;
	//  240  501:aload_0         
	//  241  502:aconst_null     
	//  242  503:putfield        #55  <Field List zzbsn>
			zzbso = null;
	//  243  506:aload_0         
	//  244  507:aconst_null     
	//  245  508:putfield        #57  <Field List zzbso>
			zzbsp = null;
	//  246  511:aload_0         
	//  247  512:aconst_null     
	//  248  513:putfield        #59  <Field List zzbsp>
			zzbsq = null;
	//  249  516:aload_0         
	//  250  517:aconst_null     
	//  251  518:putfield        #61  <Field List zzbsq>
			zzbsr = null;
	//  252  521:aload_0         
	//  253  522:aconst_null     
	//  254  523:putfield        #63  <Field List zzbsr>
			zzbsu = -1L;
	//  255  526:aload_0         
	//  256  527:ldc2w           #68  <Long -1L>
	//  257  530:putfield        #71  <Field long zzbsu>
			zzbsv = null;
	//  258  533:aload_0         
	//  259  534:aconst_null     
	//  260  535:putfield        #77  <Field String zzbsv>
			zzbsw = 0;
	//  261  538:aload_0         
	//  262  539:iconst_0        
	//  263  540:putfield        #79  <Field int zzbsw>
			zzbsz = false;
	//  264  543:aload_0         
	//  265  544:iconst_0        
	//  266  545:putfield        #85  <Field boolean zzbsz>
			zzbss = false;
	//  267  548:aload_0         
	//  268  549:iconst_0        
	//  269  550:putfield        #65  <Field boolean zzbss>
			zzbta = false;
	//  270  553:aload_0         
	//  271  554:iconst_0        
	//  272  555:putfield        #87  <Field boolean zzbta>
			zzbtb = false;
	//  273  558:aload_0         
	//  274  559:iconst_0        
	//  275  560:putfield        #89  <Field boolean zzbtb>
			return;
	//  276  563:return          
		}
	}

	public final long zzbsl;
	public final List zzbsm;
	public final List zzbsn;
	public final List zzbso;
	public final List zzbsp;
	public final List zzbsq;
	public final List zzbsr;
	public final boolean zzbss;
	public final String zzbst;
	public final long zzbsu;
	public final String zzbsv;
	public final int zzbsw;
	public final int zzbsx;
	public final long zzbsy;
	public final boolean zzbsz;
	public final boolean zzbta;
	public final boolean zzbtb;
	public int zzbtc;
	public int zzbtd;
	public boolean zzbte;
}
