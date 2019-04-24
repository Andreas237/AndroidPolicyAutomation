// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzxg, zznk, zzkb, zzni

public final class zzwx
{

	public zzwx(String s, String s1, List list, String s2, String s3, List list1, List list2, 
			List list3, List list4, String s4, String s5, List list5, List list6, List list7, 
			String s6, String s7, String s8, List list8, String s9, List list9, String s10, 
			long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		zzbrr = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field String zzbrr>
		zzbrs = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #41  <Field String zzbrs>
		zzbrt = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #43  <Field List zzbrt>
		zzbru = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #45  <Field String zzbru>
		zzbrv = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #47  <Field String zzbrv>
		zzbrw = list1;
	//   17   29:aload_0         
	//   18   30:aload           6
	//   19   32:putfield        #49  <Field List zzbrw>
		zzbrx = list2;
	//   20   35:aload_0         
	//   21   36:aload           7
	//   22   38:putfield        #51  <Field List zzbrx>
		zzbry = list3;
	//   23   41:aload_0         
	//   24   42:aload           8
	//   25   44:putfield        #53  <Field List zzbry>
		zzbrz = list4;
	//   26   47:aload_0         
	//   27   48:aload           9
	//   28   50:putfield        #55  <Field List zzbrz>
		zzbsb = s4;
	//   29   53:aload_0         
	//   30   54:aload           10
	//   31   56:putfield        #57  <Field String zzbsb>
		zzbsc = list5;
	//   32   59:aload_0         
	//   33   60:aload           12
	//   34   62:putfield        #59  <Field List zzbsc>
		zzbsd = list6;
	//   35   65:aload_0         
	//   36   66:aload           13
	//   37   68:putfield        #61  <Field List zzbsd>
		zzbse = list7;
	//   38   71:aload_0         
	//   39   72:aload           14
	//   40   74:putfield        #63  <Field List zzbse>
		zzbsf = null;
	//   41   77:aload_0         
	//   42   78:aconst_null     
	//   43   79:putfield        #65  <Field String zzbsf>
		zzbsg = null;
	//   44   82:aload_0         
	//   45   83:aconst_null     
	//   46   84:putfield        #67  <Field String zzbsg>
		zzbsh = null;
	//   47   87:aload_0         
	//   48   88:aconst_null     
	//   49   89:putfield        #69  <Field String zzbsh>
		zzbsi = null;
	//   50   92:aload_0         
	//   51   93:aconst_null     
	//   52   94:putfield        #71  <Field List zzbsi>
		zzbsj = null;
	//   53   97:aload_0         
	//   54   98:aconst_null     
	//   55   99:putfield        #73  <Field String zzbsj>
		zzbsa = list9;
	//   56  102:aload_0         
	//   57  103:aload           20
	//   58  105:putfield        #75  <Field List zzbsa>
		zzbsk = null;
	//   59  108:aload_0         
	//   60  109:aconst_null     
	//   61  110:putfield        #77  <Field String zzbsk>
		zzbsl = -1L;
	//   62  113:aload_0         
	//   63  114:ldc2w           #78  <Long -1L>
	//   64  117:putfield        #81  <Field long zzbsl>
	//   65  120:return          
	}

	public zzwx(JSONObject jsonobject)
		throws JSONException
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		zzbrs = jsonobject.optString("id");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #89  <String "id">
	//    5    8:invokevirtual   #95  <Method String JSONObject.optString(String)>
	//    6   11:putfield        #41  <Field String zzbrs>
		Object obj = ((Object) (jsonobject.getJSONArray("adapters")));
	//    7   14:aload_1         
	//    8   15:ldc1            #97  <String "adapters">
	//    9   17:invokevirtual   #101 <Method JSONArray JSONObject.getJSONArray(String)>
	//   10   20:astore_3        
		Object obj1 = ((Object) (new ArrayList(((JSONArray) (obj)).length())));
	//   11   21:new             #103 <Class ArrayList>
	//   12   24:dup             
	//   13   25:aload_3         
	//   14   26:invokevirtual   #109 <Method int JSONArray.length()>
	//   15   29:invokespecial   #112 <Method void ArrayList(int)>
	//   16   32:astore          4
		for(int i = 0; i < ((JSONArray) (obj)).length(); i++)
	//*  17   34:iconst_0        
	//*  18   35:istore_2        
	//*  19   36:iload_2         
	//*  20   37:aload_3         
	//*  21   38:invokevirtual   #109 <Method int JSONArray.length()>
	//*  22   41:icmpge          64
			((List) (obj1)).add(((Object) (((JSONArray) (obj)).getString(i))));
	//   23   44:aload           4
	//   24   46:aload_3         
	//   25   47:iload_2         
	//   26   48:invokevirtual   #116 <Method String JSONArray.getString(int)>
	//   27   51:invokeinterface #122 <Method boolean List.add(Object)>
	//   28   56:pop             

