// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzaej, zzakq, zzaig, 
//			zzael, zznk, zzkb, zzni, 
//			zzaiq, zzaef

public final class zzafx
{

	public zzafx(zzaef zzaef, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		zzcie = -1L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #61  <Long -1L>
	//    4    8:putfield        #64  <Field long zzcie>
		zzcif = false;
	//    5   11:aload_0         
	//    6   12:iconst_0        
	//    7   13:putfield        #66  <Field boolean zzcif>
	//    8   16:aload_0         
	//    9   17:ldc2w           #61  <Long -1L>
	//   10   20:putfield        #68  <Field long zzcig>
		zzcih = -1L;
	//   11   23:aload_0         
	//   12   24:ldc2w           #61  <Long -1L>
	//   13   27:putfield        #70  <Field long zzcih>
		mOrientation = -1;
	//   14   30:aload_0         
	//   15   31:iconst_m1       
	//   16   32:putfield        #72  <Field int mOrientation>
		zzcii = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #74  <Field boolean zzcii>
		zzcij = false;
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:putfield        #76  <Field boolean zzcij>
		zzcik = false;
	//   23   45:aload_0         
	//   24   46:iconst_0        
	//   25   47:putfield        #78  <Field boolean zzcik>
		zzcil = true;
	//   26   50:aload_0         
	//   27   51:iconst_1        
	//   28   52:putfield        #80  <Field boolean zzcil>
		zzcim = true;
	//   29   55:aload_0         
	//   30   56:iconst_1        
	//   31   57:putfield        #82  <Field boolean zzcim>
		zzcin = "";
	//   32   60:aload_0         
	//   33   61:ldc1            #84  <String "">
	//   34   63:putfield        #86  <Field String zzcin>
		zzcio = false;
	//   35   66:aload_0         
	//   36   67:iconst_0        
	//   37   68:putfield        #88  <Field boolean zzcio>
		zzbtn = false;
	//   38   71:aload_0         
	//   39   72:iconst_0        
	//   40   73:putfield        #90  <Field boolean zzbtn>
		zzcis = false;
	//   41   76:aload_0         
	//   42   77:iconst_0        
	//   43   78:putfield        #92  <Field boolean zzcis>
		zzcit = false;
	//   44   81:aload_0         
	//   45   82:iconst_0        
	//   46   83:putfield        #94  <Field boolean zzcit>
		zzchx = s;
	//   47   86:aload_0         
	//   48   87:aload_2         
	//   49   88:putfield        #96  <Field String zzchx>
		zzbuc = zzaef;
	//   50   91:aload_0         
	//   51   92:aload_1         
	//   52   93:putfield        #98  <Field zzaef zzbuc>
	//   53   96:return          
	}

