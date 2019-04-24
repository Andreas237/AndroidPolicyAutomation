// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkb, zzamu, zzakb, zzapw, 
//			zzapi, zzams, zzapn, zznk, 
//			zzni, zzapv

public final class zzaqc
	implements zzv
{

	public zzaqc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	private static int zza(Context context, Map map, String s, int i)
	{
		map = ((Map) ((String)map.get(((Object) (s)))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #25  <Method Object Map.get(Object)>
	//    3    7:checkcast       #27  <Class String>
	//    4   10:astore_1        
		if(map == null) goto _L2; else goto _L1
	//    5   11:aload_1         
	//    6   12:ifnull          91
_L1:
		int j;
		zzkb.zzif();
	//    7   15:invokestatic    #33  <Method zzamu zzkb.zzif()>
	//    8   18:pop             
		j = zzamu.zza(context, Integer.parseInt(((String) (map))));
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokestatic    #39  <Method int Integer.parseInt(String)>
	//   12   24:invokestatic    #44  <Method int zzamu.zza(Context, int)>
	//   13   27:istore          4
		return j;
	//   14   29:iload           4
	//   15   31:ireturn         
_L4:
		context = ((Context) (new StringBuilder(34 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (map))).length())));
	//   16   32:new             #46  <Class StringBuilder>
	//   17   35:dup             
	//   18   36:bipush          34
	//   19   38:aload_2         
	//   20   39:invokestatic    #50  <Method String String.valueOf(Object)>
	//   21   42:invokevirtual   #54  <Method int String.length()>
	//   22   45:iadd            
	//   23   46:aload_1         
	//   24   47:invokestatic    #50  <Method String String.valueOf(Object)>
	//   25   50:invokevirtual   #54  <Method int String.length()>
	//   26   53:iadd            
	//   27   54:invokespecial   #57  <Method void StringBuilder(int)>
	//   28   57:astore_0        
		((StringBuilder) (context)).append("Could not parse ");
	//   29   58:aload_0         
	//   30   59:ldc1            #59  <String "Could not parse ">
	//   31   61:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   32   64:pop             
		((StringBuilder) (context)).append(s);
	//   33   65:aload_0         
	//   34   66:aload_2         
	//   35   67:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   36   70:pop             
		((StringBuilder) (context)).append(" in a video GMSG: ");
	//   37   71:aload_0         
	//   38   72:ldc1            #65  <String " in a video GMSG: ">
	//   39   74:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   40   77:pop             
		((StringBuilder) (context)).append(((String) (map)));
	//   41   78:aload_0         
	//   42   79:aload_1         
	//   43   80:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   44   83:pop             
		zzakb.zzdk(((StringBuilder) (context)).toString());
	//   45   84:aload_0         
	//   46   85:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   47   88:invokestatic    #75  <Method void zzakb.zzdk(String)>
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

	private static void zza(zzapi zzapi1, Map map)
	{
		String s;
		String s1;
		zzapi1 = ((zzapi) ((String)map.get("minBufferMs")));
	//    0    0:aload_1         
	//    1    1:ldc1            #80  <String "minBufferMs">
	//    2    3:invokeinterface #25  <Method Object Map.get(Object)>
	//    3    8:checkcast       #27  <Class String>
	//    4   11:astore_0        
		s = (String)map.get("maxBufferMs");
	//    5   12:aload_1         
	//    6   13:ldc1            #82  <String "maxBufferMs">
	//    7   15:invokeinterface #25  <Method Object Map.get(Object)>
	//    8   20:checkcast       #27  <Class String>
	//    9   23:astore_2        
		s1 = (String)map.get("bufferForPlaybackMs");
	//   10   24:aload_1         
	//   11   25:ldc1            #84  <String "bufferForPlaybackMs">
	//   12   27:invokeinterface #25  <Method Object Map.get(Object)>
	//   13   32:checkcast       #27  <Class String>
	//   14   35:astore_3        
		map = ((Map) ((String)map.get("bufferForPlaybackAfterRebufferMs")));
	//   15   36:aload_1         
	//   16   37:ldc1            #86  <String "bufferForPlaybackAfterRebufferMs">
	//   17   39:invokeinterface #25  <Method Object Map.get(Object)>
	//   18   44:checkcast       #27  <Class String>
	//   19   47:astore_1        
		if(zzapi1 == null)
			break MISSING_BLOCK_LABEL_57;
	//   20   48:aload_0         
	//   21   49:ifnull          57
		Integer.parseInt(((String) (zzapi1)));
	//   22   52:aload_0         
	//   23   53:invokestatic    #39  <Method int Integer.parseInt(String)>
	//   24   56:pop             
		if(s == null)
			break MISSING_BLOCK_LABEL_66;
	//   25   57:aload_2         
	//   26   58:ifnull          66
		Integer.parseInt(s);
	//   27   61:aload_2         
	//   28   62:invokestatic    #39  <Method int Integer.parseInt(String)>
	//   29   65:pop             
		if(s1 == null)
			break MISSING_BLOCK_LABEL_75;
	//   30   66:aload_3         
	//   31   67:ifnull          75
		Integer.parseInt(s1);
	//   32   70:aload_3         
	//   33   71:invokestatic    #39  <Method int Integer.parseInt(String)>
	//   34   74:pop             
		if(map != null)
	//*  35   75:aload_1         
	//*  36   76:ifnull          105
			try
			{
				Integer.parseInt(((String) (map)));
	//   37   79:aload_1         
	//   38   80:invokestatic    #39  <Method int Integer.parseInt(String)>
	//   39   83:pop             
				return;
	//   40   84:return          
			}
	//*  41   85:ldc1            #88  <String "Could not parse buffer parameters in loadControl video GMSG: (%s, %s)">
	//*  42   87:iconst_2        
	//*  43   88:anewarray       Object[]
	//*  44   91:dup             
	//*  45   92:iconst_0        
	//*  46   93:aload_0         
	//*  47   94:aastore         
	//*  48   95:dup             
	//*  49   96:iconst_1        
	//*  50   97:aload_2         
	//*  51   98:aastore         
	//*  52   99:invokestatic    #92  <Method String String.format(String, Object[])>
	//*  53  102:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//*  54  105:return          
			// Misplaced declaration of an exception variable
			catch(Map map)
			{
				zzakb.zzdk(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[] {
					zzapi1, s
				}));
			}
		return;
	//*  55  106:astore_1        
	//*  56  107:goto            85
	}

	public final void zza(Object obj, Map map)
	{
		obj = ((Object) ((zzapw)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #98  <Class zzapw>
	//    2    4:astore_1        
		Object obj3 = ((Object) ((String)map.get("action")));
	//    3    5:aload_2         
	//    4    6:ldc1            #100 <String "action">
	//    5    8:invokeinterface #25  <Method Object Map.get(Object)>
	//    6   13:checkcast       #27  <Class String>
	//    7   16:astore          13
		if(obj3 == null)
	//*   8   18:aload           13
	//*   9   20:ifnonnull       29
		{
			zzakb.zzdk("Action missing from video GMSG.");
	//   10   23:ldc1            #102 <String "Action missing from video GMSG.">
	//   11   25:invokestatic    #75  <Method void zzakb.zzdk(String)>
			return;
	//   12   28:return          
		}
		if(zzakb.isLoggable(3))
	//*  13   29:iconst_3        
	//*  14   30:invokestatic    #106 <Method boolean zzakb.isLoggable(int)>
	//*  15   33:ifeq            130
		{
			Object obj1 = ((Object) (new JSONObject(map)));
	//   16   36:new             #108 <Class JSONObject>
	//   17   39:dup             
	//   18   40:aload_2         
	//   19   41:invokespecial   #111 <Method void JSONObject(Map)>
	//   20   44:astore          12
			((JSONObject) (obj1)).remove("google.afma.Notify_dt");
	//   21   46:aload           12
	//   22   48:ldc1            #113 <String "google.afma.Notify_dt">
	//   23   50:invokevirtual   #117 <Method Object JSONObject.remove(String)>
	//   24   53:pop             
			obj1 = ((Object) (((JSONObject) (obj1)).toString()));
	//   25   54:aload           12
	//   26   56:invokevirtual   #118 <Method String JSONObject.toString()>
	//   27   59:astore          12
			StringBuilder stringbuilder = new StringBuilder(13 + String.valueOf(obj3).length() + String.valueOf(obj1).length());
	//   28   61:new             #46  <Class StringBuilder>
	//   29   64:dup             
	//   30   65:bipush          13
	//   31   67:aload           13
	//   32   69:invokestatic    #50  <Method String String.valueOf(Object)>
	//   33   72:invokevirtual   #54  <Method int String.length()>
	//   34   75:iadd            
	//   35   76:aload           12
	//   36   78:invokestatic    #50  <Method String String.valueOf(Object)>
	//   37   81:invokevirtual   #54  <Method int String.length()>
	//   38   84:iadd            
	//   39   85:invokespecial   #57  <Method void StringBuilder(int)>
	//   40   88:astore          14
			stringbuilder.append("Video GMSG: ");
	//   41   90:aload           14
	//   42   92:ldc1            #120 <String "Video GMSG: ">
	//   43   94:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   44   97:pop             
			stringbuilder.append(((String) (obj3)));
	//   45   98:aload           14
	//   46  100:aload           13
	//   47  102:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   48  105:pop             
			stringbuilder.append(" ");
	//   49  106:aload           14
	//   50  108:ldc1            #122 <String " ">
	//   51  110:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   52  113:pop             
			stringbuilder.append(((String) (obj1)));
	//   53  114:aload           14
	//   54  116:aload           12
	//   55  118:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
	//   56  121:pop             
			zzakb.zzck(stringbuilder.toString());
	//   57  122:aload           14
	//   58  124:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   59  127:invokestatic    #125 <Method void zzakb.zzck(String)>
		}
		if("background".equals(obj3))
	//*  60  130:ldc1            #127 <String "background">
	//*  61  132:aload           13
	//*  62  134:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  63  137:ifeq            182
		{
			map = ((Map) ((String)map.get("color")));
	//   64  140:aload_2         
	//   65  141:ldc1            #133 <String "color">
	//   66  143:invokeinterface #25  <Method Object Map.get(Object)>
	//   67  148:checkcast       #27  <Class String>
	//   68  151:astore_2        
			if(TextUtils.isEmpty(((CharSequence) (map))))
	//*  69  152:aload_2         
	//*  70  153:invokestatic    #139 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  71  156:ifeq            165
			{
				zzakb.zzdk("Color parameter missing from color video GMSG.");
	//   72  159:ldc1            #141 <String "Color parameter missing from color video GMSG.">
	//   73  161:invokestatic    #75  <Method void zzakb.zzdk(String)>
				return;
	//   74  164:return          
			}
			try
			{
				((zzapw) (obj)).setBackgroundColor(Color.parseColor(((String) (map))));
	//   75  165:aload_1         
	//   76  166:aload_2         
	//   77  167:invokestatic    #146 <Method int Color.parseColor(String)>
	//   78  170:invokeinterface #149 <Method void zzapw.setBackgroundColor(int)>
				return;
	//   79  175:return          
			}
	//*  80  176:ldc1            #151 <String "Invalid color parameter in video GMSG.">
	//*  81  178:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//*  82  181:return          
	//*  83  182:ldc1            #153 <String "decoderProps">
	//*  84  184:aload           13
	//*  85  186:invokevirtual   #131 <Method boolean String.equals(Object)>
	//*  86  189:istore          8
	//*  87  191:iconst_0        
	//*  88  192:istore_3        
	//*  89  193:iload           8
	//*  90  195:ifeq            312
	//*  91  198:aload_2         
	//*  92  199:ldc1            #155 <String "mimeTypes">
	//*  93  201:invokeinterface #25  <Method Object Map.get(Object)>
	//*  94  206:checkcast       #27  <Class String>
	//*  95  209:astore          12
	//*  96  211:aload           12
	//*  97  213:ifnonnull       228
	//*  98  216:ldc1            #157 <String "No MIME types specified for decoder properties inspection.">
	//*  99  218:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//* 100  221:aload_1         
	//* 101  222:ldc1            #159 <String "missingMimeTypes">
	//* 102  224:invokestatic    #164 <Method void zzapi.zza(zzapw, String)>
	//* 103  227:return          
	//* 104  228:getstatic       #170 <Field int android.os.Build$VERSION.SDK_INT>
	//* 105  231:bipush          16
	//* 106  233:icmpge          248
	//* 107  236:ldc1            #172 <String "Video decoder properties available on API versions >= 16.">
	//* 108  238:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//* 109  241:aload_1         
	//* 110  242:ldc1            #174 <String "deficientApiVersion">
	//* 111  244:invokestatic    #164 <Method void zzapi.zza(zzapw, String)>
	//* 112  247:return          
	//* 113  248:new             #176 <Class HashMap>
	//* 114  251:dup             
	//* 115  252:invokespecial   #177 <Method void HashMap()>
	//* 116  255:astore_2        
	//* 117  256:aload           12
	//* 118  258:ldc1            #179 <String ",">
	//* 119  260:invokevirtual   #183 <Method String[] String.split(String)>
	//* 120  263:astore          12
	//* 121  265:aload           12
	//* 122  267:arraylength     
	//* 123  268:istore          4
	//* 124  270:iload_3         
	//* 125  271:iload           4
	//* 126  273:icmpge          306
	//* 127  276:aload           12
	//* 128  278:iload_3         
	//* 129  279:aaload          
	//* 130  280:astore          13
	//* 131  282:aload_2         
	//* 132  283:aload           13
	//* 133  285:aload           13
	//* 134  287:invokevirtual   #186 <Method String String.trim()>
	//* 135  290:invokestatic    #192 <Method java.util.List zzams.zzdd(String)>
	//* 136  293:invokeinterface #196 <Method Object Map.put(Object, Object)>
	//* 137  298:pop             
	//* 138  299:iload_3         
	//* 139  300:iconst_1        
	//* 140  301:iadd            
	//* 141  302:istore_3        
	//* 142  303:goto            270
	//* 143  306:aload_1         
	//* 144  307:aload_2         
	//* 145  308:invokestatic    #199 <Method void zzapi.zza(zzapw, Map)>
	//* 146  311:return          
	//* 147  312:aload_1         
	//* 148  313:invokeinterface #203 <Method zzapn zzapw.zztl()>
	//* 149  318:astore          12
	//* 150  320:aload           12
	//* 151  322:ifnonnull       331
	//* 152  325:ldc1            #205 <String "Could not get underlay container for a video GMSG.">
	//* 153  327:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//* 154  330:return          
	//* 155  331:ldc1            #207 <String "new">
	//* 156  333:aload           13
	//* 157  335:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 158  338:istore          8
	//* 159  340:ldc1            #209 <String "position">
	//* 160  342:aload           13
	//* 161  344:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 162  347:istore          9
	//* 163  349:iload           8
	//* 164  351:ifne            919
	//* 165  354:iload           9
	//* 166  356:ifeq            362
	//* 167  359:goto            919
	//* 168  362:aload           12
	//* 169  364:invokevirtual   #215 <Method zzapi zzapn.zzth()>
	//* 170  367:astore          12
	//* 171  369:aload           12
	//* 172  371:ifnonnull       379
	//* 173  374:aload_1         
	//* 174  375:invokestatic    #218 <Method void zzapi.zza(zzapw)>
	//* 175  378:return          
	//* 176  379:ldc1            #220 <String "click">
	//* 177  381:aload           13
	//* 178  383:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 179  386:ifeq            446
	//* 180  389:aload_1         
	//* 181  390:invokeinterface #224 <Method Context zzapw.getContext()>
	//* 182  395:astore_1        
	//* 183  396:aload_1         
	//* 184  397:aload_2         
	//* 185  398:ldc1            #226 <String "x">
	//* 186  400:iconst_0        
	//* 187  401:invokestatic    #228 <Method int zza(Context, Map, String, int)>
	//* 188  404:istore_3        
	//* 189  405:aload_1         
	//* 190  406:aload_2         
	//* 191  407:ldc1            #230 <String "y">
	//* 192  409:iconst_0        
	//* 193  410:invokestatic    #228 <Method int zza(Context, Map, String, int)>
	//* 194  413:istore          4
	//* 195  415:invokestatic    #236 <Method long SystemClock.uptimeMillis()>
	//* 196  418:lstore          10
	//* 197  420:lload           10
	//* 198  422:lload           10
	//* 199  424:iconst_0        
	//* 200  425:iload_3         
	//* 201  426:i2f             
	//* 202  427:iload           4
	//* 203  429:i2f             
	//* 204  430:iconst_0        
	//* 205  431:invokestatic    #242 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//* 206  434:astore_1        
	//* 207  435:aload           12
	//* 208  437:aload_1         
	//* 209  438:invokevirtual   #246 <Method void zzapi.zzf(MotionEvent)>
	//* 210  441:aload_1         
	//* 211  442:invokevirtual   #249 <Method void MotionEvent.recycle()>
	//* 212  445:return          
	//* 213  446:ldc1            #251 <String "currentTime">
	//* 214  448:aload           13
	//* 215  450:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 216  453:ifeq            532
	//* 217  456:aload_2         
	//* 218  457:ldc1            #253 <String "time">
	//* 219  459:invokeinterface #25  <Method Object Map.get(Object)>
	//* 220  464:checkcast       #27  <Class String>
	//* 221  467:astore_1        
	//* 222  468:aload_1         
	//* 223  469:ifnonnull       478
	//* 224  472:ldc1            #255 <String "Time parameter missing from currentTime video GMSG.">
	//* 225  474:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//* 226  477:return          
	//* 227  478:aload           12
	//* 228  480:aload_1         
	//* 229  481:invokestatic    #261 <Method float Float.parseFloat(String)>
	//* 230  484:ldc2            #262 <Float 1000F>
	//* 231  487:fmul            
	//* 232  488:f2i             
	//* 233  489:invokevirtual   #265 <Method void zzapi.seekTo(int)>
	//* 234  492:return          
	//* 235  493:aload_1         
	//* 236  494:invokestatic    #50  <Method String String.valueOf(Object)>
	//* 237  497:astore_1        
	//* 238  498:aload_1         
	//* 239  499:invokevirtual   #54  <Method int String.length()>
	//* 240  502:ifeq            516
	//* 241  505:ldc2            #267 <String "Could not parse time parameter from currentTime video GMSG: ">
	//* 242  508:aload_1         
	//* 243  509:invokevirtual   #271 <Method String String.concat(String)>
	//* 244  512:astore_1        
	//* 245  513:goto            527
	//* 246  516:new             #27  <Class String>
	//* 247  519:dup             
	//* 248  520:ldc2            #267 <String "Could not parse time parameter from currentTime video GMSG: ">
	//* 249  523:invokespecial   #273 <Method void String(String)>
	//* 250  526:astore_1        
	//* 251  527:aload_1         
	//* 252  528:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//* 253  531:return          
	//* 254  532:ldc2            #275 <String "hide">
	//* 255  535:aload           13
	//* 256  537:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 257  540:ifeq            550
	//* 258  543:aload           12
	//* 259  545:iconst_4        
	//* 260  546:invokevirtual   #278 <Method void zzapi.setVisibility(int)>
	//* 261  549:return          
	//* 262  550:ldc2            #280 <String "load">
	//* 263  553:aload           13
	//* 264  555:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 265  558:ifeq            567
	//* 266  561:aload           12
	//* 267  563:invokevirtual   #283 <Method void zzapi.zzta()>
	//* 268  566:return          
	//* 269  567:ldc2            #285 <String "loadControl">
	//* 270  570:aload           13
	//* 271  572:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 272  575:ifeq            585
	//* 273  578:aload           12
	//* 274  580:aload_2         
	//* 275  581:invokestatic    #287 <Method void zza(zzapi, Map)>
	//* 276  584:return          
	//* 277  585:ldc2            #289 <String "muted">
	//* 278  588:aload           13
	//* 279  590:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 280  593:ifeq            626
	//* 281  596:aload_2         
	//* 282  597:ldc2            #289 <String "muted">
	//* 283  600:invokeinterface #25  <Method Object Map.get(Object)>
	//* 284  605:checkcast       #27  <Class String>
	//* 285  608:invokestatic    #295 <Method boolean Boolean.parseBoolean(String)>
	//* 286  611:ifeq            620
	//* 287  614:aload           12
	//* 288  616:invokevirtual   #298 <Method void zzapi.zztb()>
	//* 289  619:return          
	//* 290  620:aload           12
	//* 291  622:invokevirtual   #301 <Method void zzapi.zztc()>
	//* 292  625:return          
	//* 293  626:ldc2            #303 <String "pause">
	//* 294  629:aload           13
	//* 295  631:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 296  634:ifeq            643
	//* 297  637:aload           12
	//* 298  639:invokevirtual   #305 <Method void zzapi.pause()>
	//* 299  642:return          
	//* 300  643:ldc2            #307 <String "play">
	//* 301  646:aload           13
	//* 302  648:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 303  651:ifeq            660
	//* 304  654:aload           12
	//* 305  656:invokevirtual   #309 <Method void zzapi.play()>
	//* 306  659:return          
	//* 307  660:ldc2            #311 <String "show">
	//* 308  663:aload           13
	//* 309  665:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 310  668:ifeq            678
	//* 311  671:aload           12
	//* 312  673:iconst_0        
	//* 313  674:invokevirtual   #278 <Method void zzapi.setVisibility(int)>
	//* 314  677:return          
	//* 315  678:ldc2            #313 <String "src">
	//* 316  681:aload           13
	//* 317  683:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 318  686:ifeq            707
	//* 319  689:aload           12
	//* 320  691:aload_2         
	//* 321  692:ldc2            #313 <String "src">
	//* 322  695:invokeinterface #25  <Method Object Map.get(Object)>
	//* 323  700:checkcast       #27  <Class String>
	//* 324  703:invokevirtual   #316 <Method void zzapi.zzdn(String)>
	//* 325  706:return          
	//* 326  707:ldc2            #318 <String "touchMove">
	//* 327  710:aload           13
	//* 328  712:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 329  715:ifeq            778
	//* 330  718:aload_1         
	//* 331  719:invokeinterface #224 <Method Context zzapw.getContext()>
	//* 332  724:astore          13
	//* 333  726:aload           13
	//* 334  728:aload_2         
	//* 335  729:ldc2            #320 <String "dx">
	//* 336  732:iconst_0        
	//* 337  733:invokestatic    #228 <Method int zza(Context, Map, String, int)>
	//* 338  736:istore_3        
	//* 339  737:aload           13
	//* 340  739:aload_2         
	//* 341  740:ldc2            #322 <String "dy">
	//* 342  743:iconst_0        
	//* 343  744:invokestatic    #228 <Method int zza(Context, Map, String, int)>
	//* 344  747:istore          4
	//* 345  749:aload           12
	//* 346  751:iload_3         
	//* 347  752:i2f             
	//* 348  753:iload           4
	//* 349  755:i2f             
	//* 350  756:invokevirtual   #325 <Method void zzapi.zza(float, float)>
	//* 351  759:aload_0         
	//* 352  760:getfield        #327 <Field boolean zzdau>
	//* 353  763:ifne            777
	//* 354  766:aload_1         
	//* 355  767:invokeinterface #330 <Method void zzapw.zznp()>
	//* 356  772:aload_0         
	//* 357  773:iconst_1        
	//* 358  774:putfield        #327 <Field boolean zzdau>
	//* 359  777:return          
	//* 360  778:ldc2            #332 <String "volume">
	//* 361  781:aload           13
	//* 362  783:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 363  786:ifeq            862
	//* 364  789:aload_2         
	//* 365  790:ldc2            #332 <String "volume">
	//* 366  793:invokeinterface #25  <Method Object Map.get(Object)>
	//* 367  798:checkcast       #27  <Class String>
	//* 368  801:astore_1        
	//* 369  802:aload_1         
	//* 370  803:ifnonnull       813
	//* 371  806:ldc2            #334 <String "Level parameter missing from volume video GMSG.">
	//* 372  809:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//* 373  812:return          
	//* 374  813:aload           12
	//* 375  815:aload_1         
	//* 376  816:invokestatic    #261 <Method float Float.parseFloat(String)>
	//* 377  819:invokevirtual   #338 <Method void zzapi.setVolume(float)>
	//* 378  822:return          
	//* 379  823:aload_1         
	//* 380  824:invokestatic    #50  <Method String String.valueOf(Object)>
	//* 381  827:astore_1        
	//* 382  828:aload_1         
	//* 383  829:invokevirtual   #54  <Method int String.length()>
	//* 384  832:ifeq            846
	//* 385  835:ldc2            #340 <String "Could not parse volume parameter from volume video GMSG: ">
	//* 386  838:aload_1         
	//* 387  839:invokevirtual   #271 <Method String String.concat(String)>
	//* 388  842:astore_1        
	//* 389  843:goto            857
	//* 390  846:new             #27  <Class String>
	//* 391  849:dup             
	//* 392  850:ldc2            #340 <String "Could not parse volume parameter from volume video GMSG: ">
	//* 393  853:invokespecial   #273 <Method void String(String)>
	//* 394  856:astore_1        
	//* 395  857:aload_1         
	//* 396  858:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//* 397  861:return          
	//* 398  862:ldc2            #342 <String "watermark">
	//* 399  865:aload           13
	//* 400  867:invokevirtual   #131 <Method boolean String.equals(Object)>
	//* 401  870:ifeq            879
	//* 402  873:aload           12
	//* 403  875:invokevirtual   #345 <Method void zzapi.zztd()>
	//* 404  878:return          
	//* 405  879:aload           13
	//* 406  881:invokestatic    #50  <Method String String.valueOf(Object)>
	//* 407  884:astore_1        
	//* 408  885:aload_1         
	//* 409  886:invokevirtual   #54  <Method int String.length()>
	//* 410  889:ifeq            903
	//* 411  892:ldc2            #347 <String "Unknown video action: ">
	//* 412  895:aload_1         
	//* 413  896:invokevirtual   #271 <Method String String.concat(String)>
	//* 414  899:astore_1        
	//* 415  900:goto            914
	//* 416  903:new             #27  <Class String>
	//* 417  906:dup             
	//* 418  907:ldc2            #347 <String "Unknown video action: ">
	//* 419  910:invokespecial   #273 <Method void String(String)>
	//* 420  913:astore_1        
	//* 421  914:aload_1         
	//* 422  915:invokestatic    #75  <Method void zzakb.zzdk(String)>
	//* 423  918:return          
	//* 424  919:aload_1         
	//* 425  920:invokeinterface #224 <Method Context zzapw.getContext()>
	//* 426  925:astore          13
	//* 427  927:aload           13
	//* 428  929:aload_2         
	//* 429  930:ldc1            #226 <String "x">
	//* 430  932:iconst_0        
	//* 431  933:invokestatic    #228 <Method int zza(Context, Map, String, int)>
	//* 432  936:istore          6
	//* 433  938:aload           13
	//* 434  940:aload_2         
	//* 435  941:ldc1            #230 <String "y">
	//* 436  943:iconst_0        
	//* 437  944:invokestatic    #228 <Method int zza(Context, Map, String, int)>
	//* 438  947:istore          7
	//* 439  949:aload           13
	//* 440  951:aload_2         
	//* 441  952:ldc2            #349 <String "w">
	//* 442  955:iconst_m1       
	//* 443  956:invokestatic    #228 <Method int zza(Context, Map, String, int)>
	//* 444  959:istore_3        
	//* 445  960:aload           13
	//* 446  962:aload_2         
	//* 447  963:ldc2            #351 <String "h">
	//* 448  966:iconst_m1       
	//* 449  967:invokestatic    #228 <Method int zza(Context, Map, String, int)>
	//* 450  970:istore          4
	//* 451  972:getstatic       #357 <Field zzna zznk.zzbca>
	//* 452  975:astore          13
	//* 453  977:invokestatic    #361 <Method zzni zzkb.zzik()>
	//* 454  980:aload           13
	//* 455  982:invokevirtual   #367 <Method Object zzni.zzd(zzna)>
	//* 456  985:checkcast       #291 <Class Boolean>
	//* 457  988:invokevirtual   #371 <Method boolean Boolean.booleanValue()>
	//* 458  991:ifeq            1027
	//* 459  994:iload_3         
	//* 460  995:aload_1         
	//* 461  996:invokeinterface #374 <Method int zzapw.zzts()>
	//* 462 1001:iload           6
	//* 463 1003:isub            
	//* 464 1004:invokestatic    #380 <Method int Math.min(int, int)>
	//* 465 1007:istore_3        
	//* 466 1008:iload           4
	//* 467 1010:aload_1         
	//* 468 1011:invokeinterface #383 <Method int zzapw.zztr()>
	//* 469 1016:iload           7
	//* 470 1018:isub            
	//* 471 1019:invokestatic    #380 <Method int Math.min(int, int)>
	//* 472 1022:istore          4
	//* 473 1024:goto            1027
	//* 474 1027:aload_2         
	//* 475 1028:ldc2            #385 <String "player">
	//* 476 1031:invokeinterface #25  <Method Object Map.get(Object)>
	//* 477 1036:checkcast       #27  <Class String>
	//* 478 1039:invokestatic    #39  <Method int Integer.parseInt(String)>
	//* 479 1042:istore          5
	//* 480 1044:goto            1050
	//* 481 1047:iconst_0        
	//* 482 1048:istore          5
	//* 483 1050:aload_2         
	//* 484 1051:ldc2            #387 <String "spherical">
	//* 485 1054:invokeinterface #25  <Method Object Map.get(Object)>
	//* 486 1059:checkcast       #27  <Class String>
	//* 487 1062:invokestatic    #295 <Method boolean Boolean.parseBoolean(String)>
	//* 488 1065:istore          9
	//* 489 1067:iload           8
	//* 490 1069:ifeq            1131
	//* 491 1072:aload           12
	//* 492 1074:invokevirtual   #215 <Method zzapi zzapn.zzth()>
	//* 493 1077:ifnonnull       1131
	//* 494 1080:aload           12
	//* 495 1082:iload           6
	//* 496 1084:iload           7
	//* 497 1086:iload_3         
	//* 498 1087:iload           4
	//* 499 1089:iload           5
	//* 500 1091:iload           9
	//* 501 1093:new             #389 <Class zzapv>
	//* 502 1096:dup             
	//* 503 1097:aload_2         
	//* 504 1098:ldc2            #391 <String "flags">
	//* 505 1101:invokeinterface #25  <Method Object Map.get(Object)>
	//* 506 1106:checkcast       #27  <Class String>
	//* 507 1109:invokespecial   #392 <Method void zzapv(String)>
	//* 508 1112:invokevirtual   #395 <Method void zzapn.zza(int, int, int, int, int, boolean, zzapv)>
	//* 509 1115:aload           12
	//* 510 1117:invokevirtual   #215 <Method zzapi zzapn.zzth()>
	//* 511 1120:astore_1        
	//* 512 1121:aload_1         
	//* 513 1122:ifnull          1130
	//* 514 1125:aload_1         
	//* 515 1126:aload_2         
	//* 516 1127:invokestatic    #287 <Method void zza(zzapi, Map)>
	//* 517 1130:return          
	//* 518 1131:aload           12
	//* 519 1133:iload           6
	//* 520 1135:iload           7
	//* 521 1137:iload_3         
	//* 522 1138:iload           4
	//* 523 1140:invokevirtual   #399 <Method void zzapn.zze(int, int, int, int)>
	//* 524 1143:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
			{
				zzakb.zzdk("Invalid color parameter in video GMSG.");
			}
			return;
		}
		boolean flag = "decoderProps".equals(obj3);
		int i = 0;
		if(flag)
		{
			String s = (String)map.get("mimeTypes");
			if(s == null)
			{
				zzakb.zzdk("No MIME types specified for decoder properties inspection.");
				zzapi.zza(((zzapw) (obj)), "missingMimeTypes");
				return;
			}
			if(android.os.Build.VERSION.SDK_INT < 16)
			{
				zzakb.zzdk("Video decoder properties available on API versions >= 16.");
				zzapi.zza(((zzapw) (obj)), "deficientApiVersion");
				return;
			}
			map = ((Map) (new HashMap()));
			String as[] = s.split(",");
			for(int j = as.length; i < j; i++)
			{
				obj3 = ((Object) (as[i]));
				map.put(obj3, ((Object) (zzams.zzdd(((String) (obj3)).trim()))));
			}

			zzapi.zza(((zzapw) (obj)), map);
			return;
		}
		Object obj2 = ((Object) (((zzapw) (obj)).zztl()));
		if(obj2 == null)
		{
			zzakb.zzdk("Could not get underlay container for a video GMSG.");
			return;
		}
		flag = "new".equals(obj3);
		boolean flag1 = "position".equals(obj3);
		if(!flag && !flag1)
		{
			obj2 = ((Object) (((zzapn) (obj2)).zzth()));
			if(obj2 == null)
			{
				zzapi.zza(((zzapw) (obj)));
				return;
			}
			if("click".equals(obj3))
			{
				obj = ((Object) (((zzapw) (obj)).getContext()));
				i = zza(((Context) (obj)), map, "x", 0);
				int k = zza(((Context) (obj)), map, "y", 0);
				long l2 = SystemClock.uptimeMillis();
				obj = ((Object) (MotionEvent.obtain(l2, l2, 0, i, k, 0)));
				((zzapi) (obj2)).zzf(((MotionEvent) (obj)));
				((MotionEvent) (obj)).recycle();
				return;
			}
			if("currentTime".equals(obj3))
			{
				obj = ((Object) ((String)map.get("time")));
				if(obj == null)
				{
					zzakb.zzdk("Time parameter missing from currentTime video GMSG.");
					return;
				}
				try
				{
					((zzapi) (obj2)).seekTo((int)(Float.parseFloat(((String) (obj))) * 1000F));
					return;
				}
	//* 525 1144:astore_1        
	//* 526 1145:goto            176
				// Misplaced declaration of an exception variable
				catch(Map map)
				{
					obj = ((Object) (String.valueOf(obj)));
				}
				if(((String) (obj)).length() != 0)
					obj = ((Object) ("Could not parse time parameter from currentTime video GMSG: ".concat(((String) (obj)))));
				else
					obj = ((Object) (new String("Could not parse time parameter from currentTime video GMSG: ")));
				zzakb.zzdk(((String) (obj)));
				return;
			}
			if("hide".equals(obj3))
			{
				((zzapi) (obj2)).setVisibility(4);
				return;
			}
			if("load".equals(obj3))
			{
				((zzapi) (obj2)).zzta();
				return;
			}
			if("loadControl".equals(obj3))
			{
				zza(((zzapi) (obj2)), map);
				return;
			}
			if("muted".equals(obj3))
				if(Boolean.parseBoolean((String)map.get("muted")))
				{
					((zzapi) (obj2)).zztb();
					return;
				} else
				{
					((zzapi) (obj2)).zztc();
					return;
				}
			if("pause".equals(obj3))
			{
				((zzapi) (obj2)).pause();
				return;
			}
			if("play".equals(obj3))
			{
				((zzapi) (obj2)).play();
				return;
			}
			if("show".equals(obj3))
			{
				((zzapi) (obj2)).setVisibility(0);
				return;
			}
			if("src".equals(obj3))
			{
				((zzapi) (obj2)).zzdn((String)map.get("src"));
				return;
			}
			if("touchMove".equals(obj3))
			{
				obj3 = ((Object) (((zzapw) (obj)).getContext()));
				i = zza(((Context) (obj3)), map, "dx", 0);
				int l = zza(((Context) (obj3)), map, "dy", 0);
				((zzapi) (obj2)).zza(i, l);
				if(!zzdau)
				{
					((zzapw) (obj)).zznp();
					zzdau = true;
				}
				return;
			}
			if("volume".equals(obj3))
			{
				obj = ((Object) ((String)map.get("volume")));
				if(obj == null)
				{
					zzakb.zzdk("Level parameter missing from volume video GMSG.");
					return;
				}
				try
				{
					((zzapi) (obj2)).setVolume(Float.parseFloat(((String) (obj))));
					return;
				}
	//* 527 1148:astore_2        
	//* 528 1149:goto            493
				// Misplaced declaration of an exception variable
				catch(Map map)
				{
					obj = ((Object) (String.valueOf(obj)));
				}
				if(((String) (obj)).length() != 0)
					obj = ((Object) ("Could not parse volume parameter from volume video GMSG: ".concat(((String) (obj)))));
				else
					obj = ((Object) (new String("Could not parse volume parameter from volume video GMSG: ")));
				zzakb.zzdk(((String) (obj)));
				return;
			}
			if("watermark".equals(obj3))
			{
				((zzapi) (obj2)).zztd();
				return;
			}
			obj = ((Object) (String.valueOf(obj3)));
			if(((String) (obj)).length() != 0)
				obj = ((Object) ("Unknown video action: ".concat(((String) (obj)))));
			else
				obj = ((Object) (new String("Unknown video action: ")));
			zzakb.zzdk(((String) (obj)));
			return;
		}
		obj3 = ((Object) (((zzapw) (obj)).getContext()));
		int k1 = zza(((Context) (obj3)), map, "x", 0);
		int l1 = zza(((Context) (obj3)), map, "y", 0);
		i = zza(((Context) (obj3)), map, "w", -1);
		int i1 = zza(((Context) (obj3)), map, "h", -1);
		obj3 = ((Object) (zznk.zzbca));
		if(((Boolean)zzkb.zzik().zzd(((zzna) (obj3)))).booleanValue())
		{
			i = Math.min(i, ((zzapw) (obj)).zzts() - k1);
			i1 = Math.min(i1, ((zzapw) (obj)).zztr() - l1);
		}
		int j1;
		try
		{
			j1 = Integer.parseInt((String)map.get("player"));
		}
	//* 529 1152:astore_2        
	//* 530 1153:goto            823
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			j1 = 0;
		}
		flag1 = Boolean.parseBoolean((String)map.get("spherical"));
		if(flag && ((zzapn) (obj2)).zzth() == null)
		{
			((zzapn) (obj2)).zza(k1, l1, i, i1, j1, flag1, new zzapv((String)map.get("flags")));
			obj = ((Object) (((zzapn) (obj2)).zzth()));
			if(obj != null)
				zza(((zzapi) (obj)), map);
			return;
		} else
		{
			((zzapn) (obj2)).zze(k1, l1, i, i1);
			return;
		}
	//* 531 1156:astore_1        
	//* 532 1157:goto            1047
	}

	private boolean zzdau;
}
