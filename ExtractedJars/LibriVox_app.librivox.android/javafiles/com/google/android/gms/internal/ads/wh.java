// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.aw;
import java.util.*;
import org.json.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, jw, wi

public final class wh
{

	public wh(String s, long l)
	{
		boolean flag;
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		b = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #28  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void ArrayList()>
	//    6   12:putfield        #31  <Field List b>
		c = ((List) (new ArrayList()));
	//    7   15:aload_0         
	//    8   16:new             #28  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void ArrayList()>
	//   11   23:putfield        #33  <Field List c>
		d = ((Map) (new HashMap()));
	//   12   26:aload_0         
	//   13   27:new             #35  <Class HashMap>
	//   14   30:dup             
	//   15   31:invokespecial   #36  <Method void HashMap()>
	//   16   34:putfield        #38  <Field Map d>
		flag = false;
	//   17   37:iconst_0        
	//   18   38:istore          5
		h = false;
	//   19   40:aload_0         
	//   20   41:iconst_0        
	//   21   42:putfield        #40  <Field boolean h>
		f = s;
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:putfield        #42  <Field String f>
		a = l;
	//   25   50:aload_0         
	//   26   51:lload_2         
	//   27   52:putfield        #44  <Field long a>
		if(TextUtils.isEmpty(((CharSequence) (s)))) goto _L2; else goto _L1
	//   28   55:aload_1         
	//   29   56:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   30   59:ifne            338
_L1:
		g = new JSONObject(s);
	//   31   62:aload_0         
	//   32   63:new             #52  <Class JSONObject>
	//   33   66:dup             
	//   34   67:aload_1         
	//   35   68:invokespecial   #55  <Method void JSONObject(String)>
	//   36   71:putfield        #57  <Field JSONObject g>
		if(g.optInt("status", -1) != 1)
	//*  37   74:aload_0         
	//*  38   75:getfield        #57  <Field JSONObject g>
	//*  39   78:ldc1            #59  <String "status">
	//*  40   80:iconst_m1       
	//*  41   81:invokevirtual   #63  <Method int JSONObject.optInt(String, int)>
	//*  42   84:iconst_1        
	//*  43   85:icmpeq          99
		{
			h = false;
	//   44   88:aload_0         
	//   45   89:iconst_0        
	//   46   90:putfield        #40  <Field boolean h>
			wx.e("App settings could not be fetched successfully.");
	//   47   93:ldc1            #65  <String "App settings could not be fetched successfully.">
	//   48   95:invokestatic    #69  <Method void wx.e(String)>
			return;
	//   49   98:return          
		}
		h = true;
	//   50   99:aload_0         
	//   51  100:iconst_1        
	//   52  101:putfield        #40  <Field boolean h>
		e = g.optString("app_id");
	//   53  104:aload_0         
	//   54  105:aload_0         
	//   55  106:getfield        #57  <Field JSONObject g>
	//   56  109:ldc1            #71  <String "app_id">
	//   57  111:invokevirtual   #75  <Method String JSONObject.optString(String)>
	//   58  114:putfield        #77  <Field String e>
		s = ((String) (g.optJSONArray("ad_unit_id_settings")));
	//   59  117:aload_0         
	//   60  118:getfield        #57  <Field JSONObject g>
	//   61  121:ldc1            #79  <String "ad_unit_id_settings">
	//   62  123:invokevirtual   #83  <Method JSONArray JSONObject.optJSONArray(String)>
	//   63  126:astore_1        
		if(s == null) goto _L4; else goto _L3
	//   64  127:aload_1         
	//   65  128:ifnull          265
_L3:
		int i = 0;
	//   66  131:iconst_0        
	//   67  132:istore          4
_L16:
		if(i >= ((JSONArray) (s)).length()) goto _L4; else goto _L5
	//   68  134:iload           4
	//   69  136:aload_1         
	//   70  137:invokevirtual   #89  <Method int JSONArray.length()>
	//   71  140:icmpge          265
_L5:
		String s1;
		Object obj;
		String s3;
		obj = ((Object) (((JSONArray) (s)).getJSONObject(i)));
	//   72  143:aload_1         
	//   73  144:iload           4
	//   74  146:invokevirtual   #93  <Method JSONObject JSONArray.getJSONObject(int)>
	//   75  149:astore          7
		s3 = ((JSONObject) (obj)).optString("format");
	//   76  151:aload           7
	//   77  153:ldc1            #95  <String "format">
	//   78  155:invokevirtual   #75  <Method String JSONObject.optString(String)>
	//   79  158:astore          8
		s1 = ((JSONObject) (obj)).optString("ad_unit_id");
	//   80  160:aload           7
	//   81  162:ldc1            #97  <String "ad_unit_id">
	//   82  164:invokevirtual   #75  <Method String JSONObject.optString(String)>
	//   83  167:astore          6
		if(!TextUtils.isEmpty(((CharSequence) (s3))) && !TextUtils.isEmpty(((CharSequence) (s1)))) goto _L7; else goto _L6
	//   84  169:aload           8
	//   85  171:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   86  174:ifne            339
	//   87  177:aload           6
	//   88  179:invokestatic    #50  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   89  182:ifeq            188
	//*  90  185:goto            339
_L7:
		if(!"interstitial".equalsIgnoreCase(s3)) goto _L9; else goto _L8
	//   91  188:ldc1            #99  <String "interstitial">
	//   92  190:aload           8
	//   93  192:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//   94  195:ifeq            213
_L8:
		c.add(((Object) (s1)));
	//   95  198:aload_0         
	//   96  199:getfield        #33  <Field List c>
	//   97  202:aload           6
	//   98  204:invokeinterface #111 <Method boolean List.add(Object)>
	//   99  209:pop             
		  goto _L6
	//* 100  210:goto            339
_L9:
		if(!"rewarded".equalsIgnoreCase(s3)) goto _L6; else goto _L10
	//  101  213:ldc1            #113 <String "rewarded">
	//  102  215:aload           8
	//  103  217:invokevirtual   #105 <Method boolean String.equalsIgnoreCase(String)>
	//  104  220:ifeq            339
_L10:
		obj = ((Object) (((JSONObject) (obj)).optJSONObject("mediation_config")));
	//  105  223:aload           7
	//  106  225:ldc1            #115 <String "mediation_config">
	//  107  227:invokevirtual   #119 <Method JSONObject JSONObject.optJSONObject(String)>
	//  108  230:astore          7
		if(obj == null) goto _L6; else goto _L11
	//  109  232:aload           7
	//  110  234:ifnull          339
_L11:
		obj = ((Object) (new jw(((JSONObject) (obj)))));
	//  111  237:new             #121 <Class jw>
	//  112  240:dup             
	//  113  241:aload           7
	//  114  243:invokespecial   #124 <Method void jw(JSONObject)>
	//  115  246:astore          7
		d.put(((Object) (s1)), obj);
	//  116  248:aload_0         
	//  117  249:getfield        #38  <Field Map d>
	//  118  252:aload           6
	//  119  254:aload           7
	//  120  256:invokeinterface #130 <Method Object Map.put(Object, Object)>
	//  121  261:pop             
		  goto _L6
	//* 122  262:goto            339
_L4:
		s = ((String) (g.optJSONArray("persistable_banner_ad_unit_ids")));
	//  123  265:aload_0         
	//  124  266:getfield        #57  <Field JSONObject g>
	//  125  269:ldc1            #132 <String "persistable_banner_ad_unit_ids">
	//  126  271:invokevirtual   #83  <Method JSONArray JSONObject.optJSONArray(String)>
	//  127  274:astore_1        
		if(s == null) goto _L13; else goto _L12
	//  128  275:aload_1         
	//  129  276:ifnull          321
_L12:
		i = ((int) (flag));
	//  130  279:iload           5
	//  131  281:istore          4
_L14:
		if(i >= ((JSONArray) (s)).length())
			break; /* Loop/switch isn't completed */
	//  132  283:iload           4
	//  133  285:aload_1         
	//  134  286:invokevirtual   #89  <Method int JSONArray.length()>
	//  135  289:icmpge          321
		String s2 = ((JSONArray) (s)).optString(i);
	//  136  292:aload_1         
	//  137  293:iload           4
	//  138  295:invokevirtual   #135 <Method String JSONArray.optString(int)>
	//  139  298:astore          6
		b.add(((Object) (s2)));
	//  140  300:aload_0         
	//  141  301:getfield        #31  <Field List b>
	//  142  304:aload           6
	//  143  306:invokeinterface #111 <Method boolean List.add(Object)>
	//  144  311:pop             
		i++;
	//  145  312:iload           4
	//  146  314:iconst_1        
	//  147  315:iadd            
	//  148  316:istore          4
		if(true) goto _L14; else goto _L13
	//  149  318:goto            283
_L13:
		return;
	//  150  321:return          
		s;
	//  151  322:astore_1        
		wx.c("Exception occurred while processing app setting json", ((Throwable) (s)));
	//  152  323:ldc1            #137 <String "Exception occurred while processing app setting json">
	//  153  325:aload_1         
	//  154  326:invokestatic    #140 <Method void wx.c(String, Throwable)>
		aw.i().a(((Throwable) (s)), "AppSettings.parseAppSettingsJson");
	//  155  329:invokestatic    #146 <Method wi aw.i()>
	//  156  332:aload_1         
	//  157  333:ldc1            #148 <String "AppSettings.parseAppSettingsJson">
	//  158  335:invokevirtual   #153 <Method void wi.a(Throwable, String)>
_L2:
		return;
	//  159  338:return          
_L6:
		i++;
	//  160  339:iload           4
	//  161  341:iconst_1        
	//  162  342:iadd            
	//  163  343:istore          4
		if(true) goto _L16; else goto _L15
	//  164  345:goto            134
_L15:
	}

	public final long a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long a>
	//    2    4:lreturn         
	}

	public final boolean b()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean h>
	//    2    4:ireturn         
	}

	public final String c()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String f>
	//    2    4:areturn         
	}

	public final String d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String e>
	//    2    4:areturn         
	}

	public final Map e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Map d>
	//    2    4:areturn         
	}

	private final long a;
	private final List b;
	private final List c;
	private final Map d;
	private String e;
	private String f;
	private JSONObject g;
	private boolean h;
}