	private static String zza(Map map, String s)
	{
		map = ((Map) ((List)map.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #107 <Method Object Map.get(Object)>
	//    3    7:checkcast       #109 <Class List>
	//    4   10:astore_0        
		if(map != null && !((List) (map)).isEmpty())
	//*   5   11:aload_0         
	//*   6   12:ifnull          35
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #113 <Method boolean List.isEmpty()>
	//*   9   21:ifne            35
			return (String)((List) (map)).get(0);
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:invokeinterface #116 <Method Object List.get(int)>
	//   13   31:checkcast       #118 <Class String>
	//   14   34:areturn         
		else
			return null;
	//   15   35:aconst_null     
	//   16   36:areturn         
	}

	private static long zzb(Map map, String s)
	{
		map = ((Map) ((List)map.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #107 <Method Object Map.get(Object)>
	//    3    7:checkcast       #109 <Class List>
	//    4   10:astore_0        
		if(map == null || ((List) (map)).isEmpty()) goto _L2; else goto _L1
	//    5   11:aload_0         
	//    6   12:ifnull          105
	//    7   15:aload_0         
	//    8   16:invokeinterface #113 <Method boolean List.isEmpty()>
	//    9   21:ifne            105
_L1:
		map = ((Map) ((String)((List) (map)).get(0)));
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:invokeinterface #116 <Method Object List.get(int)>
	//   13   31:checkcast       #118 <Class String>
	//   14   34:astore_0        
		float f = Float.parseFloat(((String) (map)));
	//   15   35:aload_0         
	//   16   36:invokestatic    #130 <Method float Float.parseFloat(String)>
	//   17   39:fstore_2        
		return (long)(f * 1000F);
	//   18   40:fload_2         
	//   19   41:ldc1            #131 <Float 1000F>
	//   20   43:fmul            
	//   21   44:f2l             
	//   22   45:lreturn         
_L4:
		StringBuilder stringbuilder = new StringBuilder(36 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (map))).length());
	//   23   46:new             #133 <Class StringBuilder>
	//   24   49:dup             
	//   25   50:bipush          36
	//   26   52:aload_1         
	//   27   53:invokestatic    #137 <Method String String.valueOf(Object)>
	//   28   56:invokevirtual   #141 <Method int String.length()>
	//   29   59:iadd            
	//   30   60:aload_0         
	//   31   61:invokestatic    #137 <Method String String.valueOf(Object)>
	//   32   64:invokevirtual   #141 <Method int String.length()>
	//   33   67:iadd            
	//   34   68:invokespecial   #144 <Method void StringBuilder(int)>
	//   35   71:astore_3        
		stringbuilder.append("Could not parse float from ");
	//   36   72:aload_3         
	//   37   73:ldc1            #146 <String "Could not parse float from ">
	//   38   75:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		stringbuilder.append(s);
	//   40   79:aload_3         
	//   41   80:aload_1         
	//   42   81:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   43   84:pop             
		stringbuilder.append(" header: ");
	//   44   85:aload_3         
	//   45   86:ldc1            #152 <String " header: ">
	//   46   88:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   47   91:pop             
		stringbuilder.append(((String) (map)));
	//   48   92:aload_3         
	//   49   93:aload_0         
	//   50   94:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//   51   97:pop             
		zzakb.zzdk(stringbuilder.toString());
	//   52   98:aload_3         
	//   53   99:invokevirtual   #156 <Method String StringBuilder.toString()>
	//   54  102:invokestatic    #162 <Method void zzakb.zzdk(String)>
_L2:
		return -1L;
	//   55  105:ldc2w           #61  <Long -1L>
	//   56  108:lreturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   57  109:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  58  110:goto            46
	}

	private static List zzc(Map map, String s)
	{
		map = ((Map) ((List)map.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #107 <Method Object Map.get(Object)>
	//    3    7:checkcast       #109 <Class List>
	//    4   10:astore_0        
		if(map != null && !((List) (map)).isEmpty())
	//*   5   11:aload_0         
	//*   6   12:ifnull          52
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #113 <Method boolean List.isEmpty()>
	//*   9   21:ifne            52
		{
			map = ((Map) ((String)((List) (map)).get(0)));
	//   10   24:aload_0         
	//   11   25:iconst_0        
	//   12   26:invokeinterface #116 <Method Object List.get(int)>
	//   13   31:checkcast       #118 <Class String>
	//   14   34:astore_0        
			if(map != null)
	//*  15   35:aload_0         
	//*  16   36:ifnull          52
				return Arrays.asList(((Object []) (((String) (map)).trim().split("\\s+"))));
	//   17   39:aload_0         
	//   18   40:invokevirtual   #168 <Method String String.trim()>
	//   19   43:ldc1            #170 <String "\\s+">
	//   20   45:invokevirtual   #174 <Method String[] String.split(String)>
	//   21   48:invokestatic    #180 <Method List Arrays.asList(Object[])>
	//   22   51:areturn         
		}
		return null;
	//   23   52:aconst_null     
	//   24   53:areturn         
	}

	private static boolean zzd(Map map, String s)
	{
		map = ((Map) ((List)map.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #107 <Method Object Map.get(Object)>
	//    3    7:checkcast       #109 <Class List>
	//    4   10:astore_0        
		if(map != null)
	//*   5   11:aload_0         
	//*   6   12:ifnull          43
		{
			if(((List) (map)).isEmpty())
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #113 <Method boolean List.isEmpty()>
	//*   9   21:ifeq            26
				return false;
	//   10   24:iconst_0        
	//   11   25:ireturn         
			else
				return Boolean.valueOf((String)((List) (map)).get(0)).booleanValue();
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:invokeinterface #116 <Method Object List.get(int)>
	//   15   33:checkcast       #118 <Class String>
	//   16   36:invokestatic    #188 <Method Boolean Boolean.valueOf(String)>
	//   17   39:invokevirtual   #191 <Method boolean Boolean.booleanValue()>
	//   18   42:ireturn         
		} else
		{
			return false;
	//   19   43:iconst_0        
	//   20   44:ireturn         
		}
	}

	public final zzaej zza(long l, boolean flag)
	{
		zzaef zzaef = zzbuc;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field zzaef zzbuc>
	//    2    4:astore          23
		String s = zzchx;
	//    3    6:aload_0         
	//    4    7:getfield        #96  <Field String zzchx>
	//    5   10:astore          24
		String s1 = zzbhy;
	//    6   12:aload_0         
	//    7   13:getfield        #195 <Field String zzbhy>
	//    8   16:astore          25
		List list = zzchy;
	//    9   18:aload_0         
	//   10   19:getfield        #197 <Field List zzchy>
	//   11   22:astore          26
		List list1 = zzcic;
	//   12   24:aload_0         
	//   13   25:getfield        #199 <Field List zzcic>
	//   14   28:astore          27
		long l1 = zzcie;
	//   15   30:aload_0         
	//   16   31:getfield        #64  <Field long zzcie>
	//   17   34:lstore          6
		boolean flag1 = zzcif;
	//   18   36:aload_0         
	//   19   37:getfield        #66  <Field boolean zzcif>
	//   20   40:istore          10
		List list2 = zzcab;
	//   21   42:aload_0         
	//   22   43:getfield        #201 <Field List zzcab>
	//   23   46:astore          28
		long l2 = zzcih;
	//   24   48:aload_0         
	//   25   49:getfield        #70  <Field long zzcih>
	//   26   52:lstore          8
		int i = mOrientation;
	//   27   54:aload_0         
	//   28   55:getfield        #72  <Field int mOrientation>
	//   29   58:istore          5
		String s2 = zzchw;
	//   30   60:aload_0         
	//   31   61:getfield        #203 <Field String zzchw>
	//   32   64:astore          29
		String s3 = zzcia;
	//   33   66:aload_0         
	//   34   67:getfield        #205 <Field String zzcia>
	//   35   70:astore          30
		String s4 = zzcib;
	//   36   72:aload_0         
	//   37   73:getfield        #207 <Field String zzcib>
	//   38   76:astore          31
		boolean flag2 = zzcii;
	//   39   78:aload_0         
	//   40   79:getfield        #74  <Field boolean zzcii>
	//   41   82:istore          11
		boolean flag3 = zzcij;
	//   42   84:aload_0         
	//   43   85:getfield        #76  <Field boolean zzcij>
	//   44   88:istore          12
		boolean flag4 = zzcik;
	//   45   90:aload_0         
	//   46   91:getfield        #78  <Field boolean zzcik>
	//   47   94:istore          13
		boolean flag5 = zzcil;
	//   48   96:aload_0         
	//   49   97:getfield        #80  <Field boolean zzcil>
	//   50  100:istore          14
		String s5 = zzcin;
	//   51  102:aload_0         
	//   52  103:getfield        #86  <Field String zzcin>
	//   53  106:astore          32
		boolean flag6 = zzcio;
	//   54  108:aload_0         
	//   55  109:getfield        #88  <Field boolean zzcio>
	//   56  112:istore          15
		boolean flag7 = zzbtn;
	//   57  114:aload_0         
	//   58  115:getfield        #90  <Field boolean zzbtn>
	//   59  118:istore          16
		zzaig zzaig1 = zzcip;
	//   60  120:aload_0         
	//   61  121:getfield        #209 <Field zzaig zzcip>
	//   62  124:astore          33
		List list3 = zzciq;
	//   63  126:aload_0         
	//   64  127:getfield        #211 <Field List zzciq>
	//   65  130:astore          34
		List list4 = zzcir;
	//   66  132:aload_0         
	//   67  133:getfield        #213 <Field List zzcir>
	//   68  136:astore          35
		boolean flag8 = zzcis;
	//   69  138:aload_0         
	//   70  139:getfield        #92  <Field boolean zzcis>
	//   71  142:istore          17
		zzael zzael1 = zzxe;
	//   72  144:aload_0         
	//   73  145:getfield        #215 <Field zzael zzxe>
	//   74  148:astore          36
		boolean flag9 = zzcit;
	//   75  150:aload_0         
	//   76  151:getfield        #94  <Field boolean zzcit>
	//   77  154:istore          18
		String s6 = zzciu;
	//   78  156:aload_0         
	//   79  157:getfield        #217 <Field String zzciu>
	//   80  160:astore          37
		List list5 = zzciv;
	//   81  162:aload_0         
	//   82  163:getfield        #219 <Field List zzciv>
	//   83  166:astore          38
		boolean flag10 = zzciw;
	//   84  168:aload_0         
	//   85  169:getfield        #221 <Field boolean zzciw>
	//   86  172:istore          19
		String s7 = zzcix;
	//   87  174:aload_0         
	//   88  175:getfield        #223 <Field String zzcix>
	//   89  178:astore          39
		zzaiq zzaiq1 = zzciy;
	//   90  180:aload_0         
	//   91  181:getfield        #225 <Field zzaiq zzciy>
	//   92  184:astore          40
		String s8 = zzchz;
	//   93  186:aload_0         
	//   94  187:getfield        #227 <Field String zzchz>
	//   95  190:astore          41
		boolean flag11 = zzcim;
	//   96  192:aload_0         
	//   97  193:getfield        #82  <Field boolean zzcim>
	//   98  196:istore          20
		boolean flag12 = zzciz;
	//   99  198:aload_0         
	//  100  199:getfield        #229 <Field boolean zzciz>
	//  101  202:istore          21
		boolean flag13 = zzcja;
	//  102  204:aload_0         
	//  103  205:getfield        #231 <Field boolean zzcja>
	//  104  208:istore          22
		byte byte0;
		if(flag)
	//* 105  210:iload_3         
	//* 106  211:ifeq            220
			byte0 = 2;
	//  107  214:iconst_2        
	//  108  215:istore          4
		else
	//* 109  217:goto            226
			byte0 = 1;
	//  110  220:iconst_1        
	//  111  221:istore          4
	//* 112  223:goto            217
		return new zzaej(zzaef, s, s1, list, list1, l1, flag1, -1L, list2, l2, i, s2, l, s3, s4, flag2, flag3, flag4, flag5, false, s5, flag6, flag7, zzaig1, list3, list4, flag8, zzael1, flag9, s6, list5, flag10, s7, zzaiq1, s8, flag11, flag12, flag13, ((int) (byte0)), zzcjb, zzcid, zzcjc, zzcae);
	//  113  226:new             #233 <Class zzaej>
	//  114  229:dup             
	//  115  230:aload           23
	//  116  232:aload           24
	//  117  234:aload           25
	//  118  236:aload           26
	//  119  238:aload           27
	//  120  240:lload           6
	//  121  242:iload           10
	//  122  244:ldc2w           #61  <Long -1L>
	//  123  247:aload           28
	//  124  249:lload           8
	//  125  251:iload           5
	//  126  253:aload           29
	//  127  255:lload_1         
	//  128  256:aload           30
	//  129  258:aload           31
	//  130  260:iload           11
	//  131  262:iload           12
	//  132  264:iload           13
	//  133  266:iload           14
	//  134  268:iconst_0        
	//  135  269:aload           32
	//  136  271:iload           15
	//  137  273:iload           16
	//  138  275:aload           33
	//  139  277:aload           34
	//  140  279:aload           35
	//  141  281:iload           17
	//  142  283:aload           36
	//  143  285:iload           18
	//  144  287:aload           37
	//  145  289:aload           38
	//  146  291:iload           19
	//  147  293:aload           39
	//  148  295:aload           40
	//  149  297:aload           41
	//  150  299:iload           20
	//  151  301:iload           21
	//  152  303:iload           22
	//  153  305:iload           4
	//  154  307:aload_0         
	//  155  308:getfield        #235 <Field boolean zzcjb>
	//  156  311:aload_0         
	//  157  312:getfield        #237 <Field List zzcid>
	//  158  315:aload_0         
	//  159  316:getfield        #239 <Field boolean zzcjc>
	//  160  319:aload_0         
	//  161  320:getfield        #241 <Field String zzcae>
	//  162  323:invokespecial   #244 <Method void zzaej(zzaef, String, String, List, List, long, boolean, long, List, long, int, String, long, String, String, boolean, boolean, boolean, boolean, boolean, String, boolean, boolean, zzaig, List, List, boolean, zzael, boolean, String, List, boolean, String, zzaiq, String, boolean, boolean, boolean, int, boolean, List, boolean, String)>
	//  163  326:areturn         
	}

	public final void zza(String s, Map map, String s1)
	{
		zzbhy = s1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #195 <Field String zzbhy>
		zzl(map);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #249 <Method void zzl(Map)>
	//    6   10:return          
	}

	public final void zzl(Map map)
	{
		Object obj;
		zzchw = zza(map, "X-Afma-Ad-Size");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #254 <String "X-Afma-Ad-Size">
	//    3    4:invokestatic    #256 <Method String zza(Map, String)>
	//    4    7:putfield        #203 <Field String zzchw>
		zzcix = zza(map, "X-Afma-Ad-Slot-Size");
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:ldc2            #258 <String "X-Afma-Ad-Slot-Size">
	//    8   15:invokestatic    #256 <Method String zza(Map, String)>
	//    9   18:putfield        #223 <Field String zzcix>
		obj = ((Object) (zzc(map, "X-Afma-Click-Tracking-Urls")));
	//   10   21:aload_1         
	//   11   22:ldc2            #260 <String "X-Afma-Click-Tracking-Urls">
	//   12   25:invokestatic    #262 <Method List zzc(Map, String)>
	//   13   28:astore          6
		if(obj != null)
	//*  14   30:aload           6
	//*  15   32:ifnull          41
			zzchy = ((List) (obj));
	//   16   35:aload_0         
	//   17   36:aload           6
	//   18   38:putfield        #197 <Field List zzchy>
		zzchz = zza(map, "X-Afma-Debug-Signals");
	//   19   41:aload_0         
	//   20   42:aload_1         
	//   21   43:ldc2            #264 <String "X-Afma-Debug-Signals">
	//   22   46:invokestatic    #256 <Method String zza(Map, String)>
	//   23   49:putfield        #227 <Field String zzchz>
		obj = ((Object) ((List)map.get("X-Afma-Debug-Dialog")));
	//   24   52:aload_1         
	//   25   53:ldc2            #266 <String "X-Afma-Debug-Dialog">
	//   26   56:invokeinterface #107 <Method Object Map.get(Object)>
	//   27   61:checkcast       #109 <Class List>
	//   28   64:astore          6
		if(obj != null && !((List) (obj)).isEmpty())
	//*  29   66:aload           6
	//*  30   68:ifnull          96
	//*  31   71:aload           6
	//*  32   73:invokeinterface #113 <Method boolean List.isEmpty()>
	//*  33   78:ifne            96
			zzcia = (String)((List) (obj)).get(0);
	//   34   81:aload_0         
	//   35   82:aload           6
	//   36   84:iconst_0        
	//   37   85:invokeinterface #116 <Method Object List.get(int)>
	//   38   90:checkcast       #118 <Class String>
	//   39   93:putfield        #205 <Field String zzcia>
		obj = ((Object) (zzc(map, "X-Afma-Tracking-Urls")));
	//   40   96:aload_1         
	//   41   97:ldc2            #268 <String "X-Afma-Tracking-Urls">
	//   42  100:invokestatic    #262 <Method List zzc(Map, String)>
	//   43  103:astore          6
		if(obj != null)
	//*  44  105:aload           6
	//*  45  107:ifnull          116
			zzcic = ((List) (obj));
	//   46  110:aload_0         
	//   47  111:aload           6
	//   48  113:putfield        #199 <Field List zzcic>
		obj = ((Object) (zzc(map, "X-Afma-Downloaded-Impression-Urls")));
	//   49  116:aload_1         
	//   50  117:ldc2            #270 <String "X-Afma-Downloaded-Impression-Urls">
	//   51  120:invokestatic    #262 <Method List zzc(Map, String)>
	//   52  123:astore          6
		if(obj != null)
	//*  53  125:aload           6
	//*  54  127:ifnull          136
			zzcid = ((List) (obj));
	//   55  130:aload_0         
	//   56  131:aload           6
	//   57  133:putfield        #237 <Field List zzcid>
		long l = zzb(map, "X-Afma-Interstitial-Timeout");
	//   58  136:aload_1         
	//   59  137:ldc2            #272 <String "X-Afma-Interstitial-Timeout">
	//   60  140:invokestatic    #274 <Method long zzb(Map, String)>
	//   61  143:lstore_3        
		if(l != -1L)
	//*  62  144:lload_3         
	//*  63  145:ldc2w           #61  <Long -1L>
	//*  64  148:lcmp            
	//*  65  149:ifeq            157
			zzcie = l;
	//   66  152:aload_0         
	//   67  153:lload_3         
	//   68  154:putfield        #64  <Field long zzcie>
		zzcif = zzcif | zzd(map, "X-Afma-Mediation");
	//   69  157:aload_0         
	//   70  158:aload_0         
	//   71  159:getfield        #66  <Field boolean zzcif>
	//   72  162:aload_1         
	//   73  163:ldc2            #276 <String "X-Afma-Mediation">
	//   74  166:invokestatic    #278 <Method boolean zzd(Map, String)>
	//   75  169:ior             
	//   76  170:putfield        #66  <Field boolean zzcif>
		obj = ((Object) (zzc(map, "X-Afma-Manual-Tracking-Urls")));
	//   77  173:aload_1         
	//   78  174:ldc2            #280 <String "X-Afma-Manual-Tracking-Urls">
	//   79  177:invokestatic    #262 <Method List zzc(Map, String)>
	//   80  180:astore          6
		if(obj != null)
	//*  81  182:aload           6
	//*  82  184:ifnull          193
			zzcab = ((List) (obj));
	//   83  187:aload_0         
	//   84  188:aload           6
	//   85  190:putfield        #201 <Field List zzcab>
		l = zzb(map, "X-Afma-Refresh-Rate");
	//   86  193:aload_1         
	//   87  194:ldc2            #282 <String "X-Afma-Refresh-Rate">
	//   88  197:invokestatic    #274 <Method long zzb(Map, String)>
	//   89  200:lstore_3        
		if(l != -1L)
	//*  90  201:lload_3         
	//*  91  202:ldc2w           #61  <Long -1L>
	//*  92  205:lcmp            
	//*  93  206:ifeq            214
			zzcih = l;
	//   94  209:aload_0         
	//   95  210:lload_3         
	//   96  211:putfield        #70  <Field long zzcih>
		obj = ((Object) ((List)map.get("X-Afma-Orientation")));
	//   97  214:aload_1         
	//   98  215:ldc2            #284 <String "X-Afma-Orientation">
	//   99  218:invokeinterface #107 <Method Object Map.get(Object)>
	//  100  223:checkcast       #109 <Class List>
	//  101  226:astore          6
		if(obj == null || ((List) (obj)).isEmpty()) goto _L2; else goto _L1
	//  102  228:aload           6
	//  103  230:ifnull          303
	//  104  233:aload           6
	//  105  235:invokeinterface #113 <Method boolean List.isEmpty()>
	//  106  240:ifne            303
_L1:
		obj = ((Object) ((String)((List) (obj)).get(0)));
	//  107  243:aload           6
	//  108  245:iconst_0        
	//  109  246:invokeinterface #116 <Method Object List.get(int)>
	//  110  251:checkcast       #118 <Class String>
	//  111  254:astore          6
		if(!"portrait".equalsIgnoreCase(((String) (obj)))) goto _L4; else goto _L3
	//  112  256:ldc2            #286 <String "portrait">
	//  113  259:aload           6
	//  114  261:invokevirtual   #290 <Method boolean String.equalsIgnoreCase(String)>
	//  115  264:ifeq            282
_L3:
		int i = zzbv.zzem().zzrm();
	//  116  267:invokestatic    #296 <Method zzakq zzbv.zzem()>
	//  117  270:invokevirtual   #301 <Method int zzakq.zzrm()>
	//  118  273:istore_2        
_L5:
		mOrientation = i;
	//  119  274:aload_0         
	//  120  275:iload_2         
	//  121  276:putfield        #72  <Field int mOrientation>
		break; /* Loop/switch isn't completed */
	//  122  279:goto            303
_L4:
		if(!"landscape".equalsIgnoreCase(((String) (obj))))
			break; /* Loop/switch isn't completed */
	//  123  282:ldc2            #303 <String "landscape">
	//  124  285:aload           6
	//  125  287:invokevirtual   #290 <Method boolean String.equalsIgnoreCase(String)>
	//  126  290:ifeq            303
		i = zzbv.zzem().zzrl();
	//  127  293:invokestatic    #296 <Method zzakq zzbv.zzem()>
	//  128  296:invokevirtual   #306 <Method int zzakq.zzrl()>
	//  129  299:istore_2        
		if(true) goto _L5; else goto _L2
	//  130  300:goto            274
_L2:
		zzcib = zza(map, "X-Afma-ActiveView");
	//  131  303:aload_0         
	//  132  304:aload_1         
	//  133  305:ldc2            #308 <String "X-Afma-ActiveView">
	//  134  308:invokestatic    #256 <Method String zza(Map, String)>
	//  135  311:putfield        #207 <Field String zzcib>
		Object obj1 = ((Object) ((List)map.get("X-Afma-Use-HTTPS")));
	//  136  314:aload_1         
	//  137  315:ldc2            #310 <String "X-Afma-Use-HTTPS">
	//  138  318:invokeinterface #107 <Method Object Map.get(Object)>
	//  139  323:checkcast       #109 <Class List>
	//  140  326:astore          6
		if(obj1 != null && !((List) (obj1)).isEmpty())
	//* 141  328:aload           6
	//* 142  330:ifnull          364
	//* 143  333:aload           6
	//* 144  335:invokeinterface #113 <Method boolean List.isEmpty()>
	//* 145  340:ifne            364
			zzcik = Boolean.valueOf((String)((List) (obj1)).get(0)).booleanValue();
	//  146  343:aload_0         
	//  147  344:aload           6
	//  148  346:iconst_0        
	//  149  347:invokeinterface #116 <Method Object List.get(int)>
	//  150  352:checkcast       #118 <Class String>
	//  151  355:invokestatic    #188 <Method Boolean Boolean.valueOf(String)>
	//  152  358:invokevirtual   #191 <Method boolean Boolean.booleanValue()>
	//  153  361:putfield        #78  <Field boolean zzcik>
		zzcii = zzcii | zzd(map, "X-Afma-Custom-Rendering-Allowed");
	//  154  364:aload_0         
	//  155  365:aload_0         
	//  156  366:getfield        #74  <Field boolean zzcii>
	//  157  369:aload_1         
	//  158  370:ldc2            #312 <String "X-Afma-Custom-Rendering-Allowed">
	//  159  373:invokestatic    #278 <Method boolean zzd(Map, String)>
	//  160  376:ior             
	//  161  377:putfield        #74  <Field boolean zzcii>
		zzcij = "native".equals(((Object) (zza(map, "X-Afma-Ad-Format"))));
	//  162  380:aload_0         
	//  163  381:ldc2            #314 <String "native">
	//  164  384:aload_1         
	//  165  385:ldc2            #316 <String "X-Afma-Ad-Format">
	//  166  388:invokestatic    #256 <Method String zza(Map, String)>
	//  167  391:invokevirtual   #320 <Method boolean String.equals(Object)>
	//  168  394:putfield        #76  <Field boolean zzcij>
		obj1 = ((Object) ((List)map.get("X-Afma-Content-Url-Opted-Out")));
	//  169  397:aload_1         
	//  170  398:ldc2            #322 <String "X-Afma-Content-Url-Opted-Out">
	//  171  401:invokeinterface #107 <Method Object Map.get(Object)>
	//  172  406:checkcast       #109 <Class List>
	//  173  409:astore          6
		if(obj1 != null && !((List) (obj1)).isEmpty())
	//* 174  411:aload           6
	//* 175  413:ifnull          447
	//* 176  416:aload           6
	//* 177  418:invokeinterface #113 <Method boolean List.isEmpty()>
	//* 178  423:ifne            447
			zzcil = Boolean.valueOf((String)((List) (obj1)).get(0)).booleanValue();
	//  179  426:aload_0         
	//  180  427:aload           6
	//  181  429:iconst_0        
	//  182  430:invokeinterface #116 <Method Object List.get(int)>
	//  183  435:checkcast       #118 <Class String>
	//  184  438:invokestatic    #188 <Method Boolean Boolean.valueOf(String)>
	//  185  441:invokevirtual   #191 <Method boolean Boolean.booleanValue()>
	//  186  444:putfield        #80  <Field boolean zzcil>
		obj1 = ((Object) ((List)map.get("X-Afma-Content-Vertical-Opted-Out")));
	//  187  447:aload_1         
	//  188  448:ldc2            #324 <String "X-Afma-Content-Vertical-Opted-Out">
	//  189  451:invokeinterface #107 <Method Object Map.get(Object)>
	//  190  456:checkcast       #109 <Class List>
	//  191  459:astore          6
		if(obj1 != null && !((List) (obj1)).isEmpty())
	//* 192  461:aload           6
	//* 193  463:ifnull          497
	//* 194  466:aload           6
	//* 195  468:invokeinterface #113 <Method boolean List.isEmpty()>
	//* 196  473:ifne            497
			zzcim = Boolean.valueOf((String)((List) (obj1)).get(0)).booleanValue();
	//  197  476:aload_0         
	//  198  477:aload           6
	//  199  479:iconst_0        
	//  200  480:invokeinterface #116 <Method Object List.get(int)>
	//  201  485:checkcast       #118 <Class String>
	//  202  488:invokestatic    #188 <Method Boolean Boolean.valueOf(String)>
	//  203  491:invokevirtual   #191 <Method boolean Boolean.booleanValue()>
	//  204  494:putfield        #82  <Field boolean zzcim>
		obj1 = ((Object) ((List)map.get("X-Afma-Gws-Query-Id")));
	//  205  497:aload_1         
	//  206  498:ldc2            #326 <String "X-Afma-Gws-Query-Id">
	//  207  501:invokeinterface #107 <Method Object Map.get(Object)>
	//  208  506:checkcast       #109 <Class List>
	//  209  509:astore          6
		if(obj1 != null && !((List) (obj1)).isEmpty())
	//* 210  511:aload           6
	//* 211  513:ifnull          541
	//* 212  516:aload           6
	//* 213  518:invokeinterface #113 <Method boolean List.isEmpty()>
	//* 214  523:ifne            541
			zzcin = (String)((List) (obj1)).get(0);
	//  215  526:aload_0         
	//  216  527:aload           6
	//  217  529:iconst_0        
	//  218  530:invokeinterface #116 <Method Object List.get(int)>
	//  219  535:checkcast       #118 <Class String>
	//  220  538:putfield        #86  <Field String zzcin>
		obj1 = ((Object) (zza(map, "X-Afma-Fluid")));
	//  221  541:aload_1         
	//  222  542:ldc2            #328 <String "X-Afma-Fluid">
	//  223  545:invokestatic    #256 <Method String zza(Map, String)>
	//  224  548:astore          6
		if(obj1 != null && ((String) (obj1)).equals("height"))
	//* 225  550:aload           6
	//* 226  552:ifnull          571
	//* 227  555:aload           6
	//* 228  557:ldc2            #330 <String "height">
	//* 229  560:invokevirtual   #320 <Method boolean String.equals(Object)>
	//* 230  563:ifeq            571
			zzcio = true;
	//  231  566:aload_0         
	//  232  567:iconst_1        
	//  233  568:putfield        #88  <Field boolean zzcio>
		zzbtn = "native_express".equals(((Object) (zza(map, "X-Afma-Ad-Format"))));
	//  234  571:aload_0         
	//  235  572:ldc2            #332 <String "native_express">
	//  236  575:aload_1         
	//  237  576:ldc2            #316 <String "X-Afma-Ad-Format">
	//  238  579:invokestatic    #256 <Method String zza(Map, String)>
	//  239  582:invokevirtual   #320 <Method boolean String.equals(Object)>
	//  240  585:putfield        #90  <Field boolean zzbtn>
		zzcip = zzaig.zzce(zza(map, "X-Afma-Rewards"));
	//  241  588:aload_0         
	//  242  589:aload_1         
	//  243  590:ldc2            #334 <String "X-Afma-Rewards">
	//  244  593:invokestatic    #256 <Method String zza(Map, String)>
	//  245  596:invokestatic    #340 <Method zzaig zzaig.zzce(String)>
	//  246  599:putfield        #209 <Field zzaig zzcip>
		if(zzciq == null)
	//* 247  602:aload_0         
	//* 248  603:getfield        #211 <Field List zzciq>
	//* 249  606:ifnonnull       620
			zzciq = zzc(map, "X-Afma-Reward-Video-Start-Urls");
	//  250  609:aload_0         
	//  251  610:aload_1         
	//  252  611:ldc2            #342 <String "X-Afma-Reward-Video-Start-Urls">
	//  253  614:invokestatic    #262 <Method List zzc(Map, String)>
	//  254  617:putfield        #211 <Field List zzciq>
		if(zzcir == null)
	//* 255  620:aload_0         
	//* 256  621:getfield        #213 <Field List zzcir>
	//* 257  624:ifnonnull       638
			zzcir = zzc(map, "X-Afma-Reward-Video-Complete-Urls");
	//  258  627:aload_0         
	//  259  628:aload_1         
	//  260  629:ldc2            #344 <String "X-Afma-Reward-Video-Complete-Urls">
	//  261  632:invokestatic    #262 <Method List zzc(Map, String)>
	//  262  635:putfield        #213 <Field List zzcir>
		zzcis = zzcis | zzd(map, "X-Afma-Use-Displayed-Impression");
	//  263  638:aload_0         
	//  264  639:aload_0         
	//  265  640:getfield        #92  <Field boolean zzcis>
	//  266  643:aload_1         
	//  267  644:ldc2            #346 <String "X-Afma-Use-Displayed-Impression">
	//  268  647:invokestatic    #278 <Method boolean zzd(Map, String)>
	//  269  650:ior             
	//  270  651:putfield        #92  <Field boolean zzcis>
		zzcit = zzcit | zzd(map, "X-Afma-Auto-Collect-Location");
	//  271  654:aload_0         
	//  272  655:aload_0         
	//  273  656:getfield        #94  <Field boolean zzcit>
	//  274  659:aload_1         
	//  275  660:ldc2            #348 <String "X-Afma-Auto-Collect-Location">
	//  276  663:invokestatic    #278 <Method boolean zzd(Map, String)>
	//  277  666:ior             
	//  278  667:putfield        #94  <Field boolean zzcit>
		zzciu = zza(map, "Set-Cookie");
	//  279  670:aload_0         
	//  280  671:aload_1         
	//  281  672:ldc2            #350 <String "Set-Cookie">
	//  282  675:invokestatic    #256 <Method String zza(Map, String)>
	//  283  678:putfield        #217 <Field String zzciu>
		obj1 = ((Object) (zza(map, "X-Afma-Auto-Protection-Configuration")));
	//  284  681:aload_1         
	//  285  682:ldc2            #352 <String "X-Afma-Auto-Protection-Configuration">
	//  286  685:invokestatic    #256 <Method String zza(Map, String)>
	//  287  688:astore          6
		if(obj1 != null && !TextUtils.isEmpty(((CharSequence) (obj1))))
	//* 288  690:aload           6
	//* 289  692:ifnull          749
	//* 290  695:aload           6
	//* 291  697:invokestatic    #357 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 292  700:ifeq            706
	//* 293  703:goto            749
		{
			try
			{
				zzxe = zzael.zzl(new JSONObject(((String) (obj1))));
	//  294  706:aload_0         
	//  295  707:new             #359 <Class JSONObject>
	//  296  710:dup             
	//  297  711:aload           6
	//  298  713:invokespecial   #361 <Method void JSONObject(String)>
	//  299  716:invokestatic    #366 <Method zzael zzael.zzl(JSONObject)>
	//  300  719:putfield        #215 <Field zzael zzxe>
			}
	//* 301  722:goto            888
			catch(JSONException jsonexception)
	//* 302  725:astore          6
			{
				zzakb.zzc("Error parsing configuration JSON", ((Throwable) (jsonexception)));
	//  303  727:ldc2            #368 <String "Error parsing configuration JSON">
	//  304  730:aload           6
	//  305  732:invokestatic    #371 <Method void zzakb.zzc(String, Throwable)>
				zzxe = new zzael();
	//  306  735:aload_0         
	//  307  736:new             #363 <Class zzael>
	//  308  739:dup             
	//  309  740:invokespecial   #372 <Method void zzael()>
	//  310  743:putfield        #215 <Field zzael zzxe>
			}
		} else
	//* 311  746:goto            888
		{
			jsonexception = ((JSONException) (Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon()));
	//  312  749:ldc2            #374 <String "https://pagead2.googlesyndication.com/pagead/gen_204">
	//  313  752:invokestatic    #380 <Method Uri Uri.parse(String)>
	//  314  755:invokevirtual   #384 <Method android.net.Uri$Builder Uri.buildUpon()>
	//  315  758:astore          6
			((android.net.Uri.Builder) (jsonexception)).appendQueryParameter("id", "gmob-apps-blocked-navigation");
	//  316  760:aload           6
	//  317  762:ldc2            #386 <String "id">
	//  318  765:ldc2            #388 <String "gmob-apps-blocked-navigation">
	//  319  768:invokevirtual   #394 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  320  771:pop             
			if(!TextUtils.isEmpty(((CharSequence) (zzcia))))
	//* 321  772:aload_0         
	//* 322  773:getfield        #205 <Field String zzcia>
	//* 323  776:invokestatic    #357 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 324  779:ifne            795
				((android.net.Uri.Builder) (jsonexception)).appendQueryParameter("debugDialog", zzcia);
	//  325  782:aload           6
	//  326  784:ldc2            #396 <String "debugDialog">
	//  327  787:aload_0         
	//  328  788:getfield        #205 <Field String zzcia>
	//  329  791:invokevirtual   #394 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//  330  794:pop             
			Object obj2 = ((Object) (zznk.zzaum));
	//  331  795:getstatic       #402 <Field zzna zznk.zzaum>
	//  332  798:astore          7
			boolean flag = ((Boolean)zzkb.zzik().zzd(((zzna) (obj2)))).booleanValue();
	//  333  800:invokestatic    #408 <Method zzni zzkb.zzik()>
	//  334  803:aload           7
	//  335  805:invokevirtual   #413 <Method Object zzni.zzd(zzna)>
	//  336  808:checkcast       #185 <Class Boolean>
	//  337  811:invokevirtual   #191 <Method boolean Boolean.booleanValue()>
	//  338  814:istore          5
			jsonexception = ((JSONException) (((android.net.Uri.Builder) (jsonexception)).toString()));
	//  339  816:aload           6
	//  340  818:invokevirtual   #414 <Method String android.net.Uri$Builder.toString()>
	//  341  821:astore          6
			obj2 = ((Object) (new StringBuilder(31 + String.valueOf(((Object) (jsonexception))).length())));
	//  342  823:new             #133 <Class StringBuilder>
	//  343  826:dup             
	//  344  827:bipush          31
	//  345  829:aload           6
	//  346  831:invokestatic    #137 <Method String String.valueOf(Object)>
	//  347  834:invokevirtual   #141 <Method int String.length()>
	//  348  837:iadd            
	//  349  838:invokespecial   #144 <Method void StringBuilder(int)>
	//  350  841:astore          7
			((StringBuilder) (obj2)).append(((String) (jsonexception)));
	//  351  843:aload           7
	//  352  845:aload           6
	//  353  847:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  354  850:pop             
			((StringBuilder) (obj2)).append("&navigationURL={NAVIGATION_URL}");
	//  355  851:aload           7
	//  356  853:ldc2            #416 <String "&navigationURL={NAVIGATION_URL}">
	//  357  856:invokevirtual   #150 <Method StringBuilder StringBuilder.append(String)>
	//  358  859:pop             
			zzxe = new zzael(flag, Arrays.asList(((Object []) (new String[] {
				((StringBuilder) (obj2)).toString()
			}))));
	//  359  860:aload_0         
	//  360  861:new             #363 <Class zzael>
	//  361  864:dup             
	//  362  865:iload           5
	//  363  867:iconst_1        
	//  364  868:anewarray       String[]
	//  365  871:dup             
	//  366  872:iconst_0        
	//  367  873:aload           7
	//  368  875:invokevirtual   #156 <Method String StringBuilder.toString()>
	//  369  878:aastore         
	//  370  879:invokestatic    #180 <Method List Arrays.asList(Object[])>
	//  371  882:invokespecial   #419 <Method void zzael(boolean, List)>
	//  372  885:putfield        #215 <Field zzael zzxe>
		}
		jsonexception = ((JSONException) (zzc(map, "X-Afma-Remote-Ping-Urls")));
	//  373  888:aload_1         
	//  374  889:ldc2            #421 <String "X-Afma-Remote-Ping-Urls">
	//  375  892:invokestatic    #262 <Method List zzc(Map, String)>
	//  376  895:astore          6
		if(jsonexception != null)
	//* 377  897:aload           6
	//* 378  899:ifnull          908
			zzciv = ((List) (jsonexception));
	//  379  902:aload_0         
	//  380  903:aload           6
	//  381  905:putfield        #219 <Field List zzciv>
		jsonexception = ((JSONException) (zza(map, "X-Afma-Safe-Browsing")));
	//  382  908:aload_1         
	//  383  909:ldc2            #423 <String "X-Afma-Safe-Browsing">
	//  384  912:invokestatic    #256 <Method String zza(Map, String)>
	//  385  915:astore          6
		if(!TextUtils.isEmpty(((CharSequence) (jsonexception))))
	//* 386  917:aload           6
	//* 387  919:invokestatic    #357 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 388  922:ifne            954
			try
			{
				zzciy = zzaiq.zzo(new JSONObject(((String) (jsonexception))));
	//  389  925:aload_0         
	//  390  926:new             #359 <Class JSONObject>
	//  391  929:dup             
	//  392  930:aload           6
	//  393  932:invokespecial   #361 <Method void JSONObject(String)>
	//  394  935:invokestatic    #429 <Method zzaiq zzaiq.zzo(JSONObject)>
	//  395  938:putfield        #225 <Field zzaiq zzciy>
			}
	//* 396  941:goto            954
			catch(JSONException jsonexception1)
	//* 397  944:astore          6
			{
				zzakb.zzc("Error parsing safe browsing header", ((Throwable) (jsonexception1)));
	//  398  946:ldc2            #431 <String "Error parsing safe browsing header">
	//  399  949:aload           6
	//  400  951:invokestatic    #371 <Method void zzakb.zzc(String, Throwable)>
			}
		zzciw = zzciw | zzd(map, "X-Afma-Render-In-Browser");
	//  401  954:aload_0         
	//  402  955:aload_0         
	//  403  956:getfield        #221 <Field boolean zzciw>
	//  404  959:aload_1         
	//  405  960:ldc2            #433 <String "X-Afma-Render-In-Browser">
	//  406  963:invokestatic    #278 <Method boolean zzd(Map, String)>
	//  407  966:ior             
	//  408  967:putfield        #221 <Field boolean zzciw>
		jsonexception1 = ((JSONException) (zza(map, "X-Afma-Pool")));
	//  409  970:aload_1         
	//  410  971:ldc2            #435 <String "X-Afma-Pool">
	//  411  974:invokestatic    #256 <Method String zza(Map, String)>
	//  412  977:astore          6
		if(!TextUtils.isEmpty(((CharSequence) (jsonexception1))))
	//* 413  979:aload           6
	//* 414  981:invokestatic    #357 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 415  984:ifne            1019
			try
			{
				zzciz = (new JSONObject(((String) (jsonexception1)))).getBoolean("never_pool");
	//  416  987:aload_0         
	//  417  988:new             #359 <Class JSONObject>
	//  418  991:dup             
	//  419  992:aload           6
	//  420  994:invokespecial   #361 <Method void JSONObject(String)>
	//  421  997:ldc2            #437 <String "never_pool">
	//  422 1000:invokevirtual   #440 <Method boolean JSONObject.getBoolean(String)>
	//  423 1003:putfield        #229 <Field boolean zzciz>
			}
	//* 424 1006:goto            1019
			catch(JSONException jsonexception2)
	//* 425 1009:astore          6
			{
				zzakb.zzc("Error parsing interstitial pool header", ((Throwable) (jsonexception2)));
	//  426 1011:ldc2            #442 <String "Error parsing interstitial pool header">
	//  427 1014:aload           6
	//  428 1016:invokestatic    #371 <Method void zzakb.zzc(String, Throwable)>
			}
		zzcja = zzd(map, "X-Afma-Custom-Close-Blocked");
	//  429 1019:aload_0         
	//  430 1020:aload_1         
	//  431 1021:ldc2            #444 <String "X-Afma-Custom-Close-Blocked">
	//  432 1024:invokestatic    #278 <Method boolean zzd(Map, String)>
	//  433 1027:putfield        #231 <Field boolean zzcja>
		zzcjb = zzd(map, "X-Afma-Enable-Omid");
	//  434 1030:aload_0         
	//  435 1031:aload_1         
	//  436 1032:ldc2            #446 <String "X-Afma-Enable-Omid">
	//  437 1035:invokestatic    #278 <Method boolean zzd(Map, String)>
	//  438 1038:putfield        #235 <Field boolean zzcjb>
		zzcjc = zzd(map, "X-Afma-Disable-Closable-Area");
	//  439 1041:aload_0         
	//  440 1042:aload_1         
	//  441 1043:ldc2            #448 <String "X-Afma-Disable-Closable-Area">
	//  442 1046:invokestatic    #278 <Method boolean zzd(Map, String)>
	//  443 1049:putfield        #239 <Field boolean zzcjc>
		zzcae = zza(map, "X-Afma-Omid-Settings");
	//  444 1052:aload_0         
	//  445 1053:aload_1         
	//  446 1054:ldc2            #450 <String "X-Afma-Omid-Settings">
	//  447 1057:invokestatic    #256 <Method String zza(Map, String)>
	//  448 1060:putfield        #241 <Field String zzcae>
		return;
	//  449 1063:return          
	}

	private int mOrientation;
	private String zzbhy;
	private boolean zzbtn;
	private final zzaef zzbuc;
	private List zzcab;
	private String zzcae;
	private String zzchw;
	private String zzchx;
	private List zzchy;
	private String zzchz;
	private String zzcia;
	private String zzcib;
	private List zzcic;
	private List zzcid;
	private long zzcie;
	private boolean zzcif;
	private final long zzcig = -1L;
	private long zzcih;
	private boolean zzcii;
	private boolean zzcij;
	private boolean zzcik;
	private boolean zzcil;
	private boolean zzcim;
	private String zzcin;
	private boolean zzcio;
	private zzaig zzcip;
	private List zzciq;
	private List zzcir;
	private boolean zzcis;
	private boolean zzcit;
	private String zzciu;
	private List zzciv;
	private boolean zzciw;
	private String zzcix;
	private zzaiq zzciy;
	private boolean zzciz;
	private boolean zzcja;
	private boolean zzcjb;
	private boolean zzcjc;
	private zzael zzxe;
}
