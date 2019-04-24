// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzwy, zzajm

public final class zzajl
{

	public zzajl(String s, long l)
	{
		boolean flag;
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		zzcpf = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field List zzcpf>
		zzcpg = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #28  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void ArrayList()>
	//   11   23:putfield        #33  <Field List zzcpg>
		zzcph = ((Map) (new HashMap()));
	//   12   26:aload_0         
	//   13   27:new             #35  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #36  <Method void HashMap()>
	//   16   34:putfield        #38  <Field Map zzcph>
		flag = false;
	//   17   37:iconst_0        
	//   18   38:istore          5
		zzcpk = false;
	//   19   40:aload_0         
	//   20   41:iconst_0        
	//   21   42:putfield        #40  <Field boolean zzcpk>
		zzcpj = s;
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:putfield        #42  <Field String zzcpj>
		zzcpe = l;
	//   25   50:aload_0         
	//   26   51:lload_2         
	//   27   52:putfield        #44  <Field long zzcpe>
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//   28   55:aload_1         
	//   29   56:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   30   59:ifne            327
_L1:
		s = ((String) (new JSONObject(s)));
	//   31   62:new             #52  <Class JSONObject>
	//   32   65:dup             
	//   33   66:aload_1         
	//   34   67:invokespecial   #55  <Method void JSONObject(String)>
	//   35   70:astore_1        
		if(((JSONObject) (s)).optInt("status", -1) != 1)
	//*  36   71:aload_1         
	//*  37   72:ldc1            #57  <String "status">
	//*  38   74:iconst_m1       
	//*  39   75:invokevirtual   #61  <Method int JSONObject.optInt(String, int)>
	//*  40   78:iconst_1        
	//*  41   79:icmpeq          93
		{
			zzcpk = false;
	//   42   82:aload_0         
	//   43   83:iconst_0        
	//   44   84:putfield        #40  <Field boolean zzcpk>
			zzakb.zzdk("App settings could not be fetched successfully.");
	//   45   87:ldc1            #63  <String "App settings could not be fetched successfully.">
	//   46   89:invokestatic    #68  <Method void zzakb.zzdk(String)>
			return;
	//   47   92:return          
		}
		JSONArray jsonarray;
		zzcpk = true;
	//   48   93:aload_0         
	//   49   94:iconst_1        
	//   50   95:putfield        #40  <Field boolean zzcpk>
		zzcpi = ((JSONObject) (s)).optString("app_id");
	//   51   98:aload_0         
	//   52   99:aload_1         
	//   53  100:ldc1            #70  <String "app_id">
	//   54  102:invokevirtual   #74  <Method String JSONObject.optString(String)>
	//   55  105:putfield        #76  <Field String zzcpi>
		jsonarray = ((JSONObject) (s)).optJSONArray("ad_unit_id_settings");
	//   56  108:aload_1         
	//   57  109:ldc1            #78  <String "ad_unit_id_settings">
	//   58  111:invokevirtual   #82  <Method JSONArray JSONObject.optJSONArray(String)>
	//   59  114:astore          6
		if(jsonarray == null) goto _L4; else goto _L3
	//   60  116:aload           6
	//   61  118:ifnull          257
_L3:
		int i = 0;
	//   62  121:iconst_0        
	//   63  122:istore          4
_L16:
		if(i >= jsonarray.length()) goto _L4; else goto _L5
	//   64  124:iload           4
	//   65  126:aload           6
	//   66  128:invokevirtual   #88  <Method int JSONArray.length()>
	//   67  131:icmpge          257
_L5:
		String s2;
		Object obj;
		String s3;
		obj = ((Object) (jsonarray.getJSONObject(i)));
	//   68  134:aload           6
	//   69  136:iload           4
	//   70  138:invokevirtual   #92  <Method JSONObject JSONArray.getJSONObject(int)>
	//   71  141:astore          8
		s3 = ((JSONObject) (obj)).optString("format");
	//   72  143:aload           8
	//   73  145:ldc1            #94  <String "format">
	//   74  147:invokevirtual   #74  <Method String JSONObject.optString(String)>
	//   75  150:astore          9
		s2 = ((JSONObject) (obj)).optString("ad_unit_id");
	//   76  152:aload           8
	//   77  154:ldc1            #96  <String "ad_unit_id">
	//   78  156:invokevirtual   #74  <Method String JSONObject.optString(String)>
	//   79  159:astore          7
		if(!TextUtils.isEmpty(((CharSequence) (s3))) && !TextUtils.isEmpty(((CharSequence) (s2)))) goto _L7; else goto _L6
	//   80  161:aload           9
	//   81  163:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   82  166:ifne            328
	//   83  169:aload           7
	//   84  171:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   85  174:ifeq            180
	//*  86  177:goto            328
_L7:
		if(!"interstitial".equalsIgnoreCase(s3)) goto _L9; else goto _L8
	//   87  180:ldc1            #98  <String "interstitial">
	//   88  182:aload           9
	//   89  184:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
	//   90  187:ifeq            205
_L8:
		zzcpg.add(((Object) (s2)));
	//   91  190:aload_0         
	//   92  191:getfield        #33  <Field List zzcpg>
	//   93  194:aload           7
	//   94  196:invokeinterface #110 <Method boolean List.add(Object)>
	//   95  201:pop             
		  goto _L6
	//*  96  202:goto            328
_L9:
		if(!"rewarded".equalsIgnoreCase(s3)) goto _L6; else goto _L10
	//   97  205:ldc1            #112 <String "rewarded">
	//   98  207:aload           9
	//   99  209:invokevirtual   #104 <Method boolean String.equalsIgnoreCase(String)>
	//  100  212:ifeq            328
_L10:
		obj = ((Object) (((JSONObject) (obj)).optJSONObject("mediation_config")));
	//  101  215:aload           8
	//  102  217:ldc1            #114 <String "mediation_config">
	//  103  219:invokevirtual   #118 <Method JSONObject JSONObject.optJSONObject(String)>
	//  104  222:astore          8
		if(obj == null) goto _L6; else goto _L11
	//  105  224:aload           8
	//  106  226:ifnull          328
_L11:
		obj = ((Object) (new zzwy(((JSONObject) (obj)))));
	//  107  229:new             #120 <Class zzwy>
	//  108  232:dup             
	//  109  233:aload           8
	//  110  235:invokespecial   #123 <Method void zzwy(JSONObject)>
	//  111  238:astore          8
		zzcph.put(((Object) (s2)), obj);
	//  112  240:aload_0         
	//  113  241:getfield        #38  <Field Map zzcph>
	//  114  244:aload           7
	//  115  246:aload           8
	//  116  248:invokeinterface #129 <Method Object Map.put(Object, Object)>
	//  117  253:pop             
		  goto _L6
	//* 118  254:goto            328
_L4:
		s = ((String) (((JSONObject) (s)).optJSONArray("persistable_banner_ad_unit_ids")));
	//  119  257:aload_1         
	//  120  258:ldc1            #131 <String "persistable_banner_ad_unit_ids">
	//  121  260:invokevirtual   #82  <Method JSONArray JSONObject.optJSONArray(String)>
	//  122  263:astore_1        
		if(s == null) goto _L13; else goto _L12
	//  123  264:aload_1         
	//  124  265:ifnull          310
_L12:
		i = ((int) (flag));
	//  125  268:iload           5
	//  126  270:istore          4
_L14:
		if(i >= ((JSONArray) (s)).length())
			break; /* Loop/switch isn't completed */
	//  127  272:iload           4
	//  128  274:aload_1         
	//  129  275:invokevirtual   #88  <Method int JSONArray.length()>
	//  130  278:icmpge          310
		String s1 = ((JSONArray) (s)).optString(i);
	//  131  281:aload_1         
	//  132  282:iload           4
	//  133  284:invokevirtual   #134 <Method String JSONArray.optString(int)>
	//  134  287:astore          6
		zzcpf.add(((Object) (s1)));
	//  135  289:aload_0         
	//  136  290:getfield        #31  <Field List zzcpf>
	//  137  293:aload           6
	//  138  295:invokeinterface #110 <Method boolean List.add(Object)>
	//  139  300:pop             
		i++;
	//  140  301:iload           4
	//  141  303:iconst_1        
	//  142  304:iadd            
	//  143  305:istore          4
		if(true) goto _L14; else goto _L13
	//  144  307:goto            272
_L13:
		return;
	//  145  310:return          
		s;
	//  146  311:astore_1        
		zzakb.zzc("Exception occurred while processing app setting json", ((Throwable) (s)));
	//  147  312:ldc1            #136 <String "Exception occurred while processing app setting json">
	//  148  314:aload_1         
	//  149  315:invokestatic    #140 <Method void zzakb.zzc(String, Throwable)>
		zzbv.zzeo().zza(((Throwable) (s)), "AppSettings.parseAppSettingsJson");
	//  150  318:invokestatic    #146 <Method zzajm zzbv.zzeo()>
	//  151  321:aload_1         
	//  152  322:ldc1            #148 <String "AppSettings.parseAppSettingsJson">
	//  153  324:invokevirtual   #154 <Method void zzajm.zza(Throwable, String)>
_L2:
		return;
	//  154  327:return          
_L6:
		i++;
	//  155  328:iload           4
	//  156  330:iconst_1        
	//  157  331:iadd            
	//  158  332:istore          4
		if(true) goto _L16; else goto _L15
	//  159  334:goto            124
_L15:
	}

	public final long zzps()
	{
		return zzcpe;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long zzcpe>
	//    2    4:lreturn         
	}

	public final boolean zzpt()
	{
		return zzcpk;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean zzcpk>
	//    2    4:ireturn         
	}

	public final String zzpu()
	{
		return zzcpj;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String zzcpj>
	//    2    4:areturn         
	}

	public final String zzpv()
	{
		return zzcpi;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field String zzcpi>
	//    2    4:areturn         
	}

	public final Map zzpw()
	{
		return zzcph;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Map zzcph>
	//    2    4:areturn         
	}

	private final long zzcpe;
	private final List zzcpf;
	private final List zzcpg;
	private final Map zzcph;
	private String zzcpi;
	private String zzcpj;
	private boolean zzcpk;
}
