// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakb, zzapw, zzaqg, zzapv, 
//			zzaqe, zzaqm, zzajx

public final class zzaql
	implements zzv
{

	public zzaql()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	private static Integer zze(Map map, String s)
	{
		NumberFormatException numberformatexception;
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokeinterface #23  <Method boolean Map.containsKey(Object)>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		int i;
		StringBuilder stringbuilder;
		try
		{
			i = Integer.parseInt((String)map.get(((Object) (s))));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokeinterface #27  <Method Object Map.get(Object)>
	//    9   19:checkcast       #29  <Class String>
	//   10   22:invokestatic    #35  <Method int Integer.parseInt(String)>
	//   11   25:istore_2        
		}
	//*  12   26:iload_2         
	//*  13   27:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//*  14   30:areturn         
	//*  15   31:aload_0         
	//*  16   32:aload_1         
	//*  17   33:invokeinterface #27  <Method Object Map.get(Object)>
	//*  18   38:checkcast       #29  <Class String>
	//*  19   41:astore_0        
	//*  20   42:new             #41  <Class StringBuilder>
	//*  21   45:dup             
	//*  22   46:bipush          39
	//*  23   48:aload_1         
	//*  24   49:invokestatic    #44  <Method String String.valueOf(Object)>
	//*  25   52:invokevirtual   #48  <Method int String.length()>
	//*  26   55:iadd            
	//*  27   56:aload_0         
	//*  28   57:invokestatic    #44  <Method String String.valueOf(Object)>
	//*  29   60:invokevirtual   #48  <Method int String.length()>
	//*  30   63:iadd            
	//*  31   64:invokespecial   #51  <Method void StringBuilder(int)>
	//*  32   67:astore_3        
	//*  33   68:aload_3         
	//*  34   69:ldc1            #53  <String "Precache invalid numeric parameter '">
	//*  35   71:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//*  36   74:pop             
	//*  37   75:aload_3         
	//*  38   76:aload_1         
	//*  39   77:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//*  40   80:pop             
	//*  41   81:aload_3         
	//*  42   82:ldc1            #59  <String "': ">
	//*  43   84:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//*  44   87:pop             
	//*  45   88:aload_3         
	//*  46   89:aload_0         
	//*  47   90:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//*  48   93:pop             
	//*  49   94:aload_3         
	//*  50   95:invokevirtual   #63  <Method String StringBuilder.toString()>
	//*  51   98:invokestatic    #69  <Method void zzakb.zzdk(String)>
	//*  52  101:aconst_null     
	//*  53  102:areturn         
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			map = ((Map) ((String)map.get(((Object) (s)))));
			stringbuilder = new StringBuilder(39 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (map))).length());
			stringbuilder.append("Precache invalid numeric parameter '");
			stringbuilder.append(s);
			stringbuilder.append("': ");
			stringbuilder.append(((String) (map)));
			zzakb.zzdk(stringbuilder.toString());
			return null;
		}
		return Integer.valueOf(i);
	//*  54  103:astore_3        
	//*  55  104:goto            31
	}

	public final void zza(Object obj, Map map)
	{
		zzapw zzapw1;
		String s;
		zzapw1 = (zzapw)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #75  <Class zzapw>
	//    2    4:astore          5
		zzbv.zzff();
	//    3    6:invokestatic    #81  <Method zzaqg zzbv.zzff()>
	//    4    9:pop             
		if(map.containsKey("abort"))
	//*   5   10:aload_2         
	//*   6   11:ldc1            #83  <String "abort">
	//*   7   13:invokeinterface #23  <Method boolean Map.containsKey(Object)>
	//*   8   18:ifeq            35
		{
			if(!zzaqg.zzb(zzapw1))
	//*   9   21:aload           5
	//*  10   23:invokestatic    #89  <Method boolean zzaqg.zzb(zzapw)>
	//*  11   26:ifne            34
				zzakb.zzdk("Precache abort but no precache task running.");
	//   12   29:ldc1            #91  <String "Precache abort but no precache task running.">
	//   13   31:invokestatic    #69  <Method void zzakb.zzdk(String)>
			return;
	//   14   34:return          
		}
		s = (String)map.get("src");
	//   15   35:aload_2         
	//   16   36:ldc1            #93  <String "src">
	//   17   38:invokeinterface #27  <Method Object Map.get(Object)>
	//   18   43:checkcast       #29  <Class String>
	//   19   46:astore          6
		if(s == null) goto _L2; else goto _L1
	//   20   48:aload           6
	//   21   50:ifnull          170
_L1:
		if(zzaqg.zzc(zzapw1) == null) goto _L4; else goto _L3
	//   22   53:aload           5
	//   23   55:invokestatic    #97  <Method zzaqe zzaqg.zzc(zzapw)>
	//   24   58:ifnull          69
_L3:
		obj = "Precache task is already running.";
	//   25   61:ldc1            #99  <String "Precache task is already running.">
	//   26   63:astore_1        
_L6:
		zzakb.zzdk(((String) (obj)));
	//   27   64:aload_1         
	//   28   65:invokestatic    #69  <Method void zzakb.zzdk(String)>
		return;
	//   29   68:return          
_L4:
		if(zzapw1.zzbi() == null)
	//*  30   69:aload           5
	//*  31   71:invokeinterface #103 <Method zzw zzapw.zzbi()>
	//*  32   76:ifnonnull       85
		{
			obj = "Precache requires a dependency provider.";
	//   33   79:ldc1            #105 <String "Precache requires a dependency provider.">
	//   34   81:astore_1        
			continue; /* Loop/switch isn't completed */
	//   35   82:goto            64
		}
		zzapv zzapv1 = new zzapv((String)map.get("flags"));
	//   36   85:new             #107 <Class zzapv>
	//   37   88:dup             
	//   38   89:aload_2         
	//   39   90:ldc1            #109 <String "flags">
	//   40   92:invokeinterface #27  <Method Object Map.get(Object)>
	//   41   97:checkcast       #29  <Class String>
	//   42  100:invokespecial   #111 <Method void zzapv(String)>
	//   43  103:astore          7
		Integer integer = zze(map, "player");
	//   44  105:aload_2         
	//   45  106:ldc1            #113 <String "player">
	//   46  108:invokestatic    #115 <Method Integer zze(Map, String)>
	//   47  111:astore          4
		obj = ((Object) (integer));
	//   48  113:aload           4
	//   49  115:astore_1        
		if(integer == null)
	//*  50  116:aload           4
	//*  51  118:ifnonnull       126
			obj = ((Object) (Integer.valueOf(0)));
	//   52  121:iconst_0        
	//   53  122:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   54  125:astore_1        
		int i = ((Integer) (obj)).intValue();
	//   55  126:aload_1         
	//   56  127:invokevirtual   #118 <Method int Integer.intValue()>
	//   57  130:istore_3        
		((zzajx) (new zzaqe(zzapw1, zzapw1.zzbi().zzwy.zza(zzapw1, i, ((String) (null)), zzapv1), s))).zznt();
	//   58  131:new             #120 <Class zzaqe>
	//   59  134:dup             
	//   60  135:aload           5
	//   61  137:aload           5
	//   62  139:invokeinterface #103 <Method zzw zzapw.zzbi()>
	//   63  144:getfield        #126 <Field zzaqm zzw.zzwy>
	//   64  147:aload           5
	//   65  149:iload_3         
	//   66  150:aconst_null     
	//   67  151:aload           7
	//   68  153:invokeinterface #131 <Method zzaqh zzaqm.zza(zzapw, int, String, zzapv)>
	//   69  158:aload           6
	//   70  160:invokespecial   #134 <Method void zzaqe(zzapw, zzaqh, String)>
	//   71  163:invokevirtual   #140 <Method Object zzajx.zznt()>
	//   72  166:pop             
		break; /* Loop/switch isn't completed */
	//   73  167:goto            184
_L2:
		if(zzaqg.zzc(zzapw1) != null)
			break; /* Loop/switch isn't completed */
	//   74  170:aload           5
	//   75  172:invokestatic    #97  <Method zzaqe zzaqg.zzc(zzapw)>
	//   76  175:ifnonnull       184
		obj = "Precache must specify a source.";
	//   77  178:ldc1            #142 <String "Precache must specify a source.">
	//   78  180:astore_1        
		if(true) goto _L6; else goto _L5
	//   79  181:goto            64
_L5:
		obj = ((Object) (zze(map, "minBufferMs")));
	//   80  184:aload_2         
	//   81  185:ldc1            #144 <String "minBufferMs">
	//   82  187:invokestatic    #115 <Method Integer zze(Map, String)>
	//   83  190:astore_1        
		if(obj != null)
	//*  84  191:aload_1         
	//*  85  192:ifnull          200
			((Integer) (obj)).intValue();
	//   86  195:aload_1         
	//   87  196:invokevirtual   #118 <Method int Integer.intValue()>
	//   88  199:pop             
		obj = ((Object) (zze(map, "maxBufferMs")));
	//   89  200:aload_2         
	//   90  201:ldc1            #146 <String "maxBufferMs">
	//   91  203:invokestatic    #115 <Method Integer zze(Map, String)>
	//   92  206:astore_1        
		if(obj != null)
	//*  93  207:aload_1         
	//*  94  208:ifnull          216
			((Integer) (obj)).intValue();
	//   95  211:aload_1         
	//   96  212:invokevirtual   #118 <Method int Integer.intValue()>
	//   97  215:pop             
		obj = ((Object) (zze(map, "bufferForPlaybackMs")));
	//   98  216:aload_2         
	//   99  217:ldc1            #148 <String "bufferForPlaybackMs">
	//  100  219:invokestatic    #115 <Method Integer zze(Map, String)>
	//  101  222:astore_1        
		if(obj != null)
	//* 102  223:aload_1         
	//* 103  224:ifnull          232
			((Integer) (obj)).intValue();
	//  104  227:aload_1         
	//  105  228:invokevirtual   #118 <Method int Integer.intValue()>
	//  106  231:pop             
		obj = ((Object) (zze(map, "bufferForPlaybackAfterRebufferMs")));
	//  107  232:aload_2         
	//  108  233:ldc1            #150 <String "bufferForPlaybackAfterRebufferMs">
	//  109  235:invokestatic    #115 <Method Integer zze(Map, String)>
	//  110  238:astore_1        
		if(obj != null)
	//* 111  239:aload_1         
	//* 112  240:ifnull          248
			((Integer) (obj)).intValue();
	//  113  243:aload_1         
	//  114  244:invokevirtual   #118 <Method int Integer.intValue()>
	//  115  247:pop             
		return;
	//  116  248:return          
	}
}
