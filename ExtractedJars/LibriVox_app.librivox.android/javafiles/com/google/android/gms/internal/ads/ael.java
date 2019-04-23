// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.gmsg.ag;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bwk, zv, wx, aco, 
//			add, zt, agd, acu, 
//			adc

public final class ael
	implements ag
{

	public ael()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	private static int a(Context context, Map map, String s, int i)
	{
		map = ((Map) ((String)map.get(((Object) (s)))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #23  <Method Object Map.get(Object)>
	//    3    7:checkcast       #25  <Class String>
	//    4   10:astore_1        
		if(map == null) goto _L2; else goto _L1
	//    5   11:aload_1         
	//    6   12:ifnull          91
_L1:
		int j;
		bwk.a();
	//    7   15:invokestatic    #30  <Method zv bwk.a()>
	//    8   18:pop             
		j = zv.a(context, Integer.parseInt(((String) (map))));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokestatic    #36  <Method int Integer.parseInt(String)>
	//   12   24:invokestatic    #41  <Method int zv.a(Context, int)>
	//   13   27:istore          4
		return j;
	//   14   29:iload           4
	//   15   31:ireturn         
_L4:
		context = ((Context) (new StringBuilder(String.valueOf(((Object) (s))).length() + 34 + String.valueOf(((Object) (map))).length())));
	//   16   32:new             #43  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:aload_2         
	//   19   37:invokestatic    #47  <Method String String.valueOf(Object)>
	//   20   40:invokevirtual   #51  <Method int String.length()>
	//   21   43:bipush          34
	//   22   45:iadd            
	//   23   46:aload_1         
	//   24   47:invokestatic    #47  <Method String String.valueOf(Object)>
	//   25   50:invokevirtual   #51  <Method int String.length()>
	//   26   53:iadd            
	//   27   54:invokespecial   #54  <Method void StringBuilder(int)>
	//   28   57:astore_0        
		((StringBuilder) (context)).append("Could not parse ");
	//   29   58:aload_0         
	//   30   59:ldc1            #56  <String "Could not parse ">
	//   31   61:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
		((StringBuilder) (context)).append(s);
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
		((StringBuilder) (context)).append(" in a video GMSG: ");
	//   37   71:aload_0         
	//   38   72:ldc1            #62  <String " in a video GMSG: ">
	//   39   74:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   40   77:pop             
		((StringBuilder) (context)).append(((String) (map)));
	//   41   78:aload_0         
	//   42   79:aload_1         
	//   43   80:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   44   83:pop             
		wx.e(((StringBuilder) (context)).toString());
	//   45   84:aload_0         
	//   46   85:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   47   88:invokestatic    #72  <Method void wx.e(String)>
_L2:
		return i;
	//   48   91:iload_3         
	//   49   92:ireturn         
		context;
	//   50   93:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  51   94:goto            32
	}

	private static void a(aco aco1, Map map)
	{
		String s;
		String s1;
		String s2;
		s = (String)map.get("minBufferMs");
	//    0    0:aload_1         
	//    1    1:ldc1            #75  <String "minBufferMs">
	//    2    3:invokeinterface #23  <Method Object Map.get(Object)>
	//    3    8:checkcast       #25  <Class String>
	//    4   11:astore_2        
		s1 = (String)map.get("maxBufferMs");
	//    5   12:aload_1         
	//    6   13:ldc1            #77  <String "maxBufferMs">
	//    7   15:invokeinterface #23  <Method Object Map.get(Object)>
	//    8   20:checkcast       #25  <Class String>
	//    9   23:astore_3        
		s2 = (String)map.get("bufferForPlaybackMs");
	//   10   24:aload_1         
	//   11   25:ldc1            #79  <String "bufferForPlaybackMs">
	//   12   27:invokeinterface #23  <Method Object Map.get(Object)>
	//   13   32:checkcast       #25  <Class String>
	//   14   35:astore          4
		map = ((Map) ((String)map.get("bufferForPlaybackAfterRebufferMs")));
	//   15   37:aload_1         
	//   16   38:ldc1            #81  <String "bufferForPlaybackAfterRebufferMs">
	//   17   40:invokeinterface #23  <Method Object Map.get(Object)>
	//   18   45:checkcast       #25  <Class String>
	//   19   48:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_61;
	//   20   49:aload_2         
	//   21   50:ifnull          61
		aco1.b(Integer.parseInt(s));
	//   22   53:aload_0         
	//   23   54:aload_2         
	//   24   55:invokestatic    #36  <Method int Integer.parseInt(String)>
	//   25   58:invokevirtual   #86  <Method void aco.b(int)>
		if(s1 == null)
			break MISSING_BLOCK_LABEL_73;
	//   26   61:aload_3         
	//   27   62:ifnull          73
		aco1.c(Integer.parseInt(s1));
	//   28   65:aload_0         
	//   29   66:aload_3         
	//   30   67:invokestatic    #36  <Method int Integer.parseInt(String)>
	//   31   70:invokevirtual   #89  <Method void aco.c(int)>
		if(s2 == null)
			break MISSING_BLOCK_LABEL_87;
	//   32   73:aload           4
	//   33   75:ifnull          87
		aco1.d(Integer.parseInt(s2));
	//   34   78:aload_0         
	//   35   79:aload           4
	//   36   81:invokestatic    #36  <Method int Integer.parseInt(String)>
	//   37   84:invokevirtual   #92  <Method void aco.d(int)>
		if(map != null)
	//*  38   87:aload_1         
	//*  39   88:ifnull          121
		{
			try
			{
				aco1.e(Integer.parseInt(((String) (map))));
	//   40   91:aload_0         
	//   41   92:aload_1         
	//   42   93:invokestatic    #36  <Method int Integer.parseInt(String)>
	//   43   96:invokevirtual   #94  <Method void aco.e(int)>
				return;
	//   44   99:return          
			}
	//*  45  100:ldc1            #96  <String "Could not parse buffer parameters in loadControl video GMSG: (%s, %s)">
	//*  46  102:iconst_2        
	//*  47  103:anewarray       Object[]
	//*  48  106:dup             
	//*  49  107:iconst_0        
	//*  50  108:aload_2         
	//*  51  109:aastore         
	//*  52  110:dup             
	//*  53  111:iconst_1        
	//*  54  112:aload_3         
	//*  55  113:aastore         
	//*  56  114:invokestatic    #100 <Method String String.format(String, Object[])>
	//*  57  117:invokestatic    #72  <Method void wx.e(String)>
	//*  58  120:return          
	//*  59  121:return          
			// Misplaced declaration of an exception variable
			catch(aco aco1)
			{
				wx.e(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[] {
					s, s1
				}));
			}
			return;
		} else
		{
			return;
		}
	//*  60  122:astore_0        
	//*  61  123:goto            100
	}

	public final void zza(Object obj, Map map)
	{
		NumberFormatException numberformatexception;
		Object obj1 = ((Object) ((add)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #106 <Class add>
	//    2    4:astore          12
		Object obj2 = ((Object) ((String)map.get("action")));
	//    3    6:aload_2         
	//    4    7:ldc1            #108 <String "action">
	//    5    9:invokeinterface #23  <Method Object Map.get(Object)>
	//    6   14:checkcast       #25  <Class String>
	//    7   17:astore          13
		if(obj2 == null)
	//*   8   19:aload           13
	//*   9   21:ifnonnull       30
		{
			wx.e("Action missing from video GMSG.");
	//   10   24:ldc1            #110 <String "Action missing from video GMSG.">
	//   11   26:invokestatic    #72  <Method void wx.e(String)>
			return;
	//   12   29:return          
		}
		if(wx.a(3))
	//*  13   30:iconst_3        
	//*  14   31:invokestatic    #113 <Method boolean wx.a(int)>
	//*  15   34:ifeq            125
		{
			obj = ((Object) (new JSONObject(map)));
	//   16   37:new             #115 <Class JSONObject>
	//   17   40:dup             
	//   18   41:aload_2         
	//   19   42:invokespecial   #118 <Method void JSONObject(Map)>
	//   20   45:astore_1        
			((JSONObject) (obj)).remove("google.afma.Notify_dt");
	//   21   46:aload_1         
	//   22   47:ldc1            #120 <String "google.afma.Notify_dt">
	//   23   49:invokevirtual   #124 <Method Object JSONObject.remove(String)>
	//   24   52:pop             
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//   25   53:aload_1         
	//   26   54:invokevirtual   #125 <Method String JSONObject.toString()>
	//   27   57:astore_1        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj2).length() + 13 + String.valueOf(obj).length());
	//   28   58:new             #43  <Class StringBuilder>
	//   29   61:dup             
	//   30   62:aload           13
	//   31   64:invokestatic    #47  <Method String String.valueOf(Object)>
	//   32   67:invokevirtual   #51  <Method int String.length()>
	//   33   70:bipush          13
	//   34   72:iadd            
	//   35   73:aload_1         
	//   36   74:invokestatic    #47  <Method String String.valueOf(Object)>
	//   37   77:invokevirtual   #51  <Method int String.length()>
	//   38   80:iadd            
	//   39   81:invokespecial   #54  <Method void StringBuilder(int)>
	//   40   84:astore          14
			stringbuilder.append("Video GMSG: ");
	//   41   86:aload           14
	//   42   88:ldc1            #127 <String "Video GMSG: ">
	//   43   90:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
			stringbuilder.append(((String) (obj2)));
	//   45   94:aload           14
	//   46   96:aload           13
	//   47   98:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   48  101:pop             
			stringbuilder.append(" ");
	//   49  102:aload           14
	//   50  104:ldc1            #129 <String " ">
	//   51  106:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   52  109:pop             
			stringbuilder.append(((String) (obj)));
	//   53  110:aload           14
	//   54  112:aload_1         
	//   55  113:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   56  116:pop             
			wx.b(stringbuilder.toString());
	//   57  117:aload           14
	//   58  119:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   59  122:invokestatic    #131 <Method void wx.b(String)>
		}
		if("background".equals(obj2))
	//*  60  125:ldc1            #133 <String "background">
	//*  61  127:aload           13
	//*  62  129:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  63  132:ifeq            178
		{
			obj = ((Object) ((String)map.get("color")));
	//   64  135:aload_2         
	//   65  136:ldc1            #139 <String "color">
	//   66  138:invokeinterface #23  <Method Object Map.get(Object)>
	//   67  143:checkcast       #25  <Class String>
	//   68  146:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (obj))))
	//*  69  147:aload_1         
	//*  70  148:invokestatic    #145 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  71  151:ifeq            160
			{
				wx.e("Color parameter missing from color video GMSG.");
	//   72  154:ldc1            #147 <String "Color parameter missing from color video GMSG.">
	//   73  156:invokestatic    #72  <Method void wx.e(String)>
				return;
	//   74  159:return          
			}
			try
			{
				((add) (obj1)).setBackgroundColor(Color.parseColor(((String) (obj))));
	//   75  160:aload           12
	//   76  162:aload_1         
	//   77  163:invokestatic    #152 <Method int Color.parseColor(String)>
	//   78  166:invokeinterface #155 <Method void add.setBackgroundColor(int)>
				return;
	//   79  171:return          
			}
	//*  80  172:ldc1            #157 <String "Invalid color parameter in video GMSG.">
	//*  81  174:invokestatic    #72  <Method void wx.e(String)>
	//*  82  177:return          
	//*  83  178:ldc1            #159 <String "decoderProps">
	//*  84  180:aload           13
	//*  85  182:invokevirtual   #137 <Method boolean String.equals(Object)>
	//*  86  185:istore          8
	//*  87  187:iconst_0        
	//*  88  188:istore_3        
	//*  89  189:iload           8
	//*  90  191:ifeq            305
	//*  91  194:aload_2         
	//*  92  195:ldc1            #161 <String "mimeTypes">
	//*  93  197:invokeinterface #23  <Method Object Map.get(Object)>
	//*  94  202:checkcast       #25  <Class String>
	//*  95  205:astore_2        
	//*  96  206:aload_2         
	//*  97  207:ifnonnull       223
	//*  98  210:ldc1            #163 <String "No MIME types specified for decoder properties inspection.">
	//*  99  212:invokestatic    #72  <Method void wx.e(String)>
	//* 100  215:aload           12
	//* 101  217:ldc1            #165 <String "missingMimeTypes">
	//* 102  219:invokestatic    #168 <Method void aco.a(add, String)>
	//* 103  222:return          
	//* 104  223:getstatic       #174 <Field int android.os.Build$VERSION.SDK_INT>
	//* 105  226:bipush          16
	//* 106  228:icmpge          244
	//* 107  231:ldc1            #176 <String "Video decoder properties available on API versions >= 16.">
	//* 108  233:invokestatic    #72  <Method void wx.e(String)>
	//* 109  236:aload           12
	//* 110  238:ldc1            #178 <String "deficientApiVersion">
	//* 111  240:invokestatic    #168 <Method void aco.a(add, String)>
	//* 112  243:return          
	//* 113  244:new             #180 <Class HashMap>
	//* 114  247:dup             
	//* 115  248:invokespecial   #181 <Method void HashMap()>
	//* 116  251:astore_1        
	//* 117  252:aload_2         
	//* 118  253:ldc1            #183 <String ",">
	//* 119  255:invokevirtual   #187 <Method String[] String.split(String)>
	//* 120  258:astore_2        
	//* 121  259:aload_2         
	//* 122  260:arraylength     
	//* 123  261:istore          4
	//* 124  263:iload_3         
	//* 125  264:iload           4
	//* 126  266:icmpge          298
	//* 127  269:aload_2         
	//* 128  270:iload_3         
	//* 129  271:aaload          
	//* 130  272:astore          13
	//* 131  274:aload_1         
	//* 132  275:aload           13
	//* 133  277:aload           13
	//* 134  279:invokevirtual   #190 <Method String String.trim()>
	//* 135  282:invokestatic    #195 <Method java.util.List zt.a(String)>
	//* 136  285:invokeinterface #199 <Method Object Map.put(Object, Object)>
	//* 137  290:pop             
	//* 138  291:iload_3         
	//* 139  292:iconst_1        
	//* 140  293:iadd            
	//* 141  294:istore_3        
	//* 142  295:goto            263
	//* 143  298:aload           12
	//* 144  300:aload_1         
	//* 145  301:invokestatic    #202 <Method void aco.a(add, Map)>
	//* 146  304:return          
	//* 147  305:aload           12
	//* 148  307:invokeinterface #205 <Method acu add.a()>
	//* 149  312:astore          14
	//* 150  314:aload           14
	//* 151  316:ifnonnull       325
	//* 152  319:ldc1            #207 <String "Could not get underlay container for a video GMSG.">
	//* 153  321:invokestatic    #72  <Method void wx.e(String)>
	//* 154  324:return          
	//* 155  325:ldc1            #209 <String "new">
	//* 156  327:aload           13
	//* 157  329:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 158  332:istore          8
	//* 159  334:ldc1            #211 <String "position">
	//* 160  336:aload           13
	//* 161  338:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 162  341:istore          9
	//* 163  343:iload           8
	//* 164  345:ifne            1020
	//* 165  348:iload           9
	//* 166  350:ifeq            356
	//* 167  353:goto            1020
	//* 168  356:aload           12
	//* 169  358:invokeinterface #214 <Method agd add.b()>
	//* 170  363:astore          15
	//* 171  365:aload           15
	//* 172  367:ifnull          468
	//* 173  370:ldc1            #216 <String "timeupdate">
	//* 174  372:aload           13
	//* 175  374:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 176  377:ifeq            453
	//* 177  380:aload_2         
	//* 178  381:ldc1            #218 <String "currentTime">
	//* 179  383:invokeinterface #23  <Method Object Map.get(Object)>
	//* 180  388:checkcast       #25  <Class String>
	//* 181  391:astore_1        
	//* 182  392:aload_1         
	//* 183  393:ifnonnull       402
	//* 184  396:ldc1            #220 <String "currentTime parameter missing from timeupdate video GMSG.">
	//* 185  398:invokestatic    #72  <Method void wx.e(String)>
	//* 186  401:return          
	//* 187  402:aload           15
	//* 188  404:aload_1         
	//* 189  405:invokestatic    #226 <Method float Float.parseFloat(String)>
	//* 190  408:invokevirtual   #231 <Method void agd.a(float)>
	//* 191  411:goto            468
	//* 192  414:aload_1         
	//* 193  415:invokestatic    #47  <Method String String.valueOf(Object)>
	//* 194  418:astore_1        
	//* 195  419:aload_1         
	//* 196  420:invokevirtual   #51  <Method int String.length()>
	//* 197  423:ifeq            436
	//* 198  426:ldc1            #233 <String "Could not parse currentTime parameter from timeupdate video GMSG: ">
	//* 199  428:aload_1         
	//* 200  429:invokevirtual   #237 <Method String String.concat(String)>
	//* 201  432:astore_1        
	//* 202  433:goto            446
	//* 203  436:new             #25  <Class String>
	//* 204  439:dup             
	//* 205  440:ldc1            #233 <String "Could not parse currentTime parameter from timeupdate video GMSG: ">
	//* 206  442:invokespecial   #239 <Method void String(String)>
	//* 207  445:astore_1        
	//* 208  446:aload_1         
	//* 209  447:invokestatic    #72  <Method void wx.e(String)>
	//* 210  450:goto            468
	//* 211  453:ldc1            #241 <String "skip">
	//* 212  455:aload           13
	//* 213  457:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 214  460:ifeq            468
	//* 215  463:aload           15
	//* 216  465:invokevirtual   #244 <Method void agd.k()>
	//* 217  468:aload           14
	//* 218  470:invokevirtual   #249 <Method aco acu.a()>
	//* 219  473:astore_1        
	//* 220  474:aload_1         
	//* 221  475:ifnonnull       484
	//* 222  478:aload           12
	//* 223  480:invokestatic    #252 <Method void aco.a(add)>
	//* 224  483:return          
	//* 225  484:ldc1            #254 <String "click">
	//* 226  486:aload           13
	//* 227  488:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 228  491:ifeq            556
	//* 229  494:aload           12
	//* 230  496:invokeinterface #258 <Method Context add.getContext()>
	//* 231  501:astore          12
	//* 232  503:aload           12
	//* 233  505:aload_2         
	//* 234  506:ldc2            #260 <String "x">
	//* 235  509:iconst_0        
	//* 236  510:invokestatic    #262 <Method int a(Context, Map, String, int)>
	//* 237  513:istore_3        
	//* 238  514:aload           12
	//* 239  516:aload_2         
	//* 240  517:ldc2            #264 <String "y">
	//* 241  520:iconst_0        
	//* 242  521:invokestatic    #262 <Method int a(Context, Map, String, int)>
	//* 243  524:istore          4
	//* 244  526:invokestatic    #270 <Method long SystemClock.uptimeMillis()>
	//* 245  529:lstore          10
	//* 246  531:lload           10
	//* 247  533:lload           10
	//* 248  535:iconst_0        
	//* 249  536:iload_3         
	//* 250  537:i2f             
	//* 251  538:iload           4
	//* 252  540:i2f             
	//* 253  541:iconst_0        
	//* 254  542:invokestatic    #276 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//* 255  545:astore_2        
	//* 256  546:aload_1         
	//* 257  547:aload_2         
	//* 258  548:invokevirtual   #279 <Method void aco.a(MotionEvent)>
	//* 259  551:aload_2         
	//* 260  552:invokevirtual   #282 <Method void MotionEvent.recycle()>
	//* 261  555:return          
	//* 262  556:ldc1            #218 <String "currentTime">
	//* 263  558:aload           13
	//* 264  560:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 265  563:ifeq            643
	//* 266  566:aload_2         
	//* 267  567:ldc2            #284 <String "time">
	//* 268  570:invokeinterface #23  <Method Object Map.get(Object)>
	//* 269  575:checkcast       #25  <Class String>
	//* 270  578:astore_2        
	//* 271  579:aload_2         
	//* 272  580:ifnonnull       590
	//* 273  583:ldc2            #286 <String "Time parameter missing from currentTime video GMSG.">
	//* 274  586:invokestatic    #72  <Method void wx.e(String)>
	//* 275  589:return          
	//* 276  590:aload_1         
	//* 277  591:aload_2         
	//* 278  592:invokestatic    #226 <Method float Float.parseFloat(String)>
	//* 279  595:ldc2            #287 <Float 1000F>
	//* 280  598:fmul            
	//* 281  599:f2i             
	//* 282  600:invokevirtual   #289 <Method void aco.a(int)>
	//* 283  603:return          
	//* 284  604:aload_2         
	//* 285  605:invokestatic    #47  <Method String String.valueOf(Object)>
	//* 286  608:astore_1        
	//* 287  609:aload_1         
	//* 288  610:invokevirtual   #51  <Method int String.length()>
	//* 289  613:ifeq            627
	//* 290  616:ldc2            #291 <String "Could not parse time parameter from currentTime video GMSG: ">
	//* 291  619:aload_1         
	//* 292  620:invokevirtual   #237 <Method String String.concat(String)>
	//* 293  623:astore_1        
	//* 294  624:goto            638
	//* 295  627:new             #25  <Class String>
	//* 296  630:dup             
	//* 297  631:ldc2            #291 <String "Could not parse time parameter from currentTime video GMSG: ">
	//* 298  634:invokespecial   #239 <Method void String(String)>
	//* 299  637:astore_1        
	//* 300  638:aload_1         
	//* 301  639:invokestatic    #72  <Method void wx.e(String)>
	//* 302  642:return          
	//* 303  643:ldc2            #293 <String "hide">
	//* 304  646:aload           13
	//* 305  648:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 306  651:ifeq            660
	//* 307  654:aload_1         
	//* 308  655:iconst_4        
	//* 309  656:invokevirtual   #296 <Method void aco.setVisibility(int)>
	//* 310  659:return          
	//* 311  660:ldc2            #298 <String "load">
	//* 312  663:aload           13
	//* 313  665:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 314  668:ifeq            676
	//* 315  671:aload_1         
	//* 316  672:invokevirtual   #301 <Method void aco.h()>
	//* 317  675:return          
	//* 318  676:ldc2            #303 <String "loadControl">
	//* 319  679:aload           13
	//* 320  681:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 321  684:ifeq            693
	//* 322  687:aload_1         
	//* 323  688:aload_2         
	//* 324  689:invokestatic    #305 <Method void a(aco, Map)>
	//* 325  692:return          
	//* 326  693:ldc2            #307 <String "muted">
	//* 327  696:aload           13
	//* 328  698:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 329  701:ifeq            732
	//* 330  704:aload_2         
	//* 331  705:ldc2            #307 <String "muted">
	//* 332  708:invokeinterface #23  <Method Object Map.get(Object)>
	//* 333  713:checkcast       #25  <Class String>
	//* 334  716:invokestatic    #313 <Method boolean Boolean.parseBoolean(String)>
	//* 335  719:ifeq            727
	//* 336  722:aload_1         
	//* 337  723:invokevirtual   #314 <Method void aco.k()>
	//* 338  726:return          
	//* 339  727:aload_1         
	//* 340  728:invokevirtual   #317 <Method void aco.l()>
	//* 341  731:return          
	//* 342  732:ldc2            #319 <String "pause">
	//* 343  735:aload           13
	//* 344  737:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 345  740:ifeq            748
	//* 346  743:aload_1         
	//* 347  744:invokevirtual   #322 <Method void aco.i()>
	//* 348  747:return          
	//* 349  748:ldc2            #324 <String "play">
	//* 350  751:aload           13
	//* 351  753:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 352  756:ifeq            764
	//* 353  759:aload_1         
	//* 354  760:invokevirtual   #327 <Method void aco.j()>
	//* 355  763:return          
	//* 356  764:ldc2            #329 <String "show">
	//* 357  767:aload           13
	//* 358  769:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 359  772:ifeq            781
	//* 360  775:aload_1         
	//* 361  776:iconst_0        
	//* 362  777:invokevirtual   #296 <Method void aco.setVisibility(int)>
	//* 363  780:return          
	//* 364  781:ldc2            #331 <String "src">
	//* 365  784:aload           13
	//* 366  786:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 367  789:ifeq            809
	//* 368  792:aload_1         
	//* 369  793:aload_2         
	//* 370  794:ldc2            #331 <String "src">
	//* 371  797:invokeinterface #23  <Method Object Map.get(Object)>
	//* 372  802:checkcast       #25  <Class String>
	//* 373  805:invokevirtual   #333 <Method void aco.a(String)>
	//* 374  808:return          
	//* 375  809:ldc2            #335 <String "touchMove">
	//* 376  812:aload           13
	//* 377  814:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 378  817:ifeq            881
	//* 379  820:aload           12
	//* 380  822:invokeinterface #258 <Method Context add.getContext()>
	//* 381  827:astore          13
	//* 382  829:aload           13
	//* 383  831:aload_2         
	//* 384  832:ldc2            #337 <String "dx">
	//* 385  835:iconst_0        
	//* 386  836:invokestatic    #262 <Method int a(Context, Map, String, int)>
	//* 387  839:istore_3        
	//* 388  840:aload           13
	//* 389  842:aload_2         
	//* 390  843:ldc2            #339 <String "dy">
	//* 391  846:iconst_0        
	//* 392  847:invokestatic    #262 <Method int a(Context, Map, String, int)>
	//* 393  850:istore          4
	//* 394  852:aload_1         
	//* 395  853:iload_3         
	//* 396  854:i2f             
	//* 397  855:iload           4
	//* 398  857:i2f             
	//* 399  858:invokevirtual   #342 <Method void aco.a(float, float)>
	//* 400  861:aload_0         
	//* 401  862:getfield        #344 <Field boolean a>
	//* 402  865:ifne            880
	//* 403  868:aload           12
	//* 404  870:invokeinterface #347 <Method void add.f()>
	//* 405  875:aload_0         
	//* 406  876:iconst_1        
	//* 407  877:putfield        #344 <Field boolean a>
	//* 408  880:return          
	//* 409  881:ldc2            #349 <String "volume">
	//* 410  884:aload           13
	//* 411  886:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 412  889:ifeq            964
	//* 413  892:aload_2         
	//* 414  893:ldc2            #349 <String "volume">
	//* 415  896:invokeinterface #23  <Method Object Map.get(Object)>
	//* 416  901:checkcast       #25  <Class String>
	//* 417  904:astore_2        
	//* 418  905:aload_2         
	//* 419  906:ifnonnull       916
	//* 420  909:ldc2            #351 <String "Level parameter missing from volume video GMSG.">
	//* 421  912:invokestatic    #72  <Method void wx.e(String)>
	//* 422  915:return          
	//* 423  916:aload_1         
	//* 424  917:aload_2         
	//* 425  918:invokestatic    #226 <Method float Float.parseFloat(String)>
	//* 426  921:invokevirtual   #354 <Method void aco.setVolume(float)>
	//* 427  924:return          
	//* 428  925:aload_2         
	//* 429  926:invokestatic    #47  <Method String String.valueOf(Object)>
	//* 430  929:astore_1        
	//* 431  930:aload_1         
	//* 432  931:invokevirtual   #51  <Method int String.length()>
	//* 433  934:ifeq            948
	//* 434  937:ldc2            #356 <String "Could not parse volume parameter from volume video GMSG: ">
	//* 435  940:aload_1         
	//* 436  941:invokevirtual   #237 <Method String String.concat(String)>
	//* 437  944:astore_1        
	//* 438  945:goto            959
	//* 439  948:new             #25  <Class String>
	//* 440  951:dup             
	//* 441  952:ldc2            #356 <String "Could not parse volume parameter from volume video GMSG: ">
	//* 442  955:invokespecial   #239 <Method void String(String)>
	//* 443  958:astore_1        
	//* 444  959:aload_1         
	//* 445  960:invokestatic    #72  <Method void wx.e(String)>
	//* 446  963:return          
	//* 447  964:ldc2            #358 <String "watermark">
	//* 448  967:aload           13
	//* 449  969:invokevirtual   #137 <Method boolean String.equals(Object)>
	//* 450  972:ifeq            980
	//* 451  975:aload_1         
	//* 452  976:invokevirtual   #361 <Method void aco.m()>
	//* 453  979:return          
	//* 454  980:aload           13
	//* 455  982:invokestatic    #47  <Method String String.valueOf(Object)>
	//* 456  985:astore_1        
	//* 457  986:aload_1         
	//* 458  987:invokevirtual   #51  <Method int String.length()>
	//* 459  990:ifeq            1004
	//* 460  993:ldc2            #363 <String "Unknown video action: ">
	//* 461  996:aload_1         
	//* 462  997:invokevirtual   #237 <Method String String.concat(String)>
	//* 463 1000:astore_1        
	//* 464 1001:goto            1015
	//* 465 1004:new             #25  <Class String>
	//* 466 1007:dup             
	//* 467 1008:ldc2            #363 <String "Unknown video action: ">
	//* 468 1011:invokespecial   #239 <Method void String(String)>
	//* 469 1014:astore_1        
	//* 470 1015:aload_1         
	//* 471 1016:invokestatic    #72  <Method void wx.e(String)>
	//* 472 1019:return          
	//* 473 1020:aload           12
	//* 474 1022:invokeinterface #258 <Method Context add.getContext()>
	//* 475 1027:astore_1        
	//* 476 1028:aload_1         
	//* 477 1029:aload_2         
	//* 478 1030:ldc2            #260 <String "x">
	//* 479 1033:iconst_0        
	//* 480 1034:invokestatic    #262 <Method int a(Context, Map, String, int)>
	//* 481 1037:istore          4
	//* 482 1039:aload_1         
	//* 483 1040:aload_2         
	//* 484 1041:ldc2            #264 <String "y">
	//* 485 1044:iconst_0        
	//* 486 1045:invokestatic    #262 <Method int a(Context, Map, String, int)>
	//* 487 1048:istore          5
	//* 488 1050:aload_1         
	//* 489 1051:aload_2         
	//* 490 1052:ldc2            #365 <String "w">
	//* 491 1055:iconst_m1       
	//* 492 1056:invokestatic    #262 <Method int a(Context, Map, String, int)>
	//* 493 1059:istore          6
	//* 494 1061:aload_1         
	//* 495 1062:aload_2         
	//* 496 1063:ldc2            #366 <String "h">
	//* 497 1066:iconst_m1       
	//* 498 1067:invokestatic    #262 <Method int a(Context, Map, String, int)>
	//* 499 1070:istore_3        
	//* 500 1071:iload           6
	//* 501 1073:aload           12
	//* 502 1075:invokeinterface #368 <Method int add.m()>
	//* 503 1080:iload           4
	//* 504 1082:isub            
	//* 505 1083:invokestatic    #374 <Method int Math.min(int, int)>
	//* 506 1086:istore          6
	//* 507 1088:iload_3         
	//* 508 1089:aload           12
	//* 509 1091:invokeinterface #376 <Method int add.l()>
	//* 510 1096:iload           5
	//* 511 1098:isub            
	//* 512 1099:invokestatic    #374 <Method int Math.min(int, int)>
	//* 513 1102:istore          7
	//* 514 1104:aload_2         
	//* 515 1105:ldc2            #378 <String "player">
	//* 516 1108:invokeinterface #23  <Method Object Map.get(Object)>
	//* 517 1113:checkcast       #25  <Class String>
	//* 518 1116:invokestatic    #36  <Method int Integer.parseInt(String)>
	//* 519 1119:istore_3        
	//* 520 1120:goto            1125
	//* 521 1123:iconst_0        
	//* 522 1124:istore_3        
	//* 523 1125:aload_2         
	//* 524 1126:ldc2            #380 <String "spherical">
	//* 525 1129:invokeinterface #23  <Method Object Map.get(Object)>
	//* 526 1134:checkcast       #25  <Class String>
	//* 527 1137:invokestatic    #313 <Method boolean Boolean.parseBoolean(String)>
	//* 528 1140:istore          9
	//* 529 1142:iload           8
	//* 530 1144:ifeq            1206
	//* 531 1147:aload           14
	//* 532 1149:invokevirtual   #249 <Method aco acu.a()>
	//* 533 1152:ifnonnull       1206
	//* 534 1155:aload           14
	//* 535 1157:iload           4
	//* 536 1159:iload           5
	//* 537 1161:iload           6
	//* 538 1163:iload           7
	//* 539 1165:iload_3         
	//* 540 1166:iload           9
	//* 541 1168:new             #382 <Class adc>
	//* 542 1171:dup             
	//* 543 1172:aload_2         
	//* 544 1173:ldc2            #384 <String "flags">
	//* 545 1176:invokeinterface #23  <Method Object Map.get(Object)>
	//* 546 1181:checkcast       #25  <Class String>
	//* 547 1184:invokespecial   #385 <Method void adc(String)>
	//* 548 1187:invokevirtual   #388 <Method void acu.a(int, int, int, int, int, boolean, adc)>
	//* 549 1190:aload           14
	//* 550 1192:invokevirtual   #249 <Method aco acu.a()>
	//* 551 1195:astore_1        
	//* 552 1196:aload_1         
	//* 553 1197:ifnull          1205
	//* 554 1200:aload_1         
	//* 555 1201:aload_2         
	//* 556 1202:invokestatic    #305 <Method void a(aco, Map)>
	//* 557 1205:return          
	//* 558 1206:aload           14
	//* 559 1208:iload           4
	//* 560 1210:iload           5
	//* 561 1212:iload           6
	//* 562 1214:iload           7
	//* 563 1216:invokevirtual   #391 <Method void acu.a(int, int, int, int)>
	//* 564 1219:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				wx.e("Invalid color parameter in video GMSG.");
			}
			return;
		}
		boolean flag = "decoderProps".equals(obj2);
		int i = 0;
		if(flag)
		{
			map = ((Map) ((String)map.get("mimeTypes")));
			if(map == null)
			{
				wx.e("No MIME types specified for decoder properties inspection.");
				aco.a(((add) (obj1)), "missingMimeTypes");
				return;
			}
			if(android.os.Build.VERSION.SDK_INT < 16)
			{
				wx.e("Video decoder properties available on API versions >= 16.");
				aco.a(((add) (obj1)), "deficientApiVersion");
				return;
			}
			obj = ((Object) (new HashMap()));
			map = ((Map) (((String) (map)).split(",")));
			for(int j = map.length; i < j; i++)
			{
				obj2 = ((Object) (map[i]));
				((Map) (obj)).put(obj2, ((Object) (zt.a(((String) (obj2)).trim()))));
			}

			aco.a(((add) (obj1)), ((Map) (obj)));
			return;
		}
		acu acu1 = ((add) (obj1)).a();
		if(acu1 == null)
		{
			wx.e("Could not get underlay container for a video GMSG.");
			return;
		}
		flag = "new".equals(obj2);
		boolean flag1 = "position".equals(obj2);
		if(!flag && !flag1)
		{
			agd agd1 = ((add) (obj1)).b();
			if(agd1 != null)
				if("timeupdate".equals(obj2))
				{
					obj = ((Object) ((String)map.get("currentTime")));
					if(obj == null)
					{
						wx.e("currentTime parameter missing from timeupdate video GMSG.");
						return;
					}
					try
					{
						agd1.a(Float.parseFloat(((String) (obj))));
					}
	//* 565 1220:astore_1        
	//* 566 1221:goto            172
					// Misplaced declaration of an exception variable
					catch(NumberFormatException numberformatexception)
					{
						obj = ((Object) (String.valueOf(obj)));
						if(((String) (obj)).length() != 0)
							obj = ((Object) ("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(((String) (obj)))));
						else
							obj = ((Object) (new String("Could not parse currentTime parameter from timeupdate video GMSG: ")));
						wx.e(((String) (obj)));
					}
				} else
				if("skip".equals(obj2))
					agd1.k();
			obj = ((Object) (acu1.a()));
			if(obj == null)
			{
				aco.a(((add) (obj1)));
				return;
			}
			if("click".equals(obj2))
			{
				obj1 = ((Object) (((add) (obj1)).getContext()));
				i = a(((Context) (obj1)), map, "x", 0);
				int k = a(((Context) (obj1)), map, "y", 0);
				long l2 = SystemClock.uptimeMillis();
				map = ((Map) (MotionEvent.obtain(l2, l2, 0, i, k, 0)));
				((aco) (obj)).a(((MotionEvent) (map)));
				((MotionEvent) (map)).recycle();
				return;
			}
			if("currentTime".equals(obj2))
			{
				map = ((Map) ((String)map.get("time")));
				if(map == null)
				{
					wx.e("Time parameter missing from currentTime video GMSG.");
					return;
				}
				try
				{
					((aco) (obj)).a((int)(Float.parseFloat(((String) (map))) * 1000F));
					return;
				}
	//* 567 1224:astore          15
	//* 568 1226:goto            414
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					obj = ((Object) (String.valueOf(((Object) (map)))));
				}
				if(((String) (obj)).length() != 0)
					obj = ((Object) ("Could not parse time parameter from currentTime video GMSG: ".concat(((String) (obj)))));
				else
					obj = ((Object) (new String("Could not parse time parameter from currentTime video GMSG: ")));
				wx.e(((String) (obj)));
				return;
			}
			if("hide".equals(obj2))
			{
				((aco) (obj)).setVisibility(4);
				return;
			}
			if("load".equals(obj2))
			{
				((aco) (obj)).h();
				return;
			}
			if("loadControl".equals(obj2))
			{
				a(((aco) (obj)), map);
				return;
			}
			if("muted".equals(obj2))
				if(Boolean.parseBoolean((String)map.get("muted")))
				{
					((aco) (obj)).k();
					return;
				} else
				{
					((aco) (obj)).l();
					return;
				}
			if("pause".equals(obj2))
			{
				((aco) (obj)).i();
				return;
			}
			if("play".equals(obj2))
			{
				((aco) (obj)).j();
				return;
			}
			if("show".equals(obj2))
			{
				((aco) (obj)).setVisibility(0);
				return;
			}
			if("src".equals(obj2))
			{
				((aco) (obj)).a((String)map.get("src"));
				return;
			}
			if("touchMove".equals(obj2))
			{
				obj2 = ((Object) (((add) (obj1)).getContext()));
				i = a(((Context) (obj2)), map, "dx", 0);
				int l = a(((Context) (obj2)), map, "dy", 0);
				((aco) (obj)).a(i, l);
				if(!a)
				{
					((add) (obj1)).f();
					a = true;
				}
				return;
			}
			if("volume".equals(obj2))
			{
				map = ((Map) ((String)map.get("volume")));
				if(map == null)
				{
					wx.e("Level parameter missing from volume video GMSG.");
					return;
				}
				try
				{
					((aco) (obj)).setVolume(Float.parseFloat(((String) (map))));
					return;
				}
	//* 569 1229:astore_1        
	//* 570 1230:goto            604
				// Misplaced declaration of an exception variable
				catch(Object obj)
				{
					obj = ((Object) (String.valueOf(((Object) (map)))));
				}
				if(((String) (obj)).length() != 0)
					obj = ((Object) ("Could not parse volume parameter from volume video GMSG: ".concat(((String) (obj)))));
				else
					obj = ((Object) (new String("Could not parse volume parameter from volume video GMSG: ")));
				wx.e(((String) (obj)));
				return;
			}
			if("watermark".equals(obj2))
			{
				((aco) (obj)).m();
				return;
			}
			obj = ((Object) (String.valueOf(obj2)));
			if(((String) (obj)).length() != 0)
				obj = ((Object) ("Unknown video action: ".concat(((String) (obj)))));
			else
				obj = ((Object) (new String("Unknown video action: ")));
			wx.e(((String) (obj)));
			return;
		}
		obj = ((Object) (((add) (obj1)).getContext()));
		int i1 = a(((Context) (obj)), map, "x", 0);
		int j1 = a(((Context) (obj)), map, "y", 0);
		int k1 = a(((Context) (obj)), map, "w", -1);
		i = a(((Context) (obj)), map, "h", -1);
		k1 = Math.min(k1, ((add) (obj1)).m() - i1);
		int l1 = Math.min(i, ((add) (obj1)).l() - j1);
		try
		{
			i = Integer.parseInt((String)map.get("player"));
		}
	//* 571 1233:astore_1        
	//* 572 1234:goto            925
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			i = 0;
		}
		flag1 = Boolean.parseBoolean((String)map.get("spherical"));
		if(flag && acu1.a() == null)
		{
			acu1.a(i1, j1, k1, l1, i, flag1, new adc((String)map.get("flags")));
			obj = ((Object) (acu1.a()));
			if(obj != null)
				a(((aco) (obj)), map);
			return;
		} else
		{
			acu1.a(i1, j1, k1, l1);
			return;
		}
	//* 573 1237:astore_1        
	//* 574 1238:goto            1123
	}

	private boolean a;
}