	//   29   57:iload_2         
	//   30   58:iconst_1        
	//   31   59:iadd            
	//   32   60:istore_2        
	//*  33   61:goto            36
		zzbrt = Collections.unmodifiableList(((List) (obj1)));
	//   34   64:aload_0         
	//   35   65:aload           4
	//   36   67:invokestatic    #128 <Method List Collections.unmodifiableList(List)>
	//   37   70:putfield        #43  <Field List zzbrt>
		zzbru = jsonobject.optString("allocation_id", ((String) (null)));
	//   38   73:aload_0         
	//   39   74:aload_1         
	//   40   75:ldc1            #130 <String "allocation_id">
	//   41   77:aconst_null     
	//   42   78:invokevirtual   #133 <Method String JSONObject.optString(String, String)>
	//   43   81:putfield        #45  <Field String zzbru>
		zzbv.zzfd();
	//   44   84:invokestatic    #139 <Method zzxg zzbv.zzfd()>
	//   45   87:pop             
		zzbrw = zzxg.zza(jsonobject, "clickurl");
	//   46   88:aload_0         
	//   47   89:aload_1         
	//   48   90:ldc1            #141 <String "clickurl">
	//   49   92:invokestatic    #147 <Method List zzxg.zza(JSONObject, String)>
	//   50   95:putfield        #49  <Field List zzbrw>
		zzbv.zzfd();
	//   51   98:invokestatic    #139 <Method zzxg zzbv.zzfd()>
	//   52  101:pop             
		zzbrx = zzxg.zza(jsonobject, "imp_urls");
	//   53  102:aload_0         
	//   54  103:aload_1         
	//   55  104:ldc1            #149 <String "imp_urls">
	//   56  106:invokestatic    #147 <Method List zzxg.zza(JSONObject, String)>
	//   57  109:putfield        #51  <Field List zzbrx>
		zzbv.zzfd();
	//   58  112:invokestatic    #139 <Method zzxg zzbv.zzfd()>
	//   59  115:pop             
		zzbry = zzxg.zza(jsonobject, "downloaded_imp_urls");
	//   60  116:aload_0         
	//   61  117:aload_1         
	//   62  118:ldc1            #151 <String "downloaded_imp_urls">
	//   63  120:invokestatic    #147 <Method List zzxg.zza(JSONObject, String)>
	//   64  123:putfield        #53  <Field List zzbry>
		zzbv.zzfd();
	//   65  126:invokestatic    #139 <Method zzxg zzbv.zzfd()>
	//   66  129:pop             
		zzbsa = zzxg.zza(jsonobject, "fill_urls");
	//   67  130:aload_0         
	//   68  131:aload_1         
	//   69  132:ldc1            #153 <String "fill_urls">
	//   70  134:invokestatic    #147 <Method List zzxg.zza(JSONObject, String)>
	//   71  137:putfield        #75  <Field List zzbsa>
		zzbv.zzfd();
	//   72  140:invokestatic    #139 <Method zzxg zzbv.zzfd()>
	//   73  143:pop             
		zzbsc = zzxg.zza(jsonobject, "video_start_urls");
	//   74  144:aload_0         
	//   75  145:aload_1         
	//   76  146:ldc1            #155 <String "video_start_urls">
	//   77  148:invokestatic    #147 <Method List zzxg.zza(JSONObject, String)>
	//   78  151:putfield        #59  <Field List zzbsc>
		zzbv.zzfd();
	//   79  154:invokestatic    #139 <Method zzxg zzbv.zzfd()>
	//   80  157:pop             
		zzbse = zzxg.zza(jsonobject, "video_complete_urls");
	//   81  158:aload_0         
	//   82  159:aload_1         
	//   83  160:ldc1            #157 <String "video_complete_urls">
	//   84  162:invokestatic    #147 <Method List zzxg.zza(JSONObject, String)>
	//   85  165:putfield        #63  <Field List zzbse>
		zzbv.zzfd();
	//   86  168:invokestatic    #139 <Method zzxg zzbv.zzfd()>
	//   87  171:pop             
		obj = ((Object) (zzxg.zza(jsonobject, "video_reward_urls")));
	//   88  172:aload_1         
	//   89  173:ldc1            #159 <String "video_reward_urls">
	//   90  175:invokestatic    #147 <Method List zzxg.zza(JSONObject, String)>
	//   91  178:astore_3        
		obj1 = ((Object) (zznk.zzaxv));
	//   92  179:getstatic       #165 <Field zzna zznk.zzaxv>
	//   93  182:astore          4
		if(!((Boolean)zzkb.zzik().zzd(((zzna) (obj1)))).booleanValue())
	//*  94  184:invokestatic    #171 <Method zzni zzkb.zzik()>
	//*  95  187:aload           4
	//*  96  189:invokevirtual   #177 <Method Object zzni.zzd(zzna)>
	//*  97  192:checkcast       #179 <Class Boolean>
	//*  98  195:invokevirtual   #183 <Method boolean Boolean.booleanValue()>
	//*  99  198:ifeq            204
	//* 100  201:goto            209
			obj = ((Object) (zzbse));
	//  101  204:aload_0         
	//  102  205:getfield        #63  <Field List zzbse>
	//  103  208:astore_3        
		zzbsd = ((List) (obj));
	//  104  209:aload_0         
	//  105  210:aload_3         
	//  106  211:putfield        #61  <Field List zzbsd>
		obj1 = ((Object) (jsonobject.optJSONObject("ad")));
	//  107  214:aload_1         
	//  108  215:ldc1            #185 <String "ad">
	//  109  217:invokevirtual   #189 <Method JSONObject JSONObject.optJSONObject(String)>
	//  110  220:astore          4
		if(obj1 != null)
	//* 111  222:aload           4
	//* 112  224:ifnull          242
		{
			zzbv.zzfd();
	//  113  227:invokestatic    #139 <Method zzxg zzbv.zzfd()>
	//  114  230:pop             
			obj = ((Object) (zzxg.zza(((JSONObject) (obj1)), "manual_impression_urls")));
	//  115  231:aload           4
	//  116  233:ldc1            #191 <String "manual_impression_urls">
	//  117  235:invokestatic    #147 <Method List zzxg.zza(JSONObject, String)>
	//  118  238:astore_3        
		} else
	//* 119  239:goto            244
		{
			obj = null;
	//  120  242:aconst_null     
	//  121  243:astore_3        
		}
		zzbrz = ((List) (obj));
	//  122  244:aload_0         
	//  123  245:aload_3         
	//  124  246:putfield        #55  <Field List zzbrz>
		if(obj1 != null)
	//* 125  249:aload           4
	//* 126  251:ifnull          263
			obj = ((Object) (((JSONObject) (obj1)).toString()));
	//  127  254:aload           4
	//  128  256:invokevirtual   #195 <Method String JSONObject.toString()>
	//  129  259:astore_3        
		else
	//* 130  260:goto            265
			obj = null;
	//  131  263:aconst_null     
	//  132  264:astore_3        
		zzbrr = ((String) (obj));
	//  133  265:aload_0         
	//  134  266:aload_3         
	//  135  267:putfield        #39  <Field String zzbrr>
		obj1 = ((Object) (jsonobject.optJSONObject("data")));
	//  136  270:aload_1         
	//  137  271:ldc1            #197 <String "data">
	//  138  273:invokevirtual   #189 <Method JSONObject JSONObject.optJSONObject(String)>
	//  139  276:astore          4
		if(obj1 != null)
	//* 140  278:aload           4
	//* 141  280:ifnull          292
			obj = ((Object) (((JSONObject) (obj1)).toString()));
	//  142  283:aload           4
	//  143  285:invokevirtual   #195 <Method String JSONObject.toString()>
	//  144  288:astore_3        
		else
	//* 145  289:goto            294
			obj = null;
	//  146  292:aconst_null     
	//  147  293:astore_3        
		zzbsb = ((String) (obj));
	//  148  294:aload_0         
	//  149  295:aload_3         
	//  150  296:putfield        #57  <Field String zzbsb>
		if(obj1 != null)
	//* 151  299:aload           4
	//* 152  301:ifnull          315
			obj = ((Object) (((JSONObject) (obj1)).optString("class_name")));
	//  153  304:aload           4
	//  154  306:ldc1            #199 <String "class_name">
	//  155  308:invokevirtual   #95  <Method String JSONObject.optString(String)>
	//  156  311:astore_3        
		else
	//* 157  312:goto            317
			obj = null;
	//  158  315:aconst_null     
	//  159  316:astore_3        
		zzbrv = ((String) (obj));
	//  160  317:aload_0         
	//  161  318:aload_3         
	//  162  319:putfield        #47  <Field String zzbrv>
		zzbsf = jsonobject.optString("html_template", ((String) (null)));
	//  163  322:aload_0         
	//  164  323:aload_1         
	//  165  324:ldc1            #201 <String "html_template">
	//  166  326:aconst_null     
	//  167  327:invokevirtual   #133 <Method String JSONObject.optString(String, String)>
	//  168  330:putfield        #65  <Field String zzbsf>
		zzbsg = jsonobject.optString("ad_base_url", ((String) (null)));
	//  169  333:aload_0         
	//  170  334:aload_1         
	//  171  335:ldc1            #203 <String "ad_base_url">
	//  172  337:aconst_null     
	//  173  338:invokevirtual   #133 <Method String JSONObject.optString(String, String)>
	//  174  341:putfield        #67  <Field String zzbsg>
		obj = ((Object) (jsonobject.optJSONObject("assets")));
	//  175  344:aload_1         
	//  176  345:ldc1            #205 <String "assets">
	//  177  347:invokevirtual   #189 <Method JSONObject JSONObject.optJSONObject(String)>
	//  178  350:astore_3        
		if(obj != null)
	//* 179  351:aload_3         
	//* 180  352:ifnull          363
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//  181  355:aload_3         
	//  182  356:invokevirtual   #195 <Method String JSONObject.toString()>
	//  183  359:astore_3        
		else
	//* 184  360:goto            365
			obj = null;
	//  185  363:aconst_null     
	//  186  364:astore_3        
		zzbsh = ((String) (obj));
	//  187  365:aload_0         
	//  188  366:aload_3         
	//  189  367:putfield        #69  <Field String zzbsh>
		zzbv.zzfd();
	//  190  370:invokestatic    #139 <Method zzxg zzbv.zzfd()>
	//  191  373:pop             
		zzbsi = zzxg.zza(jsonobject, "template_ids");
	//  192  374:aload_0         
	//  193  375:aload_1         
	//  194  376:ldc1            #207 <String "template_ids">
	//  195  378:invokestatic    #147 <Method List zzxg.zza(JSONObject, String)>
	//  196  381:putfield        #71  <Field List zzbsi>
		obj = ((Object) (jsonobject.optJSONObject("ad_loader_options")));
	//  197  384:aload_1         
	//  198  385:ldc1            #209 <String "ad_loader_options">
	//  199  387:invokevirtual   #189 <Method JSONObject JSONObject.optJSONObject(String)>
	//  200  390:astore_3        
		if(obj != null)
	//* 201  391:aload_3         
	//* 202  392:ifnull          403
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//  203  395:aload_3         
	//  204  396:invokevirtual   #195 <Method String JSONObject.toString()>
	//  205  399:astore_3        
		else
	//* 206  400:goto            405
			obj = null;
	//  207  403:aconst_null     
	//  208  404:astore_3        
		zzbsj = ((String) (obj));
	//  209  405:aload_0         
	//  210  406:aload_3         
	//  211  407:putfield        #73  <Field String zzbsj>
		zzbsk = jsonobject.optString("response_type", ((String) (null)));
	//  212  410:aload_0         
	//  213  411:aload_1         
	//  214  412:ldc1            #211 <String "response_type">
	//  215  414:aconst_null     
	//  216  415:invokevirtual   #133 <Method String JSONObject.optString(String, String)>
	//  217  418:putfield        #77  <Field String zzbsk>
		zzbsl = jsonobject.optLong("ad_network_timeout_millis", -1L);
	//  218  421:aload_0         
	//  219  422:aload_1         
	//  220  423:ldc1            #213 <String "ad_network_timeout_millis">
	//  221  425:ldc2w           #78  <Long -1L>
	//  222  428:invokevirtual   #217 <Method long JSONObject.optLong(String, long)>
	//  223  431:putfield        #81  <Field long zzbsl>
	//  224  434:return          
	}

	public final boolean zzmf()
	{
		return "banner".equalsIgnoreCase(zzbsk);
	//    0    0:ldc1            #221 <String "banner">
	//    1    2:aload_0         
	//    2    3:getfield        #77  <Field String zzbsk>
	//    3    6:invokevirtual   #227 <Method boolean String.equalsIgnoreCase(String)>
	//    4    9:ireturn         
	}

	public final boolean zzmg()
	{
		return "native".equalsIgnoreCase(zzbsk);
	//    0    0:ldc1            #230 <String "native">
	//    1    2:aload_0         
	//    2    3:getfield        #77  <Field String zzbsk>
	//    3    6:invokevirtual   #227 <Method boolean String.equalsIgnoreCase(String)>
	//    4    9:ireturn         
	}

	public final String zzbrr;
	public final String zzbrs;
	public final List zzbrt;
	public final String zzbru;
	public final String zzbrv;
	public final List zzbrw;
	public final List zzbrx;
	public final List zzbry;
	public final List zzbrz;
	public final List zzbsa;
	public final String zzbsb;
	public final List zzbsc;
	public final List zzbsd;
	public final List zzbse;
	public final String zzbsf;
	public final String zzbsg;
	public final String zzbsh;
	public final List zzbsi;
	public final String zzbsj;
	private final String zzbsk;
	public final long zzbsl;
}
