// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.ads.internal.bs;
import com.google.android.gms.ads.internal.gmsg.ag;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, add, aep, adc, 
//			aex, aen, wt, aeq

public final class aew
	implements ag
{

	public aew()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static Integer a(Map map, String s)
	{
		NumberFormatException numberformatexception;
		if(!map.containsKey(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokeinterface #22  <Method boolean Map.containsKey(Object)>
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
	//    8   14:invokeinterface #26  <Method Object Map.get(Object)>
	//    9   19:checkcast       #28  <Class String>
	//   10   22:invokestatic    #34  <Method int Integer.parseInt(String)>
	//   11   25:istore_2        
		}
	//*  12   26:iload_2         
	//*  13   27:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//*  14   30:areturn         
	//*  15   31:aload_0         
	//*  16   32:aload_1         
	//*  17   33:invokeinterface #26  <Method Object Map.get(Object)>
	//*  18   38:checkcast       #28  <Class String>
	//*  19   41:astore_0        
	//*  20   42:new             #40  <Class StringBuilder>
	//*  21   45:dup             
	//*  22   46:aload_1         
	//*  23   47:invokestatic    #43  <Method String String.valueOf(Object)>
	//*  24   50:invokevirtual   #47  <Method int String.length()>
	//*  25   53:bipush          39
	//*  26   55:iadd            
	//*  27   56:aload_0         
	//*  28   57:invokestatic    #43  <Method String String.valueOf(Object)>
	//*  29   60:invokevirtual   #47  <Method int String.length()>
	//*  30   63:iadd            
	//*  31   64:invokespecial   #50  <Method void StringBuilder(int)>
	//*  32   67:astore_3        
	//*  33   68:aload_3         
	//*  34   69:ldc1            #52  <String "Precache invalid numeric parameter '">
	//*  35   71:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  36   74:pop             
	//*  37   75:aload_3         
	//*  38   76:aload_1         
	//*  39   77:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  40   80:pop             
	//*  41   81:aload_3         
	//*  42   82:ldc1            #58  <String "': ">
	//*  43   84:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  44   87:pop             
	//*  45   88:aload_3         
	//*  46   89:aload_0         
	//*  47   90:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//*  48   93:pop             
	//*  49   94:aload_3         
	//*  50   95:invokevirtual   #62  <Method String StringBuilder.toString()>
	//*  51   98:invokestatic    #68  <Method void wx.e(String)>
	//*  52  101:aconst_null     
	//*  53  102:areturn         
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			map = ((Map) ((String)map.get(((Object) (s)))));
			stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 39 + String.valueOf(((Object) (map))).length());
			stringbuilder.append("Precache invalid numeric parameter '");
			stringbuilder.append(s);
			stringbuilder.append("': ");
			stringbuilder.append(((String) (map)));
			wx.e(stringbuilder.toString());
			return null;
		}
		return Integer.valueOf(i);
	//*  54  103:astore_3        
	//*  55  104:goto            31
	}

	public final void zza(Object obj, Map map)
	{
label0:
		{
			add add1 = (add)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #72  <Class add>
	//    2    4:astore          5
			if(wx.a(3))
	//*   3    6:iconst_3        
	//*   4    7:invokestatic    #75  <Method boolean wx.a(int)>
	//*   5   10:ifeq            76
			{
				obj = ((Object) (new JSONObject(map)));
	//    6   13:new             #77  <Class JSONObject>
	//    7   16:dup             
	//    8   17:aload_2         
	//    9   18:invokespecial   #80  <Method void JSONObject(Map)>
	//   10   21:astore_1        
				((JSONObject) (obj)).remove("google.afma.Notify_dt");
	//   11   22:aload_1         
	//   12   23:ldc1            #82  <String "google.afma.Notify_dt">
	//   13   25:invokevirtual   #86  <Method Object JSONObject.remove(String)>
	//   14   28:pop             
				obj = ((Object) (String.valueOf(obj)));
	//   15   29:aload_1         
	//   16   30:invokestatic    #43  <Method String String.valueOf(Object)>
	//   17   33:astore_1        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 15);
	//   18   34:new             #40  <Class StringBuilder>
	//   19   37:dup             
	//   20   38:aload_1         
	//   21   39:invokestatic    #43  <Method String String.valueOf(Object)>
	//   22   42:invokevirtual   #47  <Method int String.length()>
	//   23   45:bipush          15
	//   24   47:iadd            
	//   25   48:invokespecial   #50  <Method void StringBuilder(int)>
	//   26   51:astore          4
				stringbuilder.append("Precache GMSG: ");
	//   27   53:aload           4
	//   28   55:ldc1            #88  <String "Precache GMSG: ">
	//   29   57:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   30   60:pop             
				stringbuilder.append(((String) (obj)));
	//   31   61:aload           4
	//   32   63:aload_1         
	//   33   64:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   34   67:pop             
				wx.b(stringbuilder.toString());
	//   35   68:aload           4
	//   36   70:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   37   73:invokestatic    #91  <Method void wx.b(String)>
			}
			aw.C();
	//   38   76:invokestatic    #97  <Method aep aw.C()>
	//   39   79:pop             
			if(map.containsKey("abort"))
	//*  40   80:aload_2         
	//*  41   81:ldc1            #99  <String "abort">
	//*  42   83:invokeinterface #22  <Method boolean Map.containsKey(Object)>
	//*  43   88:ifeq            105
			{
				if(!aep.a(add1))
	//*  44   91:aload           5
	//*  45   93:invokestatic    #104 <Method boolean aep.a(add)>
	//*  46   96:ifne            104
					wx.e("Precache abort but no precache task running.");
	//   47   99:ldc1            #106 <String "Precache abort but no precache task running.">
	//   48  101:invokestatic    #68  <Method void wx.e(String)>
				return;
	//   49  104:return          
			}
			String s = (String)map.get("src");
	//   50  105:aload_2         
	//   51  106:ldc1            #108 <String "src">
	//   52  108:invokeinterface #26  <Method Object Map.get(Object)>
	//   53  113:checkcast       #28  <Class String>
	//   54  116:astore          6
			if(s != null)
	//*  55  118:aload           6
	//*  56  120:ifnull          240
			{
				if(aep.b(add1) != null)
	//*  57  123:aload           5
	//*  58  125:invokestatic    #111 <Method aen aep.b(add)>
	//*  59  128:ifnull          137
				{
					wx.e("Precache task is already running.");
	//   60  131:ldc1            #113 <String "Precache task is already running.">
	//   61  133:invokestatic    #68  <Method void wx.e(String)>
					return;
	//   62  136:return          
				}
				if(add1.e() == null)
	//*  63  137:aload           5
	//*  64  139:invokeinterface #116 <Method bs add.e()>
	//*  65  144:ifnonnull       153
				{
					wx.e("Precache requires a dependency provider.");
	//   66  147:ldc1            #118 <String "Precache requires a dependency provider.">
	//   67  149:invokestatic    #68  <Method void wx.e(String)>
					return;
	//   68  152:return          
				}
				adc adc1 = new adc((String)map.get("flags"));
	//   69  153:new             #120 <Class adc>
	//   70  156:dup             
	//   71  157:aload_2         
	//   72  158:ldc1            #122 <String "flags">
	//   73  160:invokeinterface #26  <Method Object Map.get(Object)>
	//   74  165:checkcast       #28  <Class String>
	//   75  168:invokespecial   #124 <Method void adc(String)>
	//   76  171:astore          7
				Integer integer = a(map, "player");
	//   77  173:aload_2         
	//   78  174:ldc1            #126 <String "player">
	//   79  176:invokestatic    #128 <Method Integer a(Map, String)>
	//   80  179:astore          4
				obj = ((Object) (integer));
	//   81  181:aload           4
	//   82  183:astore_1        
				if(integer == null)
	//*  83  184:aload           4
	//*  84  186:ifnonnull       194
					obj = ((Object) (Integer.valueOf(0)));
	//   85  189:iconst_0        
	//   86  190:invokestatic    #38  <Method Integer Integer.valueOf(int)>
	//   87  193:astore_1        
				int i = ((Integer) (obj)).intValue();
	//   88  194:aload_1         
	//   89  195:invokevirtual   #131 <Method int Integer.intValue()>
	//   90  198:istore_3        
				obj = ((Object) (add1.e().a.a(add1, i, ((String) (null)), adc1)));
	//   91  199:aload           5
	//   92  201:invokeinterface #116 <Method bs add.e()>
	//   93  206:getfield        #136 <Field aex bs.a>
	//   94  209:aload           5
	//   95  211:iload_3         
	//   96  212:aconst_null     
	//   97  213:aload           7
	//   98  215:invokeinterface #141 <Method aeq aex.a(add, int, String, adc)>
	//   99  220:astore_1        
				((wt) (new aen(add1, ((aeq) (obj)), s))).c();
	//  100  221:new             #143 <Class aen>
	//  101  224:dup             
	//  102  225:aload           5
	//  103  227:aload_1         
	//  104  228:aload           6
	//  105  230:invokespecial   #146 <Method void aen(add, aeq, String)>
	//  106  233:invokevirtual   #152 <Method Object wt.c()>
	//  107  236:pop             
			} else
	//* 108  237:goto            255
			{
				obj = ((Object) (aep.b(add1)));
	//  109  240:aload           5
	//  110  242:invokestatic    #111 <Method aen aep.b(add)>
	//  111  245:astore_1        
				if(obj == null)
					break label0;
	//  112  246:aload_1         
	//  113  247:ifnull          341
				obj = ((Object) (((aen) (obj)).b));
	//  114  250:aload_1         
	//  115  251:getfield        #155 <Field aeq aen.b>
	//  116  254:astore_1        
			}
			Integer integer1 = a(map, "minBufferMs");
	//  117  255:aload_2         
	//  118  256:ldc1            #157 <String "minBufferMs">
	//  119  258:invokestatic    #128 <Method Integer a(Map, String)>
	//  120  261:astore          4
			if(integer1 != null)
	//* 121  263:aload           4
	//* 122  265:ifnull          277
				((aeq) (obj)).c(integer1.intValue());
	//  123  268:aload_1         
	//  124  269:aload           4
	//  125  271:invokevirtual   #131 <Method int Integer.intValue()>
	//  126  274:invokevirtual   #161 <Method void aeq.c(int)>
			integer1 = a(map, "maxBufferMs");
	//  127  277:aload_2         
	//  128  278:ldc1            #163 <String "maxBufferMs">
	//  129  280:invokestatic    #128 <Method Integer a(Map, String)>
	//  130  283:astore          4
			if(integer1 != null)
	//* 131  285:aload           4
	//* 132  287:ifnull          299
				((aeq) (obj)).a(integer1.intValue());
	//  133  290:aload_1         
	//  134  291:aload           4
	//  135  293:invokevirtual   #131 <Method int Integer.intValue()>
	//  136  296:invokevirtual   #165 <Method void aeq.a(int)>
			integer1 = a(map, "bufferForPlaybackMs");
	//  137  299:aload_2         
	//  138  300:ldc1            #167 <String "bufferForPlaybackMs">
	//  139  302:invokestatic    #128 <Method Integer a(Map, String)>
	//  140  305:astore          4
			if(integer1 != null)
	//* 141  307:aload           4
	//* 142  309:ifnull          321
				((aeq) (obj)).d(integer1.intValue());
	//  143  312:aload_1         
	//  144  313:aload           4
	//  145  315:invokevirtual   #131 <Method int Integer.intValue()>
	//  146  318:invokevirtual   #170 <Method void aeq.d(int)>
			map = ((Map) (a(map, "bufferForPlaybackAfterRebufferMs")));
	//  147  321:aload_2         
	//  148  322:ldc1            #172 <String "bufferForPlaybackAfterRebufferMs">
	//  149  324:invokestatic    #128 <Method Integer a(Map, String)>
	//  150  327:astore_2        
			if(map != null)
	//* 151  328:aload_2         
	//* 152  329:ifnull          340
				((aeq) (obj)).e(((Integer) (map)).intValue());
	//  153  332:aload_1         
	//  154  333:aload_2         
	//  155  334:invokevirtual   #131 <Method int Integer.intValue()>
	//  156  337:invokevirtual   #174 <Method void aeq.e(int)>
			return;
	//  157  340:return          
		}
		wx.e("Precache must specify a source.");
	//  158  341:ldc1            #176 <String "Precache must specify a source.">
	//  159  343:invokestatic    #68  <Method void wx.e(String)>
	//  160  346:return          
	}
}
